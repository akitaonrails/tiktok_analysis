package com.ss.android.ugc.aweme.services;

import X.C1166090gRz;
import android.content.Context;
import com.bytedance.router.OnActivityResultCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public interface IArticleModeRssService {
    void fetchRssUser(Context context, Function1<? super C1166090gRz, Unit> function1);

    boolean getHasRssEntrypointClicked();

    boolean isArticleRssCreationEnabled();

    void markRssEntrypointClicked();

    void openRssFeed(Context context, String str, String str2);

    void openRssLinkFlow(Context context, String str, String str2, OnActivityResultCallback onActivityResultCallback);

    public static final class DefaultImpls {
        public static /* synthetic */ void openRssLinkFlow$default(IArticleModeRssService iArticleModeRssService, Context context, String str, String str2, OnActivityResultCallback onActivityResultCallback, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = "";
                }
                if ((i & 8) != 0) {
                    onActivityResultCallback = null;
                }
                iArticleModeRssService.openRssLinkFlow(context, str, str2, onActivityResultCallback);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openRssLinkFlow");
        }
    }
}
