package com.bytedance.android.livesdk.api.revenue.treasurebox;

import X.C006A;
import X.C1151220g40;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.impl.revenue.TreasureBoxRootWidget;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* JADX INFO: loaded from: classes13.dex */
public interface ITreasureBoxService extends C006A {
    void BW0(Long l, String str, DataChannel dataChannel, LifecycleOwner lifecycleOwner, boolean z);

    C1151220g40 Te2();

    TreasureBoxRootWidget W70();

    Class<? extends LiveRecyclableWidget> ax2();

    Class<? extends LiveRecyclableWidget> j61();

    boolean jK2(Integer num);

    void ma(DataChannel dataChannel);

    boolean pD();

    ActivityTreasureBoxWidget sR1();

    void y71(String str, DataChannel dataChannel, boolean z);
}
