package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.C01GW;
import X.C086I;
import X.C0IHL;
import X.C1078480eAg;
import X.C1081050eEp;
import X.C1114000f5y;
import X.C1697810uHb;
import X.C1AJN;
import X.C1AJO;
import X.C2097908Jt;
import X.C2177331AJf;
import X.C2177341AJg;
import X.C2177431AJp;
import X.C2177511AJx;
import X.C261600zm;
import X.C292401Bi;
import X.C500260Jjc;
import X.C758860Tpk;
import X.C758870Tpl;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1083170eIF;
import X.EnumC1102750enp;
import X.InterfaceC1114010f5z;
import X.InterfaceC261700zn;
import Y.ARunnableS81S0200000_12;
import Y.AfS176S0100000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.decoration.RoomDonationDecorationsEvent;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.room.MicRoomDisableDecorationEvent;
import com.bytedance.android.livesdk.chatroom.event.DonationBoardVisibleEvent;
import com.bytedance.android.livesdk.chatroom.event.DonationStickerAnchorEvent;
import com.bytedance.android.livesdk.dataChannel.HideTitleLayoutEvent;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.SelectedDonationStickerChannel;
import com.bytedance.android.livesdk.model.OrganizationModel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class DonationStickerWrapperWidget extends DecorationWrapperWidget implements InterfaceC1114010f5z {
    public static boolean LLJJI;
    public C1114000f5y LLJILJIL;
    public long LLJILJILJ = -1;
    public final C01GW LLJILLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 236));
    public C261600zm LLJJ;

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C758860Tpk C1() {
        return (C758860Tpk) this.LLJILLL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.1AJl] */
    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Object obj;
        IMessage iMessage;
        C1114000f5y c1114000f5y;
        List<RoomDecoration> decorationList;
        RoomAuthStatus roomAuthStatus;
        super.onCreate();
        attachAndShow();
        Room room = this.LLILZLL;
        C1114000f5y c1114000f5y2 = room != null ? new C1114000f5y(room.getId()) : null;
        this.LLJILJIL = c1114000f5y2;
        if (c1114000f5y2 != null) {
            c1114000f5y2.attachView(this);
        }
        Room room2 = this.LLILZLL;
        if (C500260Jjc.LJJJI((room2 == null || (roomAuthStatus = room2.getRoomAuthStatus()) == null) ? null : Boolean.valueOf(roomAuthStatus.isEnableStickerDonation()))) {
            EnumC1102750enp.DONATION.load(this.dataChannel, C1());
        }
        Room room3 = this.LLILZLL;
        if (!C086I.LIZIZ(room3 != null ? room3.getDecorationList() : null)) {
            ArrayList arrayList = new ArrayList();
            Room room4 = this.LLILZLL;
            if (room4 != null && (decorationList = room4.getDecorationList()) != null) {
                for (RoomDecoration roomDecoration : decorationList) {
                    RoomDecoration roomDecoration2 = new RoomDecoration(roomDecoration.image, roomDecoration.maxLength, roomDecoration.inputRect, roomDecoration.status, roomDecoration.kind, roomDecoration.sit_rect);
                    roomDecoration2.id = roomDecoration.id;
                    roomDecoration2.LIZ = roomDecoration.LIZ;
                    roomDecoration2.type = roomDecoration.type;
                    roomDecoration2.content = roomDecoration.content;
                    roomDecoration2.textColor = roomDecoration.textColor;
                    roomDecoration2.textSize = roomDecoration.textSize;
                    roomDecoration2.xPosition = roomDecoration.xPosition;
                    roomDecoration2.yPosition = roomDecoration.yPosition;
                    roomDecoration2.screenWidth = roomDecoration.screenWidth;
                    roomDecoration2.screenHeight = roomDecoration.screenHeight;
                    if (arrayList.add(roomDecoration2)) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            View view = getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS81S0200000_12(this, arrayList, 77));
            }
            this.LLILZIL = true;
        }
        C784440Upu.LIZ().LIZJ(this, C2177511AJx.class).LIZJ(new AfS176S0100000_7(this, 46));
        DataChannel dataChannel = this.dataChannel;
        dataChannel.BQ2(this, RoomDonationDecorationsEvent.class, new C2177331AJf(this));
        dataChannel.BQ2(this, SelectedDonationStickerChannel.class, new C2177341AJg(this));
        if (this.LLILZ) {
            this.dataChannel.EQ2(this, DonationBoardVisibleEvent.class, new AwS612S0100000_33(this, 21));
            this.dataChannel.CQ2(LinkCrossRoomStateChangeEvent.class, this, new AwS612S0100000_33(this, 22));
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.EQ2(this, MicRoomDisableDecorationEvent.class, new AwS612S0100000_33(this, 23));
            }
        }
        Object[] objArr = this.args;
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C1078480eAg) && (((obj = ((C1078480eAg) obj2).LIZ) == null || (obj instanceof IMessage)) && (iMessage = (IMessage) obj) != null && (c1114000f5y = this.LLJILJIL) != null)) {
                    c1114000f5y.onMessage(iMessage);
                }
            }
        }
        if (this.LLILZ) {
            C261600zm c261600zm = new C261600zm(this.dataChannel, new InterfaceC261700zn() { // from class: X.1AJl
                @Override // X.InterfaceC261700zn
                public final void LIZ() {
                }

                @Override // X.InterfaceC261700zn
                public final void LIZIZ() {
                    this.LIZ.D1();
                }
            });
            this.LLJJ = c261600zm;
            c261600zm.LIZLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget
    public final void z1() {
        List<RoomDecoration> decorationList;
        Room room = this.LLILZLL;
        if (room == null || (decorationList = room.getDecorationList()) == null || !(!decorationList.isEmpty())) {
            return;
        }
        ArrayList arrayListLJ = C1697810uHb.LJ(ListProtector.get(decorationList, 0));
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS81S0200000_12(this, arrayListLJ, 77));
        }
    }

    public final void D1() {
        E1();
        C1114000f5y c1114000f5y = this.LLJILJIL;
        if (c1114000f5y != null) {
            c1114000f5y.LJJJJLL(3, C2097908Jt.LIZJ(new Pair("deco_list", new JSONArray().toString())));
        }
    }

    public final void E1() {
        RoomDecoration roomDecoration;
        ViewGroup viewGroup;
        if (!isViewValid() || ((ArrayList) this.LLILLL).isEmpty() || getView() == null) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            C1AJN c1ajn = (C1AJN) it2.next();
            if (c1ajn.getType() == 3) {
                View view = getView();
                if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                    C786410Ut5.LJJJLZIJ(c1ajn, viewGroup);
                }
                it2.remove();
                if ((c1ajn instanceof C1AJO) && (roomDecoration = (RoomDecoration) c1ajn.getRoomDecoration()) != null) {
                    this.dataChannel.LC0(DonationStickerAnchorEvent.class, new C2177431AJp(roomDecoration, false));
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C1114000f5y c1114000f5y = this.LLJILJIL;
        if (c1114000f5y != null) {
            c1114000f5y.detachView();
        }
        this.LLJILJILJ = -1L;
        C1().LLIZ = false;
        LLJJI = false;
        EnumC1102750enp.DONATION.unload(this.dataChannel);
        C261600zm c261600zm = this.LLJJ;
        if (c261600zm != null) {
            c261600zm.LIZIZ(false, C500260Jjc.LJIL());
        }
        this.LLJJ = null;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public final void B1(RoomDecoration roomDecoration) {
        if (isViewValid() && roomDecoration != null) {
            E1();
            C1AJO c1ajo = new C1AJO(this.context, roomDecoration, this.LLILZ, this.LL, this, this.LLIZ, this.dataChannel);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.LC0(DonationStickerAnchorEvent.class, new C2177431AJp(roomDecoration, true));
            }
            long j = this.LLJILJILJ;
            if (j == -1 || j != roomDecoration.id) {
                OrganizationModel organizationModelLIZ = roomDecoration.LIZ();
                C758870Tpl.LIZ(this.dataChannel, "top_left_icon", organizationModelLIZ);
                C758870Tpl.LIZ(this.dataChannel, "donation_sticker", organizationModelLIZ);
            }
            this.LLJILJILJ = roomDecoration.id;
            ((ArrayList) this.LLILLL).add(c1ajo);
            x1(c1ajo);
            if (this.LLILZ) {
                C1().LLIZ = true;
            }
        }
    }

    @Override // X.InterfaceC1114010f5z
    public final void Ii0(List<RoomDecoration> list) {
        if (isViewValid() && !this.LLILZ && list != null) {
            Room room = this.LLILZLL;
            if (room != null) {
                room.setDecorationList(list);
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(PIPStatusData.class), Boolean.TRUE)) {
                return;
            }
            E1();
            Iterator<RoomDecoration> it2 = list.iterator();
            while (it2.hasNext()) {
                B1(it2.next());
            }
        }
    }

    @Override // X.InterfaceC2177361AJi
    public final void LJIJI(boolean z) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(HideTitleLayoutEvent.class, new C1081050eEp(z, EnumC1083170eIF.DONATION_STICKER_WRAPPER_WIDGET));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget, X.InterfaceC2177361AJi
    public final void LJZL(RoomDecoration roomDecoration) {
        if (isViewValid() && this.LLILZ && roomDecoration.type == 3) {
            for (C1AJN c1ajn : (ArrayList) this.LLILLL) {
                if (c1ajn.getType() == 3) {
                    JSONArray jSONArray = new JSONArray();
                    JSONObject decorationInfo = c1ajn.getDecorationInfo();
                    if (decorationInfo != null) {
                        jSONArray.put(decorationInfo);
                        C0IHL c0ihl = new C0IHL();
                        c0ihl.LIZ("deco_list", jSONArray.toString());
                        HashMap<String, String> map = c0ihl.LIZ;
                        C1114000f5y c1114000f5y = this.LLJILJIL;
                        if (c1114000f5y != null) {
                            c1114000f5y.LJJJJLL(c1ajn.getType(), map);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget
    public final void y1(Sticker sticker) {
        if (sticker.type == 3) {
            D1();
        }
    }
}
