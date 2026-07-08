package com.ss.android.ugc.profile.business.pns.business;

import X.C0HTI;
import X.C1250210idf;
import X.C1265750j2j;
import X.C1308910kAL;
import X.C19EG;
import X.C444920HcY;
import X.C770750ULh;
import X.C786410Ut5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.profile.business.pns.data.MemorialisedAcountData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderTopTipsMemorialisedAccountProtocol extends ProfilePlatformProtocol<MemorialisedAcountData> {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "top_tips_memorialised_account";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJI() {
        return Integer.valueOf(R.raw.icon_remembering);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String LJJIFFI() {
        Context context = getContext();
        if (context != null) {
            return context.getString(2131837163);
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        Drawable drawableLIZ;
        C19EG activity;
        FragmentManager supportFragmentManager;
        Context context = getContext();
        if (context != null) {
            String string = context.getString(2131837164);
            String string2 = context.getString(2131837162, string);
            SpannableString spannableString = new SpannableString(string2);
            int iLJJJ = a0.LJJJ(string2, string, 0, false, 6);
            C786410Ut5.p2(spannableString, new C1265750j2j(this, C1308910kAL.LIZJ(R.attr.a1n, context), 2), iLJJJ, string.length() + iLJJJ, 34);
            C786410Ut5.p2(spannableString, new C444920HcY(82, true), iLJJJ, string.length() + iLJJJ, 33);
            C770750ULh c770750ULh = new C770750ULh();
            Context context2 = getContext();
            if (context2 != null) {
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.qn;
                drawableLIZ = c0hti.LIZ(context2);
            } else {
                drawableLIZ = null;
            }
            c770750ULh.LIZ = drawableLIZ;
            c770750ULh.LIZLLL = 1;
            c770750ULh.LJ = context.getString(2131837163);
            c770750ULh.LIZJ(spannableString);
            TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
            Fragment fragment = this.LLILZ;
            if (fragment != null && (activity = fragment.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                tuxSheet.show(supportFragmentManager, "memorialised_account");
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        this.LLJILJIL = (T) C1250210idf.LIZ(nVar.toString(), MemorialisedAcountData.class);
    }
}
