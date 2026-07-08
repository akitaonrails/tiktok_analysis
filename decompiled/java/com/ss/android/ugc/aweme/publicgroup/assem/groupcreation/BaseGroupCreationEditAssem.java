package com.ss.android.ugc.aweme.publicgroup.assem.groupcreation;

import X.C019F;
import X.C01GW;
import X.C0DL6;
import X.C0I7D;
import X.C0WZX;
import X.C1228470i4b;
import X.C1228650i4t;
import X.C123100dR;
import X.C13LE;
import X.C1527305yR;
import X.C1559260qg8;
import X.C1584506Ih;
import X.C1637806bA;
import X.C1748470vbJ;
import X.C19719912Dl;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C459080HzO;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS149S0100000_14;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.publicgroup.vm.PublicGroupCreationVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseGroupCreationEditAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public final int LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseGroupCreationEditAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publicgroup/vm/PublicGroupCreationVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BaseGroupCreationEditAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PublicGroupCreationVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1683), AFwS257S0000000_19.get$arr$(253), null, true);
        this.LLJJIII = new C1559260qg8(new C723580SZw(this, C1527305yR.class, null), checkSupervisorPrepared());
        this.LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(51));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1684));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1681));
        this.LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1682));
    }

    public Integer hp() {
        return null;
    }

    public abstract int ip();

    public String kp() {
        return null;
    }

    public abstract int lp();

    public abstract int op();

    public abstract void tp(String str);

    public void up() {
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0i9e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1228870i5F) obj).LLJILJILJ);
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 31), 4);
    }

    public final C1748470vbJ mp() {
        return (C1748470vbJ) this.LLJJIJIIJIL.getValue();
    }

    public final PublicGroupCreationVM sp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (PublicGroupCreationVM) assemVMLazy.getValue();
    }

    public final void zp() {
        View view;
        C1228470i4b c1228470i4b;
        C1228650i4t c1228650i4t;
        Integer numValueOf = null;
        if (C123100dR.LIZ(String.valueOf(C2204961BRm.LLLLJI((C0I7D) this.LLJJIJIL.getValue(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq9YZPH3zU0aA6miiDEZUKwQPuWVaQW+H2/DoUujrc6aE1+eP8G9YunZHWpfCExJVPBRJkOV9iOG1c=", null)))) && (view = (View) this.LLJJJ.getValue()) != null && view.getVisibility() == 0) {
            View view2 = (View) this.LLJJJ.getValue();
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            C1748470vbJ c1748470vbJMp = mp();
            Context context = mp().getContext();
            C1527305yR c1527305yR = (C1527305yR) this.LLJJIII.getValue();
            if (c1527305yR != null && (c1228470i4b = c1527305yR.LL) != null && (c1228650i4t = c1228470i4b.LIZ) != null) {
                numValueOf = Integer.valueOf(c1228650i4t.LJIJ);
            }
            c1748470vbJMp.setBackground(C459080HzO.LIZLLL(context, numValueOf));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) throws Throwable {
        Integer numValueOf;
        String string;
        C1228470i4b c1228470i4b;
        C1228650i4t c1228650i4t;
        super.onViewCreated(view);
        up();
        Context context = getContext();
        if (context == null) {
            context = C459080HzO.LJ();
        }
        C1748470vbJ c1748470vbJMp = mp();
        c1748470vbJMp.LJFF(false);
        c1748470vbJMp.setMinimumHeight(this.LLJJIJI);
        C1584506Ih.LIZ(c1748470vbJMp.findViewById(R.id.uqb));
        C426750GoL.LJIIIZ(c1748470vbJMp.findViewById(R.id.hwv), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 21);
        C1527305yR c1527305yR = (C1527305yR) this.LLJJIII.getValue();
        if (c1527305yR != null && (c1228470i4b = c1527305yR.LL) != null && (c1228650i4t = c1228470i4b.LIZ) != null) {
            numValueOf = Integer.valueOf(c1228650i4t.LJIJ);
        } else {
            numValueOf = null;
        }
        c1748470vbJMp.setBackground(C459080HzO.LIZLLL(context, numValueOf));
        C0I7D editText = c1748470vbJMp.getEditText();
        editText.setHint(context.getString(ip()));
        editText.setGravity(16);
        c1748470vbJMp.LJII(131073);
        editText.setFilters(C459080HzO.LIZIZ(lp(), editText));
        editText.setTextAlignment(5);
        String strKp = kp();
        if (strKp != null) {
            editText.setText(strKp);
            Editable editableLLLLJI = C2204961BRm.LLLLJI(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq9YZPH3zU0aA6miiDEZUKwQPuWVaQW+H2/DoUujrc6aE1+eP8G9YunZHWpfCExJVPBRJkOV9iOG1c=", null));
            if (editableLLLLJI == null || (string = editableLLLLJI.toString()) == null) {
                string = "";
            }
            editText.setSelection(string.length());
            tp(string);
        }
        editText.addTextChangedListener(new C0DL6() { // from class: X.0i9g
            @Override // X.C0DL6, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                this.LL.tp(editable.toString());
            }
        });
        C786410Ut5.Y8(mp(), new ACListenerS149S0100000_14(this, 69));
    }

    public final void yp(int i) {
        String string;
        View view = (View) this.LLJJJ.getValue();
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        TextView textView = (TextView) this.LLJJJ.getValue();
        if (textView != null) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(i);
            } else {
                string = null;
            }
            textView.setText(string);
        }
        mp().setBackground(C459080HzO.LIZJ(mp().getContext()));
    }
}
