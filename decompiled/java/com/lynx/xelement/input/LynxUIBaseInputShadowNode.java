package com.lynx.xelement.input;

import X.C1299980jvw;
import X.C1311130kDv;
import X.C1312920kGo;
import X.EnumC1300260jwO;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIBaseInputShadowNode extends TextShadowNode {
    public int LJJJLIIL;

    @InterfaceC1312540kGC(name = "line-spacing")
    public final void setLineSpacingStr(InterfaceC1298070jsr interfaceC1298070jsr) {
        float fLIZ;
        if (interfaceC1298070jsr.getType() == ReadableType.String) {
            fLIZ = C1312920kGo.LIZIZ(interfaceC1298070jsr.asString(), 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, LJIIJJI().LLJJJ);
        } else if (interfaceC1298070jsr.getType() != ReadableType.Number && interfaceC1298070jsr.getType() != ReadableType.Int) {
            fLIZ = 0.0f;
        } else {
            fLIZ = C1311130kDv.LIZ(interfaceC1298070jsr.asDouble());
        }
        setLineSpacing(fLIZ);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode
    public final long LIZLLL(LayoutNode layoutNode, float f, EnumC1300260jwO enumC1300260jwO, float f2, EnumC1300260jwO enumC1300260jwO2) {
        if (enumC1300260jwO2 == EnumC1300260jwO.UNDEFINED) {
            f2 = this.LJJJLIIL;
        } else if (enumC1300260jwO2 == EnumC1300260jwO.AT_MOST) {
            f2 = Math.min(this.LJJJLIIL, f2);
        }
        return C1299980jvw.LIZ(f, f2);
    }
}
