package com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component;

import X.C01GW;
import X.C0R0A;
import X.C13LE;
import X.C418440Gaw;
import X.C452501pT;
import X.C685080Qu2;
import X.C723830SaL;
import X.C724270Sb3;
import X.C814420VxA;
import X.InterfaceC685100Qu4;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class Top1NimbleImageListAssem extends Top1NimbleBaseAssem<C685080Qu2> {
    public final C01GW LLJZ;
    public int LLJZIJLIL;
    public int LLL;
    public int LLLF;
    public int LLLFF;
    public int LLLFFI;
    public float LLLFZ;
    public Float LLLI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eyy;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleBaseAssem
    public final InterfaceC685100Qu4 tp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return (C685080Qu2) (c724270Sb3 != null ? c724270Sb3.LL : null);
    }

    public Top1NimbleImageListAssem() {
        C13LE.LIZ(Top1NimbleImageListAssem.class);
        this.LLJZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(295));
        this.LLJZIJLIL = 1;
        this.LLL = 1;
        this.LLLFFI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LLLFZ = 8.0f;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleBaseAssem
    /* JADX INFO: renamed from: Ap */
    public final void tp(InterfaceC685100Qu4 interfaceC685100Qu4) {
        super.tp(interfaceC685100Qu4);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 252));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleBaseAssem
    public final boolean op(InterfaceC685100Qu4 interfaceC685100Qu4) {
        List<C0R0A> list;
        C685080Qu2 c685080Qu2 = (C685080Qu2) interfaceC685100Qu4;
        if (c685080Qu2 != null && (list = c685080Qu2.LL) != null && (!list.isEmpty())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        super.tp((C685080Qu2) obj);
    }
}
