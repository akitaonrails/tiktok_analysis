package com.ss.android.ugc.aweme.minis.report.log;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MinisReportEtDataWhiteListSettings {
    public static final MinisReportEtDataWhiteListModel LIZ = new MinisReportEtDataWhiteListModel(null, 1, null);

    public static final class MinisReportEtDataWhiteListModel {

        @C09CT("et_white_list")
        public final List<EtWhiteListItem> etWhiteList;

        public MinisReportEtDataWhiteListModel() {
            this(null, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MinisReportEtDataWhiteListModel) && Intrinsics.LJFF(this.etWhiteList, ((MinisReportEtDataWhiteListModel) obj).etWhiteList);
        }

        public final int hashCode() {
            return this.etWhiteList.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MinisReportEtDataWhiteListModel(etWhiteList=");
            sbLIZ.append(this.etWhiteList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public MinisReportEtDataWhiteListModel(List<EtWhiteListItem> list) {
            this.etWhiteList = list;
        }

        public MinisReportEtDataWhiteListModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public static final class EtWhiteListItem {

        @C09CT("enable_report")
        public final boolean enableReport;

        @C09CT("et_list")
        public final List<String> etList;

        public EtWhiteListItem() {
            this(false, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EtWhiteListItem)) {
                return false;
            }
            EtWhiteListItem etWhiteListItem = (EtWhiteListItem) obj;
            return this.enableReport == etWhiteListItem.enableReport && Intrinsics.LJFF(this.etList, etWhiteListItem.etList);
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.enableReport) * 31) + this.etList.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EtWhiteListItem(enableReport=");
            sbLIZ.append(this.enableReport);
            sbLIZ.append(", etList=");
            sbLIZ.append(this.etList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public EtWhiteListItem(boolean z, List<String> list) {
            this.enableReport = z;
            this.etList = list;
        }

        public EtWhiteListItem(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
