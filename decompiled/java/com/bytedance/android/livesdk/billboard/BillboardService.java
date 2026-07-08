package com.bytedance.android.livesdk.billboard;

import X.AnonymousClass0151;
import X.AnonymousClass0154;
import X.C011V;
import X.C098200Yq;
import X.C1103880epe;
import X.C1338270kvh;
import X.C13LE;
import X.C1834150xpV;
import X.C189200o6;
import X.C19719912Dl;
import X.C201400q4;
import X.C201600q6;
import X.C201700q7;
import X.C2188811AlT;
import X.C2757014x;
import X.C2758014y;
import X.C786410Ut5;
import X.InterfaceC1103900epg;
import X.InterfaceC201500q5;
import X.InterfaceC782440Umg;
import Y.ATListenerS450S0100000_17;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.livesdk.billboard.audience.LiveAudienceBillboardWidget;
import com.bytedance.android.livesdk.billboard.broadcast.LiveBroadcastBillboardWidget;
import com.bytedance.android.livesdk.billboard.broadcast.LiveBroadcastPreviewBillboardWidget;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.setting.LiveDecorationAudienceHideNativeBoard;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.setting.LiveDecorationAudienceHideNativeBoardSMB;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.host_board.DisplayPosition;
import webcast.data.host_board.HostBoard;
import webcast.data.host_board.MultiHostBoard;

/* JADX INFO: loaded from: classes.dex */
public class BillboardService implements IBillboardService {
    public final HashMap<String, MutableLiveData<C201600q6>> LL = new HashMap<>();
    public WeakReference<C1103880epe> LLILLJJLI;
    public final HashMap<String, AnonymousClass0154> LLILLL;
    public final HashMap<String, InterfaceC1103900epg> LLILZ;

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final C19719912Dl bM1() {
        return C13LE.LIZ(LiveBroadcastPreviewBillboardWidget.class);
    }

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final C1103880epe W01() {
        WeakReference<C1103880epe> weakReference = this.LLILLJJLI;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public BillboardService() {
        HashMap<String, AnonymousClass0154> map = new HashMap<>();
        this.LLILLL = map;
        HashMap<String, InterfaceC1103900epg> map2 = new HashMap<>();
        this.LLILZ = map2;
        map2.put("pcs", new InterfaceC1103900epg() { // from class: X.00q3
            @Override // X.InterfaceC1103900epg
            public final void LIZ(HostBoard hostBoard, C201700q7 c201700q7) {
                Long lValueOf;
                String str;
                DataChannel dataChannel = c201700q7.LJ;
                if (dataChannel != null) {
                    long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
                    if (jLJJLIIIJ <= 0) {
                        return;
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_secondary_board_use");
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                    DataChannel dataChannel2 = c201700q7.LJ;
                    if (dataChannel2 != null) {
                        lValueOf = Long.valueOf(C500260Jjc.LIZIZ(dataChannel2));
                    } else {
                        lValueOf = null;
                    }
                    c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                    c474500IjALIZ.LJJII(Long.valueOf(jLJJLIIIJ), "room_id");
                    C147400hM.LIZ(c474500IjALIZ, hostBoard.paramsData);
                    if (c201700q7.LIZJ == C011V.BROADCAST) {
                        str = "anchor";
                    } else {
                        str = "audience";
                    }
                    c474500IjALIZ.LJJII(str, "user_type");
                    c474500IjALIZ.LJJII("show", "action_type");
                    c474500IjALIZ.LIZ();
                }
            }

            @Override // X.InterfaceC1103900epg
            public final void LIZIZ(String str, HostBoard hostBoard, C201700q7 c201700q7) {
                Long lValueOf;
                String str2;
                DataChannel dataChannel = c201700q7.LJ;
                if (dataChannel != null) {
                    long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
                    if (jLJJLIIIJ <= 0) {
                        return;
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_secondary_board_use");
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                    DataChannel dataChannel2 = c201700q7.LJ;
                    if (dataChannel2 != null) {
                        lValueOf = Long.valueOf(C500260Jjc.LIZIZ(dataChannel2));
                    } else {
                        lValueOf = null;
                    }
                    c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                    c474500IjALIZ.LJJII(Long.valueOf(jLJJLIIIJ), "room_id");
                    C147400hM.LIZ(c474500IjALIZ, hostBoard.paramsData);
                    if (c201700q7.LIZJ == C011V.BROADCAST) {
                        str2 = "anchor";
                    } else {
                        str2 = "audience";
                    }
                    c474500IjALIZ.LJJII(str2, "user_type");
                    c474500IjALIZ.LJJII(str, "action_type");
                    c474500IjALIZ.LIZ();
                }
            }
        });
        map2.put("donation", new InterfaceC1103900epg() { // from class: X.00q2
            @Override // X.InterfaceC1103900epg
            public final void LIZ(HostBoard hostBoard, C201700q7 c201700q7) {
                Object c098200Yq;
                String str;
                String string = null;
                try {
                    byte[] bArr = hostBoard.paramsData;
                    if (bArr != null) {
                        HashMap<String, Object> mapLJLZ = C500260Jjc.LJLZ(bArr);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, Object> entry : mapLJLZ.entrySet()) {
                            if (entry.getValue() instanceof String) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
                        for (Object obj : linkedHashMap.entrySet()) {
                            linkedHashMap2.put(((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj).getValue());
                        }
                        c098200Yq = new HashMap(linkedHashMap2);
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = null;
                }
                HashMap map3 = (HashMap) c098200Yq;
                if (c201700q7.LIZJ == C011V.BROADCAST) {
                    str = "anchor";
                } else if (C01C5.LIZ(c201700q7.LJ)) {
                    str = "admin";
                } else {
                    str = "viewer";
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_donation_infoboard_show");
                c474500IjALIZ.LJIJJLI(c201700q7.LJ);
                c474500IjALIZ.LJJIIZI(map3);
                c474500IjALIZ.LJJIIZI(c201700q7.LJFF);
                c474500IjALIZ.LJJII(str, "user_type");
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                if (interfaceC500940JkiUser != null) {
                    string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString();
                }
                c474500IjALIZ.LJJII(string, "user_id");
                c474500IjALIZ.LIZ();
            }

            @Override // X.InterfaceC1103900epg
            public final void LIZIZ(String str, HostBoard hostBoard, C201700q7 c201700q7) {
                Object c098200Yq;
                String str2;
                String string = null;
                try {
                    byte[] bArr = hostBoard.paramsData;
                    if (bArr != null) {
                        HashMap<String, Object> mapLJLZ = C500260Jjc.LJLZ(bArr);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, Object> entry : mapLJLZ.entrySet()) {
                            if (entry.getValue() instanceof String) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
                        for (Object obj : linkedHashMap.entrySet()) {
                            linkedHashMap2.put(((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj).getValue());
                        }
                        c098200Yq = new HashMap(linkedHashMap2);
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = null;
                }
                HashMap map3 = (HashMap) c098200Yq;
                if (c201700q7.LIZJ == C011V.BROADCAST) {
                    str2 = "anchor";
                } else if (C01C5.LIZ(c201700q7.LJ)) {
                    str2 = "admin";
                } else {
                    str2 = "viewer";
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_donation_infoboard_click");
                c474500IjALIZ.LJIJJLI(c201700q7.LJ);
                c474500IjALIZ.LJJIIZI(map3);
                c474500IjALIZ.LJJIIZI(c201700q7.LJFF);
                c474500IjALIZ.LJJII(str2, "user_type");
                c474500IjALIZ.LJJII(str, "click_type");
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                if (interfaceC500940JkiUser != null) {
                    string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString();
                }
                c474500IjALIZ.LJJII(string, "user_id");
                c474500IjALIZ.LIZ();
            }
        });
        map.put("pcs", new AnonymousClass0154() { // from class: X.0153
            @Override // X.AnonymousClass0154
            public final EnumC2759014z LIZ(Room room, HostBoard hostBoard) {
                if (LiveDecorationAudienceHideNativeBoard.INSTANCE.getValue() && !C494680Jac.LJIIIZ(room) && Intrinsics.LJFF(hostBoard.bizType, "pcs")) {
                    return EnumC2759014z.DELETE_AND_HIDE;
                }
                if (LiveDecorationAudienceHideNativeBoardSMB.INSTANCE.getValue() && C494680Jac.LJIIIZ(room) && Intrinsics.LJFF(hostBoard.bizType, "pcs")) {
                    return EnumC2759014z.DELETE_AND_HIDE;
                }
                return EnumC2759014z.ACCEPT_AND_SHOW;
            }
        });
    }

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final Class<? extends LiveRecyclableWidget> wq0() {
        return LiveAudienceBillboardWidget.class;
    }

    public final MutableLiveData<C201600q6> LIZIZ(String str) {
        HashMap<String, MutableLiveData<C201600q6>> map = this.LL;
        MutableLiveData<C201600q6> mutableLiveData = map.get(str);
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>(null);
            map.put(str, mutableLiveData);
        }
        return mutableLiveData;
    }

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final LiveBroadcastBillboardWidget Lh2(InterfaceC782440Umg interfaceC782440Umg) {
        LiveBroadcastBillboardWidget liveBroadcastBillboardWidget = new LiveBroadcastBillboardWidget();
        if (interfaceC782440Umg != null) {
            interfaceC782440Umg.LLLL(new ATListenerS450S0100000_17(liveBroadcastBillboardWidget, 12));
        }
        return liveBroadcastBillboardWidget;
    }

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final View Yt0(C201700q7 c201700q7) {
        Object c098200Yq;
        try {
            c098200Yq = new C1103880epe(C1834150xpV.LJII(c201700q7.LIZ), c201700q7);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (c201700q7.LIZJ == C011V.BROADCAST) {
            this.LLILLJJLI = new WeakReference<>(c098200Yq);
        }
        return (View) c098200Yq;
    }

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final InterfaceC1103900epg xd1(String str) {
        return this.LLILZ.get(str);
    }

    public static String LIZ(C011V c011v, Long l) {
        if (c011v != null) {
            int i = C2758014y.LIZIZ[c011v.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    return LivePreviewCTASmartDisplayManager.DEFAULT;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c011v.name());
                sbLIZ.append('_');
                sbLIZ.append(l);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return c011v.name();
        }
        return LivePreviewCTASmartDisplayManager.DEFAULT;
    }

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final void Kl1(C011V c011v, Long l) {
        String strLIZ = LIZ(c011v, l);
        MutableLiveData<C201600q6> mutableLiveData = this.LL.get(strLIZ);
        if (mutableLiveData != null) {
            mutableLiveData.setValue(null);
        }
        this.LL.remove(strLIZ);
    }

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final MutableLiveData w71(C011V c011v, Long l) {
        return LIZIZ(LIZ(c011v, l));
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x011d, code lost:
    
        r3.LIZ.add(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(webcast.data.host_board.MultiHostBoard r18, X.C011V r19, com.bytedance.android.livesdkapi.depend.model.live.Room r20) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.billboard.BillboardService.LIZJ(webcast.data.host_board.MultiHostBoard, X.011V, com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final boolean Ox1(InterfaceC201500q5 interfaceC201500q5, C011V c011v, Long l) {
        String str = interfaceC201500q5.LIZ().boardId;
        MutableLiveData<C201600q6> mutableLiveDataLIZIZ = LIZIZ(LIZ(c011v, l));
        C201600q6 value = mutableLiveDataLIZIZ.getValue();
        if (value != null) {
            C201600q6 c201600q6LIZ = C201400q4.LIZ(value);
            Iterator<C2757014x> it2 = c201600q6LIZ.LIZ.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it2.next().LIZ.boardId, str)) {
                    if (i != -1) {
                        C2757014x c2757014x = (C2757014x) ListProtector.get(c201600q6LIZ.LIZ, i);
                        C2757014x c2757014x2 = new C2757014x(C201400q4.LIZIZ(interfaceC201500q5), null, null, null, false, 30);
                        c2757014x2.LJ = c2757014x.LJ;
                        c2757014x2.LIZLLL = c2757014x.LIZLLL;
                        c2757014x2.LIZJ = interfaceC201500q5;
                        ListProtector.set(c201600q6LIZ.LIZ, i, c2757014x2);
                        c201600q6LIZ.LIZJ = false;
                        mutableLiveDataLIZIZ.setValue(c201600q6LIZ);
                        return true;
                    }
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final boolean fR(HostBoard hostBoard, C011V c011v, Long l) {
        MutableLiveData<C201600q6> mutableLiveDataLIZIZ = LIZIZ(LIZ(c011v, l));
        C201600q6 value = mutableLiveDataLIZIZ.getValue();
        if (value != null) {
            C201600q6 c201600q6LIZ = C201400q4.LIZ(value);
            Iterator<C2757014x> it2 = c201600q6LIZ.LIZ.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it2.next().LIZ.boardId, hostBoard.boardId)) {
                    if (i != -1) {
                        C2757014x c2757014x = (C2757014x) ListProtector.get(c201600q6LIZ.LIZ, i);
                        C2757014x c2757014x2 = new C2757014x(hostBoard, null, null, null, false, 30);
                        c2757014x2.LJ = c2757014x.LJ;
                        c2757014x2.LIZLLL = c2757014x.LIZLLL;
                        ListProtector.set(c201600q6LIZ.LIZ, i, c2757014x2);
                        c201600q6LIZ.LIZJ = false;
                        mutableLiveDataLIZIZ.setValue(c201600q6LIZ);
                        return true;
                    }
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final boolean rN2(String str, C011V c011v, Long l) {
        MutableLiveData<C201600q6> mutableLiveDataLIZIZ = LIZIZ(LIZ(c011v, l));
        C201600q6 value = mutableLiveDataLIZIZ.getValue();
        if (value != null) {
            C201600q6 c201600q6LIZ = C201400q4.LIZ(value);
            Iterator<C2757014x> it2 = c201600q6LIZ.LIZ.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().LIZ.boardId, str)) {
                    it2.remove();
                    c201600q6LIZ.LIZJ = false;
                    mutableLiveDataLIZIZ.setValue(c201600q6LIZ);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final void yw2(final MultiHostBoard multiHostBoard, final C011V c011v, final Room room) {
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BillboardService#setCurrentHostBoard: hostBoard=");
        sbLIZ.append(multiHostBoard);
        sbLIZ.append(" scene: ");
        sbLIZ.append(c011v);
        sbLIZ.append(", roomId: ");
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (multiHostBoard == null || room == null) {
            return;
        }
        if (LIZIZ(LIZ(c011v, Long.valueOf(room.getId()))).getValue() == null) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0150
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BillboardService@9b01.setCurrentHostBoard$1");
                    try {
                        this.LL.LIZJ(multiHostBoard, c011v, room);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BillboardService@9b01.setCurrentHostBoard$1");
                }
            });
        } else {
            LIZJ(multiHostBoard, c011v, room);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if ((r8.size() + 1) > r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (r14 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        r0 = com.bytedance.android.livesdk.billboard.broadcast.BillboardMultiDeleteConfirmSheetFragment._pnsPageId;
        X.C01GH.LIZ(r3, r5, r11, new X.AnonymousClass0152(r10, r11, r12, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        r1 = r11.LIZ.boardId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
    
        if (r1.length() > 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if ((r8.size() + 1) <= r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[LOOP:1: B:16:0x004f->B:18:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZLLL(X.C2757014x r11, X.C011V r12, java.lang.Long r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.billboard.BillboardService.LIZLLL(X.014x, X.011V, java.lang.Long, boolean):java.lang.String");
    }

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final String gw2(HostBoard hostBoard, C011V c011v, Long l, DisplayPosition displayPosition) {
        if (hostBoard.cellList.isEmpty()) {
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        return LIZLLL(new C2757014x(hostBoard, null, null, displayPosition, false, 22), c011v, l, false);
    }

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final String kF1(AnonymousClass0151 anonymousClass0151, C011V c011v, Long l, DisplayPosition displayPosition) {
        HostBoard hostBoard = new HostBoard();
        anonymousClass0151.getBoardId();
        hostBoard.boardId = "vertical_fixed";
        anonymousClass0151.getBizType();
        hostBoard.bizType = "viewer_wishes";
        anonymousClass0151.LIZJ();
        hostBoard.subBizType = "single_live";
        hostBoard.nonFoldable = !anonymousClass0151.LJ();
        hostBoard.nonDeletable = !anonymousClass0151.LIZLLL();
        hostBoard.nonClippable = true;
        anonymousClass0151.LJFF();
        hostBoard.boardInfo = null;
        return LIZLLL(new C2757014x(hostBoard, anonymousClass0151, null, displayPosition, false, 20), c011v, l, false);
    }

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final String r92(InterfaceC201500q5 interfaceC201500q5, C011V c011v, Long l, DisplayPosition displayPosition) {
        return LIZLLL(new C2757014x(C201400q4.LIZIZ(interfaceC201500q5), null, interfaceC201500q5, displayPosition, false, 18), c011v, l, false);
    }

    @Override // com.bytedance.android.live.billboard.IBillboardService
    public final String cX1(String str, HostBoard hostBoard, C011V c011v, Long l, DisplayPosition displayPosition) {
        C201600q6 value = LIZIZ(LIZ(c011v, l)).getValue();
        if (value != null) {
            Iterator<C2757014x> it2 = value.LIZ.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().LIZ.boardId, str)) {
                    it2.remove();
                }
            }
        }
        return gw2(hostBoard, c011v, l, displayPosition);
    }
}
