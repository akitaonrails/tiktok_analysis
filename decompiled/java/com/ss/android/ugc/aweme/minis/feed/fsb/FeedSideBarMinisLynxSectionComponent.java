package com.ss.android.ugc.aweme.minis.feed.fsb;

import X.C01GW;
import X.C1543490qGh;
import X.C1617270sBh;
import X.C20684815ws;
import X.C2097608Jq;
import X.C452501pT;
import X.InterfaceC1580560rEU;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponent;
import com.ss.android.ugc.aweme.sidebar.model.SideBarSectionComponentConfig;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSideBarMinisLynxSectionComponent extends SideBarSectionComponent {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJJJ;
    public FeedSideBarMinisCustomData LLJJJJJIL;
    public SideBarSectionComponentConfig LLJJJJLIIL;
    public long LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 776));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 777));
    public final AwS568S0100000_24 LLJLIL = new AwS568S0100000_24(this, 778);

    public final JSONObject Fp() {
        Gson gson = new Gson();
        FeedSideBarMinisCustomData feedSideBarMinisCustomData = this.LLJJJJJIL;
        if (feedSideBarMinisCustomData == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        List<Map<String, Object>> list = feedSideBarMinisCustomData.minisList;
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (Map<String, Object> map : list) {
                if (map != null) {
                    jSONArray.put(new JSONObject(map));
                }
            }
        }
        jSONObject.put("minis_list", jSONArray);
        jSONObject.put("lynx_params", new JSONObject(GsonProtectorUtils.toJson(gson, feedSideBarMinisCustomData.lynxParams)));
        jSONObject.put("header_padding", 24);
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("component_field", "tiktok_minis"), new Pair(Scene.SCENE_SERVICE, "tiktok_minis_icon"));
        Object objLp = lp("enter_from");
        if (objLp == null) {
            objLp = "";
        }
        mapLJIIJ.put("enter_from", objLp);
        Object objLp2 = lp("enter_method");
        if (objLp2 == null) {
            objLp2 = "";
        }
        mapLJIIJ.put("enter_method", objLp2);
        Object objLp3 = lp("entrance_id");
        mapLJIIJ.put("entrance_id", objLp3 != null ? objLp3 : "");
        jSONObject.put("sidebar_et_params", new JSONObject(GsonProtectorUtils.toJson(gson, mapLJIIJ)));
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Function0<String> function0 = C1617270sBh.LLILLL;
        C1617270sBh.LLILLL = null;
    }

    public final void Ep(boolean z) throws JSONException {
        Object id;
        if (this.LLJJL <= 0) {
            return;
        }
        JSONObject jSONObjectPut = new JSONObject().put("duration", System.currentTimeMillis() - this.LLJJL);
        SideBarSectionComponentConfig sideBarSectionComponentConfigLp = lp("parent_config");
        if (sideBarSectionComponentConfigLp != null) {
            id = sideBarSectionComponentConfigLp.getId();
        } else {
            id = null;
        }
        C20684815ws.LJIJ("sidebar_card_load_time", jSONObjectPut.put("component_field", id).put("result", !z ? 1 : 0).put("is_first_feed_show", lp("is_first_feed_show")).put("is_coldlaunch", lp("is_coldlaunch")));
        this.LLJJL = 0L;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponent, com.ss.android.ugc.aweme.sidebar.components.SideBarComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1543490qGh.LIZIZ(C1617270sBh.class, null, 6);
        Function0<String> function0 = C1617270sBh.LLILLL;
        C1617270sBh.LLILLL = (Function0) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponent
    /* JADX INFO: renamed from: Bp */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp(android.view.View r18, com.ss.android.ugc.aweme.sidebar.model.SideBarSectionComponentConfig r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.feed.fsb.FeedSideBarMinisLynxSectionComponent.tp(android.view.View, com.ss.android.ugc.aweme.sidebar.model.SideBarSectionComponentConfig):void");
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponent, com.ss.android.ugc.aweme.sidebar.components.SideBarComponent
    public final /* bridge */ /* synthetic */ void tp(View view, InterfaceC1580560rEU interfaceC1580560rEU) {
        tp(view, (SideBarSectionComponentConfig) interfaceC1580560rEU);
    }
}
