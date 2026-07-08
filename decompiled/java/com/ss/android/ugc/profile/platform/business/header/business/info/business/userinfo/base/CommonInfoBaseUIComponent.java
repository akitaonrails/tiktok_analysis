package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C041J;
import X.C09YG;
import X.C0OBG;
import X.C1248230iaT;
import X.C1248270iaX;
import X.C1248840ibS;
import X.C1248950ibd;
import X.C1250210idf;
import X.C1558520qew;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2532609wC;
import X.C300150Bpd;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1248260iaW;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
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
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public class CommonInfoBaseUIComponent<T extends BizBaseData> extends BaseUIComponent implements InterfaceC487330J9f {
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS563S0100000_19((CommonInfoBaseUIComponent) this, 2523));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19((CommonInfoBaseUIComponent) this, 2522));
    public T LLJL;
    public String LLJLIL;

    public Integer Ep() {
        return null;
    }

    public CharSequence Fp() {
        return null;
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
    }

    public final C1248230iaT Ap() {
        return (C1248230iaT) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C1248950ibd Bp() {
        return (C1248950ibd) this.LLJJL.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Ho() {
        ProfileComponents profileComponents;
        List<EventParams> list;
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd != null && (profileComponents = c1248950ibd.LLILLJJLI) != null && (list = profileComponents.eventParams) != null) {
            C1248840ibS.LIZ(C1248840ibS.LIZ, C09YG.TYPE_SHOW.getType(), list, new AwS668S0100000_19(this, 25), 4);
        }
        Gp(null, true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        String str;
        AbstractC738140SxQ abstractC738140SxQ;
        View view = this.LLJJ;
        if (view != null) {
            LifecycleOwner parent = getParent();
            String str2 = (!(parent instanceof AbstractC738140SxQ) || (abstractC738140SxQ = (AbstractC738140SxQ) parent) == null) ? null : abstractC738140SxQ.assemTagInternal;
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -1941259690:
                        if (str2.equals("user_account_base_info")) {
                            IAccountUserInfoAbility iAccountUserInfoAbility = (IAccountUserInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IAccountUserInfoAbility.class, null);
                            if (iAccountUserInfoAbility != null) {
                                String str3 = this.assemTagInternal;
                                str = str3 != null ? str3 : "";
                                C1248950ibd c1248950ibdBp = Bp();
                                iAccountUserInfoAbility.LJIIIZ(c1248950ibdBp != null ? c1248950ibdBp.LL : -1, view, str);
                                return;
                            }
                            return;
                        }
                        break;
                    case 97544:
                        if (str2.equals("bio")) {
                            if (C2532609wC.LIZIZ()) {
                                IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
                                if (iHeaderBioAbility != null) {
                                    String str4 = this.assemTagInternal;
                                    iHeaderBioAbility.rQ2(this.LLJILLL, view, str4 != null ? str4 : "");
                                    return;
                                }
                                return;
                            }
                            IHeaderBioAbility iHeaderBioAbility2 = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
                            if (iHeaderBioAbility2 != null) {
                                String str5 = this.assemTagInternal;
                                iHeaderBioAbility2.LJIIIZ(this.LLJILLL, view, str5 != null ? str5 : "");
                                return;
                            }
                            return;
                        }
                        break;
                    case 339204258:
                        if (str2.equals("user_info")) {
                            IHeaderAccountInfoAbility iHeaderAccountInfoAbility = (IHeaderAccountInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAccountInfoAbility.class, null);
                            if (iHeaderAccountInfoAbility != null) {
                                String str6 = this.assemTagInternal;
                                str = str6 != null ? str6 : "";
                                C1248950ibd c1248950ibdBp2 = Bp();
                                iHeaderAccountInfoAbility.LJIIIZ(c1248950ibdBp2 != null ? c1248950ibdBp2.LL : -1, view, str);
                                return;
                            }
                            return;
                        }
                        break;
                    case 1109035740:
                        if (str2.equals("user_account_name_info")) {
                            IAccountNameUserInfoAbility iAccountNameUserInfoAbility = (IAccountNameUserInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IAccountNameUserInfoAbility.class, null);
                            if (iAccountNameUserInfoAbility != null) {
                                String str7 = this.assemTagInternal;
                                str = str7 != null ? str7 : "";
                                C1248950ibd c1248950ibdBp3 = Bp();
                                iAccountNameUserInfoAbility.cg(view, c1248950ibdBp3 != null ? c1248950ibdBp3.LL : -1, str, false);
                                return;
                            }
                            return;
                        }
                        break;
                }
            }
            IAccountUserInfoAbility iAccountUserInfoAbility2 = (IAccountUserInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IAccountUserInfoAbility.class, null);
            if (iAccountUserInfoAbility2 != null) {
                String str8 = this.assemTagInternal;
                str = str8 != null ? str8 : "";
                C1248950ibd c1248950ibdBp4 = Bp();
                iAccountUserInfoAbility2.LJIIIZ(c1248950ibdBp4 != null ? c1248950ibdBp4.LL : -1, view, str);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        ProfileComponents profileComponents;
        List<EventParams> list;
        ProfileComponents profileComponents2;
        List<Action> list2;
        if (C0OBG.LIZIZ(this.LLJJ)) {
            return;
        }
        C1248950ibd c1248950ibdBp = Bp();
        if (c1248950ibdBp != null && (profileComponents2 = c1248950ibdBp.LLILLJJLI) != null && (list2 = profileComponents2.actions) != null) {
            for (Action action : list2) {
                if (Intrinsics.LJFF(action.getType(), "router")) {
                    Context context = getContext();
                    Action.RouterInfo router = action.getRouter();
                    SmartRouter.buildRoute(context, router != null ? router.getUrl() : null).open();
                }
            }
        }
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (list = profileComponents.eventParams) == null) {
            return;
        }
        C1248840ibS.LIZ(C1248840ibS.LIZ, C09YG.TYPE_CLICK.getType(), list, new AwS668S0100000_19(this, 26), 4);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void bp() {
        super.bp();
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
        if (profilePlatformProtocolAp != null) {
            profilePlatformProtocolAp.LLJJIJI = new AwS598S0100000_19((CommonInfoBaseUIComponent) this, 486);
        }
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
        op(Boolean.valueOf((profilePlatformProtocolAp2 != null && profilePlatformProtocolAp2.LJJJZ()) || (profilePlatformProtocolAp = ap()) == null || Boolean.valueOf(profilePlatformProtocolAp.LJJJZ()) == null));
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp3 = ap();
        if (profilePlatformProtocolAp3 == null || !profilePlatformProtocolAp3.LJJLIIIJILLIZJL()) {
            C1248950ibd c1248950ibd = this.LLJJI;
            if (c1248950ibd == null || (profileComponents2 = c1248950ibd.LLILLJJLI) == null || (str = profileComponents2.componentId) == null) {
                str = this.LLJILJIL;
            }
            ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp4 = ap();
            Gp((((profilePlatformProtocolAp4 == null || (t = profilePlatformProtocolAp4.LLJILJIL) == null) && (t = this.LLJL) == null) || (describe3 = t.getDescribe()) == null) ? null : describe3.getText(), false);
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
                C1248270iaX.LIZ(tuxIconView, t, str, null, null, null);
                return;
            }
            int type2 = EnumC1248260iaW.TEXT.getType();
            if (numValueOf != null && numValueOf.intValue() == type2) {
                View view2 = this.LLJJ;
                if (view2 instanceof TuxTextView) {
                    tuxTextView = (TuxTextView) view2;
                } else if (!(view2 instanceof ViewGroup)) {
                    return;
                } else {
                    tuxTextView = (TuxTextView) view2.findViewById(R.id.s0b);
                }
                if (tuxTextView != null) {
                    C1248270iaX.LIZJ(tuxTextView, t, str, null, null, false, 28);
                    if (t == null || (describe2 = t.getDescribe()) == null || (text2 = describe2.getText()) == null) {
                        return;
                    }
                    tuxTextView.setText(up(tuxTextView, text2, Fp()));
                    return;
                }
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
                C1248270iaX.LIZJ(tuxTextView2, t, str, null, null, false, 28);
                if (t != null && (describe = t.getDescribe()) != null && (text = describe.getText()) != null) {
                    tuxTextView2.setText(up(tuxTextView2, text, null));
                }
            }
            TuxIconView tuxIconView2 = (TuxIconView) view3.findViewById(R.id.s0a);
            if (tuxIconView2 != null) {
                C1248270iaX.LIZ(tuxIconView2, t, str, null, null, null);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
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
            if (Intrinsics.LJFF(string, this.LLJLIL)) {
                return;
            }
            this.LLJLIL = string;
            tp();
            this.LLJLIL = nVar.toString();
        }
    }

    public final void Ip(View view) {
        AbstractC738140SxQ abstractC738140SxQ;
        if (view == null) {
            return;
        }
        LifecycleOwner parent = getParent();
        String str = null;
        if ((parent instanceof AbstractC738140SxQ) && (abstractC738140SxQ = (AbstractC738140SxQ) parent) != null) {
            str = abstractC738140SxQ.assemTagInternal;
        }
        if (Intrinsics.LJFF(str, "user_info")) {
            C426750GoL.LJIIIZ(view, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, null, false, 29);
        }
        if (Intrinsics.LJFF(str, "bio")) {
            Ap().getClass();
            C426750GoL.LJIIIZ(view, null, Integer.valueOf(C1248230iaT.LJIILIIL()), null, null, false, 29);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00fd  */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig r16) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.CommonInfoBaseUIComponent.So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig):android.view.View");
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJL = (T) C1250210idf.LIZ(nVar.toString(), BizBaseData.class);
    }

    public final void zp(View view) {
        TextView textView;
        TextUtils.TruncateAt truncateAtLJJJJ;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        if (view != null) {
            view.setId(R.id.s0b);
            C786410Ut5.W5(view, layoutParams);
        }
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            ap();
            textView.setSingleLine(true);
            textView.setMaxLines(1);
            ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
            if (profilePlatformProtocolAp == null || (truncateAtLJJJJ = profilePlatformProtocolAp.LJJJJ()) == null) {
                truncateAtLJJJJ = TextUtils.TruncateAt.END;
            }
            textView.setEllipsize(truncateAtLJJJJ);
            textView.setGravity(8388627);
        }
        if (view != null) {
            view.setTag(R.id.s2_, Boolean.TRUE);
        }
    }

    public final void Gp(String str, boolean z) {
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
        if (!this.LLJJIII && C300150Bpd.LIZ() && Intrinsics.LJFF("user_account_user_name", this.assemTagInternal)) {
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

    public final void yp(View view, boolean z) {
        int iLIZIZ;
        int iIntValue;
        Integer numLJJIJIIJIL;
        Integer numLJJIL;
        Ap().getClass();
        if (z) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        }
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
        if (profilePlatformProtocolAp != null && (numLJJIL = profilePlatformProtocolAp.LJJIL()) != null) {
            iIntValue = numLJJIL.intValue();
        } else {
            iIntValue = iLIZIZ;
        }
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp2 = ap();
        if (profilePlatformProtocolAp2 != null && (numLJJIJIIJIL = profilePlatformProtocolAp2.LJJIJIIJIL()) != null) {
            iLIZIZ = numLJJIJIIJIL.intValue();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iIntValue, iLIZIZ);
        if (view != null) {
            view.setId(R.id.s0a);
        }
        if (z) {
            Ap().getClass();
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        } else {
            Ap().getClass();
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        }
        layoutParams.gravity = 8388627;
        if (view != null) {
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public final CharSequence up(TuxTextView tuxTextView, CharSequence charSequence, CharSequence charSequence2) {
        String strLJJJJJL;
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
        if (profilePlatformProtocolAp != null) {
            strLJJJJJL = profilePlatformProtocolAp.LJJJJJL();
        } else {
            strLJJJJJL = null;
        }
        if (strLJJJJJL != null && strLJJJJJL.length() != 0) {
            charSequence2 = strLJJJJJL;
        }
        if (C041J.LIZ(charSequence) && C041J.LIZ(charSequence2)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            if (tuxTextView.getLayoutDirection() == 1) {
                spannableStringBuilder.append(charSequence2);
                return spannableStringBuilder;
            }
            spannableStringBuilder.insert(0, charSequence2);
            return spannableStringBuilder;
        }
        return charSequence;
    }
}
