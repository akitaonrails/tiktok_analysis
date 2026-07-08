package com.ss.android.ugc.aweme.favorites.business.playlist;

import X.C0O5V;
import X.C0O5Z;
import X.C0O62;
import X.C0O65;
import X.C13LE;
import X.C2217381BqS;
import X.C613800O5q;
import X.C613850O5v;
import X.C613860O5w;
import X.C613870O5x;
import X.C613880O5y;
import X.C613890O5z;
import X.EnumC614120O6w;
import X.InterfaceC1631620sYq;
import com.bytedance.mota.storage.motacache.IMotaCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistFavoriteCache;
import com.ss.android.ugc.aweme.favorites.business.playlist.ability.ICollectPlaylist;
import com.ss.android.ugc.aweme.favorites.business.playlist.ability.IPlaylistCollectionState;
import com.ss.android.ugc.aweme.favorites.business.playlist.ability.IPlaylistCollectionStateNotifier;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class PlaylistCollectionStateAgent extends C0O5V<Boolean> implements ICollectPlaylist, IPlaylistCollectionState, IPlaylistCollectionStateNotifier {
    public PlaylistCollectionStateAgent() {
        super(C13LE.LIZ(PlaylistFavoriteCache.class));
    }

    @Override // com.ss.android.ugc.aweme.state.ability.IState
    public final Boolean defaultState() {
        return Boolean.FALSE;
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
        C613850O5v c613850O5v = new C2217381BqS() { // from class: X.0O5v
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PlaylistFavoriteCache) obj).getState();
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
                    if (Intrinsics.LJFF(c613800O5q.LIZ, C13LE.LIZ(PlaylistFavoriteCache.class)) && Intrinsics.LJFF(c613800O5q.LIZIZ, c613850O5v.getName()) && c613800O5q.LIZJ == interfaceC1631620sYq) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next == null) {
                C0O65.LIZLLL.add(new C613800O5q<>(C13LE.LIZ(PlaylistFavoriteCache.class), c613850O5v.getName(), interfaceC1631620sYq));
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
            C613860O5w c613860O5w = new C2217381BqS() { // from class: X.0O5w
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((PlaylistFavoriteCache) obj).getState();
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
                    if (Intrinsics.LJFF(c613800O5q.LIZ, C13LE.LIZ(PlaylistFavoriteCache.class)) && Intrinsics.LJFF(c613800O5q.LIZIZ, c613860O5w.getName()) && c613800O5q.LIZJ == interfaceC1631620sYq) {
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
        return new PlaylistFavoriteCache(str, ((Boolean) obj).booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.favorites.agents.abilities.ICollect
    public final void collect(String str, Map<String, ? extends Object> map, Function2<? super String, ? super Throwable, Unit> function2, Function2<? super String, ? super Boolean, Unit> function22) {
        C613880O5y c613880O5y = new C613880O5y(str);
        new BaseResponse();
        LIZJ(str, c613880O5y, new C613870O5x(), function2, null, function22, AFwS240S0000000_9.get$arr$(82), null, new C0O5Z(this));
    }

    @Override // com.ss.android.ugc.aweme.favorites.agents.abilities.ICollect
    public final void unCollect(String str, Map<String, ? extends Object> map, Function2<? super String, ? super Throwable, Unit> function2, Function2<? super String, ? super Boolean, Unit> function22) {
        C613890O5z c613890O5z = new C613890O5z(str);
        new BaseResponse();
        LIZJ(str, c613890O5z, new C0O62(), function2, null, function22, AFwS240S0000000_9.get$arr$(83), null, new C0O5Z(this));
    }
}
