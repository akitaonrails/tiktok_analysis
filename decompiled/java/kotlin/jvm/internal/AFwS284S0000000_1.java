package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.AnonymousClass0300;
import X.AnonymousClass0301;
import X.AnonymousClass0306;
import X.AnonymousClass0308;
import X.AnonymousClass0309;
import X.AnonymousClass0312;
import X.AnonymousClass0313;
import X.AnonymousClass0315;
import X.AnonymousClass0341;
import X.AnonymousClass0464;
import X.AnonymousClass0497;
import X.C030A;
import X.C030B;
import X.C030C;
import X.C030D;
import X.C030I;
import X.C030J;
import X.C030K;
import X.C030L;
import X.C030N;
import X.C030Q;
import X.C030U;
import X.C030Z;
import X.C031M;
import X.C031N;
import X.C032B;
import X.C032C;
import X.C032O;
import X.C032P;
import X.C03B0;
import X.C03DZ;
import X.C03G4;
import X.C03PI;
import X.C03SE;
import X.C043T;
import X.C046U;
import X.C04FF;
import X.C09AY;
import X.C0C64;
import X.C10462047g;
import X.C10463047h;
import X.C10515049h;
import X.C10526049s;
import X.C1075504In;
import X.C1075704Ip;
import X.C123100dR;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1389890mGx;
import X.C1390130mHL;
import X.C1391190mJ3;
import X.C1440005kM;
import X.C1507790pL7;
import X.C1602160rnK;
import X.C1741890vQh;
import X.C1744700vVE;
import X.C1748720vbi;
import X.C197039127h;
import X.C19EG;
import X.C1AF0;
import X.C2188811AlT;
import X.C291001Au;
import X.C343970De7;
import X.C384050F3z;
import X.C418440Gaw;
import X.C724240Sb0;
import X.C768802zO;
import X.C768902zP;
import X.C769302zT;
import X.C769602zW;
import X.C770202zc;
import X.C7744030s;
import X.C7750030y;
import X.C7755031d;
import X.C7756031e;
import X.C7757031f;
import X.C7758031g;
import X.C7759031h;
import X.C7761031j;
import X.C7763031l;
import X.C7766031o;
import X.C7772031u;
import X.C7773031v;
import X.C7774031w;
import X.C786410Ut5;
import X.C7919037l;
import X.C814420VxA;
import X.C893703eR;
import X.C948003nC;
import X.C952103nr;
import X.C960203pA;
import X.EnumC1338240kve;
import X.EnumC890003dq;
import X.InterfaceC10464047i;
import X.InterfaceC769002zQ;
import X.InterfaceC769102zR;
import X.InterfaceC769402zU;
import X.InterfaceC769802zY;
import X.InterfaceC770002za;
import X.InterfaceC770602zg;
import X.InterfaceC772102zv;
import X.InterfaceC772302zx;
import X.InterfaceC7728030c;
import X.InterfaceC7745030t;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeStatement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.UserTrustModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AgeConfirmModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DigitalDelivery;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.EmailAuthorizationInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MultiLogisticsPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPPageModuleConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ProductSafetyModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuantityControlInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RefundableSampleModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RightGuidanceModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShippingAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardExtendInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VirtualInfoModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrandInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExchangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpMessage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.onereview.PdpReviewViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop.SeaShopProfileVH;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuCounterReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuHeaderReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.QuantityNoticeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaSkuPanelWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS326S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AFwS284S0000000_1 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(89);
    public final int $t;

    public static AFwS284S0000000_1 get$arr$(int i) {
        AFwS284S0000000_1 aFwS284S0000000_1 = (AFwS284S0000000_1) arr$.get(i);
        if (aFwS284S0000000_1 != null) {
            return aFwS284S0000000_1;
        }
        arr$.compareAndSet(i, null, new AFwS284S0000000_1(i));
        return (AFwS284S0000000_1) arr$.get(i);
    }

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
            case 39:
                return invoke$39(this, obj, obj2);
            case 40:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            case 42:
                return invoke$42(this, obj, obj2);
            case 43:
                return invoke$43(this, obj, obj2);
            case 44:
                return invoke$44(this, obj, obj2);
            case 45:
                return invoke$45(this, obj, obj2);
            case 46:
                return invoke$46(this, obj, obj2);
            case 47:
                return invoke$47(this, obj, obj2);
            case 48:
                return invoke$48(this, obj, obj2);
            case 49:
                return invoke$49(this, obj, obj2);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj, obj2);
            case 51:
                return invoke$51(this, obj, obj2);
            case 52:
                return invoke$52(this, obj, obj2);
            case 53:
                return invoke$53(this, obj, obj2);
            case 54:
                return invoke$54(this, obj, obj2);
            case 55:
                return invoke$55(this, obj, obj2);
            case 56:
                return invoke$56(this, obj, obj2);
            case 57:
                return invoke$57(this, obj, obj2);
            case 58:
                return invoke$58(this, obj, obj2);
            case 59:
                return invoke$59(this, obj, obj2);
            case 60:
                return invoke$60(this, obj, obj2);
            case 61:
                return invoke$61(this, obj, obj2);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj, obj2);
            case 63:
                return invoke$63(this, obj, obj2);
            case 64:
                return invoke$64(this, obj, obj2);
            case 65:
                return invoke$65(this, obj, obj2);
            case 66:
                return invoke$66(this, obj, obj2);
            case 67:
                return invoke$67(this, obj, obj2);
            case 68:
                return invoke$68(this, obj, obj2);
            case 69:
                return invoke$69(this, obj, obj2);
            case 70:
                return invoke$70(this, obj, obj2);
            case 71:
                return invoke$71(this, obj, obj2);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this, obj, obj2);
            case 73:
                return invoke$73(this, obj, obj2);
            case 74:
                return invoke$74(this, obj, obj2);
            case 75:
                return invoke$75(this, obj, obj2);
            case 76:
                return invoke$76(this, obj, obj2);
            case 77:
                return invoke$77(this, obj, obj2);
            case 78:
                return invoke$78(this, obj, obj2);
            case 79:
                return invoke$79(this, obj, obj2);
            case 80:
                return invoke$80(this, obj, obj2);
            case 81:
                return invoke$81(this, obj, obj2);
            case 82:
                return invoke$82(this, obj, obj2);
            case 83:
                return invoke$83(this, obj, obj2);
            case 84:
                return invoke$84(this, obj, obj2);
            case 85:
                return invoke$85(this, obj, obj2);
            case 86:
                return invoke$86(this, obj, obj2);
            case 87:
                return invoke$87(this, obj, obj2);
            case 88:
                return invoke$88(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS284S0000000_1(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL((String) obj, (JSONObject) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, obj2));
    }

    public static final Object invoke$10(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        SkuCounterReusedAssem skuCounterReusedAssem = (SkuCounterReusedAssem) obj;
        if (!((Boolean) obj2).booleanValue()) {
            skuCounterReusedAssem.Ep().setEnabled(false);
            skuCounterReusedAssem.Fp().setEnabled(false);
            skuCounterReusedAssem.Bp().setEnabled(false);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, skuCounterReusedAssem.sp());
            if (numLIZJ != null) {
                skuCounterReusedAssem.Bp().setTextColor(numLIZJ.intValue());
            }
            LinearLayout linearLayout = skuCounterReusedAssem.LLL;
            if (linearLayout != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                c384050F3z.LJFF = Integer.valueOf(R.attr.a01);
                c384050F3z.LJIIIZ = Float.valueOf(skuCounterReusedAssem.up().LJFF());
                c384050F3z.LJIIIIZZ = Float.valueOf(skuCounterReusedAssem.up().LJFF());
                c384050F3z.LJIIJJI = Float.valueOf(skuCounterReusedAssem.up().LJFF());
                c384050F3z.LJIIJ = Float.valueOf(skuCounterReusedAssem.up().LJFF());
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                linearLayout.setBackground(c384050F3z.LIZ(skuCounterReusedAssem.sp()));
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        boolean z;
        SellerInfo sellerInfo;
        StoreLabel next;
        StoreLabel next2;
        int i;
        List<StoreLabel> list;
        List<StoreLabel> list2;
        List<StoreLabel> list3;
        View viewLJLLLL;
        SkuHeaderReusedAssem skuHeaderReusedAssem = (SkuHeaderReusedAssem) obj;
        AnonymousClass0464 anonymousClass0464 = (AnonymousClass0464) obj2;
        if (anonymousClass0464 != null) {
            String str = null;
            if (skuHeaderReusedAssem.LLLI == null) {
                ViewStub viewStub = (ViewStub) skuHeaderReusedAssem.op(R.id.wcc);
                if (viewStub != null) {
                    viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                } else {
                    viewLJLLLL = null;
                }
                skuHeaderReusedAssem.LLLI = (C10526049s) viewLJLLLL;
            }
            C10526049s c10526049s = skuHeaderReusedAssem.LLLI;
            if (c10526049s != null) {
                C786410Ut5.LJLLLLLL(0, c10526049s);
                BrandInfo brandInfo = anonymousClass0464.LIZ;
                if (brandInfo != null) {
                    if (brandInfo.prefix != null && (list3 = brandInfo.brandLabels) != null && !list3.isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    int i2 = 8;
                    if (!z && ((sellerInfo = anonymousClass0464.LIZIZ) == null || sellerInfo.aboutShopRichText == null)) {
                        C786410Ut5.LLLLZLL(c10526049s.getSoldByTextFromXml(), 0);
                        String strLIZIZ = anonymousClass0464.LIZ.prefix;
                        if (strLIZIZ != null && strLIZIZ.length() > 24) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZIZ.substring(0, 24));
                            sbLIZ.append("...");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        c10526049s.getSoldByTextFromXml().setText(strLIZIZ);
                        BrandInfo brandInfo2 = anonymousClass0464.LIZ;
                        if (brandInfo2 != null && (list2 = brandInfo2.brandLabels) != null) {
                            Iterator<StoreLabel> it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    StoreOfficialLabel storeOfficialLabel = next.officialLabel;
                                    if (storeOfficialLabel != null) {
                                        Integer num = storeOfficialLabel.labelType;
                                        int value = C046U.BLUE_V.getValue();
                                        if (num != null && num.intValue() == value) {
                                            break;
                                        }
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                        } else {
                            next = null;
                        }
                        BrandInfo brandInfo3 = anonymousClass0464.LIZ;
                        if (brandInfo3 != null && (list = brandInfo3.brandLabels) != null) {
                            Iterator<StoreLabel> it3 = list.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next2 = it3.next();
                                    StoreOfficialLabel storeOfficialLabel2 = next2.officialLabel;
                                    if (storeOfficialLabel2 != null) {
                                        Integer num2 = storeOfficialLabel2.labelType;
                                        int value2 = C046U.TOP_BRAND.getValue();
                                        if (num2 != null && num2.intValue() == value2) {
                                            break;
                                        }
                                    }
                                } else {
                                    next2 = null;
                                    break;
                                }
                            }
                        } else {
                            next2 = null;
                        }
                        TuxIconView officialLabelFromXml = c10526049s.getOfficialLabelFromXml();
                        if (next != null) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        C786410Ut5.LLLLLLZZ(officialLabelFromXml, i);
                        RelativeLayout topBrandFromXml = c10526049s.getTopBrandFromXml();
                        if (next2 != null) {
                            i2 = 0;
                        }
                        C786410Ut5.LLIIL(topBrandFromXml, i2);
                        int visibility = c10526049s.getVisibility();
                        c10526049s.setVisibility(0);
                        C1602160rnK.LIZIZ(visibility, 0, c10526049s);
                    } else {
                        C786410Ut5.LLLLLLZZ(c10526049s.getOfficialLabelFromXml(), 8);
                        C786410Ut5.LLIIL(c10526049s.getTopBrandFromXml(), 8);
                        SellerInfo sellerInfo2 = anonymousClass0464.LIZIZ;
                        if (sellerInfo2 != null && sellerInfo2.aboutShopRichText != null) {
                            c10526049s.LIZ(sellerInfo2.sellerId, anonymousClass0464.LIZJ, sellerInfo2.aboutShopRichText);
                        } else {
                            c10526049s.LIZIZ(sellerInfo2);
                        }
                    }
                } else {
                    SellerInfo sellerInfo3 = anonymousClass0464.LIZIZ;
                    if (sellerInfo3 != null && sellerInfo3.aboutShopRichText != null) {
                        c10526049s.LIZ(sellerInfo3.sellerId, anonymousClass0464.LIZJ, sellerInfo3.aboutShopRichText);
                    } else {
                        c10526049s.LIZIZ(sellerInfo3);
                    }
                }
                if (!c10526049s.LLIZ) {
                    SellerInfo sellerInfo4 = anonymousClass0464.LIZIZ;
                    if (sellerInfo4 != null) {
                        str = sellerInfo4.sellerId;
                    }
                    if (C123100dR.LIZ(str)) {
                        c10526049s.LLIZ = true;
                        TuxTextView soldByTextFromXml = c10526049s.getSoldByTextFromXml();
                        if (soldByTextFromXml != null) {
                            C1748720vbi.LJFF(soldByTextFromXml, new C10515049h(), new AwS545S0100000_1(anonymousClass0464, 1590), new AwS580S0100000_1(anonymousClass0464, 573));
                        }
                        SellerInfo sellerInfo5 = anonymousClass0464.LIZIZ;
                        if (sellerInfo5 != null && Intrinsics.LJFF(sellerInfo5.enableNewShopEntrance, Boolean.TRUE)) {
                            C1748720vbi.LIZLLL(c10526049s, new AnonymousClass0497(), new AwS580S0100000_1(anonymousClass0464, 574));
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        View viewLJLLLL;
        final SkuHeaderReusedAssem skuHeaderReusedAssem = (SkuHeaderReusedAssem) obj;
        C10462047g c10462047g = (C10462047g) obj2;
        if (skuHeaderReusedAssem.getViewModel().Zf2().LJIILJJIL() && c10462047g != null) {
            if (skuHeaderReusedAssem.LLLII == null) {
                ViewStub viewStub = (ViewStub) skuHeaderReusedAssem.op(R.id.wbx);
                if (viewStub != null) {
                    viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                } else {
                    viewLJLLLL = null;
                }
                skuHeaderReusedAssem.LLLII = (C10463047h) viewLJLLLL;
            }
            C10463047h c10463047h = skuHeaderReusedAssem.LLLII;
            if (c10463047h != null) {
                C786410Ut5.LJLLLLLL(0, c10463047h);
                c10463047h.e0(new C10462047g(c10462047g.LIZ, c10462047g.LIZIZ, c10462047g.LIZJ, c10462047g.LIZLLL, c10462047g.LJ, c10462047g.LJFF, new InterfaceC10464047i() { // from class: X.047f
                    @Override // X.InterfaceC10464047i
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC10464047i
                    public final void LIZIZ(PopUpMessage popUpMessage) {
                        String string;
                        List<ECRichText> list;
                        int i;
                        View viewLJ;
                        ProductPackStruct productPackStruct;
                        Integer num;
                        if (popUpMessage == null || (string = popUpMessage.title) == null) {
                            string = skuHeaderReusedAssem.sp().getString(2131839189);
                        }
                        if (popUpMessage != null) {
                            list = popUpMessage.contents;
                        } else {
                            list = null;
                        }
                        if (list != null) {
                            viewLJ = C808003Dq.LIZ(skuHeaderReusedAssem.sp(), "UsProductInfoVH", popUpMessage.contents);
                        } else {
                            Context contextSp = skuHeaderReusedAssem.sp();
                            Context contextSp2 = skuHeaderReusedAssem.sp();
                            ProductPackStruct productPackStruct2 = skuHeaderReusedAssem.getViewModel().LLJIJIL;
                            if (productPackStruct2 != null && C041G.LJIILLIIL(productPackStruct2) && (productPackStruct = skuHeaderReusedAssem.getViewModel().LLJIJIL) != null && (num = productPackStruct.bizType) != null && num.intValue() == 0) {
                                i = 2131832970;
                            } else {
                                i = 2131839188;
                            }
                            viewLJ = C808003Dq.LJ(contextSp, R.attr.uf, 41, contextSp2.getString(i));
                        }
                        try {
                            C808003Dq.LJFF(C808003Dq.LIZLLL(viewLJ, string, false, AFwS326S0000000_1.get$arr$(5), 20), skuHeaderReusedAssem.tp().getChildFragmentManager(), null, AFwS185S0000000_1.get$arr$(122), 4);
                        } catch (IllegalStateException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1019103yf.LIZ(EnumC1014603xw.ERR10014, e, null);
                        }
                    }
                }, c10462047g.LJII, c10462047g.LJIIIIZZ, c10462047g.LJIIIZ, c10462047g.LJIIJ));
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        Image icon;
        TuxTextView tuxTextView;
        SkuHeaderReusedAssem skuHeaderReusedAssem = (SkuHeaderReusedAssem) obj;
        ExchangeInfo exchangeInfo = (ExchangeInfo) obj2;
        if (exchangeInfo != null) {
            ECRichText eCRichText = exchangeInfo.description;
            if (eCRichText != null && (tuxTextView = skuHeaderReusedAssem.LLLIIL) != null) {
                C03B0 c03b0 = new C03B0(tuxTextView, "sku_panel_exchange_text");
                C03B0.LIZ(c03b0, eCRichText, null, null, false, null, null, 126);
                tuxTextView.setText(c03b0.LIZJ);
                tuxTextView.setTextColorRes(R.attr.a1j);
            }
            Icon icon2 = exchangeInfo.leadingIcon;
            if (icon2 != null) {
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                if (C1744700vVE.LJ(skuHeaderReusedAssem.sp(), null)) {
                    icon = icon2.getIconDark();
                } else {
                    icon = icon2.getIcon();
                }
                c1326790kdB.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon);
                c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
                c1331670kl3LIZLLL.LJJI(skuHeaderReusedAssem.LLLIIIIL);
                c1331670kl3LIZLLL.LJIIJJI();
            }
            LinearLayout linearLayout = skuHeaderReusedAssem.LLLIIII;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                linearLayout.setBackground(c384050F3z.LIZ(linearLayout.getContext()));
                C1748720vbi.LJFF(linearLayout, new C10515049h(), AFwS185S0000000_1.get$arr$(123), AFwS228S0000000_1.get$arr$(349));
                C786410Ut5.I7(new AjS60S0100000_1(linearLayout, 31), linearLayout);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        String strLIZIZ;
        SkuHeaderReusedAssem skuHeaderReusedAssem = (SkuHeaderReusedAssem) obj;
        String str = (String) obj2;
        skuHeaderReusedAssem.getClass();
        if (str == null) {
            strLIZIZ = null;
        } else if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ecom_pdp_new_price_style", true) == 2) {
            strLIZIZ = str;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('(');
            sbLIZ.append(str);
            sbLIZ.append(')');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (C123100dR.LIZ(str)) {
            TuxTextView tuxTextView = skuHeaderReusedAssem.LLLFFI;
            if (tuxTextView != null) {
                C03DZ.LIZJ(tuxTextView);
            }
            TuxTextView tuxTextView2 = skuHeaderReusedAssem.LLLFFI;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(strLIZIZ);
            }
        } else {
            TuxTextView tuxTextView3 = skuHeaderReusedAssem.LLLFFI;
            if (tuxTextView3 != null) {
                C03DZ.LIZ(tuxTextView3);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        SkuHeaderReusedAssem skuHeaderReusedAssem = (SkuHeaderReusedAssem) obj;
        if (((Boolean) obj2).booleanValue()) {
            ConstraintLayout constraintLayout = skuHeaderReusedAssem.LLLIIIL;
            if (constraintLayout != null) {
                C786410Ut5.LL(8, constraintLayout);
            }
        } else {
            ConstraintLayout constraintLayout2 = skuHeaderReusedAssem.LLLIIIL;
            if (constraintLayout2 != null) {
                C786410Ut5.LL(0, constraintLayout2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj2).intValue();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZ("ec_sku_panel_keyboard_show", C1741890vQh.LJIIIIZZ(new SkuPanelStarter.SkuKeyboardVisibilityParams(zBooleanValue, iIntValue)));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$18(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        C1390130mHL c1390130mHL = (C1390130mHL) ((UIAssem) obj).LJJIJL().findViewById(R.id.uni);
        if (((Boolean) ((C291001Au) obj2).LIZ).booleanValue()) {
            C786410Ut5.LLZ(c1390130mHL, 0);
        } else {
            C786410Ut5.LLZ(c1390130mHL, 8);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C032B, AnonymousClass0306>(str, str2) { // from class: X.0307
            /* JADX WARN: Removed duplicated region for block: B:22:0x002f A[PHI: r3 r4 r5 r6
              0x002f: PHI (r3v9 java.lang.String) = (r3v3 java.lang.String), (r3v10 java.lang.String) binds: [B:43:0x005f, B:21:0x002d] A[DONT_GENERATE, DONT_INLINE]
              0x002f: PHI (r4v8 java.lang.String) = (r4v2 java.lang.String), (r4v9 java.lang.String) binds: [B:43:0x005f, B:21:0x002d] A[DONT_GENERATE, DONT_INLINE]
              0x002f: PHI (r5v7 java.lang.String) = (r5v1 java.lang.String), (r5v8 java.lang.String) binds: [B:43:0x005f, B:21:0x002d] A[DONT_GENERATE, DONT_INLINE]
              0x002f: PHI (r6v6 java.lang.String) = (r6v0 java.lang.String), (r6v7 java.lang.String) binds: [B:43:0x005f, B:21:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0043 A[PHI: r3 r4 r5 r6 r7 r8
              0x0043: PHI (r3v7 java.lang.String) = (r3v5 java.lang.String), (r3v8 java.lang.String) binds: [B:49:0x0067, B:31:0x0041] A[DONT_GENERATE, DONT_INLINE]
              0x0043: PHI (r4v6 java.lang.String) = (r4v4 java.lang.String), (r4v7 java.lang.String) binds: [B:49:0x0067, B:31:0x0041] A[DONT_GENERATE, DONT_INLINE]
              0x0043: PHI (r5v5 java.lang.String) = (r5v3 java.lang.String), (r5v6 java.lang.String) binds: [B:49:0x0067, B:31:0x0041] A[DONT_GENERATE, DONT_INLINE]
              0x0043: PHI (r6v4 java.lang.String) = (r6v2 java.lang.String), (r6v5 java.lang.String) binds: [B:49:0x0067, B:31:0x0041] A[DONT_GENERATE, DONT_INLINE]
              0x0043: PHI (r7v3 java.lang.String) = (r7v1 java.lang.String), (r7v4 java.lang.String) binds: [B:49:0x0067, B:31:0x0041] A[DONT_GENERATE, DONT_INLINE]
              0x0043: PHI (r8v2 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String) binds: [B:49:0x0067, B:31:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x005a A[PHI: r3 r4
              0x005a: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v11 java.lang.String), (r3v11 java.lang.String) binds: [B:37:0x0057, B:13:0x001d, B:15:0x0021] A[DONT_GENERATE, DONT_INLINE]
              0x005a: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v10 java.lang.String), (r4v10 java.lang.String) binds: [B:37:0x0057, B:13:0x001d, B:15:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x005e A[PHI: r3 r4 r5
              0x005e: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v10 java.lang.String), (r3v10 java.lang.String) binds: [B:40:0x005b, B:18:0x0027, B:20:0x002b] A[DONT_GENERATE, DONT_INLINE]
              0x005e: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v9 java.lang.String), (r4v9 java.lang.String) binds: [B:40:0x005b, B:18:0x0027, B:20:0x002b] A[DONT_GENERATE, DONT_INLINE]
              0x005e: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v8 java.lang.String), (r5v8 java.lang.String) binds: [B:40:0x005b, B:18:0x0027, B:20:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0062 A[PHI: r3 r4 r5 r6
              0x0062: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v9 java.lang.String), (r3v9 java.lang.String) binds: [B:43:0x005f, B:23:0x0031, B:25:0x0035] A[DONT_GENERATE, DONT_INLINE]
              0x0062: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v8 java.lang.String), (r4v8 java.lang.String) binds: [B:43:0x005f, B:23:0x0031, B:25:0x0035] A[DONT_GENERATE, DONT_INLINE]
              0x0062: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v7 java.lang.String), (r5v7 java.lang.String) binds: [B:43:0x005f, B:23:0x0031, B:25:0x0035] A[DONT_GENERATE, DONT_INLINE]
              0x0062: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v6 java.lang.String), (r6v6 java.lang.String) binds: [B:43:0x005f, B:23:0x0031, B:25:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0066 A[PHI: r3 r4 r5 r6 r7
              0x0066: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v8 java.lang.String), (r3v8 java.lang.String) binds: [B:46:0x0063, B:28:0x003b, B:30:0x003f] A[DONT_GENERATE, DONT_INLINE]
              0x0066: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v7 java.lang.String), (r4v7 java.lang.String) binds: [B:46:0x0063, B:28:0x003b, B:30:0x003f] A[DONT_GENERATE, DONT_INLINE]
              0x0066: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v6 java.lang.String), (r5v6 java.lang.String) binds: [B:46:0x0063, B:28:0x003b, B:30:0x003f] A[DONT_GENERATE, DONT_INLINE]
              0x0066: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v5 java.lang.String), (r6v5 java.lang.String) binds: [B:46:0x0063, B:28:0x003b, B:30:0x003f] A[DONT_GENERATE, DONT_INLINE]
              0x0066: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String), (r7v4 java.lang.String) binds: [B:46:0x0063, B:28:0x003b, B:30:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C032O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List LIZIZ(X.C770802zi r11, X.C033V r12) {
                /*
                    r10 = this;
                    P extends X.02zZ r0 = r10.LIZLLL
                    X.0306 r0 = (X.AnonymousClass0306) r0
                    r9 = 0
                    if (r0 == 0) goto L6a
                    X.02rO r1 = r0.LJJLIL()
                Lb:
                    X.033k r2 = new X.033k
                    if (r1 == 0) goto L55
                    java.lang.String r3 = r1.LLILZLL
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderStarling r0 = r1.LLJJJIL
                    if (r0 == 0) goto L56
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText r0 = r0.orderNotesText
                    if (r0 == 0) goto L56
                    java.lang.String r4 = r0.text
                L1b:
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderStarling r0 = r1.LLJJJIL
                    if (r0 == 0) goto L5a
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText r0 = r0.orderNotesEdit
                    if (r0 == 0) goto L5a
                    java.lang.String r5 = r0.text
                L25:
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderStarling r0 = r1.LLJJJIL
                    if (r0 == 0) goto L5e
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText r0 = r0.orderNotesText
                    if (r0 == 0) goto L5e
                    java.lang.String r6 = r0.text
                L2f:
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderStarling r0 = r1.LLJJJIL
                    if (r0 == 0) goto L62
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText r0 = r0.orderNotesHint
                    if (r0 == 0) goto L62
                    java.lang.String r7 = r0.text
                L39:
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderStarling r0 = r1.LLJJJIL
                    if (r0 == 0) goto L66
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText r0 = r0.oderNotesTitle
                    if (r0 == 0) goto L66
                    java.lang.String r8 = r0.text
                L43:
                    int r0 = r1.LLJJL
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
                L49:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPPageModuleConfig r0 = r11.LIZ
                    r2.LLILLL = r0
                    java.util.List r0 = java.util.Collections.singletonList(r2)
                    return r0
                L55:
                    r3 = r9
                L56:
                    r4 = r9
                    if (r1 == 0) goto L5a
                    goto L1b
                L5a:
                    r5 = r9
                    if (r1 == 0) goto L5e
                    goto L25
                L5e:
                    r6 = r9
                    if (r1 == 0) goto L62
                    goto L2f
                L62:
                    r7 = r9
                    if (r1 == 0) goto L66
                    goto L39
                L66:
                    r8 = r9
                    if (r1 == 0) goto L49
                    goto L43
                L6a:
                    r1 = r9
                    goto Lb
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0307.LIZIZ(X.02zi, X.033V):java.util.List");
            }
        };
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C030L, AnonymousClass0301>(str, str2) { // from class: X.0305
            /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[PHI: r5
              0x0021: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:29:0x003b, B:16:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0057  */
            @Override // X.C032O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List LIZIZ(X.C770802zi r8, X.C033V r9) {
                /*
                    r7 = this;
                    X.030L r9 = (X.C030L) r9
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r3 = r9.LIZ
                    if (r3 != 0) goto L9
                    X.13BV r0 = X.C13BV.INSTANCE
                    return r0
                L9:
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BottomCashbackBanner r2 = r3.bottomCashbackBanner
                    if (r2 == 0) goto L3e
                    java.lang.Integer r0 = r2.descType
                    if (r0 == 0) goto L3e
                    int r0 = r0.intValue()
                    r1 = 1
                    if (r0 != r1) goto L3e
                L18:
                    r6 = 0
                    if (r1 == 0) goto L3a
                    java.lang.String r5 = r2.desc
                L1d:
                    com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r4 = r2.descRichText
                    if (r4 != 0) goto L2b
                L21:
                    P extends X.02zZ r0 = r7.LIZLLL
                    X.0301 r0 = (X.AnonymousClass0301) r0
                    if (r0 == 0) goto L38
                    com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r4 = r0.LJI(r3)
                L2b:
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion r3 = r3.platformPromotion
                    if (r3 == 0) goto L33
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo r0 = r3.bonusInfo
                    if (r0 != 0) goto L40
                L33:
                    if (r4 != 0) goto L40
                    X.13BV r0 = X.C13BV.INSTANCE
                    return r0
                L38:
                    r4 = r6
                    goto L2b
                L3a:
                    r5 = r6
                    if (r2 == 0) goto L21
                    goto L1d
                L3e:
                    r1 = 0
                    goto L18
                L40:
                    X.0318 r2 = new X.0318
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusModule r1 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusModule
                    if (r3 == 0) goto L57
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo r0 = r3.bonusInfo
                L48:
                    r1.<init>(r6, r0)
                    r2.<init>(r1, r5, r4)
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPPageModuleConfig r0 = r8.LIZ
                    r2.LLILLL = r0
                    java.util.List r0 = java.util.Collections.singletonList(r2)
                    return r0
                L57:
                    r0 = r6
                    goto L48
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0305.LIZIZ(X.02zi, X.033V):java.util.List");
            }
        };
    }

    public static final Object invoke$21(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C032C, InterfaceC772302zx>(str, str2) { // from class: X.02zq
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                Pair<C719202rO, C723002s0> pairLJJJJLL;
                C719102rN c719102rN;
                InterfaceC772302zx interfaceC772302zx = (InterfaceC772302zx) this.LIZLLL;
                if (interfaceC772302zx != null && (pairLJJJJLL = interfaceC772302zx.LJJJJLL()) != null) {
                    C719202rO first = pairLJJJJLL.getFirst();
                    C723002s0 second = pairLJJJJLL.getSecond();
                    if (second != null && (c719102rN = second.LLJLIL) != null && C756302xN.LIZ(c719102rN.LLLLLJLJLL) && first != null) {
                        first.LLILLL = c770802zi.LIZ;
                        List listSingletonList = Collections.singletonList(first);
                        if (listSingletonList != null) {
                            return listSingletonList;
                        }
                    }
                    return C13BV.INSTANCE;
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$22(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C030K, AnonymousClass0309>(str, str2) { // from class: X.030E
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                PaymentInfo paymentInfo;
                int iIntValue;
                C030K c030k = (C030K) c033v;
                if (!c770802zi.LIZIZ.LJJ()) {
                    return C13BV.INSTANCE;
                }
                BillInfoData billInfoData = c030k.LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                AnonymousClass0309 anonymousClass0309 = (AnonymousClass0309) this.LIZLLL;
                if (anonymousClass0309 != null) {
                    paymentInfo = anonymousClass0309.getPaymentInfo();
                } else {
                    paymentInfo = null;
                }
                C03SE c03se = C03PI.LJIJI;
                PaymentMethodsData paymentMethodsData = billInfoData.paymentMethods;
                c03se.getClass();
                C443120HZe c443120HZeLJJJIL = C03SE.LJJJIL(paymentInfo, paymentMethodsData, true, true);
                boolean zBooleanValue = ((Boolean) c443120HZeLJJJIL.getFirst()).booleanValue();
                String str3 = (String) c443120HZeLJJJIL.getSecond();
                List list = (List) c443120HZeLJJJIL.getThird();
                Integer numLIZ = c770802zi.LIZ();
                if (numLIZ != null) {
                    iIntValue = numLIZ.intValue();
                } else {
                    iIntValue = 0;
                }
                C722302rt c722302rtLJFF = C722002rq.LJFF(billInfoData, str3, zBooleanValue, iIntValue, list, null, c770802zi.LIZIZ.LJJIJIIJIL(), 16);
                c722302rtLJFF.LLILLL = c770802zi.LIZ;
                if (!c722302rtLJFF.LLILZLL.isEmpty()) {
                    return Collections.singletonList(c722302rtLJFF);
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$23(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C031M, C031N>(str, str2) { // from class: X.031I
            /* JADX WARN: Removed duplicated region for block: B:100:0x0165  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0055 A[PHI: r6
              0x0055: PHI (r6v2 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>) = 
              (r6v0 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>)
              (r6v4 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>)
              (r6v5 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>)
             binds: [B:35:0x0053, B:30:0x0047, B:21:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x00e6  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0108  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0159  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x015b  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x015d  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x0161  */
            @Override // X.C032O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List LIZIZ(X.C770802zi r36, X.C033V r37) {
                /*
                    Method dump skipped, instruction units count: 375
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C031I.LIZIZ(X.02zi, X.033V):java.util.List");
            }
        };
    }

    public static final Object invoke$24(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C030Q, AnonymousClass0308>(str, str2) { // from class: X.030O
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                int iIntValue;
                BillInfoData billInfoData = ((C030Q) c033v).LIZ;
                if (c770802zi.LIZIZ.LJJ() && billInfoData != null && billInfoData.platformPromotion != null) {
                    Integer numLIZ = c770802zi.LIZ();
                    if (numLIZ != null) {
                        iIntValue = numLIZ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    C720002rW c720002rWLIZ = C021I.LIZ(billInfoData, iIntValue, false, true, 1, 2);
                    c720002rWLIZ.LLILLL = c770802zi.LIZ;
                    AnonymousClass0308 anonymousClass0308 = (AnonymousClass0308) this.LIZLLL;
                    if (anonymousClass0308 != null) {
                        anonymousClass0308.LJIIJ(c720002rWLIZ);
                    }
                    return Collections.singletonList(c720002rWLIZ);
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$25(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C7757031f>(str, str2) { // from class: X.031S
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                C7757031f c7757031f = (C7757031f) c033v;
                if (!c770802zi.LIZIZ.LJJ()) {
                    return C13BV.INSTANCE;
                }
                BillInfoData billInfoData = c7757031f.LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                C7734030i c7734030i = new C7734030i(billInfoData.privacyPolicyStatement, Integer.valueOf(EnumC804303Cf.SEA_ONE_STEP.getValue()));
                c7734030i.LLILLL = c770802zi.LIZ;
                return Collections.singletonList(c7734030i);
            }
        };
    }

    public static final Object invoke$26(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C769602zW, InterfaceC772102zv>(str, str2) { // from class: X.030h
            /* JADX WARN: Removed duplicated region for block: B:170:0x01e7  */
            /* JADX WARN: Removed duplicated region for block: B:173:0x01ed  */
            /* JADX WARN: Removed duplicated region for block: B:176:0x01f9  */
            /* JADX WARN: Removed duplicated region for block: B:179:0x01ff A[PHI: r0 r1 r8 r9 r20
              0x01ff: PHI (r0v16 java.lang.String) = (r0v13 java.lang.String), (r0v20 java.lang.String) binds: [B:196:0x0231, B:178:0x01fd] A[DONT_GENERATE, DONT_INLINE]
              0x01ff: PHI (r1v13 java.lang.String) = (r1v11 java.lang.String), (r1v14 java.lang.String) binds: [B:196:0x0231, B:178:0x01fd] A[DONT_GENERATE, DONT_INLINE]
              0x01ff: PHI (r8v8 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = (r8v6 com.ss.android.ugc.aweme.ecommerce.service.vo.Image), (r8v9 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) binds: [B:196:0x0231, B:178:0x01fd] A[DONT_GENERATE, DONT_INLINE]
              0x01ff: PHI (r9v7 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = (r9v5 com.ss.android.ugc.aweme.ecommerce.service.vo.Image), (r9v8 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) binds: [B:196:0x0231, B:178:0x01fd] A[DONT_GENERATE, DONT_INLINE]
              0x01ff: PHI (r20v3 java.lang.Integer) = (r20v1 java.lang.Integer), (r20v4 java.lang.Integer) binds: [B:196:0x0231, B:178:0x01fd] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:185:0x0220 A[PHI: r1
              0x0220: PHI (r1v8 java.lang.String) = (r1v7 java.lang.String), (r1v17 java.lang.String), (r1v18 java.lang.String) binds: [B:160:0x01d3, B:183:0x021d, B:166:0x01df] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:189:0x0226 A[PHI: r1 r9
              0x0226: PHI (r1v9 java.lang.String) = (r1v8 java.lang.String), (r1v8 java.lang.String), (r1v16 java.lang.String) binds: [B:186:0x0221, B:187:0x0223, B:169:0x01e5] A[DONT_GENERATE, DONT_INLINE]
              0x0226: PHI (r9v3 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = 
              (r9v2 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
              (r9v2 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
              (r9v10 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
             binds: [B:186:0x0221, B:187:0x0223, B:169:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:193:0x022c A[PHI: r1 r8 r9
              0x022c: PHI (r1v10 java.lang.String) = (r1v9 java.lang.String), (r1v15 java.lang.String) binds: [B:191:0x0229, B:172:0x01eb] A[DONT_GENERATE, DONT_INLINE]
              0x022c: PHI (r8v5 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = (r8v4 com.ss.android.ugc.aweme.ecommerce.service.vo.Image), (r8v10 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) binds: [B:191:0x0229, B:172:0x01eb] A[DONT_GENERATE, DONT_INLINE]
              0x022c: PHI (r9v4 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = (r9v3 com.ss.android.ugc.aweme.ecommerce.service.vo.Image), (r9v9 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) binds: [B:191:0x0229, B:172:0x01eb] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:195:0x0230 A[PHI: r1 r8 r9 r20
              0x0230: PHI (r1v11 java.lang.String) = (r1v9 java.lang.String), (r1v14 java.lang.String), (r1v14 java.lang.String) binds: [B:194:0x022e, B:175:0x01f7, B:177:0x01fb] A[DONT_GENERATE, DONT_INLINE]
              0x0230: PHI (r8v6 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = 
              (r8v4 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
              (r8v9 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
              (r8v9 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
             binds: [B:194:0x022e, B:175:0x01f7, B:177:0x01fb] A[DONT_GENERATE, DONT_INLINE]
              0x0230: PHI (r9v5 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = 
              (r9v3 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
              (r9v8 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
              (r9v8 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
             binds: [B:194:0x022e, B:175:0x01f7, B:177:0x01fb] A[DONT_GENERATE, DONT_INLINE]
              0x0230: PHI (r20v1 java.lang.Integer) = (r20v0 java.lang.Integer), (r20v4 java.lang.Integer), (r20v4 java.lang.Integer) binds: [B:194:0x022e, B:175:0x01f7, B:177:0x01fb] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:208:0x00c1 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x012c A[PHI: r9
              0x012c: PHI (r9v16 java.lang.String) = (r9v0 java.lang.String), (r9v17 java.lang.String) binds: [B:85:0x012a, B:83:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x0130 A[PHI: r9
              0x0130: PHI (r9v15 java.lang.String) = (r9v0 java.lang.String), (r9v16 java.lang.String) binds: [B:85:0x012a, B:87:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:94:0x013c A[PHI: r10
              0x013c: PHI (r10v8 java.lang.String) = (r10v2 java.lang.String), (r10v9 java.lang.String) binds: [B:93:0x013a, B:91:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:96:0x0140 A[PHI: r10
              0x0140: PHI (r10v7 java.lang.String) = (r10v2 java.lang.String), (r10v8 java.lang.String) binds: [B:93:0x013a, B:95:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C032O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List LIZIZ(X.C770802zi r27, X.C033V r28) {
                /*
                    Method dump skipped, instruction units count: 589
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C7733030h.LIZIZ(X.02zi, X.033V):java.util.List");
            }
        };
    }

    public static final Object invoke$27(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C7759031h>(str, str2) { // from class: X.031a
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                SkuSelection skuSelection;
                SeaSkuPanelWaistBanner seaSkuPanelWaistBanner;
                BillInfoData billInfoData = ((C7759031h) c033v).LIZ;
                if (billInfoData != null && (skuSelection = billInfoData.skuSelection) != null && (seaSkuPanelWaistBanner = skuSelection.skuPanelWaistBanner) != null) {
                    Integer num = seaSkuPanelWaistBanner.positionType;
                    int value = C03GL.INSERT_BANNER.getValue();
                    if (num != null && num.intValue() == value) {
                        AnonymousClass0322 anonymousClass0322 = new AnonymousClass0322(seaSkuPanelWaistBanner);
                        anonymousClass0322.LLILLL = c770802zi.LIZ;
                        return Collections.singletonList(anonymousClass0322);
                    }
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$28(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        Fragment fragmentLJI;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        if (obj2 != null && (fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ)) != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        RecyclerView recyclerView;
        UIAssem uIAssem = (UIAssem) obj;
        C893703eR c893703eR = (C893703eR) obj2;
        if (c893703eR != null && c893703eR.LIZ >= 0 && c893703eR.LIZIZ == EnumC890003dq.TOP) {
            View viewLJJIJL = uIAssem.LJJIJL();
            if (viewLJJIJL != null) {
                recyclerView = (RecyclerView) viewLJJIJL.findViewById(R.id.rn0);
            } else {
                recyclerView = null;
            }
            recyclerView.scrollToPosition(c893703eR.LIZ);
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$30(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$31(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C030L, AnonymousClass0300>(str, str2) { // from class: X.0304
            /* JADX WARN: Removed duplicated region for block: B:21:0x002d A[PHI: r5
              0x002d: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:33:0x0047, B:20:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0063  */
            @Override // X.C032O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List LIZIZ(X.C770802zi r8, X.C033V r9) {
                /*
                    r7 = this;
                    X.030L r9 = (X.C030L) r9
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r3 = r9.LIZ
                    if (r3 != 0) goto L9
                    X.13BV r0 = X.C13BV.INSTANCE
                    return r0
                L9:
                    P extends X.02zZ r0 = r7.LIZLLL
                    X.0303 r0 = (X.AnonymousClass0303) r0
                    r2 = 1
                    if (r0 == 0) goto L65
                    boolean r0 = r0.LIZLLL(r3)
                    if (r0 != r2) goto L65
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BottomCashbackBanner r1 = r3.bottomCashbackBanner
                    if (r1 == 0) goto L4a
                    java.lang.Integer r0 = r1.descType
                    if (r0 == 0) goto L4a
                    int r0 = r0.intValue()
                    if (r0 != r2) goto L4a
                L24:
                    r6 = 0
                    if (r2 == 0) goto L46
                    java.lang.String r5 = r1.desc
                L29:
                    com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r4 = r1.descRichText
                    if (r4 != 0) goto L37
                L2d:
                    P extends X.02zZ r0 = r7.LIZLLL
                    X.0300 r0 = (X.AnonymousClass0300) r0
                    if (r0 == 0) goto L44
                    com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r4 = r0.LJI(r3)
                L37:
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion r3 = r3.platformPromotion
                    if (r3 == 0) goto L3f
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo r0 = r3.bonusInfo
                    if (r0 != 0) goto L4c
                L3f:
                    if (r4 != 0) goto L4c
                    X.13BV r0 = X.C13BV.INSTANCE
                    return r0
                L44:
                    r4 = r6
                    goto L37
                L46:
                    r5 = r6
                    if (r1 == 0) goto L2d
                    goto L29
                L4a:
                    r2 = 0
                    goto L24
                L4c:
                    X.0318 r2 = new X.0318
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusModule r1 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusModule
                    if (r3 == 0) goto L63
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo r0 = r3.bonusInfo
                L54:
                    r1.<init>(r6, r0)
                    r2.<init>(r1, r5, r4)
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPPageModuleConfig r0 = r8.LIZ
                    r2.LLILLL = r0
                    java.util.List r0 = java.util.Collections.singletonList(r2)
                    return r0
                L63:
                    r0 = r6
                    goto L54
                L65:
                    X.13BV r0 = X.C13BV.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0304.LIZIZ(X.02zi, X.033V):java.util.List");
            }
        };
    }

    public static final Object invoke$32(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C7755031d>(str, str2) { // from class: X.031X
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                C7755031d c7755031d = (C7755031d) c033v;
                if (!c770802zi.LIZIZ.LJJ()) {
                    return C13BV.INSTANCE;
                }
                BillInfoData billInfoData = c7755031d.LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                return Collections.singletonList(new C742102v5(billInfoData.cpfInfo));
            }
        };
    }

    public static final Object invoke$33(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C030U, C030A>(str, str2) { // from class: X.030S
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                C030U c030u = (C030U) c033v;
                C030A c030a = (C030A) this.LIZLLL;
                if (c030a != null && c030a.LJFF(c030u.LIZ)) {
                    return Collections.singletonList(new C754002x0(null));
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$34(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C030K, C030B>(str, str2) { // from class: X.030F
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                PaymentInfo paymentInfo;
                int iIntValue;
                C030K c030k = (C030K) c033v;
                if (!c770802zi.LIZIZ.LJJ()) {
                    return C13BV.INSTANCE;
                }
                BillInfoData billInfoData = c030k.LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                C030B c030b = (C030B) this.LIZLLL;
                if (c030b != null) {
                    paymentInfo = c030b.getPaymentInfo();
                } else {
                    paymentInfo = null;
                }
                C03SE c03se = C03PI.LJIJI;
                PaymentMethodsData paymentMethodsData = billInfoData.paymentMethods;
                c03se.getClass();
                C443120HZe c443120HZeLJJJIL = C03SE.LJJJIL(paymentInfo, paymentMethodsData, true, true);
                boolean zBooleanValue = ((Boolean) c443120HZeLJJJIL.getFirst()).booleanValue();
                String str3 = (String) c443120HZeLJJJIL.getSecond();
                List list = (List) c443120HZeLJJJIL.getThird();
                Integer numLIZ = c770802zi.LIZ();
                if (numLIZ != null) {
                    iIntValue = numLIZ.intValue();
                } else {
                    iIntValue = 0;
                }
                return Collections.singletonList(C722002rq.LJFF(billInfoData, str3, zBooleanValue, iIntValue, list, null, c770802zi.LIZIZ.LJJIJIIJIL(), 16));
            }
        };
    }

    public static final Object invoke$35(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C031M, C031N>(str, str2) { // from class: X.031J
            /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x005a A[PHI: r2
              0x005a: PHI (r2v2 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>) = 
              (r2v0 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>)
              (r2v7 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>)
              (r2v8 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>)
             binds: [B:35:0x0059, B:30:0x004d, B:22:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x00e0  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0137  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0141  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x014c  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x014e  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0150  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x0152  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x0156  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x015b  */
            @Override // X.C032O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List LIZIZ(X.C770802zi r36, X.C033V r37) {
                /*
                    Method dump skipped, instruction units count: 361
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C031J.LIZIZ(X.02zi, X.033V):java.util.List");
            }
        };
    }

    public static final Object invoke$36(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C030Q, C030C>(str, str2) { // from class: X.030P
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                boolean z;
                BillInfoData billInfoData = ((C030Q) c033v).LIZ;
                if (c770802zi.LIZIZ.LJJ() && billInfoData != null && billInfoData.platformPromotion != null) {
                    C030C c030c = (C030C) this.LIZLLL;
                    int iIntValue = 0;
                    if (c030c != null && c030c.LIZLLL(billInfoData)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Integer numLIZ = c770802zi.LIZ();
                    if (numLIZ != null) {
                        iIntValue = numLIZ.intValue();
                    }
                    C720002rW c720002rWLIZ = C021I.LIZ(billInfoData, iIntValue, false, z, null, 10);
                    c770802zi.LIZIZ.LJJIFFI(new AwS580S0100000_1(c720002rWLIZ, 514));
                    return Collections.singletonList(c720002rWLIZ);
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$37(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C7757031f>(str, str2) { // from class: X.031V
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                C7757031f c7757031f = (C7757031f) c033v;
                if (!c770802zi.LIZIZ.LJJ()) {
                    return C13BV.INSTANCE;
                }
                BillInfoData billInfoData = c7757031f.LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                return Collections.singletonList(new C7734030i(billInfoData.privacyPolicyStatement));
            }
        };
    }

    public static final Object invoke$38(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C7766031o>(str, str2) { // from class: X.031m
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                RefundableSampleModule refundableSampleModule;
                BillInfoData billInfoData = ((C7766031o) c033v).LIZ;
                if (billInfoData != null && (refundableSampleModule = billInfoData.refundableSampleModule) != null) {
                    return Collections.singletonList(new C7730030e(refundableSampleModule));
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$39(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C7750030y, AnonymousClass0315>(str, str2) { // from class: X.030v
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                int iIntValue;
                DeliveryInstructionInfo deliveryInstructionInfo;
                Address address;
                AnonymousClass0315 anonymousClass0315 = (AnonymousClass0315) this.LIZLLL;
                BillInfoData billInfoData = ((C7750030y) c033v).LJ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                if (c770802zi.LIZIZ.LJJLIIIJLLLLLLLZ()) {
                    return C13BV.INSTANCE;
                }
                boolean zLJIIJJI = billInfoData.LJIIJJI();
                if (anonymousClass0315 != null) {
                    anonymousClass0315.LJJJI(zLJIIJJI);
                }
                Integer numLIZ = c770802zi.LIZ();
                boolean z = false;
                if (numLIZ != null) {
                    iIntValue = numLIZ.intValue();
                } else {
                    iIntValue = 0;
                }
                AnonymousClass0376 anonymousClass0376LIZIZ = C724902sJ.LIZIZ(billInfoData, zLJIIJJI, null, iIntValue, false, 10);
                if (anonymousClass0315 != null && anonymousClass0315.LJ(billInfoData)) {
                    z = true;
                }
                anonymousClass0376LIZIZ.LLJJIJIIJIL = z;
                InterfaceC7746030u interfaceC7746030u = c770802zi.LIZIZ;
                if (interfaceC7746030u != null) {
                    interfaceC7746030u.LJJIFFI(new AwS580S0100000_1(anonymousClass0376LIZIZ, 515));
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(anonymousClass0376LIZIZ);
                if (!AnonymousClass0314.LIZ.orderSubmitEnable || !C724902sJ.LIZ(anonymousClass0376LIZIZ)) {
                    return arrayList;
                }
                ShippingAddress shippingAddress = billInfoData.shippingAddress;
                if (shippingAddress != null && (address = shippingAddress.shippingAddress) != null) {
                    deliveryInstructionInfo = address.deliveryInstructionInfo;
                } else {
                    deliveryInstructionInfo = null;
                }
                arrayList.add(new C752402wk(deliveryInstructionInfo));
                return arrayList;
            }
        };
    }

    public static final Object invoke$40(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C769302zT, InterfaceC770602zg>(str, str2) { // from class: X.02ze
            /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0126  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x014b A[PHI: r7
              0x014b: PHI (r7v5 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = (r7v4 com.ss.android.ugc.aweme.ecommerce.service.vo.Image), (r7v12 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) binds: [B:74:0x0148, B:56:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C032O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List LIZIZ(X.C770802zi r23, X.C033V r24) {
                /*
                    Method dump skipped, instruction units count: 567
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C770402ze.LIZIZ(X.02zi, X.033V):java.util.List");
            }
        };
    }

    public static final Object invoke$41(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C7758031g>(str, str2) { // from class: X.031b
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                ExposeUserRightPanel exposeUserRightPanel;
                Object c757602xa;
                BillInfoData billInfoData = ((C7758031g) c033v).LIZ;
                if (billInfoData != null && (exposeUserRightPanel = billInfoData.userRightModuleInfo) != null) {
                    Integer num = exposeUserRightPanel.style;
                    if (num != null && num.intValue() == 11) {
                        c757602xa = new C736902uF(exposeUserRightPanel);
                    } else {
                        c757602xa = new C757602xa(exposeUserRightPanel);
                    }
                    return Collections.singletonList(c757602xa);
                }
                return C13BV.INSTANCE;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$42(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        LinearLayoutManager linearLayoutManager;
        UIAssem uIAssem = (UIAssem) obj;
        C948003nC c948003nC = (C948003nC) obj2;
        if (c948003nC != null) {
            try {
                C03SE c03se = C03PI.LJIJI;
                AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c948003nC, (C948003nC<Integer>) 1555);
                c03se.getClass();
                C03SE.LJJIFFI(awS545S0100000_1);
                View viewLJJIJL = uIAssem.LJJIJL();
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = null;
                if (viewLJJIJL != null) {
                    viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewLJJIJL.findViewById(R.id.rn0);
                }
                RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    linearLayoutManager.scrollToPositionWithOffset(((Number) c948003nC.LIZ).intValue(), 0);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$43(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        C197039127h c197039127h;
        boolean z;
        int i;
        UIAssem uIAssem = (UIAssem) obj;
        View viewLJJIJL = uIAssem.LJJIJL();
        TextView textView = null;
        if (viewLJJIJL != null) {
            c197039127h = (C197039127h) viewLJJIJL.findViewById(R.id.caj);
        } else {
            c197039127h = null;
        }
        if (obj2 != null) {
            z = true;
        } else {
            z = false;
        }
        c197039127h.setEnabled(z);
        Context context = uIAssem.getContext();
        if (context != null) {
            View viewLJJIJL2 = uIAssem.LJJIJL();
            if (viewLJJIJL2 != null) {
                textView = (TextView) viewLJJIJL2.findViewById(R.id.caj);
            }
            if (obj2 != null) {
                i = R.attr.ee;
            } else {
                i = R.attr.a1p;
            }
            textView.setTextColor(C960203pA.LIZ(i, context));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        C1440005kM.LIZ(new AnonymousClass0341(((Boolean) obj2).booleanValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$45(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ() != null) {
            C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
            if (c19egLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                c1389890mGx.LJIIIZ(2131831429);
                c1389890mGx.LJIIJJI();
            }
            Fragment fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ);
            if (fragmentLJI != null) {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$46(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$47(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$48(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$49(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C032B, InterfaceC769002zQ>(str, str2) { // from class: X.02zI
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                C741702v1 c741702v1LJIIZILJ;
                C720602rc c720602rc;
                C719202rO first;
                InterfaceC767902zF interfaceC767902zF = (InterfaceC767902zF) this.LIZLLL;
                if (interfaceC767902zF != null && (c741702v1LJIIZILJ = interfaceC767902zF.LJIIZILJ()) != null) {
                    if (c741702v1LJIIZILJ.LIZ) {
                        c720602rc = new C720602rc(c741702v1LJIIZILJ.LJFF);
                    } else {
                        Pair<C719202rO, C723002s0> pair = c741702v1LJIIZILJ.LIZIZ;
                        if (pair != null) {
                            first = pair.getFirst();
                        } else {
                            first = null;
                        }
                        c720602rc = new C720602rc(first);
                    }
                    c720602rc.LLILLL = c770802zi.LIZ;
                    return Collections.singletonList(c720602rc);
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$50(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C030L>(str, str2) { // from class: X.031U
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                BonusModule bonusModule;
                BillInfoData billInfoData = ((C030L) c033v).LIZ;
                if (billInfoData != null && (bonusModule = billInfoData.bonusModule) != null) {
                    AnonymousClass0319 anonymousClass0319 = new AnonymousClass0319(bonusModule);
                    anonymousClass0319.LLILLL = c770802zi.LIZ;
                    return Collections.singletonList(anonymousClass0319);
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$51(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C7756031e>(str, str2) { // from class: X.031W
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                DigitalDelivery digitalDelivery;
                BillInfoData billInfoData = ((C7756031e) c033v).LIZ;
                if (billInfoData != null && (digitalDelivery = billInfoData.digitalDelivery) != null) {
                    C755902xJ c755902xJ = new C755902xJ(digitalDelivery);
                    c755902xJ.LLILLL = c770802zi.LIZ;
                    return Collections.singletonList(c755902xJ);
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$52(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C030Z, InterfaceC7728030c>(str, str2) { // from class: X.030Y
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                InterfaceC7728030c interfaceC7728030c;
                C030Z c030z = (C030Z) c033v;
                if (!c770802zi.LIZIZ.LJJ() || ((interfaceC7728030c = (InterfaceC7728030c) this.LIZLLL) != null && interfaceC7728030c.LJIIIZ())) {
                    return C13BV.INSTANCE;
                }
                BillInfoData billInfoData = c030z.LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                EmailAuthorizationInfo emailAuthorizationInfo = billInfoData.emailAuthorizationInfo;
                if (emailAuthorizationInfo != null) {
                    InterfaceC7728030c interfaceC7728030c2 = (InterfaceC7728030c) this.LIZLLL;
                    if (interfaceC7728030c2 != null) {
                        interfaceC7728030c2.LJIIIIZZ(emailAuthorizationInfo);
                    }
                    AnonymousClass0316 anonymousClass0316 = new AnonymousClass0316(emailAuthorizationInfo);
                    anonymousClass0316.LLILLL = c770802zi.LIZ;
                    return Collections.singletonList(anonymousClass0316);
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$53(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C030U, C030N>(str, str2) { // from class: X.030R
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                ExtraFeeStatement extraFeeStatementLJJLJLI;
                C030U c030u = (C030U) c033v;
                C030N c030n = (C030N) this.LIZLLL;
                if (c030n != null && (extraFeeStatementLJJLJLI = c030n.LJJLJLI(c030u.LIZ)) != null) {
                    C754002x0 c754002x0 = new C754002x0(extraFeeStatementLJJLJLI);
                    c754002x0.LLILLL = c770802zi.LIZ;
                    return Collections.singletonList(c754002x0);
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$54(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C032C, InterfaceC769002zQ>(str, str2) { // from class: X.02zH
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                C741702v1 c741702v1LJIIZILJ;
                C719102rN c719102rN;
                List<C719202rO> list;
                C719202rO c719202rO;
                List<C723002s0> list2;
                InterfaceC767902zF interfaceC767902zF = (InterfaceC767902zF) this.LIZLLL;
                if (interfaceC767902zF != null && (c741702v1LJIIZILJ = interfaceC767902zF.LJIIZILJ()) != null) {
                    ArrayList arrayList = new ArrayList();
                    if (c741702v1LJIIZILJ.LIZ) {
                        if (Intrinsics.LJFF(c741702v1LJIIZILJ.LIZJ, Boolean.FALSE) && (list = c741702v1LJIIZILJ.LIZLLL) != null && (c719202rO = (C719202rO) C13LP.LJJJLL(list)) != null) {
                            C719202rO c719202rOLIZIZ = C719202rO.LIZIZ(c719202rO, null, null, null, null, null, null, null, null, null, 1048575);
                            ArrayList arrayList2 = new ArrayList();
                            for (C719202rO c719202rO2 : list) {
                                if (c719202rO2 != null && (list2 = c719202rO2.LLJIJIL) != null) {
                                    for (C723002s0 c723002s0 : list2) {
                                        arrayList2.add(c723002s0);
                                        for (C719102rN c719102rN2 : c723002s0.LLJ) {
                                            if (!c719102rN2.LIZLLL() && C756302xN.LIZ(c719102rN2.LLLLLJLJLL)) {
                                                c719202rOLIZIZ.LLJLIL = true;
                                            }
                                        }
                                    }
                                }
                            }
                            if (c719202rOLIZIZ.LLJLIL) {
                                C719202rO c719202rOLIZIZ2 = C719202rO.LIZIZ(c719202rOLIZIZ, null, null, null, null, null, arrayList2, null, null, null, 1048543);
                                c719202rOLIZIZ2.LLJLIL = true;
                                c719202rOLIZIZ2.LLILLL = c770802zi.LIZ;
                                arrayList.add(c719202rOLIZIZ2);
                                return arrayList;
                            }
                            return arrayList;
                        }
                        return arrayList;
                    }
                    Pair<C719202rO, C723002s0> pair = c741702v1LJIIZILJ.LIZIZ;
                    if (pair != null) {
                        C719202rO first = pair.getFirst();
                        C723002s0 second = pair.getSecond();
                        if (second != null && (c719102rN = second.LLJLIL) != null && C756302xN.LIZ(c719102rN.LLLLLJLJLL) && first != null) {
                            first.LLILLL = c770802zi.LIZ;
                            arrayList.add(first);
                            return arrayList;
                        }
                        return arrayList;
                    }
                    return arrayList;
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$55(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C770202zc, InterfaceC769002zQ>(str, str2) { // from class: X.02zb
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                C741702v1 c741702v1LJIIZILJ;
                Map<String, List<MainOrderInfo>> mapLJ;
                String str3;
                BillStarlingText billStarlingText;
                BillInfoData billInfoData = ((C770202zc) c033v).LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                InterfaceC767902zF interfaceC767902zF = (InterfaceC767902zF) this.LIZLLL;
                String str4 = null;
                if (interfaceC767902zF != null) {
                    c741702v1LJIIZILJ = interfaceC767902zF.LJIIZILJ();
                    mapLJ = interfaceC767902zF.LIZJ();
                    if (mapLJ == null) {
                    }
                    if (c741702v1LJIIZILJ == null && c741702v1LJIIZILJ.LIZ && c770802zi.LIZIZ.LJJ() && (!mapLJ.isEmpty())) {
                        BillStarling billStarling = billInfoData.starlingTexts;
                        if (billStarling != null && (billStarlingText = billStarling.unavailableModuleTitle) != null) {
                            str3 = billStarlingText.text;
                        } else {
                            str3 = null;
                            if (billStarling != null) {
                            }
                            C031B c031b = new C031B(mapLJ, str3, str4);
                            c031b.LLILLL = c770802zi.LIZ;
                            return Collections.singletonList(c031b);
                        }
                        BillStarlingText billStarlingText2 = billStarling.unavailableQuantity;
                        if (billStarlingText2 != null) {
                            str4 = billStarlingText2.text;
                        }
                        C031B c031b2 = new C031B(mapLJ, str3, str4);
                        c031b2.LLILLL = c770802zi.LIZ;
                        return Collections.singletonList(c031b2);
                    }
                    return C13BV.INSTANCE;
                }
                c741702v1LJIIZILJ = null;
                mapLJ = C2097608Jq.LJ();
                if (c741702v1LJIIZILJ == null) {
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$56(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C768802zO, InterfaceC769002zQ>(str, str2) { // from class: X.02zG
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                C723002s0 second;
                boolean z;
                String str3;
                ShopOrderNew shopOrderNew;
                ShopOrderStarling shopOrderStarling;
                BillStarlingText billStarlingText;
                BillInfoData billInfoData = ((C768802zO) c033v).LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                InterfaceC767902zF interfaceC767902zF = (InterfaceC767902zF) this.LIZLLL;
                if (interfaceC767902zF != null) {
                    if (interfaceC767902zF.LJIJ(billInfoData.newShopOrders)) {
                        return C13BV.INSTANCE;
                    }
                    C741702v1 c741702v1LJIIZILJ = interfaceC767902zF.LJIIZILJ();
                    if (c741702v1LJIIZILJ != null) {
                        Image image = null;
                        if (c741702v1LJIIZILJ.LIZ) {
                            C719302rP c719302rP = c741702v1LJIIZILJ.LJ;
                            if (c719302rP == null) {
                                return C13BV.INSTANCE;
                            }
                            C738302uT c738302uTLIZ = C738402uU.LIZ(billInfoData, null, c719302rP, Intrinsics.LJFF(c741702v1LJIIZILJ.LIZJ, Boolean.FALSE), 1);
                            c738302uTLIZ.LLILLL = c770802zi.LIZ;
                            return Collections.singletonList(c738302uTLIZ);
                        }
                        Pair<C719202rO, C723002s0> pair = c741702v1LJIIZILJ.LIZIZ;
                        if (pair != null && (second = pair.getSecond()) != null) {
                            C719102rN c719102rN = second.LLJLIL;
                            if (c719102rN != null) {
                                image = c719102rN.LLIZLLLIL;
                            }
                            List<LogisticDTO> list = second.LLILZ;
                            LogisticDTO logisticDTO = second.LLILZIL;
                            MultiLogisticsPanelInfo multiLogisticsPanelInfo = second.LLILZLL;
                            LogisticPanelModule logisticPanelModule = second.LLJJIJIIJIL;
                            LogisticPanelModule logisticPanelModule2 = second.LLJJIJIL;
                            String str4 = second.LLJJJ;
                            Boolean bool = second.LLJJIII;
                            String str5 = second.LLJILLL;
                            boolean z2 = second.LLILLL;
                            if (interfaceC767902zF.LIZJ().isEmpty() && Intrinsics.LJFF(c741702v1LJIIZILJ.LIZJ, Boolean.FALSE)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            List<ShopOrderNew> list2 = billInfoData.newShopOrders;
                            if (list2 != null && (shopOrderNew = (ShopOrderNew) C13LP.LJJJLL(list2)) != null && (shopOrderStarling = shopOrderNew.shopOrderStarling) != null && (billStarlingText = shopOrderStarling.expressEdtPlaceholder) != null) {
                                str3 = billStarlingText.text;
                            } else {
                                str3 = null;
                            }
                            C738302uT c738302uTLIZ2 = C738402uU.LIZ(billInfoData, new C722902rz(image, list, logisticDTO, multiLogisticsPanelInfo, logisticPanelModule, logisticPanelModule2, str4, bool, str5, z2, z, str3), null, false, 6);
                            c738302uTLIZ2.LLILLL = c770802zi.LIZ;
                            return Collections.singletonList(c738302uTLIZ2);
                        }
                        return C13BV.INSTANCE;
                    }
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$57(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C768902zP, InterfaceC769002zQ>(str, str2) { // from class: X.02zM
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                List<ShopOrderNew> list;
                C719702rT c719702rT;
                C741702v1 c741702v1LJIIZILJ;
                Pair<C719202rO, C723002s0> pair;
                C723002s0 second;
                C719102rN c719102rN;
                SnsDisplayInfo snsDisplayInfo;
                BillInfoData billInfoData = ((C768902zP) c033v).LIZ;
                InterfaceC767902zF interfaceC767902zF = (InterfaceC767902zF) this.LIZLLL;
                if (interfaceC767902zF != null && (c741702v1LJIIZILJ = interfaceC767902zF.LJIIZILJ()) != null && (pair = c741702v1LJIIZILJ.LIZIZ) != null && (second = pair.getSecond()) != null && (c719102rN = second.LLJLIL) != null && (snsDisplayInfo = c719102rN.LLLILZJ) != null) {
                    c719702rT = new C719702rT(snsDisplayInfo, c719102rN.LLLILZ, c719102rN.LLLLIL, c719102rN.LLILZLL);
                } else {
                    if (billInfoData != null && (list = billInfoData.newShopOrders) != null) {
                        Iterator<ShopOrderNew> it2 = list.iterator();
                        while (it2.hasNext()) {
                            List<MainOrderInfo> list2 = it2.next().mainOrderInfos;
                            if (list2 != null) {
                                Iterator<MainOrderInfo> it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    List<PackedSku> list3 = it3.next().packedSkus;
                                    if (list3 != null) {
                                        for (PackedSku packedSku : list3) {
                                            SnsDisplayInfo snsDisplayInfo2 = packedSku.snsDisplayInfo;
                                            if (snsDisplayInfo2 != null) {
                                                c719702rT = new C719702rT(snsDisplayInfo2, packedSku.snsInfo, packedSku.productId, packedSku.skuId);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return C13BV.INSTANCE;
                }
                c719702rT.LLILLL = c770802zi.LIZ;
                return Collections.singletonList(c719702rT);
            }
        };
    }

    public static final Object invoke$58(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C030K, C030J>(str, str2) { // from class: X.030G
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                C030J c030j;
                PaymentInfo paymentInfo;
                C030K c030k = (C030K) c033v;
                if (!c770802zi.LIZIZ.LJJ() || ((c030j = (C030J) this.LIZLLL) != null && c030j.LJIIIZ())) {
                    return C13BV.INSTANCE;
                }
                BillInfoData billInfoData = c030k.LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                C030J c030j2 = (C030J) this.LIZLLL;
                List<C714302qb> list = null;
                if (c030j2 != null) {
                    paymentInfo = c030j2.getPaymentInfo();
                } else {
                    paymentInfo = null;
                }
                C03SE c03se = C03PI.LJIJI;
                PaymentMethodsData paymentMethodsData = billInfoData.paymentMethods;
                c03se.getClass();
                C443120HZe c443120HZeLJJJIL = C03SE.LJJJIL(paymentInfo, paymentMethodsData, true, true);
                C755502xF c755502xFLIZ = C756102xL.LIZ(billInfoData, (String) c443120HZeLJJJIL.getSecond(), ((Boolean) c443120HZeLJJJIL.getFirst()).booleanValue(), (List) c443120HZeLJJJIL.getThird(), null, null, true, 24);
                c755502xFLIZ.LLILLL = c770802zi.LIZ;
                C722302rt c722302rt = c755502xFLIZ.LLILZLL;
                if (c722302rt != null) {
                    list = c722302rt.LLILZLL;
                }
                if (C756302xN.LIZ(list)) {
                    return Collections.singletonList(c755502xFLIZ);
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$59(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C031M, C031N>(str, str2) { // from class: X.031K
            /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
            @Override // X.C032O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List LIZIZ(X.C770802zi r25, X.C033V r26) {
                /*
                    Method dump skipped, instruction units count: 221
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C031K.LIZIZ(X.02zi, X.033V):java.util.List");
            }
        };
    }

    public static final /* bridge */ /* synthetic */ Object invoke$6(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$60(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C030Q>(str, str2) { // from class: X.031P
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                int iIntValue;
                C030Q c030q = (C030Q) c033v;
                if (!c770802zi.LIZIZ.LJJ()) {
                    return C13BV.INSTANCE;
                }
                BillInfoData billInfoData = c030q.LIZ;
                if (billInfoData != null && billInfoData.platformPromotion != null) {
                    Integer numLIZ = c770802zi.LIZ();
                    if (numLIZ != null) {
                        iIntValue = numLIZ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    C720002rW c720002rWLIZ = C021I.LIZ(billInfoData, iIntValue, true, false, null, 12);
                    InterfaceC7746030u interfaceC7746030u = c770802zi.LIZIZ;
                    if (interfaceC7746030u != null) {
                        interfaceC7746030u.LJJIFFI(new AwS580S0100000_1(c720002rWLIZ, 843));
                    }
                    C720202rY c720202rY = new C720202rY(c720002rWLIZ);
                    c720202rY.LLILLL = c770802zi.LIZ;
                    return Collections.singletonList(c720202rY);
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$61(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C7757031f>(str, str2) { // from class: X.031R
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                BillStarlingText billStarlingText;
                Boolean bool;
                BillInfoData billInfoData = ((C7757031f) c033v).LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                UserTrustModule userTrustModule = billInfoData.userTrustModule;
                if (userTrustModule != null) {
                    ExposeUserRightPanel exposeUserRightPanel = billInfoData.userRightModuleInfo;
                    String str3 = billInfoData.userBenefitDrawSchema;
                    BillStarling billStarling = billInfoData.starlingTexts;
                    if (billStarling != null) {
                        billStarlingText = billStarling.userBenefitViewAll;
                    } else {
                        billStarlingText = null;
                    }
                    C755202xC c755202xCLIZ = C755302xD.LIZ(userTrustModule, exposeUserRightPanel, str3, billStarlingText);
                    if (c755202xCLIZ != null) {
                        BillInfoSetting billInfoSetting = billInfoData.settings;
                        if (billInfoSetting != null) {
                            bool = billInfoSetting.shouldModifyPolicyLink;
                        } else {
                            bool = null;
                        }
                        C755202xC c755202xCLIZIZ = C755202xC.LIZIZ(c755202xCLIZ, null, bool, 479);
                        c755202xCLIZIZ.LLILLL = c770802zi.LIZ;
                        return Collections.singletonList(c755202xCLIZIZ);
                    }
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$62(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C7772031u, InterfaceC769002zQ>(str, str2) { // from class: X.02zJ
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                C741702v1 c741702v1LJIIZILJ;
                C723002s0 second;
                List<C719102rN> list;
                InterfaceC767902zF interfaceC767902zF = (InterfaceC767902zF) this.LIZLLL;
                if (interfaceC767902zF != null && (c741702v1LJIIZILJ = interfaceC767902zF.LJIIZILJ()) != null) {
                    Pair<C719202rO, C723002s0> pair = c741702v1LJIIZILJ.LIZIZ;
                    ProductSafetyModule productSafetyModule = null;
                    if (pair != null && (second = pair.getSecond()) != null && (list = second.LLJ) != null) {
                        Iterator<C719102rN> it2 = list.iterator();
                        while (it2.hasNext()) {
                            ProductSafetyModule productSafetyModule2 = it2.next().LLLIIIL;
                            if (productSafetyModule2 != null) {
                                productSafetyModule = productSafetyModule2;
                            }
                        }
                        if (productSafetyModule != null) {
                            C719602rS c719602rS = new C719602rS(productSafetyModule);
                            c719602rS.LLILLL = c770802zi.LIZ;
                            return Collections.singletonList(c719602rS);
                        }
                    }
                    return C13BV.INSTANCE;
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$63(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C7773031v, InterfaceC769002zQ>(str, str2) { // from class: X.02zN
            /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
            @Override // X.C032O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List LIZIZ(X.C770802zi r5, X.C033V r6) {
                /*
                    r4 = this;
                    P extends X.02zZ r0 = r4.LIZLLL
                    X.02zF r0 = (X.InterfaceC767902zF) r0
                    if (r0 == 0) goto L52
                    X.02v1 r3 = r0.LJIIZILJ()
                    if (r3 == 0) goto L52
                    kotlin.Pair<X.02rO, X.02s0> r0 = r3.LIZIZ
                    if (r0 == 0) goto L2c
                    java.lang.Object r0 = r0.getSecond()
                    X.02s0 r0 = (X.C723002s0) r0
                    if (r0 == 0) goto L2f
                    X.02rN r0 = r0.LLJLIL
                    if (r0 == 0) goto L2f
                    java.lang.Integer r2 = r0.LLLLLZIL
                    X.03Ci r0 = X.EnumC804603Ci.WITH_QUANTITY_CONTROLLER
                    int r1 = r0.getValue()
                    if (r2 == 0) goto L2f
                    int r0 = r2.intValue()
                    if (r0 != r1) goto L2f
                L2c:
                    X.13BV r0 = X.C13BV.INSTANCE
                    return r0
                L2f:
                    kotlin.Pair<X.02rO, X.02s0> r0 = r3.LIZIZ
                    if (r0 == 0) goto L2c
                    java.lang.Object r0 = r0.getSecond()
                    X.02s0 r0 = (X.C723002s0) r0
                    if (r0 == 0) goto L2c
                    X.02rN r1 = r0.LLJLIL
                    if (r1 == 0) goto L2c
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderAvailableInfo r0 = r0.LLJJI
                    if (r0 == 0) goto L50
                    java.lang.Integer r0 = r0.availableStatus
                L45:
                    r1.LLLLLZL = r0
                    com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPPageModuleConfig r0 = r5.LIZ
                    r1.LLILLL = r0
                    java.util.List r0 = java.util.Collections.singletonList(r1)
                    return r0
                L50:
                    r0 = 0
                    goto L45
                L52:
                    X.13BV r0 = X.C13BV.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C768702zN.LIZIZ(X.02zi, X.033V):java.util.List");
            }
        };
    }

    public static final Object invoke$64(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C7750030y, AnonymousClass0313>(str, str2) { // from class: X.030x
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                C7750030y c7750030y = (C7750030y) c033v;
                AnonymousClass0313 anonymousClass0313 = (AnonymousClass0313) this.LIZLLL;
                if (anonymousClass0313 == null) {
                    return C13BV.INSTANCE;
                }
                BillInfoData billInfoData = c7750030y.LJ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                if (anonymousClass0313.LJJJ(billInfoData.newShopOrders)) {
                    return C13BV.INSTANCE;
                }
                AnonymousClass0376 anonymousClass0376LIZIZ = C724902sJ.LIZIZ(billInfoData, billInfoData.LJIIJJI(), EnumC804203Ce.DOUBLE_LINE, 0, false, 12);
                if (anonymousClass0313.LJJIZ(billInfoData)) {
                    anonymousClass0376LIZIZ.LLJJIJIIJIL = true;
                }
                c770802zi.LIZIZ.LJJIFFI(new AwS580S0100000_1(anonymousClass0376LIZIZ, 844));
                anonymousClass0376LIZIZ.LLILLL = c770802zi.LIZ;
                return Collections.singletonList(anonymousClass0376LIZIZ);
            }
        };
    }

    public static final Object invoke$65(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C769302zT, InterfaceC769002zQ>(str, str2) { // from class: X.02zL
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                C741702v1 c741702v1LJIIZILJ;
                C723002s0 second;
                Image image;
                boolean z;
                List<PromotionSellingPoint> list;
                List<PromotionLogo> list2;
                Integer num;
                QuantityControlInfo quantityControlInfo;
                List<C719202rO> list3;
                C719202rO c719202rO;
                List<C723002s0> list4;
                C723002s0 next;
                Image image2;
                List<PromotionSellingPoint> list5;
                List<PromotionLogo> list6;
                Integer num2;
                QuantityControlInfo quantityControlInfo2;
                BillInfoData billInfoData = ((C769302zT) c033v).LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                InterfaceC767902zF interfaceC767902zF = (InterfaceC767902zF) this.LIZLLL;
                SkuCardExtendInfo skuCardExtendInfo = null;
                if (interfaceC767902zF != null) {
                    c741702v1LJIIZILJ = interfaceC767902zF.LJIIZILJ();
                } else {
                    c741702v1LJIIZILJ = null;
                }
                ArrayList arrayList = new ArrayList();
                if (c741702v1LJIIZILJ == null) {
                    return arrayList;
                }
                if (c741702v1LJIIZILJ.LIZ) {
                    Integer num3 = billInfoData.fullfillmentGroupDisplayType;
                    if (num3 != null && num3.intValue() == 2) {
                        C719302rP c719302rP = c741702v1LJIIZILJ.LJ;
                        if (c719302rP == null) {
                            return arrayList;
                        }
                        C031G.LIZIZ(c719302rP.LLIZLLLIL);
                        c719302rP.LLILLL = c770802zi.LIZ;
                        arrayList.add(c719302rP);
                        return arrayList;
                    }
                    C719302rP c719302rP2 = c741702v1LJIIZILJ.LJ;
                    if (c719302rP2 == null || (list3 = c719302rP2.LLIZLLLIL) == null || (c719202rO = (C719202rO) C13LP.LJJJLL(list3)) == null || (list4 = c719202rO.LLJIJIL) == null) {
                        return arrayList;
                    }
                    Iterator<C723002s0> it2 = list4.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (!next.LIZ()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C723002s0 c723002s0 = next;
                    if (c723002s0 == null) {
                        return arrayList;
                    }
                    C719102rN c719102rN = c723002s0.LLJLIL;
                    if (c719102rN != null) {
                        image2 = c719102rN.LLIZLLLIL;
                    } else {
                        image2 = null;
                    }
                    Boolean bool = c723002s0.LLJJIII;
                    boolean z2 = c723002s0.LLILLL;
                    boolean zLJFF = Intrinsics.LJFF(c741702v1LJIIZILJ.LIZJ, Boolean.FALSE);
                    C719102rN c719102rN2 = c723002s0.LLJLIL;
                    if (c719102rN2 != null) {
                        list5 = c719102rN2.LLLLLLL;
                        list6 = c719102rN2.LLJJ;
                        num2 = c719102rN2.LLLLLZIL;
                        quantityControlInfo2 = c719102rN2.LLLF;
                        skuCardExtendInfo = c719102rN2.LLLILZLLLI;
                    } else {
                        list5 = null;
                        list6 = null;
                        num2 = null;
                        quantityControlInfo2 = null;
                    }
                    C720402ra c720402ra = new C720402ra(image2, bool, z2, zLJFF, c719102rN2, list5, list6, num2, quantityControlInfo2, skuCardExtendInfo);
                    c720402ra.LLILLL = c770802zi.LIZ;
                    arrayList.add(c720402ra);
                    return arrayList;
                }
                Pair<C719202rO, C723002s0> pair = c741702v1LJIIZILJ.LIZIZ;
                if (pair == null || (second = pair.getSecond()) == null) {
                    return arrayList;
                }
                C719102rN c719102rN3 = second.LLJLIL;
                if (c719102rN3 != null) {
                    image = c719102rN3.LLIZLLLIL;
                } else {
                    image = null;
                }
                Boolean bool2 = second.LLJJIII;
                boolean z3 = second.LLILLL;
                if (interfaceC767902zF.LIZJ().isEmpty() && Intrinsics.LJFF(c741702v1LJIIZILJ.LIZJ, Boolean.FALSE)) {
                    z = true;
                } else {
                    z = false;
                }
                C719102rN c719102rN4 = second.LLJLIL;
                if (c719102rN4 != null) {
                    list = c719102rN4.LLLLLLL;
                    list2 = c719102rN4.LLJJ;
                    num = c719102rN4.LLLLLZIL;
                    quantityControlInfo = c719102rN4.LLLF;
                    skuCardExtendInfo = c719102rN4.LLLILZLLLI;
                } else {
                    list = null;
                    list2 = null;
                    num = null;
                    quantityControlInfo = null;
                }
                C720402ra c720402ra2 = new C720402ra(image, bool2, z3, z, c719102rN4, list, list2, num, quantityControlInfo, skuCardExtendInfo);
                c720402ra2.LLILLL = c770802zi.LIZ;
                arrayList.add(c720402ra2);
                return arrayList;
            }
        };
    }

    public static final Object invoke$66(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C769602zW, InterfaceC769402zU>(str, str2) { // from class: X.02zV
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                List<String> listLJJJZ;
                BillInfoData billInfoData = ((C769602zW) c033v).LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                SkuSelection skuSelection = billInfoData.skuSelection;
                InterfaceC769402zU interfaceC769402zU = (InterfaceC769402zU) this.LIZLLL;
                if (interfaceC769402zU != null) {
                    listLJJJZ = interfaceC769402zU.LJJJZ();
                } else {
                    listLJJJZ = null;
                }
                C755702xH c755702xH = new C755702xH(skuSelection, listLJJJZ, 8);
                c755702xH.LLILLL = c770802zi.LIZ;
                return Collections.singletonList(c755702xH);
            }
        };
    }

    public static final Object invoke$67(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C7758031g>(str, str2) { // from class: X.031Z
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                ExposeUserRightPanel exposeUserRightPanel;
                BillInfoData billInfoData = ((C7758031g) c033v).LIZ;
                BillStarlingText billStarlingText = null;
                if (billInfoData != null && (exposeUserRightPanel = billInfoData.userRightModuleInfo) != null) {
                    String str3 = billInfoData.userBenefitDrawSchema;
                    BillStarling billStarling = billInfoData.starlingTexts;
                    if (billStarling != null) {
                        billStarlingText = billStarling.userBenefitViewAll;
                    }
                    C757502xZ c757502xZ = new C757502xZ(exposeUserRightPanel, str3, billStarlingText);
                    c757502xZ.LLILLL = c770802zi.LIZ;
                    return Collections.singletonList(c757502xZ);
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$68(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C7774031w, InterfaceC769002zQ>(str, str2) { // from class: X.02zK
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                C741702v1 c741702v1LJIIZILJ;
                Pair<C719202rO, C723002s0> pair;
                C723002s0 second;
                C719102rN c719102rN;
                SkuCardExtendInfo skuCardExtendInfo;
                VirtualInfoModule virtualInfoModule;
                C719102rN c719102rN2;
                InterfaceC767902zF interfaceC767902zF = (InterfaceC767902zF) this.LIZLLL;
                String str3 = null;
                if (interfaceC767902zF != null && (c741702v1LJIIZILJ = interfaceC767902zF.LJIIZILJ()) != null && (pair = c741702v1LJIIZILJ.LIZIZ) != null && (second = pair.getSecond()) != null && (c719102rN = second.LLJLIL) != null && (skuCardExtendInfo = c719102rN.LLLILZLLLI) != null && (virtualInfoModule = skuCardExtendInfo.virtualInfo) != null) {
                    C723002s0 second2 = pair.getSecond();
                    if (second2 != null && (c719102rN2 = second2.LLJLIL) != null) {
                        str3 = c719102rN2.LLILZLL;
                    }
                    C721002rg c721002rg = new C721002rg(virtualInfoModule, str3);
                    c721002rg.LLILLL = c770802zi.LIZ;
                    return Collections.singletonList(c721002rg);
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$69(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        return C04FF.LIZ((Context) obj, (ReviewFilterStruct) obj2);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$7(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$70(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        int i = PdpReviewViewHolder.LLJLIL;
        return C1075704Ip.LIZIZ((Context) obj, (ReviewMedia) obj2);
    }

    public static final Object invoke$71(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        int i = PdpReviewViewHolder.LLJLIL;
        C1075504In c1075504In = new C1075504In((Context) obj, null, 6);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1075504In);
        c1075504In.setLayoutParams(layoutParams);
        C1075704Ip.LIZ(c1075504In, (ReviewItemStruct) obj2);
        return c1075504In;
    }

    public static final Object invoke$72(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        int i = SeaShopProfileVH.LLLFFI;
        return C03G4.LIZ((Context) obj, (SellerDetailInfo) obj2);
    }

    public static final Object invoke$73(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        Context context = (Context) obj;
        C952103nr c952103nr = (C952103nr) obj2;
        int i = SeaShopProfileVH.LLLFFI;
        IECommerceShowcaseService iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null);
        if (iECommerceShowcaseService != null) {
            return iECommerceShowcaseService.LJIIIZ(new FrameLayout(context), c952103nr.LIZ, c952103nr.LIZIZ, c952103nr.LIZJ, c952103nr.LIZLLL);
        }
        return null;
    }

    public static final Object invoke$74(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C7744030s, InterfaceC7745030t>(str, str2) { // from class: X.030r
            /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x0138  */
            @Override // X.C032O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List LIZIZ(X.C770802zi r14, X.C033V r15) {
                /*
                    Method dump skipped, instruction units count: 334
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C7743030r.LIZIZ(X.02zi, X.033V):java.util.List");
            }
        };
    }

    public static final Object invoke$75(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C7761031j>(str, str2) { // from class: X.031i
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                AgeConfirmModule ageConfirmModule;
                BillInfoData billInfoData = ((C7761031j) c033v).LIZ;
                if (billInfoData != null && (ageConfirmModule = billInfoData.ageConfirmModule) != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C719902rV(ageConfirmModule));
                    arrayList.add(new C7811033h(0.0f, R.attr.na, 4, "age_confirm_module", "age_confirm_module_bottom_span", true));
                    return arrayList;
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$76(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C030L>(str, str2) { // from class: X.031c
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                BonusModule bonusModule;
                BillInfoData billInfoData = ((C030L) c033v).LIZ;
                if (billInfoData != null && (bonusModule = billInfoData.bonusModule) != null) {
                    return Collections.singletonList(new AnonymousClass0319(bonusModule));
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$77(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C030Z, InterfaceC769802zY>(str, str2) { // from class: X.030X
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                EmailAuthorizationInfo emailAuthorizationInfo;
                C030Z c030z = (C030Z) c033v;
                if (!c770802zi.LIZIZ.LJJ()) {
                    return C13BV.INSTANCE;
                }
                BillInfoData billInfoData = c030z.LIZ;
                if (billInfoData != null && (emailAuthorizationInfo = billInfoData.emailAuthorizationInfo) != null) {
                    InterfaceC769802zY interfaceC769802zY = (InterfaceC769802zY) this.LIZLLL;
                    if (interfaceC769802zY != null) {
                        interfaceC769802zY.LJIIIIZZ(emailAuthorizationInfo);
                    }
                    return Collections.singletonList(new AnonymousClass0316(emailAuthorizationInfo));
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$78(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C030U, C030D>(str, str2) { // from class: X.030T
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                C030U c030u = (C030U) c033v;
                C030D c030d = (C030D) this.LIZLLL;
                if (c030d != null && c030d.LJFF(c030u.LIZ)) {
                    return Collections.singletonList(new C754002x0(null));
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$79(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C770202zc, InterfaceC770002za>(str, str2) { // from class: X.02zd
            /* JADX WARN: Removed duplicated region for block: B:67:0x00fa  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x010b  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0130 A[LOOP:5: B:76:0x012a->B:78:0x0130, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0170  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x018d  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x0191  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x0199 A[PHI: r7
              0x0199: PHI (r7v4 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = (r7v3 com.ss.android.ugc.aweme.ecommerce.service.vo.Image), (r7v9 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) binds: [B:90:0x0195, B:55:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C032O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List LIZIZ(X.C770802zi r29, X.C033V r30) {
                /*
                    Method dump skipped, instruction units count: 442
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C770302zd.LIZIZ(X.02zi, X.033V):java.util.List");
            }
        };
    }

    public static final Object invoke$8(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_sku_panel_keyboard_show", C1741890vQh.LJIIIIZZ(new SkuPanelStarter.SkuKeyboardVisibilityParams(((Boolean) obj).booleanValue(), ((Number) obj2).intValue())));
        return Unit.LIZ;
    }

    public static final Object invoke$80(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C030K, C030I>(str, str2) { // from class: X.030H
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                C035M c035mLJJIJ;
                C030K c030k = (C030K) c033v;
                if (!c770802zi.LIZIZ.LJJ()) {
                    return C13BV.INSTANCE;
                }
                BillInfoData billInfoData = c030k.LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                C030I c030i = (C030I) this.LIZLLL;
                PaymentInfo paymentInfo = null;
                if (c030i != null) {
                    c035mLJJIJ = c030i.LJJIJ();
                } else {
                    c035mLJJIJ = null;
                }
                C030I c030i2 = (C030I) this.LIZLLL;
                if (c030i2 != null) {
                    paymentInfo = c030i2.getPaymentInfo();
                }
                C03SE c03se = C03PI.LJIJI;
                PaymentMethodsData paymentMethodsData = billInfoData.paymentMethods;
                c03se.getClass();
                C443120HZe c443120HZeLJJJIL = C03SE.LJJJIL(paymentInfo, paymentMethodsData, true, true);
                return C1697810uHb.LJIIJJI(C756102xL.LIZ(billInfoData, (String) c443120HZeLJJJIL.getSecond(), ((Boolean) c443120HZeLJJJIL.getFirst()).booleanValue(), (List) c443120HZeLJJJIL.getThird(), c035mLJJIJ, c770802zi.LIZIZ.LJJIJIIJIL(), false, 32), new C7811033h(0.0f, R.attr.na, 4, "order_summary", "order_summary_bottom_span", true));
            }
        };
    }

    public static final Object invoke$81(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C031M, C031N>(str, str2) { // from class: X.031L
            /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
            @Override // X.C032O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List LIZIZ(X.C770802zi r28, X.C033V r29) {
                /*
                    Method dump skipped, instruction units count: 204
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C031L.LIZIZ(X.02zi, X.033V):java.util.List");
            }
        };
    }

    public static final Object invoke$82(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C030Q>(str, str2) { // from class: X.031T
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                int iIntValue;
                C030Q c030q = (C030Q) c033v;
                if (!c770802zi.LIZIZ.LJJ()) {
                    return C13BV.INSTANCE;
                }
                BillInfoData billInfoData = c030q.LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                if (billInfoData.platformPromotion == null) {
                    return C13BV.INSTANCE;
                }
                Integer numLIZ = c770802zi.LIZ();
                if (numLIZ != null) {
                    iIntValue = numLIZ.intValue();
                } else {
                    iIntValue = 0;
                }
                C720002rW c720002rWLIZ = C021I.LIZ(billInfoData, iIntValue, false, false, null, 14);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C720202rY(c720002rWLIZ));
                InterfaceC7746030u interfaceC7746030u = c770802zi.LIZIZ;
                if (interfaceC7746030u == null) {
                    return arrayList;
                }
                interfaceC7746030u.LJJIFFI(new AwS580S0100000_1(c720002rWLIZ, 899));
                return arrayList;
            }
        };
    }

    public static final Object invoke$83(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C7757031f>(str, str2) { // from class: X.031Q
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                BillStarlingText billStarlingText;
                C7757031f c7757031f = (C7757031f) c033v;
                if (!c770802zi.LIZIZ.LJJ()) {
                    return C13BV.INSTANCE;
                }
                BillInfoData billInfoData = c7757031f.LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                UserTrustModule userTrustModule = billInfoData.userTrustModule;
                if (userTrustModule != null) {
                    ExposeUserRightPanel exposeUserRightPanel = billInfoData.userRightModuleInfo;
                    String str3 = billInfoData.userBenefitDrawSchema;
                    BillStarling billStarling = billInfoData.starlingTexts;
                    if (billStarling != null) {
                        billStarlingText = billStarling.userBenefitViewAll;
                    } else {
                        billStarlingText = null;
                    }
                    C755202xC c755202xCLIZ = C755302xD.LIZ(userTrustModule, exposeUserRightPanel, str3, billStarlingText);
                    if (c755202xCLIZ != null) {
                        OSPPageModuleConfig[] oSPPageModuleConfigArrLJFF = billInfoData.LJFF();
                        int length = oSPPageModuleConfigArrLJFF.length;
                        boolean z = false;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            if (Intrinsics.LJFF(oSPPageModuleConfigArrLJFF[i].name, "user_right")) {
                                z = true;
                                break;
                            }
                            i++;
                        }
                        c755202xCLIZ.LLJI = Boolean.valueOf(z);
                        return Collections.singletonList(c755202xCLIZ);
                    }
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$84(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C7766031o>(str, str2) { // from class: X.031n
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                RefundableSampleModule refundableSampleModule;
                BillInfoData billInfoData = ((C7766031o) c033v).LIZ;
                if (billInfoData != null && (refundableSampleModule = billInfoData.refundableSampleModule) != null) {
                    return Collections.singletonList(new C7730030e(refundableSampleModule));
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$85(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C7763031l>(str, str2) { // from class: X.031k
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                RightGuidanceModule rightGuidanceModule;
                BillInfoData billInfoData = ((C7763031l) c033v).LIZ;
                if (billInfoData != null && (rightGuidanceModule = billInfoData.rightGuidanceModule) != null) {
                    return Collections.singletonList(new C720702rd(rightGuidanceModule));
                }
                return C13BV.INSTANCE;
            }
        };
    }

    public static final Object invoke$86(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C7750030y, AnonymousClass0312>(str, str2) { // from class: X.030w
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                boolean z;
                C7751030z c7751030z;
                Address address;
                C7750030y c7750030y = (C7750030y) c033v;
                BillInfoData billInfoData = c7750030y.LJ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                AnonymousClass0312 anonymousClass0312 = (AnonymousClass0312) this.LIZLLL;
                boolean zLJIIJJI = billInfoData.LJIIJJI();
                if (anonymousClass0312 != null && anonymousClass0312.LJ(billInfoData)) {
                    z = true;
                } else {
                    z = false;
                }
                ArrayList arrayList = new ArrayList();
                if (billInfoData.announcement == null && C756302xN.LIZ(billInfoData.topBanners)) {
                    arrayList.add(new C7811033h(0.0f, R.attr.na, 4, "shipping_address", "shipping_address_top_span", true));
                }
                if (anonymousClass0312 != null && anonymousClass0312.LJJJLIIL()) {
                    return arrayList;
                }
                InterfaceC7746030u interfaceC7746030u = c770802zi.LIZIZ;
                if ((C7741030p.LIZ() || C7742030q.LIZ()) && !zLJIIJJI && anonymousClass0312 != null && !anonymousClass0312.LJJIIZ() && !anonymousClass0312.LJJIJIL()) {
                    if (interfaceC7746030u != null) {
                        interfaceC7746030u.LJJIFFI(AFwS228S0000000_1.get$arr$(813));
                    }
                    anonymousClass0312.LJIIJJI();
                }
                BillInfoData billInfoData2 = c7750030y.LJ;
                DeliveryInstructionInfo deliveryInstructionInfo = null;
                if (billInfoData2 == null) {
                    return arrayList;
                }
                EnumC804203Ce enumC804203Ce = EnumC804203Ce.DOUBLE_LINE;
                AnonymousClass0376 anonymousClass0376LIZIZ = C724902sJ.LIZIZ(billInfoData2, zLJIIJJI, enumC804203Ce, 0, false, 12);
                anonymousClass0376LIZIZ.LLJJIJIIJIL = z;
                if (billInfoData2.pudoShippingAddress != null) {
                    AnonymousClass0376 anonymousClass0376LIZIZ2 = C724902sJ.LIZIZ(billInfoData2, zLJIIJJI, enumC804203Ce, 0, true, 4);
                    anonymousClass0376LIZIZ2.LLJJIJIIJIL = z;
                    AnonymousClass0311 anonymousClass0311 = new AnonymousClass0311(anonymousClass0376LIZIZ, anonymousClass0376LIZIZ2);
                    if (!Intrinsics.LJFF(anonymousClass0376LIZIZ2.LLLF, Boolean.TRUE)) {
                        anonymousClass0376LIZIZ2 = anonymousClass0376LIZIZ;
                    }
                    c7751030z = new C7751030z(anonymousClass0311, anonymousClass0376LIZIZ, anonymousClass0376LIZIZ2);
                } else {
                    c7751030z = new C7751030z(new AnonymousClass0310(anonymousClass0376LIZIZ), anonymousClass0376LIZIZ, anonymousClass0376LIZIZ);
                }
                if (interfaceC7746030u != null) {
                    interfaceC7746030u.LJJIFFI(new AwS580S0100000_1(c7751030z, 900));
                }
                arrayList.add(c7751030z.LIZ);
                if (AnonymousClass0314.LIZ.orderSubmitEnable && C724902sJ.LIZ(c7751030z.LIZIZ)) {
                    ShippingAddress shippingAddress = c7750030y.LIZ;
                    if (shippingAddress != null && (address = shippingAddress.shippingAddress) != null) {
                        deliveryInstructionInfo = address.deliveryInstructionInfo;
                    }
                    arrayList.add(new C752402wk(deliveryInstructionInfo));
                }
                arrayList.add(new C7811033h(0.0f, R.attr.na, 4, "shipping_address", "shipping_address_bottom_span", true));
                return arrayList;
            }
        };
    }

    public static final Object invoke$87(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032P<C769302zT, InterfaceC769102zR>(str, str2) { // from class: X.02zS
            /* JADX WARN: Removed duplicated region for block: B:38:0x007e A[LOOP:0: B:36:0x0078->B:38:0x007e, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
            @Override // X.C032O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List LIZIZ(X.C770802zi r14, X.C033V r15) {
                /*
                    Method dump skipped, instruction units count: 277
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C769202zS.LIZIZ(X.02zi, X.033V):java.util.List");
            }
        };
    }

    public static final Object invoke$88(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        final String str = (String) obj;
        final String str2 = (String) obj2;
        return new C032O<C7758031g>(str, str2) { // from class: X.031Y
            @Override // X.C032O
            public final List LIZIZ(C770802zi c770802zi, C033V c033v) {
                BillStarlingText billStarlingText;
                C7758031g c7758031g = (C7758031g) c033v;
                if (!c770802zi.LIZIZ.LJJ()) {
                    return C13BV.INSTANCE;
                }
                BillInfoData billInfoData = c7758031g.LIZ;
                if (billInfoData == null) {
                    return C13BV.INSTANCE;
                }
                ExposeUserRightPanel exposeUserRightPanel = billInfoData.userRightModuleInfo;
                if (exposeUserRightPanel == null) {
                    return C13BV.INSTANCE;
                }
                String str3 = billInfoData.userBenefitDrawSchema;
                BillStarling billStarling = billInfoData.starlingTexts;
                if (billStarling != null) {
                    billStarlingText = billStarling.userBenefitViewAll;
                } else {
                    billStarlingText = null;
                }
                return Collections.singletonList(new C757502xZ(exposeUserRightPanel, str3, billStarlingText));
            }
        };
    }

    public static final Object invoke$9(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        QuantityNoticeInfo quantityNoticeInfo;
        SkuCounterReusedAssem skuCounterReusedAssem = (SkuCounterReusedAssem) obj;
        Map map = (Map) obj2;
        TuxTextView tuxTextView = skuCounterReusedAssem.LLLI;
        QuantityNoticeInfo quantityNoticeInfo2 = null;
        if (tuxTextView != null) {
            if (map != null) {
                quantityNoticeInfo = (QuantityNoticeInfo) map.get(Integer.valueOf(C043T.BELOW_COUNTER.getValue()));
            } else {
                quantityNoticeInfo = null;
            }
            C7919037l.LIZ(tuxTextView, quantityNoticeInfo, "sku_notice_below_counter");
        }
        TuxTextView tuxTextView2 = skuCounterReusedAssem.LLLFZ;
        if (tuxTextView2 != null) {
            if (map != null) {
                quantityNoticeInfo2 = (QuantityNoticeInfo) map.get(Integer.valueOf(C043T.RIGHT_OF_QUANTITY.getValue()));
            }
            C7919037l.LIZ(tuxTextView2, quantityNoticeInfo2, "sku_notice_right_of_quantity");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AFwS284S0000000_1 aFwS284S0000000_1, Object obj, Object obj2) {
        return obj;
    }
}
