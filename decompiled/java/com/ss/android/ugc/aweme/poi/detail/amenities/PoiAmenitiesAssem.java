package com.ss.android.ugc.aweme.poi.detail.amenities;

import X.C0CAU;
import X.C1173300gdc;
import X.C1174850gg7;
import X.C1175130ggZ;
import X.C1181890grT;
import X.C1182410gsJ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1185600gxS;
import X.C1189060h32;
import X.C1195630hDd;
import X.C1558520qew;
import X.C2211631BhB;
import X.C295220Bhg;
import X.C298370Bml;
import X.C339190DRl;
import X.C426160GnO;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS118S0100000_18;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAmenitiesAssem extends BaseSlashReusedComponent<PoiAmenitiesComponentData> {
    public C1175130ggZ LLJL;
    public C426160GnO LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e2f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:29|(1:31)(1:51)|32|(1:34)(1:47)|(2:43|(0)(12:46|42|108|54|106|55|(1:57)|58|63|(1:65)|66|(2:99|(6:75|(2:102|(0)(3:105|(1:84)(1:98)|85))(1:79)|80|(1:82)(0)|(0)(0)|85)(0))(4:68|(2:72|(1:74)(0))|75|(3:77|102|(0)(4:80|(0)(0)|(0)(0)|85))(0))))(1:38)|39|(1:41)(0)|42|108|54|106|55|(0)|58|63|(0)|66|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cf, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d0, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
        r1 = new X.C098200Yq(r2);
        X.C189200o6.m2constructorimpl(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0186 A[PHI: r20
      0x0186: PHI (r20v1 java.lang.String) = (r20v0 java.lang.String), (r20v5 java.lang.String), (r20v5 java.lang.String) binds: [B:100:0x0182, B:76:0x00fa, B:78:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018c A[PHI: r20 r21
      0x018c: PHI (r20v2 java.lang.String) = (r20v1 java.lang.String), (r20v4 java.lang.String) binds: [B:103:0x0188, B:81:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r21v1 java.lang.Object) = (r21v0 java.lang.Object), (r21v3 java.lang.Object) binds: [B:103:0x0188, B:81:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6 A[PHI: r15
      0x00a6: PHI (r15v1 java.lang.String) = (r15v0 java.lang.String), (r15v3 java.lang.String) binds: [B:44:0x00a3, B:40:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af A[PHI: r12
      0x00af: PHI (r12v1 java.lang.String) = (r12v0 java.lang.String), (r12v3 java.lang.String) binds: [B:49:0x00ac, B:30:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5 A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:55:0x00bd, B:57:0x00c5, B:58:0x00c9), top: B:106:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp() {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.amenities.PoiAmenitiesAssem.tp():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC1173990gej
    public final void fm1() {
        C1185600gxS c1185600gxS;
        C1174850gg7.LJII(this);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, C1558520qew.LJIIL(this));
        C1189060h32.LJJ("enter_from", "poi_detail", linkedHashMap);
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        C1189060h32.LJJ("poi_id", (c1173300gdcLJ == null || (c1185600gxS = (C1185600gxS) c1173300gdcLJ.LIZ) == null) ? null : c1185600gxS.LIZ, linkedHashMap);
        PoiListApi.PoiDetailResponse poiDetailResponseLIZ = C1181890grT.LIZ(C1189060h32.LJIIJ(this));
        C1189060h32.LIZ(poiDetailResponseLIZ != null ? poiDetailResponseLIZ.getCollectInfo() : null, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(getContentView()));
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_amenities_module_show", linkedHashMap, c1185050gwZ);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        String strLJFF = C1174850gg7.LJFF(this);
        if (strLJFF == null) {
            strLJFF = S2();
        }
        C1185430gxB.LJJIJIL(c1185430gxB, interfaceC665370Q7zLJIIL, strLJFF, S2(), new C1185050gwZ(PageFinder.via(getContentView())), 16);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C1195630hDd tvViewAll;
        C1195630hDd tvViewAll2;
        super.onViewCreated(view);
        this.LLJL = (C1175130ggZ) view.findViewById(R.id.y3o);
        this.LLJLIL = (C426160GnO) view.findViewById(R.id.id_);
        C1175130ggZ c1175130ggZ = this.LLJL;
        if (c1175130ggZ != null && (tvViewAll2 = c1175130ggZ.getTvViewAll()) != null) {
            C339190DRl.LIZIZ(tvViewAll2);
        }
        C426160GnO c426160GnO = this.LLJLIL;
        if (c426160GnO != null) {
            c426160GnO.setChildHiddenCallback(new AwS562S0100000_18(this, 992));
        }
        C1175130ggZ c1175130ggZ2 = this.LLJL;
        if (c1175130ggZ2 != null && (tvViewAll = c1175130ggZ2.getTvViewAll()) != null) {
            C2211631BhB.LJ(tvViewAll, new AwS597S0100000_18(this, 293));
        }
        C426160GnO c426160GnO2 = this.LLJLIL;
        if (c426160GnO2 != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 16), c426160GnO2);
        }
        C1175130ggZ c1175130ggZ3 = this.LLJL;
        if (c1175130ggZ3 != null) {
            String strLJFF = C1174850gg7.LJFF(this);
            if (strLJFF == null) {
                strLJFF = "";
            }
            C1175130ggZ.LIZ(c1175130ggZ3, strLJFF);
        }
        C1175130ggZ c1175130ggZ4 = this.LLJL;
        if (c1175130ggZ4 != null) {
            c1175130ggZ4.setStandardDebounceOnClickListener(new ACListenerS153S0100000_18(this, 56));
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void tp(PoiAmenitiesComponentData poiAmenitiesComponentData) {
        super.up(poiAmenitiesComponentData);
        AwS419S0200000_18 awS419S0200000_18 = new AwS419S0200000_18(poiAmenitiesComponentData, this, 62);
        if (C298370Bml.LIZ() && !C295220Bhg.LIZJ()) {
            C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS118S0100000_18(awS419S0200000_18, 33));
        } else {
            awS419S0200000_18.invoke();
        }
    }
}
