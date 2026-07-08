package com.ss.android.ugc.aweme.socialavatar.saas.mixstudio;

import X.C01GW;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioSettings {
    public static final MixStudioSettings INSTANCE = new MixStudioSettings();

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final MixStudioSettingsResponse f81default = new MixStudioSettingsResponse(null, null, null, null, null, null, null, null, 255, null);
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(314));

    private final MixStudioSettingsResponse getConfig() {
        return (MixStudioSettingsResponse) config$delegate.getValue();
    }

    public final int avatarGenerationBufferSeconds() {
        Integer num = getConfig().avatarGenerationBufferSeconds;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final String elementPlaceholderDark() {
        MixStudioMediaAssetsResponse mixStudioMediaAssetsResponse = getConfig().mediaAssets;
        if (mixStudioMediaAssetsResponse != null) {
            return mixStudioMediaAssetsResponse.modalPlaceholderDark;
        }
        return null;
    }

    public final String elementPlaceholderLight() {
        MixStudioMediaAssetsResponse mixStudioMediaAssetsResponse = getConfig().mediaAssets;
        if (mixStudioMediaAssetsResponse != null) {
            return mixStudioMediaAssetsResponse.modalPlaceholderLight;
        }
        return null;
    }

    public final String generationBackground() {
        MixStudioMediaAssetsResponse mixStudioMediaAssetsResponse = getConfig().mediaAssets;
        if (mixStudioMediaAssetsResponse != null) {
            return mixStudioMediaAssetsResponse.generationBackgroundLottie;
        }
        return null;
    }

    public final String idGenerationBorder() {
        MixStudioMediaAssetsResponse mixStudioMediaAssetsResponse = getConfig().mediaAssets;
        if (mixStudioMediaAssetsResponse != null) {
            return mixStudioMediaAssetsResponse.idGenerationBorderLottie;
        }
        return null;
    }

    public final List<Emoji> recommendedEmojis() {
        return getConfig().recommendedEmojis;
    }

    public final List<String> recommendedPrompts() {
        return getConfig().recommendedPrompts;
    }

    public final String saPanelGeneratingBackground() {
        String str;
        MixStudioMediaAssetsResponse mixStudioMediaAssetsResponse = getConfig().mediaAssets;
        return (mixStudioMediaAssetsResponse == null || (str = mixStudioMediaAssetsResponse.saPanelStickerGeneratingLottie) == null) ? "" : str;
    }

    public final String socialAvatarIdPlaceholder() {
        MixStudioMediaAssetsResponse mixStudioMediaAssetsResponse = getConfig().mediaAssets;
        if (mixStudioMediaAssetsResponse != null) {
            return mixStudioMediaAssetsResponse.socialAvatarIdPlaceholder;
        }
        return null;
    }

    public final int stickerGenerationBufferSeconds() {
        Integer num = getConfig().stickerGenerationBufferSeconds;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int stickerGenerationResultsNumber() {
        Integer num = getConfig().stickerGenerationResultsNumber;
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public final String typingBoxAddCard() {
        String str;
        MixStudioMediaAssetsResponse mixStudioMediaAssetsResponse = getConfig().mediaAssets;
        return (mixStudioMediaAssetsResponse == null || (str = mixStudioMediaAssetsResponse.iconFlipAddCard) == null) ? "" : str;
    }

    public final String typingBoxNoSAIcon() {
        String str;
        MixStudioMediaAssetsResponse mixStudioMediaAssetsResponse = getConfig().mediaAssets;
        return (mixStudioMediaAssetsResponse == null || (str = mixStudioMediaAssetsResponse.iconFlipNoSACardUri) == null) ? "" : str;
    }

    public final int typingIconEntranceCount() {
        Integer num = getConfig().typingFlipEntranceCnt;
        if (num != null) {
            return num.intValue();
        }
        return 25;
    }

    public final int typingIconWordCount() {
        Integer num = getConfig().typingIconWordCount;
        if (num != null) {
            return num.intValue();
        }
        return 2;
    }

    public final String useFriendsIdCreateYoursPlaceholderDark() {
        String str;
        MixStudioMediaAssetsResponse mixStudioMediaAssetsResponse = getConfig().mediaAssets;
        return (mixStudioMediaAssetsResponse == null || (str = mixStudioMediaAssetsResponse.useFriendsIdCreateYoursPlaceholderDark) == null) ? "" : str;
    }

    public final String useFriendsIdCreateYoursPlaceholderLight() {
        String str;
        MixStudioMediaAssetsResponse mixStudioMediaAssetsResponse = getConfig().mediaAssets;
        return (mixStudioMediaAssetsResponse == null || (str = mixStudioMediaAssetsResponse.useFriendsIdCreateYoursPlaceholderLight) == null) ? "" : str;
    }

    public final String useFriendsIdEmptyPreviewPlaceholderDark() {
        String str;
        MixStudioMediaAssetsResponse mixStudioMediaAssetsResponse = getConfig().mediaAssets;
        return (mixStudioMediaAssetsResponse == null || (str = mixStudioMediaAssetsResponse.useFriendsIdEmptyPreviewPlaceholderDark) == null) ? "" : str;
    }

    public final String useFriendsIdEmptyPreviewPlaceholderLight() {
        String str;
        MixStudioMediaAssetsResponse mixStudioMediaAssetsResponse = getConfig().mediaAssets;
        return (mixStudioMediaAssetsResponse == null || (str = mixStudioMediaAssetsResponse.useFriendsIdEmptyPreviewPlaceholderLight) == null) ? "" : str;
    }
}
