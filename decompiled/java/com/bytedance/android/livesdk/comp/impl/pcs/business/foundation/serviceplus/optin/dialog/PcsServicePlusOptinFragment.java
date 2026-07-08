package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.dialog;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0QSJ;
import X.C1106750euH;
import X.C1139904d3;
import X.C1142504dT;
import X.C1217500hmu;
import X.C1217530hmx;
import X.C1217540hmy;
import X.C1218480hoU;
import X.C1218490hoV;
import X.C1218560hoc;
import X.C127G;
import X.C13LE;
import X.C1440005kM;
import X.C1548820qPI;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1822120xW6;
import X.C1822200xWE;
import X.C1822240xWI;
import X.C1822260xWK;
import X.C1824070xZF;
import X.C1826730xdX;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C262100zr;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C517510KRh;
import X.C517520KRi;
import X.C520010KaN;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1141530foN;
import X.InterfaceC1146704e9;
import X.InterfaceC1555100qZQ;
import X.InterfaceC214902198i;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC517590KRp;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsController;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.ability.IPcsServiceOptInTargetPageAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.dialog.PcsServicePlusOptinFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.viewmodel.PcsServicePlusOptinVM;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServicePlusOptinFragment extends BaseFragment implements InterfaceC1141530foN, C0QSJ, InterfaceC1146704e9 {
    public static final C1822120xW6 LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLSHELIOS4nISoiZzw2OjMlKiojJDA/ZyAjPCwiZys6KSkjLmEDKzYfLD0lISYpGSMmOwo8PSY9DjctLiI2JjE=";
    public PcsServicePlusOptinPageParams LL = new PcsServicePlusOptinPageParams("", "", "", 0, "", new HashMap());
    public final int LLILLJJLI = 1008;
    public final AssemVMLazy LLILLL;
    public C1822260xWK LLILZ;
    public C127G LLILZIL;
    public IPcsServiceOptInTargetPageAbility LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServicePlusOptinFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/optin/viewmodel/PcsServicePlusOptinVM;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = new C1822120xW6();
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == IPcsServiceOptInTargetPageAbility.class) {
            this.LLILZLL = (IPcsServiceOptInTargetPageAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PcsServicePlusOptinScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == IPcsServiceOptInTargetPageAbility.class) {
            return this.LLILZLL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PcsServicePlusOptinScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PcsServicePlusOptinScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == IPcsServiceOptInTargetPageAbility.class) {
            this.LLILZLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public PcsServicePlusOptinFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServicePlusOptinVM.class);
        C1217530hmx c1217530hmx = new C1217530hmx(c19719912DlLIZ);
        C1217540hmy c1217540hmy = new C1217540hmy();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1217530hmx, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C1218480hoU(this), c1217540hmy, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1217530hmx, new C1218560hoc(this), c1217540hmy, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1217530hmx, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1218490hoV(this), c1217540hmy, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLL = assemVMLazy;
    }

    public final C1822260xWK OR() {
        if (this.LLILZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C1822260xWK.class, null);
            this.LLILZ = interfaceC1555100qZQLIZIZ != null ? (C1822260xWK) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILZ;
    }

    public final PcsServicePlusOptinVM PR() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (PcsServicePlusOptinVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void NR() {
        if (getParentFragment() instanceof InterfaceC214902198i) {
            ((InterfaceC214902198i) getParentFragment()).finish();
        } else if (this instanceof InterfaceC214902198i) {
            ((InterfaceC214902198i) this).finish();
        } else {
            C520010KaN.LIZLLL(this);
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLILZIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLILZIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PcsServicePlusOptinVM.class, new Function0(this) { // from class: X.0xWF
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String str = PcsServicePlusOptinFragment._pnsPageId;
                            return new PcsServicePlusOptinVM(new C518720KVy(C1807670x8n.LJJIIJZLJL()), new C1822230xWH());
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLILZIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1440005kM.LIZ(new IEvent() { // from class: X.0KWq
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams2;
        super.onDestroyView();
        C1548820qPI.LJIIIIZZ("smb_optin_process_ended", this);
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            int i = PR().LLILZIL;
            Pair[] pairArr = new Pair[3];
            C1822260xWK c1822260xWKOR = OR();
            String str = null;
            pairArr[0] = new Pair("has_load_assem", c1822260xWKOR != null ? Boolean.valueOf(c1822260xWKOR.LLILZ).toString() : null);
            C1822260xWK c1822260xWKOR2 = OR();
            pairArr[1] = new Pair("is_saf", (c1822260xWKOR2 == null || (pcsServicePlusOptinPageParams2 = c1822260xWKOR2.LLILLJJLI) == null) ? null : pcsServicePlusOptinPageParams2.getExtra().get("is_saf"));
            C1822260xWK c1822260xWKOR3 = OR();
            if (c1822260xWKOR3 != null && (pcsServicePlusOptinPageParams = c1822260xWKOR3.LLILLJJLI) != null) {
                str = pcsServicePlusOptinPageParams.getExtra().get("launch_duration");
            }
            pairArr[2] = new Pair("launch_duration", str);
            interfaceC517590KRpLIZJ.LJIIJJI(new C517520KRi(i, C2097608Jq.LJIIJ(pairArr)));
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "smb_optin_process_ended")) {
            NR();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PR().LLILLL = C1558360qeg.LJFF(this, null);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C1822260xWK(new C1822240xWI(this), this.LL, new C1822200xWE(this)), C1822260xWK.class, "source_default_key");
        PR().LLILZIL = hashCode();
        long jCurrentTimeMillis = 0;
        try {
            String str = this.LL.getExtra().get("launch_time");
            if (str != null) {
                long j = CastLongProtector.parseLong(str);
                if (j != 0) {
                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LL.getExtra().put("launch_duration", String.valueOf(jCurrentTimeMillis));
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJIIIIZZ("ServiceOptIn", new C517510KRh(PR().LLILZIL, this.LLILLJJLI, this.LL.getShowEntrance(), C2097608Jq.LJIIJ(new Pair("is_saf", this.LL.getExtra().get("is_saf")), new Pair("launch_duration", String.valueOf(jCurrentTimeMillis)))));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1548820qPI.LIZLLL("smb_optin_process_ended", this);
        C723850SaN.LIZ(this, false, null, new C1142504dT(this), 3);
        C723850SaN.LIZ(this, false, null, new C1139904d3(this), 3);
        C723850SaN.LIZ(this, false, null, new C1217500hmu(this), 3);
        PR().xQ2(this.LL.getShowEntrance());
        if (!C1824070xZF.LIZ(getContext())) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowInsetsController insetsController = requireActivity().getWindow().getInsetsController();
                if (insetsController != null) {
                    insetsController.setSystemBarsAppearance(8, 8);
                }
            } else {
                requireActivity().getWindow().getDecorView().setSystemUiVisibility(requireActivity().getWindow().getDecorView().getSystemUiVisibility() | 8192);
            }
        }
        C1106750euH.LIZ.LIZ("/webcast/sub/upsell/one_stop_shop_setup/info/", C2097608Jq.LJ());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gkx, viewGroup, false);
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
}
