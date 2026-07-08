package com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.config;

import X.C1257500ipQ;
import X.C1257970iqB;
import X.C21594419fC;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager.AwemePagerVM;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileTabRegister extends C1257970iqB {
    public final AwemePagerVM LIZJ;
    public final C1257500ipQ LIZLLL;
    public final View LJ;
    public final Context LJFF;

    public interface AppDiffProtocol {

        public static final class DowngradeInstance implements AppDiffProtocol {
            @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.config.ProfileTabRegister.AppDiffProtocol
            public final void LIZ() {
            }
        }

        void LIZ();
    }

    public ProfileTabRegister(AwemePagerVM awemePagerVM, C1257500ipQ c1257500ipQ, C21594419fC c21594419fC) {
        this.LIZJ = awemePagerVM;
        this.LIZLLL = c1257500ipQ;
        this.LJ = c21594419fC;
        this.LJFF = c1257500ipQ.getContext();
    }
}
