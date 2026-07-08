package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.AbstractC21673619ry;
import X.AbstractC683510QrV;
import X.AbstractC683590Qrd;
import X.AnonymousClass1546;
import X.C086I;
import X.C0P6P;
import X.C0PEM;
import X.C0RD4;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C14EU;
import X.C15GO;
import X.C15GR;
import X.C15GU;
import X.C15GV;
import X.C15GW;
import X.C15H0;
import X.C15HO;
import X.C15HY;
import X.C15IK;
import X.C15O7;
import X.C20320114f9;
import X.C20438214yC;
import X.C20448614zs;
import X.C20449014zw;
import X.C204594153w;
import X.C204665156p;
import X.C20493315Gx;
import X.C20494715Hl;
import X.C20533215Wg;
import X.C20749016Hg;
import X.C2200821BBo;
import X.C2296808zG;
import X.C23250099c;
import X.C629770On1;
import X.InterfaceC1258040iqI;
import X.InterfaceC20492315Gn;
import Y.AObjectS405S0100000_31;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes32.dex */
public class CollectMusicFragment extends BaseMusicListFragment<C20448614zs> implements InterfaceC1258040iqI, C15GU<Music>, C0P6P {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgLSg5HELIOSOiYwZiM+KCg+LSs4Zww8JCkpKjsePTYlKgkhKSIhLCEn";
    public C15HO LLJJIII;
    public BaseNewMusicTabFragment LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C204665156p LLJJIJIL = new C204665156p();

    @Override // X.C15GU
    public final void LJIJ() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final String OR() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final boolean PR() {
        return false;
    }

    @Override // X.InterfaceC20492515Gp
    public final String R3() {
        return "loadmore_status_user_collected_music";
    }

    @Override // X.C15GU
    public final void b1() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int getLayoutId() {
        return R.layout.c97;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int getPageType() {
        return 1;
    }

    @Override // X.InterfaceC20492515Gp
    public final String vu() {
        return "refresh_status_user_collected_music";
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        DataCenter dataCenter;
        DataCenter dataCenter2;
        if (this.LLJJIJIIJIL && (dataCenter2 = this.LLILZLL) != null) {
            C20449014zw c20449014zw = (C20449014zw) dataCenter2.get(LJLI());
            InterfaceC20492315Gn<T> interfaceC20492315Gn = this.LLIZLLLIL;
            if ((interfaceC20492315Gn instanceof C15GR) && ((C15GR) interfaceC20492315Gn).LJIIJJI) {
                if (interfaceC20492315Gn != 0) {
                    interfaceC20492315Gn.showLoadMoreLoading();
                }
                if (c20449014zw != null && (c20449014zw.LIZ("list_cursor") instanceof Integer)) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C20438214yC(((Integer) c20449014zw.LIZ("list_cursor")).intValue(), this.LLILZLL, null), 3);
                }
            }
        }
        if (this.LLILZIL == null || (dataCenter = this.LLILZLL) == null) {
            return;
        }
        C20449014zw c20449014zw2 = (C20449014zw) dataCenter.get(LJLI());
        InterfaceC20492315Gn<T> interfaceC20492315Gn2 = this.LLIZLLLIL;
        if ((interfaceC20492315Gn2 instanceof C15GR) && ((C15GR) interfaceC20492315Gn2).LJIIJJI) {
            if (interfaceC20492315Gn2 != 0) {
                interfaceC20492315Gn2.showLoadMoreLoading();
            }
            if (c20449014zw2 != null) {
                C204594153w c204594153w = this.LLILZIL;
                int iIntValue = ((Integer) c20449014zw2.LIZ("list_cursor")).intValue();
                int i = this.LLJ;
                if (c204594153w.LJIIIIZZ) {
                    return;
                }
                c204594153w.LJIIIIZZ = true;
                Executor executor = C15O7.LJIIIIZZ;
                if (AnonymousClass1546.LIZ()) {
                    executor = C15O7.LJI;
                }
                IFavoriteService iFavoriteService = c204594153w.LJ;
                ChooseMusicApi.LJIIIIZZ(iIntValue, i, (iFavoriteService == null || !iFavoriteService.LJJIL()) ? CardStruct.IStatusCode.DEFAULT : "1").LJ(new C20749016Hg(c204594153w, 16), executor, null);
            }
        }
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        Object obj = this.LLIZLLLIL;
        if (obj == null) {
            return null;
        }
        return ((C15GR) obj).LIZIZ;
    }

    @Override // X.InterfaceC20492515Gp
    public final String LJLI() {
        return this.LLJJIJIIJIL ? "user_collected_unlimited_music_list" : "user_collected_music_list";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final AbstractC21673619ry NR() {
        InterfaceC20492315Gn<T> interfaceC20492315Gn = this.LLIZLLLIL;
        if (interfaceC20492315Gn != 0) {
            return interfaceC20492315Gn.LJJLIIIJL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLJJIJIL.LIZ();
        super.onDestroyView();
    }

    @Override // X.C15GU
    public final void refreshData() {
        DataCenter dataCenter;
        if (this.LLJJIJIIJIL && (dataCenter = this.LLILZLL) != null) {
            C20320114f9.LIZ(dataCenter, getContext(), false);
            return;
        }
        C204594153w c204594153w = this.LLILZIL;
        if (c204594153w != null) {
            c204594153w.LJIIL(this.LLJ, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC20492515Gp
    public final DataCenter bm() {
        DataCenter dataCenterBm = super.bm();
        this.LLILZLL = dataCenterBm;
        dataCenterBm.yQ2("music_collect_status", this, false);
        dataCenterBm.yQ2("music_index", this, false);
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC20492515Gp
    public final void initData() {
        super.initData();
        if (this.LLJJIJIIJIL) {
            C20320114f9.LIZ(this.LLILZLL, getContext(), false);
        } else {
            this.LLILZIL.LJIIL(this.LLJ, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC20492315Gn<C20448614zs> MR(final View view) {
        final Context context = getContext();
        final int i = this.LLJJI;
        final boolean z = this.LLJJIJIIJIL;
        C15GV c15gv = new C15GV(context, view, this, this, this, i, z) { // from class: X.15GW
            public final boolean LJIJ;

            @Override // X.C15GV, X.C15GR
            public final void LJ() {
                super.LJ();
                Context context2 = this.LIZJ.getContext();
                if (!this.LJIJ) {
                    C1722300uv6 c1722300uv6 = new C1722300uv6();
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_bookmark;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                    c1722300uv6.LIZJ = 0;
                    c1722300uv6.LIZIZ = c419910GdJ;
                    c1722300uv6.LJI = context2.getString(2131845866);
                    c1722300uv6.LJIIIIZZ = context2.getString(2131845865);
                    this.LIZJ.setStatus(c1722300uv6);
                    return;
                }
                C1722300uv6 c1722300uv62 = new C1722300uv6();
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_large_empty_box;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
                c419910GdJ2.LIZLLL = Integer.valueOf(R.attr.a1k);
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
                c1722300uv62.LIZJ = 0;
                c1722300uv62.LIZIZ = c419910GdJ2;
                c1722300uv62.LJI = context2.getString(2131837626);
                c1722300uv62.LJIIIIZZ = context2.getString(2131837625);
                this.LIZJ.setStatus(c1722300uv62);
            }

            {
                this.LJIJ = z;
            }
        };
        AbstractC683510QrV abstractC683510QrV = c15gv.LJFF;
        if (abstractC683510QrV instanceof C20494715Hl) {
            ((C20494715Hl) abstractC683510QrV).LL = this;
        }
        Pair<Long, Long> pair = new Pair<>(Long.valueOf(this.LLJIJIL), Long.valueOf(this.LLJILJIL));
        AbstractC683510QrV abstractC683510QrV2 = c15gv.LJFF;
        boolean z2 = abstractC683510QrV2 instanceof C20494715Hl;
        if (z2) {
            ((C20494715Hl) abstractC683510QrV2).LLILZ = pair;
        }
        C15H0 c15h0 = new C15H0() { // from class: X.15GX
            @Override // X.C15H0
            public final void Dl0(C15IZ c15iz) {
                BaseNewMusicTabFragment baseNewMusicTabFragment = this.LL.LLJJIJI;
                if (baseNewMusicTabFragment != null) {
                    baseNewMusicTabFragment.Dl0(c15iz);
                }
            }

            @Override // X.C15H0
            public final void p8(MusicModel musicModel) {
                BaseNewMusicTabFragment baseNewMusicTabFragment = this.LL.LLJJIJI;
                if (baseNewMusicTabFragment != null) {
                    baseNewMusicTabFragment.p8(musicModel);
                }
            }

            @Override // X.C15H0
            public final void ru(MusicModel musicModel) {
                BaseNewMusicTabFragment baseNewMusicTabFragment = this.LL.LLJJIJI;
                if (baseNewMusicTabFragment != null) {
                    baseNewMusicTabFragment.ru(musicModel);
                }
            }

            @Override // X.C15H0
            public final void cJ(MusicModel musicModel, C15HO c15ho) {
                BaseNewMusicTabFragment baseNewMusicTabFragment = this.LL.LLJJIJI;
                if (baseNewMusicTabFragment != null) {
                    baseNewMusicTabFragment.cJ(musicModel, c15ho);
                }
                if (((Integer) this.LL.LLILZLL.get("music_position", -1)).intValue() == -2) {
                    this.LL.LLILZLL.zQ2(-1, "music_position");
                    this.LL.LLILZLL.zQ2(-1, "music_index");
                }
            }
        };
        if (z2) {
            ((C20494715Hl) abstractC683510QrV2).LLILLJJLI = c15h0;
        }
        C15HO c15ho = new C15HO("change_music_page", "favorite_song", "", C15IK.LIZ);
        this.LLJJIII = c15ho;
        c15ho.LJIILIIL = "favorite";
        if (z2) {
            ((C20494715Hl) abstractC683510QrV2).LLIZLLLIL = c15ho;
        }
        if (abstractC683510QrV2 instanceof C20494715Hl) {
            ((C20494715Hl) abstractC683510QrV2).LLJILJIL = false;
        }
        c15gv.LIZLLL(new C15GO() { // from class: X.15GY
            @Override // X.C15GO
            public final void LIZ() {
                this.LIZ.LJJIFFI();
            }
        }, 10);
        boolean zBooleanValue = ((Boolean) this.LLILZLL.get("key_show_lyric_tag")).booleanValue();
        AbstractC683510QrV abstractC683510QrV3 = c15gv.LJFF;
        boolean z3 = abstractC683510QrV3 instanceof C20494715Hl;
        if (z3) {
            C20494715Hl c20494715Hl = (C20494715Hl) abstractC683510QrV3;
            if (c20494715Hl != null) {
                c20494715Hl.LLJJJJLIIL = zBooleanValue;
            }
            if (z3) {
                C204665156p c204665156p = this.LLJJIJIL;
                RecyclerView recyclerView = c15gv.LIZIZ;
                AObjectS405S0100000_31 aObjectS405S0100000_31 = new AObjectS405S0100000_31(this, 6);
                c204665156p.LIZIZ = recyclerView;
                c204665156p.LIZJ = (C20494715Hl) abstractC683510QrV3;
                c204665156p.LIZLLL = aObjectS405S0100000_31;
                recyclerView.addOnChildAttachStateChangeListener(c204665156p.LJ);
                c204665156p.LIZLLL();
            }
        }
        return c15gv;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    /* JADX INFO: renamed from: RR */
    public final void onChanged(C0RD4 c0rd4) {
        RecyclerView recyclerView;
        super.onChanged(c0rd4);
        if (!isViewValid()) {
            return;
        }
        String str = c0rd4.LIZ;
        str.getClass();
        C20494715Hl c20494715Hl = null;
        if (!str.equals("music_collect_status")) {
            if (str.equals("music_index") && ((Integer) this.LLILZLL.get("music_position", -1)).intValue() == -2) {
                InterfaceC20492315Gn<T> interfaceC20492315Gn = this.LLIZLLLIL;
                if (interfaceC20492315Gn != 0) {
                    c20494715Hl = (C20494715Hl) interfaceC20492315Gn.LJJLIIIJL();
                }
                c20494715Hl.LLLIIIIL();
                return;
            }
            return;
        }
        Object obj = c0rd4.LIZIZ;
        if (obj == null) {
            obj = null;
        }
        C20493315Gx c20493315Gx = (C20493315Gx) obj;
        if (c20493315Gx.LIZ != 0) {
            return;
        }
        if (c20493315Gx.LIZLLL == 1) {
            MusicModel musicModel = c20493315Gx.LJ;
            InterfaceC20492315Gn<T> interfaceC20492315Gn2 = this.LLIZLLLIL;
            if (interfaceC20492315Gn2 == 0 || interfaceC20492315Gn2.LJJLIIIJL() == null) {
                return;
            }
            List<C20448614zs> data = this.LLIZLLLIL.LJJLIIIJL().getData();
            if (data == null) {
                data = new ArrayList<>();
            }
            for (int i = 0; i < data.size(); i++) {
                MusicModel musicModel2 = ((C20448614zs) ListProtector.get(data, i)).LIZIZ;
                if (musicModel2 != null && musicModel.getMusicId().equals(musicModel2.getMusicId())) {
                    VR(musicModel, data);
                    return;
                }
            }
            if (data.size() == 0) {
                data.add(new C20448614zs(0, musicModel, null, null));
                this.LLIZLLLIL.LLJJJIL(data, false);
                return;
            }
            VR(musicModel, data);
            boolean z = this.LLJJIJIIJIL;
            ListProtector.add(data, z ? 1 : 0, new C20448614zs(0, musicModel, null, null));
            this.LLIZLLLIL.LJJLIIIJL().notifyItemInserted(z ? 1 : 0);
            InterfaceC20492315Gn<T> interfaceC20492315Gn3 = this.LLIZLLLIL;
            if (!(interfaceC20492315Gn3 instanceof C15GR) || (recyclerView = ((C15GR) interfaceC20492315Gn3).LIZIZ) == null) {
                return;
            }
            recyclerView.scrollToPosition(z ? 1 : 0);
            return;
        }
        MusicModel musicModel3 = c20493315Gx.LJ;
        InterfaceC20492315Gn<T> interfaceC20492315Gn4 = this.LLIZLLLIL;
        if (interfaceC20492315Gn4 == 0 || interfaceC20492315Gn4.LJJLIIIJL() == null || this.LLIZLLLIL.LJJLIIIJL().getData() == null) {
            return;
        }
        List data2 = this.LLIZLLLIL.LJJLIIIJL().getData();
        IFavoriteService iFavoriteService = (IFavoriteService) PluggableExtentionKt.pluggableSpi(IFavoriteService.class);
        for (int i2 = 0; i2 < data2.size(); i2++) {
            MusicModel musicModel4 = ((C20448614zs) ListProtector.get(data2, i2)).LIZIZ;
            if (musicModel4 != null && musicModel3.getMusicId() != null) {
                if (iFavoriteService != null && iFavoriteService.LJJIL()) {
                    List<MusicModel> similarMusicList = musicModel4.getSimilarMusicList();
                    if (similarMusicList != null && !similarMusicList.isEmpty()) {
                        for (int i3 = 0; i3 < similarMusicList.size(); i3++) {
                            MusicModel musicModel5 = (MusicModel) ListProtector.get(similarMusicList, i3);
                            if (musicModel3.getMusicId().equals(musicModel5.getMusicId())) {
                                MusicModel.CollectionType collectionType = musicModel5.getCollectionType();
                                MusicModel.CollectionType collectionType2 = MusicModel.CollectionType.NOT_COLLECTED;
                                if (collectionType != collectionType2) {
                                    musicModel5.setCollectionType(collectionType2);
                                }
                            }
                        }
                    }
                    if (!musicModel3.getMusicId().equals(musicModel4.getMusicId())) {
                        return;
                    }
                    MusicModel.CollectionType collectionType3 = MusicModel.CollectionType.NOT_COLLECTED;
                    musicModel4.setCollectionType(collectionType3);
                    this.LLIZLLLIL.LJJLIIIJL().notifyItemChanged(i2, collectionType3);
                    return;
                }
                if (musicModel3.getMusicId().equals(musicModel4.getMusicId())) {
                    MusicModel.CollectionType collectionType4 = musicModel4.getCollectionType();
                    MusicModel.CollectionType collectionType5 = MusicModel.CollectionType.NOT_COLLECTED;
                    if (collectionType4 == collectionType5) {
                        return;
                    }
                    musicModel4.setCollectionType(collectionType5);
                    this.LLIZLLLIL.LJJLIIIJL().notifyItemChanged(i2, collectionType5);
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C0RD4 c0rd4) {
        onChanged(c0rd4);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = false;
        if (getArguments() != null && getArguments().getBoolean("get_unlimited_music_only", false)) {
            z = true;
        }
        this.LLJJIJIIJIL = z;
    }

    @C14EU
    public void onEvent(C629770On1 c629770On1) {
        DataCenter dataCenter = this.LLILZLL;
        if (dataCenter != null && c629770On1 != null) {
            dataCenter.zQ2(new C20493315Gx(0, c629770On1.LIZ, -1, -1, c629770On1.LIZIZ), "music_collect_status");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        RecyclerView recyclerView;
        MusicModel musicModel;
        boolean z2;
        Object obj;
        boolean zBooleanValue = z;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/choosemusic/fragment/CollectMusicFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(zBooleanValue)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f32JIl4WAL/1caALeiPchLxX8krDhaj9xNZUq/+x7", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(zBooleanValue);
        if (zBooleanValue) {
            if ((LJJLIIIJILLIZJL() instanceof RecyclerView) && (recyclerView = (RecyclerView) LJJLIIIJILLIZJL()) != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                AbstractC683590Qrd abstractC683590QrdLJJLIIIJL = this.LLIZLLLIL.LJJLIIIJL();
                if (abstractC683590QrdLJJLIIIJL != null) {
                    List data = abstractC683590QrdLJJLIIIJL.getData();
                    if (!C086I.LIZIZ(data)) {
                        for (int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
                            if (iFindFirstVisibleItemPosition >= 0 && iFindFirstVisibleItemPosition < data.size() && (musicModel = ((C20448614zs) ListProtector.get(data, iFindFirstVisibleItemPosition)).LIZIZ) != null && this.LLJJIII != null && musicModel.isRealMusicItem().booleanValue()) {
                                this.LLJJIII.LJIIIIZZ = musicModel.getLogPb();
                                C15HY c15hy = new C15HY(recyclerView, musicModel, iFindFirstVisibleItemPosition, 24);
                                C15HO c15ho = this.LLJJIII;
                                if (musicModel.getMatchedPGCSoundInfo() != null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                C15IK.LJIIL(c15hy, this, c15ho, musicModel, iFindFirstVisibleItemPosition, true, z2, null);
                            }
                        }
                    }
                }
            }
            this.LLJJIJIL.LIZLLL();
        }
        Object obj2 = this.LLIZLLLIL;
        if (obj2 instanceof C15GW) {
            AbstractC683510QrV abstractC683510QrV = ((C15GR) obj2).LJFF;
            if (abstractC683510QrV instanceof C20494715Hl) {
                ((C20494715Hl) abstractC683510QrV).LLJILJIL = zBooleanValue;
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && zBooleanValue) {
            C20533215Wg.LIZ(getClass());
        }
    }

    @Override // X.C15GU
    public final /* bridge */ /* synthetic */ void P0(Object obj) {
    }

    public final void VR(MusicModel musicModel, List<C20448614zs> list) {
        IFavoriteService iFavoriteService = (IFavoriteService) PluggableExtentionKt.pluggableSpi(IFavoriteService.class);
        if (iFavoriteService != null && iFavoriteService.LJJIL()) {
            for (int i = 0; i < list.size(); i++) {
                MusicModel musicModel2 = ((C20448614zs) ListProtector.get(list, i)).LIZIZ;
                if (musicModel2 != null && musicModel.getMusicId() != null) {
                    List<MusicModel> similarMusicList = musicModel2.getSimilarMusicList();
                    if (similarMusicList != null && !similarMusicList.isEmpty()) {
                        for (int i2 = 0; i2 < similarMusicList.size(); i2++) {
                            MusicModel musicModel3 = (MusicModel) ListProtector.get(similarMusicList, i2);
                            if (musicModel.getMusicId().equals(musicModel3.getMusicId())) {
                                MusicModel.CollectionType collectionType = musicModel3.getCollectionType();
                                MusicModel.CollectionType collectionType2 = MusicModel.CollectionType.COLLECTED;
                                if (collectionType != collectionType2) {
                                    musicModel3.setCollectionType(collectionType2);
                                }
                            }
                        }
                    }
                    if (musicModel.getMusicId().equals(musicModel2.getMusicId())) {
                        MusicModel.CollectionType collectionType3 = MusicModel.CollectionType.COLLECTED;
                        musicModel2.setCollectionType(collectionType3);
                        this.LLIZLLLIL.LJJLIIIJL().notifyItemChanged(i, collectionType3);
                    }
                }
            }
        }
    }
}
