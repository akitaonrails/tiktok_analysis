package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base;

import X.C01GW;
import X.C09YG;
import X.C0C38;
import X.C0H1U;
import X.C0OBG;
import X.C1248270iaX;
import X.C1248840ibS;
import X.C1248950ibd;
import X.C1250210idf;
import X.C1388190mED;
import X.C1558520qew;
import X.C19252910Tv;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2537109wv;
import X.C268330AfP;
import X.C300150Bpd;
import X.C418440Gaw;
import X.C452501pT;
import X.C487280J9a;
import X.C736460Sui;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1248260iaW;
import X.InterfaceC1249220ic4;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
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
import com.ss.android.ugc.profile.business.profile.ui.v2.MyProfileAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUIData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public class AccountInfoBaseUIComponent<T extends BizBaseData> extends BaseUIComponent implements InterfaceC487330J9f {
    public T LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS563S0100000_19((AccountInfoBaseUIComponent) this, 2521));
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(562));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void Jo() {
        IHeaderAccountInfoAbility iHeaderAccountInfoAbility;
        View view = this.LLJJ;
        if (view == null || (iHeaderAccountInfoAbility = (IHeaderAccountInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAccountInfoAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        C1248950ibd c1248950ibd = (C1248950ibd) this.LLJJL.getValue();
        iHeaderAccountInfoAbility.LJIIIZ(c1248950ibd != null ? c1248950ibd.LL : -1, view, str);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        C1248950ibd c1248950ibd;
        ProfileComponents profileComponents;
        List<EventParams> list;
        ProfileComponents profileComponents2;
        List<Action> list2;
        if (C0OBG.LIZIZ(this.LLJJ)) {
            return;
        }
        C1248950ibd c1248950ibd2 = (C1248950ibd) this.LLJJL.getValue();
        if (c1248950ibd2 != null && (profileComponents2 = c1248950ibd2.LLILLJJLI) != null && (list2 = profileComponents2.actions) != null) {
            for (Action action : list2) {
                if (Intrinsics.LJFF(action.getType(), "router")) {
                    Context context = getContext();
                    Action.RouterInfo router = action.getRouter();
                    SmartRouter.buildRoute(context, router != null ? router.getUrl() : null).open();
                }
            }
        }
        if (!cp() || (c1248950ibd = this.LLJJI) == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (list = profileComponents.eventParams) == null) {
            return;
        }
        C1248840ibS.LIZ(C1248840ibS.LIZ, C09YG.TYPE_CLICK.getType(), list, new AwS668S0100000_19(this, 24), 4);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Ho() {
        ProfileComponents profileComponents;
        List<EventParams> list;
        if (cp()) {
            C1248950ibd c1248950ibd = this.LLJJI;
            if (c1248950ibd != null && (profileComponents = c1248950ibd.LLILLJJLI) != null && (list = profileComponents.eventParams) != null) {
                C1248840ibS.LIZ(C1248840ibS.LIZ, C09YG.TYPE_SHOW.getType(), list, new AwS668S0100000_19(this, 23), 4);
            }
            zp(null, true);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void bp() {
        super.bp();
        MyProfileAbility myProfileAbility = (MyProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MyProfileAbility.class, null);
        if (myProfileAbility != null) {
            myProfileAbility.Om();
        }
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
        if (profilePlatformProtocolAp != null) {
            profilePlatformProtocolAp.LLJJIJI = new AwS598S0100000_19((AccountInfoBaseUIComponent) this, 485);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Context context;
        Activity activityLIZ;
        super.onCreate();
        if (!C19252910Tv.LIZIZ.LIZLLL().LJI().LJI() || (context = getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        C487280J9a.LIZ(activityLIZ.hashCode(), this);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        View view = this.LLJJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        T t;
        Icon icon;
        Describe describe;
        String text;
        TextView textView;
        Describe describe2;
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp;
        String str;
        T t2;
        Integer numValueOf;
        EnumC1248260iaW enumC1248260iaWLJJIIZI;
        Describe describe3;
        String text2;
        StringBuilder sbLIZ;
        TuxTextView tuxTextView;
        Describe describe4;
        String text3;
        TuxIconView tuxIconView;
        ProfileComponents profileComponents;
        ProfileUIData profileUIData;
        Describe describe5;
        ProfileComponents profileComponents2;
        if (!cp()) {
            if (this.LLJJ instanceof LinearLayout) {
                T t3 = this.LLJJLIIIJLLLLLLLZ;
                if (t3 != null && (describe2 = t3.getDescribe()) != null) {
                    text = describe2.getText();
                }
                zp(text, false);
                T t4 = this.LLJJLIIIJLLLLLLLZ;
                if (t4 != null && (describe = t4.getDescribe()) != null && (text = describe.getText()) != null && (textView = (TextView) this.LLJJ.findViewById(R.id.s0b)) != null) {
                    textView.setText(text);
                }
                TuxIconView tuxIconView2 = (TuxIconView) this.LLJJ.findViewById(R.id.s0a);
                if (tuxIconView2 == null || (t = this.LLJJLIIIJLLLLLLLZ) == null || (icon = t.getIcon()) == null) {
                    return;
                }
                Icon.setIconToImageView$default(icon, tuxIconView2, null, null, null, null, null, false, null, 254, null);
                return;
            }
            return;
        }
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp2 = ap();
        op(Boolean.valueOf((profilePlatformProtocolAp2 != null && profilePlatformProtocolAp2.LJJJZ()) || (profilePlatformProtocolAp = ap()) == null || Boolean.valueOf(profilePlatformProtocolAp.LJJJZ()) == null));
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp3 = ap();
        if (profilePlatformProtocolAp3 == null || !profilePlatformProtocolAp3.LJJLIIIJILLIZJL()) {
            C1248950ibd c1248950ibd = this.LLJJI;
            if (c1248950ibd == null || (profileComponents2 = c1248950ibd.LLILLJJLI) == null || (str = profileComponents2.componentId) == null) {
                str = this.LLJILJIL;
            }
            ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp4 = ap();
            if (profilePlatformProtocolAp4 == null || (t2 = profilePlatformProtocolAp4.LLJILJIL) == null) {
                t2 = this.LLJJLIIIJLLLLLLLZ;
            }
            zp((t2 == null || (describe5 = t2.getDescribe()) == null) ? null : describe5.getText(), false);
            C1248950ibd c1248950ibd2 = this.LLJJI;
            if (c1248950ibd2 == null || (profileComponents = c1248950ibd2.LLILLJJLI) == null || (profileUIData = profileComponents.uiData) == null || (numValueOf = profileUIData.type) == null) {
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp5 = ap();
                numValueOf = (profilePlatformProtocolAp5 == null || (enumC1248260iaWLJJIIZI = profilePlatformProtocolAp5.LJJIIZI()) == null) ? null : Integer.valueOf(enumC1248260iaWLJJIIZI.getType());
            }
            int type = EnumC1248260iaW.ICON.getType();
            if (numValueOf != null && numValueOf.intValue() == type) {
                View view = this.LLJJ;
                if (!(view instanceof TuxIconView) || (tuxIconView = (TuxIconView) view) == null) {
                    return;
                }
                C1248270iaX.LIZ(tuxIconView, t2, str, null, null, null);
                return;
            }
            int type2 = EnumC1248260iaW.TEXT.getType();
            if (numValueOf != null && numValueOf.intValue() == type2) {
                View view2 = this.LLJJ;
                if (!(view2 instanceof TuxTextView) || (tuxTextView = (TuxTextView) view2) == null) {
                    return;
                }
                C1248270iaX.LIZJ(tuxTextView, t2, str, null, null, false, 28);
                if (t2 == null || (describe4 = t2.getDescribe()) == null || (text3 = describe4.getText()) == null) {
                    return;
                }
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp6 = ap();
                String strLJJJJJL = profilePlatformProtocolAp6 != null ? profilePlatformProtocolAp6.LJJJJJL() : null;
                if (text3.length() > 0 && C736460Sui.LIZIZ(strLJJJJJL)) {
                    boolean z = tuxTextView.getLayoutDirection() == 1;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    if (z) {
                        sbLIZ2.append(text3);
                        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp7 = ap();
                        sbLIZ2.append(profilePlatformProtocolAp7 != null ? profilePlatformProtocolAp7.LJJJJJL() : null);
                    } else {
                        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp8 = ap();
                        sbLIZ2.append(profilePlatformProtocolAp8 != null ? profilePlatformProtocolAp8.LJJJJJL() : null);
                        sbLIZ2.append(text3);
                    }
                    text3 = C2188811AlT.LIZIZ(sbLIZ2);
                }
                tuxTextView.setText(text3);
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
            TuxTextView tuxTextView2 = (TuxTextView) view3.findViewById(R.id.s0b);
            if (tuxTextView2 != null) {
                C1248270iaX.LIZJ(tuxTextView2, t2, str, null, null, false, 28);
                if (t2 != null && (describe3 = t2.getDescribe()) != null && (text2 = describe3.getText()) != null) {
                    ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp9 = ap();
                    String strLJJJJJL2 = profilePlatformProtocolAp9 != null ? profilePlatformProtocolAp9.LJJJJJL() : null;
                    if (text2.length() > 0 && C736460Sui.LIZIZ(strLJJJJJL2)) {
                        if (tuxTextView2.getLayoutDirection() == 1) {
                            sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(text2);
                            ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp10 = ap();
                            sbLIZ.append(profilePlatformProtocolAp10 != null ? profilePlatformProtocolAp10.LJJJJJL() : null);
                        } else {
                            sbLIZ = C2188811AlT.LIZ();
                            ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp11 = ap();
                            sbLIZ.append(profilePlatformProtocolAp11 != null ? profilePlatformProtocolAp11.LJJJJJL() : null);
                            sbLIZ.append(text2);
                        }
                        text2 = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    tuxTextView2.setText(text2);
                }
            }
            TuxIconView tuxIconView3 = (TuxIconView) view3.findViewById(R.id.s0a);
            if (tuxIconView3 != null) {
                C1248270iaX.LIZ(tuxIconView3, t2, str, null, null, null);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        String string;
        if (cp()) {
            super.Hj(profileComponents);
        }
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            ep(nVar);
            if (cp()) {
                n nVar2 = profileComponents.bizData;
                if (nVar2 != null) {
                    string = nVar2.toString();
                } else {
                    string = null;
                }
                if (Intrinsics.LJFF(string, this.LLJL)) {
                    return;
                } else {
                    this.LLJL = string;
                }
            }
            tp();
            this.LLJL = nVar.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00eb  */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig r18) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent.So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig):android.view.View");
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C1250210idf.LIZ(nVar.toString(), BizBaseData.class);
    }

    public final void up(View view) {
        int iIntValue;
        int iIntValue2;
        Integer numLJJIJIIJIL;
        Integer numLJJIL;
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
        if (profilePlatformProtocolAp != null && (numLJJIL = profilePlatformProtocolAp.LJJIL()) != null) {
            iIntValue = numLJJIL.intValue();
        } else {
            iIntValue = ((Number) this.LLJLIL.getValue()).intValue();
        }
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp2 = ap();
        if (profilePlatformProtocolAp2 != null && (numLJJIJIIJIL = profilePlatformProtocolAp2.LJJIJIIJIL()) != null) {
            iIntValue2 = numLJJIJIIJIL.intValue();
        } else {
            iIntValue2 = ((Number) this.LLJLIL.getValue()).intValue();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iIntValue, iIntValue2);
        if (view != null) {
            view.setId(R.id.s0a);
        }
        layoutParams.gravity = 17;
        if (C268330AfP.LJIIJ()) {
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        }
        if (view != null) {
            C786410Ut5.W5(view, layoutParams);
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        View viewFindViewById;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        InterfaceC1249220ic4 interfaceC1249220ic4LJI = c19252910Tv.LIZLLL().LJI();
        View view = this.LLJJ;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.s0b);
        } else {
            viewFindViewById = null;
        }
        interfaceC1249220ic4LJI.LLIZLLLIL(viewFindViewById, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation), Boolean.TRUE);
        c19252910Tv.LIZLLL().LJI().LLIZLLLIL(this.LLJJ, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation), Boolean.FALSE);
    }

    public final void yp(int i, View view) {
        int iLIZIZ;
        int i2;
        TextView textView;
        TextUtils.TruncateAt truncateAtLJJJJ;
        if (C268330AfP.LJIIJ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        } else if (C0C38.LIZ()) {
            iLIZIZ = -2;
        } else if (C2537109wv.LJI()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, iLIZIZ);
        if (view != null) {
            view.setId(R.id.s0b);
        }
        int i3 = 8388627;
        if (C268330AfP.LJIIJ()) {
            i2 = 8388627;
        } else {
            i2 = 17;
        }
        layoutParams.gravity = i2;
        if (view != null) {
            C786410Ut5.W5(view, layoutParams);
        }
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            ap();
            textView.setSingleLine(true);
            ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
            if (profilePlatformProtocolAp == null || (truncateAtLJJJJ = profilePlatformProtocolAp.LJJJJ()) == null) {
                truncateAtLJJJJ = TextUtils.TruncateAt.END;
            }
            textView.setEllipsize(truncateAtLJJJJ);
            if (!C268330AfP.LJIIJ()) {
                i3 = 17;
            }
            textView.setGravity(i3);
            C0H1U.LJIIIIZZ(i, textView);
            C0H1U.LJIIIZ(i, textView);
        }
        C19252910Tv.LIZIZ.LIZLLL().LJI().LLIZLLLIL(view, null, null, Boolean.TRUE);
    }

    public final void zp(String str, boolean z) {
        Integer numValueOf;
        EnumC1248260iaW enumC1248260iaWLJJIIZI;
        String strLJLJJLL;
        Object parent;
        View view;
        Object parent2;
        View view2;
        Object parent3;
        View view3;
        ProfileComponents profileComponents;
        ProfileUIData profileUIData;
        if (!this.LLJJIII && C300150Bpd.LIZ() && "user_account_user_name".equals(this.assemTagInternal)) {
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
                View view4 = this.LLJJ;
                if (view4 != null) {
                    view4.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180)));
                }
                View view5 = this.LLJJ;
                if (view5 != null) {
                    parent3 = view5.getParent();
                } else {
                    parent3 = null;
                }
                if ((parent3 instanceof ViewGroup) && (view3 = (View) parent3) != null) {
                    Context context = getContext();
                    if (context != null) {
                        drawable = context.getDrawable(R.drawable.czr);
                    }
                    view3.setForeground(drawable);
                    return;
                }
                return;
            }
            if (str != null) {
                strLJLJJLL = a0.LJLJJLL(str, '@');
            } else {
                strLJLJJLL = null;
            }
            View view6 = this.LLJJ;
            if (view6 != null) {
                parent = view6.getParent();
            } else {
                parent = null;
            }
            if ((parent instanceof ViewGroup) && (view = (View) parent) != null && view.getForeground() != null && !TextUtils.isEmpty(strLJLJJLL)) {
                View view7 = this.LLJJ;
                if (view7 != null) {
                    view7.setMinimumWidth(0);
                }
                View view8 = this.LLJJ;
                if (view8 != null) {
                    parent2 = view8.getParent();
                } else {
                    parent2 = null;
                }
                if ((parent2 instanceof ViewGroup) && (view2 = (View) parent2) != null) {
                    view2.setForeground(null);
                }
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerUserInfoPlaceHolder, nameInfo = ");
            sbLIZ.append(this.assemTagInternal);
            sbLIZ.append(", info = ");
            sbLIZ.append(strLJLJJLL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
