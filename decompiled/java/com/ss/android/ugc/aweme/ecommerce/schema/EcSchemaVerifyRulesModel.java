package com.ss.android.ugc.aweme.ecommerce.schema;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class EcSchemaVerifyRulesModel {

    @C09CT("block_rules")
    public final BlockRules blockRules;

    @C09CT("debug_rules")
    public final DebugRules debugRules;

    @C09CT("enable_verify")
    public final boolean enableVerify;

    @C09CT("query_rules")
    public final QueryRules queryRules;

    @C09CT("schema_rules")
    public final SchemaRules schemaRules;

    public EcSchemaVerifyRulesModel() {
        this(false, new BlockRules(null, null, null, null, 15, null), new SchemaRules(0, null, null, null, null, false, null, 127, null), new QueryRules(false, null, null, 0, null, null, null, 0, 255, null), new DebugRules(0, null, 3, null));
    }

    public static final class DebugRules {

        @C09CT("toast_code")
        public final List<Integer> toastCode;

        @C09CT("toast_interval")
        public final int toastInterval;

        public DebugRules() {
            this(0, null, 3, null);
        }

        public DebugRules(int i, List<Integer> list) {
            this.toastInterval = i;
            this.toastCode = list;
        }

        public DebugRules(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public static final class BlockRules {

        @C09CT("block_cross_page")
        public final List<String> blockCrossPage;

        @C09CT("block_cross_url")
        public final List<String> blockCrossUrl;

        @C09CT("block_native_page")
        public final List<String> blockNativePage;

        @C09CT("ignore_page")
        public final List<String> ignorePage;

        public BlockRules() {
            this(null, null, null, null, 15, null);
        }

        public BlockRules(List<String> list, List<String> list2, List<String> list3, List<String> list4) {
            this.blockNativePage = list;
            this.blockCrossPage = list2;
            this.blockCrossUrl = list3;
            this.ignorePage = list4;
        }

        public BlockRules(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? C13BV.INSTANCE : list4);
        }
    }

    public EcSchemaVerifyRulesModel(boolean z, BlockRules blockRules, SchemaRules schemaRules, QueryRules queryRules, DebugRules debugRules) {
        this.enableVerify = z;
        this.blockRules = blockRules;
        this.schemaRules = schemaRules;
        this.queryRules = queryRules;
        this.debugRules = debugRules;
    }

    public static final class SchemaRules {

        @C09CT("block_webcast")
        public final boolean blockWebcast;

        @C09CT("ignore_max_length")
        public final List<String> ignoreMaxLength;

        @C09CT("ignore_webcast")
        public final List<String> ignoreWebcast;

        @C09CT("illegal_chars")
        public final List<String> illegalChars;

        @C09CT("max_length")
        public final int maxLength;

        @C09CT("page_regex")
        public final String pageRegex;

        @C09CT("url_regex")
        public final String urlRegex;

        public SchemaRules() {
            this(0, null, null, null, null, false, null, 127, null);
        }

        public SchemaRules(int i, List<String> list, List<String> list2, String str, String str2, boolean z, List<String> list3) {
            this.maxLength = i;
            this.ignoreMaxLength = list;
            this.illegalChars = list2;
            this.pageRegex = str;
            this.urlRegex = str2;
            this.blockWebcast = z;
            this.ignoreWebcast = list3;
        }

        public SchemaRules(int i, List list, List list2, String str, String str2, boolean z, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? C13BV.INSTANCE : list2, (i2 & 8) != 0 ? "" : str, (i2 & 16) == 0 ? str2 : "", (i2 & 32) == 0 ? z : false, (i2 & 64) != 0 ? C13BV.INSTANCE : list3);
        }
    }

    public static final class QueryRules {

        @C09CT("block_repeat_key")
        public final boolean blockRepeatKey;

        @C09CT("http_max_length")
        public final int httpMaxLength;

        @C09CT("ignore_key_uri")
        public final List<String> ignoreKeyUri;

        @C09CT("key_avoid_encoded")
        public final List<String> keyAvoidEncoded;

        @C09CT("key_regex")
        public final String keyRegex;

        @C09CT("key_uri")
        public final List<String> keyUri;

        @C09CT("value_regex")
        public final String valueRegex;

        @C09CT("value_split_limit")
        public final int valueSplitLimit;

        public QueryRules() {
            this(false, null, null, 0, null, null, null, 0, 255, null);
        }

        public QueryRules(boolean z, String str, String str2, int i, List<String> list, List<String> list2, List<String> list3, int i2) {
            this.blockRepeatKey = z;
            this.keyRegex = str;
            this.valueRegex = str2;
            this.valueSplitLimit = i;
            this.keyAvoidEncoded = list;
            this.keyUri = list2;
            this.ignoreKeyUri = list3;
            this.httpMaxLength = i2;
        }

        public QueryRules(boolean z, String str, String str2, int i, List list, List list2, List list3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? "" : str, (i3 & 4) == 0 ? str2 : "", (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? C13BV.INSTANCE : list, (i3 & 32) != 0 ? C13BV.INSTANCE : list2, (i3 & 64) != 0 ? C13BV.INSTANCE : list3, (i3 & 128) == 0 ? i2 : 0);
        }
    }
}
