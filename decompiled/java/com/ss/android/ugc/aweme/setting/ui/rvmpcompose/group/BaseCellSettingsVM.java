package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group;

import X.C0C0W;
import X.InterfaceC0148002o;
import androidx.lifecycle.LifecycleEventObserver;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseCellSettingsVM<T extends InterfaceC0148002o> extends AssemViewModel<T> implements LifecycleEventObserver {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean getUseCoroutines() {
        return C0C0W.LIZ();
    }
}
