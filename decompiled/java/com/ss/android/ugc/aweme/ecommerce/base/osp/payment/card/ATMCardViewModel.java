package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card;

import X.C01GW;
import X.C0265007b;
import X.C03HA;
import X.C03S8;
import X.C098200Yq;
import X.C0BA8;
import X.C0WZX;
import X.C123100dR;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C189200o6;
import X.C1AF0;
import X.C2204961BRm;
import X.C452501pT;
import X.C7911037d;
import X.C866903a7;
import X.C869503aX;
import X.C869603aY;
import X.C890103dr;
import X.C895103ef;
import X.C895203eg;
import X.C895303eh;
import X.C895403ei;
import X.C896103ep;
import X.C903703g3;
import X.C903803g4;
import X.C904203g8;
import X.EnumC884003cs;
import X.EnumC903503g1;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import X.InterfaceC896803ew;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankCardRule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SaveDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SaveSecurityBlock;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ATMCardViewModel extends AssemViewModel<C896103ep> {
    public EnterParams LL;
    public String LLILLJJLI;
    public PaymentMethod LLILLL;
    public boolean LLILZ;
    public Function1<? super EnumC884003cs, Unit> LLIZ;
    public boolean LLIZLLLIL;
    public String LLILZIL = "";
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(68));
    public final Map<String, List<PaymentElement>> LLJ = new LinkedHashMap();

    public final void BQ2() {
        C890103dr.LJFF(C890103dr.LIZ, "card_number_ocr", null, null, null, null, null, null, 126);
        C904203g8 c904203g8YQ2 = yQ2();
        c904203g8YQ2.LJ = new AwS615S0100000_1(this, 42);
        c904203g8YQ2.LJFF = new AwS615S0100000_1(this, 43);
        C904203g8.LIZLLL(c904203g8YQ2, null, 7);
        for (String str : C890103dr.LIZJ(this.LLILLL)) {
            C890103dr.LIZ.getClass();
            C890103dr.LJIIIIZZ(str);
        }
        for (String str2 : C890103dr.LIZJ(this.LLILLL)) {
            C890103dr.LIZ.getClass();
            C890103dr.LJIJJ(str2);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C896103ep(0);
    }

    public final C904203g8 yQ2() {
        return (C904203g8) this.LLILZLL.getValue();
    }

    public final void AQ2(List<? extends InterfaceC1891350zJl> list) {
        ArrayList arrayList = new ArrayList(list);
        if (((Number) C0BA8.LIZ.getValue()).intValue() != 0) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof InterfaceC896803ew) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            if (!it2.hasNext()) {
                InterfaceC896803ew interfaceC896803ew = (InterfaceC896803ew) C13LP.LJJLIIIJL(arrayList2);
                if (interfaceC896803ew != null) {
                    interfaceC896803ew.LJJLIIIJJIZ();
                }
            } else {
                ((InterfaceC896803ew) it2.next()).LJJLIIIJJIZ();
                throw null;
            }
        }
        setState(new AwS580S0100000_1(arrayList, (List<InterfaceC746802vq>) 137));
    }

    public final List<PaymentElement> zQ2(String str) {
        List<PaymentElement> list = (List) ((LinkedHashMap) this.LLJ).get(str);
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    public static InterfaceC1891350zJl vQ2(ElementDTO elementDTO, PaymentMethod paymentMethod) {
        Integer num = elementDTO.styleType;
        int iOrdinal = EnumC903503g1.Normal.ordinal();
        if (num != null && num.intValue() == iOrdinal) {
            return new C895103ef(paymentMethod, new C869603aY(elementDTO, paymentMethod, null), "", new Object(), 6);
        }
        int iOrdinal2 = EnumC903503g1.CardNumber.ordinal();
        if (num != null && num.intValue() == iOrdinal2) {
            return new C895303eh(paymentMethod, new C866903a7(elementDTO, paymentMethod, null, null), new Object());
        }
        int iOrdinal3 = EnumC903503g1.Date.ordinal();
        if (num == null || num.intValue() != iOrdinal3) {
            int iOrdinal4 = EnumC903503g1.ISSUE_DATE.ordinal();
            if (num == null || num.intValue() != iOrdinal4) {
                return null;
            }
        }
        return new C895203eg(paymentMethod, new C869503aX(elementDTO, paymentMethod, null), new Object());
    }

    public static String xQ2(ATMCardViewModel aTMCardViewModel, int i) {
        if (i > 0) {
            return "add";
        }
        if (i < 0) {
            return "del";
        }
        if (!Intrinsics.LJFF("", "auto")) {
            return "";
        }
        return "auto";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public static List wQ2(PaymentMethod paymentMethod, List list, SaveDisplayInfo saveDisplayInfo) {
        PaymentMethod paymentMethod2;
        ?? arrayList;
        List<PaymentMethod> list2;
        SaveSecurityBlock saveSecurityBlock;
        ECRichText eCRichText;
        Image icon;
        String str;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(list);
        List<PaymentMethod> list3 = paymentMethod.subPaymentMethods;
        if (list3 != null && !list3.isEmpty()) {
            paymentMethod2 = paymentMethod;
        } else {
            paymentMethod2 = C03S8.LIZIZ.get("pm_pi_atmcard_all");
        }
        ExceptionUX exceptionUX = paymentMethod.exceptionUX;
        if (paymentMethod2 != null && (str = paymentMethod2.saveDisplayText) != null) {
            arrayList2.add(new C895403ei(str, exceptionUX, saveDisplayInfo));
        }
        List<SaveSecurityBlock> list4 = paymentMethod.saveSecurityInfo;
        String uri = null;
        if (list4 != null && (saveSecurityBlock = (SaveSecurityBlock) C13LP.LJJJLZIJ(0, list4)) != null && (eCRichText = saveSecurityBlock.content) != null) {
            String strLIZ = C7911037d.LIZ(eCRichText);
            Icon icon2 = saveSecurityBlock.icon;
            if (icon2 != null && (icon = icon2.getIcon()) != null) {
                uri = icon.getUri();
            }
            arrayList2.add(new C03HA(strLIZ, uri));
        }
        if (paymentMethod2 != null && (list2 = paymentMethod2.subPaymentMethods) != null) {
            arrayList = new ArrayList();
            Iterator<PaymentMethod> it2 = list2.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().iconUrl;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        arrayList2.add(new C0265007b(arrayList));
        return arrayList2;
    }

    public final void CQ2(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, RecyclerView recyclerView, View view) {
        String str;
        View viewFocusSearch;
        Editable editableLLJILLL;
        Editable editableLLJILLL2;
        String str2;
        int[] iArr;
        int iLJ;
        int[] iArr2;
        try {
            if (((Number) C0BA8.LIZ.getValue()).intValue() != 2 || view == null) {
                return;
            }
            String strLJIIJJI = C03S8.LJIIJJI(elementDTO.id);
            Boolean boolValueOf = null;
            if (!Intrinsics.LJFF(strLJIIJJI, "date")) {
                if (Intrinsics.LJFF(strLJIIJJI, "card_number")) {
                    PaymentElement paymentElement = list.get(0);
                    if (paymentElement != null) {
                        str2 = paymentElement.paramValue;
                    } else {
                        str2 = null;
                    }
                    String strValueOf = String.valueOf(str2);
                    C903803g4.LIZ.getClass();
                    BankCardRule bankCardRuleLIZ = C903803g4.LIZIZ.LIZ(strValueOf);
                    if (bankCardRuleLIZ == null || (iArr2 = bankCardRuleLIZ.cardBrandLength) == null || iArr2.length != 1) {
                        int length = strValueOf.length();
                        if (bankCardRuleLIZ != null && (iArr = bankCardRuleLIZ.cardBrandLength) != null && C13LQ.LJJIJ(length, iArr) >= 0) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                                iLJ = SettingsManager.LJ("ecom_ccdc_auto_focus_limit", 0);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1AF0.LJ(e);
                                iLJ = 0;
                            }
                            if (length < iLJ) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            if ((!(view instanceof EditText) || ((editableLLJILLL = C2204961BRm.LLJILLL((EditText) view, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Zl5N7id2781T9AmoExjeO+hYB/vtA==", null))) != null && editableLLJILLL.length() != 0 && (editableLLJILLL2 = C2204961BRm.LLJILLL((EditText) view, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Zl5N7id2781T9AmoExjeO+hYB/vtA==", null))) != null && ((EditText) view).getSelectionEnd() == editableLLJILLL2.length())) && (str = elementDTO.id) != null && str.length() != 0) {
                C903803g4.LIZ.getClass();
                C903703g3 c903703g3 = C903803g4.LIZIZ;
                String str3 = elementDTO.id;
                if (str3 == null) {
                    str3 = "";
                }
                if (C123100dR.LIZ(c903703g3.LIZLLL(str3, list))) {
                    return;
                }
                if (recyclerView != null && (viewFocusSearch = recyclerView.focusSearch(view, 2)) != null) {
                    boolValueOf = Boolean.valueOf(viewFocusSearch.requestFocus());
                }
                C189200o6.m2constructorimpl(boolValueOf);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
