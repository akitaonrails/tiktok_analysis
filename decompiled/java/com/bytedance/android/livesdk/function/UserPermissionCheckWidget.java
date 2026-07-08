package com.bytedance.android.livesdk.function;

import X.C08D5;
import X.C0IHL;
import X.C0IK5;
import X.C0IL2;
import X.C0IMC;
import X.C0IVR;
import X.C0IXW;
import X.C0J1N;
import X.C0UO0;
import X.C1078480eAg;
import X.C1161920gLG;
import X.C11LS;
import X.C11NZ;
import X.C11RD;
import X.C2188811AlT;
import X.C464950ILd;
import X.C467650IVn;
import X.C468000IWw;
import X.C472970Igh;
import X.C480460Ism;
import X.C749100Ta0;
import Y.ARunnableS107S0100000_7;
import Y.AfS132S0000000_7;
import Y.AfS176S0100000_7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveAdaptStrategyAddParamsSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnterRoomClickPerfOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveEnterRoomVersionSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSignalService;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class UserPermissionCheckWidget extends LiveRecyclableWidget {
    public Room LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public C11LS LLILZIL;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C11LS c11ls = this.LLILZIL;
        if (c11ls == null || c11ls.isDisposed()) {
            return;
        }
        this.LLILZIL.dispose();
    }

    public final void x1() {
        C11NZ<BaseResponse<Room, EnterRoomExtra>> c11nzNewVersionEnterRoom;
        Room room = this.LL;
        if (room == null || room.getId() <= 0) {
            C468000IWw.LIZIZ("check permission error", -105L, -1L, 0L, 0L, "null", CardStruct.IStatusCode.DEFAULT, this.dataChannel);
            return;
        }
        EnterRoomConfig enterRoomConfig = C0IL2.LIZ.LIZ().mEnterRoomConfig;
        C468000IWw.LIZIZ("check permission error", -105L, -1L, 0L, 0L, "null", C0IVR.LJIIIIZZ(enterRoomConfig), this.dataChannel);
        C464950ILd c464950ILd = C464950ILd.LJI;
        long id = this.LL.getId();
        String requestId = this.LL.getRequestId();
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String strLIZIZ = this.LLILZ;
        String str3 = enterRoomConfig.mLogData.liveReason;
        String str4 = enterRoomConfig.mRoomsData.shareFromUserId;
        HashMap<String, String> mapLJI = C0IXW.LJI(C0IXW.LIZIZ(null, this.dataChannel, ""));
        boolean z = enterRoomConfig.mRoomsData.isFresh;
        c464950ILd.getClass();
        boolean zLJI = MethodIDManager.LJI(71983);
        if ("draw".equals(str) && "live_detail-hourly_rank".equals(strLIZIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C0IHL c0ihl = new C0IHL();
        c0ihl.LIZ("common_label_list", str2);
        c0ihl.LIZ("enter_source", strLIZIZ);
        c0ihl.LIZ("request_id", requestId);
        c0ihl.LIZ("enter_type", str);
        c0ihl.LIZ("live_reason", str3);
        c0ihl.LIZ("enter_from_uid_by_shared", str4);
        c0ihl.LIZ("is_fresh", z ? "1" : CardStruct.IStatusCode.DEFAULT);
        c0ihl.LIZ("ecommerce_use_new_promotion", "1");
        HashMap<String, String> map = c0ihl.LIZ;
        map.putAll(mapLJI);
        if (LiveAdaptStrategyAddParamsSetting.INSTANCE.getValue()) {
            HashMap map2 = new HashMap();
            map2.put("user_type", "viewer");
            ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).fillUploadFeatures(map2, "enter_room");
            List<Long> list = C472970Igh.LIZ;
            String strLJIIIZ = C472970Igh.LJIIIZ(map2, new C0IMC(null, null, null, null));
            if (strLJIIIZ != null) {
                map.put("epi_features", strLJIIIZ);
            }
        }
        if (!LiveEnterRoomClickPerfOptSetting.optAabCheckOnEnterRoom()) {
            C08D5.LIZIZ(C0IK5.LIZ(), new ARunnableS107S0100000_7(c464950ILd, 166), null, 0L);
        }
        long j = UserService.getInstance().user().isLogin() ? 1L : 0L;
        String version = LiveEnterRoomVersionSetting.getVersion();
        if (version.isEmpty()) {
            C480460Ism.LIZ().getClass();
            c11nzNewVersionEnterRoom = ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).enterRoom(id, 1L, j, map);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            C480460Ism.LIZ().getClass();
            c11nzNewVersionEnterRoom = ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).newVersionEnterRoom(version, id, 1L, j, map);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
        ((C0J1N) c11nzNewVersionEnterRoom.LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this))).LIZ(new AfS132S0000000_7(1), new AfS176S0100000_7(this, 6));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        this.LL = (Room) this.dataChannel.gg0(RoomChannel.class);
        C467650IVn c467650IVn = (C467650IVn) this.dataChannel.gg0(C749100Ta0.class);
        if (c467650IVn != null) {
            this.LLILLJJLI = c467650IVn.LJJJJ;
            this.LLILLL = c467650IVn.LJIIZILJ;
            this.LLILZ = c467650IVn.LJJJJI;
        }
        this.LLILZIL = (C11LS) UserService.getInstance().user().LJII().LJIIL(new AfS176S0100000_7(this, 5));
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof C1078480eAg) {
                    x1();
                }
            }
        }
    }
}
