package com.ss.android.ugc.aweme.ui.view.photos;

import X.C01GW;
import X.C03H5;
import X.C04V1;
import X.C098200Yq;
import X.C0B05;
import X.C0N0Y;
import X.C0RGG;
import X.C0S9P;
import X.C0SBA;
import X.C0SM8;
import X.C0SMB;
import X.C0SMF;
import X.C0SO6;
import X.C0SOA;
import X.C0SOB;
import X.C0SOE;
import X.C0SOM;
import X.C0SOT;
import X.C0SOW;
import X.C0SRL;
import X.C0ST8;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1375730lu7;
import X.C1389890mGx;
import X.C13LQ;
import X.C1483410ohn;
import X.C14EU;
import X.C14K4;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1570830qyn;
import X.C1602160rnK;
import X.C1616410sAJ;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19ME;
import X.C20246014Ju;
import X.C2097608Jq;
import X.C259630AFl;
import X.C286310BKb;
import X.C295550BiD;
import X.C299650Bop;
import X.C304280BwI;
import X.C356901a3;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C429590Gsv;
import X.C497820Jfg;
import X.C585960MyY;
import X.C586380MzE;
import X.C666700QDc;
import X.C687700QyG;
import X.C696790RUv;
import X.C714060Rzg;
import X.C716660S9g;
import X.C716710S9l;
import X.C719520SKg;
import X.C719720SLa;
import X.C719880SLq;
import X.C720360SNm;
import X.C720470SNx;
import X.C721090SQh;
import X.C721220SQu;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C823050WQl;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC469360Ias;
import X.InterfaceC665370Q7z;
import X.InterfaceC710220RtU;
import X.InterfaceC719460SKa;
import X.InterfaceC719500SKe;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.RunnableC720480SNy;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS146S0100000_11;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS22S0101000_11;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.ability.IPhotoNestHeaderAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.aweme.scope.PostModeDetailScope;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class PostModePhotosComponent implements InterfaceC724530SbT, InterfaceC469360Ias, IPhotoSlidesAbility, IPhotoSlidesEventDispatchAbility, InterfaceC1146704e9 {
    public final C0SRL LL;
    public final VideoItemParams LLILLJJLI;
    public final ViewGroup LLILLL;
    public final C0SOM LLILZ;
    public final C01GW LLILZIL;
    public C716660S9g LLILZLL;
    public C719880SLq LLIZ;
    public C716710S9l LLIZLLLIL;
    public final GestureDetector LLJ;
    public final PostModeFullPageViewModel LLJI;
    public final C0SBA LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C01GW LLJJI;
    public final C720470SNx LLJJIII;
    public boolean LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public C0SOT LLJJJ;
    public final List<C0SOW> LLJJJIL;
    public ImageView LLJJJJ;
    public Integer LLJJJJJIL;
    public Boolean LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public Drawable LLJLILLLLZIIL;
    public boolean LLJLL;
    public Integer LLJLLIL;
    public ViewGroup LLJLLL;
    public int LLJZ;
    public ViewGroup.LayoutParams LLJZIJLIL;
    public Drawable LLL;
    public View LLLF;
    public int LLLFF;
    public ViewGroup LLLFFI;
    public int LLLFZ;
    public ViewGroup.LayoutParams LLLI;
    public C716660S9g LLLII;
    public TuxTextView LLLIIII;
    public SmartImagePhotoViewHolderV2 LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final ARunnableS111S0100000_11 LLLIILIL;
    public final C696790RUv LLLIL;
    public final C01GW LLLILZ;
    public InterfaceC719500SKe LLLILZJ;
    public final List<InterfaceC719500SKe> LLLILZLLLI;
    public final List<Function0<Unit>> LLLIZZ;
    public final ARunnableS111S0100000_11 LLLJ;
    public final AwS555S0100000_11 LLLJIL;
    public RunnableC720480SNy LLLJL;

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final void Cq1(View view) {
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final Rect Gi2() {
        return null;
    }

    public void LJIILIIL(MotionEvent motionEvent) {
    }

    public boolean LJJ() {
        return false;
    }

    public boolean LJJIFFI() {
        return false;
    }

    public int LJJIL() {
        return R.id.qex;
    }

    public int LJJIZ() {
        return R.id.rl_;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final void ML0(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final Bundle Rc2() {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PostModeDetailScope.class});
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
        arrayList.add(PostModeDetailScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final InterfaceC710220RtU yn() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final int Al() {
        PostModeFullPageViewModel postModeFullPageViewModel = this.LLJI;
        if (postModeFullPageViewModel != null) {
            return postModeFullPageViewModel.zQ2();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final int K91() {
        PostModeFullPageViewModel postModeFullPageViewModel = this.LLJI;
        if (postModeFullPageViewModel != null) {
            return postModeFullPageViewModel.AQ2();
        }
        return 0;
    }

    public final void LIZ() {
        ViewGroup viewGroup;
        FrameLayout.LayoutParams layoutParams;
        int i;
        ViewGroup viewGroup2 = this.LLJJIJIIJIL;
        if (viewGroup2 == null || (viewGroup = this.LL.LIZLLL) == null) {
            return;
        }
        int iLJJIIZI = LJJIIZI(viewGroup);
        for (Pair pair : C1697810uHb.LJIIJJI(new Pair(Integer.valueOf(R.id.qbt), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)))), new Pair(Integer.valueOf(R.id.qby), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)))), new Pair(Integer.valueOf(R.id.qbs), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)))))) {
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            View viewFindViewById = viewGroup2.findViewById(iIntValue);
            if (viewFindViewById != null) {
                ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null && layoutParams.bottomMargin != (i = iIntValue2 + iLJJIIZI)) {
                    layoutParams.bottomMargin = i;
                    C786410Ut5.W5(viewFindViewById, layoutParams);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ() {
        C0SOM c0som;
        ViewGroup viewGroup;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator startDelay;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator startDelay2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate3;
        ViewPropertyAnimator viewPropertyAnimatorAlpha3;
        ViewPropertyAnimator startDelay3;
        ViewPropertyAnimator duration3;
        ViewPropertyAnimator viewPropertyAnimatorAnimate4;
        ViewPropertyAnimator viewPropertyAnimatorAlpha4;
        ViewPropertyAnimator startDelay4;
        ViewPropertyAnimator duration4;
        C0S9P c0s9p;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup viewGroup2;
        C19ME c19me;
        C19ME c19me2;
        int i;
        if (this.LLJJIJIIJIL != null || (c0som = this.LLILZ) == null || (viewGroup = this.LL.LIZLLL) == null) {
            return;
        }
        this.LLJJ = false;
        ViewParent parent = c0som.getParent();
        ImageView imageView = null;
        ViewGroup viewGroup3 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        this.LLJLLL = viewGroup3;
        this.LLJZ = viewGroup3 != null ? viewGroup3.indexOfChild(c0som) : 0;
        this.LLJZIJLIL = c0som.getLayoutParams();
        ViewGroup viewGroup4 = (ViewGroup) C786410Ut5.Td(C786410Ut5.ne(c0som.getContext()), R.layout.e9x, viewGroup, false);
        this.LLL = c0som.getBackground();
        c0som.setBackgroundColor(-16777216);
        ViewGroup viewGroup5 = this.LLJLLL;
        if (viewGroup5 != null) {
            C786410Ut5.LJJJLZIJ(c0som, viewGroup5);
        }
        ViewGroup viewGroup6 = this.LLJLLL;
        if (viewGroup6 != null) {
            ViewGroup.LayoutParams layoutParams2 = this.LLJZIJLIL;
            if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                Space space = new Space(c0som.getContext());
                space.setId(View.generateViewId());
                C786410Ut5.LLIIZ(space, 4);
                viewGroup6.addView(space, this.LLJZ, new C19ME(c19me));
                this.LLLF = space;
                View viewFindViewById = viewGroup6.findViewById(R.id.jio);
                ViewGroup.LayoutParams layoutParams3 = viewFindViewById != null ? viewFindViewById.getLayoutParams() : null;
                if ((layoutParams3 instanceof C19ME) && (c19me2 = (C19ME) layoutParams3) != null && (i = c19me2.topToBottom) == R.id.qex) {
                    this.LLLFF = i;
                    c19me2.topToBottom = space.getId();
                    C786410Ut5.W5(viewFindViewById, c19me2);
                }
            }
        }
        viewGroup4.addView(c0som, 0, new FrameLayout.LayoutParams(-1, -1));
        C19ME c19me3 = new C19ME(0, 0);
        c19me3.topToTop = 0;
        c19me3.bottomToBottom = 0;
        c19me3.startToStart = 0;
        c19me3.endToEnd = 0;
        viewGroup.addView(viewGroup4, c19me3);
        this.LLJJIJIIJIL = viewGroup4;
        LJJLIIIJJIZ();
        ViewGroup viewGroup7 = this.LL.LJIJI;
        if (viewGroup7 != null) {
            ViewParent parent2 = viewGroup7.getParent();
            if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                int[] iArr = new int[2];
                viewGroup7.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                this.LLLFFI = viewGroup2;
                this.LLLFZ = viewGroup2.indexOfChild(viewGroup7);
                this.LLLI = viewGroup7.getLayoutParams();
                C786410Ut5.LJJJLZIJ(viewGroup7, viewGroup2);
                int i2 = iArr[1] - iArr2[1];
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams4.topMargin = i2;
                viewGroup4.setClipChildren(false);
                viewGroup4.addView(viewGroup7, layoutParams4);
            }
        }
        C716660S9g c716660S9g = (C716660S9g) viewGroup4.findViewById(R.id.qc0);
        if (c716660S9g != null) {
            c716660S9g.setTotalNum(LJIIJJI());
            c716660S9g.setCurrentNum(c0som.getCurrentItem() + 1);
        }
        if (LJIIJJI() <= 1) {
            if (c716660S9g != null) {
                C786410Ut5.k1(c716660S9g, 8);
                layoutParams = c716660S9g.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.topMargin = C497820Jfg.LIZJ(c0som.getContext()) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c716660S9g);
                    c716660S9g.setLayoutParams(marginLayoutParams);
                }
            }
        } else if (c716660S9g != null) {
            layoutParams = c716660S9g.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams.topMargin = C497820Jfg.LIZJ(c0som.getContext()) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c716660S9g);
                c716660S9g.setLayoutParams(marginLayoutParams);
            }
        }
        this.LLLII = c716660S9g;
        View viewFindViewById2 = viewGroup4.findViewById(R.id.qbt);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS146S0100000_11(this, 40), viewFindViewById2);
        }
        View viewFindViewById3 = viewGroup4.findViewById(R.id.qby);
        if (C720360SNm.LJIIIZ(this.LLILLJJLI.getAweme())) {
            if (viewFindViewById3 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById3);
            }
        } else if (viewFindViewById3 != null) {
            C786410Ut5.I7(new ACListenerS146S0100000_11(this, 41), viewFindViewById3);
        }
        this.LLJJIJIL = (TuxIconView) viewGroup4.findViewById(R.id.qbz);
        PostModeFullPageViewModel postModeFullPageViewModel = this.LLJI;
        if (postModeFullPageViewModel != null) {
            postModeFullPageViewModel.LLJJIII = this.LL.LJIIIIZZ.LLLLIILLL;
        }
        LJJLIIIJLJLI();
        C0SOT c0sot = (C0SOT) viewGroup4.findViewById(R.id.qbs);
        if (c0sot != null) {
            c0sot.setUseDarkColor(false);
        }
        if (LJIIJJI() <= 1 && c0sot != null) {
            int visibility = c0sot.getVisibility();
            c0sot.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c0sot);
        }
        this.LLJJJ = c0sot;
        if (c0sot != null) {
            C0SOW[] c0sowArr = new C0SOW[2];
            ViewGroup viewGroupLJIIIIZZ = this.LL.LJIIIIZZ();
            c0sowArr[0] = viewGroupLJIIIIZZ != null ? viewGroupLJIIIIZZ.findViewById(R.id.inp) : null;
            ViewGroup viewGroup8 = this.LL.LIZLLL;
            c0sowArr[1] = viewGroup8 != null ? viewGroup8.findViewById(R.id.inq) : null;
            for (C0SOW c0sow : (ArrayList) C13LQ.LJIJI(c0sowArr)) {
                c0sow.LIZ(c0sot);
                ((ArrayList) this.LLJJJIL).add(c0sow);
            }
        }
        ImageView imageView2 = (ImageView) viewGroup4.findViewById(R.id.qc1);
        if (imageView2 != null) {
            PostModeFullPageViewModel postModeFullPageViewModel2 = this.LLJI;
            if (postModeFullPageViewModel2 == null || (c0s9p = (C0S9P) postModeFullPageViewModel2.getState()) == null || !Intrinsics.LJFF(c0s9p.LLIZ, Boolean.TRUE)) {
                C786410Ut5.LJZI(8, imageView2);
                C786410Ut5.V4(imageView2, 0.0f);
            } else {
                C786410Ut5.LJZI(0, imageView2);
                C786410Ut5.V4(imageView2, 1.0f);
                C786410Ut5.Qb(imageView2, 1.0f);
                C786410Ut5.rc(imageView2, 1.0f);
            }
            imageView = imageView2;
        }
        this.LLJJJJ = imageView;
        LIZ();
        if (viewFindViewById2 != null) {
            C786410Ut5.T4(viewFindViewById2, 0.0f);
        }
        if (viewFindViewById3 != null) {
            C786410Ut5.T4(viewFindViewById3, 0.0f);
        }
        if (c0sot != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0sot);
            c0sot.setAlpha(0.0f);
        }
        if (c716660S9g != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c716660S9g);
            c716660S9g.setAlpha(0.0f);
        }
        if (viewFindViewById2 != null && (viewPropertyAnimatorAnimate4 = viewFindViewById2.animate()) != null && (viewPropertyAnimatorAlpha4 = viewPropertyAnimatorAnimate4.alpha(1.0f)) != null && (startDelay4 = viewPropertyAnimatorAlpha4.setStartDelay(150L)) != null && (duration4 = startDelay4.setDuration(150L)) != null) {
            duration4.start();
        }
        if (viewFindViewById3 != null && (viewPropertyAnimatorAnimate3 = viewFindViewById3.animate()) != null && (viewPropertyAnimatorAlpha3 = viewPropertyAnimatorAnimate3.alpha(1.0f)) != null && (startDelay3 = viewPropertyAnimatorAlpha3.setStartDelay(150L)) != null && (duration3 = startDelay3.setDuration(150L)) != null) {
            duration3.start();
        }
        if (c0sot != null && (viewPropertyAnimatorAnimate2 = c0sot.animate()) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(1.0f)) != null && (startDelay2 = viewPropertyAnimatorAlpha2.setStartDelay(150L)) != null && (duration2 = startDelay2.setDuration(150L)) != null) {
            duration2.start();
        }
        if (c716660S9g != null && (viewPropertyAnimatorAnimate = c716660S9g.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null && (startDelay = viewPropertyAnimatorAlpha.setStartDelay(150L)) != null && (duration = startDelay.setDuration(150L)) != null) {
            duration.start();
        }
        c0som.setOnFirstPageSwipeOutIntercept(new AwS590S0100000_11(this, 310));
    }

    public final int LJII() {
        C19EG c19eg = this.LL.LIZIZ;
        View viewLIZ = C1570830qyn.LIZ(c19eg);
        return (!(viewLIZ == null && (viewLIZ = c19eg.findViewById(R.id.nwe)) == null) && viewLIZ.getHeight() > 0) ? viewLIZ.getHeight() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
    }

    public final C0SO6 LJIIJ() {
        return (C0SO6) this.LLLILZ.getValue();
    }

    public final int LJIIJJI() {
        return C0ST8.LIZJ(this.LLILLJJLI.getAweme());
    }

    public final void LJIIZILJ() {
        ViewGroup viewGroup;
        TuxTextView tuxTextView = this.LLLIIII;
        if (tuxTextView == null) {
            return;
        }
        ViewParent parent = tuxTextView.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(tuxTextView, viewGroup);
        }
        this.LLLIIII = null;
    }

    public void LJIJJLI() {
        ViewGroup viewGroup;
        Context context;
        if (this.LLILZLL != null || (viewGroup = this.LLILLL) == null || (context = viewGroup.getContext()) == null) {
            return;
        }
        C716660S9g c716660S9g = new C716660S9g(context);
        this.LLILZLL = c716660S9g;
        PostModeDetailParams postModeDetailParams = this.LL.LJII;
        if (Intrinsics.LJFF(postModeDetailParams != null ? postModeDetailParams.eventType : null, "homepage_explore") && ((Boolean) C04V1.LIZ.getValue()).booleanValue()) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zf);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            Drawable drawableLIZ = c384050F3z.LIZ(context);
            C716660S9g c716660S9g2 = this.LLILZLL;
            if (c716660S9g2 != null) {
                c716660S9g2.setBackground(drawableLIZ);
            }
        } else {
            C716660S9g c716660S9g3 = this.LLILZLL;
            if (c716660S9g3 != null) {
                c716660S9g3.setBackgroundResource(R.drawable.cwo);
            }
        }
        C716660S9g c716660S9g4 = this.LLILZLL;
        if (c716660S9g4 != null) {
            c716660S9g4.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        }
        C19ME c19me = new C19ME(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        boolean z = this.LL.LJIIZILJ;
        int i = z ? R.id.jjt : R.id.jju;
        c19me.topToBottom = i;
        c19me.startToStart = -1;
        c19me.bottomToBottom = -1;
        c19me.endToEnd = i;
        c19me.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(z ? 10 : 12)));
        C716660S9g c716660S9g5 = this.LLILZLL;
        if (c716660S9g5 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c716660S9g5);
            c716660S9g5.setLayoutParams(c19me);
        }
        C716660S9g c716660S9g6 = this.LLILZLL;
        if (c716660S9g6 != null) {
            C786410Ut5.k1(c716660S9g6, 8);
        }
        ViewGroup viewGroup2 = this.LL.LIZLLL;
        if (viewGroup2 != null) {
            viewGroup2.addView(c716660S9g);
        }
        C716660S9g c716660S9g7 = this.LLILZLL;
        if (c716660S9g7 != null) {
            c716660S9g7.setTotalNum(C0ST8.LIZJ(this.LLILLJJLI.getAweme()));
        }
        C716660S9g c716660S9g8 = this.LLILZLL;
        if (c716660S9g8 != null) {
            C0SOM c0som = this.LLILZ;
            c716660S9g8.setCurrentNum((c0som != null ? c0som.getCurrentItem() : 0) + 1);
        }
    }

    public boolean LJJI() {
        IPhotoNestHeaderAbility iPhotoNestHeaderAbility;
        return this.LL.LJIIZILJ && (iPhotoNestHeaderAbility = (IPhotoNestHeaderAbility) this.LLLIIIL.getValue()) != null && iPhotoNestHeaderAbility.UY0();
    }

    public final void LJJIIJ() {
        Fragment fragment = this.LL.LIZ;
        if (fragment != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragment, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, IPhotoSlidesAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, IPhotoSlidesEventDispatchAbility.class, null, null);
        }
        Aweme aweme = this.LL.LIZJ;
        if (aweme == null || !C721220SQu.LIZLLL(aweme)) {
            return;
        }
        long jLongValue = ((Number) C0B05.LIZ.getValue()).longValue();
        if (jLongValue <= 0) {
            jLongValue = 200;
        }
        ViewGroup viewGroup = this.LLILLL;
        if (viewGroup != null) {
            HandlerHook.viewPostDelay(viewGroup, new ARunnableS111S0100000_11(this, 66), jLongValue);
        }
    }

    public ViewGroup LJJIJIIJIL() {
        C0SRL c0srl = this.LL;
        return c0srl.LJIIZILJ ? c0srl.LJIIJJI() : c0srl.LJ;
    }

    public void LJJJJ() {
        C0SMB c0smb;
        View view;
        PostModeDetailParams postModeDetailParams;
        C0SMB c0smb2;
        View view2;
        View viewFindViewById;
        C0SOM c0som = this.LLILZ;
        if (c0som != null) {
            c0som.setCanBlockSystemBackGesture(true);
        }
        C0SOM c0som2 = this.LLILZ;
        if (c0som2 != null) {
            c0som2.LJJJIL();
        }
        C0SRL c0srl = this.LL;
        View viewFindViewById2 = null;
        if (!c0srl.LJIIZILJ && ((postModeDetailParams = c0srl.LJII) == null || !postModeDetailParams.enableScale)) {
            C0SOM c0som3 = this.LLILZ;
            Object currentViewHolder = c0som3 != null ? c0som3.getCurrentViewHolder() : null;
            if ((currentViewHolder instanceof SmartImagePhotoViewHolderV2) && (c0smb2 = (C0SMB) currentViewHolder) != null && (view2 = c0smb2.LL) != null && (viewFindViewById = view2.findViewById(R.id.vmb)) != null) {
                viewFindViewById.setTransitionName(null);
            }
        }
        PostModeDetailParams postModeDetailParams2 = this.LL.LJII;
        if (postModeDetailParams2 == null || !postModeDetailParams2.enableScale) {
            return;
        }
        C01GW c01gw = C259630AFl.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 1 || ((Number) c01gw.getValue()).intValue() == 2) {
            C0SOM c0som4 = this.LLILZ;
            Object currentViewHolder2 = c0som4 != null ? c0som4.getCurrentViewHolder() : null;
            if ((currentViewHolder2 instanceof SmartImagePhotoViewHolderV2) && (c0smb = (C0SMB) currentViewHolder2) != null && (view = c0smb.LL) != null && (viewFindViewById2 = view.findViewById(R.id.vmb)) != null && (viewFindViewById2.getHeight() == 0 || viewFindViewById2.getWidth() == 0)) {
                viewFindViewById2.requestLayout();
            }
            if (((Number) c01gw.getValue()).intValue() != 2 || viewFindViewById2 == null) {
                return;
            }
            viewFindViewById2.invalidate();
        }
    }

    public final void LJJJJJL() {
        C19EG c19eg = this.LL.LIZIZ;
        Window window = c19eg.getWindow();
        if (this.LLJJJJJIL != null || this.LLJJJJLIIL != null || this.LLJLIL) {
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19eg);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, immersionBarLJIILJJIL);
            Integer num = this.LLJJJJJIL;
            if (num != null) {
                tuxImmersionBar.LJIIIZ(num.intValue());
            }
            if (this.LLJLIL) {
                if (this.LLJL) {
                    immersionBarLJIILJJIL.LJIIJJI();
                } else {
                    tuxImmersionBar.LJFF(this.LLJJL);
                }
                tuxImmersionBar.LJI(this.LLJJLIIIJLLLLLLLZ);
            }
            tuxImmersionBar.LIZLLL();
            Boolean bool = this.LLJJJJLIIL;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
                window.getDecorView().setSystemUiVisibility(zBooleanValue ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            }
        }
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJLIL = false;
        if (this.LLJLL) {
            window.setBackgroundDrawable(this.LLJLILLLLZIIL);
            this.LLJLILLLLZIIL = null;
            this.LLJLL = false;
        }
    }

    public boolean LJJJZ() {
        ImageView imageView = (ImageView) this.LLILZIL.getValue();
        if (imageView == null) {
            return false;
        }
        C786410Ut5.LJLLLLLL(0, imageView);
        C786410Ut5.Ob(imageView, 2.5f);
        C786410Ut5.pc(imageView, 2.5f);
        imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).withEndAction(new ARunnableS111S0100000_11(this, 67)).start();
        imageView.setSelected(false);
        ImageView imageView2 = this.LLJJJJ;
        if (imageView2 == null) {
            return true;
        }
        imageView2.animate().cancel();
        C786410Ut5.LJZI(0, imageView2);
        C786410Ut5.V4(imageView2, 0.0f);
        C786410Ut5.Qb(imageView2, 2.5f);
        C786410Ut5.rc(imageView2, 2.5f);
        imageView2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        return true;
    }

    public void LJJLIIIJ() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        ImageView imageView = (ImageView) this.LLILZIL.getValue();
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
        View view = (View) this.LLILZIL.getValue();
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(100L)) != null && (viewPropertyAnimatorWithEndAction = duration.withEndAction(new ARunnableS111S0100000_11(this, 68))) != null) {
            viewPropertyAnimatorWithEndAction.start();
        }
        ImageView imageView2 = this.LLJJJJ;
        if (imageView2 != null) {
            imageView2.animate().cancel();
            C786410Ut5.LJZI(0, imageView2);
            imageView2.animate().alpha(0.0f).setDuration(100L).withEndAction(new ARunnableS111S0100000_11(imageView2, 69)).start();
        }
    }

    public final void LJJLIIIJILLIZJL() {
        C19EG c19eg = this.LL.LIZIZ;
        int i = C299650Bop.LIZJ() ? 2131828840 : C299650Bop.LIZLLL() ? 2131828839 : 2131828855;
        C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
        c1389890mGx.LJIIIZ(i);
        c1389890mGx.LIZLLL(2000L);
        c1389890mGx.LJIIJJI();
    }

    public final void LJJLIIIJJIZ() {
        FrameLayout.LayoutParams layoutParams;
        C0SOM c0som = this.LLILZ;
        if (c0som == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = c0som.getLayoutParams();
        if (!(layoutParams2 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams2) == null) {
            return;
        }
        layoutParams.bottomMargin = LJII();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0som);
        c0som.setLayoutParams(layoutParams);
    }

    public final void LJJLIIIJLJLI() {
        TuxIconView tuxIconView = this.LLJJIJIL;
        if (tuxIconView == null) {
            return;
        }
        PostModeFullPageViewModel postModeFullPageViewModel = this.LLJI;
        boolean z = false;
        if (postModeFullPageViewModel != null && postModeFullPageViewModel.LLJJIII) {
            z = true;
        }
        if (z) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_speaker_x_mark_fill_ltr;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zl);
            tuxIconView.setTuxIcon(c419910GdJ);
            return;
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_speaker_2_fill_ltr;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.zl);
        tuxIconView.setTuxIcon(c419910GdJ2);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final InterfaceC719460SKa LJLIL() {
        C0SOM c0som = this.LLILZ;
        if (c0som == null) {
            return null;
        }
        int currentItem = c0som.getCurrentItem();
        C719880SLq c719880SLq = this.LLIZ;
        if (c719880SLq != null) {
            return c719880SLq.LJJJJJ(currentItem);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final boolean UH1() {
        C719880SLq c719880SLq;
        C0SOM c0som = this.LLILZ;
        if (c0som == null || (c719880SLq = this.LLIZ) == null) {
            return false;
        }
        PhotosViewHolderV3 photosViewHolderV3LJJJJJ = c719880SLq.LJJJJJ(c0som.getCurrentItem());
        if (!(photosViewHolderV3LJJJJJ instanceof PhotosViewHolderV3) || photosViewHolderV3LJJJJJ == null || !photosViewHolderV3LJJJJJ.LJJIFFI()) {
            return false;
        }
        int iLJIIJJI = LJIIJJI();
        for (int i = 0; i < iLJIIJJI; i++) {
            PhotosViewHolderV3 photosViewHolderV3LJJJI = c719880SLq.LJJJI(i);
            if ((photosViewHolderV3LJJJI instanceof PhotosViewHolderV3) && photosViewHolderV3LJJJI != null) {
                photosViewHolderV3LJJJI.LJJIIJZLJL();
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.LJIIL();
    }

    public final C0N0Y getPlayerManager() {
        PostModeDetailFragment postModeDetailFragment;
        C0N0Y playerManager;
        Fragment fragment = this.LL.LIZ;
        return (!(fragment instanceof PostModeDetailFragment) || (postModeDetailFragment = (PostModeDetailFragment) fragment) == null || (playerManager = postModeDetailFragment.getPlayerManager()) == null) ? C1483410ohn.LJLJJI() : playerManager;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final int xt0() {
        C0SOM c0som = this.LLILZ;
        if (c0som != null) {
            return c0som.getCurrentItem();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final View.OnTouchListener Hg() {
        InterfaceC719460SKa interfaceC719460SKaLJLIL = LJLIL();
        if (interfaceC719460SKaLJLIL != null) {
            return interfaceC719460SKaLJLIL.Hg();
        }
        return null;
    }

    public void LJJJ() {
        Handler handler;
        if (C304280BwI.LIZLLL() || C304280BwI.LIZJ()) {
            this.LL.LJIIJ.LLILZ = null;
        }
        C716660S9g c716660S9g = this.LLILZLL;
        if (c716660S9g != null && (handler = c716660S9g.getHandler()) != null) {
            handler.removeCallbacks(this.LLLJ);
        }
        ((ArrayList) this.LLLILZLLLI).clear();
        ((ArrayList) this.LLLIZZ).clear();
        this.LLLILZJ = null;
    }

    public boolean LJJJLZIJ() {
        IPhotoNestHeaderAbility iPhotoNestHeaderAbility;
        return LJIIJJI() > 1 && ((this instanceof PostModePhotosFloatComponent) || (iPhotoNestHeaderAbility = (IPhotoNestHeaderAbility) this.LLLIIIL.getValue()) == null || !C429590Gsv.LIZ(iPhotoNestHeaderAbility, false));
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final ImageView.ScaleType getScaleType() {
        return ImageView.ScaleType.FIT_CENTER;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent$17, reason: invalid class name */
    public final class AnonymousClass17 implements DefaultLifecycleObserver, GenericLifecycleObserver {
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

        public AnonymousClass17() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onCreate(LifecycleOwner lifecycleOwner) {
            if (!((Boolean) PostModePhotosComponent.this.LLLIIL.getValue()).booleanValue()) {
                PostModePhotosComponent.this.LJJIIJ();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            C0SOM c0som;
            PostModePhotosComponent postModePhotosComponent = PostModePhotosComponent.this;
            RunnableC720480SNy runnableC720480SNy = postModePhotosComponent.LLLJL;
            if (runnableC720480SNy != null && (c0som = postModePhotosComponent.LLILZ) != null) {
                HandlerHook.viewRemoveCallbacks(c0som, runnableC720480SNy);
            }
            PostModePhotosComponent postModePhotosComponent2 = PostModePhotosComponent.this;
            postModePhotosComponent2.LLLJL = null;
            postModePhotosComponent2.LIZLLL("other_way", null);
            PostModePhotosComponent postModePhotosComponent3 = PostModePhotosComponent.this;
            postModePhotosComponent3.LLJILLL = false;
            Fragment fragment = postModePhotosComponent3.LL.LIZ;
            if (fragment != null) {
                InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragment, null);
                C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, IPhotoSlidesAbility.class, null);
                C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, IPhotoSlidesEventDispatchAbility.class, null);
            }
            C0SO6 c0so6LJIIJ = PostModePhotosComponent.this.LJIIJ();
            c0so6LJIIJ.LIZ.clear();
            c0so6LJIIJ.LIZIZ.clear();
            c0so6LJIIJ.LIZJ.clear();
            c0so6LJIIJ.LIZLLL.clear();
            C719720SLa.LIZJ(PostModePhotosComponent.this.LLLJIL);
            PostModeFullPageViewModel postModeFullPageViewModel = PostModePhotosComponent.this.LLJI;
            if (postModeFullPageViewModel != null) {
                postModeFullPageViewModel.TQ2(null);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onPause(LifecycleOwner lifecycleOwner) {
            Unit unit;
            if (EventBus.LIZLLL().LJIIJ(PostModePhotosComponent.this)) {
                EventBus.LIZLLL().LJJI(PostModePhotosComponent.this);
            }
            PostModePhotosComponent postModePhotosComponent = PostModePhotosComponent.this;
            try {
                DisplayManager displayManager = (DisplayManager) postModePhotosComponent.LLJJI.getValue();
                if (displayManager != null) {
                    displayManager.unregisterDisplayListener(postModePhotosComponent.LLJJIII);
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C719720SLa.LIZJ(PostModePhotosComponent.this.LLLJIL);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            PostModePhotosComponent.this.getClass();
            if (C295550BiD.LIZ() && !EventBus.LIZLLL().LJIIJ(PostModePhotosComponent.this)) {
                EventBus.LIZLLL().LJIJJ(PostModePhotosComponent.this);
            }
            PostModePhotosComponent.this.getClass();
            if (C295550BiD.LIZ()) {
                PostModePhotosComponent postModePhotosComponent = PostModePhotosComponent.this;
                try {
                    DisplayManager displayManager = (DisplayManager) postModePhotosComponent.LLJJI.getValue();
                    Unit unit = null;
                    if (displayManager != null) {
                        displayManager.registerDisplayListener(postModePhotosComponent.LLJJIII, null);
                        unit = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            C719720SLa.LIZIZ(PostModePhotosComponent.this.LLLJIL);
        }
    }

    public static int LJJIIZI(ViewGroup viewGroup) {
        int i;
        C20246014Ju c20246014JuLIZ = C14K4.LIZ(viewGroup);
        if (c20246014JuLIZ != null && (i = c20246014JuLIZ.LIZ(2).LIZLLL) > 0 && viewGroup.getHeight() > 0) {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            if (iArr[1] + viewGroup.getHeight() > viewGroup.getContext().getResources().getDisplayMetrics().heightPixels - i) {
                return i;
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final boolean Bk0(C0SOA c0soa) {
        return LJIIJ().LJ.addIfAbsent(c0soa);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final void G91(int i) {
        onPageSelected(i);
        LJJJLIIL(i, false);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public void GS0(C0SMF c0smf) {
        C719880SLq c719880SLq = this.LLIZ;
        if (c719880SLq != null) {
            c719880SLq.LLJJIJIL = c0smf;
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void IL1(C0SOB c0sob) {
        LJIIJ().LIZ.remove(c0sob);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final boolean K32(C0SOE c0soe) {
        return LJIIJ().LIZJ.addIfAbsent(c0soe);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public void K5(C0SMF c0smf) {
        C719880SLq c719880SLq = this.LLIZ;
        if (c719880SLq != null) {
            ((ArrayList) c719880SLq.LLJJJ).add(c0smf);
        }
    }

    public final void LJJJJZI(boolean z) {
        int i;
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup == null) {
            return;
        }
        boolean z2 = false;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        ImageView imageView = this.LLJJJJ;
        if (LJIIJJI() <= 1) {
            z2 = true;
        }
        C0SOT c0sot = this.LLJJJ;
        C716660S9g c716660S9g = this.LLLII;
        ViewGroup viewGroup2 = this.LL.LJIJI;
        View viewFindViewById = viewGroup.findViewById(R.id.qby);
        int childCount = viewGroup.getChildCount();
        for (int i2 = 1; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null && childAt != imageView && childAt != viewGroup2 && (!z || ((!z2 || (childAt != c0sot && childAt != c716660S9g)) && (childAt != viewFindViewById || !C720360SNm.LJIIIZ(this.LLILLJJLI.getAweme()))))) {
                C786410Ut5.LJLLLLLL(i, childAt);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public void LLJJI(InterfaceC469360Ias interfaceC469360Ias) {
        C0SOM c0som = this.LLILZ;
        if (c0som != null) {
            c0som.LIZLLL(interfaceC469360Ias);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public void Qt(InterfaceC719500SKe interfaceC719500SKe) {
        ((ArrayList) this.LLLILZLLLI).remove(interfaceC719500SKe);
        if (!this.LLLIZZ.isEmpty()) {
            ((ArrayList) this.LLLIZZ).clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void a71(C0SOE c0soe) {
        LJIIJ().LIZJ.remove(c0soe);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public void b3(InterfaceC469360Ias interfaceC469360Ias) {
        C0SOM c0som = this.LLILZ;
        if (c0som != null) {
            c0som.LJJIIJZLJL(interfaceC469360Ias);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void fc1(C0SOA c0soa) {
        LJIIJ().LJ.remove(c0soa);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public void lv0(C719520SKg c719520SKg) {
        this.LLLILZJ = c719520SKg;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final void mh0(MotionEvent motionEvent) {
        C0SOM c0som = this.LLILZ;
        if (c0som != null) {
            c0som.onTouchEvent(motionEvent);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final boolean oa2(C666700QDc c666700QDc) {
        return LJIIJ().LIZIZ.addIfAbsent(c666700QDc);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onClearModeEvent(C714060Rzg c714060Rzg) {
        View viewFindViewById;
        boolean z;
        boolean z2;
        boolean z3;
        if (!Intrinsics.LJFF(c714060Rzg.LIZLLL, this.LLILLJJLI.mEventType)) {
            return;
        }
        if (c714060Rzg.LIZ) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            if (C586380MzE.LIZ().LIZLLL) {
                LJJLIIIJILLIZJL();
                return;
            }
        }
        boolean z4 = c714060Rzg.LIZ;
        if (!z4) {
            this.LLJILLL = false;
        } else if (z4) {
            if (!this.LLJJIJI) {
                this.LLJJIJI = true;
                C1616410sAJ.LJIIIIZZ(true, this.LLILLJJLI.mEventType, c714060Rzg.LIZJ, this.LLILLJJLI.getAweme(), null, 0L, 0, "graphic_detail", C2097608Jq.LJ());
            }
            if (this.LLJJ) {
                return;
            }
            C19EG c19eg = this.LL.LIZIZ;
            Window window = c19eg.getWindow();
            if (!this.LLJLIL) {
                this.LLJJJJJIL = Integer.valueOf(window.getStatusBarColor());
                this.LLJJL = window.getNavigationBarColor();
                if ((window.getDecorView().getSystemUiVisibility() & 16) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.LLJJLIIIJLLLLLLLZ = z;
                if ((window.getAttributes().flags & 134217728) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LLJL = z2;
                if ((window.getDecorView().getSystemUiVisibility() & 8192) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.LLJJJJLIIL = Boolean.valueOf(z3);
                this.LLJLIL = true;
            }
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19eg);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, immersionBarLJIILJJIL);
            tuxImmersionBar.LJIIIZ(-16777216);
            tuxImmersionBar.LJFF(-16777216);
            immersionBarLJIILJJIL.LJII(false);
            tuxImmersionBar.LIZLLL();
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
            if (!this.LLJLL) {
                this.LLJLILLLLZIIL = window.getDecorView().getBackground();
                this.LLJLL = true;
            }
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
            ViewGroup viewGroup = this.LL.LJ;
            if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.rlm)) != null) {
                if (this.LLJLLIL == null) {
                    this.LLJLLIL = Integer.valueOf(viewFindViewById.getVisibility());
                }
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            this.LLJJ = true;
            return;
        }
        String str = c714060Rzg.LIZJ;
        if (str.length() == 0) {
            str = "other_way";
        }
        LIZLLL(str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrollStateChanged(int r6) {
        /*
            r5 = this;
            r4 = 1
            r3 = 0
            if (r6 == 0) goto L23
            if (r6 != r4) goto L22
            boolean r0 = X.C20737116Cr.LIZJ()
            if (r0 != 0) goto L18
            X.01GW r0 = X.C259330AEh.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
        L18:
            X.C1904180zeS.LIZ(r3, r4)
            com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel r0 = r5.LLJI
            if (r0 == 0) goto L22
            r0.MQ2()
        L22:
            return
        L23:
            boolean r0 = X.C20737116Cr.LIZJ()
            if (r0 != 0) goto L8c
            X.01GW r0 = X.C259330AEh.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L35:
            X.C1904180zeS.LIZ(r0, r3)
            com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel r2 = r5.LLJI
            if (r2 == 0) goto L46
            kotlin.jvm.internal.AwS590S0100000_11 r1 = new kotlin.jvm.internal.AwS590S0100000_11
            r0 = 590(0x24e, float:8.27E-43)
            r1.<init>(r2, r0)
            r2.withState(r1)
        L46:
            com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2 r2 = r5.LLLIIIIL
            r0 = 0
            r5.LLLIIIIL = r0
            if (r2 == 0) goto L78
            X.0SLq r1 = r5.LLIZ
            if (r1 == 0) goto L5f
            X.0SOM r0 = r5.LLILZ
            if (r0 == 0) goto L8a
            int r0 = r0.getCurrentItem()
        L59:
            com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3 r0 = r1.LJJJJJ(r0)
            if (r2 == r0) goto L78
        L5f:
            boolean r0 = X.C295550BiD.LIZ()
            if (r0 == 0) goto L88
            X.01GW r0 = X.C286310BKb.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L88
            r0 = 1
        L74:
            r4 = r4 ^ r0
            r2.LJJLIIIJLJLI(r4)
        L78:
            X.0SLq r1 = r5.LLIZ
            if (r1 == 0) goto L22
            X.0SOM r0 = r5.LLILZ
            if (r0 == 0) goto L84
            int r3 = r0.getCurrentItem()
        L84:
            r1.LJJJJLL(r3)
            return
        L88:
            r0 = 0
            goto L74
        L8a:
            r0 = 0
            goto L59
        L8c:
            r0 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent.onPageScrollStateChanged(int):void");
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        boolean z;
        PhotosViewHolderV3 photosViewHolderV3LJJJJJ;
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2;
        PhotosViewHolderV3 photosViewHolderV3LJJJJJ2;
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV22;
        if (i == 0 && this.LLJILJILJ == LJIIJJI()) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.LLJILJILJ;
        if (i2 < 0) {
            PostModeDetailParams postModeDetailParams = this.LL.LJII;
            if (postModeDetailParams != null) {
                i2 = postModeDetailParams.position;
            } else {
                i2 = 0;
            }
        }
        String str = null;
        if (i2 != i) {
            C719880SLq c719880SLq = this.LLIZ;
            if (c719880SLq != null) {
                photosViewHolderV3LJJJJJ2 = c719880SLq.LJJJJJ(i2);
            } else {
                photosViewHolderV3LJJJJJ2 = null;
            }
            if (photosViewHolderV3LJJJJJ2 instanceof SmartImagePhotoViewHolderV2) {
                smartImagePhotoViewHolderV22 = (SmartImagePhotoViewHolderV2) photosViewHolderV3LJJJJJ2;
            } else {
                smartImagePhotoViewHolderV22 = null;
            }
            this.LLLIIIIL = smartImagePhotoViewHolderV22;
        }
        if (this.LLJILJILJ >= 0) {
            Iterator<C0SOB> it2 = LJIIJ().LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().Aa();
            }
        }
        this.LLJILJILJ = i;
        if ((this.LLJJIJIIJIL != null || this.LLJJ) && (!C295550BiD.LIZ() || ((Boolean) C286310BKb.LIZ.getValue()).booleanValue())) {
            C719880SLq c719880SLq2 = this.LLIZ;
            if (c719880SLq2 != null) {
                photosViewHolderV3LJJJJJ = c719880SLq2.LJJJJJ(i);
            } else {
                photosViewHolderV3LJJJJJ = null;
            }
            if ((photosViewHolderV3LJJJJJ instanceof SmartImagePhotoViewHolderV2) && (smartImagePhotoViewHolderV2 = (SmartImagePhotoViewHolderV2) photosViewHolderV3LJJJJJ) != null) {
                smartImagePhotoViewHolderV2.LJJZ();
            }
        }
        PostModeFullPageViewModel postModeFullPageViewModel = this.LLJI;
        if (postModeFullPageViewModel != null) {
            postModeFullPageViewModel.onPageSelected(i, z);
        }
        Iterator<C0SOB> it3 = LJIIJ().LIZ.iterator();
        while (it3.hasNext()) {
            it3.next().onPageSelected(i);
        }
        C716660S9g c716660S9g = this.LLLII;
        if (c716660S9g != null) {
            c716660S9g.setCurrentNum(i + 1);
        }
        C719880SLq c719880SLq3 = this.LLIZ;
        if (c719880SLq3 != null) {
            c719880SLq3.onPageSelected(i, true);
        }
        C719880SLq c719880SLq4 = this.LLIZ;
        if (c719880SLq4 != null) {
            c719880SLq4.LJJJJZI(i);
        }
        PostModeDetailParams postModeDetailParams2 = this.LL.LJII;
        if (postModeDetailParams2 != null) {
            str = postModeDetailParams2.eventType;
        }
        if (!Intrinsics.LJFF(str, "homepage_explore") && i == this.LLJILJIL) {
            this.LLJILJIL = -1;
        } else {
            C823050WQl.LIZLLL().execute(new ARunnableS22S0101000_11(i, this, 7));
        }
        C0SOM c0som = this.LLILZ;
        if (c0som != null) {
            c0som.LJJJIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final InterfaceC719460SKa rq2(int i) {
        C719880SLq c719880SLq = this.LLIZ;
        if (c719880SLq != null) {
            return c719880SLq.LJJJJJ(i);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public void tj(C0SMF c0smf) {
        C719880SLq c719880SLq = this.LLIZ;
        if (c719880SLq != null) {
            ((ArrayList) c719880SLq.LLJJJ).remove(c0smf);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final boolean u52(C0SOB c0sob) {
        return LJIIJ().LIZ.addIfAbsent(c0sob);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public void x6(InterfaceC719500SKe interfaceC719500SKe) {
        this.LLLILZLLLI.add(interfaceC719500SKe);
        if (!this.LLLIZZ.isEmpty()) {
            for (Function0<Unit> function0 : this.LLLIZZ) {
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.LLLIZZ.clear();
        }
    }

    public final void LIZLLL(String str, String str2) {
        View viewFindViewById;
        ViewGroup viewGroup;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        View viewFindViewById2;
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me;
        ViewGroup viewGroup4;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup viewGroup5;
        long jLIZJ;
        String str3 = str2;
        String str4 = this.LLILLJJLI.mEventType;
        if (str3 == null) {
            str3 = str;
        }
        C585960MyY.LIZ(str4, str3, "graphic_detail");
        LJIIZILJ();
        boolean z = false;
        if (this.LLJJIJI) {
            this.LLJJIJI = false;
            String str5 = this.LLILLJJLI.mEventType;
            Aweme aweme = this.LLILLJJLI.getAweme();
            Map mapLJ = C2097608Jq.LJ();
            long jLIZLLL = C1616410sAJ.LIZLLL(aweme);
            C1616410sAJ.LJFF(0.0f, 0, jLIZLLL, aweme, str5, str, "graphic_detail", mapLJ, true, true);
            if (C1616410sAJ.LJIIJ > 0) {
                jLIZJ = C1616410sAJ.LIZJ(System.currentTimeMillis(), C1616410sAJ.LJIIJ);
            } else {
                jLIZJ = 0;
            }
            C1616410sAJ.LJII(true, str5, str, aweme, jLIZLLL, 0.0f, 0, jLIZJ, true, "graphic_detail");
            C1616410sAJ.LJIIIIZZ = 0.0f;
            C1616410sAJ.LJIIIZ = 0;
            C1616410sAJ.LJIIJ = 0L;
        }
        ViewGroup viewGroup6 = this.LLJJIJIIJIL;
        if (viewGroup6 != null) {
            C0SOM c0som = this.LLILZ;
            if (c0som != null && (viewGroup = this.LLJLLL) != null) {
                PostModeFullPageViewModel postModeFullPageViewModel = this.LLJI;
                if (postModeFullPageViewModel != null && postModeFullPageViewModel.LLJJIII) {
                    z = true;
                }
                this.LL.LJIIIIZZ.AQ2(z);
                if (z) {
                    C0N0Y playerManager = getPlayerManager();
                    if (playerManager != null) {
                        playerManager.LJFF();
                    }
                } else {
                    C0N0Y playerManager2 = getPlayerManager();
                    if (playerManager2 != null) {
                        playerManager2.LJIJJ();
                    }
                }
                c0som.getLocationOnScreen(new int[2]);
                ViewGroup viewGroup7 = this.LL.LJIJI;
                if (viewGroup7 != null && (viewGroup4 = this.LLLFFI) != null && (layoutParams2 = this.LLLI) != null) {
                    ViewParent parent = viewGroup7.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup5 = (ViewGroup) parent) != null) {
                        C786410Ut5.LJJJLZIJ(viewGroup7, viewGroup5);
                    }
                    int i = this.LLLFZ;
                    int childCount = viewGroup4.getChildCount();
                    if (i > childCount) {
                        i = childCount;
                    }
                    viewGroup4.addView(viewGroup7, i, layoutParams2);
                    this.LLLFFI = null;
                    this.LLLI = null;
                }
                C786410Ut5.LJJJLZIJ(c0som, viewGroup6);
                c0som.setBackground(this.LLL);
                ViewGroup.LayoutParams layoutParams3 = this.LLJZIJLIL;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0som);
                c0som.setLayoutParams(layoutParams3);
                View view = this.LLLF;
                if (view != null) {
                    ViewParent parent2 = view.getParent();
                    if (parent2 instanceof ViewGroup) {
                        viewGroup3 = (ViewGroup) parent2;
                    } else {
                        viewGroup3 = null;
                    }
                    if (this.LLLFF != -1) {
                        if (viewGroup3 != null) {
                            viewFindViewById2 = viewGroup3.findViewById(R.id.jio);
                            if (viewFindViewById2 != null) {
                                layoutParams = viewFindViewById2.getLayoutParams();
                            }
                            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null && c19me.topToBottom == view.getId()) {
                                c19me.topToBottom = this.LLLFF;
                                C786410Ut5.W5(viewFindViewById2, c19me);
                            }
                            this.LLLFF = -1;
                        } else {
                            viewFindViewById2 = null;
                        }
                        layoutParams = null;
                        if (layoutParams instanceof C19ME) {
                            c19me.topToBottom = this.LLLFF;
                            C786410Ut5.W5(viewFindViewById2, c19me);
                        }
                        this.LLLFF = -1;
                    }
                    if (viewGroup3 != null) {
                        C786410Ut5.LJJJLZIJ(view, viewGroup3);
                    }
                }
                this.LLLF = null;
                viewGroup.addView(c0som, this.LLJZ);
                C0SOT c0sot = this.LLJJJ;
                if (c0sot != null) {
                    Iterator it2 = ((ArrayList) this.LLJJJIL).iterator();
                    while (it2.hasNext()) {
                        ((ArrayList) ((C0SOW) it2.next()).LLJJIJI).remove(c0sot);
                    }
                    ((ArrayList) this.LLJJJIL).clear();
                }
                ViewParent parent3 = viewGroup6.getParent();
                if ((parent3 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent3) != null) {
                    C786410Ut5.LJJJLZIJ(viewGroup6, viewGroup2);
                }
                this.LLJJIJIIJIL = null;
                this.LLJJIJIL = null;
                this.LLJJJ = null;
                this.LLLII = null;
                ImageView imageView = this.LLJJJJ;
                if (imageView != null && (viewPropertyAnimatorAnimate = imageView.animate()) != null) {
                    viewPropertyAnimatorAnimate.cancel();
                }
                this.LLJJJJ = null;
                this.LLJLLL = null;
                this.LLJZIJLIL = null;
                this.LLL = null;
                C0SOM c0som2 = this.LLILZ;
                if (c0som2 != null) {
                    c0som2.setOnFirstPageSwipeOutIntercept(null);
                }
                LJJJJJL();
            }
        } else if (this.LLJJ) {
            this.LLJJ = false;
            LJJJJJL();
        }
        Integer num = this.LLJLLIL;
        if (num != null) {
            int iIntValue = num.intValue();
            this.LLJLLIL = null;
            ViewGroup viewGroup8 = this.LL.LJ;
            if (viewGroup8 != null && (viewFindViewById = viewGroup8.findViewById(R.id.rlm)) != null) {
                C786410Ut5.LJLLLLLL(iIntValue, viewFindViewById);
            }
        }
    }

    public final void LJJJLIIL(int i, boolean z) {
        PostModeFullPageViewModel postModeFullPageViewModel;
        if (Intrinsics.LJFF(this.LL.LJIIIIZZ.LLJLLL.getValue(), Boolean.FALSE) && (postModeFullPageViewModel = this.LLJI) != null) {
            i = postModeFullPageViewModel.LLILZ;
        }
        C0SOM c0som = this.LLILZ;
        if (c0som != null) {
            c0som.LLFFF(i, z);
        }
        C716660S9g c716660S9g = this.LLILZLL;
        if (c716660S9g != null) {
            c716660S9g.setCurrentNum(i + 1);
        }
        C1375730lu7.LIZIZ.LIZLLL(i);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final void rU1(int i, String str) {
        String aid;
        Aweme aweme = this.LL.LIZJ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (TextUtils.equals(str, aid) && i >= 0 && i < K91()) {
            G91(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e0  */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0SNx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PostModePhotosComponent(com.ss.android.ugc.aweme.feed.model.VideoItemParams r27, com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel r28, X.C0SRL r29) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent.<init>(com.ss.android.ugc.aweme.feed.model.VideoItemParams, com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel, X.0SRL):void");
    }

    public final void LJJJJJ(String str, String str2, SlidesImageLoadParams slidesImageLoadParams) throws JSONException {
        int i;
        C721090SQh c721090SQh = C721090SQh.LIZ;
        PostModeDetailParams postModeDetailParams = this.LL.LJII;
        c721090SQh.getClass();
        if (!C721090SQh.LIZ(postModeDetailParams)) {
            return;
        }
        C0SRL c0srl = this.LL;
        PostModeDetailParams postModeDetailParams2 = c0srl.LJII;
        Aweme aweme = c0srl.LIZJ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("image_index", slidesImageLoadParams.index);
        PostModeFullPageViewModel postModeFullPageViewModel = this.LLJI;
        if (postModeFullPageViewModel != null) {
            i = postModeFullPageViewModel.LLILZ;
        } else {
            i = -1;
        }
        jSONObject.put("last_seen_position", i);
        C721090SQh.LIZIZ(postModeDetailParams2, aweme, str, str2, jSONObject);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        C719880SLq c719880SLq = this.LLIZ;
        if (c719880SLq != null && c719880SLq.LLJJIJIIJIL != i) {
            c719880SLq.LJJJ(i);
            C0SM8 c0sm8 = c719880SLq.LLIZLLLIL;
            if (c0sm8 != null) {
                c0sm8.LJFF(i);
            }
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
