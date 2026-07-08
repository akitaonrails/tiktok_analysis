package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MethodPhotoWithId {

    @C09CT("dark_photo")
    public String darkPhoto;

    @C09CT("photo")
    public String lightPhotos;

    @C09CT("payment_method_code")
    public String paymentMethodId;

    public MethodPhotoWithId() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MethodPhotoWithId)) {
            return false;
        }
        MethodPhotoWithId methodPhotoWithId = (MethodPhotoWithId) obj;
        return Intrinsics.LJFF(this.paymentMethodId, methodPhotoWithId.paymentMethodId) && Intrinsics.LJFF(this.lightPhotos, methodPhotoWithId.lightPhotos) && Intrinsics.LJFF(this.darkPhoto, methodPhotoWithId.darkPhoto);
    }

    public final int hashCode() {
        String str = this.paymentMethodId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lightPhotos;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkPhoto;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MethodPhotoWithId(paymentMethodId=");
        sbLIZ.append(this.paymentMethodId);
        sbLIZ.append(", lightPhotos=");
        sbLIZ.append(this.lightPhotos);
        sbLIZ.append(", darkPhoto=");
        sbLIZ.append(this.darkPhoto);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MethodPhotoWithId(String str, String str2, String str3) {
        this.paymentMethodId = str;
        this.lightPhotos = str2;
        this.darkPhoto = str3;
    }
}
