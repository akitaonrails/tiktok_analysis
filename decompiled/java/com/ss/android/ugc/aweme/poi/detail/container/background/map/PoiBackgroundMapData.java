package com.ss.android.ugc.aweme.poi.detail.container.background.map;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiBackgroundMapData extends BaseComponentData implements Serializable {

    @C09CT("type_level")
    public final String typeLevel;

    public PoiBackgroundMapData() {
        this(null);
    }

    public final PoiBackgroundMapData copy(String str) {
        return new PoiBackgroundMapData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PoiBackgroundMapData) && Intrinsics.LJFF(this.typeLevel, ((PoiBackgroundMapData) obj).typeLevel);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.typeLevel;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiBackgroundMapData(typeLevel=");
        sbLIZ.append(this.typeLevel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getTypeLevel() {
        return this.typeLevel;
    }

    public PoiBackgroundMapData(String str) {
        this.typeLevel = str;
    }
}
