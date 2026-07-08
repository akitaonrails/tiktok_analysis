package com.bytedance.android.livesdk.gift.base.platform.business.tray;

import X.C1135280feI;
import X.C1135920ffK;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.model.message.AssetMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LiveTrayMessage;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AbsNormalGiftAnimWidget extends LiveRecyclableWidget {
    public boolean LL;

    public abstract void A1(AssetMessage assetMessage);

    public abstract void B1(GiftMessage giftMessage);

    public abstract void C1(GiftMessage giftMessage, C1135280feI c1135280feI, ConcurrentHashMap<String, String> concurrentHashMap);

    public abstract void D1(LiveTrayMessage liveTrayMessage);

    public abstract void E1(int i);

    public abstract void F1();

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract void x1(C1135920ffK c1135920ffK);

    public abstract void y1();

    public abstract void z1(Function1<? super GiftMessage, Boolean> function1);
}
