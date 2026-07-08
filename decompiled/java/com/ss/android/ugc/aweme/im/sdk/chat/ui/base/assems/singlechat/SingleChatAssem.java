package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C127G;
import X.C1366690lfX;
import X.C13LE;
import X.C1559260qg8;
import X.C1634806ag;
import X.C1637806bA;
import X.C1637906bB;
import X.C1654406dq;
import X.C1656506eB;
import X.C1660106el;
import X.C1768806wI;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C441201ne;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723580SZw;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C876890Yad;
import X.EnumC738160SxS;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS378S0100000_2;
import Y.AObjectS381S0100000_6;
import Y.AObjectS55S0000000_2;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.ChatRoomAlphaVideoViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel;
import com.ss.android.ugc.aweme.im.service.IDmHelper;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleChatAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 544));
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 545));
    public final C1634806ag LLJIJIL = new C1634806ag("SingleChatAssem");
    public final AssemVMLazy LLJILJIL;
    public boolean LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public final AssemVMLazy LLJJI;
    public volatile C1654406dq LLJJIII;
    public C127G LLJJIJI;
    public InterfaceC665370Q7z LLJJIJIIJIL;
    public C0QSJ LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SingleChatAssem.class, "chatCommonVM", "getChatCommonVM()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatCommonViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SingleChatAssem.class, "singleChatInputVM", "getSingleChatInputVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewmodel/SingleChatInputViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SingleChatAssem.class, "chatRoomAlphaVideoVM", "getChatRoomAlphaVideoVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/alphavideo/ChatRoomAlphaVideoViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(SingleChatAssem.class, "chatRoomStreakVM", "getChatRoomStreakVM()Lcom/ss/android/ugc/aweme/im/service/viewmodel/ChatRoomStreakViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(SingleChatAssem.class, "actionBarUIAssemProvider", "getActionBarUIAssemProvider()Lcom/ss/android/ugc/aweme/im/actionbar/api/ability/ActionBarUIAssemProvider;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public SingleChatAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatCommonViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 546), AFwS229S0000000_2.get$arr$(315), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SingleChatInputViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 547), AFwS229S0000000_2.get$arr$(316), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(ChatRoomAlphaVideoViewModel.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 548), AFwS229S0000000_2.get$arr$(317), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(ChatRoomStreakViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ4, 549), AFwS229S0000000_2.get$arr$(318), null, true);
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

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C0QSJ Go() {
        C0QSJ c0qsj = this.LLJJIJIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIJIIJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJIJIIJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
        this.LLJJIJIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final SingleChatInputViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (SingleChatInputViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatCommonViewModel.class, new AObjectS55S0000000_2(this, 33), SingleChatInputViewModel.class, new AObjectS381S0100000_6(this, 4), ChatRoomAlphaVideoViewModel.class, new AObjectS378S0100000_2(this, 12), ChatRoomStreakViewModel.class, new AObjectS378S0100000_2(this, 13)}, defaultViewModelProviderFactory);
                    this.LLJJIJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        SessionInfo sessionInfo = (SessionInfo) this.LLJI.getValue();
        if (sessionInfo == null || sessionInfo.isFromSearch()) {
            return;
        }
        IDmHelper.LIZ.getClass();
        IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
        if (iDmHelperLIZ != null) {
            iDmHelperLIZ.LJ(sessionInfo.getConversationId());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
        c1366690lfX.LIZIZ(this.LLJIJIL, false);
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 227));
        if (Ho().xQ2().LJIJ()) {
            C441201ne.LIZ(this, new C1768806wI(Ho().xQ2().LJIL, 12), "RecordTipAssem", new AwS581S0100000_2(this, 457));
            C1656506eB.LIZ(this, (ViewGroup) view.findViewById(R.id.dpp), Ho().xQ2().LJIILIIL);
        }
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06Ls
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1593606Lu) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 101), 4);
        SessionInfo sessionInfo = (SessionInfo) this.LLJI.getValue();
        if (sessionInfo != null) {
            IDmHelper.LIZ.getClass();
            IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
            if (iDmHelperLIZ != null) {
                iDmHelperLIZ.LJII(sessionInfo.getSingleChatFromUser());
            }
        }
        C1634806ag c1634806ag = this.LLJIJIL;
        c1366690lfX.LIZJ(c1634806ag, new C1660106el(c1634806ag.LJ, EnumC738160SxS.ON_VIEW_CREATED));
    }
}
