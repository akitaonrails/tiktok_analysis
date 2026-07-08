package com.ss.android.ugc.aweme.im.ui.assem;

import X.C019F;
import X.C0I0B;
import X.C1241200iP8;
import X.C1265830j2r;
import X.C1266020j3A;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C894660Z7w;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnFocusChangeListenerC1265950j33;
import X.ViewTreeObserverOnGlobalLayoutListenerC1265990j37;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.ability.HistorySearchKeyWordAbility;
import com.ss.android.ugc.aweme.im.viewmodel.HistorySearchResultVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class HistorySearchActionBarAssem extends UIContentAssem implements HistorySearchKeyWordAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HistorySearchActionBarAssem.class, "resultVM", "getResultVM()Lcom/ss/android/ugc/aweme/im/viewmodel/HistorySearchResultVM;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HistorySearchActionBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HistorySearchResultVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1512), AFwS257S0000000_19.get$arr$(175), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -439846157) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.im.ability.HistorySearchKeyWordAbility
    public final void Rq() {
        C1241200iP8 c1241200iP8;
        View viewLJJIJL = LJJIJL();
        if (!(viewLJJIJL instanceof C1241200iP8) || (c1241200iP8 = (C1241200iP8) viewLJJIJL) == null) {
            return;
        }
        c1241200iP8.getEditText().clearFocus();
        C0I0B.LJFF.LIZJ();
        ((InputMethodManager) C786410Ut5.H2(C894660Z7w.LIZ(), "input_method")).hideSoftInputFromWindow(c1241200iP8.getWindowToken(), 0);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        Rq();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) throws IllegalAccessException {
        super.onViewCreated(view);
        C1241200iP8 c1241200iP8 = (C1241200iP8) view.findViewById(R.id.szi);
        c1241200iP8.setBackBtnListener(new AwS563S0100000_19(this, 1510));
        C1558520qew.LIZLLL(this);
        c1241200iP8.setOnClearClick(new AwS563S0100000_19(this, 1511));
        EditText editText = c1241200iP8.getEditText();
        editText.setOnEditorActionListener(new C1265830j2r(this, 0));
        editText.addTextChangedListener(new C1266020j3A(this, 2));
        C786410Ut5.x3(editText.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1265990j37(editText, 1));
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1265950j33(this, 0));
    }
}
