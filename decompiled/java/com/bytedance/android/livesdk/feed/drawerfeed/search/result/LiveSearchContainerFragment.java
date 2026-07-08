package com.bytedance.android.livesdk.feed.drawerfeed.search.result;

import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0DXR;
import X.C0IZG;
import X.C11JF;
import X.C11S5;
import X.C12ES;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1834150xpV;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C439101nJ;
import X.C452501pT;
import X.C471840Ies;
import X.C471910Iez;
import X.C471920If0;
import X.C471950If3;
import X.C472030IfB;
import X.C472040IfC;
import X.C472120IfK;
import X.C480460Ism;
import X.C521590Kcv;
import X.C786410Ut5;
import X.EnumC471940If2;
import X.EnumC471970If5;
import X.InterfaceC471870Iev;
import X.InterfaceC472130IfL;
import Y.ARunnableS76S0200000_7;
import Y.AfS176S0100000_7;
import Y.AfS1S1100100_7;
import Y.AfS43S1100000_7;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.feed.drawerfeed.search.api.ILiveSearchApi;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchAweme;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchResponse;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchStruct;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSearchContainerFragment extends BaseFragment implements InterfaceC472130IfL, InterfaceC471870Iev<LiveSearchStruct> {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LiApLWE3OiQ7LD01LSHELIOSAoZzw2KTcvIWEhLTY5JTt9BCw6LBw2KTcvIQw8JjEtICE2OgM+KCg+LSs4";
    public C1749280vcc LL;
    public RecyclerView LLILLJJLI;
    public View LLILLL;
    public C471910Iez LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 59));
    public final C471840Ies LLILZLL = new C471840Ies(this);
    public C472030IfB LLIZ;
    public boolean LLIZLLLIL;
    public ARunnableS76S0200000_7 LLJ;

    @Override // X.InterfaceC472130IfL
    public final void n2(boolean z) {
    }

    @Override // X.InterfaceC471870Iev
    public final void showLoadMoreError() {
        this.LLIZLLLIL = false;
        C471910Iez c471910Iez = this.LLILZ;
        if (c471910Iez != null) {
            c471910Iez.LLILZ = false;
            if (((ArrayList) c471910Iez.LL).size() <= 0 || c471910Iez.getItemCount() <= 0) {
                return;
            }
            c471910Iez.notifyItemChanged(c471910Iez.getItemCount() - 1);
        }
    }

    @Override // X.InterfaceC471870Iev
    public final void LJ() {
        C1749280vcc c1749280vcc = this.LL;
        if (c1749280vcc != null) {
            C12ES.LJIILL(0, c1749280vcc);
        }
        C1749280vcc c1749280vcc2 = this.LL;
        if (c1749280vcc2 != null) {
            c1749280vcc2.LJ();
        }
    }

    @Override // X.InterfaceC472130IfL
    public final void preload() {
        if (this.LLIZLLLIL) {
            C471840Ies c471840Ies = this.LLILZLL;
            C472030IfB c472030IfB = this.LLIZ;
            String str = c472030IfB != null ? c472030IfB.LIZIZ : null;
            c471840Ies.getClass();
            if (str == null || a0.LJJJIL(str) || c471840Ies.LIZIZ) {
                return;
            }
            if ((c471840Ies.LJII instanceof C472040IfC) || !c471840Ies.LJI) {
                c471840Ies.LIZ(str, true);
                return;
            }
            c471840Ies.LIZIZ = true;
            C480460Ism.LIZ().getClass();
            c471840Ies.LJIIIIZZ = (C11JF) ((ILiveSearchApi) C480460Ism.LIZLLL(ILiveSearchApi.class)).searchLiveList((String) c471840Ies.LJIIIZ.getValue(), c471840Ies.LIZJ, str, 20, c471840Ies.LJIIJ, "live", c471840Ies.LIZLLL, "live").LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS43S1100000_7(c471840Ies, str, 1), new AfS176S0100000_7(c471840Ies, 13));
        }
    }

    @Override // X.InterfaceC471870Iev
    public final void wv() {
        C1749280vcc c1749280vcc = this.LL;
        if (c1749280vcc != null) {
            C12ES.LJIILL(0, c1749280vcc);
        }
        C1749280vcc c1749280vcc2 = this.LL;
        if (c1749280vcc2 != null) {
            c1749280vcc2.setStatus((C1722300uv6) this.LLILZIL.getValue());
        }
        View view = this.LLILLL;
        if (view != null) {
            C439101nJ.LJI(view);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C471840Ies c471840Ies = this.LLILZLL;
        C11JF c11jf = c471840Ies.LJIIIIZZ;
        if (c11jf != null && !c11jf.isDisposed()) {
            c11jf.dispose();
        }
        c471840Ies.LIZIZ = false;
        c471840Ies.LJII = null;
        c471840Ies.LJI = true;
        C0IZG c0izg = c471840Ies.LJIIJJI;
        C11JF c11jf2 = c0izg.LIZLLL;
        if (c11jf2 != null && !c11jf2.isDisposed()) {
            c11jf2.dispose();
        }
        c0izg.LIZJ = false;
        c0izg.LIZIZ = null;
    }

    @Override // X.InterfaceC472130IfL
    public final boolean LJIIJJI() {
        return this.LLIZLLLIL;
    }

    public final void NR(boolean z) {
        RecyclerView.LayoutManager layoutManager;
        C471910Iez c471910Iez = this.LLILZ;
        if (c471910Iez != null) {
            RecyclerView recyclerView = this.LLILLJJLI;
            if (c471910Iez.LLILZLL && z) {
                c471910Iez.LLILZLL = false;
                return;
            }
            if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
                return;
            }
            int childCount = layoutManager.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = layoutManager.getChildAt(i);
                if (childAt != null) {
                    RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
                    if (childViewHolder instanceof C471920If0) {
                        C471920If0 c471920If0 = (C471920If0) childViewHolder;
                        if (z) {
                            c471920If0.L5();
                        } else {
                            c471920If0.getClass();
                        }
                    }
                }
            }
        }
    }

    public final void OR(C472030IfB c472030IfB) {
        C11JF c11jf;
        C11JF c11jf2;
        if (c472030IfB == null) {
            return;
        }
        if (this.LLILZ != null) {
            View view = this.LLILLL;
            if (view != null) {
                C439101nJ.LJI(view);
            }
            C471910Iez c471910Iez = this.LLILZ;
            if (c471910Iez != null) {
                c471910Iez.LLLFZ(new ArrayList(), false, EnumC471940If2.DEFAULT);
            }
            this.LLIZ = c472030IfB;
            final C471840Ies c471840Ies = this.LLILZLL;
            final String str = c472030IfB.LIZIZ;
            String str2 = c472030IfB.LIZ;
            c471840Ies.getClass();
            if (str != null && !a0.LJJJIL(str)) {
                if (c471840Ies.LIZIZ && (c11jf = c471840Ies.LJIIIIZZ) != null && !c11jf.isDisposed() && (c11jf2 = c471840Ies.LJIIIIZZ) != null) {
                    c11jf2.dispose();
                }
                if (str2 != null && !a0.LJJJIL(str2)) {
                    c471840Ies.LJIIJ = str2;
                }
                c471840Ies.LJII = null;
                c471840Ies.LIZIZ = true;
                c471840Ies.LJI = true;
                final long j = c471840Ies.LJFF + 1;
                c471840Ies.LJFF = j;
                c471840Ies.LIZJ = 0L;
                c471840Ies.LIZ.LJ();
                final long jCurrentTimeMillis = System.currentTimeMillis();
                C480460Ism.LIZ().getClass();
                c471840Ies.LJIIIIZZ = (C11JF) ((ILiveSearchApi) C480460Ism.LIZLLL(ILiveSearchApi.class)).searchLiveList((String) c471840Ies.LJIIIZ.getValue(), c471840Ies.LIZJ, str, 20, c471840Ies.LJIIJ, "live", "", "live").LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0Iey
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("LiveSearchPresenter@67c.refreshSearchList$1");
                        LiveSearchResponse liveSearchResponse = (LiveSearchResponse) obj;
                        long j2 = j;
                        C471840Ies c471840Ies2 = c471840Ies;
                        if (j2 == c471840Ies2.LJFF) {
                            c471840Ies2.LIZIZ(liveSearchResponse, jCurrentTimeMillis, str, c471840Ies2.LIZLLL);
                            C471840Ies c471840Ies3 = c471840Ies;
                            c471840Ies3.LJII = liveSearchResponse;
                            c471840Ies3.LIZIZ = false;
                            c471840Ies3.LIZJ = liveSearchResponse.cursor;
                            c471840Ies3.LIZLLL = liveSearchResponse.LIZ();
                            C471840Ies c471840Ies4 = c471840Ies;
                            c471840Ies4.LJ = c471840Ies4.LIZLLL;
                            c471840Ies4.LJI = liveSearchResponse.hasMore;
                            List<LiveSearchStruct> list = liveSearchResponse.liveList;
                            if (list != null && (!list.isEmpty())) {
                                C471840Ies c471840Ies5 = c471840Ies;
                                String str3 = str;
                                for (LiveSearchStruct liveSearchStruct : list) {
                                    LiveSearchAweme liveSearchAweme = liveSearchStruct.liveAweme;
                                    if (liveSearchAweme != null) {
                                        liveSearchAweme.LIZ = liveSearchResponse.LIZ();
                                    }
                                    if (liveSearchStruct.liveAweme != null && liveSearchResponse.logPb == null) {
                                        new n();
                                    }
                                    LiveSearchAweme liveSearchAweme2 = liveSearchStruct.liveAweme;
                                    if (liveSearchAweme2 != null) {
                                        liveSearchAweme2.LIZIZ = C472010If9.LIZIZ;
                                        liveSearchAweme2.LIZJ = c471840Ies5.LJ;
                                        liveSearchAweme2.LIZLLL = str3;
                                        liveSearchAweme2.LJ = c471840Ies5.LJIIJ;
                                    }
                                }
                                c471840Ies5.LIZ.gR(list, EnumC471940If2.SEARCH_REFRESH);
                            } else {
                                c471840Ies.LIZ(str, false);
                            }
                        }
                        C1C7U.LIZIZ("LiveSearchPresenter@67c.refreshSearchList$1");
                    }
                }, new AfS1S1100100_7(jCurrentTimeMillis, c471840Ies, str, 0));
                return;
            }
            return;
        }
        this.LLJ = new ARunnableS76S0200000_7(this, c472030IfB, 19);
    }

    @Override // X.InterfaceC471870Iev
    public final void gR(List list, EnumC471940If2 enumC471940If2) {
        C471910Iez c471910Iez = this.LLILZ;
        if (c471910Iez != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                LiveSearchAweme liveSearchAweme = ((LiveSearchStruct) it2.next()).liveAweme;
                if (liveSearchAweme != null) {
                    arrayList.add(liveSearchAweme);
                }
            }
            c471910Iez.LLLFZ(arrayList, true, enumC471940If2);
        }
        this.LLIZLLLIL = true;
        if (list.size() <= 6) {
            preload();
        }
        C1749280vcc c1749280vcc = this.LL;
        if (c1749280vcc != null) {
            C439101nJ.LJI(c1749280vcc);
        }
        if (list.isEmpty()) {
            View view = this.LLILLL;
            if (view != null) {
                C439101nJ.LJI(view);
                return;
            }
            return;
        }
        View view2 = this.LLILLL;
        if (view2 == null) {
            return;
        }
        C12ES.LJIILL(0, view2);
    }

    @Override // X.InterfaceC471870Iev
    public final void Rg(List<? extends LiveSearchStruct> list, boolean z, EnumC471940If2 enumC471940If2) {
        EnumC471940If2 enumC471940If22;
        C471910Iez c471910Iez = this.LLILZ;
        if (c471910Iez != null) {
            ArrayList<LiveSearchAweme> arrayList = new ArrayList();
            Iterator<? extends LiveSearchStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                LiveSearchAweme liveSearchAweme = it2.next().liveAweme;
                if (liveSearchAweme != null) {
                    arrayList.add(liveSearchAweme);
                }
            }
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (LiveSearchAweme liveSearchAweme2 : arrayList) {
                    Room roomLIZ = liveSearchAweme2.LIZ();
                    if (roomLIZ != null) {
                        long id = roomLIZ.getId();
                        if (id > 0) {
                            if (!((CopyOnWriteArrayList) c471910Iez.LLILLJJLI).contains(Long.valueOf(id))) {
                                arrayList2.add(liveSearchAweme2);
                                ((CopyOnWriteArrayList) c471910Iez.LLILLJJLI).add(Long.valueOf(id));
                            }
                        }
                    }
                }
                int size = arrayList2.size();
                if (!arrayList2.isEmpty() && (enumC471940If22 = c471910Iez.LLILLL) != enumC471940If2 && ((enumC471940If2 == EnumC471940If2.FEED_REFRESH || enumC471940If2 == EnumC471940If2.FEED_LOAD_MORE) && (enumC471940If22 == EnumC471940If2.DEFAULT || enumC471940If22 == EnumC471940If2.SEARCH_REFRESH || enumC471940If22 == EnumC471940If2.SEARCH_LOAD_MORE))) {
                    int size2 = ((ArrayList) c471910Iez.LL).size();
                    if (size2 == 0) {
                        List<LiveSearchAweme> list2 = c471910Iez.LL;
                        EnumC471970If5 enumC471970If5 = EnumC471970If5.NO_RESULT;
                        LiveSearchAweme liveSearchAweme3 = new LiveSearchAweme();
                        liveSearchAweme3.LIZIZ = new C471950If3(enumC471970If5);
                        ((ArrayList) list2).add(liveSearchAweme3);
                    } else {
                        List<LiveSearchAweme> list3 = c471910Iez.LL;
                        EnumC471970If5 enumC471970If52 = EnumC471970If5.NO_MORE_RESULT;
                        LiveSearchAweme liveSearchAweme4 = new LiveSearchAweme();
                        liveSearchAweme4.LIZIZ = new C471950If3(enumC471970If52);
                        ((ArrayList) list3).add(liveSearchAweme4);
                    }
                    size++;
                    c471910Iez.LLILZIL = size2;
                } else if (enumC471940If2 == EnumC471940If2.DEFAULT || enumC471940If2 == EnumC471940If2.SEARCH_REFRESH || enumC471940If2 == EnumC471940If2.SEARCH_LOAD_MORE) {
                    c471910Iez.LLILZIL += arrayList2.size();
                }
                ((ArrayList) c471910Iez.LL).addAll(arrayList2);
                c471910Iez.LLILZ = z;
                c471910Iez.LLILLL = enumC471940If2;
                c471910Iez.notifyItemRangeInserted(((ArrayList) c471910Iez.LL).size() - size, size);
            }
        }
        this.LLIZLLLIL = z;
        C1749280vcc c1749280vcc = this.LL;
        if (c1749280vcc != null) {
            C439101nJ.LJI(c1749280vcc);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C1834150xpV.LIZJ(layoutInflater), R.layout.ghc, viewGroup, false);
        this.LL = (C1749280vcc) viewTd.findViewById(R.id.w28);
        this.LLILLJJLI = (RecyclerView) viewTd.findViewById(R.id.t0q);
        this.LLILLL = viewTd.findViewById(R.id.ybn);
        this.LLILZ = new C471910Iez();
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView != null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            gridLayoutManager.LLIZ = new C521590Kcv(this, 0);
            recyclerView.setLayoutManager(gridLayoutManager);
            C472120IfK c472120IfK = new C472120IfK(recyclerView, this);
            c472120IfK.LJ = 2;
            recyclerView.setOnFlingListener(c472120IfK);
            recyclerView.setAdapter(this.LLILZ);
            RecyclerView recyclerView2 = this.LLILLJJLI;
            if (recyclerView2 != null) {
                recyclerView2.setPadding(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getPaddingRight(), recyclerView2.getPaddingBottom());
            }
            recyclerView.addItemDecoration(new C0DXR() { // from class: X.0DX4
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView3, C21673919s1 c21673919s1) {
                    GridLayoutManager gridLayoutManager2;
                    AbstractC214823195h abstractC214823195h;
                    int iLIZIZ;
                    super.LIZIZ(rect, view, recyclerView3, c21673919s1);
                    RecyclerView.LayoutManager layoutManager = recyclerView3.getLayoutManager();
                    if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager2 = (GridLayoutManager) layoutManager) != null && (abstractC214823195h = gridLayoutManager2.LLIZ) != null) {
                        int i = gridLayoutManager2.LLILLJJLI;
                        if (view.getVisibility() == 0) {
                            iLIZIZ = (int) C497740JfY.LIZIZ(3.0f);
                        } else {
                            iLIZIZ = 0;
                        }
                        int iLIZIZ2 = (int) C497740JfY.LIZIZ(1.5f);
                        int childAdapterPosition = recyclerView3.getChildAdapterPosition(view);
                        if (childAdapterPosition == 0) {
                            rect.top = 0;
                        } else if (childAdapterPosition == 1 && abstractC214823195h.LJFF(childAdapterPosition) != i) {
                            rect.top = 0;
                        } else {
                            rect.top = iLIZIZ;
                        }
                        rect.left = iLIZIZ2;
                        rect.right = iLIZIZ2;
                    }
                }
            });
        }
        ARunnableS76S0200000_7 aRunnableS76S0200000_7 = this.LLJ;
        if (aRunnableS76S0200000_7 != null) {
            aRunnableS76S0200000_7.run();
        }
        C19GS c19gs = null;
        this.LLJ = null;
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
