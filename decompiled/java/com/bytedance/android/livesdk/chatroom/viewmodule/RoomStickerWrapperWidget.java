package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.C01S3;
import X.C086I;
import X.C09JN;
import X.C0IJT;
import X.C0IKU;
import X.C0U74;
import X.C0UN7;
import X.C0UNG;
import X.C0UO0;
import X.C1078480eAg;
import X.C1081050eEp;
import X.C1083420eIe;
import X.C1161920gLG;
import X.C11JF;
import X.C11NZ;
import X.C1276840jKc;
import X.C13LP;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1AJJ;
import X.C1AJL;
import X.C1AJM;
import X.C1AJN;
import X.C1AJV;
import X.C1AJX;
import X.C2097608Jq;
import X.C2177351AJh;
import X.C2177381AJk;
import X.C342601Uq;
import X.C342701Ur;
import X.C474500IjA;
import X.C482260Ivg;
import X.C5183020f;
import X.C786410Ut5;
import X.C842240X2g;
import X.EnumC1083170eIF;
import X.EnumC1101430elh;
import X.InterfaceC1871320ynS;
import X.InterfaceC420801kM;
import X.InterfaceC482090IvP;
import Y.ARunnableS102S0200000_33;
import Y.ARunnableS133S0100000_33;
import Y.AfS197S0100000_28;
import Y.AfS37S0210000_33;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.decoration.RoomStickerDecorationsEvent;
import com.bytedance.android.live.effect.api.RoomStickerFetchSuccessChannel;
import com.bytedance.android.live.effect.api.RoomStickerPanelFailEvent;
import com.bytedance.android.live.effect.api.RoomStickerSpecialFetchSuccessChannel;
import com.bytedance.android.live.liveinteract.api.NotifyDeleteStickerEvent;
import com.bytedance.android.live.liveinteract.api.NotifySelectStickerEvent;
import com.bytedance.android.livesdk.chatroom.event.EditRoomStickerEvent;
import com.bytedance.android.livesdk.chatroom.event.SelectRoomStickerEvent;
import com.bytedance.android.livesdk.chatroom.viewmodule.RoomStickerWrapperWidget;
import com.bytedance.android.livesdk.comp.api.decoration.api.RoomStickerApi;
import com.bytedance.android.livesdk.dataChannel.HideTitleLayoutEvent;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.livesetting.decoration.StickerAudienceEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookAutoRunTypeSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes34.dex */
public final class RoomStickerWrapperWidget extends DecorationWrapperWidget implements InterfaceC1871320ynS {
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public C1AJM LLJJI;
    public C11JF LLJJIII;
    public C11JF LLJJIJI;
    public final List<C0U74<RoomSticker>> LLJJIJIIJIL = new ArrayList();
    public final List<C0U74<RoomSticker>> LLJJIJIL = new ArrayList();
    public C1AJV LLJJJ;
    public boolean LLJJJIL;
    public RoomSticker LLJJJJ;
    public boolean LLJJJJJIL;

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget
    public final void z1() {
        List<RoomSticker> roomStickerList;
        Room room = this.LLILZLL;
        if (room == null || (roomStickerList = room.getRoomStickerList()) == null || !(!roomStickerList.isEmpty())) {
            return;
        }
        G1(C1697810uHb.LJ(ListProtector.get(roomStickerList, 0)));
    }

    public final void H1() {
        ViewGroup viewGroup;
        if (!isViewValid() || ((ArrayList) this.LLILLL).isEmpty() || getView() == null) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            C1AJN c1ajn = (C1AJN) it2.next();
            if (c1ajn.getType() == 4 || c1ajn.getType() == 5 || c1ajn.getType() == 6) {
                View view = getView();
                if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                    C786410Ut5.LJJJLZIJ(c1ajn, viewGroup);
                }
                it2.remove();
            }
        }
    }

    @Override // X.InterfaceC1871320ynS
    public final void U70() {
        List<RoomSticker> roomStickerList;
        if (!isViewValid() || this.LLILZ) {
            return;
        }
        if (this.LLJJJIL) {
            this.LLJJJJ = null;
            this.LLJJJJJIL = true;
            return;
        }
        H1();
        Room room = this.LLILZLL;
        if (room == null || (roomStickerList = room.getRoomStickerList()) == null) {
            return;
        }
        roomStickerList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Object obj;
        IMessage iMessage;
        C1AJM c1ajm;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        DataChannel dataChannel3;
        String str;
        List<RoomSticker> roomStickerList;
        List<RoomSticker> roomStickerList2;
        User owner;
        attachAndShow();
        super.onCreate();
        DataChannel dataChannel4 = C01S3.LIZ;
        C01S3.LIZ = this.dataChannel;
        Room room = this.LLILZLL;
        C1AJM c1ajm2 = room != null ? new C1AJM(room.getId()) : null;
        this.LLJJI = c1ajm2;
        if (c1ajm2 != null) {
            c1ajm2.attachView(this);
        }
        this.LLJJJ = new C1AJV(this.LLILZ);
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.EQ2(this, RoomStickerFetchSuccessChannel.class, new C5183020f(this, 106));
            dataChannel5.EQ2(this, RoomStickerPanelFailEvent.class, new C5183020f(this, 107));
        }
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            dataChannel6.EQ2(this, RoomStickerSpecialFetchSuccessChannel.class, new C5183020f(this, 108));
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("user_id", Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
        Room room2 = this.LLILZLL;
        pairArr[1] = new Pair("room_id", room2 != null ? Long.valueOf(room2.getId()) : null);
        Room room3 = this.LLILZLL;
        pairArr[2] = new Pair("anchor_id", (room3 == null || (owner = room3.getOwner()) == null) ? null : Long.valueOf(owner.getId()));
        pairArr[3] = new Pair("user_type", Integer.valueOf(this.LLILZ ? 1 : 0));
        Map<? extends String, ? extends Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        Map<String, Object> map = C1AJX.LIZ;
        ((LinkedHashMap) map).clear();
        map.putAll(mapLJIIIIZZ);
        Room room4 = this.LLILZLL;
        if (!C086I.LIZIZ(room4 != null ? room4.getRoomStickerList() : null)) {
            ArrayList arrayList = new ArrayList();
            Room room5 = this.LLILZLL;
            if (room5 != null && (roomStickerList2 = room5.getRoomStickerList()) != null) {
                Iterator<RoomSticker> it2 = roomStickerList2.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZLLL = true;
                }
            }
            Room room6 = this.LLILZLL;
            if (room6 != null && (roomStickerList = room6.getRoomStickerList()) != null) {
                for (RoomSticker roomSticker : roomStickerList) {
                    RoomSticker roomStickerLIZ = RoomSticker.LIZ(roomSticker);
                    roomStickerLIZ.id = roomSticker.id;
                    roomStickerLIZ.LIZ = roomSticker.LIZ;
                    roomStickerLIZ.type = roomSticker.type;
                    roomStickerLIZ.content = roomSticker.content;
                    roomStickerLIZ.textColor = roomSticker.textColor;
                    roomStickerLIZ.textSize = roomSticker.textSize;
                    roomStickerLIZ.xPosition = roomSticker.xPosition;
                    roomStickerLIZ.yPosition = roomSticker.yPosition;
                    roomStickerLIZ.screenWidth = roomSticker.screenWidth;
                    roomStickerLIZ.screenHeight = roomSticker.screenHeight;
                    if (arrayList.add(roomStickerLIZ)) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (this.LLILZ) {
                C1AJV c1ajv = this.LLJJJ;
                if (c1ajv != null) {
                    c1ajv.LIZIZ(1, arrayList);
                }
                if (PlaybookAutoRunTypeSetting.INSTANCE.enable() && (dataChannel3 = this.dataChannel) != null) {
                    Sticker sticker = (Sticker) C13LP.LJJJLZIJ(0, arrayList);
                    if (sticker == null || (str = sticker.LIZ) == null) {
                        str = "";
                    }
                    dataChannel3.LC0(NotifySelectStickerEvent.class, str);
                }
                RoomSticker roomSticker2 = (RoomSticker) C13LP.LJJJLL(arrayList);
                if (roomSticker2 != null && roomSticker2.type == 4 && C0UNG.LIZ(roomSticker2) && (dataChannel2 = this.dataChannel) != null) {
                    dataChannel2.SX0(C1083420eIe.class, new Object() { // from class: X.1AJv
                    });
                }
            }
            if ((!this.LLILZ && StickerAudienceEnableSetting.INSTANCE.getValue() == 1) || this.LLILZ) {
                G1(arrayList);
                this.LLILZIL = true;
            }
        }
        this.dataChannel.BQ2(this, RoomStickerDecorationsEvent.class, new C2177351AJh(this));
        if (this.LLILZ && (dataChannel = this.dataChannel) != null) {
            dataChannel.BQ2(this, EditRoomStickerEvent.class, new AwS612S0100000_33(this, 24));
            dataChannel.BQ2(this, SelectRoomStickerEvent.class, new AwS612S0100000_33(this, 25));
        }
        Object[] objArr = this.args;
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C1078480eAg) && (((obj = ((C1078480eAg) obj2).LIZ) == null || (obj instanceof IMessage)) && (iMessage = (IMessage) obj) != null && (c1ajm = this.LLJJI) != null)) {
                    c1ajm.onMessage(iMessage);
                }
            }
        }
        if (this.LLILZ || !LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getEnableRoomSticker()) {
            return;
        }
        IPTFService iPTFService = (IPTFService) C1161920gLG.LIZJ(IPTFService.class);
        EnumC1101430elh enumC1101430elh = EnumC1101430elh.ROOM_STICKER;
        iPTFService.FA2(enumC1101430elh, new InterfaceC482090IvP() { // from class: X.1AJY
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC482090IvP
            public final void LIZ(C0IS4 c0is4) {
                boolean z;
                if (((Number) c0is4.LIZ).intValue() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                RoomStickerWrapperWidget roomStickerWrapperWidget = this.LIZ;
                if (roomStickerWrapperWidget.LLJJJIL != z) {
                    roomStickerWrapperWidget.LLJJJIL = z;
                    View view = roomStickerWrapperWidget.getView();
                    if (view != null) {
                        HandlerHook.viewPost(view, new ARunnableS133S0100000_33(this.LIZ, 25));
                    }
                }
            }
        });
        C0IKU c0ikuP71 = iPTFService.P71(enumC1101430elh.getTuneScene(), enumC1101430elh, null, Integer.TYPE);
        if (c0ikuP71 == null || ((Number) c0ikuP71.LIZ).intValue() <= 2) {
            return;
        }
        this.LLJJJIL = true;
        H1();
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        List<RoomSticker> roomStickerList;
        super.onDestroy();
        if (!this.LLILZ && LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getEnableRoomSticker()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.ROOM_STICKER);
        }
        C01S3.LIZ = null;
        C342701Ur.LIZ = null;
        C1AJM c1ajm = this.LLJJI;
        if (c1ajm != null) {
            c1ajm.detachView();
        }
        ((ArrayList) this.LLJJIJIIJIL).clear();
        ((ArrayList) this.LLJJIJIL).clear();
        E1(this.LLJJIII);
        E1(this.LLJJIJI);
        if (this.LLILZ) {
            Room room = this.LLILZLL;
            if (room != null && (roomStickerList = room.getRoomStickerList()) != null && (!roomStickerList.isEmpty())) {
                RoomSticker roomSticker = (RoomSticker) C13LP.LJJJLL(roomStickerList);
                List<C1AJN<?>> list = this.LLILLL;
                ArrayList arrayList = new ArrayList();
                for (Object obj : (ArrayList) list) {
                    C1AJN c1ajn = (C1AJN) obj;
                    if (roomSticker != null && c1ajn.LL.id == roomSticker.id) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    C2177381AJk c2177381AJk = C1AJL.LIZLLL;
                    C1AJL.LJIIIZ(this.dataChannel, roomSticker, Boolean.valueOf(!C342601Uq.LIZIZ(F1(roomSticker), roomSticker)));
                    C1AJL.LIZ = 0L;
                    if (roomSticker != null && C0UNG.LIZ(roomSticker)) {
                        C1AJL.LJIIIIZZ(this.dataChannel, roomSticker, Boolean.valueOf(true ^ C342601Uq.LIZIZ(F1(roomSticker), roomSticker)));
                    }
                    C1AJL.LIZJ = 0L;
                }
            }
            C2177381AJk c2177381AJk2 = C1AJL.LIZLLL;
            DataChannel dataChannel = this.dataChannel;
            boolean z = this.LLJILJILJ;
            boolean z2 = this.LLJILJIL;
            boolean z3 = this.LLJJ;
            boolean z4 = this.LLJILLL;
            if (z) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_character_prop_use");
                c474500IjALIZ.LJJII(z3 ? "use" : "unused", "use_status");
                c474500IjALIZ.LJIILJJIL("live_take_detail");
                c474500IjALIZ.LJIILL("other");
                c474500IjALIZ.LJIIJJI("live_take");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LIZ();
            }
            if (z2) {
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_picture_prop_use");
                c474500IjALIZ2.LJJII(z4 ? "use" : "unused", "use_status");
                c474500IjALIZ2.LJIILJJIL("live_take_detail");
                c474500IjALIZ2.LJIILL("other");
                c474500IjALIZ2.LJIIJJI("live_take");
                c474500IjALIZ2.LJIJJLI(dataChannel);
                c474500IjALIZ2.LIZ();
            }
        }
        C1AJX.LIZLLL = -1L;
        C1AJX.LJ = -1L;
        C1AJX.LIZIZ = -1L;
        C1AJX.LIZJ = -1L;
    }

    public final void B1(RoomSticker roomSticker) {
        C1AJM c1ajm;
        if ((this.LLILZ || !this.LLJJJIL) && isViewValid() && roomSticker != null) {
            C2177381AJk c2177381AJk = C1AJL.LIZLLL;
            if (C1AJL.LIZ(roomSticker, this.dataChannel)) {
                return;
            }
            if (roomSticker.type == 4 && C342701Ur.LIZ(roomSticker)) {
                List<C1AJN<?>> list = this.LLILLL;
                ArrayList arrayList = new ArrayList();
                for (C1AJN c1ajn : (ArrayList) list) {
                    if ((c1ajn instanceof C1AJJ) && c1ajn != null) {
                        arrayList.add(c1ajn);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    RoomSticker roomSticker2 = (RoomSticker) ((C1AJN) it2.next()).LL;
                    if (roomSticker2.hasUploadToServer && (c1ajm = this.LLJJI) != null) {
                        c1ajm.LJJJJLL(roomSticker2);
                    }
                }
            }
            H1();
            C1AJJ c1ajj = new C1AJJ(this.context, roomSticker, this.LLILZ, this.LL, this, this.LLIZ, this.LLJJJ, this.dataChannel);
            ((ArrayList) this.LLILLL).add(c1ajj);
            x1(c1ajj);
        }
    }

    public final void D1(RoomSticker roomSticker) {
        if (roomSticker == null) {
            return;
        }
        E1(this.LLJJIJI);
        this.LLJJIJI = (C11JF) C11NZ.LJLJJLL(30L, TimeUnit.SECONDS).LJL(C1701940uOG.LIZIZ()).LJJLJLI(new AfS37S0210000_33(this, roomSticker, 1));
    }

    public final void E1(InterfaceC420801kM interfaceC420801kM) {
        if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
            interfaceC420801kM.dispose();
        }
    }

    public final String F1(RoomSticker roomSticker) {
        C1AJN<?> next;
        if (roomSticker == null) {
            return null;
        }
        Iterator<C1AJN<?>> it2 = this.LLILLL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LL.id == roomSticker.id) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1AJN<?> c1ajn = next;
        if (c1ajn != null && (c1ajn instanceof C1AJJ)) {
            C1AJJ c1ajj = (C1AJJ) c1ajn;
            if (c1ajj.LL.type == 4) {
                return c1ajj.getContent();
            }
        }
        return null;
    }

    public final void G1(List<RoomSticker> list) {
        View view;
        if ((this.LLILZ || !this.LLJJJIL) && list != null && (view = getView()) != null) {
            HandlerHook.viewPost(view, new ARunnableS102S0200000_33(this, list, 15));
        }
    }

    @Override // X.InterfaceC2177361AJi
    public final void LJIJI(boolean z) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(HideTitleLayoutEvent.class, new C1081050eEp(z, EnumC1083170eIF.ROOM_STICKER_WRAPPER_WIDGET));
        }
    }

    @Override // X.InterfaceC1871320ynS
    public final void MU1(RoomSticker roomSticker) {
        C1AJN c1ajn = (C1AJN) C13LP.LJJJLL(this.LLILLL);
        if (c1ajn instanceof C1AJJ) {
            C1AJJ c1ajj = (C1AJJ) c1ajn;
            if (c1ajj.getType() == 4 && roomSticker != null && C342701Ur.LIZ(roomSticker)) {
                c1ajj.O0(roomSticker.reviewStatus, roomSticker.auditInfo);
            }
        }
    }

    @Override // X.InterfaceC1871320ynS
    public final void QN(RoomSticker roomSticker) {
        if (isViewValid() && !this.LLILZ && roomSticker != null) {
            if (this.LLJJJIL) {
                this.LLJJJJ = roomSticker;
                this.LLJJJJJIL = true;
                return;
            }
            Room room = this.LLILZLL;
            if (room != null) {
                room.setRoomStickerList(C1697810uHb.LJIILJJIL(roomSticker));
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(PIPStatusData.class), Boolean.TRUE)) {
                return;
            }
            RoomSticker roomStickerLIZ = RoomSticker.LIZ(roomSticker);
            roomStickerLIZ.id = roomSticker.id;
            roomStickerLIZ.LIZ = roomSticker.LIZ;
            roomStickerLIZ.type = roomSticker.type;
            roomStickerLIZ.content = roomSticker.content;
            roomStickerLIZ.textColor = roomSticker.textColor;
            roomStickerLIZ.textSize = roomSticker.textSize;
            roomStickerLIZ.xPosition = roomSticker.xPosition;
            roomStickerLIZ.yPosition = roomSticker.yPosition;
            roomStickerLIZ.screenWidth = roomSticker.screenWidth;
            roomStickerLIZ.screenHeight = roomSticker.screenHeight;
            B1(roomStickerLIZ);
            if (!this.LLILZ) {
                C2177381AJk c2177381AJk = C1AJL.LIZLLL;
                C1AJL.LJ(roomStickerLIZ, this.dataChannel);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget
    public final void y1(Sticker sticker) {
        boolean zLIZIZ;
        E1(this.LLJJIII);
        E1(this.LLJJIJI);
        int i = sticker.type;
        if (i != 4 && i != 5 && i != 6) {
            return;
        }
        if (sticker instanceof RoomSticker) {
            RoomSticker roomSticker = (RoomSticker) sticker;
            zLIZIZ = C342601Uq.LIZIZ(F1(roomSticker), roomSticker);
        } else {
            zLIZIZ = false;
        }
        C2177381AJk c2177381AJk = C1AJL.LIZLLL;
        DataChannel dataChannel = this.dataChannel;
        RoomSticker roomSticker2 = (RoomSticker) sticker;
        Boolean boolValueOf = Boolean.valueOf(zLIZIZ);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_prop_delete");
        c474500IjALIZ.LJJII(Integer.valueOf(roomSticker2.LIZLLL ? 1 : 0), "is_remember");
        c474500IjALIZ.LJJII(C1AJL.LIZIZ(Integer.valueOf(roomSticker2.type)), "tab");
        c474500IjALIZ.LJJII(Long.valueOf(roomSticker2.id), "prop_id");
        c474500IjALIZ.LJJII(roomSticker2.name, "prop_name");
        c474500IjALIZ.LJJII(roomSticker2.LIZ, "resource_id");
        c474500IjALIZ.LJJIIZ("character", "prop_type", new AwS577S0100000_33(roomSticker2, 4168));
        c474500IjALIZ.LJJIIZ("picture", "prop_type", new AwS577S0100000_33(roomSticker2, 4169));
        c474500IjALIZ.LJJII(Integer.valueOf(!Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? 1 : 0), "is_origin_words");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
        C1276840jKc.LIZ.getClass();
        C1276840jKc.LJJIZ("");
        boolean z = !zLIZIZ;
        C1AJL.LJIIIZ(this.dataChannel, roomSticker2, Boolean.valueOf(z));
        C1AJL.LIZ = 0L;
        if (sticker.type == 4 && C0UNG.LIZ(roomSticker2)) {
            C1AJL.LJIIIIZZ(this.dataChannel, roomSticker2, Boolean.valueOf(z));
        }
        H1();
        C1AJM c1ajm = this.LLJJI;
        if (c1ajm != null) {
            c1ajm.LJJJJLL(roomSticker2);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.SX0(C0UN7.class, null);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null) {
            return;
        }
        dataChannel3.FQ2(NotifyDeleteStickerEvent.class);
    }

    public final void C1(RoomSticker roomSticker, boolean z) {
        if (roomSticker == null) {
            return;
        }
        E1(this.LLJJIII);
        this.LLJJIII = (C11JF) C11NZ.LJLJJLL(30L, TimeUnit.SECONDS).LJL(C1701940uOG.LIZIZ()).LJJLJLI(new AfS37S0210000_33(z, this, roomSticker, 0));
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget, X.InterfaceC2177361AJi
    public final void Q(String str, RoomSticker roomSticker) {
        C1AJM c1ajm;
        String str2;
        boolean zLIZ;
        List<String> listLIZ;
        List<String> listLIZ2;
        if (isViewValid() && this.LLILZ && (c1ajm = this.LLJJI) != null) {
            ImageModel imageModel = roomSticker.image;
            String str3 = null;
            if (imageModel != null && (listLIZ2 = C842240X2g.LIZ(imageModel)) != null) {
                str2 = (String) ListProtector.get(listLIZ2, 0);
            } else {
                str2 = null;
            }
            String strLJJJLIIL = C1AJM.LJJJLIIL(str2);
            ImageModel imageModel2 = roomSticker.ninePatchImage;
            if (imageModel2 != null && (listLIZ = C842240X2g.LIZ(imageModel2)) != null) {
                str3 = (String) ListProtector.get(listLIZ, 0);
            }
            String strLJJJLIIL2 = C1AJM.LJJJLIIL(str3);
            if (roomSticker.type == 4 && C342701Ur.LIZ(roomSticker)) {
                List listLJFF = C342601Uq.LJFF();
                if (!((ArrayList) listLJFF).isEmpty()) {
                    zLIZ = C342601Uq.LIZ(Long.valueOf(roomSticker.id), str, listLJFF);
                } else {
                    zLIZ = roomSticker.edited;
                }
                if (str != null && str.length() != 0) {
                    String string = new StringBuilder(str).toString();
                    if (C342601Uq.LIZJ(string) || u.LJJIFFI(string, " ", "", false).length() == 0) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                str = roomSticker.content;
                zLIZ = false;
            }
            if (!roomSticker.hasUploadToServer) {
                roomSticker.hasUploadToServer = true;
            }
            int i = roomSticker.type;
            if (i == 6) {
                i = 5;
            }
            Map<String, Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("room_id", Long.valueOf(c1ajm.LL)), new Pair(FollowStatusChangeMethod.PARAM_UID, Long.valueOf(roomSticker.id)), new Pair("name", roomSticker.name), new Pair("type", Integer.valueOf(i)), new Pair("content", str), new Pair("content_key", roomSticker.contentKey), new Pair("text_size", Integer.valueOf(roomSticker.textSize)), new Pair("text_color", roomSticker.textColor), new Pair("image_uri", strLJJJLIIL), new Pair("nine_patch_image_uri", strLJJJLIIL2), new Pair("x", Integer.valueOf(roomSticker.xPosition)), new Pair("y", Integer.valueOf(roomSticker.yPosition)), new Pair("w", Integer.valueOf(roomSticker.screenWidth)), new Pair("h", Integer.valueOf(roomSticker.screenHeight)), new Pair("top_left_h", Integer.valueOf(roomSticker.topLeftHeight)), new Pair("top_left_w", Integer.valueOf(roomSticker.topLeftWidth)), new Pair("bottom_right_h", Integer.valueOf(roomSticker.bottomRightHeight)), new Pair("bottom_right_w", Integer.valueOf(roomSticker.bottomRightWidth)), new Pair("edited", Boolean.valueOf(zLIZ)), new Pair("reward_sticker", Boolean.valueOf(roomSticker.isFromReward)));
            C1AJX.LIZJ = SystemClock.elapsedRealtime();
            ((RoomStickerApi) C482260Ivg.LIZJ(RoomStickerApi.class)).setRoomStickers(mapLJIIIIZZ).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0ynP
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("RoomStickerPresenter@1cdb.setRoomSticker$1$1");
                    C1AJX.LIZIZ(2, 1, "");
                    C1C7U.LIZIZ("RoomStickerPresenter@1cdb.setRoomSticker$1$1");
                }
            }, new AfS197S0100000_28(c1ajm, 4));
        }
    }
}
