package com.ss.android.ugc.aweme.social.creation.edit;

import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09AU;
import X.C0B0H;
import X.C0MMI;
import X.C0MMJ;
import X.C0MUO;
import X.C0PEM;
import X.C2252611DEt;
import X.C23250099c;
import X.C536390L1x;
import X.InterfaceC1286300jZs;
import X.InterfaceC1364105Vn;
import X.InterfaceC20236714Gf;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasGestureConfig;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.social.creation.api.edit.IStoryCanvasVideoHelper;
import com.ss.android.ugc.aweme.social.creation.edit.StoryCanvasVideoHelper;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class StoryCanvasVideoHelper implements IStoryCanvasVideoHelper {
    public static final void LJI(InterfaceC20236714Gf interfaceC20236714Gf, Bitmap bitmap) {
        C09AU c09auLJJIIJZLJL = interfaceC20236714Gf.LJJIIJZLJL(new AwS587S0100000_8(bitmap, 650), bitmap);
        if (c09auLJJIIJZLJL == null) {
            if (bitmap != null) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                return;
            }
            return;
        }
        interfaceC20236714Gf.LJIIL(c09auLJJIIJZLJL);
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.IStoryCanvasVideoHelper
    public final void LIZ(CanvasVideoData canvasVideoData, Context context) {
        if (C0B0H.LIZ() && canvasVideoData != null && canvasVideoData.extra == null) {
            Pair pairLIZ = C0MUO.LIZ(context);
            canvasVideoData.setExtra(new CanvasExtra(0, ((Number) pairLIZ.getFirst()).intValue(), ((Number) pairLIZ.getSecond()).intValue(), 0, 0, 0.15f, 20.0f, false, new CanvasGestureConfig(true, true, true, true, false, 2, false, false, true), null, 1.0f, 0L, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.IStoryCanvasVideoHelper
    public final void LIZIZ(ShortVideoContext shortVideoContext, CanvasVideoData canvasVideoData) {
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        creativeModel.canvasVideoData = canvasVideoData;
        CanvasExtra canvasExtra = canvasVideoData.extra;
        if (canvasExtra != null) {
            PublishModel publishModel = creativeModel.publishModel;
            publishModel.videoCanvasWidth = canvasExtra.width;
            publishModel.videoCanvasHeight = canvasExtra.height;
        }
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.IStoryCanvasVideoHelper
    public final boolean LIZJ(int i, ShortVideoContext shortVideoContext) {
        CreativeModel creativeModel;
        StoryShootModel storyShootModel;
        if (!C0B0H.LIZ() || i < 1 || shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null || (storyShootModel = creativeModel.storyModel) == null) {
            return false;
        }
        if (!storyShootModel.isShootFromSocialAlbum() && !storyShootModel.isStoryEntrance()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.IStoryCanvasVideoHelper
    public final Object LIZLLL(Context context, List<C536390L1x> list, Pair<Integer, Integer> pair, InterfaceC1364105Vn<? super CanvasVideoData> interfaceC1364105Vn) {
        if (list.isEmpty()) {
            return null;
        }
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C0MMI(list, context, pair, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(int r7, int r8, java.lang.String r9, X.InterfaceC1364105Vn r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C0MMJ
            if (r0 == 0) goto L20
            r4 = r10
            X.0MMJ r4 = (X.C0MMJ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r5 = 1
            if (r0 == 0) goto L2e
            if (r0 != r5) goto L26
            goto L3a
        L20:
            X.0MMJ r4 = new X.0MMJ
            r4.<init>(r6, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r5     // Catch: java.lang.Exception -> L40
            java.lang.Object r3 = r6.LJFF(r7, r8, r9, r4)     // Catch: java.lang.Exception -> L40
            if (r3 != r1) goto L3d
            return r1
        L3a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L40
        L3d:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Exception -> L40
            goto L45
        L40:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r3 = 0
        L45:
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r3 != 0) goto L53
            X.0MNg r0 = com.ss.android.ugc.aweme.canvas.CanvasBackground.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.canvas.CanvasBackground r0 = X.C567420MNg.LIZ(r4)
            return r0
        L53:
            X.0MOJ r2 = new X.0MOJ     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L90
            boolean r1 = X.C295690BiR.LIZ()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L90
            r0 = 0
            r2.<init>(r0, r1, r5)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L90
            kotlin.Pair r1 = r2.LIZIZ(r3)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L90
            java.lang.Object r0 = r1.getFirst()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L90
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L90
            int r2 = r0.intValue()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L90
            java.lang.Object r0 = r1.getSecond()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L90
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L90
            int r1 = r0.intValue()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L90
            X.0MNg r0 = com.ss.android.ugc.aweme.canvas.CanvasBackground.Companion     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L90
            com.ss.android.ugc.aweme.canvas.CanvasBackground r0 = X.C567420MNg.LIZIZ(r0, r2, r1)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L90
            goto L89
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L90
            X.0MNg r0 = com.ss.android.ugc.aweme.canvas.CanvasBackground.Companion     // Catch: java.lang.Throwable -> L90
            r0.getClass()     // Catch: java.lang.Throwable -> L90
            com.ss.android.ugc.aweme.canvas.CanvasBackground r0 = X.C567420MNg.LIZ(r4)     // Catch: java.lang.Throwable -> L90
        L89:
            r3.recycle()
            com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker.recordBitmapRecyclePoint(r3)
            return r0
        L90:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L90
            r3.recycle()
            com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker.recordBitmapRecyclePoint(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.edit.StoryCanvasVideoHelper.LJ(int, int, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final Object LJFF(int i, int i2, String str, C0MMJ c0mmj) {
        int iMin;
        int i3;
        if (str.length() == 0) {
            return null;
        }
        if (i <= 0 || i2 <= 0 || (iMin = Math.min(i / 256, i2 / 256)) < 1) {
            iMin = 1;
        }
        int i4 = 256;
        if (i > 0) {
            i3 = i / iMin;
        } else {
            i3 = 256;
        }
        if (i2 > 0) {
            i4 = i2 / iMin;
        }
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c0mmj));
        c2252611DEt.LJIJJ();
        VEUtils.getVideoFrames(str, new int[]{0}, i3, i4, false, new InterfaceC1286300jZs(c2252611DEt, this) { // from class: X.0LGS
            public final /* synthetic */ InterfaceC20236714Gf<Bitmap> LIZ;

            @Override // X.InterfaceC1286300jZs
            public final boolean processFrame(ByteBuffer byteBuffer, int i5, int i6, int i7) {
                if (!this.LIZ.isActive()) {
                    return false;
                }
                if (byteBuffer != null && i5 > 0 && i6 > 0) {
                    try {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                        StoryCanvasVideoHelper.LJI(this.LIZ, bitmapCreateBitmap);
                        return false;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StoryCanvasVideoHelper.LJI(this.LIZ, null);
                        return false;
                    }
                }
                StoryCanvasVideoHelper.LJI(this.LIZ, null);
                return false;
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c0mmj);
        }
        return objLJIJ;
    }
}
