package com.ss.android.ttf.tasks.applog;

import X.C01GW;
import X.C0CQT;
import X.C0TKA;
import X.C1486420ome;
import X.C325110Con;
import X.EnumC1486410omd;
import X.EnumC325100Com;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.tiktok.ttf.applog.init.IAppLogNetworkContext;

/* JADX INFO: loaded from: classes24.dex */
public final class AppLogNetworkContextImpl implements IAppLogNetworkContext {
    @Override // com.tiktok.ttf.applog.init.IAppLogNetworkContext
    public final String LIZ() {
        if (!C0TKA.LJI) {
            return "https://log-va.tiktokv.com/service/2/device_register/";
        }
        C01GW c01gw = C1486420ome.LIZ;
        return (((Number) c01gw.getValue()).intValue() == 2 || ((Number) c01gw.getValue()).intValue() == 3) ? "https://api.tiktokv.com/service/2/device_register/" : "https://log-va.tiktokv.com/service/2/device_register/";
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogNetworkContext
    public final int getEffectiveConnectionType() {
        INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
        if (iNetworkStateService != null) {
            return iNetworkStateService.getEffectiveConnectionType();
        }
        return -2;
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogNetworkContext
    public final EnumC1486410omd getNetworkStatus() {
        EnumC325100Com networkStatus;
        INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
        if (iNetworkStateService != null && (networkStatus = iNetworkStateService.getNetworkStatus()) != null) {
            int i = C325110Con.LIZ[networkStatus.ordinal()];
            if (i == 1) {
                return EnumC1486410omd.STRONG;
            }
            if (i == 2) {
                return EnumC1486410omd.WEAK;
            }
            if (i == 3) {
                return EnumC1486410omd.NOT_AVAILABLE;
            }
            if (i == 4) {
                return EnumC1486410omd.FAKE;
            }
        }
        return EnumC1486410omd.STRONG;
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogNetworkContext
    public final String LIZIZ() {
        return "https://log-va.tiktokv.com/service/2/log_settings/";
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogNetworkContext
    public final String LIZJ() {
        return "https://log-va.tiktokv.com/service/2/app_log/";
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogNetworkContext
    public final String LIZLLL() {
        return "log-va.tiktokv.com";
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogNetworkContext
    public final String LJFF() {
        return C0CQT.LIZJ;
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogNetworkContext
    public final String LJI() {
        return "https://rtlog.tiktokv.com/service/2/app_log/";
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogNetworkContext
    public final String LJ(String str) {
        NetworkUtils.com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        return str;
    }
}
