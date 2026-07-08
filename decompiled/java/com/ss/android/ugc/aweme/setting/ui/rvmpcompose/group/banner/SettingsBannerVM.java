package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.banner;

import X.C0C0W;
import X.C1207504nx;
import X.C13DV;
import X.C1555910qaj;
import X.C1697820uHc;
import X.C191862104e;
import X.C191871104n;
import X.C19320910iN;
import X.C2024307wP;
import X.EnumC19320810iM;
import X.InterfaceC0148002o;
import X.InterfaceC989510brB;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.banner.SettingsBannerVM;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.List;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class SettingsBannerVM extends AssemViewModel<C1555910qaj> implements LifecycleEventObserver {
    public C19320910iN LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1555910qaj(vQ2());
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C19320910iN c19320910iN = this.LL;
        if (c19320910iN != null) {
            C191871104n.LJ().getClass();
            C191862104e.LIZLLL(c19320910iN);
        }
        this.LL = null;
        super.onCleared();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean getUseCoroutines() {
        return C0C0W.LIZ();
    }

    public final List<EnumC19320810iM> vQ2() {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        if (C1207504nx.LIZ()) {
            IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
            if (iPrivacySettingAPIService == null || !iPrivacySettingAPIService.LJIJJLI()) {
                IPrivacySettingAPIService iPrivacySettingAPIService2 = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
                if (iPrivacySettingAPIService2 == null || !iPrivacySettingAPIService2.LJIIL()) {
                    IPrivacyService iPrivacyService = (IPrivacyService) PluggableExtentionKt.pluggableSpi$default(IPrivacyService.class, false, false, false, 14, null);
                    if (iPrivacyService != null && iPrivacyService.LJII()) {
                        c13dvLIZIZ.add(EnumC19320810iM.PAUSE_INTERACTIONS_BANNER);
                    }
                } else {
                    c13dvLIZIZ.add(EnumC19320810iM.AGE_GRAD_BANNER);
                }
            } else {
                c13dvLIZIZ.add(EnumC19320810iM.AGE_DOWN_BANNER);
            }
        }
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0brB, X.10iN] */
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = C2024307wP.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C19320910iN c19320910iN = this.LL;
                if (c19320910iN != null) {
                    C191871104n.LJ().getClass();
                    C191862104e.LIZLLL(c19320910iN);
                }
                this.LL = null;
                return;
            }
            return;
        }
        if (this.LL != null) {
            return;
        }
        ?? r1 = new InterfaceC989510brB<PrivacyUserSettingsV2>() { // from class: X.10iN
            @Override // X.InterfaceC989510brB
            public final void LLZZLLIL(PrivacyUserSettingsV2 privacyUserSettingsV2) {
                SettingsBannerVM settingsBannerVM = this.LL;
                settingsBannerVM.getClass();
                settingsBannerVM.setState(new AwS607S0100000_28(settingsBannerVM, 317));
            }
        };
        this.LL = r1;
        C191871104n.LJ().getClass();
        C191862104e.LIZJ(r1);
    }
}
