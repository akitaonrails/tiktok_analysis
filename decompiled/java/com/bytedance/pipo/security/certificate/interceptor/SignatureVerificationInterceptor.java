package com.bytedance.pipo.security.certificate.interceptor;

import X.AbstractC2252651DEx;
import X.C1726520v1u;
import X.C1726570v1z;
import X.C1726600v22;
import X.C1DFB;
import X.C2097608Jq;
import X.InterfaceC1726580v20;
import X.InterfaceC1726670v29;
import X.InterfaceC1726690v2B;
import X.InterfaceC1726770v2J;
import X.InterfaceC1726780v2K;
import X.InterfaceC1904907d9;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.security.ab.SignatureCertConfig;
import com.bytedance.pipo.security.ab.SignatureCertSignModeConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class SignatureVerificationInterceptor implements InterfaceC1904907d9 {
    public final String LL;
    public final InterfaceC1726670v29 LLILLJJLI;
    public final InterfaceC1726690v2B LLILLL;
    public final InterfaceC1726780v2K LLILZ;
    public final InterfaceC1726580v20 LLILZIL;
    public final SignatureCertConfig LLILZLL;
    public final AbstractC2252651DEx LLIZ;
    public final InterfaceC1726770v2J LLIZLLLIL;
    public final String LLJ;

    public final boolean LIZJ() {
        SignatureCertSignModeConfig next;
        Iterator<SignatureCertSignModeConfig> it2 = this.LLILZLL.singModeConfigs.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (u.LJIJI(next.busiLine, this.LL, true)) {
                break;
            }
        }
        SignatureCertSignModeConfig signatureCertSignModeConfig = next;
        return signatureCertSignModeConfig != null && signatureCertSignModeConfig.useSingMode;
    }

    public static Map LIZIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = a0.LJJLIIIJILLIZJL(str, new String[]{"&"}, 0, 6).iterator();
        while (it2.hasNext()) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
            linkedHashMap.put(URLDecoder.decode((String) ListProtector.get(listLJJLIIIJILLIZJL, 0), StandardCharsets.UTF_8.name()), URLDecoder.decode((String) ListProtector.get(listLJJLIIIJILLIZJL, 1), StandardCharsets.UTF_8.name()));
        }
        return linkedHashMap;
    }

    public final Map<String, String> LIZ(boolean z) {
        String str;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("sign_source", this.LLJ);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("sign_mode", str);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0229 A[EDGE_INSN: B:153:0x0229->B:81:0x0229 BREAK  A[LOOP:0: B:49:0x0161->B:80:0x0225], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0222 A[PHI: r0
      0x0222: PHI (r0v65 java.lang.String) = (r0v64 java.lang.String), (r0v89 java.lang.String) binds: [B:57:0x0189, B:59:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028d  */
    @Override // X.InterfaceC1904907d9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0X52<?> intercept(X.InterfaceC841770X0l r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.security.certificate.interceptor.SignatureVerificationInterceptor.intercept(X.0X0l):X.0X52");
    }

    public SignatureVerificationInterceptor(String str, C1726520v1u c1726520v1u, C1726600v22 c1726600v22, C1726570v1z c1726570v1z, InterfaceC1726580v20 interfaceC1726580v20, SignatureCertConfig signatureCertConfig, C1DFB c1dfb, InterfaceC1726770v2J interfaceC1726770v2J, String str2) {
        this.LL = str;
        this.LLILLJJLI = c1726520v1u;
        this.LLILLL = c1726600v22;
        this.LLILZ = c1726570v1z;
        this.LLILZIL = interfaceC1726580v20;
        this.LLILZLL = signatureCertConfig;
        this.LLIZ = c1dfb;
        this.LLIZLLLIL = interfaceC1726770v2J;
        this.LLJ = str2;
    }
}
