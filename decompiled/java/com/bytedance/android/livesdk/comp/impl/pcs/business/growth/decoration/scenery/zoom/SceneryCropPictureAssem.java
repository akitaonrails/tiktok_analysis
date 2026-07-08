package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.zoom;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1791130wi7;
import X.C1791140wi8;
import X.C1791150wi9;
import X.C1818730xQd;
import X.C1819050xR9;
import X.C1831580xlM;
import X.C1831590xlN;
import X.C1831600xlO;
import X.C1831610xlP;
import X.C1831670xlV;
import X.C1831740xlc;
import X.C1831750xld;
import X.C1831760xle;
import X.C1831770xlf;
import X.C1831780xlg;
import X.C1831790xlh;
import X.C1831800xli;
import X.C1831820xlk;
import X.C1836120xsg;
import X.C1840270xzN;
import X.C19719912Dl;
import X.C21513519Hh;
import X.C2217381BqS;
import X.C452501pT;
import X.C497740JfY;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.typechunk.SceneryLayoutTypeViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.operationbtm.viewmodel.SceneryModeOperationListViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.zoom.SceneryCropPictureAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class SceneryCropPictureAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public Rect LLJJIJI;
    public Rect LLJJIJIIJIL;
    public C1836120xsg LLJJIJIL;
    public Rect LLJJJ;
    public Bitmap LLJJJJLIIL;
    public Bitmap LLJJL;
    public Bitmap LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final AssemVMLazy LLJLLIL;
    public final AssemVMLazy LLJLLL;
    public final AssemVMLazy LLJZ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new C1831790xlh(this));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new C1831780xlg(this));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new C1831770xlf(this));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new C1831800xli(this));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new C1819050xR9());
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C1831740xlc(this));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new C1831750xld(this));
    public final C01GW LLJLL = C452501pT.LIZIZ(new C1831760xle(this));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SceneryCropPictureAssem.class, "sceneryPictureViewModel", "getSceneryPictureViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/layout/imageselector/picturechunk/SceneryPictureViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SceneryCropPictureAssem.class, "sceneryLayoutTypeViewModel", "getSceneryLayoutTypeViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/layout/imageselector/typechunk/SceneryLayoutTypeViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SceneryCropPictureAssem.class, "sceneryModeOperationListViewModel", "getSceneryModeOperationListViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/operationbtm/viewmodel/SceneryModeOperationListViewModel;", 0);
        c09r3.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public SceneryCropPictureAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SceneryPictureViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C1791130wi7(c19719912DlLIZ), new C1831580xlM(), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SceneryLayoutTypeViewModel.class);
        this.LLJLLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C1791140wi8(c19719912DlLIZ2), new C1831590xlN(), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SceneryModeOperationListViewModel.class);
        this.LLJZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new C1791150wi9(c19719912DlLIZ3), new C1831600xlO(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ggk;
    }

    public final int getScreenWidth() {
        return ((Number) this.LLJLILLLLZIIL.getValue()).intValue();
    }

    public final int kp() {
        return ((Number) this.LLJLIL.getValue()).intValue();
    }

    public final C21513519Hh lp() {
        return (C21513519Hh) this.LLJJJIL.getValue();
    }

    public final C1836120xsg mp() {
        return (C1836120xsg) this.LLJJIII.getValue();
    }

    public final C1836120xsg op() {
        return (C1836120xsg) this.LLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1836120xsg c1836120xsgMp = mp();
        ValueAnimator valueAnimator = c1836120xsgMp.LLILLL;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(c1836120xsgMp.LLJILJIL);
            c1836120xsgMp.LLILLL.removeListener(c1836120xsgMp.LLJILJILJ);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((C1840270xzN) this.LLJJJJ.getValue()).setIntercepter(new C1831820xlk() { // from class: X.0xlU
            @Override // X.InterfaceC1840280xzO
            public final void LJJJJ(MotionEvent motionEvent) {
                Rect visibleRect;
                this.LIZ.LLJL = true;
                if (motionEvent != null) {
                    if (motionEvent.getAction() == 0) {
                        C1836120xsg c1836120xsg = this.LIZ.LLJJIJIL;
                        if (c1836120xsg != null) {
                            ValueAnimator valueAnimator = c1836120xsg.LLILLL;
                            if (valueAnimator != null && valueAnimator.isStarted()) {
                                c1836120xsg.LLILLL.cancel();
                            }
                            if (Math.abs(c1836120xsg.LLJ - 0.25f) >= Float.MIN_NORMAL) {
                                c1836120xsg.LLJ = 0.25f;
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1836120xsg);
                                c1836120xsg.setAlpha(0.25f);
                                c1836120xsg.postInvalidate();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (motionEvent.getAction() != 1) {
                        return;
                    }
                    SceneryCropPictureAssem sceneryCropPictureAssem = this.LIZ;
                    if (sceneryCropPictureAssem.LLJJJ == null) {
                        C1836120xsg c1836120xsg2 = sceneryCropPictureAssem.LLJJIJIL;
                        if (c1836120xsg2 != null) {
                            visibleRect = c1836120xsg2.getVisibleRect();
                        } else {
                            visibleRect = null;
                        }
                        sceneryCropPictureAssem.LLJJJ = visibleRect;
                    }
                    C1836120xsg c1836120xsg3 = this.LIZ.LLJJIJIL;
                    if (c1836120xsg3 != null) {
                        c1836120xsg3.LIZ();
                    }
                    C21513519Hh c21513519HhLp = this.LIZ.lp();
                    final SceneryCropPictureAssem sceneryCropPictureAssem2 = this.LIZ;
                    HandlerHook.viewPostDelay(c21513519HhLp, new Runnable() { // from class: X.0xlS
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("SceneryCropPictureAssem@68eb.initContainer$1$1$onInterceptTouchEvent$1");
                            try {
                                SceneryCropPictureAssem sceneryCropPictureAssem3 = sceneryCropPictureAssem2;
                                sceneryCropPictureAssem3.LLJJLIIIJLLLLLLLZ = sceneryCropPictureAssem3.hp(sceneryCropPictureAssem3.lp(), sceneryCropPictureAssem2.LLJJJJLIIL);
                                SceneryCropPictureAssem sceneryCropPictureAssem4 = sceneryCropPictureAssem2;
                                sceneryCropPictureAssem4.LLJJL = sceneryCropPictureAssem4.ip(sceneryCropPictureAssem4.LLJJLIIIJLLLLLLLZ, null);
                                SceneryCropPictureAssem sceneryCropPictureAssem5 = sceneryCropPictureAssem2;
                                Bitmap bitmap = sceneryCropPictureAssem5.LLJJL;
                                if (bitmap != null) {
                                    AssemVMLazy assemVMLazy = sceneryCropPictureAssem5.LLJLLIL;
                                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SceneryCropPictureAssem.LLJZIJLIL;
                                    ((SceneryPictureViewModel) assemVMLazy.getValue()).xQ2(bitmap);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("SceneryCropPictureAssem@68eb.initContainer$1$1$onInterceptTouchEvent$1");
                        }
                    }, 310L);
                }
            }
        });
        if (getContext() != null) {
            lp().setEnableDoubleTap(false);
            op().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0xla
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    SceneryCropPictureAssem sceneryCropPictureAssem = this.LL;
                    if (sceneryCropPictureAssem.LLJJIJI == null) {
                        sceneryCropPictureAssem.LLJJIJI = sceneryCropPictureAssem.op().getVisibleRect();
                        this.LL.lp().setDisplayWindowRect(this.LL.LLJJIJI);
                    }
                }
            });
            mp().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0xlb
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    SceneryCropPictureAssem sceneryCropPictureAssem = this.LL;
                    if (sceneryCropPictureAssem.LLJJIJIIJIL == null) {
                        sceneryCropPictureAssem.LLJJIJIIJIL = sceneryCropPictureAssem.mp().getVisibleRect();
                        this.LL.lp().setDisplayWindowRect(this.LL.LLJJIJIIJIL);
                    }
                }
            });
        }
        if (getContext() != null) {
            C1836120xsg c1836120xsgOp = op();
            c1836120xsgOp.LLILZIL = 0;
            c1836120xsgOp.LLILZLL = ((int) C497740JfY.LIZIZ(227.0f)) / C497740JfY.LJIIZILJ();
            c1836120xsgOp.LLJIJIL = 0;
            c1836120xsgOp.LLILZ = 0;
            C497740JfY.LIZIZ(8.0f);
            HandlerHook.viewPostDelay(c1836120xsgOp, new Runnable() { // from class: X.0xlX
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SceneryCropPictureAssem@68eb.updateCropView$1$1");
                    try {
                        SceneryCropPictureAssem sceneryCropPictureAssem = this.LL;
                        if (!sceneryCropPictureAssem.LLJL) {
                            sceneryCropPictureAssem.op().LIZ();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SceneryCropPictureAssem@68eb.updateCropView$1$1");
                }
            }, Mp4ScreenVideoLoadTimeout.CONTROL);
            final C1836120xsg c1836120xsgMp = mp();
            HandlerHook.viewPost(c1836120xsgMp, new Runnable() { // from class: X.0xlR
                public final void LIZ() {
                    float fIntValue;
                    int screenWidth;
                    if (this.LL.getContentView().getMeasuredHeight() != 0) {
                        fIntValue = this.LL.LJJIJL().getMeasuredHeight();
                        screenWidth = this.LL.LJJIJL().getMeasuredWidth();
                    } else {
                        fIntValue = ((Number) this.LL.LLJLL.getValue()).intValue();
                        screenWidth = this.LL.getScreenWidth();
                    }
                    C1836120xsg c1836120xsg = c1836120xsgMp;
                    c1836120xsg.LLILZIL = 0;
                    c1836120xsg.LLILZLL = fIntValue / screenWidth;
                    this.LL.getClass();
                    c1836120xsg.LLJIJIL = 0;
                    this.LL.getClass();
                    c1836120xsg.LLILZ = 0;
                    C497740JfY.LIZIZ(8.0f);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SceneryCropPictureAssem@68eb.updateCropView$2$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SceneryCropPictureAssem@68eb.updateCropView$2$1");
                }
            });
            HandlerHook.viewPostDelay(c1836120xsgMp, new Runnable() { // from class: X.0xlY
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SceneryCropPictureAssem@68eb.updateCropView$2$2");
                    try {
                        SceneryCropPictureAssem sceneryCropPictureAssem = this.LL;
                        if (!sceneryCropPictureAssem.LLJL) {
                            sceneryCropPictureAssem.mp().LIZ();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SceneryCropPictureAssem@68eb.updateCropView$2$2");
                }
            }, Mp4ScreenVideoLoadTimeout.CONTROL);
        }
        AssemVMLazy assemVMLazy = this.LLJZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xQt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1818830xQn) obj).LLILLJJLI;
            }
        }, null, new C1818730xQd(this), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0xR4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C612620O1c) obj).LLILLL;
            }
        }, null, new C1831610xlP(this), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0xQT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1735840vGw) obj).LLILLJJLI);
            }
        }, null, new C1831670xlV(this), 6);
    }

    public final Bitmap hp(C21513519Hh c21513519Hh, Bitmap bitmap) {
        if (bitmap == null) {
            return bitmap;
        }
        RectF rectFLIZLLL = c21513519Hh.LIZLLL(null);
        if (this.LLJJJ == null) {
            return bitmap;
        }
        float width = bitmap.getWidth() / rectFLIZLLL.width();
        float height = bitmap.getHeight() / rectFLIZLLL.height();
        int i = (int) ((r6.left - rectFLIZLLL.left) * width);
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        int i3 = (int) ((r6.top - rectFLIZLLL.top) * height);
        if (i3 >= 0) {
            i2 = i3;
        }
        int iWidth = (int) (r6.width() * width);
        int width2 = bitmap.getWidth() - i;
        if (iWidth > width2) {
            iWidth = width2;
        }
        int iHeight = (int) (r6.height() * height);
        int height2 = bitmap.getHeight() - i2;
        if (iHeight > height2) {
            iHeight = height2;
        }
        try {
            return Bitmap.createBitmap(bitmap, i, i2, iWidth, iHeight);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return bitmap;
        }
    }

    public final Bitmap ip(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmap3 = this.LLJJL;
        if (bitmap != null) {
            Bitmap bitmap4 = this.LLJJLIIIJLLLLLLLZ;
            bitmap.getConfig();
            return bitmap4;
        }
        return bitmap3;
    }
}
