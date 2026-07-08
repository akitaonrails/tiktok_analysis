package com.ss.android.ugc.aweme.mix.videodetail;

import X.C0HTT;
import X.C0R9L;
import X.C0SR4;
import X.C0T1Q;
import X.C0T21;
import X.C1169240gX4;
import X.C128Y;
import X.C1612510s41;
import X.C1612570s47;
import X.C1612610s4B;
import X.C2189821An6;
import X.C292410Bd9;
import X.C297010BkZ;
import X.C581630MrZ;
import X.C714460S0u;
import X.C718550SGn;
import X.C735370Ssx;
import X.InterfaceC469360Ias;
import X.InterfaceC583830Mv7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.service.ISeriesCommonETService;
import com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponentTemp;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class MixVideoPlayDetailPageFragmentPanel extends DetailFragmentPanel implements C0T1Q {
    public final C1169240gX4 A0;
    public String B0;
    public boolean C0;
    public int D0;
    public long E0;
    public int F0;
    public final String z0;

    @Override // X.C0T1Q
    public final void LJIILIIL() {
        this.LLLLIL.LIZIZ(this.B0);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLJJLIIIJLLLLLLLZ() {
        LJIIZILJ("touching_screen");
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC1212360hec
    public final void Jm() {
        if (C297010BkZ.LIZ()) {
            return;
        }
        super.Jm();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onDestroy() {
        super.onDestroy();
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null) {
            iSeriesCommonETServiceLIZ.removeSeriesContext(String.valueOf(hashCode()));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onResume() throws Throwable {
        super.onResume();
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null) {
            iSeriesCommonETServiceLIZ.pushSeriesContext(new C1612610s4B(String.valueOf(hashCode()), new C1612510s41(false, false, false, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 1073741823)));
        }
    }

    @Override // X.C0T1Q
    public final void LJIIZILJ(String str) {
        String mixId;
        int iIntValue;
        PlayListInfo playListInfo;
        Integer index;
        PlayListInfo playListInfo2;
        if (!this.C0) {
            return;
        }
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ == null || (playListInfo2 = awemeLJIIIIZZ.playlist_info) == null || (mixId = playListInfo2.getMixId()) == null) {
            mixId = "";
        }
        Aweme awemeLJIIIIZZ2 = LJIIIIZZ();
        if (awemeLJIIIIZZ2 != null && (playListInfo = awemeLJIIIIZZ2.playlist_info) != null && (index = playListInfo.getIndex()) != null) {
            iIntValue = index.intValue();
        } else {
            iIntValue = 0;
        }
        this.C0 = false;
        this.D0 = 0;
        ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIJIIJI(iIntValue, getEventType(), this.z0, mixId, xy2(), System.currentTimeMillis() - this.E0, C735370Ssx.LIZLLL(LJIIIIZZ()), str);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void LJJIJIIJI(String str) {
        super.LJJIJIIJI(str);
        this.F0++;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLLL(C2189821An6 c2189821An6) {
        super.LLLL(c2189821An6);
        this.LLLLIL.LIZIZ(this.B0);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void c0(List<? extends Aweme> list) {
        d0(list, false);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onPageScrollStateChanged(int i) {
        super.onPageScrollStateChanged(i);
        if (i == 1) {
            LJIIZILJ("touching_screen");
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onVideoPlayerEvent(C581630MrZ c581630MrZ) {
        Integer numValueOf;
        String str;
        String mixId;
        int iIntValue;
        InterfaceC583830Mv7 interfaceC583830Mv7;
        InterfaceC583830Mv7 interfaceC583830Mv72;
        PlayListInfo playListInfo;
        Integer index;
        PlayListInfo playListInfo2;
        super.onVideoPlayerEvent(c581630MrZ);
        if (c581630MrZ != null && (numValueOf = Integer.valueOf(c581630MrZ.LIZ)) != null && numValueOf.intValue() == 7 && c581630MrZ != null && (str = c581630MrZ.LIZIZ) != null) {
            Aweme awemeLJIIIIZZ = LJIIIIZZ();
            if (awemeLJIIIIZZ == null || (playListInfo2 = awemeLJIIIIZZ.playlist_info) == null || (mixId = playListInfo2.getMixId()) == null) {
                mixId = "";
            }
            Aweme awemeLJIIIIZZ2 = LJIIIIZZ();
            if (awemeLJIIIIZZ2 != null && (playListInfo = awemeLJIIIIZZ2.playlist_info) != null && (index = playListInfo.getIndex()) != null) {
                iIntValue = index.intValue();
            } else {
                iIntValue = -1;
            }
            int i = iIntValue + 1;
            if (this.LLJJIJI.getScrollState() != 1 && !this.LLLLZI && !this.H.LLILZIL) {
                C128Y fragment = getFragment();
                if (fragment instanceof InterfaceC583830Mv7) {
                    interfaceC583830Mv7 = (InterfaceC583830Mv7) fragment;
                } else {
                    interfaceC583830Mv7 = null;
                }
                if ((interfaceC583830Mv7 != null && interfaceC583830Mv7.rt()) || this.LLJL == null) {
                    return;
                }
                C128Y fragment2 = getFragment();
                if (!(fragment2 instanceof InterfaceC583830Mv7) || (interfaceC583830Mv72 = (InterfaceC583830Mv7) fragment2) == null) {
                    return;
                }
                interfaceC583830Mv72.EJ();
                int iLJIILJJIL = this.LLJL.LJIILJJIL(str);
                if (iLJIILJJIL == -1) {
                    return;
                }
                int i2 = iLJIILJJIL + 1;
                if (i2 < this.LLJL.getCount()) {
                    this.LLJJIJI.setIsTriggerByAutoPlay(true);
                    this.LLJLILLLLZIIL = i2;
                    this.B0 = "auto";
                    this.LLJJIJI.LJJIJLIJ(i2, true);
                    this.LLJJIJI.setIsTriggerByAutoPlay(false);
                    if (this.C0) {
                        return;
                    }
                    this.C0 = true;
                    this.E0 = System.currentTimeMillis();
                    ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJIILLIIL(getEventType(), i, this.D0, this.z0, mixId, xy2(), C735370Ssx.LIZLLL(LJIIIIZZ()));
                    return;
                }
                if (!this.C0) {
                    return;
                }
                LJIIZILJ("last_episode");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onViewCreated(View view, Bundle bundle) {
        String sourceVideoId;
        String sourceGroupId;
        String sourceAuthorId;
        super.onViewCreated(view, bundle);
        VerticalViewPager verticalViewPager = this.LLJJIJI;
        if (verticalViewPager != null) {
            verticalViewPager.LIZJ(new InterfaceC469360Ias() { // from class: X.0h74
                public boolean LL;

                @Override // X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                    if (i != 0) {
                        if (i == 1) {
                            this.LL = true;
                            return;
                        }
                        return;
                    }
                    this.LL = false;
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    if (this.LL) {
                        this.LLILLJJLI.B0 = "slide";
                    }
                }
            });
        }
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null) {
            String strValueOf = String.valueOf(hashCode());
            C1169240gX4 c1169240gX4 = this.A0;
            if (c1169240gX4 != null) {
                sourceVideoId = c1169240gX4.getSourceVideoId();
            } else {
                sourceVideoId = null;
            }
            C1169240gX4 c1169240gX42 = this.A0;
            if (c1169240gX42 != null) {
                sourceGroupId = c1169240gX42.getSourceGroupId();
            } else {
                sourceGroupId = null;
            }
            C1169240gX4 c1169240gX43 = this.A0;
            if (c1169240gX43 != null) {
                sourceAuthorId = c1169240gX43.getSourceAuthorId();
            } else {
                sourceAuthorId = null;
            }
            iSeriesCommonETServiceLIZ.setCommonETParams(new C1612610s4B(strValueOf, new C1612510s41(false, false, false, null, null, false, false, false, null, null, null, null, new C1612570s47(sourceVideoId, sourceGroupId, sourceAuthorId, null, null, "", "", "", ""), null, null, null, null, null, null, false, null, null, null, null, 1073733631)));
        }
        this.LLJJIJIIJIL.Bv0(new C0T21() { // from class: X.0T20
            {
                super(null);
            }

            @Override // X.C0T21, X.InterfaceC1616070s9l
            public final void onPageScrolledEnd(int i, float f, int i2) {
                Aweme aweme;
                PlayButtonComponentTemp playButtonComponentTemp;
                if (this.LLILLJJLI.getPlayerManager().isPaused()) {
                    C0SZ8 c0sz8LJLIL = this.LLILLJJLI.LLJJIJIIJIL.LJLIL();
                    if (c0sz8LJLIL != null) {
                        aweme = c0sz8LJLIL.getAweme();
                    } else {
                        aweme = null;
                    }
                    if (!C10IT.LJIIJJI(aweme) && (playButtonComponentTemp = this.LLILLJJLI.LLJI) != null) {
                        playButtonComponentTemp.z32(playButtonComponentTemp.Fb0());
                        View viewSR0 = playButtonComponentTemp.sR0();
                        if (viewSR0 != null) {
                            C786410Ut5.LJLLLLLL(0, viewSR0);
                        }
                    }
                }
            }
        });
    }

    public MixVideoPlayDetailPageFragmentPanel(String str, C2189821An6 c2189821An6, C1169240gX4 c1169240gX4) {
        super(c2189821An6);
        this.z0 = str;
        this.A0 = c1169240gX4;
        this.B0 = "enter";
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final C0SR4 LJJLIIIJLJLI(final Context context, final LayoutInflater layoutInflater, final C0HTT c0htt, final Fragment fragment, final C714460S0u c714460S0u, final BaseFeedPageParams baseFeedPageParams, final C0R9L c0r9l) {
        if (!C292410Bd9.LIZ) {
            return super.LJJLIIIJLJLI(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l);
        }
        return new C0SR4(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l) { // from class: X.0Ryd
            @Override // X.C0SR4
            public final String LJJJLIIL() {
                return "playlist";
            }

            @Override // X.C0SR4
            public final Collection LJJJJJ() {
                return (Collection) C713420Rye.LIZ.getValue();
            }
        };
    }
}
