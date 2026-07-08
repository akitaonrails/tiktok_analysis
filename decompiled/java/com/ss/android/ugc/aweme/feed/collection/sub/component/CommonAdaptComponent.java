package com.ss.android.ugc.aweme.feed.collection.sub.component;

import X.C01GW;
import X.C0RF0;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1AF0;
import X.C2217381BqS;
import X.C293880BfW;
import X.C299590Boj;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690430R6j;
import X.C690870R8b;
import X.C692910RFx;
import X.C723580SZw;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.CommonAdapterAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class CommonAdaptComponent extends BaseCellContentComponent<CommonAdaptComponent> implements CommonAdapterAbility {
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 331));
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(104));
    public final C01GW LLJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(168));
    public final C630740Ooa LLJLILLLLZIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 334));
    public final C630740Ooa LLJLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 332));
    public final C630740Ooa LLJLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 333));

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.ability.CommonAdapterAbility
    public final void Ds1() {
        C690870R8b c690870R8b;
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
            c690870R8b = new C690870R8b();
            if (C299590Boj.LIZ()) {
                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                c690870R8b.LIZIZ = "cell_unknown";
            }
        }
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        if (c0rf0 == null || this.LLJJJJLIIL.getValue() == null || !C293880BfW.LIZIZ) {
            return;
        }
        BaseFeedPageParams baseFeedPageParams = c0rf0.LJ;
        int i = baseFeedPageParams.videoHeight;
        int i2 = baseFeedPageParams.videoWidth;
        CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LLJJJJLIIL.getValue();
        if (cellAdaptionComponentAbility != null) {
            Context context = c0rf0.LIZ.getContext();
            IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJLL.getValue();
            cellAdaptionComponentAbility.M72(context, iVideoCellAbility != null ? iVideoCellAbility.getVideoView() : null, Integer.valueOf(i2), Integer.valueOf(i), this.LLJJLIIIJLLLLLLLZ, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, CommonAdapterAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.ability.CommonAdapterAbility
    public final void LJJIJLIJ() {
        CellAdaptionComponentAbility cellAdaptionComponentAbility;
        Context context = getContext();
        if (context != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme() != null) {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getVideo() != null) {
                    CellAdaptionComponentAbility cellAdaptionComponentAbility2 = (CellAdaptionComponentAbility) this.LLJJJJLIIL.getValue();
                    if (cellAdaptionComponentAbility2 != null) {
                        C724270Sb3 c724270Sb33 = this.LLJI;
                        Aweme aweme = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme();
                        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJLL.getValue();
                        View videoView = iVideoCellAbility != null ? iVideoCellAbility.getVideoView() : null;
                        IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) this.LLJLL.getValue();
                        View viewVy1 = iVideoCellAbility2 != null ? iVideoCellAbility2.Vy1() : null;
                        C724270Sb3 c724270Sb34 = this.LLJI;
                        cellAdaptionComponentAbility2.CX1(context, aweme, videoView, viewVy1, AwemeExtKt.getOcrLocation(((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).getAweme()), this.LLJJLIIIJLLLLLLLZ);
                    }
                    C724270Sb3 c724270Sb35 = this.LLJI;
                    Aweme aweme2 = ((VideoItemParams) (c724270Sb35 != null ? c724270Sb35.LL : null)).getAweme();
                    String aid = aweme2 != null ? aweme2.getAid() : null;
                    C724270Sb3 c724270Sb36 = this.LLJI;
                    Aweme aweme3 = ((VideoItemParams) (c724270Sb36 != null ? c724270Sb36.LL : null)).getAweme();
                    C692910RFx.LJII(aid, aweme3 != null ? aweme3.getVideo() : null, this.LLJJLIIIJLLLLLLLZ);
                    FrameLayout frameLayout = this.LLJL;
                    FrameLayout frameLayout2 = this.LLJJLIIIJLLLLLLLZ;
                    if (frameLayout == null || frameLayout2 == null || (cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LLJJJJLIIL.getValue()) == null) {
                        return;
                    }
                    C724270Sb3 c724270Sb37 = this.LLJI;
                    Aweme aweme4 = ((VideoItemParams) (c724270Sb37 != null ? c724270Sb37.LL : null)).getAweme();
                    C724270Sb3 c724270Sb38 = this.LLJI;
                    Aweme aweme5 = ((VideoItemParams) (c724270Sb38 != null ? c724270Sb38.LL : null)).getAweme();
                    cellAdaptionComponentAbility.FH1(context, aweme4, frameLayout, aweme5 != null ? AwemeExtKt.getOcrLocation(aweme5) : null, frameLayout2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, CommonAdapterAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (FrameLayout) view.findViewById(R.id.player_view);
        this.LLJL = (FrameLayout) view.findViewById(R.id.kvf);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.0R8A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, null, AFwS294S0000000_11.get$arr$(70), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        C692910RFx c692910RFx = (C692910RFx) this.LLJJL.getValue();
        c692910RFx.LIZJ = -1;
        c692910RFx.LIZIZ = -1;
    }
}
