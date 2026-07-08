package com.ss.android.ugc.aweme.base.fragment;

import X.C2188811AlT;
import X.InterfaceC1581960rGk;
import X.InterfaceC744180THc;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import com.ss.android.ugc.common.component.fragment.ComponentFragment;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public abstract class AmeBaseFragment extends ComponentFragment implements InterfaceC744180THc {
    public long destroyTime;
    public boolean isCommerce;

    @Override // X.InterfaceC744180THc
    public Analysis getAnalysis() {
        return null;
    }

    public boolean isRegisterEventBus() {
        return false;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment
    public SparseArray<InterfaceC1581960rGk> registerComponents() {
        return new SparseArray<>();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.destroyTime = System.currentTimeMillis();
        super.onDestroy();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (isRegisterEventBus() && eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJJI(this);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ICrashlyticsWrapperService iCrashlyticsWrapperServiceLIZLLL = CrashlyticsWrapperService.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current page：");
        sbLIZ.append(getClass().getSimpleName());
        iCrashlyticsWrapperServiceLIZLLL.log(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (!eventBusLIZLLL.LJIIJ(this) && isRegisterEventBus()) {
            eventBusLIZLLL.LJIJJ(this);
        }
    }
}
