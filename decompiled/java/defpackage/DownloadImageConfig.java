package defpackage;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class DownloadImageConfig implements Serializable {

    @C09CT("style")
    public final String style;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DownloadImageConfig) && Intrinsics.LJFF(this.style, ((DownloadImageConfig) obj).style);
    }

    public int hashCode() {
        String str = this.style;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadImageConfig(style=");
        sbLIZ.append(this.style);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DownloadImageConfig() {
        this("v1");
    }

    public DownloadImageConfig(String str) {
        this.style = str;
    }
}
