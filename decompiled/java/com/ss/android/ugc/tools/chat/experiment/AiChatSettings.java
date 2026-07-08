package com.ss.android.ugc.tools.chat.experiment;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class AiChatSettings {

    @C09CT("chat_avatar")
    public final String aiChatAvatar;

    @C09CT("ai_chat_bot_id")
    public final String aiChatBotId;

    @C09CT("input_max_length")
    public final int inputMaxLength;

    @C09CT("learn_more_slug")
    public final String learnMoreSlug;

    @C09CT("onboarding_interval_hours")
    public final int onboardingIntervalInHours;

    @C09CT("input_interval_hours")
    public final int reinforceInputIntervalInHours;

    @C09CT("retry_enable_interval_hours")
    public final int retryEnableIntervalInHours;

    @C09CT("upload_photo_max_edge")
    public final int uploadPhotoMaxEdge;

    @C09CT("waiting_for_reply_timeout_seconds")
    public final int waitGenerationTimeoutInSeconds;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiChatSettings)) {
            return false;
        }
        AiChatSettings aiChatSettings = (AiChatSettings) obj;
        return this.inputMaxLength == aiChatSettings.inputMaxLength && Intrinsics.LJFF(this.aiChatBotId, aiChatSettings.aiChatBotId) && this.onboardingIntervalInHours == aiChatSettings.onboardingIntervalInHours && this.retryEnableIntervalInHours == aiChatSettings.retryEnableIntervalInHours && this.reinforceInputIntervalInHours == aiChatSettings.reinforceInputIntervalInHours && this.waitGenerationTimeoutInSeconds == aiChatSettings.waitGenerationTimeoutInSeconds && this.uploadPhotoMaxEdge == aiChatSettings.uploadPhotoMaxEdge && Intrinsics.LJFF(this.learnMoreSlug, aiChatSettings.learnMoreSlug) && Intrinsics.LJFF(this.aiChatAvatar, aiChatSettings.aiChatAvatar);
    }

    public final int hashCode() {
        return (((((((((((((((this.inputMaxLength * 31) + this.aiChatBotId.hashCode()) * 31) + this.onboardingIntervalInHours) * 31) + this.retryEnableIntervalInHours) * 31) + this.reinforceInputIntervalInHours) * 31) + this.waitGenerationTimeoutInSeconds) * 31) + this.uploadPhotoMaxEdge) * 31) + this.learnMoreSlug.hashCode()) * 31) + this.aiChatAvatar.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiChatSettings(inputMaxLength=");
        sbLIZ.append(this.inputMaxLength);
        sbLIZ.append(", aiChatBotId=");
        sbLIZ.append(this.aiChatBotId);
        sbLIZ.append(", onboardingIntervalInHours=");
        sbLIZ.append(this.onboardingIntervalInHours);
        sbLIZ.append(", retryEnableIntervalInHours=");
        sbLIZ.append(this.retryEnableIntervalInHours);
        sbLIZ.append(", reinforceInputIntervalInHours=");
        sbLIZ.append(this.reinforceInputIntervalInHours);
        sbLIZ.append(", waitGenerationTimeoutInSeconds=");
        sbLIZ.append(this.waitGenerationTimeoutInSeconds);
        sbLIZ.append(", uploadPhotoMaxEdge=");
        sbLIZ.append(this.uploadPhotoMaxEdge);
        sbLIZ.append(", learnMoreSlug=");
        sbLIZ.append(this.learnMoreSlug);
        sbLIZ.append(", aiChatAvatar=");
        sbLIZ.append(this.aiChatAvatar);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AiChatSettings() {
        this(400, "7568697147718501389", 24, 24, 24, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 1920, "ai-imagine-learn-more", "#");
    }

    public AiChatSettings(int i, String str, int i2, int i3, int i4, int i5, int i6, String str2, String str3) {
        this.inputMaxLength = i;
        this.aiChatBotId = str;
        this.onboardingIntervalInHours = i2;
        this.retryEnableIntervalInHours = i3;
        this.reinforceInputIntervalInHours = i4;
        this.waitGenerationTimeoutInSeconds = i5;
        this.uploadPhotoMaxEdge = i6;
        this.learnMoreSlug = str2;
        this.aiChatAvatar = str3;
    }
}
