package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionPanel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticsExpressionPanel implements Parcelable {

    @C09CT("logistics_expression_area")
    public LogisticPanelModule logisticsPanelModule;

    @C09CT("selected_logistics_service_id")
    public String selectedLogisticsServiceId;
    public static final Parcelable.Creator<LogisticsExpressionPanel> CREATOR = new Parcelable.Creator<LogisticsExpressionPanel>() { // from class: X.02kr
        @Override // android.os.Parcelable.Creator
        public final LogisticsExpressionPanel createFromParcel(Parcel parcel) {
            LogisticPanelModule logisticPanelModuleCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                logisticPanelModuleCreateFromParcel = null;
            } else {
                logisticPanelModuleCreateFromParcel = LogisticPanelModule.CREATOR.createFromParcel(parcel);
            }
            return new LogisticsExpressionPanel(string, logisticPanelModuleCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LogisticsExpressionPanel[] newArray(int i) {
            return new LogisticsExpressionPanel[i];
        }
    };
    public static final int $stable = 8;

    public LogisticsExpressionPanel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticsExpressionPanel)) {
            return false;
        }
        LogisticsExpressionPanel logisticsExpressionPanel = (LogisticsExpressionPanel) obj;
        return Intrinsics.LJFF(this.selectedLogisticsServiceId, logisticsExpressionPanel.selectedLogisticsServiceId) && Intrinsics.LJFF(this.logisticsPanelModule, logisticsExpressionPanel.logisticsPanelModule);
    }

    public final int hashCode() {
        String str = this.selectedLogisticsServiceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LogisticPanelModule logisticPanelModule = this.logisticsPanelModule;
        return iHashCode + (logisticPanelModule != null ? logisticPanelModule.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogisticsExpressionPanel(selectedLogisticsServiceId=");
        sbLIZ.append(this.selectedLogisticsServiceId);
        sbLIZ.append(", logisticsPanelModule=");
        sbLIZ.append(this.logisticsPanelModule);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.selectedLogisticsServiceId);
        LogisticPanelModule logisticPanelModule = this.logisticsPanelModule;
        if (logisticPanelModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticPanelModule.writeToParcel(parcel, i);
        }
    }

    public LogisticsExpressionPanel(String str, LogisticPanelModule logisticPanelModule) {
        this.selectedLogisticsServiceId = str;
        this.logisticsPanelModule = logisticPanelModule;
    }
}
