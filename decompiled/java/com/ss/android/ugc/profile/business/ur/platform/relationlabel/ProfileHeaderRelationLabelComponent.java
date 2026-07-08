package com.ss.android.ugc.profile.business.ur.platform.relationlabel;

import X.C01GW;
import X.C0C38;
import X.C0PEM;
import X.C11NJ;
import X.C1248870ibV;
import X.C1248950ibd;
import X.C1250210idf;
import X.C1388190mED;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C2537109wv;
import X.C268330AfP;
import X.C384050F3z;
import X.C413501jB;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C487280J9a;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC487330J9f;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.profile.business.ur.platform.BioRelationLabelData;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderRelationLabelComponent extends BioBaseUIComponent<BioRelationLabelData> implements IUserProfilePlatformRelationLabelAbility, InterfaceC487330J9f {
    public TuxIconView LLJLLIL;
    public RelationLabelTextView LLJLLL;
    public LinearLayout LLJZ;
    public int LLL;
    public String LLLF;
    public String LLLFF;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2422));
    public final C11NJ LLJLL = new C11NJ();
    public final List<Object> LLJZIJLIL = new ArrayList();
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2421));
    public final C01GW LLLFZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(468));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2424));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        if (profilePlatformViewModelZo != null) {
            C736680Sv4.LJIIIIZZ(this, profilePlatformViewModelZo, new C2217381BqS() { // from class: X.0idu
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLJJJ;
                }
            }, null, new AwS633S0100000_19(this, 140), 6);
        }
        ProfilePlatformViewModel profilePlatformViewModelZo2 = Zo();
        if (profilePlatformViewModelZo2 != null) {
            profilePlatformViewModelZo2.FQ2(new AwS598S0100000_19(this, 410));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void dp() {
        ProfileComponents profileComponents;
        n nVar;
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (nVar = profileComponents.bizData) == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C413501jB(this, nVar, new AwS563S0100000_19(this, 3405), null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zp() {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.platform.relationlabel.ProfileHeaderRelationLabelComponent.zp():void");
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Ho() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IUserProfilePlatformRelationLabelAbility.class, null, null);
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((ArrayList) this.LLJZIJLIL).clear();
        this.LLL = 0;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IUserProfilePlatformRelationLabelAbility.class, null);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        ProfileComponentUIConfig profileComponentUIConfig;
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C413501jB(this, nVar, new AwS563S0100000_19(this, 2423), null), 3);
        }
        if (C0C38.LIZ() && (profileComponentUIConfig = (ProfileComponentUIConfig) this.LLJIJIL.getValue()) != null) {
            C1248870ibV.LIZJ(this.LLJJ, C1248870ibV.LIZIZ(Integer.valueOf(this.LLJILLL), profileComponentUIConfig), true, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.util.AttributeSet, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r3v39, types: [X.0ic4] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, com.ss.android.ugc.aweme.relation.label.RelationLabelTextView] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.ss.android.ugc.aweme.relation.label.RelationLabelTextView] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.0ic4] */
    /* JADX WARN: Type inference failed for: r5v6 */
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
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        ?? r1;
        int i;
        int i2;
        ?? r5;
        boolean z;
        Context context = getContext();
        TuxIconView tuxIconView = null;
        if (context != null) {
            TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            C786410Ut5.M6(tuxIconView2, layoutParams);
            r1 = 0;
            i = -2;
            i2 = 8;
            C426750GoL.LJIIIZ(tuxIconView2, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, false, 16);
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            tuxIconView2.setId(R.id.t4r);
            tuxIconView = tuxIconView2;
        } else {
            r1 = 0;
            i = -2;
            i2 = 8;
        }
        this.LLJLLIL = tuxIconView;
        Context context2 = getContext();
        if (context2 != null) {
            RelationLabelTextView relationLabelTextView = new RelationLabelTextView(context2, r1, 6);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
            layoutParams2.gravity = 16;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(relationLabelTextView);
            relationLabelTextView.setLayoutParams(layoutParams2);
            relationLabelTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(217)));
            relationLabelTextView.setMaxLines(2);
            relationLabelTextView.setTuxFont(62);
            C786410Ut5.v0(relationLabelTextView, i2);
            relationLabelTextView.setId(R.id.t4u);
            r5 = relationLabelTextView;
        } else {
            r5 = r1;
        }
        this.LLJLLL = r5;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        c19252910Tv.LIZLLL().LJI().LLILII(this.LLJLLL, r1, r1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, i));
        linearLayout.setOrientation(0);
        if (C268330AfP.LIZLLL()) {
            this.LLLFFI.getValue().getClass();
            z = false;
            C426750GoL.LJIIIZ(linearLayout, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 0, 0, false, 16);
        } else if (C268330AfP.LJIIIZ()) {
            z = false;
            C426750GoL.LJIIIZ(linearLayout, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), 0, 0, false, 16);
        } else if (C2537109wv.LJFF()) {
            z = false;
            C426750GoL.LJIIIZ(linearLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), false, 16);
        } else {
            z = false;
            C426750GoL.LJIIIZ(linearLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), false, 16);
        }
        C786410Ut5.LJZL(i2, linearLayout);
        if (!C268330AfP.LJIIIZ()) {
            linearLayout.setGravity(1);
        }
        linearLayout.setId(R.id.t4q);
        linearLayout.addView(this.LLJLLIL);
        linearLayout.addView(this.LLJLLL);
        this.LLJZ = linearLayout;
        C1248870ibV.LIZJ(this.LLJZ, C1248870ibV.LIZIZ(Integer.valueOf(this.LLJILLL), profileComponentUIConfig), true, z);
        c19252910Tv.LIZLLL().LJI().LJJJJ(this.LLJZ, r1, r1);
        ?? r4 = this.LLJLLL;
        if (r4 != 0) {
            Context context3 = getContext();
            ?? LIZ = r1;
            if (context3 != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                LIZ = c384050F3z.LIZ(context3);
            }
            r4.setBackground(LIZ);
        }
        return this.LLJZ;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C1250210idf.LIZ(nVar.toString(), BioRelationLabelData.class);
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

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        c19252910Tv.LIZLLL().LJI().LJJJJ(this.LLJZ, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
        c19252910Tv.LIZLLL().LJI().LLILII(this.LLJLLL, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
    }
}
