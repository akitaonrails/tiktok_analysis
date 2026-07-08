package com.ss.android.ugc.aweme.feedback;

import X.C1684090tvT;
import X.C19EG;
import android.content.Context;

/* JADX INFO: loaded from: classes22.dex */
public interface IScreenShotFeedbackService {
    boolean isFeedbackEnable(boolean z);

    void sendShareFeedbackEvent();

    void startUploadScreenShotFeedback(Context context, String str);

    boolean tryShowScreenShotFloatingView(C19EG c19eg, String str, String str2, C1684090tvT<?> c1684090tvT, boolean z);
}
