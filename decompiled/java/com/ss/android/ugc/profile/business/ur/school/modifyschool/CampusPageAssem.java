package com.ss.android.ugc.profile.business.ur.school.modifyschool;

import X.C019F;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337920DMo;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC337870DMj;
import X.InterfaceC2217461Bqa;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CampusPageAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final EnumC337870DMj LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AtomicBoolean LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CampusPageAssem.class, "modifySchoolVM", "getModifySchoolVM()Lcom/ss/android/ugc/profile/business/ur/school/modifyschool/CampusFlowViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public void LLFF() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public void onPagePause() {
    }

    public final void LJLZ() {
        DialogFragment dialogFragment;
        Context context;
        Dialog dialog;
        Window window;
        View currentFocus;
        InputMethodManager inputMethodManager;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (!(fragmentLJI instanceof DialogFragment) || (dialogFragment = (DialogFragment) fragmentLJI) == null || (context = dialogFragment.getContext()) == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null || (currentFocus = window.getCurrentFocus()) == null) {
            return;
        }
        Object objH2 = C786410Ut5.H2(context, "input_method");
        if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
        currentFocus.clearFocus();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        if (C13LP.LJJLIIIJJI(((C337920DMo) assemVMLazy.getValue().getState()).LLILLJJLI) == this.LLJJI && this.LLJJIJI.compareAndSet(false, true)) {
            LLFF();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        if (this.LLJJIJI.compareAndSet(true, false)) {
            onPagePause();
        }
    }

    public CampusPageAssem(EnumC337870DMj enumC337870DMj) {
        this.LLJJI = enumC337870DMj;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CampusFlowViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS548S0100000_4(c19719912DlLIZ, 354), AFwS232S0000000_4.get$arr$(125), null, true);
        this.LLJJIJI = new AtomicBoolean(false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0DLG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C337920DMo) obj).LLILLJJLI;
            }
        }, null, new AwS618S0100000_4(this, 40), 6);
    }
}
