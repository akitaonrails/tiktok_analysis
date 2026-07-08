package com.ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import X.C01GW;
import X.C06KX;
import X.C0RKP;
import X.C452501pT;
import com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoGenreTagProtocol;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbsInfoGenreTagContainerTrigger<C extends C0RKP> extends AbsComponentTrigger implements VideoGenreTagProtocol {
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS555S0100000_11((AbsInfoGenreTagContainerTrigger) this, 273));

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final PriorityAbility LJIILIIL() {
        return (PriorityAbility) this.LLJILJIL.getValue();
    }

    @Override // X.C0RKP
    public final float Lf() {
        C0RKP c0rkp;
        C06KX c06kx = this.LLJIJIL;
        if (!(c06kx instanceof C0RKP) || (c0rkp = (C0RKP) c06kx) == null) {
            return 0.0f;
        }
        return c0rkp.Lf();
    }

    @Override // X.C0RKP
    public final int ka(boolean z) {
        C0RKP c0rkp;
        C06KX c06kx = this.LLJIJIL;
        if ((c06kx instanceof C0RKP) && (c0rkp = (C0RKP) c06kx) != null) {
            return c0rkp.ka(z);
        }
        return 0;
    }
}
