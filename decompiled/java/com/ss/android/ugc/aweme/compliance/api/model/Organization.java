package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class Organization implements Serializable {
    public static final int $stable = 0;

    @C09CT("desc")
    public final String desc;

    @C09CT("detailUrl")
    public final String detailUrl;

    @C09CT("donateLink")
    public final String donateLink;

    @C09CT("fundraiserGoalDesc")
    public final String fundraiserGoalDesc;

    @C09CT("fundraiserId")
    public final String fundraiserId;

    @C09CT("fundraiserOwnerId")
    public final String fundraiserOwnerId;

    @C09CT("iconHeight")
    public final Integer iconHeight;

    @C09CT("iconUri")
    public final String iconUri;

    @C09CT("iconUrl")
    public final String iconUrl;

    @C09CT("iconWidth")
    public final Integer iconWidth;

    @C09CT("name")
    public final String name;

    @C09CT("ngoId")
    public final Integer ngoId;

    @C09CT("orgId")
    public final String orgId;

    @C09CT("orgType")
    public final String orgType;

    public Organization() {
        this(0, "", "", "", "", 0, 0, "", "", "", "", "", null, null);
    }

    public Organization(Integer num, String str, String str2, String str3, String str4, Integer num2, Integer num3, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.ngoId = num;
        this.name = str;
        this.desc = str2;
        this.iconUrl = str3;
        this.iconUri = str4;
        this.iconWidth = num2;
        this.iconHeight = num3;
        this.donateLink = str5;
        this.detailUrl = str6;
        this.orgId = str7;
        this.orgType = str8;
        this.fundraiserId = str9;
        this.fundraiserOwnerId = str10;
        this.fundraiserGoalDesc = str11;
    }
}
