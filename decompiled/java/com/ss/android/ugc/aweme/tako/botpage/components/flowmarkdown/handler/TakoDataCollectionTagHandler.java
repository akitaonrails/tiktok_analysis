package com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.handler;

import X.AbstractC21434518uV;
import X.C01GW;
import X.C07HI;
import X.C098200Yq;
import X.C09CT;
import X.C0H1N;
import X.C0H1Z;
import X.C14S7;
import X.C1860130yVP;
import X.C189200o6;
import X.C1E7C;
import X.C21432118u7;
import X.C434170H0t;
import X.C452501pT;
import X.C597040NbK;
import X.C689590R3d;
import X.InterfaceC21435018ua;
import X.InterfaceC434180H0u;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class TakoDataCollectionTagHandler extends AbstractC21434518uV {
    public final C1860130yVP LIZ;
    public final InterfaceC434180H0u LIZIZ;
    public final List<String> LIZJ = Collections.singletonList("data-collection");
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 742));
    public int LJ;

    public static final class DataCollectionValue {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String id;

        public DataCollectionValue() {
            this("");
        }

        public DataCollectionValue(String str) {
            this.id = str;
        }
    }

    @Override // X.AbstractC21434218uS
    public final Collection<String> LIZJ() {
        return this.LIZJ;
    }

    public TakoDataCollectionTagHandler(C1860130yVP c1860130yVP, InterfaceC434180H0u interfaceC434180H0u) {
        this.LIZ = c1860130yVP;
        this.LIZIZ = interfaceC434180H0u;
    }

    @Override // X.AbstractC21434518uV
    public final Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
        String str;
        String str2;
        DataCollectionValue dataCollectionValueLIZJ;
        Object c098200Yq;
        InterfaceC434180H0u interfaceC434180H0u = this.LIZIZ;
        if (interfaceC434180H0u == null || (str = interfaceC21435018ua.LIZLLL().get("type")) == null || !Intrinsics.LJFF(str, "video") || (str2 = interfaceC21435018ua.LIZLLL().get("value")) == null) {
            return null;
        }
        if (((Boolean) C1E7C.LJ.getValue()).booleanValue()) {
            dataCollectionValueLIZJ = C0H1Z.LIZ.LIZJ(str2);
            if (dataCollectionValueLIZJ == null) {
                try {
                    c098200Yq = (DataCollectionValue) C597040NbK.LIZ().LJII(str2, DataCollectionValue.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                dataCollectionValueLIZJ = (DataCollectionValue) c098200Yq;
                if (dataCollectionValueLIZJ == null) {
                    return null;
                }
                C0H1Z.LIZ.LIZLLL(str2, dataCollectionValueLIZJ);
            }
        } else {
            dataCollectionValueLIZJ = (DataCollectionValue) GsonProtectorUtils.fromJson(C597040NbK.LIZ(), str2, DataCollectionValue.class);
        }
        if (C07HI.LIZIZ) {
            String str3 = dataCollectionValueLIZJ.id;
            int i = this.LJ;
            this.LJ = i + 1;
            interfaceC434180H0u.tb(str3, new C689590R3d(Integer.valueOf(i), Integer.valueOf(interfaceC21435018ua.start()), null, 4));
        }
        return new C434170H0t(this.LIZ, dataCollectionValueLIZJ.id, (C0H1N) this.LIZLLL.getValue(), ((C0H1N) this.LIZLLL.getValue()).LJI, interfaceC434180H0u);
    }
}
