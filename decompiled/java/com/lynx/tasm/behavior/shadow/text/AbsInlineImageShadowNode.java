package com.lynx.tasm.behavior.shadow.text;

import X.AbstractC1315450kKt;
import X.C1289960jfm;
import X.C1299120juY;
import X.C1311920kFC;
import X.C1313270kHN;
import X.InterfaceC1312530kGB;
import X.InterfaceC1312540kGC;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AbsInlineImageShadowNode extends BaseTextShadowNode {
    public boolean LJJIL;
    public boolean LJJIZ;
    public int LJJJ;
    public C1313270kHN LJJJI;

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final boolean LJIILL() {
        return true;
    }

    public abstract AbstractC1315450kKt LJJIL();

    @InterfaceC1312540kGC(name = "mode")
    public abstract void setMode(String str);

    @InterfaceC1312540kGC(name = "src")
    public abstract void setSource(String str);

    public final C1313270kHN LJJIZ() {
        if (this.LJJJI == null) {
            this.LJJJI = new C1313270kHN(LJIIJJI());
        }
        return this.LJJJI;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIL(Map<String, C1299120juY> map) {
        this.LJIILL = map;
        if (map != null) {
            this.LJJIL = map.containsKey("load");
            this.LJJIZ = map.containsKey("error");
        }
    }

    public final void LJJJ(String str) {
        if (!this.LJJIZ) {
            return;
        }
        C1289960jfm c1289960jfm = new C1289960jfm(this.LIZIZ, "error");
        c1289960jfm.LIZIZ(str, "errMsg");
        LJIIJJI().LLIZ.LIZIZ(c1289960jfm);
    }

    public void LJJJIL(AbstractC1315450kKt abstractC1315450kKt) {
        C1311920kFC c1311920kFC = this.LJIILIIL;
        if (c1311920kFC != null) {
            int i = c1311920kFC.LIZ;
            float f = c1311920kFC.LIZIZ;
            abstractC1315450kKt.LL = i;
            abstractC1315450kKt.LLILLJJLI = f;
        }
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "background-color")
    public void setBackgroundColor(int i) {
        this.LJJJ = i;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    @InterfaceC1312540kGC(name = "vertical-align")
    public void setVerticalAlign(ReadableArray readableArray) {
        LJJ(readableArray);
    }

    public final void LJJJI(int i, int i2) {
        if (!this.LJJIL) {
            return;
        }
        C1289960jfm c1289960jfm = new C1289960jfm(this.LIZIZ, "load");
        c1289960jfm.LIZIZ(Integer.valueOf(i2), "height");
        c1289960jfm.LIZIZ(Integer.valueOf(i), "width");
        LJIIJJI().LLIZ.LIZIZ(c1289960jfm);
    }

    @InterfaceC1312530kGB(customType = "Color", names = {"border-left-color", "border-right-color", "border-top-color", "border-bottom-color"})
    public void setBorderColor(int i, Integer num) {
        LJJIZ().LJIILL(LynxBaseUI.SPACING_TYPES[i + 1], num);
    }

    @InterfaceC1312530kGB(names = {"border-radius", "border-top-left-radius", "border-top-right-radius", "border-bottom-right-radius", "border-bottom-left-radius"})
    public void setBorderRadius(int i, ReadableArray readableArray) {
        LJJIZ().LJIILLIIL(i, readableArray);
    }

    @InterfaceC1312530kGB(defaultInt = -1, names = {"border-style", "border-left-style", "border-right-style", "border-top-style", "border-bottom-style"})
    public void setBorderStyle(int i, int i2) {
        LJJIZ().LJIJ(LynxBaseUI.SPACING_TYPES[i], i2);
    }

    @InterfaceC1312530kGB(names = {"border-width", "border-left-width", "border-right-width", "border-top-width", "border-bottom-width"})
    public void setBorderWidth(int i, int i2) {
        C1313270kHN c1313270kHNLJJIZ = LJJIZ();
        c1313270kHNLJJIZ.LIZIZ().LIZJ(i2, LynxBaseUI.SPACING_TYPES[i]);
    }
}
