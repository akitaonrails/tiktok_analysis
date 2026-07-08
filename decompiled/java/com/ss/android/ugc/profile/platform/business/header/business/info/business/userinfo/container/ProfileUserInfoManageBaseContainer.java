package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container;

import X.C1248300iaa;
import X.C1248950ibd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19ME;
import X.C2537109wv;
import X.C268330AfP;
import X.C426750GoL;
import X.C724240Sb0;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.ability.IHeaderUserBasicInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.IHeaderRelationInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IAccountNameUserInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IUserInfoManageAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.ProfileUserInfoManageBaseComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileUserInfoManageBaseContainer extends HeaderBaseContainerComponent implements IUserInfoManageAbility {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1248950ibd c1248950ibdMp = mp();
        dp((c1248950ibdMp == null || (profileComponents = c1248950ibdMp.LLILLJJLI) == null) ? null : profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void cp() {
        IHeaderUserBasicInfoAbility iHeaderUserBasicInfoAbility;
        if (C268330AfP.LJIIJ()) {
            ViewGroup viewGroup = this.LLJJIJIIJIL;
            if (viewGroup != null) {
                IHeaderUserBasicInfoAbility iHeaderUserBasicInfoAbility2 = (IHeaderUserBasicInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderUserBasicInfoAbility.class, null);
                if (iHeaderUserBasicInfoAbility2 != null) {
                    String str = this.assemTagInternal;
                    String str2 = str != null ? str : "";
                    C1248950ibd c1248950ibdMp = mp();
                    iHeaderUserBasicInfoAbility2.LJIIIZ(c1248950ibdMp != null ? c1248950ibdMp.LL : -1, viewGroup, str2);
                }
                if (!this.LLJILLL || (iHeaderUserBasicInfoAbility = (IHeaderUserBasicInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderUserBasicInfoAbility.class, null)) == null) {
                    return;
                }
                iHeaderUserBasicInfoAbility.oy2();
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LLJJIJIIJIL;
        if (viewGroup2 != null) {
            if (!C2537109wv.LJII()) {
                IAccountNameUserInfoAbility iAccountNameUserInfoAbility = (IAccountNameUserInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IAccountNameUserInfoAbility.class, null);
                if (iAccountNameUserInfoAbility != null) {
                    String str3 = this.assemTagInternal;
                    iAccountNameUserInfoAbility.cg(viewGroup2, this.LLJJ, str3 != null ? str3 : "", false);
                    return;
                }
                return;
            }
            IHeaderRelationInfoAbility iHeaderRelationInfoAbility = (IHeaderRelationInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderRelationInfoAbility.class, null);
            if (iHeaderRelationInfoAbility != null) {
                String str4 = this.assemTagInternal;
                iHeaderRelationInfoAbility.LJIIIZ(this.LLJJ, viewGroup2, str4 != null ? str4 : "");
                return;
            }
            IAccountNameUserInfoAbility iAccountNameUserInfoAbility2 = (IAccountNameUserInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IAccountNameUserInfoAbility.class, null);
            if (iAccountNameUserInfoAbility2 != null) {
                String str5 = this.assemTagInternal;
                iAccountNameUserInfoAbility2.cg(viewGroup2, this.LLJJ, str5 != null ? str5 : "", false);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IUserInfoManageAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IUserInfoManageAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        LinearLayout linearLayout;
        Context context = getContext();
        if (context != null) {
            linearLayout = new LinearLayout(context);
            linearLayout.setTag("profile_user_info_manager_base_container");
            linearLayout.setId(R.id.s7c);
            if (C268330AfP.LJIIJ()) {
                int i = ProfileUserInfoManageBaseComponent.LLJLIL;
                C19ME c19me = new C19ME(C1248300iaa.LIZIZ(), -2);
                c19me.topToTop = R.id.s25;
                c19me.bottomToBottom = R.id.s25;
                c19me.endToEnd = 0;
                C786410Ut5.d6(linearLayout, c19me);
            } else {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                linearLayout.setOrientation(0);
                layoutParams.gravity = 16;
                Context context2 = linearLayout.getContext();
                int i2 = ProfileUserInfoManageBaseComponent.LLJLIL;
                C426750GoL.LJIIIIZZ(layoutParams, context2, Integer.valueOf(C1248300iaa.LIZ()), 0, 0, 0, true);
                C786410Ut5.d6(linearLayout, layoutParams);
            }
        } else {
            linearLayout = null;
        }
        this.LLJJIJIIJIL = linearLayout;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IUserInfoManageAbility
    public final void LJIIIZ(int i, View view, String str) {
        HeaderBaseContainerComponent.bp(this, str, i, view, null, null, false, 56);
    }
}
