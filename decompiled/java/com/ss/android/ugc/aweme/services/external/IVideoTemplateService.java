package com.ss.android.ugc.aweme.services.external;

import com.ss.android.ugc.aweme.shortvideo.model.SummaryData;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes22.dex */
public interface IVideoTemplateService {
    boolean enableAutoCut();

    boolean hasMagic(List<String> list);

    SummaryData resolveNLESummary(String str);

    Pair<Boolean, List<TemplateSlot>> tryToFreezeAssetSlots(List<TemplateSlot> list);

    Pair<Boolean, List<TemplateSlot>> tryToSameAssetSlots(List<TemplateSlot> list, boolean z);
}
