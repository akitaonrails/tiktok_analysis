package com.tiktok.strategycenterengine.manager;

import X.AbstractC830880Wic;
import X.C2213641BkQ;
import X.C830930Wih;
import X.InterfaceC805220ViK;
import X.InterfaceC829710Wgj;
import X.InterfaceC829930Wh5;
import X.InterfaceC830810WiV;
import X.InterfaceC830890Wid;
import X.InterfaceC830900Wie;
import com.tiktok.ttm.TTMParamData;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public interface ITTMStrategyCenterManager {
    void LIZ(InterfaceC830890Wid interfaceC830890Wid);

    Map<String, InterfaceC805220ViK> LIZIZ(InterfaceC830890Wid interfaceC830890Wid, TTMParamData tTMParamData);

    InterfaceC830900Wie LIZJ(InterfaceC830890Wid interfaceC830890Wid, String str);

    InterfaceC830890Wid LIZLLL(String str);

    void LJ(InterfaceC829930Wh5 interfaceC829930Wh5);

    boolean LJFF(String str, ITTMParamData iTTMParamData);

    void LJI(InterfaceC830890Wid interfaceC830890Wid);

    C2213641BkQ LJII(InterfaceC830890Wid interfaceC830890Wid, String str, TTMParamData tTMParamData);

    boolean LJIIIIZZ();

    void LJIIIZ();

    int LJIIJ(Object obj);

    void LJIIJJI(InterfaceC830810WiV interfaceC830810WiV, InterfaceC829710Wgj interfaceC829710Wgj);

    List<InterfaceC830900Wie> LJIIL(InterfaceC830890Wid interfaceC830890Wid);

    void LJIILIIL(String str, List<? extends InterfaceC830810WiV> list, C830930Wih c830930Wih, AbstractC830880Wic abstractC830880Wic);

    void LJIILJJIL(InterfaceC829930Wh5 interfaceC829930Wh5);

    boolean LJIILL(String str, JSONObject jSONObject, ExecutorService executorService);

    void LJIILLIIL(InterfaceC830890Wid interfaceC830890Wid);

    void LJIIZILJ(InterfaceC830890Wid interfaceC830890Wid, String str);

    void LJIJ();

    void LJIJI(InterfaceC830890Wid interfaceC830890Wid);

    int LJIJJ(JSONObject jSONObject);

    void LJIJJLI(InterfaceC830890Wid interfaceC830890Wid, String str);
}
