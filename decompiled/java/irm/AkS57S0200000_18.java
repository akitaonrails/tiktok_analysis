package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C098200Yq;
import X.C0LAB;
import X.C0XPD;
import X.C1153950g8P;
import X.C1157000gDK;
import X.C1157210gDf;
import X.C1158280gFO;
import X.C1166810gT9;
import X.C1168020gV6;
import X.C1168030gV7;
import X.C1169160gWw;
import X.C1171080ga2;
import X.C1172330gc3;
import X.C1172390gc9;
import X.C1172580gcS;
import X.C1173300gdc;
import X.C1173560ge2;
import X.C1173750geL;
import X.C1173900gea;
import X.C1174170gf1;
import X.C1174180gf2;
import X.C1174830gg5;
import X.C1175120ggY;
import X.C1175600ghK;
import X.C1175660ghQ;
import X.C1175680ghS;
import X.C1180880gpq;
import X.C1182380gsG;
import X.C1182410gsJ;
import X.C1182540gsW;
import X.C1184630gvt;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1185600gxS;
import X.C1186580gz2;
import X.C1186590gz3;
import X.C1188440h22;
import X.C1189060h32;
import X.C1191160h6Q;
import X.C1191360h6k;
import X.C1192650h8p;
import X.C1193160h9e;
import X.C1193350h9x;
import X.C1195630hDd;
import X.C1198080hHa;
import X.C1200050hKl;
import X.C1200090hKp;
import X.C1200530hLX;
import X.C1200540hLY;
import X.C1200560hLa;
import X.C1200780hLw;
import X.C1202300hOO;
import X.C1205490hTX;
import X.C1208950hZ7;
import X.C1209100hZM;
import X.C123100dR;
import X.C1257300ip6;
import X.C13LP;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1548420qOe;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1841350y17;
import X.C189200o6;
import X.C18JG;
import X.C19M4;
import X.C1EMR;
import X.C1ER1;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2365509Or;
import X.C291001Au;
import X.C418440Gaw;
import X.C614900O9w;
import X.C631370Opb;
import X.C724240Sb0;
import X.C726800Sf8;
import X.C814420VxA;
import X.C848230XPh;
import X.EnumC1173740geK;
import X.EnumC1184160gv8;
import X.EnumC1186570gz1;
import X.EnumC1189990h4X;
import X.EnumC1198680hIY;
import X.InterfaceC1181010gq3;
import X.InterfaceC1191710h7J;
import X.InterfaceC1192660h8q;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistCell;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistHeaderCell;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistViewModel;
import com.ss.android.ugc.aweme.mix.profile.entry.PlayListShowAllCell;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.viewallplaylist.ViewAllPlaylistFragmentArg;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.PoiRevisitBannerRelatedResponse;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumViewModel;
import com.ss.android.ugc.aweme.poi.album.cell.PoiAlbumLargeImageCell;
import com.ss.android.ugc.aweme.poi.album.cell.PoiAlbumMediumImageCell;
import com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimListAssemAbility;
import com.ss.android.ugc.aweme.poi.claim.view.PoiClaimListCellAssem;
import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsData;
import com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.AddLocationVideoCellAssem;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsMainElementsAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.dynamicbutton.PoiDetailHeaderDynamicButtonAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData;
import com.ss.android.ugc.aweme.poi.detail.charts.IPoiDetailChartsAbility;
import com.ss.android.ugc.aweme.poi.detail.chartv3.poilist.bigcard.PoiDetailChartsV3BigCardReusedAssem;
import com.ss.android.ugc.aweme.poi.detail.chartv3.poilist.smallcard.PoiDetailChartsV3SmallCardReusedAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.background.map.PoiBackgroundMapAssem;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamicscroll.PoiScrollBottomBarComponent;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.rectangle.PoiRectangleBottomBarComponent;
import com.ss.android.ugc.aweme.poi.detail.container.dynamicbutton.IDynamicButtonClickAbility;
import com.ss.android.ugc.aweme.poi.detail.container.model.ClickEvent;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.assem.NavBarRightButtonsAssem;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponse;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponseV2;
import com.ss.android.ugc.aweme.poi.detail.dishes.IRecommendDishesNoPicAbility;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesVM;
import com.ss.android.ugc.aweme.poi.detail.dishes.RecommendDishesNoPicCell;
import com.ss.android.ugc.aweme.poi.detail.dishes.gallery.PoiRecommendDishesGalleryAssem;
import com.ss.android.ugc.aweme.poi.detail.map.PoiBackgroundMapComponent;
import com.ss.android.ugc.aweme.poi.detail.reviews.HandleMoreButtonClickAbility;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailWriteReviewButtonAssem;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiReviewReadEntranceAssem;
import com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailCommonHorizontalCardAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.horizontal.PoiMapDetailHorizontalCardReusedAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeEnterMethod;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitSlashFragment;
import com.ss.android.ugc.aweme.poi.osp.repo.model.PriceItem;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsFoldedReviewCell;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.archive2.calendar.StoryArchiveV2DayCell;
import com.ss.android.ugc.aweme.story.archive2.list.StoryArchiveV2ListStoryCell;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS102S0201000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class AkS57S0200000_18 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            case 23:
                LIZ$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, view);
                break;
            case 25:
                LIZ$25(this, view);
                break;
            case 26:
                LIZ$26(this, view);
                break;
            case 27:
                LIZ$27(this, view);
                break;
            case 28:
                LIZ$28(this, view);
                break;
            case 29:
                LIZ$29(this, view);
                break;
            case 30:
                LIZ$30(this, view);
                break;
            case 31:
                LIZ$31(this, view);
                break;
            case 32:
                LIZ$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                LIZ$33(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                LIZ$34(this, view);
                break;
            case 35:
                LIZ$35(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                LIZ$36(this, view);
                break;
            case 37:
                LIZ$37(this, view);
                break;
            case 38:
                LIZ$38(this, view);
                break;
            case 39:
                LIZ$39(this, view);
                break;
            case 40:
                LIZ$40(this, view);
                break;
            case 41:
                LIZ$41(this, view);
                break;
            case 42:
                LIZ$42(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS57S0200000_18 akS57S0200000_18, View view) {
        IDynamicButtonClickAbility iDynamicButtonClickAbility;
        List<ClickEvent> list = ((PoiButton) akS57S0200000_18.l0).clickEvent;
        if (list != null) {
            for (ClickEvent clickEvent : list) {
                Fragment fragmentLJI = C724240Sb0.LJI((PoiDetailHeaderDynamicButtonAssem) akS57S0200000_18.l1);
                if (fragmentLJI != null && (iDynamicButtonClickAbility = (IDynamicButtonClickAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IDynamicButtonClickAbility.class, null)) != null) {
                    iDynamicButtonClickAbility.dg2(clickEvent.actionType, EnumC1184160gv8.POI_HEADER, clickEvent.params);
                }
            }
        }
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String strMobBtnName = ((PoiButton) akS57S0200000_18.l0).mobBtnName();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailHeaderDynamicButtonAssem) akS57S0200000_18.l1);
        c1185430gxB.getClass();
        C1185430gxB.LJJIIZ(interfaceC665370Q7zLJIIL, strMobBtnName);
    }

    public static final void LIZ$1(AkS57S0200000_18 akS57S0200000_18, View view) {
        List<PoiDiscoveryCard> listLL;
        PoiBackgroundMapAssem poiBackgroundMapAssem = (PoiBackgroundMapAssem) akS57S0200000_18.l0;
        MapModeEnterMethod mapModeEnterMethod = MapModeEnterMethod.CLICK_MAP_OTHER_AREA;
        PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse = (PoiDiscoveryApi$PoiDiscoveryCardListResponse) akS57S0200000_18.l1;
        List<PoiDiscoveryCard> poiList = poiDiscoveryApi$PoiDiscoveryCardListResponse.getPoiList();
        if (poiList != null) {
            listLL = C13LP.LL(poiList, 2);
        } else {
            listLL = null;
        }
        poiBackgroundMapAssem.tp(null, mapModeEnterMethod, poiDiscoveryApi$PoiDiscoveryCardListResponse, listLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$10(irm.AkS57S0200000_18 r13, android.view.View r14) {
        /*
            java.lang.Object r0 = r13.l0
            com.ss.android.ugc.aweme.poi.detail.basicinfo.header.new.PoiHeaderGalleryCell r0 = (com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiHeaderGalleryCell) r0
            androidx.fragment.app.Fragment r0 = X.C1189060h32.LJIIJ(r0)
            r12 = 0
            if (r0 == 0) goto L2a
            X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r12)
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.basicinfo.header.new.IHeaderGalleryAbility> r0 = com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.IHeaderGalleryAbility.class
            X.01wD r3 = X.C1558520qew.LIZ(r1, r0, r12)
            com.ss.android.ugc.aweme.poi.detail.basicinfo.header.new.IHeaderGalleryAbility r3 = (com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.IHeaderGalleryAbility) r3
            if (r3 == 0) goto L2a
            java.lang.Object r0 = r13.l0
            com.ss.android.ugc.aweme.poi.detail.basicinfo.header.new.PoiHeaderGalleryCell r0 = (com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiHeaderGalleryCell) r0
            com.bytedance.lighten.loader.SmartImageView r2 = r0.LL
            java.lang.Object r0 = r13.l1
            X.0gy7 r0 = (X.C1186010gy7) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.LL
            java.lang.String r0 = "click_top_pic"
            r3.Vp2(r0, r2, r1)
        L2a:
            X.0h08 r2 = X.C1187260h08.LIZ
            r3 = 0
            java.lang.String r5 = "240"
            java.lang.Object r0 = r13.l0
            com.ss.android.ugc.aweme.poi.detail.basicinfo.header.new.PoiHeaderGalleryCell r0 = (com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiHeaderGalleryCell) r0
            int r0 = r0.getBindingAdapterPosition()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r13.l1
            X.0gy7 r0 = (X.C1186010gy7) r0
            com.ss.android.ugc.aweme.poi.detail.gallery.PoiPicture r0 = r0.LLILLJJLI
            if (r0 == 0) goto L8e
            java.lang.String r7 = r0.picSource
            java.lang.Integer r0 = r0.entityType
            if (r0 == 0) goto L8f
            java.lang.String r8 = r0.toString()
        L4d:
            java.lang.Object r0 = r13.l1
            X.0gy7 r0 = (X.C1186010gy7) r0
            com.ss.android.ugc.aweme.poi.detail.gallery.PoiPicture r0 = r0.LLILLJJLI
            if (r0 == 0) goto L8c
            java.lang.Integer r0 = r0.entityType
            if (r0 == 0) goto L8c
            int r1 = r0.intValue()
            r0 = 5
            if (r1 != r0) goto L8c
            java.lang.Object r0 = r13.l1
            X.0gy7 r0 = (X.C1186010gy7) r0
            com.ss.android.ugc.aweme.poi.detail.gallery.PoiPicture r0 = r0.LLILLJJLI
            java.lang.String r10 = r0.entityId
        L68:
            java.lang.Object r0 = r13.l0
            com.ss.android.ugc.aweme.poi.detail.basicinfo.header.new.PoiHeaderGalleryCell r0 = (com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiHeaderGalleryCell) r0
            androidx.fragment.app.Fragment r0 = X.C1189060h32.LJIIJ(r0)
            if (r0 == 0) goto L76
            X.0Q7z r12 = X.C1558360qeg.LJFF(r0, r12)
        L76:
            java.lang.Object r0 = r13.l0
            com.ss.android.ugc.aweme.poi.detail.basicinfo.header.new.PoiHeaderGalleryCell r0 = (com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiHeaderGalleryCell) r0
            androidx.fragment.app.Fragment r0 = X.C1189060h32.LJIIJ(r0)
            com.bytedance.android.btm.api.model.PageFinder r13 = com.bytedance.android.btm.api.model.PageFinder.via(r0)
            r2.getClass()
            r4 = r3
            r9 = r3
            r11 = r3
            X.C1187260h08.LIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L8c:
            r10 = r12
            goto L68
        L8e:
            r7 = r12
        L8f:
            r8 = r12
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS57S0200000_18.LIZ$10(irm.AkS57S0200000_18, android.view.View):void");
    }

    public static final void LIZ$11(AkS57S0200000_18 akS57S0200000_18, View view) {
        IDynamicButtonClickAbility iDynamicButtonClickAbility;
        List<ClickEvent> list = ((PoiButton) akS57S0200000_18.l0).clickEvent;
        if (list != null) {
            for (ClickEvent clickEvent : list) {
                Fragment fragmentLJI = C724240Sb0.LJI((PoiScrollBottomBarComponent) akS57S0200000_18.l1);
                if (fragmentLJI != null && (iDynamicButtonClickAbility = (IDynamicButtonClickAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IDynamicButtonClickAbility.class, null)) != null) {
                    iDynamicButtonClickAbility.dg2(clickEvent.actionType, EnumC1184160gv8.POI_BOTTOM_BAR, clickEvent.params);
                }
            }
        }
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String strMobBtnName = ((PoiButton) akS57S0200000_18.l0).mobBtnName();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiScrollBottomBarComponent) akS57S0200000_18.l1);
        c1185430gxB.getClass();
        C1185430gxB.LJJII(interfaceC665370Q7zLJIIL, strMobBtnName);
    }

    public static final void LIZ$12(AkS57S0200000_18 akS57S0200000_18, View view) {
        IRecommendDishesNoPicAbility iRecommendDishesNoPicAbility;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((RecommendDishesNoPicCell) akS57S0200000_18.l0);
        if (fragmentLJIIJ != null && (iRecommendDishesNoPicAbility = (IRecommendDishesNoPicAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IRecommendDishesNoPicAbility.class, null)) != null) {
            iRecommendDishesNoPicAbility.h00((PoiDetailApi.RecommendedDish) akS57S0200000_18.l1);
        }
    }

    public static final void LIZ$13(AkS57S0200000_18 akS57S0200000_18, View view) {
        C1193350h9x c1193350h9x = C1193350h9x.LIZ;
        Context context = ((TuxIconView) akS57S0200000_18.l0).getContext();
        PriceItem priceItem = (PriceItem) akS57S0200000_18.l1;
        c1193350h9x.getClass();
        C1193350h9x.LIZ(context, priceItem);
    }

    public static final void LIZ$14(AkS57S0200000_18 akS57S0200000_18, View view) {
        C1193350h9x c1193350h9x = C1193350h9x.LIZ;
        Context context = ((TuxIconView) akS57S0200000_18.l0).getContext();
        PriceItem priceItem = (PriceItem) akS57S0200000_18.l1;
        c1193350h9x.getClass();
        C1193350h9x.LIZ(context, priceItem);
    }

    public static final void LIZ$15(AkS57S0200000_18 akS57S0200000_18, View view) {
        C1193350h9x c1193350h9x = C1193350h9x.LIZ;
        Context context = ((TuxIconView) akS57S0200000_18.l0).getContext();
        PriceItem priceItem = (PriceItem) akS57S0200000_18.l1;
        c1193350h9x.getClass();
        C1193350h9x.LIZ(context, priceItem);
    }

    public static final void LIZ$16(AkS57S0200000_18 akS57S0200000_18, View view) {
        String str;
        Aweme aweme;
        C1157000gDK c1157000gDK = (C1157000gDK) akS57S0200000_18.l0;
        String str2 = c1157000gDK.LLILLJJLI;
        if (str2 != null && (str = c1157000gDK.LLILLL) != null && c1157000gDK.LLILZ && (aweme = ((C1173560ge2) ((AssemViewModel) ((StoryArchiveV2DayCell) akS57S0200000_18.l1).LL.getValue()).getState()).LLILLL.get(str)) != null && !C726800Sf8.LIZ(aweme)) {
            C1173750geL c1173750geL = C1173750geL.LIZ;
            Context context = ((StoryArchiveV2DayCell) akS57S0200000_18.l1).itemView.getContext();
            StoryArchiveV2DayCell storyArchiveV2DayCell = (StoryArchiveV2DayCell) akS57S0200000_18.l1;
            EnumC1173740geK enumC1173740geK = EnumC1173740geK.CALENDAR;
            c1173750geL.getClass();
            C1173750geL.LIZ(context, storyArchiveV2DayCell, enumC1173740geK, str2, str, aweme);
            C1173900gea.LIZ.getClass();
            C20684815ws.LJIILLIIL("story_archive_calendar_item_click", new C0LAB().LIZ);
        }
    }

    public static final void LIZ$17(AkS57S0200000_18 akS57S0200000_18, View view) {
        IDynamicButtonClickAbility iDynamicButtonClickAbility;
        List<ClickEvent> list = ((PoiButton) akS57S0200000_18.l0).clickEvent;
        if (list != null) {
            for (ClickEvent clickEvent : list) {
                Fragment fragmentLJI = C724240Sb0.LJI((PoiRectangleBottomBarComponent) akS57S0200000_18.l1);
                if (fragmentLJI != null && (iDynamicButtonClickAbility = (IDynamicButtonClickAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IDynamicButtonClickAbility.class, null)) != null) {
                    iDynamicButtonClickAbility.dg2(clickEvent.actionType, EnumC1184160gv8.POI_BOTTOM_BAR, clickEvent.params);
                }
            }
        }
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String strMobBtnName = ((PoiButton) akS57S0200000_18.l0).mobBtnName();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiRectangleBottomBarComponent) akS57S0200000_18.l1);
        c1185430gxB.getClass();
        C1185430gxB.LJJII(interfaceC665370Q7zLJIIL, strMobBtnName);
    }

    public static final void LIZ$18(AkS57S0200000_18 akS57S0200000_18, View view) {
        PoiDetailApi.RecommendedDish recommendedDish;
        PoiDetailApi.RecommendedDish recommendedDish2 = ((C1182540gsW) akS57S0200000_18.l0).LL;
        if (recommendedDish2 != null) {
            PoiRecommendDishesGalleryAssem poiRecommendDishesGalleryAssem = (PoiRecommendDishesGalleryAssem) akS57S0200000_18.l1;
            poiRecommendDishesGalleryAssem.getClass();
            String dishId = null;
            if (C848230XPh.LL.LJI()) {
                C291001Au<PoiDetailApi.RecommendedDish> c291001Au = poiRecommendDishesGalleryAssem.sp().getState().LLIZ;
                if (c291001Au != null && c291001Au.LIZ != null) {
                    C291001Au<PoiDetailApi.RecommendedDish> c291001Au2 = poiRecommendDishesGalleryAssem.sp().getState().LLIZ;
                    if (c291001Au2 != null && (recommendedDish = c291001Au2.LIZ) != null) {
                        dishId = recommendedDish.getDishId();
                    }
                    if (Intrinsics.LJFF(dishId, recommendedDish2.getDishId())) {
                        PoiRecommendDishesVM poiRecommendDishesVMSp = poiRecommendDishesGalleryAssem.sp();
                        poiRecommendDishesVMSp.getClass();
                        poiRecommendDishesVMSp.setState(new AwS384S0200000_18(recommendedDish2, poiRecommendDishesVMSp, 185));
                        return;
                    }
                    return;
                }
                poiRecommendDishesGalleryAssem.zp(recommendedDish2);
                return;
            }
            C0XPD.LIZIZ(C724240Sb0.LIZ(poiRecommendDishesGalleryAssem), "poi_detail_recommended_dish_detail", "", null, new C1208950hZ7(poiRecommendDishesGalleryAssem, recommendedDish2, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$19(AkS57S0200000_18 akS57S0200000_18, View view) {
        C1180880gpq c1180880gpq = C1180880gpq.LIZ;
        String str = ((C1198080hHa) ((AddLocationVideoCellAssem) akS57S0200000_18.l0).op().getState()).LLILZLL;
        Integer num = ((C1198080hHa) ((AddLocationVideoCellAssem) akS57S0200000_18.l0).op().getState()).LLILZ;
        Fragment fragmentLJI = C724240Sb0.LJI((AddLocationVideoCellAssem) akS57S0200000_18.l0);
        c1180880gpq.getClass();
        C1180880gpq.LIZIZ(fragmentLJI, num, str, "click_video");
        AddLocationVideoCellAssem addLocationVideoCellAssem = (AddLocationVideoCellAssem) akS57S0200000_18.l0;
        String aid = ((C1158280gFO) akS57S0200000_18.l1).LLILLL.getAid();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(addLocationVideoCellAssem.getContext(), "//aweme/detail");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aid);
        smartRouteBuildRoute.open();
    }

    public static final void LIZ$2(AkS57S0200000_18 akS57S0200000_18, View view) {
        ((PoiBackgroundMapAssem) akS57S0200000_18.l0).tp(null, MapModeEnterMethod.CLICK_MAP_POI_MARKER, (PoiDiscoveryApi$PoiDiscoveryCardListResponse) akS57S0200000_18.l1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$20(AkS57S0200000_18 akS57S0200000_18, View view) {
        String str;
        AddLocationVideoCellAssem addLocationVideoCellAssem = (AddLocationVideoCellAssem) akS57S0200000_18.l0;
        if (addLocationVideoCellAssem.LLJZIJLIL) {
            C1180880gpq c1180880gpq = C1180880gpq.LIZ;
            String str2 = ((C1198080hHa) addLocationVideoCellAssem.op().getState()).LLILZLL;
            Integer num = ((C1198080hHa) ((AddLocationVideoCellAssem) akS57S0200000_18.l0).op().getState()).LLILZ;
            Fragment fragmentLJI = C724240Sb0.LJI((AddLocationVideoCellAssem) akS57S0200000_18.l0);
            c1180880gpq.getClass();
            C1180880gpq.LIZIZ(fragmentLJI, num, str2, "click_add_location");
            AddLocationVideoCellAssem addLocationVideoCellAssem2 = (AddLocationVideoCellAssem) akS57S0200000_18.l0;
            String aid = ((C1158280gFO) akS57S0200000_18.l1).LLILLL.getAid();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(addLocationVideoCellAssem2.getContext(), "//poi/search");
            smartRouteBuildRoute.withParam("page_scene", EnumC1198680hIY.ACTIVITY_RETAG);
            smartRouteBuildRoute.withParam("aid", aid);
            smartRouteBuildRoute.withParam("poi_mob_param", new PoiMobParam(null, null, null, null, "my_year_campaign_location_add_page", null, null, "", false, 0, null, null, null, null));
            smartRouteBuildRoute.withParam("show_banner", false);
            smartRouteBuildRoute.open();
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from", "my_year_campaign_location_add_page");
            Integer num2 = ((C1198080hHa) addLocationVideoCellAssem2.op().getState()).LLILZ;
            if (num2 != null && num2.intValue() == 1) {
                str = "my_year_campaign_new_user";
            } else {
                str = "my_year_campaign_old_user";
            }
            linkedHashMap.put("shoot_way", str);
            C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(addLocationVideoCellAssem2));
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ("enter_poi_search", linkedHashMap, c1185050gwZ);
        }
    }

    public static final void LIZ$21(AkS57S0200000_18 akS57S0200000_18, View view) {
        HandleMoreButtonClickAbility handleMoreButtonClickAbility;
        PoiReviewsApi.PoiReviewModel item = ((PoiReviewsFoldedReviewCell) akS57S0200000_18.l0).getItem();
        if (item != null && C1191360h6k.LIZ() && item.getScene() == EnumC1189990h4X.POI_DETAIL_PAGE && (handleMoreButtonClickAbility = (HandleMoreButtonClickAbility) C1558520qew.LIZ(C1558360qeg.LJ((View) akS57S0200000_18.l1, null), HandleMoreButtonClickAbility.class, null)) != null) {
            String reviewId = item.getReviewId();
            if (reviewId == null) {
                reviewId = "";
            }
            handleMoreButtonClickAbility.sf0("click_review_blank", reviewId, null);
        }
    }

    public static final void LIZ$22(AkS57S0200000_18 akS57S0200000_18, View view) {
        InterfaceC1191710h7J interfaceC1191710h7J;
        PoiReviewsApi.PoiReviewModel item = ((PoiReviewsFoldedReviewCell) akS57S0200000_18.l0).getItem();
        if (item != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cell expanded: ");
            sbLIZ.append(((C1202300hOO) akS57S0200000_18.l1).LLJZIJLIL);
            C2188811AlT.LIZIZ(sbLIZ);
            if (item.getScene() == EnumC1189990h4X.POI_DETAIL_PAGE && C1191360h6k.LIZ()) {
                C1202300hOO c1202300hOO = (C1202300hOO) akS57S0200000_18.l1;
                String str = "";
                if (c1202300hOO.LLJZIJLIL) {
                    HandleMoreButtonClickAbility handleMoreButtonClickAbility = (HandleMoreButtonClickAbility) C1558520qew.LIZ(C1558360qeg.LJ(c1202300hOO, null), HandleMoreButtonClickAbility.class, null);
                    if (handleMoreButtonClickAbility != null) {
                        String reviewId = item.getReviewId();
                        if (reviewId != null) {
                            str = reviewId;
                        }
                        handleMoreButtonClickAbility.sf0("click_more", str, null);
                    }
                    ((PoiReviewsFoldedReviewCell) akS57S0200000_18.l0).W5();
                    return;
                }
                HandleMoreButtonClickAbility handleMoreButtonClickAbility2 = (HandleMoreButtonClickAbility) C1558520qew.LIZ(C1558360qeg.LJ(c1202300hOO, null), HandleMoreButtonClickAbility.class, null);
                if (handleMoreButtonClickAbility2 == null) {
                    return;
                }
                String reviewId2 = item.getReviewId();
                if (reviewId2 != null) {
                    str = reviewId2;
                }
                handleMoreButtonClickAbility2.sf0("click_text", str, null);
                return;
            }
            C1202300hOO c1202300hOO2 = (C1202300hOO) akS57S0200000_18.l1;
            if (!c1202300hOO2.LLJZIJLIL) {
                return;
            }
            if (!c1202300hOO2.getExpanded()) {
                ((PoiReviewsFoldedReviewCell) akS57S0200000_18.l0).W5();
            }
            PoiReviewsApi.PoiReviewModel item2 = ((PoiReviewsFoldedReviewCell) akS57S0200000_18.l0).getItem();
            if (item2 == null || (interfaceC1191710h7J = ((PoiReviewsFoldedReviewCell) akS57S0200000_18.l0).LL) == null) {
                return;
            }
            interfaceC1191710h7J.UG1(item2);
        }
    }

    public static final void LIZ$23(AkS57S0200000_18 akS57S0200000_18, View view) {
        Aweme aweme;
        EnumC1173740geK enumC1173740geK;
        if (((C1157210gDf) akS57S0200000_18.l0).LLILLL && (aweme = ((C1173560ge2) ((AssemViewModel) ((StoryArchiveV2ListStoryCell) akS57S0200000_18.l1).LL.getValue()).getState()).LLILLL.get(((C1157210gDf) akS57S0200000_18.l0).LLILLJJLI)) != null && !C726800Sf8.LIZ(aweme)) {
            C1173750geL c1173750geL = C1173750geL.LIZ;
            Context context = ((StoryArchiveV2ListStoryCell) akS57S0200000_18.l1).itemView.getContext();
            StoryArchiveV2ListStoryCell storyArchiveV2ListStoryCell = (StoryArchiveV2ListStoryCell) akS57S0200000_18.l1;
            C1157210gDf c1157210gDf = (C1157210gDf) akS57S0200000_18.l0;
            if (c1157210gDf.LLILZ) {
                enumC1173740geK = EnumC1173740geK.THOUGHT;
            } else {
                enumC1173740geK = EnumC1173740geK.LIST;
            }
            String str = c1157210gDf.LL;
            String str2 = c1157210gDf.LLILLJJLI;
            c1173750geL.getClass();
            C1173750geL.LIZ(context, storyArchiveV2ListStoryCell, enumC1173740geK, str, str2, aweme);
        }
    }

    public static final void LIZ$24(AkS57S0200000_18 akS57S0200000_18, View view) {
        Context context = ((MyMomentsMainElementsAssem) akS57S0200000_18.l0).getContext();
        if (context != null) {
            ((MyMomentsMainElementsAssem) akS57S0200000_18.l0).Ho(true, Boolean.TRUE, (MyMomentsData) akS57S0200000_18.l1, context);
        }
    }

    public static final void LIZ$25(AkS57S0200000_18 akS57S0200000_18, View view) {
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiAlbumLargeImageCell) akS57S0200000_18.l0);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (fragmentLJIIJ != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
        }
        PoiAlbumViewModel poiAlbumViewModelL5 = ((PoiAlbumLargeImageCell) akS57S0200000_18.l0).L5();
        SmartImageView smartImageView = ((PoiAlbumLargeImageCell) akS57S0200000_18.l0).I5().LLILLL;
        C1186580gz2 c1186580gz2 = (C1186580gz2) akS57S0200000_18.l1;
        poiAlbumViewModelL5.vQ2(smartImageView, c1186580gz2.LLILZ, c1186580gz2.LLILZIL, interfaceC665370Q7zLJFF);
        ((PoiAlbumLargeImageCell) akS57S0200000_18.l0).L5().wQ2(PageFinder.via(C1189060h32.LJIIJ((PoiAlbumLargeImageCell) akS57S0200000_18.l0)), interfaceC665370Q7zLJFF, "click");
    }

    public static final void LIZ$26(AkS57S0200000_18 akS57S0200000_18, View view) {
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiAlbumMediumImageCell) akS57S0200000_18.l0);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (fragmentLJIIJ != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
        }
        AssemVMLazy assemVMLazy = ((PoiAlbumMediumImageCell) akS57S0200000_18.l0).LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiAlbumMediumImageCell.LLILLL;
        PoiAlbumViewModel poiAlbumViewModel = (PoiAlbumViewModel) assemVMLazy.getValue();
        SmartImageView smartImageView = ((PoiAlbumMediumImageCell) akS57S0200000_18.l0).I5().LLILLJJLI;
        C1186590gz3 c1186590gz3 = (C1186590gz3) akS57S0200000_18.l1;
        poiAlbumViewModel.vQ2(smartImageView, c1186590gz3.LLILLJJLI, c1186590gz3.LLILLL, interfaceC665370Q7zLJFF);
        ((PoiAlbumViewModel) ((PoiAlbumMediumImageCell) akS57S0200000_18.l0).LLILLJJLI.getValue()).wQ2(PageFinder.via(C1189060h32.LJIIJ((PoiAlbumMediumImageCell) akS57S0200000_18.l0)), interfaceC665370Q7zLJFF, "click");
    }

    public static final void LIZ$27(AkS57S0200000_18 akS57S0200000_18, View view) {
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        String str = ((C1168030gV7) akS57S0200000_18.l0).LLILZ;
        c1169160gWw.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("click_all_playlist_entrance", c2344009Gk.LIZ);
        C1168030gV7 c1168030gV7 = (C1168030gV7) akS57S0200000_18.l0;
        ViewAllPlaylistFragmentArg viewAllPlaylistFragmentArg = new ViewAllPlaylistFragmentArg(c1168030gV7.LL, c1168030gV7.LLILLJJLI, c1168030gV7.LLILLL, -1, c1168030gV7.LLILZ, 0);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((PlayListShowAllCell) akS57S0200000_18.l1).getContext(), "//mix/playlist/viewAll");
        smartRouteBuildRoute.withNavArg(viewAllPlaylistFragmentArg);
        smartRouteBuildRoute.open();
    }

    public static final void LIZ$28(AkS57S0200000_18 akS57S0200000_18, View view) {
        long jLongValue;
        Long l;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        PoiReviewReadEntranceAssem poiReviewReadEntranceAssem = (PoiReviewReadEntranceAssem) akS57S0200000_18.l0;
        String str = poiReviewReadEntranceAssem.LLJJJ;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = poiReviewReadEntranceAssem.ip().getState().LLILZLL;
        if (poiReviewSummaryModel != null && (l = poiReviewSummaryModel.totalCount) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Integer numValueOf = Integer.valueOf((int) jLongValue);
        String str2 = ((PoiReviewReadEntranceAssem) akS57S0200000_18.l0).ip().getState().LLILZIL;
        PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI((PoiReviewReadEntranceAssem) akS57S0200000_18.l0));
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ((C1195630hDd) akS57S0200000_18.l1, null);
        c1191160h6Q.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJ);
        linkedHashMap.put("enter_from", "poi_detail");
        if (str != null) {
            linkedHashMap.put("poi_id", str);
        }
        if (numValueOf != null) {
            linkedHashMap.put("review_cnt", String.valueOf(numValueOf.intValue()));
        }
        if (str2 != null) {
            C1189060h32.LIZ(str2, linkedHashMap);
        }
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("click_all_reviews_button", linkedHashMap, c1185050gwZ);
        ((PoiReviewReadEntranceAssem) akS57S0200000_18.l0).sf0("all_reviews_button", null, CardStruct.IStatusCode.DEFAULT);
    }

    public static final void LIZ$29(AkS57S0200000_18 akS57S0200000_18, View view) {
        String fromGroupId;
        String strLJ;
        String str;
        String name;
        String str2;
        SparkContext sparkContext;
        PoiDetailWriteReviewButtonAssem poiDetailWriteReviewButtonAssem = (PoiDetailWriteReviewButtonAssem) akS57S0200000_18.l0;
        String poiId = poiDetailWriteReviewButtonAssem.kp().getPoiId();
        String poiId2 = ((PoiDetailWriteReviewButtonAssem) akS57S0200000_18.l0).kp().getPoiId();
        String str3 = "";
        if (poiId2 == null) {
            poiId2 = "";
        }
        String strLIZ = ((PoiDetailWriteReviewButtonAssem) akS57S0200000_18.l0).kp().LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        String strLIZIZ = ((PoiDetailWriteReviewButtonAssem) akS57S0200000_18.l0).kp().LIZIZ();
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        String strLIZJ = ((PoiDetailWriteReviewButtonAssem) akS57S0200000_18.l0).kp().LIZJ();
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        String strLJ2 = ((PoiDetailWriteReviewButtonAssem) akS57S0200000_18.l0).kp().LJ();
        if (strLJ2 == null) {
            strLJ2 = "";
        }
        String strLJIIJJI = ((PoiDetailWriteReviewButtonAssem) akS57S0200000_18.l0).kp().LJIIJJI();
        if (strLJIIJJI == null) {
            strLJIIJJI = "";
        }
        C1ER1 c1er1 = C1ER1.LIZIZ;
        String strLJ3 = C2365509Or.LJ(c1er1.LJJIJIIJIL(null));
        C1188440h22 c1188440h22LJIIIZ = ((PoiDetailWriteReviewButtonAssem) akS57S0200000_18.l0).kp().LJIIIZ();
        if (c1188440h22LJIIIZ != null) {
            fromGroupId = c1188440h22LJIIIZ.getFromGroupId();
        } else {
            fromGroupId = null;
        }
        String collectInfo = ((PoiListApi.PoiDetailResponse) akS57S0200000_18.l1).getCollectInfo();
        if (C123100dR.LIZ(strLJ3)) {
            strLJ = strLJ3;
        } else {
            strLJ = C2365509Or.LJ(c1er1.LJJIJIIJIL(null));
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = poiDetailWriteReviewButtonAssem.LJJIJL().getContext();
        SparkContext sparkContext2 = new SparkContext();
        String strLIZIZ2 = TiktokPoiLynxSettings.LIZIZ("poi_review_post");
        if (strLIZIZ2 == null) {
            strLIZIZ2 = "";
        }
        sparkContext2.LJJLIIJ(strLIZIZ2);
        if (poiId == null) {
            str = "";
        } else {
            str = poiId;
        }
        sparkContext2.LJJJZ("poi_id", str);
        PoiListApi.PoiDetailResponse poiDetailResponseIp = poiDetailWriteReviewButtonAssem.ip();
        if (poiDetailResponseIp == null || (name = poiDetailResponseIp.getName()) == null) {
            name = "";
        }
        sparkContext2.LJJJZ("poi_name", Uri.encode(name));
        sparkContext2.LJJJLZIJ(EnumC1186570gz1.POI_DETAIL_PAGE.getValue(), "post_source");
        if (collectInfo == null) {
            str2 = "";
        } else {
            str2 = collectInfo;
        }
        sparkContext2.LJJJZ("collect_info", Uri.encode(str2));
        String str4 = ((C1153950g8P) poiDetailWriteReviewButtonAssem.LLJJIJI.getValue()).LLILLJJLI;
        if (str4 == null) {
            str4 = "";
        }
        sparkContext2.LJJJZ("review_config", Uri.encode(str4));
        sparkContext2.LJJJZ("associated_video_id", "");
        sparkContext2.LJJJZ("enter_method", "bottom_bar");
        sparkContext2.LJJJZ("enter_from", "poi_detail");
        sparkContext2.LJJJZ("initial_poi_id", poiId2);
        sparkContext2.LJJJZ("initial_poi_from_group_id", strLIZ);
        sparkContext2.LJJJZ("initial_poi_enter_from", strLIZIZ);
        sparkContext2.LJJJZ("initial_poi_enter_method", strLIZJ);
        sparkContext2.LJJJZ("poi_detail_enter_from", strLJIIJJI);
        sparkContext2.LJJJZ("poi_detail_enter_method", strLJ2);
        sparkContext2.LJJJZ("log_extra", strLJ);
        sparkContext2.LJJJZ("poi_detail_display_info", "general");
        if (fromGroupId != null) {
            sparkContext2.LJJJZ("from_group_id", fromGroupId);
        }
        try {
            Map mapLJII = C1182380gsG.LJII(C1558520qew.LJIIL(poiDetailWriteReviewButtonAssem));
            if (!mapLJII.isEmpty()) {
                C1548420qOe.LIZIZ(sparkContext2, "poi_general_track_params", C2365509Or.LJ(mapLJII));
                sparkContext = sparkContext2;
            } else {
                sparkContext = null;
            }
            C189200o6.m2constructorimpl(sparkContext);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        sparkContext2.LJJJJZI(new C1209100hZM(poiDetailWriteReviewButtonAssem, 12));
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext2).LIZIZ();
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        if (poiId != null) {
            str3 = poiId;
        }
        String str5 = strLIZJ;
        String str6 = strLIZIZ;
        String str7 = poiId2;
        C1191160h6Q.LJIJJ(c1191160h6Q, str7, str6, str5, strLJ2, strLJIIJJI, strLJ3, "poi_detail", "bottom_bar", str3, collectInfo, "general", null, null, null, fromGroupId, C1558520qew.LJIIL(poiDetailWriteReviewButtonAssem), null, PageFinder.via(C724240Sb0.LJI(poiDetailWriteReviewButtonAssem)), 159744);
    }

    public static final void LIZ$3(AkS57S0200000_18 akS57S0200000_18, View view) {
        ((PoiDetailFoodHeaderAssem) akS57S0200000_18.l0).DD((TuxIconView) akS57S0200000_18.l1, null, null, "click_poi_head_info");
    }

    public static final void LIZ$30(AkS57S0200000_18 akS57S0200000_18, View view) {
        ((PoiDetailTravelHeaderAssem) akS57S0200000_18.l0).DD((TuxIconView) akS57S0200000_18.l1, null, "highlight", "click_tag_more");
    }

    public static final void LIZ$31(AkS57S0200000_18 akS57S0200000_18, View view) {
        ((PoiDetailTravelHeaderAssem) akS57S0200000_18.l0).DD((FrameLayout) akS57S0200000_18.l1, null, "highlight", "click_travel_info");
    }

    public static final void LIZ$32(AkS57S0200000_18 akS57S0200000_18, View view) {
        ((PoiDetailTravelHeaderAssemV2) akS57S0200000_18.l0).DD((TuxIconView) akS57S0200000_18.l1, null, null, "click_poi_head_info");
    }

    public static final void LIZ$33(AkS57S0200000_18 akS57S0200000_18, View view) {
        ((PoiDetailTravelHeaderAssemV2) akS57S0200000_18.l0).DD((FrameLayout) akS57S0200000_18.l1, null, null, "click_poi_head_info");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$34(AkS57S0200000_18 akS57S0200000_18, View view) {
        PoiData poiData;
        C1200050hKl next;
        String str;
        String str2;
        IPoiClaimListAssemAbility iPoiClaimListAssemAbility = (IPoiClaimListAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL((PoiClaimListCellAssem) akS57S0200000_18.l0), IPoiClaimListAssemAbility.class, null);
        if (iPoiClaimListAssemAbility != null && iPoiClaimListAssemAbility.yc0()) {
            return;
        }
        C1841350y17 c1841350y17 = ((PoiClaimListCellAssem) akS57S0200000_18.l0).LLJLIL;
        if (c1841350y17 != null && c1841350y17.isChecked()) {
            PoiClaimPoiListViewModel poiClaimPoiListViewModelOp = ((PoiClaimListCellAssem) akS57S0200000_18.l0).op();
            poiClaimPoiListViewModelOp.getClass();
            poiClaimPoiListViewModelOp.setState(new AwS597S0100000_18((PoiData) null, 926));
            C1200540hLY c1200540hLY = C1200540hLY.LIZ;
            C1200050hKl c1200050hKl = (C1200050hKl) akS57S0200000_18.l1;
            C1200780hLw c1200780hLw = ((PoiClaimListCellAssem) akS57S0200000_18.l0).op().LLILZLL;
            c1200540hLY.getClass();
            C1200540hLY.LIZIZ(c1200050hKl, c1200780hLw);
            return;
        }
        PoiData poiData2 = ((C1200090hKp) ((PoiClaimListCellAssem) akS57S0200000_18.l0).op().getState()).LLILLJJLI;
        C1200090hKp c1200090hKp = (C1200090hKp) ((PoiClaimListCellAssem) akS57S0200000_18.l0).op().getState();
        c1200090hKp.getClass();
        List<C1200050hKl> list = c1200090hKp.getListState().LLILZ;
        if (list != null) {
            Iterator<C1200050hKl> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    PoiData poiData3 = next.LL;
                    if (poiData3 != null) {
                        str = poiData3.poiId;
                    } else {
                        str = null;
                    }
                    if (poiData2 != null) {
                        str2 = poiData2.poiId;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str, str2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1200050hKl c1200050hKl2 = next;
            if (c1200050hKl2 != null) {
                C1200540hLY c1200540hLY2 = C1200540hLY.LIZ;
                C1200780hLw c1200780hLw2 = ((PoiClaimListCellAssem) akS57S0200000_18.l0).op().LLILZLL;
                c1200540hLY2.getClass();
                C1200540hLY.LIZIZ(c1200050hKl2, c1200780hLw2);
            }
        }
        PoiClaimPoiListViewModel poiClaimPoiListViewModelOp2 = ((PoiClaimListCellAssem) akS57S0200000_18.l0).op();
        C1200050hKl c1200050hKl3 = ((PoiClaimListCellAssem) akS57S0200000_18.l0).LLJLILLLLZIIL;
        if (c1200050hKl3 != null) {
            poiData = c1200050hKl3.LL;
        } else {
            poiData = null;
        }
        poiClaimPoiListViewModelOp2.getClass();
        poiClaimPoiListViewModelOp2.setState(new AwS597S0100000_18(poiData, 926));
        ((PoiClaimListCellAssem) akS57S0200000_18.l0).op().wQ2("click");
        C1200540hLY c1200540hLY3 = C1200540hLY.LIZ;
        C1200050hKl c1200050hKl4 = (C1200050hKl) akS57S0200000_18.l1;
        C1200780hLw c1200780hLw3 = ((PoiClaimListCellAssem) akS57S0200000_18.l0).op().LLILZLL;
        c1200540hLY3.getClass();
        C1200560hLa c1200560hLaLIZ = C1200540hLY.LIZ(c1200050hKl4, c1200780hLw3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_cache_search", CardStruct.IStatusCode.DEFAULT);
        C1189060h32.LIZ(c1200560hLaLIZ.LIZ, linkedHashMap);
        linkedHashMap.putAll(C1200530hLX.LIZIZ(null, "search_poi_show_al"));
        C1189060h32.LJJ("search_id", c1200560hLaLIZ.LIZIZ, linkedHashMap);
        linkedHashMap.put("is_success", "1");
        String str3 = c1200560hLaLIZ.LIZJ;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("key_word", str3);
        linkedHashMap.put("enter_method", c1200560hLaLIZ.LIZLLL);
        String str5 = c1200560hLaLIZ.LJ;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("log_id", str5);
        String str6 = c1200560hLaLIZ.LJFF;
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("index", str6);
        String str7 = c1200560hLaLIZ.LJI;
        if (str7 == null) {
            str7 = "";
        }
        linkedHashMap.put("poi_id", str7);
        String str8 = c1200560hLaLIZ.LJII;
        if (str8 == null) {
            str8 = "";
        }
        linkedHashMap.put("session_id", str8);
        String str9 = c1200560hLaLIZ.LJIIIIZZ;
        if (str9 == null) {
            str9 = "";
        }
        linkedHashMap.put("page_order", str9);
        linkedHashMap.put("enter_from", "claim_poi_page");
        String str10 = c1200560hLaLIZ.LJIIIZ;
        if (str10 == null) {
            str10 = "";
        }
        linkedHashMap.put("use_session_cache", str10);
        String str11 = c1200560hLaLIZ.LJIIJ;
        if (str11 != null) {
            str4 = str11;
        }
        linkedHashMap.put("local_service_key_category", str4);
        C20684815ws.LJIILLIIL("choose_poi", linkedHashMap);
    }

    public static final void LIZ$35(AkS57S0200000_18 akS57S0200000_18, View view) {
        PoiBackgroundMapComponent poiBackgroundMapComponent = (PoiBackgroundMapComponent) akS57S0200000_18.l0;
        MapModeEnterMethod mapModeEnterMethod = MapModeEnterMethod.CLICK_MAP_OTHER_AREA;
        PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 poiDiscoveryApi$PoiDiscoveryCardListResponseV2 = (PoiDiscoveryApi$PoiDiscoveryCardListResponseV2) akS57S0200000_18.l1;
        List<PoiGeneralCard> listPoiList$poi_release = poiDiscoveryApi$PoiDiscoveryCardListResponseV2.poiList$poi_release();
        if (listPoiList$poi_release != null) {
            C13LP.LL(listPoiList$poi_release, 2);
        }
        poiBackgroundMapComponent.up(null, mapModeEnterMethod, poiDiscoveryApi$PoiDiscoveryCardListResponseV2, null, true);
    }

    public static final void LIZ$36(AkS57S0200000_18 akS57S0200000_18, View view) {
        ((PoiBackgroundMapComponent) akS57S0200000_18.l0).up(null, MapModeEnterMethod.CLICK_MAP_POI_MARKER, (PoiDiscoveryApi$PoiDiscoveryCardListResponseV2) akS57S0200000_18.l1, null, true);
    }

    public static final void LIZ$37(AkS57S0200000_18 akS57S0200000_18, View view) {
        IDynamicButtonClickAbility iDynamicButtonClickAbility;
        List<ClickEvent> list = ((PoiButton) akS57S0200000_18.l0).clickEvent;
        if (list != null) {
            for (ClickEvent clickEvent : list) {
                Fragment fragmentLJI = C724240Sb0.LJI((NavBarRightButtonsAssem) akS57S0200000_18.l1);
                if (fragmentLJI != null && (iDynamicButtonClickAbility = (IDynamicButtonClickAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IDynamicButtonClickAbility.class, null)) != null) {
                    iDynamicButtonClickAbility.dg2(clickEvent.actionType, EnumC1184160gv8.POI_NAV_BAR, clickEvent.params);
                }
            }
        }
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String strMobBtnName = ((PoiButton) akS57S0200000_18.l0).mobBtnName();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((NavBarRightButtonsAssem) akS57S0200000_18.l1);
        c1185430gxB.getClass();
        C1185430gxB.LJJJJ(interfaceC665370Q7zLJIIL, strMobBtnName);
    }

    public static final void LIZ$38(AkS57S0200000_18 akS57S0200000_18, View view) {
        ((View.OnClickListener) akS57S0200000_18.l0).onClick((View) akS57S0200000_18.l1);
    }

    public static final void LIZ$39(AkS57S0200000_18 akS57S0200000_18, View view) {
        List<String> list;
        Integer num;
        List<String> list2;
        Integer numValueOf = null;
        IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        Integer num2 = null;
        if (iPoiService != null) {
            String str = ((CollectionContentAssem) akS57S0200000_18.l0).Lo().id;
            String str2 = ((CollectionContentAssem) akS57S0200000_18.l0).Lo().name;
            CollectionDetail.Status status = ((CollectionContentAssem) akS57S0200000_18.l0).Lo().status;
            if (status != null) {
                num = status.state;
            } else {
                num = null;
            }
            String strLIZ = C1172580gcS.LIZ(num);
            PoiRevisitBannerRelatedResponse poiRevisitBannerRelatedResponse = ((CollectionContentAssem) akS57S0200000_18.l0).Jo().LLILLL;
            if (poiRevisitBannerRelatedResponse != null && (list2 = poiRevisitBannerRelatedResponse.poiIdList) != null) {
                numValueOf = Integer.valueOf(list2.size());
            }
            iPoiService.LJJLIIIJJI(numValueOf, str, str2, strLIZ);
        }
        C1171080ga2 c1171080ga2 = (C1171080ga2) akS57S0200000_18.l1;
        PoiRevisitBannerRelatedResponse poiRevisitBannerRelatedResponse2 = c1171080ga2.LLILLL.Jo().LLILLL;
        if (poiRevisitBannerRelatedResponse2 != null && (list = poiRevisitBannerRelatedResponse2.poiIdList) != null) {
            CollectionContentAssem collectionContentAssem = c1171080ga2.LLILLL;
            IPoiService iPoiService2 = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
            if (iPoiService2 != null) {
                Context context = collectionContentAssem.getContext();
                String str3 = collectionContentAssem.Lo().name;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = collectionContentAssem.Lo().id;
                if (str4 == null) {
                    str4 = "";
                }
                CollectionDetail.Status status2 = collectionContentAssem.Lo().status;
                if (status2 != null) {
                    num2 = status2.state;
                }
                iPoiService2.LJIJI(context, str3, list, str4, C1172580gcS.LIZ(num2));
            }
        }
    }

    public static final void LIZ$4(AkS57S0200000_18 akS57S0200000_18, View view) {
        ((PoiDetailFoodHeaderAssem) akS57S0200000_18.l0).DD((FrameLayout) akS57S0200000_18.l1, null, null, "click_poi_head_info");
    }

    public static final void LIZ$40(AkS57S0200000_18 akS57S0200000_18, View view) {
        String strLJIIIZ;
        if (!((PoiOrderSubmitSlashFragment) akS57S0200000_18.l0).qW().LLIZ) {
            C1193160h9e c1193160h9e = C1193160h9e.LIZ;
            Context context = ((TuxIconView) akS57S0200000_18.l1).getContext();
            AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((PoiOrderSubmitSlashFragment) akS57S0200000_18.l0, 2748);
            C1192650h8p c1192650h8pOW = ((PoiOrderSubmitSlashFragment) akS57S0200000_18.l0).oW();
            PoiOrderSubmitSlashFragment poiOrderSubmitSlashFragment = (PoiOrderSubmitSlashFragment) akS57S0200000_18.l0;
            InterfaceC1192660h8q interfaceC1192660h8qOV = poiOrderSubmitSlashFragment.OV();
            if (interfaceC1192660h8qOV != null) {
                strLJIIIZ = interfaceC1192660h8qOV.LJIIIZ();
            } else {
                strLJIIIZ = null;
            }
            boolean z = ((PoiOrderSubmitSlashFragment) akS57S0200000_18.l0).qW().getState().LLILZIL;
            c1193160h9e.getClass();
            if (!C1193160h9e.LIZ(context, awS562S0100000_18, c1192650h8pOW, poiOrderSubmitSlashFragment, strLJIIIZ, z)) {
                ((PoiOrderSubmitSlashFragment) akS57S0200000_18.l0).qW().LLILZLL = "return";
                ((PoiOrderSubmitSlashFragment) akS57S0200000_18.l0).DT();
            }
        }
    }

    public static final void LIZ$41(AkS57S0200000_18 akS57S0200000_18, View view) {
        AssemVMLazy assemVMLazy = ((EditPlaylistCell) akS57S0200000_18.l0).LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = EditPlaylistCell.LLJ;
        EditPlaylistViewModel editPlaylistViewModel = (EditPlaylistViewModel) assemVMLazy.getValue();
        editPlaylistViewModel.withState(new AwS102S0201000_18((C1166810gT9) akS57S0200000_18.l1, editPlaylistViewModel, ((EditPlaylistCell) akS57S0200000_18.l0).getLayoutPosition(), 8));
    }

    public static final void LIZ$42(AkS57S0200000_18 akS57S0200000_18, View view) {
        IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
        Context context = ((EditPlaylistHeaderCell) akS57S0200000_18.l0).itemView.getContext();
        Bundle bundle = new Bundle();
        bundle.putInt("mix_label", ((C1168020gV6) akS57S0200000_18.l1).LLIZ);
        bundle.putInt("playlist_post_cnt", ((C1168020gV6) akS57S0200000_18.l1).LLILZIL);
        C1168020gV6 c1168020gV6 = (C1168020gV6) akS57S0200000_18.l1;
        String str = c1168020gV6.LLILZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = c1168020gV6.LLILLL;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = c1168020gV6.LL;
        if (str4 == null) {
            str4 = "";
        }
        iMixFeedService.LJIIL(context, bundle, str, str3, null, str4, c1168020gV6.LLILZLL);
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        String str5 = ((C1168020gV6) akS57S0200000_18.l1).LLILLJJLI;
        if (str5 != null) {
            str2 = str5;
        }
        c1169160gWw.getClass();
        C1169160gWw.LJIJI(str2, "manage_video");
        C1168020gV6 c1168020gV62 = (C1168020gV6) akS57S0200000_18.l1;
        String str6 = c1168020gV62.LLILLL;
        String str7 = c1168020gV62.LL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str7);
        c2344009Gk.LJIIIIZZ("playlist_id", str6);
        C20684815ws.LJIILLIIL("rename_playlist", c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$5(AkS57S0200000_18 akS57S0200000_18, View view) {
        C1185600gxS c1185600gxS;
        String poiId;
        Integer chartType;
        HashMap<String, String> mapR70;
        IPoiDetailChartsAbility iPoiDetailChartsAbility;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        C1173300gdc c1173300gdcQr0;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiDetailChartsV3BigCardReusedAssem) akS57S0200000_18.l0);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (fragmentLJIIJ != null && (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJIIJ)) != null && (c1173300gdcQr0 = interfaceC1181010gq3LIZ.qr0()) != null) {
            c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ;
        } else {
            c1185600gxS = null;
        }
        C1184630gvt c1184630gvt = C1184630gvt.LIZ;
        Context context = ((View) akS57S0200000_18.l1).getContext();
        PoiDetailApi.ChartPoi chartPoi = ((C1174170gf1) C631370Opb.LIZ((PoiDetailChartsV3BigCardReusedAssem) akS57S0200000_18.l0)).getChartPoi();
        if (chartPoi != null) {
            poiId = chartPoi.getPoiId();
        } else {
            poiId = null;
        }
        String strLIZ = C18JG.LIZ("c33207.d54495", PageFinder.via((View) akS57S0200000_18.l1), null);
        c1184630gvt.getClass();
        C1184630gvt.LIZJ(context, poiId, strLIZ, c1185600gxS);
        C1174170gf1 c1174170gf1 = ((PoiDetailChartsV3BigCardReusedAssem) akS57S0200000_18.l0).LLJJLIIIJLLLLLLLZ;
        if (c1174170gf1 != null) {
            chartType = c1174170gf1.getChartType();
        } else {
            chartType = null;
        }
        String strValueOf = String.valueOf(C1175120ggY.LIZJ(chartType));
        Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ((PoiDetailChartsV3BigCardReusedAssem) akS57S0200000_18.l0);
        if (fragmentLJIIJ2 != null && (iPoiDetailChartsAbility = (IPoiDetailChartsAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ2, null), IPoiDetailChartsAbility.class, null)) != null) {
            mapR70 = iPoiDetailChartsAbility.r70();
        } else {
            mapR70 = null;
        }
        Fragment fragmentLJIIJ3 = C1189060h32.LJIIJ((PoiDetailChartsV3BigCardReusedAssem) akS57S0200000_18.l0);
        if (fragmentLJIIJ3 != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ3, null);
        }
        C1172390gc9.LIZ("poi_card", strValueOf, mapR70, interfaceC665370Q7zLJFF, PageFinder.via((View) akS57S0200000_18.l1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$6(AkS57S0200000_18 akS57S0200000_18, View view) {
        C1185600gxS c1185600gxS;
        String poiId;
        Integer chartType;
        HashMap<String, String> mapR70;
        IPoiDetailChartsAbility iPoiDetailChartsAbility;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        C1173300gdc c1173300gdcQr0;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiDetailChartsV3SmallCardReusedAssem) akS57S0200000_18.l0);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (fragmentLJIIJ != null && (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJIIJ)) != null && (c1173300gdcQr0 = interfaceC1181010gq3LIZ.qr0()) != null) {
            c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ;
        } else {
            c1185600gxS = null;
        }
        C1184630gvt c1184630gvt = C1184630gvt.LIZ;
        Context context = ((View) akS57S0200000_18.l1).getContext();
        PoiDetailApi.ChartPoi chartPoi = ((C1174180gf2) C631370Opb.LIZ((PoiDetailChartsV3SmallCardReusedAssem) akS57S0200000_18.l0)).getChartPoi();
        if (chartPoi != null) {
            poiId = chartPoi.getPoiId();
        } else {
            poiId = null;
        }
        String strLIZ = C18JG.LIZ("c33207.d54495", PageFinder.via((View) akS57S0200000_18.l1), null);
        c1184630gvt.getClass();
        C1184630gvt.LIZJ(context, poiId, strLIZ, c1185600gxS);
        C1174180gf2 c1174180gf2 = ((PoiDetailChartsV3SmallCardReusedAssem) akS57S0200000_18.l0).LLJJLIIIJLLLLLLLZ;
        if (c1174180gf2 != null) {
            chartType = c1174180gf2.getChartType();
        } else {
            chartType = null;
        }
        String strValueOf = String.valueOf(C1175120ggY.LIZJ(chartType));
        Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ((PoiDetailChartsV3SmallCardReusedAssem) akS57S0200000_18.l0);
        if (fragmentLJIIJ2 != null && (iPoiDetailChartsAbility = (IPoiDetailChartsAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ2, null), IPoiDetailChartsAbility.class, null)) != null) {
            mapR70 = iPoiDetailChartsAbility.r70();
        } else {
            mapR70 = null;
        }
        Fragment fragmentLJIIJ3 = C1189060h32.LJIIJ((PoiDetailChartsV3SmallCardReusedAssem) akS57S0200000_18.l0);
        if (fragmentLJIIJ3 != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ3, null);
        }
        C1172390gc9.LIZ("poi_card", strValueOf, mapR70, interfaceC665370Q7zLJFF, PageFinder.via((View) akS57S0200000_18.l1));
    }

    public static final void LIZ$7(AkS57S0200000_18 akS57S0200000_18, View view) {
        ((Function1) akS57S0200000_18.l0).invoke((C19M4) akS57S0200000_18.l1);
    }

    public static final void LIZ$8(AkS57S0200000_18 akS57S0200000_18, View view) {
        boolean zLJFF;
        String str;
        Integer userCityStatus;
        String str2;
        String str3;
        String str4;
        String str5;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF2;
        boolean zBooleanValue;
        boolean z;
        String str6;
        String str7;
        String str8;
        PoiMapDetailCommonHorizontalCardAssem.PoiMapDetailHorizontalCardAbility poiMapDetailHorizontalCardAbility;
        Boolean bool;
        Boolean bool2;
        Context context;
        View rootView;
        String pagePoiId;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF3;
        View view2;
        PoiMapDetailHorizontalCardReusedAssem poiMapDetailHorizontalCardReusedAssem = (PoiMapDetailHorizontalCardReusedAssem) akS57S0200000_18.l0;
        View view3 = (View) akS57S0200000_18.l1;
        poiMapDetailHorizontalCardReusedAssem.getClass();
        try {
            PoiCardCellData poiCardCellDataZp = poiMapDetailHorizontalCardReusedAssem.zp();
            boolean zBooleanValue2 = false;
            if (poiCardCellDataZp != null) {
                zLJFF = Intrinsics.LJFF(poiCardCellDataZp.isCollected, Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            String str15 = null;
            if (!zLJFF) {
                C1172330gc3 c1172330gc3 = C1172330gc3.LIZ;
                C1257300ip6 c1257300ip6 = C1257300ip6.LIZ;
                if (view3 != null) {
                    context = view3.getContext();
                } else {
                    context = null;
                }
                c1257300ip6.getClass();
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)) + C1257300ip6.LIZ(context);
                Integer userCityStatus2 = null;
                Fragment fragmentLJIIJ = C1189060h32.LJIIJ(poiMapDetailHorizontalCardReusedAssem);
                if (fragmentLJIIJ != null && (view2 = fragmentLJIIJ.getView()) != null) {
                    rootView = view2.getRootView();
                } else {
                    rootView = null;
                }
                C1175680ghS c1175680ghS = poiMapDetailHorizontalCardReusedAssem.up().LLILZIL;
                if (c1175680ghS != null) {
                    pagePoiId = c1175680ghS.getPagePoiId();
                } else {
                    pagePoiId = null;
                }
                HashMap map = new HashMap();
                C1189060h32.LJJ("enter_from", "map_mode", map);
                PoiCardCellData poiCardCellDataZp2 = poiMapDetailHorizontalCardReusedAssem.zp();
                if (poiCardCellDataZp2 != null) {
                    str9 = poiCardCellDataZp2.poiId;
                } else {
                    str9 = null;
                }
                C1189060h32.LJJ("target_poi_id", str9, map);
                PoiCardCellData poiCardCellDataZp3 = poiMapDetailHorizontalCardReusedAssem.zp();
                if (poiCardCellDataZp3 != null) {
                    str10 = poiCardCellDataZp3.collectInfo;
                } else {
                    str10 = null;
                }
                C1189060h32.LIZLLL(str10, map);
                String str16 = null;
                C1172330gc3.LIZ(c1172330gc3, view3, iLIZIZ, null, rootView, pagePoiId, map, PageFinder.via(C1189060h32.LJIIJ(poiMapDetailHorizontalCardReusedAssem)), null, 132);
                C1175660ghQ c1175660ghQXQ2 = poiMapDetailHorizontalCardReusedAssem.up().xQ2();
                if (c1175660ghQXQ2 != null) {
                    str11 = c1175660ghQXQ2.localServiceKeyCategory;
                } else {
                    str11 = null;
                }
                PoiMapDetailResponse poiMapDetailResponse = poiMapDetailHorizontalCardReusedAssem.up().LLJILJILJ.LIZJ;
                if (poiMapDetailResponse != null) {
                    userCityStatus2 = poiMapDetailResponse.getUserCityStatus();
                }
                String strWQ2 = poiMapDetailHorizontalCardReusedAssem.tp().wQ2();
                PoiCardCellData poiCardCellDataZp4 = poiMapDetailHorizontalCardReusedAssem.zp();
                if (poiCardCellDataZp4 != null) {
                    str12 = poiCardCellDataZp4.poiId;
                } else {
                    str12 = null;
                }
                PoiCardCellData poiCardCellDataZp5 = poiMapDetailHorizontalCardReusedAssem.zp();
                if (poiCardCellDataZp5 != null) {
                    str13 = poiCardCellDataZp5.collectInfo;
                } else {
                    str13 = null;
                }
                PoiCardCellData poiCardCellDataZp6 = poiMapDetailHorizontalCardReusedAssem.zp();
                if (poiCardCellDataZp6 != null) {
                    str16 = poiCardCellDataZp6.keyCategory;
                }
                PoiCardCellData poiCardCellDataZp7 = poiMapDetailHorizontalCardReusedAssem.zp();
                if (poiCardCellDataZp7 != null) {
                    str14 = poiCardCellDataZp7.collectInfo;
                } else {
                    str14 = null;
                }
                Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ(poiMapDetailHorizontalCardReusedAssem);
                if (fragmentLJIIJ2 != null) {
                    interfaceC665370Q7zLJFF3 = C1558360qeg.LJFF(fragmentLJIIJ2, null);
                } else {
                    interfaceC665370Q7zLJFF3 = null;
                }
                C1175600ghK.LJ(PageFinder.via(view3), interfaceC665370Q7zLJFF3, userCityStatus2, str11, strWQ2, str12, str13, str16, str14);
            } else {
                C1175660ghQ c1175660ghQXQ22 = poiMapDetailHorizontalCardReusedAssem.up().xQ2();
                if (c1175660ghQXQ22 != null) {
                    str = c1175660ghQXQ22.localServiceKeyCategory;
                } else {
                    str = null;
                }
                PoiMapDetailResponse poiMapDetailResponse2 = poiMapDetailHorizontalCardReusedAssem.up().LLJILJILJ.LIZJ;
                if (poiMapDetailResponse2 != null) {
                    userCityStatus = poiMapDetailResponse2.getUserCityStatus();
                } else {
                    userCityStatus = null;
                }
                String strWQ22 = poiMapDetailHorizontalCardReusedAssem.tp().wQ2();
                PoiCardCellData poiCardCellDataZp8 = poiMapDetailHorizontalCardReusedAssem.zp();
                if (poiCardCellDataZp8 != null) {
                    str2 = poiCardCellDataZp8.poiId;
                } else {
                    str2 = null;
                }
                PoiCardCellData poiCardCellDataZp9 = poiMapDetailHorizontalCardReusedAssem.zp();
                if (poiCardCellDataZp9 != null) {
                    str3 = poiCardCellDataZp9.collectInfo;
                } else {
                    str3 = null;
                }
                PoiCardCellData poiCardCellDataZp10 = poiMapDetailHorizontalCardReusedAssem.zp();
                if (poiCardCellDataZp10 != null) {
                    str4 = poiCardCellDataZp10.keyCategory;
                } else {
                    str4 = null;
                }
                PoiCardCellData poiCardCellDataZp11 = poiMapDetailHorizontalCardReusedAssem.zp();
                if (poiCardCellDataZp11 != null) {
                    str5 = poiCardCellDataZp11.collectInfo;
                } else {
                    str5 = null;
                }
                Fragment fragmentLJIIJ3 = C1189060h32.LJIIJ(poiMapDetailHorizontalCardReusedAssem);
                if (fragmentLJIIJ3 != null) {
                    interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ3, null);
                } else {
                    interfaceC665370Q7zLJFF = null;
                }
                C1175600ghK.LIZIZ(PageFinder.via(view3), interfaceC665370Q7zLJFF, userCityStatus, str, strWQ22, str2, str3, str4, str5);
            }
            PoiMapDetailPageVM poiMapDetailPageVMUp = poiMapDetailHorizontalCardReusedAssem.up();
            Fragment fragmentLJIIJ4 = C1189060h32.LJIIJ(poiMapDetailHorizontalCardReusedAssem);
            if (fragmentLJIIJ4 != null) {
                interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJIIJ4, null);
            } else {
                interfaceC665370Q7zLJFF2 = null;
            }
            poiMapDetailPageVMUp.DQ2(interfaceC665370Q7zLJFF2);
            PoiMapDetailPageVM poiMapDetailPageVMUp2 = poiMapDetailHorizontalCardReusedAssem.up();
            PoiCardCellData poiCardCellDataZp12 = poiMapDetailHorizontalCardReusedAssem.zp();
            if (poiCardCellDataZp12 != null && (bool2 = poiCardCellDataZp12.isCollected) != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (!zBooleanValue) {
                z = true;
            } else {
                z = false;
            }
            PoiCardCellData poiCardCellDataZp13 = poiMapDetailHorizontalCardReusedAssem.zp();
            if (poiCardCellDataZp13 != null) {
                str6 = poiCardCellDataZp13.poiId;
            } else {
                str6 = null;
            }
            PoiCardCellData poiCardCellDataZp14 = poiMapDetailHorizontalCardReusedAssem.zp();
            if (poiCardCellDataZp14 != null) {
                str7 = poiCardCellDataZp14.poiName;
            } else {
                str7 = null;
            }
            PoiCardCellData poiCardCellDataZp15 = poiMapDetailHorizontalCardReusedAssem.zp();
            if (poiCardCellDataZp15 != null) {
                str8 = poiCardCellDataZp15.formattedAddress;
            } else {
                str8 = null;
            }
            poiMapDetailPageVMUp2.yQ2(new C614900O9w(z, str6, str7, str8, String.valueOf(poiMapDetailHorizontalCardReusedAssem.hashCode()), false, true, false, false, 384), true);
            Fragment fragmentLJIIJ5 = C1189060h32.LJIIJ(poiMapDetailHorizontalCardReusedAssem);
            if (fragmentLJIIJ5 != null && (poiMapDetailHorizontalCardAbility = (PoiMapDetailCommonHorizontalCardAssem.PoiMapDetailHorizontalCardAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ5, null), PoiMapDetailCommonHorizontalCardAssem.PoiMapDetailHorizontalCardAbility.class, null)) != null) {
                PoiCardCellData poiCardCellDataZp16 = poiMapDetailHorizontalCardReusedAssem.zp();
                if (poiCardCellDataZp16 != null) {
                    str15 = poiCardCellDataZp16.poiId;
                }
                PoiCardCellData poiCardCellDataZp17 = poiMapDetailHorizontalCardReusedAssem.zp();
                if (poiCardCellDataZp17 != null && (bool = poiCardCellDataZp17.isCollected) != null) {
                    zBooleanValue2 = bool.booleanValue();
                }
                poiMapDetailHorizontalCardAbility.eM2(str15, !zBooleanValue2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX.LIZ.LJ(C1EMR.MAP_MODE_ERR, e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:33|(1:35)(1:55)|36|(1:38)(1:51)|(2:47|(0)(10:50|46|102|58|(1:60)(1:62)|61|65|(1:67)|68|(2:95|(6:77|(2:98|(0)(3:101|(1:86)(1:94)|87))(1:81)|82|(1:84)(0)|(0)(0)|87)(0))(4:70|(2:74|(1:76)(0))|77|(3:79|98|(0)(4:82|(0)(0)|(0)(0)|87))(0))))(1:42)|43|(1:45)(0)|46|102|58|(0)(0)|61|65|(0)|68|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c9, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ca, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4);
        r1 = new X.C098200Yq(r4);
        X.C189200o6.m2constructorimpl(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x015e A[PHI: r21 r22
      0x015e: PHI (r21v2 java.lang.String) = (r21v1 java.lang.String), (r21v4 java.lang.String) binds: [B:99:0x015b, B:83:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r22v1 java.lang.Object) = (r22v0 java.lang.Object), (r22v3 java.lang.Object) binds: [B:99:0x015b, B:83:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1 A[PHI: r16
      0x00a1: PHI (r16v1 java.lang.String) = (r16v0 java.lang.String), (r16v3 java.lang.String) binds: [B:48:0x009e, B:44:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00aa A[PHI: r13
      0x00aa: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v3 java.lang.String) binds: [B:53:0x00a7, B:34:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bf A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:58:0x00b1, B:60:0x00bf, B:61:0x00c3), top: B:102:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0159 A[PHI: r21
      0x0159: PHI (r21v1 java.lang.String) = (r21v0 java.lang.String), (r21v5 java.lang.String), (r21v5 java.lang.String) binds: [B:96:0x0156, B:78:0x00f4, B:80:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$9(irm.AkS57S0200000_18 r29, android.view.View r30) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS57S0200000_18.LIZ$9(irm.AkS57S0200000_18, android.view.View):void");
    }

    public AkS57S0200000_18(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
