package kotlin.jvm.internal;

import X.C09AY;
import X.C1712450ufD;
import X.C1712460ufE;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C20600815jK;
import X.C755000TjW;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ARunnableS126S0100000_26;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.pipo.cashier.common.address.DistrictDTO;
import com.ss.android.ugc.aweme.pipo.cashier.common.address.DistrictsDTO;
import com.ss.android.ugc.aweme.pipo.cashier.common.address.Region;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes27.dex */
public class AwS5S0510000_26 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS5S0510000_26 awS5S0510000_26, Object obj, Object obj2) {
        List<Region> list;
        DistrictsDTO districtsDTO = (DistrictsDTO) obj2;
        if (((Boolean) obj).booleanValue() && districtsDTO != null && (list = districtsDTO.districts) != null && !list.isEmpty()) {
            ((C1712450ufD) awS5S0510000_26.l0).getStatusView();
            C1712450ufD c1712450ufD = (C1712450ufD) awS5S0510000_26.l0;
            Function1 function1 = (Function1) awS5S0510000_26.l2;
            Map map = (Map) awS5S0510000_26.l4;
            Region region = (Region) awS5S0510000_26.l1;
            boolean z = awS5S0510000_26.z5;
            Function1 function12 = (Function1) awS5S0510000_26.l3;
            C786410Ut5.LLLZLZ(c1712450ufD.getStatusView(), 8);
            Region region2 = (Region) ListProtector.get(districtsDTO.districts, 0);
            int size = ((ArrayList) c1712450ufD.LLILZLL).size();
            C1845940y8W c1845940y8WLJII = c1712450ufD.getTabBar().LJII(((ArrayList) c1712450ufD.LLILZIL).size());
            if (c1845940y8WLJII != null) {
                c1845940y8WLJII.LIZIZ(region2.description);
            }
            function1.invoke(region2.description);
            ((ArrayList) c1712450ufD.LLILZ).add(region2.description);
            List<C1712460ufE> list2 = c1712450ufD.LLILZLL;
            List<Region> list3 = districtsDTO.districts;
            String str = region2.level;
            if (str == null) {
                str = "";
            }
            map.put("cur_level", str);
            ((ArrayList) list2).add(new C1712460ufE(list3, map, new AwS132S0101000_26(c1712450ufD, size, 14), new AwS3S0510000_26(c1712450ufD, region, map, function1, function12, z, 0)));
            c1712450ufD.getViewPager().getViewItemOperator().getState().LJIIJJI(c1712450ufD.LLILZLL, new ARunnableS126S0100000_26(c1712450ufD, 51));
            c1712450ufD.getTabBar().LJIILL(c1712450ufD.getTabBar().LJII(((ArrayList) c1712450ufD.LLILZLL).size() - 1), true);
        } else {
            C1749280vcc statusView = ((C1712450ufD) awS5S0510000_26.l0).getStatusView();
            C1712450ufD c1712450ufD2 = (C1712450ufD) awS5S0510000_26.l0;
            Region region3 = (Region) awS5S0510000_26.l1;
            boolean z2 = awS5S0510000_26.z5;
            Function1 function13 = (Function1) awS5S0510000_26.l2;
            Function1 function14 = (Function1) awS5S0510000_26.l3;
            C786410Ut5.LLLZLZ(c1712450ufD2.getStatusView(), 0);
            C1749280vcc statusView2 = c1712450ufD2.getStatusView();
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C755000TjW.LIZ(c1722300uv6, statusView.getContext(), new AwS21S0410000_26(c1712450ufD2, region3, z2, function13, function14, 0));
            statusView2.setStatus(c1722300uv6);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS5S0510000_26 awS5S0510000_26, Object obj, Object obj2) {
        Region region;
        List<Region> list;
        DistrictDTO districtDTO = (DistrictDTO) obj2;
        if (((Boolean) obj).booleanValue()) {
            ((C1712450ufD) awS5S0510000_26.l0).getStatusView();
            C786410Ut5.LLLZLZ(((C1712450ufD) awS5S0510000_26.l0).getStatusView(), 8);
            if (districtDTO != null && (region = districtDTO.district) != null && (list = region.subRegion) != null && !list.isEmpty()) {
                if (awS5S0510000_26.z5) {
                    C1845940y8W c1845940y8WLJII = ((C1712450ufD) awS5S0510000_26.l0).getTabBar().LJII(((ArrayList) ((C1712450ufD) awS5S0510000_26.l0).LLILZLL).size());
                    if (c1845940y8WLJII != null) {
                        c1845940y8WLJII.LIZIZ(((Region) ListProtector.get(districtDTO.district.subRegion, 0)).description);
                    }
                } else {
                    C1846060y8i tabBar = ((C1712450ufD) awS5S0510000_26.l0).getTabBar();
                    C1845940y8W c1845940y8WLJIIIZ = ((C1712450ufD) awS5S0510000_26.l0).getTabBar().LJIIIZ();
                    c1845940y8WLJIIIZ.LIZIZ(((Region) ListProtector.get(districtDTO.district.subRegion, 0)).description);
                    tabBar.LIZIZ(c1845940y8WLJIIIZ, tabBar.LLILZLL.size(), tabBar.LLILZLL.isEmpty());
                }
                Region region2 = (Region) ListProtector.get(districtDTO.district.subRegion, 0);
                int size = ((ArrayList) ((C1712450ufD) awS5S0510000_26.l0).LLILZLL).size();
                ((ArrayList) ((C1712450ufD) awS5S0510000_26.l0).LLILZ).add(region2.description);
                ((Function1) awS5S0510000_26.l2).invoke(region2.description);
                List<C1712460ufE> list2 = ((C1712450ufD) awS5S0510000_26.l0).LLILZLL;
                List<Region> list3 = districtDTO.district.subRegion;
                Map map = (Map) awS5S0510000_26.l3;
                String str = region2.level;
                if (str == null) {
                    str = "";
                }
                map.put("cur_level", str);
                C1712450ufD c1712450ufD = (C1712450ufD) awS5S0510000_26.l0;
                c1712450ufD.getClass();
                ArrayList arrayList = (ArrayList) list2;
                arrayList.add(new C1712460ufE(list3, map, new AwS132S0101000_26(c1712450ufD, size, 14), new AwS3S0510000_26((C1712450ufD) awS5S0510000_26.l0, (Region) awS5S0510000_26.l4, (Map) awS5S0510000_26.l3, (Function1) awS5S0510000_26.l2, (Function1) awS5S0510000_26.l1, awS5S0510000_26.z5, 1)));
                C20600815jK<InterfaceC1891350zJl> state = ((C1712450ufD) awS5S0510000_26.l0).getViewPager().getViewItemOperator().getState();
                C1712450ufD c1712450ufD2 = (C1712450ufD) awS5S0510000_26.l0;
                state.LJIIJJI(c1712450ufD2.LLILZLL, new ARunnableS126S0100000_26(c1712450ufD2, 52));
                ((C1712450ufD) awS5S0510000_26.l0).getTabBar().LJIILL(((C1712450ufD) awS5S0510000_26.l0).getTabBar().LJII(((ArrayList) ((C1712450ufD) awS5S0510000_26.l0).LLILZLL).size() - 1), true);
            } else {
                ((Function1) awS5S0510000_26.l1).invoke(((C1712450ufD) awS5S0510000_26.l0).LLILZIL);
            }
        } else {
            C1749280vcc statusView = ((C1712450ufD) awS5S0510000_26.l0).getStatusView();
            C1712450ufD c1712450ufD3 = (C1712450ufD) awS5S0510000_26.l0;
            Region region3 = (Region) awS5S0510000_26.l4;
            boolean z = awS5S0510000_26.z5;
            Function1 function1 = (Function1) awS5S0510000_26.l2;
            Function1 function12 = (Function1) awS5S0510000_26.l1;
            C786410Ut5.LLLZLZ(c1712450ufD3.getStatusView(), 0);
            C1749280vcc statusView2 = c1712450ufD3.getStatusView();
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C755000TjW.LIZ(c1722300uv6, statusView.getContext(), new AwS21S0410000_26(c1712450ufD3, region3, z, function1, function12, 1));
            statusView2.setStatus(c1722300uv6);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS5S0510000_26(X.C1712450ufD r3, com.ss.android.ugc.aweme.pipo.cashier.common.address.Region r4, java.util.Map r5, kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function1 r7, boolean r8, int r9) {
        /*
            r2 = this;
            r2.$t = r9
            if (r9 == 0) goto L16
            r1 = r2
            r1.l0 = r3
            r1.l1 = r6
            r1.z5 = r8
            r1.l2 = r7
            r1.l3 = r5
            r1.l4 = r4
            r0 = 2
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.z5 = r8
            r1.l2 = r6
            r1.l3 = r7
            r1.l4 = r5
            r0 = 2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS5S0510000_26.<init>(X.0ufD, com.ss.android.ugc.aweme.pipo.cashier.common.address.Region, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, int):void");
    }
}
