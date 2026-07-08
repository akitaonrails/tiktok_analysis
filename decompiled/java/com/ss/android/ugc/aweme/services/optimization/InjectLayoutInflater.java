package com.ss.android.ugc.aweme.services.optimization;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes19.dex */
public interface InjectLayoutInflater {
    View inflate(Context context, int i, ViewGroup viewGroup, boolean z);

    boolean isInjectionEnabled();

    void setTag(String str);
}
