package com.ss.android.ugc.aweme.minis.page.main.functions.notification;

import X.AbstractC738140SxQ;
import X.C0QSJ;
import X.C13LE;
import X.C1801080wyA;
import X.C1801100wyC;
import X.C2217381BqS;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1324510kZV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.minis.page.main.scope.MinisMainScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MinisNotificationSubscriptionAssem extends AbstractC738140SxQ implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public volatile InterfaceC1324510kZV LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public C0QSJ LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MinisNotificationSubscriptionAssem.class, "coreAbility", "getCoreAbility()Lcom/ss/android/ugc/aweme/minis/page/main/ability/MinisCoreAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MinisMainScope.class});
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final InterfaceC1324510kZV m265do() {
        InterfaceC1324510kZV interfaceC1324510kZV = this.LL;
        if (interfaceC1324510kZV == null) {
            synchronized (this) {
                interfaceC1324510kZV = this.LL;
                if (interfaceC1324510kZV == null) {
                    InterfaceC1324510kZV interfaceC1324510kZVBo = bo();
                    this.LL = interfaceC1324510kZVBo;
                    return interfaceC1324510kZVBo;
                }
            }
        }
        return interfaceC1324510kZV;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MinisMainScope.class);
        return arrayList;
    }

    public final InterfaceC1324510kZV bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLILLL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLILLJJLI;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLILLJJLI = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MinisMainScope.class});
            this.LLILLL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1324510kZV interfaceC1324510kZV = (InterfaceC1324510kZV) c0qsjLIZLLL.getAbility(InterfaceC1324510kZV.class);
        C687700QyG.LJ(interfaceC1324510kZV, InterfaceC1324510kZV.class);
        return interfaceC1324510kZV;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Function2<? super Integer, ? super Function1<? super C1801100wyC, Unit>, Unit> function2 = C1801080wyA.LLILLL;
        C1801080wyA.LLILLL = new AwS623S0100000_9(this, 86);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Function2<? super Integer, ? super Function1<? super C1801100wyC, Unit>, Unit> function2 = C1801080wyA.LLILLL;
        C1801080wyA.LLILLL = null;
    }
}
