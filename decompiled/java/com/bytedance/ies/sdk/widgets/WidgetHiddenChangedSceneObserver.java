package com.bytedance.ies.sdk.widgets;

/* JADX INFO: loaded from: classes18.dex */
public abstract class WidgetHiddenChangedSceneObserver extends SceneObserver {
    public final int id;

    public abstract void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z);

    public final int getId() {
        return this.id;
    }

    public WidgetHiddenChangedSceneObserver(int i) {
        this.id = i;
    }
}
