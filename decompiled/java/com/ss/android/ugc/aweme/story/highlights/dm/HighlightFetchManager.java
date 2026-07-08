package com.ss.android.ugc.aweme.story.highlights.dm;

import X.C054G;
import X.C0PEM;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C869590Y9l;
import X.C912450Zqt;
import X.C914170Ztf;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.highlights.IHighlightFetchManager;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes15.dex */
public final class HighlightFetchManager implements IHighlightFetchManager {
    public static final HighlightFetchManager LIZIZ = new HighlightFetchManager();
    public static final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()).plus(new C914170Ztf(CoroutineExceptionHandler.LJJLIL, 6)));
    public static final AtomicInteger LIZLLL = new AtomicInteger(0);
    public static final ConcurrentHashMap<String, Aweme> LJ = new ConcurrentHashMap<>();

    public static final class Service implements IHighlightFetchManager {
        public final /* synthetic */ HighlightFetchManager LIZIZ = HighlightFetchManager.LIZIZ;

        @Override // com.ss.android.ugc.aweme.story.highlights.IHighlightFetchManager
        public final void LIZ() {
            this.LIZIZ.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.story.highlights.IHighlightFetchManager
        public final Aweme LIZIZ(String str, String str2) {
            return this.LIZIZ.LIZIZ(str, str2);
        }

        @Override // com.ss.android.ugc.aweme.story.highlights.IHighlightFetchManager
        public final void LIZJ(Aweme aweme, String str, String str2) {
            this.LIZIZ.LIZJ(aweme, str, str2);
        }

        @Override // com.ss.android.ugc.aweme.story.highlights.IHighlightFetchManager
        public final void LIZLLL(List<? extends C869590Y9l> list) {
            this.LIZIZ.LIZLLL(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.IHighlightFetchManager
    public final void LIZ() {
        LIZLLL.incrementAndGet();
        LJ.clear();
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.IHighlightFetchManager
    public final void LIZLLL(List<? extends C869590Y9l> list) {
        C23250099c.LIZLLL(LIZJ, null, null, new C912450Zqt(LIZLLL.get(), list, null), 3);
    }

    public static String LJ(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.IHighlightFetchManager
    public final Aweme LIZIZ(String str, String str2) {
        return LJ.get(LJ(str, str2));
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.IHighlightFetchManager
    public final void LIZJ(Aweme aweme, String str, String str2) {
        LJ.put(LJ(str, str2), aweme);
    }
}
