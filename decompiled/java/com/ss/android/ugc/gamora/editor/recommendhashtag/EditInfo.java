package com.ss.android.ugc.gamora.editor.recommendhashtag;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class EditInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("captionContentList")
    public List<String> captionContentList;

    @C09CT("effectIdList")
    public List<String> effectIdList;

    @C09CT("filterIdList")
    public List<String> filterIdList;

    @C09CT("musicIdList")
    public List<String> musicIdList;

    @C09CT("stickerContentList")
    public List<String> stickerContentList;

    @C09CT("stickerIdList")
    public List<String> stickerIdList;

    public EditInfo() {
        this(null, null, null, null, null, null);
    }

    public final boolean hasInfo() {
        return (this.effectIdList == null && this.musicIdList == null && this.stickerIdList == null && this.stickerContentList == null && this.captionContentList == null && this.filterIdList == null) ? false : true;
    }

    public final List<String> getCaptionContentList() {
        return this.captionContentList;
    }

    public final List<String> getEffectIdList() {
        return this.effectIdList;
    }

    public final List<String> getFilterIdList() {
        return this.filterIdList;
    }

    public final List<String> getMusicIdList() {
        return this.musicIdList;
    }

    public final List<String> getStickerContentList() {
        return this.stickerContentList;
    }

    public final List<String> getStickerIdList() {
        return this.stickerIdList;
    }

    public final boolean isEqualWith(EditInfo editInfo) {
        if (editInfo == null || !Intrinsics.LJFF(this.effectIdList, editInfo.effectIdList) || !Intrinsics.LJFF(this.musicIdList, editInfo.musicIdList) || !Intrinsics.LJFF(this.stickerIdList, editInfo.stickerIdList) || !Intrinsics.LJFF(this.stickerContentList, editInfo.stickerContentList) || !Intrinsics.LJFF(this.captionContentList, editInfo.captionContentList)) {
            return false;
        }
        return Intrinsics.LJFF(this.filterIdList, editInfo.filterIdList);
    }

    public final void setCaptionContentList(List<String> list) {
        this.captionContentList = list;
    }

    public final void setEffectIdList(List<String> list) {
        this.effectIdList = list;
    }

    public final void setFilterIdList(List<String> list) {
        this.filterIdList = list;
    }

    public final void setMusicIdList(List<String> list) {
        this.musicIdList = list;
    }

    public final void setStickerContentList(List<String> list) {
        this.stickerContentList = list;
    }

    public final void setStickerIdList(List<String> list) {
        this.stickerIdList = list;
    }

    public EditInfo(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6) {
        this.effectIdList = list;
        this.musicIdList = list2;
        this.stickerIdList = list3;
        this.stickerContentList = list4;
        this.captionContentList = list5;
        this.filterIdList = list6;
    }
}
