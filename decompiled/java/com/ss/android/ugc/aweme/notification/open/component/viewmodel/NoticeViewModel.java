package com.ss.android.ugc.aweme.notification.open.component.viewmodel;

import X.AbstractC1901840zag;
import X.AbstractC1901900zam;
import X.AbstractC316870CbV;
import X.C01GW;
import X.C0PEM;
import X.C1901130zZX;
import X.C1901780zaa;
import X.C1901790zab;
import X.C1901870zaj;
import X.C1901910zan;
import X.C1901920zao;
import X.C1901940zaq;
import X.C1903780zdo;
import X.C23250099c;
import X.C452501pT;
import X.EnumC1902000zaw;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeContainerParam;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeViewModel extends BaseNotificationVM {
    public final NoticeContainerParam LLIZLLLIL;
    public final NextLiveData<AbstractC1901840zag> LLJ;
    public final NextLiveData<List<InterfaceC1891350zJl>> LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public final String LLJILJILJ;
    public final int LLJILLL;
    public final String LLJJ;
    public final C01GW LLJJI;
    public C1901780zaa LLJJIII;

    public final void wQ2() {
        C1903780zdo.LIZLLL(C1901910zan.LIZ(this.LLIZLLLIL.biz).LIZIZ);
        C1901130zZX.LIZJ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM, X.InterfaceC1906840zik
    public final CopyOnWriteArraySet<String> nd0() {
        return (CopyOnWriteArraySet) this.LLJJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM, X.InterfaceC1906840zik
    public final String getEnterFrom() {
        return this.LLJILJILJ;
    }

    public NoticeViewModel(NoticeContainerParam noticeContainerParam) {
        String str;
        this.LLIZLLLIL = noticeContainerParam;
        NextLiveData<AbstractC1901840zag> nextLiveData = new NextLiveData<>();
        this.LLJ = nextLiveData;
        this.LLJI = new NextLiveData<>();
        EnumC1902000zaw enumC1902000zaw = noticeContainerParam.biz;
        if (enumC1902000zaw == EnumC1902000zaw.FRIENDS) {
            str = C1901870zaj.LJII.LJ;
        } else {
            str = "";
        }
        this.LLJILJILJ = str;
        this.LLJILLL = C1901910zan.LIZ(enumC1902000zaw).LIZ;
        this.LLJJ = C1901910zan.LIZ(noticeContainerParam.biz).LJFF;
        this.LLJJI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(280));
        nextLiveData.setValue(new AbstractC1901840zag() { // from class: X.0zar
        });
    }

    public final void yQ2(AbstractC1901900zam abstractC1901900zam, AbstractC1901840zag abstractC1901840zag) {
        if (!Intrinsics.LJFF(abstractC1901900zam, C1901920zao.LIZ)) {
            this.LLJ.postValue(abstractC1901840zag);
        }
    }

    public final void xQ2(AbstractC1901900zam abstractC1901900zam, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn, C1901780zaa c1901780zaa) {
        if (Intrinsics.LJFF(abstractC1901900zam, C1901940zaq.LIZ)) {
            wQ2();
        }
        this.LLJJIII = null;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1901790zab(this, c1901780zaa, interfaceC1364105Vn, abstractC1901900zam, null), 2);
    }
}
