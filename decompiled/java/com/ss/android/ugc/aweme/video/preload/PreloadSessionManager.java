package com.ss.android.ugc.aweme.video.preload;

import android.text.TextUtils;
import android.util.LruCache;

/* JADX INFO: loaded from: classes24.dex */
public final class PreloadSessionManager {
    public static final PreloadSessionManager LIZIZ = new PreloadSessionManager();
    public final LruCache<String, PreloadSession> LIZ = new LruCache<>(100);

    public static class PreloadSession {
        public String key;
        public String sourceId;
        public int speed = -3;

        public static PreloadSession instance() {
            return new PreloadSession();
        }
    }

    public final synchronized PreloadSession LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LIZ.get(str);
    }
}
