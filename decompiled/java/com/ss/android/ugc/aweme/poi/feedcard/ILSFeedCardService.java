package com.ss.android.ugc.aweme.poi.feedcard;

import X.C0TRR;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public interface ILSFeedCardService {
    Function2<String, JSONObject, Unit> getEventHandler();

    List<C0TRR> getLSCardInsertExecutor();

    void insertCardResultTrack(int i, String str, int i2);

    void requestInsertCardTrack(List<CardTypeRequest> list, int i);
}
