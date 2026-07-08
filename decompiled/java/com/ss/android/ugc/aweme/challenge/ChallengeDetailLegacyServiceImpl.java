package com.ss.android.ugc.aweme.challenge;

import X.AbstractC1041580dDA;
import X.C04TD;
import X.C0CC4;
import X.C0WZX;
import X.C1701330uNH;
import X.C19724912Fj;
import X.C19EG;
import X.C1ER1;
import X.C2204961BRm;
import X.C2277881EDy;
import X.C419910GdJ;
import X.InterfaceC1618270sDJ;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IChallengeDetailLegacyService;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes17.dex */
public class ChallengeDetailLegacyServiceImpl implements IChallengeDetailLegacyService {
    public static IChallengeDetailLegacyService LIZ() {
        Object objLIZ = C04TD.LIZ(IChallengeDetailLegacyService.class, false);
        if (objLIZ != null) {
            return (IChallengeDetailLegacyService) objLIZ;
        }
        if (C04TD.LLILZLL == null) {
            synchronized (IChallengeDetailLegacyService.class) {
                if (C04TD.LLILZLL == null) {
                    C04TD.LLILZLL = new ChallengeDetailLegacyServiceImpl();
                }
            }
        }
        return C04TD.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.IChallengeDetailLegacyService
    public final void LJIILIIL(String str, boolean z) {
        C1ER1.LIZIZ.LJIILIIL(str, z);
    }

    @Override // com.ss.android.ugc.aweme.IChallengeDetailLegacyService
    public final void LJIILL(Context context, String str) {
        InterfaceC1618270sDJ interfaceC1618270sDJ = C0CC4.LIZ;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            if (!str.startsWith("https://") && !str.startsWith("http://")) {
                sb.append(str);
                C19724912Fj.LIZLLL().LJII(sb.toString());
                return;
            }
            try {
                sb.append("aweme://ame/webview/");
                sb.append("?url=");
                sb.append(URLEncoder.encode(str, "ISO-8859-1"));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            Intent intentLJFF = AbstractC1041580dDA.LJFF(context, UriProtector.parse(sb.toString()));
            intentLJFF.setClass(context, CrossPlatformActivity.class);
            intentLJFF.putExtra("hide_more", false);
            intentLJFF.putExtra("bundle_auto_play_audio", true);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentLJFF, "Context_startActivity_1");
            C1701330uNH.LIZ(intentLJFF, context);
            C2204961BRm.LJJJJJL(context, intentLJFF, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytcIvHyjMqFtQt0l/8ijrkfRuzqvTEau72tkOa7GKp8Umr1yDqHQ==", null));
        }
    }

    @Override // com.ss.android.ugc.aweme.IChallengeDetailLegacyService
    public final void LJIILLIIL(C19EG c19eg, Bundle bundle) {
        C2277881EDy.LIZIZ.startHeaderDetailActivity(c19eg, bundle);
    }

    @Override // com.ss.android.ugc.aweme.IChallengeDetailLegacyService
    public final void LJIILJJIL(ImageView imageView, int i, int i2) {
        Context context = imageView.getContext();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_turn_up_right;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZJ = i2;
        imageView.setImageDrawable(c419910GdJ.LIZ(context));
    }
}
