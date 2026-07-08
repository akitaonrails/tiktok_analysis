package kotlin.jvm.internal;

import X.C09AY;
import X.C0PSG;
import X.C0QER;
import X.C0QW3;
import X.C0QXE;
import X.C0QXR;
import X.C1388190mED;
import X.C15O7;
import X.C658950Psz;
import X.C658960Pt0;
import X.C661470Px3;
import X.C661490Px5;
import X.C661850Pxf;
import X.C661880Pxi;
import X.C674800QdS;
import X.C674810QdT;
import X.C674830QdV;
import X.C674850QdX;
import X.C676050QfT;
import X.EnumC676230Qfl;
import X.InterfaceC648270Pbl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS15S1100000_10;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomApiLifecycleManager;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchMixApi;
import com.ss.android.ugc.aweme.ecommerce.search.result.ui.HalfDynamicSearchShopFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchForceInterveneCard;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AwS159S1100000_10 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS159S1100000_10 awS159S1100000_10) {
        SmartRouter.buildRoute(C1388190mED.LIZ(((View) awS159S1100000_10.l1).getContext()), awS159S1100000_10.s0).open();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS159S1100000_10 awS159S1100000_10) {
        SearchResultParam searchResultParam;
        C0QER searchEnterParam;
        C0QXE c0qxe = ((HalfDynamicSearchShopFragment) awS159S1100000_10.l1).LLIZ;
        if (c0qxe != null && (searchResultParam = c0qxe.searchResultParam) != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null && searchEnterParam.getEcSearchEntranceValue() == C0QXR.FEED_MALL_SEARCH_JUMP_SEARCH_RESULT.getValue()) {
            C0QW3.LIZ(awS159S1100000_10.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS159S1100000_10 awS159S1100000_10) {
        int i;
        int filterBy;
        int sortType;
        LinkedHashMap<String, Integer> linkedHashMap;
        EcomApiLifecycleManager ecomApiLifecycleManager = EcomApiLifecycleManager.LIZ;
        String str = ((C674800QdS) awS159S1100000_10.l1).keyword;
        ecomApiLifecycleManager.getClass();
        EcomApiLifecycleManager.LJIILJJIL(str);
        C674830QdV c674830QdV = new C674830QdV();
        C674800QdS c674800QdS = (C674800QdS) awS159S1100000_10.l1;
        String str2 = c674800QdS.chunkSizeList;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = EcSearchApi.LIZIZ;
        String str4 = c674800QdS.searchChannel;
        if (str4 == null) {
            str4 = "tiktok_ecom";
        }
        long j = c674800QdS.cursor;
        String str5 = c674800QdS.keyword;
        String str6 = c674800QdS.enterFrom;
        int i2 = c674800QdS.count;
        int i3 = c674800QdS.hotSearch;
        String str7 = c674800QdS.searchId;
        String str8 = c674800QdS.lastSearchId;
        String str9 = c674800QdS.source;
        String str10 = c674800QdS.searchSource;
        int i4 = c674800QdS.correctType;
        C0PSG c0psg = c674800QdS.filterOption;
        if (c0psg != null && !c0psg.isDefaultOption()) {
            i = 1;
        } else {
            i = 0;
        }
        C0PSG c0psg2 = ((C674800QdS) awS159S1100000_10.l1).filterOption;
        if (c0psg2 != null) {
            filterBy = c0psg2.getFilterBy();
        } else {
            filterBy = 0;
        }
        C0PSG c0psg3 = ((C674800QdS) awS159S1100000_10.l1).filterOption;
        if (c0psg3 != null) {
            sortType = c0psg3.getSortType();
        } else {
            sortType = 0;
        }
        C0PSG c0psg4 = ((C674800QdS) awS159S1100000_10.l1).filterOption;
        if (c0psg4 == null || (linkedHashMap = c0psg4.activityToFieldMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        C674800QdS c674800QdS2 = (C674800QdS) awS159S1100000_10.l1;
        String str11 = c674800QdS2.searchContext;
        String str12 = c674800QdS2.sugTagText;
        String str13 = c674800QdS2.sugType;
        String str14 = c674800QdS2.sugQueryState;
        String str15 = c674800QdS2.sugCreatorId;
        String str16 = c674800QdS2.attachProducts;
        String str17 = c674800QdS2.mockAttachProducts;
        String str18 = c674800QdS2.trafficSourceList;
        String str19 = c674800QdS2.cmplEnc;
        String str20 = c674800QdS2.originIsMallTab;
        String str21 = c674800QdS2.ecSearchSessionId;
        String str22 = c674800QdS2.sugShopId;
        String str23 = c674800QdS2.userRtActs;
        String str24 = c674800QdS2.apiVersion;
        String str25 = c674800QdS2.searchSessionId;
        String str26 = c674800QdS2.userActions;
        String str27 = c674800QdS2.lastSearchPidList;
        String str28 = c674800QdS2.passThroughParams;
        Map<String, String> map = c674800QdS2.searchExtraRequestParams;
        Long l = c674800QdS2.endToEndSearchSessionId;
        String str29 = c674800QdS2.filtersData;
        Integer numIsLowDevice = c674800QdS2.isLowDevice();
        Integer numIsWeakNetwork = ((C674800QdS) awS159S1100000_10.l1).isWeakNetwork();
        C674800QdS c674800QdS3 = (C674800QdS) awS159S1100000_10.l1;
        Integer num = c674800QdS3.useNewFilterArch;
        String str30 = c674800QdS3.newUserExtraInfo;
        Integer numIsNonPersonalizedSearch = c674800QdS3.isNonPersonalizedSearch();
        C674800QdS c674800QdS4 = (C674800QdS) awS159S1100000_10.l1;
        Integer num2 = c674800QdS4.dmaConsentStatus;
        Integer num3 = c674800QdS4.edmConsentStatus;
        String str31 = c674800QdS4.nineSearchProductId;
        Integer num4 = c674800QdS4.searchKeywordStrategy;
        String str32 = c674800QdS4.enterFromSecond;
        String str33 = c674800QdS4.searchPromotionParams;
        String str34 = c674800QdS4.trafficDiversionInfo;
        String str35 = c674800QdS4.bcmChain;
        Map<String, String> map2 = c674800QdS4.apiParamsInCurrentSearch;
        int value = EnumC676230Qfl.USER_INTERACTION_TYPE_FIRST_REQUEST.getValue();
        C674800QdS c674800QdS5 = (C674800QdS) awS159S1100000_10.l1;
        C15O7 c15o7LIZIZ = C674830QdV.LIZIZ(c674830QdV, c674800QdS5, str2, str3, str4, j, str5, str6, i2, i3, str7, str8, str9, str10, i4, i, filterBy, sortType, linkedHashMap, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, map, null, l, str29, numIsLowDevice, numIsWeakNetwork, num, numIsNonPersonalizedSearch, num2, num3, str30, str31, num4, str32, str33, str34, str35, map2, value, c674800QdS5.rootEnterFromType, c674800QdS5.clientRequestId, c674800QdS5.noNeedPageStyle, awS159S1100000_10.s0, 32);
        if (c15o7LIZIZ != null) {
            C674810QdT.LJ(awS159S1100000_10.s0, (C674800QdS) awS159S1100000_10.l1);
        }
        return c15o7LIZIZ;
    }

    public static final Object invoke$3(AwS159S1100000_10 awS159S1100000_10) {
        TypedByteArray typedByteArray;
        String str;
        String str2;
        String str3;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        C674830QdV c674830QdV = new C674830QdV();
        String str4 = EcSearchMixApi.LIZ;
        C674850QdX c674850QdX = (C674850QdX) awS159S1100000_10.l1;
        String str5 = c674850QdX.apiVersion;
        C676050QfT c676050QfT = c674850QdX.photoSearch;
        String strLJLIL = null;
        if (c676050QfT != null) {
            typedByteArray = c676050QfT.image;
            str = c676050QfT.imageTosUri;
            str2 = c676050QfT.detection;
            str3 = c676050QfT.detectionIdx;
        } else {
            typedByteArray = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        String str6 = c674850QdX.searchChannel;
        if (str6 == null) {
            str6 = "tiktok_mall_photo_search";
        }
        String str7 = c674850QdX.keyword;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = c674850QdX.enterFrom;
        Integer num = c674850QdX.count;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 8;
        }
        Integer num2 = ((C674850QdX) awS159S1100000_10.l1).hotSearch;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        C674850QdX c674850QdX2 = (C674850QdX) awS159S1100000_10.l1;
        String str9 = c674850QdX2.searchId;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = c674850QdX2.lastSearchId;
        String str11 = c674850QdX2.source;
        if (str11 == null) {
            str11 = "";
        }
        String str12 = c674850QdX2.searchSource;
        if (str12 == null) {
            str12 = "";
        }
        Integer num3 = c674850QdX2.correctType;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 0;
        }
        C674850QdX c674850QdX3 = (C674850QdX) awS159S1100000_10.l1;
        String str13 = c674850QdX3.searchContext;
        String str14 = c674850QdX3.attachProducts;
        String str15 = c674850QdX3.trafficSourceList;
        String str16 = c674850QdX3.ecSearchSessionId;
        String str17 = c674850QdX3.searchSessionId;
        String str18 = c674850QdX3.productDetailUri;
        Integer num4 = c674850QdX3.recallShield;
        String str19 = c674850QdX3.photoSearchExtra;
        List<PhotoSearchForceInterveneCard> list = c674850QdX3.forceInterveneCard;
        Long l = c674850QdX3.endToEndSearchSessionId;
        IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
        if (iEcomSearchService != null) {
            strLJLIL = iEcomSearchService.LJLIL(null, "");
        }
        C674850QdX c674850QdX4 = (C674850QdX) awS159S1100000_10.l1;
        String str20 = c674850QdX4.userRtActs;
        String str21 = c674850QdX4.passThroughParams;
        String str22 = c674850QdX4.photoProductInfo;
        int value = EnumC676230Qfl.USER_INTERACTION_TYPE_FIRST_REQUEST.getValue();
        C674850QdX c674850QdX5 = (C674850QdX) awS159S1100000_10.l1;
        return C674830QdV.LIZ(c674830QdV, str4, str6, 0L, str7, str8, iIntValue, iIntValue2, str9, str10, str11, str12, iIntValue3, str13, str14, str15, str16, str20, str5, str17, str21, c674850QdX5.enterFromSecond, strLJLIL, value, c674850QdX5.rootEnterFromType, typedByteArray, str, str2, str3, str22, c674850QdX5.ecPageFeatureParams, list, 0L, str18, num4, str19, l, null, null, awS159S1100000_10.s0, null, 48);
    }

    public static final Object invoke$4(AwS159S1100000_10 awS159S1100000_10) {
        SkylightListViewModel skylightListViewModel = (SkylightListViewModel) awS159S1100000_10.l1;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = skylightListViewModel.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS15S1100000_10(skylightListViewModel, awS159S1100000_10.s0, 5));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS159S1100000_10 awS159S1100000_10) {
        SkylightListViewModel skylightListViewModel = (SkylightListViewModel) awS159S1100000_10.l1;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = skylightListViewModel.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS15S1100000_10(skylightListViewModel, awS159S1100000_10.s0, 6));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS159S1100000_10 awS159S1100000_10) {
        C661850Pxf c661850Pxf;
        Aweme aweme;
        String str = awS159S1100000_10.s0;
        C661490Px5 c661490Px5 = ((C658950Psz) awS159S1100000_10.l1).LLILLJJLI;
        String aid = null;
        if (c661490Px5 != null && (aweme = c661490Px5.LIZJ) != null) {
            aid = aweme.getAid();
        }
        if (Intrinsics.LJFF(str, aid) && C658950Psz.LIZIZ((C658950Psz) awS159S1100000_10.l1)) {
            InterfaceC648270Pbl interfaceC648270Pbl = ((C658950Psz) awS159S1100000_10.l1).LL;
            if ((interfaceC648270Pbl instanceof C661850Pxf) && (c661850Pxf = (C661850Pxf) interfaceC648270Pbl) != null) {
                C661880Pxi.LIZ(c661850Pxf);
            } else if (interfaceC648270Pbl != null) {
                interfaceC648270Pbl.LLLLLIL();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS159S1100000_10 awS159S1100000_10) {
        String aid;
        C661470Px3 c661470Px3;
        Aweme aweme;
        String str = awS159S1100000_10.s0;
        C661490Px5 c661490Px5 = ((C658960Pt0) awS159S1100000_10.l1).LLILLJJLI;
        if (c661490Px5 != null && (aweme = c661490Px5.LIZJ) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(str, aid) && ((C658960Pt0) awS159S1100000_10.l1).LIZIZ() && (c661470Px3 = ((C658960Pt0) awS159S1100000_10.l1).LLILZ) != null) {
            c661470Px3.LJIIJJI();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S1100000_10(C674800QdS c674800QdS, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c674800QdS;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S1100000_10(View view, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = view;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S1100000_10(HalfDynamicSearchShopFragment halfDynamicSearchShopFragment, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = halfDynamicSearchShopFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S1100000_10(SkylightListViewModel skylightListViewModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = skylightListViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S1100000_10(String str, C658950Psz c658950Psz, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c658950Psz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S1100000_10(String str, C658960Pt0 c658960Pt0, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c658960Pt0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S1100000_10(String str, C674850QdX c674850QdX, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c674850QdX;
    }
}
