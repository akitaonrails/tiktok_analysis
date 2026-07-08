package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import X.C1697810uHb;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class SmartCheckSettingModelV2 {

    @C09CT("api_list")
    public final List<String> apiList;

    @C09CT("debug_config")
    public final DebugConfig debugConfig;

    @C09CT("native_page_keys")
    public final List<String> nativePageKeys;

    @C09CT("platform_config")
    public final PlatformConfig platformConfig;

    @C09CT("rule_config")
    public final RuleConfig ruleConfig;

    @C09CT("schema_config")
    public final SchemaConfig schemaConfig;

    @C09CT("switch_config")
    public final SmartCheckSwitch switchConfig;

    @C09CT("vmsdk_config")
    public final VmSdkConfig vmsdkConfig;

    public static final class DebugConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("enable_issue_report_smartcheck")
        public final boolean enableIssueReportSmartcheck;

        @C09CT("enable_lark_notification")
        public final boolean enableLarkNotification;

        @C09CT("enable_popup_notification")
        public final boolean enablePopupNotification;

        @C09CT("lark_group_id")
        public final String larkGroupId;

        @C09CT("max_record_count")
        public final int maxRecordCount;

        public DebugConfig() {
            this(false, true, false, true, "oc_8a173bae70bf1b98f6be393b830260f0", 50);
        }

        public DebugConfig(boolean z, boolean z2, boolean z3, boolean z4, String str, int i) {
            this.enable = z;
            this.enablePopupNotification = z2;
            this.enableIssueReportSmartcheck = z3;
            this.enableLarkNotification = z4;
            this.larkGroupId = str;
            this.maxRecordCount = i;
        }
    }

    public static final class PlatformConfig {

        @C09CT("client_id")
        public final String clientId;

        @C09CT("client_secret")
        public final String clientSecret;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("enable_force_prod")
        public final boolean enableForceProd;

        public PlatformConfig() {
            this("c_a0f8c6f5459d42a18fb6", "e579d7bcd2fe481c9fc03a268aaedfd9", false, false);
        }

        public PlatformConfig(String str, String str2, boolean z, boolean z2) {
            this.clientId = str;
            this.clientSecret = str2;
            this.enable = z;
            this.enableForceProd = z2;
        }
    }

    public static final class RuleConfig {

        @C09CT("rule_cdn_url")
        public final String ruleCdnUrl;

        public RuleConfig() {
            this("");
        }

        public RuleConfig(String str) {
            this.ruleCdnUrl = str;
        }
    }

    /* JADX INFO: loaded from: classes31.dex */
    public static final class SchemaConfig {

        @C09CT("fe_schema_list")
        public final List<String> feSchemaList;

        @C09CT("native_schema_list")
        public final List<String> nativeSchemaList;

        public SchemaConfig() {
            this(new ArrayList(), new ArrayList());
        }

        public SchemaConfig(List<String> list, List<String> list2) {
            this.nativeSchemaList = list;
            this.feSchemaList = list2;
        }
    }

    public SmartCheckSettingModelV2() {
        this(new SmartCheckSwitch(false, false, false), C1697810uHb.LJIILJJIL("/api/v1/shop/product_info/get"), new SchemaConfig(new ArrayList(), new ArrayList()), new RuleConfig(""), new VmSdkConfig(null, null, null, null), new PlatformConfig("c_a0f8c6f5459d42a18fb6", "e579d7bcd2fe481c9fc03a268aaedfd9", false, false), new DebugConfig(false, true, false, true, "oc_8a173bae70bf1b98f6be393b830260f0", 50), C1697810uHb.LJIILJJIL("://ec/"));
    }

    /* JADX INFO: loaded from: classes31.dex */
    public static final class SmartCheckSwitch {

        @C09CT("main_switch")
        public final boolean masterSwitch;

        @C09CT("sub_switch_for_request")
        public final boolean subSwitchForRequest;

        @C09CT("sub_switch_for_schema")
        public final boolean subSwitchForSchema;

        public SmartCheckSwitch() {
            this(false, false, false);
        }

        public SmartCheckSwitch(boolean z, boolean z2, boolean z3) {
            this.masterSwitch = z;
            this.subSwitchForRequest = z2;
            this.subSwitchForSchema = z3;
        }
    }

    /* JADX INFO: loaded from: classes31.dex */
    public static final class VmSdkConfig {

        @C09CT("access_key_online")
        public final String accessKeyOnline;

        @C09CT("access_key_ppe")
        public final String accessKeyPPE;

        @C09CT("common_check_script_url")
        public final String commonCheckScriptPath;

        @C09CT("init_script_url")
        public final String initScriptPath;

        public VmSdkConfig() {
            this(null, null, null, null);
        }

        public VmSdkConfig(String str, String str2, String str3, String str4) {
            this.accessKeyOnline = str;
            this.accessKeyPPE = str2;
            this.initScriptPath = str3;
            this.commonCheckScriptPath = str4;
        }
    }

    public SmartCheckSettingModelV2(SmartCheckSwitch smartCheckSwitch, List<String> list, SchemaConfig schemaConfig, RuleConfig ruleConfig, VmSdkConfig vmSdkConfig, PlatformConfig platformConfig, DebugConfig debugConfig, List<String> list2) {
        this.switchConfig = smartCheckSwitch;
        this.apiList = list;
        this.schemaConfig = schemaConfig;
        this.ruleConfig = ruleConfig;
        this.vmsdkConfig = vmSdkConfig;
        this.platformConfig = platformConfig;
        this.debugConfig = debugConfig;
        this.nativePageKeys = list2;
    }
}
