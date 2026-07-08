package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class CaptionStruct implements Serializable {

    @C09CT("asr_service")
    public String asrService;

    @C09CT("audio_uri")
    public String audioUri;

    @C09CT("auto_captions")
    public List<AutocaptionType> autoCaptions;

    @C09CT("disable")
    public long disable;

    @C09CT("is_translatable")
    public Boolean isTranslatable;

    @C09CT("location")
    public int location;

    @C09CT("margin_bottom")
    public Integer marginBottom;

    @C09CT("margin_start")
    public Integer marginStart;

    @C09CT("margin_top")
    public Integer marginTop;

    @C09CT("select_lang")
    public String selectLang;

    @C09CT("src_lang")
    public String srcLanguage;

    @C09CT("task_id")
    public String taskId;

    @C09CT("utterances")
    public List<Utterance> utterances;

    @C09CT("video_width")
    public Integer videoWidth;

    public CaptionStruct() {
    }

    public final Boolean isTranslatable() {
        return this.isTranslatable;
    }

    public final void setAsrService(String str) {
        this.asrService = str;
    }

    public final void setAudioUri(String str) {
        this.audioUri = str;
    }

    public final void setAutoCaptions(List<AutocaptionType> list) {
        this.autoCaptions = list;
    }

    public final void setDisable(long j) {
        this.disable = j;
    }

    public final void setLocation(int i) {
        this.location = i;
    }

    public final void setMarginBottom(Integer num) {
        this.marginBottom = num;
    }

    public final void setMarginStart(Integer num) {
        this.marginStart = num;
    }

    public final void setMarginTop(Integer num) {
        this.marginTop = num;
    }

    public final void setSelectLang(String str) {
        this.selectLang = str;
    }

    public final void setSrcLanguage(String str) {
        this.srcLanguage = str;
    }

    public final void setTaskId(String str) {
        this.taskId = str;
    }

    public final void setTranslatable(Boolean bool) {
        this.isTranslatable = bool;
    }

    public final void setUtterances(List<Utterance> list) {
        this.utterances = list;
    }

    public final void setVideoWidth(Integer num) {
        this.videoWidth = num;
    }

    public CaptionStruct(String str, List<Utterance> list, int i, List<AutocaptionType> list2, String str2, long j, String str3, Boolean bool, String str4) {
        this.audioUri = str;
        this.utterances = list;
        this.location = i;
        this.autoCaptions = list2;
        this.selectLang = str2;
        this.disable = j;
        this.srcLanguage = str3;
        this.isTranslatable = bool;
        this.asrService = str4;
        this.taskId = "";
    }
}
