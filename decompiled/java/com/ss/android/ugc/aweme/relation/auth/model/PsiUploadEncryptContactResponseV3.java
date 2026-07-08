package com.ss.android.ugc.aweme.relation.auth.model;

import X.C09CT;
import X.C09DE;
import X.C15438062q;
import X.C20164913vD;
import X.C2188811AlT;
import X.C786410Ut5;
import android.util.Base64;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class PsiUploadEncryptContactResponseV3 extends BaseResponse {

    @C09CT("phone_hash_a_b")
    public final List<String> hashABBase64List;

    @C09CT("email_hash_a_b")
    public final List<String> hashABBase64ListEmail;

    @C09DE
    public transient List<byte[]> hashABList;

    @C09DE
    public transient List<byte[]> hashABListEmail;

    @C09CT("matched_res")
    public final Map<String, PsiUploadEncryptContactMatchedData> matchRes;

    @C09DE
    public transient Map<String, C20164913vD> matchResBloom = new LinkedHashMap();

    @C09CT("log_id")
    public final String psiSessionId;

    @C09CT("verify_acc")
    public final boolean verifyAcc;

    public final PsiUploadEncryptContactResponseV3 copy(String str, Map<String, PsiUploadEncryptContactMatchedData> map, List<String> list, List<String> list2, boolean z) {
        return new PsiUploadEncryptContactResponseV3(str, map, list, list2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PsiUploadEncryptContactResponseV3)) {
            return false;
        }
        PsiUploadEncryptContactResponseV3 psiUploadEncryptContactResponseV3 = (PsiUploadEncryptContactResponseV3) obj;
        return Intrinsics.LJFF(this.psiSessionId, psiUploadEncryptContactResponseV3.psiSessionId) && Intrinsics.LJFF(this.matchRes, psiUploadEncryptContactResponseV3.matchRes) && Intrinsics.LJFF(this.hashABBase64List, psiUploadEncryptContactResponseV3.hashABBase64List) && Intrinsics.LJFF(this.hashABBase64ListEmail, psiUploadEncryptContactResponseV3.hashABBase64ListEmail) && this.verifyAcc == psiUploadEncryptContactResponseV3.verifyAcc;
    }

    public int hashCode() {
        int iHashCode = ((this.psiSessionId.hashCode() * 31) + this.matchRes.hashCode()) * 31;
        List<String> list = this.hashABBase64List;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.hashABBase64ListEmail;
        return ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.verifyAcc);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PsiUploadEncryptContactResponseV3(psiSessionId=");
        sbLIZ.append(this.psiSessionId);
        sbLIZ.append(", matchRes=");
        sbLIZ.append(this.matchRes);
        sbLIZ.append(", hashABBase64List=");
        sbLIZ.append(this.hashABBase64List);
        sbLIZ.append(", hashABBase64ListEmail=");
        sbLIZ.append(this.hashABBase64ListEmail);
        sbLIZ.append(", verifyAcc=");
        sbLIZ.append(this.verifyAcc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PsiUploadEncryptContactResponseV3 initIfReflectByGson() {
        byte[] bArrDecode;
        List<byte[]> list;
        byte[] bArrDecode2;
        List<byte[]> list2;
        ArrayList arrayList;
        ArrayList arrayList2;
        this.matchResBloom = new LinkedHashMap();
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
        for (Map.Entry<String, PsiUploadEncryptContactMatchedData> entry : this.matchRes.entrySet()) {
            String str = entry.getValue().bloomFilterBitsBase64;
            if ((str == null || str.length() == 0) && (list2 = this.hashABList) != null && list2.size() == 0) {
                bArrDecode = new byte[0];
            } else {
                String str2 = entry.getValue().bloomFilterBitsBase64;
                if (str2 == null) {
                    str2 = "";
                }
                bArrDecode = Base64.decode(str2, 2);
            }
            String str3 = entry.getValue().bloomFilterBitsBase64Email;
            if ((str3 == null || str3.length() == 0) && (list = this.hashABListEmail) != null && list.size() == 0) {
                bArrDecode2 = new byte[0];
            } else {
                String str4 = entry.getValue().bloomFilterBitsBase64Email;
                bArrDecode2 = Base64.decode(str4 != null ? str4 : "", 2);
            }
            this.matchResBloom.put(entry.getKey(), new C20164913vD(bArrDecode, bArrDecode2));
        }
        return this;
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

    public final Map<String, PsiUploadEncryptContactMatchedData> getMatchRes() {
        return this.matchRes;
    }

    public final Map<String, C20164913vD> getMatchResBloom() {
        return this.matchResBloom;
    }

    public final String getPsiSessionId() {
        return this.psiSessionId;
    }

    public final boolean getVerifyAcc() {
        return this.verifyAcc;
    }

    public final void setHashABList(List<byte[]> list) {
        this.hashABList = list;
    }

    public final void setHashABListEmail(List<byte[]> list) {
        this.hashABListEmail = list;
    }

    public final void setMatchResBloom(Map<String, C20164913vD> map) {
        this.matchResBloom = map;
    }

    public PsiUploadEncryptContactResponseV3(String str, Map<String, PsiUploadEncryptContactMatchedData> map, List<String> list, List<String> list2, boolean z) {
        this.psiSessionId = str;
        this.matchRes = map;
        this.hashABBase64List = list;
        this.hashABBase64ListEmail = list2;
        this.verifyAcc = z;
    }
}
