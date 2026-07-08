package com.ss.android.ugc.aweme.pipo.ccdc;

import X.AbstractC905603gM;
import X.C098200Yq;
import X.C0WZX;
import X.C13LQ;
import X.C1701330uNH;
import X.C1712140uei;
import X.C1712160uek;
import X.C1712180uem;
import X.C1712190uen;
import X.C1713370ugh;
import X.C1715420uk0;
import X.C1716050ul1;
import X.C1716090ul5;
import X.C1716190ulF;
import X.C1717770unn;
import X.C1722550uvV;
import X.C1723700uxM;
import X.C1723790uxV;
import X.C1723840uxa;
import X.C1723850uxb;
import X.C1723860uxc;
import X.C1723880uxe;
import X.C1723890uxf;
import X.C1723900uxg;
import X.C1858707Pt;
import X.C189200o6;
import X.C1954807lC;
import X.C19EG;
import X.C2188811AlT;
import X.C2197108jB;
import X.C2204961BRm;
import X.C600570Nh1;
import X.C600670NhB;
import X.C905103gH;
import X.EnumC202057144h;
import X.InterfaceC1063710dmr;
import X.InterfaceC1294060jmO;
import X.InterfaceC1722230uuz;
import X.InterfaceC1722540uvU;
import X.InterfaceC202062144m;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import co5.d;
import co5.g;
import co5.h;
import co5.i;
import com.bytedance.android.ecommerce.ocr.view.OcrActivity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pipo.ocr.view.CardOcrActivity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.ccdc.internal.IMicroblinkOcrService;
import com.ss.android.ugc.aweme.pipo.ccdc.internal.IPIPOClientAIOcrService;
import com.ss.android.ugc.aweme.pipo.ccdc.libra.PipoAndroidCcdcOcrImplementControlModel;
import com.ss.android.ugc.aweme.pipo.ccdc.libra.PipoClientCCDCScanControlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jv6.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS14S2000000_12;
import kotlin.jvm.internal.AwS40S0000100_26;
import kotlin.jvm.internal.Intrinsics;
import oo5.b;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoCcdcServiceImpl implements IPipoCcdcService {
    public final boolean LIZ = Intrinsics.LJFF(C1717770unn.LJIIIIZZ().getCurrentRegionCode().toLowerCase(Locale.ROOT), FollowStatusChangeMethod.PARAM_UID);
    public boolean LIZIZ;
    public boolean LIZJ;

    @Override // com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService
    public final void LJI() {
        this.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService
    public final List<Class<? extends InterfaceC1063710dmr>> provideXBridgetIDLMethodList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1723790uxV.class);
        arrayList.add(C600570Nh1.class);
        arrayList.add(C1716090ul5.class);
        arrayList.add(C1716190ulF.class);
        arrayList.add(C1713370ugh.class);
        arrayList.add(C1712160uek.class);
        arrayList.add(C1712140uei.class);
        arrayList.add(C1712180uem.class);
        arrayList.add(C1712190uen.class);
        return arrayList;
    }

    public static IPIPOClientAIOcrService LJIILL() {
        if (!C1717770unn.LJFF().checkPluginInstalled("com.ss.android.ugc.aweme.df_pipo_bnpl")) {
            return null;
        }
        a.install(C1717770unn.LIZJ().getApplicationContext());
        return (IPIPOClientAIOcrService) PluggableExtentionKt.pluggableSpi$default(IPIPOClientAIOcrService.class, false, false, false, 14, null);
    }

    public static boolean LJIIZILJ() {
        IMicroblinkOcrService iMicroblinkOcrService;
        SettingsManager.LIZLLL().getClass();
        return !SettingsManager.LIZ("ccdc_ocr_microblink_verify_settings", true) || ((iMicroblinkOcrService = (IMicroblinkOcrService) PluggableExtentionKt.pluggableSpi$default(IMicroblinkOcrService.class, false, false, false, 14, null)) != null && iMicroblinkOcrService.LIZJ());
    }

    @Override // com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService
    public final void LIZLLL() {
        Object c098200Yq;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            PipoAndroidCcdcOcrImplementControlModel pipoAndroidCcdcOcrImplementControlModel = C600670NhB.LIZ;
            PipoAndroidCcdcOcrImplementControlModel pipoAndroidCcdcOcrImplementControlModel2 = (PipoAndroidCcdcOcrImplementControlModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_android_ccdc_ocr_implement_control", PipoAndroidCcdcOcrImplementControlModel.class, pipoAndroidCcdcOcrImplementControlModel);
            if (pipoAndroidCcdcOcrImplementControlModel2 != null) {
                pipoAndroidCcdcOcrImplementControlModel = pipoAndroidCcdcOcrImplementControlModel2;
            }
            if (!pipoAndroidCcdcOcrImplementControlModel.useMicroblinkOcr || LJIJ()) {
                return;
            }
            InterfaceC202062144m interfaceC202062144m = new InterfaceC202062144m() { // from class: X.0uxU
                public final /* synthetic */ Function1<Boolean, Unit> LIZIZ = null;

                @Override // X.InterfaceC202062144m
                public final void onFailed() {
                    Function1<Boolean, Unit> function1 = this.LIZIZ;
                    if (function1 != null) {
                        function1.invoke(Boolean.FALSE);
                    }
                    C1717770unn.LJFF().LIZLLL().LIZ("com.ss.android.ugc.aweme.df_ccdc_impl_ocr", false);
                }

                @Override // X.InterfaceC202062144m
                public final void onSuccess() {
                    this.LIZ.getClass();
                    boolean zInstall = a.install(C1717770unn.LIZJ().getApplicationContext());
                    Function1<Boolean, Unit> function1 = this.LIZIZ;
                    if (function1 != null) {
                        function1.invoke(Boolean.valueOf(zInstall));
                    }
                    C1717770unn.LJFF().LIZLLL().LIZ("com.ss.android.ugc.aweme.df_ccdc_impl_ocr", zInstall);
                }
            };
            C1717770unn.LJFF().LJIILL(new C1723700uxM("com.ss.android.ugc.aweme.df_ccdc_impl_ocr", EnumC202057144h.REPLACE), interfaceC202062144m);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public final boolean LJIJ() {
        if (!C1717770unn.LJFF().checkPluginInstalled("com.ss.android.ugc.aweme.df_ccdc_impl_ocr")) {
            return false;
        }
        if (!this.LIZJ) {
            this.LIZJ = a.install(C1717770unn.LIZJ().getApplicationContext());
        }
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService
    public final boolean LIZJ() {
        return this.LIZ;
    }

    public static boolean LJIILJJIL(String str) {
        try {
            if (str.length() == 0) {
                return true;
            }
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            PipoClientCCDCScanControlModel pipoClientCCDCScanControlModel = C1858707Pt.LIZ;
            PipoClientCCDCScanControlModel pipoClientCCDCScanControlModel2 = (PipoClientCCDCScanControlModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_client_ccdc_ocr_switch", PipoClientCCDCScanControlModel.class, pipoClientCCDCScanControlModel);
            if (pipoClientCCDCScanControlModel2 != null) {
                pipoClientCCDCScanControlModel = pipoClientCCDCScanControlModel2;
            }
            return pipoClientCCDCScanControlModel.enabledEnterFromList.contains(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                return true;
            }
            throw new C2197108jB();
        }
    }

    public static boolean LJIILLIIL(String str) {
        IPIPOClientAIOcrService iPIPOClientAIOcrServiceLJIILL;
        if (!C600670NhB.LIZ(str).useClientAIOcr || (iPIPOClientAIOcrServiceLJIILL = LJIILL()) == null || !iPIPOClientAIOcrServiceLJIILL.LJ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService
    public final void LJ(Activity activity) {
        Intent intent = new Intent("android.settings.NFC_SETTINGS");
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CA3zEj9snpxJUYw3+mDgmgU+I8I87iKqcJ", null));
    }

    @Override // com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService
    public final boolean LJFF(String str) {
        if (!LJIILJJIL(str) || !C600670NhB.LIZ(str).useMicroblinkOcr || this.LIZIZ || !LJIJ() || !LJIIZILJ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService
    public final void LJII(String str) {
        IPIPOClientAIOcrService iPIPOClientAIOcrServiceLJIILL;
        if (LJIILJJIL(str) && C600670NhB.LIZ(str).useClientAIOcr && (iPIPOClientAIOcrServiceLJIILL = LJIILL()) != null) {
            iPIPOClientAIOcrServiceLJIILL.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService
    public final boolean LJIIIZ(String str) {
        if (!LJIILJJIL(str)) {
            return false;
        }
        PipoAndroidCcdcOcrImplementControlModel pipoAndroidCcdcOcrImplementControlModelLIZ = C600670NhB.LIZ(str);
        if ((pipoAndroidCcdcOcrImplementControlModelLIZ.useBytedanceOcr && TextUtils.equals(str, "tts")) || LJIILLIIL(str)) {
            return true;
        }
        if (!pipoAndroidCcdcOcrImplementControlModelLIZ.useMicroblinkOcr || this.LIZIZ || !LJIJ() || !LJIIZILJ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService
    public final boolean LJIIJ(String str) {
        if (!LJIILJJIL(str)) {
            return false;
        }
        if (C600670NhB.LIZ(str).useClientAIOcr) {
            LJII(str);
        }
        if (C600670NhB.LIZ(str).useMicroblinkOcr && LJIJ()) {
            try {
                IMicroblinkOcrService iMicroblinkOcrService = (IMicroblinkOcrService) PluggableExtentionKt.pluggableSpi$default(IMicroblinkOcrService.class, false, false, false, 14, null);
                if (iMicroblinkOcrService == null) {
                    return false;
                }
                if (!iMicroblinkOcrService.LIZJ()) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService
    public final boolean LJIIJJI(String str) {
        return C600670NhB.LIZ(str).showOcrResult;
    }

    @Override // com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService
    public final boolean LJIIL(Context context) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    @Override // com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ(android.content.Context r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.ccdc.PipoCcdcServiceImpl.LJIIIIZZ(android.content.Context, java.lang.String):boolean");
    }

    public static final void LJIJI(C1716050ul1 c1716050ul1, String str, String str2) throws JSONException {
        c1716050ul1.LIZIZ("rd_pipo_ocr_jsb_call", new AwS14S2000000_12(str, str2, 0));
    }

    @Override // com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService
    public final void LIZIZ(C1723850uxb c1723850uxb, InterfaceC1722230uuz interfaceC1722230uuz, Map<String, ? extends Object> map) {
        AbstractC905603gM abstractC905603gM;
        PipoAndroidCcdcOcrImplementControlModel pipoAndroidCcdcOcrImplementControlModelLIZ = C600670NhB.LIZ(c1723850uxb.LJIIIIZZ);
        boolean zLJIILLIIL = LJIILLIIL(c1723850uxb.LJIIIIZZ);
        boolean zLJIJ = LJIJ();
        boolean zLJIIZILJ = LJIIZILJ();
        if (zLJIILLIIL) {
            IPIPOClientAIOcrService iPIPOClientAIOcrService = (IPIPOClientAIOcrService) PluggableExtentionKt.pluggableSpi$default(IPIPOClientAIOcrService.class, false, false, false, 14, null);
            if (iPIPOClientAIOcrService != null) {
                iPIPOClientAIOcrService.LJFF(C1723840uxa.LIZ(c1723850uxb, null, interfaceC1722230uuz, 511), map);
                return;
            }
            return;
        }
        if (pipoAndroidCcdcOcrImplementControlModelLIZ.useMicroblinkOcr && zLJIJ && !this.LIZIZ && zLJIIZILJ) {
            IMicroblinkOcrService iMicroblinkOcrService = (IMicroblinkOcrService) PluggableExtentionKt.pluggableSpi$default(IMicroblinkOcrService.class, false, false, false, 14, null);
            if (iMicroblinkOcrService == null) {
                return;
            }
            if (c1723850uxb.LIZIZ) {
                abstractC905603gM = C1723900uxg.LIZIZ;
            } else if (C13LQ.LJIILJJIL(2, c1723850uxb.LIZ)) {
                abstractC905603gM = C905103gH.LIZIZ;
            } else {
                abstractC905603gM = C1723890uxf.LIZIZ;
            }
            iMicroblinkOcrService.LIZIZ(abstractC905603gM, interfaceC1722230uuz, c1723850uxb.LJIIIIZZ, map);
            return;
        }
        interfaceC1722230uuz.LIZ(0, 103, C1717770unn.LIZJ().getApplicationContext().getString(2131834217), null, "unknown");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0uvT] */
    @Override // com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService
    public final C1722550uvV LJIILIIL(C19EG c19eg, LifecycleOwner lifecycleOwner, InterfaceC1722540uvU interfaceC1722540uvU) {
        return new C1722550uvV(c19eg, lifecycleOwner, new InterfaceC1722540uvU(interfaceC1722540uvU) { // from class: X.0uvT
            public final InterfaceC1722540uvU LIZ;
            public final C1716050ul1 LIZIZ = new C1716050ul1(null);
            public long LIZJ = 0;

            @Override // X.InterfaceC1722540uvU
            public final void LIZJ() throws JSONException {
                this.LIZJ = System.currentTimeMillis();
                this.LIZIZ.LIZIZ("rd_pipo_emv_nfc_start", null);
                this.LIZ.LIZJ();
            }

            {
                this.LIZ = interfaceC1722540uvU;
            }

            @Override // X.InterfaceC1722540uvU
            public final void LIZ(C897203f0 c897203f0) throws JSONException {
                long j = -1;
                if (this.LIZJ != 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
                    if (jCurrentTimeMillis >= 0) {
                        j = jCurrentTimeMillis;
                    }
                    this.LIZJ = 0L;
                }
                this.LIZIZ.LIZIZ("rd_pipo_emv_nfc_success", new AwS40S0000100_26(j, 3));
                this.LIZ.LIZ(c897203f0);
            }

            @Override // X.InterfaceC1722540uvU
            public final void LIZIZ(List<String> list) {
                Object c098200Yq;
                try {
                    this.LIZ.LIZIZ(list);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }

            @Override // X.InterfaceC1722540uvU
            public final void onError(int i) throws JSONException {
                long j = -1;
                if (this.LIZJ != 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
                    if (jCurrentTimeMillis >= 0) {
                        j = jCurrentTimeMillis;
                    }
                    this.LIZJ = 0L;
                }
                this.LIZIZ.LIZIZ("rd_pipo_emv_nfc_error", new C1212270heT(j, i));
                this.LIZ.onError(i);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService
    @InterfaceC1294060jmO
    public final void LIZ(C1723860uxc c1723860uxc, AbstractC905603gM abstractC905603gM, final InterfaceC1722230uuz interfaceC1722230uuz, String str, String str2, Map<String, ? extends Object> map) throws JSONException {
        String str3;
        boolean z;
        d dVar;
        int iIntValue;
        Intent intent;
        C1723850uxb c1723850uxbLIZ;
        C1716050ul1 c1716050ul1 = new C1716050ul1(null);
        String str4 = "";
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        PipoAndroidCcdcOcrImplementControlModel pipoAndroidCcdcOcrImplementControlModelLIZ = C600670NhB.LIZ(str3);
        if ((str != null || !C600670NhB.LIZ(str3).useMicroblinkOcr) && !Intrinsics.LJFF(str, "microblink")) {
            z = false;
        } else {
            z = true;
        }
        boolean zLJIILLIIL = LJIILLIIL(str3);
        boolean zLJIJ = LJIJ();
        boolean zLJIIZILJ = LJIIZILJ();
        LJIJI(c1716050ul1, str2, "start");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enable_");
        sbLIZ.append(z);
        LJIJI(c1716050ul1, str2, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("enable_");
        sbLIZ2.append(zLJIJ);
        LJIJI(c1716050ul1, str2, C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("enable_");
        sbLIZ3.append(this.LIZIZ);
        LJIJI(c1716050ul1, str2, C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("enable_");
        sbLIZ4.append(zLJIIZILJ);
        LJIJI(c1716050ul1, str2, C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("enable_clientai_");
        sbLIZ5.append(zLJIILLIIL);
        LJIJI(c1716050ul1, str2, C2188811AlT.LIZIZ(sbLIZ5));
        if (zLJIILLIIL) {
            LJIJI(c1716050ul1, str2, "use_clientai_ocr");
            IPIPOClientAIOcrService iPIPOClientAIOcrService = (IPIPOClientAIOcrService) PluggableExtentionKt.pluggableSpi$default(IPIPOClientAIOcrService.class, false, false, false, 14, null);
            if (iPIPOClientAIOcrService != null) {
                if (Intrinsics.LJFF(abstractC905603gM, C905103gH.LIZIZ) || Intrinsics.LJFF(abstractC905603gM, C1723880uxe.LIZIZ)) {
                    c1723850uxbLIZ = C1715420uk0.LIZ();
                } else if (Intrinsics.LJFF(abstractC905603gM, C1723900uxg.LIZIZ)) {
                    c1723850uxbLIZ = C1715420uk0.LIZ;
                } else if (Intrinsics.LJFF(abstractC905603gM, C1723890uxf.LIZIZ)) {
                    c1723850uxbLIZ = C1715420uk0.LIZIZ;
                } else {
                    throw new C1954807lC();
                }
                if (str2 != null) {
                    str4 = str2;
                }
                iPIPOClientAIOcrService.LJFF(C1723840uxa.LIZ(c1723850uxbLIZ, str4, interfaceC1722230uuz, 255), map);
                return;
            }
            return;
        }
        if (z && zLJIJ && !this.LIZIZ && zLJIIZILJ) {
            LJIJI(c1716050ul1, str2, "use_microblink");
            IMicroblinkOcrService iMicroblinkOcrService = (IMicroblinkOcrService) PluggableExtentionKt.pluggableSpi$default(IMicroblinkOcrService.class, false, false, false, 14, null);
            if (iMicroblinkOcrService == null) {
                return;
            }
            iMicroblinkOcrService.LIZIZ(abstractC905603gM, interfaceC1722230uuz, str2, map);
            return;
        }
        if (pipoAndroidCcdcOcrImplementControlModelLIZ.useBytedanceOcr && c1723860uxc != null) {
            LJIJI(c1716050ul1, str2, "use_legacy_ocr");
            b bVar = b.LJIJJLI;
            if (Intrinsics.LJFF(abstractC905603gM, C905103gH.LIZIZ)) {
                dVar = i.LIZIZ;
            } else if (Intrinsics.LJFF(abstractC905603gM, C1723880uxe.LIZIZ) || Intrinsics.LJFF(abstractC905603gM, C1723900uxg.LIZIZ) || Intrinsics.LJFF(abstractC905603gM, C1723890uxf.LIZIZ)) {
                dVar = h.LIZIZ;
            } else {
                throw new C1954807lC();
            }
            eo5.b bVar2 = new eo5.b() { // from class: X.0uxX
                @Override // eo5.b
                public final void LIZ(int i, int i2, String str5, g gVar, String str6) {
                    C1715400ujy c1715400ujy;
                    String str7 = str5;
                    InterfaceC1722230uuz interfaceC1722230uuz2 = interfaceC1722230uuz;
                    if (Intrinsics.LJFF(str7, "user cancel") || Intrinsics.LJFF(str7, "manually input")) {
                        str7 = null;
                    }
                    if (gVar == null) {
                        c1715400ujy = null;
                    } else {
                        c1715400ujy = new C1715400ujy(gVar.LIZIZ, null, null, null, null, null, gVar.LIZLLL, gVar.LJIIIIZZ, 130878);
                    }
                    interfaceC1722230uuz2.LIZ(i, i2, str7, c1715400ujy, str6);
                }
            };
            bVar.getClass();
            b.LJIILJJIL = "pitaya";
            b.LJIILL = "pitaya";
            b.LJIILLIIL = null;
            b.LJIIIIZZ = dVar;
            Integer num = c1723860uxc.LIZLLL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            b.LJIIL = iIntValue;
            b.LJIIZILJ = true;
            b.LJIILJJIL = b.LJ(iIntValue);
            if (b.LIZIZ) {
                if (!TextUtils.isEmpty(b.LIZ.LIZIZ)) {
                    b.LJII = bVar2;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("startBankCardOcr: merchantUserId is ");
                    sbLIZ6.append(c1723860uxc.LIZIZ);
                    sbLIZ6.append(" nonce is ");
                    sbLIZ6.append(c1723860uxc.LIZJ);
                    C2188811AlT.LIZIZ(sbLIZ6);
                    if (b.LJI) {
                        bVar.LIZ(0, 102, "The ocr service is running, please do not repeat it!", null, "unknown");
                        return;
                    }
                    Application application = b.LIZ.LIZ;
                    b.LJI = true;
                    b.LIZJ = c1723860uxc.LIZ;
                    b.LIZLLL = c1723860uxc.LIZIZ;
                    String str5 = c1723860uxc.LJII;
                    if (str5 != null) {
                        b.LJIJJ = str5;
                    }
                    String str6 = c1723860uxc.LIZJ;
                    if (str6 != null && str6.length() > 0) {
                        b.LJ = c1723860uxc.LIZJ;
                    }
                    String str7 = c1723860uxc.LJI;
                    if (str7 != null && str7.length() != 0) {
                        String str8 = c1723860uxc.LJI;
                        b.LJIJI = System.currentTimeMillis();
                        b.LJFF = str8;
                    }
                    try {
                        String str9 = c1723860uxc.LJFF;
                        if (str9 != null && str9.length() != 0 && !TextUtils.equals(str9, CardStruct.IStatusCode.DEFAULT)) {
                            intent = new Intent(application, (Class<?>) CardOcrActivity.class);
                            intent.putExtra("showSecurityTips", c1723860uxc.LJ);
                        } else {
                            intent = new Intent(application, (Class<?>) OcrActivity.class);
                        }
                        intent.setFlags(268435456);
                        b.LIZIZ(application, intent);
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        bVar.LIZ(0, 103, "error to start ocr activity:" + th.getMessage(), null, "unknown");
                        return;
                    }
                }
                throw new IllegalArgumentException("please configure host in init");
            }
            throw new IllegalArgumentException("please init first");
        }
        LJIJI(c1716050ul1, str2, "fail_unknown");
        interfaceC1722230uuz.LIZ(0, 103, C1717770unn.LIZJ().getApplicationContext().getString(2131834217), null, "unknown");
    }
}
