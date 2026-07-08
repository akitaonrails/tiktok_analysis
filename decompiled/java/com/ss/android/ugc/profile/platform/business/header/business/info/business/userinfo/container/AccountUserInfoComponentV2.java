package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container;

import X.C01GW;
import X.C1247810iZn;
import X.C1248870ibV;
import X.C1248950ibd;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountLabelInfoComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.CommonInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IAccountUserInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IHeaderAccountInfoAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountUserInfoComponentV2 extends HeaderBaseContainerComponent implements IAccountUserInfoAbility, InterfaceC487330J9f {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2528));

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("user_info_base_item", C13LE.LIZ(CommonInfoBaseUIComponent.class), null, -1, false);
        Ho("user_account_base_item", C13LE.LIZ(AccountLabelInfoComponent.class), null, -1, false);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void cp() {
        IHeaderAccountInfoAbility iHeaderAccountInfoAbility;
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup == null || (iHeaderAccountInfoAbility = (IHeaderAccountInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAccountInfoAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderAccountInfoAbility.LJIIIZ(this.LLJJ, viewGroup, str);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1248950ibd c1248950ibdMp = mp();
        dp((c1248950ibdMp == null || (profileComponents = c1248950ibdMp.LLILLJJLI) == null) ? null : profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IAccountUserInfoAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IAccountUserInfoAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        if (linearLayout.getContext() != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.LLJJLIIIJLLLLLLLZ.getValue().getClass();
            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            linearLayout.setOrientation(0);
            C786410Ut5.d6(linearLayout, layoutParams);
            C1248870ibV.LIZJ(linearLayout, profileComponentUIConfig, true, false);
            C19252910Tv.LIZIZ.LIZLLL().LJI().LLJJIJI(linearLayout, linearLayout.getContext(), null, null);
        }
        this.LLJJIJIIJIL = linearLayout;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IAccountUserInfoAbility
    public final void LJIIIZ(int i, View view, String str) {
        int i2;
        int i3;
        HeaderBaseContainerComponent.bp(this, str, i, view, null, null, false, 56);
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            i2 = 0;
            i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                if (viewGroup.getChildAt(i4) instanceof TuxIconView) {
                    i3++;
                } else {
                    i2++;
                }
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        ViewGroup viewGroup2 = this.LLJJIJIIJIL;
        if (viewGroup2 != null) {
            int childCount2 = viewGroup2.getChildCount();
            for (int i5 = 0; i5 < childCount2; i5++) {
                View childAt = viewGroup2.getChildAt(i5);
                if (Intrinsics.LJFF(childAt.getTag(R.id.s2_), Boolean.TRUE) && (childAt instanceof TuxTextView)) {
                    Context context = getContext();
                    if (context != null) {
                        int iLIZ = C1247810iZn.LIZ(i3, i2, context);
                        TextView textView = (TextView) childAt;
                        if (textView.getMaxWidth() != iLIZ) {
                            textView.setMaxWidth(iLIZ);
                            int i6 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("resetViewWidth, maxWidth = ");
                            sbLIZ.append(iLIZ);
                            sbLIZ.append(", textViewCount = ");
                            sbLIZ.append(i2);
                            sbLIZ.append(", iconCount = ");
                            sbLIZ.append(i3);
                            C2188811AlT.LIZIZ(sbLIZ);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
