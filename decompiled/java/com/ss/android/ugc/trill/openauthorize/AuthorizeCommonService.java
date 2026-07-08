package com.ss.android.ugc.trill.openauthorize;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService;
import com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity;

/* JADX INFO: loaded from: classes17.dex */
public final class AuthorizeCommonService implements IAuthorizeCommonService {
    @Override // com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService
    public final boolean isActivityAwemeAuthorize(Activity activity) {
        if (!(activity instanceof AwemeAuthorizedActivity) && !(activity instanceof com.zhiliaoapp.musically.openauthorize.AwemeAuthorizedActivity) && !(activity instanceof com.nc.tiktok.usmain.openauthorize.AwemeAuthorizedActivity) && !(activity instanceof AwemeAuthorizeLoginActivity)) {
            return false;
        }
        return true;
    }
}
