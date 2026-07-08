package com.ss.android.ugc.aweme.slash.component.lynx.icon;

import X.C09CT;
import X.C1180530gpH;
import X.C1201190hMb;
import X.C123100dR;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LynxFloatIconModel extends C1180530gpH {

    @C09CT("business_data")
    public final String businessData;

    @C09CT("url")
    public final String url;

    public LynxFloatIconModel() {
        this(null, null);
    }

    public final LynxFloatIconModel copy(String str, String str2) {
        return new LynxFloatIconModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LynxFloatIconModel)) {
            return false;
        }
        LynxFloatIconModel lynxFloatIconModel = (LynxFloatIconModel) obj;
        return Intrinsics.LJFF(this.url, lynxFloatIconModel.url) && Intrinsics.LJFF(this.businessData, lynxFloatIconModel.businessData);
    }

    @Override // X.C1180530gpH, com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
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
        sbLIZ.append("LynxFloatIconModel(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", businessData=");
        sbLIZ.append(this.businessData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isDataReady$slash_release() {
        return C123100dR.LIZ(getUrl());
    }

    @Override // X.C1180530gpH
    public String getBusinessData() {
        return this.businessData;
    }

    @Override // X.C1180530gpH
    public String getUrl() {
        return this.url;
    }

    public LynxFloatIconModel(String str, String str2) {
        super(str, str2);
        this.url = str;
        this.businessData = str2;
    }
}
