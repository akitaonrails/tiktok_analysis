package com.bytedance.android.livesdk.gift.base.platform.business.tray;

import X.C1137050fh9;
import X.C13LP;
import X.InterfaceC1137450fhn;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.ExtendedGiftTrayHeightChange;
import com.bytedance.android.livesdk.RemoteTrayIndividualContainerHeight;
import com.bytedance.android.livesdk.dataChannel.GiftSmallTray;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayMinusScreenStyleFixSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveExtendedScreenGiftOptimizeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ExtendScreenGiftTrayWidget extends LiveGiftRemoteTrayDisplayWidget {
    public boolean LLIZLLLIL;
    public final Map<Integer, Integer> LLJ;

    public ExtendScreenGiftTrayWidget() {
        super(true);
        this.LLJ = new LinkedHashMap();
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.LiveGiftRemoteTrayDisplayWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gg4;
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.LiveGiftRemoteTrayDisplayWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.LiveGiftRemoteTrayDisplayWidget
    public final boolean A1() {
        return LiveExtendedScreenGiftOptimizeSetting.INSTANCE.giftTraySpaceOptimize();
    }

    public final void C1() {
        int iIntValue;
        if (this.LLIZLLLIL) {
            Integer num = (Integer) C13LP.LJJLIIIJLJLI(((LinkedHashMap) this.LLJ).values());
            if (num == null || (iIntValue = num.intValue()) <= 0) {
                this.dataChannel.zW(ExtendedGiftTrayHeightChange.class, 0);
            } else {
                this.dataChannel.zW(ExtendedGiftTrayHeightChange.class, Integer.valueOf(iIntValue));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.LiveGiftRemoteTrayDisplayWidget
    public final InterfaceC1137450fhn x1() {
        final Context context = this.context;
        return new C1137050fh9(context) { // from class: X.0fhZ
            @Override // X.C1137050fh9, X.C1136990fh3
            public final EnumC1136790fgj LJIILLIIL(boolean z) {
                if (LiveGiftTrayMinusScreenStyleFixSetting.INSTANCE.isEnable()) {
                    DataChannel dataChannel = getDataChannel();
                    if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(GiftSmallTray.class), Boolean.TRUE)) {
                        return EnumC1136790fgj.MULTI_HOST_SMALL;
                    }
                    return EnumC1136790fgj.ONE_HOST_MEDIUM_V3;
                }
                return EnumC1136790fgj.ONE_HOST_MEDIUM_V3;
            }
        };
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.LiveGiftRemoteTrayDisplayWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        ((LinkedHashMap) this.LLJ).clear();
        super.onLoad(objArr);
        this.dataChannel.BQ2(this, LiveExtendedScreenStatus.class, new AwS596S0100000_17(this, 149));
        this.dataChannel.BQ2(this, RemoteTrayIndividualContainerHeight.class, new AwS596S0100000_17(this, 150));
    }
}
