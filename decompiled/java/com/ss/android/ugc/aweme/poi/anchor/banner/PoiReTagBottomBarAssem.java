package com.ss.android.ugc.aweme.poi.anchor.banner;

import X.AnonymousClass1652;
import X.C01GW;
import X.C1200960hME;
import X.C1200970hMF;
import X.C1201010hMJ;
import X.C13LE;
import X.C2217381BqS;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.EnumC700430Rdh;
import X.InterfaceC1201000hMI;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AFwS319S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class PoiReTagBottomBarAssem extends BaseCellSlotComponent<PoiReTagBottomBarAssem> {
    public AnonymousClass1652 LLJLLL;
    public View LLJZ;
    public AwS575S0100000_31 LLLF;
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS276S0000000_31.get$arr$(163));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(242));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 931));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e75;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        AnonymousClass1652 anonymousClass1652 = this.LLJLLL;
        if (anonymousClass1652 != null) {
            anonymousClass1652.LJJIIJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJZ = view;
        if (view == null) {
            view = null;
        }
        setComponentClickStatusExperimental(view, EnumC700430Rdh.POSITIVE);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.164z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS319S0000000_31.get$arr$(23), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.164y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS319S0000000_31.get$arr$(24), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        AnonymousClass1652 anonymousClass1652;
        VideoItemParams videoItemParams2 = videoItemParams;
        C1200970hMF c1200970hMF = InterfaceC1201000hMI.LIZ;
        Aweme aweme = videoItemParams2.getAweme();
        String str = videoItemParams2.mEventType;
        c1200970hMF.getClass();
        if (C1200970hMF.LIZ(aweme, str)) {
            anonymousClass1652 = (C1200960hME) this.LLL.getValue();
        } else {
            anonymousClass1652 = (C1201010hMJ) this.LLJZIJLIL.getValue();
        }
        this.LLJLLL = anonymousClass1652;
        AwS575S0100000_31 awS575S0100000_31 = this.LLLF;
        if (awS575S0100000_31 != null) {
            awS575S0100000_31.invoke();
        }
        View view = null;
        this.LLLF = null;
        AnonymousClass1652 anonymousClass16522 = this.LLJLLL;
        if (anonymousClass16522 != null) {
            View view2 = this.LLJZ;
            if (view2 != null) {
                view = view2;
            }
            anonymousClass16522.LIZIZ(view, videoItemParams2);
        }
    }
}
