package com.bytedance.android.livesdk.gift.base.utils.lazy;

import X.AbstractC1100450ek7;
import X.C1100420ek4;
import X.InterfaceC1097170eep;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.WidgetInternalLiveSDKKt;
import com.bytedance.android.widget.Widget;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetLifecycleAwareLazy<T extends ViewModel> extends com.bytedance.jedi.arch.lifecycleAwareLazy<T> {
    public static final int $stable = 8;

    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public WidgetLifecycleAwareLazy(LifecycleOwner lifecycleOwner, Function0<String> function0, Function0<? extends T> function02) {
        super(lifecycleOwner, function0, function02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy
    public final void LIZ(LifecycleOwner lifecycleOwner, T t, Function0<String> function0) {
        C1100420ek4 c1100420ek4;
        Fragment fragment;
        Fragment fragment2;
        if (lifecycleOwner instanceof Widget) {
            InterfaceC1097170eep interfaceC1097170eep = ((Widget) lifecycleOwner).widgetCallback;
            if (interfaceC1097170eep != null && (fragment2 = interfaceC1097170eep.getFragment()) != null) {
                WidgetInternalLiveSDKKt.ensureViewModel(fragment2, t, function0);
                return;
            }
            return;
        }
        if (!(lifecycleOwner instanceof AbstractC1100450ek7) || (c1100420ek4 = ((AbstractC1100450ek7) lifecycleOwner).LLILZIL) == null || (fragment = c1100420ek4.getFragment()) == null) {
            return;
        }
        WidgetInternalLiveSDKKt.ensureViewModel(fragment, t, function0);
    }
}
