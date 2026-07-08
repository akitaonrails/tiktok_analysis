package com.ss.android.ugc.aweme.dependence.beauty.data;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1409950mnJ;

/* JADX INFO: loaded from: classes23.dex */
public final class MBeautyStateInfo implements InterfaceC1409950mnJ {

    @C09CT("beautify_on")
    public final int beautyStatus;

    @C09CT("is_mbeautify")
    public final int isComposer;

    public MBeautyStateInfo() {
        this(0, 0);
    }

    public final MBeautyStateInfo copy(int i, int i2) {
        return new MBeautyStateInfo(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MBeautyStateInfo)) {
            return false;
        }
        MBeautyStateInfo mBeautyStateInfo = (MBeautyStateInfo) obj;
        return this.beautyStatus == mBeautyStateInfo.beautyStatus && this.isComposer == mBeautyStateInfo.isComposer;
    }

    public int hashCode() {
        return (this.beautyStatus * 31) + this.isComposer;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MBeautyStateInfo(beautyStatus=");
        sbLIZ.append(this.beautyStatus);
        sbLIZ.append(", isComposer=");
        sbLIZ.append(this.isComposer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1409950mnJ
    public int getBeautyStatus() {
        return this.beautyStatus;
    }

    public int isComposer() {
        return this.isComposer;
    }

    public MBeautyStateInfo(int i, int i2) {
        this.beautyStatus = i;
        this.isComposer = i2;
    }
}
