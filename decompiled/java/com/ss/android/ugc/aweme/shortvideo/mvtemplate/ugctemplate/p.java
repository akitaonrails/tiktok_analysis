package com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate;

import X.AbstractC1664490tPr;
import X.C01GW;
import X.C0LGP;
import X.C0LGR;
import X.C1452440ntq;
import X.C1463670oBx;
import X.C2217381BqS;
import X.C452501pT;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import irm.AkS16S0000000_8;
import irm.AkS80S0100000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends AbstractC1664490tPr<C0LGP, C0LGR> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 330));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 327));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 329));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 328));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 331));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 332));

    public final C1463670oBx LLLLLJIL() {
        return (C1463670oBx) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        LLLLLJIL().destroy();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        LLLLLJIL().pause();
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (isVisible() && C1452440ntq.LIZ(LLLLLJIL())) {
            LLLLLJIL().play();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LGO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0LGP) obj).LIZ;
            }
        }, new AwS587S0100000_8(this, 248));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LGQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0LGP) obj).LIZIZ;
            }
        }, new AwS587S0100000_8(this, 249));
        C786410Ut5.I7(new AkS16S0000000_8(0), (View) this.LLJJJIL.getValue());
        C786410Ut5.I7(new AkS80S0100000_8(this, 9), (View) this.LLJJJJ.getValue());
        C786410Ut5.I7(new AkS80S0100000_8(this, 10), (View) this.LLJJJJJIL.getValue());
        C786410Ut5.I7(new AkS80S0100000_8(this, 11), (View) this.LLJJJJLIIL.getValue());
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.i5x, viewGroup, false);
    }
}
