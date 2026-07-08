package com.bytedance.android.livesdk.interaction.poll.selectpoll;

import X.C0TDH;
import X.C11JF;
import X.C11NJ;
import X.C11PQ;
import X.C11RK;
import com.bytedance.android.live.poll.ILiveNormalPollViewModel;
import com.bytedance.android.livesdk.model.VoteResponseData;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.ss.ugc.live.sdk.message.data.IMessage;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveNormalPollViewModel extends ILiveNormalPollViewModel {
    public long LLILLL;
    public PollStartContent LLILZ;
    public final C11PQ<C0TDH> LLILZLL;
    public C0TDH LLIZ;
    public Room LLIZLLLIL;
    public final C11NJ LLJ;
    public final C11RK<VoteResponseData> LLJI;
    public final C11RK<Throwable> LLJIJIL;
    public int LLJILJIL;
    public C11JF LLJILJILJ;
    public final NextLiveData<PollMessage> LLILLJJLI = new NextLiveData<>();
    public final NextLiveData<Integer> LLILZIL = new NextLiveData<>();

    @Override // com.bytedance.android.live.poll.ILiveNormalPollViewModel
    public final boolean AQ2() {
        C0TDH c0tdhLJLZ = this.LLILZLL.LJLZ();
        if (c0tdhLJLZ != null) {
            return c0tdhLJLZ.isVoting();
        }
        return false;
    }

    @Override // com.bytedance.android.live.poll.ILiveNormalPollViewModel
    public final boolean yQ2() {
        C0TDH c0tdhLJLZ = this.LLILZLL.LJLZ();
        if (c0tdhLJLZ != null) {
            return c0tdhLJLZ.isHasVoted();
        }
        return false;
    }

    @Override // com.bytedance.android.live.poll.ILiveNormalPollViewModel
    public final boolean zQ2() {
        return this.LLIZ.isVoting();
    }

    public LiveNormalPollViewModel() {
        C0TDH c0tdh = C0TDH.STATE_IDLE;
        this.LLILZLL = C11PQ.LJLLLLLL(c0tdh);
        this.LLIZ = c0tdh;
        this.LLJ = new C11NJ();
        this.LLJI = new C11RK<>();
        this.LLJIJIL = new C11RK<>();
        this.LLJILJIL = -1;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLJ.dispose();
    }

    @Override // com.bytedance.android.live.poll.ILiveNormalPollViewModel
    public final NextLiveData<PollMessage> vQ2() {
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.android.live.poll.ILiveNormalPollViewModel
    public final C11PQ<C0TDH> wQ2() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.android.live.poll.ILiveNormalPollViewModel
    public final void BQ2(int i) {
        this.LLILZIL.setValue(Integer.valueOf(i));
        if (i != 0) {
            DQ2(C0TDH.STATE_VOTED);
        }
    }

    public final void CQ2(PollMessage pollMessage) {
        Integer num = pollMessage.pollKind;
        if (num != null && num.intValue() == 0) {
            this.LLILLJJLI.setValue(pollMessage);
            if (this.LLILLL != pollMessage.pollId) {
                BQ2(0);
                this.LLILZ = null;
            }
            PollStartContent pollStartContent = pollMessage.startContent;
            if (pollStartContent != null) {
                this.LLILZ = pollStartContent;
            } else {
                PollStartContent pollStartContent2 = this.LLILZ;
                if (pollStartContent2 != null) {
                    pollMessage.startContent = pollStartContent2;
                }
            }
            this.LLILLL = pollMessage.pollId;
            long j = pollMessage.messageType;
            if (j != 0 && j != 2) {
                if (j == 1) {
                    DQ2(C0TDH.STATE_END);
                }
            } else {
                Integer value = this.LLILZIL.getValue();
                if (value != null && value.intValue() == 0) {
                    DQ2(C0TDH.STATE_START);
                } else {
                    DQ2(C0TDH.STATE_VOTED);
                }
            }
        }
    }

    public final void DQ2(C0TDH c0tdh) {
        if (c0tdh == this.LLILZLL.LJLZ()) {
            return;
        }
        C0TDH c0tdhLJLZ = this.LLILZLL.LJLZ();
        if (c0tdhLJLZ == null) {
            c0tdhLJLZ = C0TDH.STATE_IDLE;
        }
        this.LLIZ = c0tdhLJLZ;
        this.LLILZLL.onNext(c0tdh);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof PollMessage) {
            CQ2((PollMessage) iMessage);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00de  */
    @Override // com.bytedance.android.live.poll.ILiveNormalPollViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(com.bytedance.android.livesdkapi.depend.model.live.Room r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.poll.selectpoll.LiveNormalPollViewModel.xQ2(com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }
}
