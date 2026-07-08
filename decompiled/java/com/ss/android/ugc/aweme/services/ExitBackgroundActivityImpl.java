package com.ss.android.ugc.aweme.services;

import X.C04TD;
import X.C198H;
import X.C20622515mp;
import X.InterfaceC20597015ii;
import android.app.Activity;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.port.in.ExitBackgroundActivityApi;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;

/* JADX INFO: loaded from: classes9.dex */
public final class ExitBackgroundActivityImpl implements ExitBackgroundActivityApi {
    public static ExitBackgroundActivityApi createExitBackgroundActivityApibyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ExitBackgroundActivityApi.class, z);
        if (objLIZ != null) {
            return (ExitBackgroundActivityApi) objLIZ;
        }
        if (C04TD.z4 == null) {
            synchronized (ExitBackgroundActivityApi.class) {
                if (C04TD.z4 == null) {
                    C04TD.z4 = new ExitBackgroundActivityImpl();
                }
            }
        }
        return C04TD.z4;
    }

    private final String getPageType(Scene scene) {
        if (scene instanceof TikTokCameraBaseGroupScene) {
            return "video_shoot_page";
        }
        if (scene instanceof VideoPublishContainerScene) {
            return "video_post_page";
        }
        if (scene instanceof VideoEditContainerScene) {
            return "video_edit_page";
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.ExitBackgroundActivityApi
    public String activityType(Activity activity) {
        C198H c198hLC;
        Scene scene;
        String pageType;
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
        if (interfaceC20597015iiLIZJ == null || (c198hLC = interfaceC20597015iiLIZJ.LC()) == null || (scene = c198hLC.getScene()) == null || (pageType = getPageType(scene)) == null) {
            return null;
        }
        return pageType;
    }
}
