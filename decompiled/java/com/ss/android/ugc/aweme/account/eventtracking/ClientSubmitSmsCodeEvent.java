package com.ss.android.ugc.aweme.account.eventtracking;

import X.AbstractC207072161e;
import X.C1195304lz;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.InterfaceC1282004zy;
import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class ClientSubmitSmsCodeEvent extends AbstractC207072161e {
    public static C1195304lz LJIIIIZZ = new C1195304lz("", "");
    public final Map<String, C2805016t> LJII;

    public ClientSubmitSmsCodeEvent() {
        super("client_submit_sms_code");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("enter_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair(Scene.SCENE_SERVICE, new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(Integer.TYPE)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("sms_country_code", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("3p_platform", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("config_key", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("page", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)));
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

    public final void LJIIJ(C1195304lz c1195304lz) {
        LJI(c1195304lz.LLILLJJLI, "sms_country_code");
    }

    public final void LJIIJJI(int i) {
        LJI(Integer.valueOf(i), Scene.SCENE_SERVICE);
    }
}
