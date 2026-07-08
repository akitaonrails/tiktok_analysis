package com.bytedance.android.livesdk.list;

import X.C09JN;
import X.C0IOL;
import X.C0IR2;
import X.C0ISF;
import X.C0ITM;
import X.C1161920gLG;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C13LP;
import X.C15438062q;
import X.C1701940uOG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C466790ISf;
import X.C786410Ut5;
import X.InterfaceC466780ISe;
import Y.ARunnableS13S0100100_7;
import Y.AfS176S0100000_7;
import Y.AfS2S0200100_7;
import Y.AfS3S0200200_7;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiPlusFeedRoomListProviderV2 extends C0IOL implements GenericLifecycleObserver {
    public final C466790ISf LLILZIL;
    public final InterfaceC466780ISe LLILZLL;
    public final List<RoomInfo> LLIZ;
    public final List<Room> LLIZLLLIL;
    public final List<EnterRoomConfig> LLJ;
    public final List<Room> LLJI;
    public final List<EnterRoomConfig> LLJIJIL;
    public final AtomicBoolean LLJILJIL;
    public final AtomicBoolean LLJILJILJ;
    public FeedExtra LLJILLL;
    public int LLJJ;
    public final boolean LLJJI;
    public final String LLJJIII;
    public final String LLJJIJI;
    public final long LLJJIJIIJIL;
    public final C11NJ LLJJIJIL;
    public final HashSet<Long> LLJJJ;
    public boolean LLJJJIL;
    public final HashMap<Long, String> LLJJJJ;
    public final HashMap<Long, String> LLJJJJJIL;
    public String LLJJJJLIIL;
    public int LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public int LLJL;

    @Override // X.C0IOL
    public final String LJJI() {
        return "MultiPlusFeedRoomListProviderV2";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.C0IOL
    public final List<Room> LJJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LLIZLLLIL);
        arrayList.addAll(this.LLJI);
        return arrayList;
    }

    @Override // X.C0IOL
    public final boolean LJJIFFI() {
        FeedExtra feedExtra = this.LLJILLL;
        if (feedExtra != null) {
            return feedExtra.hasMore;
        }
        return true;
    }

    @Override // X.C0IOL
    public final boolean LJJIIJ() {
        return this.LLJILJIL.get();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LLJJIJIL.LJ();
        C0IR2.LIZLLL(null);
    }

    @Override // X.C0IOG
    public final int size() {
        return ((CopyOnWriteArrayList) this.LLIZLLLIL).size() + ((ArrayList) this.LLJI).size();
    }

    @Override // X.C0IOL
    public final String LJIJI() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C0IOL
    public final int LJIJJLI() {
        return this.LLJJL;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065 A[PHI: r1
      0x0065: PHI (r1v10 com.bytedance.android.livesdkapi.session.EnterRoomConfig) = 
      (r1v9 com.bytedance.android.livesdkapi.session.EnterRoomConfig)
      (r1v11 com.bytedance.android.livesdkapi.session.EnterRoomConfig)
     binds: [B:17:0x0039, B:25:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0IOG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdkapi.session.EnterRoomConfig LIZIZ(int r9) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProviderV2.LIZIZ(int):com.bytedance.android.livesdkapi.session.EnterRoomConfig");
    }

    @Override // X.C0IOG
    public final int LJIIIIZZ(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig enterRoomConfig2;
        EnterRoomConfig.RoomsData roomsData;
        long j = enterRoomConfig.mRoomsData.roomId;
        int size = size();
        for (int i = 0; i < size; i++) {
            if (i < ((CopyOnWriteArrayList) this.LLJ).size() && (enterRoomConfig2 = (EnterRoomConfig) ListProtector.get(this.LLJ, i)) != null && (roomsData = enterRoomConfig2.mRoomsData) != null && j == roomsData.roomId) {
                return i;
            }
            int size2 = i - ((CopyOnWriteArrayList) this.LLJ).size();
            if (size2 >= 0 && size2 < ((ArrayList) this.LLJI).size() && j == ((Room) ListProtector.get(this.LLJI, size2)).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.C0IOL, X.C0IOG
    public final Room LJIIJJI(int i) {
        if (i < 0 || i >= size()) {
            return null;
        }
        if (i < ((CopyOnWriteArrayList) this.LLIZLLLIL).size()) {
            int iMax = Math.max(0, i - 2);
            int iMin = Math.min(((CopyOnWriteArrayList) this.LLIZLLLIL).size() - 1, i + 2);
            if (ListProtector.get(this.LLIZLLLIL, iMax) == null) {
                LJJJIL(Math.max(0, (iMax - 6) + 1), Math.min(6, iMax + 1), this.LLIZ);
            } else if (ListProtector.get(this.LLIZLLLIL, iMin) == null) {
                LJJJIL(iMin, Math.min(((CopyOnWriteArrayList) this.LLIZLLLIL).size(), iMin + 10) - iMin, this.LLIZ);
            }
            return (Room) ListProtector.get(this.LLIZLLLIL, i);
        }
        if (((ArrayList) this.LLJIJIL).size() <= i - ((CopyOnWriteArrayList) this.LLIZLLLIL).size()) {
            return null;
        }
        return (Room) ListProtector.get(this.LLJI, i - ((CopyOnWriteArrayList) this.LLIZLLLIL).size());
    }

    @Override // X.C0IOL
    public final void LJIIL(C0ISF<Room> c0isf) {
        boolean z;
        List<Room> list = this.LLIZLLLIL;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((CopyOnWriteArrayList) list).iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Room room = (Room) next;
            if (room != null && c0isf.LIZ(room)) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            int iIndexOf = ((CopyOnWriteArrayList) this.LLIZLLLIL).indexOf(it3.next());
            if (iIndexOf >= 0) {
                if (iIndexOf < ((CopyOnWriteArrayList) this.LLIZLLLIL).size()) {
                    ListProtector.remove(this.LLIZLLLIL, iIndexOf);
                    this.LLJJ--;
                    z = true;
                }
                if (iIndexOf < ((CopyOnWriteArrayList) this.LLJ).size()) {
                    ListProtector.remove(this.LLJ, iIndexOf);
                }
                if (iIndexOf < ((ArrayList) this.LLIZ).size()) {
                    ListProtector.remove(this.LLIZ, iIndexOf);
                }
            }
        }
        Iterator it4 = ((ArrayList) this.LLJI).iterator();
        Iterator it5 = ((ArrayList) this.LLJIJIL).iterator();
        while (it4.hasNext() && it5.hasNext()) {
            Room room2 = (Room) it4.next();
            it5.next();
            if (c0isf.LIZ(room2)) {
                int iIndexOf2 = ((ArrayList) this.LLJI).indexOf(room2);
                if (iIndexOf2 >= 0 && iIndexOf2 <= this.LLJJ - ((CopyOnWriteArrayList) this.LLIZLLLIL).size()) {
                    this.LLJJ--;
                }
                it4.remove();
                it5.remove();
                z = true;
            }
        }
        if (z) {
            LJIILJJIL();
        }
    }

    @Override // X.C0IOL
    public final List<Long> LJIILL(int i) {
        EnterRoomConfig.RoomsData roomsData;
        Long lValueOf;
        EnterRoomConfig.RoomsData roomsData2;
        Long lValueOf2;
        if (i < 0 || i >= size()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = size();
        for (int i2 = i + 1; i2 < size; i2++) {
            if (i2 < ((CopyOnWriteArrayList) this.LLJ).size()) {
                EnterRoomConfig enterRoomConfig = (EnterRoomConfig) ListProtector.get(this.LLJ, i2);
                if (enterRoomConfig != null && (roomsData2 = enterRoomConfig.mRoomsData) != null && (lValueOf2 = Long.valueOf(roomsData2.roomId)) != null) {
                    arrayList.add(lValueOf2);
                }
            } else {
                EnterRoomConfig enterRoomConfig2 = (EnterRoomConfig) ListProtector.get(this.LLJIJIL, i2 - ((CopyOnWriteArrayList) this.LLJ).size());
                if (enterRoomConfig2 != null && (roomsData = enterRoomConfig2.mRoomsData) != null && (lValueOf = Long.valueOf(roomsData.roomId)) != null) {
                    arrayList.add(lValueOf);
                }
            }
        }
        return arrayList;
    }

    @Override // X.C0IOL
    public final String LJIL(long j) {
        return this.LLJJJJJIL.get(Long.valueOf(j));
    }

    @Override // X.C0IOL
    public final void LJJIIJZLJL(int i) {
        long j;
        C11NZ<C0ITM<Pair<List<FeedItem>, FeedExtra>>> c11nzLIZLLL;
        EnterRoomConfig.RoomsData roomsData;
        HashMap map = new HashMap();
        map.put("room_count_before_request", Integer.valueOf((((ArrayList) LJJ()).size() - i) - 1));
        map.put("request_scene", "MultiPlusFeedRoomListProvider");
        map.put("is_landscape", Boolean.FALSE);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LLJL = i;
        if (this.LLJILJIL.get()) {
            return;
        }
        EnterRoomConfig enterRoomConfig = this.LLILZIL.LIZIZ;
        long j2 = 0;
        if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            j = roomsData.roomId;
        } else {
            j = 0;
        }
        if ((((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse()) && !TextUtils.isEmpty(this.LLILZIL.LIZ) && a0.LJJIIZI(this.LLILZIL.LIZ, "/webcast/feed/", false) && !a0.LJJIIZI(this.LLILZIL.LIZ, "&debug=true", false)) {
            C466790ISf c466790ISf = this.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILZIL.LIZ);
            sbLIZ.append("&debug=true");
            c466790ISf.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LLJILJIL.set(true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLILZIL.LJFF.put("enable_http_dns", String.valueOf(((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).liveStrategyIsHttpDnsNotReady(0)));
        if (!this.LLJJJIL) {
            InterfaceC466780ISe interfaceC466780ISe = this.LLILZLL;
            String strValueOf = String.valueOf(j);
            C466790ISf c466790ISf2 = this.LLILZIL;
            FeedExtra feedExtra = this.LLJILLL;
            if (feedExtra != null) {
                j2 = feedExtra.maxTime;
            }
            c11nzLIZLLL = interfaceC466780ISe.LIZJ(strValueOf, c466790ISf2, j2);
        } else {
            InterfaceC466780ISe interfaceC466780ISe2 = this.LLILZLL;
            String strValueOf2 = String.valueOf(j);
            C466790ISf c466790ISf3 = this.LLILZIL;
            FeedExtra feedExtra2 = this.LLJILLL;
            if (feedExtra2 != null) {
                j2 = feedExtra2.maxTime;
            }
            c11nzLIZLLL = interfaceC466780ISe2.LIZLLL(strValueOf2, c466790ISf3, j2);
        }
        this.LLJJIJIL.LIZ(c11nzLIZLLL.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS3S0200200_7(this, jCurrentTimeMillis, jElapsedRealtime, map, 1), new AfS2S0200100_7(jElapsedRealtime, this, map, 6)));
    }

    @Override // X.C0IOL
    public final void LJJIL(long j) {
        C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS13S0100100_7(this, j, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiPlusFeedRoomListProviderV2(X.C466790ISf r7, X.InterfaceC466780ISe r8) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProviderV2.<init>(X.0ISf, X.0ISe):void");
    }

    @Override // X.C0IOL
    public final String LJIILLIIL(int i, long j) {
        if (i == 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("logId=");
            sbLIZ.append(this.LLJJJJLIIL);
            sbLIZ.append(", hasMore");
            sbLIZ.append(LJJIFFI());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        String str = this.LLJJJJ.get(Long.valueOf(j));
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    @Override // X.C0IOL
    public final boolean LJJJ(int i, int i2) {
        int i3 = this.LLJJ;
        if (i3 < 0 || i != i3 || i2 <= i) {
            return false;
        }
        return true;
    }

    @Override // X.C0IOL
    public final boolean LJJJI(int i, int i2) {
        int i3 = this.LLJJ;
        if (i3 < 0 || i != i3 + 1 || i <= i2) {
            return false;
        }
        return true;
    }

    public final void LJJJIL(final int i, final int i2, final List list) {
        if (list == null || list.isEmpty() || i2 <= 0 || i < 0 || i >= list.size() || this.LLJILJILJ.get()) {
            return;
        }
        long[] jArrLLIIIILZ = new long[0];
        try {
            List listSubList = list.subList(i, Math.min(i + i2, list.size()));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
            Iterator it2 = listSubList.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((RoomInfo) it2.next()).getRoomId()));
            }
            jArrLLIIIILZ = C13LP.LLIIIILZ(arrayList);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("MultiPlusFeedRoomListProvider", e);
        }
        this.LLJILJILJ.set(true);
        this.LLJJIJIL.LIZ(this.LLILZLL.LIZIZ(jArrLLIIIILZ, this.LLILZIL.LIZIZ).LJJLL(new C09JN() { // from class: X.0ISd
            /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 210
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C466770ISd.accept(java.lang.Object):void");
            }
        }, new AfS176S0100000_7(this, 166)));
    }
}
