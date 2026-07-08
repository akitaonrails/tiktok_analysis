package com.ss.android.ugc.aweme.feed.survey.component;

import X.C01GW;
import X.C452501pT;
import X.C742160T9i;
import X.InterfaceC1616070s9l;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.visual.survey.info.IVisualSurveyInfoService;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;

/* JADX INFO: loaded from: classes13.dex */
public final class PromptComponent extends BasePanelComponent {
    public final C01GW LL = C452501pT.LIZIZ(new C742160T9i(this));

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        final IVisualSurveyInfoService iVisualSurveyInfoService = (IVisualSurveyInfoService) ServiceManager.get().getService(IVisualSurveyInfoService.class);
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new InterfaceC1616070s9l() { // from class: X.0TIV
                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onBeforePageChange() {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageScrolledEnd(int i, float f, int i2) {
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

                /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x016f  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x016c A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onPageSelected(int r12) {
                    /*
                        Method dump skipped, instruction units count: 378
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0TIV.onPageSelected(int):void");
                }
            });
        }
    }
}
