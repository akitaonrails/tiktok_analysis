package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel;

import X.AnonymousClass0951;
import X.C019F;
import X.C01GW;
import X.C1163440gNi;
import X.C123100dR;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1640006bW;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C450250Hl9;
import X.C452501pT;
import X.C457780HxI;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723580SZw;
import X.C723850SaN;
import X.C724750Sbp;
import X.C845280XDy;
import X.InterfaceC1632206aG;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.gesture.ChatroomBackPressProtocol;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class ChatRoomPanelAssemV2 extends BasePanelContainerAssem implements ChatroomBackPressProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJIII;
    public final C630740Ooa LLJJIJI;
    public final C1559260qg8 LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatRoomPanelAssemV2.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ChatRoomPanelAssemV2() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputFieldVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 525), AFwS236S0000000_6.get$arr$(131), null, true);
        this.LLJJIJI = C628500Oky.LIZ(new AwS550S0100000_6(this, 255));
        this.LLJJIJIIJIL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 256));
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem
    public final boolean Lo() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility
    public final void Fr() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        ((InputFieldVM) assemVMLazy.getValue()).LLJZIJLIL();
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem
    public final boolean No() {
        return ((Boolean) this.LLJJIJIL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem
    public final void Vo() {
        SessionInfo sessionInfo;
        String uuid;
        SessionInfo sessionInfo2;
        String uuid2;
        MessageReplyVM messageReplyVM;
        AnonymousClass0951 anonymousClass0951;
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        boolean z = C123100dR.LIZ(((C1640006bW) ((InputFieldVM) assemVMLazy.getValue()).LLILLJJLI.getValue()).LIZIZ) || !((messageReplyVM = (MessageReplyVM) this.LLJJIJI.getValue()) == null || (anonymousClass0951 = messageReplyVM.LLILLJJLI) == null || anonymousClass0951.getValue() == null);
        C457780HxI c457780HxI = (C457780HxI) this.LLJJIJIIJIL.getValue();
        if (c457780HxI == null || !c457780HxI.LLILLJJLI) {
            Boolean boolValueOf = Boolean.valueOf(z);
            C457780HxI c457780HxI2 = (C457780HxI) this.LLJJIJIIJIL.getValue();
            if (c457780HxI2 == null || (sessionInfo = c457780HxI2.LL) == null || (uuid = sessionInfo.getUuid()) == null) {
                return;
            }
            C845280XDy.LIZ(null, boolValueOf, uuid, 18);
            return;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z);
        C457780HxI c457780HxI3 = (C457780HxI) this.LLJJIJIIJIL.getValue();
        if (c457780HxI3 == null || (sessionInfo2 = c457780HxI3.LL) == null || (uuid2 = sessionInfo2.getUuid()) == null) {
            return;
        }
        C845280XDy.LIZ("chat_panel", boolValueOf2, uuid2, 16);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.gesture.ChatroomBackPressProtocol
    public final boolean LLZLL() {
        return So();
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, ChatroomBackPressProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatRoomPanelAssemV2$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, ChatroomBackPressProtocol.class, this);
                    }
                }
            });
        }
        C450250Hl9 c450250Hl9 = new C450250Hl9(C13LE.LIZ(InterfaceC1632206aG.class));
        c450250Hl9.LL = C13LE.LIZ(ChatroomEmojiPanelAssem.class);
        c450250Hl9.LLJIJIL = C1163440gNi.LIZJ;
        C723850SaN.LIZLLL(this, new AwS372S0200000_6(this, c450250Hl9, 12));
    }
}
