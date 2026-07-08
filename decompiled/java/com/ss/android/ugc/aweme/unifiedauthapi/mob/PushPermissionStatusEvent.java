package com.ss.android.ugc.aweme.unifiedauthapi.mob;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class PushPermissionStatusEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public PushPermissionStatusEvent() {
        super("push_permission_status");
        Class cls = Integer.TYPE;
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("click_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("is_with_cover", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("is_first_start", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("is_expo", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("out_status_after", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("out_status_before", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("pop_up_count", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("popup_page", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("pop_up_rn", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("popup_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("timestamp_diff", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)));
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

    public final void LJIIJ(String str) {
        LJI(str, "click_type");
    }

    public final void LJIIJJI(int i) {
        LJI(Integer.valueOf(i), "is_expo");
    }

    public final void LJIIL(String str) {
        LJI(str, "out_status_after");
    }

    public final void LJIILIIL(String str) {
        LJI(str, "out_status_before");
    }
}
