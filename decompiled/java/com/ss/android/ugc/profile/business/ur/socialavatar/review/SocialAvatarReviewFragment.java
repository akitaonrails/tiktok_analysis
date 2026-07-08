package com.ss.android.ugc.profile.business.ur.socialavatar.review;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C054G;
import X.C098200Yq;
import X.C0DHG;
import X.C0HDG;
import X.C0HDO;
import X.C0HDQ;
import X.C0HDU;
import X.C0HFD;
import X.C0HFS;
import X.C0HLX;
import X.C0HNI;
import X.C0HWW;
import X.C0HYP;
import X.C0IDC;
import X.C0IDS;
import X.C0PEM;
import X.C0XQ7;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1245160iVW;
import X.C1388190mED;
import X.C1390130mHL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C15438062q;
import X.C1622206Wu;
import X.C1668306g5;
import X.C1685300txQ;
import X.C1720106oR;
import X.C1770850wBP;
import X.C189200o6;
import X.C1910890zpH;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719212De;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2277121EBa;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C338490DOt;
import X.C342720Dc6;
import X.C418440Gaw;
import X.C436960HBm;
import X.C437190HCj;
import X.C437260HCq;
import X.C437480HDm;
import X.C437560HDu;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C632670Orh;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C985403tE;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1320200kSY;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAISelfCompatibilityConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS215S0300000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS655S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarReviewFragment extends BaseFragment implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiOiAwISHELIOSQgKDkyPCQ+Zz02PiwpPmEAJyYlKCMSPiQ4KD0BLTMlLDgVOiQrJCo9PA==";
    public C1390130mHL LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public C197039127h LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public TuxIconView LLJILJIL;
    public CheckBox LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public View LLJJIJIL;
    public String LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final AtomicBoolean LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public Long LLJLL;
    public final C01GW LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SocialAvatarReviewFragment.class, "avatarViewModel", "getAvatarViewModel()Lcom/ss/android/ugc/profile/business/ur/socialavatar/review/SocialAvatarEditViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void bS() {
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0HHU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HNI) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 99), 4);
        C736680Sv4.LJIIIZ(this, UR(), new C2217381BqS() { // from class: X.0HNK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HNI) obj).LLIZ;
            }
        }, new C2217381BqS() { // from class: X.0HNJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0HNI) obj).LLIZLLLIL);
            }
        }, C736820SvI.LIZLLL(), new AwS655S0100000_6(this, 8), 8);
        if (C2277121EBa.LIZ() && VR()) {
            SocialAvatarEditViewModel socialAvatarEditViewModelUR = UR();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(socialAvatarEditViewModelUR), C0PEM.LIZJ, null, new C437260HCq(socialAvatarEditViewModelUR, null), 2);
        }
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public SocialAvatarReviewFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SocialAvatarEditViewModel.class);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c19719912DlLIZ, 955);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(386);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS550S0100000_6, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 956), aFwS236S0000000_6, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS550S0100000_6, new AwS550S0100000_6((Fragment) this, 957), aFwS236S0000000_6, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS550S0100000_6, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 958), aFwS236S0000000_6, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 946));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 953));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 950));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 947));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 948));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 949));
        this.LLJJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 954));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(382));
        this.LLJL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(381));
        this.LLJLIL = new AtomicBoolean(false);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(380));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(379));
    }

    public final SocialAvatarEditViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (SocialAvatarEditViewModel) assemVMLazy.getValue();
    }

    public final boolean VR() {
        return ((Boolean) this.LLJJJIL.getValue()).booleanValue();
    }

    public final void ZR() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        TuxIconView tuxIconView = this.LLJJIJIIJIL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 92));
        TuxIconView tuxIconView2 = this.LLJILJIL;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        C786410Ut5.a9(tuxIconView2, new ACListenerS141S0100000_6(this, 93));
        C197039127h c197039127h = this.LLJ;
        C786410Ut5.U8(c197039127h != null ? c197039127h : null, new ACListenerS141S0100000_6(this, 94));
        C19EG activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.LIZ(getViewLifecycleOwner(), new C0IDC(this, 1));
    }

    public final void aS() {
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C723850SaN.LIZ(this, false, null, new AwS585S0100000_6(this, 12), 3);
        if (VR() && C1245160iVW.LIZ((User) this.LLJLLIL.getValue())) {
            C197039127h c197039127h = this.LLJ;
            if (c197039127h == null) {
                c197039127h = null;
            }
            c197039127h.setText(getString(2131848578));
        } else {
            C197039127h c197039127h2 = this.LLJ;
            if (c197039127h2 == null) {
                c197039127h2 = null;
            }
            c197039127h2.setText(getString(2131848575));
        }
        CheckBox checkBox = this.LLJILJILJ;
        if (checkBox == null) {
            checkBox = null;
        }
        C786410Ut5.v7(checkBox, new C0IDS(this, 0));
        View view = this.LLJJIII;
        if (view == null) {
            view = null;
        }
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 1), view);
        if (VR() && !C1245160iVW.LIZ((User) this.LLJLLIL.getValue())) {
            ViewGroup.LayoutParams layoutParams = ((View) this.LLJI.getValue()).getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                C786410Ut5.X5(marginLayoutParams, (ViewGroup) this.LLJI.getValue());
            }
            C786410Ut5.LJLZ(0, (ViewGroup) this.LLJIJIL.getValue());
            C786410Ut5.K7((ViewGroup) this.LLJIJIL.getValue(), new ACListenerS141S0100000_6(this, 2));
        }
        C19EG activity = getActivity();
        if (activity == null || !SocialAvatarAISelfCompatibilityConfig.LIZ()) {
            return;
        }
        C0HYP.LIZ.getClass();
        if (!(!C0HYP.LJ().getBoolean("has_shown_aiself_compatibility_popup", false))) {
            ((C1910890zpH) this.LLJLILLLLZIIL.getValue()).LIZ("AvatarReviewFragment", "sa_aiself_compatibility_sheet has already shown");
            return;
        }
        C437560HDu c437560HDu = (C437560HDu) ((ISocialAvatarCreationStatusService) this.LLJL.getValue()).LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()).getValue();
        if (!c437560HDu.LJI) {
            C1910890zpH c1910890zpH = (C1910890zpH) this.LLJLILLLLZIIL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sa_aiself_compatibility_sheet isAISelfSideTask = ");
            sbLIZ.append(c437560HDu);
            sbLIZ.append(".isAISelfSideTask");
            c1910890zpH.LIZ("AvatarReviewFragment", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        String str2 = c437560HDu.LJII;
        if (str2 == null || (str = c437560HDu.LJIIIIZZ) == null) {
            return;
        }
        C1910890zpH c1910890zpH2 = (C1910890zpH) this.LLJLILLLLZIIL.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sa_aiself_compatibility_sheet has been triggered saPreviewUrl: ");
        sbLIZ2.append(str2);
        sbLIZ2.append(", aiselfPreviewUrl: ");
        sbLIZ2.append(str);
        c1910890zpH2.LIZ("AvatarReviewFragment", C2188811AlT.LIZIZ(sbLIZ2));
        PopupManager.LJIIZILJ(new C342720Dc6(activity, str2, str, getEnterFrom(), new AwS407S0200000_6(this, activity, 0)), new C1668306g5("social_sa_aiself_compatibility_sheet"));
    }

    public final String getEnterFrom() {
        return (String) this.LLJJJJJIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void WR() {
        C0HFD c0hfd;
        C0HFS c0hfs;
        C0HNI c0hni = (C0HNI) UR().getState();
        C436960HBm c436960HBm = c0hni.LLILLL;
        if (c436960HBm == null || (c0hfd = c0hni.LLILZ) == null || (c0hfs = c0hfd.LIZ) == null) {
            return;
        }
        C054G c054g = C0HDU.LIZ;
        boolean zVR = VR();
        boolean z = c0hni.LLILZLL;
        Long l = c0hni.LLILZIL;
        C23250099c.LIZLLL(C0HDU.LIZ, null, null, new C0HDO(c436960HBm, c0hfs, z, false, l != null ? l.longValue() : 0L, ((ArrayList) UR().LL).size(), zVR, false, new C0HDQ(getEnterFrom(), c0hni.LLJILJIL, c0hni.LL, UR().zQ2(), UR().yQ2()), null), 3);
    }

    public final void SR(boolean z) {
        C0HYP.LIZ.getClass();
        C0HYP.LJ().erase("review_page_preloading_times");
        if (VR() || !z) {
            C0HYP.LJ().storeBoolean("should_refresh_profile_self", true);
            if (!z && isAdded()) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(requireContext(), "//main");
                smartRouteBuildRoute.addFlags(536870912);
                smartRouteBuildRoute.addFlags(67108864);
                smartRouteBuildRoute.withParam("uid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
                smartRouteBuildRoute.open();
            }
        }
        SocialAvatarEditViewModel socialAvatarEditViewModelUR = UR();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId != null) {
            C437190HCj.LIZIZ(curUserId, null);
        }
        List<InterfaceC1320200kSY<Void>> list = socialAvatarEditViewModelUR.LLILZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(Boolean.valueOf(((InterfaceC1320200kSY) it2.next()).close()));
        }
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void initView(View view) {
        this.LLJJ = view.findViewById(R.id.bk4);
        this.LLJJI = view.findViewById(R.id.bjc);
        this.LLIZ = (C1390130mHL) view.findViewById(R.id.nnp);
        this.LLJJIII = view.findViewById(R.id.lrt);
        this.LLJILJIL = (TuxIconView) view.findViewById(R.id.hfi);
        this.LLJ = (C197039127h) view.findViewById(R.id.zex);
        this.LLJJIJI = view.findViewById(R.id.ccd);
        this.LLJJIJIIJIL = (TuxIconView) view.findViewById(R.id.goo);
        this.LLJILJILJ = (CheckBox) view.findViewById(R.id.rm3);
        this.LLJILLL = view.findViewById(R.id.rj8);
        this.LLJJIJIL = view.findViewById(R.id.c4g);
    }

    public final void cS(boolean z, boolean z2) {
        C1390130mHL c1390130mHL;
        View view = null;
        if (z) {
            C1390130mHL c1390130mHL2 = this.LLIZ;
            if (c1390130mHL2 != null) {
                C786410Ut5.LLZ(c1390130mHL2, 0);
            }
            if (z2 && (c1390130mHL = this.LLIZ) != null) {
                c1390130mHL.setMessage(2131846827);
            }
            View view2 = this.LLJJIJIL;
            if (view2 != null) {
                view = view2;
            }
            C786410Ut5.LJLLLLLL(0, view);
            return;
        }
        C1390130mHL c1390130mHL3 = this.LLIZ;
        if (c1390130mHL3 != null) {
            C786410Ut5.LLZ(c1390130mHL3, 4);
        }
        View view3 = this.LLJJIJIL;
        if (view3 != null) {
            view = view3;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    public final void dS(Context context, boolean z) {
        cS(true, false);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0HDG(z, this, context, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void gS(String str, Function0<Unit> function0) {
        C0HWW.LIZ.getClass();
        String str2 = null;
        C0HWW.LJJIFFI("start", str, null);
        C0HNI c0hni = (C0HNI) UR().getState();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (C2277121EBa.LIZ() && c0hni.LLJIJIL) {
            C437480HDm.LIZ.getClass();
            if (!C437480HDm.LIZ(curUserId)) {
                Context context = getContext();
                if (context != null) {
                    int iLIZIZ = C2277121EBa.LIZIZ();
                    String quantityString = context.getResources().getQuantityString(2131755714, iLIZIZ, Integer.valueOf(iLIZIZ));
                    if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                        C632670Orh.LIZIZ(context, new C19719212De(-2122292113, new C0HLX(quantityString, this, context, function0), true));
                    } else {
                        C1397580mTM c1397580mTM = new C1397580mTM(context);
                        c1397580mTM.LJFF(2131848581);
                        c1397580mTM.LIZIZ(quantityString);
                        C985403tE.LIZ(c1397580mTM, new AwS215S0300000_6(this, (SocialAvatarReviewFragment) context, (Context) function0, (Function0<Unit>) 12));
                        new C1397510mTF(c1397580mTM).LIZLLL();
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("action_type", "show");
                    c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
                    C20684815ws.LJIILLIIL("ttsocial_avatar_try_new_look_popup", c2344009Gk.LIZ);
                    C0HWW.LJJIFFI("success", str, null);
                    return;
                }
                function0.invoke();
                return;
            }
        }
        if (!c0hni.LLJ) {
            str2 = "network_timeout";
        } else if (!c0hni.LLJI) {
            str2 = "network_error";
        } else if (!c0hni.LLJIJIL) {
            str2 = "hit_quota";
        } else {
            C437480HDm.LIZ.getClass();
            if (C437480HDm.LIZ(curUserId)) {
                str2 = "in_generating";
            }
        }
        C0HWW.LJJIFFI("fail", str, str2);
        function0.invoke();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("SocialAvatar", "SocialAvatarReviewFragment onViewCreated");
        super.onViewCreated(view, bundle);
        this.LLJLL = Long.valueOf(SystemClock.elapsedRealtime());
        if (VR()) {
            str = "edit_social_avatar_page";
        } else {
            str = "edit_social_avatar_detail_page";
        }
        this.LLJJJ = str;
        try {
            initView(view);
            C723850SaN.LIZ(this, false, null, new AwS585S0100000_6(this, 2), 3);
            if (((Number) this.LLJJJJ.getValue()).intValue() != 7) {
                aS();
                bS();
                ZR();
                return;
            }
            throw new Exception("The latest social avatar has been deleted");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            UR().setState(AFwS236S0000000_6.get$arr$(3));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("SocialAvatar", "SocialAvatarReviewFragment onCreateView");
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.eds, viewGroup, false);
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
