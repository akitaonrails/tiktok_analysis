package com.bytedance.common.jato.exception;

import X.C0CFC;
import X.C2104908Ml;
import X.C310480CFa;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ExceptionManager {

    public interface ExceptionOccurredCallback {
        void onExceptionHandled(Throwable th, int i);
    }

    public static class ExceptionRule {
        public final String className;
        public String[] deoptClassNames;
        public String[] deoptMethodNames;
        public String[] deoptMethodSignatures;
        public final String exceptionClassName;
        public final String exceptionMessage;
        public final int jumpDexPc;
        public final String methodName;
        public final String methodSignature;
        public final int strategy;

        public boolean isValid() {
            String str;
            String str2;
            String str3;
            String str4 = this.className;
            if (str4 == null || str4.isEmpty() || (str = this.methodName) == null || str.isEmpty() || (str2 = this.methodSignature) == null || str2.isEmpty() || (str3 = this.exceptionClassName) == null || str3.isEmpty()) {
                return false;
            }
            return this.strategy != 2 || this.jumpDexPc >= 0;
        }

        public String getClassName() {
            return this.className;
        }

        public String[] getDeoptClassNames() {
            return this.deoptClassNames;
        }

        public String[] getDeoptMethodNames() {
            return this.deoptMethodNames;
        }

        public String[] getDeoptMethodSignatures() {
            return this.deoptMethodSignatures;
        }

        public String getExceptionClassName() {
            return this.exceptionClassName;
        }

        public String getExceptionMessage() {
            return this.exceptionMessage;
        }

        public int getJumpDexPc() {
            return this.jumpDexPc;
        }

        public String getMethodName() {
            return this.methodName;
        }

        public String getMethodSignature() {
            return this.methodSignature;
        }

        public int getStrategy() {
            return this.strategy;
        }

        public ExceptionRule(C310480CFa c310480CFa) {
            this.className = c310480CFa.LIZ;
            this.methodName = c310480CFa.LIZIZ;
            this.methodSignature = c310480CFa.LIZJ;
            this.exceptionClassName = c310480CFa.LIZLLL;
            this.exceptionMessage = c310480CFa.LJ;
            this.jumpDexPc = c310480CFa.LJFF;
            this.strategy = c310480CFa.LJI;
            List<String> list = c310480CFa.LJII;
            if (list != null && !((ArrayList) list).isEmpty()) {
                int size = ((ArrayList) c310480CFa.LJII).size();
                List<String> list2 = c310480CFa.LJIIIIZZ;
                if (list2 != null && c310480CFa.LJIIIZ != null && ((ArrayList) list2).size() == size && ((ArrayList) c310480CFa.LJIIIZ).size() == size) {
                    this.deoptClassNames = (String[]) ((ArrayList) c310480CFa.LJII).toArray(new String[0]);
                    this.deoptMethodNames = (String[]) ((ArrayList) c310480CFa.LJIIIIZZ).toArray(new String[0]);
                    this.deoptMethodSignatures = (String[]) ((ArrayList) c310480CFa.LJIIIZ).toArray(new String[0]);
                }
            }
        }
    }

    public static native boolean nativeStartExceptionHandling(ExceptionRule[] exceptionRuleArr, ExceptionOccurredCallback exceptionOccurredCallback);

    static {
        C2104908Ml.LIZIZ();
    }

    public static void LIZ(ExceptionRule[] exceptionRuleArr) {
        C0CFC c0cfc = new ExceptionOccurredCallback() { // from class: X.0CFC
            @Override // com.bytedance.common.jato.exception.ExceptionManager.ExceptionOccurredCallback
            public final void onExceptionHandled(final Throwable th, int i) {
                String str;
                final String str2 = "Dynamic_Try_Catch_Msg";
                Exception exc = new Exception(str2, th) { // from class: X.0CFD
                    public static final int $stable = 8;
                };
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Dynamic_Try_Catch_Report_");
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                str = "UNKNOWN";
                            } else {
                                str = "JUMP_TO_PC";
                            }
                        } else {
                            str = "SKIP_METHOD";
                        }
                    } else {
                        str = "SKIP_LINE";
                    }
                    sbLIZ.append(str);
                    C805380Via.LIZJ(exc, C2188811AlT.LIZIZ(sbLIZ));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        };
        if (exceptionRuleArr != null && exceptionRuleArr.length != 0) {
            nativeStartExceptionHandling(exceptionRuleArr, c0cfc);
        }
    }
}
