package com.ss.android.ugc.aweme.longpress;

import X.C01GW;
import X.C09CT;
import X.C1379100lzY;
import X.C452501pT;
import X.InterfaceC1380660m24;
import java.util.Map;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class LPPProtocol {
    public final transient C01GW LIZ;

    @C09CT("component_map")
    public Map<String, LongPressComponent> componentMap;

    @C09CT("container_map")
    public Map<String, C1379100lzY> containerMap;

    @C09CT("press_panel_config")
    public LongPressPanelConfig longPressPanelConfig;

    @C09CT("scenes")
    public Map<String, ? extends Map<String, LongPressStructure>> originScenes;

    @C09CT("root_key")
    public String rootKey;

    @C09CT("share_panel_config")
    public SharePanelConfig sharePanelConfig;

    public LPPProtocol() {
        this(null, null, null, null, null, null);
    }

    public final InterfaceC1380660m24 LIZ(String str) {
        C1379100lzY c1379100lzY;
        LongPressComponent longPressComponent;
        Map<String, LongPressComponent> map = this.componentMap;
        if (map != null && (longPressComponent = map.get(str)) != null) {
            return longPressComponent;
        }
        Map<String, C1379100lzY> map2 = this.containerMap;
        if (map2 != null && (c1379100lzY = map2.get(str)) != null) {
            return c1379100lzY;
        }
        return new C1379100lzY(null, 3);
    }

    public LPPProtocol(Map<String, LongPressComponent> map, Map<String, C1379100lzY> map2, Map<String, ? extends Map<String, LongPressStructure>> map3, String str, SharePanelConfig sharePanelConfig, LongPressPanelConfig longPressPanelConfig) {
        this.componentMap = map;
        this.containerMap = map2;
        this.originScenes = map3;
        this.rootKey = str;
        this.sharePanelConfig = sharePanelConfig;
        this.longPressPanelConfig = longPressPanelConfig;
        this.LIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 689));
    }
}
