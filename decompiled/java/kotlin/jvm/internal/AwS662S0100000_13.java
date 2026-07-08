package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C189200o6;
import X.C18IR;
import X.C18IS;
import X.C793770VBv;
import X.C823300WRk;
import X.C827360Wcw;
import X.InterfaceC1631620sYq;
import X.InterfaceC794220VDo;
import X.InterfaceC839390WwL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS662S0100000_13 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS662S0100000_13(C823300WRk c823300WRk, int i) {
        super(3);
        this.$t = i;
        this.l0 = c823300WRk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS662S0100000_13(InterfaceC839390WwL interfaceC839390WwL, int i) {
        super(3);
        this.$t = i;
        this.l0 = interfaceC839390WwL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS662S0100000_13(C18IR c18ir, int i) {
        super(3);
        this.$t = i;
        this.l0 = c18ir;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS662S0100000_13(C18IS c18is, int i) {
        super(3);
        this.$t = i;
        this.l0 = c18is;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS662S0100000_13(Function1 function1, Function1<? super List<? extends BaseLoginMethod>, Unit> function12) {
        super(3);
        this.$t = function12;
        this.l0 = function1;
    }

    public static final Object invoke$0(AwS662S0100000_13 awS662S0100000_13, Object obj, Object obj2, Object obj3) {
        String str;
        Object c098200Yq;
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        String str2 = (String) obj3;
        C827360Wcw c827360Wcw = ALog.sConfig;
        if (c827360Wcw != null && (str = c827360Wcw.LJFF) != null) {
            final C18IS c18is = (C18IS) awS662S0100000_13.l0;
            try {
                C793770VBv.LIZ(str, jLongValue, jLongValue2, str2, new InterfaceC794220VDo(c18is) { // from class: X.0VJn
                    @Override // X.InterfaceC794220VDo
                    public final void LIZ() {
                        try {
                            ALog.syncFlush();
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                }, null);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            return C189200o6.m1boximpl(c098200Yq);
        }
        return "fail";
    }

    public static final Object invoke$1(AwS662S0100000_13 awS662S0100000_13, Object obj, Object obj2, Object obj3) {
        return ((InterfaceC839390WwL) awS662S0100000_13.l0).LIZJ((String) obj, (Map) obj2);
    }

    public static final Object invoke$2(AwS662S0100000_13 awS662S0100000_13, Object obj, Object obj2, Object obj3) {
        String str;
        Object c098200Yq;
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        String str2 = (String) obj3;
        C827360Wcw c827360Wcw = ALog.sConfig;
        if (c827360Wcw != null && (str = c827360Wcw.LJFF) != null) {
            final C18IR c18ir = (C18IR) awS662S0100000_13.l0;
            try {
                C793770VBv.LIZ(str, jLongValue, jLongValue2, str2, new InterfaceC794220VDo(c18ir) { // from class: X.0VJm
                    @Override // X.InterfaceC794220VDo
                    public final void LIZ() {
                        try {
                            ALog.syncFlush();
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                }, null);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            return C189200o6.m1boximpl(c098200Yq);
        }
        return "fail";
    }

    public static final Object invoke$3(AwS662S0100000_13 awS662S0100000_13, Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj3;
        map.put("app_version", ((C823300WRk) awS662S0100000_13.l0).LIZJ);
        map.put("is_test_env", String.valueOf(((C823300WRk) awS662S0100000_13.l0).LIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS662S0100000_13 r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            java.util.List r11 = (java.util.List) r11
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r13.booleanValue()
            boolean r0 = r11.isEmpty()
            r4 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto Lab
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r11.iterator()
        L1b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.account.oneclicklogin.storage.EncryptedLoginMethod r0 = (com.ss.android.ugc.aweme.account.oneclicklogin.storage.EncryptedLoginMethod) r0
            java.lang.String r0 = r0.oneClickLoginToken
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L1b
            r3.add(r1)
            goto L1b
        L34:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L41
            X.0WrV r0 = X.C0XUD.LIZJ
            r0.LIZIZ(r3)
        L41:
            X.0XUD r0 = X.C0XUD.LIZ
            r0.getClass()
            java.util.List r3 = X.C0XUD.LIZ(r11, r4)
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L98
            com.ss.android.ugc.aweme.services.ClearLoginCredentialsService r1 = com.ss.android.ugc.aweme.services.ClearLoginCredentialsService.INSTANCE
            boolean r0 = r1.shouldTryClearHLCredentials()
            if (r0 == 0) goto L98
            com.ss.android.ugc.aweme.services.ClearCredScene r0 = com.ss.android.ugc.aweme.services.ClearCredScene.CLEAR_HL
            java.util.List r3 = r1.getUpdatedLoginMethodList(r3, r0)
            r0 = 1
        L64:
            X.0XUE r1 = X.C0XUE.LIZ
            r0 = r0 ^ 1
            r1.LJII(r3, r0)
            java.util.Set r0 = r12.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L73:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            X.0XU4 r0 = X.C0XU4.LIZ
            java.lang.Object r4 = r1.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            r7 = 1
            r0.getClass()
            r8 = r6
            r9 = r6
            X.C0XU4.LJ(r4, r5, r6, r7, r8, r9)
            goto L73
        L98:
            r0 = 0
            goto L64
        L9a:
            java.lang.Object r1 = r10.l0
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            X.0XUD r0 = X.C0XUD.LIZ
            r0.getClass()
            java.util.List r0 = X.C0XUD.LIZJ(r3)
            r1.invoke(r0)
            goto Lb6
        Lab:
            java.lang.Object r1 = r10.l0
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.util.List r0 = java.util.Collections.emptyList()
            r1.invoke(r0)
        Lb6:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS662S0100000_13.invoke$4(kotlin.jvm.internal.AwS662S0100000_13, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
