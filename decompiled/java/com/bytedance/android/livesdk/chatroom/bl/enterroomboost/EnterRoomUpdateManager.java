package com.bytedance.android.livesdk.chatroom.bl.enterroomboost;

import X.C00EE;
import X.C08XD;
import X.C09CT;
import X.C0CW2;
import X.C0IMD;
import X.C0IRV;
import X.C0IS6;
import X.C0IS7;
import X.C1161920gLG;
import X.C13LP;
import X.C1506330pIl;
import X.C1516680pZS;
import X.C15438062q;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C259800zU;
import X.C293501Bt;
import X.C465120ILu;
import Y.AComparatorS26S0000000_7;
import android.util.Base64;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.bl.enterroomboost.EnterRoomUpdateManager;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.android.livesdk.signaling.model.downlink.CacheUpdateItem;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkRoomCacheUpdateData;
import com.bytedance.android.livesdk.signaling.model.downlink.RoomCacheUpdateItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSignalService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS290S0000000_7;
import kotlin.jvm.internal.AwS125S0110000_7;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class EnterRoomUpdateManager {
    public static int LIZIZ;
    public static WeakReference<C0IRV> LIZJ;
    public static boolean LJFF;
    public static volatile Integer LJIIIIZZ;
    public static final EnterRoomUpdateManager LIZ = new EnterRoomUpdateManager();
    public static final int LIZLLL = -1;
    public static final int LJ = 4;
    public static final C0IS6 LJI = new C0CW2<DownlinkRoomCacheUpdateData>() { // from class: X.0IS6
        @Override // X.C0CW2
        public final void LJII(BaseDownlinkData baseDownlinkData, UplinkMessageResponse uplinkMessageResponse, AwS125S0110000_7 awS125S0110000_7) {
            String strLJJLIIIJ;
            List<RoomCacheUpdateItem> updateItemList = ((DownlinkRoomCacheUpdateData) baseDownlinkData).getUpdateItemList();
            if (updateItemList != null) {
                for (RoomCacheUpdateItem roomCacheUpdateItem : updateItemList) {
                    long j = roomCacheUpdateItem.roomId;
                    String str = roomCacheUpdateItem.roomData;
                    List<Integer> list = roomCacheUpdateItem.tagList;
                    boolean z = roomCacheUpdateItem.cacheValid;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onCacheUpdateItem: roomId = ");
                    sbLIZ.append(j);
                    sbLIZ.append(", updateVersion = ");
                    sbLIZ.append(roomCacheUpdateItem.updateVersion);
                    sbLIZ.append(", tagList = ");
                    if (list != null) {
                        strLJJLIIIJ = C13LP.LJJLIIIJ(list, ", ", null, null, 0, null, null, 62);
                    } else {
                        strLJJLIIIJ = null;
                    }
                    sbLIZ.append(strLJJLIIIJ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    EnterRoomUpdateManager enterRoomUpdateManager = EnterRoomUpdateManager.LIZ;
                    String strValueOf = String.valueOf(j);
                    enterRoomUpdateManager.getClass();
                    C0IS7<String, C465120ILu> c0is7 = EnterRoomUpdateManager.LJIIJ;
                    if (c0is7.LIZ(strValueOf)) {
                        if (!z) {
                            EnterRoomUpdateManager.LJII.remove(strValueOf);
                            c0is7.LJ(strValueOf);
                            EnterRoomUpdateManager.LJIIJJI.add(strValueOf);
                        } else {
                            EnterRoomUpdateManager.RoomUpdateItem roomUpdateItem = EnterRoomUpdateManager.LJII.get(strValueOf);
                            if (roomUpdateItem != null) {
                                roomUpdateItem.shouldRefresh = false;
                            }
                            C465120ILu c465120ILuLIZIZ = c0is7.LIZIZ(strValueOf);
                            if (c465120ILuLIZIZ != null && (c465120ILuLIZIZ.LJ == 0 || c465120ILuLIZIZ.LJ == 1)) {
                                if (str != null && str.length() != 0) {
                                    c465120ILuLIZIZ.LIZJ = str;
                                    c465120ILuLIZIZ.LJI = list;
                                    c465120ILuLIZIZ.LJ = 0;
                                    if (list != null) {
                                        c465120ILuLIZIZ.LJI = list;
                                    }
                                } else {
                                    c465120ILuLIZIZ.LJ = 0;
                                }
                            }
                            EnterRoomUpdateManager.LJI();
                        }
                    }
                }
            }
        }
    };
    public static final ConcurrentHashMap<String, RoomUpdateItem> LJII = new ConcurrentHashMap<>();
    public static final Set<Integer> LJIIIZ = new LinkedHashSet();
    public static final C0IS7<String, C465120ILu> LJIIJ = new C0IS7<>();
    public static final ConcurrentHashSet<String> LJIIJJI = new ConcurrentHashSet<>();
    public static final Object LJIIL = new Object();

    public static void LJ() {
        String string;
        if (!LJFF) {
            ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).registerRoomUpdateSignal(LJI);
            LJFF = true;
        }
        Collection<RoomUpdateItem> collectionValues = LJII.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            Long l = ((RoomUpdateItem) it2.next()).LIZJ;
            if (l != null && (string = l.toString()) != null) {
                arrayList.add(string);
            }
        }
        List listLLIIII = C13LP.LLIIII(arrayList);
        Collection<RoomUpdateItem> collectionValues2 = LJII.values();
        ArrayList<RoomUpdateItem> arrayList2 = new ArrayList();
        for (Object obj : collectionValues2) {
            if (((RoomUpdateItem) obj).shouldRefresh) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        for (RoomUpdateItem roomUpdateItem : arrayList2) {
            arrayList3.add(new CacheUpdateItem(CastLongProtector.parseLong(roomUpdateItem.roomId), roomUpdateItem.baseVersion));
        }
        ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).uplinkRoomCacheUpdateData(new C00EE((List<String>) listLLIIII, arrayList3));
    }

    public static void LJI() {
        int size;
        C0IS7<String, C465120ILu> c0is7 = LJIIJ;
        synchronized (c0is7.LIZIZ) {
            try {
                size = c0is7.LIZJ.size();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (size == 0) {
            return;
        }
        ArrayList<Pair> arrayList = new ArrayList();
        for (Object obj : (ArrayList) c0is7.LIZJ()) {
            C465120ILu c465120ILuLIZIZ = LJIIJ.LIZIZ((String) obj);
            if (c465120ILuLIZIZ != null) {
                arrayList.add(new Pair(obj, c465120ILuLIZIZ));
            }
        }
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS26S0000000_7(0));
        }
        for (Pair pair : arrayList) {
            String str = (String) pair.getFirst();
            C465120ILu c465120ILu = (C465120ILu) pair.getSecond();
            int i = c465120ILu.LJ;
            String str2 = i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "DROP" : "SUSPEND" : "USEFUL";
            int i2 = c465120ILu.LJII;
            String str3 = i2 == LIZIZ ? " * " : "   ";
            String strLJJJJJ = a0.LJJJJJ(' ', 6, String.valueOf(i2));
            String strLJJJJJ2 = a0.LJJJJJ(' ', 20, str);
            String strLJJJJJ3 = a0.LJJJJJ(' ', 17, str2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("| ");
            sbLIZ.append(str3);
            sbLIZ.append(strLJJJJJ);
            sbLIZ.append(" | ");
            sbLIZ.append(strLJJJJJ2);
            sbLIZ.append(" | ");
            sbLIZ.append(strLJJJJJ3);
            sbLIZ.append(" |");
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void LJII() {
        C0IS7<String, C465120ILu> c0is7 = LJIIJ;
        AFwS290S0000000_7 aFwS290S0000000_7 = AFwS290S0000000_7.get$arr$(11);
        synchronized (c0is7.LIZIZ) {
            try {
                Iterator<Map.Entry<Object, Object>> it2 = c0is7.LIZJ.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<Object, Object> next = it2.next();
                    if (((Boolean) aFwS290S0000000_7.invoke(next.getKey(), next.getValue())).booleanValue()) {
                        it2.remove();
                        Function2<K, V, Unit> function2 = c0is7.LIZ;
                        if (function2 != 0) {
                            function2.invoke((K) next.getKey(), (V) next.getValue());
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIIIIZZ() {
        Iterator<Map.Entry<String, RoomUpdateItem>> it2 = LJII.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().LIZLLL == 1) {
                it2.remove();
            }
        }
    }

    public static void LJIIJ() {
        C0IRV c0irv;
        List<Room> listLIZ;
        C465120ILu c465120ILuLIZIZ;
        EnterRoomExtra enterRoomExtra;
        WeakReference<C0IRV> weakReference = LIZJ;
        if (weakReference == null || (c0irv = weakReference.get()) == null || (listLIZ = c0irv.LIZ()) == null || listLIZ.isEmpty()) {
            return;
        }
        int i = LIZIZ;
        int i2 = LIZLLL + i;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = LJ;
        int size = i + i3 < listLIZ.size() ? LIZIZ + i3 : listLIZ.size() - 1;
        if (i2 > size) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 <= size) {
            while (true) {
                Room room = (Room) ListProtector.get(listLIZ, i2);
                if (room != null && (enterRoomExtra = room.enterRoomBoostExtra) != null && enterRoomExtra.useEnterBoostCache == 1 && room.shortTouchItems != null) {
                    arrayList.add(new Pair(Integer.valueOf(i2), Long.valueOf(room.getId())));
                    String strValueOf = String.valueOf(room.getId());
                    linkedHashSet.add(strValueOf);
                    C0IS7<String, C465120ILu> c0is7 = LJIIJ;
                    C465120ILu c465120ILuLIZIZ2 = c0is7.LIZIZ(strValueOf);
                    if (c465120ILuLIZIZ2 == null) {
                        c465120ILuLIZIZ2 = new C465120ILu(null);
                        c465120ILuLIZIZ2.LIZ = room;
                        c465120ILuLIZIZ2.LJFF = 1;
                        EnterRoomExtra enterRoomExtra2 = room.enterRoomBoostExtra;
                        c465120ILuLIZIZ2.LIZLLL = enterRoomExtra2 != null ? enterRoomExtra2.enterBoostCacheVersion : 0L;
                        c465120ILuLIZIZ2.LJ = 0;
                        c465120ILuLIZIZ2.LJII = i2;
                    } else {
                        c465120ILuLIZIZ2.LIZ = room;
                        EnterRoomExtra enterRoomExtra3 = room.enterRoomBoostExtra;
                        c465120ILuLIZIZ2.LIZLLL = enterRoomExtra3 != null ? enterRoomExtra3.enterBoostCacheVersion : 0L;
                        c465120ILuLIZIZ2.LJ = 0;
                        c465120ILuLIZIZ2.LJII = i2;
                    }
                    c0is7.LIZLLL(strValueOf, c465120ILuLIZIZ2);
                }
                if (i2 == size) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (ArrayList) LJIIJ.LIZJ()) {
            if (!linkedHashSet.contains(obj) && (c465120ILuLIZIZ = LJIIJ.LIZIZ((String) obj)) != null && c465120ILuLIZIZ.LJFF == 1) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            LJIIJ.LJ(it2.next());
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void LIZ(Set set) {
        C465120ILu c465120ILuLIZIZ;
        for (Object obj : LJII.keySet()) {
            RoomUpdateItem roomUpdateItem = LJII.get(obj);
            if (roomUpdateItem != null) {
                C0IS7<String, C465120ILu> c0is7 = LJIIJ;
                C465120ILu c465120ILuLIZIZ2 = c0is7.LIZIZ((String) obj);
                if (c465120ILuLIZIZ2 == null) {
                    c465120ILuLIZIZ2 = new C465120ILu(null);
                    c465120ILuLIZIZ2.LIZ = roomUpdateItem.LIZ;
                    c465120ILuLIZIZ2.LIZIZ = roomUpdateItem.LIZIZ;
                    c465120ILuLIZIZ2.LJFF = roomUpdateItem.LIZLLL;
                    c465120ILuLIZIZ2.LIZLLL = roomUpdateItem.baseVersion;
                    c465120ILuLIZIZ2.LJI = roomUpdateItem.LJ;
                    c465120ILuLIZIZ2.LJII = roomUpdateItem.LJFF;
                    c465120ILuLIZIZ2.LJ = roomUpdateItem.shouldRefresh;
                } else {
                    if (roomUpdateItem.shouldRefresh && c465120ILuLIZIZ2.LJ != 0) {
                        c465120ILuLIZIZ2.LJ = 1;
                    }
                    c465120ILuLIZIZ2.LJI = roomUpdateItem.LJ;
                    c465120ILuLIZIZ2.LJII = roomUpdateItem.LJFF;
                }
                c0is7.LIZLLL(obj, c465120ILuLIZIZ2);
            }
        }
        if (set != null) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                LJIIJ.LJ(it2.next());
            }
        }
        for (Object obj2 : (ArrayList) LJIIJ.LIZJ()) {
            if (!LJII.containsKey(obj2) && (c465120ILuLIZIZ = LJIIJ.LIZIZ((String) obj2)) != null) {
                c465120ILuLIZIZ.LJ = 2;
            }
        }
        LJI();
    }

    public static void LIZIZ(int i) {
        Integer num;
        Integer num2;
        LiveEnterRoomUpdateSetting liveEnterRoomUpdateSetting = LiveEnterRoomUpdateSetting.INSTANCE;
        if (!liveEnterRoomUpdateSetting.isEnable()) {
            return;
        }
        int cacheUpdateMethod = liveEnterRoomUpdateSetting.getCacheUpdateMethod();
        if (cacheUpdateMethod != 0) {
            if (cacheUpdateMethod == 1) {
                if (LJIIIIZZ != null && ((num2 = LJIIIIZZ) == null || num2.intValue() != i)) {
                    return;
                }
                LJIIJ();
                return;
            }
            return;
        }
        if (LJIIIIZZ != null && ((num = LJIIIIZZ) == null || num.intValue() != i)) {
            return;
        }
        LJIIIZ(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, java.lang.Object] */
    public static Pair LJFF(String str) {
        T t;
        Integer numValueOf;
        String str2;
        List<Integer> list;
        String str3;
        synchronized (LJIIL) {
            try {
                C0IS7<String, C465120ILu> c0is7 = LJIIJ;
                if (!c0is7.LIZ(str)) {
                    return new Pair(2, null);
                }
                C0IMD c0imdQL2 = ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).qL2(Room.class);
                C259800zU c259800zU = new C259800zU();
                C465120ILu c465120ILuLIZIZ = c0is7.LIZIZ(str);
                if (c465120ILuLIZIZ != null) {
                    t = c465120ILuLIZIZ.LIZ;
                } else {
                    t = 0;
                }
                c259800zU.element = t;
                if (t == 0) {
                    C465120ILu c465120ILuLIZIZ2 = c0is7.LIZIZ(str);
                    if (c465120ILuLIZIZ2 != null && (str3 = c465120ILuLIZIZ2.LIZIZ) != null) {
                        try {
                            ?? LJII2 = C293501Bt.LIZ().LJII(str3, Room.class);
                            c259800zU.element = LJII2;
                            if (LJII2 != 0 && c0imdQL2 != null) {
                                c0imdQL2.LIZ(LJII2);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            LJIIJ.LJ(str);
                            return new Pair(2, null);
                        }
                    } else {
                        return new Pair(2, null);
                    }
                }
                C465120ILu c465120ILuLIZIZ3 = c0is7.LIZIZ(str);
                if (c465120ILuLIZIZ3 != null) {
                    numValueOf = Integer.valueOf(c465120ILuLIZIZ3.LJ);
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null && numValueOf.intValue() == 0) {
                    C465120ILu c465120ILuLIZIZ4 = c0is7.LIZIZ(str);
                    if (c465120ILuLIZIZ4 != null) {
                        str2 = c465120ILuLIZIZ4.LIZJ;
                    } else {
                        str2 = null;
                    }
                    C465120ILu c465120ILuLIZIZ5 = c0is7.LIZIZ(str);
                    if (c465120ILuLIZIZ5 != null) {
                        list = c465120ILuLIZIZ5.LJI;
                    } else {
                        list = null;
                    }
                    if (str2 != null && str2.length() != 0) {
                        byte[] bArrDecode = Base64.decode(str2, 0);
                        C1516680pZS c1516680pZS = new C1516680pZS();
                        if (c0imdQL2 != null) {
                            try {
                                c1516680pZS.LJIIL(new C1506330pIl(bArrDecode));
                                c0imdQL2.LIZIZ(c1516680pZS, c259800zU.element, list);
                                return new Pair(0, c259800zU.element);
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                LJIIJ.LJ(str);
                                return new Pair(2, null);
                            }
                        }
                        return new Pair(1, c259800zU.element);
                    }
                    return new Pair(0, c259800zU.element);
                }
                return new Pair(1, c259800zU.element);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIIIZ(Set set) {
        C0IRV c0irv;
        List<Room> listLIZ;
        int size;
        long j;
        WeakReference<C0IRV> weakReference = LIZJ;
        if (weakReference != null && (c0irv = weakReference.get()) != null && (listLIZ = c0irv.LIZ()) != null && !listLIZ.isEmpty()) {
            int i = LIZIZ;
            if (i >= 0 && i < listLIZ.size()) {
                ((Room) ListProtector.get(listLIZ, LIZIZ)).getId();
            }
            Iterator<Room> it2 = listLIZ.iterator();
            int i2 = 0;
            while (true) {
                Long lValueOf = null;
                if (it2.hasNext()) {
                    it2.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                } else {
                    int i4 = LIZIZ;
                    int i5 = LIZLLL + i4;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    int i6 = LJ;
                    if (i4 + i6 < listLIZ.size()) {
                        size = LIZIZ + i6;
                    } else {
                        size = listLIZ.size() - 1;
                    }
                    if (i5 > size) {
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    ArrayList<Pair> arrayList = new ArrayList();
                    if (i5 <= size) {
                        while (true) {
                            if (i5 != LIZIZ) {
                                Room room = (Room) ListProtector.get(listLIZ, i5);
                                if (!LJIIJJI.contains(String.valueOf(room.getId()))) {
                                    arrayList.add(new Pair(Integer.valueOf(i5), Long.valueOf(room.getId())));
                                    linkedHashSet.add(String.valueOf(room.getId()));
                                    EnterRoomExtra enterRoomExtra = room.enterRoomBoostExtra;
                                    if (enterRoomExtra != null && enterRoomExtra.useEnterBoostCache == 1) {
                                        ConcurrentHashMap<String, RoomUpdateItem> concurrentHashMap = LJII;
                                        RoomUpdateItem roomUpdateItem = concurrentHashMap.get(String.valueOf(room.getId()));
                                        if (roomUpdateItem == null) {
                                            String strValueOf = String.valueOf(room.getId());
                                            User owner = room.getOwner();
                                            if (owner != null) {
                                                lValueOf = Long.valueOf(owner.getId());
                                            }
                                            EnterRoomExtra enterRoomExtra2 = room.enterRoomBoostExtra;
                                            if (enterRoomExtra2 != null) {
                                                j = enterRoomExtra2.enterBoostCacheVersion;
                                            } else {
                                                j = 0;
                                            }
                                            RoomUpdateItem roomUpdateItem2 = new RoomUpdateItem(strValueOf, room, null, j, false, lValueOf, 1, null, i5);
                                            if (Math.abs(room.fetchTimeStamp - jCurrentTimeMillis) > 2000) {
                                                roomUpdateItem2.shouldRefresh = true;
                                            }
                                            concurrentHashMap.put(String.valueOf(room.getId()), roomUpdateItem2);
                                        } else {
                                            roomUpdateItem.LJFF = i5;
                                        }
                                    }
                                }
                            }
                            if (i5 == size) {
                                break;
                            }
                            i5++;
                            lValueOf = null;
                        }
                    }
                    if (set != null && !set.isEmpty()) {
                        Iterator it3 = set.iterator();
                        while (it3.hasNext()) {
                            LJII.remove(it3.next());
                        }
                    }
                    Iterator<Map.Entry<String, RoomUpdateItem>> it4 = LJII.entrySet().iterator();
                    while (it4.hasNext()) {
                        if (!linkedHashSet.contains(it4.next().getKey())) {
                            it4.remove();
                        }
                    }
                    for (Pair pair : arrayList) {
                        ((Number) pair.getFirst()).intValue();
                        ((Number) pair.getSecond()).longValue();
                    }
                    LIZ(set);
                    LJ();
                    return;
                }
            }
        }
    }

    public static void LIZJ(Set set, int i) {
        Integer num;
        Integer num2;
        LiveEnterRoomUpdateSetting liveEnterRoomUpdateSetting = LiveEnterRoomUpdateSetting.INSTANCE;
        if (!liveEnterRoomUpdateSetting.isEnable()) {
            return;
        }
        int cacheUpdateMethod = liveEnterRoomUpdateSetting.getCacheUpdateMethod();
        if (cacheUpdateMethod != 0) {
            if (cacheUpdateMethod == 1) {
                if (LJIIIIZZ != null && ((num2 = LJIIIIZZ) == null || num2.intValue() != i)) {
                    return;
                }
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    LJIIJ.LJ(it2.next());
                }
                return;
            }
            return;
        }
        if (LJIIIIZZ != null && ((num = LJIIIIZZ) == null || num.intValue() != i)) {
            return;
        }
        LJIIIZ(set);
    }

    public static void LIZLLL(int i, int i2) {
        Integer num;
        Integer num2;
        LiveEnterRoomUpdateSetting liveEnterRoomUpdateSetting = LiveEnterRoomUpdateSetting.INSTANCE;
        if (!liveEnterRoomUpdateSetting.isEnable()) {
            return;
        }
        int cacheUpdateMethod = liveEnterRoomUpdateSetting.getCacheUpdateMethod();
        if (cacheUpdateMethod != 0) {
            if (cacheUpdateMethod == 1) {
                if (LJIIIIZZ != null && ((num2 = LJIIIIZZ) == null || num2.intValue() != i2)) {
                    return;
                }
                LIZIZ = i;
                LJIIJ();
                return;
            }
            return;
        }
        if (LJIIIIZZ != null && ((num = LJIIIIZZ) == null || num.intValue() != i2)) {
            return;
        }
        LIZIZ = i;
        LJIIIZ(null);
    }

    public static final class RoomUpdateItem {
        public transient Room LIZ;
        public transient String LIZIZ;
        public Long LIZJ;
        public transient int LIZLLL;
        public final transient List<Integer> LJ;
        public transient int LJFF;

        @C09CT("base_version")
        public long baseVersion;

        @C09CT("room_id")
        public final String roomId;

        @C09CT("shouldRefresh")
        public boolean shouldRefresh;

        public RoomUpdateItem(String str, Room room, String str2, long j, boolean z, Long l, int i, List<Integer> list, int i2) {
            this.roomId = str;
            this.LIZ = room;
            this.LIZIZ = str2;
            this.baseVersion = j;
            this.shouldRefresh = z;
            this.LIZJ = l;
            this.LIZLLL = i;
            this.LJ = list;
            this.LJFF = i2;
        }
    }
}
