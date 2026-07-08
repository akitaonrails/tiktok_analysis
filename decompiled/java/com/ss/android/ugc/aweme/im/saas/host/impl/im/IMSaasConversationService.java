package com.ss.android.ugc.aweme.im.saas.host.impl.im;

import X.AbstractC1711506n3;
import X.C0Y8T;
import X.C0YNP;
import X.C15492064s;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostConversationApi;

/* JADX INFO: loaded from: classes3.dex */
public final class IMSaasConversationService implements IMHostConversationApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostConversationApi
    public final boolean LIZ() {
        return ((Boolean) C15492064s.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostConversationApi
    public final boolean LIZIZ(int i) {
        if (i == AbstractC1711506n3.LIZ) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostConversationApi
    public final long LIZJ(String str) {
        return C0YNP.LJII(str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostConversationApi
    public final boolean LIZLLL(int i) {
        if (i == AbstractC1711506n3.LIZIZ) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostConversationApi
    public final boolean LJ(String str) {
        C0Y8T c0y8tLJ = C0YNP.LIZIZ(str).LJ();
        if (c0y8tLJ != null) {
            return c0y8tLJ.isSingleChat();
        }
        return false;
    }
}
