package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0BCR;
import X.C0BRB;
import X.C0NK6;
import X.C0NK7;
import X.C0PFN;
import X.C0PH9;
import X.C0PLT;
import X.C1010120cOQ;
import X.C23250099c;
import X.C23271099x;
import X.C452501pT;
import X.InterfaceC594520NTm;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCardContainerSharedVM extends ViewModel {
    public static final C01GW<ConcurrentHashMap<String, SearchCardContainerSharedVM>> LLILZLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(306));
    public AnonymousClass0956 LLILLL;
    public volatile boolean LLILZ;
    public final ArrayList<ISearchCardProtocol<InterfaceC594520NTm>> LL = new ArrayList<>();
    public final ConcurrentHashMap<Integer, ISearchCardProtocol<InterfaceC594520NTm>> LLILLJJLI = new ConcurrentHashMap<>();
    public final C0PH9 LLILZIL = new C0PH9();

    public final void vQ2() {
        if (!((Boolean) C0BCR.LIZ.getValue()).booleanValue()) {
            C23250099c.LJ(C23271099x.INSTANCE, new C0NK6(this, null));
        } else {
            if (this.LLILZ) {
                return;
            }
            C23250099c.LJ(C23271099x.INSTANCE, new C0NK7(this, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ISearchCardProtocol<InterfaceC594520NTm> wQ2(InterfaceC594520NTm interfaceC594520NTm) {
        ISearchCardProtocol<InterfaceC594520NTm> next;
        Aweme aweme;
        if (C0BRB.LIZ() && (interfaceC594520NTm instanceof SearchMixFeed)) {
            C0PLT c0plt = (C0PLT) interfaceC594520NTm;
            if (c0plt.getFeedType() == 65280 && !C1010120cOQ.LJIJI(c0plt.getAweme()) && !C1010120cOQ.LJIL(c0plt.getAweme()) && (aweme = c0plt.getAweme()) != null && aweme.getAwemeType() == 0) {
                return NonMatching.LL;
            }
        }
        Iterator<ISearchCardProtocol<InterfaceC594520NTm>> it2 = this.LL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocol = next;
                if (iSearchCardProtocol.getDataType().LIZIZ(interfaceC594520NTm) && iSearchCardProtocol.Hd1(interfaceC594520NTm)) {
                    break;
                }
                if (interfaceC594520NTm instanceof C0PFN) {
                    C0PFN c0pfn = (C0PFN) interfaceC594520NTm;
                    if (iSearchCardProtocol.getDataType().LIZIZ(c0pfn.LIZ()) && iSearchCardProtocol.Hd1(c0pfn.LIZ())) {
                        break;
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocol2 = next;
        if (iSearchCardProtocol2 == null) {
            return NonMatching.LL;
        }
        return iSearchCardProtocol2;
    }
}
