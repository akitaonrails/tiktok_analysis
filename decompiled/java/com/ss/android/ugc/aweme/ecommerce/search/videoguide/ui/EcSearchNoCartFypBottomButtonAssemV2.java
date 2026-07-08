package com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui;

import X.C01GW;
import X.C123100dR;
import X.C13LE;
import X.C1558520qew;
import X.C1744700vVE;
import X.C1770220wAO;
import X.C1770320wAY;
import X.C1770430wAj;
import X.C1A5L;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C418440Gaw;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS90S0300000_26;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideFrequency;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.PhotoSearchData;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.WithoutCartSearchStruct;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.vm.EcSearchNoCartContentionVM;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSearchNoCartFypBottomButtonAssemV2 extends BaseCellSlotComponent<EcSearchNoCartFypBottomButtonAssemV2> {
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(EcSearchNoCartContentionVM.class), AFwS268S0000000_26.get$arr$(297));
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS268S0000000_26.get$arr$(298));
    public boolean LLJZ;
    public FrameLayout LLJZIJLIL;
    public LinearLayout LLL;
    public TuxTextView LLLF;
    public SmartImageView LLLFF;
    public TuxTextView LLLFFI;
    public TuxIconView LLLFZ;
    public boolean LLLI;
    public boolean LLLII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.brk;
    }

    public final String Bp() {
        BaseFeedPageParams baseFeedPageParamsNJ2;
        String str;
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IVideoCellAbility.class, null);
        return (iVideoCellAbility == null || (baseFeedPageParamsNJ2 = iVideoCellAbility.nJ2()) == null || (str = baseFeedPageParamsNJ2.eventType) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        Aweme aweme;
        super.onViewCreated(view);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("step: assem onViewCreated, aid: ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid = aweme.getAid();
        }
        sbLIZ.append(aid);
        sbLIZ.append(", ");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJZIJLIL = (FrameLayout) view.findViewById(R.id.ggo);
        this.LLL = (LinearLayout) view.findViewById(R.id.ggp);
        this.LLLF = (TuxTextView) view.findViewById(R.id.ggr);
        this.LLLFF = (SmartImageView) view.findViewById(R.id.saw);
        this.LLLFFI = (TuxTextView) view.findViewById(R.id.ggs);
        this.LLLFZ = (TuxIconView) view.findViewById(R.id.ggq);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nz4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILLL;
            }
        }, null, AFwS313S0000000_26.get$arr$(32), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nkr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILZ;
            }
        }, null, AFwS313S0000000_26.get$arr$(33), 6);
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJLLIL.getValue();
        subscribe(assemViewModel, C736820SvI.LIZIZ(assemViewModel.usedInReusedScene), null, AFwS313S0000000_26.get$arr$(21));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("step: assem onBind, aid: ");
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", ");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void Ep(C1770220wAO c1770220wAO, PhotoSearchData photoSearchData) {
        String string;
        int i;
        int i2;
        Float f;
        TuxIconView tuxIconView = this.LLLFZ;
        if (tuxIconView != null) {
            C1744700vVE.LJII(tuxIconView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        }
        TuxIconView tuxIconView2 = this.LLLFZ;
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(R.raw.icon_scan_magnifying_glass);
        }
        TuxTextView tuxTextView = this.LLLF;
        if (tuxTextView != null) {
            tuxTextView.setText(photoSearchData.title);
        }
        WithoutCartSearchStruct withoutCartSearchStructLIZ = c1770220wAO.LIZIZ.LIZ();
        if (withoutCartSearchStructLIZ != null && (f = withoutCartSearchStructLIZ.fontSize) != null) {
            float fFloatValue = f.floatValue();
            TuxTextView tuxTextView2 = this.LLLF;
            if (tuxTextView2 != null) {
                tuxTextView2.LJJJJI(fFloatValue);
            }
        }
        C1770430wAj.LL.getClass();
        EcSearchFeedVideoGuideFrequency ecSearchFeedVideoGuideFrequency = C1770430wAj.LLILLL;
        Long l = c1770220wAO.LIZIZ.frequencyTimeStamp;
        String str = null;
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        if (C123100dR.LIZ(string)) {
            if (ecSearchFeedVideoGuideFrequency != null) {
                str = ecSearchFeedVideoGuideFrequency.timestamp;
            }
            if (Intrinsics.LJFF(string, str)) {
                if (ecSearchFeedVideoGuideFrequency != null) {
                    i2 = ecSearchFeedVideoGuideFrequency.times;
                } else {
                    i2 = 0;
                }
                i = i2 + 1;
            } else {
                i = 1;
            }
            C1770430wAj.LJFF(new EcSearchFeedVideoGuideFrequency(string, i, null, 0, 0L, 28, null));
        }
        C2271391DvN.LIZ(this.LLJZIJLIL, (C1A5L) C2271381DvM.LLLLLLZ.getValue());
        FrameLayout frameLayout = this.LLJZIJLIL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS90S0300000_26(c1770220wAO, this, photoSearchData, 2));
        }
        C1770430wAj.LJ();
        C1770320wAY c1770320wAY = C1770320wAY.LIZ;
        Map<String, Object> mapLJ = c1770220wAO.LIZIZ.daParams;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        String strBp = Bp();
        c1770320wAY.getClass();
        C1770320wAY.LIZLLL(strBp, mapLJ);
    }
}
