package kotlin.jvm.internal;

import X.C062P;
import X.C09AY;
import X.C0SZ4;
import X.C1163880gOQ;
import X.C1167930gUx;
import X.C1167940gUy;
import X.C1169160gWw;
import X.C1180490gpD;
import X.C1180890gpr;
import X.C1184460gvc;
import X.C1184530gvj;
import X.C1185040gwY;
import X.C1185410gx9;
import X.C1185610gxT;
import X.C1185620gxU;
import X.C1187830h13;
import X.C1188530h2B;
import X.C1189060h32;
import X.C1193740hAa;
import X.C1196140hES;
import X.C1199800hKM;
import X.C13IQ;
import X.C1623606Xi;
import X.C166V;
import X.C1697810uHb;
import X.C2097608Jq;
import X.InterfaceC2217461Bqa;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.manageplaylist.ManagePlaylistViewModel;
import com.ss.android.ugc.aweme.mix.model.MixStatisStruct;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsData;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.PoiCampaignMainFragment;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.PoiDetailInfoAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.lynx.PoiDetailLynxAssem;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailWriteReviewViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS102S1200000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        C062P c062p = (C062P) obj;
        boolean z = false;
        c062p.LIZ = new C1184530gvj(awS102S1200000_18.s0, C1189060h32.LJIIZILJ(((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).isCollected()), 3, ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getName(), ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getAddress(), z, (C1188530h2B) awS102S1200000_18.l2, (C1185410gx9) null, ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getDataFromAnchor(), z, 1440);
        c062p.LIZIZ = "PoiCollectHierarchyData";
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        C062P c062p = (C062P) obj;
        boolean z = false;
        c062p.LIZ = new C1184530gvj(awS102S1200000_18.s0, C1189060h32.LJIIZILJ(((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).isCollected()), 3, ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getName(), ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getAddress(), z, (C1188530h2B) awS102S1200000_18.l2, (C1185410gx9) null, ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getDataFromAnchor(), z, 1440);
        c062p.LIZIZ = "PoiCollectHierarchyData";
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        Integer num;
        C062P c062p = (C062P) obj;
        String str = (String) ((PoiCampaignMainFragment) awS102S1200000_18.l1).LLJ.getValue();
        PoiCampaignMainFragment poiCampaignMainFragment = (PoiCampaignMainFragment) awS102S1200000_18.l1;
        String str2 = poiCampaignMainFragment.LLJILLL;
        String str3 = (String) poiCampaignMainFragment.LLJIJIL.getValue();
        int iIntValue = ((Number) ((PoiCampaignMainFragment) awS102S1200000_18.l1).LLJILJIL.getValue()).intValue();
        MyMomentsData myMomentsData = (MyMomentsData) awS102S1200000_18.l2;
        if (myMomentsData != null) {
            num = myMomentsData.userType;
        } else {
            num = null;
        }
        c062p.LIZ = new C1180490gpD(new C1180890gpr(iIntValue, str, str2, str3, num, (String) ((PoiCampaignMainFragment) awS102S1200000_18.l1).LLJI.getValue()), (MyMomentsData) awS102S1200000_18.l2, awS102S1200000_18.s0);
        c062p.LIZIZ = "PoiCampaignHierarchyData";
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBEp = ((PoiDetailLynxAssem) awS102S1200000_18.l1).Ep(awS102S1200000_18.s0, (PoiDetailApi.PoiDetailLynxResponse) awS102S1200000_18.l2);
        PoiDetailLynxAssem poiDetailLynxAssem = (PoiDetailLynxAssem) awS102S1200000_18.l1;
        C166V c166v = poiDetailLynxAssem.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiDetailLynxAssem.LLLFFI;
        ((C1187830h13) c166v.LIZ(poiDetailLynxAssem)).LLILLJJLI.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBEp, new ViewGroup.LayoutParams(-1, -1));
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("retry_time", String.valueOf(iIntValue)));
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("poi_lynx_present", mapLJIIJ, null);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        ((PoiDetailWriteReviewViewModel) awS102S1200000_18.l1).setState(new AwS132S1100000_18((PoiReviewsApi.PoiWriteReviewResponse) awS102S1200000_18.l2, awS102S1200000_18.s0, 15));
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        Integer num = (Integer) awS102S1200000_18.l1;
        if (num != null) {
            c1196140hES.LJI(num.intValue(), "drawEndTs");
        }
        Integer num2 = (Integer) awS102S1200000_18.l2;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            c1196140hES.getClass();
            c1196140hES.LIZLLL = new Pair<>("decodeEndTs", Integer.valueOf(iIntValue));
        }
        String str = awS102S1200000_18.s0;
        if (str != null) {
            c1196140hES.getClass();
            c1196140hES.LJIIIIZZ = new Pair<>("load which page state", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = new C1184460gvc(awS102S1200000_18.s0, (PoiListApi.PoiDetailResponse) awS102S1200000_18.l1, C1185620gxU.LIZ((C1185610gxT) ((PoiDetailInfoAssem) awS102S1200000_18.l2).mp()), 24);
        c062p.LIZIZ = "PoiDetailContentHeaderHierarchyDataV3";
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        PoiDetailInfoAssem poiDetailInfoAssem = (PoiDetailInfoAssem) awS102S1200000_18.l1;
        assembler.EQ2(poiDetailInfoAssem, new AwS102S1200000_18(poiDetailInfoAssem, (PoiListApi.PoiDetailResponse) awS102S1200000_18.l2, awS102S1200000_18.s0, 14));
        PoiDetailInfoAssem poiDetailInfoAssem2 = (PoiDetailInfoAssem) awS102S1200000_18.l1;
        assembler.QQ2(poiDetailInfoAssem2, new AwS597S0100000_18(poiDetailInfoAssem2, 1045));
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = new C1184460gvc(awS102S1200000_18.s0, (PoiListApi.PoiDetailResponse) awS102S1200000_18.l1, C1185620gxU.LIZ((C1185610gxT) ((PoiDetailInfoAssem) awS102S1200000_18.l2).mp()), 24);
        c062p.LIZIZ = "PoiDetailContentHeaderHierarchyDataV3";
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        PoiDetailInfoAssem poiDetailInfoAssem = (PoiDetailInfoAssem) awS102S1200000_18.l1;
        assembler.EQ2(poiDetailInfoAssem, new AwS102S1200000_18(poiDetailInfoAssem, (PoiListApi.PoiDetailResponse) awS102S1200000_18.l2, awS102S1200000_18.s0, 16));
        PoiDetailInfoAssem poiDetailInfoAssem2 = (PoiDetailInfoAssem) awS102S1200000_18.l1;
        assembler.QQ2(poiDetailInfoAssem2, new AwS597S0100000_18(poiDetailInfoAssem2, 1046));
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = new C1184460gvc(awS102S1200000_18.s0, (PoiListApi.PoiDetailResponse) awS102S1200000_18.l1, C1185620gxU.LIZ((C1185610gxT) ((PoiDetailInfoAssem) awS102S1200000_18.l2).mp()), ((C1185610gxT) ((PoiDetailInfoAssem) awS102S1200000_18.l2).mp()).LJI(), Long.valueOf(System.currentTimeMillis()));
        c062p.LIZIZ = "PoiDetailContentHeaderHierarchyDataV3";
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        C062P c062p = (C062P) obj;
        boolean z = false;
        c062p.LIZ = new C1184530gvj(awS102S1200000_18.s0, C1189060h32.LJIIZILJ(((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).isCollected()), 3, ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getName(), ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getAddress(), z, (C1188530h2B) awS102S1200000_18.l2, (C1185410gx9) null, ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getDataFromAnchor(), z, 1440);
        c062p.LIZIZ = "PoiCollectHierarchyData";
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        long jCurrentTimeMillis;
        boolean zLJIILIIL;
        C1199800hKM c1199800hKM = (C1199800hKM) obj;
        C1623606Xi c1623606Xi = new C1623606Xi((PoiSearchApi.PoiSearchResultWrapper) awS102S1200000_18.l1);
        Long l = (Long) awS102S1200000_18.l2;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = (PoiSearchApi.PoiSearchResultWrapper) awS102S1200000_18.l1;
        if (poiSearchResultWrapper != null) {
            zLJIILIIL = poiSearchResultWrapper.LJIILIIL();
        } else {
            zLJIILIIL = false;
        }
        return C1199800hKM.LIZ(c1199800hKM, c1623606Xi, null, null, null, new C1193740hAa(jCurrentTimeMillis, zLJIILIIL, null, 12), null, null, null, null, awS102S1200000_18.s0, 1006);
    }

    public static final Object invoke$20(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        int size;
        int i;
        int size2;
        ((MixCreateViewModel) awS102S1200000_18.l1).setState(new AwS597S0100000_18((ManageResponse) obj, 1084));
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        C1163880gOQ c1163880gOQ = (C1163880gOQ) awS102S1200000_18.l2;
        String str = c1163880gOQ.LLJ;
        List<Aweme> list = c1163880gOQ.LLILLL;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        MixCreateViewModel mixCreateViewModel = (MixCreateViewModel) awS102S1200000_18.l1;
        String str2 = mixCreateViewModel.LLILLJJLI;
        String str3 = mixCreateViewModel.LLILLL;
        String str4 = awS102S1200000_18.s0;
        List<Aweme> list2 = ((C1163880gOQ) awS102S1200000_18.l2).LLILLL;
        if (list2 != null && !list2.isEmpty()) {
            Iterator<Aweme> it2 = list2.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next().isSubOnlyVideo() && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        List<Aweme> list3 = ((C1163880gOQ) awS102S1200000_18.l2).LLILLL;
        if (list3 != null) {
            size2 = list3.size();
        } else {
            size2 = 0;
        }
        Integer numValueOf2 = Integer.valueOf(size2);
        c1169160gWw.getClass();
        C1169160gWw.LIZJ(str, size, str2, str3, str4, numValueOf, numValueOf2, 0);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        ManageResponse manageResponse = (ManageResponse) obj;
        ((MixCreateViewModel) awS102S1200000_18.l1).setState(new AwS597S0100000_18(manageResponse, 1087));
        int i = 0;
        if (!TextUtils.isEmpty(awS102S1200000_18.s0)) {
            List<Aweme> list = ((C1163880gOQ) awS102S1200000_18.l2).LLILLL;
            if (list != null) {
                MixCreateViewModel mixCreateViewModel = (MixCreateViewModel) awS102S1200000_18.l1;
                String str = awS102S1200000_18.s0;
                if (!list.isEmpty()) {
                    Iterator<Aweme> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().isSubOnlyVideo() && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                C1169160gWw c1169160gWw = C1169160gWw.LIZ;
                String str2 = manageResponse.mixId;
                int size = list.size();
                String str3 = mixCreateViewModel.LLILLJJLI;
                String str4 = mixCreateViewModel.LLILLL;
                Integer numValueOf = Integer.valueOf(i);
                Integer numValueOf2 = Integer.valueOf(list.size());
                c1169160gWw.getClass();
                C1169160gWw.LIZJ(str2, size, str3, str4, null, numValueOf, numValueOf2, 0);
                C1169160gWw.LJII(mixCreateViewModel.LLILLJJLI, "edit_playlist_page", manageResponse.mixId, Integer.valueOf(list.size()), Integer.valueOf(i), Integer.valueOf(list.size()), 0, "create", String.valueOf(str));
            }
        } else {
            C1169160gWw c1169160gWw2 = C1169160gWw.LIZ;
            String str5 = manageResponse.mixId;
            MixCreateViewModel mixCreateViewModel2 = (MixCreateViewModel) awS102S1200000_18.l1;
            String str6 = mixCreateViewModel2.LLILLJJLI;
            String str7 = mixCreateViewModel2.LLILLL;
            c1169160gWw2.getClass();
            C1169160gWw.LIZJ(str5, 0, str6, str7, null, 0, 0, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS102S1200000_18.l1;
        c0sz4.LLJI = new AwS562S0100000_18((ViewGroup) awS102S1200000_18.l2, 2226);
        c0sz4.LLILLJJLI = awS102S1200000_18.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        C1167940gUy c1167940gUy;
        C1167930gUx c1167930gUx = (C1167930gUx) obj;
        c1167930gUx.getClass();
        List<C1167940gUy> list = c1167930gUx.getListState().LLILZ;
        if (list != null) {
            String str = awS102S1200000_18.s0;
            Iterator<C1167940gUy> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().LLILZ, str)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() != -1) {
                Integer numValueOf2 = null;
                if (1 != 0) {
                    ManagePlaylistViewModel managePlaylistViewModel = (ManagePlaylistViewModel) awS102S1200000_18.l1;
                    MixStruct mixStruct = (MixStruct) awS102S1200000_18.l2;
                    int iIntValue = numValueOf.intValue();
                    List<C1167940gUy> list2 = c1167930gUx.getListState().LLILZ;
                    if (list2 != null && (c1167940gUy = (C1167940gUy) ListProtector.get(list2, iIntValue)) != null) {
                        UrlModel icon = mixStruct.getIcon();
                        String mixName = mixStruct.getMixName();
                        MixStatisStruct statis = mixStruct.getStatis();
                        if (statis != null) {
                            numValueOf2 = Integer.valueOf(statis.getTotal());
                        }
                        managePlaylistViewModel.listSetItemAt(iIntValue, C1167940gUy.LIZ(c1167940gUy, mixName, icon, numValueOf2, mixStruct.getLastAddVideoTimestamp(), mixStruct.getMixLabel(), mixStruct.getShareInfo(), 456));
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = new C1184530gvj(awS102S1200000_18.s0, C1189060h32.LJIIZILJ(((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).isCollected()), 0, ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getName(), ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getAddress(), (boolean) (0 == true ? 1 : 0), (C1188530h2B) awS102S1200000_18.l2, (C1185410gx9) null, ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getDataFromAnchor(), (boolean) (0 == true ? 1 : 0), 1444);
        c062p.LIZIZ = "PoiCollectHierarchyData";
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = new C1184530gvj(awS102S1200000_18.s0, C1189060h32.LJIIZILJ(((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).isCollected()), 0, ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getName(), ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getAddress(), (boolean) (0 == true ? 1 : 0), (C1188530h2B) awS102S1200000_18.l2, (C1185410gx9) null, ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getDataFromAnchor(), (boolean) (0 == true ? 1 : 0), 1444);
        c062p.LIZIZ = "PoiCollectHierarchyData";
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$7(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = new C1184530gvj(awS102S1200000_18.s0, C1189060h32.LJIIZILJ(((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).isCollected()), 0, ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getName(), ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getAddress(), (boolean) (0 == true ? 1 : 0), (C1188530h2B) awS102S1200000_18.l2, (C1185410gx9) null, ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getDataFromAnchor(), (boolean) (0 == true ? 1 : 0), 1444);
        c062p.LIZIZ = "PoiCollectHierarchyData";
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = new C1184530gvj(awS102S1200000_18.s0, C1189060h32.LJIIZILJ(((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).isCollected()), 0, ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getName(), ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getAddress(), (boolean) (0 == true ? 1 : 0), (C1188530h2B) awS102S1200000_18.l2, (C1185410gx9) null, ((PoiListApi.PoiDetailResponse) awS102S1200000_18.l1).getDataFromAnchor(), (boolean) (0 == true ? 1 : 0), 1444);
        c062p.LIZIZ = "PoiCollectHierarchyData";
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS102S1200000_18 awS102S1200000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        PoiCampaignMainFragment poiCampaignMainFragment = (PoiCampaignMainFragment) awS102S1200000_18.l1;
        assembler.DQ2(poiCampaignMainFragment, new AwS102S1200000_18(poiCampaignMainFragment, (MyMomentsData) awS102S1200000_18.l2, awS102S1200000_18.s0, 10));
        assembler.QQ2((PoiCampaignMainFragment) awS102S1200000_18.l1, AFwS256S0000000_18.get$arr$(879));
        assembler.QQ2((PoiCampaignMainFragment) awS102S1200000_18.l1, AFwS256S0000000_18.get$arr$(880));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS102S1200000_18(com.ss.android.ugc.aweme.poi.detail.basicinfo.PoiDetailInfoAssem r3, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 14: goto L11;
                case 15: goto L5;
                case 16: goto L11;
                case 17: goto L5;
                case 18: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r5
            r1.l2 = r4
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.s0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS102S1200000_18.<init>(com.ss.android.ugc.aweme.poi.detail.basicinfo.PoiDetailInfoAssem, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS102S1200000_18(X.C1163880gOQ r3, com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 20 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l1 = r4
            r1.s0 = r5
            r1.l2 = r3
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.s0 = r5
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS102S1200000_18.<init>(X.0gOQ, com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS102S1200000_18(C13IQ c13iq, C13IQ<? extends SlashCell<?>> c13iq2, String str, ViewGroup viewGroup) {
        super(1);
        this.$t = viewGroup;
        this.l1 = c13iq;
        this.s0 = c13iq2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S1200000_18(PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, Long l, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = poiSearchResultWrapper;
        this.l2 = l;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S1200000_18(PoiCampaignMainFragment poiCampaignMainFragment, MyMomentsData myMomentsData, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = poiCampaignMainFragment;
        this.l2 = myMomentsData;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S1200000_18(PoiDetailLynxAssem poiDetailLynxAssem, String str, PoiDetailApi.PoiDetailLynxResponse poiDetailLynxResponse, int i) {
        super(1);
        this.$t = i;
        this.l1 = poiDetailLynxAssem;
        this.s0 = str;
        this.l2 = poiDetailLynxResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S1200000_18(PoiDetailWriteReviewViewModel poiDetailWriteReviewViewModel, PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = poiDetailWriteReviewViewModel;
        this.l2 = poiWriteReviewResponse;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S1200000_18(Integer num, Integer num2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = num;
        this.l2 = num2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S1200000_18(String str, ManagePlaylistViewModel managePlaylistViewModel, MixStruct mixStruct, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = managePlaylistViewModel;
        this.l2 = mixStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S1200000_18(String str, PoiListApi.PoiDetailResponse poiDetailResponse, C1188530h2B c1188530h2B, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = poiDetailResponse;
        this.l2 = c1188530h2B;
    }
}
