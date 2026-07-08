package com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell;

import X.C01GW;
import X.C13BV;
import X.C13LP;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1191840h7W;
import X.InterfaceC1192080h7u;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi.PoiReviewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractRefactorPoiReviewCell<T extends PoiReviewsApi.PoiReviewModel> extends PowerCell<T> implements InterfaceC1191840h7W {
    public PoiReviewsApi.PoiReviewModel LL;
    public final Map<String, Object> LLILLJJLI = new LinkedHashMap();
    public final Set<String> LLILLL = new LinkedHashSet();
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS562S0100000_18((AbstractRefactorPoiReviewCell) this, 1852));

    public abstract List<InterfaceC1192080h7u> I5();

    public abstract int L5();

    @Override // X.InterfaceC1191840h7W
    public final AbstractRefactorPoiReviewCell LLLLLLIL() {
        return this;
    }

    public void N5() {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        N5();
        Iterator it2 = ((List) this.LLILZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1192080h7u) it2.next()).LIZIZ(this);
        }
    }

    @Override // X.InterfaceC1191840h7W
    public final PoiReviewsApi.PoiReviewModel LJIL() {
        return this.LL;
    }

    @Override // X.InterfaceC1191840h7W
    public final <R> R LLLZIL(String str) {
        R r = (R) ((LinkedHashMap) this.LLILLJJLI).get(str);
        if (r == null) {
            return null;
        }
        return r;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl, C13BV.INSTANCE);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), L5(), viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public void onResume(boolean z) {
        super.onResume(z);
        Iterator it2 = ((List) this.LLILZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1192080h7u) it2.next()).onResume(z);
        }
    }

    @Override // X.InterfaceC1191840h7W
    public final void u2(Object obj) {
        if (obj == null) {
            this.LLILLJJLI.remove("header.activeAvatarView");
        } else {
            this.LLILLJJLI.put("header.activeAvatarView", obj);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: P5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t, List<? extends Object> list) {
        this.LL = t;
        if (list.isEmpty()) {
            Set setKeySet = ((LinkedHashMap) this.LLILLJJLI).keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (!this.LLILLL.contains(obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = C13LP.LLIIII(arrayList).iterator();
            while (it2.hasNext()) {
                this.LLILLJJLI.remove(it2.next());
            }
        }
        Iterator it3 = ((List) this.LLILZ.getValue()).iterator();
        while (it3.hasNext()) {
            ((InterfaceC1192080h7u) it3.next()).LIZJ(t, list);
        }
    }

    @Override // X.InterfaceC1191840h7W
    public final void y5(Object obj, String str) {
        if (obj == null) {
            this.LLILLJJLI.remove(str);
            this.LLILLL.remove(str);
        } else {
            this.LLILLJJLI.put(str, obj);
            this.LLILLL.add(str);
        }
    }
}
