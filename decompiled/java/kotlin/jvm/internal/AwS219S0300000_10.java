package kotlin.jvm.internal;

import X.AbstractC1538740q92;
import X.AbstractC653010PjP;
import X.C020Z;
import X.C09AY;
import X.C0P7A;
import X.C0PC5;
import X.C0PCX;
import X.C0PCY;
import X.C0PHI;
import X.C0PM7;
import X.C0PMP;
import X.C0PRC;
import X.C0PSI;
import X.C0PTQ;
import X.C0PTW;
import X.C0Q3E;
import X.C0Q6W;
import X.C0QXR;
import X.C0QXU;
import X.C0QXV;
import X.C0R0K;
import X.C0R0L;
import X.C0RTB;
import X.C0SY7;
import X.C1202104n5;
import X.C1388190mED;
import X.C13LE;
import X.C1443560nfW;
import X.C1537830q7Z;
import X.C1538590q8n;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1603960rqE;
import X.C1742080vR0;
import X.C19EG;
import X.C201981141j;
import X.C20248814Kw;
import X.C2082308Dt;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C259800zU;
import X.C291001Au;
import X.C294600Bgg;
import X.C297040Bkc;
import X.C301530Brr;
import X.C329550Cvx;
import X.C329680CwA;
import X.C329910CwX;
import X.C418440Gaw;
import X.C430890Gv1;
import X.C486180J4u;
import X.C640970PCd;
import X.C642240PHa;
import X.C642440PHu;
import X.C646370PWx;
import X.C651970Phj;
import X.C651980Phk;
import X.C652990PjN;
import X.C654210PlL;
import X.C654290PlT;
import X.C654790PmH;
import X.C654820PmK;
import X.C655000Pmc;
import X.C656840Ppa;
import X.C656850Ppb;
import X.C657810Pr9;
import X.C657890PrH;
import X.C658480PsE;
import X.C658630PsT;
import X.C658910Psv;
import X.C662670Pyz;
import X.C663070Pzd;
import X.C663990Q2r;
import X.C670730QSp;
import X.C676120Qfa;
import X.C676180Qfg;
import X.C676750Qgb;
import X.C677480Qhm;
import X.C678240Qj0;
import X.C678330Qj9;
import X.C678700Qjk;
import X.C682930QqZ;
import X.C683220Qr2;
import X.C684930Qtn;
import X.C685070Qu1;
import X.C694070RKj;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1987707qV;
import X.EnumC2211841BhW;
import X.EnumC654070Pl7;
import X.InterfaceC111300bX;
import X.InterfaceC1210900hcG;
import X.InterfaceC1858000yRy;
import X.InterfaceC594520NTm;
import X.InterfaceC641090PCp;
import X.InterfaceC645100PSa;
import X.InterfaceC652950PjJ;
import X.InterfaceC655050Pmh;
import X.InterfaceC657840PrC;
import X.InterfaceC665370Q7z;
import X.InterfaceC676480QgA;
import X.InterfaceC678480QjO;
import X.ViewOnAttachStateChangeListenerC655110Pmn;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.NimbleMobAbility;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.entrycard.viewmodel.SearchEntranceVM;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchSingleCardTemplateAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3Assem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3EntranceAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3PanelAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1SurroundedImageListAssem;
import com.ss.android.ugc.aweme.search.pages.result.photosearch.SearchCardCellCommonAbilityImpl;
import com.ss.android.ugc.aweme.search.pages.result.photosearch.SearchCardCellMobAbilityImpl;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.helppost.model.SearchHelpPostCard;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui.SearchMixLiveCardContentAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ui.cell.SearchCardBaseCell;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.vision.IPhotoSearchService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.ss.android.ugc.aweme.vision.model.ProductCard;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AwS219S0300000_10 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS219S0300000_10 awS219S0300000_10, Object obj) throws JSONException {
        int size;
        String str;
        String str2;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchLogEnterParams photoSearchLogEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchLogEnterParams photoSearchLogEnterParams2;
        JSONObject jSONObject = (JSONObject) obj;
        List list = (List) awS219S0300000_10.l0;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        jSONObject.put("words_num", size);
        jSONObject.put("words_source", "photo_search");
        PhotoSearchBaseVM photoSearchBaseVM = ((C676180Qfg) awS219S0300000_10.l1).LLILLJJLI;
        String str3 = null;
        if (photoSearchBaseVM != null) {
            str = photoSearchBaseVM.LLJJIII;
        } else {
            str = null;
        }
        jSONObject.put("search_id", str);
        jSONObject.put("enter_product_id", (List) awS219S0300000_10.l2);
        PhotoSearchBaseVM photoSearchBaseVM2 = ((C676180Qfg) awS219S0300000_10.l1).LLILLJJLI;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams2 = photoSearchBaseVM2.LLILLL) != null && (photoSearchLogEnterParams2 = photoSearchEnterParams2.logParams) != null) {
            str2 = photoSearchLogEnterParams2.sourcePageName;
        } else {
            str2 = null;
        }
        jSONObject.put("source_page_name", str2);
        PhotoSearchBaseVM photoSearchBaseVM3 = ((C676180Qfg) awS219S0300000_10.l1).LLILLJJLI;
        if (photoSearchBaseVM3 != null && (photoSearchEnterParams = photoSearchBaseVM3.LLILLL) != null && (photoSearchLogEnterParams = photoSearchEnterParams.logParams) != null) {
            str3 = photoSearchLogEnterParams.photoSearchModule;
        }
        jSONObject.put("photo_search_module", str3);
        jSONObject.put("search_type", "photo_search");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        C656850Ppb c656850Ppb;
        C0RTB c0rtb = (C0RTB) obj;
        C656850Ppb c656850Ppb2 = ((C656840Ppa) awS219S0300000_10.l0).LIZ;
        C656850Ppb c656850Ppb3 = null;
        if (c656850Ppb2 == null) {
            c656850Ppb2 = null;
        }
        InterfaceC111300bX interfaceC111300bX = c656850Ppb2.LIZIZ;
        if (interfaceC111300bX != null) {
            ((Assembler) awS219S0300000_10.l1).EQ2((SearchSingleCardTemplateAssem) awS219S0300000_10.l2, new AwS589S0100000_10(interfaceC111300bX, 141));
        }
        C656850Ppb c656850Ppb4 = ((C656840Ppa) awS219S0300000_10.l0).LIZ;
        if (c656850Ppb4 != null) {
            c656850Ppb = c656850Ppb4;
        } else {
            c656850Ppb = null;
        }
        c0rtb.LLILLL = c656850Ppb.LIZ;
        c0rtb.LLJI = R.id.i9z;
        if (c656850Ppb4 != null) {
            c656850Ppb3 = c656850Ppb4;
        }
        c0rtb.LLJIJIL = c656850Ppb3.LIZJ;
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        Object obj2;
        C685070Qu1 c685070Qu1 = (C685070Qu1) obj;
        c685070Qu1.LL = 1;
        c685070Qu1.LLILLJJLI = 1;
        c685070Qu1.LLIZLLLIL = (Integer) awS219S0300000_10.l0;
        c685070Qu1.LLJ = (Integer) awS219S0300000_10.l1;
        c685070Qu1.LLJI = 0;
        c685070Qu1.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        c685070Qu1.LLJIJIL = true;
        c685070Qu1.LLJILJIL = new AwS624S0100000_10((Top1SurroundedImageListAssem) awS219S0300000_10.l2, 73);
        c685070Qu1.LLJILJILJ = new AwS624S0100000_10((Top1SurroundedImageListAssem) awS219S0300000_10.l2, 74);
        c685070Qu1.LLJJ = EnumC1987707qV.BY_ITEM_TYPE;
        c685070Qu1.LLJJI = true;
        if (C297040Bkc.LIZ()) {
            C724270Sb3 c724270Sb3 = ((Top1SurroundedImageListAssem) awS219S0300000_10.l2).LLJI;
            if (c724270Sb3 != null) {
                obj2 = c724270Sb3.LL;
            } else {
                obj2 = null;
            }
            c685070Qu1.LLJJIII = ((C684930Qtn) obj2).getData();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        Long lValueOf;
        String ecSearchBoBcLabelText;
        String str;
        String couponType;
        String string;
        C654820PmK c654820PmK = (C654820PmK) obj;
        User author = ((C655000Pmc) awS219S0300000_10.l0).LLILLJJLI.getAuthor();
        if (author != null) {
            lValueOf = Long.valueOf(C486180J4u.LIZ(author));
        } else {
            lValueOf = null;
        }
        c654820PmK.LIZ("room_id", String.valueOf(lValueOf));
        AwemeCommerceStruct commerceVideoAuthInfo = ((C655000Pmc) awS219S0300000_10.l0).LLILLJJLI.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo != null) {
            ecSearchBoBcLabelText = commerceVideoAuthInfo.getEcSearchBoBcLabelText();
        } else {
            ecSearchBoBcLabelText = null;
        }
        boolean zLIZ = C294600Bgg.LIZ(ecSearchBoBcLabelText);
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (zLIZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c654820PmK.LIZ("compliance_certification", str);
        FirstScreenHelperAbility firstScreenHelperAbility = (FirstScreenHelperAbility) C1558520qew.LIZ(C1558520qew.LJIIL((SearchMixLiveCardContentAssem) awS219S0300000_10.l1), FirstScreenHelperAbility.class, null);
        if (firstScreenHelperAbility != null) {
            User author2 = ((C655000Pmc) awS219S0300000_10.l0).LLILLJJLI.getAuthor();
            if (author2 != null) {
                string = Long.valueOf(C486180J4u.LIZ(author2)).toString();
            } else {
                string = null;
            }
            String strKz0 = firstScreenHelperAbility.Kz0(string, null);
            if (strKz0 != null) {
                str2 = strKz0;
            }
        }
        c654820PmK.LIZ("is_first_screen", str2);
        ITopLiveProductViewProvider iTopLiveProductViewProviderLJJI = C1202104n5.LIZ().LJJI();
        if (iTopLiveProductViewProviderLJJI != null && (couponType = iTopLiveProductViewProviderLJJI.getCouponType(((C655000Pmc) awS219S0300000_10.l0).LLILLJJLI)) != null) {
            c654820PmK.LIZ(iTopLiveProductViewProviderLJJI.getCouponTypeKey(), couponType);
        }
        c654820PmK.LIZIZ = new AwS376S0200000_10((SearchMixLiveCardContentAssem) awS219S0300000_10.l1, (View) awS219S0300000_10.l2, 68);
        Map<String, ? extends Object> map = ((SearchMixLiveCardContentAssem) awS219S0300000_10.l1).LLLIILIL;
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    c654820PmK.LIZ(key, value.toString());
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        MixShopSearchBizVM mixShopSearchBizVM = (MixShopSearchBizVM) awS219S0300000_10.l0;
        Object objLIZIZ = mixShopSearchBizVM.LL.LIZIZ(((C678240Qj0) awS219S0300000_10.l1).LJI);
        if (objLIZIZ != null) {
            sparkContext.LJJLIIIJ(objLIZIZ, "abParams");
        }
        C1538590q8n c1538590q8n = sparkContext.liteLynxConfig;
        if (c1538590q8n != null) {
            c1538590q8n.LIZIZ = true;
            c1538590q8n.LIZLLL = true;
            c1538590q8n.LJ = true;
        }
        final InterfaceC678480QjO interfaceC678480QjO = (InterfaceC678480QjO) awS219S0300000_10.l2;
        final C678240Qj0 c678240Qj0 = (C678240Qj0) awS219S0300000_10.l1;
        sparkContext.LJJIJIIJIL(new AbstractC1538740q92() { // from class: X.0QjM
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
                InterfaceC678480QjO interfaceC678480QjO2 = interfaceC678480QjO;
                if (interfaceC678480QjO2 != null) {
                    interfaceC678480QjO2.LIZ(c678240Qj0);
                }
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        Function0 function0 = (Function0) obj;
        if (!Intrinsics.LJFF(((UIComponent) awS219S0300000_10.l0).LLILLJJLI, "bounce-view")) {
            function0.invoke();
            return Boolean.TRUE;
        }
        if (((UIComponent) awS219S0300000_10.l1).getWidth() != 0) {
            C0R0K c0r0k = ((C0R0L) awS219S0300000_10.l2).LLJLL;
            if (!c0r0k.LJJI) {
                c0r0k.LJIL = ((UIComponent) awS219S0300000_10.l1).getWidth();
                ((UIComponent) awS219S0300000_10.l1).setWidth(0);
                ((C0R0L) awS219S0300000_10.l2).LLJLL.LJJI = true;
                function0.invoke();
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$14(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        String string;
        Object obj2;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            String enterFrom = ((InterfaceC676480QgA) awS219S0300000_10.l0).getEnterFrom();
            int i = C1742080vR0.LIZ;
            PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = new PhotoSearchBusinessEnterParams(enterFrom, "photo_search_icon_click", C1742080vR0.LJIIIIZZ(((InterfaceC676480QgA) awS219S0300000_10.l0).getAweme()), null, "", 0, "", "", "", ((InterfaceC676480QgA) awS219S0300000_10.l0).getEnterFrom(), null, null, "", "", "", C0QXU.CHANNEL_VIDEO_VISION.getValue(), null, null, null, C0QXR.FEED_VISION_SEARCH.getValue(), null, null, null, Float.valueOf(0.5f), null, null, null, String.valueOf(System.currentTimeMillis()));
            PhotoSearchLogEnterParams photoSearchLogEnterParams = new PhotoSearchLogEnterParams(((InterfaceC676480QgA) awS219S0300000_10.l0).getEnterFrom(), ((InterfaceC676480QgA) awS219S0300000_10.l0).getEnterFrom(), "photo_search", "content_product_pic", ((InterfaceC676480QgA) awS219S0300000_10.l0).getEnterFrom(), null, "pause_panel", null, null, null, null, null, null);
            PhotoSearchToolsEnterParams photoSearchToolsEnterParams = new PhotoSearchToolsEnterParams(null, Long.valueOf(System.currentTimeMillis()), C0QXV.SOURCE_VIDEO_VISION.getValue(), null, null, null, null);
            HashMap map = (HashMap) awS219S0300000_10.l1;
            if (map != null && (obj2 = map.get("product_id")) != null) {
                string = obj2.toString();
            } else {
                string = null;
            }
            ((IPhotoSearchService) ServiceManager.get().getService(IPhotoSearchService.class)).LJIIIZ(((View) awS219S0300000_10.l2).getContext(), new PhotoSearchEnterParams(photoSearchBusinessEnterParams, photoSearchLogEnterParams, photoSearchToolsEnterParams, new PhotoSearchPdpEnterParams(null, null, "content_product_pic", string, null, null, null), (HashMap) awS219S0300000_10.l1, null, null, null, null), bitmap, null, null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$15(kotlin.jvm.internal.AwS219S0300000_10 r36, java.lang.Object r37) {
        /*
            r2 = r37
            X.0QfT r2 = (X.C676050QfT) r2
            r5 = r36
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM r0 = (com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM) r0
            com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r0 = r0.LLILLL
            r7 = 0
            if (r0 == 0) goto L86
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r0.businessParams
            if (r0 == 0) goto L86
            java.lang.String r8 = r0.enterMethod
        L15:
            java.lang.Object r0 = r5.l1
            X.0Qfa r0 = (X.C676120Qfa) r0
            X.0Qfy r0 = r0.LIZLLL
            if (r0 == 0) goto L82
            java.lang.String r1 = r0.LIZIZ
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.LIZJ
            if (r0 == 0) goto L83
            java.lang.String r27 = X.C1741890vQh.LJIIIIZZ(r0)
        L27:
            X.0QdX r6 = new X.0QdX
            r4 = r6
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r7
            r19 = r1
            r20 = r7
            r21 = r7
            r22 = r2
            r23 = r7
            r24 = r7
            r25 = r7
            r26 = r7
            r28 = r7
            r29 = r7
            r30 = r7
            r31 = r7
            r32 = r7
            r33 = r7
            r34 = r7
            r35 = r7
            r36 = r7
            r37 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            java.lang.Object r3 = r5.l0
            com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM r3 = (com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM) r3
            com.ss.android.ugc.aweme.ecommerce.search.vision.mix.MixPhotoSearchAssem r0 = r3.LLJLL
            if (r0 == 0) goto L72
            java.lang.Object r0 = r5.l2
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L6f
            r3.DQ2(r4)
        L6f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L72:
            com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r2 = r3.LLILLL
            com.ss.android.ugc.aweme.ecommerce.search.vision.entrance.PhotoSearchEntranceConfig r1 = r3.LLILLJJLI
            java.lang.String r0 = r3.LLJIJIL
            X.C675090Qdv.LIZ(r4, r2, r1, r0)
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM r0 = (com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM) r0
            r0.LLILZLL = r4
            goto L6f
        L82:
            r1 = r7
        L83:
            r27 = r7
            goto L27
        L86:
            r8 = r7
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS219S0300000_10.invoke$15(kotlin.jvm.internal.AwS219S0300000_10, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$16(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        String str;
        C329680CwA c329680CwA = (C329680CwA) obj;
        SearchProsConsTabAssemViewModel searchProsConsTabAssemViewModel = (SearchProsConsTabAssemViewModel) awS219S0300000_10.l0;
        Map<String, String> map = c329680CwA.LLILZLL;
        searchProsConsTabAssemViewModel.getClass();
        String str2 = "";
        if (Intrinsics.LJFF(map.get("source"), "tako")) {
            SearchProsConsTabAssemViewModel searchProsConsTabAssemViewModel2 = (SearchProsConsTabAssemViewModel) awS219S0300000_10.l0;
            Context context = (Context) awS219S0300000_10.l1;
            C329910CwX c329910CwX = (C329910CwX) awS219S0300000_10.l2;
            searchProsConsTabAssemViewModel2.getClass();
            C1603960rqE.LIZ = new C329550Cvx(c329680CwA.LLILZ, searchProsConsTabAssemViewModel2.LLILLJJLI, AFwS231S0000000_3.get$arr$(139));
            Iterator<C329910CwX> it2 = searchProsConsTabAssemViewModel2.getState().LLILLL.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().LLILLJJLI.getAid(), c329910CwX.LLILLJJLI.getAid())) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            String strValueOf = String.valueOf(i);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aweme/detail");
            smartRouteBuildRoute.withParam("video_from", "from_search_mix");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, c329910CwX.LLILLJJLI.getAid());
            smartRouteBuildRoute.withParam("search_detail", C301530Brr.LIZ());
            String str3 = c329680CwA.LLIZ.get("enter_from");
            if (str3 == null) {
                str3 = "";
            }
            smartRouteBuildRoute.withParam("enter_from", str3);
            String str4 = c329680CwA.LLIZ.get("enter_method");
            if (str4 == null) {
                str4 = "";
            }
            smartRouteBuildRoute.withParam("enter_method", str4);
            String str5 = c329680CwA.LLIZ.get("process_id");
            if (str5 == null) {
                str5 = "";
            }
            smartRouteBuildRoute.withParam("process_id", str5);
            String str6 = c329680CwA.LLIZ.get("message_id");
            if (str6 == null) {
                str6 = "";
            }
            smartRouteBuildRoute.withParam("message_id", str6);
            smartRouteBuildRoute.withParam("card_rank", strValueOf);
            String str7 = c329680CwA.LLIZ.get("situation");
            if (str7 == null) {
                str7 = "";
            }
            smartRouteBuildRoute.withParam("situation", str7);
            String str8 = c329680CwA.LLIZ.get("item_unique_id");
            if (str8 == null) {
                str8 = "";
            }
            smartRouteBuildRoute.withParam("item_unique_id", str8);
            String str9 = c329680CwA.LLIZ.get("page");
            if (str9 != null) {
                str2 = str9;
            }
            smartRouteBuildRoute.withParam("page", str2);
            smartRouteBuildRoute.open();
        } else {
            SearchProsConsTabAssemViewModel searchProsConsTabAssemViewModel3 = (SearchProsConsTabAssemViewModel) awS219S0300000_10.l0;
            Context context2 = (Context) awS219S0300000_10.l1;
            C329910CwX c329910CwX2 = (C329910CwX) awS219S0300000_10.l2;
            searchProsConsTabAssemViewModel3.getClass();
            C0PMP c0pmp = new Object() { // from class: X.0PMP
            };
            Aweme aweme = c329910CwX2.LLILLJJLI;
            C329550Cvx c329550Cvx = new C329550Cvx(c329680CwA.LLILZ, searchProsConsTabAssemViewModel3.LLILLJJLI, new AwS589S0100000_10(c329680CwA, 423));
            AwS583S0100000_4 awS583S0100000_4 = new AwS583S0100000_4(c329910CwX2, 238);
            new AwS548S0100000_4(c329680CwA, 443);
            AwS405S0200000_4 awS405S0200000_4 = new AwS405S0200000_4(c329680CwA, c329910CwX2, 30);
            c0pmp.getClass();
            ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
            C0PRC c0prc = (C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ();
            C0PM7 c0pm7 = (C0PM7) iSearchContextAbilityLJI.ak0().LIZJ();
            C663990Q2r c663990Q2r = (C663990Q2r) iSearchContextAbilityLJI.Ww1().LIZJ();
            C646370PWx c646370PWx = (C646370PWx) iSearchContextAbilityLJI.wO2().LIZJ();
            String aid = aweme.getAid();
            String requestId = aweme.getRequestId();
            if (requestId != null) {
                str2 = requestId;
            }
            if (AwemeSaaSExtKt.isLive(aweme)) {
                str = "live_cover";
            } else {
                str = "video_cell";
            }
            Map<String, String> map2 = c329680CwA.LLILZLL;
            C651980Phk c651980Phk = C651970Phj.LLILLL;
            Map mapLJIIL = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair("search_entrance", c663990Q2r.LL), new Pair("last_from_group_id", c0pm7.LLILLL), new Pair("search_id", c0prc.LLILLL), new Pair("search_keyword", c0prc.LLIZLLLIL), new Pair("search_type", "general"), new Pair("search_enter_method", c0prc.LLJLL), new Pair("enter_from_merge", c0prc.LIZIZ()), new Pair("search_outer_rank", String.valueOf(c646370PWx.LLILZLL)), new Pair("list_item_id", aid), new Pair("request_id", str2), new Pair("enter_method", str), new Pair("group_id", aid), new Pair("fullscreen_enter_doc_id", aid), new Pair("token_type", "video"), new Pair("is_search_scene", "1"), new Pair("search_enter_position", "video"), new Pair("enter_position", "video"), new Pair("is_from_video", "1")), map2);
            c651980Phk.getClass();
            C651980Phk.LJFF(mapLJIIL, false);
            Map map3 = (Map) awS405S0200000_4.invoke();
            C654790PmH c654790PmH = new C654790PmH(null);
            c654790PmH.LJJJIL(aweme);
            String strLIZIZ = c0prc.LIZIZ();
            C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
            c654790PmH.LJFF("enter_from", strLIZIZ, c2082308Dt);
            c654790PmH.LJFF("search_keyword", c0prc.LLIZLLLIL, c2082308Dt);
            c654790PmH.LJFF("search_id", c0prc.LLILLL, c2082308Dt);
            c654790PmH.LIZIZ(map3);
            c654790PmH.LJIILJJIL();
            C1603960rqE.LIZ = c329550Cvx;
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context2, "//aweme/detail");
            smartRouteBuildRoute2.withParam(FollowStatusChangeMethod.PARAM_UID, aid);
            smartRouteBuildRoute2.withParam("refer", "general_search");
            smartRouteBuildRoute2.withParam("search_detail", C301530Brr.LIZ());
            smartRouteBuildRoute2.withParam("video_from", "from_search_mix");
            smartRouteBuildRoute2.withParam("page_type", 9);
            smartRouteBuildRoute2.withParam("is_update_search_result_id", true);
            smartRouteBuildRoute2.withParam("is_from_video", 1);
            smartRouteBuildRoute2.withParam("key_search_type", 3);
            smartRouteBuildRoute2.withParam("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65280);
            smartRouteBuildRoute2.withParam("previous_page", "general_search");
            awS583S0100000_4.invoke(smartRouteBuildRoute2);
            smartRouteBuildRoute2.open();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        Object objLIZIZ = ((C677480Qhm) awS219S0300000_10.l0).LIZIZ(((C678240Qj0) awS219S0300000_10.l1).LJI);
        if (objLIZIZ != null) {
            sparkContext.LJJLIIIJ(objLIZIZ, "abParams");
        }
        C1538590q8n c1538590q8n = sparkContext.liteLynxConfig;
        if (c1538590q8n != null) {
            c1538590q8n.LIZIZ = true;
            c1538590q8n.LIZLLL = true;
            c1538590q8n.LJ = true;
        }
        final InterfaceC678480QjO interfaceC678480QjO = (InterfaceC678480QjO) awS219S0300000_10.l2;
        final C678240Qj0 c678240Qj0 = (C678240Qj0) awS219S0300000_10.l1;
        sparkContext.LJJIJIIJIL(new AbstractC1538740q92() { // from class: X.0QjE
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
                InterfaceC678480QjO interfaceC678480QjO2 = interfaceC678480QjO;
                if (interfaceC678480QjO2 != null) {
                    interfaceC678480QjO2.LIZ(c678240Qj0);
                }
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        Set<Integer> set;
        C642440PHu c642440PHu = (C642440PHu) obj;
        C0PHI c0phi = (C0PHI) awS219S0300000_10.l0;
        SearchMixFeed searchMixFeed = (SearchMixFeed) awS219S0300000_10.l1;
        c0phi.getClass();
        new AwS376S0200000_10(searchMixFeed, c0phi, 74).invoke(c642440PHu);
        Object obj2 = (SearchMixFeed) awS219S0300000_10.l1;
        if (obj2 instanceof C642240PHa) {
            c642440PHu.LJFF = (C642240PHa) obj2;
        }
        C0P7A c0p7a = c642440PHu.LIZIZ.LJIIIZ;
        String str = c642440PHu.LIZLLL;
        C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(SearchMixFeed.class));
        if (c640970PCd == null) {
            c640970PCd = new C640970PCd();
            c0p7a.LIZ.put(C13LE.LIZ(SearchMixFeed.class), c640970PCd);
        }
        HashMap<String, Object> map = c640970PCd.LIZ;
        if (map != null) {
            map.put(str, obj2);
        }
        C0PCX c0pcx = (C0PCX) awS219S0300000_10.l2;
        if (c0pcx != null && (set = c0pcx.LL) != null) {
            c642440PHu.LJI = Boolean.valueOf(set.contains(Integer.valueOf(((SearchMixFeed) awS219S0300000_10.l1).retrieveIncrementalId())));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$19(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        EntityCardTitle entityCardTitle;
        Pair<String, String> pair;
        String first;
        SearchTopBarStruct searchTopBarStruct = (SearchTopBarStruct) ((C291001Au) obj).LIZ;
        if (searchTopBarStruct != null && (entityCardTitle = searchTopBarStruct.topCardInfo) != null && (pair = entityCardTitle.getAbstract((Context) awS219S0300000_10.l0)) != null && (first = pair.getFirst()) != null && first.length() != 0) {
            if (C654290PlT.LIZ()) {
                C654210PlL c654210PlL = (C654210PlL) awS219S0300000_10.l2;
                C430890Gv1 c430890Gv1 = (C430890Gv1) awS219S0300000_10.l1;
                c654210PlL.getClass();
                if (entityCardTitle != null && C654290PlT.LIZ()) {
                    c430890Gv1.setFoldShowMaxLines(entityCardTitle.entityAbstractDisplayRowNum);
                }
            } else if (entityCardTitle.titleStyle == EnumC654070Pl7.IMDB.getType()) {
                ((C430890Gv1) awS219S0300000_10.l1).setFoldShowMaxLines(1);
            } else {
                ((C430890Gv1) awS219S0300000_10.l1).setFoldShowMaxLines(2);
            }
            C430890Gv1 c430890Gv12 = (C430890Gv1) awS219S0300000_10.l1;
            int visibility = c430890Gv12.getVisibility();
            c430890Gv12.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c430890Gv12);
            ((C430890Gv1) awS219S0300000_10.l1).setEndAppendText(pair.getSecond());
            ((C654210PlL) awS219S0300000_10.l2).LJIILJJIL((C430890Gv1) awS219S0300000_10.l1, first);
        } else {
            C430890Gv1 c430890Gv13 = (C430890Gv1) awS219S0300000_10.l1;
            int visibility2 = c430890Gv13.getVisibility();
            c430890Gv13.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c430890Gv13);
            ((C654210PlL) awS219S0300000_10.l2).LJIIIIZZ();
            ((C430890Gv1) awS219S0300000_10.l1).LJJJJLI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        C656850Ppb c656850Ppb;
        C0RTB c0rtb = (C0RTB) obj;
        C656850Ppb c656850Ppb2 = ((C656840Ppa) awS219S0300000_10.l0).LIZIZ;
        C656850Ppb c656850Ppb3 = null;
        if (c656850Ppb2 == null) {
            c656850Ppb2 = null;
        }
        InterfaceC111300bX interfaceC111300bX = c656850Ppb2.LIZIZ;
        if (interfaceC111300bX != null) {
            ((Assembler) awS219S0300000_10.l1).EQ2((SearchSingleCardTemplateAssem) awS219S0300000_10.l2, new AwS589S0100000_10(interfaceC111300bX, 142));
        }
        C656850Ppb c656850Ppb4 = ((C656840Ppa) awS219S0300000_10.l0).LIZIZ;
        if (c656850Ppb4 != null) {
            c656850Ppb = c656850Ppb4;
        } else {
            c656850Ppb = null;
        }
        c0rtb.LLILLL = c656850Ppb.LIZ;
        c0rtb.LLJI = R.id.nh_;
        if (c656850Ppb4 != null) {
            c656850Ppb3 = c656850Ppb4;
        }
        c0rtb.LLJIJIL = c656850Ppb3.LIZJ;
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        List list = (List) obj;
        list.add(new Pair(SearchServiceCenter$CardCommonAbility.class, new SearchCardCellCommonAbilityImpl((SearchCardBaseCell) awS219S0300000_10.l0, ((InterfaceC645100PSa) awS219S0300000_10.l1).getProtocol())));
        list.add(new Pair(SearchServiceCenter$MobAbility.class, new SearchCardCellMobAbilityImpl(((SearchCardBaseCell) awS219S0300000_10.l0).LJJIJL(), ((InterfaceC645100PSa) awS219S0300000_10.l1).getProtocol(), (ISearchContextAbility) awS219S0300000_10.l2)));
        list.add(new Pair(ISearchContextAbility.class, (ISearchContextAbility) awS219S0300000_10.l2));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS554S0100000_10((Function0) awS219S0300000_10.l0, (Function0<Unit>) 1064);
        c20248814Kw.LIZIZ(new C020Z((Function0) awS219S0300000_10.l0, (Function0<String>) awS219S0300000_10.l1, (Function0<Unit>) 9));
        C20248814Kw.LIZJ(c20248814Kw, true, false, 0.0f, 0, EnumC2211841BhW.CUSTOMIZE, new AwS589S0100000_10((Function0) awS219S0300000_10.l2, (Function0<Unit>) 499), null, 64);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        C0PC5 c0pc5 = (C0PC5) obj;
        c0pc5.LL = new AwS554S0100000_10((SearchJediMixFeedFragment) awS219S0300000_10.l0, 1095);
        c0pc5.LLILLJJLI = new AwS554S0100000_10((SearchJediMixFeedFragment) awS219S0300000_10.l0, 1096);
        c0pc5.LLILLL = new AwS411S0200000_10((SearchJediMixFeedFragment) awS219S0300000_10.l0, (C19EG) awS219S0300000_10.l1, 83);
        c0pc5.LLILZ = new AwS376S0200000_10((SearchJediMixFeedFragment) awS219S0300000_10.l0, c0pc5, 104);
        c0pc5.LLILZLL = new AwS554S0100000_10((SearchJediMixFeedFragment) awS219S0300000_10.l0, 1074);
        c0pc5.LLIZ = new AwS376S0200000_10((View) awS219S0300000_10.l2, (SearchJediMixFeedFragment) awS219S0300000_10.l0, 105);
        c0pc5.LLIZLLLIL = new AwS554S0100000_10((SearchJediMixFeedFragment) awS219S0300000_10.l0, 1075);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        C657810Pr9 c657810Pr9 = (C657810Pr9) obj;
        final AwS219S0300000_10 awS219S0300000_102 = new AwS219S0300000_10((SearchJediMixFeedFragment) awS219S0300000_10.l0, (C19EG) awS219S0300000_10.l1, (View) awS219S0300000_10.l2, 22);
        c657810Pr9.LIZJ = new InterfaceC657840PrC(awS219S0300000_102) { // from class: X.0PoY
            public final Function1<C0PC5, Unit> LIZ;

            @Override // X.InterfaceC657840PrC
            public final C13IQ<? extends UIContentAssem> LIZJ() {
                SearchComponentCenter.LIZ.getClass();
                return C657530Pqh.LIZ().LIZ();
            }

            @Override // X.InterfaceC657780Pr6
            public final InterfaceC111300bX getConfig() {
                Function1<C0PC5, Unit> function1 = this.LIZ;
                if (function1 == null) {
                    return null;
                }
                C0PC5 c0pc5 = new C0PC5(null);
                function1.invoke(c0pc5);
                return c0pc5;
            }

            {
                this.LIZ = awS219S0300000_102;
            }
        };
        c657810Pr9.LIZLLL = R.id.i_4;
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$24(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        Integer numValueOf;
        Iterator it2 = ((Map) obj).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (((Number) entry.getKey()).intValue() < ((Number) ((C259800zU) awS219S0300000_10.l0).element).intValue() || ((Number) entry.getKey()).intValue() > ((Number) ((C259800zU) awS219S0300000_10.l1).element).intValue()) {
                it2.remove();
                RecyclerView.ViewHolder viewHolder = ((C0PTW) entry.getValue()).LIZJ;
                if (viewHolder != null) {
                    ((C0PTQ) awS219S0300000_10.l2).LIZ.getRecycledViewPool().putRecycledView(viewHolder);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("remove cache - type=");
                RecyclerView.ViewHolder viewHolder2 = ((C0PTW) entry.getValue()).LIZJ;
                if (viewHolder2 != null) {
                    numValueOf = Integer.valueOf(viewHolder2.getItemViewType());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(", ");
                sbLIZ.append(entry.getValue());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$25(kotlin.jvm.internal.AwS219S0300000_10 r10, java.lang.Object r11) {
        /*
            X.0PHt r11 = (X.AbstractC642430PHt) r11
            java.lang.Object r0 = r10.l0
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r4 = r10.l1
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            java.lang.Object r5 = r10.l2
            android.content.Context r5 = (android.content.Context) r5
            java.util.Iterator r10 = r0.iterator()
        L12:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r3 = r10.next()
            X.0yRy r3 = (X.InterfaceC1858000yRy) r3
            boolean r0 = X.C07CP.LIZ()
            r9 = 0
            r7 = 0
            if (r0 == 0) goto Lad
            if (r4 == 0) goto L3c
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto Lab
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L32:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L85
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L92
        L3c:
            if (r5 == 0) goto Lba
            X.19EG r0 = X.C1388190mED.LIZIZ(r5)
            if (r0 == 0) goto Lba
            androidx.lifecycle.Lifecycle r1 = r0.getLifecycle()
        L48:
            X.07uV r0 = X.EnumC2012507uV.TAKO_PAGE
            com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol r0 = X.C643300PLc.LIZ(r3, r0, r1)
            if (r0 == 0) goto L76
            X.0PHz r8 = r0.getConfig()
            if (r8 == 0) goto L76
            java.util.List r0 = r8.LIZ(r3)
            java.util.Iterator r6 = r0.iterator()
        L5e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L12
            r6.next()
            int r2 = r7 + 1
            if (r7 < 0) goto Lbc
            kotlin.jvm.internal.AwS96S0201000_10 r1 = new kotlin.jvm.internal.AwS96S0201000_10
            r0 = 4
            r1.<init>(r8, r3, r7, r0)
            r11.LIZ(r1)
            r7 = r2
            goto L5e
        L76:
            boolean r0 = r3 instanceof X.C0PI2
            if (r0 == 0) goto L12
            kotlin.jvm.internal.AwS589S0100000_10 r1 = new kotlin.jvm.internal.AwS589S0100000_10
            r0 = 518(0x206, float:7.26E-43)
            r1.<init>(r3, r0)
            r11.LIZ(r1)
            goto L12
        L85:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L3c
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L92
            goto L3c
        L92:
            r1 = r4
        L93:
            boolean r0 = r1 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto La4
            X.198i r1 = (X.InterfaceC214902198i) r1
            if (r1 == 0) goto L3c
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()
            if (r1 != 0) goto L48
            goto L3c
        La4:
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            if (r1 == 0) goto L3c
            goto L93
        Lab:
            r1 = r9
            goto L32
        Lad:
            if (r5 == 0) goto Lba
            X.19EG r0 = X.C1388190mED.LIZIZ(r5)
            if (r0 == 0) goto Lba
            androidx.lifecycle.Lifecycle r1 = r0.getLifecycle()
            goto L48
        Lba:
            r1 = r9
            goto L48
        Lbc:
            X.C1697810uHb.LJIJI()
            throw r9
        Lc0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS219S0300000_10.invoke$25(kotlin.jvm.internal.AwS219S0300000_10, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$26(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        SearchMixFeed searchMixFeed;
        String str;
        String str2;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        C657890PrH c657890PrH = ((C0Q6W) obj).LL;
        if (c657890PrH != null && (searchMixFeed = c657890PrH.LL) != null) {
            Bundle bundle = (Bundle) awS219S0300000_10.l1;
            String providerDocIdStr = searchMixFeed.getProviderDocIdStr();
            String str3 = "";
            if (providerDocIdStr == null) {
                providerDocIdStr = "";
            }
            C786410Ut5.LJJJI("search_result_id", providerDocIdStr, bundle);
            SearchHelpPostCard searchHelpPostCard = searchMixFeed.getSearchHelpPostCard();
            if (searchHelpPostCard == null || (str = searchHelpPostCard.question) == null) {
                str = "";
            }
            C786410Ut5.LJJJI("post_question", str, bundle);
            SearchHelpPostCard searchHelpPostCard2 = searchMixFeed.getSearchHelpPostCard();
            if (searchHelpPostCard2 == null || (str2 = searchHelpPostCard2.demandType) == null) {
                str2 = "";
            }
            C786410Ut5.LJJJI("demand_type", str2, bundle);
            String str4 = C1443560nfW.LIZIZ;
            C786410Ut5.LJJJI("from_group_id", str4, bundle);
            C786410Ut5.LJJJI("last_group_id", str4, bundle);
            C786410Ut5.LJJJI("group_id", str4, bundle);
            C662670Pyz.LIZ.getClass();
            String strLIZ = C662670Pyz.LIZ();
            if (strLIZ == null) {
                strLIZ = "";
            }
            C786410Ut5.LJJJI("end_to_end_search_session_id", strLIZ, bundle);
            ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) awS219S0300000_10.l0;
            if (iSearchContextAbility != null && (c0pcyPh1 = iSearchContextAbility.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
                Bundle bundle2 = (Bundle) awS219S0300000_10.l1;
                C786410Ut5.LJJJI("search_id", c0prc.LLILLL, bundle2);
                C786410Ut5.LJJJI("search_keyword", c0prc.LLIZLLLIL, bundle2);
                C786410Ut5.LJJJI("search_type", C0PSI.LIZ(c0prc.LL), bundle2);
                C786410Ut5.LJJJI("shoot_enter_from", c0prc.LLLF, bundle2);
                C786410Ut5.LJJJI("shoot_enter_method", "click_help_post", bundle2);
                C786410Ut5.LJJJI("enter_method", "click_help_post", bundle2);
            }
            C786410Ut5.LJJJI("search_type", "general", (Bundle) awS219S0300000_10.l1);
            Map<String, String> mapXE0 = ((SearchServiceCenter$MobAbility) C1558520qew.LIZJ((InterfaceC665370Q7z) awS219S0300000_10.l2, SearchServiceCenter$MobAbility.class)).XE0();
            Bundle bundle3 = (Bundle) awS219S0300000_10.l1;
            String str5 = mapXE0.get("search_result_id");
            if (str5 != null) {
                str3 = str5;
            }
            C786410Ut5.LJJJI("search_result_id", str3, bundle3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        C658480PsE dataProvider;
        C658480PsE dataProvider2;
        C658480PsE dataProvider3;
        C658480PsE dataProvider4;
        C658910Psv c658910Psv = (C658910Psv) obj;
        c658910Psv.LIZ(new AwS554S0100000_10((ViewOnAttachStateChangeListenerC655110Pmn) awS219S0300000_10.l0, 1269));
        ((ViewOnAttachStateChangeListenerC655110Pmn) awS219S0300000_10.l0).V5().setOutCorner(true);
        C652990PjN c652990PjN = ((ViewOnAttachStateChangeListenerC655110Pmn) awS219S0300000_10.l0).LLJ;
        if (c652990PjN != null) {
            AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(c652990PjN, 1270);
            C663070Pzd c663070Pzd = c658910Psv.LL;
            if (c663070Pzd != null && (dataProvider4 = c663070Pzd.getDataProvider()) != null) {
                dataProvider4.LIZJ = (C652990PjN) awS554S0100000_10.invoke();
            }
        }
        InterfaceC641090PCp interfaceC641090PCp = (InterfaceC641090PCp) awS219S0300000_10.l1;
        new AwS554S0100000_10(interfaceC641090PCp, 1271);
        C663070Pzd c663070Pzd2 = c658910Psv.LL;
        if (c663070Pzd2 != null && (dataProvider3 = c663070Pzd2.getDataProvider()) != null) {
            dataProvider3.LIZ = interfaceC641090PCp;
        }
        InterfaceC652950PjJ interfaceC652950PjJ = (InterfaceC652950PjJ) awS219S0300000_10.l2;
        new AwS554S0100000_10(interfaceC652950PjJ, 1272);
        C663070Pzd c663070Pzd3 = c658910Psv.LL;
        if (c663070Pzd3 != null && (dataProvider2 = c663070Pzd3.getDataProvider()) != null) {
            dataProvider2.LIZIZ = interfaceC652950PjJ;
        }
        ViewOnAttachStateChangeListenerC655110Pmn viewOnAttachStateChangeListenerC655110Pmn = (ViewOnAttachStateChangeListenerC655110Pmn) awS219S0300000_10.l0;
        AwS376S0200000_10 awS376S0200000_10 = new AwS376S0200000_10(c658910Psv, viewOnAttachStateChangeListenerC655110Pmn, 143);
        C658630PsT c658630PsT = new C658630PsT();
        awS376S0200000_10.invoke(c658630PsT);
        viewOnAttachStateChangeListenerC655110Pmn.LLL = c658630PsT;
        AwS554S0100000_10 awS554S0100000_102 = new AwS554S0100000_10((ViewOnAttachStateChangeListenerC655110Pmn) awS219S0300000_10.l0, 1249);
        C663070Pzd c663070Pzd4 = c658910Psv.LL;
        if (c663070Pzd4 != null && (dataProvider = c663070Pzd4.getDataProvider()) != null) {
            dataProvider.LIZLLL = (AbstractC653010PjP) awS554S0100000_102.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        ((C1537830q7Z) awS219S0300000_10.l0).LJIJJ = (TemplateData) new AwS254S0300000_10((DynamicPatch) awS219S0300000_10.l1, (DynamicPatch) obj, (Map<String, ? extends Object>) awS219S0300000_10.l2, (SparkContext) 22).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        Function0 function0 = (Function0) awS219S0300000_10.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ((Context) awS219S0300000_10.l1);
        if (c19egLIZIZ != null) {
            View view = (View) awS219S0300000_10.l2;
            C670730QSp.LIZ.getClass();
            C670730QSp.LJ(view, false, c19egLIZIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        NimbleMobAbility nimbleMobAbility = (NimbleMobAbility) awS219S0300000_10.l0;
        if (nimbleMobAbility != null) {
            return nimbleMobAbility.Rg1((Map) awS219S0300000_10.l1, jSONObject, awS219S0300000_10.l2);
        }
        return null;
    }

    public static final Object invoke$30(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        C0SY7 c0sy7 = (C0SY7) obj;
        C682930QqZ c682930QqZ = (C682930QqZ) awS219S0300000_10.l0;
        User user = (User) awS219S0300000_10.l1;
        SearchEntranceVM searchEntranceVM = (SearchEntranceVM) awS219S0300000_10.l2;
        FollowStatus followStatus = new FollowStatus(((User) awS219S0300000_10.l1).getUid(), c0sy7.getValue());
        followStatus.setFollowStatus(c0sy7.getValue());
        c682930QqZ.LIZIZ(user, searchEntranceVM, followStatus);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        Function2 function2 = (Function2) awS219S0300000_10.l0;
        if (function2 != null) {
            function2.invoke((C683220Qr2) awS219S0300000_10.l1, (FeedbackMultipleChoice) awS219S0300000_10.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        Function2 function2 = (Function2) awS219S0300000_10.l0;
        if (function2 != null) {
            function2.invoke((C683220Qr2) awS219S0300000_10.l1, (FeedbackMultipleChoice) awS219S0300000_10.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        Function2 function2 = (Function2) awS219S0300000_10.l0;
        if (function2 != null) {
            function2.invoke((C683220Qr2) awS219S0300000_10.l1, (FeedbackMultipleChoice) awS219S0300000_10.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        C0RTB c0rtb = (C0RTB) obj;
        c0rtb.LLILLL = C13LE.LIZ(SearchKeyframeOptDir3EntranceAssem.class);
        c0rtb.LLJI = R.id.i56;
        c0rtb.LLILZIL = C694070RKj.LIZIZ;
        c0rtb.LJFF(new AwS215S0300000_6((SearchKeyframeOptDir3Assem) awS219S0300000_10.l0, (FrameLayout) awS219S0300000_10.l1, (FrameLayout) awS219S0300000_10.l2, 5), "prop_expand_request");
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        C0RTB c0rtb = (C0RTB) obj;
        c0rtb.LLILLL = C13LE.LIZ(SearchKeyframeOptDir3PanelAssem.class);
        c0rtb.LLJI = R.id.i57;
        c0rtb.LLILZIL = C694070RKj.LIZIZ;
        c0rtb.LJFF(new AwS215S0300000_6((SearchKeyframeOptDir3Assem) awS219S0300000_10.l0, (FrameLayout) awS219S0300000_10.l1, (FrameLayout) awS219S0300000_10.l2, 6), "prop_collapse_request");
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS219S0300000_10 awS219S0300000_10, Object obj) {
        Top1SurroundedImageListAssem top1SurroundedImageListAssem = (Top1SurroundedImageListAssem) awS219S0300000_10.l0;
        C201981141j.LIZ((Assembler) obj, top1SurroundedImageListAssem, new AwS239S0300000_30(top1SurroundedImageListAssem, (Integer) awS219S0300000_10.l1, (Integer) awS219S0300000_10.l2, 4));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS219S0300000_10(com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1SurroundedImageListAssem r3, java.lang.Integer r4, java.lang.Integer r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 9 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS219S0300000_10.<init>(com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1SurroundedImageListAssem, java.lang.Integer, java.lang.Integer, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS219S0300000_10(C259800zU c259800zU, C259800zU<Integer> c259800zU2, C259800zU<Integer> c259800zU3, C0PTQ<T> c0ptq) {
        super(1);
        this.$t = c0ptq;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c259800zU3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS219S0300000_10(C0PHI c0phi, C0PHI<InterfaceC594520NTm> c0phi2, SearchMixFeed searchMixFeed, C0PCX c0pcx) {
        super(1);
        this.$t = c0pcx;
        this.l0 = c0phi;
        this.l1 = c0phi2;
        this.l2 = searchMixFeed;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(C655000Pmc c655000Pmc, SearchMixLiveCardContentAssem searchMixLiveCardContentAssem, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = c655000Pmc;
        this.l1 = searchMixLiveCardContentAssem;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(ViewOnAttachStateChangeListenerC655110Pmn viewOnAttachStateChangeListenerC655110Pmn, InterfaceC641090PCp interfaceC641090PCp, InterfaceC652950PjJ interfaceC652950PjJ, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC655110Pmn;
        this.l1 = interfaceC641090PCp;
        this.l2 = interfaceC652950PjJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS219S0300000_10(C656840Ppa c656840Ppa, C656840Ppa<InterfaceC655050Pmh> c656840Ppa2, Assembler assembler, SearchSingleCardTemplateAssem<InterfaceC655050Pmh> searchSingleCardTemplateAssem) {
        super(1);
        this.$t = searchSingleCardTemplateAssem;
        this.l0 = c656840Ppa;
        this.l1 = c656840Ppa2;
        this.l2 = assembler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(C676750Qgb c676750Qgb, HashMap map, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = c676750Qgb;
        this.l1 = map;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(C677480Qhm c677480Qhm, C678240Qj0 c678240Qj0, C678330Qj9 c678330Qj9, int i) {
        super(1);
        this.$t = i;
        this.l0 = c677480Qhm;
        this.l1 = c678240Qj0;
        this.l2 = c678330Qj9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(Context context, C430890Gv1 c430890Gv1, C654210PlL c654210PlL, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = c430890Gv1;
        this.l2 = c654210PlL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(Context context, View view, Function0 function0, int i) {
        super(1);
        this.$t = i;
        this.l0 = function0;
        this.l1 = context;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(UIComponent uIComponent, UIComponent uIComponent2, C0R0L c0r0l, int i) {
        super(1);
        this.$t = i;
        this.l0 = uIComponent;
        this.l1 = uIComponent2;
        this.l2 = c0r0l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(MixShopSearchBizVM mixShopSearchBizVM, C678240Qj0 c678240Qj0, C678700Qjk c678700Qjk, int i) {
        super(1);
        this.$t = i;
        this.l0 = mixShopSearchBizVM;
        this.l1 = c678240Qj0;
        this.l2 = c678700Qjk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(PhotoSearchBaseVM photoSearchBaseVM, C676120Qfa c676120Qfa, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = photoSearchBaseVM;
        this.l1 = c676120Qfa;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(User user, SearchEntranceVM searchEntranceVM, C682930QqZ c682930QqZ, int i) {
        super(1);
        this.$t = i;
        this.l0 = c682930QqZ;
        this.l1 = user;
        this.l2 = searchEntranceVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS219S0300000_10(NimbleMobAbility nimbleMobAbility, NimbleMobAbility nimbleMobAbility2, Map<String, ? extends Object> map, Object obj) {
        super(1);
        this.$t = obj;
        this.l0 = nimbleMobAbility;
        this.l1 = nimbleMobAbility2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(SearchKeyframeOptDir3Assem searchKeyframeOptDir3Assem, FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchKeyframeOptDir3Assem;
        this.l1 = frameLayout;
        this.l2 = frameLayout2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(SearchJediMixFeedFragment searchJediMixFeedFragment, C19EG c19eg, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchJediMixFeedFragment;
        this.l1 = c19eg;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(SearchProsConsTabAssemViewModel searchProsConsTabAssemViewModel, Context context, C329910CwX c329910CwX, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchProsConsTabAssemViewModel;
        this.l1 = context;
        this.l2 = c329910CwX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(SearchCardBaseCell searchCardBaseCell, InterfaceC645100PSa interfaceC645100PSa, SearchContextAbilityImpl searchContextAbilityImpl, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchCardBaseCell;
        this.l1 = interfaceC645100PSa;
        this.l2 = searchContextAbilityImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(ISearchContextAbility iSearchContextAbility, Bundle bundle, InterfaceC665370Q7z interfaceC665370Q7z, int i) {
        super(1);
        this.$t = i;
        this.l0 = iSearchContextAbility;
        this.l1 = bundle;
        this.l2 = interfaceC665370Q7z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS219S0300000_10(List list, List<ProductCard> list2, C676180Qfg c676180Qfg, List<String> list3) {
        super(1);
        this.$t = list3;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c676180Qfg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS219S0300000_10(List list, List<? extends InterfaceC1858000yRy> list2, Fragment fragment, Context context) {
        super(1);
        this.$t = context;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS219S0300000_10(Function0 function0, Function0<String> function02, Function0<Unit> function03, Function0<Boolean> function04) {
        super(1);
        this.$t = function04;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = function03;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS219S0300000_10(Function2 function2, Function2<? super C683220Qr2, ? super FeedbackMultipleChoice, Unit> function22, C683220Qr2 c683220Qr2, FeedbackMultipleChoice feedbackMultipleChoice) {
        super(1);
        this.$t = feedbackMultipleChoice;
        this.l0 = function2;
        this.l1 = function22;
        this.l2 = c683220Qr2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS219S0300000_10(C1537830q7Z c1537830q7Z, String str, DynamicPatch dynamicPatch, SparkContext sparkContext, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1537830q7Z;
        this.l1 = dynamicPatch;
        this.l2 = sparkContext;
    }
}
