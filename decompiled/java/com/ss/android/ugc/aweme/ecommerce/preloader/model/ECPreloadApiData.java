package com.ss.android.ugc.aweme.ecommerce.preloader.model;

import X.AbstractC1931807hU;
import X.C09CT;
import X.C2188811AlT;
import com.google.gson.n;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ECPreloadApiData extends AbstractC1931807hU {

    @C09CT("api")
    public final String api;

    @C09CT("data_path")
    public final Map<String, String> dataPath;

    @C09CT("data_path_v2")
    public final Map<String, Object> dataPathV2;

    @C09CT("request_param")
    public final n requestParam;

    public ECPreloadApiData() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECPreloadApiData)) {
            return false;
        }
        ECPreloadApiData eCPreloadApiData = (ECPreloadApiData) obj;
        return Intrinsics.LJFF(this.api, eCPreloadApiData.api) && Intrinsics.LJFF(this.requestParam, eCPreloadApiData.requestParam) && Intrinsics.LJFF(this.dataPath, eCPreloadApiData.dataPath) && Intrinsics.LJFF(this.dataPathV2, eCPreloadApiData.dataPathV2);
    }

    public final int hashCode() {
        String str = this.api;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        n nVar = this.requestParam;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Map<String, String> map = this.dataPath;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.dataPathV2;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECPreloadApiData(api=");
        sbLIZ.append(this.api);
        sbLIZ.append(", requestParam=");
        sbLIZ.append(this.requestParam);
        sbLIZ.append(", dataPath=");
        sbLIZ.append(this.dataPath);
        sbLIZ.append(", dataPathV2=");
        sbLIZ.append(this.dataPathV2);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ECPreloadApiData(String str, n nVar, Map<String, String> map, Map<String, ? extends Object> map2) {
        this.api = str;
        this.requestParam = nVar;
        this.dataPath = map;
        this.dataPathV2 = map2;
    }
}
