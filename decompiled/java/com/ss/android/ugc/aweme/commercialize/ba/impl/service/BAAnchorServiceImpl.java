package com.ss.android.ugc.aweme.commercialize.ba.impl.service;

import X.AbstractC1025700cnY;
import X.AbstractC1387200mCc;
import X.AbstractC1542100qES;
import X.C00JI;
import X.C01GW;
import X.C06MM;
import X.C0C64;
import X.C0DHG;
import X.C0J3A;
import X.C1017070cZd;
import X.C1021060cg4;
import X.C1022820ciu;
import X.C1025430cn7;
import X.C1025520cnG;
import X.C1025720cna;
import X.C1025740cnc;
import X.C1025880cnq;
import X.C1026310coX;
import X.C1026350cob;
import X.C1028090crP;
import X.C1028100crQ;
import X.C1028210crb;
import X.C1035740d3k;
import X.C1035880d3y;
import X.C1041070dCL;
import X.C1044350dHd;
import X.C1044410dHj;
import X.C1044430dHl;
import X.C1047070dM1;
import X.C1048280dNy;
import X.C1048330dO3;
import X.C1050430dRR;
import X.C1050610dRj;
import X.C1050890dSB;
import X.C1050930dSF;
import X.C1053990dXB;
import X.C10EU;
import X.C118300cf;
import X.C1227904rF;
import X.C1239504t7;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LP;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1543000qFu;
import X.C1546210qL5;
import X.C1906580ziK;
import X.C19719212De;
import X.C19EG;
import X.C1AF0;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C299720Bow;
import X.C445490HdT;
import X.C452501pT;
import X.C632670Orh;
import X.C786410Ut5;
import X.C985403tE;
import X.C988570bpf;
import X.EnumC1430380nKG;
import X.InterfaceC1106350etd;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.settings.BAProductLinkSchemaSettings;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.anchor.model.AttributionData;
import com.ss.android.ugc.aweme.commercialize.anchor.model.BusinessData;
import com.ss.android.ugc.aweme.commercialize.anchor.model.CommerceAnchorInfo;
import com.ss.android.ugc.aweme.commercialize.anchor.model.JumpData;
import com.ss.android.ugc.aweme.commercialize.anchor.model.MapExtra;
import com.ss.android.ugc.aweme.commercialize.ba.impl.utils.MessageCenterSchemaSetting;
import com.ss.android.ugc.aweme.commercialize.depend.AdTaskDependImpl;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.Extra;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel;
import com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterWebModel;
import com.ss.android.ugc.aweme.commercialize.router.impl.CRouterManager;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterAdapterService;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS33S0600000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS481S0200000_16;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class BAAnchorServiceImpl implements IBAAnchorService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1239504t7());

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final boolean LJIILJJIL() {
        ArrayList<Integer> arrayList = C00JI.LIZ;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ArrayList<Integer> arrayList2 = C00JI.LIZ;
        ArrayList<Integer> arrayList3 = (ArrayList) c0c64LJIILLIIL.LJJII(ArrayList.class, arrayList2, "use_commerce_iab_for_anchor", true);
        if (arrayList3 != null) {
            arrayList2 = arrayList3;
        }
        return C13LP.LJJJJ(Double.valueOf(1.0d), arrayList2);
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final Integer LIZLLL() {
        return Integer.valueOf(R.layout.fx6);
    }

    public static void LJIJ(Context context) {
        SettingsManager.LIZLLL().getClass();
        String str = "aweme://lynxview/?channel=tiktok_ba_lynx_next&bundle=pages%2Fba%2Ftemplate.js&group=tiktok_ba_lynx_next&pageModule=lead-gen&webview_clear_color=1&dynamic=3&hide_nav_bar=1&use_bdx=1&trans_status_bar=1&hide_status_bar=0&enable_canvas=1&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Fba_lynx_next%2Ftiktok_ba_lynx_next%2Fpages%2Fba%2Ftemplate.js&enter_from=business_suite&createModel=3";
        String strLJI = SettingsManager.LJI("get_leads_schema_settings", "aweme://lynxview/?channel=tiktok_ba_lynx_next&bundle=pages%2Fba%2Ftemplate.js&group=tiktok_ba_lynx_next&pageModule=lead-gen&webview_clear_color=1&dynamic=3&hide_nav_bar=1&use_bdx=1&trans_status_bar=1&hide_status_bar=0&enable_canvas=1&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Fba_lynx_next%2Ftiktok_ba_lynx_next%2Fpages%2Fba%2Ftemplate.js&enter_from=business_suite&createModel=3");
        if (!TextUtils.isEmpty(strLJI)) {
            str = strLJI;
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        sparkContext.LJJJJLL(new AbstractC1542100qES() { // from class: X.0dHh
            @Override // X.AbstractC1537870q7d
            public final void onDestroy() {
                C1440005kM.LIZ(new C1436405jm(false));
            }
        });
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final AnchorCommonStruct LJFF(Aweme aweme) {
        AnchorCommonStruct next;
        String keyword;
        String schema;
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    AnchorCommonStruct anchorCommonStruct = next;
                    if (anchorCommonStruct.getType() == 76 && anchorCommonStruct.getExtra().length() > 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct2 = next;
            if (anchorCommonStruct2 != null && (keyword = anchorCommonStruct2.getKeyword()) != null && keyword.length() != 0 && (schema = anchorCommonStruct2.getSchema()) != null && schema.length() != 0) {
                return anchorCommonStruct2;
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final String LJI(Integer num) {
        EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.BA_PRODUCT_ANCHOR;
        int type = enumC1430380nKG.getTYPE();
        if (num != null && num.intValue() == type) {
            return enumC1430380nKG.getTYPENAME();
        }
        EnumC1430380nKG enumC1430380nKG2 = EnumC1430380nKG.GET_LEADS;
        int type2 = enumC1430380nKG2.getTYPE();
        if (num != null && num.intValue() == type2) {
            return enumC1430380nKG2.getTYPENAME();
        }
        int type3 = EnumC1430380nKG.TTCM.getTYPE();
        if (num != null && num.intValue() == type3) {
            return "download_anchor";
        }
        int type4 = EnumC1430380nKG.BA_DOWNLOAD_ANCHOR.getTYPE();
        if (num != null && num.intValue() == type4) {
            return "download_ba_anchor";
        }
        EnumC1430380nKG enumC1430380nKG3 = EnumC1430380nKG.ANCHOR_TCM_COMMENT;
        int type5 = enumC1430380nKG3.getTYPE();
        if (num != null && num.intValue() == type5) {
            return String.valueOf(enumC1430380nKG3.getTYPE());
        }
        int type6 = EnumC1430380nKG.DM_ANCHOR.getTYPE();
        if (num != null && num.intValue() == type6) {
            return "ba_DM_anchor";
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final boolean LJII(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme == null || (anchors = aweme.getAnchors()) == null || anchors.isEmpty()) {
            return false;
        }
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            if (anchorCommonStruct.getBizGroup() == 1 || ((anchorCommonStruct.getType() == EnumC1430380nKG.BA_DOWNLOAD_ANCHOR.getTYPE() && anchorCommonStruct.getExtra().length() > 0) || ((anchorCommonStruct.getType() == EnumC1430380nKG.TTCM.getTYPE() && anchorCommonStruct.getExtra().length() > 0) || ((anchorCommonStruct.getType() == EnumC1430380nKG.BA_PRODUCT_ANCHOR.getTYPE() && anchorCommonStruct.getExtra().length() > 0) || ((anchorCommonStruct.getType() == EnumC1430380nKG.GET_LEADS.getTYPE() && anchorCommonStruct.getExtra().length() > 0) || ((anchorCommonStruct.getType() == EnumC1430380nKG.DM_ANCHOR.getTYPE() && anchorCommonStruct.getExtra().length() > 0) || (C1050930dSF.LIZIZ(Integer.valueOf(anchorCommonStruct.getType())) && anchorCommonStruct.getExtra().length() > 0))))))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final void LJIIL(Context context) {
        String str = null;
        MessageCenterSchemaSetting.MessageCenterSchemaModel messageCenterSchemaModel = (MessageCenterSchemaSetting.MessageCenterSchemaModel) SettingsManager.LIZLLL().LJIIIIZZ("ttba_message_center_schema_v1", MessageCenterSchemaSetting.MessageCenterSchemaModel.class, null);
        if (messageCenterSchemaModel != null) {
            str = messageCenterSchemaModel.messageCenterSchema;
        }
        SmartRouter.buildRoute(context, str).open();
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final boolean LJIILL(List<AnchorPublishStruct> list) {
        for (AnchorPublishStruct anchorPublishStruct : list) {
            if (anchorPublishStruct.type == EnumC1430380nKG.DM_ANCHOR.getTYPE()) {
                Boolean boolValueOf = null;
                try {
                    String str = anchorPublishStruct.content;
                    if (str != null) {
                        boolValueOf = Boolean.valueOf(new JSONObject(str).optBoolean("is_white_list", false));
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) || C0C64.LJIILLIIL().LJIIIZ(31744, "ttba_dm_anchor", true, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void LJIJJ(int i, Context context) {
        String strLJJIFFI;
        if (i == 1) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            BAProductLinkSchemaSettings.ProductLinkSchema productLinkSchema = BAProductLinkSchemaSettings.LIZ;
            BAProductLinkSchemaSettings.ProductLinkSchema productLinkSchema2 = (BAProductLinkSchemaSettings.ProductLinkSchema) settingsManagerLIZLLL.LJIIIIZZ("ba_product_link_schema_set", BAProductLinkSchemaSettings.ProductLinkSchema.class, productLinkSchema);
            if (productLinkSchema2 != null) {
                productLinkSchema = productLinkSchema2;
            }
            String str = productLinkSchema.addLink;
            if (str != null) {
                strLJJIFFI = u.LJJIFFI(str, "((enter_from))", "video_publish", false);
            } else {
                return;
            }
        } else {
            SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
            BAProductLinkSchemaSettings.ProductLinkSchema productLinkSchema3 = BAProductLinkSchemaSettings.LIZ;
            BAProductLinkSchemaSettings.ProductLinkSchema productLinkSchema4 = (BAProductLinkSchemaSettings.ProductLinkSchema) settingsManagerLIZLLL2.LJIIIIZZ("ba_product_link_schema_set", BAProductLinkSchemaSettings.ProductLinkSchema.class, productLinkSchema3);
            if (productLinkSchema4 != null) {
                productLinkSchema3 = productLinkSchema4;
            }
            String str2 = productLinkSchema3.createLink;
            if (str2 != null) {
                strLJJIFFI = u.LJJIFFI(str2, "((enter_from))", "video_publish", false);
            } else {
                return;
            }
        }
        if (strLJJIFFI != null) {
            SmartRouter.buildRoute(context, strLJJIFFI).open();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final void LIZJ(int i, Context context, AwS573S0100000_29 awS573S0100000_29) {
        C118300cf c118300cf = new C118300cf();
        C118300cf c118300cf2 = new C118300cf();
        C118300cf c118300cf3 = new C118300cf();
        C118300cf c118300cf4 = new C118300cf();
        C118300cf c118300cf5 = new C118300cf();
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return;
                    }
                    LJIJJ(1, context);
                    awS573S0100000_29.invoke();
                    KevaImpl.getRepo("ba_product_anchor", 0).storeBoolean("clicked", true);
                    return;
                }
                c118300cf.element = 2131850955;
                c118300cf2.element = 2131850954;
                c118300cf3.element = 2131850949;
                c118300cf4.element = 2131850948;
                c118300cf5.element = 3;
            } else {
                c118300cf.element = 2131850953;
                c118300cf2.element = 2131850952;
                c118300cf3.element = 2131850951;
                c118300cf4.element = 2131850950;
                c118300cf5.element = 2;
            }
        } else {
            c118300cf.element = 2131850956;
            c118300cf2.element = 2131850958;
            c118300cf3.element = 2131850959;
            c118300cf4.element = 2131850957;
            c118300cf5.element = 1;
        }
        if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
            C632670Orh.LIZIZ(context, new C19719212De(1833404944, new C1053990dXB(c118300cf, c118300cf2, c118300cf3, c118300cf4, c118300cf5, this, context, awS573S0100000_29), true));
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(c118300cf.element);
        c1397580mTM.LIZ(c118300cf2.element);
        C985403tE.LIZ(c1397580mTM, new AwS33S0600000_16(c118300cf3, c118300cf4, c118300cf5, this, context, awS573S0100000_29, 1));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static void LJIJI(Context context, User user, Aweme aweme, AnchorCommonStruct anchorCommonStruct) throws JSONException {
        String str;
        List<String> urlList;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ixBusinessData", anchorCommonStruct.getExtra());
        Uri.Builder builderBuildUpon = UriProtector.parse(anchorCommonStruct.getSchema()).buildUpon();
        C1050610dRj c1050610dRj = new C1050610dRj();
        c1050610dRj.LIZJ = 1;
        c1050610dRj.LJIIIZ(aweme);
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("enter_from", String.valueOf(c1050610dRj.LIZLLL("enter_from")));
        UrlModel avatarLarger = user.getAvatarLarger();
        if (avatarLarger != null && (urlList = avatarLarger.getUrlList()) != null) {
            str = (String) ListProtector.get(urlList, 0);
        } else {
            str = null;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("avatar", str).appendQueryParameter("name", user.getNickname()).appendQueryParameter("ba_uid", user.getUid()).appendQueryParameter("title", anchorCommonStruct.getKeyword());
        C1050610dRj c1050610dRj2 = new C1050610dRj();
        c1050610dRj2.LJIIIZ(aweme);
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("is_ad", String.valueOf(c1050610dRj2.LIZLLL("is_ad")));
        ArrayList<Integer> arrayList = C00JI.LIZ;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ArrayList<Integer> arrayList2 = C00JI.LIZ;
        ArrayList<Integer> arrayList3 = (ArrayList) c0c64LJIILLIIL.LJJII(ArrayList.class, arrayList2, "use_commerce_iab_for_anchor", true);
        if (arrayList3 != null) {
            arrayList2 = arrayList3;
        }
        if (C13LP.LJJJJ(Double.valueOf(2.0d), arrayList2)) {
            String string = builderAppendQueryParameter3.appendQueryParameter("hide_nav_bar", "1").toString();
            IBAAnchorService iBAAnchorService = (IBAAnchorService) PluggableExtentionKt.pluggableSpi$default(IBAAnchorService.class, false, false, false, 14, null);
            if (iBAAnchorService != null) {
                iBAAnchorService.LJIILIIL(string, anchorCommonStruct, aweme, "video_anchor", "", null, C786410Ut5.J3(jSONObject));
                return;
            }
            return;
        }
        String string2 = builderAppendQueryParameter3.toString();
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(string2);
        sparkContext.LJJJZ("initialData", C786410Ut5.J3(jSONObject));
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }

    public static void LJIJJLI(Context context, Aweme aweme, AnchorCommonStruct anchorCommonStruct, String str) {
        String str2 = "click";
        if (AwemeExtKt.isAdTraffic(aweme)) {
            String schema = anchorCommonStruct.getSchema();
            if (schema == null) {
                return;
            }
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null || !awemeRawAd.getEnableSoftAdAnchorClick()) {
                str2 = "otherclick";
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", str2, aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("ba_leadgen_anchor", "refer");
            c1022820ciuLIZLLL.LJII();
            AdTaskDependImpl.LIZLLL().LIZ(context, aweme.getAwemeRawAd(), schema, aweme.getAid(), 72);
            return;
        }
        if (AwemeExtKt.isPseudoAd(aweme)) {
            C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "click", C1017070cZd.LJJIJL(aweme));
            c1022820ciuLIZLLL2.LIZJ("ba_leadgen_anchor", "refer");
            c1022820ciuLIZLLL2.LIZIZ(str, "enter_from");
            c1022820ciuLIZLLL2.LJII();
        } else {
            new C1050610dRj().LJJIII("ttelite_ba_product_link_anchor_click", aweme, anchorCommonStruct, "video_anchor", null, str);
        }
        ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LJIILLIIL(72, context, null, anchorCommonStruct, aweme, "video_anchor", str, null);
        new C1050610dRj().LJJIII("ttelite_ba_video_product_anchor_9_exp", aweme, anchorCommonStruct, "video_anchor", null, "");
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final void LIZIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, Context context, boolean z) {
        new C1044410dHj(C1044350dHd.LIZ(aweme, anchorCommonStruct, context, z)).LIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final void LJIIIIZZ(int i, Context context, AwS273S0300000_29 awS273S0300000_29, AwS573S0100000_29 awS573S0100000_29) {
        if (C1044430dHl.LIZ().enable) {
            awS273S0300000_29.invoke();
            return;
        }
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i == 6) {
                                if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                                    C632670Orh.LIZIZ(context, new C19719212De(-705629160, new AwS481S0200000_16(this, context, 3), true));
                                    return;
                                }
                                C1397580mTM c1397580mTM = new C1397580mTM(context);
                                c1397580mTM.LJFF(2131821805);
                                c1397580mTM.LIZ(2131821802);
                                C985403tE.LIZ(c1397580mTM, new AwS382S0200000_16(this, context, 117));
                                c1397580mTM.LJII = false;
                                new C1397510mTF(c1397580mTM).LIZLLL();
                                return;
                            }
                            return;
                        }
                        if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                            C632670Orh.LIZIZ(context, new C19719212De(-941798983, new AwS481S0200000_16(this, context, 2), true));
                            return;
                        }
                        C1397580mTM c1397580mTM2 = new C1397580mTM(context);
                        c1397580mTM2.LJFF(2131821811);
                        c1397580mTM2.LIZ(2131821809);
                        C985403tE.LIZ(c1397580mTM2, new AwS382S0200000_16(this, context, 115));
                        c1397580mTM2.LJII = false;
                        new C1397510mTF(c1397580mTM2).LIZLLL();
                        return;
                    }
                    if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                        C632670Orh.LIZIZ(context, new C19719212De(-1177968806, new AwS481S0200000_16(this, context, 5), true));
                        return;
                    }
                    C1397580mTM c1397580mTM3 = new C1397580mTM(context);
                    c1397580mTM3.LJFF(2131821811);
                    c1397580mTM3.LIZ(2131821808);
                    C985403tE.LIZ(c1397580mTM3, new AwS382S0200000_16(this, context, 121));
                    c1397580mTM3.LJII = false;
                    new C1397510mTF(c1397580mTM3).LIZLLL();
                    return;
                }
                if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                    C632670Orh.LIZIZ(context, new C19719212De(-1414138629, new AwS481S0200000_16(this, context, 4), true));
                    return;
                }
                C1397580mTM c1397580mTM4 = new C1397580mTM(context);
                c1397580mTM4.LJFF(2131821815);
                c1397580mTM4.LIZ(2131821814);
                C985403tE.LIZ(c1397580mTM4, new AwS382S0200000_16(this, context, 119));
                c1397580mTM4.LJII = false;
                new C1397510mTF(c1397580mTM4).LIZLLL();
                return;
            }
            awS573S0100000_29.invoke();
            return;
        }
        awS273S0300000_29.invoke();
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final C1050430dRR LJIIJ(Context context, Aweme aweme, String str, AwS260S0300000_16 awS260S0300000_16) {
        AnchorCommonStruct anchorCommonStructLJFF;
        if (aweme == null || (anchorCommonStructLJFF = LJFF(aweme)) == null) {
            return null;
        }
        return new C1050430dRR(context, aweme, anchorCommonStructLJFF, str, awS260S0300000_16);
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final void LJIIJJI(Context context, User user, Aweme aweme, AnchorCommonStruct anchorCommonStruct, String str) {
        if (aweme != null && anchorCommonStruct != null && anchorCommonStruct.getSchema() != null) {
            try {
                if (new JSONObject(anchorCommonStruct.getExtra()).optInt("schema_type") == 30) {
                    LJIJJLI(context, aweme, anchorCommonStruct, str);
                } else {
                    LJIJI(context, user, aweme, anchorCommonStruct);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final void LJIIIZ(Context context, CommerceAnchorInfo commerceAnchorInfo, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str, String str2, String str3) {
        CRouterCoreModel cRouterCoreModel;
        MapExtra mapExtra;
        JumpData jumpData;
        String routerData;
        AwemeRawAd pseudoAdData = null;
        NonAdWebModel nonAdWebModelLJIIZILJ = LJIIZILJ(this, aweme, str, anchorCommonStruct, str2, null, null, null, str3, Boolean.FALSE, commerceAnchorInfo, 112);
        String strLIZLLL = C1026350cob.LIZLLL(82);
        AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo != null) {
            pseudoAdData = commerceVideoAuthInfo.getPseudoAdData();
        }
        ICRouterManager iCRouterManager = (ICRouterManager) PluggableExtentionKt.pluggableSpi$default(ICRouterManager.class, false, false, false, 14, null);
        if (iCRouterManager != null) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            C1025880cnq c1025880cnq = new C1025880cnq(context, aid, aweme, pseudoAdData, ((ICRouterModelTransform) this.LIZ.getValue()).LIZ(pseudoAdData));
            C1025520cnG c1025520cnG = new C1025520cnG(null, "fyp_organic_anchor", null, strLIZLLL, "", 82, strLIZLLL, null, 897);
            if (commerceAnchorInfo != null && (mapExtra = commerceAnchorInfo.getMapExtra()) != null && (jumpData = mapExtra.getJumpData()) != null && (routerData = jumpData.getRouterData()) != null && routerData.length() != 0) {
                try {
                    C1227904rF.LIZ.getClass();
                    cRouterCoreModel = (CRouterCoreModel) C1227904rF.LIZIZ(routerData, CRouterCoreModel.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    cRouterCoreModel = null;
                }
            } else {
                cRouterCoreModel = null;
            }
            C1025740cnc c1025740cnc = AbstractC1025700cnY.LIZ;
            CRouterManager cRouterManagerLIZ = iCRouterManager.LIZ(c1025880cnq, c1025520cnG, new C1021060cg4(cRouterCoreModel, new C1025430cn7(c1025740cnc, c1025740cnc, nonAdWebModelLJIIZILJ, null, 108), 4));
            if (cRouterManagerLIZ != null) {
                cRouterManagerLIZ.LJI();
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final void LJIILIIL(String str, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str2, String str3, CommerceAnchorInfo commerceAnchorInfo, String str4) {
        Activity activityLIZIZ;
        String aid;
        String authorUid;
        String requestId;
        User author;
        C1035880d3y c1035880d3yOv;
        IAdWebUtils iAdWebUtils;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        Activity activityLIZ = C06MM.LIZ(activityLIZIZ);
        if (activityLIZ == null) {
            return;
        }
        String keyword = anchorCommonStruct.getKeyword();
        if (keyword == null) {
            keyword = "";
        }
        if (aweme != null) {
            aid = aweme.getAid();
            authorUid = AwemeExtKt.getAuthorUid(aweme);
            requestId = aweme.getRequestId();
            author = aweme.getAuthor();
        } else {
            aid = null;
            authorUid = null;
            requestId = null;
            author = null;
        }
        UrlModel urlModelLIZLLL = C10EU.LIZLLL(author);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('-');
        sbLIZ.append(UUID.randomUUID());
        C1035740d3k c1035740d3k = new C1035740d3k(str, 1, keyword, "", "", false, "click", false, 0, C2188811AlT.LIZIZ(sbLIZ), false, false, aid, authorUid, requestId, urlModelLIZLLL, false, null, null, 82);
        NonAdWebModel nonAdWebModelLJIIZILJ = LJIIZILJ(this, aweme, str2, anchorCommonStruct, str3, null, null, null, str4, null, commerceAnchorInfo, 112);
        IAdWebUtils iAdWebUtils2 = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
        if (iAdWebUtils2 != null && (c1035880d3yOv = iAdWebUtils2.ov(aweme, anchorCommonStruct, c1035740d3k, nonAdWebModelLJIIZILJ)) != null && (iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null)) != null) {
            iAdWebUtils.kv(activityLIZ, c1035880d3yOv, AFwS231S0000000_3.get$arr$(288));
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final void LJ(C19EG c19eg, String str, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str2, String str3, Integer num, Integer num2) {
        AwemeRawAd awemeRawAdLJJIJL;
        C19EG c19eg2;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
        if (c19egLIZIZ == null) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        NonAdWebModel nonAdWebModelLJIIZILJ = LJIIZILJ(this, aweme, str2, anchorCommonStruct, str3, bool, num, num2, null, null, null, 512);
        if (C299720Bow.LIZ()) {
            IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) ServiceManager.get().getService(IAdLandingPagePopUpService.class);
            if (C1017070cZd.LLILII(aweme)) {
                awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme);
            } else {
                awemeRawAdLJJIJL = null;
            }
            C1026310coX c1026310coX = new C1026310coX(str, awemeRawAdLJJIJL, C1028090crP.LIZ(aweme, nonAdWebModelLJIIZILJ, 1, "commerce_anchor", null, null, null, nonAdWebModelLJIIZILJ.getInitialData()), true, new C1025720cna(0.9f, bool, bool, 1, Boolean.FALSE, -1, -1, Boolean.FALSE), new C1028100crQ(Boolean.FALSE, null, Boolean.FALSE, false, false, Boolean.FALSE, Boolean.TRUE, null, null, null, false, false, false, false, null, Boolean.FALSE));
            Activity activityLJFF = C2214201BlK.LJFF();
            if ((activityLJFF instanceof C19EG) && (c19eg2 = (C19EG) activityLJFF) != null) {
                iAdLandingPagePopUpService.LJIIJ(-1, c19eg2, null, c1026310coX, null);
                return;
            }
            return;
        }
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZ() != null) {
            C1028210crb.LJJIIJ(c19egLIZIZ, str, "", true, UUID.randomUUID().toString(), 0, "commerce_anchor", 0, false, nonAdWebModelLJIIZILJ, aweme);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final void LJIILLIIL(int i, Context context, CommerceAnchorInfo commerceAnchorInfo, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str, String str2, String str3) {
        boolean z;
        String schema;
        AwemeRawAd awemeRawAdLJJIJL;
        C19EG c19eg;
        String schema2;
        String schema3;
        String aid;
        String authorUid;
        int iIntValue;
        String string;
        int size;
        int i2;
        String string2;
        String organicLogExtra;
        String aid2;
        String authorUid2;
        String organicLogExtra2;
        String pixelInfo;
        MapExtra mapExtra;
        AttributionData attributionData;
        AwemeCommerceStruct commerceVideoAuthInfo;
        AwemeCommerceStruct commerceVideoAuthInfo2;
        List<AnchorCommonStruct> anchors;
        Integer num;
        AwemeRawAd pseudoAdData;
        String aid3;
        AwemeCommerceStruct commerceVideoAuthInfo3;
        if (anchorCommonStruct != null && anchorCommonStruct.getType() == EnumC1430380nKG.BA_PRODUCT_ANCHOR.getTYPE()) {
            z = true;
        } else {
            z = false;
        }
        String str4 = "";
        AwemeRawAd awemeRawAdLJJIJL2 = null;
        if (z) {
            String schema4 = anchorCommonStruct.getSchema();
            if (schema4 == null) {
                schema4 = "";
            }
            NonAdWebModel nonAdWebModelLJIIZILJ = LJIIZILJ(this, aweme, str, anchorCommonStruct, str2, null, null, null, str3, null, commerceAnchorInfo, 112);
            if (((ICRouterAdapterService) ServiceManager.get().getService(ICRouterAdapterService.class)).LIZJ(69, aweme, str2)) {
                String strLIZLLL = C1026350cob.LIZLLL(Integer.valueOf(i));
                if (aweme != null && (commerceVideoAuthInfo3 = aweme.getCommerceVideoAuthInfo()) != null) {
                    pseudoAdData = commerceVideoAuthInfo3.getPseudoAdData();
                } else {
                    pseudoAdData = null;
                }
                ICRouterManager iCRouterManager = (ICRouterManager) ServiceManager.get().getService(ICRouterManager.class);
                if (aweme != null && (aid3 = aweme.getAid()) != null) {
                    str4 = aid3;
                }
                C1025880cnq c1025880cnq = new C1025880cnq(context, str4, aweme, pseudoAdData, ((ICRouterModelTransform) this.LIZ.getValue()).LIZ(pseudoAdData));
                C1025520cnG c1025520cnG = new C1025520cnG(null, "fyp_organic_anchor", null, strLIZLLL, "", i, strLIZLLL, null, 897);
                CRouterCoreModel cRouterCoreModel = new CRouterCoreModel(null, 0, null, new CRouterWebModel(schema4, null, false, false, 0, null), null, null, null);
                C1025740cnc c1025740cnc = AbstractC1025700cnY.LIZ;
                iCRouterManager.LIZ(c1025880cnq, c1025520cnG, new C1021060cg4(cRouterCoreModel, new C1025430cn7(c1025740cnc, c1025740cnc, nonAdWebModelLJIIZILJ, null, 108), 4)).LJI();
                return;
            }
        }
        try {
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "ba_use_commercial_container", true, true)) {
                if (anchorCommonStruct != null && (schema3 = anchorCommonStruct.getSchema()) != null && schema3.length() != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aweme://webview_popup?url=");
                    sbLIZ.append(Uri.encode(schema3));
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    Activity activityLIZJ = C0J3A.LIZJ(context);
                    if (activityLIZJ == null && (activityLIZJ = C2214201BlK.LJFF()) == null) {
                        return;
                    }
                    C1546210qL5.LIZ.getClass();
                    int iLIZIZ = (int) (C445490HdT.LIZIZ(activityLIZJ, Integer.valueOf(C1546210qL5.LJIIL(C1546210qL5.LJII(activityLIZJ), activityLIZJ))) * ((double) 0.85f));
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.LJJLIIJ(strLIZIZ);
                    sparkContext.LJJJZ("gravity", "bottom");
                    sparkContext.LJJJZ("transition_animation", "bottom");
                    sparkContext.LJJJLZIJ(iLIZIZ, "height");
                    sparkContext.LJJJZ("use_spark", "1");
                    sparkContext.LJJJZ("enable_pull_down_close", "1");
                    sparkContext.LJJJZ("show_mask", "1");
                    sparkContext.LJJJLZIJ(0, "radius");
                    sparkContext.LJJJZ("keyboard_adjust", "2");
                    if (aweme != null) {
                        aid = aweme.getAid();
                        authorUid = AwemeExtKt.getAuthorUid(aweme);
                    } else {
                        aid = null;
                        authorUid = null;
                    }
                    String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
                    C1050610dRj c1050610dRj = new C1050610dRj();
                    c1050610dRj.LJIIIZ(anchorCommonStruct);
                    Object objLIZLLL = c1050610dRj.LIZLLL("ba_cta");
                    if ((objLIZLLL instanceof Integer) && (num = (Integer) objLIZLLL) != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    C1050610dRj c1050610dRj2 = new C1050610dRj();
                    c1050610dRj2.LJIIIZ(anchorCommonStruct);
                    Object objLIZLLL2 = c1050610dRj2.LIZLLL("ba_url");
                    if (objLIZLLL2 != null) {
                        string = objLIZLLL2.toString();
                    } else {
                        string = null;
                    }
                    if (aweme != null && (anchors = aweme.getAnchors()) != null) {
                        size = anchors.size();
                    } else {
                        size = 0;
                    }
                    if (size > 1) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    Integer numValueOf = Integer.valueOf(anchorCommonStruct.getType());
                    C1050610dRj c1050610dRj3 = new C1050610dRj();
                    c1050610dRj3.LJIIIZ(anchorCommonStruct);
                    Object objLIZLLL3 = c1050610dRj3.LIZLLL("ba_pixel_id");
                    if (objLIZLLL3 != null) {
                        string2 = objLIZLLL3.toString();
                    } else {
                        string2 = null;
                    }
                    if (aweme != null && (commerceVideoAuthInfo2 = aweme.getCommerceVideoAuthInfo()) != null) {
                        organicLogExtra = commerceVideoAuthInfo2.getOrganicLogExtra();
                    } else {
                        organicLogExtra = null;
                    }
                    sparkContext.LJJ(InterfaceC1106350etd.class, new C1047070dM1(context, sparkContext, anchorCommonStruct, aweme, new NonAdWebModel(aid, str, authorUid, currentUserID, iIntValue, string, i2, numValueOf, string2, str2, null, organicLogExtra, null, null, null, null, null, null, null, null, null), str));
                    sparkContext.LJJJJZ(new C1050890dSB());
                    if (aweme != null) {
                        aid2 = aweme.getAid();
                        authorUid2 = AwemeExtKt.getAuthorUid(aweme);
                    } else {
                        aid2 = null;
                        authorUid2 = null;
                    }
                    Integer numValueOf2 = Integer.valueOf(anchorCommonStruct.getType());
                    if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
                        organicLogExtra2 = commerceVideoAuthInfo.getOrganicLogExtra();
                    } else {
                        organicLogExtra2 = null;
                    }
                    sparkContext.LJJ(C1048280dNy.class, new C1048280dNy(numValueOf2, null, aid2, authorUid2, str2, organicLogExtra2));
                    if (commerceAnchorInfo != null && (mapExtra = commerceAnchorInfo.getMapExtra()) != null && (attributionData = mapExtra.getAttributionData()) != null) {
                        pixelInfo = attributionData.getPixelInfo();
                    } else {
                        pixelInfo = null;
                    }
                    sparkContext.LJJ(C1048330dO3.class, new C1048330dO3(pixelInfo, str2));
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LIZ("fix_ad_info_jsb", false)) {
                        sparkContext.LJJ(C1543000qFu.class, new C1543000qFu() { // from class: X.0dHg
                            @Override // X.C1543000qFu
                            public final List<Class<? extends InterfaceC1063710dmr>> LJI() {
                                return Collections.singletonList(C1018770ccN.class);
                            }
                        });
                    }
                    if (aweme != null && AwemeExtKt.isPseudoAd(aweme)) {
                        if (aweme != null) {
                            awemeRawAdLJJIJL2 = C1017070cZd.LJJIJL(aweme);
                        }
                        sparkContext.LJJ(AwemeRawAd.class, awemeRawAdLJJIJL2);
                    }
                    C1541950qED.LIZJ.getClass();
                    new C1541950qED(context, sparkContext).LIZIZ();
                    return;
                }
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            NonAdWebModel nonAdWebModelLJIIZILJ2 = LJIIZILJ(this, aweme, str, anchorCommonStruct, str2, null, null, null, str3, null, commerceAnchorInfo, 112);
            if (C299720Bow.LIZ()) {
                IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) ServiceManager.get().getService(IAdLandingPagePopUpService.class);
                if (anchorCommonStruct != null && (schema2 = anchorCommonStruct.getSchema()) != null) {
                    str4 = schema2;
                }
                if (C1017070cZd.LLILII(aweme)) {
                    awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme);
                } else {
                    awemeRawAdLJJIJL = null;
                }
                AdlpExtraModel adlpExtraModelLIZ = C1028090crP.LIZ(aweme, nonAdWebModelLJIIZILJ2, 1, "commerce_anchor", null, null, null, nonAdWebModelLJIIZILJ2.getInitialData());
                Boolean bool = Boolean.TRUE;
                C1026310coX c1026310coX = new C1026310coX(str4, awemeRawAdLJJIJL, adlpExtraModelLIZ, true, new C1025720cna(0.9f, bool, bool, 1, Boolean.FALSE, -1, -1, Boolean.FALSE), new C1028100crQ(Boolean.FALSE, null, Boolean.FALSE, false, false, Boolean.FALSE, Boolean.TRUE, null, null, null, false, false, false, false, null, Boolean.FALSE));
                Activity activityLJFF = C2214201BlK.LJFF();
                if ((activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null) {
                    iAdLandingPagePopUpService.LJIIJ(-1, c19eg, null, c1026310coX, null);
                    return;
                }
                return;
            }
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() == null) {
                return;
            }
            if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
                str4 = schema;
            }
            C1028210crb.LJJIIJ(c19egLIZIZ, str4, "", false, UUID.randomUUID().toString(), 0, "commerce_anchor", i, false, nonAdWebModelLJIIZILJ2, aweme);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final void LIZ(Context context, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str, String str2, CommerceAnchorInfo commerceAnchorInfo, String str3, String str4, Boolean bool) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            return;
        }
        NonAdWebModel nonAdWebModelLJIIZILJ = LJIIZILJ(this, aweme, str, anchorCommonStruct, str2, null, null, null, str3, bool, commerceAnchorInfo, 112);
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZ() != null) {
            C1028210crb.LJJIIJ(c19egLIZIZ, str4, "", false, UUID.randomUUID().toString(), 0, "commerce_anchor", 82, false, nonAdWebModelLJIIZILJ, aweme);
        }
    }

    public static NonAdWebModel LJIIZILJ(BAAnchorServiceImpl bAAnchorServiceImpl, Aweme aweme, String str, AnchorCommonStruct anchorCommonStruct, String str2, Boolean bool, Integer num, Integer num2, String str3, Boolean bool2, CommerceAnchorInfo commerceAnchorInfo, int i) {
        Integer numValueOf;
        Integer numValueOf2;
        String mapAnchorExtra;
        MapExtra mapExtra;
        JumpData jumpData;
        BusinessData businessData;
        MapExtra mapExtra2;
        String aid;
        String authorUid;
        int iIntValue;
        String string;
        int i2;
        Integer numValueOf3;
        String string2;
        String organicLogExtra;
        MapExtra mapExtra3;
        JumpData jumpData2;
        BusinessData businessData2;
        AwemeCommerceStruct commerceVideoAuthInfo;
        List<AnchorCommonStruct> anchors;
        Integer num3;
        String str4 = str3;
        Integer num4 = num2;
        Integer num5 = num;
        Boolean bool3 = bool;
        Boolean enableReport = null;
        if ((i & 16) != 0) {
            bool3 = null;
        }
        if ((i & 32) != 0) {
            num5 = null;
        }
        if ((i & 64) != 0) {
            num4 = null;
        }
        if ((i & 128) != 0) {
            str4 = null;
        }
        if ((i & 512) != 0) {
            commerceAnchorInfo = null;
        }
        bAAnchorServiceImpl.getClass();
        if (!C1017070cZd.LLILII(aweme)) {
            if (aweme != null) {
                if (!AwemeExtKt.isAdTraffic(aweme)) {
                    aid = aweme.getAid();
                    authorUid = AwemeExtKt.getAuthorUid(aweme);
                }
            } else {
                aid = null;
                authorUid = null;
            }
            String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
            C1050610dRj c1050610dRj = new C1050610dRj();
            c1050610dRj.LJIIIZ(anchorCommonStruct);
            Object objLIZLLL = c1050610dRj.LIZLLL("ba_cta");
            if ((objLIZLLL instanceof Integer) && (num3 = (Integer) objLIZLLL) != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = 0;
            }
            C1050610dRj c1050610dRj2 = new C1050610dRj();
            c1050610dRj2.LJIIIZ(anchorCommonStruct);
            Object objLIZLLL2 = c1050610dRj2.LIZLLL("ba_url");
            if (objLIZLLL2 != null) {
                string = objLIZLLL2.toString();
            } else {
                string = null;
            }
            if (aweme != null && (anchors = aweme.getAnchors()) != null && anchors.size() > 1) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (anchorCommonStruct != null) {
                numValueOf3 = Integer.valueOf(anchorCommonStruct.getType());
            } else {
                numValueOf3 = null;
            }
            C1050610dRj c1050610dRj3 = new C1050610dRj();
            c1050610dRj3.LJIIIZ(anchorCommonStruct);
            Object objLIZLLL3 = c1050610dRj3.LIZLLL("ba_pixel_id");
            if (objLIZLLL3 != null) {
                string2 = objLIZLLL3.toString();
            } else {
                string2 = null;
            }
            if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
                organicLogExtra = commerceVideoAuthInfo.getOrganicLogExtra();
            } else {
                organicLogExtra = null;
            }
            if (commerceAnchorInfo != null && (mapExtra3 = commerceAnchorInfo.getMapExtra()) != null && (jumpData2 = mapExtra3.getJumpData()) != null && (businessData2 = jumpData2.getBusinessData()) != null) {
                enableReport = businessData2.getEnableReport();
            }
            return new NonAdWebModel(aid, str, authorUid, currentUserID, iIntValue, string, i2, numValueOf3, string2, str2, num4, organicLogExtra, str4, null, Boolean.TRUE, null, bool3, num5, null, bool2, enableReport);
        }
        if (anchorCommonStruct != null) {
            numValueOf = Integer.valueOf(anchorCommonStruct.getType());
        } else {
            numValueOf = null;
        }
        if (anchorCommonStruct != null) {
            numValueOf2 = Integer.valueOf(anchorCommonStruct.getType());
        } else {
            numValueOf2 = null;
        }
        if (commerceAnchorInfo != null && (mapExtra2 = commerceAnchorInfo.getMapExtra()) != null) {
            mapAnchorExtra = mapExtra2.getMapAnchorExtra();
        } else {
            mapAnchorExtra = null;
        }
        Extra extra = new Extra(str2, numValueOf2, mapAnchorExtra);
        if (commerceAnchorInfo != null && (mapExtra = commerceAnchorInfo.getMapExtra()) != null && (jumpData = mapExtra.getJumpData()) != null && (businessData = jumpData.getBusinessData()) != null) {
            enableReport = businessData.getEnableReport();
        }
        return new NonAdWebModel(null, null, null, null, 0, null, 0, numValueOf, null, str2, null, null, str4, 1, Boolean.TRUE, extra, null, null, null, bool2, enableReport);
    }
}
