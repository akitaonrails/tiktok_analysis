package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.music.ui;

import X.C03IJ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723830SaL;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC583720Muw;
import X.InterfaceC652490PiZ;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.ui.BaseAggregatedVideoRootAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.music.viewmodel.MusicAggregatedVideoRootViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MusicAggregatedVideoRootAssem extends BaseAggregatedVideoRootAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public FrameLayout LLJLIL;
    public FrameLayout LLJLILLLLZIIL;
    public SearchComponentCenter$Player$PlayerControlAbility LLJLL;
    public final AssemVMLazy LLJLLIL;
    public AnimatorSet LLJLLL;
    public AnimatorSet LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicAggregatedVideoRootAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/search/pages/result/topsearch/aggregatedvideo/music/viewmodel/MusicAggregatedVideoRootViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicAggregatedVideoRootAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicAggregatedVideoRootViewModel.class);
        this.LLJLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 596), AFwS236S0000000_6.get$arr$(297), null, true);
        this.LLJLLL = new AnimatorSet();
        this.LLJZ = new AnimatorSet();
    }

    public final MusicAggregatedVideoRootViewModel sp() {
        AssemVMLazy assemVMLazy = this.LLJLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
        return (MusicAggregatedVideoRootViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.ui.BaseAggregatedVideoRootAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJLIIIJLLLLLLLZ = (FrameLayout) view.findViewById(R.id.video_player_container);
        this.LLJL = (FrameLayout) view.findViewById(R.id.video_shoot_container);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.video_like_count_container);
        this.LLJLIL = frameLayout;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.video_tag_container);
        this.LLJLILLLLZIIL = frameLayout2;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(0, frameLayout2);
        }
        C723830SaL.LIZ(this, null, new AwS585S0100000_6(this, 160));
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.019B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C232600v6) obj).LL;
            }
        }, null, new AwS620S0100000_6(this, 133), 6);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.ui.BaseAggregatedVideoRootAssem
    /* JADX INFO: renamed from: op */
    public final void up(InterfaceC652490PiZ interfaceC652490PiZ) {
        if (interfaceC652490PiZ.LIZ().needShowShootBtn()) {
            SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchComponentCenter$Player$PlayerControlAbility.class, null);
            if (searchComponentCenter$Player$PlayerControlAbility != null) {
                this.LLJLL = searchComponentCenter$Player$PlayerControlAbility;
                searchComponentCenter$Player$PlayerControlAbility.Im2(new InterfaceC583720Muw() { // from class: X.05Me
                    @Override // X.InterfaceC583720Muw
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC583720Muw
                    public final void LJII() {
                    }

                    @Override // X.InterfaceC583720Muw
                    public final void onBuffering(boolean z) {
                    }

                    @Override // X.InterfaceC583720Muw
                    public final void onLoading() {
                    }

                    @Override // X.InterfaceC583720Muw
                    public final void onPause() {
                    }

                    @Override // X.InterfaceC583720Muw
                    public final void LIZ() {
                        this.LIZ.sp().vQ2();
                    }

                    @Override // X.InterfaceC583720Muw
                    public final void LIZJ() {
                        this.LIZ.sp().vQ2();
                    }

                    @Override // X.InterfaceC583720Muw
                    public final void LJJZ() {
                        FrameLayout frameLayout = this.LIZ.LLJL;
                        if (frameLayout == null || frameLayout.getVisibility() != 0) {
                            MusicAggregatedVideoRootViewModel musicAggregatedVideoRootViewModelSp = this.LIZ.sp();
                            musicAggregatedVideoRootViewModelSp.LLILZ = true;
                            musicAggregatedVideoRootViewModelSp.LLILLL = System.currentTimeMillis();
                            C238400w2 c238400w2 = new C238400w2();
                            long j = 3000 - musicAggregatedVideoRootViewModelSp.LLILLJJLI;
                            c238400w2.element = j;
                            if (j < 0) {
                                c238400w2.element = 0L;
                            }
                            musicAggregatedVideoRootViewModelSp.LL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(musicAggregatedVideoRootViewModelSp), C0PEM.LIZJ, null, new C05G5(c238400w2, musicAggregatedVideoRootViewModelSp, null), 2);
                        }
                    }
                });
                return;
            }
            return;
        }
        FrameLayout frameLayout = this.LLJL;
        if (frameLayout == null) {
            return;
        }
        C786410Ut5.LJZ(8, frameLayout);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.ui.BaseAggregatedVideoRootAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC652490PiZ interfaceC652490PiZ) {
        up(interfaceC652490PiZ);
    }
}
