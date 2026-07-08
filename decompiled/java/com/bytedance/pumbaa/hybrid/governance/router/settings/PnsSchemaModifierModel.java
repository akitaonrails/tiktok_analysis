package com.bytedance.pumbaa.hybrid.governance.router.settings;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PnsSchemaModifierModel extends BaseGovernanceModel {

    @C09CT("source_match_enable")
    public final boolean sourceMatchEnable;

    @C09CT("third")
    public final List<ModifyConfigModel> third;

    public PnsSchemaModifierModel() {
        this(false, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnsSchemaModifierModel)) {
            return false;
        }
        PnsSchemaModifierModel pnsSchemaModifierModel = (PnsSchemaModifierModel) obj;
        return this.sourceMatchEnable == pnsSchemaModifierModel.sourceMatchEnable && Intrinsics.LJFF(this.third, pnsSchemaModifierModel.third);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.sourceMatchEnable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.third.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PnsSchemaModifierModel(sourceMatchEnable=");
        sbLIZ.append(this.sourceMatchEnable);
        sbLIZ.append(", third=");
        sbLIZ.append(this.third);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PnsSchemaModifierModel(boolean z, List<ModifyConfigModel> list) {
        super(null, false, false, false, false);
        this.sourceMatchEnable = z;
        this.third = list;
    }

    public PnsSchemaModifierModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
