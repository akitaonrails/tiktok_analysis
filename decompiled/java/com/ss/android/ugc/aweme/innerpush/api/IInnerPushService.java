package com.ss.android.ugc.aweme.innerpush.api;

import X.AbstractC738140SxQ;
import X.C13IQ;
import X.C18JY;
import X.C1906330zhv;
import X.C19323510in;
import X.InterfaceC1209290hZf;
import X.InterfaceC19330810jy;
import X.InterfaceC20643015q8;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public interface IInnerPushService {
    void LIZ(String str);

    void LIZIZ(C1906330zhv c1906330zhv);

    C13IQ<? extends AbstractC738140SxQ> LIZJ();

    boolean LIZLLL(C19323510in c19323510in);

    void LJ(InterfaceC19330810jy interfaceC19330810jy);

    void LJFF(long j);

    void LJI(InterfaceC19330810jy interfaceC19330810jy);

    void LJII(C18JY c18jy, InnerPushMessage innerPushMessage, String str, int i);

    void LJIIIIZZ(InterfaceC20643015q8 interfaceC20643015q8);

    boolean LJIIIZ(boolean z);

    InterfaceC1209290hZf LJIIJ();

    boolean LJIIJJI();

    void LJIIL(boolean z, boolean z2);

    void LJIILIIL(JSONObject jSONObject, long j);

    boolean LJIILJJIL(JSONObject jSONObject);

    void LJIILL(InterfaceC20643015q8 interfaceC20643015q8, int[] iArr);

    boolean LJIILLIIL(String str);

    void LJIIZILJ(InterfaceC20643015q8 interfaceC20643015q8);

    InterfaceC19330810jy LJIJ(int i);

    HashMap<String, String> LJIJI(InnerPushMessage innerPushMessage);

    void init();
}
