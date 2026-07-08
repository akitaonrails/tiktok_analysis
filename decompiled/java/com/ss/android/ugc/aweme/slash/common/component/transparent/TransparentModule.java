package com.ss.android.ugc.aweme.slash.common.component.transparent;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TransparentModule extends BaseComponentData implements Serializable {

    @C09CT("height")
    public final int height;

    @C09CT("top_height_style")
    public final String topHeightStyle;

    public TransparentModule() {
        this(0, null);
    }

    public final TransparentModule copy(int i, String str) {
        return new TransparentModule(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransparentModule)) {
            return false;
        }
        TransparentModule transparentModule = (TransparentModule) obj;
        return this.height == transparentModule.height && Intrinsics.LJFF(this.topHeightStyle, transparentModule.topHeightStyle);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        int i = this.height * 31;
        String str = this.topHeightStyle;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TransparentModule(height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", topHeightStyle=");
        sbLIZ.append(this.topHeightStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getTopHeightStyle() {
        return this.topHeightStyle;
    }

    public TransparentModule(int i, String str) {
        this.height = i;
        this.topHeightStyle = str;
    }
}
