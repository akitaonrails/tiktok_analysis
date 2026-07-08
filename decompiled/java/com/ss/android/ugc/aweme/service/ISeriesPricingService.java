package com.ss.android.ugc.aweme.service;

import X.C1576640r8A;
import X.C1613940s6K;
import X.C1617190sBZ;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.model.PriceInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public interface ISeriesPricingService {
    public static final C1613940s6K LIZ = C1613940s6K.LIZ;

    MutableLiveData LIZ(Context context, List list);

    MutableLiveData LIZIZ(List list);

    LiveData<Map<Long, C1576640r8A>> LIZJ(Context context, List<C1617190sBZ> list);

    Map<String, String> LIZLLL(List<PriceInfo> list);
}
