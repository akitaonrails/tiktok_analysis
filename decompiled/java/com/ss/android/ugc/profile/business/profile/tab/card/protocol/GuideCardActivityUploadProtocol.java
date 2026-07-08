package com.ss.android.ugc.profile.business.profile.tab.card.protocol;

import X.C1251870igL;
import X.C1252570ihT;
import X.C1398110mUD;
import X.C16H3;
import X.C20684815ws;
import X.C2344009Gk;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CollectMusicModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import com.ss.android.ugc.aweme.creative.model.ProfileParametersModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.UserProfileGuideDataV2;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.util.UUID;

/* JADX INFO: loaded from: classes32.dex */
public final class GuideCardActivityUploadProtocol extends GuideCardBaseProtocol {
    @Override // com.ss.android.ugc.profile.business.profile.tab.card.protocol.GuideCardBaseProtocol
    public final String getName() {
        return "activity_upload";
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.card.protocol.GuideCardBaseProtocol
    public final void LIZ(C1251870igL c1251870igL) {
        Long deliverId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("current_page", "profile_page");
        UserProfileGuideDataV2 userProfileGuideDataV2 = c1251870igL.LL;
        if (userProfileGuideDataV2 != null) {
            deliverId = userProfileGuideDataV2.getDeliverId();
        } else {
            deliverId = null;
        }
        c2344009Gk.LJ(deliverId, "activity_id");
        C20684815ws.LJIILLIIL("dual_creator_post_activity_profile_info_show", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.card.protocol.GuideCardBaseProtocol
    public final boolean LIZJ(C1251870igL c1251870igL) {
        Long deliverId;
        Context context = this.LLILLJJLI;
        if (context == null) {
            return true;
        }
        String string = UUID.randomUUID().toString();
        C1252570ihT.LIZ.getClass();
        C1252570ihT.LIZIZ(string, "");
        UserProfileGuideDataV2 userProfileGuideDataV2 = c1251870igL.LL;
        if (userProfileGuideDataV2 != null) {
            deliverId = userProfileGuideDataV2.getDeliverId();
        } else {
            deliverId = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("current_page", "profile_page");
        c2344009Gk.LJ(deliverId, "activity_id");
        C20684815ws.LJIILLIIL("dual_creator_post_activity_profile_info_click", c2344009Gk.LIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(string);
        builder.shootWay("upload_anchor");
        builder.groupId(C1398110mUD.LIZIZ);
        builder.enterFrom("personal_homepage");
        builder.fromMain(true);
        builder.startRecordTime(jCurrentTimeMillis);
        builder.musicType(1);
        builder.translationType(3);
        builder.enterMethod("click_create_video");
        builder.shootExtraData(new ShootExtraData("personal_homepage", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214, null));
        builder.initialInputModel(new CreativeInitialModel(new ProfileParametersModel(""), new DMCameraModel(false, null, "", false, false, false, "", null, -1, false, 0, "", -1, "", "", false, false, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, true, false, "", null, null, 0L, false, null, null, null, null), null, null, null, null, null, null, new HighLightVideoParametersModel(null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, false, false, 2097151, null), null, null, null, null, null, null, null, null, null, null, null, null, new CollectMusicModel(null, false, false, false, false, null)));
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(context, "upload_anchor", new C16H3(context, builder, 0));
        return false;
    }
}
