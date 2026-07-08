package com.ss.android.ugc.aweme.ui.fragment;

import X.AbstractC21673619ry;
import X.AnonymousClass0956;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C07CE;
import X.C098200Yq;
import X.C0KFD;
import X.C0QSJ;
import X.C0R52;
import X.C0SNV;
import X.C0SO2;
import X.C0SOM;
import X.C0SRI;
import X.C0SRJ;
import X.C0SRL;
import X.C0SRW;
import X.C0SRX;
import X.C0SSC;
import X.C0SU0;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C123100dR;
import X.C12ES;
import X.C1308910kAL;
import X.C1339980kyS;
import X.C1345380l7A;
import X.C1345390l7B;
import X.C1345760l7m;
import X.C1349280lDS;
import X.C1349590lDx;
import X.C1349800lEI;
import X.C1350920lG6;
import X.C1354730lMF;
import X.C1361840lXi;
import X.C1365840leA;
import X.C1365850leB;
import X.C1365860leC;
import X.C1365870leD;
import X.C1389890mGx;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C21146717pB;
import X.C21674119s3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C281470B1l;
import X.C294180Bg0;
import X.C304280BwI;
import X.C338490DOt;
import X.C338520DOw;
import X.C344590Df7;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C497270Jen;
import X.C585910MyT;
import X.C622680Oba;
import X.C628500Oky;
import X.C630740Ooa;
import X.C673150Qan;
import X.C687700QyG;
import X.C707090RoR;
import X.C717490SCl;
import X.C721370SRj;
import X.C721640SSk;
import X.C722580SWa;
import X.C722600SWc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.C987103tV;
import X.EnumC725960Sdm;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1258040iqI;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC716950SAj;
import X.InterfaceC722730SWp;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS39S0300000_6;
import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.ability.IPostModeCommentListAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.comment.translation.TranslationCommentAssemVM;
import com.ss.android.ugc.aweme.commentv2.CommentPageScope;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentFloatAdAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentExposureVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentExposureAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS129S0110000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS79S0500000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class PostModeCommentListFragmentV2 extends AbsFragment implements InterfaceC724530SbT, InterfaceC1258040iqI, IPostModeCommentListAbility, C0SSC, C0QSJ, InterfaceC1146704e9 {
    public static final C0SRJ LLJZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjAlZykhKSIhHELIOSLCEnZhUjOjseJyEpCiA+JSAiPQM6OzEKOy40JSAiPRlh";
    public boolean LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1075));
    public final C736950SvV LLILLL;
    public final C01GW LLILZ;
    public int LLILZIL;
    public PostModeDetailParams LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final C722580SWa LLJIJIL;
    public C0SU0 LLJILJIL;
    public ViewGroup LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public C1349800lEI LLJJ;
    public WrapLinearLayoutManager LLJJI;
    public C0R52 LLJJIII;
    public AnonymousClass0956 LLJJIJI;
    public final C1349590lDx LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C0SRI LLJJJ;
    public boolean LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public Aweme LLJJJJJIL;
    public final C630740Ooa LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final ARunnableS111S0100000_11 LLJL;
    public View LLJLIL;
    public ICommentFloatAdAbility LLJLILLLLZIIL;
    public ICommentListAssemAbility LLJLL;
    public ICommentExposureAbility LLJLLIL;
    public ICommentListVMAbility LLJLLL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0SRJ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PostModeCommentListFragmentV2.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(PostModeCommentListFragmentV2.class, "exposeVM", "getExposeVM()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentExposureVM;", 0), new C2217381BqS(PostModeCommentListFragmentV2.class, "translationCommentAssemVM", "getTranslationCommentAssemVM()Lcom/ss/android/ugc/aweme/comment/translation/TranslationCommentAssemVM;", 0)};
        LLJZ = new Object() { // from class: X.0SRJ
        };
    }

    public void RR() {
    }

    public void SR(CommentContextSource commentContextSource) {
    }

    @Override // X.C0QSJ
    public void bindAbility(Object obj, Class cls) {
        if (cls == ICommentFloatAdAbility.class) {
            this.LLJLILLLLZIIL = (ICommentFloatAdAbility) obj;
        } else if (cls == ICommentListAssemAbility.class) {
            this.LLJLL = (ICommentListAssemAbility) obj;
        } else if (cls == ICommentExposureAbility.class) {
            this.LLJLLIL = (ICommentExposureAbility) obj;
        } else if (cls == ICommentListVMAbility.class) {
            this.LLJLLL = (ICommentListVMAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentPageScope.class});
    }

    public boolean dS() {
        return false;
    }

    @Override // X.C0QSJ
    public Object getAbility(Class cls) {
        if (cls == ICommentFloatAdAbility.class) {
            return this.LLJLILLLLZIIL;
        }
        if (cls == ICommentListAssemAbility.class) {
            return this.LLJLL;
        }
        if (cls == ICommentExposureAbility.class) {
            return this.LLJLLIL;
        }
        if (cls == ICommentListVMAbility.class) {
            return this.LLJLLL;
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
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentPageScope.class);
        return arrayList;
    }

    @Override // X.C0SSC
    public InterfaceC716950SAj getRealPageViewPagerLis() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public List getScopes() {
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
    public void unbindAbility(Object obj, Class cls) {
        if (cls == ICommentFloatAdAbility.class) {
            this.LLJLILLLLZIIL = null;
        } else if (cls == ICommentListAssemAbility.class) {
            this.LLJLL = null;
        } else if (cls == ICommentExposureAbility.class) {
            this.LLJLLIL = null;
        } else if (cls == ICommentListVMAbility.class) {
            this.LLJLLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public PostModeCommentListFragmentV2() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PhotoSharedViewModel.class);
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11((Fragment) this, 1461);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(641);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, false);
        C451620HnM c451620HnM = new C451620HnM(this, true);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLILLL = new C736950SvV(c19719912DlLIZ, awS555S0100000_11, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS243S0000000_11, c451460Hn6, c451620HnM, c338520DOw);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CommentPublishViewModel.class);
        this.LLILZ = C452501pT.LIZIZ(new AwS79S0500000_19(this, c19719912DlLIZ2, new AwS555S0100000_11(c19719912DlLIZ2, 1070), AFwS243S0000000_11.get$arr$(533), (Function0) null, 24));
        this.LLJIJIL = new C722580SWa();
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(CommentExposureVM.class);
        AwS555S0100000_11 awS555S0100000_112 = new AwS555S0100000_11(c19719912DlLIZ3, 1077);
        AFwS243S0000000_11 aFwS243S0000000_112 = AFwS243S0000000_11.get$arr$(534);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS555S0100000_112, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 1078), aFwS243S0000000_112, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS555S0100000_112, new AwS555S0100000_11((Fragment) this, 1079), aFwS243S0000000_112, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS555S0100000_112, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 1080), aFwS243S0000000_112, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILLL = assemVMLazy;
        this.LLJJ = new C1349800lEI("");
        this.LLJJIJIIJIL = new C1349590lDx("PostModeCommentListFragmentV2");
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(TranslationCommentAssemVM.class);
        AwS555S0100000_11 awS555S0100000_113 = new AwS555S0100000_11(c19719912DlLIZ4, 1081);
        AFwS243S0000000_11 aFwS243S0000000_113 = AFwS243S0000000_11.get$arr$(535);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS555S0100000_113, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 1082), aFwS243S0000000_113, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS555S0100000_113, new AwS555S0100000_11((Fragment) this, 1069), aFwS243S0000000_113, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS555S0100000_113, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 1076), aFwS243S0000000_113, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJJ = assemVMLazy2;
        this.LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1074));
        this.LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1073));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(236));
        this.LLJL = new ARunnableS111S0100000_11(this, 59);
    }

    public final PostModePageViewModel DR() {
        return (PostModePageViewModel) this.LLILLJJLI.getValue();
    }

    public final CommentContextSource GL() {
        C722580SWa c722580SWa = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
        return c722580SWa.LIZ(this);
    }

    public final void MR() {
        FrameLayout frameLayout;
        PostModeDetailActivity postModeDetailActivity;
        FrameLayout frameLayout2 = new FrameLayout(UR());
        C786410Ut5.a6(frameLayout2, new FrameLayout.LayoutParams(-1, -2));
        this.LLJLIL = frameLayout2;
        WeakReference weakReference = new WeakReference(this);
        Context contextUR = UR();
        View view = this.LLJLIL;
        C0SRI c0sriLJIILIIL = null;
        if (!(view instanceof FrameLayout) || (frameLayout = (FrameLayout) view) == null) {
            return;
        }
        try {
            if (((PhotoSharedViewModel) this.LLILLL.getValue()).LLJILLL) {
                PostModeDetailRootFragment postModeDetailRootFragmentAS = aS();
                if (postModeDetailRootFragmentAS != null) {
                    c0sriLJIILIIL = C0SRW.LJIILIIL(postModeDetailRootFragmentAS, contextUR, frameLayout, new AwS555S0100000_11(weakReference, (WeakReference<PostModeCommentListFragmentV2>) 1071));
                }
            } else {
                C19EG c19egRequireActivity = requireActivity();
                if ((c19egRequireActivity instanceof PostModeDetailActivity) && (postModeDetailActivity = (PostModeDetailActivity) c19egRequireActivity) != null) {
                    c0sriLJIILIIL = C0SRW.LJIILIIL(postModeDetailActivity, contextUR, frameLayout, new AwS555S0100000_11(this, 1072));
                }
            }
            rS(c0sriLJIILIIL);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void NR() {
        ViewGroup viewGroup = this.LLJILJILJ;
        if (viewGroup != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, UR());
            viewGroup.setBackgroundColor(numLIZJ != null ? numLIZJ.intValue() : -1);
        }
        PostModeDetailParams postModeDetailParams = this.LLILZLL;
        if (postModeDetailParams == null || !postModeDetailParams.enableGestureExit) {
            C0SU0 c0su0 = this.LLJILJIL;
            if (c0su0 != null) {
                c0su0.setOverScrollMode(0);
                c0su0.LLJJIJIL = true;
                return;
            }
            return;
        }
        C0SU0 c0su02 = this.LLJILJIL;
        Integer numValueOf = null;
        if ((c0su02 instanceof C0SU0) && c0su02 != null) {
            double upperThreshold = c0su02.getUpperThreshold();
            C721640SSk c721640SSk = C721640SSk.LIZ;
            C19EG c19egRequireActivity = requireActivity();
            c721640SSk.getClass();
            numValueOf = Integer.valueOf((int) ((upperThreshold + ((double) C721640SSk.LJIIIIZZ(c19egRequireActivity))) * 1.3d));
        }
        ViewGroup viewGroup2 = this.LLJILJILJ;
        ImageView imageView = new ImageView(UR());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10, -1);
        layoutParams.height = numValueOf != null ? numValueOf.intValue() : C12ES.LJIIIIZZ(UR()) / 3;
        C786410Ut5.c6(imageView, layoutParams);
        viewGroup2.addView(imageView, 0);
        C0SU0 c0su03 = this.LLJILJIL;
        if (!(c0su03 instanceof C0SU0) || c0su03 == null) {
            return;
        }
        c0su03.setOnDragOutOfBounds(new AwS590S0100000_11(imageView, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    }

    public final CommentExposureVM VR() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
        return (CommentExposureVM) assemVMLazy.getValue();
    }

    public View WR() {
        View view = this.LLJLIL;
        if (view != null) {
            return view.findViewById(R.id.qex);
        }
        return null;
    }

    public final void mS() {
        List<InterfaceC1891350zJl> listItems;
        if (this.LLIZ) {
            return;
        }
        C0SU0 c0su0 = this.LLJILJIL;
        int size = (c0su0 == null || (listItems = c0su0.getListItems()) == null) ? 0 : listItems.size();
        if (!Intrinsics.LJFF(DR().LLJLLL.getValue(), Boolean.TRUE) && size > 1) {
            WrapLinearLayoutManager wrapLinearLayoutManager = this.LLJJI;
            if (wrapLinearLayoutManager != null) {
                wrapLinearLayoutManager.LLILLJJLI = null;
            }
            C0SU0 c0su02 = this.LLJILJIL;
            if (c0su02 != null) {
                HandlerHook.viewPostDelay(c0su02, new ARunnableS106S0100000_6(this, 120), 100L);
            }
        }
    }

    public void wS() {
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.0SSL
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                this.LL.DR().LLLIIIIL.postValue(new Pair<>(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY())));
                return false;
            }
        });
        C0SU0 c0su0 = this.LLJILJIL;
        if (c0su0 != null) {
            c0su0.setBackgroundColor(gS());
            c0su0.addOnItemTouchListener(new C0KFD() { // from class: X.0SWe
                @Override // X.InterfaceC21676019sM
                public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                    GestureDetector gestureDetector2 = gestureDetector;
                    if (gestureDetector2 != null) {
                        gestureDetector2.onTouchEvent(motionEvent);
                        return false;
                    }
                    return false;
                }
            });
        }
    }

    public boolean yS() {
        PostModeDetailParams postModeDetailParams = this.LLILZLL;
        return postModeDetailParams != null && postModeDetailParams.enableGestureExit;
    }

    public void OR() {
        C0SOM c0som;
        MR();
        C0SU0 c0su0 = this.LLJILJIL;
        if (c0su0 != null) {
            c0su0.LJ(0, this.LLJLIL);
        }
        View view = this.LLJLIL;
        C0SU0 c0su02 = this.LLJILJIL;
        if (view != null && (c0som = (C0SOM) view.findViewById(R.id.qex)) != null && c0su02 != null) {
            c0su02.setOnHorizontalSlopExceeded(new AwS412S0200000_11(c0som, c0su02, 81));
            c0su02.setOnActionUpLambda(new AwS412S0200000_11(c0som, c0su02, 82));
        }
        DR().LLJL.postValue(Boolean.TRUE);
    }

    public void PR() {
        C0SRI c0sriZR;
        C0SRL postModeModel;
        C19EG c19eg;
        if (!C0SO2.LIZLLL() || (c0sriZR = ZR()) == null || (postModeModel = c0sriZR.getPostModeModel()) == null || (c19eg = postModeModel.LIZIZ) == null || !C960203pA.LIZIZ(c19eg)) {
            return;
        }
        C497270Jen.LIZIZ(c19eg);
    }

    public final Context UR() {
        SAFFragmentRootScene sAFFragmentRootSceneIb;
        Context sceneContext;
        PostModeDetailRootFragment postModeDetailRootFragmentAS = aS();
        return (postModeDetailRootFragmentAS == null || (sAFFragmentRootSceneIb = postModeDetailRootFragmentAS.ib()) == null || (sceneContext = sAFFragmentRootSceneIb.getSceneContext()) == null) ? requireContext() : sceneContext;
    }

    public final PostModeDetailRootFragment aS() {
        View view = getView();
        if (view == null) {
            return null;
        }
        C0SRX.LJLILLLLZI.getClass();
        return C721370SRj.LIZ(view);
    }

    public C0SOM bS() {
        View view;
        C0SRI c0sriZR = ZR();
        if (c0sriZR == null || (view = c0sriZR.getView()) == null) {
            return null;
        }
        return (C0SOM) view.findViewById(R.id.qex);
    }

    public final int gS() {
        Context context = getContext();
        if (context == null) {
            return -1;
        }
        if (C960203pA.LIZIZ(context) && C0SO2.LIZLLL()) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, context);
            if (numLIZJ != null) {
                return numLIZJ.intValue();
            }
            return -16777216;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zm, context);
        if (numLIZJ2 != null) {
            return numLIZJ2.intValue();
        }
        return -1;
    }

    public void nS() {
        View view;
        View viewFindViewById;
        View view2;
        C0SRL postModeModel;
        ViewGroup viewGroup;
        View viewFindViewById2;
        C0SRL postModeModel2;
        ViewGroup viewGroup2;
        C0SRI c0sriZR = ZR();
        if (c0sriZR != null && (postModeModel2 = c0sriZR.getPostModeModel()) != null && (viewGroup2 = postModeModel2.LJFF) != null) {
            View viewFindViewById3 = viewGroup2.findViewById(R.id.s0w);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setBackground(null);
            }
            View viewFindViewById4 = viewGroup2.findViewById(R.id.jig);
            if (viewFindViewById4 != null) {
                viewFindViewById4.setBackground(null);
            }
            View viewFindViewById5 = viewGroup2.findViewById(R.id.jk2);
            if (viewFindViewById5 != null) {
                viewFindViewById5.setBackground(null);
            }
            View viewFindViewById6 = viewGroup2.findViewById(R.id.sea);
            if (viewFindViewById6 != null) {
                viewFindViewById6.setBackground(null);
            }
            View viewFindViewById7 = viewGroup2.findViewById(R.id.w28);
            if (viewFindViewById7 != null) {
                viewFindViewById7.setBackground(null);
            }
        }
        C0SRI c0sriZR2 = ZR();
        if (c0sriZR2 != null && (postModeModel = c0sriZR2.getPostModeModel()) != null && (viewGroup = postModeModel.LIZLLL) != null && (viewFindViewById2 = viewGroup.findViewById(R.id.rjn)) != null) {
            viewFindViewById2.setBackground(null);
        }
        C0SRI c0sriZR3 = ZR();
        if (c0sriZR3 != null && (view2 = c0sriZR3.getView()) != null) {
            view2.setBackground(null);
        }
        C0SRI c0sriZR4 = ZR();
        if (c0sriZR4 != null && (view = c0sriZR4.getView()) != null && (viewFindViewById = view.findViewById(R.id.jio)) != null) {
            viewFindViewById.setBackground(null);
        }
        C0SOM c0somBS = bS();
        if (c0somBS != null) {
            c0somBS.setBackground(null);
        }
    }

    public final void oS() {
        Integer numValueOf;
        if (Intrinsics.LJFF(DR().LLJLLL.getValue(), Boolean.TRUE)) {
            PostModePageViewModel postModePageViewModelDR = DR();
            postModePageViewModelDR.LLLLIL = null;
            postModePageViewModelDR.LLLLJ = null;
            postModePageViewModelDR.LLLLL = null;
            postModePageViewModelDR.LLLLILI = 0L;
            postModePageViewModelDR.LLLLJI = 0L;
            postModePageViewModelDR.LLLLLIL = 0L;
            WrapLinearLayoutManager wrapLinearLayoutManager = this.LLJJI;
            if (wrapLinearLayoutManager == null || (numValueOf = Integer.valueOf(wrapLinearLayoutManager.findFirstVisibleItemPosition())) == null) {
                return;
            }
            numValueOf.intValue();
            PostModePageViewModel postModePageViewModelDR2 = DR();
            boolean z = DR().LLILLL;
            postModePageViewModelDR2.getClass();
            new AwS129S0110000_11(z, postModePageViewModelDR2, 2);
            C0SU0 c0su0 = this.LLJILJIL;
            if (c0su0 != null) {
                DR().zQ2(((double) C344590Df7.LIZ(c0su0)) > 0.5d);
            }
            iS(numValueOf.intValue() <= 0);
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        super.onDestroy();
        if (C281470B1l.LIZ()) {
            PostModeDetailParams postModeDetailParams = this.LLILZLL;
            if (postModeDetailParams == null || (str = postModeDetailParams.eventType) == null) {
                str = "";
            }
            C0SNV.LIZJ(0L, "photomode_fullpage_comment_scroll", null, str);
        }
        PR();
        RR();
        this.LLJJIJIL = false;
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
            this.LLJJIJI = null;
        }
        this.LLJJI = null;
        C1354730lMF.LIZJ = "";
        C622680Oba.LIZLLL(this);
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IPostModeCommentListAbility.class, null);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJIJIIJIL.LIZJ(this, C1558360qeg.LJFF(this, null));
        if (C304280BwI.LIZLLL()) {
            C0SU0 c0su0 = this.LLJILJIL;
            if (c0su0 != null) {
                c0su0.LLILZ = null;
                c0su0.LLJJIII = null;
                c0su0.LLJJIJI = null;
                c0su0.LLJJJJJIL = null;
                c0su0.LLLI = null;
                c0su0.LLLII = null;
                c0su0.LLJLL = null;
            }
            this.LLJILJIL = null;
            this.LLJILJILJ = null;
            this.LLJLIL = null;
            rS(null);
        }
        if (((Boolean) this.LLJJLIIIJLLLLLLLZ.getValue()).booleanValue()) {
            C707090RoR.LIZ().removeCallbacks((Runnable) this.LLJJL.getValue());
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getUserVisibleHint() && isVisible()) {
            VR().RI0(EnumC725960Sdm.RESUME);
            this.LLJJIJIIJIL.LJ();
            WrapLinearLayoutManager wrapLinearLayoutManager = this.LLJJI;
            if (wrapLinearLayoutManager != null) {
                wrapLinearLayoutManager.LLILLJJLI = new InterfaceC722730SWp() { // from class: X.0SWf
                    @Override // X.InterfaceC722730SWp
                    public final void LIZ() {
                        this.LIZ.mS();
                    }
                };
            }
            oS();
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        VR().RI0(EnumC725960Sdm.STOP);
        if (this.LLIZLLLIL) {
            C1349590lDx c1349590lDx = this.LLJJIJIIJIL;
            c1349590lDx.getClass();
            c1349590lDx.LIZJ = SystemClock.elapsedRealtime();
        }
    }

    public final void qS() {
        View viewWR = WR();
        if (this.LL) {
            return;
        }
        if (viewWR == null || viewWR.getHeight() != 0) {
            this.LL = true;
            Float fValueOf = viewWR != null ? Float.valueOf(viewWR.getHeight() - C12ES.LIZJ(72.0f, UR())) : null;
            C0SU0 c0su0 = this.LLJILJIL;
            if (c0su0 != null) {
                HandlerHook.viewPost(c0su0, new ARunnableS39S0300000_6(this, c0su0, fValueOf, 4));
            }
        }
    }

    public void sS() {
        if (C294180Bg0.LIZ() && C07CE.LIZ()) {
            C1339980kyS.LIZ(getContext());
        }
    }

    public void uS() {
        C0SRI c0sriZR;
        C0SRL postModeModel;
        C19EG c19eg;
        if (!C0SO2.LIZLLL() || (c0sriZR = ZR()) == null || (postModeModel = c0sriZR.getPostModeModel()) == null || (c19eg = postModeModel.LIZIZ) == null || !C960203pA.LIZIZ(c19eg)) {
            return;
        }
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, c19eg);
        tuxImmersionBarLIZLLL.LJIIIIZZ(numLIZJ != null ? numLIZJ.intValue() : -16777216);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LIZLLL();
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPostModeCommentListAbility
    public final boolean Xi1() {
        return this.LLJ;
    }

    public C0SRI ZR() {
        return this.LLJJJ;
    }

    public void hS(List<?> list) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        if (!list.isEmpty()) {
            C0SU0 c0su0 = this.LLJILJIL;
            if (c0su0 != null && (viewHolderFindViewHolderForAdapterPosition = c0su0.findViewHolderForAdapterPosition(2)) != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null && C717490SCl.LIZ(view)) {
                DR().LLJILJILJ.setValue(Unit.LIZ);
                return;
            }
            final Context contextUR = UR();
            final int i = this.LLILZIL;
            C21674119s3 c21674119s3 = new C21674119s3(contextUR, i) { // from class: X.0fRH
                public final int LJIILL;

                @Override // X.C21674119s3
                public final int LJIILL() {
                    return -1;
                }

                {
                    this.LJIILL = i;
                }

                @Override // X.C21674119s3
                public final int LJIIJ(int i2, View view2) {
                    return super.LJIIJ(i2, view2) + this.LJIILL;
                }
            };
            c21674119s3.LIZ = 2;
            C0SU0 c0su02 = this.LLJILJIL;
            if (c0su02 == null) {
                return;
            }
            HandlerHook.viewPost(c0su02, new ARunnableS75S0200000_6(this, c21674119s3, 59));
            return;
        }
        C0SU0 c0su03 = this.LLJILJIL;
        if (c0su03 == null) {
            return;
        }
        PostModePageViewModel postModePageViewModelDR = DR();
        AbstractC21673619ry adapter = c0su03.getAdapter();
        if (adapter == null) {
            return;
        }
        int itemCount = adapter.getItemCount();
        RecyclerView.LayoutManager layoutManager = c0su03.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == itemCount - 1) {
            postModePageViewModelDR.LLJILJILJ.setValue(Unit.LIZ);
            return;
        }
        int i2 = itemCount - 1;
        if (i2 < 0) {
            return;
        }
        c0su03.smoothScrollToPosition(i2);
    }

    public final void iS(boolean z) {
        String desc;
        Aweme aweme = this.LLJJJJJIL;
        if (aweme != null) {
            desc = aweme.getDesc();
        } else {
            desc = null;
        }
        if (C123100dR.LIZ(desc)) {
            PostModePageViewModel postModePageViewModelDR = DR();
            if (z) {
                if (postModePageViewModelDR.LLLLL == null) {
                    postModePageViewModelDR.LLLLL = Long.valueOf(System.currentTimeMillis());
                }
            } else {
                Long l = postModePageViewModelDR.LLLLL;
                if (l != null) {
                    postModePageViewModelDR.LLLLLIL += System.currentTimeMillis() - l.longValue();
                }
                postModePageViewModelDR.LLLLL = null;
            }
        }
    }

    public final void kS(boolean z) {
        CommentCommonModel commonModel;
        String str;
        PostModePageViewModel postModePageViewModelDR = DR();
        postModePageViewModelDR.getClass();
        new AwS129S0110000_11(true, postModePageViewModelDR, 2);
        if (!this.LLIZLLLIL && this.LLIZ) {
            this.LLJJIJIIJIL.LJ();
            this.LLJJIJIIJIL.LIZLLL(true, C1558360qeg.LJFF(this, null), this, false);
        }
        this.LLIZLLLIL = true;
        if (!this.LLIZ) {
            this.LLJJIJIIJIL.LIZLLL(true, C1558360qeg.LJFF(this, null), this, false);
            if (!Intrinsics.LJFF(this.LLJJ.getTempEnterMethod(), "click_actionbar")) {
                if (z) {
                    str = "slide";
                } else {
                    str = "detail_expo";
                }
                this.LLJJ.setTempEnterMethod(str);
            }
            CommentContextSource commentContextSourceGL = GL();
            if (commentContextSourceGL != null && (commonModel = commentContextSourceGL.getCommonModel()) != null) {
                commonModel.setTempEnterMethod(this.LLJJ.getTempEnterMethod());
            }
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceGL2 = GL();
            c1350920lG6.getClass();
            C1350920lG6.LJLJL(commentContextSourceGL2, null);
            this.LLIZ = true;
            this.LLJJIJIIJIL.LJI(0L);
        }
        PostModePageViewModel postModePageViewModelDR2 = DR();
        if (postModePageViewModelDR2 != null) {
            postModePageViewModelDR2.LLILLL = this.LLIZLLLIL;
        }
    }

    @C14EU
    public final void onCloseCommentLynxEvent(C585910MyT c585910MyT) {
        String str;
        ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(this, C1558360qeg.LJFF(this, null));
        if (iCommentListAssemAbilityLIZLLL != null) {
            if (c585910MyT == null || (str = c585910MyT.LIZ) == null) {
                str = "";
            }
            iCommentListAssemAbilityLIZLLL.deleteItem(str);
        }
        if (c585910MyT != null && c585910MyT.LIZIZ) {
            C1361840lXi.LIZ.getClass();
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIJ(getString(2131821669));
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
    }

    @C14EU
    public final void onCommentKeyboardEvent(C722600SWc c722600SWc) {
        String aid;
        C0SRI c0sriZR;
        C0SRL postModeModel;
        if (getUserVisibleHint() && isVisible() && this.LLIZLLLIL) {
            String str = c722600SWc.LIZJ;
            Aweme aweme = this.LLJJJJJIL;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(str, aid) && (c0sriZR = ZR()) != null && (postModeModel = c0sriZR.getPostModeModel()) != null && c722600SWc.LIZIZ == postModeModel.LJII()) {
                int i = c722600SWc.LIZ;
                if (i != 0) {
                    if (i != 1 || this.LLJJIJIL) {
                        return;
                    }
                    this.LLJJIJIL = true;
                    VR().RI0(EnumC725960Sdm.TAB_UNSELECT);
                    return;
                }
                if (!this.LLJJIJIL) {
                    return;
                }
                this.LLJJIJIL = false;
                VR().RI0(EnumC725960Sdm.TAB_SELECT);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C622680Oba.LIZJ(this);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IPostModeCommentListAbility.class, null, null);
        C1354730lMF.LIZJ = "graphic_detail";
    }

    @C14EU
    public final void onEvent(C1365870leD c1365870leD) {
        String quantityString;
        User author;
        if (TextUtils.equals("comment", c1365870leD.LIZLLL)) {
            if (Intrinsics.LJFF("comment_share_panel", c1365870leD.LJFF)) {
                C0R52 c0r52 = this.LLJJIII;
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                Aweme aweme = this.LLJJJJJIL;
                if (aweme != null) {
                    author = aweme.getAuthor();
                } else {
                    author = null;
                }
                C1349280lDS.LIZ(c0r52, iLIZIZ + C1349280lDS.LJIIIZ(author));
                C1365840leA.LJ(c1365870leD, this.LLJJIII, this.LLJJJJJIL, 0L);
                return;
            }
            int i = c1365870leD.LJIIJ;
            String displayName = c1365870leD.LIZ.getDisplayName();
            if (displayName != null && displayName.length() != 0) {
                if (displayName.length() >= 50) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(displayName.substring(0, 50));
                    sbLIZ.append("...");
                    displayName = C2188811AlT.LIZIZ(sbLIZ);
                }
                if (i == 1) {
                    quantityString = getResources().getString(2131835523, displayName);
                } else {
                    int i2 = i - 1;
                    quantityString = getResources().getQuantityString(2131755373, i2, displayName, Integer.valueOf(i2));
                }
                C1389890mGx c1389890mGx = new C1389890mGx(this);
                c1389890mGx.LJIIJ(quantityString);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        if (TextUtils.equals("gif", c1365870leD.LIZLLL) || TextUtils.equals("set_sticker", c1365870leD.LIZLLL) || TextUtils.equals("aigc_avatar", c1365870leD.LIZLLL)) {
            C1389890mGx c1389890mGx2 = new C1389890mGx(this);
            c1389890mGx2.LJIIIZ(2131848905);
            c1389890mGx2.LJIIJJI();
        }
    }

    public void rS(C0SRI c0sri) {
        this.LLJJJ = c0sri;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPostModeCommentListAbility
    public final boolean sO1(Comment comment) {
        String str;
        String authorUid;
        C0SRL postModeModel;
        String str2;
        User user = comment.getUser();
        PostModeDetailParams postModeDetailParams = this.LLILZLL;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.previousPage;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "others_homepage")) {
            PostModeDetailParams postModeDetailParams2 = this.LLILZLL;
            if (postModeDetailParams2 != null) {
                str2 = postModeDetailParams2.previousPage;
            } else {
                str2 = null;
            }
            if (!Intrinsics.LJFF(str2, "personal_homepage")) {
                return false;
            }
        }
        Aweme aweme = this.LLJJJJJIL;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (Intrinsics.LJFF(authorUid, user.getUid())) {
            C0SRI c0sriZR = ZR();
            if (c0sriZR != null && (postModeModel = c0sriZR.getPostModeModel()) != null) {
                postModeModel.LJIJI(null);
                return true;
            }
            return true;
        }
        return false;
    }

    @C14EU
    public final void onEvent(C1365850leB c1365850leB) {
        User author;
        if (Intrinsics.LJFF(c1365850leB.LJII, "comment_share_panel")) {
            C0R52 c0r52 = this.LLJJIII;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            Aweme aweme = this.LLJJJJJIL;
            if (aweme != null) {
                author = aweme.getAuthor();
            } else {
                author = null;
            }
            C1349280lDS.LIZ(c0r52, iLIZIZ + C1349280lDS.LJIIIZ(author));
            C1365840leA.LJII(c1365850leB, this.LLJJIII);
        }
    }

    @C14EU
    public final void onEvent(C1365860leC c1365860leC) {
        User author;
        if (Intrinsics.LJFF(c1365860leC.LJFF, "comment_share_panel")) {
            C0R52 c0r52 = this.LLJJIII;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            Aweme aweme = this.LLJJJJJIL;
            if (aweme != null) {
                author = aweme.getAuthor();
            } else {
                author = null;
            }
            C1349280lDS.LIZ(c0r52, iLIZIZ + C1349280lDS.LJIIIZ(author));
            C1365840leA.LJIIIIZZ(c1365860leC, this.LLJJIII);
        }
    }

    public View cS(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewLIZIZ = C21146717pB.LIZIZ(layoutInflater.getContext(), R.layout.e9y, viewGroup, false);
        if ((viewLIZIZ instanceof ViewGroup) && viewLIZIZ != null) {
            int iGS = gS();
            View viewFindViewById = viewLIZIZ.findViewById(R.id.t0h);
            C786410Ut5.W5(viewFindViewById, new RelativeLayout.LayoutParams(-1, -1));
            viewFindViewById.setBackgroundColor(iGS);
            viewLIZIZ.findViewById(R.id.i4h).setBackgroundColor(iGS);
        }
        return viewLIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021f  */
    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r95, android.os.Bundle r96) {
        /*
            Method dump skipped, instruction units count: 1658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CommentPerfMonitorUtil.LIZ.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1345390l7B c1345390l7B = CommentPerfMonitorUtil.LJI;
        c1345390l7B.LJIIIZ = jCurrentTimeMillis;
        C1345380l7A c1345380l7A = CommentPerfMonitorUtil.LJII;
        c1345380l7A.LJIIIZ = jCurrentTimeMillis;
        View viewCS = cS(layoutInflater, viewGroup);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        c1345390l7B.LJIIJ = jCurrentTimeMillis2;
        c1345380l7A.LJIIJ = jCurrentTimeMillis2;
        C19GS c19gs = null;
        if (!(viewCS instanceof View)) {
            viewCS = null;
        }
        if (viewCS != null) {
            try {
                ViewTreeLifecycleOwner.set(viewCS, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewCS, this);
                viewCS.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewCS;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewCS;
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
