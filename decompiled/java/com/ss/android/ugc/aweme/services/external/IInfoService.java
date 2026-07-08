package com.ss.android.ugc.aweme.services.external;

import X.C1402840mbq;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes22.dex */
public interface IInfoService {
    boolean canSupportAnchorFeatureBits(TemplateScene templateScene, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, boolean z);

    VideoExposureData convertToExposureData(Object obj);

    void endDownloadEffectAlog(Effect effect, long j, long j2, int i, ExceptionResult exceptionResult);

    long getDurationSinceAppForeground(String str);

    String getExtractMusicAudioDir();

    String getExtractMusicThumbDir();

    List<MediaModel> getMediaLoaderImages(Context context);

    List<Integer> getUnSupportAnchorFeatureBitList(TemplateScene templateScene, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, boolean z);

    Pair<Integer, Integer> getUnSupportAnchorFeatureBits(TemplateScene templateScene, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, boolean z);

    boolean isNleLoaded();

    boolean isTrimmedEnable(MusicModel musicModel);

    void loadNLELib();

    void preloadTemplateLib(List<? extends Aweme> list);

    C1402840mbq shareContextInfo(BaseShortVideoContext baseShortVideoContext);

    void startDownloadEffectAlog(Effect effect, long j);

    IStickerUtilsService stickerInfo();

    public static final class DefaultImpls {
        public static /* synthetic */ boolean canSupportAnchorFeatureBits$default(IInfoService iInfoService, TemplateScene templateScene, ArrayList arrayList, ArrayList arrayList2, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    z = false;
                }
                return iInfoService.canSupportAnchorFeatureBits(templateScene, arrayList, arrayList2, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canSupportAnchorFeatureBits");
        }
    }
}
