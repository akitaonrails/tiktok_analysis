package com.ss.android.ugc.aweme.im.sdk.unreadindicator;

import X.EnumC880090Yfn;
import X.EnumC910600Znu;

/* JADX INFO: loaded from: classes15.dex */
public final class UnreadMentionMsgHandler extends UnreadImportantMsgHandler {
    public final int LLILLL;
    public final EnumC910600Znu LLILZ;

    public UnreadMentionMsgHandler() {
        super(EnumC880090Yfn.MENTION);
        this.LLILLL = 2131755240;
        this.LLILZ = EnumC910600Znu.MENTION;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final int tJ() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final EnumC910600Znu tP2() {
        return this.LLILZ;
    }
}
