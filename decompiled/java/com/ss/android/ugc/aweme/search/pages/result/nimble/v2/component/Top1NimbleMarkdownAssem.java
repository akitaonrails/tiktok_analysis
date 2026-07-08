package com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component;

import X.C01GW;
import X.C01V8;
import X.C123100dR;
import X.C13LE;
import X.C452501pT;
import X.C685530Qul;
import X.C688690Qzr;
import X.C724270Sb3;
import X.InterfaceC342000Daw;
import X.InterfaceC685100Qu4;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS78S1300000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class Top1NimbleMarkdownAssem extends Top1NimbleBaseAssem<C685530Qul> {
    public static final /* synthetic */ int LLLFF = 0;
    public C688690Qzr LLJZ;
    public InterfaceC342000Daw LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ez0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C01V8.LIZ((C01V8) this.LLL.getValue(), "inflate_cost", null, new AwS554S0100000_10(this, 620), 2);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C688690Qzr c688690Qzr = this.LLJZ;
        if (c688690Qzr != null) {
            c688690Qzr.LLLIIIIL.LJFF = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleBaseAssem
    public final InterfaceC685100Qu4 tp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return (C685530Qul) (c724270Sb3 != null ? c724270Sb3.LL : null);
    }

    public Top1NimbleMarkdownAssem() {
        C13LE.LIZ(Top1NimbleMarkdownAssem.class);
        this.LLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(296));
        this.LLLF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 619));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ep, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void up(C685530Qul c685530Qul) {
        super.tp(c685530Qul);
        String str = c685530Qul.LL;
        C688690Qzr c688690Qzr = this.LLJZ;
        if (c688690Qzr != null && C123100dR.LIZ(str)) {
            C01V8.LIZ((C01V8) this.LLL.getValue(), "bind_cost", null, new AwS78S1300000_10(str, this, c685530Qul, c688690Qzr, 0), 2);
            return;
        }
        C688690Qzr c688690Qzr2 = this.LLJZ;
        if (c688690Qzr2 != null) {
            if (str == null) {
                str = "";
            }
            c688690Qzr2.setText(str);
        }
    }

    public final void Fp(C688690Qzr c688690Qzr) {
        Object obj;
        c688690Qzr.setText("");
        c688690Qzr.LJJJJL();
        c688690Qzr.LJJJZ(false);
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        c688690Qzr.setShowMaxLines(((C685530Qul) obj).LLILLL);
        c688690Qzr.LLLIIIIL.LJFF = true;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C01V8.LIZ((C01V8) this.LLL.getValue(), "view_created_cost", null, new AwS411S0200000_10(view, this, 47), 2);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleBaseAssem
    public final boolean op(InterfaceC685100Qu4 interfaceC685100Qu4) {
        String str;
        C685530Qul c685530Qul = (C685530Qul) interfaceC685100Qu4;
        if (c685530Qul != null) {
            str = c685530Qul.LL;
        } else {
            str = null;
        }
        return C123100dR.LIZ(str);
    }
}
