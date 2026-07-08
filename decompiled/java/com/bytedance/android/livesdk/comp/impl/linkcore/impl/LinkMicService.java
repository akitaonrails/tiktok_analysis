package com.bytedance.android.livesdk.comp.impl.linkcore.impl;

import X.C1303170k15;
import X.C1303220k1A;
import X.C1AXM;
import X.C1AXQ;
import X.C20441214yg;
import X.C2177031AIb;
import X.C2181461AZc;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C931800aM6;
import X.C951280arW;
import X.C965340bEC;
import X.C965660bEi;
import X.C965680bEk;
import X.C965750bEr;
import X.C967140bH6;
import X.C968840bJq;
import X.C968890bJv;
import X.EnumC945310aht;
import X.InterfaceC2181771Aa7;
import X.InterfaceC925040aBC;
import X.InterfaceC945140ahc;
import X.InterfaceC954180awC;
import X.InterfaceC964790bDJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.impl.linkcore.LinkCoreService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class LinkMicService implements ILinkMicService {
    @Override // com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService
    public final InterfaceC925040aBC builder() {
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ()) {
            InterfaceC925040aBC interfaceC925040aBC = new InterfaceC925040aBC() { // from class: X.0bEs
                public Room LIZ;
                public boolean LIZIZ;
                public DataChannel LIZJ;
                public InterfaceC937900aVw LIZLLL;

                @Override // X.InterfaceC925040aBC
                public final synchronized InterfaceC945140ahc LIZ(Context context) {
                    C965660bEi c965660bEi;
                    Room room = this.LIZ;
                    c965660bEi = null;
                    if (room != null) {
                        String strValueOf = String.valueOf(room.getId());
                        C965750bEr c965750bEr = C965750bEr.LIZ;
                        InterfaceC945140ahc interfaceC945140ahcLIZ = c965750bEr.LIZ(strValueOf);
                        if (!(interfaceC945140ahcLIZ instanceof C965660bEi) || (c965660bEi = (C965660bEi) interfaceC945140ahcLIZ) == null) {
                            LinkCoreService linkCoreService = new LinkCoreService();
                            linkCoreService.LIZ(this.LIZIZ, room);
                            c965660bEi = new C965660bEi(context, room, linkCoreService, this.LIZJ, this.LIZLLL);
                            c965750bEr.LIZIZ(strValueOf, c965660bEi);
                        }
                    }
                    return c965660bEi;
                }

                @Override // X.InterfaceC925040aBC
                public final InterfaceC925040aBC LIZIZ(DataChannel dataChannel) {
                    this.LIZJ = dataChannel;
                    return this;
                }

                @Override // X.InterfaceC925040aBC
                public final InterfaceC925040aBC LIZJ(InterfaceC937900aVw interfaceC937900aVw) {
                    this.LIZLLL = interfaceC937900aVw;
                    return this;
                }

                @Override // X.InterfaceC925040aBC
                public final InterfaceC925040aBC LIZLLL(Room room) {
                    this.LIZ = room;
                    return this;
                }

                @Override // X.InterfaceC925040aBC
                public final InterfaceC925040aBC LJ(boolean z) {
                    this.LIZIZ = z;
                    return this;
                }
            };
            C20441214yg.LIZIZ("LinkMicService", "union session enable");
            return interfaceC925040aBC;
        }
        InterfaceC925040aBC interfaceC925040aBC2 = new InterfaceC925040aBC() { // from class: X.0bEq
            public Room LIZ;
            public boolean LIZIZ;
            public InterfaceC937900aVw LIZJ;

            @Override // X.InterfaceC925040aBC
            public final InterfaceC925040aBC LIZIZ(DataChannel dataChannel) {
                return this;
            }

            @Override // X.InterfaceC925040aBC
            public final synchronized InterfaceC945140ahc LIZ(Context context) {
                C965670bEj c965670bEj;
                Room room = this.LIZ;
                Room room2 = null;
                if (room == null) {
                    room = null;
                }
                String strValueOf = String.valueOf(room.getId());
                C965750bEr c965750bEr = C965750bEr.LIZ;
                InterfaceC945140ahc interfaceC945140ahcLIZ = c965750bEr.LIZ(strValueOf);
                if (!(interfaceC945140ahcLIZ instanceof C965670bEj) || (c965670bEj = (C965670bEj) interfaceC945140ahcLIZ) == null) {
                    LinkCoreService linkCoreService = new LinkCoreService();
                    Room room3 = this.LIZ;
                    if (room3 == null) {
                        room3 = null;
                    }
                    linkCoreService.LIZ(this.LIZIZ, room3);
                    Context contextN3 = C786410Ut5.N3(context);
                    Room room4 = this.LIZ;
                    if (room4 != null) {
                        room2 = room4;
                    }
                    c965670bEj = new C965670bEj(contextN3, room2, linkCoreService, this.LIZJ);
                    c965750bEr.LIZIZ(strValueOf, c965670bEj);
                }
                return c965670bEj;
            }

            @Override // X.InterfaceC925040aBC
            public final InterfaceC925040aBC LIZJ(InterfaceC937900aVw interfaceC937900aVw) {
                this.LIZJ = interfaceC937900aVw;
                return this;
            }

            @Override // X.InterfaceC925040aBC
            public final InterfaceC925040aBC LIZLLL(Room room) {
                this.LIZ = room;
                return this;
            }

            @Override // X.InterfaceC925040aBC
            public final InterfaceC925040aBC LJ(boolean z) {
                this.LIZIZ = z;
                return this;
            }
        };
        C20441214yg.LIZIZ("LinkMicService", "union session disable");
        return interfaceC925040aBC2;
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService
    public final C965680bEk jz2() {
        return C965680bEk.LIZIZ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService
    public final C1303170k15 y22() {
        return C1303220k1A.LIZ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService
    public final void VH2(View view) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLayoutLayerRootAnchorPoint, anchorPointView=");
        sbLIZ.append(C500260Jjc.LJIIL(view));
        C20441214yg.LIZIZ("LinkMicLayoutLayerLauncher", C2188811AlT.LIZIZ(sbLIZ));
        C951280arW.LIZLLL = new WeakReference<>(view);
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService
    public final boolean zu(View view, ViewGroup.LayoutParams layoutParams, String str) {
        String str2;
        Object tag = view.getTag(R.id.ysw);
        if (tag instanceof String) {
            str2 = (String) tag;
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0) {
            InterfaceC945140ahc interfaceC945140ahcLIZ = C965750bEr.LIZ.LIZ(str2);
            if (interfaceC945140ahcLIZ != null && (interfaceC945140ahcLIZ instanceof C965660bEi)) {
                InterfaceC954180awC interfaceC954180awCLJIIIZ = ((C965660bEi) interfaceC945140ahcLIZ).LJIIIZ();
                if (interfaceC954180awCLJIIIZ == null) {
                    C20441214yg.LIZIZ("LinkMicManagerV2", "isNeedRoomCommonRenderViewControlPermission, ignore, not session");
                    return false;
                }
                InterfaceC964790bDJ interfaceC964790bDJLLJLILLLLZIIL = ((C965340bEC) interfaceC954180awCLJIIIZ).LLJLILLLLZIIL();
                if (interfaceC964790bDJLLJLILLLLZIIL instanceof InterfaceC2181771Aa7) {
                    return ((InterfaceC2181771Aa7) interfaceC964790bDJLLJLILLLLZIIL).zu(view, layoutParams, str);
                }
                C20441214yg.LIZIZ("LinkMicManagerV2", "isNeedRoomCommonRenderViewControlPermission, ignore, not target layout manager");
                return false;
            }
            C20441214yg.LIZIZ("LinkMicService", "isNeedRoomCommonRenderViewControlPermission, ignore, not target link mic manager");
            return false;
        }
        C20441214yg.LIZIZ("LinkMicService", "isNeedRoomCommonRenderViewControlPermission, ignore, not manager key");
        return false;
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService
    public final C2181461AZc l31(Context context, long j, long j2, String str, EnumC945310aht enumC945310aht, boolean z) {
        return new C2181461AZc(new C2177031AIb(context, 4, j2, str, j, new C1AXQ() { // from class: X.0bJx
            @Override // X.C1AXQ
            public final int LIZIZ() {
                return 0;
            }

            @Override // X.C1AXQ
            @InterfaceC1294060jmO
            public final void LIZJ(String str2) {
            }

            @Override // X.C1AXQ
            public final boolean LJ(String str2) {
                return false;
            }

            @Override // X.C1AXQ
            public final OnLineMicInfo LJFF(String str2) {
                return null;
            }

            @Override // X.C1AXQ
            public final void LJI() {
            }

            @Override // X.C1AXQ
            public final int LJII(int i) {
                return 0;
            }

            @Override // X.C1AXQ
            public final LinkUser LJIIJ(String str2) {
                return null;
            }

            @Override // X.C1AXQ
            public final long LJIIJJI() {
                return 0L;
            }

            @Override // X.C1AXQ
            public final boolean LJIIL() {
                return false;
            }

            @Override // X.C1AXQ
            public final void LJIILIIL() {
            }

            @Override // X.C1AXQ
            public final void LJIILJJIL(String str2, C1276750jKT c1276750jKT) {
            }

            @Override // X.C1AXQ
            public final int LJIILLIIL(int i) {
                return 0;
            }

            @Override // X.C1AXQ
            public final void LJIIZILJ(InterfaceC940430aa1 interfaceC940430aa1) {
            }

            @Override // X.C1AXQ
            public final void LJIJ(Map<Integer, Integer> map) {
            }

            @Override // X.C1AXQ
            public final OnLineMicInfo LJIJI(String str2) {
                return null;
            }

            @Override // X.C1AXQ
            public final void LJIJJ(String str2, boolean z2) {
            }

            @Override // X.C1AXQ
            public final void LJIJJLI(String str2, boolean z2) {
            }

            @Override // X.C1AXQ
            public final void LJIL(InterfaceC940430aa1 interfaceC940430aa1) {
            }

            @Override // X.C1AXQ
            @InterfaceC1294060jmO
            public final void LJJ(Map<String, String> map) {
            }

            @Override // X.C1AXQ
            public final int LJJI() {
                return 0;
            }

            @Override // X.C1AXQ
            public final LinkUser LJJIFFI(String str2) {
                return null;
            }

            @Override // X.C1AXQ
            public final void LJJIII(String str2, List<? extends C1276580jKC> list) {
            }

            @Override // X.C1AXQ
            public final String LJJIIJ() {
                return null;
            }

            @Override // X.C1AXQ
            public final int LJJIIJZLJL() {
                return 0;
            }

            @Override // X.C1AXQ
            public final boolean LJJIIZ() {
                return false;
            }

            @Override // X.C1AXQ
            public final boolean LJJIJ() {
                return false;
            }

            @Override // X.C1AXQ
            public final OnLineMicInfo LJJIJIIJI(String str2) {
                return null;
            }

            @Override // X.C1AXQ
            public final void LJJIJIL(String str2, float f, boolean z2) {
            }

            @Override // X.C1AXQ
            public final LinkUser LJJIJL(long j3) {
                return null;
            }

            @Override // X.C1AXQ
            public final OnLineMicInfo LJJIJLIJ(String str2) {
                return null;
            }

            @Override // X.C1AXQ
            public final LinkUser LJJIZ(String str2) {
                return null;
            }

            @Override // X.C1AXQ
            public final void LJJJ(int i, int i2, InterfaceC1303110k0z interfaceC1303110k0z, String str2) {
            }

            @Override // X.C1AXQ
            public final boolean LJJJI() {
                return false;
            }

            @Override // X.C1AXQ
            public final void LJJJIL() {
            }

            @Override // X.C1AXQ
            public final LinkUser LJJJJ(long j3) {
                return null;
            }

            @Override // X.C1AXQ
            public final String LJJJJI() {
                return "";
            }

            @Override // X.C1AXQ
            public final void LJJJLZIJ(Map<String, MicPositionContentInfo> map) {
            }

            @Override // X.C1AXQ
            public final boolean LJJJZ() {
                return false;
            }

            @Override // X.C1AXQ
            public final void LJJL(int i, String str2, InterfaceC1303160k14 interfaceC1303160k14, String str3) {
            }

            @Override // X.C1AXQ
            public final void LJJLI(String str2, String str3, List<? extends C1276580jKC> list, List<C1276780jKW> list2, List<? extends C1276580jKC> list3, List<C1276780jKW> list4, String str4, JSONObject jSONObject, JSONObject jSONObject2) {
            }

            @Override // X.C1AXQ
            public final void LJJLIIIIJ(List<C1276780jKW> list) {
            }

            @Override // X.C1AXQ
            public final boolean LJJLIIIJ(String str2) {
                return false;
            }

            @Override // X.C1AXQ
            @InterfaceC1294060jmO
            public final void LJJLIIIJILLIZJL() {
            }

            @Override // X.C1AXQ
            public final void LJJLIIIJJI(LinkLayerRTCMessage linkLayerRTCMessage) {
            }

            @Override // X.C1AXQ
            public final void LJJLIIIJJIZ(List<LinkUser> list, List<LinkUser> list2) {
            }

            @Override // X.C1AXQ
            @InterfaceC1294060jmO
            public final void LJJLIIIJL() {
            }

            @Override // X.C1AXQ
            public final InterfaceC1268870j7l LJJLIIIJLJLI() {
                return null;
            }

            @Override // X.C1AXQ
            public final boolean LJJLIIIJLLLLLLLZ() {
                return false;
            }

            @Override // X.C1AXQ
            public final void LJJLIIJ(Object obj) {
            }

            @Override // X.C1AXQ
            public final LiveStreamMixer LJJLIL(C968920bJy c968920bJy) {
                return null;
            }

            @Override // X.C1AXQ
            public final boolean LJJLJ() {
                return false;
            }

            @Override // X.C1AXQ
            public final void LJJLJLI(List<C1276780jKW> list) {
            }

            @Override // X.C1AXQ
            public final InterfaceC1268870j7l LJJLL(String str2) {
                return null;
            }

            @Override // X.C1AXQ
            public final void LJJZ(List<LinkUser> list, List<LinkUser> list2) {
            }

            @Override // X.C1AXQ
            public final void LJJZZI() {
            }

            @Override // X.C1AXQ
            public final void LJJZZIII(List list, C1AXU c1axu) {
            }

            @Override // X.C1AXQ
            public final void LJL(C969030bK9 c969030bK9) {
            }

            @Override // X.C1AXQ
            public final void LJLI(InterfaceC1280020jPk interfaceC1280020jPk) {
            }

            @Override // X.C1AXQ
            public final String getChannelId() {
                return "";
            }

            @Override // X.C1AXQ
            public final DataChannel getDataChannel() {
                return null;
            }

            @Override // X.C1AXQ
            public final String getGroupChannelId() {
                return "";
            }

            @Override // X.C1AXQ
            public final List<C1276580jKC> LJIILL() {
                return new ArrayList();
            }

            @Override // X.C1AXQ
            public final int LJJIL() {
                return C13BV.INSTANCE.size();
            }

            @Override // X.C1AXQ
            public final Pair<Integer, Integer> LJJJJJ() {
                return new Pair<>(0, 0);
            }

            @Override // X.C1AXQ
            public final Map<String, OnLineMicInfo> LIZ() {
                return C2097608Jq.LJ();
            }

            @Override // X.C1AXQ
            public final Map<String, OnLineMicInfo> LJIIIIZZ() {
                return C2097608Jq.LJ();
            }

            @Override // X.C1AXQ
            public final Map<String, OnLineMicInfo> LJJII() {
                return C2097608Jq.LJ();
            }

            @Override // X.C1AXQ
            public final Map<String, OnLineMicInfo> LJJIJIIJIL() {
                return C2097608Jq.LJ();
            }

            @Override // X.C1AXQ
            public final Map<String, OnLineMicInfo> LJJJJIZL() {
                return C2097608Jq.LJ();
            }

            @Override // X.C1AXQ
            public final List<LinkUser> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C1AXQ
            public final List<LinkUser> LJIIIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.C1AXQ
            public final C00IA z9() {
                return C00IA.NONE;
            }
        }, false, enumC945310aht, z), null);
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService
    public final C1AXM Ws2(long j, long j2, Context context, EnumC945310aht enumC945310aht, String str, boolean z, boolean z2) {
        return new C1AXM(new C2177031AIb(context, 0, j2, str, j, new C968890bJv(new C967140bH6(), new C968840bJq(), C1303220k1A.LIZ.getValue()), z, enumC945310aht, z2));
    }
}
