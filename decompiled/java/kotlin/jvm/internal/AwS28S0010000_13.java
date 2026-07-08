package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C846430XIj;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS28S0010000_13 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S0010000_13(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS28S0010000_13 awS28S0010000_13, Object obj) {
        String str = (String) obj;
        if (awS28S0010000_13.z0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\'');
            sbLIZ.append(str);
            sbLIZ.append('\'');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static final Object invoke$1(AwS28S0010000_13 awS28S0010000_13, Object obj) {
        boolean zIsExpired;
        String oneClickLoginToken;
        BaseLoginMethod baseLoginMethod = (BaseLoginMethod) obj;
        if (C846430XIj.LIZIZ()) {
            zIsExpired = baseLoginMethod.isExpired();
        } else if ((awS28S0010000_13.z0 && ((oneClickLoginToken = baseLoginMethod.getOneClickLoginToken()) == null || oneClickLoginToken.length() == 0)) || baseLoginMethod.isExpired()) {
            zIsExpired = true;
        } else {
            zIsExpired = false;
        }
        return Boolean.valueOf(zIsExpired);
    }
}
