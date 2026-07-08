package com.tiktok.myna.render.render.elements;

import X.C01GW;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1168400gVi;
import X.C1325860kbg;
import X.C2097608Jq;
import X.C452501pT;
import X.InterfaceC21329918dd;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.tiktok.myna.render.render.MynaElement;
import com.tiktok.myna.render.render.MynaTemplateProtocol;
import com.tiktok.myna.render.render.MynaTemplateProtocolConfig;
import java.util.Map;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class MynaTemplateTypeAdapter extends TypeAdapter<InterfaceC21329918dd> {
    public final Gson LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 439));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 438));

    public MynaTemplateTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final InterfaceC21329918dd read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            c09cu.LJJJJJL();
            return null;
        }
        c09cu.LIZIZ();
        MynaElement mynaElement = null;
        MynaTemplateProtocolConfig mynaTemplateProtocolConfig = null;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1354792126:
                        if (strLJJJJ.equals("config")) {
                            mynaTemplateProtocolConfig = (MynaTemplateProtocolConfig) GsonProtectorUtils.fromJson(this.LIZ, c09cu, MynaTemplateProtocolConfig.class);
                        }
                        break;
                    case -1349088399:
                        if (strLJJJJ.equals("custom")) {
                            map = (Map) ((TypeAdapter) this.LIZJ.getValue()).read(c09cu);
                        }
                        break;
                    case 3732:
                        if (strLJJJJ.equals("ui")) {
                            mynaElement = (MynaElement) ((TypeAdapter) this.LIZIZ.getValue()).read(c09cu);
                        }
                        break;
                    case 3176990:
                        if (strLJJJJ.equals("i18n")) {
                            map3 = (Map) ((TypeAdapter) this.LIZJ.getValue()).read(c09cu);
                        }
                        break;
                    case 1070413819:
                        if (strLJJJJ.equals("action_chains")) {
                            map2 = (Map) ((TypeAdapter) this.LIZJ.getValue()).read(c09cu);
                        }
                        break;
                }
            }
            c09cu.LJJZ();
            C1168400gVi.LIZIZ(new AwS53S1000000_2(strLJJJJ, 27));
        }
        c09cu.LJII();
        if (mynaElement == null) {
            C1325860kbg.LIZIZ(null, AFwS223S0000000_32.get$arr$(252), C2097608Jq.LJ());
            return new MynaTemplateProtocol(new MynaElement("", null, null, null, null, null, null, null, null, null, null), null, null, null, null);
        }
        return new MynaTemplateProtocol(mynaElement, mynaTemplateProtocolConfig, map, map2, map3);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, InterfaceC21329918dd interfaceC21329918dd) {
        MynaTemplateProtocol mynaTemplateProtocol;
        Class<MynaTemplateProtocolConfig> cls;
        Class<?> cls2;
        Class<?> cls3;
        InterfaceC21329918dd interfaceC21329918dd2 = interfaceC21329918dd;
        Class<?> cls4 = null;
        if ((interfaceC21329918dd2 instanceof MynaTemplateProtocol) && (mynaTemplateProtocol = (MynaTemplateProtocol) interfaceC21329918dd2) != null) {
            c09dl.LIZLLL();
            c09dl.LJIILLIIL("ui");
            ((TypeAdapter) this.LIZIZ.getValue()).write(c09dl, mynaTemplateProtocol.getUiInfo());
            c09dl.LJIILLIIL("config");
            Gson gson = this.LIZ;
            MynaTemplateProtocolConfig config = mynaTemplateProtocol.getConfig();
            if (mynaTemplateProtocol.getConfig() != null) {
                cls = MynaTemplateProtocolConfig.class;
            } else {
                cls = null;
            }
            GsonProtectorUtils.toJson(gson, config, cls, c09dl);
            c09dl.LJIILLIIL("custom");
            Gson gson2 = this.LIZ;
            Map<String, Object> customInfo = mynaTemplateProtocol.getCustomInfo();
            Map<String, Object> customInfo2 = mynaTemplateProtocol.getCustomInfo();
            if (customInfo2 != null) {
                cls2 = customInfo2.getClass();
            } else {
                cls2 = null;
            }
            GsonProtectorUtils.toJson(gson2, customInfo, cls2, c09dl);
            c09dl.LJIILLIIL("action_chains");
            Gson gson3 = this.LIZ;
            Map<String, Object> actionChains = mynaTemplateProtocol.getActionChains();
            Map<String, Object> actionChains2 = mynaTemplateProtocol.getActionChains();
            if (actionChains2 != null) {
                cls3 = actionChains2.getClass();
            } else {
                cls3 = null;
            }
            GsonProtectorUtils.toJson(gson3, actionChains, cls3, c09dl);
            c09dl.LJIILLIIL("i18n");
            Gson gson4 = this.LIZ;
            Map<String, Object> i18n = mynaTemplateProtocol.getI18n();
            Map<String, Object> i18n2 = mynaTemplateProtocol.getI18n();
            if (i18n2 != null) {
                cls4 = i18n2.getClass();
            }
            GsonProtectorUtils.toJson(gson4, i18n, cls4, c09dl);
            c09dl.LJII();
            return;
        }
        c09dl.LJIJJ();
    }
}
