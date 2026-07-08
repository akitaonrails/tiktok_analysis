package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc;

import X.AbstractC1710370ubr;
import X.C01GW;
import X.C08HX;
import X.C098200Yq;
import X.C1159290gH1;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1707990uY1;
import X.C1708210uYN;
import X.C1708220uYO;
import X.C1708320uYY;
import X.C1708600uZ0;
import X.C1708610uZ1;
import X.C1708710uZB;
import X.C1708720uZC;
import X.C1708990uZd;
import X.C1709000uZe;
import X.C1709040uZi;
import X.C1709380uaG;
import X.C1709570uaZ;
import X.C1709630uaf;
import X.C1709640uag;
import X.C1709650uah;
import X.C1709660uai;
import X.C1709720uao;
import X.C1710110ubR;
import X.C1710320ubm;
import X.C1710330ubn;
import X.C1710340ubo;
import X.C1710350ubp;
import X.C1710360ubq;
import X.C1710390ubt;
import X.C1710510uc5;
import X.C1710830ucb;
import X.C1722320uv8;
import X.C189200o6;
import X.C1949207kI;
import X.C19719612Di;
import X.C19EG;
import X.C1AF0;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1709020uZg;
import X.EnumC1710440uby;
import X.EnumC1710490uc3;
import X.EnumC995340c0a;
import X.InterfaceC0148002o;
import X.InterfaceC1708270uYT;
import X.InterfaceC1891350zJl;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.os.Looper;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ab.PipoCashierElementVerifierSettings;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PaymentOptionLocalInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.v3.CashierPaymentOptionInfoResp;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POFormAutoFillAddress;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POFormAutoFillInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POFormInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS38S0010000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class CCDCAddCardViewModel extends AssemViewModel<C1159290gH1> {
    public C19EG LL;
    public C1709640uag LLILLJJLI;
    public C1710390ubt LLILLL;
    public PaymentOption LLILZIL;
    public PaymentOption LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public Function1<? super Boolean, Unit> LLJI;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final List<POPayElement> LLILZ = new ArrayList();
    public List<C1710320ubm> LLJ = C13BV.INSTANCE;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 972));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(224));
    public final Map<EnumC1710490uc3, Function1<C1710830ucb, Unit>> LLJILJILJ = new LinkedHashMap();
    public final AtomicBoolean LLJJI = new AtomicBoolean(false);

    public final C1709630uaf AQ2() {
        return (C1709630uaf) this.LLJIJIL.getValue();
    }

    public final List<POPayElement> CQ2() {
        String str;
        String strLIZ;
        C1709570uaZ c1709570uaZ;
        CashierPaymentOptionInfoResp.GlobalConfiguration globalConfiguration;
        C1709640uag c1709640uag = this.LLILLJJLI;
        if (c1709640uag == null || (c1709570uaZ = c1709640uag.LJIIIIZZ) == null || (globalConfiguration = c1709570uaZ.LIZLLL) == null || (str = globalConfiguration.encodeKey) == null) {
            str = "";
        }
        List<POPayElement> list = this.LLILZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (POPayElement pOPayElement : (ArrayList) list) {
            String str2 = pOPayElement.id;
            String str3 = pOPayElement.paramName;
            if (Intrinsics.LJFF(pOPayElement.isEncrypted, Boolean.TRUE)) {
                C1709650uah c1709650uah = C1709720uao.LIZ;
                String str4 = pOPayElement.paramValue;
                c1709650uah.getClass();
                strLIZ = C1709650uah.LIZ(str4, str);
            } else {
                strLIZ = pOPayElement.paramValue;
            }
            arrayList.add(new POPayElement(str2, str3, strLIZ, pOPayElement.isEncrypted));
        }
        return new ArrayList(arrayList);
    }

    public final String DQ2() {
        Context applicationContext;
        String string;
        C19EG c19eg = this.LL;
        if (c19eg != null && (string = c19eg.getString(2131835079)) != null) {
            return string;
        }
        IAppContextManagerService iAppContextManagerService = (IAppContextManagerService) PluggableExtentionKt.pluggableSpi$default(IAppContextManagerService.class, false, false, false, 14, null);
        if (iAppContextManagerService == null || (applicationContext = iAppContextManagerService.getApplicationContext()) == null) {
            return null;
        }
        return applicationContext.getString(2131835079);
    }

    public final PaymentOption EQ2() {
        PaymentOption paymentOption = this.LLILZIL;
        return paymentOption == null ? this.LLILZLL : paymentOption;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1159290gH1(0);
    }

    public final boolean vQ2() {
        Map<String, String> mapLJ;
        String str;
        PaymentOption paymentOption;
        POFormInfo pOFormInfo;
        POFormAutoFillInfo pOFormAutoFillInfo;
        POFormAutoFillAddress pOFormAutoFillAddress;
        C1709640uag c1709640uag = this.LLILLJJLI;
        if (c1709640uag == null || (paymentOption = c1709640uag.LIZJ) == null || (pOFormInfo = paymentOption.formInfo) == null || (pOFormAutoFillInfo = pOFormInfo.autoFillInfo) == null || (pOFormAutoFillAddress = pOFormAutoFillInfo.address) == null || (mapLJ = pOFormAutoFillAddress.subElementAutoFill) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (C1710320ubm c1710320ubm : this.LLJ) {
            String str2 = c1710320ubm.LIZJ;
            if (str2 != null && str2.length() > 0 && linkedHashSet.add(c1710320ubm.LIZIZ) && (str = mapLJ.get(str2)) != null) {
                C19719612Di.LJJIIJ(this.LLILZ, new AwS605S0100000_26(c1710320ubm, 351), true);
                ((ArrayList) this.LLILZ).add(new POPayElement(c1710320ubm.LIZ, str2, str, c1710320ubm.LIZLLL));
                z = true;
            }
        }
        return z;
    }

    public final void xQ2() {
        C1709570uaZ c1709570uaZ;
        C1707990uY1 c1707990uY1;
        String str;
        PaymentOption paymentOption = this.LLILZIL;
        if (paymentOption == null) {
            return;
        }
        String strLJIL = paymentOption.LJIL();
        String str2 = "";
        if (strLJIL == null) {
            strLJIL = "";
        }
        C1709640uag c1709640uag = this.LLILLJJLI;
        if (c1709640uag != null && (c1709570uaZ = c1709640uag.LJIIIIZZ) != null && (c1707990uY1 = c1709570uaZ.LIZIZ) != null && (str = c1707990uY1.LJ) != null) {
            str2 = str;
        }
        String strLIZ = C1949207kI.LIZ(strLJIL, str2);
        if (!(!(paymentOption.bindInfo != null ? Intrinsics.LJFF(r0.isNeedPreBindVerify, Boolean.FALSE) : false))) {
            wQ2(null);
            C1708220uYO.LIZLLL.getClass();
            C1708210uYN.LIZJ(strLIZ, CardStruct.IStatusCode.DEFAULT, null, null);
            return;
        }
        AwS140S1100000_26 awS140S1100000_26 = new AwS140S1100000_26(this, strLIZ, 21);
        PaymentOption paymentOption2 = this.LLILZIL;
        if (paymentOption2 != null) {
            FQ2(true);
            C1708210uYN c1708210uYN = C1708220uYO.LIZLLL;
            C1709640uag c1709640uag2 = this.LLILLJJLI;
            C1709570uaZ c1709570uaZ2 = c1709640uag2 != null ? c1709640uag2.LJIIIIZZ : null;
            C19EG c19eg = this.LL;
            List<POPayElement> listCQ2 = CQ2();
            C1709380uaG c1709380uaG = new C1709380uaG(this);
            AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26(this, awS140S1100000_26, 101);
            c1708210uYN.getClass();
            C1708210uYN.LJ(paymentOption2, c1709570uaZ2, c19eg, strLIZ, listCQ2, c1709380uaG, awS392S0200000_26);
        }
    }

    public final boolean zQ2() {
        return KQ2(C13BV.INSTANCE, false, false);
    }

    public final Element BQ2(EnumC1710490uc3 enumC1710490uc3) {
        PaymentOption paymentOptionEQ2 = EQ2();
        if (paymentOptionEQ2 != null) {
            return paymentOptionEQ2.LJII(enumC1710490uc3, EnumC995340c0a.ELEMENT);
        }
        return null;
    }

    public final void FQ2(boolean z) {
        setStateImmediate(new AwS38S0010000_26(z, 5));
    }

    public final void HQ2(String str) {
        if (str != null && str.length() != 0) {
            setStateImmediate(new AwS76S1000000_26(str, 9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void IQ2(java.lang.String r13) {
        /*
            r12 = this;
            X.0uag r0 = r12.LLILLJJLI
            r3 = 0
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r0 = r0.LIZJ
            if (r0 == 0) goto L60
            java.util.List r0 = r0.LJIIIIZZ()
            if (r0 == 0) goto L60
            java.util.Iterator r1 = r0.iterator()
        L13:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r4 = r1.next()
            r0 = r4
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r0 = (com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption) r0
            java.lang.String r0 = r0.cardRuleRegex
            if (r0 == 0) goto L13
            boolean r0 = java.util.regex.Pattern.matches(r0, r13)
            if (r0 == 0) goto L13
        L2a:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r4 = (com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption) r4
            if (r4 == 0) goto L60
            r5 = 0
            r11 = 536870911(0x1fffffff, float:1.0842021E-19)
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r4 = com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption.LJ(r4, r5, r6, r7, r8, r9, r10, r11)
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r2 = com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption.LJ(r4, r5, r6, r7, r8, r9, r10, r11)
        L44:
            r12.LLILZIL = r2
            X.0uag r0 = r12.LLILLJJLI
            if (r0 == 0) goto L5d
            X.0h8s r0 = r0.LJFF
            if (r0 == 0) goto L5d
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r1 = r0.LIZIZ
            if (r1 == 0) goto L5d
            if (r2 == 0) goto L5a
            com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.v3.CashierPaymentOptionInfoResp$PaymentUnitAtomicInfo r0 = r2.LJFF
            if (r0 == 0) goto L5a
            java.lang.String r3 = r0.pricingPlanId
        L5a:
            r1.invoke(r3)
        L5d:
            return
        L5e:
            r4 = r3
            goto L2a
        L60:
            r2 = r3
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardViewModel.IQ2(java.lang.String):void");
    }

    public final void JQ2(Map<EnumC1710490uc3, String> map) {
        Element elementLJII;
        for (Map.Entry<EnumC1710490uc3, String> entry : map.entrySet()) {
            EnumC1710490uc3 key = entry.getKey();
            String value = entry.getValue();
            PaymentOption paymentOptionEQ2 = EQ2();
            if (paymentOptionEQ2 != null && (elementLJII = paymentOptionEQ2.LJII(key, EnumC995340c0a.ELEMENT)) != null) {
                C19719612Di.LJJIIJ(this.LLILZ, new AwS605S0100000_26(key, 352), true);
                ((ArrayList) this.LLILZ).add(new POPayElement(elementLJII.id, elementLJII.paramName, value, elementLJII.needEncrypted));
            }
        }
    }

    public final void wQ2(String str) {
        C1709640uag c1709640uag;
        C1709570uaZ c1709570uaZ;
        Object next;
        String str2;
        int i;
        String str3;
        String strLJJLIIIJ;
        String strSubstring;
        PaymentOption next2;
        String str4;
        List<PaymentOptionLocalInfo> list;
        String strLIZ;
        String str5;
        Function0<Unit> function0;
        EnumC1709020uZg enumC1709020uZgLIZ;
        PaymentOption paymentOption = this.LLILZIL;
        if (paymentOption != null && (c1709640uag = this.LLILLJJLI) != null && (c1709570uaZ = c1709640uag.LJIIIIZZ) != null) {
            Iterator it2 = ((ArrayList) this.LLILZ).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((POPayElement) next).LIZ() == EnumC1710490uc3.CARD_NUMBER) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            POPayElement pOPayElement = (POPayElement) next;
            if (pOPayElement != null) {
                str2 = pOPayElement.paramValue;
            } else {
                str2 = null;
            }
            PIPOPaymentMethod pIPOPaymentMethod = paymentOption.legacyPM;
            String str6 = "";
            if (pIPOPaymentMethod != null) {
                i = 4;
                strLJJLIIIJ = C1709660uai.LIZ(pIPOPaymentMethod.groupCode, pIPOPaymentMethod.groupType, pIPOPaymentMethod.id, pIPOPaymentMethod.token, pIPOPaymentMethod.cbiModel, str2, null);
            } else {
                i = 4;
                String[] strArr = new String[4];
                String str7 = paymentOption.parentKey;
                if (str7 == null) {
                    str7 = "";
                }
                strArr[0] = str7;
                strArr[1] = paymentOption.LIZ;
                String strLJIL = paymentOption.LJIL();
                if (strLJIL == null) {
                    strLJIL = "";
                }
                strArr[2] = strLJIL;
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                strArr[3] = str3;
                strLJJLIIIJ = C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(strArr), "--", null, null, 0, null, null, 62);
            }
            C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
            StringBuilder sb = new StringBuilder("generate local po for: ");
            C1709720uao.LIZ.getClass();
            sb.append(C1709650uah.LIZJ(strLJJLIIIJ));
            c1708720uZCLIZ.LIZ(i, sb.toString());
            if (str2 == null || str2.length() < i) {
                strSubstring = "";
            } else {
                strSubstring = str2.substring((str2.length() - 1) - 3);
            }
            String str8 = paymentOption.displayInfo.name + ' ' + strSubstring;
            C19EG c19eg = this.LL;
            if (c19eg != null && C426750GoL.LIZLLL(c19eg)) {
                str8 = strSubstring + ' ' + paymentOption.displayInfo.name;
            }
            PaymentOption paymentOptionLIZJ = paymentOption.LIZJ(strLJJLIIIJ, str8);
            Iterator<PaymentOption> it3 = c1709570uaZ.LJIILIIL.localAddedCCDCPOs.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.LJFF(next2.LIZ, paymentOptionLIZJ.LIZ)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            int size = c1709570uaZ.LJIILIIL.localAddedCCDCPOs.size();
            if (next2 != null) {
                c1709570uaZ.LJIILIIL.localAddedCCDCPOs.remove(next2);
            }
            c1709570uaZ.LJJJLIIL(System.currentTimeMillis(), paymentOptionLIZJ.LIZ);
            ListProtector.add(c1709570uaZ.LJIILIIL.localAddedCCDCPOs, 0, paymentOptionLIZJ);
            c1709570uaZ.LJJLI(c1709570uaZ.LJIILIIL, false, "insertLocalAddedCard");
            c1709570uaZ.LJJLIIIJJI();
            c1709570uaZ.LJJJJ();
            if (next2 != null) {
                str4 = "replace_existing";
            } else {
                str4 = "insert_new";
            }
            C1710110ubR.LJIIIIZZ("insert_local_added_card", str4, "local_added_ccdc_pos", String.valueOf(size), String.valueOf(c1709570uaZ.LJIILIIL.localAddedCCDCPOs.size()), c1709570uaZ.LJIJJLI(new Pair<>("poKey", C1710110ubR.LIZJ(paymentOptionLIZJ.LIZ))));
            PaymentOptionLocalInfo paymentOptionLocalInfo = new PaymentOptionLocalInfo(strLJJLIIIJ, false, new ArrayList(this.LLILZ), System.currentTimeMillis(), Boolean.valueOf(getState().LLILLL), null, null, str, null, null);
            if (c1709570uaZ.LJIIJ == null || (list = c1709570uaZ.LJIIL) == null) {
                list = c1709570uaZ.LJIIJJI;
            }
            C19719612Di.LJJIIJ(list, new AwS76S1000000_26(strLJJLIIIJ, 20), true);
            list.add(paymentOptionLocalInfo);
            c1709570uaZ.LJIILJJIL(paymentOptionLIZJ.LIZ, true, true);
            C1709630uaf c1709630uafAQ2 = AQ2();
            boolean z = getState().LLILLL;
            C1709640uag c1709640uag2 = this.LLILLJJLI;
            if (c1709640uag2 != null && (enumC1709020uZgLIZ = c1709640uag2.LIZ()) != null) {
                strLIZ = C1709040uZi.LIZ(enumC1709020uZgLIZ);
            } else {
                strLIZ = null;
            }
            c1709630uafAQ2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (z) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_saved", str5);
            if (strLIZ != null) {
                str6 = strLIZ;
            }
            linkedHashMap.put("source_page_name", str6);
            C1708610uZ1.LIZIZ(c1709630uafAQ2.LIZ).LIZ("rd_pipo_ccdc_add_result", linkedHashMap);
            setStateImmediate(AFwS268S0000000_26.get$arr$(399));
            C1709640uag c1709640uag3 = this.LLILLJJLI;
            if (c1709640uag3 != null && (function0 = c1709640uag3.LJI) != null) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS116S0100000_16(function0, (Function0<Unit>) 65));
            }
        }
    }

    public final List<InterfaceC1891350zJl> yQ2(List<C1710320ubm> list, boolean z) {
        AbstractC1710370ubr c1710350ubp;
        int i;
        ArrayList arrayList = new ArrayList();
        C1709640uag c1709640uag = this.LLILLJJLI;
        if (c1709640uag != null) {
            int i2 = 0;
            for (Object obj : (ArrayList) list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C1710320ubm c1710320ubm = (C1710320ubm) obj;
                    switch (C1710510uc5.LIZIZ[c1710320ubm.LIZIZ.ordinal()]) {
                        case 1:
                        case 2:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                            if (i2 >= r10.size() - 1 && !z) {
                                i = 6;
                            } else {
                                i = 5;
                            }
                            c1710350ubp = new C1710360ubq(c1710320ubm, new AwS570S0100000_26(c1709640uag, 974), i);
                            arrayList.add(c1710350ubp);
                            break;
                        case 3:
                            c1710350ubp = new C1710330ubn(c1710320ubm, new AwS570S0100000_26(c1709640uag, 976));
                            arrayList.add(c1710350ubp);
                            break;
                        case 5:
                            c1710350ubp = new C1710340ubo(c1710320ubm, new AwS570S0100000_26(c1709640uag, 973));
                            arrayList.add(c1710350ubp);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1710350ubp = new C1710350ubp(c1710320ubm, new AwS570S0100000_26(c1709640uag, 975));
                            arrayList.add(c1710350ubp);
                            break;
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return arrayList;
    }

    public final void GQ2(String str, String str2, List<POPayElement> list) throws JSONException {
        C1709570uaZ c1709570uaZ;
        C1707990uY1 c1707990uY1;
        PaymentOption paymentOption;
        String str3;
        C1708990uZd c1708990uZd;
        String str4;
        C1708990uZd c1708990uZd2;
        C1709640uag c1709640uag = this.LLILLJJLI;
        if (c1709640uag == null || (c1709570uaZ = c1709640uag.LJIIIIZZ) == null || (c1707990uY1 = c1709570uaZ.LIZIZ) == null || (paymentOption = this.LLILZIL) == null) {
            return;
        }
        C1708990uZd c1708990uZd3 = c1709640uag.LIZ.LIZJ;
        String str5 = "";
        if (c1708990uZd3 == null || (str3 = c1708990uZd3.LIZLLL) == null) {
            str3 = "";
        }
        String str6 = null;
        JSONObject jSONObjectLIZJ = C1722320uv8.LIZJ(str3, null);
        C1709640uag c1709640uag2 = this.LLILLJJLI;
        if (c1709640uag2 != null && (c1708990uZd2 = c1709640uag2.LIZ.LIZJ) != null) {
            str6 = c1708990uZd2.LIZLLL;
        }
        if (u.LJIJI(str6, "gift_card", false)) {
            String str7 = c1707990uY1.LJ;
            if (str7 == null) {
                str7 = "";
            }
            jSONObjectLIZJ.put("merchant_user_id", str7);
        } else {
            String str8 = c1707990uY1.LJ;
            if (str8 == null) {
                str8 = "";
            }
            jSONObjectLIZJ.put("wallet_user_id", str8);
        }
        jSONObjectLIZJ.put("verify_request_id", str);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pipo_enable_add_ccdc_bind_riskinfo", true)) {
            try {
                for (Map.Entry entry : ((LinkedHashMap) C08HX.LJ(new JSONObject(C1708600uZ0.LIZJ()))).entrySet()) {
                    if (jSONObjectLIZJ.isNull((String) entry.getKey())) {
                        jSONObjectLIZJ.put((String) entry.getKey(), entry.getValue());
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        Map<String, String> map = c1707990uY1.LJFF;
        if (!map.isEmpty()) {
            try {
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    String key = entry2.getKey();
                    String value = entry2.getValue();
                    if ((!a0.LJJJIL(key)) && !jSONObjectLIZJ.has(key)) {
                        jSONObjectLIZJ.put(key, value);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1AF0.LJ(th2);
            }
        }
        C1709640uag c1709640uag3 = this.LLILLJJLI;
        if (c1709640uag3 != null && (str4 = c1709640uag3.LIZ.payRequestId) != null) {
            str5 = str4;
        }
        C1708320uYY c1708320uYY = new C1708320uYY(c1709570uaZ, jSONObjectLIZJ, paymentOption, str5, "ccdc_card_info", list, 416);
        C19EG c19eg = this.LL;
        if (c19eg != null) {
            FQ2(true);
            C1708220uYO c1708220uYO = (C1708220uYO) this.LLJILJIL.getValue();
            InterfaceC1708270uYT interfaceC1708270uYT = new InterfaceC1708270uYT() { // from class: X.0uYy
                public boolean LL;
                public boolean LLILLJJLI;

                @Override // X.InterfaceC1708270uYT
                public final void LIZLLL() {
                    InterfaceC1708270uYT interfaceC1708270uYT2;
                    this.LLILLJJLI = true;
                    C1709640uag c1709640uag4 = this.LLILLL.LLILLJJLI;
                    if (c1709640uag4 == null || (interfaceC1708270uYT2 = c1709640uag4.LJ) == null) {
                        return;
                    }
                    interfaceC1708270uYT2.LIZLLL();
                }

                @Override // X.InterfaceC1708270uYT
                public final void LIZIZ() {
                    C1708710uZB.LIZ("Cashier").LIZ(4, "on3dsComplete");
                    this.LLILLL.setStateImmediate(AFwS268S0000000_26.get$arr$(400));
                }

                @Override // X.InterfaceC1708270uYT
                public final void LIZJ() {
                    this.LLILLL.FQ2(false);
                }

                @Override // X.InterfaceC1708270uYT
                public final boolean getNotified() {
                    return this.LL;
                }

                @Override // X.InterfaceC1708270uYT
                public final void setNotified(boolean z) {
                    this.LL = z;
                }

                @Override // X.InterfaceC1708270uYT
                public final void LIZ(int i, String str9) {
                    InterfaceC1708270uYT interfaceC1708270uYT2;
                    C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("add card page bind result: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", ");
                    sbLIZ.append(str9);
                    c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
                    this.LLILLL.FQ2(false);
                    if (!this.LLILLJJLI && i == 1) {
                        this.LLILLL.HQ2(str9);
                        return;
                    }
                    if (i == 3) {
                        this.LLILLL.setStateImmediate(AFwS268S0000000_26.get$arr$(401));
                        return;
                    }
                    C1709640uag c1709640uag4 = this.LLILLL.LLILLJJLI;
                    if (c1709640uag4 == null || (interfaceC1708270uYT2 = c1709640uag4.LJ) == null) {
                        return;
                    }
                    interfaceC1708270uYT2.LIZ(i, str9);
                }
            };
            C1709640uag c1709640uag4 = this.LLILLJJLI;
            if (c1709640uag4 == null || (c1708990uZd = c1709640uag4.LIZ.LIZJ) == null) {
                c1708990uZd = C1709000uZe.LIZ;
            }
            c1708220uYO.LIZJ(c19eg, str2, c1708320uYY, interfaceC1708270uYT, c1708990uZd);
        }
    }

    public final boolean KQ2(List list, boolean z, boolean z2) {
        Object next;
        String str;
        Object next2;
        String str2;
        Element elementLJII;
        String str3;
        String str4;
        Boolean bool;
        Object next3;
        String str5;
        Element elementLJII2;
        if (!PipoCashierElementVerifierSettings.LIZ().mainSwitch) {
            C1708710uZB.LIZ("Cashier").LIZ(4, "verify succ due to switch off");
            return true;
        }
        if (this.LLILZIL == null) {
            C1708710uZB.LIZ("Cashier").LIZ(4, "verify fail due to no recognized po");
            return false;
        }
        boolean z3 = false;
        C1159290gH1 state = getState();
        ArrayList<EnumC1710490uc3> arrayList = new ArrayList();
        List<InterfaceC1891350zJl> list2 = state.LLILLJJLI;
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : list2) {
            if (interfaceC1891350zJl instanceof AbstractC1710370ubr) {
                arrayList2.add(interfaceC1891350zJl);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            EnumC1710490uc3 enumC1710490uc3LIZIZ = ((AbstractC1710370ubr) it2.next()).LIZIZ();
            PaymentOption paymentOption = this.LLILZIL;
            if (paymentOption != null && (elementLJII2 = paymentOption.LJII(enumC1710490uc3LIZIZ, EnumC995340c0a.ELEMENT)) != null) {
                if (!list.contains(enumC1710490uc3LIZIZ)) {
                    arrayList.add(enumC1710490uc3LIZIZ);
                    List<Element> list3 = elementLJII2.subElementList;
                    if (list3 != null && !list3.isEmpty()) {
                        Iterator<Element> it3 = elementLJII2.subElementList.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(it3.next().LIZ());
                        }
                    }
                }
            } else {
                z3 = true;
            }
        }
        Iterator it4 = ((ArrayList) this.LLILZ).iterator();
        while (true) {
            if (it4.hasNext()) {
                next = it4.next();
                if (((POPayElement) next).LIZ() == EnumC1710490uc3.EXPIRATION_DATE_MONTH) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        POPayElement pOPayElement = (POPayElement) next;
        if (pOPayElement == null || (str = pOPayElement.paramValue) == null) {
            str = "";
        }
        Iterator it5 = ((ArrayList) this.LLILZ).iterator();
        while (true) {
            if (it5.hasNext()) {
                next2 = it5.next();
                if (((POPayElement) next2).LIZ() == EnumC1710490uc3.EXPIRATION_DATE_YEAR) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        POPayElement pOPayElement2 = (POPayElement) next2;
        if (pOPayElement2 == null || (str2 = pOPayElement2.paramValue) == null) {
            str2 = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('/');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        PaymentOption paymentOption2 = this.LLILZIL;
        if (paymentOption2 != null) {
            elementLJII = paymentOption2.LJII(EnumC1710490uc3.EXPIRATION_DATE, EnumC995340c0a.ELEMENT);
        } else {
            elementLJII = null;
        }
        List<POPayElement> list4 = this.LLILZ;
        if (elementLJII != null) {
            str3 = elementLJII.id;
            str4 = elementLJII.paramName;
            bool = elementLJII.needEncrypted;
        } else {
            str3 = null;
            str4 = null;
            bool = null;
        }
        List listLJLILLLLZI = C13LP.LJLILLLLZI(new POPayElement(str3, str4, strLIZIZ, bool), list4);
        for (EnumC1710490uc3 enumC1710490uc3 : arrayList) {
            Iterator it6 = ((ArrayList) listLJLILLLLZI).iterator();
            while (true) {
                if (it6.hasNext()) {
                    next3 = it6.next();
                    if (((POPayElement) next3).LIZ() == enumC1710490uc3) {
                        break;
                    }
                } else {
                    next3 = null;
                    break;
                }
            }
            POPayElement pOPayElement3 = (POPayElement) next3;
            if (pOPayElement3 == null || (str5 = pOPayElement3.paramValue) == null) {
                str5 = "";
            }
            if (!z2 || str5.length() != 0) {
                C1710390ubt c1710390ubt = this.LLILLL;
                if (c1710390ubt != null) {
                    C1710830ucb c1710830ucbLIZJ = c1710390ubt.LIZJ(enumC1710490uc3, this.LLILZIL, str5, EnumC1710440uby.SUBMIT, null);
                    if (c1710830ucbLIZJ != null) {
                        if (z) {
                            Object obj = ((LinkedHashMap) this.LLJILJILJ).get(enumC1710490uc3);
                            if (obj == null) {
                                obj = null;
                            }
                            Function1 function1 = (Function1) obj;
                            if (function1 != null) {
                                function1.invoke(c1710830ucbLIZJ);
                            }
                        }
                        z3 = true;
                    }
                }
            }
        }
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("verify result: ");
        sbLIZ2.append(z3);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ2));
        return !z3;
    }
}
