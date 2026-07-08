package com.ss.android.ugc.aweme;

import X.C0CCZ;
import X.C0XTR;
import X.C19EG;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes29.dex */
public interface ILoginServiceAppDiff {
    void attachActivity(C19EG c19eg);

    Fragment getMu2LoginWrapFragment(C0XTR c0xtr);

    C0CCZ getOneTapLoginPreloadTask();

    void handleLoginSuccess(Activity activity);

    boolean isGlobalForceLogin(String str, String str2);

    void setM2HeaderInfo();

    void startM2LoginActivity(ComponentActivity componentActivity);
}
