package com.ss.android.ugc.aweme.minis.page.main.fragment;

import X.C013C;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1002690cCR;
import X.C1017903yT;
import X.C1153280g7K;
import X.C1284660jXE;
import X.C1547430qN3;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1A6Y;
import X.C20533215Wg;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2195191Avl;
import X.C2195221Avo;
import X.C2196211AxP;
import X.C2196361Axe;
import X.C2196371Axf;
import X.C2196701AyC;
import X.C2197011Ayh;
import X.C2200821BBo;
import X.C2249001D0w;
import X.C418440Gaw;
import X.C634060Otw;
import X.C688120Qyw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.C960203pA;
import X.EnumC1386450mBP;
import X.EnumC2192711Arl;
import X.EnumC2196421Axk;
import X.EnumC2196901AyW;
import X.InterfaceC1378810lz5;
import X.InterfaceC1386440mBO;
import X.InterfaceC1395520mQ2;
import X.InterfaceC20660615sy;
import X.InterfaceC2196591Ay1;
import X.InterfaceC2197251Az5;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS597S0100000_18;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes35.dex */
public class MinisDeprecatedFragment extends BaseFragment implements InterfaceC20660615sy, InterfaceC1395520mQ2, InterfaceC1386440mBO, InterfaceC1378810lz5 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZjUtLip9JSHELIOSQlJ2E1OiQrJCo9PGsBICE6OwEpOT02KyQ4LCsVOiQrJCo9PA==";
    public C2196371Axf LLIZ;
    public EnumC1386450mBP LLIZLLLIL;
    public final C1002690cCR LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final C2196211AxP LLJILJIL;
    public View LLJILJILJ;
    public final List<Function0<Unit>> LLJILLL;
    public final C2249001D0w LLJJ;

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(87));
    }

    @Override // X.InterfaceC1378810lz5
    public final void Kr() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1378810lz5
    public final void So() {
        int i = C2187451AjH.LIZ;
        UR(false);
        ZR();
    }

    public final void ZR() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initMetaData, hasMatchedSparkViewCache:");
        sbLIZ.append(false);
        C2188811AlT.LIZIZ(sbLIZ);
        C2195191Avl c2195191Avl = new C2195191Avl(EnumC2196421Axk.META_LOAD, false);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            new LinkedHashMap().putAll(schemaParserData.LIZLLL());
        }
        this.LLIZLLLIL = null;
        aS(true);
        c2195191Avl.setStartTime(System.currentTimeMillis());
        C2196371Axf c2196371Axf = this.LLIZ;
        if (c2196371Axf != null) {
            c2196371Axf.recordStage(c2195191Avl);
        }
    }

    @Override // X.InterfaceC1395520mQ2
    public final boolean ct() {
        return this.LLJILJIL.LIZ;
    }

    public MinisDeprecatedFragment() {
        new HashMap();
        this.LLJ = new C1002690cCR();
        this.LLJIJIL = true;
        this.LLJILJIL = new C2196211AxP();
        this.LLJILLL = new ArrayList();
        this.LLJJ = new C2249001D0w(this, 0);
        new InterfaceC2197251Az5() { // from class: X.1Ays
            @Override // X.InterfaceC2197251Az5
            public final void LIZ(boolean z) {
                if (z) {
                    this.LIZ.getClass();
                }
            }
        };
    }

    public final Activity WR() {
        if (!isAdded() || isDetached() || getActivity() == null) {
            return null;
        }
        return getActivity();
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return C634060Otw.LIZ(this);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        Context contextWR = WR();
        if (contextWR == null) {
            C844470XAv.LIZ.getClass();
            contextWR = C844470XAv.LIZ();
        }
        return new C688120Qyw(contextWR, this, null);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy, isWebEntryPageLoadFinished:");
        sbLIZ.append(false);
        C2188811AlT.LIZIZ(sbLIZ);
        if (PopupManager.LJI() && WR() != null) {
            PopupManager.LJIILJJIL();
        }
        C1153280g7K c1153280g7KLIZJ = this.LLJILJIL.LIZJ(null);
        C1547430qN3 c1547430qN3 = C1547430qN3.LIZ;
        EnumC1386450mBP enumC1386450mBP = this.LLIZLLLIL;
        c1547430qN3.getClass();
        C1547430qN3.LJIIIZ(null, null, null, enumC1386450mBP, c1153280g7KLIZJ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJ.LJFF(false);
        this.LLJJ.LJ();
        ((ArrayList) this.LLJILLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPause, isWebEntryPageLoadFinished:");
        sbLIZ.append(false);
        sbLIZ.append(", isFragmentVisibleForAds:");
        sbLIZ.append(false);
        C2188811AlT.LIZIZ(sbLIZ);
        Activity activityWR = WR();
        if (activityWR != null && (activityWR instanceof InterfaceC2196591Ay1)) {
            C2196211AxP c2196211AxP = this.LLJILJIL;
            Activity activityWR2 = WR();
            Window window = activityWR2 != null ? activityWR2.getWindow() : null;
            c2196211AxP.getClass();
            if (window != null) {
                window.clearFlags(8192);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume, isWebEntryPageLoadFinished:");
        sbLIZ.append(false);
        sbLIZ.append(", isActivityFirstResumeFinished:");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", isFragmentVisibleForAds:");
        sbLIZ.append(false);
        C2188811AlT.LIZIZ(sbLIZ);
        Activity activityWR = WR();
        if (activityWR == null) {
            return;
        }
        View view = getView();
        if (view != null) {
            C1A6Y.LIZIZ(view, false);
        }
        if (activityWR instanceof InterfaceC2196591Ay1) {
            C2195221Avo.LJIIIIZZ(WR());
            C2195221Avo.LJIIJ(this);
            C2196211AxP c2196211AxP = this.LLJILJIL;
            Activity activityWR2 = WR();
            c2196211AxP.LJFF(activityWR2 != null ? activityWR2.getWindow() : null, !c2196211AxP.LIZ);
            this.LLJI = true;
        }
    }

    @Override // X.InterfaceC1378810lz5
    public final String BQ() {
        return null;
    }

    @Override // X.InterfaceC1378810lz5
    public final EnumC1386450mBP pv() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1378810lz5
    public final void DN(String str) {
        if (str.length() == 0) {
            return;
        }
        int i = C2187451AjH.LIZ;
        uA(EnumC1386450mBP.ERROR_CANNOT_OPEN_MINIS, 201, null);
    }

    @Override // X.InterfaceC1395520mQ2
    public final void LE(boolean z) {
        Window window;
        C2196211AxP c2196211AxP = this.LLJILJIL;
        Activity activityWR = WR();
        if (activityWR != null) {
            window = activityWR.getWindow();
        } else {
            window = null;
        }
        c2196211AxP.LJFF(window, z);
    }

    public final void SR(EnumC2196901AyW enumC2196901AyW) {
        if (this.LLIZLLLIL == null) {
            C2197011Ayh.LIZ.getClass();
            C2197011Ayh.LJI();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - 0;
        C2196701AyC.LIZ.getClass();
        C2196701AyC.LJII(enumC2196901AyW, jCurrentTimeMillis, null);
    }

    public final void UR(boolean z) {
        C2196371Axf c2196371Axf = new C2196371Axf(false, false, false, false, -1, C1017903yT.LIZ(), EnumC2192711Arl.MINIS_STAGE_PROD, new HashMap(), 0L, 0L, 0L, 0L, null, null);
        this.LLIZ = c2196371Axf;
        c2196371Axf.setFlowStartTime(System.currentTimeMillis());
        C2196371Axf c2196371Axf2 = this.LLIZ;
        if (c2196371Axf2 != null) {
            c2196371Axf2.setRetry(z);
        }
        JSONArray jSONArray = C2196361Axe.LIZ;
        C2196361Axe.LIZLLL(null);
        C2196361Axe.LJIIJ(null);
        this.LLJIJIL = true;
    }

    public final void VR(boolean z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceResetTheme, dark:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (WR() != null) {
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
            boolean z2 = !z;
            tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(z2);
            tuxImmersionBarLIZLLL.LIZIZ.LJII(z2);
            tuxImmersionBarLIZLLL.LIZLLL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aS(boolean r11) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.page.main.fragment.MinisDeprecatedFragment.aS(boolean):void");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (WR() != null) {
            C013C c013c = new C013C();
            c013c.element = !C960203pA.LIZIZ(r0);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setCustomTheme, isLightTheme:");
            sbLIZ.append(c013c.element);
            C2188811AlT.LIZIZ(sbLIZ);
            NR(new AwS597S0100000_18(c013c, 1077));
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/minis/page/main/fragment/MinisDeprecatedFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehbZbdkiIup8KOOCryrpYUNFCQr7u9i+KqtycW3RT/bTEfbmwxfXaLMt9guf7W2g==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setUserVisibleHint, isVisibleToUser:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(getClass());
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1A6Y.LIZJ(view, false);
        Iterator it2 = ((ArrayList) this.LLJILLL).iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
        ((ArrayList) this.LLJILLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(getLayoutInflater(), R.layout.jc, viewGroup, false);
        this.LLJILJILJ = viewTd;
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.InterfaceC1386440mBO
    public final void uA(EnumC1386450mBP enumC1386450mBP, int i, Map<String, String> map) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisLoadError, ");
        sbLIZ.append(enumC1386450mBP);
        sbLIZ.append(", monitorCode:");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLIZLLLIL = enumC1386450mBP;
        aS(true);
        if (this.LLJIJIL) {
            C2196371Axf c2196371Axf = this.LLIZ;
            if (c2196371Axf != null) {
                c2196371Axf.setResult(false, i);
            }
            JSONArray jSONArray = C2196361Axe.LIZ;
            C2196361Axe.LJII(this.LLIZ, null, null);
            C2196361Axe.LJI(this.LLIZ, null);
            this.LLJIJIL = false;
        }
    }
}
