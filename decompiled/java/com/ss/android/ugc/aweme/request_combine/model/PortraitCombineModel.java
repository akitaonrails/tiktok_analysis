package com.ss.android.ugc.aweme.request_combine.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1294060jmO;
import com.google.gson.k;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1294060jmO
public final class PortraitCombineModel extends BaseCombineMode {

    @C09CT("body")
    public k portraitData;

    public PortraitCombineModel() {
        this(null);
    }

    public final PortraitCombineModel copy(k kVar) {
        return new PortraitCombineModel(kVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PortraitCombineModel) && Intrinsics.LJFF(this.portraitData, ((PortraitCombineModel) obj).portraitData);
    }

    public int hashCode() {
        k kVar = this.portraitData;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PortraitCombineModel(portraitData=");
        sbLIZ.append(this.portraitData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final k getPortraitData() {
        return this.portraitData;
    }

    public PortraitCombineModel(k kVar) {
        this.portraitData = kVar;
    }

    public final void setPortraitData(k kVar) {
        this.portraitData = kVar;
    }
}
