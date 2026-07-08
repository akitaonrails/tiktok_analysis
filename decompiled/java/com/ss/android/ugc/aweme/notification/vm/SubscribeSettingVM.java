package com.ss.android.ugc.aweme.notification.vm;

import X.C01GW;
import X.C11NJ;
import X.C11S5;
import X.C1701940uOG;
import X.C452501pT;
import Y.AfS178S0100000_9;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.bean.NotificationSubscribeSettingsList;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class SubscribeSettingVM extends ViewModel {
    public static final /* synthetic */ int LLILLL = 0;
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(285));
    public final MutableLiveData<NotificationSubscribeSettingsList> LLILLJJLI = new MutableLiveData<>();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C11NJ) this.LL.getValue()).LJ();
    }

    public final void vQ2(int i) {
        ((C11NJ) this.LL.getValue()).LIZ(NotificationApi.LIZ().LJJJJ(i).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS178S0100000_9(this, 29), new AfS178S0100000_9(this, 30)));
    }
}
