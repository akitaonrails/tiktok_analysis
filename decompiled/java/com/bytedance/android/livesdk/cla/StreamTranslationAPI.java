package com.bytedance.android.livesdk.cla;

import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import webcast.api.room.WebcastRoomSwitchStreamLanguageResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface StreamTranslationAPI {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/switch_stream_language/")
    C11NZ<WebcastRoomSwitchStreamLanguageResponse> switchStreamLanguage(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("need_translated") boolean z);
}
