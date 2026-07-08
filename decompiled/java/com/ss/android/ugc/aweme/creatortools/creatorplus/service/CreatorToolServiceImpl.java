package com.ss.android.ugc.aweme.creatortools.creatorplus.service;

import X.AbstractC1549150qPp;
import X.C099R;
import X.C142B;
import X.C1506700pJM;
import X.C1697810uHb;
import X.C2511909sr;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorRedDotApi;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.ICreatorToolService;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public class CreatorToolServiceImpl implements ICreatorToolService {
    @Override // com.ss.android.ugc.aweme.setting.services.ICreatorToolService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        return C1697810uHb.LJIIJJI(C1506700pJM.class, C142B.class);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICreatorToolService
    public final Object LIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        int followerCount;
        User currentUser;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            followerCount = currentUser.getFollowerCount();
        } else {
            followerCount = 0;
        }
        if (followerCount >= C2511909sr.LIZ) {
            Object objClearCreatorRedDot = CreatorRedDotApi.LIZ.getValue().clearCreatorRedDot("bottom_sheet_red_dot", interfaceC1364105Vn);
            if (objClearCreatorRedDot != C099R.LJFF()) {
                objClearCreatorRedDot = Unit.LIZ;
            }
            if (objClearCreatorRedDot != C099R.LJFF()) {
                return Unit.LIZ;
            }
            return objClearCreatorRedDot;
        }
        return Unit.LIZ;
    }
}
