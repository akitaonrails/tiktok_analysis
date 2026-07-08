package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveBagIconAnimationRequestBody {

    @C09CT("animation_type")
    public final Integer animationType;

    @C09CT("animation_type_list")
    public final List<Integer> animationTypeList;

    @C09CT("author_id")
    public final long authorId;

    @C09CT("room_id")
    public final long roomId;

    public LiveBagIconAnimationRequestBody(long j, long j2, Integer num, List<Integer> list) {
        this.roomId = j;
        this.authorId = j2;
        this.animationType = num;
        this.animationTypeList = list;
    }
}
