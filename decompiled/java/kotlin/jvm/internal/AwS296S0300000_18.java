package kotlin.jvm.internal;

import X.C09AY;
import X.C1166800gT8;
import X.C1174850gg7;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1184710gw1;
import X.C1184720gw2;
import X.C1185430gxB;
import X.C1187080gzq;
import X.C1188060h1Q;
import X.C1189060h32;
import X.C1189680h42;
import X.C1191160h6Q;
import X.C1191440h6s;
import X.C13LP;
import X.C15438062q;
import X.C1558360qeg;
import X.C1697810uHb;
import X.C1749280vcc;
import X.C197039127h;
import X.C19HL;
import X.C2097608Jq;
import X.C786410Ut5;
import X.InterfaceC1181010gq3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerAssem;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import com.ss.android.ugc.aweme.poi.albummix.assem.PoiAlbumMixPageFooterAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiCommonCardCell;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiHotelCardCell;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.ChartInfo;
import com.ss.android.ugc.aweme.poi.detail.videolist.IPoiVideoListAbility;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiMergedListItemBannerCell;
import com.ss.android.ugc.aweme.poi.osp.component.PoiOrderSubmitSkuListAssem;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuData;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashTrackConfig;
import com.ss.android.ugc.aweme.slash.data.AnchorComponentInfo;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public class AwS296S0300000_18 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS296S0300000_18 awS296S0300000_18, Object obj, Object obj2) {
        List list = (List) obj2;
        if (list != null) {
            MixFeedManagerAssem mixFeedManagerAssem = (MixFeedManagerAssem) awS296S0300000_18.l0;
            C1749280vcc c1749280vcc = (C1749280vcc) awS296S0300000_18.l1;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) awS296S0300000_18.l2;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i = 0;
            for (Object obj3 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(new C1166800gT8((Aweme) obj3, Integer.valueOf(i2)));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            List listLLIIII = C13LP.LLIIII(arrayList);
            if (list.isEmpty()) {
                mixFeedManagerAssem.Lo(c1749280vcc);
            } else {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
            }
            viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(listLLIIII, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS296S0300000_18 awS296S0300000_18, Object obj, Object obj2) {
        String str;
        C1184480gve c1184480gve;
        C1184720gw2 c1184720gw2 = C1184720gw2.LIZ;
        String str2 = ((PoiDetailFoodHeaderAssem) awS296S0300000_18.l0).cp().LL;
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS296S0300000_18.l1).getCollectInfo();
        C1184460gvc c1184460gvcOo = ((PoiDetailFoodHeaderAssem) awS296S0300000_18.l0).Oo();
        if (c1184460gvcOo != null && (c1184480gve = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve.LLIZLLLIL;
        } else {
            str = null;
        }
        String str3 = ((ChartInfo) awS296S0300000_18.l2).chartTopicName;
        C1184710gw1 c1184710gw1 = ((PoiDetailFoodHeaderAssem) awS296S0300000_18.l0).LLJJLIIIJLLLLLLLZ;
        c1184720gw2.getClass();
        C1184720gw2.LIZIZ(str2, collectInfo, str, str3, c1184710gw1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS296S0300000_18 awS296S0300000_18, Object obj, Object obj2) {
        String str;
        C1184480gve c1184480gve;
        C1184720gw2 c1184720gw2 = C1184720gw2.LIZ;
        String str2 = ((PoiDetailHeaderAssem) awS296S0300000_18.l0).cp().LL;
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS296S0300000_18.l1).getCollectInfo();
        C1184460gvc c1184460gvcOo = ((PoiDetailHeaderAssem) awS296S0300000_18.l0).Oo();
        if (c1184460gvcOo != null && (c1184480gve = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve.LLIZLLLIL;
        } else {
            str = null;
        }
        String str3 = ((ChartInfo) awS296S0300000_18.l2).chartTopicName;
        c1184720gw2.getClass();
        C1184720gw2.LIZIZ(str2, collectInfo, str, str3, null);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS296S0300000_18 awS296S0300000_18, Object obj, Object obj2) {
        String str;
        C1184480gve c1184480gve;
        C1184720gw2 c1184720gw2 = C1184720gw2.LIZ;
        String str2 = ((PoiDetailTravelHeaderAssemV2) awS296S0300000_18.l0).cp().LL;
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS296S0300000_18.l1).getCollectInfo();
        C1184460gvc c1184460gvcOo = ((PoiDetailTravelHeaderAssemV2) awS296S0300000_18.l0).Oo();
        if (c1184460gvcOo != null && (c1184480gve = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve.LLIZLLLIL;
        } else {
            str = null;
        }
        String str3 = ((ChartInfo) awS296S0300000_18.l2).chartTopicName;
        C1184710gw1 c1184710gw1 = ((PoiDetailTravelHeaderAssemV2) awS296S0300000_18.l0).LLJJJJLIIL;
        c1184720gw2.getClass();
        C1184720gw2.LIZIZ(str2, collectInfo, str, str3, c1184710gw1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS296S0300000_18 awS296S0300000_18, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        Integer num = ((SkuData) awS296S0300000_18.l0).num;
        if (num == null || num.intValue() != iIntValue) {
            PoiOrderSubmitSkuListAssem poiOrderSubmitSkuListAssem = (PoiOrderSubmitSkuListAssem) awS296S0300000_18.l1;
            poiOrderSubmitSkuListAssem.getClass();
            InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(poiOrderSubmitSkuListAssem);
            if (interfaceC1181010gq3LIZ != null) {
                interfaceC1181010gq3LIZ.OB1(new AwS30S1201000_18((C1187080gzq) awS296S0300000_18.l2, (PoiOrderSubmitSkuListAssem) awS296S0300000_18.l1, str, iIntValue, 1));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS296S0300000_18 awS296S0300000_18, Object obj, Object obj2) {
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ((C19HL) awS296S0300000_18.l0, null);
        String str = ((C1191440h6s) awS296S0300000_18.l1).LLILZIL;
        PageFinder pageFinder = (PageFinder) awS296S0300000_18.l2;
        c1191160h6Q.getClass();
        C1191160h6Q.LJJIJLIJ(pageFinder, interfaceC665370Q7zLJ, str, null, "reviews_preview_page");
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS296S0300000_18 awS296S0300000_18, Object obj, Object obj2) {
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str = ((PoiAlbumMixPageFooterAssem) awS296S0300000_18.l0).hp().poiId;
        String str2 = ((AnchorComponentInfo) awS296S0300000_18.l1).iconType;
        String str3 = ((PoiAlbumMixPageFooterAssem) awS296S0300000_18.l0).hp().collectInfo;
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ((C197039127h) awS296S0300000_18.l2, null);
        PageFinder pageFinder = (PageFinder) ((PoiAlbumMixPageFooterAssem) awS296S0300000_18.l0).LLJJJIL.getValue();
        c1185430gxB.getClass();
        C1185430gxB.LJJLIIIJJI("album_page", str, str2, str3, interfaceC665370Q7zLJ, pageFinder);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS296S0300000_18 awS296S0300000_18, Object obj, Object obj2) {
        String str;
        PoiCommonCardCell poiCommonCardCell = (PoiCommonCardCell) awS296S0300000_18.l0;
        String str2 = ((SlashTrackConfig) awS296S0300000_18.l1).eventName;
        Pair[] pairArr = new Pair[2];
        String strHp = poiCommonCardCell.hp();
        String str3 = "";
        if (strHp == null) {
            strHp = "";
        }
        pairArr[0] = new Pair("ttls_poi_component", strHp);
        PoiCardCellData poiCardCellData = (PoiCardCellData) awS296S0300000_18.l2;
        if (poiCardCellData != null && (str = poiCardCellData.keyCategory) != null) {
            str3 = str;
        }
        pairArr[1] = new Pair("target_local_service_key_category", str3);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        Map<String, String> map = ((SlashTrackConfig) awS296S0300000_18.l1).params;
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        poiCommonCardCell.up(new SlashTrackConfig(str2, mapLJIIJ, null));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS296S0300000_18 awS296S0300000_18, Object obj, Object obj2) {
        String str;
        PoiHotelCardCell poiHotelCardCell = (PoiHotelCardCell) awS296S0300000_18.l0;
        String str2 = ((SlashTrackConfig) awS296S0300000_18.l1).eventName;
        Pair[] pairArr = new Pair[2];
        String strHp = poiHotelCardCell.hp();
        String str3 = "";
        if (strHp == null) {
            strHp = "";
        }
        pairArr[0] = new Pair("ttls_poi_component", strHp);
        PoiCardCellData poiCardCellData = (PoiCardCellData) awS296S0300000_18.l2;
        if (poiCardCellData != null && (str = poiCardCellData.keyCategory) != null) {
            str3 = str;
        }
        pairArr[1] = new Pair("target_local_service_key_category", str3);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        Map<String, String> map = ((SlashTrackConfig) awS296S0300000_18.l1).params;
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        poiHotelCardCell.up(new SlashTrackConfig(str2, mapLJIIJ, null));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS296S0300000_18 awS296S0300000_18, Object obj, Object obj2) {
        String collectInfo;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        IPoiVideoListAbility iPoiVideoListAbilityI5 = ((PoiMergedListItemBannerCell) awS296S0300000_18.l0).I5();
        String str = "";
        if (iPoiVideoListAbilityI5 != null) {
            String str2 = ((PoiActivityApi.PoiBannerInfo) awS296S0300000_18.l1).activityId;
            if (str2 == null) {
                str2 = "";
            }
            iPoiVideoListAbilityI5.re2(str2);
        }
        C1189680h42 c1189680h42 = C1189680h42.LIZ;
        String str3 = ((PoiActivityApi.PoiBannerInfo) awS296S0300000_18.l1).activityId;
        if (str3 != null) {
            str = str3;
        }
        String str4 = ((C1188060h1Q) awS296S0300000_18.l2).LLILLJJLI;
        AssemVMLazy assemVMLazy = ((PoiMergedListItemBannerCell) awS296S0300000_18.l0).LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiMergedListItemBannerCell.LLILZLL;
        int iBW = 0;
        PoiListApi.PoiDetailResponse poiDetailResponse = ((PoiDetailInfoViewModel) assemVMLazy.getValue()).LLILLJJLI;
        if (poiDetailResponse != null) {
            collectInfo = poiDetailResponse.getCollectInfo();
        } else {
            collectInfo = null;
        }
        PoiMergedListItemBannerCell poiMergedListItemBannerCell = (PoiMergedListItemBannerCell) awS296S0300000_18.l0;
        int bindingAdapterPosition = poiMergedListItemBannerCell.getBindingAdapterPosition();
        IPoiVideoListAbility iPoiVideoListAbilityI52 = poiMergedListItemBannerCell.I5();
        if (iPoiVideoListAbilityI52 != null) {
            iBW = iPoiVideoListAbilityI52.bW();
        }
        Integer numValueOf = Integer.valueOf((bindingAdapterPosition - iBW) + 1);
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiMergedListItemBannerCell) awS296S0300000_18.l0);
        if (fragmentLJIIJ != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
        } else {
            interfaceC665370Q7zLJFF = null;
        }
        C1189680h42.LIZ(c1189680h42, true, "poi_detail", str, 1, str4, collectInfo, numValueOf, interfaceC665370Q7zLJFF, null, PageFinder.via(C1189060h32.LJIIJ((PoiMergedListItemBannerCell) awS296S0300000_18.l0)), 256);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS296S0300000_18(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, C1749280vcc c1749280vcc, MixFeedManagerAssem mixFeedManagerAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = mixFeedManagerAssem;
        this.l1 = c1749280vcc;
        this.l2 = viewOnAttachStateChangeListenerC20604515jv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS296S0300000_18(C19HL c19hl, C1191440h6s c1191440h6s, PageFinder pageFinder, int i) {
        super(2);
        this.$t = i;
        this.l0 = c19hl;
        this.l1 = c1191440h6s;
        this.l2 = pageFinder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS296S0300000_18(PoiAlbumMixPageFooterAssem poiAlbumMixPageFooterAssem, AnchorComponentInfo anchorComponentInfo, C197039127h c197039127h, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiAlbumMixPageFooterAssem;
        this.l1 = anchorComponentInfo;
        this.l2 = c197039127h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS296S0300000_18(PoiDetailHeaderAssem poiDetailHeaderAssem, PoiListApi.PoiDetailResponse poiDetailResponse, ChartInfo chartInfo, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiDetailHeaderAssem;
        this.l1 = poiDetailResponse;
        this.l2 = chartInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS296S0300000_18(PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem, PoiListApi.PoiDetailResponse poiDetailResponse, ChartInfo chartInfo, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiDetailFoodHeaderAssem;
        this.l1 = poiDetailResponse;
        this.l2 = chartInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS296S0300000_18(PoiDetailTravelHeaderAssemV2 poiDetailTravelHeaderAssemV2, PoiListApi.PoiDetailResponse poiDetailResponse, ChartInfo chartInfo, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiDetailTravelHeaderAssemV2;
        this.l1 = poiDetailResponse;
        this.l2 = chartInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS296S0300000_18(PoiCommonCardCell poiCommonCardCell, SlashTrackConfig slashTrackConfig, PoiCardCellData poiCardCellData, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiCommonCardCell;
        this.l1 = slashTrackConfig;
        this.l2 = poiCardCellData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS296S0300000_18(PoiHotelCardCell poiHotelCardCell, SlashTrackConfig slashTrackConfig, PoiCardCellData poiCardCellData, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiHotelCardCell;
        this.l1 = slashTrackConfig;
        this.l2 = poiCardCellData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS296S0300000_18(PoiMergedListItemBannerCell poiMergedListItemBannerCell, PoiActivityApi.PoiBannerInfo poiBannerInfo, C1188060h1Q c1188060h1Q, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiMergedListItemBannerCell;
        this.l1 = poiBannerInfo;
        this.l2 = c1188060h1Q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS296S0300000_18(SkuData skuData, PoiOrderSubmitSkuListAssem poiOrderSubmitSkuListAssem, C1187080gzq c1187080gzq, int i) {
        super(2);
        this.$t = i;
        this.l0 = skuData;
        this.l1 = poiOrderSubmitSkuListAssem;
        this.l2 = c1187080gzq;
    }
}
