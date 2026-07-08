package com.ss.android.ugc.aweme.aigc;

import X.AbstractC1552040qUU;
import X.C01GW;
import X.C0LOK;
import X.C0VSJ;
import X.C0VSZ;
import X.C15438062q;
import X.C1551950qUL;
import X.C1552050qUV;
import X.C2188811AlT;
import X.C2273261DyO;
import X.C444920HcY;
import X.C452501pT;
import X.C530500KrI;
import X.C546820LcW;
import X.C547140Ld2;
import X.C572530Mct;
import X.C580750Mq9;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC546090LbL;
import android.content.res.Resources;
import android.text.SpannableString;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aikit.api.common.AIResourceService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class AIResourceServiceImpl implements AIResourceService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(173));
    public final ConcurrentHashMap<InterfaceC546090LbL, Map<Integer, String>> LIZIZ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIResourceService
    public final String LIZ(C530500KrI c530500KrI) {
        boolean z;
        boolean z2;
        String absolutePath = null;
        if (c530500KrI instanceof C530500KrI) {
            String str = c530500KrI.LIZ;
            String str2 = c530500KrI.LIZIZ;
            boolean z3 = true;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (str2.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    C844470XAv.LIZ.getClass();
                    C0VSZ c0vsz = new C0VSZ(C844470XAv.LIZ(), (String) this.LIZ.getValue());
                    try {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append('/');
                        sbLIZ.append(str2);
                        String strLIZIZ = c0vsz.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                        if (strLIZIZ != null && strLIZIZ.length() != 0) {
                            z3 = false;
                        }
                        if (z3) {
                            C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("gecko bundlePath is null or empty, channel: ");
                            sbLIZ2.append(str);
                            sbLIZ2.append(", file: ");
                            sbLIZ2.append(str2);
                            c547140Ld2.LIZIZ("AIResourceServiceImpl", C2188811AlT.LIZIZ(sbLIZ2), null);
                        } else {
                            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                            if (c0vsj.exists() && c0vsj.isFile()) {
                                C547140Ld2 c547140Ld22 = C546820LcW.LIZIZ;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("gecko file exist: ");
                                sbLIZ3.append(c0vsj.getAbsolutePath());
                                c547140Ld22.LIZ("AIResourceServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
                                absolutePath = c0vsj.getAbsolutePath();
                            } else {
                                C547140Ld2 c547140Ld23 = C546820LcW.LIZIZ;
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("gecko file not exist: ");
                                sbLIZ4.append(c0vsj.getAbsolutePath());
                                c547140Ld23.LIZIZ("AIResourceServiceImpl", C2188811AlT.LIZIZ(sbLIZ4), null);
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C547140Ld2 c547140Ld24 = C546820LcW.LIZIZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("getGeckoFilePath error, channel: ");
                            sbLIZ5.append(str);
                            sbLIZ5.append(", file: ");
                            sbLIZ5.append(str2);
                            sbLIZ5.append(", error: ");
                            sbLIZ5.append(th);
                            c547140Ld24.LIZIZ("AIResourceServiceImpl", C2188811AlT.LIZIZ(sbLIZ5), null);
                        } catch (Throwable th2) {
                            try {
                                c0vsz.LIZJ();
                                throw th2;
                            } finally {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                        }
                    }
                    try {
                        c0vsz.LIZJ();
                        return absolutePath;
                    } catch (Throwable th22) {
                        return absolutePath;
                    }
                }
            }
            C546820LcW.LIZIZ.LIZIZ("AIResourceServiceImpl", "gecko channel or fileRelativePath is empty", null);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIResourceService
    public final void LIZIZ(final List<String> list) {
        C1551950qUL c1551950qULLJIILL = C1552050qUV.LJIILL();
        HashMap map = new HashMap();
        Object value = this.LIZ.getValue();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new CheckRequestBodyModel.TargetChannel(it2.next()));
        }
        map.put(value, arrayList);
        AbstractC1552040qUU abstractC1552040qUU = new AbstractC1552040qUU() { // from class: X.0Mcs
            @Override // X.AbstractC1552040qUU
            public final void LJIIJJI(UpdatePackage updatePackage, Throwable th) {
                C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onDownloadFail: channels ");
                sbLIZ.append(list);
                sbLIZ.append(", e ");
                sbLIZ.append(th);
                c547140Ld2.LIZIZ("AIResourceServiceImpl", C2188811AlT.LIZIZ(sbLIZ), null);
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIL(long j, UpdatePackage updatePackage) {
                C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onUpdateSuccess: channels ");
                sbLIZ.append(list);
                sbLIZ.append(", version ");
                sbLIZ.append(j);
                c547140Ld2.LIZ("AIResourceServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setChannelUpdatePriority(3);
        optionCheckUpdateParams.setListener(abstractC1552040qUU);
        if (c1551950qULLJIILL != null) {
            c1551950qULLJIILL.LIZ("", map, optionCheckUpdateParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIResourceService
    public final String LIZJ(String str) {
        String strLIZ = C2273261DyO.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://roma_redirect/?spark_page=asset-ecosystem-inapp-content&slug=");
        sbLIZ.append(str);
        sbLIZ.append("&locale=");
        sbLIZ.append(strLIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJI(int i, Object... objArr) {
        try {
            C844470XAv.LIZ.getClass();
            return C844470XAv.LIZ().getString(i, Arrays.copyOf(objArr, objArr.length));
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get string fail: ");
            sbLIZ.append(i);
            c547140Ld2.LIZIZ("AIResourceServiceImpl", C2188811AlT.LIZIZ(sbLIZ), e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIResourceService
    public final SpannableString LJ(String str, List list) {
        int iIntValue;
        SpannableString spannableString = new SpannableString(str);
        for (C572530Mct c572530Mct : (ArrayList) list) {
            int iLJJJ = a0.LJJJ(str, c572530Mct.LIZ, 0, false, 6);
            C786410Ut5.p2(spannableString, new C580750Mq9(c572530Mct, 1), iLJJJ, c572530Mct.LIZ.length() + iLJJJ, 17);
            Integer num = c572530Mct.LIZJ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 62;
            }
            C786410Ut5.p2(spannableString, new C444920HcY(iIntValue, false), iLJJJ, c572530Mct.LIZ.length() + iLJJJ, 17);
        }
        return spannableString;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIResourceService
    public final void LJFF(C0LOK c0lok, Map map) {
        this.LIZIZ.put(c0lok, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIResourceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZLLL(X.InterfaceC546090LbL r8, int r9, java.lang.Object... r10) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.AIResourceServiceImpl.LIZLLL(X.0LbL, int, java.lang.Object[]):java.lang.String");
    }
}
