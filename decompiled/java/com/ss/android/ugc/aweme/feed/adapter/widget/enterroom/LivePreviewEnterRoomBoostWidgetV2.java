package com.ss.android.ugc.aweme.feed.adapter.widget.enterroom;

import X.C01GW;
import X.C0IS7;
import X.C1ACA;
import X.C2188811AlT;
import X.C452501pT;
import X.C465120ILu;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.bl.enterroomboost.EnterRoomUpdateManager;
import com.bytedance.android.livesdk.chatroom.bl.enterroomboost.LiveEnterRoomUpdateSetting;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.model.live.EnterRoomBoostEntra;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePreviewEnterRoomBoostWidgetV2 extends LiveWatchPreviewWidget {
    public boolean LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 149));

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        this.LLJ = false;
        M1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void E1() {
        this.LL = true;
        M1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void N1() {
        C1ACA c1aca;
        LiveRoomStruct liveRoomStruct;
        if (this.LLJ) {
            C1ACA c1acaZ1 = z1();
            if ((c1acaZ1 != null && c1acaZ1.LLFFF) || (c1aca = (C1ACA) this.LLJI.getValue()) == null || (liveRoomStruct = c1aca.LIZJ) == null) {
                return;
            }
            long j = liveRoomStruct.id;
            EnterRoomUpdateManager.LIZ.getClass();
            LiveEnterRoomUpdateSetting liveEnterRoomUpdateSetting = LiveEnterRoomUpdateSetting.INSTANCE;
            if (liveEnterRoomUpdateSetting.isEnable()) {
                int cacheUpdateMethod = liveEnterRoomUpdateSetting.getCacheUpdateMethod();
                if (cacheUpdateMethod == 0) {
                    EnterRoomUpdateManager.LJII.remove(String.valueOf(j));
                    EnterRoomUpdateManager.LJIIJ.LJ(String.valueOf(j));
                    EnterRoomUpdateManager.LJ();
                } else if (cacheUpdateMethod == 1) {
                    EnterRoomUpdateManager.LJIIJ.LJ(String.valueOf(j));
                }
            }
            this.LLJ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        N1();
    }

    public final void M1() {
        C1ACA c1aca;
        LiveRoomStruct liveRoomStruct;
        EnterRoomBoostEntra enterRoomBoostEntra;
        C1ACA c1aca2;
        LiveRoomStruct liveRoomStruct2;
        C1ACA c1aca3;
        LiveRoomStruct liveRoomStruct3;
        LiveRoomStruct liveRoomStruct4;
        LiveRoomStruct liveRoomStruct5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryStartUpdate: start, isUpdating = ");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(" roomId = ");
        C1ACA c1aca4 = (C1ACA) this.LLJI.getValue();
        Set set = null;
        sbLIZ.append((c1aca4 == null || (liveRoomStruct5 = c1aca4.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct5.id));
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJ || (c1aca = (C1ACA) this.LLJI.getValue()) == null || (liveRoomStruct = c1aca.LIZJ) == null || (enterRoomBoostEntra = liveRoomStruct.enterRoomExtra) == null || enterRoomBoostEntra.getUseEnterBoostCache() != 1 || enterRoomBoostEntra.getEnterBoostCacheVersion() == 0 || (c1aca2 = (C1ACA) this.LLJI.getValue()) == null || (liveRoomStruct2 = c1aca2.LIZJ) == null) {
            return;
        }
        String str = liveRoomStruct2.originStr;
        boolean z = true;
        if (str == null || str.length() == 0 || (c1aca3 = (C1ACA) this.LLJI.getValue()) == null || (liveRoomStruct3 = c1aca3.LIZJ) == null) {
            return;
        }
        long j = liveRoomStruct3.id;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 == null || (liveRoomStruct4 = c1acaZ1.LIZJ) == null) {
            return;
        }
        long anchorId = liveRoomStruct4.getAnchorId();
        EnterRoomUpdateManager enterRoomUpdateManager = EnterRoomUpdateManager.LIZ;
        Long lValueOf = Long.valueOf(anchorId);
        long enterBoostCacheVersion = enterRoomBoostEntra.getEnterBoostCacheVersion();
        enterRoomUpdateManager.getClass();
        LiveEnterRoomUpdateSetting liveEnterRoomUpdateSetting = LiveEnterRoomUpdateSetting.INSTANCE;
        if (liveEnterRoomUpdateSetting.isEnable()) {
            int cacheUpdateMethod = liveEnterRoomUpdateSetting.getCacheUpdateMethod();
            if (cacheUpdateMethod == 0) {
                ConcurrentHashMap<String, EnterRoomUpdateManager.RoomUpdateItem> concurrentHashMap = EnterRoomUpdateManager.LJII;
                EnterRoomUpdateManager.RoomUpdateItem roomUpdateItem = concurrentHashMap.get(String.valueOf(j));
                if (roomUpdateItem == null) {
                    concurrentHashMap.put(String.valueOf(j), new EnterRoomUpdateManager.RoomUpdateItem(String.valueOf(j), null, str, enterBoostCacheVersion, true, lValueOf, 2, null, -1));
                    set = null;
                    z = true;
                } else {
                    roomUpdateItem.LIZ = null;
                    roomUpdateItem.LIZIZ = str;
                    roomUpdateItem.baseVersion = enterBoostCacheVersion;
                    roomUpdateItem.shouldRefresh = true;
                    roomUpdateItem.LIZJ = lValueOf;
                    roomUpdateItem.LIZLLL = 2;
                }
                EnterRoomUpdateManager.LIZ(set);
                EnterRoomUpdateManager.LJ();
            } else if (cacheUpdateMethod == 1) {
                String strValueOf = String.valueOf(j);
                C0IS7<String, C465120ILu> c0is7 = EnterRoomUpdateManager.LJIIJ;
                C465120ILu c465120ILuLIZIZ = c0is7.LIZIZ(strValueOf);
                if (c465120ILuLIZIZ == null) {
                    c465120ILuLIZIZ = new C465120ILu(null);
                    c465120ILuLIZIZ.LIZIZ = str;
                    c465120ILuLIZIZ.LJFF = 2;
                    c465120ILuLIZIZ.LIZLLL = enterBoostCacheVersion;
                    c465120ILuLIZIZ.LJ = 0;
                } else {
                    c465120ILuLIZIZ.LIZIZ = str;
                    c465120ILuLIZIZ.LIZLLL = enterBoostCacheVersion;
                    c465120ILuLIZIZ.LJ = 0;
                }
                c0is7.LIZLLL(strValueOf, c465120ILuLIZIZ);
            }
        }
        this.LLJ = z;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        N1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        M1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        N1();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        N1();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInit: args = ");
        if (objArr != null) {
            string = Arrays.toString(objArr);
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoad: args = ");
        if (objArr != null) {
            string = Arrays.toString(objArr);
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        super.onLoad(objArr);
    }
}
