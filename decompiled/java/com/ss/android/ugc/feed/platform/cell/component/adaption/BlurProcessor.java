package com.ss.android.ugc.feed.platform.cell.component.adaption;

import X.C01GW;
import X.C0CAU;
import X.C259840AGg;
import X.C418440Gaw;
import X.C452501pT;
import X.C603820NmG;
import X.C786410Ut5;
import X.C814420VxA;
import X.RunnableC813503Ft;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.feed.platform.cell.component.adaption.BlurProcessor;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes32.dex */
public final class BlurProcessor {
    public static final C01GW<C603820NmG<String, Bitmap>> LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(584));
    public static final C01GW<C603820NmG<String, Bitmap>> LJFF = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(583));
    public final Context LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final C01GW LIZLLL;

    public BlurProcessor(Context context) {
        this.LIZ = context;
        C01GW c01gw = C259840AGg.LIZ;
        this.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((Number) c01gw.getValue()).intValue())));
        this.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((Number) c01gw.getValue()).intValue())));
        this.LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(585));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r21, android.graphics.Bitmap r22, android.view.ViewGroup r23, kotlin.jvm.functions.Function0<com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues> r24, kotlin.jvm.functions.Function0<com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult> r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.adaption.BlurProcessor.LIZ(java.lang.String, android.graphics.Bitmap, android.view.ViewGroup, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean):void");
    }

    public final void LIZIZ(final String str, final Bitmap bitmap, final ViewGroup viewGroup, final int i, final int i2, final boolean z, VideoAdaptionResult videoAdaptionResult) {
        Bitmap bitmapLIZJ;
        if (videoAdaptionResult != null) {
            try {
                final int height = videoAdaptionResult.getHeight();
                if (height != 0) {
                    if (z) {
                        bitmapLIZJ = LJ.getValue().LIZJ(str);
                    } else {
                        bitmapLIZJ = LJFF.getValue().LIZJ(str);
                    }
                    if (bitmapLIZJ != null) {
                        C0CAU.LIZIZ(new RunnableC813503Ft(z, this, i2, bitmapLIZJ, viewGroup));
                        return;
                    } else {
                        try {
                            C786410Ut5.LJJZZIII((Handler) this.LIZLLL.getValue(), new Runnable() { // from class: X.15cJ
                                /* JADX WARN: Type inference failed for: r5v3, types: [X.15nG] */
                                public final void LIZ() {
                                    final int height2;
                                    try {
                                        float height3 = (i2 / height) * bitmap.getHeight();
                                        if (height3 <= 0.0f || i <= 0) {
                                            return;
                                        }
                                        final int i3 = 0;
                                        int height4 = z ? 0 : bitmap.getHeight() - ((int) height3);
                                        Bitmap bitmapCreateBitmap = null;
                                        try {
                                            Bitmap bitmap2 = bitmap;
                                            bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, height4, bitmap2.getWidth(), (int) height3);
                                            C1100050ejT c1100050ejT = C1100050ejT.LIZ;
                                            float fFloatValue = ((Number) C2554209zg.LIZ.getValue()).floatValue();
                                            float fFloatValue2 = ((Number) C2554109zf.LIZ.getValue()).floatValue();
                                            c1100050ejT.getClass();
                                            final Bitmap bitmapLIZ = C1100050ejT.LIZ(bitmapCreateBitmap, fFloatValue, fFloatValue2);
                                            if (bitmapLIZ == null) {
                                                if (bitmapCreateBitmap != null) {
                                                    bitmapCreateBitmap.recycle();
                                                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                                                    return;
                                                }
                                                return;
                                            }
                                            double height5 = z ? (((double) bitmapLIZ.getHeight()) - ((((double) this.LIZIZ) / ((double) i2)) * ((double) bitmapLIZ.getHeight()))) + ((double) 1) : ((((double) this.LIZJ) / ((double) i2)) * ((double) bitmapLIZ.getHeight())) - ((double) 1);
                                            if (z) {
                                                i3 = (int) height5;
                                                height2 = bitmapLIZ.getHeight();
                                            } else {
                                                height2 = (int) height5;
                                            }
                                            final boolean z2 = z;
                                            Bitmap bitmapLIZ2 = new Object(bitmapLIZ, i3, height2, z2) { // from class: X.15nG
                                                public final Bitmap LIZ;
                                                public final InterfaceC20625515nJ LIZIZ;

                                                public final Bitmap LIZ() {
                                                    int width = this.LIZ.getWidth();
                                                    int height6 = this.LIZ.getHeight();
                                                    int[] iArr = new int[width * height6];
                                                    this.LIZ.getPixels(iArr, 0, width, 0, 0, width, height6);
                                                    int i4 = 0;
                                                    for (int i5 = 0; i5 < height6; i5++) {
                                                        int iLIZIZ = this.LIZIZ.LIZIZ(this.LIZIZ.LIZ(i4));
                                                        i4++;
                                                        int i6 = i5 * width;
                                                        int i7 = i6 + width;
                                                        while (i6 < i7) {
                                                            iArr[i6] = (iLIZIZ << 24) | (iArr[i6] & 16777215);
                                                            i6++;
                                                        }
                                                    }
                                                    return Bitmap.createBitmap(iArr, width, height6, Bitmap.Config.ARGB_8888);
                                                }

                                                {
                                                    InterfaceC20625515nJ interfaceC20625515nJ;
                                                    this.LIZ = bitmapLIZ;
                                                    if (z2) {
                                                        interfaceC20625515nJ = new InterfaceC20625515nJ(i3, height2) { // from class: X.15nI
                                                            public final int LIZ;
                                                            public final double LIZIZ;

                                                            @Override // X.InterfaceC20625515nJ
                                                            public final double LIZ(int i4) {
                                                                int i5 = this.LIZ;
                                                                if (i4 <= i5) {
                                                                    return 0.0d;
                                                                }
                                                                return ((double) (i4 - i5)) / this.LIZIZ;
                                                            }

                                                            @Override // X.InterfaceC20625515nJ
                                                            public final int LIZIZ(double d) {
                                                                double d2 = 255;
                                                                return (int) C13LZ.LIZJ(d2 - (d * d2), 0.0d, 255.0d);
                                                            }

                                                            {
                                                                this.LIZ = i3;
                                                                this.LIZIZ = Math.max(height2 - i3, 1.0d);
                                                            }
                                                        };
                                                    } else {
                                                        interfaceC20625515nJ = new InterfaceC20625515nJ(i3, height2) { // from class: X.15nH
                                                            public final int LIZ;
                                                            public final int LIZIZ;
                                                            public final double LIZJ;

                                                            @Override // X.InterfaceC20625515nJ
                                                            public final double LIZ(int i4) {
                                                                if (i4 >= this.LIZIZ) {
                                                                    return 1.0d;
                                                                }
                                                                return ((double) (i4 - this.LIZ)) / this.LIZJ;
                                                            }

                                                            @Override // X.InterfaceC20625515nJ
                                                            public final int LIZIZ(double d) {
                                                                return (int) C13LZ.LIZJ(d * ((double) 255), 0.0d, 255.0d);
                                                            }

                                                            {
                                                                this.LIZ = i3;
                                                                this.LIZIZ = height2;
                                                                this.LIZJ = Math.max(height2 - i3, 1.0d);
                                                            }
                                                        };
                                                    }
                                                    this.LIZIZ = interfaceC20625515nJ;
                                                }
                                            }.LIZ();
                                            if (bitmapLIZ2 == null) {
                                                if (bitmapCreateBitmap != null) {
                                                    bitmapCreateBitmap.recycle();
                                                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (z) {
                                                BlurProcessor blurProcessor = this;
                                                String str2 = str;
                                                blurProcessor.getClass();
                                                BlurProcessor.LJ.getValue().LIZLLL(str2, bitmapLIZ2);
                                            } else {
                                                BlurProcessor blurProcessor2 = this;
                                                String str3 = str;
                                                blurProcessor2.getClass();
                                                BlurProcessor.LJFF.getValue().LIZLLL(str3, bitmapLIZ2);
                                            }
                                            BlurProcessor blurProcessor3 = this;
                                            ViewGroup viewGroup2 = viewGroup;
                                            int i4 = i2;
                                            boolean z3 = z;
                                            blurProcessor3.getClass();
                                            C0CAU.LIZIZ(new RunnableC813503Ft(z3, blurProcessor3, i4, bitmapLIZ2, viewGroup2));
                                            if (bitmapCreateBitmap != null) {
                                                bitmapCreateBitmap.recycle();
                                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            if (bitmapCreateBitmap != null) {
                                                bitmapCreateBitmap.recycle();
                                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("BlurProcessor@b2c2.processBlur$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("BlurProcessor@b2c2.processBlur$1");
                                }
                            });
                            return;
                        } catch (Exception e) {
                            e = e;
                        }
                    }
                } else {
                    return;
                }
            } catch (Exception e2) {
                e = e2;
            }
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
