package com.ss.android.ugc.aweme.dynamic.card.data;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class CardInfo {

    @C09CT("biz_params")
    public final Map<String, Object> bizParams;

    @C09CT("business_id")
    public String businessId;

    @C09CT("business_type")
    public String businessType;

    @C09CT("card_key")
    public String cardKey;

    @C09CT("card_template")
    public String cardTemplate;

    @C09CT("default_height")
    public final int defaultHeight;

    @C09CT("default_width")
    public final int defaultWidth;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    public CardInfo(String str, String str2, String str3, String str4, String str5, int i, int i2, Map<String, ? extends Object> map) {
        this.cardKey = str;
        this.cardTemplate = str2;
        this.businessType = str3;
        this.businessId = str4;
        this.scene = str5;
        this.defaultWidth = i;
        this.defaultHeight = i2;
        this.bizParams = map;
    }
}
