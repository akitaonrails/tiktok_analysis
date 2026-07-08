package com.ss.android.ugc.aweme.effect;

import X.C860940Xq0;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes15.dex */
public interface EffectCreationBanStatusService {
    public static final C860940Xq0 LIZ = C860940Xq0.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v2/effect/api/ttapp/user/punishment-status")
    Object getCreationBanStatus(@InterfaceC1501070pAH("business_scene") int i, InterfaceC1364105Vn<? super TTAppMGetUserPunishmentStatusResp> interfaceC1364105Vn);
}
