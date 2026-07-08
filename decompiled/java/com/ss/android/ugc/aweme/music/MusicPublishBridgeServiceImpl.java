package com.ss.android.ugc.aweme.music;

import X.C0PEM;
import X.C1407000miY;
import X.C1421030n5B;
import X.C201955140j;
import X.C201962140q;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C290510Ba5;
import X.InterfaceC2385309Wh;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class MusicPublishBridgeServiceImpl implements IMusicPublishBridgeService {
    public boolean LIZ;
    public boolean LIZIZ;

    public static boolean LIZ() {
        User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        return currentUser != null && currentUser.getAccountType() == 3;
    }

    @Override // com.ss.android.ugc.aweme.services.IMusicPublishBridgeService
    public final boolean enableBAUserMusicExperienceOpt() {
        boolean z;
        if (!C290510Ba5.LIZ() || !LIZ()) {
            return false;
        }
        if (this.LIZIZ) {
            C201962140q c201962140q = C201962140q.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestBusinessAccountType -> hasRequestBAType = ");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(", use this request result");
            C201955140j.LIZJ(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
            z = this.LIZ;
        } else {
            C201962140q c201962140q2 = C201962140q.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("requestBusinessAccountType -> hasRequestBAType = ");
            sbLIZ2.append(this.LIZIZ);
            sbLIZ2.append(", use last request result");
            C201955140j.LIZJ(c201962140q2, C2188811AlT.LIZIZ(sbLIZ2));
            C1421030n5B c1421030n5B = new C1421030n5B();
            String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
            z = currentUserID != null ? c1421030n5B.LIZ.getBoolean(currentUserID, false) : false;
        }
        return C290510Ba5.LIZ() && LIZ() && z;
    }

    @Override // com.ss.android.ugc.aweme.services.IMusicPublishBridgeService
    public final void requestBusinessAccountType(final String str) {
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestBusinessAccountType -> scene = ");
        sbLIZ.append(str);
        sbLIZ.append((char) 65307);
        C201955140j.LIZJ(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        if (C290510Ba5.LIZ() && LIZ()) {
            ChooseMusicApi.LIZ.LJIILLIIL(Boolean.FALSE, Boolean.TRUE).LIZLLL(new InterfaceC2385309Wh() { // from class: X.0n5A
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    C1C7U.LIZ("MusicPublishBridgeServiceImpl@4024.requestBusinessAccountType$1");
                    this.LIZ.LIZIZ = true;
                    if (c15o7.LJIILJJIL()) {
                        C201962140q c201962140q2 = C201962140q.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("requestBusinessAccountType -> scene = ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", completed, ");
                        sbLIZ2.append((String) c15o7.LJIIL());
                        C201955140j.LIZJ(c201962140q2, C2188811AlT.LIZIZ(sbLIZ2));
                        JSONObject jSONObject = new JSONObject((String) c15o7.LJIIL());
                        this.LIZ.LIZ = JSONObjectProtectorUtils.getBoolean(jSONObject, "is_target_ba_user");
                        C1421030n5B c1421030n5B = new C1421030n5B();
                        boolean z = this.LIZ.LIZ;
                        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
                        if (currentUserID != null) {
                            c1421030n5B.LIZ.storeBoolean(currentUserID, z);
                        }
                    } else {
                        C201955140j.LIZJ(C201962140q.LIZIZ, "requestBusinessAccountType -> others");
                        this.LIZ.LIZ = false;
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MusicPublishBridgeServiceImpl@4024.requestBusinessAccountType$1");
                    return unit;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IMusicPublishBridgeService
    public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
        if (publishModel == null) {
            return;
        }
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel)) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1407000miY(baseShortVideoContext, null), 3);
    }
}
