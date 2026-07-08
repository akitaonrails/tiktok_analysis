package com.ss.android.ugc.aweme.journey.events;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097908Jt;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ShowDeeplinkEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ShowDeeplinkEvent() {
        super("show_deeplink");
        this.LJII = C2097908Jt.LIZJ(new Pair("deeplink_uri", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)));
    }

    @Override // X.AbstractC207072161e
    public final Map<String, C2805016t> LIZJ() {
        return this.LJII;
    }

    @Override // X.AbstractC207072161e
    public final AbstractC207072161e LJII(InterfaceC1282004zy interfaceC1282004zy) {
        LIZ().add(interfaceC1282004zy);
        return this;
    }
}
