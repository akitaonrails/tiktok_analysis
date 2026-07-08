package com.bytedance.hybrid.spark.security.impl;

import X.C09CT;
import X.C0C64;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SparkSecurityJSBParamReportSettings {
    public static final SparkSecurityJSBParamReportModel LIZ;
    public static SparkSecurityJSBParamReportModel LIZIZ;

    static {
        new SparkSecurityJSBParamReportSettings();
        LIZ = new SparkSecurityJSBParamReportModel(false, null, 3, null);
    }

    public static final SparkSecurityJSBParamReportModel LIZ() {
        if (LIZIZ == null) {
            LIZIZ = (SparkSecurityJSBParamReportModel) C0C64.LJIILLIIL().LJJII(SparkSecurityJSBParamReportModel.class, LIZ, "spark_security_jsb_param_report", true);
        }
        SparkSecurityJSBParamReportModel sparkSecurityJSBParamReportModel = LIZIZ;
        return sparkSecurityJSBParamReportModel == null ? LIZ : sparkSecurityJSBParamReportModel;
    }

    public static final class SparkSecurityJSBParamReportModel {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("list")
        public final List<Rule> list;

        public SparkSecurityJSBParamReportModel() {
            this(false, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SparkSecurityJSBParamReportModel)) {
                return false;
            }
            SparkSecurityJSBParamReportModel sparkSecurityJSBParamReportModel = (SparkSecurityJSBParamReportModel) obj;
            return this.enable == sparkSecurityJSBParamReportModel.enable && Intrinsics.LJFF(this.list, sparkSecurityJSBParamReportModel.list);
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.enable) * 31) + this.list.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SparkSecurityJSBParamReportModel(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", list=");
            sbLIZ.append(this.list);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SparkSecurityJSBParamReportModel(boolean z, List<Rule> list) {
            this.enable = z;
            this.list = list;
        }

        public SparkSecurityJSBParamReportModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public static final class Rule {

        @C09CT("exclude_pattern")
        public final List<String> excludePattern;

        @C09CT("report_on")
        public final String reportOn;

        @C09CT("target_jsb")
        public final String targetJsb;

        @C09CT("target_keypath")
        public final String targetKeypath;

        public Rule() {
            this(null, null, null, null, 15, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rule)) {
                return false;
            }
            Rule rule = (Rule) obj;
            return Intrinsics.LJFF(this.targetJsb, rule.targetJsb) && Intrinsics.LJFF(this.targetKeypath, rule.targetKeypath) && Intrinsics.LJFF(this.reportOn, rule.reportOn) && Intrinsics.LJFF(this.excludePattern, rule.excludePattern);
        }

        public final int hashCode() {
            return (((((this.targetJsb.hashCode() * 31) + this.targetKeypath.hashCode()) * 31) + this.reportOn.hashCode()) * 31) + this.excludePattern.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Rule(targetJsb=");
            sbLIZ.append(this.targetJsb);
            sbLIZ.append(", targetKeypath=");
            sbLIZ.append(this.targetKeypath);
            sbLIZ.append(", reportOn=");
            sbLIZ.append(this.reportOn);
            sbLIZ.append(", excludePattern=");
            sbLIZ.append(this.excludePattern);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Rule(String str, String str2, String str3, List<String> list) {
            this.targetJsb = str;
            this.targetKeypath = str2;
            this.reportOn = str3;
            this.excludePattern = list;
        }

        public Rule(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
