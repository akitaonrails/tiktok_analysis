package com.bytedance.android.livesdk.comp.api.pcs.data.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class TetrisFormRequest {

    @C09CT("ad_param")
    public final TetrisAdParam adParam;

    @C09CT("ba_param")
    public final TetrisBaParam baParam;

    @C09CT("base_param")
    public final TetrisBaseParam baseParam;

    @C09CT("clue")
    public final List<ClueItem> clue;

    @C09CT("is_filled_qualifying_question")
    public final boolean isFilledQualifyingQuestion;

    @C09CT("is_qualified_lead")
    public final boolean isQualifiedLead;

    @C09CT("source_type")
    public final int sourceType;

    public TetrisFormRequest(List<ClueItem> list, TetrisBaseParam tetrisBaseParam, TetrisAdParam tetrisAdParam, TetrisBaParam tetrisBaParam, int i, boolean z, boolean z2) {
        this.clue = list;
        this.baseParam = tetrisBaseParam;
        this.adParam = tetrisAdParam;
        this.baParam = tetrisBaParam;
        this.sourceType = i;
        this.isQualifiedLead = z;
        this.isFilledQualifyingQuestion = z2;
    }
}
