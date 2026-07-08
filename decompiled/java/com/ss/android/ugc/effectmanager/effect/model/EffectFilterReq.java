package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectFilterReq {

    @C09CT("BlockList")
    public final EffectLabelInReq blockList;

    @C09CT("PlatformTag")
    public final List<String> platformTags;

    @C09CT("TagOne")
    public final List<String> v1Tags;

    @C09CT("TagTwo")
    public final List<String> v2Tags;

    public EffectFilterReq() {
        this(null, null, null, null, 15, null);
    }

    public EffectFilterReq(List<String> list, List<String> list2, List<String> list3, EffectLabelInReq effectLabelInReq) {
        this.v1Tags = list;
        this.v2Tags = list2;
        this.platformTags = list3;
        this.blockList = effectLabelInReq;
    }

    public EffectFilterReq(List list, List list2, List list3, EffectLabelInReq effectLabelInReq, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? null : effectLabelInReq);
    }
}
