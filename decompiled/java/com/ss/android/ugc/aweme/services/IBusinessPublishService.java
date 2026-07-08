package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.net.Uri;

/* JADX INFO: loaded from: classes22.dex */
public interface IBusinessPublishService {
    Class<? extends Activity> getPushCameraBlurActivityCls();

    void goDuetWithMovie(String str, Activity activity, String str2);

    void initWaterMark();

    boolean isInActivity();

    void parserTo(Activity activity, Uri uri);
}
