package com.ss.android.ugc.aweme;

import X.C15464063q;
import X.InterfaceC2227891CHr;
import X.InterfaceC2227951CHx;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public interface ITTC2PAService {
    void init(InterfaceC2227891CHr interfaceC2227891CHr);

    void mobEvent(String str, String str2, boolean z, int i, String str3, long j, boolean z2, C15464063q c15464063q);

    void readAndVerifyFromPath(String str, boolean z, C15464063q c15464063q, InterfaceC2227951CHx interfaceC2227951CHx);

    void readIngredientsFromPath(String str, boolean z, C15464063q c15464063q, InterfaceC2227951CHx interfaceC2227951CHx);

    void writeAndSignManifest(String str, boolean z, JSONObject jSONObject, String str2, List<String> list, C15464063q c15464063q, InterfaceC2227951CHx interfaceC2227951CHx);
}
