package com.ss.android.ugc.aweme.recommendationcard.data;

import X.C009A;
import X.C09CT;
import X.EnumC0315008z;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CardContent {

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("card_type")
    public final C009A cardType;

    @C09CT("effect")
    public final EffectStructV2 effect;

    @C09CT("is_multi_card")
    public final Boolean isMultiCard;

    @C09CT("main_link")
    public final EnumC0315008z mainLink;

    @C09CT("nickname_position")
    public final String nicknamePosition;

    @C09CT("use_count")
    public final Integer useCount;

    @C09CT("vide_link")
    public final EnumC0315008z videoLink;

    /* JADX WARN: Multi-variable type inference failed */
    public CardContent(C009A c009a, List<? extends Aweme> list, Integer num, Boolean bool, EnumC0315008z enumC0315008z, EnumC0315008z enumC0315008z2, EffectStructV2 effectStructV2, String str) {
        this.cardType = c009a;
        this.awemeList = list;
        this.useCount = num;
        this.isMultiCard = bool;
        this.mainLink = enumC0315008z;
        this.videoLink = enumC0315008z2;
        this.effect = effectStructV2;
        this.nicknamePosition = str;
    }
}
