package com.bytedance.android.livesdk.list;

import X.C0IKP;
import X.C0IOL;
import X.C0IR2;
import X.C0ISF;
import X.C1161920gLG;
import X.C11NJ;
import X.C1701940uOG;
import X.C2188811AlT;
import X.C464330IIt;
import X.C464950ILd;
import X.C786410Ut5;
import Y.ARunnableS13S0100100_7;
import Y.AfS176S0100000_7;
import Y.AfS62S0201000_7;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.live.data.DrawRoomListModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class MultiPlusFeedRoomListProvider extends C0IOL implements GenericLifecycleObserver {
    public final HashMap<Long, String> LLILZIL = new HashMap<>();
    public final HashMap<Long, String> LLILZLL = new HashMap<>();
    public final List<RoomInfo> LLIZ;
    public final List<Room> LLIZLLLIL;
    public final List<EnterRoomConfig> LLJ;
    public final EnterRoomConfig LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public DrawRoomListModel LLJILJILJ;
    public FeedExtra LLJILLL;
    public final boolean LLJJ;
    public final String LLJJI;
    public final String LLJJIII;
    public final EnterRoomConfig.DrawParams LLJJIJI;
    public final Long LLJJIJIIJIL;
    public final List<Room> LLJJIJIL;
    public final List<EnterRoomConfig> LLJJJ;
    public final C11NJ LLJJJIL;
    public String LLJJJJ;
    public final HashSet<Long> LLJJJJJIL;
    public final long[] LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final boolean LLJLIL;
    public String LLJLILLLLZIIL;
    public int LLJLL;
    public String LLJLLIL;
    public int LLJLLL;

    @Override // X.C0IOL
    public final String LJJI() {
        return "MultiPlusFeedRoomListProvider";
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
        arrayList.addAll(this.LLJJIJIL);
        return arrayList;
    }

    @Override // X.C0IOL
    public final boolean LJJIFFI() {
        if (this.LLJILLL == null || this.LLJLIL) {
            return true;
        }
        if (C0IKP.LIZ(this.LLJI) || C0IKP.LIZLLL(this.LLJI)) {
            return this.LLJILLL.hasMore;
        }
        return true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LLJJJIL.LJ();
        C0IR2.LIZLLL(null);
    }

    @Override // X.C0IOG
    public final int size() {
        return ((ArrayList) this.LLIZ).size() + ((ArrayList) this.LLJJIJIL).size();
    }

    @Override // X.C0IOL
    public final String LJIJI() {
        return this.LLJLLIL;
    }

    @Override // X.C0IOL
    public final int LJIJJLI() {
        return this.LLJLL;
    }

    @Override // X.C0IOL
    public final boolean LJJIIJ() {
        return this.LLJIJIL;
    }

    @Override // X.C0IOG
    public final EnterRoomConfig LIZIZ(int i) {
        boolean z;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig enterRoomConfig2 = new EnterRoomConfig();
        if (i >= 0 && i < size()) {
            if (i < ((ArrayList) this.LLIZ).size()) {
                if (i < ((ArrayList) this.LLJ).size() && ListProtector.get(this.LLJ, i) != null) {
                    enterRoomConfig2 = (EnterRoomConfig) ListProtector.get(this.LLJ, i);
                } else {
                    enterRoomConfig2.mRoomsData.roomId = ((RoomInfo) ListProtector.get(this.LLIZ, i)).getRoomId();
                    enterRoomConfig2.mRoomsData.userId = ((RoomInfo) ListProtector.get(this.LLIZ, i)).getAnchorId();
                }
                if (this.LLJI.mRoomsData.roomId > 0 && ListProtector.get(this.LLIZ, i) != null && this.LLJI.mRoomsData.roomId == ((RoomInfo) ListProtector.get(this.LLIZ, i)).getRoomId()) {
                    enterRoomConfig2 = this.LLJI;
                }
            } else if (i < size()) {
                if (i < ((ArrayList) this.LLIZ).size() + ((ArrayList) this.LLJJJ).size()) {
                    enterRoomConfig2 = (EnterRoomConfig) ListProtector.get(this.LLJJJ, i - ((ArrayList) this.LLIZ).size());
                } else {
                    C464330IIt.LIZLLL((Room) ListProtector.get(this.LLJJIJIL, i - ((ArrayList) this.LLIZ).size()), enterRoomConfig2);
                    ((ArrayList) this.LLJJJ).add(enterRoomConfig2);
                }
                if (!C0IKP.LIZ(this.LLJI) && !C0IKP.LIZLLL(this.LLJI)) {
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfig2.mRoomsData;
                    roomsData.enterFromMerge = this.LLJI.mRoomsData.enterMethod;
                    roomsData.enterMethod = "draw_loadmore";
                }
            }
            EnterRoomConfig enterRoomConfig3 = this.LLJI;
            if (enterRoomConfig3 != null) {
                if (!TextUtils.isEmpty(enterRoomConfig3.mLogData.requestId)) {
                    enterRoomConfig2.mLogData.requestId = this.LLJI.mLogData.requestId;
                }
                if (!TextUtils.isEmpty(this.LLJI.mLogData.logPb)) {
                    enterRoomConfig2.mLogData.logPb = this.LLJI.mLogData.logPb;
                }
            }
            enterRoomConfig2.mRoomsData.fromNewStyle = this.LLJJ;
            enterRoomConfig2.drawParams = this.LLJJIJI;
            if (C0IKP.LIZ(this.LLJI) && (enterRoomConfig = this.LLJI) != null) {
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig2.mRoomsData;
                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                roomsData2.gameLiveExtra = roomsData3.gameLiveExtra;
                roomsData2.roomIds = roomsData3.roomIds;
            }
            if (C0IKP.LIZLLL(this.LLJI)) {
                enterRoomConfig2.mRoomsData.roomIds = this.LLJI.mRoomsData.roomIds;
            }
            EnterRoomConfig.LogData logData = enterRoomConfig2.mLogData;
            if (i <= ((ArrayList) this.LLIZ).size()) {
                z = true;
            } else {
                z = false;
            }
            logData.isInRoomInfoList = Boolean.valueOf(z);
        }
        return enterRoomConfig2;
    }

    @Override // X.C0IOG
    public final int LJIIIIZZ(EnterRoomConfig enterRoomConfig) {
        long j = enterRoomConfig.mRoomsData.roomId;
        for (int i = 0; i < size(); i++) {
            if (i < ((ArrayList) this.LLIZ).size() && j == ((RoomInfo) ListProtector.get(this.LLIZ, i)).getRoomId()) {
                return i;
            }
            int size = i - ((ArrayList) this.LLIZ).size();
            if (size >= 0 && size < ((ArrayList) this.LLJJIJIL).size() && j == ((Room) ListProtector.get(this.LLJJIJIL, size)).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.C0IOL, X.C0IOG
    public final Room LJIIJJI(int i) {
        if (i >= 0 && i < size()) {
            if (i < ((ArrayList) this.LLIZLLLIL).size()) {
                if (i >= this.LLJJL && i <= this.LLJJLIIIJLLLLLLLZ) {
                    return (Room) ListProtector.get(this.LLIZLLLIL, i);
                }
                LJJJJ(this.LLJJL, LJJJIL(i));
                return null;
            }
            if (this.LLJJIJIL != null && ((ArrayList) this.LLJJJ).size() > i - ((ArrayList) this.LLIZLLLIL).size()) {
                return (Room) ListProtector.get(this.LLJJIJIL, i - ((ArrayList) this.LLIZLLLIL).size());
            }
        }
        return null;
    }

    @Override // X.C0IOL
    public final void LJIIL(C0ISF<Room> c0isf) {
        Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
        Iterator it3 = ((ArrayList) this.LLJ).iterator();
        Iterator it4 = ((ArrayList) this.LLIZ).iterator();
        boolean z = false;
        while (it2.hasNext() && it3.hasNext() && it4.hasNext()) {
            Room room = (Room) it2.next();
            it3.next();
            it4.next();
            if (c0isf.LIZ(room)) {
                it2.remove();
                it3.remove();
                it4.remove();
                z = true;
            }
        }
        Iterator it5 = ((ArrayList) this.LLJJIJIL).iterator();
        Iterator it6 = ((ArrayList) this.LLJJJ).iterator();
        while (it5.hasNext() && it6.hasNext()) {
            Room room2 = (Room) it5.next();
            it6.next();
            if (c0isf.LIZ(room2)) {
                it5.remove();
                it6.remove();
                z = true;
            }
        }
        if (z) {
            LJIILJJIL();
        }
    }

    @Override // X.C0IOL
    public final List<Long> LJIILL(int i) {
        if (i >= 0 && i < size()) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                i++;
                if (i < size()) {
                    if (i < ((ArrayList) this.LLJ).size()) {
                        EnterRoomConfig enterRoomConfig = (EnterRoomConfig) ListProtector.get(this.LLJ, i);
                        if (enterRoomConfig != null) {
                            arrayList.add(Long.valueOf(enterRoomConfig.mRoomsData.roomId));
                        }
                    } else if (i < size()) {
                        arrayList.add(Long.valueOf(((EnterRoomConfig) ListProtector.get(this.LLJJJ, i - ((ArrayList) this.LLJ).size())).mRoomsData.roomId));
                    }
                } else {
                    return arrayList;
                }
            }
        } else {
            return null;
        }
    }

    @Override // X.C0IOL
    public final String LJIL(long j) {
        return this.LLILZLL.get(Long.valueOf(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0193  */
    @Override // X.C0IOL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(int r31) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProvider.LJJIIJZLJL(int):void");
    }

    @Override // X.C0IOL
    public final void LJJIL(long j) {
        C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS13S0100100_7(this, j, 9));
    }

    public final long[] LJJJIL(int i) {
        int size = ((ArrayList) this.LLIZ).size();
        long[] jArr = new long[0];
        if (i >= this.LLJJLIIIJLLLLLLLZ) {
            int iMin = Math.min(size - i, 30);
            int i2 = (i + iMin) - 1;
            long[] jArr2 = new long[iMin];
            for (int i3 = i; i3 <= i2; i3++) {
                jArr2[i3 - i] = this.LLJJJJLIIL[i3];
            }
            if (this.LLJJL == -1) {
                this.LLJJL = i;
            }
            this.LLJJLIIIJLLLLLLLZ = i2;
            return jArr2;
        }
        if (i <= this.LLJJL) {
            int iMin2 = Math.min(30, i);
            int i4 = (i - iMin2) + 1;
            jArr = new long[iMin2];
            for (int i5 = i4; i5 <= i; i5++) {
                jArr[i5 - i4] = this.LLJJJJLIIL[i5];
            }
            if (this.LLJJLIIIJLLLLLLLZ == -1) {
                this.LLJJLIIIJLLLLLLLZ = i;
            }
            this.LLJJL = i4;
        }
        return jArr;
    }

    @Override // X.C0IOL
    public final String LJIILLIIL(int i, long j) {
        if (i == 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("logId=");
            sbLIZ.append(this.LLJLILLLLZIIL);
            sbLIZ.append(", hasMore");
            sbLIZ.append(LJJIFFI());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        String str = this.LLILZIL.get(Long.valueOf(j));
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    public final void LJJJJ(int i, long[] jArr) {
        if (jArr == null || jArr.length == 0 || this.LLJILJIL) {
            return;
        }
        this.LLJILJIL = true;
        C464950ILd.LJI.getClass();
        this.LLJJJIL.LIZ(C464950ILd.LJFF(jArr).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS62S0201000_7(i, jArr, this, 2), new AfS176S0100000_7(this, 165)));
    }

    public MultiPlusFeedRoomListProvider(Lifecycle lifecycle, List<RoomInfo> list, int i, EnterRoomConfig enterRoomConfig, String str) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        this.LLIZ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LLIZLLLIL = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.LLJ = arrayList3;
        this.LLJJIJIL = new ArrayList();
        this.LLJJJ = new ArrayList();
        this.LLJJJIL = new C11NJ();
        this.LLJJJJJIL = new HashSet<>();
        this.LLJL = false;
        this.LLJLIL = false;
        this.LLJLL = 0;
        this.LLJLLIL = "";
        this.LLJLLL = 0;
        this.LLJI = enterRoomConfig;
        arrayList.addAll(list);
        this.LLJJJJ = str;
        ArrayList arrayList4 = (ArrayList) list;
        this.LLJJJJLIIL = new long[arrayList4.size()];
        int size = arrayList4.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        int size2 = arrayList4.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList3.add(null);
        }
        for (int i4 = 0; i4 < arrayList4.size(); i4++) {
            if (ListProtector.get(list, i4) != null) {
                this.LLJJJJLIIL[i4] = ((RoomInfo) ListProtector.get(list, i4)).getRoomId();
            } else {
                this.LLJJJJLIIL[i4] = 0;
            }
        }
        this.LLJJIJIIJIL = Long.valueOf(this.LLJI.mRoomsData.roomId);
        EnterRoomConfig enterRoomConfig2 = this.LLJI;
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig2.mRoomsData;
        this.LLJJ = roomsData.fromNewStyle;
        this.LLJJI = roomsData.fromDrawerStyle;
        this.LLJJIII = roomsData.enterFromLiveSource;
        EnterRoomConfig.DrawParams drawParamsClone = enterRoomConfig2.drawParams.clone();
        this.LLJJIJI = drawParamsClone;
        if (!drawParamsClone.openLiveFromDrawer && !drawParamsClone.openLiveFromGameDrawer) {
            z = false;
        } else {
            z = true;
        }
        this.LLJLIL = z;
        lifecycle.addObserver(this);
        this.LLJJL = i;
        this.LLJJLIIIJLLLLLLLZ = i;
        if (!C0IKP.LIZ(this.LLJI) && !C0IKP.LIZLLL(this.LLJI)) {
            LJJJJ(i, LJJJIL(i));
        } else {
            LJJJJ(0, this.LLJJJJLIIL);
        }
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        if (roomsData2 != null && roomsData2.debugInfos != null) {
            if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() && !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse()) {
                return;
            }
            for (Map.Entry<Long, String> entry : enterRoomConfig.mRoomsData.debugInfos.entrySet()) {
                this.LLILZIL.put(entry.getKey(), entry.getValue());
                if (!TextUtils.isEmpty(enterRoomConfig.mRoomsData.oceanReqInfo)) {
                    this.LLILZLL.put(entry.getKey(), enterRoomConfig.mRoomsData.oceanReqInfo);
                }
            }
        }
    }
}
