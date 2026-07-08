package com.ss.android.ugc.aweme.ecommerce.mall.customdot.state;

import X.EnumC1768230w7B;
import X.EnumC1768240w7C;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopTabModuleData {
    public final Long bubbleShowTimestamp;
    public final CustomDotAbilityCommon dotAbility;
    public final EnumC1768240w7C handleOnUiSubStage;
    public final boolean isNextSession;
    public final ReachCfgDataForMall reachCfgDataForMall;
    public final EnumC1768230w7B shopTabUiStatus;

    public final boolean isNextSession() {
        return this.isNextSession;
    }

    public ShopTabModuleData(CustomDotAbilityCommon customDotAbilityCommon, ReachCfgDataForMall reachCfgDataForMall, EnumC1768230w7B enumC1768230w7B, EnumC1768240w7C enumC1768240w7C, boolean z, Long l) {
        this.dotAbility = customDotAbilityCommon;
        this.reachCfgDataForMall = reachCfgDataForMall;
        this.shopTabUiStatus = enumC1768230w7B;
        this.handleOnUiSubStage = enumC1768240w7C;
        this.isNextSession = z;
        this.bubbleShowTimestamp = l;
    }
}
