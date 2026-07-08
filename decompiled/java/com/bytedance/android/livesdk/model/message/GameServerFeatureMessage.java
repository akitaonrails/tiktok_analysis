package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.game.model.GameServerFeature;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GameServerFeatureMessage extends AbstractC1136060ffY {

    @C09CT("all_features")
    public List<GameServerFeature> allFeatures;

    public GameServerFeatureMessage() {
        this.type = C001A.GAME_SERVER_FEATURE_MESSAGE;
        this.allFeatures = new ArrayList();
    }
}
