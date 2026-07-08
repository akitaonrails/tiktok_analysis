package com.bytedance.android.livesdk.api.revenue.goodybag;

import X.C006A;
import X.C0UY5;
import com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* JADX INFO: loaded from: classes13.dex */
public interface IGoodyBagService extends C006A {
    void B51(String str, DataChannel dataChannel, BaseFragment baseFragment, boolean z);

    C0UY5 Cb();

    Class<? extends LiveRecyclableWidget> Fa0();

    GoodyBagWidget OS0();

    boolean ul2(DataChannel dataChannel);

    boolean wB(String str);
}
