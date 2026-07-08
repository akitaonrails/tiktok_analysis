package com.lynx.tasm.behavior.shadow.text;

import X.C1316900kNE;
import X.C786410Ut5;
import android.text.SpannableStringBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class InlineTruncationShadowNode extends BaseTextShadowNode {
    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final boolean LJIILL() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void LJJIIZ(SpannableStringBuilder spannableStringBuilder, List<C1316900kNE> list) {
        super.LJJIIZ(spannableStringBuilder, list);
        if (LJIIZILJ()) {
            C786410Ut5.q2(spannableStringBuilder, LJJIFFI(), 0, spannableStringBuilder.length(), 18);
        }
    }
}
