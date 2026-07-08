package com.lynx.tasm.behavior.ui.image;

import X.AbstractC1315450kKt;
import X.C1289620jfE;
import X.C1314280kJ0;
import X.C1315430kKr;
import X.C1315680kLG;
import Y.ARunnableS120S0100000_20;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class InlineImageShadowNode extends AbsInlineImageShadowNode {
    public C1314280kJ0 LJJJIL;

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJ() {
        LJJIFFI();
        LJIILLIIL();
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJI() {
        C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(this, 57));
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public final AbstractC1315450kKt LJJIL() {
        LayoutNode layoutNode = this.LJII.LIZ;
        float fLIZLLL = layoutNode.LIZ.LIZLLL(layoutNode.LIZIZ);
        LayoutNode layoutNode2 = this.LJII.LIZ;
        float fLIZIZ = layoutNode2.LIZ.LIZIZ(layoutNode2.LIZIZ);
        LayoutNode layoutNode3 = this.LJII.LIZ;
        return new C1315430kKr((int) Math.ceil(fLIZLLL), (int) Math.ceil(fLIZIZ), layoutNode3.LIZ.LIZJ(layoutNode3.LIZIZ), this.LJJJIL);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kJ0] */
    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode, com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJJLI(s sVar) {
        super.LJIJJLI(sVar);
        final s sVar2 = this.LJIIL;
        this.LJJJIL = new C1315680kLG(sVar2) { // from class: X.0kJ0
            @Override // X.C1315680kLG
            public final void LJ() {
                this.LLLLLLIL.LJIILLIIL();
            }

            @Override // X.C1315680kLG
            public final void LJIIIZ(int i, int i2) {
                this.LLLLLLIL.LJJJI(i, i2);
            }

            @Override // X.C1315680kLG
            public final void LJIIIIZZ(LynxError lynxError, int i, int i2) {
                this.LLLLLLIL.LJJJ(lynxError.LJ());
            }
        };
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public final void setMode(String str) {
        LJIJI(str);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public final void setSource(String str) {
        LJIJJ(str);
    }
}
