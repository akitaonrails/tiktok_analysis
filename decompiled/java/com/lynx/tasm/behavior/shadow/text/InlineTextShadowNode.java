package com.lynx.tasm.behavior.shadow.text;

import X.C1300980jxY;
import X.C1301060jxg;
import X.C1313270kHN;
import X.C1313920kIQ;
import X.C1314570kJT;
import X.C1315120kKM;
import X.C1316720kMw;
import X.C1316900kNE;
import X.C1316960kNK;
import X.InterfaceC1312530kGB;
import X.InterfaceC1312540kGC;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.utils.DeviceUtils;
import j27.s;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class InlineTextShadowNode extends BaseTextShadowNode {
    public int LJJIL;
    public C1313270kHN LJJIZ;
    public boolean LJJJ;

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final boolean LJIILL() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode, com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJJLI(s sVar) {
        super.LJIJJLI(sVar);
        this.LJJIZ = new C1313270kHN(sVar);
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "background-color")
    public void setBackgroundColor(int i) {
        if (this.LJJIL != i) {
            this.LJJIL = i;
            LJIILLIIL();
        }
    }

    @InterfaceC1312540kGC(name = "background-image")
    public void setBackgroundImage(ReadableArray readableArray) {
        LJIILLIIL();
        if (readableArray == null) {
            this.LJJJ = false;
        } else {
            this.LJJIZ.LIZIZ().LJ.LIZLLL(readableArray, null);
            this.LJJJ = true;
        }
    }

    @InterfaceC1312540kGC(name = "background-position")
    public void setBackgroundPosition(ReadableArray readableArray) {
        this.LJJIZ.LJIIIIZZ(readableArray);
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "background-repeat")
    public void setBackgroundRepeat(ReadableArray readableArray) {
        this.LJJIZ.LJIIIZ(readableArray);
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "background-size")
    public void setBackgroundSize(ReadableArray readableArray) {
        this.LJJIZ.LJIIJ(readableArray);
        LJIILLIIL();
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void setTextAlign(int i) {
        super.setTextAlign(i);
        if (this.LJJII) {
            LynxLog.e("InlineTextShadowNode", "inline-text will no longer support text-align in future, set on root text instead");
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    @InterfaceC1312540kGC(name = "vertical-align")
    public void setVerticalAlign(ReadableArray readableArray) {
        LJJ(readableArray);
    }

    @InterfaceC1312530kGB(names = {"border-radius", "border-top-left-radius", "border-top-right-radius", "border-bottom-right-radius", "border-bottom-left-radius"})
    public void setBorderRadius(int i, ReadableArray readableArray) {
        this.LJJIZ.LJIILLIIL(i, readableArray);
        LJIILLIIL();
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void LJJIIJZLJL(int i, int i2, List<C1316900kNE> list) {
        super.LJJIIJZLJL(i, i2, list);
        if (LJIIZILJ()) {
            ((ArrayList) list).add(new C1316900kNE(i, i2, LJJIFFI()));
        }
        if (this.LJJIL != 0) {
            ((ArrayList) list).add(new C1316900kNE(i, i2, new BackgroundColorSpan(this.LJJIL)));
        }
        if (this.LJJJ) {
            ((ArrayList) list).add(new C1316900kNE(i, i2, new C1315120kKM(i, i2, this.LJJIZ)));
        }
        if (!C1314570kJT.LIZ(this.LJIJJLI.LJIILIIL)) {
            ((ArrayList) list).add(new C1316900kNE(i, i2, new AbsoluteSizeSpan(Math.round(this.LJIJJLI.LJIILIIL))));
        }
        if (!TextUtils.isEmpty(this.LJIJJLI.LJIJJ)) {
            C1316720kMw c1316720kMw = this.LJIJJLI;
            String str = c1316720kMw.LJIJJ;
            int iLJ = c1316720kMw.LJ();
            Typeface typefaceLJ = C1300980jxY.LJ(iLJ, LJIIJJI(), str);
            if (typefaceLJ == null) {
                C1301060jxg.LIZ.LJ(LJIIJJI(), str, iLJ, new C1313920kIQ(this));
                typefaceLJ = DeviceUtils.LIZ();
            } else {
                this.LJIJJLI.LJJIII = true;
            }
            ((ArrayList) list).add(new C1316900kNE(i, i2, new C1316960kNK(typefaceLJ)));
        }
    }
}
