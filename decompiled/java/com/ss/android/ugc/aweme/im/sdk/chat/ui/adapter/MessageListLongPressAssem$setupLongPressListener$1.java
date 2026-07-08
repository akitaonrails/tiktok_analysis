package com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter;

import X.C06Z6;
import X.C0QSJ;
import X.C0Y7P;
import X.C0ZL0;
import X.C0ZL8;
import X.C0ZL9;
import X.C0ZLJ;
import X.C0ZLK;
import X.C0ZLT;
import X.C0ZLU;
import X.C13BV;
import X.C1509705vb;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C447810HhD;
import X.C455260HtE;
import X.C458750Hyr;
import X.C687700QyG;
import X.C724240Sb0;
import X.C738120SxO;
import X.C893630Z3x;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC904740ZeS;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatroom.api.animation.IAnimationQueueManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.ChatNoticeAbility;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageListLongPressAssem$setupLongPressListener$1 implements C0ZL8, IMessageEventProtocol {
    public boolean LL;
    public final C06Z6 LLILLJJLI = C06Z6.MAIN;
    public final /* synthetic */ C893630Z3x LLILLL;
    public final /* synthetic */ MessageListLongPressAssem LLILZ;

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
    }

    @Override // X.C0ZL8
    public final void LIZJ() {
        ChatLinearLayoutManager chatLinearLayoutManager;
        RecyclerView recyclerViewLLII;
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL(this.LLILZ), ChatRoomScope.class);
        RecyclerView.LayoutManager layoutManager = null;
        Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(MessagePowerListAbility.class) : null;
        if (!(ability instanceof MessagePowerListAbility)) {
            ability = null;
        }
        MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) ability;
        if (messagePowerListAbility != null && (recyclerViewLLII = messagePowerListAbility.LLII()) != null) {
            layoutManager = recyclerViewLLII.getLayoutManager();
        }
        if ((layoutManager instanceof ChatLinearLayoutManager) && (chatLinearLayoutManager = (ChatLinearLayoutManager) layoutManager) != null) {
            chatLinearLayoutManager.LJIJI(true);
        }
        if (Intrinsics.LJFF(this.LLILZ.Jo().LLIZ.getValue(), C458750Hyr.LL)) {
            try {
                AssemVMLazy assemVMLazy = this.LLILZ.LLJILLL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MessageListLongPressAssem.LLJJJ;
                ((InputFieldVM) assemVMLazy.getValue()).LLJZIJLIL();
            } catch (C738120SxO e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LLILZ.Ho().LL.setValue(new C0ZLT());
    }

    @Override // X.C0ZL8
    public final C0ZL9 LIZLLL() {
        Fragment fragmentLJI = C724240Sb0.LJI(this.LLILZ);
        boolean z = false;
        if (fragmentLJI != null) {
            C1554610qYd.LIZJ(C1558360qeg.LJFF(fragmentLJI, null), IMessageEventProtocol.class, C1697810uHb.LJIILJJIL(this));
        }
        this.LLILZ.Ho().LL.setValue(C0ZLK.LIZ);
        if (this.LLILZ.Jo().LLIZ.getValue() instanceof C447810HhD) {
            this.LLILZ.Jo().jt(C458750Hyr.LL, ((Number) this.LLILZ.Jo().LLIZLLLIL.getValue()).intValue());
        }
        ChatNoticeAbility chatNoticeAbility = (ChatNoticeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILZ), ChatNoticeAbility.class, null);
        if (chatNoticeAbility != null && chatNoticeAbility.ny()) {
            ChatNoticeAbility chatNoticeAbility2 = (ChatNoticeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILZ), ChatNoticeAbility.class, null);
            if (chatNoticeAbility2 != null) {
                chatNoticeAbility2.DQ0();
            }
            z = true;
        }
        ChatNoticeAbility chatNoticeAbility3 = (ChatNoticeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILZ), ChatNoticeAbility.class, null);
        if (chatNoticeAbility3 != null) {
            chatNoticeAbility3.Oi1();
        }
        return z ? C0ZL9.BANNER_DISMISS : C0ZL9.NONE;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final C06Z6 mh1() {
        return this.LLILLJJLI;
    }

    @Override // X.C0ZL8
    public final void LIZ(C0ZL0 c0zl0) {
        Object ability;
        Fragment fragmentLJI = C724240Sb0.LJI(this.LLILZ);
        if (fragmentLJI != null) {
            C1554610qYd.LIZLLL(C1558360qeg.LJFF(fragmentLJI, null), IMessageEventProtocol.class, this);
        }
        ChatNoticeAbility chatNoticeAbility = (ChatNoticeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILZ), ChatNoticeAbility.class, null);
        if (chatNoticeAbility != null) {
            chatNoticeAbility.DQ0();
        }
        ChatNoticeAbility chatNoticeAbility2 = (ChatNoticeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILZ), ChatNoticeAbility.class, null);
        if (chatNoticeAbility2 != null) {
            chatNoticeAbility2.f81();
        }
        if (c0zl0 == C0ZL0.DISMISS_ENTER_AI_MOJI_CREATION) {
            IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJLIIIJILLIZJL().LIZIZ(C455260HtE.LIZ((SessionInfo) this.LLILZ.LLJ.getValue(), "reaction_view"));
        }
        if (c0zl0 == C0ZL0.REPLY) {
            try {
                AssemVMLazy assemVMLazy = this.LLILZ.LLJILLL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MessageListLongPressAssem.LLJJJ;
                ((InputFieldVM) assemVMLazy.getValue()).LLJZIJLIL();
            } catch (C738120SxO e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (this.LL) {
            this.LL = false;
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL(this.LLILZ), ChatRoomScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(ChatroomEventAbility.class);
            } else {
                ability = null;
            }
            if (!(ability instanceof ChatroomEventAbility)) {
                ability = null;
            }
            ChatroomEventAbility chatroomEventAbility = (ChatroomEventAbility) ability;
            if (chatroomEventAbility != null) {
                chatroomEventAbility.QU0(new C1509705vb(C13BV.INSTANCE, -1, new C0Y7P()));
            }
        }
        this.LLILZ.Ho().LL.setValue(C0ZLJ.LIZ);
        IAnimationQueueManager iAnimationQueueManager = (IAnimationQueueManager) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILZ), IAnimationQueueManager.class, null);
        if (iAnimationQueueManager != null) {
            iAnimationQueueManager.setLongPressPopupShowing(false);
        }
        IAnimationQueueManager iAnimationQueueManager2 = (IAnimationQueueManager) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILZ), IAnimationQueueManager.class, null);
        if (iAnimationQueueManager2 != null) {
            iAnimationQueueManager2.onPopupOrSheetDismissed(false);
        }
    }

    @Override // X.C0ZL8
    public final void onShow(boolean z) {
        Object ability;
        RecyclerView.LayoutManager layoutManager;
        ChatLinearLayoutManager chatLinearLayoutManager;
        RecyclerView recyclerViewLLII;
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL(this.LLILZ), ChatRoomScope.class);
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(MessagePowerListAbility.class);
        } else {
            ability = null;
        }
        if (!(ability instanceof MessagePowerListAbility)) {
            ability = null;
        }
        MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) ability;
        if (messagePowerListAbility != null && (recyclerViewLLII = messagePowerListAbility.LLII()) != null) {
            layoutManager = recyclerViewLLII.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if ((layoutManager instanceof ChatLinearLayoutManager) && (chatLinearLayoutManager = (ChatLinearLayoutManager) layoutManager) != null) {
            chatLinearLayoutManager.LJIJI(false);
        }
        ChatNoticeAbility chatNoticeAbility = (ChatNoticeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILZ), ChatNoticeAbility.class, null);
        if (chatNoticeAbility != null) {
            chatNoticeAbility.DQ0();
        }
        this.LLILZ.Ho().LL.setValue(new C0ZLU());
        IAnimationQueueManager iAnimationQueueManager = (IAnimationQueueManager) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILZ), IAnimationQueueManager.class, null);
        if (iAnimationQueueManager != null) {
            iAnimationQueueManager.setLongPressPopupShowing(true);
        }
    }

    public MessageListLongPressAssem$setupLongPressListener$1(C893630Z3x c893630Z3x, MessageListLongPressAssem messageListLongPressAssem) {
        this.LLILLL = c893630Z3x;
        this.LLILZ = messageListLongPressAssem;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final Object NX1(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean z;
        if (this.LLILLL.LJFF()) {
            z = true;
            this.LL = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
