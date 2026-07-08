package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LinkMicBattleArtifactMessage extends AbstractC1136060ffY {

    @C09CT("artifacts")
    public List<BattleArtifact> artifacts;

    @C09CT("battle_id")
    public long battleId;

    public LinkMicBattleArtifactMessage() {
        this.type = C001A.LINK_MIC_BATTLE_ARTIFACT_MESSAGE;
        this.artifacts = new ArrayList();
    }
}
