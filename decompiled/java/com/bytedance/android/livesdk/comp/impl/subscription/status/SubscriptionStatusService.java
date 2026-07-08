package com.bytedance.android.livesdk.comp.impl.subscription.status;

import X.AbstractC509530JyZ;
import X.C09IC;
import X.C09IR;
import X.C0K90;
import X.C0KA5;
import X.C0KA9;
import X.C0KAA;
import X.C0KAB;
import X.C0KAD;
import X.C0KAF;
import X.C0KAG;
import X.C0KAI;
import X.C1BNE;
import X.C21287018Se;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C492290JSh;
import X.C509520JyY;
import X.C509540Jya;
import X.C512060K6i;
import X.EnumC2252401DDy;
import X.InterfaceC332260D0u;
import android.util.LruCache;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes8.dex */
public class SubscriptionStatusService implements ISubscriptionStatusService {
    public final C0KA9 LL = C0KA5.LIZ;
    public final String LLILLJJLI = getClass().getName();
    public final LruCache<String, InterfaceC332260D0u<AbstractC509530JyZ>> LLILLL = new LruCache<>(5);

    @Override // com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService
    public final void Dl2(Room room) {
        User owner;
        Long lValueOf;
        String secUid = null;
        if (room != null) {
            owner = room.getOwner();
        } else {
            owner = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Entering Room ");
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", whose owner is Anchor ");
        if (owner != null) {
            secUid = owner.getSecUid();
        }
        sbLIZ.append(secUid);
        sbLIZ.append('.');
        C2188811AlT.LIZIZ(sbLIZ);
        this.LL.LIZIZ();
        LIZ(owner);
    }

    public final C2252321DDq LIZ(User user) {
        String secUid;
        Object c512060K6i;
        if (user == null || (secUid = user.getSecUid()) == null) {
            return null;
        }
        SubscribeInfo subscribeInfo = user.getSubscribeInfo();
        if (subscribeInfo != null && subscribeInfo.isSubscribed()) {
            c512060K6i = new C512060K6i(null, null, null, 7);
        } else {
            SubscribeInfo subscribeInfo2 = user.getSubscribeInfo();
            if (subscribeInfo2 != null && subscribeInfo2.isInGracePeriod()) {
                c512060K6i = C509540Jya.LIZJ;
            } else {
                c512060K6i = C509520JyY.LIZJ;
            }
        }
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(c512060K6i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Creating a new anchorStatusMap entry for Anchor ");
        sbLIZ.append(secUid);
        sbLIZ.append('.');
        C2188811AlT.LIZIZ(sbLIZ);
        this.LL.LIZIZ();
        this.LLILLL.put(secUid, c2252321DDqLIZ);
        return c2252321DDqLIZ;
    }

    public final InterfaceC332260D0u<AbstractC509530JyZ> LIZIZ(User user) {
        String secUid;
        if (user != null && (secUid = user.getSecUid()) != null) {
            InterfaceC332260D0u<AbstractC509530JyZ> interfaceC332260D0u = this.LLILLL.get(secUid);
            if (interfaceC332260D0u == null) {
                return LIZ(user);
            }
            return interfaceC332260D0u;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService
    public final void b92(Room room) {
        String secUid;
        User owner;
        Long lValueOf = null;
        if (room != null && (owner = room.getOwner()) != null) {
            secUid = owner.getSecUid();
        } else {
            secUid = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Exiting Room ");
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", whose owner is Anchor ");
        sbLIZ.append(secUid);
        sbLIZ.append('.');
        C2188811AlT.LIZIZ(sbLIZ);
        this.LL.LIZIZ();
        if (secUid != null) {
            this.LLILLL.remove(secUid);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService
    public final AbstractC509530JyZ m70(Room room) {
        User owner;
        AbstractC509530JyZ value;
        if (room != null) {
            owner = room.getOwner();
        } else {
            owner = null;
        }
        InterfaceC332260D0u<AbstractC509530JyZ> interfaceC332260D0uLIZIZ = LIZIZ(owner);
        if (interfaceC332260D0uLIZIZ == null || (value = interfaceC332260D0uLIZIZ.getValue()) == null) {
            return C509520JyY.LIZJ;
        }
        return value;
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService
    public final C21287018Se cp1(LifecycleOwner lifecycleOwner, Object obj) {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 0, EnumC2252401DDy.DROP_OLDEST, 2);
        this.LL.LIZJ(null, obj, lifecycleOwner, new C0KAF(c2252331DDrLIZIZ));
        return new C21287018Se(C09IC.LIZ(c2252331DDrLIZIZ));
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService
    public final void jw(C0KAG c0kag, C0K90 c0k90) {
        this.LL.jw(c0kag, c0k90);
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService
    public final C0KAB AV1(Room room, C512060K6i c512060K6i, C0KAA c0kaa) {
        User owner;
        if (room != null) {
            owner = room.getOwner();
        } else {
            owner = null;
        }
        return LIZJ(owner, c512060K6i, c0kaa);
    }

    public final C0KAB LIZJ(User user, AbstractC509530JyZ abstractC509530JyZ, C0KAI c0kai) {
        AbstractC509530JyZ value;
        InterfaceC332260D0u<AbstractC509530JyZ> interfaceC332260D0uLIZIZ = LIZIZ(user);
        C0KA9 c0ka9 = this.LL;
        if (interfaceC332260D0uLIZIZ != null) {
            value = interfaceC332260D0uLIZIZ.getValue();
        } else {
            value = null;
        }
        C0KAB c0kabLIZ = c0ka9.LIZ(user, value, abstractC509530JyZ, c0kai, this.LLILLJJLI);
        if (c0kabLIZ == C0KAB.UPDATED && interfaceC332260D0uLIZIZ != null) {
            interfaceC332260D0uLIZIZ.setValue(abstractC509530JyZ);
        }
        return c0kabLIZ;
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService
    public final C492290JSh fi2(Room room, Object obj, LifecycleOwner lifecycleOwner) {
        User owner;
        if (room != null) {
            owner = room.getOwner();
        } else {
            owner = null;
        }
        return rM2(owner, obj, lifecycleOwner);
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService
    public final C492290JSh rM2(User user, Object obj, LifecycleOwner lifecycleOwner) {
        InterfaceC332260D0u<AbstractC509530JyZ> interfaceC332260D0uLIZIZ = LIZIZ(user);
        if (interfaceC332260D0uLIZIZ == null) {
            return null;
        }
        if (user != null) {
            this.LL.LIZJ(user.getSecUid(), obj, lifecycleOwner, new C0KAD(this, user));
            return new C492290JSh(C09IC.LIZIZ(interfaceC332260D0uLIZIZ));
        }
        throw new IllegalStateException("Check failed.");
    }
}
