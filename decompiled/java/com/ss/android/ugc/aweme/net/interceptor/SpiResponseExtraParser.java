package com.ss.android.ugc.aweme.net.interceptor;

import X.C080U;
import X.C0X1Z;
import X.C0X52;
import X.C0XIR;
import X.C0XK5;
import X.C0XK8;
import X.C2175508fh;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Extra;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.secapi.ISecApi;

/* JADX INFO: loaded from: classes14.dex */
public final class SpiResponseExtraParser implements IResponseExtraParser {
    @Override // com.ss.android.ugc.aweme.net.interceptor.IResponseExtraParser
    public final C0XK5 LIZIZ(C0XIR c0xir) {
        C0XK8 c0xk8 = new C0XK8();
        c0xk8.LIZ = c0xir.getErrorCode();
        c0xk8.LIZIZ = c0xir.getErrorMsg();
        c0xir.getPrompt();
        return new C0XK5(c0xk8, -1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.net.interceptor.IResponseExtraParser
    public final C0XK5 LIZ(String str, C0X52<?> c0x52) {
        C0XK5 c0xk5LIZIZ = null;
        if (c0x52 != null) {
            T t = c0x52.LIZIZ;
            if (t != 0) {
                long j = -1;
                if (t instanceof BaseResponse) {
                    BaseResponse baseResponse = (BaseResponse) t;
                    if (((ISecApi) ServiceManager.get().getService(ISecApi.class)).isCaptchaUrl(str)) {
                        try {
                            return ResponseExtraParser.LIZIZ(C0X1Z.LIZ(c0x52.LIZ));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    C0XK8 c0xk8 = new C0XK8();
                    c0xk8.LIZ = baseResponse.status_code;
                    c0xk8.LIZIZ = baseResponse.status_msg;
                    BaseResponse.ServerTimeExtra serverTimeExtra = baseResponse.extra;
                    if (serverTimeExtra != null) {
                        j = serverTimeExtra.now;
                    }
                    return new C0XK5(c0xk8, j);
                }
                if (t instanceof String) {
                    return ResponseExtraParser.LIZIZ(t.toString());
                }
                if (t instanceof FeedItemList) {
                    FeedItemList feedItemList = (FeedItemList) t;
                    C0XK8 c0xk82 = new C0XK8();
                    int i = feedItemList.status_code;
                    if (i == 0) {
                        i = feedItemList.error_code;
                    }
                    c0xk82.LIZ = i;
                    c0xk82.LIZIZ = feedItemList.status_msg;
                    Extra extra = feedItemList.extra;
                    if (extra != null) {
                        j = extra.now;
                    }
                    return new C0XK5(c0xk82, j);
                }
            }
            C2175508fh c2175508fh = c0x52.LIZ;
            if (c2175508fh != null && c2175508fh.LJ != null) {
                C080U c080uLIZ = c2175508fh.LIZ("Transfer-Encoding");
                if (c080uLIZ != null && "chunked".equalsIgnoreCase(c080uLIZ.LIZIZ)) {
                    return null;
                }
                try {
                    System.currentTimeMillis();
                    c0xk5LIZIZ = ResponseExtraParser.LIZIZ(C0X1Z.LIZ(c0x52.LIZ));
                    return c0xk5LIZIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        return c0xk5LIZIZ;
    }
}
