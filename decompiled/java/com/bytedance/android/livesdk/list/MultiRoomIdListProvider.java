package com.bytedance.android.livesdk.list;

import X.C0IOL;
import X.C0ISF;
import X.C11JF;
import X.C1701940uOG;
import X.C464950ILd;
import X.C786410Ut5;
import X.InterfaceC1631620sYq;
import Y.ARunnableS13S0100100_7;
import Y.AfS132S0000000_7;
import Y.AfS143S0200000_7;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.livesetting.feed.LiveDrawerSearchEnableSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public class MultiRoomIdListProvider extends C0IOL implements GenericLifecycleObserver {
    public final List<RoomInfo> LLILZIL;
    public List<Room> LLILZLL;
    public final List<EnterRoomConfig> LLIZ;
    public final EnterRoomConfig LLIZLLLIL;
    public C11JF LLJ;
    public boolean LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public EnterRoomConfig.DrawParams LLJILJILJ;

    @Override // X.C0IOL, X.C0IOG
    public final Room LJIIJJI(int i) {
        return null;
    }

    @Override // X.C0IOL
    public final void LJIIL(C0ISF<Room> c0isf) {
    }

    @Override // X.C0IOL
    public final String LJIJI() {
        return null;
    }

    @Override // X.C0IOL
    public final String LJIJJ() {
        return "not_support";
    }

    @Override // X.C0IOL
    public final int LJIJJLI() {
        return 0;
    }

    @Override // X.C0IOL
    public final String LJJI() {
        return "MultiRoomIdListProvider";
    }

    @Override // X.C0IOL
    public final void LJJIIJZLJL(int i) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.C0IOL
    public final List<Room> LJJ() {
        return new ArrayList();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C11JF c11jf = this.LLJ;
        if (c11jf != null) {
            c11jf.dispose();
            this.LLJ = null;
        }
    }

    @Override // X.C0IOG
    public final int size() {
        return ((ArrayList) this.LLILZIL).size();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    @Override // X.C0IOG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdkapi.session.EnterRoomConfig LIZIZ(int r7) {
        /*
            r6 = this;
            java.util.List<com.bytedance.android.livesdkapi.session.EnterRoomConfig> r0 = r6.LLIZ
            boolean r0 = X.C086I.LIZIZ(r0)
            if (r0 != 0) goto L19
            java.util.List<com.bytedance.android.livesdkapi.session.EnterRoomConfig> r0 = r6.LLIZ
            int r0 = r0.size()
            if (r0 <= r7) goto L19
            java.util.List<com.bytedance.android.livesdkapi.session.EnterRoomConfig> r0 = r6.LLIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = (com.bytedance.android.livesdkapi.session.EnterRoomConfig) r0
            return r0
        L19:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r3 = new com.bytedance.android.livesdkapi.session.EnterRoomConfig
            r3.<init>()
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r6.LLIZLLLIL
            if (r0 == 0) goto Lba
            if (r7 < 0) goto Lae
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> r0 = r6.LLILZIL
            int r0 = r0.size()
            if (r7 >= r0) goto L52
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r6.LLIZLLLIL
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            long r4 = r0.roomId
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L52
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> r0 = r6.LLILZIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            if (r0 == 0) goto L52
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> r0 = r6.LLILZIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            com.bytedance.android.livesdkapi.depend.model.live.RoomInfo r0 = (com.bytedance.android.livesdkapi.depend.model.live.RoomInfo) r0
            long r1 = r0.getRoomId()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L52
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r3 = r6.LLIZLLLIL
        L52:
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> r0 = r6.LLILZIL
            int r0 = r0.size()
            if (r7 >= r0) goto Lae
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> r0 = r6.LLILZIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            if (r0 == 0) goto Lae
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r6.LLIZLLLIL
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r0.mLogData
            java.lang.String r0 = r0.requestId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L78
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r1 = r3.mLogData
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r6.LLIZLLLIL
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r0.mLogData
            java.lang.String r0 = r0.requestId
            r1.requestId = r0
        L78:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r6.LLIZLLLIL
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r0.mLogData
            java.lang.String r0 = r0.logPb
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L8e
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r1 = r3.mLogData
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r6.LLIZLLLIL
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r0.mLogData
            java.lang.String r0 = r0.logPb
            r1.logPb = r0
        L8e:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r2 = r3.mRoomsData
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> r0 = r6.LLILZIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            com.bytedance.android.livesdkapi.depend.model.live.RoomInfo r0 = (com.bytedance.android.livesdkapi.depend.model.live.RoomInfo) r0
            long r0 = r0.getRoomId()
            r2.roomId = r0
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r1 = r3.mRoomsData
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> r0 = r6.LLILZIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            com.bytedance.android.livesdkapi.depend.model.live.RoomInfo r0 = (com.bytedance.android.livesdkapi.depend.model.live.RoomInfo) r0
            java.lang.String r0 = r0.getAnchorId()
            r1.userId = r0
        Lae:
            com.bytedance.android.livesdk.livesetting.feed.LiveDrawerSearchEnableSetting r0 = com.bytedance.android.livesdk.livesetting.feed.LiveDrawerSearchEnableSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto Lb9
            r6.LJJJIL(r3)
        Lb9:
            return r3
        Lba:
            if (r7 < 0) goto Lae
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.list.MultiRoomIdListProvider.LIZIZ(int):com.bytedance.android.livesdkapi.session.EnterRoomConfig");
    }

    @Override // X.C0IOG
    public final int LJIIIIZZ(EnterRoomConfig enterRoomConfig) {
        long j = enterRoomConfig.mRoomsData.roomId;
        for (int i = 0; i < ((ArrayList) this.LLILZIL).size(); i++) {
            if (((RoomInfo) ListProtector.get(this.LLILZIL, i)).getRoomId() == j) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.C0IOL
    public final void LJJIL(long j) {
        C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS13S0100100_7(this, j, 10));
    }

    public final void LJJJIL(EnterRoomConfig enterRoomConfig) {
        boolean z = this.LLJI;
        if (z && enterRoomConfig != null) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.fromNewStyle = z;
            roomsData.fromDrawerStyle = this.LLJIJIL;
            roomsData.enterFromLiveSource = this.LLJILJIL;
            EnterRoomConfig.DrawParams drawParams = this.LLJILJILJ;
            enterRoomConfig.drawParams = drawParams;
            if (drawParams.openLiveFromGameDrawer) {
                roomsData.windowMode = "small_picture";
            } else if (drawParams.openLiveFromDrawer) {
                roomsData.windowMode = "small_picture";
            } else {
                roomsData.windowMode = "full_screen";
            }
        }
    }

    public MultiRoomIdListProvider(Lifecycle lifecycle, List<RoomInfo> list, EnterRoomConfig enterRoomConfig) {
        ArrayList arrayList = new ArrayList();
        this.LLILZIL = arrayList;
        this.LLIZ = new ArrayList();
        this.LLJI = false;
        this.LLJIJIL = "";
        this.LLJILJIL = "";
        this.LLJILJILJ = new EnterRoomConfig.DrawParams();
        this.LLIZLLLIL = enterRoomConfig;
        arrayList.addAll(list);
        ArrayList arrayList2 = (ArrayList) list;
        long[] jArr = new long[arrayList2.size()];
        for (int i = 0; i < arrayList2.size(); i++) {
            if (ListProtector.get(list, i) != null) {
                jArr[i] = ((RoomInfo) ListProtector.get(list, i)).getRoomId();
            } else {
                jArr[i] = 0;
            }
        }
        lifecycle.addObserver(this);
        C464950ILd.LJI.getClass();
        this.LLJ = (C11JF) C464950ILd.LJFF(jArr).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS143S0200000_7((Object) this, (EmoteModel) list, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 21), new AfS132S0000000_7(25));
        if (LiveDrawerSearchEnableSetting.INSTANCE.getValue()) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            this.LLJI = roomsData.fromNewStyle;
            this.LLJIJIL = roomsData.fromDrawerStyle;
            this.LLJILJIL = roomsData.enterFromLiveSource;
            this.LLJILJILJ = enterRoomConfig.drawParams.clone();
        }
    }
}
