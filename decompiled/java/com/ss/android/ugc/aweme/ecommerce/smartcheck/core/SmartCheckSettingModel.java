package com.ss.android.ugc.aweme.ecommerce.smartcheck.core;

import X.C09CT;
import X.C1697810uHb;
import X.EnumC21187117vh;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class SmartCheckSettingModel {

    @C09CT("api_list")
    public final List<String> apiList;

    @C09CT("debug")
    public final DebugConfig debugConfig;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("native_page_keys")
    public final List<String> nativePageKeys;

    @C09CT("schema_list")
    public final List<String> schemaList;

    public static final class DebugConfig {

        @C09CT("clientId")
        public final String clientId;

        @C09CT("clientSecret")
        public final String clientSecret;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("enable_force_prod")
        public final boolean enableForceProd;

        @C09CT("enable_verifier_db")
        public final boolean enableVerifierDb;

        @C09CT("group_id")
        public final String groupId;

        @C09CT("max_record_count")
        public final int maxRecordCount;

        @C09CT("toast_level")
        public final int toastLevel;

        public DebugConfig() {
            this("c_a0f8c6f5459d42a18fb6", "e579d7bcd2fe481c9fc03a268aaedfd9", false, false, "oc_8a173bae70bf1b98f6be393b830260f0", 50, EnumC21187117vh.WARNING.getValue(), false);
        }

        public DebugConfig(String str, String str2, boolean z, boolean z2, String str3, int i, int i2, boolean z3) {
            this.clientId = str;
            this.clientSecret = str2;
            this.enableVerifierDb = z;
            this.enable = z2;
            this.groupId = str3;
            this.maxRecordCount = i;
            this.toastLevel = i2;
            this.enableForceProd = z3;
        }
    }

    public SmartCheckSettingModel() {
        this(C1697810uHb.LJIILJJIL("/api/v1/shop/product_info/get"), new DebugConfig("c_a0f8c6f5459d42a18fb6", "e579d7bcd2fe481c9fc03a268aaedfd9", false, false, "oc_8a173bae70bf1b98f6be393b830260f0", 50, EnumC21187117vh.WARNING.getValue(), false), false, C1697810uHb.LJIILJJIL("://ec/"), C1697810uHb.LJIILJJIL("ec/pdp"));
    }

    public SmartCheckSettingModel(List<String> list, DebugConfig debugConfig, boolean z, List<String> list2, List<String> list3) {
        this.apiList = list;
        this.debugConfig = debugConfig;
        this.enable = z;
        this.nativePageKeys = list2;
        this.schemaList = list3;
    }
}
