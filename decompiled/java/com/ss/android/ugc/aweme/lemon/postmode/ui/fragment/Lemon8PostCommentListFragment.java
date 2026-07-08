package com.ss.android.ugc.aweme.lemon.postmode.ui.fragment;

import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0QSJ;
import X.C0VWN;
import X.C0ZP4;
import X.C1011940cRM;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C12ES;
import X.C1308910kAL;
import X.C1341040l0A;
import X.C1341050l0B;
import X.C1355870lO5;
import X.C1355880lO6;
import X.C1355900lO8;
import X.C1355910lO9;
import X.C1355930lOB;
import X.C1355960lOE;
import X.C1356160lOY;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C1ER1;
import X.C20684815ws;
import X.C21146717pB;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C338520DOw;
import X.C443940Hay;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C641850PFn;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1258040iqI;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC687730QyJ;
import X.InterfaceC722730SWp;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.AObserverS216S0100000_12;
import Y.AObserverS224S0100000_21;
import Y.ARunnableS112S0100000_12;
import Y.AsS48S0100000_21;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commentv2.CommentPageScope;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentFloatAdAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentExposureAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.lemon.postmode.ui.activity.Lemon8PostDetailActivity;
import com.ss.android.ugc.aweme.lemon.postmode.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.lemon.postmode.viewmodel.PostModeContainerViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class Lemon8PostCommentListFragment extends AbsFragment implements InterfaceC724530SbT, InterfaceC1258040iqI, C0QSJ, InterfaceC1146704e9 {
    public static final C1355900lO8 LLJJIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZikpJCA9ZjUjOjs+JyEpZzHELIOSo6ZiM+KCg+LSs4ZwM2JSoicR88OzEPJiI+LSs4BSYgPAM+KCg+LSs4";
    public int LLILLL;
    public boolean LLILZ;
    public PostModeDetailParams LLILZIL;
    public C1355930lOB LLIZ;
    public ViewGroup LLIZLLLIL;
    public WrapLinearLayoutManager LLJ;
    public Aweme LLJI;
    public View LLJILJIL;
    public ICommentFloatAdAbility LLJILJILJ;
    public ICommentListAssemAbility LLJILLL;
    public ICommentExposureAbility LLJJ;
    public ICommentListVMAbility LLJJI;
    public final C01GW LL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 682));
    public final C736950SvV LLILLJJLI = new C736950SvV(C13LE.LIZ(PhotoSharedViewModel.class), new AwS565S0100000_21((Fragment) this, 1485), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(410), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    public final C1355910lO9 LLILZLL = new C1355910lO9();
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 681));

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0lO8] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(Lemon8PostCommentListFragment.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/lemon/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIII = new Object() { // from class: X.0lO8
        };
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == ICommentFloatAdAbility.class) {
            this.LLJILJILJ = (ICommentFloatAdAbility) obj;
        } else if (cls == ICommentListAssemAbility.class) {
            this.LLJILLL = (ICommentListAssemAbility) obj;
        } else if (cls == ICommentExposureAbility.class) {
            this.LLJJ = (ICommentExposureAbility) obj;
        } else if (cls == ICommentListVMAbility.class) {
            this.LLJJI = (ICommentListVMAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentPageScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == ICommentFloatAdAbility.class) {
            return this.LLJILJILJ;
        }
        if (cls == ICommentListAssemAbility.class) {
            return this.LLJILLL;
        }
        if (cls == ICommentExposureAbility.class) {
            return this.LLJJ;
        }
        if (cls == ICommentListVMAbility.class) {
            return this.LLJJI;
        }
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
        arrayList.add(CommentPageScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentPageScope.class);
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
        if (cls == ICommentFloatAdAbility.class) {
            this.LLJILJILJ = null;
        } else if (cls == ICommentListAssemAbility.class) {
            this.LLJILLL = null;
        } else if (cls == ICommentExposureAbility.class) {
            this.LLJJ = null;
        } else if (cls == ICommentListVMAbility.class) {
            this.LLJJI = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final C1341050l0B MR() {
        C1355910lO9 c1355910lO9 = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        if (c1355910lO9.LIZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C1341050l0B.class, null);
            c1355910lO9.LIZ = interfaceC1555100qZQLIZIZ != null ? (C1341050l0B) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return c1355910lO9.LIZ;
    }

    public final PhotoSharedViewModel NR() {
        return (PhotoSharedViewModel) this.LLILLJJLI.getValue();
    }

    public final void OR() {
        C1341040l0A commonModel;
        C1341040l0A commonModel2;
        if (this.LLILZ) {
            return;
        }
        C1356160lOY c1356160lOY = C1356160lOY.LIZ;
        Aweme aweme = this.LLJI;
        C1341050l0B c1341050l0BMR = MR();
        String enterMethod = null;
        String enterFrom = (c1341050l0BMR == null || (commonModel2 = c1341050l0BMR.getCommonModel()) == null) ? null : commonModel2.getEnterFrom();
        C1341050l0B c1341050l0BMR2 = MR();
        if (c1341050l0BMR2 != null && (commonModel = c1341050l0BMR2.getCommonModel()) != null) {
            enterMethod = commonModel.getEnterMethod();
        }
        c1356160lOY.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1355960lOE.LIZLLL(c2344009Gk, aweme);
        C1355960lOE.LIZ(c2344009Gk, aweme);
        C1355960lOE.LIZIZ(c2344009Gk, aweme);
        C641850PFn.LIZ(c2344009Gk, C1ER1.LIZIZ.fetchSearchParams(enterFrom, ""));
        c2344009Gk.LJFF("enter_from", enterFrom);
        c2344009Gk.LJFF("enter_method", enterMethod);
        C20684815ws.LJIILLIIL("click_comment_button", c2344009Gk.LIZ);
        this.LLILZ = true;
    }

    public final void PR() {
        List<InterfaceC1891350zJl> listItems;
        C1355930lOB c1355930lOB = this.LLIZ;
        int size = (c1355930lOB == null || (listItems = c1355930lOB.getListItems()) == null) ? 0 : listItems.size();
        if (!Intrinsics.LJFF(((PostModeContainerViewModel) this.LL.getValue()).LLILZLL.getValue(), Boolean.TRUE) && size > 1) {
            WrapLinearLayoutManager wrapLinearLayoutManager = this.LLJ;
            if (wrapLinearLayoutManager != null) {
                wrapLinearLayoutManager.LLILLJJLI = null;
            }
            C1355930lOB c1355930lOB2 = this.LLIZ;
            if (c1355930lOB2 != null) {
                HandlerHook.viewPost(c1355930lOB2, new ARunnableS112S0100000_12(this, 194));
            }
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        WrapLinearLayoutManager wrapLinearLayoutManager;
        super.onResume();
        if (getUserVisibleHint() && isVisible() && (wrapLinearLayoutManager = this.LLJ) != null) {
            wrapLinearLayoutManager.LLILLJJLI = new InterfaceC722730SWp() { // from class: X.0lO7
                @Override // X.InterfaceC722730SWp
                public final void LIZ() {
                    this.LIZ.PR();
                }
            };
        }
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        return this.LLIZ;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1355870lO5 c1355870lO5 = NR().LLILZ;
        if (c1355870lO5 != null) {
            c1355870lO5.LIZLLL = System.currentTimeMillis();
            c1355870lO5.LIZ();
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        C1355880lO6 c1355880lO6;
        Integer numValueOf;
        int iLJIIIIZZ;
        ViewGroup viewGroup;
        C1011940cRM c1011940cRM;
        FrameLayout frameLayout;
        Lemon8PostDetailActivity lemon8PostDetailActivity;
        int iIntValue;
        int iIntValue2;
        super.onViewCreated(view, bundle);
        PostModeDetailParams postModeDetailParams = NR().LLILLL;
        if (postModeDetailParams == null) {
            postModeDetailParams = new PostModeDetailParams(null, null, null, null, 0, null, null, false, null, 2047);
        }
        this.LLILZIL = postModeDetailParams;
        this.LLJI = NR().LLILLJJLI;
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable(FollowStatusChangeMethod.PARAM_UID);
        } else {
            serializable = null;
        }
        if (serializable instanceof C1355880lO6) {
            c1355880lO6 = (C1355880lO6) serializable;
        } else {
            c1355880lO6 = null;
        }
        C1341050l0B c1341050l0BMR = MR();
        Aweme aweme = this.LLJI;
        if (c1355880lO6 != null && c1341050l0BMR != null) {
            c1341050l0BMR.setCommonModel(new C1341040l0A(aweme, c1355880lO6.getEnterFrom(), c1355880lO6.getEnterMethod(), "graphic_detail", c1355880lO6.getEventType()));
        }
        this.LLIZ = (C1355930lOB) view.findViewById(R.id.t0h);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getContext());
        this.LLJ = wrapLinearLayoutManager;
        C1355930lOB c1355930lOB = this.LLIZ;
        if (c1355930lOB != null) {
            c1355930lOB.setLayoutManager(wrapLinearLayoutManager);
        }
        this.LLIZLLLIL = (ViewGroup) view.findViewById(R.id.i4h);
        C723850SaN.LIZ(this, false, null, new AwS600S0100000_21(this, 141), 3);
        C1355930lOB c1355930lOB2 = this.LLIZ;
        if (c1355930lOB2 != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, requireContext());
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = -1;
            }
            c1355930lOB2.setBackgroundColor(iIntValue2);
        }
        C1355930lOB c1355930lOB3 = this.LLIZ;
        if (c1355930lOB3 != null) {
            c1355930lOB3.addOnScrollListener(new AsS48S0100000_21(this, 7));
        }
        C1355930lOB c1355930lOB4 = this.LLIZ;
        if (c1355930lOB4 != null) {
            c1355930lOB4.addOnScrollListener(new AsS48S0100000_21(C0VWN.LIZ("lemon8_photomode_scroll", false), 3));
        }
        ((PostModeContainerViewModel) this.LL.getValue()).LLIZLLLIL.observe(getViewLifecycleOwner(), new AObserverS216S0100000_12(this, 113));
        ((PostModeContainerViewModel) this.LL.getValue()).LLILZ.observe(getViewLifecycleOwner(), new AObserverS224S0100000_21(this, 94));
        ((PostModeContainerViewModel) this.LL.getValue()).LLILZLL.observe(getViewLifecycleOwner(), new AObserverS224S0100000_21(this, 95));
        ViewGroup viewGroup2 = this.LLIZLLLIL;
        if (viewGroup2 != null) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, requireContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = -1;
            }
            viewGroup2.setBackgroundColor(iIntValue);
        }
        C1355930lOB c1355930lOB5 = this.LLIZ;
        if (c1355930lOB5 != null) {
            numValueOf = Integer.valueOf((int) ((c1355930lOB5.getUpperThreshold() + ((double) C443940Hay.LIZ(requireActivity()))) * 1.3d));
        } else {
            numValueOf = null;
        }
        ViewGroup viewGroup3 = this.LLIZLLLIL;
        ImageView imageView = new ImageView(requireContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10, -1);
        if (numValueOf != null) {
            iLJIIIIZZ = numValueOf.intValue();
        } else {
            iLJIIIIZZ = C12ES.LJIIIIZZ(requireContext()) / 3;
        }
        layoutParams.height = iLJIIIIZZ;
        C786410Ut5.c6(imageView, layoutParams);
        imageView.setBackgroundColor(-16777216);
        viewGroup3.addView(imageView, 0);
        C1355930lOB c1355930lOB6 = this.LLIZ;
        if (c1355930lOB6 != null) {
            c1355930lOB6.setOnDragOutOfBounds(new AwS585S0100000_6(imageView, 397));
        }
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(requireContext());
        View view2 = getView();
        if (view2 instanceof ViewGroup) {
            viewGroup = (ViewGroup) view2;
        } else {
            viewGroup = null;
        }
        View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.dah, viewGroup, false);
        if (!(viewTd instanceof FrameLayout)) {
            viewTd = null;
        }
        this.LLJILJIL = viewTd;
        Context contextRequireContext = requireContext();
        View view3 = this.LLJILJIL;
        if ((view3 instanceof FrameLayout) && (frameLayout = (FrameLayout) view3) != null) {
            try {
                C19EG c19egRequireActivity = requireActivity();
                if ((c19egRequireActivity instanceof Lemon8PostDetailActivity) && (lemon8PostDetailActivity = (Lemon8PostDetailActivity) c19egRequireActivity) != null) {
                    lemon8PostDetailActivity.LLLLLZL(contextRequireContext, frameLayout);
                }
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1355930lOB c1355930lOB7 = this.LLIZ;
        if (c1355930lOB7 != null) {
            c1355930lOB7.LJ(0, this.LLJILJIL);
        }
        View view4 = this.LLJILJIL;
        C1355930lOB c1355930lOB8 = this.LLIZ;
        if (view4 != null && (c1011940cRM = (C1011940cRM) view4.findViewById(R.id.qex)) != null && c1355930lOB8 != null) {
            c1355930lOB8.setOnHorizontalSlopExceeded(new AwS422S0200000_21(c1011940cRM, c1355930lOB8, 75));
            c1355930lOB8.setOnActionUpLambda(new AwS422S0200000_21(c1011940cRM, c1355930lOB8, 76));
        }
        C1355870lO5 c1355870lO5 = NR().LLILZ;
        if (c1355870lO5 != null) {
            c1355870lO5.LJ = System.currentTimeMillis();
            c1355870lO5.LIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        View viewLIZIZ = C21146717pB.LIZIZ(requireContext(), R.layout.da9, viewGroup, false);
        C19GS c19gs = null;
        if (viewLIZIZ instanceof ViewGroup) {
            view = viewLIZIZ;
        } else {
            view = null;
        }
        if (view != null) {
            int iIntValue = -1;
            C786410Ut5.W5(view.findViewById(R.id.t0h), new RelativeLayout.LayoutParams(-1, -1));
            View viewFindViewById = view.findViewById(R.id.i4h);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, requireContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            viewFindViewById.setBackgroundColor(iIntValue);
        }
        try {
            ViewTreeLifecycleOwner.set(viewLIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLIZIZ, this);
            viewLIZIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLIZIZ;
        }
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
