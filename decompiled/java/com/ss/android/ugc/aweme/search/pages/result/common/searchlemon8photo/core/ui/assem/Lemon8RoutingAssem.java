package com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem;

import X.C0QSJ;
import X.C13LE;
import X.C1558520qew;
import X.C2217381BqS;
import X.C655330Pn9;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC594520NTm;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import Y.ARunnableS79S0200000_10;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class Lemon8RoutingAssem extends ReusedUIContentAssem<Lemon8RoutingAssem> implements InterfaceC712990Rxx<C655330Pn9>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public String LLJJJJ = "";
    public Aweme LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public volatile ICardVisitedAbility LLJJL;
    public InterfaceC665370Q7z LLJJLIIIJLLLLLLLZ;
    public C0QSJ LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(Lemon8RoutingAssem.class, "cardVisitedAbility", "getCardVisitedAbility()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchlemon8photo/core/ui/assem/ICardVisitedAbility;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchCardScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchCardScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void ap() {
        InterfaceC594520NTm interfaceC594520NTmCB2;
        SearchServiceCenter$AdapterControlAbility searchServiceCenter$AdapterControlAbility;
        if (this.LLJJJJLIIL) {
            this.LLJJJJLIIL = false;
            SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility = (SearchServiceCenter$CardCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class, null);
            if (searchServiceCenter$CardCommonAbility == null || (interfaceC594520NTmCB2 = searchServiceCenter$CardCommonAbility.cB2()) == null || (searchServiceCenter$AdapterControlAbility = (SearchServiceCenter$AdapterControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchServiceCenter$AdapterControlAbility.class, null)) == null) {
                return;
            }
            searchServiceCenter$AdapterControlAbility.U02(interfaceC594520NTmCB2);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        HandlerHook.viewPost(view, new ARunnableS79S0200000_10(this, this, 76));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C655330Pn9 c655330Pn9) {
        SearchMixFeed searchMixFeed = c655330Pn9.LL;
        String str = searchMixFeed.searchAwemeInfo.externalJumpUrl;
        if (str == null) {
            str = "";
        }
        this.LLJJJJ = str;
        this.LLJJJJJIL = searchMixFeed.getAweme();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C655330Pn9 c655330Pn9) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C655330Pn9 c655330Pn9) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
