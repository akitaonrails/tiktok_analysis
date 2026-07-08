package com.bytedance.android.livesdk.grouplive.assem.icyclash;

import X.C001A;
import X.C019D;
import X.C019M;
import X.C1559260qg8;
import X.C5183020f;
import X.C776250Uch;
import X.InterfaceC0148002o;
import com.bytedance.android.livesdk.model.message.CompetitionMessage;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes.dex */
public final class GroupLiveIcyClashViewModel extends AssemViewModel<C019M> implements OnMessageListener {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C019D.class, (Class<Object>) null, (String) 13), true);
    public DataChannel LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C019M(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        IMessageManager iMessageManager;
        super.onCleared();
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.removeMessageListener(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        IMessageManager iMessageManager;
        super.onPrepared();
        DataChannel dataChannel = ((C019D) this.LL.getValue()).LL;
        this.LLILLJJLI = dataChannel;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.addMessageListener(C001A.COMPETITION_MESSAGE.getIntType(), this);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof CompetitionMessage) {
            int i = ((CompetitionMessage) iMessage).type;
            if (i != 3) {
                if (i != 5) {
                    if (i == 6) {
                        setState(new C5183020f(iMessage, 112));
                        return;
                    }
                    return;
                }
                setState(new C5183020f(iMessage, 113));
                return;
            }
            setState(new C5183020f(iMessage, 111));
        }
    }
}
