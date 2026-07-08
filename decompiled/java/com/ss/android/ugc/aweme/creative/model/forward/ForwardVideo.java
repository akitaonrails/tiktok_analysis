package com.ss.android.ugc.aweme.creative.model.forward;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class ForwardVideo implements Serializable {

    @C09CT("awemeId")
    public final String awemeId;

    @C09CT("cacheCoverModel")
    public final UrlModel cacheCoverModel;

    @C09CT("coverRgb")
    public final String coverRgb;

    @C09CT("downloadStatus")
    public int downloadStatus;

    @C09CT("needSetCookie")
    public final boolean needSetCookie;

    @C09CT("originCoverModel")
    public final UrlModel originCoverModel;

    @C09CT("playAddressList")
    public List<String> playAddressList;

    @C09CT("simVideoUrlModel")
    public final SimVideoUrlModel simVideoUrlModel;

    @C09CT("sourceCoverList")
    public final List<String> sourceCoverList;

    @C09CT("sourceDuration")
    public final int sourceDuration;

    @C09CT("sourceHeight")
    public final int sourceHeight;

    @C09CT("sourceMeta")
    public final String sourceMeta;

    @C09CT("sourceVID")
    public final String sourceVID;

    @C09CT("sourceWidth")
    public final int sourceWidth;

    public ForwardVideo() {
        this(null, null, 0, 0, 0, null, null, null, false, null, null, null, 0, null, 16383, null);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final UrlModel getCacheCoverModel() {
        return this.cacheCoverModel;
    }

    public final String getCoverRgb() {
        return this.coverRgb;
    }

    public final int getDownloadStatus() {
        return this.downloadStatus;
    }

    public final boolean getNeedSetCookie() {
        return this.needSetCookie;
    }

    public final UrlModel getOriginCoverModel() {
        return this.originCoverModel;
    }

    public final List<String> getPlayAddressList() {
        return this.playAddressList;
    }

    public final SimVideoUrlModel getSimVideoUrlModel() {
        return this.simVideoUrlModel;
    }

    public final List<String> getSourceCoverList() {
        return this.sourceCoverList;
    }

    public final int getSourceDuration() {
        return this.sourceDuration;
    }

    public final int getSourceHeight() {
        return this.sourceHeight;
    }

    public final String getSourceMeta() {
        return this.sourceMeta;
    }

    public final String getSourceVID() {
        return this.sourceVID;
    }

    public final int getSourceWidth() {
        return this.sourceWidth;
    }

    public final void setDownloadStatus(int i) {
        this.downloadStatus = i;
    }

    public final void setPlayAddressList(List<String> list) {
        this.playAddressList = list;
    }

    public ForwardVideo(List<String> list, List<String> list2, int i, int i2, int i3, String str, String str2, String str3, boolean z, SimVideoUrlModel simVideoUrlModel, UrlModel urlModel, UrlModel urlModel2, int i4, String str4) {
        this.playAddressList = list;
        this.sourceCoverList = list2;
        this.sourceWidth = i;
        this.sourceHeight = i2;
        this.sourceDuration = i3;
        this.sourceMeta = str;
        this.sourceVID = str2;
        this.awemeId = str3;
        this.needSetCookie = z;
        this.simVideoUrlModel = simVideoUrlModel;
        this.cacheCoverModel = urlModel;
        this.originCoverModel = urlModel2;
        this.downloadStatus = i4;
        this.coverRgb = str4;
    }

    public ForwardVideo(List list, List list2, int i, int i2, int i3, String str, String str2, String str3, boolean z, SimVideoUrlModel simVideoUrlModel, UrlModel urlModel, UrlModel urlModel2, int i4, String str4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? C13BV.INSTANCE : list, (i5 & 2) != 0 ? C13BV.INSTANCE : list2, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? "" : str, (i5 & 64) != 0 ? "" : str2, (i5 & 128) == 0 ? str3 : "", (i5 & 256) == 0 ? z : false, (i5 & 512) != 0 ? null : simVideoUrlModel, (i5 & 1024) != 0 ? null : urlModel, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : urlModel2, (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? -1 : i4, (i5 & 8192) == 0 ? str4 : null);
    }
}
