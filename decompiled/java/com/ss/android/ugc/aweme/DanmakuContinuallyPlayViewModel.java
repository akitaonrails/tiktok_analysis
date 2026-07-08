package com.ss.android.ugc.aweme;

import X.C1383750m73;
import X.C1383850m7D;
import X.C1383870m7F;
import X.C1384500m8G;
import X.EnumC255700yp;
import X.EnumC726810Sf9;
import X.InterfaceC0148002o;
import X.InterfaceC1384330m7z;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuContinuallyPlayViewModel extends AssemViewModel<C1383750m73> {
    public Aweme LL;
    public InterfaceC1384330m7z LLILLJJLI;
    public String LLILLL;
    public C1383870m7F LLILZ;
    public C1383850m7D LLILZIL;
    public String LLILZLL;
    public EnumC255700yp LLIZ;
    public Function0<Unit> LLJ;
    public C1384500m8G LLJI;
    public boolean LLJIJIL;
    public AwS565S0100000_21 LLJILJILJ;
    public WeakReference<DanmakuViewModel> LLIZLLLIL = new WeakReference<>(null);
    public EnumC726810Sf9 LLJILJIL = EnumC726810Sf9.PORTRAIT;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.0m73
        };
    }

    public final void reset() {
        if (this.LLJIJIL) {
            return;
        }
        this.LL = null;
        this.LLIZLLLIL = new WeakReference<>(null);
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLJ = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLIZ = null;
        this.LLILZLL = null;
        this.LLJI = null;
        this.LLJIJIL = false;
    }

    public final void vQ2(EnumC726810Sf9 enumC726810Sf9, Aweme aweme, InterfaceC1384330m7z interfaceC1384330m7z, WeakReference<DanmakuViewModel> weakReference, String str, C1384500m8G c1384500m8G, Function0<Unit> function0) {
        if (enumC726810Sf9 != this.LLJILJIL || this.LLJIJIL) {
            return;
        }
        this.LL = aweme;
        this.LLILLJJLI = interfaceC1384330m7z;
        this.LLIZLLLIL = weakReference;
        this.LLILLL = str;
        this.LLJ = function0;
        this.LLJI = c1384500m8G;
    }
}
