package com.ss.android.ugc.aweme.services;

import X.C0CCZ;
import X.C0XTR;
import X.C19EG;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ILoginServiceAppDiff;

/* JADX INFO: loaded from: classes3.dex */
public final class LoginAppDiffService implements ILoginServiceAppDiff {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.ILoginServiceAppDiff
    public void attachActivity(C19EG c19eg) {
    }

    public C0CCZ getM2ReadContentProviderTask() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ILoginServiceAppDiff
    public Fragment getMu2LoginWrapFragment(C0XTR c0xtr) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ILoginServiceAppDiff
    public C0CCZ getOneTapLoginPreloadTask() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ILoginServiceAppDiff
    public void handleLoginSuccess(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.ILoginServiceAppDiff
    public boolean isGlobalForceLogin(String str, String str2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ILoginServiceAppDiff
    public void setM2HeaderInfo() {
    }

    @Override // com.ss.android.ugc.aweme.ILoginServiceAppDiff
    public void startM2LoginActivity(ComponentActivity componentActivity) {
    }
}
