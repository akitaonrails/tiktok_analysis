package com.ss.android.ugc.aweme.search.arch.v2.services.autoplay;

import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC658500PsG;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchComponentAbleViewHolder;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchCardAutoplayableViewHolder extends SearchComponentAbleViewHolder {
    public InterfaceC658500PsG LL;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchComponentAbleViewHolder, X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchPlayerScope.class});
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchComponentAbleViewHolder, X.C0QSJ
    public Object getAbility(Class cls) {
        if (cls == InterfaceC658500PsG.class) {
            return this.LL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchComponentAbleViewHolder, X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchComponentAbleViewHolder, X.C0QSJ
    public List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    public SearchCardAutoplayableViewHolder(View view) {
        super(view);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchComponentAbleViewHolder, X.C0QSJ
    public void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
        if (cls == InterfaceC658500PsG.class) {
            this.LL = (InterfaceC658500PsG) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchComponentAbleViewHolder, X.C0QSJ
    public void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
        if (cls == InterfaceC658500PsG.class) {
            this.LL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }
}
