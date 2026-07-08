package com.bytedance.ies.sdk.widgets;

import X.C19OA;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public interface ElementSpec {
    void attach(ConstraintProperty constraintProperty);

    void dispose();

    AnimationInfo getAnimation();

    C19OA getConstraintWidget();

    int getId();

    Function1<ConstraintProperty, Unit> getOnAttach();

    List<SceneObserver> getSceneObservers();

    void onDispose();

    public static final class DefaultImpls {
        public static void onDispose(ElementSpec elementSpec) {
        }

        public static void dispose(ElementSpec elementSpec) {
            elementSpec.onDispose();
            AnimationInfo animation = elementSpec.getAnimation();
            if (animation != null) {
                animation.cancelShowAnimation();
            }
            AnimationInfo animation2 = elementSpec.getAnimation();
            if (animation2 != null) {
                animation2.cancelHideAnimation();
            }
        }

        public static void attach(ElementSpec elementSpec, ConstraintProperty constraintProperty) {
            Function1<ConstraintProperty, Unit> onAttach = elementSpec.getOnAttach();
            if (onAttach != null) {
                onAttach.invoke(constraintProperty);
            }
        }
    }
}
