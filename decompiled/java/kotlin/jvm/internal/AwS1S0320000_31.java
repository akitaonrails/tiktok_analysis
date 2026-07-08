package kotlin.jvm.internal;

import X.AbstractC20356314kz;
import X.C09AY;
import X.C20356614l2;
import X.C20357914lF;
import X.C20361214lm;
import X.C20441214yg;
import X.C20663515tR;
import X.C2188811AlT;
import X.InterfaceC1631620sYq;
import X.InterfaceC20663615tS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.condition.Condition;
import com.bytedance.android.livesdk.condition.ConditionData;
import com.bytedance.android.livesdk.condition.PlayCondition;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public class AwS1S0320000_31 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S0320000_31 awS1S0320000_31) {
        int i;
        String str;
        InterfaceC1631620sYq<? super Condition, ? super LifecycleOwner, ? super C20361214lm, ? extends PlayCondition> interfaceC1631620sYq;
        PlayCondition playConditionInvoke;
        if (((AbstractC20356314kz) awS1S0320000_31.l0).LJJJIL().LJFF == 0) {
            boolean z = true;
            ((AbstractC20356314kz) awS1S0320000_31.l0).LJJJIL().LJFF = 1;
            Function0 function0 = (Function0) awS1S0320000_31.l1;
            if (function0 != null) {
                function0.invoke();
            }
            if (((AbstractC20356314kz) awS1S0320000_31.l0).LJJJJI().getCurrentState() != Lifecycle.State.RESUMED) {
                ((AbstractC20356314kz) awS1S0320000_31.l0).LJJJJI().handleLifecycleEvent(Lifecycle.Event.ON_START);
                ((AbstractC20356314kz) awS1S0320000_31.l0).LJJJJI().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            }
            C20357914lF c20357914lFLJJJIL = ((AbstractC20356314kz) awS1S0320000_31.l0).LJJJIL();
            if (awS1S0320000_31.z3) {
                i = 2;
            } else {
                i = 1;
            }
            c20357914lFLJJJIL.LJI = i;
            if (awS1S0320000_31.z4) {
                AbstractC20356314kz abstractC20356314kz = (AbstractC20356314kz) awS1S0320000_31.l0;
                C20361214lm c20361214lm = (C20361214lm) awS1S0320000_31.l2;
                if (awS1S0320000_31.z3) {
                    abstractC20356314kz.getClass();
                    String str2 = c20361214lm.LJII;
                    if (str2 != null && str2.length() != 0) {
                        z = false;
                    }
                    if (z) {
                        abstractC20356314kz.LJJIJ();
                        C20441214yg.LJ("playbook_auto_run", "runAuto error, conditions is empty");
                    } else {
                        ConditionData conditionDataLIZ = C20356614l2.LIZ(str2);
                        String str3 = null;
                        if (conditionDataLIZ != null) {
                            str3 = conditionDataLIZ.logicalOperator;
                            str = conditionDataLIZ.logicalOperator;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str, "never")) {
                            abstractC20356314kz.LJFF(c20361214lm);
                            C20441214yg.LIZIZ("playbook_auto_run", "runAuto - ConditionName.NEVER");
                        } else if (conditionDataLIZ != null && str3 != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            List<Condition> list = conditionDataLIZ.conditions;
                            if (list != null) {
                                for (Condition condition : list) {
                                    String str4 = condition.name;
                                    if (str4 != null && (interfaceC1631620sYq = abstractC20356314kz.LLJJIII) != null && (playConditionInvoke = interfaceC1631620sYq.invoke(condition, abstractC20356314kz.LJJJJ(), c20361214lm)) != null) {
                                        linkedHashMap.put(str4, playConditionInvoke);
                                    }
                                }
                            }
                            if (linkedHashMap.isEmpty()) {
                                abstractC20356314kz.LJJIJ();
                            } else {
                                try {
                                    PlayEntityUtilKt.LJIILIIL(str3, new AwS645S0100000_31(linkedHashMap, (Map<String, PlayCondition>) 127), new AwS397S0200000_31((Map) linkedHashMap, (Map<String, PlayCondition>) abstractC20356314kz, (AbstractC20356314kz) 136));
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("observeBooleanExpr error ");
                                    sbLIZ.append(th);
                                    C20441214yg.LJ("playbook_auto_run", C2188811AlT.LIZIZ(sbLIZ));
                                }
                            }
                        } else {
                            abstractC20356314kz.LJJIJ();
                            C20441214yg.LJ("playbook_auto_run", "runAuto error, conditionData parse error");
                        }
                    }
                } else {
                    abstractC20356314kz.LJJLI(c20361214lm);
                }
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PlayEntity_");
            sbLIZ2.append(((AbstractC20356314kz) awS1S0320000_31.l0).LJJJIL().LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("transitExecutionStateRunning error, origin: ");
            sbLIZ3.append(((AbstractC20356314kz) awS1S0320000_31.l0).LJJJIL().LJFF);
            C20441214yg.LJ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ3));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S0320000_31 awS1S0320000_31) {
        InterfaceC20663615tS interfaceC20663615tS;
        WeakReference<InterfaceC20663615tS> weakReference;
        InterfaceC20663615tS interfaceC20663615tS2;
        WeakReference<InterfaceC20663615tS> weakReference2 = ((C20663515tR) awS1S0320000_31.l0).LL;
        if (weakReference2 != null && (interfaceC20663615tS = weakReference2.get()) != null && interfaceC20663615tS.getMessageType() == ((InnerPushMessage) awS1S0320000_31.l1).getType() && (weakReference = ((C20663515tR) awS1S0320000_31.l0).LL) != null && (interfaceC20663615tS2 = weakReference.get()) != null) {
            interfaceC20663615tS2.LIZJ((InnerPushMessage) awS1S0320000_31.l1, (int[]) awS1S0320000_31.l2, awS1S0320000_31.z3, awS1S0320000_31.z4);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S0320000_31(AbstractC20356314kz abstractC20356314kz, AbstractC20356314kz abstractC20356314kz2, Function0<Unit> function0, boolean z, boolean z2, C20361214lm c20361214lm) {
        super(0);
        this.$t = c20361214lm;
        this.l0 = abstractC20356314kz;
        this.l1 = abstractC20356314kz2;
        this.z3 = function0;
        this.z4 = z;
        this.l2 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0320000_31(C20663515tR c20663515tR, InnerPushMessage innerPushMessage, int[] iArr, boolean z, boolean z2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20663515tR;
        this.l1 = innerPushMessage;
        this.l2 = iArr;
        this.z3 = z;
        this.z4 = z2;
    }
}
