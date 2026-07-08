package com.ss.android.ugc.aweme.services.publish;

/* JADX INFO: loaded from: classes19.dex */
public interface IAVPublishWhiteBoxService {
    boolean enableShowWhiteBoxedCard(String str);

    void markCardDismissed(String str);

    void recordWhiteBoxCardClick(String str);

    void recordWhiteBoxCardPublished(String str);
}
