package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment;

import X.AbstractC1391920mKE;
import X.C01D1;
import X.C0TVI;
import X.C1097400efC;
import X.C1119170fEJ;
import X.C1121890fIh;
import X.C1148760g02;
import X.C127G;
import X.C1308850kAF;
import X.C1391900mKC;
import X.C1391960mKI;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C13LZ;
import X.C1411040mp4;
import X.C14K9;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1822260xWK;
import X.C1822270xWL;
import X.C1824490xZv;
import X.C1824590xa5;
import X.C1824600xa6;
import X.C1825090xat;
import X.C1825160xb0;
import X.C1825170xb1;
import X.C1825190xb3;
import X.C1825380xbM;
import X.C1826660xdQ;
import X.C1826730xdX;
import X.C1842040y2E;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19ME;
import X.C1A6V;
import X.C20131713pr;
import X.C20133813qC;
import X.C20134113qF;
import X.C21546719Ub;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C259800zU;
import X.C338490DOt;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C497740JfY;
import X.C500060JjI;
import X.C500260Jjc;
import X.C510160Jza;
import X.C517510KRh;
import X.C517520KRi;
import X.C724750Sbp;
import X.C763970Txz;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC517590KRp;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.NavHostFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingLightModeSheetFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes28.dex */
public abstract class PcsOnboardingStepFragment<T extends ViewDataBinding> extends PcsOnboardingLightModeSheetFragment implements IPcsOnboardingBottomFunctionAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public final int LLJLLL = hashCode();
    public final AssemVMLazy LLJZ;
    public C1822260xWK LLJZIJLIL;
    public T LLL;
    public final boolean LLLF;
    public C197039127h LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public String LLLI;
    public C517510KRh LLLII;
    public C127G LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsOnboardingStepFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/onboarding/viewmodel/PcsOnboardingVM;", 0);
        C13LE.LIZ.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public boolean BS() {
        return false;
    }

    public String FS() {
        return null;
    }

    public boolean HS() {
        return false;
    }

    public void PS() {
    }

    public void VS() {
        C1A6V c1a6vLJIIJ;
        SMBOptInStep sMBOptInStep;
        C20131713pr c20131713pr;
        Set setLJLIIL = C13LQ.LJLIIL(new Integer[]{Integer.valueOf(R.id.pl1), Integer.valueOf(R.id.pkz)});
        NavBackStackEntry navBackStackEntryLJIIIZ = NavHostFragment.MR(this).LJIIIZ();
        Integer numValueOf = (navBackStackEntryLJIIIZ == null || (c20131713pr = navBackStackEntryLJIIIZ.LLILLJJLI) == null) ? null : Integer.valueOf(c20131713pr.LLIZLLLIL);
        C20131713pr c20131713prLJFF = NavHostFragment.MR(this).LJFF();
        Integer numValueOf2 = c20131713prLJFF != null ? Integer.valueOf(c20131713prLJFF.LLIZLLLIL) : null;
        if (numValueOf == null || ((setLJLIIL.contains(numValueOf) && C13LP.LJJJJ(numValueOf2, setLJLIIL)) || !uS())) {
            eT();
        } else {
            XS("popBackStack", "", null);
            PcsOnboardingVM pcsOnboardingVMJS = JS();
            List<SMBOptInStep> listLIZJ = C1411040mp4.LIZJ(pcsOnboardingVMJS.getState().LLILZIL, pcsOnboardingVMJS.LLJJIII);
            do {
                int i = pcsOnboardingVMJS.LLJJ;
                if (i <= 0) {
                    break;
                }
                int i2 = i - 1;
                pcsOnboardingVMJS.LLJJ = i2;
                sMBOptInStep = (SMBOptInStep) C13LP.LJJJLZIJ(i2, listLIZJ);
                pcsOnboardingVMJS.LLJILLL = sMBOptInStep;
                if (sMBOptInStep == null) {
                    break;
                }
            } while (sMBOptInStep.isCompleted);
            NavHostFragment.MR(this).LJIIZILJ();
        }
        View view = getView();
        if (view == null || (c1a6vLJIIJ = q0.LJIIJ(view)) == null) {
            return;
        }
        c1a6vLJIIJ.LIZ(8);
    }

    public void eT() {
        XS("close", "", null);
        getParentFragmentManager().LLIIIILZ(Bundle.EMPTY, "pcs_onboarding_close");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility
    public void iR() {
    }

    public boolean yS() {
        return false;
    }

    public abstract int zS();

    public PcsOnboardingStepFragment() {
        AssemVMLazy assemVMLazyLIZ;
        C1825380xbM c1825380xbM = new C1825380xbM();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsOnboardingVM.class);
        C1825090xat c1825090xat = new C1825090xat(c19719912DlLIZ);
        C1825190xb3 c1825190xb3 = new C1825190xb3();
        if (Intrinsics.LJFF(c1825380xbM, C01D1.LIZ)) {
            assemVMLazyLIZ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1825090xat, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C1825160xb0(this), c1825190xb3, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else {
            assemVMLazyLIZ = C451650HnP.LIZ(this, c1825380xbM, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1825090xat, new C1825170xb1(this), c1825190xb3, null, null, null);
        }
        this.LLJZ = assemVMLazyLIZ;
        this.LLLF = true;
    }

    public final C510160Jza ES() {
        ArrayList<C510160Jza> arrayList;
        C500060JjI c500060JjI = this.LLJJIJI;
        if (c500060JjI == null || (arrayList = c500060JjI.LIZ) == null) {
            return null;
        }
        return (C510160Jza) ListProtector.get(arrayList, 0);
    }

    public final C1822260xWK GS() {
        if (this.LLJZIJLIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C1822260xWK.class, null);
            this.LLJZIJLIL = interfaceC1555100qZQLIZIZ != null ? (C1822260xWK) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJZIJLIL;
    }

    public final PcsOnboardingVM JS() {
        AssemVMLazy assemVMLazy = this.LLJZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (PcsOnboardingVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        if (uS()) {
            ArrayList arrayList = new ArrayList();
            C1826660xdQ c1826660xdQ = new C1826660xdQ(R.raw.icon_chevron_left_ltr, new View.OnClickListener(this) { // from class: X.0xax
                public final /* synthetic */ PcsOnboardingStepFragment<T> LL;

                {
                    this.LL = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.LL.VS();
                }
            });
            c1826660xdQ.LIZLLL = C497740JfY.LIZJ(R.attr.fy3);
            c1826660xdQ.LJ = true;
            arrayList.add(c1826660xdQ);
            c1119170fEJ.LJ = arrayList;
        }
        if (yS()) {
            ArrayList arrayList2 = new ArrayList();
            C1826660xdQ c1826660xdQ2 = new C1826660xdQ(R.raw.icon_x_mark, new View.OnClickListener(this) { // from class: X.0xay
                public final /* synthetic */ PcsOnboardingStepFragment<T> LL;

                {
                    this.LL = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.LL.eT();
                }
            });
            c1826660xdQ2.LIZLLL = C497740JfY.LIZJ(R.attr.fy3);
            c1826660xdQ2.LJ = true;
            arrayList2.add(c1826660xdQ2);
            c1119170fEJ.LJFF = arrayList2;
        }
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.intro.TuxPanel] */
    public final void gT() {
        final C259800zU c259800zU = new C259800zU();
        this.LLLFF = null;
        C1391960mKI c1391960mKI = new C1391960mKI();
        c1391960mKI.LIZ = true;
        c1391960mKI.LJII = getString(2131836446);
        c1391960mKI.LJIIIIZZ = getString(2131836444);
        c1391960mKI.LJIIJ = C13LQ.LJJLL(new AbstractC1391920mKE[]{new C1391900mKC(getString(2131836442), null, null, false, new CompoundButton.OnCheckedChangeListener() { // from class: X.0xZx
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ViewGroup viewGroup;
                TuxPanel tuxPanel = c259800zU.element;
                View view = null;
                if (tuxPanel != null) {
                    view = tuxPanel.getView();
                }
                if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                    ArrayList arrayList = new ArrayList();
                    C1824670xaD.LIZ(viewGroup, C197039127h.class, arrayList);
                    C197039127h c197039127h = (C197039127h) C13LP.LJJJLL(arrayList);
                    if (c197039127h != null) {
                        c197039127h.setEnabled(z);
                    }
                }
            }
        })});
        final PcsOnboardingStatefulStepFragment pcsOnboardingStatefulStepFragment = (PcsOnboardingStatefulStepFragment) this;
        c1391960mKI.LIZIZ(getString(2131836443), new C1824490xZv(pcsOnboardingStatefulStepFragment, c259800zU));
        ?? r2 = c1391960mKI.LIZ().LIZ;
        r2.LLJI = true;
        r2.LLJIJIL = true;
        r2.LLJILJIL = false;
        c259800zU.element = r2;
        r2.show(getParentFragmentManager(), "DMStatus");
        ((Fragment) c259800zU.element).getViewLifecycleOwnerLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: X.0xZw
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ViewGroup viewGroup;
                String str;
                if (obj == null) {
                    PcsOnboardingStepFragment<T> pcsOnboardingStepFragment = pcsOnboardingStatefulStepFragment;
                    if (pcsOnboardingStepFragment.LLLFF == null) {
                        String showEntrance = pcsOnboardingStepFragment.JS().DQ2().getShowEntrance();
                        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(pcsOnboardingStatefulStepFragment.JS().EQ2())));
                        String strLQ2 = pcsOnboardingStatefulStepFragment.JS().LQ2();
                        boolean zLJJJI2 = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(pcsOnboardingStatefulStepFragment.JS().EQ2())));
                        if (Intrinsics.LJFF(pcsOnboardingStatefulStepFragment.JS().LLJJIJIIJIL, "recommended")) {
                            str = "showcase_selection_page";
                        } else {
                            str = "multisku_selection_page";
                        }
                        C1824200xZS.LIZLLL(zLJJJI ? 1 : 0, showEntrance, zLJJJI2 ? 1 : 0, strLQ2, str, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(pcsOnboardingStatefulStepFragment.JS().EQ2()))) ? 1 : 0, "close");
                        return;
                    }
                }
                View view = c259800zU.element.getView();
                if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                C1824670xaD.LIZ(viewGroup, C197039127h.class, arrayList);
                C197039127h c197039127h = (C197039127h) C13LP.LJJJLL(arrayList);
                if (c197039127h == null) {
                    return;
                }
                c197039127h.setEnabled(pcsOnboardingStatefulStepFragment.JS().LLIZ);
            }
        });
    }

    public final T wS() {
        T t = this.LLL;
        if (t != null) {
            return t;
        }
        "Fragment binding is only available between onCreateView and onDestroyView.".toString();
        throw new IllegalArgumentException("Fragment binding is only available between onCreateView and onDestroyView.");
    }

    public final void NS() {
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new Runnable(this) { // from class: X.0xap
                public final /* synthetic */ PcsOnboardingStepFragment<T> LL;

                {
                    this.LL = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PcsOnboardingStepFragment@3925.hideBottomFunctionView$1");
                    try {
                        PcsOnboardingLightModeSheetFragment pcsOnboardingLightModeSheetFragment = this.LL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsOnboardingStepFragment.LLLIIIIL;
                        C0KWG c0kwg = pcsOnboardingLightModeSheetFragment.LLJJI;
                        if (c0kwg != null) {
                            int visibility = c0kwg.getVisibility();
                            c0kwg.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility, 8, c0kwg);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PcsOnboardingStepFragment@3925.hideBottomFunctionView$1");
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLIIII;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLIIII;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PcsOnboardingVM.class, new Function0(this) { // from class: X.0xaw
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsOnboardingStepFragment.LLLIIIIL;
                            return new PcsOnboardingVM(new C518640KVq(C1807670x8n.LJJIIJZLJL()));
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLLIIII = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public void hT() {
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new Runnable(this) { // from class: X.0xaq
                public final /* synthetic */ PcsOnboardingStepFragment<T> LL;

                {
                    this.LL = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PcsOnboardingStepFragment@3925.showBottomFunctionView$1");
                    try {
                        PcsOnboardingLightModeSheetFragment pcsOnboardingLightModeSheetFragment = this.LL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsOnboardingStepFragment.LLLIIIIL;
                        C0KWG c0kwg = pcsOnboardingLightModeSheetFragment.LLJJI;
                        if (c0kwg != null) {
                            int visibility = c0kwg.getVisibility();
                            c0kwg.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility, 0, c0kwg);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PcsOnboardingStepFragment@3925.showBottomFunctionView$1");
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.LLLFFI) {
            return;
        }
        C1148760g02 c1148760g02 = JS().LLJJJIL;
        if (c1148760g02 != null) {
            C1097400efC.LIZJ(c1148760g02);
            JS().LLJJJIL = null;
        }
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IPcsOnboardingBottomFunctionAbility.class, null);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.LLL = null;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility
    public final void Cd0() {
        NS();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility
    public final void EC1() {
        eT();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility
    public final void J91() {
        hT();
    }

    public boolean uS() {
        return this.LLLF;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.dimBehindType = 2;
        sheetOptions.LIZ(6, null);
        sheetOptions.isHeaderHidden = false;
        sheetOptions.cornerRadius = 0;
        return sheetOptions;
    }

    public void initView(final View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i;
        C19EG activity;
        Window window;
        Window window2;
        View viewFindViewById = view.findViewById(R.id.n65);
        if (viewFindViewById != null) {
            C500260Jjc.LJIILIIL(viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.uy2);
        if (viewFindViewById2 != null) {
            C500260Jjc.LJIILIIL(viewFindViewById2);
        }
        final View viewFindViewById3 = view.findViewById(R.id.jl0);
        ViewGroup.LayoutParams layoutParams = viewFindViewById3.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        C14K9.LJIJJ(view, new C0TVI() { // from class: X.0xas
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                int i2 = c20246014Ju.LIZ(1).LIZIZ;
                View view3 = viewFindViewById3;
                int i3 = i;
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.topMargin = i3 + i2;
                    C786410Ut5.W5(view3, marginLayoutParams2);
                    return c20246014Ju;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        });
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0xau
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PcsOnboardingStepFragment@3925.initView$2");
                try {
                    C20097313kJ.LIZJ(view);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PcsOnboardingStepFragment@3925.initView$2");
            }
        });
        if (BS()) {
            View viewFindViewById4 = view.findViewById(R.id.v48);
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById4.getLayoutParams();
            if (layoutParams2 != null) {
                C19ME c19me = (C19ME) layoutParams2;
                c19me.bottomToTop = -1;
                c19me.bottomToBottom = 0;
                C786410Ut5.W5(viewFindViewById4, c19me);
                View viewFindViewById5 = view.findViewById(R.id.cdn);
                if (viewFindViewById5 != null) {
                    viewFindViewById5.setBackground(null);
                }
                C19EG activity2 = getActivity();
                if (activity2 != null && (window2 = activity2.getWindow()) != null) {
                    window2.setNavigationBarColor(0);
                }
                if (Build.VERSION.SDK_INT >= 29 && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
                    window.setNavigationBarContrastEnforced(false);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        if (HS()) {
            View viewFindViewById6 = view.findViewById(R.id.v48);
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById6.getLayoutParams();
            if (layoutParams3 != null) {
                C19ME c19me2 = (C19ME) layoutParams3;
                c19me2.topToBottom = -1;
                c19me2.topToTop = 0;
                C786410Ut5.W5(viewFindViewById6, c19me2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        View viewFindViewById7 = view.findViewById(R.id.cdf);
        if (viewFindViewById7 != null) {
            ViewGroup.LayoutParams layoutParams4 = viewFindViewById7.getLayoutParams();
            if (layoutParams4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams2.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                marginLayoutParams2.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                C786410Ut5.W5(viewFindViewById7, marginLayoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Object serializable;
        super.onCreate(bundle);
        if (bundle != null) {
            this.LLLFFI = true;
            getParentFragmentManager().LLIIIILZ(Bundle.EMPTY, "pcs_onboarding_close");
            return;
        }
        JS().LLILLJJLI = C1558360qeg.LJFF(this, null);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        C1824600xa6 c1824600xa6 = new C1824600xa6(this);
        Gson gson = C1822270xWL.LIZ;
        Bundle arguments = getArguments();
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams = new PcsServicePlusOptinPageParams("", "", "", 0L, "", new HashMap());
        if (arguments != null) {
            String string = arguments.getString("show_entrance");
            String str = "";
            if (string == null) {
                string = "";
            }
            pcsServicePlusOptinPageParams.setShowEntrance(string);
            String string2 = arguments.getString("anchor_id");
            if (string2 == null) {
                string2 = "";
            }
            pcsServicePlusOptinPageParams.setAnchorId(string2);
            String string3 = arguments.getString("pcs_track_context");
            if (string3 != null) {
                str = string3;
            }
            pcsServicePlusOptinPageParams.setPcsTrackContext(str);
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("extra", HashMap.class);
            } else {
                Object serializable2 = arguments.getSerializable("extra");
                if (!(serializable2 instanceof HashMap)) {
                    serializable2 = null;
                }
                serializable = (HashMap) serializable2;
            }
            HashMap<String, String> map = (HashMap) serializable;
            if (map == null) {
                map = new HashMap<>();
            }
            pcsServicePlusOptinPageParams.setExtra(map);
        }
        C1554960qZC.LIZ(interfaceC665370Q7zLJFF, new C1822260xWK(c1824600xa6, pcsServicePlusOptinPageParams, new C1824590xa5(this)), C1822260xWK.class, "source_default_key");
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IPcsOnboardingBottomFunctionAbility.class, null, null);
    }

    public static void iT(PcsOnboardingStepFragment pcsOnboardingStepFragment, boolean z) {
        C510160Jza c510160JzaES = pcsOnboardingStepFragment.ES();
        if (c510160JzaES != null) {
            c510160JzaES.LIZIZ(z);
        }
    }

    public final void fT(int i, int i2) {
        C21546719Ub c21546719Ub;
        View view;
        View viewFindViewById;
        boolean z;
        View view2 = getView();
        if (view2 != null && (c21546719Ub = (C21546719Ub) view2.findViewById(R.id.wya)) != null) {
            c21546719Ub.LJIILIIL();
            c21546719Ub.setSelectedTabIndicator(0);
            c21546719Ub.setTabRippleColor(null);
            c21546719Ub.setTabPaddingStart(0);
            c21546719Ub.setTabPaddingEnd(0);
            c21546719Ub.setTabPaddingTop(0);
            c21546719Ub.setTabPaddingBottom(0);
            c21546719Ub.setTabMode(1);
            c21546719Ub.setTabGravity(1);
            int iLJ = C13LZ.LJ(i, 2, 5);
            for (int i3 = 0; i3 < iLJ; i3++) {
                C763970Txz c763970TxzLJIIJJI = c21546719Ub.LJIIJJI();
                c763970TxzLJIIJJI.LIZJ(C786410Ut5.Sd(R.layout.gu3, getLayoutInflater(), null));
                c21546719Ub.LIZIZ(c21546719Ub.LL.size(), c763970TxzLJIIJJI, c21546719Ub.LL.isEmpty());
                View childAt = ((ViewGroup) c21546719Ub.getChildAt(0)).getChildAt(i3);
                childAt.setMinimumWidth(0);
                childAt.setPadding(0, 0, 0, 0);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -1;
                layoutParams.weight = 0.0f;
                C786410Ut5.W5(childAt, layoutParams);
            }
            int tabCount = c21546719Ub.getTabCount();
            for (int i4 = 0; i4 < tabCount; i4++) {
                C763970Txz c763970TxzLJIIJ = c21546719Ub.LJIIJ(i4);
                if (c763970TxzLJIIJ != null && (view = c763970TxzLJIIJ.LJI) != null && (viewFindViewById = view.findViewById(R.id.wx3)) != null) {
                    if (i4 <= i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    viewFindViewById.setSelected(z);
                }
            }
            ViewGroup viewGroup = (ViewGroup) c21546719Ub.getChildAt(0);
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                viewGroup.getChildAt(i5).setOnTouchListener(new View.OnTouchListener() { // from class: X.0xb2
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        return true;
                    }
                });
            }
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingLightModeSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.LLLFFI) {
            return;
        }
        if (this.LLLFZ) {
            this.LLLFZ = false;
            String str = this.LLLI;
            C517510KRh c517510KRh = this.LLLII;
            if (str != null && c517510KRh != null) {
                InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
                if (interfaceC517590KRpLIZJ != null) {
                    interfaceC517590KRpLIZJ.LJIIIIZZ(str, c517510KRh);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(" perf.onInit source=back_nav_reinit");
                C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        initView(view);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new View.OnKeyListener(this) { // from class: X.0xaz
            public final /* synthetic */ PcsOnboardingStepFragment<ViewDataBinding> LL;

            {
                this.LL = this;
            }

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i, KeyEvent keyEvent) {
                if (i == 4 && keyEvent.getAction() == 1) {
                    this.LL.VS();
                    return true;
                }
                return false;
            }
        });
        PS();
    }

    public void XS(String str, String str2, Map<String, String> map) {
        String strFS;
        String strLIZIZ;
        if (this.LLLFZ || (strFS = FS()) == null) {
            return;
        }
        this.LLLFZ = true;
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            int i = this.LLJLLL;
            if (map == null) {
                map = new LinkedHashMap<>();
            }
            interfaceC517590KRpLIZJ.LJIIJJI(new C517520KRi(i, map));
        }
        if (str2.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(", ");
            sbLIZ.append(str2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strFS);
        sbLIZ2.append(" perf.onHide source=");
        sbLIZ2.append(str);
        sbLIZ2.append(strLIZIZ);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void ZS(String str, C517510KRh c517510KRh, String str2) {
        String strLIZIZ;
        this.LLLI = str;
        this.LLLII = c517510KRh;
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJIIIIZZ(str, c517510KRh);
        }
        if (str2.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(", ");
            sbLIZ.append(str2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(" perf.onInit");
        sbLIZ2.append(strLIZIZ);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LLL = (T) C1842040y2E.LIZ(layoutInflater, zS(), viewGroup, false, null);
        return wS().LLILZ;
    }

    public static boolean US(PcsOnboardingStatefulStepFragment pcsOnboardingStatefulStepFragment, int i, int i2, String str) {
        pcsOnboardingStatefulStepFragment.getClass();
        C1308850kAF c1308850kAF = new C1308850kAF();
        c1308850kAF.LJI = 0;
        c1308850kAF.LJII = 0;
        c1308850kAF.LJIIIIZZ = 0;
        c1308850kAF.LJIIIZ = 0;
        return pcsOnboardingStatefulStepFragment.QS(i, i2, null, c1308850kAF.LIZ(), str);
    }

    public final boolean QS(int i, int i2, Bundle bundle, C20133813qC c20133813qC, String str) {
        C20134113qF c20134113qFMR = NavHostFragment.MR(this);
        C20131713pr c20131713prLJFF = c20134113qFMR.LJFF();
        if (c20131713prLJFF == null || c20131713prLJFF.LLIZLLLIL != i) {
            return false;
        }
        XS("navigate", str, null);
        c20134113qFMR.LJIIJJI(i2, bundle, c20133813qC);
        JS().LJLJLJ();
        return true;
    }
}
