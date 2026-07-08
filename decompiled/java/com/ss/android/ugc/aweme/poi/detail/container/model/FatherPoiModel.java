package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class FatherPoiModel implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("keyword")
    public final String keyword;

    @C09CT("schema")
    public final String schema;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FatherPoiModel)) {
            return false;
        }
        FatherPoiModel fatherPoiModel = (FatherPoiModel) obj;
        return Intrinsics.LJFF(this.keyword, fatherPoiModel.keyword) && Intrinsics.LJFF(this.schema, fatherPoiModel.schema) && Intrinsics.LJFF(this.id, fatherPoiModel.id);
    }

    public int hashCode() {
        String str = this.keyword;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.id;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FatherPoiModel(keyword=");
        sbLIZ.append(this.keyword);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FatherPoiModel(String str, String str2, String str3) {
        this.keyword = str;
        this.schema = str2;
        this.id = str3;
    }
}
