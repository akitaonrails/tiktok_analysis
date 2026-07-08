package com.bytedance.tpsw.api.kakao;

import X.C814380Vx6;
import X.C851450Xah;
import Y.AObjectS529S0100000_13;
import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public interface IKakaoService {
    C814380Vx6<Unit> LIZ(Context context, String str);

    C814380Vx6 LIZIZ(TokenCert tokenCert, Context context, AObjectS529S0100000_13 aObjectS529S0100000_13);

    boolean LIZJ(Context context);

    void LIZLLL(Function1<? super Throwable, Unit> function1);

    C814380Vx6 LJ(TokenCert tokenCert, Context context, AObjectS529S0100000_13 aObjectS529S0100000_13);

    void LJFF(C851450Xah c851450Xah);
}
