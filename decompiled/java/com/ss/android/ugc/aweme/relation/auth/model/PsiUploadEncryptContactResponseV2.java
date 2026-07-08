package com.ss.android.ugc.aweme.relation.auth.model;

import X.C09CT;
import X.C09DE;
import X.C15438062q;
import X.C2188811AlT;
import X.C786410Ut5;
import android.util.Base64;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class PsiUploadEncryptContactResponseV2 extends BaseResponse {

    @C09DE
    public transient byte[] bloomFilterBits;

    @C09CT("phone_bits")
    public final String bloomFilterBitsBase64;

    @C09CT("email_bits")
    public final String bloomFilterBitsBase64Email;

    @C09DE
    public transient byte[] bloomFilterBitsEmail;

    @C09CT("phone_k")
    public final long bloomFilterK;

    @C09CT("email_k")
    public final long bloomFilterKEmail;

    @C09CT("phone_m")
    public final long bloomFilterM;

    @C09CT("email_m")
    public final long bloomFilterMEmail;

    @C09CT("phone_hash_a_b")
    public final List<String> hashABBase64List;

    @C09CT("email_hash_a_b")
    public final List<String> hashABBase64ListEmail;

    @C09DE
    public transient List<byte[]> hashABList;

    @C09DE
    public transient List<byte[]> hashABListEmail;

    @C09CT("log_id")
    public final String psiSessionId;

    @C09CT("verify_acc")
    public final boolean verifyAcc;

    public final PsiUploadEncryptContactResponseV2 copy(String str, String str2, long j, long j2, List<String> list, String str3, long j3, long j4, List<String> list2, boolean z) {
        return new PsiUploadEncryptContactResponseV2(str, str2, j, j2, list, str3, j3, j4, list2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PsiUploadEncryptContactResponseV2)) {
            return false;
        }
        PsiUploadEncryptContactResponseV2 psiUploadEncryptContactResponseV2 = (PsiUploadEncryptContactResponseV2) obj;
        return Intrinsics.LJFF(this.psiSessionId, psiUploadEncryptContactResponseV2.psiSessionId) && Intrinsics.LJFF(this.bloomFilterBitsBase64, psiUploadEncryptContactResponseV2.bloomFilterBitsBase64) && this.bloomFilterM == psiUploadEncryptContactResponseV2.bloomFilterM && this.bloomFilterK == psiUploadEncryptContactResponseV2.bloomFilterK && Intrinsics.LJFF(this.hashABBase64List, psiUploadEncryptContactResponseV2.hashABBase64List) && Intrinsics.LJFF(this.bloomFilterBitsBase64Email, psiUploadEncryptContactResponseV2.bloomFilterBitsBase64Email) && this.bloomFilterMEmail == psiUploadEncryptContactResponseV2.bloomFilterMEmail && this.bloomFilterKEmail == psiUploadEncryptContactResponseV2.bloomFilterKEmail && Intrinsics.LJFF(this.hashABBase64ListEmail, psiUploadEncryptContactResponseV2.hashABBase64ListEmail) && this.verifyAcc == psiUploadEncryptContactResponseV2.verifyAcc;
    }

    public int hashCode() {
        int iHashCode = this.psiSessionId.hashCode() * 31;
        String str = this.bloomFilterBitsBase64;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.bloomFilterM)) * 31) + C786410Ut5.Y2(this.bloomFilterK)) * 31;
        List<String> list = this.hashABBase64List;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.bloomFilterBitsBase64Email;
        int iHashCode4 = (((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Y2(this.bloomFilterMEmail)) * 31) + C786410Ut5.Y2(this.bloomFilterKEmail)) * 31;
        List<String> list2 = this.hashABBase64ListEmail;
        return ((iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.verifyAcc);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PsiUploadEncryptContactResponseV2(psiSessionId=");
        sbLIZ.append(this.psiSessionId);
        sbLIZ.append(", bloomFilterBitsBase64=");
        sbLIZ.append(this.bloomFilterBitsBase64);
        sbLIZ.append(", bloomFilterM=");
        sbLIZ.append(this.bloomFilterM);
        sbLIZ.append(", bloomFilterK=");
        sbLIZ.append(this.bloomFilterK);
        sbLIZ.append(", hashABBase64List=");
        sbLIZ.append(this.hashABBase64List);
        sbLIZ.append(", bloomFilterBitsBase64Email=");
        sbLIZ.append(this.bloomFilterBitsBase64Email);
        sbLIZ.append(", bloomFilterMEmail=");
        sbLIZ.append(this.bloomFilterMEmail);
        sbLIZ.append(", bloomFilterKEmail=");
        sbLIZ.append(this.bloomFilterKEmail);
        sbLIZ.append(", hashABBase64ListEmail=");
        sbLIZ.append(this.hashABBase64ListEmail);
        sbLIZ.append(", verifyAcc=");
        sbLIZ.append(this.verifyAcc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PsiUploadEncryptContactResponseV2 initIfReflectByGson() {
        List<byte[]> list;
        byte[] bArrDecode;
        ArrayList arrayList;
        List<byte[]> list2;
        byte[] bArrDecode2;
        ArrayList arrayList2;
        if (this.hashABList == null) {
            List<String> list3 = this.hashABBase64List;
            if (list3 != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator<String> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Base64.decode(it2.next(), 2));
                }
            } else {
                arrayList2 = new ArrayList();
            }
            this.hashABList = arrayList2;
        }
        if (this.bloomFilterBits == null) {
            String str = this.bloomFilterBitsBase64;
            if ((str == null || str.length() == 0) && (list2 = this.hashABList) != null && list2.size() == 0) {
                bArrDecode2 = new byte[0];
            } else {
                String str2 = this.bloomFilterBitsBase64;
                if (str2 == null) {
                    str2 = "";
                }
                bArrDecode2 = Base64.decode(str2, 2);
            }
            this.bloomFilterBits = bArrDecode2;
        }
        if (this.hashABListEmail == null) {
            List<String> list4 = this.hashABBase64ListEmail;
            if (list4 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list4, 10));
                Iterator<String> it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList.add(Base64.decode(it3.next(), 2));
                }
            } else {
                arrayList = new ArrayList();
            }
            this.hashABListEmail = arrayList;
        }
        if (this.bloomFilterBitsEmail == null) {
            String str3 = this.bloomFilterBitsBase64Email;
            if ((str3 == null || str3.length() == 0) && (list = this.hashABListEmail) != null && list.size() == 0) {
                bArrDecode = new byte[0];
            } else {
                String str4 = this.bloomFilterBitsBase64Email;
                bArrDecode = Base64.decode(str4 != null ? str4 : "", 2);
            }
            this.bloomFilterBitsEmail = bArrDecode;
        }
        return this;
    }

    public final byte[] getBloomFilterBits() {
        return this.bloomFilterBits;
    }

    public final String getBloomFilterBitsBase64() {
        return this.bloomFilterBitsBase64;
    }

    public final String getBloomFilterBitsBase64Email() {
        return this.bloomFilterBitsBase64Email;
    }

    public final byte[] getBloomFilterBitsEmail() {
        return this.bloomFilterBitsEmail;
    }

    public final long getBloomFilterK() {
        return this.bloomFilterK;
    }

    public final long getBloomFilterKEmail() {
        return this.bloomFilterKEmail;
    }

    public final long getBloomFilterM() {
        return this.bloomFilterM;
    }

    public final long getBloomFilterMEmail() {
        return this.bloomFilterMEmail;
    }

    public final List<String> getHashABBase64List() {
        return this.hashABBase64List;
    }

    public final List<String> getHashABBase64ListEmail() {
        return this.hashABBase64ListEmail;
    }

    public final List<byte[]> getHashABList() {
        return this.hashABList;
    }

    public final List<byte[]> getHashABListEmail() {
        return this.hashABListEmail;
    }

    public final String getPsiSessionId() {
        return this.psiSessionId;
    }

    public final boolean getVerifyAcc() {
        return this.verifyAcc;
    }

    public final void setBloomFilterBits(byte[] bArr) {
        this.bloomFilterBits = bArr;
    }

    public final void setBloomFilterBitsEmail(byte[] bArr) {
        this.bloomFilterBitsEmail = bArr;
    }

    public final void setHashABList(List<byte[]> list) {
        this.hashABList = list;
    }

    public final void setHashABListEmail(List<byte[]> list) {
        this.hashABListEmail = list;
    }

    public PsiUploadEncryptContactResponseV2(String str, String str2, long j, long j2, List<String> list, String str3, long j3, long j4, List<String> list2, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.psiSessionId = str;
        this.bloomFilterBitsBase64 = str2;
        this.bloomFilterM = j;
        this.bloomFilterK = j2;
        this.hashABBase64List = list;
        this.bloomFilterBitsBase64Email = str3;
        this.bloomFilterMEmail = j3;
        this.bloomFilterKEmail = j4;
        this.hashABBase64ListEmail = list2;
        this.verifyAcc = z;
        this.bloomFilterBits = Base64.decode(str2 == null ? "" : str2, 2);
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Base64.decode(it2.next(), 2));
            }
        } else {
            arrayList = new ArrayList();
        }
        this.hashABList = arrayList;
        String str4 = this.bloomFilterBitsBase64Email;
        this.bloomFilterBitsEmail = Base64.decode(str4 != null ? str4 : "", 2);
        List<String> list3 = this.hashABBase64ListEmail;
        if (list3 != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator<String> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Base64.decode(it3.next(), 2));
            }
        } else {
            arrayList2 = new ArrayList();
        }
        this.hashABListEmail = arrayList2;
    }
}
