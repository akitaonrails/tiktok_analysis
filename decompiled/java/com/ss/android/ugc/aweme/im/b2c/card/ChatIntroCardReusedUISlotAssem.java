package com.ss.android.ugc.aweme.im.b2c.card;

import X.C01GW;
import X.C0I0B;
import X.C0YNP;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332130kln;
import X.C1559260qg8;
import X.C1668706g9;
import X.C1763406vQ;
import X.C20684815ws;
import X.C2097608Jq;
import X.C438710HIf;
import X.C452501pT;
import X.C454440Hru;
import X.C457780HxI;
import X.C687700QyG;
import X.C723590SZx;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.IMAnalyticsUtil;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatIntroCardReusedUISlotAssem extends ReusedUISlotAssem<ChatIntroCardReusedUISlotAssem> implements InterfaceC712990Rxx<C1763406vQ>, InterfaceC1146704e9 {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 227));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 225));
    public final C1559260qg8 LLJLIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 226));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cg1;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        view.setTag(R.id.k_a, Boolean.TRUE);
        String conversationId = ((SessionInfo) this.LLJLILLLLZIIL.getValue()).getConversationId();
        String strLJ = IMAnalyticsUtil.LIZIZ.LJ((SessionInfo) this.LLJLILLLLZIIL.getValue());
        String strLIZIZ = C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJIILJJIL().LIZIZ(C0YNP.LJII(((SessionInfo) this.LLJLILLLLZIIL.getValue()).getConversationId()));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("chatroom_chat_intro_show", C2097608Jq.LJIIIIZZ(new Pair("conversation_id", conversationId), new Pair("chat_type", strLJ), new Pair("other_user_account_type", strLIZIZ)));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1763406vQ c1763406vQ) {
        C1763406vQ c1763406vQ2 = c1763406vQ;
        ((TextView) this.LLJL.getValue()).setText(c1763406vQ2.LLILLJJLI);
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c1763406vQ2.LL));
        c1331670kl3LJIIIIZZ.LJJJJLI = C454440Hru.LIZ();
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLJJLIIIJLLLLLLLZ.getValue());
        C1332130kln.LJFF(c1331670kl3LJIIIIZZ, "IMChatIntroCard", null, false, null, null, null, 62);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1763406vQ c1763406vQ) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1763406vQ c1763406vQ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
