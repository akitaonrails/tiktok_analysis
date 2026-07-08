package com.ss.android.ugc.aweme.poi.revisit.view;

import X.C01D1;
import X.C090F;
import X.C099F;
import X.C09R3;
import X.C1177550gkT;
import X.C1177600gkY;
import X.C1177610gkZ;
import X.C1177630gkb;
import X.C1177960gl8;
import X.C1178480gly;
import X.C1178490glz;
import X.C1179570gnj;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C297480BlK;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C814420VxA;
import X.InterfaceC1177250gjz;
import X.InterfaceC1177640gkc;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitMapViewModel;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRevisitMapAssem extends UIContentAssem implements IPoiRevisitMapAssemAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C099F LLJI;
    public InterfaceC1177250gjz LLJIJIL;
    public C1179570gnj LLJILJIL;
    public FrameLayout LLJILJILJ;
    public boolean LLJILLL;
    public Float LLJJ;
    public Pair<String, C1177960gl8> LLJJI;
    public boolean LLJJIII;
    public InterfaceC1177640gkc LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiRevisitMapAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/revisit/vm/PoiRevisitViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiRevisitMapAssem.class, "mapVM", "getMapVM()Lcom/ss/android/ugc/aweme/poi/revisit/vm/PoiRevisitMapViewModel;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiRevisitMapAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiRevisitViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 2012), AFwS256S0000000_18.get$arr$(645), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiRevisitMapViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 2013), AFwS256S0000000_18.get$arr$(646), null, true);
        this.LLJI = C090F.LIZIZ();
    }

    public final PoiRevisitMapViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (PoiRevisitMapViewModel) assemVMLazy.getValue();
    }

    public final PoiRevisitViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (PoiRevisitViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitMapAssemAbility
    public final void ZX0() {
        InterfaceC1177250gjz interfaceC1177250gjz = this.LLJIJIL;
        if (interfaceC1177250gjz != null) {
            No(interfaceC1177250gjz, this.LLJILJILJ);
        }
    }

    public final void Lo() {
        InterfaceC1177250gjz interfaceC1177250gjz;
        PoiRevisitApi.PoiRevisitCardModel next;
        PoiLocation poiLocation;
        C1177960gl8 c1177960gl8LIZ;
        Context context = getContext();
        if (context == null || (interfaceC1177250gjz = this.LLJIJIL) == null) {
            return;
        }
        C1177630gkb c1177630gkb = Ho().getState().LL;
        String str = c1177630gkb != null ? c1177630gkb.LIZ : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleMarkerForZoomLevelChange highLightPoiId=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponseWQ2 = Jo().wQ2(true, true, true);
        List<PoiRevisitApi.PoiRevisitCardModel> list = poiRevisitCardListResponseWQ2 != null ? poiRevisitCardListResponseWQ2.poiCardList : null;
        interfaceC1177250gjz.LJIIJJI();
        boolean z = interfaceC1177250gjz.LJIJJ() > 12.0f;
        if (list != null) {
            Iterator<PoiRevisitApi.PoiRevisitCardModel> it2 = list.iterator();
            while (it2.hasNext() && (poiLocation = (next = it2.next()).location) != null && (c1177960gl8LIZ = C1177610gkZ.LIZ(poiLocation)) != null) {
                if (Intrinsics.LJFF(str, next.poiId)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("drawHighLightMarker name=");
                    sbLIZ2.append(next.poiName);
                    sbLIZ2.append(", withText=");
                    sbLIZ2.append(z);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1177550gkT c1177550gkT = new C1177550gkT(context, z, true);
                    String str2 = next.poiName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c1177550gkT.LIZ(str2, new AwS227S0300000_18(this, c1177960gl8LIZ, next, 37));
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("drawNonHighLightMarker name=");
                    sbLIZ3.append(next.poiName);
                    sbLIZ3.append(", withText=");
                    sbLIZ3.append(z);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    new C1177550gkT(context, z, false).LIZ(next.poiName, new AwS227S0300000_18(this, c1177960gl8LIZ, next, 38));
                }
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitMapAssem for r13v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitMapAssem.onViewCreated(android.view.View):void");
    }

    public final void uD0(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMapBottomPadding=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1177250gjz interfaceC1177250gjz = this.LLJIJIL;
        if (interfaceC1177250gjz != null) {
            interfaceC1177250gjz.LJIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), i);
        }
    }

    public static void Go(PoiRevisitMapAssem poiRevisitMapAssem, C1177960gl8 c1177960gl8) {
        InterfaceC1177250gjz interfaceC1177250gjz = poiRevisitMapAssem.LLJIJIL;
        if (interfaceC1177250gjz != null) {
            C1179570gnj c1179570gnj = poiRevisitMapAssem.LLJILJIL;
            if (c1179570gnj != null) {
                c1179570gnj.LLILZ = true;
            }
            Float fValueOf = Float.valueOf(15.0f);
            C1178480gly c1178480gly = new C1178480gly();
            c1178480gly.LIZ = true;
            c1178480gly.LIZIZ = 300L;
            c1178480gly.LIZJ = new AwS419S0200000_18(poiRevisitMapAssem, (PoiRevisitMapAssem) null, (Function0<Unit>) 113);
            c1178480gly.LIZLLL = new AwS419S0200000_18(poiRevisitMapAssem, (PoiRevisitMapAssem) null, (Function0<Unit>) 111);
            interfaceC1177250gjz.LIZIZ(c1177960gl8, fValueOf, c1178480gly);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void No(X.InterfaceC1177250gjz r15, android.widget.FrameLayout r16) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitMapAssem.No(X.0gjz, android.widget.FrameLayout):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitMapAssemAbility
    public final void hz0(boolean z, boolean z2) {
        Double d;
        InterfaceC1177250gjz interfaceC1177250gjz;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Map Assem drawMyLocation, isPrecise=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        Double d2 = Jo().LLIZ;
        Double d3 = Jo().LLIZLLLIL;
        if (d2 != null && d3 != null && !Intrinsics.LIZIZ(d2, 0.0d) && !Intrinsics.LIZIZ(d3, 0.0d)) {
            C1179570gnj c1179570gnj = this.LLJILJIL;
            if (c1179570gnj != null) {
                c1179570gnj.LLILZ = true;
            }
            InterfaceC1177250gjz interfaceC1177250gjz2 = this.LLJIJIL;
            if (interfaceC1177250gjz2 != null) {
                C1177960gl8 c1177960gl8 = new C1177960gl8(d2.doubleValue(), d3.doubleValue());
                Float fValueOf = Float.valueOf(15.0f);
                C1178480gly c1178480gly = new C1178480gly();
                c1178480gly.LIZ = true;
                c1178480gly.LIZIZ = 300L;
                c1178480gly.LIZJ = new AwS562S0100000_18(this, 2010);
                c1178480gly.LIZLLL = new AwS562S0100000_18(this, 2011);
                interfaceC1177250gjz2.LIZIZ(c1177960gl8, fValueOf, c1178480gly);
            }
        }
        if (z) {
            if (C297480BlK.LIZ() && (interfaceC1177250gjz = this.LLJIJIL) != null) {
                interfaceC1177250gjz.LJIILJJIL(z2);
                interfaceC1177250gjz.LJJIIZI().LIZIZ();
                return;
            }
            return;
        }
        if (z2) {
            InterfaceC1177250gjz interfaceC1177250gjz3 = this.LLJIJIL;
            if (interfaceC1177250gjz3 != null && (d = Jo().LLIZ) != null) {
                double dDoubleValue = d.doubleValue();
                Double d4 = Jo().LLIZLLLIL;
                if (d4 != null) {
                    double dDoubleValue2 = d4.doubleValue();
                    if (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) {
                        return;
                    }
                    InterfaceC1177640gkc interfaceC1177640gkc = this.LLJJIJI;
                    if (interfaceC1177640gkc != null) {
                        interfaceC1177640gkc.remove();
                    }
                    C1177600gkY c1177600gkY = new C1177600gkY();
                    c1177600gkY.LIZ = new C1178490glz(dDoubleValue, dDoubleValue2);
                    c1177600gkY.LIZIZ = Double.valueOf(800.0d);
                    c1177600gkY.LJ = Float.valueOf(2.0f);
                    c1177600gkY.LJFF = Float.valueOf(-1.0f);
                    Context context = getContext();
                    if (context != null) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, context);
                        if (numLIZJ != null) {
                            c1177600gkY.LIZJ = Integer.valueOf(numLIZJ.intValue());
                        }
                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.c4, context);
                        if (numLIZJ2 != null) {
                            c1177600gkY.LIZLLL = Integer.valueOf(numLIZJ2.intValue());
                        }
                    }
                    this.LLJJIJI = interfaceC1177250gjz3.LJIJI(c1177600gkY);
                    return;
                }
                return;
            }
            return;
        }
        InterfaceC1177640gkc interfaceC1177640gkc2 = this.LLJJIJI;
        if (interfaceC1177640gkc2 != null) {
            interfaceC1177640gkc2.remove();
        }
        this.LLJJIJI = null;
    }
}
