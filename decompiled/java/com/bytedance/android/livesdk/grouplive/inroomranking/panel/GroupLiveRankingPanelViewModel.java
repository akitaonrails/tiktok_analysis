package com.bytedance.android.livesdk.grouplive.inroomranking.panel;

import X.AnonymousClass0190;
import X.AnonymousClass0206;
import X.C001A;
import X.C019D;
import X.C01GW;
import X.C020W;
import X.C11NJ;
import X.C11RK;
import X.C1559260qg8;
import X.C452501pT;
import X.C5182020e;
import X.C776250Uch;
import X.InterfaceC0148002o;
import com.bytedance.android.livesdk.livesetting.grouplive.GroupLiveConfig;
import com.bytedance.android.livesdk.model.message.CompetitionRankListMessage;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes.dex */
public final class GroupLiveRankingPanelViewModel extends AssemViewModel<AnonymousClass0190> implements OnMessageListener {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C019D.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(76));
    public final C01GW LLILLL = C452501pT.LIZIZ(new C5182020e(this, 93));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new AnonymousClass0190(0);
    }

    public final C019D vQ2() {
        return (C019D) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        IMessageManager iMessageManager;
        super.onCleared();
        DataChannel dataChannel = vQ2().LL;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(C001A.COMPETITION_RANK_LIST_MESSAGE.getIntType(), this);
        }
        ((C11NJ) this.LLILLJJLI.getValue()).dispose();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        IMessageManager iMessageManager;
        super.onPrepared();
        DataChannel dataChannel = vQ2().LL;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.addStickyMessageListener(C001A.COMPETITION_RANK_LIST_MESSAGE.getIntType(), this);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage != null && (iMessage instanceof CompetitionRankListMessage)) {
            if (GroupLiveConfig.INSTANCE.getGetValue().rankingPanelConfig.throttleIntervalDuration > 0) {
                ((C11RK) this.LLILLL.getValue()).onNext(iMessage);
            } else {
                withState(new C020W((CompetitionRankListMessage) iMessage, this, 94));
            }
        }
    }
}
