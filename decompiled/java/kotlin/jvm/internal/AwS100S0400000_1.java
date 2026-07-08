package kotlin.jvm.internal;

import X.AbstractDialogInterfaceC1397690mTX;
import X.C013C;
import X.C031A;
import X.C03DI;
import X.C03DZ;
import X.C03FC;
import X.C03IT;
import X.C03JV;
import X.C03OI;
import X.C03PI;
import X.C03QL;
import X.C03SE;
import X.C03WD;
import X.C03WH;
import X.C03YA;
import X.C03YI;
import X.C03YT;
import X.C03YU;
import X.C03ZA;
import X.C043B;
import X.C04E4;
import X.C04E5;
import X.C04E8;
import X.C04ET;
import X.C04EV;
import X.C062P;
import X.C09AY;
import X.C0H9H;
import X.C0WZX;
import X.C1018703yb;
import X.C10495048n;
import X.C10501048t;
import X.C10503048v;
import X.C10515049h;
import X.C1063304Dv;
import X.C1063604Dy;
import X.C118300cf;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1388190mED;
import X.C1397620mTQ;
import X.C1397630mTR;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C1841350y17;
import X.C19EG;
import X.C21588719eH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C259800zU;
import X.C300330Bpv;
import X.C427690Gpr;
import X.C430110Gtl;
import X.C719102rN;
import X.C756302xN;
import X.C770702zh;
import X.C7768031q;
import X.C786410Ut5;
import X.C806903Df;
import X.C807503Dl;
import X.C834300Wo8;
import X.C838103Pf;
import X.C854403Vm;
import X.C860903Xz;
import X.C870703aj;
import X.C879003c4;
import X.C884703cz;
import X.C888803de;
import X.C890103dr;
import X.C894203eW;
import X.C895103ef;
import X.C895203eg;
import X.C895303eh;
import X.C895703el;
import X.C899503fN;
import X.C903703g3;
import X.C903803g4;
import X.C908503gp;
import X.C915503hx;
import X.C921103ir;
import X.C926303jh;
import X.C926403ji;
import X.C926503jj;
import X.C926703jl;
import X.C927003jo;
import X.C933403kq;
import X.C939603lq;
import X.C939703lr;
import X.C942603mK;
import X.C943103mP;
import X.C958103op;
import X.C972903rD;
import X.EnumC884003cs;
import X.EnumC889603dm;
import X.InterfaceC1748810vbr;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS34S0300000_1;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import android.view.ViewParent;
import android.widget.RadioButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter$AddressViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSubViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentAddCardTypeConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.viewholder.ATMCCDCNormalViewHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.viewholder.ATMCardViewHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.viewholder.ATMDateViewHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCDateElementViewHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PrivacyButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PrivacyPopup;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopPromotionActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.payment.viewholder.ccdc.USBANormalElementVH2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomArea;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.view.btninterest.model.SeaPdpBottomBtnInterest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.PlatformLinkInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import ola.j;
import oqa.h;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class AwS100S0400000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        DialogContent dialogContent;
        Object obj2;
        String str;
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        ExceptionUX exceptionUX = paymentMethod.exceptionUX;
        String str2 = null;
        if (exceptionUX != null && (dialogContent = exceptionUX.dialogContent) != null) {
            PaymentViewModel paymentViewModel = (PaymentViewModel) awS100S0400000_1.l0;
            AwS402S0200000_1 awS402S0200000_1 = new AwS402S0200000_1(paymentViewModel, paymentMethod, 16);
            paymentViewModel.getClass();
            paymentViewModel.setState(new AwS367S0200000_1(dialogContent, (DialogContent) awS402S0200000_1, (Function0<Unit>) 101));
            String strLJJIIZ = ((PaymentMethod) awS100S0400000_1.l1).LJJIIZ();
            HashMap map = (HashMap) awS100S0400000_1.l2;
            if (map != null) {
                obj2 = map.get("previous_page");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            C03WD.LJ("account_security_guarantee", strLJJIIZ, null, null, str, null, null, 108);
        } else {
            ((PaymentViewModel) awS100S0400000_1.l0).MR2(paymentMethod);
        }
        C03WH c03wh = (C03WH) awS100S0400000_1.l3;
        if (c03wh != null) {
            String strLJJIIZ2 = paymentMethod.LJJIIZ();
            Boolean boolValueOf = Boolean.valueOf(C770702zh.LIZ(paymentMethod.extraInfo));
            BindInfo bindInfo = paymentMethod.bindInfo;
            if (bindInfo != null) {
                str2 = bindInfo.bindStatus;
            }
            C03WH.LJ(c03wh, strLJJIIZ2, boolValueOf, str2, Boolean.TRUE, paymentMethod, null, 32);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS100S0400000_1 r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS100S0400000_1.invoke$1(kotlin.jvm.internal.AwS100S0400000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$10(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        SubPaymentListFragment subPaymentListFragment = (SubPaymentListFragment) awS100S0400000_1.l0;
        String str = subPaymentListFragment.LLILZ;
        PaymentMethod paymentMethod = (PaymentMethod) awS100S0400000_1.l1;
        boolean z = subPaymentListFragment.LLILZIL;
        EnterParams enterParams = (EnterParams) awS100S0400000_1.l2;
        C926303jh c926303jh = (C926303jh) awS100S0400000_1.l3;
        Function0<Unit> function0MR = subPaymentListFragment.MR();
        SubPaymentListFragment subPaymentListFragment2 = (SubPaymentListFragment) awS100S0400000_1.l0;
        ((C062P) obj).LIZ = new C926503jj(str, paymentMethod, z, enterParams, c926303jh, function0MR, subPaymentListFragment2.LLIZ, subPaymentListFragment2.LLIZLLLIL, subPaymentListFragment2.LLILZLL);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        boolean z;
        ArrayList arrayList;
        PaymentInfo paymentInfoLIZ;
        PaymentMethodInfo paymentMethodInfo;
        PaymentMethodInfo paymentMethodInfo2;
        List<PaymentElement> list;
        List list2 = (List) obj;
        String strLIZIZ = C888803de.LIZIZ((ElementDTO) awS100S0400000_1.l0, (PaymentMethod) awS100S0400000_1.l1, list2, (PaymentMethodsData) awS100S0400000_1.l2);
        C884703cz c884703cz = (C884703cz) awS100S0400000_1.l3;
        if (strLIZIZ == null) {
            z = true;
        } else {
            z = false;
        }
        PaymentInfo paymentInfo = c884703cz.LLILLJJLI;
        if (paymentInfo != null && (paymentMethodInfo2 = paymentInfo.paymentMethodInfo) != null && (list = paymentMethodInfo2.paymentElements) != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        Iterator it2 = list2.iterator();
        while (true) {
            paymentInfoLIZ = null;
            Object obj2 = null;
            if (!it2.hasNext()) {
                break;
            }
            PaymentElement paymentElement = (PaymentElement) it2.next();
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (Intrinsics.LJFF(((PaymentElement) next).element, paymentElement.element)) {
                    obj2 = next;
                    break;
                }
            }
            PaymentElement paymentElement2 = (PaymentElement) obj2;
            if (paymentElement2 != null) {
                paymentElement2.setParamValue(paymentElement.paramValue);
            } else {
                arrayList.add(paymentElement);
            }
        }
        PaymentInfo paymentInfo2 = c884703cz.LLILLJJLI;
        if (paymentInfo2 != null && (paymentInfoLIZ = PaymentInfo.LIZ(paymentInfo2, null, null, null, null, null, null, null, 2047)) != null) {
            PaymentMethodInfo paymentMethodInfo3 = paymentInfoLIZ.paymentMethodInfo;
            if (paymentMethodInfo3 != null) {
                paymentMethodInfo3.setPaymentElements(arrayList);
            }
            paymentInfoLIZ.isValid = Boolean.valueOf(z);
        }
        c884703cz.LLILZIL.invoke(paymentInfoLIZ);
        PaymentInfo paymentInfo3 = c884703cz.LLILLJJLI;
        if (paymentInfo3 != null && (paymentMethodInfo = paymentInfo3.paymentMethodInfo) != null) {
            paymentMethodInfo.setPaymentElements(arrayList);
        }
        PaymentInfo paymentInfo4 = c884703cz.LLILLJJLI;
        if (paymentInfo4 != null) {
            paymentInfo4.isValid = Boolean.valueOf(z);
        }
        ((C884703cz) awS100S0400000_1.l3).getLogVerify().invoke(strLIZIZ);
        return strLIZIZ;
    }

    public static final Object invoke$12(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        Integer num;
        FetchInfo fetchInfo = (FetchInfo) obj;
        if (fetchInfo != null && (num = fetchInfo.fetchAPI) != null && num.intValue() == 3) {
            ((C03PI) awS100S0400000_1.l0).LJII((PaymentInfo) awS100S0400000_1.l1, fetchInfo.serverIssuedParams, null, (View) awS100S0400000_1.l2, new AwS545S0100000_1((Function0) awS100S0400000_1.l3, (Function0<Unit>) 1232));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        long jElapsedRealtime;
        C834300Wo8 c834300Wo8 = (C834300Wo8) obj;
        Map<String, Long> map = C838103Pf.LIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Long l = (Long) linkedHashMap.get("google_pay");
        if (l != null) {
            long jLongValue = l.longValue();
            map.remove("google_pay");
            jElapsedRealtime = SystemClock.elapsedRealtime() - jLongValue;
        } else {
            jElapsedRealtime = 0;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap<String, Object> linkedHashMap3 = C838103Pf.LIZIZ;
        linkedHashMap2.putAll(linkedHashMap3);
        linkedHashMap2.put("page_name", "google_pay");
        linkedHashMap2.put("stay_time", Long.valueOf(jElapsedRealtime));
        Object obj2 = linkedHashMap3.get("page_name");
        if (obj2 != null) {
            linkedHashMap2.put("previous_page", obj2);
        }
        linkedHashMap2.put("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        C1018703yb.LIZIZ("tiktokec_stay_page", linkedHashMap2);
        linkedHashMap.clear();
        linkedHashMap3.clear();
        C03PI c03pi = (C03PI) awS100S0400000_1.l0;
        c03pi.getClass();
        if (c834300Wo8.LIZ == C03YA.Success) {
            JSONArray jSONArray = c834300Wo8.LIZJ;
            if (jSONArray != null) {
                GooglePayProcess googlePayProcess = GooglePayProcess.LIZ;
                PaymentInfo paymentInfo = (PaymentInfo) awS100S0400000_1.l1;
                googlePayProcess.getClass();
                PaymentInfo paymentInfoLJII = GooglePayProcess.LJII(paymentInfo, jSONArray);
                if (paymentInfoLJII != null) {
                    C03PI c03pi2 = (C03PI) awS100S0400000_1.l0;
                    Boolean bool = (Boolean) awS100S0400000_1.l2;
                    PaymentHalfFragment paymentHalfFragment = (PaymentHalfFragment) awS100S0400000_1.l3;
                    c03pi2.LJII(paymentInfoLJII, null, bool, paymentHalfFragment.getView(), new AwS545S0100000_1(paymentHalfFragment, 1253));
                }
            }
        } else {
            GooglePayProcess.LIZ.getClass();
            String string = null;
            if (GooglePayProcess.LJFF.contains(c834300Wo8.LIZ)) {
                C921103ir c921103ir = C921103ir.LIZ;
                c921103ir.getClass();
                if (C921103ir.LJII()) {
                    Context context = c03pi.LIZ;
                    c921103ir.getClass();
                    C921103ir.LIZLLL(context, "9900503", "order_submit", null, null);
                } else {
                    Resources resources = c03pi.LIZ.getResources();
                    if (resources != null) {
                        string = resources.getString(2131832528);
                    }
                    c03pi.LJIIJ(string);
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        String str;
        Map<String, String> map;
        int i;
        Long l;
        int i2;
        Announcement announcement = (Announcement) obj;
        int i3 = 8;
        C786410Ut5.LJLLLLLL(8, ((C807503Dl) awS100S0400000_1.l0).LLILLL);
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(announcement.daInfo);
        Integer num = announcement.materialType;
        if (num != null) {
            if (num.intValue() == 4) {
                C786410Ut5.LJLLLLLL(0, ((C807503Dl) awS100S0400000_1.l0).LL);
                C807503Dl c807503Dl = (C807503Dl) awS100S0400000_1.l0;
                SeaPdpFragment seaPdpFragment = (SeaPdpFragment) awS100S0400000_1.l1;
                SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) awS100S0400000_1.l2;
                c807503Dl.getClass();
                Long l2 = announcement.maxTextLine;
                if (l2 != null) {
                    c807503Dl.LLILZ.setMaxLines((int) l2.longValue());
                }
                C430110Gtl.LIZ(c807503Dl.LLILZ, new AwS245S0300000_1(announcement, seaPdpFragment, seaPdpViewModel, c807503Dl, 19));
                String str2 = announcement.text;
                if (str2 != null) {
                    ((C807503Dl) awS100S0400000_1.l0).LLILZ.setText(str2);
                }
                Image image = announcement.icon;
                if (image != null) {
                    C807503Dl c807503Dl2 = (C807503Dl) awS100S0400000_1.l0;
                    C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                    C03IT imageUrlModel = image.toImageUrlModel();
                    c1326790kdB.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
                    c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.ee, c807503Dl2.getContext()));
                    c1331670kl3LIZLLL.LJJI(c807503Dl2.LLILZIL);
                    C786410Ut5.h3(c1331670kl3LIZLLL);
                }
            } else {
                int iLongValue = 2;
                if (num != null) {
                    if (num.intValue() == 11) {
                        C786410Ut5.LJLLLLLL(0, ((C807503Dl) awS100S0400000_1.l0).LLILLJJLI);
                        C807503Dl c807503Dl3 = (C807503Dl) awS100S0400000_1.l0;
                        c807503Dl3.LLILZLL.setText(RichTextUtil.LJFF(RichTextUtil.LIZ, c807503Dl3.getContext(), announcement.text, announcement.arguments, Integer.valueOf(R.attr.g2), 40));
                        TuxTextView tuxTextView = ((C807503Dl) awS100S0400000_1.l0).LLILZLL;
                        Long l3 = announcement.maxTextLine;
                        if (l3 != null) {
                            iLongValue = (int) l3.longValue();
                        }
                        tuxTextView.setMaxLines(iLongValue);
                        TuxIconView tuxIconView = ((C807503Dl) awS100S0400000_1.l0).LLIZ;
                        if (announcement.background != null) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        C786410Ut5.LJLLLLLL(i2, tuxIconView);
                        TuxIconView tuxIconView2 = ((C807503Dl) awS100S0400000_1.l0).LLIZLLLIL;
                        if (announcement.icon != null) {
                            i3 = 0;
                        }
                        C786410Ut5.LJLLLLLL(i3, tuxIconView2);
                        Image image2 = announcement.icon;
                        if (image2 != null) {
                            C807503Dl c807503Dl4 = (C807503Dl) awS100S0400000_1.l0;
                            C1326790kdB c1326790kdB2 = C1326790kdB.LIZ;
                            C03IT imageUrlModel2 = image2.toImageUrlModel();
                            c1326790kdB2.getClass();
                            C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(imageUrlModel2);
                            c1331670kl3LIZLLL2.LJJI(c807503Dl4.LLIZLLLIL);
                            C786410Ut5.h3(c1331670kl3LIZLLL2);
                        }
                        SeaPdpFragment seaPdpFragment2 = (SeaPdpFragment) awS100S0400000_1.l1;
                        if ((seaPdpFragment2 instanceof InterfaceC1748810vbr) && seaPdpFragment2 != null) {
                            ((C807503Dl) awS100S0400000_1.l0).getClass();
                            C1748720vbi.LIZIZ(seaPdpFragment2, new C10515049h(), new AwS115S1100000_1(mapLJIIJ, 27));
                        }
                        if (Intrinsics.LJFF(announcement.closeable, Boolean.TRUE)) {
                            C807503Dl c807503Dl5 = (C807503Dl) awS100S0400000_1.l0;
                            C786410Ut5.I7(new AjS20S0300000_1(c807503Dl5, (SeaPdpFragment) awS100S0400000_1.l1, mapLJIIJ, 13), c807503Dl5.LLJ);
                        }
                    } else if (num.intValue() == 8) {
                        C786410Ut5.LJLLLLLL(0, ((C807503Dl) awS100S0400000_1.l0).LLJI);
                        C807503Dl c807503Dl6 = (C807503Dl) awS100S0400000_1.l0;
                        TuxTextView tuxTextView2 = c807503Dl6.LLJIJIL;
                        RichTextUtil richTextUtil = RichTextUtil.LIZ;
                        Context context = c807503Dl6.getContext();
                        Announcement announcement2 = (Announcement) awS100S0400000_1.l3;
                        if (announcement2 != null) {
                            str = announcement2.text;
                            map = announcement2.arguments;
                        } else {
                            str = null;
                            map = null;
                        }
                        tuxTextView2.setText(RichTextUtil.LJFF(richTextUtil, context, str, map, null, 56));
                        TuxTextView tuxTextView3 = ((C807503Dl) awS100S0400000_1.l0).LLJIJIL;
                        Announcement announcement3 = (Announcement) awS100S0400000_1.l3;
                        if (announcement3 != null && (l = announcement3.maxTextLine) != null) {
                            iLongValue = (int) l.longValue();
                        }
                        tuxTextView3.setMaxLines(iLongValue);
                        TuxIconView tuxIconView3 = ((C807503Dl) awS100S0400000_1.l0).LLJILJIL;
                        if (announcement.background != null) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        C786410Ut5.LJLLLLLL(i, tuxIconView3);
                        Image image3 = announcement.background;
                        if (image3 != null) {
                            C807503Dl c807503Dl7 = (C807503Dl) awS100S0400000_1.l0;
                            C1326790kdB c1326790kdB3 = C1326790kdB.LIZ;
                            C03IT thumbFirstImageUrlModel = image3.toThumbFirstImageUrlModel();
                            c1326790kdB3.getClass();
                            C1331670kl3 c1331670kl3LIZLLL3 = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
                            c1331670kl3LIZLLL3.LJJI(c807503Dl7.LLJILJIL);
                            C786410Ut5.h3(c1331670kl3LIZLLL3);
                        }
                        TuxIconView tuxIconView4 = ((C807503Dl) awS100S0400000_1.l0).LLJILJILJ;
                        if (announcement.icon != null) {
                            i3 = 0;
                        }
                        C786410Ut5.LJLLLLLL(i3, tuxIconView4);
                        Image image4 = announcement.icon;
                        if (image4 != null) {
                            C807503Dl c807503Dl8 = (C807503Dl) awS100S0400000_1.l0;
                            C1326790kdB c1326790kdB4 = C1326790kdB.LIZ;
                            C03IT thumbFirstImageUrlModel2 = image4.toThumbFirstImageUrlModel();
                            c1326790kdB4.getClass();
                            C1331670kl3 c1331670kl3LIZLLL4 = C1326790kdB.LIZLLL(thumbFirstImageUrlModel2);
                            c1331670kl3LIZLLL4.LJJI(c807503Dl8.LLJILJILJ);
                            C786410Ut5.h3(c1331670kl3LIZLLL4);
                        }
                        SeaPdpFragment seaPdpFragment3 = (SeaPdpFragment) awS100S0400000_1.l1;
                        if ((seaPdpFragment3 instanceof InterfaceC1748810vbr) && seaPdpFragment3 != null) {
                            ((C807503Dl) awS100S0400000_1.l0).getClass();
                            C1748720vbi.LIZIZ(seaPdpFragment3, new C10515049h(), new AwS115S1100000_1(mapLJIIJ, 27));
                        }
                        C807503Dl c807503Dl9 = (C807503Dl) awS100S0400000_1.l0;
                        C786410Ut5.I7(new AjS20S0300000_1(c807503Dl9, (SeaPdpFragment) awS100S0400000_1.l1, mapLJIIJ, 14), c807503Dl9.LLJILLL);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        C03JV c03jv = (C03JV) obj;
        List<InterfaceC1891350zJl> list = c03jv.LLILLJJLI;
        C031A c031a = (C031A) awS100S0400000_1.l0;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS100S0400000_1.l1;
        C259800zU c259800zU = (C259800zU) awS100S0400000_1.l2;
        C7768031q c7768031q = (C7768031q) awS100S0400000_1.l3;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Object objLIZIZ : list) {
            if ((objLIZIZ instanceof C031A) && c031a != null) {
                objLIZIZ = new C031A(C7768031q.LIZIZ(c031a.LLILZLL, orderSubmitAssemViewModel.LLJJJ, new CopyOnWriteArrayList((Collection) c259800zU.element), null, 524281), ((C031A) objLIZIZ).LLIZ);
            } else if ((objLIZIZ instanceof C7768031q) && c7768031q != null) {
                objLIZIZ = C7768031q.LIZIZ(c7768031q, orderSubmitAssemViewModel.LLJJJ, new CopyOnWriteArrayList((Collection) c259800zU.element), null, 524281);
            }
            arrayList.add(objLIZIZ);
        }
        return C03JV.LIZ(c03jv, 0, arrayList, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -3, -1, -1, 1048575);
    }

    public static final Object invoke$16(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        boolean z;
        AddressListState addressListState = (AddressListState) obj;
        if (((AddressAdapter$AddressViewHolder) awS100S0400000_1.l0).W5().d41() || ((AddressAdapter$AddressViewHolder) awS100S0400000_1.l0).X5()) {
            RadioButton radioFromXml = ((C972903rD) awS100S0400000_1.l1).getRadioFromXml();
            if (!((ReachableAddress) awS100S0400000_1.l2).isSelect && !Intrinsics.LJFF(addressListState.getSelectAddressId(), ((Address) awS100S0400000_1.l3).id)) {
                z = false;
            } else {
                z = true;
            }
            radioFromXml.setChecked(z);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        Object string;
        int i;
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "address");
        Integer num = ((ReachableAddress) awS100S0400000_1.l0).addressInvalidType;
        Object obj3 = null;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        laneParams.plusAssign("invalid_reason", string);
        laneParams.plusAssign("is_address_deliverable", Integer.valueOf(((C972903rD) awS100S0400000_1.l1).getReachable() ? 1 : 0));
        laneParams.plusAssign("is_default", Integer.valueOf(((Address) awS100S0400000_1.l2).LJII() ? 1 : 0));
        if (((AddressAdapter$AddressViewHolder) awS100S0400000_1.l3).W5().xW()) {
            i = ((AddressAdapter$AddressViewHolder) awS100S0400000_1.l3).LLJI;
        } else {
            i = ((AddressAdapter$AddressViewHolder) awS100S0400000_1.l3).LLJI - 1;
        }
        laneParams.plusAssign("rank", Integer.valueOf(i));
        laneParams.plusAssign("is_selected", Integer.valueOf(((ReachableAddress) awS100S0400000_1.l0).isSelect ? 1 : 0));
        laneParams.plusAssign("is_valid", Integer.valueOf(((ReachableAddress) awS100S0400000_1.l0).LIZIZ()));
        Map<String, String> map = ((ReachableAddress) awS100S0400000_1.l0).daInfo;
        if (map != null && (obj2 = map.get("invalid_reason_code")) != null) {
            obj3 = obj2;
        }
        laneParams.plusAssign("invalid_reason_code", obj3);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS100S0400000_1 awS100S0400000_1, Object obj) throws Throwable {
        int length;
        List<PaymentElement> list = (List) obj;
        Editable editableLLJILLL = C2204961BRm.LLJILLL(((C943103mP) awS100S0400000_1.l0).getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Zl5N7id7IIde9k7qEy4CNx5ct90pC4PrChJMDdDWA7A4taiineb6HdL", null));
        boolean z = false;
        if (editableLLJILLL != null) {
            length = editableLLJILLL.length();
        } else {
            length = 0;
        }
        ATMCCDCNormalViewHolderV2 aTMCCDCNormalViewHolderV2 = (ATMCCDCNormalViewHolderV2) awS100S0400000_1.l1;
        String strXQ2 = ATMCardViewModel.xQ2(aTMCCDCNormalViewHolderV2.I5(), length - aTMCCDCNormalViewHolderV2.LLILLJJLI);
        C903803g4.LIZ.getClass();
        C903703g3 c903703g3 = C903803g4.LIZIZ;
        String str = ((ElementDTO) awS100S0400000_1.l2).id;
        if (str == null) {
            str = "";
        }
        String strLIZLLL = c903703g3.LIZLLL(str, list);
        ((C895103ef) awS100S0400000_1.l3).LLILLJJLI.LIZJ = strLIZLLL;
        C890103dr c890103dr = C890103dr.LIZ;
        String str2 = ((ElementDTO) awS100S0400000_1.l2).paramName;
        c890103dr.getClass();
        String strLJIIZILJ = C890103dr.LJIIZILJ(str2);
        long jLIZ = C890103dr.LIZ(((ElementDTO) awS100S0400000_1.l2).paramName);
        if (strLIZLLL == null) {
            z = true;
        }
        C890103dr.LJIIJJI(jLIZ, Boolean.valueOf(z), strLJIIZILJ, strXQ2);
        return strLIZLLL;
    }

    public static final Object invoke$19(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        String str;
        RecyclerView recyclerView;
        List<PaymentElement> list = (List) obj;
        ((ATMCardViewHolderV2) awS100S0400000_1.l0).L5().yQ2().LJFF(new AwS580S0100000_1((C933403kq) awS100S0400000_1.l3, 541));
        C903803g4.LIZ.getClass();
        C903703g3 c903703g3 = C903803g4.LIZIZ;
        PaymentElement paymentElement = (PaymentElement) C13LP.LJJJLZIJ(0, list);
        if (paymentElement != null) {
            str = paymentElement.paramValue;
        } else {
            str = null;
        }
        PaymentMethod paymentMethodLIZIZ = c903703g3.LIZIZ(str);
        if (paymentMethodLIZIZ != null) {
            String str2 = paymentMethodLIZIZ.id;
            if (str2 != null) {
                ATMCardViewHolderV2 aTMCardViewHolderV2 = (ATMCardViewHolderV2) awS100S0400000_1.l0;
                C933403kq c933403kq = (C933403kq) awS100S0400000_1.l3;
                aTMCardViewHolderV2.getClass();
                if (!Intrinsics.LJFF(str2, null)) {
                    ATMCardViewModel aTMCardViewModelL5 = aTMCardViewHolderV2.L5();
                    aTMCardViewModelL5.withState(new AwS367S0200000_1(paymentMethodLIZIZ, aTMCardViewModelL5, 198));
                    c933403kq.setCurrentPaymentId(str2);
                }
                aTMCardViewHolderV2.L5().LLILLL = paymentMethodLIZIZ;
            }
            String str3 = paymentMethodLIZIZ.iconUrl;
            if (str3 != null) {
                ((C933403kq) awS100S0400000_1.l3).LJII(Collections.singletonList(str3));
            }
        }
        ATMCardViewModel aTMCardViewModelL52 = ((ATMCardViewHolderV2) awS100S0400000_1.l0).L5();
        ElementDTO elementDTO = (ElementDTO) awS100S0400000_1.l1;
        PaymentMethod paymentMethod = (PaymentMethod) awS100S0400000_1.l2;
        ViewParent parent = ((ATMCardViewHolderV2) awS100S0400000_1.l0).itemView.getParent();
        if (parent instanceof RecyclerView) {
            recyclerView = (RecyclerView) parent;
        } else {
            recyclerView = null;
        }
        aTMCardViewModelL52.CQ2(elementDTO, paymentMethod, list, recyclerView, ((ATMCardViewHolderV2) awS100S0400000_1.l0).l());
        ATMCardViewModel aTMCardViewModelL53 = ((ATMCardViewHolderV2) awS100S0400000_1.l0).L5();
        String str4 = ((ElementDTO) awS100S0400000_1.l1).id;
        if (str4 == null) {
            str4 = "";
        }
        aTMCardViewModelL53.LLJ.put(str4, list);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        RecyclerView recyclerView;
        List<PaymentElement> list = (List) obj;
        ((ATMDateViewHolderV2) awS100S0400000_1.l0).L5().yQ2().LJFF(new AwS580S0100000_1((C942603mK) awS100S0400000_1.l3, 542));
        ATMDateViewHolderV2.LLILLL.getClass();
        List<PaymentElement> listLIZ = C895703el.LIZ(list);
        ATMCardViewModel aTMCardViewModelL5 = ((ATMDateViewHolderV2) awS100S0400000_1.l0).L5();
        ElementDTO elementDTO = (ElementDTO) awS100S0400000_1.l1;
        PaymentMethod paymentMethod = (PaymentMethod) awS100S0400000_1.l2;
        ViewParent parent = ((ATMDateViewHolderV2) awS100S0400000_1.l0).itemView.getParent();
        if (parent instanceof RecyclerView) {
            recyclerView = (RecyclerView) parent;
        } else {
            recyclerView = null;
        }
        aTMCardViewModelL5.CQ2(elementDTO, paymentMethod, listLIZ, recyclerView, ((ATMDateViewHolderV2) awS100S0400000_1.l0).l());
        ATMCardViewModel aTMCardViewModelL52 = ((ATMDateViewHolderV2) awS100S0400000_1.l0).L5();
        String str = ((ElementDTO) awS100S0400000_1.l1).id;
        if (str == null) {
            str = "";
        }
        aTMCardViewModelL52.LLJ.put(str, list);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS100S0400000_1 awS100S0400000_1, Object obj) throws Throwable {
        int length;
        List<PaymentElement> list = (List) obj;
        Editable editableLLJILLL = C2204961BRm.LLJILLL(((C933403kq) awS100S0400000_1.l0).getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Zl5N7id7IIde9k7qEy4CNx5ct90hhgotC5eKh7z+eFDm5M1", null));
        boolean z = false;
        if (editableLLJILLL != null) {
            length = editableLLJILLL.length();
        } else {
            length = 0;
        }
        ATMCardViewHolderV2 aTMCardViewHolderV2 = (ATMCardViewHolderV2) awS100S0400000_1.l1;
        String strXQ2 = ATMCardViewModel.xQ2(aTMCardViewHolderV2.L5(), length - aTMCardViewHolderV2.LLILLJJLI);
        C903803g4.LIZ.getClass();
        C903703g3 c903703g3 = C903803g4.LIZIZ;
        String str = ((ElementDTO) awS100S0400000_1.l2).id;
        if (str == null) {
            str = "";
        }
        String strLIZLLL = c903703g3.LIZLLL(str, list);
        ((C895303eh) awS100S0400000_1.l3).LLILLJJLI.LIZJ = strLIZLLL;
        C890103dr c890103dr = C890103dr.LIZ;
        String str2 = ((ElementDTO) awS100S0400000_1.l2).paramName;
        c890103dr.getClass();
        String strLJIIZILJ = C890103dr.LJIIZILJ(str2);
        long jLIZ = C890103dr.LIZ(((ElementDTO) awS100S0400000_1.l2).paramName);
        if (strLIZLLL == null) {
            z = true;
        }
        C890103dr.LJIIJJI(jLIZ, Boolean.valueOf(z), strLJIIZILJ, strXQ2);
        return strLIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$21(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        boolean z;
        EnumC884003cs enumC884003cs = (EnumC884003cs) obj;
        CCDCAddCardViewModel cCDCAddCardViewModel = (CCDCAddCardViewModel) awS100S0400000_1.l0;
        EnumC884003cs enumC884003cs2 = EnumC884003cs.CLICK_SAVE;
        boolean z2 = true;
        if (enumC884003cs == enumC884003cs2) {
            z = true;
        } else {
            z = false;
        }
        cCDCAddCardViewModel.getClass();
        cCDCAddCardViewModel.setState(new AwS16S0010000_1(z, 31));
        PaymentMethodInfo paymentMethodInfoCopy = null;
        if (((CCDCAddCardViewModel) awS100S0400000_1.l0).bR2((PaymentInfo) awS100S0400000_1.l1)) {
            CCDCAddCardViewModel cCDCAddCardViewModel2 = (CCDCAddCardViewModel) awS100S0400000_1.l0;
            String str = (String) ((C259800zU) awS100S0400000_1.l2).element;
            PaymentInfo paymentInfo = (PaymentInfo) awS100S0400000_1.l1;
            PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
            if (paymentMethodInfo != null) {
                if (enumC884003cs != enumC884003cs2) {
                    z2 = false;
                }
                paymentMethodInfoCopy = paymentMethodInfo.copy(paymentMethodInfo.id, paymentMethodInfo.token, paymentMethodInfo.paymentElements, Boolean.valueOf(z2), paymentMethodInfo.tenure, paymentMethodInfo.installmentPlanId, paymentMethodInfo.installmentOptionId, paymentMethodInfo.consultationId, paymentMethodInfo.isOneClickPay, paymentMethodInfo.isOneClickPayReselect, paymentMethodInfo.bankCode, paymentMethodInfo.bankName, paymentMethodInfo.installmentPlan, paymentMethodInfo.hideMarketingAmount, paymentMethodInfo.tenureCycle, paymentMethodInfo.paymentPriceParam, paymentMethodInfo.isAnchored);
            }
            cCDCAddCardViewModel2.yQ2(str, PaymentInfo.LIZ(paymentInfo, paymentMethodInfoCopy, null, null, null, null, null, null, 2046), (List) awS100S0400000_1.l3, ((CCDCAddCardViewModel) awS100S0400000_1.l0).LLILLL);
        } else {
            CCDCAddCardViewModel cCDCAddCardViewModel3 = (CCDCAddCardViewModel) awS100S0400000_1.l0;
            PaymentInfo paymentInfo2 = (PaymentInfo) awS100S0400000_1.l1;
            PaymentMethodInfo paymentMethodInfo2 = paymentInfo2.paymentMethodInfo;
            if (paymentMethodInfo2 != null) {
                if (enumC884003cs != enumC884003cs2) {
                    z2 = false;
                }
                paymentMethodInfoCopy = paymentMethodInfo2.copy(paymentMethodInfo2.id, paymentMethodInfo2.token, paymentMethodInfo2.paymentElements, Boolean.valueOf(z2), paymentMethodInfo2.tenure, paymentMethodInfo2.installmentPlanId, paymentMethodInfo2.installmentOptionId, paymentMethodInfo2.consultationId, paymentMethodInfo2.isOneClickPay, paymentMethodInfo2.isOneClickPayReselect, paymentMethodInfo2.bankCode, paymentMethodInfo2.bankName, paymentMethodInfo2.installmentPlan, paymentMethodInfo2.hideMarketingAmount, paymentMethodInfo2.tenureCycle, paymentMethodInfo2.paymentPriceParam, paymentMethodInfo2.isAnchored);
            }
            cCDCAddCardViewModel3.zQ2(PaymentInfo.LIZ(paymentInfo2, paymentMethodInfoCopy, null, null, null, null, null, null, 2046), ((CCDCAddCardViewModel) awS100S0400000_1.l0).LLILLL, (List) awS100S0400000_1.l3);
        }
        C879003c4.LIZIZ(enumC884003cs);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$22(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        boolean z;
        if (obj == EnumC884003cs.CLICK_SAVE) {
            z = true;
        } else {
            z = false;
        }
        CCDCAddCardViewModel cCDCAddCardViewModel = (CCDCAddCardViewModel) awS100S0400000_1.l0;
        cCDCAddCardViewModel.getClass();
        cCDCAddCardViewModel.setState(new AwS16S0010000_1(z, 31));
        PaymentMethodInfo paymentMethodInfoCopy = null;
        if (z) {
            CCDCAddCardViewModel cCDCAddCardViewModel2 = (CCDCAddCardViewModel) awS100S0400000_1.l0;
            String str = (String) ((C259800zU) awS100S0400000_1.l1).element;
            PaymentInfo paymentInfo = (PaymentInfo) awS100S0400000_1.l2;
            PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
            if (paymentMethodInfo != null) {
                paymentMethodInfoCopy = paymentMethodInfo.copy(paymentMethodInfo.id, paymentMethodInfo.token, paymentMethodInfo.paymentElements, Boolean.TRUE, paymentMethodInfo.tenure, paymentMethodInfo.installmentPlanId, paymentMethodInfo.installmentOptionId, paymentMethodInfo.consultationId, paymentMethodInfo.isOneClickPay, paymentMethodInfo.isOneClickPayReselect, paymentMethodInfo.bankCode, paymentMethodInfo.bankName, paymentMethodInfo.installmentPlan, paymentMethodInfo.hideMarketingAmount, paymentMethodInfo.tenureCycle, paymentMethodInfo.paymentPriceParam, paymentMethodInfo.isAnchored);
            }
            cCDCAddCardViewModel2.wQ2(PaymentInfo.LIZ(paymentInfo, paymentMethodInfoCopy, null, null, null, null, null, null, 2046), str, (List) awS100S0400000_1.l3);
        } else {
            PaymentInfo paymentInfo2 = (PaymentInfo) awS100S0400000_1.l2;
            PaymentMethod paymentMethod = paymentInfo2.paymentMethod;
            if (paymentMethod != null) {
                paymentMethod.promotionInfo = null;
            }
            ((CCDCAddCardViewModel) awS100S0400000_1.l0).wQ2(paymentInfo2, (String) ((C259800zU) awS100S0400000_1.l1).element, (List) awS100S0400000_1.l3);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$23(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        boolean z;
        C926703jl c926703jl = (C926703jl) obj;
        SubPaymentListAssem subPaymentListAssem = (SubPaymentListAssem) awS100S0400000_1.l0;
        List list = (List) awS100S0400000_1.l1;
        PaymentMethod paymentMethod = (PaymentMethod) awS100S0400000_1.l3;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            View viewFindViewById = null;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    PaymentMethod paymentMethod2 = (PaymentMethod) next;
                    boolean zLIZIZ = C899503fN.LIZIZ(paymentMethod2, c926703jl.LLILZ);
                    C926303jh c926303jh = subPaymentListAssem.Jo().LLILZIL;
                    C927003jo c927003jo = subPaymentListAssem.Jo().LLIZ;
                    if (c927003jo != null && c927003jo.LIZLLL) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new C926403ji(paymentMethod, paymentMethod2, zLIZIZ, c926303jh, z));
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                subPaymentListAssem.LLJJIJI = arrayList;
                View viewLJJIJL = ((UIAssem) awS100S0400000_1.l2).LJJIJL();
                if (viewLJJIJL != null) {
                    viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewLJJIJL.findViewById(R.id.qjx);
                } else {
                    viewOnAttachStateChangeListenerC20604515jv = null;
                }
                viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(((SubPaymentListAssem) awS100S0400000_1.l0).LLJJIJI, null);
                View viewLJJIJL2 = ((UIAssem) awS100S0400000_1.l2).LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById = viewLJJIJL2.findViewById(R.id.m6w);
                }
                if (!((ArrayList) ((SubPaymentListAssem) awS100S0400000_1.l0).LLJJIJI).isEmpty()) {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, viewFindViewById);
                return Unit.LIZ;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$24(kotlin.jvm.internal.AwS100S0400000_1 r9, java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS100S0400000_1.invoke$24(kotlin.jvm.internal.AwS100S0400000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$25(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        String str;
        HashMap map = (HashMap) obj;
        map.put("button_name", "add_num");
        map.put("sku_id", ((C939703lr) awS100S0400000_1.l0).LLIZ);
        C719102rN c719102rN = ((C939703lr) awS100S0400000_1.l0).LLJJI;
        if (c719102rN != null && (str = c719102rN.LLLLIL) != null) {
            map.put("product_id", str);
        }
        map.put("num_before", Integer.valueOf(((C118300cf) awS100S0400000_1.l1).element));
        map.put("num_after", Integer.valueOf(((C118300cf) awS100S0400000_1.l2).element));
        map.put("button_type", ((C259800zU) awS100S0400000_1.l3).element);
        map.putAll(((C939703lr) awS100S0400000_1.l0).LLIZLLLIL);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        String str;
        int i;
        ShopPromotionActivity shopPromotionActivity;
        String str2;
        HashMap<String, Object> mapLJIIJ;
        PlatformLinkInfo platformLinkInfo;
        String str3;
        PlatformLinkInfo platformLinkInfo2;
        String str4;
        HashMap map = (HashMap) obj;
        map.putAll(((C939603lq) awS100S0400000_1.l0).LLJJJIL);
        map.put("button_name", "add_num");
        map.put("sku_id", ((C939603lq) awS100S0400000_1.l0).LLIZLLLIL);
        map.put("seller_sku_id", ((C939603lq) awS100S0400000_1.l0).LLIZLLLIL);
        C719102rN c719102rN = ((C939603lq) awS100S0400000_1.l0).LLJJIII;
        if (c719102rN != null && (str4 = c719102rN.LLLLIL) != null) {
            map.put("product_id", str4);
            map.put("seller_product_id", str4);
        }
        map.put("num_before", Integer.valueOf(((C118300cf) awS100S0400000_1.l1).element));
        map.put("num_after", Integer.valueOf(((C118300cf) awS100S0400000_1.l2).element));
        map.put("button_type", ((C259800zU) awS100S0400000_1.l3).element);
        C719102rN c719102rN2 = ((C939603lq) awS100S0400000_1.l0).LLJJIII;
        String str5 = "";
        if (c719102rN2 == null || (platformLinkInfo2 = c719102rN2.LLJLLL) == null || (str = platformLinkInfo2.productId) == null) {
            str = "";
        }
        map.put("platform_product_id", str);
        C719102rN c719102rN3 = ((C939603lq) awS100S0400000_1.l0).LLJJIII;
        if (c719102rN3 != null && (platformLinkInfo = c719102rN3.LLJLLL) != null && (str3 = platformLinkInfo.skuId) != null) {
            str5 = str3;
        }
        map.put("platform_sku_id", str5);
        C719102rN c719102rN4 = ((C939603lq) awS100S0400000_1.l0).LLJJIII;
        if (c719102rN4 != null && c719102rN4.LLJLLL != null) {
            i = 1;
        } else {
            i = 0;
        }
        map.put("is_platform_product", Integer.valueOf(i));
        map.putAll(((C939603lq) awS100S0400000_1.l0).LLJ);
        C719102rN c719102rN5 = ((C939603lq) awS100S0400000_1.l0).LLJJIII;
        if (c719102rN5 != null && (shopPromotionActivity = c719102rN5.LLLLLLJ) != null && (str2 = shopPromotionActivity.logExtra) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
            map.putAll(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        String str;
        int i;
        ShopPromotionActivity shopPromotionActivity;
        String str2;
        HashMap<String, Object> mapLJIIJ;
        PlatformLinkInfo platformLinkInfo;
        String str3;
        PlatformLinkInfo platformLinkInfo2;
        String str4;
        HashMap map = (HashMap) obj;
        map.putAll(((C939603lq) awS100S0400000_1.l0).LLJJJIL);
        map.put("button_name", "minus_num");
        map.put("sku_id", ((C939603lq) awS100S0400000_1.l0).LLIZLLLIL);
        map.put("seller_sku_id", ((C939603lq) awS100S0400000_1.l0).LLIZLLLIL);
        C719102rN c719102rN = ((C939603lq) awS100S0400000_1.l0).LLJJIII;
        if (c719102rN != null && (str4 = c719102rN.LLLLIL) != null) {
            map.put("product_id", str4);
            map.put("seller_product_id", str4);
        }
        map.put("num_before", Integer.valueOf(((C118300cf) awS100S0400000_1.l1).element));
        map.put("num_after", Integer.valueOf(((C118300cf) awS100S0400000_1.l2).element));
        map.put("button_type", ((C259800zU) awS100S0400000_1.l3).element);
        C719102rN c719102rN2 = ((C939603lq) awS100S0400000_1.l0).LLJJIII;
        String str5 = "";
        if (c719102rN2 == null || (platformLinkInfo2 = c719102rN2.LLJLLL) == null || (str = platformLinkInfo2.productId) == null) {
            str = "";
        }
        map.put("platform_product_id", str);
        C719102rN c719102rN3 = ((C939603lq) awS100S0400000_1.l0).LLJJIII;
        if (c719102rN3 != null && (platformLinkInfo = c719102rN3.LLJLLL) != null && (str3 = platformLinkInfo.skuId) != null) {
            str5 = str3;
        }
        map.put("platform_sku_id", str5);
        C719102rN c719102rN4 = ((C939603lq) awS100S0400000_1.l0).LLJJIII;
        if (c719102rN4 != null && c719102rN4.LLJLLL != null) {
            i = 1;
        } else {
            i = 0;
        }
        map.put("is_platform_product", Integer.valueOf(i));
        map.putAll(((C939603lq) awS100S0400000_1.l0).LLJI);
        C719102rN c719102rN5 = ((C939603lq) awS100S0400000_1.l0).LLJJIII;
        if (c719102rN5 != null && (shopPromotionActivity = c719102rN5.LLLLLLJ) != null && (str2 = shopPromotionActivity.logExtra) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
            map.putAll(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        RecyclerView recyclerView;
        List<PaymentElement> list = (List) obj;
        ((CCDCDateElementViewHolderV2) awS100S0400000_1.l0).L5().KQ2().LJFF(new AwS580S0100000_1((C942603mK) awS100S0400000_1.l3, 823));
        CCDCAddCardViewModel cCDCAddCardViewModelL5 = ((CCDCDateElementViewHolderV2) awS100S0400000_1.l0).L5();
        ElementDTO elementDTO = (ElementDTO) awS100S0400000_1.l1;
        PaymentMethod paymentMethod = (PaymentMethod) awS100S0400000_1.l2;
        ViewParent parent = ((CCDCDateElementViewHolderV2) awS100S0400000_1.l0).itemView.getParent();
        if (parent instanceof RecyclerView) {
            recyclerView = (RecyclerView) parent;
        } else {
            recyclerView = null;
        }
        cCDCAddCardViewModelL5.oR2(elementDTO, paymentMethod, list, recyclerView, ((CCDCDateElementViewHolderV2) awS100S0400000_1.l0).l());
        CCDCAddCardViewModel cCDCAddCardViewModelL52 = ((CCDCDateElementViewHolderV2) awS100S0400000_1.l0).L5();
        String str = ((ElementDTO) awS100S0400000_1.l1).id;
        if (str == null) {
            str = "";
        }
        cCDCAddCardViewModelL52.nR2(str, list);
        ((CCDCDateElementViewHolderV2) awS100S0400000_1.l0).L5().XQ2(((CCDCDateElementViewHolderV2) awS100S0400000_1.l0).L5().GQ2());
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        boolean z;
        C21588719eH c21588719eH;
        boolean z2;
        List<ElementDTO> listLJIIJJI;
        Availability availability;
        PaymentState paymentState = (PaymentState) obj;
        if (!C899503fN.LIZIZ(((C03ZA) awS100S0400000_1.l0).LIZ, paymentState.getCheckedPaymentMethod()) && !C899503fN.LIZIZ(((C03ZA) awS100S0400000_1.l0).LIZ, paymentState.getCheckedCreditMethod()) && !C899503fN.LIZIZ(((C03ZA) awS100S0400000_1.l0).LIZ, paymentState.getCheckedAnchorPaymentMethod())) {
            z = false;
        } else {
            z = true;
        }
        PaymentMethod paymentMethodLIZ = ((h) awS100S0400000_1.l1).LIZ("PaymentMethodView_getAvailability");
        if (paymentMethodLIZ != null && (availability = paymentMethodLIZ.availability) != null && Intrinsics.LJFF(Boolean.FALSE, availability.isAvailable())) {
            z = false;
        }
        ((h) awS100S0400000_1.l1).setChecked(z);
        if (z) {
            ((PaymentMethodViewHolder) awS100S0400000_1.l2).W5().SR2();
            C03ZA c03za = (C03ZA) awS100S0400000_1.l0;
            if (c03za.LJI) {
                if (c03za.LJII) {
                    h hVar = (h) awS100S0400000_1.l1;
                    Boolean bool = Boolean.TRUE;
                    hVar.LJIIIIZZ(null, bool, bool);
                } else {
                    ((h) awS100S0400000_1.l1).LJIIIIZZ(null, Boolean.TRUE, null);
                }
            } else if (c03za.LJII) {
                ((h) awS100S0400000_1.l1).LJIIIIZZ(null, null, Boolean.TRUE);
            }
        }
        j jVar = (j) awS100S0400000_1.l3;
        if (jVar != null) {
            jVar.LLFFF();
        } else {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ec_payment_show_divider_config", true)) {
                PaymentMethodViewHolder paymentMethodViewHolder = (PaymentMethodViewHolder) awS100S0400000_1.l2;
                if (paymentMethodViewHolder.LLJILJIL.LLLIIIIL(paymentMethodViewHolder.LLILLL + 1, false) != null) {
                    PaymentMethodViewHolder paymentMethodViewHolder2 = (PaymentMethodViewHolder) awS100S0400000_1.l2;
                    if ((paymentMethodViewHolder2.LLJILJIL.LLLIIIIL(paymentMethodViewHolder2.LLILLL + 1, false) instanceof C03ZA) && (!z || (listLJIIJJI = ((C03ZA) awS100S0400000_1.l0).LIZ.LJIIJJI()) == null || listLJIIJJI.isEmpty())) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c21588719eH = new C21588719eH(0, 0, 0, 0, z2, C0H9H.LIZIZ(16), false, 319);
                } else {
                    c21588719eH = new C21588719eH(C958103op.LIZJ, 0, 0, 0, false, C0H9H.LIZIZ(16), true, 126);
                }
                C870703aj.LIZ(((PaymentMethodViewHolder) awS100S0400000_1.l2).itemView, c21588719eH);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS100S0400000_1 awS100S0400000_1, Object obj) throws Throwable {
        int length;
        List list = (List) obj;
        Editable editableLLJILLL = C2204961BRm.LLJILLL(((C942603mK) awS100S0400000_1.l0).getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Zl5N7id7IIde9k7qEy4CNx5ct9zhh4ptC5eKh4YtFtTWuM9", null));
        boolean z = false;
        if (editableLLJILLL != null) {
            length = editableLLJILLL.length();
        } else {
            length = 0;
        }
        ATMDateViewHolderV2 aTMDateViewHolderV2 = (ATMDateViewHolderV2) awS100S0400000_1.l1;
        String strXQ2 = ATMCardViewModel.xQ2(aTMDateViewHolderV2.L5(), length - aTMDateViewHolderV2.LLILLJJLI);
        ATMDateViewHolderV2.LLILLL.getClass();
        List<PaymentElement> listLIZ = C895703el.LIZ(list);
        C903803g4.LIZ.getClass();
        C903703g3 c903703g3 = C903803g4.LIZIZ;
        String str = ((ElementDTO) awS100S0400000_1.l2).id;
        if (str == null) {
            str = "";
        }
        String strLIZLLL = c903703g3.LIZLLL(str, listLIZ);
        ((C895203eg) awS100S0400000_1.l3).LLILLJJLI.LIZJ = strLIZLLL;
        C890103dr c890103dr = C890103dr.LIZ;
        String str2 = ((ElementDTO) awS100S0400000_1.l2).paramName;
        c890103dr.getClass();
        String strLJIIZILJ = C890103dr.LJIIZILJ(str2);
        long jLIZ = C890103dr.LIZ(((ElementDTO) awS100S0400000_1.l2).paramName);
        if (strLIZLLL == null) {
            z = true;
        }
        C890103dr.LJIIJJI(jLIZ, Boolean.valueOf(z), strLJIIZILJ, strXQ2);
        return strLIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$30(kotlin.jvm.internal.AwS100S0400000_1 r8, java.lang.Object r9) {
        /*
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r2 = r0.W5()
            r2.getClass()
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r1 = "ec_payment_bnpl_switch_promotion"
            r0 = 0
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r1, r0)
            if (r0 == 0) goto L40
            X.03cl r3 = r2.LLLFF
            if (r3 == 0) goto L40
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder) r2
            java.lang.Object r4 = r8.l1
            oqa.h r4 = (oqa.h) r4
            java.lang.Object r5 = r8.l2
            X.03ZA r5 = (X.C03ZA) r5
            java.lang.Object r6 = r8.l3
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r0 = r2.W5()
            kotlin.jvm.internal.AwS37S0500000_1 r1 = new kotlin.jvm.internal.AwS37S0500000_1
            r7 = 15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r2.withState(r0, r1)
            if (r0 != 0) goto L47
        L40:
            java.lang.Object r0 = r8.l3
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r0.invoke()
        L47:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS100S0400000_1.invoke$30(kotlin.jvm.internal.AwS100S0400000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$31(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        String str;
        boolean z;
        boolean z2;
        int iIntValue;
        int iIntValue2;
        boolean z3;
        PdpBottomArea pdpBottomArea;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        C1063304Dv c1063304Dv = (C1063304Dv) obj;
        if (c1063304Dv != null) {
            C03DZ.LIZJ((C04E5) awS100S0400000_1.l0);
            C04E5 c04e5 = (C04E5) awS100S0400000_1.l0;
            Object obj2 = ((C1063604Dy) awS100S0400000_1.l1).LLILZ.get("page_name");
            Map<String, SeaPdpBottomBtnInterest> map = null;
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            if (str == null || a0.LJJJIL(str)) {
                str = "product_detail";
            }
            C1063604Dy c1063604Dy = (C1063604Dy) awS100S0400000_1.l1;
            SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) awS100S0400000_1.l2;
            c1063604Dy.getClass();
            ProductPackStruct productPackStruct = seaPdpViewModel.LLJIJIL;
            if (productPackStruct != null && (num4 = productPackStruct.status) != null && num4.intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = c1063304Dv.LIZIZ;
            AddToCartButton addToCartButton = c1063304Dv.LJIIIZ;
            if (addToCartButton != null && (num3 = addToCartButton.status) != null && num3.intValue() == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = !z2;
            AddToCartButton addToCartButton2 = c1063304Dv.LJIIIZ;
            if (addToCartButton2 != null && (num2 = addToCartButton2.status) != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 1;
            }
            BuyButton buyButton = c1063304Dv.LJIIIIZZ;
            if (buyButton != null && (num = buyButton.status) != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = 1;
            }
            ProductPackStruct productPackStruct2 = ((SeaPdpViewModel) awS100S0400000_1.l2).LLJIJIL;
            if (productPackStruct2 != null && (pdpBottomArea = productPackStruct2.bottomArea) != null) {
                map = pdpBottomArea.interestMap;
            }
            C10501048t c10501048tLIZIZ = C10495048n.LIZIZ(map, c1063304Dv.LJI, c1063304Dv.LJII, c1063304Dv.LJ, c1063304Dv.LIZLLL, (Context) awS100S0400000_1.l3);
            C1063604Dy c1063604Dy2 = (C1063604Dy) awS100S0400000_1.l1;
            SeaPdpViewModel seaPdpViewModel2 = (SeaPdpViewModel) awS100S0400000_1.l2;
            c1063604Dy2.getClass();
            Integer num5 = (Integer) c1063604Dy2.withState(seaPdpViewModel2, new AwS580S0100000_1(seaPdpViewModel2, 867));
            if (num5 != null && num5.intValue() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            C04EV c04ev = new C04EV(str, z, z4, i, iIntValue, iIntValue2, c10501048tLIZIZ, z3);
            c04e5.getClass();
            if (!z4) {
                C03DZ.LIZ(c04e5.LL);
                c04e5.LIZIZ(false);
            } else {
                C03DZ.LIZJ(c04e5.LL);
                c04e5.LIZIZ(true);
                c04e5.LL.setEnabled(z);
                if (iIntValue != 1) {
                    c04e5.LL.setEnabled(false);
                }
                Integer style = c04e5.LL.getStyle();
                if (style == null || style.intValue() != i) {
                    c04e5.LL.setStyle(Integer.valueOf(i));
                    c04e5.LIZ();
                    if (((Number) C04ET.LIZ.getValue()).intValue() != 3) {
                        if (i == 3) {
                            c04e5.LL.setIconTintColorRes(R.attr.hd);
                        } else {
                            c04e5.LL.setIconTintColorRes(R.attr.a1q);
                        }
                    }
                    C04E4 c04e4 = c04e5.LL;
                    c04e4.setButtonVariant(c04e4.getVariant());
                }
                if (!c04e5.LLILZ) {
                    c04e5.LLILZ = true;
                    C04E8 c04e8 = c04e5.LLILLL;
                    if (c04e8 != null) {
                        c04e8.LIZIZ(c04e5.LL);
                    }
                }
            }
            C10503048v c10503048v = c04e5.LLILLJJLI;
            if (z3) {
                if (iIntValue2 != 2) {
                    z = true;
                } else {
                    z = false;
                }
            }
            c10503048v.setEnabled(z);
            if (C300330Bpv.LIZ() && iIntValue2 != 1) {
                c04e5.LLILLJJLI.setEnabled(false);
            }
            c04e5.LLILLJJLI.LIZLLL(i);
            c04e5.LLILLJJLI.LIZJ(c04ev.LIZIZ, c04ev.LIZ);
            if (!c04e5.LLILZIL) {
                c04e5.LLILZIL = true;
                C04E8 c04e82 = c04e5.LLILLL;
                if (c04e82 != null) {
                    c04e82.LIZ(c04e5.LLILLJJLI);
                }
            }
        } else {
            C03DZ.LIZ((C04E5) awS100S0400000_1.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        PrivacyButton privacyButton;
        if (Intrinsics.LJFF(((AbstractDialogInterfaceC1397690mTX) obj).LLIZ, "button_close") && (privacyButton = (PrivacyButton) awS100S0400000_1.l0) != null) {
            ((C854403Vm) awS100S0400000_1.l1).LIZJ("close", privacyButton.actionType, (PrivacyPopup) awS100S0400000_1.l2);
        }
        if (Intrinsics.LJFF((Boolean) awS100S0400000_1.l3, Boolean.TRUE)) {
            OrderSubmitAssemViewModel.OS2(((C854403Vm) awS100S0400000_1.l1).LIZ, false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.PRIVACY_CHANGE.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380415);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        String str = "";
        if (C13LP.LJJJLL((List) awS100S0400000_1.l0) != null) {
            String str2 = ((DialogButton) C13LP.LJJJJZI((List) awS100S0400000_1.l0)).text;
            if (str2 == null) {
                str2 = "";
            }
            c1397620mTQ.LIZJ(0, str2, new AwS367S0200000_1((Function0) awS100S0400000_1.l2, (Function0<Unit>) awS100S0400000_1.l3, (Function1<? super String, Unit>) 355));
        }
        if (C13LP.LJJJLZIJ(1, (List) awS100S0400000_1.l0) != null) {
            String str3 = ((DialogButton) ListProtector.get((List) awS100S0400000_1.l0, 1)).text;
            if (str3 == null) {
                str3 = "";
            }
            c1397620mTQ.LIZJ(1, str3, new AwS580S0100000_1((Function1) awS100S0400000_1.l3, (Function1<? super String, Unit>) 985));
        }
        if (C13LP.LJJJLZIJ(2, (List) awS100S0400000_1.l0) != null) {
            String str4 = ((DialogButton) ListProtector.get((List) awS100S0400000_1.l0, 2)).text;
            if (str4 != null) {
                str = str4;
            }
            c1397620mTQ.LIZJ(2, str, null);
        }
        Integer num = ((DialogContent) awS100S0400000_1.l1).buttonDirection;
        if (num != null && num.intValue() == 1) {
            c1397620mTQ.LJFF = true;
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$34(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        DeliveryPanelState deliveryPanelState = (DeliveryPanelState) obj;
        if (!((LogisticSubViewHolder) awS100S0400000_1.l0).X5().mR2(deliveryPanelState)) {
            ((LogisticSubViewHolder) awS100S0400000_1.l0).itemView.findViewById(R.id.dz9).setClickable(false);
            C786410Ut5.LLLLZ((C1841350y17) ((View) awS100S0400000_1.l1).findViewById(R.id.sp_), 8);
            ((LogisticSubViewHolder) awS100S0400000_1.l0).itemView.findViewById(R.id.dz9).setBackground(null);
        } else {
            ((LogisticSubViewHolder) awS100S0400000_1.l0).itemView.findViewById(R.id.dz9).setClickable(true);
            C427690Gpr.LJ(((LogisticSubViewHolder) awS100S0400000_1.l0).itemView.findViewById(R.id.dz9), 0.0f);
            C786410Ut5.LLLLZ((C1841350y17) ((View) awS100S0400000_1.l1).findViewById(R.id.sp_), 0);
        }
        if (!deliveryPanelState.getExposedItems().contains((LogisticDTO) awS100S0400000_1.l2)) {
            C806903Df.LIZ((C03FC) awS100S0400000_1.l3, ((LogisticSubViewHolder) awS100S0400000_1.l0).X5(), "tiktokec_option_show", deliveryPanelState, null, null);
            deliveryPanelState.getExposedItems().add((LogisticDTO) awS100S0400000_1.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        ((C03QL) awS100S0400000_1.l0).LJFF((C043B) awS100S0400000_1.l1, (BillInfoData) awS100S0400000_1.l2, (HashMap) awS100S0400000_1.l3, (C860903Xz) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        ((C03QL) awS100S0400000_1.l0).LJFF((C043B) awS100S0400000_1.l1, (BillInfoData) awS100S0400000_1.l2, (HashMap) awS100S0400000_1.l3, (C860903Xz) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        HandlerHook.viewPostDelay((View) awS100S0400000_1.l0, new ARunnableS34S0300000_1((C1397620mTQ) awS100S0400000_1.l1, (Function0) awS100S0400000_1.l2, (Function0) awS100S0400000_1.l3, 17), 200L);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        boolean zLIZ;
        boolean z;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        List<InstallmentInfo> list;
        InstallmentInfo installmentInfo;
        List<InstallmentPlan> list2;
        List<Integer> list3;
        C915503hx c915503hx = (C915503hx) obj;
        ((CCDCAddCardViewModel) awS100S0400000_1.l0).setStateImmediate(AFwS228S0000000_1.get$arr$(203));
        C03OI c03oi = C03OI.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("end verifyCardTypeAndInstallment, entryType: ");
        sbLIZ.append((EnumC889603dm) awS100S0400000_1.l1);
        sbLIZ.append(", cardType: ");
        sbLIZ.append(c915503hx.LJII);
        sbLIZ.append(", support_installment: ");
        sbLIZ.append(c915503hx.LJI);
        sbLIZ.append(", bankCode: ");
        sbLIZ.append(c915503hx.LJIIIIZZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c03oi.getClass();
        C03OI.LJFF("CCDCAddCardViewModel", strLIZIZ);
        EnumC889603dm enumC889603dm = (EnumC889603dm) awS100S0400000_1.l1;
        EnumC889603dm enumC889603dm2 = EnumC889603dm.DC;
        if (enumC889603dm == enumC889603dm2 && c915503hx.LJII != enumC889603dm2.getValue() && c915503hx.LJII != EnumC889603dm.PREPAID.getValue() && c915503hx.LJII != EnumC889603dm.UNKONWN.getValue()) {
            CCDCAddCardViewModel cCDCAddCardViewModel = (CCDCAddCardViewModel) awS100S0400000_1.l0;
            cCDCAddCardViewModel.getClass();
            cCDCAddCardViewModel.iR2(CCDCAddCardViewModel.MQ2(2131833173));
        } else {
            EnumC889603dm enumC889603dm3 = (EnumC889603dm) awS100S0400000_1.l1;
            EnumC889603dm enumC889603dm4 = EnumC889603dm.CC;
            boolean z2 = true;
            if (enumC889603dm3 == enumC889603dm4 && C756302xN.LIZ(EcPaymentAddCardTypeConfigSettings.LIZ().supportCardType) && (list3 = EcPaymentAddCardTypeConfigSettings.LIZ().supportCardType) != null && !list3.contains(Integer.valueOf(c915503hx.LJII))) {
                CCDCAddCardViewModel cCDCAddCardViewModel2 = (CCDCAddCardViewModel) awS100S0400000_1.l0;
                cCDCAddCardViewModel2.getClass();
                cCDCAddCardViewModel2.iR2(CCDCAddCardViewModel.MQ2(2131833172));
            } else if (((EnumC889603dm) awS100S0400000_1.l1) == enumC889603dm4 && Intrinsics.LJFF(EcPaymentAddCardTypeConfigSettings.LIZ().filterUnSupportedInstallmentCards, Boolean.TRUE) && !c915503hx.LJI) {
                CCDCAddCardViewModel cCDCAddCardViewModel3 = (CCDCAddCardViewModel) awS100S0400000_1.l0;
                cCDCAddCardViewModel3.getClass();
                cCDCAddCardViewModel3.iR2(CCDCAddCardViewModel.MQ2(2131832920));
            } else {
                C03OI.LJFF("CCDCAddCardViewModel", "verifyCardTypeAndInstallment check pass");
                PaymentInfo paymentInfo = (PaymentInfo) awS100S0400000_1.l2;
                if (paymentInfo != null && ((((paymentMethod = paymentInfo.paymentMethod) != null && (installmentInfo = paymentMethod.installmentInfo) != null) || ((paymentMethod2 = paymentInfo.paymentMethod) != null && (list = paymentMethod2.installmentInfoList) != null && (installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list)) != null)) && (list2 = installmentInfo.installmentPlans) != null)) {
                    zLIZ = C756302xN.LIZ(list2);
                } else {
                    zLIZ = false;
                }
                Function2 function2 = (Function2) awS100S0400000_1.l3;
                if (((EnumC889603dm) awS100S0400000_1.l1) == enumC889603dm4 && c915503hx.LJI && zLIZ) {
                    z = true;
                } else {
                    z = false;
                }
                function2.invoke(Boolean.valueOf(z), c915503hx.LJIIIIZZ);
                CCDCAddCardViewModel cCDCAddCardViewModel4 = (CCDCAddCardViewModel) awS100S0400000_1.l0;
                if (((EnumC889603dm) awS100S0400000_1.l1) != enumC889603dm4 || !c915503hx.LJI || !zLIZ) {
                    z2 = false;
                }
                cCDCAddCardViewModel4.LLJLL = new C894203eW(z2, c915503hx.LJIIIIZZ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        C03ZA c03za;
        Availability availability;
        PaymentState paymentState = (PaymentState) obj;
        List<Object> paymentList = paymentState.getPaymentList();
        PaymentMethod paymentMethod = (PaymentMethod) awS100S0400000_1.l0;
        int i = 1022;
        boolean z = false;
        C03ZA c03za2 = null;
        if (paymentMethod != null) {
            c03za = new C03ZA(paymentMethod, z, z, i);
        } else {
            c03za = null;
        }
        PaymentMethod paymentMethod2 = (PaymentMethod) awS100S0400000_1.l1;
        if (paymentMethod2 != null) {
            c03za2 = new C03ZA(paymentMethod2, z, z, i);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(paymentList, 10));
        for (Object obj2 : paymentList) {
            if ((obj2 instanceof C03YT) && c03za != null) {
                obj2 = c03za;
            } else if ((obj2 instanceof C03YU) && c03za2 != null) {
                obj2 = c03za2;
            }
            arrayList.add(obj2);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        PaymentMethod paymentMethod3 = (PaymentMethod) awS100S0400000_1.l0;
        if (paymentMethod3 != null && (availability = paymentMethod3.availability) != null && Intrinsics.LJFF(availability.isAvailable(), Boolean.FALSE) && c03za != null) {
            PaymentMethod paymentMethod4 = (PaymentMethod) awS100S0400000_1.l0;
            PaymentMethodsData paymentMethodsData = (PaymentMethodsData) awS100S0400000_1.l2;
            PaymentViewModel paymentViewModel = (PaymentViewModel) awS100S0400000_1.l3;
            List<? extends Object> list = PaymentViewModel.LLLI;
            C03YI.LIZIZ(c03za, paymentMethod4, arrayList2, paymentState.getCheckedPaymentMethod(), paymentMethodsData, paymentViewModel.LLJ);
        }
        return paymentState.copy(paymentState.checkedPaymentMethod, arrayList2, paymentState.paymentInfo, paymentState.systemError, paymentState.emailHintVisible, paymentState.paymentInfoForThreeStepCache, paymentState.paymentInfoForNextStep, paymentState.showLoading, paymentState.resendPayAction, paymentState.scrollUpAction, paymentState.scrollUpDistance, paymentState.toast, paymentState.checkedCreditMethod, paymentState.installmentPlanChanged, paymentState.abnormalStatus, paymentState.exceptionUX, paymentState.changeBindCardStatus, paymentState.bindCardErrorMsg, paymentState.bindCardErrorAction, paymentState.chooseSaveStatus, paymentState.subPaymentMethodIsChecked, paymentState.checkedAnchorPaymentMethod, paymentState.summaryPanelStatus, paymentState.summary, paymentState.dialogContent, paymentState.buttonTrigger);
    }

    public static final Object invoke$6(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        C19EG c19egLIZIZ;
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        Context context = ((C03PI) awS100S0400000_1.l0).LIZ;
        List<PaymentElement> list = null;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && !c19egLIZIZ.isFinishing() && !c19egLIZIZ.isDestroyed()) {
            PaymentMethodInfo paymentMethodInfo = ((PaymentInfo) awS100S0400000_1.l1).paymentMethodInfo;
            if (paymentMethodInfo != null) {
                PaymentMethodInfo paymentMethodInfo2 = paymentInfo.paymentMethodInfo;
                if (paymentMethodInfo2 != null) {
                    list = paymentMethodInfo2.paymentElements;
                }
                paymentMethodInfo.setPaymentElements(list);
            }
            ((C03PI) awS100S0400000_1.l0).LJII((PaymentInfo) awS100S0400000_1.l1, null, (Boolean) awS100S0400000_1.l2, ((PaymentHalfFragment) awS100S0400000_1.l3).getView(), new AwS545S0100000_1((PaymentHalfFragment) awS100S0400000_1.l3, 1184));
        } else {
            C03SE c03se = C03PI.LJIJI;
            AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(76);
            c03se.getClass();
            C03SE.LJJIFFI(aFwS185S0000000_1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LJFF = true;
        c1397630mTR.LIZJ(0, ((C19EG) awS100S0400000_1.l0).getString(2131840227), new AwS367S0200000_1((C013C) awS100S0400000_1.l1, (C013C) awS100S0400000_1.l2, (Function0<Unit>) 96));
        c1397630mTR.LIZJ(1, ((C19EG) awS100S0400000_1.l0).getString(2131840228), new AwS367S0200000_1((C013C) awS100S0400000_1.l1, (C013C) awS100S0400000_1.l3, (Function0<Unit>) 99));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        C19EG c19egLIZIZ;
        List<PaymentElement> list;
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        Context context = ((C03PI) awS100S0400000_1.l0).LIZ;
        Boolean boolIsChooseSave = null;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && !c19egLIZIZ.isFinishing() && !c19egLIZIZ.isDestroyed()) {
            PaymentMethodInfo paymentMethodInfo = ((PaymentInfo) awS100S0400000_1.l1).paymentMethodInfo;
            if (paymentMethodInfo != null) {
                PaymentMethodInfo paymentMethodInfo2 = paymentInfo.paymentMethodInfo;
                if (paymentMethodInfo2 != null) {
                    list = paymentMethodInfo2.paymentElements;
                } else {
                    list = null;
                }
                paymentMethodInfo.setPaymentElements(list);
            }
            PaymentMethodInfo paymentMethodInfo3 = ((PaymentInfo) awS100S0400000_1.l1).paymentMethodInfo;
            if (paymentMethodInfo3 != null) {
                PaymentMethodInfo paymentMethodInfo4 = paymentInfo.paymentMethodInfo;
                if (paymentMethodInfo4 != null) {
                    boolIsChooseSave = paymentMethodInfo4.isChooseSave();
                }
                paymentMethodInfo3.setChooseSave(boolIsChooseSave);
            }
            C908503gp.LJ();
            ((C03PI) awS100S0400000_1.l0).LJII(paymentInfo, null, (Boolean) awS100S0400000_1.l2, ((PaymentHalfFragment) awS100S0400000_1.l3).getView(), new AwS545S0100000_1((PaymentHalfFragment) awS100S0400000_1.l3, 1193));
        } else {
            C03SE c03se = C03PI.LJIJI;
            AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(86);
            c03se.getClass();
            C03SE.LJJIFFI(aFwS185S0000000_1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS100S0400000_1 awS100S0400000_1, Object obj) {
        Assembler assembler = (Assembler) obj;
        SubPaymentListFragment subPaymentListFragment = (SubPaymentListFragment) awS100S0400000_1.l0;
        assembler.DQ2(subPaymentListFragment, new AwS100S0400000_1(subPaymentListFragment, (PaymentMethod) awS100S0400000_1.l1, (EnterParams) awS100S0400000_1.l2, (C926303jh) awS100S0400000_1.l3, 10));
        assembler.QQ2((SubPaymentListFragment) awS100S0400000_1.l0, AFwS229S0000000_2.get$arr$(161));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS100S0400000_1(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r3, com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter$AddressViewHolder r4, com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress r5, X.C972903rD r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 16 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r5
            r1.l1 = r6
            r1.l2 = r3
            r1.l3 = r4
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r6
            r1.l2 = r5
            r1.l3 = r3
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS100S0400000_1.<init>(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter$AddressViewHolder, com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress, X.03rD, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS100S0400000_1(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel r3, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r4, java.util.List r5, X.C259800zU r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 21 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r3
            r1.l1 = r6
            r1.l2 = r4
            r1.l3 = r5
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r6
            r1.l3 = r5
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS100S0400000_1.<init>(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, java.util.List, X.00zU, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS100S0400000_1(C031A c031a, C031A c031a2, OrderSubmitAssemViewModel orderSubmitAssemViewModel, C259800zU<List<PaymentMethod>> c259800zU, C7768031q c7768031q) {
        super(1);
        this.$t = c7768031q;
        this.l0 = c031a;
        this.l1 = c031a2;
        this.l2 = orderSubmitAssemViewModel;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS100S0400000_1(C03PI c03pi, C03PI c03pi2, PaymentHalfFragment paymentHalfFragment, Boolean bool, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = c03pi;
        this.l1 = c03pi2;
        this.l2 = paymentHalfFragment;
        this.l3 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS100S0400000_1(C03PI c03pi, C03PI c03pi2, PaymentInfo paymentInfo, View view, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = c03pi;
        this.l1 = c03pi2;
        this.l2 = paymentInfo;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(C03PI c03pi, PaymentInfo paymentInfo, Boolean bool, PaymentHalfFragment paymentHalfFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = c03pi;
        this.l1 = paymentInfo;
        this.l2 = bool;
        this.l3 = paymentHalfFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS100S0400000_1(C03QL c03ql, C03QL c03ql2, C043B<?> c043b, BillInfoData billInfoData, HashMap<String, Object> map) {
        super(1);
        this.$t = map;
        this.l0 = c03ql;
        this.l1 = c03ql2;
        this.l2 = c043b;
        this.l3 = billInfoData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(C03QL c03ql, SkuPanelAssemVM skuPanelAssemVM, BillInfoData billInfoData, HashMap map, int i) {
        super(1);
        this.$t = i;
        this.l0 = c03ql;
        this.l1 = skuPanelAssemVM;
        this.l2 = billInfoData;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(C03ZA c03za, h hVar, PaymentMethodViewHolder paymentMethodViewHolder, j jVar, int i) {
        super(1);
        this.$t = i;
        this.l0 = c03za;
        this.l1 = hVar;
        this.l2 = paymentMethodViewHolder;
        this.l3 = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(C933403kq c933403kq, ATMCardViewHolderV2 aTMCardViewHolderV2, ElementDTO elementDTO, C895303eh c895303eh, int i) {
        super(1);
        this.$t = i;
        this.l0 = c933403kq;
        this.l1 = aTMCardViewHolderV2;
        this.l2 = elementDTO;
        this.l3 = c895303eh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS100S0400000_1(C939603lq c939603lq, C939603lq c939603lq2, C118300cf c118300cf, C118300cf c118300cf2, C259800zU<String> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = c939603lq;
        this.l1 = c939603lq2;
        this.l2 = c118300cf;
        this.l3 = c118300cf2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS100S0400000_1(C939703lr c939703lr, C939703lr c939703lr2, C118300cf c118300cf, C118300cf c118300cf2, C259800zU<String> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = c939703lr;
        this.l1 = c939703lr2;
        this.l2 = c118300cf;
        this.l3 = c118300cf2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(C942603mK c942603mK, ATMDateViewHolderV2 aTMDateViewHolderV2, ElementDTO elementDTO, C895203eg c895203eg, int i) {
        super(1);
        this.$t = i;
        this.l0 = c942603mK;
        this.l1 = aTMDateViewHolderV2;
        this.l2 = elementDTO;
        this.l3 = c895203eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(C943103mP c943103mP, ATMCCDCNormalViewHolderV2 aTMCCDCNormalViewHolderV2, ElementDTO elementDTO, C895103ef c895103ef, int i) {
        super(1);
        this.$t = i;
        this.l0 = c943103mP;
        this.l1 = aTMCCDCNormalViewHolderV2;
        this.l2 = elementDTO;
        this.l3 = c895103ef;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(C04E5 c04e5, C1063604Dy c1063604Dy, SeaPdpViewModel seaPdpViewModel, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = c04e5;
        this.l1 = c1063604Dy;
        this.l2 = seaPdpViewModel;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS100S0400000_1(C19EG c19eg, C19EG c19eg2, C013C c013c, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l0 = c19eg;
        this.l1 = c19eg2;
        this.l2 = c013c;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS100S0400000_1(View view, View view2, C1397620mTQ c1397620mTQ, Function0<Boolean> function0, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = c1397620mTQ;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(LogisticSubViewHolder logisticSubViewHolder, View view, LogisticDTO logisticDTO, C03FC c03fc, int i) {
        super(1);
        this.$t = i;
        this.l0 = logisticSubViewHolder;
        this.l1 = view;
        this.l2 = logisticDTO;
        this.l3 = c03fc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS100S0400000_1(PaymentViewModel paymentViewModel, PaymentViewModel paymentViewModel2, PaymentMethod paymentMethod, HashMap<String, Object> map, C03WH c03wh) {
        super(1);
        this.$t = c03wh;
        this.l0 = paymentViewModel;
        this.l1 = paymentViewModel2;
        this.l2 = paymentMethod;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(ATMCardViewHolderV2 aTMCardViewHolderV2, ElementDTO elementDTO, PaymentMethod paymentMethod, C933403kq c933403kq, int i) {
        super(1);
        this.$t = i;
        this.l0 = aTMCardViewHolderV2;
        this.l1 = elementDTO;
        this.l2 = paymentMethod;
        this.l3 = c933403kq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(ATMDateViewHolderV2 aTMDateViewHolderV2, ElementDTO elementDTO, PaymentMethod paymentMethod, C942603mK c942603mK, int i) {
        super(1);
        this.$t = i;
        this.l0 = aTMDateViewHolderV2;
        this.l1 = elementDTO;
        this.l2 = paymentMethod;
        this.l3 = c942603mK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS100S0400000_1(CCDCAddCardViewModel cCDCAddCardViewModel, CCDCAddCardViewModel cCDCAddCardViewModel2, EnumC889603dm enumC889603dm, PaymentInfo paymentInfo, Function2<? super Boolean, ? super String, Unit> function2) {
        super(1);
        this.$t = function2;
        this.l0 = cCDCAddCardViewModel;
        this.l1 = cCDCAddCardViewModel2;
        this.l2 = enumC889603dm;
        this.l3 = paymentInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(CCDCDateElementViewHolderV2 cCDCDateElementViewHolderV2, ElementDTO elementDTO, PaymentMethod paymentMethod, C942603mK c942603mK, int i) {
        super(1);
        this.$t = i;
        this.l0 = cCDCDateElementViewHolderV2;
        this.l1 = elementDTO;
        this.l2 = paymentMethod;
        this.l3 = c942603mK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(ElementDTO elementDTO, PaymentMethod paymentMethod, PaymentMethodsData paymentMethodsData, C884703cz c884703cz, int i) {
        super(1);
        this.$t = i;
        this.l0 = elementDTO;
        this.l1 = paymentMethod;
        this.l2 = paymentMethodsData;
        this.l3 = c884703cz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(PaymentMethod paymentMethod, PaymentMethod paymentMethod2, PaymentMethodsData paymentMethodsData, PaymentViewModel paymentViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = paymentMethod;
        this.l1 = paymentMethod2;
        this.l2 = paymentMethodsData;
        this.l3 = paymentViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS100S0400000_1(SubPaymentListAssem subPaymentListAssem, SubPaymentListAssem subPaymentListAssem2, List<PaymentMethod> list, UIAssem uIAssem, PaymentMethod paymentMethod) {
        super(1);
        this.$t = paymentMethod;
        this.l0 = subPaymentListAssem;
        this.l1 = subPaymentListAssem2;
        this.l2 = list;
        this.l3 = uIAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(SubPaymentListFragment subPaymentListFragment, PaymentMethod paymentMethod, EnterParams enterParams, C926303jh c926303jh, int i) {
        super(1);
        this.$t = i;
        this.l0 = subPaymentListFragment;
        this.l1 = paymentMethod;
        this.l2 = enterParams;
        this.l3 = c926303jh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(PaymentMethodViewHolder paymentMethodViewHolder, h hVar, C03ZA c03za, AwS130S0400000_1 awS130S0400000_1, int i) {
        super(1);
        this.$t = i;
        this.l0 = paymentMethodViewHolder;
        this.l1 = hVar;
        this.l2 = c03za;
        this.l3 = awS130S0400000_1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(Announcement announcement, SeaPdpFragment seaPdpFragment, SeaPdpViewModel seaPdpViewModel, C807503Dl c807503Dl, int i) {
        super(1);
        this.$t = i;
        this.l0 = c807503Dl;
        this.l1 = seaPdpFragment;
        this.l2 = seaPdpViewModel;
        this.l3 = announcement;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(PrivacyButton privacyButton, C854403Vm c854403Vm, PrivacyPopup privacyPopup, Boolean bool, int i) {
        super(1);
        this.$t = i;
        this.l0 = privacyButton;
        this.l1 = c854403Vm;
        this.l2 = privacyPopup;
        this.l3 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(USBANormalElementVH2 uSBANormalElementVH2, PaymentMethod paymentMethod, ElementDTO elementDTO, C943103mP c943103mP, int i) {
        super(1);
        this.$t = i;
        this.l0 = uSBANormalElementVH2;
        this.l1 = paymentMethod;
        this.l2 = elementDTO;
        this.l3 = c943103mP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0400000_1(List list, DialogContent dialogContent, AwS545S0100000_1 awS545S0100000_1, AwS580S0100000_1 awS580S0100000_1, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = dialogContent;
        this.l2 = awS545S0100000_1;
        this.l3 = awS580S0100000_1;
    }
}
