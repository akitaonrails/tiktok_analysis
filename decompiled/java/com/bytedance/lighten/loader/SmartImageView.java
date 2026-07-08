package com.bytedance.lighten.loader;

import X.C03IT;
import X.C0STY;
import X.C1260120ite;
import X.C1320810kTX;
import X.C1322110kVd;
import X.C1322200kVm;
import X.C1323010kX5;
import X.C1323050kX9;
import X.C1325710kbR;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1331510kkn;
import X.C1331530kkp;
import X.C1331730kl9;
import X.C1331920klS;
import X.C1332160klq;
import X.EnumC1203020hPY;
import X.EnumC1321320kUM;
import X.EnumC1338240kve;
import X.InterfaceC1332070klh;
import X.InterfaceC1334290kpH;
import X.InterfaceC1335960kry;
import X.InterfaceC427850Gq7;
import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class SmartImageView extends C1322110kVd implements InterfaceC1334290kpH, InterfaceC1335960kry {
    public static final /* synthetic */ int LLIZ = 0;
    public WeakReference<InterfaceC1332070klh> LL;
    public volatile C1331530kkp LLILLJJLI;
    public String LLILLL;
    public C1323050kX9<Bitmap> LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    public static void setIsRemoveLog(boolean z) {
    }

    public void LIZJ() {
    }

    @Override // X.InterfaceC1334290kpH
    public InterfaceC1335960kry getSmartHierarchy() {
        return this;
    }

    public final boolean LIZLLL() {
        return this.LLILLJJLI != null && this.LLILLJJLI.LJI;
    }

    public final void LJI() {
        Animatable animatableLIZ;
        InterfaceC1332070klh interfaceC1332070klh;
        if (getController() == null || this.LLILLJJLI == null || !this.LLILZIL || !this.LLILLJJLI.LJFF || !this.LLILZLL || (animatableLIZ = getController().LIZ()) == null || animatableLIZ.isRunning()) {
            return;
        }
        animatableLIZ.start();
        WeakReference<InterfaceC1332070klh> weakReference = this.LL;
        if (weakReference == null || (interfaceC1332070klh = weakReference.get()) == null) {
            return;
        }
        interfaceC1332070klh.LIZ();
    }

    public final void LJII() {
        Animatable animatableLIZ;
        InterfaceC1332070klh interfaceC1332070klh;
        if (getController() == null || (animatableLIZ = getController().LIZ()) == null || !animatableLIZ.isRunning()) {
            return;
        }
        animatableLIZ.stop();
        WeakReference<InterfaceC1332070klh> weakReference = this.LL;
        if (weakReference == null || (interfaceC1332070klh = weakReference.get()) == null) {
            return;
        }
        interfaceC1332070klh.LIZ();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        Drawable drawable;
        boolean zLJI = MethodIDManager.LJI(71623);
        if (C1332160klq.LJIIIZ().LIZJ() && getVisibility() == 0 && (drawable = getDrawable()) != null) {
            drawable.setVisible(true, false);
        }
        super.onAttachedToWindow();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public String getAnimPreviewFrameCacheKey() {
        return this.LLILLL;
    }

    public SmartImageView(Context context) {
        super(context);
        LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [REQUEST, X.0kbR] */
    public void LIZ(final C1331510kkn c1331510kkn) {
        String str;
        String str2;
        boolean z = false;
        if (c1331510kkn.LJJIJLIJ) {
            C03IT c03it = c1331510kkn.LJJJI;
            if (c03it != null && !c03it.LIZ()) {
                this.LLILLL = (String) ListProtector.get(c1331510kkn.LJJJI.LIZ, 0);
            } else {
                this.LLILLL = c1331510kkn.LIZ.toString();
            }
            C1260120ite.LIZIZ(new ARunnableS110S0100000_10(this, 94));
        }
        C03IT c03it2 = c1331510kkn.LJJJI;
        REQUEST requestBuildImageRequest = 0;
        requestBuildImageRequest = 0;
        requestBuildImageRequest = 0;
        REQUEST requestBuildImageRequest2 = 0;
        requestBuildImageRequest = 0;
        requestBuildImageRequest = 0;
        if (c03it2 != null && !c03it2.LIZ()) {
            C1325710kbR[] c1325710kbRArrBuildImageRequests = FrescoImageLoaderImpl.buildImageRequests(c1331510kkn);
            C1332160klq c1332160klqLJIIIZ = C1332160klq.LJIIIZ();
            if (c1332160klqLJIIIZ.LIZIZ.LJJJ.LIZ() != null && ((Boolean) c1332160klqLJIIIZ.LIZIZ.LJJJ.LIZ()).booleanValue() && (str2 = c1331510kkn.LIZIZ) != null) {
                requestBuildImageRequest2 = FrescoImageLoaderImpl.buildImageRequest(c1331510kkn, UriProtector.parse(str2));
            }
            if (c1325710kbRArrBuildImageRequests.length != 0) {
                final C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJIILJJIL = getController();
                c1320810kTXLIZJ.LJIIJJI = c1331510kkn.LIZLLL;
                if (c1331510kkn.LJJJ != null) {
                    z = true;
                }
                c1320810kTXLIZJ.LJIIJ = z;
                c1320810kTXLIZJ.LIZJ = c1331510kkn.LJJIIJ;
                c1320810kTXLIZJ.LJ = requestBuildImageRequest2;
                c1320810kTXLIZJ.LJFF(c1325710kbRArrBuildImageRequests, true);
                if (!TextUtils.isEmpty(c1331510kkn.LJJIIJ)) {
                    c1320810kTXLIZJ.LIZJ = c1331510kkn.LJJIIJ;
                }
                if (this.LLILLJJLI != null) {
                    this.LLILLJJLI.LJIIJJI(c1331510kkn);
                    c1320810kTXLIZJ.LJIIIIZZ = this.LLILLJJLI;
                } else {
                    this.LLILLJJLI = new C1331530kkp();
                    this.LLILLJJLI.LJIIJJI(c1331510kkn);
                    c1320810kTXLIZJ.LJIIIIZZ = this.LLILLJJLI;
                }
                C0STY.LIZ.execute(new Runnable() { // from class: X.0kkr
                    public final void LIZ() {
                        Drawable drawable;
                        int i;
                        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
                        this.LLILLL.LLILLJJLI.LJIIIIZZ = abstractC1320710kTNLIZ;
                        abstractC1320710kTNLIZ.LJ(new C1330570kjH(c1331510kkn));
                        this.LLILLL.setController(abstractC1320710kTNLIZ);
                        if (!TextUtils.isEmpty(c1331510kkn.LJJJJLI)) {
                            C1331510kkn c1331510kkn2 = c1331510kkn;
                            int i2 = c1331510kkn2.LJJJJL;
                            if (i2 <= 0 || (i = c1331510kkn2.LJJJJLL) <= 0) {
                                this.LLILLL.setBlurHashImage(c1331510kkn2.LJJJJLI, new C1318160kPG(20, 20));
                            } else {
                                this.LLILLL.setBlurHashImage(c1331510kkn2.LJJJJLI, new C1318160kPG(c1331510kkn2.LJJJLL, c1331510kkn2.LJJJLIIL, i2, i, c1331510kkn2.LJJJJZ, c1331510kkn2.LJJJJZI));
                            }
                        } else if (!TextUtils.isEmpty(c1331510kkn.LJJJLZIJ)) {
                            SmartImageView smartImageView = this.LLILLL;
                            C1331510kkn c1331510kkn3 = c1331510kkn;
                            smartImageView.setPreviewHashImage(c1331510kkn3.LJJJLZIJ, new C1316650kMp(c1331510kkn3.LJJJZ, c1331510kkn3.LJJL, c1331510kkn3.LJJJJZ, c1331510kkn3.LJJJJZI));
                        }
                        if (C1332160klq.LJIIIZ().LIZJ() && this.LLILLL.isAttachedToWindow()) {
                            if (this.LLILLL.getVisibility() == 0 && (drawable = this.LLILLL.getDrawable()) != null) {
                                drawable.setVisible(true, false);
                            }
                            this.LLILLL.onAttach();
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SmartImageView@7106.setController$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SmartImageView@7106.setController$1");
                    }
                });
                return;
            }
            return;
        }
        ?? BuildImageRequest = FrescoImageLoaderImpl.buildImageRequest(c1331510kkn, c1331510kkn.LIZ);
        C1332160klq c1332160klqLJIIIZ2 = C1332160klq.LJIIIZ();
        if (c1332160klqLJIIIZ2.LIZIZ.LJJJ.LIZ() != null && ((Boolean) c1332160klqLJIIIZ2.LIZIZ.LJJJ.LIZ()).booleanValue() && (str = c1331510kkn.LIZIZ) != null) {
            requestBuildImageRequest = FrescoImageLoaderImpl.buildImageRequest(c1331510kkn, UriProtector.parse(str));
        }
        final C1320810kTX c1320810kTXLIZJ2 = C1322200kVm.LIZJ();
        c1320810kTXLIZJ2.LJIILJJIL = getController();
        c1320810kTXLIZJ2.LJIIJJI = c1331510kkn.LIZLLL;
        if (c1331510kkn.LJJJ != null) {
            z = true;
        }
        c1320810kTXLIZJ2.LJIIJ = z;
        c1320810kTXLIZJ2.LJ = requestBuildImageRequest;
        c1320810kTXLIZJ2.LIZLLL = BuildImageRequest;
        if (!TextUtils.isEmpty(c1331510kkn.LJJIIJ)) {
            c1320810kTXLIZJ2.LIZJ = c1331510kkn.LJJIIJ;
        }
        if (this.LLILLJJLI != null) {
            this.LLILLJJLI.LJIIJJI(c1331510kkn);
            c1320810kTXLIZJ2.LJIIIIZZ = this.LLILLJJLI;
        } else {
            this.LLILLJJLI = new C1331530kkp();
            this.LLILLJJLI.LJIIJJI(c1331510kkn);
            c1320810kTXLIZJ2.LJIIIIZZ = this.LLILLJJLI;
        }
        C0STY.LIZ.execute(new Runnable() { // from class: X.0kks
            public final void LIZ() {
                Drawable drawable;
                int i;
                AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ2.LIZ();
                this.LLILLL.LLILLJJLI.LJIIIIZZ = abstractC1320710kTNLIZ;
                abstractC1320710kTNLIZ.LJ(new C1330570kjH(c1331510kkn));
                this.LLILLL.setController(abstractC1320710kTNLIZ);
                if (!TextUtils.isEmpty(c1331510kkn.LJJJJLI)) {
                    C1331510kkn c1331510kkn2 = c1331510kkn;
                    int i2 = c1331510kkn2.LJJJJL;
                    if (i2 <= 0 || (i = c1331510kkn2.LJJJJLL) <= 0) {
                        this.LLILLL.setBlurHashImage(c1331510kkn2.LJJJJLI, new C1318160kPG(20, 20));
                    } else {
                        this.LLILLL.setBlurHashImage(c1331510kkn2.LJJJJLI, new C1318160kPG(c1331510kkn2.LJJJLL, c1331510kkn2.LJJJLIIL, i2, i, c1331510kkn2.LJJJJZ, c1331510kkn2.LJJJJZI));
                    }
                } else if (!TextUtils.isEmpty(c1331510kkn.LJJJLZIJ)) {
                    SmartImageView smartImageView = this.LLILLL;
                    C1331510kkn c1331510kkn3 = c1331510kkn;
                    smartImageView.setPreviewHashImage(c1331510kkn3.LJJJLZIJ, new C1316650kMp(c1331510kkn3.LJJJZ, c1331510kkn3.LJJL, c1331510kkn3.LJJJJZ, c1331510kkn3.LJJJJZI));
                }
                if (C1332160klq.LJIIIZ().LIZJ() && this.LLILLL.isAttachedToWindow()) {
                    if (this.LLILLL.getVisibility() == 0 && (drawable = this.LLILLL.getDrawable()) != null) {
                        drawable.setVisible(true, false);
                    }
                    this.LLILLL.onAttach();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SmartImageView@7106.setController$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SmartImageView@7106.setController$2");
            }
        });
    }

    @Override // X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setActualImageScaleType(EnumC1338240kve enumC1338240kve) {
        if (enumC1338240kve != null) {
            getHierarchy().LJIIZILJ(C1323010kX5.LIZ(enumC1338240kve));
        }
    }

    public void setAnimationListener(InterfaceC1332070klh interfaceC1332070klh) {
        this.LL = new WeakReference<>(interfaceC1332070klh);
    }

    public void setAttached(boolean z) {
        this.LLILZIL = z;
    }

    public void setCircleOptions(C1331730kl9 c1331730kl9) {
        C1331100kk8 c1331100kk8;
        EnumC1321320kUM enumC1321320kUM;
        if (c1331730kl9 == null) {
            return;
        }
        if (getHierarchy().LIZJ != null) {
            c1331100kk8 = getHierarchy().LIZJ;
        } else {
            c1331100kk8 = new C1331100kk8();
        }
        C1331920klS c1331920klS = c1331730kl9.LJI;
        if (c1331920klS != null) {
            c1331100kk8.LJI(c1331920klS.LIZ, c1331920klS.LIZIZ, c1331920klS.LIZJ, c1331920klS.LIZLLL);
        }
        c1331100kk8.LIZIZ = c1331730kl9.LIZLLL;
        c1331100kk8.LJII(c1331730kl9.LJ);
        c1331100kk8.LJFF(c1331730kl9.LIZ);
        c1331100kk8.LJFF = c1331730kl9.LIZIZ;
        c1331100kk8.LJIIIIZZ(c1331730kl9.LIZJ);
        c1331100kk8.LJIIIZ(c1331730kl9.LJFF);
        if (c1331730kl9.LJII == EnumC1203020hPY.OVERLAY_COLOR) {
            enumC1321320kUM = EnumC1321320kUM.OVERLAY_COLOR;
        } else {
            enumC1321320kUM = EnumC1321320kUM.BITMAP_ONLY;
        }
        c1331100kk8.LIZ = enumC1321320kUM;
        getHierarchy().LJJIII(c1331100kk8);
    }

    public void setImageDisplayListener(InterfaceC427850Gq7 interfaceC427850Gq7) {
        if (this.LLILLJJLI != null) {
            this.LLILLJJLI.LIZJ = interfaceC427850Gq7;
        }
    }

    @Override // X.InterfaceC1335960kry
    public void setPlaceholderImage(int i) {
        if (i > 0) {
            getHierarchy().LJJ(i);
        }
    }

    public void setUserVisibleHint(boolean z) {
        this.LLILZLL = z;
    }

    @Override // X.InterfaceC1335960kry
    public void setPlaceholderImage(Drawable drawable) {
        getHierarchy().LJIJ(drawable, 1);
    }

    public SmartImageView(Context context, C1331070kk5 c1331070kk5) {
        super(context, c1331070kk5);
        setHierarchy(c1331070kk5);
        LIZJ();
    }

    public SmartImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LIZJ();
    }

    public SmartImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LIZJ();
    }
}
