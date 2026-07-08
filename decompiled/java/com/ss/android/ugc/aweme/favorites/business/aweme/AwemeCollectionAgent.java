package com.ss.android.ugc.aweme.favorites.business.aweme;

import X.AbstractC1604130rqV;
import X.AnonymousClass0956;
import X.C01GW;
import X.C01SV;
import X.C0BOD;
import X.C0O5Q;
import X.C0O5S;
import X.C0O5V;
import X.C0O65;
import X.C0O68;
import X.C0O6R;
import X.C1206780hVc;
import X.C13LE;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C613690O5f;
import X.C613750O5l;
import X.C613760O5m;
import X.C613780O5o;
import X.C613800O5q;
import X.C613810O5r;
import X.C613820O5s;
import X.C613830O5t;
import X.C613840O5u;
import X.C786410Ut5;
import X.EnumC614120O6w;
import X.InterfaceC1631620sYq;
import com.bytedance.mota.storage.motacache.IMotaCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeFavoriteCache;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionState;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.ICollectAweme;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.verify.FavoriteFakeWriteExpV2SettingModel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS445S0200000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AwemeCollectionAgent extends C0O5V<Boolean> implements ICollectAweme, IAwemeCollectionState, IAwemeCollectionStateNotifier {
    public final C01GW LIZLLL;

    public AwemeCollectionAgent() {
        super(C13LE.LIZ(AwemeFavoriteCache.class));
        this.LIZLLL = C452501pT.LIZIZ(new C613810O5r());
    }

    public final AbstractC1604130rqV LJFF() {
        return (AbstractC1604130rqV) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.state.ability.IState
    public final Boolean defaultState() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionState
    public final Boolean LIZ(Aweme aweme) {
        if (aweme == null) {
            return Boolean.FALSE;
        }
        return currentState(aweme.getAid(), Boolean.valueOf(AwemeExtKt.isCollected(aweme)));
    }

    @Override // X.C0O5V
    public final Object LJ(Object obj) {
        return Boolean.valueOf(!((Boolean) obj).booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.state.ability.IStateNotifier
    public final void addSubscriber(InterfaceC1631620sYq<? super String, Object, ? super EnumC614120O6w, Unit> interfaceC1631620sYq) {
        int readHoldCount;
        C613800O5q<?> next;
        ReentrantReadWriteLock reentrantReadWriteLock = C0O65.LIZ;
        C613820O5s c613820O5s = new C2217381BqS() { // from class: X.0O5s
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AwemeFavoriteCache) obj).getState();
            }
        };
        ReentrantReadWriteLock reentrantReadWriteLock2 = C0O65.LIZ;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock2.readLock();
        int i = 0;
        if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock2.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock2.writeLock();
        writeLock.lock();
        try {
            Iterator<C613800O5q<?>> it2 = C0O65.LIZLLL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C613800O5q<?> c613800O5q = next;
                    if (Intrinsics.LJFF(c613800O5q.LIZ, C13LE.LIZ(AwemeFavoriteCache.class)) && Intrinsics.LJFF(c613800O5q.LIZIZ, c613820O5s.getName()) && c613800O5q.LIZJ == interfaceC1631620sYq) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next == null) {
                C0O65.LIZLLL.add(new C613800O5q<>(C13LE.LIZ(AwemeFavoriteCache.class), c613820O5s.getName(), interfaceC1631620sYq));
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.android.ugc.aweme.state.ability.IStateNotifier
    public final void removeSubscriber(InterfaceC1631620sYq<? super String, Object, ? super EnumC614120O6w, Unit> interfaceC1631620sYq) {
        int readHoldCount;
        if (interfaceC1631620sYq != null) {
            ReentrantReadWriteLock reentrantReadWriteLock = C0O65.LIZ;
            C613830O5t c613830O5t = new C2217381BqS() { // from class: X.0O5t
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((AwemeFavoriteCache) obj).getState();
                }
            };
            ReentrantReadWriteLock reentrantReadWriteLock2 = C0O65.LIZ;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock2.readLock();
            int i = 0;
            if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                readHoldCount = reentrantReadWriteLock2.getReadHoldCount();
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock.unlock();
                }
            } else {
                readHoldCount = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock2.writeLock();
            writeLock.lock();
            try {
                for (C613800O5q<?> c613800O5q : C0O65.LIZLLL) {
                    if (Intrinsics.LJFF(c613800O5q.LIZ, C13LE.LIZ(AwemeFavoriteCache.class)) && Intrinsics.LJFF(c613800O5q.LIZIZ, c613830O5t.getName()) && c613800O5q.LIZJ == interfaceC1631620sYq) {
                        C0O65.LIZLLL.remove(c613800O5q);
                    }
                }
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        }
    }

    @Override // X.C0O5X
    public final IMotaCache LIZIZ(Object obj, String str) {
        return new AwemeFavoriteCache(str, ((Boolean) obj).booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.favorites.agents.abilities.ICollect
    public final void collect(String str, Map<String, ? extends Object> map, Function2<? super String, ? super Throwable, Unit> function2, Function2<? super String, ? super Boolean, Unit> function22) {
        Map<String, ? extends Object> mapLJ = map;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        LJI(str, true, mapLJ, function2, function22);
    }

    @Override // com.ss.android.ugc.aweme.favorites.agents.abilities.ICollect
    public final void unCollect(String str, Map<String, ? extends Object> map, Function2<? super String, ? super Throwable, Unit> function2, Function2<? super String, ? super Boolean, Unit> function22) {
        Map<String, ? extends Object> mapLJ = map;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        LJI(str, false, mapLJ, function2, function22);
    }

    public final void LJI(String str, boolean z, Map<String, ? extends Object> map, Function2<? super String, ? super Throwable, Unit> function2, Function2<? super String, ? super Boolean, Unit> function22) {
        Integer num;
        int iIntValue;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        boolean z2;
        Object obj = map.get("privacy_setting");
        C613690O5f c613690O5f = null;
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Object obj2 = map.get("ad_id");
        if (obj2 != null) {
            string = obj2.toString();
        } else {
            string = null;
        }
        Object obj3 = map.get("creative_id");
        if (obj3 != null) {
            string2 = obj3.toString();
        } else {
            string2 = null;
        }
        Object obj4 = map.get("log_extra");
        if (obj4 != null) {
            string3 = obj4.toString();
        } else {
            string3 = null;
        }
        Object obj5 = map.get("user_agent");
        if (obj5 != null) {
            string4 = obj5.toString();
        } else {
            string4 = null;
        }
        Object obj6 = map.get("access");
        if (obj6 != null) {
            string5 = obj6.toString();
        } else {
            string5 = null;
        }
        Object obj7 = map.get("package");
        if (obj7 != null) {
            string6 = obj7.toString();
        } else {
            string6 = null;
        }
        Object obj8 = map.get("google_aid");
        if (obj8 != null) {
            string7 = obj8.toString();
        } else {
            string7 = null;
        }
        Object obj9 = map.get("duration");
        if (obj9 != null) {
            string8 = obj9.toString();
        } else {
            string8 = null;
        }
        Object obj10 = map.get("play_order");
        if (obj10 != null) {
            string9 = obj10.toString();
        } else {
            string9 = null;
        }
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LIZJ, null, null, new C01SV(null), 3);
        C613780O5o c613780O5o = new C613780O5o(str, z ? 1 : 0, iIntValue, string, string2, string3, string4, string5, string6, string7, string8, string9);
        C613760O5m c613760O5m = new C613760O5m(new BaseResponse());
        C0O5Q c0o5q = new C0O5Q(function22, str, this, z, anonymousClass0956LIZLLL);
        AwS445S0200000_9 awS445S0200000_9 = new AwS445S0200000_9(function2, anonymousClass0956LIZLLL, 2);
        if (C0O6R.LIZ == C0O68.AVAILABLE) {
            z2 = true;
        } else {
            z2 = false;
        }
        C613750O5l c613750O5l = new C613750O5l(this, z2, str, z);
        C1206780hVc.LIZ(C786410Ut5.j4("/aweme/v1/aweme/collect/", Arrays.copyOf(new Object[0], 0)));
        if (((Boolean) C0BOD.LIZ.getValue()).booleanValue()) {
            C01GW c01gw = C613840O5u.LIZIZ;
            c613690O5f = new C613690O5f(((FavoriteFakeWriteExpV2SettingModel) c01gw.getValue()).retryCount, ((FavoriteFakeWriteExpV2SettingModel) c01gw.getValue()).retryInterval, true);
        }
        LIZJ(str, c613780O5o, c613760O5m, awS445S0200000_9, new AwS623S0100000_9(anonymousClass0956LIZLLL, 20), c0o5q, c613750O5l, c613690O5f, new C0O5S(str, this));
    }
}
