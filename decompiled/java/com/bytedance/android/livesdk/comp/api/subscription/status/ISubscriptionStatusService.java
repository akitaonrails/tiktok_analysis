package com.bytedance.android.livesdk.comp.api.subscription.status;

import X.AbstractC509530JyZ;
import X.C006A;
import X.C0K90;
import X.C0K9Q;
import X.C0KAA;
import X.C0KAB;
import X.C0KAG;
import X.C21287018Se;
import X.C492290JSh;
import X.C512060K6i;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes8.dex */
public interface ISubscriptionStatusService extends C006A {
    public static final C0K9Q LJIIIZ = C0K9Q.LIZ;

    C0KAB AV1(Room room, C512060K6i c512060K6i, C0KAA c0kaa);

    void Dl2(Room room);

    void b92(Room room);

    C21287018Se cp1(LifecycleOwner lifecycleOwner, Object obj);

    C492290JSh fi2(Room room, Object obj, LifecycleOwner lifecycleOwner);

    void jw(C0KAG c0kag, C0K90 c0k90);

    AbstractC509530JyZ m70(Room room);

    C492290JSh rM2(User user, Object obj, LifecycleOwner lifecycleOwner);
}
