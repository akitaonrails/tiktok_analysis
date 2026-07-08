package com.ss.android.ugc.aweme.live.liveshare;

import X.AnonymousClass0956;
import X.C11NJ;
import X.C11S5;
import X.C1701940uOG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C346430Di5;
import X.C480460Ism;
import Y.AfS173S0100000_4;
import Y.AfS33S1300000_4;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveShareStickerViewModel extends ViewModel {
    public AnonymousClass0956 LLILLL;
    public final MutableLiveData<Boolean> LL = new MutableLiveData<>();
    public final MutableLiveData<Room> LLILLJJLI = new MutableLiveData<>();
    public final C11NJ LLILZ = new C11NJ();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        wQ2(0L, "onCleared");
        this.LLILZ.dispose();
    }

    public final void wQ2(Long l, String str) {
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLL = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopPolling: ownerName: ");
        sbLIZ.append(str);
        sbLIZ.append(", roomid: ");
        sbLIZ.append(l);
        C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void vQ2(Long l, String str, Boolean bool, Function0<Unit> function0) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRoomInfoByRoomId: ");
        sbLIZ.append(l);
        sbLIZ.append(", ownerName: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
        if (l != null && l.longValue() != 0) {
            C480460Ism.LIZ().getClass();
            RoomRetrofitApi roomRetrofitApi = (RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class);
            HashMap<String, String> map = new HashMap<>();
            map.put("room_id", l.toString());
            this.LLILZ.LIZ(roomRetrofitApi.fetchRoom(map).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIIJZLJL(new C346430Di5(function0, 0)).LJJLL(new AfS33S1300000_4(str, this, l, bool, 0), new AfS173S0100000_4(this, 7)));
            return;
        }
        C20441214yg.LJ("LiveShareSticker", "getRoomInfoByRoomId: roomId is null");
    }
}
