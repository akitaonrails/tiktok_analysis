package com.bytedance.android.livesdk.actionhandler.schema.handler;

import X.AbstractC2436909gl;
import X.C09CT;
import X.C1161920gLG;
import X.C2436109gd;
import android.content.Context;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class SuperFanTreasureBoxSchemaHandler extends AbstractC2436909gl<SchemaModel> {
    public final List<String> LIZIZ = Collections.singletonList("webcast_super_fan_box_send_panel");

    public static final class SchemaModel extends C2436109gd {

        @C09CT("entrance")
        public String enterFrom = "";

        @C09CT("guide_from")
        public String guideFrom = "normal";
    }

    @Override // X.AbstractC2436909gl
    public final List<String> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC2437009gm
    public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map map) {
        SchemaModel schemaModel = (SchemaModel) c2436109gd;
        ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).n52(schemaModel.enterFrom, schemaModel.guideFrom);
        return true;
    }
}
