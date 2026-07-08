package com.ss.android.ugc.aweme.effectcreator.models;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;

/* JADX INFO: loaded from: classes27.dex */
public final class CKEDraftInfoDeserializer implements j<CKEDraftInfo> {
    public static CKEDraftIconAsset LIZ(n nVar, String str) {
        String strLJIL;
        String strLJIL2;
        Boolean boolValueOf;
        boolean zLJ;
        int iLJIIJJI;
        if (nVar.LJJIJIIJIL(str)) {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            kVarLJJIIZ.getClass();
            if (!(kVarLJJIIZ instanceof m)) {
                try {
                    n nVarLJJIJ = nVar.LJJIJ(str);
                    k kVarLJJIIZ2 = nVarLJJIJ.LJJIIZ("iconPath");
                    if (kVarLJJIIZ2 == null || (strLJIL = kVarLJJIIZ2.LJIL()) == null) {
                        strLJIL = "";
                    }
                    k kVarLJJIIZ3 = nVarLJJIJ.LJJIIZ("iconAssetId");
                    if (kVarLJJIIZ3 == null || (strLJIL2 = kVarLJJIIZ3.LJIL()) == null) {
                        strLJIL2 = "";
                    }
                    k kVarLJJIIZ4 = nVarLJJIJ.LJJIIZ("isIconEffectApplied");
                    Integer numValueOf = null;
                    if (kVarLJJIIZ4 != null) {
                        boolValueOf = Boolean.valueOf(kVarLJJIIZ4.LJ());
                    } else {
                        boolValueOf = null;
                    }
                    k kVarLJJIIZ5 = nVarLJJIJ.LJJIIZ("iconSelectTypeValue");
                    if (kVarLJJIIZ5 != null) {
                        numValueOf = Integer.valueOf(kVarLJJIIZ5.LJIIJJI());
                    }
                    k kVarLJJIIZ6 = nVarLJJIJ.LJJIIZ("isAutoGenIcon");
                    if (kVarLJJIIZ6 != null) {
                        zLJ = kVarLJJIIZ6.LJ();
                    } else {
                        zLJ = true;
                    }
                    k kVarLJJIIZ7 = nVarLJJIJ.LJJIIZ("iconEdit");
                    if (kVarLJJIIZ7 != null) {
                        iLJIIJJI = kVarLJJIIZ7.LJIIJJI();
                    } else {
                        iLJIIJJI = 0;
                    }
                    return new CKEDraftIconAsset(strLJIL, strLJIL2, boolValueOf, numValueOf, zLJ, iLJIIJJI);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return new CKEDraftIconAsset("", "", null, null, true, 0);
                }
            }
        }
        return new CKEDraftIconAsset("", "", null, null, true, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x027b A[Catch: Exception -> 0x02bb, TRY_ENTER, TryCatch #3 {Exception -> 0x02bb, blocks: (B:165:0x0265, B:167:0x026d, B:170:0x0275, B:173:0x027b, B:175:0x0281, B:176:0x0285), top: B:219:0x0237 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x031c A[Catch: Exception -> 0x0330, TRY_LEAVE, TryCatch #0 {Exception -> 0x0330, blocks: (B:190:0x02d9, B:192:0x02df, B:194:0x02ea, B:196:0x0302, B:199:0x0309, B:201:0x0311, B:204:0x0318, B:205:0x031c), top: B:214:0x02d9 }] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    @Override // com.google.gson.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo deserialize(com.google.gson.k r43, java.lang.reflect.Type r44, com.google.gson.i r45) {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoDeserializer.deserialize(com.google.gson.k, java.lang.reflect.Type, com.google.gson.i):java.lang.Object");
    }
}
