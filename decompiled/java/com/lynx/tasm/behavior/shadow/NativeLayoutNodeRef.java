package com.lynx.tasm.behavior.shadow;

import X.C1311620kEi;
import X.C1311630kEj;
import X.C1311920kFC;
import X.C1312230kFh;
import X.C1312250kFj;
import X.C1312260kFk;
import X.C1312280kFm;
import X.C2188811AlT;
import X.InterfaceC1312540kGC;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.LayoutNodeManager;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class NativeLayoutNodeRef extends ShadowNode {
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public String LJJIFFI;

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final boolean LJIIZILJ() {
        throw null;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final C1311620kEi LJJIFFI() {
        return new C1311630kEj(this.LIZIZ, this.LJIILL, this.LJIILLIIL, this.LJIJJ, this.LJIIZILJ, this.LJIJ, this.LJIJI);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJJLI(s sVar) {
        this.LJIIL = sVar;
    }

    public final void LJJIII(C1312260kFk c1312260kFk) {
        if (this.LJIILJJIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("alignNativeNode for null, tag: ");
            sbLIZ.append(LJIILIIL());
            LJIJJ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LIZ.LIZ(c1312260kFk.LIZIZ, c1312260kFk.LIZ, this.LIZIZ);
    }

    @InterfaceC1312540kGC(name = "idSelector")
    public void setIdSelector(String str) {
        this.LJJIFFI = str;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    @InterfaceC1312540kGC(name = "vertical-align")
    public void setVerticalAlign(ReadableArray readableArray) {
        LJJ(readableArray);
    }

    public final C1312250kFj LJJIIJ(C1312280kFm c1312280kFm, C1312230kFh c1312230kFh) {
        if (this.LJIILJJIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("measureNativeNode for null, tag: ");
            sbLIZ.append(LJIILIIL());
            LJIJJ(C2188811AlT.LIZIZ(sbLIZ));
            return new C1312250kFj(0.0f, 0.0f);
        }
        C1311920kFC c1311920kFC = this.LJIILIIL;
        if (c1311920kFC != null && c1311920kFC.LIZ == 1) {
            LayoutNodeManager layoutNodeManager = this.LIZ;
            int i = this.LIZIZ;
            float f = c1312230kFh.LIZ;
            int[] iArrLJII = layoutNodeManager.LJII(c1312280kFm.LIZ, i, c1312230kFh.LIZIZ.intValue(), c1312230kFh.LIZLLL.intValue(), f, c1312230kFh.LIZJ);
            return new C1312250kFj(iArrLJII[0], iArrLJII[1], iArrLJII[2]);
        }
        LayoutNodeManager layoutNodeManager2 = this.LIZ;
        int i2 = this.LIZIZ;
        float f2 = c1312230kFh.LIZ;
        long jLJI = layoutNodeManager2.LJI(c1312280kFm.LIZ, i2, c1312230kFh.LIZIZ.intValue(), c1312230kFh.LIZLLL.intValue(), f2, c1312230kFh.LIZJ);
        return new C1312250kFj(Float.intBitsToFloat((int) ((jLJI >> 32) & (-1))), Float.intBitsToFloat((int) (jLJI & (-1))));
    }
}
