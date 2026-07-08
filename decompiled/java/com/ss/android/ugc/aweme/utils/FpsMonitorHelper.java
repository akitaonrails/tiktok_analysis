package com.ss.android.ugc.aweme.utils;

import X.C0VWN;
import X.InterfaceC1602960roc;
import com.ss.android.ugc.aweme.im.saas.host.api.performance.IFpsMonitorHelper;

/* JADX INFO: loaded from: classes32.dex */
public final class FpsMonitorHelper implements IFpsMonitorHelper {
    public static final FpsMonitorHelper LIZIZ = new FpsMonitorHelper();

    public static final class Service implements IFpsMonitorHelper {
        public final /* synthetic */ FpsMonitorHelper LIZIZ = FpsMonitorHelper.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.saas.host.api.performance.IFpsMonitorHelper
        public final void start() {
            this.LIZIZ.start();
        }

        @Override // com.ss.android.ugc.aweme.im.saas.host.api.performance.IFpsMonitorHelper
        public final void stop() {
            this.LIZIZ.stop();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.performance.IFpsMonitorHelper
    public final void start() {
        C0VWN.LIZ("aweme_im_open_emoji_panel", false).start();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.performance.IFpsMonitorHelper
    public final void stop() {
        InterfaceC1602960roc interfaceC1602960rocLIZIZ = C0VWN.LIZIZ("aweme_im_open_emoji_panel");
        if (interfaceC1602960rocLIZIZ != null) {
            interfaceC1602960rocLIZIZ.stop();
        }
    }
}
