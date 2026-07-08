package kotlin.jvm.internal;

import X.C034S;
import X.C03JV;
import X.C03MQ;
import X.C03N8;
import X.C03ZB;
import X.C03ZC;
import X.C09AY;
import X.C1120604Zw;
import X.C1121904a9;
import X.C123100dR;
import X.C1257480ipO;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1741890vQh;
import X.C197039127h;
import X.C19719612Di;
import X.C1AQS;
import X.C2371409Qy;
import X.C722302rt;
import X.C786410Ut5;
import X.C812503Fj;
import X.C883303cl;
import X.InterfaceC497601wk;
import X.InterfaceC877803bs;
import X.InterfaceC883403cm;
import X.RunnableC514801zW;
import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.FrequencyLimit;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RetainInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.TimeStampRecorder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.TimeStampStore;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OspPlaceOrderButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlaceOrderButtonStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SubtextArea;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS20S1400000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS20S1400000_1 awS20S1400000_1, Object obj) {
        String str;
        String str2;
        PaymentMethodsData paymentMethodsData;
        String str3 = (String) obj;
        if (str3 != null && C123100dR.LIZ(str3)) {
            PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
            Context context = ((C03ZB) awS20S1400000_1.l1).getContext();
            PaymentMethod paymentMethod = (PaymentMethod) awS20S1400000_1.l2;
            String str4 = null;
            if (paymentMethod != null) {
                str = paymentMethod.LJIILLIIL;
            } else {
                str = null;
            }
            String str5 = awS20S1400000_1.s0;
            CommuteType commuteType = (CommuteType) awS20S1400000_1.l3;
            if (paymentMethod != null) {
                str2 = paymentMethod.id;
            } else {
                str2 = null;
            }
            BillInfoData billInfoData = ((PaymentInfoCell2) awS20S1400000_1.l4).V5().LLJJI;
            if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
                str4 = paymentMethodsData.saleRegion;
            }
            PaymentBindHelper.LJI(paymentBindHelper, context, str, str5, str3, commuteType, "ordersubmit", str2, str4, null, null, null, false, null, null, ((PaymentMethod) awS20S1400000_1.l2).displayName, 16128);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS20S1400000_1 awS20S1400000_1, Object obj) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        long jLongValue = ((Number) obj).longValue();
        C197039127h c197039127h = (C197039127h) awS20S1400000_1.l1;
        C812503Fj c812503Fj = C812503Fj.LIZ;
        Context context = c197039127h.getContext();
        if (context == null) {
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
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            context = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
        }
        String str = awS20S1400000_1.s0;
        String str2 = ((SubtextArea) awS20S1400000_1.l2).content;
        Long lValueOf = Long.valueOf(jLongValue);
        PlaceOrderButtonStyle placeOrderButtonStyle = ((C03MQ) awS20S1400000_1.l3).LIZLLL;
        Icon icon = ((SubtextArea) awS20S1400000_1.l2).icon;
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1((C197039127h) awS20S1400000_1.l1, 117);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) awS20S1400000_1.l4;
        c812503Fj.getClass();
        c197039127h.setText(C812503Fj.LIZ(context, str, str2, lValueOf, placeOrderButtonStyle, icon, awS545S0100000_1, spannableStringBuilder, false, null));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS20S1400000_1 awS20S1400000_1, Object obj) {
        PaymentMethod paymentMethod;
        C03JV c03jv = (C03JV) obj;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS20S1400000_1.l1;
        BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
        boolean z = c03jv.LLILZ;
        PaymentInfo paymentInfo = (PaymentInfo) awS20S1400000_1.l2;
        if (paymentInfo != null) {
            paymentMethod = paymentInfo.paymentMethod;
        } else {
            paymentMethod = null;
        }
        return C03JV.LIZ(c03jv, 0, OrderSubmitAssemViewModel.nR2(orderSubmitAssemViewModel, billInfoData, z, paymentMethod, orderSubmitAssemViewModel.LLJL, true, false, false, awS20S1400000_1.s0, (ECRichText) awS20S1400000_1.l3, 608), (C722302rt) awS20S1400000_1.l4, false, null, false, null, null, null, null, awS20S1400000_1.s0, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1031, -1, -1, 1048575);
    }

    public static final Object invoke$11(AwS20S1400000_1 awS20S1400000_1, Object obj) {
        PaymentMethod paymentMethod;
        C03JV c03jv = (C03JV) obj;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS20S1400000_1.l1;
        BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
        boolean z = c03jv.LLILZ;
        PaymentInfo paymentInfo = (PaymentInfo) awS20S1400000_1.l2;
        if (paymentInfo != null) {
            paymentMethod = paymentInfo.paymentMethod;
        } else {
            paymentMethod = null;
        }
        return C03JV.LIZ(c03jv, 0, OrderSubmitAssemViewModel.nR2(orderSubmitAssemViewModel, billInfoData, z, paymentMethod, orderSubmitAssemViewModel.LLJL, true, false, false, awS20S1400000_1.s0, (ECRichText) awS20S1400000_1.l3, 608), (C722302rt) awS20S1400000_1.l4, false, null, false, null, null, null, null, awS20S1400000_1.s0, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1031, -1, -1, 1048575);
    }

    public static final Object invoke$12(AwS20S1400000_1 awS20S1400000_1, Object obj) {
        PlaceOrderButtonStyle placeOrderButtonStyle;
        OspPlaceOrderButton ospPlaceOrderButton;
        long jLongValue = ((Number) obj).longValue();
        if (awS20S1400000_1.s0 != null) {
            ((C197039127h) awS20S1400000_1.l1).setButtonStartIcon(0);
        }
        C197039127h c197039127h = (C197039127h) awS20S1400000_1.l1;
        C812503Fj c812503Fj = C812503Fj.LIZ;
        Context context = (Context) awS20S1400000_1.l2;
        String str = awS20S1400000_1.s0;
        String str2 = ((SubtextArea) awS20S1400000_1.l3).content;
        Long lValueOf = Long.valueOf(jLongValue);
        BillInfoData billInfoData = ((OrderSubmitAssemViewModel) awS20S1400000_1.l4).LLJJI;
        if (billInfoData != null && (ospPlaceOrderButton = billInfoData.ospPlaceOrderButton) != null) {
            placeOrderButtonStyle = ospPlaceOrderButton.buttonStyle;
        } else {
            placeOrderButtonStyle = null;
        }
        Icon icon = ((SubtextArea) awS20S1400000_1.l3).icon;
        c812503Fj.getClass();
        c197039127h.setText(C812503Fj.LIZ(context, str, str2, lValueOf, placeOrderButtonStyle, icon, null, null, false, null));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS20S1400000_1 awS20S1400000_1, Object obj) {
        Assembler assembler = (Assembler) obj;
        AddressIdentityEditFragment addressIdentityEditFragment = (AddressIdentityEditFragment) awS20S1400000_1.l1;
        assembler.DQ2(addressIdentityEditFragment, new AwS43S1300000_1((IdentityInfoPanel) awS20S1400000_1.l2, addressIdentityEditFragment, awS20S1400000_1.s0, (Boolean) awS20S1400000_1.l3, 0));
        assembler.QQ2((AddressIdentityEditFragment) awS20S1400000_1.l1, new AwS581S0100000_2((View) awS20S1400000_1.l4, 131));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS20S1400000_1 awS20S1400000_1, Object obj) {
        String str;
        String str2;
        PaymentMethodsData paymentMethodsData;
        String str3 = (String) obj;
        if (str3 != null && C123100dR.LIZ(str3)) {
            PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
            Context context = ((C03ZB) awS20S1400000_1.l1).getContext();
            PaymentMethod paymentMethod = (PaymentMethod) awS20S1400000_1.l2;
            String str4 = null;
            if (paymentMethod != null) {
                str = paymentMethod.LJIILLIIL;
            } else {
                str = null;
            }
            String str5 = awS20S1400000_1.s0;
            CommuteType commuteType = (CommuteType) awS20S1400000_1.l3;
            if (paymentMethod != null) {
                str2 = paymentMethod.id;
            } else {
                str2 = null;
            }
            BillInfoData billInfoData = ((MiniOspPaymentInfoCell2) awS20S1400000_1.l4).P5().LLIZ;
            if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
                str4 = paymentMethodsData.saleRegion;
            }
            PaymentBindHelper.LJI(paymentBindHelper, context, str, str5, str3, commuteType, "ordersubmit", str2, str4, null, null, null, false, null, null, ((PaymentMethod) awS20S1400000_1.l2).displayName, 16128);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS20S1400000_1 awS20S1400000_1, Object obj) {
        String str;
        String str2;
        PaymentMethodsData paymentMethodsData;
        String str3 = (String) obj;
        if (str3 != null && C123100dR.LIZ(str3)) {
            PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
            Context context = ((C03ZC) awS20S1400000_1.l1).getContext();
            PaymentMethod paymentMethod = (PaymentMethod) awS20S1400000_1.l2;
            PaymentMethodsData paymentMethodsData2 = null;
            if (paymentMethod != null) {
                str = paymentMethod.LJIILLIIL;
            } else {
                str = null;
            }
            String str4 = awS20S1400000_1.s0;
            CommuteType commuteType = (CommuteType) awS20S1400000_1.l3;
            String str5 = paymentMethod.id;
            BillInfoData billInfoData = ((USPaymentInfoCell) awS20S1400000_1.l4).T5().LLJJI;
            if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
                str2 = paymentMethodsData.saleRegion;
            } else {
                str2 = null;
            }
            PaymentMethod paymentMethod2 = (PaymentMethod) awS20S1400000_1.l2;
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(((USPaymentInfoCell) awS20S1400000_1.l4).T5());
            BillInfoData billInfoData2 = ((USPaymentInfoCell) awS20S1400000_1.l4).T5().LLJJI;
            if (billInfoData2 != null) {
                paymentMethodsData2 = billInfoData2.paymentMethods;
            }
            final USPaymentInfoCell uSPaymentInfoCell = (USPaymentInfoCell) awS20S1400000_1.l4;
            PaymentBindHelper.LJI(paymentBindHelper, context, str, str4, str3, commuteType, "ordersubmit", str5, str2, paymentMethod2, viewModelScope, paymentMethodsData2, false, null, new InterfaceC877803bs() { // from class: X.035Y
                @Override // X.InterfaceC877803bs
                public final void onDismiss() {
                    uSPaymentInfoCell.T5().setState(AFwS228S0000000_1.get$arr$(431));
                }

                @Override // X.InterfaceC877803bs
                public final void onShow() {
                    uSPaymentInfoCell.T5().setState(AFwS228S0000000_1.get$arr$(456));
                }

                @Override // X.InterfaceC877803bs
                public final void onFailed(String str6) {
                    if (str6 != null) {
                        uSPaymentInfoCell.T5().rT2(str6);
                    }
                }
            }, ((PaymentMethod) awS20S1400000_1.l2).displayName, 6144);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    public static final Object invoke$5(AwS20S1400000_1 awS20S1400000_1, Object obj) {
        ?? arrayList;
        TimeStampStore timeStampStore;
        Type type;
        C883303cl c883303cl = (C883303cl) awS20S1400000_1.l1;
        RetainInfo retainInfo = (RetainInfo) awS20S1400000_1.l2;
        c883303cl.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        String str = retainInfo.group;
        if (str == null) {
            str = "";
        }
        List<FrequencyLimit> list = retainInfo.frequencyLimitList;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<FrequencyLimit> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new TimeStampRecorder(it2.next().windowSec, C13BV.INSTANCE, str));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        TimeStampStore timeStampStore2 = new TimeStampStore(arrayList);
        String string = C1257480ipO.LIZ.getString("ec_switch_payment_promotion", C1741890vQh.LJIIIIZZ(timeStampStore2));
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJII(TimeStampStore.class));
            } else {
                type = new TypeToken<TimeStampStore>() { // from class: X.03cq
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, type);
            if (!(objFromJson instanceof TimeStampStore)) {
                objFromJson = null;
            }
            timeStampStore = (TimeStampStore) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (timeStampStore == null) {
            timeStampStore = timeStampStore2;
        }
        List<TimeStampRecorder> list2 = timeStampStore.recorders;
        ArrayList arrayList2 = new ArrayList();
        for (TimeStampRecorder timeStampRecorder : list2) {
            TimeStampRecorder timeStampRecorder2 = timeStampRecorder;
            List<TimeStampRecorder> list3 = timeStampStore2.recorders;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<TimeStampRecorder> it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (timeStampRecorder2.window == it3.next().window) {
                        String str2 = timeStampRecorder2.group;
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (Intrinsics.LJFF(str2, str)) {
                            break;
                        }
                    }
                }
            }
            arrayList2.add(timeStampRecorder);
        }
        List<TimeStampRecorder> list4 = timeStampStore2.recorders;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list4, 10));
        for (TimeStampRecorder timeStampRecorder3 : list4) {
            List<TimeStampRecorder> list5 = timeStampStore.recorders;
            ArrayList arrayList4 = new ArrayList();
            for (TimeStampRecorder timeStampRecorder4 : list5) {
                TimeStampRecorder timeStampRecorder5 = timeStampRecorder4;
                if (timeStampRecorder5.window == timeStampRecorder3.window) {
                    String str3 = timeStampRecorder5.group;
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (Intrinsics.LJFF(str3, str)) {
                        arrayList4.add(timeStampRecorder4);
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                C19719612Di.LJJI(((TimeStampRecorder) it4.next()).records, arrayList5);
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : arrayList5) {
                if (((Number) obj2).longValue() >= jCurrentTimeMillis - ((long) timeStampRecorder3.window)) {
                    arrayList6.add(obj2);
                }
            }
            ArrayList arrayList7 = new ArrayList(arrayList6);
            arrayList7.add(Long.valueOf(jCurrentTimeMillis));
            arrayList3.add(new TimeStampRecorder(timeStampRecorder3.window, C13LP.LLIIII(arrayList7), str));
        }
        C1257480ipO.LIZ.storeString("ec_switch_payment_promotion", C1741890vQh.LJIIIIZZ(new TimeStampStore(C13LP.LJLIL(arrayList3, arrayList2))));
        C883303cl.LIZIZ = true;
        InterfaceC883403cm interfaceC883403cm = (InterfaceC883403cm) awS20S1400000_1.l3;
        if (interfaceC883403cm != null) {
            interfaceC883403cm.LIZIZ(awS20S1400000_1.s0, (Map) awS20S1400000_1.l4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS20S1400000_1 awS20S1400000_1, Object obj) {
        InterfaceC883403cm interfaceC883403cm = (InterfaceC883403cm) awS20S1400000_1.l1;
        if (interfaceC883403cm != null) {
            interfaceC883403cm.LIZ(awS20S1400000_1.s0, (Map) awS20S1400000_1.l2);
        }
        C883303cl c883303cl = (C883303cl) awS20S1400000_1.l3;
        Function0 function0 = (Function0) awS20S1400000_1.l4;
        c883303cl.getClass();
        if (function0 != null) {
            C786410Ut5.LJLIIL(100L, C883303cl.LIZ, new RunnableC514801zW(function0, (Function0<Unit>) 46));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS20S1400000_1 awS20S1400000_1, Object obj) {
        InterfaceC883403cm interfaceC883403cm = (InterfaceC883403cm) awS20S1400000_1.l1;
        if (interfaceC883403cm != null) {
            interfaceC883403cm.LIZJ(awS20S1400000_1.s0, (Map) awS20S1400000_1.l2);
        }
        C883303cl c883303cl = (C883303cl) awS20S1400000_1.l3;
        Function0 function0 = (Function0) awS20S1400000_1.l4;
        c883303cl.getClass();
        if (function0 != null) {
            C786410Ut5.LJLIIL(100L, C883303cl.LIZ, new RunnableC514801zW(function0, (Function0<Unit>) 46));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS20S1400000_1 awS20S1400000_1, Object obj) {
        Integer num;
        Long l;
        Long l2;
        String strLJJLIIIJ;
        String str;
        Integer num2;
        String str2;
        PaymentMethod paymentMethod;
        CommuteInfo commuteInfoLJJIIJ;
        ToastContent toastContent;
        PaymentMethod paymentMethod2;
        PaymentMethod paymentMethod3;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("EVENT_ORIGIN_FEATURE", "TEMAI");
        laneParams.plusAssign("page_name", "order_submit");
        laneParams.plusAssign("error_code", awS20S1400000_1.s0);
        C03N8 c03n8 = (C03N8) awS20S1400000_1.l1;
        CommuteType commuteType = null;
        if (c03n8 != null) {
            num = c03n8.LIZ;
        } else {
            num = null;
        }
        laneParams.plusAssign("retry_time", num);
        C03N8 c03n82 = (C03N8) awS20S1400000_1.l1;
        if (c03n82 != null) {
            l = c03n82.LIZIZ;
        } else {
            l = null;
        }
        laneParams.plusAssign("start_time", l);
        C03N8 c03n83 = (C03N8) awS20S1400000_1.l1;
        if (c03n83 != null) {
            l2 = c03n83.LIZJ;
        } else {
            l2 = null;
        }
        laneParams.plusAssign("cost_time", l2);
        List<String> list = ((OrderSubmitAssemViewModel) awS20S1400000_1.l2).r.LIZ;
        if (list != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        laneParams.plusAssign("order_id", strLJJLIIIJ);
        PaymentInfo paymentInfo = ((C03JV) awS20S1400000_1.l3).LLIZ;
        String strLJJIIZ = "";
        if (paymentInfo == null || (paymentMethod3 = paymentInfo.paymentMethod) == null || (str = paymentMethod3.id) == null) {
            str = "";
        }
        laneParams.plusAssign("payment_method_id", str);
        PaymentInfo paymentInfo2 = ((C03JV) awS20S1400000_1.l3).LLIZ;
        if (paymentInfo2 != null && (paymentMethod2 = paymentInfo2.paymentMethod) != null) {
            strLJJIIZ = paymentMethod2.LJJIIZ();
        }
        laneParams.plusAssign("payment_method_name", strLJJIIZ);
        C03N8 c03n84 = (C03N8) awS20S1400000_1.l1;
        if (c03n84 != null) {
            num2 = c03n84.LIZLLL;
        } else {
            num2 = null;
        }
        laneParams.plusAssign("order_status", num2);
        ExceptionUX exceptionUX = (ExceptionUX) awS20S1400000_1.l4;
        if (exceptionUX != null && (toastContent = exceptionUX.toastContent) != null) {
            str2 = toastContent.message;
        } else {
            str2 = null;
        }
        laneParams.plusAssign("message", str2);
        laneParams.plusAssign("log_id", ((OrderSubmitAssemViewModel) awS20S1400000_1.l2).r.LIZLLL);
        PaymentInfo paymentInfo3 = ((C03JV) awS20S1400000_1.l3).LLIZ;
        if (paymentInfo3 != null && (paymentMethod = paymentInfo3.paymentMethod) != null && (commuteInfoLJJIIJ = paymentMethod.LJJIIJ(false)) != null) {
            commuteType = commuteInfoLJJIIJ.commuteType;
        }
        laneParams.plusAssign("pay_commute_type", commuteType);
        laneParams.plusAssign("buy_type", Integer.valueOf(((OrderSubmitAssemViewModel) awS20S1400000_1.l2).LL));
        laneParams.plusAssign("order_source_type", "order_submit");
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS20S1400000_1 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS20S1400000_1.invoke$9(kotlin.jvm.internal.AwS20S1400000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S1400000_1(C03ZB c03zb, PaymentMethod paymentMethod, String str, CommuteType commuteType, MiniOspPaymentInfoCell2 miniOspPaymentInfoCell2, int i) {
        super(1);
        this.$t = i;
        this.l1 = c03zb;
        this.l2 = paymentMethod;
        this.s0 = str;
        this.l3 = commuteType;
        this.l4 = miniOspPaymentInfoCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S1400000_1(C03ZB c03zb, PaymentMethod paymentMethod, String str, CommuteType commuteType, PaymentInfoCell2 paymentInfoCell2, int i) {
        super(1);
        this.$t = i;
        this.l1 = c03zb;
        this.l2 = paymentMethod;
        this.s0 = str;
        this.l3 = commuteType;
        this.l4 = paymentInfoCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S1400000_1(C03ZC c03zc, PaymentMethod paymentMethod, String str, CommuteType commuteType, USPaymentInfoCell uSPaymentInfoCell, int i) {
        super(1);
        this.$t = i;
        this.l1 = c03zc;
        this.l2 = paymentMethod;
        this.s0 = str;
        this.l3 = commuteType;
        this.l4 = uSPaymentInfoCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS20S1400000_1(C883303cl c883303cl, C883303cl c883303cl2, RetainInfo retainInfo, InterfaceC883403cm interfaceC883403cm, String str, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l1 = c883303cl;
        this.l2 = c883303cl2;
        this.l3 = retainInfo;
        this.s0 = interfaceC883403cm;
        this.l4 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS20S1400000_1(InterfaceC883403cm interfaceC883403cm, InterfaceC883403cm interfaceC883403cm2, String str, Map<String, String> map, C883303cl c883303cl, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l1 = interfaceC883403cm;
        this.s0 = interfaceC883403cm2;
        this.l2 = str;
        this.l3 = map;
        this.l4 = c883303cl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S1400000_1(C197039127h c197039127h, String str, SubtextArea subtextArea, C03MQ c03mq, SpannableStringBuilder spannableStringBuilder, int i) {
        super(1);
        this.$t = i;
        this.l1 = c197039127h;
        this.s0 = str;
        this.l2 = subtextArea;
        this.l3 = c03mq;
        this.l4 = spannableStringBuilder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S1400000_1(AddressIdentityEditFragment addressIdentityEditFragment, IdentityInfoPanel identityInfoPanel, String str, Boolean bool, View view, int i) {
        super(1);
        this.$t = i;
        this.l1 = addressIdentityEditFragment;
        this.l2 = identityInfoPanel;
        this.s0 = str;
        this.l3 = bool;
        this.l4 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S1400000_1(MiniOspViewModel miniOspViewModel, Context context, String str, Boolean bool, Integer num, int i) {
        super(1);
        this.$t = i;
        this.l1 = miniOspViewModel;
        this.l2 = context;
        this.s0 = str;
        this.l3 = bool;
        this.l4 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S1400000_1(OrderSubmitAssemViewModel orderSubmitAssemViewModel, PaymentInfo paymentInfo, String str, ECRichText eCRichText, C722302rt c722302rt, int i) {
        super(1);
        this.$t = i;
        this.l1 = orderSubmitAssemViewModel;
        this.l2 = paymentInfo;
        this.s0 = str;
        this.l3 = eCRichText;
        this.l4 = c722302rt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S1400000_1(String str, C03N8 c03n8, OrderSubmitAssemViewModel orderSubmitAssemViewModel, C03JV c03jv, ExceptionUX exceptionUX, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c03n8;
        this.l2 = orderSubmitAssemViewModel;
        this.l3 = c03jv;
        this.l4 = exceptionUX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S1400000_1(String str, C197039127h c197039127h, Context context, SubtextArea subtextArea, OrderSubmitAssemViewModel orderSubmitAssemViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c197039127h;
        this.l2 = context;
        this.l3 = subtextArea;
        this.l4 = orderSubmitAssemViewModel;
    }
}
