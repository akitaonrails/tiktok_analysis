package com.ss.android.ugc.aweme.live.skylight.tooltip;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ShowRecordsModel {

    @C09CT("8")
    public final List<ToolTipInteractRecord> typeEightRecords;

    @C09CT("5")
    public final List<ToolTipInteractRecord> typeFiveRecords;

    @C09CT("7")
    public final List<ToolTipInteractRecord> typeSevenRecords;

    @C09CT("6")
    public final List<ToolTipInteractRecord> typeSixRecords;

    public ShowRecordsModel() {
        this(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
    }

    public ShowRecordsModel(List<ToolTipInteractRecord> list, List<ToolTipInteractRecord> list2, List<ToolTipInteractRecord> list3, List<ToolTipInteractRecord> list4) {
        this.typeFiveRecords = list;
        this.typeSixRecords = list2;
        this.typeSevenRecords = list3;
        this.typeEightRecords = list4;
    }
}
