package com.ss.android.ugc.aweme.portrait.service;

import X.C098200Yq;
import X.C0PEM;
import X.C13LP;
import X.C1889307ad;
import X.C189200o6;
import X.C1902207ci;
import X.C1920107fb;
import X.C201955140j;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2217908mX;
import X.C2296808zG;
import X.C23250099c;
import X.C545870Laz;
import X.C546890Lcd;
import X.C547580Ldk;
import X.C553170Lml;
import X.C556010LrL;
import X.InterfaceC1902607cm;
import X.InterfaceC553240Lms;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aikit.api.create.QuotaCache;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitQuotaServiceImpl implements IAIPortraitQuotaService {
    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitQuotaService
    public final void LIZ(C2217908mX c2217908mX) {
        String str;
        C1902207ci c1902207ci;
        C1889307ad c1889307ad;
        Integer num;
        Integer num2;
        Integer num3;
        String str2;
        Object c098200Yq;
        Integer numLJIIJJI;
        List<String> listLIZ;
        String str3;
        InterfaceC553240Lms interfaceC553240Lms;
        C556010LrL meta;
        C545870Laz c545870Laz = C545870Laz.LIZIZ;
        C201955140j.LIZIZ(c545870Laz.LIZ, "AIPortraitQuotaServiceImpl -> updateQuotaCache");
        InterfaceC1902607cm interfaceC1902607cm = c2217908mX.LIZIZ;
        Integer num4 = null;
        if ((interfaceC1902607cm instanceof InterfaceC553240Lms) && (interfaceC553240Lms = (InterfaceC553240Lms) interfaceC1902607cm) != null && (meta = interfaceC553240Lms.getMeta()) != null) {
            str = meta.LIZIZ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "AIGCWorkflowServerNode")) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C553170Lml(c2217908mX, null), 3);
            return;
        }
        if (c2217908mX.LIZIZ instanceof C1902207ci) {
            String str4 = c545870Laz.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AIPortraitQuotaServiceImpl -> event.event = ");
            sbLIZ.append(c2217908mX.LIZIZ);
            C201955140j.LIZIZ(str4, C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1902607cm interfaceC1902607cm2 = c2217908mX.LIZIZ;
            if (interfaceC1902607cm2 instanceof C1902207ci) {
                c1902207ci = (C1902207ci) interfaceC1902607cm2;
            } else {
                c1902207ci = null;
            }
            int i = 0;
            if (c1902207ci != null && (str2 = c1902207ci.LIZJ) != null) {
                Regex regex = C1920107fb.LIZ;
                try {
                    MatchResult matchResultFind$default = Regex.find$default(C1920107fb.LIZ, str2, 0, 2, null);
                    if (matchResultFind$default != null && (listLIZ = matchResultFind$default.LIZ()) != null && (str3 = (String) C13LP.LJJJLZIJ(1, listLIZ)) != null) {
                        numLJIIJJI = C2095008Iq.LJIIJJI(str3);
                    } else {
                        numLJIIJJI = null;
                    }
                    String strLIZ = C1920107fb.LIZ(str2);
                    if (strLIZ == null) {
                        strLIZ = "";
                    }
                    c098200Yq = new C1889307ad(numLJIIJJI, strLIZ);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = new C1889307ad(0);
                }
                c1889307ad = (C1889307ad) c098200Yq;
            } else {
                c1889307ad = null;
            }
            String str5 = C545870Laz.LIZIZ.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("AIPortraitQuotaServiceImpl -> serverCode = ");
            if (c1889307ad != null) {
                num4 = c1889307ad.LIZ;
            }
            sbLIZ2.append(num4);
            sbLIZ2.append(", ");
            C201955140j.LIZIZ(str5, C2188811AlT.LIZIZ(sbLIZ2));
            C546890Lcd.LIZ.getClass();
            QuotaCache quotaCacheLIZIZ = C546890Lcd.LIZIZ().LIZIZ(Source.AI_PORTRAIT);
            QuotaResult quotaResult = quotaCacheLIZIZ.quotaResult;
            if (quotaResult != null && (num = quotaResult.quota) != null) {
                int iIntValue = num.intValue();
                QuotaResult quotaResult2 = quotaCacheLIZIZ.quotaResult;
                if (quotaResult2 != null && (num2 = quotaResult2.quotaRemain) != null) {
                    int iIntValue2 = num2.intValue();
                    if (c1889307ad == null || (num3 = c1889307ad.LIZ) == null || num3.intValue() != 5) {
                        i = iIntValue2 + 1;
                    }
                    C547580Ldk.LIZJ(Integer.valueOf(iIntValue), Integer.valueOf(i));
                }
            }
        }
    }
}
