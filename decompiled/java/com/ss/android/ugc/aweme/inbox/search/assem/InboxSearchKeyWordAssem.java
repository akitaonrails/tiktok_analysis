package com.ss.android.ugc.aweme.inbox.search.assem;

import X.C01D1;
import X.C09R3;
import X.C0ALW;
import X.C1242080iQY;
import X.C1265830j2r;
import X.C1266020j3A;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C340780DXo;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnFocusChangeListenerC1265950j33;
import X.ViewTreeObserverOnGlobalLayoutListenerC1265990j37;
import Y.ARunnableS119S0100000_19;
import android.view.View;
import android.widget.EditText;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.inbox.search.ability.InboxSearchKeyWordAbility;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchDefaultVM;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS70S1000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchKeyWordAssem extends UIContentAssem implements InboxSearchKeyWordAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InboxSearchKeyWordAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/search/vm/InboxSearchVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(InboxSearchKeyWordAssem.class, "defaultVM", "getDefaultVM()Lcom/ss/android/ugc/aweme/inbox/search/vm/InboxSearchDefaultVM;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public InboxSearchKeyWordAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InboxSearchVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 1553), AFwS257S0000000_19.get$arr$(193), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(InboxSearchDefaultVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 1554), AFwS257S0000000_19.get$arr$(194), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1464783441) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.ability.InboxSearchKeyWordAbility
    public final void Rq() {
        C1242080iQY c1242080iQY;
        EditText editText;
        View viewLJJIJL = LJJIJL();
        if (!(viewLJJIJL instanceof C1242080iQY) || (c1242080iQY = (C1242080iQY) viewLJJIJL) == null || (editText = c1242080iQY.getEditText()) == null) {
            return;
        }
        editText.clearFocus();
        C340780DXo.LIZ(editText);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        Rq();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) throws IllegalAccessException {
        super.onViewCreated(view);
        C1558520qew.LIZLLL(this);
        C1242080iQY c1242080iQY = (C1242080iQY) view.findViewById(R.id.kja);
        c1242080iQY.setOnClearClick(new AwS563S0100000_19(this, 1552));
        EditText editText = c1242080iQY.getEditText();
        editText.setOnEditorActionListener(new C1265830j2r(this, 1));
        editText.addTextChangedListener(new C1266020j3A(this, 4));
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1265950j33(this, 2));
        if (((Boolean) C0ALW.LIZ.getValue()).booleanValue()) {
            HandlerHook.viewPostDelay(editText, new ARunnableS119S0100000_19(editText, 74), 300L);
        } else {
            C786410Ut5.x3(editText.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1265990j37(editText, 2));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.ability.InboxSearchKeyWordAbility
    public final void t02(String str) {
        C1242080iQY c1242080iQY;
        View viewLJJIJL = LJJIJL();
        EditText editText = null;
        if ((viewLJJIJL instanceof C1242080iQY) && (c1242080iQY = (C1242080iQY) viewLJJIJL) != null) {
            editText = c1242080iQY.getEditText();
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        InboxSearchVM inboxSearchVM = (InboxSearchVM) assemVMLazy.getValue();
        inboxSearchVM.LL = str;
        inboxSearchVM.setState(new AwS70S1000000_19(str, 16));
        if (editText != null) {
            editText.setText(str);
            editText.setSelection(str.length());
        }
    }
}
