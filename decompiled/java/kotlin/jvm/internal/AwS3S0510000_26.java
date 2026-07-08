package kotlin.jvm.internal;

import X.C09AY;
import X.C1309620kBU;
import X.C1710990ucr;
import X.C1712450ufD;
import X.C1742800vSA;
import X.C1742910vSL;
import X.C1742950vSP;
import X.C1742960vSQ;
import X.C1742970vSR;
import X.C1845940y8W;
import X.C19719612Di;
import X.EnumC1742610vRr;
import X.EnumC1742810vSB;
import X.InterfaceC1709310ua9;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.ContentFeedData;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.ServerConfigStyle;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.address.Region;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS3S0510000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS3S0510000_26 awS3S0510000_26, Object obj) {
        Region region = (Region) obj;
        InterfaceC1709310ua9 interfaceC1709310ua9LIZ = C1710990ucr.LIZ("CASHIER");
        Map<String, String> map = (Map) awS3S0510000_26.l0;
        String str = region.geoNameId;
        if (str == null) {
            str = "";
        }
        map.put("select_geoname_id", str);
        map.put("click_type", "district");
        interfaceC1709310ua9LIZ.LIZ("rd_pipo_district_select_click", map);
        C1845940y8W c1845940y8WLJII = ((C1712450ufD) awS3S0510000_26.l1).getTabBar().LJII(((ArrayList) ((C1712450ufD) awS3S0510000_26.l1).LLILZIL).size());
        if (c1845940y8WLJII != null) {
            c1845940y8WLJII.LIZIZ(region.name);
        }
        ((C1712450ufD) awS3S0510000_26.l1).LIZIZ((Region) awS3S0510000_26.l2, region, awS3S0510000_26.z5, (Function1) awS3S0510000_26.l3, (Function1) awS3S0510000_26.l4);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S0510000_26 awS3S0510000_26, Object obj) {
        Region region = (Region) obj;
        InterfaceC1709310ua9 interfaceC1709310ua9LIZ = C1710990ucr.LIZ("CASHIER");
        Map<String, String> map = (Map) awS3S0510000_26.l0;
        String str = region.geoNameId;
        if (str == null) {
            str = "";
        }
        map.put("select_geoname_id", str);
        interfaceC1709310ua9LIZ.LIZ("rd_pipo_district_select_click", map);
        C1845940y8W c1845940y8WLJII = ((C1712450ufD) awS3S0510000_26.l1).getTabBar().LJII(((ArrayList) ((C1712450ufD) awS3S0510000_26.l1).LLILZIL).size());
        if (c1845940y8WLJII != null) {
            c1845940y8WLJII.LIZIZ(region.name);
        }
        ((C1712450ufD) awS3S0510000_26.l1).LIZIZ((Region) awS3S0510000_26.l2, region, awS3S0510000_26.z5, (Function1) awS3S0510000_26.l3, (Function1) awS3S0510000_26.l4);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS3S0510000_26 awS3S0510000_26, Object obj) {
        EnumC1742610vRr enumC1742610vRr;
        ContentFeedData contentFeedData;
        boolean z;
        String str;
        C1742800vSA c1742800vSA = (C1742800vSA) obj;
        ArrayList arrayList = new ArrayList(c1742800vSA.LLILZ);
        C19719612Di.LJJIIJ(arrayList, AFwS268S0000000_26.get$arr$(784), true);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof C1742970vSR) {
                arrayList2.add(obj2);
            }
        }
        arrayList2.size();
        C1309620kBU.LIZ("DataProcess");
        if (awS3S0510000_26.z5) {
            List list = (List) awS3S0510000_26.l0;
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            int i = -1;
            String str2 = null;
            if (!z) {
                Iterator it2 = arrayList.iterator();
                int i2 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        C1742910vSL c1742910vSL = (C1742910vSL) it2.next();
                        if ((c1742910vSL instanceof C1742960vSQ) && Intrinsics.LJFF(c1742910vSL.LL, "live_feed_title")) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                Integer numValueOf = Integer.valueOf(i2);
                if (numValueOf.intValue() < 0) {
                    numValueOf.intValue();
                    ServerConfigStyle serverConfigStyle = c1742800vSA.LLJ;
                    if (serverConfigStyle != null) {
                        str = serverConfigStyle.liveFeedTitle;
                    } else {
                        str = null;
                    }
                    ListProtector.add(arrayList, 0, new C1742960vSQ("live_feed_title", str));
                }
                arrayList.addAll((List) awS3S0510000_26.l0);
            }
            List list2 = (List) awS3S0510000_26.l1;
            if (list2 != null && !list2.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                int i3 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    C1742910vSL c1742910vSL2 = (C1742910vSL) it3.next();
                    if ((c1742910vSL2 instanceof C1742960vSQ) && Intrinsics.LJFF(c1742910vSL2.LL, "video_feed_title")) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
                Integer numValueOf2 = Integer.valueOf(i);
                if (numValueOf2.intValue() < 0) {
                    numValueOf2.intValue();
                    ServerConfigStyle serverConfigStyle2 = c1742800vSA.LLJ;
                    if (serverConfigStyle2 != null) {
                        str2 = serverConfigStyle2.videoFeedTitle;
                    }
                    arrayList.add(new C1742960vSQ("video_feed_title", str2, 44));
                }
                arrayList.addAll((List) awS3S0510000_26.l1);
                ((TrendingListViewModel) awS3S0510000_26.l2).yQ2((List) awS3S0510000_26.l1);
            }
        } else {
            List list3 = (List) awS3S0510000_26.l3;
            if (list3 != null && !list3.isEmpty()) {
                arrayList.addAll((List) awS3S0510000_26.l3);
            }
            ((TrendingListViewModel) awS3S0510000_26.l2).yQ2(arrayList);
        }
        TrendingListViewModel trendingListViewModel = (TrendingListViewModel) awS3S0510000_26.l2;
        String str3 = ((C1742950vSP) awS3S0510000_26.l4).LJI;
        if (str3 == null) {
            str3 = "";
        }
        trendingListViewModel.getClass();
        TrendingListViewModel.BQ2(str3, arrayList);
        if (awS3S0510000_26.z5) {
            ContentFeedData contentFeedData2 = ((C1742950vSP) awS3S0510000_26.l4).LJII;
            if ((contentFeedData2 == null || !Intrinsics.LJFF(contentFeedData2.hasMore, Boolean.TRUE)) && (contentFeedData = ((C1742950vSP) awS3S0510000_26.l4).LJIIIIZZ) != null && Intrinsics.LJFF(contentFeedData.hasMore, Boolean.FALSE)) {
                enumC1742610vRr = EnumC1742610vRr.NO_MORE_DATA;
            } else {
                enumC1742610vRr = EnumC1742610vRr.SUCCESS;
            }
        } else {
            ContentFeedData contentFeedData3 = ((C1742950vSP) awS3S0510000_26.l4).LIZ;
            if (contentFeedData3 != null && Intrinsics.LJFF(contentFeedData3.hasMore, Boolean.TRUE)) {
                enumC1742610vRr = EnumC1742610vRr.SUCCESS;
            } else {
                enumC1742610vRr = EnumC1742610vRr.NO_MORE_DATA;
            }
        }
        if (enumC1742610vRr == EnumC1742610vRr.NO_MORE_DATA) {
            arrayList.add(new C1742910vSL() { // from class: X.0vSS
                @Override // X.C1742910vSL
                public final int LIZ() {
                    return 2;
                }
            });
        } else {
            arrayList.add(new C1742970vSR());
        }
        return C1742800vSA.LIZ(c1742800vSA, EnumC1742810vSB.LOAD_MORE, null, null, arrayList, 0, false, enumC1742610vRr, false, null, null, 950);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0510000_26(C1712450ufD c1712450ufD, Region region, Map map, Function1 function1, Function1 function12, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = map;
        this.l1 = c1712450ufD;
        this.l2 = region;
        this.z5 = z;
        this.l3 = function1;
        this.l4 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS3S0510000_26(boolean z, boolean z2, List<? extends C1742910vSL> list, List<? extends C1742910vSL> list2, TrendingListViewModel trendingListViewModel, List<? extends C1742910vSL> list3, C1742950vSP c1742950vSP) {
        super(1);
        this.$t = c1742950vSP;
        this.z5 = z;
        this.l0 = z2;
        this.l1 = list;
        this.l2 = list2;
        this.l3 = trendingListViewModel;
        this.l4 = list3;
    }
}
