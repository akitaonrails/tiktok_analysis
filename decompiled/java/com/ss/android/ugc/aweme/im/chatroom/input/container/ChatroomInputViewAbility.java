package com.ss.android.ugc.aweme.im.chatroom.input.container;

import X.InterfaceC1659706eh;
import android.view.View;
import com.ss.android.ugc.aweme.im.chatroom.api.ability.IMInputViewUIAbility;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatroomInputViewAbility implements IMInputViewUIAbility {
    public final View LL;
    public final InterfaceC1659706eh LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.ability.IMInputViewUIAbility
    public final void eQ1() {
        this.LLILLJJLI.setVisibility(false);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.ability.IMInputViewUIAbility
    public final void fy1() {
        this.LLILLJJLI.setVisibility(true);
    }

    public ChatroomInputViewAbility(View view, InputPanelSizeViewModel inputPanelSizeViewModel) {
        this.LL = view;
        this.LLILLJJLI = inputPanelSizeViewModel;
    }
}
