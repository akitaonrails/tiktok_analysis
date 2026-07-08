package com.ss.android.ugc.aweme.resource;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class CategoryResp extends BaseUgcResp {

    @C09CT("data")
    public final CategoryData data;

    public CategoryResp() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CategoryResp) && Intrinsics.LJFF(this.data, ((CategoryResp) obj).data);
    }

    public final int hashCode() {
        CategoryData categoryData = this.data;
        if (categoryData == null) {
            return 0;
        }
        return categoryData.hashCode();
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CategoryResp data = ");
        sbLIZ.append(this.data);
        sbLIZ.append(", status_code = ");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", msg = ");
        sbLIZ.append(this.message);
        sbLIZ.append(", log_id = ");
        sbLIZ.append(this.logId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CategoryResp(CategoryData categoryData) {
        this.data = categoryData;
    }
}
