package com.ss.android.ugc.aweme.search.pages.sevensplitscreen;

import X.AnonymousClass1991;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0PC0;
import X.C0Q3E;
import X.C0QQW;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11JF;
import X.C128Y;
import X.C1360720lVu;
import X.C1440005kM;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C1800490wxD;
import X.C189200o6;
import X.C1906580ziK;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19A0;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20684815ws;
import X.C2211631BhB;
import X.C2344009Gk;
import X.C343710Ddh;
import X.C452501pT;
import X.C486860J7k;
import X.C523420Kfs;
import X.C650300Pf2;
import X.C667240QFe;
import X.C673150Qan;
import X.C679420Qku;
import X.C687700QyG;
import X.C723850SaN;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC667230QFd;
import X.EnumC667250QFf;
import X.EnumC670460QRo;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1350190lEv;
import X.InterfaceC1385905bd;
import X.InterfaceC1399350mWD;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1740760vOs;
import X.InterfaceC214902198i;
import X.InterfaceC2217241BqE;
import X.InterfaceC679410Qkt;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ARunnableS110S0100000_10;
import Y.ARunnableS21S0101000_10;
import Y.AfS179S0100000_10;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSplitSheetBehaviorAbility;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.SearchSevenSplitScreenRootFragmentScope;
import com.zhiliaoapp.musically.R;
import g1c.AjS65S0100000_10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSevenSplitScreenFragment extends Fragment implements InterfaceC724530SbT, InterfaceC1385905bd, ISearchSevenSplitScreenRootFragmentAbility, InterfaceC1399350mWD, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s/LDk2JjHELIOSY8JSYnOyY+LCo9ZhYpKD0wIBYpPyo9GzUgIDsAKzcpLCEVOiQrJCo9PA==";
    public View LL;
    public RadiusLayout LLILLJJLI;
    public boolean LLILLL;
    public boolean LLJI;
    public boolean LLJILLL;
    public InterfaceC679410Qkt LLJJ;
    public InterfaceC1350190lEv LLJJI;
    public C11JF LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public C19A0 LLJJJJ;
    public Bundle LLJJJJJIL;
    public final String LLILZ = UUID.randomUUID().toString();
    public String LLILZIL = "";
    public String LLILZLL = "";
    public String LLIZ = "";
    public EnumC670460QRo LLIZLLLIL = EnumC670460QRo.NONE;
    public long LLJ = System.currentTimeMillis();
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 836));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 838));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 837));
    public int LLJJIII = 1;
    public final List<Function1<Float, Unit>> LLJJIJI = new ArrayList();
    public final List<Function1<Integer, Unit>> LLJJIJIIJIL = new ArrayList();

    @Override // X.InterfaceC1399350mWD
    public final /* synthetic */ boolean Fi() {
        return false;
    }

    public final ISearchSplitSheetBehaviorAbility MR() {
        return (ISearchSplitSheetBehaviorAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchSplitSheetBehaviorAbility.class, null);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchSevenSplitScreenRootFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchSevenSplitScreenRootFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchSevenSplitScreenRootFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
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

    public final void NR() {
        C679420Qku c679420Qku = C679420Qku.LIZ;
        String str = this.LLILZ;
        String str2 = this.LLIZ;
        String str3 = this.LLILZLL;
        String str4 = this.LLILZIL;
        c679420Qku.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("panel_impr_id", str);
        c2344009Gk.LJIIIIZZ("enter_source", str2);
        c2344009Gk.LJIIIIZZ("search_keyword", str3);
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        C20684815ws.LJIILLIIL("enter_sevensplit_screen", c2344009Gk.LIZ);
    }

    public final void OR() {
        C679420Qku c679420Qku = C679420Qku.LIZ;
        String str = this.LLILZ;
        String str2 = ((C0PC0) C0Q3E.LJI().cp2().LIZJ()).LL;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.LLIZ;
        String str4 = this.LLILZLL;
        String str5 = this.LLILZIL;
        EnumC670460QRo enumC670460QRo = this.LLIZLLLIL;
        c679420Qku.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("panel_impr_id", str);
        c2344009Gk.LJIIIIZZ("search_id", str2);
        c2344009Gk.LJIIIIZZ("search_keyword", str4);
        c2344009Gk.LJIIIIZZ("enter_from", str5);
        c2344009Gk.LJIIIIZZ("exit_type", enumC670460QRo.getValue());
        c2344009Gk.LJIIIIZZ("enter_source", str3);
        C20684815ws.LJIILLIIL("exit_sevensplit_screen", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility
    public final void an() {
        if (this.LLJJJIL) {
            return;
        }
        CommentService.LIZ.getClass();
        if (C523420Kfs.LIZ().LLFFF(getContext())) {
            return;
        }
        try {
            C19EG activity = getActivity();
            if (activity != null) {
                C1360720lVu.LIZ(activity);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility
    public final boolean e82() {
        return Intrinsics.LJFF(this.LLIZ, EnumC667230QFd.CSI_BANNER_PROFILE.getValue());
    }

    public final void mobStayTime() {
        C679420Qku c679420Qku = C679420Qku.LIZ;
        String str = this.LLILZ;
        String str2 = ((C0PC0) C0Q3E.LJI().cp2().LIZJ()).LL;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.LLIZ;
        String str4 = this.LLILZLL;
        String str5 = this.LLILZIL;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJ;
        c679420Qku.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("panel_impr_id", str);
        c2344009Gk.LJIIIIZZ("search_id", str2);
        c2344009Gk.LJIIIIZZ("search_keyword", str4);
        c2344009Gk.LJIIIIZZ("enter_from", str5);
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        c2344009Gk.LJIIIIZZ("enter_source", str3);
        C20684815ws.LJIILLIIL("sevensplit_screen_stay_time", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1385905bd
    public final boolean onBackPress() {
        if (this.LLILLL) {
            return false;
        }
        this.LLIZLLLIL = EnumC670460QRo.OTHER;
        if (!this.LLJILLL) {
            this.LLJILLL = true;
            ISearchSplitSheetBehaviorAbility iSearchSplitSheetBehaviorAbilityMR = MR();
            if (iSearchSplitSheetBehaviorAbilityMR != null) {
                iSearchSplitSheetBehaviorAbilityMR.c(5);
            }
        }
        this.LLILLL = true;
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C19A0 c19a0 = this.LLJJJJ;
        if (c19a0 != null) {
            c19a0.LIZJ();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C19A0 c19a0 = this.LLJJJJ;
        if (c19a0 != null) {
            c19a0.LIZLLL();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        C19A0 c19a0 = this.LLJJJJ;
        if (c19a0 != null) {
            c19a0.LJI();
        }
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility
    public final void v0() {
        RadiusLayout radiusLayout = this.LLILLJJLI;
        if (radiusLayout == null || radiusLayout.getVisibility() != 0) {
            RadiusLayout radiusLayout2 = this.LLILLJJLI;
            if (radiusLayout2 != null) {
                C786410Ut5.LLZZ(radiusLayout2, 0);
            }
            View view = getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS110S0100000_10(this, 87));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C19EG activity;
        CommonPageFragment commonPageFragmentZQ2;
        C128Y c128yBQ2;
        super.onDestroy();
        if (!this.LLJJJIL && (activity = getActivity()) != null && (commonPageFragmentZQ2 = C486860J7k.LIZIZ(activity).zQ2()) != null && a0.LJJIIZI(commonPageFragmentZQ2.getClass().getSimpleName(), "MainPageFragment", false) && (c128yBQ2 = C343710Ddh.LIZ(activity).BQ2()) != null && (c128yBQ2 instanceof InterfaceC1740760vOs)) {
            C2211631BhB.LJIIL((InterfaceC1740760vOs) c128yBQ2, activity);
        }
        C1440005kM.LIZ(new C0QQW(EnumC667250QFf.STATE_CLOSE_SCREEN));
        C11JF c11jf = this.LLJJIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        ((ArrayList) this.LLJJIJIIJIL).clear();
        ((ArrayList) this.LLJJIJI).clear();
        C650300Pf2.LIZLLL.LJ();
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(activity2, null), ISearchSevenSplitScreenRootFragmentAbility.class, null);
        }
        InterceptHomeBackPressService interceptHomeBackPressService = (InterceptHomeBackPressService) PluggableExtentionKt.pluggableSpi$default(InterceptHomeBackPressService.class, false, false, false, 14, null);
        if (interceptHomeBackPressService != null) {
            interceptHomeBackPressService.LIZ(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C19A0 c19a0 = this.LLJJJJ;
        if (c19a0 != null) {
            c19a0.LJ();
        }
        if (this.LLJJJ) {
            this.LLJJJ = false;
            this.LLIZLLLIL = EnumC670460QRo.NONE;
            this.LLJ = System.currentTimeMillis();
            NR();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C19A0 c19a0 = this.LLJJJJ;
        if (c19a0 != null) {
            c19a0.LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility
    public final void s3() {
        FragmentManager supportFragmentManager;
        C19EG activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
        c19ehLJIIJ.LJIIZILJ(this);
        c19ehLJIIJ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility
    public final boolean UD() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility
    public final void LJJJI(float f) {
        Iterator<Function1<Float, Unit>> it2 = this.LLJJIJI.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Float.valueOf(f));
        }
        float fIntValue = ((Number) this.LLJIJIL.getValue()).intValue() * 0.7f;
        if (f > 0.0f) {
            float fIntValue2 = ((Number) this.LLJILJIL.getValue()).intValue() * (1 - f);
            RadiusLayout radiusLayout = this.LLILLJJLI;
            if (radiusLayout != null) {
                radiusLayout.LIZ(fIntValue2, fIntValue2, 0.0f, 0.0f);
            }
        }
        if (f <= 0.0f) {
            float f2 = (f + 1.0f) * fIntValue;
            InterfaceC679410Qkt interfaceC679410Qkt = this.LLJJ;
            if (interfaceC679410Qkt != null) {
                interfaceC679410Qkt.LLJLL(f2, fIntValue);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility
    public final void MN(Function1<? super Integer, Unit> function1) {
        if (!((ArrayList) this.LLJJIJIIJIL).contains(function1)) {
            ((ArrayList) this.LLJJIJIIJIL).add(function1);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility
    public final void eD1(Function1<? super Float, Unit> function1) {
        if (!((ArrayList) this.LLJJIJI).contains(function1)) {
            ((ArrayList) this.LLJJIJI).add(function1);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility
    public final void id(int i) {
        int i2 = this.LLJJIII;
        if (i2 != i) {
            InterfaceC1350190lEv interfaceC1350190lEv = this.LLJJI;
            if (interfaceC1350190lEv != null) {
                interfaceC1350190lEv.LIZ(i2, i);
            }
            this.LLJJIII = i;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJJJJIL = bundle;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("enter_from")) == null) {
            string = "";
        }
        this.LLILZIL = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("keyword")) != null) {
            str = string2;
        }
        this.LLILZLL = str;
        InterceptHomeBackPressService interceptHomeBackPressService = (InterceptHomeBackPressService) PluggableExtentionKt.pluggableSpi$default(InterceptHomeBackPressService.class, false, false, false, 14, null);
        if (interceptHomeBackPressService != null) {
            interceptHomeBackPressService.LIZJ(this);
        }
        this.LLJJIJIL = (C11JF) C1906580ziK.LIZJ().LIZ().LJJLJLI(new AfS179S0100000_10(this, 7));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility
    public final void sV0(int i) {
        SAFFragmentRootScene sAFFragmentRootScene;
        InterfaceC214902198i interfaceC214902198i;
        SAFFragmentRootScene sAFFragmentRootScene2;
        InterfaceC214902198i interfaceC214902198i2;
        AnonymousClass1991 anonymousClass1991LIZIZ;
        if (i != 3) {
            if (i != 5) {
                if (i == 6) {
                    C1440005kM.LIZ(new C0QQW(EnumC667250QFf.STATE_SEVEN_SCREEN));
                }
            } else {
                C1440005kM.LIZ(new C0QQW(EnumC667250QFf.STATE_CLOSE_SCREEN));
                if (!this.LLJJJIL) {
                    EnumC670460QRo enumC670460QRo = this.LLIZLLLIL;
                    if (enumC670460QRo == EnumC670460QRo.NONE) {
                        enumC670460QRo = EnumC670460QRo.SLIDE_DOWN_SEVEN_SPLIT_SCREEN;
                    }
                    this.LLIZLLLIL = enumC670460QRo;
                    OR();
                    mobStayTime();
                }
            }
        } else {
            this.LLJJJIL = true;
            if (!Intrinsics.LJFF(this.LLIZ, EnumC667230QFd.SEARCH_ENTITY_WORD.getValue()) && !Intrinsics.LJFF(this.LLIZ, EnumC667230QFd.SEARCH_RELATED_WORD.getValue())) {
                try {
                    C19EG activity = getActivity();
                    if (activity != null) {
                        C1360720lVu.LIZ(activity);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C19A0 c19a0 = this.LLJJJJ;
            if (c19a0 != null) {
                C19A0.LIZ(c19a0, getActivity());
            }
            C19A0 c19a02 = this.LLJJJJ;
            if (c19a02 != null && (sAFFragmentRootScene2 = c19a02.LIZLLL) != null && (interfaceC214902198i2 = sAFFragmentRootScene2.LLJJ) != null && (anonymousClass1991LIZIZ = C1800490wxD.LIZIZ(interfaceC214902198i2)) != null) {
                anonymousClass1991LIZIZ.LJ = false;
            }
            C19A0 c19a03 = this.LLJJJJ;
            if (c19a03 != null && (sAFFragmentRootScene = c19a03.LIZLLL) != null && (interfaceC214902198i = sAFFragmentRootScene.LLJJ) != null) {
                interfaceC214902198i.YP();
            }
            ISearchSplitSheetBehaviorAbility iSearchSplitSheetBehaviorAbilityMR = MR();
            if (iSearchSplitSheetBehaviorAbilityMR != null) {
                iSearchSplitSheetBehaviorAbilityMR.c(5);
            }
            EnumC670460QRo enumC670460QRo2 = this.LLIZLLLIL;
            if (enumC670460QRo2 != EnumC670460QRo.OTHER) {
                enumC670460QRo2 = EnumC670460QRo.SLIDE_UPWARDS_FULL_SCREEN;
            }
            this.LLIZLLLIL = enumC670460QRo2;
            OR();
            mobStayTime();
        }
        Iterator it2 = ((ArrayList) this.LLJJIJIIJIL).iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(Integer.valueOf(i));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility
    public final void Hm2(EnumC667250QFf enumC667250QFf, EnumC670460QRo enumC670460QRo) {
        int i;
        if (this.LLJILLL) {
            return;
        }
        if (enumC670460QRo == EnumC670460QRo.CLICK_SEARCH_BAR || enumC670460QRo == EnumC670460QRo.CLICK_SEARCH_MINI_CLOSE) {
            this.LLJI = true;
            enumC670460QRo = EnumC670460QRo.OTHER;
        }
        this.LLIZLLLIL = enumC670460QRo;
        int i2 = C667240QFe.LIZ[enumC667250QFf.ordinal()];
        if (i2 != 1) {
            i = 3;
            if (i2 != 2) {
                if (i2 == 3) {
                    i = 5;
                } else {
                    throw new C1954807lC();
                }
            }
        } else {
            i = 6;
        }
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS21S0101000_10(i, this, 5));
        }
    }

    @Override // X.InterfaceC1399350mWD
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 == i) {
            return onBackPress();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            C1558520qew.LJII(C1558360qeg.LJI(activity, null), this, ISearchSevenSplitScreenRootFragmentAbility.class, null, null);
        }
        C723850SaN.LIZ(this, false, null, new AwS589S0100000_10(this, 355), 3);
        View viewFindViewById = view.findViewById(R.id.ued);
        this.LL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AjS65S0100000_10(this, 26), viewFindViewById);
        }
        this.LLILLJJLI = (RadiusLayout) view.findViewById(R.id.uef);
        NR();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.exf, viewGroup, false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
