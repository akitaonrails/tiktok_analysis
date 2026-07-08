package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes27.dex */
public final class RecInfo {

    @C09CT("section_all_sort_list")
    public final ArrayList<SectionInfo> allSectionList;

    @C09CT("section_recommend_sort_list")
    public final ArrayList<SectionInfo> recSectionList;

    public RecInfo(ArrayList<SectionInfo> arrayList, ArrayList<SectionInfo> arrayList2) {
        this.recSectionList = arrayList;
        this.allSectionList = arrayList2;
    }
}
