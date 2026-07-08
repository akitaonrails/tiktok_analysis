package com.ss.android.ugc.aweme.homepage.ui.view.tab.top.xtab;

import X.C00YR;
import X.C0SZ8;
import X.C1591500rW8;
import X.C1591510rW9;
import X.C19EG;
import X.C343710Ddh;
import X.InterfaceC1586360rNq;
import X.InterfaceC1616070s9l;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.SelectedTabBackToOriginAbility;

/* JADX INFO: loaded from: classes25.dex */
public final class XTabPanelController implements IXTabPanelAbility, InterfaceC1586360rNq, InterfaceC1616070s9l, SelectedTabBackToOriginAbility {
    public final C19EG LL;
    public Fragment LLILLJJLI;
    public C1591510rW9 LLILLL;
    public C1591500rW8 LLILZ;

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility
    public final int Ke() {
        return 0;
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    public final void LIZ() {
        C1591510rW9 c1591510rW9 = this.LLILLL;
        if (c1591510rW9 != null) {
            c1591510rW9.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility
    public final void Da0() {
        LIZ();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.SelectedTabBackToOriginAbility
    public final void Hb0() {
        LIZ();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility
    public final C00YR S4() {
        return C00YR.HIDE;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.SelectedTabBackToOriginAbility
    public final void hX() {
        LIZ();
    }

    public XTabPanelController(C19EG c19eg) {
        this.LL = c19eg;
        C343710Ddh.LIZ(c19eg).wQ2(this);
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        LIZ();
    }

    @Override // X.InterfaceC1586360rNq
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        LIZ();
    }
}
