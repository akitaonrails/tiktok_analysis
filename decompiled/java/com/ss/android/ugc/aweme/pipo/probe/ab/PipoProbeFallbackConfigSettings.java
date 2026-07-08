package com.ss.android.ugc.aweme.pipo.probe.ab;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PipoProbeFallbackConfigSettings {
    public static final PipoProbeFallbackConfigModel LIZ = new PipoProbeFallbackConfigModel(null, 1, null);

    /* JADX INFO: loaded from: classes17.dex */
    public static final class AppInstallTarget {

        @C09CT("app_name")
        public final String appName;

        @C09CT("package_name")
        public final String packageName;

        @C09CT("schema")
        public final String schema;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppInstallTarget)) {
                return false;
            }
            AppInstallTarget appInstallTarget = (AppInstallTarget) obj;
            return Intrinsics.LJFF(this.appName, appInstallTarget.appName) && Intrinsics.LJFF(this.packageName, appInstallTarget.packageName) && Intrinsics.LJFF(this.schema, appInstallTarget.schema);
        }

        public final int hashCode() {
            return (((this.appName.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.schema.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AppInstallTarget(appName=");
            sbLIZ.append(this.appName);
            sbLIZ.append(", packageName=");
            sbLIZ.append(this.packageName);
            sbLIZ.append(", schema=");
            sbLIZ.append(this.schema);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public AppInstallTarget() {
            this("", "", "");
        }

        public AppInstallTarget(String str, String str2, String str3) {
            this.appName = str;
            this.packageName = str2;
            this.schema = str3;
        }
    }

    public static final class PipoProbeFallbackConfigModel {

        @C09CT("by_entrance")
        public final List<EntranceAppList> byEntrance;

        public PipoProbeFallbackConfigModel() {
            this(null, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PipoProbeFallbackConfigModel) && Intrinsics.LJFF(this.byEntrance, ((PipoProbeFallbackConfigModel) obj).byEntrance);
        }

        public final int hashCode() {
            return this.byEntrance.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PipoProbeFallbackConfigModel(byEntrance=");
            sbLIZ.append(this.byEntrance);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PipoProbeFallbackConfigModel(List<EntranceAppList> list) {
            this.byEntrance = list;
        }

        public PipoProbeFallbackConfigModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public static final class EntranceAppList {

        @C09CT("app_list")
        public final List<AppInstallTarget> appList;

        @C09CT("entrance")
        public final String entrance;

        public EntranceAppList() {
            this(null, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EntranceAppList)) {
                return false;
            }
            EntranceAppList entranceAppList = (EntranceAppList) obj;
            return Intrinsics.LJFF(this.appList, entranceAppList.appList) && Intrinsics.LJFF(this.entrance, entranceAppList.entrance);
        }

        public final int hashCode() {
            return (this.appList.hashCode() * 31) + this.entrance.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EntranceAppList(appList=");
            sbLIZ.append(this.appList);
            sbLIZ.append(", entrance=");
            sbLIZ.append(this.entrance);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public EntranceAppList(List<AppInstallTarget> list, String str) {
            this.appList = list;
            this.entrance = str;
        }

        public EntranceAppList(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "" : str);
        }
    }
}
