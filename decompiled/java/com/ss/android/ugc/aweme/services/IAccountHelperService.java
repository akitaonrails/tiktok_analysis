package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.app.Dialog;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes14.dex */
public interface IAccountHelperService {
    void AppsFlyerUtilsTrackLoginSuccess(String str);

    void appendCommonParams(StringBuilder sb);

    void friendUploadToken(String str, String str2, String str3);

    Dialog getChangeIllegalUsernameDialog(Activity activity, User user);

    MainActivityLifecycle getHpasDialog();

    void loadWebViewUrl(String str, WebView webView);

    String selfUserApi();

    String userPermissionApi();
}
