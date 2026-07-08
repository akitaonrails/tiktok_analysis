package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc;

import X.AbstractC738140SxQ;
import X.C09RB;
import X.C1077704Jj;
import X.C13LE;
import X.C13LQ;
import X.C1559260qg8;
import X.C1748440vbG;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C679280Qkg;
import X.C703302op;
import X.C723590SZx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C887403dQ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS136S0100000_1;
import Y.ACListenerS77S1100000_1;
import Y.ARunnableS101S0100000_1;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankCardRule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCFillCVVAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public C1748440vbG LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public C197039127h LLJIJIL;
    public ScrollView LLJILJIL;
    public TuxNavBar LLJILJILJ;
    public final C1559260qg8 LLJILLL = new C1559260qg8(new C723590SZx(this, C887403dQ.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJ;
    public boolean LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CCDCFillCVVAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/CCDCFillCVVViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C197039127h Go() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ckq) : null;
            this.LLJIJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1748440vbG Ho() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.dkh) : null;
            this.LLIZLLLIL = (C1748440vbG) viewFindViewById;
        }
        return (C1748440vbG) viewFindViewById;
    }

    public final CCDCFillCVVViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (CCDCFillCVVViewModel) assemVMLazy.getValue();
    }

    public final ElementDTO No() {
        List<ElementDTO> list;
        PaymentMethod paymentMethod = ((C887403dQ) this.LLJILLL.getValue()).LL;
        ElementDTO elementDTO = null;
        if (paymentMethod == null || (list = paymentMethod.popupNeededElements) == null) {
            return null;
        }
        Iterator<ElementDTO> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ElementDTO next = it2.next();
            if (Intrinsics.LJFF(next.id, "eg_ccdc_global_cvv")) {
                elementDTO = next;
                break;
            }
        }
        return elementDTO;
    }

    public CCDCFillCVVAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCFillCVVViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1047);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(194);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS545S0100000_1, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((AbstractC738140SxQ) this, 1048), aFwS228S0000000_1, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJ = assemVMLazy;
        this.LLJJI = true;
    }

    public final CCDCFillCVVHalfFragment Jo() {
        LifecycleOwner parent = getParent();
        if (parent instanceof CCDCFillCVVHalfFragment) {
            return (CCDCFillCVVHalfFragment) parent;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("payment_bindcard_3ds_result", Lo());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("payment_bindcard_3ds_result", Lo());
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        Window window;
        super.onResume();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        HandlerHook.viewPostDelay(Ho(), new ARunnableS101S0100000_1(this, 52), 300L);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String str2;
        String value;
        String strLJJIFFI;
        List<BankCardRule> listLJIIIIZZ;
        final String str3;
        final BankCardRule bankCardRule;
        String str4;
        int[] iArr;
        InputFilter[] inputFilterArr;
        BankCardRule next;
        PaymentMethodsData paymentMethodsData;
        String str5;
        super.onViewCreated(view);
        Lo().LL = (C887403dQ) this.LLJILLL.getValue();
        View viewFindViewById = this.LLJ;
        String str6 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.dkk);
            } else {
                viewFindViewById = null;
            }
            this.LLJ = (TuxTextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        ElementDTO elementDTONo = No();
        if (elementDTONo != null) {
            str = elementDTONo.displayName;
        } else {
            str = null;
        }
        textView.setText(str);
        Regex regex = new Regex("\\d{4}");
        PaymentMethod paymentMethod = ((C887403dQ) this.LLJILLL.getValue()).LL;
        String str7 = "";
        if (paymentMethod == null || (str2 = paymentMethod.displayName) == null) {
            str2 = "";
        }
        MatchResult matchResultFind$default = Regex.find$default(regex, str2, 0, 2, null);
        if (matchResultFind$default != null) {
            value = matchResultFind$default.getValue();
        } else {
            value = null;
        }
        View viewFindViewById2 = this.LLJI;
        if (viewFindViewById2 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById2 = viewLJJIJL2.findViewById(R.id.dkj);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJI = (TuxTextView) viewFindViewById2;
        }
        TextView textView2 = (TextView) viewFindViewById2;
        ElementDTO elementDTONo2 = No();
        if (elementDTONo2 != null && (str5 = elementDTONo2.description) != null) {
            if (value != null) {
                str7 = value;
            }
            strLJJIFFI = u.LJJIFFI(str5, "{{card_ending}}", str7, false);
        } else {
            strLJJIFFI = null;
        }
        textView2.setText(strLJJIFFI);
        EnterParams enterParams = ((C887403dQ) this.LLJILLL.getValue()).LLILLJJLI;
        if (enterParams != null && (paymentMethodsData = enterParams.paymentData) != null) {
            listLJIIIIZZ = paymentMethodsData.LJIIIIZZ();
        } else {
            listLJIIIIZZ = null;
        }
        PaymentMethod paymentMethod2 = ((C887403dQ) this.LLJILLL.getValue()).LL;
        if (paymentMethod2 != null) {
            str3 = paymentMethod2.id;
        } else {
            str3 = null;
        }
        if (listLJIIIIZZ != null) {
            Iterator<BankCardRule> it2 = listLJIIIIZZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.paymentMethodId, str3)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            bankCardRule = next;
        } else {
            bankCardRule = null;
        }
        C1748440vbG c1748440vbGHo = Ho();
        c1748440vbGHo.LJIILIIL(2, true);
        if (bankCardRule != null && (iArr = bankCardRule.cvvLength) != null && iArr.length != 0) {
            C1748440vbG c1748440vbGHo2 = Ho();
            int iLJJJJLI = C13LQ.LJJJJLI(iArr);
            if (c1748440vbGHo2 != null && iLJJJJLI >= 0) {
                if (c1748440vbGHo2.getEditTextFilters().length == 0) {
                    inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(iLJJJJLI)};
                } else {
                    inputFilterArr = (InputFilter[]) C09RB.LJJII(C09RB.LJIJJLI(C09RB.LJIIIZ(C13LQ.LJIIJJI(c1748440vbGHo2.getEditTextFilters()), AFwS228S0000000_1.get$arr$(522)), new InputFilter.LengthFilter(iLJJJJLI))).toArray(new InputFilter[0]);
                }
                c1748440vbGHo2.setEditTextFilters(inputFilterArr);
            }
        }
        ElementDTO elementDTONo3 = No();
        if (elementDTONo3 != null) {
            str6 = elementDTONo3.placeholderDisplayName;
        }
        c1748440vbGHo.setPlaceholderText(str6);
        ElementDTO elementDTONo4 = No();
        if (elementDTONo4 != null && (str4 = elementDTONo4.notificationUrl) != null && C703302op.LIZ(str4)) {
            TuxIconView tuxIconView = new TuxIconView(c1748440vbGHo.getContext(), null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C679280Qkg.LIZ(20), C679280Qkg.LIZ(20));
            layoutParams.gravity = 17;
            C786410Ut5.M6(tuxIconView, layoutParams);
            tuxIconView.setIconRes(R.raw.icon_info_circle);
            tuxIconView.setTintColorRes(R.attr.a1p);
            C786410Ut5.a9(tuxIconView, new ACListenerS77S1100000_1(tuxIconView, str4, 1));
            c1748440vbGHo.LJFF(tuxIconView);
        }
        Ho().LIZ(new TextWatcher() { // from class: X.03gT
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String string;
                String str8;
                String string2;
                Editable text = this.LL.Ho().getText();
                if (text == null || (string2 = text.toString()) == null || (string = a0.LJLIIIL(string2).toString()) == null) {
                    string = "";
                }
                boolean z = true;
                if (bankCardRule == null) {
                    C197039127h c197039127hGo = this.LL.Go();
                    if (string.length() <= 0) {
                        z = false;
                    }
                    c197039127hGo.setEnabled(z);
                    return;
                }
                C931003kS c931003kS = C932203ke.LIZ;
                String str9 = str3;
                ElementDTO elementDTONo5 = this.LL.No();
                if (elementDTONo5 != null) {
                    str8 = elementDTONo5.id;
                } else {
                    str8 = null;
                }
                if (!c931003kS.LJI(Boolean.valueOf(C03S8.LIZJ(str3)), str9, str8, string).LIZ) {
                    this.LL.Go().setEnabled(false);
                } else {
                    this.LL.Go().setEnabled(true);
                }
            }
        });
        C786410Ut5.U8(Go(), new ACListenerS136S0100000_1(this, 4));
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.03e6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C891503e5) obj).LLILZ);
            }
        }, null, new AwS615S0100000_1(this, 170), 6);
        CCDCFillCVVViewModel cCDCFillCVVViewModelLo = Lo();
        selectSubscribe(cCDCFillCVVViewModelLo, new C2217381BqS() { // from class: X.03eJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C891503e5) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.03jU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C891503e5) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.03eT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C891503e5) obj).LLILLL;
            }
        }, C736820SvI.LIZIZ(cCDCFillCVVViewModelLo.usedInReusedScene), null, new C1077704Jj(this, 10));
    }
}
