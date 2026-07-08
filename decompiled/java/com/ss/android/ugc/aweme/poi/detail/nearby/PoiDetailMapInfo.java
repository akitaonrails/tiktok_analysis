package com.ss.android.ugc.aweme.poi.detail.nearby;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailMapInfo implements Serializable {

    @C09CT("display_type")
    public final Integer displayType;

    public PoiDetailMapInfo() {
        this(null);
    }

    public int hashCode() {
        Integer num = this.displayType;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public PoiDetailMapInfo(Integer num) {
        this.displayType = num;
    }

    public final boolean checkEquals$poi_release(Object obj) {
        if ((obj instanceof PoiDetailMapInfo) && Intrinsics.LJFF(this.displayType, ((PoiDetailMapInfo) obj).displayType)) {
            return true;
        }
        return false;
    }
}
