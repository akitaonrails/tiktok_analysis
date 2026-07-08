package com.ss.android.ugc.aweme.chatroom;

import X.C01GW;
import X.C1383370m6R;
import X.C1558520qew;
import X.C452501pT;
import X.C724240Sb0;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.extrainput.IAutoFilledInputContentAbility;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class BusinessGroupChatInputAssem extends GroupChatroomInputAssem {
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 38));

    @Override // com.ss.android.ugc.aweme.chatroom.GroupChatroomInputAssem, com.ss.android.ugc.aweme.im.assem.IMInputAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ = C1383370m6R.LJIIIIZZ(C724240Sb0.LIZ(this));
        if (interfaceC665370Q7zLJIIIIZZ != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJIIIIZZ, (InterfaceC494301wD) this.LLLILZJ.getValue(), IAutoFilledInputContentAbility.class, null, null);
        }
    }
}
