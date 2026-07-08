package com.ss.android.ugc.gamora.layout;

import X.C097U;
import X.C0L9K;
import X.C0LDD;
import X.C0MSD;
import X.C0MSE;
import X.C0MSF;
import X.C0MSG;
import X.C0MSI;
import X.C2356009La;
import X.C786410Ut5;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyClip;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.vesdk.VEUtils;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LayoutNLETrackStub implements Handler.Callback {
    public final NLEModel LL;
    public final C0LDD LLILLJJLI;
    public final LayoutNLETrackStub$callbackHandler$1 LLILLL;
    public final NLESegmentVideo LLILZ;
    public final NLETrack LLILZIL;
    public final NLETrackSlot LLILZLL;
    public final NLEStyClip LLIZ;
    public C0MSI LLIZLLLIL;
    public final Rect LLJ;
    public int LLJI;
    public int LLJIJIL;
    public long LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public Runnable LLJJIII;
    public boolean LLJJIJI;
    public float LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final Rect LLJJJIL;
    public final C0MSE LLJJJJ;
    public C0MSD LLJJJJJIL;

    public final void LIZIZ() {
        boolean z;
        NLEStyClip nLEStyClip;
        if (this.LLJJJ) {
            if (!this.LLJJIJI) {
                this.LL.removeTrack(this.LLILZIL);
                this.LLILLJJLI.LIZIZ(this.LL);
                C786410Ut5.LJLILLLLZI(this.LLILLL, 3);
                if (this.LLJJIII != null) {
                    C786410Ut5.LJLILLLLZI(this.LLILLL, 4);
                    return;
                }
                return;
            }
            if (this.LLJ.width() <= 0 || this.LLJ.height() <= 0 || this.LLJJJIL.width() <= 0 || this.LLJJJIL.height() <= 0) {
                return;
            }
            float fWidth = this.LLJ.width();
            float fHeight = this.LLJ.height();
            NLESegmentVideo nLESegmentVideo = this.LLILZ;
            Rect rect = this.LLJJJIL;
            int i = this.LLJJ;
            int i2 = this.LLJJI;
            float f = this.LLJILJILJ;
            C0MSE c0mse = this.LLJJJJ;
            int i3 = this.LLJI;
            int i4 = this.LLJIJIL;
            c0mse.LIZ = false;
            C0MSG c0msg = c0mse.LJIIIIZZ;
            C0MSG c0msg2 = c0mse.LJI;
            c0msg.getClass();
            c0msg.LIZIZ = c0msg2.LIZIZ;
            c0msg.LIZ = c0msg2.LIZ;
            c0msg.LIZJ.set(c0msg2.LIZJ);
            c0mse.LIZIZ = C0MSF.NONE;
            if (i3 <= 0 || i4 <= 0) {
                z = false;
            } else {
                float fWidth2 = rect.width();
                float fHeight2 = rect.height();
                float f2 = i3;
                float f3 = i4;
                float f4 = f2 / f3;
                if (fWidth2 / fHeight2 >= f4) {
                    c0mse.LIZIZ = C0MSF.FILL_WIDTH;
                    C0MSE.LIZ(c0mse.LJII, rect, f);
                    float fWidth3 = c0mse.LJII.width() * (f3 / f2);
                    float fCenterY = c0mse.LJII.centerY();
                    RectF rectF = c0mse.LJII;
                    float f5 = fWidth3 / 2.0f;
                    rectF.top = fCenterY - f5;
                    rectF.bottom = fCenterY + f5;
                } else {
                    c0mse.LIZIZ = C0MSF.FILL_HEIGHT;
                    C0MSE.LIZ(c0mse.LJII, rect, f);
                    float fHeight3 = c0mse.LJII.height() * f4;
                    float fCenterX = c0mse.LJII.centerX();
                    RectF rectF2 = c0mse.LJII;
                    float f6 = fHeight3 / 2.0f;
                    rectF2.left = fCenterX - f6;
                    rectF2.right = fCenterX + f6;
                }
                float f7 = c0mse.LJIIIZ + i;
                float f8 = c0mse.LJIIJ + i2;
                float fAbs = ((int) Math.abs(c0mse.LJII.width() - rect.width())) >> 1;
                float fAbs2 = ((int) Math.abs(c0mse.LJII.height() - rect.height())) >> 1;
                if (i < 0) {
                    float f9 = -fAbs;
                    if (f7 <= f9) {
                        f7 = f9;
                    }
                } else if (i > 0 && f7 >= fAbs) {
                    f7 = fAbs;
                }
                c0mse.LJIIIZ = f7;
                if (i2 < 0) {
                    float f10 = -fAbs2;
                    if (f8 <= f10) {
                        f8 = f10;
                    }
                } else if (i2 > 0 && f8 >= fAbs2) {
                    f8 = fAbs2;
                }
                c0mse.LJIIJ = f8;
                float fHeight4 = fHeight2 / c0mse.LJII.height();
                float fWidth4 = fWidth2 / c0mse.LJII.width();
                float fWidth5 = (c0mse.LJIIIZ / c0mse.LJII.width()) * 2.0f;
                float fHeight5 = (c0mse.LJIIJ / c0mse.LJII.height()) * 2.0f;
                float f11 = -fWidth4;
                if (f11 + fWidth5 <= -1.0f) {
                    fWidth5 = fWidth4 - 1.0f;
                }
                if (fWidth4 + fWidth5 >= 1.0f) {
                    fWidth5 = 1.0f - fWidth4;
                }
                float f12 = -fHeight4;
                if (f12 + fHeight5 <= -1.0f) {
                    fHeight5 = fHeight4 - 1.0f;
                }
                if (fHeight4 + fHeight5 >= 1.0f) {
                    fHeight5 = 1.0f - fHeight4;
                }
                C0MSG c0msg3 = c0mse.LJI;
                c0msg3.LIZIZ = fHeight5;
                c0msg3.LIZ = fWidth5;
                RectF rectF3 = c0msg3.LIZJ;
                rectF3.left = Math.max(f11 + fWidth5, -1.0f);
                rectF3.top = Math.max(f12 + fHeight5, -1.0f);
                rectF3.right = Math.min(fWidth4 + fWidth5, 1.0f);
                rectF3.bottom = Math.min(fHeight4 + fHeight5, 1.0f);
                c0mse.LIZJ.setX(rectF3.left);
                c0mse.LIZLLL.setX(rectF3.left);
                c0mse.LJ.setX(rectF3.right);
                c0mse.LJFF.setX(rectF3.right);
                c0mse.LIZJ.setY(rectF3.bottom);
                c0mse.LJ.setY(rectF3.bottom);
                c0mse.LIZLLL.setY(rectF3.top);
                c0mse.LJFF.setY(rectF3.top);
                c0mse.LIZ = true;
                z = !Intrinsics.LJFF(c0mse.LJI, c0mse.LJIIIIZZ);
            }
            this.LLJJIJIL = z;
            C0MSE c0mse2 = this.LLJJJJ;
            if (c0mse2.LIZ) {
                this.LLIZ.setLeftUpper(c0mse2.LIZJ);
                this.LLIZ.setLeftLower(this.LLJJJJ.LIZLLL);
                this.LLIZ.setRightUpper(this.LLJJJJ.LJ);
                this.LLIZ.setRightLower(this.LLJJJJ.LJFF);
                nLEStyClip = this.LLIZ;
            } else {
                nLEStyClip = null;
            }
            nLESegmentVideo.setClip(nLEStyClip);
            this.LLJJ = 0;
            this.LLJJI = 0;
            int iCenterX = this.LLJJJIL.centerX();
            int iCenterY = this.LLJJJIL.centerY();
            this.LLILZLL.setTransformX((iCenterX - this.LLJ.centerX()) / fWidth);
            this.LLILZLL.setTransformY((iCenterY - this.LLJ.centerY()) / fHeight);
            float fMax = (float) Math.max(this.LLJJJIL.width() / fWidth, this.LLJJJIL.height() / fHeight);
            this.LLILZLL.setScale(fMax);
            if (this.LLJJIJIIJIL != fMax || this.LLJJIJIL || this.LLJILLL != this.LLJILJILJ) {
                this.LLJJIJIIJIL = fMax;
                this.LLJILLL = this.LLJILJILJ;
                C786410Ut5.LJLILLLLZI(this.LLILLL, 1);
            }
            if (!this.LL.getTracks().contains(this.LLILZIL)) {
                this.LL.addTrack(this.LLILZIL);
                this.LLILLJJLI.LIZIZ(this.LL);
                C786410Ut5.LJLILLLLZI(this.LLILLL, 3);
            }
            if (this.LLJJIII != null) {
                C786410Ut5.LJLILLLLZI(this.LLILLL, 4);
            }
        }
    }

    public final void LIZJ(Rect rect) {
        if (!Intrinsics.LJFF(this.LLJ, rect)) {
            this.LLJ.set(rect);
            LIZIZ();
        }
    }

    public final void LIZLLL(Rect rect) {
        if (!Intrinsics.LJFF(this.LLJJJIL, rect)) {
            this.LLJJJIL.set(rect);
            LIZIZ();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C0MSI c0msi = this.LLIZLLLIL;
        Runnable runnable = this.LLJJIII;
        int i = message.what;
        if (i != 1) {
            if (i != 3) {
                if (i == 4 && runnable != null) {
                    runnable.run();
                }
            } else if (c0msi != null) {
                c0msi.LIZ(this.LL);
                return true;
            }
        } else if (c0msi != null) {
            c0msi.LJ(this);
            return true;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.android.ugc.gamora.layout.LayoutNLETrackStub$callbackHandler$1] */
    public LayoutNLETrackStub(NLEModel nLEModel, C0LDD c0ldd) {
        this.LL = nLEModel;
        this.LLILLJJLI = c0ldd;
        final Looper mainLooper = Looper.getMainLooper();
        this.LLILLL = new BPEAHandler(this, mainLooper) { // from class: com.ss.android.ugc.gamora.layout.LayoutNLETrackStub$callbackHandler$1
            @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
            public final boolean sendMessageAtTime(Message message, long j) {
                removeMessages(message.what);
                return super.sendMessageAtTime(message, j);
            }
        };
        this.LLILZ = new NLESegmentVideo();
        this.LLILZIL = new NLETrack();
        this.LLILZLL = new NLETrackSlot();
        this.LLIZ = new NLEStyClip();
        this.LLJ = new Rect(-1, -1, -1, -1);
        this.LLJILJILJ = 1.0f;
        this.LLJILLL = 1.0f;
        this.LLJJJIL = new Rect(-1, -1, -1, -1);
        this.LLJJJJ = new C0MSE();
    }

    public final void LIZ(String str, C0L9K c0l9k, Long l, boolean z) {
        long jLongValue;
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceFile(str);
        nLEResourceAV.setResourceType(c0l9k.getNleResType());
        this.LLILZ.setAVFile(nLEResourceAV);
        if (c0l9k == C0L9K.VIDEO) {
            C2356009La.LIZ.getClass();
            VEUtils.VEVideoFileInfo vEVideoFileInfoLIZ = C2356009La.LIZ(str);
            if (vEVideoFileInfoLIZ != null) {
                int i = vEVideoFileInfoLIZ.rotation;
                if (i != 90 && i != 270) {
                    this.LLJI = vEVideoFileInfoLIZ.width;
                    this.LLJIJIL = vEVideoFileInfoLIZ.height;
                } else {
                    this.LLJI = vEVideoFileInfoLIZ.height;
                    this.LLJIJIL = vEVideoFileInfoLIZ.width;
                }
                this.LLJILJIL = ((long) vEVideoFileInfoLIZ.duration) * 1000;
            } else {
                this.LLJILJIL = 0L;
            }
        } else {
            Pair<Integer, Integer> pairLIZJ = C097U.LIZJ(str);
            this.LLJI = pairLIZJ.getFirst().intValue();
            this.LLJIJIL = pairLIZJ.getSecond().intValue();
        }
        if (this.LLJILJIL <= 0) {
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 60000000;
            }
            this.LLJILJIL = jLongValue;
        }
        long jMin = (long) Math.min(this.LLJILJIL, 6.0E7d);
        this.LLJILJIL = jMin;
        this.LLILZ.setTimeClipEnd(jMin);
        this.LLILZLL.setDuration(this.LLJILJIL);
        this.LLILZLL.setEndTime(this.LLJILJIL);
        if (z) {
            this.LLILZIL.setDuration(this.LLJILJIL);
        }
        this.LLILZ.setTimeClipStart(0L);
        this.LLILZLL.setStartTime(0L);
        this.LLILZIL.setStartTime(0L);
        this.LLILZLL.setMainSegment(this.LLILZ);
        this.LLILZIL.addSlotAtEnd(this.LLILZLL);
        this.LLJJJ = true;
        LIZIZ();
    }
}
