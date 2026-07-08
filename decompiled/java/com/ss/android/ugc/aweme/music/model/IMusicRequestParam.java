package com.ss.android.ugc.aweme.music.model;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public interface IMusicRequestParam extends Serializable {

    /* JADX INFO: loaded from: classes19.dex */
    public static final class DefaultImpls {
        public static boolean isStickPointAutoMusic(IMusicRequestParam iMusicRequestParam) {
            return false;
        }
    }

    boolean getCanFetchingSimilarSong();

    String getChallengeId();

    String getContentSource();

    String getContentType();

    String getCreationId();

    boolean getDisableCache();

    String getEffectId();

    String getEnterFrom();

    Long getFirstMusicId();

    String getInfoStickerList();

    String getItemId();

    long getMaxMusicDuration();

    String getMicroAppId();

    String getMusicID();

    int getMusicMaxLoopDuration();

    int getMusicTag();

    String getMvId();

    boolean getNoWaitFrameResult();

    String getPinnedMusicId();

    Map<String, Object> getRecommendExtra();

    Function0<Object> getRecommendMusicProvider();

    Long getReplaceMusicIndex();

    String getResourceId();

    String getShootWay();

    int getSoundPageScene();

    String getStrippedMetasongId();

    String getTextContent();

    boolean getUnlimitedOnly();

    long getVideoDuration();

    boolean getWithoutUnderstanding();

    boolean isEditPageImageMode();

    boolean isMusicLoop();

    boolean isReplaceMusic();

    boolean isStickPointAutoMusic();

    boolean isUploadClickNext();

    void setMusicLoop(boolean z);

    void setMusicMaxLoopDuration(int i);

    void setNoWaitFrameResult(boolean z);

    void setPinnedMusicId(String str);

    void setRecommendMusicProvider(Function0<? extends Object> function0);
}
