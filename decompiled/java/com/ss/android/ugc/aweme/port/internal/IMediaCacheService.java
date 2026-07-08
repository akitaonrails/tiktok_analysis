package com.ss.android.ugc.aweme.port.internal;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public interface IMediaCacheService {
    void cacheImageColor(String str, int i, boolean z);

    void cacheImageSize(String str);

    void cacheImageSize(String str, int i, int i2, int i3);

    long getFileSize(String str);

    Pair<Integer, Integer> getImageColorCache(String str);

    int getImageRotateDegree(String str);

    Pair<Integer, Integer> getImageSizeCache(String str);

    Boolean getMediaTypeCache(String str);

    HashMap<String, String> getMetaData(String str);

    Boolean hasOriginAudioFromCache(String str);

    void updateFileSize(String str);

    void updateMediaTypeCache(String str);

    void updateMediaTypeCache(String str, String str2);

    void updateMetaDataCache(String str);

    void updateVideoInfoCache(String str);

    void updateVideoOriginAudioCache(String str);
}
