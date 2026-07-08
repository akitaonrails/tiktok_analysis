package com.bytedance.android.livesdk.game.broadcast.bgbroadcast.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public interface GameAutoCoverApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/screenshot_cover/update/")
    C11NZ<C470590Icr<Void>> updateScreenShotStatus(@InterfaceC1501050pAF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) int i);
}
