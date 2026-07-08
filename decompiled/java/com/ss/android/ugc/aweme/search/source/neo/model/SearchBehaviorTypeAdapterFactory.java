package com.ss.android.ugc.aweme.search.source.neo.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SearchBehaviorTypeAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (Intrinsics.LJFF(rawType, SearchBehaviorSignalState.class)) {
            return new SearchBehaviorSignalStateOptTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, LastSearch.class)) {
            return new LastSearchOptTypeAdapter();
        }
        if (Intrinsics.LJFF(rawType, SearchSceneInfo.class)) {
            return new SearchSceneInfoOptTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, CardConsumption.class)) {
            return new CardConsumptionOptTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, FeedSceneInfo.class)) {
            return new FeedSceneInfoOptTypeAdapter(gson);
        }
        return null;
    }
}
