package com.ss.android.ugc.aweme.services.external;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public interface ICacheService {
    String aiChatExtractFrameDir();

    Collection<String> allowList();

    String autoCleanMarkDir();

    String cacheDir();

    void clearCreativeCacheFiles();

    void clearDraftEffectCache();

    void clearEffectCache();

    void clearExpiredDrafts();

    void clearFilterCache();

    String compatMusDraftDir();

    Collection<String> draftAllowList();

    ArrayList<String> draftMusicList();

    String duetCacheDir(String str);

    String duetCreativeDir(String str);

    String duetPublicDir();

    String effectCacheDir();

    String effectModelDir();

    boolean isHasEffectCache();

    String musicDir();

    String mvRootDir();

    Collection<String> originSoundFile();

    File[] outputFile();

    void preloadDraftEffectList();

    File[] rawDuetFile();

    File[] rawVideoFile();

    String rootDir();

    String shareCreativeDir(CreativeInfo creativeInfo);

    String shareDir();

    String stickerDir();

    String stitchPublicDir();

    File[] synthesisFile();

    File[] tempDuetFile();

    Collection<String> tempVideoFile();

    File[] voiceFile();
}
