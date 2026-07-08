package com.ss.android.ugc.aweme.ui.view;

import X.C01GW;
import X.C03H5;
import X.C0H9H;
import X.C0RHK;
import X.C0SMF;
import X.C0SO2;
import X.C0SOK;
import X.C0SOM;
import X.C0SOP;
import X.C0SOQ;
import X.C0SQW;
import X.C0SRI;
import X.C0SRL;
import X.C0SRX;
import X.C0SRZ;
import X.C0SS0;
import X.C0SS1;
import X.C0SS3;
import X.C0SS5;
import X.C0SS8;
import X.C0SSD;
import X.C0SSE;
import X.C0STF;
import X.C0SU0;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1308910kAL;
import X.C1337800kuw;
import X.C13LZ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C16BC;
import X.C16G1;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19EG;
import X.C19ME;
import X.C20600815jK;
import X.C21146717pB;
import X.C21536219Qa;
import X.C2217381BqS;
import X.C2441009hQ;
import X.C339190DRl;
import X.C356901a3;
import X.C415520GRa;
import X.C418440Gaw;
import X.C452501pT;
import X.C717490SCl;
import X.C721190SQr;
import X.C721410SRn;
import X.C721430SRp;
import X.C721460SRs;
import X.C721480SRu;
import X.C721490SRv;
import X.C721500SRw;
import X.C721530SRz;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1338240kve;
import X.InterfaceC0148002o;
import X.InterfaceC1324370kZH;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1670800ta2;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC21503819Do;
import X.InterfaceC2217241BqE;
import X.InterfaceC469360Ias;
import X.InterfaceC716950SAj;
import X.InterfaceC719460SKa;
import X.InterfaceC719500SKe;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.RunnableC721470SRt;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.AAListenerS136S0300000_11;
import Y.AObserverS215S0100000_11;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS80S0200000_11;
import Y.AUListenerS219S0200000_11;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ability.IPhotoFloatGuideAbility;
import com.ss.android.ugc.aweme.ability.IPhotoNestHeaderAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PhotoMatrixState;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeShareViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModeNestHeaderComponent implements InterfaceC724530SbT, C0SS8, InterfaceC716950SAj, C0SSE, IPhotoNestHeaderAbility, C0SS5 {
    public final VideoItemParams LL;
    public final PhotoSharedViewModel LLILLJJLI;
    public final C0SRL LLILLL;
    public final WeakReference<C0SRI> LLILZ;
    public final C0SS3 LLILZIL;
    public C0SOQ LLILZLL;
    public C0SOP LLIZ;
    public C0SSD LLIZLLLIL;
    public AdvancedStopAtOffsetAppBarBehavior LLJ;
    public C1337800kuw LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public C0STF LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public final C01GW LLJJI;
    public int LLJJIII;
    public C721410SRn LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public WeakReference<C0SU0> LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public ValueAnimator LLJLL;
    public ValueAnimator LLJLLIL;
    public ValueAnimator LLJLLL;
    public ValueAnimator LLJZ;
    public ValueAnimator LLJZIJLIL;
    public ValueAnimator LLL;
    public C721490SRv LLLF;
    public C721460SRs LLLFF;
    public C0SS1 LLLFFI;
    public int LLLFZ;
    public int LLLI;
    public int LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public int LLLIIIL;
    public Boolean LLLIIL;
    public PhotoMatrixState LLLIILIL;
    public float LLLIL;
    public float LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final int LLLLIIIILLL;
    public final int LLLLIIL;
    public final int LLLLIILL;
    public final int LLLLIILLL;
    public final int LLLLIL;
    public final float LLLLILI;
    public final float LLLLJ;
    public int LLLLJI;
    public int LLLLL;
    public int LLLLLIL;
    public int LLLLLILLIL;
    public float LLLLLJIL;
    public int LLLLLJLJLL;
    public int LLLLLL;
    public Rect LLLLLLIL;
    public float LLLLLLJ;
    public float LLLLLLL;
    public float LLLLLLLLL;
    public int LLLLLLLLLL;
    public float LLLLLLLZIL;
    public int LLLLLLZ;
    public int LLLLLLZZ;
    public int LLLLLZ;
    public int LLLLLZIL;
    public int LLLLLZL;
    public int LLLLZ;
    public int LLLLZI;
    public Integer LLLLZIL;
    public Integer LLLLZLL;
    public long LLLLZLLIL;
    public Float LLLLZLLLI;
    public Float LLLZ;
    public Float LLLZI;
    public int LLLZIIL;
    public int LLLZIL;
    public int LLLZL;
    public int LLLZLL;
    public boolean LLLZLZ;
    public boolean LLLZZ;
    public boolean LLLZZIL;
    public RunnableC721470SRt LLZ;
    public RunnableC721470SRt LLZIL;
    public ARunnableS111S0100000_11 LLZILL;
    public final BPEAHandler LLZL;
    public final C01GW LLZLI;
    public final float LLZLL;
    public int LLZLLIL;
    public int LLZLLLL;
    public int LLZZ;
    public final C01GW LLZZJLIL;
    public final C01GW LLZZLLIL;
    public final Rect LLZZZIL;
    public WrapLinearLayoutManager LLZZZZ;
    public Boolean a;
    public boolean b;
    public boolean c;
    public final C01GW d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final C721480SRu h;
    public final C01GW i;

    public static boolean LJJJLIIL(int i) {
        return i == 2 || i == 0 || i == 3 || i == 4 || i == 1;
    }

    public final void LJJLIIIJJIZ() {
        this.b = true;
        View view = this.LLJILJIL;
        if (view != null) {
            C786410Ut5.ed(view, this.LLLIL);
        }
        LJJLL(0.0f);
        LJLILLLLZI(0.0f);
        C415520GRa c415520GRaLJIIJ = this.LLILLL.LJIIJ();
        if (c415520GRaLJIIJ != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c415520GRaLJIIJ);
            c415520GRaLJIIJ.setAlpha(0.0f);
        }
        if (this.c) {
            ViewGroup viewGroupLJIIJJI = this.LLILLL.LJIIJJI();
            if (viewGroupLJIIJJI != null) {
                viewGroupLJIIJJI.setOutlineProvider(null);
            }
            this.c = false;
        }
        LJJJJ();
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

    @Override // X.C0SSE
    public final boolean LIZ() {
        return (this.LLLZI == null || LJJJJZI()) ? false : true;
    }

    public final void LJIIJJI() {
        C0SRI c0sri;
        View view;
        C0SRI c0sri2;
        View view2;
        WeakReference<C0SRI> weakReference = this.LLILZ;
        int height = 0;
        if (weakReference == null || (c0sri = weakReference.get()) == null || (view = c0sri.getView()) == null || view.getHeight() <= 0 || this.LLJJIII > 0 || SystemClock.elapsedRealtime() - this.LLLLZLLIL < 6000) {
            return;
        }
        T value = this.LLILLL.LJIIIIZZ.LLJJI.getValue();
        Unit unit = Unit.LIZ;
        if (Intrinsics.LJFF(value, unit)) {
            return;
        }
        int i = -(this.LLJJIII + this.LLLLZI);
        C0SRL c0srl = this.LLILLL;
        int iLIZJ = i + c0srl.LJIILIIL.LIZJ(c0srl.LIZIZ);
        WeakReference<C0SRI> weakReference2 = this.LLILZ;
        if (weakReference2 != null && (c0sri2 = weakReference2.get()) != null && (view2 = c0sri2.getView()) != null) {
            height = view2.getHeight();
        }
        if (iLIZJ >= height) {
            this.LLILLL.LJIIIIZZ.LLJJ.setValue(unit);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent.LJIILIIL():void");
    }

    public final View LJIIZILJ() {
        return (View) this.LLJJJ.getValue();
    }

    public final int LJJ() {
        return ((Number) this.LLLL.getValue()).intValue();
    }

    public final View LJJI() {
        return (View) this.LLJJIJIL.getValue();
    }

    public final int LJJIFFI() {
        return ((Number) this.LLLILZJ.getValue()).intValue();
    }

    public final int LJJIIJ() {
        return ((Number) this.LLLILZLLLI.getValue()).intValue();
    }

    public final LifecycleOwner LJJIIZI() {
        LifecycleOwner viewLifecycleOwner;
        Fragment fragment = this.LLILLL.LIZ;
        return (fragment == null || (viewLifecycleOwner = fragment.getViewLifecycleOwner()) == null) ? this.LLILLL.LJIILIIL() : viewLifecycleOwner;
    }

    public final void LJJJJ() {
        ValueAnimator valueAnimator = this.LLJZIJLIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ImageView imageView = (ImageView) this.LLJJI.getValue();
        if (imageView != null) {
            C786410Ut5.LJZI(4, imageView);
        }
        ImageView imageView2 = (ImageView) this.LLJJI.getValue();
        if (imageView2 != null) {
            C786410Ut5.V4(imageView2, 0.0f);
        }
        View viewLJJI = LJJI();
        if (viewLJJI != null) {
            C786410Ut5.T4(viewLJJI, 1.0f);
        }
    }

    public final boolean LJJJJJL() {
        return ((Boolean) this.LLJJIJIIJIL.getValue()).booleanValue();
    }

    public final boolean LJJJJZI() {
        int i = this.LLJL;
        return i == 7 || i == 4;
    }

    public final boolean LJJJLZIJ() {
        return LJJJLIIL(this.LLJL);
    }

    public final boolean LJJJZ() {
        return this.LLJL == 6;
    }

    public final int LJJLIIIJ() {
        C19EG c19eg = this.LLILLL.LIZIZ;
        if (C960203pA.LIZIZ(c19eg) && C0SO2.LIZLLL()) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, c19eg);
            if (numLIZJ != null) {
                return numLIZJ.intValue();
            }
            return -16777216;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zm, c19eg);
        if (numLIZJ2 != null) {
            return numLIZJ2.intValue();
        }
        return -1;
    }

    public final void LJJLIIIJILLIZJL() {
        if (this.LLZ == null) {
            this.LLZ = new RunnableC721470SRt(this);
        }
        RunnableC721470SRt runnableC721470SRt = this.LLZ;
        if (runnableC721470SRt != null) {
            runnableC721470SRt.getClass();
            runnableC721470SRt.LLILLL = this.LLLLZLL;
            runnableC721470SRt.getClass();
            C786410Ut5.LJLIIL(100L, this.LLZL, runnableC721470SRt);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJLJLI() {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent.LJJLIIIJLJLI():void");
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoNestHeaderAbility
    public final boolean UY0() {
        return this.LLLZIL != 0;
    }

    public final View Vl2() {
        return (View) this.LLJJJIL.getValue();
    }

    @Override // X.C0SSE, com.ss.android.ugc.aweme.ability.IPhotoNestHeaderAbility
    public final boolean c7() {
        C0SS1 c0ss1 = this.LLLFFI;
        return c0ss1 != null && c0ss1.LIZ();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLL.LJIIL();
    }

    @Override // X.C0SSE
    public final boolean LIZIZ() {
        int i;
        WeakReference<C0SU0> weakReference;
        C0SU0 c0su0;
        return (LJJJLZIJ() && (weakReference = this.LLJJL) != null && (c0su0 = weakReference.get()) != null && c0su0.LLJJJJLIIL) || (i = this.LLJL) == 6 || i == 5;
    }

    @Override // X.C0SS5
    public final void LJI() {
        AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehavior;
        if (LJJJJZI()) {
            return;
        }
        LJJLIIIJJIZ();
        ViewGroup viewGroupLJIIJJI = this.LLILLL.LJIIJJI();
        if (viewGroupLJIIJJI != null) {
            viewGroupLJIIJJI.setOutlineProvider(null);
        }
        this.c = false;
        this.LLJLILLLLZIIL = true;
        C0SSD c0ssd = this.LLIZLLLIL;
        if (c0ssd == null || (advancedStopAtOffsetAppBarBehavior = this.LLJ) == null) {
            return;
        }
        advancedStopAtOffsetAppBarBehavior.LJFF(c0ssd);
    }

    public final C0SOP LJIJJLI() {
        return LJJJLZIJ() ? this.LLILZLL : this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoNestHeaderAbility
    public final boolean h91() {
        return LJJJLZIJ();
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoNestHeaderAbility
    public final int dM1() {
        return this.LLJL;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        public AnonymousClass1() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onCreate(LifecycleOwner lifecycleOwner) {
            Fragment fragmentLJIILL = PostModeNestHeaderComponent.this.LLILLL.LJIILL();
            if (fragmentLJIILL != null) {
                C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJIILL, null), PostModeNestHeaderComponent.this, IPhotoNestHeaderAbility.class, null, null);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            Fragment fragmentLJIILL = PostModeNestHeaderComponent.this.LLILLL.LJIILL();
            if (fragmentLJIILL != null) {
                C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJIILL, null), IPhotoNestHeaderAbility.class, null);
            }
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void K5(C0SMF c0smf) {
        C0SOP c0sopLJIJJLI = LJIJJLI();
        if (c0sopLJIJJLI != null) {
            c0sopLJIJJLI.K5(c0smf);
        }
    }

    public final void LJII(boolean z) {
        C0STF c0stf;
        InterfaceC719460SKa interfaceC719460SKaLJLIL;
        IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLZZLLIL.getValue();
        Bitmap bitmapLJIIL = null;
        if (iPhotoSlidesAbility != null && (interfaceC719460SKaLJLIL = iPhotoSlidesAbility.LJLIL()) != null) {
            bitmapLJIIL = interfaceC719460SKaLJLIL.LJIIL();
        }
        C0STF c0stf2 = this.LLJILJILJ;
        if (c0stf2 != null) {
            c0stf2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (z && (c0stf = this.LLJILJILJ) != null) {
            c0stf.setActualImageScaleType(EnumC1338240kve.FIT_CENTER);
        }
        C0STF c0stf3 = this.LLJILJILJ;
        if (c0stf3 != null) {
            c0stf3.setImageBitmap(bitmapLJIIL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJ(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent.LJJJ(android.view.MotionEvent):void");
    }

    public final void LJJLIL(float f) {
        C0SU0 c0su0;
        WeakReference<C0SU0> weakReference = this.LLJJL;
        if (weakReference != null && (c0su0 = weakReference.get()) != null) {
            if (f <= 0.0f) {
                c0su0.setBackground(null);
            } else {
                c0su0.setBackground((Drawable) this.LLJJJJ.getValue());
            }
        }
    }

    public final void LJJLJLI(int i) {
        boolean z;
        C0SRX c0srx;
        C0SRZ c0srzN6;
        int i2 = this.LLJL;
        if (i2 != i) {
            if (this.LLJLIL == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!LJJJLIIL(i) && LJJJLIIL(i2)) {
                LJJLL(0.0f);
                if (this.LLILLJJLI.LLJILLL) {
                    InterfaceC21503819Do interfaceC21503819DoLJIILLIIL = this.LLILLL.LJIILLIIL();
                    if (interfaceC21503819DoLJIILLIIL instanceof C0SRX) {
                        c0srx = (C0SRX) interfaceC21503819DoLJIILLIIL;
                        if (c0srx != null && (c0srzN6 = c0srx.N6()) != null) {
                            c0srzN6.tI();
                        }
                    }
                    c0srx = null;
                } else {
                    InterfaceC1670800ta2 interfaceC1670800ta2 = this.LLILLL.LIZIZ;
                    if (interfaceC1670800ta2 instanceof C0SRX) {
                        c0srx = (C0SRX) interfaceC1670800ta2;
                        if (c0srx != null) {
                            c0srzN6.tI();
                        }
                    }
                    c0srx = null;
                }
                if (!C0SOK.LIZ().enableBgOpt && c0srx != null) {
                    c0srx.aL();
                }
            }
            if (i == 4 || i == 7) {
                C0SS3 c0ss3 = this.LLILZIL;
                if (c0ss3 != null) {
                    c0ss3.LIZ();
                }
                ValueAnimator valueAnimator = this.LLJLL;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.LLJLL = null;
                ValueAnimator valueAnimator2 = this.LLJZIJLIL;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.LLJZIJLIL = null;
                LJLJJI(false);
            }
            if (i2 != 0 && i2 != 2 && i2 != 3) {
                if ((i2 == 5 || i2 == 6) && i == 7 && z) {
                    C721190SQr c721190SQr = C721190SQr.LIZ;
                    C0SRL c0srl = this.LLILLL;
                    Aweme aweme = c0srl.LIZJ;
                    PostModeDetailParams postModeDetailParams = c0srl.LJII;
                    c721190SQr.getClass();
                    C721190SQr.LJJ(aweme, postModeDetailParams, "full_page", "fyp");
                }
            } else if (z && (i == 4 || i == 7)) {
                C721190SQr c721190SQr2 = C721190SQr.LIZ;
                C0SRL c0srl2 = this.LLILLL;
                Aweme aweme2 = c0srl2.LIZJ;
                PostModeDetailParams postModeDetailParams2 = c0srl2.LJII;
                c721190SQr2.getClass();
                C721190SQr.LJJ(aweme2, postModeDetailParams2, "panel", "fyp");
            } else if (i == 5 || i == 6) {
                if (z) {
                    C721190SQr c721190SQr3 = C721190SQr.LIZ;
                    C0SRL c0srl3 = this.LLILLL;
                    Aweme aweme3 = c0srl3.LIZJ;
                    PostModeDetailParams postModeDetailParams3 = c0srl3.LJII;
                    c721190SQr3.getClass();
                    C721190SQr.LJJ(aweme3, postModeDetailParams3, "panel", "full_page");
                }
                C0SRL c0srl4 = this.LLILLL;
                PostModeFullPageViewModel postModeFullPageViewModel = c0srl4.LJIIIZ;
                if (postModeFullPageViewModel != null) {
                    postModeFullPageViewModel.LLJILJIL = "graphic_full_page";
                }
                c0srl4.LJIILJJIL.LLIZ = "graphic_full_page";
                PostModeShareViewModel postModeShareViewModel = c0srl4.LJIILL;
                if (postModeShareViewModel != null) {
                    postModeShareViewModel.LLILLJJLI = "graphic_full_page";
                }
                CommentContextSource commentContextSource = (CommentContextSource) this.LLJJLIIIJLLLLLLLZ.getValue();
                if (commentContextSource != null) {
                    commentContextSource.setActionFromPage("graphic_full_page");
                }
            }
        }
        this.LLJL = i;
    }

    public final void LJJLL(float f) {
        int iIntValue;
        if (!LJJJJZI()) {
            if (LJJJZ() || this.LLJL == 5) {
                if (!LJJJJJL()) {
                    int iLJIIJ = C2441009hQ.LJIIJ(Color.argb((int) (153 * f), 0, 0, 0), -1);
                    C0SS3 c0ss3 = this.LLILZIL;
                    if (c0ss3 != null) {
                        c0ss3.LIZIZ(iLJIIJ, true);
                        return;
                    }
                    return;
                }
                Integer num = (Integer) this.LLLJ.getValue();
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -16777216;
                }
                ViewGroup viewGroupLJIIJJI = this.LLILLL.LJIIJJI();
                if (viewGroupLJIIJJI != null) {
                    viewGroupLJIIJJI.setBackgroundColor(iIntValue);
                }
                int iLJIIJ2 = C2441009hQ.LJIIJ(Color.argb((int) (153 * f), 0, 0, 0), iIntValue);
                C0SS3 c0ss32 = this.LLILZIL;
                if (c0ss32 == null) {
                    return;
                }
                c0ss32.LIZIZ(iLJIIJ2, false);
            }
        }
    }

    public final void LJJZZI(Float f) {
        this.LLLZI = f;
        this.LLLLZLLLI = null;
        this.LLLZ = null;
        if (f != null) {
            RunnableC721470SRt runnableC721470SRt = this.LLZ;
            if (runnableC721470SRt != null) {
                this.LLZL.removeCallbacks(runnableC721470SRt);
            }
            this.LLLLZIL = Integer.valueOf(this.LLLLZI);
            this.LLLLZLL = Integer.valueOf(this.LLLLZI);
            SystemClock.elapsedRealtime();
            this.LLLZL++;
            return;
        }
        LJJLIIIJILLIZJL();
    }

    public final void LJL(long j) {
        Bitmap bitmap;
        ImageView imageView;
        PostModeDetailParams postModeDetailParams = this.LLILLL.LJII;
        if (postModeDetailParams != null && (bitmap = postModeDetailParams.tabBitmap) != null && (imageView = (ImageView) this.LLJJI.getValue()) != null && imageView.getVisibility() != 0) {
            ValueAnimator valueAnimator = this.LLJZIJLIL;
            if (valueAnimator != null && valueAnimator.isStarted()) {
                return;
            }
            ValueAnimator valueAnimator2 = this.LLJZIJLIL;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (bitmap.isRecycled()) {
                C786410Ut5.LJZI(0, imageView);
                imageView.setImageDrawable(new ColorDrawable(-16777216));
                C786410Ut5.V4(imageView, 1.0f);
                View viewLJJI = LJJI();
                if (viewLJJI != null) {
                    C786410Ut5.T4(viewLJJI, 0.0f);
                }
                C0SS3 c0ss3 = this.LLILZIL;
                if (c0ss3 != null) {
                    c0ss3.LIZ();
                    return;
                }
                return;
            }
            if (j > 0 && !this.LLILLL.LJIIZILJ()) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(j);
                valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS219S0200000_11(this, imageView, 11));
                valueAnimatorOfFloat.addListener(new AAListenerS136S0300000_11(imageView, this, bitmap, 3));
                this.LLJZIJLIL = valueAnimatorOfFloat;
                valueAnimatorOfFloat.start();
                return;
            }
            C786410Ut5.LJZI(0, imageView);
            imageView.setImageBitmap(bitmap);
            C786410Ut5.V4(imageView, 1.0f);
            View viewLJJI2 = LJJI();
            if (viewLJJI2 != null) {
                C786410Ut5.T4(viewLJJI2, 0.0f);
            }
            C0SS3 c0ss32 = this.LLILZIL;
            if (c0ss32 != null) {
                c0ss32.LIZ();
            }
        }
    }

    public final void LJLI(int i) {
        C0SU0 c0su0;
        C0SSD c0ssd;
        AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehavior;
        C1337800kuw c1337800kuw;
        LinearLayoutManager linearLayoutManager;
        WeakReference<C0SU0> weakReference = this.LLJJL;
        if (weakReference == null || (c0su0 = weakReference.get()) == null || (c0ssd = this.LLIZLLLIL) == null || (advancedStopAtOffsetAppBarBehavior = this.LLJ) == null || (c1337800kuw = this.LLJI) == null) {
            return;
        }
        advancedStopAtOffsetAppBarBehavior.LJIIIIZZ = false;
        c0su0.stopNestedScroll();
        this.LLJLIL = 1;
        int iLIZJ = AdvancedStopAtOffsetAppBarBehavior.LIZJ(c0ssd, -c0ssd.getTotalScrollRange());
        if (advancedStopAtOffsetAppBarBehavior.getTopAndBottomOffset() != iLIZJ) {
            advancedStopAtOffsetAppBarBehavior.getTopAndBottomOffset();
            advancedStopAtOffsetAppBarBehavior.setTopAndBottomOffset(iLIZJ);
            c1337800kuw.LIZLLL(c0ssd);
            c0ssd.invalidate();
        }
        View view = this.LLJILJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
        RecyclerView.LayoutManager layoutManager = c0su0.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            linearLayoutManager.scrollToPositionWithOffset(i, 0);
        }
    }

    public final void LJLILLLLZI(float f) {
        View viewFindViewById;
        ViewGroup viewGroup = this.LLILLL.LJFF;
        if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.jjw)) != null) {
            C786410Ut5.T4(viewFindViewById, f);
        }
    }

    public final void LJLJJI(boolean z) {
        ViewGroup viewGroup;
        float f;
        if (!Intrinsics.LJFF(this.LLLIIL, Boolean.valueOf(z)) && !LJJJJZI() && this.LLJL != 1) {
            this.LLLIIL = Boolean.valueOf(z);
            TuxIconView tuxIconViewLJ = this.LLILLL.LJ();
            ViewGroup viewGroup2 = this.LLILLL.LIZLLL;
            if (viewGroup2 != null) {
                viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.ins);
            } else {
                viewGroup = null;
            }
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ValueAnimator valueAnimator = this.LLJLLIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (tuxIconViewLJ != null) {
                C786410Ut5.x5(tuxIconViewLJ, f);
            }
            if (viewGroup != null) {
                C786410Ut5.R4(f, viewGroup);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058 A[PHI: r14
      0x0058: PHI (r14v3 int) = (r14v2 int), (r14v5 int) binds: [B:33:0x0055, B:16:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJLL(android.graphics.Bitmap r21) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent.LJLJJLL(android.graphics.Bitmap):void");
    }

    @Override // X.InterfaceC716950SAj
    public final void LLJJI(InterfaceC469360Ias interfaceC469360Ias) {
        C0SOP c0sopLJIJJLI = LJIJJLI();
        if (c0sopLJIJJLI != null) {
            c0sopLJIJJLI.LLJJI(interfaceC469360Ias);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void Qt(InterfaceC719500SKe interfaceC719500SKe) {
        C0SOP c0sopLJIJJLI = LJIJJLI();
        if (c0sopLJIJJLI != null) {
            c0sopLJIJJLI.Qt(interfaceC719500SKe);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void b3(InterfaceC469360Ias interfaceC469360Ias) {
        C0SOP c0sopLJIJJLI = LJIJJLI();
        if (c0sopLJIJJLI != null) {
            c0sopLJIJJLI.b3(interfaceC469360Ias);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void tj(C0SMF c0smf) {
        C0SOP c0sopLJIJJLI = LJIJJLI();
        if (c0sopLJIJJLI != null) {
            c0sopLJIJJLI.tj(c0smf);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void x6(InterfaceC719500SKe interfaceC719500SKe) {
        C0SOP c0sopLJIJJLI = LJIJJLI();
        if (c0sopLJIJJLI != null) {
            c0sopLJIJJLI.x6(interfaceC719500SKe);
        }
    }

    public static void LJJIZ(PostModeNestHeaderComponent postModeNestHeaderComponent, boolean z) {
        RunnableC721470SRt runnableC721470SRt = postModeNestHeaderComponent.LLZIL;
        int i = 1;
        if (runnableC721470SRt == null) {
            runnableC721470SRt = new RunnableC721470SRt(postModeNestHeaderComponent);
            postModeNestHeaderComponent.LLZIL = runnableC721470SRt;
        } else {
            if (!z && runnableC721470SRt.LLILLJJLI == 3) {
                runnableC721470SRt.LLILLJJLI = 1;
                return;
            }
            postModeNestHeaderComponent.LLZL.removeCallbacks(runnableC721470SRt);
        }
        runnableC721470SRt.getClass();
        runnableC721470SRt.LLILLL = postModeNestHeaderComponent.LLLLZLL;
        runnableC721470SRt.getClass();
        if (z) {
            i = 3;
        }
        runnableC721470SRt.LLILLJJLI = i;
        C786410Ut5.LJLIIL(600L, postModeNestHeaderComponent.LLZL, runnableC721470SRt);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00e1  */
    @Override // X.C0SS8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r10, java.lang.Integer r11) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent.LIZLLL(int, java.lang.Integer):void");
    }

    public final void LJIIJ(int i, boolean z) {
        C0SU0 c0su0;
        if (!LJJJLZIJ()) {
            return;
        }
        float f = -this.LLLII;
        if (f < 1.0f) {
            f = 1.0f;
        }
        float fLIZLLL = C13LZ.LIZLLL((i - r3) / f, 0.0f, 1.0f);
        WeakReference<C0SU0> weakReference = this.LLJJL;
        if (weakReference != null && (c0su0 = weakReference.get()) != null) {
            C786410Ut5.Cd(c0su0, fLIZLLL * this.LLLILZ);
        }
        if (i > this.LLLII) {
            C0STF c0stf = this.LLJILJILJ;
            if (c0stf != null) {
                C786410Ut5.n1(c0stf, 0);
            }
            View view = this.LLJIJIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(4, view);
            }
        } else {
            C0STF c0stf2 = this.LLJILJILJ;
            if (c0stf2 != null) {
                C786410Ut5.n1(c0stf2, 4);
            }
            View view2 = this.LLJIJIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
        }
        if (this.LLLFZ > 0 && this.LLLLLJIL > 0.0f) {
            LJJIJIIJIL(i, this.LLJILJILJ, z, 2.0f, false);
        }
    }

    public final void LJLJI(boolean z, boolean z2) {
        ViewGroup viewGroup;
        int i;
        View view = (View) this.LLZZJLIL.getValue();
        int i2 = 0;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        ViewGroup viewGroup2 = this.LLILLL.LJ;
        if (viewGroup2 != null && (viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.inr)) != null) {
            if (!z2) {
                i2 = 4;
            }
            C786410Ut5.LJLZ(i2, viewGroup);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoNestHeaderAbility
    public final boolean kF2(int i, int i2) {
        C0SU0 c0su0;
        int size;
        View view;
        boolean zLIZ;
        C20600815jK<InterfaceC1891350zJl> c20600815jKAd0;
        List<InterfaceC1891350zJl> listLJII;
        View view2;
        int iLIZIZ;
        WeakReference<C0SU0> weakReference = this.LLJJL;
        if (weakReference == null || (c0su0 = weakReference.get()) == null) {
            return false;
        }
        int top = -1;
        if (LJJJLZIJ() || i == 0) {
            ICommentListAssemAbility iCommentListAssemAbility = (ICommentListAssemAbility) this.LLJJJJJIL.getValue();
            if (iCommentListAssemAbility != null && (c20600815jKAd0 = iCommentListAssemAbility.ad0()) != null && (listLJII = c20600815jKAd0.LJII()) != null) {
                size = listLJII.size();
                if (size > 0) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c0su0.findViewHolderForAdapterPosition(2);
                    if (viewHolderFindViewHolderForAdapterPosition != null && (view2 = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                        top = view2.getTop();
                        view2.getHeight();
                    }
                    int i3 = this.LLLLIL + top;
                    Rect rect = new Rect();
                    c0su0.getGlobalVisibleRect(rect);
                    int i4 = rect.bottom - rect.top;
                    if (i4 > 0 && top >= 0 && i3 <= i4) {
                        zLIZ = true;
                    }
                    top = size;
                }
                size = top;
                zLIZ = false;
            } else {
                size = -1;
            }
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = c0su0.findViewHolderForAdapterPosition(1);
            if (viewHolderFindViewHolderForAdapterPosition2 != null && (view = viewHolderFindViewHolderForAdapterPosition2.itemView) != null) {
                zLIZ = C717490SCl.LIZ(view);
            }
            top = size;
            size = top;
            zLIZ = false;
        } else {
            size = top;
            zLIZ = false;
        }
        if (LJJJLZIJ() && zLIZ) {
            return true;
        }
        if (i == 0) {
            if (size >= 3) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(65));
            } else {
                iLIZIZ = 0;
            }
            if (!zLIZ) {
                LJLI(i2);
                c0su0.nestedScrollBy(0, iLIZIZ);
                return true;
            }
            AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehavior = this.LLJ;
            if (advancedStopAtOffsetAppBarBehavior != null) {
                advancedStopAtOffsetAppBarBehavior.LJIIIIZZ = false;
            }
            c0su0.scrollToPosition(i2);
            c0su0.nestedScrollBy(0, iLIZIZ);
            return true;
        }
        LJLI(i2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0200  */
    @Override // com.ss.android.ugc.aweme.ability.IPhotoNestHeaderAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean yD0(X.EnumC721170SQp r20, X.C0SPB r21) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent.yD0(X.0SQp, X.0SPB):boolean");
    }

    public final void LJJJJJ(Set<? extends InterfaceC469360Ias> set, Set<? extends InterfaceC719500SKe> set2, Set<? extends C0SMF> set3) {
        if (this.LLIZ == null) {
            ViewGroup viewGroupLJIIJJI = this.LLILLL.LJIIJJI();
            if (viewGroupLJIIJJI == null) {
                return;
            }
            C21146717pB.LIZIZ(this.LLILLL.LIZLLL(), R.layout.ea3, viewGroupLJIIJJI, true);
            this.LLIZ = new C0SOP(this.LL, this.LLILLJJLI, this.LLILLL);
        }
        C0SOM c0somLJFF = this.LLILLL.LJFF();
        if (c0somLJFF != null) {
            c0somLJFF.setEnableRecordUserAction(false);
        }
        if (set != null) {
            for (InterfaceC469360Ias interfaceC469360Ias : set) {
                C0SOP c0sop = this.LLIZ;
                if (c0sop != null) {
                    c0sop.LLJJI(interfaceC469360Ias);
                }
            }
        }
        if (set2 != null) {
            for (InterfaceC719500SKe interfaceC719500SKe : set2) {
                C0SOP c0sop2 = this.LLIZ;
                if (c0sop2 != null) {
                    c0sop2.x6(interfaceC719500SKe);
                }
            }
        }
        if (set3 != null) {
            for (C0SMF c0smf : set3) {
                C0SOP c0sop3 = this.LLIZ;
                if (c0sop3 != null) {
                    c0sop3.K5(c0smf);
                }
            }
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [X.0SSD] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0SS5, X.0SSE, com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.0ScH] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public PostModeNestHeaderComponent(VideoItemParams videoItemParams, PhotoSharedViewModel photoSharedViewModel, C0SRL c0srl, WeakReference<C0SRI> weakReference, C0SS3 c0ss3) {
        ViewGroup.LayoutParams layoutParams;
        C16BC c16bc;
        AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehavior;
        View viewFindViewById;
        PhotoMatrixState photoMatrixState;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        WrapLinearLayoutManager wrapLinearLayoutManager;
        C1337800kuw c1337800kuw;
        Rect rect;
        View view;
        C0SRI c0sri;
        View view2;
        C16G1 c16g1;
        ?? obj = new Object();
        obj.LL = videoItemParams;
        obj.LLILLJJLI = photoSharedViewModel;
        obj.LLILLL = c0srl;
        obj.LLILZ = weakReference;
        obj.LLILZIL = c0ss3;
        obj.LLJJI = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1121));
        obj.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1115));
        obj.LLJJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1113));
        obj.LLJJJ = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1106));
        obj.LLJJJIL = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1104));
        obj.LLJJJJ = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1109));
        obj.LLJJJJJIL = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1108));
        obj.LLJJJJLIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(240));
        obj.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1107));
        obj.LLJLILLLLZIIL = true;
        obj.LLLII = -1;
        obj.LLLIIII = -1;
        obj.LLLIIIIL = -1;
        obj.LLLILZ = 800.0f;
        obj.LLLILZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(241));
        obj.LLLILZLLLI = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1120));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1116));
        obj.LLLIZZ = c01gwLIZIZ;
        obj.LLLJ = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1111));
        obj.LLLJIL = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1117));
        obj.LLLJL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(239));
        obj.LLLL = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1112));
        obj.LLLLII = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1114));
        obj.LLLLIIIILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        obj.LLLLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        obj.LLLLIILL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        obj.LLLLIILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
        obj.LLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53));
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
        int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
        float fLIZIZ = C418440Gaw.LIZIZ(12);
        obj.LLLLILI = fLIZIZ;
        obj.LLLLJ = C418440Gaw.LIZIZ(20);
        obj.LLLLLJLJLL = -1;
        obj.LLLLLL = -1;
        obj.LLLLLLLLLL = -1;
        obj.LLLLLLLZIL = 1.0f;
        obj.LLLLLLZ = -1;
        obj.LLLLLLZZ = -1;
        obj.LLLLLZ = -1;
        obj.LLLLLZIL = -1;
        obj.LLLLLZL = -1;
        obj.LLLLZLLIL = SystemClock.elapsedRealtime();
        obj.LLZL = new BPEAHandler(Looper.getMainLooper());
        obj.LLZLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(242));
        obj.LLZLL = 1.0f;
        obj.LLZZJLIL = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1110));
        obj.LLZZLLIL = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1119));
        obj.LLZZZIL = new Rect();
        obj.d = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1105));
        obj.h = new C721480SRu();
        ViewGroup viewGroup = c0srl.LIZLLL;
        ?? r5 = obj;
        if (viewGroup != null) {
            obj.LLLLZLLIL = SystemClock.elapsedRealtime();
            obj.LLJLILLLLZIIL = true;
            C0SU0 c0su0 = (C0SU0) viewGroup.findViewById(R.id.t0h);
            obj.LLJJL = new WeakReference<>(c0su0);
            c0su0.setEnableTouchConflict(true);
            obj.LJJLIL(fLIZIZ);
            C1337800kuw c1337800kuw2 = (C1337800kuw) viewGroup.findViewById(R.id.p4l);
            obj.LLJI = c1337800kuw2;
            if (c1337800kuw2 != null) {
                c1337800kuw2.setScrollingChild(c0su0);
            }
            C1337800kuw c1337800kuw3 = obj.LLJI;
            if (c1337800kuw3 != null) {
                c1337800kuw3.setSlideDownLambda(new C721500SRw(obj));
            }
            C0SSD c0ssd = (C0SSD) viewGroup.findViewById(R.id.b69);
            obj.LLIZLLLIL = c0ssd;
            if (c0ssd != null) {
                layoutParams = c0ssd.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof C16G1) && (c16g1 = (C16G1) layoutParams) != null) {
                c16bc = c16g1.LIZ;
            } else {
                c16bc = null;
            }
            if (c16bc instanceof AdvancedStopAtOffsetAppBarBehavior) {
                advancedStopAtOffsetAppBarBehavior = (AdvancedStopAtOffsetAppBarBehavior) c16bc;
            } else {
                advancedStopAtOffsetAppBarBehavior = null;
            }
            obj.LLJ = advancedStopAtOffsetAppBarBehavior;
            obj.LLJIJIL = viewGroup.findViewById(R.id.qee);
            obj.LLJILJIL = viewGroup.findViewById(R.id.qev);
            viewGroup.findViewById(R.id.qey);
            obj.LLJILJILJ = (C0STF) viewGroup.findViewById(R.id.jkh);
            if (weakReference != null && (c0sri = weakReference.get()) != null && (view2 = c0sri.getView()) != null) {
                viewFindViewById = view2.findViewById(R.id.icq);
            } else {
                viewFindViewById = null;
            }
            obj.LLJILLL = viewFindViewById;
            obj.LLJJ = viewGroup.findViewById(R.id.rl3);
            PostModeDetailParams postModeDetailParams = c0srl.LJII;
            if (postModeDetailParams != null) {
                photoMatrixState = postModeDetailParams.feedPhotoMatrix;
            } else {
                photoMatrixState = null;
            }
            obj.LLLIILIL = photoMatrixState;
            if (!obj.LJJJJJL() && (view = obj.LLJJ) != null) {
                view.setBackgroundColor(((Number) c01gwLIZIZ.getValue()).intValue());
            }
            C1337800kuw c1337800kuw4 = obj.LLJI;
            if (c1337800kuw4 != null) {
                c1337800kuw4.setObtainAnchorViewLambda(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1576));
            }
            obj.LLILZLL = new C0SOQ(videoItemParams, photoSharedViewModel, c0srl);
            ?? r0 = obj.LLIZLLLIL;
            if (r0 != 0) {
                r0.setTouchControl(obj);
            }
            if (c0ss3 != null) {
                c0ss3.LIZIZ(-16777216, false);
            }
            C0SQW c0sqw = c0srl.LJIILIIL;
            obj.LLLFZ = (int) (c0sqw.LIZ() + c0sqw.LJ);
            obj.LLLI = (int) c0sqw.LIZ();
            int iLIZIZ6 = c0sqw.LIZIZ(c0srl.LIZIZ);
            C0SSD c0ssd2 = obj.LLIZLLLIL;
            if (c0ssd2 != null) {
                layoutParams2 = c0ssd2.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            ViewGroup.MarginLayoutParams c19me = (!(layoutParams2 instanceof C16G1) || (c19me = (ViewGroup.MarginLayoutParams) layoutParams2) == null) ? new C19ME(-1, iLIZIZ6) : c19me;
            c19me.height = iLIZIZ6;
            C0SSD c0ssd3 = obj.LLIZLLLIL;
            if (c0ssd3 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0ssd3);
                c0ssd3.setLayoutParams(c19me);
            }
            PostModeDetailParams postModeDetailParams2 = c0srl.LJII;
            obj.LLLLLLIL = (postModeDetailParams2 == null || (rect = postModeDetailParams2.imageRect) == null) ? new Rect() : rect;
            View view3 = obj.LLJIJIL;
            if (view3 != null) {
                layoutParams3 = view3.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            FrameLayout.LayoutParams c21536219Qa = (!(layoutParams3 instanceof C21536219Qa) || (c21536219Qa = (FrameLayout.LayoutParams) layoutParams3) == null) ? new C21536219Qa(obj.LLLFZ) : c21536219Qa;
            c21536219Qa.height = obj.LLLFZ;
            View view4 = obj.LLJIJIL;
            if (view4 != null) {
                C786410Ut5.W5(view4, c21536219Qa);
            }
            float f = 2;
            obj.LLLILZ = (((Number) c0srl.LJIILIIL.LIZJ.getValue()).floatValue() * f) / 3;
            C0SQW c0sqw2 = c0srl.LJIILIIL;
            C19EG c19eg = c0srl.LIZIZ;
            int i = -((int) (((c0sqw2.LIZIZ(c19eg) - (c0sqw2.LIZ() + c0sqw2.LJ)) - c0sqw2.LIZJ(c19eg)) + C339190DRl.LIZ(f)));
            obj.LLLII = i;
            obj.LLLIIII = i - iLIZIZ3;
            C19EG c19eg2 = c0srl.LIZIZ;
            obj.LLLIIIIL = -((int) (((c0sqw2.LIZIZ(c19eg2) - ((Number) c0sqw2.LJIIIIZZ.getValue()).floatValue()) - c0sqw2.LIZJ(c19eg2)) - C339190DRl.LIZ(30)));
            int i2 = -((int) ((c0sqw2.LIZIZ(c0srl.LIZIZ) - (c0sqw2.LIZ() + c0sqw2.LJ)) - (((Number) c0sqw2.LIZJ.getValue()).floatValue() / f)));
            obj.LLLIIIL = i2 > 0 ? (int) C339190DRl.LIZ(-100) : i2;
            C19EG c19eg3 = c0srl.LIZIZ;
            if (c0sqw2.LJII == 0) {
                c0sqw2.LJII = c0sqw2.LIZJ(c19eg3) - C0H9H.LIZIZ(49);
            }
            C19EG c19eg4 = c0srl.LIZIZ;
            int i3 = -((int) (((c0sqw2.LIZIZ(c19eg4) - c0sqw2.LIZ) - ((Number) c0sqw2.LJIIIIZZ.getValue()).floatValue()) - c0sqw2.LIZJ(c19eg4)));
            obj.LLLLLLZ = i3;
            obj.LLLLLLZZ = iLIZIZ + i3;
            int i4 = iLIZIZ2 + i3;
            obj.LLLLLZIL = i4 > -30 ? -30 : i4;
            obj.LLLLLZL = (i3 <= -10 ? i3 : -10) + iLIZIZ4;
            obj.LLLLLZ = i3 - iLIZIZ5;
            C0SSD c0ssd4 = obj.LLIZLLLIL;
            if (c0ssd4 != null && (c1337800kuw = obj.LLJI) != null) {
                obj.LLLF = new C721490SRv(c0ssd4, c0su0);
                C0SS1 c0ss1 = new C0SS1(c0ssd4, c0su0, new AwS590S0100000_11((PostModeNestHeaderComponent) obj, 514), new AwS590S0100000_11((PostModeNestHeaderComponent) obj, 516), new AwS590S0100000_11((PostModeNestHeaderComponent) obj, 517));
                obj.LLLFFI = c0ss1;
                c0ss1.LJIJ = obj.LLLI + obj.LJJIIJ();
                C0SS1 c0ss12 = obj.LLLFFI;
                if (c0ss12 != null) {
                    c0ss12.LJIJI = obj.LLLII;
                }
                c1337800kuw.setOnTouchEventListener(new C0SS0(obj));
                c0su0.setOnTouchEventListener(new C721530SRz(obj));
                c0su0.setGetUnderlyingTouchView(new AwS555S0100000_11((PostModeNestHeaderComponent) obj, 1578));
                C721460SRs c721460SRs = new C721460SRs(c1337800kuw, c0ssd4, c0su0);
                c721460SRs.LJ = obj;
                AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehaviorLIZ = c721460SRs.LIZ();
                if (advancedStopAtOffsetAppBarBehaviorLIZ != null) {
                    advancedStopAtOffsetAppBarBehaviorLIZ.LIZ = obj;
                }
                AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehaviorLIZ2 = c721460SRs.LIZ();
                if (advancedStopAtOffsetAppBarBehaviorLIZ2 != null) {
                    advancedStopAtOffsetAppBarBehaviorLIZ2.LJFF = new WeakReference<>(c721460SRs.LIZJ);
                }
                c0ssd4.LIZ(c721460SRs.LJI);
                AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehaviorLIZ3 = c721460SRs.LIZ();
                if (advancedStopAtOffsetAppBarBehaviorLIZ3 != null) {
                    advancedStopAtOffsetAppBarBehaviorLIZ3.LIZ = c721460SRs.LJ;
                }
                AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehaviorLIZ4 = c721460SRs.LIZ();
                if (advancedStopAtOffsetAppBarBehaviorLIZ4 != null) {
                    advancedStopAtOffsetAppBarBehaviorLIZ4.LJIILLIIL = new AwS590S0100000_11(c721460SRs, 512);
                }
                c1337800kuw.setOnNextDownListener(new AwS555S0100000_11(c721460SRs, 1567));
                obj.LLLFF = c721460SRs;
            }
            C0SQW c0sqw3 = obj.LLILLL.LJIILIIL;
            float fLIZ = c0sqw3.LIZ();
            float f2 = c0sqw3.LJ;
            int i5 = (int) ((fLIZ + f2) - f2);
            C0STF c0stf = obj.LLJILJILJ;
            if (c0stf != null) {
                layoutParams4 = c0stf.getLayoutParams();
            } else {
                layoutParams4 = null;
            }
            RelativeLayout.LayoutParams layoutParams5 = (!(layoutParams4 instanceof RelativeLayout.LayoutParams) || (layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4) == null) ? new RelativeLayout.LayoutParams(-1, i5) : layoutParams5;
            layoutParams5.height = i5;
            layoutParams5.topMargin = obj.LJJIIJ();
            C0STF c0stf2 = obj.LLJILJILJ;
            if (c0stf2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf2);
                c0stf2.setLayoutParams(layoutParams5);
            }
            obj.LLILLL.LJIIIIZZ.LLJLLIL.observe(obj.LJJIIZI(), new AObserverS215S0100000_11(obj, 48));
            obj.LLILLL.LJIIIIZZ.LLJLLL.observe(obj.LJJIIZI(), new AObserverS215S0100000_11(obj, 50));
            Bitmap bitmap = obj.LLILLJJLI.LLILLL;
            if (bitmap != null && (!bitmap.isRecycled())) {
                obj.LJLJJLL(bitmap);
                obj.LLLLJI = bitmap.getHeight();
                obj.LLLLL = bitmap.getWidth();
                C0STF c0stf3 = obj.LLJILJILJ;
                if (c0stf3 != null) {
                    c0stf3.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
                C0STF c0stf4 = obj.LLJILJILJ;
                if (c0stf4 != null) {
                    c0stf4.setActualImageScaleType(EnumC1338240kve.FIT_CENTER);
                }
                C0STF c0stf5 = obj.LLJILJILJ;
                if (c0stf5 != null) {
                    c0stf5.setImageBitmap(bitmap);
                }
            }
            obj.LLILLL.LJIIIIZZ.LLJZ.observe(obj.LJJIIZI(), new AObserverS215S0100000_11(obj, 51));
            C721410SRn c721410SRn = new C721410SRn(obj.LLILLL.LIZLLL());
            obj.LLJJIJI = c721410SRn;
            c721410SRn.LJII = new AwS590S0100000_11((PostModeNestHeaderComponent) obj, 521);
            PostModeFullPageViewModel postModeFullPageViewModel = obj.LLILLL.LJIIIZ;
            final ?? r52 = obj;
            if (postModeFullPageViewModel != null) {
                C0RHK c0rhk = new C2217381BqS() { // from class: X.0RHK
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Integer.valueOf(((C0S9P) obj2).LL);
                    }
                };
                AwS625S0100000_11 awS625S0100000_11 = new AwS625S0100000_11((PostModeNestHeaderComponent) obj, 142);
                ?? r53 = obj;
                C736680Sv4.LJIIIIZZ(r53, postModeFullPageViewModel, c0rhk, null, awS625S0100000_11, 6);
                r52 = r53;
            }
            RecyclerView.LayoutManager layoutManager = c0su0.getLayoutManager();
            if (layoutManager instanceof WrapLinearLayoutManager) {
                wrapLinearLayoutManager = (WrapLinearLayoutManager) layoutManager;
            } else {
                wrapLinearLayoutManager = null;
            }
            r52.LLZZZZ = wrapLinearLayoutManager;
            if (wrapLinearLayoutManager != null) {
                wrapLinearLayoutManager.LLILLL = false;
            }
            r52.a = Boolean.FALSE;
            C0SSD c0ssd5 = r52.LLIZLLLIL;
            if (c0ssd5 != null) {
                c0ssd5.LIZ(new InterfaceC1324370kZH() { // from class: X.0SRk
                    @Override // X.InterfaceC1324380kZI
                    public final void LLZZJLIL(C16GX c16gx, int i6) {
                        int totalScrollRange;
                        boolean z;
                        C0SSD c0ssd6;
                        int i7;
                        C0SSD c0ssd7;
                        int iIntValue;
                        boolean z2;
                        int iIntValue2;
                        boolean z3;
                        C0SS1 c0ss13;
                        float f3;
                        RunnableC721470SRt runnableC721470SRt;
                        Integer num;
                        IPhotoFloatGuideAbility iPhotoFloatGuideAbility;
                        PostModeNestHeaderComponent postModeNestHeaderComponent = this.LL;
                        C0SSD c0ssd8 = postModeNestHeaderComponent.LLIZLLLIL;
                        if (c0ssd8 != null) {
                            totalScrollRange = c0ssd8.getTotalScrollRange();
                        } else {
                            totalScrollRange = 0;
                        }
                        postModeNestHeaderComponent.LLLLZ = totalScrollRange;
                        if (Math.abs(i6 - postModeNestHeaderComponent.LLLII) <= 1 && postModeNestHeaderComponent.LLZILL == null && !Intrinsics.LJFF(postModeNestHeaderComponent.LLILLL.LJIIIIZZ.LLJLLIL.getValue(), Boolean.TRUE)) {
                            if (postModeNestHeaderComponent.LLZILL == null) {
                                postModeNestHeaderComponent.LLZILL = new ARunnableS111S0100000_11(postModeNestHeaderComponent, 161);
                            }
                            ARunnableS111S0100000_11 aRunnableS111S0100000_11 = postModeNestHeaderComponent.LLZILL;
                            if (aRunnableS111S0100000_11 != null) {
                                C786410Ut5.LJLIIL(30L, postModeNestHeaderComponent.LLZL, aRunnableS111S0100000_11);
                            }
                        }
                        int i8 = postModeNestHeaderComponent.LLLLZI;
                        if (i8 != i6 && !postModeNestHeaderComponent.LLJLILLLLZIIL && i8 != postModeNestHeaderComponent.LLLII && (iPhotoFloatGuideAbility = (IPhotoFloatGuideAbility) postModeNestHeaderComponent.i.getValue()) != null) {
                            iPhotoFloatGuideAbility.LJJJJLL(false);
                        }
                        postModeNestHeaderComponent.LLLLZI = i6;
                        if (!postModeNestHeaderComponent.LLJLILLLLZIIL) {
                            if (postModeNestHeaderComponent.LLLZI != null && (num = postModeNestHeaderComponent.LLLLZIL) != null) {
                                int iIntValue3 = num.intValue();
                                Integer num2 = postModeNestHeaderComponent.LLLLZLL;
                                if (num2 != null) {
                                    iIntValue3 = num2.intValue();
                                }
                                postModeNestHeaderComponent.LLLLZLL = Integer.valueOf(Math.min(i6, iIntValue3));
                            }
                            if (i6 == (-postModeNestHeaderComponent.LLLLZ)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!Intrinsics.LJFF(postModeNestHeaderComponent.a, Boolean.valueOf(z))) {
                                postModeNestHeaderComponent.a = Boolean.valueOf(z);
                                WrapLinearLayoutManager wrapLinearLayoutManager2 = postModeNestHeaderComponent.LLZZZZ;
                                if (wrapLinearLayoutManager2 != null) {
                                    wrapLinearLayoutManager2.LLILLL = z;
                                }
                            }
                            if (!postModeNestHeaderComponent.LJJJJZI() && (runnableC721470SRt = postModeNestHeaderComponent.LLZ) != null) {
                                postModeNestHeaderComponent.LLZL.removeCallbacks(runnableC721470SRt);
                            }
                            postModeNestHeaderComponent.LJIIJJI();
                            if (postModeNestHeaderComponent.LJJJLZIJ()) {
                                if (i6 > postModeNestHeaderComponent.LLLII) {
                                    postModeNestHeaderComponent.LJJLJLI(2);
                                    View view5 = postModeNestHeaderComponent.LLJILJIL;
                                    if (view5 != null) {
                                        C786410Ut5.LJLLLLLL(0, view5);
                                    }
                                    C0STF c0stf6 = postModeNestHeaderComponent.LLJILJILJ;
                                    if (c0stf6 != null) {
                                        C786410Ut5.n1(c0stf6, 0);
                                    }
                                    View view6 = postModeNestHeaderComponent.LLJIJIL;
                                    if (view6 != null) {
                                        C786410Ut5.LJLLLLLL(4, view6);
                                    }
                                    if (postModeNestHeaderComponent.LLLFZ > 0 && postModeNestHeaderComponent.LLLLLJIL > 0.0f) {
                                        C0STF c0stf7 = postModeNestHeaderComponent.LLJILJILJ;
                                        if (postModeNestHeaderComponent.LLZZ > 0) {
                                            f3 = 1.0f;
                                        } else {
                                            f3 = 2.0f;
                                        }
                                        postModeNestHeaderComponent.LJJIJIIJIL(i6, c0stf7, false, f3, false);
                                    }
                                } else {
                                    View view7 = postModeNestHeaderComponent.LLJILJIL;
                                    if (view7 != null) {
                                        C786410Ut5.LJLLLLLL(4, view7);
                                    }
                                    C0STF c0stf8 = postModeNestHeaderComponent.LLJILJILJ;
                                    if (c0stf8 != null) {
                                        C786410Ut5.n1(c0stf8, 4);
                                    }
                                    View view8 = postModeNestHeaderComponent.LLJIJIL;
                                    if (view8 != null) {
                                        C786410Ut5.LJLLLLLL(0, view8);
                                    }
                                }
                                postModeNestHeaderComponent.LJLJI(true, false);
                            }
                            if (postModeNestHeaderComponent.LJJJLZIJ() && i6 < postModeNestHeaderComponent.LLLII && i6 >= postModeNestHeaderComponent.LLLIIIIL) {
                                postModeNestHeaderComponent.LJJLJLI(3);
                                View view9 = postModeNestHeaderComponent.LLJIJIL;
                                if (view9 != null) {
                                    C786410Ut5.Ob(view9, 1.0f);
                                }
                                View view10 = postModeNestHeaderComponent.LLJIJIL;
                                if (view10 != null) {
                                    C786410Ut5.pc(view10, 1.0f);
                                }
                                View view11 = postModeNestHeaderComponent.LLJIJIL;
                                if (view11 != null) {
                                    C786410Ut5.ed(view11, 0.0f);
                                }
                                postModeNestHeaderComponent.LJLJI(true, false);
                            } else if (i6 <= postModeNestHeaderComponent.LLLIIIIL && postModeNestHeaderComponent.LLJL != 5) {
                                postModeNestHeaderComponent.LJIILIIL();
                            } else if (postModeNestHeaderComponent.LLJL == 5 && i6 >= postModeNestHeaderComponent.LLLLLLZ) {
                                postModeNestHeaderComponent.LJJLJLI(6);
                                View view12 = postModeNestHeaderComponent.LLJILJIL;
                                if (view12 != null) {
                                    C786410Ut5.LJLLLLLL(0, view12);
                                }
                            } else if (postModeNestHeaderComponent.LJJJZ() && i6 < postModeNestHeaderComponent.LLLLLLZ) {
                                postModeNestHeaderComponent.LJJLJLI(5);
                                if (!postModeNestHeaderComponent.LJJJJJL() && (c0ssd6 = postModeNestHeaderComponent.LLIZLLLIL) != null) {
                                    c0ssd6.setBackgroundColor(((Number) postModeNestHeaderComponent.LLLIZZ.getValue()).intValue());
                                }
                                View view13 = postModeNestHeaderComponent.LLJILJIL;
                                if (view13 != null) {
                                    C786410Ut5.LJLLLLLL(4, view13);
                                }
                            }
                            int i9 = postModeNestHeaderComponent.LLJL;
                            if ((i9 == 7 || i9 == 6) && i6 >= (i7 = postModeNestHeaderComponent.LLLLLLZ)) {
                                float f4 = i6;
                                float f5 = postModeNestHeaderComponent.LLLLJ * ((((-1.0f) * f4) / i7) + 1.0f);
                                ViewGroup viewGroupLJIIJJI = postModeNestHeaderComponent.LLILLL.LJIIJJI();
                                if (viewGroupLJIIJJI != null) {
                                    C721480SRu c721480SRu = postModeNestHeaderComponent.h;
                                    c721480SRu.LIZ = f5;
                                    if (!postModeNestHeaderComponent.c) {
                                        viewGroupLJIIJJI.setOutlineProvider(c721480SRu);
                                        viewGroupLJIIJJI.setClipToOutline(true);
                                        postModeNestHeaderComponent.c = true;
                                    } else {
                                        viewGroupLJIIJJI.invalidateOutline();
                                    }
                                }
                                View view14 = postModeNestHeaderComponent.LLJILJIL;
                                if (view14 != null) {
                                    C786410Ut5.ed(view14, (postModeNestHeaderComponent.LLLIL + f4) - postModeNestHeaderComponent.LLLLLLZ);
                                }
                                C415520GRa c415520GRaLJIIJ = postModeNestHeaderComponent.LLILLL.LJIIJ();
                                if (c415520GRaLJIIJ != null) {
                                    int visibility = c415520GRaLJIIJ.getVisibility();
                                    c415520GRaLJIIJ.setVisibility(0);
                                    C1602160rnK.LIZIZ(visibility, 0, c415520GRaLJIIJ);
                                }
                                C415520GRa c415520GRaLJIIJ2 = postModeNestHeaderComponent.LLILLL.LJIIJ();
                                if (c415520GRaLJIIJ2 != null) {
                                    c415520GRaLJIIJ2.setArrowH(f5 / 3);
                                }
                                if (postModeNestHeaderComponent.LLLLZI > postModeNestHeaderComponent.LLLLLZIL) {
                                    postModeNestHeaderComponent.LJL(300L);
                                    postModeNestHeaderComponent.LJLILLLLZI(1.0f);
                                } else {
                                    int i10 = postModeNestHeaderComponent.LLLLLLZ;
                                    float f6 = ((r7 - i10) + 0.0f) / (r8 - i10);
                                    postModeNestHeaderComponent.LJLILLLLZI(f6);
                                    C415520GRa c415520GRaLJIIJ3 = postModeNestHeaderComponent.LLILLL.LJIIJ();
                                    if (c415520GRaLJIIJ3 != null) {
                                        int visibility2 = c415520GRaLJIIJ3.getVisibility();
                                        c415520GRaLJIIJ3.setVisibility(0);
                                        C1602160rnK.LIZIZ(visibility2, 0, c415520GRaLJIIJ3);
                                    }
                                    C415520GRa c415520GRaLJIIJ4 = postModeNestHeaderComponent.LLILLL.LJIIJ();
                                    if (c415520GRaLJIIJ4 != null) {
                                        c415520GRaLJIIJ4.setArrowH(0.0f);
                                    }
                                    C415520GRa c415520GRaLJIIJ5 = postModeNestHeaderComponent.LLILLL.LJIIJ();
                                    if (c415520GRaLJIIJ5 != null) {
                                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c415520GRaLJIIJ5);
                                        c415520GRaLJIIJ5.setAlpha(f6);
                                    }
                                    postModeNestHeaderComponent.LJJLL(f6);
                                    postModeNestHeaderComponent.LJJJJ();
                                }
                                if (!postModeNestHeaderComponent.LJJJJJL() && (c0ssd7 = postModeNestHeaderComponent.LLIZLLLIL) != null) {
                                    c0ssd7.setBackgroundColor(((Number) postModeNestHeaderComponent.LLLJIL.getValue()).intValue());
                                }
                                postModeNestHeaderComponent.b = false;
                            } else if (!postModeNestHeaderComponent.b) {
                                postModeNestHeaderComponent.LJJLIIIJJIZ();
                            }
                            if (!postModeNestHeaderComponent.LJJJJZI() && postModeNestHeaderComponent.LLJL != 1 && postModeNestHeaderComponent.LLLZI == null && (!postModeNestHeaderComponent.LJJJLZIJ() || (c0ss13 = postModeNestHeaderComponent.LLLFFI) == null || !c0ss13.LIZ())) {
                                if (postModeNestHeaderComponent.LLJL == 2 && i6 >= postModeNestHeaderComponent.LLLIIIL) {
                                    PostModePageViewModel postModePageViewModel = postModeNestHeaderComponent.LLILLL.LJIIIIZZ;
                                    EnumC721170SQp enumC721170SQp = EnumC721170SQp.FLOAT_SWIPE_DOWN;
                                    if (!postModePageViewModel.BQ2(enumC721170SQp)) {
                                        postModeNestHeaderComponent.LJJLJLI(4);
                                        RunnableC721470SRt runnableC721470SRt2 = postModeNestHeaderComponent.LLZ;
                                        if (runnableC721470SRt2 != null) {
                                            postModeNestHeaderComponent.LLZL.removeCallbacks(runnableC721470SRt2);
                                        }
                                        RunnableC721470SRt runnableC721470SRt3 = postModeNestHeaderComponent.LLZIL;
                                        if (runnableC721470SRt3 != null) {
                                            postModeNestHeaderComponent.LLZL.removeCallbacks(runnableC721470SRt3);
                                        }
                                        postModeNestHeaderComponent.LLILLL.LJIIIIZZ.vQ2(enumC721170SQp);
                                        return;
                                    }
                                }
                                if (postModeNestHeaderComponent.LJJJZ() && i6 >= postModeNestHeaderComponent.LLLLLZL) {
                                    if (!postModeNestHeaderComponent.LLLZZ && !postModeNestHeaderComponent.LLLZLZ) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    Integer num3 = postModeNestHeaderComponent.LLLLZLL;
                                    if (num3 != null) {
                                        iIntValue2 = num3.intValue();
                                    } else {
                                        iIntValue2 = -postModeNestHeaderComponent.LLLLZ;
                                    }
                                    if (iIntValue2 > postModeNestHeaderComponent.LLLLLZ) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z2 || z3) {
                                        PostModePageViewModel postModePageViewModel2 = postModeNestHeaderComponent.LLILLL.LJIIIIZZ;
                                        EnumC721170SQp enumC721170SQp2 = EnumC721170SQp.FULL_SWIPE_DOWN;
                                        if (!postModePageViewModel2.BQ2(enumC721170SQp2)) {
                                            postModeNestHeaderComponent.LJJLJLI(7);
                                            RunnableC721470SRt runnableC721470SRt4 = postModeNestHeaderComponent.LLZ;
                                            if (runnableC721470SRt4 != null) {
                                                postModeNestHeaderComponent.LLZL.removeCallbacks(runnableC721470SRt4);
                                            }
                                            RunnableC721470SRt runnableC721470SRt5 = postModeNestHeaderComponent.LLZIL;
                                            if (runnableC721470SRt5 != null) {
                                                postModeNestHeaderComponent.LLZL.removeCallbacks(runnableC721470SRt5);
                                            }
                                            postModeNestHeaderComponent.LLILLL.LJIIIIZZ.vQ2(enumC721170SQp2);
                                            return;
                                        }
                                    }
                                }
                            }
                            if (!postModeNestHeaderComponent.LJJJJZI() && postModeNestHeaderComponent.LLLZI == null) {
                                Integer num4 = postModeNestHeaderComponent.LLLLZLL;
                                if (postModeNestHeaderComponent.LJJJZ() && ((postModeNestHeaderComponent.LLLZZ || postModeNestHeaderComponent.LLLZLZ) && postModeNestHeaderComponent.LLLZIIL == 2 && postModeNestHeaderComponent.LLLZL == postModeNestHeaderComponent.LLLZLL)) {
                                    if (num4 != null) {
                                        iIntValue = num4.intValue();
                                    } else {
                                        iIntValue = -postModeNestHeaderComponent.LLLLZ;
                                    }
                                    if (iIntValue > postModeNestHeaderComponent.LLLLLZ) {
                                        PostModePageViewModel postModePageViewModel3 = postModeNestHeaderComponent.LLILLL.LJIIIIZZ;
                                        EnumC721170SQp enumC721170SQp3 = EnumC721170SQp.FULL_SWIPE_DOWN;
                                        if (!postModePageViewModel3.BQ2(enumC721170SQp3)) {
                                            postModeNestHeaderComponent.LJJLJLI(7);
                                            postModeNestHeaderComponent.LLILLL.LJIIIIZZ.vQ2(enumC721170SQp3);
                                        }
                                    }
                                }
                                postModeNestHeaderComponent.LJJLIIIJILLIZJL();
                            }
                        }
                    }
                });
            }
            r52.LJLJJI(false);
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c0su0, new ARunnableS80S0200000_11(c0su0, (Object) r52, 68));
            r5 = r52;
        }
        r5.getLifecycle().addObserver(new AnonymousClass1());
        r5.i = C452501pT.LIZIZ(new AwS555S0100000_11((PostModeNestHeaderComponent) r5, 1118));
    }

    public static void LJLIIIL(PostModeNestHeaderComponent postModeNestHeaderComponent, int i, AwS590S0100000_11 awS590S0100000_11, Function0 function0, int i2) {
        final AwS590S0100000_11 awS590S0100000_112 = awS590S0100000_11;
        final Function0 function02 = null;
        if ((i2 & 2) != 0) {
            awS590S0100000_112 = null;
        }
        if ((i2 & 4) == 0) {
            function02 = function0;
        }
        final C721490SRv c721490SRv = postModeNestHeaderComponent.LLLF;
        if (c721490SRv != null) {
            final C721430SRp c721430SRp = new C721430SRp(0);
            final Function0 function03 = null;
            final int iLJ = C13LZ.LJ(i, -c721490SRv.LIZ.getTotalScrollRange(), 0);
            c721490SRv.LIZ();
            c721490SRv.LIZIZ.stopScroll();
            q0.LJJIII(0, c721490SRv.LIZIZ);
            q0.LJJIII(1, c721490SRv.LIZIZ);
            final int i3 = c721490SRv.LIZLLL;
            if (i3 == iLJ) {
                if (awS590S0100000_112 != null) {
                    awS590S0100000_112.invoke(Float.valueOf(1.0f));
                }
                if (function02 != null) {
                    function02.invoke();
                    return;
                }
                return;
            }
            c721490SRv.LIZIZ.setNestedScrollingEnabled(true);
            c721490SRv.LIZIZ.startNestedScroll(2, 1);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(c721430SRp.LIZ);
            valueAnimatorOfFloat.setInterpolator(c721430SRp.LIZIZ);
            final int[] iArr = new int[2];
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0SRx
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    C721490SRv c721490SRv2 = c721490SRv;
                    int i4 = i3;
                    int i5 = iLJ;
                    c721490SRv2.getClass();
                    int i6 = (int) (i4 + ((i5 - i4) * animatedFraction));
                    C721490SRv c721490SRv3 = c721490SRv;
                    int i7 = c721490SRv3.LIZLLL - i6;
                    if (i7 != 0) {
                        int[] iArr2 = iArr;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        c721490SRv3.LIZIZ.dispatchNestedPreScroll(0, i7, iArr2, null, 1);
                    }
                    Function1<Float, Unit> function1 = awS590S0100000_112;
                    if (function1 != null) {
                        function1.invoke(Float.valueOf(animatedFraction));
                    }
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0SRo
                public boolean LL;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    this.LL = true;
                    Function0<Unit> function04 = function02;
                    if (function04 != null) {
                        function04.invoke();
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Function0<Unit> function04;
                    Function0<Unit> function05;
                    try {
                        C721490SRv c721490SRv2 = c721490SRv;
                        int i4 = iLJ;
                        int i5 = c721430SRp.LIZJ;
                        for (int i6 = 0; Math.abs(c721490SRv2.LIZLLL - i4) > i5 && i6 < 8; i6++) {
                            int[] iArr2 = new int[2];
                            c721490SRv2.LIZIZ.dispatchNestedPreScroll(0, c721490SRv2.LIZLLL - i4, iArr2, null, 1);
                            if (iArr2[1] == 0) {
                                break;
                            }
                        }
                        c721490SRv.LIZIZ();
                        c721490SRv.LIZJ = null;
                        if (!this.LL && (function05 = function02) != null) {
                            function05.invoke();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c721490SRv.LIZIZ();
                        c721490SRv.LIZJ = null;
                        if (!this.LL && (function04 = function02) != null) {
                            function04.invoke();
                        }
                        throw th;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    Function0<Unit> function04 = function03;
                    if (function04 != null) {
                        function04.invoke();
                    }
                }
            });
            valueAnimatorOfFloat.start();
            c721490SRv.LIZJ = valueAnimatorOfFloat;
        }
    }

    public final void LJJIJIIJIL(int i, C0STF c0stf, boolean z, float f, boolean z2) {
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        float fLIZLLL;
        int i4;
        if (c0stf == null) {
            return;
        }
        c0stf.setPivotX(LJJIFFI() / 2.0f);
        c0stf.setPivotY(0.0f);
        int i5 = i - this.LLLII;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = this.LLLI;
        int i7 = 1;
        if (i6 < 1) {
            i6 = 1;
        }
        float f2 = i5;
        float fMax = ((f * f2) / i6) + 1.0f;
        if (this.LLLLLJIL * fMax > LJJIFFI()) {
            fMax = this.LLLLLLLZIL;
        }
        if (z) {
            fMax = Math.max(c0stf.getScaleX(), fMax);
        }
        C786410Ut5.Ob(c0stf, fMax);
        C786410Ut5.pc(c0stf, fMax);
        int i8 = this.LLLLLJLJLL;
        if (i8 < 0 && i8 >= this.LLLII) {
            z3 = true;
            int i9 = i8 - this.LLLII;
            if (i9 < 1) {
                i9 = 1;
            }
            float fLIZLLL2 = C13LZ.LIZLLL(f2 / i9, 0.0f, 1.0f);
            float f3 = this.LLLLLLLLL;
            float fMax2 = fLIZLLL2 * f3;
            if (z) {
                if (f3 < 0.0f) {
                    fMax2 = Math.min(c0stf.getTranslationY(), fMax2);
                } else if (f3 > 0.0f) {
                    fMax2 = Math.max(c0stf.getTranslationY(), fMax2);
                }
            }
            C786410Ut5.ed(c0stf, fMax2);
        } else {
            z3 = false;
        }
        if (z2) {
            if (this.LLZLLLL == this.LLZLLIL || (this.LLLLJI == this.LLLLLIL && this.LLLLL == this.LLLLLILLIL)) {
                z4 = true;
            } else {
                z4 = false;
            }
            View viewLJIIZILJ = LJIIZILJ();
            if (viewLJIIZILJ != null) {
                if (z3 && i > (i4 = this.LLLLLJLJLL) && z4) {
                    fLIZLLL = C13LZ.LIZLLL(i / i4, 0.0f, 1.0f);
                } else {
                    fLIZLLL = 1.0f;
                }
                C786410Ut5.T4(viewLJIIZILJ, fLIZLLL);
            }
        }
        Rect rect = this.LLLLLLIL;
        if (rect != null && rect.bottom > 0 && this.LLLLLLJ > 0.0f && (i2 = this.LLLLLLLLLL) < 0 && i2 >= (i3 = this.LLLII)) {
            int i10 = i2 - i3;
            if (i10 >= 1) {
                i7 = i10;
            }
            this.LLZZZIL.set(0, 0, LJJIFFI(), (int) (this.LLLI - (C13LZ.LIZLLL(f2 / i7, 0.0f, 1.0f) * this.LLLLLLJ)));
            c0stf.setClipBounds(this.LLZZZIL);
        }
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
