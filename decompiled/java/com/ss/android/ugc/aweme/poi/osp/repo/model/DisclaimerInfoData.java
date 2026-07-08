package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DisclaimerInfoData extends BaseComponentData implements Serializable {

    @C09CT("disclaimer")
    public final DisclaimerData disclaimer;

    public DisclaimerInfoData() {
        this(null);
    }

    public final DisclaimerInfoData copy(DisclaimerData disclaimerData) {
        return new DisclaimerInfoData(disclaimerData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisclaimerInfoData) && Intrinsics.LJFF(this.disclaimer, ((DisclaimerInfoData) obj).disclaimer);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        DisclaimerData disclaimerData = this.disclaimer;
        if (disclaimerData == null) {
            return 0;
        }
        return disclaimerData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisclaimerInfoData(disclaimer=");
        sbLIZ.append(this.disclaimer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final DisclaimerData getDisclaimer() {
        return this.disclaimer;
    }

    public DisclaimerInfoData(DisclaimerData disclaimerData) {
        this.disclaimer = disclaimerData;
    }
}
