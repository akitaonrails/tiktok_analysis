package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EcSearchPdpOutOfAppDiversionConfigModel {

    @C09CT("disable_rec_keyword")
    public final int disableRecKeyword;

    @C09CT("schema")
    public final String schema;

    public EcSearchPdpOutOfAppDiversionConfigModel() {
        this(0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcSearchPdpOutOfAppDiversionConfigModel)) {
            return false;
        }
        EcSearchPdpOutOfAppDiversionConfigModel ecSearchPdpOutOfAppDiversionConfigModel = (EcSearchPdpOutOfAppDiversionConfigModel) obj;
        return this.disableRecKeyword == ecSearchPdpOutOfAppDiversionConfigModel.disableRecKeyword && Intrinsics.LJFF(this.schema, ecSearchPdpOutOfAppDiversionConfigModel.schema);
    }

    public final int hashCode() {
        int i = this.disableRecKeyword * 31;
        String str = this.schema;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchPdpOutOfAppDiversionConfigModel(disableRecKeyword=");
        sbLIZ.append(this.disableRecKeyword);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcSearchPdpOutOfAppDiversionConfigModel(int i, String str) {
        this.disableRecKeyword = i;
        this.schema = str;
    }
}
