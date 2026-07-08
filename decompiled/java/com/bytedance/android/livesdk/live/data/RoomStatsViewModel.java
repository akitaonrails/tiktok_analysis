package com.bytedance.android.livesdk.live.data;

import X.C0IKQ;
import X.C11S5;
import X.C1701940uOG;
import X.C1C7U;
import X.C472830IgT;
import X.C480460Ism;
import Y.AfS176S0100000_7;
import Y.AfS55S0110000_7;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.live.model.RoomStatsModel;
import com.bytedance.android.livesdk.util.rxutils.RxViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class RoomStatsViewModel extends RxViewModel {
    public final MutableLiveData<Map<String, RoomStatsModel>> mRoomStatsResponse = new MutableLiveData<>();
    public final MutableLiveData<Map<String, RoomStatsModel>> mRoomRecommendResponse = new MutableLiveData<>();
    public final MutableLiveData<Map<String, RoomStatsModel>> allRoomStatusResponse = new MutableLiveData<>();

    public MutableLiveData<Map<String, RoomStatsModel>> getAllRoomStatusResponse() {
        return this.allRoomStatusResponse;
    }

    public MutableLiveData<Map<String, RoomStatsModel>> getRoomRecommendResponse() {
        return this.mRoomRecommendResponse;
    }

    public MutableLiveData<Map<String, RoomStatsModel>> getRoomStatsResponse() {
        return this.mRoomStatsResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkRecommend$2(C472830IgT c472830IgT) {
        C1C7U.LIZ("RoomStatsViewModel@b727.checkRecommend$1L");
        if (!C0IKQ.LIZ(c472830IgT.data)) {
            HashMap map = new HashMap();
            for (T t : c472830IgT.data) {
                if (t != null) {
                    map.put(String.valueOf(t.roomId), t);
                }
            }
            this.mRoomRecommendResponse.setValue(map);
        } else {
            this.mRoomRecommendResponse.setValue(new HashMap());
        }
        C1C7U.LIZIZ("RoomStatsViewModel@b727.checkRecommend$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkRecommend$3(Throwable th) {
        C1C7U.LIZ("RoomStatsViewModel@b727.checkRecommend$2L");
        this.mRoomRecommendResponse.setValue(new HashMap());
        C1C7U.LIZIZ("RoomStatsViewModel@b727.checkRecommend$2L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getRoomStats$0(boolean z, C472830IgT c472830IgT) {
        C1C7U.LIZ("RoomStatsViewModel@b727.getRoomStats$1L");
        if (!C0IKQ.LIZ(c472830IgT.data)) {
            HashMap map = new HashMap();
            for (T t : c472830IgT.data) {
                map.put(String.valueOf(t.roomId), t);
            }
            if (z) {
                this.allRoomStatusResponse.setValue(map);
            } else {
                this.mRoomStatsResponse.setValue(map);
            }
        }
        C1C7U.LIZIZ("RoomStatsViewModel@b727.getRoomStats$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getRoomStats$1(boolean z, Throwable th) {
        C1C7U.LIZ("RoomStatsViewModel@b727.getRoomStats$2L");
        if (z) {
            this.allRoomStatusResponse.setValue(new HashMap());
        } else {
            this.mRoomStatsResponse.setValue(new HashMap());
        }
        C1C7U.LIZIZ("RoomStatsViewModel@b727.getRoomStats$2L");
    }

    public void checkRecommend(List<Room> list, String str, List<String> list2) {
        if (C0IKQ.LIZ(list)) {
            this.mRoomRecommendResponse.setValue(new HashMap());
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (Room room : list) {
            if (room != null) {
                linkedList.add(Long.valueOf(room.getId()));
            }
        }
        String strJoin = TextUtils.join(",", linkedList);
        String strJoin2 = TextUtils.join(",", list2);
        HashMap<String, String> map = new HashMap<>();
        map.put("room_ids", strJoin);
        map.put("enter_from", str);
        map.put("check_params", strJoin2);
        C480460Ism.LIZ().getClass();
        ((RoomStatApi) C480460Ism.LIZLLL(RoomStatApi.class)).checkRoomStatus(map).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 213), new AfS176S0100000_7(this, 214));
    }

    public void getRoomStats(List<Room> list, String str, List<String> list2, boolean z) {
        if (C0IKQ.LIZ(list)) {
            this.mRoomStatsResponse.setValue(new HashMap());
            return;
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Room room = (Room) ListProtector.get(list, i);
            if (i != 0) {
                sb.append(",");
            }
            if (room != null) {
                sb.append(room.getId());
            }
        }
        String string = sb.toString();
        HashMap<String, String> map = new HashMap<>();
        map.put("room_ids", string);
        map.put("enter_from", str);
        if (!list2.isEmpty() && z) {
            map.put("check_params", TextUtils.join(",", list2));
        }
        C480460Ism.LIZ().getClass();
        ((RoomStatApi) C480460Ism.LIZLLL(RoomStatApi.class)).checkRoom(map).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS55S0110000_7(this, z, 5), new AfS55S0110000_7(this, z, 6));
    }
}
