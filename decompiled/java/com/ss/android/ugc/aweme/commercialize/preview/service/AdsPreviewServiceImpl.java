package com.ss.android.ugc.aweme.commercialize.preview.service;

import X.C0C47;
import X.C1056540dbI;
import X.C1056630dbR;
import X.C1326830kdF;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LQ;
import X.C20684815ws;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C985403tE;
import X.C997760c4U;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class AdsPreviewServiceImpl implements IAdsPreviewService {
    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final boolean LJ() {
        C1056630dbR.LIZ.getClass();
        C1397510mTF c1397510mTF = C1056630dbR.LIZIZ;
        if (c1397510mTF != null) {
            return c1397510mTF.LJIIIZ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final void LIZIZ(ViewGroup viewGroup) {
        C1056630dbR.LIZ.getClass();
        C1397510mTF c1397510mTF = C1056630dbR.LIZIZ;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
        C1056630dbR.LIZIZ = null;
        View viewFindViewById = viewGroup.findViewById(R.id.aim);
        if (viewFindViewById != null) {
            C786410Ut5.LJJJLZIJ(viewFindViewById, viewGroup);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final void LIZJ(ViewGroup viewGroup) {
        C1056630dbR.LIZ.getClass();
        if (((Boolean) C1056540dbI.LJ.getValue()).booleanValue() && C1056630dbR.LIZIZ == null) {
            return;
        }
        C1397510mTF c1397510mTF = C1056630dbR.LIZIZ;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
        C1056630dbR.LIZIZ = null;
        C786410Ut5.LJJJLZIJ(viewGroup.findViewById(R.id.aim), viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final void LJI(ViewGroup viewGroup) {
        C786410Ut5.LJJJLZIJ(viewGroup.findViewById(R.id.aim), viewGroup);
    }

    public static boolean LJIIIZ(String str, String str2) {
        Keva repo = Keva.getRepo("ads_preview_keva");
        String[] stringArray = repo.getStringArray("preview_ads_list", new String[0]);
        String[] stringArray2 = repo.getStringArray("preview_adids", null);
        String[] stringArray3 = repo.getStringArray("preview_cids", null);
        if ((stringArray2 != null && C13LQ.LJJIJIIJI(str2, stringArray2) < 0) || (stringArray3 != null && C13LQ.LJJIJIIJI(str2, stringArray3) < 0)) {
            return false;
        }
        if (C13LQ.LJJIJIIJI(str2, stringArray) >= 0) {
            return true;
        }
        long j = repo.getLong("preview_timestamp", 0L);
        if (j == 0) {
            return false;
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - j);
        if (minutes <= C0C47.LIZ().validationDurationInMinute) {
            if (Intrinsics.LJFF(str, "adid")) {
                if (C13LQ.LJJIJIIJI(str2, repo.getStringArray("preview_adids", new String[0])) >= 0) {
                    return true;
                }
            } else {
                if (!Intrinsics.LJFF(str, "cid")) {
                    return false;
                }
                if (C13LQ.LJJIJIIJI(str2, repo.getStringArray("preview_cids", new String[0])) >= 0) {
                    return true;
                }
            }
        }
        if (minutes <= C0C47.LIZ().validationDurationInMinute) {
            LJIIJ(repo, str2, stringArray);
        } else if (minutes > 86400 && C13LQ.LJJIJIIJI(str2, stringArray) >= 0) {
            LJIIJ(repo, str2, stringArray);
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final boolean LIZLLL(String str, boolean z) {
        if (!z || str == null) {
            return false;
        }
        List<String> list = AdsPreviewStateManager.LLJILJIL;
        if (list != null && list.contains(str)) {
            return true;
        }
        Keva repo = Keva.getRepo("ads_preview_keva");
        String string = repo.getString("ads_on_demand_preview_cid", "");
        String string2 = repo.getString("ads_on_demand_preview_cid_v2", "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append('|');
        sbLIZ.append(string2);
        if (a0.LJJJ(C2188811AlT.LIZIZ(sbLIZ), str, 0, false, 6) != -1) {
            long j = repo.getLong("ads_on_demand_preview_timestamp", 0L);
            if (j != 0 && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - j) <= 86400) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final boolean LJFF(String str, String str2) {
        if (str != null) {
            List<String> list = AdsPreviewStateManager.LLJI;
            if (list != null && list.contains(str)) {
                return true;
            }
            List<String> list2 = AdsPreviewStateManager.LLJI;
            if ((list2 == null || list2.isEmpty()) && LJIIIZ("adid", str)) {
                return true;
            }
        }
        if (str2 != null) {
            List<String> list3 = AdsPreviewStateManager.LLJIJIL;
            if (list3 != null && list3.contains(str2)) {
                return true;
            }
            List<String> list4 = AdsPreviewStateManager.LLJIJIL;
            if ((list4 == null || list4.isEmpty()) && LJIIIZ("cid", str2)) {
                return true;
            }
        }
        return false;
    }

    public static void LJIIJ(Keva keva, String str, String[] strArr) {
        ArrayList arrayList = (ArrayList) C13LQ.LJLI(strArr);
        if (arrayList.contains(str)) {
            arrayList.remove(str);
        } else {
            arrayList.add(str);
        }
        keva.storeStringArray("preview_ads_list", (String[]) arrayList.toArray(new String[0]));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final void LIZ(Context context, ViewGroup viewGroup, C1326830kdF c1326830kdF) {
        C997760c4U.LIZ(context, viewGroup, c1326830kdF);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(final android.content.Context r11, android.view.ViewGroup r12, X.C0RC0 r13, X.InterfaceC1056640dbS r14) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.preview.service.AdsPreviewServiceImpl.LJIIIIZZ(android.content.Context, android.view.ViewGroup, X.0RC0, X.0dbS):void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final void LJII(Context context, ViewGroup viewGroup, Boolean bool, AwS560S0100000_16 awS560S0100000_16, AwS560S0100000_16 awS560S0100000_162, boolean z) {
        C1056630dbR.LIZ.getClass();
        C997760c4U.LIZ(context, viewGroup, null);
        if (z) {
            C1389890mGx c1389890mGx = new C1389890mGx(viewGroup);
            c1389890mGx.LJIIIZ(2131825218);
            c1389890mGx.LJIIJJI();
        } else {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJFF(2131825219);
            c1397580mTM.LIZ(2131825218);
            C985403tE.LIZ(c1397580mTM, new AwS595S0100000_16(awS560S0100000_162, 441));
            c1397580mTM.LJII = false;
            c1397580mTM.LJ(new AwS595S0100000_16(awS560S0100000_16, 442));
            C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
            C1056630dbR.LIZIZ = c1397510mTF;
            c1397510mTF.LIZLLL();
        }
        if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C20684815ws.onEventV3("ads_interface_preview_ad_successfully");
        }
    }
}
