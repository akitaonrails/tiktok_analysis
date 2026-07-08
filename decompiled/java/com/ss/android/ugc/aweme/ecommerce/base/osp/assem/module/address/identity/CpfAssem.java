package com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity;

import X.C019F;
import X.C01GW;
import X.C049X;
import X.C0OM1;
import X.C1020503yt;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1748440vbG;
import X.C1748720vbi;
import X.C1749190vcT;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C452501pT;
import X.C703302op;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C883103cj;
import X.EnumC1749210vcV;
import X.InterfaceC2217461Bqa;
import X.ViewOnFocusChangeListenerC1775860wJU;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import com.zhiliaoapp.musically.R;
import g1c.AjS22S0300000_26;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes27.dex */
public final class CpfAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final C01GW LLJI;
    public C1748440vbG LLJIJIL;
    public IdentityInfoOption LLJILJIL;
    public long LLJILJILJ;
    public final C01GW LLJILLL;
    public String LLJJ;
    public Boolean LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CpfAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/assem/module/address/identity/CpfViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CpfAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CpfViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 166), AFwS268S0000000_26.get$arr$(191), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C883103cj.class, null), checkSupervisorPrepared());
        this.LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 276));
        this.LLJILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 165));
    }

    public final HashMap<String, Object> Jo() {
        Pair[] pairArr = new Pair[5];
        Boolean bool = this.LLJJI;
        pairArr[0] = new Pair("is_delivery_info_complete", bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null);
        pairArr[1] = new Pair("trigger_event", this.LLJJ);
        pairArr[2] = new Pair("fill_type", Go().fillType);
        IdentityInfoOption identityInfoOption = this.LLJILJIL;
        Integer type = identityInfoOption != null ? identityInfoOption.getType() : null;
        pairArr[3] = new Pair("input_box_name", (type == null || type.intValue() != 3) ? "" : "cpf_info");
        pairArr[4] = new Pair("page_name", "add_your_cpf");
        return C2097608Jq.LJI(pairArr);
    }

    public final CpfEnterParams Go() {
        return (CpfEnterParams) this.LLJI.getValue();
    }

    public final CpfEditFragment Ho() {
        LifecycleOwner parent = getParent();
        if (parent instanceof CpfEditFragment) {
            return (CpfEditFragment) parent;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        IdentityInfoOption identityInfoOption;
        String hint;
        String value;
        int iIntValue;
        Integer numLIZJ;
        super.onViewCreated(view);
        IdentityInfoPanel identityInfoPanel = Go().identityInfoPanel;
        this.LLJJ = Go().triggerEvent;
        this.LLJJI = Go().hasAddress;
        List<IdentityInfoOption> identityInfoOptions = identityInfoPanel.getIdentityInfoOptions();
        String value2 = null;
        if (identityInfoOptions != null) {
            identityInfoOption = (IdentityInfoOption) C13LP.LJJJLL(identityInfoOptions);
        } else {
            identityInfoOption = null;
        }
        this.LLJILJIL = identityInfoOption;
        CpfEditFragment cpfEditFragmentHo = Ho();
        if (cpfEditFragmentHo != null) {
            cpfEditFragmentHo.LLILZLL = new AwS605S0100000_26(this, 32);
        }
        TuxNavBar tuxNavBar = (TuxNavBar) LJJIJL().findViewById(R.id.cij);
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            String title = identityInfoPanel.getTitle();
            if (title == null) {
                title = "Add CPF";
            }
            c1250250idj.LIZJ = title;
            c0om1.LIZJ = c1250250idj;
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS427S0200000_26(tuxNavBar, this, 3));
            c0om1.LIZIZ(c1251150ifB);
            tuxNavBar.setNavActions(c0om1);
            View viewFindViewById = tuxNavBar.findViewById(R.id.p1z);
            if (viewFindViewById != null) {
                Context context = tuxNavBar.getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                viewFindViewById.setBackgroundColor(iIntValue);
            }
            C1748720vbi.LIZLLL(tuxNavBar, new C049X(), new AwS605S0100000_26(this, 34));
        }
        Context context2 = getContext();
        if (context2 != null) {
            final C1749190vcT c1749190vcT = (C1749190vcT) LJJIJL().findViewById(R.id.cih);
            final C1748440vbG c1748440vbG = new C1748440vbG(context2, null, 6);
            C786410Ut5.L6(c1748440vbG, new LinearLayout.LayoutParams(-1, -2));
            c1748440vbG.LJIILLIIL(true);
            c1748440vbG.setSizeVariant(0);
            IdentityInfoOption identityInfoOption2 = this.LLJILJIL;
            if (identityInfoOption2 != null) {
                value2 = identityInfoOption2.getValue();
            }
            String str = "";
            if (C703302op.LIZ(value2)) {
                IdentityInfoOption identityInfoOption3 = this.LLJILJIL;
                if (identityInfoOption3 != null && (value = identityInfoOption3.getValue()) != null) {
                    str = value;
                }
                c1748440vbG.LLJLILLLLZIIL.setText(C1020503yt.LIZ(str));
            } else {
                IdentityInfoOption identityInfoOption4 = this.LLJILJIL;
                if (identityInfoOption4 != null && (hint = identityInfoOption4.getHint()) != null) {
                    str = hint;
                }
                c1748440vbG.setPlaceholderText(str);
            }
            c1748440vbG.setEditTextInputType(2);
            c1748440vbG.LIZ(new TextWatcher() { // from class: X.0vcD
                public boolean LL;

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    boolean z;
                    CpfAssem cpfAssem;
                    C1748440vbG c1748440vbG2;
                    String hint2;
                    C1749190vcT c1749190vcT2 = c1749190vcT;
                    if (c1749190vcT2 != null) {
                        c1749190vcT2.LJFF(false);
                    }
                    C1748440vbG c1748440vbG3 = this.LLJIJIL;
                    if (c1748440vbG3 != null) {
                        c1748440vbG3.setValidationStatus(0);
                    }
                    if (editable != null && editable.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    String strLIZIZ = "";
                    if (z && (c1748440vbG2 = (cpfAssem = this).LLJIJIL) != null) {
                        IdentityInfoOption identityInfoOption5 = cpfAssem.LLJILJIL;
                        if (identityInfoOption5 == null || (hint2 = identityInfoOption5.getHint()) == null) {
                            hint2 = "";
                        }
                        c1748440vbG2.setPlaceholderText(hint2);
                    }
                    if (this.LL) {
                        this.LL = false;
                        return;
                    }
                    CpfAssem cpfAssem2 = this;
                    String strValueOf = String.valueOf(editable);
                    cpfAssem2.getClass();
                    String strReplace = new Regex("[-]").replace(new Regex("[.]").replace(strValueOf, ""), "");
                    int i = 0;
                    for (char c : "###.###.###-##".toCharArray()) {
                        if (c != '#' && strReplace.length() > i) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZIZ);
                            sbLIZ.append(c);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            try {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(strLIZIZ);
                                sbLIZ2.append(strReplace.charAt(i));
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                i++;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                    this.LL = true;
                    C1748440vbG.LJIILL(c1748440vbG, strLIZIZ);
                    c1748440vbG.setSelection(strLIZIZ.length());
                }
            });
            c1748440vbG.setEditTextOnFocusChangeListener(new ViewOnFocusChangeListenerC1775860wJU(this, 2));
            this.LLJIJIL = c1748440vbG;
            if (c1749190vcT != null) {
                C1749190vcT.LJIIIZ(c1749190vcT.LLILLL, identityInfoPanel.getDescription());
                c1749190vcT.setFormField(this.LLJIJIL);
                c1749190vcT.LIZIZ(EnumC1749210vcV.NONE);
                C1748720vbi.LIZLLL(c1749190vcT, new C049X(), new AwS605S0100000_26(this, 31));
            }
        }
        TextView textView = (TextView) LJJIJL().findViewById(R.id.cii);
        C1749190vcT c1749190vcT2 = (C1749190vcT) LJJIJL().findViewById(R.id.cih);
        String taxSubmitButton = Go().identityInfoPanel.getTaxSubmitButton();
        if (taxSubmitButton != null) {
            if (textView != null) {
                textView.setText(taxSubmitButton);
                C786410Ut5.I7(new AjS22S0300000_26(this, c1749190vcT2, identityInfoPanel, 0), textView);
                C1748720vbi.LIZLLL(textView, new C049X(), new AwS605S0100000_26(this, 28));
            }
        } else if (textView != null) {
            C786410Ut5.I7(new AjS22S0300000_26(this, c1749190vcT2, identityInfoPanel, 0), textView);
            C1748720vbi.LIZLLL(textView, new C049X(), new AwS605S0100000_26(this, 28));
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0vcH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2001107sf) obj).LL;
            }
        }, null, new AwS616S0100000_2(this, 10), 6);
    }
}
