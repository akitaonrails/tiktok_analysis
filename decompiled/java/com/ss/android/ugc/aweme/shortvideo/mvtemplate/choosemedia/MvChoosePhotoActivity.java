package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.ActivityC214874197g;
import X.C0CHQ;
import X.C0LI0;
import X.C1389600mGU;
import X.C13LQ;
import X.C14EU;
import X.C201955140j;
import X.C214873197f;
import X.C540570LHz;
import X.C560350LyL;
import X.C560380LyO;
import X.C560470LyX;
import X.EnumC560450LyV;
import X.InterfaceC214877197j;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import X.InterfaceC535940L0e;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.lifecycle.Lifecycle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes9.dex */
public class MvChoosePhotoActivity extends ActivityC214874197g implements InterfaceC524950KiL, IPreDownloadMusic {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCB9JTM4LCHELIOSIjJCQ4LGEwICojOio+LSElKGEePgYkJiAgLRUkJjs8CSY4IDk6PDw=";
    public InterfaceC535940L0e LL;
    public final ArrayList<InterfaceC484050IyZ> LLILLJJLI = new ArrayList<>();
    public final ArrayList<InterfaceC362610EJn> LLILLL = new ArrayList<>();

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onResume", true);
        super.onResume();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "MvChoosePhotoActivity onResume");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final InterfaceC535940L0e LLLLZLLIL() {
        InterfaceC535940L0e interfaceC535940L0e = this.LL;
        if (interfaceC535940L0e != null) {
            return interfaceC535940L0e;
        }
        return null;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C0LI0 c0li0;
        C0LI0 c0li02;
        if (this.LL != null) {
            InterfaceC535940L0e interfaceC535940L0eLLLLZLLIL = LLLLZLLIL();
            if ((interfaceC535940L0eLLLLZLLIL instanceof C0LI0) && (c0li0 = (C0LI0) interfaceC535940L0eLLLLZLLIL) != null && c0li0.isEnableCallback()) {
                InterfaceC535940L0e interfaceC535940L0eLLLLZLLIL2 = LLLLZLLIL();
                if (!(interfaceC535940L0eLLLLZLLIL2 instanceof C0LI0) || (c0li02 = (C0LI0) interfaceC535940L0eLLLLZLLIL2) == null) {
                    return;
                }
                c0li02.onActivitySlideOutAnimBeginCallback(new AwS552S0100000_8(this, 208));
                return;
            }
        }
        super.onBackPressed();
    }

    public void LLLLZLLLI() {
        final Class<? extends Scene> defaultMediaSelectorSceneClass = C0CHQ.LIZ().LJJJI().getDefaultMediaSelectorSceneClass();
        C214873197f c214873197f = new C214873197f(this, defaultMediaSelectorSceneClass);
        c214873197f.LJFF = R.id.i9u;
        c214873197f.LJIIIIZZ = "MvChoosePhotoActivity";
        c214873197f.LJI = false;
        c214873197f.LJII = new InterfaceC214877197j() { // from class: X.0KzC
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle) {
                Bundle bundle2;
                if (!TextUtils.equals(defaultMediaSelectorSceneClass.getName(), str)) {
                    return null;
                }
                InterfaceC530910Krx interfaceC530910KrxLJJJI = C0CHQ.LIZ().LJJJI();
                try {
                    bundle2 = this.getIntent().getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                Scene sceneNewDefaultMediaSelectorSceneInstance = interfaceC530910KrxLJJJI.newDefaultMediaSelectorSceneInstance(bundle2);
                this.LL = (InterfaceC535940L0e) sceneNewDefaultMediaSelectorSceneInstance;
                return sceneNewDefaultMediaSelectorSceneInstance;
            }
        };
        c214873197f.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final IPreDownloadMusic.PreDownloadMusicData getPreDownloadMusicData() {
        Scene scene;
        Object objLLLLZLLIL = LLLLZLLIL();
        return (!(objLLLLZLLIL instanceof Scene) || (scene = (Scene) objLLLLZLLIL) == null || scene.mActivity == null) ? new IPreDownloadMusic.PreDownloadMusicData(null, null) : LLLLZLLIL().getPreDownloadMusicData();
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final boolean isReEnterChoosePhoto() {
        return LLLLZLLIL().isReEnterChoosePhoto();
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        C0LI0 c0li0;
        super.onEnterAnimationComplete();
        if (this.LL != null) {
            InterfaceC535940L0e interfaceC535940L0eLLLLZLLIL = LLLLZLLIL();
            if (!(interfaceC535940L0eLLLLZLLIL instanceof C0LI0) || (c0li0 = (C0LI0) interfaceC535940L0eLLLLZLLIL) == null) {
                return;
            }
            c0li0.onActivitySlideInAnimEndCallback();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "MvChoosePhotoActivity onPause");
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.LLILLJJLI.add(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.LLILLJJLI.remove(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLILLL.remove(interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLILLL.add(interfaceC362610EJn);
    }

    @Override // X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onCreate", true);
        activityConfiguration(AFwS239S0000000_8.get$arr$(77));
        super.onCreate(bundle);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C1389600mGU.LIZIZ(this)) {
            i = 0;
        } else {
            i = R.anim.a7;
        }
        overridePendingTransition(i, 0);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "MvChoosePhotoActivity onCreate");
        int intExtra = getIntent().getIntExtra("key_choose_scene", -1);
        if (getIntent().getBooleanExtra("album_dark_mode", false) || C13LQ.LJLIIL(new Integer[]{42, 64}).contains(Integer.valueOf(intExtra))) {
            setTheme(R.style.y0);
        }
        if (intExtra == 42) {
            setTheme(R.style.z9);
        }
        setContentView(R.layout.jn);
        LLLLZLLLI();
        if (intExtra == 57) {
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
            immersionBarLJIILJJIL.LJIIJ(false);
            tuxImmersionBar.LJIIIIZZ(R.attr.z_);
            tuxImmersionBar.LIZLLL();
        } else if (intExtra == 64) {
            ImmersionBar immersionBarLJIILJJIL2 = ImmersionBar.LJIILJJIL(this);
            TuxImmersionBar tuxImmersionBar2 = new TuxImmersionBar(this, immersionBarLJIILJJIL2);
            immersionBarLJIILJJIL2.LJIIJ(false);
            tuxImmersionBar2.LJFF(-16777216);
            tuxImmersionBar2.LIZLLL();
        }
        C560380LyO c560380LyO = C560380LyO.LIZ;
        Lifecycle lifecycle = getLifecycle();
        c560380LyO.getClass();
        C560380LyO.LIZIZ(lifecycle, false);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "enterAlbumFromAnchorUpload");
        if (!C560380LyO.LIZLLL) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C560350LyL c560350LyL = C560380LyO.LJIILIIL;
            c560350LyL.LJIIIIZZ = "shoot";
            c560350LyL.LJIIJ = jCurrentTimeMillis;
            c560350LyL.LJ = false;
            C560380LyO.LJI = true;
            C560380LyO.LIZJ = true;
            C560380LyO.LJIILLIIL(new C560470LyX(EnumC560450LyV.ALBUM, jCurrentTimeMillis));
        }
        try {
            stringExtra = getIntent().getStringExtra("shoot_way");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (Intrinsics.LJFF(stringExtra, "fixed_shoot_cell")) {
            ImmersionBar immersionBarLJIILJJIL3 = ImmersionBar.LJIILJJIL(this);
            TuxImmersionBar tuxImmersionBar3 = new TuxImmersionBar(this, immersionBarLJIILJJIL3);
            immersionBarLJIILJJIL3.LJIIJ(false);
            tuxImmersionBar3.LJIIIIZZ(R.attr.z_);
            tuxImmersionBar3.LIZLLL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onCreate", false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C540570LHz c540570LHz) {
        finish();
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final void setIsReEnterChoosePhoto(boolean z) {
        LLLLZLLIL().setIsReEnterChoosePhoto(false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator<InterfaceC362610EJn> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            if (it2.next().onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Iterator<InterfaceC484050IyZ> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            if (it2.next().onActivityResult(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final void setIsChangeMusicDownloadSuccess(boolean z, MusicModel musicModel, String str) {
        LLLLZLLIL().setIsChangeMusicDownloadSuccess(true, musicModel, str);
    }
}
