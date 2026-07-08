package com.ss.bytertc.engine.avclient;

import com.ss.bytertc.engine.avclient.sdkparams.LyraxAVClientSdkParams;
import com.ss.lyrax.ILyraxEngine;
import com.ss.solution.tako.TakoAudioFrameInfo;
import com.ss.solution.tako.TakoAudioMediaInfo;
import com.ss.solution.tako.TakoAudioPCMFormat;
import com.ss.solution.tako.TakoAudioProcessor;
import com.ss.solution.tako.TakoDuckingConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class LyraxAVAudioPlayerImpl implements LyraxAVAudioPlayer {
    public TakoAudioProcessor mAudioProcesser;
    public final LyraxAVAudioSource mAudioSource;
    public final LyraxAVClientLog mClientLog;
    public final ILyraxEngine mEngine;
    public final LyraxAVClientSdkParams mSdkParams;

    private final void releaseAudioProcesser() {
        TakoAudioProcessor takoAudioProcessor = this.mAudioProcesser;
        if (takoAudioProcessor != null) {
            takoAudioProcessor.dispose();
        }
    }

    @Override // com.ss.bytertc.engine.avclient.LyraxAVAudioPlayer
    public void stop() {
        LyraxAVClientLog lyraxAVClientLog = this.mClientLog;
        if (lyraxAVClientLog != null) {
            lyraxAVClientLog.traceAPICall("solution_audioProcesser_stop", new JSONObject());
        }
        releaseAudioProcesser();
    }

    private final void createAudioProcesser(LyraxAVAudioMediaInfo lyraxAVAudioMediaInfo) {
        this.mAudioProcesser = TakoAudioProcessor.create(this.mEngine, new TakoAudioMediaInfo(lyraxAVAudioMediaInfo.sampleRate, lyraxAVAudioMediaInfo.channels, TakoAudioPCMFormat.fromId(lyraxAVAudioMediaInfo.format)), new TakoDuckingConfig(this.mSdkParams.getAudioParams().getDuckingParams().getSpeechThresDbfs(), this.mSdkParams.getAudioParams().getDuckingParams().getGainDb(), this.mSdkParams.getAudioParams().getDuckingParams().getHoldTimeS(), this.mSdkParams.getAudioParams().getDuckingParams().getAttackTimeS(), this.mSdkParams.getAudioParams().getDuckingParams().getReleaseTimeS(), this.mSdkParams.getAudioParams().getDuckingParams().getRmsSmoothTimeS(), this.mSdkParams.getAudioParams().getDuckingParams().getCompressorRatio(), this.mSdkParams.getAudioParams().getDuckingParams().getMixedOutput(), this.mSdkParams.getAudioParams().getDuckingParams().getSinkType()));
    }

    @Override // com.ss.bytertc.engine.avclient.LyraxAVAudioPlayer
    public void pushAudioFrame(TakoAudioFrameInfo takoAudioFrameInfo) {
        TakoAudioProcessor takoAudioProcessor = this.mAudioProcesser;
        if (takoAudioProcessor != null) {
            takoAudioProcessor.process(takoAudioFrameInfo);
        }
    }

    @Override // com.ss.bytertc.engine.avclient.LyraxAVAudioPlayer
    public void start(LyraxAVAudioMediaInfo lyraxAVAudioMediaInfo) throws JSONException {
        LyraxAVClientLog lyraxAVClientLog = this.mClientLog;
        if (lyraxAVClientLog != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", lyraxAVAudioMediaInfo.toString());
            lyraxAVClientLog.traceAPICall("solution_audioProcesser_start", jSONObject);
        }
        releaseAudioProcesser();
        createAudioProcesser(lyraxAVAudioMediaInfo);
    }

    public LyraxAVAudioPlayerImpl(LyraxAVAudioSource lyraxAVAudioSource, ILyraxEngine iLyraxEngine, LyraxAVClientSdkParams lyraxAVClientSdkParams, LyraxAVClientLog lyraxAVClientLog) {
        this.mAudioSource = lyraxAVAudioSource;
        this.mEngine = iLyraxEngine;
        this.mSdkParams = lyraxAVClientSdkParams;
        this.mClientLog = lyraxAVClientLog;
    }
}
