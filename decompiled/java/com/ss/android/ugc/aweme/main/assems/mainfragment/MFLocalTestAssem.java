package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.C01GW;
import X.C1909470zmz;
import X.C1909480zn0;
import X.C19273110af;
import X.C19EG;
import X.C2138308Zh;
import X.C452501pT;
import X.C724240Sb0;
import X.InterfaceC1909500zn2;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.offline.ugc.rec.reason.debug.tool.IUgcRecReasonDebugToolService;
import com.ss.android.ugc.aweme.offline.visual.survey.info.IVisualSurveyInfoService;
import com.ss.android.ugc.aweme.service.IRegionMockService;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;

/* JADX INFO: loaded from: classes29.dex */
public final class MFLocalTestAssem extends UIContentAssem {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1909480zn0());
    public final C01GW LLJ = C452501pT.LIZIZ(new C1909470zmz(this));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        IRegionMockService iRegionMockService;
        super.onDestroy();
        if (C724240Sb0.LIZ(this) != null) {
            this.LLIZLLLIL.getValue().getClass();
            if (!C2138308Zh.LIZ() || (iRegionMockService = (IRegionMockService) ServiceManager.get().getService(IRegionMockService.class, false, false)) == null) {
                return;
            }
            iRegionMockService.LIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        InterfaceC1909500zn2 tabletService;
        super.onStart();
        LocalTestApi localTestApiLIZ = C19273110af.LIZ();
        if (localTestApiLIZ == null || (tabletService = localTestApiLIZ.getTabletService()) == null) {
            return;
        }
        this.LLJ.getValue();
        tabletService.LIZIZ();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (C724240Sb0.LIZ(this) != null) {
            Object value = this.LLIZLLLIL.getValue();
            this.LLJ.getValue();
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                IMainSAFLifecycleKt.findSAFExpLifecycleOwner(fragmentLJI, (C19EG) null);
            }
            value.getClass();
            if (C2138308Zh.LIZ()) {
                IRegionMockService iRegionMockService = (IRegionMockService) ServiceManager.get().getService(IRegionMockService.class, false, false);
                if (iRegionMockService != null) {
                    iRegionMockService.LIZIZ();
                }
                ((IVisualSurveyInfoService) ServiceManager.get().getService(IVisualSurveyInfoService.class)).LJJIJIL();
                ((IUgcRecReasonDebugToolService) ServiceManager.get().getService(IUgcRecReasonDebugToolService.class)).LIZ();
            }
        }
    }
}
