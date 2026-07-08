package com.bytedance.business.base;

import android.app.Activity;
import com.bytedance.business.base.jira.IGoToFeedbackListener;
import com.bytedance.business.base.jira.IOnGetMoreParamsListener;

/* JADX INFO: loaded from: classes4.dex */
public interface IBugReportService {
    boolean canDrawOverlays();

    void captureScreen();

    void goJiraCreateActivity();

    void permissionChecker(Activity activity);

    void setEmail(String str);

    void setGoToFeedbackListener(IGoToFeedbackListener iGoToFeedbackListener);

    void setOnGetMoreParamsListener(IOnGetMoreParamsListener iOnGetMoreParamsListener);

    void startScreenshotObserver();

    void stopScreenshotObserver();
}
