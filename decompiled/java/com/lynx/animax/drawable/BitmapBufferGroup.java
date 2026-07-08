package com.lynx.animax.drawable;

import X.C2188811AlT;
import X.EnumC1288850jdz;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.hardware.HardwareBuffer;
import android.os.Build;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.util.AnimaXLog;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public class BitmapBufferGroup {
    public final WeakReference<View> LIZLLL;
    public final AtomicReference<BitmapBuffer> LIZ = new AtomicReference<>();
    public final boolean LJ = true;
    public final ConcurrentLinkedQueue<BitmapBuffer> LIZIZ = new ConcurrentLinkedQueue<>();
    public final int LIZJ = 3;

    public final void LIZ() {
        while (true) {
            BitmapBuffer bitmapBufferPoll = this.LIZIZ.poll();
            if (bitmapBufferPoll == null) {
                break;
            } else {
                bitmapBufferPoll.LIZ();
            }
        }
        BitmapBuffer andSet = this.LIZ.getAndSet(null);
        if (andSet != null) {
            andSet.LIZ();
        }
    }

    public BitmapBuffer getBitmapBufferForOffscreenRendering() {
        return this.LIZIZ.peek();
    }

    public void onBufferUpdate() {
        BitmapBuffer bitmapBufferPeek = this.LIZIZ.peek();
        if (bitmapBufferPeek != null) {
            EnumC1288850jdz enumC1288850jdz = bitmapBufferPeek.LIZJ.get();
            EnumC1288850jdz enumC1288850jdz2 = EnumC1288850jdz.Ready;
            if (enumC1288850jdz == enumC1288850jdz2) {
                BitmapBuffer andSet = this.LIZ.getAndSet(bitmapBufferPeek);
                if (andSet != null) {
                    andSet.LIZJ.set(EnumC1288850jdz.NotReady);
                    this.LIZIZ.offer(andSet);
                }
                if (bitmapBufferPeek.LIZJ.get() == enumC1288850jdz2) {
                    this.LIZIZ.remove(bitmapBufferPeek);
                    View view = this.LIZLLL.get();
                    if (view != null) {
                        view.postInvalidate();
                        return;
                    }
                    return;
                }
                if (andSet != null) {
                    this.LIZIZ.remove(andSet);
                    andSet.LIZ();
                }
                BitmapBuffer andSet2 = this.LIZ.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.LIZ();
                }
            }
        }
    }

    public BitmapBufferGroup(View view) {
        this.LIZLLL = new WeakReference<>(view);
    }

    public final BitmapBuffer LIZJ(BitmapBuffer bitmapBuffer) {
        BitmapBuffer bitmapBuffer2 = this.LIZ.get();
        if (bitmapBuffer2 != null && bitmapBuffer2.LIZJ.get() == EnumC1288850jdz.Ready) {
            if (bitmapBuffer != null) {
                bitmapBuffer.LIZJ.set(EnumC1288850jdz.NotReady);
                this.LIZIZ.offer(bitmapBuffer);
            }
            return this.LIZ.getAndSet(null);
        }
        return bitmapBuffer;
    }

    public final void LIZIZ(int i, int i2) {
        boolean z;
        HardwareBuffer hardwareBufferCreate;
        Bitmap bitmapCreateBitmap;
        long j;
        if (i > 0 && i2 > 0) {
            LIZ();
            for (int i3 = 0; i3 < this.LIZJ; i3++) {
                ConcurrentLinkedQueue<BitmapBuffer> concurrentLinkedQueue = this.LIZIZ;
                boolean z2 = this.LJ;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 26 && (!z2 || i4 >= 29)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (z2) {
                        j = 304;
                    } else if (i4 >= 29) {
                        j = 768;
                    } else {
                        j = 515;
                    }
                    try {
                        hardwareBufferCreate = HardwareBuffer.create(i, i2, 1, 1, j);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Failed to create HardwareBuffer: ");
                        sbLIZ.append(e.getMessage());
                        AnimaXLog.LIZ("BitmapBuffer", C2188811AlT.LIZIZ(sbLIZ));
                        hardwareBufferCreate = null;
                    }
                } else {
                    hardwareBufferCreate = null;
                }
                if (Build.VERSION.SDK_INT >= 29 && hardwareBufferCreate != null) {
                    try {
                        bitmapCreateBitmap = Bitmap.wrapHardwareBuffer(hardwareBufferCreate, ColorSpace.get(ColorSpace.Named.SRGB));
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Failed to wrap HardwareBuffer: ");
                        sbLIZ2.append(e2.getMessage());
                        AnimaXLog.LIZ("BitmapBuffer", C2188811AlT.LIZIZ(sbLIZ2));
                        hardwareBufferCreate.close();
                        hardwareBufferCreate = null;
                    }
                    if (bitmapCreateBitmap == null) {
                        bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                    }
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                }
                concurrentLinkedQueue.offer(new BitmapBuffer(bitmapCreateBitmap, hardwareBufferCreate));
            }
        }
    }
}
