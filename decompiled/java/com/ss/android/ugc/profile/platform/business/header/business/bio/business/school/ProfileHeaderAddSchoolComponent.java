package com.ss.android.ugc.profile.platform.business.header.business.bio.business.school;

import X.C01GW;
import X.C08JS;
import X.C0C64;
import X.C0OBG;
import X.C1245830iWb;
import X.C1245860iWe;
import X.C1245880iWg;
import X.C1246160iX8;
import X.C1247760iZi;
import X.C1248090iaF;
import X.C1248230iaT;
import X.C1248870ibV;
import X.C1558520qew;
import X.C197039127h;
import X.C19EG;
import X.C1EDI;
import X.C2217381BqS;
import X.C2537109wv;
import X.C267790AeX;
import X.C268330AfP;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C426750GoL;
import X.C428150Gqb;
import X.C452501pT;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1231460i9Q;
import X.EnumC338580DPc;
import X.EnumC428940Grs;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.exp.CampusExperimentResponse;
import com.ss.android.ugc.ur.school.service.SchoolFlowLauncher;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderAddSchoolComponent extends BioBaseUIComponent<BizBaseData> {
    public TuxTextView LLJLILLLLZIIL;
    public final C01GW LLJLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(393));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2501));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        ProfilePlatformViewModel profilePlatformViewModelYp = yp();
        if (profilePlatformViewModelYp != null) {
            C736680Sv4.LJIIIIZZ(this, profilePlatformViewModelYp, new C2217381BqS() { // from class: X.0iZj
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLJJI;
                }
            }, null, new AwS633S0100000_19(this, 159), 6);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        if (C0OBG.LIZIZ(this.LLJJ)) {
            return;
        }
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        EnumC1231460i9Q enumC1231460i9Q = EnumC1231460i9Q.PERSONAL_HOMEPAGE;
        C1245860iWe c1245860iWe = new C1245860iWe(enumC1231460i9Q, null, null);
        c1245880iWg.getClass();
        C1245880iWg.LIZLLL(c1245860iWe, false);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            SchoolFlowLauncher schoolFlowLauncher = (SchoolFlowLauncher) ServiceManager.get().getService(SchoolFlowLauncher.class);
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            CampusExperimentResponse campusExperimentResponse = C1246160iX8.LIZ;
            CampusExperimentResponse campusExperimentResponse2 = (CampusExperimentResponse) c0c64LJIILLIIL.LJJII(CampusExperimentResponse.class, campusExperimentResponse, "campus", false);
            if (campusExperimentResponse2 != null) {
                campusExperimentResponse = campusExperimentResponse2;
            }
            schoolFlowLauncher.LIZ(c19egLIZ, new C1245830iWb(campusExperimentResponse.profileSchoolNameRouterToEdit ? EnumC338580DPc.EDIT_SCHOOL : EnumC338580DPc.FIND_SCHOOL_FRIENDS, new C1245860iWe(enumC1231460i9Q, null, null), false, null, null, null, false, 124));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        TuxTextView tuxTextView;
        Describe describe;
        Drawable drawableLIZ;
        Describe describe2;
        C197039127h c197039127h;
        TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
        if (tuxTextView2 != null) {
            CharSequence charSequence = null;
            text = null;
            String text = null;
            Drawable drawableLIZ2 = null;
            charSequence = null;
            C1248090iaF c1248090iaF = null;
            if (!((Boolean) C2537109wv.LJIIJ.getValue()).booleanValue() || C1EDI.LIZIZ()) {
                TuxTextView tuxTextView3 = this.LLJLILLLLZIIL;
                if (tuxTextView3 != null) {
                    Context context = getContext();
                    if (context != null) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                        drawableLIZ = c384050F3z.LIZ(context);
                    } else {
                        drawableLIZ = null;
                    }
                    tuxTextView3.setBackground(drawableLIZ);
                }
                T t = this.LLJJLIIIJLLLLLLLZ;
                String text2 = (t == 0 || (describe = t.getDescribe()) == null) ? null : describe.getText();
                C1247760iZi.LIZ.getClass();
                String strLIZIZ = C1247760iZi.LIZIZ(text2, "");
                if (strLIZIZ.length() != 0) {
                    if (C1EDI.LIZIZ()) {
                        Context context2 = getContext();
                        if (context2 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) "￼");
                            spannableStringBuilder.append((CharSequence) strLIZIZ);
                            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                            c419910GdJ.LIZ = R.raw.icon_plus_fill;
                            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                            C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context2);
                            c419890GdHLIZIZ.LIZIZ(0, iLIZIZ, C426750GoL.LIZLLL(context2));
                            C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 0, 1, 33);
                            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1h, context2)), 1, spannableStringBuilder.length(), 33);
                            TuxTextView tuxTextView4 = this.LLJLILLLLZIIL;
                            if (tuxTextView4 != null) {
                                Context context3 = getContext();
                                if (context3 != null) {
                                    C384050F3z c384050F3z2 = new C384050F3z();
                                    c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
                                    c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                                    drawableLIZ2 = c384050F3z2.LIZ(context3);
                                }
                                tuxTextView4.setBackground(drawableLIZ2);
                            }
                            charSequence = spannableStringBuilder;
                        }
                    } else {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((CharSequence) strLIZIZ);
                        Context context4 = getContext();
                        if (context4 != null) {
                            c1248090iaF = new C1248090iaF(context4);
                            c1248090iaF.LIZIZ(3);
                            c1248090iaF.LIZJ(strLIZIZ);
                            c1248090iaF.LIZLLL(C960203pA.LIZ(R.attr.a1j, context4));
                            c1248090iaF.LIZ(C960203pA.LIZ(R.attr.bs, context4));
                        }
                        C786410Ut5.q2(spannableStringBuilder2, c1248090iaF, 0, spannableStringBuilder2.length(), 17);
                        charSequence = spannableStringBuilder2;
                    }
                }
                tuxTextView2.setText(charSequence);
            } else {
                if ((tuxTextView2 instanceof C197039127h) && (c197039127h = (C197039127h) tuxTextView2) != null) {
                    c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_plus));
                }
                T t2 = this.LLJJLIIIJLLLLLLLZ;
                if (t2 != 0 && (describe2 = t2.getDescribe()) != null) {
                    text = describe2.getText();
                }
                tuxTextView2.setText(text);
            }
        }
        if (C1EDI.LIZIZ() && (tuxTextView = this.LLJLILLLLZIIL) != null) {
            C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), 16);
        }
        C428150Gqb.LIZ(this.LLJLILLLLZIIL, EnumC428940Grs.LIGHT_MASK, C1EDI.LIZIZ() ? C418440Gaw.LIZIZ(200) : 0.0f);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        LinearLayout.LayoutParams layoutParams;
        int iIntValue;
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (((Boolean) C2537109wv.LJIIJ.getValue()).booleanValue() && !C1EDI.LIZIZ()) {
            layoutParams = new LinearLayout.LayoutParams(-2, ((Number) this.LLJLL.getValue()).intValue());
            if (C268330AfP.LJIIIZ()) {
                iLIZIZ3 = 0;
            } else {
                iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            }
            C426750GoL.LJIIJ(layoutParams, context, Integer.valueOf(iLIZIZ3), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), 32);
            C197039127h c197039127h = new C197039127h(context, null, 6, 0);
            c197039127h.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            c197039127h.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            c197039127h.setIconTintColorRes(R.attr.a1j);
            c197039127h.setTextColorRes(R.attr.a1j);
            c197039127h.setTuxFont(72);
            c197039127h.setMinWidth(0);
            c197039127h.LJJJJL(new AwS372S0200000_6(context, c197039127h, 39));
            c197039127h.setEllipsize(TextUtils.TruncateAt.END);
            this.LLJLILLLLZIIL = c197039127h;
        } else {
            if (C1EDI.LIZIZ()) {
                iIntValue = ((Number) this.LLJLL.getValue()).intValue();
            } else {
                iIntValue = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(-2, iIntValue);
            if (C268330AfP.LJIIIZ()) {
                iLIZIZ = 0;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
            }
            if (((Boolean) C267790AeX.LIZ.getValue()).booleanValue() && C268330AfP.LJIIIZ()) {
                this.LLJLLIL.getValue().getClass();
                iLIZIZ2 = C1248230iaT.LJII();
            } else {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
            C426750GoL.LJIIJ(layoutParams, context, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ2), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 32);
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            if (C1EDI.LIZIZ()) {
                tuxTextView.setTuxFont(62);
                tuxTextView.setMinTextSize(8.0f);
                tuxTextView.setMaxLines(1);
                tuxTextView.setEllipsize(null);
            } else {
                tuxTextView.setMaxLines(5);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            }
            this.LLJLILLLLZIIL = tuxTextView;
        }
        if (C268330AfP.LIZLLL()) {
            this.LLJLLIL.getValue().getClass();
            layoutParams.topMargin = C1248230iaT.LJII();
            this.LLJLLIL.getValue().getClass();
            layoutParams.bottomMargin = C1248230iaT.LJI();
            this.LLJLLIL.getValue().getClass();
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        }
        TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
        if (tuxTextView2 != null) {
            C786410Ut5.R6(tuxTextView2, layoutParams);
            tuxTextView2.setGravity(17);
            tuxTextView2.setId(R.id.s0c);
        }
        C1248870ibV.LIZJ(this.LLJLILLLLZIIL, profileComponentUIConfig, false, true);
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C08JS.LIZ(nVar.toString(), BizBaseData.class);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent
    public final void up(View view) {
        IHeaderBioAbility iHeaderBioAbility;
        if (view != null && (iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderBioAbility.tX1(this.LLJILLL, view, str);
        }
    }
}
