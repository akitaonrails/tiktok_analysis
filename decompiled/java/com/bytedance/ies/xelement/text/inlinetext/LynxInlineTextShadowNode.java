package com.bytedance.ies.xelement.text.inlinetext;

import X.C1316940kNI;
import X.C1317660kOS;
import X.C439900HMu;
import X.InterfaceC1312540kGC;
import android.text.SpannableStringBuilder;
import com.bytedance.ies.xelement.text.text.LynxTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxInlineTextShadowNode extends InlineTextShadowNode {
    public boolean LJJJI;
    public String LJJJIL = "none";

    @InterfaceC1312540kGC(defaultBoolean = true, name = "no-trim")
    public final void setNoTrim(boolean z) {
        this.LJJJI = z;
        LJIILLIIL();
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void LJJIIJ(SpannableStringBuilder spannableStringBuilder, String str, boolean z) {
        if (!this.LJJJI) {
            Regex regex = LynxTextShadowNode.LJJL;
            if (str != null) {
                str = C1317660kOS.LIZ(0, LynxTextShadowNode.LJJL.replace(str, ""));
            } else {
                str = null;
            }
        }
        if (C1316940kNI.LIZIZ()) {
            if (Intrinsics.LJFF(this.LJJJIL, "bracket")) {
                Pattern pattern = C439900HMu.LIZ;
                spannableStringBuilder.append(C439900HMu.LIZIZ(LJIIJJI(), str, (int) this.LJIJJLI.LJIILIIL));
                return;
            } else {
                spannableStringBuilder.append((CharSequence) str);
                return;
            }
        }
        spannableStringBuilder.append((CharSequence) str);
    }
}
