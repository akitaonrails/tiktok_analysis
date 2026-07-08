package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.protocol;

import X.C03H5;
import X.C0PBO;
import X.C0PHI;
import X.C0PKK;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.BizData;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.photosearch.ui.assem.SearchFakeAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMix;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ui.cell.SearchQueryCorrectCell;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchQueryCorrectCardProtocol implements ISearchCardProtocol<SearchMix> {
    public final C19719912Dl LL = C13LE.LIZ(SearchMix.class);
    public final C0PKK LLILLJJLI = new C0PHI<SearchMix>() { // from class: X.0PKK
        public final C642240PHa LIZIZ = new C642240PHa(false, false, 0, true, true, false, false, false, false, true, null, null, 13332);

        @Override // X.C0PHI
        public final C0PHM LIZLLL() {
            return C0PHM.ONE_COLUMN;
        }

        @Override // X.C0PHI
        public final C642240PHa LJFF() {
            return this.LIZIZ;
        }

        @Override // X.C0PHI
        public final List LIZIZ(InterfaceC594520NTm interfaceC594520NTm, C0PHT c0pht) {
            return C13BV.INSTANCE;
        }
    };

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final String Zm1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem<? extends C03H5> IM2() {
        return new SearchFakeAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final Class<? extends PowerCell<? extends InterfaceC1891350zJl>> T2() {
        return SearchQueryCorrectCell.class;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMix> getConfig() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C13IQ<SearchMix> getDataType() {
        return this.LL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x000b, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Hd1(X.InterfaceC594520NTm r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.discover.model.SearchApiResult r9 = (com.ss.android.ugc.aweme.discover.model.SearchApiResult) r9
            java.util.List<com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo> r0 = r9.components
            r7 = 0
            if (r0 == 0) goto L4e
            java.util.Iterator r6 = r0.iterator()
        Lb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r5 = r6.next()
            r2 = r5
            com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo r2 = (com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo) r2
            java.lang.String r1 = r2.type
            java.lang.String r0 = "header"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lb
            java.util.List<com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo> r0 = r2.components
            if (r0 == 0) goto Lb
            java.util.Iterator r4 = r0.iterator()
        L2a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lb
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo r2 = (com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo) r2
            java.lang.String r1 = r2.type
            java.lang.String r0 = "query_correct_info"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2a
            com.ss.android.ugc.aweme.search.arch.v2.docker.components.BizData r0 = r2.bizData
            if (r0 == 0) goto L2a
            com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo r0 = r0.queryCorrectInfo
            if (r0 == 0) goto L2a
            if (r3 == 0) goto Lb
            if (r5 == 0) goto L4e
            r7 = 1
        L4e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.protocol.SearchQueryCorrectCardProtocol.Hd1(X.0NTm):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        BizData bizData;
        QueryCorrectComponentInfo queryCorrectComponentInfo;
        List<ComponentInfo> list = ((SearchApiResult) interfaceC594520NTm).components;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        for (ComponentInfo componentInfo : list) {
            if (Intrinsics.LJFF(componentInfo.type, "header")) {
                List<ComponentInfo> list2 = componentInfo.components;
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                for (ComponentInfo componentInfo2 : list2) {
                    if (Intrinsics.LJFF(componentInfo2.type, "query_correct_info") && (bizData = componentInfo2.bizData) != null && (queryCorrectComponentInfo = bizData.queryCorrectInfo) != null) {
                        return new C0PBO(queryCorrectComponentInfo);
                    }
                }
            }
        }
        return new C0PBO(null);
    }
}
