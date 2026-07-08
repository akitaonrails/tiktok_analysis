package com.bytedance.ies.xelement.input;

import X.C0WZX;
import X.C1297840jsU;
import X.C1299980jvw;
import X.C1312920kGo;
import X.C21397018oS;
import X.C2204961BRm;
import X.C430860Guy;
import X.EnumC1300260jwO;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import android.util.DisplayMetrics;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class AutoHeightInputShadowNode extends TextShadowNode {
    public int LJJJLIIL;
    public int LJJJLL;
    public float LJJJLZIJ = Float.MAX_VALUE;
    public float LJJJZ = Float.MAX_VALUE;
    public float LJJL = Float.MAX_VALUE;
    public C21397018oS LJJLI;

    public final void LJJJJJL() {
        C21397018oS c21397018oS = this.LJJLI;
        if (c21397018oS == null || c21397018oS.getMaxHeight() < 0 || this.LJJLI.getMinHeight() < 0 || this.LJJLI.getHint() == null) {
            return;
        }
        this.LJJJLIIL = C430860Guy.LIZ(this.LJJLI.getHint(), this.LJJLI, (int) this.LJJL).getHeight();
        int minHeight = this.LJJLI.getMinHeight();
        int maxHeight = this.LJJLI.getMaxHeight();
        int iMax = Math.max(this.LJJJLIIL, minHeight);
        this.LJJJLIIL = iMax;
        this.LJJJLIIL = Math.min(iMax, maxHeight);
    }

    public final boolean LJJJJL() {
        C21397018oS c21397018oS = this.LJJLI;
        if (c21397018oS != null && c21397018oS.getMaxHeight() >= 0 && this.LJJLI.getMinHeight() >= 0) {
            if (this.LJJLI.getHeight() != Math.min(Math.max(this.LJJJLL, this.LJJJLIIL), (int) this.LJJJLZIJ)) {
                LJIILLIIL();
                return true;
            }
        }
        return false;
    }

    public final void LJJJJLI() {
        C21397018oS c21397018oS = this.LJJLI;
        if (c21397018oS == null || c21397018oS.getMaxHeight() < 0 || this.LJJLI.getMinHeight() < 0 || C2204961BRm.LLLL(this.LJJLI, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/JttLRn5Q4YAnyTwigU/R3YxiLQ8RkSuYBvHw==", null)) == null) {
            return;
        }
        this.LJJJLL = C430860Guy.LIZ(C2204961BRm.LLLL(this.LJJLI, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/JttLRn5Q4YAnyTwigU/R3YxiLQ8RkSuYBvHw==", null)), this.LJJLI, (int) this.LJJL).getHeight();
        int minHeight = this.LJJLI.getMinHeight();
        int maxHeight = this.LJJLI.getMaxHeight();
        int iMax = Math.max(this.LJJJLL, minHeight);
        this.LJJJLL = iMax;
        this.LJJJLL = Math.min(iMax, maxHeight);
    }

    @InterfaceC1312540kGC(name = "font-size")
    public final void setFontTextSize(InterfaceC1298070jsr interfaceC1298070jsr) {
        DisplayMetrics displayMetrics = null;
        if (interfaceC1298070jsr == null) {
            s sVar = this.LJIIL;
            if (sVar != null) {
                displayMetrics = sVar.LLJJJ;
            }
            setFontSize(C1312920kGo.LIZJ("14px", 0.0f, 0.0f, 0.0f, 0.0f, displayMetrics));
            return;
        }
        ReadableType type = interfaceC1298070jsr.getType();
        if (type != null) {
            int i = C1297840jsU.LIZ[type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    String strAsString = interfaceC1298070jsr.asString();
                    s sVar2 = this.LJIIL;
                    if (sVar2 != null) {
                        displayMetrics = sVar2.LLJJJ;
                    }
                    setFontSize(C1312920kGo.LIZJ(strAsString, 0.0f, 0.0f, 0.0f, 0.0f, displayMetrics));
                    return;
                }
                return;
            }
            setFontSize((float) interfaceC1298070jsr.asDouble());
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode
    public final long LIZLLL(LayoutNode layoutNode, float f, EnumC1300260jwO enumC1300260jwO, float f2, EnumC1300260jwO enumC1300260jwO2) {
        this.LJJJZ = f2;
        this.LJJL = f;
        EnumC1300260jwO enumC1300260jwO3 = EnumC1300260jwO.EXACTLY;
        if (enumC1300260jwO2 == enumC1300260jwO3 && enumC1300260jwO == enumC1300260jwO3) {
            this.LJJJLZIJ = Float.MAX_VALUE;
            return C1299980jvw.LIZ(f, f2);
        }
        LJJJJLI();
        LJJJJJL();
        float fMax = Math.max(this.LJJJLL, this.LJJJLIIL);
        this.LJJJZ = fMax;
        if (enumC1300260jwO2 == EnumC1300260jwO.UNDEFINED) {
            this.LJJJLZIJ = Float.MAX_VALUE;
        } else if (enumC1300260jwO2 == EnumC1300260jwO.AT_MOST) {
            this.LJJJLZIJ = f2;
            this.LJJJZ = Math.min(fMax, f2);
        }
        return C1299980jvw.LIZ(f, this.LJJJZ);
    }
}
