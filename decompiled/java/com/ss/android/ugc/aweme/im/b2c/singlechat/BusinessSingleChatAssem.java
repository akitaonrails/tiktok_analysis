package com.ss.android.ugc.aweme.im.b2c.singlechat;

import X.AbstractC1656706eD;
import X.C019F;
import X.C01GW;
import X.C06M6;
import X.C09R3;
import X.C0QSJ;
import X.C127G;
import X.C1366690lfX;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1634806ag;
import X.C1637806bA;
import X.C1637906bB;
import X.C1649006cy;
import X.C1654406dq;
import X.C1656506eB;
import X.C1660106el;
import X.C1768806wI;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2285411Ect;
import X.C441201ne;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723590SZx;
import X.C723850SaN;
import X.C724750Sbp;
import X.C876890Yad;
import X.EnumC738160SxS;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS378S0100000_2;
import Y.AObjectS381S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.b2c.api.ability.IMBusinessInfoAbility;
import com.ss.android.ugc.aweme.im.b2c.businessinfo.IMBusinessInfoAbilityImpl;
import com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.ChatRoomAlphaVideoViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel;
import com.ss.android.ugc.aweme.im.service.IDmHelper;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessSingleChatAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 335));
    public final C1559260qg8 LLJ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 336));
    public final C1559260qg8 LLJIJIL = new C1559260qg8(new C723590SZx(this, C06M6.class, null), checkSupervisorPrepared());
    public final C1634806ag LLJILJIL = new C1634806ag("SingleChatAssem");
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public final C01GW LLJJI;
    public volatile C1654406dq LLJJIII;
    public C127G LLJJIJI;
    public InterfaceC665370Q7z LLJJIJIIJIL;
    public C0QSJ LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BusinessSingleChatAssem.class, "singleChatInputVM", "getSingleChatInputVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewmodel/SingleChatInputViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BusinessSingleChatAssem.class, "chatRoomAlphaVideoVM", "getChatRoomAlphaVideoVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/alphavideo/ChatRoomAlphaVideoViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BusinessSingleChatAssem.class, "chatRoomStreakVM", "getChatRoomStreakVM()Lcom/ss/android/ugc/aweme/im/service/viewmodel/ChatRoomStreakViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(BusinessSingleChatAssem.class, "actionBarUIAssemProvider", "getActionBarUIAssemProvider()Lcom/ss/android/ugc/aweme/im/actionbar/api/ability/ActionBarUIAssemProvider;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public BusinessSingleChatAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SingleChatInputViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 337), AFwS229S0000000_2.get$arr$(243), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ChatRoomAlphaVideoViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 338), AFwS229S0000000_2.get$arr$(244), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(ChatRoomStreakViewModel.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 339), AFwS229S0000000_2.get$arr$(245), null, true);
        this.LLJJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(345));
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

    public final SessionInfo Ho() {
        return (SessionInfo) this.LLJI.getValue();
    }

    public final SingleChatInputViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
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
                    C127G c127g2 = new C127G(new Object[]{SingleChatInputViewModel.class, new AObjectS381S0100000_6(this, 5), ChatRoomAlphaVideoViewModel.class, new AObjectS378S0100000_2(this, 15), ChatRoomStreakViewModel.class, new AObjectS378S0100000_2(this, 14)}, defaultViewModelProviderFactory);
                    this.LLJJIJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IMRecentActivityService.LIZ.getClass();
        C1649006cy.LIZ().LIZIZ().LIZ();
        Fragment fragment = (Fragment) this.LLIZLLLIL.getValue();
        if (fragment != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragment, null), IMBusinessInfoAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        if (Ho().isFromSearch()) {
            return;
        }
        IDmHelper.LIZ.getClass();
        IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
        if (iDmHelperLIZ != null) {
            iDmHelperLIZ.LJ(Ho().getConversationId());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
        c1366690lfX.LIZIZ(this.LLJILJIL, false);
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 211));
        if (Jo().xQ2().LJIJ()) {
            C441201ne.LIZ(this, new C1768806wI(Jo().xQ2().LJIL, 13), "RecordTipAssem", new AwS581S0100000_2(this, 469));
            C1656506eB.LIZ(this, (ViewGroup) view.findViewById(R.id.dpp), Jo().xQ2().LJIILIIL);
        }
        Fragment fragment = (Fragment) this.LLIZLLLIL.getValue();
        if (fragment != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragment, null), (IMBusinessInfoAbilityImpl) this.LLJJI.getValue(), IMBusinessInfoAbility.class, null, this);
        }
        new AbstractC1656706eD<C2285411Ect, Object>() { // from class: X.06eC
        };
        IDmHelper.LIZ.getClass();
        IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
        if (iDmHelperLIZ != null) {
            iDmHelperLIZ.LJII(Ho().getSingleChatFromUser());
        }
        C1634806ag c1634806ag = this.LLJILJIL;
        c1366690lfX.LIZJ(c1634806ag, new C1660106el(c1634806ag.LJ, EnumC738160SxS.ON_VIEW_CREATED));
    }
}
