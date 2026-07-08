package com.bytedance.android.livesdk.feed.drawerfeed.search;

import X.AbstractC1556290qbL;
import X.AbstractC21673619ry;
import X.C098200Yq;
import X.C09JN;
import X.C11JF;
import X.C11S5;
import X.C12ES;
import X.C13BV;
import X.C15438062q;
import X.C1556300qbM;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1809030xAz;
import X.C1809050xB1;
import X.C1809130xB9;
import X.C1809160xBC;
import X.C1834150xpV;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2834017w;
import X.C439101nJ;
import X.C472030IfB;
import X.C480460Ism;
import X.C786410Ut5;
import X.EnumC1809020xAy;
import X.InterfaceC1809080xB4;
import X.InterfaceC1809200xBG;
import Y.AObserverS229S0100000_27;
import Y.AfS196S0100000_27;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.feed.drawerfeed.search.LiveSearchIntermediateFragment;
import com.bytedance.android.livesdk.feed.drawerfeed.search.LiveSearchIntermediateViewModel;
import com.bytedance.android.livesdk.feed.drawerfeed.search.api.ILiveSearchApi;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchSugEntity;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchSugResponse;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchWord;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.widget.NextLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveSearchIntermediateFragment extends BaseFragment implements InterfaceC1809080xB4 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LiApLWE3OiQ7LD01HELIOSLSAoZzw2KTcvIWEfITMpGioyOiYkACEnLTchLCs6KTEpDz0yLygpJzs=";
    public BaseFragment LL;
    public RecyclerView LLILLJJLI;
    public C1809130xB9 LLILLL;
    public C1809160xBC LLILZ;
    public LiveSearchIntermediateViewModel LLILZIL;
    public C1809050xB1 LLILZLL;
    public String LLIZ;

    @Override // X.InterfaceC1809080xB4
    public final void Zj() {
    }

    @Override // X.InterfaceC1809080xB4
    public final void Wv(LiveSearchSugResponse liveSearchSugResponse) {
        C1809160xBC c1809160xBC = this.LLILZ;
        if (c1809160xBC != null) {
            Collection arrayList = liveSearchSugResponse.sugList;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ((ArrayList) c1809160xBC.LLILLJJLI).clear();
            ((ArrayList) c1809160xBC.LLILLJJLI).addAll(arrayList);
            c1809160xBC.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0xB0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0xB8] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NextLiveData<AbstractC1556290qbL> nextLiveDataWQ2;
        super.onCreate(bundle);
        this.LLILLL = new C1809130xB9(new InterfaceC1809200xBG() { // from class: X.0xB0
            @Override // X.InterfaceC1809200xBG
            public final void LIZIZ(LiveSearchSugEntity liveSearchSugEntity) {
            }

            @Override // X.InterfaceC1809200xBG
            public final void LIZJ(LiveSearchSugEntity liveSearchSugEntity, int i, Map<String, String> map) {
            }

            @Override // X.InterfaceC1809200xBG
            public final void LIZ(LiveSearchSugEntity liveSearchSugEntity) {
                this.LIZ.NR(liveSearchSugEntity, true);
            }
        });
        this.LLILZ = new C1809160xBC(new InterfaceC1809200xBG() { // from class: X.0xB8
            @Override // X.InterfaceC1809200xBG
            public final void LIZ(LiveSearchSugEntity liveSearchSugEntity) {
                this.LIZ.NR(liveSearchSugEntity, false);
            }

            @Override // X.InterfaceC1809200xBG
            public final void LIZIZ(LiveSearchSugEntity liveSearchSugEntity) {
                LiveSearchIntermediateViewModel liveSearchIntermediateViewModel = this.LIZ.LLILZIL;
                if (liveSearchIntermediateViewModel != null) {
                    liveSearchIntermediateViewModel.vQ2(0, liveSearchSugEntity.content);
                }
            }

            @Override // X.InterfaceC1809200xBG
            public final void LIZJ(final LiveSearchSugEntity liveSearchSugEntity, final int i, final Map<String, String> map) {
                final LiveSearchIntermediateFragment liveSearchIntermediateFragment = this.LIZ;
                liveSearchIntermediateFragment.getClass();
                if (!Intrinsics.LJFF(liveSearchSugEntity.sugType, "history")) {
                    final String strValueOf = String.valueOf(System.currentTimeMillis());
                    C1390850mIV c1390850mIV = new C1390850mIV();
                    C1247530iZL c1247530iZL = new C1247530iZL();
                    c1247530iZL.LIZJ(R.raw.icon_flag);
                    c1247530iZL.LIZIZ(2131852025);
                    c1247530iZL.LJ = new View.OnClickListener() { // from class: X.0xB3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String str;
                            InterfaceC671190QUj iLiveSearchService = ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).getILiveSearchService();
                            if (iLiveSearchService != null) {
                                LiveSearchIntermediateFragment liveSearchIntermediateFragment2 = liveSearchIntermediateFragment;
                                LiveSearchSugEntity liveSearchSugEntity2 = liveSearchSugEntity;
                                String str2 = liveSearchSugEntity2.content;
                                int i2 = i;
                                String str3 = liveSearchSugEntity2.sugType;
                                String str4 = liveSearchSugEntity2.LIZ;
                                String str5 = strValueOf;
                                LiveSearchWord liveSearchWord = liveSearchSugEntity2.mWord;
                                String str6 = null;
                                if (liveSearchWord != null) {
                                    str6 = liveSearchWord.id;
                                    str = liveSearchWord.word;
                                } else {
                                    str = null;
                                }
                                iLiveSearchService.LIZ(liveSearchIntermediateFragment2, new C671180QUi(str2, i2, str3, str4, str5, str6, str));
                            }
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trending_words_report");
                            c474500IjALIZ.LJJIIZI(map);
                            c474500IjALIZ.LIZ();
                        }
                    };
                    c1390850mIV.LIZ(c1247530iZL);
                    c1390850mIV.LIZJ().show(liveSearchIntermediateFragment.getChildFragmentManager(), "SugFeedBackInBottom");
                }
            }
        });
        this.LLILZLL = new C1809050xB1(this);
        BaseFragment baseFragment = this.LL;
        if (baseFragment != null) {
            LiveSearchIntermediateViewModel liveSearchIntermediateViewModel = (LiveSearchIntermediateViewModel) ViewModelProviders.of(baseFragment).get(LiveSearchIntermediateViewModel.class);
            this.LLILZIL = liveSearchIntermediateViewModel;
            if (liveSearchIntermediateViewModel != null && (nextLiveDataWQ2 = liveSearchIntermediateViewModel.wQ2()) != null) {
                nextLiveDataWQ2.observe(this, new AObserverS229S0100000_27(this, 15), true);
            }
        }
    }

    public final void NR(LiveSearchSugEntity liveSearchSugEntity, boolean z) {
        String str;
        C472030IfB c472030IfB = new C472030IfB();
        String str2 = liveSearchSugEntity.content;
        c472030IfB.LIZIZ = str2;
        if (z) {
            str = "search_history";
        } else {
            str = "search_sug";
        }
        c472030IfB.LIZ = str;
        LiveSearchIntermediateViewModel liveSearchIntermediateViewModel = this.LLILZIL;
        int i = 1;
        if (liveSearchIntermediateViewModel != null && str2 != null && !a0.LJJJIL(str2)) {
            ((LiveData) liveSearchIntermediateViewModel.LLILLL.getValue()).setValue(c472030IfB);
            AbstractC1556290qbL value = liveSearchIntermediateViewModel.wQ2().getValue();
            C1556300qbM c1556300qbM = C1556300qbM.LIZ;
            if (!Intrinsics.LJFF(value, c1556300qbM)) {
                liveSearchIntermediateViewModel.wQ2().setValue(c1556300qbM);
            }
        }
        LiveSearchIntermediateViewModel liveSearchIntermediateViewModel2 = this.LLILZIL;
        if (liveSearchIntermediateViewModel2 != null) {
            String str3 = liveSearchSugEntity.content;
            if (z) {
                i = 2;
            }
            liveSearchIntermediateViewModel2.vQ2(i, str3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    public final void OR(EnumC1809020xAy enumC1809020xAy, final String str) {
        AbstractC21673619ry adapter;
        RecyclerView recyclerView;
        AbstractC21673619ry adapter2;
        ?? arrayList;
        String str2;
        RecyclerView recyclerView2;
        int i = C1809030xAz.LIZ[enumC1809020xAy.ordinal()];
        final String str3 = null;
        if (i != 1) {
            if (i != 2) {
                RecyclerView recyclerView3 = this.LLILLJJLI;
                if (recyclerView3 != null) {
                    C439101nJ.LJI(recyclerView3);
                    return;
                }
                return;
            }
            RecyclerView recyclerView4 = this.LLILLJJLI;
            if (recyclerView4 != null) {
                C12ES.LJIILL(0, recyclerView4);
            }
            RecyclerView recyclerView5 = this.LLILLJJLI;
            if (recyclerView5 != null) {
                adapter2 = recyclerView5.getAdapter();
            } else {
                adapter2 = null;
            }
            if (!(adapter2 instanceof C1809130xB9) && (recyclerView2 = this.LLILLJJLI) != null) {
                recyclerView2.setAdapter(this.LLILLL);
            }
            List<String> listLIZ = C2834017w.LIZ();
            if (listLIZ != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                Iterator it2 = ((ArrayList) listLIZ).iterator();
                while (it2.hasNext()) {
                    LiveSearchSugEntity liveSearchSugEntity = new LiveSearchSugEntity("", (String) it2.next(), null, null, null, null, null, null, null);
                    LiveSearchIntermediateViewModel liveSearchIntermediateViewModel = this.LLILZIL;
                    if (liveSearchIntermediateViewModel != null) {
                        str2 = liveSearchIntermediateViewModel.LLILZ;
                    } else {
                        str2 = null;
                    }
                    liveSearchSugEntity.LIZLLL = str2;
                    liveSearchSugEntity.sugType = "history";
                    arrayList.add(liveSearchSugEntity);
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            C1809130xB9 c1809130xB9 = this.LLILLL;
            if (c1809130xB9 != null) {
                ((ArrayList) c1809130xB9.LLILLJJLI).clear();
                ((ArrayList) c1809130xB9.LLILLJJLI).addAll(arrayList);
                c1809130xB9.notifyDataSetChanged();
            }
            C1809160xBC c1809160xBC = this.LLILZ;
            if (c1809160xBC == null) {
                return;
            }
            C13BV c13bv = C13BV.INSTANCE;
            ((ArrayList) c1809160xBC.LLILLJJLI).clear();
            ((ArrayList) c1809160xBC.LLILLJJLI).addAll(c13bv);
            c1809160xBC.notifyDataSetChanged();
            return;
        }
        RecyclerView recyclerView6 = this.LLILLJJLI;
        if (recyclerView6 != null) {
            C12ES.LJIILL(0, recyclerView6);
        }
        RecyclerView recyclerView7 = this.LLILLJJLI;
        if (recyclerView7 != null) {
            adapter = recyclerView7.getAdapter();
        } else {
            adapter = null;
        }
        if (!(adapter instanceof C1809160xBC) && (recyclerView = this.LLILLJJLI) != null) {
            recyclerView.setAdapter(this.LLILZ);
        }
        final C1809050xB1 c1809050xB1 = this.LLILZLL;
        if (c1809050xB1 != null) {
            LiveSearchIntermediateViewModel liveSearchIntermediateViewModel2 = this.LLILZIL;
            if (liveSearchIntermediateViewModel2 != null) {
                str3 = liveSearchIntermediateViewModel2.LLILZ;
            }
            if (str != null) {
                C11JF c11jf = c1809050xB1.LIZIZ;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                final int i2 = c1809050xB1.LIZJ + 1;
                c1809050xB1.LIZJ = i2;
                C480460Ism.LIZ().getClass();
                ILiveSearchApi iLiveSearchApi = (ILiveSearchApi) C480460Ism.LIZLLL(ILiveSearchApi.class);
                String str4 = (String) c1809050xB1.LIZLLL.getValue();
                JSONArray jSONArray = new JSONArray();
                List<String> listLIZ2 = C2834017w.LIZ();
                if (listLIZ2 != null) {
                    Iterator it3 = ((ArrayList) listLIZ2).iterator();
                    while (it3.hasNext()) {
                        jSONArray.put(it3.next());
                    }
                }
                c1809050xB1.LIZIZ = (C11JF) iLiveSearchApi.getSugList(str4, str, "live", Uri.encode(jSONArray.toString()), 15).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0xB2
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        Object c098200Yq;
                        k kVarLJJIIZ;
                        C1C7U.LIZ("LiveSearchSugPresenter@b42.sendRequest$1");
                        LiveSearchSugResponse liveSearchSugResponse = (LiveSearchSugResponse) obj;
                        liveSearchSugResponse.getClass();
                        List<LiveSearchSugEntity> list = liveSearchSugResponse.sugList;
                        if (list != null) {
                            String str5 = str;
                            String str6 = str3;
                            for (LiveSearchSugEntity liveSearchSugEntity2 : list) {
                                liveSearchSugEntity2.LIZ = liveSearchSugResponse.requestId;
                                liveSearchSugEntity2.LIZIZ = str5;
                                String str7 = "";
                                if (liveSearchSugResponse.LIZ == null) {
                                    try {
                                        n nVar = liveSearchSugResponse.logPb;
                                        if (nVar == null || (kVarLJJIIZ = nVar.LJJIIZ("impr_id")) == null || (c098200Yq = kVarLJJIIZ.LJIL()) == null) {
                                            c098200Yq = "";
                                        }
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c098200Yq = new C098200Yq(th);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    }
                                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                        c098200Yq = null;
                                    }
                                    String str8 = (String) c098200Yq;
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    liveSearchSugResponse.LIZ = str8;
                                }
                                String str9 = liveSearchSugResponse.LIZ;
                                if (str9 != null) {
                                    str7 = str9;
                                }
                                liveSearchSugEntity2.LIZJ = str7;
                                liveSearchSugEntity2.LIZLLL = str6;
                            }
                        }
                        C1809050xB1 c1809050xB12 = c1809050xB1;
                        if (c1809050xB12.LIZJ == i2) {
                            c1809050xB12.LIZ.Wv(liveSearchSugResponse);
                        }
                        C1C7U.LIZIZ("LiveSearchSugPresenter@b42.sendRequest$1");
                    }
                }, new AfS196S0100000_27(c1809050xB1, 30));
            }
        }
        C1809130xB9 c1809130xB92 = this.LLILLL;
        if (c1809130xB92 == null) {
            return;
        }
        C13BV c13bv2 = C13BV.INSTANCE;
        ((ArrayList) c1809130xB92.LLILLJJLI).clear();
        ((ArrayList) c1809130xB92.LLILLJJLI).addAll(c13bv2);
        c1809130xB92.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(C1834150xpV.LIZJ(layoutInflater), R.layout.ghd, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewTd.findViewById(R.id.t0q);
        this.LLILLJJLI = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
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
