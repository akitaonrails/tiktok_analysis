package com.ss.android.ugc.aweme.ecommerce.sec;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class EcomCsSdkModel {

    @C09CT("active_rep")
    public final boolean activeRep;

    @C09CT("all_signed")
    public final boolean allSigned;

    @C09CT("collect_mode")
    public final int collectMode;

    @C09CT("cs_new_itr")
    public final boolean csEnableNewInterceptor;

    @C09CT("cs_enable_sap")
    public final boolean csEnableSample;

    @C09CT("cs_glue_ev")
    public final boolean csGlueEv;

    @C09CT("cs_itr_mode")
    public final int csInterceptorMode;

    @C09CT("version")
    public final String csLibraVer;

    @C09CT("cs_pre_init")
    public final boolean csPreInit;

    @C09CT("cs_si_rep")
    public final boolean csSignCountRep;

    @C09CT("enable_CSSDK")
    public final boolean enableCsSdk;

    @C09CT("action")
    public final int signAction;

    @C09CT("path")
    public final String signPath;

    @C09CT("whitelist")
    public final Map<String, Object> whitelist;

    public EcomCsSdkModel() {
        this(false, 0, "", false, C2097608Jq.LJ(), 0, false, true, 0, false, true, false, false, "");
    }

    public EcomCsSdkModel(boolean z, int i, String str, boolean z2, Map<String, ? extends Object> map, int i2, boolean z3, boolean z4, int i3, boolean z5, boolean z6, boolean z7, boolean z8, String str2) {
        this.enableCsSdk = z;
        this.signAction = i;
        this.signPath = str;
        this.allSigned = z2;
        this.whitelist = map;
        this.collectMode = i2;
        this.activeRep = z3;
        this.csGlueEv = z4;
        this.csInterceptorMode = i3;
        this.csSignCountRep = z5;
        this.csEnableNewInterceptor = z6;
        this.csPreInit = z7;
        this.csEnableSample = z8;
        this.csLibraVer = str2;
    }
}
