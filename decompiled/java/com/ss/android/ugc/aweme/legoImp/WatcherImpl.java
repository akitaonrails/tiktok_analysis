package com.ss.android.ugc.aweme.legoImp;

import X.C19371410qW;
import X.C19371510qX;
import com.bytedance.ies.watcher.IWatcher;
import com.bytedance.scene.Scene;
import java.util.HashMap;

/* JADX INFO: loaded from: classes30.dex */
public final class WatcherImpl implements IWatcher {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.10qX] */
    @Override // com.bytedance.ies.watcher.IWatcher
    public final C19371510qX LIZ() {
        return new C19371410qW() { // from class: X.10qX
            public final String[] LIZIZ = {"extra", "play_count", "share_count", "comment_count", "digg_count", "download_count", "photosensitiveMaskInfo", "reportMaskInfo", "generalMaskInfo", "createTime", "user_count", "view_count"};

            @Override // X.C19371410qW, X.InterfaceC19371110qT
            public final String[] LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.C19371410qW, X.InterfaceC19371110qT
            public final void LIZ(long j, String str) {
                HashMap map = new HashMap();
                map.put(str, String.valueOf(j));
                map.put(Scene.SCENE_SERVICE, str);
                map.put("duration", String.valueOf(j));
                C20684815ws.LJIILLIIL("metrics_watcher", map);
            }
        };
    }
}
