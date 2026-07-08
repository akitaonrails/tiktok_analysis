package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.AnonymousClass0181;
import X.AnonymousClass0431;
import X.C03B0;
import X.C043Y;
import X.C045D;
import X.C048Z;
import X.C049O;
import X.C049Y;
import X.C04AG;
import X.C04HG;
import X.C04HR;
import X.C098200Yq;
import X.C0H9H;
import X.C0OM1;
import X.C1010603xI;
import X.C1013003xg;
import X.C1017603yQ;
import X.C1018703yb;
import X.C10342042q;
import X.C10355043d;
import X.C10516049i;
import X.C1053804Ae;
import X.C1054004Ag;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1323720kYE;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1390920mIc;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C13LP;
import X.C1406500mhk;
import X.C1440005kM;
import X.C1507790pL7;
import X.C1697810uHb;
import X.C1726130v1H;
import X.C1729060v60;
import X.C1729250v6J;
import X.C1729290v6N;
import X.C1730290v7z;
import X.C1733740vDY;
import X.C1738910vLt;
import X.C1739410vMh;
import X.C1739630vN3;
import X.C1739720vNC;
import X.C1741500vQ4;
import X.C1741510vQ5;
import X.C1741520vQ6;
import X.C1741890vQh;
import X.C1744700vVE;
import X.C1748440vbG;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C1748970vc7;
import X.C1749040vcE;
import X.C1749160vcQ;
import X.C1749190vcT;
import X.C1752480vhm;
import X.C1752970viZ;
import X.C1753650vjf;
import X.C1753660vjg;
import X.C1762380vxk;
import X.C1764260w0m;
import X.C1764270w0n;
import X.C1765430w2f;
import X.C1766860w4y;
import X.C189200o6;
import X.C1AF0;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C212367188v;
import X.C2126308Ur;
import X.C2188811AlT;
import X.C23250099c;
import X.C23271099x;
import X.C2327809Ae;
import X.C2371409Qy;
import X.C418440Gaw;
import X.C426750GoL;
import X.C717610SCx;
import X.C770702zh;
import X.C786410Ut5;
import X.C7911037d;
import X.C814420VxA;
import X.C817803Hk;
import X.C919503ib;
import X.C948503nH;
import X.C957203og;
import X.C960603pE;
import X.EnumC1751780vge;
import X.EnumC1759420vsy;
import X.EnumC993350bxN;
import X.InterfaceC1018003yU;
import X.InterfaceC1053404Aa;
import X.InterfaceC1631620sYq;
import X.InterfaceC1748810vbr;
import X.InterfaceC1749170vcR;
import X.InterfaceC1752190vhJ;
import X.InterfaceC1763080vys;
import Y.AfS137S0200000_1;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartRequest;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.BundleAddItemsToCartRequest;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.TopTabListViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.settings.MessageCenterTabListEntranceSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleAddButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleSku;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LiveInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpMessage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductTile;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.tab.TabIndicatorDataVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.tab.TabIndicatorItemData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.bundle.SeaPdpBundleDealVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.bundledeal.PdpBundleDealVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend.ProductRecommendFeedCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddItemPageCtx;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartRequestParam;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartUiConfig;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.BizExtra;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.EnterCartParam;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.SkuPanelParam;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PdpTopBubble;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist.BaseTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS121S0400000_26;
import kotlin.jvm.internal.AwS12S0410000_26;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS315S0300000_12;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class AjS22S0300000_26 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) throws JSONException {
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS22S0300000_26 ajS22S0300000_26, View view) {
        Editable text;
        if (view != null) {
            C1748440vbG c1748440vbG = ((CpfAssem) ajS22S0300000_26.l0).LLJIJIL;
            String value = null;
            if (c1748440vbG != null) {
                text = c1748440vbG.getText();
            } else {
                text = null;
            }
            String strReplace = new Regex("[-]").replace(new Regex("[.]").replace(String.valueOf(text), ""), "");
            IdentityInfoOption identityInfoOption = ((CpfAssem) ajS22S0300000_26.l0).LLJILJIL;
            if (identityInfoOption != null) {
                value = identityInfoOption.getValue();
            }
            if (Intrinsics.LJFF(strReplace, value)) {
                CpfEditFragment cpfEditFragmentHo = ((CpfAssem) ajS22S0300000_26.l0).Ho();
                if (cpfEditFragmentHo != null) {
                    cpfEditFragmentHo.dismissAllowingStateLoss();
                    return;
                }
                return;
            }
            CpfAssem cpfAssem = (CpfAssem) ajS22S0300000_26.l0;
            C948503nH.LJ(cpfAssem, C23271099x.INSTANCE, new C1749040vcE(cpfAssem, strReplace, view, (C1749190vcT) ajS22S0300000_26.l1, (IdentityInfoPanel) ajS22S0300000_26.l2, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[PHI: r0
      0x0059: PHI (r0v12 android.view.View) = (r0v11 android.view.View), (r0v47 android.view.View) binds: [B:10:0x0046, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$1(g1c.AjS22S0300000_26 r18, android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS22S0300000_26.LIZ$1(g1c.AjS22S0300000_26, android.view.View):void");
    }

    public static final void LIZ$10(AjS22S0300000_26 ajS22S0300000_26, final View view) {
        Map<String, Object> mapLIZJ;
        String str;
        String str2;
        PdpViewModel pdpViewModelN5;
        final C1752480vhm c1752480vhmPR2;
        String str3;
        String str4;
        String string;
        String strLJIIIIZZ;
        Map mapLJ;
        String strLJIIIIZZ2;
        String strLJIIIIZZ3;
        Map<String, String> chainParam;
        Object obj;
        Map<String, String> mapLJ2;
        Object objPut;
        String string2;
        Map<String, String> trackParam;
        HashMap<String, Object> mapLJIIJ;
        Object obj2;
        HashMap<String, Object> mapLJIIJ2;
        Object obj3;
        HashMap<String, Object> mapLJIIJ3;
        Object obj4;
        HashMap<String, Object> mapLJIIJ4;
        Object obj5;
        HashMap<String, Object> mapLJIIJ5;
        Object obj6;
        HashMap<String, Object> mapLJIIJ6;
        Object obj7;
        HashMap<String, Object> mapLJIIJ7;
        Object obj8;
        HashMap<String, Object> mapLJIIJ8;
        HashMap<String, Object> mapLJIIJ9;
        Object obj9;
        List<String> urls;
        List<String> list;
        Type type;
        InterfaceC1053404Aa interfaceC1053404Aa;
        if (view != null) {
            PdpViewModel pdpViewModelN52 = ((ProductRecommendFeedCell) ajS22S0300000_26.l0).N5();
            Map<String, Object> map = null;
            if (pdpViewModelN52 != null && (interfaceC1053404Aa = pdpViewModelN52.LLILZIL) != null) {
                mapLIZJ = interfaceC1053404Aa.LIZJ(new C817803Hk(((C1752970viZ) ajS22S0300000_26.l1).LLILZLL.LIZIZ, null));
            } else {
                mapLIZJ = null;
            }
            ProductRecommendFeedCell productRecommendFeedCell = (ProductRecommendFeedCell) ajS22S0300000_26.l0;
            C1752970viZ c1752970viZ = (C1752970viZ) ajS22S0300000_26.l1;
            productRecommendFeedCell.getClass();
            C1748720vbi.LIZLLL(productRecommendFeedCell.itemView, new C049O(), new AwS12S0410000_26(c1752970viZ.LLILLL, c1752970viZ, productRecommendFeedCell, (Map) mapLIZJ, true, 4));
            ProductRecommendFeedCell productRecommendFeedCell2 = (ProductRecommendFeedCell) ajS22S0300000_26.l0;
            C1752970viZ c1752970viZ2 = (C1752970viZ) ajS22S0300000_26.l1;
            productRecommendFeedCell2.getClass();
            C1748720vbi.LIZLLL(productRecommendFeedCell2.itemView, new C10516049i(), new AwS12S0410000_26(c1752970viZ2.LLILLL, c1752970viZ2, productRecommendFeedCell2, (Map) mapLIZJ, true, 3));
            ProductRecommendFeedCell productRecommendFeedCell3 = (ProductRecommendFeedCell) ajS22S0300000_26.l0;
            C1752970viZ c1752970viZ3 = (C1752970viZ) ajS22S0300000_26.l1;
            productRecommendFeedCell3.getClass();
            ProductTile productTile = c1752970viZ3.LLILLL;
            if (productTile != null) {
                str = productTile.logExtra;
            } else {
                str = null;
            }
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    C13JX c13jx = KTypeProjection.LIZJ;
                    C13JW c13jwLJII = C13LE.LJII(String.class);
                    c13jx.getClass();
                    type = C2371409Qy.LIZJ(C13LE.LJIIIZ(Map.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJ(Object.class))));
                } else {
                    type = new TypeToken<Map<String, ? extends Object>>() { // from class: X.00Wa
                    }.getType();
                }
                if (!(GsonProtectorUtils.fromJson(gsonLJFF, str, type) instanceof Map)) {
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (productTile != null && (list = productTile.skuIds) != null) {
                C13LP.LJJJLL(list);
            }
            C1748720vbi.LIZLLL(productRecommendFeedCell3.itemView, new C049Y(), new AwS121S0400000_26(productTile, c1752970viZ3, productRecommendFeedCell3, mapLIZJ, 32));
            ((ProductRecommendFeedCell) ajS22S0300000_26.l0).P5((C1752970viZ) ajS22S0300000_26.l1, true, mapLIZJ);
            List<String> list2 = ((ProductTile) ajS22S0300000_26.l2).skuIds;
            if (list2 != null && (str2 = (String) C13LP.LJJJLL(list2)) != null && (pdpViewModelN5 = ((ProductRecommendFeedCell) ajS22S0300000_26.l0).N5()) != null && (c1752480vhmPR2 = pdpViewModelN5.PR2()) != null) {
                final View view2 = ((ProductRecommendFeedCell) ajS22S0300000_26.l0).itemView;
                int size = ((ProductTile) ajS22S0300000_26.l2).skuIds.size();
                ProductTile productTile2 = (ProductTile) ajS22S0300000_26.l2;
                String str5 = productTile2.id;
                String str6 = "";
                if (str5 == null) {
                    str5 = "";
                }
                C1752970viZ c1752970viZ4 = (C1752970viZ) ajS22S0300000_26.l1;
                Image image = productTile2.cover;
                if (image != null && (urls = image.getUrls()) != null) {
                    str3 = (String) C13LP.LJJJLL(urls);
                } else {
                    str3 = null;
                }
                ((ProductRecommendFeedCell) ajS22S0300000_26.l0).getPosition();
                ProductTile productTile3 = c1752970viZ4.LLILLL;
                if (size > 1) {
                    str4 = "pass_sku";
                } else {
                    str4 = "skip_pdp_and_sku";
                }
                IPdpStarter.PdpEnterParam pdpEnterParam = c1752480vhmPR2.LIZ.LLJI;
                if (pdpEnterParam != null) {
                    map = pdpEnterParam.trackParams;
                }
                Map mapLIZ = C1765430w2f.LIZ(map);
                if (mapLIZ != null) {
                    mapLIZ.put("page_name", "product_detail");
                    mapLIZ.put("product_id", str5);
                    mapLIZ.put("parent_product_id", c1752480vhmPR2.LIZ.getProductId());
                    String str7 = c1752970viZ4.LLJ;
                    if (str7 != null && (mapLJIIJ9 = C1741890vQh.LJIIJ(str7)) != null && (obj9 = mapLJIIJ9.get("source_page_type")) != null) {
                        mapLIZ.put("source_page_type", obj9);
                    }
                    String str8 = c1752970viZ4.LLJ;
                    if (str8 != null && (mapLJIIJ8 = C1741890vQh.LJIIJ(str8)) != null) {
                        mapLIZ.putAll(mapLJIIJ8);
                    }
                    String str9 = c1752970viZ4.LLILLL.daInfo;
                    if (str9 != null && (mapLJIIJ7 = C1741890vQh.LJIIJ(str9)) != null && (obj8 = mapLJIIJ7.get("source_module")) != null) {
                        mapLIZ.put("source_module", obj8);
                    }
                    String str10 = c1752970viZ4.LLILLL.daInfo;
                    if (str10 != null && (mapLJIIJ6 = C1741890vQh.LJIIJ(str10)) != null && (obj7 = mapLJIIJ6.get("rec_params")) != null) {
                        mapLIZ.put("rec_params", obj7);
                    }
                    String str11 = c1752970viZ4.LLILLL.daInfo;
                    if (str11 != null && (mapLJIIJ5 = C1741890vQh.LJIIJ(str11)) != null && (obj6 = mapLJIIJ5.get("entrance_form")) != null) {
                        mapLIZ.put("entrance_form", obj6);
                    }
                    mapLIZ.put("pdp_path", str4);
                    BCMStandardTrack bCMStandardTrack = productTile3.standardEvent;
                    if (bCMStandardTrack == null || (mapLJ2 = bCMStandardTrack.getTrackParam()) == null) {
                        mapLJ2 = C2097608Jq.LJ();
                    }
                    mapLIZ.putAll(mapLJ2);
                    mapLIZ.put("previous_page", "product_detail");
                    if (mapLIZJ != null) {
                        for (Map.Entry<String, Object> entry : mapLIZJ.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (value != null) {
                                mapLIZ.put(key, value);
                            }
                        }
                    }
                    try {
                        Object obj10 = mapLIZ.get("entrance_info");
                        if (obj10 != null && (string2 = obj10.toString()) != null) {
                            JSONObject jSONObject = new JSONObject(string2);
                            String str12 = c1752970viZ4.LLJ;
                            if (str12 != null && (mapLJIIJ4 = C1741890vQh.LJIIJ(str12)) != null && (obj5 = mapLJIIJ4.get("source_page_type")) != null) {
                                jSONObject.put("source_page_type", obj5);
                            }
                            String str13 = c1752970viZ4.LLILLL.daInfo;
                            if (str13 != null && (mapLJIIJ3 = C1741890vQh.LJIIJ(str13)) != null && (obj4 = mapLJIIJ3.get("source_module")) != null) {
                                jSONObject.put("source_module", obj4);
                            }
                            String str14 = c1752970viZ4.LLILLL.daInfo;
                            if (str14 != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str14)) != null && (obj3 = mapLJIIJ2.get("rec_params")) != null) {
                                jSONObject.put("rec_params", obj3);
                            }
                            String str15 = c1752970viZ4.LLILLL.daInfo;
                            if (str15 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str15)) != null && (obj2 = mapLJIIJ.get("entrance_form")) != null) {
                                jSONObject.put("entrance_form", obj2);
                            }
                            jSONObject.put("pdp_path", str4);
                            jSONObject.put("parent_product_id", c1752480vhmPR2.LIZ.getProductId());
                            jSONObject.put("product_id", str5);
                            jSONObject.put("previous_page", "product_detail");
                            try {
                                BCMStandardTrack bCMStandardTrack2 = productTile3.standardEvent;
                                if (bCMStandardTrack2 != null && (trackParam = bCMStandardTrack2.getTrackParam()) != null) {
                                    for (Map.Entry<String, String> entry2 : trackParam.entrySet()) {
                                        jSONObject.put(entry2.getKey(), entry2.getValue());
                                    }
                                }
                                objPut = mapLIZ.put("entrance_info", C786410Ut5.J3(jSONObject));
                            } catch (Throwable th) {
                                th = th;
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        } else {
                            objPut = null;
                        }
                        C189200o6.m2constructorimpl(objPut);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    mapLIZ = null;
                }
                ICartService iCartService = (ICartService) PluggableExtentionKt.pluggableSpi$default(ICartService.class, false, false, false, 14, null);
                if (iCartService != null) {
                    if (size > 1) {
                        str2 = null;
                    }
                    String str16 = productTile3.sellerId;
                    if (str16 != null) {
                        str6 = str16;
                    }
                    String str17 = productTile3.chainKey;
                    if (mapLIZ != null && (obj = mapLIZ.get("entrance_info")) != null) {
                        string = obj.toString();
                    } else {
                        string = null;
                    }
                    PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
                    if (pageSourceInfoLJ != null) {
                        strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
                    } else {
                        strLJIIIIZZ = null;
                    }
                    Boolean bool = Boolean.TRUE;
                    AddToCartRequestParam addToCartRequestParam = new AddToCartRequestParam(str5, str6, str2, 1, 12, strLJIIIIZZ, str17, string, null, null, null, new BizExtra(null, bool, null), null, null, null);
                    if (mapLIZ == null) {
                        mapLJ = C2097608Jq.LJ();
                    } else {
                        mapLJ = mapLIZ;
                    }
                    C10355043d c10355043d = new C10355043d(mapLJ, C2097608Jq.LJ());
                    Integer num = productTile3.bizType;
                    String strLJI = c1752480vhmPR2.LIZ.LLILZIL.LJI(c1752970viZ4.LLILZLL.LIZIZ, null);
                    BCMStandardTrack bCMStandardTrack3 = productTile3.standardEvent;
                    if (bCMStandardTrack3 != null && (chainParam = bCMStandardTrack3.getChainParam()) != null) {
                        strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(chainParam);
                    } else {
                        strLJIIIIZZ2 = null;
                    }
                    if (mapLIZ != null) {
                        strLJIIIIZZ3 = C1741890vQh.LJIIIIZZ(mapLIZ);
                    } else {
                        strLJIIIIZZ3 = null;
                    }
                    C043Y c043y = new C043Y(addToCartRequestParam, c10355043d, true, new SkuPanelParam(num, null, strLJI, strLJIIIIZZ2, bool, "pdp_product_recommendation", strLJIIIIZZ3, null), new AddToCartUiConfig(false, true, 0L, 0, Boolean.FALSE));
                    final String str18 = str3;
                    iCartService.LIZLLL(view, c043y, new AnonymousClass0431() { // from class: X.04Ba
                        @Override // X.AnonymousClass0431
                        public final void LIZIZ() {
                        }

                        @Override // X.AnonymousClass0431
                        public final void LIZJ() {
                        }

                        @Override // X.AnonymousClass0431
                        public final EnterCartParam LIZLLL() {
                            return null;
                        }

                        @Override // X.AnonymousClass0431
                        public final void LJ() {
                        }

                        @Override // X.AnonymousClass0431
                        public final View LJFF() {
                            return null;
                        }

                        @Override // X.AnonymousClass0431
                        public final C043Y LJI() {
                            return null;
                        }

                        @Override // X.AnonymousClass0431
                        public final void LIZ(C10372043u c10372043u) {
                            PdpViewModel pdpViewModel = c1752480vhmPR2.LIZ;
                            C1DFH c1dfh = C0PEM.LIZ;
                            C948503nH.LJFF(pdpViewModel, C2107308Nj.LIZ.LLIILII(), new C1055004Aq(c10372043u, c1752480vhmPR2, view, view2, str18, null));
                        }
                    }, true, null);
                }
            }
        }
    }

    public static final void LIZ$11(AjS22S0300000_26 ajS22S0300000_26, View view) {
        String str;
        Float fLJIIIIZZ;
        StoreOfficialLabel storeOfficialLabel;
        if (view != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (C770702zh.LIZIZ(((SellerInfo) ajS22S0300000_26.l0).aboutShopLink)) {
                str = ((SellerInfo) ajS22S0300000_26.l0).aboutShopLink;
            } else if (C770702zh.LIZIZ(((SellerInfo) ajS22S0300000_26.l0).shopLink)) {
                str = ((SellerInfo) ajS22S0300000_26.l0).shopLink;
            } else {
                str = "";
            }
            if (str != null && !a0.LJJJIL(str)) {
                PdpViewModel pdpViewModelLJIJI = ((PdpHeadNavBarWidget) ajS22S0300000_26.l1).LJIJI();
                SellerInfo sellerInfo = (SellerInfo) ajS22S0300000_26.l0;
                String str2 = sellerInfo.sellerId;
                String str3 = sellerInfo.rating;
                String str4 = null;
                if (str3 != null) {
                    fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str3);
                } else {
                    fLJIIIIZZ = null;
                }
                StoreLabel storeLabel = ((SellerInfo) ajS22S0300000_26.l0).storeLabel;
                if (storeLabel != null && (storeOfficialLabel = storeLabel.officialLabel) != null) {
                    str4 = storeOfficialLabel.labelTypeStr;
                }
                PdpViewModel.VR2(pdpViewModelLJIJI, (Context) ajS22S0300000_26.l2, str, str2, fLJIIIIZZ, "floating_window", str4, ((PdpHeadNavBarWidget) ajS22S0300000_26.l1).LJIJI().Tg2(), null, null, "floating_window", null, null, null, null, null, "c35259.d11651", linkedHashMap, "product_detail", null, 589184);
            }
        }
    }

    public static final void LIZ$12(AjS22S0300000_26 ajS22S0300000_26, View view) {
        String str;
        Float fLJIIIIZZ;
        StoreOfficialLabel storeOfficialLabel;
        if (view != null) {
            C1054004Ag c1054004Ag = ((PdpHeadNavBarWidget) ajS22S0300000_26.l0).LJIJI().LLJLILLLLZIIL;
            String str2 = null;
            if (c1054004Ag != null) {
                C1054004Ag.LJJ(c1054004Ag, "seller_top_bar", null, null, 6);
            }
            if (C770702zh.LIZIZ(((SellerInfo) ajS22S0300000_26.l1).aboutShopLink)) {
                str = ((SellerInfo) ajS22S0300000_26.l1).aboutShopLink;
            } else if (C770702zh.LIZIZ(((SellerInfo) ajS22S0300000_26.l1).shopLink)) {
                str = ((SellerInfo) ajS22S0300000_26.l1).shopLink;
            } else {
                str = "";
            }
            if (str != null && !a0.LJJJIL(str)) {
                PdpViewModel pdpViewModelLJIJI = ((PdpHeadNavBarWidget) ajS22S0300000_26.l0).LJIJI();
                SellerInfo sellerInfo = (SellerInfo) ajS22S0300000_26.l1;
                String str3 = sellerInfo.sellerId;
                String str4 = sellerInfo.rating;
                if (str4 != null) {
                    fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str4);
                } else {
                    fLJIIIIZZ = null;
                }
                StoreLabel storeLabel = ((SellerInfo) ajS22S0300000_26.l1).storeLabel;
                if (storeLabel != null && (storeOfficialLabel = storeLabel.officialLabel) != null) {
                    str2 = storeOfficialLabel.labelTypeStr;
                }
                PdpViewModel.VR2(pdpViewModelLJIJI, (Context) ajS22S0300000_26.l2, str, str3, fLJIIIIZZ, "top_bar", str2, ((PdpHeadNavBarWidget) ajS22S0300000_26.l0).LJIJI().Tg2(), null, null, "click_top_bar", null, null, null, null, EnumC1751780vge.NAV_TOP_BUTTON, "c35259.d11651", null, null, null, 949632);
            }
        }
    }

    public static final void LIZ$13(AjS22S0300000_26 ajS22S0300000_26, View view) {
        if (view != null) {
            C1748720vbi.LIZIZ(((PdpHeadNavBarWidget) ajS22S0300000_26.l0).LLJ, new C10516049i(), new AwS605S0100000_26((LiveInfo) ajS22S0300000_26.l1, 896));
            String str = ((LiveInfo) ajS22S0300000_26.l1).link;
            if (str != null) {
                Context context = (Context) ajS22S0300000_26.l2;
                C1053804Ae c1053804Ae = ((PdpHeadNavBarWidget) ajS22S0300000_26.l0).LJIJI().LLILZIL;
                c1053804Ae.getClass();
                C919503ib.LIZIZ(context, c1053804Ae.LJII("c35259.d44698", str, null), new LinkedHashMap(), false).open();
            }
        }
    }

    public static final void LIZ$14(AjS22S0300000_26 ajS22S0300000_26, View view) {
        String str;
        ViewGroup viewGroup;
        if (view != null) {
            C1741510vQ5 c1741510vQ5LIZ = new C1741520vQ6("c8066").LIZ(CardStruct.IStatusCode.DEFAULT);
            HashMap map = (HashMap) ajS22S0300000_26.l0;
            if (map == null || (str = (String) map.get("room_id")) == null) {
                str = "";
            }
            C1440005kM.LIZ(new C1726130v1H(str, "live_cart_barrage", BtmSDK.INSTANCE.createJumpSourceBtmToken(C1741500vQ4.LIZ(c1741510vQ5LIZ).toString(), PageFinder.via((View) ajS22S0300000_26.l1), null), (HashMap) ajS22S0300000_26.l0));
            C1739630vN3 c1739630vN3 = (C1739630vN3) ajS22S0300000_26.l1;
            ViewParent parent = c1739630vN3.getParent();
            if (parent != null && (parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(c1739630vN3, viewGroup);
            }
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("page_name", "product_detail"), new Pair("module_name", "shopping_bag_brand_info_guide"));
            c1507790pL7.getClass();
            C1507790pL7.LIZJ("tiktokec_module_click", mapLJIIIIZZ);
            Map<String, String> map2 = ((PdpTopBubble) ajS22S0300000_26.l2).daInfo;
            if (map2 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                linkedHashMap.putAll(C1739720vNC.LIZIZ(c1741510vQ5LIZ, PageFinder.via((View) ajS22S0300000_26.l1)));
                C1507790pL7.LIZJ("livesdk_tiktokec_product_entrance_click", linkedHashMap);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r34v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v19, types: [X.03Hi] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.bytedance.android.bcm.api.model.BcmParams, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void LIZ$15(AjS22S0300000_26 ajS22S0300000_26, View view) {
        String str;
        Map<String, Object> map;
        String string;
        ?? r13;
        ?? r10;
        ?? r8;
        ?? LJIIIIZZ;
        Map<String, Object> map2;
        Object obj;
        if (view != null) {
            ((SeaPdpBundleDealVH) ajS22S0300000_26.l0).c6().LIZLLL(view, (BundleInfo) ajS22S0300000_26.l1, "add_to_cart_button");
            SeaPdpBundleDealVH seaPdpBundleDealVH = (SeaPdpBundleDealVH) ajS22S0300000_26.l0;
            BundleInfo bundleInfo = (BundleInfo) ajS22S0300000_26.l1;
            BundleAddButton bundleAddButton = (BundleAddButton) ajS22S0300000_26.l2;
            seaPdpBundleDealVH.getClass();
            Integer num = bundleAddButton.action;
            int value = EnumC993350bxN.ADD_TO_CART.getValue();
            if (num != null && num.intValue() == value) {
                C1017603yQ c1017603yQ = InterfaceC1018003yU.LIZ;
                IPdpStarter.PdpEnterParam pdpEnterParam = seaPdpBundleDealVH.d6().LLIZ;
                c1017603yQ.getClass();
                int iLIZ = C1017603yQ.LIZ(pdpEnterParam);
                IPdpStarter.PdpEnterParam pdpEnterParam2 = seaPdpBundleDealVH.d6().LLIZ;
                ?? r6 = 0;
                if (pdpEnterParam2 != null) {
                    str = pdpEnterParam2.chainKey;
                } else {
                    str = null;
                }
                C04HG c04hg = C04HG.LJI;
                IPdpStarter.PdpEnterParam pdpEnterParam3 = seaPdpBundleDealVH.d6().LLIZ;
                if (pdpEnterParam3 != null) {
                    map = pdpEnterParam3.trackParams;
                } else {
                    map = null;
                }
                String strLIZIZ = C957203og.LIZIZ(null, seaPdpBundleDealVH.itemView, map);
                IPdpStarter.PdpEnterParam pdpEnterParam4 = seaPdpBundleDealVH.d6().LLIZ;
                if (pdpEnterParam4 != null && (map2 = pdpEnterParam4.trackParams) != null && (obj = map2.get("author_id")) != null) {
                    string = obj.toString();
                } else {
                    string = null;
                }
                ArrayList arrayList = new ArrayList();
                List<BundleProduct> list = bundleInfo.productList;
                if (list != null) {
                    for (BundleProduct bundleProduct : list) {
                        String str2 = bundleProduct.sellerId;
                        BundleSku bundleSku = bundleProduct.selectedSku;
                        if (bundleSku != null) {
                            r13 = bundleSku.wareHouseId;
                        } else {
                            r13 = r6;
                        }
                        String str3 = bundleProduct.productId;
                        if (bundleSku != null) {
                            r10 = bundleSku.skuId;
                        } else {
                            r10 = r6;
                        }
                        Integer num2 = bundleProduct.addCount;
                        Integer numValueOf = Integer.valueOf(iLIZ);
                        IPdpStarter.PdpEnterParam pdpEnterParam5 = seaPdpBundleDealVH.d6().LLIZ;
                        if (pdpEnterParam5 != null) {
                            r8 = pdpEnterParam5.sourceInfo;
                        } else {
                            r8 = r6;
                        }
                        PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, r6, 3);
                        if (pageSourceInfoLJ != null) {
                            LJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
                        } else {
                            LJIIIIZZ = r6;
                        }
                        arrayList.add(new AddItemToCartRequest(str2, r13, str3, r10, num2, str, strLIZIZ, numValueOf, string, null, r8, null, null, null, LJIIIIZZ, 25, Boolean.FALSE, seaPdpBundleDealVH.d6().LLLLL.LIZ.LJII("c1720.d9604", r6), new AddItemPageCtx("product_detail"), null, null, null, null, null, null, null, null));
                        r6 = 0;
                    }
                }
                BundleAddItemsToCartRequest bundleAddItemsToCartRequest = new BundleAddItemsToCartRequest(arrayList, bundleInfo.bundleId, 1, 25, null);
                C04AG c04ag = seaPdpBundleDealVH.d6().LLLLLL;
                View view2 = seaPdpBundleDealVH.itemView;
                AwS315S0300000_12 awS315S0300000_12 = new AwS315S0300000_12(seaPdpBundleDealVH, bundleInfo, view, 2);
                c04ag.getClass();
                C04HG.LJI.LJJIJIL(bundleAddItemsToCartRequest, view2, new AwS437S0200000_1(view2, c04ag, 36), new AwS580S0100000_1(awS315S0300000_12, 989)).LJJLJLI(new AfS137S0200000_1(c04ag, awS315S0300000_12, 13));
                C1753650vjf c1753650vjfC6 = seaPdpBundleDealVH.c6();
                Map<String, Object> mapLJ = seaPdpBundleDealVH.d6().LLLLL.LJ("c1720.d9604");
                c1753650vjfC6.getClass();
                C1748720vbi.LIZIZ(seaPdpBundleDealVH, new C048Z(), new AwS235S0300000_26(c1753650vjfC6, (C1753650vjf) bundleInfo, (BundleInfo) mapLJ, (Map<String, ? extends Object>) 65));
                return;
            }
            int value2 = EnumC993350bxN.OPEN_SECONDARY_PAGE.getValue();
            if (num != null && num.intValue() == value2) {
                C1753650vjf c1753650vjfC62 = seaPdpBundleDealVH.c6();
                Map<String, Object> mapLJ2 = seaPdpBundleDealVH.d6().LLLLL.LJ("c1720.d9604");
                c1753650vjfC62.getClass();
                C1748720vbi.LIZIZ(seaPdpBundleDealVH, new C049Y(), new AwS235S0300000_26(c1753650vjfC62, (C1753650vjf) bundleInfo, (BundleInfo) mapLJ2, (Map<String, ? extends Object>) 64));
                seaPdpBundleDealVH.e6(bundleAddButton, bundleInfo);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("add cart type wrong: ");
            sbLIZ.append(bundleAddButton.action);
            seaPdpBundleDealVH.f6(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final void LIZ$2(AjS22S0300000_26 ajS22S0300000_26, View view) {
        final String strLIZIZ;
        boolean z;
        ?? r2;
        Image icon;
        String string;
        if (view != null) {
            C1748720vbi.LIZLLL(((C1748970vc7) ajS22S0300000_26.l0).LLILZLL, new C10516049i(), new AwS605S0100000_26((C1406500mhk) ajS22S0300000_26.l1, 231));
            Map<String, Object> mapLIZ = C1010603xI.LIZ(((C1406500mhk) ajS22S0300000_26.l1).LL.daInfo);
            C1748970vc7 c1748970vc7 = ((C1748970vc7) ajS22S0300000_26.l0).LLILZLL;
            Object obj = ((LinkedHashMap) mapLIZ).get("btm");
            if (obj == null || (string = obj.toString()) == null || string.length() <= 0 || (strLIZIZ = C1733740vDY.LIZIZ(c1748970vc7, string)) == null || strLIZIZ.length() <= 0) {
                strLIZIZ = null;
            }
            PopUpMessage popUpMessage = ((C1406500mhk) ajS22S0300000_26.l1).LL.popUpMsg;
            if (popUpMessage != null) {
                InterfaceC1752190vhJ interfaceC1752190vhJ = (InterfaceC1752190vhJ) ajS22S0300000_26.l2;
                final C1748970vc7 c1748970vc72 = (C1748970vc7) ajS22S0300000_26.l0;
                c1748970vc72.getClass();
                LinearLayout linearLayout = new LinearLayout(c1748970vc72.LLILZLL.getContext());
                C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -2));
                linearLayout.setOrientation(0);
                C426750GoL.LJIIL(linearLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 16);
                C786410Ut5.LJJJJJL(linearLayout);
                Icon icon2 = popUpMessage.leadIcon;
                if (icon2 != null) {
                    SmartImageView smartImageView = new SmartImageView(c1748970vc72.LLILZLL.getContext());
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                    C786410Ut5.G6(smartImageView, marginLayoutParams);
                    linearLayout.addView(smartImageView);
                    if (C1744700vVE.LJ(smartImageView.getContext(), null)) {
                        icon = icon2.getIconDark();
                    } else {
                        icon = icon2.getIcon();
                    }
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon);
                    c1331670kl3LIZLLL.LJJ(smartImageView);
                    C786410Ut5.h3(c1331670kl3LIZLLL);
                }
                LinearLayout linearLayout2 = new LinearLayout(c1748970vc72.LLILZLL.getContext());
                C786410Ut5.d6(linearLayout2, new ViewGroup.LayoutParams(-1, -2));
                linearLayout2.setOrientation(1);
                linearLayout.addView(linearLayout2);
                List<ECRichText> list = popUpMessage.contents;
                if (list != null) {
                    int i = 0;
                    for (ECRichText eCRichText : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            TuxTextView tuxTextView = new TuxTextView(c1748970vc72.LLILZLL.getContext(), null, 6, 0);
                            C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-1, -2));
                            C0H9H.LIZJ(C0H9H.LIZIZ(4), tuxTextView);
                            C03B0 c03b0 = new C03B0(tuxTextView, "ProductNoticeViewHolder");
                            C03B0.LIZ(c03b0, eCRichText, new InterfaceC1631620sYq<View, String, ECRichTextExtraInfo, Unit>() { // from class: X.0vc8
                                @Override // X.InterfaceC1631620sYq
                                public final Unit invoke(View view2, String str, ECRichTextExtraInfo eCRichTextExtraInfo) {
                                    C1748970vc7 c1748970vc73 = c1748970vc72;
                                    String str2 = strLIZIZ;
                                    c1748970vc73.getClass();
                                    C1748970vc7.i0(view2, str, str2);
                                    return Unit.LIZ;
                                }
                            }, null, false, null, null, 124);
                            tuxTextView.setText(c03b0.LIZJ);
                            linearLayout2.addView(tuxTextView);
                            if (i < popUpMessage.contents.size() - 1) {
                                View view2 = new View(c1748970vc72.LLILZLL.getContext());
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, 2);
                                C426750GoL.LJIIJ(marginLayoutParams2, view2.getContext(), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 32);
                                C786410Ut5.W5(view2, marginLayoutParams2);
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, view2.getContext());
                                if (numLIZJ != null) {
                                    view2.setBackgroundColor(numLIZJ.intValue());
                                }
                                linearLayout2.addView(view2);
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                C0OM1 c0om1 = new C0OM1();
                C1250250idj c1250250idj = new C1250250idj();
                String str = popUpMessage.title;
                if (str == null) {
                    str = "";
                }
                c1250250idj.LIZJ = str;
                c0om1.LIZJ = c1250250idj;
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB.LIZLLL = true;
                c1251150ifB.LIZJ(new AwS550S0100000_6(linearLayout, 1076));
                c0om1.LIZIZ(c1251150ifB);
                c0om1.LIZLLL = true;
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJIL = c0om1;
                tuxSheet.LLJJJ = null;
                tuxSheet.LLJJIII = linearLayout;
                c1390920mIc.LJIIIIZZ(0);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJIJIIJIL = true;
                tuxSheet2.LLJLILLLLZIIL = true;
                interfaceC1752190vhJ.l4(tuxSheet2);
            }
            BasicPopUp basicPopUp = ((C1406500mhk) ajS22S0300000_26.l1).LL.basicPopUp;
            if (basicPopUp != null) {
                Integer num = basicPopUp.style;
                int value = EnumC1759420vsy.LYNX_SHEET.getValue();
                if (num != null && num.intValue() == value) {
                    ((InterfaceC1752190vhJ) ajS22S0300000_26.l2).m4(basicPopUp, strLIZIZ);
                    return;
                }
                InterfaceC1752190vhJ interfaceC1752190vhJ2 = (InterfaceC1752190vhJ) ajS22S0300000_26.l2;
                final C1748970vc7 c1748970vc73 = (C1748970vc7) ajS22S0300000_26.l0;
                c1748970vc73.getClass();
                C1749160vcQ c1749160vcQ = new C1749160vcQ(c1748970vc73.getContext());
                c1749160vcQ.LIZ(basicPopUp);
                c1749160vcQ.setListener(new InterfaceC1749170vcR() { // from class: X.0vc9
                    @Override // X.InterfaceC1749170vcR
                    public final void LIZIZ(View view3, String str2) {
                    }

                    @Override // X.InterfaceC1749170vcR
                    public final void LIZJ(PopUpButton popUpButton, String str2) {
                    }

                    @Override // X.InterfaceC1749170vcR
                    public final void LIZLLL(PopUpButton popUpButton, String str2, View view3) {
                    }

                    @Override // X.InterfaceC1749170vcR
                    public final void LIZ(View view3, String str2) {
                        C1748970vc7 c1748970vc74 = c1748970vc73;
                        String str3 = strLIZIZ;
                        c1748970vc74.getClass();
                        C1748970vc7.i0(view3, str2, str3);
                    }
                });
                C0OM1 c0om12 = new C0OM1();
                C1250250idj c1250250idj2 = new C1250250idj();
                c1250250idj2.LIZJ = C7911037d.LIZ(basicPopUp.title);
                c0om12.LIZJ = c1250250idj2;
                Boolean bool = basicPopUp.isDismissable;
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.LJFF(bool, bool2)) {
                    z = true;
                    C1251150ifB c1251150ifB2 = new C1251150ifB();
                    c1251150ifB2.LIZLLL();
                    c1251150ifB2.LIZJ = R.raw.icon_x_mark_small;
                    c1251150ifB2.LIZLLL = true;
                    c1251150ifB2.LIZJ(new AwS570S0100000_26(c1749160vcQ, 1254));
                    r2 = 0;
                    c0om12.LIZIZ(c1251150ifB2);
                } else {
                    z = true;
                    r2 = 0;
                }
                c0om12.LIZLLL = z;
                C1390920mIc c1390920mIc2 = new C1390920mIc(r2, r2);
                if (Intrinsics.LJFF(basicPopUp.isTitleFixedToTop, bool2)) {
                    TuxSheet tuxSheet3 = c1390920mIc2.LIZ;
                    tuxSheet3.LLJJIJIL = c0om12;
                    tuxSheet3.LLJJJ = null;
                }
                c1390920mIc2.LIZ.LLJJIII = c1749160vcQ;
                c1390920mIc2.LJIIIIZZ(r2);
                TuxSheet tuxSheet4 = c1390920mIc2.LIZ;
                tuxSheet4.LLJJIJIIJIL = true;
                interfaceC1752190vhJ2.l4(tuxSheet4);
            }
        }
    }

    public static final void LIZ$3(AjS22S0300000_26 ajS22S0300000_26, View view) {
        if (view != null) {
            TemplateListViewModel templateListViewModelN5 = ((BaseTemplateCell) ajS22S0300000_26.l0).N5();
            ViewGroup viewGroup = (ViewGroup) ajS22S0300000_26.l1;
            TemplateItem templateItem = (TemplateItem) ajS22S0300000_26.l2;
            templateListViewModelN5.vmDispatcher.getState();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(templateListViewModelN5), C2126308Ur.LJFF, null, new C1729290v6N(viewGroup, templateItem, templateListViewModelN5, null), 2);
            RootData rootData = ((BaseTemplateCell) ajS22S0300000_26.l0).L5().getState().LL;
            String str = rootData.roomId;
            String str2 = rootData.authorId;
            boolean z = rootData.isNewUser;
            String templateId = ((TemplateItem) ajS22S0300000_26.l2).getTemplateId();
            int type = ((TemplateItem) ajS22S0300000_26.l2).getType();
            boolean zLJJIZ = ((TemplateItem) ajS22S0300000_26.l2).LJJIZ();
            String strLIZ = rootData.LIZ();
            int i = rootData.templateEntryType;
            C1730290v7z c1730290v7z = C1730290v7z.LIZ;
            TemplateItem templateItem2 = (TemplateItem) ajS22S0300000_26.l2;
            c1730290v7z.getClass();
            C1729250v6J.LJFF(type, i, str, str2, "template_cancel", templateId, strLIZ, z, zLJJIZ, C1730290v7z.LJIILJJIL(templateItem2));
        }
    }

    public static final void LIZ$4(AjS22S0300000_26 ajS22S0300000_26, View view) {
        if (view != null) {
            if (((BaseTemplateCell) ajS22S0300000_26.l0).L5().Um1().LLJIJIL) {
                TemplateListViewModel templateListViewModelN5 = ((BaseTemplateCell) ajS22S0300000_26.l0).N5();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(templateListViewModelN5), C2126308Ur.LJFF, null, new C1729060v60((ViewGroup) ajS22S0300000_26.l1, (TemplateItem) ajS22S0300000_26.l2, templateListViewModelN5, null), 2);
            } else {
                ((BaseTemplateCell) ajS22S0300000_26.l0).N5().vQ2((ViewGroup) ajS22S0300000_26.l1, (TemplateItem) ajS22S0300000_26.l2);
            }
            RootData rootData = ((BaseTemplateCell) ajS22S0300000_26.l0).L5().Um1().LL;
            String str = rootData.roomId;
            String str2 = rootData.authorId;
            boolean z = rootData.isNewUser;
            String templateId = ((TemplateItem) ajS22S0300000_26.l2).getTemplateId();
            int type = ((TemplateItem) ajS22S0300000_26.l2).getType();
            boolean zLJJIZ = ((TemplateItem) ajS22S0300000_26.l2).LJJIZ();
            String strLIZ = rootData.LIZ();
            int i = rootData.templateEntryType;
            C1730290v7z c1730290v7z = C1730290v7z.LIZ;
            TemplateItem templateItem = (TemplateItem) ajS22S0300000_26.l2;
            c1730290v7z.getClass();
            C1729250v6J.LJFF(type, i, str, str2, "template_display", templateId, strLIZ, z, zLJJIZ, C1730290v7z.LJIILJJIL(templateItem));
        }
    }

    public static final void LIZ$5(AjS22S0300000_26 ajS22S0300000_26, View view) throws JSONException {
        String str;
        if (view != null) {
            String str2 = ((MessageCenterTabListEntranceSettings.TabEntranceItem) ajS22S0300000_26.l0).schema;
            if (str2 != null) {
                AnonymousClass0181 anonymousClass0181 = new AnonymousClass0181(str2);
                C1738910vLt c1738910vLt = ((TopTabListViewHolder) ajS22S0300000_26.l1).I5().LLIZLLLIL;
                if (c1738910vLt == null || (str = c1738910vLt.LLILLJJLI) == null) {
                    str = "notification_page";
                }
                anonymousClass0181.LJ(3, "enter_from", str);
                Integer num = ((MessageCenterTabListEntranceSettings.TabEntranceItem) ajS22S0300000_26.l0).type;
                if (num != null && num.intValue() == 1) {
                    anonymousClass0181.LIZLLL(3, 3, C2097908Jt.LIZJ(new Pair("start_click_time", String.valueOf(System.currentTimeMillis()))));
                }
                SmartRouter.buildRoute(((View) ajS22S0300000_26.l2).getContext(), anonymousClass0181.LIZ()).open();
                ((TopTabListViewHolder) ajS22S0300000_26.l1).I5().LLJ = "next";
            }
            C1738910vLt c1738910vLt2 = ((TopTabListViewHolder) ajS22S0300000_26.l1).I5().LLIZLLLIL;
            if (c1738910vLt2 != null) {
                Integer num2 = ((MessageCenterTabListEntranceSettings.TabEntranceItem) ajS22S0300000_26.l0).type;
                if (num2 != null && num2.intValue() == 3) {
                    C1739410vMh c1739410vMh = C1739410vMh.LIZ;
                    Map<String, String> mapLIZ = c1738910vLt2.LIZ();
                    c1739410vMh.getClass();
                    HashMap map = new HashMap();
                    map.putAll(mapLIZ);
                    C1018703yb.LIZIZ("tiktokec_cart_entrance_click", map);
                }
                Integer num3 = ((MessageCenterTabListEntranceSettings.TabEntranceItem) ajS22S0300000_26.l0).type;
                if (num3 != null && num3.intValue() == 2) {
                    C1739410vMh c1739410vMh2 = C1739410vMh.LIZ;
                    Map<String, String> mapLIZ2 = c1738910vLt2.LIZ();
                    c1739410vMh2.getClass();
                    HashMap map2 = new HashMap();
                    map2.putAll(mapLIZ2);
                    C1018703yb.LIZIZ("tiktokec_couponlist_entrance_click", map2);
                }
                Integer num4 = ((MessageCenterTabListEntranceSettings.TabEntranceItem) ajS22S0300000_26.l0).type;
                if (num4 != null && num4.intValue() == 1) {
                    C1739410vMh c1739410vMh3 = C1739410vMh.LIZ;
                    Map<String, String> mapLIZ3 = c1738910vLt2.LIZ();
                    c1739410vMh3.getClass();
                    HashMap map3 = new HashMap();
                    map3.putAll(mapLIZ3);
                    C1018703yb.LIZIZ("tiktokec_ecommerce_centre_entry_click", map3);
                }
            }
        }
    }

    public static final void LIZ$6(AjS22S0300000_26 ajS22S0300000_26, View view) {
        InterfaceC1763080vys actionListener;
        if (view != null && (actionListener = ((C1762380vxk) ajS22S0300000_26.l0).getActionListener()) != null) {
            Context context = ((View) ajS22S0300000_26.l1).getContext();
            PromotionWaist promotionWaist = (PromotionWaist) ajS22S0300000_26.l2;
            BannerComponent bannerComponent = promotionWaist.headComponent;
            actionListener.LIZ(context, bannerComponent.jumpSchema, promotionWaist.daInfo, C045D.LIZ(promotionWaist.btmCode, bannerComponent.btmCode));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$7(AjS22S0300000_26 ajS22S0300000_26, View view) {
        List<TabIndicatorItemData> list;
        int size;
        if (view != null) {
            C1764270w0n c1764270w0n = (C1764270w0n) ajS22S0300000_26.l0;
            int selfGroupIndex = ((C1764260w0m) ajS22S0300000_26.l1).getSelfGroupIndex();
            TabIndicatorDataVO tabIndicatorDataVO = c1764270w0n.LL;
            int i = 0;
            if (tabIndicatorDataVO != null && (list = tabIndicatorDataVO.tabData) != null) {
                Iterator it2 = C13LP.LLIIL(list).iterator();
                i = 0;
                while (true) {
                    C717610SCx c717610SCx = (C717610SCx) it2;
                    if (!c717610SCx.hasNext()) {
                        break;
                    }
                    IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                    if (indexedValue.LIZ < selfGroupIndex) {
                        List<String> list2 = ((TabIndicatorItemData) indexedValue.LIZIZ).items;
                        if (list2 != null) {
                            size = list2.size();
                        } else {
                            size = 0;
                        }
                        i += size;
                    }
                }
            }
            Function2<Integer, TabIndicatorItemData, Unit> clickStrategy = ((C1764270w0n) ajS22S0300000_26.l0).getClickStrategy();
            if (clickStrategy != null) {
                clickStrategy.invoke(Integer.valueOf(i), (TabIndicatorItemData) ajS22S0300000_26.l2);
            }
            ((C1764270w0n) ajS22S0300000_26.l0).setTabPosition(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [X.03Hi] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r34v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.bytedance.android.bcm.api.model.BcmParams, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void LIZ$8(AjS22S0300000_26 ajS22S0300000_26, View view) {
        String str;
        Map<String, Object> map;
        String string;
        String str2;
        ?? r13;
        ?? r10;
        ?? r8;
        ?? LJIIIIZZ;
        Map<String, Object> map2;
        Object obj;
        if (view != null) {
            ((PdpBundleDealVH) ajS22S0300000_26.l0).c6().LIZLLL(view, (BundleInfo) ajS22S0300000_26.l1, "add_to_cart_button");
            PdpBundleDealVH pdpBundleDealVH = (PdpBundleDealVH) ajS22S0300000_26.l0;
            BundleInfo bundleInfo = (BundleInfo) ajS22S0300000_26.l1;
            BundleAddButton bundleAddButton = (BundleAddButton) ajS22S0300000_26.l2;
            pdpBundleDealVH.getClass();
            Integer num = bundleAddButton.action;
            int value = EnumC993350bxN.ADD_TO_CART.getValue();
            if (num != null && num.intValue() == value) {
                C1013003xg c1013003xg = IPdpStarter.LIZ;
                IPdpStarter.PdpEnterParam pdpEnterParam = pdpBundleDealVH.e6().LLJI;
                c1013003xg.getClass();
                int iLIZJ = C1013003xg.LIZJ(pdpEnterParam);
                IPdpStarter.PdpEnterParam pdpEnterParam2 = pdpBundleDealVH.e6().LLJI;
                ?? r6 = 0;
                if (pdpEnterParam2 != null) {
                    str = pdpEnterParam2.chainKey;
                } else {
                    str = null;
                }
                C04HG c04hg = C04HG.LJI;
                IPdpStarter.PdpEnterParam pdpEnterParam3 = pdpBundleDealVH.e6().LLJI;
                if (pdpEnterParam3 != null) {
                    map = pdpEnterParam3.trackParams;
                } else {
                    map = null;
                }
                String strLIZIZ = C957203og.LIZIZ(null, pdpBundleDealVH.itemView, map);
                IPdpStarter.PdpEnterParam pdpEnterParam4 = pdpBundleDealVH.e6().LLJI;
                if (pdpEnterParam4 != null && (map2 = pdpEnterParam4.trackParams) != null && (obj = map2.get("author_id")) != null) {
                    string = obj.toString();
                } else {
                    string = null;
                }
                ArrayList arrayList = new ArrayList();
                List<BundleProduct> list = bundleInfo.productList;
                if (list != null) {
                    for (BundleProduct bundleProduct : list) {
                        String str3 = bundleProduct.sellerId;
                        BundleSku bundleSku = bundleProduct.selectedSku;
                        if (bundleSku != null) {
                            r13 = bundleSku.wareHouseId;
                        } else {
                            r13 = r6;
                        }
                        String str4 = bundleProduct.productId;
                        if (bundleSku != null) {
                            r10 = bundleSku.skuId;
                        } else {
                            r10 = r6;
                        }
                        Integer num2 = bundleProduct.addCount;
                        Integer numValueOf = Integer.valueOf(iLIZJ);
                        IPdpStarter.PdpEnterParam pdpEnterParam5 = pdpBundleDealVH.e6().LLJI;
                        if (pdpEnterParam5 != null) {
                            r8 = pdpEnterParam5.sourceInfo;
                        } else {
                            r8 = r6;
                        }
                        PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, r6, 3);
                        if (pageSourceInfoLJ != null) {
                            LJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
                        } else {
                            LJIIIIZZ = r6;
                        }
                        arrayList.add(new AddItemToCartRequest(str3, r13, str4, r10, num2, str, strLIZIZ, numValueOf, string, null, r8, null, null, null, LJIIIIZZ, 25, Boolean.FALSE, pdpBundleDealVH.e6().LLILZIL.LIZ.LJII("c1720.d9604", r6), new AddItemPageCtx("product_detail"), null, null, null, null, null, null, null, null));
                        r6 = 0;
                    }
                }
                String str5 = bundleInfo.bundleId;
                IPdpStarter.PdpEnterParam pdpEnterParam6 = pdpBundleDealVH.e6().LLJI;
                if (pdpEnterParam6 != null) {
                    str2 = pdpEnterParam6.pipeParams;
                } else {
                    str2 = null;
                }
                BundleAddItemsToCartRequest bundleAddItemsToCartRequest = new BundleAddItemsToCartRequest(arrayList, str5, 1, 25, str2);
                C04HR c04hr = pdpBundleDealVH.e6().LLLLLJIL;
                View view2 = pdpBundleDealVH.itemView;
                AwS315S0300000_12 awS315S0300000_12 = new AwS315S0300000_12(pdpBundleDealVH, bundleInfo, view, 1);
                c04hr.getClass();
                C04HG.LJI.LJJIJIL(bundleAddItemsToCartRequest, view2, new AwS437S0200000_1(view2, c04hr, 19), new AwS580S0100000_1(awS315S0300000_12, 506)).LJJLJLI(new AfS137S0200000_1(c04hr, awS315S0300000_12, 10));
                C1753660vjg c1753660vjgC6 = pdpBundleDealVH.c6();
                Map<String, Object> mapLJ = pdpBundleDealVH.e6().LLILZIL.LJ("c1720.d9604");
                c1753660vjgC6.getClass();
                C1748720vbi.LIZIZ(pdpBundleDealVH, new C048Z(), new AwS235S0300000_26(c1753660vjgC6, (C1753660vjg) bundleInfo, (BundleInfo) mapLJ, (Map<String, ? extends Object>) 56));
                return;
            }
            int value2 = EnumC993350bxN.OPEN_SECONDARY_PAGE.getValue();
            if (num != null && num.intValue() == value2) {
                C1753660vjg c1753660vjgC62 = pdpBundleDealVH.c6();
                Map<String, Object> mapLJ2 = pdpBundleDealVH.e6().LLILZIL.LJ("c1720.d9604");
                c1753660vjgC62.getClass();
                C1748720vbi.LIZIZ(pdpBundleDealVH, new C049Y(), new AwS235S0300000_26(c1753660vjgC62, (C1753660vjg) bundleInfo, (BundleInfo) mapLJ2, (Map<String, ? extends Object>) 55));
                pdpBundleDealVH.f6(bundleAddButton, bundleInfo);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("add cart type wrong: ");
            sbLIZ.append(bundleAddButton.action);
            pdpBundleDealVH.h6(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void LIZ$9(AjS22S0300000_26 ajS22S0300000_26, View view) {
        Map<String, ? extends Object> map;
        ECBaseFragment eCBaseFragment;
        PdpViewModel pdpViewModelN5;
        C1752480vhm c1752480vhmPR2;
        String str;
        LaneParams laneParamsLIZIZ;
        Map<String, Object> map2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Map<String, String> chainParam;
        Map<String, String> chainParam2;
        BCMStandardTrack bCMStandardTrack;
        HashMap<String, Object> mapLJIIJ;
        HashMap<String, Object> mapLJIIJ2;
        Map<String, Object> map3;
        List<String> urls;
        Type type;
        if (view != null) {
            ProductRecommendFeedCell productRecommendFeedCell = (ProductRecommendFeedCell) ajS22S0300000_26.l0;
            C1752970viZ c1752970viZ = (C1752970viZ) ajS22S0300000_26.l1;
            Map<String, ? extends Object> map4 = (Map) ajS22S0300000_26.l2;
            productRecommendFeedCell.getClass();
            ProductTile productTile = c1752970viZ.LLILLL;
            String str2 = productTile.logExtra;
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    C13JX c13jx = KTypeProjection.LIZJ;
                    C13JW c13jwLJII = C13LE.LJII(String.class);
                    c13jx.getClass();
                    type = C2371409Qy.LIZJ(C13LE.LJIIIZ(Map.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJ(Object.class))));
                } else {
                    type = new TypeToken<Map<String, ? extends Object>>() { // from class: X.00WZ
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                if (!(objFromJson instanceof Map)) {
                    objFromJson = null;
                }
                map = (Map) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                map = null;
            }
            PdpViewModel pdpViewModelN52 = productRecommendFeedCell.N5();
            if (pdpViewModelN52 != null && pdpViewModelN52.LLJLILLLLZIIL != null) {
                productRecommendFeedCell.getPosition();
            }
            C1748720vbi.LIZLLL(productRecommendFeedCell.itemView, new C049O(), new AwS12S0410000_26(c1752970viZ.LLILLL, c1752970viZ, productRecommendFeedCell, (Map) map4, false, 4));
            C1748720vbi.LIZLLL(productRecommendFeedCell.itemView, new C10516049i(), new AwS12S0410000_26(c1752970viZ.LLILLL, c1752970viZ, productRecommendFeedCell, (Map) map4, false, 3));
            productRecommendFeedCell.P5(c1752970viZ, false, map4);
            String string = ((AppCompatTextView) productRecommendFeedCell.LLILZLL.getValue()).getText().toString();
            Fragment currentFragment = productRecommendFeedCell.getCurrentFragment();
            if ((currentFragment instanceof ECBaseFragment) && (eCBaseFragment = (ECBaseFragment) currentFragment) != null && (pdpViewModelN5 = productRecommendFeedCell.N5()) != null && (c1752480vhmPR2 = pdpViewModelN5.PR2()) != null) {
                View view2 = productRecommendFeedCell.itemView;
                productRecommendFeedCell.getPosition();
                productRecommendFeedCell.getPosition();
                String str3 = productTile.pdpSchema;
                String str4 = productTile.id;
                Image image = productTile.cover;
                if (image != null && (urls = image.getUrls()) != null) {
                    str = (String) C13LP.LJJJLL(urls);
                } else {
                    str = null;
                }
                BCMStandardTrack bCMStandardTrack2 = productTile.standardEvent;
                String str5 = "unknown";
                if (str3 != null) {
                    if (map != null) {
                        map.get("product_source");
                    }
                    if (str4 != null) {
                        str5 = str4;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view2);
                    if (interfaceC1748810vbrLIZ != null) {
                        laneParamsLIZIZ = C1748730vbj.LIZIZ(interfaceC1748810vbrLIZ, "lib_track_builtin_lane_business");
                    } else {
                        laneParamsLIZIZ = null;
                    }
                    C1013003xg c1013003xg = IPdpStarter.LIZ;
                    IPdpStarter.PdpEnterParam pdpEnterParam = c1752480vhmPR2.LIZ.LLJI;
                    c1013003xg.getClass();
                    int iLIZJ = C1013003xg.LIZJ(pdpEnterParam);
                    IPdpStarter.PdpEnterParam pdpEnterParam2 = c1752480vhmPR2.LIZ.LLJI;
                    if (pdpEnterParam2 != null) {
                        map2 = pdpEnterParam2.trackParams;
                    } else {
                        map2 = null;
                    }
                    linkedHashMap.put("entrance_form", "horizontal_goods_card");
                    linkedHashMap.put("previous_page", "product_detail");
                    IPdpStarter.PdpEnterParam pdpEnterParam3 = c1752480vhmPR2.LIZ.LLJI;
                    if (pdpEnterParam3 != null && (map3 = pdpEnterParam3.trackParams) != null) {
                        obj = map3.get("follow_status");
                    } else {
                        obj = null;
                    }
                    linkedHashMap.put("follow_status", obj);
                    linkedHashMap.put("source_previous_page", "product_detail");
                    linkedHashMap.put("product_id", str5);
                    String str6 = c1752970viZ.LLJ;
                    if (str6 != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str6)) != null) {
                        Object obj7 = mapLJIIJ2.get("source_page_type");
                        if (obj7 != null) {
                            linkedHashMap.put("source_page_type", obj7);
                        }
                        Object obj8 = mapLJIIJ2.get("rec_params");
                        if (obj8 != null) {
                            linkedHashMap.put("rec_params", obj8);
                        }
                        Object obj9 = mapLJIIJ2.get("track_id");
                        if (obj9 != null) {
                            linkedHashMap.put("track_id", obj9);
                        }
                    }
                    String str7 = c1752970viZ.LLILLL.daInfo;
                    if (str7 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str7)) != null) {
                        linkedHashMap.putAll(mapLJIIJ);
                    }
                    if (laneParamsLIZIZ != null) {
                        obj2 = laneParamsLIZIZ.get((Object) "track_id");
                    } else {
                        obj2 = null;
                    }
                    linkedHashMap.put("parent_track_id", obj2);
                    if (laneParamsLIZIZ != null) {
                        obj3 = laneParamsLIZIZ.get((Object) "product_id");
                    } else {
                        obj3 = null;
                    }
                    linkedHashMap.put("parent_product_id", obj3);
                    if (laneParamsLIZIZ != null) {
                        obj4 = laneParamsLIZIZ.get((Object) "request_id");
                    } else {
                        obj4 = null;
                    }
                    linkedHashMap.put("parent_request_id", obj4);
                    if (laneParamsLIZIZ != null) {
                        obj5 = laneParamsLIZIZ.get((Object) "first_source_page");
                    } else {
                        obj5 = null;
                    }
                    linkedHashMap.put("first_source_page", obj5);
                    if (laneParamsLIZIZ != null) {
                        obj6 = laneParamsLIZIZ.get((Object) "first_track_id");
                    } else {
                        obj6 = null;
                    }
                    linkedHashMap.put("first_track_id", obj6);
                    Map mapLJIIJ3 = C2097608Jq.LJIIJ(new Pair("trackParams", C10342042q.LIZ(map2, Integer.valueOf(iLIZJ), linkedHashMap)));
                    if (str4 != null) {
                        C1323720kYE.LIZ(view2.getContext()).LJIIIIZZ(C1741890vQh.LJIIIIZZ(new PdpPreviewInfo(null, string, str, str4, 0, false, null, null)), str4);
                        mapLJIIJ3.put("pdp_cache_key", str4);
                    }
                    C212367188v c212367188v = BcmParams.Companion;
                    ProductPackStruct productPackStruct = c1752480vhmPR2.LIZ.LLJILLL;
                    if (productPackStruct != null && (bCMStandardTrack = productPackStruct.bcmStandardTrack) != null) {
                        chainParam = bCMStandardTrack.getChainParam();
                    } else {
                        chainParam = null;
                    }
                    c212367188v.getClass();
                    BcmParams bcmParamsLIZJ = C212367188v.LIZJ(chainParam);
                    if (bCMStandardTrack2 != null) {
                        chainParam2 = bCMStandardTrack2.getChainParam();
                    } else {
                        chainParam2 = null;
                    }
                    bcmParamsLIZJ.merge(chainParam2);
                    bcmParamsLIZJ.merge(map);
                    SmartRoute smartRouteLIZIZ = C919503ib.LIZIZ(view2.getContext(), c1752480vhmPR2.LIZ.LLILZIL.LJII(c1752970viZ.LLILZLL.LIZ, str3, bcmParamsLIZJ), mapLJIIJ3, false);
                    C960603pE.LJIIIIZZ(smartRouteLIZIZ, eCBaseFragment);
                    smartRouteLIZIZ.open();
                    return;
                }
                HashMap map5 = new HashMap();
                if (str4 == null) {
                    str4 = "unknown";
                }
                map5.put("product_id", str4);
                C1AF0.LIZLLL("PdpViewModel_sameRecommend open pdp failed", map5);
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AjS22S0300000_26(android.content.Context r4, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo r5, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget r6, int r7) {
        /*
            r3 = this;
            r3.$t = r7
            int r7 = 11 - r7
            if (r7 == 0) goto L13
            r2 = r3
            r2.l0 = r6
            r2.l1 = r5
            r2.l2 = r4
            r0 = 700(0x2bc, double:3.46E-321)
        Lf:
            r2.<init>(r0)
            return
        L13:
            r2 = r3
            r2.l0 = r5
            r2.l1 = r6
            r2.l2 = r4
            r0 = 700(0x2bc, double:3.46E-321)
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS22S0300000_26.<init>(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS22S0300000_26(Object obj, Object obj2, Object obj3, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
