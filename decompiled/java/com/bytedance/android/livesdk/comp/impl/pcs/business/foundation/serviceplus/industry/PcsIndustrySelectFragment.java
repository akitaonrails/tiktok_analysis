package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0QSJ;
import X.C0TVI;
import X.C1139204cw;
import X.C1158604g4;
import X.C1158704g5;
import X.C1161920gLG;
import X.C127G;
import X.C1390410mHn;
import X.C13LE;
import X.C1410950mov;
import X.C1440005kM;
import X.C14K9;
import X.C1554960qZC;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1781540wSe;
import X.C1781550wSf;
import X.C1783900wWS;
import X.C1783910wWT;
import X.C1784800wXu;
import X.C1784820wXw;
import X.C1784840wXy;
import X.C1784900wY4;
import X.C1790940who;
import X.C1790950whp;
import X.C1790960whq;
import X.C1790970whr;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C389001fE;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C497370Jex;
import X.C497380Jey;
import X.C497740JfY;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC500940Jki;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.PcsIndustrySelectFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.repository.PcsIndustryApi;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.scope.PcsIndustrySelectScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.viewmodel.PcsIndustrySelectVM;
import com.bytedance.android.livesdk.livesetting.broadcast.subscription.SubscribeUpsellLynxUrlSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsIndustrySelectFragment extends BaseFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final C497370Jex LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzHELIOSAiLS4nISoiZzw2OjMlKiojJDA/ZyY9LDA/PT0qZhUvOgY9LDA/PT0qGyAgLCwnDjctLiI2JjE=";
    public final AssemVMLazy LL;
    public String LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public Function0<Unit> LLJ;
    public C1784900wY4 LLJI;
    public C1390410mHn LLJIJIL;
    public C127G LLJILJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Jex] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsIndustrySelectFragment.class, "viewModel", "getViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/industry/viewmodel/PcsIndustrySelectVM;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJILJ = new Object() { // from class: X.0Jex
        };
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PcsIndustrySelectScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PcsIndustrySelectScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PcsIndustrySelectScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public PcsIndustrySelectFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsIndustrySelectVM.class);
        C497380Jey c497380Jey = new C497380Jey(c19719912DlLIZ);
        C1790970whr c1790970whr = new C1790970whr();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c497380Jey, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C1790940who(this), c1790970whr, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c497380Jey, new C1790950whp(this), c1790970whr, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c497380Jey, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1790960whq(this), c1790970whr, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = "";
        this.LLILZ = true;
    }

    public final PcsIndustrySelectVM NR() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (PcsIndustrySelectVM) assemVMLazy.getValue();
    }

    public final void OR() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        String smbIndustryBlockPage = SubscribeUpsellLynxUrlSetting.INSTANCE.getSmbIndustryBlockPage(this.LLILLJJLI, "", "", true, this.LLILZIL, null, "", "SERVICEPLUS");
        if (smbIndustryBlockPage.length() > 0) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, smbIndustryBlockPage);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJILJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJILJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PcsIndustrySelectVM.class, new Function0(this) { // from class: X.0whl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String str = PcsIndustrySelectFragment._pnsPageId;
                            C480460Ism.LIZ().getClass();
                            return new PcsIndustrySelectVM(new C1785290wYh((PcsIndustryApi) C480460Ism.LIZLLL(PcsIndustryApi.class)));
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJILJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final void PR(long j, boolean z) {
        int i;
        C1781540wSe next;
        Iterator<C1781540wSe> it2 = NR().getState().LLILLJJLI.iterator();
        while (true) {
            i = 0;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1781540wSe c1781540wSe = next;
        C1440005kM.LIZ(new IEvent() { // from class: X.0whs
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
        GScope gScope = GScope.LL;
        if (c1781540wSe != null) {
            i = c1781540wSe.LJFF;
        }
        C1554960qZC.LIZ(gScope, new C1781550wSf(i, j, z), C1781550wSf.class, "source_default_key");
        if (!this.LLILZIL) {
            C389001fE.LIZ("INDUSTRY_SELECTED", new JSONObject().put("isHighRisk", z), System.currentTimeMillis(), false);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        String string;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        User userLJIJJLI;
        String string2;
        super.onViewCreated(view, bundle);
        view.setLayoutDirection(C497740JfY.LJJ() ? 1 : 0);
        final View viewFindViewById = view.findViewById(R.id.jit);
        final View viewFindViewById2 = view.findViewById(R.id.ccd);
        C14K9.LJIJJ(view, new C0TVI() { // from class: X.0Hff
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                int i2 = c20246014Ju.LIZ(1).LIZIZ;
                int i3 = c20246014Ju.LIZ(2).LIZLLL;
                View view3 = viewFindViewById;
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = i2;
                        C786410Ut5.W5(view3, marginLayoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                View view4 = viewFindViewById2;
                if (view4 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.bottomMargin = i3;
                        C786410Ut5.W5(view4, marginLayoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                return c20246014Ju;
            }
        });
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0DIz
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PcsIndustrySelectFragment@36b5.setupStatusBarInsets$2");
                try {
                    C20097313kJ.LIZJ(view);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PcsIndustrySelectFragment@36b5.setupStatusBarInsets$2");
            }
        });
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("enter_from", "")) == null) {
            string = "";
        }
        this.LLILLJJLI = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i = arguments2.getInt("verification_status", 0);
        } else {
            i = 0;
        }
        this.LLILLL = i;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z = arguments3.getBoolean("can_reselect", true);
        } else {
            z = true;
        }
        this.LLILZ = z;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            z2 = arguments4.getBoolean("is_from_opt_in", false);
        } else {
            z2 = false;
        }
        this.LLILZIL = z2;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            z3 = arguments5.getBoolean("guide_industry_verify", false);
        } else {
            z3 = false;
        }
        this.LLILZLL = z3;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            z4 = arguments6.getBoolean("guide_industry_status_check", false);
        } else {
            z4 = false;
        }
        this.LLIZ = z4;
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            z5 = arguments7.getBoolean("is_from_smb_management_redirect", false);
        } else {
            z5 = false;
        }
        this.LLIZLLLIL = z5;
        PcsIndustrySelectVM pcsIndustrySelectVMNR = NR();
        String str2 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        boolean z6 = this.LLILZ;
        boolean z7 = this.LLILZIL;
        boolean z8 = this.LLILZLL;
        boolean z9 = this.LLIZ;
        pcsIndustrySelectVMNR.LLILZLL = str2;
        pcsIndustrySelectVMNR.LLIZ = z7;
        pcsIndustrySelectVMNR.LLIZLLLIL = z8;
        pcsIndustrySelectVMNR.LLJ = z9;
        pcsIndustrySelectVMNR.setState(new C1784800wXu(i2, z6, z8, z9));
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) != null && (string2 = Long.valueOf(userLJIJJLI.getId()).toString()) != null) {
            str = string2;
        }
        this.LLJI = new C1784900wY4(str, this.LLILLJJLI, this.LLILZIL);
        C723850SaN.LIZ(this, false, null, new C1139204cw(this), 3);
        C723850SaN.LIZ(this, false, null, new C1158604g4(this), 3);
        C723850SaN.LIZ(this, false, null, new C1158704g5(this), 3);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.nlo);
        this.LLJIJIL = new C1390410mHn(requireContext(), null, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, getResources().getDisplayMetrics()));
        layoutParams.gravity = 17;
        C1390410mHn c1390410mHn = this.LLJIJIL;
        if (c1390410mHn != null) {
            C786410Ut5.V6(c1390410mHn, layoutParams);
        }
        viewGroup.addView(this.LLJIJIL);
        PcsIndustrySelectVM pcsIndustrySelectVMNR2 = NR();
        pcsIndustrySelectVMNR2.setState(new C1784840wXy());
        pcsIndustrySelectVMNR2.LLILZ.setValue(new C1410950mov(0.0f));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pcsIndustrySelectVMNR2), null, null, new C1784820wXw(pcsIndustrySelectVMNR2, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C1783900wWS(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C1783910wWT(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gkl, viewGroup, false);
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
