package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class DropsPageSchemaData {
    public static final TypeAdapter ADAPTER;

    @C09CT("drops_audience_list")
    public String dropsAudienceList;

    @C09CT("drops_guide")
    public String dropsGuide;

    @C09CT("drops_host_list")
    public String dropsHostList;

    @C09CT("drops_host_task_panel")
    public String dropsHostTaskPanel;

    @C09CT("drops_setup")
    public String dropsSetup;

    @C09CT("drops_pin_card")
    public String pageDropsCard;

    static {
        NormalGson.singleton();
        ADAPTER = new DropsPageSchemaData_OptTypeAdapter();
    }

    public DropsPageSchemaData() {
        this("", "", "", "", "", "");
    }

    public DropsPageSchemaData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.dropsGuide = str;
        this.dropsAudienceList = str2;
        this.dropsHostList = str3;
        this.dropsHostTaskPanel = str4;
        this.dropsSetup = str5;
        this.pageDropsCard = str6;
    }
}
