package com.ss.android.ugc.aweme.account.login.config;

import X.C09CT;
import X.C13BV;
import com.google.gson.n;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class AccountLoginFeatureOriginConfig {

    @C09CT("base")
    public n base;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("rules")
    public final List<AccountFeatureRule> rules;

    @C09CT("version")
    public final int version;

    public AccountLoginFeatureOriginConfig() {
        this(false, 0, null, null, 15, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.account.login.config.AccountLoginFeatureConfig LIZ(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.config.AccountLoginFeatureOriginConfig.LIZ(java.lang.String):com.ss.android.ugc.aweme.account.login.config.AccountLoginFeatureConfig");
    }

    public AccountLoginFeatureOriginConfig(boolean z, int i, n nVar, List<AccountFeatureRule> list) {
        this.enable = z;
        this.version = i;
        this.base = nVar;
        this.rules = list;
    }

    public AccountLoginFeatureOriginConfig(boolean z, int i, n nVar, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? new n() : nVar, (i2 & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
