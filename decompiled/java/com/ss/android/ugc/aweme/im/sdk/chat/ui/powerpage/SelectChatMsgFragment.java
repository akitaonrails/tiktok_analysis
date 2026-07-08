package com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage;

import X.C01GW;
import X.C1440005kM;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C20277814Wa;
import X.C20684815ws;
import X.C903470ZcP;
import X.C913100Zrw;
import X.InterfaceC1602960roc;
import X.InterfaceC21500319Cf;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager;
import com.ss.android.ugc.aweme.im.chatroom.api.gesture.ChatroomBackPressProtocol;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
@InterfaceC836760Ws6(attachActivity = SelectChatMsgHostActivity.class)
@InterfaceC21500319Cf(featureKey = "tiktok_dm_selectchatmsg")
public final class SelectChatMsgFragment extends BaseChatRoomFragment implements InterfaceC21503819Do {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw3I2svIS4nHELIOSZjAlZz88PyA+OS40LWsfLCM2KzEPIS4nBTYrDz0yLygpJzs=";
    public final C01GW LLLJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS248S0000000_14.get$arr$(239), "key_enter_chat_params", EnterChatParams.class);

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment
    public final EnterChatParams SR() {
        return (EnterChatParams) this.LLLJIL.getValue();
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        String conversationId;
        SessionInfo sessionInfo = this.LLJILJIL;
        if (sessionInfo != null && (conversationId = sessionInfo.getConversationId()) != null && conversationId.length() > 0) {
            C913100Zrw c913100Zrw = new C913100Zrw();
            c913100Zrw.LIZIZ = conversationId;
            C1440005kM.LIZ(c913100Zrw);
        }
        List listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJFF(this, null), ChatroomBackPressProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            loop0: while (true) {
                while (it2.hasNext()) {
                    boolean z = ((ChatroomBackPressProtocol) it2.next()).LLZLL() || z;
                }
            }
        }
        C20277814Wa.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((InterfaceC1602960roc) this.LLJ.getValue()).LIZ("is_report_page", "1");
        C20684815ws.onEventV3("tiktok_dm_selectchatmsg");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment
    public final void UR(boolean z) {
        boolean zIsReportPage;
        String conversationId;
        SessionInfo sessionInfo;
        super.UR(z);
        SessionInfo sessionInfo2 = this.LLJILJIL;
        if (sessionInfo2 != null && (conversationId = sessionInfo2.getConversationId()) != null && (sessionInfo = this.LLJILJIL) != null) {
            IReportChatMsgManager.LIZ.getClass();
            IReportChatMsgManager iReportChatMsgManagerLIZ = C903470ZcP.LIZ();
            if (iReportChatMsgManagerLIZ != null) {
                sessionInfo.setDefaultMsgSelectedNum(iReportChatMsgManagerLIZ.LIZJ(conversationId));
            }
        }
        SessionInfo sessionInfo3 = this.LLJILJIL;
        if (sessionInfo3 != null) {
            EnterChatParams enterChatParams = (EnterChatParams) this.LLLJIL.getValue();
            if (enterChatParams != null) {
                zIsReportPage = enterChatParams.isReportPage();
            } else {
                zIsReportPage = false;
            }
            sessionInfo3.setReportPage(zIsReportPage);
        }
    }

    @Override // X.InterfaceC21503819Do
    public final void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
        onActivityResult(i, i2, intent);
    }
}
