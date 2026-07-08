package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorProductInfoModel implements Serializable {

    @C09CT("extra")
    public final String extra;
    public final AnchorProductInfo extraData;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("keyword")
    public final String keyword;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("platform")
    public final Integer platform;

    @C09CT("schema")
    public final String schema;

    @C09CT("type")
    public final Integer type;

    public AnchorProductInfoModel() {
        this("", new AnchorProductInfo(null, null, null, null, 0, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), "", "", null, null, "", "");
    }

    public AnchorProductInfoModel(String str, AnchorProductInfo anchorProductInfo, String str2, String str3, Integer num, Integer num2, String str4, String str5) {
        this.extra = str;
        this.extraData = anchorProductInfo;
        this.keyword = str2;
        this.id = str3;
        this.type = num;
        this.platform = num2;
        this.logExtra = str4;
        this.schema = str5;
    }
}
