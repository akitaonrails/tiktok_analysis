package com.ss.android.ugc.aweme.services.optimization;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes23.dex */
public interface ILayoutPreloadServiceForEditPage {
    void clearCache();

    InjectLayoutInflater createInjectLayoutInflater();

    View loadLayoutFiles(String str, Context context, LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z);

    View loadLayoutToolbarFiles(String str, Context context, LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z);

    void preloadLayoutFiles(Context context, int i);

    void preloadLayoutFiles(Context context, Bundle bundle);

    void preloadLayoutFilesForPublishExtension(Context context);

    void preloadLayoutFilesForUpload(Scene scene, String str);

    void preloadLayoutFilesFromShootMode(Scene scene, Integer num);
}
