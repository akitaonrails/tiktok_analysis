package com.ss.android.ugc.aweme.external.ability;

import X.C201955140j;
import X.C457760HxG;
import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sticker.api.provider.IMStickerFallbackProvider;
import com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerApiProviderService;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService;
import com.ss.android.ugc.aweme.services.external.ability.VideoStickerEntryMethod;

/* JADX INFO: loaded from: classes22.dex */
public final class Video2StickerServiceShim implements IVideo2StickerService {
    public static final /* synthetic */ int LIZ = 0;

    public static IVideo2StickerService LIZIZ() {
        IStickerApiProviderService iStickerApiProviderServiceLIZ;
        if (!C457760HxG.LIZJ()) {
            iStickerApiProviderServiceLIZ = (IStickerApiProviderService) PluggableExtentionKt.pluggableSpi$default(IStickerApiProviderService.class, false, false, false, 14, null);
        } else if (C457760HxG.LIZIZ(true)) {
            iStickerApiProviderServiceLIZ = (IStickerApiProviderService) PluggableExtentionKt.pluggableSpiForReal(IStickerApiProviderService.class);
        } else {
            C201955140j.LIZ("Video2StickerServiceShim: sticker DF not ready, treating Video2Sticker call as no-op");
            IMStickerFallbackProvider iMStickerFallbackProvider = (IMStickerFallbackProvider) PluggableExtentionKt.pluggableSpi$default(IMStickerFallbackProvider.class, false, false, false, 14, null);
            iStickerApiProviderServiceLIZ = iMStickerFallbackProvider != null ? iMStickerFallbackProvider.LIZ() : null;
            if (!(iStickerApiProviderServiceLIZ instanceof IStickerApiProviderService)) {
                return null;
            }
        }
        if (iStickerApiProviderServiceLIZ != null) {
            return iStickerApiProviderServiceLIZ.getVideo2StickerService();
        }
        return null;
    }

    public static void LIZ(IVideo2StickerService.Callback callback) {
        if (callback != null) {
            callback.onFailed(null, "sticker DF not ready", -10001);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService
    public final void downloadAndOpenVideoTrimForSticker(Activity activity, Aweme aweme, IVideo2StickerService.Callback callback) {
        C457760HxG.LIZ(activity);
        if (!C457760HxG.LIZIZ(true)) {
            LIZ(callback);
            return;
        }
        IVideo2StickerService iVideo2StickerServiceLIZIZ = LIZIZ();
        if (iVideo2StickerServiceLIZIZ != null) {
            iVideo2StickerServiceLIZIZ.downloadAndOpenVideoTrimForSticker(activity, aweme, callback);
        } else {
            LIZ(callback);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService
    public final void openVideoTrimForSticker(Activity activity, String str, long j, String str2) {
        IVideo2StickerService iVideo2StickerServiceLIZIZ;
        C457760HxG.LIZ(activity);
        if (C457760HxG.LIZIZ(true) && (iVideo2StickerServiceLIZIZ = LIZIZ()) != null) {
            iVideo2StickerServiceLIZIZ.openVideoTrimForSticker(activity, str, j, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService
    public final void photo2Sticker(Activity activity, MediaModel mediaModel, Intent intent, IVideo2StickerService.Callback callback) {
        C457760HxG.LIZ(activity);
        if (!C457760HxG.LIZIZ(true)) {
            LIZ(callback);
            return;
        }
        IVideo2StickerService iVideo2StickerServiceLIZIZ = LIZIZ();
        if (iVideo2StickerServiceLIZIZ != null) {
            iVideo2StickerServiceLIZIZ.photo2Sticker(activity, mediaModel, intent, callback);
        } else {
            LIZ(callback);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService
    public final void photo2Sticker(Activity activity, String str, Intent intent, IVideo2StickerService.Callback callback) {
        C457760HxG.LIZ(activity);
        if (!C457760HxG.LIZIZ(true)) {
            LIZ(callback);
            return;
        }
        IVideo2StickerService iVideo2StickerServiceLIZIZ = LIZIZ();
        if (iVideo2StickerServiceLIZIZ != null) {
            iVideo2StickerServiceLIZIZ.photo2Sticker(activity, str, intent, callback);
        } else {
            LIZ(callback);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService
    public final void video2StickerEdit(Activity activity, Aweme aweme, VideoStickerEntryMethod videoStickerEntryMethod, IVideo2StickerService.Callback callback, String str, String str2) {
        C457760HxG.LIZ(activity);
        if (!C457760HxG.LIZIZ(true)) {
            LIZ(callback);
            return;
        }
        IVideo2StickerService iVideo2StickerServiceLIZIZ = LIZIZ();
        if (iVideo2StickerServiceLIZIZ != null) {
            iVideo2StickerServiceLIZIZ.video2StickerEdit(activity, aweme, videoStickerEntryMethod, callback, str, str2);
        } else {
            LIZ(callback);
        }
    }
}
