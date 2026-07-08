package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes30.dex */
public interface IAVRouterIntentParse {
    void directFromPushIntent(Activity activity, Uri uri, boolean z, boolean z2);

    void handlePublishVideoRouteUri(Context context, Uri uri);

    void parserTo(Activity activity, Uri uri, boolean z);
}
