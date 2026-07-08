package com.ss.android.ugc.aweme.theater.model;

import com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface AITheaterGenerationModel extends AIGCGenerationModel {
    List<InputBlock> H1();

    Map<MentionDataItem, MentionDataItem> KN();
}
