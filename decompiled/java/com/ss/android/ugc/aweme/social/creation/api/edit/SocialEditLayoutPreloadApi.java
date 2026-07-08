package com.ss.android.ugc.aweme.social.creation.api.edit;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes9.dex */
public interface SocialEditLayoutPreloadApi {
    View LIZ(Context context, LayoutInflater layoutInflater, int i, ViewGroup viewGroup);

    void clearCache();

    void preloadLayoutFiles(Context context, Bundle bundle);
}
