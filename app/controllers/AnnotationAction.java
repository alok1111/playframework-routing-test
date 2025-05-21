package controllers;

import play.mvc.Action;
import play.mvc.Http.Request;
import play.mvc.Result;

import java.util.concurrent.CompletionStage;

public final class AnnotationAction extends Action<Annotation> {

    @Override
    public CompletionStage<Result> call(Request request) {
        try {
            System.out.println(configuration.skip());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return delegate.call(request);
    }
}