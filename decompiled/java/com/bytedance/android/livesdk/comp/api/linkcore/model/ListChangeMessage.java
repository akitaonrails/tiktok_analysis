package com.bytedance.android.livesdk.comp.api.linkcore.model;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class ListChangeMessage {
    public final CustomLinkMessage customMessage;
    public final List<Object> listContent;

    public ListChangeMessage(List<? extends Object> list, CustomLinkMessage customLinkMessage) {
        this.listContent = list;
        this.customMessage = customLinkMessage;
    }
}
