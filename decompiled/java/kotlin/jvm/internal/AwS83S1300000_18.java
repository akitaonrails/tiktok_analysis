package kotlin.jvm.internal;

import X.C09AY;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1185410gx9;
import X.C1191160h6Q;
import X.C1191760h7O;
import X.C1367960lha;
import X.C1558520qew;
import X.C19719512Dh;
import X.C2188811AlT;
import X.C2255008sW;
import X.EnumC1160730gJL;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.hotel.PoiDetailHotelHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class AwS83S1300000_18 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS83S1300000_18 awS83S1300000_18) {
        Lifecycle lifecycle = ((LifecycleOwner) awS83S1300000_18.l1).getLifecycle();
        final InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS83S1300000_18.l2;
        final InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) awS83S1300000_18.l3;
        final String str = awS83S1300000_18.s0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.hybrid.spark.raven.component.builtin.status.DefaultRavenStatusAssem$onViewCreated$$inlined$loadAbility$default$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                    InterfaceC494301wD interfaceC494301wD2 = interfaceC494301wD;
                    String str2 = str;
                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z2, ContainerEventDispatcher$RefreshActionCallBackAbility.class, str2);
                    if (interfaceC494301wDLIZ != null) {
                        try {
                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                            if (invocationHandler instanceof C2255008sW) {
                                C19719512Dh.LIZ(((C2255008sW) invocationHandler).LL).remove(interfaceC494301wD2);
                                return;
                            }
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (Intrinsics.LJFF(interfaceC494301wDLIZ, interfaceC494301wD2)) {
                                C1558520qew.LJIIJJI(interfaceC665370Q7z2, ContainerEventDispatcher$RefreshActionCallBackAbility.class, str2);
                            }
                        }
                    }
                }
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS83S1300000_18 awS83S1300000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadMorePhase: ");
        sbLIZ.append((EnumC1160730gJL) awS83S1300000_18.l1);
        sbLIZ.append(" → ");
        sbLIZ.append((EnumC1160730gJL) awS83S1300000_18.l2);
        sbLIZ.append(" (source=");
        sbLIZ.append(awS83S1300000_18.s0);
        sbLIZ.append(") ");
        sbLIZ.append(((RavenFragment) awS83S1300000_18.l3).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS83S1300000_18 awS83S1300000_18) {
        String initialPoiId;
        String initialEnterFrom;
        String initialEnterMethod;
        String str;
        String str2;
        String fromGroupId;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        C1185410gx9 c1185410gx9 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx9 != null) {
            initialPoiId = c1185410gx9.getInitialPoiId();
        } else {
            initialPoiId = null;
        }
        String str3 = "";
        if (initialPoiId == null) {
            initialPoiId = "";
        }
        C1185410gx9 c1185410gx92 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx92 == null || (initialEnterFrom = c1185410gx92.getInitialEnterFrom()) == null) {
            initialEnterFrom = "";
        }
        C1185410gx9 c1185410gx93 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx93 == null || (initialEnterMethod = c1185410gx93.getInitialEnterMethod()) == null) {
            initialEnterMethod = "";
        }
        C1184460gvc c1184460gvcOo = ((PoiDetailHeaderAssem) awS83S1300000_18.l2).Oo();
        if (c1184460gvcOo == null || (c1184480gve2 = c1184460gvcOo.LLILLL) == null || (str = c1184480gve2.LL) == null) {
            str = "";
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailHeaderAssem) awS83S1300000_18.l2).Oo();
        if (c1184460gvcOo2 == null || (c1184480gve = c1184460gvcOo2.LLILLL) == null || (str2 = c1184480gve.LLILLJJLI) == null) {
            str2 = "";
        }
        String str4 = awS83S1300000_18.s0;
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS83S1300000_18.l3).getCollectInfo();
        if (collectInfo == null) {
            collectInfo = "";
        }
        C1185410gx9 c1185410gx94 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx94 != null && (fromGroupId = c1185410gx94.getFromGroupId()) != null) {
            str3 = fromGroupId;
        }
        C1191160h6Q.LJIJJLI(c1191160h6Q, initialPoiId, initialEnterFrom, initialEnterMethod, str, str2, null, "poi_detail", "header_no_reviews", str4, collectInfo, null, null, null, null, str3, C1558520qew.LJIIL((PoiDetailHeaderAssem) awS83S1300000_18.l2), null, ((PoiDetailHeaderAssem) awS83S1300000_18.l2).Zo(), null, 343040);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS83S1300000_18 awS83S1300000_18) {
        String initialPoiId;
        String initialEnterFrom;
        String initialEnterMethod;
        String str;
        String str2;
        String fromGroupId;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        C1185410gx9 c1185410gx9 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx9 != null) {
            initialPoiId = c1185410gx9.getInitialPoiId();
        } else {
            initialPoiId = null;
        }
        String str3 = "";
        if (initialPoiId == null) {
            initialPoiId = "";
        }
        C1185410gx9 c1185410gx92 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx92 == null || (initialEnterFrom = c1185410gx92.getInitialEnterFrom()) == null) {
            initialEnterFrom = "";
        }
        C1185410gx9 c1185410gx93 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx93 == null || (initialEnterMethod = c1185410gx93.getInitialEnterMethod()) == null) {
            initialEnterMethod = "";
        }
        C1184460gvc c1184460gvcOo = ((PoiDetailHeaderAssem) awS83S1300000_18.l2).Oo();
        if (c1184460gvcOo == null || (c1184480gve2 = c1184460gvcOo.LLILLL) == null || (str = c1184480gve2.LL) == null) {
            str = "";
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailHeaderAssem) awS83S1300000_18.l2).Oo();
        if (c1184460gvcOo2 == null || (c1184480gve = c1184460gvcOo2.LLILLL) == null || (str2 = c1184480gve.LLILLJJLI) == null) {
            str2 = "";
        }
        String str4 = awS83S1300000_18.s0;
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS83S1300000_18.l3).getCollectInfo();
        if (collectInfo == null) {
            collectInfo = "";
        }
        C1185410gx9 c1185410gx94 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx94 != null && (fromGroupId = c1185410gx94.getFromGroupId()) != null) {
            str3 = fromGroupId;
        }
        C1191160h6Q.LJIJJLI(c1191160h6Q, initialPoiId, initialEnterFrom, initialEnterMethod, str, str2, null, "poi_detail", "header_no_reviews", str4, collectInfo, null, null, null, null, str3, C1558520qew.LJIIL((PoiDetailHeaderAssem) awS83S1300000_18.l2), null, ((PoiDetailHeaderAssem) awS83S1300000_18.l2).Zo(), null, 343040);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS83S1300000_18 awS83S1300000_18) {
        String initialPoiId;
        String initialEnterFrom;
        String initialEnterMethod;
        String str;
        String str2;
        String fromGroupId;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        C1185410gx9 c1185410gx9 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx9 != null) {
            initialPoiId = c1185410gx9.getInitialPoiId();
        } else {
            initialPoiId = null;
        }
        String str3 = "";
        if (initialPoiId == null) {
            initialPoiId = "";
        }
        C1185410gx9 c1185410gx92 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx92 == null || (initialEnterFrom = c1185410gx92.getInitialEnterFrom()) == null) {
            initialEnterFrom = "";
        }
        C1185410gx9 c1185410gx93 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx93 == null || (initialEnterMethod = c1185410gx93.getInitialEnterMethod()) == null) {
            initialEnterMethod = "";
        }
        C1184460gvc c1184460gvcOo = ((PoiDetailHotelHeaderAssem) awS83S1300000_18.l2).Oo();
        if (c1184460gvcOo == null || (c1184480gve2 = c1184460gvcOo.LLILLL) == null || (str = c1184480gve2.LL) == null) {
            str = "";
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailHotelHeaderAssem) awS83S1300000_18.l2).Oo();
        if (c1184460gvcOo2 == null || (c1184480gve = c1184460gvcOo2.LLILLL) == null || (str2 = c1184480gve.LLILLJJLI) == null) {
            str2 = "";
        }
        String str4 = awS83S1300000_18.s0;
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS83S1300000_18.l3).getCollectInfo();
        if (collectInfo == null) {
            collectInfo = "";
        }
        C1185410gx9 c1185410gx94 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx94 != null && (fromGroupId = c1185410gx94.getFromGroupId()) != null) {
            str3 = fromGroupId;
        }
        C1191160h6Q.LJIJJLI(c1191160h6Q, initialPoiId, initialEnterFrom, initialEnterMethod, str, str2, null, "poi_detail", "header_no_reviews", str4, collectInfo, null, null, null, null, str3, C1558520qew.LJIIL((PoiDetailHotelHeaderAssem) awS83S1300000_18.l2), null, ((PoiDetailHotelHeaderAssem) awS83S1300000_18.l2).Zo(), ((PoiDetailHotelHeaderAssem) awS83S1300000_18.l2).LLJL, 80896);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS83S1300000_18 awS83S1300000_18) {
        String initialPoiId;
        String initialEnterFrom;
        String initialEnterMethod;
        String str;
        String str2;
        String fromGroupId;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        C1185410gx9 c1185410gx9 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx9 != null) {
            initialPoiId = c1185410gx9.getInitialPoiId();
        } else {
            initialPoiId = null;
        }
        String str3 = "";
        if (initialPoiId == null) {
            initialPoiId = "";
        }
        C1185410gx9 c1185410gx92 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx92 == null || (initialEnterFrom = c1185410gx92.getInitialEnterFrom()) == null) {
            initialEnterFrom = "";
        }
        C1185410gx9 c1185410gx93 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx93 == null || (initialEnterMethod = c1185410gx93.getInitialEnterMethod()) == null) {
            initialEnterMethod = "";
        }
        C1184460gvc c1184460gvcOo = ((PoiDetailHotelHeaderAssem) awS83S1300000_18.l2).Oo();
        if (c1184460gvcOo == null || (c1184480gve2 = c1184460gvcOo.LLILLL) == null || (str = c1184480gve2.LL) == null) {
            str = "";
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailHotelHeaderAssem) awS83S1300000_18.l2).Oo();
        if (c1184460gvcOo2 == null || (c1184480gve = c1184460gvcOo2.LLILLL) == null || (str2 = c1184480gve.LLILLJJLI) == null) {
            str2 = "";
        }
        String str4 = awS83S1300000_18.s0;
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS83S1300000_18.l3).getCollectInfo();
        if (collectInfo == null) {
            collectInfo = "";
        }
        C1185410gx9 c1185410gx94 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx94 != null && (fromGroupId = c1185410gx94.getFromGroupId()) != null) {
            str3 = fromGroupId;
        }
        C1191160h6Q.LJIJJLI(c1191160h6Q, initialPoiId, initialEnterFrom, initialEnterMethod, str, str2, null, "poi_detail", "header_no_reviews", str4, collectInfo, null, null, null, null, str3, C1558520qew.LJIIL((PoiDetailHotelHeaderAssem) awS83S1300000_18.l2), null, ((PoiDetailHotelHeaderAssem) awS83S1300000_18.l2).Zo(), ((PoiDetailHotelHeaderAssem) awS83S1300000_18.l2).LLJL, 80896);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS83S1300000_18 awS83S1300000_18) {
        String initialPoiId;
        String initialEnterFrom;
        String initialEnterMethod;
        String str;
        String str2;
        String fromGroupId;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        C1185410gx9 c1185410gx9 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx9 != null) {
            initialPoiId = c1185410gx9.getInitialPoiId();
        } else {
            initialPoiId = null;
        }
        String str3 = "";
        if (initialPoiId == null) {
            initialPoiId = "";
        }
        C1185410gx9 c1185410gx92 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx92 == null || (initialEnterFrom = c1185410gx92.getInitialEnterFrom()) == null) {
            initialEnterFrom = "";
        }
        C1185410gx9 c1185410gx93 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx93 == null || (initialEnterMethod = c1185410gx93.getInitialEnterMethod()) == null) {
            initialEnterMethod = "";
        }
        C1184460gvc c1184460gvcOo = ((PoiDetailTravelHeaderAssemV2) awS83S1300000_18.l2).Oo();
        if (c1184460gvcOo == null || (c1184480gve2 = c1184460gvcOo.LLILLL) == null || (str = c1184480gve2.LL) == null) {
            str = "";
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailTravelHeaderAssemV2) awS83S1300000_18.l2).Oo();
        if (c1184460gvcOo2 == null || (c1184480gve = c1184460gvcOo2.LLILLL) == null || (str2 = c1184480gve.LLILLJJLI) == null) {
            str2 = "";
        }
        String str4 = awS83S1300000_18.s0;
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS83S1300000_18.l3).getCollectInfo();
        if (collectInfo == null) {
            collectInfo = "";
        }
        C1185410gx9 c1185410gx94 = (C1185410gx9) awS83S1300000_18.l1;
        if (c1185410gx94 != null && (fromGroupId = c1185410gx94.getFromGroupId()) != null) {
            str3 = fromGroupId;
        }
        C1191160h6Q.LJIJJLI(c1191160h6Q, initialPoiId, initialEnterFrom, initialEnterMethod, str, str2, null, "poi_detail", "header_no_reviews", str4, collectInfo, null, null, null, null, str3, C1558520qew.LJIIL((PoiDetailTravelHeaderAssemV2) awS83S1300000_18.l2), null, ((PoiDetailTravelHeaderAssemV2) awS83S1300000_18.l2).Zo(), ((PoiDetailTravelHeaderAssemV2) awS83S1300000_18.l2).LLJJJJLIIL, 80896);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS83S1300000_18 awS83S1300000_18) {
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS83S1300000_18.l1;
        PageFinder pageFinderS5 = ((PoiReviewsListItemCell) awS83S1300000_18.l2).S5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJJIFFI(pageFinderS5, interfaceC665370Q7z, "click_profile");
        C1367960lha.LIZ.getClass();
        C1367960lha.LIZ().LJJLIIIJLLLLLLLZ((Context) awS83S1300000_18.l3, awS83S1300000_18.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS83S1300000_18 awS83S1300000_18) {
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS83S1300000_18.l1;
        PageFinder pageFinderLJIIL = ((C1191760h7O) awS83S1300000_18.l2).LJIIL();
        c1191160h6Q.getClass();
        C1191160h6Q.LJJIFFI(pageFinderLJIIL, interfaceC665370Q7z, "click_profile");
        C1367960lha.LIZ.getClass();
        C1367960lha.LIZ().LJJLIIIJLLLLLLLZ((Context) awS83S1300000_18.l3, awS83S1300000_18.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S1300000_18(InterfaceC665370Q7z interfaceC665370Q7z, C1191760h7O c1191760h7O, Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC665370Q7z;
        this.l2 = c1191760h7O;
        this.l3 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S1300000_18(InterfaceC665370Q7z interfaceC665370Q7z, PoiReviewsListItemCell poiReviewsListItemCell, Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC665370Q7z;
        this.l2 = poiReviewsListItemCell;
        this.l3 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS83S1300000_18(EnumC1160730gJL enumC1160730gJL, EnumC1160730gJL enumC1160730gJL2, EnumC1160730gJL enumC1160730gJL3, String str, RavenFragment<CONTEXT> ravenFragment) {
        super(0);
        this.$t = ravenFragment;
        this.l1 = enumC1160730gJL;
        this.l2 = enumC1160730gJL2;
        this.s0 = enumC1160730gJL3;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S1300000_18(C1185410gx9 c1185410gx9, PoiDetailHeaderAssem poiDetailHeaderAssem, String str, PoiListApi.PoiDetailResponse poiDetailResponse, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1185410gx9;
        this.l2 = poiDetailHeaderAssem;
        this.s0 = str;
        this.l3 = poiDetailResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S1300000_18(C1185410gx9 c1185410gx9, PoiDetailHotelHeaderAssem poiDetailHotelHeaderAssem, String str, PoiListApi.PoiDetailResponse poiDetailResponse, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1185410gx9;
        this.l2 = poiDetailHotelHeaderAssem;
        this.s0 = str;
        this.l3 = poiDetailResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S1300000_18(C1185410gx9 c1185410gx9, PoiDetailTravelHeaderAssemV2 poiDetailTravelHeaderAssemV2, String str, PoiListApi.PoiDetailResponse poiDetailResponse, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1185410gx9;
        this.l2 = poiDetailTravelHeaderAssemV2;
        this.s0 = str;
        this.l3 = poiDetailResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S1300000_18(LifecycleOwner lifecycleOwner, InterfaceC665370Q7z interfaceC665370Q7z, InterfaceC494301wD interfaceC494301wD, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = lifecycleOwner;
        this.l2 = interfaceC665370Q7z;
        this.l3 = interfaceC494301wD;
        this.s0 = str;
    }
}
