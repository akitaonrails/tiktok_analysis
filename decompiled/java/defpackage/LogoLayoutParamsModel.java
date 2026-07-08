package defpackage;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LogoLayoutParamsModel implements Serializable {

    @C09CT("height")
    public final Integer height;

    @C09CT("width")
    public final Integer width;

    public LogoLayoutParamsModel() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogoLayoutParamsModel)) {
            return false;
        }
        LogoLayoutParamsModel logoLayoutParamsModel = (LogoLayoutParamsModel) obj;
        return Intrinsics.LJFF(this.width, logoLayoutParamsModel.width) && Intrinsics.LJFF(this.height, logoLayoutParamsModel.height);
    }

    public int hashCode() {
        Integer num = this.width;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogoLayoutParamsModel(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LogoLayoutParamsModel(Integer num, Integer num2) {
        this.width = num;
        this.height = num2;
    }
}
