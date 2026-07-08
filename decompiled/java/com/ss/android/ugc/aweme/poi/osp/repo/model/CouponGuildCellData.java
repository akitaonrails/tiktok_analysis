package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CouponGuildCellData implements Serializable, InterfaceC1891350zJl {

    @C09CT("content")
    public final String content;

    @C09CT("icon_res_token")
    public final String iconResToken;

    public CouponGuildCellData() {
        this(null, null);
    }

    public final CouponGuildCellData copy(String str, String str2) {
        return new CouponGuildCellData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponGuildCellData)) {
            return false;
        }
        CouponGuildCellData couponGuildCellData = (CouponGuildCellData) obj;
        return Intrinsics.LJFF(this.iconResToken, couponGuildCellData.iconResToken) && Intrinsics.LJFF(this.content, couponGuildCellData.content);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        String str = this.iconResToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CouponGuildCellData(iconResToken=");
        sbLIZ.append(this.iconResToken);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getIconResToken() {
        return this.iconResToken;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public CouponGuildCellData(String str, String str2) {
        this.iconResToken = str;
        this.content = str2;
    }
}
