package com.ss.android.ugc.aweme.feed.assem.container;

import X.C0HCN;
import X.C0SXF;
import X.C19252910Tv;
import X.C19EG;
import X.C2277711EDh;
import X.C695370RPj;
import X.C695520RPy;
import X.C731160SmA;
import X.C731250SmJ;
import X.C731260SmK;
import X.C732110Snh;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;

/* JADX INFO: loaded from: classes12.dex */
public final class RightAreaContainerVM extends FeedRightBtnBaseViewModel<C695520RPy> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C731160SmA c731160SmAWQ2 = wQ2(null);
        C731160SmA c731160SmAVQ2 = vQ2(null);
        updateOrigin(0);
        return new C695520RPy(c731160SmAWQ2, c731160SmAVQ2, getForceTextVisible());
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel
    public final void onForceHideTextFlagChange() {
        setState(new C731250SmJ(this));
    }

    public final C731160SmA vQ2(C19EG c19eg) {
        Aweme aweme;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LJIJ()) {
            C731260SmK c731260SmKLJJIIJ = c19252910Tv.LIZLLL().LJIJI().LJJL().LJJIIJ(53.0f, 0.0f, 5.5f, 8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, true);
            float f = c731260SmKLJJIIJ.LIZ;
            float f2 = c731260SmKLJJIIJ.LIZIZ;
            float f3 = c731260SmKLJJIIJ.LJ;
            float f4 = c731260SmKLJJIIJ.LJI;
            return new C731160SmA(f, f2, c731260SmKLJJIIJ.LIZJ, c731260SmKLJJIIJ.LIZLLL, f3, c731260SmKLJJIIJ.LJFF, false, 0.0f, 0.0f, 0.0f, f4, false, 15296);
        }
        if (c19eg != null && C0SXF.LJIL(c19eg)) {
            C695370RPj c695370RPj = C695370RPj.LIZ;
            VideoItemParams item = getItem();
            if (item != null) {
                aweme = item.getAweme();
            } else {
                aweme = null;
            }
            c695370RPj.getClass();
            if (C695370RPj.LIZ(aweme).LIZJ()) {
                if (C0HCN.LIZIZ()) {
                    return new C731160SmA(40.0f, 40.0f, 0.0f, 0.0f, 0.0f, -4.5f, true, 0.0f, 0.0f, 0.0f, 0.0f, false, 16260);
                }
                return new C731160SmA(40.0f, 40.0f, 0.0f, 0.0f, 0.0f, -4.5f, false, 0.0f, 0.0f, 0.0f, 0.0f, false, 16260);
            }
            if (C0HCN.LIZIZ()) {
                return new C731160SmA(40.0f, 40.0f, 0.0f, 12.0f, 0.0f, -4.5f, true, 0.0f, 0.0f, 0.0f, 0.0f, false, 16260);
            }
            return new C731160SmA(44.0f, 44.0f, 0.0f, 12.0f, 0.0f, -4.5f, false, 0.0f, 0.0f, 0.0f, 0.0f, false, 16260);
        }
        if (!C0HCN.LIZJ() && !LowScreenOptimizeAB.LIZIZ()) {
            int i = C732110Snh.LIZ;
            return new C731160SmA(60.0f, 44.0f, 0.0f, 0.0f, 10.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, false, 16332);
        }
        int i2 = C732110Snh.LIZ;
        return new C731160SmA(52.0f, 40.0f, 0.0f, 0.0f, 2.0f, 0.0f, true, 0.0f, 0.0f, 0.0f, 0.0f, LowScreenOptimizeAB.LIZIZ(), 8068);
    }

    public final C731160SmA wQ2(C19EG c19eg) {
        Aweme aweme;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LJIJ()) {
            C731260SmK c731260SmKLJJIIJ = c19252910Tv.LIZLLL().LJIJI().LJJL().LJJIIJ(50.0f, 0.0f, 6.0f, 13.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
            return new C731160SmA(c731260SmKLJJIIJ.LIZ, c731260SmKLJJIIJ.LIZIZ, 0.0f, 0.0f, c731260SmKLJJIIJ.LJ, c731260SmKLJJIIJ.LJFF, false, c731260SmKLJJIIJ.LJII, c731260SmKLJJIIJ.LJIIIIZZ, c731260SmKLJJIIJ.LJIIIZ, c731260SmKLJJIIJ.LJI, false, 14412);
        }
        if (c19eg != null && C0SXF.LJIL(c19eg)) {
            C695370RPj c695370RPj = C695370RPj.LIZ;
            VideoItemParams item = getItem();
            if (item != null) {
                aweme = item.getAweme();
            } else {
                aweme = null;
            }
            c695370RPj.getClass();
            if (C695370RPj.LIZ(aweme).LIZJ()) {
                if (C0HCN.LIZIZ()) {
                    return new C731160SmA(30.0f, 28.0f, 0.0f, 0.0f, 0.0f, -3.5f, true, 0.0f, 0.0f, 0.0f, 0.0f, false, 16264);
                }
                return new C731160SmA(44.0f, 32.0f, 0.0f, 0.0f, 0.0f, -4.5f, false, 0.0f, 0.0f, 0.0f, 0.0f, false, 16264);
            }
            return new C731160SmA(44.0f, 24.0f, 24.0f, 0.0f, 0.0f, -8.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, false, 16264);
        }
        if (!C0HCN.LIZJ() && !LowScreenOptimizeAB.LIZIZ()) {
            int i = C732110Snh.LIZ;
            float f = (60 - 45.0f) / 2.0f;
            float fLJIJJLI = C2277711EDh.LIZIZ.LJIJJLI();
            if (fLJIJJLI <= 0.0f) {
                fLJIJJLI = 32.0f;
            }
            float f2 = f - 0.0f;
            C732110Snh.LIZIZ();
            return new C731160SmA(45.0f, fLJIJJLI, 0.0f, 0.0f, 4.0f, -5.0f, false, f2 - 0, f2, 0.0f, 0.0f, false, 15936);
        }
        int i2 = C732110Snh.LIZ;
        float fLJIJJLI2 = C2277711EDh.LIZIZ.LJIJJLI();
        if (fLJIJJLI2 <= 0.0f) {
            fLJIJJLI2 = 32.0f;
        }
        float f3 = (52 - 45.0f) / 2.0f;
        C732110Snh.LIZIZ();
        return new C731160SmA(45.0f, fLJIJJLI2, 0.0f, 0.0f, 0.0f, -9.0f, true, f3 - 0, f3, 0.0f, 0.0f, LowScreenOptimizeAB.LIZIZ(), 7692);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o paramSync2StateAccept(X.InterfaceC0148002o r10, com.ss.android.ugc.aweme.feed.model.VideoItemParams r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM.paramSync2StateAccept(X.002o, com.ss.android.ugc.aweme.feed.model.VideoItemParams):X.002o");
    }
}
