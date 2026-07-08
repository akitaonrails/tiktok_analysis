package com.ss.android.ugc.aweme.tako.otherpage.sheet;

import X.C013C;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C07MR;
import X.C1163410gNf;
import X.C1163440gNi;
import X.C1220000hqw;
import X.C1360890lWB;
import X.C1365870leD;
import X.C1388190mED;
import X.C1389910mGz;
import X.C1391190mJ3;
import X.C13IQ;
import X.C13LE;
import X.C1483410ohn;
import X.C14EU;
import X.C14KI;
import X.C14TF;
import X.C1622206Wu;
import X.C1845390y7d;
import X.C1852420yIy;
import X.C1862700yZY;
import X.C1863130yaF;
import X.C19719912Dl;
import X.C19EG;
import X.C20228914Df;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C298830BnV;
import X.C298850BnX;
import X.C338490DOt;
import X.C338520DOw;
import X.C343970De7;
import X.C345280DgE;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C960203pA;
import X.C987103tV;
import X.InterfaceC1058150ddt;
import X.InterfaceC1361305Ul;
import X.InterfaceC1856570yPf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.RunnableC514801zW;
import X.ViewOnAttachStateChangeListenerC1208760hYo;
import Y.ACListenerS86S0300000_21;
import Y.ARunnableS130S0100000_30;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.components.autoplay.TakoListAutoPlayAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.share.TakoSharePreviewAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.otherpage.botcenter.TakoBotCenterViewModel;
import com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public class TakoSheetFragment extends TakoBaseFragment implements InterfaceC1058150ddt {
    public static final C20228914Df LLLLLZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLZIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzHELIOSEkLD0jKSIpZzw7LSA4ZxsyIyofISo2PAM+KCg+LSs4";
    public final AssemVMLazy LLLLILI;
    public final AssemVMLazy LLLLJ;
    public final AssemVMLazy LLLLJI;
    public final C736950SvV LLLLL;
    public final C01GW LLLLLIL;
    public final C01GW LLLLLILLIL;
    public final AwS609S0100000_30 LLLLLJIL;
    public final boolean LLLLLJLJLL;
    public ValueAnimator LLLLLL;
    public final C01GW LLLLLLIL;
    public final C01GW LLLLLLJ;
    public final C01GW LLLLLLL;
    public long LLLLLLLLL;
    public boolean LLLLLLLLLL;
    public TakoSharePreviewAbility LLLLLLLZIL;
    public InterfaceC1856570yPf LLLLLLZ;
    public InterfaceC1361305Ul LLLLLLZZ;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.14Df] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoSheetFragment.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        C13LE.LIZ.getClass();
        LLLLLZIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(TakoSheetFragment.class, "takoSheetVM", "getTakoSheetVM()Lcom/ss/android/ugc/aweme/tako/otherpage/sheet/TakoSheetVM;", 0), new C2217381BqS(TakoSheetFragment.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0)};
        LLLLLZ = new Object() { // from class: X.14Df
        };
        ((ITakoService) ServiceManager.get().getService(ITakoService.class)).LJLLLLLL();
    }

    public void BS(float f) {
    }

    public void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    public void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        super.bindAbility(obj, cls);
        if (cls == TakoSharePreviewAbility.class) {
            this.LLLLLLLZIL = (TakoSharePreviewAbility) obj;
        } else if (cls == InterfaceC1856570yPf.class) {
            this.LLLLLLZ = (InterfaceC1856570yPf) obj;
        } else if (cls == InterfaceC1361305Ul.class) {
            this.LLLLLLZZ = (InterfaceC1361305Ul) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoFragmentScope.class});
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.C0QSJ
    public final Object getAbility(Class cls) {
        return cls == TakoSharePreviewAbility.class ? this.LLLLLLLZIL : cls == InterfaceC1856570yPf.class ? this.LLLLLLZ : cls == InterfaceC1361305Ul.class ? this.LLLLLLZZ : super.getAbility(cls);
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(TakoFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(TakoFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment
    public boolean iS() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment
    public String nZ0() {
        return "nine_split_screen";
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        super.unbindAbility(obj, cls);
        if (cls == TakoSharePreviewAbility.class) {
            this.LLLLLLLZIL = null;
        } else if (cls == InterfaceC1856570yPf.class) {
            this.LLLLLLZ = null;
        } else if (cls == InterfaceC1361305Ul.class) {
            this.LLLLLLZZ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    public C19719912Dl yS() {
        return C13LE.LIZ(SheetTopTitleAssem.class);
    }

    public C1163440gNi zS(C13IQ<? extends UISlotAssem> c13iq) {
        return null;
    }

    public TakoSheetFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        boolean z2;
        AssemVMLazy assemVMLazy3;
        boolean z3;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoMultipleSelectVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 2326);
        AFwS274S0000000_30 aFwS274S0000000_30 = AFwS274S0000000_30.get$arr$(188);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 274), aFwS274S0000000_30, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS574S0100000_30((Fragment) this, 275), aFwS274S0000000_30, null, null, null);
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 276), aFwS274S0000000_30, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLLLILI = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoSheetVM.class);
        AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18(c19719912DlLIZ2, 2327);
        AFwS274S0000000_30 aFwS274S0000000_302 = AFwS274S0000000_30.get$arr$(189);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS562S0100000_182, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 265), aFwS274S0000000_302, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
            z2 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS562S0100000_182, new AwS574S0100000_30((Fragment) this, 266), aFwS274S0000000_302, null, null, null);
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z2 = true;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS562S0100000_182, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 270), aFwS274S0000000_302, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLLLJ = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MessageViewModel.class);
        AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18(c19719912DlLIZ3, 2325);
        AFwS274S0000000_30 aFwS274S0000000_303 = AFwS274S0000000_30.get$arr$(187);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS562S0100000_183, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 271), aFwS274S0000000_303, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
            z3 = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS562S0100000_183, new AwS574S0100000_30((Fragment) this, 272), aFwS274S0000000_303, null, null, null);
            z3 = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z3 = false;
            z2 = true;
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS562S0100000_183, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 273), aFwS274S0000000_303, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLLLJI = assemVMLazy3;
        this.LLLLL = new C736950SvV(C13LE.LIZ(TakoBotCenterViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS274S0000000_30.get$arr$(186), new C451460Hn6(this, z3), new C451620HnM(this, z2), new C338520DOw(this));
        this.LLLLLIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 269));
        this.LLLLLILLIL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(200));
        this.LLLLLJIL = new AwS609S0100000_30(this, 113);
        this.LLLLLJLJLL = z2;
        this.LLLLLLIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 267));
        this.LLLLLLJ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 268));
        this.LLLLLLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2324));
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility
    public final void ts2() {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    public void uS() {
        View view;
        View viewFindViewById;
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIIZILJ(this, false);
        Context context = getContext();
        if (context == null || !C960203pA.LIZIZ(context)) {
            View view2 = this.LLJJIII;
            int systemUiVisibility = view2 != null ? view2.getSystemUiVisibility() : 0;
            View view3 = this.LLJJIII;
            if (view3 != null) {
                view3.setSystemUiVisibility(systemUiVisibility | 8192);
            }
        }
        TakoEnterParams takoEnterParams = this.LLJILLL;
        if (takoEnterParams != null) {
            C1862700yZY.LIZJ(takoEnterParams.processId, new Pair("screen_type", "full_screen"), null);
        }
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) this.LLLLLIL.getValue();
        if (iTakoScreenTypeAbility != null) {
            iTakoScreenTypeAbility.eM0();
        }
        AssemVMLazy assemVMLazy = this.LLLLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLLZIL;
        assemVMLazy.getValue().setState(AFwS256S0000000_18.get$arr$(1037));
        TakoListAutoPlayAbility takoListAutoPlayAbility = (TakoListAutoPlayAbility) this.LLJLIL.getValue();
        if (takoListAutoPlayAbility != null) {
            takoListAutoPlayAbility.OK2((C1852420yIy) this.LLLLLILLIL.getValue());
        }
        UR();
        C1163410gNf.LIZ.getClass();
        if (C1163410gNf.LIZJ() && (view = this.LLJJIII) != null && (viewFindViewById = view.findViewById(R.id.kru)) != null) {
            HandlerHook.viewPost(viewFindViewById, new RunnableC514801zW(viewFindViewById, 197));
        }
        View view4 = this.LLJJIII;
        if (view4 != null) {
            VR(view4);
        }
    }

    public final void ES() {
        if (C1483410ohn.LJLJJI().isPlaying()) {
            C1483410ohn.LJLJJI().LIZ();
            this.LLLLLLLLLL = true;
        }
    }

    public boolean onBackPress() {
        if (C298850BnX.LIZ()) {
            return false;
        }
        C013C c013c = new C013C();
        AssemVMLazy assemVMLazy = this.LLLLILI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLLZIL;
        C736680Sv4.LJIJJ(assemVMLazy.getValue(), new AwS396S0200000_30(this, c013c, 25));
        return c013c.element;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (wS() && this.LLLLLLLLLL) {
            C1483410ohn.LJLJJI().LJIILLIIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1863130yaF.LIZ.getClass();
        if (C1863130yaF.LIZ() && this.LLLLLLLLLL) {
            ES();
            View view = this.LLJJIII;
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS130S0100000_30(this, 18));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment
    public final boolean sS() {
        return !C298830BnV.LIZ();
    }

    public boolean wS() {
        return this.LLLLLJLJLL;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (wS()) {
            ES();
        }
    }

    @C14EU
    public final void onEvent(C1365870leD c1365870leD) {
        String strLIZ;
        Map<String, String> mapLJ;
        if (!C14TF.LIZIZ.LJJJJIZL(c1365870leD.LJ)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLLLLLLLL < 3000) {
            return;
        }
        this.LLLLLLLLL = jCurrentTimeMillis;
        C19EG activity = getActivity();
        ACListenerS86S0300000_21 aCListenerS86S0300000_21 = null;
        if (activity != null) {
            strLIZ = C345280DgE.LIZ(activity, c1365870leD);
        } else {
            strLIZ = null;
        }
        int iLIZIZ = C14KI.LIZIZ(requireContext()) + getResources().getDimensionPixelOffset(R.dimen.ai9);
        if (strLIZ != null) {
            C1389910mGz c1389910mGz = new C1389910mGz(this);
            c1389910mGz.LJIIJ(strLIZ);
            c1389910mGz.LJI(R.style.y0);
            c1389910mGz.LJ(3000L);
            c1389910mGz.LIZIZ(iLIZIZ);
            c1389910mGz.LIZ.LJIIIZ = this.LLJJIII;
            Context context = getContext();
            if (context != null) {
                aCListenerS86S0300000_21 = new ACListenerS86S0300000_21(c1365870leD, this, context, 16);
            }
            C1360890lWB c1360890lWB = c1389910mGz.LIZ;
            c1360890lWB.LJIIIIZZ = aCListenerS86S0300000_21;
            c1360890lWB.LIZLLL = 0;
            c1389910mGz.LJIIJJI();
            TakoEnterParams takoEnterParams = this.LLJILLL;
            if (takoEnterParams == null || (mapLJ = takoEnterParams.getCommonParams()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            C1845390y7d.LIZIZ(mapLJ, c1365870leD.LJIIIZ, "share_message");
        }
        AssemVMLazy assemVMLazy = this.LLLLILI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLLZIL;
        ((TakoMultipleSelectVM) assemVMLazy.getValue()).AQ2();
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        TakoListAutoPlayAbility takoListAutoPlayAbility;
        int i;
        Activity activityLIZ;
        Resources resources;
        DisplayMetrics displayMetrics;
        super.onViewCreated(view, bundle);
        View view2 = this.LLJJIII;
        if (view2 != null) {
            layoutParams = view2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (Intrinsics.LJFF(nZ0(), "nine_split_screen") && getContext() != null) {
            if (layoutParams != null) {
                Context context = getContext();
                if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (resources = activityLIZ.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    i = displayMetrics.heightPixels;
                } else {
                    i = 0;
                }
                layoutParams.height = (int) ((i - ScreenUtils.getStatusBarHeight(context)) * 0.9f);
            }
            View view3 = this.LLJJIII;
            if (view3 != null) {
                C786410Ut5.W5(view3, layoutParams);
            }
        }
        C723850SaN.LIZ(this, false, null, new AwS606S0100000_27(this, 274), 3);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1208760hYo(this, 0));
        AssemVMLazy assemVMLazy = this.LLLLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLLZIL;
        ((TakoSheetVM) assemVMLazy.getValue()).vQ2(new AwS571S0100000_27(this, 934));
        AssemViewModel.selectSubscribe$default(this.LLLLJ.getValue(), new C2217381BqS() { // from class: X.0gM1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159050gGd) obj).LLILZ;
            }
        }, null, null, null, new AwS597S0100000_18(new AwS597S0100000_18(this, 591), 1073), 14, null);
        C736680Sv4.LJIIIIZZ(this, this.LLLLL.getValue(), new C2217381BqS() { // from class: X.14Gg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1576320r7e) obj).LLILLL);
            }
        }, null, new AwS641S0100000_27(this, 72), 6);
        if (C07MR.LIZ() && (takoListAutoPlayAbility = (TakoListAutoPlayAbility) this.LLJLIL.getValue()) != null) {
            takoListAutoPlayAbility.sB2((C1852420yIy) this.LLLLLILLIL.getValue());
        }
    }
}
