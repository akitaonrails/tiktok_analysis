package com.ss.android.ugc.aweme.ecommerce.proto;

import X.C1504180pFI;
import X.InterfaceC1364105Vn;
import X.InterfaceC1507360pKQ;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public interface IEcomProtobufService {
    <T> Object LIZ(String str, InterfaceC1507360pKQ<T> interfaceC1507360pKQ, byte[] bArr, InterfaceC1364105Vn<? super T> interfaceC1364105Vn);

    boolean LIZIZ(String str);

    C1504180pFI LIZJ(byte[] bArr);

    boolean LIZLLL(String str, String str2);

    void LJ(String str, String str2);

    boolean LJFF(String str);

    void LJI(String str);

    void onEvent(String str, JSONObject jSONObject);
}
