package com.ss.android.ugc.aweme.share.base.model;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareChannelInfo {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("platform_id")
    public final String channelKey;

    @C09CT("icon_url")
    public final String iconRes;

    @C09CT("label")
    public final String labelName;

    @C09CT("package_name")
    public final String packageName;

    @C09CT("square_icon_url")
    public final String squareIconRes;

    @C09CT("target_component_info")
    public final TargetComponentInfo targetComponentInfo;

    public ShareChannelInfo() {
        this("", "", "", "", "", null);
    }

    public ShareChannelInfo(String str, String str2, String str3, String str4, String str5, TargetComponentInfo targetComponentInfo) {
        this.channelKey = str;
        this.packageName = str2;
        this.labelName = str3;
        this.iconRes = str4;
        this.squareIconRes = str5;
        this.targetComponentInfo = targetComponentInfo;
    }
}
