package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C10DS;
import X.C19208210Cq;
import X.C211000rc;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C495701wR;
import X.C609600Nva;
import X.InterfaceC497601wk;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager;
import com.ss.android.ugc.aweme.unifiedauthapi.model.ServerIntelligentRequest;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes29.dex */
public class AwS23S0410000_28 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS23S0410000_28 awS23S0410000_28, Object obj, Object obj2) {
        T tLJFF;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        if (zBooleanValue) {
            C259800zU c259800zU = (C259800zU) awS23S0410000_28.l0;
            if (awS23S0410000_28.z4) {
                PushUserGuidePopupManager pushUserGuidePopupManager = PushUserGuidePopupManager.LIZ;
                UnifiedAuthPopupConfig unifiedAuthPopupConfig = (UnifiedAuthPopupConfig) awS23S0410000_28.l1;
                Context context = (Context) awS23S0410000_28.l2;
                C10DS c10ds = (C10DS) awS23S0410000_28.l3;
                pushUserGuidePopupManager.getClass();
                tLJFF = PushUserGuidePopupManager.LJ(context, c10ds, unifiedAuthPopupConfig, zBooleanValue2);
            } else {
                PushUserGuidePopupManager pushUserGuidePopupManager2 = PushUserGuidePopupManager.LIZ;
                UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = (UnifiedAuthPopupConfig) awS23S0410000_28.l1;
                Context context2 = (Context) awS23S0410000_28.l2;
                C10DS c10ds2 = (C10DS) awS23S0410000_28.l3;
                pushUserGuidePopupManager2.getClass();
                tLJFF = PushUserGuidePopupManager.LJFF(context2, c10ds2, unifiedAuthPopupConfig2, zBooleanValue2);
            }
            c259800zU.element = tLJFF;
        } else {
            C211000rc.LIZ("[Push]");
            ((UnifiedAuthPopupConfig) awS23S0410000_28.l1).setFilterReason("server_filtered");
            PushUserGuidePopupManager pushUserGuidePopupManager3 = PushUserGuidePopupManager.LIZ;
            Context context3 = (Context) awS23S0410000_28.l2;
            UnifiedAuthPopupConfig unifiedAuthPopupConfig3 = (UnifiedAuthPopupConfig) awS23S0410000_28.l1;
            pushUserGuidePopupManager3.getClass();
            PushUserGuidePopupManager.LIZJ(context3, unifiedAuthPopupConfig3, false);
            C10DS c10ds3 = (C10DS) awS23S0410000_28.l3;
            if (c10ds3 != null) {
                c10ds3.LIZ("server_filtered");
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS23S0410000_28 awS23S0410000_28, Object obj, Object obj2) {
        T tLJFF;
        InterfaceC497601wk interfaceC497601wkLIZ;
        LifecycleOwner lifecycleOwner;
        ServerIntelligentRequest serverIntelligentRequest = (ServerIntelligentRequest) obj2;
        if (((Boolean) obj).booleanValue()) {
            if (serverIntelligentRequest != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("doIntelligentCheck(needServerCheck: true, serverJudgeType: ");
                sbLIZ.append(C609600Nva.LIZ().serverJudgeType);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                C211000rc.LIZ("[Push]");
                C19208210Cq c19208210Cq = C19208210Cq.LIZ;
                Context context = (Context) awS23S0410000_28.l0;
                UnifiedAuthPopupConfig unifiedAuthPopupConfig = (UnifiedAuthPopupConfig) awS23S0410000_28.l1;
                AwS23S0410000_28 awS23S0410000_282 = new AwS23S0410000_28(context, (C10DS) awS23S0410000_28.l2, unifiedAuthPopupConfig, (C259800zU) awS23S0410000_28.l3, awS23S0410000_28.z4, 0);
                c19208210Cq.getClass();
                C211000rc.LIZ("ServerIntelligentHelper");
                if (context == 0 || !(context instanceof LifecycleOwner) || (lifecycleOwner = (LifecycleOwner) context) == null || (interfaceC497601wkLIZ = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
                    interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
                }
                C23250099c.LIZLLL(interfaceC497601wkLIZ, C0PEM.LIZJ, null, new C495701wR(serverIntelligentRequest, unifiedAuthPopupConfig, awS23S0410000_282, null), 2);
            } else {
                C259800zU c259800zU = (C259800zU) awS23S0410000_28.l3;
                if (awS23S0410000_28.z4) {
                    PushUserGuidePopupManager pushUserGuidePopupManager = PushUserGuidePopupManager.LIZ;
                    boolean z = !Intrinsics.LJFF(((UnifiedAuthPopupConfig) awS23S0410000_28.l1).pitayaSuccess, Boolean.TRUE);
                    UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = (UnifiedAuthPopupConfig) awS23S0410000_28.l1;
                    Context context2 = (Context) awS23S0410000_28.l0;
                    C10DS c10ds = (C10DS) awS23S0410000_28.l2;
                    pushUserGuidePopupManager.getClass();
                    tLJFF = PushUserGuidePopupManager.LJ(context2, c10ds, unifiedAuthPopupConfig2, z);
                } else {
                    PushUserGuidePopupManager pushUserGuidePopupManager2 = PushUserGuidePopupManager.LIZ;
                    boolean z2 = !Intrinsics.LJFF(((UnifiedAuthPopupConfig) awS23S0410000_28.l1).pitayaSuccess, Boolean.TRUE);
                    UnifiedAuthPopupConfig unifiedAuthPopupConfig3 = (UnifiedAuthPopupConfig) awS23S0410000_28.l1;
                    Context context3 = (Context) awS23S0410000_28.l0;
                    C10DS c10ds2 = (C10DS) awS23S0410000_28.l2;
                    pushUserGuidePopupManager2.getClass();
                    tLJFF = PushUserGuidePopupManager.LJFF(context3, c10ds2, unifiedAuthPopupConfig3, z2);
                }
                c259800zU.element = tLJFF;
            }
        } else {
            C211000rc.LIZ("[Push]");
            ((UnifiedAuthPopupConfig) awS23S0410000_28.l1).setFilterReason("pitaya_filtered");
            PushUserGuidePopupManager pushUserGuidePopupManager3 = PushUserGuidePopupManager.LIZ;
            Context context4 = (Context) awS23S0410000_28.l0;
            UnifiedAuthPopupConfig unifiedAuthPopupConfig4 = (UnifiedAuthPopupConfig) awS23S0410000_28.l1;
            pushUserGuidePopupManager3.getClass();
            PushUserGuidePopupManager.LIZJ(context4, unifiedAuthPopupConfig4, false);
            C10DS c10ds3 = (C10DS) awS23S0410000_28.l2;
            if (c10ds3 != null) {
                c10ds3.LIZ("pitaya_filtered");
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS23S0410000_28(android.content.Context r3, X.C10DS r4, com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig r5, X.C259800zU r6, boolean r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            if (r8 == 0) goto L14
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r4
            r1.l3 = r6
            r1.z4 = r7
            r0 = 2
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r6
            r1.z4 = r7
            r1.l1 = r5
            r1.l2 = r3
            r1.l3 = r4
            r0 = 2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS23S0410000_28.<init>(android.content.Context, X.10DS, com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig, X.00zU, boolean, int):void");
    }
}
