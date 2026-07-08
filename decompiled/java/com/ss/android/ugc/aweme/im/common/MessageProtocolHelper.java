package com.ss.android.ugc.aweme.im.common;

import X.C1210104oN;
import X.C907010Zi7;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.IMessageProtocolHelper;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class MessageProtocolHelper implements IMessageProtocolHelper {
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.IMessageProtocolHelper
    public final TextTranslateProtocol LIZ() {
        return new TextTranslateProtocol();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.IMessageProtocolHelper
    public final C907010Zi7 LIZIZ() {
        if (((Boolean) C1210104oN.LIZIZ.getValue()).booleanValue()) {
            return null;
        }
        return C907010Zi7.LL;
    }
}
