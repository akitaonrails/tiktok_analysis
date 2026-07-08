package com.ss.android.ugc.aweme.services;

import android.app.Activity;

/* JADX INFO: loaded from: classes29.dex */
public interface ISignupAndLoginPanelReorderService {
    boolean finishSkippableSignupAndLoginPanelIfExists(Activity activity);

    boolean reorderSignupAndLoginPanelToForeground(Activity activity);
}
