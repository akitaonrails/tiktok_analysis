package com.ss.android.ugc.aweme.ecommerce.chunk;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class EcomParallelChunkConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_async_data_parse")
    public final boolean enableAsyncDataParse;

    @C09CT("enable_async_dispatch")
    public final boolean enableAsyncDispatch;

    @C09CT("parallelism")
    public final int parallelism;

    @C09CT("prefer_models")
    public final List<EcomParallelChunkPreferModel> preferModels;

    public EcomParallelChunkConfig() {
        this(false, false, false, null, 0, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcomParallelChunkConfig)) {
            return false;
        }
        EcomParallelChunkConfig ecomParallelChunkConfig = (EcomParallelChunkConfig) obj;
        return this.enable == ecomParallelChunkConfig.enable && this.enableAsyncDataParse == ecomParallelChunkConfig.enableAsyncDataParse && this.enableAsyncDispatch == ecomParallelChunkConfig.enableAsyncDispatch && Intrinsics.LJFF(this.preferModels, ecomParallelChunkConfig.preferModels) && this.parallelism == ecomParallelChunkConfig.parallelism;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Z2(this.enableAsyncDataParse)) * 31) + C786410Ut5.Z2(this.enableAsyncDispatch)) * 31) + this.preferModels.hashCode()) * 31) + this.parallelism;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcomParallelChunkConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", enableAsyncDataParse=");
        sbLIZ.append(this.enableAsyncDataParse);
        sbLIZ.append(", enableAsyncDispatch=");
        sbLIZ.append(this.enableAsyncDispatch);
        sbLIZ.append(", preferModels=");
        sbLIZ.append(this.preferModels);
        sbLIZ.append(", parallelism=");
        sbLIZ.append(this.parallelism);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcomParallelChunkConfig(boolean z, boolean z2, boolean z3, List<EcomParallelChunkPreferModel> list, int i) {
        this.enable = z;
        this.enableAsyncDataParse = z2;
        this.enableAsyncDispatch = z3;
        this.preferModels = list;
        this.parallelism = i;
    }

    public EcomParallelChunkConfig(boolean z, boolean z2, boolean z3, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) == 0 ? z3 : false, (i2 & 8) != 0 ? C13BV.INSTANCE : list, (i2 & 16) != 0 ? 3 : i);
    }
}
