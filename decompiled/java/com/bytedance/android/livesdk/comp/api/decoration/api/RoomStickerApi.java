package com.bytedance.android.livesdk.comp.api.decoration.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.model.StickerCheckResponse;
import com.bytedance.android.livesdk.model.StickersSetResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public interface RoomStickerApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/stickers/check/")
    C11NZ<C470590Icr<StickerCheckResponse>> checkEditable(@InterfaceC1501050pAF("sticker_id_list") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/stickers/del/")
    C11NZ<C470590Icr<Object>> deleteRoomStickers(@InterfaceC1501050pAF("sticker_id") long j, @InterfaceC1501050pAF("room_id") long j2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/stickers/set/")
    C11NZ<C470590Icr<StickersSetResponse>> setRoomStickers(@InterfaceC1501150pAP Map<String, Object> map);
}
