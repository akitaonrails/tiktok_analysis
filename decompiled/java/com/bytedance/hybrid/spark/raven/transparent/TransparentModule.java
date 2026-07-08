package com.bytedance.hybrid.spark.raven.transparent;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class TransparentModule extends BaseComponentData implements Serializable {

    @C09CT("height")
    public final int height;

    public TransparentModule() {
        this(0);
    }

    public final TransparentModule copy(int i) {
        return new TransparentModule(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransparentModule) && this.height == ((TransparentModule) obj).height;
    }

    public int hashCode() {
        return this.height;
    }

    @Override // com.bytedance.hybrid.spark.raven.model.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TransparentModule(height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getHeight() {
        return this.height;
    }

    public TransparentModule(int i) {
        this.height = i;
    }
}
