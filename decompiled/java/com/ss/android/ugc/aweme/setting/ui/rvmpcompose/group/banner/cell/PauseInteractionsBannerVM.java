package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.banner.cell;

import X.C1701550uNd;
import X.C1701560uNe;
import X.InterfaceC0148002o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;

/* JADX INFO: loaded from: classes27.dex */
public final class PauseInteractionsBannerVM extends BaseCellSettingsVM<C1701560uNe> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C1701550uNd c1701550uNdLJIILIIL;
        IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
        return (iPrivacySettingAPIService == null || (c1701550uNdLJIILIIL = iPrivacySettingAPIService.LJIILIIL()) == null) ? new C1701560uNe(0) : new C1701560uNe(c1701550uNdLJIILIIL.LIZ, c1701550uNdLJIILIIL.LIZIZ, c1701550uNdLJIILIIL.LIZJ);
    }
}
