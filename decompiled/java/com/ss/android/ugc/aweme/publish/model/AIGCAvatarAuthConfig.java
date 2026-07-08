package com.ss.android.ugc.aweme.publish.model;

import X.C09CT;
import X.InterfaceC2126708Uv;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes31.dex */
public final class AIGCAvatarAuthConfig extends BaseResponse {

    @C09CT("access_key_id")
    @InterfaceC2126708Uv
    public String accessKeyId;

    @C09CT("current_time")
    public String currentTime;

    @C09CT("expire_time")
    public String expireTime;

    @C09CT("secret_access_key")
    @InterfaceC2126708Uv
    public String secretAccessKey;

    @C09CT("service_id")
    public String serviceId;

    @C09CT("session_token")
    @InterfaceC2126708Uv
    public String sessionToken;

    @C09CT("upload_host")
    public String uploadHost;

    public final boolean LJ() {
        String str = this.expireTime;
        if (str == null) {
            return false;
        }
        try {
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(str);
                return date != null && SystemClock.elapsedRealtime() < date.getTime() - ((long) 10000);
            } catch (ParseException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        }
        return false;
    }
}
