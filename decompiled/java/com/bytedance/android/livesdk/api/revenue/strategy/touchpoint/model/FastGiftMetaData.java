package com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1992207rE;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FastGiftMetaData implements InterfaceC1992207rE {
    public static final /* synthetic */ int LIZIZ = 0;
    public Map<String, String> LIZ = new LinkedHashMap();

    @C09CT("icon")
    public final ImageModel icon;

    @C09CT("schema")
    public final String schema;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FastGiftMetaData)) {
            return false;
        }
        FastGiftMetaData fastGiftMetaData = (FastGiftMetaData) obj;
        return Intrinsics.LJFF(this.icon, fastGiftMetaData.icon) && Intrinsics.LJFF(this.schema, fastGiftMetaData.schema);
    }

    public final int hashCode() {
        ImageModel imageModel = this.icon;
        int iHashCode = (imageModel == null ? 0 : imageModel.hashCode()) * 31;
        String str = this.schema;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FastGiftMetaData(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FastGiftMetaData(ImageModel imageModel, String str) {
        this.icon = imageModel;
        this.schema = str;
    }
}
