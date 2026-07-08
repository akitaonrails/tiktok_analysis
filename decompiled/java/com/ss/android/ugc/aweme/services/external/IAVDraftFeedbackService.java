package com.ss.android.ugc.aweme.services.external;

import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface IAVDraftFeedbackService {

    public static final class DefaultImpls {
    }

    String getDBCreationTime();

    String getDBEventAsJSON();

    String getReadableDBPath();

    List<Integer> queryUserDraftCounts(boolean z);
}
