package com.ss.android.ugc.aweme.im.sdk.chat.feature.voice;

import X.C0ZRA;
import X.C0ZRC;
import X.C0ZRE;
import X.C0ZRG;
import X.C0ZRI;
import X.C0ZRJ;
import X.C1954807lC;
import X.C869590Y9l;
import com.ss.android.ugc.aweme.im.chatlist.api.service.IIMVoiceMessageChatlistApiService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMVoiceMessageChatlistApiServiceImpl implements IIMVoiceMessageChatlistApiService {
    @Override // com.ss.android.ugc.aweme.im.chatlist.api.service.IIMVoiceMessageChatlistApiService
    public final boolean LIZ(C869590Y9l c869590Y9l) {
        C0ZRE c0zreLIZIZ = C0ZRA.LIZIZ(c869590Y9l);
        if (!Intrinsics.LJFF(c0zreLIZIZ, C0ZRI.LIZ) && !Intrinsics.LJFF(c0zreLIZIZ, C0ZRG.LIZ)) {
            if (!(c0zreLIZIZ instanceof C0ZRC) && !Intrinsics.LJFF(c0zreLIZIZ, C0ZRJ.LIZ)) {
                throw new C1954807lC();
            }
            return true;
        }
        return false;
    }
}
