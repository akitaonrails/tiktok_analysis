package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.AbstractC683510QrV;
import X.AnonymousClass1549;
import X.C0P6P;
import X.C1250250idj;
import X.C15GO;
import X.C15GU;
import X.C15HO;
import X.C15IK;
import X.C15O7;
import X.C20448614zs;
import X.C20449014zw;
import X.C204594153w;
import X.C20491015Ga;
import X.C20494715Hl;
import X.C20749016Hg;
import X.InterfaceC20492315Gn;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public class HotMusicListFragment extends BaseMusicListFragment<C20448614zs> implements C15GU<Music>, C0P6P {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgLSg5HELIOSOiYwZiM+KCg+LSs4Zwc8PAg5OiYwBCw/PQkhKSIhLCEn";

    @Override // X.InterfaceC20492515Gp
    public final String LJLI() {
        return "hot_music_list_data";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final String OR() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final boolean PR() {
        return true;
    }

    @Override // X.InterfaceC20492515Gp
    public final String R3() {
        return "loadmore_status_hot_music_list";
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
        return 0;
    }

    @Override // X.InterfaceC20492515Gp
    public final String vu() {
        return "refresh_status_hot_music_list";
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        DataCenter dataCenter;
        InterfaceC20492315Gn<T> interfaceC20492315Gn = this.LLIZLLLIL;
        if (interfaceC20492315Gn != 0) {
            interfaceC20492315Gn.showLoadMoreLoading();
        }
        if (this.LLILZIL == null || (dataCenter = this.LLILZLL) == null) {
            return;
        }
        C20449014zw c20449014zw = (C20449014zw) dataCenter.get("hot_music_list_data");
        C204594153w c204594153w = this.LLILZIL;
        int iIntValue = ((Integer) c20449014zw.LIZ("list_cursor")).intValue();
        int i = this.LLJ;
        if (c204594153w.LJIIIZ) {
            return;
        }
        c204594153w.LJIIIZ = true;
        AnonymousClass1549.LIZ(iIntValue, 20, false, "", "panel-hot", c204594153w.LJFF(i, null)).LJ(new C20749016Hg(c204594153w, 11), C15O7.LJIIIIZZ, null);
    }

    @Override // X.C15GU
    public final void refreshData() {
        C204594153w c204594153w = this.LLILZIL;
        if (c204594153w != null) {
            c204594153w.LJIIJ(this.LLJ);
        }
    }

    @Override // X.C15GU
    public final void LJIJ() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC20492515Gp
    public final void initData() {
        super.initData();
        this.LLILZIL.LJIIJ(this.LLJ);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC20492315Gn<C20448614zs> MR(View view) {
        C20491015Ga c20491015Ga;
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ()) {
            c20491015Ga = new C20491015Ga(getContext(), view, this, 2131829274, this, this, this.LLJJI, this.LLJILLL);
            String string = c20491015Ga.LJ.getString(2131837789);
            TuxNavBar tuxNavBar = c20491015Ga.LIZ;
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = string;
            tuxNavBar.LJIJJ(c1250250idj);
            AbstractC683510QrV abstractC683510QrV = c20491015Ga.LJFF;
            abstractC683510QrV.setShowFooter(true);
            if (abstractC683510QrV instanceof C20494715Hl) {
                ((C20494715Hl) abstractC683510QrV).LLJJLIIIJLLLLLLLZ = true;
            }
            c20491015Ga.LJIIL = true;
        } else {
            Context context = getContext();
            int i = this.LLJJI;
            c20491015Ga = new C20491015Ga(context, view, this, 2131838159, this, this, i, i, this.LLJILLL);
            String string2 = c20491015Ga.LJ.getString(2131845823);
            TuxNavBar tuxNavBar2 = c20491015Ga.LIZ;
            C1250250idj c1250250idj2 = new C1250250idj();
            c1250250idj2.LIZJ = string2;
            tuxNavBar2.LJIJJ(c1250250idj2);
            AbstractC683510QrV abstractC683510QrV2 = c20491015Ga.LJFF;
            if (abstractC683510QrV2 instanceof C20494715Hl) {
                ((C20494715Hl) abstractC683510QrV2).LLJI = true;
            }
        }
        c20491015Ga.LJIIIIZZ(this);
        c20491015Ga.LJII(this);
        c20491015Ga.LJIIJ(new Pair<>(Long.valueOf(this.LLJIJIL), Long.valueOf(this.LLJILJIL)));
        if (getContext() != null) {
            C15HO c15ho = new C15HO("change_music_page_detail", getContext().getString(2131845823), "click_more", C15IK.LIZ);
            c15ho.LIZIZ("recommend_mc_id");
            c20491015Ga.LJIIIZ(c15ho);
        }
        c20491015Ga.LIZLLL(new C15GO() { // from class: X.15GZ
            @Override // X.C15GO
            public final void LIZ() {
                this.LIZ.LJJIFFI();
            }
        }, 10);
        return c20491015Ga;
    }

    @Override // X.C15GU
    public final /* bridge */ /* synthetic */ void P0(Object obj) {
    }

    public static HotMusicListFragment VR(int i, int i2, int i3, long j, long j2) {
        HotMusicListFragment hotMusicListFragment = new HotMusicListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        bundle.putInt("sound_page_scene", i2);
        bundle.putLong("max_video_duration", j);
        bundle.putLong("shoot_video_length", j2);
        bundle.putInt("music_discovery_type", i3);
        hotMusicListFragment.setArguments(bundle);
        return hotMusicListFragment;
    }
}
