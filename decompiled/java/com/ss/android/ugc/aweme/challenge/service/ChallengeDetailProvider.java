package com.ss.android.ugc.aweme.challenge.service;

import X.C04PL;
import X.C04TD;
import X.C19405810w4;
import X.C19418010y2;
import X.InterfaceC19405710w3;
import X.InterfaceC19405910w5;
import X.InterfaceC19417910y1;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes30.dex */
public class ChallengeDetailProvider implements IChallengeDetailProvider {
    public static IChallengeDetailProvider LIZLLL() {
        Object objLIZ = C04TD.LIZ(IChallengeDetailProvider.class, false);
        if (objLIZ != null) {
            return (IChallengeDetailProvider) objLIZ;
        }
        if (C04TD.LLIZLLLIL == null) {
            synchronized (IChallengeDetailProvider.class) {
                if (C04TD.LLIZLLLIL == null) {
                    C04TD.LLIZLLLIL = new ChallengeDetailProvider();
                }
            }
        }
        return C04TD.LLIZLLLIL;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.10y2] */
    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider
    public final C19418010y2 LIZ() {
        return new InterfaceC19417910y1() { // from class: X.10y2
            public final InterfaceC19418110y3 LIZ = ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LIZ();

            @Override // X.InterfaceC19417910y1
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC19417910y1
            public final void LIZ(float f) {
                this.LIZ.LIZ(f);
            }

            @Override // X.InterfaceC19417910y1
            public final void LIZLLL(ChallengeDetail challengeDetail) {
                this.LIZ.LJII(challengeDetail.challenge, challengeDetail.slideList);
            }

            @Override // X.InterfaceC19417910y1
            public final void LIZJ(FrameLayout frameLayout, C19406610wC c19406610wC) {
                this.LIZ.LJI(frameLayout, new C19418210y4(c19406610wC.LJ));
                this.LIZ.LJIIIIZZ((ViewStub) frameLayout.findViewById(R.id.vs_mission_container), c19406610wC.LIZLLL);
                this.LIZ.LIZLLL((ViewStub) frameLayout.findViewById(R.id.vs_commerce_banner_container));
                this.LIZ.LIZIZ((ViewStub) frameLayout.findViewById(R.id.vs_commerce_disclaimer_container));
                this.LIZ.LJIIIZ((ViewStub) frameLayout.findViewById(R.id.vs_commerce_link_container));
                if (c19406610wC.LIZJ == EnumC993400bxS.TYPE_TRANSFORM) {
                    this.LIZ.LIZJ(frameLayout.findViewById(R.id.yhl));
                    this.LIZ.LJFF((C11FU) frameLayout.findViewById(R.id.lyg));
                    this.LIZ.LJ((TextView) frameLayout.findViewById(R.id.tv_transform));
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider
    public final void LIZJ(C19405810w4 c19405810w4) {
        C04PL.LIZ.LIZIZ(c19405810w4);
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider
    public final InterfaceC19405710w3 LIZIZ(View view, Fragment fragment) {
        return ((InterfaceC19405910w5) C04PL.LIZ.LIZ()).LIZIZ(view, fragment);
    }
}
