package com.bytedance.android.livesdk.broadcast.extendedscreen.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface ExtendedScreenActivityApi {
    @InterfaceC1501170pAR("/webcast/activity/event/")
    C11NZ<C470590Icr<Unit>> reportOpenEvent(@InterfaceC1501070pAH("activity") String str, @InterfaceC1501070pAH("aid") String str2, @InterfaceC1485405rg ExtendedScreenEventBody extendedScreenEventBody);
}
