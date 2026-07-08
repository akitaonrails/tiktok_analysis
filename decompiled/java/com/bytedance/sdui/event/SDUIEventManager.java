package com.bytedance.sdui.event;

import X.AbstractC1317090kNX;
import X.C1291190jhl;
import X.C1294230jmf;
import X.C1298390jtN;
import X.C1298400jtO;
import X.C1298950juH;
import X.C1298960juI;
import X.C1317240kNm;
import X.C1317360kNy;
import X.C1317810kOh;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1298380jtM;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdui.serializedData.common.EventRequest;
import com.bytedance.sdui.serializedData.common.event.ClientEvent;
import com.bytedance.sdui.serializedData.common.event.CustomEvent;
import com.bytedance.sdui.serializedData.common.event.GlobalEvent;
import com.bytedance.sdui.serializedData.common.event.TouchEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class SDUIEventManager {
    public final AnonymousClass1 LIZ;
    public final ArrayList<ClientEvent> LIZIZ;
    public final AbstractC1317090kNX LIZJ;

    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Handler, com.bytedance.sdui.event.SDUIEventManager$1] */
    public SDUIEventManager(AbstractC1317090kNX abstractC1317090kNX) {
        ?? r3 = new BPEAHandler(Looper.getMainLooper()) { // from class: com.bytedance.sdui.event.SDUIEventManager.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("SDUIEventManager@70ae.<field>$1");
                switch (message.what) {
                    case 10001:
                        C786410Ut5.LJLJJI(10001, C1317810kOh.LJFF, SDUIEventManager.this.LIZ);
                    case 10002:
                    case 10003:
                        if (!SDUIEventManager.this.LIZIZ.isEmpty()) {
                            EventRequest eventRequest = new EventRequest();
                            eventRequest.LIZJ = new ArrayList(SDUIEventManager.this.LIZIZ);
                            SDUIEventManager.this.LIZJ.LLJJ.LJIIIIZZ(eventRequest);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("send client events success, event num:");
                            sbLIZ.append(SDUIEventManager.this.LIZIZ.size());
                            C2188811AlT.LIZIZ(sbLIZ);
                            int i = C1317360kNy.LIZ;
                            SDUIEventManager.this.LIZIZ.clear();
                        }
                        break;
                }
                C1C7U.LIZIZ("SDUIEventManager@70ae.<field>$1");
            }
        };
        this.LIZ = r3;
        this.LIZIZ = new ArrayList<>();
        System.currentTimeMillis();
        this.LIZJ = abstractC1317090kNX;
        C786410Ut5.LJLJJI(10001, C1317810kOh.LJFF, r3);
    }

    public final void LIZ(ClientEvent clientEvent, boolean z) {
        this.LIZIZ.add(clientEvent);
        if (z) {
            C786410Ut5.LJLILLLLZI(this.LIZ, 10003);
        }
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        ClientEvent clientEvent = new ClientEvent();
        GlobalEvent globalEvent = new GlobalEvent();
        globalEvent.LIZ = str;
        if (jSONObject != null) {
            globalEvent.LIZIZ = C786410Ut5.J3(jSONObject);
        }
        clientEvent.LIZLLL = globalEvent;
        LIZ(clientEvent, true);
    }

    public final void LIZJ(EnumC1298380jtM enumC1298380jtM, C1298400jtO c1298400jtO) {
        JSONObject jSONObject;
        int i = C1298390jtN.LIZ[enumC1298380jtM.ordinal()];
        if (i != 1) {
            if (i == 2 && (c1298400jtO instanceof C1294230jmf)) {
                ClientEvent clientEvent = new ClientEvent();
                CustomEvent customEvent = new CustomEvent();
                customEvent.LIZ = c1298400jtO.LIZIZ;
                customEvent.LIZIZ = c1298400jtO.LIZ;
                C1294230jmf c1294230jmf = (C1294230jmf) c1298400jtO;
                customEvent.LIZJ = c1294230jmf.LIZIZ();
                Map<String, Object> mapLIZ = c1294230jmf.LIZ();
                if (mapLIZ == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(mapLIZ);
                }
                customEvent.LIZLLL = C786410Ut5.J3(jSONObject);
                customEvent.LJ = System.currentTimeMillis();
                clientEvent.LIZIZ = customEvent;
                C1317240kNm c1317240kNm = C1317240kNm.LIZ;
                String str = customEvent.LIZ;
                c1317240kNm.getClass();
                LIZ(clientEvent, true ^ ((ArrayList) C1317240kNm.LIZIZ).contains(str));
                if (c1298400jtO.LIZIZ.equals("nodeappear")) {
                    try {
                        this.LIZJ.LLJJJJ.LIZ(((Integer) ((C1294230jmf) c1298400jtO).LIZ().get("position")).intValue(), ((C1294230jmf) c1298400jtO).LIZ);
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZJ.LLIZLLLIL.LJII(new C1291190jhl(203, e.getMessage()));
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (c1298400jtO instanceof C1298960juI) {
            ClientEvent clientEvent2 = new ClientEvent();
            TouchEvent touchEvent = new TouchEvent();
            touchEvent.LIZ = c1298400jtO.LIZIZ;
            touchEvent.LIZIZ = c1298400jtO.LIZ;
            C1298950juH c1298950juH = ((C1298960juI) c1298400jtO).LIZJ;
            touchEvent.LIZJ = c1298950juH.LIZ;
            touchEvent.LIZLLL = c1298950juH.LIZIZ;
            touchEvent.LJ = System.currentTimeMillis();
            clientEvent2.LIZ = touchEvent;
            LIZ(clientEvent2, true);
        }
    }
}
