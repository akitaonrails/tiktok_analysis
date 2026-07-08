package kotlin.jvm.internal;

import X.AbstractC1623806Xk;
import X.C098200Yq;
import X.C09AY;
import X.C0CNO;
import X.C1160250gIZ;
import X.C1170820gZc;
import X.C1188530h2B;
import X.C1206950hVt;
import X.C1207120hWA;
import X.C1207520hWo;
import X.C1252710ihh;
import X.C13LE;
import X.C1440005kM;
import X.C1749280vcc;
import X.C189200o6;
import X.C20248814Kw;
import X.C21415018rM;
import X.C491001vg;
import X.C491101vh;
import X.C614900O9w;
import X.InterfaceC1183590guD;
import X.InterfaceC1184330gvP;
import X.InterfaceC1193760hAc;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.CollaborativeCollectionListStateAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiDetailContentHeaderRegionalWithIntroAssemBase;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiBaseBottomButtonsComponent;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.stable.PoiStableBottomBarModule;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.RefactorTTReviewCell;
import com.ss.android.ugc.nearby.roaming.NearbyRegionListFragment;
import com.ss.android.ugc.nearby.roaming.NearbyRegionListV1Response;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class AwS70S0210000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS70S0210000_18 awS70S0210000_18, Object obj) {
        List<C1170820gZc> listLIZ;
        AbstractC1623806Xk<List<C1170820gZc>> abstractC1623806Xk = ((C1160250gIZ) obj).LL;
        if (!(abstractC1623806Xk instanceof C491101vh) && !(abstractC1623806Xk instanceof C491001vg) && ((listLIZ = abstractC1623806Xk.LIZ()) == null || listLIZ.isEmpty())) {
            ((CollaborativeCollectionListStateAssem) awS70S0210000_18.l0).Ho((C1749280vcc) awS70S0210000_18.l1, awS70S0210000_18.z2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS70S0210000_18 awS70S0210000_18, Object obj) {
        Object c098200Yq;
        Assembler assembler = (Assembler) obj;
        String poiId = null;
        try {
            InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI((PoiBaseBottomButtonsComponent) awS70S0210000_18.l0, C13LE.LIZ(InterfaceC1184330gvP.class), null);
            if (interfaceC1184330gvP != null) {
                c098200Yq = interfaceC1184330gvP.jN(false, "click_bottom_bar", null, null);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1188530h2B c1188530h2B = (C1188530h2B) c098200Yq;
        if (c1188530h2B != null) {
            poiId = c1188530h2B.getPoiId();
        }
        assembler.EQ2((PoiBaseBottomButtonsComponent) awS70S0210000_18.l0, new AwS14S1210000_18(poiId, (PoiListApi.PoiDetailResponse) awS70S0210000_18.l1, c1188530h2B, awS70S0210000_18.z2, 0));
        assembler.RQ2((PoiBaseBottomButtonsComponent) awS70S0210000_18.l0, AFwS256S0000000_18.get$arr$(371));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS70S0210000_18 awS70S0210000_18, Object obj) {
        ((Boolean) obj).booleanValue();
        C1440005kM.LIZ(new C614900O9w(awS70S0210000_18.z2, ((PoiDetailSlashFragment) awS70S0210000_18.l0).getPoiId(), ((PoiListApi.PoiDetailResponse) awS70S0210000_18.l1).getName(), ((PoiListApi.PoiDetailResponse) awS70S0210000_18.l1).getAddress(), String.valueOf(((PoiDetailSlashFragment) awS70S0210000_18.l0).hashCode()), false, false, false, false, 480));
        C0CNO.LIZLLL(0L, new AwS562S0100000_18((PoiDetailSlashFragment) awS70S0210000_18.l0, 1108));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS70S0210000_18 awS70S0210000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((NearbyRegionListFragment) awS70S0210000_18.l0, new AwS597S0100000_18((NearbyRegionListV1Response) awS70S0210000_18.l1, 611));
        if (!awS70S0210000_18.z2) {
            assembler.QQ2((NearbyRegionListFragment) awS70S0210000_18.l0, AFwS256S0000000_18.get$arr$(809));
        }
        assembler.QQ2((NearbyRegionListFragment) awS70S0210000_18.l0, AFwS256S0000000_18.get$arr$(810));
        assembler.QQ2((NearbyRegionListFragment) awS70S0210000_18.l0, AFwS256S0000000_18.get$arr$(811));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS70S0210000_18 awS70S0210000_18, Object obj) {
        InterfaceC1183590guD interfaceC1183590guD = (InterfaceC1183590guD) obj;
        interfaceC1183590guD.LIZIZ(new AwS597S0100000_18((C21415018rM) awS70S0210000_18.l0, 655));
        interfaceC1183590guD.LJIIJJI(new AwS556S0100000_12((PoiDetailContentHeaderRegionalWithIntroAssemBase) awS70S0210000_18.l1, 702));
        if (awS70S0210000_18.z2) {
            interfaceC1183590guD.LJIJJLI("data_from_anchor", "1");
            interfaceC1183590guD.LJJJ(new AwS597S0100000_18((PoiDetailContentHeaderRegionalWithIntroAssemBase) awS70S0210000_18.l1, 656));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS70S0210000_18 awS70S0210000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiBaseBottomButtonsComponent) awS70S0210000_18.l0, new AwS105S0110000_18((PoiStableBottomBarModule) awS70S0210000_18.l1, awS70S0210000_18.z2, 13));
        assembler.RQ2((PoiBaseBottomButtonsComponent) awS70S0210000_18.l0, AFwS256S0000000_18.get$arr$(837));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS70S0210000_18 awS70S0210000_18, Object obj) {
        String str;
        String str2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1207120hWA c1207120hWA = C1207120hWA.LIZ;
        C1207520hWo c1207520hWo = (C1207520hWo) awS70S0210000_18.l0;
        String str3 = null;
        if (c1207520hWo != null) {
            str3 = c1207520hWo.LIZ;
            str = c1207520hWo.LIZIZ;
            str2 = c1207520hWo.LIZLLL;
        } else {
            str = null;
            str2 = null;
        }
        boolean z = awS70S0210000_18.z2;
        boolean zLJJIJ = ((C1206950hVt) awS70S0210000_18.l1).LJJIJ();
        c1207120hWA.getClass();
        C1207120hWA.LJ(str3, str, str2, zBooleanValue, z, zLJJIJ, null);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS70S0210000_18 awS70S0210000_18, Object obj) {
        String str;
        String str2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1207120hWA c1207120hWA = C1207120hWA.LIZ;
        C1207520hWo c1207520hWo = (C1207520hWo) awS70S0210000_18.l0;
        String str3 = null;
        if (c1207520hWo != null) {
            str3 = c1207520hWo.LIZ;
            str = c1207520hWo.LIZIZ;
            str2 = c1207520hWo.LIZLLL;
        } else {
            str = null;
            str2 = null;
        }
        boolean z = awS70S0210000_18.z2;
        boolean zLJJIJ = ((C1206950hVt) awS70S0210000_18.l1).LJJIJ();
        c1207120hWA.getClass();
        C1207120hWA.LJ(str3, str, str2, zBooleanValue, z, zLJJIJ, null);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS70S0210000_18 awS70S0210000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS562S0100000_18((RefactorTTReviewCell) awS70S0210000_18.l0, 2663);
        C20248814Kw.LIZJ(c20248814Kw, false, false, 0.01f, 0, null, null, null, 112);
        c20248814Kw.LIZIZ(new AwS109S0210000_18((RefactorTTReviewCell) awS70S0210000_18.l0, (RefactorTTReviewCell) awS70S0210000_18.z2, (boolean) awS70S0210000_18.l1, (Function0<Unit>) 1));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS70S0210000_18 awS70S0210000_18, Object obj) {
        InterfaceC1183590guD interfaceC1183590guD = (InterfaceC1183590guD) obj;
        interfaceC1183590guD.LIZIZ(new AwS597S0100000_18((C21415018rM) awS70S0210000_18.l0, 1071));
        interfaceC1183590guD.LJIIJJI(new AwS556S0100000_12((PoiDetailHeaderAssem) awS70S0210000_18.l1, 992));
        interfaceC1183590guD.LJIIJ(new AwS562S0100000_18((PoiDetailHeaderAssem) awS70S0210000_18.l1, 2743));
        if (awS70S0210000_18.z2) {
            interfaceC1183590guD.LJIJJLI("data_from_anchor", "1");
            interfaceC1183590guD.LJJJ(new AwS597S0100000_18((PoiDetailHeaderAssem) awS70S0210000_18.l1, 1072));
        }
        final PoiDetailHeaderAssem poiDetailHeaderAssem = (PoiDetailHeaderAssem) awS70S0210000_18.l1;
        interfaceC1183590guD.LJJIIZI(new InterfaceC1193760hAc() { // from class: X.0gvb
            @Override // X.InterfaceC1193760hAc
            public final void LIZIZ(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1193760hAc
            public final void LIZ() {
                poiDetailHeaderAssem.getClass();
                System.out.println((Object) "logFmpFinish");
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0210000_18(C1207520hWo c1207520hWo, boolean z, C1206950hVt c1206950hVt, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1207520hWo;
        this.z2 = z;
        this.l1 = c1206950hVt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0210000_18(CollaborativeCollectionListStateAssem collaborativeCollectionListStateAssem, C1749280vcc c1749280vcc, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = collaborativeCollectionListStateAssem;
        this.l1 = c1749280vcc;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0210000_18(PoiListApi.PoiDetailResponse poiDetailResponse, PoiDetailSlashFragment poiDetailSlashFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = poiDetailSlashFragment;
        this.l1 = poiDetailResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0210000_18(PoiBaseBottomButtonsComponent poiBaseBottomButtonsComponent, PoiListApi.PoiDetailResponse poiDetailResponse, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiBaseBottomButtonsComponent;
        this.l1 = poiDetailResponse;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0210000_18(PoiBaseBottomButtonsComponent poiBaseBottomButtonsComponent, boolean z, PoiStableBottomBarModule poiStableBottomBarModule, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiBaseBottomButtonsComponent;
        this.z2 = z;
        this.l1 = poiStableBottomBarModule;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS70S0210000_18(RefactorTTReviewCell refactorTTReviewCell, RefactorTTReviewCell refactorTTReviewCell2, boolean z, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = refactorTTReviewCell;
        this.z2 = refactorTTReviewCell2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0210000_18(NearbyRegionListFragment nearbyRegionListFragment, boolean z, NearbyRegionListV1Response nearbyRegionListV1Response, int i) {
        super(1);
        this.$t = i;
        this.l0 = nearbyRegionListFragment;
        this.z2 = z;
        this.l1 = nearbyRegionListV1Response;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0210000_18(boolean z, C21415018rM c21415018rM, PoiDetailHeaderAssem poiDetailHeaderAssem, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = c21415018rM;
        this.l1 = poiDetailHeaderAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0210000_18(boolean z, C21415018rM c21415018rM, PoiDetailContentHeaderRegionalWithIntroAssemBase poiDetailContentHeaderRegionalWithIntroAssemBase, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = c21415018rM;
        this.l1 = poiDetailContentHeaderRegionalWithIntroAssemBase;
    }
}
