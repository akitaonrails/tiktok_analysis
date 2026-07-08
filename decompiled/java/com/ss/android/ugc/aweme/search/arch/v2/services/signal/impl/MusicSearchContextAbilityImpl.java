package com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl;

import X.C01GW;
import X.C0P8I;
import X.C0PCY;
import X.C0PW4;
import X.C0PWA;
import X.C0PWT;
import X.C452501pT;
import X.C646120PVy;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.source.neo.IMusicSearchContextAbility;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class MusicSearchContextAbilityImpl implements IMusicSearchContextAbility {
    public final Object LL;
    public final View LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final Integer LLILZ;
    public final Integer LLILZIL;
    public final C646120PVy LLILZLL;
    public final C01GW LLIZ;

    public MusicSearchContextAbilityImpl() {
        this(null, 63);
    }

    static {
        new MusicSearchContextAbilityImpl(null, 63).P60().getClass();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.IMusicSearchContextAbility
    public final C0PCY<C0P8I> P60() {
        return (C0PCY) this.LLIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.IMusicSearchContextAbility
    public final void fe(C0PWT c0pwt) {
        LifecycleOwner lifecycleOwner = this.LLILLL;
        View view = this.LLILLJJLI;
        Object obj = this.LL;
        C0PW4.LIZIZ(c0pwt, new C0PWA(16, view, lifecycleOwner, this.LLILZLL, null, this.LLILZ, this.LLILZIL, obj));
    }

    public MusicSearchContextAbilityImpl(LifecycleOwner lifecycleOwner, int i) {
        lifecycleOwner = (i & 4) != 0 ? null : lifecycleOwner;
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1348));
    }
}
