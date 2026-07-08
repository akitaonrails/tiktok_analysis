package com.ss.android.ugc.aweme.im.quickchat.ui.assem;

import X.C01GW;
import X.C05YD;
import X.C0HV6;
import X.C452501pT;
import X.InterfaceC441910HUn;
import X.InterfaceC441960HUs;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class QuickDMEmojiAbility implements IEmojiBtnAbility {
    public final InterfaceC497601wk LL;
    public final IInputFieldAbility LLILLJJLI;
    public final C0HV6 LLILLL;
    public final InterfaceC441960HUs LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 170));

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility
    public final void fh0(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility
    public final C05YD<InterfaceC441910HUn> W90() {
        return (C05YD) this.LLILZIL.getValue();
    }

    public QuickDMEmojiAbility(InterfaceC497601wk interfaceC497601wk, IInputFieldAbility iInputFieldAbility, C0HV6 c0hv6, InterfaceC441960HUs interfaceC441960HUs) {
        this.LL = interfaceC497601wk;
        this.LLILLJJLI = iInputFieldAbility;
        this.LLILLL = c0hv6;
        this.LLILZ = interfaceC441960HUs;
    }
}
