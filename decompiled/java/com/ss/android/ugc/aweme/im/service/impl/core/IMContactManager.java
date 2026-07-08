package com.ss.android.ugc.aweme.im.service.impl.core;

import X.AbstractC1711506n3;
import X.C1336205Ku;
import X.C1529905yr;
import android.content.Context;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.im.service.service.IIMContactManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class IMContactManager implements IIMContactManager {
    public static final IMContactManager LIZ = new IMContactManager();

    public static final class Service implements IIMContactManager {
        public final /* synthetic */ IMContactManager LIZ = IMContactManager.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMContactManager
        public final void LIZ(Context context, IMContact iMContact, Function0<Unit> function0) {
            this.LIZ.LIZ(context, iMContact, function0);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMContactManager
        public final List<String> LIZIZ(List<? extends IMContact> list) {
            return this.LIZ.LIZIZ(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMContactManager
    public final List<String> LIZIZ(List<? extends IMContact> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends IMContact> it2 = list.iterator();
        while (it2.hasNext()) {
            String strLIZIZ = C1529905yr.LIZIZ(it2.next());
            if (strLIZIZ != null) {
                arrayList.add(strLIZIZ);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMContactManager
    public final void LIZ(Context context, IMContact iMContact, Function0<Unit> function0) {
        if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            if (iMConversation.getConversationType() == AbstractC1711506n3.LIZIZ) {
                IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                EnterChatParams enterChatParams = new EnterChatParams(context, 3, iMConversation.getConversationId());
                enterChatParams.setEnterFrom(6);
                enterChatParams.setEnterMethodForMob("share_toast");
                enterChatParams.setEnterFromForMob("");
                imChatService.LJIILLIIL(enterChatParams, null);
                return;
            }
        }
        function0.invoke();
    }
}
