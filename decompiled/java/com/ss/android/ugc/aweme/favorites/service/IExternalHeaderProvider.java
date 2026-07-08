package com.ss.android.ugc.aweme.favorites.service;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes20.dex */
public interface IExternalHeaderProvider {
    int getViewType();

    boolean isFullSpan();

    void onBindViewHolder(RecyclerView.ViewHolder viewHolder);

    RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup);

    boolean shouldShow();
}
