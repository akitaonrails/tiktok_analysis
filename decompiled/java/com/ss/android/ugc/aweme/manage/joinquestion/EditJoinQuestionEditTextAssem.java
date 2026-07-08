package com.ss.android.ugc.aweme.manage.joinquestion;

import X.C019F;
import X.C01GW;
import X.C0DL6;
import X.C0I7D;
import X.C1243420iSi;
import X.C13DL;
import X.C13LE;
import X.C1509305vX;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C459080HzO;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS102S0100000_2;
import android.text.Editable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.manage.joinquestion.EditJoinQuestionViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS284S0000000_1;
import kotlin.jvm.internal.AwS132S1100000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes19.dex */
public final class EditJoinQuestionEditTextAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LLIZLLLIL = C1509305vX.LIZ(new AwS562S0100000_18(this, 354));
    public final C1243420iSi LLJ = C1243420iSi.LL;
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditJoinQuestionEditTextAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/manage/joinquestion/EditJoinQuestionViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EditJoinQuestionEditTextAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditJoinQuestionViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 355), AFwS256S0000000_18.get$arr$(121), null, true);
    }

    public final EditJoinQuestionViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (EditJoinQuestionViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        final C0I7D c0i7d = (C0I7D) this.LLIZLLLIL.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bs);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c0i7d.setBackground(c384050F3z.LIZ(c0i7d.getContext()));
        c0i7d.setText(Go().getState().LLILLJJLI);
        c0i7d.setSelection(Go().getState().LLILLJJLI.length());
        c0i7d.setFilters((InputFilter[]) C13DL.LJIIIZ(new InputFilter[]{this.LLJ}, C459080HzO.LIZIZ(50, c0i7d)));
        c0i7d.addTextChangedListener(new C0DL6() { // from class: X.0gQH
            @Override // X.C0DL6, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                EditJoinQuestionViewModel editJoinQuestionViewModelGo = this.LL.Go();
                editJoinQuestionViewModelGo.setState(new AwS132S1100000_18(editJoinQuestionViewModelGo, editable.toString(), 18));
            }
        });
        HandlerHook.viewPost(c0i7d, new ARunnableS102S0100000_2(c0i7d, 52));
        c0i7d.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0gQG
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                Editable editableLLLLJI;
                if (i != 6 || (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepbZ7J2XyWINtfbI8j+Trz1HH2p1kSfXprWMRUIsPKIERK0dJcInf/9QaRFMSEF70=", null))) == null || editableLLLLJI.length() == 0) {
                    return false;
                }
                this.Go().wQ2();
                return true;
            }
        });
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0gPE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159280gH0) obj).LLILZ;
            }
        }, null, AFwS284S0000000_1.get$arr$(45), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0gLo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159280gH0) obj).LLILZIL;
            }
        }, null, new AwS616S0100000_2(this, 112), 6);
    }
}
