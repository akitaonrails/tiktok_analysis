package com.ss.android.ugc.aweme.ml.api;

import X.C1510990pQH;
import X.C1511010pQJ;
import X.InterfaceC1511020pQK;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public abstract class SmartFeedLoadMoreService implements ISmartFeedLoadMoreService {
    public static final C1511010pQJ Companion = new Object() { // from class: X.0pQJ
    };
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public abstract /* synthetic */ void addVideoPlayEndReportData(HashMap<String, Object> map, Aweme aweme, Integer num);

    public abstract /* synthetic */ void addVideoPlayEndReportData(JSONObject jSONObject, Aweme aweme, Integer num);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public abstract /* synthetic */ void checkAndInit();

    public abstract /* synthetic */ boolean enable();

    public abstract /* synthetic */ void ensureEvaluatorAvailable();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public abstract /* synthetic */ boolean isSmartFeedLoadMoreScene(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public abstract /* synthetic */ boolean needCheckLoadMore(int i, int i2, Aweme aweme, Aweme aweme2);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public abstract /* synthetic */ void startSmartFeedLoadMoreJudge(Aweme aweme, InterfaceC1511020pQK interfaceC1511020pQK);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartFeedLoadMoreService instance() {
        Companion.getClass();
        return C1510990pQH.LIZ;
    }
}
