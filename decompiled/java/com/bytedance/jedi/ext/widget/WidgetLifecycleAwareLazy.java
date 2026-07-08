package com.bytedance.jedi.ext.widget;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.WidgetInternalKt;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.widget.Widget;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public final class WidgetLifecycleAwareLazy<T extends ViewModel> extends lifecycleAwareLazy<T> {
    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public WidgetLifecycleAwareLazy(LifecycleOwner lifecycleOwner, Function0<String> function0, Function0<? extends T> function02) {
        super(lifecycleOwner, function0, function02);
    }

    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy
    public final void LIZ(LifecycleOwner lifecycleOwner, T t, Function0<String> function0) {
        Object objLIZJ = ((Widget) lifecycleOwner).LIZJ();
        if (!(objLIZJ instanceof Fragment)) {
            objLIZJ = null;
        }
        Fragment fragment = (Fragment) objLIZJ;
        if (fragment != null) {
            WidgetInternalKt.ensureViewModel(fragment, t, function0);
        }
    }
}
