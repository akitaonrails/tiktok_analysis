package com.bytedance.android.livesdk.viewerwishes.widget;

import X.C13LE;
import X.C500260Jjc;
import X.C723850SaN;
import X.InterfaceC1097170eep;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.viewerwishes.common.ui.ViewerWishesAssem;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS381S0200000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class ViewerWishesWidget extends LiveRecyclableWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hwz;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        Fragment fragment;
        C500260Jjc.LJIILIIL(getView());
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep == null || (fragment = interfaceC1097170eep.getFragment()) == null) {
            return;
        }
        C723850SaN.LJIIIIZZ(fragment, C13LE.LIZ(ViewerWishesAssem.class));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Fragment fragment;
        C500260Jjc.LLFFF(getView());
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null) {
            C723850SaN.LIZ(fragment, false, null, new AwS381S0200000_15(fragment, this, 65), 3);
        }
    }
}
