package com.bytedance.pipo.stellar.base.resourceloader;

import X.C09CT;
import com.bytedance.pipo.stellar.base.model.CardDO;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarSection {

    @C09CT("card_list")
    public final List<CardDO> cardList;

    @C09CT("section_id")
    public final String id;

    @C09CT("section_data_operation")
    public final String sectionDataOperation;

    @C09CT("target_section_id")
    public final String targetSectionId;

    @C09CT("track_params")
    public final Map<String, Object> trackingParams;

    public StellarSection() {
        this(null, null, null, null, null);
    }

    public StellarSection(String str, List<CardDO> list, String str2, String str3, Map<String, ? extends Object> map) {
        this.id = str;
        this.cardList = list;
        this.sectionDataOperation = str2;
        this.targetSectionId = str3;
        this.trackingParams = map;
    }
}
