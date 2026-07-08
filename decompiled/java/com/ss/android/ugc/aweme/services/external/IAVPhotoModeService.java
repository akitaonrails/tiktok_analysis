package com.ss.android.ugc.aweme.services.external;

import kotlin.Pair;

/* JADX INFO: loaded from: classes22.dex */
public interface IAVPhotoModeService {
    boolean enableSaveSingleImageAsVideo();

    Pair<Integer, Integer> getCanvasToVideoDuration();
}
