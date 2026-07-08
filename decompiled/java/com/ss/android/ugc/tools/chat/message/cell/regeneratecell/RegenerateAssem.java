package com.ss.android.ugc.tools.chat.message.cell.regeneratecell;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C01GW;
import X.C06R4;
import X.C09AE;
import X.C09IC;
import X.C1856690yPr;
import X.C189200o6;
import X.C18UC;
import X.C197039127h;
import X.C21163117rp;
import X.C21288718Sv;
import X.C21291518Tx;
import X.C446460Hf2;
import X.C452501pT;
import X.C786410Ut5;
import X.C861640Xr8;
import X.C869590Y9l;
import X.C909930Zmp;
import X.C910280ZnO;
import X.EnumC21291418Tw;
import X.InterfaceC346201Wa;
import Y.ACListenerS134S0200000_32;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class RegenerateAssem extends SkeletonLayoutContainerAssem<C910280ZnO> {
    public C09AE LLLF;
    public AnonymousClass0956 LLLFF;
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS576S0100000_32((AbstractC738140SxQ) this, 415));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS576S0100000_32((AbstractC738140SxQ) this, 416));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS576S0100000_32((AbstractC738140SxQ) this, 413));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 411));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 412));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS576S0100000_32((AbstractC738140SxQ) this, 414));

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.aej;
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        AnonymousClass0956 anonymousClass0956 = this.LLLFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLFF = null;
        C09AE c09ae = this.LLLF;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLLF = null;
    }

    public final C197039127h up() {
        return (C197039127h) this.LLLFFI.getValue();
    }

    public final void Ap() {
        Context context;
        C197039127h c197039127hUp = up();
        if (c197039127hUp == null || (context = c197039127hUp.getContext()) == null) {
            return;
        }
        C1856690yPr c1856690yPr = new C1856690yPr(context, R.raw.icon_spinner_thin);
        C197039127h c197039127hUp2 = up();
        if (c197039127hUp2 != null) {
            c197039127hUp2.setButtonStartIconDrawable(c1856690yPr);
        }
        c1856690yPr.LJIIIZ();
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem
    /* JADX INFO: renamed from: yp, reason: merged with bridge method [inline-methods] */
    public final void up(C910280ZnO c910280ZnO) {
        C869590Y9l c869590Y9l;
        InterfaceC346201Wa<C189200o6<Unit>> interfaceC346201WaZE0;
        super.up(c910280ZnO);
        C909930Zmp c909930Zmp = c910280ZnO.LLJ;
        if (c909930Zmp != null && (c869590Y9l = c909930Zmp.LIZ) != null) {
            C09AE c09aeLJJI = this.LLLF;
            if (c09aeLJJI == null) {
                c09aeLJJI = C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C21288718Sv(c869590Y9l, this, null), C21163117rp.LIZIZ().LJI()));
            }
            this.LLLF = c09aeLJJI;
            C18UC c18uc = (C18UC) this.LLJZIJLIL.getValue();
            if (c18uc != null && (interfaceC346201WaZE0 = c18uc.ZE0(C06R4.RETRY_GENERATION, c869590Y9l)) != null) {
                Ap();
                C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C446460Hf2(this, null), interfaceC346201WaZE0));
            }
        }
        C786410Ut5.U8(up(), new ACListenerS134S0200000_32(c910280ZnO, this, 9));
        ((TextView) this.LLLFZ.getValue()).setText(c910280ZnO.LLIZ);
        up().setText(C21291518Tx.LJ(EnumC21291418Tw.REGENERATE_BUTTON_TEXT, new Object[0]));
    }

    public final void zp(boolean z) {
        if (z) {
            C786410Ut5.LLLLLLJ(up(), 0);
        } else {
            C786410Ut5.LLLLLLJ(up(), 8);
        }
    }
}
