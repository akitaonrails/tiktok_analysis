package com.ss.android.ugc.aweme.search.ecommerce;

import X.C0PSI;
import X.C0Q2M;
import X.C0Q2N;
import X.C0Q2T;
import X.C0Q3J;
import X.C0QJ5;
import X.C0QJ6;
import X.C0QJY;
import X.C1440005kM;
import X.C19EG;
import X.C588260N5k;
import X.C644560PPy;
import X.C649960PeU;
import X.C650960Pg6;
import X.C651580Ph6;
import X.C667700QGy;
import X.C667750QHd;
import X.C667770QHf;
import X.C679340Qkm;
import X.C7740030o;
import X.InterfaceC664090Q3b;
import X.InterfaceC669910QPl;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchRootFragment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMiddleForEcService implements ISearchMiddleForECService {
    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LIZJ() {
        C0QJY.LJ(5);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJ() {
        if (C0Q2T.LIZ == 0) {
            C0Q2T.LIZ = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJFF() {
        C0Q2M.LIZ.getClass();
        C0Q2M.LJ();
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJIIL() {
        C0Q2M.LIZ.getClass();
        return C0Q2M.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJIJJ() {
        C0Q2M.LIZ.getClass();
        return C0Q2M.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJIIJ() {
        C0Q2M.LIZ.getClass();
        C0Q2M.LJII = true;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJIIZI() {
        C0Q2T.LIZ = 0L;
        C0Q2T.LIZIZ = 0L;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJII() {
        C0Q2T.LIZIZ().LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LIZ(int i) {
        return C644560PPy.LJIILIIL(i);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LIZIZ(String str) {
        C0Q2M.LIZ.getClass();
        C0Q2M.LJFF.add(str);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJI(String str) {
        C0Q2M.LIZ.getClass();
        C0Q2M.LJIIIIZZ(str, true);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJIIIIZZ(List<String> list) {
        C0Q2M.LIZ.getClass();
        C0Q2M.LJ.add(list);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJIIIZ(int i) {
        return C0PSI.LIZLLL(i);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJIIJ(List<String> list) {
        C0Q2M.LIZ.getClass();
        C0Q2M.LIZLLL.add(list);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJIIJJI(String str) {
        C0Q2M.LIZ.getClass();
        C0Q2N c0q2n = (C0Q2N) ((LinkedHashMap) C0Q2M.LIZIZ).get(str);
        if (c0q2n != null) {
            c0q2n.LJIIZILJ = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final int LJIILIIL(String str) {
        return C644560PPy.LJIIJ(str);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJIILLIIL(int i) {
        return C0PSI.LIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJIJ(int i) {
        return C0PSI.LJ(i);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJJ(C650960Pg6 c650960Pg6) {
        C667700QGy c667700QGy = (C667700QGy) new C667750QHd(c650960Pg6).LIZJ().LIZIZ();
        Map<?, ?> map = c667700QGy.LIZIZ;
        if (map != null && !map.isEmpty()) {
            return GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), c667700QGy.LIZIZ);
        }
        return "[]";
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJI(String str) {
        List<Pair<Integer, String>> list;
        C0Q2M.LIZ.getClass();
        C0Q2N c0q2n = (C0Q2N) ((LinkedHashMap) C0Q2M.LIZIZ).get(str);
        if (c0q2n != null && (list = c0q2n.LJFF) != null) {
            list.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJIFFI(SearchResultParam searchResultParam) {
        C1440005kM.LIZ(new C588260N5k(searchResultParam));
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final C667770QHf LJJIII(C650960Pg6 c650960Pg6) {
        return (C667770QHf) new C667750QHd(c650960Pg6).LIZIZ().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final boolean LJJIIJZLJL(C19EG c19eg) {
        SAFHelper.LIZ.getClass();
        return SAFHelper.LJJJJJL(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final int LJJIJ(C650960Pg6 c650960Pg6) {
        return new C667750QHd(c650960Pg6).LIZLLL() ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final C0QJ6 LJII(Fragment fragment, C19EG c19eg) {
        return ((SearchStartViewModel) C679340Qkm.LIZIZ(fragment, c19eg).get(SearchStartViewModel.class)).LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final C0QJ5 LJIILJJIL(Fragment fragment, C19EG c19eg) {
        return ((SearchStartViewModel) C679340Qkm.LIZIZ(fragment, c19eg).get(SearchStartViewModel.class)).LLJJJ;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJIILL(String str, String str2) {
        C0Q2M.LIZ.getClass();
        return C0Q2M.LJIIJ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final InterfaceC669910QPl LJIIZILJ(Fragment fragment, C19EG c19eg) {
        return ((SearchStartViewModel) C679340Qkm.LIZIZ(fragment, c19eg).get(SearchStartViewModel.class)).LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJIJI(String str, String str2) {
        C0Q2M.LIZ.getClass();
        return C0Q2M.LJIIJ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJIJJLI(View view, C19EG c19eg) {
        new C667750QHd(C651580Ph6.LIZLLL(view), c19eg).LIZ(new C0Q3J("sug"));
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final InterfaceC664090Q3b LJIL(Fragment fragment, C19EG c19eg) {
        return ((SearchStartViewModel) C679340Qkm.LIZIZ(fragment, c19eg).get(SearchStartViewModel.class)).LLJJJJ;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJIIZ(String str, Map<String, ? extends Object> map) {
        if (map != null) {
            C1440005kM.LIZ(new C649960PeU(C644560PPy.LJIIJ(str), map));
        } else {
            C1440005kM.LIZ(new C649960PeU(C644560PPy.LJIIJ(str)));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final HashMap<String, Long> LJJIJIIJI(View view, C19EG c19eg) throws Throwable {
        SAFHelper.LIZ.getClass();
        Fragment fragmentLJJIIZI = SAFHelper.LJJIIZI(view, c19eg);
        if (fragmentLJJIIZI instanceof SearchRootFragment) {
            return ((SearchStartViewModel) C679340Qkm.LIZIZ(fragmentLJJIIZI, c19eg).get(SearchStartViewModel.class)).LLJLIL;
        }
        return new HashMap<>();
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LIZLLL(int i, String str, String str2) {
        List<Pair<Integer, String>> list;
        C0Q2M.LIZ.getClass();
        C0Q2N c0q2n = (C0Q2N) ((LinkedHashMap) C0Q2M.LIZIZ).get(str);
        if (c0q2n != null && (list = c0q2n.LJFF) != null) {
            list.add(new Pair<>(Integer.valueOf(i), str2));
        }
    }
}
