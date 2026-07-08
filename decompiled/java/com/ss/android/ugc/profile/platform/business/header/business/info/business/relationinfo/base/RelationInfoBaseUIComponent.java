package com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base;

import X.C01GW;
import X.C09YG;
import X.C1248210iaR;
import X.C1248270iaX;
import X.C1248840ibS;
import X.C1248950ibd;
import X.C1250210idf;
import X.C1388190mED;
import X.C1558520qew;
import X.C19252910Tv;
import X.C2188811AlT;
import X.C2373309Rr;
import X.C2537109wv;
import X.C268330AfP;
import X.C418440Gaw;
import X.C428150Gqb;
import X.C444890HcV;
import X.C452501pT;
import X.C487280J9a;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1253850ijX;
import X.EnumC428940Grs;
import X.InterfaceC487330J9f;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.ss.android.ugc.profile.business.ur.platform.business.RelationFollowingProtocol;
import com.ss.android.ugc.profile.business.ur.platform.business.abiltiy.ResetDataAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserAccountInfo;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class RelationInfoBaseUIComponent<T extends RelationData> extends BaseUIComponent implements ResetDataAbility, InterfaceC487330J9f {
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS563S0100000_19((RelationInfoBaseUIComponent) this, 2518));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(561));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS563S0100000_19((RelationInfoBaseUIComponent) this, 2519));
    public T LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        IHeaderRelationInfoAbility iHeaderRelationInfoAbility;
        View view = this.LLJJ;
        if (view == null || (iHeaderRelationInfoAbility = (IHeaderRelationInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderRelationInfoAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderRelationInfoAbility.LJIIIZ(this.LLJILLL, view, str);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        C1248950ibd c1248950ibd;
        ProfileComponents profileComponents;
        List<EventParams> list;
        ProfileComponents profileComponents2;
        List<Action> list2;
        C1248950ibd c1248950ibd2 = (C1248950ibd) this.LLJL.getValue();
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
        C1248840ibS.LIZ(C1248840ibS.LIZ, C09YG.TYPE_CLICK.getType(), list, new AwS668S0100000_19(this, 22), 4);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Ho() {
        ProfileComponents profileComponents;
        List<EventParams> list;
        TuxTextView tuxTextView;
        if (cp()) {
            if (!C268330AfP.LIZLLL()) {
                C444890HcV c444890HcV = new C444890HcV();
                c444890HcV.LIZ(23);
                Typeface typeface = c444890HcV.getTypeface();
                View view = this.LLJJ;
                if ((view instanceof ViewGroup) && view != null && (tuxTextView = (TuxTextView) view.findViewById(R.id.s5x)) != null) {
                    TuxTextView.LJJJJ(tuxTextView, 17.0f, 22, typeface, 0.02f);
                }
            }
            tG0();
            C1248950ibd c1248950ibd = this.LLJJI;
            if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (list = profileComponents.eventParams) == null) {
                return;
            }
            C1248840ibS.LIZ(C1248840ibS.LIZ, C09YG.TYPE_SHOW.getType(), list, new AwS668S0100000_19(this, 21), 4);
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

    @Override // com.ss.android.ugc.profile.business.ur.platform.business.abiltiy.ResetDataAbility
    public final void tG0() {
        TextView textView;
        if (cp() && ((IUserProfilePreload) ServiceManager.get().getService(IUserProfilePreload.class)).LJFF()) {
            View view = this.LLJJ;
            if (!(view instanceof ViewGroup) || view == null || (textView = (TextView) view.findViewById(R.id.s5x)) == null) {
                return;
            }
            textView.setText("-");
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        String number;
        String text;
        Resources resources;
        Describe describe;
        BizBaseData bizBaseData;
        UserRelationInfo userRelationInfo;
        String str;
        ProfileComponents profileComponents;
        String str2;
        ProfileComponents profileComponents2;
        TextView textView;
        String strLJJIFFI;
        Describe describe2;
        String string = null;
        string = null;
        if (!cp()) {
            TextView textView2 = (TextView) this.LLJJ.findViewById(R.id.s5w);
            if (textView2 != null) {
                T t = this.LLJLIL;
                if (t == null || (describe = t.getDescribe()) == null || (text = describe.getText()) == null) {
                    Context context = getContext();
                    if (context != null && (resources = context.getResources()) != null) {
                        string = resources.getString(2131837645);
                    }
                    text = string;
                }
                textView2.setText(text);
            }
            TextView textView3 = (TextView) this.LLJJ.findViewById(R.id.s5x);
            if (textView3 != null) {
                T t2 = this.LLJLIL;
                if (t2 == null || (number = t2.getNumber()) == null) {
                    number = "-";
                }
                textView3.setText(number);
                return;
            }
            return;
        }
        View view = this.LLJJ;
        if ((view instanceof ViewGroup) && view != null && (textView = (TextView) view.findViewById(R.id.s5w)) != null) {
            T t3 = this.LLJLIL;
            if (t3 == null || (describe2 = t3.getDescribe()) == null || (strLJJIFFI = describe2.getSubText()) == null) {
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
                strLJJIFFI = profilePlatformProtocolAp != null ? profilePlatformProtocolAp.LJJIFFI() : null;
            }
            textView.setText(strLJJIFFI);
        }
        if (cp()) {
            ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp2 = ap();
            bizBaseData = profilePlatformProtocolAp2 != null ? profilePlatformProtocolAp2.LLJILJIL : null;
            if (!(bizBaseData instanceof RelationData)) {
                bizBaseData = null;
            }
        } else {
            bizBaseData = this.LLJLIL;
        }
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        if (profilePlatformViewModelZo == null || !profilePlatformViewModelZo.LLJILJIL) {
            View view2 = this.LLJJ;
            if (view2 == null) {
                throw new IllegalStateException("componentView is null.");
            }
            TuxTextView tuxTextView = view2 instanceof ViewGroup ? (TuxTextView) view2.findViewById(R.id.s5x) : null;
            View view3 = this.LLJJ;
            ProfileCommonInfo profileCommonInfoVo = Vo();
            if (profileCommonInfoVo != null) {
                String str3 = this.assemTagInternal;
                if (str3 == null) {
                    str3 = "";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setViewEnable component=");
                sbLIZ.append(str3);
                sbLIZ.append(", isCancelOrGeoBlock=");
                sbLIZ.append(false);
                sbLIZ.append(", isBlocked=");
                sbLIZ.append(false);
                C1248210iaR.LJ("RelationInfoBaseUIComponent", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.VISIBILITY, "ViewEnable");
                UserAccountInfo userAccountInfo = profileCommonInfoVo.getUserAccountInfo();
                if ((userAccountInfo != null && userAccountInfo.isUserCancel()) || ((userRelationInfo = profileCommonInfoVo.getUserRelationInfo()) != null && Intrinsics.LJFF(userRelationInfo.isGeoBlocked(), Boolean.TRUE))) {
                    if (view3 != null) {
                        view3.setEnabled(false);
                        view3.setClickable(false);
                    }
                    if (tuxTextView != null) {
                        tuxTextView.setTextColorRes(R.attr.a1k);
                    }
                } else {
                    UserRelationInfo userRelationInfo2 = profileCommonInfoVo.getUserRelationInfo();
                    if (userRelationInfo2 == null || !Intrinsics.LJFF(userRelationInfo2.isBlocked(), Boolean.TRUE)) {
                        UserRelationInfo userRelationInfo3 = profileCommonInfoVo.getUserRelationInfo();
                        if (userRelationInfo3 != null ? Intrinsics.LJFF(userRelationInfo3.isBlocking(), Boolean.TRUE) : false) {
                            if (view3 != null) {
                                view3.setEnabled(true);
                                view3.setClickable(true);
                            }
                            if (tuxTextView != null) {
                                tuxTextView.setTextColorRes(R.attr.a1h);
                            }
                        } else {
                            if (tuxTextView != null) {
                                tuxTextView.setTextColorRes(R.attr.a1h);
                            }
                            if (view3 != null) {
                                view3.setEnabled(true);
                                view3.setClickable(true);
                            }
                        }
                    } else {
                        if (view3 != null) {
                            view3.setEnabled(false);
                            view3.setClickable(false);
                        }
                        if (tuxTextView != null) {
                            tuxTextView.setTextColorRes(R.attr.a1k);
                        }
                    }
                }
            }
        }
        TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
        if (tuxTextView2 != null) {
            C1248950ibd c1248950ibd = this.LLJJI;
            if (c1248950ibd == null || (profileComponents2 = c1248950ibd.LLILLJJLI) == null || (str2 = profileComponents2.componentId) == null) {
                str2 = this.LLJILJIL;
            }
            C1248270iaX.LIZJ(tuxTextView2, bizBaseData, str2, null, null, false, 28);
        }
        TuxTextView tuxTextView3 = this.LLJLL;
        if (tuxTextView3 != null) {
            C1248950ibd c1248950ibd2 = this.LLJJI;
            if (c1248950ibd2 == null || (profileComponents = c1248950ibd2.LLILLJJLI) == null || (str = profileComponents.componentId) == null) {
                str = this.LLJILJIL;
            }
            C1248270iaX.LIZJ(tuxTextView3, bizBaseData, str, null, null, true, 12);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            ep(nVar);
        }
        tp();
        if (cp()) {
            super.Hj(profileComponents);
            if (profileComponents.bizData == null) {
                tG0();
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        LinearLayout linearLayout;
        TuxTextView tuxTextView;
        boolean z;
        Number numberValueOf;
        TuxTextView tuxTextView2;
        int i;
        int iLIZIZ;
        if (C2537109wv.LIZ() && !C268330AfP.LJIIIZ()) {
            linearLayout = new C2373309Rr(getContext());
        } else {
            linearLayout = new LinearLayout(getContext());
        }
        int i2 = 61;
        if (linearLayout instanceof C2373309Rr) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 80;
            C2373309Rr c2373309Rr = (C2373309Rr) linearLayout;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c2373309Rr);
            c2373309Rr.setLayoutParams(layoutParams);
            if (C2537109wv.LJII() && this.LLJJIII) {
                c2373309Rr.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)));
                Context context = getContext();
                if (context != null) {
                    iLIZIZ = (C497820Jfg.LIZIZ(context) - (((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(61))) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))) * 3))) / 3;
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
                }
                c2373309Rr.setMaxWidth(iLIZIZ);
            } else {
                c2373309Rr.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)));
                c2373309Rr.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110)));
            }
        } else {
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(92));
            if (C268330AfP.LJIIIZ()) {
                iLIZIZ2 = -2;
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iLIZIZ2, -2);
            layoutParams2.gravity = 80;
            C786410Ut5.d6(linearLayout, layoutParams2);
        }
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 1;
        Context context2 = getContext();
        if (context2 != null) {
            tuxTextView = new TuxTextView(context2, null, 6, 0);
        } else {
            tuxTextView = null;
        }
        this.LLJLILLLLZIIL = tuxTextView;
        TuxTextView tuxTextView3 = this.LLJLILLLLZIIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setGravity(((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue());
            tuxTextView3.setMaxLines(1);
            tuxTextView3.setTextColorRes(R.attr.a1h);
            this.LLJJL.getValue().getClass();
            if (C268330AfP.LIZLLL()) {
                i = 42;
            } else {
                i = 33;
            }
            tuxTextView3.setTuxFont(i);
            C786410Ut5.R6(tuxTextView3, layoutParams3);
            tuxTextView3.setId(R.id.s5x);
            if (cp()) {
                C1248270iaX.LIZJ(tuxTextView3, this.LLJLIL, this.LLJILJIL, null, null, false, 28);
            }
        }
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
        if ((profilePlatformProtocolAp instanceof RelationFollowingProtocol) && profilePlatformProtocolAp != null) {
            z = true;
        } else {
            z = false;
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        c19252910Tv.LIZLLL().LJI().LJJLIL(this.LLJLILLLLZIIL, z, null, null);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 1;
        if (C268330AfP.LIZLLL()) {
            numberValueOf = -1;
        } else if (C2537109wv.LIZ()) {
            numberValueOf = -2;
        } else {
            numberValueOf = Double.valueOf(2.5d);
        }
        layoutParams4.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numberValueOf));
        Context context3 = getContext();
        if (context3 != null) {
            tuxTextView2 = new TuxTextView(context3, null, 6, 0);
        } else {
            tuxTextView2 = null;
        }
        this.LLJLL = tuxTextView2;
        TuxTextView tuxTextView4 = this.LLJLL;
        if (tuxTextView4 != null) {
            tuxTextView4.setGravity(((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue());
            tuxTextView4.setMaxLines(1);
            C2537109wv.LIZ();
            tuxTextView4.setTextColorRes(R.attr.a1k);
            this.LLJJL.getValue().getClass();
            if (C268330AfP.LIZLLL()) {
                i2 = 71;
            }
            tuxTextView4.setTuxFont(i2);
            C786410Ut5.R6(tuxTextView4, layoutParams4);
            tuxTextView4.setId(R.id.s5w);
        }
        c19252910Tv.LIZLLL().LJI().LJJLIL(this.LLJLL, z, null, null);
        linearLayout.addView(this.LLJLILLLLZIIL);
        linearLayout.addView(this.LLJLL);
        if (cp()) {
            C428150Gqb.LIZ(linearLayout, EnumC428940Grs.ALPHA, 0.0f);
        }
        return linearLayout;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJLIL = (T) C1250210idf.LIZ(nVar.toString(), RelationData.class);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        boolean z;
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
        if ((profilePlatformProtocolAp instanceof RelationFollowingProtocol) && profilePlatformProtocolAp != null) {
            z = true;
        } else {
            z = false;
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        c19252910Tv.LIZLLL().LJI().LJJLIL(this.LLJLILLLLZIIL, z, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
        c19252910Tv.LIZLLL().LJI().LJJLIL(this.LLJLL, z, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
    }
}
