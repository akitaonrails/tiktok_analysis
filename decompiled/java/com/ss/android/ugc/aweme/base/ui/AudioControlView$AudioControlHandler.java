package com.ss.android.ugc.aweme.base.ui;

import X.C15O7;
import X.C16EG;
import X.C1C7U;
import X.C2188811AlT;
import X.C2276411E8h;
import X.C786410Ut5;
import Y.ACallableS434S0100000_31;
import android.media.AudioManager;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes24.dex */
public class AudioControlView$AudioControlHandler extends BPEAHandler {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final WeakReference<C16EG> LL;
    public final AudioManager LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public final boolean LLIZ;

    public final void LJ() {
        try {
            if (this.LLIZ) {
                C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("currentVolume(setVolume) = ");
                sbLIZ.append(this.LLILZIL);
                c2276411E8h.LIZJ("common_feed", 4, "VoiceAdjust", C2188811AlT.LIZIZ(sbLIZ));
                this.LLILLJJLI.setStreamVolume(3, this.LLILZIL, 8);
            }
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            C2276411E8h.LIZIZ.LIZLLL("common_feed", e);
        }
        C15O7.LIZIZ(new ACallableS434S0100000_31(this, 2), C15O7.LJIIIIZZ, null);
    }

    public final void LJFF() {
        try {
            this.LLILZIL = this.LLILLJJLI.getStreamVolume(3);
            C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("currentVolume(syncCurrentVolume) = ");
            sbLIZ.append(this.LLILZIL);
            c2276411E8h.LIZJ("common_feed", 4, "VoiceAdjust", C2188811AlT.LIZIZ(sbLIZ));
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C2276411E8h.LIZIZ.LIZLLL("common_feed", e);
            this.LLILZLL = true;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("AudioControlView$AudioControlHandler@858e.handleMessage");
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C2276411E8h.LIZIZ.LIZJ("common_feed", 4, "VoiceAdjust", "execCutVolume");
                    LJFF();
                    int i2 = this.LLILZIL - this.LLILZ;
                    this.LLILZIL = i2;
                    if (i2 < 0) {
                        this.LLILZIL = 0;
                    }
                    LJ();
                }
            } else {
                C2276411E8h.LIZIZ.LIZJ("common_feed", 4, "VoiceAdjust", "execAddVolume");
                LJFF();
                int i3 = this.LLILZIL + this.LLILZ;
                this.LLILZIL = i3;
                int i4 = this.LLILLL;
                if (i3 > i4) {
                    this.LLILZIL = i4;
                }
                LJ();
            }
        } else {
            C2276411E8h.LIZIZ.LIZJ("common_feed", 4, "VoiceAdjust", "initVolume");
            int iZ3 = C786410Ut5.Z3(this.LLILLJJLI, 3);
            this.LLILLL = iZ3;
            int i5 = iZ3 / 15;
            this.LLILZ = i5;
            if (i5 == 0) {
                this.LLILZ = 1;
            }
            LJFF();
        }
        C1C7U.LIZIZ("AudioControlView$AudioControlHandler@858e.handleMessage");
    }

    public AudioControlView$AudioControlHandler(Looper looper, C16EG c16eg) {
        super(looper);
        this.LLIZ = true;
        this.LL = new WeakReference<>(c16eg);
        this.LLILLJJLI = (AudioManager) C786410Ut5.H2(c16eg.getContext(), "audio");
        sendEmptyMessage(1);
    }
}
