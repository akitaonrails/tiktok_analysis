package com.bytedance.ies.sdk.widgets;

/* JADX INFO: loaded from: classes18.dex */
public abstract class RxBusSceneObserver<T> extends SceneObserver {
    public abstract Class<T> getType();

    public abstract void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, T t);
}
