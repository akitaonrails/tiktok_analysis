package com.ss.android.ugc.profile.business.profile.tab.card.protocol;

import X.C1251870igL;
import X.C1252570ihT;
import X.C1398110mUD;
import X.C16H3;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.CollectMusicModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import com.ss.android.ugc.aweme.creative.model.ProfileParametersModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.util.UUID;

/* JADX INFO: loaded from: classes32.dex */
public final class GuideCardUploadProtocol extends GuideCardBaseProtocol {
    @Override // com.ss.android.ugc.profile.business.profile.tab.card.protocol.GuideCardBaseProtocol
    public final String getName() {
        return "upload";
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.card.protocol.GuideCardBaseProtocol
    public final boolean LIZJ(C1251870igL c1251870igL) {
        Context context;
        View view = this.LL;
        if (view != null && (context = view.getContext()) != null) {
            String string = UUID.randomUUID().toString();
            C1252570ihT.LIZ.getClass();
            C1252570ihT.LIZIZ(string, null);
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
            builder.enterMethod("profile_empty_guide");
            builder.shootExtraData(new ShootExtraData("personal_homepage", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214, null));
            builder.shouldSupportPrivateAlbum(true);
            builder.initialInputModel(new CreativeInitialModel(new ProfileParametersModel(""), new DMCameraModel(false, null, "", false, false, false, "", null, -1, false, 0, "", -1, "", "", false, false, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, true, false, "", null, null, 0L, false, null, null, null, null), null, null, null, null, null, null, new HighLightVideoParametersModel(null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, false, false, 2097151, null), null, null, null, null, null, null, null, null, null, null, null, null, new CollectMusicModel(null, false, false, false, false, null)));
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(context, "upload_anchor", new C16H3(context, builder, 1));
            return true;
        }
        return false;
    }
}
