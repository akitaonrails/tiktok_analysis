package com.ss.android.ugc.aweme.watermark;

import X.C08QA;
import X.C098200Yq;
import X.C0CHQ;
import X.C0VSJ;
import X.C0VSV;
import X.C128H;
import X.C128I;
import X.C12YU;
import X.C140D;
import X.C189200o6;
import X.C1DWN;
import X.C1DWO;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C438750HIj;
import X.C547790Le5;
import X.C814420VxA;
import X.InterfaceC707110RoT;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS47S2100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes30.dex */
public final class WaterMarkServiceImpl implements IWaterMarkService {
    public static C128I LIZ() {
        C128H.LIZ.getClass();
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            creativeToolsPluginService.LIZ();
        }
        return C0CHQ.LIZ().LIZIZ().LIZLLL() ? (C1DWO) C128H.LIZJ.getValue() : (C1DWN) C128H.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final void cancelWaterMark() {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncServiceWithOutPanel("WaterMark", new IExternalService.ServiceLoadCallback() { // from class: X.128G
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                this.LIZ.getClass();
                WaterMarkServiceImpl.LIZ().LIZIZ();
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final synchronized void prepareDataForI18n(WaterMarkBuilder waterMarkBuilder) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncServiceWithOutPanel("WaterMark", new C12YU(this, waterMarkBuilder, 1));
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final synchronized void waterMark(WaterMarkBuilder waterMarkBuilder) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncServiceWithOutPanel("WaterMark", new C12YU(this, waterMarkBuilder, 2));
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final void watermarkForTikTokNow(final WaterMarkBuilder waterMarkBuilder) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncServiceWithOutPanel("WaterMark", new IExternalService.ServiceLoadCallback() { // from class: X.128F
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                WaterMarkListener waterMarkListener = waterMarkBuilder.listener;
                if (waterMarkListener != null) {
                    waterMarkListener.onError(-114);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                C128H.LIZ.getClass();
                CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                if (creativeToolsPluginService != null) {
                    creativeToolsPluginService.LIZ();
                }
                ((C1DWN) C128H.LIZIZ.getValue()).waterMark(waterMarkBuilder);
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x0063
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final void addAIPortraitWatermarkToImage(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r10)
            java.lang.Class<com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService> r3 = com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService.class
            r4 = 0
            r7 = 14
            r8 = 0
            r5 = r4
            r6 = r4
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService r0 = (com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService) r0
            if (r0 == 0) goto L6b
            X.0RoT r1 = r0.LIZIZ()
            if (r1 == 0) goto L6b
            android.app.Application r0 = X.C1BWL.LIZ()
            android.graphics.Bitmap r4 = r1.LIZJ(r0, r2)
            if (r4 == 0) goto L6b
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r11)
            X.0VSV r3 = new X.0VSV
            r3.<init>(r0)
            r2 = 0
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L5b
            r0 = 100
            r4.compress(r1, r0, r3)     // Catch: java.lang.Throwable -> L5b
            X.C2107108Nh.LIZ(r3, r8)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "addAIPortraitWatermarkToImage, path: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", targetPath: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZ(r0)
            r4.recycle()
            com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker.recordBitmapRecyclePoint(r4)
            return
        L5b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L63
            throw r1     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            r2 = r1
            goto L64
        L63:
            r0 = move-exception
        L64:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L63
            X.C2107108Nh.LIZ(r3, r2)
            throw r0
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl.addAIPortraitWatermarkToImage(java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final void addAITextImageWaterMarkToImage(String str, String str2) throws Throwable {
        C438750HIj c438750HIj = C438750HIj.LIZ;
        Point point = new Point(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        AFwS289S0000000_6 aFwS289S0000000_6 = AFwS289S0000000_6.get$arr$(28);
        c438750HIj.getClass();
        if (new C0VSJ(str).exists()) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            if (bitmapDecodeFile != null) {
                Bitmap bitmap = (Bitmap) aFwS289S0000000_6.invoke(Integer.valueOf(bitmapDecodeFile.getWidth()), Integer.valueOf(bitmapDecodeFile.getHeight()));
                if (bitmap != null) {
                    Bitmap bitmapCopy = bitmapDecodeFile.copy(Bitmap.Config.ARGB_8888, true);
                    bitmapDecodeFile.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
                    Canvas canvas = new Canvas(bitmapCopy);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setAlpha(204);
                    canvas.drawBitmap(bitmap, point.x, point.y, paint);
                    bitmapDecodeFile = bitmapCopy;
                }
                C0VSV c0vsv = new C0VSV(new C0VSJ(str2));
                try {
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 100, c0vsv);
                    C2107108Nh.LIZ(c0vsv, null);
                    bitmapDecodeFile.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            th = null;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(c0vsv, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid image path: ");
                sbLIZ.append(str);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            throw new IllegalArgumentException("path must not be exists");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x0035
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final void addAiChatWaterMarkToImage(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r6)
            X.09n5 r1 = X.C2476109n5.LIZ
            android.app.Application r0 = X.C1BWL.LIZ()
            r1.getClass()
            android.graphics.Bitmap r4 = X.C2476109n5.LIZ(r0, r2)
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r7)
            X.0VSV r3 = new X.0VSV
            r3.<init>(r0)
            r2 = 0
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L2d
            r0 = 100
            r4.compress(r1, r0, r3)     // Catch: java.lang.Throwable -> L2d
            X.C2107108Nh.LIZ(r3, r2)
            r4.recycle()
            com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker.recordBitmapRecyclePoint(r4)
            return
        L2d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L35
            throw r1     // Catch: java.lang.Throwable -> L32
        L32:
            r0 = move-exception
            r2 = r1
            goto L36
        L35:
            r0 = move-exception
        L36:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L35
            X.C2107108Nh.LIZ(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl.addAiChatWaterMarkToImage(java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final void readAIGCAddAIPortraitWatermark(Aweme aweme, List<String> list) {
        InterfaceC707110RoT interfaceC707110RoTLIZIZ;
        if (aweme == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            IAIPortraitFeatureService.LIZ.getClass();
            IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
            if (iAIPortraitFeatureServiceLIZ != null && (interfaceC707110RoTLIZIZ = iAIPortraitFeatureServiceLIZ.LIZIZ()) != null && interfaceC707110RoTLIZIZ.LIZLLL(i, aweme)) {
                ListProtector.set(list, i, readAIGCAddAIPortraitWatermarkForSingleImage((String) ListProtector.get(list, i), (String) ListProtector.get(list, i)));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final String readAIGCAddAIPortraitWatermarkForSingleImage(String str, String str2) throws Throwable {
        String absolutePath;
        C0VSJ c0vsj = new C0VSJ(str2);
        boolean z = true;
        if (!u.LJIJI(C08QA.LJIJ(c0vsj), "jpg", true) && !u.LJIJI(C08QA.LJIJ(c0vsj), "jpeg", true)) {
            String strLJIJI = C08QA.LJIJI(c0vsj);
            if (strLJIJI.length() != 0) {
                z = false;
            }
            if (z) {
                strLJIJI = c0vsj.getName();
            }
            File parentFile = c0vsj.getParentFile();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIJI);
            sbLIZ.append(".jpg");
            absolutePath = new C0VSJ(parentFile, C2188811AlT.LIZIZ(sbLIZ)).getAbsolutePath();
        } else {
            absolutePath = str2;
        }
        C140D c140d = C140D.LIZ;
        AwS47S2100000_29 awS47S2100000_29 = new AwS47S2100000_29(this, str, absolutePath, 0);
        c140d.getClass();
        C140D.LJJJJI(str, absolutePath, awS47S2100000_29);
        if (!new C0VSJ(absolutePath).exists()) {
            addAIPortraitWatermarkToImage(str, str2);
            return str2;
        }
        if (!Intrinsics.LJFF(absolutePath, str)) {
            try {
                C0VSJ c0vsj2 = new C0VSJ(str);
                Boolean boolValueOf = null;
                if (!c0vsj2.exists()) {
                    c0vsj2 = null;
                }
                if (c0vsj2 != null) {
                    boolValueOf = Boolean.valueOf(c0vsj2.delete());
                }
                C189200o6.m2constructorimpl(boolValueOf);
                return absolutePath;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return absolutePath;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:57:0x018b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final void addWaterMarkToImage(X.InterfaceC2257101DWa r21, java.lang.String r22, java.lang.String r23, boolean r24, int r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl.addWaterMarkToImage(X.1DWa, java.lang.String, java.lang.String, boolean, int, boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x0158
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final kotlin.Pair<android.graphics.Point, android.util.Size> createWaterMarkFile(X.InterfaceC2257101DWa r22, int r23, int r24, java.lang.String r25, boolean r26, int r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl.createWaterMarkFile(X.1DWa, int, int, java.lang.String, boolean, int, boolean):kotlin.Pair");
    }
}
