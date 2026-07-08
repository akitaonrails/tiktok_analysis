package com.bytedance.pipo.ttpay.portal.wallet;

import X.C09CT;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.TextDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class BalanceButtonDO {

    @C09CT("click_action")
    public final StellarActionDO action;

    @C09CT("disabled")
    public final Integer disabled;

    @C09CT("icon")
    public final ImageDO icon;

    @C09CT("obj_id")
    public final String objId;

    @C09CT("text")
    public final TextDO text;

    @C09CT("track_params")
    public final Map<String, Object> trackingParams;

    public BalanceButtonDO() {
        this(null, null, null, null, null, null);
    }

    public BalanceButtonDO(String str, TextDO textDO, ImageDO imageDO, StellarActionDO stellarActionDO, Map<String, ? extends Object> map, Integer num) {
        this.objId = str;
        this.text = textDO;
        this.icon = imageDO;
        this.action = stellarActionDO;
        this.trackingParams = map;
        this.disabled = num;
    }
}
