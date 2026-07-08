package com.ss.android.ugc.tiktok.report;

import X.C06UM;
import X.InterfaceC1381260m32;
import X.InterfaceC1381350m3B;
import X.InterfaceC1387810mDb;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.tiktok.report.experiments.ReportUrlSettingsV2;
import com.ss.android.ugc.tiktok.report.interfaces.IReportInitService;
import com.ss.android.ugc.tiktok.report.interfaces.IReportService;
import com.ss.android.ugc.tiktok.report.utils.ReportConfigUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes22.dex */
public final class ReportInitServiceImpl implements IReportInitService {
    public volatile boolean LIZ;
    public final Object LIZIZ = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0m33] */
    @Override // com.ss.android.ugc.tiktok.report.interfaces.IReportInitService
    public final void LIZ() {
        if (this.LIZ) {
            return;
        }
        synchronized (this.LIZIZ) {
            try {
                if (this.LIZ) {
                    return;
                }
                try {
                    IReportService.LIZ.getClass();
                    IReportService iReportServiceLIZ = C06UM.LIZ();
                    if (!((List) ReportUrlSettingsV2.LIZIZ.getValue()).isEmpty()) {
                        iReportServiceLIZ.LIZIZ(new InterfaceC1381350m3B() { // from class: X.0m2v
                            public final C01GW LIZ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 7));

                            @Override // X.InterfaceC1381350m3B
                            public final String LIZ(C1381180m2u c1381180m2u) {
                                String str = (String) ((Map) this.LIZ.getValue()).get(c1381180m2u.LIZ);
                                if (str == null) {
                                    str = "";
                                }
                                if (str.length() == 0 && (str = (String) ((Map) this.LIZ.getValue()).get("server_default")) == null) {
                                    str = "https://www.tiktok.com/falcon/communitysafety/page/reasons/index.html";
                                }
                                if (c1381180m2u.LJIIIZ && ReportConfigUtils.INSTANCE.resolveNavType(c1381180m2u) == 0 && u.LJJIIJZLJL(str, "aweme://lynxview", false) && !u.LJJIIJZLJL(str, "aweme://lynxview_popup", false)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("aweme://lynxview_popup");
                                    sbLIZ.append(a0.LJJJJZ("aweme://lynxview", str));
                                    return C2188811AlT.LIZIZ(sbLIZ);
                                }
                                return str;
                            }
                        });
                    } else {
                        iReportServiceLIZ.LIZIZ(new InterfaceC1381350m3B() { // from class: X.0m3A
                            /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
                            
                                if (r1.equals("commerce_anchor") == false) goto L4;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
                            
                                if (r1.equals("ba_report_i18n_ne") == false) goto L4;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
                            
                                if (r1.equals("ad") == false) goto L4;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:50:0x00af, code lost:
                            
                                if (r1.equals("lead_gen_report") == false) goto L4;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:53:0x00c3, code lost:
                            
                                return ((com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService) com.ss.android.ugc.aweme.framework.services.ServiceManager.get().getService(com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService.class)).LJIJJ();
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
                            
                                if (r1.equals("ba_report_i18n") == false) goto L4;
                             */
                            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                            @Override // X.InterfaceC1381350m3B
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.String LIZ(X.C1381180m2u r5) {
                                /*
                                    Method dump skipped, instruction units count: 234
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1381340m3A.LIZ(X.0m2u):java.lang.String");
                            }
                        });
                    }
                    iReportServiceLIZ.LIZ(new InterfaceC1381260m32() { // from class: X.0m25
                        @Override // X.InterfaceC1381260m32
                        public final Map LIZ(C1381180m2u c1381180m2u) {
                            return C2097608Jq.LJIIIIZZ(new Pair("show_load_dialog", CardStruct.IStatusCode.DEFAULT), new Pair("hide_nav_bar", "1"), new Pair("locale", ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage()), new Pair("enter_time", String.valueOf(System.currentTimeMillis())), new Pair("no_hw", "1"), new Pair("nav_type", String.valueOf(ReportConfigUtils.INSTANCE.resolveNavType(c1381180m2u))));
                        }
                    });
                    iReportServiceLIZ.LIZ(new InterfaceC1381260m32() { // from class: X.0m31
                        @Override // X.InterfaceC1381260m32
                        public final Map LIZ(C1381180m2u c1381180m2u) {
                            String str;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            if (Intrinsics.LJFF(c1381180m2u.LIZ, "im") || Intrinsics.LJFF(c1381180m2u.LIZ, "im_group_chat") || Intrinsics.LJFF(c1381180m2u.LIZ, "im_typing_recommendation") || Intrinsics.LJFF(c1381180m2u.LIZ, "text_to_sticker")) {
                                if (C1766506vv.LIZ()) {
                                    str = "1";
                                } else {
                                    str = CardStruct.IStatusCode.DEFAULT;
                                }
                                linkedHashMap.put("new_dm_flow", str);
                            }
                            return linkedHashMap;
                        }
                    });
                    iReportServiceLIZ.LIZJ(new InterfaceC1387810mDb() { // from class: X.0m33
                        @Override // X.InterfaceC1387810mDb
                        public final List LIZ() {
                            return C1697810uHb.LJIIJJI(C1381310m37.LJ, C1381360m3C.LIZIZ, C1381290m35.LIZIZ);
                        }

                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
                        /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
                        @Override // X.InterfaceC1387810mDb
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.util.Map LIZIZ(X.C1381180m2u r6) {
                            /*
                                Method dump skipped, instruction units count: 236
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1381270m33.LIZIZ(X.0m2u):java.util.Map");
                        }
                    });
                    this.LIZ = true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
