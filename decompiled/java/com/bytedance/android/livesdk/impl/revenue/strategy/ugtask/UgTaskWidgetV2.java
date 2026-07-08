package com.bytedance.android.livesdk.impl.revenue.strategy.ugtask;

import X.C1161920gLG;
import X.C356901a3;
import X.C520010KaN;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.api.revenue.strategy.channel.TaskLoadCompleteEvent;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class UgTaskWidgetV2 extends LiveRecyclableWidget implements DefaultLifecycleObserver {
    public final Object LL = new Object();

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        Lifecycle lifecycle;
        Fragment detailSafRootFragment = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getDetailSafRootFragment(this.widgetCallback.getFragment());
        if (detailSafRootFragment != null) {
            detailSafRootFragment.getLifecycle().removeObserver(this);
            return;
        }
        LifecycleOwner lifecycleOwnerLJJIFFI = C520010KaN.LJJIFFI(this.context, false);
        if (lifecycleOwnerLJJIFFI == null || (lifecycle = lifecycleOwnerLJJIFFI.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        DataChannelGlobal.LLILZ.zQ2(this.LL);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Lifecycle lifecycle;
        getRecycleSourceInfo();
        DataChannelGlobal.LLILZ.BQ2(this, this, TaskLoadCompleteEvent.class, new AwS596S0100000_17(this, 177));
        Fragment detailSafRootFragment = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getDetailSafRootFragment(this.widgetCallback.getFragment());
        if (detailSafRootFragment != null) {
            detailSafRootFragment.getLifecycle().addObserver(this);
            return;
        }
        LifecycleOwner lifecycleOwnerLJJIFFI = C520010KaN.LJJIFFI(this.context, false);
        if (lifecycleOwnerLJJIFFI == null || (lifecycle = lifecycleOwnerLJJIFFI.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(this);
    }
}
