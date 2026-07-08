package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C2188811AlT;
import X.C504670Jqj;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_surface_view_scene")
public final class LiveSurfaceViewSceneSetting {
    public static final LiveSurfaceViewSceneSetting INSTANCE = new LiveSurfaceViewSceneSetting();
    public static final SurfaceViewScene DEFAULT = new SurfaceViewScene(false, false, false, false, "");
    public static final SurfaceViewScene ENABLE = new SurfaceViewScene(false, false, true, false, "");
    public static final SurfaceViewScene All = new SurfaceViewScene(true, true, true, true, "");

    public final SurfaceViewScene getAll() {
        return All;
    }

    public final SurfaceViewScene getDEFAULT() {
        return DEFAULT;
    }

    public final SurfaceViewScene getENABLE() {
        return ENABLE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean isEnableScene(EnterRoomConfig enterRoomConfig) {
        String str;
        String str2;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        EnterRoomConfig.RoomsData roomsData3;
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SurfaceViewScene surfaceViewScene = DEFAULT;
        SurfaceViewScene surfaceViewScene2 = (SurfaceViewScene) settingsManager.getValueSafely("live_surface_view_scene", surfaceViewScene);
        if (surfaceViewScene2 != null) {
            surfaceViewScene = surfaceViewScene2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str3 = null;
        if (enterRoomConfig != null && (roomsData3 = enterRoomConfig.mRoomsData) != null) {
            str = roomsData3.enterFromMerge;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append('_');
        if (enterRoomConfig != null && (roomsData2 = enterRoomConfig.mRoomsData) != null) {
            str3 = roomsData2.enterMethod;
        }
        sbLIZ.append(str3);
        if (C504670Jqj.LIZ(C2188811AlT.LIZIZ(sbLIZ), surfaceViewScene.forbidden_entrance)) {
            return false;
        }
        if (enterRoomConfig == null || (roomsData = enterRoomConfig.mRoomsData) == null || (str2 = roomsData.enterRoomScene) == null) {
            str2 = "";
        }
        switch (str2.hashCode()) {
            case -1336041635:
                if (str2.equals("outside_with_feed")) {
                    return surfaceViewScene.outside_with_feed;
                }
                return false;
            case 380150922:
                if (str2.equals("outside_normal_click")) {
                    return surfaceViewScene.outside_normal_click;
                }
                return false;
            case 823139725:
                if (str2.equals("inner_draw")) {
                    return surfaceViewScene.inner_draw;
                }
                return false;
            case 823321719:
                if (str2.equals("inner_jump")) {
                    return surfaceViewScene.inner_jump;
                }
                return false;
            default:
                return false;
        }
    }
}
