package com.ss.android.ugc.aweme.live;

import X.C0IGR;
import X.C0JSE;
import X.C0N0R;
import X.C0N0S;
import X.C1697810uHb;
import X.C16FS;
import X.C1752030vh3;
import X.C1765720w38;
import X.C1765730w39;
import X.C197039127h;
import X.C19736512Jv;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.AAListenerS337S0100000_27;
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS123S0100000_23;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.WelcomeVideoLengthSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.WelcomeVideoUrlSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.WelcomeVideoPlayerDialogFragment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class WelcomeVideoPlayerDialogFragment extends LiveDialogFragment implements C0IGR {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9HyHELIOSAgKiA+LRMlLSo8GCktMCohDCwtJSA0DjctLiI2JjE=";
    public C1765720w38 LL;
    public FrameLayout LLILLJJLI;
    public C197039127h LLILLL;
    public ImageView LLILZ;
    public C16FS LLILZIL;
    public C0N0S LLIZLLLIL;
    public C1765720w38 LLJ;
    public C1765730w39 LLJI;
    public ConstraintLayout LLJIJIL;
    public int LLJILJIL;
    public C19736512Jv LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final String LLILZLL = WelcomeVideoUrlSetting.INSTANCE.getValue();
    public final int LLIZ = WelcomeVideoLengthSetting.INSTANCE.getValue();
    public final WelcomeVideoPlayerDialogFragment$observer$1 LLJJI = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.live.WelcomeVideoPlayerDialogFragment$observer$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_RESUME) {
                onResume();
                return;
            }
            if (event == Lifecycle.Event.ON_PAUSE) {
                onPause();
            } else if (event == Lifecycle.Event.ON_STOP) {
                onStop();
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            C1765720w38 c1765720w38 = this.LL.LLJ;
            if (c1765720w38 != null) {
                c1765720w38.LIZ(true);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            C1765720w38 c1765720w38 = this.LL.LLJ;
            if (c1765720w38 != null) {
                HandlerHook.viewPost(c1765720w38, new ARunnableS123S0100000_23(c1765720w38, 28));
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onStop() {
            C1765720w38 c1765720w38 = this.LL.LLJ;
            if (c1765720w38 != null) {
                c1765720w38.LJFF();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPause() {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w4().setCurrentPlayerMute(false);
            C1765720w38 c1765720w38 = this.LL.LLJ;
            if (c1765720w38 != null) {
                c1765720w38.LIZJ();
            }
        }
    };

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LLIZLLLIL = null;
        C1765720w38 c1765720w38 = this.LLJ;
        if (c1765720w38 != null) {
            c1765720w38.LIZ(true);
        }
        this.LLJ = null;
        super.onDestroy();
        getLifecycle().removeObserver(this.LLJJI);
    }

    public final ImageView MR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.j2o) : null;
            this.LLILZ = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final C197039127h NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vfw) : null;
            this.LLILLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.djl);
        c500980Jkm.LIZIZ = 1;
        c500980Jkm.LJII = 80;
        c500980Jkm.LIZJ = R.style.ahw;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        dismissAllowingStateLoss();
        return super.onBackPressed();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().addObserver(this.LLJJI);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1765730w39 c1765730w39;
        ConstraintLayout constraintLayout;
        ImageView imageView;
        Window window;
        C19736512Jv c19736512Jv;
        super.onViewCreated(view, bundle);
        this.LLJ = (C1765720w38) view.findViewById(R.id.welcome_tux_player_view);
        this.LLJILJIL = getArguments().getInt("position");
        this.LLJILLL = getArguments().getBoolean("isMute");
        this.LLJJ = getArguments().getBoolean("isPause");
        View viewFindViewById = this.LL;
        C19736512Jv c19736512Jv2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.welcome_tux_player_view);
            } else {
                viewFindViewById = null;
            }
            this.LL = (C1765720w38) viewFindViewById;
        }
        C0N0S c0n0s = new C0N0S((C1765720w38) viewFindViewById);
        Video video = new Video();
        video.setVideoLength(this.LLIZ);
        LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
        localVideoUrlModel.setSourceId(this.LLILZLL);
        localVideoUrlModel.setUrlList(C1697810uHb.LJIILJJIL(this.LLILZLL));
        localVideoUrlModel.setUrlKey(this.LLILZLL);
        video.setPlayAddr(localVideoUrlModel);
        c0n0s.LJFF = video;
        c0n0s.LJIIZILJ = new C0N0R() { // from class: X.0y6H
            @Override // X.C0N0R
            public final void onComplete() {
                C0N0S c0n0s2 = this.LIZ.LLIZLLLIL;
                if (c0n0s2 != null) {
                    c0n0s2.release();
                }
                WelcomeVideoPlayerDialogFragment welcomeVideoPlayerDialogFragment = this.LIZ;
                View viewFindViewById2 = welcomeVideoPlayerDialogFragment.LLILLJJLI;
                if (viewFindViewById2 == null) {
                    View view3 = welcomeVideoPlayerDialogFragment.getView();
                    viewFindViewById2 = view3 != null ? view3.findViewById(R.id.qt9) : null;
                    welcomeVideoPlayerDialogFragment.LLILLJJLI = (FrameLayout) viewFindViewById2;
                }
                viewFindViewById2.animate().setDuration(200L).alpha(0.0f).start();
                WelcomeVideoPlayerDialogFragment welcomeVideoPlayerDialogFragment2 = this.LIZ;
                View view4 = welcomeVideoPlayerDialogFragment2.LLILZIL;
                if (view4 == null) {
                    View view5 = welcomeVideoPlayerDialogFragment2.getView();
                    View viewFindViewById3 = view5 != null ? view5.findViewById(R.id.hke) : null;
                    welcomeVideoPlayerDialogFragment2.LLILZIL = (C16FS) viewFindViewById3;
                    view4 = viewFindViewById3;
                }
                C16FS c16fs = (C16FS) view4;
                C786410Ut5.LLJJJ(c16fs, 0);
                int iLJIILLIIL = (C497740JfY.LJIILLIIL() / 2) - ((int) C497740JfY.LIZIZ(102.0f));
                C2268791DrB c2268791DrB = new C2268791DrB(0.65f, 0.0f, 0.35f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c16fs, (Property<C16FS, Float>) View.TRANSLATION_Y, iLJIILLIIL);
                objectAnimatorOfFloat.setDuration(400L);
                objectAnimatorOfFloat.setInterpolator(c2268791DrB);
                objectAnimatorOfFloat.addListener(new AAListenerS337S0100000_27(welcomeVideoPlayerDialogFragment2, 2));
                C786410Ut5.Pd(objectAnimatorOfFloat);
            }

            @Override // X.C0N0R
            public final void onFailed() {
                this.LIZ.getClass();
            }
        };
        c0n0s.LJIILIIL = this.LLJJ;
        if (this.LLJILLL && (c19736512Jv = this.LLJILJILJ) != null) {
            c19736512Jv.callOnClick();
        }
        c0n0s.LJIILJJIL = this.LLJILLL;
        this.LLIZLLLIL = c0n0s;
        int iLJIIZILJ = C497740JfY.LJIIZILJ();
        int i = (iLJIIZILJ * 1080) / 720;
        C1765720w38 c1765720w38 = this.LLJ;
        if (c1765720w38 != null) {
            new C1752030vh3();
            C1752030vh3 c1752030vh3 = new C1752030vh3();
            c1752030vh3.LIZ = this.LLIZLLLIL;
            c1752030vh3.LJ = Integer.valueOf(this.LLIZ);
            Dialog dialog = getDialog();
            if (dialog != null) {
                window = dialog.getWindow();
            } else {
                window = null;
            }
            c1752030vh3.LIZJ = window;
            c1752030vh3.LIZLLL = new C0JSE(iLJIIZILJ, i);
            c1765720w38.setParams(c1752030vh3);
        }
        C1765720w38 c1765720w382 = this.LLJ;
        if (c1765720w382 != null) {
            c1765730w39 = (C1765730w39) c1765720w382.findViewById(R.id.qtg);
        } else {
            c1765730w39 = null;
        }
        this.LLJI = c1765730w39;
        if (c1765730w39 != null) {
            constraintLayout = (ConstraintLayout) c1765730w39.findViewById(R.id.a15);
        } else {
            constraintLayout = null;
        }
        this.LLJIJIL = constraintLayout;
        if (constraintLayout != null) {
            c19736512Jv2 = (C19736512Jv) constraintLayout.findViewById(R.id.vki);
        }
        this.LLJILJILJ = c19736512Jv2;
        ConstraintLayout constraintLayout2 = this.LLJIJIL;
        if (constraintLayout2 != null && (imageView = (ImageView) constraintLayout2.findViewById(R.id.inu)) != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        C1765720w38 c1765720w383 = this.LLJ;
        if (c1765720w383 != null) {
            C786410Ut5.LLLLLLLLL(c1765720w383.LLJIJIL, 0);
        }
        C1765730w39 c1765730w392 = this.LLJI;
        if (c1765730w392 != null) {
            c1765730w392.findViewById(R.id.xwn);
        }
        float f = ((this.LLJILJIL * 1.0f) / this.LLIZ) * 100 * LSPassThroughRecordSizeConfig.DEFAULT;
        C1765720w38 c1765720w384 = this.LLJ;
        if (c1765720w384 != null) {
            c1765720w384.LJIIJ(f);
        }
        ((ViewGroup.MarginLayoutParams) NR().getLayoutParams()).setMargins(16, 0, 16, this.LLJILJILJ.getLayoutParams().height);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) MR().getLayoutParams();
        marginLayoutParams.topMargin = 59;
        marginLayoutParams.leftMargin = 21;
        if (C497740JfY.LJJ()) {
            ((FrameLayout.LayoutParams) NR().getLayoutParams()).gravity = 8388691;
            ((FrameLayout.LayoutParams) MR().getLayoutParams()).gravity = 8388661;
            marginLayoutParams.rightMargin = 21;
        }
        C786410Ut5.Q7(MR(), new ACListenerS161S0100000_27(this, 37));
        C786410Ut5.U8(NR(), new ACListenerS161S0100000_27(this, 38));
    }
}
