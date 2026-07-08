package com.ss.android.ugc.aweme.unifiedauth.push.tracking;

import X.AbstractC19484711Kz;
import X.C013C;
import X.C01GW;
import X.C08F4;
import X.C10GS;
import X.C11S5;
import X.C19334110kV;
import X.C19334310kX;
import X.C19479811Jc;
import X.C19483411Km;
import X.C20684815ws;
import X.C211000rc;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C452501pT;
import X.C827070WcT;
import X.InterfaceC1487280oo2;
import X.InterfaceC19217410Ge;
import X.InterfaceC19483011Ki;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.unifiedauth.push.tracking.PushOptInPopupEventManager;
import com.ss.android.ugc.aweme.unifiedauth.push.tracking.api.UploadPopupEventsApi;
import com.ss.android.ugc.aweme.unifiedauthapi.push.tracking.IPushOptInTrackingApi;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PushOptInPopupEventManager implements IPushOptInTrackingApi {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(404));

    public final InterfaceC19217410Ge LIZ() {
        return (InterfaceC19217410Ge) this.LIZ.getValue();
    }

    public static void LIZIZ(C10GS c10gs) {
        C211000rc.LIZ("[Push]");
        C2344009Gk c2344009Gk = new C2344009Gk();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c10gs.LIZ);
        C827070WcT.LIZ.getClass();
        sbLIZ.append(C827070WcT.LIZJ());
        c2344009Gk.LJIIIIZZ("trigger_id", C08F4.LIZ(C2188811AlT.LIZIZ(sbLIZ)));
        c2344009Gk.LIZLLL(c10gs.LIZ, "trigger_time");
        c2344009Gk.LJIIIIZZ("trigger_scene", c10gs.LIZIZ);
        c2344009Gk.LJIIIIZZ("channel_type", "push");
        c2344009Gk.LJIIIIZZ("pop_up_type", c10gs.LJFF);
        c2344009Gk.LIZLLL(c10gs.LIZJ, "frequency_control");
        c2344009Gk.LJIIIIZZ("filter_reason", c10gs.LJ);
        c2344009Gk.LIZJ(c10gs.LIZLLL, "show_type");
        c2344009Gk.LIZJ(c10gs.LJI, "action_type");
        c2344009Gk.LJIIIIZZ("action_type_str", c10gs.LJIIIIZZ);
        c2344009Gk.LIZLLL(c10gs.LJII, "action_time");
        C20684815ws.LJIILLIIL("trigger_permission_pop_up", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.push.tracking.IPushOptInTrackingApi
    public final boolean LIZLLL(final C10GS c10gs, final boolean z) {
        C211000rc.LIZ("[Push]");
        C013C c013c = new C013C();
        c013c.element = true;
        new C19479811Jc(new C19483411Km(AbstractC19484711Kz.LJIJI(new Callable() { // from class: X.10Gc
            /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r11 = this;
                    java.lang.String r10 = "PushOptInPopupEventManager@77d3.recordOptInPopupTrigger$1"
                    X.C1C7U.LIZ(r10)
                    com.ss.android.ugc.aweme.unifiedauth.push.tracking.PushOptInPopupEventManager r0 = r11.LL
                    X.10Ge r1 = r0.LIZ()
                    X.10GS r0 = r2
                    long r2 = r1.LJ(r0)
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "recordOptInPopupTrigger("
                    r1.append(r0)
                    r1.append(r2)
                    java.lang.String r0 = "): "
                    r1.append(r0)
                    X.10GS r0 = r2
                    r0.LIZ()
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    r1.append(r0)
                    X.C2188811AlT.LIZIZ(r1)
                    java.lang.String r9 = "[Push]"
                    X.C211000rc.LIZ(r9)
                    boolean r0 = r3
                    if (r0 == 0) goto L8f
                    com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
                    r0.getClass()
                    java.lang.String r1 = "push_guide_intelligent_data_report_open"
                    r0 = 0
                    boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r1, r0)
                    if (r0 == 0) goto L8f
                    com.ss.android.ugc.aweme.unifiedauth.push.tracking.PushOptInPopupEventManager r1 = r11.LL
                    X.10GS r0 = r2
                    r1.getClass()
                    com.ss.android.ugc.aweme.unifiedauth.push.tracking.PushOptInPopupEventManager.LIZIZ(r0)
                    long r3 = java.lang.System.currentTimeMillis()
                    X.01GW r0 = X.C19217510Gf.LIZ
                    java.lang.Object r5 = r0.getValue()
                    com.bytedance.keva.Keva r5 = (com.bytedance.keva.Keva) r5
                    java.lang.String r2 = "last_reported_ts"
                    r0 = 0
                    long r1 = r5.getLong(r2, r0)
                    long r7 = r3 - r1
                    X.01GW r0 = X.C2255281DPa.LJ
                    java.lang.Object r0 = r0.getValue()
                    java.lang.Number r0 = (java.lang.Number) r0
                    long r5 = r0.longValue()
                    int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                    if (r0 < 0) goto L8c
                    X.C211000rc.LIZ(r9)
                    com.ss.android.ugc.aweme.unifiedauth.push.tracking.PushOptInPopupEventManager r0 = r11.LL
                    X.10Ge r0 = r0.LIZ()
                    java.util.List r0 = r0.LIZIZ(r1, r3)
                    X.C19216610Fw.LIZIZ(r0)
                L88:
                    X.C1C7U.LIZIZ(r10)
                    return r0
                L8c:
                    X.13BV r0 = X.C13BV.INSTANCE
                    goto L88
                L8f:
                    X.13BV r0 = X.C13BV.INSTANCE
                    goto L88
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CallableC19217210Gc.call():java.lang.Object");
            }
        }), new InterfaceC19483011Ki() { // from class: X.10Gb
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return !((List) obj).isEmpty();
            }
        }), new InterfaceC1487280oo2() { // from class: X.11Nb
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C19482111Jz c19482111JzLJJJJIZL = C11NZ.LJJJJIZL((Iterable) obj);
                int iIntValue = ((Number) C2255281DPa.LJFF.getValue()).intValue();
                Callable callableAsCallable = EnumC23083092r.asCallable();
                C1701890uOB.LIZIZ(iIntValue, "count");
                C1701890uOB.LIZIZ(iIntValue, "skip");
                C1701890uOB.LIZ(callableAsCallable, "bufferSupplier is null");
                return new C19488311Mj(c19482111JzLJJJJIZL, iIntValue, iIntValue, callableAsCallable).LJIJI(new InterfaceC1487280oo2() { // from class: X.10GU
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj2) {
                        UploadPopupEventsApi.LIZ.getClass();
                        return C10GT.LIZ((List) obj2);
                    }
                });
            }
        }).LJLJLLL().LJIIJ(new C19334110kV(this, 4)).LJJIJIIJI(C11S5.LIZ()).LIZ(new C19334310kX(c013c, 0));
        return c013c.element;
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.push.tracking.IPushOptInTrackingApi
    public final boolean LIZJ(final int i, final long j, final long j2, final String str) {
        C211000rc.LIZ("[Push]");
        C013C c013c = new C013C();
        c013c.element = true;
        new C19479811Jc(new C19483411Km(AbstractC19484711Kz.LJIJI(new Callable() { // from class: X.10Gd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<C10GS> listLIZIZ;
                C1C7U.LIZ("PushOptInPopupEventManager@77d3.updateOptInPopupAction$1");
                C211000rc.LIZ("[Push]");
                this.LL.LIZ().LIZJ(i, j, j2, str);
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("push_guide_intelligent_data_report_open", false)) {
                    C10GS c10gsLJFF = this.LL.LIZ().LJFF(j);
                    if (c10gsLJFF != null) {
                        this.LL.getClass();
                        PushOptInPopupEventManager.LIZIZ(c10gsLJFF);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j3 = ((Keva) C19217510Gf.LIZ.getValue()).getLong("last_reported_ts", 0L);
                    if (jCurrentTimeMillis - j3 >= ((Number) C2255281DPa.LJ.getValue()).longValue()) {
                        C211000rc.LIZ("[Push]");
                        listLIZIZ = this.LL.LIZ().LIZIZ(j3, jCurrentTimeMillis);
                        C19216610Fw.LIZIZ(listLIZIZ);
                    } else {
                        listLIZIZ = C13BV.INSTANCE;
                    }
                } else {
                    listLIZIZ = C13BV.INSTANCE;
                }
                C1C7U.LIZIZ("PushOptInPopupEventManager@77d3.updateOptInPopupAction$1");
                return listLIZIZ;
            }
        }), new InterfaceC19483011Ki() { // from class: X.08Bo
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return !((List) obj).isEmpty();
            }
        }), new InterfaceC1487280oo2() { // from class: X.11Nc
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C19482111Jz c19482111JzLJJJJIZL = C11NZ.LJJJJIZL((Iterable) obj);
                int iIntValue = ((Number) C2255281DPa.LJFF.getValue()).intValue();
                Callable callableAsCallable = EnumC23083092r.asCallable();
                C1701890uOB.LIZIZ(iIntValue, "count");
                C1701890uOB.LIZIZ(iIntValue, "skip");
                C1701890uOB.LIZ(callableAsCallable, "bufferSupplier is null");
                return new C19488311Mj(c19482111JzLJJJJIZL, iIntValue, iIntValue, callableAsCallable).LJIJI(new InterfaceC1487280oo2() { // from class: X.10GV
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj2) {
                        UploadPopupEventsApi.LIZ.getClass();
                        return C10GT.LIZ((List) obj2);
                    }
                });
            }
        }).LJLJLLL().LJIIJ(new C19334110kV(this, 6)).LJJIJIIJI(C11S5.LIZ()).LIZ(new C19334310kX(c013c, 1));
        return c013c.element;
    }
}
