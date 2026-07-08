package com.ss.android.ugc.aweme.utils;

import X.C0CD2;
import X.C0O5Y;
import X.C0SQM;
import X.C1060430dhZ;
import X.C1157804fw;
import X.C14SH;
import X.C298410Bmp;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.v;
import com.ss.android.ugc.aweme.explore.service.IExploreFeedService;
import com.ss.android.ugc.aweme.favorites.agents.AwemeCollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.CollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.ModelCheckerTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.UserTypeAdapterFactory;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer;

/* JADX INFO: loaded from: classes31.dex */
public class GsonHolder implements GsonProvider {
    public static final boolean LIZJ = ((Boolean) C0CD2.LJJIIJ.getValue()).booleanValue();
    public static final Object LIZLLL = new Object();
    public static volatile Gson LJ;
    public final Gson LIZ;
    public final Gson LIZIZ;

    @Override // com.ss.android.ugc.aweme.utils.GsonProvider
    public final Gson LIZ() {
        Gson gson = this.LIZIZ;
        if (gson != null) {
            return gson;
        }
        if (LJ == null) {
            synchronized (LIZLLL) {
                try {
                    if (LJ == null) {
                        LJ = LIZJ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    @Override // com.ss.android.ugc.aweme.utils.GsonProvider
    public final Gson getGson() {
        Gson gson = this.LIZ;
        if (gson != null) {
            return gson;
        }
        if (LJ == null) {
            synchronized (LIZLLL) {
                try {
                    if (LJ == null) {
                        LJ = LIZJ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public GsonHolder() {
        if (LIZJ) {
            this.LIZ = null;
        } else {
            this.LIZ = LIZJ();
        }
        this.LIZIZ = this.LIZ;
    }

    public static e LIZIZ() {
        e eVarLIZIZ = JsonParseUtils.LIZIZ();
        eVarLIZIZ.LIZLLL(new ModelCheckerTypeAdapterFactory());
        eVarLIZIZ.LIZLLL(new CollectionTypeAdapterFactory());
        eVarLIZIZ.LIZLLL(new MusicTypeAdapterFactory());
        eVarLIZIZ.LIZLLL(new UserTypeAdapterFactory());
        eVarLIZIZ.LIZJ(new BackgroundVideoDeserializer(), BackgroundVideo.class);
        eVarLIZIZ.LIZLLL(new BaseResponseObjectTypeAdapterFactory());
        C0SQM.LIZ.getClass();
        IExploreFeedService iExploreFeedService = C0SQM.LIZIZ;
        if (iExploreFeedService != null) {
            eVarLIZIZ.LIZLLL(iExploreFeedService.LJJ());
            v vVarLJIIJJI = iExploreFeedService.LJIIJJI();
            if (vVarLJIIJJI != null) {
                eVarLIZIZ.LIZLLL(vVarLJIIJJI);
            }
        }
        if (C298410Bmp.LIZ()) {
            eVarLIZIZ.LIZLLL(new AwemeCollectionTypeAdapterFactory());
            C0O5Y.LIZ.getClass();
            C0O5Y.LIZIZ = true;
        }
        return eVarLIZIZ;
    }

    public static Gson LIZJ() {
        e eVarLIZIZ = LIZIZ();
        if (C1157804fw.LIZ()) {
            C14SH c14sh = (C14SH) PluggableExtentionKt.pluggableSpi(ISearchServiceLowEnd.class);
            if (c14sh != null) {
                c14sh.LLLZZ(eVarLIZIZ);
            }
        } else {
            C1060430dhZ.LIZ.getClass();
            ISearchService iSearchService = C1060430dhZ.LIZIZ;
            if (iSearchService != null) {
                iSearchService.LLLZZ(eVarLIZIZ);
            }
        }
        return eVarLIZIZ.LIZ();
    }
}
