package com.ss.android.ugc.aweme.music.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class TTToDspLogExtra implements Serializable {
    public final HashMap<String, String> logExtra = new HashMap<>();

    public final HashMap<String, String> getLogExtra() {
        return this.logExtra;
    }

    public final void append(Map<String, String> map) {
        if (map != null) {
            this.logExtra.putAll(map);
        }
    }

    public final void append(String str, String str2) {
        this.logExtra.put(str, str2);
    }
}
