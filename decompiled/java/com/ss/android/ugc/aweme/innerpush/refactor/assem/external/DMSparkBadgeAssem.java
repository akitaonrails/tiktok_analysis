package com.ss.android.ugc.aweme.innerpush.refactor.assem.external;

import X.C051M;
import X.C06LY;
import X.C098200Yq;
import X.C13LP;
import X.C13LQ;
import X.C189200o6;
import X.C19290510dT;
import X.EnumC1578206Fw;
import X.ViewOnClickListenerC1576306Fd;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.activestatus.api.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushContentAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class DMSparkBadgeAssem extends BaseInnerPushContentAssem {
    public final int LLJI = 7;

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushContentAssem
    public final int Go() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) throws Throwable {
        ViewGroup viewGroup;
        Object obj;
        String str;
        Object c098200Yq;
        String uid;
        List<User> list;
        User user;
        super.onViewCreated(view);
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            IStreakService.LJJIIZ.getClass();
            ViewOnClickListenerC1576306Fd viewOnClickListenerC1576306FdV = C06LY.LIZ().V(view.getContext(), EnumC1578206Fw.NOTICE_IN_APP_PUSH, new AwS581S0100000_2(viewGroup, 251));
            C19290510dT.LIZLLL("DMSparkBadgeAssem", "[onViewCreated]");
            Map<String, Object> extrasMap = Ho().getExtrasMap();
            if (extrasMap != null) {
                obj = extrasMap.get("conversation_id");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (str != null && str.length() > 0) {
                if (viewOnClickListenerC1576306FdV != null) {
                    viewOnClickListenerC1576306FdV.LIZLLL(1, str, null, true);
                    return;
                }
                return;
            }
            if (C13LQ.LJJIJIIJI(Integer.valueOf(Ho().getType()), new Integer[]{31, 27}) >= 0) {
                try {
                    c098200Yq = (ActivityStatus) C051M.LIZIZ(ActivityStatus.class, Ho().getBizExtraJsonStr());
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                ActivityStatus activityStatus = (ActivityStatus) c098200Yq;
                if (activityStatus == null || (uid = activityStatus.userID) == null) {
                    return;
                }
            } else {
                InnerPushUITemplate uiTemplate = Ho().getUiTemplate();
                if (uiTemplate == null || (list = uiTemplate.fromUsers) == null || (user = (User) C13LP.LJJJLZIJ(0, list)) == null || (uid = user.getUid()) == null || uid.length() <= 0) {
                    return;
                }
            }
            if (viewOnClickListenerC1576306FdV != null) {
                viewOnClickListenerC1576306FdV.LIZIZ(1, uid, null, true);
            }
        }
    }
}
