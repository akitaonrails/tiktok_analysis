package com.ss.android.ugc.aweme.livephoto.vh;

import X.AbstractC1484710ojt;
import X.AbstractViewOnClickListenerC420730Ged;
import X.C01GW;
import X.C098200Yq;
import X.C0B05;
import X.C0RGG;
import X.C0S7U;
import X.C0S7Y;
import X.C0SFN;
import X.C0SLJ;
import X.C0SLS;
import X.C0SM1;
import X.C0SM7;
import X.C0SM8;
import X.C0SMC;
import X.C0ST3;
import X.C0ST4;
import X.C0ST5;
import X.C0STE;
import X.C0STF;
import X.C1017070cZd;
import X.C1206770hVb;
import X.C1281010jRL;
import X.C1284720jXK;
import X.C12ES;
import X.C1479570obb;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1482560ogQ;
import X.C1484820ok4;
import X.C1700490uLv;
import X.C189200o6;
import X.C1954807lC;
import X.C19MB;
import X.C19ME;
import X.C21146717pB;
import X.C384050F3z;
import X.C418440Gaw;
import X.C438910HIz;
import X.C586380MzE;
import X.C586660Mzg;
import X.C719780SLg;
import X.C719950SLx;
import X.C721220SQu;
import X.C721740SSu;
import X.C721760SSw;
import X.C721770SSx;
import X.C721780SSy;
import X.C721790SSz;
import X.C786410Ut5;
import X.EnumC1995107rh;
import X.EnumC2281141EQm;
import X.EnumC585210MxL;
import X.EnumC719760SLe;
import X.EnumC721750SSv;
import X.InterfaceC1473950oSX;
import X.InterfaceC1482530ogN;
import X.InterfaceC1484830ok5;
import X.InterfaceC469401sC;
import X.InterfaceC710220RtU;
import X.InterfaceC719500SKe;
import X.InterfaceC720380SNo;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnLayoutChangeListenerC738740SyO;
import Y.ARunnableS14S1100000_9;
import Y.ARunnableS30S0110000_11;
import Y.ARunnableS80S0200000_11;
import Y.ATListenerS445S0100000_11;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LivePhotoStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlidesAdapter$createAssemVHContainer$1;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS11S0100002_11;
import kotlin.jvm.internal.AwS125S1200000_9;
import kotlin.jvm.internal.AwS127S0110000_9;
import kotlin.jvm.internal.AwS158S1100000_9;
import kotlin.jvm.internal.AwS17S1110000_9;
import kotlin.jvm.internal.AwS255S0300000_11;
import kotlin.jvm.internal.AwS2S1100200_11;
import kotlin.jvm.internal.AwS35S1101000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class LivePhotoViewHolder extends SmartImagePhotoViewHolderV2 implements InterfaceC1482530ogN, C0S7U, C0ST5 {
    public C1484820ok4 LLLLLLLLL;
    public LivePhotoStruct LLLLLLLLLL;
    public C1482560ogQ LLLLLLLZIL;
    public boolean LLLLLLZ;
    public boolean LLLLLLZZ;
    public FrameLayout LLLLLZ;
    public ConstraintLayout LLLLLZIL;
    public C0STE LLLLLZL;
    public View LLLLZ;
    public boolean LLLLZI;
    public boolean LLLLZIL;
    public boolean LLLLZLL;
    public ARunnableS30S0110000_11 LLLLZLLIL;
    public ImageView.ScaleType LLLLZLLLI;
    public boolean LLLZ;
    public boolean LLLZI;
    public View.OnClickListener LLLZIIL;
    public boolean LLLZIL;
    public int LLLZL;
    public boolean LLLZLL;
    public float LLLZLZ;
    public float LLLZZ;
    public EnumC721750SSv LLLZZIL;
    public boolean LLZ;
    public boolean LLZIL;
    public C0ST4 LLZILL;
    public final Set<C0ST4> LLZL;

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void Au(Surface surface) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
    }

    @Override // X.C0ST5
    public final void LIZ() {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void VK() {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void W1(String str) {
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ boolean bn() {
        return true;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
        return null;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ Surface getSurface() {
        return null;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void hj() {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onBrightnessChanged(String str, float f) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onLoopPlay(String str, int i) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayPrepare(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayPrepared(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayRelease(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onVideoSecondFrame(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void pe() {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void uv(JSONObject jSONObject) {
    }

    @Override // X.C0S7U
    public final void E4() {
        View view;
        C0SFN.LIZIZ.LIZLLL("LivePhotoHolder", null, new AwS555S0100000_11(this, 511));
        if (this.LLLLLLZ) {
            C1484820ok4 c1484820ok4 = this.LLLLLLLLL;
            if (c1484820ok4 != null) {
                c1484820ok4.stop();
            }
            ARunnableS30S0110000_11 aRunnableS30S0110000_11 = this.LLLLZLLIL;
            if (aRunnableS30S0110000_11 != null) {
                HandlerHook.viewRemoveCallbacks(this.LL, aRunnableS30S0110000_11);
                this.LLLLZLLIL = null;
            }
            C1484820ok4 c1484820ok42 = this.LLLLLLLLL;
            if (c1484820ok42 != null) {
                c1484820ok42.LJJIIZ(this);
            }
            C1484820ok4 c1484820ok43 = this.LLLLLLLLL;
            if (c1484820ok43 != null) {
                c1484820ok43.LJIIJJI(this);
            }
            this.LLLLLLZ = false;
            this.LLLLZIL = false;
            this.LLLLZLL = false;
            this.LLLLZI = false;
            C12ES.LJIILL(0, this.LLJLLIL);
            this.LLJLL.setOnTouchListener(this.LLJLLIL);
            if (LJLILLLLZI() && this.LLLZZIL.getShowLiveTagInDetail() && !LJLIL() && (view = this.LLLLZ) != null) {
                C12ES.LJIILL(0, view);
            }
            this.LLLZ = false;
            LJLL();
            this.LLZ = false;
            this.LLLLIL.LJJII.LJIIL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2, X.InterfaceC719460SKa
    public final View.OnTouchListener Hg() {
        return new ATListenerS445S0100000_11(this, 2);
    }

    @Override // X.C0ST5
    public final void LIZIZ() {
        C1479570obb c1479570obbLIZLLL;
        if (this.LLZIL) {
            return;
        }
        C0SFN.LIZIZ.LIZ("LivePhotoHolder", null, new AwS553S0100000_9(this, 894));
        C1482560ogQ c1482560ogQ = this.LLLLLLLZIL;
        if (c1482560ogQ != null && (c1479570obbLIZLLL = c1482560ogQ.LIZLLL()) != null) {
            c1479570obbLIZLLL.LJIIIZ = 0;
        }
        LJLJLLL(false);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final void LJIL() {
        ConstraintLayout constraintLayout;
        C1484820ok4 c1484820ok4;
        C0SFN.LIZIZ.LIZIZ("LivePhotoHolder", null, AFwS198S0000000_11.get$arr$(123));
        super.LJIL();
        this.LLLLZLL = true;
        if (this.LLLLZI && this.LLJLLIL.getVisibility() == 0 && (c1484820ok4 = this.LLLLLLLLL) != null) {
            c1484820ok4.stop();
        }
        if (this.LLJLLIL.getVisibility() != 0 || this.LLLZLL || (constraintLayout = this.LLLLLZIL) == null) {
            return;
        }
        C786410Ut5.LL(4, constraintLayout);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2
    public final void LJJJJLL() {
        C0STE c0ste;
        if (this.LLJLLIL.LJIIIIZZ()) {
            super.LJJJJLL();
            return;
        }
        C0STE c0ste2 = this.LLLLLZL;
        if (c0ste2 == null || !c0ste2.LJIJI() || (c0ste = this.LLLLLZL) == null || c0ste.LLJL != EnumC719760SLe.ZOOM_FIX || c0ste.LJJIIJZLJL()) {
            return;
        }
        EnumC719760SLe enumC719760SLe = EnumC719760SLe.CLEAR_MODE;
        c0ste.LLJL = enumC719760SLe;
        c0ste.LLLL = true;
        c0ste.LJIIJ(enumC719760SLe);
    }

    public final void LJLI() {
        C721790SSz c721790SSzDK0;
        C721790SSz c721790SSzDK02;
        Bitmap bitmap;
        C0SM1 c0sm1 = this.LLJI;
        if (c0sm1 == null || (c721790SSzDK0 = c0sm1.DK0()) == null || c721790SSzDK0.LIZ != LJLILLLLZI()) {
            return;
        }
        C0SM1 c0sm12 = this.LLJI;
        if (c0sm12 != null && (c721790SSzDK02 = c0sm12.DK0()) != null && (bitmap = c721790SSzDK02.LJ) != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        C0SM1 c0sm13 = this.LLJI;
        if (c0sm13 != null) {
            c0sm13.yx2(null);
        }
    }

    public final String LJLIIIL() {
        LivePhotoStruct livePhotoStructLJI;
        C719950SLx c719950SLx = this.LLJILJILJ;
        if (c719950SLx == null) {
            return null;
        }
        int i = c719950SLx.LL;
        Aweme awemeLJIJ = LJIJ();
        if (awemeLJIJ == null || (livePhotoStructLJI = C721220SQu.LJI(i, awemeLJIJ)) == null) {
            return null;
        }
        return livePhotoStructLJI.livePhotoVid;
    }

    public final void LJLIIL() {
        View view = this.LLLLZ;
        if (view != null) {
            view.animate().cancel();
            C786410Ut5.T4(view, 0.0f);
            C1206770hVb.LIZ(view);
        }
    }

    public final boolean LJLIL() {
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        C0RGG c0rggLIZ = C586380MzE.LIZ();
        VideoItemParams videoItemParamsD6 = this.LLIZ.d6();
        return c0rggLIZ.LIZJ(videoItemParamsD6 != null ? videoItemParamsD6.mEventType : null);
    }

    public final boolean LJLILLLLZI() {
        return this.LLIZ.SC();
    }

    public final boolean LJLJJI() {
        C0SM1 c0sm1;
        C721790SSz c721790SSzDK0;
        if (!this.LLLLLLZZ || (c0sm1 = this.LLJI) == null || (c721790SSzDK0 = c0sm1.DK0()) == null || !Intrinsics.LJFF(c721790SSzDK0.LIZIZ, LJLIIIL()) || c721790SSzDK0.LIZ == LJLILLLLZI()) {
            return false;
        }
        return !c721790SSzDK0.LIZLLL;
    }

    public final void LJLJJL() {
        C0STE c0ste;
        ConstraintLayout constraintLayout = this.LLLLLZIL;
        if (constraintLayout == null) {
            return;
        }
        C0STF c0stf = this.LLJLLIL;
        float scaleX = constraintLayout.getScaleX();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf);
        c0stf.setScaleX(scaleX);
        C0STF c0stf2 = this.LLJLLIL;
        float scaleY = constraintLayout.getScaleY();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf2);
        c0stf2.setScaleY(scaleY);
        this.LLJLLIL.setPivotX(constraintLayout.getPivotX());
        this.LLJLLIL.setPivotY(constraintLayout.getPivotY());
        C0STF c0stf3 = this.LLJLLIL;
        float translationX = constraintLayout.getTranslationX() + (this.LLLZLZ * constraintLayout.getScaleX());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf3);
        c0stf3.setTranslationX(translationX);
        C786410Ut5.Dd(this.LLJLLIL, constraintLayout.getTranslationY() + (this.LLLZZ * constraintLayout.getScaleY()));
        if ((constraintLayout.getScaleX() == 1.0f && constraintLayout.getScaleY() == 1.0f && constraintLayout.getTranslationX() == 0.0f && constraintLayout.getTranslationY() == 0.0f) || (c0ste = this.LLJLLIL.LLIZLLLIL) == null) {
            return;
        }
        c0ste.LIZ();
    }

    public final void LJLJJLL() {
        ConstraintLayout constraintLayout = this.LLLLLZIL;
        if (constraintLayout == null) {
            return;
        }
        if (this.LLJLLIL.getScaleX() == 1.0f && this.LLJLLIL.getScaleY() == 1.0f && this.LLJLLIL.getTranslationX() == this.LLLZLZ && this.LLJLLIL.getTranslationY() == this.LLLZZ) {
            return;
        }
        C786410Ut5.Ub(constraintLayout, this.LLJLLIL.getScaleX());
        C786410Ut5.uc(constraintLayout, this.LLJLLIL.getScaleY());
        constraintLayout.setPivotX(this.LLJLLIL.getPivotX());
        constraintLayout.setPivotY(this.LLJLLIL.getPivotY());
        C786410Ut5.Nc(constraintLayout, this.LLJLLIL.getTranslationX() - (this.LLLZLZ * this.LLJLLIL.getScaleX()));
        C786410Ut5.jd(constraintLayout, this.LLJLLIL.getTranslationY() - (this.LLLZZ * this.LLJLLIL.getScaleY()));
        C0STE c0ste = this.LLLLLZL;
        if (c0ste != null) {
            c0ste.LIZ();
        }
    }

    public final void LJLL() {
        ImageView imageView;
        ConstraintLayout constraintLayout = this.LLLLLZIL;
        if (constraintLayout == null || (imageView = (ImageView) constraintLayout.findViewById(R.id.rkr)) == null) {
            return;
        }
        C438910HIz.LIZIZ(imageView, 0L, 3).withEndAction(new ARunnableS80S0200000_11(this, imageView, 12));
        this.LLLZLL = false;
    }

    @Override // X.C0S7U
    public final void Q2() {
        View view;
        if (this.LLJILJILJ == null) {
            this.LLLZ = true;
            return;
        }
        this.LLLZ = false;
        C0SFN.LIZIZ.LIZLLL("LivePhotoHolder", null, new AwS555S0100000_11(this, 510));
        if (this.LLLLLLZ) {
            return;
        }
        this.LLLLLLZ = true;
        C1484820ok4 c1484820ok4 = this.LLLLLLLLL;
        if (c1484820ok4 != null) {
            c1484820ok4.LIZJ(this);
        }
        C1484820ok4 c1484820ok42 = this.LLLLLLLLL;
        if (c1484820ok42 != null) {
            c1484820ok42.LJIIZILJ(this);
        }
        LJLI();
        LJLJLLL(false);
        if (LJLILLLLZI()) {
            if ((this.LLLLLLZZ || !this.LLLZZIL.getShowLiveTagInDetail() || LJLIL()) && (view = this.LLLLZ) != null) {
                C1206770hVb.LIZ(view);
            }
        }
    }

    @Override // X.InterfaceC1483820oiS
    public final HashMap getParams() {
        return new HashMap();
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2, com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final void LJJIJLIJ() {
        C721760SSw c721760SSw;
        super.LJJIJLIJ();
        C0SFN.LIZIZ.LIZIZ("LivePhotoHolder", null, new AwS553S0100000_9(this, 893));
        this.LLLLLLLZIL = null;
        this.LLLLLLLLLL = null;
        this.LLLLZLLLI = null;
        this.LLLZI = false;
        C1484820ok4 c1484820ok4 = this.LLLLLLLLL;
        if (c1484820ok4 != null && (c721760SSw = c1484820ok4.LIZIZ) != null) {
            c721760SSw.LIZ();
        }
        this.LLLLIL.LJJII.LJIIL = false;
        FrameLayout frameLayout = this.LLLLLZ;
        if (frameLayout != null) {
            C786410Ut5.fd(frameLayout, this.LLILZIL.getHeight() * 2.0f);
        }
        ConstraintLayout constraintLayout = this.LLLLLZIL;
        if (constraintLayout != null) {
            C786410Ut5.LL(0, constraintLayout);
        }
        C0STF c0stf = this.LLJLLIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf);
        c0stf.setScaleX(1.0f);
        C0STF c0stf2 = this.LLJLLIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf2);
        c0stf2.setScaleY(1.0f);
        C0STF c0stf3 = this.LLJLLIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf3);
        c0stf3.setTranslationX(0.0f);
        C786410Ut5.Dd(this.LLJLLIL, 0.0f);
        this.LLLZLZ = 0.0f;
        this.LLLZZ = 0.0f;
        C0STE c0ste = this.LLLLLZL;
        if (c0ste != null) {
            c0ste.LJJIII();
        }
        this.LLLZIL = false;
        LJL(false);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2
    public final void LJJLIIIJJI() {
        View view;
        super.LJJLIIIJJI();
        C0STE c0ste = this.LLLLLZL;
        if (c0ste != null) {
            c0ste.LJJIII();
        }
        LJL(false);
        if (this.LLLZIL) {
            this.LLLZIL = false;
            if (this.LLLLLLZZ || !this.LLLZZIL.getShowLiveTagInDetail() || (view = this.LLLLZ) == null) {
                return;
            }
            C438910HIz.LIZ(view, 0L, 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2
    public final void LJJZ() {
        super.LJJZ();
        C0STE c0ste = this.LLLLLZL;
        if (c0ste != null && c0ste.LLJL == EnumC719760SLe.NORMAL && c0ste.LLJJIJIIJIL == EnumC585210MxL.IDLE) {
            c0ste.LLJL = EnumC719760SLe.CLEAR_MODE;
        }
        this.LLLZIL = true;
        LJLIIL();
    }

    @Override // X.InterfaceC1483820oiS
    public final FrameLayout getPlayViewContainer() {
        return this.LLLLLZ;
    }

    @Override // X.C0S7U
    public final void Ba(boolean z) {
        View view;
        View view2;
        C1484820ok4 c1484820ok4;
        C0SFN.LIZIZ.LIZLLL("LivePhotoHolder", null, new AwS127S0110000_9(this, z, 8));
        this.LLLLLLZZ = z;
        if (!this.LLLLLLZ) {
            return;
        }
        ARunnableS30S0110000_11 aRunnableS30S0110000_11 = this.LLLLZLLIL;
        if (aRunnableS30S0110000_11 != null) {
            HandlerHook.viewRemoveCallbacks(this.LL, aRunnableS30S0110000_11);
            this.LLLLZLLIL = null;
        }
        if (z) {
            if (!this.LLLZLL && (c1484820ok4 = this.LLLLLLLLL) != null) {
                c1484820ok4.pause();
            }
        } else {
            long jLongValue = ((Number) C0B05.LIZ.getValue()).longValue();
            if (!LJLILLLLZI() && jLongValue > 0) {
                ARunnableS30S0110000_11 aRunnableS30S0110000_112 = this.LLLLZLLIL;
                if (aRunnableS30S0110000_112 == null) {
                    aRunnableS30S0110000_112 = new ARunnableS30S0110000_11(this, 8);
                    this.LLLLZLLIL = aRunnableS30S0110000_112;
                }
                HandlerHook.viewPostDelay(this.LL, aRunnableS30S0110000_112, jLongValue);
            } else {
                LJLJLLL(true);
            }
        }
        if (LJLILLLLZI() && this.LLLZZIL.getShowLiveTagInDetail() && !this.LLLZIL && !LJLIL()) {
            if (z) {
                View view3 = this.LLLLZ;
                if (view3 != null && view3.getVisibility() == 0 && (view2 = this.LLLLZ) != null) {
                    C438910HIz.LIZIZ(view2, 0L, 3);
                    return;
                }
                return;
            }
            if (!this.LLLLZIL || (view = this.LLLLZ) == null) {
                return;
            }
            C438910HIz.LIZ(view, 0L, 3);
        }
    }

    @Override // X.C0S7U
    public final void Ji(C0ST4 c0st4) {
        if (c0st4 != null) {
            this.LLZL.add(c0st4);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2, com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3, X.InterfaceC719460SKa
    public final void LJIIIIZZ(Drawable drawable) {
        super.LJIIIIZZ(drawable);
        C0STE c0ste = this.LLLLLZL;
        if (c0ste != null) {
            c0ste.LJIIJJI().setBackground(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0ST3] */
    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2, com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final InterfaceC469401sC LJIILLIIL(C719950SLx c719950SLx) {
        Object c098200Yq;
        String str;
        C0SMC c0smc;
        ConstraintLayout constraintLayout;
        boolean z;
        InterfaceC710220RtU interfaceC710220RtUYn;
        if (this.LLLLLZ == null) {
            FrameLayout frameLayout = new FrameLayout(this.LLJIJIL);
            ConstraintLayout constraintLayout2 = new ConstraintLayout(this.LLJIJIL);
            C786410Ut5.m6(constraintLayout2, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setId(R.id.rll);
            C786410Ut5.a6(frameLayout, new C19ME(0, 0));
            constraintLayout2.addView(frameLayout);
            this.LLJLL.addView(constraintLayout2);
            constraintLayout2.setTranslationZ(this.LLJLLIL.getTranslationZ() - 1);
            this.LLLLLZ = frameLayout;
            this.LLLLLZIL = constraintLayout2;
            if (this.LLIZLLLIL != null) {
                ViewGroup viewGroup = this.LLJLL;
                ViewGroup viewGroup2 = this.LLIZLLLIL;
                C719780SLg c719780SLg = this.LLLLJI;
                InterfaceC720380SNo interfaceC720380SNo = this.LLJJL;
                IPhotoSlidesAbility iPhotoSlidesAbilityLJJJZ = LJJJZ();
                if (iPhotoSlidesAbilityLJJJZ != null && (interfaceC710220RtUYn = iPhotoSlidesAbilityLJJJZ.yn()) != null && interfaceC710220RtUYn.LJIILJJIL() && !this.LLIZ.SC()) {
                    z = true;
                } else {
                    z = false;
                }
                this.LLLLLZL = new C0STE(constraintLayout2, viewGroup, viewGroup2, c719780SLg, interfaceC720380SNo, z, this.LLIZ.SC());
            }
            this.LLJLL.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC738740SyO(this, 12));
        }
        if (LJLILLLLZI() && (((c0smc = this.LLJLIL) == null || !c0smc.LIZ()) && this.LLLLZ == null)) {
            View view = this.LLILZIL;
            if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
                final View viewLIZIZ = C21146717pB.LIZIZ(view.getContext(), R.layout.e_6, constraintLayout, false);
                C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.0SSt
                    @Override // X.AbstractViewOnClickListenerC420730Ged
                    public final void LIZ(View view2) {
                        Aweme aweme;
                        VideoItemParams videoItemParams;
                        if (view2 != null) {
                            LivePhotoViewHolder livePhotoViewHolder = this.LLILZ;
                            livePhotoViewHolder.LLLLZIL = false;
                            if (livePhotoViewHolder.LLLLLLZZ) {
                                View.OnClickListener onClickListener = livePhotoViewHolder.LLLZIIL;
                                if (onClickListener != null) {
                                    onClickListener.onClick(viewLIZIZ);
                                }
                            } else {
                                livePhotoViewHolder.LJLJLLL(false);
                            }
                            C721190SQr c721190SQr = C721190SQr.LIZ;
                            C719950SLx c719950SLx2 = this.LLILZ.LLJILJILJ;
                            String str2 = null;
                            if (c719950SLx2 != null && (videoItemParams = c719950SLx2.LLILLL) != null) {
                                aweme = videoItemParams.getAweme();
                            } else {
                                aweme = null;
                            }
                            VideoItemParams videoItemParamsD6 = this.LLILZ.LLIZ.d6();
                            if (videoItemParamsD6 != null) {
                                str2 = videoItemParamsD6.mEventType;
                            }
                            c721190SQr.getClass();
                            C721190SQr.LJJI(new ARunnableS14S1100000_9(aweme, str2, 2));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(700L);
                    }
                }, viewLIZIZ);
                View viewFindViewById = viewLIZIZ.findViewById(R.id.nez);
                if (viewFindViewById != null) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.zg);
                    viewFindViewById.setBackground(c384050F3z.LIZ(viewLIZIZ.getContext()));
                }
                constraintLayout.addView(viewLIZIZ);
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                c19mb.LJIIIIZZ(viewLIZIZ.getId(), 3, constraintLayout.getId(), 3);
                c19mb.LJIIIIZZ(viewLIZIZ.getId(), 6, constraintLayout.getId(), 6);
                c19mb.LIZIZ(constraintLayout);
                this.LLLLZ = viewLIZIZ;
                if (LJLIL()) {
                    this.LLLZIL = true;
                    LJLIIL();
                }
            }
        }
        LJLJLJ(c719950SLx);
        super.LJIILLIIL(c719950SLx);
        C0SFN.LIZIZ.LIZIZ("LivePhotoHolder", null, new AwS412S0200000_11(this, c719950SLx, 28));
        Aweme awemeLJIJ = LJIJ();
        if (awemeLJIJ != null) {
            final LivePhotoStruct livePhotoStructLJI = C721220SQu.LJI(c719950SLx.LL, awemeLJIJ);
            if (livePhotoStructLJI != null) {
                try {
                    VideoItemParams videoItemParamsD6 = this.LLIZ.d6();
                    if (videoItemParamsD6 != null) {
                        str = videoItemParamsD6.mEventType;
                    } else {
                        str = null;
                    }
                    final C721780SSy c721780SSy = new C721780SSy(awemeLJIJ, livePhotoStructLJI, str, LJLILLLLZI());
                    LJLJI(new AbstractC1484710ojt(livePhotoStructLJI, c721780SSy) { // from class: X.0ST3
                    });
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C0SFN.LIZIZ.LIZJ("LivePhotoHolder", thM5exceptionOrNullimpl, AFwS198S0000000_11.get$arr$(121));
                }
                C189200o6.m1boximpl(c098200Yq);
            }
            if (this.LLLZ) {
                Q2();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLI(boolean r5) {
        /*
            r4 = this;
            X.0STE r0 = r4.LLLLLZL
            r3 = 1
            if (r0 == 0) goto L2b
            boolean r0 = r0.LJIJI()
            if (r0 != r3) goto L2b
            r2 = 1
        Lc:
            X.0STF r0 = r4.LLJLLIL
            boolean r1 = r0.LJIIIIZZ()
            if (r5 == 0) goto L23
            if (r1 == 0) goto L23
            r0 = 1
        L17:
            r3 = 0
        L18:
            super.LJJJJLI(r0)
            X.0STE r0 = r4.LLLLLZL
            if (r0 == 0) goto L22
            r0.LJIIIIZZ(r3)
        L22:
            return
        L23:
            r0 = 0
            if (r5 == 0) goto L17
            if (r1 != 0) goto L17
            if (r2 == 0) goto L17
            goto L18
        L2b:
            r2 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder.LJJJJLI(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2
    public final void LJJLIIIJ(ImageView.ScaleType scaleType) {
        Video video;
        this.LLLLZLLLI = scaleType;
        this.LLLZLZ = this.LLJLLIL.getTranslationX();
        this.LLLZZ = this.LLJLLIL.getTranslationY();
        LivePhotoStruct livePhotoStruct = this.LLLLLLLLLL;
        if (livePhotoStruct != null && (video = livePhotoStruct.videoModel) != null) {
            LJLLI(video, scaleType);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2
    public final void LJJLIIIJILLIZJL(ImageView.ScaleType scaleType) {
        Video video;
        this.LLLLZLLLI = scaleType;
        LivePhotoStruct livePhotoStruct = this.LLLLLLLLLL;
        if (livePhotoStruct != null && (video = livePhotoStruct.videoModel) != null) {
            LJLLI(video, scaleType);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJLJLI(boolean r5) {
        /*
            r4 = this;
            X.0STE r0 = r4.LLLLLZL
            r3 = 1
            if (r0 == 0) goto L2b
            boolean r0 = r0.LJIJI()
            if (r0 != r3) goto L2b
            r2 = 1
        Lc:
            X.0STF r0 = r4.LLJLLIL
            boolean r1 = r0.LJIIIIZZ()
            if (r5 == 0) goto L23
            if (r1 == 0) goto L23
            r0 = 1
        L17:
            r3 = 0
        L18:
            super.LJJLIIIJLJLI(r0)
            X.0STE r0 = r4.LLLLLZL
            if (r0 == 0) goto L22
            r0.LJJIIJ(r3)
        L22:
            return
        L23:
            r0 = 0
            if (r5 == 0) goto L17
            if (r1 != 0) goto L17
            if (r2 == 0) goto L17
            goto L18
        L2b:
            r2 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder.LJJLIIIJLJLI(boolean):void");
    }

    public final void LJL(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        View view = this.LLLLZ;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (z) {
                i = 108;
            } else {
                i = 8;
            }
            int i2 = (int) ((i * view.getResources().getDisplayMetrics().density) + 0.5f);
            if (marginLayoutParams.topMargin != i2) {
                marginLayoutParams.topMargin = i2;
                C786410Ut5.W5(view, marginLayoutParams);
            }
        }
    }

    public final void LJLJI(C0ST3 c0st3) {
        String str;
        List<String> listLIZ;
        Aweme aweme;
        LivePhotoStruct livePhotoStructLJI;
        LivePhotoStruct livePhotoStruct = c0st3.LIZ;
        C0SFN.LIZIZ.LIZLLL("LivePhotoHolder", null, new AwS255S0300000_11(this, livePhotoStruct, c0st3, 10));
        C719950SLx c719950SLx = this.LLJILJILJ;
        if (c719950SLx == null) {
            return;
        }
        VideoItemParams videoItemParams = c719950SLx.LLILLL;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (livePhotoStructLJI = C721220SQu.LJI(c719950SLx.LL, aweme)) != null) {
            str = livePhotoStructLJI.livePhotoVid;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, livePhotoStruct.livePhotoVid) && (listLIZ = C721770SSx.LIZ(livePhotoStruct)) != null && !listLIZ.isEmpty()) {
            this.LLLLLLLLLL = c0st3.LIZ;
            this.LLLLLLLZIL = c0st3.LIZJ;
            this.LLLZZIL = c0st3.LIZIZ.LJ;
            LJLJLLL(false);
        }
    }

    public final void LJLJLJ(C719950SLx c719950SLx) {
        Aweme aweme;
        LivePhotoStruct livePhotoStructLJI;
        C0SM1 c0sm1;
        C721790SSz c721790SSzDK0;
        Bitmap bitmap;
        ImageView imageView;
        VideoItemParams videoItemParams = c719950SLx.LLILLL;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (livePhotoStructLJI = C721220SQu.LJI(c719950SLx.LL, aweme)) != null && (c0sm1 = this.LLJI) != null && (c721790SSzDK0 = c0sm1.DK0()) != null && !c721790SSzDK0.LIZLLL && Intrinsics.LJFF(c721790SSzDK0.LIZIZ, livePhotoStructLJI.livePhotoVid) && LJLILLLLZI() != c721790SSzDK0.LIZ && (bitmap = c721790SSzDK0.LJ) != null && (!bitmap.isRecycled())) {
            C0SFN.LIZIZ.LIZLLL("LivePhotoHolder", null, new AwS555S0100000_11(this, 512));
            ConstraintLayout constraintLayout = this.LLLLLZIL;
            if (constraintLayout == null || (imageView = (ImageView) constraintLayout.findViewById(R.id.rkr)) == null) {
                imageView = new ImageView(this.LLJIJIL);
                imageView.setId(R.id.rkr);
                C786410Ut5.c6(imageView, new C19ME(-1, -1));
                ConstraintLayout constraintLayout2 = this.LLLLLZIL;
                if (constraintLayout2 != null) {
                    constraintLayout2.addView(imageView);
                }
            }
            imageView.setImageBitmap(bitmap);
            C1206770hVb.LIZ(this.LLJLLIL);
            this.LLLZLL = true;
        }
    }

    public final void LJLJLLL(boolean z) {
        C0SM1 c0sm1;
        C721790SSz c721790SSzDK0;
        int i = 0;
        if (this.LLLLLLZ) {
            if (this.LLLLZI && !z) {
                return;
            }
            if (!this.LLLLLLZZ || (!LJLJJI() && (z || LJJLI()))) {
                if (LJLILLLLZI()) {
                    if ((this.LLLLZIL && !this.LLLZZIL.isLoop()) || this.LLLLLLZZ) {
                        return;
                    }
                } else if ((this.LLLLZIL && !this.LLLZZIL.isLoop()) || this.LLLLLLZZ) {
                    return;
                }
                if (this.LLLLZLL) {
                    return;
                }
            }
            C1482560ogQ c1482560ogQ = this.LLLLLLLZIL;
            if (c1482560ogQ == null) {
                return;
            }
            if (this.LLJLLIL.getVisibility() == 0 && this.LLJLLIL.LJIIIIZZ()) {
                LJLJJLL();
            }
            if (z && this.LLZ) {
                C1484820ok4 c1484820ok4 = this.LLLLLLLLL;
                if (c1484820ok4 != null) {
                    c1484820ok4.resume();
                }
                C0SFN.LIZIZ.LIZ("LivePhotoHolder", null, new AwS553S0100000_9(this, 895));
                return;
            }
            if (LJLJJI() && (c0sm1 = this.LLJI) != null && (c721790SSzDK0 = c0sm1.DK0()) != null) {
                i = c721790SSzDK0.LIZJ;
            }
            this.LLLZL = i;
            C1479570obb c1479570obbLIZLLL = c1482560ogQ.LIZLLL();
            if (c1479570obbLIZLLL != null) {
                c1479570obbLIZLLL.LJIIIZ = this.LLLZL;
            }
            C1484820ok4 c1484820ok42 = this.LLLLLLLLL;
            if (c1484820ok42 != null) {
                c1484820ok42.LJ(c1482560ogQ);
            }
            this.LLLLZI = true;
            this.LLZ = true;
            C0SFN.LIZIZ.LIZ("LivePhotoHolder", null, new AwS412S0200000_11(this, c1482560ogQ, 29));
        }
    }

    @Override // X.C0S7U
    public final void M6(boolean z) {
        C721760SSw c721760SSw;
        C1484820ok4 c1484820ok4;
        C0SFN.LIZIZ.LIZLLL("LivePhotoHolder", null, new AwS127S0110000_9(this, z, 6));
        if (!this.LLLLLLZZ && this.LLLLZI && (c1484820ok4 = this.LLLLLLLLL) != null) {
            c1484820ok4.stop();
        }
        ARunnableS30S0110000_11 aRunnableS30S0110000_11 = this.LLLLZLLIL;
        if (aRunnableS30S0110000_11 != null) {
            HandlerHook.viewRemoveCallbacks(this.LL, aRunnableS30S0110000_11);
            this.LLLLZLLIL = null;
        }
        this.LLLLZIL = false;
        this.LLLLZI = false;
        this.LLZIL = true;
        C1484820ok4 c1484820ok42 = this.LLLLLLLLL;
        if (c1484820ok42 != null && (c721760SSw = c1484820ok42.LIZIZ) != null) {
            c721760SSw.LIZ();
        }
    }

    @Override // X.C0S7U
    public final void Pf(boolean z) {
        C721790SSz c721790SSzDK0;
        C0SFN.LIZIZ.LIZLLL("LivePhotoHolder", null, new AwS127S0110000_9(this, z, 7));
        this.LLZIL = false;
        if (!this.LLLLLLZZ) {
            C1484820ok4 c1484820ok4 = this.LLLLLLLLL;
            if (c1484820ok4 != null) {
                c1484820ok4.seek(0.0f);
                return;
            }
            return;
        }
        if (z && LJLJJI()) {
            C0SM1 c0sm1 = this.LLJI;
            if (c0sm1 != null && (c721790SSzDK0 = c0sm1.DK0()) != null) {
                if (c721790SSzDK0.LIZLLL) {
                    C1484820ok4 c1484820ok42 = this.LLLLLLLLL;
                    if (c1484820ok42 != null) {
                        c1484820ok42.stop();
                        return;
                    }
                    return;
                }
                C719950SLx c719950SLx = this.LLJILJILJ;
                if (c719950SLx != null) {
                    LJLJLJ(c719950SLx);
                }
                LJLJLLL(false);
                return;
            }
            return;
        }
        C1484820ok4 c1484820ok43 = this.LLLLLLLLL;
        if (c1484820ok43 != null) {
            c1484820ok43.stop();
        }
    }

    @Override // X.C0S7U
    public final void a9(View.OnClickListener onClickListener) {
        this.LLLZIIL = onClickListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    @Override // X.InterfaceC1482530ogN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPlayPause(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder.onPlayPause(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
    public final void onPreRenderReady(String str) {
        C0SFN.LIZIZ.LIZIZ("LivePhotoHolder", null, new AwS158S1100000_9(this, str, 13));
    }

    @Override // X.InterfaceC1482530ogN
    public final void onStopPlay(String str) {
        View view;
        ConstraintLayout constraintLayout;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C0SFN c0sfn = C0SFN.LIZIZ;
        c0sfn.LIZLLL("LivePhotoHolder", null, new AwS158S1100000_9(this, str, 15));
        if (!Intrinsics.LJFF(LJLIIIL(), str)) {
            return;
        }
        c0sfn.LIZLLL("LivePhotoHolder", null, new AwS555S0100000_11(this, 1478));
        if (!this.LLLLZLL && LJJLI()) {
            if (!this.LLLZLL) {
                if (this.LLJLLIL.getVisibility() != 0) {
                    LJLJJL();
                    ViewGroup viewGroup = this.LLJLL;
                    ViewGroup.LayoutParams layoutParams = this.LLJLLIL.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        int height = marginLayoutParams.height;
                        if (height < 0) {
                            height = viewGroup.getHeight();
                        }
                        if (height > 0) {
                            int i = marginLayoutParams.topMargin;
                            this.LLJLLIL.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
                            C0STF c0stf = this.LLJLLIL;
                            int i2 = marginLayoutParams.leftMargin;
                            c0stf.layout(i2, i, viewGroup.getWidth() + i2, height + i);
                        }
                    }
                    C12ES.LJIILL(0, this.LLJLLIL);
                }
                if (this.LLJLLIL.LJIIIIZZ() && (constraintLayout = this.LLLLLZIL) != null) {
                    C786410Ut5.LL(4, constraintLayout);
                }
            }
            this.LLJLL.setOnTouchListener(this.LLJLLIL);
        }
        this.LLLLZI = false;
        if (!this.LLLZIL && !this.LLLLLLZZ && this.LLLZZIL.getShowLiveTagInDetail() && !LJLIL() && (view = this.LLLLZ) != null) {
            C438910HIz.LIZ(view, 0L, 3);
        }
    }

    public final void LJLLI(Video video, ImageView.ScaleType scaleType) {
        boolean z;
        FrameLayout frameLayout = this.LLLLLZ;
        if (frameLayout != null && video.getWidth() > 0 && video.getHeight() > 0) {
            float width = video.getWidth() / video.getHeight();
            C0STE c0ste = this.LLLLLZL;
            if (c0ste != null) {
                Float fValueOf = Float.valueOf(width);
                if (fValueOf == null || fValueOf.floatValue() <= 0.0f) {
                    fValueOf = null;
                }
                c0ste.LLJLLL = fValueOf;
            }
            C786410Ut5.fd(frameLayout, this.LLLZZ);
            int width2 = this.LLJLL.getWidth();
            int height = this.LLJLL.getHeight();
            if (width2 > 0 && height > 0) {
                float f = width2 / height;
                if (scaleType != ImageView.ScaleType.CENTER_CROP ? width >= f : width < f) {
                    z = true;
                } else {
                    z = false;
                }
                C19MB c19mb = new C19MB();
                ConstraintLayout constraintLayout = this.LLLLLZIL;
                if (constraintLayout != null) {
                    int width3 = constraintLayout.getWidth();
                    int height2 = constraintLayout.getHeight();
                    if (width3 > 0 && height2 > 0) {
                        c19mb.LJII(constraintLayout);
                        c19mb.LJIIIIZZ(frameLayout.getId(), 6, 0, 6);
                        c19mb.LJIIIIZZ(frameLayout.getId(), 7, 0, 7);
                        if (scaleType != ImageView.ScaleType.FIT_END) {
                            c19mb.LJIIIIZZ(frameLayout.getId(), 3, 0, 3);
                        } else {
                            c19mb.LJI(frameLayout.getId(), 3);
                        }
                        if (scaleType != ImageView.ScaleType.FIT_START) {
                            c19mb.LJIIIIZZ(frameLayout.getId(), 4, 0, 4);
                        } else {
                            c19mb.LJI(frameLayout.getId(), 4);
                        }
                        c19mb.LJJ(frameLayout.getId(), null);
                        if (z) {
                            c19mb.LJIILL(frameLayout.getId(), 0);
                            c19mb.LJIIJJI(frameLayout.getId(), (int) (width3 / width));
                        } else {
                            c19mb.LJIILL(frameLayout.getId(), (int) (height2 * width));
                            c19mb.LJIIJJI(frameLayout.getId(), 0);
                        }
                        c19mb.LIZIZ(constraintLayout);
                    }
                }
                this.LLLZI = true;
                C0SFN.LIZIZ.LIZIZ("LivePhotoHolder", null, new AwS11S0100002_11(this, width, f, 0));
            }
        }
    }

    @Override // X.C0S7U
    public final void Pn(InterfaceC1484830ok5 interfaceC1484830ok5, C0S7Y c0s7y) {
        C1484820ok4 c1484820ok4;
        if (interfaceC1484830ok5 != null) {
            c1484820ok4 = new C1484820ok4(interfaceC1484830ok5);
        } else {
            c1484820ok4 = null;
        }
        this.LLLLLLLLL = c1484820ok4;
        this.LLZILL = c0s7y;
        C0SFN.LIZIZ.LIZIZ("LivePhotoHolder", null, new AwS410S0200000_9(this, interfaceC1484830ok5, 88));
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPlayCompleted(String str, int i) {
        VideoItemParams videoItemParams;
        Aweme aweme;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        PhotoCarouselInfoStruct photoCarouselInfo;
        C0SFN.LIZIZ.LIZIZ("LivePhotoHolder", null, new AwS35S1101000_9(this, str, i, 0));
        if (Intrinsics.LJFF(LJLIIIL(), str) && !this.LLZIL) {
            C719950SLx c719950SLx = this.LLJILJILJ;
            if (c719950SLx != null) {
                int i2 = c719950SLx.LL;
                C0ST4 c0st4 = this.LLZILL;
                if (c0st4 != null) {
                    c0st4.LIZ(i2);
                }
                Iterator<C0ST4> it2 = this.LLZL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(i2);
                }
            }
            int i3 = C721740SSu.LIZIZ[this.LLLZZIL.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new C1954807lC();
                    }
                } else {
                    C1484820ok4 c1484820ok4 = this.LLLLLLLLL;
                    if (c1484820ok4 != null) {
                        c1484820ok4.stop();
                    }
                    final C1484820ok4 c1484820ok42 = this.LLLLLLLLL;
                    if (c1484820ok42 != null) {
                        if (c1484820ok42.LIZIZ == null) {
                            c1484820ok42.LIZIZ = new C721760SSw(this);
                            c1484820ok42.LIZ.LJIIZILJ(new InterfaceC1482530ogN() { // from class: X.0SSs
                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void Au(Surface surface) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void VK() {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void W1(String str2) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onBrightnessChanged(String str2, float f) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onBufferedPercent(String str2, long j, int i4) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onBufferedTimeMs(String str2, long j) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onBuffering(String str2, boolean z, C1480430ocz c1480430ocz) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onCompleteLoaded(String str2, boolean z) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onCrosstalkHappened(String str2, List list) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onDecoderBuffering(String str2, boolean z, C1480430ocz c1480430ocz) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onFrameAboutToBeRendered(int i4, long j, long j2, Map map) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onLiveRenderFirstFrame(String str2, C1480420ocy c1480420ocy) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onLoopPlay(String str2, int i4) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onMaskInfoCallback(String str2, C1480290ocl c1480290ocl) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onPausePlay(String str2, C1480430ocz c1480430ocz) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onPlayCompleted(String str2, int i4) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onPlayCompletedFirstTime(String str2, C1480430ocz c1480430ocz) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onPlayFailed(String str2, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onPlayPause(String str2) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onPlayPrepare(String str2) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onPlayPrepared(String str2) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onPlayProgressChange(String str2, long j, long j2) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onPlayStop(String str2, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onPlayerInternalEvent(String str2, int i4, JSONObject jSONObject) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onPlaying(String str2, C1480430ocz c1480430ocz) {
                                }

                                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
                                public final /* synthetic */ void onPreRenderReady(String str2) {
                                    C490850JMt.LIZ(this, str2);
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onPreRenderSessionMissed(String str2) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onPreparePlay(String str2, C1480430ocz c1480430ocz) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onRenderFirstFrame(String str2, C1480420ocy c1480420ocy) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onResumePlay(String str2, C1480430ocz c1480430ocz) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onRetryOnError(String str2, C1481290oeN c1481290oeN) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onSeekEnd(String str2, boolean z) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onSeekStart(String str2, int i4, float f) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onSpeedChanged(String str2, float f) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onStopPlay(String str2) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onVideoBitrateChanged(String str2, EnumC2281141EQm enumC2281141EQm, int i4) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onVideoSecondFrame(String str2) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void onVideoSizeChanged(String str2, int i4, int i5) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void tc(String str2, JSONObject jSONObject) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final /* synthetic */ void uv(JSONObject jSONObject) {
                                }

                                @Override // X.InterfaceC1482530ogN
                                public final void onPlayRelease(String str2) {
                                    C721760SSw c721760SSw = c1484820ok42.LIZIZ;
                                    if (c721760SSw != null) {
                                        c721760SSw.LIZ();
                                    }
                                    c1484820ok42.LIZ.LJJIIZ(this);
                                    c1484820ok42.LIZIZ = null;
                                }
                            });
                        }
                        C721760SSw c721760SSw = c1484820ok42.LIZIZ;
                        if (c721760SSw != null && !c721760SSw.LJ) {
                            c721760SSw.LJ = true;
                            c721760SSw.LIZLLL = c721760SSw.LIZ;
                            c721760SSw.LJFF = System.currentTimeMillis();
                            c721760SSw.LIZIZ.LIZ();
                            C786410Ut5.LJLIIL(c721760SSw.LIZ, c721760SSw.LIZJ, c721760SSw.LJI);
                        }
                    }
                }
            } else {
                C719950SLx c719950SLx2 = this.LLJILJILJ;
                if (c719950SLx2 != null && (videoItemParams = c719950SLx2.LLILLL) != null && (aweme = videoItemParams.getAweme()) != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null && (photoCarouselInfo = awemeRawAdLJJIJLIJ.getPhotoCarouselInfo()) != null && photoCarouselInfo.enableLivePhotoAutoPlay()) {
                    C1484820ok4 c1484820ok43 = this.LLLLLLLLL;
                    if (c1484820ok43 != null) {
                        c1484820ok43.pause();
                    }
                } else {
                    C1484820ok4 c1484820ok44 = this.LLLLLLLLL;
                    if (c1484820ok44 != null) {
                        c1484820ok44.stop();
                    }
                }
            }
            this.LLLLZIL = true;
            if (str != null) {
                LJLI();
            }
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C1484820ok4 c1484820ok4;
        Video video;
        boolean z;
        C0SFN.LIZIZ.LIZLLL("LivePhotoHolder", null, new AwS158S1100000_9(this, str, 14));
        if (!Intrinsics.LJFF(LJLIIIL(), str)) {
            return;
        }
        FrameLayout frameLayout = this.LLLLLZ;
        if (frameLayout != null) {
            C786410Ut5.fd(frameLayout, this.LLLZZ);
        }
        if (!this.LLLLZLL) {
            C719950SLx c719950SLx = this.LLJILJILJ;
            if (c719950SLx != null) {
                int i = c719950SLx.LL;
                C0ST4 c0st4 = this.LLZILL;
                if (c0st4 != null) {
                    c0st4.LIZIZ(i);
                }
                Iterator<C0ST4> it2 = this.LLZL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(i);
                }
            }
            LJLJJLL();
            ConstraintLayout constraintLayout = this.LLLLLZIL;
            if (constraintLayout != null) {
                C786410Ut5.LL(0, constraintLayout);
            }
            C0STF c0stf = this.LLJLLIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf);
            c0stf.setScaleX(1.0f);
            C0STF c0stf2 = this.LLJLLIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf2);
            c0stf2.setScaleY(1.0f);
            C0STF c0stf3 = this.LLJLLIL;
            float f = this.LLLZLZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf3);
            c0stf3.setTranslationX(f);
            C786410Ut5.Dd(this.LLJLLIL, this.LLLZZ);
            C1206770hVb.LIZ(this.LLJLLIL);
            C0STE c0ste = this.LLJLLIL.LLIZLLLIL;
            if (c0ste != null) {
                ValueAnimator valueAnimator = c0ste.LLJZ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = c0ste.LLLIILIL;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = c0ste.LLLF;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator valueAnimator4 = c0ste.LLLIL;
                if (valueAnimator4 != null) {
                    valueAnimator4.cancel();
                }
                ValueAnimator valueAnimator5 = c0ste.LLLILZ;
                if (valueAnimator5 != null) {
                    valueAnimator5.cancel();
                }
                c0ste.LLJZIJLIL = EnumC1995107rh.LL;
                c0ste.LL.animate().cancel();
                c0ste.LLILLJJLI.requestDisallowInterceptTouchEvent(false);
                c0ste.LLJL = EnumC719760SLe.NORMAL;
                c0ste.LLJJIII = 1.0f;
                c0ste.LLJJJ = new PointF();
                c0ste.LLJJIJIL = new PointF();
                c0ste.LLJJJIL = new PointF();
                c0ste.LLJJJJ = new PointF();
                c0ste.LLJJJJJIL = new PointF();
                c0ste.LLJJJJLIIL = new PointF();
                c0ste.LLJJL = new PointF();
                c0ste.LLJJLIIIJLLLLLLLZ = new PointF();
                c0ste.LLJLIL = null;
                c0ste.LLJLILLLLZIIL = new PointF();
                c0ste.LLJLL = false;
                c0ste.LLJLLIL = false;
                c0ste.LLJJIJI = false;
                c0ste.LLJJIJIIJIL = EnumC585210MxL.IDLE;
            }
            View view = this.LLLLZ;
            if (view != null) {
                C438910HIz.LIZIZ(view, 0L, 3);
            }
            C0STE c0ste2 = this.LLLLLZL;
            if (c0ste2 != null) {
                this.LLJLL.setOnTouchListener(c0ste2);
                C0SLS c0sls = this.LLJJLIIIJLLLLLLLZ;
                if (c0sls != null && !c0sls.b1()) {
                    z = true;
                } else {
                    z = false;
                }
                c0ste2.LLLJL = !z;
            }
            this.LLLLIL.LJJII.LIZJ();
            this.LLLLIL.LJJII.LJIIL = true;
            LivePhotoStruct livePhotoStruct = this.LLLLLLLLLL;
            if (livePhotoStruct != null) {
                video = livePhotoStruct.videoModel;
            } else {
                video = null;
            }
            if (!LJJLI() && video != null) {
                LJJIL(null, video.getWidth(), video.getHeight(), false);
            }
            if (!this.LLLZI && video != null) {
                ImageView.ScaleType scaleType = this.LLLLZLLLI;
                if (scaleType == null) {
                    scaleType = this.LLJLLIL.getScaleType();
                }
                LJLLI(video, scaleType);
            }
        }
        if (this.LLLLLLZZ && (c1484820ok4 = this.LLLLLLLLL) != null) {
            c1484820ok4.pause();
        }
        if (this.LLLZLL) {
            LJLL();
        }
        this.LLLLZI = true;
    }

    @Override // X.InterfaceC1482530ogN
    public final void onSeekEnd(String str, boolean z) {
        C0SFN.LIZIZ.LIZIZ("LivePhotoHolder", null, new AwS17S1110000_9(this, str, z, 1));
    }

    @Override // X.InterfaceC1482530ogN
    public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C0SFN.LIZIZ.LIZIZ("LivePhotoHolder", null, new AwS17S1110000_9(this, str, z, 0));
        Intrinsics.LJFF(LJLIIIL(), str);
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        C0SFN.LIZIZ.LIZJ("LivePhotoHolder", null, new AwS125S1200000_9(this, str, c1481290oeN, 0));
        if (!Intrinsics.LJFF(LJLIIIL(), str)) {
            return;
        }
        this.LLLLZI = false;
        LJLL();
        C12ES.LJIILL(0, this.LLJLLIL);
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPlayProgressChange(String str, long j, long j2) {
        C0SFN.LIZIZ.LIZ("LivePhotoHolder", null, new AwS2S1100200_11(this, str, j, j2, 2));
        if (!Intrinsics.LJFF(LJLIIIL(), str)) {
            return;
        }
        C719950SLx c719950SLx = this.LLJILJILJ;
        if (c719950SLx != null) {
            int i = c719950SLx.LL;
            C0ST4 c0st4 = this.LLZILL;
            if (c0st4 != null) {
                c0st4.LIZJ(i, j, j2);
            }
            Iterator<C0ST4> it2 = this.LLZL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(i, j, j2);
            }
        }
        this.LLLZL = (int) j;
    }

    @Override // X.InterfaceC1482530ogN
    public final void onSeekStart(String str, int i, float f) {
        C0SFN.LIZIZ.LIZIZ("LivePhotoHolder", null, new C586660Mzg(this, str, i, f));
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final void LJIJJLI(float f, boolean z, EnumC719760SLe enumC719760SLe, float f2, String str) {
        C0STE c0ste;
        boolean z2;
        View view;
        ConstraintLayout constraintLayout;
        C0SFN.LIZIZ.LIZIZ("LivePhotoHolder", null, AFwS198S0000000_11.get$arr$(122));
        super.LJIJJLI(f, z, enumC719760SLe, f2, str);
        EnumC719760SLe enumC719760SLe2 = EnumC719760SLe.ZOOM_FIX;
        if (enumC719760SLe == enumC719760SLe2) {
            if (this.LLJLLIL.getVisibility() == 0) {
                LJLJJLL();
            } else {
                LJLJJL();
            }
        } else {
            ConstraintLayout constraintLayout2 = this.LLLLLZIL;
            if (constraintLayout2 != null) {
                if (this.LLJLLIL.getVisibility() == 0 && (c0ste = this.LLLLLZL) != null && c0ste.LJIJI()) {
                    C786410Ut5.Ub(constraintLayout2, 1.0f);
                    C786410Ut5.uc(constraintLayout2, 1.0f);
                    C786410Ut5.Nc(constraintLayout2, 0.0f);
                    C786410Ut5.jd(constraintLayout2, 0.0f);
                    C0STE c0ste2 = this.LLLLLZL;
                    if (c0ste2 != null) {
                        c0ste2.LJI();
                    }
                } else if (this.LLJLLIL.getVisibility() == 8 && this.LLJLLIL.LJIIIIZZ()) {
                    C0STF c0stf = this.LLJLLIL;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf);
                    c0stf.setScaleX(1.0f);
                    C0STF c0stf2 = this.LLJLLIL;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf2);
                    c0stf2.setScaleY(1.0f);
                    C0STF c0stf3 = this.LLJLLIL;
                    float f3 = this.LLLZLZ;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf3);
                    c0stf3.setTranslationX(f3);
                    C786410Ut5.Dd(this.LLJLLIL, this.LLLZZ);
                    C0STE c0ste3 = this.LLJLLIL.LLIZLLLIL;
                    if (c0ste3 != null) {
                        c0ste3.LJI();
                    }
                }
            }
        }
        this.LLLLZLL = false;
        if (LJJLI() && !this.LLLLZI && this.LLJLLIL.getVisibility() == 8) {
            LJLJJL();
            C12ES.LJIILL(0, this.LLJLLIL);
            this.LLJLL.setOnTouchListener(this.LLJLLIL);
        } else if (this.LLLLZI && this.LLJLLIL.getVisibility() == 0) {
            C0STF c0stf4 = this.LLJLLIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf4);
            c0stf4.setScaleX(1.0f);
            C0STF c0stf5 = this.LLJLLIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf5);
            c0stf5.setScaleY(1.0f);
            C0STF c0stf6 = this.LLJLLIL;
            float f4 = this.LLLZLZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf6);
            c0stf6.setTranslationX(f4);
            C786410Ut5.Dd(this.LLJLLIL, this.LLLZZ);
            C1206770hVb.LIZ(this.LLJLLIL);
            C0STE c0ste4 = this.LLLLLZL;
            if (c0ste4 != null) {
                this.LLJLL.setOnTouchListener(c0ste4);
                C0SLS c0sls = this.LLJJLIIIJLLLLLLLZ;
                if (c0sls != null && !c0sls.b1()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c0ste4.LLLJL = !z2;
            }
        }
        if (this.LLJLLIL.getVisibility() == 0) {
            LJLJLLL(true);
        }
        ConstraintLayout constraintLayout3 = this.LLLLLZIL;
        if (constraintLayout3 != null && constraintLayout3.getVisibility() == 4 && ((enumC719760SLe != enumC719760SLe2 || this.LLJLLIL.getVisibility() != 0 || this.LLLLZI) && (constraintLayout = this.LLLLLZIL) != null)) {
            C786410Ut5.LL(0, constraintLayout);
        }
        if (LJLILLLLZI()) {
            int i = C721740SSu.LIZ[enumC719760SLe.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        LJL(false);
                        if (this.LLLZIL) {
                            this.LLLZIL = false;
                            if (!this.LLLLLLZZ && this.LLLZZIL.getShowLiveTagInDetail() && (view = this.LLLLZ) != null) {
                                C438910HIz.LIZ(view, 0L, 3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                this.LLLZIL = true;
                View view2 = this.LLLLZ;
                if (view2 == null) {
                    return;
                }
                C438910HIz.LIZIZ(view2, 0L, 3);
                return;
            }
            this.LLLZIL = true;
            LJLIIL();
            LJL(true);
        }
    }

    public LivePhotoViewHolder(View view, InterfaceC720380SNo interfaceC720380SNo, C0SLJ c0slj, AwS555S0100000_11 awS555S0100000_11, C0SM7 c0sm7, ViewGroup viewGroup, InterfaceC719500SKe interfaceC719500SKe, C0SM8 c0sm8, C0SM1 c0sm1, C0SLS c0sls, FeedPhotoSlidesAdapter$createAssemVHContainer$1 feedPhotoSlidesAdapter$createAssemVHContainer$1, C0SMC c0smc) {
        super(view, interfaceC720380SNo, c0slj, awS555S0100000_11, c0sm7, viewGroup, interfaceC719500SKe, c0sm8, c0sm1, c0sls, null, feedPhotoSlidesAdapter$createAssemVHContainer$1, c0smc, null);
        this.LLLZZIL = EnumC721750SSv.ONCE;
        this.LLZL = new LinkedHashSet();
        if (LJLILLLLZI()) {
            C21146717pB.LIZJ(null, R.layout.e_6);
        }
    }
}
