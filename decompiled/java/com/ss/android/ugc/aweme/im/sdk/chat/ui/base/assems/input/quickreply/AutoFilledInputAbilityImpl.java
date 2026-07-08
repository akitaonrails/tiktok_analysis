package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.quickreply;

import X.C0WZX;
import X.C2204961BRm;
import android.text.Editable;
import android.widget.EditText;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.extrainput.IAutoFilledInputContentAbility;

/* JADX INFO: loaded from: classes7.dex */
public final class AutoFilledInputAbilityImpl implements IAutoFilledInputContentAbility {
    public final IInputFieldAbility LL;
    public String LLILLJJLI;
    public String LLILLL = "";

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.extrainput.IAutoFilledInputContentAbility
    public final void R50() {
        this.LLILLJJLI = null;
        this.LLILLL = "";
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.extrainput.IAutoFilledInputContentAbility
    public final void LLJZIJLIL() {
        this.LL.LLJZIJLIL();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.extrainput.IAutoFilledInputContentAbility
    public final String FX() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.extrainput.IAutoFilledInputContentAbility
    public final String b31() {
        return this.LLILLL;
    }

    public AutoFilledInputAbilityImpl(IInputFieldAbility iInputFieldAbility) {
        this.LL = iInputFieldAbility;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.extrainput.IAutoFilledInputContentAbility
    public final void Jn1(CharSequence charSequence, String str) {
        Editable editableLLJILLL;
        String str2 = (String) charSequence;
        if (str2.length() == 0) {
            return;
        }
        this.LL.J5(str2);
        EditText editTextBW0 = this.LL.bW0();
        String string = null;
        if (editTextBW0 != null && (editableLLJILLL = C2204961BRm.LLJILLL(editTextBW0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMeay1PRdJ2g/OBTJHB+FOsnwyXeq1E/YE6oUB2oygWkv4xUNWxVvmGbQf1ffLOcvlPrVaJ0ilg3A=", null))) != null) {
            string = editableLLJILLL.toString();
        }
        this.LLILLJJLI = string;
        this.LLILLL = str;
    }
}
