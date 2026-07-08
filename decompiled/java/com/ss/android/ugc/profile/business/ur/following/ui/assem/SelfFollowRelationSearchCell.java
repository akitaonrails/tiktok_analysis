package com.ss.android.ugc.profile.business.ur.following.ui.assem;

import X.C1247000iYU;
import X.C1247270iYv;
import X.C1247350iZ3;
import X.C1247490iZH;
import X.C1247500iZI;
import X.C1253000iiA;
import X.C428150Gqb;
import X.C786410Ut5;
import X.EnumC1247010iYV;
import X.EnumC428940Grs;
import X.InterfaceC1247150iYj;
import X.InterfaceC1891350zJl;
import Y.ACListenerS122S0200000_19;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ab.SubscribeSettingsExp;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SelfFollowRelationSearchCell extends RelationSearchCell<C1247270iYv> {
    public TuxIconView LLJJ;
    public EnumC1247010iYV LLJJI;

    @Override // com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchCell
    public final String L5() {
        return "more_action_sheet_following";
    }

    @Override // com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchCell
    /* JADX INFO: renamed from: R5 */
    public final void onBindItemView(C1247270iYv c1247270iYv) {
        super.onBindItemView(c1247270iYv);
        User user = c1247270iYv.LL;
        this.LLJJI = c1247270iYv.LLILZIL;
        S5(user.getLivePushNotificationStatus());
        C428150Gqb.LIZ(this.LLJJ, EnumC428940Grs.ALPHA, 0.0f);
        TuxIconView tuxIconView = this.LLJJ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS122S0200000_19(user, this, 21));
        }
    }

    public final void S5(int i) {
        if (SubscribeSettingsExp.LIZIZ()) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    TuxIconView tuxIconView = this.LLJJ;
                    if (tuxIconView != null) {
                        tuxIconView.setIconRes(R.raw.icon_bell_slash);
                    }
                    TuxIconView tuxIconView2 = this.LLJJ;
                    if (tuxIconView2 != null) {
                        tuxIconView2.setTintColorRes(R.attr.a1k);
                        return;
                    }
                    return;
                }
                return;
            }
            TuxIconView tuxIconView3 = this.LLJJ;
            if (tuxIconView3 != null) {
                tuxIconView3.setIconRes(R.raw.icon_bell);
            }
            TuxIconView tuxIconView4 = this.LLJJ;
            if (tuxIconView4 == null) {
                return;
            }
            tuxIconView4.setTintColorRes(R.attr.a1k);
            return;
        }
        TuxIconView tuxIconView5 = this.LLJJ;
        if (tuxIconView5 != null) {
            tuxIconView5.setIconRes(R.raw.icon_bell_activation);
        }
        TuxIconView tuxIconView6 = this.LLJJ;
        if (tuxIconView6 == null) {
            return;
        }
        tuxIconView6.setTintColorRes(R.attr.a1k);
    }

    @Override // com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C1247270iYv) interfaceC1891350zJl);
    }

    @Override // com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        int i;
        View viewOnCreateItemView = super.onCreateItemView(viewGroup);
        TuxIconView tuxIconView = (TuxIconView) viewOnCreateItemView.findViewById(R.id.bv_);
        if (C1253000iiA.LIZ()) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
        this.LLJJ = tuxIconView;
        RelationButton relationButton = this.LLILZIL;
        if (relationButton != null) {
            relationButton.setRequestListener(new AwS633S0100000_19(this, 138));
        }
        return viewOnCreateItemView;
    }

    @Override // com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchCell
    public final List<InterfaceC1247150iYj> I5(User user, View view) {
        Integer numValueOf;
        int value;
        ArrayList arrayList = new ArrayList();
        Integer numValueOf2 = null;
        int value2 = 0;
        if (C1253000iiA.LIZ() && (user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || user.getFollowStatus() == 4)) {
            EnumC1247010iYV enumC1247010iYV = this.LLJJI;
            if (enumC1247010iYV != null) {
                numValueOf = Integer.valueOf(enumC1247010iYV.getValue());
            } else {
                numValueOf = null;
            }
            boolean zLIZLLL = C1247000iYU.LIZLLL(numValueOf, Integer.valueOf(user.getFollowStatus()));
            Context context = this.itemView.getContext();
            String strVQ2 = N5().vQ2();
            EnumC1247010iYV enumC1247010iYV2 = this.LLJJI;
            if (enumC1247010iYV2 != null) {
                value = enumC1247010iYV2.getValue();
            } else {
                value = 0;
            }
            arrayList.add(new C1247490iZH(user, context, strVQ2, value, zLIZLLL));
        }
        Context context2 = view.getContext();
        String enterFrom = getEnterFrom();
        EnumC1247010iYV enumC1247010iYV3 = this.LLJJI;
        if (enumC1247010iYV3 != null) {
            value2 = enumC1247010iYV3.getValue();
        }
        EnumC1247010iYV enumC1247010iYV4 = this.LLJJI;
        if (enumC1247010iYV4 != null) {
            numValueOf2 = Integer.valueOf(enumC1247010iYV4.getValue());
        }
        arrayList.add(new C1247500iZI(user, context2, enterFrom, value2, C1247000iYU.LIZLLL(numValueOf2, Integer.valueOf(user.getFollowStatus())) ? 1 : 0, new C1247350iZ3(user, this)));
        return arrayList;
    }
}
