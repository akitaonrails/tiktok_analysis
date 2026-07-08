package com.ss.android.ugc.aweme.ecommerce.base.pdp.libra;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PdpLynxPreloadModel {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("container_precreate_options")
    public final PreloadStepOptions preCreateOpt;

    @C09CT("container_reuse_options")
    public final PreloadStepOptions reUseOpt;

    @C09CT("schemas")
    public final List<PreloadSchema> schemas;

    @C09CT("triggers")
    public final Map<String, PreloadTrigger> triggers;

    public PdpLynxPreloadModel() {
        this(false, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpLynxPreloadModel)) {
            return false;
        }
        PdpLynxPreloadModel pdpLynxPreloadModel = (PdpLynxPreloadModel) obj;
        return this.enabled == pdpLynxPreloadModel.enabled && Intrinsics.LJFF(this.schemas, pdpLynxPreloadModel.schemas) && Intrinsics.LJFF(this.triggers, pdpLynxPreloadModel.triggers) && Intrinsics.LJFF(this.preCreateOpt, pdpLynxPreloadModel.preCreateOpt) && Intrinsics.LJFF(this.reUseOpt, pdpLynxPreloadModel.reUseOpt);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.enabled) * 31) + this.schemas.hashCode()) * 31) + this.triggers.hashCode()) * 31) + this.preCreateOpt.hashCode()) * 31) + this.reUseOpt.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpLynxPreloadModel(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", schemas=");
        sbLIZ.append(this.schemas);
        sbLIZ.append(", triggers=");
        sbLIZ.append(this.triggers);
        sbLIZ.append(", preCreateOpt=");
        sbLIZ.append(this.preCreateOpt);
        sbLIZ.append(", reUseOpt=");
        sbLIZ.append(this.reUseOpt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PdpLynxPreloadModel(boolean z, List<PreloadSchema> list, Map<String, PreloadTrigger> map, PreloadStepOptions preloadStepOptions, PreloadStepOptions preloadStepOptions2) {
        this.enabled = z;
        this.schemas = list;
        this.triggers = map;
        this.preCreateOpt = preloadStepOptions;
        this.reUseOpt = preloadStepOptions2;
    }

    public PdpLynxPreloadModel(boolean z, List list, Map map, PreloadStepOptions preloadStepOptions, PreloadStepOptions preloadStepOptions2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C2097608Jq.LJ() : map, (i & 8) != 0 ? new PreloadStepOptions(null, Boolean.FALSE, false, null, null) : preloadStepOptions, (i & 16) != 0 ? new PreloadStepOptions(null, Boolean.FALSE, false, null, null) : preloadStepOptions2);
    }
}
