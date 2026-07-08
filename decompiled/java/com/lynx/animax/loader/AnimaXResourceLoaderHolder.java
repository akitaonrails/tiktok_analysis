package com.lynx.animax.loader;

import X.InterfaceC1288450jdL;
import X.InterfaceC1288480jdO;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.base.CleanupReference;
import com.lynx.animax.loader.AnimaXLoaderCompletionHandler;
import com.lynx.animax.loader.AnimaXLoaderRequest;
import com.lynx.animax.loader.AnimaXResourceLoaderHolder;
import com.lynx.animax.service.IAnimaXImageService;
import com.lynx.animax.service.IAnimaXService;
import com.lynx.animax.util.AnimaX;
import com.lynx.animax.util.AnimaXLog;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class AnimaXResourceLoaderHolder {
    public final CleanupReference LIZJ;
    public final List<AnimaXLoader> LIZIZ = new ArrayList();
    public long LIZ = nativeCreate();

    public static native long nativeCreate();

    public static native void nativeDestroy(long j);

    public static native void nativeRegisterLoaderForScheme(long j, AnimaXLoader animaXLoader, int i);

    public AnimaXResourceLoaderHolder(InterfaceC1288450jdL interfaceC1288450jdL) {
        this.LIZJ = null;
        final long j = this.LIZ;
        this.LIZJ = new CleanupReference(this, new Runnable(j) { // from class: X.0jdN
            public long LL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AnimaXResourceLoaderHolder$CleanupOnUiThread@9920.run");
                try {
                    if (this.LL != 0) {
                        AnimaXLog.LIZIZ("AnimaXResourceLoaderHolder", "Call nativeDestroy.");
                        AnimaXResourceLoaderHolder.nativeDestroy(this.LL);
                        this.LL = 0L;
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AnimaXResourceLoaderHolder$CleanupOnUiThread@9920.run");
            }

            {
                this.LL = j;
            }
        });
        LIZ(new InterfaceC1288480jdO() { // from class: X.0jdP
            @Override // X.InterfaceC1288480jdO
            public final EnumC1288520jdS getScheme() {
                return EnumC1288520jdS.ASSET;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
            @Override // X.InterfaceC1288480jdO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.InterfaceC1285790jZ3 r5, X.InterfaceC1285780jZ2 r6) {
                /*
                    r4 = this;
                    X.0jYy r0 = X.C1285740jYy.LIZ()
                    java.lang.Class<com.lynx.animax.service.IAnimaXImageService> r3 = com.lynx.animax.service.IAnimaXImageService.class
                    r0.getClass()
                    X.0jYs r1 = X.C1285680jYs.LIZIZ
                    java.util.Map<X.0jYs, java.util.Map<java.lang.Class<? extends com.lynx.animax.service.IAnimaXService>, com.lynx.animax.service.IAnimaXService>> r0 = r0.LIZ
                    java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                    java.lang.Object r2 = r0.get(r1)
                    java.util.Map r2 = (java.util.Map) r2
                    r1 = 0
                    if (r2 == 0) goto L2f
                    boolean r0 = r2.containsKey(r3)
                    if (r0 == 0) goto L2f
                    java.lang.Object r0 = r2.get(r3)
                    com.lynx.animax.service.IAnimaXService r0 = (com.lynx.animax.service.IAnimaXService) r0
                L24:
                    com.lynx.animax.service.IAnimaXImageService r0 = (com.lynx.animax.service.IAnimaXImageService) r0
                    if (r0 == 0) goto L31
                    boolean r0 = r0.loadImage(r5, r6)
                    if (r0 == 0) goto L31
                    return
                L2f:
                    r0 = r1
                    goto L24
                L31:
                    com.lynx.animax.loader.AnimaXLoaderRequest r5 = (com.lynx.animax.loader.AnimaXLoaderRequest) r5
                    java.lang.String r0 = r5.LIZIZ()
                    if (r0 == 0) goto L3d
                    android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
                L3d:
                    com.lynx.animax.util.AnimaX r0 = com.lynx.animax.util.AnimaX.LIZJ()
                    android.content.Context r0 = r0.LIZJ
                    if (r0 == 0) goto L84
                    android.content.res.AssetManager r2 = r0.getAssets()
                    if (r2 == 0) goto L84
                    java.lang.String r1 = r1.getPath()
                    r0 = 1
                    java.lang.String r3 = r1.substring(r0)
                    java.io.InputStream r1 = r2.open(r3)     // Catch: java.io.IOException -> L63
                    int r0 = r1.available()     // Catch: java.io.IOException -> L63
                    byte[] r0 = X.C0WLZ.LIZJ(r1, r0)     // Catch: java.io.IOException -> L63
                    if (r0 == 0) goto L84
                    goto L90
                L63:
                    r2 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "Failed to open asset: "
                    r1.append(r0)
                    r1.append(r3)
                    java.lang.String r0 = " , reason: "
                    r1.append(r0)
                    r1.append(r2)
                    java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                    java.lang.String r0 = "ResourceUtil"
                    com.lynx.animax.util.AnimaXLog.LIZ(r0, r1)
                L84:
                    java.lang.Throwable r1 = new java.lang.Throwable
                    java.lang.String r0 = "failed to load asset"
                    r1.<init>(r0)
                    X.0jdX r0 = X.C1288570jdX.LIZIZ(r1)
                    goto L94
                L90:
                    X.0jdX r0 = X.C1288570jdX.LIZ(r0)
                L94:
                    com.lynx.animax.loader.AnimaXLoaderCompletionHandler r6 = (com.lynx.animax.loader.AnimaXLoaderCompletionHandler) r6
                    r6.LIZ(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1288490jdP.LIZ(X.0jZ3, X.0jZ2):void");
            }
        });
        LIZ(new InterfaceC1288480jdO() { // from class: X.0jdR
            @Override // X.InterfaceC1288480jdO
            public final EnumC1288520jdS getScheme() {
                return EnumC1288520jdS.FILE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1288480jdO
            public final void LIZ(InterfaceC1285790jZ3 interfaceC1285790jZ3, InterfaceC1285780jZ2 interfaceC1285780jZ2) {
                IAnimaXService iAnimaXService;
                C1288570jdX c1288570jdXLIZIZ;
                byte[] bArrLIZJ;
                C1285740jYy c1285740jYyLIZ = C1285740jYy.LIZ();
                c1285740jYyLIZ.getClass();
                Map map = (Map) ((ConcurrentHashMap) c1285740jYyLIZ.LIZ).get(C1285680jYs.LIZIZ);
                Uri uri = null;
                if (map != null && map.containsKey(IAnimaXImageService.class)) {
                    iAnimaXService = (IAnimaXService) map.get(IAnimaXImageService.class);
                } else {
                    iAnimaXService = null;
                }
                IAnimaXImageService iAnimaXImageService = (IAnimaXImageService) iAnimaXService;
                if (iAnimaXImageService != null && iAnimaXImageService.loadImage(interfaceC1285790jZ3, interfaceC1285780jZ2)) {
                    return;
                }
                String strLIZIZ = ((AnimaXLoaderRequest) interfaceC1285790jZ3).LIZIZ();
                if (strLIZIZ != null) {
                    uri = UriProtector.parse(strLIZIZ);
                }
                String path = uri.getPath();
                try {
                    C0VSP c0vsp = new C0VSP(path);
                    bArrLIZJ = C0WLZ.LIZJ(c0vsp, c0vsp.available());
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed to open local file:");
                    sbLIZ.append(path);
                    sbLIZ.append(" , reason: ");
                    sbLIZ.append(e);
                    AnimaXLog.LIZ("ResourceUtil", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (bArrLIZJ == null) {
                    c1288570jdXLIZIZ = C1288570jdX.LIZIZ(new Throwable("load file failed, getByteArrayFromFile returned null."));
                } else {
                    c1288570jdXLIZIZ = C1288570jdX.LIZ(bArrLIZJ);
                }
                ((AnimaXLoaderCompletionHandler) interfaceC1285780jZ2).LIZ(c1288570jdXLIZIZ);
            }
        });
        LIZ(new InterfaceC1288480jdO() { // from class: X.0jdT
            @Override // X.InterfaceC1288480jdO
            public final EnumC1288520jdS getScheme() {
                return EnumC1288520jdS.DATA_URL;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0, types: [X.0jZ2] */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v3, types: [com.lynx.animax.loader.AnimaXLoaderCompletionHandler] */
            @Override // X.InterfaceC1288480jdO
            public final void LIZ(InterfaceC1285790jZ3 interfaceC1285790jZ3, InterfaceC1285780jZ2 interfaceC1285780jZ2) {
                C1288570jdX c1288570jdXLIZIZ;
                try {
                    try {
                        AnimaXLoaderRequest animaXLoaderRequest = (AnimaXLoaderRequest) interfaceC1285790jZ3;
                        String strLIZIZ = animaXLoaderRequest.LIZIZ();
                        byte[] bArrDecode = Base64.decode(strLIZIZ.substring(strLIZIZ.indexOf("base64,") + 7), 0);
                        if (animaXLoaderRequest.LIZ() != null) {
                            c1288570jdXLIZIZ = new C1288570jdX(EnumC1288560jdW.BITMAP, new C1288540jdU(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length)));
                        } else {
                            c1288570jdXLIZIZ = C1288570jdX.LIZ(bArrDecode);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        c1288570jdXLIZIZ = C1288570jdX.LIZIZ(e);
                    }
                    interfaceC1285780jZ2 = (AnimaXLoaderCompletionHandler) interfaceC1285780jZ2;
                    interfaceC1285780jZ2.LIZ(c1288570jdXLIZIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    ((AnimaXLoaderCompletionHandler) interfaceC1285780jZ2).LIZ(null);
                    throw th;
                }
            }
        });
        LIZ(new InterfaceC1288480jdO() { // from class: X.0jdQ
            @Override // X.InterfaceC1288480jdO
            public final EnumC1288520jdS getScheme() {
                return EnumC1288520jdS.CONTENT_URI;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1288480jdO
            public final void LIZ(InterfaceC1285790jZ3 interfaceC1285790jZ3, InterfaceC1285780jZ2 interfaceC1285780jZ2) {
                C1288570jdX c1288570jdXLIZIZ;
                Uri uri;
                int iAvailable;
                C1285740jYy c1285740jYyLIZ = C1285740jYy.LIZ();
                c1285740jYyLIZ.getClass();
                Map map = (Map) ((ConcurrentHashMap) c1285740jYyLIZ.LIZ).get(C1285680jYs.LIZIZ);
                IAnimaXService iAnimaXService = null;
                if (map != null && map.containsKey(IAnimaXImageService.class)) {
                    iAnimaXService = (IAnimaXService) map.get(IAnimaXImageService.class);
                }
                IAnimaXImageService iAnimaXImageService = (IAnimaXImageService) iAnimaXService;
                if (iAnimaXImageService != null && iAnimaXImageService.loadImage(interfaceC1285790jZ3, interfaceC1285780jZ2)) {
                    return;
                }
                String strLIZIZ = ((AnimaXLoaderRequest) interfaceC1285790jZ3).LIZIZ();
                if (strLIZIZ != null && (uri = UriProtector.parse(strLIZIZ)) != null) {
                    Context context = AnimaX.LIZJ().LIZJ;
                    if (context == null) {
                        AnimaXLog.LIZ("ResourceUtil", "Context is null");
                    } else {
                        try {
                            InputStream inputStreamLJ = C09NT.LJ(context.getContentResolver(), uri);
                            if (inputStreamLJ == null) {
                                AnimaXLog.LIZ("ResourceUtil", "inputStream is null");
                            } else {
                                try {
                                    iAvailable = inputStreamLJ.available();
                                } catch (IOException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    iAvailable = 0;
                                }
                                byte[] bArrLIZJ = C0WLZ.LIZJ(inputStreamLJ, iAvailable);
                                if (bArrLIZJ != null) {
                                    c1288570jdXLIZIZ = C1288570jdX.LIZ(bArrLIZJ);
                                }
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("readUriFile has Exception:");
                            sbLIZ.append(e2.getMessage());
                            AnimaXLog.LIZ("ResourceUtil", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    c1288570jdXLIZIZ = C1288570jdX.LIZIZ(new Throwable("load file failed, getByteArrayFromContentUri returned null."));
                } else {
                    c1288570jdXLIZIZ = C1288570jdX.LIZIZ(new Throwable("load file failed, getByteArrayFromContentUri returned null."));
                }
                ((AnimaXLoaderCompletionHandler) interfaceC1285780jZ2).LIZ(c1288570jdXLIZIZ);
            }
        });
        if (interfaceC1288450jdL == null) {
            AnimaXLog.LIZ("AnimaXResourceLoaderHolder", "resourceFactory is null");
            return;
        }
        List<InterfaceC1288480jdO> listLIZ = interfaceC1288450jdL.LIZ();
        if (listLIZ == null) {
            AnimaXLog.LIZ("AnimaXResourceLoaderHolder", "loaders is null");
            return;
        }
        Iterator<InterfaceC1288480jdO> it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            LIZ(it2.next());
        }
    }

    public final void LIZ(InterfaceC1288480jdO interfaceC1288480jdO) {
        AnimaXLoader animaXLoaderCreate = AnimaXLoader.create(interfaceC1288480jdO);
        this.LIZIZ.add(animaXLoaderCreate);
        nativeRegisterLoaderForScheme(this.LIZ, animaXLoaderCreate, interfaceC1288480jdO.getScheme().ordinal());
    }
}
