package com.ss.android.ugc.aweme.secapi;

import X.C149A;
import X.C149B;
import X.EnumC20222314Ar;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface ISecApi {
    void dismissCaptcha();

    Map<String, String> frameSign(String str, int i);

    void initSec(Context context, String str, int i, String str2, String str3, boolean z, C149B c149b);

    void initTask();

    boolean isCaptchaUrl(String str);

    boolean needVerifyImage(int i);

    String onEvent();

    void popCaptcha(Activity activity, int i, C149A c149a);

    void popCaptchaV2(Activity activity, String str, C149A c149a, Fragment fragment);

    void reportData(String str);

    void setDeviceInfo(String str, String str2);

    void setParams();

    void updateCollectMode(EnumC20222314Ar enumC20222314Ar);

    void updateDeviceIdAndInstallId(String str, String str2);
}
