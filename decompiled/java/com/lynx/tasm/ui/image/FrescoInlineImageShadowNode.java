package com.lynx.tasm.ui.image;

import X.AbstractC1315450kKt;
import X.AbstractC1320320kSk;
import X.C1289620jfE;
import X.C1294030jmL;
import X.C1316130kLz;
import X.C1320810kTX;
import X.C1322200kVm;
import X.C1323050kX9;
import X.C1339410kxX;
import X.C2188811AlT;
import X.InterfaceC1312540kGC;
import X.InterfaceC1320380kSq;
import Y.ARunnableS120S0100000_20;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class FrescoInlineImageShadowNode extends AbsInlineImageShadowNode {
    public Uri LJJJIL;
    public String LJJJJIZL;
    public boolean LJJJJJ;
    public boolean LJJJJJL;
    public int LJJJJLI;
    public C1323050kX9<?> LJJJJLL;
    public boolean LJJJJZ;
    public final C1320810kTX LJJJJI = C1322200kVm.LIZJ();
    public AbstractC1320320kSk LJJJJ = InterfaceC1320380kSq.LIZ;
    public final C1339410kxX LJJJJL = new C1339410kxX(this, 0);

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJ() {
        if (this.LJJJJJ) {
            Uri uri = null;
            if (this.LJJJJIZL != null) {
                if (!this.LJJJJJL) {
                    this.LJJJJIZL = C1294030jmL.LIZ(LJIIJJI(), this.LJJJJIZL, false);
                }
                Uri uri2 = UriProtector.parse(this.LJJJJIZL);
                if (uri2.getScheme() == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Image src should not be relative url : ");
                    sbLIZ.append(this.LJJJJIZL);
                    LynxLog.e("Lynx", C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    uri = uri2;
                }
            }
            this.LJJJIL = uri;
            this.LJJJJJ = false;
        }
        LJIILLIIL();
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJI() {
        if (this.LJJJJZ) {
            C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(this, 66));
        }
    }

    public final void LJJJJ() {
        if (this.LJJJJLL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("close reference mRef = ");
            sbLIZ.append(this.LJJJJLL.hashCode());
            LynxLog.i("FrescoInlineImageShadowNode", C2188811AlT.LIZIZ(sbLIZ));
            this.LJJJJLL.close();
            this.LJJJJLL = null;
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public final AbstractC1315450kKt LJJIL() {
        final Resources resources = LJIIJJI().getResources();
        LayoutNode layoutNode = this.LJII.LIZ;
        float fLIZLLL = layoutNode.LIZ.LIZLLL(layoutNode.LIZIZ);
        LayoutNode layoutNode2 = this.LJII.LIZ;
        float fLIZIZ = layoutNode2.LIZ.LIZIZ(layoutNode2.LIZIZ);
        LayoutNode layoutNode3 = this.LJII.LIZ;
        final int[] iArrLIZJ = layoutNode3.LIZ.LIZJ(layoutNode3.LIZIZ);
        final int iCeil = (int) Math.ceil(fLIZLLL);
        final int iCeil2 = (int) Math.ceil(fLIZIZ);
        final Uri uri = this.LJJJIL;
        final AbstractC1320320kSk abstractC1320320kSk = this.LJJJJ;
        final C1320810kTX c1320810kTX = this.LJJJJI;
        LJIIJJI();
        final C1339410kxX c1339410kxX = this.LJJJJL;
        return new AbstractC1315450kKt(resources, iCeil, iCeil2, iArrLIZJ, uri, abstractC1320320kSk, c1320810kTX, c1339410kxX) { // from class: X.0kLP
            public Drawable LLJJIII;
            public final AbstractC1320720kTO LLJJIJI;
            public final C1320770kTT<C1331070kk5> LLJJIJIIJIL;
            public final Object LLJJIJIL;
            public final C1320700kTM LLJJJ;
            public final Uri LLJJJIL;
            public final InterfaceC1320380kSq LLJJJJ;

            @Override // X.AbstractC1315450kKt
            public final void LJ() {
                this.LLJJIJIIJIL.LJFF();
            }

            @Override // X.AbstractC1315450kKt
            public final void LJFF() {
                this.LLJJIJIIJIL.LJI();
            }

            @Override // X.AbstractC1315450kKt
            public final void LJI() {
                this.LLJJIJIIJIL.LJFF();
            }

            @Override // X.AbstractC1315450kKt
            public final void LJII() {
                this.LLJJIJIIJIL.LJI();
            }

            @Override // X.AbstractC1315450kKt
            public final Drawable LIZJ() {
                return this.LLJJIII;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [REQUEST, X.0kMF] */
            @Override // X.AbstractC1315450kKt
            public final void LJIIIZ(Drawable.Callback callback) {
                Uri uri2;
                this.LLJJ = callback;
                if (callback != null && this.LLJJIII == null && (uri2 = this.LLJJJIL) != Uri.EMPTY) {
                    C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri2);
                    C1315790kLR.LIZ(c1325700kbQLIZLLL);
                    ?? c1316290kMF = new C1316290kMF(c1325700kbQLIZLLL, null);
                    AbstractC1320720kTO abstractC1320720kTO = this.LLJJIJI;
                    abstractC1320720kTO.LIZJ();
                    abstractC1320720kTO.LJIIJJI = true;
                    abstractC1320720kTO.LJIILJJIL = this.LLJJIJIIJIL.LLILZIL;
                    abstractC1320720kTO.LIZJ = this.LLJJIJIL;
                    abstractC1320720kTO.LIZLLL = c1316290kMF;
                    abstractC1320720kTO.LJIIIIZZ = this.LLJJJ;
                    this.LLJJIJIIJIL.LJIIIIZZ(abstractC1320720kTO.LIZ());
                    this.LLJJIJI.LIZJ();
                    Drawable drawableLIZLLL = this.LLJJIJIIJIL.LIZLLL();
                    this.LLJJIII = drawableLIZLLL;
                    if (drawableLIZLLL != null) {
                        drawableLIZLLL.setBounds(0, 0, this.LLIZ, this.LLILZLL);
                        this.LLJJIII.setCallback(this.LLJJ);
                        DH dh = this.LLJJIJIIJIL.LLILZ;
                        dh.getClass();
                        ((C1331070kk5) dh).LJIIZILJ(this.LLJJJJ);
                    }
                }
                if (this.LLJJIII != null) {
                    this.LLJJIII.setCallback(callback);
                }
            }

            {
                super(iCeil, iCeil2, iArrLIZJ);
                this.LLJJIJIIJIL = new C1320770kTT<>(new C1331090kk7(resources).LIZ());
                this.LLJJIJI = c1320810kTX;
                this.LLJJIJIL = null;
                this.LLJJJIL = uri == null ? Uri.EMPTY : uri;
                this.LLJJJJ = abstractC1320320kSk;
                this.LLJJJ = c1339410kxX;
            }

            @Override // X.AbstractC1315450kKt, android.text.style.ReplacementSpan
            public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                if (this.LLJJ == null) {
                    return;
                }
                super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
            }
        };
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode, com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJJLI(s sVar) {
        super.LJIJJLI(sVar);
        this.LJJJJZ = sVar.LLLI;
    }

    @InterfaceC1312540kGC(name = "loop-count")
    public void setLoopCount(int i) {
        if (i <= 0) {
            i = 0;
        }
        this.LJJJJLI = i;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public final void setMode(String str) {
        this.LJJJJ = C1316130kLz.LIZIZ(str);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "skip-redirection")
    public void setSkipRedirection(boolean z) {
        this.LJJJJJL = z;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public final void setSource(String str) {
        this.LJJJJIZL = str;
        this.LJJJJJ = true;
        LJIILLIIL();
    }
}
