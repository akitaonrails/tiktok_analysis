package g1c;

import X.AbstractC1763110vyv;
import X.AbstractViewOnClickListenerC420730Ged;
import X.AnonymousClass0378;
import X.C03U5;
import X.C049Y;
import X.C059S;
import X.C0CPR;
import X.C0DHG;
import X.C0H1U;
import X.C0I7D;
import X.C0WZX;
import X.C1018503yZ;
import X.C1018703yb;
import X.C10508049a;
import X.C10516049i;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1163330gNX;
import X.C1166140gS4;
import X.C1323720kYE;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LP;
import X.C1508390pM5;
import X.C1537900q7g;
import X.C1541950qED;
import X.C15438062q;
import X.C1616806Us;
import X.C1717020uma;
import X.C1722180uuu;
import X.C1738910vLt;
import X.C1741890vQh;
import X.C1744460vUq;
import X.C1744610vV5;
import X.C1744680vVC;
import X.C1745060vVo;
import X.C1745180vW0;
import X.C1745290vWB;
import X.C1745480vWU;
import X.C1745680vWo;
import X.C1745770vWx;
import X.C1746060vXQ;
import X.C1746140vXY;
import X.C1746150vXZ;
import X.C1746710vYT;
import X.C1747440vZe;
import X.C1748260vay;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C1749160vcQ;
import X.C1750310veH;
import X.C1753110vin;
import X.C1753590vjZ;
import X.C1754070vkL;
import X.C1759890vtj;
import X.C1761890vwx;
import X.C1762490vxv;
import X.C1762730vyJ;
import X.C1763690vzr;
import X.C1763970w0J;
import X.C1765530w2p;
import X.C1765550w2r;
import X.C1765580w2u;
import X.C1766690w4h;
import X.C1767130w5P;
import X.C1773470wFd;
import X.C1773750wG5;
import X.C19719212De;
import X.C19EG;
import X.C19EH;
import X.C1AUJ;
import X.C1AUM;
import X.C20642515q3;
import X.C2097908Jt;
import X.C2204961BRm;
import X.C23250099c;
import X.C23271099x;
import X.C2327809Ae;
import X.C343970De7;
import X.C343980De8;
import X.C418440Gaw;
import X.C442101nn;
import X.C442201no;
import X.C5182020e;
import X.C631370Opb;
import X.C632670Orh;
import X.C684570QtD;
import X.C724240Sb0;
import X.C770702zh;
import X.C877103bl;
import X.C893803eS;
import X.C919503ib;
import X.C948503nH;
import X.C985403tE;
import X.EnumC1746650vYN;
import X.EnumC1751780vge;
import X.EnumC1754390vkr;
import X.EnumC1767180w5U;
import X.InterfaceC1631620sYq;
import X.InterfaceC1743730vTf;
import X.InterfaceC1744450vUp;
import X.InterfaceC1747130vZ9;
import X.InterfaceC1748810vbr;
import X.InterfaceC1753120vio;
import X.InterfaceC1753620vjc;
import X.InterfaceC1754200vkY;
import X.InterfaceC1763860w08;
import X.InterfaceC1765560w2s;
import X.ViewOnFocusChangeListenerC1730940v92;
import Y.ARunnableS95S0200000_26;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressLocation;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.MapLocateData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailActivity;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressMapEntryViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.OneSearchItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SearchInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SwitchInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.ThumbnailMapViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MoveReminderViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf.CpfCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.gift.SeaOneStepGiftFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.AgreementConfiguration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InitializeAgreementRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentGuideModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.desc.SeaProductSpecificationViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.desc.SeaSeeLessVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.header.SeaPdpHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBottomNavBarWidgetNew;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpCreatorSheetWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpFloatShopWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.UsHeaderVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselFindSimilarLabelAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells.PdpCarouselVideoReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpCreatorSheetWidget;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.RegionPicker;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.compliance.utils.ComplianceDialogActivity;
import com.ss.android.ugc.aweme.ecommerce.core.ab.AddressSearchMapConfig;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USDeleteButtonViewHolder;
import com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USSwitchInputItemVH;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayFragment;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.BillboardImagesFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.BillboardTemplateFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.FlashDealTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.TemplateEditBottomAreaAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist.BaseTemplateCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import defpackage.p0;
import eha.c;
import eha.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS141S1200000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS488S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import zga.b;

/* JADX INFO: loaded from: classes27.dex */
public class AjS70S0100000_26 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC420730Ged
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
            case 74:
                LIZ$74(this, view);
                break;
            case 75:
                LIZ$75(this, view);
                break;
            case 76:
                LIZ$76(this, view);
                break;
            case 77:
                LIZ$77(this, view);
                break;
            case 78:
                LIZ$78(this, view);
                break;
            case 79:
                LIZ$79(this, view);
                break;
            case 80:
                LIZ$80(this, view);
                break;
            case 81:
                LIZ$81(this, view);
                break;
            case 82:
                LIZ$82(this, view);
                break;
            case 83:
                LIZ$83(this, view);
                break;
            case 84:
                LIZ$84(this, view);
                break;
            case 85:
                LIZ$85(this, view);
                break;
            case 86:
                LIZ$86(this, view);
                break;
            case 87:
                LIZ$87(this, view);
                break;
            case 88:
                LIZ$88(this, view);
                break;
            case 89:
                LIZ$89(this, view);
                break;
            case 90:
                LIZ$90(this, view);
                break;
            case 91:
                LIZ$91(this, view);
                break;
            case 92:
                LIZ$92(this, view);
                break;
            case 93:
                LIZ$93(this, view);
                break;
            case 94:
                LIZ$94(this, view);
                break;
            case 95:
                LIZ$95(this, view);
                break;
            case 96:
                LIZ$96(this, view);
                break;
            case 97:
                LIZ$97(this, view);
                break;
            case 98:
                LIZ$98(this, view);
                break;
            case 99:
                LIZ$99(this, view);
                break;
            case 100:
                LIZ$100(this, view);
                break;
            case 101:
                LIZ$101(this, view);
                break;
            case 102:
                LIZ$102(this, view);
                break;
            case 103:
                LIZ$103(this, view);
                break;
            case 104:
                LIZ$104(this, view);
                break;
            case 105:
                LIZ$105(this, view);
                break;
            case 106:
                LIZ$106(this, view);
                break;
            case 107:
                LIZ$107(this, view);
                break;
            case 108:
                LIZ$108(this, view);
                break;
            case 109:
                LIZ$109(this, view);
                break;
            case 110:
                LIZ$110(this, view);
                break;
            case 111:
                LIZ$111(this, view);
                break;
            case 112:
                LIZ$112(this, view);
                break;
            case 113:
                LIZ$113(this, view);
                break;
            case 114:
                LIZ$114(this, view);
                break;
            case 115:
                LIZ$115(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS70S0100000_26(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((ECBaseSheetFragment) ajS70S0100000_26.l0).iS();
        }
    }

    public static final void LIZ$1(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            View.OnClickListener onClickListener = ((C1748260vay) ajS70S0100000_26.l0).LLJIJIL;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            C1748260vay c1748260vay = (C1748260vay) ajS70S0100000_26.l0;
            if (c1748260vay.LLJ == 1) {
                c1748260vay.getInputWithIndicatorEditTextFromXml().setText((CharSequence) null);
            }
        }
    }

    public static final void LIZ$10(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$100(AjS70S0100000_26 ajS70S0100000_26, View view) {
        String str;
        if (view != null && ((PdpCarouselVideoReusedAssem) ajS70S0100000_26.l0).Bp().LJI()) {
            if (((PdpCarouselVideoReusedAssem) ajS70S0100000_26.l0).Bp().isMute()) {
                ((PdpCarouselVideoReusedAssem) ajS70S0100000_26.l0).Bp().LJIIIIZZ();
            } else {
                ((PdpCarouselVideoReusedAssem) ajS70S0100000_26.l0).Bp().mute();
            }
            C1054004Ag c1054004Ag = ((PdpCarouselVideoReusedAssem) ajS70S0100000_26.l0).zp().lX().LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                String strIH1 = ((PdpCarouselVideoReusedAssem) ajS70S0100000_26.l0).zp().lX().iH1(null);
                if (((PdpCarouselVideoReusedAssem) ajS70S0100000_26.l0).Bp().isMute()) {
                    str = "unmute";
                } else {
                    str = "mute";
                }
                c1054004Ag.LJIJI(strIH1, str, ((C1761890vwx) C631370Opb.LIZ((PdpCarouselVideoReusedAssem) ajS70S0100000_26.l0)).LLILLL.daInfo);
            }
        }
    }

    public static final void LIZ$101(AjS70S0100000_26 ajS70S0100000_26, View view) throws Throwable {
        if (view != null) {
            Editable editableLLLLJI = C2204961BRm.LLLLJI((C0I7D) ((CpfCell) ajS70S0100000_26.l0).itemView.findViewById(R.id.hcd), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70x0q03LozzNkFmcbsUcvn1n6A=", null));
            if (editableLLLLJI != null) {
                editableLLLLJI.clear();
            }
            ((CpfCell) ajS70S0100000_26.l0).itemView.findViewById(R.id.hcd).clearFocus();
            ((CpfCell) ajS70S0100000_26.l0).N5().yT2(null);
        }
    }

    public static final void LIZ$102(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(((CpfCell) ajS70S0100000_26.l0).itemView.getContext());
            c1397580mTM.LJFF(2131832735);
            c1397580mTM.LIZ(2131832734);
            C985403tE.LIZ(c1397580mTM, new AwS605S0100000_26((CpfCell) ajS70S0100000_26.l0, 872));
            c1397580mTM.LJ(new AwS605S0100000_26((CpfCell) ajS70S0100000_26.l0, 873));
            new C1397510mTF(c1397580mTM).LIZLLL();
            C1748720vbi.LIZLLL(((CpfCell) ajS70S0100000_26.l0).itemView, new C049Y(), AFwS268S0000000_26.get$arr$(757));
        }
    }

    public static final void LIZ$103(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            Activity activityLIZ = C1388190mED.LIZ(view.getContext());
            if (activityLIZ != null) {
                PdpViewModel pdpViewModelLJIJI = ((PdpHeadNavBarWidget) ajS70S0100000_26.l0).LJIJI();
                pdpViewModelLJIJI.getClass();
                C948503nH.LJFF(pdpViewModelLJIJI, C23271099x.INSTANCE, new C1750310veH(pdpViewModelLJIJI, activityLIZ, null));
            }
            PdpHeadNavBarWidget pdpHeadNavBarWidget = (PdpHeadNavBarWidget) ajS70S0100000_26.l0;
            pdpHeadNavBarWidget.withState(pdpHeadNavBarWidget.LJIJI(), new AwS605S0100000_26(pdpHeadNavBarWidget, 901));
        }
    }

    public static final void LIZ$104(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((PdpHeadNavBarWidget) ajS70S0100000_26.l0).LJIJJ(view);
        }
    }

    public static final void LIZ$105(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((PdpHeadNavBarWidget) ajS70S0100000_26.l0).LJIJJ(view);
        }
    }

    public static final void LIZ$106(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1054004Ag c1054004Ag = ((PdpHeadNavBarWidget) ajS70S0100000_26.l0).LJIJI().LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                C1054004Ag.LJIILIIL(c1054004Ag, "close", null, null, null, 30);
            }
            ((PdpHeadNavBarWidget) ajS70S0100000_26.l0).LJIJI().pR2(C724240Sb0.LIZ(((PdpHeadNavBarWidget) ajS70S0100000_26.l0).LLJ), ((PdpHeadNavBarWidget) ajS70S0100000_26.l0).LLJ);
        }
    }

    public static final void LIZ$107(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLJJIJIL.LL = new ArrayList();
            ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLJJIJIL.notifyDataSetChanged();
            ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ().LLJILJILJ = true;
            ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ().LLILZLL = null;
            C0H1U.LIZIZ(((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLLZLLLI());
            C1748720vbi.LIZIZ((AddressEditDetailActivity) ajS70S0100000_26.l0, new C049Y(), AFwS268S0000000_26.get$arr$(776));
        }
    }

    public static final void LIZ$108(AjS70S0100000_26 ajS70S0100000_26, View view) {
        String str;
        String str2;
        AddressLocation addressLocation;
        String str3;
        Region region;
        String str4;
        String str5;
        String str6;
        HashMap<String, Object> mapLJIIJ;
        String str7;
        Object obj;
        Region region2;
        String str8;
        String str9;
        List<Region> list;
        Region regionPrevious;
        Address address;
        Region region3;
        if (view != null) {
            C1746060vXQ c1746060vXQ = ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLJJ;
            if (c1746060vXQ != null && (address = c1746060vXQ.LIZIZ) != null && (region3 = address.region) != null) {
                str = region3.code;
            } else {
                str = null;
            }
            Region regionLIZLLL = C1745180vW0.LIZLLL();
            if (regionLIZLLL != null) {
                str2 = regionLIZLLL.code;
            } else {
                str2 = null;
            }
            boolean z = true;
            if (!u.LJIJI(str, str2, true) || C0CPR.LIZ(str) || (!((AddressSearchMapConfig) C1746150vXZ.LIZIZ.getValue()).pinMovable && ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ().LLILZLL == null && ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ().LLIZLLLIL)) {
                AddressEditDetailViewModel addressEditDetailViewModelLLLZ = ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ();
                Address addressIR2 = addressEditDetailViewModelLLLZ.iR2(addressEditDetailViewModelLLLZ.FQ2().getInputItemVOList());
                if (addressIR2 != null) {
                    AnonymousClass0378.LIZ().LIZ("ec_change_address_on_edit_detail", C1741890vQh.LJIIIIZZ(addressIR2));
                }
                ((AddressEditDetailActivity) ajS70S0100000_26.l0).onBackPressed();
                return;
            }
            Address address2 = ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ().LLIZ;
            if ((address2 == null || address2.districts == null) && ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ().LLILZLL == null) {
                AddressEditDetailViewModel addressEditDetailViewModelLLLZ2 = ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ();
                Address addressIR22 = addressEditDetailViewModelLLLZ2.iR2(addressEditDetailViewModelLLLZ2.FQ2().getInputItemVOList());
                if (addressIR22 != null) {
                    AnonymousClass0378.LIZ().LIZ("ec_change_address_on_edit_detail", C1741890vQh.LJIIIIZZ(addressIR22));
                }
                ((AddressEditDetailActivity) ajS70S0100000_26.l0).onBackPressed();
                return;
            }
            InputItemData inputItemData = ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ().LLJIJIL;
            if (inputItemData == null || (addressLocation = inputItemData.addressLocation) == null || (str3 = addressLocation.addressMapSchema) == null) {
                return;
            }
            AddressEditDetailViewModel addressEditDetailViewModelLLLZ3 = ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ();
            Address addressIR23 = addressEditDetailViewModelLLLZ3.iR2(addressEditDetailViewModelLLLZ3.FQ2().getInputItemVOList());
            C1323720kYE.LIZ((AddressEditDetailActivity) ajS70S0100000_26.l0).LJIIIIZZ(C1741890vQh.LJIIIIZZ(C2097908Jt.LIZJ(new Pair("address", addressIR23))), "origin_district");
            Address address3 = ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ().LLIZ;
            if (address3 != null && (list = address3.districts) != null) {
                ListIterator<Region> listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        regionPrevious = listIterator.previous();
                        if (regionPrevious.latitude != null) {
                            break;
                        }
                    } else {
                        regionPrevious = null;
                        break;
                    }
                }
                region = regionPrevious;
            } else {
                region = null;
            }
            CandInputData candInputData = ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ().LLILZLL;
            if (candInputData == null || (str4 = candInputData.latitude) == null) {
                if (region != null) {
                    str4 = region.latitude;
                } else {
                    str4 = null;
                }
            }
            CandInputData candInputData2 = ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ().LLILZLL;
            if (candInputData2 == null || (str5 = candInputData2.longitude) == null) {
                if (region != null) {
                    str5 = region.longitude;
                } else {
                    str5 = null;
                }
            }
            CandInputData candInputData3 = ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ().LLILZLL;
            if (candInputData3 != null) {
                str6 = candInputData3.autocompleteAddressId;
            } else {
                str6 = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1746140vXY c1746140vXY = MapLocateData.Companion;
            String str10 = ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ().LLJJI;
            if (((AddressEditDetailActivity) ajS70S0100000_26.l0).LLLZ().LLILZLL == null) {
                z = false;
            }
            MapLocateData mapLocateData = new MapLocateData(str5, str4, addressIR23, str6, str10, null, C893803eS.LIZ(z), C893803eS.LIZ(((AddressSearchMapConfig) C1746150vXZ.LIZIZ.getValue()).pinMovable));
            c1746140vXY.getClass();
            HashMap map = new HashMap();
            String str11 = mapLocateData.longitude;
            String str12 = "";
            if (str11 == null) {
                str11 = "";
            }
            map.put("longitude", str11);
            String str13 = mapLocateData.latitude;
            if (str13 == null) {
                str13 = "";
            }
            map.put("latitude", str13);
            Object obj2 = mapLocateData.shippingAddress;
            if (obj2 == null) {
                obj2 = "";
            }
            map.put("shipping_address", obj2);
            String str14 = mapLocateData.autoCompleteAddressId;
            if (str14 == null) {
                str14 = "";
            }
            map.put("autocomplete_address_id", str14);
            String str15 = mapLocateData.sessionKey;
            if (str15 == null) {
                str15 = "";
            }
            map.put("sessionKey", str15);
            Object obj3 = mapLocateData.trackParams;
            if (obj3 == null) {
                obj3 = "";
            }
            map.put("trackParams", obj3);
            String str16 = mapLocateData.isRecommendDetailAddress;
            if (str16 == null) {
                str16 = "";
            }
            map.put("is_recommend_detail_address", str16);
            String str17 = mapLocateData.pinMovable;
            if (str17 != null) {
                str12 = str17;
            }
            map.put("pin_movable", str12);
            linkedHashMap.putAll(map);
            C1746060vXQ c1746060vXQ2 = ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLJJ;
            if (c1746060vXQ2 != null && (str9 = c1746060vXQ2.LIZLLL) != null) {
                mapLJIIJ = C1741890vQh.LJIIJ(str9);
            } else {
                mapLJIIJ = null;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
            linkedHashMap2.put("previous_page", "shipping_address");
            C1746060vXQ c1746060vXQ3 = ((AddressEditDetailActivity) ajS70S0100000_26.l0).LLJJ;
            if (c1746060vXQ3 != null && c1746060vXQ3.LIZIZ != null) {
                str7 = "edit";
            } else {
                str7 = "add";
            }
            linkedHashMap2.put("fill_type", str7);
            if (addressIR23 != null && (region2 = addressIR23.region) != null && (str8 = region2.code) != null) {
                linkedHashMap2.put("location", str8.toLowerCase(Locale.ROOT));
            }
            if (mapLJIIJ != null && (obj = mapLJIIJ.get("entrance_info")) != null) {
                linkedHashMap2.put("entrance_info", obj);
            }
            linkedHashMap.put("trackParams", linkedHashMap2);
            C919503ib.LIZIZ((AddressEditDetailActivity) ajS70S0100000_26.l0, str3, linkedHashMap, false).open();
            AddressEditDetailActivity addressEditDetailActivity = (AddressEditDetailActivity) ajS70S0100000_26.l0;
            addressEditDetailActivity.LLJILLL = "next";
            C1748720vbi.LIZIZ(addressEditDetailActivity, new C049Y(), AFwS268S0000000_26.get$arr$(777));
        }
    }

    public static final void LIZ$109(AjS70S0100000_26 ajS70S0100000_26, View view) {
        C1773750wG5 c1773750wG5;
        if (view != null && (c1773750wG5 = ((C1773470wFd) ajS70S0100000_26.l0).LLJJIJIL) != null) {
            c1773750wG5.invoke(-1, "load_more");
        }
    }

    public static final void LIZ$11(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function0) ajS70S0100000_26.l0).invoke();
        }
    }

    public static final void LIZ$110(AjS70S0100000_26 ajS70S0100000_26, View view) {
        C1773750wG5 c1773750wG5;
        if (view != null && (c1773750wG5 = ((C1773470wFd) ajS70S0100000_26.l0).LLJJIJIL) != null) {
            c1773750wG5.invoke(-1, "fail_retry");
        }
    }

    public static final void LIZ$111(AjS70S0100000_26 ajS70S0100000_26, View view) {
        GeneralPostPaymentAssem generalPostPaymentAssem;
        C1722180uuu c1722180uuuGo;
        String str;
        String str2;
        String str3;
        String str4;
        if (view != null && (c1722180uuuGo = (generalPostPaymentAssem = (GeneralPostPaymentAssem) ajS70S0100000_26.l0).Go()) != null) {
            if (!Intrinsics.LJFF(c1722180uuuGo.LLIZLLLIL, "VISA_PAYMENT_SIGNAL")) {
                generalPostPaymentAssem.Ho().LLILLL = "next";
                C877103bl.LJ("turn_on", generalPostPaymentAssem.Ho().LL);
            }
            GeneralPostPaymentGuideModel generalPostPaymentGuideModel = c1722180uuuGo.LLILZLL;
            if (generalPostPaymentGuideModel != null) {
                Fragment fragmentLJI = C724240Sb0.LJI(generalPostPaymentAssem);
                if (fragmentLJI != null) {
                    String str5 = TuxSheet._pnsPageId;
                    C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
                }
                String str6 = "";
                if (Intrinsics.LJFF(c1722180uuuGo.LLIZLLLIL, "VISA_PAYMENT_SIGNAL")) {
                    Object obj = generalPostPaymentAssem.Ho().LL.get("page_id");
                    if (!(obj instanceof String) || (str2 = (String) obj) == null) {
                        str2 = "authorize_payment_signal";
                    }
                    Object obj2 = generalPostPaymentAssem.Ho().LL.get("previous_page_id");
                    if ((obj2 instanceof String) && (str4 = (String) obj2) != null) {
                        str6 = str4;
                    } else {
                        Object obj3 = generalPostPaymentAssem.Ho().LL.get("previous_page");
                        if ((obj3 instanceof String) && (str3 = (String) obj3) != null) {
                            str6 = str3;
                        }
                    }
                    Map<String, Object> mapWQ2 = generalPostPaymentAssem.Ho().wQ2(str2, str6);
                    mapWQ2.put("button_id", "Continue");
                    C1018503yZ.LIZIZ("pipo_button_click", mapWQ2, true);
                    generalPostPaymentAssem.Ho().yQ2(generalPostPaymentGuideModel, "agree", c1722180uuuGo.LLIZLLLIL, new C5182020e(generalPostPaymentAssem, 643));
                    return;
                }
                GeneralPostPaymentAssemViewModel generalPostPaymentAssemViewModelHo = generalPostPaymentAssem.Ho();
                String str7 = c1722180uuuGo.LLILLL;
                if (str7 != null) {
                    str6 = str7;
                }
                String str8 = c1722180uuuGo.LLILZIL;
                String str9 = c1722180uuuGo.LLILZ;
                AgreementConfiguration agreementConfiguration = c1722180uuuGo.LLIZ;
                C442201no c442201no = new C442201no(generalPostPaymentGuideModel, generalPostPaymentAssem, c1722180uuuGo, view);
                C442101nn c442101nn = new C442101nn(generalPostPaymentGuideModel, generalPostPaymentAssem, view);
                String str10 = generalPostPaymentGuideModel.host;
                if (str10 == null || str10.length() == 0 || (str = generalPostPaymentGuideModel.token) == null || str.length() == 0) {
                    return;
                }
                C23250099c.LIZLLL(generalPostPaymentAssemViewModelHo.getAssemVMScope(), null, null, new C1717020uma(generalPostPaymentGuideModel, new InitializeAgreementRequest(str9, null, generalPostPaymentGuideModel.merchantId, str6, generalPostPaymentGuideModel.merchantUserId, "", str8, null, null, null, null, agreementConfiguration, null, null), c442201no, c442101nn, null), 3);
            }
        }
    }

    public static final void LIZ$112(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((InterfaceC1763860w08) ajS70S0100000_26.l0).Bz();
        }
    }

    public static final void LIZ$113(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((b) ajS70S0100000_26.l0).LL);
        }
    }

    public static final void LIZ$114(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((b) ajS70S0100000_26.l0).LL);
        }
    }

    public static final void LIZ$115(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((b) ajS70S0100000_26.l0).LL);
        }
    }

    public static final void LIZ$12(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF((SeaOneStepGiftFragment) ajS70S0100000_26.l0, C343970De7.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015f  */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$13(g1c.AjS70S0100000_26 r12, android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS70S0100000_26.LIZ$13(g1c.AjS70S0100000_26, android.view.View):void");
    }

    public static final void LIZ$14(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            SeaProductSpecificationViewHolder seaProductSpecificationViewHolder = (SeaProductSpecificationViewHolder) ajS70S0100000_26.l0;
            if (seaProductSpecificationViewHolder.LLJJJJJIL) {
                seaProductSpecificationViewHolder.h6();
            } else {
                seaProductSpecificationViewHolder.f6();
            }
            seaProductSpecificationViewHolder.LLJJJJJIL = !seaProductSpecificationViewHolder.LLJJJJJIL;
            C1748720vbi.LIZLLL(((SeaProductSpecificationViewHolder) ajS70S0100000_26.l0).itemView.findViewById(R.id.view_toggle_text), new C10516049i(), new AwS605S0100000_26((SeaProductSpecificationViewHolder) ajS70S0100000_26.l0, 204));
            ((SeaProductSpecificationViewHolder) ajS70S0100000_26.l0).i6();
        }
    }

    public static final void LIZ$15(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1748720vbi.LIZLLL(((SeaSeeLessVH) ajS70S0100000_26.l0).itemView, new C10516049i(), AFwS268S0000000_26.get$arr$(215));
            SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) ((SeaSeeLessVH) ajS70S0100000_26.l0).LLJJIJIL.getValue();
            seaPdpViewModel.LLLZI = false;
            seaPdpViewModel.setState(new AwS605S0100000_26(seaPdpViewModel, 650));
        }
    }

    public static final void LIZ$16(AjS70S0100000_26 ajS70S0100000_26, View view) {
        SellerInfo sellerInfo;
        View view2;
        Context context;
        String str;
        Float fLJIIIIZZ;
        StoreOfficialLabel storeOfficialLabel;
        if (view != null) {
            SeaPdpFloatShopWidget seaPdpFloatShopWidget = (SeaPdpFloatShopWidget) ajS70S0100000_26.l0;
            ProductPackStruct productPackStruct = ((SeaPdpViewModel) seaPdpFloatShopWidget.LLJ.getValue()).LLJIJIL;
            String str2 = null;
            if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null && (view2 = seaPdpFloatShopWidget.LLILZ) != null && (context = view2.getContext()) != null && (str = sellerInfo.shopLink) != null && !a0.LJJJIL(str)) {
                SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) seaPdpFloatShopWidget.LLJ.getValue();
                String str3 = sellerInfo.sellerId;
                String str4 = sellerInfo.rating;
                if (str4 != null) {
                    fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str4);
                } else {
                    fLJIIIIZZ = null;
                }
                StoreLabel storeLabel = sellerInfo.storeLabel;
                if (storeLabel != null && (storeOfficialLabel = storeLabel.officialLabel) != null) {
                    str2 = storeOfficialLabel.labelTypeStr;
                }
                SeaPdpViewModel.ZR2(seaPdpViewModel, context, str, str3, fLJIIIIZZ, "floating_window", str2, ((SeaPdpViewModel) seaPdpFloatShopWidget.LLJ.getValue()).Tg2(), null, null, null, null, null, null, null, EnumC1751780vge.SHOP_RECOMMEND, "c8498.d60354", null, 950144);
            }
        }
    }

    public static final void LIZ$17(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$18(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$19(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$2(AjS70S0100000_26 ajS70S0100000_26, View view) {
        Editable editableLLLLJI;
        if (view != null) {
            ((C1744460vUq) ajS70S0100000_26.l0).getSearchEditFromXml().setText("");
            for (InterfaceC1744450vUp interfaceC1744450vUp : (ArrayList) ((C1744460vUq) ajS70S0100000_26.l0).LLILLL) {
                C0I7D searchEditFromXml = ((C1744460vUq) ajS70S0100000_26.l0).getSearchEditFromXml();
                if (searchEditFromXml != null && (editableLLLLJI = C2204961BRm.LLLLJI(searchEditFromXml, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsD7eYi4WNqjSD+NfcDs7G6skoCS8=", null))) != null) {
                    editableLLLLJI.toString();
                }
                interfaceC1744450vUp.LJJIJIIJIL();
            }
        }
    }

    public static final void LIZ$20(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null && !((ShopTabOverlayActivity) ajS70S0100000_26.l0).isFinishing()) {
            ((ShopTabOverlayActivity) ajS70S0100000_26.l0).finish();
        }
    }

    public static final void LIZ$21(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((ShopTabOverlayFragment) ajS70S0100000_26.l0).finish();
        }
    }

    public static final void LIZ$22(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1616806Us.LIZ(new Bundle(), ((BillboardImagesFragment) ajS70S0100000_26.l0).getChildFragmentManager());
        }
    }

    public static final void LIZ$23(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((BillboardImagesFragment) ajS70S0100000_26.l0).MR().vQ2();
            BillboardImagesFragment billboardImagesFragment = (BillboardImagesFragment) ajS70S0100000_26.l0;
            View viewFindViewById = billboardImagesFragment.LLILLL;
            if (viewFindViewById == null) {
                View view2 = billboardImagesFragment.getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.i1p);
                } else {
                    viewFindViewById = null;
                }
                billboardImagesFragment.LLILLL = (FrameLayout) viewFindViewById;
                if (viewFindViewById == null) {
                    return;
                }
            }
            C0H1U.LIZIZ(viewFindViewById);
        }
    }

    public static final void LIZ$24(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1616806Us.LIZ(new Bundle(), ((BillboardTemplateFragment) ajS70S0100000_26.l0).getChildFragmentManager());
        }
    }

    public static final void LIZ$25(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((BillboardTemplateFragment) ajS70S0100000_26.l0).MR().vQ2();
            BillboardTemplateFragment billboardTemplateFragment = (BillboardTemplateFragment) ajS70S0100000_26.l0;
            View viewFindViewById = billboardTemplateFragment.LLILLL;
            if (viewFindViewById == null) {
                View view2 = billboardTemplateFragment.getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.i1p);
                } else {
                    viewFindViewById = null;
                }
                billboardTemplateFragment.LLILLL = (FrameLayout) viewFindViewById;
                if (viewFindViewById == null) {
                    return;
                }
            }
            C0H1U.LIZIZ(viewFindViewById);
        }
    }

    public static final void LIZ$26(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$27(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(((FlashDealTemplateEditAssem) ajS70S0100000_26.l0).LJJIJL());
            c1389890mGx.LJIIJ(C20642515q3.LJI(2131832718));
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZ$28(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(((FlashDealTemplateEditAssem) ajS70S0100000_26.l0).LJJIJL());
            c1389890mGx.LJIIJ(C20642515q3.LJI(2131832718));
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZ$29(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(((TemplateEditBottomAreaAssem) ajS70S0100000_26.l0).LJJIJL());
            c1389890mGx.LJIIJ(C20642515q3.LJI(2131832846));
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZ$3(AjS70S0100000_26 ajS70S0100000_26, View view) {
        Editable editableLLLLJI;
        if (view != null) {
            ((C1746710vYT) ajS70S0100000_26.l0).LIZIZ(false);
            for (InterfaceC1747130vZ9 interfaceC1747130vZ9 : (ArrayList) ((C1746710vYT) ajS70S0100000_26.l0).LLILZ) {
                C0I7D searchEditFromXml = ((C1746710vYT) ajS70S0100000_26.l0).getSearchEditFromXml();
                if (searchEditFromXml != null && (editableLLLLJI = C2204961BRm.LLLLJI(searchEditFromXml, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsD7eYi4WNqhSD+NfcDqLm/KtnAPUNgUI5K3KXERta", null))) != null) {
                    editableLLLLJI.toString();
                }
                interfaceC1747130vZ9.LJJIJIIJIL();
            }
        }
    }

    public static final void LIZ$30(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$31(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$32(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$33(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$34(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$35(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(((BaseTemplateCell) ajS70S0100000_26.l0).itemView);
            c1389890mGx.LJIIJ(C20642515q3.LJI(2131832846));
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZ$36(AjS70S0100000_26 ajS70S0100000_26, View view) {
        EnumC1754390vkr enumC1754390vkr;
        if (view != null) {
            SeaPdpViewModel seaPdpViewModelLJIIIIZZ = ((SeaPdpBottomNavBarWidgetNew) ajS70S0100000_26.l0).LJIIIIZZ();
            Context context = view.getContext();
            String strLJI = ((SeaPdpBottomNavBarWidgetNew) ajS70S0100000_26.l0).LJIIIIZZ().LLLLL.LJI("c3256.d5447", null);
            C03U5.LIZ(new AwS141S1200000_26(seaPdpViewModelLJIIIIZZ, context, strLJI, 9), C1388190mED.LIZ(context), null);
            C1054104Ah c1054104Ah = ((SeaPdpBottomNavBarWidgetNew) ajS70S0100000_26.l0).LJIIIIZZ().LLJLIL;
            if (c1054104Ah != null) {
                if (((SeaPdpBottomNavBarWidgetNew) ajS70S0100000_26.l0).LLJJJ > 0) {
                    enumC1754390vkr = EnumC1754390vkr.NUMBER;
                } else {
                    enumC1754390vkr = EnumC1754390vkr.NONE;
                }
                C1054104Ah.LJJI(c1054104Ah, "contact_seller", null, null, enumC1754390vkr.getValue(), Integer.valueOf(((SeaPdpBottomNavBarWidgetNew) ajS70S0100000_26.l0).LLJJJ), 6);
            }
            if (((SeaPdpBottomNavBarWidgetNew) ajS70S0100000_26.l0).LJIIIIZZ().jS2()) {
                AnonymousClass0378.LIZ().LIZ("ec_im_icon_click", "{}");
            }
        }
    }

    public static final void LIZ$37(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget = (SeaPdpCreatorSheetWidget) ajS70S0100000_26.l0;
            if (seaPdpCreatorSheetWidget.LLJLIL == 4 && seaPdpCreatorSheetWidget.LLJJIJIL.getState() == 4) {
                ((SeaPdpCreatorSheetWidget) ajS70S0100000_26.l0).LJIIIIZZ().HS2(3);
            }
            SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget2 = (SeaPdpCreatorSheetWidget) ajS70S0100000_26.l0;
            if (seaPdpCreatorSheetWidget2.LLJJL != null) {
                seaPdpCreatorSheetWidget2.LJI(new AwS570S0100000_26(seaPdpCreatorSheetWidget2, 1202));
                return;
            }
            seaPdpCreatorSheetWidget2.getClass();
            SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget3 = (SeaPdpCreatorSheetWidget) ajS70S0100000_26.l0;
            seaPdpCreatorSheetWidget3.LJI(new AwS570S0100000_26(seaPdpCreatorSheetWidget3, 1203));
        }
    }

    public static final void LIZ$38(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget = (SeaPdpCreatorSheetWidget) ajS70S0100000_26.l0;
            if (seaPdpCreatorSheetWidget.LLJLIL == 4 && seaPdpCreatorSheetWidget.LLJJIJIL.getState() == 4) {
                ((SeaPdpCreatorSheetWidget) ajS70S0100000_26.l0).LJIIIIZZ().HS2(3);
            }
            SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget2 = (SeaPdpCreatorSheetWidget) ajS70S0100000_26.l0;
            if (seaPdpCreatorSheetWidget2.LLJJL != null) {
                seaPdpCreatorSheetWidget2.LJI(new AwS570S0100000_26(seaPdpCreatorSheetWidget2, 1204));
                return;
            }
            seaPdpCreatorSheetWidget2.getClass();
            SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget3 = (SeaPdpCreatorSheetWidget) ajS70S0100000_26.l0;
            seaPdpCreatorSheetWidget3.LJI(new AwS570S0100000_26(seaPdpCreatorSheetWidget3, 1206));
        }
    }

    public static final void LIZ$39(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget = (SeaPdpCreatorSheetWidget) ajS70S0100000_26.l0;
            int i = SeaPdpCreatorSheetWidget.LLJLLL;
            seaPdpCreatorSheetWidget.LJI(null);
        }
    }

    public static final void LIZ$4(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((AddressAssociateFragment) ajS70S0100000_26.l0).ZR().iR2();
        }
    }

    public static final void LIZ$40(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            SeaPdpViewModel seaPdpViewModelLJIL = ((SeaPdpHeadNavBarWidget) ajS70S0100000_26.l0).LJIL();
            C1745060vVo.LIZ((SeaPdpHeadNavBarWidget) ajS70S0100000_26.l0);
            seaPdpViewModelLJIL.uR2(((SeaPdpHeadNavBarWidget) ajS70S0100000_26.l0).LLJ, true);
        }
    }

    public static final void LIZ$41(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            String str = ((SeaPdpCreatorSheetWidget) ajS70S0100000_26.l0).LLJLLIL;
            if (str != null && C770702zh.LIZIZ(str)) {
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget = (SeaPdpCreatorSheetWidget) ajS70S0100000_26.l0;
                seaPdpCreatorSheetWidget.getClass();
                C19EG c19egLIZ = C1745060vVo.LIZ(seaPdpCreatorSheetWidget);
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(str);
                c1537900q7g.getClass();
                new C1541950qED(c19egLIZ, sparkContext).LIZIZ();
            }
            C1748720vbi.LIZIZ(((SeaPdpCreatorSheetWidget) ajS70S0100000_26.l0).LLJ, new C1763970w0J(), AFwS268S0000000_26.get$arr$(496));
        }
    }

    public static final void LIZ$42(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((SeaPdpHeadNavBarWidget) ajS70S0100000_26.l0).LJJ(view);
        }
    }

    public static final void LIZ$43(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((SeaPdpHeadNavBarWidget) ajS70S0100000_26.l0).LJJ(view);
        }
    }

    public static final void LIZ$44(AjS70S0100000_26 ajS70S0100000_26, View view) {
        InterfaceC1631620sYq<? super View, ? super PdpComponentAction, ? super String, Unit> interfaceC1631620sYq;
        if (view != null && (interfaceC1631620sYq = ((C1759890vtj) ajS70S0100000_26.l0).LJ) != null) {
            interfaceC1631620sYq.invoke(view, null, null);
        }
    }

    public static final void LIZ$45(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((eha.a0) ajS70S0100000_26.l0).LL);
        }
    }

    public static final void LIZ$46(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((eha.a0) ajS70S0100000_26.l0).LL);
        }
    }

    public static final void LIZ$47(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((c) ajS70S0100000_26.l0).LL);
        }
    }

    public static final void LIZ$48(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((eha.a0) ajS70S0100000_26.l0).LL);
        }
    }

    public static final void LIZ$49(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((c) ajS70S0100000_26.l0).LL);
        }
    }

    public static final void LIZ$5(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((AddressMapEntryViewHolder) ajS70S0100000_26.l0).a6().LLJJIJIL.LJII("map_pin", null, ((AddressMapEntryViewHolder) ajS70S0100000_26.l0).a6().LLJJIJIIJIL, C2097908Jt.LIZJ(new Pair("address_authorization_type", C1745180vW0.LIZJ())));
            final AddressEditViewModel addressEditViewModelA6 = ((AddressMapEntryViewHolder) ajS70S0100000_26.l0).a6();
            final AddressEditFragment addressEditFragment = ((AddressMapEntryViewHolder) ajS70S0100000_26.l0).LLJILJILJ;
            addressEditViewModelA6.getClass();
            Context context = addressEditFragment.getContext();
            if (context != null) {
                if (!C1745180vW0.LJFF()) {
                    C1745180vW0.LJII(context, "shipping_address", "click", "shipping_address", new C1AUJ() { // from class: X.0vVv
                        @Override // X.C1AUJ
                        public final void LIZ() {
                            addressEditViewModelA6.wS2(true);
                            AddressEditViewModel addressEditViewModel = addressEditViewModelA6;
                            C1745480vWU c1745480vWU = addressEditViewModel.LLJJIJIL;
                            HashMap<String, Object> map = addressEditViewModel.LLJJIJIIJIL;
                            Pair[] pairArr = new Pair[2];
                            pairArr[0] = new Pair("address_authorization_type", C1745180vW0.LIZJ());
                            pairArr[1] = new Pair("click_area", C1745180vW0.LJ() ? "allow_while_using" : "allow_once");
                            c1745480vWU.LJIIJJI(true, map, "location_authorization", "map_pin", C2097608Jq.LJIIIIZZ(pairArr));
                            AddressEditViewModel addressEditViewModel2 = addressEditViewModelA6;
                            AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26(addressEditViewModel2, addressEditFragment, 218);
                            addressEditViewModel2.getClass();
                            AwS488S0200000_26 awS488S0200000_26 = new AwS488S0200000_26(addressEditViewModel2, (AddressEditViewModel) awS392S0200000_26, (Function1<? super Boolean, Unit>) 7);
                            CertProviderManagerKt.findCert("bpea-ecom_address_map_locate", 1476395008, "svfi");
                            try {
                                C1745180vW0.LIZ(null, awS488S0200000_26);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }

                        @Override // X.C1AUJ
                        public final void LIZIZ() {
                            AddressEditViewModel addressEditViewModel = addressEditViewModelA6;
                            addressEditViewModel.LLJJIJIL.LJIIJJI(false, addressEditViewModel.LLJJIJIIJIL, "location_authorization", "map_pin", C2097908Jt.LIZJ(new Pair("address_authorization_type", C1745180vW0.LIZJ())));
                        }

                        @Override // X.C1AUJ
                        public final void LIZJ(String str) {
                            AddressEditViewModel addressEditViewModel = addressEditViewModelA6;
                            addressEditViewModel.LLJJIJIL.LJIIJJI(false, addressEditViewModel.LLJJIJIIJIL, "location_authorization", "map_pin", C2097908Jt.LIZJ(new Pair("address_authorization_type", C1745180vW0.LIZJ())));
                        }
                    }, new C1AUM() { // from class: X.0vVu
                        @Override // X.C1AUM
                        public final void LIZ() {
                            AddressEditViewModel addressEditViewModel = addressEditViewModelA6;
                            C1745480vWU.LJIILIIL(8, addressEditViewModel.LLJJIJIL, "location_authorization", "map_pin", addressEditViewModel.LLJJIJIIJIL);
                        }
                    }, null);
                    return;
                }
                if (addressEditViewModelA6.LLLJ != null) {
                    addressEditViewModelA6.cS2(addressEditFragment);
                    return;
                }
                AwS488S0200000_26 awS488S0200000_26 = new AwS488S0200000_26(addressEditViewModelA6, (AddressEditViewModel) new AwS392S0200000_26(addressEditViewModelA6, addressEditFragment, 220), (Function1<? super Boolean, Unit>) 7);
                CertProviderManagerKt.findCert("bpea-ecom_address_map_locate", 1476395008, "svfi");
                try {
                    C1745180vW0.LIZ(null, awS488S0200000_26);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static final void LIZ$50(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$51(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((c) ajS70S0100000_26.l0).LL);
        }
    }

    public static final void LIZ$52(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$53(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$54(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$55(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$56(AjS70S0100000_26 ajS70S0100000_26, View view) {
        List<Region> list;
        String str;
        Object obj;
        String lowerCase;
        String str2;
        InputItemDTO inputItemDTO;
        Region region;
        String str3;
        List<Region> list2;
        if (view != null) {
            int i = 1;
            if (C1745770vWx.LIZ().regionSelectPageStyle == 1) {
                InputItemData inputItemData = ((k) ajS70S0100000_26.l0).LLILLL.LLJJJJ;
                if (inputItemData != null && (list2 = inputItemData.regionSelections) != null) {
                    if (!list2.isEmpty()) {
                        k kVar = (k) ajS70S0100000_26.l0;
                        FragmentManager fragmentManager = kVar.LLILLJJLI;
                        if (fragmentManager != null) {
                            AddressEditViewModel addressEditViewModel = kVar.LLILLL;
                            C1166140gS4.LIZ(new C1163330gNX(list2, addressEditViewModel.LLILZLL, addressEditViewModel.LLJJIJIIJIL), fragmentManager, new AwS605S0100000_26(kVar, 479));
                        }
                    } else {
                        return;
                    }
                }
            } else {
                InputItemData inputItemData2 = ((k) ajS70S0100000_26.l0).LLILLL.LLJJJJ;
                String string = null;
                if (inputItemData2 == null || (list = inputItemData2.regionSelections) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (Region region2 : list) {
                    arrayList.add(new District(region2.name, region2.geoNameId, region2.code, "", region2.districtKey, null, null, region2.longitude, region2.latitude, null, null));
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                k kVar2 = (k) ajS70S0100000_26.l0;
                FragmentManager fragmentManager2 = kVar2.LLILLJJLI;
                if (kVar2.LLILLL.LLLLL == EnumC1746650vYN.EDIT) {
                    str = "edit";
                } else {
                    str = "add";
                }
                AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(kVar2, 1234);
                AwS640S0100000_26 awS640S0100000_26 = new AwS640S0100000_26((k) ajS70S0100000_26.l0, 77);
                InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(((k) ajS70S0100000_26.l0).LL);
                C1745680vWo c1745680vWo = ((k) ajS70S0100000_26.l0).LLILZIL;
                if (c1745680vWo != null) {
                    obj = c1745680vWo.LIZIZ;
                } else {
                    obj = null;
                }
                if ((obj instanceof Region) && (region = (Region) obj) != null && (str3 = region.code) != null) {
                    lowerCase = str3.toLowerCase(Locale.ROOT);
                } else {
                    lowerCase = null;
                }
                k kVar3 = (k) ajS70S0100000_26.l0;
                ClientConfig clientConfig = kVar3.LLILLL.LLL;
                C1745680vWo c1745680vWo2 = kVar3.LLILZIL;
                if (c1745680vWo2 != null && (inputItemDTO = c1745680vWo2.LIZ) != null) {
                    str2 = inputItemDTO.key;
                } else {
                    str2 = null;
                }
                boolean zLIZ = C1744610vV5.LIZ(clientConfig, str2);
                AddressEditViewModel addressEditViewModel2 = ((k) ajS70S0100000_26.l0).LLILLL;
                Integer num = addressEditViewModel2.LLLIIL;
                if (addressEditViewModel2.LLLIIIIL == null) {
                    i = 0;
                }
                Integer numValueOf = Integer.valueOf(i);
                Context context = ((k) ajS70S0100000_26.l0).LL.getContext();
                if (context != null) {
                    string = context.getString(2131832704);
                }
                C1744610vV5.LIZIZ(1, null, null, 1, fragmentManager2, str, awS570S0100000_26, awS640S0100000_26, null, null, null, null, interfaceC1748810vbrLIZ, lowerCase, null, null, null, null, zLIZ, num, numValueOf, null, null, null, arrayList, string, 59727373);
            }
            AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
            if (addressEditFragment != null) {
                C1748720vbi.LIZIZ(addressEditFragment, new C10508049a(), new AwS605S0100000_26((k) ajS70S0100000_26.l0, 480));
            }
            ((k) ajS70S0100000_26.l0).LIZJ();
        }
    }

    public static final void LIZ$57(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((k) ajS70S0100000_26.l0).LL);
        }
    }

    public static final void LIZ$58(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((k) ajS70S0100000_26.l0).LL);
        }
    }

    public static final void LIZ$59(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((k) ajS70S0100000_26.l0).LL);
        }
    }

    public static final void LIZ$6(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1748720vbi.LIZLLL(((SearchInputItemViewHolder) ajS70S0100000_26.l0).itemView, new C049Y(), AFwS268S0000000_26.get$arr$(163));
            ((SearchInputItemViewHolder) ajS70S0100000_26.l0).b6(false);
            ((SearchInputItemViewHolder) ajS70S0100000_26.l0).LJLZ();
            AddressEditViewModel addressEditViewModelA6 = ((SearchInputItemViewHolder) ajS70S0100000_26.l0).a6();
            Boolean bool = Boolean.FALSE;
            AddressEditViewModel.zR2(addressEditViewModelA6, 0, bool, bool, null, null, 24);
        }
    }

    public static final void LIZ$60(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1748720vbi.LIZLLL(((SeaPdpHeadViewHolder) ajS70S0100000_26.l0).itemView, new C049Y(), new AwS605S0100000_26((SeaPdpHeadViewHolder) ajS70S0100000_26.l0, 488));
            if (((SeaPdpHeadViewHolder) ajS70S0100000_26.l0).v6().LJI()) {
                if (((SeaPdpHeadViewHolder) ajS70S0100000_26.l0).v6().isMute()) {
                    SeaPdpHeadViewHolder seaPdpHeadViewHolder = (SeaPdpHeadViewHolder) ajS70S0100000_26.l0;
                    seaPdpHeadViewHolder.LLL = true;
                    seaPdpHeadViewHolder.v6().LJIIIIZZ();
                    ((SeaPdpHeadViewHolder) ajS70S0100000_26.l0).v6().getClass();
                    C1508390pM5.LJII();
                    return;
                }
                SeaPdpHeadViewHolder seaPdpHeadViewHolder2 = (SeaPdpHeadViewHolder) ajS70S0100000_26.l0;
                seaPdpHeadViewHolder2.LLL = false;
                seaPdpHeadViewHolder2.v6().mute();
                ((SeaPdpHeadViewHolder) ajS70S0100000_26.l0).v6().getClass();
                C1508390pM5.LJIILJJIL();
            }
        }
    }

    public static final void LIZ$61(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ComplianceDialogActivity complianceDialogActivity = (ComplianceDialogActivity) ajS70S0100000_26.l0;
            complianceDialogActivity.LLJJIJI = true;
            complianceDialogActivity.LLJJIJIIJIL = 1;
            complianceDialogActivity.finish();
        }
    }

    public static final void LIZ$62(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ComplianceDialogActivity complianceDialogActivity = (ComplianceDialogActivity) ajS70S0100000_26.l0;
            complianceDialogActivity.LLJJIJI = true;
            complianceDialogActivity.LLJJIJIIJIL = 2;
            complianceDialogActivity.finish();
        }
    }

    public static final void LIZ$63(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ComplianceDialogActivity complianceDialogActivity = (ComplianceDialogActivity) ajS70S0100000_26.l0;
            complianceDialogActivity.LLJJIJI = true;
            complianceDialogActivity.LLJJIJIIJIL = 4;
            complianceDialogActivity.finish();
        }
    }

    public static final void LIZ$64(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ComplianceDialogActivity complianceDialogActivity = (ComplianceDialogActivity) ajS70S0100000_26.l0;
            complianceDialogActivity.LLJJIJI = true;
            complianceDialogActivity.LLJJIJIIJIL = 3;
            complianceDialogActivity.finish();
        }
    }

    public static final void LIZ$65(AjS70S0100000_26 ajS70S0100000_26, View view) {
        String str;
        if (view != null) {
            AwS427S0200000_26 awS427S0200000_26 = ((MoveReminderViewHolder) ajS70S0100000_26.l0).L5().LLJILLL;
            if (awS427S0200000_26 != null) {
                awS427S0200000_26.invoke();
            }
            C1767130w5P c1767130w5P = C1767130w5P.LIZ;
            EnumC1767180w5U enumC1767180w5U = EnumC1767180w5U.CLICK_CLOSE_BUTTON;
            C1738910vLt c1738910vLt = ((MoveReminderViewHolder) ajS70S0100000_26.l0).L5().LLIZLLLIL;
            if (c1738910vLt != null) {
                str = c1738910vLt.LLIZ;
            } else {
                str = null;
            }
            c1767130w5P.getClass();
            C1767130w5P.LIZIZ(enumC1767180w5U, false, str);
        }
    }

    public static final void LIZ$66(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((OneSearchItemViewHolder) ajS70S0100000_26.l0).itemView);
        }
    }

    public static final void LIZ$67(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((OneSearchItemViewHolder) ajS70S0100000_26.l0).itemView);
        }
    }

    public static final void LIZ$68(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((PhoneInputItemViewHolder) ajS70S0100000_26.l0).itemView);
        }
    }

    public static final void LIZ$69(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((PhoneInputItemViewHolder) ajS70S0100000_26.l0).itemView);
        }
    }

    public static final void LIZ$7(AjS70S0100000_26 ajS70S0100000_26, View view) {
        String strLJIIIIZZ;
        C19EH c19ehLJIIJ;
        if (view != null) {
            ((ThumbnailMapViewHolder) ajS70S0100000_26.l0).a6().LLLJL = true;
            AddressEditViewModel addressEditViewModelA6 = ((ThumbnailMapViewHolder) ajS70S0100000_26.l0).a6();
            AddressEditFragment addressEditFragment = ((ThumbnailMapViewHolder) ajS70S0100000_26.l0).LLJILJILJ;
            addressEditViewModelA6.getClass();
            Integer numValueOf = Integer.valueOf(addressEditFragment.getId());
            if (numValueOf != null) {
                numValueOf.intValue();
                Address addressTR2 = addressEditViewModelA6.tR2(addressEditViewModelA6.XR2(), true);
                HashMap<String, Object> map = addressEditViewModelA6.LLJJIJIIJIL;
                if (map != null) {
                    strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map);
                } else {
                    strLJIIIIZZ = null;
                }
                AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams = new AddressPageStarter.AddressMapDetailEnterParams((Integer) 1, (Integer) 1, addressTR2, strLJIIIIZZ, "shipping_address", "shipping_address", (String) null, (Integer) null, (Address) null, (String) null, numValueOf, Integer.valueOf(addressEditViewModelA6.LLLLLIL ? 1 : 0), (List) addressEditViewModelA6.LLJJIII, 3008);
                AddressMapDetailFragment addressMapDetailFragment = new AddressMapDetailFragment();
                addressMapDetailFragment.LLILZIL = addressMapDetailEnterParams;
                addressMapDetailFragment.LLJLL = new AwS570S0100000_26(addressEditFragment, 1571);
                FragmentManager fragmentManagerDS = addressEditFragment.dS();
                if (fragmentManagerDS != null && (c19ehLJIIJ = fragmentManagerDS.LJIIJ()) != null) {
                    c19ehLJIIJ.LIZJ(numValueOf.intValue(), addressMapDetailFragment, "address_map_detail_fragment");
                    c19ehLJIIJ.LJII("address_map_detail_fragment");
                    c19ehLJIIJ.LJIIJ();
                }
            }
            C1745480vWU c1745480vWU = ((ThumbnailMapViewHolder) ajS70S0100000_26.l0).a6().LLJJIJIL;
            HashMap<String, Object> map2 = ((ThumbnailMapViewHolder) ajS70S0100000_26.l0).a6().LLJJIJIIJIL;
            c1745480vWU.getClass();
            AddressEditFragment addressEditFragment2 = AddressEditFragment.LLLII;
            if (addressEditFragment2 != null) {
                C1748720vbi.LIZIZ(addressEditFragment2, new C10516049i(), new AwS580S0100000_1((HashMap) map2, (HashMap<String, Object>) 930));
            }
            AddressEditFragment addressEditFragment3 = AddressEditFragment.LLLII;
            if (addressEditFragment3 != null) {
                C1748720vbi.LIZIZ(addressEditFragment3, new C10508049a(), new AwS605S0100000_26((ThumbnailMapViewHolder) ajS70S0100000_26.l0, 175));
            }
        }
    }

    public static final void LIZ$70(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((PhoneInputItemViewHolder) ajS70S0100000_26.l0).itemView);
        }
    }

    public static final void LIZ$71(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((SearchInputItemViewHolder) ajS70S0100000_26.l0).itemView);
        }
    }

    public static final void LIZ$72(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((SearchInputItemViewHolder) ajS70S0100000_26.l0).itemView);
        }
    }

    public static final void LIZ$73(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((SwitchInputItemViewHolder) ajS70S0100000_26.l0).itemView);
        }
    }

    public static final void LIZ$74(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((InterfaceC1763860w08) ajS70S0100000_26.l0).Bz();
        }
    }

    public static final void LIZ$75(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function0) ajS70S0100000_26.l0).invoke();
        }
    }

    public static final void LIZ$76(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function0) ajS70S0100000_26.l0).invoke();
        }
    }

    public static final void LIZ$77(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJ((C1749160vcQ) ajS70S0100000_26.l0, C343980De8.LIZ);
        }
    }

    public static final void LIZ$78(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1753110vin c1753110vin = (C1753110vin) ajS70S0100000_26.l0;
            ViewPropertyAnimator viewPropertyAnimator = c1753110vin.LLILLJJLI;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            c1753110vin.LLILLJJLI = null;
            C1753110vin c1753110vin2 = (C1753110vin) ajS70S0100000_26.l0;
            if (!c1753110vin2.LLILLL) {
                ViewPropertyAnimator viewPropertyAnimatorWithEndAction = c1753110vin2.animate().translationX(-(C418440Gaw.LIZIZ(Integer.valueOf(c1753110vin2.LLILZ)) + C418440Gaw.LIZIZ(18))).setDuration(200L).setStartDelay(0L).withEndAction(new ARunnableS95S0200000_26(c1753110vin2, new AwS570S0100000_26(c1753110vin2, 1384), 33));
                c1753110vin2.LLILLJJLI = viewPropertyAnimatorWithEndAction;
                if (viewPropertyAnimatorWithEndAction != null) {
                    viewPropertyAnimatorWithEndAction.start();
                    return;
                }
                return;
            }
            InterfaceC1753120vio interfaceC1753120vio = c1753110vin2.LL;
            if (interfaceC1753120vio == null) {
                return;
            }
            interfaceC1753120vio.LIZ();
        }
    }

    public static final void LIZ$79(AjS70S0100000_26 ajS70S0100000_26, View view) {
        InterfaceC1753620vjc interfaceC1753620vjc;
        if (view != null && (interfaceC1753620vjc = ((C1753590vjZ) ajS70S0100000_26.l0).LJFF) != null) {
            interfaceC1753620vjc.LIZIZ();
        }
    }

    public static final void LIZ$8(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function0) ajS70S0100000_26.l0).invoke();
        }
    }

    public static final void LIZ$80(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((ViewOnFocusChangeListenerC1730940v92) ajS70S0100000_26.l0).getEtInputFromXml().setText("");
        }
    }

    public static final void LIZ$81(AjS70S0100000_26 ajS70S0100000_26, View view) {
        p0 p0Var;
        InterfaceC1743730vTf interfaceC1743730vTf;
        if (view != null && (interfaceC1743730vTf = (p0Var = (p0) ajS70S0100000_26.l0).LL) != null) {
            interfaceC1743730vTf.LIZ(p0Var.getLayoutPosition());
        }
    }

    public static final void LIZ$82(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            PdpCreatorSheetWidget pdpCreatorSheetWidget = (PdpCreatorSheetWidget) ajS70S0100000_26.l0;
            if (pdpCreatorSheetWidget.LLJLIL == 4 && pdpCreatorSheetWidget.LLJJIJIL.getState() == 4) {
                ((PdpCreatorSheetWidget) ajS70S0100000_26.l0).LJIIIIZZ().vS2(3);
            }
            PdpCreatorSheetWidget pdpCreatorSheetWidget2 = (PdpCreatorSheetWidget) ajS70S0100000_26.l0;
            if (pdpCreatorSheetWidget2.LLJJL != null) {
                pdpCreatorSheetWidget2.LJI(new AwS570S0100000_26(pdpCreatorSheetWidget2, 1476));
                return;
            }
            pdpCreatorSheetWidget2.getClass();
            PdpCreatorSheetWidget pdpCreatorSheetWidget3 = (PdpCreatorSheetWidget) ajS70S0100000_26.l0;
            pdpCreatorSheetWidget3.LJI(new AwS570S0100000_26(pdpCreatorSheetWidget3, 1477));
        }
    }

    public static final void LIZ$83(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            PdpCreatorSheetWidget pdpCreatorSheetWidget = (PdpCreatorSheetWidget) ajS70S0100000_26.l0;
            if (pdpCreatorSheetWidget.LLJLIL == 4 && pdpCreatorSheetWidget.LLJJIJIL.getState() == 4) {
                ((PdpCreatorSheetWidget) ajS70S0100000_26.l0).LJIIIIZZ().vS2(3);
            }
            PdpCreatorSheetWidget pdpCreatorSheetWidget2 = (PdpCreatorSheetWidget) ajS70S0100000_26.l0;
            if (pdpCreatorSheetWidget2.LLJJL != null) {
                pdpCreatorSheetWidget2.LJI(new AwS570S0100000_26(pdpCreatorSheetWidget2, 1478));
                return;
            }
            pdpCreatorSheetWidget2.getClass();
            PdpCreatorSheetWidget pdpCreatorSheetWidget3 = (PdpCreatorSheetWidget) ajS70S0100000_26.l0;
            pdpCreatorSheetWidget3.LJI(new AwS570S0100000_26(pdpCreatorSheetWidget3, 1479));
        }
    }

    public static final void LIZ$84(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            PdpCreatorSheetWidget pdpCreatorSheetWidget = (PdpCreatorSheetWidget) ajS70S0100000_26.l0;
            int i = PdpCreatorSheetWidget.LLJLLIL;
            pdpCreatorSheetWidget.LJI(null);
        }
    }

    public static final void LIZ$85(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            String str = ((PdpCreatorSheetWidget) ajS70S0100000_26.l0).LLJLL;
            if (str != null && C770702zh.LIZIZ(str)) {
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                PdpCreatorSheetWidget pdpCreatorSheetWidget = (PdpCreatorSheetWidget) ajS70S0100000_26.l0;
                pdpCreatorSheetWidget.getClass();
                C19EG c19egLIZ = C1745060vVo.LIZ(pdpCreatorSheetWidget);
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(str);
                c1537900q7g.getClass();
                new C1541950qED(c19egLIZ, sparkContext).LIZIZ();
            }
            C1748720vbi.LIZIZ(((PdpCreatorSheetWidget) ajS70S0100000_26.l0).LLJ, new C1763970w0J(), AFwS268S0000000_26.get$arr$(645));
        }
    }

    public static final void LIZ$86(AjS70S0100000_26 ajS70S0100000_26, View view) {
        String str;
        if (view != null) {
            ((AddressMapDetailFragment) ajS70S0100000_26.l0).ZR().kR2(((AddressMapDetailFragment) ajS70S0100000_26.l0).LLJ);
            C1747440vZe.LIZ().LIZ(((AddressMapDetailFragment) ajS70S0100000_26.l0).ZR().LLIZ, null, "latitude_longitude", null, null, null, null, null);
            AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams = ((AddressMapDetailFragment) ajS70S0100000_26.l0).ZR().LLILZIL;
            if (addressMapDetailEnterParams != null) {
                str = addressMapDetailEnterParams.previousPage;
            } else {
                str = null;
            }
            C1745290vWB.LIZIZ(str, "confirm");
        }
    }

    public static final void LIZ$87(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((AddressMapDetailFragment) ajS70S0100000_26.l0).ZR().kR2(((AddressMapDetailFragment) ajS70S0100000_26.l0).LLJ);
            String str = null;
            if (((AddressMapDetailFragment) ajS70S0100000_26.l0).ZR().LLIZ == null) {
                ((AddressMapDetailFragment) ajS70S0100000_26.l0).aS(2);
            } else {
                AddressMapDetailViewModel addressMapDetailViewModelZR = ((AddressMapDetailFragment) ajS70S0100000_26.l0).ZR();
                addressMapDetailViewModelZR.getClass();
                addressMapDetailViewModelZR.setState(AFwS268S0000000_26.get$arr$(651));
                C948503nH.LJFF(addressMapDetailViewModelZR, C23271099x.INSTANCE, new C1744680vVC(addressMapDetailViewModelZR, null));
            }
            AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams = ((AddressMapDetailFragment) ajS70S0100000_26.l0).ZR().LLILZIL;
            if (addressMapDetailEnterParams != null) {
                str = addressMapDetailEnterParams.previousPage;
            }
            C1745290vWB.LIZIZ(str, "save");
        }
    }

    public static final void LIZ$88(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            RegionPicker regionPicker = (RegionPicker) ajS70S0100000_26.l0;
            regionPicker.withState(regionPicker.PR(), new AwS605S0100000_26((RegionPicker) ajS70S0100000_26.l0, 740));
        }
    }

    public static final void LIZ$89(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((DistrictPage) ajS70S0100000_26.l0).SR().LLJL = 0;
            ((DistrictPage) ajS70S0100000_26.l0).SR().LLJJL = SystemClock.elapsedRealtime();
            DistrictPage districtPage = (DistrictPage) ajS70S0100000_26.l0;
            C948503nH.LJIIIIZZ(districtPage, new C059S(districtPage, null));
        }
    }

    public static final void LIZ$9(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((Function1) ajS70S0100000_26.l0).invoke(view);
        }
    }

    public static final void LIZ$90(AjS70S0100000_26 ajS70S0100000_26, View view) {
        InterfaceC1754200vkY interfaceC1754200vkY;
        if (view != null && (interfaceC1754200vkY = ((C1754070vkL) ajS70S0100000_26.l0).LJFF) != null) {
            interfaceC1754200vkY.onClick(view);
        }
    }

    public static final void LIZ$91(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            if (C0DHG.LIZ() && C1388190mED.LIZ(view.getContext()) != null) {
                C632670Orh.LIZIZ(view.getContext(), new C19719212De(835333560, new AwS668S0100000_19((USDeleteButtonViewHolder) ajS70S0100000_26.l0, 50), true));
            } else {
                C1397580mTM c1397580mTM = new C1397580mTM(view.getContext());
                c1397580mTM.LJFF(2131848082);
                c1397580mTM.LIZ(2131848081);
                C985403tE.LIZ(c1397580mTM, new AwS605S0100000_26((USDeleteButtonViewHolder) ajS70S0100000_26.l0, 763));
                c1397580mTM.LJII = true;
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
            C1745480vWU c1745480vWU = ((USDeleteButtonViewHolder) ajS70S0100000_26.l0).X5().LLJJIJIL;
            HashMap map = new HashMap();
            c1745480vWU.getClass();
            C1745480vWU.LIZJ("delete_address", null, map);
            InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(((USDeleteButtonViewHolder) ajS70S0100000_26.l0).itemView);
            if (interfaceC1748810vbrLIZ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLIZ, new C049Y(), new AwS605S0100000_26((USDeleteButtonViewHolder) ajS70S0100000_26.l0, 764));
            }
        }
    }

    public static final void LIZ$92(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            C1745180vW0.LJIIIZ(((USSwitchInputItemVH) ajS70S0100000_26.l0).itemView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$93(g1c.AjS70S0100000_26 r30, android.view.View r31) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS70S0100000_26.LIZ$93(g1c.AjS70S0100000_26, android.view.View):void");
    }

    public static final void LIZ$94(AjS70S0100000_26 ajS70S0100000_26, View view) throws JSONException {
        if (view != null) {
            C1763690vzr.LIZ(((UsHeaderVH) ajS70S0100000_26.l0).L6().LLLLLJLJLL, ((UsHeaderVH) ajS70S0100000_26.l0).itemView, "product_detail_header_images");
            C684570QtD c684570QtDV6 = ((UsHeaderVH) ajS70S0100000_26.l0).v6();
            if (c684570QtDV6 != null) {
                c684570QtDV6.LIZJ("find_similar_tab_click");
            }
        }
    }

    public static final void LIZ$95(AjS70S0100000_26 ajS70S0100000_26, View view) {
        String str;
        List<DynamicSellingPoint> list;
        DynamicSellingPoint dynamicSellingPoint;
        C1054004Ag c1054004Ag;
        IPdpStarter.PdpEnterParam pdpEnterParam;
        Map<String, Object> map;
        List<DynamicSellingPoint> list2;
        DynamicSellingPoint dynamicSellingPoint2;
        Integer num;
        List<DynamicSellingPoint> list3;
        DynamicSellingPoint dynamicSellingPoint3;
        String str2;
        List<DynamicSellingPoint> list4;
        if (view != null) {
            C1762490vxv c1762490vxv = (C1762490vxv) ajS70S0100000_26.l0;
            int i = c1762490vxv.LJFF - 1;
            DynamicSellingPointsBase dynamicSellingPointsBase = c1762490vxv.LIZ;
            if (dynamicSellingPointsBase != null && (list4 = dynamicSellingPointsBase.dynamicSellingPoints) != null && i >= list4.size()) {
                int size = list4.size();
                int i2 = i % size;
                i = i2 + (size & (((i2 ^ size) & ((-i2) | i2)) >> 31));
            }
            PdpViewModel pdpViewModel = ((C1762490vxv) ajS70S0100000_26.l0).LJII;
            if (pdpViewModel != null && (c1054004Ag = pdpViewModel.LLJLILLLLZIIL) != null) {
                HashMap map2 = new HashMap();
                map2.put("bubble_type", "selling_point");
                DynamicSellingPointsBase dynamicSellingPointsBase2 = ((C1762490vxv) ajS70S0100000_26.l0).LIZ;
                if (dynamicSellingPointsBase2 != null && (list3 = dynamicSellingPointsBase2.dynamicSellingPoints) != null && (dynamicSellingPoint3 = (DynamicSellingPoint) C13LP.LJJJLZIJ(i, list3)) != null && (str2 = dynamicSellingPoint3.bubbleTextType) != null) {
                    map2.put("bubble_text_type", str2);
                }
                DynamicSellingPointsBase dynamicSellingPointsBase3 = ((C1762490vxv) ajS70S0100000_26.l0).LIZ;
                if (dynamicSellingPointsBase3 != null && (list2 = dynamicSellingPointsBase3.dynamicSellingPoints) != null && (dynamicSellingPoint2 = (DynamicSellingPoint) C13LP.LJJJLZIJ(i, list2)) != null && (num = dynamicSellingPoint2.numInSellingPoint) != null) {
                    map2.put("num_in_selling_point", Integer.valueOf(num.intValue()));
                }
                map2.put("bubble_position", "pdp_headpic");
                PdpViewModel pdpViewModel2 = ((C1762490vxv) ajS70S0100000_26.l0).LJII;
                Object obj = null;
                if (pdpViewModel2 != null && (pdpEnterParam = pdpViewModel2.LLJI) != null && (map = pdpEnterParam.trackParams) != null) {
                    obj = map.get("previous_page");
                }
                if (!(obj instanceof String) || obj == null) {
                    obj = "";
                }
                map2.put("previous_page", obj);
                C1018703yb.LIZLLL("tiktokec_bubble_click", new AwS392S0200000_26(c1054004Ag, (C1054004Ag) map2, (HashMap<String, Object>) 251));
            }
            DynamicSellingPointsBase dynamicSellingPointsBase4 = ((C1762490vxv) ajS70S0100000_26.l0).LIZ;
            if (dynamicSellingPointsBase4 == null || (list = dynamicSellingPointsBase4.dynamicSellingPoints) == null || (dynamicSellingPoint = (DynamicSellingPoint) C13LP.LJJJLZIJ(i, list)) == null || (str = dynamicSellingPoint.description) == null) {
                str = " ";
            }
            C1762730vyJ c1762730vyJ = ((C1762490vxv) ajS70S0100000_26.l0).LIZIZ;
            if (c1762730vyJ != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(c1762730vyJ.getContext());
                c1397580mTM.LIZIZ(str);
                C985403tE.LIZ(c1397580mTM, AFwS268S0000000_26.get$arr$(708));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
        }
    }

    public static final void LIZ$96(AjS70S0100000_26 ajS70S0100000_26, View view) {
        InterfaceC1765560w2s interfaceC1765560w2s;
        if (view != null) {
            C1765530w2p c1765530w2p = (C1765530w2p) ajS70S0100000_26.l0;
            C1765550w2r[] c1765550w2rArr = c1765530w2p.LLJI;
            int i = c1765530w2p.LLJ;
            if (c1765550w2rArr[i].LIZ && (interfaceC1765560w2s = c1765530w2p.LLILLL) != null) {
                interfaceC1765560w2s.LIZ(view, (AbstractC1763110vyv) ListProtector.get(c1765530w2p.LLILLJJLI, i), ((C1765530w2p) ajS70S0100000_26.l0).LLJ);
            }
        }
    }

    public static final void LIZ$97(AjS70S0100000_26 ajS70S0100000_26, View view) throws JSONException {
        if (view != null) {
            C1763690vzr.LIZ(((PdpCarouselFindSimilarLabelAssem) ajS70S0100000_26.l0).sp().lX().LLLLLJLJLL, ((PdpCarouselFindSimilarLabelAssem) ajS70S0100000_26.l0).getContentView(), "product_detail_header_images");
            C684570QtD c684570QtD = ((PdpCarouselFindSimilarLabelAssem) ajS70S0100000_26.l0).LLJJLIIIJLLLLLLLZ;
            if (c684570QtD != null) {
                c684570QtD.LIZJ("find_similar_tab_click");
            }
        }
    }

    public static final void LIZ$98(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((C1766690w4h) ajS70S0100000_26.l0).setQuitType("close");
            TuxSheet tuxSheet = ((C1766690w4h) ajS70S0100000_26.l0).LLILZLL;
            if (tuxSheet != null) {
                tuxSheet.dismiss();
            }
        }
    }

    public static final void LIZ$99(AjS70S0100000_26 ajS70S0100000_26, View view) {
        if (view != null) {
            ((PdpCarouselVideoReusedAssem) ajS70S0100000_26.l0).yp().X3(((C1761890vwx) C631370Opb.LIZ((PdpCarouselVideoReusedAssem) ajS70S0100000_26.l0)).LL);
            if (!((PdpCarouselVideoReusedAssem) ajS70S0100000_26.l0).Bp().LJI() && ((C1761890vwx) C631370Opb.LIZ((PdpCarouselVideoReusedAssem) ajS70S0100000_26.l0)).LLILZIL) {
                C1765580w2u c1765580w2u = ((PdpCarouselVideoReusedAssem) ajS70S0100000_26.l0).LLJJLIIIJLLLLLLLZ;
                if (c1765580w2u != null) {
                    c1765580w2u.LIZLLL(0.0f);
                    return;
                }
                return;
            }
            ((PdpCarouselVideoReusedAssem) ajS70S0100000_26.l0).up().O2(((C1761890vwx) C631370Opb.LIZ((PdpCarouselVideoReusedAssem) ajS70S0100000_26.l0)).LL);
        }
    }
}
