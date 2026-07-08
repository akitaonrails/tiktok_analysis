package com.ss.android.ugc.profile.platform.business.header.business.bio.business.school;

import X.C01GW;
import X.C08JS;
import X.C0OBG;
import X.C1229200i5m;
import X.C1245860iWe;
import X.C1245880iWg;
import X.C1246180iXA;
import X.C1248870ibV;
import X.C1248950ibd;
import X.C1295960jpS;
import X.C1558520qew;
import X.C1721460utk;
import X.C19EG;
import X.C2217381BqS;
import X.C268330AfP;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C428150Gqb;
import X.C452501pT;
import X.C698190Ra5;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1231460i9Q;
import X.EnumC428940Grs;
import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.profile.business.ur.platform.BioSchoolData;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowFragment;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class BioSchoolBadgeComponent extends BioBaseUIComponent<BioSchoolData> {
    public TuxIconView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public FrameLayout LLJZ;
    public C1295960jpS LLJZIJLIL;
    public C1295960jpS LLL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(122));
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(121));
    public final ARunnableS117S0100000_17 LLLF = new ARunnableS117S0100000_17(this, 132);
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2500));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        if (this.LLJJIII) {
            C1246180iXA c1246180iXA = C1246180iXA.LIZ;
            AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 260);
            c1246180iXA.getClass();
            C1246180iXA.LIZLLL = awS561S0100000_17;
        }
        ProfilePlatformViewModel profilePlatformViewModelYp = yp();
        if (profilePlatformViewModelYp != null) {
            profilePlatformViewModelYp.TQ2(new AwS598S0100000_19(this, 482));
        }
        ProfilePlatformViewModel profilePlatformViewModelYp2 = yp();
        if (profilePlatformViewModelYp2 != null) {
            C736680Sv4.LJIIIIZZ(this, profilePlatformViewModelYp2, new C2217381BqS() { // from class: X.0iZk
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLJJI;
                }
            }, null, new AwS633S0100000_19(this, 158), 6);
        }
    }

    public final int Ap() {
        return ((Number) this.LLJLLIL.getValue()).intValue();
    }

    public final void Bp() {
        FrameLayout frameLayout = this.LLJZ;
        if (frameLayout != null) {
            HandlerHook.viewRemoveCallbacks(frameLayout, this.LLLF);
        }
        C1295960jpS c1295960jpS = this.LLJZIJLIL;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
            C786410Ut5.LLD(8, c1295960jpS);
        }
        C1295960jpS c1295960jpS2 = this.LLL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.cancelAnimation();
            C786410Ut5.LLD(8, c1295960jpS2);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        ProfileComponents profileComponents;
        if (!C0OBG.LIZIZ(this.LLJJ) && this.LLJJIII) {
            C1248950ibd c1248950ibd = (C1248950ibd) this.LLJJL.getValue();
            List<Action> list = (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null) ? null : profileComponents.actions;
            C1245880iWg c1245880iWg = C1245880iWg.LIZ;
            C1245860iWe c1245860iWe = new C1245860iWe(EnumC1231460i9Q.PERSONAL_HOMEPAGE, null, null);
            c1245880iWg.getClass();
            C1245880iWg.LIZLLL(c1245860iWe, true);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ == null || list == null) {
                return;
            }
            for (Action action : list) {
                if (Intrinsics.LJFF(action.getType(), "router")) {
                    CampusFlowFragment campusFlowFragment = new CampusFlowFragment();
                    Bundle bundle = new Bundle();
                    Action.RouterInfo router = action.getRouter();
                    C786410Ut5.LJJIZ(bundle, "CampusFlowFragmentInputRoute", router != null ? router.getUrl() : null);
                    C786410Ut5.LJJIZ(bundle, "CampusFlowFragmentInputEnterFrom", new C1245860iWe(EnumC1231460i9Q.PERSONAL_HOMEPAGE, null, null));
                    campusFlowFragment.setArguments(bundle);
                    campusFlowFragment.show(c19egLIZ.getSupportFragmentManager(), "CampusFlowFragment");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        String text;
        Describe describe;
        TuxTextView tuxTextView = this.LLJLL;
        if (tuxTextView != null) {
            T t = this.LLJJLIIIJLLLLLLLZ;
            if (t == 0 || (describe = t.getDescribe()) == null || (text = describe.getText()) == null) {
                text = "";
            }
            tuxTextView.setText(text);
        }
        TuxIconView tuxIconView = this.LLJLILLLLZIIL;
        T t2 = this.LLJJLIIIJLLLLLLLZ;
        Icon icon = t2 != 0 ? t2.getIcon() : null;
        if (tuxIconView == null || icon == null) {
            return;
        }
        Map<Integer, Integer> map = C1721460utk.LIZ;
        C698190Ra5 c698190Ra5LIZJ = C1721460utk.LIZJ(tuxIconView.getContext(), icon.getLocalIcon(), icon.getIconColor(), "profile_tab_base_item", "");
        if (c698190Ra5LIZJ != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = c698190Ra5LIZJ.LIZ;
            c419910GdJ.LIZIZ = Ap();
            c419910GdJ.LIZJ = Ap();
            Integer num = c698190Ra5LIZJ.LIZIZ;
            if (num != null) {
                c419910GdJ.LIZLLL = Integer.valueOf(num.intValue());
            } else {
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            }
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLJJIII) {
            C1246180iXA.LIZ.getClass();
            C1246180iXA.LIZLLL = null;
        }
        Bp();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        int i;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        this.LLJLILLLLZIIL = new TuxIconView(context, null, 0, 6, null);
        int iLIZIZ = 0;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(62);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.LLJLL = tuxTextView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        this.LLLFF.getValue().getClass();
        if (C268330AfP.LIZLLL()) {
            i = 4;
        } else {
            i = 8;
        }
        marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        if (!C268330AfP.LJIIIZ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        marginLayoutParams.setMarginStart(iLIZIZ);
        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        C786410Ut5.a6(frameLayout, marginLayoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.addView(this.LLJLILLLLZIIL, new ViewGroup.LayoutParams(Ap(), Ap()));
        linearLayout.addView(tuxTextView, C1229200i5m.LIZIZ(-2, -2, ((Number) this.LLJLLL.getValue()).intValue(), 0, 0, 0, 0, 120));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-2, -2, 1));
        C1248870ibV.LIZJ(frameLayout, profileComponentUIConfig, true, false);
        C428150Gqb.LIZ(frameLayout, EnumC428940Grs.ALPHA, 0.0f);
        this.LLJZ = frameLayout;
        return frameLayout;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C08JS.LIZ(nVar.toString(), BioSchoolData.class);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent
    public final void up(View view) {
        IHeaderBioAbility iHeaderBioAbility;
        if (view != null && (iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderBioAbility.LJIIIZ(this.LLJILLL, view, str);
        }
    }

    public static C1295960jpS zp(Context context, boolean z) {
        int i;
        if (C960203pA.LIZIZ(context)) {
            i = R.raw.tux_lottie_common_infrastructure_addname_star_dark;
        } else {
            i = R.raw.tux_lottie_common_infrastructure_addname_star_light;
        }
        C1295960jpS c1295960jpS = new C1295960jpS(context);
        c1295960jpS.setAnimation(i);
        c1295960jpS.setRepeatCount(-1);
        c1295960jpS.setRepeatMode(1);
        C786410Ut5.LLD(8, c1295960jpS);
        if (z) {
            C786410Ut5.Wb(c1295960jpS, -1.0f);
            C786410Ut5.vc(c1295960jpS, -1.0f);
        }
        return c1295960jpS;
    }
}
