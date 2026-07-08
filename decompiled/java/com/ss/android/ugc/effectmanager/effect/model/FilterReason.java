package com.ss.android.ugc.effectmanager.effect.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class FilterReason implements Serializable {
    public final String filter_reason;
    public final int filter_type;

    public FilterReason(int i, String str) {
        this.filter_type = i;
        this.filter_reason = str;
    }
}
