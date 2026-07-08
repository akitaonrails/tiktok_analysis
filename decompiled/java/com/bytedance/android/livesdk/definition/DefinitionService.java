package com.bytedance.android.livesdk.definition;

import X.C0IJT;
import X.C0IL2;
import X.C0IN9;
import X.C0INE;
import X.C0INF;
import X.C1161920gLG;
import X.C123100dR;
import X.C13LP;
import X.C1697810uHb;
import X.C354201Zc;
import X.C474500IjA;
import X.C480680It8;
import X.C491701vn;
import X.C500260Jjc;
import X.C930940aKi;
import X.InterfaceC480510Isr;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public class DefinitionService implements IDefinitionService {
    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final boolean b21() {
        return a0.LJJIIZI(C0IN9.LIZIZ(), "auto", false);
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final void AQ1(FragmentManager fragmentManager) {
        new LiveDefinitionSelectionDialog().show(fragmentManager, "LiveDefinitionSelectionDialog");
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final List<Pair<String, String>> An1(DataChannel dataChannel) {
        List<C0INF> listLIZ = C0INE.LIZ(dataChannel);
        ArrayList arrayList = new ArrayList(listLIZ.size());
        for (C0INF c0inf : listLIZ) {
            String str = c0inf.LIZIZ;
            String str2 = c0inf.LIZ;
            if (str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2)) {
                arrayList.add(new Pair(str, str2));
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final boolean NM(String str) {
        InterfaceC480510Isr interfaceC480510IsrLIZIZ;
        IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
        if (iPullStreamService != null && (interfaceC480510IsrLIZIZ = iPullStreamService.YY().LIZIZ(str)) != null) {
            return Intrinsics.LJFF("auto", interfaceC480510IsrLIZIZ.getCurrentResolution());
        }
        return false;
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final Pair<String, String> kM2(DataChannel dataChannel) {
        C0INF next;
        List<C0INF> listLIZ = C0INE.LIZ(dataChannel);
        if (listLIZ != null) {
            Iterator<C0INF> it2 = listLIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZIZ, "auto")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0INF c0inf = next;
            if (c0inf != null) {
                String str = c0inf.LIZ;
                String str2 = c0inf.LIZIZ;
                if (str != null && str2 != null) {
                    return new Pair<>(str2, str);
                }
            }
        }
        Iterator<C0INF> it3 = listLIZ.iterator();
        int i = 0;
        while (it3.hasNext()) {
            it3.next();
            int i2 = i + 1;
            if (i >= 0) {
                if (((C0INF) ListProtector.get(listLIZ, i)).LIZJ && i2 < listLIZ.size()) {
                    String str3 = ((C0INF) ListProtector.get(listLIZ, i2)).LIZ;
                    String str4 = ((C0INF) ListProtector.get(listLIZ, i2)).LIZIZ;
                    if (str3 != null && str4 != null) {
                        return new Pair<>(str4, str3);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final Pair<String, String> ll2(DataChannel dataChannel) {
        String currentResolution;
        C480680It8 c480680It8YY;
        InterfaceC480510Isr interfaceC480510IsrLIZIZ;
        List<C0INF> listLIZ = C0INE.LIZ(dataChannel);
        String str = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        if (str == null) {
            str = "";
        }
        IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
        if (iPullStreamService != null && (c480680It8YY = iPullStreamService.YY()) != null && (interfaceC480510IsrLIZIZ = c480680It8YY.LIZIZ(str)) != null) {
            currentResolution = interfaceC480510IsrLIZIZ.getCurrentResolution();
        } else {
            currentResolution = null;
        }
        Iterator<C0INF> it2 = listLIZ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            it2.next();
            int i2 = i + 1;
            if (i >= 0) {
                if (i2 < listLIZ.size() && Intrinsics.LJFF(((C0INF) ListProtector.get(listLIZ, i)).LIZIZ, currentResolution)) {
                    String str2 = ((C0INF) ListProtector.get(listLIZ, i2)).LIZ;
                    String str3 = ((C0INF) ListProtector.get(listLIZ, i2)).LIZIZ;
                    if (str2 != null && str3 != null) {
                        return new Pair<>(str3, str2);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final boolean vf1(DataChannel dataChannel) {
        String str;
        C0INF c0inf = (C0INF) C13LP.LJJLIIIJL(C0INE.LIZ(dataChannel));
        if (c0inf != null) {
            str = c0inf.LIZIZ;
        } else {
            str = null;
        }
        String strLIZJ = C0INE.LIZJ();
        if (C123100dR.LIZ(str) && Intrinsics.LJFF(strLIZJ, str)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final void EJ0(EnterRoomConfig enterRoomConfig, String str) {
        HashMap map = new HashMap();
        if (enterRoomConfig != null) {
            String str2 = enterRoomConfig.mRoomsData.enterFromMerge;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            map.put("enter_from_merge", str2);
            String str4 = enterRoomConfig.mRoomsData.enterMethod;
            if (str4 == null) {
                str4 = "";
            }
            map.put("enter_method", str4);
            String str5 = enterRoomConfig.mRoomsData.actionType;
            if (str5 != null) {
                str3 = str5;
            }
            map.put("action_type", str3);
        }
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_user_screen_rotate_btn_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
        c474500IjALIZIZ.LJJII(C491701vn.LIZ(), "anchor_id");
        c474500IjALIZIZ.LJJII(str, "room_id");
        c474500IjALIZIZ.LJJIIZI(map);
        c474500IjALIZIZ.LIZ();
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final String my2(int i, int i2) {
        if (i2 != -1) {
            if (C500260Jjc.LJJII(i2)) {
                if (C500260Jjc.LJJII(i)) {
                    return "landscape_to_landscape";
                }
                return "landscape_to_portrait";
            }
            if (C500260Jjc.LJJIII(i2) && C500260Jjc.LJJII(i)) {
                return "portrait_to_landscape";
            }
            return "null";
        }
        return "null";
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final void nt1(String str, String str2) {
        C491701vn.LIZJ(str, str2, "1");
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final void vQ(String str, String str2, String str3) {
        String currentResolution;
        String str4;
        LiveMode streamType;
        String str5 = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        String strLIZ = "";
        if (str5 == null) {
            str5 = "";
        }
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str5);
        if (interfaceC480510IsrLIZIZ == null || (currentResolution = interfaceC480510IsrLIZIZ.getCurrentResolution()) == null) {
            currentResolution = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_definition_switch_show");
        c474500IjALIZ.LJJII(C491701vn.LIZ(), "anchor_id");
        c474500IjALIZ.LJJII(str, "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(C491701vn.LIZIZ()), "user_id");
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        if (Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, str3)) {
            str4 = "portrait";
        } else {
            str4 = "landscape";
        }
        c474500IjALIZ.LJJII(str4, "room_orientation");
        c474500IjALIZ.LJJII(currentResolution, "current_definition");
        c474500IjALIZ.LJJ(str2);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    @Override // com.bytedance.android.live.definition.IDefinitionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vu2(int r6, int r7, int r8, long r9, java.lang.String r11, java.lang.String r12) {
        /*
            r5 = this;
            java.lang.String r0 = "livesdk_user_screen_rotate_btn_click"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            java.lang.String r1 = "anchor_id"
            java.lang.String r0 = X.C491701vn.LIZ()
            r2.LJJII(r0, r1)
            java.lang.String r0 = "room_id"
            r2.LJJII(r11, r0)
            java.lang.String r0 = "action"
            r2.LJJII(r12, r0)
            boolean r0 = X.C500260Jjc.LJJIII(r6)
            if (r0 == 0) goto Lab
            java.lang.String r1 = "0"
        L21:
            java.lang.String r0 = "room_orientation_after"
            r2.LJJII(r1, r0)
            if (r6 == r7) goto La8
            boolean r0 = X.C500260Jjc.LJJII(r7)
            if (r0 == 0) goto L99
            boolean r0 = X.C500260Jjc.LJJII(r6)
            if (r0 == 0) goto L96
            java.lang.String r1 = "landscape_to_landscape"
        L36:
            java.lang.String r0 = "rotate_type"
            r2.LJJII(r1, r0)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r9
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r3 = r3 / r0
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "duration"
            r2.LJJII(r1, r0)
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L60
            java.util.Map r0 = r0.getMultiStreamLogParams()
            r2.LJJIIZI(r0)
        L60:
            qo2.w r0 = qo2.w.LIZ
            r0.getClass()
            java.lang.String r1 = qo2.w.LJIIL()
            java.lang.String r0 = "enter_method"
            r2.LJJII(r1, r0)
            java.lang.String r1 = qo2.w.LJIIIZ()
            java.lang.String r0 = "enter_from_merge"
            r2.LJJII(r1, r0)
            java.lang.String r1 = qo2.w.LIZLLL()
            java.lang.String r0 = "action_type"
            r2.LJJII(r1, r0)
            java.lang.String r1 = qo2.w.LJIJI()
            java.lang.String r0 = "request_id"
            r2.LJJII(r1, r0)
            java.lang.String r1 = "position"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.LJJII(r0, r1)
            r2.LIZ()
            return
        L96:
            java.lang.String r1 = "landscape_to_portrait"
            goto L36
        L99:
            boolean r0 = X.C500260Jjc.LJJIII(r7)
            if (r0 == 0) goto La8
            boolean r0 = X.C500260Jjc.LJJII(r6)
            if (r0 == 0) goto La8
            java.lang.String r1 = "portrait_to_landscape"
            goto L36
        La8:
            java.lang.String r1 = "null"
            goto L36
        Lab:
            java.lang.String r1 = "1"
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.definition.DefinitionService.vu2(int, int, int, long, java.lang.String, java.lang.String):void");
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final void Cx(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C491701vn.LIZLLL(str, str2, str3, str4, str5, str6, str7);
    }
}
