package com.ss.android.ugc.aweme.memory.profiler.strategy;

import com.bytedance.scene.Scene;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class ObjectClassMapping {
    public static final ObjectClassMapping INSTANCE = new ObjectClassMapping();
    public static final String[] FRAGMENT_CLASSES = {"androidx.fragment.app.Fragment", "android.app.Fragment"};
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String[] map(String str) {
        String lowerCase = a0.LJLIIIL(str).toString().toLowerCase(Locale.ROOT);
        switch (lowerCase.hashCode()) {
            case -1772600516:
                if (lowerCase.equals("lynxview")) {
                    return new String[]{"com.lynx.tasm.LynxView"};
                }
                break;
            case -1655966961:
                if (lowerCase.equals("activity")) {
                    return new String[]{"android.app.Activity"};
                }
                break;
            case -1650269616:
                if (lowerCase.equals("fragment")) {
                    return FRAGMENT_CLASSES;
                }
                break;
            case -1401878318:
                if (lowerCase.equals("surfaceview")) {
                    return new String[]{"android.view.SurfaceView"};
                }
                break;
            case -1349119146:
                if (lowerCase.equals("cursor")) {
                    return new String[]{"android.database.Cursor"};
                }
                break;
            case -675792745:
                if (lowerCase.equals("typeface")) {
                    return new String[]{"android.graphics.Typeface"};
                }
                break;
            case 116939:
                if (lowerCase.equals("vod")) {
                    return new String[]{"com.ss.ttvideo.TTKPlayerV2Temp1"};
                }
                break;
            case 3322092:
                if (lowerCase.equals("live")) {
                    return new String[]{"com.ss.videoarch.liveplayer.VideoLiveManager"};
                }
                break;
            case 3619493:
                if (lowerCase.equals("view")) {
                    return new String[]{"android.view.View"};
                }
                break;
            case 93227207:
                if (lowerCase.equals("aweme")) {
                    return new String[]{"com.ss.android.ugc.aweme.feed.model.Aweme"};
                }
                break;
            case 109254796:
                if (lowerCase.equals(Scene.SCENE_SERVICE)) {
                    return new String[]{"com.bytedance.scene.Scene"};
                }
                break;
            case 419382382:
                if (lowerCase.equals("appcontext")) {
                    return new String[]{"android.app.ContextImpl"};
                }
                break;
            case 938516884:
                if (lowerCase.equals("androidview")) {
                    return new String[]{"com.lynx.tasm.behavior.ui.view.AndroidView"};
                }
                break;
            case 1224424441:
                if (lowerCase.equals("webview")) {
                    return new String[]{"android.webkit.WebView"};
                }
                break;
        }
        return new String[]{str};
    }
}
