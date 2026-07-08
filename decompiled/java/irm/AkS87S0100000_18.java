package irm;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.C01GW;
import X.C06MM;
import X.C0HTI;
import X.C0SY5;
import X.C0XPD;
import X.C0XQ7;
import X.C1163730gOB;
import X.C1173160gdO;
import X.C1175120ggY;
import X.C1175360ggw;
import X.C1175580ghI;
import X.C1175600ghK;
import X.C1175660ghQ;
import X.C1180740gpc;
import X.C1182410gsJ;
import X.C1182990gtF;
import X.C1183820gua;
import X.C1184190gvB;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1186260gyW;
import X.C1186280gyY;
import X.C1187260h08;
import X.C1189060h32;
import X.C1190200h4s;
import X.C1190820h5s;
import X.C1191160h6Q;
import X.C1191780h7Q;
import X.C1191930h7f;
import X.C1192310h8H;
import X.C1193400hA2;
import X.C1200750hLt;
import X.C1200780hLw;
import X.C1205490hTX;
import X.C1208950hZ7;
import X.C1208960hZ8;
import X.C123100dR;
import X.C1247530iZL;
import X.C12ES;
import X.C1388190mED;
import X.C1390850mIV;
import X.C1391190mJ3;
import X.C13LP;
import X.C1440005kM;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19EG;
import X.C19GS;
import X.C19HL;
import X.C19HN;
import X.C1EMR;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C297010BkZ;
import X.C343970De7;
import X.C520040KaQ;
import X.C584930Mwt;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C844470XAv;
import X.C848230XPh;
import X.EnumC1173840geU;
import X.EnumC1189990h4X;
import X.InterfaceC1184290gvL;
import X.InterfaceC1191710h7J;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AAListenerS323S0100000_12;
import Y.ARunnableS105S0100000_5;
import Y.AUListenerS0S0302005_18;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility;
import com.ss.android.ugc.aweme.poi.claim.view.PoiClaimHeaderAssem;
import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimViewModel;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsAddLocationNoGooglePlayAssem;
import com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.IMyMomentsAbility;
import com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.MyMomentsAddLocationFragment;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsMainElementsAssem;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.PoiCampaignMapAssem;
import com.ss.android.ugc.aweme.poi.detail.amenities.PoiAmenitiesAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.IPoiHeaderTopVideosAbility;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell.PoiHeaderTopVideosSmallHorizontalPairCell;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell.PoiHeaderTopVideosViewMoreCell;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData;
import com.ss.android.ugc.aweme.poi.detail.chartv3.horizontallist.PoiDetailChartsV3PageCardReusedAssem;
import com.ss.android.ugc.aweme.poi.detail.container.background.map.PoiBackgroundMapAssem;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiNavButtonGroup;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.PoiDynamicNavBarModule;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.assem.NavBarFoldButtonAssem;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesDetailFragment;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryCell;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiPicture;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiPictureAuthorModel;
import com.ss.android.ugc.aweme.poi.detail.map.PoiBackgroundMapComponent;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.IPoiNearbyV2Ability;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem.PoiDetailNearbyV2MapTopViewAssem;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem.PoiDetailNearbyV2ViewAllAssem;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Model;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab;
import com.ss.android.ugc.aweme.poi.detail.postcard.assem.PoiDetailLimitedPostVerticalListAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailAreaFilterAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailCommonVerticalListAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.horizontal.PoiMapDetailHorizontalCardReusedAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailAreaFilterVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailNavTabVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeFilterAssem;
import com.ss.android.ugc.aweme.poi.mapmode.model.Location;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeEnterMethod;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModeFilterVM;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitSlashFragment;
import com.ss.android.ugc.aweme.poi.osp.component.PoiOrderSubmitNavBarAssem;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsFoldedReviewCell;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsNpsItemCell;
import com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsFoldedReviewsSheetFragment;
import com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsUserLevelSheetFragment;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.multipletemplate.previewphoto.PreviewPhotoFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS105S0110000_18;
import kotlin.jvm.internal.AwS24S2200000_18;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class AkS87S0100000_18 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) throws Throwable {
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
            case 43:
                LIZ$43(this, view);
                break;
            case 44:
                LIZ$44(this, view);
                break;
            case 45:
                LIZ$45(this, view);
                break;
            case 46:
                LIZ$46(this, view);
                break;
            case 47:
                LIZ$47(this, view);
                break;
            case 48:
                LIZ$48(this, view);
                break;
            case 49:
                LIZ$49(this, view);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                LIZ$50(this, view);
                break;
            case 51:
                LIZ$51(this, view);
                break;
            case 52:
                LIZ$52(this, view);
                break;
            case 53:
                LIZ$53(this, view);
                break;
            case 54:
                LIZ$54(this, view);
                break;
            case 55:
                LIZ$55(this, view);
                break;
            case 56:
                LIZ$56(this, view);
                break;
            case 57:
                LIZ$57(this, view);
                break;
            case 58:
                LIZ$58(this, view);
                break;
            case 59:
                LIZ$59(this, view);
                break;
            case 60:
                LIZ$60(this, view);
                break;
            case 61:
                LIZ$61(this, view);
                break;
            case BaseNotice.CREATOR /* 62 */:
                LIZ$62(this, view);
                break;
            case 63:
                LIZ$63(this, view);
                break;
            case 64:
                LIZ$64(this, view);
                break;
            case 65:
                LIZ$65(this, view);
                break;
            case 66:
                LIZ$66(this, view);
                break;
            case 67:
                LIZ$67(this, view);
                break;
            case 68:
                LIZ$68(this, view);
                break;
            case 69:
                LIZ$69(this, view);
                break;
            case 70:
                LIZ$70(this, view);
                break;
            case 71:
                LIZ$71(this, view);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                LIZ$72(this, view);
                break;
            case 73:
                LIZ$73(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS87S0100000_18(MixVideosDialog mixVideosDialog, int i) {
        super(500L);
        this.$t = i;
        switch (i) {
            case 5:
            case 6:
            case 7:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                this.l0 = mixVideosDialog;
                break;
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            default:
                this.l0 = mixVideosDialog;
                break;
        }
    }

    public static final void LIZ$0(AkS87S0100000_18 akS87S0100000_18, View view) {
        PoiMapDetailAreaFilterVM poiMapDetailAreaFilterVMGo = ((PoiMapDetailAreaFilterAssem) akS87S0100000_18.l0).Go();
        poiMapDetailAreaFilterVMGo.withState(new AwS105S0110000_18(poiMapDetailAreaFilterVMGo, true, 14));
        Fragment fragmentLJI = C724240Sb0.LJI((PoiMapDetailAreaFilterAssem) akS87S0100000_18.l0);
        if (fragmentLJI != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
        }
    }

    public static final void LIZ$1(AkS87S0100000_18 akS87S0100000_18, View view) {
        Integer userCityStatus;
        AssemVMLazy assemVMLazy = ((PoiMapDetailAreaFilterAssem) akS87S0100000_18.l0).LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiMapDetailAreaFilterAssem.LLJJI;
        PoiMapDetailResponse poiMapDetailResponse = ((PoiMapDetailPageVM) assemVMLazy.getValue()).LLJILJILJ.LIZJ;
        if (poiMapDetailResponse != null) {
            userCityStatus = poiMapDetailResponse.getUserCityStatus();
        } else {
            userCityStatus = null;
        }
        C1175600ghK.LJFF(((PoiMapDetailPageVM) ((PoiMapDetailAreaFilterAssem) akS87S0100000_18.l0).LLJ.getValue()).LLJ, C1558520qew.LJIIL((PoiMapDetailAreaFilterAssem) akS87S0100000_18.l0), userCityStatus, "area");
        PoiMapDetailAreaFilterVM poiMapDetailAreaFilterVMGo = ((PoiMapDetailAreaFilterAssem) akS87S0100000_18.l0).Go();
        poiMapDetailAreaFilterVMGo.withState(new AwS597S0100000_18(poiMapDetailAreaFilterVMGo, 843));
        Fragment fragmentLJI = C724240Sb0.LJI((PoiMapDetailAreaFilterAssem) akS87S0100000_18.l0);
        if (fragmentLJI != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
        }
    }

    public static final void LIZ$10(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((MixVideosDialog) akS87S0100000_18.l0).iS();
    }

    public static final void LIZ$11(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((MixVideosDialog) akS87S0100000_18.l0).kS();
    }

    public static final void LIZ$12(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((MixVideosDialog) akS87S0100000_18.l0).kS();
    }

    public static final void LIZ$13(AkS87S0100000_18 akS87S0100000_18, View view) {
        IMyMomentsAbility iMyMomentsAbility;
        MyMomentsAddLocationNoGooglePlayAssem myMomentsAddLocationNoGooglePlayAssem = (MyMomentsAddLocationNoGooglePlayAssem) akS87S0100000_18.l0;
        myMomentsAddLocationNoGooglePlayAssem.getClass();
        C1180740gpc.LIZ.getClass();
        C1180740gpc.LIZ().LIZIZ(C06MM.LIZ(myMomentsAddLocationNoGooglePlayAssem.getContext()));
        Fragment fragmentLJI = C724240Sb0.LJI(myMomentsAddLocationNoGooglePlayAssem);
        if (fragmentLJI != null && (iMyMomentsAbility = (IMyMomentsAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IMyMomentsAbility.class, null)) != null) {
            iMyMomentsAbility.lu1();
        }
    }

    public static final void LIZ$14(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((MyMomentsMainElementsAssem) akS87S0100000_18.l0).So(false);
    }

    public static final void LIZ$15(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((MyMomentsMainElementsAssem) akS87S0100000_18.l0).So(true);
    }

    public static final void LIZ$16(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((PoiAmenitiesAssem) akS87S0100000_18.l0).tp();
    }

    public static final void LIZ$17(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public static final void LIZ$18(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public static final void LIZ$19(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public static final void LIZ$2(AkS87S0100000_18 akS87S0100000_18, View view) {
        PoiMapDetailPageVM poiMapDetailPageVMGo = ((PoiMapDetailCommonVerticalListAssem) akS87S0100000_18.l0).Go();
        poiMapDetailPageVMGo.withState(new AwS597S0100000_18(poiMapDetailPageVMGo, 846));
        PoiMapDetailNavTabVM poiMapDetailNavTabVM = poiMapDetailPageVMGo.LLJIJIL;
        if (poiMapDetailNavTabVM != null) {
            poiMapDetailNavTabVM.setState(new AwS32S0010000_18(true, 19));
        }
    }

    public static final void LIZ$20(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public static final void LIZ$21(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public static final void LIZ$22(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public static final void LIZ$23(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public static final void LIZ$24(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public static final void LIZ$25(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0293 A[PHI: r14
      0x0293: PHI (r14v2 java.lang.String) = (r14v1 java.lang.String), (r14v5 java.lang.String) binds: [B:171:0x028f, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03b3 A[PHI: r28
      0x03b3: PHI (r28v1 java.lang.String) = (r28v0 java.lang.String), (r28v7 java.lang.String) binds: [B:218:0x03b0, B:208:0x0378] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03b8 A[PHI: r28 r29
      0x03b8: PHI (r28v2 java.lang.String) = (r28v1 java.lang.String), (r28v6 java.lang.String) binds: [B:221:0x03b5, B:211:0x0380] A[DONT_GENERATE, DONT_INLINE]
      0x03b8: PHI (r29v1 java.lang.String) = (r29v0 java.lang.String), (r29v5 java.lang.String) binds: [B:221:0x03b5, B:211:0x0380] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03bd A[PHI: r28 r29 r30
      0x03bd: PHI (r28v3 java.lang.String) = (r28v2 java.lang.String), (r28v5 java.lang.String) binds: [B:224:0x03ba, B:214:0x0388] A[DONT_GENERATE, DONT_INLINE]
      0x03bd: PHI (r29v2 java.lang.String) = (r29v1 java.lang.String), (r29v4 java.lang.String) binds: [B:224:0x03ba, B:214:0x0388] A[DONT_GENERATE, DONT_INLINE]
      0x03bd: PHI (r30v2 java.lang.String) = (r30v1 java.lang.String), (r30v4 java.lang.String) binds: [B:224:0x03ba, B:214:0x0388] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$26(irm.AkS87S0100000_18 r30, android.view.View r31) {
        /*
            Method dump skipped, instruction units count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS87S0100000_18.LIZ$26(irm.AkS87S0100000_18, android.view.View):void");
    }

    public static final void LIZ$27(AkS87S0100000_18 akS87S0100000_18, View view) {
        C1183820gua item = ((PoiHeaderTopVideosSmallHorizontalPairCell) akS87S0100000_18.l0).getItem();
        if (item != null) {
            ((PoiHeaderTopVideosSmallHorizontalPairCell) akS87S0100000_18.l0).L5(item.LLILLJJLI, item, 0);
        }
    }

    public static final void LIZ$28(AkS87S0100000_18 akS87S0100000_18, View view) {
        C1183820gua item = ((PoiHeaderTopVideosSmallHorizontalPairCell) akS87S0100000_18.l0).getItem();
        if (item != null) {
            ((PoiHeaderTopVideosSmallHorizontalPairCell) akS87S0100000_18.l0).L5(item.LLILLL, item, 1);
        }
    }

    public static final void LIZ$29(AkS87S0100000_18 akS87S0100000_18, View view) {
        IPoiHeaderTopVideosAbility iPoiHeaderTopVideosAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        IPoiHeaderTopVideosAbility iPoiHeaderTopVideosAbility2;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiHeaderTopVideosViewMoreCell) akS87S0100000_18.l0);
        if (fragmentLJIIJ != null && (iPoiHeaderTopVideosAbility = (IPoiHeaderTopVideosAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IPoiHeaderTopVideosAbility.class, null)) != null && iPoiHeaderTopVideosAbility.BG2()) {
            C1187260h08 c1187260h08 = C1187260h08.LIZ;
            Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ((PoiHeaderTopVideosViewMoreCell) akS87S0100000_18.l0);
            if (fragmentLJIIJ2 != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ2, null);
            } else {
                interfaceC665370Q7zLJFF = null;
            }
            PageFinder pageFinderVia = PageFinder.via((PoiHeaderTopVideosViewMoreCell) akS87S0100000_18.l0);
            c1187260h08.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7zLJFF);
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            Map<String, String> map = c2344009Gk.LIZ;
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
            c1185040gwY.getClass();
            C1185040gwY.LJFF("ttls_poi_background_media_viewall_click", map, c1185050gwZ);
            Fragment fragmentLJIIJ3 = C1189060h32.LJIIJ((PoiHeaderTopVideosViewMoreCell) akS87S0100000_18.l0);
            if (fragmentLJIIJ3 != null && (iPoiHeaderTopVideosAbility2 = (IPoiHeaderTopVideosAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ3, null), IPoiHeaderTopVideosAbility.class, null)) != null) {
                iPoiHeaderTopVideosAbility2.VC1(null, null);
            }
        }
    }

    public static final void LIZ$3(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((PoiOrderSubmitNavBarAssem) akS87S0100000_18.l0).lp();
    }

    public static final void LIZ$30(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public static final void LIZ$31(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public static final void LIZ$32(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public static final void LIZ$33(AkS87S0100000_18 akS87S0100000_18, View view) {
        List<PoiButton> list;
        FragmentManager supportFragmentManager;
        Integer dynamicIcon;
        PoiDynamicNavBarModule poiDynamicNavBarModule;
        PoiNavButtonGroup poiNavButtonGroup;
        NavBarFoldButtonAssem navBarFoldButtonAssem = (NavBarFoldButtonAssem) akS87S0100000_18.l0;
        if (navBarFoldButtonAssem.getContext() != null) {
            ArrayList arrayList = new ArrayList();
            Context context = navBarFoldButtonAssem.getContext();
            C1184190gvB c1184190gvB = (C1184190gvB) navBarFoldButtonAssem.LLIZLLLIL.getValue();
            if (c1184190gvB != null && (poiDynamicNavBarModule = c1184190gvB.LL) != null && (poiNavButtonGroup = poiDynamicNavBarModule.getPoiNavButtonGroup()) != null) {
                list = poiNavButtonGroup.foldButtons;
            } else {
                list = null;
            }
            if (list != null) {
                for (PoiButton poiButton : list) {
                    InterfaceC1184290gvL interfaceC1184290gvL = (InterfaceC1184290gvL) ((LinkedHashMap) navBarFoldButtonAssem.LLJ).get(poiButton.buttonType);
                    if (interfaceC1184290gvL == null || !interfaceC1184290gvL.LJIILIIL()) {
                        String str = poiButton.buttonName;
                        if (str != null && str.length() != 0) {
                            C1247530iZL c1247530iZL = new C1247530iZL();
                            c1247530iZL.LIZ = poiButton.buttonName;
                            c1247530iZL.LIZJ = 0;
                            DynamicIcon dynamicIcon2 = poiButton.icon;
                            if (dynamicIcon2 != null && (dynamicIcon = dynamicIcon2.parseDynamicIcon(context, null)) != null) {
                                c1247530iZL.LIZJ(dynamicIcon.intValue());
                                c1247530iZL.LIZ(new AwS384S0200000_18(poiButton, navBarFoldButtonAssem, 237));
                                arrayList.add(c1247530iZL);
                                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                                String strMobBtnName = poiButton.mobBtnName();
                                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(navBarFoldButtonAssem);
                                c1185430gxB.getClass();
                                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJIIL);
                                C1189060h32.LJJ("ttls_btn_name", strMobBtnName, linkedHashMap);
                                c1185040gwY.getClass();
                                C1185040gwY.LIZIZ("ttls_poi_top_expand_btn_show", linkedHashMap, null);
                            }
                        }
                    }
                }
            }
            C19EG c19egLIZ = C724240Sb0.LIZ(navBarFoldButtonAssem);
            if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
                C1390850mIV c1390850mIV = new C1390850mIV();
                c1390850mIV.LJFF(arrayList);
                c1390850mIV.LIZ.LLJJJ = 1;
                c1390850mIV.LIZJ().show(supportFragmentManager, "nav_bar_fold_button");
            }
            C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(navBarFoldButtonAssem);
            c1185430gxB2.getClass();
            C1185040gwY c1185040gwY2 = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            C1182410gsJ.LIZ(linkedHashMap2, interfaceC665370Q7zLJIIL2);
            c1185040gwY2.getClass();
            C1185040gwY.LIZIZ("ttls_poi_top_expand_panel_show", linkedHashMap2, null);
        }
        C1185430gxB c1185430gxB3 = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL3 = C1558520qew.LJIIL((NavBarFoldButtonAssem) akS87S0100000_18.l0);
        c1185430gxB3.getClass();
        C1185430gxB.LJJJJ(interfaceC665370Q7zLJIIL3, "expand");
    }

    public static final void LIZ$34(AkS87S0100000_18 akS87S0100000_18, View view) {
        C19GS c19gs;
        C19HL c19hl;
        C19HL c19hl2;
        float alpha;
        PoiRecommendDishesDetailFragment poiRecommendDishesDetailFragment = (PoiRecommendDishesDetailFragment) akS87S0100000_18.l0;
        C19EG activity = poiRecommendDishesDetailFragment.getActivity();
        if ((activity instanceof C19GS) && (c19gs = (C19GS) activity) != null) {
            if (poiRecommendDishesDetailFragment.UR(poiRecommendDishesDetailFragment.LLJJJJ, poiRecommendDishesDetailFragment.LLJJIII) && (c19hl = poiRecommendDishesDetailFragment.LLJJJJJIL) != null && poiRecommendDishesDetailFragment.LLJJJJLIIL != null && c19hl.getDrawable() != null) {
                ArrayList<PoiGalleryAnchorData> arrayList = poiRecommendDishesDetailFragment.LLJJIII;
                if (arrayList != null && (c19hl2 = poiRecommendDishesDetailFragment.LLJJJJJIL) != null) {
                    int i = poiRecommendDishesDetailFragment.LLJJJJ;
                    View view2 = poiRecommendDishesDetailFragment.LLJJJJLIIL;
                    if (view2 != null) {
                        ViewGroup viewGroup = poiRecommendDishesDetailFragment.LLJILLL;
                        if (viewGroup != null) {
                            C786410Ut5.LJLZ(8, viewGroup);
                        }
                        PoiGalleryAnchorData poiGalleryAnchorData = (PoiGalleryAnchorData) ListProtector.get(arrayList, i);
                        if (poiGalleryAnchorData != null && poiGalleryAnchorData.w > 0 && poiGalleryAnchorData.h > 0) {
                            RectF rectFLJFF = C19HN.LJFF();
                            rectFLJFF.left = c19hl2.getLeft();
                            rectFLJFF.top = c19hl2.getTop();
                            rectFLJFF.right = c19hl2.getRight();
                            rectFLJFF.bottom = c19hl2.getBottom();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("tryDoStartAnimWithAnchor currentAnchor x: ");
                            sbLIZ.append(poiGalleryAnchorData.x);
                            sbLIZ.append(", y: ");
                            sbLIZ.append(poiGalleryAnchorData.y);
                            sbLIZ.append(", w: ");
                            sbLIZ.append(poiGalleryAnchorData.w);
                            sbLIZ.append(", h: ");
                            sbLIZ.append(poiGalleryAnchorData.h);
                            sbLIZ.append("; \n bound: x: ");
                            sbLIZ.append(rectFLJFF.left);
                            sbLIZ.append(", y: ");
                            sbLIZ.append(rectFLJFF.top);
                            sbLIZ.append(", w: ");
                            sbLIZ.append(rectFLJFF.width());
                            sbLIZ.append(", h: ");
                            sbLIZ.append(rectFLJFF.height());
                            C2188811AlT.LIZIZ(sbLIZ);
                            float fWidth = poiGalleryAnchorData.w / rectFLJFF.width();
                            float fHeight = poiGalleryAnchorData.h / rectFLJFF.height();
                            View view3 = poiRecommendDishesDetailFragment.LLJILJIL;
                            if (view3 != null) {
                                alpha = view3.getAlpha();
                            } else {
                                alpha = 0.0f;
                            }
                            int width = c19hl2.getWidth();
                            int height = c19hl2.getHeight();
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.setDuration(300L);
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS0S0302005_18(poiRecommendDishesDetailFragment, alpha, view2, c19hl2, (poiGalleryAnchorData.x + (poiGalleryAnchorData.w / 2)) - (rectFLJFF.left + (rectFLJFF.width() / 2)), ((poiGalleryAnchorData.y - C12ES.LJIIJJI(c19gs)) + (poiGalleryAnchorData.h / 2)) - (c19hl2.getTop() + (((int) (height * fHeight)) / 2)), width, fWidth, height, fHeight, 0));
                            valueAnimatorOfFloat.addListener(new AAListenerS323S0100000_12(c19gs, 14));
                            valueAnimatorOfFloat.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C1182990gtF.LIZ.getClass();
            C1182990gtF.LJ(c19gs);
        }
    }

    public static final void LIZ$35(AkS87S0100000_18 akS87S0100000_18, View view) {
        PoiPicture poiPicture;
        PoiPictureAuthorModel poiPictureAuthorModel;
        UrlModel urlModel;
        List<String> urlList;
        final String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        PoiInnerPageMobData poiInnerPageMobData;
        PoiInnerPageMobData poiInnerPageMobData2;
        PoiInnerPageMobData poiInnerPageMobData3;
        PoiInnerPageMobData poiInnerPageMobData4;
        PoiInnerPageMobData poiInnerPageMobData5;
        PoiInnerPageMobData poiInnerPageMobData6;
        PoiInnerPageMobData poiInnerPageMobData7;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        PoiInnerPageMobData poiInnerPageMobData8;
        String str9;
        String str10;
        String str11;
        String uri;
        List<String> urlList2;
        String str12;
        PoiPicture poiPicture2;
        PoiPictureAuthorModel poiPictureAuthorModel2;
        PoiPicture poiPicture3;
        UrlModel urlModel2;
        PoiPicture poiPicture4;
        UrlModel urlModel3;
        PoiPicture poiPicture5;
        PoiPicture poiPicture6;
        PoiPicture poiPicture7;
        C1186260gyW item = ((PoiGalleryCell) akS87S0100000_18.l0).getItem();
        if (item != null && (poiPicture = item.LLILLL) != null && (poiPictureAuthorModel = poiPicture.author) != null && (urlModel = poiPictureAuthorModel.authorLink) != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null && C123100dR.LIZ(str)) {
            final PoiGalleryCell poiGalleryCell = (PoiGalleryCell) akS87S0100000_18.l0;
            poiGalleryCell.getClass();
            C1186280gyY.LIZ.getClass();
            C01GW c01gw = C1186280gyY.LIZIZ;
            Keva keva = (Keva) c01gw.getValue();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("poi_detail_gallery_show_author_info_disclaimer_");
            sbLIZ.append(curUserId);
            if (!keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                Activity activityLIZ = C1388190mED.LIZ(poiGalleryCell.itemView.getContext());
                if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
                    C1192310h8H c1192310h8H = C1192310h8H.LIZ;
                    C0HTI c0hti = new C0HTI();
                    c0hti.LIZ = R.drawable.rj;
                    C844470XAv.LIZ.getClass();
                    Drawable drawableLIZ = c0hti.LIZ(C844470XAv.LIZ());
                    String string = poiGalleryCell.itemView.getContext().getString(2131850155);
                    Context context = poiGalleryCell.itemView.getContext();
                    String string2 = poiGalleryCell.itemView.getContext().getString(2131825033);
                    String string3 = poiGalleryCell.itemView.getContext().getString(2131825034);
                    C1186260gyW item2 = poiGalleryCell.getItem();
                    if (item2 != null) {
                        poiInnerPageMobData8 = item2.LLILZIL;
                    } else {
                        poiInnerPageMobData8 = null;
                    }
                    C1186260gyW item3 = poiGalleryCell.getItem();
                    if (item3 != null && (poiPicture7 = item3.LLILLL) != null) {
                        str9 = poiPicture7.picId;
                    } else {
                        str9 = null;
                    }
                    C1186260gyW item4 = poiGalleryCell.getItem();
                    if (item4 != null && (poiPicture6 = item4.LLILLL) != null) {
                        str10 = poiPicture6.source;
                    } else {
                        str10 = null;
                    }
                    C1186260gyW item5 = poiGalleryCell.getItem();
                    if (item5 != null && (poiPicture5 = item5.LLILLL) != null) {
                        str11 = poiPicture5.refCode;
                    } else {
                        str11 = null;
                    }
                    C1186260gyW item6 = poiGalleryCell.getItem();
                    if (item6 != null && (poiPicture4 = item6.LLILLL) != null && (urlModel3 = poiPicture4.urlModel) != null) {
                        uri = urlModel3.getUri();
                    } else {
                        uri = null;
                    }
                    C1186260gyW item7 = poiGalleryCell.getItem();
                    if (item7 != null && (poiPicture3 = item7.LLILLL) != null && (urlModel2 = poiPicture3.urlModel) != null) {
                        urlList2 = urlModel2.getUrlList();
                    } else {
                        urlList2 = null;
                    }
                    C1186260gyW item8 = poiGalleryCell.getItem();
                    if (item8 != null && (poiPicture2 = item8.LLILLL) != null && (poiPictureAuthorModel2 = poiPicture2.author) != null) {
                        str12 = poiPictureAuthorModel2.keyword;
                    } else {
                        str12 = null;
                    }
                    c1192310h8H.getClass();
                    C1192310h8H.LJFF(null, supportFragmentManager, drawableLIZ, null, string, C1192310h8H.LIZ(context, string2, string3, "ttls_gallery_author_report_click", "author_report_click", poiInnerPageMobData8, str9, str10, str11, uri, urlList2, str12, null, null), poiGalleryCell.itemView.getContext().getString(2131835615), new Function0<Unit>() { // from class: X.0gyX
                        @Override // kotlin.jvm.functions.Function0
                        public final Unit invoke() {
                            C1192310h8H c1192310h8H2 = C1192310h8H.LIZ;
                            Context context2 = poiGalleryCell.itemView.getContext();
                            String str13 = str;
                            c1192310h8H2.getClass();
                            C1192310h8H.LJ(context2, str13);
                            return Unit.LIZ;
                        }
                    });
                    Keva keva2 = (Keva) c01gw.getValue();
                    String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("poi_detail_gallery_show_author_info_disclaimer_");
                    sbLIZ2.append(curUserId2);
                    keva2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
                }
            } else {
                C1192310h8H c1192310h8H2 = C1192310h8H.LIZ;
                Context context2 = poiGalleryCell.itemView.getContext();
                c1192310h8H2.getClass();
                C1192310h8H.LJ(context2, str);
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            C1186260gyW item9 = poiGalleryCell.getItem();
            if (item9 != null && (poiInnerPageMobData7 = item9.LLILZIL) != null) {
                str2 = poiInnerPageMobData7.enterFrom;
            } else {
                str2 = null;
            }
            C1189060h32.LJJIFFI(c2344009Gk, "enter_from", str2);
            C1186260gyW item10 = poiGalleryCell.getItem();
            if (item10 != null && (poiInnerPageMobData6 = item10.LLILZIL) != null) {
                str3 = poiInnerPageMobData6.poiId;
            } else {
                str3 = null;
            }
            C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str3);
            C1186260gyW item11 = poiGalleryCell.getItem();
            if (item11 != null && (poiInnerPageMobData5 = item11.LLILZIL) != null) {
                str4 = poiInnerPageMobData5.collectInfo;
            } else {
                str4 = null;
            }
            C1189060h32.LIZJ(c2344009Gk, str4);
            C1186260gyW item12 = poiGalleryCell.getItem();
            if (item12 != null && (poiInnerPageMobData4 = item12.LLILZIL) != null) {
                str5 = poiInnerPageMobData4.fromGroupId;
            } else {
                str5 = null;
            }
            C1189060h32.LJJIFFI(c2344009Gk, "from_group_id", str5);
            C1186260gyW item13 = poiGalleryCell.getItem();
            if (item13 != null && (poiInnerPageMobData3 = item13.LLILZIL) != null) {
                str6 = poiInnerPageMobData3.initialPoiEnterFrom;
            } else {
                str6 = null;
            }
            C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_enter_from", str6);
            C1186260gyW item14 = poiGalleryCell.getItem();
            if (item14 != null && (poiInnerPageMobData2 = item14.LLILZIL) != null) {
                str7 = poiInnerPageMobData2.initialPoiEnterMethod;
            } else {
                str7 = null;
            }
            C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_enter_method", str7);
            C1186260gyW item15 = poiGalleryCell.getItem();
            if (item15 != null && (poiInnerPageMobData = item15.LLILZIL) != null) {
                str8 = poiInnerPageMobData.initialPoiFromGroupId;
            } else {
                str8 = null;
            }
            C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_from_group_id", str8);
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            Map<String, String> map = c2344009Gk.LIZ;
            C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(poiGalleryCell.getCurrentActivity()));
            c1185040gwY.getClass();
            C1185040gwY.LJFF("ttls_gallery_author_name_click", map, c1185050gwZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc A[PHI: r8
      0x00cc: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v8 java.lang.String) binds: [B:45:0x00c9, B:31:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0 A[PHI: r8 r9
      0x00d0: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v7 java.lang.String) binds: [B:48:0x00cd, B:34:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v6 java.lang.String) binds: [B:48:0x00cd, B:34:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4 A[PHI: r8 r9 r10
      0x00d4: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v6 java.lang.String) binds: [B:51:0x00d1, B:37:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v5 java.lang.String) binds: [B:51:0x00d1, B:37:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v4 java.lang.String) binds: [B:51:0x00d1, B:37:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$36(irm.AkS87S0100000_18 r17, android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS87S0100000_18.LIZ$36(irm.AkS87S0100000_18, android.view.View):void");
    }

    public static final void LIZ$37(AkS87S0100000_18 akS87S0100000_18, View view) {
        IPoiNearbyV2Ability iPoiNearbyV2Ability;
        String currentTabKey;
        Fragment fragmentLJI = C724240Sb0.LJI((PoiDetailNearbyV2MapTopViewAssem) akS87S0100000_18.l0);
        if (fragmentLJI != null && (iPoiNearbyV2Ability = (IPoiNearbyV2Ability) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IPoiNearbyV2Ability.class, null)) != null) {
            MapModeEnterMethod mapModeEnterMethod = MapModeEnterMethod.CLICK_MAP_OTHER_AREA;
            PoiNearbyV2Tab poiNearbyV2Tab = ((PoiDetailNearbyV2MapTopViewAssem) akS87S0100000_18.l0).dp().getState().LL;
            if (poiNearbyV2Tab == null || (currentTabKey = poiNearbyV2Tab.getTabKey()) == null) {
                PoiNearbyV2Model poiNearbyV2Model = ((PoiDetailNearbyV2MapTopViewAssem) akS87S0100000_18.l0).LLJJL;
                if (poiNearbyV2Model != null) {
                    currentTabKey = poiNearbyV2Model.getCurrentTabKey();
                } else {
                    currentTabKey = null;
                }
            }
            iPoiNearbyV2Ability.al1(mapModeEnterMethod, currentTabKey, null, null);
        }
        ((PoiDetailNearbyV2MapTopViewAssem) akS87S0100000_18.l0).ep(MapModeEnterMethod.CLICK_MAP_OTHER_AREA.getEnterMethod());
    }

    public static final void LIZ$38(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((PoiDetailNearbyV2ViewAllAssem) akS87S0100000_18.l0).cp(true);
    }

    public static final void LIZ$39(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((PoiDetailNearbyV2ViewAllAssem) akS87S0100000_18.l0).cp(false);
    }

    public static final void LIZ$4(AkS87S0100000_18 akS87S0100000_18, View view) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Fragment fragmentLJI = C724240Sb0.LJI((PoiBackgroundMapAssem) akS87S0100000_18.l0);
        if (fragmentLJI != null && (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragmentLJI)) != null) {
            abstractC1387200mCcLIZIZ.LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016f A[PHI: r8
      0x016f: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v5 java.lang.String) binds: [B:89:0x016c, B:71:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0173 A[PHI: r8 r9
      0x0173: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v4 java.lang.String) binds: [B:92:0x0170, B:74:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:92:0x0170, B:74:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$40(irm.AkS87S0100000_18 r15, android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS87S0100000_18.LIZ$40(irm.AkS87S0100000_18, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a5 A[PHI: r8
      0x01a5: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v5 java.lang.String) binds: [B:104:0x01a2, B:86:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a9 A[PHI: r8 r9
      0x01a9: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v4 java.lang.String) binds: [B:107:0x01a6, B:89:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:107:0x01a6, B:89:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$41(irm.AkS87S0100000_18 r15, android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS87S0100000_18.LIZ$41(irm.AkS87S0100000_18, android.view.View):void");
    }

    public static final void LIZ$42(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public static final void LIZ$43(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public static final void LIZ$44(AkS87S0100000_18 akS87S0100000_18, View view) {
        String str;
        Integer userCityStatus;
        String str2;
        String str3;
        String str4;
        String str5;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        String strLIZ;
        Context context;
        LifecycleOwner lifecycleOwnerLIZIZ;
        Context context2;
        String str6;
        String str7;
        Location location;
        String str8;
        FragmentManager supportFragmentManager;
        PoiMapDetailHorizontalCardReusedAssem poiMapDetailHorizontalCardReusedAssem = (PoiMapDetailHorizontalCardReusedAssem) akS87S0100000_18.l0;
        View view2 = poiMapDetailHorizontalCardReusedAssem.LLJLILLLLZIIL;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = null;
        if (view2 != null && (context = view2.getContext()) != null && (lifecycleOwnerLIZIZ = C0SY5.LIZIZ(context)) != null) {
            View view3 = poiMapDetailHorizontalCardReusedAssem.LLJLILLLLZIIL;
            if (view3 != null) {
                context2 = view3.getContext();
            } else {
                context2 = null;
            }
            PoiCardCellData poiCardCellDataZp = poiMapDetailHorizontalCardReusedAssem.zp();
            if (poiCardCellDataZp != null) {
                str6 = poiCardCellDataZp.poiId;
            } else {
                str6 = null;
            }
            PoiCardCellData poiCardCellDataZp2 = poiMapDetailHorizontalCardReusedAssem.zp();
            if (poiCardCellDataZp2 != null) {
                str7 = poiCardCellDataZp2.poiName;
            } else {
                str7 = null;
            }
            C1175580ghI c1175580ghIYp = poiMapDetailHorizontalCardReusedAssem.yp();
            if (c1175580ghIYp != null) {
                location = c1175580ghIYp.LIZ;
            } else {
                location = null;
            }
            PoiCardCellData poiCardCellDataZp3 = poiMapDetailHorizontalCardReusedAssem.zp();
            if (poiCardCellDataZp3 != null) {
                str8 = poiCardCellDataZp3.formattedAddress;
            } else {
                str8 = null;
            }
            if (context2 != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    poiMapDetailHorizontalCardReusedAssem.Ap(context2, arrayList, str6, str7, location, str8);
                    C1247530iZL c1247530iZL = new C1247530iZL();
                    c1247530iZL.LIZ = context2.getResources().getString(2131844787);
                    c1247530iZL.LIZJ(R.raw.icon_doc_on_doc);
                    c1247530iZL.LIZJ = 0;
                    c1247530iZL.LIZ(new AwS24S2200000_18(poiMapDetailHorizontalCardReusedAssem, context2, str7, str8, 2));
                    arrayList.add(c1247530iZL);
                    C19EG c19egLIZ = C724240Sb0.LIZ(lifecycleOwnerLIZIZ);
                    if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
                        C1390850mIV c1390850mIV = new C1390850mIV();
                        c1390850mIV.LIZ.LLJJIJI = context2.getResources().getString(2131844788);
                        c1390850mIV.LJFF(arrayList);
                        c1390850mIV.LIZJ().show(supportFragmentManager, "map");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1205490hTX.LIZ.LJ(C1EMR.MAP_MODE_ERR, e);
                }
            }
        }
        C1175660ghQ c1175660ghQXQ2 = poiMapDetailHorizontalCardReusedAssem.up().xQ2();
        if (c1175660ghQXQ2 != null) {
            str = c1175660ghQXQ2.localServiceKeyCategory;
        } else {
            str = null;
        }
        PoiMapDetailResponse poiMapDetailResponse = poiMapDetailHorizontalCardReusedAssem.up().LLJILJILJ.LIZJ;
        if (poiMapDetailResponse != null) {
            userCityStatus = poiMapDetailResponse.getUserCityStatus();
        } else {
            userCityStatus = null;
        }
        String strWQ2 = poiMapDetailHorizontalCardReusedAssem.tp().wQ2();
        PoiCardCellData poiCardCellDataZp4 = poiMapDetailHorizontalCardReusedAssem.zp();
        if (poiCardCellDataZp4 != null) {
            str2 = poiCardCellDataZp4.poiId;
        } else {
            str2 = null;
        }
        PoiCardCellData poiCardCellDataZp5 = poiMapDetailHorizontalCardReusedAssem.zp();
        if (poiCardCellDataZp5 != null) {
            str3 = poiCardCellDataZp5.collectInfo;
        } else {
            str3 = null;
        }
        PoiCardCellData poiCardCellDataZp6 = poiMapDetailHorizontalCardReusedAssem.zp();
        if (poiCardCellDataZp6 != null) {
            str4 = poiCardCellDataZp6.keyCategory;
        } else {
            str4 = null;
        }
        PoiCardCellData poiCardCellDataZp7 = poiMapDetailHorizontalCardReusedAssem.zp();
        if (poiCardCellDataZp7 != null) {
            str5 = poiCardCellDataZp7.collectInfo;
        } else {
            str5 = null;
        }
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(poiMapDetailHorizontalCardReusedAssem);
        if (fragmentLJIIJ != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
        } else {
            interfaceC665370Q7zLJFF = null;
        }
        PageFinder pageFinderVia = PageFinder.via(poiMapDetailHorizontalCardReusedAssem.LLJLILLLLZIIL);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJFF);
        if (str5 != null) {
            C1189060h32.LIZLLL(str5, linkedHashMap);
        }
        if (str != null) {
            strLIZ = C1175600ghK.LIZ(str);
        } else {
            strLIZ = null;
        }
        C1189060h32.LJJ("tab_code", strLIZ, linkedHashMap);
        C1189060h32.LJJ("map_mode_type", C1175600ghK.LJIIJ(userCityStatus), linkedHashMap);
        C1189060h32.LJJ("ttls_filter_type_list", strWQ2, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("target_collect_info", str3, linkedHashMap);
        C1189060h32.LJJ("target_local_service_key_category", str4, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("click_route", linkedHashMap, c1185050gwZ);
        PoiMapDetailPageVM poiMapDetailPageVMUp = poiMapDetailHorizontalCardReusedAssem.up();
        Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ(poiMapDetailHorizontalCardReusedAssem);
        if (fragmentLJIIJ2 != null) {
            interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJIIJ2, null);
        }
        poiMapDetailPageVMUp.DQ2(interfaceC665370Q7zLJFF2);
    }

    public static final void LIZ$45(AkS87S0100000_18 akS87S0100000_18, View view) {
        ViewGroup viewGroupSp = ((PoiMapDetailHorizontalCardReusedAssem) akS87S0100000_18.l0).sp();
        if (viewGroupSp != null) {
            viewGroupSp.performClick();
        }
    }

    public static final void LIZ$46(AkS87S0100000_18 akS87S0100000_18, View view) {
        Function0 function0 = (Function0) akS87S0100000_18.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$47(AkS87S0100000_18 akS87S0100000_18, View view) {
        C19GS c19gs;
        C19HL c19hl;
        ArrayList<PoiGalleryAnchorData> arrayList;
        C19HL c19hl2;
        float alpha;
        PoiDishesGalleryFragment poiDishesGalleryFragment = (PoiDishesGalleryFragment) akS87S0100000_18.l0;
        C19EG activity = poiDishesGalleryFragment.getActivity();
        ArrayList<PoiGalleryAnchorData> arrayList2 = null;
        if ((activity instanceof C19GS) && (c19gs = (C19GS) activity) != null) {
            C1175360ggw c1175360ggw = poiDishesGalleryFragment.LLJJI;
            if (c1175360ggw != null) {
                arrayList2 = c1175360ggw.anchorDataArray;
            }
            if (poiDishesGalleryFragment.SR(poiDishesGalleryFragment.LLJJIJIL, arrayList2) && (c19hl = poiDishesGalleryFragment.LLJJJ) != null && poiDishesGalleryFragment.LLJJJIL != null && c19hl.getDrawable() != null) {
                C1175360ggw c1175360ggw2 = poiDishesGalleryFragment.LLJJI;
                if (c1175360ggw2 != null && (arrayList = c1175360ggw2.anchorDataArray) != null && (c19hl2 = poiDishesGalleryFragment.LLJJJ) != null) {
                    int i = poiDishesGalleryFragment.LLJJIJIL;
                    View view2 = poiDishesGalleryFragment.LLJJJIL;
                    if (view2 != null) {
                        ViewGroup viewGroup = poiDishesGalleryFragment.LLJILLL;
                        if (viewGroup != null) {
                            C786410Ut5.LJLZ(8, viewGroup);
                        }
                        PoiGalleryAnchorData poiGalleryAnchorData = (PoiGalleryAnchorData) ListProtector.get(arrayList, i);
                        if (poiGalleryAnchorData != null && poiGalleryAnchorData.w > 0 && poiGalleryAnchorData.h > 0) {
                            RectF rectFLJFF = C19HN.LJFF();
                            rectFLJFF.left = c19hl2.getLeft();
                            rectFLJFF.top = c19hl2.getTop();
                            rectFLJFF.right = c19hl2.getRight();
                            rectFLJFF.bottom = c19hl2.getBottom();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("tryDoStartAnimWithAnchor currentAnchor x: ");
                            sbLIZ.append(poiGalleryAnchorData.x);
                            sbLIZ.append(", y: ");
                            sbLIZ.append(poiGalleryAnchorData.y);
                            sbLIZ.append(", w: ");
                            sbLIZ.append(poiGalleryAnchorData.w);
                            sbLIZ.append(", h: ");
                            sbLIZ.append(poiGalleryAnchorData.h);
                            sbLIZ.append("; \n bound: x: ");
                            sbLIZ.append(rectFLJFF.left);
                            sbLIZ.append(", y: ");
                            sbLIZ.append(rectFLJFF.top);
                            sbLIZ.append(", w: ");
                            sbLIZ.append(rectFLJFF.width());
                            sbLIZ.append(", h: ");
                            sbLIZ.append(rectFLJFF.height());
                            C2188811AlT.LIZIZ(sbLIZ);
                            float fWidth = poiGalleryAnchorData.w / rectFLJFF.width();
                            float fHeight = poiGalleryAnchorData.h / rectFLJFF.height();
                            View view3 = poiDishesGalleryFragment.LLJILJIL;
                            if (view3 != null) {
                                alpha = view3.getAlpha();
                            } else {
                                alpha = 0.0f;
                            }
                            int width = c19hl2.getWidth();
                            int height = c19hl2.getHeight();
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.setDuration(300L);
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS0S0302005_18(poiDishesGalleryFragment, alpha, view2, c19hl2, (poiGalleryAnchorData.x + (poiGalleryAnchorData.w / 2)) - (rectFLJFF.left + (rectFLJFF.width() / 2)), ((poiGalleryAnchorData.y - C12ES.LJIIJJI(c19gs)) + (poiGalleryAnchorData.h / 2)) - (c19hl2.getTop() + (((int) (height * fHeight)) / 2)), width, fWidth, height, fHeight, 1));
                            valueAnimatorOfFloat.addListener(new AAListenerS323S0100000_12(c19gs, 16));
                            valueAnimatorOfFloat.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C1182990gtF.LIZ.getClass();
            C1182990gtF.LJ(c19gs);
        }
    }

    public static final void LIZ$48(AkS87S0100000_18 akS87S0100000_18, View view) {
        PreviewPhotoFragment previewPhotoFragment = (PreviewPhotoFragment) akS87S0100000_18.l0;
        C19EG activity = previewPhotoFragment.getActivity();
        Fragment parentFragment = previewPhotoFragment;
        while (!(parentFragment instanceof TuxSheet)) {
            parentFragment = parentFragment.getParentFragment();
            if (parentFragment == null) {
                if (activity == null) {
                    return;
                }
                activity.onBackPressed();
                return;
            }
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIILJJIL(previewPhotoFragment);
    }

    public static final void LIZ$49(AkS87S0100000_18 akS87S0100000_18, View view) {
        Function0 function0 = (Function0) akS87S0100000_18.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$5(AkS87S0100000_18 akS87S0100000_18, View view) {
        MixVideosDialog mixVideosDialog = (MixVideosDialog) akS87S0100000_18.l0;
        mixVideosDialog.getClass();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C0XPD.LIZJ(mixVideosDialog, "playlist", "playlist_panel", null, new C1208960hZ8(mixVideosDialog, 0));
        } else {
            mixVideosDialog.oD2();
        }
    }

    public static final void LIZ$50(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((PoiDetailLimitedPostVerticalListAssem) akS87S0100000_18.l0).hp();
    }

    public static final void LIZ$51(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((PoiDetailLimitedPostVerticalListAssem) akS87S0100000_18.l0).hp();
    }

    public static final void LIZ$52(AkS87S0100000_18 akS87S0100000_18, View view) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((C1193400hA2) akS87S0100000_18.l0, C343970De7.LIZ);
    }

    public static final void LIZ$53(AkS87S0100000_18 akS87S0100000_18, View view) {
        C19EG activity = ((MyMomentsAddLocationFragment) akS87S0100000_18.l0).getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void LIZ$54(AkS87S0100000_18 akS87S0100000_18, View view) {
        String strLJJLIIIJJI;
        String str;
        String strZZ1;
        Float fValueOf;
        String str2;
        int iLongValue;
        int size;
        int iIntValue;
        InterfaceC1191710h7J interfaceC1191710h7J;
        int i;
        int length;
        FragmentManager supportFragmentManager;
        String str3;
        String str4;
        String strP40;
        JSONObject jSONObjectRE;
        String strLJJLIIIJJI2;
        PoiReviewsFoldedReviewCell poiReviewsFoldedReviewCell;
        PoiReviewsApi.PoiReviewModel poiReviewModel;
        String strYy;
        String str5;
        PoiReviewsFoldedReviewCell poiReviewsFoldedReviewCell2;
        PoiReviewsApi.PoiReviewModel poiReviewModel2;
        List<PoiReviewsApi.ImageDataModel> list;
        Long l;
        PoiReviewsApi.PoiReviewModel item = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).getItem();
        if (item != null && item.getHasFoldedReviews()) {
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            InterfaceC1191710h7J interfaceC1191710h7J2 = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).LL;
            String logId = null;
            if (interfaceC1191710h7J2 != null) {
                strLJJLIIIJJI = interfaceC1191710h7J2.LJJLIIIJJI();
            } else {
                strLJJLIIIJJI = null;
            }
            String str6 = "";
            if (strLJJLIIIJJI == null) {
                strLJJLIIIJJI = "";
            }
            String reviewId = item.getReviewId();
            if (reviewId == null) {
                reviewId = "";
            }
            PoiReviewsApi.PoiReviewUserModel author = item.getAuthor();
            if (author == null || (str = author.userId) == null) {
                str = "";
            }
            String poiId = item.getPoiId();
            if (poiId == null) {
                poiId = "";
            }
            InterfaceC1191710h7J interfaceC1191710h7J3 = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).LL;
            if (interfaceC1191710h7J3 == null || (strZZ1 = interfaceC1191710h7J3.ZZ1()) == null) {
                strZZ1 = "";
            }
            PoiReviewsApi.PoiReviewContentModel content = item.getContent();
            if (content != null) {
                fValueOf = Float.valueOf(C1190820h5s.LIZLLL(content));
            } else {
                fValueOf = null;
            }
            float fLIZIZ = C1175120ggY.LIZIZ(fValueOf);
            PoiReviewsApi.PoiReviewContentModel content2 = item.getContent();
            if (content2 != null) {
                str2 = content2.text;
            } else {
                str2 = null;
            }
            boolean zLIZ = C123100dR.LIZ(str2);
            int iI5 = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).I5();
            PoiReviewsApi.PoiReviewStatisticsModel statistics = item.getStatistics();
            if (statistics != null && (l = statistics.likeCount) != null) {
                iLongValue = (int) l.longValue();
            } else {
                iLongValue = 0;
            }
            PoiReviewsApi.PoiReviewContentModel content3 = item.getContent();
            if (content3 != null && (list = content3.images) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            Integer source = item.getSource();
            if (source != null) {
                iIntValue = source.intValue();
            } else {
                iIntValue = 0;
            }
            boolean z = true;
            if ((((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).I5() == 1 && (poiReviewModel2 = (poiReviewsFoldedReviewCell2 = (PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).LLJZ) != null && poiReviewsFoldedReviewCell2.N5(poiReviewModel2)) || ((interfaceC1191710h7J = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).LL) != null && interfaceC1191710h7J.x0())) {
                i = 1;
            } else {
                i = 0;
            }
            PoiReviewsApi.PoiReviewContentModel content4 = item.getContent();
            if (content4 != null && (str5 = content4.text) != null) {
                length = str5.length();
            } else {
                length = 0;
            }
            PageFinder pageFinderR5 = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).R5();
            Integer numValueOf = Integer.valueOf(i);
            Float fValueOf2 = Float.valueOf(fLIZIZ);
            Integer numValueOf2 = Integer.valueOf(zLIZ ? 1 : 0);
            Integer numValueOf3 = Integer.valueOf(iI5);
            Integer numValueOf4 = Integer.valueOf(iLongValue);
            Integer numValueOf5 = Integer.valueOf(size);
            Integer numValueOf6 = Integer.valueOf(length);
            c1191160h6Q.getClass();
            C1191160h6Q.LJJJ(strLJJLIIIJJI, numValueOf, reviewId, iIntValue, str, poiId, strZZ1, fValueOf2, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, null, pageFinderR5);
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).itemView.getContext());
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                C1190200h4s c1190200h4s = PoiReviewsFoldedReviewsSheetFragment.LLJJJJJIL;
                String strValueOf = String.valueOf(item.getPoiId());
                String strValueOf2 = String.valueOf(item.getReviewId());
                PoiReviewsApi.PoiReviewUserModel author2 = item.getAuthor();
                if (author2 != null) {
                    str3 = author2.userId;
                } else {
                    str3 = null;
                }
                String strValueOf3 = String.valueOf(str3);
                PoiReviewsApi.PoiReviewUserModel author3 = item.getAuthor();
                if (author3 != null) {
                    str4 = author3.nickname;
                } else {
                    str4 = null;
                }
                String strValueOf4 = String.valueOf(str4);
                InterfaceC1191710h7J interfaceC1191710h7J4 = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).LL;
                if (interfaceC1191710h7J4 == null || (strP40 = interfaceC1191710h7J4.P40()) == null) {
                    strP40 = "";
                }
                PoiReviewsFoldedReviewCell poiReviewsFoldedReviewCell3 = (PoiReviewsFoldedReviewCell) akS87S0100000_18.l0;
                InterfaceC1191710h7J interfaceC1191710h7J5 = poiReviewsFoldedReviewCell3.LL;
                if (interfaceC1191710h7J5 != null) {
                    jSONObjectRE = interfaceC1191710h7J5.rE(null, C1558360qeg.LJ(poiReviewsFoldedReviewCell3.itemView, null));
                } else {
                    jSONObjectRE = null;
                }
                String strValueOf5 = String.valueOf(jSONObjectRE);
                InterfaceC1191710h7J interfaceC1191710h7J6 = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).LL;
                if (interfaceC1191710h7J6 == null || (strLJJLIIIJJI2 = interfaceC1191710h7J6.LJJLIIIJJI()) == null) {
                    strLJJLIIIJJI2 = "";
                }
                InterfaceC1191710h7J interfaceC1191710h7J7 = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).LL;
                if (interfaceC1191710h7J7 != null) {
                    logId = interfaceC1191710h7J7.getLogId();
                }
                String strValueOf6 = String.valueOf(logId);
                InterfaceC1191710h7J interfaceC1191710h7J8 = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).LL;
                if (interfaceC1191710h7J8 != null && (strYy = interfaceC1191710h7J8.yy()) != null) {
                    str6 = strYy;
                }
                if (((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).I5() != 1 || (poiReviewModel = (poiReviewsFoldedReviewCell = (PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).LLJZ) == null || !poiReviewsFoldedReviewCell.N5(poiReviewModel)) {
                    z = false;
                }
                int iI52 = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).I5();
                c1190200h4s.getClass();
                C1190200h4s.LIZ(strValueOf, strValueOf2, strValueOf3, strValueOf4, strP40, strValueOf5, strLJJLIIIJJI2, strValueOf6, str6, z, item, iI52).show(supportFragmentManager, "reviews_sheet_tag");
            }
            C1440005kM.LIZ(new C584930Mwt());
        }
    }

    public static final void LIZ$55(AkS87S0100000_18 akS87S0100000_18, View view) {
        boolean zLJFF;
        String strLJJLIIIJJI;
        String str;
        String strZZ1;
        Float fValueOf;
        String str2;
        int iLongValue;
        int size;
        int length;
        String logId;
        String str3;
        String strYy;
        String strO32;
        int i;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        InterfaceC1191710h7J interfaceC1191710h7J;
        Integer num;
        String verifiedDisplay;
        PoiReviewsApi.PoiReviewStatusModel status;
        PoiReviewsApi.PoiReviewModel poiReviewModel;
        String str4;
        List<PoiReviewsApi.ImageDataModel> list;
        Long l;
        boolean zBooleanValue;
        Boolean bool;
        String strLJJLIIIJJI2;
        String str5;
        String strZZ12;
        Float fValueOf2;
        String str6;
        int iLongValue2;
        int size2;
        int length2;
        String logId2;
        String str7;
        String strYy2;
        String strO322;
        int i2;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF2;
        InterfaceC1191710h7J interfaceC1191710h7J2;
        Integer num2;
        String verifiedDisplay2;
        PoiReviewsApi.PoiReviewStatusModel status2;
        PoiReviewsApi.PoiReviewModel poiReviewModel2;
        String str8;
        List<PoiReviewsApi.ImageDataModel> list2;
        Long l2;
        PoiReviewsFoldedReviewCell poiReviewsFoldedReviewCell = (PoiReviewsFoldedReviewCell) akS87S0100000_18.l0;
        TuxIconView tuxIconView = poiReviewsFoldedReviewCell.LLJJIJIIJIL;
        if (tuxIconView != null) {
            tuxIconView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80L).withEndAction(new ARunnableS105S0100000_5(tuxIconView, 95)).start();
        }
        PoiReviewsApi.PoiReviewModel item = poiReviewsFoldedReviewCell.getItem();
        if (item != null) {
            PoiReviewsApi.PoiReviewUserStatusModel userStatus = item.getUserStatus();
            if (userStatus != null) {
                zLJFF = Intrinsics.LJFF(userStatus.liked, Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            int i3 = 1;
            if (zLJFF) {
                C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
                InterfaceC1191710h7J interfaceC1191710h7J3 = poiReviewsFoldedReviewCell.LL;
                if (interfaceC1191710h7J3 == null || (strLJJLIIIJJI2 = interfaceC1191710h7J3.LJJLIIIJJI()) == null) {
                    strLJJLIIIJJI2 = "";
                }
                String reviewId = item.getReviewId();
                if (reviewId == null) {
                    reviewId = "";
                }
                PoiReviewsApi.PoiReviewUserModel author = item.getAuthor();
                if (author == null || (str5 = author.userId) == null) {
                    str5 = "";
                }
                String poiId = item.getPoiId();
                if (poiId == null) {
                    poiId = "";
                }
                InterfaceC1191710h7J interfaceC1191710h7J4 = poiReviewsFoldedReviewCell.LL;
                if (interfaceC1191710h7J4 == null || (strZZ12 = interfaceC1191710h7J4.ZZ1()) == null) {
                    strZZ12 = "";
                }
                PoiReviewsApi.PoiReviewContentModel content = item.getContent();
                if (content != null) {
                    fValueOf2 = Float.valueOf(C1190820h5s.LIZLLL(content));
                } else {
                    fValueOf2 = null;
                }
                float fLIZIZ = C1175120ggY.LIZIZ(fValueOf2);
                PoiReviewsApi.PoiReviewContentModel content2 = item.getContent();
                if (content2 != null) {
                    str6 = content2.text;
                } else {
                    str6 = null;
                }
                boolean zLIZ = C123100dR.LIZ(str6);
                int iI5 = poiReviewsFoldedReviewCell.I5();
                PoiReviewsApi.PoiReviewStatisticsModel statistics = item.getStatistics();
                if (statistics != null && (l2 = statistics.likeCount) != null) {
                    iLongValue2 = (int) l2.longValue();
                } else {
                    iLongValue2 = 0;
                }
                PoiReviewsApi.PoiReviewContentModel content3 = item.getContent();
                if (content3 != null && (list2 = content3.images) != null) {
                    size2 = list2.size();
                } else {
                    size2 = 0;
                }
                PoiReviewsApi.PoiReviewContentModel content4 = item.getContent();
                if (content4 != null && (str8 = content4.text) != null) {
                    length2 = str8.length();
                } else {
                    length2 = 0;
                }
                InterfaceC1191710h7J interfaceC1191710h7J5 = poiReviewsFoldedReviewCell.LL;
                if (interfaceC1191710h7J5 != null) {
                    logId2 = interfaceC1191710h7J5.getLogId();
                } else {
                    logId2 = null;
                }
                String strValueOf = String.valueOf(item.getSource());
                PoiReviewsApi.PoiReviewContentModel content5 = item.getContent();
                if (content5 != null) {
                    str7 = content5.textLang;
                } else {
                    str7 = null;
                }
                boolean wantTranslate = item.getWantTranslate();
                InterfaceC1191710h7J interfaceC1191710h7J6 = poiReviewsFoldedReviewCell.LL;
                if (interfaceC1191710h7J6 != null) {
                    strYy2 = interfaceC1191710h7J6.yy();
                } else {
                    strYy2 = null;
                }
                InterfaceC1191710h7J interfaceC1191710h7J7 = poiReviewsFoldedReviewCell.LL;
                if (interfaceC1191710h7J7 != null) {
                    strO322 = interfaceC1191710h7J7.o32();
                } else {
                    strO322 = null;
                }
                if (item.isAnonymous()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                Fragment fragmentLJIIJ = C1189060h32.LJIIJ(poiReviewsFoldedReviewCell);
                if (fragmentLJIIJ != null) {
                    interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJIIJ, null);
                } else {
                    interfaceC665370Q7zLJFF2 = null;
                }
                if ((poiReviewsFoldedReviewCell.I5() != 1 || (poiReviewModel2 = poiReviewsFoldedReviewCell.LLJZ) == null || !poiReviewsFoldedReviewCell.N5(poiReviewModel2)) && ((interfaceC1191710h7J2 = poiReviewsFoldedReviewCell.LL) == null || !interfaceC1191710h7J2.x0())) {
                    i3 = 0;
                }
                PoiReviewsApi.PoiReviewModel poiReviewModel3 = poiReviewsFoldedReviewCell.LLJZ;
                if (poiReviewModel3 != null && (status2 = poiReviewModel3.getStatus()) != null) {
                    num2 = status2.status;
                } else {
                    num2 = null;
                }
                PoiReviewsApi.PoiReviewModel poiReviewModel4 = poiReviewsFoldedReviewCell.LLJZ;
                if (poiReviewModel4 != null) {
                    verifiedDisplay2 = poiReviewModel4.getVerifiedDisplay();
                } else {
                    verifiedDisplay2 = null;
                }
                PageFinder pageFinderR5 = poiReviewsFoldedReviewCell.R5();
                Boolean boolValueOf = Boolean.valueOf(wantTranslate);
                Integer numValueOf = Integer.valueOf(i3);
                c1191160h6Q.getClass();
                C1191160h6Q.LIZJ(strLJJLIIIJJI2, "review", reviewId, str5, poiId, strZZ12, fLIZIZ, zLIZ ? 1 : 0, iI5, iLongValue2, size2, length2, logId2, str7, boolValueOf, strYy2, strO322, "reviews_button", strValueOf, i2, interfaceC665370Q7zLJFF2, numValueOf, num2, verifiedDisplay2, pageFinderR5);
            } else {
                C1191160h6Q c1191160h6Q2 = C1191160h6Q.LIZ;
                InterfaceC1191710h7J interfaceC1191710h7J8 = poiReviewsFoldedReviewCell.LL;
                if (interfaceC1191710h7J8 == null || (strLJJLIIIJJI = interfaceC1191710h7J8.LJJLIIIJJI()) == null) {
                    strLJJLIIIJJI = "";
                }
                String reviewId2 = item.getReviewId();
                if (reviewId2 == null) {
                    reviewId2 = "";
                }
                PoiReviewsApi.PoiReviewUserModel author2 = item.getAuthor();
                if (author2 == null || (str = author2.userId) == null) {
                    str = "";
                }
                String poiId2 = item.getPoiId();
                if (poiId2 == null) {
                    poiId2 = "";
                }
                InterfaceC1191710h7J interfaceC1191710h7J9 = poiReviewsFoldedReviewCell.LL;
                if (interfaceC1191710h7J9 == null || (strZZ1 = interfaceC1191710h7J9.ZZ1()) == null) {
                    strZZ1 = "";
                }
                PoiReviewsApi.PoiReviewContentModel content6 = item.getContent();
                if (content6 != null) {
                    fValueOf = Float.valueOf(C1190820h5s.LIZLLL(content6));
                } else {
                    fValueOf = null;
                }
                float fLIZIZ2 = C1175120ggY.LIZIZ(fValueOf);
                PoiReviewsApi.PoiReviewContentModel content7 = item.getContent();
                if (content7 != null) {
                    str2 = content7.text;
                } else {
                    str2 = null;
                }
                boolean zLIZ2 = C123100dR.LIZ(str2);
                int iI52 = poiReviewsFoldedReviewCell.I5();
                PoiReviewsApi.PoiReviewStatisticsModel statistics2 = item.getStatistics();
                if (statistics2 != null && (l = statistics2.likeCount) != null) {
                    iLongValue = (int) l.longValue();
                } else {
                    iLongValue = 0;
                }
                PoiReviewsApi.PoiReviewContentModel content8 = item.getContent();
                if (content8 != null && (list = content8.images) != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                PoiReviewsApi.PoiReviewContentModel content9 = item.getContent();
                if (content9 != null && (str4 = content9.text) != null) {
                    length = str4.length();
                } else {
                    length = 0;
                }
                InterfaceC1191710h7J interfaceC1191710h7J10 = poiReviewsFoldedReviewCell.LL;
                if (interfaceC1191710h7J10 != null) {
                    logId = interfaceC1191710h7J10.getLogId();
                } else {
                    logId = null;
                }
                PoiReviewsApi.PoiReviewContentModel content10 = item.getContent();
                if (content10 != null) {
                    str3 = content10.textLang;
                } else {
                    str3 = null;
                }
                boolean wantTranslate2 = item.getWantTranslate();
                Integer source = item.getSource();
                InterfaceC1191710h7J interfaceC1191710h7J11 = poiReviewsFoldedReviewCell.LL;
                if (interfaceC1191710h7J11 != null) {
                    strYy = interfaceC1191710h7J11.yy();
                } else {
                    strYy = null;
                }
                InterfaceC1191710h7J interfaceC1191710h7J12 = poiReviewsFoldedReviewCell.LL;
                if (interfaceC1191710h7J12 != null) {
                    strO32 = interfaceC1191710h7J12.o32();
                } else {
                    strO32 = null;
                }
                if (item.isAnonymous()) {
                    i = 1;
                } else {
                    i = 0;
                }
                Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ(poiReviewsFoldedReviewCell);
                if (fragmentLJIIJ2 != null) {
                    interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ2, null);
                } else {
                    interfaceC665370Q7zLJFF = null;
                }
                if ((poiReviewsFoldedReviewCell.I5() != 1 || (poiReviewModel = poiReviewsFoldedReviewCell.LLJZ) == null || !poiReviewsFoldedReviewCell.N5(poiReviewModel)) && ((interfaceC1191710h7J = poiReviewsFoldedReviewCell.LL) == null || !interfaceC1191710h7J.x0())) {
                    i3 = 0;
                }
                Integer numValueOf2 = Integer.valueOf(i3);
                PoiReviewsApi.PoiReviewModel poiReviewModel5 = poiReviewsFoldedReviewCell.LLJZ;
                if (poiReviewModel5 != null && (status = poiReviewModel5.getStatus()) != null) {
                    num = status.status;
                } else {
                    num = null;
                }
                PoiReviewsApi.PoiReviewModel poiReviewModel6 = poiReviewsFoldedReviewCell.LLJZ;
                if (poiReviewModel6 != null) {
                    verifiedDisplay = poiReviewModel6.getVerifiedDisplay();
                } else {
                    verifiedDisplay = null;
                }
                PageFinder pageFinderR52 = poiReviewsFoldedReviewCell.R5();
                c1191160h6Q2.getClass();
                C1191160h6Q.LJIJ(strLJJLIIIJJI, "review", reviewId2, str, poiId2, strZZ1, fLIZIZ2, zLIZ2 ? 1 : 0, iI52, iLongValue, size, length, logId, str3, wantTranslate2, source, strYy, strO32, "reviews_button", i, interfaceC665370Q7zLJFF, numValueOf2, num, verifiedDisplay, pageFinderR52);
            }
            poiReviewsFoldedReviewCell.U5();
            if (!C848230XPh.LL.LJI()) {
                C0XPD.LIZJ(C1189060h32.LJIIJ(poiReviewsFoldedReviewCell), "poi_detail", "", null, new C1208950hZ7(poiReviewsFoldedReviewCell, item, 9));
                return;
            }
            InterfaceC1191710h7J interfaceC1191710h7J13 = poiReviewsFoldedReviewCell.LL;
            if (interfaceC1191710h7J13 == null) {
                return;
            }
            PoiReviewsApi.PoiReviewUserStatusModel userStatus2 = item.getUserStatus();
            if (userStatus2 != null && (bool = userStatus2.liked) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            interfaceC1191710h7J13.CJ(item, zBooleanValue);
        }
    }

    public static final void LIZ$56(AkS87S0100000_18 akS87S0100000_18, View view) {
        PoiReviewsApi.PoiReviewUserModel author;
        PoiReviewsApi.PoiReviewUserLevelInfoModel poiReviewUserLevelInfoModel;
        Integer num;
        String strO32;
        FragmentManager supportFragmentManager;
        String str;
        String strLJJLIIIJJI;
        PoiReviewsApi.PoiReviewModel item = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).getItem();
        if (item != null && (author = item.getAuthor()) != null && (poiReviewUserLevelInfoModel = author.userLevelInfo) != null && (num = poiReviewUserLevelInfoModel.level) != null && num.intValue() > 0) {
            InterfaceC1191710h7J interfaceC1191710h7J = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).LL;
            String str2 = null;
            if (interfaceC1191710h7J != null) {
                strO32 = interfaceC1191710h7J.o32();
            } else {
                strO32 = null;
            }
            if (!Intrinsics.LJFF(strO32, "folding_panel")) {
                if (item.getScene() == EnumC1189990h4X.POI_DETAIL_PAGE) {
                    if (!C1191930h7f.LIZ()) {
                        PoiReviewsApi.PoiReviewUserModel author2 = item.getAuthor();
                        if (author2 != null && Intrinsics.LJFF(author2.redirectReviewCenter, Boolean.TRUE)) {
                            Context context = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).itemView.getContext();
                            if (context != null) {
                                PoiReviewsFoldedReviewCell poiReviewsFoldedReviewCell = (PoiReviewsFoldedReviewCell) akS87S0100000_18.l0;
                                InterfaceC1191710h7J interfaceC1191710h7J2 = poiReviewsFoldedReviewCell.LL;
                                if (interfaceC1191710h7J2 != null) {
                                    strLJJLIIIJJI = interfaceC1191710h7J2.LJJLIIIJJI();
                                } else {
                                    strLJJLIIIJJI = null;
                                }
                                String poiId = item.getPoiId();
                                PoiReviewsApi.PoiReviewUserModel author3 = item.getAuthor();
                                if (author3 != null) {
                                    str2 = author3.userId;
                                }
                                poiReviewsFoldedReviewCell.T5("click_level", context, strLJJLIIIJJI, poiId, str2, ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).LLILLL);
                                return;
                            }
                            return;
                        }
                        Context context2 = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).itemView.getContext();
                        if (context2 == null) {
                            return;
                        }
                        PoiReviewsFoldedReviewCell poiReviewsFoldedReviewCell2 = (PoiReviewsFoldedReviewCell) akS87S0100000_18.l0;
                        PoiReviewsApi.PoiReviewUserModel author4 = item.getAuthor();
                        if (author4 != null) {
                            str2 = author4.userId;
                        }
                        poiReviewsFoldedReviewCell2.S5(context2, "click_level", str2, item.getReviewId());
                        return;
                    }
                    return;
                }
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).itemView.getContext());
                if (c19egLIZIZ == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
                    return;
                }
                C1191780h7Q c1191780h7Q = PoiReviewsUserLevelSheetFragment.LLJJL;
                ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).itemView.getContext();
                PoiReviewsApi.PoiReviewUserModel author5 = item.getAuthor();
                if (author5 == null || (str = author5.userId) == null) {
                    str = "";
                }
                String strValueOf = String.valueOf(item.getPoiId());
                String strValueOf2 = String.valueOf(item.getReviewId());
                c1191780h7Q.getClass();
                C1191780h7Q.LIZ(str, strValueOf, strValueOf2).show(supportFragmentManager, "reviews_shee_tag");
            }
        }
    }

    public static final void LIZ$57(AkS87S0100000_18 akS87S0100000_18, View view) {
        PoiReviewsApi.PoiReviewModel item = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).getItem();
        if (item != null) {
            if (item.getWantTranslate()) {
                ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).b6(false);
            } else {
                ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).a6(false);
            }
            InterfaceC1191710h7J interfaceC1191710h7J = ((PoiReviewsFoldedReviewCell) akS87S0100000_18.l0).LL;
            if (interfaceC1191710h7J != null) {
                interfaceC1191710h7J.xm0(item, !item.getWantTranslate());
            }
        }
    }

    public static final void LIZ$58(AkS87S0100000_18 akS87S0100000_18, View view) {
        String str;
        String string;
        PoiReviewsApi.PoiNpsInfo item = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).getItem();
        if (item != null) {
            ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5().listRemoveItem(item);
            if (item.getStoreNpsInfo().hasShowReasonModule) {
                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5();
                String str2 = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5().LL;
                String strZZ1 = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5().ZZ1();
                String strXQ2 = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5().xQ2();
                Integer num = item.getStoreNpsInfo().selectedScore;
                if (num != null) {
                    string = num.toString();
                } else {
                    string = null;
                }
                PageFinder pageFinderI5 = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).I5();
                c1185430gxB.getClass();
                C1185430gxB.LJJJJLI(str2, strZZ1, strXQ2, string, "click", pageFinderI5);
            } else if (item.getStoreNpsInfo().hasShowRatingModule) {
                C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
                ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5();
                String str3 = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5().LL;
                String strZZ12 = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5().ZZ1();
                if (item.getStoreNpsInfo().hasDoClick) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                PageFinder pageFinderI52 = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).I5();
                c1185430gxB2.getClass();
                C1185430gxB.LJJJJL(pageFinderI52, str3, strZZ12, "click", str);
            }
            if (item.getStoreNpsInfo().hasDoClick) {
                ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).S5();
            }
        }
    }

    public static final void LIZ$59(AkS87S0100000_18 akS87S0100000_18, View view) {
        List<PoiReviewsApi.NegativeReason> list;
        String string;
        String strLJJLIIIJ;
        PoiReviewsApi.PoiNpsInfo item = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).getItem();
        if (item != null && (list = item.getStoreNpsInfo().npsSelectedReason) != null && (!list.isEmpty())) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5();
            String str = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5().LL;
            String strZZ1 = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5().ZZ1();
            String strXQ2 = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5().xQ2();
            Integer num = item.getStoreNpsInfo().selectedScore;
            String string2 = null;
            if (num != null) {
                string = num.toString();
            } else {
                string = null;
            }
            List<PoiReviewsApi.NegativeReason> list2 = item.getStoreNpsInfo().npsSelectedReason;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                for (PoiReviewsApi.NegativeReason negativeReason : list2) {
                    if (C123100dR.LIZ(negativeReason.id)) {
                        arrayList.add(negativeReason);
                    }
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS256S0000000_18.get$arr$(876), 30);
            } else {
                strLJJLIIIJ = null;
            }
            PageFinder pageFinderI5 = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).I5();
            c1185430gxB.getClass();
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1189060h32.LJJ("enter_from", "poi_reviews", linkedHashMap);
            C1189060h32.LJJ("poi_id", str, linkedHashMap);
            C1189060h32.LJJ("reviews_id", strXQ2, linkedHashMap);
            C1189060h32.LJJ("star_level", string, linkedHashMap);
            C1189060h32.LJJ("unsatisfacted_reason_code", strLJJLIIIJ, linkedHashMap);
            C1189060h32.LIZ(strZZ1, linkedHashMap);
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderI5);
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ("ttls_reviews_csat_unsatisfacted_reason_submit", linkedHashMap, c1185050gwZ);
            PoiReviewsNpsItemCell poiReviewsNpsItemCell = (PoiReviewsNpsItemCell) akS87S0100000_18.l0;
            poiReviewsNpsItemCell.T5(new AwS419S0200000_18(poiReviewsNpsItemCell, item, 119));
            ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5().listRemoveItem(item);
            ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).S5();
            C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
            ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5();
            String str2 = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5().LL;
            String strZZ12 = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5().ZZ1();
            Integer num2 = item.getStoreNpsInfo().selectedScore;
            if (num2 != null) {
                string2 = num2.toString();
            }
            String strXQ22 = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).N5().xQ2();
            PageFinder pageFinderI52 = ((PoiReviewsNpsItemCell) akS87S0100000_18.l0).I5();
            c1185430gxB2.getClass();
            C1185430gxB.LJJJJLI(str2, strZZ12, strXQ22, string2, "auto", pageFinderI52);
        }
    }

    public static final void LIZ$6(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((MixVideosDialog) akS87S0100000_18.l0).iS();
    }

    public static final void LIZ$60(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public static final void LIZ$61(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function1) akS87S0100000_18.l0).invoke(EnumC1173840geU.CLOSE_BUTTON);
    }

    public static final void LIZ$62(AkS87S0100000_18 akS87S0100000_18, View view) {
        TuxIconView tuxIconView;
        PoiCampaignMapAssem poiCampaignMapAssem = (PoiCampaignMapAssem) akS87S0100000_18.l0;
        ObjectAnimator objectAnimator = poiCampaignMapAssem.LLJJIJI;
        if ((objectAnimator == null || !objectAnimator.isStarted()) && (tuxIconView = poiCampaignMapAssem.LLJJIII) != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView, (Property<TuxIconView, Float>) View.ROTATION, 360.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            poiCampaignMapAssem.LLJJIJI = objectAnimatorOfFloat;
            ObjectAnimator objectAnimator2 = poiCampaignMapAssem.LLJJIJI;
            if (objectAnimator2 != null) {
                C786410Ut5.Pd(objectAnimator2);
            }
        }
        ((PoiCampaignMapAssem) akS87S0100000_18.l0).Jo().vQ2();
    }

    public static final void LIZ$63(AkS87S0100000_18 akS87S0100000_18, View view) {
        String str;
        AssemVMLazy assemVMLazy = ((PoiClaimHeaderAssem) akS87S0100000_18.l0).LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiClaimHeaderAssem.LLJIJIL;
        C1200780hLw c1200780hLw = ((PoiClaimViewModel) assemVMLazy.getValue()).LL;
        if (c1200780hLw != null && (str = c1200780hLw.LIZJ) != null && Intrinsics.LJFF(str, "upload_image_page")) {
            IPoiClaimFragmentAbility iPoiClaimFragmentAbility = (IPoiClaimFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL((PoiClaimHeaderAssem) akS87S0100000_18.l0), IPoiClaimFragmentAbility.class, null);
            if (iPoiClaimFragmentAbility != null) {
                iPoiClaimFragmentAbility.Dc();
                return;
            }
            return;
        }
        C1200750hLt c1200750hLt = ((PoiClaimViewModel) ((PoiClaimHeaderAssem) akS87S0100000_18.l0).LLJI.getValue()).LLILLJJLI;
        c1200750hLt.LIZIZ(c1200750hLt, C1558520qew.LJIIL((PoiClaimHeaderAssem) akS87S0100000_18.l0));
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$64(irm.AkS87S0100000_18 r45, android.view.View r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS87S0100000_18.LIZ$64(irm.AkS87S0100000_18, android.view.View):void");
    }

    public static final void LIZ$65(AkS87S0100000_18 akS87S0100000_18, View view) {
        AbstractC1387200mCc abstractC1387200mCcLIZ = C520040KaQ.LIZ(((PoiBackgroundMapComponent) akS87S0100000_18.l0).tp().LLILZ);
        if (abstractC1387200mCcLIZ != null) {
            abstractC1387200mCcLIZ.LIZ();
        }
    }

    public static final void LIZ$66(AkS87S0100000_18 akS87S0100000_18, View view) {
        PoiMapModeFilterVM poiMapModeFilterVMGo = ((PoiMapModeFilterAssem) akS87S0100000_18.l0).Go();
        poiMapModeFilterVMGo.withState(new AwS597S0100000_18(poiMapModeFilterVMGo, 1051));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$67(irm.AkS87S0100000_18 r19, android.view.View r20) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS87S0100000_18.LIZ$67(irm.AkS87S0100000_18, android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ed A[PHI: r5 r6 r7 r20
      0x01ed: PHI (r5v10 java.lang.String) = (r5v9 java.lang.String), (r5v14 java.lang.String) binds: [B:75:0x01e9, B:37:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v8 java.lang.String) binds: [B:75:0x01e9, B:37:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v6 java.lang.String) binds: [B:75:0x01e9, B:37:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r20v1 java.lang.String) = (r20v0 java.lang.String), (r20v5 java.lang.String) binds: [B:75:0x01e9, B:37:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f3 A[PHI: r5 r6 r7 r20 r21
      0x01f3: PHI (r5v11 java.lang.String) = (r5v10 java.lang.String), (r5v13 java.lang.String) binds: [B:78:0x01ef, B:40:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v7 java.lang.String) binds: [B:78:0x01ef, B:40:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v5 java.lang.String) binds: [B:78:0x01ef, B:40:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r20v2 java.lang.String) = (r20v1 java.lang.String), (r20v4 java.lang.String) binds: [B:78:0x01ef, B:40:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r21v1 java.util.List<java.lang.String>) = (r21v0 java.util.List<java.lang.String>), (r21v3 java.util.List<java.lang.String>) binds: [B:78:0x01ef, B:40:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$68(irm.AkS87S0100000_18 r31, android.view.View r32) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS87S0100000_18.LIZ$68(irm.AkS87S0100000_18, android.view.View):void");
    }

    public static final void LIZ$69(AkS87S0100000_18 akS87S0100000_18, View view) {
        C1163730gOB c1163730gOB = (C1163730gOB) akS87S0100000_18.l0;
        Function2<C1163730gOB, Boolean, Unit> function2 = c1163730gOB.LLILLL;
        if (function2 != null) {
            function2.invoke(c1163730gOB, Boolean.TRUE);
        }
    }

    public static final void LIZ$7(AkS87S0100000_18 akS87S0100000_18, View view) {
        if (!(((MixVideosDialog) akS87S0100000_18.l0).getActivity() instanceof MixVideoDetailActivity) && !C297010BkZ.LIZ()) {
            ((MixVideosDialog) akS87S0100000_18.l0).gS().wQ2();
        }
        MixVideosDialog mixVideosDialog = (MixVideosDialog) akS87S0100000_18.l0;
        mixVideosDialog.LLJL = false;
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(mixVideosDialog, C343970De7.LIZ);
    }

    public static final void LIZ$70(AkS87S0100000_18 akS87S0100000_18, View view) {
        Integer num;
        PoiDetailApi.ChartTab chartTab;
        PoiDetailChartsV3PageCardReusedAssem poiDetailChartsV3PageCardReusedAssem = (PoiDetailChartsV3PageCardReusedAssem) akS87S0100000_18.l0;
        C1173160gdO c1173160gdO = poiDetailChartsV3PageCardReusedAssem.LLJL;
        if (c1173160gdO != null && (chartTab = c1173160gdO.getChartTab()) != null) {
            num = chartTab.chartType;
        } else {
            num = null;
        }
        poiDetailChartsV3PageCardReusedAssem.sp(num, "view_all");
    }

    public static final void LIZ$71(AkS87S0100000_18 akS87S0100000_18, View view) {
        Integer num;
        PoiDetailApi.ChartTab chartTab;
        PoiDetailChartsV3PageCardReusedAssem poiDetailChartsV3PageCardReusedAssem = (PoiDetailChartsV3PageCardReusedAssem) akS87S0100000_18.l0;
        C1173160gdO c1173160gdO = poiDetailChartsV3PageCardReusedAssem.LLJL;
        if (c1173160gdO != null && (chartTab = c1173160gdO.getChartTab()) != null) {
            num = chartTab.chartType;
        } else {
            num = null;
        }
        poiDetailChartsV3PageCardReusedAssem.sp(num, "title_word");
    }

    public static final void LIZ$72(AkS87S0100000_18 akS87S0100000_18, View view) {
        Integer num;
        PoiDetailApi.ChartTab chartTab;
        PoiDetailChartsV3PageCardReusedAssem poiDetailChartsV3PageCardReusedAssem = (PoiDetailChartsV3PageCardReusedAssem) akS87S0100000_18.l0;
        C1173160gdO c1173160gdO = poiDetailChartsV3PageCardReusedAssem.LLJL;
        if (c1173160gdO != null && (chartTab = c1173160gdO.getChartTab()) != null) {
            num = chartTab.chartType;
        } else {
            num = null;
        }
        poiDetailChartsV3PageCardReusedAssem.sp(num, "title_blank");
    }

    public static final void LIZ$73(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((PoiOrderSubmitSlashFragment) akS87S0100000_18.l0).UV().vQ2(((PoiOrderSubmitSlashFragment) akS87S0100000_18.l0).UV().getState().LL);
    }

    public static final void LIZ$8(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public static final void LIZ$9(AkS87S0100000_18 akS87S0100000_18, View view) {
        ((Function0) akS87S0100000_18.l0).invoke();
    }

    public AkS87S0100000_18(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
