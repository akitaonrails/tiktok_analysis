package com.bytedance.android.livesdk.microom;

import X.AbstractC19994813Le;
import X.C001A;
import X.C09JN;
import X.C0UZS;
import X.C1161920gLG;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C13LP;
import X.C158B;
import X.C1701940uOG;
import X.C480460Ism;
import X.C521820KdI;
import X.C776250Uch;
import X.C784440Upu;
import Y.AfS176S0100000_7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiGuestIsLinkedAsAudienceForMicRoomChannelChannel;
import com.bytedance.android.live.liveinteract.api.MultiGuestIsLinkedAsGuestForMicRoomChangeChannel;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class MicRoomAudienceExitWidget extends LiveRecyclableWidget {
    public OfficialChannelInfo LLILLL;
    public Room LLILZ;
    public IMicRoomService LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public final int LL = 30;
    public final C11NJ LLILLJJLI = new C11NJ();
    public final C521820KdI LLIZLLLIL = new C521820KdI(this, 1);

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void A1() {
        User user;
        OfficialChannelInfo officialChannelInfo;
        Room room = this.LLILZ;
        Long lValueOf = (room == null || (officialChannelInfo = room.officialChannelInfo) == null) ? null : Long.valueOf(officialChannelInfo.backupRoomId);
        Room room2 = this.LLILZ;
        boolean zLJFF = Intrinsics.LJFF(lValueOf, room2 != null ? Long.valueOf(room2.getId()) : null);
        IMicRoomService iMicRoomService = this.LLILZIL;
        boolean z = (iMicRoomService == null || iMicRoomService.tp1() || zLJFF) ? false : true;
        IMicRoomService iMicRoomService2 = this.LLILZIL;
        boolean z2 = iMicRoomService2 != null && iMicRoomService2.Sw2(this.LLILZ) == 2;
        if (z || z2) {
            Room room3 = this.LLILZ;
            this.LLILZLL = room3 != null ? room3.getId() : 0L;
            Room room4 = this.LLILZ;
            this.LLIZ = room4 != null ? room4.getOwnerUserId() : 0L;
            OfficialChannelInfo officialChannelInfo2 = this.LLILLL;
            B1(((officialChannelInfo2 != null ? officialChannelInfo2.endTimeStamp : 0L) - (C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))) + x1());
            return;
        }
        C480460Ism.LIZ().getClass();
        MicRoomApi micRoomApi = (MicRoomApi) C480460Ism.LIZLLL(MicRoomApi.class);
        OfficialChannelInfo officialChannelInfo3 = this.LLILLL;
        long id = (officialChannelInfo3 == null || (user = officialChannelInfo3.channelUser) == null) ? 0L : user.getId();
        Room room5 = this.LLILZ;
        this.LLILLJJLI.LIZ(micRoomApi.getNextRoomData(id, room5 != null ? room5.getOwnerUserId() : 0L).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 81), new C09JN() { // from class: X.0IiB
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MicRoomAudienceExitWidget@25c1.requestNextRoom$disposable$2");
                C1C7U.LIZIZ("MicRoomAudienceExitWidget@25c1.requestNextRoom$disposable$2");
            }
        }));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LLILLJJLI.LJ();
    }

    public final long x1() {
        Map<Long, Long> map;
        Object next;
        Integer num;
        OfficialChannelInfo officialChannelInfo = this.LLILLL;
        if (officialChannelInfo == null || (map = officialChannelInfo.delayEnterTime) == null || map.isEmpty()) {
            return 30L;
        }
        DataChannel dataChannel = this.dataChannel;
        int iIntValue = (dataChannel == null || (num = (Integer) dataChannel.gg0(C0UZS.class)) == null) ? 0 : num.intValue();
        Iterator it2 = C13LP.LJLLJ(C13LP.LLIIII(this.LLILLL.delayEnterTime.keySet())).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (iIntValue <= ((Long) next).longValue()) {
                break;
            }
        }
        Long l = (Long) next;
        if (l == null) {
            return 30L;
        }
        Long l2 = this.LLILLL.delayEnterTime.get(Long.valueOf(l.longValue()));
        if (l2 != null) {
            return l2.longValue();
        }
        return 30L;
    }

    public final void y1() {
        OfficialChannelInfo officialChannelInfo = this.LLILLL;
        if (officialChannelInfo != null) {
            long jLIZ = officialChannelInfo.endTimeStamp - (C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            long jNextInt = AbstractC19994813Le.Default.nextInt(this.LL, (int) (((long) this.LL) + Math.max(1L, officialChannelInfo.maxNextTime)));
            if (jLIZ <= jNextInt) {
                A1();
            } else {
                this.LLILLJJLI.LIZ(C11NZ.LJLJJLL(jLIZ - jNextInt, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 80), new C09JN() { // from class: X.0IiA
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("MicRoomAudienceExitWidget@25c1.controlToNextRoom$1$disposable$2");
                        C1C7U.LIZIZ("MicRoomAudienceExitWidget@25c1.controlToNextRoom$1$disposable$2");
                    }
                }));
            }
        }
    }

    public final void z1() {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        if (this.LLILZLL == 0) {
            C784440Upu.LIZ().LIZIZ(new Object() { // from class: X.0IGp
            });
            return;
        }
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        boolean z = (iInteractService != null && iInteractService.mJ()) || ((dataChannel = this.dataChannel) != null && Intrinsics.LJFF(dataChannel.gg0(MultiGuestIsLinkedAsGuestForMicRoomChangeChannel.class), Boolean.TRUE));
        boolean z2 = (iInteractService != null && iInteractService.kZ()) || ((dataChannel2 = this.dataChannel) != null && Intrinsics.LJFF(dataChannel2.gg0(MultiGuestIsLinkedAsAudienceForMicRoomChannelChannel.class), Boolean.TRUE));
        IMicRoomService iMicRoomService = this.LLILZIL;
        if (iMicRoomService != null) {
            iMicRoomService.aa2(this.LLILZLL, Long.valueOf(this.LLIZ), z, z2);
        }
    }

    public final void B1(long j) {
        if (j <= 0) {
            z1();
        } else {
            this.LLILLJJLI.LIZ(C11NZ.LJLJJLL(j, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 82), new C09JN() { // from class: X.0IiC
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("MicRoomAudienceExitWidget@25c1.scheduleJumpToNextRoom$disposable$2");
                    C1C7U.LIZIZ("MicRoomAudienceExitWidget@25c1.scheduleJumpToNextRoom$disposable$2");
                }
            }));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        IMessageManager iMessageManager;
        DataChannel dataChannel = this.dataChannel;
        OfficialChannelInfo officialChannelInfo = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLILZ = room;
        if (room != null) {
            officialChannelInfo = room.officialChannelInfo;
        }
        this.LLILLL = officialChannelInfo;
        this.LLILZIL = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        UserService.getInstance().user().getCurrentUserId();
        y1();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.OFFICIAL_CHANNEL_MODIFY_MESSAGE.getIntType(), this.LLIZLLLIL);
        }
    }
}
