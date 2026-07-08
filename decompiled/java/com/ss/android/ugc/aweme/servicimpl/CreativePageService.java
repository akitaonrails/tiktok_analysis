package com.ss.android.ugc.aweme.servicimpl;

import android.app.Activity;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.video.ICreativePageService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;

/* JADX INFO: loaded from: classes23.dex */
public final class CreativePageService implements ICreativePageService {
    @Override // com.ss.android.ugc.aweme.services.video.ICreativePageService
    public final boolean isImageEditPage(Activity activity) {
        ICreativeSAAService iCreativeSAAService;
        Scene currentScene = null;
        if (activity != null && (iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null)) != null) {
            currentScene = iCreativeSAAService.getCurrentScene(activity);
        }
        return currentScene instanceof ImageEditRootScene;
    }

    @Override // com.ss.android.ugc.aweme.services.video.ICreativePageService
    public final boolean isPublishPage(Activity activity) {
        Scene currentScene;
        if (activity == null) {
            return false;
        }
        ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
        if (iCreativeSAAService != null) {
            currentScene = iCreativeSAAService.getCurrentScene(activity);
        } else {
            currentScene = null;
        }
        return currentScene instanceof VideoPublishContainerScene;
    }

    @Override // com.ss.android.ugc.aweme.services.video.ICreativePageService
    public final boolean isRecordPage(Activity activity) {
        Scene currentScene;
        if (activity == null) {
            return false;
        }
        ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
        if (iCreativeSAAService != null) {
            currentScene = iCreativeSAAService.getCurrentScene(activity);
        } else {
            currentScene = null;
        }
        return currentScene instanceof TikTokCameraBaseGroupScene;
    }

    @Override // com.ss.android.ugc.aweme.services.video.ICreativePageService
    public final boolean isVideoEditPage(Activity activity) {
        Scene currentScene;
        if (activity == null) {
            return false;
        }
        ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
        if (iCreativeSAAService != null) {
            currentScene = iCreativeSAAService.getCurrentScene(activity);
        } else {
            currentScene = null;
        }
        return currentScene instanceof VideoEditContainerScene;
    }
}
