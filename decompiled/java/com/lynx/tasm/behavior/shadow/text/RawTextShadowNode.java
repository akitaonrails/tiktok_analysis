package com.lynx.tasm.behavior.shadow.text;

import X.C1316710kMv;
import X.C2188811AlT;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class RawTextShadowNode extends ShadowNode {
    public String LJIJJLI;
    public boolean LJIL;

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final boolean LJIILL() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIILIIL());
        sbLIZ.append(" [text: ");
        sbLIZ.append(this.LJIJJLI);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @InterfaceC1312540kGC(name = "pseudo")
    public void setPsuedo(boolean z) {
        this.LJIL = z;
    }

    @InterfaceC1312540kGC(name = "text")
    public void setText(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.LJIJJLI = C1316710kMv.LIZIZ(interfaceC1298070jsr);
        LJIILLIIL();
    }
}
