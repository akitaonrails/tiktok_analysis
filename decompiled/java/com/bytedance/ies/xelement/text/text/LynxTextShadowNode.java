package com.bytedance.ies.xelement.text.text;

import X.C1314570kJT;
import X.C1316900kNE;
import X.C1316940kNI;
import X.C1317660kOS;
import X.C439900HMu;
import X.C439910HMv;
import X.InterfaceC1301080jxi;
import X.InterfaceC1312540kGC;
import X.InterfaceC439930HMx;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import com.bytedance.ies.xelement.text.inlinetext.LynxInlineTextShadowNode;
import com.bytedance.ies.xelement.text.inlinetruncation.LynxInlineTruncationShadowNode;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import j27.s;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS258S0000000_20;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxTextShadowNode extends TextShadowNode implements InterfaceC1301080jxi {
    public static final Regex LJJL = new Regex("^[\\s]+|[\\s]+$");
    public int LJJJLL;
    public SpannableStringBuilder LJJJLZIJ;
    public String LJJJLIIL = "none";
    public Function1<? super Context, ? extends InterfaceC439930HMx> LJJJZ = AFwS258S0000000_20.get$arr$(8);

    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode
    public final boolean LJJJJ() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode
    public final int LJJJ() {
        SpannableStringBuilder spannableStringBuilder = this.LJJJLZIJ;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder.length();
        }
        return 0;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode
    public final void LJJJJI() {
        super.LJJJJI();
        CharSequence charSequence = this.LJJIZ;
        if (charSequence == null) {
            charSequence = "";
        }
        this.LJJJLZIJ = new SpannableStringBuilder(charSequence);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode, com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJJLI(s sVar) {
        super.LJIJJLI(sVar);
        if (C1316940kNI.LIZIZ()) {
            C439910HMv.LIZ().LIZ = this.LJJJZ.invoke(sVar);
        }
    }

    public final float LJJJJJL(TextPaint textPaint) {
        CharSequence charSequence;
        int iLJIIJ = LJIIJ();
        float desiredWidth = 0.0f;
        for (int i = 0; i < iLJIIJ; i++) {
            ShadowNode shadowNodeLJIIIZ = LJIIIZ(i);
            if ((shadowNodeLJIIIZ instanceof LynxInlineTruncationShadowNode) && (charSequence = ((TextShadowNode) shadowNodeLJIIIZ).LJJIZ) != null) {
                desiredWidth += Layout.getDesiredWidth(charSequence, textPaint);
            }
        }
        return (float) Math.ceil(desiredWidth + 0.5f);
    }

    @InterfaceC1312540kGC(name = "ellipsize-mode")
    public final void setEllipsizeMode(String str) {
        if (Intrinsics.LJFF(str, "tail")) {
            setTextOverflow(1);
        } else if (Intrinsics.LJFF(str, "clip")) {
            setTextOverflow(0);
        }
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "richtype")
    public final void setRichType(String str) {
        float f;
        if (C1316940kNI.LIZIZ()) {
            this.LJJJLIIL = str;
            if (Intrinsics.LJFF(str, "bracket")) {
                if (C1314570kJT.LIZ(this.LJIJJLI.LJIIJ)) {
                    f = 40.0f;
                } else {
                    f = this.LJIJJLI.LJIIJ;
                }
                setLineHeight(f);
            }
            LJIILLIIL();
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    @InterfaceC1312540kGC(name = "text-maxline")
    public void setTextMaxLine(String str) {
        super.setTextMaxLine(str);
        this.LJJJLL = CastIntegerProtector.parseInt(str);
        LJIILLIIL();
    }

    @Override // X.InterfaceC1301080jxi
    public final void LIZIZ(Typeface typeface, int i) {
        LJIILLIIL();
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void LJJIIZ(SpannableStringBuilder spannableStringBuilder, List<C1316900kNE> list) {
        if (C1316940kNI.LIZIZ()) {
            int iLJIIJ = LJIIJ();
            for (int i = 0; i < iLJIIJ; i++) {
                ShadowNode shadowNodeLJIIIZ = LJIIIZ(i);
                if (shadowNodeLJIIIZ instanceof LynxInlineTextShadowNode) {
                    ((LynxInlineTextShadowNode) shadowNodeLJIIIZ).LJJJIL = this.LJJJLIIL;
                }
            }
        }
        super.LJJIIZ(spannableStringBuilder, list);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void LJJIIJ(SpannableStringBuilder spannableStringBuilder, String str, boolean z) {
        String strLIZ;
        if (str != null) {
            strLIZ = C1317660kOS.LIZ(0, LJJL.replace(str, ""));
        } else {
            strLIZ = null;
        }
        if (C1316940kNI.LIZIZ()) {
            if (Intrinsics.LJFF(this.LJJJLIIL, "bracket")) {
                Pattern pattern = C439900HMu.LIZ;
                spannableStringBuilder.append(C439900HMu.LIZIZ(LJIIJJI(), strLIZ, (int) this.LJIJJLI.LJIILIIL));
                return;
            } else {
                spannableStringBuilder.append((CharSequence) strLIZ);
                return;
            }
        }
        spannableStringBuilder.append((CharSequence) strLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZLLL(com.lynx.tasm.behavior.shadow.LayoutNode r26, float r27, X.EnumC1300260jwO r28, float r29, X.EnumC1300260jwO r30) {
        /*
            Method dump skipped, instruction units count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.text.text.LynxTextShadowNode.LIZLLL(com.lynx.tasm.behavior.shadow.LayoutNode, float, X.0jwO, float, X.0jwO):long");
    }
}
