package kotlin.jvm.internal;

import X.AbstractC1623806Xk;
import X.C013C;
import X.C09AY;
import X.C09RD;
import X.C09RE;
import X.C0HW7;
import X.C1168020gV6;
import X.C1169160gWw;
import X.C1169380gXI;
import X.C1174890ggB;
import X.C1174900ggC;
import X.C1175120ggY;
import X.C1178080glK;
import X.C1178140glQ;
import X.C1182410gsJ;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1184710gw1;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1185600gxS;
import X.C1186260gyW;
import X.C1187260h08;
import X.C1188440h22;
import X.C1189060h32;
import X.C1190250h4x;
import X.C1190260h4y;
import X.C1190270h4z;
import X.C1190320h54;
import X.C1190370h59;
import X.C1190460h5I;
import X.C1190880h5y;
import X.C1191160h6Q;
import X.C1192400h8Q;
import X.C1194630hC1;
import X.C1194810hCJ;
import X.C1195630hDd;
import X.C1197490hGd;
import X.C1199610hK3;
import X.C1200000hKg;
import X.C1201620hNI;
import X.C1201680hNO;
import X.C1201760hNW;
import X.C1201770hNX;
import X.C1252710ihh;
import X.C1388190mED;
import X.C13LE;
import X.C13LP;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1626990sRN;
import X.C1697810uHb;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1846060y8i;
import X.C1893080zMY;
import X.C1954807lC;
import X.C1ER1;
import X.C20248814Kw;
import X.C20509915Nh;
import X.C20600815jK;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2205251BSp;
import X.C2211631BhB;
import X.C2344009Gk;
import X.C2365509Or;
import X.C291001Au;
import X.C418440Gaw;
import X.C425980Gn6;
import X.C444540Hbw;
import X.C444550Hbx;
import X.C444560Hby;
import X.C444590Hc1;
import X.C444600Hc2;
import X.C444640Hc6;
import X.C444690HcB;
import X.C491001vg;
import X.C723850SaN;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1169660gXk;
import X.EnumC1176320giU;
import X.EnumC1189990h4X;
import X.EnumC1190310h53;
import X.EnumC1201670hNN;
import X.EnumC444580Hc0;
import X.EnumC444620Hc4;
import X.EnumC444680HcA;
import X.InterfaceC1165510gR3;
import X.InterfaceC1177040gje;
import X.InterfaceC1194840hCM;
import X.InterfaceC1197930hHL;
import X.InterfaceC1199990hKf;
import X.InterfaceC1201800hNa;
import X.InterfaceC1542790qFZ;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217701Bqy;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ACListenerS121S0200000_18;
import Y.ARunnableS102S0100000_2;
import Y.ARunnableS26S0400000_18;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.JumpLynxPageResult;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreOverlayAssem;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreSkeletonAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListStateAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.CollaborativeCollectionListStateAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.choose.PlaylistChoosePanelStatusViewAssem;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistHeaderCell;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerAssem;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.creation.PoiCreatedEntranceAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell.PoiHeaderTopVideosViewMoreCell;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2;
import com.ss.android.ugc.aweme.poi.detail.chartv3.horizontallist.PoiDetailChartsV3PageCardReusedAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesDetailFragment;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryCell;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiPicture;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsAssem;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailWriteReviewButtonAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailMapAssem;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsContainerAssem;
import com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsContentAssem;
import com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsStatusAssem;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import com.ss.android.ugc.aweme.poi.reviews.tab.ui.PoiCommentReviewStatusAssem;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.nearby.roaming.NearbyRegionListFragment;
import com.ss.android.ugc.nearby.roaming.NearbyRegionListV1Response;
import com.ss.android.ugc.profile.business.ur.popup.AvatarAndNicknamePopup;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class AwS454S0200000_18 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS454S0200000_18(com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistHeaderCell r3, X.C1168020gV6 r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 36: goto Lf;
                case 37: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS454S0200000_18.<init>(com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistHeaderCell, X.0gV6, int):void");
    }

    public static final Object invoke$0(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        boolean z;
        if (obj2 == EnumC1176320giU.LIST_LOADING || obj2 == EnumC1176320giU.LIST_SILENCE_LOADING) {
            C013C c013c = (C013C) awS454S0200000_18.l0;
            if (obj2 == EnumC1176320giU.LIST_SILENCE_LOADING) {
                z = true;
            } else {
                z = false;
            }
            c013c.element = z;
            if (!z) {
                TuxIconView tuxIconView = ((PoiMapDetailMapAssem) awS454S0200000_18.l1).LLJJIJIL;
                if (tuxIconView != null) {
                    tuxIconView.setEnabled(false);
                }
                ((PoiMapDetailMapAssem) awS454S0200000_18.l1).LLJILJIL.LIZIZ("poi_list_update");
                ((PoiMapDetailMapAssem) awS454S0200000_18.l1).LLJILJIL.LIZIZ("poi_list_finish");
                ((PoiMapDetailMapAssem) awS454S0200000_18.l1).Ho();
            }
        }
        if (obj2 == EnumC1176320giU.LIST_COMPLETE) {
            TuxIconView tuxIconView2 = ((PoiMapDetailMapAssem) awS454S0200000_18.l1).LLJJIJIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setEnabled(true);
            }
            ((PoiMapDetailMapAssem) awS454S0200000_18.l1).LLJILJIL.LIZ(AFwS256S0000000_18.get$arr$(0));
            ((PoiMapDetailMapAssem) awS454S0200000_18.l1).LLJILJIL.LIZLLL(Collections.singletonList("map_init"), new AwS384S0200000_18((PoiMapDetailMapAssem) awS454S0200000_18.l1, (C013C) awS454S0200000_18.l0, 6));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem = (PoiDetailFoodHeaderAssem) awS454S0200000_18.l0;
        PoiListApi.PoiDetailResponse poiDetailResponse = poiDetailFoodHeaderAssem.LLJJI;
        PoiListApi.PoiDetailResponse poiDetailResponse2 = (PoiListApi.PoiDetailResponse) awS454S0200000_18.l1;
        poiDetailFoodHeaderAssem.vq(poiDetailResponse, poiDetailResponse2, "phone", new AwS419S0200000_18(poiDetailFoodHeaderAssem, poiDetailResponse2, 9), new AwS384S0200000_18((PoiDetailFoodHeaderAssem) awS454S0200000_18.l0, (PoiListApi.PoiDetailResponse) awS454S0200000_18.l1, 14));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        String str;
        String str2;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str3 = ((PoiDetailHeaderAssem) awS454S0200000_18.l0).cp().LL;
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS454S0200000_18.l1).getCollectInfo();
        C1184460gvc c1184460gvcOo = ((PoiDetailHeaderAssem) awS454S0200000_18.l0).Oo();
        if (c1184460gvcOo != null && (c1184480gve2 = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve2.LLILLJJLI;
        } else {
            str = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailHeaderAssem) awS454S0200000_18.l0).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
            str2 = c1184480gve.LL;
        } else {
            str2 = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailHeaderAssem) awS454S0200000_18.l0);
        PageFinder pageFinderZo = ((PoiDetailHeaderAssem) awS454S0200000_18.l0).Zo();
        c1185430gxB.getClass();
        C1185430gxB.LJJJZ(str3, collectInfo, str, str2, "small_header_image", pageFinderZo, interfaceC665370Q7zLJIIL, null);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        C1187260h08 c1187260h08 = C1187260h08.LIZ;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiHeaderTopVideosViewMoreCell) awS454S0200000_18.l0);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (fragmentLJIIJ != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
        }
        PageFinder pageFinderVia = PageFinder.via((C20248814Kw) awS454S0200000_18.l1);
        c1187260h08.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7zLJFF);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_poi_background_media_viewall_show", map, c1185050gwZ);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        String str;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str2 = ((PoiDetailTravelHeaderAssemV2) awS454S0200000_18.l0).cp().LL;
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS454S0200000_18.l1).getCollectInfo();
        C1184460gvc c1184460gvcOo = ((PoiDetailTravelHeaderAssemV2) awS454S0200000_18.l0).Oo();
        String str3 = null;
        if (c1184460gvcOo != null && (c1184480gve2 = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve2.LLILLJJLI;
        } else {
            str = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailTravelHeaderAssemV2) awS454S0200000_18.l0).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
            str3 = c1184480gve.LL;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailTravelHeaderAssemV2) awS454S0200000_18.l0);
        PageFinder pageFinderZo = ((PoiDetailTravelHeaderAssemV2) awS454S0200000_18.l0).Zo();
        C1184710gw1 c1184710gw1 = ((PoiDetailTravelHeaderAssemV2) awS454S0200000_18.l0).LLJJJJLIIL;
        c1185430gxB.getClass();
        C1185430gxB.LJJJZ(str2, collectInfo, str, str3, "small_header_image", pageFinderZo, interfaceC665370Q7zLJIIL, c1184710gw1);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        PoiDetailReviewsAssem poiDetailReviewsAssem = (PoiDetailReviewsAssem) awS454S0200000_18.l0;
        String str = poiDetailReviewsAssem.LLJJL;
        String str2 = poiDetailReviewsAssem.Fp().getState().LLILZIL;
        Integer numValueOf = Integer.valueOf((int) ((PoiDetailReviewsAssem) awS454S0200000_18.l0).LLJZ);
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ((C1195630hDd) awS454S0200000_18.l1, null);
        PageFinder pageFinderEp = ((PoiDetailReviewsAssem) awS454S0200000_18.l0).Ep();
        c1191160h6Q.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJ);
        linkedHashMap.put("enter_from", "poi_detail");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("poi_id", str);
        C1189060h32.LIZ(str2, linkedHashMap);
        linkedHashMap.put("review_cnt", String.valueOf(numValueOf));
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderEp);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_more_reviews_button", linkedHashMap, c1185050gwZ);
        C1191160h6Q.LJJII(((PoiDetailReviewsAssem) awS454S0200000_18.l0).Ep(), C1558520qew.LJIIL((PoiDetailReviewsAssem) awS454S0200000_18.l0), null, "poi_detail_reviews_more_button");
        return Unit.LIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object invoke$14(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        String str;
        String str2;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        PoiReviewsListViewModel vm = ((C1190370h59) awS454S0200000_18.l0).getVm();
        if (vm != null) {
            str = vm.LL;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        PoiReviewsListViewModel vm2 = ((C1190370h59) awS454S0200000_18.l0).getVm();
        if (vm2 == null || (str2 = vm2.LLILZLL) == null) {
            str2 = "";
        }
        C1190370h59 c1190370h59 = (C1190370h59) awS454S0200000_18.l0;
        String tagId = ((PoiReviewsApi.PoiReviewTagModel) awS454S0200000_18.l1).getTagId();
        if (tagId == null) {
            tagId = "";
        }
        c1190370h59.getClass();
        String str4 = "negative";
        switch (tagId.hashCode()) {
            case 48:
                if (tagId.equals(CardStruct.IStatusCode.DEFAULT)) {
                    str3 = "all";
                }
                break;
            case 49:
                if (tagId.equals("1")) {
                    str3 = "Images";
                }
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                if (tagId.equals("2")) {
                    str3 = "negative";
                }
                break;
        }
        String strValueOf = String.valueOf(((PoiReviewsApi.PoiReviewTagModel) awS454S0200000_18.l1).getTagName());
        int iLIZJ = C1175120ggY.LIZJ(((PoiReviewsApi.PoiReviewTagModel) awS454S0200000_18.l1).getTagReviewCount());
        Integer tagEmotion = ((PoiReviewsApi.PoiReviewTagModel) awS454S0200000_18.l1).getTagEmotion();
        if (tagEmotion != null && tagEmotion.intValue() == 1) {
            str4 = "positive";
        } else {
            Integer tagEmotion2 = ((PoiReviewsApi.PoiReviewTagModel) awS454S0200000_18.l1).getTagEmotion();
            if (tagEmotion2 != null && tagEmotion2.intValue() == 2) {
                str4 = "neutral";
            }
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ((C1190370h59) awS454S0200000_18.l0, null);
        PageFinder pageFinderVia = PageFinder.via((View) awS454S0200000_18.l0);
        c1191160h6Q.getClass();
        C1191160h6Q.LJJIJIL("poi_reviews", str, str2, str3, strValueOf, iLIZJ, str4, null, interfaceC665370Q7zLJ, pageFinderVia);
        return Unit.LIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$15(kotlin.jvm.internal.AwS454S0200000_18 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS454S0200000_18.invoke$15(kotlin.jvm.internal.AwS454S0200000_18, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$16(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        final List<PoiReviewsApi.PoiReviewsTabInfoModel> reviewTabInfos;
        boolean z;
        String str;
        C1846060y8i c1846060y8i;
        String str2;
        int value;
        UIAssem uIAssem = (UIAssem) obj;
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj2;
        if (abstractC1623806Xk instanceof C1623606Xi) {
            C1623606Xi c1623606Xi = (C1623606Xi) abstractC1623806Xk;
            PoiReviewsApi.PoiReviewListResponse poiReviewListResponse = (PoiReviewsApi.PoiReviewListResponse) c1623606Xi.LIZ;
            List<PoiReviewsApi.PoiReviewModel> thirdPartyReviews = null;
            if (poiReviewListResponse != null) {
                reviewTabInfos = poiReviewListResponse.getReviewTabInfos();
            } else {
                reviewTabInfos = null;
            }
            PoiReviewsApi.PoiReviewListResponse poiReviewListResponse2 = (PoiReviewsApi.PoiReviewListResponse) c1623606Xi.LIZ;
            if (poiReviewListResponse2 != null) {
                thirdPartyReviews = poiReviewListResponse2.getThirdPartyReviews();
            }
            if (reviewTabInfos != null && !reviewTabInfos.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            String str3 = "";
            if (!z && reviewTabInfos.size() != 1 && thirdPartyReviews != null && !thirdPartyReviews.isEmpty()) {
                PoiReviewsContainerAssem poiReviewsContainerAssem = (PoiReviewsContainerAssem) awS454S0200000_18.l0;
                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = poiReviewsContainerAssem.LLJJIII;
                if (viewOnAttachStateChangeListenerC20631115oD != null && viewOnAttachStateChangeListenerC20631115oD.getChildCount() < reviewTabInfos.size()) {
                    for (PoiReviewsApi.PoiReviewsTabInfoModel poiReviewsTabInfoModel : reviewTabInfos) {
                        C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().getState();
                        C1190460h5I c1190460h5I = (C1190460h5I) poiReviewsContainerAssem.LLJJI.getValue();
                        if (c1190460h5I == null || (str2 = c1190460h5I.LL) == null) {
                            str2 = "";
                        }
                        Integer num = poiReviewsTabInfoModel.reviewTab;
                        if (num != null) {
                            value = num.intValue();
                        } else {
                            value = EnumC1190310h53.POI_REVIEW_TAB_TIKTOK.getValue();
                        }
                        C20600815jK.LIZJ(state, new C1190880h5y(str2, value, (PoiReviewsApi.PoiReviewListResponse) c1623606Xi.LIZ, poiReviewsContainerAssem.hp()));
                    }
                }
                View viewFindViewById = ((View) awS454S0200000_18.l1).findViewById(R.id.wx6);
                if (viewFindViewById != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                }
                PoiReviewsContainerAssem poiReviewsContainerAssem2 = (PoiReviewsContainerAssem) awS454S0200000_18.l0;
                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = poiReviewsContainerAssem2.LLJJIII;
                if (viewOnAttachStateChangeListenerC20631115oD2 != null && (c1846060y8i = poiReviewsContainerAssem2.LLJJIJI) != null) {
                    new C1194810hCJ(c1846060y8i, viewOnAttachStateChangeListenerC20631115oD2, true, new InterfaceC1194840hCM() { // from class: X.0h5z
                        @Override // X.InterfaceC1194840hCM
                        public final void LIZ(C1845940y8W c1845940y8W, int i) {
                            String str4;
                            PoiReviewsApi.PoiReviewsTabInfoModel poiReviewsTabInfoModel2 = (PoiReviewsApi.PoiReviewsTabInfoModel) C13LP.LJJJLZIJ(i, reviewTabInfos);
                            if (poiReviewsTabInfoModel2 != null) {
                                str4 = poiReviewsTabInfoModel2.reviewTabName;
                            } else {
                                str4 = null;
                            }
                            c1845940y8W.LIZIZ(str4);
                        }
                    }).LIZ();
                }
                ((PoiReviewsContainerAssem) awS454S0200000_18.l0).hp().LLJLIL = true;
                PoiReviewsContainerAssem poiReviewsContainerAssem3 = (PoiReviewsContainerAssem) awS454S0200000_18.l0;
                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = poiReviewsContainerAssem3.LLJJIII;
                if (viewOnAttachStateChangeListenerC20631115oD3 != null) {
                    HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD3, new ARunnableS26S0400000_18(poiReviewsContainerAssem3, abstractC1623806Xk, viewOnAttachStateChangeListenerC20631115oD3, reviewTabInfos, 0));
                }
                ((PoiReviewsContainerAssem) awS454S0200000_18.l0).hp().LLJLIL = true;
            } else {
                C1846060y8i c1846060y8i2 = ((PoiReviewsContainerAssem) awS454S0200000_18.l0).LLJJIJI;
                if (c1846060y8i2 != null) {
                    C786410Ut5.LLZLI(c1846060y8i2, 8);
                }
                PoiReviewsContainerAssem poiReviewsContainerAssem4 = (PoiReviewsContainerAssem) awS454S0200000_18.l0;
                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD4 = poiReviewsContainerAssem4.LLJJIII;
                if (viewOnAttachStateChangeListenerC20631115oD4 != null) {
                    C20600815jK<InterfaceC1891350zJl> state2 = viewOnAttachStateChangeListenerC20631115oD4.getViewItemOperator().getState();
                    C1190460h5I c1190460h5I2 = (C1190460h5I) poiReviewsContainerAssem4.LLJJI.getValue();
                    if (c1190460h5I2 != null && (str = c1190460h5I2.LL) != null) {
                        str3 = str;
                    }
                    C20600815jK.LIZJ(state2, new C1190880h5y(str3, EnumC1190310h53.POI_REVIEW_TAB_TIKTOK.getValue(), (PoiReviewsApi.PoiReviewListResponse) c1623606Xi.LIZ, poiReviewsContainerAssem4.hp()));
                }
                ((PoiReviewsContainerAssem) awS454S0200000_18.l0).hp().LLJJLIIIJLLLLLLLZ = "tiktok";
            }
            View contentView = ((PoiReviewsContainerAssem) awS454S0200000_18.l0).getContentView();
            if (contentView != null) {
                C2211631BhB.LJ(contentView, new AwS384S0200000_18(uIAssem, (PoiReviewsContainerAssem) awS454S0200000_18.l0, 146));
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        List<PoiReviewsApi.PoiReviewModel> reviews;
        PoiReviewsApi.PoiReviewListResponse poiReviewListResponseLIZ;
        List<PoiReviewsApi.PoiReviewModel> thirdPartyReviews;
        UIAssem uIAssem = (UIAssem) obj;
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj2;
        if (abstractC1623806Xk instanceof C1623706Xj) {
            ((C1749280vcc) awS454S0200000_18.l0).LJ();
            C786410Ut5.LLLZLZ((C1749280vcc) awS454S0200000_18.l0, 0);
        } else if (abstractC1623806Xk instanceof C1623606Xi) {
            PoiReviewsStatusAssem poiReviewsStatusAssem = (PoiReviewsStatusAssem) awS454S0200000_18.l1;
            C1749280vcc c1749280vcc = (C1749280vcc) awS454S0200000_18.l0;
            PoiReviewsApi.PoiReviewListResponse poiReviewListResponseLIZ2 = poiReviewsStatusAssem.Go().getState().LLILZ.LIZ();
            if (poiReviewListResponseLIZ2 != null) {
                reviews = poiReviewListResponseLIZ2.getReviews();
            } else {
                reviews = null;
            }
            if ((reviews == null || reviews.isEmpty()) && ((poiReviewListResponseLIZ = poiReviewsStatusAssem.Go().getState().LLILZ.LIZ()) == null || (thirdPartyReviews = poiReviewListResponseLIZ.getThirdPartyReviews()) == null || thirdPartyReviews.isEmpty())) {
                Context context = poiReviewsStatusAssem.getContext();
                EnumC444680HcA enumC444680HcA = EnumC444680HcA.NO_CONTENT;
                c1749280vcc.setStatus(C444600Hc2.LIZ(context, c1749280vcc, C444540Hbw.LIZ(enumC444680HcA, new C444640Hc6(EnumC444620Hc4.HUG, (Float) null, 6), new C444550Hbx(Boolean.TRUE, (Integer) null, 6), 2131844849, null, null, new C444590Hc1(3))));
                C444690HcB.LIZ(enumC444680HcA, c1749280vcc);
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
            } else if (c1749280vcc.getVisibility() != 8) {
                HandlerHook.viewPostDelay(c1749280vcc, new ARunnableS102S0100000_2(c1749280vcc, 59), 200L);
            }
        } else if (abstractC1623806Xk instanceof C491001vg) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StatusAssem - onError: ");
            abstractC1623806Xk.getClass();
            sbLIZ.append((Object) null);
            C2188811AlT.LIZIZ(sbLIZ);
            C1749280vcc c1749280vcc2 = (C1749280vcc) awS454S0200000_18.l0;
            Context context2 = uIAssem.getContext();
            C1749280vcc c1749280vcc3 = (C1749280vcc) awS454S0200000_18.l0;
            EnumC444680HcA enumC444680HcA2 = EnumC444680HcA.NO_NETWORK;
            c1749280vcc2.setStatus(C444600Hc2.LIZ(context2, c1749280vcc3, C444540Hbw.LIZ(enumC444680HcA2, new C444640Hc6(EnumC444620Hc4.FIXED, (Float) null, 6), new C444550Hbx(Boolean.TRUE, (Integer) null, 6), null, null, new C444560Hby(EnumC444580Hc0.SQUARED_BUTTON, 3, null, null, new AwS419S0200000_18((PoiReviewsStatusAssem) awS454S0200000_18.l1, uIAssem, 93), 12), new C444590Hc1(3))));
            C444690HcB.LIZ(enumC444680HcA2, (C1749280vcc) awS454S0200000_18.l0);
            C786410Ut5.LLLZLZ((C1749280vcc) awS454S0200000_18.l0, 0);
        } else {
            C786410Ut5.LLLZLZ((C1749280vcc) awS454S0200000_18.l0, 8);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        C1185430gxB.LJJIJIL(C1185430gxB.LIZ, C1558520qew.LJIIL((UIAssem) awS454S0200000_18.l0), "poi_review", null, new C1185050gwZ(PageFinder.via(((PoiReviewsContainerAssem) awS454S0200000_18.l1).getContentView())), 20);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$19(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiReviewListState - refreshState is success:");
        sbLIZ.append(((C1190270h4z) ((PoiCommentReviewStatusAssem) awS454S0200000_18.l0).Go().getState()).LLJIJIL.LL instanceof C1623606Xi);
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        if (((C1190270h4z) ((PoiCommentReviewStatusAssem) awS454S0200000_18.l0).Go().getState()).LLJIJIL.LL instanceof C1623606Xi) {
            ((PoiCommentReviewStatusAssem) awS454S0200000_18.l0).Ho((C1749280vcc) awS454S0200000_18.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x016d A[PHI: r0
      0x016d: PHI (r0v12 android.view.View) = (r0v11 android.view.View), (r0v21 android.view.View) binds: [B:70:0x0156, B:75:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS454S0200000_18 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS454S0200000_18.invoke$2(kotlin.jvm.internal.AwS454S0200000_18, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$20(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        InterfaceC1201800hNa interfaceC1201800hNa = (InterfaceC1201800hNa) obj2;
        Context context = ((NearbyRegionListFragment) awS454S0200000_18.l0).getContext();
        if (context != null && C1388190mED.LIZIZ(context) != null && interfaceC1201800hNa != null) {
            C1749280vcc c1749280vcc = null;
            boolean z = true;
            if (interfaceC1201800hNa instanceof C1201760hNW) {
                C1749280vcc c1749280vcc2 = ((NearbyRegionListFragment) awS454S0200000_18.l0).LLIZLLLIL;
                if (c1749280vcc2 == null) {
                    c1749280vcc2 = null;
                }
                C786410Ut5.LLLZLZ(c1749280vcc2, 0);
                C1201760hNW c1201760hNW = (C1201760hNW) interfaceC1201800hNa;
                int i = C1201680hNO.LIZ[c1201760hNW.LIZIZ.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (!((NearbyRegionListFragment) awS454S0200000_18.l0).WR().LLILLJJLI) {
                            if (C0HW7.LIZ) {
                                NearbyRegionListFragment nearbyRegionListFragment = (NearbyRegionListFragment) awS454S0200000_18.l0;
                                C1749280vcc c1749280vcc3 = nearbyRegionListFragment.LLIZLLLIL;
                                if (c1749280vcc3 == null) {
                                    c1749280vcc3 = null;
                                }
                                c1749280vcc3.setStatus(nearbyRegionListFragment.VR(c1749280vcc3, EnumC1201670hNN.API_ERROR));
                                EnumC444680HcA enumC444680HcA = EnumC444680HcA.SOMETHING_WRONG;
                                C1749280vcc c1749280vcc4 = ((NearbyRegionListFragment) awS454S0200000_18.l0).LLIZLLLIL;
                                if (c1749280vcc4 != null) {
                                    c1749280vcc = c1749280vcc4;
                                }
                                C444690HcB.LIZ(enumC444680HcA, c1749280vcc);
                            } else {
                                NearbyRegionListFragment nearbyRegionListFragment2 = (NearbyRegionListFragment) awS454S0200000_18.l0;
                                C1749280vcc c1749280vcc5 = nearbyRegionListFragment2.LLIZLLLIL;
                                if (c1749280vcc5 != null) {
                                    c1749280vcc = c1749280vcc5;
                                }
                                c1749280vcc.setStatus(nearbyRegionListFragment2.UR(EnumC1201670hNN.API_ERROR));
                            }
                        }
                        InterfaceC1199990hKf interfaceC1199990hKfLIZIZ = C1200000hKg.LIZIZ(((NearbyRegionListFragment) awS454S0200000_18.l0).LLIZ);
                        interfaceC1199990hKfLIZIZ.LJJI(c1201760hNW.LIZ);
                        interfaceC1199990hKfLIZIZ.LJJIFFI();
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    if (!((NearbyRegionListFragment) awS454S0200000_18.l0).WR().LLILLJJLI) {
                        if (C0HW7.LIZ) {
                            NearbyRegionListFragment nearbyRegionListFragment3 = (NearbyRegionListFragment) awS454S0200000_18.l0;
                            C1749280vcc c1749280vcc6 = nearbyRegionListFragment3.LLIZLLLIL;
                            if (c1749280vcc6 == null) {
                                c1749280vcc6 = null;
                            }
                            c1749280vcc6.setStatus(nearbyRegionListFragment3.VR(c1749280vcc6, EnumC1201670hNN.NETWORK_ERROR));
                            EnumC444680HcA enumC444680HcA2 = EnumC444680HcA.NO_NETWORK;
                            C1749280vcc c1749280vcc7 = ((NearbyRegionListFragment) awS454S0200000_18.l0).LLIZLLLIL;
                            if (c1749280vcc7 != null) {
                                c1749280vcc = c1749280vcc7;
                            }
                            C444690HcB.LIZ(enumC444680HcA2, c1749280vcc);
                        } else {
                            NearbyRegionListFragment nearbyRegionListFragment4 = (NearbyRegionListFragment) awS454S0200000_18.l0;
                            C1749280vcc c1749280vcc8 = nearbyRegionListFragment4.LLIZLLLIL;
                            if (c1749280vcc8 != null) {
                                c1749280vcc = c1749280vcc8;
                            }
                            c1749280vcc.setStatus(nearbyRegionListFragment4.UR(EnumC1201670hNN.NETWORK_ERROR));
                        }
                    }
                    InterfaceC1199990hKf interfaceC1199990hKfLIZIZ2 = C1200000hKg.LIZIZ(((NearbyRegionListFragment) awS454S0200000_18.l0).LLIZ);
                    interfaceC1199990hKfLIZIZ2.LJIJI("net_no_network");
                    interfaceC1199990hKfLIZIZ2.LJJIFFI();
                }
            } else {
                NearbyRegionListV1Response nearbyRegionListV1Response = ((C1201770hNX) interfaceC1201800hNa).LIZ;
                C1749280vcc c1749280vcc9 = ((NearbyRegionListFragment) awS454S0200000_18.l0).LLIZLLLIL;
                if (c1749280vcc9 == null) {
                    c1749280vcc9 = null;
                }
                C786410Ut5.LLLZLZ(c1749280vcc9, 8);
                if (nearbyRegionListV1Response.currentRegion != null || nearbyRegionListV1Response.allRegions != null) {
                    z = false;
                }
                NearbyRegionListFragment nearbyRegionListFragment5 = (NearbyRegionListFragment) awS454S0200000_18.l0;
                C723850SaN.LIZ(nearbyRegionListFragment5, false, null, new AwS70S0210000_18(nearbyRegionListFragment5, z, nearbyRegionListV1Response, 3), 3);
                boolean z2 = ((NearbyRegionListFragment) awS454S0200000_18.l0).WR().LLILLJJLI;
                Long l = ((NearbyRegionListFragment) awS454S0200000_18.l0).LLJI;
                if (l != null) {
                    long jLongValue = l.longValue();
                    C1201620hNI c1201620hNI = C1201620hNI.LIZ;
                    int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jLongValue);
                    c1201620hNI.getClass();
                    c1201620hNI.LIZJ("nearby_change_region", new AwS32S0001000_18(iCurrentTimeMillis, 17));
                }
                InterfaceC1199990hKf interfaceC1199990hKfLIZIZ3 = C1200000hKg.LIZIZ(((NearbyRegionListFragment) awS454S0200000_18.l0).LLIZ);
                interfaceC1199990hKfLIZIZ3.LJIJ(z2);
                interfaceC1199990hKfLIZIZ3.LJJ((View) awS454S0200000_18.l1);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$21(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        int i;
        EnumC1169660gXk enumC1169660gXk = (EnumC1169660gXk) obj2;
        View viewFindViewById = ((View) awS454S0200000_18.l0).findViewById(R.id.lc0);
        AvatarAndNicknamePopup avatarAndNicknamePopup = (AvatarAndNicknamePopup) awS454S0200000_18.l1;
        TuxIconView tuxIconView = (TuxIconView) viewFindViewById;
        if (enumC1169660gXk.getShowCloseXMark()) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
        C786410Ut5.a9(tuxIconView, new ACListenerS121S0200000_18(enumC1169660gXk, avatarAndNicknamePopup, 35));
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((JumpLynxPageResult) awS454S0200000_18.l0).isSuccess = Integer.valueOf(zBooleanValue ? 1 : 0);
        ((JumpLynxPageResult) awS454S0200000_18.l0).errorMessage = (String) obj2;
        ((InterfaceC1165510gR3) ((StoreOverlayAssem) awS454S0200000_18.l1).LLJI.getValue()).LIZJ((JumpLynxPageResult) awS454S0200000_18.l0, "ecMixTabJumpLynxPageRes");
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        C1185430gxB.LJJIJIL(C1185430gxB.LIZ, C1558360qeg.LJ((ViewOnAttachStateChangeListenerC20631115oD) awS454S0200000_18.l0, null), "poi_recommend_dish", null, new C1185050gwZ(PageFinder.via((Fragment) awS454S0200000_18.l1)), 20);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[PHI: r5
      0x0061: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:26:0x005e, B:18:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$24(kotlin.jvm.internal.AwS454S0200000_18 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem r0 = (com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem) r0
            X.0gq3 r0 = X.C1178990gmn.LIZIZ(r0)
            r9 = 0
            if (r0 == 0) goto L67
            X.0gdc r0 = r0.qr0()
            if (r0 == 0) goto L67
            CONTEXT r2 = r0.LIZ
            X.0gxS r2 = (X.C1185600gxS) r2
        L15:
            X.0gxB r1 = X.C1185430gxB.LIZ
            if (r2 == 0) goto L65
            java.lang.String r3 = r2.LIZ
        L1b:
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem r0 = (com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem) r0
            com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse r0 = r0.ip()
            if (r0 == 0) goto L63
            java.lang.String r4 = r0.getCollectInfo()
        L29:
            if (r2 == 0) goto L5d
            X.0gx9 r0 = r2.LJFF
            if (r0 == 0) goto L5d
            java.lang.String r5 = r0.getEnterFrom()
        L33:
            X.0gx9 r0 = r2.LJFF
            if (r0 == 0) goto L61
            java.lang.String r6 = r0.getEnterMethod()
        L3b:
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem r0 = (com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem) r0
            androidx.fragment.app.Fragment r0 = X.C1189060h32.LJIIJ(r0)
            if (r0 == 0) goto L49
            X.0Q7z r9 = X.C1558360qeg.LJFF(r0, r9)
        L49:
            java.lang.Object r0 = r8.l1
            android.view.View r0 = (android.view.View) r0
            com.bytedance.android.btm.api.model.PageFinder r8 = com.bytedance.android.btm.api.model.PageFinder.via(r0)
            java.lang.String r7 = "multi_media"
            r10 = 0
            r1.getClass()
            X.C1185430gxB.LJJJZ(r3, r4, r5, r6, r7, r8, r9, r10)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5d:
            r5 = r9
            if (r2 == 0) goto L61
            goto L33
        L61:
            r6 = r9
            goto L3b
        L63:
            r4 = r9
            goto L29
        L65:
            r3 = r9
            goto L1b
        L67:
            r2 = r9
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS454S0200000_18.invoke$24(kotlin.jvm.internal.AwS454S0200000_18, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$25(kotlin.jvm.internal.AwS454S0200000_18 r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS454S0200000_18.invoke$25(kotlin.jvm.internal.AwS454S0200000_18, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$26(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        String str;
        Double d = (Double) obj;
        Double d2 = (Double) obj2;
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = (Context) awS454S0200000_18.l0;
        SparkContext sparkContext = new SparkContext();
        C1185600gxS c1185600gxS = (C1185600gxS) awS454S0200000_18.l1;
        final Context context2 = (Context) awS454S0200000_18.l0;
        sparkContext.LJJLIIJ("aweme://roma_redirect/?spark_page=poi_suggestion");
        if (c1185600gxS == null || (str = c1185600gxS.LIZ) == null) {
            str = "";
        }
        sparkContext.LJJJZ("poi_id", str);
        sparkContext.LJJJLZIJ(1, "roma_enable_with_param");
        if (d != null) {
            sparkContext.LJJJLL(d.doubleValue(), "lat");
        }
        if (d2 != null) {
            sparkContext.LJJJLL(d2.doubleValue(), "lng");
        }
        sparkContext.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0hE4
            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJJJI() {
                return !C444960Hcc.LIZJ(context2) ? new C1725480v0E(R.anim.g6, R.anim.ed) : new C1725480v0E(R.anim.g5, R.anim.ed);
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJLI() {
                return !C444960Hcc.LIZJ(context2) ? new C1725480v0E(0, R.anim.g8) : new C1725480v0E(0, R.anim.g7);
            }
        });
        sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0NWY
            @Override // X.InterfaceC2217701Bqy
            public final Context LIZJ(Context context3) {
                return context3;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIILLIIL(boolean z) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIL(Activity activity, Context context3) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIII(SparkActivity sparkActivity, boolean z) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIJZLJL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIJIIJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJLL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJZI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                return false;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLJLI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void finish() {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJI(SparkActivity sparkActivity) {
                try {
                    String stringExtra = sparkActivity.getIntent().getStringExtra("is_audit_country");
                    if (stringExtra != null) {
                        C1440005kM.LIZ(new C0NWZ(Intrinsics.LJFF(stringExtra, "1")));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        });
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        Integer num;
        PoiPicture poiPicture = ((C1186260gyW) awS454S0200000_18.l0).LLILLL;
        if (poiPicture != null && (num = poiPicture.entityType) != null && num.intValue() == 5) {
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ(((PoiGalleryCell) awS454S0200000_18.l1).itemView, null);
            PoiPicture poiPicture2 = ((C1186260gyW) awS454S0200000_18.l0).LLILLL;
            String str = poiPicture2.entityId;
            String str2 = poiPicture2.picId;
            PageFinder pageFinderVia = PageFinder.via(((PoiGalleryCell) awS454S0200000_18.l1).getCurrentActivity());
            c1191160h6Q.getClass();
            C1191160h6Q.LJJIJLIJ(pageFinderVia, interfaceC665370Q7zLJ, str, str2, "poi_secondary_preview_page");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        C1185430gxB.LJJIJIL(C1185430gxB.LIZ, C1558360qeg.LJ((ViewOnAttachStateChangeListenerC20631115oD) awS454S0200000_18.l0, null), "poi_recommend_dish", null, new C1185050gwZ(PageFinder.via((Fragment) awS454S0200000_18.l1)), 20);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$29(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        String tagId;
        String tagId2;
        C1190260h4y c1190260h4y;
        C1190260h4y c1190260h4y2;
        C1190260h4y c1190260h4y3;
        List<PoiReviewsApi.PoiReviewTagModel> list = ((C1190250h4x) ((PoiReviewsContentAssem) awS454S0200000_18.l0).Lo().getState()).LLJI;
        if (list != null) {
            C425980Gn6 c425980Gn6 = ((PoiReviewsContentAssem) awS454S0200000_18.l0).LLJJIJIIJIL;
            if (c425980Gn6 != null) {
                int visibility = c425980Gn6.getVisibility();
                c425980Gn6.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c425980Gn6);
            }
            int i = 0;
            for (Object obj3 : (ArrayList) C13LP.LJJJJLI(list)) {
                int i2 = i + 1;
                if (i >= 0) {
                    ((PoiReviewsApi.PoiReviewTagModel) obj3).setIndex(Integer.valueOf(i));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            PoiReviewsContentAssem poiReviewsContentAssem = (PoiReviewsContentAssem) awS454S0200000_18.l0;
            if (poiReviewsContentAssem.LLJL) {
                for (PoiReviewsApi.PoiReviewTagModel poiReviewTagModel : list) {
                    if (poiReviewTagModel != null) {
                        Context context = poiReviewsContentAssem.getContext();
                        if (context == null) {
                            c1190260h4y3 = null;
                        } else {
                            c1190260h4y3 = new C1190260h4y(context);
                            c1190260h4y3.setVm(poiReviewsContentAssem.Lo());
                            c1190260h4y3.setCurrScene(EnumC1189990h4X.REVIEW_LANDING_PAGE);
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            int i3 = poiReviewsContentAssem.LLJLIL;
                            marginLayoutParams.leftMargin = i3;
                            marginLayoutParams.rightMargin = i3;
                            marginLayoutParams.bottomMargin = i3 * 2;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1190260h4y3);
                            c1190260h4y3.setLayoutParams(marginLayoutParams);
                            c1190260h4y3.LIZ(poiReviewTagModel);
                        }
                        C425980Gn6 c425980Gn62 = poiReviewsContentAssem.LLJJIJIIJIL;
                        if (c425980Gn62 != null) {
                            c425980Gn62.addView(c1190260h4y3);
                        }
                    }
                }
                C425980Gn6 c425980Gn63 = ((PoiReviewsContentAssem) awS454S0200000_18.l0).LLJJIJIIJIL;
                if (c425980Gn63 != null) {
                    View view = (View) awS454S0200000_18.l1;
                    c425980Gn63.LLJI = view;
                    c425980Gn63.addView(view);
                }
                ((PoiReviewsContentAssem) awS454S0200000_18.l0).LLJL = false;
            } else {
                for (PoiReviewsApi.PoiReviewTagModel poiReviewTagModel2 : list) {
                    C425980Gn6 c425980Gn64 = poiReviewsContentAssem.LLJJIJIIJIL;
                    if (c425980Gn64 != null) {
                        Iterator<View> it2 = new C09RD(c425980Gn64).iterator();
                        while (true) {
                            C09RE c09re = (C09RE) it2;
                            if (c09re.hasNext()) {
                                View view2 = (View) c09re.next();
                                boolean z = view2 instanceof C1190260h4y;
                                if (z && (c1190260h4y2 = (C1190260h4y) view2) != null) {
                                    tagId = c1190260h4y2.getTagId();
                                } else {
                                    tagId = null;
                                }
                                if (poiReviewTagModel2 != null) {
                                    tagId2 = poiReviewTagModel2.getTagId();
                                } else {
                                    tagId2 = null;
                                }
                                if (Intrinsics.LJFF(tagId, tagId2) && z && (c1190260h4y = (C1190260h4y) view2) != null && poiReviewTagModel2 != null) {
                                    c1190260h4y.LIZ(poiReviewTagModel2);
                                }
                            }
                        }
                    }
                }
            }
            PoiReviewsContentAssem poiReviewsContentAssem2 = (PoiReviewsContentAssem) awS454S0200000_18.l0;
            C425980Gn6 c425980Gn65 = poiReviewsContentAssem2.LLJJIJIIJIL;
            if (c425980Gn65 != null) {
                c425980Gn65.setChildHiddenCallback(new AwS597S0100000_18(poiReviewsContentAssem2, 802));
            }
        } else {
            C425980Gn6 c425980Gn66 = ((PoiReviewsContentAssem) awS454S0200000_18.l0).LLJJIJIIJIL;
            if (c425980Gn66 != null) {
                int visibility2 = c425980Gn66.getVisibility();
                c425980Gn66.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c425980Gn66);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        uIAssem.withState(((CollectionListStateAssem) awS454S0200000_18.l0).Go(), new AwS38S0310000_18(uIAssem, (CollectionListStateAssem) awS454S0200000_18.l0, (C1749280vcc) awS454S0200000_18.l1, ((Boolean) obj2).booleanValue(), 0));
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        String str = ((C1169380gXI) awS454S0200000_18.l0).LLILZ;
        c1169160gWw.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "profile_banner");
        C20684815ws.LJIILLIIL("start_first_playlist", c2344009Gk.LIZ);
        C1169380gXI c1169380gXI = (C1169380gXI) awS454S0200000_18.l0;
        Context context = ((View) awS454S0200000_18.l1).getContext();
        c1169380gXI.getClass();
        ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIIJ(context, new Bundle(), 1, c1169380gXI.LLILZ, "profile_banner");
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        C1178140glQ c1178140glQ = (C1178140glQ) awS454S0200000_18.l0;
        c1178140glQ.LIZ = (Bitmap) obj2;
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        c1178140glQ.LJ = fFloatValue;
        c1178140glQ.LIZLLL = fFloatValue2;
        c1178140glQ.LJFF = ((C1178080glK) awS454S0200000_18.l1).LIZ().floatValue();
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        C2205251BSp c2205251BSpLIZLLL = ((InterfaceC1177040gje) awS454S0200000_18.l0).LIZLLL((Bitmap) obj2);
        c2205251BSpLIZLLL.LJ(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
        c2205251BSpLIZLLL.LIZIZ(((C1178080glK) awS454S0200000_18.l1).LIZ().floatValue());
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        String poiId = ((PoiDetailWriteReviewButtonAssem) awS454S0200000_18.l0).kp().getPoiId();
        String str = "";
        if (poiId == null) {
            poiId = "";
        }
        String strLIZIZ = ((PoiDetailWriteReviewButtonAssem) awS454S0200000_18.l0).kp().LIZIZ();
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        String strLIZJ = ((PoiDetailWriteReviewButtonAssem) awS454S0200000_18.l0).kp().LIZJ();
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        String strLJ = ((PoiDetailWriteReviewButtonAssem) awS454S0200000_18.l0).kp().LJ();
        if (strLJ == null) {
            strLJ = "";
        }
        String strLJIIJJI = ((PoiDetailWriteReviewButtonAssem) awS454S0200000_18.l0).kp().LJIIJJI();
        if (strLJIIJJI != null) {
            str = strLJIIJJI;
        }
        String poiId2 = ((PoiDetailWriteReviewButtonAssem) awS454S0200000_18.l0).kp().getPoiId();
        String fromGroupId = null;
        String strLJ2 = C2365509Or.LJ(C1ER1.LIZIZ.LJJIJIIJIL(null));
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS454S0200000_18.l1).getCollectInfo();
        C1188440h22 c1188440h22LJIIIZ = ((PoiDetailWriteReviewButtonAssem) awS454S0200000_18.l0).kp().LJIIIZ();
        if (c1188440h22LJIIIZ != null) {
            fromGroupId = c1188440h22LJIIIZ.getFromGroupId();
        }
        C1191160h6Q.LJIJJLI(c1191160h6Q, poiId, strLIZIZ, strLIZJ, strLJ, str, strLJ2, "poi_detail", "bottom_bar", poiId2, collectInfo, "general", null, null, null, fromGroupId, C1558520qew.LJIIL((PoiDetailWriteReviewButtonAssem) awS454S0200000_18.l0), null, PageFinder.via(C724240Sb0.LJI((PoiDetailWriteReviewButtonAssem) awS454S0200000_18.l0)), null, 342016);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailWriteReviewButtonAssem) awS454S0200000_18.l0);
        PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI((PoiDetailWriteReviewButtonAssem) awS454S0200000_18.l0));
        c1191160h6Q.getClass();
        C1191160h6Q.LJJIIJ(pageFinderVia, interfaceC665370Q7zLJIIL, null, "general");
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        String str;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailTravelHeaderAssemV2) awS454S0200000_18.l0);
        PageFinder pageFinderZo = ((PoiDetailTravelHeaderAssemV2) awS454S0200000_18.l0).Zo();
        C1184710gw1 c1184710gw1 = ((PoiDetailTravelHeaderAssemV2) awS454S0200000_18.l0).LLJJJJLIIL;
        c1185430gxB.getClass();
        C1185430gxB.LJJLIIIJLJLI(pageFinderZo, interfaceC665370Q7zLJIIL, c1184710gw1);
        String str2 = ((PoiDetailTravelHeaderAssemV2) awS454S0200000_18.l0).cp().LL;
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS454S0200000_18.l1).getCollectInfo();
        C1184460gvc c1184460gvcOo = ((PoiDetailTravelHeaderAssemV2) awS454S0200000_18.l0).Oo();
        String str3 = null;
        if (c1184460gvcOo != null && (c1184480gve2 = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve2.LLILLJJLI;
        } else {
            str = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailTravelHeaderAssemV2) awS454S0200000_18.l0).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
            str3 = c1184480gve.LL;
        }
        C1185430gxB.LJJJLZIJ(str2, collectInfo, str, str3, ((PoiDetailTravelHeaderAssemV2) awS454S0200000_18.l0).Zo(), ((PoiDetailTravelHeaderAssemV2) awS454S0200000_18.l0).LLJJJJLIIL);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        C1174900ggC c1174900ggC = ((PoiDetailChartsV3PageCardReusedAssem) awS454S0200000_18.l0).LLJLIL;
        if (c1174900ggC != null) {
            C1174890ggB.LIZ("ttls_viewall_show", (C1195630hDd) awS454S0200000_18.l1, c1174900ggC);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        long jLongValue = ((Number) obj2).longValue();
        EditPlaylistHeaderCell editPlaylistHeaderCell = (EditPlaylistHeaderCell) awS454S0200000_18.l0;
        TuxTextView tuxTextView = editPlaylistHeaderCell.LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setText(editPlaylistHeaderCell.itemView.getContext().getResources().getQuantityString(2131755471, (int) jLongValue, Long.valueOf(jLongValue)));
        }
        ((C1168020gV6) awS454S0200000_18.l1).LLILZIL = (int) jLongValue;
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        String str = (String) obj2;
        if (str == null) {
            str = "";
        }
        EditPlaylistHeaderCell editPlaylistHeaderCell = (EditPlaylistHeaderCell) awS454S0200000_18.l0;
        C1168020gV6 c1168020gV6 = (C1168020gV6) awS454S0200000_18.l1;
        TuxTextView tuxTextView = editPlaylistHeaderCell.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        c1168020gV6.LLILZ = str;
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        C1168020gV6 c1168020gV6 = (C1168020gV6) awS454S0200000_18.l0;
        c1168020gV6.LLIZ = iIntValue;
        ((EditPlaylistHeaderCell) awS454S0200000_18.l1).I5(c1168020gV6);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        ((UIAssem) obj).withState(((CollaborativeCollectionListStateAssem) awS454S0200000_18.l0).Go(), new AwS70S0210000_18((CollaborativeCollectionListStateAssem) awS454S0200000_18.l0, (C1749280vcc) awS454S0200000_18.l1, ((Boolean) obj2).booleanValue(), 0));
        return Unit.LIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$5(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        C1749280vcc c1749280vcc;
        String str = (String) ((C291001Au) obj2).LIZ;
        switch (str.hashCode()) {
            case -1651464874:
                if (str.equals("Network Error")) {
                    PlaylistChoosePanelStatusViewAssem playlistChoosePanelStatusViewAssem = (PlaylistChoosePanelStatusViewAssem) awS454S0200000_18.l0;
                    playlistChoosePanelStatusViewAssem.LLJ = true;
                    C1749280vcc c1749280vcc2 = playlistChoosePanelStatusViewAssem.LLJI;
                    if (c1749280vcc2 != null) {
                        C786410Ut5.LLLZLZ(c1749280vcc2, 0);
                    }
                    PlaylistChoosePanelStatusViewAssem playlistChoosePanelStatusViewAssem2 = (PlaylistChoosePanelStatusViewAssem) awS454S0200000_18.l0;
                    Context context = ((View) awS454S0200000_18.l1).getContext();
                    playlistChoosePanelStatusViewAssem2.getClass();
                    Pair<String, String> pairLIZ = C1626990sRN.LIZ(context);
                    if (playlistChoosePanelStatusViewAssem2.LLJIJIL == null) {
                        playlistChoosePanelStatusViewAssem2.LLJIJIL = new C20509915Nh(new AwS562S0100000_18(playlistChoosePanelStatusViewAssem2, 2716), new AwS562S0100000_18(playlistChoosePanelStatusViewAssem2, 2717), true);
                    }
                    C20509915Nh c20509915Nh = playlistChoosePanelStatusViewAssem2.LLJIJIL;
                    if (c20509915Nh != null) {
                        c20509915Nh.LIZ();
                    }
                    C1749280vcc c1749280vcc3 = playlistChoosePanelStatusViewAssem2.LLJI;
                    if (c1749280vcc3 != null) {
                        C1722300uv6 c1722300uv6 = new C1722300uv6();
                        String first = pairLIZ.getFirst();
                        String second = pairLIZ.getSecond();
                        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(playlistChoosePanelStatusViewAssem2, 2718);
                        Double dValueOf = Double.valueOf(72.0d);
                        C1893080zMY.LIZJ(c1722300uv6, first, second, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), R.raw.icon_large_refresh, awS562S0100000_18);
                        c1749280vcc3.setStatus(c1722300uv6);
                    }
                }
                break;
            case -1297169625:
                if (str.equals("Something Went Wrong")) {
                    PlaylistChoosePanelStatusViewAssem playlistChoosePanelStatusViewAssem3 = (PlaylistChoosePanelStatusViewAssem) awS454S0200000_18.l0;
                    playlistChoosePanelStatusViewAssem3.LLJ = false;
                    C1749280vcc c1749280vcc4 = playlistChoosePanelStatusViewAssem3.LLJI;
                    if (c1749280vcc4 != null) {
                        C786410Ut5.LLLZLZ(c1749280vcc4, 0);
                    }
                    C1749280vcc c1749280vcc5 = ((PlaylistChoosePanelStatusViewAssem) awS454S0200000_18.l0).LLJI;
                    if (c1749280vcc5 != null) {
                        C1722300uv6 c1722300uv62 = new C1722300uv6();
                        C1893080zMY.LJFF(c1722300uv62, new AwS562S0100000_18((PlaylistChoosePanelStatusViewAssem) awS454S0200000_18.l0, 441));
                        c1749280vcc5.setStatus(c1722300uv62);
                    }
                }
                break;
            case -958641558:
                if (str.equals("Dismiss") && (c1749280vcc = ((PlaylistChoosePanelStatusViewAssem) awS454S0200000_18.l0).LLJI) != null) {
                    C786410Ut5.LLLZLZ(c1749280vcc, 8);
                }
                break;
            case 874951633:
                if (str.equals("Empty List")) {
                    PlaylistChoosePanelStatusViewAssem playlistChoosePanelStatusViewAssem4 = (PlaylistChoosePanelStatusViewAssem) awS454S0200000_18.l0;
                    playlistChoosePanelStatusViewAssem4.LLJ = false;
                    C1749280vcc c1749280vcc6 = playlistChoosePanelStatusViewAssem4.LLJI;
                    if (c1749280vcc6 != null) {
                        C786410Ut5.LLLZLZ(c1749280vcc6, 0);
                    }
                    PlaylistChoosePanelStatusViewAssem playlistChoosePanelStatusViewAssem5 = (PlaylistChoosePanelStatusViewAssem) awS454S0200000_18.l0;
                    C1749280vcc c1749280vcc7 = playlistChoosePanelStatusViewAssem5.LLJI;
                    if (c1749280vcc7 != null) {
                        c1749280vcc7.setStatus((C1722300uv6) playlistChoosePanelStatusViewAssem5.LLJILJILJ.getValue());
                    }
                    C1749280vcc c1749280vcc8 = ((PlaylistChoosePanelStatusViewAssem) awS454S0200000_18.l0).LLJI;
                    if (c1749280vcc8 != null) {
                        c1749280vcc8.setTopMargin(C418440Gaw.LIZIZ(86));
                    }
                }
                break;
            case 2001303836:
                if (str.equals("Loading")) {
                    PlaylistChoosePanelStatusViewAssem playlistChoosePanelStatusViewAssem6 = (PlaylistChoosePanelStatusViewAssem) awS454S0200000_18.l0;
                    playlistChoosePanelStatusViewAssem6.LLJ = false;
                    C1749280vcc c1749280vcc9 = playlistChoosePanelStatusViewAssem6.LLJI;
                    if (c1749280vcc9 != null) {
                        C786410Ut5.LLLZLZ(c1749280vcc9, 0);
                    }
                    C1749280vcc c1749280vcc10 = ((PlaylistChoosePanelStatusViewAssem) awS454S0200000_18.l0).LLJI;
                    if (c1749280vcc10 != null) {
                        c1749280vcc10.LJ();
                    }
                }
                break;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        if (((Boolean) ((C291001Au) obj2).LIZ).booleanValue()) {
            uIAssem.withState(((MixFeedManagerAssem) awS454S0200000_18.l0).Ho(), new AwS384S0200000_18((MixFeedManagerAssem) awS454S0200000_18.l0, (C1749280vcc) awS454S0200000_18.l1, 63));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$7(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        String strValueOf;
        String strValueOf2;
        String str;
        double dDoubleValue = ((Number) obj).doubleValue();
        double dDoubleValue2 = ((Number) obj2).doubleValue();
        InterfaceC1197930hHL interfaceC1197930hHL = (InterfaceC1197930hHL) C1252710ihh.LJI((PoiCreatedEntranceAssem) awS454S0200000_18.l0, C13LE.LIZ(InterfaceC1197930hHL.class), null);
        if (interfaceC1197930hHL != null) {
            interfaceC1197930hHL.Eb(false);
        }
        C1194630hC1 c1194630hC1 = C1194630hC1.LIZ;
        Context context = ((View) awS454S0200000_18.l1).getContext();
        String str2 = ((C1197490hGd) ((PoiCreatedEntranceAssem) awS454S0200000_18.l0).hp().getState()).LL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String strEncode = Uri.encode(str2);
        if (dDoubleValue == 0.0d) {
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(dDoubleValue);
        }
        if (dDoubleValue2 == 0.0d) {
            strValueOf2 = "";
        } else {
            strValueOf2 = String.valueOf(dDoubleValue2);
        }
        PoiMobParam poiMobParam = ((PoiCreatedEntranceAssem) awS454S0200000_18.l0).hp().LLJJJJJIL;
        if (poiMobParam != null && (str = poiMobParam.creationId) != null) {
            str3 = str;
        }
        c1194630hC1.getClass();
        C1194630hC1.LIZ(context, strEncode, strValueOf, strValueOf2, str3);
        C1192400h8Q c1192400h8Q = C1192400h8Q.LIZ;
        PageFinder pageFinderVia = PageFinder.via(((PoiCreatedEntranceAssem) awS454S0200000_18.l0).getContentView());
        String str4 = ((C1197490hGd) ((PoiCreatedEntranceAssem) awS454S0200000_18.l0).hp().getState()).LL;
        PoiMobParam poiMobParam2 = ((PoiCreatedEntranceAssem) awS454S0200000_18.l0).hp().LLJJJJJIL;
        c1192400h8Q.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1189060h32.LJIJI(linkedHashMap, "key_word", str4);
        C1199610hK3.LIZ(linkedHashMap, poiMobParam2);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("create_poi_entrance_click", linkedHashMap, c1185050gwZ);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem = (PoiDetailFoodHeaderAssem) awS454S0200000_18.l0;
        PoiListApi.PoiDetailResponse poiDetailResponse = poiDetailFoodHeaderAssem.LLJJI;
        PoiListApi.PoiDetailResponse poiDetailResponse2 = (PoiListApi.PoiDetailResponse) awS454S0200000_18.l1;
        poiDetailFoodHeaderAssem.vq(poiDetailResponse, poiDetailResponse2, "poi_pic", AFwS206S0000000_18.get$arr$(315), new AwS384S0200000_18(poiDetailFoodHeaderAssem, poiDetailResponse2, 91));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS454S0200000_18 awS454S0200000_18, Object obj, Object obj2) {
        String str;
        String str2;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str3 = ((PoiDetailHeaderAssem) awS454S0200000_18.l0).cp().LL;
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS454S0200000_18.l1).getCollectInfo();
        C1184460gvc c1184460gvcOo = ((PoiDetailHeaderAssem) awS454S0200000_18.l0).Oo();
        if (c1184460gvcOo != null && (c1184480gve2 = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve2.LLILLJJLI;
        } else {
            str = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailHeaderAssem) awS454S0200000_18.l0).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
            str2 = c1184480gve.LL;
        } else {
            str2 = null;
        }
        PageFinder pageFinderZo = ((PoiDetailHeaderAssem) awS454S0200000_18.l0).Zo();
        c1185430gxB.getClass();
        C1185430gxB.LJJJLZIJ(str3, collectInfo, str, str2, pageFinderZo, null);
        C1185430gxB.LJJLIIIJLJLI(((PoiDetailHeaderAssem) awS454S0200000_18.l0).Zo(), C1558520qew.LJIIL((PoiDetailHeaderAssem) awS454S0200000_18.l0), null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(C1169380gXI c1169380gXI, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1169380gXI;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(C1178140glQ c1178140glQ, C1178080glK c1178080glK, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1178140glQ;
        this.l1 = c1178080glK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(C1186260gyW c1186260gyW, PoiGalleryCell poiGalleryCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1186260gyW;
        this.l1 = poiGalleryCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(C1190320h54 c1190320h54, PoiReviewsApi.PoiReviewTagModel poiReviewTagModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1190320h54;
        this.l1 = poiReviewTagModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(C1190370h59 c1190370h59, PoiReviewsApi.PoiReviewTagModel poiReviewTagModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1190370h59;
        this.l1 = poiReviewTagModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(C1749280vcc c1749280vcc, PoiReviewsStatusAssem poiReviewsStatusAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1749280vcc;
        this.l1 = poiReviewsStatusAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(C1749280vcc c1749280vcc, PoiCommentReviewStatusAssem poiCommentReviewStatusAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiCommentReviewStatusAssem;
        this.l1 = c1749280vcc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD, PoiRecommendDishesDetailFragment poiRecommendDishesDetailFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC20631115oD;
        this.l1 = poiRecommendDishesDetailFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD, PoiDishesGalleryFragment poiDishesGalleryFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC20631115oD;
        this.l1 = poiDishesGalleryFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(C2205251BSp c2205251BSp, C1178080glK c1178080glK, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2205251BSp;
        this.l1 = c1178080glK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(Context context, C1185600gxS c1185600gxS, int i) {
        super(2);
        this.$t = i;
        this.l0 = context;
        this.l1 = c1185600gxS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(View view, AvatarAndNicknamePopup avatarAndNicknamePopup, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = avatarAndNicknamePopup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(UIAssem uIAssem, PoiReviewsContainerAssem poiReviewsContainerAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = uIAssem;
        this.l1 = poiReviewsContainerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(JumpLynxPageResult jumpLynxPageResult, StoreOverlayAssem storeOverlayAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = jumpLynxPageResult;
        this.l1 = storeOverlayAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(StoreSkeletonAssem storeSkeletonAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = storeSkeletonAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(CollectionListStateAssem collectionListStateAssem, C1749280vcc c1749280vcc, int i) {
        super(2);
        this.$t = i;
        this.l0 = collectionListStateAssem;
        this.l1 = c1749280vcc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(CollaborativeCollectionListStateAssem collaborativeCollectionListStateAssem, C1749280vcc c1749280vcc, int i) {
        super(2);
        this.$t = i;
        this.l0 = collaborativeCollectionListStateAssem;
        this.l1 = c1749280vcc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(PlaylistChoosePanelStatusViewAssem playlistChoosePanelStatusViewAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = playlistChoosePanelStatusViewAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(MixFeedManagerAssem mixFeedManagerAssem, C1749280vcc c1749280vcc, int i) {
        super(2);
        this.$t = i;
        this.l0 = mixFeedManagerAssem;
        this.l1 = c1749280vcc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(PoiCreatedEntranceAssem poiCreatedEntranceAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiCreatedEntranceAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(PoiDetailHeaderAssem poiDetailHeaderAssem, PoiListApi.PoiDetailResponse poiDetailResponse, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiDetailHeaderAssem;
        this.l1 = poiDetailResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem, PoiListApi.PoiDetailResponse poiDetailResponse, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiDetailFoodHeaderAssem;
        this.l1 = poiDetailResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(PoiHeaderTopVideosAssem poiHeaderTopVideosAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiHeaderTopVideosAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(PoiHeaderTopVideosViewMoreCell poiHeaderTopVideosViewMoreCell, C20248814Kw c20248814Kw, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiHeaderTopVideosViewMoreCell;
        this.l1 = c20248814Kw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(PoiDetailTravelHeaderAssemV2 poiDetailTravelHeaderAssemV2, PoiListApi.PoiDetailResponse poiDetailResponse, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiDetailTravelHeaderAssemV2;
        this.l1 = poiDetailResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(PoiDetailChartsV3PageCardReusedAssem poiDetailChartsV3PageCardReusedAssem, C1195630hDd c1195630hDd, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiDetailChartsV3PageCardReusedAssem;
        this.l1 = c1195630hDd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(PoiDetailReviewsAssem poiDetailReviewsAssem, C1195630hDd c1195630hDd, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiDetailReviewsAssem;
        this.l1 = c1195630hDd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(PoiDetailWriteReviewButtonAssem poiDetailWriteReviewButtonAssem, PoiListApi.PoiDetailResponse poiDetailResponse, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiDetailWriteReviewButtonAssem;
        this.l1 = poiDetailResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(PoiMapDetailMapAssem poiMapDetailMapAssem, C013C c013c, int i) {
        super(2);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = poiMapDetailMapAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(PoiReviewsApi.PoiReviewTagModel poiReviewTagModel, C1190260h4y c1190260h4y, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1190260h4y;
        this.l1 = poiReviewTagModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(PoiReviewsContainerAssem poiReviewsContainerAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiReviewsContainerAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(PoiReviewsContentAssem poiReviewsContentAssem, C1190260h4y c1190260h4y, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiReviewsContentAssem;
        this.l1 = c1190260h4y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS454S0200000_18(NearbyRegionListFragment nearbyRegionListFragment, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = nearbyRegionListFragment;
        this.l1 = view;
    }
}
