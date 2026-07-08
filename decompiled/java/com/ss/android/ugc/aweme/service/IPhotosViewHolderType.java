package com.ss.android.ugc.aweme.service;

/* JADX INFO: loaded from: classes10.dex */
public interface IPhotosViewHolderType {
    boolean declineReport(String str);

    void fadeInWidgetContainer();

    int getCurrentPlayPosition();

    long getSavedDuration(String str);

    void permitEventReport();

    void saveDuration(long j, String str);

    void setCurrentPlayPosition(int i);

    void setStartTime(long j, String str);
}
