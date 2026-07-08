package com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield;

import X.AnonymousClass0950;
import X.AnonymousClass0951;
import X.C09IC;
import X.C09IR;
import X.C0WZX;
import X.C1640006bW;
import X.C1BNE;
import X.C2204961BRm;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C463090IDz;
import X.EnumC2252401DDy;
import X.InterfaceC0148002o;
import X.InterfaceC453090Hpj;
import android.text.Editable;
import android.widget.EditText;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class InputFieldVM extends AssemViewModel<InterfaceC0148002o> implements IInputFieldAbility, InterfaceC453090Hpj {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;
    public EditText LLILLL;
    public final C2252331DDr LLILZ;
    public final AnonymousClass0950 LLILZIL;

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility
    public final void LLJZIJLIL() {
        this.LLILZ.LIZJ(Boolean.TRUE);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(3);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility
    public final void rv() {
        try {
            EditText editText = this.LLILLL;
            if (editText != null) {
                editText.setText("");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public InputFieldVM() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1640006bW(0));
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZ = C09IR.LIZ(0, 1, EnumC2252401DDy.DROP_OLDEST);
        this.LLILZ = c2252331DDrLIZ;
        this.LLILZIL = C09IC.LIZ(c2252331DDrLIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility, X.InterfaceC453090Hpj
    public final AnonymousClass0951 Kv() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility
    public final EditText bW0() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility
    public final void J5(CharSequence charSequence) {
        EditText editText;
        if (charSequence != null && !a0.LJJJIL(charSequence) && (editText = this.LLILLL) != null) {
            int selectionStart = editText.getSelectionStart();
            Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLZzG3SZ8ENR3tcVnhlZmxqPDsdbvrweE1/vCmCyGYlkunUQaAFRfAEpa/oDhZhWa/4o=", null));
            if (editableLLJILLL != null) {
                editableLLJILLL.insert(selectionStart, charSequence);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility
    public final void setVisibility(boolean z) {
        Object value;
        C2252321DDq c2252321DDq = this.LL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1640006bW.LIZ((C1640006bW) value, z, null, null, 0, 14)));
    }

    public final void vQ2(CharSequence charSequence) {
        Object value;
        C2252321DDq c2252321DDq = this.LL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1640006bW.LIZ((C1640006bW) value, false, null, charSequence, 0, 11)));
    }
}
