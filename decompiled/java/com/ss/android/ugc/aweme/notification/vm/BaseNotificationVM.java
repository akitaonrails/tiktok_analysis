package com.ss.android.ugc.aweme.notification.vm;

import X.C01GW;
import X.C11NJ;
import X.C11O8;
import X.C11S5;
import X.C1701940uOG;
import X.C452501pT;
import X.InterfaceC1906840zik;
import Y.AfS188S0100000_19;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes20.dex */
public class BaseNotificationVM extends ViewModel implements InterfaceC1906840zik {
    public final C01GW LL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(275));
    public final String LLILLJJLI = "notification_page";
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(276));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(277));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(279));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(278));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(280));

    @Override // X.InterfaceC1906840zik
    public final void Dx2() {
    }

    public CopyOnWriteArraySet<String> nd0() {
        return (CopyOnWriteArraySet) this.LLILZIL.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C11NJ) this.LL.getValue()).LJ();
    }

    public String getEnterFrom() {
        return this.LLILLJJLI;
    }

    public final void vQ2(BaseNotice baseNotice) {
        C11O8 c11o8LJJJLZIJ = NotificationApi.LIZ().LJIILL(baseNotice.nid).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
        MusNotice musNotice = (MusNotice) baseNotice;
        ((C11NJ) this.LL.getValue()).LIZ(c11o8LJJJLZIJ.LJJLL(new AfS188S0100000_19(musNotice, 27), new AfS188S0100000_19(musNotice, 28)));
    }

    @Override // X.InterfaceC1906840zik
    public final void UJ(BaseNotice baseNotice, Function0<Unit> function0) {
        String str;
        if (baseNotice != null && (str = baseNotice.nid) != null && str.length() != 0 && !nd0().contains(baseNotice.nid)) {
            nd0().add(baseNotice.nid);
            ((AwS572S0100000_28) function0).invoke();
        }
    }
}
