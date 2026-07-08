package com.bytedance.lobby.internal;

import X.C19EG;
import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.lobby.auth.AuthResult;

/* JADX INFO: loaded from: classes34.dex */
public class LobbyViewModel extends BaseViewModel<AuthResult> {
    public final LiveData wQ2() {
        return this.LL;
    }

    public LobbyViewModel(Application application) {
        super(application);
    }

    public static LobbyViewModel vQ2(C19EG c19eg) {
        return (LobbyViewModel) ViewModelProviders.of(c19eg).get(LobbyViewModel.class);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void xQ2(AuthResult authResult) {
        this.LL.postValue((T) authResult);
    }
}
