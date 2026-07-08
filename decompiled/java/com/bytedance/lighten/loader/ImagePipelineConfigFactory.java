package com.bytedance.lighten.loader;

import X.AbstractC1332040kle;
import X.C0V7X;
import X.C0VSJ;
import X.C1320890kTf;
import X.C1322200kVm;
import X.C1322210kVn;
import X.C1324810kZz;
import X.C1324940kaC;
import X.C1328130kfL;
import X.C1328150kfN;
import X.C1328160kfO;
import X.C1328220kfU;
import X.C1328640kgA;
import X.C1328650kgB;
import X.C1328680kgE;
import X.C1328770kgN;
import X.C1328790kgP;
import X.C1328800kgQ;
import X.C1328810kgR;
import X.C1329010kgl;
import X.C1329020kgm;
import X.C1329030kgn;
import X.C1329040kgo;
import X.C1329060kgq;
import X.C1329070kgr;
import X.C1329150kgz;
import X.C1329180kh2;
import X.C1329260khA;
import X.C1329430khR;
import X.C1329540khc;
import X.C1329680khq;
import X.C1329770khz;
import X.C1330060kiS;
import X.C1330180kie;
import X.C1330590kjJ;
import X.C1330620kjM;
import X.C1330780kjc;
import X.C1330830kjh;
import X.C1330850kjj;
import X.C1330890kjn;
import X.C1332160klq;
import X.C1333820koW;
import X.C1333960kok;
import X.C1335570krL;
import X.C1338960kwo;
import X.C1EOZ;
import X.C2187451AjH;
import X.C786410Ut5;
import X.InterfaceC1320070kSL;
import X.InterfaceC1325590kbF;
import X.InterfaceC1325670kbN;
import X.InterfaceC1327000kdW;
import X.InterfaceC1328030kfB;
import X.InterfaceC1328230kfV;
import X.InterfaceC1328250kfX;
import X.InterfaceC1328710kgH;
import X.InterfaceC1330230kij;
import X.InterfaceC1330460kj6;
import X.InterfaceC1330810kjf;
import X.InterfaceC658750Psf;
import Y.ARunnableS5S1110000_20;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.fresco.heif.HeifDecoder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.fackbook.imagepipeline.IImagePipelineOutService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ImagePipelineConfigFactory implements IImagePipelineOutService {
    public final C1332160klq LIZ;

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final void LJIILIIL() {
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final void LJIILLIIL() {
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final void LJIJJ() {
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final void LJJJ() {
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Bitmap.Config LIZ() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC1320070kSL<C1329770khz> LIZIZ() {
        if (this.LIZ.LJFF() == null) {
            return null;
        }
        ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(this.LIZ.LJFF(), "activity");
        C1332160klq c1332160klq = this.LIZ;
        return new C1329070kgr(activityManager, (int) (c1332160klq.LIZIZ.LJII.LIZ() == null ? 0L : ((Long) c1332160klq.LIZIZ.LJII.LIZ()).longValue()));
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Long LIZJ() {
        C1332160klq c1332160klq = this.LIZ;
        return Long.valueOf(c1332160klq.LIZIZ.LJIIIZ.LIZ() == null ? 0L : ((Long) c1332160klq.LIZIZ.LJIIIZ.LIZ()).longValue());
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LIZLLL() {
        C1332160klq c1332160klq = this.LIZ;
        return Boolean.valueOf(c1332160klq.LIZIZ.LJJJJLL.LIZ() != null && ((Boolean) c1332160klq.LIZIZ.LJJJJLL.LIZ()).booleanValue());
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJ() {
        C1332160klq c1332160klq = this.LIZ;
        return Boolean.valueOf(c1332160klq.LIZIZ.LJJJJIZL.LIZ() != null && ((Boolean) c1332160klq.LIZIZ.LJJJJIZL.LIZ()).booleanValue());
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC1330460kj6 LJFF() {
        return new C1329150kgz();
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC1330230kij LJII() {
        return new C1329540khc();
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC1328230kfV LJIIIZ() {
        return new C1329040kgo(new C1330850kjj());
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJIIJ() {
        C1332160klq c1332160klq = this.LIZ;
        return Boolean.valueOf(c1332160klq.LIZIZ.LJJJJJ.LIZ() != null && ((Boolean) c1332160klq.LIZIZ.LJJJJJ.LIZ()).booleanValue());
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Integer LJIIJJI() {
        return 30000;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC1320070kSL<C1329770khz> LJIIL() {
        ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(this.LIZ.LJFF(), "activity");
        InterfaceC1330810kjf interfaceC1330810kjf = (InterfaceC1330810kjf) this.LIZ.LIZIZ.LJJIIJZLJL.LIZ();
        boolean zBooleanValue = ((Boolean) this.LIZ.LIZIZ.LJJIIZ.LIZ()).booleanValue();
        return (interfaceC1330810kjf.enable() || zBooleanValue) ? new C1329070kgr(activityManager, (int) this.LIZ.LJIIJ(), interfaceC1330810kjf.enable(), interfaceC1330810kjf.LIZ(), zBooleanValue) : new C1329070kgr(activityManager, (int) this.LIZ.LJIIJ());
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJIILJJIL() {
        C1332160klq c1332160klq = this.LIZ;
        return Boolean.valueOf(c1332160klq.LIZIZ.LJIIIIZZ.LIZ() != null && ((Boolean) c1332160klq.LIZIZ.LJIIIIZZ.LIZ()).booleanValue());
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final C1329030kgn LJIILL() {
        return LJJJJIZL(this.LIZ);
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC1328030kfB LJIJI() {
        return new C1EOZ(Runtime.getRuntime().availableProcessors());
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final C1329030kgn LJIJJLI() {
        return LJJJJI(this.LIZ);
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final C1328770kgN LJJI() {
        if (!this.LIZ.LJIILJJIL()) {
            return null;
        }
        C1330060kiS c1330060kiS = new C1330060kiS();
        c1330060kiS.LIZ = C0V7X.LIZ;
        c1330060kiS.LIZIZ = ((Number) this.LIZ.LIZIZ.LJJJJI.LIZ()).intValue();
        return new C1328770kgN(new C1328790kgP(c1330060kiS));
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final HashMap<String, C1329030kgn> LJJIFFI() {
        return LJJJIL(this.LIZ);
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final C1328130kfL LJJIII() {
        C1328130kfL c1328130kfL = new C1328130kfL(C1328800kgQ.LJII());
        if (LJIILJJIL() != null && LJIILJJIL().booleanValue()) {
            c1328130kfL.LJJIIJ = true;
            c1328130kfL.LJJIIJZLJL = LIZJ().longValue();
        }
        return c1328130kfL;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC1328250kfX LJJIIJ() {
        return this.LIZ.LJIILJJIL() ? C0V7X.LIZ : C1328220kfU.LIZIZ();
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC1320070kSL<Boolean> LJJIIZ() {
        return new InterfaceC1320070kSL() { // from class: X.0kix
            @Override // X.InterfaceC1320070kSL
            public final Object get() {
                return Boolean.TRUE;
            }
        };
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC1328710kgH<? extends C1328680kgE> LJJIIZI() {
        return this.LIZ.LJIIIIZZ() != null ? new C1333960kok(this.LIZ.LJIIIIZZ()) : new C1338960kwo();
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Set<InterfaceC1325670kbN> LJJIJ() {
        C1332160klq c1332160klq = this.LIZ;
        if (c1332160klq.LIZIZ.LJIJJ.LIZ() == null || !((Boolean) c1332160klq.LIZIZ.LJIJJ.LIZ()).booleanValue()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        C1333820koW c1333820koW = new C1333820koW();
        C1330890kjn.LIZ = c1333820koW;
        hashSet.add(c1333820koW);
        LJJJJ(this.LIZ);
        return hashSet;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final C1329060kgq LJJIJIIJI() {
        C1329010kgl c1329010kgl = new C1329010kgl();
        c1329010kgl.LIZ(C1329180kh2.LIZ, new C1329180kh2(), new C1328650kgB());
        c1329010kgl.LIZ(HeifDecoder.VVIC_FORMAT, new C1328640kgA(), new HeifDecoder.HeifFormatDecoder(false));
        c1329010kgl.LIZ(HeifDecoder.HEIF_FORMAT, new C1328640kgA(), new HeifDecoder.HeifFormatDecoder(new C1328770kgN(new C1328790kgP(new C1330060kiS())).LIZIZ(0)));
        return new C1329060kgq(c1329010kgl);
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final C1328150kfN LJJIJIIJIL() {
        C1328160kfO c1328160kfO = new C1328160kfO(null);
        C1332160klq c1332160klq = this.LIZ;
        if (c1332160klq.LIZIZ.LJJIIJ.LIZ() != null && ((Boolean) c1332160klq.LIZIZ.LJJIIJ.LIZ()).booleanValue()) {
            c1328160kfO.LJ = true;
        }
        if (this.LIZ.LJIILIIL()) {
            c1328160kfO.LIZ = true;
            c1328160kfO.LIZIZ = 0;
            c1328160kfO.LIZJ = Integer.MAX_VALUE;
            c1328160kfO.LIZLLL = false;
        }
        return new C1328150kfN(c1328160kfO);
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC1327000kdW LJJIZ() {
        C1330780kjc c1330780kjc;
        C1332160klq c1332160klq = this.LIZ;
        if (c1332160klq.LIZIZ.LJIJ.LIZ() != null && ((Boolean) c1332160klq.LIZIZ.LJIJ.LIZ()).booleanValue()) {
            return C1330180kie.LJIILJJIL();
        }
        synchronized (C1330780kjc.class) {
            if (C1330780kjc.LIZ == null) {
                C1330780kjc.LIZ = new C1330780kjc();
            }
            c1330780kjc = C1330780kjc.LIZ;
        }
        return c1330780kjc;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC1320070kSL<C1329770khz> LJJJI() {
        ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(this.LIZ.LJFF(), "activity");
        C1332160klq c1332160klq = this.LIZ;
        return new C1329070kgr(activityManager, (int) (c1332160klq.LIZIZ.LJI.LIZ() == null ? 0L : ((Long) c1332160klq.LIZIZ.LJI.LIZ()).longValue()));
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Context getContext() {
        return this.LIZ.LJFF();
    }

    public ImagePipelineConfigFactory() {
        C1332160klq c1332160klqLJIIIZ = C1332160klq.LJIIIZ();
        this.LIZ = c1332160klqLJIIIZ;
        if (c1332160klqLJIIIZ.LIZLLL() == null) {
            return;
        }
        if (c1332160klqLJIIIZ.LJIIJJI() >= 0) {
            C1324940kaC.LIZ = c1332160klqLJIIIZ.LJIIJJI();
        }
        if (c1332160klqLJIIIZ.LIZIZ.LJIILL.LIZ() != null && ((Boolean) c1332160klqLJIIIZ.LIZIZ.LJIILL.LIZ()).booleanValue()) {
            C1324810kZz c1324810kZzLJI = C1324810kZz.LJI();
            String[] strArr = (String[]) c1332160klqLJIIIZ.LIZIZ.LJIIZILJ.LIZ();
            c1324810kZzLJI.LIZ = true;
            c1324810kZzLJI.LIZJ = strArr;
        }
        if (c1332160klqLJIIIZ.LIZIZ.LJIILLIIL.LIZ() != null && ((Boolean) c1332160klqLJIIIZ.LIZIZ.LJIILLIIL.LIZ()).booleanValue()) {
            C1324810kZz.LJI().LIZIZ = true;
        }
        AnimatedDrawable2.LLJJJJLIIL = new C1329680khq(c1332160klqLJIIIZ);
        if (c1332160klqLJIIIZ.LIZIZ.LJJIII.LIZ() != null) {
            C1322210kVn.LIZIZ = new C1329260khA(c1332160klqLJIIIZ);
        }
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Integer LJIIIIZZ() {
        LJJIJIIJIL();
        return 0;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC1325590kbF LJIIZILJ() {
        return C1324810kZz.LJI();
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC1320070kSL<C1329770khz> LJJIJLIJ() {
        if (LJIILJJIL() == null || !LJIILJJIL().booleanValue()) {
            return null;
        }
        ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(this.LIZ.LJFF(), "activity");
        C1332160klq c1332160klq = this.LIZ;
        return new C1329070kgr(activityManager, (int) (c1332160klq.LIZIZ.LJIIJ.LIZ() == null ? 0L : ((Long) c1332160klq.LIZIZ.LJIIJ.LIZ()).longValue()));
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJI() {
        return Boolean.TRUE;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJIJ() {
        return Boolean.TRUE;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJIL() {
        return Boolean.FALSE;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJJ() {
        return Boolean.FALSE;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJJII() {
        return Boolean.FALSE;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJJIIJZLJL() {
        return Boolean.FALSE;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJJIJIL() {
        return Boolean.FALSE;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJJIJL() {
        return Boolean.TRUE;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJJIL() {
        return Boolean.TRUE;
    }

    public static HashMap<String, C1329030kgn> LJJJIL(C1332160klq c1332160klq) {
        long jLongValue;
        HashMap<String, C1329030kgn> map = new HashMap<>();
        Map map2 = (Map) c1332160klq.LIZIZ.LJJIJIIJI.LIZ();
        if (map2 != null) {
            for (String str : map2.keySet()) {
                if (str != null) {
                    if (map2.get(str) != null) {
                        jLongValue = ((Long) map2.get(str)).longValue();
                    } else {
                        jLongValue = 0;
                    }
                    C1329020kgm c1329020kgm = new C1329020kgm(c1332160klq.LJFF());
                    c1329020kgm.LIZIZ = new C1320890kTf(new C0VSJ(c1332160klq.LJII(), "fresco_custom_cache"));
                    c1329020kgm.LIZ = str;
                    if (jLongValue > 0) {
                        c1329020kgm.LIZJ = ((Long) map2.get(str)).longValue();
                    }
                    c1329020kgm.LJFF = C1330830kjh.LIZ();
                    if (c1332160klq.LJ() != null) {
                        c1329020kgm.LJ = new C1335570krL(c1332160klq.LJ());
                    }
                    map.put(str, c1329020kgm.LIZ());
                }
            }
        }
        return map;
    }

    public static void LJJJJ(C1332160klq c1332160klq) {
        C1330620kjM.LJII = c1332160klq.LJFF();
        final InterfaceC658750Psf interfaceC658750Psf = (InterfaceC658750Psf) c1332160klq.LIZIZ.LJJ.LIZ();
        ((ArrayList) C1330620kjM.LIZ).add(new AbstractC1332040kle(interfaceC658750Psf) { // from class: X.0klP
            public final InterfaceC658750Psf LIZ;

            {
                this.LIZ = interfaceC658750Psf;
            }

            @Override // X.InterfaceC1330770kjb
            public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
                if (str != null) {
                    C0STY.LIZ.execute(new ARunnableS5S1110000_20(jSONObject, str, z, 0));
                }
                this.LIZ.onImageLoaded(z, str, jSONObject);
            }
        });
        boolean z = false;
        C1330620kjM.LJ = false;
        C1330620kjM.LJFF = true;
        if (c1332160klq.LIZIZ.LJIJJLI.LIZ() != null && ((Boolean) c1332160klq.LIZIZ.LJIJJLI.LIZ()).booleanValue()) {
            z = true;
        }
        C1330620kjM.LJI = z;
    }

    public static C1329030kgn LJJJJI(C1332160klq c1332160klq) {
        C1329020kgm c1329020kgm = new C1329020kgm(c1332160klq.LJFF());
        c1329020kgm.LIZIZ = new C1320890kTf(c1332160klq.LJII());
        c1329020kgm.LIZ = "fresco_cache";
        long jLongValue = 0;
        if (c1332160klq.LIZIZ.LJIIJJI.LIZ() != null && ((Long) c1332160klq.LIZIZ.LJIIJJI.LIZ()).longValue() > 0) {
            if (c1332160klq.LIZIZ.LJIIJJI.LIZ() != null) {
                jLongValue = ((Long) c1332160klq.LIZIZ.LJIIJJI.LIZ()).longValue();
            }
            c1329020kgm.LIZJ = jLongValue;
        }
        c1329020kgm.LJFF = C1330830kjh.LIZ();
        if (c1332160klq.LJ() != null) {
            c1329020kgm.LJ = new C1335570krL(c1332160klq.LJ());
        }
        return c1329020kgm.LIZ();
    }

    public static C1329030kgn LJJJJIZL(C1332160klq c1332160klq) {
        C1329020kgm c1329020kgm = new C1329020kgm(c1332160klq.LJFF());
        c1329020kgm.LIZIZ = new C1320890kTf(c1332160klq.LJII());
        c1329020kgm.LIZ = "fresco_small_cache";
        long jLongValue = 0;
        if (c1332160klq.LIZIZ.LJIIL.LIZ() != null && ((Long) c1332160klq.LIZIZ.LJIIL.LIZ()).longValue() > 0) {
            if (c1332160klq.LIZIZ.LJIIL.LIZ() != null) {
                jLongValue = ((Long) c1332160klq.LIZIZ.LJIIL.LIZ()).longValue();
            }
            c1329020kgm.LIZJ = jLongValue;
        }
        c1329020kgm.LJFF = C1330830kjh.LIZ();
        if (c1332160klq.LJ() != null) {
            c1329020kgm.LJ = new C1335570krL(c1332160klq.LJ());
        }
        return c1329020kgm.LIZ();
    }

    public static C1328800kgQ LJJJJJ(C1332160klq c1332160klq) {
        boolean z;
        long jLongValue;
        if (C1322200kVm.LIZLLL) {
            int i = C2187451AjH.LIZ;
            C1330590kjJ.LJFF("ImagePipelineConfigFactory", "getImagePipelineConfig", "Fresco has been initialized, lighten will override the fresco config!!!");
        }
        if (c1332160klq.LJIIJJI() >= 0) {
            C1324940kaC.LIZ = c1332160klq.LJIIJJI();
        }
        C1328810kgR c1328810kgRLJIIL = C1328800kgQ.LJIIL(c1332160klq.LJFF());
        c1328810kgRLJIIL.LJIIIIZZ = LJJJJI(c1332160klq);
        c1328810kgRLJIIL.LJIILIIL = LJJJJIZL(c1332160klq);
        c1328810kgRLJIIL.LJIILJJIL = LJJJIL(c1332160klq);
        c1328810kgRLJIIL.LIZ = c1332160klq.LIZLLL();
        c1328810kgRLJIIL.LJ = true;
        c1328810kgRLJIIL.LJIILLIIL.LJFF = c1332160klq.LIZ;
        if (c1332160klq.LJIILJJIL()) {
            C1329430khR c1329430khR = C0V7X.LIZ;
            c1328810kgRLJIIL.LJIIIZ = c1329430khR;
            C1330060kiS c1330060kiS = new C1330060kiS();
            c1330060kiS.LIZ = c1329430khR;
            c1328810kgRLJIIL.LJIIJJI = new C1328770kgN(new C1328790kgP(c1330060kiS));
        }
        if (c1332160klq.LJIIIIZZ() != null) {
            c1328810kgRLJIIL.LJIIJ = new C1333960kok(c1332160klq.LJIIIIZZ());
        } else {
            try {
                c1328810kgRLJIIL.LJIIJ = new C1338960kwo();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(c1332160klq.LJFF(), "activity");
        InterfaceC1330810kjf interfaceC1330810kjf = (InterfaceC1330810kjf) c1332160klq.LIZIZ.LJJIIJZLJL.LIZ();
        boolean zBooleanValue = ((Boolean) c1332160klq.LIZIZ.LJJIIZ.LIZ()).booleanValue();
        if (!interfaceC1330810kjf.enable() && !zBooleanValue) {
            c1328810kgRLJIIL.LIZIZ = new C1329070kgr(activityManager, (int) c1332160klq.LJIIJ());
        } else {
            c1328810kgRLJIIL.LIZIZ = new C1329070kgr(activityManager, (int) c1332160klq.LJIIJ(), interfaceC1330810kjf.enable(), interfaceC1330810kjf.LIZ(), zBooleanValue);
        }
        if (c1332160klq.LIZIZ.LJJJJJ.LIZ() != null && ((Boolean) c1332160klq.LIZIZ.LJJJJJ.LIZ()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        long jLongValue2 = 0;
        if (z) {
            c1328810kgRLJIIL.LJIIZILJ = true;
            if (c1332160klq.LIZIZ.LJII.LIZ() == null) {
                jLongValue = 0;
            } else {
                jLongValue = ((Long) c1332160klq.LIZIZ.LJII.LIZ()).longValue();
            }
            c1328810kgRLJIIL.LIZJ = new C1329070kgr(activityManager, (int) jLongValue);
        }
        if (c1332160klq.LIZIZ.LJI.LIZ() != null) {
            jLongValue2 = ((Long) c1332160klq.LIZIZ.LJI.LIZ()).longValue();
        }
        final int i2 = (int) jLongValue2;
        c1328810kgRLJIIL.LJFF = new InterfaceC1320070kSL<C1329770khz>(i2) { // from class: X.0kgs
            public final int LIZ;

            @Override // X.InterfaceC1320070kSL
            public final C1329770khz get() {
                int i3 = this.LIZ;
                if (i3 <= 0) {
                    int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
                    i3 = iMin < 16777216 ? 1048576 : iMin < 33554432 ? 2097152 : 4194304;
                }
                return new C1329770khz(i3, Integer.MAX_VALUE, i3, i3 / 8);
            }

            {
                this.LIZ = i2;
            }
        };
        if (c1332160klq.LIZIZ.LJIJ.LIZ() != null && ((Boolean) c1332160klq.LIZIZ.LJIJ.LIZ()).booleanValue()) {
            c1328810kgRLJIIL.LJII = C1330180kie.LJIILJJIL();
        }
        if (c1332160klq.LIZIZ.LJIILL.LIZ() != null && ((Boolean) c1332160klq.LIZIZ.LJIILL.LIZ()).booleanValue()) {
            C1324810kZz c1324810kZzLJI = C1324810kZz.LJI();
            String[] strArr = (String[]) c1332160klq.LIZIZ.LJIIZILJ.LIZ();
            c1324810kZzLJI.LIZ = true;
            c1324810kZzLJI.LIZJ = strArr;
        }
        if (c1332160klq.LIZIZ.LJIILLIIL.LIZ() != null && ((Boolean) c1332160klq.LIZIZ.LJIILLIIL.LIZ()).booleanValue()) {
            C1324810kZz.LJI().LIZIZ = true;
        }
        C1329010kgl c1329010kgl = new C1329010kgl();
        c1329010kgl.LIZ(C1329180kh2.LIZ, new C1329180kh2(), new C1328650kgB());
        c1329010kgl.LIZ(HeifDecoder.VVIC_FORMAT, new C1328640kgA(), new HeifDecoder.HeifFormatDecoder(false));
        c1329010kgl.LIZ(HeifDecoder.HEIF_FORMAT, new C1328640kgA(), new HeifDecoder.HeifFormatDecoder(new C1328770kgN(new C1328790kgP(new C1330060kiS())).LIZIZ(0)));
        c1328810kgRLJIIL.LJIILL = new C1329060kgq(c1329010kgl);
        if (c1332160klq.LIZIZ.LJIJJ.LIZ() != null && ((Boolean) c1332160klq.LIZIZ.LJIJJ.LIZ()).booleanValue()) {
            HashSet hashSet = new HashSet();
            C1333820koW c1333820koW = new C1333820koW();
            C1330890kjn.LIZ = c1333820koW;
            hashSet.add(c1333820koW);
            c1328810kgRLJIIL.LJIIL = hashSet;
            LJJJJ(c1332160klq);
        }
        AnimatedDrawable2.LLJJJJLIIL = new C1329680khq(c1332160klq);
        if (c1332160klq.LIZIZ.LJJIII.LIZ() != null) {
            C1322210kVn.LIZIZ = new C1329260khA(c1332160klq);
        }
        if (c1332160klq.LIZIZ.LJJIIJ.LIZ() != null && ((Boolean) c1332160klq.LIZIZ.LJJIIJ.LIZ()).booleanValue()) {
            c1328810kgRLJIIL.LJIILLIIL.LJ = true;
        }
        return new C1328800kgQ(c1328810kgRLJIIL);
    }
}
