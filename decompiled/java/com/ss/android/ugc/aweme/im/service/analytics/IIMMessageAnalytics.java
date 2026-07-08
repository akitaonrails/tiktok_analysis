package com.ss.android.ugc.aweme.im.service.analytics;

import X.C0ZCG;
import X.C869590Y9l;
import X.C893510Z3l;
import X.EnumC894220Z6e;
import X.InterfaceC1364105Vn;
import X.InterfaceC1493105sv;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public interface IIMMessageAnalytics {
    public static final C893510Z3l LIZ = C893510Z3l.LIZ;

    Object LIZ(long j, C869590Y9l c869590Y9l, C0ZCG c0zcg, InterfaceC1364105Vn interfaceC1364105Vn);

    Object LIZIZ(C869590Y9l c869590Y9l, EnumC894220Z6e enumC894220Z6e, long j, C0ZCG c0zcg, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LIZJ(C869590Y9l c869590Y9l, Map map);

    Object LIZLLL(JSONObject jSONObject, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LJ(C869590Y9l c869590Y9l);

    void LJFF(C869590Y9l c869590Y9l, Map<String, String> map);

    Object LJI(C869590Y9l c869590Y9l, Map map, InterfaceC1364105Vn interfaceC1364105Vn);

    Object LJII(C869590Y9l c869590Y9l, C0ZCG c0zcg, boolean z, InterfaceC1364105Vn<? super Map<String, String>> interfaceC1364105Vn);

    String LJIIIIZZ(C869590Y9l c869590Y9l);

    void LJIIIZ(C869590Y9l c869590Y9l);

    void LJIIJ(C869590Y9l c869590Y9l, int i, C0ZCG c0zcg, InterfaceC1493105sv interfaceC1493105sv);
}
