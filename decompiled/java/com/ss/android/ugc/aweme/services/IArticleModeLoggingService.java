package com.ss.android.ugc.aweme.services;

import X.C2344009Gk;

/* JADX INFO: loaded from: classes29.dex */
public interface IArticleModeLoggingService {
    void logArticleDetailExit(String str);

    void logArticleDetailStaytime(C2344009Gk c2344009Gk, Integer num, Long l);

    void logClickCopyLink();

    void logClickMoreAction();

    void logClickOpenOtherBrowser(String str, String str2);

    void logClickReport(String str, Integer num, String str2, String str3);

    void logClickRetry(String str, String str2);

    void logEnterArticleDetail(C2344009Gk c2344009Gk, Integer num);

    void logMultiAnchorStayTime(C2344009Gk c2344009Gk, long j);

    void logRssFeedClick(String str);
}
