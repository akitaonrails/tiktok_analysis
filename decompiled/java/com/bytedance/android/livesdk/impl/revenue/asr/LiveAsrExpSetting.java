package com.bytedance.android.livesdk.impl.revenue.asr;

import com.bytedance.android.livesdk.livesetting.strategy.GiftGuideASRSetting;
import com.ss.android.ugc.aweme.tars.business.ILiveAsrGiftExp;
import kotlin.Pair;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveAsrExpSetting implements ILiveAsrGiftExp {
    @Override // com.ss.android.ugc.aweme.tars.business.ILiveAsrGiftExp
    public final Pair<String, Boolean> LIZ() {
        GiftGuideASRSetting giftGuideASRSetting = GiftGuideASRSetting.INSTANCE;
        String str = giftGuideASRSetting.getValue().scene;
        if (str == null) {
            str = "";
        }
        return new Pair<>(str, Boolean.valueOf(giftGuideASRSetting.isEnable()));
    }
}
