package com.bytedance.jedi.scene;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SceneInternalKt;
import androidx.lifecycle.ViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.scene.Scene;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public final class SceneLifecycleAwareLazy<T extends ViewModel> extends lifecycleAwareLazy<T> {
    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SceneLifecycleAwareLazy(LifecycleOwner lifecycleOwner, Function0<String> function0, Function0<? extends T> function02) {
        super(lifecycleOwner, function0, function02);
    }

    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy
    public final void LIZ(LifecycleOwner lifecycleOwner, T t, Function0<String> function0) {
        Scene scene = ((Scene) lifecycleOwner).mParentScene;
        if (scene != null) {
            SceneInternalKt.ensureViewModel(scene, t, function0);
        }
    }
}
