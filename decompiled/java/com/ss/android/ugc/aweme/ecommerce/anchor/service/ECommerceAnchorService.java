package com.ss.android.ugc.aweme.ecommerce.anchor.service;

import X.AbstractC19511111Vd;
import X.AbstractC21274918Nn;
import X.AnonymousClass0317;
import X.AnonymousClass0956;
import X.C034S;
import X.C05D4;
import X.C07O9;
import X.C0C64;
import X.C0PEM;
import X.C1018703yb;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1257480ipO;
import X.C12BP;
import X.C1345205Og;
import X.C1389890mGx;
import X.C1392660mLQ;
import X.C1392840mLi;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C13LP;
import X.C1421105hJ;
import X.C1697810uHb;
import X.C1706780uW4;
import X.C1706800uW6;
import X.C1706820uW8;
import X.C1735040vFe;
import X.C1739700vNA;
import X.C1741890vQh;
import X.C1756670voX;
import X.C18NA;
import X.C18NF;
import X.C18NK;
import X.C18NL;
import X.C18O4;
import X.C18OC;
import X.C18OW;
import X.C1942307jB;
import X.C19719512Dh;
import X.C1976807ok;
import X.C1977107on;
import X.C19EG;
import X.C1AQS;
import X.C1DFH;
import X.C20295114b7;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2126308Ur;
import X.C21269318Lj;
import X.C21271918Mj;
import X.C21272018Mk;
import X.C21272118Ml;
import X.C21272218Mm;
import X.C21272418Mo;
import X.C21272518Mp;
import X.C21272618Mq;
import X.C21272718Mr;
import X.C21273718Nb;
import X.C21274118Nf;
import X.C21275818Nw;
import X.C21276418Oc;
import X.C21278318Ov;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C2371409Qy;
import X.C255960A1i;
import X.C268560Afm;
import X.C291250BbH;
import X.C292960Be2;
import X.C292970Be3;
import X.C599110Nef;
import X.C599140Nei;
import X.C786410Ut5;
import X.C928303k1;
import X.EnumC1235690iGF;
import X.EnumC1430380nKG;
import X.EnumC1778650wNz;
import X.InterfaceC1392790mLd;
import X.InterfaceC1394860mOy;
import X.InterfaceC1739690vN9;
import X.InterfaceC1756660voW;
import Y.ARunnableS126S0100000_26;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol;
import com.ss.android.ugc.aweme.commerce.model.ShopAdStruct;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.ecommerce.anchor.api.EventTrackData;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.CreatorAnchorContent;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.ECAvMusic;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcAnchorDisableDeleteAppendInPublishConfig;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategoryFuncSetting;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategorySetting;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.PanelTopDisclosureViewData;
import com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonfeed.CommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.dependency.creativepage.CreativePageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.network.NetworkUtilDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.GetAnchorMotionInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;
import com.ss.android.ugc.aweme.ecommerce.review.EcAnchorReviewsPanelProvider;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.AnchorPdpPreloadModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.ad.ShopAnchorSellingPointData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ecommerce.debug.IEComOfflineService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS265S0300000_21;
import kotlin.jvm.internal.AwS4S3000000_32;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.AwS71S1300000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.json.JSONException;

/* JADX INFO: loaded from: classes33.dex */
public final class ECommerceAnchorService implements IECommerceAnchorService {
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJJJZI() {
        return C291250BbH.LIZ(0);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJZZIII() {
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C0C64.LJIILLIIL().LJIIIZ(31744, "ec_enable_auto_check_accurate", true, false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LIZ() {
        if (C21272418Mo.LLJJIJIIJIL) {
            return true;
        }
        InterfaceC1756660voW.LJLJLJ.getClass();
        return C1756670voX.LIZIZ || ECommerceAnchorPanelFragment.LLLLIILL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final C12BP LIZIZ() {
        return new C12BP() { // from class: X.18NH
            @Override // X.C12BP
            public final InterfaceC2249881D4g LIZ(AbstractC2249871D4f abstractC2249871D4f) {
                AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
                String name;
                C18NV c18nv = new C18NV(abstractC2249871D4f.getContext(), abstractC2249871D4f);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    boolean z = false;
                    anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                        z = true;
                    }
                    String name2 = ICommonFeedDependService.class.getName();
                    if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
                }
                ((ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin).setComponentClickStatusExperimental(abstractC2249871D4f, EnumC700430Rdh.POSITIVE);
                return c18nv;
            }

            @Override // X.C12BP
            public final boolean LIZIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z) {
                if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_SHOWCASE.getTYPE() && z) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJIIIIZZ() {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        AnchorBizUtils.LIZ.getClass();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        Integer sellerType = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getSellerType();
        if (sellerType == null) {
            return false;
        }
        if (sellerType.intValue() == 1) {
            return true;
        }
        return sellerType.intValue() == 2 ? false : false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final String LJIIJJI() {
        C21272618Mq.LIZ.getClass();
        return (String) C13LP.LJJJLL(C21272618Mq.LJIJI());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final Map<String, Integer> LJIILLIIL() {
        C1706820uW8.LIZ.getClass();
        return C1706820uW8.LJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJIJJ() {
        C1706820uW8.LIZ.getClass();
        return C1706820uW8.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJIFFI() {
        AnchorBizUtils.LIZ.getClass();
        return AnchorBizUtils.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final InterfaceC1394860mOy LJJIIZI() {
        return new C21272118Ml();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJIJLIJ() {
        C21276418Oc.LIZ.getClass();
        return C21276418Oc.LIZ() == 1 || C21276418Oc.LIZ() == 2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final List<Integer> LJJIL() {
        AnchorBizUtils.LIZ.getClass();
        return AnchorBizUtils.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJIZ() {
        AnchorBizUtils.LIZ.getClass();
        return AnchorBizUtils.LJJJJZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final List<Integer> LJJJ() {
        AnchorBizUtils.LIZ.getClass();
        return AnchorBizUtils.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final C12BP LJJJJJL() {
        return new C12BP() { // from class: X.18NG
            @Override // X.C12BP
            public final InterfaceC2249881D4g LIZ(AbstractC2249871D4f abstractC2249871D4f) {
                AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
                String name;
                C21273218Mw c21273218Mw = new C21273218Mw(abstractC2249871D4f);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    boolean z = false;
                    anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                        z = true;
                    }
                    String name2 = ICommonFeedDependService.class.getName();
                    if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
                }
                ((ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin).setComponentClickStatusExperimental(abstractC2249871D4f, EnumC700430Rdh.POSITIVE);
                return c21273218Mw;
            }

            @Override // X.C12BP
            public final boolean LIZIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z) {
                if (anchorCommonStruct.getType() == 35 && !z) {
                    AnchorBizUtils.LIZ.getClass();
                    if (AnchorBizUtils.LJJL(aweme)) {
                        C21272618Mq.LIZ.getClass();
                        if (C21272618Mq.LIZIZ(aweme)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJJJLL() {
        C21272618Mq.LIZ.getClass();
        return C21272618Mq.LJII(false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJJZ() {
        C1706820uW8.LIZ.getClass();
        return C1706820uW8.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJLI() {
        C1706820uW8.LIZ.getClass();
        Keva keva = C1257480ipO.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recommend_product_show_blue_bg");
        sbLIZ.append(C1706820uW8.LJFF());
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final IPanelProviderProtocol LJJLIIIJILLIZJL() {
        if (((Number) C292970Be3.LIZ.getValue()).intValue() == 0 && ((Number) C292960Be2.LIZ.getValue()).intValue() == 0) {
            return null;
        }
        return new EcAnchorReviewsPanelProvider();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJLIIIJLJLI() {
        C1706820uW8.LIZ.getClass();
        C1706820uW8.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJLIIIJLLLLLLLZ() {
        C21276418Oc.LIZ.getClass();
        return C21276418Oc.LIZ() == 2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final String LJJLIIJ() {
        EcStickerCategorySetting.EcStickerCategoryConfig ecStickerCategoryConfig;
        AnchorBizUtils.LIZ.getClass();
        C21272618Mq.LIZ.getClass();
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EcStickerCategorySetting.EcStickerCategoryConfig ecStickerCategoryConfig2 = EcStickerCategorySetting.LIZ;
        EcStickerCategorySetting.EcStickerCategoryConfig ecStickerCategoryConfig3 = (EcStickerCategorySetting.EcStickerCategoryConfig) c0c64LJIILLIIL.LJJII(EcStickerCategorySetting.EcStickerCategoryConfig.class, ecStickerCategoryConfig2, "ecom_sticker_category", true);
        if (ecStickerCategoryConfig3 == null || !ecStickerCategoryConfig3.enableCategory) {
            return null;
        }
        if (!AnchorBizUtils.LJIILJJIL()) {
            C21272518Mp c21272518Mp = C21272518Mp.LIZ;
            String strLJJIIJ = AnchorBizUtils.LJJIIJ();
            c21272518Mp.getClass();
            Boolean bool = (Boolean) ((LinkedHashMap) C21272518Mp.LJIIL).get(strLJJIIJ);
            if (bool == null || !bool.booleanValue() || (ecStickerCategoryConfig = (EcStickerCategorySetting.EcStickerCategoryConfig) C0C64.LJIILLIIL().LJJII(EcStickerCategorySetting.EcStickerCategoryConfig.class, ecStickerCategoryConfig2, "ecom_sticker_category", true)) == null || !ecStickerCategoryConfig.enableCategory) {
                return null;
            }
        }
        EcStickerCategoryFuncSetting.LIZ.getClass();
        if (EcStickerCategoryFuncSetting.LIZ().forceHide) {
            return null;
        }
        return (String) C13LP.LJJJLL(C21272618Mq.LJIJI());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final C12BP LJJLJLI() {
        return new C12BP() { // from class: X.18Na
            @Override // X.C12BP
            public final InterfaceC2249881D4g LIZ(AbstractC2249871D4f abstractC2249871D4f) {
                AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
                String name;
                C21273118Mv c21273118Mv = new C21273118Mv(abstractC2249871D4f);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    boolean z = false;
                    anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                        z = true;
                    }
                    String name2 = ICommonFeedDependService.class.getName();
                    if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
                }
                ((ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin).setComponentClickStatusExperimental(abstractC2249871D4f, EnumC700430Rdh.POSITIVE);
                return c21273118Mv;
            }

            @Override // X.C12BP
            public final boolean LIZIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z) {
                if (anchorCommonStruct.getType() == 35 && z) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJLIIL() {
        C21272618Mq.LIZ.getClass();
        return C21272618Mq.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final InterfaceC1392790mLd LJLILLLLZI() {
        return new C18NL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final ProductListModel LJLJJL() {
        C21272518Mp.LIZ.getClass();
        return C21272518Mp.LJIIJ("ec_ug_vsa_plp_cache");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final List<Integer> LJLJJLL() {
        AnchorBizUtils.LIZ.getClass();
        return AnchorBizUtils.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final String getRecommendId() {
        C1706820uW8.LIZ.getClass();
        return C1706820uW8.LJI;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final int LJIJ() {
        return C18OW.LIZ().lowImageSize;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJIL() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("ec_toggle_show_by_data", true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJIJ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_multianchor_panel_shopcart_position", true, false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final AnchorPdpPreloadModel LJJLL() {
        AnonymousClass0317 anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin = NetworkUtilDependencyService.createINetworkUtilDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, INetworkUtilDependencyService.class.getName(), anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(INetworkUtilDependencyService.class);
        }
        if (((INetworkUtilDependencyService) anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin).isWeakNetwork()) {
            return null;
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        AnchorPdpPreloadModel anchorPdpPreloadModel = C21278318Ov.LIZ;
        AnchorPdpPreloadModel anchorPdpPreloadModel2 = (AnchorPdpPreloadModel) c0c64LJIILLIIL.LJJII(AnchorPdpPreloadModel.class, anchorPdpPreloadModel, "ec_anchor_pdp_preload_opt_android", true);
        return anchorPdpPreloadModel2 != null ? anchorPdpPreloadModel2 : anchorPdpPreloadModel;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final int LJLI() {
        return C21276418Oc.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJLJI() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_anchor_select_dialog_close_not_hide", true) == 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJLJJI() {
        return C928303k1.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final int LJLJLLL() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_video_publish_add_anchor_force_single", true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final int LJLLJ() {
        return C18OW.LIZ().middleImageSize;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LIZJ(Aweme aweme) {
        AnchorBizUtils.LIZ.getClass();
        if (!AnchorBizUtils.LJJLIIIJ(aweme)) {
            return false;
        }
        C21276418Oc.LIZ.getClass();
        if (C21276418Oc.LIZ() != 1 && C21276418Oc.LIZ() != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final Map<String, Object> LJII(Aweme aweme) {
        int iIntValue;
        AnchorBizUtils.LIZ.getClass();
        if (aweme == null) {
            return null;
        }
        C21275818Nw c21275818NwLJIJJLI = AnchorBizUtils.LJIJJLI(aweme);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num = c21275818NwLJIJJLI.LIZ;
        int iIntValue2 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        linkedHashMap.put("is_ecom", Integer.valueOf(iIntValue));
        Integer num2 = c21275818NwLJIJJLI.LIZIZ;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        linkedHashMap.put("ec_product_cnt", Integer.valueOf(iIntValue2));
        String str = c21275818NwLJIJJLI.LIZJ;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("ecom_product_list", str);
        linkedHashMap.put("is_ecom_intent", Integer.valueOf(aweme.getProductRecallType()));
        Integer num3 = c21275818NwLJIJJLI.LJ;
        if (num3 != null) {
            linkedHashMap.put("sale_intent", Integer.valueOf(num3.intValue()));
        }
        Map<String, Object> map = c21275818NwLJIJJLI.LIZLLL;
        if (map == null) {
            return linkedHashMap;
        }
        linkedHashMap.putAll(map);
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final Integer LJIILL(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        AnchorCommonStruct anchorCommonStruct = null;
        if (aweme != null && (!AwemeExtKt.isPhotoMode(aweme) || ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIII(aweme))) {
            if (C255960A1i.LIZ() && C21272218Mm.LJJIFFI(aweme)) {
                List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
                if (anchors2 != null) {
                    Iterator<AnchorCommonStruct> it2 = anchors2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        AnchorCommonStruct next = it2.next();
                        AnchorCommonStruct anchorCommonStruct2 = next;
                        if (anchorCommonStruct2.getType() == 35 && anchorCommonStruct2.getExtra().length() > 0) {
                            anchorCommonStruct = next;
                            break;
                        }
                    }
                    AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct;
                    if (anchorCommonStruct3 != null && C21272218Mm.LJIILIIL(anchorCommonStruct3).size() > 1) {
                        return Integer.valueOf(R.layout.alh);
                    }
                }
                return Integer.valueOf(R.layout.alm);
            }
            if (C21274118Nf.LIZJ() && (anchors = aweme.getAnchors()) != null) {
                Iterator<AnchorCommonStruct> it3 = anchors.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    AnchorCommonStruct next2 = it3.next();
                    if (next2.getType() == EnumC1430380nKG.ANCHOR_SHOWCASE.getTYPE()) {
                        if (next2 != null) {
                            return Integer.valueOf(R.layout.all);
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJIII(Aweme aweme) {
        String authorUid;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        boolean z;
        C21272618Mq.LIZ.getClass();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ec_anchor_consumer_photo_mode_enable", true, false)) {
            return true;
        }
        String name = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IAccountDependencyService.class.getName();
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        if (Intrinsics.LJFF(authorUid, ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJIIJ(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (!C255960A1i.LIZ() || !C21272218Mm.LJJIFFI(aweme) || (aweme != null && aweme.isAd() && ((Boolean) C268560Afm.LIZ.getValue()).booleanValue())) {
            if (C21274118Nf.LIZJ() && aweme != null && (anchors = aweme.getAnchors()) != null) {
                for (AnchorCommonStruct anchorCommonStruct : anchors) {
                    if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_SHOWCASE.getTYPE()) {
                        if (anchorCommonStruct == null) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJIIZ(Aweme aweme) {
        C21272618Mq.LIZ.getClass();
        return C21272618Mq.LJIIJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJIJIIJI(AwS608S0100000_29 awS608S0100000_29) {
        EventTrackData eventTrackData;
        C1706820uW8.LIZ.getClass();
        List<String> list = C1706820uW8.LJII;
        if ((list != null && !((ArrayList) list).isEmpty()) || ((eventTrackData = C1706820uW8.LJIIIIZZ) != null && Intrinsics.LJFF(eventTrackData.finishedDetection, Boolean.TRUE))) {
            C1706820uW8.LJIIIZ = C1706820uW8.LIZIZ();
            awS608S0100000_29.invoke(C1706820uW8.LJII);
            C1706820uW8.LJI();
            return;
        }
        C1706820uW8.LJFF = C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C1706780uW4(awS608S0100000_29, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJIJIIJIL(Aweme aweme) {
        String aid;
        AwemeRawAd awemeRawAd;
        ShopAnchorSellingPointData shopAnchorSellingPoints;
        C18NF.LIZ.getClass();
        for (AbstractC21274918Nn abstractC21274918Nn : C18NF.LIZIZ) {
            if (abstractC21274918Nn != null) {
                C18NF.LIZ.getClass();
                C18OC c18ocLIZJ = C18NF.LIZJ(abstractC21274918Nn);
                if (c18ocLIZJ != null) {
                    String str = c18ocLIZJ.LIZ;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(str, aid)) {
                        C18NF.LJIIIIZZ(abstractC21274918Nn);
                        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (shopAnchorSellingPoints = awemeRawAd.getShopAnchorSellingPoints()) != null) {
                            C18OC c18ocLIZJ2 = C18NF.LIZJ(abstractC21274918Nn);
                            if (Intrinsics.LJFF(shopAnchorSellingPoints.isRealBoost(), Boolean.TRUE) && c18ocLIZJ2 != null) {
                                if (Intrinsics.LJFF(shopAnchorSellingPoints.getBoostStatus(), 1) && !c18ocLIZJ2.LIZJ) {
                                    AFwS278S0000000_32 aFwS278S0000000_32 = AFwS278S0000000_32.get$arr$(143);
                                    C18OC c18ocLIZJ3 = C18NF.LIZJ(abstractC21274918Nn);
                                    if (c18ocLIZJ3 != null) {
                                        aFwS278S0000000_32.invoke(c18ocLIZJ3);
                                    }
                                    C18NF.LJII(aweme, abstractC21274918Nn, c18ocLIZJ2.LIZIZ, shopAnchorSellingPoints.getAnchorInfo());
                                } else if (Intrinsics.LJFF(shopAnchorSellingPoints.getBoostStatus(), 2) && c18ocLIZJ2.LIZJ) {
                                    C18NF.LJIIIZ(aweme, abstractC21274918Nn, c18ocLIZJ2.LIZIZ, true);
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJIJIL(List<? extends Aweme> list) {
        C1735040vFe.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_sv_should_enable_icon_url_download", true) && !C1735040vFe.LIZJ) {
            AnonymousClass0956 anonymousClass0956 = C1735040vFe.LIZIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C1735040vFe.LIZIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C599110Nef(list, null), 3);
        }
        C21273718Nb.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_sv_should_enable_prefix_vector_images", true) && !C21273718Nb.LIZLLL) {
            AnonymousClass0956 anonymousClass09562 = C21273718Nb.LIZJ;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            C1DFH c1dfh2 = C0PEM.LIZ;
            C21273718Nb.LIZJ = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C599140Nei(list, null), 3);
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_sv_should_show_top_disclosure_label", true) && !this.LIZ) {
            InterfaceC1739690vN9 interfaceC1739690vN9 = new InterfaceC1739690vN9() { // from class: X.0vNA
                public static final List<String> LIZIZ() {
                    return Collections.singletonList("anchor_panel_top_disclosure_label");
                }

                @Override // X.InterfaceC1739690vN9
                public final InterfaceC1756300vnw LIZ(C1739710vNB c1739710vNB) {
                    if (Intrinsics.LJFF(c1739710vNB.LIZ, "anchor_panel_top_disclosure_label")) {
                        return new InterfaceC1756300vnw(c1739710vNB.LIZIZ) { // from class: X.0c6b
                            public final String LIZ;

                            @Override // X.InterfaceC1756300vnw
                            public final void LIZ() {
                                C2341109Fh.LIZ.getClass();
                                C2341109Fh.LIZ("onViewDetached()");
                            }

                            {
                                this.LIZ = str;
                            }

                            @Override // X.InterfaceC1756300vnw
                            public final View LIZIZ(Context context) {
                                View viewLJIIL;
                                IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null);
                                if (iECommerceAnchorService != null && (viewLJIIL = iECommerceAnchorService.LJIIL(context, this.LIZ)) != null) {
                                    return viewLJIIL;
                                }
                                View view = new View(context);
                                C786410Ut5.LJLLLLLL(8, view);
                                return view;
                            }

                            @Override // X.InterfaceC1756300vnw
                            public final void LIZLLL(boolean z) {
                                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onViewVisibilityChanged() isVisible: ");
                                sbLIZ.append(z);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c2341109Fh.getClass();
                                C2341109Fh.LIZ(strLIZIZ);
                            }

                            @Override // X.InterfaceC1756300vnw
                            public final void o5(View view) {
                                C2341109Fh.LIZ.getClass();
                                C2341109Fh.LIZ("onViewAttached()");
                            }

                            @Override // X.InterfaceC1756300vnw
                            public final void LIZJ(View view, float f) {
                                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onDragProgressChanged() progress: ");
                                sbLIZ.append(f);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c2341109Fh.getClass();
                                C2341109Fh.LIZ(strLIZIZ);
                            }
                        };
                    }
                    return null;
                }
            };
            Iterator<String> it2 = C1739700vNA.LIZIZ().iterator();
            while (it2.hasNext()) {
                C07O9.LIZ.put(it2.next(), interfaceC1739690vN9);
            }
            this.LIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJJIL(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        AnchorBizUtils.LIZ.getClass();
        if (aweme != null && (anchors = aweme.getAnchors()) != null) {
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                AnchorBizUtils.LIZ.getClass();
                if (((ArrayList) AnchorBizUtils.LJIILL()).contains(Integer.valueOf(anchorCommonStruct.getType()))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0124  */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJI(android.net.Uri r48) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService.LJJJJI(android.net.Uri):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJJJIZL(String str) {
        C1018703yb.LIZLLL("tiktokec_toast_show", new AwS4S3000000_32(str, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac A[Catch: all -> 0x00c1, CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, all -> 0x00c1, blocks: (B:9:0x003f, B:10:0x004e, B:12:0x0054, B:14:0x0060, B:16:0x0066, B:18:0x006e, B:20:0x0072, B:23:0x0078, B:24:0x008d, B:26:0x0093, B:28:0x00b0, B:27:0x00ac, B:29:0x00b4), top: B:37:0x003f }] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LJJJJL(java.util.List<com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo> r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService.LJJJJL(java.util.List):java.util.Map");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJJJLI(List<AnchorTransData> list) {
        Boolean bool = ((EcAnchorDisableDeleteAppendInPublishConfig) C18O4.LIZIZ.getValue()).enable;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        ArrayList<AnchorTransData> arrayList = new ArrayList();
        for (AnchorTransData anchorTransData : list) {
            AnchorBizUtils.LIZ.getClass();
            if (AnchorBizUtils.LJIILLIIL().contains(Integer.valueOf(anchorTransData.businessType))) {
                arrayList.add(anchorTransData);
            }
        }
        for (AnchorTransData anchorTransData2 : arrayList) {
            AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
            String str = anchorTransData2.anchorContent;
            anchorBizUtils.getClass();
            if (AnchorBizUtils.LJJLI(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJJJZ(Aweme aweme) {
        AnchorBizUtils.LIZ.getClass();
        return AnchorBizUtils.LJJJJLI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJJLZIJ(String str) {
        Boolean bool = ((EcAnchorDisableDeleteAppendInPublishConfig) C18O4.LIZIZ.getValue()).enable;
        if (bool == null || !bool.booleanValue() || str == null) {
            return false;
        }
        AnchorBizUtils.LIZ.getClass();
        return AnchorBizUtils.LJJLI(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final List<AnchorProductInfo> LJJLIIIJ(Aweme aweme) {
        AnchorBizUtils.LIZ.getClass();
        return AnchorBizUtils.LJJZZI(aweme);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIIJJI(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r5 = this;
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "ec_sv_enable_photo_dynamic_report_moderation_flow"
            r4 = 1
            boolean r1 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r4)
            r0 = 0
            if (r1 != 0) goto L12
            return r0
        L12:
            r3 = 0
            if (r6 == 0) goto L5b
            java.lang.String r2 = r6.getAnchorsExtras()     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L5b
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L6b
            if (r0 <= 0) goto L5b
            com.google.gson.Gson r1 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L57 java.lang.Throwable -> L6b
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L57 java.lang.Throwable -> L6b
            r0.getClass()     // Catch: com.google.gson.s -> L57 java.lang.Throwable -> L6b
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L57 java.lang.Throwable -> L6b
            if (r0 == 0) goto L47
            boolean r0 = r0.LJII     // Catch: com.google.gson.s -> L57 java.lang.Throwable -> L6b
            if (r0 != r4) goto L47
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AnchorsExtras> r0 = com.ss.android.ugc.aweme.feed.model.AnchorsExtras.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L57 java.lang.Throwable -> L6b
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L57 java.lang.Throwable -> L6b
        L3e:
            java.lang.Object r1 = r1.LJIIIIZZ(r2, r0)     // Catch: com.google.gson.s -> L57 java.lang.Throwable -> L6b
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.model.AnchorsExtras     // Catch: com.google.gson.s -> L57 java.lang.Throwable -> L6b
            if (r0 != 0) goto L52
            goto L51
        L47:
            X.18OF r0 = new X.18OF     // Catch: com.google.gson.s -> L57 java.lang.Throwable -> L6b
            r0.<init>()     // Catch: com.google.gson.s -> L57 java.lang.Throwable -> L6b
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L57 java.lang.Throwable -> L6b
            goto L3e
        L51:
            r1 = r3
        L52:
            com.ss.android.ugc.aweme.feed.model.AnchorsExtras r1 = (com.ss.android.ugc.aweme.feed.model.AnchorsExtras) r1     // Catch: com.google.gson.s -> L57 java.lang.Throwable -> L6b
            if (r1 == 0) goto L5b
            goto L5d
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6b
        L5b:
            r4 = 0
            goto L63
        L5d:
            com.ss.android.ugc.aweme.feed.model.DynamicPhotoModeInfo r0 = r1.getDynamicPhotoModeInfo()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L5b
        L63:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L6b
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L6b
            goto L77
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L77:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L80
            r2 = r1
        L80:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService.LJJLIIIJJI(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final List<AnchorProductInfoModel> LJJLIIIJL(AnchorCommonStruct anchorCommonStruct) {
        AnchorBizUtils.LIZ.getClass();
        return AnchorBizUtils.LJJZZIII(anchorCommonStruct, false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJLIL(Aweme aweme) {
        AnchorBizUtils.LIZ.getClass();
        if (!AnchorBizUtils.LJJLIIIJ(aweme)) {
            return false;
        }
        C21276418Oc.LIZ.getClass();
        if (C21276418Oc.LIZ() != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJZZI(Aweme aweme) {
        AnchorBizUtils.LIZ.getClass();
        return AnchorBizUtils.LJJL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final int LJLIIIL(Aweme aweme) {
        C21272618Mq.LIZ.getClass();
        return C21272618Mq.LJIILLIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJLL(Aweme aweme) {
        AnchorBizUtils.LIZ.getClass();
        return AnchorBizUtils.LJJLIIIJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJLLILLLL(AnchorCommonStruct anchorCommonStruct) {
        AnchorBizUtils.LIZ.getClass();
        return AnchorBizUtils.LJJLIIIIJ(anchorCommonStruct);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJLLL(ECAvMusic eCAvMusic) {
        Boolean bool;
        AnchorBizUtils.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_sv_enable_strict_ec_music_compliance", true)) {
            if (eCAvMusic == null) {
                return true;
            }
            Boolean bool2 = eCAvMusic.isHasCommerceRightStrict;
            if (bool2 == null && (bool2 = eCAvMusic.isHasCommerceRight) == null) {
                if (eCAvMusic == null || (bool = eCAvMusic.isCommerceMusic) == null) {
                    return true;
                }
                return bool.booleanValue();
            }
            return bool2.booleanValue();
        }
        if (eCAvMusic == null) {
            return true;
        }
        Boolean bool3 = eCAvMusic.isHasCommerceRight;
        if (bool3 != null) {
            return bool3.booleanValue();
        }
        Boolean bool4 = eCAvMusic.isCommerceMusic;
        if (bool4 == null) {
            return true;
        }
        return bool4.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final String LIZLLL(Aweme aweme, boolean z) {
        return C21272218Mm.LJIIL(aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJFF(C2344009Gk c2344009Gk, Aweme aweme) {
        int iIntValue;
        AnchorBizUtils.LIZ.getClass();
        if (aweme != null) {
            C21275818Nw c21275818NwLJIJJLI = AnchorBizUtils.LJIJJLI(aweme);
            Integer num = c21275818NwLJIJJLI.LIZ;
            int iIntValue2 = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c2344009Gk.LJFF("is_ecom", String.valueOf(iIntValue));
            Integer num2 = c21275818NwLJIJJLI.LIZIZ;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            c2344009Gk.LJFF("ec_product_cnt", String.valueOf(iIntValue2));
            String str = c21275818NwLJIJJLI.LIZJ;
            if (str == null) {
                str = "";
            }
            c2344009Gk.LJFF("ecom_product_list", str);
            c2344009Gk.LIZJ(aweme.getProductRecallType(), "is_ecom_intent");
            Integer num3 = c21275818NwLJIJJLI.LJ;
            if (num3 != null) {
                c2344009Gk.LIZJ(num3.intValue(), "sale_intent");
            }
            Map<String, Object> map = c21275818NwLJIJJLI.LIZLLL;
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    c2344009Gk.LJ(entry.getValue(), entry.getKey());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJI(Bundle bundle, Aweme aweme) {
        int iIntValue;
        AnchorBizUtils.LIZ.getClass();
        if (aweme != null) {
            C21275818Nw c21275818NwLJIJJLI = AnchorBizUtils.LJIJJLI(aweme);
            if (bundle != null) {
                Map<String, Object> map = c21275818NwLJIJJLI.LIZLLL;
                if (map != null) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        C786410Ut5.LJJJI(entry.getKey(), entry.getValue().toString(), bundle);
                    }
                }
                Integer num = c21275818NwLJIJJLI.LIZ;
                int iIntValue2 = 0;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                bundle.putInt("is_ecom", iIntValue);
                Integer num2 = c21275818NwLJIJJLI.LIZIZ;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                }
                bundle.putInt("ec_product_cnt", iIntValue2);
                String str = c21275818NwLJIJJLI.LIZJ;
                if (str == null) {
                    str = "";
                }
                C786410Ut5.LJJJI("ecom_product_list", str, bundle);
                bundle.putInt("is_ecom_intent", aweme.getProductRecallType());
                Integer num3 = c21275818NwLJIJJLI.LJ;
                if (num3 != null) {
                    bundle.putInt("sale_intent", num3.intValue());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final n LJIIIZ(String str, String str2) {
        C21272518Mp.LIZ.getClass();
        C1977107on c1977107on = C21272518Mp.LJII;
        c1977107on.getClass();
        RelatedProductInfo relatedProductInfo = c1977107on.get(C1977107on.LIZ(str, str2));
        if (relatedProductInfo != null) {
            n nVar = new n();
            nVar.LJJIIJ("video_id", relatedProductInfo.videoId);
            nVar.LJJIIJ("author_id", relatedProductInfo.authorId);
            h hVar = new h();
            Iterator<Long> it2 = relatedProductInfo.productIdList.iterator();
            while (it2.hasNext()) {
                hVar.LJJIII(String.valueOf(it2.next().longValue()));
            }
            nVar.LJJIFFI("product_id_list", hVar);
            h hVar2 = new h();
            Iterator<Long> it3 = relatedProductInfo.expoProductIdList.iterator();
            while (it3.hasNext()) {
                hVar2.LJJIII(String.valueOf(it3.next().longValue()));
            }
            nVar.LJJIFFI("expo_product_id_list", hVar2);
            h hVar3 = new h();
            Iterator<Long> it4 = relatedProductInfo.clickProductIdList.iterator();
            while (it4.hasNext()) {
                hVar3.LJJIII(String.valueOf(it4.next().longValue()));
            }
            nVar.LJJIFFI("click_product_id_list", hVar3);
            return nVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0vpO, android.view.View] */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final View LJIIL(final Context context, String str) {
        final AttributeSet attributeSet = null;
        ?? r1 = new ConstraintLayout(context, attributeSet) { // from class: X.0vpO
            public ConstraintLayout LL;
            public TuxTextView LLILLJJLI;
            public PanelTopDisclosureViewData LLILLL;

            private final ConstraintLayout getAnchorPinCardPortableView() {
                KeyEvent.Callback callbackFindViewById = this.LL;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.b1c);
                    this.LL = (ConstraintLayout) callbackFindViewById;
                }
                return (ConstraintLayout) callbackFindViewById;
            }

            private final TuxTextView getAnchorPinCardTitle() {
                KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.f671b1d);
                    this.LLILLJJLI = (TuxTextView) callbackFindViewById;
                }
                return (TuxTextView) callbackFindViewById;
            }

            public final void setViewDataString(String str2) {
                Type type;
                PanelTopDisclosureViewData panelTopDisclosureViewData = null;
                if (str2 != null) {
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type = C2371409Qy.LIZJ(C13LE.LJ(PanelTopDisclosureViewData.class));
                        } else {
                            type = new TypeToken<PanelTopDisclosureViewData>() { // from class: X.0vpP
                            }.getType();
                        }
                        Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                        if (!(objFromJson instanceof PanelTopDisclosureViewData)) {
                            objFromJson = null;
                        }
                        panelTopDisclosureViewData = (PanelTopDisclosureViewData) objFromJson;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                this.LLILLL = panelTopDisclosureViewData;
            }

            {
                super(context, attributeSet);
                ViewGroup.inflate(context, R.layout.akn, this);
                C19ME c19me = new C19ME(-2, -2);
                C1546210qL5.LIZ.getClass();
                c19me.setMarginStart(C814420VxA.LIZIZ(C1546210qL5.LIZ(8)));
                c19me.setMarginEnd(C814420VxA.LIZIZ(C1546210qL5.LIZ(8)));
                ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = C814420VxA.LIZIZ(C1546210qL5.LIZ(8));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setLayoutParams(c19me);
                ConstraintLayout anchorPinCardPortableView = getAnchorPinCardPortableView();
                if (anchorPinCardPortableView != null) {
                    anchorPinCardPortableView.setMaxWidth((C497820Jfg.LIZIZ(getContext()) - C814420VxA.LIZIZ(C1546210qL5.LIZ(8))) - C814420VxA.LIZIZ(C1546210qL5.LIZ(8)));
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[PHI: r7
              0x002c: PHI (r7v4 java.lang.String) = (r7v0 java.lang.String), (r7v5 java.lang.String) binds: [B:12:0x002a, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onLayout(boolean r16, int r17, int r18, int r19, int r20) {
                /*
                    r15 = this;
                    super.onLayout(r16, r17, r18, r19, r20)
                    androidx.constraintlayout.widget.ConstraintLayout r0 = r15.getAnchorPinCardPortableView()
                    com.bytedance.tux.input.TuxTextView r5 = r15.getAnchorPinCardTitle()
                    int r4 = r0.getMaxWidth()
                    int r1 = r0.getPaddingStart()
                    int r0 = r0.getPaddingEnd()
                    int r1 = r1 + r0
                    int r4 = r4 - r1
                    if (r4 <= 0) goto Lac
                    com.ss.android.ugc.aweme.ecommerce.anchor.utils.PanelTopDisclosureViewData r0 = r15.LLILLL
                    if (r0 == 0) goto Lad
                    com.ss.android.ugc.aweme.feed.model.PanelTopDisclosureLabel r0 = r0.label
                L21:
                    java.lang.String r9 = ""
                    if (r0 == 0) goto L29
                    java.lang.String r7 = r0.displayText
                    if (r7 != 0) goto L2c
                L29:
                    r7 = r9
                    if (r0 == 0) goto L31
                L2c:
                    java.lang.String r0 = r0.truncatableText
                    if (r0 == 0) goto L31
                    r9 = r0
                L31:
                    android.text.TextPaint r0 = r5.getPaint()
                    float r0 = r0.measureText(r7)
                    float r13 = (float) r4
                    int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                    if (r0 <= 0) goto La0
                    r10 = 0
                    boolean r0 = kotlin.text.a0.LJJIIZI(r7, r9, r10)
                    if (r0 == 0) goto La0
                    r0 = 6
                    int r1 = kotlin.text.a0.LJJJ(r7, r9, r10, r10, r0)
                    int r0 = r9.length()
                    int r0 = r0 + r1
                    java.lang.String r6 = r7.substring(r10, r1)
                    java.lang.String r3 = r7.substring(r0)
                    android.text.TextPaint r0 = r5.getPaint()
                    float r8 = r0.measureText(r6)
                    android.text.TextPaint r0 = r5.getPaint()
                    java.lang.String r2 = "..."
                    float r1 = r0.measureText(r2)
                    android.text.TextPaint r0 = r5.getPaint()
                    float r0 = r0.measureText(r3)
                    float r13 = r13 - r8
                    float r13 = r13 - r0
                    float r13 = r13 - r1
                    r0 = 0
                    int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                    if (r0 <= 0) goto La0
                    r12 = 1
                    float[] r14 = new float[r12]
                    android.text.TextPaint r8 = r5.getPaint()
                    int r11 = r9.length()
                    int r0 = r8.breakText(r9, r10, r11, r12, r13, r14)
                    java.lang.String r1 = r9.substring(r10, r0)
                    java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
                    r0.append(r6)
                    r0.append(r1)
                    r0.append(r2)
                    r0.append(r3)
                    java.lang.String r7 = X.C2188811AlT.LIZIZ(r0)
                La0:
                    int r0 = r5.getMaxWidth()
                    if (r0 == r4) goto Lac
                    r5.setMaxWidth(r4)
                    r5.setText(r7)
                Lac:
                    return
                Lad:
                    r0 = 0
                    goto L21
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1757200vpO.onLayout(boolean, int, int, int, int):void");
            }
        };
        r1.setViewDataString(str);
        return r1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJIIZILJ(Context context, String str) {
        if (context != null && str != null) {
            AnchorBizUtils.LIZ.getClass();
            if (AnchorBizUtils.LJJLIIIJILLIZJL(str, false) || !Intrinsics.LJFF("1", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "outer_ecom_product"))) {
                return;
            }
            C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(context, 19));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final String LJIJJLI(String str, Map map) {
        AnchorPanelConfig anchorPanelConfig;
        String strLJIIIIZZ;
        AnchorBizUtils.LIZ.getClass();
        if (str != null && str.length() != 0) {
            if (Intrinsics.LJFF("commercialize", "commercialize")) {
                C21269318Lj c21269318Lj = new C21269318Lj();
                c21269318Lj.LIZ.setPanelOpenWay(1);
                c21269318Lj.LIZ.setPanelOpenSource("commercialize");
                c21269318Lj.LIZ.setPanelStyle(0);
                c21269318Lj.LIZ.setEnableMaybeYouLike(false);
                c21269318Lj.LIZ.setEnableSearchEntrance(false);
                c21269318Lj.LIZ.setEnableClaimVoucher(false);
                c21269318Lj.LIZ.setEnablePromotionBanner(false);
                c21269318Lj.LIZ.setPanelClickMethod(0);
                anchorPanelConfig = c21269318Lj.LIZ;
            } else if (Intrinsics.LJFF("commercialize", "ug_mall")) {
                C21269318Lj c21269318Lj2 = new C21269318Lj();
                c21269318Lj2.LIZ.setPanelOpenWay(1);
                c21269318Lj2.LIZ.setPanelOpenSource("ug_mall");
                c21269318Lj2.LIZ.setPanelStyle(0);
                c21269318Lj2.LIZ.setEnableMaybeYouLike(false);
                c21269318Lj2.LIZ.setEnableSearchEntrance(false);
                c21269318Lj2.LIZ.setEnableClaimVoucher(true);
                c21269318Lj2.LIZ.setEnablePromotionBanner(true);
                c21269318Lj2.LIZ.setPanelClickMethod(0);
                anchorPanelConfig = c21269318Lj2.LIZ;
            } else {
                anchorPanelConfig = new AnchorPanelConfig(0, "video_anchor", 0, false, 0, false, false, false, false, new LinkedHashMap());
            }
            Uri.Builder builderLIZ = C1976807ok.LIZ(UriProtector.parse(str), new Pair("panel_config", C1741890vQh.LJIIIIZZ(anchorPanelConfig)));
            Pair[] pairArr = new Pair[1];
            if (map != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map);
            } else {
                strLJIIIIZZ = null;
            }
            pairArr[0] = new Pair("track_params", strLJIIIIZZ);
            C1976807ok.LIZJ(builderLIZ, pairArr);
            return builderLIZ.build().toString();
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final List<String> LJJ(boolean z, boolean z2) {
        EcStickerCategorySetting.EcStickerCategoryConfig ecStickerCategoryConfig;
        AnchorBizUtils.LIZ.getClass();
        if (!z && !z2) {
            C21272618Mq.LIZ.getClass();
            EcStickerCategoryFuncSetting.LIZ.getClass();
            if (!EcStickerCategoryFuncSetting.LIZ().forceHide && AnchorBizUtils.LJJJJZ() && (ecStickerCategoryConfig = (EcStickerCategorySetting.EcStickerCategoryConfig) C0C64.LJIILLIIL().LJJII(EcStickerCategorySetting.EcStickerCategoryConfig.class, EcStickerCategorySetting.LIZ, "ecom_sticker_category", true)) != null && ecStickerCategoryConfig.enableCategory) {
                return null;
            }
        }
        C21272618Mq.LIZ.getClass();
        return new ArrayList(C21272618Mq.LJIJI());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJI(ProductListModel productListModel, String str) {
        C21272518Mp.LIZ.getClass();
        if (str.length() != 0) {
            Map<String, ProductListModel> map = C21272518Mp.LJIIIZ;
            if (map.size() > 3) {
                ((LinkedHashMap) map).clear();
            }
            map.put(str, productListModel);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJJI(Aweme aweme, List list) {
        String str;
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        Type type;
        CreatorAnchorContent creatorAnchorContent;
        C21272018Mk.LIZ.getClass();
        int i = 0;
        for (Object obj : (ArrayList) list) {
            int i2 = i + 1;
            String aid = null;
            if (i >= 0) {
                CreateAnchorInfo createAnchorInfo = (CreateAnchorInfo) obj;
                AnchorBizUtils.LIZ.getClass();
                if (AnchorBizUtils.LJIILLIIL().contains(Integer.valueOf(createAnchorInfo.getType()))) {
                    C21272018Mk.LIZ.getClass();
                    int i3 = 1;
                    try {
                        String content = createAnchorInfo.getContent();
                        try {
                            Gson gsonLJFF = C1741890vQh.LJFF();
                            C1120604Zw.LIZ.getClass();
                            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                                type = C2371409Qy.LIZJ(C13LE.LJII(CreatorAnchorContent.class));
                            } else {
                                type = new TypeToken<CreatorAnchorContent>() { // from class: X.18Ot
                                }.getType();
                            }
                            Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(content, type);
                            if (!(objLJIIIIZZ instanceof CreatorAnchorContent)) {
                                objLJIIIIZZ = null;
                            }
                            creatorAnchorContent = (CreatorAnchorContent) objLJIIIIZZ;
                        } catch (s e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (CancellationException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw e2;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (creatorAnchorContent != null) {
                        str = creatorAnchorContent.productId;
                    } else {
                        str = null;
                    }
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    Pair[] pairArr = new Pair[12];
                    pairArr[0] = new Pair("channel", "video_posting_auto_added");
                    pairArr[1] = new Pair("product_id", str);
                    C21272018Mk.LIZ.getClass();
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                        if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name2 = IAccountDependencyService.class.getName();
                        if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                            name = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                        iECommerceHostService = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                    }
                    String userId = ((IAccountDependencyService) iECommerceHostService).getUserId();
                    if (userId != null) {
                        str2 = userId;
                    }
                    pairArr[2] = new Pair("author_id", str2);
                    pairArr[3] = new Pair("page_name", "video_post_page");
                    pairArr[4] = new Pair("enter_from", "video_post_page");
                    pairArr[5] = new Pair("add_method", "post_video");
                    pairArr[6] = new Pair("item_order", Integer.valueOf(i));
                    pairArr[7] = new Pair("is_success", "yes");
                    C1706820uW8.LIZ.getClass();
                    int iLIZLLL = C1706820uW8.LIZLLL();
                    if (iLIZLLL == 1) {
                        List<String> list2 = C1706820uW8.LJII;
                        if (list2 != null && !((ArrayList) list2).isEmpty()) {
                            List<String> list3 = C1706820uW8.LJII;
                            if (list3 == null || !((ArrayList) list3).contains(str)) {
                                i3 = 2;
                            }
                        } else {
                            i3 = 0;
                        }
                    } else {
                        i3 = iLIZLLL;
                    }
                    pairArr[8] = new Pair("is_suggested", Integer.valueOf(i3));
                    pairArr[9] = new Pair("ec_recommend_id", C1706820uW8.LJI);
                    if (aweme != null) {
                        aid = aweme.getAid();
                    }
                    pairArr[10] = new Pair("group_id", aid);
                    pairArr[11] = new Pair("ecommerce_intention", C1706820uW8.LJ().get("ecommerce_intention"));
                    Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("rd_err_code", Integer.valueOf(C1706820uW8.LJIIL.LL));
                    linkedHashMap.put("rd_extra", C1706820uW8.LJIIJ);
                    linkedHashMap.put("rd_enable", Integer.valueOf(C1706820uW8.LIZJ() ? 1 : 0));
                    C21272618Mq.LIZ.getClass();
                    linkedHashMap.put("rd_hit", Integer.valueOf(C21272618Mq.LJIILJJIL() ? 1 : 0));
                    mapLJIIJ.putAll(linkedHashMap);
                    C1421105hJ.LIZJ("tiktokec_pick_affiliate_product", mapLJIIJ);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C1706820uW8.LIZ.getClass();
        C1706820uW8.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJJJJ(Aweme aweme, String str) throws JSONException {
        String groupId;
        String requestId;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        C21271918Mj.LIZ.getClass();
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJJLI(aweme)) {
            Pair[] pairArr = new Pair[10];
            int size = 0;
            pairArr[0] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
            if (aweme != null) {
                groupId = aweme.getGroupId();
            } else {
                groupId = null;
            }
            pairArr[1] = new Pair("group_id", groupId);
            pairArr[2] = new Pair("aweme_type", 150);
            if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                size = imageList.size();
            }
            pairArr[3] = new Pair("pic_cnt", Integer.valueOf(size));
            pairArr[4] = new Pair("page_name", "graphic_detail");
            pairArr[5] = new Pair("source_page_type", "video");
            String str2 = "";
            if (str == null) {
                str = "";
            }
            pairArr[6] = new Pair("enter_from", str);
            pairArr[7] = new Pair("bar_name", "video_photo_detail_single_anchor");
            pairArr[8] = new Pair("previous_page", "video");
            if (aweme != null && (requestId = aweme.getRequestId()) != null) {
                str2 = requestId;
            }
            pairArr[9] = new Pair("request_id", str2);
            C1421105hJ.LIZLLL("tiktokec_slide_bar", pairArr);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJLIIIIJ(C19EG c19eg, RouteIntent routeIntent) {
        String url;
        List<AnchorCommonStruct> list;
        List<AnchorProductInfoModel> list2;
        String str;
        User user;
        AnchorCustomData anchorCustomData;
        Map<String, String> map;
        HashMap<String, String> map2;
        Boolean boolIsAd;
        AwemeRawAd awemeRawAd;
        Long lValueOf;
        ShopAdStruct shopAdStruct;
        Aweme aweme;
        Boolean boolIsPhotoMode;
        Boolean boolIsSingleAnchor;
        AnchorPanelConfig anchorPanelConfig;
        Map linkedHashMap;
        Type type;
        Type type2;
        Type type3;
        Type type4;
        Type type5;
        Type type6;
        Type type7;
        Type type8;
        Type type9;
        Type type10;
        Type type11;
        Type type12;
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        anchorBizUtils.getClass();
        if (url != null && url.length() != 0) {
            Uri uri = UriProtector.parse(url);
            String strLIZIZ = C1942307jB.LIZIZ(uri, "plp_cache_key");
            if (strLIZIZ == null) {
                ((IEComOfflineService) ServiceManager.get().getService(IEComOfflineService.class)).LIZIZ();
                return true;
            }
            String strLIZIZ2 = C1942307jB.LIZIZ(uri, "source_btm_token");
            C21272518Mp.LIZ.getClass();
            ProductListModel productListModelLJIIJ = C21272518Mp.LJIIJ(strLIZIZ);
            String strLIZIZ3 = C1942307jB.LIZIZ(uri, "aid");
            if (strLIZIZ3 == null) {
                if (productListModelLJIIJ != null) {
                    strLIZIZ3 = productListModelLJIIJ.aid;
                } else {
                    strLIZIZ3 = null;
                }
            }
            String strLIZIZ4 = C1942307jB.LIZIZ(uri, "group_id");
            if (strLIZIZ4 == null) {
                if (productListModelLJIIJ != null) {
                    strLIZIZ4 = productListModelLJIIJ.groupId;
                } else {
                    strLIZIZ4 = null;
                }
            }
            String strLIZIZ5 = C1942307jB.LIZIZ(uri, "request_id");
            if (strLIZIZ5 == null) {
                if (productListModelLJIIJ != null) {
                    strLIZIZ5 = productListModelLJIIJ.requestId;
                } else {
                    strLIZIZ5 = null;
                }
            }
            String strLIZIZ6 = C1942307jB.LIZIZ(uri, "anchors");
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    C13JX c13jx = KTypeProjection.LIZJ;
                    C13JW c13jwLJII = C13LE.LJII(AnchorCommonStruct.class);
                    c13jx.getClass();
                    type12 = C2371409Qy.LIZJ(C13LE.LJFF(List.class, C13JX.LIZ(c13jwLJII)));
                } else {
                    type12 = new TypeToken<List<? extends AnchorCommonStruct>>() { // from class: X.0c2K
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, strLIZIZ6, type12);
                if (!(objFromJson instanceof List)) {
                    objFromJson = null;
                }
                list = (List) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (list == null) {
                if (productListModelLJIIJ != null) {
                    list = productListModelLJIIJ.anchors;
                } else {
                    list = null;
                }
            }
            String strLIZIZ7 = C1942307jB.LIZIZ(uri, "products");
            try {
                Gson gsonLJFF2 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                    C13JX c13jx2 = KTypeProjection.LIZJ;
                    C13JW c13jwLJII2 = C13LE.LJII(AnchorProductInfoModel.class);
                    c13jx2.getClass();
                    type11 = C2371409Qy.LIZJ(C13LE.LJFF(List.class, C13JX.LIZ(c13jwLJII2)));
                } else {
                    type11 = new TypeToken<List<? extends AnchorProductInfoModel>>() { // from class: X.12BZ
                    }.getType();
                }
                Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, strLIZIZ7, type11);
                if (!(objFromJson2 instanceof List)) {
                    objFromJson2 = null;
                }
                list2 = (List) objFromJson2;
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (list2 == null) {
                if (productListModelLJIIJ != null) {
                    list2 = productListModelLJIIJ.products;
                } else {
                    list2 = null;
                }
            }
            String strLIZIZ8 = C1942307jB.LIZIZ(uri, "author_uid");
            try {
                Gson gsonLJFF3 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ3 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ3 != null && c1121904a9LIZIZ3.LJII) {
                    type10 = C2371409Qy.LIZJ(C13LE.LJ(String.class));
                } else {
                    type10 = new TypeToken<String>() { // from class: X.18Om
                    }.getType();
                }
                Object objFromJson3 = GsonProtectorUtils.fromJson(gsonLJFF3, strLIZIZ8, type10);
                if (!(objFromJson3 instanceof String)) {
                    objFromJson3 = null;
                }
                str = (String) objFromJson3;
            } catch (s e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (str == null) {
                if (productListModelLJIIJ != null) {
                    str = productListModelLJIIJ.authorUid;
                } else {
                    str = null;
                }
            }
            String strLIZIZ9 = C1942307jB.LIZIZ(uri, "author");
            try {
                Gson gsonLJFF4 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ4 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ4 != null && c1121904a9LIZIZ4.LJII) {
                    type9 = C2371409Qy.LIZJ(C13LE.LJ(User.class));
                } else {
                    type9 = new TypeToken<User>() { // from class: X.18On
                    }.getType();
                }
                Object objFromJson4 = GsonProtectorUtils.fromJson(gsonLJFF4, strLIZIZ9, type9);
                if (!(objFromJson4 instanceof User)) {
                    objFromJson4 = null;
                }
                user = (User) objFromJson4;
            } catch (s e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            if (user == null) {
                if (productListModelLJIIJ != null) {
                    user = productListModelLJIIJ.author;
                } else {
                    user = null;
                }
            }
            String strLIZIZ10 = C1942307jB.LIZIZ(uri, "aweme_raw_ad_id_str");
            if (strLIZIZ10 == null) {
                if (productListModelLJIIJ != null) {
                    strLIZIZ10 = productListModelLJIIJ.awemeRawAdIdStr;
                } else {
                    strLIZIZ10 = null;
                }
            }
            String strLIZIZ11 = C1942307jB.LIZIZ(uri, "anchor_custom_data");
            try {
                Gson gsonLJFF5 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ5 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ5 != null && c1121904a9LIZIZ5.LJII) {
                    type8 = C2371409Qy.LIZJ(C13LE.LJ(AnchorCustomData.class));
                } else {
                    type8 = new TypeToken<AnchorCustomData>() { // from class: X.18Oo
                    }.getType();
                }
                Object objFromJson5 = GsonProtectorUtils.fromJson(gsonLJFF5, strLIZIZ11, type8);
                if (!(objFromJson5 instanceof AnchorCustomData)) {
                    objFromJson5 = null;
                }
                anchorCustomData = (AnchorCustomData) objFromJson5;
            } catch (s e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            if (anchorCustomData == null) {
                if (productListModelLJIIJ != null) {
                    anchorCustomData = productListModelLJIIJ.anchorCustomData;
                } else {
                    anchorCustomData = null;
                }
            }
            String strLIZIZ12 = C1942307jB.LIZIZ(uri, "aweme_extra_params");
            try {
                Gson gsonLJFF6 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ6 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ6 != null && c1121904a9LIZIZ6.LJII) {
                    C13JX c13jx3 = KTypeProjection.LIZJ;
                    C13JW c13jwLJII3 = C13LE.LJII(String.class);
                    c13jx3.getClass();
                    type7 = C2371409Qy.LIZJ(C13LE.LJI(Map.class, C13JX.LIZ(c13jwLJII3), C13JX.LIZ(C13LE.LJII(String.class))));
                } else {
                    type7 = new TypeToken<Map<String, ? extends String>>() { // from class: X.04YN
                    }.getType();
                }
                Object objFromJson6 = GsonProtectorUtils.fromJson(gsonLJFF6, strLIZIZ12, type7);
                if (!(objFromJson6 instanceof Map)) {
                    objFromJson6 = null;
                }
                map = (Map) objFromJson6;
            } catch (s e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            if (map == null) {
                if (productListModelLJIIJ != null) {
                    map = productListModelLJIIJ.awemeExtraParams;
                } else {
                    map = null;
                }
            }
            String strLIZIZ13 = C1942307jB.LIZIZ(uri, "mob_params");
            try {
                Gson gsonLJFF7 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ7 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ7 != null && c1121904a9LIZIZ7.LJII) {
                    C13JX c13jx4 = KTypeProjection.LIZJ;
                    C13JW c13jwLJII4 = C13LE.LJII(String.class);
                    c13jx4.getClass();
                    type6 = C2371409Qy.LIZJ(C13LE.LJI(HashMap.class, C13JX.LIZ(c13jwLJII4), C13JX.LIZ(C13LE.LJ(String.class))));
                } else {
                    type6 = new TypeToken<HashMap<String, String>>() { // from class: X.04ZQ
                    }.getType();
                }
                Object objFromJson7 = GsonProtectorUtils.fromJson(gsonLJFF7, strLIZIZ13, type6);
                if (!(objFromJson7 instanceof HashMap)) {
                    objFromJson7 = null;
                }
                map2 = (HashMap) objFromJson7;
            } catch (s e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            if (map2 == null) {
                if (productListModelLJIIJ != null) {
                    map2 = productListModelLJIIJ.mobParams;
                } else {
                    map2 = null;
                }
            }
            String strLIZIZ14 = C1942307jB.LIZIZ(uri, "is_ad");
            if (strLIZIZ14 != null) {
                boolIsAd = Boolean.valueOf(Boolean.parseBoolean(strLIZIZ14));
            } else if (productListModelLJIIJ != null) {
                boolIsAd = productListModelLJIIJ.isAd();
            } else {
                boolIsAd = null;
            }
            String strLIZIZ15 = C1942307jB.LIZIZ(uri, "aweme_raw_ad");
            try {
                Gson gsonLJFF8 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ8 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ8 != null && c1121904a9LIZIZ8.LJII) {
                    type5 = C2371409Qy.LIZJ(C13LE.LJ(AwemeRawAd.class));
                } else {
                    type5 = new TypeToken<AwemeRawAd>() { // from class: X.18Op
                    }.getType();
                }
                Object objFromJson8 = GsonProtectorUtils.fromJson(gsonLJFF8, strLIZIZ15, type5);
                if (!(objFromJson8 instanceof AwemeRawAd)) {
                    objFromJson8 = null;
                }
                awemeRawAd = (AwemeRawAd) objFromJson8;
            } catch (s e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            if (awemeRawAd == null) {
                if (productListModelLJIIJ != null) {
                    awemeRawAd = productListModelLJIIJ.awemeRawAd;
                } else {
                    awemeRawAd = null;
                }
            }
            String strLIZIZ16 = C1942307jB.LIZIZ(uri, "event_type");
            if (strLIZIZ16 == null) {
                if (productListModelLJIIJ != null) {
                    strLIZIZ16 = productListModelLJIIJ.eventType;
                } else {
                    strLIZIZ16 = null;
                }
            }
            String strLIZIZ17 = C1942307jB.LIZIZ(uri, "start_click_time");
            if (strLIZIZ17 != null) {
                lValueOf = Long.valueOf(CastLongProtector.parseLong(strLIZIZ17));
            } else if (productListModelLJIIJ != null) {
                lValueOf = productListModelLJIIJ.startClickTime;
            } else {
                lValueOf = null;
            }
            String strLIZIZ18 = C1942307jB.LIZIZ(uri, "shop_ad_struct");
            try {
                Gson gsonLJFF9 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ9 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ9 != null && c1121904a9LIZIZ9.LJII) {
                    type4 = C2371409Qy.LIZJ(C13LE.LJ(ShopAdStruct.class));
                } else {
                    type4 = new TypeToken<ShopAdStruct>() { // from class: X.18Or
                    }.getType();
                }
                Object objFromJson9 = GsonProtectorUtils.fromJson(gsonLJFF9, strLIZIZ18, type4);
                if (!(objFromJson9 instanceof ShopAdStruct)) {
                    objFromJson9 = null;
                }
                shopAdStruct = (ShopAdStruct) objFromJson9;
            } catch (s e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            if (shopAdStruct == null) {
                if (productListModelLJIIJ != null) {
                    shopAdStruct = productListModelLJIIJ.shopAdStruct;
                } else {
                    shopAdStruct = null;
                }
            }
            String strLIZIZ19 = C1942307jB.LIZIZ(uri, "aweme");
            try {
                Gson gsonLJFF10 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ10 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ10 != null && c1121904a9LIZIZ10.LJII) {
                    type3 = C2371409Qy.LIZJ(C13LE.LJ(Aweme.class));
                } else {
                    type3 = new TypeToken<Aweme>() { // from class: X.18Ok
                    }.getType();
                }
                Object objFromJson10 = GsonProtectorUtils.fromJson(gsonLJFF10, strLIZIZ19, type3);
                if (!(objFromJson10 instanceof Aweme)) {
                    objFromJson10 = null;
                }
                aweme = (Aweme) objFromJson10;
            } catch (s e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            if (aweme == null) {
                if (productListModelLJIIJ != null) {
                    aweme = productListModelLJIIJ.aweme;
                } else {
                    aweme = null;
                }
            }
            String strLIZIZ20 = C1942307jB.LIZIZ(uri, "is_photo_mode");
            if (strLIZIZ20 != null) {
                boolIsPhotoMode = Boolean.valueOf(Boolean.parseBoolean(strLIZIZ20));
            } else if (productListModelLJIIJ != null) {
                boolIsPhotoMode = productListModelLJIIJ.isPhotoMode();
            } else {
                boolIsPhotoMode = null;
            }
            String strLIZIZ21 = C1942307jB.LIZIZ(uri, "is_single_anchor");
            if (strLIZIZ21 != null) {
                boolIsSingleAnchor = Boolean.valueOf(Boolean.parseBoolean(strLIZIZ21));
            } else if (productListModelLJIIJ != null) {
                boolIsSingleAnchor = productListModelLJIIJ.isSingleAnchor();
            } else {
                boolIsSingleAnchor = null;
            }
            String strLIZIZ22 = C1942307jB.LIZIZ(uri, "panel_config");
            try {
                Gson gsonLJFF11 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ11 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ11 != null && c1121904a9LIZIZ11.LJII) {
                    type2 = C2371409Qy.LIZJ(C13LE.LJ(AnchorPanelConfig.class));
                } else {
                    type2 = new TypeToken<AnchorPanelConfig>() { // from class: X.18Ol
                    }.getType();
                }
                Object objFromJson11 = GsonProtectorUtils.fromJson(gsonLJFF11, strLIZIZ22, type2);
                if (!(objFromJson11 instanceof AnchorPanelConfig)) {
                    objFromJson11 = null;
                }
                anchorPanelConfig = (AnchorPanelConfig) objFromJson11;
            } catch (s e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            if (anchorPanelConfig == null) {
                if (productListModelLJIIJ == null || (anchorPanelConfig = productListModelLJIIJ.panelConfig) == null) {
                    anchorPanelConfig = new AnchorPanelConfig(0, "video_anchor", 0, false, 0, false, false, false, false, new LinkedHashMap());
                }
            }
            String strLIZIZ23 = C1942307jB.LIZIZ(uri, "entrance_form");
            if (strLIZIZ23 == null) {
                if (productListModelLJIIJ != null) {
                    strLIZIZ23 = productListModelLJIIJ.entranceForm;
                } else {
                    strLIZIZ23 = null;
                }
            }
            String strLIZIZ24 = C1942307jB.LIZIZ(uri, "enter_list_form");
            if (strLIZIZ24 == null) {
                if (productListModelLJIIJ != null) {
                    strLIZIZ24 = productListModelLJIIJ.enterListForm;
                } else {
                    strLIZIZ24 = null;
                }
            }
            String strLIZIZ25 = C1942307jB.LIZIZ(uri, "page_name");
            if (strLIZIZ25 == null) {
                if (productListModelLJIIJ != null) {
                    strLIZIZ25 = productListModelLJIIJ.pageName;
                } else {
                    strLIZIZ25 = null;
                }
            }
            String strLIZIZ26 = C1942307jB.LIZIZ(uri, "track_params");
            try {
                Gson gsonLJFF12 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ12 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ12 != null && c1121904a9LIZIZ12.LJII) {
                    C13JX c13jx5 = KTypeProjection.LIZJ;
                    C13JW c13jwLJII5 = C13LE.LJII(String.class);
                    c13jx5.getClass();
                    type = C2371409Qy.LIZJ(C13LE.LIZJ(C13LE.LJI(Map.class, C13JX.LIZ(c13jwLJII5), C13JX.LIZ(C13LE.LJ(Object.class)))));
                } else {
                    type = new TypeToken<Map<String, Object>>() { // from class: X.04YM
                    }.getType();
                }
                Object objFromJson12 = GsonProtectorUtils.fromJson(gsonLJFF12, strLIZIZ26, type);
                if (!C19719512Dh.LJII(objFromJson12)) {
                    objFromJson12 = null;
                }
                linkedHashMap = (Map) objFromJson12;
            } catch (s e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            if (linkedHashMap == null) {
                if (productListModelLJIIJ == null || (linkedHashMap = productListModelLJIIJ.trackParams) == null) {
                    linkedHashMap = new LinkedHashMap();
                }
            }
            ProductListModel productListModel = new ProductListModel(strLIZIZ3, strLIZIZ4, strLIZIZ5, list, list2, str, user, strLIZIZ10, anchorCustomData, map, map2, boolIsAd, awemeRawAd, strLIZIZ16, lValueOf, shopAdStruct, aweme, boolIsPhotoMode, boolIsSingleAnchor, anchorPanelConfig, strLIZIZ23, strLIZIZ25, strLIZIZ24, linkedHashMap);
            anchorBizUtils.getClass();
            AnchorBizUtils.LJJLJ(c19eg, productListModel, strLIZIZ2, null, null, null);
            return true;
        }
        ((IEComOfflineService) ServiceManager.get().getService(IEComOfflineService.class)).LIZIZ();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJZ(Integer num, Map map) {
        C18NA.LIZ.getClass();
        C18NA.LIZ(map);
        Map<String, Object> map2 = C18NA.LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
        Object obj = linkedHashMap.get("has_shop_anchor");
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(obj, bool)) {
            map.put("ec_anchor_response_status", 1);
        } else if (Intrinsics.LJFF(linkedHashMap.get("last_has_shop_anchor"), bool)) {
            map.put("ec_anchor_response_status", 2);
        }
        EnumC1778650wNz enumC1778650wNz = EnumC1778650wNz.VIDEO_ANCHOR;
        map.putAll(map2);
        C05D4.LIZIZ("tiktokec_video_add_product_show_fail", enumC1778650wNz, num, "Add produck link should show but not.", map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJL(Aweme aweme, List<AnchorProductInfoModel> list) {
        String aid = aweme.getAid();
        if (aid == null) {
            return;
        }
        String aid2 = aweme.getAid();
        String groupId = aweme.getGroupId();
        String requestId = aweme.getRequestId();
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        User author = aweme.getAuthor();
        String awemeRawAdIdStr = AwemeExtKt.getAwemeRawAdIdStr(aweme);
        AnchorCustomData anchorCustomData = AwemeBizExtKt.getAnchorCustomData(aweme);
        boolean zIsAd = aweme.isAd();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        LJJI(new ProductListModel(aid2, groupId, requestId, anchors, list, authorUid, author, awemeRawAdIdStr, anchorCustomData, null, aweme.getMobParams(), Boolean.valueOf(zIsAd), awemeRawAd, null, 0L, AwemeBizExtKt.getShopAdStruct(aweme), aweme, Boolean.valueOf(AwemeExtKt.isPhotoMode(aweme)), null, new AnchorPanelConfig(0, "video_anchor", 0, false, 0, false, false, false, false, new LinkedHashMap()), null, null, null, new LinkedHashMap()), aid);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final RelatedProductInfo LJLLI(String str, String str2) {
        C21272518Mp.LIZ.getClass();
        return C21272518Mp.LJIIJJI(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJIILIIL(Aweme aweme, String str, AnoleComponentModel anoleComponentModel) {
        C1392660mLQ.LIZ.getClass();
        if (aweme != null) {
            C23250099c.LIZLLL(C2296808zG.LIZIZ(), C0PEM.LIZJ, null, new C1392840mLi(anoleComponentModel, str, aweme, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJIJI(String str, String str2, AwS601S0100000_22 awS601S0100000_22) {
        C1706820uW8.LIZ.getClass();
        C1706820uW8.LJ = C23250099c.LIZIZ(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C1706800uW6(str2, str, null, awS601S0100000_22), 3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJIIJZLJL(Integer num, String str, Map<String, Object> map) {
        C18NA.LIZ.getClass();
        C18NA.LIZ(map);
        EnumC1778650wNz enumC1778650wNz = EnumC1778650wNz.VIDEO_ANCHOR;
        map.putAll(C18NA.LIZIZ);
        C05D4.LIZIZ("tiktokec_video_add_product_click_fail", enumC1778650wNz, num, str, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJJJ(Integer num, String str, Map<String, Object> map) {
        C18NA.LIZ.getClass();
        C18NA.LIZ(map);
        if (num != null) {
            Integer numValueOf = Integer.valueOf(num.intValue());
            map.putAll(C18NA.LIZIZ);
            C05D4.LIZJ("tiktokec_video_add_link_request_v2", numValueOf, str, map);
        } else {
            map.putAll(C18NA.LIZIZ);
            C05D4.LIZ(num, str, map);
            C1018703yb.LIZLLL("tiktokec_video_add_link_request_v2", new AwS580S0100000_1(map, (Map<Integer, String>) 453));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final List LJJLJ(List list, boolean z, AbstractC19511111Vd abstractC19511111Vd) {
        Integer numValueOf;
        boolean zLJII;
        AnchorBizUtils.LIZ.getClass();
        if (z) {
            Integer numValueOf2 = null;
            if (list != 0) {
                numValueOf = Integer.valueOf(list.size());
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    AnchorTransData anchorTransData = (AnchorTransData) obj;
                    AnchorBizUtils.LIZ.getClass();
                    if (((ArrayList) AnchorBizUtils.LJIILL()).contains(Integer.valueOf(anchorTransData.businessType))) {
                        SettingsManager.LIZLLL().getClass();
                        if (!SettingsManager.LIZ("ec_sv_enable_photo_mode_permission_fix", true)) {
                            C21272618Mq.LIZ.getClass();
                            zLJII = C21272618Mq.LJII(false);
                        } else if (AnchorBizUtils.LJIIZILJ().contains(Integer.valueOf(anchorTransData.businessType))) {
                            C21272618Mq.LIZ.getClass();
                            zLJII = C21272618Mq.LJII(true);
                        } else if (AnchorBizUtils.LJIILLIIL().contains(Integer.valueOf(anchorTransData.businessType))) {
                            C21272618Mq.LIZ.getClass();
                            zLJII = C21272618Mq.LJII(false);
                        }
                        if (!zLJII) {
                        }
                    }
                    arrayList.add(obj);
                }
                list = arrayList;
            } else {
                numValueOf = null;
                list = 0;
            }
            if (abstractC19511111Vd != null) {
                if (list != 0) {
                    numValueOf2 = Integer.valueOf(list.size());
                }
                if (!Intrinsics.LJFF(numValueOf2, numValueOf)) {
                    C1389890mGx c1389890mGx = new C1389890mGx(abstractC19511111Vd);
                    c1389890mGx.LJIIIZ(2131832519);
                    c1389890mGx.LJIIJJI();
                }
            }
        }
        if (list == 0) {
            return new ArrayList();
        }
        return list;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJLJLJ(GetAnchorMotionInfoRequest getAnchorMotionInfoRequest, AwS595S0100000_16 awS595S0100000_16, AwS617S0100000_3 awS617S0100000_3) {
        C1345205Og.LIZ(getAnchorMotionInfoRequest, awS595S0100000_16, awS617S0100000_3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final View LJ(Context context, Aweme aweme, String str, AwS265S0300000_21 awS265S0300000_21) {
        List<AnchorCommonStruct> anchors;
        if (aweme != null && (!AwemeExtKt.isPhotoMode(aweme) || ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIII(aweme))) {
            if (C255960A1i.LIZ() && C21272218Mm.LJJIFFI(aweme)) {
                return new C21272718Mr(context, aweme, str, awS265S0300000_21);
            }
            if (C21274118Nf.LIZJ() && (anchors = aweme.getAnchors()) != null) {
                Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AnchorCommonStruct next = it2.next();
                    if (next.getType() == EnumC1430380nKG.ANCHOR_SHOWCASE.getTYPE()) {
                        if (next != null) {
                            return new C18NK(context, aweme, str, awS265S0300000_21);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0090 A[PHI: r11
      0x0090: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v3 java.lang.String), (r11v3 java.lang.String) binds: [B:33:0x008d, B:16:0x0044, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3 A[PHI: r13
      0x00d3: PHI (r13v1 java.util.ArrayList) = (r13v0 java.util.ArrayList), (r13v3 java.util.ArrayList), (r13v3 java.util.ArrayList) binds: [B:39:0x00a2, B:41:0x00a6, B:43:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146  */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.ss.android.ugc.aweme.feed.model.Aweme r21, java.lang.Integer r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService.LJIIJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0090 A[PHI: r11
      0x0090: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v3 java.lang.String), (r11v3 java.lang.String) binds: [B:33:0x008d, B:16:0x0044, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3 A[PHI: r13
      0x00d3: PHI (r13v1 java.util.ArrayList) = (r13v0 java.util.ArrayList), (r13v3 java.util.ArrayList), (r13v3 java.util.ArrayList) binds: [B:39:0x00a2, B:41:0x00a6, B:43:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146  */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLIIL(com.ss.android.ugc.aweme.feed.model.Aweme r21, java.lang.Integer r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService.LJJJLIIL(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJLJL(Integer num, String str, Map map, boolean z) {
        String str2;
        C18NA.LIZ.getClass();
        EnumC1778650wNz enumC1778650wNz = EnumC1778650wNz.VIDEO_ANCHOR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C18NA.LIZIZ);
        Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(map);
        if (mapLJIIZILJ != null) {
            linkedHashMap.putAll(mapLJIIZILJ);
        }
        if (z) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        linkedHashMap.put("is_single_anchor", str2);
        if (str != null) {
            linkedHashMap.put("entrance_form", str);
        }
        C05D4.LIZIZ("rd_tiktokec_video_anchor_view_show_fail", enumC1778650wNz, num, "", linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map] */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(android.content.Context r52, com.ss.android.ugc.aweme.feed.model.Aweme r53, com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r54, java.lang.String r55, android.view.View r56) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService.LJIILJJIL(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel, java.lang.String, android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJL(java.util.List r15, boolean r16, boolean r17, java.lang.String r18, kotlin.jvm.functions.Function1 r19) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService.LJJL(java.util.List, boolean, boolean, java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJLIIIJJIZ(String str, Integer num, String str2, String str3, String str4) throws JSONException {
        C21271918Mj.LIZ.getClass();
        C1421105hJ.LIZLLL("rd_tiktokec_open_singleton_schema", new Pair("err_code", num), new Pair("err_msg", str), new Pair("page_name", str2), new Pair("jsb_key", "openSingletonSchema"), new Pair("schema", str3), new Pair("params", str4));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final String LJLIL(AnchorProductInfoModel anchorProductInfoModel, Aweme aweme, String str, String str2, boolean z) {
        return C21272218Mm.LJJIIJZLJL(anchorProductInfoModel, aweme, false, str, str2, "", z);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJLLLL(Activity activity, View view, EnumC1235690iGF enumC1235690iGF, boolean z, boolean z2) {
        AnonymousClass0317 anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin;
        boolean z3;
        String name;
        AnchorBizUtils.LIZ.getClass();
        if (!z && !z2 && AnchorBizUtils.LJIILJJIL()) {
            C21272518Mp c21272518Mp = C21272518Mp.LIZ;
            String strLJJIIJ = AnchorBizUtils.LJJIIJ();
            Boolean bool = Boolean.FALSE;
            c21272518Mp.getClass();
            Map<String, Object> map = C21272518Mp.LJIIL;
            map.put(strLJJIIJ, bool);
            String string = activity.getString(2131833104);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin = CreativePageDependencyService.createICreativePageDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name2 = ICreativePageDependencyService.class.getName();
                if (anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z3);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICreativePageDependencyService.class);
            }
            ((ICreativePageDependencyService) anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin).invokeMethodsSafely(activity, new AwS71S1300000_1(activity, view, enumC1235690iGF, string, 0));
            String strLJJIIJ2 = AnchorBizUtils.LJJIIJ();
            Boolean bool2 = Boolean.TRUE;
            c21272518Mp.getClass();
            map.put(strLJJIIJ2, bool2);
            C20295114b7.LIZ().storeBoolean(AnchorBizUtils.LJJIIJZLJL(), true);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJJLL(String str, Boolean bool, String str2, String str3, String str4, String str5, String str6) throws JSONException {
        C21271918Mj.LIZ.getClass();
        C1421105hJ.LIZLLL("sound_copyright_check_page_request", new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("is_ecommerce_scene", Integer.valueOf(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0)), new Pair("creation_id", str), new Pair("shoot_way", str2), new Pair("draft_id", str3), new Pair("content_type", str4), new Pair("content_source", str5), new Pair("music_id", str6));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJII(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, Integer num) throws JSONException {
        C21271918Mj.LIZ.getClass();
        C1421105hJ.LIZLLL("sound_copyright_check_page_request_result", new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("is_ecommerce_scene", Integer.valueOf(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0)), new Pair("creation_id", str), new Pair("shoot_way", str2), new Pair("draft_id", str3), new Pair("content_type", str4), new Pair("content_source", str5), new Pair("music_id", str6), new Pair("sound_copyright_check_page_request_result", num));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJIJL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool) throws JSONException {
        String str10;
        C21271918Mj.LIZ.getClass();
        if (str8.length() == 0 && (str9 == null || str9.length() == 0)) {
            str10 = "sound_copyright_check_page_show";
        } else {
            str10 = "sound_copyright_check_page_show_fail";
        }
        C1421105hJ.LIZLLL(str10, new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("is_ecommerce_scene", Integer.valueOf(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0)), new Pair("creation_id", str), new Pair("enter_from", str2), new Pair("shoot_way", str3), new Pair("draft_id", str4), new Pair("content_type", str5), new Pair("content_source", str6), new Pair("music_id", str7), new Pair("sound_copyright_check_page_show_fail_code", str8), new Pair("sound_copyright_check_page_show_fail_reason", str9));
    }
}
