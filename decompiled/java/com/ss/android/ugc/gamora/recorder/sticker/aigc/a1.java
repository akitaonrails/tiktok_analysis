package com.ss.android.ugc.gamora.recorder.sticker.aigc;

import X.AbstractC1664490tPr;
import X.C0LEO;
import X.C0P0T;
import X.C1295960jpS;
import X.C1389880mGw;
import X.C197039127h;
import X.C2217381BqS;
import X.C294080Bfq;
import X.C542750LQj;
import X.C543010LRj;
import X.C544740LYa;
import X.C544870LYn;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS143S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS587S0100000_8;
import nv7.c0;

/* JADX INFO: loaded from: classes9.dex */
public final class a1 extends AbstractC1664490tPr<C544870LYn, C544740LYa> {
    public C197039127h LLJJJIL;
    public C0P0T LLJJJJ;

    public final void LLLLLJIL() {
        C1295960jpS c1295960jpS;
        C1295960jpS c1295960jpS2 = (C1295960jpS) findViewById(R.id.nmu);
        if (c1295960jpS2 != null) {
            c1295960jpS2.setAnimation(C542750LQj.LIZ() ? R.raw.tux_lottie_common_creation_ailoading_hex_large : R.raw.tux_lottie_common_social_avatargen);
        }
        if (!C543010LRj.LIZ() || (c1295960jpS = (C1295960jpS) findViewById(R.id.nmu)) == null) {
            return;
        }
        c1295960jpS.setSpeed(1.0f);
    }

    public final void LLLLLJLJLL() {
        if (C294080Bfq.LIZ() && this.mView == null) {
            return;
        }
        C1389880mGw c1389880mGw = new C1389880mGw(this.mView);
        c1389880mGw.LJIIIZ(getString(2131838485));
        c1389880mGw.LJ(R.raw.icon_tick);
        c1389880mGw.LJI(R.attr.zi);
        c1389880mGw.LIZLLL(3000L);
        c1389880mGw.LJIIJ();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJJIL = (C197039127h) findViewById(R.id.g5n);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LYu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C544870LYn) obj).LIZLLL;
            }
        }, new AwS587S0100000_8(this, 509));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LYx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C544870LYn) obj).LJ;
            }
        }, new AwS587S0100000_8(this, 510));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LYy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C544870LYn) obj).LJFF;
            }
        }, new AwS585S0100000_6(this, 222));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LYz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C544870LYn) obj).LIZ;
            }
        }, new AwS587S0100000_8(this, 511));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LZ0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C544870LYn) obj).LIZIZ;
            }
        }, new AwS585S0100000_6(this, 224));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LYp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C544870LYn) obj).LJII;
            }
        }, new AwS587S0100000_8(this, 498));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LYq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C544870LYn) obj).LJI;
            }
        }, new AwS587S0100000_8(this, 500));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LYr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C544870LYn) obj).LJIIIIZZ;
            }
        }, new AwS582S0100000_3(this, 66));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LYs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C544870LYn) obj).LJIIIZ;
            }
        }, new AwS582S0100000_3(this, 67));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LYt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C544870LYn) obj).LJIIJ;
            }
        }, new AwS585S0100000_6(this, 221));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0LTy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C544870LYn) obj).LJIILL);
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 505));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LYv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C544870LYn) obj).LJIILLIIL;
            }
        }, new AwS587S0100000_8(this, 507));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LYw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C544870LYn) obj).LJIIZILJ;
            }
        }, new AwS587S0100000_8(this, 508));
        C197039127h c197039127h = this.LLJJJIL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS143S0100000_8(this, 108));
        }
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.db1);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS143S0100000_8(this, 109));
        }
        View viewFindViewById = findViewById(R.id.nmu);
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (viewFindViewById != null) {
            viewFindViewById.setLayerType(2, null);
        }
        LLLLLJIL();
        C197039127h c197039127h2 = this.LLJJJIL;
        if (c197039127h2 != null) {
            c197039127h2.LJJJJL(new AwS585S0100000_6(this, 223));
        }
        View viewFindViewById2 = findViewById(R.id.bo6);
        if (viewFindViewById2 != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = C0LEO.LIZ() + c0.LIZ.o2();
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById2);
            viewFindViewById2.setLayoutParams(marginLayoutParams);
        }
        if (C542750LQj.LIZ()) {
            TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.itx);
            if (tuxTextView != null) {
                tuxTextView.LJJJJI(20.0f);
            }
            TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.iu0);
            if (tuxTextView2 != null) {
                tuxTextView2.setTuxFont(33);
            }
            TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.itz);
            if (tuxTextView3 != null) {
                tuxTextView3.setTuxFont(51);
                return;
            }
            return;
        }
        TuxTextView tuxTextView4 = (TuxTextView) findViewById(R.id.itx);
        if (tuxTextView4 == null) {
            return;
        }
        tuxTextView4.LJJJJI(48.0f);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.oi, viewGroup, false);
    }
}
