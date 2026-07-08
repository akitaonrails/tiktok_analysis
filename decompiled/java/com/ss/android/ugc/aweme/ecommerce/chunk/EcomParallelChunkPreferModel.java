package com.ss.android.ugc.aweme.ecommerce.chunk;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.google.gson.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class EcomParallelChunkPreferModel {

    @C09CT("defer")
    public final k defer;

    @C09CT("path")
    public final String path;

    @C09CT("prefer")
    public final k prefer;

    @C09CT("timeout")
    public final long timeout;

    public EcomParallelChunkPreferModel() {
        this("", null, null, 300L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcomParallelChunkPreferModel)) {
            return false;
        }
        EcomParallelChunkPreferModel ecomParallelChunkPreferModel = (EcomParallelChunkPreferModel) obj;
        return Intrinsics.LJFF(this.path, ecomParallelChunkPreferModel.path) && Intrinsics.LJFF(this.defer, ecomParallelChunkPreferModel.defer) && Intrinsics.LJFF(this.prefer, ecomParallelChunkPreferModel.prefer) && this.timeout == ecomParallelChunkPreferModel.timeout;
    }

    public final int hashCode() {
        int iHashCode = this.path.hashCode() * 31;
        k kVar = this.defer;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        k kVar2 = this.prefer;
        return ((iHashCode2 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.timeout);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcomParallelChunkPreferModel(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", defer=");
        sbLIZ.append(this.defer);
        sbLIZ.append(", prefer=");
        sbLIZ.append(this.prefer);
        sbLIZ.append(", timeout=");
        sbLIZ.append(this.timeout);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcomParallelChunkPreferModel(String str, k kVar, k kVar2, long j) {
        this.path = str;
        this.defer = kVar;
        this.prefer = kVar2;
        this.timeout = j;
    }
}
