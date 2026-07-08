package com.ss.android.ugc.aweme.poi.mapdetail.assem;

import X.AnonymousClass0956;
import X.C013C;
import X.C01D1;
import X.C09R3;
import X.C0CAU;
import X.C1165940gRk;
import X.C1175540ghE;
import X.C1175600ghK;
import X.C1175660ghQ;
import X.C1175680ghS;
import X.C1175770ghb;
import X.C1176200giI;
import X.C1176270giP;
import X.C1176410gid;
import X.C1176430gif;
import X.C1176500gim;
import X.C1176510gin;
import X.C1176580giu;
import X.C1176590giv;
import X.C1176600giw;
import X.C1176620giy;
import X.C1176630giz;
import X.C1176900gjQ;
import X.C1177000gja;
import X.C1177960gl8;
import X.C1178280gle;
import X.C1178720gmM;
import X.C1179470gnZ;
import X.C1179570gnj;
import X.C1180740gpc;
import X.C1189060h32;
import X.C1192290h8F;
import X.C1203050hPb;
import X.C1207340hWW;
import X.C1207450hWh;
import X.C123100dR;
import X.C1367960lha;
import X.C1388190mED;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1770850wBP;
import X.C19659111vp;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C1BSO;
import X.C2217381BqS;
import X.C2255108sX;
import X.C297480BlK;
import X.C300190Bph;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1153700g80;
import X.EnumC1174810gg3;
import X.EnumC1175760gha;
import X.EnumC1175790ghd;
import X.EnumC1176260giO;
import X.EnumC1203090hPf;
import X.EnumC1205470hTV;
import X.EnumC994790bzh;
import X.InterfaceC1176690gj5;
import X.InterfaceC1177250gjz;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ACListenerS153S0100000_18;
import Y.AObserverS222S0100000_18;
import Y.ARunnableS22S1200000_18;
import Y.ARunnableS87S0200000_18;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.MessageSyncer;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailFilterVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailMapVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailNavTabVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import com.ss.android.ugc.aweme.poi.mapmode.map.permission.MapModePermissionChangeObserver;
import com.ss.android.ugc.aweme.poi.mapmode.model.Location;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS454S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS5S0103000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailMapAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public final MessageSyncer LLJILJIL;
    public InterfaceC1177250gjz LLJILJILJ;
    public final Set<Function1<Boolean, Unit>> LLJILLL;
    public final Set<Function1<Boolean, Unit>> LLJJ;
    public C1176600giw LLJJI;
    public final MapModePermissionChangeObserver LLJJIII;
    public C1179570gnj LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public C1176900gjQ LLJJJ;
    public final C1176510gin LLJJJIL;
    public ViewGroup LLJJJJ;
    public ViewGroup LLJJJJJIL;
    public View LLJJJJLIIL;
    public EnumC1175790ghd LLJJL;
    public Runnable LLJJLIIIJLLLLLLLZ;
    public Float LLJL;
    public C1165940gRk LLJLIL;
    public ARunnableS87S0200000_18 LLJLILLLLZIIL;
    public boolean LLJLL;
    public volatile boolean LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapDetailMapAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailPageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiMapDetailMapAssem.class, "mapVM", "getMapVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailMapVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PoiMapDetailMapAssem.class, "filterVM", "getFilterVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailFilterVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(PoiMapDetailMapAssem.class, "navTabVM", "getNavTabVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailNavTabVM;", 0);
        c09r3.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public PoiMapDetailMapAssem() {
        List<String> listLJIIZILJ;
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapDetailPageVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 1395), AFwS256S0000000_18.get$arr$(476), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapDetailMapVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 1396), AFwS256S0000000_18.get$arr$(477), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PoiMapDetailFilterVM.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ3, 1397), AFwS256S0000000_18.get$arr$(478), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(PoiMapDetailNavTabVM.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ4, 1398), AFwS256S0000000_18.get$arr$(479), null, true);
        this.LLJILJIL = new MessageSyncer();
        this.LLJILLL = new LinkedHashSet();
        this.LLJJ = new LinkedHashSet();
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        this.LLJJIII = new MapModePermissionChangeObserver((iLocationBaseServiceForMT == null || (listLJIIZILJ = iLocationBaseServiceForMT.LJIIZILJ()) == null) ? C13BV.INSTANCE : listLJIIZILJ, new AwS562S0100000_18(this, 1394));
        this.LLJJJIL = new C1176510gin();
        this.LLJL = Float.valueOf(0.0f);
    }

    public final void Ho() {
        ARunnableS87S0200000_18 aRunnableS87S0200000_18 = this.LLJLILLLLZIIL;
        if (aRunnableS87S0200000_18 != null) {
            C0CAU.LIZ.removeCallbacks(aRunnableS87S0200000_18);
            this.LLJLILLLLZIIL = null;
        }
        PoiMapDetailMapVM poiMapDetailMapVMOo = Oo();
        AnonymousClass0956 anonymousClass0956 = poiMapDetailMapVMOo.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        poiMapDetailMapVMOo.LLILLL = null;
    }

    public final C1176630giz Jo() {
        C1176590giv accInitData;
        C1176590giv accInitData2;
        PoiLocation poiLocation;
        C1176590giv accInitData3;
        PoiLocation poiLocation2;
        C1176590giv accInitData4;
        EnumC1153700g80 enumC1153700g80 = EnumC1153700g80.CENTER_PIN_STYLE;
        EnumC994790bzh enumC994790bzh = EnumC994790bzh.NONE;
        C1175680ghS c1175680ghS = So().LLILZIL;
        String str = (c1175680ghS == null || (accInitData4 = c1175680ghS.getAccInitData()) == null) ? null : accInitData4.centerPoiId;
        C1175680ghS c1175680ghS2 = So().LLILZIL;
        Double d = (c1175680ghS2 == null || (accInitData3 = c1175680ghS2.getAccInitData()) == null || (poiLocation2 = accInitData3.centerPoiLocation) == null) ? null : poiLocation2.lat;
        C1175680ghS c1175680ghS3 = So().LLILZIL;
        Location location = new Location(d, (c1175680ghS3 == null || (accInitData2 = c1175680ghS3.getAccInitData()) == null || (poiLocation = accInitData2.centerPoiLocation) == null) ? null : poiLocation.lng);
        C1175680ghS c1175680ghS4 = So().LLILZIL;
        String str2 = (c1175680ghS4 == null || (accInitData = c1175680ghS4.getAccInitData()) == null) ? null : accInitData.centerPoiName;
        C1176200giI c1176200giI = So().LLJILJILJ;
        c1176200giI.getClass();
        PoiMapDetailResponse poiMapDetailResponse = c1176200giI.LJFF;
        return new C1176630giz(new PoiGeneralCard(str, null, str2, null, null, null, null, null, null, null, null, location, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, null, null, null, null, -1, poiMapDetailResponse != null ? poiMapDetailResponse.getCurrentPoiHotelShelfInfo() : null), enumC1153700g80, enumC994790bzh);
    }

    public final PoiMapDetailFilterVM No() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (PoiMapDetailFilterVM) assemVMLazy.getValue();
    }

    public final PoiMapDetailMapVM Oo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (PoiMapDetailMapVM) assemVMLazy.getValue();
    }

    public final PoiMapDetailPageVM So() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (PoiMapDetailPageVM) assemVMLazy.getValue();
    }

    public final boolean ap() {
        C1367960lha.LIZ.getClass();
        if (!C1367960lha.LIZ().enable()) {
            return false;
        }
        if (C300190Bph.LIZ()) {
            ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
            return (iLocationServiceForLS != null ? iLocationServiceForLS.LIZJ(C1178720gmM.LIZLLL) : null) == EnumC1205470hTV.SUCCESS;
        }
        C1207340hWW.LIZ.getClass();
        return C1207340hWW.LJI("poi", "anchor");
    }

    public final boolean Zo() {
        PoiMapDetailResponse poiMapDetailResponse;
        List<PoiGeneralCard> listPoiList;
        PoiGeneralCard next;
        Location location;
        InterfaceC1177250gjz interfaceC1177250gjz;
        C1165940gRk c1165940gRkLJJIJIIJIL;
        C1176580giu c1176580giu;
        if (So().LL.LIZIZ != EnumC1175790ghd.CARD_VIEW) {
            return false;
        }
        C1176430gif c1176430gif = Oo().getState().LL;
        String str = c1176430gif != null ? c1176430gif.LIZ : null;
        if (str != null && str.length() != 0 && (poiMapDetailResponse = So().LLJILJILJ.LIZJ) != null && (listPoiList = poiMapDetailResponse.poiList()) != null) {
            Iterator<PoiGeneralCard> it2 = listPoiList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.LJFF(next.getPoiId(), str)) {
                    break;
                }
            }
            PoiGeneralCard poiGeneralCard = next;
            if (poiGeneralCard != null && (location = poiGeneralCard.getLocation()) != null && (interfaceC1177250gjz = this.LLJILJILJ) != null && (c1165940gRkLJJIJIIJIL = interfaceC1177250gjz.LJJIJIIJIL()) != null && (c1176580giu = c1165940gRkLJJIJIIJIL.bounds) != null) {
                Double d = location.lat;
                double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
                Double d2 = location.lng;
                double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
                InterfaceC1177250gjz interfaceC1177250gjz2 = this.LLJILJILJ;
                if (c1176580giu.contains(dDoubleValue, dDoubleValue2, interfaceC1177250gjz2 != null ? interfaceC1177250gjz2.LJIJJ() : 0.0f, 0)) {
                    return true;
                }
            }
        }
        So().BQ2(null, true);
        So().LL.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
        return false;
    }

    public final void dp() {
        C1BSO c1bsoLJJIIZI;
        C1BSO c1bsoLJJIIZI2;
        if (C297480BlK.LIZ() && C1207450hWh.LIZ.LJI("poi", "anchor")) {
            if (C1176620giy.LIZ()) {
                InterfaceC1177250gjz interfaceC1177250gjz = this.LLJILJILJ;
                if (interfaceC1177250gjz != null) {
                    interfaceC1177250gjz.LJIILJJIL(true);
                }
                InterfaceC1177250gjz interfaceC1177250gjz2 = this.LLJILJILJ;
                if (interfaceC1177250gjz2 == null || (c1bsoLJJIIZI2 = interfaceC1177250gjz2.LJJIIZI()) == null) {
                    return;
                }
                c1bsoLJJIIZI2.LIZIZ();
                return;
            }
            InterfaceC1177250gjz interfaceC1177250gjz3 = this.LLJILJILJ;
            if (interfaceC1177250gjz3 != null) {
                interfaceC1177250gjz3.LJIILJJIL(false);
            }
            InterfaceC1177250gjz interfaceC1177250gjz4 = this.LLJILJILJ;
            if (interfaceC1177250gjz4 == null || (c1bsoLJJIIZI = interfaceC1177250gjz4.LJJIIZI()) == null) {
                return;
            }
            c1bsoLJJIIZI.LIZIZ();
        }
    }

    public final void qO1() {
        So().BQ2(null, true);
        if (So().LLILZ == EnumC1175760gha.ACC_NEARBY) {
            C1176600giw c1176600giw = this.LLJJI;
            if (c1176600giw != null) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
                if (c19egLIZ != null) {
                    c1176600giw.LJII.LJ(c1176600giw, c19egLIZ, fragmentLJIIJ);
                }
            }
        } else {
            C1176600giw c1176600giw2 = this.LLJJI;
            if (c1176600giw2 != null) {
                C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ(this);
                if (c19egLIZ2 != null) {
                    c1176600giw2.LJII.LIZIZ(c1176600giw2, c19egLIZ2, fragmentLJIIJ2);
                }
            }
        }
        C1175770ghb c1175770ghb = So().LL;
        C1175770ghb c1175770ghb2 = So().LL;
        EnumC1175790ghd enumC1175790ghd = c1175770ghb.LIZIZ;
        if (enumC1175790ghd != null) {
            enumC1175790ghd.onFindPlacesNearby(c1175770ghb2);
        }
        C1175660ghQ c1175660ghQ = So().getState().LLILLL;
        String str = c1175660ghQ != null ? c1175660ghQ.localServiceKeyCategory : null;
        PoiMapDetailResponse poiMapDetailResponse = So().LLJILJILJ.LIZJ;
        C1175600ghK.LJII(str, poiMapDetailResponse != null ? poiMapDetailResponse.getUserCityStatus() : null, No().wQ2(), EnumC1174810gg3.CLICK_ARROW, C1558520qew.LJIIL(this), So().LLJ);
    }

    public static double Lo(C1176580giu c1176580giu) {
        C1177960gl8 c1177960gl8 = c1176580giu.southwest;
        C1177960gl8 c1177960gl82 = c1176580giu.northeast;
        double d = c1177960gl8.lat;
        double d2 = c1177960gl8.lon;
        double dGo = Go(d, d2, c1177960gl82.lat, d2);
        double d3 = c1177960gl8.lat;
        return Math.min(dGo, Go(d3, c1177960gl8.lon, d3, c1177960gl82.lon));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        String strLIZJ;
        Context context;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        Context context2;
        TuxIconView tuxIconView;
        super.onViewCreated(view);
        C1192290h8F.LIZ(this, "poi_detail_map_mode_map_sdk", null, true, null, null, 26);
        C1192290h8F.LIZJ(this, new AwS597S0100000_18(view, 396));
        this.LLJJIJI = (C1179570gnj) view.findViewById(R.id.ygb);
        this.LLJJIJIIJIL = (FrameLayout) view.findViewById(R.id.nzh);
        this.LLJJIJIL = (TuxIconView) view.findViewById(R.id.nzk);
        C1179570gnj c1179570gnj = this.LLJJIJI;
        if (c1179570gnj != null) {
            c1179570gnj.LLILZLL = new AwS632S0100000_18(this, 14);
        }
        this.LLJJJJ = (ViewGroup) view.findViewById(R.id.msa);
        this.LLJJJJJIL = (ViewGroup) view.findViewById(R.id.nzl);
        this.LLJJJJLIIL = view.findViewById(R.id.nzm);
        if (!ap() && (tuxIconView = this.LLJJIJIL) != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 4);
        }
        TuxIconView tuxIconView2 = this.LLJJIJIL;
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZ = R.raw.icon_scope;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxIconView2.getContext());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.c3);
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(tuxIconView2.getContext()));
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZJ = C418440Gaw.LIZIZ(4);
            c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
            c19659111vp.LIZ = C418440Gaw.LIZIZ(200);
            c19659111vp.LJ = Integer.valueOf(R.attr.p0);
            tuxIconView2.setBackground(C426750GoL.LJIILIIL(layerDrawableLJIILIIL, c19659111vp.LIZ(tuxIconView2.getContext())));
        }
        TuxIconView tuxIconView3 = this.LLJJIJIL;
        if (tuxIconView3 != null) {
            C786410Ut5.a9(tuxIconView3, new ACListenerS153S0100000_18(this, 2));
        }
        Context context3 = getContext();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
        } else {
            interfaceC665370Q7zLJFF = null;
        }
        C1176600giw c1176600giw = new C1176600giw(context3, interfaceC665370Q7zLJFF);
        this.LLJJI = c1176600giw;
        c1176600giw.LIZJ = Oo();
        C1176600giw c1176600giw2 = this.LLJJI;
        if (c1176600giw2 != null) {
            c1176600giw2.LIZLLL = So();
        }
        getLifecycle().addObserver(this.LLJJIII);
        View view2 = this.LLJJJJLIIL;
        if (view2 != null && (context2 = view2.getContext()) != null && C960203pA.LIZIZ(context2)) {
            View view3 = this.LLJJJJLIIL;
            if (view3 != null) {
                C339190DRl.LIZLLL(view3);
            }
        } else {
            View view4 = this.LLJJJJLIIL;
            if (view4 != null) {
                C339190DRl.LIZIZ(view4);
            }
        }
        C1180740gpc.LIZ.getClass();
        IPoiMapService iPoiMapServiceLIZ = C1180740gpc.LIZ();
        C1179470gnZ c1179470gnZ = new C1179470gnZ();
        c1179470gnZ.LJFF = EnumC1203090hPf.MAP_TYPE_NORMAL;
        c1179470gnZ.LIZJ = false;
        c1179470gnZ.LJ = false;
        c1179470gnZ.LJII = false;
        if (So().LLILZ == EnumC1175760gha.ACC_NEARBY) {
            strLIZJ = C1178280gle.LIZLLL(getContext());
        } else {
            strLIZJ = C1178280gle.LIZJ(getContext());
        }
        c1179470gnZ.LJI = strLIZJ;
        InterfaceC1176690gj5 iMapManager = iPoiMapServiceLIZ.getIMapManager(new C1203050hPb(c1179470gnZ));
        Fragment fragmentLIZIZ = iMapManager.LIZIZ();
        if (fragmentLIZIZ != null && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
            c19ehLJIIJ.LIZIZ(R.id.nzh, fragmentLIZIZ);
            c19ehLJIIJ.LJIIIZ();
        }
        iMapManager.X(new AwS597S0100000_18(this, 15));
        InterfaceC665370Q7z interfaceC665370Q7z = So().LLIZ;
        if (interfaceC665370Q7z != null) {
            PoiMapDetailMapAssem$loadAbility$1 poiMapDetailMapAssem$loadAbility$1 = new PoiMapDetailMapAssem$loadAbility$1(this);
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, IPoiMapDetailMapAssemAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7z, poiMapDetailMapAssem$loadAbility$1, IPoiMapDetailMapAssemAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(poiMapDetailMapAssem$loadAbility$1);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(poiMapDetailMapAssem$loadAbility$1);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(IPoiMapDetailMapAssemAbility.class.getClassLoader(), new Class[]{IPoiMapDetailMapAssemAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7z, (InterfaceC494301wD) objNewProxyInstance, IPoiMapDetailMapAssemAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailMapAssemAbility");
                    }
                }
            }
        }
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0gj1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1176490gil) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 5), 6);
        So().LLILLL.observe(this, new AObserverS222S0100000_18(this, 0));
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0gii
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1175650ghP) obj).LLILLJJLI;
            }
        }, null, new AwS454S0200000_18(this, new C013C(), 0), 6);
        C736680Sv4.LJIIIZ(this, So(), new C2217381BqS() { // from class: X.0ghn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1175650ghP) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0gij
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1175650ghP) obj).LLILLJJLI;
            }
        }, null, new AwS667S0100000_18(this, 3), 12);
        PoiMapDetailMapVM poiMapDetailMapVMOo = Oo();
        C1176500gim c1176500gim = new C2217381BqS() { // from class: X.0gim
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1176490gil) obj).LLILLJJLI;
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ = true;
        C736680Sv4.LJIIIIZZ(this, poiMapDetailMapVMOo, c1176500gim, c1770850wBP, new AwS632S0100000_18(this, 17), 4);
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        AssemViewModel value = assemVMLazy.getValue();
        C1176410gid c1176410gid = new C2217381BqS() { // from class: X.0gid
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C995810c1L) obj).LLILLJJLI;
            }
        };
        C1770850wBP c1770850wBP2 = new C1770850wBP();
        c1770850wBP2.LIZ = true;
        C736680Sv4.LJIIIIZZ(this, value, c1176410gid, c1770850wBP2, new AwS632S0100000_18(this, 19), 4);
    }

    public final void uD0(int i) {
        int iYK2;
        IPoiMapDetailSheetAssemAbility iPoiMapDetailSheetAssemAbility;
        int iOk2;
        IPoiMapDetailSheetAssemAbility iPoiMapDetailSheetAssemAbility2;
        int i2 = i;
        InterfaceC665370Q7z interfaceC665370Q7z = So().LLIZ;
        if (interfaceC665370Q7z != null && (iPoiMapDetailSheetAssemAbility2 = (IPoiMapDetailSheetAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiMapDetailSheetAssemAbility.class, null)) != null) {
            iYK2 = iPoiMapDetailSheetAssemAbility2.YK2();
        } else {
            iYK2 = 0;
        }
        int screenHeight = ScreenUtils.getScreenHeight(LJJIJL().getContext());
        InterfaceC665370Q7z interfaceC665370Q7z2 = So().LLIZ;
        if (interfaceC665370Q7z2 != null && (iPoiMapDetailSheetAssemAbility = (IPoiMapDetailSheetAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z2, IPoiMapDetailSheetAssemAbility.class, null)) != null && i2 > (iOk2 = iPoiMapDetailSheetAssemAbility.ok2())) {
            i2 = iOk2;
        }
        this.LLJILJIL.LIZLLL(Collections.singletonList("map_init"), new AwS5S0103000_18(this, screenHeight, iYK2, i2, 0));
    }

    public final void cp(String str, List list) {
        C1176580giu c1176580giu;
        Float fValueOf;
        C1165940gRk c1165940gRkLJJIJIIJIL;
        InterfaceC1177250gjz interfaceC1177250gjz = this.LLJILJILJ;
        if (interfaceC1177250gjz != null && (c1165940gRkLJJIJIIJIL = interfaceC1177250gjz.LJJIJIIJIL()) != null) {
            c1176580giu = c1165940gRkLJJIJIIJIL.bounds;
        } else {
            c1176580giu = null;
        }
        InterfaceC1177250gjz interfaceC1177250gjz2 = this.LLJILJILJ;
        if (interfaceC1177250gjz2 != null) {
            fValueOf = Float.valueOf(interfaceC1177250gjz2.LJIJJ());
        } else {
            fValueOf = null;
        }
        So().LLJILJILJ.LIZLLL = c1176580giu;
        So().LLJILJILJ.LJ = fValueOf;
        List<C1176630giz> listVo = Vo(list, c1176580giu, fValueOf);
        if (Zo()) {
            C1176900gjQ c1176900gjQ = this.LLJJJ;
            if (c1176900gjQ != null) {
                c1176900gjQ.LJIIL(str, listVo);
                return;
            }
            return;
        }
        C1176900gjQ c1176900gjQ2 = this.LLJJJ;
        if (c1176900gjQ2 == null) {
            return;
        }
        c1176900gjQ2.LJIIL(null, listVo);
    }

    public final List<C1176630giz> Vo(List<PoiGeneralCard> list, C1176580giu c1176580giu, Float f) {
        List listLLIIII;
        String str;
        Pair pair;
        C1176900gjQ c1176900gjQ = this.LLJJJ;
        if (c1176900gjQ == null || (listLLIIII = C13LP.LLIIII(c1176900gjQ.LJI.values())) == null) {
            listLLIIII = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLLIIII) {
            if (((C1177000gja) obj).LJI) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listLLIIII) {
            if (true ^ ((C1177000gja) obj2).LJI) {
                arrayList2.add(obj2);
            }
        }
        List listLJLIL = C13LP.LJLIL(arrayList2, arrayList);
        List listLIZ = C1175540ghE.LIZ(list, c1176580giu, f);
        if (listLIZ == null) {
            listLIZ = C13BV.INSTANCE;
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C1177000gja) it2.next()).LIZ);
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : listLIZ) {
            if (!C13LP.LJJJJ(((PoiGeneralCard) obj3).getPoiId(), setLLIIJI)) {
                arrayList4.add(obj3);
            }
        }
        ArrayList<PoiGeneralCard> arrayList5 = new ArrayList();
        Iterator it3 = ((ArrayList) listLJLIL).iterator();
        while (true) {
            str = null;
            if (!it3.hasNext()) {
                break;
            }
            C1177000gja c1177000gja = (C1177000gja) it3.next();
            Iterator it4 = listLIZ.iterator();
            while (true) {
                if (it4.hasNext()) {
                    Object next = it4.next();
                    PoiGeneralCard poiGeneralCard = (PoiGeneralCard) next;
                    if (Intrinsics.LJFF(poiGeneralCard.getPoiId(), c1177000gja.LIZ) && C123100dR.LIZ(poiGeneralCard.getPoiId())) {
                        if (next != null) {
                            arrayList5.add(next);
                        }
                    }
                }
            }
        }
        arrayList5.addAll(arrayList4);
        C1175660ghQ c1175660ghQ = So().getState().LLILLL;
        if (c1175660ghQ != null) {
            str = c1175660ghQ.localServiceKeyCategory;
        }
        boolean zLJFF = Intrinsics.LJFF(str, "Hotel");
        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
        for (PoiGeneralCard poiGeneralCard2 : arrayList5) {
            Integer poiCardDisplayStyle = poiGeneralCard2.getPoiCardDisplayStyle();
            if (poiCardDisplayStyle != null && poiCardDisplayStyle.intValue() == 1) {
                pair = new Pair(EnumC1153700g80.TRANSPORT_STYLE, EnumC994790bzh.HIDE);
            } else if (Intrinsics.LJFF(poiGeneralCard2.isHotelMarkerSpecial(), Boolean.TRUE) && zLJFF) {
                pair = new Pair(EnumC1153700g80.HOTEL_STYLE, EnumC994790bzh.DEGRADE);
            } else {
                pair = new Pair(EnumC1153700g80.POPUP_STYLE, EnumC994790bzh.DEGRADE);
            }
            arrayList6.add(new C1176630giz(poiGeneralCard2, (EnumC1153700g80) pair.getFirst(), (EnumC994790bzh) pair.getSecond()));
        }
        ArrayList arrayList7 = new ArrayList(arrayList6);
        if (So().LLILZ == EnumC1175760gha.ACC_NEARBY) {
            arrayList7.add(Jo());
        }
        return arrayList7;
    }

    public final void ep(String str, boolean z, boolean z2) {
        List<PoiGeneralCard> listPoiList;
        EnumC1176260giO enumC1176260giO;
        boolean z3;
        C1176590giv accInitData;
        PoiLocation poiLocation;
        double dDoubleValue;
        C1176270giP request;
        PoiMapDetailResponse poiMapDetailResponse = So().LLJILJILJ.LIZJ;
        if (poiMapDetailResponse != null && (listPoiList = poiMapDetailResponse.poiList()) != null) {
            if (!z2 && this.LLJLLIL) {
                cp(str, listPoiList);
            } else {
                this.LLJJLIIIJLLLLLLLZ = new ARunnableS22S1200000_18(this, str, listPoiList, 1);
            }
            if (z) {
                PoiMapDetailResponse poiMapDetailResponse2 = So().LLJILJILJ.LIZJ;
                C1177960gl8 c1177960gl8 = null;
                if (poiMapDetailResponse2 != null && (request = poiMapDetailResponse2.getRequest()) != null) {
                    enumC1176260giO = request.updateScene;
                } else {
                    enumC1176260giO = null;
                }
                if (So().LLILZ == EnumC1175760gha.ACC_NEARBY && (enumC1176260giO == EnumC1176260giO.FIRST_REFRESH || enumC1176260giO == EnumC1176260giO.CATEGORY_CHANGE || enumC1176260giO == EnumC1176260giO.BACK_TO_HOTEL)) {
                    C1175680ghS c1175680ghS = So().LLILZIL;
                    if (c1175680ghS != null && (accInitData = c1175680ghS.getAccInitData()) != null && (poiLocation = accInitData.centerPoiLocation) != null) {
                        Double d = poiLocation.lat;
                        double dDoubleValue2 = 0.0d;
                        if (d != null) {
                            dDoubleValue = d.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        Double d2 = poiLocation.lng;
                        if (d2 != null) {
                            dDoubleValue2 = d2.doubleValue();
                        }
                        c1177960gl8 = new C1177960gl8(dDoubleValue, dDoubleValue2);
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                bp(this, listPoiList, c1177960gl8, z3, null, 24);
            }
        }
    }

    public static double Go(double d, double d2, double d3, double d4) {
        double d5 = 2;
        double radians = Math.toRadians(d3 - d) / d5;
        double radians2 = Math.toRadians(d4 - d2) / d5;
        double dSin = (Math.sin(radians) * Math.sin(radians)) + (Math.cos(Math.toRadians(d)) * Math.cos(Math.toRadians(d3)) * Math.sin(radians2) * Math.sin(radians2));
        return d5 * Math.atan2(Math.sqrt(dSin), Math.sqrt(((double) 1) - dSin)) * 6371000.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void bp(com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailMapAssem r10, java.util.List r11, X.C1177960gl8 r12, boolean r13, kotlin.jvm.internal.AwS562S0100000_18 r14, int r15) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailMapAssem.bp(com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailMapAssem, java.util.List, X.0gl8, boolean, kotlin.jvm.internal.AwS562S0100000_18, int):void");
    }
}
