package com.lynx.animax.drawable;

import X.C786410Ut5;
import X.EnumC1288850jdz;
import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.os.Build;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public class BitmapBuffer {
    public final Bitmap LIZ;
    public final HardwareBuffer LIZIZ;
    public final AtomicReference<EnumC1288850jdz> LIZJ = new AtomicReference<>(EnumC1288850jdz.NotReady);

    public final void LIZ() {
        AtomicReference<EnumC1288850jdz> atomicReference = this.LIZJ;
        EnumC1288850jdz enumC1288850jdz = EnumC1288850jdz.Destroyed;
        EnumC1288850jdz andSet = atomicReference.getAndSet(enumC1288850jdz);
        if (andSet == enumC1288850jdz || andSet == EnumC1288850jdz.Prepare) {
            return;
        }
        if (!this.LIZ.isRecycled()) {
            C786410Ut5.LJJJJ(this.LIZ);
        }
        HardwareBuffer hardwareBuffer = this.LIZIZ;
        if (hardwareBuffer == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        hardwareBuffer.close();
    }

    public Bitmap getBitmap() {
        if (this.LIZJ.get() == EnumC1288850jdz.Destroyed) {
            return null;
        }
        return this.LIZ;
    }

    public HardwareBuffer getHardwareBuffer() {
        if (this.LIZJ.get() == EnumC1288850jdz.Destroyed) {
            return null;
        }
        return this.LIZIZ;
    }

    public void setState(int i) {
        if (i >= 0 && i < EnumC1288850jdz.values().length && this.LIZJ.getAndSet(EnumC1288850jdz.values()[i]) == EnumC1288850jdz.Destroyed) {
            LIZ();
        }
    }

    public BitmapBuffer(Bitmap bitmap, HardwareBuffer hardwareBuffer) {
        this.LIZ = bitmap;
        this.LIZIZ = hardwareBuffer;
    }
}
