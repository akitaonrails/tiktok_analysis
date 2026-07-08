package com.bytedance.android.livesdk.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GiftConfigInfo {

    @C09CT("config_type")
    public int configType;

    @C09CT("role_config")
    public RoleConfig roleConfig;

    public static final class RoleConfig {

        @C09CT("viewer")
        public String viewer = "";

        @C09CT("anchor")
        public String anchor = "";

        @C09CT("gifter")
        public String gifter = "";
    }
}
