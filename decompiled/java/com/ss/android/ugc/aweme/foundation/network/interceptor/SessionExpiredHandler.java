package com.ss.android.ugc.aweme.foundation.network.interceptor;

import X.C0XS7;
import X.C1499330p7T;
import X.C1948507kB;
import X.C718040SEo;
import X.C786410Ut5;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.bnpl.IBNPLService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class SessionExpiredHandler implements NetworkPartner.ResponseHandler {
    public static String LIZIZ;
    public final String LIZ;

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    public SessionExpiredHandler(String str) {
        this.LIZ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ResponseHandler
    public final void LIZ(C0XS7<?> c0xs7, C1499330p7T c1499330p7T) {
        BaseResponse baseResponse;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pipo_pa_session_expired_handler_ignore_scene_enable", true) && C1948507kB.LIZ(LIZIZ) && Intrinsics.LJFF(LIZIZ, this.LIZ)) {
            return;
        }
        T t = c0xs7.LJII;
        if ((t instanceof BaseResponse) && (baseResponse = (BaseResponse) t) != null && Intrinsics.LJFF(baseResponse.errorCode, "LOGIN_STATUS_EXPIRED")) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0pKs
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SessionExpiredHandler@cdd0.handleResponse$1$1$1");
                    try {
                        C1716550ulp.LIZ.getClass();
                        if (!C1716550ulp.LIZLLL.getAndSet(true)) {
                            ((IBNPLService) ServiceManager.get().getService(IBNPLService.class)).LIZ();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SessionExpiredHandler@cdd0.handleResponse$1$1$1");
                }
            });
        }
    }
}
