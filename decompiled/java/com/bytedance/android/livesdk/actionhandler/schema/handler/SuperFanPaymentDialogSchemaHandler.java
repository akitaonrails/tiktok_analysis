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
public final class SuperFanPaymentDialogSchemaHandler extends AbstractC2436909gl<SchemaModel> {
    public final List<String> LIZIZ = Collections.singletonList("webcast_super_fan_payment");

    public static final class SchemaModel extends C2436109gd {

        @C09CT("encourage_style")
        public int encourageStyle;

        @C09CT("enter_from")
        public String enterFrom = "";

        @C09CT("fans_club_main_page_is_open")
        public int fansClubMainPageIsOpen;
    }

    @Override // X.AbstractC2436909gl
    public final List<String> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC2437009gm
    public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map map) {
        boolean z;
        SchemaModel schemaModel = (SchemaModel) c2436109gd;
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        String str = schemaModel.enterFrom;
        if (schemaModel.fansClubMainPageIsOpen == 1) {
            z = true;
        } else {
            z = false;
        }
        iFansClubService.i31(str, z);
        return true;
    }
}
