package com.bytedance.android.livesdk.watch;

import X.C0IIF;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public interface ILiveRoomStatusNewListener {
    void LIZ(Fragment fragment, Room room);

    void LIZIZ(LivePlayFragment livePlayFragment, Room room, long j, String str, boolean z, String str2, C0IIF c0iif, HashMap map);
}
