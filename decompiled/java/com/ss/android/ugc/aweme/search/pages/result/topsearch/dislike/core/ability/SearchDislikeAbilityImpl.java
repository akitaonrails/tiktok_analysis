package com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.ability;

import X.AbstractC471570IeR;
import X.C0NMN;
import X.C0NMR;
import X.C0NMV;
import X.C0NMX;
import X.C0PBJ;
import X.C0PEM;
import X.C0PFZ;
import X.C0PN8;
import X.C1829907Er;
import X.C1DFH;
import X.C2107308Nj;
import X.C640540PAm;
import X.C640570PAp;
import X.C640610PAt;
import X.C645130PSd;
import X.C948503nH;
import Y.ARunnableS110S0100000_10;
import Y.AsS37S0100000_10;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$DislikeAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.ability.SearchDislikeAbilityImpl;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.db.SearchDislikeDataBase;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDislikeAbilityImpl implements SearchServiceCenter$DislikeAbility {
    public static final /* synthetic */ int LLJ = 0;
    public final SearchJediMixFeedFragment LL;
    public final C0PN8 LLILLJJLI;
    public final RecyclerView LLILLL;
    public final C645130PSd LLILZ;
    public final C640540PAm LLILZIL;
    public final C0NMX LLILZLL;
    public final C640570PAp LLIZ;
    public Integer LLIZLLLIL;

    public final void LIZ(SearchMixFeed searchMixFeed) {
        this.LLILLJJLI.LJIL(this.LLILZLL.LIZIZ(this.LLILLJJLI.getItems(), new AwS624S0100000_10(searchMixFeed, 75)).getFirst());
        C0PFZ c0pfz = C0PFZ.LIZ;
        List<SearchMixFeed> items = this.LLILLJJLI.getItems();
        c0pfz.getClass();
        this.LLILZ.LLLLZLLIL(new ArrayList(C0PFZ.LIZJ(items)));
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$DislikeAbility
    public final void mW1(int i) {
        SearchMixFeed searchMixFeedLLLLJI;
        String aid;
        if (C1829907Er.LIZ() != 0 && (searchMixFeedLLLLJI = this.LLILZ.LLLLJI(i)) != null && C0NMV.LIZ(searchMixFeedLLLLJI)) {
            SearchDislikeDataBase searchDislikeDataBaseLIZ = C0NMN.LIZ();
            Aweme aweme = searchMixFeedLLLLJI.getAweme();
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            Aweme aweme2 = searchMixFeedLLLLJI.getAweme();
            searchDislikeDataBaseLIZ.getClass();
            SearchDislikeDataBase.LIZ(aweme2, aid);
            SearchJediMixFeedFragment searchJediMixFeedFragment = this.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C948503nH.LJ(C948503nH.LIZIZ(searchJediMixFeedFragment), C2107308Nj.LIZ, new C640610PAt(this, i, searchMixFeedLLLLJI, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.ability.SearchDislikeAbilityImpl.LIZIZ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed> LIZLLL(java.util.List<? extends com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed> r6, X.C0PHT r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L7a
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L7a
            r0 = 0
        L9:
            r4 = 0
            if (r0 != 0) goto L8e
            java.lang.Object r0 = X.C13LP.LJJJLL(r6)
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r0 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r0
            if (r0 == 0) goto L78
            int r0 = r0.retrieveIncrementalId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L1c:
            X.0PHX r1 = r7.LIZ
            if (r1 == 0) goto L76
            X.0PHT r0 = r1.LIZ
            X.0P7A r0 = r0.LJIIIZ
            r1.LJ()
            java.lang.String r2 = r1.LJIIIZ
            java.util.HashMap<X.13IQ<?>, X.0PCd> r1 = r0.LIZ
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed> r0 = com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed.class
            X.12Dl r0 = X.C13LE.LIZ(r0)
            java.lang.Object r0 = r1.get(r0)
            X.0PCd r0 = (X.C640970PCd) r0
            if (r0 == 0) goto L74
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r0.LIZ
            if (r0 == 0) goto L74
            java.lang.Object r0 = r0.get(r2)
        L41:
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r0 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r0
            if (r0 == 0) goto L76
            int r0 = r0.retrieveIncrementalId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L4d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L8e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            kotlin.jvm.internal.AwS589S0100000_10 r3 = new kotlin.jvm.internal.AwS589S0100000_10
            r0 = 314(0x13a, float:4.4E-43)
            r3.<init>(r4, r0)
            X.13DV r2 = X.C1697820uHc.LIZIZ()
            kotlin.jvm.internal.AwS376S0200000_10 r1 = new kotlin.jvm.internal.AwS376S0200000_10
            r0 = 64
            r1.<init>(r3, r2, r0)
            X.0PHX r0 = r7.LIZ
        L6c:
            if (r0 == 0) goto L7c
            r1.invoke(r0)
            X.0PHX r0 = r0.LIZLLL
            goto L6c
        L74:
            r0 = r4
            goto L41
        L76:
            r0 = r4
            goto L4d
        L78:
            r3 = r4
            goto L1c
        L7a:
            r0 = 1
            goto L9
        L7c:
            java.util.List r3 = X.C1697820uHc.LIZ(r2)
            X.0NMX r2 = r5.LLILZLL
            kotlin.jvm.internal.AwS624S0100000_10 r1 = new kotlin.jvm.internal.AwS624S0100000_10
            r0 = 76
            r1.<init>(r4, r0)
            java.util.List r0 = r2.LIZ(r3, r1)
            return r0
        L8e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.ability.SearchDislikeAbilityImpl.LIZLLL(java.util.List, X.0PHT):java.util.List");
    }

    public SearchDislikeAbilityImpl(SearchJediMixFeedFragment searchJediMixFeedFragment, C0PN8 c0pn8, RecyclerView recyclerView, C645130PSd c645130PSd) {
        this.LL = searchJediMixFeedFragment;
        this.LLILLJJLI = c0pn8;
        this.LLILLL = recyclerView;
        this.LLILZ = c645130PSd;
        this.LLILZIL = new C640540PAm(c0pn8, c645130PSd);
        C0NMX c0nmx = new C0NMX();
        this.LLILZLL = c0nmx;
        this.LLIZ = new C640570PAp(c0pn8, new C0NMR(searchJediMixFeedFragment, c0nmx, c0pn8), new C0PBJ(c0nmx, c0pn8, c645130PSd, recyclerView));
        c645130PSd.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0P6z
            public int LIZ;

            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                this.LIZ = this.LIZIZ.LLILZ.getItemCount();
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i, int i2) {
                if (i2 == 1) {
                    if (this.LIZ != this.LIZIZ.LLILZ.getItemCount() && this.LIZIZ.LLILZ.getItemCount() == 0 && !this.LIZIZ.LLILLJJLI.isLoading()) {
                        SearchDislikeAbilityImpl searchDislikeAbilityImpl = this.LIZIZ;
                        HandlerHook.viewPost(searchDislikeAbilityImpl.LLILLL, new ARunnableS110S0100000_10(searchDislikeAbilityImpl, 81));
                    }
                    this.LIZ = this.LIZIZ.LLILZ.getItemCount();
                }
            }
        });
        recyclerView.addOnScrollListener(new AsS37S0100000_10(this, 8));
    }
}
