package com.ss.android.ugc.aweme.inbox.land;

import X.C1904150zeP;
import X.EnumC1521205xS;
import android.content.Context;
import com.ss.android.ugc.aweme.homepage.DefaultBottomTabProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class LandInboxInterceptor implements DefaultBottomTabProtocol {
    public Boolean LL;

    @Override // com.ss.android.ugc.aweme.homepage.DefaultBottomTabProtocol
    public final String gZ1() {
        return "NOTIFICATION";
    }

    @Override // com.ss.android.ugc.aweme.homepage.DefaultBottomTabProtocol
    public final void op1() {
    }

    @Override // com.ss.android.ugc.aweme.homepage.DefaultBottomTabProtocol
    public final EnumC1521205xS priority() {
        return EnumC1521205xS.INBOX;
    }

    @Override // com.ss.android.ugc.aweme.homepage.DefaultBottomTabProtocol
    public final boolean Wf0(Context context) {
        Boolean bool = this.LL;
        if (bool != null) {
            return bool.booleanValue();
        }
        C1904150zeP.LIZ.getClass();
        this.LL = Boolean.FALSE;
        return false;
    }
}
