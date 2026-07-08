package com.ss.android.ugc.profile.business.ci;

import X.C1257550ipV;
import X.C19371010qS;
import X.C19U0;
import X.C2532609wC;
import X.C268330AfP;
import android.view.View;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager.AwemePagerVM;
import com.ss.android.ugc.profile.platform.standard.vm.IAwemePagerVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileCollectionBusiness extends ProfileTabBaseBusiness {
    public View LLILLL;

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final String getName() {
        return "profile_tab_favorite";
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final boolean iI0() {
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final int pt1() {
        int i = C268330AfP.LJII() ? R.raw.icon_exp_profile_exp_icon_bookmark_eye_fill : R.raw.icon_bookmark_eye;
        int i2 = C268330AfP.LJII() ? R.raw.icon_exp_profile_exp_icon_bookmark_fill : R.raw.icon_3pt_bookmark;
        if (C2532609wC.LIZLLL()) {
            return R.raw.icon_bookmark;
        }
        IAwemePagerVM iAwemePagerVMLIZ = LIZ();
        return (iAwemePagerVMLIZ == null || !iAwemePagerVMLIZ.isMyProfile()) ? i2 : i;
    }

    public ProfileCollectionBusiness(AwemePagerVM awemePagerVM) {
        super(awemePagerVM);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oq(X.C19U0 r4) {
        /*
            r3 = this;
            boolean r0 = X.C2532609wC.LIZLLL()
            if (r0 == 0) goto L2b
            com.ss.android.ugc.profile.platform.standard.vm.IAwemePagerVM r0 = r3.LIZ()
            if (r0 == 0) goto L4b
            boolean r1 = r0.isMyProfile()
            r0 = 1
            if (r1 != r0) goto L4b
        L13:
            if (r0 == 0) goto L30
            boolean r0 = X.C268330AfP.LJII()
            if (r0 == 0) goto L2c
            r2 = 2130773810(0x7f010732, float:1.7150777E38)
        L1e:
            android.view.View r1 = r3.LLILLL
            boolean r0 = r1 instanceof X.C1257550ipV
            if (r0 == 0) goto L2b
            X.0ipV r1 = (X.C1257550ipV) r1
            if (r1 == 0) goto L2b
            r1.setImageResource(r2)
        L2b:
            return
        L2c:
            r2 = 2130773693(0x7f0106bd, float:1.715054E38)
            goto L1e
        L30:
            boolean r0 = X.C268330AfP.LJII()
            if (r0 == 0) goto L47
            r2 = 2130773811(0x7f010733, float:1.715078E38)
        L39:
            android.view.View r1 = r3.LLILLL
            boolean r0 = r1 instanceof X.C1257550ipV
            if (r0 == 0) goto L2b
            X.0ipV r1 = (X.C1257550ipV) r1
            if (r1 == 0) goto L2b
            r1.setImageResource(r2)
            return
        L47:
            r2 = 2130773692(0x7f0106bc, float:1.7150538E38)
            goto L39
        L4b:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ci.ProfileCollectionBusiness.Oq(X.19U0):void");
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void Yn(C19U0 c19u0) {
        int i;
        C1257550ipV c1257550ipV;
        if (C2532609wC.LIZLLL()) {
            if (C268330AfP.LJII()) {
                i = R.raw.icon_exp_profile_exp_icon_bookmark_fill;
            } else {
                i = R.raw.icon_exp_exp_01_icon_bookmark;
            }
            View view = this.LLILLL;
            if ((view instanceof C1257550ipV) && (c1257550ipV = (C1257550ipV) view) != null) {
                c1257550ipV.setImageResource(i);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void st2(View view) {
        C19371010qS.LIZLLL("favorite_tti_full_power_viewpager");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WQ(X.C1257950iq9 r4, int r5, android.view.View r6) {
        /*
            r3 = this;
            com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness.LIZJ(r6)
            r3.LLILLL = r6
            r0 = 13
            int r1 = X.C1216270hkv.LIZIZ(r0)
            int r0 = X.C1216270hkv.LIZIZ(r0)
            r3.LJ(r1, r0, r6)
            com.ss.android.ugc.profile.platform.standard.vm.IAwemePagerVM r0 = r3.LIZ()
            if (r0 == 0) goto L5a
            boolean r1 = r0.isMyProfile()
            r0 = 1
            if (r1 != r0) goto L5a
        L1f:
            r2 = 0
            if (r0 == 0) goto L4b
            boolean r0 = X.C268330AfP.LJII()
            if (r0 == 0) goto L47
            r0 = 2130773811(0x7f010733, float:1.715078E38)
        L2b:
            r3.LIZLLL(r0, r6)
        L2e:
            if (r6 == 0) goto L46
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L43
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L43
            r0 = 2131823313(0x7f110ad1, float:1.9279422E38)
            java.lang.String r2 = r1.getString(r0)
        L43:
            r6.setContentDescription(r2)
        L46:
            return
        L47:
            r0 = 2130774213(0x7f0108c5, float:1.7151595E38)
            goto L2b
        L4b:
            boolean r0 = r6 instanceof X.C1257530ipT
            if (r0 == 0) goto L2e
            r1 = r6
            X.0ipT r1 = (X.C1257530ipT) r1
            if (r1 == 0) goto L2e
            r0 = 8
            r1.setAdditionViewVisibility(r0)
            goto L2e
        L5a:
            r0 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ci.ProfileCollectionBusiness.WQ(X.0iq9, int, android.view.View):void");
    }
}
