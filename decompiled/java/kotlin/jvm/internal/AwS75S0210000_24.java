package kotlin.jvm.internal;

import X.AbstractC1623806Xk;
import X.C09AY;
import X.C1165890gRf;
import X.C13BV;
import X.C1572840r22;
import X.C1572980r2G;
import X.C1572990r2H;
import X.C1573950r3p;
import X.C1579330rCV;
import X.C1581040rFG;
import X.C1598830rhx;
import X.C1600200rkA;
import X.C1611880s30;
import X.C1612210s3X;
import X.C1623606Xi;
import X.C1697810uHb;
import X.C2252611DEt;
import X.C23271099x;
import X.C259800zU;
import X.C491001vg;
import X.C491101vh;
import X.C626160OhC;
import X.C627660Ojc;
import X.C948503nH;
import X.InterfaceC1611890s31;
import X.InterfaceC20236714Gf;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse;
import com.ss.android.ugc.aweme.series.feed.profile.model.SeriesProfileTabResponse;
import com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel;
import com.ss.android.ugc.aweme.series.serieslist.viewmodel.SeriesListAssemViewModel;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostsListViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS75S0210000_24 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS75S0210000_24 awS75S0210000_24, Object obj) {
        AbstractC1623806Xk c1623606Xi;
        AbstractC1623806Xk c1623606Xi2;
        boolean zLJFF;
        boolean zLJFF2;
        C1165890gRf c1165890gRf = (C1165890gRf) obj;
        if (awS75S0210000_24.z2) {
            SeriesCenterListResponse seriesCenterListResponse = (SeriesCenterListResponse) ((C259800zU) awS75S0210000_24.l0).element;
            if (seriesCenterListResponse != null) {
                zLJFF2 = Intrinsics.LJFF(seriesCenterListResponse.hasMore, Boolean.TRUE);
            } else {
                zLJFF2 = false;
            }
            c1623606Xi = new C1623606Xi(new C626160OhC(false, zLJFF2));
        } else {
            c1623606Xi = C491101vh.LIZ;
        }
        if (awS75S0210000_24.z2) {
            SeriesCenterListResponse seriesCenterListResponse2 = (SeriesCenterListResponse) ((C259800zU) awS75S0210000_24.l0).element;
            if (seriesCenterListResponse2 != null) {
                zLJFF = Intrinsics.LJFF(seriesCenterListResponse2.hasMore, Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            c1623606Xi2 = new C1623606Xi(new C626160OhC(false, zLJFF));
        } else {
            c1623606Xi2 = C491101vh.LIZ;
        }
        return C1165890gRf.LIZ(c1165890gRf, new C627660Ojc(c1623606Xi2, null, null, (List) awS75S0210000_24.l1, 6), c1623606Xi, 6);
    }

    public static final Object invoke$1(AwS75S0210000_24 awS75S0210000_24, Object obj) {
        boolean zLJFF;
        AbstractC1623806Xk c1623606Xi;
        boolean zLJFF2;
        C1572990r2H c1572990r2H = (C1572990r2H) obj;
        if (awS75S0210000_24.z2) {
            SeriesProfileTabResponse seriesProfileTabResponse = (SeriesProfileTabResponse) awS75S0210000_24.l0;
            if (((List) awS75S0210000_24.l1).isEmpty() && ((SeriesProfileTabResponse) awS75S0210000_24.l0).status_code != 0) {
                c1623606Xi = new C491001vg(new Exception("no data"));
            } else {
                SeriesProfileTabResponse seriesProfileTabResponse2 = (SeriesProfileTabResponse) awS75S0210000_24.l0;
                if (seriesProfileTabResponse2 != null) {
                    zLJFF2 = Intrinsics.LJFF(seriesProfileTabResponse2.hasMore, Boolean.TRUE);
                } else {
                    zLJFF2 = false;
                }
                c1623606Xi = new C1623606Xi(new C626160OhC(false, zLJFF2));
            }
            return C1572990r2H.LIZ(c1572990r2H, 0L, false, false, false, seriesProfileTabResponse, new C627660Ojc(c1623606Xi, null, null, (List) awS75S0210000_24.l1, 6), 15);
        }
        SeriesProfileTabResponse seriesProfileTabResponse3 = (SeriesProfileTabResponse) awS75S0210000_24.l0;
        if (seriesProfileTabResponse3 != null) {
            zLJFF = Intrinsics.LJFF(seriesProfileTabResponse3.hasMore, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        return C1572990r2H.LIZ(c1572990r2H, 0L, false, false, false, seriesProfileTabResponse3, new C627660Ojc(null, new C1623606Xi(new C626160OhC(false, zLJFF)), null, (List) awS75S0210000_24.l1, 5), 15);
    }

    public static final Object invoke$2(AwS75S0210000_24 awS75S0210000_24, Object obj) {
        int iIntValue;
        String aid;
        C1612210s3X c1612210s3X = (C1612210s3X) obj;
        int iLLLZIIL = ((InterfaceC1611890s31) ((SeriesInnerFeedViewModel) awS75S0210000_24.l0).GQ2().getOperator()).LLLZIIL();
        List<C1611880s30> listHQ2 = ((SeriesInnerFeedViewModel) awS75S0210000_24.l0).HQ2();
        if (listHQ2 == null) {
            listHQ2 = C13BV.INSTANCE;
        }
        Aweme aweme = (Aweme) awS75S0210000_24.l1;
        Iterator<C1611880s30> it2 = listHQ2.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                Aweme aweme2 = it2.next().LL.aweme;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, aweme.getAid())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() >= 0) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        return C1612210s3X.LIZ(c1612210s3X, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(iLLLZIIL + iIntValue), ((Aweme) awS75S0210000_24.l1).getAid(), Boolean.valueOf(awS75S0210000_24.z2), false, false, null, null, null, false, null, null, null, null, null, false, null, null, null, -28673);
    }

    public static final Object invoke$3(AwS75S0210000_24 awS75S0210000_24, Object obj) {
        SchoolPostsListViewModel schoolPostsListViewModel = (SchoolPostsListViewModel) awS75S0210000_24.l0;
        C948503nH.LJI(schoolPostsListViewModel, C23271099x.INSTANCE, new C1581040rFG(schoolPostsListViewModel, awS75S0210000_24.z2, (C1579330rCV) obj, (InterfaceC20236714Gf) awS75S0210000_24.l1, null));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS75S0210000_24 r2, java.lang.Object r3) {
        /*
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            java.lang.Object r0 = r2.l0
            X.0rkA r0 = (X.C1600200rkA) r0
            com.ss.android.ugc.aweme.item.StoryCacheData r1 = r0.LJII
            java.lang.Object r0 = r2.l1
            X.0rk7 r0 = (X.InterfaceC1600170rk7) r0
            r0.LIZ(r1)
            java.lang.Object r0 = r2.l0
            X.0rkA r0 = (X.C1600200rkA) r0
            X.0rkL r1 = r0.LIZ
            r0 = 100
            r1.LIZIZ(r0)
            boolean r0 = r2.z2
            if (r0 == 0) goto L2f
            java.lang.Object r1 = r2.l0
            X.0rkA r1 = (X.C1600200rkA) r1
            X.05mq<X.0zJl> r0 = r1.LJI
            if (r0 == 0) goto L2f
            r1.LJIILIIL()
        L2c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2f:
            java.lang.Object r2 = r2.l0
            X.0rkA r2 = (X.C1600200rkA) r2
            r1 = 0
            r0 = 3
            X.C1600200rkA.LIZIZ(r2, r1, r0)
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS75S0210000_24.invoke$4(kotlin.jvm.internal.AwS75S0210000_24, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS75S0210000_24 awS75S0210000_24, Object obj) {
        List<C1573950r3p> list = ((C1572980r2G) obj).LLILLJJLI.LLILZ;
        if (list != null) {
            CollectionDetailModel collectionDetailModel = (CollectionDetailModel) awS75S0210000_24.l0;
            boolean z = awS75S0210000_24.z2;
            SeriesListAssemViewModel seriesListAssemViewModel = (SeriesListAssemViewModel) awS75S0210000_24.l1;
            Iterator<C1573950r3p> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1573950r3p next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C1573950r3p c1573950r3p = next;
                    CollectionDetailModel collectionDetailModel2 = c1573950r3p.LL;
                    if (collectionDetailModel2.collectionId == collectionDetailModel.collectionId) {
                        seriesListAssemViewModel.listSetItemAt(i, new C1573950r3p(collectionDetailModel2, c1573950r3p.LLILLJJLI, c1573950r3p.LLILLL, c1573950r3p.LLILZ, c1573950r3p.LLILZIL, c1573950r3p.LLILZLL, z));
                        break;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS75S0210000_24(C1600200rkA c1600200rkA, C1598830rhx c1598830rhx, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1600200rkA;
        this.l1 = c1598830rhx;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS75S0210000_24(CollectionDetailModel collectionDetailModel, boolean z, SeriesListAssemViewModel seriesListAssemViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = collectionDetailModel;
        this.z2 = z;
        this.l1 = seriesListAssemViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS75S0210000_24(SeriesInnerFeedViewModel seriesInnerFeedViewModel, Aweme aweme, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = seriesInnerFeedViewModel;
        this.l1 = aweme;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS75S0210000_24(SchoolPostsListViewModel schoolPostsListViewModel, boolean z, C2252611DEt c2252611DEt, int i) {
        super(1);
        this.$t = i;
        this.l0 = schoolPostsListViewModel;
        this.z2 = z;
        this.l1 = c2252611DEt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS75S0210000_24(List list, C259800zU c259800zU, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = c259800zU;
        this.l1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS75S0210000_24(boolean z, boolean z2, SeriesProfileTabResponse seriesProfileTabResponse, List<C1572840r22> list) {
        super(1);
        this.$t = list;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = seriesProfileTabResponse;
    }
}
