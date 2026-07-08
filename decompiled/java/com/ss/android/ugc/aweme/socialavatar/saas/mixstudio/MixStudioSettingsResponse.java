package com.ss.android.ugc.aweme.socialavatar.saas.mixstudio;

import X.AbstractC19994813Le;
import X.AbstractC2098408Jy;
import X.C09CT;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C441290HSd;
import X.C531650Kt9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioSettingsResponse implements Serializable {

    @C09CT("avatar_generation_buffer_seconds")
    public final Integer avatarGenerationBufferSeconds;

    @C09CT("media_assets")
    public final MixStudioMediaAssetsResponse mediaAssets;

    @C09CT("recommended_emojis")
    public final List<Emoji> recommendedEmojis;

    @C09CT("recommended_prompts")
    public final List<String> recommendedPrompts;

    @C09CT("sticker_generation_buffer_seconds")
    public final Integer stickerGenerationBufferSeconds;

    @C09CT("sticker_generation_number")
    public final Integer stickerGenerationResultsNumber;

    @C09CT("sa_typing_flip_entrance_count")
    public final Integer typingFlipEntranceCnt;

    @C09CT("typing_icon_word_count")
    public final Integer typingIconWordCount;

    public MixStudioSettingsResponse() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public MixStudioSettingsResponse(List<Emoji> list, List<String> list2, MixStudioMediaAssetsResponse mixStudioMediaAssetsResponse, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.recommendedEmojis = list;
        this.recommendedPrompts = list2;
        this.mediaAssets = mixStudioMediaAssetsResponse;
        this.avatarGenerationBufferSeconds = num;
        this.stickerGenerationBufferSeconds = num2;
        this.stickerGenerationResultsNumber = num3;
        this.typingIconWordCount = num4;
        this.typingFlipEntranceCnt = num5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    public MixStudioSettingsResponse(List list, List list2, MixStudioMediaAssetsResponse mixStudioMediaAssetsResponse, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num6 = num5;
        Integer num7 = num4;
        Integer num8 = num;
        MixStudioMediaAssetsResponse mixStudioMediaAssetsResponse2 = mixStudioMediaAssetsResponse;
        List list3 = list2;
        Integer num9 = num3;
        ?? arrayList = list;
        if ((i & 1) != 0) {
            IntRange intRange = new IntRange(0, 10);
            arrayList = new ArrayList(C15438062q.LJIJJ(intRange, 10));
            Iterator<Integer> it2 = intRange.iterator();
            while (((C531650Kt9) it2).LLILLL) {
                ((AbstractC2098408Jy) it2).nextInt();
                arrayList.add(C13LP.LJLJJI((Collection) C441290HSd.LIZ.getValue(), AbstractC19994813Le.Default));
            }
        }
        this(arrayList, (i & 2) != 0 ? C1697810uHb.LJIIJJI("mus_turn_off_post_push_success", "impersonateMod_gotIt_button", "Lemon8Link_TikTok_profile_header", "videoAvatar_downloadPage_cta", "pushGuidancePrompt_settings_posts_option2", "sortbyvv_profile_tab_text_showcase", "editProfileRedesign_editProfileV1_nonprofitOrganization_title", "tp_profile_frame_name", "watchhistory_entrance", "mergeSocialButtonProfile_linkPage_section2Header", "fans_influence", "mus_trim_crop") : list3, (i & 4) != 0 ? null : mixStudioMediaAssetsResponse2, (i & 8) != 0 ? num : num8, (i & 16) == 0 ? num2 : 0, (i & 32) != 0 ? 3 : num9, (i & 64) != 0 ? 2 : num7, (i & 128) != 0 ? 25 : num6);
    }
}
