package com.ss.android.ugc.aweme.services.performance;

/* JADX INFO: loaded from: classes14.dex */
public interface ICrashReportService {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    void addCrashCustomTagListener(ICrashCustomTagListener iCrashCustomTagListener);

    void report(int i);

    void setCustomTag(String str, String str2);
}
