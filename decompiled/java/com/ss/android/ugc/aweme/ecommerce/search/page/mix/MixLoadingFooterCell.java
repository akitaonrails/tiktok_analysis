package com.ss.android.ugc.aweme.ecommerce.search.page.mix;

import X.C1396605dM;
import X.C675270QeD;
import X.C675280QeE;
import X.C675290QeF;
import X.C678430QjJ;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.ecommerce.arch.MixAssemPowerCell;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;

/* JADX INFO: loaded from: classes11.dex */
public final class MixLoadingFooterCell extends MixAssemPowerCell<MixLoadingFooterAssem, C678430QjJ> {
    public MixLoadingFooterAssem LLJ;

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        MixLoadingFooterAssem mixLoadingFooterAssem = new MixLoadingFooterAssem();
        this.LLJ = mixLoadingFooterAssem;
        return mixLoadingFooterAssem;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.arch.MixAssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        Integer numValueOf;
        super.onViewAttachedToWindow();
        C675290QeF c675290QeF = C675280QeE.LIZIZ;
        if (c675290QeF != null) {
            c675290QeF.LJFF = System.currentTimeMillis();
        }
        MixLoadingFooterAssem mixLoadingFooterAssem = this.LLJ;
        if (mixLoadingFooterAssem != null) {
            mixLoadingFooterAssem.sp();
        }
        C1396605dM c1396605dM = ((MixPageViewModel) this.LLIZ.getValue()).LLILZ;
        if (c1396605dM == null) {
            c1396605dM = null;
        }
        C675270QeD c675270QeD = c1396605dM.LIZLLL.LJI;
        if (c675270QeD != null && (numValueOf = Integer.valueOf(c675270QeD.hashCode())) != null) {
            C675290QeF c675290QeFLIZIZ = C675280QeE.LIZIZ(numValueOf.intValue());
            if (c675290QeFLIZIZ != null) {
                c675290QeFLIZIZ.LJFF = System.currentTimeMillis();
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C675280QeE.LIZJ = jCurrentTimeMillis;
        C675290QeF c675290QeF2 = C675280QeE.LIZIZ;
        if (c675290QeF2 != null) {
            c675290QeF2.LJFF = jCurrentTimeMillis;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        Integer numValueOf;
        super.onViewDetachedFromWindow();
        C1396605dM c1396605dM = ((MixPageViewModel) this.LLIZ.getValue()).LLILZ;
        if (c1396605dM == null) {
            c1396605dM = null;
        }
        C675270QeD c675270QeD = c1396605dM.LIZLLL.LJI;
        if (c675270QeD == null || (numValueOf = Integer.valueOf(c675270QeD.hashCode())) == null) {
            C675290QeF c675290QeF = C675280QeE.LIZIZ;
            if (c675290QeF != null) {
                c675290QeF.LJI = System.currentTimeMillis();
                return;
            }
            return;
        }
        C675290QeF c675290QeFLIZIZ = C675280QeE.LIZIZ(numValueOf.intValue());
        if (c675290QeFLIZIZ != null) {
            c675290QeFLIZIZ.LJI = System.currentTimeMillis();
        }
        C675280QeE.LIZ(numValueOf.intValue(), Boolean.FALSE);
    }
}
