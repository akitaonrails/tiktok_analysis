package com.bytedance.android.livesdk.comp.impl.liveeventsticker.network;

import X.C09CT;
import X.C1117450fBX;
import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.model.message.RoomEventMessage;
import kotlin.Unit;

/* JADX INFO: loaded from: classes18.dex */
public interface ILiveEventStickerApi {
    public static final C1117450fBX LIZ = C1117450fBX.LIZ;

    public static final class PreviewStickerInfoResponse {

        @C09CT("roomEventMessageInfo")
        public final RoomEventMessage roomEventMessage;
    }

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/event/sticker/config")
    Object configLiveEventSticker(@InterfaceC1501050pAF("room_id") Long l, @InterfaceC1501050pAF("event_id") long j, @InterfaceC1501050pAF("own_user_id") long j2, @InterfaceC1501050pAF("pos_x") String str, @InterfaceC1501050pAF("pos_y") String str2, @InterfaceC1501050pAF("opt_type") int i, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/event/sticker/pre_Live_Page_info")
    Object getPreviewPageStickerInfo(@InterfaceC1501050pAF("own_user_id") long j, InterfaceC1364105Vn<? super C470590Icr<PreviewStickerInfoResponse>> interfaceC1364105Vn);
}
