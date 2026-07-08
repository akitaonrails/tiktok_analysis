package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.C652430PiT;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC658500PsG;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoSubCardAssem extends SearchAggregatedSubCardAssem<SearchTakoVideoRootAssem, C652430PiT> {
    public InterfaceC658500PsG LLJIJIL;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        super.bindAbility(obj, cls);
        if (cls == InterfaceC658500PsG.class) {
            this.LLJIJIL = (InterfaceC658500PsG) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchPlayerScope.class});
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem, X.C0QSJ
    public final Object getAbility(Class cls) {
        return cls == InterfaceC658500PsG.class ? this.LLJIJIL : super.getAbility(cls);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        super.unbindAbility(obj, cls);
        if (cls == InterfaceC658500PsG.class) {
            this.LLJIJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem
    public final ReusedUISlotAssem R5() {
        return new SearchTakoVideoRootAssem();
    }
}
