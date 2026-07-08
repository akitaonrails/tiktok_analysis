package com.ss.android.ugc.aweme.shortvideo.util;

import X.C822650WOx;
import X.InterfaceC1325790kbZ;
import X.InterfaceC1325800kba;
import Y.ARunnableS89S0200000_20;
import android.graphics.Bitmap;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.util.VideoCoverCacheImpl;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes21.dex */
public final class VideoCoverCacheImpl implements InterfaceC1325800kba, GenericLifecycleObserver {
    public final String LL;
    public final C822650WOx LLILLL;
    public boolean LLILLJJLI = true;
    public final Map<Integer, InterfaceC1325790kbZ> LLILZ = new ConcurrentHashMap();

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LLILLJJLI = true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public VideoCoverCacheImpl(LifecycleOwner lifecycleOwner, final String str, final int i, final int i2, int i3, float f, boolean z) {
        this.LL = str;
        lifecycleOwner.getLifecycle().addObserver(this);
        float f2 = LSPassThroughRecordSizeConfig.DEFAULT * f;
        if (f2 > 0.0f) {
            float f3 = i3 / f2;
            int i4 = (int) (z ? f3 + 1 : f3);
            final int[] iArr = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                iArr[i5] = (int) (i5 * f2);
            }
            C822650WOx c822650WOx = new C822650WOx(0, 4, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardOldestPolicy());
            this.LLILLL = c822650WOx;
            c822650WOx.execute(new Runnable() { // from class: X.0kbY
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VideoCoverCacheImpl@813a.<init>$1");
                    try {
                        String str2 = str;
                        int[] iArr2 = iArr;
                        int i6 = i;
                        int i7 = i2;
                        final VideoCoverCacheImpl videoCoverCacheImpl = this;
                        VEUtils.getVideoFrames(str2, iArr2, i6, i7, false, new InterfaceC1286300jZs() { // from class: X.0kbX
                            @Override // X.InterfaceC1286300jZs
                            public final boolean processFrame(ByteBuffer byteBuffer, int i8, int i9, int i10) {
                                if (byteBuffer != null) {
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
                                    bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
                                    videoCoverCacheImpl.getClass();
                                    C1323050kX9 c1323050kX9LJIJJLI = C1323050kX9.LJIJJLI(new C1325120kaU(bitmapCreateBitmap, C530820Kro.LIZIZ(), C1328060kfE.LIZLLL, 0));
                                    C1323050kX9 c1323050kX9Clone = c1323050kX9LJIJJLI.clone();
                                    InterfaceC1325790kbZ interfaceC1325790kbZ = (InterfaceC1325790kbZ) ((ConcurrentHashMap) videoCoverCacheImpl.LLILZ).get(Integer.valueOf(i10));
                                    if (interfaceC1325790kbZ != null) {
                                        ((ConcurrentHashMap) videoCoverCacheImpl.LLILZ).remove(Integer.valueOf(i10));
                                        C810560Vqw.LIZJ(new ARunnableS89S0200000_20(c1323050kX9Clone, interfaceC1325790kbZ, 58));
                                    }
                                    VideoCoverCacheImpl videoCoverCacheImpl2 = videoCoverCacheImpl;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(videoCoverCacheImpl.LL);
                                    sbLIZ.append(i10);
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    videoCoverCacheImpl2.getClass();
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("file://");
                                    sbLIZ2.append(strLIZIZ);
                                    C1324660kZk c1324660kZkLIZJ = C1324810kZz.LJI().LIZJ(C1325710kbR.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2)), null);
                                    Class<?> cls = C1322200kVm.LIZ;
                                    C1328130kfL.LJIILIIL().LJII().LJ(c1324660kZkLIZJ, c1323050kX9LJIJJLI);
                                }
                                return videoCoverCacheImpl.LLILLJJLI;
                            }
                        });
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoCoverCacheImpl@813a.<init>$1");
                }
            });
        }
    }
}
