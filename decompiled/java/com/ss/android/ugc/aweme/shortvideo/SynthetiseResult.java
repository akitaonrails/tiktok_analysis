package com.ss.android.ugc.aweme.shortvideo;

import X.AbstractC1439960nZi;
import X.C1404680meo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.publish.CompileLevel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public final class SynthetiseResult implements Cloneable {
    public float audioLength;
    public AudioXResultsSnapshot audioXResults;
    public String cpuName;
    public int draftHardEncode;
    public EditPreviewInfo editPreviewInfo;
    public int effect;
    public int[] effectArray;
    public int filterIndex;
    public int flags;
    public String gpuName;
    public boolean hasSubtitle;
    public List<PublishImageModel> imageSynthesisResult;
    public boolean isEnableFpsSet;
    public boolean isFastImport;
    public boolean isFastImportForLog;
    public boolean isFromDraft;
    public boolean isImageMode;
    public int isMusic;
    public boolean isSkip;
    public boolean isTTStory;
    public int musicType;
    public boolean needSaveLocal;
    public String outputFile;
    public VideoFileInfo outputVideoFileInfo;
    public int ret;
    public String reverseFile;
    public int segmentCount;
    public int specialPoints;
    public int synthetiseCPUEncode;
    public int unableRemuxCode;
    public String vesdkErrorCode;
    public int videoHeight;
    public float videoLength;
    public int videoWidth;
    public boolean needRecode = true;
    public CompileLevel compileLevel = CompileLevel.UNKNOWN;
    public float avgVqScore = -1.0f;
    public int processedFrames = -1;
    public String watermarkInputFile = "";
    public List<String> skipFrameLogList = new ArrayList();
    public C1404680meo syntheticStartTime = new C1404680meo();
    public C1404680meo syntheticEndTime = new C1404680meo();
    public List<AbstractC1439960nZi> smartCompileSettings = null;

    public int getFps() {
        VideoFileInfo videoFileInfo = this.outputVideoFileInfo;
        if (videoFileInfo == null) {
            return 0;
        }
        return videoFileInfo.getFps();
    }

    public int getReportHardEncode() {
        return ((this.synthetiseCPUEncode ^ 1) * 10) + this.draftHardEncode;
    }

    public C1404680meo getSyntheticEndTime() {
        C1404680meo c1404680meo = this.syntheticEndTime;
        Objects.requireNonNull(c1404680meo);
        return c1404680meo;
    }

    public C1404680meo getSyntheticStartTime() {
        C1404680meo c1404680meo = this.syntheticStartTime;
        Objects.requireNonNull(c1404680meo);
        return c1404680meo;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6 A[Catch: NullPointerException -> 0x01f0, TryCatch #4 {NullPointerException -> 0x01f0, blocks: (B:11:0x008b, B:13:0x00c6, B:14:0x00ce, B:16:0x00d4, B:17:0x00e9), top: B:57:0x008b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.SynthetiseResult.toString():java.lang.String");
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SynthetiseResult m316clone() {
        try {
            return (SynthetiseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError();
        }
    }

    public List<String> getSkipFrameLogList() {
        return this.skipFrameLogList;
    }

    public String getVESDKErrorCode() {
        return this.vesdkErrorCode;
    }

    public boolean isNeedSaveLocal() {
        return this.needSaveLocal;
    }

    public void setNeedSaveLocal(boolean z) {
        this.needSaveLocal = z;
    }

    public void setSkipFrameLogList(List<String> list) {
        this.skipFrameLogList.clear();
        this.skipFrameLogList.addAll(list);
    }

    public void setSyntheticEndTime(C1404680meo c1404680meo) {
        Objects.requireNonNull(c1404680meo);
        this.syntheticEndTime = c1404680meo;
    }

    public void setSyntheticStartTime(C1404680meo c1404680meo) {
        Objects.requireNonNull(c1404680meo);
        this.syntheticStartTime = c1404680meo;
    }

    public void setVESDKErrorCode(String str) {
        this.vesdkErrorCode = str;
    }
}
