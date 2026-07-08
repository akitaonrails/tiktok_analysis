package com.bytedance.hybrid.spark.security.impl;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class SparkSecurityJSBDomainReportSettings {
    public static final SparkSecurityJSBDomainReportModel LIZ;
    public static SparkSecurityJSBDomainReportModel LIZIZ;

    static {
        new SparkSecurityJSBDomainReportSettings();
        LIZ = new SparkSecurityJSBDomainReportModel(false, null, 3, null);
    }

    public static final class DomainRule {

        @C09CT("exclude")
        public final List<String> exclude;

        @C09CT("target_domain")
        public final String targetDomain;

        public DomainRule() {
            this(null, null, 3, null);
        }

        public DomainRule(String str, List<String> list) {
            this.targetDomain = str;
            this.exclude = list;
        }

        public DomainRule(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public static final class SparkSecurityJSBDomainReportModel {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("list")
        public final List<DomainRule> list;

        public SparkSecurityJSBDomainReportModel() {
            this(false, null, 3, null);
        }

        public SparkSecurityJSBDomainReportModel(boolean z, List<DomainRule> list) {
            this.enable = z;
            this.list = list;
        }

        public SparkSecurityJSBDomainReportModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
