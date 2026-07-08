package com.bytedance.android.livesdk.comp.impl.linkcore;

import X.C001A;
import X.C0UVS;
import X.C1161920gLG;
import X.C11NJ;
import X.C1304610k3P;
import X.C1304630k3R;
import X.C13LP;
import X.C1AZW;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C927920aFq;
import X.C931800aM6;
import X.C965340bEC;
import X.C965660bEi;
import X.C965670bEj;
import X.C965700bEm;
import X.C965710bEn;
import X.C965750bEr;
import X.C965770bEt;
import X.C966350bFp;
import X.C966430bFx;
import X.C966560bGA;
import X.C969310bKb;
import X.EnumC1303240k1C;
import X.InterfaceC927230aEj;
import X.InterfaceC945140ahc;
import X.InterfaceC954180awC;
import X.InterfaceC968120bIg;
import X.RunnableC966320bFm;
import android.os.Looper;
import com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicTrackerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtLinkMicRustObtainSetting;
import com.bytedance.android.livesdk.model.message.linkcore.CreateChannelContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class LinkCoreService implements ILinkCoreService, OnIMMessageListener {
    public volatile boolean LL;
    public long LLILLJJLI;
    public Room LLILZ;
    public boolean LLILLL = true;
    public final C11NJ LLILZIL = new C11NJ();
    public final CopyOnWriteArrayList<InterfaceC968120bIg> LLILZLL = new CopyOnWriteArrayList<>();
    public final HashMap<Integer, Boolean> LLIZ = new HashMap<>(C2097608Jq.LJIIIIZZ(new Pair(4, Boolean.FALSE), new Pair(2, Boolean.TRUE)));

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "LinkCoreService";
    }

    public final void LIZLLL() {
        C1AZW.LJIIJ(12, LIZJ(161), "unbind start", null, null);
        if (!this.LL) {
            C1AZW.LJFF(LIZJ(149), "unbind mIsInitialized == false ", null, null);
            return;
        }
        this.LL = false;
        IMessageManager iMessageManager = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(this.LLILLJJLI);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        if (this.LLILZIL.LLILLJJLI) {
            return;
        }
        this.LLILZIL.dispose();
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService
    public final boolean Nq1() {
        boolean z = C965700bEm.LIZ;
        return C965700bEm.LIZ;
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService
    public final void c60() {
        boolean z = C965700bEm.LIZ;
        C965770bEt c965770bEt = new C965770bEt("LinkCoreService");
        C969310bKb c969310bKb = C969310bKb.LIZLLL;
        if (Intrinsics.LJFF(c969310bKb.LIZIZ, Looper.myLooper())) {
            c965770bEt.invoke();
        } else {
            c969310bKb.LIZ(new RunnableC966320bFm(c965770bEt));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0aFq] */
    @Override // com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService
    public final C927920aFq iN() {
        return new C0UVS() { // from class: X.0aFq
            @Override // X.C0UVS
            public final void LIZ(int i, String str, boolean z) {
            }

            @Override // X.C0UVS
            public final void onFailed() {
            }

            @Override // X.C0UVS
            public final void onSuccess() {
            }
        };
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService
    public final String vM2() {
        C965670bEj c965670bEj;
        Pair pair;
        C965340bEC c965340bEC;
        C965660bEi c965660bEi;
        C965340bEC c965340bEC2;
        C931800aM6.LIZ.getClass();
        String strLLF = null;
        strLLF = null;
        if (C931800aM6.LIZIZ()) {
            Object objLJJJLIIL = C13LP.LJJJLIIL(C965750bEr.LIZIZ.values());
            if (!(objLJJJLIIL instanceof C965660bEi) || (c965660bEi = (C965660bEi) objLJJJLIIL) == null) {
                return null;
            }
            InterfaceC954180awC interfaceC954180awCLJIIIZ = c965660bEi.LJIIIZ();
            String strLLF2 = (!(interfaceC954180awCLJIIIZ instanceof C965340bEC) || (c965340bEC2 = (C965340bEC) interfaceC954180awCLJIIIZ) == null) ? null : c965340bEC2.LJFF.LJ().LLF();
            Boolean bool = interfaceC954180awCLJIIIZ != null ? Boolean.TRUE : null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(bool);
            sbLIZ.append("_@_");
            sbLIZ.append(strLLF2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        Object objLJJJLIIL2 = C13LP.LJJJLIIL(C965750bEr.LIZIZ.values());
        if (!(objLJJJLIIL2 instanceof C965670bEj) || (c965670bEj = (C965670bEj) objLJJJLIIL2) == null) {
            return null;
        }
        CopyOnWriteArrayList<InterfaceC954180awC> copyOnWriteArrayList = c965670bEj.LJFF;
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC954180awC interfaceC954180awC : copyOnWriteArrayList) {
                if (interfaceC954180awC instanceof C965340bEC) {
                    arrayList.add(interfaceC954180awC);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InterfaceC954180awC) obj).scene() == 4) {
                    arrayList2.add(obj);
                } else {
                    arrayList3.add(obj);
                }
            }
            pair = new Pair(arrayList2, arrayList3);
        } else {
            pair = new Pair(null, null);
        }
        List list = (List) pair.getFirst();
        List list2 = (List) pair.getSecond();
        InterfaceC954180awC interfaceC954180awC2 = list != null ? (InterfaceC954180awC) C13LP.LJJJLL(list) : null;
        if ((interfaceC954180awC2 instanceof C965340bEC) && (c965340bEC = (C965340bEC) interfaceC954180awC2) != null) {
            strLLF = c965340bEC.LJFF.LJ().LLF();
        }
        boolean z = (list == null || C13LP.LJJJLL(list) == null) ? false : true;
        boolean z2 = (list2 == null || C13LP.LJJJLL(list2) == null) ? false : true;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(z);
        sbLIZ2.append("_@_");
        sbLIZ2.append(z2);
        sbLIZ2.append("_@_");
        sbLIZ2.append(strLLF);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService
    public final InterfaceC927230aEj yd2() {
        return LinkMicTrackerSetting.INSTANCE.enable() ? C1304610k3P.LIZ : C966350bFp.LIZ;
    }

    public static boolean LIZIZ() {
        if (MtLinkMicRustObtainSetting.obtainBySoCheck() && (C965700bEm.LIZIZ || !C965700bEm.LIZ)) {
            C1304630k3R.LJII(6, "[So unReady] try obtain rust session without link_mic so", "RustLinker");
            return false;
        }
        if (!MtLinkMicRustObtainSetting.obtainByPluginCheck() || (!C965700bEm.LIZIZ)) {
            return true;
        }
        C1304630k3R.LJII(6, "[Plugin unReady] try obtain rust session without link_mic plugin", "RustLinker");
        return false;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public final String LIZJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.LINKER.getValue());
        sbLIZ.append("_LinkCoreService_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Long lValueOf;
        Player player;
        C1AZW c1azw = C1AZW.LIZ;
        String strLIZJ = LIZJ(216);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMessage start messageId=");
        if (iMessage != null) {
            lValueOf = Long.valueOf(iMessage.getMessageId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(strLIZJ, strLIZIZ, null, null);
        if (iMessage instanceof LinkLayerMessage) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("msg_id:");
            LinkLayerMessage linkLayerMessage = (LinkLayerMessage) iMessage;
            sbLIZ2.append(linkLayerMessage.getMessageId());
            sbLIZ2.append(" msg_type:");
            sbLIZ2.append(linkLayerMessage.messageType);
            sbLIZ2.append(" channel_id:");
            sbLIZ2.append(linkLayerMessage.channelId);
            sbLIZ2.append(" msg_time:");
            sbLIZ2.append(linkLayerMessage.baseMessage.createTime);
            sbLIZ2.append(", scene:");
            sbLIZ2.append(linkLayerMessage.scene);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c1azw.getClass();
            C1AZW.LIZ("LinkLayerMessageIM", strLIZIZ2, null, null);
            if ((linkLayerMessage.scene == 2 && !Intrinsics.LJFF(this.LLIZ.get(2), Boolean.TRUE)) || (linkLayerMessage.scene == 4 && !Intrinsics.LJFF(this.LLIZ.get(4), Boolean.TRUE))) {
                if (linkLayerMessage.messageType != 1) {
                    for (Object obj : C965750bEr.LIZIZ.values()) {
                        if (((InterfaceC945140ahc) obj).LIZ(linkLayerMessage.scene, String.valueOf(linkLayerMessage.channelId))) {
                            if (obj == null) {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (!LIZIZ()) {
                    return;
                }
                int i = linkLayerMessage.messageType;
                if (i != 1) {
                    if (i == 10) {
                        C500260Jjc.LJJLIIIJILLIZJL(new C966430bFx(this, new C965710bEn(linkLayerMessage.channelId, linkLayerMessage.scene, this.LLILZ, linkLayerMessage, false, false, 48)));
                        return;
                    }
                    return;
                }
                CreateChannelContent createChannelContent = linkLayerMessage.createChannelContent;
                if (createChannelContent != null && (player = createChannelContent.owner) != null && UserService.getInstance().user().getCurrentUserId() == player.uid) {
                    C1AZW.LJFF(LIZJ(284), "onLinkLayerMessage ignore msg, because channel has been created as anchor", null, null);
                    return;
                } else {
                    C500260Jjc.LJJLIIIJILLIZJL(new C966560bGA(this, new C965710bEn(linkLayerMessage.channelId, linkLayerMessage.scene, this.LLILZ, linkLayerMessage, false, false, 48)));
                    return;
                }
            }
            C1AZW.LJFF(LIZJ(229), "onMessage sdk is disabled, not to handle message", null, null);
        }
    }

    public final void LIZ(boolean z, Room room) {
        String strLIZJ = LIZJ(140);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindRoom start room=");
        sbLIZ.append(room.getId());
        C1AZW.LJIIJ(12, strLIZJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (this.LL) {
            return;
        }
        this.LL = true;
        this.LLILZ = room;
        this.LLILLJJLI = room.getId();
        room.getOwnerUserId();
        this.LLILLL = z;
        IMessageManager iMessageManager = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(this.LLILLJJLI);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.BASE_LINK_LAYER_MESSAGE.getIntType(), (OnIMMessageListener) this);
            iMessageManager.addMessageListener(C001A.MEMBER.getIntType(), (OnIMMessageListener) this);
            iMessageManager.addMessageListener(C001A.LINK_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
    }
}
