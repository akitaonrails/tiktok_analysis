package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.banner.cell;

import X.C1701540uNc;
import X.C2026307wj;
import X.InterfaceC0148002o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class AgeGradBannerVM extends BaseCellSettingsVM<C1701540uNc> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1701540uNc((Function1) null, (Function1) null, (Function1) null, (Function1) null, 31);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        IPrivacySettingAPIService iPrivacySettingAPIService;
        if (C2026307wj.LIZ[event.ordinal()] == 1 && (iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null)) != null) {
            iPrivacySettingAPIService.LJIILJJIL(new AwS605S0100000_26(this, 416));
        }
    }
}
