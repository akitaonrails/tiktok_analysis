package com.ss.bytertc.engine;

import com.ss.bytertc.engine.video.VideoEffectExpressionConfig;

/* JADX INFO: loaded from: classes36.dex */
public class InternalExpressDetectConfig {
    public boolean enableAgeDetect;
    public boolean enableAttractivenessDetect;
    public boolean enableEmotionDetect;
    public boolean enableGenderDetect;
    public boolean enableHappinessDetect;

    public boolean enableAgeDetect() {
        return this.enableAgeDetect;
    }

    public boolean enableAttractivenessDetect() {
        return this.enableAttractivenessDetect;
    }

    public boolean enableEmotionDetect() {
        return this.enableEmotionDetect;
    }

    public boolean enableGenderDetect() {
        return this.enableGenderDetect;
    }

    public boolean enableHappinessDetect() {
        return this.enableHappinessDetect;
    }

    public InternalExpressDetectConfig(VideoEffectExpressionConfig videoEffectExpressionConfig) {
        this.enableAgeDetect = videoEffectExpressionConfig.enableAgeDetect;
        this.enableGenderDetect = videoEffectExpressionConfig.enableGenderDetect;
        this.enableEmotionDetect = videoEffectExpressionConfig.enableEmotionDetect;
        this.enableAttractivenessDetect = videoEffectExpressionConfig.enableAttractivenessDetect;
        this.enableHappinessDetect = videoEffectExpressionConfig.enableHappinessDetect;
    }
}
