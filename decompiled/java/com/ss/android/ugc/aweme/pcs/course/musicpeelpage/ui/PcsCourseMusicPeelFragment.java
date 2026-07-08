package com.ss.android.ugc.aweme.pcs.course.musicpeelpage.ui;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0JI7;
import X.C0JIA;
import X.C0JNP;
import X.C0JO7;
import X.C0ZP4;
import X.C1161920gLG;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1390410mHn;
import X.C13LE;
import X.C1481290oeN;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C16FS;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C1A6V;
import X.C1DFT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C490810JMp;
import X.C497740JfY;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC489200JGk;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.ss.android.ugc.aweme.pcs.course.musicpeelpage.viewmodel.PcsCourseMusicPeelVM;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseMusicPeelFragment extends BaseFragment implements InterfaceC724530SbT, C0JNP {
    public static final C0JIA LLJJIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUvOmEwJzA+Oip9JTA/ICHELIOSwjLSAgOS40LWs5IGEDKzYPJjohOyABPDw6KxUpLCMVOiQrJCo9PA==";
    public C0JO7 LL;
    public C197039127h LLILLJJLI;
    public C16FS LLILLL;
    public View LLILZ;
    public LiveIconView LLILZIL;
    public C1390410mHn LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public LiveIconView LLJI;
    public boolean LLJIJIL;
    public InterfaceC489200JGk LLJILJIL;
    public final C736950SvV LLJILJILJ;
    public C0JI7 LLJILLL;
    public final AssemVMLazy LLJJ;
    public final C490810JMp LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsCourseMusicPeelFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/pcs/course/musicpeelpage/viewmodel/PcsCourseMusicPeelVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIII = new C0JIA();
    }

    @Override // X.C0JNP
    public final void Cq() {
    }

    @Override // X.C0JNP
    public final void IO(C1481290oeN c1481290oeN, float f) {
    }

    @Override // X.C0JNP
    public final void JG() {
    }

    @Override // X.C0JNP
    public final void LLLLILI() {
    }

    @Override // X.C0JNP
    public final void XI() {
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

    @Override // X.C0JNP
    public final void jJ() {
    }

    @Override // X.C0JNP
    public final void onPlayerPause() {
    }

    @Override // X.C0JNP
    public final void re(boolean z) {
    }

    public PcsCourseMusicPeelFragment() {
        AssemVMLazy assemVMLazy;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCourseManageVM.class);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(161);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, false);
        C451620HnM c451620HnM = new C451620HnM(this, true);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJILJILJ = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS237S0000000_7, c451460Hn6, c451620HnM, c338520DOw);
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PcsCourseMusicPeelVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ2, 394);
        AFwS237S0000000_7 aFwS237S0000000_72 = AFwS237S0000000_7.get$arr$(160);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS551S0100000_7, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 395), aFwS237S0000000_72, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 396), aFwS237S0000000_72, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS551S0100000_7, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 397), aFwS237S0000000_72, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJ = assemVMLazy;
        this.LLJJI = new C490810JMp();
    }

    public final C16FS NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.a23) : null;
            this.LLILLL = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    public final View OR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.eux) : null;
            this.LLIZ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View PR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hbx) : null;
            this.LLJ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View RR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nlo) : null;
            this.LLIZLLLIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C0JI7 SR() {
        if (this.LLJILLL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C0JI7.class, null);
            this.LLJILLL = interfaceC1555100qZQLIZIZ != null ? (C0JI7) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJILLL;
    }

    public final C0JO7 UR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.video_player) : null;
            this.LL = (C0JO7) viewFindViewById;
        }
        return (C0JO7) viewFindViewById;
    }

    public final PcsCourseMusicPeelVM VR() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (PcsCourseMusicPeelVM) assemVMLazy.getValue();
    }

    public final void WR() {
        Uri.Builder builderPath = new Uri.Builder().scheme("sslocal").authority("webcast_pcs").path("course");
        C0JI7 c0ji7SR = SR();
        Uri.Builder builderAppendQueryParameter = builderPath.appendQueryParameter("show_entrance", c0ji7SR != null ? c0ji7SR.LL : null);
        C0JI7 c0ji7SR2 = SR();
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("course_id", String.valueOf(c0ji7SR2 != null ? Long.valueOf(c0ji7SR2.LLILLJJLI) : null));
        C0JI7 c0ji7SR3 = SR();
        String string = builderAppendQueryParameter2.appendQueryParameter("anchor_id", String.valueOf(c0ji7SR3 != null ? Long.valueOf(c0ji7SR3.LLILZ) : null)).build().toString();
        C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJJ(0, 0);
        c19ehLJIIJ.LJIIIZ();
        getParentFragmentManager().LJLLL();
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(getContext(), string, new Bundle());
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C490810JMp c490810JMp = this.LLJJI;
        c490810JMp.LLILZIL.release();
        ((C1DFT) c490810JMp.LLILLL.getValue()).close();
        ((ExecutorService) c490810JMp.LLILLJJLI.getValue()).shutdown();
        super.onDestroy();
    }

    @Override // X.C0JNP
    public final void K3() {
        VR().wQ2("click", "pause");
    }

    @Override // X.C0JNP
    public final void Pa() {
        VR().wQ2("click", "resume");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        Window window = requireActivity().getWindow();
        if (window != null) {
            new C1A6V(window, window.getDecorView()).LIZJ(this.LLJIJIL);
        }
        super.onPause();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Window window = requireActivity().getWindow();
        if (window != null) {
            C1A6V c1a6v = new C1A6V(window, window.getDecorView());
            this.LLJIJIL = c1a6v.LIZ.LIZIZ();
            window.setStatusBarColor(C497740JfY.LIZLLL(R.attr.c95, getContext()));
            c1a6v.LIZJ(false);
            window.setNavigationBarColor(C497740JfY.LIZLLL(R.attr.c95, getContext()));
        }
    }

    @Override // X.C0JNP
    public final void v8() {
        VR().wQ2("click", "slide");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039 A[PHI: r1
      0x0039: PHI (r1v4 android.view.View) = (r1v3 android.view.View), (r1v6 android.view.View) binds: [B:16:0x0028, B:21:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071 A[PHI: r0
      0x0071: PHI (r0v5 android.view.View) = (r0v4 android.view.View), (r0v8 android.view.View) binds: [B:29:0x0060, B:34:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConfigurationChanged(android.content.res.Configuration r9) {
        /*
            r8 = this;
            super.onConfigurationChanged(r9)
            int r1 = r9.orientation
            r6 = 0
            r7 = 1
            if (r1 == r7) goto Lf
            r0 = 2
            if (r1 == r0) goto Ld
            return
        Ld:
            r5 = 0
            goto L10
        Lf:
            r5 = 1
        L10:
            boolean r1 = X.C500260Jjc.LJJII(r5)
            X.19EG r0 = r8.getActivity()
            if (r0 == 0) goto L49
            android.view.Window r4 = r0.getWindow()
            if (r4 == 0) goto L49
            r3 = 2131375007(0x7f0a339f, float:1.837015E38)
            r2 = 0
            if (r1 == 0) goto L5e
            android.view.View r1 = r8.LLILZ
            if (r1 != 0) goto L39
            android.view.View r0 = r8.getView()
            if (r0 == 0) goto L34
            android.view.View r2 = r0.findViewById(r3)
        L34:
            r8.LLILZ = r2
            r1 = r2
            if (r2 == 0) goto L3d
        L39:
            r0 = 4
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L3d:
            android.view.View r1 = r4.getDecorView()
            r0 = 4102(0x1006, float:5.748E-42)
            r1.setSystemUiVisibility(r0)
            X.C0DRA.LIZ(r4, r6)
        L49:
            X.0JO7 r0 = r8.UR()
            if (r0 == 0) goto L5d
            r0.LIZIZ(r5)
            X.0JNE r0 = r0.LLILZIL
            X.0D0u<java.lang.Integer> r1 = r0.LJIIJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.setValue(r0)
        L5d:
            return
        L5e:
            android.view.View r0 = r8.LLILZ
            if (r0 != 0) goto L71
            android.view.View r0 = r8.getView()
            if (r0 == 0) goto L6c
            android.view.View r2 = r0.findViewById(r3)
        L6c:
            r8.LLILZ = r2
            r0 = r2
            if (r2 == 0) goto L74
        L71:
            X.C500260Jjc.LLFFF(r0)
        L74:
            android.view.View r0 = r4.getDecorView()
            r0.setSystemUiVisibility(r6)
            X.C0DRA.LIZ(r4, r7)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pcs.course.musicpeelpage.ui.PcsCourseMusicPeelFragment.onConfigurationChanged(android.content.res.Configuration):void");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        long j;
        long j2;
        String string;
        super.onCreate(bundle);
        String string2 = null;
        VR().LL = C1558360qeg.LJFF(this, null);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string2 = arguments.getString("enter_from");
        }
        if (string2 == null) {
            string2 = "";
        }
        Bundle arguments2 = getArguments();
        long j3 = -1;
        if (arguments2 != null) {
            j = arguments2.getLong("course_id");
        } else {
            j = -1;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            j2 = arguments3.getLong("video_id");
        } else {
            j2 = -1;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            j3 = arguments4.getLong("anchor_id");
        }
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (string = arguments5.getString("player_intent")) == null) {
            string = "";
        }
        C1554960qZC.LIZ(interfaceC665370Q7zLJFF, new C0JI7(string2, j, j2, j3, string, this.LLJILJIL), C0JI7.class, "source_default_key");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007d A[PHI: r3
      0x007d: PHI (r3v5 android.view.View) = (r3v4 android.view.View), (r3v14 android.view.View) binds: [B:27:0x0067, B:32:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pcs.course.musicpeelpage.ui.PcsCourseMusicPeelFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dd7, viewGroup, false);
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
