package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc;

import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C03OI;
import X.C03S8;
import X.C03SY;
import X.C03Z0;
import X.C09GB;
import X.C0BA8;
import X.C1120604Zw;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C1440005kM;
import X.C1533610q0l;
import X.C15438062q;
import X.C1697810uHb;
import X.C1AF0;
import X.C1AQS;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C678560QjW;
import X.C770702zh;
import X.C7769031r;
import X.C7879035x;
import X.C817603Hi;
import X.C862703Yr;
import X.C864803Zm;
import X.C865203Zq;
import X.C866903a7;
import X.C869603aY;
import X.C873003b6;
import X.C878903c3;
import X.C881903cX;
import X.C883303cl;
import X.C884503cx;
import X.C888803de;
import X.C888903df;
import X.C889003dg;
import X.C889103dh;
import X.C889203di;
import X.C889403dk;
import X.C890103dr;
import X.C890603dw;
import X.C890803dy;
import X.C890903dz;
import X.C892803eI;
import X.C894003eU;
import X.C894203eW;
import X.C895503ej;
import X.C897503f3;
import X.C899803fQ;
import X.C903403g0;
import X.C904203g8;
import X.C914803hq;
import X.C928803k6;
import X.EnumC837803Pc;
import X.EnumC884003cs;
import X.EnumC889603dm;
import X.EnumC890503dv;
import X.EnumC903503g1;
import X.InterfaceC0148002o;
import X.InterfaceC1164530gPT;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import X.InterfaceC884803d0;
import X.InterfaceC892703eH;
import X.InterfaceC894103eV;
import X.InterfaceC903003fw;
import android.os.SystemClock;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.OcrStatus;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentAddCardConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentCreditAddCciConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceDefaultConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.ElementItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoCheckoutNewCardPreRiskConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsAddCardRiskControlSettingSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MaterialCollectionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.OrderType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RedirectDetails;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SaveDisplayInfoContent;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS100S0400000_1;
import kotlin.jvm.internal.AwS11S2000000_1;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS245S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.u;
import ola.j;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCAddCardViewModel extends AssemViewModel<C890803dy> implements InterfaceC1164530gPT {
    public static final /* synthetic */ int LLJZ = 0;
    public EnterParams LLILLJJLI;
    public String LLILLL;
    public PaymentInfo LLILZ;
    public int LLILZIL;
    public j LLILZLL;
    public boolean LLIZLLLIL;
    public AwS367S0200000_1 LLJILJILJ;
    public Function1<? super EnumC884003cs, Unit> LLJILLL;
    public List<Region> LLJJ;
    public C873003b6 LLJJI;
    public boolean LLJJIII;
    public final C883303cl LLJJIJIIJIL;
    public RedirectDetails LLJJIJIL;
    public MaterialCollectionInfo LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public PaymentInfo LLJJJJJIL;
    public Cashier LLJJJJLIIL;
    public ExceptionUX LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final AtomicBoolean LLJLIL;
    public final C890603dw LLJLILLLLZIIL;
    public C894203eW LLJLL;
    public PaymentInfo LLJLLIL;
    public Boolean LLJLLL;
    public final Map<String, List<PaymentElement>> LL = new LinkedHashMap();
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(71));
    public final Set<Object> LLJ = new LinkedHashSet();
    public final List<String> LLJI = C1697810uHb.LJIIJJI("eg_ccdc_global_billing_address_city", "eg_ccdc_global_billing_address_state", "eg_ccdc_global_expiration_date", "eg_ccdc_global_cvv");
    public String LLJIJIL = "";
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(70));
    public final C817603Hi LLJJIJI = new C817603Hi();

    public final boolean CQ2() {
        PaymentMethod paymentMethod;
        String str;
        EnterParams enterParams = this.LLILLJJLI;
        if (enterParams != null) {
            if (enterParams.LJIIJJI) {
                return true;
            }
            if (Intrinsics.LJFF(enterParams.LJIIJ, Boolean.TRUE)) {
                return false;
            }
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ecom_ccdc_force_save_config", true)) {
            EnterParams enterParams2 = this.LLILLJJLI;
            if ((enterParams2 != null ? enterParams2.LJJIJIIJI : null) == EnumC837803Pc.OCP) {
                return false;
            }
        }
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("ecom_ccdc_real_bind_flow", true) || (paymentMethod = getState().LL) == null || !Intrinsics.LJFF(paymentMethod.newBindCardFlow, Boolean.TRUE)) {
            return false;
        }
        PaymentMethod paymentMethod2 = getState().LL;
        return paymentMethod2 == null || (str = paymentMethod2.saveDisplayText) == null || str.length() == 0 || getState().LLILZIL;
    }

    public final List<InterfaceC1891350zJl> FQ2() {
        List<ElementDTO> listLJFF;
        Object objLIZIZ;
        ArrayList arrayList = new ArrayList();
        PaymentMethod paymentMethod = ((C890803dy) getState()).LL;
        if (paymentMethod != null) {
            if (paymentMethod.LJJIFFI()) {
                listLJFF = paymentMethod.missingElements;
                if (listLJFF == null) {
                    listLJFF = C13BV.INSTANCE;
                }
            } else {
                listLJFF = paymentMethod.LJFF();
            }
            ArrayList<ElementDTO> arrayList2 = new ArrayList();
            for (ElementDTO elementDTO : listLJFF) {
                ElementDTO elementDTO2 = elementDTO;
                if (C03S8.LJIILL(elementDTO2.id) && !Intrinsics.LJFF(elementDTO2.id, "eg_ccdc_global_billing_address_country_regin")) {
                    arrayList2.add(elementDTO);
                }
            }
            ArrayList<C862703Yr> arrayList3 = new ArrayList();
            for (ElementDTO elementDTO3 : arrayList2) {
                InterfaceC884803d0.LJIL.getClass();
                Integer num = elementDTO3.styleType;
                int iOrdinal = EnumC903503g1.BA_CITY.ordinal();
                if (num == null || num.intValue() != iOrdinal) {
                    objLIZIZ = C903403g0.LIZIZ(elementDTO3, paymentMethod);
                    if (objLIZIZ != null) {
                    }
                } else {
                    objLIZIZ = new C869603aY(elementDTO3, paymentMethod, null);
                }
                arrayList3.add(objLIZIZ);
            }
            ArrayList arrayList4 = new ArrayList();
            HashMap map = new HashMap();
            PaymentMethod paymentMethod2 = ((C890803dy) getState()).LL;
            if (paymentMethod2 != null) {
                for (C862703Yr c862703Yr : arrayList3) {
                    if (c862703Yr instanceof C03Z0) {
                        ElementDTO elementDTO4 = c862703Yr.LIZ;
                        map.put(elementDTO4.id, elementDTO4);
                        if (map.size() == 1) {
                            arrayList4.add(new C888903df(paymentMethod2, map, null, new Object()));
                        }
                    } else if (c862703Yr instanceof C869603aY) {
                        arrayList4.add(new C889103dh(paymentMethod2, (C869603aY) c862703Yr, new Object()));
                    }
                }
            }
            arrayList.addAll(arrayList4);
            ZQ2(arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final boolean GQ2() {
        EnterParams enterParams;
        if ((!Intrinsics.LJFF(this.LLILLL, "ADD_NEW_CCI_BR") || (enterParams = this.LLILLJJLI) == null || !Intrinsics.LJFF(enterParams.LJIIJ, Boolean.TRUE)) && !C865203Zq.LIZ()) {
            return true;
        }
        ?? BooleanValue = QQ2().getFirst().booleanValue();
        if (!Intrinsics.LJFF(Boolean.valueOf((boolean) BooleanValue), this.LLJLLL)) {
            this.LLJLLL = Boolean.valueOf((boolean) BooleanValue);
            C890103dr.LIZ.getClass();
            String str = C890103dr.LJIIIZ;
            if (str != null) {
                C890103dr.LJI(str, C2097608Jq.LJIIIIZZ(new Pair("is_clickable", Integer.valueOf((int) BooleanValue)), new Pair("button_type", "add_card")));
            }
        }
        return BooleanValue;
    }

    public final Region IQ2() {
        return (Region) this.LLJILJIL.getValue();
    }

    public final C904203g8 KQ2() {
        return (C904203g8) this.LLIZ.getValue();
    }

    public final boolean NQ2() {
        return C897503f3.LJI(this.LLILLJJLI) || CQ2();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean RQ2() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r0 = r4.LLILLJJLI
            r3 = 0
            if (r0 == 0) goto L57
            java.lang.String r1 = r0.paySource
        L7:
            java.lang.String r0 = "orderdetail"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r2 = 1
            if (r0 != 0) goto L55
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r0 = r4.LLILLJJLI
            if (r0 == 0) goto L53
            java.lang.String r1 = r0.paySource
        L16:
            java.lang.String r0 = "orderlist"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L55
            r1 = 0
        L1f:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoCcdcAddCardRefreshConfigSettings$PipoOspSecondRefreshConfigModel r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoCcdcAddCardRefreshConfigSettings.LIZ()
            java.util.List<java.lang.String> r0 = r0.sourceList
            if (r0 == 0) goto L46
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r2) goto L46
            if (r1 != 0) goto L46
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoCcdcAddCardRefreshConfigSettings$PipoOspSecondRefreshConfigModel r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoCcdcAddCardRefreshConfigSettings.LIZ()
            java.util.List<java.lang.String> r1 = r0.sourceList
            if (r1 == 0) goto L51
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r0 = r4.LLILLJJLI
            if (r0 == 0) goto L3f
            java.lang.String r3 = r0.paySource
        L3f:
            boolean r0 = X.C13LP.LJJJJ(r3, r1)
            if (r0 != r2) goto L51
            r1 = 1
        L46:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r0 = r4.LLILLJJLI
            if (r0 == 0) goto L59
            boolean r0 = r0.LIZLLL()
            if (r0 != r2) goto L59
            return r2
        L51:
            r1 = 0
            goto L46
        L53:
            r1 = r3
            goto L16
        L55:
            r1 = 1
            goto L1f
        L57:
            r1 = r3
            goto L7
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel.RQ2():boolean");
    }

    public final boolean SQ2() {
        EnterParams enterParams;
        PaymentMethodsData paymentMethodsData;
        return C897503f3.LJI(this.LLILLJJLI) && (enterParams = this.LLILLJJLI) != null && (paymentMethodsData = enterParams.paymentData) != null && paymentMethodsData.LJJIFFI();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C890803dy(0);
    }

    public CCDCAddCardViewModel() {
        C883303cl.LIZJ = false;
        this.LLJJIJIIJIL = new C883303cl();
        this.LLJLIL = new AtomicBoolean(false);
        this.LLJLILLLLZIIL = new C890603dw();
    }

    public static boolean eR2() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoCheckoutNewCardPreRiskConfigSettings.PipoCheckoutNewCardPreRiskConfigModel pipoCheckoutNewCardPreRiskConfigModel = PipoCheckoutNewCardPreRiskConfigSettings.LIZ;
        PipoCheckoutNewCardPreRiskConfigSettings.PipoCheckoutNewCardPreRiskConfigModel pipoCheckoutNewCardPreRiskConfigModel2 = (PipoCheckoutNewCardPreRiskConfigSettings.PipoCheckoutNewCardPreRiskConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_checkout_new_card_pre_risk_config", PipoCheckoutNewCardPreRiskConfigSettings.PipoCheckoutNewCardPreRiskConfigModel.class, pipoCheckoutNewCardPreRiskConfigModel);
        if (pipoCheckoutNewCardPreRiskConfigModel2 != null) {
            pipoCheckoutNewCardPreRiskConfigModel = pipoCheckoutNewCardPreRiskConfigModel2;
        }
        return Intrinsics.LJFF(pipoCheckoutNewCardPreRiskConfigModel.enableNewCardPreRisk, Boolean.TRUE);
    }

    public final boolean AQ2() {
        PaymentMethod paymentMethod;
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("ecom_ccdc_new_bind_flow", true) && (paymentMethod = getState().LL) != null && Intrinsics.LJFF(paymentMethod.newBindCardFlow, Boolean.TRUE);
    }

    public final List<ElementDTO> JQ2() {
        PaymentMethod paymentMethod = getState().LL;
        if (paymentMethod == null) {
            return null;
        }
        List<ElementDTO> listLJFF = paymentMethod.LJFF();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJFF) {
            if (C03S8.LJIILL(((ElementDTO) obj).id)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Pair<Boolean, List<String>> QQ2() {
        PaymentMethod paymentMethod;
        String str;
        PaymentMethod next;
        PaymentElement paymentElement;
        PaymentMethod paymentMethod2 = getState().LL;
        if (paymentMethod2 == null) {
            return new Pair<>(Boolean.FALSE, C13BV.INSTANCE);
        }
        List<InterfaceC1891350zJl> list = getState().LLILLJJLI;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
        List list2 = (List) linkedHashMap.get("sub_payment_type_element");
        String str2 = (list2 == null || (paymentElement = (PaymentElement) C13LP.LJJJLZIJ(0, list2)) == null) ? null : paymentElement.paramValue;
        List<PaymentMethod> list3 = paymentMethod2.subPaymentMethods;
        if (list3 != null) {
            Iterator<PaymentMethod> it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.LJFF(next.id, str2)) {
                    break;
                }
            }
            paymentMethod = next;
        } else {
            paymentMethod = null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            if (interfaceC1891350zJl instanceof InterfaceC894103eV) {
                InterfaceC894103eV interfaceC894103eV = (InterfaceC894103eV) interfaceC1891350zJl;
                C862703Yr c862703YrLLIL = interfaceC894103eV.LLIL();
                if (c862703YrLLIL != null) {
                    List<PaymentElement> list4 = (List) linkedHashMap.get(c862703YrLLIL.LIZ.id);
                    if (list4 == null) {
                        list4 = C13BV.INSTANCE;
                    }
                    String strRR2 = rR2(c862703YrLLIL, paymentMethod == null ? paymentMethod2 : paymentMethod, list4);
                    if ((Intrinsics.LJFF(this.LLILLL, "ADD_NEW_CCI_US") || Intrinsics.LJFF(this.LLILLL, "ADD_NEW_CCI_BR") || eR2()) && (interfaceC894103eV instanceof C889403dk)) {
                        C866903a7 c866903a7 = ((C889403dk) interfaceC1891350zJl).LLILLJJLI;
                        str = c866903a7.LIZLLL;
                        if (str == null) {
                            str = c866903a7.LIZJ;
                        }
                    } else {
                        str = null;
                    }
                    if (strRR2 == null && str == null) {
                        C890103dr c890103dr = C890103dr.LIZ;
                        String str3 = c862703YrLLIL.LIZ.paramName;
                        c890103dr.getClass();
                        arrayList.add(C890103dr.LJIIZILJ(str3));
                    }
                }
                z = false;
            }
        }
        return new Pair<>(Boolean.valueOf(z), arrayList);
    }

    public final boolean fR2() {
        EnterParams enterParams;
        PaymentInfo paymentInfo;
        return EcPaymentCreditAddCciConfigSettings.LIZ().shouldSkipInstallmentSelect && (enterParams = this.LLILLJJLI) != null && (paymentInfo = enterParams.paymentInfo) != null && paymentInfo.LJI() && Intrinsics.LJFF(this.LLILLL, "ADD_NEW_CCI_BR");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1440005kM.LIZ(new IEvent() { // from class: X.03ao
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    public static boolean BQ2(String str) {
        if (!PipoTtsAddCardRiskControlSettingSettings.LIZ().enablePreRiskControl || !C1533610q0l.LIZIZ(str)) {
            return false;
        }
        List<String> list = PipoTtsAddCardRiskControlSettingSettings.LIZ().piBlackList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str2 : list) {
                if (str != null && u.LJJIIJZLJL(str, str2, false)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String HQ2(String str) {
        int iIntValue;
        if (str == null) {
            return "";
        }
        Integer num = EcPaymentIndependentPriceDefaultConfig.LIZJ().cardBinLength;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 8;
        }
        int length = str.length();
        if (iIntValue > length) {
            iIntValue = length;
        }
        return str.substring(0, iIntValue);
    }

    public static String MQ2(Integer num) {
        if (num != null) {
            num.intValue();
            return C7879035x.LIZ().getString(num.intValue());
        }
        return null;
    }

    public static boolean cR2(PaymentInfo paymentInfo) {
        String str;
        if (Intrinsics.LJFF(EcPaymentAddCardConfigSettings.LIZ().ccdcAddCardCheck, Boolean.TRUE)) {
            PaymentMethod paymentMethod = paymentInfo.paymentMethod;
            if (paymentMethod != null) {
                str = paymentMethod.id;
            } else {
                str = null;
            }
            if (C03S8.LJIJJ(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo EQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r37) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel.EQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo):com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo");
    }

    public final List<PaymentElement> LQ2(String str) {
        List<PaymentElement> list = (List) ((LinkedHashMap) this.LL).get(str);
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c8 A[Catch: all -> 0x01ed, TryCatch #1 {all -> 0x01ed, blocks: (B:119:0x01b3, B:121:0x01be, B:131:0x01e5, B:124:0x01c8, B:125:0x01cc, B:127:0x01d2), top: B:170:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d2 A[Catch: all -> 0x01ed, TryCatch #1 {all -> 0x01ed, blocks: (B:119:0x01b3, B:121:0x01be, B:131:0x01e5, B:124:0x01c8, B:125:0x01cc, B:127:0x01d2), top: B:170:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MaterialCollectionInfo r22) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel.OQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MaterialCollectionInfo):void");
    }

    public final void PQ2(String str) {
        try {
            if (C770702zh.LIZIZ(str)) {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                Map<String, ElementItem> map = C892803eI.LIZ;
                Map<String, ElementItem> map2 = (Map) settingsManagerLIZLLL.LJIIIIZZ("ecom_ccdc_bind_error_form", Map.class, map);
                if (map2 == null) {
                    map2 = map;
                }
                if (map2.containsKey(str)) {
                    Map<String, ElementItem> map3 = (Map) SettingsManager.LIZLLL().LJIIIIZZ("ecom_ccdc_bind_error_form", Map.class, map);
                    if (map3 != null) {
                        map = map3;
                    }
                    Gson gson = new Gson();
                    String str2 = null;
                    String str3 = null;
                    for (Map.Entry<String, ElementItem> entry : map.entrySet()) {
                        if (Intrinsics.LJFF(entry.getKey(), str)) {
                            ElementItem elementItem = (ElementItem) gson.LIZJ(C678560QjW.LJ(entry.getValue()), ElementItem.class);
                            str3 = elementItem.element;
                            str2 = elementItem.tip;
                        }
                    }
                    if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
                        if (Intrinsics.LJFF(str3, "eg_ccdc_global_card_number")) {
                            iR2(str2);
                        } else if (C864803Zm.LJFF.contains(str3)) {
                            lR2(str2);
                        } else if (Intrinsics.LJFF(str3, "eg_ccdc_global_cvv")) {
                            jR2(str2);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    public final void XQ2(boolean z) {
        setState(new AwS16S0010000_1(z, 2));
    }

    public final void YQ2(List<? extends InterfaceC1891350zJl> list) {
        ArrayList arrayList = new ArrayList(list);
        if (((Number) C0BA8.LIZ.getValue()).intValue() != 0) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof InterfaceC903003fw) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((InterfaceC903003fw) it2.next()).LIZ(5);
            }
            InterfaceC903003fw interfaceC903003fw = (InterfaceC903003fw) C13LP.LJJLIIIJL(arrayList2);
            if (interfaceC903003fw != null) {
                interfaceC903003fw.LIZ(6);
            }
        }
        setStateImmediate(new AwS580S0100000_1(arrayList, (List<InterfaceC746802vq>) 141));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0007 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ZQ2(java.util.List<X.InterfaceC1891350zJl> r15) {
        /*
            r14 = this;
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.util.Iterator r4 = r15.iterator()
            r3 = 0
        L7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r2 = r4.next()
            X.0zJl r2 = (X.InterfaceC1891350zJl) r2
            r1 = 8
            if (r3 != 0) goto L55
            r8 = 0
        L18:
            int r7 = X.C0H9H.LIZIZ(r1)
        L1c:
            r0 = 25
            int r6 = X.C679280Qkg.LIZ(r0)
            X.19eH r5 = new X.19eH
            r9 = 0
            r12 = 1
            r13 = 248(0xf8, float:3.48E-43)
            r10 = r9
            r11 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r2 instanceof X.InterfaceC894303eX
            if (r0 == 0) goto L7
            boolean r0 = r2 instanceof X.InterfaceC892703eH
            r1 = 0
            if (r0 == 0) goto L45
            r0 = r2
            X.03eH r0 = (X.InterfaceC892703eH) r0
            if (r0 == 0) goto L45
            java.util.List r0 = r0.getIds()
            if (r0 == 0) goto L45
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
        L45:
            java.util.List<java.lang.String> r0 = r14.LLJI
            boolean r0 = X.C13LP.LJJJJ(r1, r0)
            if (r0 == 0) goto L7
            int r3 = r3 + 1
            X.03eX r2 = (X.InterfaceC894303eX) r2
            r2.LIZIZ(r5)
            goto L7
        L55:
            int r8 = X.C0H9H.LIZIZ(r1)
            r0 = 1
            if (r3 != r0) goto L18
            r7 = 0
            goto L1c
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel.ZQ2(java.util.List):void");
    }

    public final void aR2(boolean z) {
        setState(new AwS16S0010000_1(z, 3));
        C890103dr.LIZ.getClass();
        C890103dr.LJIJI(C2097608Jq.LJIIIIZZ(new Pair("is_use_shipping_address", Integer.valueOf(z ? 1 : 0)), new Pair("action_type", "edit_address_result")));
        for (InterfaceC1891350zJl interfaceC1891350zJl : getState().LLILLJJLI) {
            if (interfaceC1891350zJl instanceof InterfaceC892703eH) {
                ((InterfaceC892703eH) interfaceC1891350zJl).LJJJJJL(null);
            }
        }
    }

    public final boolean bR2(PaymentInfo paymentInfo) {
        if (!dR2(paymentInfo) && !eR2() && !AQ2()) {
            return false;
        }
        return true;
    }

    public final boolean dR2(PaymentInfo paymentInfo) {
        OrderType orderType;
        EnterParams enterParams;
        EnterParams enterParams2;
        EnterParams enterParams3;
        PaymentMethodsData paymentMethodsData;
        PaymentMethodsData paymentMethodsData2;
        PaymentMethodsData paymentMethodsData3;
        PaymentMethodsData paymentMethodsData4;
        Integer num;
        PaymentMethodsData paymentMethodsData5;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_pipo_add_ccdc_pre_check", true)) {
            EnterParams enterParams4 = this.LLILLJJLI;
            String str = null;
            if (enterParams4 != null && (paymentMethodsData5 = enterParams4.paymentData) != null) {
                orderType = paymentMethodsData5.orderType;
            } else {
                orderType = null;
            }
            if (orderType == OrderType.ORDER_TYPE_PRE_RELEASE_ORDER || ((enterParams4 != null && (paymentMethodsData4 = enterParams4.paymentData) != null && (num = paymentMethodsData4.orderTypeV2) != null && ((num.intValue() >> 0) & 1) == 1) || (((enterParams = this.LLILLJJLI) != null && (paymentMethodsData3 = enterParams.paymentData) != null && paymentMethodsData3.LJJII()) || (((enterParams2 = this.LLILLJJLI) != null && (paymentMethodsData2 = enterParams2.paymentData) != null && paymentMethodsData2.LJJ()) || ((enterParams3 = this.LLILLJJLI) != null && (paymentMethodsData = enterParams3.paymentData) != null && paymentMethodsData.LJJIFFI()))))) {
                PaymentMethod paymentMethod = paymentInfo.paymentMethod;
                if (paymentMethod != null) {
                    str = paymentMethod.id;
                }
                if (C03S8.LJIJJ(str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void gR2(SaveDisplayInfoContent saveDisplayInfoContent) {
        String str;
        String str2;
        if (saveDisplayInfoContent == null || (str = saveDisplayInfoContent.title) == null || (str2 = saveDisplayInfoContent.desc) == null) {
            return;
        }
        setState(new AwS11S2000000_1(str, str2, 0));
    }

    public final void iR2(String str) {
        List<InterfaceC1891350zJl> list = ((C890803dy) getState()).LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Object objLIZIZ : list) {
            if (objLIZIZ instanceof C889403dk) {
                C889403dk c889403dk = (C889403dk) objLIZIZ;
                C866903a7 c866903a7 = c889403dk.LLILLJJLI;
                c866903a7.LIZJ = str;
                c866903a7.LIZLLL = str;
                objLIZIZ = C889403dk.LIZIZ(c889403dk, new Object());
            }
            arrayList.add(objLIZIZ);
        }
        YQ2(arrayList);
        setStateImmediate(AFwS228S0000000_1.get$arr$(189));
    }

    public final void jR2(String str) {
        List<InterfaceC1891350zJl> list = ((C890803dy) getState()).LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Object objLIZLLL : list) {
            if (objLIZLLL instanceof C889203di) {
                C889203di c889203di = (C889203di) objLIZLLL;
                C869603aY c869603aY = c889203di.LLILLJJLI;
                if (Intrinsics.LJFF(c869603aY.LIZ.id, "eg_ccdc_global_cvv")) {
                    c869603aY.LIZJ = str;
                    objLIZLLL = C889203di.LIZLLL(c889203di, new Object());
                }
            }
            arrayList.add(objLIZLLL);
        }
        YQ2(arrayList);
        setStateImmediate(AFwS228S0000000_1.get$arr$(190));
    }

    public final void lR2(String str) {
        List<InterfaceC1891350zJl> list = ((C890803dy) getState()).LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Object objLIZLLL : list) {
            if (objLIZLLL instanceof C889003dg) {
                C889003dg c889003dg = (C889003dg) objLIZLLL;
                c889003dg.LLILLJJLI.LIZJ = str;
                objLIZLLL = C889003dg.LIZLLL(c889003dg, new Object());
            }
            arrayList.add(objLIZLLL);
        }
        YQ2(arrayList);
        setStateImmediate(AFwS228S0000000_1.get$arr$(191));
    }

    public final void xQ2(PaymentMethod paymentMethod) {
        nR2("sub_payment_type_element", C1697810uHb.LJIIJJI(new PaymentElement("sub_payment_id_element", "sub_payment_id_element", paymentMethod.id, null, Boolean.FALSE), new PaymentElement("sub_payment_token_element", "sub_payment_token_element", paymentMethod.token, null, Boolean.FALSE)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String pR2(String str, List list) {
        String str2;
        PaymentElement paymentElement;
        if (list != null && (paymentElement = (PaymentElement) C13LP.LJJJLZIJ(0, list)) != null) {
            str2 = paymentElement.paramValue;
        } else {
            str2 = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1675358935:
                    if (str.equals("eg_ccdc_global_billing_address_state") && (str2 == null || str2.length() == 0)) {
                        return MQ2(2131848084);
                    }
                    break;
                case -396027285:
                    if (str.equals("eg_ccdc_global_billing_address_street")) {
                        if (str2 != null && str2.length() != 0) {
                            if (str2.length() > 79) {
                                return MQ2(2131832659);
                            }
                        } else {
                            return C928803k6.LIZ("pipo_common_error_required_field", "pipo_common_payin_address");
                        }
                    }
                    break;
                case -304863367:
                    if (str.equals("eg_ccdc_global_billing_address_postal_code") && (str2 == null || str2.length() == 0)) {
                        return C928803k6.LIZ("pipo_common_error_required_field", "pipo_common_payin_postalcode");
                    }
                    break;
                case -193077805:
                    if (str.equals("eg_ccdc_global_billing_address_city")) {
                        Regex regex = new Regex("^[0-9\\-\\+\\(\\)?~\\[\\]@#$%\\^&*\\\\\\/`+=_（）「」{}【】、|？。，》《！!,.<>]+$");
                        if (str2 != null && str2.length() != 0) {
                            SettingsManager.LIZLLL().getClass();
                            if (SettingsManager.LIZ("ecom_billing_address_regx_switch", false) && regex.matches(str2)) {
                                return MQ2(2131832671);
                            }
                        } else {
                            return MQ2(2131832672);
                        }
                    }
                    break;
            }
        }
        return null;
    }

    public final void hR2(PaymentInfo paymentInfo, List list) {
        String strLJIIJ;
        if (list != null && !list.isEmpty()) {
            PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
            if (paymentMethodInfo != null) {
                paymentMethodInfo.setPaymentElements(C03S8.LJJII(paymentMethodInfo.paymentElements, list));
            }
            EnterParams enterParams = this.LLILLJJLI;
            if (enterParams != null && enterParams.LJJIIJ) {
                return;
            }
            PaymentCacheHelper paymentCacheHelper = PaymentCacheHelper.LIZ;
            PaymentMethod paymentMethod = paymentInfo.paymentMethod;
            if (paymentMethod != null) {
                strLJIIJ = paymentMethod.LJIIJ();
            } else {
                strLJIIJ = null;
            }
            paymentCacheHelper.getClass();
            PaymentCacheHelper.LIZ(strLJIIJ, list);
        }
    }

    public final void kR2(int i, String str) {
        InterfaceC1891350zJl interfaceC1891350zJl;
        C890603dw c890603dw = this.LLJLILLLLZIIL;
        c890603dw.getClass();
        if (C770702zh.LIZ(str) && i != 0) {
            c890603dw.LIZIZ.put(str, Integer.valueOf(i));
            if (c890603dw.LIZ < i) {
                c890603dw.LIZ = i;
            }
        }
        C890603dw c890603dw2 = this.LLJLILLLLZIIL;
        if (!c890603dw2.LIZJ && c890603dw2.LIZIZ.size() >= 2) {
            c890603dw2.LIZJ = true;
            if (C878903c3.LIZ()) {
                List<InterfaceC1891350zJl> list = ((C890803dy) getState()).LLILLJJLI;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (InterfaceC1891350zJl interfaceC1891350zJl2 : list) {
                    if (interfaceC1891350zJl2 instanceof C889003dg) {
                        C889003dg c889003dg = (C889003dg) interfaceC1891350zJl2;
                        C889003dg c889003dgLIZLLL = C889003dg.LIZLLL(c889003dg, new Object());
                        c889003dgLIZLLL.LLILZIL = c889003dg.LLILZIL;
                        interfaceC1891350zJl = c889003dgLIZLLL;
                    } else if (!(interfaceC1891350zJl2 instanceof C889203di)) {
                        arrayList.add(interfaceC1891350zJl2);
                    } else {
                        C889203di c889203di = (C889203di) interfaceC1891350zJl2;
                        C889203di c889203diLIZLLL = C889203di.LIZLLL(c889203di, new Object());
                        c889203diLIZLLL.LLILZLL = c889203di.LLILZLL;
                        interfaceC1891350zJl = c889203diLIZLLL;
                    }
                    interfaceC1891350zJl2 = interfaceC1891350zJl;
                    arrayList.add(interfaceC1891350zJl2);
                }
                YQ2(arrayList);
            }
        }
    }

    public final void mR2(String str, String str2) {
        List<PaymentElement> list = (List) ((LinkedHashMap) this.LL).get(str);
        if (list != null) {
            PaymentElement paymentElement = (PaymentElement) C13LP.LJJJLL(list);
            if (paymentElement != null) {
                paymentElement.setParamValue(str2);
            }
            nR2(str, list);
        }
    }

    public final void nR2(String str, List<PaymentElement> list) {
        this.LL.put(str, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    @Override // X.InterfaceC1164530gPT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEvent(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel.onEvent(java.lang.String, java.lang.String):void");
    }

    public final void TQ2(C894003eU c894003eU, EnumC890503dv enumC890503dv, int i) {
        boolean z;
        String str;
        PaymentElement next;
        PaymentElement next2;
        String strLJJIIZ;
        String str2;
        String str3;
        String strLJJIIZ2;
        KQ2().getClass();
        OcrStatus ocrStatusLIZIZ = C904203g8.LIZIZ(c894003eU);
        OcrStatus ocrStatusLIZ = KQ2().LIZ(c894003eU);
        List<InterfaceC1891350zJl> list = ((C890803dy) getState()).LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Object objLIZLLL : list) {
            String str4 = "card_number_ocr";
            String str5 = "";
            if (objLIZLLL instanceof C889403dk) {
                C889403dk c889403dk = (C889403dk) objLIZLLL;
                PaymentElement paymentElementLIZ = c889403dk.LLILLJJLI.LIZ.LIZ();
                paymentElementLIZ.setParamValue(c894003eU.LIZ);
                String str6 = c889403dk.LLILLJJLI.LIZ.id;
                if (str6 != null) {
                    str5 = str6;
                }
                nR2(str5, Collections.singletonList(paymentElementLIZ));
                C890103dr c890103dr = C890103dr.LIZ;
                PaymentMethod paymentMethod = ((C890803dy) getState()).LL;
                if (paymentMethod != null) {
                    strLJJIIZ2 = paymentMethod.LJJIIZ();
                } else {
                    strLJJIIZ2 = null;
                }
                boolean zLJFF = Intrinsics.LJFF(ocrStatusLIZIZ.cardNumber, "1");
                String str7 = paymentElementLIZ.paramName;
                if (enumC890503dv != EnumC890503dv.OCR) {
                    str4 = "card_number_nfc";
                }
                Boolean boolLIZ = C890903dz.LIZ(ocrStatusLIZ.cardNumber);
                c890103dr.getClass();
                C890103dr.LJIIJ(boolLIZ, strLJJIIZ2, str7, str4, zLJFF);
                c889403dk.LLILLJJLI.LIZJ = C888803de.LIZIZ(c889403dk.LLILLJJLI.LIZ, c889403dk.LL, Collections.singletonList(paymentElementLIZ), null);
                objLIZLLL = C889403dk.LIZIZ(c889403dk, new Object());
            } else if (objLIZLLL instanceof C889003dg) {
                C895503ej c895503ej = c894003eU.LIZIZ;
                C889003dg c889003dg = (C889003dg) objLIZLLL;
                List<PaymentElement> listLIZIZ = c889003dg.LLILLJJLI.LIZ.LIZIZ();
                Iterator<PaymentElement> it2 = listLIZIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (C13LP.LJJJJ(next.element, C864803Zm.LIZLLL)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PaymentElement paymentElement = next;
                Iterator<PaymentElement> it3 = listLIZIZ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (C13LP.LJJJJ(next2.element, C864803Zm.LJ)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                PaymentElement paymentElement2 = next2;
                if (paymentElement != null) {
                    if (c895503ej != null) {
                        str3 = c895503ej.LIZIZ;
                    } else {
                        str3 = null;
                    }
                    paymentElement.setParamValue(str3);
                }
                if (paymentElement2 != null) {
                    if (c895503ej != null) {
                        str2 = c895503ej.LIZ;
                    } else {
                        str2 = null;
                    }
                    paymentElement2.setParamValue(str2);
                }
                C890103dr c890103dr2 = C890103dr.LIZ;
                PaymentMethod paymentMethod2 = ((C890803dy) getState()).LL;
                if (paymentMethod2 != null) {
                    strLJJIIZ = paymentMethod2.LJJIIZ();
                } else {
                    strLJJIIZ = null;
                }
                boolean zLJFF2 = Intrinsics.LJFF(ocrStatusLIZIZ.date, "1");
                String str8 = c889003dg.LLILLJJLI.LIZ.paramName;
                c890103dr2.getClass();
                C890103dr.LJIIJ(C890903dz.LIZ(ocrStatusLIZ.date), strLJJIIZ, C890103dr.LJIIZILJ(str8), "card_number_ocr", zLJFF2);
                String str9 = c889003dg.LLILLJJLI.LIZ.id;
                if (str9 != null) {
                    str5 = str9;
                }
                nR2(str5, C13LQ.LJIJI(new PaymentElement[]{paymentElement, paymentElement2}));
                c889003dg.LLILLJJLI.LIZJ = C888803de.LIZIZ(c889003dg.LLILLJJLI.LIZ, c889003dg.LL, C13LQ.LJIJI(new PaymentElement[]{paymentElement, paymentElement2}), null);
                objLIZLLL = C889003dg.LIZLLL(c889003dg, new Object());
            }
            arrayList.add(objLIZLLL);
        }
        YQ2(arrayList);
        if (enumC890503dv == EnumC890503dv.NFC) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
        KQ2().LIZLLL = c894003eU;
        C890103dr c890103dr3 = C890103dr.LIZ;
        if (enumC890503dv == EnumC890503dv.OCR) {
            str = "ocr_scanning";
        } else {
            str = "nfc_scanning";
        }
        c890103dr3.getClass();
        C890103dr.LJIIL(i, "card_result", ocrStatusLIZIZ.toString(), C890103dr.LIZ(str), ocrStatusLIZ.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r9, boolean r10, kotlin.jvm.functions.Function0<kotlin.Unit> r11) {
        /*
            r8 = this;
            r2 = 1
            r7 = 0
            r4 = r9
            if (r10 == 0) goto L6c
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r4.paymentMethod
            if (r1 == 0) goto L6a
            java.lang.String r0 = r1.id
        Lb:
            boolean r0 = X.C03S8.LJIJJ(r0)
            if (r0 == 0) goto L77
            if (r1 == 0) goto L77
            boolean r0 = r1.LIZIZ
            if (r0 != r2) goto L77
            boolean r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceConfigSettings.LIZIZ()
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceConfigSettings$PaymentPricingModel r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceConfigSettings.LIZJ()
            java.lang.Boolean r0 = r0.supportNewCcdcCardCalculation
            if (r0 == 0) goto L77
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L77
            X.03Q4 r0 = X.C03Q4.LIZ
            boolean r0 = X.C03Q4.LJJ(r0, r1)
            if (r0 == 0) goto L77
        L33:
            boolean r0 = r4.LJII
            if (r0 != 0) goto L77
        L37:
            if (r10 == 0) goto L67
            java.lang.String r5 = "ccdc"
        L3b:
            java.lang.String r3 = "CCDCAddCardViewModel"
            r6 = r11
            if (r2 == 0) goto L79
            X.03OI r2 = X.C03OI.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r5)
            java.lang.String r0 = " start request independent pricing"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C03OI.LJFF(r3, r0)
            r3 = r8
            X.01wk r1 = androidx.lifecycle.ViewModelKt.getViewModelScope(r3)
            X.03cO r2 = new X.03cO
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r7, r7, r2, r0)
            return
        L67:
            java.lang.String r5 = "cci"
            goto L3b
        L6a:
            r0 = r7
            goto Lb
        L6c:
            X.03Q4 r1 = X.C03Q4.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r4.paymentMethod
            boolean r0 = X.C03Q4.LJJ(r1, r0)
            if (r0 == 0) goto L77
            goto L33
        L77:
            r2 = 0
            goto L37
        L79:
            X.03OI r2 = X.C03OI.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r5)
            java.lang.String r0 = " no need pricing, pmid: "
            r1.append(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r4.paymentMethod
            if (r0 == 0) goto Lc0
            java.lang.String r0 = r0.id
        L8d:
            r1.append(r0)
            java.lang.String r0 = ", token: "
            r1.append(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r4.paymentMethod
            if (r0 == 0) goto Lbe
            java.lang.String r0 = r0.token
        L9b:
            r1.append(r0)
            java.lang.String r0 = ", newCard: "
            r1.append(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r4.paymentMethod
            if (r0 == 0) goto Lad
            boolean r0 = r0.LIZIZ
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        Lad:
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C03OI.LJFF(r3, r0)
            r6.invoke()
            return
        Lbe:
            r0 = r7
            goto L9b
        Lc0:
            r0 = r7
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel.WQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, boolean, kotlin.jvm.functions.Function0):void");
    }

    public final String rR2(C862703Yr c862703Yr, PaymentMethod paymentMethod, List<PaymentElement> list) {
        String strLIZIZ = C888803de.LIZIZ(c862703Yr.LIZ, paymentMethod, list, null);
        if (Intrinsics.LJFF(strLIZIZ, "system_error")) {
            setState(AFwS228S0000000_1.get$arr$(193));
            return "";
        }
        return strLIZIZ;
    }

    public final n vQ2(String str, String str2, List list) {
        n nVar;
        String next;
        PaymentMethodsData paymentMethodsData;
        String str3;
        Address address;
        List<AddressItem> list2;
        AddressItem next2;
        Address address2;
        List<PaymentElement> list3;
        PaymentElement paymentElement;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        try {
            EnterParams enterParams = this.LLILLJJLI;
            if (enterParams == null || (nVar = enterParams.LJFF) == null) {
                nVar = new n();
            }
            n nVarLIZJ = nVar.LIZJ();
            k kVarLJJIJL = nVarLIZJ.LJJIJL("iid");
            if (kVarLJJIJL != null) {
                nVarLIZJ.LJJIIJ("install_id", kVarLJJIJL.LJIL());
            }
            String strLIZ = C09GB.LIZ();
            if (strLIZ != null) {
                nVarLIZJ.LJJIIJ("ip_address", strLIZ);
            }
            String str4 = null;
            if (nVarLIZJ.LJJIIZ("did") != null) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = ILogDependencyService.class.getName();
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                }
                nVarLIZJ.LJJIIJ("did", ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getServerDeviceId());
            }
            Map<String, List<PaymentElement>> map = this.LL;
            nVarLIZJ.LJJIIJ("card_number", str2);
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            List list4 = (List) linkedHashMap.get("eg_ccdc_global_holder_name");
            if (list4 != null && (paymentElement = (PaymentElement) C13LP.LJJJLL(list4)) != null) {
                nVarLIZJ.LJJIIJ("holder_name", paymentElement.paramValue);
            }
            Iterator<String> it2 = C864803Zm.LJFF.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (linkedHashMap.containsKey(next)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            String str5 = next;
            if (str5 != null && (list3 = (List) linkedHashMap.get(str5)) != null) {
                for (PaymentElement paymentElement2 : list3) {
                    if (C13LP.LJJJJ(paymentElement2.element, C864803Zm.LJ)) {
                        nVarLIZJ.LJJIIJ("expiry_date_year", paymentElement2.paramValue);
                    } else if (C13LP.LJJJJ(paymentElement2.element, C864803Zm.LIZLLL)) {
                        nVarLIZJ.LJJIIJ("expiry_date_month", paymentElement2.paramValue);
                    }
                }
            }
            if (Intrinsics.LJFF(getState().LLJIJIL, Boolean.TRUE)) {
                EnterParams enterParams2 = this.LLILLJJLI;
                if (enterParams2 != null) {
                    address2 = enterParams2.shippingAddress;
                } else {
                    address2 = null;
                }
                list = C7769031r.LIZIZ(address2, JQ2());
            }
            if (list != null) {
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
                for (PaymentElement paymentElement3 : list) {
                    Pair pair = new Pair(paymentElement3.element, paymentElement3);
                    linkedHashMap2.put(pair.getFirst(), pair.getSecond());
                }
                PaymentElement paymentElement4 = (PaymentElement) linkedHashMap2.get("eg_ccdc_global_billing_address_country_regin");
                if (paymentElement4 != null) {
                    nVarLIZJ.LJJIIJ("billing_country", paymentElement4.paramValue);
                }
                PaymentElement paymentElement5 = (PaymentElement) linkedHashMap2.get("eg_ccdc_global_billing_address_street");
                if (paymentElement5 != null) {
                    nVarLIZJ.LJJIIJ("billing_address", paymentElement5.paramValue);
                }
                PaymentElement paymentElement6 = (PaymentElement) linkedHashMap2.get("eg_ccdc_global_billing_address_city");
                if (paymentElement6 != null) {
                    nVarLIZJ.LJJIIJ("billing_city", paymentElement6.paramValue);
                }
                PaymentElement paymentElement7 = (PaymentElement) linkedHashMap2.get("eg_ccdc_global_billing_address_state");
                if (paymentElement7 != null) {
                    nVarLIZJ.LJJIIJ("billing_state", paymentElement7.paramValue);
                }
            }
            EnterParams enterParams3 = this.LLILLJJLI;
            if (enterParams3 != null && (address = enterParams3.shippingAddress) != null && (list2 = address.items) != null) {
                Iterator<AddressItem> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        String str6 = next2.key;
                        if (str6 != null && str6.equals("plain_phone")) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                AddressItem addressItem = next2;
                if (addressItem != null) {
                    nVarLIZJ.LJJIIJ("billing_phone", addressItem.value);
                }
            }
            nVarLIZJ.LJJIIJ("pi_is_save", String.valueOf(getState().LLILZIL));
            C894003eU c894003eU = KQ2().LIZLLL;
            if (c894003eU != null) {
                str4 = c894003eU.LIZJ;
            }
            nVarLIZJ.LJJIIJ("pi_ocr", String.valueOf(Intrinsics.LJFF(str4, str)));
            EnterParams enterParams4 = this.LLILLJJLI;
            if (enterParams4 != null && (paymentMethodsData = enterParams4.paymentData) != null && (str3 = paymentMethodsData.consultationId) != null) {
                nVarLIZJ.LJJIIJ("consultation_id", str3);
                return nVarLIZJ;
            }
            return nVarLIZJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new n();
        }
    }

    public final void wQ2(PaymentInfo paymentInfo, String str, List list) {
        if (bR2(paymentInfo)) {
            yQ2(str, paymentInfo, list, this.LLILLL);
        } else {
            zQ2(paymentInfo, this.LLILLL, list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r13.equals("ADD_NEW_CCI_BR") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r13.equals("ADD_NEW_CCI_US") == false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r22, java.lang.String r23, java.util.List r24) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel.zQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, java.lang.String, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod DQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r43, java.lang.String r44, java.lang.String r45, java.lang.String r46) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel.DQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, java.lang.String, java.lang.String, java.lang.String):com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod");
    }

    public final void VQ2(PaymentInfo paymentInfo, List<ElementDTO> list, List<PaymentElement> list2, boolean z) {
        WQ2(paymentInfo, true, new C884503cx(this, paymentInfo, list, list2, z));
    }

    public final void yQ2(String str, PaymentInfo paymentInfo, List<PaymentElement> list, String str2) {
        setStateImmediate(AFwS228S0000000_1.get$arr$(187));
        try {
            C03SY c03sy = C03SY.LIZ;
            C899803fQ c899803fQ = new C899803fQ(this, paymentInfo, str, list, str2);
            AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(this, 1044);
            c03sy.getClass();
            C03SY.LJIILIIL(awS545S0100000_1, c899803fQ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    public final void UQ2(PaymentInfo paymentInfo, List list, n nVar, boolean z, AwS245S0300000_1 awS245S0300000_1) {
        List listLIZIZ;
        Address address;
        if (Intrinsics.LJFF(getState().LLJIJIL, Boolean.TRUE)) {
            EnterParams enterParams = this.LLILLJJLI;
            if (enterParams != null && (address = enterParams.shippingAddress) != null) {
                listLIZIZ = C7769031r.LIZIZ(address, JQ2());
            } else {
                listLIZIZ = null;
            }
        } else {
            listLIZIZ = list;
        }
        PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo != null) {
            paymentMethodInfo.setPaymentElements(C03S8.LJJII(paymentMethodInfo.paymentElements, listLIZIZ));
        }
        this.LLJJJJJIL = paymentInfo;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C881903cX(this, paymentInfo, list, z, nVar, awS245S0300000_1, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oR2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r10, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r11, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement> r12, androidx.recyclerview.widget.RecyclerView r13, android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel.oR2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, java.util.List, androidx.recyclerview.widget.RecyclerView, android.view.View):void");
    }

    public final void qR2(PaymentInfo paymentInfo, List<ElementDTO> list, List<PaymentElement> list2, EnumC889603dm enumC889603dm, boolean z, Function2<? super Boolean, ? super String, Unit> function2) {
        boolean zLJFF;
        List<PaymentElement> list3;
        String str;
        String str2;
        PaymentMethodInfo paymentMethodInfo;
        Address address;
        List<PaymentElement> listLIZIZ = list2;
        EnterParams enterParams = this.LLILLJJLI;
        if (enterParams != null) {
            zLJFF = Intrinsics.LJFF(enterParams.LJIIJ, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF && this.LLJLL != null && !z) {
            C03OI.LIZ.getClass();
            C03OI.LJFF("CCDCAddCardViewModel", "use cached data");
            C894203eW c894203eW = this.LLJLL;
            if (c894203eW != null) {
                function2.invoke(Boolean.valueOf(c894203eW.LIZ), c894203eW.LIZIZ);
                return;
            }
            return;
        }
        try {
            C03OI.LIZ.getClass();
            C03OI.LJFF("CCDCAddCardViewModel", "start verifyCardTypeAndInstallment");
            String str3 = IQ2().code;
            if (str3 != null) {
                setStateImmediate(AFwS228S0000000_1.get$arr$(192));
                if (Intrinsics.LJFF(getState().LLJIJIL, Boolean.TRUE)) {
                    EnterParams enterParams2 = this.LLILLJJLI;
                    if (enterParams2 != null) {
                        address = enterParams2.shippingAddress;
                    } else {
                        address = null;
                    }
                    listLIZIZ = C7769031r.LIZIZ(address, list);
                }
                if (paymentInfo == null || (paymentMethodInfo = paymentInfo.paymentMethodInfo) == null) {
                    list3 = null;
                } else {
                    list3 = paymentMethodInfo.paymentElements;
                }
                List listLJJII = C03S8.LJJII(list3, listLIZIZ);
                C03SY c03sy = C03SY.LIZ;
                EnterParams enterParams3 = this.LLILLJJLI;
                if (enterParams3 != null) {
                    str = enterParams3.currency;
                    str2 = enterParams3.totalPriceVal;
                } else {
                    str = null;
                    str2 = null;
                }
                AwS100S0400000_1 awS100S0400000_1 = new AwS100S0400000_1(this, (CCDCAddCardViewModel) enumC889603dm, (EnumC889603dm) paymentInfo, (PaymentInfo) function2, (Function2<? super Boolean, ? super String, Unit>) 4);
                AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(this, 1046);
                c03sy.getClass();
                C03SY.LJIILIIL(null, new C914803hq(paymentInfo, str3, str, str2, listLJJII, awS545S0100000_1, awS100S0400000_1));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("verifyCardInstallment: ");
            sbLIZ.append(e);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
