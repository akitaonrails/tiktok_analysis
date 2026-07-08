package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C1251350ifV;
import X.C1324750kZt;
import X.C13LP;
import X.C189200o6;
import X.C291001Au;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public class AwS91S0110000_3 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AwS91S0110000_3 awS91S0110000_3, Object obj) {
        return C1251350ifV.LIZ((C1251350ifV) obj, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, awS91S0110000_3.z1, null, null, null, (C291001Au) awS91S0110000_3.l0, null, null, null, null, null, null, null, null, null, null, null, null, null, -8912897, 31);
    }

    public static final Object invoke$1(AwS91S0110000_3 awS91S0110000_3, Object obj) {
        int i;
        List<String> urlList;
        String str;
        Object c098200Yq;
        Effect effect = (Effect) obj;
        if (((Boolean) ((Function1) awS91S0110000_3.l0).invoke(effect)).booleanValue()) {
            i = 2;
        } else {
            i = 0;
        }
        if (awS91S0110000_3.z1) {
            UrlModel iconUrl = effect.getIconUrl();
            Uri uri = null;
            Object obj2 = null;
            uri = null;
            uri = null;
            if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
                try {
                    c098200Yq = UriProtector.parse(str);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj2 = c098200Yq;
                }
                uri = (Uri) obj2;
            }
            if (C1324750kZt.LJIIZILJ(uri)) {
                i++;
            }
        }
        return new Pair(effect.getId(), Integer.valueOf(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S0110000_3(C291001Au c291001Au, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c291001Au;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S0110000_3(AFwS229S0000000_2 aFwS229S0000000_2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = aFwS229S0000000_2;
        this.z1 = z;
    }
}
