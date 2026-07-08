package com.ss.android.ugc.aweme.music.addtodsp.feed.button.presave;

import X.AbstractC616030OEf;
import X.C01GW;
import X.C0ANB;
import X.C2296808zG;
import X.C279570AxX;
import X.C452501pT;
import X.C622680Oba;
import X.C631140OpE;
import X.C633020OsG;
import X.C633040OsI;
import X.C698680Ras;
import X.EnumC631120OpC;
import X.InterfaceC497601wk;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.addtodsp.feed.button.presave.MusicPresaveToDspButtonConditionSensor;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS187S0000000_2;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicPresaveToDspButtonConditionSensor extends AbstractC616030OEf<VideoItemParams> {
    public final Lifecycle LLILZIL;
    public final C01GW LLILZLL;
    public VideoItemParams LLIZ;
    public boolean LLIZLLLIL;
    public final C633040OsI LLJ;

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void LJJJJZ() {
        this.LLIZ = null;
        C2296808zG.LIZJ((InterfaceC497601wk) this.LLILZLL.getValue(), null);
    }

    @Override // X.AbstractC616030OEf
    public final void LIZJ() {
        C622680Oba.LIZJ(this.LLJ);
        this.LLILZIL.addObserver(new MusicPresaveToDspButtonConditionSensor$onInit$1(this));
    }

    public final boolean LJI() {
        Aweme aweme;
        VideoItemParams videoItemParams = this.LLIZ;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            C631140OpE c631140OpE = C631140OpE.LIZ;
            VideoItemParams videoItemParams2 = this.LLIZ;
            c631140OpE.getClass();
            EnumC631120OpC enumC631120OpCLIZ = C631140OpE.LIZ(videoItemParams2);
            C633020OsG c633020OsG = C633020OsG.LIZIZ;
            if (c633020OsG.LJJIJ(aweme, enumC631120OpCLIZ)) {
                this.LLIZLLLIL = true;
                String aid = aweme.getAid();
                if (aid != null) {
                    c633020OsG.LJJLL(enumC631120OpCLIZ, aid, true);
                }
                return true;
            }
            this.LLIZLLLIL = false;
            String aid2 = aweme.getAid();
            if (aid2 != null) {
                c633020OsG.LJJLL(enumC631120OpCLIZ, aid2, false);
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0OsI] */
    public MusicPresaveToDspButtonConditionSensor(Lifecycle lifecycle) {
        super("bottom_button_presave_to_music_app");
        this.LLILZIL = lifecycle;
        this.LLILZLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(590));
        final WeakReference weakReference = new WeakReference(this);
        this.LLJ = new Object(weakReference) { // from class: X.0OsI
            public final WeakReference<MusicPresaveToDspButtonConditionSensor> LIZ;

            {
                this.LIZ = weakReference;
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onPresaveAlbumEvent(C633050OsJ c633050OsJ) {
                MusicPresaveToDspButtonConditionSensor musicPresaveToDspButtonConditionSensor = this.LIZ.get();
                if (musicPresaveToDspButtonConditionSensor != null && C279570AxX.LIZ() && musicPresaveToDspButtonConditionSensor.LLIZLLLIL && !musicPresaveToDspButtonConditionSensor.LJI()) {
                    musicPresaveToDspButtonConditionSensor.LJ(false);
                }
            }
        };
    }

    @Override // X.AbstractC616030OEf
    public final boolean LIZLLL(C698680Ras c698680Ras) {
        if (((Number) C0ANB.LIZ.getValue()).intValue() > 0 && this.LLIZLLLIL) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void rr(Object obj) {
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        this.LLIZLLLIL = false;
        this.LLIZ = videoItemParams;
        if (videoItemParams == null) {
            LJ(false);
            return;
        }
        if (!C279570AxX.LIZ()) {
            LJ(false);
        } else {
            if (LJI()) {
                if (((Number) C0ANB.LIZ.getValue()).intValue() > 0) {
                    return;
                }
                LJ(true);
                return;
            }
            LJ(false);
        }
    }
}
