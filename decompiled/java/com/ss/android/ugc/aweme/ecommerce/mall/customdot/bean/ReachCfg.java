package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ReachCfg {

    @C09CT("data")
    public final String data;

    @C09CT("notice_id")
    public final String noticeId;

    @C09CT("style")
    public final String style;

    public static ReachCfg LIZ(ReachCfg reachCfg) {
        return new ReachCfg(reachCfg.style, null, reachCfg.noticeId);
    }

    public ReachCfg(String str, String str2, String str3) {
        this.style = str;
        this.data = str2;
        this.noticeId = str3;
    }
}
