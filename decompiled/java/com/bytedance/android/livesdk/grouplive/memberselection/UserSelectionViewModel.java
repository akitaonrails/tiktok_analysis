package com.bytedance.android.livesdk.grouplive.memberselection;

import X.C1145190fuH;
import X.C1145220fuK;
import X.C1559260qg8;
import X.InterfaceC0148002o;
import com.bytedance.android.livesdk.grouplive.datachannel.GroupLiveMemberList;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class UserSelectionViewModel extends AssemViewModel<C1145220fuK> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1145190fuH.class, (Class<Object>) null, (String) 13), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1145220fuK(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        DataChannel dataChannel = ((C1145190fuH) this.LL.getValue()).LL;
        if (dataChannel != null) {
            dataChannel.EQ2(this, GroupLiveMemberList.class, new AwS596S0100000_17(this, 26));
        }
    }
}
