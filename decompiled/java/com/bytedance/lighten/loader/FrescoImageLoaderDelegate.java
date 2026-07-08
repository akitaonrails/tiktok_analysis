package com.bytedance.lighten.loader;

import X.C01GW;
import X.C03IT;
import X.C1321360kUQ;
import X.C1322110kVd;
import X.C1322200kVm;
import X.C1322210kVn;
import X.C1325410kax;
import X.C1328130kfL;
import X.C1328500kfw;
import X.C1328570kg3;
import X.C1328730kgJ;
import X.C1328800kgQ;
import X.C1329310khF;
import X.C1329510khZ;
import X.C1330400kj0;
import X.C1330430kj3;
import X.C1330590kjJ;
import X.C1330760kja;
import X.C1331510kkn;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332160klq;
import X.C1332270km1;
import X.C1332730kml;
import X.C1336010ks3;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1325460kb2;
import X.InterfaceC1329940kiG;
import X.InterfaceC1330030kiP;
import X.InterfaceC1330390kiz;
import X.InterfaceC1331720kl8;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.net.Uri;
import com.bytedance.lighten.loader.FrescoImageLoaderDelegate;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: loaded from: classes21.dex */
public class FrescoImageLoaderDelegate implements InterfaceC1331720kl8 {
    public static volatile boolean sInitialized;
    public InterfaceC1325460kb2 mFrescoCache;
    public InterfaceC1330030kiP mImpl;

    static {
        C1332730kml.LJJJJI.getClass();
        C01GW c01gw = C1332730kml.LJII;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332730kml.LIZ;
        sInitialized = c01gw.getValue() != null;
    }

    private void tryInitFrescoCache() {
        if (this.mFrescoCache == null) {
            this.mFrescoCache = new C1325410kax();
        }
        if (this.mImpl == null) {
            this.mImpl = new FrescoImageLoaderImpl(this.mFrescoCache);
        }
    }

    @Override // X.InterfaceC1331720kl8
    public InterfaceC1325460kb2 getCache() {
        tryInitFrescoCache();
        return this.mFrescoCache;
    }

    public static /* synthetic */ boolean lambda$init$0(Uri uri) {
        return !C1332270km1.LIZIZ(uri);
    }

    public static /* synthetic */ boolean lambda$init$1(Uri uri) {
        return !C1332270km1.LIZIZ(uri);
    }

    @Override // X.InterfaceC1330030kiP
    public void display(C1331510kkn c1331510kkn) {
        if (!sInitialized) {
            int i = C2187451AjH.LIZ;
            C1330590kjJ.LJFF("FrescoImageLoaderDelegate", "display", " mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            tryInitFrescoCache();
            this.mImpl.display(c1331510kkn);
        }
    }

    @Override // X.InterfaceC1330030kiP
    public void download(C1331510kkn c1331510kkn) {
        boolean zLJI = MethodIDManager.LJI(137653);
        if (!sInitialized) {
            int i = C2187451AjH.LIZ;
            C1330590kjJ.LJFF("FrescoImageLoaderDelegate", "download", " mImpl is not initialized, call FrescoImageLoaderDelegate.init");
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        tryInitFrescoCache();
        this.mImpl.download(c1331510kkn);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1331720kl8
    public void init(InterfaceC1329940kiG interfaceC1329940kiG) {
        Boolean bool;
        if (sInitialized) {
            return;
        }
        Context context = interfaceC1329940kiG.getContext();
        Context context2 = C1330760kja.LIZ;
        C1330760kja.LIZ = C786410Ut5.N3(context);
        if (interfaceC1329940kiG.LIZ()) {
            C1329510khZ c1329510khZ = new C1329510khZ(interfaceC1329940kiG);
            Context context3 = interfaceC1329940kiG.getContext();
            interfaceC1329940kiG.LIZLLL();
            Boolean bool2 = Boolean.FALSE;
            Class<?> cls = C1322200kVm.LIZ;
            C1336010ks3.LIZIZ();
            if (C1322200kVm.LIZLLL) {
                C1328570kg3.LJIILL(C1322200kVm.LIZ, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
            } else {
                C1322200kVm.LIZLLL = true;
            }
            try {
                C1336010ks3.LIZIZ();
                C1322210kVn.LIZ(context3);
                C1336010ks3.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1328570kg3.LJIJ(C1322200kVm.LIZ, e, "Could not initialize SoLoader", new Object[0]);
                C1336010ks3.LIZIZ();
            }
            Context contextN3 = C786410Ut5.N3(context3);
            Class<?> cls2 = C1328130kfL.LJJIIZI;
            synchronized (C1328130kfL.class) {
                if (C1328130kfL.LJJIJ != null) {
                    C1328570kg3.LJIILL(C1328130kfL.LJJIIZI, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                }
                C1328130kfL.LJJIJ = new C1328130kfL(c1329510khZ);
                bool = Boolean.TRUE;
            }
            C1328130kfL.LJIILIIL().LJJIII = C1328730kgJ.LIZ;
            C1328130kfL.LJIILIIL().LJJIIJ = C1328730kgJ.LIZIZ;
            C1328130kfL.LJIILIIL().LJJIIJZLJL = C1328730kgJ.LIZJ;
            C1328130kfL.LJIILIIL().LJJIIZ = C1328730kgJ.LJFF;
            C1336010ks3.LIZIZ();
            C1321360kUQ c1321360kUQ = new C1321360kUQ(contextN3);
            C1322200kVm.LIZJ = c1321360kUQ;
            C1322110kVd.initialize(c1321360kUQ);
            C1336010ks3.LIZIZ();
            if (bool.equals(bool2)) {
                C1322200kVm.LIZLLL();
            }
            C1336010ks3.LIZIZ();
            C1330400kj0.LIZ.LIZIZ = c1329510khZ;
            C1328570kg3.LIZ.LIZJ(interfaceC1329940kiG.LIZIZ());
            C1328570kg3.LIZ = new C1330430kj3();
        }
        if (C1332160klq.LJIIIZ().LIZ()) {
            C1328500kfw.LIZLLL = new InterfaceC1330390kiz() { // from class: X.0kid
                @Override // X.InterfaceC1330390kiz
                public final boolean LIZ(Uri uri) {
                    return FrescoImageLoaderDelegate.lambda$init$1(uri);
                }
            };
        }
        if (C1332160klq.LJIIIZ().LIZIZ()) {
            C1329310khF.LLIZLLLIL = true;
        }
        tryInitFrescoCache();
        sInitialized = true;
    }

    @Override // X.InterfaceC1331720kl8
    public C1331670kl3 load(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("res://");
        sbLIZ.append(C1331660kl2.LJ);
        sbLIZ.append("/");
        sbLIZ.append(i);
        Uri uri = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("load resourceId: ");
        sbLIZ2.append(i);
        C1330590kjJ.LJIIIZ("FrescoImageLoaderDelegate", "load", C2188811AlT.LIZIZ(sbLIZ2));
        return new C1331670kl3(uri);
    }

    @Override // X.InterfaceC1330030kiP
    public void loadBitmap(C1331510kkn c1331510kkn) {
        if (!sInitialized) {
            int i = C2187451AjH.LIZ;
            C1330590kjJ.LJFF("FrescoImageLoaderDelegate", "loadBitmap", " mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            tryInitFrescoCache();
            this.mImpl.loadBitmap(c1331510kkn);
        }
    }

    @Override // X.InterfaceC1330030kiP
    public void trimDisk(int i) {
        if (!sInitialized) {
            int i2 = C2187451AjH.LIZ;
            C1330590kjJ.LJFF("FrescoImageLoaderDelegate", "trimDisk", " mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            tryInitFrescoCache();
            this.mImpl.trimDisk(i);
        }
    }

    @Override // X.InterfaceC1330030kiP
    public void trimMemory(int i) {
        if (!sInitialized) {
            int i2 = C2187451AjH.LIZ;
            C1330590kjJ.LJFF("FrescoImageLoaderDelegate", "trimMemory", " mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            tryInitFrescoCache();
            this.mImpl.trimMemory(i);
        }
    }

    @Override // X.InterfaceC1331720kl8
    public void init(C1332160klq c1332160klq) {
        if (sInitialized) {
            return;
        }
        Context contextLJFF = c1332160klq.LJFF();
        Context context = C1330760kja.LIZ;
        C1330760kja.LIZ = C786410Ut5.N3(contextLJFF);
        int iIntValue = 0;
        if (c1332160klq.LIZIZ.LJIILJJIL.LIZ() != null && ((Boolean) c1332160klq.LIZIZ.LJIILJJIL.LIZ()).booleanValue()) {
            C1328800kgQ c1328800kgQLJJJJJ = ImagePipelineConfigFactory.LJJJJJ(c1332160klq);
            C1322200kVm.LIZIZ(c1332160klq.LJFF(), c1328800kgQLJJJJJ);
            C1330400kj0.LIZ.LIZ = c1328800kgQLJJJJJ;
            if (c1332160klq.LIZIZ.LJIILIIL.LIZ() != null) {
                iIntValue = ((Integer) c1332160klq.LIZIZ.LJIILIIL.LIZ()).intValue();
            }
            C1328570kg3.LIZ.LIZJ(iIntValue);
            C1328570kg3.LIZ = new C1330430kj3();
        }
        tryInitFrescoCache();
        sInitialized = true;
        if (C1332160klq.LJIIIZ().LIZ()) {
            C1328500kfw.LIZLLL = new InterfaceC1330390kiz() { // from class: X.0kic
                @Override // X.InterfaceC1330390kiz
                public final boolean LIZ(Uri uri) {
                    return FrescoImageLoaderDelegate.lambda$init$0(uri);
                }
            };
        }
        if (C1332160klq.LJIIIZ().LIZIZ()) {
            C1329310khF.LLIZLLLIL = true;
        }
    }

    @Override // X.InterfaceC1331720kl8
    public C1331670kl3 load(File file) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load file: ");
        sbLIZ.append(file);
        C1330590kjJ.LJIIIZ("FrescoImageLoaderDelegate", "load", C2188811AlT.LIZIZ(sbLIZ));
        return new C1331670kl3(Uri.fromFile(file));
    }

    @Override // X.InterfaceC1331720kl8
    public C1331670kl3 load(C03IT c03it) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load urlModel: ");
        sbLIZ.append(c03it);
        C1330590kjJ.LJIIIZ("FrescoImageLoaderDelegate", "load", C2188811AlT.LIZIZ(sbLIZ));
        return new C1331670kl3(c03it);
    }

    @Override // X.InterfaceC1331720kl8
    public C1331670kl3 load(Uri uri) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load uri: ");
        sbLIZ.append(uri);
        C1330590kjJ.LJIIIZ("FrescoImageLoaderDelegate", "load", C2188811AlT.LIZIZ(sbLIZ));
        return new C1331670kl3(uri);
    }

    @Override // X.InterfaceC1331720kl8
    public C1331670kl3 load(Object obj) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load anyObj: ");
        sbLIZ.append(obj);
        C1330590kjJ.LJIIIZ("FrescoImageLoaderDelegate", "load", C2188811AlT.LIZIZ(sbLIZ));
        return new C1331670kl3(obj);
    }

    @Override // X.InterfaceC1331720kl8
    public C1331670kl3 load(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load url: ");
        sbLIZ.append(str);
        C1330590kjJ.LJIIIZ("FrescoImageLoaderDelegate", "load", C2188811AlT.LIZIZ(sbLIZ));
        return new C1331670kl3(str);
    }
}
