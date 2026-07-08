package com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base;

import X.C01GW;
import X.C1216270hkv;
import X.C1248950ibd;
import X.C1558520qew;
import X.C452501pT;
import X.EnumC1248370iah;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public class BioBusinessBaseUIComponent<T extends BizBaseData> extends BioBaseUIComponent<T> {
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS563S0100000_19((BioBusinessBaseUIComponent) this, 2490));

    public String Ap() {
        String str = this.assemTagInternal;
        return str == null ? "" : str;
    }

    public Integer Bp() {
        Icon icon;
        T t = this.LLJJLIIIJLLLLLLLZ;
        if (t == null || (icon = t.getIcon()) == null) {
            return null;
        }
        return Icon.getIconInt$default(icon, null, null, 3, null);
    }

    public String Ep() {
        Describe describe;
        T t = this.LLJJLIIIJLLLLLLLZ;
        if (t == null || (describe = t.getDescribe()) == null) {
            return null;
        }
        return describe.getText();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void Oo() {
        ProfileComponents profileComponents;
        List<Action> list;
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (list = profileComponents.actions) == null || list.isEmpty()) {
            return;
        }
        for (Action action : list) {
            if (Intrinsics.LJFF(action.getType(), "router")) {
                Action.RouterInfo router = action.getRouter();
                String url = router != null ? router.getUrl() : null;
                Context context = getContext();
                if (url != null && !a0.LJJJIL(url) && context != null) {
                    SmartRouter.buildRoute(context, url).open();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void tp() {
        String strEp;
        ProfileCommonInfo profileCommonInfoVo;
        UserRelationInfo userRelationInfo;
        TextView textView;
        Describe describe;
        Icon icon;
        Integer iconInt$default;
        View view;
        TuxIconView tuxIconView;
        T t = this.LLJJLIIIJLLLLLLLZ;
        if (t != null && (icon = t.getIcon()) != null && (iconInt$default = Icon.getIconInt$default(icon, null, Bp(), 1, null)) != null && (view = this.LLJJ) != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.c1r)) != null) {
            tuxIconView.setIconRes(iconInt$default.intValue());
        }
        T t2 = this.LLJJLIIIJLLLLLLLZ;
        if (t2 == null || (describe = t2.getDescribe()) == null || (strEp = describe.getText()) == null) {
            strEp = Ep();
        }
        View view2 = this.LLJJ;
        if (view2 != null && (textView = (TextView) view2.findViewById(R.id.c1s)) != null) {
            if (strEp == null) {
                strEp = "";
            }
            textView.setText(strEp);
        }
        EnumC1248370iah enumC1248370iah = EnumC1248370iah.BIO;
        String strAp = Ap();
        View view3 = this.LLJJ;
        lp(enumC1248370iah, strAp, (view3 == null || !C1216270hkv.LIZLLL(view3) || (profileCommonInfoVo = Vo()) == null || (userRelationInfo = profileCommonInfoVo.getUserRelationInfo()) == null || !Intrinsics.LJFF(userRelationInfo.isBlocking(), Boolean.FALSE)) ? false : true);
    }

    public Function0<Unit> zp() {
        return AFwS207S0000000_19.get$arr$(550);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void Go() {
        ProfilePlatformViewModel profilePlatformViewModelYp = yp();
        if (profilePlatformViewModelYp != null) {
            profilePlatformViewModelYp.FQ2(new AwS598S0100000_19((BioBusinessBaseUIComponent) this, 479));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IBioBAAbility iBioBAAbility = (IBioBAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IBioBAAbility.class, null);
        if (iBioBAAbility != null) {
            iBioBAAbility.bI0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0143  */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig r18) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent.So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig):android.view.View");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent
    public void up(View view) {
        IBioBAAbility iBioBAAbility;
        if (view != null && (iBioBAAbility = (IBioBAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IBioBAAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iBioBAAbility.LJIIIZ(this.LLJILLL, view, str);
        }
    }
}
