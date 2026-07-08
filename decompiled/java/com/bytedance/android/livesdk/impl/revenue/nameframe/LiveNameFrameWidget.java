package com.bytedance.android.livesdk.impl.revenue.nameframe;

import X.C001A;
import X.C098200Yq;
import X.C1548820qPI;
import X.C1872780ypo;
import X.C189200o6;
import X.C19748512Ol;
import X.C262100zr;
import X.C496500JdY;
import X.C776250Uch;
import X.C786410Ut5;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.api.revenue.BorderInfoUpdateEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LiveNameFrameWidget extends LiveWidget implements OnMessageListener, InterfaceC1141530foN {
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.MEMBER.getIntType(), this);
        }
        C1548820qPI.LJIIIIZZ("user_border_update_event", this);
        super.onDestroy();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.MEMBER.getIntType(), this);
        }
        C1548820qPI.LIZLLL("user_border_update_event", this);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        boolean z;
        String string;
        InterfaceC1107590evd map;
        InterfaceC1107590evd map2;
        try {
            if (Intrinsics.LJFF(c262100zr.LIZ, "user_border_update_event")) {
                BorderInfo borderInfo = new BorderInfo();
                InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                if (interfaceC1107590evd != null && interfaceC1107590evd.getInt("is_anchor_avatar") == 1) {
                    z = true;
                } else {
                    z = false;
                }
                InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                if (interfaceC1107590evd2 != null && (map2 = interfaceC1107590evd2.getMap("icon")) != null) {
                    Gson gson = C19748512Ol.LIZJ;
                    C1872780ypo.LIZ.getClass();
                    borderInfo.icon = (ImageModel) gson.LJII(C786410Ut5.J3(C1872780ypo.LIZIZ(map2)), ImageModel.class);
                }
                InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                if (interfaceC1107590evd3 != null && (map = interfaceC1107590evd3.getMap("personal_card_v2")) != null) {
                    Gson gson2 = C19748512Ol.LIZJ;
                    C1872780ypo.LIZ.getClass();
                    borderInfo.profileDecorationRibbon = (ImageModel) gson2.LJII(C786410Ut5.J3(C1872780ypo.LIZIZ(map)), ImageModel.class);
                }
                InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                String string2 = null;
                if (interfaceC1107590evd4 != null) {
                    string = interfaceC1107590evd4.getString("avatar_background_color");
                } else {
                    string = null;
                }
                borderInfo.avatarBackgroundColor = string;
                InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
                if (interfaceC1107590evd5 != null) {
                    string2 = interfaceC1107590evd5.getString("avatar_background_border_color");
                }
                borderInfo.avatarBackgroundBorderColor = string2;
                if (z) {
                    this.dataChannel.LC0(BorderInfoUpdateEvent.class, new C496500JdY(1, borderInfo, false, false));
                    x1(this.dataChannel, borderInfo);
                } else {
                    this.dataChannel.LC0(BorderInfoUpdateEvent.class, new C496500JdY(2, borderInfo, false, false));
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long ownerUserId;
        MemberMessage memberMessage;
        User user;
        Room room;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        if ((iMessage instanceof MemberMessage) && (user = (memberMessage = (MemberMessage) iMessage).user) != null && user.getId() == ownerUserId && memberMessage.user.getBorder() != null) {
            int i = memberMessage.action;
            if (i != 38) {
                if (i != 41) {
                    if (i == 42) {
                        this.dataChannel.LC0(BorderInfoUpdateEvent.class, new C496500JdY(1, memberMessage.user.getBorder(), true, false));
                        x1(this.dataChannel, memberMessage.user.getBorder());
                        return;
                    }
                    return;
                }
                this.dataChannel.LC0(BorderInfoUpdateEvent.class, new C496500JdY(1, memberMessage.user.getBorder(), true, true));
                return;
            }
            this.dataChannel.LC0(BorderInfoUpdateEvent.class, new C496500JdY(1, memberMessage.user.getBorder(), false, false));
            x1(this.dataChannel, memberMessage.user.getBorder());
        }
    }

    public static void x1(DataChannel dataChannel, BorderInfo borderInfo) {
        List<BorderInfo> borders;
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            User owner = room.getOwner();
            if (owner != null) {
                owner.setBorder(borderInfo);
            }
            User owner2 = room.getOwner();
            if (owner2 != null && (borders = owner2.getBorders()) != null) {
                ListProtector.add(borders, 0, borderInfo);
            }
            dataChannel.zW(RoomChannel.class, room);
        }
    }
}
