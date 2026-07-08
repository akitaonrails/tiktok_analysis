package com.ss.android.ugc.now.interaction.ui;

import X.AbstractC1387200mCc;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0QSJ;
import X.C0SUC;
import X.C0SXF;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1349760lEE;
import X.C1350960lGA;
import X.C1352310lIL;
import X.C1352320lIM;
import X.C1352330lIN;
import X.C1352460lIa;
import X.C1352780lJ6;
import X.C1353070lJZ;
import X.C13IQ;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C15O7;
import X.C1612650s4F;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C1906580ziK;
import X.C19474211Gy;
import X.C19651011uW;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2277711EDh;
import X.C2344009Gk;
import X.C338490DOt;
import X.C426750GoL;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C735840Sti;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C844470XAv;
import X.C987103tV;
import X.CallableC1352770lJ5;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1352370lIR;
import X.InterfaceC1352410lIV;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.INearbyFeedService;
import com.ss.android.ugc.nearby.api.INearbyMobService;
import com.ss.android.ugc.now.interaction.CommentListFragmentScope;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.assem.CommentListVM;
import com.ss.android.ugc.now.interaction.assem.IFakeKeyboardInputAssemAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS34S0010000_21;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.AwS79S0500000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class NowCommentListFragment extends AbsFragment implements InterfaceC1352410lIV, InterfaceC724530SbT, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZisjPmE6JjEpOy4wHELIOSPCwjJ2EmIWsCJjgQJyghLCEnBCw/PQkhKSIhLCEn";
    public ViewOnAttachStateChangeListenerC20604515jv LL;
    public C1749280vcc LLILLJJLI;
    public LinearLayout LLILLL;
    public ViewGroup LLILZ;
    public TuxTextView LLILZIL;
    public View LLILZLL;
    public boolean LLIZ;
    public NowFeedMobHierarchyData LLIZLLLIL;
    public Aweme LLJ;
    public final AssemVMLazy LLJI;
    public long LLJIJIL;
    public final C01GW LLJILJIL;
    public C1353070lJZ LLJILJILJ;
    public Integer LLJILLL;
    public String LLJJ;
    public boolean LLJJI;
    public Comment LLJJIII;
    public String LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NowCommentListFragment.class, "commentListVM", "getCommentListVM()Lcom/ss/android/ugc/now/interaction/assem/CommentListVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentListFragmentScope.class});
    }

    @Override // X.InterfaceC1352410lIV
    public final void dd(InterfaceC1352370lIR interfaceC1352370lIR) {
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
        arrayList.add(CommentListFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentListFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC1352410lIV
    public final void setAid(String str) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public NowCommentListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 2036);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(299);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1134), aFwS259S0000000_21, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS565S0100000_21((Fragment) this, 1135), aFwS259S0000000_21, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1136), aFwS259S0000000_21, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJI = assemVMLazy;
        this.LLJIJIL = -1L;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(NowKeyboardVM.class);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS79S0500000_19(this, c19719912DlLIZ2, new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 823), AFwS259S0000000_21.get$arr$(388), (Function0) null, 28));
        this.LLJILLL = 0;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1137));
    }

    public final CommentListVM MR() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (CommentListVM) assemVMLazy.getValue();
    }

    public final NowKeyboardVM NR() {
        return (NowKeyboardVM) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC1352410lIV
    public final String Nu() {
        Aweme aweme;
        AwemeStatistics statistics;
        Aweme aweme2 = this.LLJ;
        long commentCount = ((aweme2 != null && C1352310lIL.LIZIZ(aweme2)) || (aweme = this.LLJ) == null || (statistics = aweme.getStatistics()) == null) ? 0L : statistics.getCommentCount();
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ().getResources().getQuantityString(2131755431, (int) commentCount, Long.valueOf(commentCount));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OR() {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.ui.NowCommentListFragment.OR():void");
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1352780lJ6 c1352780lJ6 = MR().LLJ;
        c1352780lJ6.getClass();
        C15O7.LIZJ(new CallableC1352770lJ5(c1352780lJ6, null));
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MR().LLJ.LIZ();
    }

    @Override // X.InterfaceC1352410lIV
    public final ViewOnAttachStateChangeListenerC20604515jv wd() {
        return this.LL;
    }

    @Override // X.InterfaceC1352410lIV
    public final void OA(Aweme aweme) {
        this.LLJ = aweme;
        this.LLJILLL = Integer.valueOf(aweme.getCommentSetting());
    }

    @Override // X.InterfaceC1352410lIV
    public final void lg(NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        IFakeKeyboardInputAssemAbility iFakeKeyboardInputAssemAbility;
        this.LLIZLLLIL = nowFeedMobHierarchyData;
        View view = getView();
        if (view != null && (iFakeKeyboardInputAssemAbility = (IFakeKeyboardInputAssemAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IFakeKeyboardInputAssemAbility.class, null)) != null) {
            iFakeKeyboardInputAssemAbility.dr(new C1352460lIa(this.LLJ, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLIZLLLIL, this.LLJJIJI, 64));
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02d8 A[PHI: r1
      0x02d8: PHI (r1v33 java.lang.String) = (r1v13 java.lang.String), (r1v34 java.lang.String) binds: [B:46:0x00f7, B:44:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d A[PHI: r1
      0x010d: PHI (r1v31 java.lang.String) = (r1v15 java.lang.String), (r1v32 java.lang.String) binds: [B:53:0x010b, B:51:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113 A[PHI: r1
      0x0113: PHI (r1v30 java.lang.String) = (r1v15 java.lang.String), (r1v31 java.lang.String) binds: [B:53:0x010b, B:55:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1352410lIV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z4(X.C19EG r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.ui.NowCommentListFragment.Z4(X.19EG, java.lang.String):void");
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C1749280vcc c1749280vcc;
        LinearLayout linearLayout;
        TuxTextView tuxTextView;
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        View view2 = getView();
        ViewGroup viewGroup = null;
        if (view2 != null) {
            viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view2.findViewById(R.id.t0h);
        } else {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        this.LL = viewOnAttachStateChangeListenerC20604515jv;
        View view3 = getView();
        if (view3 != null) {
            view3.findViewById(R.id.title);
        }
        View view4 = getView();
        if (view4 != null) {
            c1749280vcc = (C1749280vcc) view4.findViewById(R.id.edk);
        } else {
            c1749280vcc = null;
        }
        this.LLILLJJLI = c1749280vcc;
        View view5 = getView();
        if (view5 != null) {
            linearLayout = (LinearLayout) view5.findViewById(R.id.nk6);
        } else {
            linearLayout = null;
        }
        this.LLILLL = linearLayout;
        View view6 = getView();
        if (view6 != null) {
            tuxTextView = (TuxTextView) view6.findViewById(R.id.e9t);
        } else {
            tuxTextView = null;
        }
        this.LLILZIL = tuxTextView;
        View view7 = getView();
        if (view7 != null) {
            viewFindViewById = view7.findViewById(R.id.eah);
        } else {
            viewFindViewById = null;
        }
        this.LLILZLL = viewFindViewById;
        C723850SaN.LIZ(this, false, null, new AwS368S0200000_2(this, view, 146), 3);
        View view8 = getView();
        if (view8 != null) {
            viewGroup = (ViewGroup) view8.findViewById(R.id.eaw);
        }
        this.LLILZ = viewGroup;
        LinearLayout linearLayout2 = this.LLILLL;
        if (linearLayout2 != null) {
            C426750GoL.LJIIIZ(linearLayout2, null, null, null, 0, false, 23);
        }
        OR();
        C736680Sv4.LJIIIIZZ(this, NR(), new C2217381BqS() { // from class: X.0lI1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 169), 4);
        CommentListVM commentListVMMR = MR();
        commentListVMMR.LLJ.LJ = true;
        commentListVMMR.setStateImmediate(new AwS34S0010000_21(true, 10));
        NowKeyboardVM nowKeyboardVMNR = NR();
        nowKeyboardVMNR.getClass();
        nowKeyboardVMNR.setState(new AwS34S0010000_21(true, 18));
        this.LLJIJIL = System.currentTimeMillis();
        if (getActivity() != null) {
            NR().wQ2(this.LLJ);
        }
    }

    @Override // X.InterfaceC1352410lIV
    public final void zD(String str, String str2) {
        String enterFrom;
        Integer numValueOf;
        String str3;
        Integer numIsNowClear;
        Activity activityLIZIZ;
        Activity activityLIZIZ2;
        Activity activityLIZIZ3;
        String enterFrom2;
        String str4;
        Integer numValueOf2;
        C1349760lEE.LIZ("CommentListFragment", "onCommentPageDismiss");
        Aweme aweme = this.LLJ;
        if (aweme != null) {
            CommentListVM commentListVMMR = MR();
            commentListVMMR.LLJ.LJ = false;
            commentListVMMR.setStateImmediate(new AwS34S0010000_21(false, 10));
            NowKeyboardVM nowKeyboardVMNR = NR();
            nowKeyboardVMNR.getClass();
            nowKeyboardVMNR.setState(new AwS34S0010000_21(false, 18));
            NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LLIZLLLIL;
            if (nowFeedMobHierarchyData != null) {
                enterFrom = nowFeedMobHierarchyData.getEnterFrom();
            } else {
                enterFrom = null;
            }
            String aid = aweme.getAid();
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            User author = aweme.getAuthor();
            if (author != null) {
                numValueOf = Integer.valueOf(author.getFollowStatus());
            } else {
                numValueOf = null;
            }
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo != null) {
                str3 = nowPostInfo.nowMediaType;
            } else {
                str3 = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJIJIL;
            NowFeedMobHierarchyData nowFeedMobHierarchyData2 = this.LLIZLLLIL;
            if (nowFeedMobHierarchyData2 != null) {
                numIsNowClear = nowFeedMobHierarchyData2.isNowClear();
            } else {
                numIsNowClear = null;
            }
            C2277711EDh c2277711EDh = C2277711EDh.LIZIZ;
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
            c2344009Gk.LJIIIIZZ("group_id", aid);
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            c2344009Gk.LJ(numValueOf, "follow_status");
            c2344009Gk.LJIIIIZZ("action_type", str);
            c2344009Gk.LJIIIIZZ("now_type", str3);
            c2344009Gk.LJIIIIZZ("enter_method", str2);
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
            c2344009Gk.LJ(numIsNowClear, "is_now_clear");
            Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c2344009Gk);
            c735840Sti.getClass();
            C735840Sti.LIZIZ(aweme, objLJIIIZ);
            C2344009Gk c2344009Gk2 = (C2344009Gk) objLJIIIZ;
            C0SXF.LJ(c2344009Gk2, aweme, enterFrom);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null) {
                activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            C2344009Gk c2344009Gk3 = (C2344009Gk) c2277711EDh.LJJIIJ(c2277711EDh.LJJIZ(c2344009Gk2, C0SUC.LIZ(activityLIZIZ)));
            AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ2 != null) {
                activityLIZIZ2 = abstractC1387200mCcLIZIZ2.LIZIZ();
            } else {
                activityLIZIZ2 = null;
            }
            AbstractC1387200mCc abstractC1387200mCcLIZIZ3 = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ3 != null) {
                activityLIZIZ3 = abstractC1387200mCcLIZIZ3.LIZIZ();
            } else {
                activityLIZIZ3 = null;
            }
            C0SXF.LJIIIZ(c2344009Gk3, aweme, activityLIZIZ2, C0SUC.LIZ(activityLIZIZ3), Boolean.FALSE);
            C2344009Gk c2344009Gk4 = (C2344009Gk) C1612650s4F.LIZIZ(c2344009Gk3, aweme);
            if (Intrinsics.LJFF(enterFrom, "homepage_nearby")) {
                HashMap<String, String> map = new HashMap<>();
                ((INearbyMobService) ServiceManager.get().getService(INearbyFeedService.class)).LIZJ(enterFrom, map, aweme, false);
                if (!map.isEmpty()) {
                    c2344009Gk4.LJI(map);
                }
            }
            C20684815ws.LJIILLIIL("close_comment", c2344009Gk4.LIZ);
            if (C1352310lIL.LIZJ(aweme)) {
                NowFeedMobHierarchyData nowFeedMobHierarchyData3 = this.LLIZLLLIL;
                if (nowFeedMobHierarchyData3 != null) {
                    enterFrom2 = nowFeedMobHierarchyData3.getEnterFrom();
                } else {
                    enterFrom2 = null;
                }
                NowPostInfo nowPostInfo2 = aweme.nowPostInfo;
                if (nowPostInfo2 != null) {
                    str4 = nowPostInfo2.nowMediaType;
                } else {
                    str4 = null;
                }
                String aid2 = aweme.getAid();
                String authorUid2 = AwemeExtKt.getAuthorUid(aweme);
                User author2 = aweme.getAuthor();
                if (author2 != null) {
                    numValueOf2 = Integer.valueOf(author2.getFollowStatus());
                } else {
                    numValueOf2 = null;
                }
                C1350960lGA.LIZIZ(numValueOf2, enterFrom2, "comment", str2, str4, str, aid2, authorUid2);
            }
            C1352320lIM c1352320lIM = C1352320lIM.LIZ;
            String aid3 = aweme.getAid();
            c1352320lIM.getClass();
            Map<String, C1352330lIN> map2 = C1352320lIM.LIZIZ;
            C1352330lIN c1352330lIN = (C1352330lIN) ((LinkedHashMap) map2).get(aid3);
            if (c1352330lIN != null) {
                long j = c1352330lIN.LJ;
                if (j != 0) {
                    String str5 = c1352330lIN.LJFF;
                    if (str5 == null) {
                        str5 = "";
                    }
                    long j2 = c1352330lIN.LIZIZ;
                    long j3 = j2 - c1352330lIN.LIZ;
                    long j4 = c1352330lIN.LIZJ;
                    long j5 = c1352330lIN.LIZLLL - j2;
                    C2344009Gk c2344009Gk5 = new C2344009Gk();
                    c2344009Gk5.LJFF("enter_method", str5);
                    c2344009Gk5.LIZLLL(j3, "to_show_comment_list_duration");
                    c2344009Gk5.LIZLLL(j4 - j2, "to_request_time");
                    c2344009Gk5.LIZLLL(j5, "to_page_show_duration");
                    c2344009Gk5.LIZLLL(j - j4, "request_duration");
                    C20684815ws.LJIILLIIL("now_interaction_panel_first_load_android", c2344009Gk5.LIZ);
                    map2.remove(aid3);
                }
            }
            this.LLJIJIL = -1L;
            C1352780lJ6 c1352780lJ6 = MR().LLJ;
            c1352780lJ6.getClass();
            C15O7.LIZJ(new CallableC1352770lJ5(c1352780lJ6, null));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ctn, viewGroup, false);
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
