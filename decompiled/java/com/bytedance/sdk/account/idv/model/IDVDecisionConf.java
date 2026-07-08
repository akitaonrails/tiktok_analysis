package com.bytedance.sdk.account.idv.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class IDVDecisionConf {

    @C09CT("code")
    public final String code;

    @C09CT("extra")
    public final List<Object> extra;

    @C09CT("need_replay")
    public final boolean needReplay;

    @C09CT("passport_ticket")
    public final String passportTicket;

    @C09CT("url")
    public final String url;

    @C09CT("version")
    public final String version;

    public IDVDecisionConf(String str, List<? extends Object> list, boolean z, String str2, String str3, String str4) {
        this.code = str;
        this.extra = list;
        this.needReplay = z;
        this.passportTicket = str2;
        this.url = str3;
        this.version = str4;
    }
}
