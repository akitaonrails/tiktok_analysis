package com.ss.android.ugc.aweme.interactive.task.game.recall;

import X.C0ICA;
import X.C0PEM;
import X.C23250099c;
import X.C448440HiE;
import X.C457990Hxd;
import X.C869590Y9l;
import X.C912070ZqH;
import X.EnumC1729006ps;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.message.template.card.GameChallengeCardTemplate;
import com.ss.android.ugc.aweme.interactive.task.game.GameChallengeChatroomVM;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS25S0000100_6;

/* JADX INFO: loaded from: classes7.dex */
public final class GameChallengeChatroomVMImpl extends GameChallengeChatroomVM {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C448440HiE(0);
    }

    @Override // com.ss.android.ugc.aweme.interactive.task.game.GameChallengeChatroomVM
    public final void wQ2(long j) {
        setState(new AwS25S0000100_6(j, 1));
    }

    @Override // com.ss.android.ugc.aweme.interactive.task.game.GameChallengeChatroomVM
    public final void vQ2(C869590Y9l c869590Y9l, GameChallengeCardTemplate gameChallengeCardTemplate) {
        C912070ZqH.LIZIZ.LJIIIIZZ().LIZLLL().LJIIJJI(C0ICA.LIZ(c869590Y9l.getConversationId(), "chat", EnumC1729006ps.LONG_PRESS_CHAT_GAME_BANNER.getValue(), gameChallengeCardTemplate));
        if (getState().LL.LIZ.LIZ) {
            return;
        }
        setState(AFwS236S0000000_6.get$arr$(28));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C457990Hxd(gameChallengeCardTemplate, c869590Y9l, this, null), 2);
    }
}
