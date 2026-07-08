package com.ss.android.ugc.aweme.chatroom;

import X.C019F;
import X.C01GW;
import X.C06M6;
import X.C0QSJ;
import X.C127G;
import X.C128Y;
import X.C13LE;
import X.C1509305vX;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1654406dq;
import X.C1655806e4;
import X.C1656506eB;
import X.C1697810uHb;
import X.C1702706ld;
import X.C1768806wI;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C441201ne;
import X.C457780HxI;
import X.C687700QyG;
import X.C723580SZw;
import X.C723590SZx;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C876890Yad;
import X.InterfaceC1146704e9;
import X.InterfaceC1655706e3;
import X.InterfaceC1693006k4;
import X.InterfaceC214902198i;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.AObjectS378S0100000_2;
import Y.AObjectS381S0100000_6;
import Y.AObjectS55S0000000_2;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.GroupChatProtocol;
import com.ss.android.ugc.aweme.group.ChatConvUpdateVM;
import com.ss.android.ugc.aweme.group.GroupChatProtocolImpl;
import com.ss.android.ugc.aweme.group.MockedConvVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.QuickChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.ChatRoomAlphaVideoViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel;
import com.ss.android.ugc.aweme.im.service.IDmHelper;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import com.ss.android.ugc.aweme.publicgroup.preview.ChatPreviewModeVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS438S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS90S0110000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupChatAssem extends UIContentAssem implements InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final C1559260qg8 LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public volatile ChatroomEventAbility LLJJJ;
    public volatile C1654406dq LLJJJIL;
    public C127G LLJJJJ;
    public InterfaceC665370Q7z LLJJJJJIL;
    public C0QSJ LLJJJJLIIL;

    public GroupChatAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupChatVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 106), AFwS229S0000000_2.get$arr$(102), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(QuickChatViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 107), AFwS229S0000000_2.get$arr$(103), null, true);
        this.LLJIJIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 108));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MockedConvVM.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 109), AFwS229S0000000_2.get$arr$(104), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(ChatPreviewModeVM.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ4, 110), AFwS229S0000000_2.get$arr$(105), null, true);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(SingleChatInputViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ5, 111), AFwS229S0000000_2.get$arr$(106), null, true);
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(ChatConvUpdateVM.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ6, 112), AFwS229S0000000_2.get$arr$(107), null, true);
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(ChatRoomAlphaVideoViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ7), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ7, 113), AFwS229S0000000_2.get$arr$(108), null, true);
        C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(ChatRoomStreakViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ8), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ8, 114), AFwS229S0000000_2.get$arr$(109), null, true);
        this.LLJJIJI = new C1559260qg8(new C723580SZw(this, C06M6.class, null), checkSupervisorPrepared());
        C19719912Dl c19719912DlLIZ9 = C13LE.LIZ(ChatCommonViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ9), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ9, 115), AFwS229S0000000_2.get$arr$(110), null, true);
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

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupChatAssem.class, "groupChatVM", "getGroupChatVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/group/GroupChatVM;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(GroupChatAssem.class, "quickChatViewModel", "getQuickChatViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/quickinteraction/viewmodel/QuickChatViewModel;", 0), new C2217381BqS(GroupChatAssem.class, "mockedConvVM", "getMockedConvVM()Lcom/ss/android/ugc/aweme/group/MockedConvVM;", 0), new C2217381BqS(GroupChatAssem.class, "chatPreviewModeVM", "getChatPreviewModeVM()Lcom/ss/android/ugc/aweme/publicgroup/preview/ChatPreviewModeVM;", 0), new C2217381BqS(GroupChatAssem.class, "groupChatInputVM", "getGroupChatInputVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewmodel/SingleChatInputViewModel;", 0), new C2217381BqS(GroupChatAssem.class, "chatConvUpdateVM", "getChatConvUpdateVM()Lcom/ss/android/ugc/aweme/group/ChatConvUpdateVM;", 0), new C2217381BqS(GroupChatAssem.class, "chatRoomAlphaVideoVM", "getChatRoomAlphaVideoVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/alphavideo/ChatRoomAlphaVideoViewModel;", 0), new C2217381BqS(GroupChatAssem.class, "chatRoomStreakVM", "getChatRoomStreakVM()Lcom/ss/android/ugc/aweme/im/service/viewmodel/ChatRoomStreakViewModel;", 0), new C2217381BqS(GroupChatAssem.class, "chatroomEventAbility", "getChatroomEventAbility()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/ChatroomEventAbility;", 0), new C2217381BqS(GroupChatAssem.class, "actionBarUIAssemProvider", "getActionBarUIAssemProvider()Lcom/ss/android/ugc/aweme/im/actionbar/api/ability/ActionBarUIAssemProvider;", 0), new C2217381BqS(GroupChatAssem.class, "chatCommonVM", "getChatCommonVM()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatCommonViewModel;", 0)};
    }

    public final C0QSJ Ho() {
        C0QSJ c0qsj = this.LLJJJJLIIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJJJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJJJJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
        this.LLJJJJLIIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final SingleChatInputViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (SingleChatInputViewModel) assemVMLazy.getValue();
    }

    public final GroupChatVM Lo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (GroupChatVM) assemVMLazy.getValue();
    }

    public final MockedConvVM No() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (MockedConvVM) assemVMLazy.getValue();
    }

    public final SessionInfo Oo() {
        return ((C457780HxI) this.LLIZLLLIL.getValue()).LL;
    }

    public final void So() {
        InterfaceC214902198i interfaceC214902198i;
        if (((C457780HxI) this.LLIZLLLIL.getValue()).LLILLJJLI) {
            AssemVMLazy assemVMLazy = this.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
            assemVMLazy.getValue().setState(AFwS229S0000000_2.get$arr$(575));
        } else {
            if (!(C724240Sb0.LJI(this) instanceof InterfaceC214902198i)) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    c19egLIZ.finish();
                    return;
                }
                return;
            }
            C128Y c128yLJI = C724240Sb0.LJI(this);
            if (!(c128yLJI instanceof InterfaceC214902198i) || (interfaceC214902198i = (InterfaceC214902198i) c128yLJI) == null) {
                return;
            }
            interfaceC214902198i.finish();
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{GroupChatVM.class, new AObjectS378S0100000_2(this, 18), ChatPreviewModeVM.class, new AObjectS55S0000000_2(this, 40), SingleChatInputViewModel.class, new AObjectS381S0100000_6(this, 9), ChatRoomAlphaVideoViewModel.class, new AObjectS378S0100000_2(this, 17), ChatRoomStreakViewModel.class, new AObjectS378S0100000_2(this, 19), ChatCommonViewModel.class, new AObjectS55S0000000_2(this, 39)}, defaultViewModelProviderFactory);
                    this.LLJJJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        No();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        if (Oo().isFromSearch()) {
            return;
        }
        IDmHelper.LIZ.getClass();
        IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
        if (iDmHelperLIZ != null) {
            iDmHelperLIZ.LJ(Oo().getConversationId());
        }
    }

    public final void Go(Function2<? super Assembler, ? super C1702706ld, Unit> function2) {
        No().cc1(new AwS368S0200000_2(this, (GroupChatAssem) function2, (Function2<? super Assembler, ? super C1702706ld, Unit>) 12));
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class});
        c0qsjLIZIZ.unbindAbility(No(), InterfaceC1655706e3.class);
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        c0qsjLIZIZ.unbindAbility(assemVMLazy.getValue(), InterfaceC1693006k4.class);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        ChatFeatureListConf chatFeatureListConf;
        super.onViewCreated(view);
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        final GroupChatProtocolImpl groupChatProtocolImpl = new GroupChatProtocolImpl(Lo());
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, GroupChatProtocol.class, C1697810uHb.LJIILJJIL(groupChatProtocolImpl));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.chatroom.GroupChatAssem$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, GroupChatProtocol.class, groupChatProtocolImpl);
                    }
                }
            });
        }
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        ((ChatConvUpdateVM) assemVMLazy.getValue()).LLILZLL.put(this, new C1655806e4(Lo()));
        C06M6 c06m6 = (C06M6) this.LLJJIJI.getValue();
        if (c06m6 != null && (chatFeatureListConf = c06m6.LL) != null && chatFeatureListConf.isBusinessFanGroup()) {
            z = true;
            this.LLJJIJIL = true;
        } else {
            z = false;
        }
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.06e6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657506eL) obj).LLILLL;
            }
        }, null, new AwS616S0100000_2(this, 21), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.06e5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1657506eL) obj).LLILZIL);
            }
        }, null, new AwS616S0100000_2(this, 22), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.06e7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657506eL) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 23), 4);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.06e8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657506eL) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 24), 4);
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.06e1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1655406e0) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS438S0200000_2(this, view, 4), 4);
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.06e2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1655406e0) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 20), 4);
        C723850SaN.LIZLLL(this, new AwS90S0110000_2(this, z, 0));
        if (Jo().xQ2().LJIJ()) {
            C441201ne.LIZ(this, new C1768806wI(Jo().xQ2().LJIL, 19), "RecordTipAssem", new AwS581S0100000_2(this, 686));
            C1656506eB.LIZ(this, (ViewGroup) view.findViewById(R.id.dpp), Jo().xQ2().LJIILIIL);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class});
        c0qsjLIZIZ.bindAbility(No(), InterfaceC1655706e3.class);
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        c0qsjLIZIZ.bindAbility(assemVMLazy.getValue(), InterfaceC1693006k4.class);
    }
}
