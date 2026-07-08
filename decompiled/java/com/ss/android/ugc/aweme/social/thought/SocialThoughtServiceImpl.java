package com.ss.android.ugc.aweme.social.thought;

import X.C0DZ3;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1439905kL;
import X.C19EG;
import X.C306730C0p;
import X.C341220DZg;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.os.SystemClock;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.social.thought.inbox.ThoughtInboxCell;
import com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtPanelFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class SocialThoughtServiceImpl implements SocialThoughtService {
    public long LIZ;

    @Override // com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService
    public final ISocialThoughtDataCenterService LJJIIZI() {
        return (ISocialThoughtDataCenterService) PluggableExtentionKt.pluggableSpi$default(ISocialThoughtDataCenterService.class, false, false, false, 14, null);
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService
    public final Class<? extends PowerCell<? extends InterfaceC1891350zJl>>[] LJ() {
        return C1439905kL.LIZ() ? new Class[]{ThoughtInboxCell.class} : new Class[0];
    }

    public final boolean LJI() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.LIZ < 500) {
            return true;
        }
        this.LIZ = jUptimeMillis;
        return false;
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService
    public final C341220DZg LIZIZ() {
        return C341220DZg.LIZ;
    }

    public static TuxSheet LJFF(SocialThoughtPanelFragment socialThoughtPanelFragment) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = socialThoughtPanelFragment;
        c1390920mIc.LJIIIIZZ(0);
        c1390920mIc.LIZ(0.9f);
        c1390920mIc.LIZ.LLJJIJIIJIL = true;
        C1390920mIc.LJII(c1390920mIc, false);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLILLL = true;
        tuxSheet.LLJLLL = true;
        tuxSheet.LLJLLIL = true;
        tuxSheet.LLILZIL = false;
        c1390920mIc.LJI(53);
        return c1390920mIc.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService
    public final void LIZLLL(Context context, String str, String str2) {
        FragmentManager supportFragmentManager;
        if (LJI()) {
            return;
        }
        String str3 = SocialThoughtPanelFragment._pnsPageId;
        SocialThoughtPanelFragment socialThoughtPanelFragmentLIZJ = C0DZ3.LIZJ(str, str2, false);
        socialThoughtPanelFragmentLIZJ.LLIZLLLIL = str;
        socialThoughtPanelFragmentLIZJ.LLJ = str2;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = socialThoughtPanelFragmentLIZJ;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = null;
        tuxSheet.LLJJJ = null;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLILLL = true;
        tuxSheet.LLJLLL = true;
        tuxSheet.LLJLLIL = true;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            tuxSheet.show(supportFragmentManager, "SocialThoughtAuthorPanel");
        }
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService
    public final void LIZJ(C19EG c19eg, String str, String str2, ThoughtInfo thoughtInfo, User user, boolean z) {
        boolean z2;
        if (LJI()) {
            return;
        }
        if (C306730C0p.LIZ() && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str3 = SocialThoughtPanelFragment._pnsPageId;
        SocialThoughtPanelFragment socialThoughtPanelFragmentLIZIZ = C0DZ3.LIZIZ(thoughtInfo, user, z, z2);
        socialThoughtPanelFragmentLIZIZ.LLIZLLLIL = str;
        socialThoughtPanelFragmentLIZIZ.LLJ = str2;
        LJFF(socialThoughtPanelFragmentLIZIZ).show(c19eg.getSupportFragmentManager(), "ThoughtOtherConsumptionPanel");
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService
    public final void LIZ(C19EG c19eg, String str, String str2, String str3, boolean z, String str4, Function0<Unit> function0) {
        boolean z2;
        if (LJI()) {
            return;
        }
        String str5 = SocialThoughtPanelFragment._pnsPageId;
        if (function0 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        SocialThoughtPanelFragment socialThoughtPanelFragmentLIZ = C0DZ3.LIZ(str, z2, str4, false, 8);
        socialThoughtPanelFragmentLIZ.LLIZLLLIL = str2;
        socialThoughtPanelFragmentLIZ.LLJ = str3;
        socialThoughtPanelFragmentLIZ.LLJI = Boolean.valueOf(z);
        if (function0 != null) {
            socialThoughtPanelFragmentLIZ.LLIZ = function0;
        }
        LJFF(socialThoughtPanelFragmentLIZ).show(c19eg.getSupportFragmentManager(), "ThoughtCreationPanel");
    }
}
