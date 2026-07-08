package com.bytedance.ies.im.core.exp;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IMSDKExcludeMediaCardAutoResendExp {
    public static final IMSDKExcludeMediaCardAutoResendExp LIZ = new IMSDKExcludeMediaCardAutoResendExp();
    public static final ExcludeMediaCardAutoResendConfig LIZIZ = new ExcludeMediaCardAutoResendConfig(C1697810uHb.LJIIJJI(1802, 1803));

    public static final class ExcludeMediaCardAutoResendConfig {

        @C09CT("msg_types")
        public final List<Integer> msgTypes;

        public ExcludeMediaCardAutoResendConfig() {
            this(C1697810uHb.LJIIJJI(1802, 1803));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExcludeMediaCardAutoResendConfig) && Intrinsics.LJFF(this.msgTypes, ((ExcludeMediaCardAutoResendConfig) obj).msgTypes);
        }

        public int hashCode() {
            return this.msgTypes.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ExcludeMediaCardAutoResendConfig(msgTypes=");
            sbLIZ.append(this.msgTypes);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ExcludeMediaCardAutoResendConfig(List<Integer> list) {
            this.msgTypes = list;
        }
    }
}
