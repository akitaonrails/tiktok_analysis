package com.ss.android.ugc.aweme.slash.component.popup.spark;

import X.C09CT;
import X.C1181580gqy;
import X.C1201190hMb;
import X.C123100dR;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SparkPopupModel extends C1181580gqy {

    @C09CT("business_data")
    public final String businessData;

    @C09CT("url")
    public final String url;

    public SparkPopupModel() {
        this(null, null);
    }

    public final SparkPopupModel copy(String str, String str2) {
        return new SparkPopupModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SparkPopupModel)) {
            return false;
        }
        SparkPopupModel sparkPopupModel = (SparkPopupModel) obj;
        return Intrinsics.LJFF(this.url, sparkPopupModel.url) && Intrinsics.LJFF(this.businessData, sparkPopupModel.businessData);
    }

    @Override // X.C1181580gqy, com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.businessData;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkPopupModel(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", businessData=");
        sbLIZ.append(this.businessData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isDataReady$slash_release() {
        return C123100dR.LIZ(this.url);
    }

    public final String getBusinessData() {
        return this.businessData;
    }

    public final String getUrl() {
        return this.url;
    }

    public SparkPopupModel(String str, String str2) {
        super(false);
        this.url = str;
        this.businessData = str2;
    }
}
