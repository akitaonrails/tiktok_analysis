package com.ss.android.ugc.aweme.ecommercelive.audience.sea.business.billboard.feed;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.n;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeaLiveOecPreviewRoomData implements Serializable {

    @C09CT("billboards")
    public final List<n> billboard;

    public SeaLiveOecPreviewRoomData() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SeaLiveOecPreviewRoomData) && Intrinsics.LJFF(this.billboard, ((SeaLiveOecPreviewRoomData) obj).billboard);
    }

    public int hashCode() {
        List<n> list = this.billboard;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaLiveOecPreviewRoomData(billboard=");
        sbLIZ.append(this.billboard);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaLiveOecPreviewRoomData(List<n> list) {
        this.billboard = list;
    }
}
