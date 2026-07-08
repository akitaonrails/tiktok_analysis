package com.ss.android.ugc.aweme;

import X.C1558520qew;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.im.chatroom.api.IAnimationGreetingCardChecker;
import com.ss.android.ugc.aweme.util.GreetingCardAbility;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimationGreetingCardCheckerImpl implements IAnimationGreetingCardChecker {
    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IAnimationGreetingCardChecker
    public final boolean LIZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        GreetingCardAbility greetingCardAbility = (GreetingCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, GreetingCardAbility.class, null);
        if (greetingCardAbility != null && greetingCardAbility.gU()) {
            return true;
        }
        return false;
    }
}
