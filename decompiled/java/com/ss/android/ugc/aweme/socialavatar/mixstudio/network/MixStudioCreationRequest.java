package com.ss.android.ugc.aweme.socialavatar.mixstudio.network;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioCreationRequest {

    @C09CT("base_models")
    public final List<MixStudioBaseModel> baseModel;

    @C09CT("elements")
    public final List<MixStudioNetworkElement> elements;

    @C09CT("entrance_visited")
    public final String entranceVisited;

    @C09CT("entries")
    public final List<Entry> entries;

    @C09CT("variant")
    public final GenerationVariant generationVariant;

    @C09CT("input_source_type")
    public final Integer inputSourceType;

    @C09CT("generate_sticker_count")
    public final Integer resultCnt;

    public MixStudioCreationRequest() {
        this(null, null, null, null, 0, null, null);
    }

    public MixStudioCreationRequest(List<MixStudioBaseModel> list, List<MixStudioNetworkElement> list2, Integer num, String str, Integer num2, List<Entry> list3, GenerationVariant generationVariant) {
        this.baseModel = list;
        this.elements = list2;
        this.resultCnt = num;
        this.entranceVisited = str;
        this.inputSourceType = num2;
        this.entries = list3;
        this.generationVariant = generationVariant;
    }
}
