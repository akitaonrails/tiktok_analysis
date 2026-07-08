package com.ss.android.ugc.aweme.ui.util;

import X.C0SKE;
import X.C0SZ8;
import X.C1480430ocz;
import X.C1558360qeg;
import X.C1558520qew;
import X.C583620Mum;
import X.C586920N0g;
import X.C721260SQy;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.feed.controller.I18nPlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.viewmodel.PostModeTimeLoggerViewModel;
import com.ss.android.ugc.feed.platform.panel.MobRenderReadySkipVideoPlayAbility;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModeOnUIPlayListener extends I18nPlayerController {
    public final Aweme LLILLL;
    public final PostModeDetailParams LLILZ;
    public final PostModeTimeLoggerViewModel LLILZIL;

    @Override // com.ss.android.ugc.aweme.feed.controller.PlayerController
    public final void g(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.PlayerController, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        super.onPlayPause(str);
        PostModeTimeLoggerViewModel postModeTimeLoggerViewModel = this.LLILZIL;
        if (postModeTimeLoggerViewModel != null) {
            postModeTimeLoggerViewModel.xQ2(this.LLILLL, this.LLILZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.PlayerController, com.ss.android.ugc.aweme.feed.controller.BaseController
    public final void onAttach(Activity activity, Fragment fragment) throws Throwable {
        Lifecycle lifecycle;
        super.onAttach(activity, fragment);
        if (fragment != null && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ui.util.PostModeOnUIPlayListener.onAttach.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_RESUME) {
                        onResume();
                    } else if (event == Lifecycle.Event.ON_PAUSE) {
                        onPause();
                    } else if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    PostModeOnUIPlayListener.this.onDetach();
                    PostModeOnUIPlayListener.this.fragment = null;
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
                public final void onPause() {
                    PostModeOnUIPlayListener.this.onPause();
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                public final void onResume() {
                    PostModeOnUIPlayListener.this.onResume();
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.PlayerController, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
        PostModeTimeLoggerViewModel postModeTimeLoggerViewModel = this.LLILZIL;
        if (postModeTimeLoggerViewModel != null) {
            postModeTimeLoggerViewModel.yQ2();
        }
        if (!C0SKE.LIZ(this.LLILZ)) {
            C721260SQy c721260SQy = C721260SQy.LIZ;
            Aweme aweme = this.LLILLL;
            PostModeDetailParams postModeDetailParams = this.LLILZ;
            c721260SQy.getClass();
            C721260SQy.LIZ(aweme, postModeDetailParams);
        }
    }

    public PostModeOnUIPlayListener(Aweme aweme, PostModeDetailParams postModeDetailParams, PostModeTimeLoggerViewModel postModeTimeLoggerViewModel, String str, int i, PostModeMockBaseListFragmentPanel postModeMockBaseListFragmentPanel) {
        super(str, i, postModeMockBaseListFragmentPanel);
        this.LLILLL = aweme;
        this.LLILZ = postModeDetailParams;
        this.LLILZIL = postModeTimeLoggerViewModel;
        LJLLLLLL(new C586920N0g());
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.I18nPlayerController, com.ss.android.ugc.aweme.feed.controller.PlayerController
    public final void LLJJJJLIIL(C1480430ocz c1480430ocz, C0SZ8 c0sz8, String str, IBaseListFragmentPanel iBaseListFragmentPanel, Aweme aweme, JSONObject jSONObject) {
        Fragment fragment;
        MobRenderReadySkipVideoPlayAbility mobRenderReadySkipVideoPlayAbility;
        if (iBaseListFragmentPanel != null && (fragment = iBaseListFragmentPanel.getFragment()) != null && (mobRenderReadySkipVideoPlayAbility = (MobRenderReadySkipVideoPlayAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), MobRenderReadySkipVideoPlayAbility.class, null)) != null && mobRenderReadySkipVideoPlayAbility.kf0()) {
            return;
        }
        super.LLJJJJLIIL(c1480430ocz, c0sz8, str, iBaseListFragmentPanel, aweme, jSONObject);
    }
}
