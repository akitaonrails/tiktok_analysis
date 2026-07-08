package com.ss.android.ugc.aweme.poi.mapdetail.assem;

import X.C1165940gRk;
import X.C1175070ggT;
import X.C1175680ghS;
import X.C1176430gif;
import X.C1176580giu;
import X.C1176590giv;
import X.C1177960gl8;
import X.C1178480gly;
import X.C1179570gnj;
import X.C2188811AlT;
import X.InterfaceC1177250gjz;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS419S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailMapAssem$loadAbility$1 implements IPoiMapDetailMapAssemAbility {
    public final /* synthetic */ PoiMapDetailMapAssem LL;

    @Override // com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailMapAssemAbility
    public final void Bj1() {
        C1175680ghS c1175680ghS;
        C1176590giv accInitData;
        PoiLocation poiLocation;
        PoiMapDetailMapAssem poiMapDetailMapAssem = this.LL;
        InterfaceC1177250gjz interfaceC1177250gjz = poiMapDetailMapAssem.LLJILJILJ;
        if (interfaceC1177250gjz == null || (c1175680ghS = poiMapDetailMapAssem.So().LLILZIL) == null || (accInitData = c1175680ghS.getAccInitData()) == null || (poiLocation = accInitData.centerPoiLocation) == null) {
            return;
        }
        Double d = poiLocation.lat;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = poiLocation.lng;
        C1177960gl8 c1177960gl8 = new C1177960gl8(dDoubleValue, d2 != null ? d2.doubleValue() : 0.0d);
        C1179570gnj c1179570gnj = poiMapDetailMapAssem.LLJJIJI;
        if (c1179570gnj != null) {
            c1179570gnj.LLILZ = true;
        }
        Float fValueOf = Float.valueOf(interfaceC1177250gjz.LJIJJ());
        C1178480gly c1178480gly = new C1178480gly();
        c1178480gly.LIZ = true;
        c1178480gly.LIZIZ = 300L;
        c1178480gly.LIZJ = new AwS419S0200000_18(poiMapDetailMapAssem, this, 73);
        c1178480gly.LIZLLL = new AwS419S0200000_18(poiMapDetailMapAssem, this, 74);
        interfaceC1177250gjz.LIZIZ(c1177960gl8, fValueOf, c1178480gly);
    }

    @Override // com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailMapAssemAbility
    public final boolean E32() {
        return this.LL.ap();
    }

    @Override // com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailMapAssemAbility
    public final void FM1() {
        PoiMapDetailMapAssem poiMapDetailMapAssem = this.LL;
        C1176430gif c1176430gif = poiMapDetailMapAssem.Oo().getState().LL;
        poiMapDetailMapAssem.ep(c1176430gif != null ? c1176430gif.LIZ : null, false, true);
    }

    @Override // com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailMapAssemAbility
    public final void qO1() {
        this.LL.qO1();
    }

    public PoiMapDetailMapAssem$loadAbility$1(PoiMapDetailMapAssem poiMapDetailMapAssem) {
        this.LL = poiMapDetailMapAssem;
    }

    @Override // com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailMapAssemAbility
    public final MapBounds Gj1(boolean z) {
        Float fValueOf;
        C1165940gRk c1165940gRkLJJIJIIJIL;
        InterfaceC1177250gjz interfaceC1177250gjz = this.LL.LLJILJILJ;
        C1176580giu c1176580giu = null;
        if (interfaceC1177250gjz != null) {
            fValueOf = Float.valueOf(interfaceC1177250gjz.LJIJJ());
        } else {
            fValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getEffectiveMapWindow correctBounds: ");
        sbLIZ.append(z);
        sbLIZ.append(", currentZoom: ");
        sbLIZ.append(fValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1177250gjz interfaceC1177250gjz2 = this.LL.LLJILJILJ;
        if (interfaceC1177250gjz2 != null && (c1165940gRkLJJIJIIJIL = interfaceC1177250gjz2.LJJIJIIJIL()) != null && (c1176580giu = c1165940gRkLJJIJIIJIL.bounds) != null && z) {
            this.LL.getClass();
            double dLo = PoiMapDetailMapAssem.Lo(c1176580giu);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getEffectiveMapWindow current shortest side: ");
            sbLIZ2.append(dLo);
            sbLIZ2.append('m');
            C2188811AlT.LIZIZ(sbLIZ2);
            if (dLo < 1000.0d) {
                this.LL.getClass();
                C1177960gl8 c1177960gl8 = c1176580giu.southwest;
                C1177960gl8 c1177960gl82 = c1176580giu.northeast;
                double dLo2 = PoiMapDetailMapAssem.Lo(c1176580giu);
                if (dLo2 < 1000.0d) {
                    double d = 1000.0d / dLo2;
                    double d2 = c1177960gl8.lat;
                    double d3 = c1177960gl82.lat;
                    double d4 = 2;
                    double d5 = (d2 + d3) / d4;
                    double d6 = c1177960gl8.lon;
                    double d7 = c1177960gl82.lon;
                    double d8 = (d6 + d7) / d4;
                    double d9 = ((d3 - d2) * d) / d4;
                    double d10 = ((d7 - d6) * d) / d4;
                    c1176580giu = new C1176580giu(new C1177960gl8(d5 - d9, d8 - d10), new C1177960gl8(d5 + d9, d8 + d10));
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("getEffectiveMapWindow expanded bounds to 1km, original: ");
                sbLIZ3.append(dLo);
                sbLIZ3.append('m');
                C2188811AlT.LIZIZ(sbLIZ3);
                return C1175070ggT.LIZ(c1176580giu);
            }
            return C1175070ggT.LIZ(c1176580giu);
        }
        return C1175070ggT.LIZ(c1176580giu);
    }

    @Override // com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailMapAssemAbility
    public final void dg(Function1<? super Boolean, Unit> function1) {
        this.LL.LLJILLL.add(function1);
    }

    @Override // com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailMapAssemAbility
    public final void uD0(int i) {
        this.LL.uD0(i);
    }
}
