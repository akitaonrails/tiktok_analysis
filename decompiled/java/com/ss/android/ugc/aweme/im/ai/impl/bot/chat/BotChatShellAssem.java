package com.ss.android.ugc.aweme.im.ai.impl.bot.chat;

import X.AnonymousClass0629;
import X.C019F;
import X.C01GW;
import X.C0Y8T;
import X.C0YSQ;
import X.C1366690lfX;
import X.C13LE;
import X.C1559260qg8;
import X.C1634806ag;
import X.C1637806bA;
import X.C1660106el;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723590SZx;
import X.C723850SaN;
import X.C724750Sbp;
import X.C876890Yad;
import X.EnumC738160SxS;
import X.InterfaceC1146704e9;
import X.InterfaceC1693306k7;
import X.InterfaceC2217461Bqa;
import X.InterfaceC876950Yaj;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.service.IDmHelper;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class BotChatShellAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 236));
    public final C1559260qg8 LLJ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 237));
    public final C1634806ag LLJIJIL = new C1634806ag("BotChatShellAssem");
    public final AssemVMLazy LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BotChatShellAssem.class, "inputHeightVM", "getInputHeightVM()Lcom/ss/android/ugc/aweme/im/viewmodel/InputPanelSizeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BotChatShellAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputPanelSizeViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 238), AFwS229S0000000_2.get$arr$(195), null, true);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 235));
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

    public final SessionInfo Go() {
        return (SessionInfo) this.LLJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String enterMethodForMob;
        String enterFromForMob;
        C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
        boolean z = false;
        c1366690lfX.LIZIZ(this.LLJIJIL, false);
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 195));
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(Go().getConversationId());
        IMAIServiceAPI.LIZ.getClass();
        InterfaceC1693306k7 interfaceC1693306k7LIZ = AnonymousClass0629.LIZ().LIZ();
        if (c0y8tLIZ != null && c0y8tLIZ.isStickTop()) {
            z = true;
        }
        EnterChatParams enterChatParams = ((C457780HxI) this.LLJ.getValue()).LLILLL;
        String str = "";
        if (enterChatParams == null || (enterMethodForMob = enterChatParams.getEnterMethodForMob()) == null) {
            enterMethodForMob = "";
        }
        EnterChatParams enterChatParams2 = ((C457780HxI) this.LLJ.getValue()).LLILLL;
        if (enterChatParams2 != null && (enterFromForMob = enterChatParams2.getEnterFromForMob()) != null) {
            str = enterFromForMob;
        }
        interfaceC1693306k7LIZ.LJJIJLIJ(enterMethodForMob, str, z);
        IDmHelper.LIZ.getClass();
        IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
        if (iDmHelperLIZ != null) {
            iDmHelperLIZ.LJII(Go().getSingleChatFromUser());
        }
        C1634806ag c1634806ag = this.LLJIJIL;
        c1366690lfX.LIZJ(c1634806ag, new C1660106el(c1634806ag.LJ, EnumC738160SxS.ON_VIEW_CREATED));
    }
}
