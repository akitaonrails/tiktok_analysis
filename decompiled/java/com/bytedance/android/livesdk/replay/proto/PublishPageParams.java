package com.bytedance.android.livesdk.replay.proto;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PublishPageParams implements Serializable {

    @C09CT("can_add_sticker")
    public boolean canAddSticker;

    @C09CT("caption_status")
    public int captionStatus;

    @C09CT("is_caption_on")
    public boolean isCaptionOn;

    @C09CT("is_pre_gen_caption")
    public boolean isPreGenCaption;

    @C09CT("text_sticker_config")
    public List<TextStickerConfig> textStickerConfig = new ArrayList();

    @C09CT("music_id")
    public String musicId = "";

    @C09CT("special_effect_config")
    public List<SpecialEffectConfig> specialEffectConfig = new ArrayList();

    @C09CT("default_text")
    public String defaultText = "";

    @C09CT("challenges")
    public List<String> challenges = new ArrayList();

    @C09CT("mentions")
    public List<Mention> mentions = new ArrayList();

    @C09CT("hashtag_sticker_config")
    public List<HashtagStickerConfig> hashtagStickerConfig = new ArrayList();

    @C09CT("info_sticker_config")
    public List<InfoStickerConfig> infoStickerConfig = new ArrayList();

    @C09CT("captions")
    public List<Caption> captions = new ArrayList();

    @C09CT("transition_effect_id")
    public String transitionEffectId = "";
}
