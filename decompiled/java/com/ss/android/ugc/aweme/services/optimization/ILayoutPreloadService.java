package com.ss.android.ugc.aweme.services.optimization;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes26.dex */
public interface ILayoutPreloadService {
    View loadLayoutFiles(String str, Context context, LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z);

    void preloadLayoutFiles();

    void preloadLayoutSerial();
}
