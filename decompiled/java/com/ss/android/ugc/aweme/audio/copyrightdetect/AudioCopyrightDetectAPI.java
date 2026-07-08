package com.ss.android.ugc.aweme.audio.copyrightdetect;

import X.C01GW;
import X.C040I;
import X.C0X9S;
import X.C452501pT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes.dex */
public final class AudioCopyrightDetectAPI {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(52));

    public interface MusicCheckApi {
        @InterfaceC1501240pAY("/tiktok/v1/post/settings/update/")
        C0X9S<AutoCheckResponse> LIZ(@C040I AutoCheckRequest autoCheckRequest);

        @InterfaceC1501240pAY("/tiktok/v1/post/settings/update/")
        C0X9S<AutoCheckResponse> LIZIZ(@C040I AutoCheckRequest autoCheckRequest);

        @InterfaceC1501240pAY("/aweme/v1/music/precheck/")
        C0X9S<PreCheckResult> LIZJ(@C040I PreCheckRequest preCheckRequest);

        @InterfaceC1501200pAU("/tiktok/v1/post/settings/")
        C0X9S<AutoCheckResponse> getAutoCheck(@InterfaceC1501070pAH("enter_from") String str);
    }

    public final boolean LIZ() {
        Integer num;
        try {
            AutoCheckResponse autoCheckResponse = ((MusicCheckApi) this.LIZ.getValue()).getAutoCheck(null).execute().LIZIZ;
            if (autoCheckResponse == null || (num = autoCheckResponse.precheck_music) == null) {
                return false;
            }
            return num.intValue() == 1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            e.getMessage();
            return false;
        }
    }

    public final boolean LIZIZ(boolean z) {
        int i;
        try {
            int value = PostSettingEntryType.PR_CHECK_MUSIC.getValue();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            Integer num = ((MusicCheckApi) this.LIZ.getValue()).LIZ(new AutoCheckRequest(value, Integer.valueOf(i))).execute().LIZIZ.precheck_music;
            if (num != null) {
                if (num.intValue() == 1) {
                    return true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            e.getMessage();
        }
        return false;
    }
}
