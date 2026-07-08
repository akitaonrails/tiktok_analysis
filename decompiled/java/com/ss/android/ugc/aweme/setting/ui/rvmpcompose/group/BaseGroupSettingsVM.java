package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group;

import X.AbstractC1556640qbu;
import X.C0C0W;
import X.InterfaceC0148002o;
import X.InterfaceC19211810Ea;
import X.InterfaceC19321010iO;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleEventObserver;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseGroupSettingsVM<T extends InterfaceC19211810Ea, E extends AbstractC1556640qbu<T>> extends AssemViewModel<E> implements LifecycleEventObserver {
    public abstract BaseCellSettingsVM<? extends InterfaceC0148002o> vQ2(Fragment fragment, T t);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean getUseCoroutines() {
        return C0C0W.LIZ();
    }

    public final List<InterfaceC19321010iO> wQ2(Fragment fragment) {
        InterfaceC0148002o state;
        ArrayList arrayList = new ArrayList();
        for (T t : getState().getItems()) {
            BaseCellSettingsVM<? extends InterfaceC0148002o> baseCellSettingsVMVQ2 = vQ2(fragment, t);
            if (baseCellSettingsVMVQ2 != null) {
                state = baseCellSettingsVMVQ2.getState();
            } else {
                state = null;
            }
            if (state instanceof InterfaceC19321010iO) {
                InterfaceC19321010iO interfaceC19321010iO = (InterfaceC19321010iO) state;
                String key = interfaceC19321010iO.getKey();
                if (key == null) {
                    key = t.getIdentifier();
                }
                interfaceC19321010iO.setKey(key);
                arrayList.add(state);
            }
        }
        return arrayList;
    }
}
