package com.ss.android.ugc.aweme.lemon.postmode.service;

import X.C0I27;
import X.C0I28;
import X.C0VWN;
import X.C1220000hqw;
import X.C1355870lO5;
import X.C1385040m98;
import X.C13LE;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C19EG;
import X.C21146717pB;
import X.C338530DOx;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import android.content.Intent;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.lemon.postmode.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS105S1000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class PostModeServiceImpl implements IPostModeService {
    @Override // com.ss.android.ugc.aweme.lemon.postmode.service.IPostModeService
    public final boolean showEngagementCount() {
        return ComplianceServiceProvider.LJIIJJI().showEngagementCount();
    }

    @Override // com.ss.android.ugc.aweme.lemon.postmode.service.IPostModeService
    public final void LIZ(final C19EG c19eg, VideoItemParams videoItemParams, final PostModeDetailParams postModeDetailParams, String str, Fragment fragment, Function0 function0) {
        final C736950SvV c736950SvV;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(C786410Ut5.N3(c19eg), C1385040m98.LIZLLL(c19eg));
        C21146717pB.LIZJ(contextThemeWrapper, R.layout.dab);
        C21146717pB.LIZJ(contextThemeWrapper, R.layout.dai);
        C21146717pB.LIZJ(contextThemeWrapper, R.layout.daf);
        C21146717pB.LIZJ(contextThemeWrapper, R.layout.dad);
        C21146717pB.LIZJ(contextThemeWrapper, R.layout.da9);
        C0VWN.LIZ("lemon8_photomode_enter", false).start();
        SAFHelper.LIZ.getClass();
        LifecycleOwner lifecycleOwnerLJIJJ = SAFHelper.LJIJJ(fragment, c19eg);
        if (lifecycleOwnerLJIJJ != null) {
            AwS105S1000000_21 awS105S1000000_21 = new AwS105S1000000_21(str, 7);
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(PhotoSharedViewModel.class);
            AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(407);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(lifecycleOwnerLJIJJ);
            if (lifecycleOwnerLJIJJ instanceof HasDefaultViewModelProviderFactory) {
                hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) lifecycleOwnerLJIJJ;
            } else {
                hasDefaultViewModelProviderFactory = null;
            }
            c736950SvV = new C736950SvV(c19719912DlLIZ, awS105S1000000_21, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS259S0000000_21, null, null, null);
        } else {
            AwS105S1000000_21 awS105S1000000_212 = new AwS105S1000000_21(str, 8);
            c736950SvV = new C736950SvV(C13LE.LIZ(PhotoSharedViewModel.class), awS105S1000000_212, new C452070Ho5(), C724750Sbp.LJII(c19eg), C1220000hqw.LIZ(c19eg), AFwS259S0000000_21.get$arr$(408), new C0I27(c19eg), new C0I28(c19eg), new C338530DOx(c19eg));
        }
        PhotoSharedViewModel photoSharedViewModel = (PhotoSharedViewModel) c736950SvV.getValue();
        photoSharedViewModel.LLILLJJLI = videoItemParams.getAweme();
        photoSharedViewModel.LL = videoItemParams;
        photoSharedViewModel.LLILLL = postModeDetailParams;
        C1355870lO5 c1355870lO5 = new C1355870lO5();
        c1355870lO5.LIZ = System.currentTimeMillis();
        c1355870lO5.LIZ();
        photoSharedViewModel.LLILZ = c1355870lO5;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "aweme://lemon_post_detail");
        smartRouteBuildRoute.withParam("photo_shared_vm_unique_key", str);
        smartRouteBuildRoute.withBundleAnimation(postModeDetailParams.animationBundle);
        smartRouteBuildRoute.withCallback(new AbsOpenResultCallback() { // from class: X.0lOM
            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                HashMap map = new HashMap();
                String str2 = postModeDetailParams.eventType;
                if (str2 == null) {
                    str2 = "";
                }
                map.put("enter_type", str2);
                C583920MvG.LIZ("lemon8_photomode_enter", map);
            }
        });
        smartRouteBuildRoute.open(12345, new OnActivityResultCallback() { // from class: X.0lOL
            @Override // com.bytedance.router.OnActivityResultCallback
            public final void onActivityResult(int i, int i2, Intent intent) {
                if (i2 == 11010) {
                    c19eg.finish();
                    PhotoSharedViewModel value = c736950SvV.getValue();
                    value.LL = null;
                    value.LLILLJJLI = null;
                    return;
                }
                C583920MvG.LIZ("lemon8_photomode_exit", null);
                PhotoSharedViewModel value2 = c736950SvV.getValue();
                value2.LL = null;
                value2.LLILLJJLI = null;
            }
        });
    }
}
