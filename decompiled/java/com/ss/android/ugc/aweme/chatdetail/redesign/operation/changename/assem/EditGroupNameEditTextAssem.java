package com.ss.android.ugc.aweme.chatdetail.redesign.operation.changename.assem;

import X.C019F;
import X.C01GW;
import X.C0I7D;
import X.C0Y8T;
import X.C0Z6T;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C458940HzA;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C910030Zmz;
import X.C913980ZtM;
import X.EnumC910040Zn0;
import X.InterfaceC2217461Bqa;
import X.ViewOnLayoutChangeListenerC913850Zt9;
import Y.ACListenerS149S0100000_14;
import Y.ARunnableS102S0100000_2;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.changename.viewmodel.EditGroupNameViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class EditGroupNameEditTextAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C910030Zmz.class, null), checkSupervisorPrepared());
    public final C01GW LLJ = C1509305vX.LIZ(new AwS558S0100000_14(this, 110));
    public final C01GW LLJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 107));
    public final C01GW LLJIJIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 109));
    public final C01GW LLJILJIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 108));
    public final C01GW LLJILJILJ = C1509305vX.LIZ(new AwS558S0100000_14(this, 112));
    public final C01GW LLJILLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 111));
    public final AssemVMLazy LLJJ;
    public boolean LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditGroupNameEditTextAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/operation/changename/viewmodel/EditGroupNameViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EditGroupNameEditTextAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditGroupNameViewModel.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 113), AFwS248S0000000_14.get$arr$(30), null, true);
    }

    public final C0I7D Go() {
        return (C0I7D) this.LLJ.getValue();
    }

    public final EditGroupNameViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (EditGroupNameViewModel) assemVMLazy.getValue();
    }

    public final void Jo(int i) {
        this.LLJJI = true;
        C786410Ut5.LJLLLLLL(0, (View) this.LLJILJILJ.getValue());
        TextView textView = (TextView) this.LLJILLL.getValue();
        C786410Ut5.LJLLLLLL(0, textView);
        textView.setText(textView.getContext().getString(i));
        ((TuxTextView) this.LLJIJIL.getValue()).setTextColorRes(R.attr.zs);
        C0I7D c0i7dGo = Go();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.zs);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bs);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c0i7dGo.setBackground(c384050F3z.LIZ(Go().getContext()));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean zLJII;
        String strLJIIJ;
        Pair pair;
        super.onViewCreated(view);
        final C0I7D c0i7dGo = Go();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bs);
        int i = 8;
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c0i7dGo.setBackground(c384050F3z.LIZ(c0i7dGo.getContext()));
        EditGroupNameViewModel editGroupNameViewModelHo = Ho();
        String str = (String) editGroupNameViewModelHo.LLILZ.getValue();
        if (str != null) {
            zLJII = ((C0Z6T) editGroupNameViewModelHo.LLILZLL.getValue()).LJII(str);
        } else {
            zLJII = false;
        }
        C0Z6T c0z6t = (C0Z6T) editGroupNameViewModelHo.LLILZLL.getValue();
        String str2 = null;
        if (c0z6t != null) {
            strLJIIJ = c0z6t.LJIIJ((C0Y8T) editGroupNameViewModelHo.LLILLL.getValue());
        } else {
            strLJIIJ = null;
        }
        if (strLJIIJ == null) {
            strLJIIJ = "";
        }
        if (zLJII) {
            pair = new Pair("", strLJIIJ);
        } else {
            pair = new Pair(strLJIIJ, "");
        }
        String str3 = (String) pair.getFirst();
        String str4 = (String) pair.getSecond();
        int length = str4.length();
        c0i7dGo.setHint(str3);
        c0i7dGo.setText(str4);
        c0i7dGo.setSelection(str4.length());
        View view2 = (View) this.LLJI.getValue();
        if (str4.length() > 0) {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, view2);
        ((TextView) this.LLJIJIL.getValue()).setText(C786410Ut5.k4(Locale.US, c0i7dGo.getContext().getString(2131835242), Arrays.copyOf(new Object[]{Integer.valueOf(length), 30}, 2)));
        c0i7dGo.setFilters(new C458940HzA[]{new C458940HzA(c0i7dGo, 30, new AwS558S0100000_14(this, 1668))});
        c0i7dGo.addTextChangedListener(new C913980ZtM(c0i7dGo, this, 1));
        HandlerHook.viewPost(c0i7dGo, new ARunnableS102S0100000_2(c0i7dGo, 52));
        c0i7dGo.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0Zo9
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                Editable editableLLLLJI;
                if (i2 != 6 || (editableLLLLJI = C2204961BRm.LLLLJI(c0i7dGo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYovK2SZ1Ov9PAxMHavLl9kHqobEjZzz40u9kbYvvLYJnxx0WmQKURYMy/dVkkcE8jRE7F3Rd/O2WXKAoymH5/d/qi664rm8=", null))) == null || editableLLLLJI.length() == 0) {
                    return false;
                }
                EditGroupNameViewModel editGroupNameViewModelHo2 = this.Ho();
                String strValueOf = String.valueOf(C2204961BRm.LLLLJI(c0i7dGo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYovK2SZ1Ov9PAxMHavLl9kHqobEjZzz40u9kbYvvLYJnxx0WmQKURYMy/dVkkcE8jRE7F3Rd/O2WXKAoymH5/d/qi664rm8=", null)));
                editGroupNameViewModelHo2.setState(AFwS248S0000000_14.get$arr$(562));
                AbstractC879060Ye8 abstractC879060Ye8 = (AbstractC879060Ye8) editGroupNameViewModelHo2.LLILLJJLI.getValue();
                if (abstractC879060Ye8 != null) {
                    abstractC879060Ye8.LJIJ(strValueOf, new C914150Ztd(editGroupNameViewModelHo2, 20));
                }
                return true;
            }
        });
        C786410Ut5.a9((TuxIconView) this.LLJI.getValue(), new ACListenerS149S0100000_14(this, 90));
        C786410Ut5.U8((C197039127h) this.LLJILJIL.getValue(), new ACListenerS149S0100000_14(this, 91));
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0ZoA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C910770ZoB) obj).LL);
            }
        }, null, new AwS628S0100000_14(this, 89), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0ZoC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C910770ZoB) obj).LLILLJJLI);
            }
        }, null, new AwS628S0100000_14(this, 90), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0ZoE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C910770ZoB) obj).LLILLL;
            }
        }, null, new AwS628S0100000_14(this, 91), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0ZoD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C910770ZoB) obj).LLILZ;
            }
        }, null, new AwS628S0100000_14(this, 92), 6);
        C910030Zmz c910030Zmz = (C910030Zmz) this.LLIZLLLIL.getValue();
        if (c910030Zmz != null) {
            str2 = c910030Zmz.LLILLJJLI;
        }
        if (!Intrinsics.LJFF(str2, EnumC910040Zn0.PANEL.getValue())) {
            LJJIJL().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC913850Zt9(this, 2));
        }
    }
}
