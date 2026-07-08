package com.bytedance.android.livesdk.chatroom.interaction;

import X.C0KYN;
import X.C784440Upu;
import X.InterfaceC1059280dfi;
import Y.AfS176S0100000_7;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes8.dex */
public final class PopHalfWebDialogHelper implements GenericLifecycleObserver {
    public final BaseFragment LL;
    public final DataChannel LLILLJJLI;
    public final boolean LLILLL;
    public SparkContext LLILZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dismissDialog();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void dismissDialog() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        SparkContext sparkContext = this.LLILZ;
        if (sparkContext == null || (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) == null) {
            return;
        }
        interfaceC1059280dfiLJJIJLIJ.close();
    }

    public PopHalfWebDialogHelper(BaseFragment baseFragment, DataChannel dataChannel, boolean z, LifecycleOwner lifecycleOwner) {
        this.LL = baseFragment;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = z;
        lifecycleOwner.getLifecycle().addObserver(this);
        C784440Upu.LIZ().LJI(baseFragment, C0KYN.class).LIZJ(new AfS176S0100000_7(this, 27));
    }
}
