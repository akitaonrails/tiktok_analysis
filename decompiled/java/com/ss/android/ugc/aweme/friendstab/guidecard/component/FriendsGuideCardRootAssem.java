package com.ss.android.ugc.aweme.friendstab.guidecard.component;

import X.C01GW;
import X.C11NJ;
import X.C1287400jbe;
import X.C1388190mED;
import X.C1607610rw7;
import X.C197039127h;
import X.C19EG;
import X.C21415018rM;
import X.C2188811AlT;
import X.C446900Hfk;
import X.C452501pT;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.hox.Hox;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsGuideCardRootAssem extends ReusedUIContentAssem<FriendsGuideCardRootAssem> {
    public SmartImageView LLJJJJ;
    public C197039127h LLJJJJJIL;
    public C197039127h LLJJJJLIIL;
    public C21415018rM LLJJL;
    public C1287400jbe LLJJLIIIJLLLLLLLZ;
    public ImageView LLJL;
    public TuxTextView LLJLIL;
    public ConstraintLayout LLJLILLLLZIIL;
    public ConstraintLayout LLJLL;
    public LinearLayout LLJLLIL;
    public TuxIconView LLJLLL;
    public SmartImageView LLJZ;
    public SmartImageView LLJZIJLIL;
    public ImageView LLL;
    public boolean LLLFF;
    public boolean LLLI;
    public final C01GW LLLF = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(154));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 429));
    public final C11NJ LLLFZ = new C11NJ();

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        this.LLLFZ.LJ();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Zo() {
        C1287400jbe c1287400jbe;
        try {
            if (!this.LLLFF || (c1287400jbe = this.LLJJLIIIJLLLLLLLZ) == null) {
                return;
            }
            c1287400jbe.onPause();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void ap() {
        C1287400jbe c1287400jbe;
        try {
            if (!this.LLLFF || (c1287400jbe = this.LLJJLIIIJLLLLLLLZ) == null) {
                return;
            }
            c1287400jbe.onResume();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void cp() {
        C19EG c19egLIZIZ;
        C1607610rw7.LIZ.getClass();
        C1607610rw7.LIZJ = true;
        Keva keva = C1607610rw7.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1607610rw7.LIZJ());
        sbLIZ.append("_uninterested_count");
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C1607610rw7.LIZJ());
        sbLIZ2.append("_frequency_control_exit_start_time");
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ2), 0L);
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        Context context = getContext();
        C19EG c19egLIZIZ2 = context != null ? C1388190mED.LIZIZ(context) : null;
        if (c19egLIZIZ2 == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Fragment fragmentKi = c446900Hfk.LIZ(c19egLIZIZ2).Ki("FRIENDS_TAB");
        Context context2 = getContext();
        if (context2 == null || (c19egLIZIZ = C1388190mED.LIZIZ(context2)) == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Hox hoxLIZ = c446900Hfk.LIZ(c19egLIZIZ);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
        if (fragmentKi == null) {
            bundle.putBoolean("init", true);
        }
        C786410Ut5.LJJJI("friends_enter_method", "fyp_goto_card", bundle);
        C786410Ut5.LJJJI("enter_method", "fyp_goto_card", bundle);
        hoxLIZ.TQ2(bundle, "FRIENDS_TAB", false);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        super.Co();
    }
}
