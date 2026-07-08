package com.bytedance.lynx.hybrid.ssp.base.net;

import X.C080U;
import X.C0X9S;
import X.C1042900dFI;
import X.C1042950dFN;
import X.C1490740otc;
import X.EnumC1042800dF8;
import X.InterfaceC1042870dFF;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.n;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class DefaultNetAdapter {
    public final ArrayList<C080U> LIZ;

    public interface TTNetAdapterApi {
        @InterfaceC1501160pAQ
        C0X9S<TypedInput> send(@InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC820680WHi boolean z, @InterfaceC2177008fw Object obj);

        @InterfaceC1501170pAR
        C0X9S<TypedInput> send(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC820680WHi boolean z, @InterfaceC2177008fw Object obj, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list);
    }

    public DefaultNetAdapter() {
        ArrayList<C080U> arrayList = new ArrayList<>();
        this.LIZ = arrayList;
        arrayList.add(new C080U("Content-Type", "application/json"));
    }

    public static String LIZ(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] cArr = new char[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
        while (true) {
            int i = bufferedReader.read(cArr);
            if (i != -1) {
                sb.append(cArr, 0, i);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    public final void LIZJ(String str, C1042950dFN c1042950dFN, boolean z) {
        InterfaceC1042870dFF interfaceC1042870dFF = C1042900dFI.LIZ;
        HashMap<String, String> map = new HashMap<>();
        map.put("ssp_sdk_version", "1");
        n nVar = new n();
        nVar.LJJIIJ("url", str);
        nVar.LJJIIJ("bid", c1042950dFN.LIZ);
        nVar.LJJII(Boolean.valueOf(z), "need_all_page");
        nVar.LJJIII(Integer.valueOf(c1042950dFN.LIZIZ), "source");
        n nVar2 = new n();
        nVar2.LJJII(Boolean.valueOf(c1042950dFN.LIZLLL), "need_regex");
        nVar2.LJJII(Boolean.valueOf(c1042950dFN.LJ), "ban_resource");
        nVar.LJJIFFI("config", nVar2);
        n nVar3 = c1042950dFN.LIZJ;
        if (nVar3 != null) {
            nVar.LJJIIJ("resourceCustom", nVar3.toString());
        }
        C1490740otc.LIZIZ(C1490740otc.LIZ, "start fetch ssp single page response. https://scc.tiktokv.com/ssp_sdk/url_resource, url:" + str, null, "SspLifeCycle_", 2);
        LIZIZ(EnumC1042800dF8.POST, "https://scc.tiktokv.com/ssp_sdk/url_resource", str, this.LIZ, map, nVar, interfaceC1042870dFF, c1042950dFN, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.EnumC1042800dF8 r25, java.lang.String r26, java.lang.String r27, java.util.List<X.C080U> r28, java.util.HashMap<java.lang.String, java.lang.String> r29, com.google.gson.n r30, X.InterfaceC1042870dFF r31, X.C1042950dFN r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.ssp.base.net.DefaultNetAdapter.LIZIZ(X.0dF8, java.lang.String, java.lang.String, java.util.List, java.util.HashMap, com.google.gson.n, X.0dFF, X.0dFN, boolean):void");
    }
}
