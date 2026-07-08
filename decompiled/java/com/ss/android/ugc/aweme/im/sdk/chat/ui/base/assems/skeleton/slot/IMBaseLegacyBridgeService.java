package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.slot;

import X.C06IQ;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.service.legacy.IMBaseLegacyBridge;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class IMBaseLegacyBridgeService implements IMBaseLegacyBridge {
    @Override // com.ss.android.ugc.aweme.im.service.legacy.IMBaseLegacyBridge
    public final AFwS187S0000000_2 LIZ(SessionInfo sessionInfo) {
        if (!(sessionInfo instanceof SessionInfo) || sessionInfo == null || !sessionInfo.isGroupChat() || ((Number) C06IQ.LIZ.getValue()).intValue() == 0) {
            return null;
        }
        return AFwS187S0000000_2.get$arr$(1046);
    }
}
