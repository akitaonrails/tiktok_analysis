package com.ss.android.ugc.aweme.im.sdk.unreadindicator;

import X.C877500Ybc;
import X.EnumC877490Ybb;
import X.EnumC880090Yfn;
import X.EnumC910600Znu;

/* JADX INFO: loaded from: classes15.dex */
public final class UnreadGroupOwnerMsgHandler extends UnreadImportantMsgHandler {
    public final int LLILLL;
    public final EnumC910600Znu LLILZ;

    public UnreadGroupOwnerMsgHandler() {
        super(EnumC880090Yfn.SEND_BY_OWNER);
        this.LLILLL = 2131755241;
        this.LLILZ = EnumC910600Znu.GROUP_OWNER;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final int tJ() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final EnumC910600Znu tP2() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadImportantMsgHandler
    public final boolean LIZ(String str) {
        if (C877500Ybc.LIZ(str) == EnumC877490Ybb.HIGHLIGHTS) {
            return true;
        }
        return false;
    }
}
