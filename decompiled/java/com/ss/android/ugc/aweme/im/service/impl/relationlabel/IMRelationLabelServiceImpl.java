package com.ss.android.ugc.aweme.im.service.impl.relationlabel;

import X.C069P;
import X.C1336205Ku;
import X.C15519065t;
import X.EnumC1725606pK;
import X.InterfaceC1364105Vn;
import X.InterfaceC15516065q;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMRelationLabelInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IMRelationLabelService;

/* JADX INFO: loaded from: classes3.dex */
public final class IMRelationLabelServiceImpl implements IMRelationLabelService {
    @Override // com.ss.android.ugc.aweme.im.contacts.api.service.IMRelationLabelService
    public final boolean LIZ() {
        Integer numLJIILIIL = C1336205Ku.LIZ(false).getImPrivacySettings().LJIILIIL("following");
        return numLJIILIIL == null || numLJIILIIL.intValue() != 1;
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.service.IMRelationLabelService
    public final void clearCache() {
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LIZJ().LJ(EnumC1725606pK.IM_RELATION_LABEL);
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.service.IMRelationLabelService
    public final IMRelationLabelInfo LIZIZ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || LIZ()) {
            return null;
        }
        IMContactApi.LIZ.getClass();
        InterfaceC15516065q interfaceC15516065qLIZJ = C069P.LIZ().LIZJ();
        EnumC1725606pK enumC1725606pK = EnumC1725606pK.IM_RELATION_LABEL;
        return (IMRelationLabelInfo) interfaceC15516065qLIZJ.LJFF(enumC1725606pK, str, null, enumC1725606pK.getAllowUsingLocalStaleValue(), false);
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.service.IMRelationLabelService
    public final Object LIZJ(String str, InterfaceC1364105Vn<? super IMRelationLabelInfo> interfaceC1364105Vn) {
        boolean z;
        long jLongValue;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (LIZ()) {
            clearCache();
            return null;
        }
        IMRelationLabelInfo iMRelationLabelInfoLIZIZ = LIZIZ(str);
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(str, null, "im_local_db");
        if (iMUserLJIIL == null) {
            return null;
        }
        if (iMUserLJIIL.getFollowStatus() != 0 && iMUserLJIIL.getFollowStatus() != -1) {
            return iMRelationLabelInfoLIZIZ;
        }
        if (iMRelationLabelInfoLIZIZ == null) {
            return LIZLLL(str, null, interfaceC1364105Vn);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = iMRelationLabelInfoLIZIZ.updateTime;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jCurrentTimeMillis - jLongValue <= ((Number) C15519065t.LIZ.getValue()).longValue()) {
            return iMRelationLabelInfoLIZIZ;
        }
        return LIZLLL(str, iMRelationLabelInfoLIZIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r7, com.ss.android.ugc.aweme.im.contacts.api.model.IMRelationLabelInfo r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.contacts.api.model.IMRelationLabelInfo> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C15518065s
            if (r0 == 0) goto L22
            r5 = r9
            X.065s r5 = (X.C15518065s) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r0 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILZ
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L28
            com.ss.android.ugc.aweme.im.contacts.api.model.IMRelationLabelInfo r8 = r5.LL
            goto L4e
        L22:
            X.065s r5 = new X.065s
            r5.<init>(r6, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r0)
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ     // Catch: java.lang.Exception -> L54
            r0.getClass()     // Catch: java.lang.Exception -> L54
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()     // Catch: java.lang.Exception -> L54
            X.065q r2 = r0.LIZJ()     // Catch: java.lang.Exception -> L54
            X.06pK r1 = X.EnumC1725606pK.IM_RELATION_LABEL     // Catch: java.lang.Exception -> L54
            r5.LL = r8     // Catch: java.lang.Exception -> L54
            r5.LLILZ = r3     // Catch: java.lang.Exception -> L54
            r0 = 0
            java.lang.Object r0 = r2.LIZIZ(r1, r7, r0, r5)     // Catch: java.lang.Exception -> L54
            if (r0 != r4) goto L51
            return r4
        L4e:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> L54
        L51:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMRelationLabelInfo r0 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMRelationLabelInfo) r0     // Catch: java.lang.Exception -> L54
            return r0
        L54:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.impl.relationlabel.IMRelationLabelServiceImpl.LIZLLL(java.lang.String, com.ss.android.ugc.aweme.im.contacts.api.model.IMRelationLabelInfo, X.05Vn):java.lang.Object");
    }
}
