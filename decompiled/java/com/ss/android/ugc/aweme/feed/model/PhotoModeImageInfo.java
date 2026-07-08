package com.ss.android.ugc.aweme.feed.model;

import X.C09C2;
import X.C09CT;
import X.C2097608Jq;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModeImageInfo implements Serializable {
    public transient boolean hasReportedCoverChangedSuccess;

    @C09CT("help_post_info")
    public HelpPostInfo helpPostInfo;

    @C09CT("images")
    public List<PhotoModeImageUrlModel> imageList;

    @C09CT("image_post_cover")
    public PhotoModeImageUrlModel imagePostCover;
    public transient PhotoModeImage maxImage;
    public transient PhotoModeImage minImage;

    @C09CT("music_volume")
    public Float musicVolume;
    public transient List<PhotoModeImage> photoModeImageList;

    @C09CT("post_extra")
    public String postExtra;
    public Map<String, ? extends Object> postExtraMapCache;

    @C09CT("photomode_image_quality_info")
    public String qualityMap;

    @C09CT("search_outflow_display_image")
    public PhotoModeImageUrlModel searchOutflowDisplayImage;

    @C09CT("title")
    public String title;

    @C09CT("translation_info")
    public TranslationInfo translationInfo;
    public transient String truncatedTitle;
    public transient float minAspectRatio = Float.MAX_VALUE;
    public transient float maxAspectRatio = Float.NEGATIVE_INFINITY;

    public final Map<String, Object> getPostExtraMap() {
        Map<String, ? extends Object> mapLJ;
        Map<String, ? extends Object> map = this.postExtraMapCache;
        if (map != null) {
            return map;
        }
        try {
            Gson gsonLIZ = C09C2.LIZ();
            String str = this.postExtra;
            if (str == null) {
                str = "";
            }
            mapLJ = (Map) gsonLIZ.LJIIIIZZ(str, new TypeToken<Map<String, ? extends Object>>() { // from class: com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo$getPostExtraMap$postExtraMap$1
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            mapLJ = C2097608Jq.LJ();
        }
        this.postExtraMapCache = mapLJ;
        return mapLJ;
    }

    public final boolean hasTitle() {
        String str = this.title;
        return str != null && (a0.LJJJIL(str) ^ true);
    }

    public final boolean isTitleTruncated() {
        String str = this.truncatedTitle;
        return (str == null || str.length() == 0 || Intrinsics.LJFF(this.title, this.truncatedTitle)) ? false : true;
    }

    public final boolean getHasReportedCoverChangedSuccess() {
        return this.hasReportedCoverChangedSuccess;
    }

    public final HelpPostInfo getHelpPostInfo() {
        return this.helpPostInfo;
    }

    public final List<PhotoModeImageUrlModel> getImageList() {
        return this.imageList;
    }

    public final PhotoModeImageUrlModel getImagePostCover() {
        return this.imagePostCover;
    }

    public final float getMaxAspectRatio() {
        return this.maxAspectRatio;
    }

    public final PhotoModeImage getMaxImage() {
        return this.maxImage;
    }

    public final float getMinAspectRatio() {
        return this.minAspectRatio;
    }

    public final PhotoModeImage getMinImage() {
        return this.minImage;
    }

    public final Float getMusicVolume() {
        return this.musicVolume;
    }

    public final List<PhotoModeImage> getPhotoModeImageList() {
        return this.photoModeImageList;
    }

    public final String getPostExtra() {
        return this.postExtra;
    }

    public final String getQualityMap() {
        return this.qualityMap;
    }

    public final PhotoModeImageUrlModel getSearchOutflowDisplayImage() {
        return this.searchOutflowDisplayImage;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TranslationInfo getTranslationInfo() {
        return this.translationInfo;
    }

    public final String getTruncatedTitle() {
        return this.truncatedTitle;
    }

    public final void setHasReportedCoverChangedSuccess(boolean z) {
        this.hasReportedCoverChangedSuccess = z;
    }

    public final void setHelpPostInfo(HelpPostInfo helpPostInfo) {
        this.helpPostInfo = helpPostInfo;
    }

    public final void setImageList(List<PhotoModeImageUrlModel> list) {
        this.imageList = list;
    }

    public final void setImagePostCover(PhotoModeImageUrlModel photoModeImageUrlModel) {
        this.imagePostCover = photoModeImageUrlModel;
    }

    public final void setMaxAspectRatio(float f) {
        this.maxAspectRatio = f;
    }

    public final void setMaxImage(PhotoModeImage photoModeImage) {
        this.maxImage = photoModeImage;
    }

    public final void setMinAspectRatio(float f) {
        this.minAspectRatio = f;
    }

    public final void setMinImage(PhotoModeImage photoModeImage) {
        this.minImage = photoModeImage;
    }

    public final void setMusicVolume(Float f) {
        this.musicVolume = f;
    }

    public final void setPhotoModeImageList(List<PhotoModeImage> list) {
        this.photoModeImageList = list;
    }

    public final void setQualityMap(String str) {
        this.qualityMap = str;
    }

    public final void setSearchOutflowDisplayImage(PhotoModeImageUrlModel photoModeImageUrlModel) {
        this.searchOutflowDisplayImage = photoModeImageUrlModel;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTranslationInfo(TranslationInfo translationInfo) {
        this.translationInfo = translationInfo;
    }

    public final void setTruncatedTitle(String str) {
        this.truncatedTitle = str;
    }
}
