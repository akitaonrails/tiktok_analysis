package com.ss.android.ugc.aweme.ecommercelive.audience.common.livewindow;

import X.C0C64;
import X.C16E0;
import X.C19FO;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class WindowLivePlayerCompatImpl implements IWindowLivePlayerCompat {
    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.livewindow.IWindowLivePlayerCompat
    public final void LIZ(C19FO c19fo, StreamUrlStruct streamUrlStruct, EnterRoomConfig enterRoomConfig, String str, Map map) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ttec_live_small_window_enable", true, false) && ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().canShowInternalWindow(null)) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().Be(c19fo, Boolean.FALSE);
        } else {
            new C16E0(c19fo, streamUrlStruct, enterRoomConfig, str, map, true, null, null).LIZLLL();
        }
    }
}
