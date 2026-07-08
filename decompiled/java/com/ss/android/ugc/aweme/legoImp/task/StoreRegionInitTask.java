package com.ss.android.ugc.aweme.legoImp.task;

import X.C0C64;
import X.C0CCZ;
import X.C0VC5;
import X.C0VU1;
import X.C0VZ0;
import X.C0X2A;
import X.C1150504el;
import X.C1515120pWw;
import X.C1E21;
import X.C20301014c4;
import X.C20301214c6;
import X.C2273401Dyc;
import X.C2344809Gs;
import X.C792400V6o;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC20301414c8;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.legoImp.task.region.RegionParamInterceptor;
import java.util.List;
import java.util.Locale;
import java.util.Observer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC20234614Fk
public final class StoreRegionInitTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "StoreRegionInitTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !C1E21.LIZIZ();
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1150504el.LIZ().LIZLLL("method_init_store_region_duration", false);
        C20301214c6 c20301214c6 = C20301014c4.LIZ;
        C2344809Gs.LJFF("TikTok_StoreRegion", "TikTokStoreRegionManager init");
        C2273401Dyc.LIZ.getClass();
        C20301014c4.LIZ(new InterfaceC20301414c8() { // from class: X.14cC
            @Override // X.InterfaceC20301414c8
            public final void LIZ(C20301214c6 c20301214c62, C20301214c6 c20301214c63) throws JSONException {
                if (!Intrinsics.LJFF(c20301214c62.LIZLLL.LIZIZ, c20301214c63.LIZLLL.LIZIZ) || Intrinsics.LJFF(C2273401Dyc.LIZLLL, "")) {
                    String str = c20301214c62.LIZIZ;
                    Locale locale = Locale.ROOT;
                    String lowerCase = str.toLowerCase(locale);
                    C2273401Dyc.LIZ.getClass();
                    C830490Whz<String, String> c830490Whz = C2273401Dyc.LJI;
                    String str2 = c830490Whz.get(lowerCase);
                    String str3 = "row";
                    if (str2 == null) {
                        str2 = "row";
                    }
                    C2273401Dyc.LIZJ = str2;
                    String lowerCase2 = c20301214c63.LIZIZ.toLowerCase(locale);
                    C2273401Dyc.LJ = lowerCase2;
                    String str4 = c830490Whz.get(lowerCase2);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    C2273401Dyc.LIZLLL = str3;
                    for (C0VEJ c0vej : C2273401Dyc.LIZIZ) {
                        if (!Intrinsics.LJFF(C2273401Dyc.LIZJ, C2273401Dyc.LIZLLL)) {
                            c0vej.LIZ(C2273401Dyc.LIZJ, C2273401Dyc.LIZLLL);
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C2273401Dyc.LIZJ);
                    sbLIZ.append("_to_");
                    sbLIZ.append(C2273401Dyc.LIZLLL);
                    jSONObject.put("update_type", C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(lowerCase);
                    sbLIZ2.append("_to_");
                    sbLIZ2.append(lowerCase2);
                    jSONObject.put("update_type2", C2188811AlT.LIZIZ(sbLIZ2));
                    C793770VBv.LJII("store_region_update", jSONObject, null, null);
                    C2273401Dyc c2273401Dyc = C2273401Dyc.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onStoreRegionUpdate: ");
                    sbLIZ3.append(lowerCase);
                    sbLIZ3.append("_to_");
                    sbLIZ3.append(lowerCase2);
                    sbLIZ3.append(' ');
                    sbLIZ3.append(C2273401Dyc.LIZJ);
                    sbLIZ3.append("_to_");
                    sbLIZ3.append(C2273401Dyc.LIZLLL);
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
            }
        });
        C20301014c4.LIZ = C20301014c4.LIZJ();
        C0X2A.LIZIZ().addObserver(new Observer() { // from class: X.14c5
            /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
            @Override // java.util.Observer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void update(java.util.Observable r9, java.lang.Object r10) {
                /*
                    r8 = this;
                    boolean r0 = r9 instanceof X.C0X2A
                    if (r0 == 0) goto La4
                    java.util.HashMap r10 = (java.util.HashMap) r10
                    java.lang.String r0 = "store_idc"
                    java.lang.Object r6 = r10.get(r0)
                    java.lang.String r6 = (java.lang.String) r6
                    java.lang.String r0 = "store_region"
                    java.lang.Object r5 = r10.get(r0)
                    java.lang.String r5 = (java.lang.String) r5
                    java.lang.String r0 = "region_source"
                    java.lang.Object r1 = r10.get(r0)
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.String r0 = "sec_uid"
                    java.lang.Object r4 = r10.get(r0)
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.String r0 = "logid"
                    java.lang.Object r7 = r10.get(r0)
                    java.lang.String r7 = (java.lang.String) r7
                    if (r1 == 0) goto La1
                    java.util.Locale r0 = java.util.Locale.ROOT
                    java.lang.String r2 = r1.toLowerCase(r0)
                    if (r2 == 0) goto La1
                    int r1 = r2.hashCode()
                    r0 = 99455(0x1847f, float:1.39366E-40)
                    if (r1 == r0) goto L96
                    r0 = 115792(0x1c450, float:1.62259E-40)
                    if (r1 == r0) goto L8b
                    r0 = 103145323(0x625df6b, float:3.1197192E-35)
                    if (r1 != r0) goto La1
                    java.lang.String r0 = "local"
                    boolean r0 = r2.equals(r0)
                    if (r0 == 0) goto La1
                    X.10oH r3 = X.EnumC19357510oH.LOCAL
                L55:
                    X.14c6 r2 = new X.14c6
                    java.lang.String r1 = ""
                    if (r6 != 0) goto L5c
                    r6 = r1
                L5c:
                    if (r5 != 0) goto L5f
                    r5 = r1
                L5f:
                    X.14cB r0 = new X.14cB
                    if (r4 != 0) goto L64
                    r4 = r1
                L64:
                    if (r7 != 0) goto L67
                    r7 = r1
                L67:
                    r0.<init>(r4, r7)
                    r2.<init>(r6, r5, r3, r0)
                    X.14c6 r3 = X.C20301014c4.LIZ
                    X.14c6 r0 = X.C20301014c4.LIZ
                    X.C20301014c4.LIZ = r2
                    java.util.List<X.14c8> r0 = X.C20301014c4.LIZIZ
                    java.util.Iterator r2 = r0.iterator()
                L79:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto La4
                    java.lang.Object r1 = r2.next()
                    X.14c8 r1 = (X.InterfaceC20301414c8) r1
                    X.14c6 r0 = X.C20301014c4.LIZ
                    r1.LIZ(r3, r0)
                    goto L79
                L8b:
                    java.lang.String r0 = "uid"
                    boolean r0 = r2.equals(r0)
                    if (r0 == 0) goto La1
                    X.10oH r3 = X.EnumC19357510oH.UID
                    goto L55
                L96:
                    java.lang.String r0 = "did"
                    boolean r0 = r2.equals(r0)
                    if (r0 == 0) goto La1
                    X.10oH r3 = X.EnumC19357510oH.DID
                    goto L55
                La1:
                    X.10oH r3 = X.EnumC19357510oH.NONE
                    goto L55
                La4:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20301114c5.update(java.util.Observable, java.lang.Object):void");
            }
        });
        C1515120pWw.LIZIZ(new RegionParamInterceptor());
        C20301014c4.LIZ(new InterfaceC20301414c8() { // from class: X.14c9
            @Override // X.InterfaceC20301414c8
            public final void LIZ(C20301214c6 c20301214c62, C20301214c6 c20301214c63) {
                if (C1207404nw.LIZ()) {
                    IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
                    if (iPNSChangeRegionService != null) {
                        String str = c20301214c62.LIZIZ;
                        Locale locale = Locale.ROOT;
                        iPNSChangeRegionService.LIZJ(str.toLowerCase(locale), c20301214c62.LIZLLL.LIZ, c20301214c63.LIZIZ.toLowerCase(locale), c20301214c63.LIZLLL.LIZ);
                    }
                } else {
                    IComplianceBusinessService iComplianceBusinessServiceLJI = ComplianceServiceProvider.LJI();
                    String str2 = c20301214c62.LIZIZ;
                    Locale locale2 = Locale.ROOT;
                    iComplianceBusinessServiceLJI.LJJ(str2.toLowerCase(locale2), c20301214c62.LIZLLL.LIZ, c20301214c63.LIZIZ.toLowerCase(locale2), c20301214c63.LIZLLL.LIZ);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tt store region manager callback: previousStoreRegionInfo = ");
                sbLIZ.append(c20301214c62);
                sbLIZ.append(", currentStoreRegionInfo = ");
                sbLIZ.append(c20301214c63);
                C2344809Gs.LJFF("TikTok_StoreRegion", C2188811AlT.LIZIZ(sbLIZ));
            }
        });
        C1150504el.LIZ().LJI("method_init_store_region_duration", false);
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "enable_apm_isolation", true, false)) {
            String strLIZIZ = C20301014c4.LIZIZ();
            C792400V6o.LJJIFFI = strLIZIZ;
            C0VC5.LJFF = strLIZIZ;
            C20301014c4.LIZ(new InterfaceC20301414c8() { // from class: X.14cA
                @Override // X.InterfaceC20301414c8
                public final void LIZ(C20301214c6 c20301214c62, C20301214c6 c20301214c63) {
                    this.LIZ.getClass();
                    String strLIZIZ2 = C20301014c4.LIZIZ();
                    C792400V6o.LJJIFFI = strLIZIZ2;
                    C0VC5.LJFF = strLIZIZ2;
                }
            });
        }
    }
}
