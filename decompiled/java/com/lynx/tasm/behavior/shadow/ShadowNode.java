package com.lynx.tasm.behavior.shadow;

import X.C1299120juY;
import X.C1310290kCZ;
import X.C1311620kEi;
import X.C1311730kEt;
import X.C1311920kFC;
import X.C2188811AlT;
import X.EnumC1311640kEk;
import X.EnumC1311650kEl;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import com.bytedance.ies.xelement.text.inlinetruncation.LynxInlineTruncationShadowNode;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.behavior.utils.PropsUpdater;
import j27.s;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class ShadowNode extends LayoutNode {
    public String LJIIIZ;
    public ArrayList<ShadowNode> LJIIJ;
    public ShadowNode LJIIJJI;
    public s LJIIL;
    public C1311920kFC LJIILIIL;
    public boolean LJIILJJIL;
    public Map<String, C1299120juY> LJIILL;
    public EnumC1311650kEl LJIILLIIL;
    public EnumC1311650kEl LJIIZILJ;
    public EnumC1311640kEk LJIJ;
    public ReadableMap LJIJI = new JavaOnlyMap();
    public boolean LJIJJ;

    public Object LJIIL() {
        return null;
    }

    public boolean LJIILL() {
        return this instanceof LynxInlineTruncationShadowNode;
    }

    public void LJIJ() {
    }

    public void LJIJI() {
    }

    public boolean LJJI() {
        return this instanceof NativeLayoutNodeRef;
    }

    public final int LJIIJ() {
        ArrayList<ShadowNode> arrayList = this.LJIIJ;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final s LJIIJJI() {
        s sVar = this.LJIIL;
        if (sVar != null) {
            return sVar;
        }
        throw new AssertionError();
    }

    public final String LJIILIIL() {
        String str = this.LJIIIZ;
        if (str != null) {
            return str;
        }
        throw new AssertionError();
    }

    public void LJIILLIIL() {
        ShadowNode shadowNode;
        if (this.LJIILJJIL) {
            return;
        }
        if (!LJIILL()) {
            if (this.LJ) {
                return;
            }
            this.LJ = true;
            this.LIZ.LJFF(this.LIZIZ);
            return;
        }
        if (LJIILL()) {
            shadowNode = this.LJIIJJI;
            while (shadowNode != null) {
                if (shadowNode.LJIILL()) {
                    shadowNode = shadowNode.LJIIJJI;
                }
            }
            return;
        }
        shadowNode = this;
        shadowNode.LJIILLIIL();
    }

    public boolean LJIIZILJ() {
        Map<String, C1299120juY> map = this.LJIILL;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        EnumC1311650kEl enumC1311650kEl = this.LJIILLIIL;
        EnumC1311650kEl enumC1311650kEl2 = EnumC1311650kEl.Undefined;
        return (enumC1311650kEl == enumC1311650kEl2 && this.LJIIZILJ == enumC1311650kEl2 && this.LJIJ == EnumC1311640kEk.Unset) ? false : true;
    }

    public C1311620kEi LJJIFFI() {
        return new C1311620kEi(this.LIZIZ, this.LJIILL, this.LJIILLIIL, this.LJIJJ, this.LJIIZILJ, this.LJIJ, this.LJIJI);
    }

    public ShadowNode() {
        EnumC1311650kEl enumC1311650kEl = EnumC1311650kEl.Undefined;
        this.LJIILLIIL = enumC1311650kEl;
        this.LJIIZILJ = enumC1311650kEl;
        this.LJIJ = EnumC1311640kEk.Unset;
        this.LJIJJ = true;
    }

    public final boolean LJIILJJIL() {
        ShadowNode shadowNode;
        if (!LJIILL()) {
            boolean z = this.LJ;
            if (z) {
                return z;
            }
            if (this.LIZ.LJ(this.LIZIZ)) {
                this.LJ = true;
            }
            return this.LJ;
        }
        if (LJIILL()) {
            shadowNode = this.LJIIJJI;
            while (shadowNode != null) {
                if (shadowNode.LJIILL()) {
                    shadowNode = shadowNode.LJIIJJI;
                }
            }
            return false;
        }
        shadowNode = this;
        return shadowNode.LJIILJJIL();
    }

    public String toString() {
        return this.LJIIIZ;
    }

    public final ShadowNode LJIIIZ(int i) {
        ArrayList<ShadowNode> arrayList = this.LJIIJ;
        if (arrayList != null) {
            return (ShadowNode) ListProtector.get(arrayList, i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index ");
        sbLIZ.append(i);
        sbLIZ.append(" out of bounds: node has no children");
        throw new ArrayIndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIJJ(String str) {
        if (this.LJIIL != null) {
            this.LJIIL.LJIILLIIL(new LynxError(60401, str, "", "error"));
        }
    }

    public void LJIJJLI(s sVar) {
        this.LJIIL = sVar;
    }

    public void LJIL(Map<String, C1299120juY> map) {
        this.LJIILL = map;
    }

    public final void LJJ(ReadableArray readableArray) {
        if (this.LJIILIIL == null) {
            this.LJIILIIL = new C1311920kFC();
        }
        if (readableArray != null && readableArray.size() >= 2) {
            this.LJIILIIL.LIZ = readableArray.getInt(0);
            this.LJIILIIL.LIZIZ = (float) readableArray.getDouble(1);
        } else {
            C1311920kFC c1311920kFC = this.LJIILIIL;
            c1311920kFC.LIZ = 0;
            c1311920kFC.LIZIZ = 0.0f;
        }
        LJIILLIIL();
    }

    public final void LJJII(C1311730kEt c1311730kEt) {
        try {
            PropsUpdater.LIZJ(this, c1311730kEt);
            LJIJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Catch exception for tag: ");
            sbLIZ.append(LJIILIIL());
            LynxLog.e("lynx_ShadowNode", C2188811AlT.LIZIZ(sbLIZ));
            LJIIJJI().handleException(e);
        }
    }

    @InterfaceC1312540kGC(name = "dataset")
    public void setDataset(ReadableMap readableMap) {
        this.LJIJI = readableMap;
    }

    @InterfaceC1312540kGC(name = "event-through")
    public void setEventThrough(InterfaceC1298070jsr interfaceC1298070jsr) {
        EnumC1311650kEl enumC1311650kEl;
        if (interfaceC1298070jsr == null) {
            this.LJIIZILJ = EnumC1311650kEl.Undefined;
        }
        try {
            if (interfaceC1298070jsr.asBoolean()) {
                enumC1311650kEl = EnumC1311650kEl.Enable;
            } else {
                enumC1311650kEl = EnumC1311650kEl.Disable;
            }
            this.LJIIZILJ = enumC1311650kEl;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LynxLog.i("lynx_ShadowNode", th.toString());
            this.LJIIZILJ = EnumC1311650kEl.Undefined;
        }
    }

    @InterfaceC1312540kGC(name = "enable-touch-pseudo-propagation")
    public void setEventThroughPropagation(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr == null) {
            this.LJIJJ = true;
            return;
        }
        try {
            this.LJIJJ = interfaceC1298070jsr.asBoolean();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LynxLog.i("lynx_ShadowNode", th.toString());
            this.LJIJJ = true;
        }
    }

    @InterfaceC1312540kGC(name = "ignore-focus")
    public void setIgnoreFocus(InterfaceC1298070jsr interfaceC1298070jsr) {
        EnumC1311650kEl enumC1311650kEl;
        if (interfaceC1298070jsr == null) {
            this.LJIILLIIL = EnumC1311650kEl.Undefined;
            return;
        }
        try {
            if (interfaceC1298070jsr.asBoolean()) {
                enumC1311650kEl = EnumC1311650kEl.Enable;
            } else {
                enumC1311650kEl = EnumC1311650kEl.Disable;
            }
            this.LJIILLIIL = enumC1311650kEl;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LynxLog.i("lynx_ShadowNode", th.toString());
            this.LJIILLIIL = EnumC1311650kEl.Undefined;
        }
    }

    @InterfaceC1312540kGC(name = "pointer-events")
    public void setPointerEvents(int i) {
        if (i >= EnumC1311640kEk.Auto.ordinal() && i < EnumC1311640kEk.Unset.ordinal()) {
            this.LJIJ = EnumC1311640kEk.values()[i];
        }
    }

    @InterfaceC1312540kGC(name = "vertical-align")
    public void setVerticalAlign(ReadableArray readableArray) {
        C1310290kCZ c1310290kCZ = this.LJIIL.LLLIIII;
        if (c1310290kCZ == null || !c1310290kCZ.LJIJI) {
            LJJ(readableArray);
        }
    }

    public void LJIIIIZZ(ShadowNode shadowNode, int i) {
        if (shadowNode.LJIIJJI == null) {
            if (this.LJIIJ == null) {
                this.LJIIJ = new ArrayList<>(4);
            }
            ListProtector.add(this.LJIIJ, i, shadowNode);
            shadowNode.LJIIJJI = this;
            return;
        }
        throw new RuntimeException("Tried to add child that already has a parent! Remove it from its parent first.");
    }
}
