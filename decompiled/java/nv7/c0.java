package nv7;

import X.C07NA;
import X.C0CHQ;
import X.C1462920oAk;
import X.C1660590tJZ;
import X.C201955140j;
import X.C2188811AlT;
import X.C366700EZg;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1674890tgd;
import android.app.Application;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes26.dex */
public final class c0 implements InterfaceC1674890tgd {
    public static final c0 LIZ = new c0();
    public static final Keva LIZIZ;
    public static final Application LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static final C1660590tJZ LJFF;

    public static boolean LJI(int i, int i2, int i3, int i4) {
        return i * i4 <= i2 * i3;
    }

    public final int LIZ() {
        int i;
        synchronized (this) {
            i = LIZIZ.getInt("key_adapt_plan", 0);
        }
        return i;
    }

    @Override // X.InterfaceC1674890tgd
    public final synchronized int o2() {
        return LIZIZ.getInt("key_navibar_height", -1);
    }

    static {
        Keva repo = Keva.getRepo("screen_adpat_plan_repo");
        LIZIZ = repo;
        LIZJ = C0CHQ.LIZ;
        LJFF = C1462920oAk.LJ() ? new C1660590tJZ(repo) : null;
    }

    public final int LIZJ() {
        int i = LIZIZ.getInt("key_display_height", 0);
        if (i > 0) {
            return i;
        }
        C201955140j.LJ("NewAVScreenAdaptPresenter: getDisplayHeight failed");
        return LIZIZ();
    }

    public final int LJFF() {
        int statusBarHeight = ScreenUtils.getStatusBarHeight(LIZJ);
        if (LJII()) {
            return statusBarHeight;
        }
        return 0;
    }

    public final boolean LJII() {
        C1660590tJZ c1660590tJZ = LJFF;
        return (c1660590tJZ != null && LIZLLL && C1462920oAk.LIZLLL()) ? (c1660590tJZ.LIZLLL() == 0 || c1660590tJZ.LIZLLL() == 2 || c1660590tJZ.LIZLLL() == 4) ? false : true : C07NA.LIZ.contains(Integer.valueOf(LIZ()));
    }

    public final boolean LJIIIIZZ() {
        C1660590tJZ c1660590tJZ = LJFF;
        return (c1660590tJZ != null && LIZLLL && C1462920oAk.LIZLLL()) ? (c1660590tJZ.LIZLLL() == 0 || c1660590tJZ.LIZLLL() == 1) ? false : true : C07NA.LIZIZ.contains(Integer.valueOf(LIZ()));
    }

    @Override // X.InterfaceC1674890tgd
    public final int LLJJJJLIIL() {
        int i = LIZIZ.getInt("key_margin_bottom", -1);
        if (i >= 0) {
            return i;
        }
        C201955140j.LJ("NewAVScreenAdaptPresenter: getBottomMargin failed");
        return 0;
    }

    @Override // X.InterfaceC1674890tgd
    public final int n2() {
        int i = LIZIZ.getInt("key_margin_top", -1);
        if (i >= 0) {
            return i;
        }
        C201955140j.LJ("NewAVScreenAdaptPresenter: getTopMargin failed");
        return 0;
    }

    @Override // X.InterfaceC1674890tgd
    public final int p2() {
        return (LJFF != null && LIZLLL && C1462920oAk.LIZLLL()) ? C1660590tJZ.LJFF() : LIZJ.getResources().getDimensionPixelSize(R.dimen.m4);
    }

    @Override // X.InterfaceC1674890tgd
    public final boolean r2() {
        C1660590tJZ c1660590tJZ = LJFF;
        return (c1660590tJZ != null && LIZLLL && C1462920oAk.LIZLLL()) ? c1660590tJZ.LJI() : LJII();
    }

    public final int LIZIZ() {
        int iP2 = p2();
        Application application = LIZJ;
        int statusBarHeight = ScreenUtils.getStatusBarHeight(application);
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(application) - o2();
        if (LJII()) {
            fullScreenHeight -= statusBarHeight;
        }
        return LJIIIIZZ() ? fullScreenHeight - iP2 : fullScreenHeight;
    }

    public final void LJIIJ(int i) {
        Keva keva = LIZIZ;
        int i2 = keva.getInt("key_full_screen_width", -1);
        int i3 = keva.getInt("key_full_screen_height", -1);
        Application application = LIZJ;
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(application);
        int screenWidth = ScreenUtils.getScreenWidth(application);
        if (i == o2() && fullScreenHeight == i3 && screenWidth == i2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewAVScreenAdaptPresenter-recalculatePlanIfNeeded: recalculate plan,naviheight:");
        sbLIZ.append(i);
        sbLIZ.append(" new width:");
        sbLIZ.append(screenWidth);
        sbLIZ.append(" new height:");
        sbLIZ.append(fullScreenHeight);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        LIZ.s2(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    @Override // X.InterfaceC1674890tgd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void s2(int r11) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nv7.c0.s2(int):void");
    }

    public static boolean LJIIIZ(int i, int i2) {
        if (i2 * 9 < i * 16 && Math.abs((((double) i2) / ((double) i)) - ((double) 1.7777778f)) >= 0.1d) {
            return false;
        }
        return true;
    }

    public final FrameLayout.LayoutParams LIZLLL(int i, int i2) {
        C1660590tJZ c1660590tJZ;
        int iLIZIZ;
        int i3;
        int iLIZIZ2;
        if (!LJIIIZ(i, i2) || !C1462920oAk.LIZLLL() || (c1660590tJZ = LJFF) == null) {
            return null;
        }
        int iLIZLLL = c1660590tJZ.LIZLLL();
        Application application = LIZJ;
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(application);
        int screenWidth = ScreenUtils.getScreenWidth(application);
        int screenWidth2 = (ScreenUtils.getScreenWidth(application) * 16) / 9;
        int iO2 = o2();
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (iLIZLLL == 0) {
            int i4 = fullScreenHeight - iO2;
            layoutParams.height = i4;
            layoutParams.width = (i4 * 9) / 16;
        } else {
            layoutParams.width = screenWidth;
            layoutParams.height = screenWidth2;
            if (iLIZLLL != 1) {
                if (iLIZLLL != 3) {
                    if (iLIZLLL != 5) {
                        if (iLIZLLL == 6) {
                            iLIZIZ2 = (((fullScreenHeight - iLIZIZ3) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - layoutParams.height) / 2;
                        }
                    } else {
                        iLIZIZ2 = (((fullScreenHeight - iLIZIZ3) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - layoutParams.height) / 2;
                    }
                    layoutParams.topMargin = iLIZIZ2;
                    layoutParams.bottomMargin = (fullScreenHeight - iLIZIZ2) - layoutParams.height;
                    int i5 = (screenWidth - layoutParams.width) / 2;
                    layoutParams.leftMargin = i5;
                    layoutParams.setMarginStart(i5);
                    return layoutParams;
                }
                iLIZIZ = ((fullScreenHeight - iO2) - iLIZIZ3) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                i3 = layoutParams.height;
            } else {
                iLIZIZ = fullScreenHeight - iO2;
                i3 = layoutParams.height;
            }
            iLIZIZ2 = iLIZIZ - i3;
            layoutParams.topMargin = iLIZIZ2;
            layoutParams.bottomMargin = (fullScreenHeight - iLIZIZ2) - layoutParams.height;
            int i52 = (screenWidth - layoutParams.width) / 2;
            layoutParams.leftMargin = i52;
            layoutParams.setMarginStart(i52);
            return layoutParams;
        }
        iLIZIZ2 = 0;
        layoutParams.topMargin = iLIZIZ2;
        layoutParams.bottomMargin = (fullScreenHeight - iLIZIZ2) - layoutParams.height;
        int i522 = (screenWidth - layoutParams.width) / 2;
        layoutParams.leftMargin = i522;
        layoutParams.setMarginStart(i522);
        return layoutParams;
    }

    public final FrameLayout.LayoutParams LJ(int i, int i2) {
        int iCeil;
        int iCeil2;
        int iLJFF;
        int i3;
        C1660590tJZ c1660590tJZ;
        if (LJIIIZ(i, i2) && C1462920oAk.LIZLLL() && (c1660590tJZ = LJFF) != null) {
            return c1660590tJZ.LJ(LIZJ);
        }
        Application application = LIZJ;
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(application);
        int iLIZIZ = LIZIZ();
        int screenWidth = ScreenUtils.getScreenWidth(application);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewAVScreenAdaptPresenter-available w:");
        sbLIZ.append(screenWidth);
        sbLIZ.append(" h");
        sbLIZ.append(iLIZIZ);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (LJI(iLIZIZ, screenWidth, i2, i)) {
            iCeil2 = (int) Math.ceil(((iLIZIZ * 1.0f) * i) / i2);
            iCeil = iLIZIZ;
        } else {
            iCeil = (int) Math.ceil(((screenWidth * 1.0f) * i2) / i);
            iCeil2 = screenWidth;
        }
        layoutParams.height = iCeil;
        layoutParams.width = iCeil2;
        int iLJFF2 = 0;
        if (i == i2) {
            int statusBarHeight = ScreenUtils.getStatusBarHeight(application);
            int iLIZ = ((((fullScreenHeight - statusBarHeight) - C366700EZg.LIZ(14.0d)) - iCeil) - p2()) - C366700EZg.LIZ(120.0d);
            iLJFF = statusBarHeight + C366700EZg.LIZ(14.0d);
            i3 = iLIZ / 2;
        } else {
            if (!LJIIIIZZ() || LJII() || LIZ() == 9) {
                if ((LJIIIIZZ() || !LJII()) && LIZ() != 9) {
                    iLJFF = LJFF();
                    i3 = (iLIZIZ - iCeil) / 2;
                } else {
                    iLJFF2 = (LJFF() + iLIZIZ) - iCeil;
                }
            }
            layoutParams.topMargin = iLJFF2;
            int i4 = (screenWidth - iCeil2) / 2;
            layoutParams.leftMargin = i4;
            layoutParams.setMarginStart(i4);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("NewAVScreenAdaptPresenter-resetSurfaceSize: surfaceView height:");
            sbLIZ2.append(layoutParams.height);
            sbLIZ2.append(", width:");
            sbLIZ2.append(layoutParams.width);
            sbLIZ2.append(",plan=");
            sbLIZ2.append(LIZ());
            sbLIZ2.append(" videoWidth：");
            sbLIZ2.append(i);
            sbLIZ2.append(" x ");
            sbLIZ2.append(i2);
            sbLIZ2.append(", topMargin=");
            sbLIZ2.append(layoutParams.topMargin);
            sbLIZ2.append(",, bottomMargin=");
            sbLIZ2.append((fullScreenHeight - layoutParams.topMargin) - iCeil);
            sbLIZ2.append("marginleft:");
            sbLIZ2.append(layoutParams.leftMargin);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return layoutParams;
        }
        iLJFF2 = iLJFF + i3;
        layoutParams.topMargin = iLJFF2;
        int i42 = (screenWidth - iCeil2) / 2;
        layoutParams.leftMargin = i42;
        layoutParams.setMarginStart(i42);
        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
        sbLIZ22.append("NewAVScreenAdaptPresenter-resetSurfaceSize: surfaceView height:");
        sbLIZ22.append(layoutParams.height);
        sbLIZ22.append(", width:");
        sbLIZ22.append(layoutParams.width);
        sbLIZ22.append(",plan=");
        sbLIZ22.append(LIZ());
        sbLIZ22.append(" videoWidth：");
        sbLIZ22.append(i);
        sbLIZ22.append(" x ");
        sbLIZ22.append(i2);
        sbLIZ22.append(", topMargin=");
        sbLIZ22.append(layoutParams.topMargin);
        sbLIZ22.append(",, bottomMargin=");
        sbLIZ22.append((fullScreenHeight - layoutParams.topMargin) - iCeil);
        sbLIZ22.append("marginleft:");
        sbLIZ22.append(layoutParams.leftMargin);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ22));
        return layoutParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021a  */
    @Override // X.InterfaceC1674890tgd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.FrameLayout.LayoutParams t2(int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nv7.c0.t2(int, int):android.widget.FrameLayout$LayoutParams");
    }

    @Override // X.InterfaceC1674890tgd
    public final void q2(int i, int i2, View view) {
        if (view != null && i != 0 && i2 != 0) {
            C786410Ut5.W5(view, t2(i, i2));
        }
    }
}
