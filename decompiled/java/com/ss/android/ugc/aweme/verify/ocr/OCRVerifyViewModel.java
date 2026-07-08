package com.ss.android.ugc.aweme.verify.ocr;

import X.C098200Yq;
import X.C1202420hOa;
import X.C1713570uh1;
import X.C1714660uim;
import X.C1714950ujF;
import X.C1715380ujw;
import X.C1715400ujy;
import X.C1715420uk0;
import X.C1715450uk3;
import X.C1776150wJx;
import X.C189200o6;
import X.C23250099c;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1722230uuz;
import android.hardware.camera2.CameraManager;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;
import com.ss.android.ugc.aweme.verify.ocr.OCRVerifyViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS16S0002000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes27.dex */
public final class OCRVerifyViewModel extends AssemViewModel<C1715450uk3> {
    public static C1715400ujy LLILZLL;
    public static Integer LLIZ;
    public static Integer LLIZLLLIL;
    public static Boolean LLJ;
    public static boolean LLJI;
    public static boolean LLJIJIL;
    public static boolean LLJILJIL;
    public C1713570uh1 LL;
    public C1714950ujF LLILLJJLI;
    public C1714660uim LLILLL;
    public String LLILZ;
    public final C1776150wJx LLILZIL = new C1776150wJx(CoroutineExceptionHandler.LJJLIL, this, 4);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1715450uk3(LLIZ, LLIZLLLIL, 57);
    }

    public final void wQ2() {
        Object c098200Yq;
        String str;
        IPipoCcdcService iPipoCcdcService;
        VerifyDetail verifyDetailLJIIIIZZ;
        Map<String, String> map;
        try {
            c098200Yq = ((CameraManager) C786410Ut5.G2(C1202420hOa.LIZ(), "camera")).getCameraIdList();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String[] strArr = (String[]) c098200Yq;
        if (strArr == null) {
            strArr = new String[0];
        }
        if (strArr.length == 0) {
            C1714660uim c1714660uim = this.LLILLL;
            if (c1714660uim != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("reason", "camera_not_available");
                c1714660uim.LIZ("fp_sdk_bnpl_ocr_verify_fail_start", linkedHashMap);
            }
            vQ2("camera_not_available");
            return;
        }
        C1713570uh1 c1713570uh1 = this.LL;
        if (c1713570uh1 == null || (verifyDetailLJIIIIZZ = c1713570uh1.LJIIIIZZ()) == null || (map = verifyDetailLJIIIIZZ.abTestInfo) == null || (str = map.get("ocr_type")) == null) {
            str = "microblink";
        }
        this.LLILZ = str;
        if (!Intrinsics.LJFF(str, "microblink") || ((iPipoCcdcService = (IPipoCcdcService) PluggableExtentionKt.pluggableSpi$default(IPipoCcdcService.class, false, false, false, 14, null)) != null && iPipoCcdcService.LJFF("ocr_verify"))) {
            IPipoCcdcService iPipoCcdcService2 = (IPipoCcdcService) PluggableExtentionKt.pluggableSpi$default(IPipoCcdcService.class, false, false, false, 14, null);
            if (iPipoCcdcService2 != null) {
                iPipoCcdcService2.LIZIZ(C1715420uk0.LIZ, new InterfaceC1722230uuz() { // from class: X.0ujz
                    @Override // X.InterfaceC1722230uuz
                    public final void LIZ(int i, int i2, String str2, C1715400ujy c1715400ujy, String str3) {
                        OCRVerifyViewModel.LLILZLL = c1715400ujy;
                        OCRVerifyViewModel.LLIZ = Integer.valueOf(i);
                        OCRVerifyViewModel.LLIZLLLIL = Integer.valueOf(i2);
                        this.LIZ.setState(new AwS16S0002000_26(i, i2, 4));
                    }
                }, null);
                return;
            }
            return;
        }
        C1714660uim c1714660uim2 = this.LLILLL;
        if (c1714660uim2 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("reason", "ocr_kernel_not_ready");
            c1714660uim2.LIZ("fp_sdk_bnpl_ocr_verify_fail_start", linkedHashMap2);
        }
        vQ2("microblink_not_ready");
    }

    public final void vQ2(String str) {
        setState(AFwS268S0000000_26.get$arr$(483));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1715380ujw(this, str, null), 3);
    }
}
