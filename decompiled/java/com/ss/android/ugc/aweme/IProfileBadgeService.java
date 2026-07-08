package com.ss.android.ugc.aweme;

import X.InterfaceC1256690io7;
import X.InterfaceC20579715fv;
import X.InterfaceC20579815fw;

/* JADX INFO: loaded from: classes32.dex */
public interface IProfileBadgeService {
    void refresh();

    void removeProfileBadgeIdListener(InterfaceC20579715fv interfaceC20579715fv);

    void removeProfileBadgeIsShowListener(InterfaceC20579815fw interfaceC20579815fw);

    void subscribe(InterfaceC1256690io7 interfaceC1256690io7);

    void unsubscribe(InterfaceC1256690io7 interfaceC1256690io7);

    void updateProfileBadgeId(long j, InterfaceC20579715fv interfaceC20579715fv);

    void updateProfileBadgeIsShow(boolean z, InterfaceC20579815fw interfaceC20579815fw);
}
