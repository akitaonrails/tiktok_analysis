package com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor;

import X.C13LE;
import X.C1401305e7;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatDetailContainerAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailApi;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatDetailImpl implements IChatDetailApi {
    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailApi
    public final C19719912Dl LIZIZ() {
        return C13LE.LIZ(ChatDetailContainerAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailApi
    public final C1401305e7 LIZ(String str) {
        return new C1401305e7(str);
    }
}
