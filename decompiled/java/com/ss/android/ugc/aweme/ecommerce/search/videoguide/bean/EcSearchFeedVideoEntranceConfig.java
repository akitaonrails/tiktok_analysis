package com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean;

import X.C098200Yq;
import X.C09CT;
import X.C1227904rF;
import X.C123100dR;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSearchFeedVideoEntranceConfig {
    public WithoutCartSearchStruct LIZ;

    @C09CT("shop_now_text")
    public final String buttonText;

    @C09CT("da_params")
    public final Map<String, Object> daParams;

    @C09CT("frequency_time_stamp")
    public final Long frequencyTimeStamp;

    @C09CT("find_more_text")
    public final String guideText;

    @C09CT("find_more_text_en")
    public final String guideTextEn;

    @C09CT("mall_landing_page")
    public final String mallLandingPage;

    @C09CT("schema")
    public final String schema;

    @C09CT("scroll_text")
    public final String scrollText;

    @C09CT("video_product_info")
    public final ProductRelation videoProductInfo;

    @C09CT("without_cart_search")
    public final String withoutCartSearchString;

    public EcSearchFeedVideoEntranceConfig() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public final WithoutCartSearchStruct LIZ() {
        Object c098200Yq;
        if (this.LIZ == null && C123100dR.LIZ(this.withoutCartSearchString)) {
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                String str = this.withoutCartSearchString;
                c1227904rF.getClass();
                c098200Yq = (WithoutCartSearchStruct) C1227904rF.LIZIZ(str, WithoutCartSearchStruct.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            this.LIZ = (WithoutCartSearchStruct) c098200Yq;
        }
        return this.LIZ;
    }

    public EcSearchFeedVideoEntranceConfig(Map<String, ? extends Object> map, String str, String str2, String str3, String str4, String str5, String str6, ProductRelation productRelation, Long l, String str7) {
        this.daParams = map;
        this.mallLandingPage = str;
        this.guideText = str2;
        this.guideTextEn = str3;
        this.buttonText = str4;
        this.scrollText = str5;
        this.schema = str6;
        this.videoProductInfo = productRelation;
        this.frequencyTimeStamp = l;
        this.withoutCartSearchString = str7;
    }
}
