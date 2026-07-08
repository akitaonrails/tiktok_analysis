package com.bytedance.android.livesdk.api;

import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.chatroom.model.GetSettingPanelData;
import com.bytedance.scene.Scene;
import kotlin.Unit;
import tikcast.api.anchor.AnchorSwitchUpdateRequest;
import tikcast.api.anchor.AnchorSwitchUpdateResponse;
import tikcast.api.epiphron.UploadFeatureRequest;
import tikcast.api.epiphron.UploadFeatureResponse;
import webcast.api.creator.PreScheduleStream;
import webcast.api.room.CreateInfoRequest;
import webcast.api.room.UploadDeviceSignalReq;

/* JADX INFO: loaded from: classes13.dex */
public interface BroadcastRoomApiKt {
    @InterfaceC1501160pAQ("/webcast/room/get_setting_panel/")
    Object getMorePanelSettingData(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, InterfaceC1364105Vn<? super C470590Icr<GetSettingPanelData>> interfaceC1364105Vn);

    @C09SO(EnumC1846380y9E.BROADCAST)
    @InterfaceC1501170pAR("/webcast/room/create_info/")
    Object getRoomCreateInfo(@InterfaceC1485405rg CreateInfoRequest createInfoRequest, InterfaceC1364105Vn<? super C470590Icr<RoomCreateInfo>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/room/pre_schedule_stream/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    Object preScheduleStream(@InterfaceC1501070pAH("full_sdk_params") long j, InterfaceC1364105Vn<? super C470590Icr<PreScheduleStream>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/event_report/")
    Object reportEvent(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("event") int i, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/anchor/switch/update/")
    Object updateAutoshareToBBStatus(@InterfaceC1485405rg AnchorSwitchUpdateRequest anchorSwitchUpdateRequest, InterfaceC1364105Vn<? super C470590Icr<AnchorSwitchUpdateResponse>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/epiphron/feature/upload/")
    Object upload(@InterfaceC1485405rg UploadFeatureRequest uploadFeatureRequest, InterfaceC1364105Vn<? super C470590Icr<UploadFeatureResponse>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/room/upload_device_signal/")
    Object uploadDeviceSignal(@InterfaceC1485405rg UploadDeviceSignalReq uploadDeviceSignalReq, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn);
}
