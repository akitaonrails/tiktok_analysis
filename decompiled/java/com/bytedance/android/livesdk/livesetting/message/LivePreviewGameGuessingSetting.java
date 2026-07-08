package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_preview_game_guessing")
public final class LivePreviewGameGuessingSetting {
    public static final LivePreviewGameGuessingSetting INSTANCE = new LivePreviewGameGuessingSetting();
    public static final LivePreviewGameGuessingModel DEFAULT = new LivePreviewGameGuessingModel(false, false, false, false, 20);

    public static final class LivePreviewGameGuessingModel {
        public static final TypeAdapter ADAPTER = new LivePreviewGameGuessingSetting_LivePreviewGameGuessingModel_OptTypeAdapter(NormalGson.singleton());

        @C09CT("freeCoinDesc")
        public boolean freeCoinDesc;

        @C09CT("gameNameTitle")
        public boolean gameNameTitle;

        @C09CT("gameQuestionDesc")
        public boolean gameQuestionDesc;

        @C09CT("isShowWidget")
        public boolean isShowWidget;

        @C09CT("timeEarly")
        public long timeEarly;

        public LivePreviewGameGuessingModel() {
            this(false, false, false, false, 20L);
        }

        public final boolean getFreeCoinDesc() {
            return this.freeCoinDesc;
        }

        public final boolean getGameNameTitle() {
            return this.gameNameTitle;
        }

        public final boolean getGameQuestionDesc() {
            return this.gameQuestionDesc;
        }

        public final long getTimeEarly() {
            return this.timeEarly;
        }

        public final boolean isShowWidget() {
            return this.isShowWidget;
        }

        public final void setFreeCoinDesc(boolean z) {
            this.freeCoinDesc = z;
        }

        public final void setGameNameTitle(boolean z) {
            this.gameNameTitle = z;
        }

        public final void setGameQuestionDesc(boolean z) {
            this.gameQuestionDesc = z;
        }

        public final void setShowWidget(boolean z) {
            this.isShowWidget = z;
        }

        public final void setTimeEarly(long j) {
            this.timeEarly = j;
        }

        public LivePreviewGameGuessingModel(boolean z, boolean z2, boolean z3, boolean z4, long j) {
            this.isShowWidget = z;
            this.gameNameTitle = z2;
            this.gameQuestionDesc = z3;
            this.freeCoinDesc = z4;
            this.timeEarly = j;
        }
    }

    public final LivePreviewGameGuessingModel getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LivePreviewGameGuessingModel livePreviewGameGuessingModel = DEFAULT;
        LivePreviewGameGuessingModel livePreviewGameGuessingModel2 = (LivePreviewGameGuessingModel) settingsManager.getValueSafely("live_preview_game_guessing", livePreviewGameGuessingModel);
        return livePreviewGameGuessingModel2 != null ? livePreviewGameGuessingModel2 : livePreviewGameGuessingModel;
    }
}
