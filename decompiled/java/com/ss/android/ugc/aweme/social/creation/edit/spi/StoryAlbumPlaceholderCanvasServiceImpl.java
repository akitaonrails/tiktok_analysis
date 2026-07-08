package com.ss.android.ugc.aweme.social.creation.edit.spi;

import X.C0MOA;
import X.C1697810uHb;
import X.C567420MNg;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.social.creation.api.edit.spi.IStoryAlbumPlaceholderCanvasService;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public final class StoryAlbumPlaceholderCanvasServiceImpl implements IStoryAlbumPlaceholderCanvasService {
    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.spi.IStoryAlbumPlaceholderCanvasService
    public final CanvasVideoData LIZ(String str, int i, int i2, Pair<Integer, Integer> pair) {
        CanvasBackground canvasBackgroundLIZIZ;
        float fLIZIZ;
        if (pair == null) {
            CanvasBackground.Companion.getClass();
            canvasBackgroundLIZIZ = CanvasBackground.DEFAULT_BACKGROUND;
        } else if (pair.getFirst().intValue() == pair.getSecond().intValue()) {
            C567420MNg c567420MNg = CanvasBackground.Companion;
            int iIntValue = pair.getFirst().intValue();
            c567420MNg.getClass();
            canvasBackgroundLIZIZ = C567420MNg.LIZ(iIntValue);
        } else {
            canvasBackgroundLIZIZ = C567420MNg.LIZIZ(CanvasBackground.Companion, pair.getFirst().intValue(), pair.getSecond().intValue());
        }
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(str);
        List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(str);
        if (i > 0 && i2 > 0) {
            fLIZIZ = C0MOA.LIZIZ(i, i2);
        } else {
            fLIZIZ = 1.0f;
        }
        CanvasVideoData canvasVideoData = new CanvasVideoData(listLJIILJJIL, listLJIILJJIL2, canvasBackgroundLIZIZ, null, null, 0, null, 0, null, null, null, null, 4088, null);
        if (fLIZIZ != 1.0f) {
            CanvasFilterParam canvasFilterParam = new CanvasFilterParam();
            canvasFilterParam.setScaleFactor(fLIZIZ);
            canvasFilterParam.setClipIndex(0);
            canvasVideoData.putTransform(canvasFilterParam);
        }
        return canvasVideoData;
    }
}
