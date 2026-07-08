package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewGameMomentMessage extends AbstractC1136060ffY {

    @C09CT("moment_data_list")
    public List<PreviewGameMomentData> momentDataList;

    public PreviewGameMomentMessage() {
        this.type = C001A.PREVIEW_GAME_MOMENT_MESSAGE;
        this.momentDataList = new ArrayList();
    }
}
