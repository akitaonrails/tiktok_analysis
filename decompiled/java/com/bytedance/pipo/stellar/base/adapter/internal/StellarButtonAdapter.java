package com.bytedance.pipo.stellar.base.adapter.internal;

import X.C1720510usD;
import X.C1720520usE;
import X.C1720980usy;
import X.EnumC1720960usw;
import com.bytedance.pipo.stellar.base.model.ButtonDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarButtonAdapter extends StellarBaseCardAdapter<ButtonDO> {
    public StellarButtonAdapter() {
        super(new C1720980usy(), EnumC1720960usw.CARD_BUTTON.getValue(), null, AFwS268S0000000_26.get$arr$(15), null, 52);
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.internal.StellarBaseCardAdapter
    public final C1720510usD X5(CardDO cardDO, ButtonDO buttonDO) {
        Map<String, Object> trackingParams;
        ButtonDO buttonDO2 = buttonDO;
        if (buttonDO2 != null) {
            trackingParams = buttonDO2.getTrackingParams();
        } else {
            trackingParams = null;
        }
        return C1720520usE.LIZ(cardDO, trackingParams);
    }
}
