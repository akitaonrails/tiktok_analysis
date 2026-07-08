package com.ss.android.ugc.aweme.slash.component.compose;

import X.AbstractC1180940gpw;
import X.C09CT;
import X.C1176010ghz;
import X.C1179220gnA;
import X.C2188811AlT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.slash.cell.arc.ComposeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashComposeComponentModel extends AbstractC1180940gpw {

    @C09CT("biz_data")
    public final n bizData;

    @C09CT("biz_name")
    public final String bizName;

    @C09CT("compose_config")
    public final ComposeConfig composeConfig;

    public SlashComposeComponentModel() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashComposeComponentModel)) {
            return false;
        }
        SlashComposeComponentModel slashComposeComponentModel = (SlashComposeComponentModel) obj;
        return Intrinsics.LJFF(this.composeConfig, slashComposeComponentModel.composeConfig) && Intrinsics.LJFF(this.bizData, slashComposeComponentModel.bizData) && Intrinsics.LJFF(this.bizName, slashComposeComponentModel.bizName);
    }

    public final int hashCode() {
        ComposeConfig composeConfig = this.composeConfig;
        int iHashCode = (composeConfig == null ? 0 : composeConfig.hashCode()) * 31;
        n nVar = this.bizData;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str = this.bizName;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // X.AbstractC1180940gpw
    public final void setCustomContentType$slash_release(int i) {
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashComposeComponentModel(composeConfig=");
        sbLIZ.append(this.composeConfig);
        sbLIZ.append(", bizData=");
        sbLIZ.append(this.bizData);
        sbLIZ.append(", bizName=");
        sbLIZ.append(this.bizName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1180940gpw
    public final int getCustomContentType$slash_release() {
        C1176010ghz c1176010ghz = C1179220gnA.LIZ;
        String str = this.instanceId;
        if (str == null) {
            str = "";
        }
        return C1176010ghz.LIZ(c1176010ghz, str);
    }

    public SlashComposeComponentModel(ComposeConfig composeConfig, n nVar, String str) {
        this.composeConfig = composeConfig;
        this.bizData = nVar;
        this.bizName = str;
    }
}
