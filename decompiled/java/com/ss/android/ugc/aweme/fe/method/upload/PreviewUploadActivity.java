package com.ss.android.ugc.aweme.fe.method.upload;

import X.C1308910kAL;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import Y.ACListenerS143S0100000_8;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.VideoView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes9.dex */
public final class PreviewUploadActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMpZyI2PCHELIOS0jLWEmOCkjKCt9GDcpPyY2PxA8JSAyLAQvPSYlITE1";
    public VideoView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public String LLILZ;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onResume", true);
        super.onResume();
        if (LLLLLZL() != null && !LLLLLZL().isPlaying()) {
            LLLLLZL().start();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final VideoView LLLLLZL() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_view);
            this.LL = (VideoView) callbackFindViewById;
        }
        return (VideoView) callbackFindViewById;
    }

    public final void init() {
        String stringExtra;
        try {
            stringExtra = getIntent().getStringExtra("filePath");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LLILZ = stringExtra;
        if (stringExtra != null) {
            VideoView videoViewLLLLLZL = LLLLLZL();
            int visibility = videoViewLLLLLZL.getVisibility();
            videoViewLLLLLZL.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, videoViewLLLLLZL);
            videoViewLLLLLZL.setVideoPath(this.LLILZ);
            videoViewLLLLLZL.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X.0MAR
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    PreviewUploadActivity previewUploadActivity = this.LL;
                    KeyEvent.Callback callbackFindViewById = previewUploadActivity.LLILLJJLI;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = previewUploadActivity.findViewById(R.id.upload_confirm);
                        previewUploadActivity.LLILLJJLI = (TuxTextView) callbackFindViewById;
                    }
                    C786410Ut5.LLLLZLL((TuxTextView) callbackFindViewById, 0);
                    PreviewUploadActivity previewUploadActivity2 = this.LL;
                    KeyEvent.Callback callbackFindViewById2 = previewUploadActivity2.LLILLL;
                    if (callbackFindViewById2 == null) {
                        callbackFindViewById2 = previewUploadActivity2.findViewById(R.id.upload_cancel);
                        previewUploadActivity2.LLILLL = (TuxTextView) callbackFindViewById2;
                    }
                    C786410Ut5.LLLLZLL((TuxTextView) callbackFindViewById2, 0);
                    mediaPlayer.setLooping(true);
                }
            });
        }
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.upload_confirm);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        C786410Ut5.h9((TuxTextView) callbackFindViewById, new ACListenerS143S0100000_8(this, 16));
        KeyEvent.Callback callbackFindViewById2 = this.LLILLL;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.upload_cancel);
            this.LLILLL = (TuxTextView) callbackFindViewById2;
        }
        C786410Ut5.h9((TuxTextView) callbackFindViewById2, new ACListenerS143S0100000_8(this, 17));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (LLLLLZL() != null) {
            LLLLLZL().suspend();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (LLLLLZL() != null && LLLLLZL().isPlaying()) {
            LLLLLZL().pause();
        }
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bim);
        init();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
