package com.ss.android.ugc.aweme.ecommerce.marketing.widget.pip;

import X.C098200Yq;
import X.C1685300txQ;
import X.C1841890y1z;
import X.C1841920y22;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21307518a1;
import X.C2188811AlT;
import X.C786410Ut5;
import X.SurfaceHolderCallbackC21307618a2;
import android.app.Activity;
import android.app.PictureInPictureParams;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.util.Rational;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.marketing.widget.pip.BonusWidgetPipTutorialFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class BonusWidgetPipTutorialFragment extends SAFTikTokFragment {
    public static final AtomicReference<WeakReference<Activity>> LLJJIJIIJIL = new AtomicReference<>(null);
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGE+KTcnLDs6JiHELIOSJiPiY3LyA4Zz86OGsOJiEmOxIlLSg2PBUlORsmPCo+IC4/DjctLiI2JjE=";
    public SurfaceView LLJILLL;
    public MediaPlayer LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final SurfaceHolderCallbackC21307618a2 LLJJIJI;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.18a2] */
    public BonusWidgetPipTutorialFragment() {
        aS(AFwS278S0000000_32.get$arr$(35));
        this.LLJJIJI = new SurfaceHolder.Callback() { // from class: X.18a2
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                MediaPlayer mediaPlayer = this.LL.LLJJ;
                if (mediaPlayer != null) {
                    mediaPlayer.setDisplay(surfaceHolder);
                }
                BonusWidgetPipTutorialFragment bonusWidgetPipTutorialFragment = this.LL;
                bonusWidgetPipTutorialFragment.LLJJI = true;
                if (bonusWidgetPipTutorialFragment.LLJJIII) {
                    try {
                        MediaPlayer mediaPlayer2 = bonusWidgetPipTutorialFragment.LLJJ;
                        if (mediaPlayer2 != null) {
                            mediaPlayer2.start();
                        }
                    } catch (IllegalStateException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                this.LL.LLJJI = false;
            }
        };
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        SurfaceHolder holder;
        AtomicReference<WeakReference<Activity>> atomicReference;
        WeakReference<Activity> weakReference;
        C19EG activity = getActivity();
        if (activity != null && (weakReference = (atomicReference = LLJJIJIIJIL).get()) != null && weakReference.get() == activity) {
            while (!atomicReference.compareAndSet(weakReference, null) && atomicReference.get() == weakReference) {
            }
        }
        SurfaceView surfaceView = this.LLJILLL;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            holder.removeCallback(this.LLJJIJI);
        }
        MediaPlayer mediaPlayer = this.LLJJ;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.LLJJ = null;
        this.LLJILLL = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT < 26) {
            AtomicReference<Function2<String, Boolean, Unit>> atomicReference = C1841890y1z.LLILLL;
            C1841920y22.LIZ("unsupported_api", false);
            requireActivity().finish();
            return;
        }
        C19EG c19egRequireActivity = requireActivity();
        if (c19egRequireActivity.isInPictureInPictureMode()) {
            LLJJIJIIJIL.set(new WeakReference<>(c19egRequireActivity));
            return;
        }
        if (c19egRequireActivity.enterPictureInPictureMode(new PictureInPictureParams.Builder().setAspectRatio(new Rational(9, 16)).build())) {
            LLJJIJIIJIL.set(new WeakReference<>(c19egRequireActivity));
            AtomicReference<Function2<String, Boolean, Unit>> atomicReference2 = C1841890y1z.LLILLL;
            C1841920y22.LIZ("success", true);
        } else {
            AtomicReference<Function2<String, Boolean, Unit>> atomicReference3 = C1841890y1z.LLILLL;
            C1841920y22.LIZ("enter_pip_failed", false);
            c19egRequireActivity.finish();
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C19EG activity = getActivity();
        if (activity == null || activity.isChangingConfigurations()) {
            return;
        }
        try {
            MediaPlayer mediaPlayer = this.LLJJ;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String stringExtra;
        SurfaceHolder holder;
        MediaPlayer andSet;
        SurfaceHolder holder2;
        super.onViewCreated(view, bundle);
        Intent intent = requireActivity().getIntent();
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("video_url");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        } else {
            stringExtra = "";
        }
        if (stringExtra.length() == 0) {
            AtomicReference<Function2<String, Boolean, Unit>> atomicReference = C1841890y1z.LLILLL;
            C1841920y22.LIZ("missing_video_url", false);
            requireActivity().finish();
            return;
        }
        this.LLJILLL = (SurfaceView) view.findViewById(R.id.gim);
        if (Intrinsics.LJFF(C21307518a1.LIZ.get(), stringExtra) && (andSet = C21307518a1.LIZIZ.getAndSet(null)) != null) {
            this.LLJJ = andSet;
            this.LLJJIII = true;
            andSet.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: X.0y26
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    AtomicReference<Function2<String, Boolean, Unit>> atomicReference2 = C1841890y1z.LLILLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("error:");
                    sbLIZ.append(i);
                    C1841920y22.LIZ(C2188811AlT.LIZIZ(sbLIZ), false);
                    C19EG activity = this.LL.getActivity();
                    if (activity != null) {
                        activity.finish();
                        return true;
                    }
                    return true;
                }
            });
            SurfaceView surfaceView = this.LLJILLL;
            if (surfaceView != null && (holder2 = surfaceView.getHolder()) != null) {
                holder2.addCallback(this.LLJJIJI);
                return;
            }
            return;
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(requireContext(), UriProtector.parse(stringExtra));
            mediaPlayer.setLooping(true);
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X.18a3
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    BonusWidgetPipTutorialFragment bonusWidgetPipTutorialFragment = this.LL;
                    bonusWidgetPipTutorialFragment.LLJJIII = true;
                    if (bonusWidgetPipTutorialFragment.LLJJI) {
                        try {
                            MediaPlayer mediaPlayer3 = bonusWidgetPipTutorialFragment.LLJJ;
                            if (mediaPlayer3 != null) {
                                mediaPlayer3.start();
                            }
                        } catch (IllegalStateException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                }
            });
            mediaPlayer.prepareAsync();
            this.LLJJ = mediaPlayer;
            this.LLJJIII = false;
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: X.0y26
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    AtomicReference<Function2<String, Boolean, Unit>> atomicReference2 = C1841890y1z.LLILLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("error:");
                    sbLIZ.append(i);
                    C1841920y22.LIZ(C2188811AlT.LIZIZ(sbLIZ), false);
                    C19EG activity = this.LL.getActivity();
                    if (activity != null) {
                        activity.finish();
                        return true;
                    }
                    return true;
                }
            });
            SurfaceView surfaceView2 = this.LLJILLL;
            if (surfaceView2 == null || (holder = surfaceView2.getHolder()) == null) {
                return;
            }
            holder.addCallback(this.LLJJIJI);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            mediaPlayer.release();
            AtomicReference<Function2<String, Boolean, Unit>> atomicReference2 = C1841890y1z.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error:");
            sbLIZ.append(th.getClass().getSimpleName());
            C1841920y22.LIZ(C2188811AlT.LIZIZ(sbLIZ), false);
            requireActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bq8, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
