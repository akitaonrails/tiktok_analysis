package com.ss.android.ugc.aweme.live;

import X.C19GS;
import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public interface ILiveHostOuterService {
    void LIZ();

    String LIZIZ();

    void LIZJ(C19GS c19gs, boolean z, boolean z2);

    void anchorAutoSelection(Context context, JSONObject jSONObject);

    boolean isPartnershipNewAttrPointEnable();

    boolean tryChangeShortVideoPlayingStatus(Boolean bool);

    void tryOpenFeedWithExtra(Context context, String str, Bundle bundle, Map<String, String> map);
}
