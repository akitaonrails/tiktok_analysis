package kotlin.jvm.internal;

import X.C09AY;
import X.C0H8A;
import X.C1155640gB8;
import X.C1156960gDG;
import X.C1156970gDH;
import X.C1156980gDI;
import X.C1157000gDK;
import X.C1182980gtE;
import X.C1196140hES;
import X.C1197910hHJ;
import X.C13LP;
import X.C1697810uHb;
import X.C20600815jK;
import X.C259800zU;
import X.InterfaceC1201180hMa;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.poi.PoiDataV2;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.osp.repo.model.OrderStatusResponse;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SubmitOrderResponse;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.search.detail.keyframe.viewmodel.BaseSearchDetailKeyframeVM;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.archive2.calendar.StoryArchiveV2CalendarViewModel;
import com.ss.android.ugc.nearby.container.model.NearbyRevampResponse;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS52S0100100_18 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS52S0100100_18 awS52S0100100_18, Object obj) {
        String str;
        PoiSearchApi.PoiSearchResultV2 poiSearchResultV2;
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LIZLLL = "/tiktok/poi/api/place/recommend";
        c1182980gtE.LJ = "default_search_poi";
        c1182980gtE.LIZ = Long.valueOf(awS52S0100100_18.j1);
        c1182980gtE.LIZIZ = Long.valueOf(System.currentTimeMillis());
        c1182980gtE.LIZJ = (PoiSearchApi.PoiSearchResultWrapperV2) awS52S0100100_18.l0;
        c1182980gtE.LJFF = new Pair<>("", "choose_poi");
        PoiSearchApi.PoiSearchResultWrapperV2 poiSearchResultWrapperV2 = (PoiSearchApi.PoiSearchResultWrapperV2) awS52S0100100_18.l0;
        if (poiSearchResultWrapperV2 != null && (poiSearchResultV2 = poiSearchResultWrapperV2.poiSearchResult) != null) {
            str = poiSearchResultV2.debugInfo;
        } else {
            str = null;
        }
        C1197910hHJ.LJ(c1182980gtE, str);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS52S0100100_18 awS52S0100100_18, Object obj) {
        Integer numValueOf;
        String str;
        List<PoiDataV2> list;
        List<PoiDataV2> list2;
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LIZ = Long.valueOf(awS52S0100100_18.j1);
        c1182980gtE.LIZIZ = Long.valueOf(System.currentTimeMillis());
        c1182980gtE.LIZLLL = "/tiktok/poi/api/place/recommend";
        c1182980gtE.LJ = "claimed_poi_recommend";
        c1182980gtE.LIZJ = (PoiSearchApi.PoiSearchResultWrapperV2) awS52S0100100_18.l0;
        c1182980gtE.LJFF = new Pair<>("", "request_send");
        PoiSearchApi.PoiSearchResultV2 poiSearchResultV2 = ((PoiSearchApi.PoiSearchResultWrapperV2) awS52S0100100_18.l0).poiSearchResult;
        String str2 = null;
        if (poiSearchResultV2 != null && (list2 = poiSearchResultV2.poiList) != null) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        c1182980gtE.LJIIL = numValueOf;
        PoiSearchApi.PoiSearchResultV2 poiSearchResultV22 = ((PoiSearchApi.PoiSearchResultWrapperV2) awS52S0100100_18.l0).poiSearchResult;
        if (poiSearchResultV22 != null && (list = poiSearchResultV22.poiList) != null && list.size() > 0) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        c1182980gtE.LJI = new Pair<>("isEmpty", str);
        PoiSearchApi.PoiSearchResultV2 poiSearchResultV23 = ((PoiSearchApi.PoiSearchResultWrapperV2) awS52S0100100_18.l0).poiSearchResult;
        if (poiSearchResultV23 != null) {
            str2 = poiSearchResultV23.debugInfo;
        }
        C1197910hHJ.LJ(c1182980gtE, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS52S0100100_18 awS52S0100100_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        Long l = (Long) awS52S0100100_18.l0;
        if (l != null) {
            long jLongValue = l.longValue();
            long j = awS52S0100100_18.j1;
            if (jLongValue < j) {
                c1196140hES.LIZ = Long.valueOf(j - ((Long) awS52S0100100_18.l0).longValue());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS52S0100100_18 awS52S0100100_18, Object obj) {
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LIZLLL = "/tiktok/nearby/region/list/v1/";
        c1182980gtE.LJ = "nearby_revamp";
        c1182980gtE.LIZ = Long.valueOf(awS52S0100100_18.j1);
        c1182980gtE.LIZIZ = Long.valueOf(System.currentTimeMillis());
        c1182980gtE.LIZJ = (InterfaceC1201180hMa) awS52S0100100_18.l0;
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS52S0100100_18 awS52S0100100_18, Object obj) {
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LIZLLL = "/tiktok/feed/nearby/revamp/preload";
        c1182980gtE.LJ = "preload_nearby_revamp";
        c1182980gtE.LIZ = Long.valueOf(awS52S0100100_18.j1);
        c1182980gtE.LIZIZ = Long.valueOf(SystemClock.elapsedRealtime());
        c1182980gtE.LIZJ = (InterfaceC1201180hMa) awS52S0100100_18.l0;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS52S0100100_18 awS52S0100100_18, Object obj) {
        Integer numValueOf;
        String str;
        List<PoiDataV2> list;
        List<PoiDataV2> list2;
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LIZ = Long.valueOf(awS52S0100100_18.j1);
        c1182980gtE.LIZIZ = Long.valueOf(System.currentTimeMillis());
        c1182980gtE.LIZLLL = "/tiktok/poi/api/place/search";
        c1182980gtE.LJ = "claimed_poi_search";
        c1182980gtE.LIZJ = (PoiSearchApi.PoiSearchResultWrapperV2) awS52S0100100_18.l0;
        c1182980gtE.LJFF = new Pair<>("", "request_send");
        PoiSearchApi.PoiSearchResultV2 poiSearchResultV2 = ((PoiSearchApi.PoiSearchResultWrapperV2) awS52S0100100_18.l0).poiSearchResult;
        String str2 = null;
        if (poiSearchResultV2 != null && (list2 = poiSearchResultV2.poiList) != null) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        c1182980gtE.LJIIL = numValueOf;
        PoiSearchApi.PoiSearchResultV2 poiSearchResultV22 = ((PoiSearchApi.PoiSearchResultWrapperV2) awS52S0100100_18.l0).poiSearchResult;
        if (poiSearchResultV22 != null && (list = poiSearchResultV22.poiList) != null && list.size() > 0) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        c1182980gtE.LJI = new Pair<>("isEmpty", str);
        PoiSearchApi.PoiSearchResultV2 poiSearchResultV23 = ((PoiSearchApi.PoiSearchResultWrapperV2) awS52S0100100_18.l0).poiSearchResult;
        if (poiSearchResultV23 != null) {
            str2 = poiSearchResultV23.debugInfo;
        }
        C1197910hHJ.LJ(c1182980gtE, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS52S0100100_18 awS52S0100100_18, Object obj) {
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LJIILIIL = "location_net_track_osp";
        c1182980gtE.LIZLLL = "/tiktok/ls/order/status/get/v1";
        c1182980gtE.LJ = "poi_order_status";
        c1182980gtE.LIZ = Long.valueOf(awS52S0100100_18.j1);
        c1182980gtE.LIZIZ = Long.valueOf(System.currentTimeMillis());
        c1182980gtE.LIZJ = (OrderStatusResponse) awS52S0100100_18.l0;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS52S0100100_18 awS52S0100100_18, Object obj) {
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LJIILIIL = "location_net_track_osp";
        c1182980gtE.LIZLLL = "/tiktok/ls/order/submit/v1";
        c1182980gtE.LJ = "poi_order_submit";
        c1182980gtE.LIZ = Long.valueOf(awS52S0100100_18.j1);
        c1182980gtE.LIZIZ = Long.valueOf(System.currentTimeMillis());
        c1182980gtE.LIZJ = (SubmitOrderResponse) awS52S0100100_18.l0;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS52S0100100_18 awS52S0100100_18, Object obj) {
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LIZLLL = "/tiktok/poi/review/get/v1";
        c1182980gtE.LJ = "poi_review_get";
        c1182980gtE.LIZ = Long.valueOf(awS52S0100100_18.j1);
        c1182980gtE.LIZIZ = Long.valueOf(System.currentTimeMillis());
        c1182980gtE.LIZJ = (PoiReviewsApi.PoiReviewListResponse) awS52S0100100_18.l0;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS52S0100100_18 awS52S0100100_18, Object obj) {
        boolean z;
        C20600815jK c20600815jK = (C20600815jK) obj;
        Runnable runnable = null;
        c20600815jK.LJFF(null);
        long j = awS52S0100100_18.j1;
        Calendar calendar = Calendar.getInstance();
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        calendar.setTimeInMillis(j * j2);
        StoryArchiveV2CalendarViewModel storyArchiveV2CalendarViewModel = (StoryArchiveV2CalendarViewModel) awS52S0100100_18.l0;
        int i = 2;
        int i2 = 1;
        int i3 = calendar.get(2) + 1;
        int i4 = calendar.get(1);
        storyArchiveV2CalendarViewModel.getClass();
        ArrayList arrayList = new ArrayList();
        Calendar calendar2 = Calendar.getInstance();
        int i5 = calendar2.get(2) + 1;
        int i6 = calendar2.get(1);
        Calendar calendar3 = Calendar.getInstance();
        while (true) {
            if (i4 >= i6 && (i4 != i6 || i3 > i5)) {
                break;
            }
            Calendar calendar4 = Calendar.getInstance();
            calendar4.clear();
            calendar4.set(i2, i4);
            int i7 = i3 - 1;
            calendar4.set(i, i7);
            arrayList.add(new C1156960gDG(calendar4.getTimeInMillis()));
            calendar3.clear();
            calendar3.set(i4, i7, i2);
            int i8 = calendar3.get(7) - i2;
            int actualMaximum = calendar3.getActualMaximum(5);
            for (int i9 = 0; i9 < i8; i9++) {
                arrayList.add(new C1156970gDH(0));
            }
            if (i4 == i6 && i3 == i5) {
                z = true;
                actualMaximum = calendar2.get(5);
            } else {
                z = false;
            }
            int i10 = 1;
            if (1 <= actualMaximum) {
                while (true) {
                    if (z && i10 == actualMaximum) {
                        arrayList.add(new C1156980gDI(0));
                    } else {
                        calendar3.set(5, i10);
                        arrayList.add(new C1157000gDK(calendar3.getTimeInMillis() / j2, null, null, false));
                    }
                    if (i10 == actualMaximum) {
                        break;
                    }
                    i10++;
                }
            }
            int i11 = (7 - ((i8 + actualMaximum) % 7)) % 7;
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(new C1156970gDH(0));
            }
            if (i3 == 12) {
                i4++;
                i3 = 1;
            } else {
                i3++;
            }
            runnable = null;
            i = 2;
            i2 = 1;
        }
        c20600815jK.LIZLLL(arrayList, runnable);
        ((StoryArchiveV2CalendarViewModel) awS52S0100100_18.l0).LLILZLL.getValue().setState(new AwS32S0010000_18(12));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS52S0100100_18 awS52S0100100_18, Object obj) {
        boolean z;
        C0H8A c0h8a;
        boolean z2;
        C1155640gB8 c1155640gB8 = (C1155640gB8) obj;
        int i = c1155640gB8.LL;
        BaseSearchDetailKeyframeVM baseSearchDetailKeyframeVM = (BaseSearchDetailKeyframeVM) awS52S0100100_18.l0;
        List<C0H8A> list = c1155640gB8.LLILLL;
        long j = awS52S0100100_18.j1;
        baseSearchDetailKeyframeVM.getClass();
        Iterator<C0H8A> it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (BaseSearchDetailKeyframeVM.xQ2(it2.next().LLILLJJLI, j)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            numValueOf = null;
        }
        int i3 = 0;
        for (C0H8A c0h8a2 : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C0H8A c0h8a3 = c0h8a2;
                if (numValueOf != null && i3 == numValueOf.intValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c0h8a3.LLILLL = z2;
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (numValueOf == null || i != numValueOf.intValue()) {
            if (i >= 0 && C13LP.LJJJLZIJ(i, c1155640gB8.LLILLL) != null) {
                ((BaseSearchDetailKeyframeVM) awS52S0100100_18.l0).wQ2(i, (C0H8A) C13LP.LJJJLZIJ(i, c1155640gB8.LLILLL));
            }
            if (numValueOf == null && i >= 0 && (c0h8a = (C0H8A) C13LP.LJJJLZIJ(i, c1155640gB8.LLILLL)) != null) {
                c0h8a.LLILLL = false;
            }
            ((BaseSearchDetailKeyframeVM) awS52S0100100_18.l0).setState(new AwS384S0200000_18(numValueOf, c1155640gB8, 252));
            if (numValueOf != null) {
                BaseSearchDetailKeyframeVM baseSearchDetailKeyframeVM2 = (BaseSearchDetailKeyframeVM) awS52S0100100_18.l0;
                int iIntValue = numValueOf.intValue();
                baseSearchDetailKeyframeVM2.vQ2(iIntValue, (C0H8A) C13LP.LJJJLZIJ(iIntValue, c1155640gB8.LLILLL));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS52S0100100_18 awS52S0100100_18, Object obj) {
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LIZ = Long.valueOf(awS52S0100100_18.j1);
        c1182980gtE.LIZIZ = Long.valueOf(System.currentTimeMillis());
        c1182980gtE.LIZLLL = "/tiktok/poi/slash/v1";
        c1182980gtE.LJ = "chunk";
        c1182980gtE.LIZJ = (InterfaceC1201180hMa) ((C259800zU) awS52S0100100_18.l0).element;
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS52S0100100_18 awS52S0100100_18, Object obj) {
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LIZ = Long.valueOf(awS52S0100100_18.j1);
        c1182980gtE.LIZIZ = Long.valueOf(System.currentTimeMillis());
        c1182980gtE.LIZLLL = "/tiktok/poi/slash/v1";
        c1182980gtE.LJ = "chunk";
        c1182980gtE.LIZJ = (InterfaceC1201180hMa) ((C259800zU) awS52S0100100_18.l0).element;
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS52S0100100_18) (LINE:50331651) kotlin.jvm.internal.AwS52S0100100_18.j1 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS52S0100100_18) (LINE:50331653) kotlin.jvm.internal.AwS52S0100100_18.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS52S0100100_18] */
    public AwS52S0100100_18(long j, long j2, C259800zU<SlashPage> c259800zU) {
        long j3;
        Object obj;
        c09ay.$t = c259800zU;
        c09ay.j1 = j3;
        c09ay.l0 = obj;
        ?? c09ay = new C09AY(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0100100_18(long j, InterfaceC1201180hMa interfaceC1201180hMa, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = interfaceC1201180hMa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0100100_18(long j, PoiSearchApi.PoiSearchResultWrapperV2 poiSearchResultWrapperV2, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = poiSearchResultWrapperV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0100100_18(long j, OrderStatusResponse orderStatusResponse, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = orderStatusResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0100100_18(long j, SubmitOrderResponse submitOrderResponse, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = submitOrderResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0100100_18(long j, PoiReviewsApi.PoiReviewListResponse poiReviewListResponse, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = poiReviewListResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0100100_18(long j, StoryArchiveV2CalendarViewModel storyArchiveV2CalendarViewModel, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = storyArchiveV2CalendarViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0100100_18(long j, NearbyRevampResponse nearbyRevampResponse, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = nearbyRevampResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0100100_18(long j, Long l, int i) {
        super(1);
        this.$t = i;
        this.l0 = l;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0100100_18(BaseSearchDetailKeyframeVM baseSearchDetailKeyframeVM, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = baseSearchDetailKeyframeVM;
        this.j1 = j;
    }
}
