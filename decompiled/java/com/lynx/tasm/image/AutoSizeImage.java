package com.lynx.tasm.image;

import X.C786410Ut5;
import X.InterfaceC1300000jvy;
import X.InterfaceC1312540kGC;
import Y.ARunnableS1S0114000_20;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class AutoSizeImage extends ShadowNode implements InterfaceC1300000jvy {
    public boolean LJIJJLI;
    public boolean LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public BPEAHandler LJJIIJ;
    public ARunnableS1S0114000_20 LJJIIJZLJL;
    public String LJJIIZ;
    public boolean LJJIII = true;
    public final Object LJJIIZI = new Object();

    public AutoSizeImage() {
        LJII(this);
    }

    @InterfaceC1312540kGC(name = "src")
    public void setSrc(String str) {
        this.LJJIIZ = str;
        this.LJJI = 0;
        this.LJJ = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0111  */
    @Override // X.InterfaceC1300000jvy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZLLL(com.lynx.tasm.behavior.shadow.LayoutNode r9, float r10, X.EnumC1300260jwO r11, float r12, X.EnumC1300260jwO r13) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.image.AutoSizeImage.LIZLLL(com.lynx.tasm.behavior.shadow.LayoutNode, float, X.0jwO, float, X.0jwO):long");
    }

    public final void LJJIII(int i, int i2, int i3, int i4, boolean z) {
        boolean z2 = this.LJIJJLI;
        this.LJIJJLI = z;
        this.LJJIFFI = i;
        this.LJJII = i2;
        if (i == this.LJJ && i2 == this.LJJI) {
            return;
        }
        s sVar = this.LJIIL;
        if (sVar != null && sVar.LJIJI() && this.LJIL) {
            return;
        }
        if (z2 != z) {
            LJIILLIIL();
            return;
        }
        if (!this.LJJIII && z && i > 0 && i2 > 0) {
            if (i3 == 0 || i4 == 0 || Math.abs((i3 / i4) - (i / i2)) > 0.05d) {
                LJIILLIIL();
            }
        }
    }

    public final void LJJIIJ(int i, int i2, int i3, int i4, boolean z) {
        synchronized (this.LJJIIZI) {
            try {
                BPEAHandler bPEAHandler = this.LJJIIJ;
                if (bPEAHandler == null) {
                    this.LJJIIJZLJL = new ARunnableS1S0114000_20(this, z, i, i2, i3, i4, 0);
                } else {
                    C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS1S0114000_20(this, z, i, i2, i3, i4, 1));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
