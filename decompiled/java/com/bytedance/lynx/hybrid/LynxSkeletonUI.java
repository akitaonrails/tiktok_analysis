package com.bytedance.lynx.hybrid;

import X.C0VSJ;
import X.C1311730kEt;
import X.C1490740otc;
import X.C1520080pew;
import X.C1537710q7N;
import X.C21405218pm;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.LynxUI;
import j27.s;

/* JADX INFO: loaded from: classes33.dex */
public final class LynxSkeletonUI extends LynxUI<C21405218pm> {
    public C21405218pm LL;

    public LynxSkeletonUI(s sVar) {
        super(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(C1311730kEt c1311730kEt) {
        super.afterPropsUpdated(c1311730kEt);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1537710q7N) this.mContext.LJIILJJIL()).getHybridContext().resourcePath);
        C21405218pm c21405218pm = this.LL;
        C21405218pm c21405218pm2 = null;
        if (c21405218pm == null) {
            c21405218pm = null;
        }
        sbLIZ.append(c21405218pm.getSrc());
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.exists()) {
            C21405218pm c21405218pm3 = this.LL;
            if (c21405218pm3 != null) {
                c21405218pm2 = c21405218pm3;
            }
            c21405218pm2.LIZ(c0vsj);
            C786410Ut5.LLJILJILJ(c21405218pm2, 0);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        C1490740otc.LIZIZ(C1490740otc.LIZ, "create view", null, "LynxSkeletonUI", 2);
        this.LL = new C21405218pm(context);
        C1520080pew.LJFF(((C1537710q7N) this.mContext.LJIILJJIL()).getHybridContext().containerId, "lynx_skeleton", "use", null, ((C1537710q7N) this.mContext.LJIILJJIL()).getHybridContext().LJIJI(), ((C1537710q7N) this.mContext.LJIILJJIL()).getHybridContext().bid, null, null, 200);
        C21405218pm c21405218pm = this.LL;
        if (c21405218pm == null) {
            return null;
        }
        return c21405218pm;
    }

    @InterfaceC1312540kGC(name = "duration")
    public void setDuration(int i) {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("duration: ");
        sbLIZ.append(i);
        C21405218pm c21405218pm = null;
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "LynxSkeletonUI", 2);
        C21405218pm c21405218pm2 = this.LL;
        if (c21405218pm2 != null) {
            c21405218pm = c21405218pm2;
        }
        c21405218pm.setDuration(Long.valueOf(i));
    }

    @InterfaceC1312540kGC(name = "fromalpha")
    public void setFromAlpha(float f) {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fromalpha: ");
        sbLIZ.append(f);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C21405218pm c21405218pm = null;
        C1490740otc.LIZIZ(c1490740otc, strLIZIZ, null, "LynxSkeletonUI", 2);
        C21405218pm c21405218pm2 = this.LL;
        if (c21405218pm2 != null) {
            c21405218pm = c21405218pm2;
        }
        c21405218pm.setFromAlpha(Float.valueOf(f));
    }

    @InterfaceC1312540kGC(name = "hasanimation")
    public void setHasAnimation(boolean z) {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasanimation: ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C21405218pm c21405218pm = null;
        C1490740otc.LIZIZ(c1490740otc, strLIZIZ, null, "LynxSkeletonUI", 2);
        C21405218pm c21405218pm2 = this.LL;
        if (c21405218pm2 != null) {
            c21405218pm = c21405218pm2;
        }
        c21405218pm.setHasAnimation(z);
    }

    @InterfaceC1312540kGC(name = "src")
    public void setSrc(String str) {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("src: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C21405218pm c21405218pm = null;
        C1490740otc.LIZIZ(c1490740otc, strLIZIZ, null, "LynxSkeletonUI", 2);
        C21405218pm c21405218pm2 = this.LL;
        if (c21405218pm2 != null) {
            c21405218pm = c21405218pm2;
        }
        c21405218pm.setSrc(str);
    }

    @InterfaceC1312540kGC(name = "toalpha")
    public void setToAlpha(float f) {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toalpha: ");
        sbLIZ.append(f);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C21405218pm c21405218pm = null;
        C1490740otc.LIZIZ(c1490740otc, strLIZIZ, null, "LynxSkeletonUI", 2);
        C21405218pm c21405218pm2 = this.LL;
        if (c21405218pm2 != null) {
            c21405218pm = c21405218pm2;
        }
        c21405218pm.setToAlpha(Float.valueOf(f));
    }
}
