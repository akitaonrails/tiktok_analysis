package com.ss.android.ugc.aweme.pipo.hybrid;

import X.C1041990dDp;
import X.C1390920mIc;
import X.C1541950qED;
import X.C1716520ulm;
import X.C1717770unn;
import X.C1725240uzq;
import X.C1725250uzr;
import X.C1725270uzt;
import X.C1725360v02;
import X.C1725930v0x;
import X.C1776240wK6;
import X.C19GS;
import X.C1AF0;
import X.C2188811AlT;
import X.C759510Tqn;
import X.C786410Ut5;
import X.C905703gN;
import X.C908603gq;
import X.InterfaceC1541800qDy;
import X.InterfaceC1725210uzn;
import X.InterfaceC1725350v01;
import X.InterfaceC759720Tr8;
import X.InterfaceC924803jS;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.pipo.IPipoContainerService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoContainerServiceImpl implements IPipoContainerService {
    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    public final void LJII() {
        C1725240uzq.LIZ.getClass();
        Map<String, InterfaceC924803jS> map = C1725240uzq.LJI;
        if (map.containsKey("tts_payin")) {
            map.remove("tts_payin");
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    public final void init() {
        C1725240uzq.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    public final void LJI() {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pipo_plugin_register_opt_settings", false)) {
            C1725240uzq.LIZ.LIZJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(java.lang.String r8) {
        /*
            r7 = this;
            X.0uzq r0 = X.C1725240uzq.LIZ
            r0.getClass()
            r3 = 0
            if (r8 == 0) goto L73
            java.lang.String r0 = "jumpToTTContainer"
            android.net.Uri r6 = X.C759510Tqn.LIZLLL(r8, r0)
            if (r6 == 0) goto L74
            java.lang.String r5 = r6.getPath()
        L14:
            X.01GW r0 = X.C1725250uzr.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.pipo.hybrid.PipoEcomPayinStandaloneContainerConfig r0 = (com.ss.android.ugc.aweme.pipo.hybrid.PipoEcomPayinStandaloneContainerConfig) r0
            java.util.List<java.lang.String> r1 = r0.jumpToEcomPathsTraits
            r4 = 0
            r2 = 1
            if (r1 == 0) goto L42
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L42
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r5 == 0) goto L2c
            boolean r0 = kotlin.text.a0.LJJIIZI(r5, r0, r4)
            if (r0 != r2) goto L2c
        L40:
            r4 = 1
        L41:
            return r4
        L42:
            if (r6 == 0) goto L48
            java.lang.String r3 = r6.getHost()
        L48:
            X.01GW r0 = X.C1725250uzr.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.pipo.hybrid.PipoEcomPayinStandaloneContainerConfig r0 = (com.ss.android.ugc.aweme.pipo.hybrid.PipoEcomPayinStandaloneContainerConfig) r0
            java.util.List<java.lang.String> r1 = r0.jumpToEcomHostTraits
            if (r1 == 0) goto L41
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L41
            java.util.Iterator r1 = r1.iterator()
        L5e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r3 == 0) goto L5e
            boolean r0 = kotlin.text.a0.LJJIIZI(r3, r0, r4)
            if (r0 != r2) goto L5e
            goto L40
        L73:
            r6 = r3
        L74:
            r5 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.hybrid.PipoContainerServiceImpl.LIZJ(java.lang.String):boolean");
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    public final void LJ(String str) {
        C1725240uzq.LIZ.getClass();
        Map<String, InterfaceC1725210uzn> map = C1725240uzq.LIZLLL;
        if (map.containsKey(str)) {
            map.remove(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    public final void LJIIIIZZ(AFwS313S0000000_26 aFwS313S0000000_26) {
        C1725240uzq.LIZ.getClass();
        C1725240uzq.LJ.put("pipo_bnpl", aFwS313S0000000_26);
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    public final JSONObject LJIIIZ(String str) {
        InterfaceC1725350v01 interfaceC1725350v01 = C1725360v02.LIZIZ.get(str);
        if (interfaceC1725350v01 != null) {
            return interfaceC1725350v01.LJ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    public final boolean LJIIJ(String str) {
        List<String> list;
        C1725240uzq.LIZ.getClass();
        if (str != null) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("pipo_ecom_payin_standalone_container", true) && ((list = ((PipoEcomPayinStandaloneContainerConfig) C1725250uzr.LIZIZ.getValue()).payDisabledRedirectPaymentMethods) == null || !list.contains(str))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    public final void LJIIJJI(String str) {
        C1725240uzq.LIZ.getClass();
        C1725240uzq.LJFF.remove(str);
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    public final void LJIIL(C908603gq c908603gq) {
        C1725240uzq.LIZ.LIZIZ();
        Map<String, InterfaceC924803jS> map = C1725240uzq.LJI;
        if (!map.containsKey("tts_payin")) {
            map.put("tts_payin", c908603gq);
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    public final void LIZ(String str, InterfaceC759720Tr8 interfaceC759720Tr8) {
        C1725240uzq.LIZ.getClass();
        C1725240uzq.LJFF.put(str, interfaceC759720Tr8);
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    public final boolean LIZLLL(String str, String str2) {
        List<String> list;
        String host;
        Uri uriLIZLLL;
        C1725240uzq.LIZ.getClass();
        if (str != null) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("pipo_ecom_payin_standalone_container", true) && ((list = ((PipoEcomPayinStandaloneContainerConfig) C1725250uzr.LIZIZ.getValue()).bindDisabledRedirectPaymentMethods) == null || !list.contains(str))) {
                if (str2 != null && (uriLIZLLL = C759510Tqn.LIZLLL(str2, "isH5Schema")) != null) {
                    host = uriLIZLLL.getHost();
                } else {
                    host = null;
                }
                if (Intrinsics.LJFF(host, "webview")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0014, B:11:0x001a, B:12:0x001e, B:46:0x00d3, B:47:0x00d6, B:49:0x00da, B:51:0x00e2, B:53:0x00f0, B:55:0x00f8, B:57:0x0106, B:59:0x010e, B:61:0x011c, B:63:0x0124, B:65:0x0132, B:67:0x013a, B:69:0x0148, B:71:0x0150, B:73:0x015e, B:75:0x0166, B:77:0x0174, B:79:0x017c, B:81:0x018a, B:83:0x0192, B:85:0x01a0, B:87:0x01a8, B:89:0x01b6, B:91:0x01be, B:93:0x01cc, B:95:0x01d4, B:97:0x01e2, B:99:0x01ea, B:101:0x01f8, B:103:0x0200, B:105:0x020e, B:107:0x0216, B:109:0x0224, B:111:0x022c, B:113:0x023a, B:115:0x0242, B:14:0x0023, B:16:0x002b, B:18:0x0039, B:20:0x0041, B:22:0x004f, B:24:0x0057, B:26:0x0065, B:28:0x006d, B:30:0x007b, B:32:0x0083, B:34:0x0091, B:36:0x0099, B:38:0x00a7, B:40:0x00af, B:42:0x00bd, B:44:0x00c5), top: B:120:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039 A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0014, B:11:0x001a, B:12:0x001e, B:46:0x00d3, B:47:0x00d6, B:49:0x00da, B:51:0x00e2, B:53:0x00f0, B:55:0x00f8, B:57:0x0106, B:59:0x010e, B:61:0x011c, B:63:0x0124, B:65:0x0132, B:67:0x013a, B:69:0x0148, B:71:0x0150, B:73:0x015e, B:75:0x0166, B:77:0x0174, B:79:0x017c, B:81:0x018a, B:83:0x0192, B:85:0x01a0, B:87:0x01a8, B:89:0x01b6, B:91:0x01be, B:93:0x01cc, B:95:0x01d4, B:97:0x01e2, B:99:0x01ea, B:101:0x01f8, B:103:0x0200, B:105:0x020e, B:107:0x0216, B:109:0x0224, B:111:0x022c, B:113:0x023a, B:115:0x0242, B:14:0x0023, B:16:0x002b, B:18:0x0039, B:20:0x0041, B:22:0x004f, B:24:0x0057, B:26:0x0065, B:28:0x006d, B:30:0x007b, B:32:0x0083, B:34:0x0091, B:36:0x0099, B:38:0x00a7, B:40:0x00af, B:42:0x00bd, B:44:0x00c5), top: B:120:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0014, B:11:0x001a, B:12:0x001e, B:46:0x00d3, B:47:0x00d6, B:49:0x00da, B:51:0x00e2, B:53:0x00f0, B:55:0x00f8, B:57:0x0106, B:59:0x010e, B:61:0x011c, B:63:0x0124, B:65:0x0132, B:67:0x013a, B:69:0x0148, B:71:0x0150, B:73:0x015e, B:75:0x0166, B:77:0x0174, B:79:0x017c, B:81:0x018a, B:83:0x0192, B:85:0x01a0, B:87:0x01a8, B:89:0x01b6, B:91:0x01be, B:93:0x01cc, B:95:0x01d4, B:97:0x01e2, B:99:0x01ea, B:101:0x01f8, B:103:0x0200, B:105:0x020e, B:107:0x0216, B:109:0x0224, B:111:0x022c, B:113:0x023a, B:115:0x0242, B:14:0x0023, B:16:0x002b, B:18:0x0039, B:20:0x0041, B:22:0x004f, B:24:0x0057, B:26:0x0065, B:28:0x006d, B:30:0x007b, B:32:0x0083, B:34:0x0091, B:36:0x0099, B:38:0x00a7, B:40:0x00af, B:42:0x00bd, B:44:0x00c5), top: B:120:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065 A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0014, B:11:0x001a, B:12:0x001e, B:46:0x00d3, B:47:0x00d6, B:49:0x00da, B:51:0x00e2, B:53:0x00f0, B:55:0x00f8, B:57:0x0106, B:59:0x010e, B:61:0x011c, B:63:0x0124, B:65:0x0132, B:67:0x013a, B:69:0x0148, B:71:0x0150, B:73:0x015e, B:75:0x0166, B:77:0x0174, B:79:0x017c, B:81:0x018a, B:83:0x0192, B:85:0x01a0, B:87:0x01a8, B:89:0x01b6, B:91:0x01be, B:93:0x01cc, B:95:0x01d4, B:97:0x01e2, B:99:0x01ea, B:101:0x01f8, B:103:0x0200, B:105:0x020e, B:107:0x0216, B:109:0x0224, B:111:0x022c, B:113:0x023a, B:115:0x0242, B:14:0x0023, B:16:0x002b, B:18:0x0039, B:20:0x0041, B:22:0x004f, B:24:0x0057, B:26:0x0065, B:28:0x006d, B:30:0x007b, B:32:0x0083, B:34:0x0091, B:36:0x0099, B:38:0x00a7, B:40:0x00af, B:42:0x00bd, B:44:0x00c5), top: B:120:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0014, B:11:0x001a, B:12:0x001e, B:46:0x00d3, B:47:0x00d6, B:49:0x00da, B:51:0x00e2, B:53:0x00f0, B:55:0x00f8, B:57:0x0106, B:59:0x010e, B:61:0x011c, B:63:0x0124, B:65:0x0132, B:67:0x013a, B:69:0x0148, B:71:0x0150, B:73:0x015e, B:75:0x0166, B:77:0x0174, B:79:0x017c, B:81:0x018a, B:83:0x0192, B:85:0x01a0, B:87:0x01a8, B:89:0x01b6, B:91:0x01be, B:93:0x01cc, B:95:0x01d4, B:97:0x01e2, B:99:0x01ea, B:101:0x01f8, B:103:0x0200, B:105:0x020e, B:107:0x0216, B:109:0x0224, B:111:0x022c, B:113:0x023a, B:115:0x0242, B:14:0x0023, B:16:0x002b, B:18:0x0039, B:20:0x0041, B:22:0x004f, B:24:0x0057, B:26:0x0065, B:28:0x006d, B:30:0x007b, B:32:0x0083, B:34:0x0091, B:36:0x0099, B:38:0x00a7, B:40:0x00af, B:42:0x00bd, B:44:0x00c5), top: B:120:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0014, B:11:0x001a, B:12:0x001e, B:46:0x00d3, B:47:0x00d6, B:49:0x00da, B:51:0x00e2, B:53:0x00f0, B:55:0x00f8, B:57:0x0106, B:59:0x010e, B:61:0x011c, B:63:0x0124, B:65:0x0132, B:67:0x013a, B:69:0x0148, B:71:0x0150, B:73:0x015e, B:75:0x0166, B:77:0x0174, B:79:0x017c, B:81:0x018a, B:83:0x0192, B:85:0x01a0, B:87:0x01a8, B:89:0x01b6, B:91:0x01be, B:93:0x01cc, B:95:0x01d4, B:97:0x01e2, B:99:0x01ea, B:101:0x01f8, B:103:0x0200, B:105:0x020e, B:107:0x0216, B:109:0x0224, B:111:0x022c, B:113:0x023a, B:115:0x0242, B:14:0x0023, B:16:0x002b, B:18:0x0039, B:20:0x0041, B:22:0x004f, B:24:0x0057, B:26:0x0065, B:28:0x006d, B:30:0x007b, B:32:0x0083, B:34:0x0091, B:36:0x0099, B:38:0x00a7, B:40:0x00af, B:42:0x00bd, B:44:0x00c5), top: B:120:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7 A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0014, B:11:0x001a, B:12:0x001e, B:46:0x00d3, B:47:0x00d6, B:49:0x00da, B:51:0x00e2, B:53:0x00f0, B:55:0x00f8, B:57:0x0106, B:59:0x010e, B:61:0x011c, B:63:0x0124, B:65:0x0132, B:67:0x013a, B:69:0x0148, B:71:0x0150, B:73:0x015e, B:75:0x0166, B:77:0x0174, B:79:0x017c, B:81:0x018a, B:83:0x0192, B:85:0x01a0, B:87:0x01a8, B:89:0x01b6, B:91:0x01be, B:93:0x01cc, B:95:0x01d4, B:97:0x01e2, B:99:0x01ea, B:101:0x01f8, B:103:0x0200, B:105:0x020e, B:107:0x0216, B:109:0x0224, B:111:0x022c, B:113:0x023a, B:115:0x0242, B:14:0x0023, B:16:0x002b, B:18:0x0039, B:20:0x0041, B:22:0x004f, B:24:0x0057, B:26:0x0065, B:28:0x006d, B:30:0x007b, B:32:0x0083, B:34:0x0091, B:36:0x0099, B:38:0x00a7, B:40:0x00af, B:42:0x00bd, B:44:0x00c5), top: B:120:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0014, B:11:0x001a, B:12:0x001e, B:46:0x00d3, B:47:0x00d6, B:49:0x00da, B:51:0x00e2, B:53:0x00f0, B:55:0x00f8, B:57:0x0106, B:59:0x010e, B:61:0x011c, B:63:0x0124, B:65:0x0132, B:67:0x013a, B:69:0x0148, B:71:0x0150, B:73:0x015e, B:75:0x0166, B:77:0x0174, B:79:0x017c, B:81:0x018a, B:83:0x0192, B:85:0x01a0, B:87:0x01a8, B:89:0x01b6, B:91:0x01be, B:93:0x01cc, B:95:0x01d4, B:97:0x01e2, B:99:0x01ea, B:101:0x01f8, B:103:0x0200, B:105:0x020e, B:107:0x0216, B:109:0x0224, B:111:0x022c, B:113:0x023a, B:115:0x0242, B:14:0x0023, B:16:0x002b, B:18:0x0039, B:20:0x0041, B:22:0x004f, B:24:0x0057, B:26:0x0065, B:28:0x006d, B:30:0x007b, B:32:0x0083, B:34:0x0091, B:36:0x0099, B:38:0x00a7, B:40:0x00af, B:42:0x00bd, B:44:0x00c5), top: B:120:0x0003 }] */
    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.hybrid.PipoContainerServiceImpl.LJIILIIL(java.lang.String, java.lang.String):boolean");
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    public final C1716520ulm LJIILJJIL(String str, String str2) {
        Uri uriLIZLLL;
        C1716520ulm c1716520ulm = new C1716520ulm(str, false);
        try {
            if (!LJIILIIL(str, str2) || (uriLIZLLL = C759510Tqn.LIZLLL(str, "buildPipoContainerSchema")) == null) {
                return c1716520ulm;
            }
            String strLIZJ = C759510Tqn.LIZJ(uriLIZLLL, "target_handler", "buildPipoContainerSchema");
            if (strLIZJ == null || strLIZJ.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("&target_handler=");
                sbLIZ.append(strLIZJ);
                String strLJJIFFI = u.LJJIFFI(str, C2188811AlT.LIZIZ(sbLIZ), "", false);
                if (Intrinsics.LJFF(str, strLJJIFFI)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("target_handler=");
                    sbLIZ2.append(strLIZJ);
                    sbLIZ2.append('&');
                    strLJJIFFI = u.LJJIFFI(strLJJIFFI, C2188811AlT.LIZIZ(sbLIZ2), "", false);
                }
                if (Intrinsics.LJFF(str, strLJJIFFI) && strLIZJ != null && a0.LJJIIZI(strLIZJ, ",", false)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("&target_handler=");
                    sbLIZ3.append(Uri.encode(strLIZJ));
                    strLJJIFFI = u.LJJIFFI(strLJJIFFI, C2188811AlT.LIZIZ(sbLIZ3), "", false);
                    if (Intrinsics.LJFF(str, strLJJIFFI)) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("target_handler=");
                        sbLIZ4.append(Uri.encode(strLIZJ));
                        sbLIZ4.append('&');
                        strLJJIFFI = u.LJJIFFI(strLJJIFFI, C2188811AlT.LIZIZ(sbLIZ4), "", false);
                    }
                }
                uriLIZLLL = C759510Tqn.LIZLLL(strLJJIFFI, "buildPipoContainerSchema for middle");
                if (uriLIZLLL == null) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("middleUri is null, origin_schema is: ");
                    sbLIZ5.append(str);
                    C1725270uzt.LJFF("209", C2188811AlT.LIZIZ(sbLIZ5), null, null);
                    return c1716520ulm;
                }
            }
            Uri.Builder builderAppendQueryParameter = uriLIZLLL.buildUpon().appendQueryParameter("target_handler", "pipo_hybrid").appendQueryParameter("disable_auto_append_crossplatform_plugin", "1");
            if (strLIZJ != null && strLIZJ.length() != 0) {
                builderAppendQueryParameter.appendQueryParameter("pipo_global_props_space", strLIZJ);
            }
            String strLIZIZ = C1725930v0x.LIZIZ(uriLIZLLL);
            if (strLIZIZ != null) {
                builderAppendQueryParameter.appendQueryParameter("pipo_prefetch_key", strLIZIZ);
            }
            return new C1716520ulm(builderAppendQueryParameter.build().toString(), true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("exception, origin_schema is: ");
            sbLIZ6.append(str);
            C1725270uzt.LJFF("209", C2188811AlT.LIZIZ(sbLIZ6), null, null);
            return c1716520ulm;
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    public final void LJFF(String str, InterfaceC1725210uzn interfaceC1725210uzn, boolean z) {
        C1725240uzq.LIZ.LIZIZ();
        Map<String, InterfaceC1725210uzn> map = C1725240uzq.LIZLLL;
        if (!map.containsKey(str) || z) {
            map.put(str, interfaceC1725210uzn);
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoContainerService
    public final void LIZIZ(Context context, String str, String str2, boolean z, int i, final byte[] bArr, String str3, Boolean bool) {
        boolean z2;
        C1725240uzq.LIZ.getClass();
        try {
            String strLIZ = C1725240uzq.LIZ(bool, str, str2, str3, z);
            if (strLIZ != null) {
                if (1 <= i && i < 96) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("open pipo container with url: ");
                sbLIZ.append(strLIZ);
                sbLIZ.append(", use_tux_sheet: ");
                sbLIZ.append(z2);
                C2188811AlT.LIZIZ(sbLIZ);
                SparkContext sparkContext = new SparkContext();
                sparkContext.bizCert = new ThirdPartyBizCert(402681857);
                sparkContext.disableSeclinkExplicit = true;
                sparkContext.LJJLIIJ(strLIZ);
                if (z) {
                    sparkContext.usePreload = true;
                }
                if (bArr != null) {
                    sparkContext.LJJ(InterfaceC1541800qDy.class, new InterfaceC1541800qDy() { // from class: X.0uzs
                        @Override // X.InterfaceC1541800qDy
                        public final byte[] LIZ() {
                            return bArr;
                        }
                    });
                    sparkContext.LJJJJZI(new C1776240wK6(sparkContext, 6));
                }
                if (!z2) {
                    C1541950qED.LIZJ.getClass();
                    new C1541950qED(context, sparkContext).LIZIZ();
                    return;
                }
                SparkFragment sparkFragment = new SparkFragment();
                Bundle bundle = new Bundle();
                C905703gN.LIZ.getClass();
                C1041990dDp.LIZ.getClass();
                C1041990dDp.LIZJ(sparkContext);
                C786410Ut5.LJJJI("SparkContextContainerId", sparkContext.containerId, bundle);
                sparkFragment.setArguments(bundle);
                int iLIZIZ = (C1717770unn.LIZJ().LJIIZILJ().LIZIZ(context) * i) / 100;
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LIZ.LLJJIJI = sparkFragment;
                c1390920mIc.LJIIIIZZ(1);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJL = iLIZIZ;
                tuxSheet.LLJLILLLLZIIL = false;
                tuxSheet.LLJLL = true;
                tuxSheet.LLJLLL = false;
                tuxSheet.show(((C19GS) context).getSupportFragmentManager(), "pipo_container");
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fail to open pipo container, msg: fail to parse input url: ");
            sbLIZ2.append(str);
            C1725270uzt.LJFF("205", C2188811AlT.LIZIZ(sbLIZ2), null, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fail to open pipo container, msg: ");
            sbLIZ3.append(th.getMessage());
            sbLIZ3.append(", scheme: ");
            sbLIZ3.append(str);
            sbLIZ3.append(", biz: ");
            sbLIZ3.append(str2);
            C1725270uzt.LJFF("205", C2188811AlT.LIZIZ(sbLIZ3), null, null);
        }
    }
}
