package com.ss.android.ugc.aweme.im.sdk.chat.feature.inlinenotice;

import X.C1680206i0;
import X.C1680306i1;
import X.C869590Y9l;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.service.IMessageViewHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class MessageViewHelperImpl implements IMessageViewHelper {
    public final /* synthetic */ C1680306i1 LIZIZ = C1680306i1.LIZIZ;

    @Override // com.ss.android.ugc.aweme.im.service.IMessageViewHelper
    public final boolean LIZIZ(int i) {
        return this.LIZIZ.LIZIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IMessageViewHelper
    public final void LIZJ(C869590Y9l c869590Y9l, SystemContent systemContent, SessionInfo sessionInfo) {
        this.LIZIZ.LIZJ(c869590Y9l, systemContent, sessionInfo);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IMessageViewHelper
    public final void LIZLLL(SystemContent systemContent, String str) {
        this.LIZIZ.LIZLLL(systemContent, str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IMessageViewHelper
    public final IMUser LJ(C869590Y9l c869590Y9l) {
        return this.LIZIZ.LJ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IMessageViewHelper
    public final void LJFF(SystemContent.Key key, SessionInfo sessionInfo, C869590Y9l c869590Y9l) {
        this.LIZIZ.LJFF(key, sessionInfo, c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IMessageViewHelper
    public final String LJI(C869590Y9l c869590Y9l) {
        return this.LIZIZ.LJI(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IMessageViewHelper
    public final C1680206i0 LIZ(int i, IMUser iMUser, String str, SessionInfo sessionInfo, C869590Y9l c869590Y9l) {
        this.LIZIZ.getClass();
        return new C1680206i0(i, iMUser, str, sessionInfo, c869590Y9l);
    }
}
