package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.banner.cell;

import X.C1701540uNc;
import X.C1701550uNd;
import X.InterfaceC0148002o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public final class AgeDownBannerVM extends BaseCellSettingsVM<C1701540uNc> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C1701550uNd c1701550uNdLJIIJ;
        IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
        return (iPrivacySettingAPIService == null || (c1701550uNdLJIIJ = iPrivacySettingAPIService.LJIIJ()) == null) ? new C1701540uNc((Function1) null, (Function1) null, (Function1) null, (Function1) null, 31) : new C1701540uNc(c1701550uNdLJIIJ.LIZ, c1701550uNdLJIIJ.LIZIZ, c1701550uNdLJIIJ.LIZJ, c1701550uNdLJIIJ.LIZLLL, 16);
    }
}
