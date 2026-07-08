package kotlin.jvm.internal;

import X.AbstractC1748750vbl;
import X.AbstractC1763110vyv;
import X.C00H3;
import X.C013C;
import X.C034S;
import X.C048W;
import X.C049Y;
import X.C09AY;
import X.C0WZX;
import X.C1010603xI;
import X.C10329042d;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1120604Zw;
import X.C1233040iBy;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1391600mJi;
import X.C1397620mTQ;
import X.C1397630mTR;
import X.C1397660mTU;
import X.C13LP;
import X.C1623606Xi;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C1708650uZ5;
import X.C1710320ubm;
import X.C1710340ubo;
import X.C1710350ubp;
import X.C1710360ubq;
import X.C1710390ubt;
import X.C1710780ucW;
import X.C1710790ucX;
import X.C1710810ucZ;
import X.C1710830ucb;
import X.C1710850ucd;
import X.C1718120uoM;
import X.C1718700upI;
import X.C1719780ur2;
import X.C1720190urh;
import X.C1720250urn;
import X.C1720970usx;
import X.C1721060ut6;
import X.C1721980uua;
import X.C1725070uzZ;
import X.C1725540v0K;
import X.C1741890vQh;
import X.C1745680vWo;
import X.C1748720vbi;
import X.C1753000vic;
import X.C1753650vjf;
import X.C1753660vjg;
import X.C1756520voI;
import X.C1756850vop;
import X.C1759880vti;
import X.C1761290vvz;
import X.C1761300vw0;
import X.C1761460vwG;
import X.C1761470vwH;
import X.C1762400vxm;
import X.C1762410vxn;
import X.C1762950vyf;
import X.C1762960vyg;
import X.C1762980vyi;
import X.C1763700vzs;
import X.C197039127h;
import X.C19EG;
import X.C1AQS;
import X.C2097608Jq;
import X.C214820195e;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C23250099c;
import X.C418440Gaw;
import X.C450720Hlu;
import X.C450740Hlw;
import X.C683480QrS;
import X.C703302op;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C808003Dq;
import X.C814420VxA;
import X.C893803eS;
import X.C957403oi;
import X.C977203ru;
import X.C987903td;
import X.DialogC1761330vw3;
import X.EnumC1235690iGF;
import X.EnumC1407150min;
import X.EnumC1710410ubv;
import X.EnumC1710440uby;
import X.EnumC1710490uc3;
import X.EnumC1721510utp;
import X.EnumC1749010vcB;
import X.EnumC1749060vcG;
import X.EnumC2005907tR;
import X.EnumC488160JCk;
import X.EnumC992960bwk;
import X.InterfaceC10458047c;
import X.InterfaceC1059280dfi;
import X.InterfaceC1718860upY;
import X.InterfaceC1719800ur4;
import X.InterfaceC1720050urT;
import X.InterfaceC1725110uzd;
import X.InterfaceC1748810vbr;
import X.InterfaceC1752840viM;
import X.InterfaceC1766140w3o;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import Y.ACListenerS90S0300000_26;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter;
import com.bytedance.pipo.stellar.base.fragment.StellarViewModel;
import com.bytedance.pipo.stellar.base.model.ButtonDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.ContainerCardDO;
import com.bytedance.pipo.stellar.base.model.TextDO;
import com.bytedance.pipo.stellar.base.model.prop.AccessoryDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.pipo.ttpay.onboarding.TTPayOnboardingAssem;
import com.bytedance.pipo.ttpay.recharge.RechargeAssem;
import com.bytedance.pipo.ttpay.recharge.RechargeViewmodel;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.ConfirmRegisterMobileResponse;
import com.ss.android.ugc.aweme.biz.wallet.network.model.Button;
import com.ss.android.ugc.aweme.biz.wallet.network.model.PopOutExtraInfo;
import com.ss.android.ugc.aweme.biz.wallet.network.model.PopOutInfo;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.bnpl.IBNPLService;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberAssem;
import com.ss.android.ugc.aweme.component.phone.change.consult.ConsultPhoneChangeDialogFragment;
import com.ss.android.ugc.aweme.component.phone.change.setting.PhoneSettingAssem;
import com.ss.android.ugc.aweme.component.register.BaseRegisterManager;
import com.ss.android.ugc.aweme.component.verify.pin.change.PinChangeViewAssem;
import com.ss.android.ugc.aweme.component.verify.pin.forgot.PinForgotViewAssem;
import com.ss.android.ugc.aweme.component.verify.pin.model.HintPageMsg;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressTipButton;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressValid;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressVerifyData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandDetailPlaceResponse;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.NoticeBubble;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundlePrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleSku;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExplainInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LiveInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpModuleHeader;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PhoneContact;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendFeedData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.topstoreidentity.UsPdpTopStoreIdentityModuleVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.topstoreidentity.UsPdpTopStoreIdentityVM;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTransData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCCardNumberElementViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCDateElementViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCNormalElementViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.errorsdk.ErrorActionButton;
import com.ss.android.ugc.aweme.pipo.errorsdk.ErrorActionUIData;
import com.ss.android.ugc.aweme.pipo.hybrid.retention.PipoRetentionButtonConfig;
import com.ss.android.ugc.aweme.pipo.hybrid.retention.PipoRetentionPopupConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public class AwS235S0300000_26 extends C09AY implements Function1 {
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
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case 43:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case 48:
                return invoke$48(this, obj);
            case 49:
                return invoke$49(this, obj);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            case 58:
                return invoke$58(this, obj);
            case 59:
                return invoke$59(this, obj);
            case 60:
                return invoke$60(this, obj);
            case 61:
                return invoke$61(this, obj);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj);
            case 63:
                return invoke$63(this, obj);
            case 64:
                return invoke$64(this, obj);
            case 65:
                return invoke$65(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS235S0300000_26 r7, java.lang.Object r8) {
        /*
            java.lang.Object r5 = r7.l0
            X.03ru r5 = (X.C977203ru) r5
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            java.lang.Object r6 = r7.l1
            X.0vti r6 = (X.C1759880vti) r6
            java.lang.Object r3 = r7.l2
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonStyle r3 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonStyle) r3
            r2 = 0
            if (r3 == 0) goto L4f
            com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor r1 = r3.backgroundColor
            if (r1 == 0) goto L4f
            android.content.Context r0 = r6.LIZ
            boolean r0 = X.C1744700vVE.LJ(r0, r2)
            if (r0 == 0) goto L4a
            java.lang.String r0 = r1.getDarkColor()
        L24:
            if (r0 == 0) goto L4f
            int r0 = X.C0HEZ.LIZIZ(r0)
        L2a:
            r4.setColor(r0)
            if (r3 == 0) goto L48
            java.lang.Integer r0 = r3.cornerRadius
            if (r0 == 0) goto L48
            int r0 = r0.intValue()
        L37:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            r4.setCornerRadius(r0)
            r5.setBackground(r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L48:
            r0 = 4
            goto L37
        L4a:
            java.lang.String r0 = r1.getColor()
            goto L24
        L4f:
            android.content.Context r1 = r6.LIZ
            r0 = 2131100571(0x7f06039b, float:1.7813527E38)
            int r0 = X.C0HEZ.LIZ(r0, r1)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS235S0300000_26.invoke$0(kotlin.jvm.internal.AwS235S0300000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        boolean z;
        String failReason;
        String value;
        String value2;
        HashMap<String, Object> mapLJIIJ;
        IdentityInfoOption identityInfoOption;
        IdentityInfoOption identityInfoOption2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", "confirm");
        laneParams.putAll(((CpfAssem) awS235S0300000_26.l0).Jo());
        EnumC1749060vcG enumC1749060vcG = (EnumC1749060vcG) awS235S0300000_26.l1;
        EnumC1749060vcG enumC1749060vcG2 = EnumC1749060vcG.SUCCESS;
        if (enumC1749060vcG == enumC1749060vcG2) {
            z = true;
        } else {
            z = false;
        }
        laneParams.plusAssign("is_success", C893803eS.LIZ(z));
        EnumC1749060vcG enumC1749060vcG3 = (EnumC1749060vcG) awS235S0300000_26.l1;
        String value3 = null;
        if (enumC1749060vcG3 != enumC1749060vcG2) {
            failReason = enumC1749060vcG3.getFailReason();
        } else {
            failReason = null;
        }
        laneParams.plusAssign("fail_reason", failReason);
        List<IdentityInfoOption> identityInfoOptions = ((IdentityInfoPanel) awS235S0300000_26.l2).getIdentityInfoOptions();
        if (identityInfoOptions != null && (identityInfoOption2 = (IdentityInfoOption) C13LP.LJJJLL(identityInfoOptions)) != null) {
            value = identityInfoOption2.getValue();
        } else {
            value = null;
        }
        laneParams.plusAssign("has_auto_input", Integer.valueOf(C703302op.LIZ(value) ? 1 : 0));
        IdentityInfoOption identityInfoOption3 = ((CpfAssem) awS235S0300000_26.l0).LLJILJIL;
        if (identityInfoOption3 != null) {
            value2 = identityInfoOption3.getValue();
        } else {
            value2 = null;
        }
        List<IdentityInfoOption> identityInfoOptions2 = ((IdentityInfoPanel) awS235S0300000_26.l2).getIdentityInfoOptions();
        if (identityInfoOptions2 != null && (identityInfoOption = (IdentityInfoOption) C13LP.LJJJLL(identityInfoOptions2)) != null) {
            value3 = identityInfoOption.getValue();
        }
        laneParams.plusAssign("is_same_auto", Integer.valueOf(Intrinsics.LJFF(value2, value3) ? 1 : 0));
        laneParams.plusAssign("tax_type", "CPF");
        String str = ((CpfAssem) awS235S0300000_26.l0).Go().trackParamsJson;
        if (str != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            laneParams.withNotCheckParams(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        Object obj2;
        Object next;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        Iterator it2 = ((List) awS235S0300000_26.l0).iterator();
        while (true) {
            obj2 = null;
            if (it2.hasNext()) {
                next = it2.next();
                Integer num = ((AddressTipButton) next).buttonType;
                if (num != null && num.intValue() == 2) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AddressTipButton addressTipButton = (AddressTipButton) next;
        String str = "";
        if (addressTipButton != null) {
            AddressEditFragment addressEditFragment = (AddressEditFragment) awS235S0300000_26.l1;
            AddressVerifyData addressVerifyData = (AddressVerifyData) awS235S0300000_26.l2;
            String str2 = addressTipButton.text;
            if (str2 == null) {
                str2 = "";
            }
            c1397620mTQ.LIZJ(0, str2, new AwS392S0200000_26(addressEditFragment, addressVerifyData, 28));
        }
        Iterator it3 = ((List) awS235S0300000_26.l0).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            Integer num2 = ((AddressTipButton) next2).buttonType;
            if (num2 != null && num2.intValue() == 1) {
                obj2 = next2;
                break;
            }
        }
        AddressTipButton addressTipButton2 = (AddressTipButton) obj2;
        if (addressTipButton2 != null) {
            AddressEditFragment addressEditFragment2 = (AddressEditFragment) awS235S0300000_26.l1;
            String str3 = addressTipButton2.text;
            if (str3 != null) {
                str = str3;
            }
            c1397620mTQ.LIZJ(1, str, new AwS605S0100000_26(addressEditFragment2, 164));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$11(kotlin.jvm.internal.AwS235S0300000_26 r47, java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS235S0300000_26.invoke$11(kotlin.jvm.internal.AwS235S0300000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$12(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        C1761290vvz c1761290vvzLIZ;
        ReviewTransData reviewTransData;
        C1761300vw0 c1761300vw0 = (C1761300vw0) obj;
        C1761290vvz c1761290vvz = c1761300vw0.LIZIZ;
        if (c1761290vvz != null) {
            EnumC1407150min enumC1407150min = (EnumC1407150min) awS235S0300000_26.l0;
            if (Intrinsics.LJFF((Boolean) awS235S0300000_26.l1, Boolean.TRUE)) {
                reviewTransData = (ReviewTransData) awS235S0300000_26.l2;
            } else {
                reviewTransData = c1761300vw0.LIZIZ.LJJIFFI;
            }
            c1761290vvzLIZ = C1761290vvz.LIZ(c1761290vvz, null, null, false, enumC1407150min, reviewTransData, 2097151999);
        } else {
            c1761290vvzLIZ = null;
        }
        return C1761300vw0.LIZ(c1761300vw0, c1761290vvzLIZ);
    }

    public static final Object invoke$13(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        int iIndexOf = ((List) awS235S0300000_26.l0).indexOf(obj) - 1;
        if (iIndexOf == -1) {
            ((Function1) awS235S0300000_26.l1).invoke(null);
        } else {
            ((Function1) awS235S0300000_26.l1).invoke(ListProtector.get((List) awS235S0300000_26.l2, iIndexOf));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        C214820195e c214820195e = (C214820195e) awS235S0300000_26.l0;
        Widget widget = (Widget) awS235S0300000_26.l1;
        c214820195e.LIZ(widget, viewGroup, ((InterfaceC1766140w3o) awS235S0300000_26.l2).LIZ(widget.LIZLLL(), viewGroup));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        PipoRetentionButtonConfig pipoRetentionButtonConfig = ((PipoRetentionPopupConfig) awS235S0300000_26.l0).primaryButton;
        String str = "";
        if (pipoRetentionButtonConfig != null) {
            C1725540v0K c1725540v0K = (C1725540v0K) awS235S0300000_26.l1;
            InterfaceC1059280dfi interfaceC1059280dfi = (InterfaceC1059280dfi) awS235S0300000_26.l2;
            String str2 = pipoRetentionButtonConfig.btnText;
            if (str2 == null) {
                str2 = "";
            }
            c1397620mTQ.LIZJ(0, str2, new AwS235S0300000_26(c1725540v0K, pipoRetentionButtonConfig, interfaceC1059280dfi, 16));
        }
        PipoRetentionButtonConfig pipoRetentionButtonConfig2 = ((PipoRetentionPopupConfig) awS235S0300000_26.l0).secondaryButton;
        if (pipoRetentionButtonConfig2 != null) {
            C1725540v0K c1725540v0K2 = (C1725540v0K) awS235S0300000_26.l1;
            InterfaceC1059280dfi interfaceC1059280dfi2 = (InterfaceC1059280dfi) awS235S0300000_26.l2;
            String str3 = pipoRetentionButtonConfig2.btnText;
            if (str3 != null) {
                str = str3;
            }
            c1397620mTQ.LIZJ(1, str, new AwS235S0300000_26(c1725540v0K2, pipoRetentionButtonConfig2, interfaceC1059280dfi2, 17));
        }
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        ((C1725540v0K) awS235S0300000_26.l0).LIZLLL((PipoRetentionButtonConfig) awS235S0300000_26.l1, ((C1397660mTU) obj).LIZ(), (InterfaceC1059280dfi) awS235S0300000_26.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        ((C1725540v0K) awS235S0300000_26.l0).LIZLLL((PipoRetentionButtonConfig) awS235S0300000_26.l1, ((C1397660mTU) obj).LIZ(), (InterfaceC1059280dfi) awS235S0300000_26.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        C1010603xI.LIZJ(laneParams, ((LiveInfo) awS235S0300000_26.l0).daInfo);
        Map<String, Object> mapXQ2 = ((UsPdpTopStoreIdentityVM) awS235S0300000_26.l1).xQ2((UsPdpTopStoreIdentityModuleVO) awS235S0300000_26.l2);
        if (mapXQ2 != null) {
            laneParams.putAll(C00H3.LIZ(mapXQ2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LJ(C1010603xI.LIZ(((LiveInfo) awS235S0300000_26.l0).daInfo));
        Map<String, Object> mapXQ2 = ((UsPdpTopStoreIdentityVM) awS235S0300000_26.l1).xQ2((UsPdpTopStoreIdentityModuleVO) awS235S0300000_26.l2);
        if (mapXQ2 != null) {
            c957403oi.LJ(C00H3.LIZ(mapXQ2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        ((RechargeViewmodel) awS235S0300000_26.l0).setState(new AwS392S0200000_26((EnumC488160JCk) awS235S0300000_26.l1, (EnumC1721510utp) awS235S0300000_26.l2, 6));
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        String str;
        Integer num = ((Button) awS235S0300000_26.l0).linkType;
        int type = EnumC992960bwk.LINK_TYPE_URL.getType();
        if (num != null && num.intValue() == type && (str = ((Button) awS235S0300000_26.l0).buttonLink) != null) {
            C19EG c19eg = (C19EG) awS235S0300000_26.l2;
            C1708650uZ5.LIZ.getClass();
            C1708650uZ5.LIZIZ(c19eg, str, null, null);
        }
        ((TTPayOnboardingAssem) awS235S0300000_26.l1).Zo().yQ2("phone_change_no_other_verification_method", "contact_us");
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        String str;
        Integer num = ((Button) awS235S0300000_26.l0).linkType;
        int type = EnumC992960bwk.LINK_TYPE_URL.getType();
        if (num != null && num.intValue() == type && (str = ((Button) awS235S0300000_26.l0).buttonLink) != null) {
            C19EG c19eg = (C19EG) awS235S0300000_26.l2;
            C1708650uZ5.LIZ.getClass();
            C1708650uZ5.LIZIZ(c19eg, str, null, null);
        }
        ((TTPayOnboardingAssem) awS235S0300000_26.l1).Zo().yQ2("phone_change_no_other_verification_method", "go_back");
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        Button button;
        Button button2;
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        PopOutInfo popOutInfo = ((WalletFlowDecision) awS235S0300000_26.l0).popOut;
        String str = "";
        if (popOutInfo != null && (button2 = popOutInfo.mainButton) != null) {
            TTPayOnboardingAssem tTPayOnboardingAssem = (TTPayOnboardingAssem) awS235S0300000_26.l1;
            C19EG c19eg = (C19EG) awS235S0300000_26.l2;
            Integer num = button2.displayType;
            int type = EnumC2005907tR.DISPLAY_TYPE_RED.getType();
            if (num != null && num.intValue() == type) {
                String str2 = button2.buttonText;
                if (str2 == null) {
                    str2 = "";
                }
                c1397630mTR.LIZJ(0, str2, new AwS235S0300000_26(button2, tTPayOnboardingAssem, c19eg, 20));
            } else {
                String str3 = button2.buttonText;
                if (str3 == null) {
                    str3 = "";
                }
                c1397630mTR.LIZJ(1, str3, new AwS605S0100000_26(tTPayOnboardingAssem, 524));
            }
        }
        PopOutInfo popOutInfo2 = ((WalletFlowDecision) awS235S0300000_26.l0).popOut;
        if (popOutInfo2 != null && (button = popOutInfo2.subButton) != null) {
            TTPayOnboardingAssem tTPayOnboardingAssem2 = (TTPayOnboardingAssem) awS235S0300000_26.l1;
            C19EG c19eg2 = (C19EG) awS235S0300000_26.l2;
            Integer num2 = button.displayType;
            int type2 = EnumC2005907tR.DISPLAY_TYPE_RED.getType();
            if (num2 != null && num2.intValue() == type2) {
                String str4 = button.buttonText;
                if (str4 != null) {
                    str = str4;
                }
                c1397630mTR.LIZJ(0, str, new AwS235S0300000_26(button, tTPayOnboardingAssem2, c19eg2, 21));
            } else {
                String str5 = button.buttonText;
                if (str5 != null) {
                    str = str5;
                }
                c1397630mTR.LIZJ(1, str, new AwS605S0100000_26(tTPayOnboardingAssem2, 525));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        Integer numLIZ;
        String str = (String) obj;
        PaymentOption paymentOption = ((CCDCCardNumberElementViewHolder) awS235S0300000_26.l0).N5().LLILZIL;
        int i = 0;
        int iIntValue = 19;
        if (paymentOption != null) {
            C1710850ucd c1710850ucd = (C1710850ucd) awS235S0300000_26.l1;
            C1710390ubt c1710390ubt = ((CCDCCardNumberElementViewHolder) awS235S0300000_26.l0).N5().LLILLL;
            if (c1710390ubt != null && (numLIZ = c1710390ubt.LIZ(((C1710340ubo) awS235S0300000_26.l2).LLILLL.LIZIZ, paymentOption)) != null) {
                iIntValue = numLIZ.intValue();
            }
            C1710790ucX c1710790ucX = c1710850ucd.LLJJIII;
            if (c1710790ucX != null) {
                int i2 = c1710790ucX.LLILLJJLI;
                int i3 = (iIntValue / i2) + iIntValue;
                if (iIntValue % i2 <= 0) {
                    i = 1;
                }
                c1710790ucX.LLILZ = i3 - i;
            }
        } else {
            C1710790ucX c1710790ucX2 = ((C1710850ucd) awS235S0300000_26.l1).LLJJIII;
            if (c1710790ucX2 != null) {
                int i4 = c1710790ucX2.LLILLJJLI;
                int i5 = (19 / i4) + 19;
                if (19 % i4 <= 0) {
                    i = 1;
                }
                c1710790ucX2.LLILZ = i5 - i;
            }
        }
        if (str.length() >= 15) {
            ((CCDCCardNumberElementViewHolder) awS235S0300000_26.l0).N5().KQ2(Collections.singletonList(EnumC1710490uc3.CARD_NUMBER), true, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        List<Element> list;
        Element next;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C2204961BRm.LLJILLL(((C1710810ucZ) awS235S0300000_26.l0).getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CA3zMRkEGe2F3/FRz8DHtueHA4i57+swHAT/GA9lW1CFSR8JdN8ApYd3r6q/ZJwhTVwGbWQ0EJZThBiA==", null)).toString(), new String[]{"/"}, 0, 6);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
        Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
        Element elementBQ2 = ((CCDCDateElementViewHolder) awS235S0300000_26.l1).N5().BQ2(((C1710350ubp) awS235S0300000_26.l2).LIZIZ());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : C1697810uHb.LJIIJJI(new Pair(EnumC1710490uc3.EXPIRATION_DATE_MONTH, objLJJJLZIJ), new Pair(EnumC1710490uc3.EXPIRATION_DATE_YEAR, objLJJJLZIJ2))) {
            if (elementBQ2 != null && (list = elementBQ2.subElementList) != null) {
                Iterator<Element> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LIZ() == pair.getFirst()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Element element = next;
                if (element != null) {
                    linkedHashMap.put(element.LIZ(), pair.getSecond());
                }
            }
        }
        ((CCDCDateElementViewHolder) awS235S0300000_26.l1).N5().JQ2(linkedHashMap);
        ((CCDCDateElementViewHolder) awS235S0300000_26.l1).N5().setState(new AwS32S0010000_18(((CCDCDateElementViewHolder) awS235S0300000_26.l1).N5().zQ2(), 13));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$25(kotlin.jvm.internal.AwS235S0300000_26 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS235S0300000_26.invoke$25(kotlin.jvm.internal.AwS235S0300000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$26(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        PaymentOption paymentOptionEQ2;
        List<? extends EnumC1710410ubv> listSingletonList;
        C1710360ubq c1710360ubq;
        C1710390ubt c1710390ubt;
        String str = (String) obj;
        C1710830ucb c1710830ucbLIZJ = null;
        if (((C1710780ucW) awS235S0300000_26.l0).getEleType() == EnumC1710490uc3.CVV) {
            if (((CCDCNormalElementViewHolder) awS235S0300000_26.l1).N5().LLILZIL != null) {
                paymentOptionEQ2 = ((CCDCNormalElementViewHolder) awS235S0300000_26.l1).N5().LLILZIL;
            } else {
                paymentOptionEQ2 = ((CCDCNormalElementViewHolder) awS235S0300000_26.l1).N5().EQ2();
                listSingletonList = Collections.singletonList(EnumC1710410ubv.REQUIRED);
                c1710360ubq = (C1710360ubq) awS235S0300000_26.l2;
                C1710320ubm c1710320ubm = c1710360ubq.LLILLL;
                if (paymentOptionEQ2 != null && (c1710390ubt = ((CCDCNormalElementViewHolder) awS235S0300000_26.l1).N5().LLILLL) != null) {
                    c1710830ucbLIZJ = c1710390ubt.LIZJ(c1710360ubq.LIZIZ(), paymentOptionEQ2, str, EnumC1710440uby.LOSE_FOCUS, listSingletonList);
                }
                c1710320ubm.LJFF = c1710830ucbLIZJ;
                return ((C1710360ubq) awS235S0300000_26.l2).LLILLL.LJFF;
            }
        } else {
            paymentOptionEQ2 = ((CCDCNormalElementViewHolder) awS235S0300000_26.l1).N5().EQ2();
        }
        listSingletonList = null;
        c1710360ubq = (C1710360ubq) awS235S0300000_26.l2;
        C1710320ubm c1710320ubm2 = c1710360ubq.LLILLL;
        if (paymentOptionEQ2 != null) {
            c1710830ucbLIZJ = c1710390ubt.LIZJ(c1710360ubq.LIZIZ(), paymentOptionEQ2, str, EnumC1710440uby.LOSE_FOCUS, listSingletonList);
        }
        c1710320ubm2.LJFF = c1710830ucbLIZJ;
        return ((C1710360ubq) awS235S0300000_26.l2).LLILLL.LJFF;
    }

    public static final Object invoke$27(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        String str;
        String str2;
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        C987903td c987903td = (C987903td) awS235S0300000_26.l0;
        Object objValueOf = null;
        if (c987903td != null) {
            str = c987903td.LIZ;
        } else {
            str = null;
        }
        laneParams.plusAssign("bizTypeDiff", Integer.valueOf(!Intrinsics.LJFF(str, ((C987903td) awS235S0300000_26.l1).LIZ) ? 1 : 0));
        C987903td c987903td2 = (C987903td) awS235S0300000_26.l0;
        if (c987903td2 != null) {
            str2 = c987903td2.LIZIZ;
        } else {
            str2 = null;
        }
        laneParams.plusAssign("templateDiff", Integer.valueOf(!Intrinsics.LJFF(str2, ((C987903td) awS235S0300000_26.l1).LIZIZ) ? 1 : 0));
        laneParams.plusAssign("new_value_biz", ((C987903td) awS235S0300000_26.l1).LIZ);
        C987903td c987903td3 = (C987903td) awS235S0300000_26.l0;
        if (c987903td3 != null) {
            obj2 = c987903td3.LIZ;
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("old_value_biz", obj2);
        laneParams.plusAssign("new_value_template", Integer.valueOf(((C987903td) awS235S0300000_26.l1).LIZJ()));
        C987903td c987903td4 = (C987903td) awS235S0300000_26.l0;
        if (c987903td4 != null) {
            objValueOf = Integer.valueOf(c987903td4.LIZJ());
        }
        laneParams.plusAssign("old_value_template", objValueOf);
        C1756850vop c1756850vop = (C1756850vop) awS235S0300000_26.l2;
        if (c1756850vop != null) {
            laneParams.plusAssign("device_region", c1756850vop.LIZ);
            laneParams.plusAssign("template_from", c1756850vop.LIZIZ);
            laneParams.plusAssign("mx_region_type", c1756850vop.LIZLLL);
            laneParams.plusAssign("mx_setting_region", c1756850vop.LIZJ);
            laneParams.plusAssign("server_template_region", c1756850vop.LJI);
            laneParams.plusAssign("server_template", c1756850vop.LJII);
            laneParams.plusAssign("settings_cloud_template_region", c1756850vop.LJIIIIZZ);
            laneParams.plusAssign("settings_cloud_template", c1756850vop.LJIIIZ);
            laneParams.plusAssign("pdp_cache_key", c1756850vop.LJ);
            laneParams.plusAssign("pdp_cache_template", c1756850vop.LJFF);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        Context context = (Context) awS235S0300000_26.l0;
        String str = ((PhoneContact) awS235S0300000_26.l1).phoneNum;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tel:");
        sbLIZ.append(str);
        Intent intent = new Intent("android.intent.action.DIAL", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LMck70pyaAuOGKB2Cuu4geQIg==", null));
        C1054004Ag c1054004Ag = ((PdpViewModel) awS235S0300000_26.l2).LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("popup_name", "contact_seller");
            linkedHashMap.put("action_type", "call");
            InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
            if (interfaceC1748810vbrLJJIJLIJ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C048W(), new AwS605S0100000_26(linkedHashMap, (Map<String, ? extends Object>) 865));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        PhoneContact phoneContact = (PhoneContact) awS235S0300000_26.l0;
        String str = phoneContact.buttonText;
        if (str != null) {
            c1397620mTQ.LIZJ(0, str, new AwS235S0300000_26((Context) awS235S0300000_26.l1, phoneContact, (PdpViewModel) awS235S0300000_26.l2, 28));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        c197039127h.setBackgroundResource(R.drawable.ap0);
        c197039127h.setBackgroundRadius(4);
        c197039127h.setIconTintColorRes(R.attr.a00);
        C786410Ut5.U8(c197039127h, new ACListenerS90S0300000_26((C1721980uua) awS235S0300000_26.l0, (EditText) awS235S0300000_26.l1, (Map) awS235S0300000_26.l2, 0));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$30(kotlin.jvm.internal.AwS235S0300000_26 r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r4 = (com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams) r4
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityAssem r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityAssem) r0
            X.03bj r0 = r0.Ho()
            java.lang.String r1 = r0.LLILLL
            java.lang.String r0 = "fill_type"
            r4.plusAssign(r0, r1)
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption) r0
            java.lang.Integer r2 = r0.getType()
            if (r2 == 0) goto L68
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L5e
            java.lang.String r1 = "rfc_info"
        L24:
            java.lang.String r0 = "option_name"
            r4.plusAssign(r0, r1)
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption) r0
            java.lang.Integer r1 = r0.getType()
            java.lang.Object r0 = r3.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel) r0
            java.util.List r0 = r0.getIdentityInfoOptions()
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption) r0
            if (r0 == 0) goto L5c
            java.lang.Integer r0 = r0.getType()
        L45:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_default"
            r4.plusAssign(r0, r1)
            java.lang.String r1 = "page_name"
            java.lang.String r0 = "add_certification"
            r4.plusAssign(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5c:
            r0 = 0
            goto L45
        L5e:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L68
            java.lang.String r1 = "curp_info"
            goto L24
        L68:
            java.lang.String r1 = ""
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS235S0300000_26.invoke$30(kotlin.jvm.internal.AwS235S0300000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$31(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        boolean z;
        Integer numValueOf;
        String value;
        String value2;
        IdentityInfoOption identityInfoOption;
        IdentityInfoOption identityInfoOption2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", "confirm");
        Map<String, ? extends Object> map = ((AddressIdentityAssem) awS235S0300000_26.l0).Ho().LLIZ;
        if (map != null) {
            laneParams.withNotCheckParams(map);
        }
        laneParams.putAll(((AddressIdentityAssem) awS235S0300000_26.l0).Go());
        EnumC1749010vcB enumC1749010vcB = (EnumC1749010vcB) awS235S0300000_26.l1;
        EnumC1749010vcB enumC1749010vcB2 = EnumC1749010vcB.SUCCESS;
        if (enumC1749010vcB == enumC1749010vcB2) {
            z = true;
        } else {
            z = false;
        }
        laneParams.plusAssign("is_success", C893803eS.LIZ(z));
        EnumC1749010vcB enumC1749010vcB3 = (EnumC1749010vcB) awS235S0300000_26.l1;
        String value3 = null;
        if (enumC1749010vcB3 != enumC1749010vcB2) {
            numValueOf = Integer.valueOf(enumC1749010vcB3.getValue());
        } else {
            numValueOf = null;
        }
        laneParams.plusAssign("fail_reason", numValueOf);
        List<IdentityInfoOption> identityInfoOptions = ((IdentityInfoPanel) awS235S0300000_26.l2).getIdentityInfoOptions();
        if (identityInfoOptions != null && (identityInfoOption2 = (IdentityInfoOption) C13LP.LJJJLL(identityInfoOptions)) != null) {
            value = identityInfoOption2.getValue();
        } else {
            value = null;
        }
        laneParams.plusAssign("has_auto_input", Integer.valueOf(C703302op.LIZ(value) ? 1 : 0));
        IdentityInfoOption identityInfoOption3 = ((AddressIdentityAssem) awS235S0300000_26.l0).LLJJ;
        if (identityInfoOption3 != null) {
            value2 = identityInfoOption3.getValue();
        } else {
            value2 = null;
        }
        List<IdentityInfoOption> identityInfoOptions2 = ((IdentityInfoPanel) awS235S0300000_26.l2).getIdentityInfoOptions();
        if (identityInfoOptions2 != null && (identityInfoOption = (IdentityInfoOption) C13LP.LJJJLL(identityInfoOptions2)) != null) {
            value3 = identityInfoOption.getValue();
        }
        laneParams.plusAssign("is_same_auto", Integer.valueOf(Intrinsics.LJFF(value2, value3) ? 1 : 0));
        AssemVMLazy assemVMLazy = ((AddressIdentityAssem) awS235S0300000_26.l0).LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AddressIdentityAssem.LLJJIJIL;
        laneParams.plusAssign("tax_type", ((AddressIdentityViewModel) assemVMLazy.getValue()).LL);
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        String str;
        InterfaceC1718860upY interfaceC1718860upYLIZIZ;
        Integer num = ((Button) awS235S0300000_26.l0).linkType;
        int type = EnumC992960bwk.LINK_TYPE_URL.getType();
        if (num != null && num.intValue() == type && (str = ((Button) awS235S0300000_26.l0).buttonLink) != null) {
            Context context = (Context) awS235S0300000_26.l2;
            if (u.LJJIIJZLJL(str, "http", true)) {
                Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                builderBuildUpon.appendQueryParameter("entrance", "bnpl_bill");
                builderBuildUpon.appendQueryParameter("source", "phone_number_change");
                builderBuildUpon.appendQueryParameter("previous_page_id", "phone_number_change");
                IBNPLService iBNPLService = (IBNPLService) PluggableExtentionKt.pluggableSpi$default(IBNPLService.class, false, false, false, 14, null);
                if (iBNPLService != null && (interfaceC1718860upYLIZIZ = iBNPLService.LIZIZ()) != null) {
                    interfaceC1718860upYLIZIZ.LIZ(context, builderBuildUpon.build().toString(), true, false, false, "bnpl", null, "pipo_bnpl_spark");
                }
            } else {
                C1708650uZ5.LIZ.getClass();
                C1708650uZ5.LIZIZ(context, str, null, null);
            }
        }
        ((PhoneSettingAssem) awS235S0300000_26.l1).So().yQ2("phone_change_no_other_verification_method", "contact_us");
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        String str;
        InterfaceC1718860upY interfaceC1718860upYLIZIZ;
        Integer num = ((Button) awS235S0300000_26.l0).linkType;
        int type = EnumC992960bwk.LINK_TYPE_URL.getType();
        if (num != null && num.intValue() == type && (str = ((Button) awS235S0300000_26.l0).buttonLink) != null) {
            Context context = (Context) awS235S0300000_26.l2;
            if (u.LJJIIJZLJL(str, "http", true)) {
                Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                builderBuildUpon.appendQueryParameter("entrance", "bnpl_bill");
                builderBuildUpon.appendQueryParameter("source", "phone_number_change");
                builderBuildUpon.appendQueryParameter("previous_page_id", "phone_number_change");
                IBNPLService iBNPLService = (IBNPLService) PluggableExtentionKt.pluggableSpi$default(IBNPLService.class, false, false, false, 14, null);
                if (iBNPLService != null && (interfaceC1718860upYLIZIZ = iBNPLService.LIZIZ()) != null) {
                    interfaceC1718860upYLIZIZ.LIZ(context, builderBuildUpon.build().toString(), true, false, false, "bnpl", null, "pipo_bnpl_spark");
                }
            } else {
                C1708650uZ5.LIZ.getClass();
                C1708650uZ5.LIZIZ(context, str, null, null);
            }
        }
        ((PhoneSettingAssem) awS235S0300000_26.l1).So().yQ2("phone_change_no_other_verification_method", "go_back");
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        Button button;
        Button button2;
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        PopOutInfo popOutInfo = ((WalletFlowDecision) awS235S0300000_26.l0).popOut;
        String str = "";
        if (popOutInfo != null && (button2 = popOutInfo.mainButton) != null) {
            PhoneSettingAssem phoneSettingAssem = (PhoneSettingAssem) awS235S0300000_26.l1;
            Context context = (Context) awS235S0300000_26.l2;
            Integer num = button2.displayType;
            int type = EnumC2005907tR.DISPLAY_TYPE_RED.getType();
            if (num != null && num.intValue() == type) {
                String str2 = button2.buttonText;
                if (str2 == null) {
                    str2 = "";
                }
                c1397630mTR.LIZJ(0, str2, new AwS235S0300000_26(button2, phoneSettingAssem, context, 32));
            } else {
                String str3 = button2.buttonText;
                if (str3 == null) {
                    str3 = "";
                }
                c1397630mTR.LIZJ(1, str3, new AwS605S0100000_26(phoneSettingAssem, 562));
            }
        }
        PopOutInfo popOutInfo2 = ((WalletFlowDecision) awS235S0300000_26.l0).popOut;
        if (popOutInfo2 != null && (button = popOutInfo2.subButton) != null) {
            PhoneSettingAssem phoneSettingAssem2 = (PhoneSettingAssem) awS235S0300000_26.l1;
            Context context2 = (Context) awS235S0300000_26.l2;
            Integer num2 = button.displayType;
            int type2 = EnumC2005907tR.DISPLAY_TYPE_RED.getType();
            if (num2 != null && num2.intValue() == type2) {
                String str4 = button.buttonText;
                if (str4 != null) {
                    str = str4;
                }
                c1397630mTR.LIZJ(0, str, new AwS235S0300000_26(button, phoneSettingAssem2, context2, 33));
            } else {
                String str5 = button.buttonText;
                if (str5 != null) {
                    str = str5;
                }
                c1397630mTR.LIZJ(1, str, new AwS605S0100000_26(phoneSettingAssem2, 563));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        String str = (String) obj;
        C1718120uoM c1718120uoM = C1718120uoM.LIZ;
        String str2 = ((PinChangeViewAssem) awS235S0300000_26.l0).Jo().LLILZIL;
        String str3 = ((PinChangeViewAssem) awS235S0300000_26.l0).Jo().LLILLJJLI;
        String str4 = "";
        if (str == null) {
            str = "";
        }
        String str5 = ((HintPageMsg) awS235S0300000_26.l1).trackingId;
        if (str5 != null) {
            str4 = str5;
        }
        String str6 = ((PinChangeViewAssem) awS235S0300000_26.l0).Jo().LLILZLL;
        String str7 = ((PinChangeViewAssem) awS235S0300000_26.l0).Jo().LLIZLLLIL;
        String str8 = ((PinChangeViewAssem) awS235S0300000_26.l0).Jo().LLIZ;
        String str9 = ((PinChangeViewAssem) awS235S0300000_26.l0).Jo().LLJ;
        c1718120uoM.getClass();
        C1718120uoM.LJ(str2, "bnpl_pin_change", str3, str, str4, str6, str8, str7, str9);
        C19EG c19egLIZ = C724240Sb0.LIZ((UIAssem) awS235S0300000_26.l2);
        if (c19egLIZ != null) {
            c19egLIZ.finish();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$36(kotlin.jvm.internal.AwS235S0300000_26 r5, java.lang.Object r6) {
        /*
            X.0mJQ r4 = new X.0mJQ
            java.lang.Object r0 = r5.l0
            android.content.Context r0 = (android.content.Context) r0
            r4.<init>(r0)
            java.lang.Object r3 = r5.l1
            com.bytedance.pipo.stellar.base.model.prop.AccessoryDO r3 = (com.bytedance.pipo.stellar.base.model.prop.AccessoryDO) r3
            java.lang.Object r2 = r5.l2
            X.0urT r2 = (X.InterfaceC1720050urT) r2
            com.bytedance.pipo.stellar.base.model.TextDO r0 = r3.message
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.getContent()
            if (r0 != 0) goto L1d
        L1b:
            java.lang.String r0 = ""
        L1d:
            r4.LIZLLL(r0)
            java.lang.Integer r0 = r3.arrow
            if (r0 == 0) goto L3b
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L3b
        L2b:
            r4.LIZJ(r1)
            kotlin.jvm.internal.AwS392S0200000_26 r1 = new kotlin.jvm.internal.AwS392S0200000_26
            r0 = 129(0x81, float:1.81E-43)
            r1.<init>(r3, r2, r0)
            r4.LJ(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3b:
            r1 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS235S0300000_26.invoke$36(kotlin.jvm.internal.AwS235S0300000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$37(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        StellarActionDO action = ((ButtonDO) awS235S0300000_26.l0).getAction();
        if (action != null) {
            InterfaceC1720050urT interfaceC1720050urT = (InterfaceC1720050urT) awS235S0300000_26.l1;
            C1720250urn c1720250urn = (C1720250urn) awS235S0300000_26.l2;
            if (interfaceC1720050urT != null) {
                interfaceC1720050urT.bL(action, c1720250urn, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        StellarActionDO action = ((ButtonDO) awS235S0300000_26.l0).getAction();
        if (action != null) {
            InterfaceC1720050urT interfaceC1720050urT = (InterfaceC1720050urT) awS235S0300000_26.l1;
            C1720250urn c1720250urn = (C1720250urn) awS235S0300000_26.l2;
            if (interfaceC1720050urT != null) {
                interfaceC1720050urT.bL(action, c1720250urn, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        StellarActionDO action = ((ButtonDO) awS235S0300000_26.l0).getAction();
        if (action != null) {
            InterfaceC1720050urT interfaceC1720050urT = (InterfaceC1720050urT) awS235S0300000_26.l1;
            C1720250urn c1720250urn = (C1720250urn) awS235S0300000_26.l2;
            if (interfaceC1720050urT != null) {
                interfaceC1720050urT.bL(action, c1720250urn, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        Button button = ((ConfirmRegisterMobileResponse) awS235S0300000_26.l0).popOutInfo.mainButton;
        String str = "";
        if (button != null) {
            PhoneNumberAssem phoneNumberAssem = (PhoneNumberAssem) awS235S0300000_26.l1;
            Context context = (Context) awS235S0300000_26.l2;
            Integer num = button.displayType;
            int type = EnumC2005907tR.DISPLAY_TYPE_RED.getType();
            if (num != null && num.intValue() == type) {
                String str2 = button.buttonText;
                if (str2 == null) {
                    str2 = "";
                }
                c1397630mTR.LIZJ(0, str2, new AwS235S0300000_26(button, phoneNumberAssem, context, 5));
            } else {
                String str3 = button.buttonText;
                if (str3 == null) {
                    str3 = "";
                }
                c1397630mTR.LIZJ(1, str3, new AwS605S0100000_26(phoneNumberAssem, 98));
            }
        }
        Button button2 = ((ConfirmRegisterMobileResponse) awS235S0300000_26.l0).popOutInfo.subButton;
        if (button2 != null) {
            Context context2 = (Context) awS235S0300000_26.l2;
            Integer num2 = button2.displayType;
            int type2 = EnumC2005907tR.DISPLAY_TYPE_RED.getType();
            if (num2 != null && num2.intValue() == type2) {
                String str4 = button2.buttonText;
                if (str4 != null) {
                    str = str4;
                }
                c1397630mTR.LIZJ(0, str, new AwS392S0200000_26(button2, context2, 12));
            } else {
                String str5 = button2.buttonText;
                if (str5 != null) {
                    str = str5;
                }
                c1397630mTR.LIZJ(1, str, AFwS268S0000000_26.get$arr$(115));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        StellarActionDO action = ((ButtonDO) awS235S0300000_26.l0).getAction();
        if (action != null) {
            InterfaceC1720050urT interfaceC1720050urT = (InterfaceC1720050urT) awS235S0300000_26.l1;
            C1720250urn c1720250urn = (C1720250urn) awS235S0300000_26.l2;
            if (interfaceC1720050urT != null) {
                interfaceC1720050urT.bL(action, c1720250urn, null);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$41(kotlin.jvm.internal.AwS235S0300000_26 r5, java.lang.Object r6) {
        /*
            X.0Gwp r6 = (X.C432010Gwp) r6
            java.lang.Object r1 = r5.l0
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            X.0Gvm r0 = X.C431360Gvm.LIZ()
            r1.setMovementMethod(r0)
            java.lang.Object r0 = r5.l1
            com.bytedance.pipo.stellar.base.model.TextDO r0 = (com.bytedance.pipo.stellar.base.model.TextDO) r0
            com.bytedance.pipo.stellar.base.model.ColorDO r3 = r0.getLinkColor()
            if (r3 == 0) goto L65
            X.0utU r2 = X.C1721300utU.LIZ
            java.lang.Object r0 = r5.l0
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            android.content.Context r1 = r0.getContext()
            r2.getClass()
            r0 = 0
            java.lang.Integer r0 = X.C1721300utU.LJIILIIL(r3, r1, r0)
            if (r0 == 0) goto L65
            int r3 = r0.intValue()
        L2f:
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            X.0us9 r2 = new X.0us9
            java.lang.Object r1 = r5.l1
            com.bytedance.pipo.stellar.base.model.TextDO r1 = (com.bytedance.pipo.stellar.base.model.TextDO) r1
            java.lang.Object r0 = r5.l2
            X.0urT r0 = (X.InterfaceC1720050urT) r0
            r2.<init>(r3, r1, r0, r6)
            r0 = 0
            r4[r0] = r2
            X.0HcY r3 = new X.0HcY
            X.0utU r2 = X.C1721300utU.LIZ
            java.lang.Object r0 = r5.l1
            com.bytedance.pipo.stellar.base.model.TextDO r0 = (com.bytedance.pipo.stellar.base.model.TextDO) r0
            java.lang.String r1 = r0.getLinkFont()
            r2.getClass()
            X.1CzL r0 = X.C2248371CzL.LIZ
            r0.getClass()
            int r1 = X.C2248371CzL.LIZJ(r1)
            r0 = 1
            r3.<init>(r1, r0)
            r4[r0] = r3
            java.util.List r0 = X.C1697810uHb.LJIILJJIL(r4)
            return r0
        L65:
            java.lang.Object r0 = r5.l0
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            int r3 = r0.getCurrentTextColor()
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS235S0300000_26.invoke$41(kotlin.jvm.internal.AwS235S0300000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$42(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        ((C1397660mTU) obj).LIZJ = true;
        C1718120uoM c1718120uoM = C1718120uoM.LIZ;
        String str = ((PinForgotViewAssem) awS235S0300000_26.l0).Jo().LLILZ;
        String str2 = ((PinForgotViewAssem) awS235S0300000_26.l0).Jo().LL;
        String str3 = ((C1718700upI) awS235S0300000_26.l1).LIZJ;
        String str4 = ((PinForgotViewAssem) awS235S0300000_26.l0).Jo().LLILZIL;
        String str5 = ((PinForgotViewAssem) awS235S0300000_26.l0).Jo().LLIZ;
        String str6 = ((PinForgotViewAssem) awS235S0300000_26.l0).Jo().LLILZLL;
        String str7 = ((PinForgotViewAssem) awS235S0300000_26.l0).Jo().LLJI;
        c1718120uoM.getClass();
        C1718120uoM.LJ(str, "bnpl_pin_forgot", str2, "OK", str3, str4, str6, str5, str7);
        ((PinForgotViewAssem) awS235S0300000_26.l0).getClass();
        PinForgotViewAssem.Oo();
        C19EG c19egLIZ = C724240Sb0.LIZ((UIAssem) awS235S0300000_26.l2);
        if (c19egLIZ != null) {
            c19egLIZ.finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        ((C1397630mTR) obj).LIZJ(0, "OK", new AwS235S0300000_26((PinForgotViewAssem) awS235S0300000_26.l0, (C1718700upI) awS235S0300000_26.l1, (UIAssem) awS235S0300000_26.l2, 42));
        return Unit.LIZ;
    }

    public static final Object invoke$44(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        String str = (String) obj;
        C1718120uoM c1718120uoM = C1718120uoM.LIZ;
        String str2 = ((PinForgotViewAssem) awS235S0300000_26.l0).Jo().LLILZ;
        String str3 = ((PinForgotViewAssem) awS235S0300000_26.l0).Jo().LL;
        String str4 = "";
        if (str == null) {
            str = "";
        }
        String str5 = ((HintPageMsg) awS235S0300000_26.l1).trackingId;
        if (str5 != null) {
            str4 = str5;
        }
        String str6 = ((PinForgotViewAssem) awS235S0300000_26.l0).Jo().LLILZIL;
        String str7 = ((PinForgotViewAssem) awS235S0300000_26.l0).Jo().LLIZ;
        String str8 = ((PinForgotViewAssem) awS235S0300000_26.l0).Jo().LLILZLL;
        String str9 = ((PinForgotViewAssem) awS235S0300000_26.l0).Jo().LLJI;
        c1718120uoM.getClass();
        C1718120uoM.LJ(str2, "bnpl_pin_forgot", str3, str, str4, str6, str8, str7, str9);
        ((PinForgotViewAssem) awS235S0300000_26.l0).getClass();
        PinForgotViewAssem.Oo();
        C19EG c19egLIZ = C724240Sb0.LIZ((UIAssem) awS235S0300000_26.l2);
        if (c19egLIZ != null) {
            c19egLIZ.finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LJ(2131840386, new AwS392S0200000_26((Context) awS235S0300000_26.l0, (RechargeAssem) awS235S0300000_26.l1, 136));
        c1397630mTR.LJI(2131840385, new AwS392S0200000_26((RechargeAssem) awS235S0300000_26.l1, (UIAssem) awS235S0300000_26.l2, 137));
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        FragmentManager supportFragmentManager;
        ExplainInfo explainInfo = (ExplainInfo) obj;
        if (explainInfo != null && explainInfo.desc != null && explainInfo.title != null) {
            Object value = ((PdpViewModel) awS235S0300000_26.l0).LLLLLLL.getValue();
            C10329042d c10329042d = (C10329042d) awS235S0300000_26.l1;
            String str = explainInfo.desc;
            String str2 = explainInfo.title;
            InterfaceC1748810vbr interfaceC1748810vbr = (InterfaceC1748810vbr) awS235S0300000_26.l2;
            value.getClass();
            C1748720vbi.LIZIZ(interfaceC1748810vbr, new C049Y(), AFwS268S0000000_26.get$arr$(566));
            try {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(c10329042d.getContext());
                if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                    C808003Dq.LJFF(C808003Dq.LIZLLL(C808003Dq.LJ(c10329042d.getContext(), R.attr.a1j, 41, str), str2, true, new AwS675S0100000_26(interfaceC1748810vbr, 25), 20), supportFragmentManager, null, new AwS570S0100000_26(interfaceC1748810vbr, 1310), 4);
                }
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        ((C1721060ut6) awS235S0300000_26.l0).LJI((ViewGroup) ((View) awS235S0300000_26.l1), ((ContainerCardDO) awS235S0300000_26.l2).getCardList());
        return Unit.LIZ;
    }

    public static final Object invoke$48(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        ((C1721060ut6) awS235S0300000_26.l0).LJI((ViewGroup) awS235S0300000_26.l1, (List) awS235S0300000_26.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$49(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        String str;
        Bitmap bitmap = (Bitmap) obj;
        AbstractC1763110vyv abstractC1763110vyv = (AbstractC1763110vyv) C13LP.LJJJLZIJ(0, (List) awS235S0300000_26.l0);
        if (abstractC1763110vyv instanceof C1762980vyi) {
            str = ((C1762980vyi) abstractC1763110vyv).LJ;
        } else if (abstractC1763110vyv instanceof C1762960vyg) {
            str = ((C1762960vyg) abstractC1763110vyv).LJ;
        } else {
            str = null;
        }
        C1763700vzs c1763700vzs = ((SkuPanelBaseReusedAssem) ((InterfaceC10458047c) awS235S0300000_26.l1)).getViewModel().LLLFF;
        if (c1763700vzs != null) {
            c1763700vzs.LIZ(((DialogC1761330vw3) awS235S0300000_26.l2).getContext(), "blank_pages", bitmap, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        String str;
        Integer num = ((Button) awS235S0300000_26.l0).linkType;
        int type = EnumC992960bwk.LINK_TYPE_URL.getType();
        if (num != null && num.intValue() == type && (str = ((Button) awS235S0300000_26.l0).buttonLink) != null) {
            Context context = (Context) awS235S0300000_26.l2;
            C1708650uZ5.LIZ.getClass();
            C1708650uZ5.LIZIZ(context, str, null, null);
        }
        ((PhoneNumberAssem) awS235S0300000_26.l1).So().BQ2("phone_set_regional_error", "got_it");
        return Unit.LIZ;
    }

    public static final Object invoke$50(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        ErrorActionUIData errorActionUIData = (ErrorActionUIData) awS235S0300000_26.l0;
        ErrorActionButton errorActionButton = errorActionUIData.primaryButton;
        String str = "";
        if (errorActionButton != null) {
            C1725070uzZ c1725070uzZ = (C1725070uzZ) awS235S0300000_26.l1;
            InterfaceC1725110uzd interfaceC1725110uzd = (InterfaceC1725110uzd) awS235S0300000_26.l2;
            String str2 = errorActionButton.btnText;
            if (str2 == null) {
                str2 = "";
            }
            c1397620mTQ.LIZJ(0, str2, new AwS121S0400000_26(c1725070uzZ, errorActionUIData, errorActionButton, interfaceC1725110uzd, 19));
        }
        ErrorActionUIData errorActionUIData2 = (ErrorActionUIData) awS235S0300000_26.l0;
        ErrorActionButton errorActionButton2 = errorActionUIData2.secondaryButton;
        if (errorActionButton2 != null) {
            C1725070uzZ c1725070uzZ2 = (C1725070uzZ) awS235S0300000_26.l1;
            InterfaceC1725110uzd interfaceC1725110uzd2 = (InterfaceC1725110uzd) awS235S0300000_26.l2;
            String str3 = errorActionButton2.btnText;
            if (str3 == null) {
                str3 = "";
            }
            c1397620mTQ.LIZJ(1, str3, new AwS121S0400000_26(c1725070uzZ2, errorActionUIData2, errorActionButton2, interfaceC1725110uzd2, 20));
        }
        ErrorActionUIData errorActionUIData3 = (ErrorActionUIData) awS235S0300000_26.l0;
        ErrorActionButton errorActionButton3 = errorActionUIData3.thirdButton;
        if (errorActionButton3 != null) {
            C1725070uzZ c1725070uzZ3 = (C1725070uzZ) awS235S0300000_26.l1;
            InterfaceC1725110uzd interfaceC1725110uzd3 = (InterfaceC1725110uzd) awS235S0300000_26.l2;
            String str4 = errorActionButton3.btnText;
            if (str4 != null) {
                str = str4;
            }
            c1397620mTQ.LIZJ(1, str, new AwS121S0400000_26(c1725070uzZ3, errorActionUIData3, errorActionButton3, interfaceC1725110uzd3, 21));
        }
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$51(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        ((Boolean) obj).booleanValue();
        ECommerceVideoService eCommerceVideoService = (ECommerceVideoService) awS235S0300000_26.l0;
        InterfaceC1752840viM interfaceC1752840viM = (InterfaceC1752840viM) awS235S0300000_26.l1;
        ((View) awS235S0300000_26.l2).getContext();
        eCommerceVideoService.getClass();
        View viewNb = interfaceC1752840viM.nb();
        if (viewNb != null) {
            C683480QrS.LIZ.getClass();
            C683480QrS.LIZ(viewNb);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$52(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        Context context = (Context) awS235S0300000_26.l0;
        String str = ((PhoneContact) awS235S0300000_26.l1).phoneNum;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tel:");
        sbLIZ.append(str);
        Intent intent = new Intent("android.intent.action.DIAL", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LMck70v2KhsbU3cJd3oB/edxGzMtOSPxNM=", null));
        C1054104Ah c1054104Ah = ((SeaPdpViewModel) awS235S0300000_26.l2).LLJLIL;
        if (c1054104Ah != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("popup_name", "contact_seller");
            linkedHashMap.put("action_type", "call");
            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
            if (interfaceC1748810vbrLJJIZ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C048W(), new AwS605S0100000_26(linkedHashMap, (Map<String, ? extends Object>) 542));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$53(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        PhoneContact phoneContact = (PhoneContact) awS235S0300000_26.l0;
        String str = phoneContact.buttonText;
        if (str != null) {
            c1397620mTQ.LIZJ(0, str, new AwS235S0300000_26((Context) awS235S0300000_26.l1, phoneContact, (SeaPdpViewModel) awS235S0300000_26.l2, 52));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$54(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        if (((C1720190urh) obj).LL instanceof C1623606Xi) {
            ((C013C) awS235S0300000_26.l0).element = false;
            ((StellarViewModel) awS235S0300000_26.l1).setState(AFwS268S0000000_26.get$arr$(680));
        } else {
            ((C013C) awS235S0300000_26.l0).element = true;
            ((StellarViewModel) awS235S0300000_26.l1).setState(AFwS268S0000000_26.get$arr$(681));
        }
        InterfaceC497601wk assemVMScope = ((StellarViewModel) awS235S0300000_26.l1).getAssemVMScope();
        StellarViewModel stellarViewModel = (StellarViewModel) awS235S0300000_26.l1;
        C23250099c.LIZLLL(assemVMScope, stellarViewModel.LLILLL, null, new C1719780ur2(stellarViewModel, (C013C) awS235S0300000_26.l0, (InterfaceC1719800ur4) awS235S0300000_26.l2, null), 2);
        StellarViewModel stellarViewModel2 = (StellarViewModel) awS235S0300000_26.l1;
        stellarViewModel2.getClass();
        Iterator it2 = C1720970usx.LIZ().iterator();
        while (it2.hasNext()) {
            stellarViewModel2.zQ2((StellarCardAdapter) it2.next());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$55(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        ((C1753660vjg) awS235S0300000_26.l0).LIZIZ(laneParams, (BundleInfo) awS235S0300000_26.l1);
        C1753660vjg c1753660vjg = (C1753660vjg) awS235S0300000_26.l0;
        BundleInfo bundleInfo = (BundleInfo) awS235S0300000_26.l1;
        c1753660vjg.getClass();
        C1753660vjg.LIZ(laneParams, bundleInfo);
        laneParams.plusAssign("button_name", "bundle_add_to_cart");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        List<BundleProduct> list = ((BundleInfo) awS235S0300000_26.l1).productList;
        if (list != null) {
            for (BundleProduct bundleProduct : list) {
                sb.append(bundleProduct.productId);
                sb.append(",");
                sb2.append(bundleProduct.productSource);
                sb2.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        laneParams.plusAssign("product_id", sb.toString());
        laneParams.plusAssign("product_source", sb2.toString());
        laneParams.plusAssign("source_page_type", "bundle_deal");
        Map<String, ? extends Object> map = (Map) awS235S0300000_26.l2;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$56(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        String str;
        String str2;
        LaneParams laneParams = (LaneParams) obj;
        ((C1753660vjg) awS235S0300000_26.l0).LIZIZ(laneParams, (BundleInfo) awS235S0300000_26.l1);
        C1753660vjg c1753660vjg = (C1753660vjg) awS235S0300000_26.l0;
        BundleInfo bundleInfo = (BundleInfo) awS235S0300000_26.l1;
        c1753660vjg.getClass();
        C1753660vjg.LIZ(laneParams, bundleInfo);
        laneParams.plusAssign("cart_form", "add_to_cart");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        List<BundleProduct> list = ((BundleInfo) awS235S0300000_26.l1).productList;
        if (list != null) {
            for (BundleProduct bundleProduct : list) {
                sb.append(bundleProduct.productId);
                sb.append(",");
                BundleSku bundleSku = bundleProduct.selectedSku;
                String str3 = null;
                if (bundleSku != null) {
                    str = bundleSku.skuId;
                } else {
                    str = null;
                }
                sb2.append(str);
                sb2.append(",");
                BundlePrice bundlePrice = bundleProduct.productPrice;
                if (bundlePrice != null) {
                    str2 = bundlePrice.originalPrice;
                } else {
                    str2 = null;
                }
                sb3.append(str2);
                sb3.append(",");
                BundlePrice bundlePrice2 = bundleProduct.productPrice;
                if (bundlePrice2 != null) {
                    str3 = bundlePrice2.realPrice;
                }
                sb4.append(str3);
                sb4.append(",");
                sb5.append(bundleProduct.productSource);
                sb5.append(",");
            }
        }
        laneParams.plusAssign("product_id", sb);
        laneParams.plusAssign("sku_id", sb2);
        laneParams.plusAssign("is_single_sku", "1");
        laneParams.plusAssign("source_page_type", "bundle_deal");
        laneParams.plusAssign("original_price", sb3);
        laneParams.plusAssign("sale_price", sb4);
        laneParams.plusAssign("product_source", sb5);
        laneParams.withParamsGroup((Map) awS235S0300000_26.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$57(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C1762400vxm c1762400vxm = (C1762400vxm) awS235S0300000_26.l0;
        if (c1762400vxm.LLILZIL || iIntValue == c1762400vxm.LLILZ) {
            PdpViewModel pdpViewModel = c1762400vxm.LLILLL;
            if (pdpViewModel == null) {
                pdpViewModel = null;
            }
            pdpViewModel.oR2(c1762400vxm.getCommerceHeaderPagerFromXml(), ((C1762950vyf) awS235S0300000_26.l1).LIZ, iIntValue, Float.valueOf(((C1762410vxn) awS235S0300000_26.l2).LJIL(iIntValue)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$58(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        C1748720vbi.LIZLLL((View) awS235S0300000_26.l0, (AbstractC1748750vbl) awS235S0300000_26.l1, (Function1) awS235S0300000_26.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$59(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        final String str;
        AddressEditState addressEditState = (AddressEditState) obj;
        List<NoticeBubble> list = (List) awS235S0300000_26.l0;
        C450740Hlw c450740Hlw = (C450740Hlw) awS235S0300000_26.l1;
        final Context context = (Context) awS235S0300000_26.l2;
        for (NoticeBubble noticeBubble : list) {
            String str2 = noticeBubble.key;
            if (str2 != null && (str = noticeBubble.text) != null) {
                final int i = 0;
                if (str.length() > 0 && 1 != 0) {
                    Iterator<C1745680vWo> it2 = addressEditState.getInputItemVOList().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (Intrinsics.LJFF(it2.next().LIZ.key, str2)) {
                            if (i >= 0) {
                                final RecyclerView.LayoutManager layoutManager = c450740Hlw.getLayoutManager();
                                if ((layoutManager instanceof RecyclerView.LayoutManager) && layoutManager != null) {
                                    if (layoutManager.findViewByPosition(i) != null) {
                                        LIZ$0(layoutManager, i, context, str);
                                    } else {
                                        c450740Hlw.scrollToPosition(i);
                                        c450740Hlw.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0vZ8
                                            @Override // android.view.View.OnLayoutChangeListener
                                            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                                                view.removeOnLayoutChangeListener(this);
                                                AwS235S0300000_26.LIZ$0(layoutManager, i, context, str);
                                            }
                                        });
                                    }
                                }
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        String str;
        String str2;
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        BaseRegisterManager baseRegisterManager = (BaseRegisterManager) awS235S0300000_26.l0;
        Button button = baseRegisterManager.LLILLL.popOut.mainButton;
        String str3 = "";
        if (button == null || (str = button.buttonText) == null) {
            str = "";
        }
        c1397630mTR.LIZJ(0, str, new AwS235S0300000_26((Context) awS235S0300000_26.l1, (Context) baseRegisterManager, (BaseRegisterManager) awS235S0300000_26.l2, (Function1<? super WalletFlowDecision, Unit>) 7));
        BaseRegisterManager baseRegisterManager2 = (BaseRegisterManager) awS235S0300000_26.l0;
        Button button2 = baseRegisterManager2.LLILLL.popOut.subButton;
        if (button2 != null && (str2 = button2.buttonText) != null) {
            str3 = str2;
        }
        c1397630mTR.LIZJ(1, str3, new AwS235S0300000_26((Context) awS235S0300000_26.l1, (Context) baseRegisterManager2, (BaseRegisterManager) awS235S0300000_26.l2, (Function1<? super WalletFlowDecision, Unit>) 8));
        return Unit.LIZ;
    }

    public static final Object invoke$60(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        Map<String, ? extends Object> mapLJ;
        Map<String, ? extends Object> mapLJ2;
        String str;
        C957403oi c957403oi = (C957403oi) obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = ((C1054004Ag) awS235S0300000_26.l0).LIZIZ;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(concurrentHashMap);
        String str2 = ((RecommendFeedData) awS235S0300000_26.l1).daInfo;
        if (str2 == null || (mapLJ = C1741890vQh.LJIIJ(str2)) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        c957403oi.LJ(mapLJ);
        PdpModuleHeader pdpModuleHeader = ((RecommendFeedData) awS235S0300000_26.l1).header;
        if (pdpModuleHeader == null || (str = pdpModuleHeader.daInfo) == null || (mapLJ2 = C1741890vQh.LJIIJ(str)) == null) {
            mapLJ2 = C2097608Jq.LJ();
        }
        c957403oi.LJ(mapLJ2);
        Map map = (Map) awS235S0300000_26.l2;
        if (map != null) {
            c957403oi.LJ(C00H3.LIZ(map));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$61(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        Map<String, ? extends Object> mapLJ;
        Map<String, ? extends Object> mapLJ2;
        C957403oi c957403oi = (C957403oi) obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = ((C1054004Ag) awS235S0300000_26.l0).LIZIZ;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(concurrentHashMap);
        String str = ((C1753000vic) awS235S0300000_26.l1).LLILZ;
        if (str == null || (mapLJ = C1741890vQh.LJIIJ(str)) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        c957403oi.LJ(mapLJ);
        String str2 = ((C1753000vic) awS235S0300000_26.l1).LLILLJJLI.daInfo;
        if (str2 == null || (mapLJ2 = C1741890vQh.LJIIJ(str2)) == null) {
            mapLJ2 = C2097608Jq.LJ();
        }
        c957403oi.LJ(mapLJ2);
        Map map = (Map) awS235S0300000_26.l2;
        if (map != null) {
            c957403oi.LJ(C00H3.LIZ(map));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$62(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        PdpMainState pdpMainState = (PdpMainState) obj;
        C1756520voI bottomFloatingState = pdpMainState.getBottomFloatingState();
        Integer num = (Integer) awS235S0300000_26.l0;
        if (num == null) {
            num = pdpMainState.getBottomFloatingState().LIZ;
        }
        Integer num2 = (Integer) awS235S0300000_26.l1;
        if (num2 == null) {
            num2 = pdpMainState.getBottomFloatingState().LIZIZ;
        }
        Integer num3 = (Integer) awS235S0300000_26.l2;
        if (num3 == null) {
            num3 = pdpMainState.getBottomFloatingState().LIZJ;
        }
        bottomFloatingState.getClass();
        return pdpMainState.copy(pdpMainState.isFullScreen, pdpMainState.bottomBarVO, pdpMainState.dismiss, pdpMainState.sheetState, pdpMainState.contentList, pdpMainState.bottomSheetSlideOffset, pdpMainState.creatorSheetVO, pdpMainState.scrollOrientation, pdpMainState.creatorSheetSlideOffset, pdpMainState.scrollOffset, pdpMainState.currentFocusModule, pdpMainState.loadingStatus, pdpMainState.flashSaleState, pdpMainState.flashSaleCountDown, pdpMainState.cartTip, pdpMainState.cartEntry, pdpMainState.bodyContent, pdpMainState.shareInfo, pdpMainState.blockInfo, pdpMainState.showFavoriteGuide, pdpMainState.shopInfo, pdpMainState.bottomAreaElem, pdpMainState.protectionProgramText, pdpMainState.bizEnvChange, pdpMainState.userRight, pdpMainState.exceptionUX, pdpMainState.lynxPopupState, new C1756520voI(num, num2, num3), pdpMainState.openSkuOnInit, pdpMainState.addCartData);
    }

    public static final Object invoke$63(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        ((Boolean) obj).booleanValue();
        GalleryViewerViewModel galleryViewerViewModel = ((C1761460vwG) awS235S0300000_26.l0).LLILLJJLI;
        if (galleryViewerViewModel != null) {
            galleryViewerViewModel.yQ2((C1761470vwH) awS235S0300000_26.l2, true, ((C1761290vvz) awS235S0300000_26.l1).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$64(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        ((C1753650vjf) awS235S0300000_26.l0).LIZIZ(laneParams, (BundleInfo) awS235S0300000_26.l1);
        C1753650vjf c1753650vjf = (C1753650vjf) awS235S0300000_26.l0;
        BundleInfo bundleInfo = (BundleInfo) awS235S0300000_26.l1;
        c1753650vjf.getClass();
        C1753650vjf.LIZ(laneParams, bundleInfo);
        laneParams.plusAssign("button_name", "bundle_add_to_cart");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        List<BundleProduct> list = ((BundleInfo) awS235S0300000_26.l1).productList;
        if (list != null) {
            for (BundleProduct bundleProduct : list) {
                sb.append(bundleProduct.productId);
                sb.append(",");
                sb2.append(bundleProduct.productSource);
                sb2.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        laneParams.plusAssign("product_id", sb.toString());
        laneParams.plusAssign("product_source", sb2.toString());
        laneParams.plusAssign("source_page_type", "bundle_deal");
        laneParams.withParamsGroup((Map) awS235S0300000_26.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$65(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        String str;
        String str2;
        LaneParams laneParams = (LaneParams) obj;
        ((C1753650vjf) awS235S0300000_26.l0).LIZIZ(laneParams, (BundleInfo) awS235S0300000_26.l1);
        C1753650vjf c1753650vjf = (C1753650vjf) awS235S0300000_26.l0;
        BundleInfo bundleInfo = (BundleInfo) awS235S0300000_26.l1;
        c1753650vjf.getClass();
        C1753650vjf.LIZ(laneParams, bundleInfo);
        laneParams.plusAssign("cart_form", "add_to_cart");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        List<BundleProduct> list = ((BundleInfo) awS235S0300000_26.l1).productList;
        if (list != null) {
            for (BundleProduct bundleProduct : list) {
                sb.append(bundleProduct.productId);
                sb.append(",");
                BundleSku bundleSku = bundleProduct.selectedSku;
                String str3 = null;
                if (bundleSku != null) {
                    str = bundleSku.skuId;
                } else {
                    str = null;
                }
                sb2.append(str);
                sb2.append(",");
                BundlePrice bundlePrice = bundleProduct.productPrice;
                if (bundlePrice != null) {
                    str2 = bundlePrice.originalPrice;
                } else {
                    str2 = null;
                }
                sb3.append(str2);
                sb3.append(",");
                BundlePrice bundlePrice2 = bundleProduct.productPrice;
                if (bundlePrice2 != null) {
                    str3 = bundlePrice2.realPrice;
                }
                sb4.append(str3);
                sb4.append(",");
                sb5.append(bundleProduct.productSource);
                sb5.append(",");
            }
        }
        laneParams.plusAssign("product_id", sb);
        laneParams.plusAssign("sku_id", sb2);
        laneParams.plusAssign("is_single_sku", "1");
        laneParams.plusAssign("source_page_type", "bundle_deal");
        laneParams.plusAssign("original_price", sb3);
        laneParams.plusAssign("sale_price", sb4);
        laneParams.plusAssign("product_source", sb5);
        laneParams.withParamsGroup((Map) awS235S0300000_26.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        String str;
        ((C1397660mTU) obj).LIZJ = false;
        Context context = (Context) awS235S0300000_26.l0;
        PopOutExtraInfo popOutExtraInfo = ((BaseRegisterManager) awS235S0300000_26.l1).LLILLL.popOut.extraInfo;
        if (popOutExtraInfo == null || (str = popOutExtraInfo.scene) == null) {
            str = "";
        }
        new ConsultPhoneChangeDialogFragment(context, str, "MOBILE_USED", "change_set", (Function1) awS235S0300000_26.l2).show(((C19EG) ((Context) awS235S0300000_26.l0)).getSupportFragmentManager(), "consult_phone_change");
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        ((C1397660mTU) obj).LIZJ = false;
        new ConsultPhoneChangeDialogFragment((Context) awS235S0300000_26.l0, ((BaseRegisterManager) awS235S0300000_26.l1).LLILLL.popOut.extraInfo.scene, "MOBILE_NOT_USED", "forget_set", (Function1) awS235S0300000_26.l2).show(((C19EG) ((Context) awS235S0300000_26.l0)).getSupportFragmentManager(), "consult_phone_change");
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS235S0300000_26 awS235S0300000_26, Object obj) {
        AddressValid addressValid;
        String str;
        Address address;
        String str2;
        Integer num;
        IECommerceHostService iECommerceHostService;
        boolean z;
        CandDetailPlaceResponse candDetailPlaceResponse = (CandDetailPlaceResponse) obj;
        CandInputData candInputData = candDetailPlaceResponse.candDetailPlaceOption;
        String name = null;
        if (candInputData != null) {
            addressValid = candInputData.addressValid;
        } else {
            addressValid = null;
        }
        AddressEditViewModel addressEditViewModel = (AddressEditViewModel) awS235S0300000_26.l0;
        CandInputData candInputData2 = (CandInputData) awS235S0300000_26.l1;
        if (candInputData2 != null) {
            str = candInputData2.autocompleteAddressId;
        } else {
            str = null;
        }
        addressEditViewModel.LLLLLLLLL = str;
        if (candInputData != null) {
            address = candInputData.address;
        } else {
            address = null;
        }
        if (addressValid != null) {
            str2 = addressValid.invalidHintMessage;
            num = addressValid.addressInvalidType;
        } else {
            str2 = null;
            num = null;
        }
        AddressEditViewModel.tS2(addressEditViewModel, address, null, str2, num, false, false, null, null, "geo", null, 6118);
        String str3 = candDetailPlaceResponse.regionAutofillHintMessage;
        if (str3 != null && str3.length() != 0 && C1388190mED.LIZIZ(((CandHelper) awS235S0300000_26.l2).LIZ) != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            C1233040iBy c1233040iBy = new C1233040iBy(((IApplicationDependencyService) iECommerceHostService).getApplicationContext());
            c1233040iBy.LIZJ(candDetailPlaceResponse.regionAutofillHintMessage);
            c1233040iBy.LIZLLL();
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS235S0300000_26(android.content.Context r3, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PhoneContact r4, com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 52 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS235S0300000_26.<init>(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PhoneContact, com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel, int):void");
    }

    public static final void LIZ$0(RecyclerView.LayoutManager layoutManager, int i, Context context, String str) {
        int iIntValue;
        View viewFindViewByPosition = layoutManager.findViewByPosition(i);
        if (viewFindViewByPosition == null) {
            return;
        }
        View viewFindViewById = viewFindViewByPosition.findViewById(R.id.juf);
        if (viewFindViewById != null) {
            viewFindViewByPosition = viewFindViewById;
        }
        C450720Hlu c450720Hlu = new C450720Hlu(context);
        c450720Hlu.LLILZ = str;
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = viewFindViewByPosition;
        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.uj, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        c450720Hlu.LJI(iIntValue);
        C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
        c1391600mJi2.LJIIIZ = true;
        c1391600mJi2.LJIIL = true;
        c450720Hlu.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c450720Hlu.LLILLJJLI.LJFF = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        c450720Hlu.LIZIZ().show();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS235S0300000_26(android.content.Context r3, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PhoneContact r4, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 28 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS235S0300000_26.<init>(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PhoneContact, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(C013C c013c, StellarViewModel stellarViewModel, InterfaceC1719800ur4 interfaceC1719800ur4, int i) {
        super(1);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = stellarViewModel;
        this.l2 = interfaceC1719800ur4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(C977203ru c977203ru, C1759880vti c1759880vti, ButtonStyle buttonStyle, int i) {
        super(1);
        this.$t = i;
        this.l0 = c977203ru;
        this.l1 = c1759880vti;
        this.l2 = buttonStyle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(C987903td c987903td, C987903td c987903td2, C1756850vop c1756850vop, int i) {
        super(1);
        this.$t = i;
        this.l0 = c987903td;
        this.l1 = c987903td2;
        this.l2 = c1756850vop;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(InterfaceC10458047c interfaceC10458047c, DialogC1761330vw3 dialogC1761330vw3, List list, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = interfaceC10458047c;
        this.l2 = dialogC1761330vw3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS235S0300000_26(C1054004Ag c1054004Ag, C1054004Ag c1054004Ag2, C1753000vic c1753000vic, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = c1054004Ag;
        this.l1 = c1054004Ag2;
        this.l2 = c1753000vic;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS235S0300000_26(C1054004Ag c1054004Ag, C1054004Ag c1054004Ag2, RecommendFeedData recommendFeedData, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = c1054004Ag;
        this.l1 = c1054004Ag2;
        this.l2 = recommendFeedData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(EnumC1407150min enumC1407150min, Boolean bool, ReviewTransData reviewTransData, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC1407150min;
        this.l1 = bool;
        this.l2 = reviewTransData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(C1710340ubo c1710340ubo, CCDCCardNumberElementViewHolder cCDCCardNumberElementViewHolder, C1710850ucd c1710850ucd, int i) {
        super(1);
        this.$t = i;
        this.l0 = cCDCCardNumberElementViewHolder;
        this.l1 = c1710850ucd;
        this.l2 = c1710340ubo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(C1710780ucW c1710780ucW, CCDCNormalElementViewHolder cCDCNormalElementViewHolder, C1710360ubq c1710360ubq, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1710780ucW;
        this.l1 = cCDCNormalElementViewHolder;
        this.l2 = c1710360ubq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(C1710810ucZ c1710810ucZ, CCDCDateElementViewHolder cCDCDateElementViewHolder, C1710350ubp c1710350ubp, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1710810ucZ;
        this.l1 = cCDCDateElementViewHolder;
        this.l2 = c1710350ubp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(InterfaceC1720050urT interfaceC1720050urT, TextDO textDO, TuxTextView tuxTextView, int i) {
        super(1);
        this.$t = i;
        this.l0 = tuxTextView;
        this.l1 = textDO;
        this.l2 = interfaceC1720050urT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(C1721060ut6 c1721060ut6, View view, ContainerCardDO containerCardDO, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1721060ut6;
        this.l1 = view;
        this.l2 = containerCardDO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS235S0300000_26(C1721060ut6 c1721060ut6, C1721060ut6 c1721060ut62, ViewGroup viewGroup, List<CardDO> list) {
        super(1);
        this.$t = list;
        this.l0 = c1721060ut6;
        this.l1 = c1721060ut62;
        this.l2 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS235S0300000_26(C1721980uua c1721980uua, C1721980uua c1721980uua2, EditText editText, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l0 = c1721980uua;
        this.l1 = c1721980uua2;
        this.l2 = editText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(C1725540v0K c1725540v0K, PipoRetentionButtonConfig pipoRetentionButtonConfig, InterfaceC1059280dfi interfaceC1059280dfi, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1725540v0K;
        this.l1 = pipoRetentionButtonConfig;
        this.l2 = interfaceC1059280dfi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS235S0300000_26(C1753650vjf c1753650vjf, C1753650vjf c1753650vjf2, BundleInfo bundleInfo, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = c1753650vjf;
        this.l1 = c1753650vjf2;
        this.l2 = bundleInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS235S0300000_26(C1753660vjg c1753660vjg, C1753660vjg c1753660vjg2, BundleInfo bundleInfo, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = c1753660vjg;
        this.l1 = c1753660vjg2;
        this.l2 = bundleInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(C1761460vwG c1761460vwG, C1761290vvz c1761290vvz, C1761470vwH c1761470vwH, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1761460vwG;
        this.l1 = c1761290vvz;
        this.l2 = c1761470vwH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(C1762400vxm c1762400vxm, C1762950vyf c1762950vyf, C1762410vxn c1762410vxn, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1762400vxm;
        this.l1 = c1762950vyf;
        this.l2 = c1762410vxn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(C214820195e c214820195e, JediBaseWidget jediBaseWidget, InterfaceC1766140w3o interfaceC1766140w3o, int i) {
        super(1);
        this.$t = i;
        this.l0 = c214820195e;
        this.l1 = jediBaseWidget;
        this.l2 = interfaceC1766140w3o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(Context context, AccessoryDO accessoryDO, InterfaceC1720050urT interfaceC1720050urT, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = accessoryDO;
        this.l2 = interfaceC1720050urT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(Context context, RechargeAssem rechargeAssem, UIAssem uIAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = rechargeAssem;
        this.l2 = uIAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS235S0300000_26(Context context, Context context2, BaseRegisterManager baseRegisterManager, Function1<? super WalletFlowDecision, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = baseRegisterManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(Context context, BaseRegisterManager baseRegisterManager, AwS109S1200000_26 awS109S1200000_26, int i) {
        super(1);
        this.$t = i;
        this.l0 = baseRegisterManager;
        this.l1 = context;
        this.l2 = awS109S1200000_26;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS235S0300000_26(View view, View view2, AbstractC1748750vbl abstractC1748750vbl, Function1<? super LaneParams, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = abstractC1748750vbl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(ButtonDO buttonDO, InterfaceC1720050urT interfaceC1720050urT, C1720250urn c1720250urn, int i) {
        super(1);
        this.$t = i;
        this.l0 = buttonDO;
        this.l1 = interfaceC1720050urT;
        this.l2 = c1720250urn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(RechargeViewmodel rechargeViewmodel, EnumC488160JCk enumC488160JCk, EnumC1721510utp enumC1721510utp, int i) {
        super(1);
        this.$t = i;
        this.l0 = rechargeViewmodel;
        this.l1 = enumC488160JCk;
        this.l2 = enumC1721510utp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(ConfirmRegisterMobileResponse confirmRegisterMobileResponse, PhoneNumberAssem phoneNumberAssem, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = confirmRegisterMobileResponse;
        this.l1 = phoneNumberAssem;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(Button button, TTPayOnboardingAssem tTPayOnboardingAssem, C19EG c19eg, int i) {
        super(1);
        this.$t = i;
        this.l0 = button;
        this.l1 = tTPayOnboardingAssem;
        this.l2 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(Button button, PhoneNumberAssem phoneNumberAssem, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = button;
        this.l1 = phoneNumberAssem;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(Button button, PhoneSettingAssem phoneSettingAssem, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = button;
        this.l1 = phoneSettingAssem;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(WalletFlowDecision walletFlowDecision, TTPayOnboardingAssem tTPayOnboardingAssem, C19EG c19eg, int i) {
        super(1);
        this.$t = i;
        this.l0 = walletFlowDecision;
        this.l1 = tTPayOnboardingAssem;
        this.l2 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(WalletFlowDecision walletFlowDecision, PhoneSettingAssem phoneSettingAssem, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = walletFlowDecision;
        this.l1 = phoneSettingAssem;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(PinChangeViewAssem pinChangeViewAssem, HintPageMsg hintPageMsg, UIAssem uIAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = pinChangeViewAssem;
        this.l1 = hintPageMsg;
        this.l2 = uIAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(PinForgotViewAssem pinForgotViewAssem, C1718700upI c1718700upI, UIAssem uIAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = pinForgotViewAssem;
        this.l1 = c1718700upI;
        this.l2 = uIAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(PinForgotViewAssem pinForgotViewAssem, HintPageMsg hintPageMsg, UIAssem uIAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = pinForgotViewAssem;
        this.l1 = hintPageMsg;
        this.l2 = uIAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(AddressEditViewModel addressEditViewModel, CandInputData candInputData, CandHelper candHelper, int i) {
        super(1);
        this.$t = i;
        this.l0 = addressEditViewModel;
        this.l1 = candInputData;
        this.l2 = candHelper;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(AddressEditViewModel addressEditViewModel, InputItemData inputItemData, Boolean bool, int i) {
        super(1);
        this.$t = i;
        this.l0 = addressEditViewModel;
        this.l1 = inputItemData;
        this.l2 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(CpfAssem cpfAssem, EnumC1749060vcG enumC1749060vcG, IdentityInfoPanel identityInfoPanel, int i) {
        super(1);
        this.$t = i;
        this.l0 = cpfAssem;
        this.l1 = enumC1749060vcG;
        this.l2 = identityInfoPanel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(AddressIdentityAssem addressIdentityAssem, EnumC1749010vcB enumC1749010vcB, IdentityInfoPanel identityInfoPanel, int i) {
        super(1);
        this.$t = i;
        this.l0 = addressIdentityAssem;
        this.l1 = enumC1749010vcB;
        this.l2 = identityInfoPanel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(AddressIdentityAssem addressIdentityAssem, IdentityInfoOption identityInfoOption, IdentityInfoPanel identityInfoPanel, int i) {
        super(1);
        this.$t = i;
        this.l0 = addressIdentityAssem;
        this.l1 = identityInfoOption;
        this.l2 = identityInfoPanel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(LiveInfo liveInfo, UsPdpTopStoreIdentityVM usPdpTopStoreIdentityVM, UsPdpTopStoreIdentityModuleVO usPdpTopStoreIdentityModuleVO, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveInfo;
        this.l1 = usPdpTopStoreIdentityVM;
        this.l2 = usPdpTopStoreIdentityModuleVO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(PdpViewModel pdpViewModel, C10329042d c10329042d, ECBaseFragment eCBaseFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = pdpViewModel;
        this.l1 = c10329042d;
        this.l2 = eCBaseFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(ErrorActionUIData errorActionUIData, C1725070uzZ c1725070uzZ, InterfaceC1725110uzd interfaceC1725110uzd, int i) {
        super(1);
        this.$t = i;
        this.l0 = errorActionUIData;
        this.l1 = c1725070uzZ;
        this.l2 = interfaceC1725110uzd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(PipoRetentionPopupConfig pipoRetentionPopupConfig, C1725540v0K c1725540v0K, InterfaceC1059280dfi interfaceC1059280dfi, int i) {
        super(1);
        this.$t = i;
        this.l0 = pipoRetentionPopupConfig;
        this.l1 = c1725540v0K;
        this.l2 = interfaceC1059280dfi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(Integer num, Integer num2, Integer num3, int i) {
        super(1);
        this.$t = i;
        this.l0 = num;
        this.l1 = num2;
        this.l2 = num3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS235S0300000_26(List list, List<NoticeBubble> list2, C450740Hlw c450740Hlw, Context context) {
        super(1);
        this.$t = context;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c450740Hlw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS235S0300000_26(List list, List<AddressTipButton> list2, AddressEditFragment addressEditFragment, AddressVerifyData addressVerifyData) {
        super(1);
        this.$t = addressVerifyData;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = addressEditFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(List list, List list2, AwS605S0100000_26 awS605S0100000_26, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = awS605S0100000_26;
        this.l2 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS235S0300000_26(ECommerceVideoService eCommerceVideoService, InterfaceC1752840viM interfaceC1752840viM, View view, String str, int i) {
        super(1);
        this.$t = i;
        this.l0 = eCommerceVideoService;
        this.l1 = interfaceC1752840viM;
        this.l2 = view;
    }
}
