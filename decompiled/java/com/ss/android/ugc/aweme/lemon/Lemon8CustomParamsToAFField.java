package com.ss.android.ugc.aweme.lemon;

import X.C09CT;
import X.C1697810uHb;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class Lemon8CustomParamsToAFField {

    @C09CT("af_params")
    public final List<String> afParams;

    @C09CT("af_params_max_length")
    public final List<Integer> afParamsMaxLength;

    @C09CT("custom_fields")
    public final List<String> customFields;

    @C09CT("source_list")
    public final List<String> sourceList;

    public Lemon8CustomParamsToAFField() {
        this(null, null, null, null, 15, null);
    }

    public Lemon8CustomParamsToAFField(List<String> list, List<Integer> list2, List<String> list3, List<String> list4) {
        this.afParams = list;
        this.afParamsMaxLength = list2;
        this.customFields = list3;
        this.sourceList = list4;
    }

    public Lemon8CustomParamsToAFField(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1697810uHb.LJIIJJI("af_sub2", "af_sub3", "af_sub4") : list, (i & 2) != 0 ? C1697810uHb.LJIIJJI(100, 100, 100) : list2, (i & 4) != 0 ? Collections.singletonList("from_scene") : list3, (i & 8) != 0 ? Collections.singletonList("tiktok_inbox") : list4);
    }
}
