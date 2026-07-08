package com.bytedance.android.livesdk.impl.revenue;

import X.C1100380ek0;
import X.C1100420ek4;
import X.EnumC995440c0k;
import X.InterfaceC1097170eep;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class TreasureBoxRootWidget extends LiveRecyclableWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h5u;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
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
        C1100420ek4 c1100420ek4X1 = x1();
        if (c1100420ek4X1 != null) {
            c1100420ek4X1.setFragment(null);
        }
        int zIndex = EnumC995440c0k.PORTAL_LEAF.getZIndex();
        C1100420ek4 c1100420ek4X12 = x1();
        if (c1100420ek4X12 != null) {
            c1100420ek4X12.i0(zIndex);
        }
    }

    public final C1100420ek4 x1() {
        if (getView() instanceof C1100420ek4) {
            return (C1100420ek4) getView();
        }
        View view = getView();
        if (view != null) {
            return (C1100420ek4) view.findViewById(R.id.mis);
        }
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Object obj;
        Fragment fragment;
        C1100420ek4 c1100420ek4X1 = x1();
        if (c1100420ek4X1 != null) {
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if (interfaceC1097170eep != null) {
                fragment = interfaceC1097170eep.getFragment();
            } else {
                fragment = null;
            }
            c1100420ek4X1.setFragment(fragment);
        }
        if (objArr != null) {
            obj = objArr[0];
        } else {
            obj = null;
        }
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        C1100380ek0 c1100380ek0 = new C1100380ek0(this.context, this.dataChannel, this, Intrinsics.LJFF(obj, Boolean.TRUE));
        C1100420ek4 c1100420ek4X12 = x1();
        if (c1100420ek4X12 != null) {
            c1100420ek4X12.e0(c1100380ek0, null);
        }
    }
}
