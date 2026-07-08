package com.bytedance.ies.sdk.widgets;

/* JADX INFO: loaded from: classes18.dex */
public interface IAnimatableWidget extends ILayeredWidget {
    void animateHide();

    void animateShow();

    void cancelHideAnimation();

    void cancelShowAnimation();

    int getId();

    void onHideAnimationEnd();

    void onHideAnimationStart();

    void onShowAnimationEnd();

    void onShowAnimationStart();

    public static final class DefaultImpls {
        public static void onHideAnimationEnd(IAnimatableWidget iAnimatableWidget) {
        }

        public static void onHideAnimationStart(IAnimatableWidget iAnimatableWidget) {
        }

        public static void onShowAnimationEnd(IAnimatableWidget iAnimatableWidget) {
        }

        public static void onShowAnimationStart(IAnimatableWidget iAnimatableWidget) {
        }

        public static void animateHide(IAnimatableWidget iAnimatableWidget) {
            LayeredElementContext layeredElementContext = iAnimatableWidget.getLayeredElementContext();
            if (layeredElementContext != null) {
                layeredElementContext.animateHide$live_widget_release(iAnimatableWidget.getId());
            } else {
                iAnimatableWidget.onHideAnimationStart();
                iAnimatableWidget.onHideAnimationEnd();
            }
        }

        public static void animateShow(IAnimatableWidget iAnimatableWidget) {
            LayeredElementContext layeredElementContext = iAnimatableWidget.getLayeredElementContext();
            if (layeredElementContext != null) {
                layeredElementContext.animateShow$live_widget_release(iAnimatableWidget.getId());
            } else {
                iAnimatableWidget.onShowAnimationStart();
                iAnimatableWidget.onShowAnimationEnd();
            }
        }

        public static void cancelHideAnimation(IAnimatableWidget iAnimatableWidget) {
            LayeredElementContext layeredElementContext = iAnimatableWidget.getLayeredElementContext();
            if (layeredElementContext != null) {
                layeredElementContext.cancelHideAnimation$live_widget_release(iAnimatableWidget.getId());
            }
        }

        public static void cancelShowAnimation(IAnimatableWidget iAnimatableWidget) {
            LayeredElementContext layeredElementContext = iAnimatableWidget.getLayeredElementContext();
            if (layeredElementContext != null) {
                layeredElementContext.cancelShowAnimation$live_widget_release(iAnimatableWidget.getId());
            }
        }
    }
}
