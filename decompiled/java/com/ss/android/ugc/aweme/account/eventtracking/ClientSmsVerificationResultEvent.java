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
public final class ClientSmsVerificationResultEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ClientSmsVerificationResultEvent() {
        super("client_sms_verification_result");
        Class cls = Integer.TYPE;
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("enter_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("mobile_num", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("result", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair(Scene.SCENE_SERVICE, new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("sms_country_code", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("3p_platform", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("config_key", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("error_code", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("page", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)));
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
        LJI(Integer.valueOf(i), "result");
    }

    public final void LJIIL(int i) {
        LJI(Integer.valueOf(i), Scene.SCENE_SERVICE);
    }
}
