package com.ss.android.ugc.aweme.im.sdk.chat.feature.push;

import X.C0I0B;
import X.C1400340mXo;
import X.C2188811AlT;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.services.IDMPushInlineMsgManager;

/* JADX INFO: loaded from: classes3.dex */
public final class DMPushInlineMsgManager implements IDMPushInlineMsgManager {
    public static final DMPushInlineMsgManager LIZ = new DMPushInlineMsgManager();

    public static final class Service implements IDMPushInlineMsgManager {
        public final /* synthetic */ DMPushInlineMsgManager LIZ = DMPushInlineMsgManager.LIZ;

        @Override // com.ss.android.ugc.aweme.services.IDMPushInlineMsgManager
        public final boolean checkUnifiedFreCtl() {
            return this.LIZ.checkUnifiedFreCtl();
        }
    }

    public static Keva LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dm_push_auto_dismiss_repo ");
        sbLIZ.append(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Keva LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dm_push_inline_msg_repo ");
        sbLIZ.append(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.services.IDMPushInlineMsgManager
    public final boolean checkUnifiedFreCtl() {
        return System.currentTimeMillis() - LIZIZ().getLong("key_inline_msg_close_time", 1L) > 1296000000;
    }
}
