package com.ss.android.ugc.aweme.autofill;

import X.EnumC1059300dfk;
import android.content.Context;
import android.view.View;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS102S0400000_4;
import kotlin.jvm.internal.AwS591S0100000_12;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public interface IAdAutofillService {
    void LIZ(Context context, String str);

    boolean LIZIZ(AwemeRawAd awemeRawAd);

    void LIZJ(Context context, String str, String str2);

    n LIZLLL();

    void LJ(Context context, String str, boolean z);

    boolean LJFF();

    boolean LJI();

    boolean LJII();

    void LJIIIIZZ(View view, EnumC1059300dfk enumC1059300dfk, Integer num, Integer num2, JSONObject jSONObject, boolean z, boolean z2, AwS591S0100000_12 awS591S0100000_12);

    void LJIIIZ(String str);

    boolean LJIIJ();

    boolean LJIIJJI();

    boolean LJIIL();

    String LJIILIIL();

    JSONObject LJIILJJIL();

    void LJIILL(AwS102S0400000_4 awS102S0400000_4);

    void LJIILLIIL(int i);

    void LJIIZILJ(Context context, AwemeRawAd awemeRawAd);

    String LJIJ();

    void LJIJI(EnumC1059300dfk enumC1059300dfk);

    void LJIJJ(int i, AwemeRawAd awemeRawAd);

    void LJIJJLI(int i, String str, Function1 function1, boolean z);

    String LJIL();

    boolean autofillEnable();
}
