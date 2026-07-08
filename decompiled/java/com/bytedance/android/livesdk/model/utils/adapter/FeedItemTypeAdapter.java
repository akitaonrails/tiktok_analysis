package com.bytedance.android.livesdk.model.utils.adapter;

import X.C19748512Ol;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.r;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes30.dex */
public class FeedItemTypeAdapter implements j<FeedItem>, r<FeedItem> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        FeedItem feedItem = (FeedItem) obj;
        Gson gson = C19748512Ol.LIZJ;
        n nVarLJIILIIL = GsonProtectorUtils.toJsonTree(gson, feedItem).LJIILIIL();
        nVarLJIILIIL.LJJIFFI("data", GsonProtectorUtils.toJsonTree(gson, feedItem.getRoom(), Room.class));
        return nVarLJIILIIL;
    }

    @Override // com.google.gson.j
    public final FeedItem deserialize(k kVar, Type type, i iVar) {
        try {
            FeedItem feedItem = (FeedItem) C19748512Ol.LIZJ.LIZJ(kVar, FeedItem.class);
            feedItem.init();
            return feedItem;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new o("error type");
        }
    }
}
