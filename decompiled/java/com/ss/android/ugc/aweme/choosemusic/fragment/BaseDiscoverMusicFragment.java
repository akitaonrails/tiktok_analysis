package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.AnonymousClass1541;
import X.C098200Yq;
import X.C0P6P;
import X.C0RD4;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C12ES;
import X.C138P;
import X.C15GL;
import X.C15GM;
import X.C15GO;
import X.C15GP;
import X.C15GQ;
import X.C15H0;
import X.C15HB;
import X.C15HP;
import X.C15O7;
import X.C1627000sRO;
import X.C1659630tI1;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C1911780zqi;
import X.C19EG;
import X.C19GS;
import X.C20448714zt;
import X.C204594153w;
import X.C20748816He;
import X.C2188811AlT;
import X.C341940Daq;
import X.C419910GdJ;
import X.C588310N5p;
import X.C786410Ut5;
import X.InterfaceC1258040iqI;
import X.InterfaceC20494515Hj;
import X.InterfaceC2385309Wh;
import Y.ACListenerS165S0100000_31;
import Y.AObserverS233S0100000_31;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.model.MusicCollectionFeedResponse;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.MusicRecyclerViewPoolViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BaseDiscoverMusicFragment extends AmeBaseFragment implements Observer<C0RD4>, InterfaceC1258040iqI, C0P6P {
    public static final /* synthetic */ int LLJJIII = 0;
    public RecyclerView LL;
    public C1749280vcc LLILLJJLI;
    public DataCenter LLILLL;
    public WidgetManager LLILZ;
    public C15HB LLILZIL;
    public int LLILZLL;
    public C15H0 LLIZ;
    public C15GM LLIZLLLIL;
    public InterfaceC20494515Hj<C15HP> LLJ;
    public int LLJI;
    public C204594153w LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public Map<String, Object> LLJJI;

    public abstract void MR(C0RD4 c0rd4);

    public abstract void NR();

    public abstract void showLoadMoreEmpty();

    public final void LJ() {
        if (this.LLILLJJLI != null) {
            C786410Ut5.xd(this.LLILLJJLI, C12ES.LIZJ(20.0f, getContext()));
            C786410Ut5.LLLZLZ(this.LLILLJJLI, 0);
            this.LLILLJJLI.LJ();
        }
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        C15HB c15hb;
        C15O7<MusicCollectionFeedResponse> c15o7LJ;
        int iIntValue = ((Integer) this.LLILLL.get("collection_feed_cursor", Integer.valueOf(this.LLJI))).intValue();
        if (iIntValue < 0) {
            iIntValue = 0;
        }
        C204594153w c204594153w = this.LLJIJIL;
        if (c204594153w != null) {
            int i = this.LLJILLL;
            if (!c204594153w.LJI) {
                c204594153w.LJI = true;
                C138P c138pLIZ = C138P.LIZ();
                if (ChooseMusicApi.LIZLLL()) {
                    c15o7LJ = ChooseMusicApi.LJ(Integer.valueOf(iIntValue), 10, i);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("collection/feed ");
                    sbLIZ.append(iIntValue);
                    sbLIZ.append(' ');
                    sbLIZ.append(10);
                    sbLIZ.append(' ');
                    sbLIZ.append(i);
                    final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (iIntValue == 0) {
                        Object objLIZ = AnonymousClass1541.LIZ(strLIZIZ);
                        if (objLIZ instanceof MusicCollectionFeedResponse) {
                            C588310N5p.LIZ.getClass();
                            C588310N5p.LIZ(1, "collection_feed");
                            c15o7LJ = C15O7.LJIIJ(objLIZ);
                        } else {
                            C588310N5p.LIZ.getClass();
                            C588310N5p.LIZ(0, "collection_feed");
                            c15o7LJ = ChooseMusicApi.LJ(Integer.valueOf(iIntValue), 10, i).LJI(new InterfaceC2385309Wh() { // from class: X.153z
                                @Override // X.InterfaceC2385309Wh
                                public final Object then(C15O7 c15o7) {
                                    C1C7U.LIZ("SoftCacheHooker@dd70.hookMusicCollectionFeed$1");
                                    if (c15o7.LJIILJJIL() && c15o7.LJIIL() != null) {
                                        AnonymousClass1541.LIZIZ(c15o7.LJIIL(), strLIZIZ);
                                    }
                                    C1C7U.LIZIZ("SoftCacheHooker@dd70.hookMusicCollectionFeed$1");
                                    return c15o7;
                                }
                            });
                        }
                    } else {
                        c15o7LJ = ChooseMusicApi.LJ(Integer.valueOf(iIntValue), 10, i).LJI(new InterfaceC2385309Wh() { // from class: X.153z
                            @Override // X.InterfaceC2385309Wh
                            public final Object then(C15O7 c15o7) {
                                C1C7U.LIZ("SoftCacheHooker@dd70.hookMusicCollectionFeed$1");
                                if (c15o7.LJIILJJIL() && c15o7.LJIIL() != null) {
                                    AnonymousClass1541.LIZIZ(c15o7.LJIIL(), strLIZIZ);
                                }
                                C1C7U.LIZIZ("SoftCacheHooker@dd70.hookMusicCollectionFeed$1");
                                return c15o7;
                            }
                        });
                    }
                }
                c15o7LJ.LJ(new C20748816He(c204594153w, c138pLIZ, 3), C15O7.LJIIIIZZ, null);
            }
        }
        if (!isViewValid() || (c15hb = this.LLILZIL) == null) {
            return;
        }
        c15hb.showLoadMoreLoading();
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        return this.LL;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C15HB c15hb = new C15HB(this, this.LLILZ, this.LLILLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLILZLL, this.LLJILLL, this.LLJJ);
        this.LLILZIL = c15hb;
        c15hb.setLoadMoreListener(this);
        C15HB c15hb2 = this.LLILZIL;
        c15hb2.LLJILJIL = this.LLJILJIL;
        c15hb2.LLJILJILJ = this.LLJILJILJ;
        if (C1911780zqi.LIZJ(this.LLJJ)) {
            this.LLILZIL.LLJJIII = true;
        } else {
            this.LLILZIL.LLJJIII = false;
        }
        this.LL.setOverScrollMode(2);
        this.LL.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        this.LL.setRecycledViewPool(MusicRecyclerViewPoolViewModel.vQ2(getContext()));
        this.LL.setAdapter(this.LLILZIL);
        if (!C1911780zqi.LIZJ(this.LLJJ)) {
            ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = (ChooseMusicWithSceneViewModel) C1659630tI1.LJ(this).get(ChooseMusicWithSceneViewModel.class);
            if (chooseMusicWithSceneViewModel.LL) {
                chooseMusicWithSceneViewModel.wQ2().observe(getViewLifecycleOwner(), new AObserverS233S0100000_31(this, 43));
            } else {
                this.LL.setOnScrollChangeListener(new C15GP(new C15GQ(new C15GO() { // from class: X.15GK
                    @Override // X.C15GO
                    public final void LIZ() {
                        this.LIZ.LJJIFFI();
                    }
                }, 5)));
            }
        } else {
            C204594153w c204594153w = this.LLJIJIL;
            if (c204594153w != null) {
                c204594153w.LJIIJJI(this.LLJILLL);
            }
        }
        DataCenter dataCenter = this.LLILLL;
        if (dataCenter != null) {
            dataCenter.yQ2("list", this, C15GL.LIZ());
            dataCenter.yQ2("should_load_more_pick", this, false);
            dataCenter.yQ2("music_collect_status", this, false);
            dataCenter.yQ2("collection_feed_status", this, false);
            dataCenter.yQ2("more_tab_refresh_status", this, false);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        List list;
        C204594153w c204594153w;
        Integer num;
        C0RD4 c0rd42 = c0rd4;
        if (c0rd42 != null) {
            String str = c0rd42.LIZ;
            str.getClass();
            switch (str.hashCode()) {
                case -1635157503:
                    if (str.equals("music_collect_status")) {
                        MR(c0rd42);
                    }
                    break;
                case 3322014:
                    if (str.equals("list") && (list = (List) this.LLILLL.get("list")) != null && list.size() >= 1) {
                        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().end(OpenMusicPanelPerformanceMonitor.INSTANCE, "set_music_data");
                        int itemCount = this.LLILZIL.getItemCount();
                        this.LLJI = list.size();
                        boolean zBooleanValue = ((Boolean) this.LLILLL.get("is_busi_sticker", Boolean.FALSE)).booleanValue();
                        if ("challenge".equals(this.LLILLL.get("shoot_way", null))) {
                            if (this.LLILLL.get("data_challenge") != null) {
                                C15HB c15hb = this.LLILZIL;
                                c15hb.LLJIJIL = true;
                                c15hb.LLJILLL = 5;
                            } else {
                                List list2 = (List) this.LLILLL.get("data_sticker", null);
                                if (list2 != null && list2.size() > 0) {
                                    C15HB c15hb2 = this.LLILZIL;
                                    c15hb2.LLJIJIL = true;
                                    c15hb2.LLJILLL = 4;
                                }
                            }
                        } else if (zBooleanValue) {
                            NR();
                        } else {
                            List list3 = (List) this.LLILLL.get("data_sticker", null);
                            if (list3 != null && list3.size() > 0) {
                                C15HB c15hb3 = this.LLILZIL;
                                c15hb3.LLJIJIL = true;
                                c15hb3.LLJILLL = 4;
                            } else if (this.LLILLL.get("data_challenge") != null) {
                                C15HB c15hb4 = this.LLILZIL;
                                c15hb4.LLJIJIL = true;
                                c15hb4.LLJILLL = 5;
                            }
                        }
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (it2.next() instanceof C20448714zt) {
                                this.LLILZIL.LLJJI = true;
                            }
                        }
                        C15HB c15hb5 = this.LLILZIL;
                        ((Boolean) this.LLILLL.get("show_music_radio", Boolean.FALSE)).booleanValue();
                        c15hb5.getClass();
                        C15HB c15hb6 = this.LLILZIL;
                        c15hb6.LLIZ = this.LLJI;
                        int itemCount2 = c15hb6.getItemCount() - itemCount;
                        if (itemCount2 > 0) {
                            String str2 = Build.MODEL;
                            if (!TextUtils.equals(str2, "Redmi 6A") && !TextUtils.equals(str2, "Redmi 6")) {
                                this.LLILZIL.notifyItemRangeInserted(itemCount, itemCount2);
                            } else {
                                this.LLILZIL.notifyDataSetChanged();
                            }
                        } else {
                            this.LLILZIL.notifyDataSetChanged();
                        }
                        if (this.LLILLL.get("collection_feed_has_more") != null) {
                            if (((Integer) this.LLILLL.get("collection_feed_has_more")).intValue() == 1) {
                                this.LLILZIL.resetLoadMoreState();
                            } else {
                                showLoadMoreEmpty();
                            }
                        }
                        break;
                    }
                    break;
                case 510590654:
                    if (str.equals("should_load_more_pick") && (c204594153w = this.LLJIJIL) != null) {
                        c204594153w.LIZJ(true, null, null, false, this.LLJILLL, this.LLJJ, this.LLJJI);
                        break;
                    }
                    break;
                case 965388522:
                    if (str.equals("more_tab_refresh_status")) {
                        Integer num2 = (Integer) this.LLILLL.get("more_tab_refresh_status");
                        if (num2.intValue() == 0) {
                            if (this.LLILLJJLI != null) {
                                C786410Ut5.xd(this.LLILLJJLI, 0.0f);
                                C786410Ut5.LLLZLZ(this.LLILLJJLI, 8);
                            }
                        } else if (num2.intValue() == 2) {
                            LJ();
                        } else {
                            C1749280vcc c1749280vcc = this.LLILLJJLI;
                            if (c1749280vcc != null) {
                                C786410Ut5.LLLZLZ(c1749280vcc, 0);
                                Pair<String, String> pairLIZ = C1627000sRO.LIZ(this.LLILLJJLI.getContext());
                                C419910GdJ c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = R.raw.icon_large_refresh;
                                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                                C1722300uv6 c1722300uv6 = new C1722300uv6();
                                c1722300uv6.LIZJ = 0;
                                c1722300uv6.LIZIZ = c419910GdJ;
                                int iLIZ = C341940Daq.LIZ(72.0d);
                                int iLIZ2 = C341940Daq.LIZ(72.0d);
                                c1722300uv6.LIZLLL = iLIZ;
                                c1722300uv6.LJ = iLIZ2;
                                c1722300uv6.LJI = pairLIZ.getFirst();
                                c1722300uv6.LJIIIIZZ = pairLIZ.getSecond();
                                C786410Ut5.l9(this.LLILLJJLI, new ACListenerS165S0100000_31(this, 196));
                                this.LLILLJJLI.setStatus(c1722300uv6);
                            }
                        }
                    }
                    break;
                case 1110903186:
                    if (str.equals("collection_feed_status") && (num = (Integer) this.LLILLL.get("collection_feed_status")) != null && num.intValue() == 1) {
                        showLoadMoreEmpty();
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        Serializable serializable;
        super.onCreate(bundle);
        boolean z = true;
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            i = 1;
        }
        this.LLILZLL = i;
        if (getArguments() != null) {
            i2 = getArguments().getInt("sound_page_scene");
        } else {
            i2 = 0;
        }
        this.LLJILLL = i2;
        if (getArguments() == null || !getArguments().getBoolean("is_unlimited_only")) {
            z = false;
        }
        this.LLJJ = z;
        if (getArguments() != null && (serializable = getArguments().getSerializable("recommend_extra")) != null && (serializable instanceof Map)) {
            this.LLJJI = (Map) serializable;
        }
        if (getArguments() == null) {
            this.LLJILJIL = 0L;
            this.LLJILJILJ = 0L;
        } else {
            this.LLJILJIL = getArguments().getLong("max_video_duration", 0L);
            this.LLJILJILJ = getArguments().getLong("shoot_video_length", 0L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        C15HB c15hb;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/choosemusic/fragment/BaseDiscoverMusicFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f32JIl4WAL/1caAPQ6v3lDxuWTwWsmcyFvVx1WhyVStJHSc4=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (this.LL != null && z && (c15hb = this.LLILZIL) != null) {
            c15hb.LLLI(true);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        C19GS c19gs;
        if (C15GL.LIZ()) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.c8e, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.c96, viewGroup, false);
        }
        this.LL = (RecyclerView) viewTd.findViewById(R.id.ms7);
        this.LLILLJJLI = (C1749280vcc) viewTd.findViewById(R.id.w28);
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
