package com.ss.android.ugc.aweme.commercialize.depend;

import X.C0CLW;
import X.C0CQT;
import X.C1494690ozz;
import X.C1514430pVp;
import X.C19254610Um;
import X.InterfaceC2194071Atx;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: loaded from: classes14.dex */
public final class AdTrackDependImpl implements IAdTrackDepend {
    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String LIZJ() {
        return C0CLW.LIZIZ.LIZ.getAdTrackerConfig();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final boolean LJ() {
        return C1514430pVp.LIZLLL().booleanValue() && C19254610Um.LIZIZ.LJJIIJZLJL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final SharedPreferences LJFF() {
        return SharePrefCache.inst().getSharePref();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String LIZLLL() {
        return C0CQT.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final int LIZ(Exception exc) {
        if (exc instanceof C1494690ozz) {
            return ((C1494690ozz) exc).getStatusCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final void LJI(final AwS578S0100000_34 awS578S0100000_34) {
        SettingsManagerProxy.inst().registerSettingsWatcher(new InterfaceC2194071Atx() { // from class: X.0XJ1
            @Override // X.InterfaceC2194071Atx
            public final void LIZ(IESSettingsProxy iESSettingsProxy) {
                awS578S0100000_34.invoke();
            }
        }, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String LIZIZ(String str, String str2) {
        if (str.contains("{UID}") || str.contains("__UID__")) {
            return str.replace("{UID}", str2).replace("__UID__", str2);
        }
        return str;
    }
}
