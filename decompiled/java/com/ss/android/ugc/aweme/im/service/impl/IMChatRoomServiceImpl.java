package com.ss.android.ugc.aweme.im.service.impl;

import X.AbstractC1387200mCc;
import X.C1675506hF;
import X.C1711106mz;
import X.C1906580ziK;
import X.C813440Vva;
import X.C869590Y9l;
import X.C907170ZiN;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatRootFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatShellActivity;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.fragment.ChatDetailFragment;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomService;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class IMChatRoomServiceImpl implements IIMChatRoomService {
    @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomService
    public final boolean LIZIZ() {
        return ((Number) C1711106mz.LIZ.getValue()).intValue() == 1;
    }

    @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomService
    public final void LIZLLL() {
        IIMChatPerfLogger.LIZ.getClass();
        IIMChatPerfLogger iIMChatPerfLoggerLIZ = C907170ZiN.LIZ();
        if (iIMChatPerfLoggerLIZ != null) {
            iIMChatPerfLoggerLIZ.LJIIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomService
    public final boolean LIZ() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        return (abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LIZ : null) instanceof ChatRootFragment;
    }

    @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomService
    public final SystemContent LIZJ(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return null;
        }
        CheckMessage.Companion companion = CheckMessage.Companion;
        C1675506hF c1675506hF = C1675506hF.LIZ;
        Map<String, String> localExt = c869590Y9l.getLocalExt();
        c1675506hF.getClass();
        return companion.getContent(C1675506hF.LIZ(localExt));
    }

    @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomService
    public final boolean LJ(Activity activity) {
        Fragment fragmentLIZ;
        IMGroupChatApi iMGroupChatApiLIZ;
        IMGroupChatApi iMGroupChatApiLIZ2;
        if (!(activity instanceof ChatShellActivity)) {
            Object obj = null;
            if (activity != null) {
                fragmentLIZ = C813440Vva.LIZ(activity);
            } else {
                fragmentLIZ = null;
            }
            if (!(fragmentLIZ instanceof ChatDetailFragment) && !(fragmentLIZ instanceof BaseChatRoomFragment) && (fragmentLIZ == null || (iMGroupChatApiLIZ2 = IMGroupChatApi.LIZIZ.LIZ()) == null || !iMGroupChatApiLIZ2.LJIILIIL(fragmentLIZ))) {
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ != null) {
                    obj = abstractC1387200mCcLIZIZ.LIZ;
                }
                if (!(obj instanceof ChatDetailFragment) && !(obj instanceof BaseChatRoomFragment) && ((obj == null || (iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ()) == null || !iMGroupChatApiLIZ.LJIILIIL(obj)) && !(obj instanceof ChatRootFragment))) {
                    return false;
                }
            }
        }
        return true;
    }
}
