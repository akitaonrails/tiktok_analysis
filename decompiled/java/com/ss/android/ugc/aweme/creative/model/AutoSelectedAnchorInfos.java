package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C569370MUt;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoSelectedAnchorInfos implements Serializable {
    public static final C569370MUt Companion = new Object() { // from class: X.0MUt
    };
    public static final long serialVersionUID = -5818;

    @C09CT("anchor_shoot_way")
    public String anchorShootWay;

    @C09CT("anchor_source_type")
    public String anchorSourceType;

    @C09CT("open_platform_extra")
    public String openPlatFormExtra;

    @C09CT("open_platform_add_from")
    public Integer openPlatformAddFrom;

    @C09CT("open_platform_client_key")
    public String openPlatformClientKey;

    @C09CT("open_platform_share_id")
    public String openPlatformShareId;

    public AutoSelectedAnchorInfos() {
        this(null, null, null, null, null, null);
    }

    public AutoSelectedAnchorInfos(String str) {
        this(str, null, null, null, null, null);
    }

    public final void setAnchorShootWay(String str) {
        this.anchorShootWay = str;
    }

    public final void setAnchorSourceType(String str) {
        this.anchorSourceType = str;
    }

    public final void setOpenPlatFormExtra(String str) {
        this.openPlatFormExtra = str;
    }

    public final void setOpenPlatformAddFrom(Integer num) {
        this.openPlatformAddFrom = num;
    }

    public final void setOpenPlatformClientKey(String str) {
        this.openPlatformClientKey = str;
    }

    public final void setOpenPlatformShareId(String str) {
        this.openPlatformShareId = str;
    }

    public AutoSelectedAnchorInfos(String str, String str2) {
        this(str, str2, null, null, null, null);
    }

    public AutoSelectedAnchorInfos(String str, String str2, String str3) {
        this(str, str2, str3, null, null, null);
    }

    public AutoSelectedAnchorInfos(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, null);
    }

    public AutoSelectedAnchorInfos(String str, String str2, String str3, String str4, Integer num) {
        this(str, str2, str3, str4, num, null);
    }

    public AutoSelectedAnchorInfos(String str, String str2, String str3, String str4, Integer num, String str5) {
        this.openPlatformClientKey = str;
        this.openPlatFormExtra = str2;
        this.anchorSourceType = str3;
        this.openPlatformShareId = str4;
        this.openPlatformAddFrom = num;
        this.anchorShootWay = str5;
    }
}
