package com.ss.android.ugc.aweme.share.base.download.configuration.protocol;

import X.AbstractC21169117sn;
import X.C06KX;
import X.C13BV;
import X.C21169917sv;
import android.util.Pair;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public abstract class WaterMarkAbilityProtocol<CONTEXT extends AbstractC21169117sn> implements C06KX {
    public final Pair<Boolean, List<String>> LL = new Pair<>(Boolean.FALSE, C13BV.INSTANCE);

    public abstract void LIZ();

    public abstract void LIZJ(String str, String str2);

    public String LJ() {
        return null;
    }

    public void LJFF() {
    }

    public boolean LJI() {
        return false;
    }

    public boolean LJII() {
        return false;
    }

    public boolean LJIIIIZZ() {
        return false;
    }

    public boolean LJIIIZ() {
        return false;
    }

    public abstract void LJIIJ(C21169917sv c21169917sv);

    public abstract void LJIIJJI(long j, long j2, boolean z, String str, String str2);

    public Pair<Boolean, List<String>> LIZLLL() {
        return this.LL;
    }
}
