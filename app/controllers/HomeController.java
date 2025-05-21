package controllers;

import play.mvc.*;

public class HomeController extends Controller {

    @Annotation
    public Result indexAnnotation() {
        return ok();
    }

    @With(AnnotationAction.class)
    public Result indexWith() {
        return ok();
    }

}
