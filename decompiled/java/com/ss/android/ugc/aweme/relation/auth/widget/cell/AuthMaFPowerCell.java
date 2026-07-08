package com.ss.android.ugc.aweme.relation.auth.widget.cell;

import X.C01GW;
import X.C1074520e4I;
import X.C1074850e4p;
import X.C10EU;
import X.C1254010ijn;
import X.C1260910iuv;
import X.C1266300j3c;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1387050mCN;
import X.C1908030zkf;
import X.C19FO;
import X.C2211751BhN;
import X.C2277891EDz;
import X.C296540Bjo;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC1387060mCO;
import android.content.Context;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS263S0300000_19;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AuthMaFPowerCell<T extends C1074850e4p> extends PowerCell<T> {
    public SmartAvatarImageView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public RelationButton LLILZLL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS560S0100000_16((AuthMaFPowerCell) this, 478));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS560S0100000_16((AuthMaFPowerCell) this, 476));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS560S0100000_16((AuthMaFPowerCell) this, 477));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.s0;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = (SmartAvatarImageView) this.itemView.findViewById(R.id.bkz);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.ru2);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.ugd);
        this.LLILZLL = (RelationButton) this.itemView.findViewById(R.id.iec);
        C2211751BhN.LIZ(this.itemView, new C1266300j3c(this, 0));
    }

    public static EnumC1260920iuw N5(String str) {
        for (EnumC1260920iuw enumC1260920iuw : EnumC1260920iuw.values()) {
            if (Intrinsics.LJFF(enumC1260920iuw.getType(), str)) {
                return enumC1260920iuw;
            }
        }
        return EnumC1260920iuw.CARD;
    }

    public final void L5(T t, String str) {
        C1074520e4I c1074520e4I = t.LLILLL;
        User userLIZIZ = t.LIZIZ();
        new C1254010ijn(c1074520e4I.LIZ, userLIZIZ, c1074520e4I.LIZJ, c1074520e4I.LIZIZ, c1074520e4I.LIZLLL, Integer.valueOf(t.LIZ()), str, null, null, null, null, null, null, 8064).LIZLLL(null);
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJIJLIJ(c1074520e4I.LIZ);
        c1260910iuv.LJJJJJ(c1074520e4I.LIZIZ);
        c1260910iuv.LJJLIIIJILLIZJL = N5(c1074520e4I.LJ);
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJLIIIJJI = EnumC1260930iux.ENTER_PROFILE;
        c1260910iuv.LJJJJZI(userLIZIZ);
        c1260910iuv.LJIILJJIL();
        C2277891EDz.LIZIZ.LJII().LJ(this.itemView.getContext(), userLIZIZ, c1074520e4I.LIZ, c1074520e4I.LIZLLL, c1074520e4I.LIZIZ, c1074520e4I.LIZJ, null);
    }

    public final void I5(User user, C1074520e4I c1074520e4I, boolean z) {
        View view;
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(user.getAvatarThumb()));
        SmartAvatarImageView smartAvatarImageView = this.LLILLL;
        RelationButton relationButton = null;
        if (smartAvatarImageView == null) {
            smartAvatarImageView = null;
        }
        c1331670kl3LJIIIIZZ.LJJ(smartAvatarImageView);
        c1331670kl3LJIIIIZZ.LIZLLL("Widget");
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(user.getNickname());
        TuxTextView tuxTextView2 = this.LLILZIL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        tuxTextView2.setText(C10EU.LIZJ(user));
        Context context = this.itemView.getContext();
        String customVerify = user.getCustomVerify();
        String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
        TuxTextView tuxTextView3 = this.LLILZIL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        C1908030zkf.LJI(context, customVerify, enterpriseVerifyReason, tuxTextView3);
        int i = 0;
        if (((Number) C296540Bjo.LIZ.getValue()).intValue() == 2 && (view = (View) this.LLIZ.getValue()) != null) {
            if (!z) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        RelationButton relationButton2 = this.LLILZLL;
        if (relationButton2 == null) {
            relationButton2 = null;
        }
        C1387050mCN c1387050mCN = new C1387050mCN(user);
        LifecycleOwner lifecycleOwner = (Fragment) this.LL.getValue();
        if (lifecycleOwner == null) {
            lifecycleOwner = (C19FO) this.LLILLJJLI.getValue();
        }
        c1387050mCN.LJIIJJI = lifecycleOwner;
        ViewModelStoreOwner viewModelStoreOwner = (Fragment) this.LL.getValue();
        if (viewModelStoreOwner == null) {
            viewModelStoreOwner = (ComponentActivity) this.LLILLJJLI.getValue();
        }
        c1387050mCN.LJIIL = viewModelStoreOwner;
        c1387050mCN.LIZIZ = true;
        c1387050mCN.LJ = EnumC1387060mCO.MESSAGE_ICE_BREAKING;
        c1387050mCN.LJIIJ = true;
        c1387050mCN.LJJIII = C296540Bjo.LIZ();
        relationButton2.LLLLZIL(c1387050mCN.LIZ());
        RelationButton relationButton3 = this.LLILZLL;
        if (relationButton3 == null) {
            relationButton3 = null;
        }
        relationButton3.setDataChangeListener(AFwS252S0000000_16.get$arr$(313));
        RelationButton relationButton4 = this.LLILZLL;
        if (relationButton4 != null) {
            relationButton = relationButton4;
        }
        relationButton.setTracker(new AwS263S0300000_19(c1074520e4I, (C1074520e4I) user, (User) this, 6));
    }
}
