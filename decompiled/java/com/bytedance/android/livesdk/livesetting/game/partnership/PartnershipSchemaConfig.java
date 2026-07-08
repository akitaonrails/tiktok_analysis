package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class PartnershipSchemaConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("roma_schema_page_current_promote")
    public String currentPromote;

    @C09CT("roma_schema_page_current_promote_v2")
    public String currentPromoteV2;

    @C09CT("roma_schema_page_event_qualification")
    public String eventQualification;

    @C09CT("roma_schema_page_drop_list")
    public String pageDropList;

    @C09CT("roma_schema_page_intro_card")
    public String pageIntroCard;

    @C09CT("roma_schema_page_promote_center_v2")
    public String pagePromoteCenterV2;

    @C09CT("roma_schema_page_promote_center")
    public String promoteCenter;

    @C09CT("roma_schema_page_promote_introduction")
    public String promoteIntroduction;

    @C09CT("roma_schema_page_promote_list")
    public String promoteList;

    @C09CT("roma_schema_page_user_game_detail_v2")
    public String userGameDetail;

    @C09CT("roma_schema_page_user_game_detail")
    public String userGameDetailLandscape;

    static {
        NormalGson.singleton();
        ADAPTER = new PartnershipSchemaConfig_OptTypeAdapter();
    }

    public PartnershipSchemaConfig() {
        this("", "", "", "", "", "", "", "", "", "", "");
    }

    public PartnershipSchemaConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.pageIntroCard = str;
        this.promoteList = str2;
        this.promoteIntroduction = str3;
        this.promoteCenter = str4;
        this.currentPromote = str5;
        this.eventQualification = str6;
        this.pageDropList = str7;
        this.userGameDetailLandscape = str8;
        this.userGameDetail = str9;
        this.pagePromoteCenterV2 = str10;
        this.currentPromoteV2 = str11;
    }
}
