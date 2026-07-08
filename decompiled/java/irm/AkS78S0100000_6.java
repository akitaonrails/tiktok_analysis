package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0GRD;
import X.C0H4U;
import X.C0H7C;
import X.C0HPQ;
import X.C0HQG;
import X.C0P0T;
import X.C1181890grT;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1389880mGw;
import X.C1390920mIc;
import X.C1391190mJ3;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19549411e8;
import X.C20684815ws;
import X.C23250099c;
import X.C2344009Gk;
import X.C343970De7;
import X.C371330Eh9;
import X.C435280H5a;
import X.C440370HOp;
import X.C441660HTo;
import X.C441730HTv;
import X.C442060HVc;
import X.C442090HVf;
import X.C442110HVh;
import X.C446060HeO;
import X.C451800Hne;
import X.C455070Hsv;
import X.C455080Hsw;
import X.C631370Opb;
import X.C724240Sb0;
import X.EnumC440220HOa;
import X.EnumC440980HQy;
import X.EnumC441640HTm;
import X.InterfaceC434580H2i;
import X.InterfaceC665370Q7z;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.poi.commonalbum.model.AlbumTrackParams;
import com.ss.android.ugc.aweme.poi.commonalbum.ui.ITTLSPhotoAbility;
import com.ss.android.ugc.aweme.poi.commonalbum.ui.LocalServiceAlbumHeaderAssem;
import com.ss.android.ugc.aweme.poi.commonalbum.ui.LocalServiceHorizontalPhotoCell;
import com.ss.android.ugc.aweme.poi.commonalbum.ui.LocalServiceRequestMediaAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.IPoiTagAbility;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell.PoiCategoryNameCell;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell.PoiHotelOpeningCell;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.map.cell.PoiChipCell;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditIconV2Assem;
import com.ss.android.ugc.aweme.prop.mobileefffect.hint.EffectIconAutoApplyHintFragment;
import com.ss.android.ugc.aweme.prop.mobileefffect.hint.EffectInfoHintFragment;
import com.ss.android.ugc.aweme.publish.detail.categoryicon.EffectPublishCategoryIconAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.IReferenceListAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.BaseReferenceItemAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.tab.ISearchMultiSummaryTabAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.tab.SearchMultiSummaryTabItemAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.elements.HomePageElementRowPowerCell;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageViewModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.AwS65S2100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class AkS78S0100000_6 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

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
            default:
                super.LIZ(view);
                break;
        }
    }

    public AkS78S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AkS78S0100000_6 akS78S0100000_6, View view) {
        SmartRouter.buildRoute(((C19549411e8) akS78S0100000_6.l0).getContext(), "aweme://webview?url=https%3A%2F%2Fspeech.tiktokv.com%2Fweb%2Flegal%2Fmemesong%3Fuse_spark%3D1%26bdhm_bid%3Dspeech_tt_legal").open();
    }

    public static final void LIZ$1(AkS78S0100000_6 akS78S0100000_6, View view) {
        AwS65S2100000_27 awS65S2100000_27 = ((C446060HeO) akS78S0100000_6.l0).LJIIIIZZ;
        if (awS65S2100000_27 != null) {
            awS65S2100000_27.invoke();
        }
    }

    public static final void LIZ$10(AkS78S0100000_6 akS78S0100000_6, View view) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((MixStudioResultsBaseAssem) akS78S0100000_6.l0), null, null, new C0HQG((MixStudioResultsBaseAssem) akS78S0100000_6.l0, null), 3);
    }

    public static final void LIZ$11(AkS78S0100000_6 akS78S0100000_6, View view) {
        C435280H5a c435280H5a = (C435280H5a) akS78S0100000_6.l0;
        Function1<C435280H5a, Unit> function1 = c435280H5a.LLIZLLLIL;
        if (function1 != null) {
            function1.invoke(c435280H5a);
        }
    }

    public static final void LIZ$12(AkS78S0100000_6 akS78S0100000_6, View view) {
        C435280H5a c435280H5a = (C435280H5a) akS78S0100000_6.l0;
        Function1<C435280H5a, Unit> function1 = c435280H5a.LLIZLLLIL;
        if (function1 != null) {
            function1.invoke(c435280H5a);
        }
    }

    public static final void LIZ$13(AkS78S0100000_6 akS78S0100000_6, View view) {
        ((Function0) akS78S0100000_6.l0).invoke();
    }

    public static final void LIZ$14(AkS78S0100000_6 akS78S0100000_6, View view) {
        ((Function0) akS78S0100000_6.l0).invoke();
    }

    public static final void LIZ$15(AkS78S0100000_6 akS78S0100000_6, View view) {
        ((Function0) akS78S0100000_6.l0).invoke();
    }

    public static final void LIZ$16(AkS78S0100000_6 akS78S0100000_6, View view) {
        ((Function0) akS78S0100000_6.l0).invoke();
    }

    public static final void LIZ$17(AkS78S0100000_6 akS78S0100000_6, View view) {
        MixStudioHomePageAssem mixStudioHomePageAssem = (MixStudioHomePageAssem) akS78S0100000_6.l0;
        EnumC440220HOa enumC440220HOa = EnumC440220HOa.GENERATE;
        int i = MixStudioHomePageAssem.LLLZI;
        mixStudioHomePageAssem.Gp(enumC440220HOa, null);
        C440370HOp c440370HOp = C440370HOp.LIZ;
        EnumC441640HTm enumC441640HTmVQ2 = ((MixStudioHomePageAssem) akS78S0100000_6.l0).hp().vQ2();
        c440370HOp.getClass();
        C440370HOp.LJIIIZ(enumC441640HTmVQ2);
        C1389880mGw c1389880mGw = new C1389880mGw(((MixStudioHomePageAssem) akS78S0100000_6.l0).getContentView());
        c1389880mGw.LJIIIIZZ(2131835880);
        c1389880mGw.LJIIJ();
    }

    public static final void LIZ$18(AkS78S0100000_6 akS78S0100000_6, View view) {
        MixStudioHomePageAssem mixStudioHomePageAssem = (MixStudioHomePageAssem) akS78S0100000_6.l0;
        EnumC440220HOa enumC440220HOa = EnumC440220HOa.GENERATE;
        int i = MixStudioHomePageAssem.LLLZI;
        mixStudioHomePageAssem.Gp(enumC440220HOa, null);
        C440370HOp c440370HOp = C440370HOp.LIZ;
        EnumC441640HTm enumC441640HTmVQ2 = ((MixStudioHomePageAssem) akS78S0100000_6.l0).hp().vQ2();
        c440370HOp.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C441660HTo.LIZ(c2344009Gk, enumC441640HTmVQ2);
        C20684815ws.LJIILLIIL("imagine_studio_show_select_element_toast", c2344009Gk.LIZ);
        C1389880mGw c1389880mGw = new C1389880mGw(((MixStudioHomePageAssem) akS78S0100000_6.l0).getContentView());
        c1389880mGw.LJIIIIZZ(2131835862);
        c1389880mGw.LJIIJ();
    }

    public static final void LIZ$19(AkS78S0100000_6 akS78S0100000_6, View view) {
        IPoiTagAbility iPoiTagAbility;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiCategoryNameCell) akS78S0100000_6.l0);
        if (fragmentLJIIJ != null && (iPoiTagAbility = (IPoiTagAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IPoiTagAbility.class, null)) != null) {
            iPoiTagAbility.DD(((PoiCategoryNameCell) akS78S0100000_6.l0).itemView, null, null, "click_tag");
        }
    }

    public static final void LIZ$2(AkS78S0100000_6 akS78S0100000_6, View view) {
        MediaModel mediaModel;
        Fragment fragmentLJIIJ;
        ITTLSPhotoAbility iTTLSPhotoAbility;
        C0H7C item = ((LocalServiceHorizontalPhotoCell) akS78S0100000_6.l0).getItem();
        if (item != null && (mediaModel = item.LL) != null && (fragmentLJIIJ = C1189060h32.LJIIJ((LocalServiceHorizontalPhotoCell) akS78S0100000_6.l0)) != null && (iTTLSPhotoAbility = (ITTLSPhotoAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), ITTLSPhotoAbility.class, null)) != null) {
            iTTLSPhotoAbility.WW1(mediaModel);
        }
    }

    public static final void LIZ$20(AkS78S0100000_6 akS78S0100000_6, View view) {
        C0P0T tooltip = ((C441730HTv) akS78S0100000_6.l0).getTooltip();
        if (tooltip != null) {
            tooltip.dismiss();
        }
    }

    public static final void LIZ$21(AkS78S0100000_6 akS78S0100000_6, View view) {
        IReferenceListAbility iReferenceListAbility = (IReferenceListAbility) C1558520qew.LIZ(C1558520qew.LJIIL((BaseReferenceItemAssem) akS78S0100000_6.l0), IReferenceListAbility.class, null);
        if (iReferenceListAbility != null) {
            iReferenceListAbility.lE0(((InterfaceC434580H2i) C631370Opb.LIZ((BaseReferenceItemAssem) akS78S0100000_6.l0)).getIndex());
        }
    }

    public static final void LIZ$22(AkS78S0100000_6 akS78S0100000_6, View view) {
        FragmentManager childFragmentManager;
        EffectPublishCategoryIconAssem effectPublishCategoryIconAssem = (EffectPublishCategoryIconAssem) akS78S0100000_6.l0;
        effectPublishCategoryIconAssem.getClass();
        Fragment fragmentLJI = C724240Sb0.LJI(effectPublishCategoryIconAssem);
        if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null && effectPublishCategoryIconAssem.getContext() != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = new EffectInfoHintFragment();
            c1390920mIc.LJIIIIZZ(0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLLL = false;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0Ht1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                }
            };
            tuxSheet.show(childFragmentManager, "EffectPublishCategoryIconAssem");
        }
    }

    public static final void LIZ$23(AkS78S0100000_6 akS78S0100000_6, View view) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((EffectIconAutoApplyHintFragment) akS78S0100000_6.l0, C455070Hsv.LIZ);
    }

    public static final void LIZ$24(AkS78S0100000_6 akS78S0100000_6, View view) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((EffectIconAutoApplyHintFragment) akS78S0100000_6.l0, C455080Hsw.LIZ);
    }

    public static final void LIZ$25(AkS78S0100000_6 akS78S0100000_6, View view) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((EffectInfoHintFragment) akS78S0100000_6.l0, C343970De7.LIZ);
    }

    public static final void LIZ$26(AkS78S0100000_6 akS78S0100000_6, View view) {
        ((Function0) akS78S0100000_6.l0).invoke();
    }

    public static final void LIZ$27(AkS78S0100000_6 akS78S0100000_6, View view) {
        AlbumTrackParams albumTrackParams;
        Map<String, String> map = null;
        ITTLSPhotoAbility iTTLSPhotoAbility = (ITTLSPhotoAbility) C1558520qew.LIZ(C1558520qew.LJIIL((LocalServiceRequestMediaAssem) akS78S0100000_6.l0), ITTLSPhotoAbility.class, null);
        if (iTTLSPhotoAbility != null) {
            iTTLSPhotoAbility.zU1();
        }
        int iZQ2 = ((LocalServiceRequestMediaAssem) akS78S0100000_6.l0).Ho().zQ2();
        boolean zYQ2 = ((LocalServiceRequestMediaAssem) akS78S0100000_6.l0).Ho().yQ2();
        String strXQ2 = ((LocalServiceRequestMediaAssem) akS78S0100000_6.l0).Ho().xQ2();
        PageFinder pageFinderVia = PageFinder.via(((LocalServiceRequestMediaAssem) akS78S0100000_6.l0).LJJIJL());
        C442110HVh c442110HVh = ((LocalServiceRequestMediaAssem) akS78S0100000_6.l0).Ho().LLJI;
        if (c442110HVh != null && (albumTrackParams = c442110HVh.LJFF) != null) {
            map = albumTrackParams.generalMobParams;
        }
        C442090HVf.LIZ(iZQ2, zYQ2, strXQ2, pageFinderVia, map);
    }

    public static final void LIZ$28(AkS78S0100000_6 akS78S0100000_6, View view) {
        ITTLSPhotoAbility iTTLSPhotoAbility = (ITTLSPhotoAbility) C1558520qew.LIZ(C1558520qew.LJIIL((LocalServiceAlbumHeaderAssem) akS78S0100000_6.l0), ITTLSPhotoAbility.class, null);
        if (iTTLSPhotoAbility != null) {
            iTTLSPhotoAbility.u3();
        }
    }

    public static final void LIZ$29(AkS78S0100000_6 akS78S0100000_6, View view) {
        ((LocalServiceRequestMediaAssem) akS78S0100000_6.l0).MO2();
        C442060HVc.LIZ = true;
    }

    public static final void LIZ$3(AkS78S0100000_6 akS78S0100000_6, View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        IPoiTagAbility iPoiTagAbility;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiHotelOpeningCell) akS78S0100000_6.l0);
        String strMobPicMode = null;
        if (fragmentLJIIJ != null && (iPoiTagAbility = (IPoiTagAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IPoiTagAbility.class, null)) != null) {
            iPoiTagAbility.DD(((PoiHotelOpeningCell) akS78S0100000_6.l0).itemView, null, null, "click_tag");
        }
        PoiListApi.PoiDetailResponse poiDetailResponseLIZ = C1181890grT.LIZ(C1189060h32.LJIIJ((PoiHotelOpeningCell) akS78S0100000_6.l0));
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ((PoiHotelOpeningCell) akS78S0100000_6.l0);
        if (fragmentLJIIJ2 != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ2, null);
        } else {
            interfaceC665370Q7zLJFF = null;
        }
        String strI5 = PoiHotelOpeningCell.I5(((PoiHotelOpeningCell) akS78S0100000_6.l0).getItem());
        if (poiDetailResponseLIZ != null) {
            strMobPicMode = poiDetailResponseLIZ.mobPicMode();
        }
        PageFinder pageFinderVia = PageFinder.via((PoiHotelOpeningCell) akS78S0100000_6.l0);
        c1185430gxB.getClass();
        C1185430gxB.LJJIZ(pageFinderVia, interfaceC665370Q7zLJFF, strI5, "ordinary", strMobPicMode, "ordinary", false);
    }

    public static final void LIZ$30(AkS78S0100000_6 akS78S0100000_6, View view) {
        String str;
        AlbumTrackParams albumTrackParams;
        if (!((LocalServiceAlbumHeaderAssem) akS78S0100000_6.l0).Ho().LLILZIL.isEmpty()) {
            if (Intrinsics.LJFF(((LocalServiceAlbumHeaderAssem) akS78S0100000_6.l0).Ho().getState().LLJI, Boolean.TRUE)) {
                ((LocalServiceAlbumHeaderAssem) akS78S0100000_6.l0).Ho().setState(new AwS21S0010000_6(false, 28));
            } else {
                ((LocalServiceAlbumHeaderAssem) akS78S0100000_6.l0).Ho().setState(new AwS21S0010000_6(true, 28));
            }
            int iZQ2 = ((LocalServiceAlbumHeaderAssem) akS78S0100000_6.l0).Ho().zQ2();
            boolean zYQ2 = ((LocalServiceAlbumHeaderAssem) akS78S0100000_6.l0).Ho().yQ2();
            String strXQ2 = ((LocalServiceAlbumHeaderAssem) akS78S0100000_6.l0).Ho().xQ2();
            PageFinder pageFinderVia = PageFinder.via(((LocalServiceAlbumHeaderAssem) akS78S0100000_6.l0).LJJIJL());
            C442110HVh c442110HVh = ((LocalServiceAlbumHeaderAssem) akS78S0100000_6.l0).Ho().LLJI;
            Map<String, String> map = null;
            if (c442110HVh != null && (albumTrackParams = c442110HVh.LJFF) != null) {
                map = albumTrackParams.generalMobParams;
            }
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null && (true ^ map.isEmpty())) {
                linkedHashMap.putAll(map);
            }
            C1189060h32.LJJ("eligible_post_image_cnt", String.valueOf(iZQ2), linkedHashMap);
            if (zYQ2) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C1189060h32.LJJ("is_camera_available", str, linkedHashMap);
            C1189060h32.LJJ("album_available_type", strXQ2, linkedHashMap);
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ("ttls_album_click", linkedHashMap, c1185050gwZ);
        }
    }

    public static final void LIZ$4(AkS78S0100000_6 akS78S0100000_6, View view) {
        Function0<Unit> function0;
        Function2<Integer, C0H4U, Unit> function2;
        C0H4U item;
        C0H4U item2 = ((PoiChipCell) akS78S0100000_6.l0).getItem();
        if (item2 == null || !item2.LLILLL || ((item = ((PoiChipCell) akS78S0100000_6.l0).getItem()) != null && item.LLJ)) {
            C0H4U item3 = ((PoiChipCell) akS78S0100000_6.l0).getItem();
            if (item3 != null && (function2 = item3.LLJIJIL) != null) {
                function2.invoke(Integer.valueOf(((PoiChipCell) akS78S0100000_6.l0).getLayoutPosition()), ((PoiChipCell) akS78S0100000_6.l0).getItem());
            }
            C0H4U item4 = ((PoiChipCell) akS78S0100000_6.l0).getItem();
            if (item4 != null && (function0 = item4.LLILZIL) != null) {
                function0.invoke();
            }
        }
    }

    public static final void LIZ$5(AkS78S0100000_6 akS78S0100000_6, View view) {
        FragmentManager childFragmentManager;
        EffectEditIconV2Assem effectEditIconV2Assem = (EffectEditIconV2Assem) akS78S0100000_6.l0;
        effectEditIconV2Assem.getClass();
        Fragment fragmentLJI = C724240Sb0.LJI(effectEditIconV2Assem);
        if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null && effectEditIconV2Assem.getContext() != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = new EffectInfoHintFragment();
            c1390920mIc.LJIIIIZZ(0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLLL = false;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0Ht2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                }
            };
            tuxSheet.show(childFragmentManager, "EffectEditIconV2Assem");
        }
    }

    public static final void LIZ$6(AkS78S0100000_6 akS78S0100000_6, View view) {
        ISearchMultiSummaryTabAbility iSearchMultiSummaryTabAbility;
        SearchMultiSummaryTabItemAssem searchMultiSummaryTabItemAssem = (SearchMultiSummaryTabItemAssem) akS78S0100000_6.l0;
        C371330Eh9 c371330Eh9 = searchMultiSummaryTabItemAssem.LLJL;
        if (c371330Eh9 != null && (iSearchMultiSummaryTabAbility = (ISearchMultiSummaryTabAbility) C1558520qew.LIZ((InterfaceC665370Q7z) searchMultiSummaryTabItemAssem.LLJLIL.getValue(), ISearchMultiSummaryTabAbility.class, null)) != null) {
            iSearchMultiSummaryTabAbility.rJ(((C451800Hne) C631370Opb.LIZ((SearchMultiSummaryTabItemAssem) akS78S0100000_6.l0)).LL, ((C451800Hne) C631370Opb.LIZ((SearchMultiSummaryTabItemAssem) akS78S0100000_6.l0)).LLILLL, c371330Eh9);
        }
    }

    public static final void LIZ$7(AkS78S0100000_6 akS78S0100000_6, View view) {
        C0HPQ c0hpqL5 = ((HomePageElementRowPowerCell) akS78S0100000_6.l0).L5();
        if (c0hpqL5 != null) {
            c0hpqL5.o8();
        }
    }

    public static final void LIZ$8(AkS78S0100000_6 akS78S0100000_6, View view) {
        C0GRD c0grd = ((MixStudioHomePageAssem) akS78S0100000_6.l0).LLJLL;
        if (c0grd != null && c0grd.getVisibility() == 0) {
            MixStudioHomePageViewModel mixStudioHomePageViewModelMp = ((MixStudioHomePageAssem) akS78S0100000_6.l0).mp();
            mixStudioHomePageViewModelMp.getClass();
            mixStudioHomePageViewModelMp.setState(new AwS21S0010000_6(true, 17));
        }
    }

    public static final void LIZ$9(AkS78S0100000_6 akS78S0100000_6, View view) {
        ((MixStudioResultsBaseAssem) akS78S0100000_6.l0).Ep(EnumC440980HQy.SAVE);
        ((MixStudioResultsBaseAssem) akS78S0100000_6.l0).hp().setState(AFwS236S0000000_6.get$arr$(437));
    }
}
