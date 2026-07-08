package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ui;

import X.C0DXR;
import X.C0QSJ;
import X.C13BV;
import X.C13LP;
import X.C1558520qew;
import X.C21673919s1;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC687730QyJ;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentScope;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchStaggeredGridItemDecoration extends C0DXR implements C0QSJ, InterfaceC1146704e9 {
    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        List<InterfaceC1891350zJl> listTT;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof StaggeredGridLayoutManager) && layoutManager != null) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            ISearchPageListAbility iSearchPageListAbility = (ISearchPageListAbility) C1558520qew.LIZ(null, ISearchPageListAbility.class, null);
            if (iSearchPageListAbility == null || (listTT = iSearchPageListAbility.tT()) == null) {
                listTT = C13BV.INSTANCE;
            }
            C13LP.LJJJLZIJ(childAdapterPosition, listTT);
        }
    }
}
