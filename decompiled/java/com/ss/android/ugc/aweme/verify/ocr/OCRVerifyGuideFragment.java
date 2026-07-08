package com.ss.android.ugc.aweme.verify.ocr;

import X.C1548870qPN;
import X.C1714660uim;
import X.C19EG;
import X.C2097608Jq;
import X.C723850SaN;
import X.InterfaceC1548890qPP;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class OCRVerifyGuideFragment extends BaseVerifyFragment implements InterfaceC1548890qPP {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMpOyY1HELIOSMWsjKj19BwYeHyohISM1Djo6LCAKOy40JSAiPQ==";

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment
    public final String UR() {
        return "ocr_verification_guide";
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment
    public final int ZR() {
        return R.layout.i7f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r8.isEmpty() == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, X.InterfaceC21503819Do
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tv() {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.verify.ocr.OCRVerifyGuideFragment.tv():void");
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        OCRVerifyViewModel.LLJ = null;
        new C1548870qPN().LJI("close_ocr_verify_guide", this);
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS268S0000000_26.get$arr$(482));
        new C1548870qPN().LJFF("close_ocr_verify_guide", this);
        if (bundle != null && Intrinsics.LJFF(OCRVerifyViewModel.LLJ, Boolean.TRUE)) {
            OCRVerifyViewModel.LLJ = null;
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // X.InterfaceC1548890qPP
    public final void onEvent(String str, String str2) {
        C19EG activity;
        if (Intrinsics.LJFF(str, "close_ocr_verify_guide") && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        boolean z = false;
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 273), 3);
        if (bundle != null) {
            C1714660uim c1714660uimVR = VR();
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("page_id", "ocr_verification_guide");
            if (SR() == null) {
                z = true;
            }
            pairArr[1] = new Pair("extra", String.valueOf(z));
            C2097608Jq.LJIIJ(pairArr);
            c1714660uimVR.LIZ("rd_pipo_page_recreate", null);
        }
    }
}
