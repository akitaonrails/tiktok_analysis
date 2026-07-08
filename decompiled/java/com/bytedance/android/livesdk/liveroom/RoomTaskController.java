package com.bytedance.android.livesdk.liveroom;

import X.C0IL2;
import X.C1161920gLG;
import X.C11NZ;
import X.C1701940uOG;
import X.C2093608Ic;
import X.C467050ITf;
import X.InterfaceC420801kM;
import Y.AfS176S0100000_7;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class RoomTaskController implements ISubController {
    public List<InterfaceC420801kM> taskDisposable = new ArrayList();

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onPause() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
        EnterRoomConfig.RoomsData roomsData;
        List<C467050ITf> liveActivityTasksSetting = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getLiveActivityTasksSetting();
        EnterRoomConfig enterRoomConfig = C0IL2.LIZ.LIZ().mEnterRoomConfig;
        if (liveActivityTasksSetting == null || liveActivityTasksSetting.size() <= 0 || enterRoomConfig == null || (roomsData = enterRoomConfig.mRoomsData) == null || !C2093608Ic.LIZJ("referral_task", roomsData.enterFromMerge)) {
            return;
        }
        for (C467050ITf c467050ITf : liveActivityTasksSetting) {
            if (c467050ITf.LIZ.intValue() == 2) {
                this.taskDisposable.add(C11NZ.LJLJL(c467050ITf.LIZIZ.longValue(), TimeUnit.SECONDS, C1701940uOG.LIZIZ()).LJJLJLI(new AfS176S0100000_7(c467050ITf, 73)));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestroy() {
        Iterator<InterfaceC420801kM> it2 = this.taskDisposable.iterator();
        while (it2.hasNext()) {
            it2.next().dispose();
        }
    }
}
