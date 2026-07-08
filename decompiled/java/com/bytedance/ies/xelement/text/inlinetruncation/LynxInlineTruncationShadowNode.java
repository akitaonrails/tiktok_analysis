package com.bytedance.ies.xelement.text.inlinetruncation;

import X.C1316900kNE;
import X.C786410Ut5;
import X.InterfaceC1312540kGC;
import android.text.SpannableStringBuilder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxInlineTruncationShadowNode extends TextShadowNode {
    public boolean LJJJLIIL;

    @InterfaceC1312540kGC(name = "stick")
    public final void setStick(boolean z) {
        this.LJJJLIIL = z;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void LJJIIZ(SpannableStringBuilder spannableStringBuilder, List<C1316900kNE> list) {
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        super.LJJIIZ(spannableStringBuilder2, arrayList);
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                ((C1316900kNE) ListProtector.get(arrayList, size)).LIZ(spannableStringBuilder2);
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        if (LJIIZILJ()) {
            C786410Ut5.q2(spannableStringBuilder2, LJJIFFI(), 0, spannableStringBuilder2.length(), 18);
        }
        this.LJJIZ = spannableStringBuilder2;
    }
}
