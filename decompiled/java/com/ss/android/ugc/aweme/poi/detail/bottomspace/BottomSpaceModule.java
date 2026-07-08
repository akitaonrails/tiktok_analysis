package com.ss.android.ugc.aweme.poi.detail.bottomspace;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BottomSpaceModule extends BaseComponentData implements Serializable {

    @C09CT("height")
    public final Integer height;

    @C09CT("show_bottom_space")
    public final Boolean showBottomSpace;

    public BottomSpaceModule() {
        this(null, null);
    }

    public final BottomSpaceModule copy(Integer num, Boolean bool) {
        return new BottomSpaceModule(num, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSpaceModule)) {
            return false;
        }
        BottomSpaceModule bottomSpaceModule = (BottomSpaceModule) obj;
        return Intrinsics.LJFF(this.height, bottomSpaceModule.height) && Intrinsics.LJFF(this.showBottomSpace, bottomSpaceModule.showBottomSpace);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        Integer num = this.height;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.showBottomSpace;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomSpaceModule(height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", showBottomSpace=");
        sbLIZ.append(this.showBottomSpace);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Boolean getShowBottomSpace() {
        return this.showBottomSpace;
    }

    public BottomSpaceModule(Integer num, Boolean bool) {
        this.height = num;
        this.showBottomSpace = bool;
    }
}
