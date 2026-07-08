package com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter;

import X.AbstractC1711506n3;
import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C069P;
import X.C06Z6;
import X.C09R3;
import X.C0I61;
import X.C0I6C;
import X.C0YUT;
import X.C0ZDX;
import X.C0ZFW;
import X.C0ZL0;
import X.C0ZL4;
import X.C0ZLB;
import X.C0ZLD;
import X.C0ZLE;
import X.C0ZLK;
import X.C0ZLS;
import X.C0ZLU;
import X.C0ZQZ;
import X.C13LE;
import X.C1509305vX;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1629106Zl;
import X.C1635106aj;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C330250Cx5;
import X.C452501pT;
import X.C457780HxI;
import X.C458750Hyr;
import X.C459060HzM;
import X.C687700QyG;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C869590Y9l;
import X.C889260Yua;
import X.C893630Z3x;
import X.C893640Z3y;
import X.C896070ZDh;
import X.C898020ZKu;
import X.C913300ZsG;
import X.EnumC898060ZKy;
import X.EnumC899370ZPz;
import X.EnumC912790ZrR;
import X.InterfaceC1146704e9;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC904740ZeS;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.gesture.ChatroomBackPressProtocol;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.common.protocol.InterceptKeyboardCloseProtocol;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListLongPressAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.ChatLongPressVM;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaCreationBridgeApi;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.LongPressConfig;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.LongPressViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageListLongPressAssem extends UIContentAssem implements MessageListLongPressAbility, ChatroomBackPressProtocol, InterceptKeyboardCloseProtocol, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJ = C1509305vX.LIZ(new AwS558S0100000_14(this, 682));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 388));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 679));
    public final C01GW LLJILJIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 680));
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public final C01GW LLJJI;
    public AnonymousClass0956 LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final MessageListLongPressAssem$selectionMessageEventProtocol$1 LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageListLongPressAssem.class, "longPressVM", "getLongPressVM()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/ChatLongPressVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MessageListLongPressAssem.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MessageListLongPressAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.MessageListLongPressAssem$selectionMessageEventProtocol$1] */
    public MessageListLongPressAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatLongPressVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 389), AFwS248S0000000_14.get$arr$(169), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(InputFieldVM.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 390), AFwS248S0000000_14.get$arr$(170), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 391), AFwS248S0000000_14.get$arr$(171), null, true);
        this.LLJJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 681));
        this.LLJJIJIL = new IMessageEventProtocol() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.MessageListLongPressAssem$selectionMessageEventProtocol$1
            public final C06Z6 LL = C06Z6.MAIN;

            @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
            public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
            }

            @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
            public final C06Z6 mh1() {
                return this.LL;
            }

            @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
            public final Object NX1(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                IMSelectTextAbility iMSelectTextAbility = (IMSelectTextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILLJJLI), IMSelectTextAbility.class, null);
                if (iMSelectTextAbility != null && iMSelectTextAbility.VU()) {
                    this.LLILLJJLI.LLJJIJI = true;
                    return true;
                }
                return false;
            }
        };
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

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC458990HzF
    public final boolean of(int i, KeyEvent keyEvent) {
        return false;
    }

    public final C893630Z3x Go() {
        return (C893630Z3x) this.LLJILJIL.getValue();
    }

    public final ChatLongPressVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (ChatLongPressVM) assemVMLazy.getValue();
    }

    public final PanelStateViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (PanelStateViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListLongPressAbility
    public final C898020ZKu Eb1() {
        C893630Z3x c893630Z3xGo = Go();
        SessionInfo sessionInfo = c893630Z3xGo.LLILLL;
        MessageReplyVM messageReplyVM = (MessageReplyVM) c893630Z3xGo.LLJILLL.getValue();
        AssemVMLazy assemVMLazy = c893630Z3xGo.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C893630Z3x.LLJJL;
        return new C898020ZKu(sessionInfo, messageReplyVM, new AwS593S0100000_14(c893630Z3xGo, 349), new AwS628S0100000_14(c893630Z3xGo, 78), new AwS616S0100000_2(c893630Z3xGo, 145), (LongPressViewModel) assemVMLazy.getValue(), (PanelStateViewModel) c893630Z3xGo.LLJILJILJ.getValue(), new AwS628S0100000_14(c893630Z3xGo, 77), new AwS558S0100000_14(c893630Z3xGo, 1607), new C889260Yua(c893630Z3xGo));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListLongPressAbility
    public final void Fy2() {
        C893630Z3x c893630Z3xGo = Go();
        c893630Z3xGo.getClass();
        c893630Z3xGo.LIZLLL(C0ZL0.DISMISS, null);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.gesture.ChatroomBackPressProtocol
    public final boolean LLZLL() {
        boolean zLJFF = Go().LJFF();
        if (zLJFF) {
            C893630Z3x c893630Z3xGo = Go();
            c893630Z3xGo.getClass();
            c893630Z3xGo.LIZLLL(C0ZL0.DISMISS, null);
        }
        return zLJFF;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListLongPressAbility
    public final AnonymousClass0951 gg2() {
        return Go().LLJJIII;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LLIZLLLIL.getValue();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            final InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, ChatroomBackPressProtocol.class, C1697810uHb.LJIILJJIL(this));
            Lifecycle lifecycle = getLifecycle();
            if (lifecycle != null) {
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.MessageListLongPressAssem$onCreate$lambda$0$$inlined$registerProtocol$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, ChatroomBackPressProtocol.class, this);
                        }
                    }
                });
            }
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, InterceptKeyboardCloseProtocol.class, C1697810uHb.LJIILJJIL(this));
            Lifecycle lifecycle2 = getLifecycle();
            if (lifecycle2 != null) {
                lifecycle2.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.MessageListLongPressAssem$onCreate$lambda$0$$inlined$registerProtocol$2
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, InterceptKeyboardCloseProtocol.class, this);
                        }
                    }
                });
            }
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListLongPressAbility.class, null, this);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJJIII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJIII = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C330250Cx5(this, null), 3);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLJJIII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJIII = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        C0ZQZ c0zqz;
        C893640Z3y c893640Z3y;
        super.onPause();
        C0ZQZ c0zqz2 = (C0ZQZ) this.LLJIJIL.getValue();
        if (c0zqz2 == null || !c0zqz2.LIZJ() || (c0zqz = (C0ZQZ) this.LLJIJIL.getValue()) == null || (c893640Z3y = (C893640Z3y) c0zqz.LIZ()) == null) {
            return;
        }
        c893640Z3y.LIZ(C0ZL0.DISMISS);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (Intrinsics.LJFF(Jo().LLIZ.getValue(), C458750Hyr.LL)) {
            Object value = Ho().LLILLJJLI.getValue();
            if (Intrinsics.LJFF(value, C0ZLK.LIZ) || (value instanceof C0ZLU)) {
                return;
            }
            PanelStateViewModel panelStateViewModelJo = Jo();
            panelStateViewModelJo.jt(C1629106Zl.LL, panelStateViewModelJo.Ke().getValue().intValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListLongPressAbility
    public final boolean KL0(C869590Y9l c869590Y9l) {
        C0ZL4 c0zl4;
        C893630Z3x c893630Z3xGo = Go();
        c893630Z3xGo.getClass();
        C0ZLD.LIZ.getClass();
        C0ZLD c0zldLIZ = C0ZLE.LIZ();
        if (c0zldLIZ == null || !c0zldLIZ.LJ()) {
            if (c869590Y9l.getConversationType() != AbstractC1711506n3.LIZIZ) {
                IMContactApi.LIZ.getClass();
                if (C069P.LIZ().LIZ().LJI() == EnumC899370ZPz.DISABLED) {
                    return false;
                }
            }
            AssemViewModel assemViewModel = (AssemViewModel) c893630Z3xGo.LLJIJIL.getValue();
            if (assemViewModel != null) {
                c0zl4 = ((C1635106aj) assemViewModel.getState()).LL;
            } else {
                c0zl4 = null;
            }
            if (c0zl4 == C0ZL4.DISABLED || Intrinsics.LJFF(C0ZFW.LIZ.LJJIIJ(c869590Y9l.getConversationId()), Boolean.TRUE) || c869590Y9l.getMessageStatus() == C0YUT.RECALLED || c893630Z3xGo.LJ() == null) {
                return false;
            }
            if (C0ZDX.LJJI(c869590Y9l) && c869590Y9l.getMsgStatus() == 0) {
                IMMediaCreationBridgeApi.LIZ.getClass();
                IMMediaCreationBridgeApi value = C459060HzM.LIZIZ.getValue();
                if (value == null || value.LIZLLL(c869590Y9l.getUuid()) != -1) {
                    return false;
                }
            }
            if (C896070ZDh.LIZLLL(c869590Y9l, EnumC898060ZKy.LONG_PRESS) || c869590Y9l.getMsgStatus() == 1 || c869590Y9l.getMsgStatus() == 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02de  */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.List<X.0qm8<?>>] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Collection] */
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListLongPressAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oi0(final X.C0ZL3 r24) {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.MessageListLongPressAssem.Oi0(X.0ZL3):void");
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListLongPressAbility
    public final void Ug1(C0I6C c0i6c) {
        View viewLIZ;
        EnumC912790ZrR enumC912790ZrR;
        LongPressConfig.LegacyConfig.E2EMode e2EMode;
        C893630Z3x c893630Z3xGo = Go();
        IMSelectTextAbility iMSelectTextAbility = (IMSelectTextAbility) C1558520qew.LIZ(C1558360qeg.LJFF(c893630Z3xGo.LLILLJJLI, null), IMSelectTextAbility.class, null);
        if (iMSelectTextAbility != null) {
            iMSelectTextAbility.dl0(C0ZLS.LONG_PRESS);
        }
        ((C0ZLB) c893630Z3xGo.LLJJJJLIIL.getValue()).LIZJ = new ArrayList(c0i6c.LIZJ);
        ((C0ZLB) c893630Z3xGo.LLJJJJLIIL.getValue()).LIZLLL = c893630Z3xGo.LLJILJIL;
        C0ZLB c0zlb = (C0ZLB) c893630Z3xGo.LLJJJJLIIL.getValue();
        View view = c0i6c.LIZ;
        C0ZQZ<C893640Z3y> c0zqz = c893630Z3xGo.LLILZLL;
        if (c0zqz != null) {
            viewLIZ = c0zqz.LIZ();
        } else {
            viewLIZ = null;
        }
        int i = C0I61.LIZ[c0i6c.LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                enumC912790ZrR = EnumC912790ZrR.FROM_END;
            } else {
                throw new C1954807lC();
            }
        } else {
            enumC912790ZrR = EnumC912790ZrR.FROM_START;
        }
        LongPressConfig.ReactionConfig reactionConfig = new LongPressConfig.ReactionConfig(null, null, false, false, null, 31, null);
        if (c893630Z3xGo.LLILZ) {
            e2EMode = LongPressConfig.LegacyConfig.E2EMode.NAV_AND_STATUS_BAR_2_EDGE;
        } else if (C913300ZsG.LIZ.LIZ()) {
            e2EMode = LongPressConfig.LegacyConfig.E2EMode.STATUS_BAR_2_EDGE;
        } else {
            e2EMode = LongPressConfig.LegacyConfig.E2EMode.DISABLED;
        }
        c0zlb.LIZLLL(new LongPressConfig(view, view, viewLIZ, enumC912790ZrR, reactionConfig, new LongPressConfig.LegacyConfig(0, e2EMode), new LongPressConfig.MovingLongPressPanelConfig(c0i6c.LIZLLL, c0i6c.LJFF, c0i6c.LJ), null), 0);
    }
}
