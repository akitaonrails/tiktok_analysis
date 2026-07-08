package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SaveSecuritySection {

    @C09CT("blocks")
    public List<SaveSecurityBlock> blocks;

    @C09CT("display_direction")
    public Integer displayDirection;

    public SaveSecuritySection() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveSecuritySection)) {
            return false;
        }
        SaveSecuritySection saveSecuritySection = (SaveSecuritySection) obj;
        return Intrinsics.LJFF(this.displayDirection, saveSecuritySection.displayDirection) && Intrinsics.LJFF(this.blocks, saveSecuritySection.blocks);
    }

    public final int hashCode() {
        Integer num = this.displayDirection;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<SaveSecurityBlock> list = this.blocks;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveSecuritySection(displayDirection=");
        sbLIZ.append(this.displayDirection);
        sbLIZ.append(", blocks=");
        sbLIZ.append(this.blocks);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SaveSecuritySection(Integer num, List<SaveSecurityBlock> list) {
        this.displayDirection = num;
        this.blocks = list;
    }
}
