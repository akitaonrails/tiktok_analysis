package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortVideoCommonParams {
    public final String contentSource;
    public final String contentType;
    public final int creationDuration;
    public final String creationId;
    public final String enterMethod;
    public final String enterWay;
    public final int isMultiContent;
    public final int photoCnt;
    public final String shootEnterFrom;
    public final String shootEnterMethod;
    public final String shootWay;
    public final String textType;
    public final int videoCnt;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoCommonParams)) {
            return false;
        }
        ShortVideoCommonParams shortVideoCommonParams = (ShortVideoCommonParams) obj;
        return Intrinsics.LJFF(this.shootWay, shortVideoCommonParams.shootWay) && Intrinsics.LJFF(this.contentSource, shortVideoCommonParams.contentSource) && Intrinsics.LJFF(this.contentType, shortVideoCommonParams.contentType) && Intrinsics.LJFF(this.creationId, shortVideoCommonParams.creationId) && this.videoCnt == shortVideoCommonParams.videoCnt && this.photoCnt == shortVideoCommonParams.photoCnt && this.isMultiContent == shortVideoCommonParams.isMultiContent && this.creationDuration == shortVideoCommonParams.creationDuration && Intrinsics.LJFF(this.enterMethod, shortVideoCommonParams.enterMethod) && Intrinsics.LJFF(this.enterWay, shortVideoCommonParams.enterWay) && Intrinsics.LJFF(this.textType, shortVideoCommonParams.textType) && Intrinsics.LJFF(this.shootEnterFrom, shortVideoCommonParams.shootEnterFrom) && Intrinsics.LJFF(this.shootEnterMethod, shortVideoCommonParams.shootEnterMethod);
    }

    public final int isMultiContent() {
        return this.isMultiContent;
    }

    public ShortVideoCommonParams(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, String str5, String str6, String str7, String str8, String str9) {
        this.shootWay = str;
        this.contentSource = str2;
        this.contentType = str3;
        this.creationId = str4;
        this.videoCnt = i;
        this.photoCnt = i2;
        this.isMultiContent = i3;
        this.creationDuration = i4;
        this.enterMethod = str5;
        this.enterWay = str6;
        this.textType = str7;
        this.shootEnterFrom = str8;
        this.shootEnterMethod = str9;
    }

    public /* synthetic */ ShortVideoCommonParams(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, String str5, String str6, String str7, String str8, String str9, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) != 0 ? 0 : i4, (i5 & 256) != 0 ? "" : str5, (i5 & 512) != 0 ? null : str6, (i5 & 1024) != 0 ? "" : str7, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str8, (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str9 : "");
    }
}
