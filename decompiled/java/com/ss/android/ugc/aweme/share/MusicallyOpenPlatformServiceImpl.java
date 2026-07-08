package com.ss.android.ugc.aweme.share;

import android.content.Context;
import android.content.Intent;
import com.zhiliaoapp.musically.openauthorize.AwemeAuthorizedActivity;

/* JADX INFO: loaded from: classes17.dex */
public final class MusicallyOpenPlatformServiceImpl extends OpenPlatformServiceImpl {
    @Override // com.ss.android.ugc.aweme.share.OpenPlatformServiceImpl, com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final Intent LIZ(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, AwemeAuthorizedActivity.class);
        return intent;
    }
}
