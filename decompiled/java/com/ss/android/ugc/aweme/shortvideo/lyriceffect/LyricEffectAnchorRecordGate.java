package com.ss.android.ugc.aweme.shortvideo.lyriceffect;

import X.AnonymousClass0956;
import X.C1398350mUb;
import X.C1426005i6;
import X.C1429680nJ8;
import X.C1452640nuA;
import X.C19EG;
import X.C2188811AlT;
import X.C356901a3;
import Y.ARunnableS108S0100000_8;
import android.content.Intent;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPAnchorData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;

/* JADX INFO: loaded from: classes9.dex */
public final class LyricEffectAnchorRecordGate {
    public final LifecycleOwner LIZ;
    public final C19EG LIZIZ;
    public final ShortVideoContext LIZJ;
    public CreativeDialogWrapper LJ;
    public int LJFF;
    public AnonymousClass0956 LJI;
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS108S0100000_8 LJII = new ARunnableS108S0100000_8(this, 22);

    public final void LIZIZ() {
        this.LIZLLL.removeCallbacks(this.LJII);
        this.LJFF = 0;
    }

    public final String LIZJ() {
        String stringExtra;
        MusicBuzModel musicBuzModel;
        CreativeModel creativeModel = this.LIZJ.creativeModel;
        String strLIZJ = (creativeModel == null || (musicBuzModel = creativeModel.musicBuzModel) == null) ? null : C1429680nJ8.LIZJ(musicBuzModel);
        if (!(strLIZJ == null || strLIZJ.length() == 0)) {
            return strLIZJ;
        }
        Intent intent = this.LIZIZ.getIntent();
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("music_id");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        } else {
            stringExtra = null;
        }
        if (stringExtra != null) {
            if (stringExtra.length() > 0) {
                return stringExtra;
            }
        }
        return null;
    }

    public final String LIZLLL() {
        EditorProSchemeModel editorProSchemeModel;
        EPAnchorData ePAnchorData;
        String str;
        CreativeModel creativeModel = this.LIZJ.creativeModel;
        if (creativeModel == null || (editorProSchemeModel = creativeModel.editorProSchemeModel) == null || (ePAnchorData = editorProSchemeModel.anchorData) == null || (str = ePAnchorData.resourceId) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public final boolean LJ() {
        String musicPath;
        MusicBuzModel musicBuzModel;
        ShortVideoContext shortVideoContext = this.LIZJ;
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        return (((creativeModel == null || (musicBuzModel = creativeModel.musicBuzModel) == null) ? null : musicBuzModel.music) == null || (musicPath = shortVideoContext.getMusicPath()) == null || musicPath.length() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.shortvideo.lyriceffect.LyricEffectAnchorRecordGate$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        public AnonymousClass1() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            LyricEffectAnchorRecordGate.this.LIZIZ();
            CreativeDialogWrapper creativeDialogWrapper = LyricEffectAnchorRecordGate.this.LJ;
            if (creativeDialogWrapper != null) {
                creativeDialogWrapper.dismiss();
            }
            LyricEffectAnchorRecordGate lyricEffectAnchorRecordGate = LyricEffectAnchorRecordGate.this;
            lyricEffectAnchorRecordGate.LJ = null;
            AnonymousClass0956 anonymousClass0956 = lyricEffectAnchorRecordGate.LJI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            LyricEffectAnchorRecordGate.this.LJI = null;
        }
    }

    public final void LIZ(AVMusic aVMusic, String str) {
        MusicBuzModel musicBuzModel;
        CameraComponentModel cameraComponentModel = this.LIZJ.cameraComponentModel;
        cameraComponentModel.mMusicPath = str;
        Workspace workspace = cameraComponentModel.mWorkspace;
        if (workspace != null) {
            workspace.MC(str);
        }
        CreativeModel creativeModel = this.LIZJ.creativeModel;
        if (creativeModel != null && (musicBuzModel = creativeModel.musicBuzModel) != null) {
            C1452640nuA.LJII(aVMusic, false, musicBuzModel);
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MUSIC-APPLIED musicId=");
        sbLIZ.append(aVMusic.id);
        sbLIZ.append(" localPath=");
        sbLIZ.append(str);
        C1426005i6.LIZ(c1398350mUb, "Anchor.Record.Gate", C2188811AlT.LIZIZ(sbLIZ));
    }

    public LyricEffectAnchorRecordGate(LifecycleOwner lifecycleOwner, C19EG c19eg, ShortVideoContext shortVideoContext) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = c19eg;
        this.LIZJ = shortVideoContext;
        lifecycleOwner.getLifecycle().addObserver(new AnonymousClass1());
    }
}
