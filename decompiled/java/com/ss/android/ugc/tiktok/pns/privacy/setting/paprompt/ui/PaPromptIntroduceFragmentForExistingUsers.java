package com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui;

import X.C0HTI;
import X.C10B8;
import X.C1163504gr;
import X.C1667580tUq;
import X.C191969108h;
import X.C19EH;
import X.C770750ULh;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.sheet.intro.TuxIntroFragment;
import com.ss.android.ugc.tiktok.pns.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PaPromptIntroduceFragmentForExistingUsers extends BaseFragment implements C10B8 {
    public static boolean LL = false;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s8Jzx9ODclPy4wMWs/LDsnISsrZz8yODHELIOScjJD8nZjAlZx8yGDcjJD8nASs4OyA3PSYpDz0yLygpJzsVJzcJMSYgPCwiLhogLTc/";

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment
    public final int MR() {
        return R.layout.be7;
    }

    @Override // X.C10B8
    public final boolean onBackPressed() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Drawable drawableLIZ;
        super.onViewCreated(view, bundle);
        C770750ULh c770750ULh = new C770750ULh();
        Context context = getContext();
        if (context != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.rj;
            drawableLIZ = c0hti.LIZ(context);
        } else {
            drawableLIZ = null;
        }
        c770750ULh.LIZ = drawableLIZ;
        c770750ULh.LJ = getString(2131845223);
        c770750ULh.LJFF = getString(2131845218);
        c770750ULh.LJ(new C1667580tUq(R.raw.icon_eye_fill, null, getString(2131845219), null, 10), new C1667580tUq(R.raw.icon_comment_fill, null, getString(2131845222), null, 10), new C1667580tUq(R.raw.icon_paperplane_fill, null, getString(2131845220), null, 10), new C1667580tUq(R.raw.icon_duet_fill, null, getString(2131845221), null, 10));
        c770750ULh.LJIILLIIL = false;
        c770750ULh.LJI(getString(2131845217), new AwS607S0100000_28(this, 167));
        TuxIntroFragment tuxIntroFragmentLIZ = c770750ULh.LIZ();
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.kyf, tuxIntroFragmentLIZ, "Intro");
        c19ehLJIIJ.LJIIJ();
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZLLL("enter_from", "exist_account_privacy_page");
        c191969108h.LIZLLL("action_type", "show");
        c1163504gr.onEventV3("exist_account_privacy_manage_prompt", c191969108h.LIZ);
    }
}
