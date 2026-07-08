package com.bytedance.ies.sdk.widgets;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public final class ElementSpecImplKt {
    public static final void animation(ElementSpecImpl elementSpecImpl, Function0<? extends AnimationInfo> function0) {
        elementSpecImpl.setAnimation(function0.invoke());
    }

    public static final void onAttach(ElementSpecImpl elementSpecImpl, Function1<? super ConstraintProperty, Unit> function1) {
        elementSpecImpl.setOnAttach(function1);
    }

    public static final void sceneObserver(ElementSpecImpl elementSpecImpl, Function0<? extends SceneObserver> function0) {
        elementSpecImpl.addSceneObserver(function0.invoke());
    }

    public static final void animation(ElementSpecImpl elementSpecImpl, AnimationInfo animationInfo) {
        elementSpecImpl.setAnimation(animationInfo);
    }
}
