package com.ss.android.ugc.aweme.explore.performance.json;

import X.C09CU;
import X.C09DL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class ExplorePostItemAdapterFactory implements v {

    public static final class ExplorePostItemClassAdapter extends TypeAdapter<ExplorePostItem> {
        public final TypeAdapter<Aweme> LIZ;

        public ExplorePostItemClassAdapter(TypeAdapter<Aweme> typeAdapter) {
            this.LIZ = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final ExplorePostItem read(C09CU c09cu) throws IOException {
            if (c09cu == null) {
                return new ExplorePostItem(null);
            }
            try {
                return new ExplorePostItem(this.LIZ.read(c09cu));
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, ExplorePostItem explorePostItem) {
            Aweme aweme;
            ExplorePostItem explorePostItem2 = explorePostItem;
            TypeAdapter<Aweme> typeAdapter = this.LIZ;
            if (explorePostItem2 != null) {
                aweme = explorePostItem2.aweme;
            } else {
                aweme = null;
            }
            typeAdapter.write(c09dl, aweme);
        }
    }

    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (gson == null || typeToken == null || !Intrinsics.LJFF(typeToken.getRawType(), ExplorePostItem.class)) {
            return null;
        }
        return new ExplorePostItemClassAdapter(gson.LJIIJJI(this, TypeToken.get(Aweme.class)));
    }
}
