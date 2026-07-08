package com.ss.android.ugc.tiktok.location.config;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DeSkipCertForSearchModel {

    @C09CT("list")
    public final List<String> list;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeSkipCertForSearchModel) && Intrinsics.LJFF(this.list, ((DeSkipCertForSearchModel) obj).list);
    }

    public final int hashCode() {
        return this.list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeSkipCertForSearchModel(list=");
        sbLIZ.append(this.list);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DeSkipCertForSearchModel() {
        this(C1697810uHb.LJIIJJI("bpea-search_tako_fetch_location_when_query", "bpea-search_poi_fetch_location", "bpea-search_poi_request_location_cacheFirst"));
    }

    public DeSkipCertForSearchModel(List<String> list) {
        this.list = list;
    }
}
