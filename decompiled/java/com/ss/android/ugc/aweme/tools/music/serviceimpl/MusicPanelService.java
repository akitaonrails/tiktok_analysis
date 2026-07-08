package com.ss.android.ugc.aweme.tools.music.serviceimpl;

import X.C12DO;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C13BV;
import X.C204604154g;
import X.C204605154h;
import X.C204608154k;
import X.C204615154r;
import X.C204618154u;
import X.C290510Ba5;
import X.C297110Bkj;
import X.C960203pA;
import X.EnumC1654750tA9;
import X.InterfaceC204626155c;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMusicPanelService;
import com.ss.android.ugc.aweme.services.InitMusicTabViewsData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicPanelService implements IMusicPanelService {
    public static boolean LIZ(InitMusicTabViewsData initMusicTabViewsData) {
        User currentUser;
        if (initMusicTabViewsData.isFromPromoteCopyright()) {
            return false;
        }
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null && currentUser.getAccountType() == 3 && !C290510Ba5.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.IMusicPanelService
    public final List<InterfaceC204626155c> createDefaultMusicTabViews(InitMusicTabViewsData initMusicTabViewsData) {
        InterfaceC204626155c c204605154h;
        C1361400lX0 c1361400lX0 = new C1361400lX0(initMusicTabViewsData.getContext(), getPanelTheme(initMusicTabViewsData.getContext(), initMusicTabViewsData.getInEditorPro()));
        ArrayList arrayList = new ArrayList();
        C204618154u c204618154u = new C204618154u(c1361400lX0);
        if (initMusicTabViewsData.isReplaceMultiMusic()) {
            arrayList.add(c204618154u);
            return arrayList;
        }
        if (C297110Bkj.LIZ() && LIZ(initMusicTabViewsData)) {
            arrayList.add(new C204615154r(c1361400lX0));
        }
        arrayList.add(c204618154u);
        if (initMusicTabViewsData.getEnableNewCollectTab()) {
            c204605154h = new C204604154g(c1361400lX0);
        } else {
            c204605154h = new C204605154h(c1361400lX0);
        }
        arrayList.add(c204605154h);
        if (LIZ(initMusicTabViewsData)) {
            arrayList.add(new C204608154k(c1361400lX0));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.IMusicPanelService
    public final int getDefaultLandingPos(InitMusicTabViewsData initMusicTabViewsData) {
        if (!initMusicTabViewsData.isReplaceMultiMusic() && C297110Bkj.LIZ()) {
            return 1;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.services.IMusicPanelService
    public final List<EnumC1654750tA9> getHiddenTabs(Function0<? extends IMusicRequestParam> function0) {
        if (C297110Bkj.LIZ() && function0.invoke().getUnlimitedOnly()) {
            return Collections.singletonList(EnumC1654750tA9.TAB_HOT);
        }
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.services.IMusicPanelService
    public final int getPanelBackground(Activity activity) {
        int i;
        if (C12DO.LIZ()) {
            i = R.attr.a1b;
        } else {
            i = R.attr.bn;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, activity);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.services.IMusicPanelService
    public final int getPanelTheme(Context context, boolean z) {
        if (C12DO.LIZ() && !z) {
            if (C960203pA.LIZIZ(context)) {
                return R.style.y0;
            }
            return R.style.xm;
        }
        return R.style.xz;
    }
}
