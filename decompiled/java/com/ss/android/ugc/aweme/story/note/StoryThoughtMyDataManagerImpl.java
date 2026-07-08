package com.ss.android.ugc.aweme.story.note;

import X.C01GW;
import X.C054G;
import X.C0CNO;
import X.C0PEM;
import X.C1400105dv;
import X.C1400205dw;
import X.C19719612Di;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C281290B0t;
import X.C452501pT;
import X.C461720I8s;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryThoughtMyDataManagerImpl implements IStoryThoughtMyDataManager {
    public Pair<String, ? extends UrlModel> LL;
    public StoryNoteDataCollection LLILLL;
    public Aweme LLILZ;
    public boolean LLILZIL;
    public final ConcurrentHashMap<StoryNoteStatusChangeCallback, String> LLILLJJLI = new ConcurrentHashMap<>();
    public final Keva LLILZLL = Keva.getRepo("story_note_data");
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(676));
    public final C054G LLIZLLLIL = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C054G LLJ = C2296808zG.LIZ(C2107308Nj.LIZ);

    @Override // com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback
    public final void onStoryNoteDelete() {
        this.LLILLL = null;
        this.LLILZIL = false;
        this.LLILZLL.storeString(LIZ(), "");
        C0CNO.LIZLLL(0L, new AwS546S0100000_2(this, 829));
    }

    public final String LIZ() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return null;
        }
        return accountUserServiceLJIIJ.getCurUserId();
    }

    @Override // com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager
    public final boolean XO() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager
    public final StoryNoteDataCollection KO(boolean z) {
        String str;
        String strLIZIZ = C461720I8s.LIZIZ();
        StoryNoteDataCollection storyNoteDataCollection = this.LLILLL;
        if (storyNoteDataCollection != null) {
            str = storyNoteDataCollection.uid;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(strLIZIZ, str)) {
            return null;
        }
        if (!z && !((Boolean) C281290B0t.LIZIZ.getValue()).booleanValue()) {
            return null;
        }
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager
    public final void WB0(StoryNoteStatusChangeCallback storyNoteStatusChangeCallback) {
        this.LLILLJJLI.remove(storyNoteStatusChangeCallback);
    }

    @Override // com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback
    public final void onStoryNotePublishStart(StoryNoteDataCollection storyNoteDataCollection) {
        this.LLILZIL = true;
        this.LLILLL = storyNoteDataCollection;
        String str = storyNoteDataCollection.aid;
        if (str == null) {
            str = "";
        }
        this.LL = new Pair<>(str, storyNoteDataCollection.animatedAvatarUri);
        C0CNO.LIZLLL(0L, new AwS403S0200000_2(this, storyNoteDataCollection, 33));
    }

    @Override // com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager
    public final void qn1(Function1<? super StoryNoteDataCollection, Unit> function1) {
        String str;
        if (!((Boolean) C281290B0t.LIZIZ.getValue()).booleanValue()) {
            function1.invoke(null);
            return;
        }
        if (this.LLILLL != null) {
            String strLIZIZ = C461720I8s.LIZIZ();
            StoryNoteDataCollection storyNoteDataCollection = this.LLILLL;
            if (storyNoteDataCollection != null) {
                str = storyNoteDataCollection.uid;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(strLIZIZ, str)) {
                function1.invoke(this.LLILLL);
                return;
            }
        }
        C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C1400205dw(this, LIZ(), function1, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager
    public final void zH1(String str) {
        C19719612Di.LJJIII(this.LLILLJJLI.entrySet(), new AwS53S1000000_2(str, 7), true);
    }

    @Override // com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager
    public final void Bq0(StoryNoteDataCollection storyNoteDataCollection, Aweme aweme) {
        this.LLILLL = storyNoteDataCollection;
        this.LLILZ = aweme;
        C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C1400105dv(storyNoteDataCollection, this, LIZ(), null), 3);
    }

    @Override // com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager
    public final void e11(StoryNoteStatusChangeCallback storyNoteStatusChangeCallback, String str) {
        this.LLILLJJLI.put(storyNoteStatusChangeCallback, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[PHI: r0
      0x001e: PHI (r0v8 java.lang.String) = (r0v6 java.lang.String), (r0v9 java.lang.String) binds: [B:12:0x001c, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStoryNotePublishFinished(java.lang.String r4, com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection r5, com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r3 = this;
            r0 = 0
            r3.LLILZIL = r0
            kotlin.Pair<java.lang.String, ? extends com.ss.android.ugc.aweme.base.model.UrlModel> r0 = r3.LL
            r2 = 0
            if (r0 == 0) goto L30
            java.lang.Object r0 = r0.getFirst()
        Lc:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L25
            kotlin.Pair r1 = new kotlin.Pair
            if (r5 == 0) goto L1a
            java.lang.String r0 = r5.aid
            if (r0 != 0) goto L1e
        L1a:
            java.lang.String r0 = ""
            if (r5 == 0) goto L20
        L1e:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r5.animatedAvatarUri
        L20:
            r1.<init>(r0, r2)
            r3.LL = r1
        L25:
            kotlin.jvm.internal.AwS119S1200000_2 r1 = new kotlin.jvm.internal.AwS119S1200000_2
            r0 = 10
            r1.<init>(r3, r4, r5, r0)
            X.C0CNO.LJ(r1)
            return
        L30:
            r0 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.StoryThoughtMyDataManagerImpl.onStoryNotePublishFinished(java.lang.String, com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
