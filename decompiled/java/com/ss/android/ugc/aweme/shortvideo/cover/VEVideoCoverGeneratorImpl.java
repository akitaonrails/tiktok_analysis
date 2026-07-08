package com.ss.android.ugc.aweme.shortvideo.cover;

import X.C0LAB;
import X.C13LP;
import X.C15O7;
import X.C2219091BtD;
import X.InterfaceC1447630nm5;
import X.InterfaceC1452170ntP;
import X.InterfaceC1699590uKT;
import X.InterfaceC2140108Zz;
import Y.ACallableS432S0100000_29;
import android.graphics.Bitmap;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.vesdk.VEEditor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes30.dex */
public class VEVideoCoverGeneratorImpl implements InterfaceC1447630nm5, GenericLifecycleObserver {
    public final int LL;
    public int LLILLJJLI;
    public final InterfaceC1452170ntP LLILZ;
    public int[] LLILZIL;
    public final String LLILZLL;
    public final VEEditor.GET_FRAMES_FLAGS LLIZLLLIL;
    public boolean LLILLL = true;
    public final List<Long> LLIZ = new ArrayList();

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC1447630nm5
    public final void reset() {
        this.LLILLJJLI = -1;
        this.LLILZIL = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C15O7.LIZJ(new ACallableS432S0100000_29(this, 3));
        List<Long> list = this.LLIZ;
        String str = this.LLILZLL;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        InterfaceC2140108Zz interfaceC2140108ZzLJ = C2219091BtD.LJ();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(C13LP.LJZL(arrayList), "duration");
        c0lab.LIZ(arrayList.size(), "count");
        c0lab.LJ(Scene.SCENE_SERVICE, str);
        interfaceC2140108ZzLJ.LIZ("tool_performance_fetch_frames", c0lab.LIZ);
    }

    @Override // X.InterfaceC1447630nm5
    public final int LIZ() {
        return this.LL;
    }

    public int[] LIZJ(int i, int i2) {
        if (i2 == 0) {
            return new int[0];
        }
        int[] iArr = new int[i2];
        int i3 = i / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3 * i4;
        }
        return iArr;
    }

    @Override // X.InterfaceC1447630nm5
    public final void LIZIZ(int i, int i2, final InterfaceC1699590uKT interfaceC1699590uKT) {
        boolean z;
        final int i3 = i;
        final int i4 = i2;
        int duration = this.LLILZ.getDuration();
        boolean z2 = this.LLILLL;
        int i5 = this.LLILLJJLI;
        boolean z3 = true;
        if (i5 > 0 && i5 == duration) {
            z = false;
        } else {
            z = true;
        }
        if (z2 & z) {
            this.LLILLJJLI = duration;
        } else {
            z3 = false;
        }
        if (this.LLILZIL == null || z3) {
            this.LLILZIL = LIZJ(this.LLILLJJLI, this.LL);
        }
        final int[] iArr = this.LLILZIL;
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        if (i4 > i3 && i3 != -1) {
            i4 = -1;
        } else if (i4 != -1) {
            i3 = -1;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C15O7.LIZJ(new Callable() { // from class: X.11ha
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.LL;
                final int[] iArr2 = iArr;
                int i6 = i3;
                int i7 = i4;
                final InterfaceC1699590uKT interfaceC1699590uKT2 = interfaceC1699590uKT;
                final AtomicInteger atomicInteger2 = atomicInteger;
                final long j = jCurrentTimeMillis;
                vEVideoCoverGeneratorImpl.getClass();
                C1C7U.LIZ("VEVideoCoverGeneratorImpl@1c4d.generateBitmaps$1L");
                for (int i8 : iArr2) {
                    InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("VEVideoCoverGeneratorImpl: generateBitmaps begin，timeStamps: ");
                    sbLIZ.append(i8);
                    interfaceC1463990oCTLIZLLL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("VEVideoCoverGeneratorImpl: generateBitmaps begin，duration: ");
                sbLIZ2.append(vEVideoCoverGeneratorImpl.LLILZ.getDuration());
                interfaceC1463990oCTLIZLLL2.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                InterfaceC1452170ntP interfaceC1452170ntP = vEVideoCoverGeneratorImpl.LLILZ;
                VEEditor.GET_FRAMES_FLAGS get_frames_flags = vEVideoCoverGeneratorImpl.LLIZLLLIL;
                if (get_frames_flags == null) {
                    get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
                }
                interfaceC1452170ntP.lg(iArr2, i6, i7, get_frames_flags, new InterfaceC1464140oCi() { // from class: X.11hb
                    @Override // X.InterfaceC1464140oCi
                    public final int onGetImageData(byte[] bArr, int i9, int i10, int i11, float f) {
                        final VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl2 = vEVideoCoverGeneratorImpl;
                        final InterfaceC1699590uKT interfaceC1699590uKT3 = interfaceC1699590uKT2;
                        final AtomicInteger atomicInteger3 = atomicInteger2;
                        final int[] iArr3 = iArr2;
                        final long j2 = j;
                        vEVideoCoverGeneratorImpl2.getClass();
                        if (bArr != null) {
                            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL3 = C2219091BtD.LIZLLL();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("VEVideoCoverGeneratorImpl: generateBitmaps onGetImageData，bytes: ");
                            sbLIZ3.append(bArr.length);
                            sbLIZ3.append("score: ");
                            sbLIZ3.append(f);
                            interfaceC1463990oCTLIZLLL3.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                            bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
                            C15O7.LIZIZ(new Callable() { // from class: X.0uKS
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl3 = vEVideoCoverGeneratorImpl2;
                                    InterfaceC1699590uKT interfaceC1699590uKT4 = interfaceC1699590uKT3;
                                    AtomicInteger atomicInteger4 = atomicInteger3;
                                    int[] iArr4 = iArr3;
                                    Bitmap bitmap = bitmapCreateBitmap;
                                    long j3 = j2;
                                    vEVideoCoverGeneratorImpl3.getClass();
                                    C1C7U.LIZ("VEVideoCoverGeneratorImpl@1c4d.lambda$generateBitmaps$1$1L");
                                    interfaceC1699590uKT4.LIZ(atomicInteger4.get(), iArr4[atomicInteger4.get()], bitmap);
                                    atomicInteger4.incrementAndGet();
                                    ((ArrayList) vEVideoCoverGeneratorImpl3.LLIZ).add(Long.valueOf(System.currentTimeMillis() - j3));
                                    C1C7U.LIZIZ("VEVideoCoverGeneratorImpl@1c4d.lambda$generateBitmaps$1$1L");
                                    return null;
                                }
                            }, C15O7.LJIIIIZZ, null);
                            return 0;
                        }
                        C2219091BtD.LIZLLL().LIZ("VEVideoCoverGeneratorImpl: generateBitmaps onGetImageData end，bytes: null");
                        if (atomicInteger3.get() == vEVideoCoverGeneratorImpl2.LL) {
                            return 0;
                        }
                        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL4 = C2219091BtD.LIZLLL();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("VEVideoCoverGeneratorImpl:cover size not correct，want");
                        sbLIZ4.append(vEVideoCoverGeneratorImpl2.LL);
                        sbLIZ4.append("，actually");
                        sbLIZ4.append(atomicInteger3.get());
                        interfaceC1463990oCTLIZLLL4.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                        return 0;
                    }
                });
                C1C7U.LIZIZ("VEVideoCoverGeneratorImpl@1c4d.generateBitmaps$1L");
                return null;
            }
        });
    }

    public VEVideoCoverGeneratorImpl(InterfaceC1452170ntP interfaceC1452170ntP, LifecycleOwner lifecycleOwner, int i, VEEditor.GET_FRAMES_FLAGS get_frames_flags, String str) {
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LLILZ = interfaceC1452170ntP;
        this.LL = i;
        this.LLIZLLLIL = get_frames_flags;
        this.LLILZLL = str;
    }
}
