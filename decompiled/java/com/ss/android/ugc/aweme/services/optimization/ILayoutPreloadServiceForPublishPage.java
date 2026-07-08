package com.ss.android.ugc.aweme.services.optimization;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;

/* JADX INFO: loaded from: classes9.dex */
public interface ILayoutPreloadServiceForPublishPage {
    View loadMainLayoutFiles(String str, Context context, LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z);

    View loadOtherLayoutFiles(String str, Context context, LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z);

    void preloadLayoutFilesInToolsPage(Context context, CreativeModel creativeModel);
}
