package com.ss.android.ugc.aweme.ad.preload;

import X.C1014230cV3;
import X.C1024380clQ;
import X.C1035880d3y;
import X.C1037010d5n;
import X.C1040370dBD;
import X.C1040630dBd;
import X.C1040640dBe;
import X.C1040650dBf;
import X.C1040660dBg;
import X.C1041070dCL;
import X.C1041280dCg;
import X.C1041300dCi;
import X.C1042360dEQ;
import X.C1077190e8b;
import X.C1152404f4;
import X.C1552050qUV;
import X.C2105908Mv;
import X.C2139408Zs;
import X.C2188811AlT;
import X.C2277501ECm;
import X.C2296808zG;
import X.C23250099c;
import X.C443120HZe;
import X.C703302op;
import X.C823050WQl;
import X.C988570bpf;
import X.EnumC1042380dES;
import X.InterfaceC1008690cM7;
import X.InterfaceC1040680dBi;
import Y.ARunnableS21S1100000_16;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ad.network.SingletonWebViewTasks;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLandPagePreloadServiceImpl implements IAdLandPagePreloadService {
    public static final AdLandPagePreloadServiceImpl LJI = C1152404f4.LIZ;
    public static final String LJII = "adInfo";
    public static final String LJIIIIZZ = "ad_extra_data";
    public final String LIZ = "\"/** ad_extra_data **/\"";
    public final String LIZIZ = "\"/** adInfo **/\"";
    public final String LIZJ = "preload_land_page_analytics";
    public final String LIZLLL = "preload_land_page_analytics_url";
    public String LJ = "";
    public final Keva LJFF = Keva.getRepo("commercial_preload_land_page_name");

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void C0() {
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void getAdPackageBundleName() {
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void x0() {
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String B0() {
        return (String) C2277501ECm.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final SingletonWebViewTasks L0() {
        return new SingletonWebViewTasks();
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void r0() {
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZIZ() != null) {
            C1041300dCi.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final C1024380clQ G0() {
        return C1024380clQ.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final C1037010d5n N0() {
        return C1037010d5n.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String A0(Long l) {
        if (l != null && l.longValue() > 0) {
            return this.LJFF.getString(String.valueOf(l), "");
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final int D0(String str) {
        C1040640dBe c1040640dBeLIZ;
        Integer num;
        C1040650dBf c1040650dBf = C1040660dBg.LIZ;
        if (a0.LJJJIL(str) || (c1040640dBeLIZ = C1040660dBg.LIZ.LIZ(str)) == null || (num = c1040640dBeLIZ.LJFF) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final JSONObject E0(String str) {
        boolean z;
        C1040640dBe c1040640dBeLIZ;
        C1040650dBf c1040650dBf = C1040660dBg.LIZ;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z || (c1040640dBeLIZ = C1040660dBg.LIZ.LIZ(str)) == null) {
            return null;
        }
        return c1040640dBeLIZ.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final int F0(String str) {
        C1040640dBe c1040640dBeLIZ;
        Integer num;
        C1040650dBf c1040650dBf = C1040660dBg.LIZ;
        if (a0.LJJJIL(str) || (c1040640dBeLIZ = C1040660dBg.LIZ.LIZ(str)) == null || (num = c1040640dBeLIZ.LIZLLL) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String K0(String str) {
        switch (str.hashCode()) {
            case -1243020381:
                if (!str.equals("global")) {
                    return null;
                }
                return B0();
            case -895866265:
                if (!str.equals("splash")) {
                    return null;
                }
                return "3d7abe67f93fd5525385b2d8792fafaa";
            case 3138974:
                if (!str.equals("feed")) {
                    return null;
                }
                return "cca47107bfcbdb211d88f3385aeede40";
            case 862628038:
                if (!str.equals("lynx_feed")) {
                    return null;
                }
                return "a1a15b782e3ee8a25247561a91a99835";
            case 1856444385:
                if (!str.equals("flutter_feed")) {
                    return null;
                }
                return "";
            case 2012743738:
                if (!str.equals("dynamic_ad_feed")) {
                    return null;
                }
                return "a20813e75cff1b482e289722d8e7422b";
            default:
                return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final JSONObject P0(String str) {
        boolean z;
        C1040640dBe c1040640dBeLIZ;
        C1040650dBf c1040650dBf = C1040660dBg.LIZ;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z || (c1040640dBeLIZ = C1040660dBg.LIZ.LIZ(str)) == null) {
            return null;
        }
        return c1040640dBeLIZ.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void Q0(String str) {
        if (C2105908Mv.LIZ(str)) {
            return;
        }
        if (Intrinsics.LJFF(str, this.LJFF.getString(this.LIZLLL, ""))) {
            this.LJ = this.LJFF.getString(this.LIZJ, "");
        }
        if (C703302op.LIZ(this.LJ)) {
            return;
        }
        C823050WQl.LIZIZ().submit(new ARunnableS21S1100000_16(this, str, 1));
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String s0(Long l) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx_h5_");
        sbLIZ.append(l);
        sbLIZ.append('_');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void t0(AwemeRawAd awemeRawAd) {
        C988570bpf.LIZ.getClass();
        InterfaceC1008690cM7 interfaceC1008690cM7LIZIZ = C1041070dCL.LIZIZ();
        if (interfaceC1008690cM7LIZIZ != null) {
            ((C1041280dCg) interfaceC1008690cM7LIZIZ).LJII(awemeRawAd);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final int u0(String str) {
        if (!Intrinsics.LJFF(str, "0da04670c45fcb4f5dee6049f06a9d77") && !Intrinsics.LJFF(str, "a1a15b782e3ee8a25247561a91a99835")) {
            if (!Intrinsics.LJFF(str, "f7c98296e166e48f682216480ab62358") && !Intrinsics.LJFF(str, "3d7abe67f93fd5525385b2d8792fafaa")) {
                if (Intrinsics.LJFF(str, C1014230cV3.LIZ("iab_loading_format_dynamic"))) {
                    C988570bpf.LIZ.getClass();
                    if (C1041070dCL.LIZJ() == null) {
                        return 40;
                    }
                    return C1040370dBD.LJFF();
                }
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZJ() == null) {
                    return 40;
                }
                return C1040370dBD.LIZ();
            }
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZJ() == null) {
                return 40;
            }
            return C1040370dBD.LIZIZ();
        }
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZJ() == null) {
            return 40;
        }
        return C1040370dBD.LJI();
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void v0(String str) {
        String strK0;
        C1024380clQ c1024380clQ = C1024380clQ.LIZ;
        C1077190e8b c1077190e8b = new C1077190e8b(this, 0);
        c1024380clQ.getClass();
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService != null) {
            strK0 = iAdLandPagePreloadService.K0("feed");
        } else {
            strK0 = null;
        }
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZIZ() != null) {
            C1041280dCg.LIZIZ(str, strK0, c1077190e8b);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final JSONObject w0(String str) {
        return C1040660dBg.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final C1040640dBe y0(String str) {
        C1040650dBf c1040650dBf = C1040660dBg.LIZ;
        if (str != null && !a0.LJJJIL(str)) {
            return C1040660dBg.LIZ.LIZ(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final JSONObject z0(String str) {
        boolean z;
        C1040640dBe c1040640dBeLIZ;
        C1040650dBf c1040650dBf = C1040660dBg.LIZ;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z || (c1040640dBeLIZ = C1040660dBg.LIZ.LIZ(str)) == null) {
            return null;
        }
        return c1040640dBeLIZ.LJ;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final C1042360dEQ H0(AdSparkHybridContext adSparkHybridContext, EnumC1042380dES enumC1042380dES) {
        return new C1042360dEQ(adSparkHybridContext, enumC1042380dES);
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void J0(Long l, String str) {
        if (l != null && l.longValue() > 0 && !C2105908Mv.LIZ(str)) {
            this.LJFF.storeString(String.valueOf(l), str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void O0(String str, InterfaceC1040680dBi interfaceC1040680dBi) {
        if (!C2105908Mv.LIZ(str) && str != null && str.length() != 0 && !C2139408Zs.LIZ) {
            C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C1040630dBd(str, interfaceC1040680dBi, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String p0(String str, String str2) {
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZIZ() != null) {
            return C1041280dCg.LJIIIIZZ(str, str2);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final boolean q0(String str, String str2) {
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZIZ() != null) {
            return C1552050qUV.LIZIZ(str, str2);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String M0(int r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, X.C1035880d3y r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl.M0(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, X.0d3y):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final C443120HZe<String, String, String> I0(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, C1035880d3y c1035880d3y) throws JSONException {
        String string;
        if (C2105908Mv.LIZ(this.LJ)) {
            string = this.LJFF.getString(this.LIZJ, "");
        } else {
            string = this.LJ;
        }
        if (string != null && string.length() != 0) {
            String strM0 = M0(i, i2, str2, str3, str4, str5, str6, str7, str8, str9, str10, i3, c1035880d3y);
            return new C443120HZe<>(u.LJJIFFI(u.LJJIFFI(string, this.LIZ, strM0, true), this.LIZIZ, str, true), strM0, str);
        }
        return null;
    }
}
