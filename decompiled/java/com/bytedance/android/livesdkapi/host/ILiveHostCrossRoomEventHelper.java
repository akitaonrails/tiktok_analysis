package com.bytedance.android.livesdkapi.host;

import X.C006A;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface ILiveHostCrossRoomEventHelper extends C006A {
    void addPkTransfer(Map<String, String> map, Room room, String str);

    void clearId();

    String getFromRequestId();

    String getFromRoomId();

    long getIsMatchOpponent();

    long getIsTransfer();

    Map<String, String> getMatchLogParams();

    /* bridge */ /* synthetic */ void onInit();

    void setCoHostCommonParams(Map<String, String> map);

    void setFromRoomIdAndFromRequestId(String str, String str2);
}
