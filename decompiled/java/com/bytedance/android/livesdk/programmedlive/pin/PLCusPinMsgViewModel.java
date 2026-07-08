package com.bytedance.android.livesdk.programmedlive.pin;

import X.AnonymousClass0956;
import X.C001A;
import X.C08II;
import X.C0IJT;
import X.C1078560eAo;
import X.C1090030eTJ;
import X.C1090140eTU;
import X.C1109600eys;
import X.C1954807lC;
import X.C20337914i1;
import X.C2188811AlT;
import X.C325480CpO;
import X.C474500IjA;
import X.C776250Uch;
import X.EnumC325470CpN;
import X.InterfaceC1090080eTO;
import X.InterfaceC1106030et7;
import X.InterfaceC1111870f2X;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.liveinteract.api.VoiceChatLayoutChannel;
import com.bytedance.android.livesdk.dataChannel.ProgrammedPinnedAvoidEvent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class PLCusPinMsgViewModel extends ViewModel implements InterfaceC1090080eTO, OnIMMessageListener {
    public final DataChannel LL;
    public C1090140eTU LLILLJJLI;
    public AnonymousClass0956 LLILLL;
    public AnonymousClass0956 LLILZ;
    public final List<Observer<C1109600eys<? extends InterfaceC1111870f2X>>> LLILZIL = new ArrayList();
    public final String LLILZLL = String.valueOf(UserService.getInstance().user().getCurrentUserId());
    public boolean LLIZ;
    public boolean LLIZLLLIL;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "program_live_custom_message";
    }

    @Override // X.InterfaceC1090080eTO
    public final void init() {
        IMessageManager iMessageManager = (IMessageManager) this.LL.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.COMMERCIAL_CUSTOM_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
        DataChannel dataChannel = this.LL;
        dataChannel.BQ2(dataChannel.LLILZ, LinkCrossRoomStateChangeEvent.class, new AwS596S0100000_17(this, 648));
        DataChannel dataChannel2 = this.LL;
        dataChannel2.BQ2(dataChannel2.LLILZ, VoiceChatLayoutChannel.class, new AwS596S0100000_17(this, 649));
        DataChannel dataChannel3 = this.LL;
        dataChannel3.BQ2(dataChannel3.LLILZ, MultiLiveRTCLayoutChannel.class, new AwS596S0100000_17(this, 650));
    }

    @Override // X.InterfaceC1090080eTO
    public final void clearData() {
        onCleared();
        AnonymousClass0956 anonymousClass0956 = this.LLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLILLL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLJJLI = null;
        IMessageManager iMessageManager = (IMessageManager) this.LL.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        ((ArrayList) this.LLILZIL).clear();
    }

    @Override // X.InterfaceC1090080eTO
    public final C1090140eTU DD0() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public PLCusPinMsgViewModel(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    @Override // X.InterfaceC1090080eTO
    public final void MJ1(Observer<C1109600eys<? extends InterfaceC1111870f2X>> observer) {
        if (!((ArrayList) this.LLILZIL).contains(observer)) {
            ((ArrayList) this.LLILZIL).add(observer);
            C1090140eTU c1090140eTU = this.LLILLJJLI;
            if (c1090140eTU != null) {
                vQ2(c1090140eTU, observer);
                return;
            }
            return;
        }
        C1090140eTU c1090140eTU2 = this.LLILLJJLI;
        if (c1090140eTU2 == null) {
            return;
        }
        vQ2(c1090140eTU2, observer);
    }

    @Override // X.InterfaceC1090080eTO
    public final void T51(EnumC325470CpN enumC325470CpN) {
        Long lValueOf;
        C1090030eTJ c1090030eTJ;
        if (this.LLILLJJLI == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_customer_message_cover");
        c474500IjALIZ.LJIIIIZZ();
        C1090140eTU c1090140eTU = this.LLILLJJLI;
        if (c1090140eTU != null && (c1090030eTJ = c1090140eTU.LIZ) != null) {
            lValueOf = Long.valueOf(c1090030eTJ.LIZ.customMessageId);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "message_id");
        int i = C325480CpO.LIZ[enumC325470CpN.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            c474500IjALIZ.LJJII(1, "if_star_comment_self");
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        c474500IjALIZ.LJJII(1, "if_star_comment_other");
                    }
                } else {
                    c474500IjALIZ.LJJII(1, "if_broadcast");
                }
            } else {
                c474500IjALIZ.LJJII(1, "if_pin_comment");
            }
        } else {
            c474500IjALIZ.LJJII(1, "if_comment_tray");
        }
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.bytedance.android.livesdk.model.message.CommercialCustomMessage
            if (r0 == 0) goto L87
            boolean r0 = X.C1078560eAo.LIZ
            r0 = r5
            com.bytedance.android.livesdk.model.message.CommercialCustomMessage r0 = (com.bytedance.android.livesdk.model.message.CommercialCustomMessage) r0
            long r0 = r0.customMessageId
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r4.LLILZLL
            boolean r0 = X.C1078560eAo.LIZ
            if (r0 == 0) goto L42
            com.bytedance.android.livesdk.programmedlive.pin.LivePlCusMsgFrequencySettingSetting r0 = com.bytedance.android.livesdk.programmedlive.pin.LivePlCusMsgFrequencySettingSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto L3d
            X.14i1<X.08II<java.lang.String, java.lang.String>> r0 = X.InterfaceC1106030et7.D7
            java.lang.Object r0 = r0.LIZIZ()
            X.08II r0 = (X.C08II) r0
            java.util.Set r1 = r0.keySet()
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            boolean r0 = r1.contains(r0)
        L3b:
            if (r0 != 0) goto L87
        L3d:
            X.0eTU r0 = r4.LLILLJJLI
            if (r0 == 0) goto L61
            return
        L42:
            X.14i1<X.08II<java.lang.String, java.lang.String>> r0 = X.InterfaceC1106030et7.D7
            java.lang.Object r0 = r0.LIZIZ()
            X.08II r0 = (X.C08II) r0
            java.util.Set r1 = r0.keySet()
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            boolean r0 = r1.contains(r0)
            goto L3b
        L61:
            X.0956 r0 = r4.LLILZ
            r3 = 0
            if (r0 == 0) goto L75
            boolean r0 = r0.isActive()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L6e:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L77
            return
        L75:
            r0 = r3
            goto L6e
        L77:
            X.01wk r2 = androidx.lifecycle.ViewModelKt.getViewModelScope(r4)
            X.0edE r1 = new X.0edE
            r1.<init>(r5, r4, r3)
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
            r4.LLILZ = r0
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.programmedlive.pin.PLCusPinMsgViewModel.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public final void wQ2(boolean z) {
        if (this.LLIZLLLIL != z) {
            this.LLIZLLLIL = z;
            this.LL.zW(ProgrammedPinnedAvoidEvent.class, Boolean.valueOf(z));
        }
    }

    public final void vQ2(C1090140eTU c1090140eTU, Observer<C1109600eys<? extends InterfaceC1111870f2X>> observer) {
        observer.onChanged(c1090140eTU);
        if (!c1090140eTU.LJFF && this.LLIZ) {
            wQ2(true);
        } else {
            wQ2(false);
        }
        boolean z = C1078560eAo.LIZ;
        String strValueOf = String.valueOf(c1090140eTU.LJIIIZ.LIZ.customMessageId);
        String str = this.LLILZLL;
        C20337914i1<C08II<String, String>> c20337914i1 = InterfaceC1106030et7.D7;
        C08II<String, String> c08iiLIZIZ = c20337914i1.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strValueOf);
        sbLIZ.append(str);
        c08iiLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ), strValueOf);
        c20337914i1.LIZJ();
    }
}
