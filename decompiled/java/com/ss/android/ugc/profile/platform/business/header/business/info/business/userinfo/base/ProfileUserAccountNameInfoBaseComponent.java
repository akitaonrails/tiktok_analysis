package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base;

import X.C01GW;
import X.C09YG;
import X.C1248230iaT;
import X.C1248270iaX;
import X.C1248840ibS;
import X.C1248950ibd;
import X.C1250210idf;
import X.C1558520qew;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C268330AfP;
import X.C300150Bpd;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1248260iaW;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUIData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileUserAccountNameInfoBaseComponent<T extends BizBaseData> extends BaseUIComponent {
    public T LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS563S0100000_19((ProfileUserAccountNameInfoBaseComponent) this, 2525));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS563S0100000_19((ProfileUserAccountNameInfoBaseComponent) this, 2524));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS563S0100000_19((ProfileUserAccountNameInfoBaseComponent) this, 2526));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Ho() {
        ProfileComponents profileComponents;
        List<EventParams> list;
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd != null && (profileComponents = c1248950ibd.LLILLJJLI) != null && (list = profileComponents.eventParams) != null) {
            C1248840ibS.LIZ(C1248840ibS.LIZ, C09YG.TYPE_SHOW.getType(), list, new AwS668S0100000_19(this, 27), 4);
        }
        zp(null, true);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        IAccountNameUserInfoAbility iAccountNameUserInfoAbility;
        View view = this.LLJJ;
        if (view == null || (iAccountNameUserInfoAbility = (IAccountNameUserInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IAccountNameUserInfoAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        C1248950ibd c1248950ibd = (C1248950ibd) this.LLJJL.getValue();
        iAccountNameUserInfoAbility.cg(view, c1248950ibd != null ? c1248950ibd.LL : -1, str, true);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        ProfileComponents profileComponents;
        List<EventParams> list;
        ProfileComponents profileComponents2;
        List<Action> list2;
        C1248950ibd c1248950ibd = (C1248950ibd) this.LLJJL.getValue();
        if (c1248950ibd != null && (profileComponents2 = c1248950ibd.LLILLJJLI) != null && (list2 = profileComponents2.actions) != null) {
            for (Action action : list2) {
                if (Intrinsics.LJFF(action.getType(), "router")) {
                    Context context = getContext();
                    Action.RouterInfo router = action.getRouter();
                    SmartRouter.buildRoute(context, router != null ? router.getUrl() : null).open();
                }
            }
        }
        C1248950ibd c1248950ibd2 = this.LLJJI;
        if (c1248950ibd2 == null || (profileComponents = c1248950ibd2.LLILLJJLI) == null || (list = profileComponents.eventParams) == null) {
            return;
        }
        C1248840ibS.LIZ(C1248840ibS.LIZ, C09YG.TYPE_CLICK.getType(), list, new AwS668S0100000_19(this, 28), 4);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        View view = this.LLJJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        String str;
        T t;
        Integer numValueOf;
        EnumC1248260iaW enumC1248260iaWLJJIIZI;
        Describe describe;
        String text;
        TuxTextView tuxTextView;
        Describe describe2;
        String text2;
        TuxIconView tuxIconView;
        ProfileComponents profileComponents;
        ProfileUIData profileUIData;
        Describe describe3;
        ProfileComponents profileComponents2;
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp;
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp2 = ap();
        boolean z = true;
        if (!(profilePlatformProtocolAp2 != null && profilePlatformProtocolAp2.LJJJZ()) && (profilePlatformProtocolAp = ap()) != null && Boolean.valueOf(profilePlatformProtocolAp.LJJJZ()) != null) {
            z = false;
        }
        op(Boolean.valueOf(z));
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd == null || (profileComponents2 = c1248950ibd.LLILLJJLI) == null || (str = profileComponents2.componentId) == null) {
            str = this.LLJILJIL;
        }
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp3 = ap();
        zp((((profilePlatformProtocolAp3 == null || (t = profilePlatformProtocolAp3.LLJILJIL) == null) && (t = this.LLJJLIIIJLLLLLLLZ) == null) || (describe3 = t.getDescribe()) == null) ? null : describe3.getText(), false);
        C1248950ibd c1248950ibd2 = this.LLJJI;
        if (c1248950ibd2 == null || (profileComponents = c1248950ibd2.LLILLJJLI) == null || (profileUIData = profileComponents.uiData) == null || (numValueOf = profileUIData.type) == null) {
            ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp4 = ap();
            numValueOf = (profilePlatformProtocolAp4 == null || (enumC1248260iaWLJJIIZI = profilePlatformProtocolAp4.LJJIIZI()) == null) ? null : Integer.valueOf(enumC1248260iaWLJJIIZI.getType());
        }
        int type = EnumC1248260iaW.ICON.getType();
        if (numValueOf != null && numValueOf.intValue() == type) {
            View view = this.LLJJ;
            if (!(view instanceof TuxIconView) || (tuxIconView = (TuxIconView) view) == null) {
                return;
            }
            C1248270iaX.LIZ(tuxIconView, t, str, null, null, null);
            return;
        }
        int type2 = EnumC1248260iaW.TEXT.getType();
        if (numValueOf != null && numValueOf.intValue() == type2) {
            View view2 = this.LLJJ;
            if (!(view2 instanceof TuxTextView) || (tuxTextView = (TuxTextView) view2) == null) {
                return;
            }
            C1248270iaX.LIZJ(tuxTextView, t, str, null, null, false, 28);
            if (t == null || (describe2 = t.getDescribe()) == null || (text2 = describe2.getText()) == null) {
                return;
            }
            tuxTextView.setText(text2);
            return;
        }
        int type3 = EnumC1248260iaW.ICON_TEXT.getType();
        if (numValueOf == null || numValueOf.intValue() != type3) {
            return;
        }
        View view3 = this.LLJJ;
        if (!(view3 instanceof ViewGroup) || view3 == null) {
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) view3.findViewById(R.id.s2e);
        if (tuxTextView2 != null) {
            C1248270iaX.LIZJ(tuxTextView2, t, str, null, null, false, 28);
            if (t != null && (describe = t.getDescribe()) != null && (text = describe.getText()) != null) {
                tuxTextView2.setText(text);
            }
        }
        TuxIconView tuxIconView2 = (TuxIconView) view3.findViewById(R.id.s2d);
        if (tuxIconView2 != null) {
            C1248270iaX.LIZ(tuxIconView2, t, str, null, null, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        String string;
        super.Hj(profileComponents);
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            ep(nVar);
            n nVar2 = profileComponents.bizData;
            if (nVar2 != null) {
                string = nVar2.toString();
            } else {
                string = null;
            }
            if (Intrinsics.LJFF(string, this.LLJL)) {
                return;
            }
            this.LLJL = string;
            tp();
            this.LLJL = nVar.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig r16) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.ProfileUserAccountNameInfoBaseComponent.So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig):android.view.View");
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C1250210idf.LIZ(nVar.toString(), BizBaseData.class);
    }

    public final void up(View view) {
        int iIntValue;
        int iIntValue2;
        int i;
        Integer numLJJIJIIJIL;
        Integer numLJJIL;
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
        if (profilePlatformProtocolAp != null && (numLJJIL = profilePlatformProtocolAp.LJJIL()) != null) {
            iIntValue = numLJJIL.intValue();
        } else {
            iIntValue = ((Number) this.LLJLILLLLZIIL.getValue()).intValue();
        }
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp2 = ap();
        if (profilePlatformProtocolAp2 != null && (numLJJIJIIJIL = profilePlatformProtocolAp2.LJJIJIIJIL()) != null) {
            iIntValue2 = numLJJIJIIJIL.intValue();
        } else {
            iIntValue2 = ((Number) this.LLJLILLLLZIIL.getValue()).intValue();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iIntValue, iIntValue2);
        this.LLJLIL.getValue().getClass();
        if (C1248230iaT.LJIILLIIL() > 0) {
            this.LLJLIL.getValue().getClass();
            layoutParams.setMarginEnd(C1248230iaT.LJIILLIIL());
        }
        if (C268330AfP.LIZLLL()) {
            i = 8388627;
        } else {
            i = 17;
        }
        layoutParams.gravity = i;
        if (view != null) {
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public final void yp(View view) {
        int i;
        TextView textView;
        TextUtils.TruncateAt truncateAtLJJJJ;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23)));
        if (view != null) {
            view.setId(R.id.s2e);
        }
        int i2 = 8388627;
        if (C268330AfP.LIZLLL()) {
            i = 8388627;
        } else {
            i = 17;
        }
        layoutParams.gravity = i;
        if (view != null) {
            C786410Ut5.W5(view, layoutParams);
        }
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            ap();
            textView.setSingleLine(true);
            if (!C268330AfP.LIZLLL()) {
                i2 = 17;
            }
            textView.setGravity(i2);
            ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
            if (profilePlatformProtocolAp == null || (truncateAtLJJJJ = profilePlatformProtocolAp.LJJJJ()) == null) {
                truncateAtLJJJJ = TextUtils.TruncateAt.END;
            }
            textView.setEllipsize(truncateAtLJJJJ);
        }
    }

    public final void zp(String str, boolean z) {
        Integer numValueOf;
        EnumC1248260iaW enumC1248260iaWLJJIIZI;
        ProfileComponents profileComponents;
        ProfileUIData profileUIData;
        if (C300150Bpd.LIZ() && !this.LLJJIII) {
            C1248950ibd c1248950ibd = this.LLJJI;
            Drawable drawable = null;
            if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (profileUIData = profileComponents.uiData) == null || (numValueOf = profileUIData.type) == null) {
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
                if (profilePlatformProtocolAp != null && (enumC1248260iaWLJJIIZI = profilePlatformProtocolAp.LJJIIZI()) != null) {
                    numValueOf = Integer.valueOf(enumC1248260iaWLJJIIZI.getType());
                } else {
                    numValueOf = null;
                }
            }
            int type = EnumC1248260iaW.ICON.getType();
            if (numValueOf != null && type == numValueOf.intValue()) {
                return;
            }
            if (z) {
                View view = this.LLJJ;
                if (view != null) {
                    view.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)));
                }
                View view2 = this.LLJJ;
                if (view2 != null) {
                    Context context = getContext();
                    if (context != null) {
                        drawable = context.getDrawable(R.drawable.czr);
                    }
                    view2.setForeground(drawable);
                    return;
                }
                return;
            }
            View view3 = this.LLJJ;
            if (view3 != null && view3.getForeground() != null && !TextUtils.isEmpty(str)) {
                View view4 = this.LLJJ;
                if (view4 != null) {
                    view4.setMinimumWidth(0);
                }
                View view5 = this.LLJJ;
                if (view5 != null) {
                    view5.setForeground(null);
                }
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerUserInfoPlaceHolder, nameInfo = ");
            sbLIZ.append(this.assemTagInternal);
            sbLIZ.append(", info = ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
