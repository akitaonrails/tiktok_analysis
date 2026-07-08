package com.ss.android.ugc.aweme.ui.feed.subphoto.holders;

import X.AbstractC1320320kSk;
import X.AnonymousClass0741;
import X.AnonymousClass0956;
import X.C01GW;
import X.C036E;
import X.C03IT;
import X.C04WY;
import X.C0B04;
import X.C0DVZ;
import X.C0H62;
import X.C0N3Y;
import X.C0N3Z;
import X.C0QSJ;
import X.C0S9L;
import X.C0SCS;
import X.C0SFT;
import X.C0SKM;
import X.C0SKZ;
import X.C0SLJ;
import X.C0SLS;
import X.C0SM0;
import X.C0SM1;
import X.C0SM4;
import X.C0SM5;
import X.C0SM7;
import X.C0SM8;
import X.C0SMC;
import X.C0SMD;
import X.C0SML;
import X.C0SMS;
import X.C0SMW;
import X.C0SNE;
import X.C0SQG;
import X.C0SQH;
import X.C0STE;
import X.C0STF;
import X.C0STJ;
import X.C0STV;
import X.C0STW;
import X.C0SV7;
import X.C1012040cRW;
import X.C1331070kk5;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C19252910Tv;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C255670A0f;
import X.C294910BhB;
import X.C298560Bn4;
import X.C304280BwI;
import X.C340220DVk;
import X.C356901a3;
import X.C438710HIf;
import X.C452501pT;
import X.C497820Jfg;
import X.C687700QyG;
import X.C692980RGe;
import X.C692990RGf;
import X.C714060Rzg;
import X.C717490SCl;
import X.C719780SLg;
import X.C719790SLh;
import X.C719800SLi;
import X.C719840SLm;
import X.C719950SLx;
import X.C720310SNh;
import X.C720360SNm;
import X.C721640SSk;
import X.C786410Ut5;
import X.C823050WQl;
import X.C960203pA;
import X.EnumC585210MxL;
import X.EnumC719760SLe;
import X.EnumC720070SMj;
import X.InterfaceC1146704e9;
import X.InterfaceC1320380kSq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC690040R4w;
import X.InterfaceC710220RtU;
import X.InterfaceC719500SKe;
import X.InterfaceC720380SNo;
import Y.ALAdapterS4S0300000_11;
import Y.ARunnableS4S0102000_11;
import Y.ATListenerS445S0100000_11;
import Y.AUListenerS219S0200000_11;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.scope.PhotoSlideScope;
import com.ss.android.ugc.aweme.scope.PostModeDetailScope;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.settings.PinchToClearModeSettings;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlidesAdapter$createAssemVHContainer$1;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS129S0110000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes12.dex */
public class SmartImagePhotoViewHolderV2 extends PhotosViewHolderV3 implements DefaultLifecycleObserver, InterfaceC1146704e9 {
    public static final C0SMD LLLLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLLJ;
    public static final C01GW<Long> LLLLLLL;
    public final InterfaceC720380SNo LLJJL;
    public final C0SLS LLJJLIIIJLLLLLLLZ;
    public final Function0<C0SKZ> LLJL;
    public final C0SMC LLJLIL;
    public final Function2<Integer, Boolean, Unit> LLJLILLLLZIIL;
    public final ViewGroup LLJLL;
    public final C0STF LLJLLIL;
    public final C719800SLi LLJLLL;
    public final C719790SLh LLJZ;
    public final C719840SLm LLJZIJLIL;
    public final View LLL;
    public final C0SQH LLLF;
    public final FrameLayout LLLFF;
    public final C692990RGf LLLFFI;
    public boolean LLLFZ;
    public Float LLLI;
    public AnonymousClass0956 LLLII;
    public C0SFT LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public ImageView.ScaleType LLLILZ;
    public ImageView.ScaleType LLLILZJ;
    public ValueAnimator LLLILZLLLI;
    public final int LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public ViewPropertyAnimator LLLJL;
    public volatile Float LLLL;
    public Float LLLLII;
    public float LLLLIIIILLL;
    public boolean LLLLIIL;
    public String LLLLIILL;
    public String LLLLIILLL;
    public final C0SMW LLLLIL;
    public final C0SM4 LLLLILI;
    public boolean LLLLJ;
    public final C719780SLg LLLLJI;
    public final InterfaceC690040R4w LLLLL;
    public int LLLLLIL;
    public int LLLLLILLIL;
    public volatile C0S9L LLLLLJIL;
    public InterfaceC665370Q7z LLLLLJLJLL;
    public C0QSJ LLLLLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0SMD] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SmartImagePhotoViewHolderV2.class, "photoSlideInternalAbility", "getPhotoSlideInternalAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideInternalAbility;", 0);
        C13LE.LIZ.getClass();
        LLLLLLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLLLLIL = new Object() { // from class: X.0SMD
        };
        LLLLLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(235));
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3, X.InterfaceC719460SKa
    public final RectF I8() {
        int[] iArr = new int[2];
        this.LLJLLIL.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        RectF rectF = new RectF();
        this.LLJLLIL.getHierarchy().LJIIJ(rectF);
        float f = i2;
        rectF.top += f;
        rectF.bottom += f;
        float f2 = i;
        rectF.left += f2;
        rectF.right += f2;
        return rectF;
    }

    public void LJJLIIIJ(ImageView.ScaleType scaleType) {
    }

    public void LJJLIIIJILLIZJL(ImageView.ScaleType scaleType) {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class, PostModeDetailScope.class, PhotoSlideScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        arrayList.add(PostModeDetailScope.class);
        arrayList.add(PhotoSlideScope.class);
        return arrayList;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    private final boolean LJJJJZI() {
        return ((Boolean) this.LLLIILIL.getValue()).booleanValue();
    }

    public View.OnTouchListener Hg() {
        return new ATListenerS445S0100000_11(this, 4);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3, X.InterfaceC719460SKa
    public final RectF LIZJ() {
        RectF rectF = new RectF();
        this.LLJLLIL.getHierarchy().LJIIJ(rectF);
        rectF.top += this.LLJLLIL.getTranslationY();
        rectF.bottom += this.LLJLLIL.getTranslationY();
        rectF.left += this.LLJLLIL.getTranslationX();
        rectF.right += this.LLJLLIL.getTranslationX();
        return rectF;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3, X.InterfaceC719460SKa
    public final boolean LJIIIZ() {
        Bitmap bitmap = this.LLJJ;
        return !(bitmap == null || bitmap.isRecycled()) || this.LLJLLIL.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3, X.InterfaceC719460SKa
    public final String LJIIJJI() {
        if (this.LLJLLIL.LJIIIIZZ()) {
            return EnumC719760SLe.ZOOM_FIX.getPhotoViewStatus();
        }
        C0STE c0ste = this.LLJLLIL.LLIZLLLIL;
        return (c0ste == null || c0ste.LLJL != EnumC719760SLe.CLEAR_MODE) ? EnumC719760SLe.NORMAL.getPhotoViewStatus() : EnumC719760SLe.CLEAR_MODE.getPhotoViewStatus();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    @Override // X.InterfaceC719460SKa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL() {
        /*
            r4 = this;
            X.0SMW r3 = r4.LLLLIL
            X.0SM0 r2 = r4.LLJJIJI
            X.0SM7 r1 = r4.LLIZ
            int r0 = r4.LLILLL
            boolean r0 = r1.fQ1(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.LJI(r2, r0)
            X.0STF r2 = r4.LLJLLIL
            boolean r0 = r4.LJJLI()
            if (r0 == 0) goto L64
            X.0SLS r0 = r4.LLJJLIIIJLLLLLLLZ
            r1 = 1
            if (r0 == 0) goto L26
            boolean r0 = r0.b1()
            if (r0 == 0) goto L64
        L26:
            r2.setPinchEnabled(r1)
            boolean r0 = r4.LJJJJZI()
            if (r0 != 0) goto L44
            X.0RGf r3 = r4.LLLFFI
            int r2 = r4.LLILLL
            X.0RNu r1 = r3.LJFF
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LIZIZ
            boolean r0 = r1.LIZ(r0)
            if (r0 == 0) goto L44
            X.0RGe r0 = r3.LIZLLL
            if (r0 == 0) goto L44
            r0.LJ(r2)
        L44:
            android.view.ViewGroup r0 = r4.LLJLL
            java.lang.CharSequence r1 = r0.getContentDescription()
            if (r1 == 0) goto L63
            boolean r0 = X.C1601690rmZ.LIZIZ()
            if (r0 == 0) goto L63
            android.view.ViewGroup r0 = r4.LLJLL
            r0.announceForAccessibility(r1)
            android.view.ViewGroup r0 = r4.LLJLL
            r0.requestFocus()
            android.view.ViewGroup r1 = r4.LLJLL
            r0 = 8
            r1.sendAccessibilityEvent(r0)
        L63:
            return
        L64:
            r1 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2.LJIILJJIL():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap LJIJI() {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2.LJIJI():android.graphics.Bitmap");
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final String LJJIJ() {
        C0STE c0ste = this.LLJLLIL.LLIZLLLIL;
        if (c0ste == null) {
            return null;
        }
        String str = c0ste.LLLFZ;
        c0ste.LLLFZ = null;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Float LJJJJI() {
        /*
            r9 = this;
            android.view.ViewGroup r0 = r9.LLJLL
            int r4 = r0.getHeight()
            r8 = 0
            if (r4 > 0) goto La
            return r8
        La:
            android.view.ViewGroup r0 = r9.LLJLL
            android.view.ViewParent r1 = r0.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L75
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L75
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L75
            android.view.View r1 = (android.view.View) r1
        L22:
            r7 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L55
            int r0 = r1.getHeight()
            if (r0 <= 0) goto L55
            r5 = 2
            int[] r3 = new int[r5]
            android.view.ViewGroup r0 = r9.LLJLL
            r0.getLocationInWindow(r3)
            r2 = 1
            r3 = r3[r2]
            int[] r0 = new int[r5]
            r1.getLocationInWindow(r0)
            r2 = r0[r2]
            int r0 = r1.getHeight()
            int r0 = r0 + r2
            int r2 = r2 + r0
            float r2 = (float) r2
            float r2 = r2 / r6
            float r1 = (float) r3
            float r0 = (float) r4
            float r0 = r0 / r6
            float r1 = r1 + r0
            float r2 = r2 - r1
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L54
            java.lang.Float r8 = java.lang.Float.valueOf(r2)
        L54:
            return r8
        L55:
            android.view.ViewGroup r0 = r9.LLJLL
            android.view.ViewParent r1 = r0.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L54
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L54
            int r0 = r1.getHeight()
            if (r0 <= 0) goto L54
            int r0 = r0 - r4
            float r1 = (float) r0
            float r1 = r1 / r6
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L54
            java.lang.Float r8 = java.lang.Float.valueOf(r1)
            return r8
        L75:
            r1 = r8
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2.LJJJJI():java.lang.Float");
    }

    public final void LJJJJIZL() {
        if (this.LLLLIIL) {
            this.LLLLIIL = false;
            this.LLJLLL.LIZLLL();
        }
    }

    public final void LJJJJL() {
        if (this.LLLLIIL) {
            return;
        }
        this.LLJLLL.LIZ();
        this.LLJLLL.LIZIZ();
        C719800SLi c719800SLi = this.LLJLLL;
        if (c719800SLi.LJFF == null) {
            ArrayList arrayList = new ArrayList();
            ViewParent parent = c719800SLi.LIZ.getParent();
            while (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.getPaddingLeft() != 0 || viewGroup.getPaddingRight() != 0 || viewGroup.getPaddingTop() != 0 || viewGroup.getPaddingBottom() != 0) && viewGroup.getClipToPadding()) {
                    arrayList.add(new Pair(parent, Boolean.TRUE));
                    viewGroup.setClipToPadding(false);
                }
                parent = viewGroup.getParent();
            }
            c719800SLi.LJFF = arrayList;
        }
        this.LLLLIIL = true;
    }

    public void LJJJJLL() {
        C0STE c0ste = this.LLJLLIL.LLIZLLLIL;
        if (c0ste == null || c0ste.LLJL != EnumC719760SLe.ZOOM_FIX || c0ste.LJJIIJZLJL()) {
            return;
        }
        EnumC719760SLe enumC719760SLe = EnumC719760SLe.CLEAR_MODE;
        c0ste.LLJL = enumC719760SLe;
        c0ste.LLLL = true;
        c0ste.LJIIJ(enumC719760SLe);
    }

    public final int LJJJLIIL() {
        View view;
        if (this.LL.getMeasuredHeight() > 0) {
            return this.LL.getMeasuredHeight();
        }
        Object parent = this.LL.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            if (view.getHeight() > 0) {
                return view.getHeight();
            }
            if (view.getMeasuredHeight() > 0) {
                return view.getMeasuredHeight();
            }
        }
        return C497820Jfg.LIZ(this.LLJIJIL);
    }

    public final C0SM5 LJJJLZIJ() {
        return (C0SM5) this.LLLIIIL.getValue();
    }

    public final IPhotoSlidesAbility LJJJZ() {
        return (IPhotoSlidesAbility) this.LLLIL.getValue();
    }

    public final boolean LJJL() {
        VideoItemParams videoItemParamsD6;
        Aweme aweme;
        return !this.LLIZ.SC() && C294910BhB.LIZ() && ((videoItemParamsD6 = this.LLIZ.d6()) == null || (aweme = videoItemParamsD6.getAweme()) == null || !aweme.isAd());
    }

    public final boolean LJJLI() {
        return this.LLLLIL.LJI || this.LLJJJJLIIL;
    }

    public final boolean LJJLIIIIJ() {
        VideoItemParams videoItemParamsD6 = this.LLIZ.d6();
        if (videoItemParamsD6 == null || C0SCS.LIZ(videoItemParamsD6)) {
            return false;
        }
        VideoItemParams videoItemParamsD62 = this.LLIZ.d6();
        return !Intrinsics.LJFF(videoItemParamsD62 != null ? videoItemParamsD62.mEventType : null, "create_playlist");
    }

    public void LJJLIIIJJI() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean zLJIIIIZZ = this.LLJLLIL.LJIIIIZZ();
        C0STE c0ste = this.LLJLLIL.LLIZLLLIL;
        if (c0ste != null) {
            c0ste.LJJIII();
        }
        C719840SLm c719840SLm = this.LLJZIJLIL;
        ValueAnimator valueAnimator3 = c719840SLm.LJIIIIZZ;
        if ((valueAnimator3 == null || !valueAnimator3.isRunning()) && (((valueAnimator = c719840SLm.LJIJJLI) == null || !valueAnimator.isRunning()) && ((valueAnimator2 = c719840SLm.LJIJJ) == null || !valueAnimator2.isRunning()))) {
            LJJLIIIJLLLLLLLZ(150L);
        }
        this.LLJZ.LIZIZ();
        LJJJJIZL();
        if (zLJIIIIZZ) {
            LJJLIIJ();
        }
    }

    public final void LJJLIIIJJIZ() {
        C692980RGe c692980RGe;
        if (this.LLLFFI.LIZ(LJIJ()) && Boolean.valueOf(C717490SCl.LIZ(this.LLJLLIL)).booleanValue()) {
            C692990RGf c692990RGf = this.LLLFFI;
            int i = this.LLILLL;
            if (!c692990RGf.LIZ(LJIJ()) || (c692980RGe = c692990RGf.LIZLLL) == null) {
                return;
            }
            c692980RGe.LJ(i);
        }
    }

    public final void LJJLIIJ() {
        this.LLJLLL.LIZJ();
        this.LLJLLL.LJ();
        this.LLJZ.LIZJ();
        this.LLJZ.LIZIZ();
        this.LLJZIJLIL.LJII();
        LJJJJIZL();
        this.LLLL = null;
    }

    public final void LJJLJ() {
        VideoItemParams videoItemParams;
        Aweme aweme;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        int i;
        C719950SLx c719950SLx = this.LLJILJILJ;
        if (c719950SLx == null || (videoItemParams = c719950SLx.LLILLL) == null || (aweme = videoItemParams.getAweme()) == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(this.LLILLL, imageList)) == null || photoModeImageUrlModel.getBlurHashCode() == null) {
            return;
        }
        int i2 = 0;
        PhotoModeImage photoModeImageLJIILIIL = C720360SNm.LJIILIIL(aweme, this.LLILLL, false);
        if (photoModeImageLJIILIIL != null) {
            i = photoModeImageLJIILIIL.width;
            i2 = photoModeImageLJIILIIL.height;
        } else {
            i = 0;
        }
        int iMax = Math.max(i, i2);
        int iLIZ = C255670A0f.LIZ();
        int i3 = 1;
        if (iLIZ > 0) {
            while (iMax > iLIZ) {
                i3++;
                iMax = Math.max(i, i2) / i3;
            }
        }
        this.LLLLLIL = i / i3;
        this.LLLLLILLIL = i2 / i3;
        LJJIL(null, this.LLLLLIL, this.LLLLLILLIL, true);
    }

    public void LJJZ() {
        C0STE c0ste = this.LLJLLIL.LLIZLLLIL;
        if (c0ste != null && c0ste.LLJL == EnumC719760SLe.NORMAL && c0ste.LLJJIJIIJIL == EnumC585210MxL.IDLE) {
            c0ste.LLJL = EnumC719760SLe.CLEAR_MODE;
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final boolean LJJI() {
        return super.LJJI() && !this.LLJLLIL.getHierarchy().LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final boolean LJJII() {
        return super.LJJI() && this.LLJJIJI == C0SM0.BLUR_PLACEHOLDER;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final boolean LJJIII() {
        return LJJI() || LJJII();
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final C0SM0 LJJIJIIJIL() {
        Bitmap bitmap;
        VideoItemParams videoItemParams;
        Aweme aweme;
        PhotoModeImage photoModeImageLJIILIIL;
        UrlModel urlModel;
        Bitmap bitmap2;
        if ((C1012040cRW.LIZIZ().LJIIL == -1 || this.LLILLL == C1012040cRW.LIZIZ().LJIIL) && (bitmap = C720310SNh.LIZ) != null && (!bitmap.isRecycled())) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.LLJIJIL.getResources(), bitmap);
            LJJIL(null, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight(), true);
            this.LLJLLIL.getHierarchy().LJJIFFI(bitmapDrawable, this.LLJLLIL.getHierarchy().LJIIJJI());
            C720310SNh.LJII(null);
            return C0SM0.COVER_PLACEHOLDER;
        }
        if (((Number) AnonymousClass0741.LIZ.getValue()).intValue() == 0 && this.LLJJJJLIIL) {
            return C0SM0.NONE;
        }
        C719950SLx c719950SLx = this.LLJILJILJ;
        if (c719950SLx != null && (videoItemParams = c719950SLx.LLILLL) != null && (aweme = videoItemParams.getAweme()) != null && (photoModeImageLJIILIIL = C720360SNm.LJIILIIL(aweme, this.LLILLL, false)) != null && (urlModel = photoModeImageLJIILIIL.urlModel) != null) {
            C03IT c03it = new C03IT(urlModel.getUrlList());
            VideoItemParams videoItemParamsD6 = this.LLIZ.d6();
            if (Intrinsics.LJFF(videoItemParamsD6 != null ? videoItemParamsD6.mEventType : null, "homepage_hot")) {
                C0N3Z.LIZ.getClass();
                ConcurrentHashMap<String, Bitmap> concurrentHashMap = C0N3Z.LIZJ;
                if (!concurrentHashMap.containsKey(c03it.toString()) || (bitmap2 = concurrentHashMap.get(c03it.toString())) == null || bitmap2.isRecycled()) {
                    LJJLJ();
                } else {
                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.LLJIJIL.getResources(), bitmap2);
                    this.LLLLIL.LIZLLL(this.LLILLL, C0N3Y.PLACEHOLDER);
                    C0N3Z.LIZIZ(EnumC720070SMj.FROM_MEMORYCACHE.getValue());
                    concurrentHashMap.clear();
                    LJJIL(null, bitmapDrawable2.getIntrinsicWidth(), bitmapDrawable2.getIntrinsicHeight(), true);
                    this.LLJLLIL.getHierarchy().LJJIFFI(bitmapDrawable2, this.LLJLLIL.getHierarchy().LJIIJJI());
                }
            } else {
                LJJLJ();
            }
        }
        return this.LLJLLIL.getHierarchy().LJIILJJIL() ? C0SM0.BLUR_PLACEHOLDER : C0SM0.NONE;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final void LJJIJIL() {
        if (C04WY.LIZ()) {
            this.LLLLIL.LJIIIZ(this.LLJJIJI);
            return;
        }
        if (this.LLJJIJIIJIL != -1 || this.LLJJIJIL != -1 || this.LLJILJILJ == null || this.LLJLLIL.getHierarchy().LJIILJJIL()) {
            return;
        }
        C0SMW c0smw = this.LLLLIL;
        int i = C0SMS.LJJIIZ;
        c0smw.LJIIIZ(C0SM0.NONE);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public void LJJIJLIJ() {
        Lifecycle lifecycle;
        C0STE c0ste;
        super.LJJIJLIJ();
        this.LLJJIJI = C0SM0.NONE;
        C692990RGf c692990RGf = this.LLLFFI;
        C692980RGe c692980RGe = c692990RGf.LIZLLL;
        if (c692980RGe != null) {
            c692980RGe.LIZJ(false);
        }
        C692980RGe c692980RGe2 = c692990RGf.LIZLLL;
        if (c692980RGe2 != null) {
            C786410Ut5.m1(c692980RGe2, 8);
        }
        c692990RGf.LIZIZ = null;
        c692990RGf.LJ = null;
        this.LLJLLIL.setPlaceholderImage((Drawable) null);
        this.LLJLLIL.setPinchEnabled(false);
        if (((Boolean) C0B04.LIZ.getValue()).booleanValue() && (c0ste = this.LLJLLIL.LLIZLLLIL) != null) {
            c0ste.LJJIII();
        }
        this.LLLFZ = false;
        this.LLLI = null;
        C0SM5 c0sm5LJJJLZIJ = LJJJLZIJ();
        if (c0sm5LJJJLZIJ != null) {
            c0sm5LJJJLZIJ.clear();
        }
        AnonymousClass0956 anonymousClass0956 = this.LLLII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJZIJLIL.LIZJ();
        this.LLJLLL.LIZJ();
        this.LLJLLL.LJ();
        this.LLJLLL.LIZLLL();
        this.LLJZ.LIZJ();
        this.LLJZIJLIL.LJII();
        LJJJJIZL();
        EventBus.LIZLLL().LJJI(this);
        if (this.LLLLJ) {
            C036E.LIZ.LIZLLL(this.LLLLILI);
            this.LLLLJ = false;
        }
        LifecycleOwner lifecycleOwnerE82 = E82();
        if (lifecycleOwnerE82 != null && (lifecycle = lifecycleOwnerE82.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        this.LLJLLIL.setTransitionName(null);
        this.LLLLII = null;
    }

    public final void LJJLIIIJL() {
        C692980RGe c692980RGe;
        C692980RGe c692980RGe2;
        if (LJJJJZI()) {
            if (this.LLLFFI.LIZ(LJIJ())) {
                C692990RGf c692990RGf = this.LLLFFI;
                if (!c692990RGf.LIZ(LJIJ()) || (c692980RGe = c692990RGf.LIZLLL) == null) {
                    return;
                }
                c692980RGe.LLILZLL = null;
                return;
            }
            return;
        }
        C692990RGf c692990RGf2 = this.LLLFFI;
        if (c692990RGf2.LJFF.LIZ(c692990RGf2.LIZIZ)) {
            C692990RGf c692990RGf3 = this.LLLFFI;
            if (!c692990RGf3.LJFF.LIZ(c692990RGf3.LIZIZ) || (c692980RGe2 = c692990RGf3.LIZLLL) == null) {
                return;
            }
            c692980RGe2.LLILZLL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3, X.InterfaceC719460SKa
    public final FrameLayout LJ() {
        return this.LLLFF;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final C0SMS LJIJJ() {
        return this.LLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3, X.InterfaceC719460SKa
    public final /* bridge */ /* synthetic */ View getImageView() {
        return this.LLJLLIL;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3, X.InterfaceC719460SKa
    public void LJIIIIZZ(Drawable drawable) {
        this.LLJLLIL.setPinchingBackground(drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.InterfaceC469401sC LJIILLIIL(X.C719950SLx r11) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2.LJIILLIIL(X.0SLx):X.01sC");
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3
    public final void LJJIIZ(Bitmap bitmap) {
        LJJZZIII(bitmap.getWidth(), bitmap.getHeight(), bitmap);
    }

    public final void LJJJI(boolean z) {
        ImageView.ScaleType scaleType;
        if (!this.LLIZ.SC() && this.LLJJIJIIJIL > 0 && this.LLJJIJIL > 0) {
            boolean zLJIIIZ = this.LLJZIJLIL.LJIIIZ(this.LLLLIIIILLL);
            if (zLJIIIZ) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            } else {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            if (this.LLLILZJ == null) {
                this.LLLILZJ = this.LLLILZ;
            }
            if (this.LLLILZ == scaleType) {
                return;
            }
            this.LLLILZ = scaleType;
            this.LLJLLIL.setScaleType(scaleType);
            LJJLIIIJILLIZJL(scaleType);
            if (z) {
                if (zLJIIIZ) {
                    LJJIZ(this, InterfaceC1320380kSq.LJII, new PointF(0.5f, 1.0f), 0L, 4);
                    return;
                } else {
                    LJJIZ(this, InterfaceC1320380kSq.LIZJ, null, 0L, 6);
                    return;
                }
            }
            C1331070kk5 hierarchy = this.LLJLLIL.getHierarchy();
            if (zLJIIIZ) {
                hierarchy.LJIILIIL(2).LJIJ(new PointF(0.5f, 1.0f));
                hierarchy.LJIIZILJ(InterfaceC1320380kSq.LJII);
                return;
            }
            hierarchy.LJIIZILJ(InterfaceC1320380kSq.LIZJ);
        }
    }

    public void LJJJJLI(boolean z) {
        boolean zLJIIIIZZ = this.LLJLLIL.LJIIIIZZ();
        C0STE c0ste = this.LLJLLIL.LLIZLLLIL;
        if (c0ste != null) {
            c0ste.LJIIIIZZ(z);
        }
        if (zLJIIIIZZ && !z) {
            LJJLIIJ();
        }
    }

    public void LJJLIIIJLJLI(boolean z) {
        C0STE c0ste = this.LLJLLIL.LLIZLLLIL;
        if (c0ste != null) {
            c0ste.LJJIIJ(z);
        }
    }

    public final void LJJLIIIJLLLLLLLZ(long j) {
        AbstractC1320320kSk abstractC1320320kSk;
        ImageView.ScaleType scaleType = this.LLLILZJ;
        if (scaleType == null) {
            return;
        }
        this.LLLILZJ = null;
        this.LLLILZ = scaleType;
        this.LLJLLIL.setScaleType(scaleType);
        LJJLIIIJILLIZJL(scaleType);
        switch (C340220DVk.LIZ[scaleType.ordinal()]) {
            case 1:
                abstractC1320320kSk = InterfaceC1320380kSq.LIZJ;
                break;
            case 2:
                abstractC1320320kSk = InterfaceC1320380kSq.LJI;
                break;
            case 3:
                abstractC1320320kSk = InterfaceC1320380kSq.LIZLLL;
                break;
            case 4:
                abstractC1320320kSk = InterfaceC1320380kSq.LIZIZ;
                break;
            case 5:
                abstractC1320320kSk = InterfaceC1320380kSq.LJ;
                break;
            case 6:
                abstractC1320320kSk = InterfaceC1320380kSq.LJFF;
                break;
            case 7:
                abstractC1320320kSk = InterfaceC1320380kSq.LIZ;
                break;
            default:
                abstractC1320320kSk = InterfaceC1320380kSq.LIZJ;
                break;
        }
        LJJIZ(this, abstractC1320320kSk, null, j, 2);
    }

    public final void LJJLJLI(final boolean z) {
        IPhotoSlidesAbility iPhotoSlidesAbilityLJJJZ;
        final InterfaceC710220RtU interfaceC710220RtUYn;
        Float fLJJJJI;
        if (C0SKM.LJII() && !this.LLLJ && (iPhotoSlidesAbilityLJJJZ = LJJJZ()) != null && (interfaceC710220RtUYn = iPhotoSlidesAbilityLJJJZ.yn()) != null && interfaceC710220RtUYn.LJJIJ()) {
            ViewPropertyAnimator viewPropertyAnimator = this.LLLJL;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            this.LLLJL = null;
            if (this.LLLLII != null) {
                LJJJ(0, z);
                return;
            }
            ViewGroup viewGroup = this.LLJLL;
            if (viewGroup.isLaidOut() && !viewGroup.isLayoutRequested()) {
                if (interfaceC710220RtUYn.LJJIJ() && !this.LLLJ && this.LLLLII != null) {
                    LJJJ(0, z);
                    return;
                }
                if (!interfaceC710220RtUYn.LJJIJ() || this.LLLJ || (fLJJJJI = LJJJJI()) == null) {
                    return;
                }
                this.LLLL = fLJJJJI;
                this.LLLJ = true;
                LJJJIL(fLJJJJI.floatValue(), z);
                return;
            }
            viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0SKc
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    if (interfaceC710220RtUYn.LJJIJ()) {
                        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2 = this;
                        if (!smartImagePhotoViewHolderV2.LLLJ && smartImagePhotoViewHolderV2.LLLLII != null) {
                            smartImagePhotoViewHolderV2.LJJJ(0, z);
                            return;
                        }
                    }
                    if (!interfaceC710220RtUYn.LJJIJ()) {
                        return;
                    }
                    SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV22 = this;
                    if (smartImagePhotoViewHolderV22.LLLJ) {
                        return;
                    }
                    boolean z2 = z;
                    Float fLJJJJI2 = smartImagePhotoViewHolderV22.LJJJJI();
                    if (fLJJJJI2 == null) {
                        return;
                    }
                    smartImagePhotoViewHolderV22.LLLL = fLJJJJI2;
                    smartImagePhotoViewHolderV22.LLLJ = true;
                    smartImagePhotoViewHolderV22.LJJJIL(fLJJJJI2.floatValue(), z2);
                }
            });
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onClearModeEvent(C714060Rzg c714060Rzg) {
        String str;
        String str2 = c714060Rzg.LIZLLL;
        VideoItemParams videoItemParamsD6 = this.LLIZ.d6();
        if (videoItemParamsD6 != null) {
            str = videoItemParamsD6.mEventType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str2, str) && !c714060Rzg.LIZ) {
            LJJLIIIJJI();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFeedContentLayoutCacheReadyEvent(C0SML c0sml) {
        String aid;
        String str = c0sml.LIZ;
        Aweme awemeLJIJ = LJIJ();
        if (awemeLJIJ != null) {
            aid = awemeLJIJ.getAid();
        } else {
            aid = null;
        }
        Intrinsics.LJFF(str, aid);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        if (C298560Bn4.LIZ() && LJJIFFI()) {
            LJJIIJZLJL();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        if (C298560Bn4.LIZ() && !this.LLLLJ) {
            C036E.LIZ.LIZ(this.LLLLILI);
            this.LLLLJ = true;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        EventBus.LIZLLL().LJJI(this);
        if (this.LLLLJ) {
            C036E.LIZ.LIZLLL(this.LLLLILI);
            this.LLLLJ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3, X.InterfaceC719460SKa
    public final void LIZLLL(int i, int i2) {
        C0SM5 c0sm5LJJJLZIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
        sbLIZ.append('_');
        sbLIZ.append(C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!Intrinsics.LJFF(this.LLLLIILLL, strLIZIZ) && (c0sm5LJJJLZIJ = LJJJLZIJ()) != null) {
            new AwS555S0100000_11(this, 37);
            c0sm5LJJJLZIJ.LJ();
        }
        this.LLLLIILLL = strLIZIZ;
    }

    public final void LJJJ(int i, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view;
        Float f = this.LLLLII;
        if (f != null) {
            float fFloatValue = f.floatValue();
            int i2 = 0;
            if (i <= 0) {
                Object parent = this.LLJLL.getParent();
                if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                    i = view.getHeight();
                } else {
                    i = 0;
                }
            }
            ViewGroup.LayoutParams layoutParams = this.LLJLL.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i2 = marginLayoutParams.topMargin;
            }
            float f2 = (i * fFloatValue) - i2;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (i <= 0) {
                return;
            }
            if (f2 > 0.0f) {
                this.LLLL = Float.valueOf(f2);
                this.LLLJ = true;
                LJJJIL(f2, z);
                return;
            }
            this.LLLJ = true;
        }
    }

    public final void LJJJIL(float f, boolean z) {
        if (z) {
            ViewPropertyAnimator interpolator = this.LLJLL.animate().translationY(f).setDuration(200L).setInterpolator(new LinearInterpolator());
            this.LLLJL = interpolator;
            if (interpolator != null) {
                interpolator.start();
                return;
            }
            return;
        }
        C786410Ut5.bd(f, this.LLJLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0235  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ(android.widget.ImageView.ScaleType r16, float r17) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2.LJJJJ(android.widget.ImageView$ScaleType, float):void");
    }

    public final void LJJZZI(int i, ImageView.ScaleType scaleType) {
        Function2<Integer, Boolean, Unit> function2;
        int height = this.LL.getHeight();
        if (height == 0 && (height = LJJJLIIL()) == 0) {
            return;
        }
        float f = i / height;
        if (LJJJJZI()) {
            this.LLLI = Float.valueOf(f);
        }
        this.LLJZIJLIL.LIZ(f);
        if (scaleType != null) {
            this.LLLILZ = scaleType;
            this.LLJLLIL.setScaleType(scaleType);
            this.LLJLLIL.setActualImageScaleType(C0DVZ.LIZ(scaleType));
        }
        if (LJJJJZI() && (function2 = this.LLJLILLLLZIIL) != null) {
            function2.invoke(Integer.valueOf(this.LLILLL), Boolean.TRUE);
        }
    }

    public final void LJJZZIII(int i, int i2, Bitmap bitmap) {
        C719950SLx c719950SLx;
        Aweme aweme;
        PhotoModeImage photoModeImageLJIILIIL;
        PhotoModeImage photoModeImageLJIILIIL2;
        Aweme awemeLJIJ;
        PhotoModeImageInfo photoModeImageInfo;
        C823050WQl.LIZLLL().submit(new ARunnableS4S0102000_11(this, i, i2, 0));
        Aweme awemeLJIJ2 = LJIJ();
        UrlModel urlModel = null;
        if (awemeLJIJ2 != null && (photoModeImageLJIILIIL2 = C720360SNm.LJIILIIL(awemeLJIJ2, this.LLILLL, false)) != null && ((photoModeImageLJIILIIL2.width != i || photoModeImageLJIILIIL2.height != i2) && (awemeLJIJ = LJIJ()) != null && (photoModeImageInfo = awemeLJIJ.getPhotoModeImageInfo()) != null)) {
            List<PhotoModeImage> listLIZLLL = C720360SNm.LIZLLL(photoModeImageInfo);
            int i3 = this.LLILLL;
            UrlModel urlModel2 = photoModeImageLJIILIIL2.urlModel;
            Bitmap bitmap2 = C720310SNh.LIZ;
            ListProtector.set(listLIZLLL, i3, new PhotoModeImage(urlModel2, i, i2, Float.valueOf(C720310SNh.LIZ(Integer.valueOf(photoModeImageLJIILIIL2.width), Integer.valueOf(photoModeImageLJIILIIL2.height))), photoModeImageLJIILIIL2.translatedUrlModel, this.LLILLL));
        }
        LJJIL(bitmap, i, i2, false);
        if (this.LLLLL != null && C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJJI() && (c719950SLx = this.LLJILJILJ) != null) {
            int i4 = c719950SLx.LL;
            VideoItemParams videoItemParamsD6 = this.LLIZ.d6();
            if (videoItemParamsD6 != null && (aweme = videoItemParamsD6.getAweme()) != null && (photoModeImageLJIILIIL = C720360SNm.LJIILIIL(aweme, i4, false)) != null) {
                urlModel = photoModeImageLJIILIIL.urlModel;
            }
            ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(urlModel);
            InterfaceC690040R4w interfaceC690040R4w = this.LLLLL;
            if (interfaceC690040R4w != null) {
                interfaceC690040R4w.LIZIZ(i, i2, imageUrlModelLIZ);
            }
        }
    }

    public static void LJJLL(SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2, boolean z, boolean z2, int i) {
        long j;
        Function0<Unit> awS555S0100000_11;
        boolean z3 = z2;
        if ((i & 2) != 0) {
            z3 = false;
        }
        if ((i & 4) != 0) {
            j = 300;
        } else {
            j = 0;
        }
        if (z) {
            if (smartImagePhotoViewHolderV2.LJJL()) {
                smartImagePhotoViewHolderV2.LLJLLL.LIZ();
                smartImagePhotoViewHolderV2.LLJLLL.LIZIZ();
            }
        } else {
            smartImagePhotoViewHolderV2.LLJLLL.LIZJ();
            smartImagePhotoViewHolderV2.LLJLLL.LJ();
            if (z3) {
                smartImagePhotoViewHolderV2.LJJLIIIJLLLLLLLZ(j);
            }
        }
        C719840SLm c719840SLm = smartImagePhotoViewHolderV2.LLJZIJLIL;
        boolean zLJJL = smartImagePhotoViewHolderV2.LJJL();
        float f = smartImagePhotoViewHolderV2.LLLLIIIILLL;
        if (z) {
            awS555S0100000_11 = new AwS129S0110000_11(smartImagePhotoViewHolderV2, z3, 0);
        } else if (z3) {
            awS555S0100000_11 = null;
        } else {
            awS555S0100000_11 = new AwS555S0100000_11(smartImagePhotoViewHolderV2, 33);
        }
        c719840SLm.LJIIIIZZ(z, z3, j, zLJJL, f, awS555S0100000_11);
    }

    public final void LJJIL(final Bitmap bitmap, final int i, final int i2, final boolean z) {
        boolean z2;
        if (this.LL.getWidth() != 0 && this.LL.getHeight() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (C304280BwI.LIZLLL() && this.LLIZ.SC() && z && z2) {
            View view = this.LL;
            if (view.isLaidOut() && !view.isLayoutRequested()) {
                LJJJJJ(i, i2, bitmap, false, true);
                return;
            } else {
                view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0SM9
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                        view2.removeOnLayoutChangeListener(this);
                        this.LL.LJJJJJ(i, i2, bitmap, false, true);
                    }
                });
                return;
            }
        }
        if (this.LLIZ.SC() || z || this.LLIZ.um0() || (this.LL.getWidth() > 0 && this.LL.getHeight() > 0)) {
            LJJJJJ(i, i2, bitmap, !z, true);
            return;
        }
        View view2 = this.LL;
        if (view2.isLaidOut() && !view2.isLayoutRequested()) {
            LJJJJJ(i, i2, bitmap, !z, false);
        } else {
            view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0SMA
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    view3.removeOnLayoutChangeListener(this);
                    this.LL.LJJJJJ(i, i2, bitmap, !z, false);
                }
            });
        }
    }

    public static void LJJIZ(SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2, AbstractC1320320kSk abstractC1320320kSk, PointF pointF, long j, int i) {
        PointF pointF2 = pointF;
        if ((i & 2) != 0) {
            pointF2 = null;
        }
        if ((i & 4) != 0) {
            j = 150;
        }
        ValueAnimator valueAnimator = smartImagePhotoViewHolderV2.LLLILZLLLI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C1331070kk5 hierarchy = smartImagePhotoViewHolderV2.LLJLLIL.getHierarchy();
        InterfaceC1320380kSq interfaceC1320380kSqLJIIJJI = hierarchy.LJIIJJI();
        if (interfaceC1320380kSqLJIIJJI != null) {
            if (Intrinsics.LJFF(interfaceC1320380kSqLJIIJJI, abstractC1320320kSk)) {
                hierarchy.LJIIZILJ(abstractC1320320kSk);
                if (pointF2 != null) {
                    hierarchy.LJIILIIL(2).LJIJ(pointF2);
                    return;
                }
                return;
            }
            if (pointF2 != null) {
                hierarchy.LJIILIIL(2).LJIJ(pointF2);
            }
            C0SV7 c0sv7 = new C0SV7(interfaceC1320380kSqLJIIJJI, abstractC1320320kSk, null, null, pointF2, pointF2);
            hierarchy.LJIIZILJ(c0sv7);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(j);
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS219S0200000_11(c0sv7, smartImagePhotoViewHolderV2, 1));
            valueAnimatorOfFloat.addListener(new ALAdapterS4S0300000_11(hierarchy, abstractC1320320kSk, smartImagePhotoViewHolderV2, 0));
            valueAnimatorOfFloat.start();
            smartImagePhotoViewHolderV2.LLLILZLLLI = valueAnimatorOfFloat;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0337, code lost:
    
        if (r7 == null) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04f5  */
    /* JADX WARN: Type inference failed for: r3v48, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r3v64, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r3v70, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r4v39, types: [T, android.widget.ImageView$ScaleType] */
    /* JADX WARN: Type inference failed for: r4v42, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJ(int r46, int r47, android.graphics.Bitmap r48, boolean r49, boolean r50) {
        /*
            Method dump skipped, instruction units count: 1453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2.LJJJJJ(int, int, android.graphics.Bitmap, boolean, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.0SM4] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.0SLg, X.0STJ] */
    public SmartImagePhotoViewHolderV2(View view, InterfaceC720380SNo interfaceC720380SNo, final C0SLJ c0slj, Function0 function0, final C0SM7 c0sm7, ViewGroup viewGroup, InterfaceC719500SKe interfaceC719500SKe, C0SM8 c0sm8, C0SM1 c0sm1, C0SLS c0sls, Function0 function02, FeedPhotoSlidesAdapter$createAssemVHContainer$1 feedPhotoSlidesAdapter$createAssemVHContainer$1, C0SMC c0smc, Function2 function2) {
        Aweme aweme;
        int i;
        boolean z;
        ViewStub viewStub;
        C0SQG c0sqg;
        C0STV c0stv;
        InterfaceC710220RtU interfaceC710220RtUYn;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(view, c0slj, c0sm7, viewGroup, c0sm8, c0sm1, feedPhotoSlidesAdapter$createAssemVHContainer$1);
        this.LLJJL = interfaceC720380SNo;
        this.LLJJLIIIJLLLLLLLZ = c0sls;
        this.LLJL = function02;
        this.LLJLIL = c0smc;
        this.LLJLILLLLZIIL = function2;
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.qeg);
        this.LLJLL = viewGroup2;
        C0STF c0stf = (C0STF) viewGroup2.findViewById(R.id.vmb);
        this.LLJLLIL = c0stf;
        this.LLJLLL = new C719800SLi(viewGroup2);
        C719790SLh c719790SLh = new C719790SLh(viewGroup2);
        this.LLJZ = c719790SLh;
        this.LLJZIJLIL = new C719840SLm(viewGroup2, view, c719790SLh);
        this.LLL = view.findViewById(R.id.nnr);
        C0SQH c0sqh = (C0SQH) view.findViewById(R.id.ymh);
        this.LLLF = c0sqh;
        this.LLLFF = (FrameLayout) view.findViewById(R.id.ega);
        VideoItemParams videoItemParamsD6 = c0sm7.d6();
        if (videoItemParamsD6 != null) {
            aweme = videoItemParamsD6.getAweme();
        } else {
            aweme = null;
        }
        this.LLLFFI = new C692990RGf(view, aweme, function0);
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 38));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 39));
        this.LLLIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(16));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 36));
        this.LLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 40));
        this.LLLILZ = ImageView.ScaleType.FIT_CENTER;
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        this.LLLIZZ = i;
        this.LLLLIILL = "";
        this.LLLLIILLL = "";
        C0SNE c0sne = new C0SNE() { // from class: X.0SCk
            @Override // X.C0SNE
            public final void LIZIZ(C1331670kl3 c1331670kl3) {
                IPhotoSlidesAbility iPhotoSlidesAbilityLJJJZ;
                InterfaceC710220RtU interfaceC710220RtUYn2;
                if (!c0sm7.SC() && (iPhotoSlidesAbilityLJJJZ = this.LIZ.LJJJZ()) != null && (interfaceC710220RtUYn2 = iPhotoSlidesAbilityLJJJZ.yn()) != null) {
                    interfaceC710220RtUYn2.LJIIJ(c1331670kl3);
                }
            }

            @Override // X.C0SNE
            public final void LIZ(int i2, int i3) {
                boolean z2;
                InterfaceC497601wk interfaceC497601wkLIZ;
                IPhotoSlidesAbility iPhotoSlidesAbilityLJJJZ;
                InterfaceC710220RtU interfaceC710220RtUYn2;
                IPhotoSlidesAbility iPhotoSlidesAbilityLJJJZ2;
                InterfaceC710220RtU interfaceC710220RtUYn3;
                C0SLS c0sls2;
                SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2 = this.LIZ;
                int i4 = smartImagePhotoViewHolderV2.LLLLLIL;
                if (i4 != 0 && smartImagePhotoViewHolderV2.LLLLLILLIL != 0 && Math.abs(i4 - i2) < 3 && Math.abs(this.LIZ.LLLLLILLIL - i3) < 3) {
                    SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV22 = this.LIZ;
                    smartImagePhotoViewHolderV22.LLJJIJIIJIL = smartImagePhotoViewHolderV22.LLLLLIL;
                    smartImagePhotoViewHolderV22.LLJJIJIL = smartImagePhotoViewHolderV22.LLLLLILLIL;
                } else {
                    SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV23 = this.LIZ;
                    smartImagePhotoViewHolderV23.LLJJIJIIJIL = i2;
                    smartImagePhotoViewHolderV23.LLJJIJIL = i3;
                }
                SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV24 = this.LIZ;
                smartImagePhotoViewHolderV24.LJJZZIII(smartImagePhotoViewHolderV24.LLJJIJIIJIL, smartImagePhotoViewHolderV24.LLJJIJIL, null);
                SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV25 = this.LIZ;
                C0STF c0stf2 = smartImagePhotoViewHolderV25.LLJLLIL;
                if (smartImagePhotoViewHolderV25.LJJLI() && ((c0sls2 = smartImagePhotoViewHolderV25.LLJJLIIIJLLLLLLLZ) == null || c0sls2.b1())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c0stf2.setPinchEnabled(z2);
                if (this.LIZ.LLILLL == 0 && c0sm7.SC()) {
                    C717470SCj c717470SCj = C717470SCj.LIZ;
                    c717470SCj.getClass();
                    if (C717470SCj.LJIIIIZZ == null) {
                        C717470SCj.LJIIIIZZ = Long.valueOf(System.currentTimeMillis() - C717470SCj.LJ);
                    }
                    c717470SCj.LIZIZ();
                }
                SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV26 = this.LIZ;
                smartImagePhotoViewHolderV26.getClass();
                if (C0SKP.LIZIZ() || (((iPhotoSlidesAbilityLJJJZ2 = smartImagePhotoViewHolderV26.LJJJZ()) != null && (interfaceC710220RtUYn3 = iPhotoSlidesAbilityLJJJZ2.yn()) != null && interfaceC710220RtUYn3.LJJIFFI()) || smartImagePhotoViewHolderV26.LLIZ.SC())) {
                    AnonymousClass0956 anonymousClass0956 = smartImagePhotoViewHolderV26.LLLII;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    LifecycleOwner lifecycleOwnerFindSAFExpLifecycleOwner = IMainSAFLifecycleKt.findSAFExpLifecycleOwner(smartImagePhotoViewHolderV26.LL, (C19EG) null);
                    if (lifecycleOwnerFindSAFExpLifecycleOwner == null || (interfaceC497601wkLIZ = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerFindSAFExpLifecycleOwner)) == null) {
                        C1DFH c1dfh = C0PEM.LIZ;
                        interfaceC497601wkLIZ = C2296808zG.LIZ(C2107308Nj.LIZ);
                    }
                    smartImagePhotoViewHolderV26.LLLII = C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C2224908nf(smartImagePhotoViewHolderV26, null), 3);
                }
                if (!c0sm7.SC() && (iPhotoSlidesAbilityLJJJZ = this.LIZ.LJJJZ()) != null && (interfaceC710220RtUYn2 = iPhotoSlidesAbilityLJJJZ.yn()) != null) {
                    interfaceC710220RtUYn2.LJIIJJI(this.LIZ.LLJLL);
                }
            }
        };
        C721640SSk c721640SSk = C721640SSk.LIZ;
        PostModeDetailParams postModeDetailParamsH = c0sm1.H();
        c721640SSk.getClass();
        boolean zLJIILJJIL = C721640SSk.LJIILJJIL(postModeDetailParamsH);
        if (((Number) C298560Bn4.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLLLIL = new C0SMW(c0sm7, interfaceC719500SKe, view, c0sne, zLJIILJJIL, z, c0smc);
        this.LLLLILI = new C0H62() { // from class: X.0SM4
            @Override // X.C0H62
            public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                if (C298560Bn4.LIZ() && c0o0l == C0O0L.NOT_AVAILABLE && c0o0l2 == C0O0L.AVAILABLE) {
                    SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2 = this.LL;
                    if (smartImagePhotoViewHolderV2.LLJILJILJ != null && smartImagePhotoViewHolderV2.LJJIFFI()) {
                        this.LL.LJJIIJZLJL();
                    }
                }
            }
        };
        ?? r7 = new C0STJ() { // from class: X.0SLg
            public boolean LIZIZ;
            public float LIZ = 1.0f;
            public float LIZJ = 1.0f;
            public String LIZLLL = EnumC719760SLe.NORMAL.getPhotoViewStatus();

            @Override // X.C0STJ
            public final float LJFF() {
                SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2 = this.LJ;
                float f = smartImagePhotoViewHolderV2.LLJJIJIIJIL;
                float f2 = smartImagePhotoViewHolderV2.LLJJIJIL;
                if (f > 0.0f && f2 > 0.0f) {
                    float width = smartImagePhotoViewHolderV2.LLJLL.getWidth();
                    float height = this.LJ.LLJLL.getHeight();
                    if (width > 0.0f && height > 0.0f) {
                        float fX7 = c0slj.x7();
                        if (fX7 <= 0.0f) {
                            return 1.0f;
                        }
                        float f3 = fX7 * height;
                        float f4 = width / f;
                        float fMin = Math.min(f4, height / f2);
                        float fMin2 = Math.min(f4, f3 / f2);
                        if (fMin <= 0.0f) {
                            return 1.0f;
                        }
                        return fMin2 / fMin;
                    }
                }
                return 1.0f;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final kotlin.Pair<java.lang.Integer, java.lang.Integer> LJII() {
                /*
                    r3 = this;
                    com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2 r0 = r3.LJ
                    android.view.ViewGroup r0 = r0.LLJLL
                    android.view.ViewParent r1 = r0.getParent()
                    boolean r0 = r1 instanceof android.view.View
                    r2 = 0
                    if (r0 == 0) goto L3d
                    android.view.View r1 = (android.view.View) r1
                    if (r1 == 0) goto L3d
                    android.view.ViewParent r1 = r1.getParent()
                    boolean r0 = r1 instanceof android.view.ViewGroup
                    if (r0 == 0) goto L3d
                    android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                L1b:
                    boolean r0 = r1 instanceof X.C21600219g8
                    if (r0 == 0) goto L3c
                    X.19g8 r1 = (X.C21600219g8) r1
                    androidx.viewpager.widget.PagerAdapter r0 = r1.getAdapter()
                    if (r0 == 0) goto L3c
                    int r2 = r0.getCount()
                    int r0 = r1.getCurrentItem()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                    kotlin.Pair r2 = new kotlin.Pair
                    r2.<init>(r1, r0)
                L3c:
                    return r2
                L3d:
                    r1 = r2
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C719780SLg.LJII():kotlin.Pair");
            }

            @Override // X.C0STJ
            public final void LJJJIL() {
                String photoViewStatus;
                View viewFindViewById;
                Object next;
                View viewFindViewById2;
                this.LJ.LLLL = null;
                this.LJ.LJIL();
                this.LIZ = 1.0f;
                this.LIZIZ = false;
                this.LIZJ = this.LJ.LLJLLIL.getScaleX();
                if (this.LJ.LLJLLIL.LJIIIIZZ()) {
                    photoViewStatus = EnumC719760SLe.ZOOM_FIX.getPhotoViewStatus();
                } else {
                    C0STE c0ste = this.LJ.LLJLLIL.LLIZLLLIL;
                    photoViewStatus = (c0ste == null || c0ste.LLJL != EnumC719760SLe.CLEAR_MODE) ? EnumC719760SLe.NORMAL.getPhotoViewStatus() : EnumC719760SLe.CLEAR_MODE.getPhotoViewStatus();
                }
                this.LIZLLL = photoViewStatus;
                if (this.LJ.LJJL()) {
                    C719790SLh c719790SLh2 = this.LJ.LLJZ;
                    if (c719790SLh2.LIZIZ == null) {
                        ArrayList arrayList = new ArrayList();
                        View view2 = c719790SLh2.LIZ;
                        for (Object parent = view2.getParent(); parent instanceof ViewGroup; parent = ((View) parent).getParent()) {
                            arrayList.add(new C719820SLk(view2, view2.getTranslationZ(), view2.getOutlineProvider(), view2.getClipToOutline()));
                            view2.setTranslationZ(100.0f);
                            view2.setOutlineProvider(null);
                            view2.setClipToOutline(false);
                            view2 = (View) parent;
                        }
                        c719790SLh2.LIZIZ = arrayList;
                        Context context = c719790SLh2.LIZ.getContext();
                        int iN3 = C786410Ut5.n3(context.getResources(), "play_iv", FollowStatusChangeMethod.PARAM_UID, context.getPackageName());
                        if (iN3 != 0) {
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (Intrinsics.LJFF(((C719820SLk) next).LIZ.getClass().getSimpleName(), "VideoViewCellRootView")) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            C719820SLk c719820SLk = (C719820SLk) next;
                            View view3 = c719820SLk != null ? c719820SLk.LIZ : null;
                            if ((view3 instanceof ViewGroup) && view3 != null && (viewFindViewById2 = view3.findViewById(iN3)) != null) {
                                c719790SLh2.LIZJ = Float.valueOf(viewFindViewById2.getTranslationZ());
                                c719790SLh2.LIZLLL = viewFindViewById2;
                                viewFindViewById2.setTranslationZ(101.0f);
                            }
                        }
                        int iN32 = C786410Ut5.n3(context.getResources(), "digg_layout", FollowStatusChangeMethod.PARAM_UID, context.getPackageName());
                        if (iN32 != 0) {
                            View rootView = c719790SLh2.LIZ.getRootView();
                            if ((rootView instanceof ViewGroup) && rootView != null && (viewFindViewById = rootView.findViewById(iN32)) != null) {
                                c719790SLh2.LJ = Float.valueOf(viewFindViewById.getTranslationZ());
                                c719790SLh2.LJFF = viewFindViewById;
                                viewFindViewById.setTranslationZ(101.0f);
                            }
                        }
                    }
                    this.LJ.LLJZ.LIZ();
                }
                this.LJ.LJJJJL();
                C0SLS c0sls2 = this.LJ.LLJJLIIIJLLLLLLLZ;
                if (c0sls2 != null) {
                    c0sls2.LJJJIL();
                }
            }

            @Override // X.C0STJ
            public final PointF LLILIL() {
                return c0slj.LLILIL();
            }

            @Override // X.C0STJ
            public final void LLLL() {
                this.LJ.LJJJJL();
                c0slj.LLLL();
            }

            @Override // X.C0STJ
            public final boolean LIZIZ() {
                Pair<Integer, Integer> pairLJII = LJII();
                return pairLJII == null || pairLJII.getFirst().intValue() > 0;
            }

            @Override // X.C0STJ
            public final Float LIZJ() {
                if (!C0SKM.LJII()) {
                    return null;
                }
                float translationY = this.LJ.LLJLL.getTranslationY();
                if (this.LIZ < PinchToClearModeSettings.LIZ().enterScale) {
                    this.LJ.LLLL = null;
                    C786410Ut5.bd(0.0f, this.LJ.LLJLL);
                    this.LJ.LLLJ = false;
                    return Float.valueOf(-translationY);
                }
                Float fLJJJJI = this.LJ.LLLL;
                if (fLJJJJI == null) {
                    SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2 = this.LJ;
                    if (smartImagePhotoViewHolderV2.LLLJ && smartImagePhotoViewHolderV2.LLJLL.getTranslationY() != 0.0f) {
                        float translationY2 = smartImagePhotoViewHolderV2.LLJLL.getTranslationY();
                        smartImagePhotoViewHolderV2.LLLL = Float.valueOf(translationY2);
                        fLJJJJI = Float.valueOf(translationY2);
                        if (fLJJJJI == null) {
                            return null;
                        }
                    } else {
                        if ((smartImagePhotoViewHolderV2.LLLJ && smartImagePhotoViewHolderV2.LLJLL.getTranslationY() == 0.0f) || (fLJJJJI = smartImagePhotoViewHolderV2.LJJJJI()) == null) {
                            return null;
                        }
                        float fFloatValue = fLJJJJI.floatValue();
                        smartImagePhotoViewHolderV2.LLLL = Float.valueOf(fFloatValue);
                        C786410Ut5.bd(fFloatValue, smartImagePhotoViewHolderV2.LLJLL);
                        smartImagePhotoViewHolderV2.LLLJ = true;
                    }
                }
                return Float.valueOf(fLJJJJI.floatValue() - translationY);
            }

            @Override // X.C0STJ
            public final boolean LJ() {
                Pair<Integer, Integer> pairLJII = LJII();
                return pairLJII == null || pairLJII.getFirst().intValue() < pairLJII.getSecond().intValue() - 1;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
            @Override // X.C0STJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJI() {
                /*
                    r6 = this;
                    boolean r0 = X.C0SKM.LJII()
                    if (r0 == 0) goto L60
                    float r1 = r6.LIZ
                    com.ss.android.ugc.aweme.settings.PinchToClearModeSettings$PinchToClearModeSettingsModel r0 = com.ss.android.ugc.aweme.settings.PinchToClearModeSettings.LIZ()
                    float r0 = r0.enterScale
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L60
                    com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2 r5 = r6.LJ
                    X.0S9L r0 = r5.LLLLLJIL
                    r4 = 0
                    r3 = 0
                    if (r0 != 0) goto L73
                    monitor-enter(r5)
                    X.0S9L r0 = r5.LLLLLJIL     // Catch: java.lang.Throwable -> L5d
                    if (r0 != 0) goto L72
                    X.0QSJ r1 = r5.LLLLLL     // Catch: java.lang.Throwable -> L5d
                    if (r1 != 0) goto L3e
                    X.0Q7z r2 = r5.LLLLLJLJLL     // Catch: java.lang.Throwable -> L5d
                    if (r2 != 0) goto L2d
                    X.0Q7z r2 = X.C687700QyG.LJIIIZ(r5)     // Catch: java.lang.Throwable -> L5d
                    r5.LLLLLJLJLL = r2     // Catch: java.lang.Throwable -> L5d
                L2d:
                    r0 = 1
                    java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L5d
                    java.lang.Class<com.ss.android.ugc.aweme.scope.PhotoSlideScope> r0 = com.ss.android.ugc.aweme.scope.PhotoSlideScope.class
                    r1[r3] = r0     // Catch: java.lang.Throwable -> L5d
                    X.0QSJ r1 = X.C687700QyG.LIZLLL(r2, r1)     // Catch: java.lang.Throwable -> L5d
                    r5.LLLLLL = r1     // Catch: java.lang.Throwable -> L5d
                    if (r1 != 0) goto L3e
                    r0 = r4
                    goto L46
                L3e:
                    java.lang.Class<X.0S9L> r0 = X.C0S9L.class
                    java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L5d
                    X.0S9L r0 = (X.C0S9L) r0     // Catch: java.lang.Throwable -> L5d
                L46:
                    r5.LLLLLJIL = r0     // Catch: java.lang.Throwable -> L5d
                    monitor-exit(r5)     // Catch: java.lang.Throwable -> L5d
                    if (r0 != 0) goto L73
                    com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2 r0 = r6.LJ
                    com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility r0 = r0.LJJJZ()
                    if (r0 == 0) goto L76
                    X.0RtU r0 = r0.yn()
                    if (r0 == 0) goto L76
                    r0.LLJJIJIL(r4, r3, r3)
                    return
                L5d:
                    r0 = move-exception
                    monitor-exit(r5)
                    throw r0
                L60:
                    float r1 = r6.LIZ
                    com.ss.android.ugc.aweme.settings.PinchToClearModeSettings$PinchToClearModeSettingsModel r0 = com.ss.android.ugc.aweme.settings.PinchToClearModeSettings.LIZ()
                    float r0 = r0.enterScale
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 < 0) goto L76
                    X.0SLJ r0 = r3
                    r0.Ld()
                    return
                L72:
                    monitor-exit(r5)
                L73:
                    r0.LLJJIJIL(r4, r3, r3)
                L76:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C719780SLg.LJI():void");
            }

            @Override // X.C0STJ
            public final void LIZ(EnumC719760SLe enumC719760SLe) {
                c0slj.Na(this.LIZ, this.LIZIZ, enumC719760SLe);
            }

            @Override // X.C0STJ
            public final void LIZLLL(EnumC719760SLe enumC719760SLe) {
                this.LJ.LJIJJLI(this.LIZ, this.LIZIZ, enumC719760SLe, this.LIZJ, this.LIZLLL);
                if (this.LJ.LJJL()) {
                    int i2 = C719810SLj.LIZ[enumC719760SLe.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                this.LJ.LLJZ.LIZJ();
                                this.LJ.LLJZIJLIL.LJI();
                                this.LJ.LJJJJIZL();
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            C719840SLm c719840SLm = this.LJ.LLJZIJLIL;
                            if (c719840SLm.LIZLLL) {
                                c719840SLm.LJ();
                            }
                        }
                    } else {
                        this.LJ.LLJLLL.LIZJ();
                        this.LJ.LLJLLL.LJ();
                        this.LJ.LLJZ.LIZJ();
                        this.LJ.LLJZ.LIZIZ();
                        this.LJ.LLJZIJLIL.LJII();
                        this.LJ.LJJJJIZL();
                    }
                } else {
                    int i3 = C719810SLj.LIZ[enumC719760SLe.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                this.LJ.LLJLLL.LIZJ();
                                this.LJ.LLJLLL.LJ();
                                this.LJ.LLJZIJLIL.LJI();
                                this.LJ.LJJJJIZL();
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            C719840SLm c719840SLm2 = this.LJ.LLJZIJLIL;
                            if (c719840SLm2.LIZLLL) {
                                c719840SLm2.LJ();
                            }
                        }
                    } else {
                        this.LJ.LLJLLL.LIZJ();
                        this.LJ.LLJLLL.LJ();
                        this.LJ.LLJZIJLIL.LJII();
                        Float f = this.LJ.LLLL;
                        if (f != null) {
                            C786410Ut5.bd(f.floatValue(), this.LJ.LLJLL);
                        }
                        this.LJ.LJJJJIZL();
                    }
                }
                C0SLS c0sls2 = this.LJ.LLJJLIIIJLLLLLLLZ;
                if (c0sls2 != null) {
                    c0sls2.LJZL();
                }
            }

            @Override // X.C0STJ
            public final void n(float f) {
                c0slj.n(f);
            }

            @Override // X.C0STJ
            public final void onScale(float f) {
                if (f >= 1.01f) {
                    this.LJ.LJJ();
                }
                if (this.LIZ > f) {
                    this.LIZIZ = true;
                }
                this.LIZ = f;
            }
        };
        this.LLLLJI = r7;
        C0STW c0stw = new C0STW() { // from class: X.0SLu
            @Override // X.C0STW
            public final void LIZ(Drawable drawable) {
                C0SM0 c0sm0;
                BitmapDrawable bitmapDrawable;
                Bitmap bitmap;
                C0SKZ c0skzInvoke;
                SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2 = this.LIZ;
                if (drawable instanceof C1317740kOa) {
                    c0sm0 = C0SM0.BLUR_PLACEHOLDER;
                } else {
                    c0sm0 = C0SM0.COVER_PLACEHOLDER;
                }
                smartImagePhotoViewHolderV2.LLJJIJI = c0sm0;
                C719890SLr c719890SLr = smartImagePhotoViewHolderV2.LLLLIL.LJJII;
                if (!c719890SLr.LJIILL || c0sm0 != C0SM0.BLUR_PLACEHOLDER) {
                    c719890SLr.LIZJ();
                }
                if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                    SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV22 = this.LIZ;
                    smartImagePhotoViewHolderV22.LLJJIII = bitmap;
                    Function0<C0SKZ> function03 = smartImagePhotoViewHolderV22.LLJL;
                    if (function03 != null && (c0skzInvoke = function03.invoke()) != null) {
                        c0skzInvoke.LIZ(this.LIZ.LLILLL);
                    }
                    if (this.LIZ.LLJJIJI == C0SM0.BLUR_PLACEHOLDER) {
                        return;
                    }
                    this.LIZ.LJJIL(null, bitmap.getWidth(), bitmap.getHeight(), true);
                }
            }
        };
        viewGroup2.setOnTouchListener(c0stf);
        if (viewGroup != null) {
            IPhotoSlidesAbility iPhotoSlidesAbilityLJJJZ = LJJJZ();
            boolean z2 = (iPhotoSlidesAbilityLJJJZ == null || (interfaceC710220RtUYn = iPhotoSlidesAbilityLJJJZ.yn()) == null || !interfaceC710220RtUYn.LJIILJJIL() || c0sm7.SC()) ? false : true;
            boolean zSC = c0sm7.SC();
            c0stf.getClass();
            c0stf.LLIZLLLIL = new C0STE(c0stf, viewGroup2, viewGroup, r7, interfaceC720380SNo, z2, zSC);
            C1331070kk5 hierarchy = c0stf.getHierarchy();
            if ((hierarchy instanceof C0STV) && (c0stv = (C0STV) hierarchy) != null) {
                c0stv.LJII = c0stw;
            }
            if (c0sqh != null) {
                AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(this, 15);
                Context context = c0sqh.getContext();
                if (context != null) {
                    c0sqg = new C0SQG(context, awS590S0100000_11);
                } else {
                    c0sqg = null;
                }
                c0sqh.LLIZ = c0sqg;
            }
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJJI() && (viewStub = (ViewStub) view.findViewById(R.id.wzf)) != null) {
            this.LLLLL = c19252910Tv.LIZLLL().LJIJI().LLILZ(viewStub, C960203pA.LIZ(R.attr.bn, this.LLJIJIL));
        }
        c0stf.setPinchEnabled(false);
    }
}
