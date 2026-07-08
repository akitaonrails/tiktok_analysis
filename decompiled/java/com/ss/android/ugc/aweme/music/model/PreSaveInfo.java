package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class PreSaveInfo implements Serializable {

    @C09CT("button_type")
    public Integer buttonType;

    @C09CT("dsp_entity_infos")
    public List<DspEntityInfo> dspEntityInfoList;

    @C09CT("end_time")
    public Long endTime;

    @C09CT("schema")
    public String schema;

    public PreSaveInfo() {
        this(null, null, null, null, 15, null);
    }

    public PreSaveInfo(List<DspEntityInfo> list, String str, Long l, Integer num) {
        this.dspEntityInfoList = list;
        this.schema = str;
        this.endTime = l;
        this.buttonType = num;
    }

    public PreSaveInfo(List list, String str, Long l, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num);
    }
}
