package com.bytedance.android.livesdk.microom;

import X.C0IFG;
import X.C0IUA;
import X.C0JSH;
import X.C474110IiX;
import X.C500260Jjc;
import X.C784440Upu;
import X.C930940aKi;
import X.InterfaceC500940Jki;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class MicRoomService implements IMicRoomService {
    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final boolean On1() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return room != null && room.roomLayout == 2;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final int eO0() {
        return Sw2((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class));
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final Map<String, String> getRoomInfo() {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add("room_id");
        arrayList.add("anchor_id");
        arrayList.add("actual_room_id");
        arrayList.add("actual_anchor_id");
        arrayList.add("live_lineup_type");
        arrayList.add("live_lineup_user_type");
        arrayList.add("live_lineup_change_type");
        C0IUA.LIZIZ(arrayList, map);
        return map;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final boolean tp1() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            return room.isOfficialChannel();
        }
        return false;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final boolean zS() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return false;
        }
        try {
            if (room.getOwner() != null) {
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                return (interfaceC500940JkiUser == null || room.getOwnerUserId() != interfaceC500940JkiUser.getCurrentUserId()) ? room.roomLayout == 2 : C0IUA.LIZ;
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final Class<? extends LiveRecyclableWidget> D11() {
        return MicRoomBackUpTipsWidget.class;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final Class<? extends LiveRecyclableWidget> Pl0() {
        return MicRoomAnchorTimeControlWidget.class;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final Class<? extends LiveRecyclableWidget> Uo2() {
        return MicRoomAudienceEnterWidget.class;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final String getEnterFromMerge() {
        return C0IUA.LJIILLIIL;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final String getEnterMethod() {
        return C0IUA.LJIIZILJ;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final Class<? extends LiveRecyclableWidget> pf2() {
        return MicRoomAudienceExitWidget.class;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final boolean t42() {
        return C0IUA.LIZ;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final Class<? extends LiveRecyclableWidget> u42() {
        return MicRoomUserInfoWidget.class;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final int Sw2(Room room) {
        if (room != null && room.roomLayout == 2) {
            OfficialChannelInfo officialChannelInfo = room.officialChannelInfo;
            if (officialChannelInfo == null || officialChannelInfo.roleType != 1) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final boolean TM(Room room) {
        if (room != null) {
            return room.isOfficialChannel();
        }
        return false;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final boolean Ve2(Room room) {
        long id;
        User user;
        if (room != null) {
            OfficialChannelInfo officialChannelInfo = room.officialChannelInfo;
            if (officialChannelInfo != null && (user = officialChannelInfo.channelUser) != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            if (id == room.getOwnerUserId()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final boolean n42(Room room) {
        if (room != null && room.roomLayout == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final LiveMicRoomInfoDialog a61(Context context, boolean z, long j, Room room) {
        LiveMicRoomInfoDialog liveMicRoomInfoDialog = new LiveMicRoomInfoDialog();
        liveMicRoomInfoDialog.LLLI = z;
        liveMicRoomInfoDialog.LLLFFI = j;
        liveMicRoomInfoDialog.LLJZ = room;
        liveMicRoomInfoDialog.LLLF = new C0JSH();
        liveMicRoomInfoDialog.LLLFF = new C474110IiX(j, room);
        liveMicRoomInfoDialog.LLLFZ = "video_head";
        liveMicRoomInfoDialog.LLJZIJLIL = C500260Jjc.LJ(context);
        return liveMicRoomInfoDialog;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final void aa2(long j, Long l, boolean z, boolean z2) {
        C784440Upu.LIZ().LIZIZ(new C0IFG(j, l, z, z2));
    }
}
