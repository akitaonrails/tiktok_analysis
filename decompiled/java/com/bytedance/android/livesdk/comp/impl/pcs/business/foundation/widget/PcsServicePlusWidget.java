package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.widget;

import X.AbstractC1097350ef7;
import X.C001A;
import X.C054G;
import X.C0PEM;
import X.C0TZM;
import X.C1083940eJU;
import X.C1097400efC;
import X.C1148300fzI;
import X.C1161920gLG;
import X.C1DFH;
import X.C20441214yg;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C262100zr;
import X.C776250Uch;
import X.InterfaceC1083960eJW;
import X.InterfaceC1083970eJX;
import X.InterfaceC1103440eow;
import X.InterfaceC1106030et7;
import X.InterfaceC1141530foN;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsPreloadPinCardSetting;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.message.LiveIntroMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SMBInfo;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PcsServicePlusWidget extends RoomRecycleWidget implements InterfaceC1141530foN, OnMessageListener {
    public Room LL;
    public boolean LLILLJJLI;
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());
    public IMessageManager LLILZ;
    public AbstractC1097350ef7 LLILZIL;
    public C054G LLILZLL;
    public InterfaceC1083960eJW LLIZ;
    public InterfaceC1103440eow LLIZLLLIL;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C20441214yg.LJIIIZ("PcsServicePlusWidget", "onInit");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof LiveIntroMessage) {
            String str = ((LiveIntroMessage) iMessage).content;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Received intro: ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("PcsServicePlusWidget", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1106030et7.b8.LIZJ(str);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        super.onUnload(recycleSource);
        C20441214yg.LJIIIZ("PcsServicePlusWidget", "onUnLoad");
        this.LLILLL.removeCallbacksAndMessages(null);
        IMessageManager iMessageManager = this.LLILZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        AbstractC1097350ef7 abstractC1097350ef7 = this.LLILZIL;
        if (abstractC1097350ef7 != null) {
            C1097400efC.LIZJ(abstractC1097350ef7);
        }
        C054G c054g = this.LLILZLL;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        DataChannelGlobal.LLILZ.JQ2(C1148300fzI.class, null);
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        Room room;
        boolean zBooleanValue;
        String idStr;
        String string;
        String secUid;
        String string2;
        AbstractC1097350ef7 abstractC1097350ef7;
        InterfaceC2262081DgM currentUser;
        String secUid2;
        User owner;
        String secUid3;
        SMBInfo sMBInfo;
        Boolean bool;
        Boolean bool2;
        super.onLoad(recycleSource, objArr);
        C20441214yg.LJIIIZ("PcsServicePlusWidget", "onLoad");
        DataChannelGlobal.LLILZ.JQ2(C1148300fzI.class, this.dataChannel);
        DataChannel dataChannel = this.dataChannel;
        IMessageManager iMessageManager = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LL = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool2 = (Boolean) dataChannel2.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILLJJLI = zBooleanValue;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (bool = (Boolean) dataChannel3.gg0(C0TZM.class)) != null) {
            bool.booleanValue();
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            iMessageManager = (IMessageManager) dataChannel4.gg0(C776250Uch.class);
        }
        this.LLILZ = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.LIVE_INTRO_MESSAGE.getIntType(), this);
        }
        Room room2 = this.LL;
        String str = "";
        if (room2 != null) {
            User owner2 = room2.getOwner();
            if (owner2 == null || (secUid3 = owner2.getSecUid()) == null) {
                secUid3 = "";
            }
            String strValueOf = String.valueOf(room2.getId());
            InterfaceC1083970eJX interfaceC1083970eJXUN1 = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).UN1();
            C1DFH c1dfh = C0PEM.LIZ;
            C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
            this.LLILZLL = c054gLIZ;
            if (this.LLILLJJLI) {
                this.LLIZ = interfaceC1083970eJXUN1.LIZJ().LIZLLL(secUid3, strValueOf, c054gLIZ);
            } else {
                this.LLIZLLLIL = interfaceC1083970eJXUN1.LIZJ().LJ(secUid3, strValueOf, c054gLIZ);
            }
            Room room3 = this.LL;
            if (room3 != null && (sMBInfo = room3.smbInfo) != null) {
                int i = sMBInfo.optInStatus;
                long j = sMBInfo.activeSkuCount;
                InterfaceC1083960eJW interfaceC1083960eJW = this.LLIZ;
                if (interfaceC1083960eJW != null) {
                    interfaceC1083960eJW.LIZ(i, j);
                }
                InterfaceC1103440eow interfaceC1103440eow = this.LLIZLLLIL;
                if (interfaceC1103440eow != null) {
                    interfaceC1103440eow.LIZ(i, j);
                }
            }
        }
        C1097400efC.LIZ();
        if (C1083940eJU.LIZIZ(this.LL)) {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            Room room4 = this.LL;
            if (room4 == null || (idStr = room4.getIdStr()) == null) {
                idStr = "";
            }
            linkedHashMap.put("room_id", idStr);
            Room room5 = this.LL;
            if (room5 == null || (string = Long.valueOf(room5.getOwnerUserId()).toString()) == null) {
                string = "";
            }
            linkedHashMap.put("anchor_id", string);
            Room room6 = this.LL;
            if (room6 == null || (owner = room6.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
                secUid = "";
            }
            linkedHashMap.put("sec_anchor_id", secUid);
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser == null || (string2 = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString()) == null) {
                string2 = "";
            }
            linkedHashMap.put("user_id", string2);
            InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
            if (interfaceC500940JkiUser2 != null && (currentUser = interfaceC500940JkiUser2.getCurrentUser()) != null && (secUid2 = currentUser.getSecUid()) != null) {
                str = secUid2;
            }
            linkedHashMap.put("sec_user_id", str);
            if (this.LLILLJJLI) {
                abstractC1097350ef7 = new AbstractC1097350ef7(linkedHashMap, linkedHashMap, linkedHashMap) { // from class: X.0ef2
                    public final Map<String, String> LIZ;
                    public final Map<String, String> LIZIZ;
                    public final Map<String, Object> LIZJ;
                    public final boolean LIZLLL;
                    public final Map<String, Boolean> LJ;
                    public final String LJFF;

                    @Override // X.InterfaceC1097470efJ
                    public final boolean LIZ() {
                        return this.LIZLLL;
                    }

                    @Override // X.InterfaceC1097470efJ
                    public final Map<String, String> LIZJ() {
                        return this.LIZIZ;
                    }

                    @Override // X.InterfaceC1097470efJ
                    public final Map<String, Boolean> LIZLLL() {
                        return this.LJ;
                    }

                    @Override // X.InterfaceC1097470efJ
                    public final Map<String, Object> LJII() {
                        return this.LIZJ;
                    }

                    @Override // X.InterfaceC1097470efJ
                    public final Map<String, String> getLogParam() {
                        return this.LIZ;
                    }

                    @Override // X.InterfaceC1097470efJ
                    public final String getSceneKey() {
                        return this.LJFF;
                    }

                    {
                        Map<String, Boolean> mapLJ = C2097608Jq.LJ();
                        this.LIZ = linkedHashMap;
                        this.LIZIZ = linkedHashMap;
                        this.LIZJ = linkedHashMap;
                        this.LIZLLL = true;
                        this.LJ = mapLJ;
                        this.LJFF = "live_pcs_go_live_room";
                    }
                };
            } else {
                abstractC1097350ef7 = new AbstractC1097350ef7(linkedHashMap, linkedHashMap, linkedHashMap) { // from class: X.0ef6
                    public final Map<String, String> LIZ;
                    public final Map<String, String> LIZIZ;
                    public final Map<String, Object> LIZJ;
                    public final boolean LIZLLL;
                    public final Map<String, Boolean> LJ;
                    public final String LJFF;

                    @Override // X.InterfaceC1097470efJ
                    public final boolean LIZ() {
                        return this.LIZLLL;
                    }

                    @Override // X.InterfaceC1097470efJ
                    public final Map<String, String> LIZJ() {
                        return this.LIZIZ;
                    }

                    @Override // X.InterfaceC1097470efJ
                    public final Map<String, Boolean> LIZLLL() {
                        return this.LJ;
                    }

                    @Override // X.InterfaceC1097470efJ
                    public final Map<String, Object> LJII() {
                        return this.LIZJ;
                    }

                    @Override // X.InterfaceC1097470efJ
                    public final Map<String, String> getLogParam() {
                        return this.LIZ;
                    }

                    @Override // X.InterfaceC1097470efJ
                    public final String getSceneKey() {
                        return this.LJFF;
                    }

                    @Override // X.AbstractC1097350ef7, X.InterfaceC1097470efJ
                    public final boolean LJFF(PreloadStrategyConfig preloadStrategyConfig) {
                        if (Intrinsics.LJFF(preloadStrategyConfig.preCheckKey, "live_pcs_preload_pin_card")) {
                            return LivePcsPreloadPinCardSetting.INSTANCE.getValue();
                        }
                        return super.LJFF(preloadStrategyConfig);
                    }

                    {
                        Map<String, Boolean> mapLJ = C2097608Jq.LJ();
                        this.LIZ = linkedHashMap;
                        this.LIZIZ = linkedHashMap;
                        this.LIZJ = linkedHashMap;
                        this.LIZLLL = true;
                        this.LJ = mapLJ;
                        this.LJFF = "live_pcs_watch_live_room";
                    }
                };
            }
            this.LLILZIL = abstractC1097350ef7;
            C1097400efC.LIZIZ(abstractC1097350ef7);
        }
    }
}
