package com.ss.android.ugc.profile.platform.business.header.business.cta.assemble;

import X.C01GW;
import X.C036E;
import X.C08XD;
import X.C1247530iZL;
import X.C1248230iaT;
import X.C1248870ibV;
import X.C1248950ibd;
import X.C1249870id7;
import X.C1249900idA;
import X.C1249940idE;
import X.C1249950idF;
import X.C1251910igP;
import X.C12ES;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1720106oR;
import X.C19252910Tv;
import X.C1954807lC;
import X.C20094213jo;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2532609wC;
import X.C2537109wv;
import X.C255930A1f;
import X.C268330AfP;
import X.C287540BOu;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426770GoN;
import X.C452501pT;
import X.C487280J9a;
import X.C724240Sb0;
import X.C725080ScM;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1249860id6;
import X.EnumC1249890id9;
import X.EnumC1249910idB;
import X.InterfaceC1249220ic4;
import X.InterfaceC487330J9f;
import X.InterfaceC723720SaA;
import X.ViewOnLayoutChangeListenerC1265870j2v;
import Y.ACListenerS154S0100000_19;
import Y.AComparatorS516S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.DynamicDrawableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.loading.IUserPageLoadingAbility;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS127S0101000_19;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileHeaderCTABaseComponent extends HeaderBaseContainerComponent implements IHeaderCTAAbility, InterfaceC487330J9f {
    public boolean LLJLLL;
    public Context LLJZ;
    public float LLJZIJLIL;
    public boolean LLLIIII;
    public final Map<String, EnumC1249890id9> LLJJLIIIJLLLLLLLZ = new LinkedHashMap();
    public final Map<String, C1249950idF> LLJL = new LinkedHashMap();
    public final List<String> LLJLIL = new ArrayList();
    public final List<String> LLJLILLLLZIIL = new ArrayList();
    public final List<String> LLJLL = new ArrayList();
    public final List<String> LLJLLIL = new ArrayList();
    public int LLL = 15;
    public final List<C1247530iZL> LLLF = new ArrayList();
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2508));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2512));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2513));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2511));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2510));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(557));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2509));
    public final ViewOnLayoutChangeListenerC1265870j2v LLLIIL = new ViewOnLayoutChangeListenerC1265870j2v(this, 6);
    public final C01GW LLLIILIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 974));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
    }

    public final void Fp() {
        List<C1247530iZL> list;
        ((ArrayList) this.LLLF).clear();
        ArrayList arrayList = (ArrayList) this.LLJLL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS516S0100000_19(this, 6));
        }
        for (Object obj : (ArrayList) this.LLJLL) {
            if (Intrinsics.LJFF(obj, "cta_social_entrance")) {
                C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(obj);
                if (c1249950idF != null && (list = c1249950idF.LJIIIZ) != null) {
                    ((ArrayList) this.LLLF).addAll(list);
                }
            } else {
                C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(obj);
                if (c1249950idF2 != null) {
                    List<C1247530iZL> list2 = this.LLLF;
                    Integer num = c1249950idF2.LIZLLL;
                    String str = c1249950idF2.LJ;
                    Function0<Unit> function0 = c1249950idF2.LJFF;
                    C1247530iZL c1247530iZL = new C1247530iZL();
                    c1247530iZL.LIZJ(num != null ? num.intValue() : 0);
                    if (str == null) {
                        str = "";
                    }
                    c1247530iZL.LIZ = str;
                    c1247530iZL.LIZ(new AwS598S0100000_19(function0, (Function0<Unit>) 773));
                    ((ArrayList) list2).add(c1247530iZL);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void cp() {
        View view;
        super.cp();
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            Object parent = viewGroup.getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null) {
                return;
            }
            view.addOnLayoutChangeListener(this.LLLIIL);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        Context context;
        Activity activityLIZ;
        super.onCreate();
        Context context2 = getContext();
        if (context2 == null) {
            return;
        }
        this.LLJZ = context2;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        InterfaceC1249220ic4 interfaceC1249220ic4LJI = c19252910Tv.LIZLLL().LJI();
        Context context3 = this.LLJZ;
        if (context3 == null) {
            context3 = null;
        }
        int iLJIIJ = C12ES.LJIIJ(context3);
        Context context4 = this.LLJZ;
        if (context4 == null) {
            context4 = null;
        }
        this.LLJZIJLIL = interfaceC1249220ic4LJI.LLLFFI(iLJIIJ, context4.getResources().getConfiguration().orientation) - (C418440Gaw.LIZIZ(16) * 2);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderCTAAbility.class, null, null);
        }
        if (!c19252910Tv.LIZLLL().LJI().LJI() || (context = getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        C487280J9a.LIZ(activityLIZ.hashCode(), this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IHeaderCTAAbility.class, null);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
        ViewGroup viewGroup2 = this.LLJJIJIIJIL;
        if (viewGroup2 != null) {
            viewGroup2.removeOnLayoutChangeListener(this.LLLIIL);
        }
        if (!C268330AfP.LJIIIZ() || (viewGroup = this.LLJJIJIIJIL) == null) {
            return;
        }
        C786410Ut5.LJLZ(8, viewGroup);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ap(boolean r6) {
        /*
            r5 = this;
            X.0Q7z r2 = X.C1558520qew.LJIIL(r5)
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility> r0 = com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r2, r0, r1)
            com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility r0 = (com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility) r0
            if (r0 == 0) goto L2a
            boolean r0 = r0.q1()
            r4 = 1
            if (r0 != r4) goto L2a
        L16:
            X.0iVo r3 = X.C1245340iVo.LIZ
            X.0iah r2 = X.EnumC1248370iah.CTA
            java.lang.String r1 = "HAS_MORE_OPTION"
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            r3.getClass()
            r0 = 0
            X.C1245340iVo.LJIIJJI(r4, r2, r1, r6, r0)
            return
        L2a:
            r4 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.cta.assemble.ProfileHeaderCTABaseComponent.Ap(boolean):void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void B90(String str) {
        EnumC1249860id6 enumC1249860id6;
        EnumC1249860id6 enumC1249860id62;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF != null && !c1249950idF.LJI) {
            return;
        }
        C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF2 != null) {
            C1249940idE c1249940idE = c1249950idF2.LJII;
            if (c1249940idE != null && (enumC1249860id62 = c1249940idE.LL) != null) {
                int i = C1249870id7.LIZ[enumC1249860id62.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C426770GoN c426770GoN = (C426770GoN) c1249940idE.findViewById(R.id.faa);
                        if (c426770GoN != null) {
                            C786410Ut5.LLLLLLIL(c426770GoN, 8);
                        }
                        C426770GoN c426770GoN2 = (C426770GoN) c1249940idE.findViewById(R.id.fab);
                        if (c426770GoN2 != null) {
                            C786410Ut5.LLLLLLIL(c426770GoN2, 8);
                        }
                    }
                } else {
                    C786410Ut5.LLLLLLIL((C426770GoN) c1249940idE.findViewById(R.id.fae), 8);
                }
            }
            c1249950idF2.LJI = false;
        }
        C1249950idF c1249950idF3 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        Context context = null;
        if (c1249950idF3 != null) {
            enumC1249860id6 = c1249950idF3.LIZIZ;
        } else {
            enumC1249860id6 = null;
        }
        if (enumC1249860id6 == EnumC1249860id6.TEXT) {
            if ((this.LLJLLL && this.LLJZIJLIL >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(79))) || this.LLL < 15) {
                InterfaceC1249220ic4 interfaceC1249220ic4LJI = C19252910Tv.LIZIZ.LIZLLL().LJI();
                Context context2 = this.LLJZ;
                if (context2 == null) {
                    context2 = null;
                }
                int iLJIIJ = C12ES.LJIIJ(context2);
                Context context3 = this.LLJZ;
                if (context3 != null) {
                    context = context3;
                }
                this.LLJZIJLIL = interfaceC1249220ic4LJI.LLLFFI(iLJIIJ, context.getResources().getConfiguration().orientation) - (C418440Gaw.LIZIZ(16) * 2);
                this.LLL = 15;
                Bp(false);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void Bn2(String str) {
        C1249940idE c1249940idE;
        ProfilePlatformViewModel profilePlatformViewModelSo = So();
        if (profilePlatformViewModelSo != null && !profilePlatformViewModelSo.LLJILJIL) {
            C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
            if (c1249950idF != null && (c1249940idE = c1249950idF.LJII) != null) {
                C786410Ut5.d2(c1249940idE, 0);
                return;
            }
            return;
        }
        if (((ArrayList) this.LLJLIL).contains(str)) {
            return;
        }
        zp(str, false, null, false);
    }

    public final void Bp(boolean z) {
        boolean z2;
        C1249940idE c1249940idE;
        if (this.LLJLLL && z) {
            InterfaceC1249220ic4 interfaceC1249220ic4LJI = C19252910Tv.LIZIZ.LIZLLL().LJI();
            Context context = this.LLJZ;
            Context context2 = null;
            if (context == null) {
                context = null;
            }
            int iLJIIJ = C12ES.LJIIJ(context);
            Context context3 = this.LLJZ;
            if (context3 != null) {
                context2 = context3;
            }
            this.LLJZIJLIL = ((interfaceC1249220ic4LJI.LLLFFI(iLJIIJ, context2.getResources().getConfiguration().orientation) - (C418440Gaw.LIZIZ(16) * 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        }
        ((ArrayList) this.LLJLLIL).clear();
        ((ArrayList) this.LLJLILLLLZIIL).clear();
        ((ArrayList) this.LLJLL).clear();
        ArrayList arrayList = (ArrayList) this.LLJLIL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS516S0100000_19(this, 5));
        }
        ListIterator<String> listIterator = ((ArrayList) this.LLJLIL).listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(next);
            if (c1249950idF != null && (c1249940idE = c1249950idF.LJII) != null) {
                C786410Ut5.d2(c1249940idE, 8);
            }
            if (i == C1697810uHb.LJIIJ(this.LLJLIL)) {
                z2 = true;
            } else {
                z2 = false;
            }
            zp(next, z2, listIterator, true);
            i++;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final EnumC1249860id6 CJ2(String str) {
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF != null) {
            return c1249950idF.LIZIZ;
        }
        return null;
    }

    public final void Ep(ViewGroup viewGroup) {
        Fragment fragmentLJI;
        IUserPageLoadingAbility iUserPageLoadingAbility = (IUserPageLoadingAbility) this.LLLFFI.getValue();
        if (iUserPageLoadingAbility != null) {
            UserProfileAbility userProfileAbility = (UserProfileAbility) this.LLLFZ.getValue();
            if (userProfileAbility != null && !userProfileAbility.sW0()) {
                return;
            }
            UserAwemePagerAbility userAwemePagerAbility = (UserAwemePagerAbility) this.LLLI.getValue();
            if (userAwemePagerAbility != null && userAwemePagerAbility.Aw0()) {
                return;
            }
            User user = (User) this.LLLII.getValue();
            if ((user == null || !C1251910igP.LIZ(user)) && this.LLLIIII && iUserPageLoadingAbility.Mr() && (fragmentLJI = C724240Sb0.LJI(this)) != null && fragmentLJI.getContext() != null) {
                try {
                    if (C036E.LIZ.LIZIZ()) {
                        boolean zIsLoading = iUserPageLoadingAbility.isLoading();
                        viewGroup.getLocationOnScreen(new int[2]);
                        if (!zIsLoading) {
                            iUserPageLoadingAbility.wp2(r0[1] + viewGroup.getHeight());
                        } else {
                            iUserPageLoadingAbility.Gz1(r0[1] + viewGroup.getHeight());
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        dp(profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final String L92(String str) {
        CharSequence text;
        TextView textView;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF != null) {
            C1249940idE c1249940idE = c1249950idF.LJII;
            if (c1249940idE != null && (textView = c1249940idE.getTextView()) != null) {
                text = textView.getText();
            } else {
                text = null;
            }
            return String.valueOf(text);
        }
        return "";
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final C1249940idE cC2(String str) {
        EnumC1249860id6 enumC1249860id6;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF == null) {
            c1249950idF = new C1249950idF(null);
        }
        Context context = this.LLJZ;
        if (context == null) {
            context = null;
        }
        C1249940idE c1249940idE = new C1249940idE(context);
        c1249940idE.setTag(str);
        C786410Ut5.d2(c1249940idE, 8);
        C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF2 != null) {
            enumC1249860id6 = c1249950idF2.LIZIZ;
        } else {
            enumC1249860id6 = null;
        }
        c1249940idE.LIZJ(enumC1249860id6, null, AFwS207S0000000_19.get$arr$(702));
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("set view for ");
                    sbLIZ.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log(str, strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        c1249950idF.LJII = c1249940idE;
        return c1249940idE;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        ProfilePlatformViewModel profilePlatformViewModelSo;
        LinearLayout.LayoutParams layoutParams;
        int iLIZIZ;
        Context context = getContext();
        if (context != null) {
            LinearLayout linearLayout = new LinearLayout(context);
            if (C268330AfP.LJIIIZ()) {
                layoutParams = new LinearLayout.LayoutParams(-1, ((Number) this.LLLIIIIL.getValue()).intValue());
                layoutParams.gravity = 3;
                layoutParams.setMarginStart(((Number) this.LLLIIIL.getValue()).intValue());
                layoutParams.setMarginEnd(((Number) this.LLLIIIL.getValue()).intValue());
            } else {
                layoutParams = new LinearLayout.LayoutParams(-2, ((Number) this.LLLIIIIL.getValue()).intValue());
                layoutParams.gravity = 17;
                layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
            }
            this.LLLFF.getValue().getClass();
            if (C268330AfP.LJFF()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) - C1248230iaT.LIZLLL();
            } else if (C268330AfP.LJIIIZ()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            } else if (((Boolean) C2532609wC.LJI.getValue()).booleanValue()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            } else if (C2537109wv.LJFF()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
            if (iLIZIZ < 0) {
                iLIZIZ = 0;
            }
            layoutParams.topMargin = iLIZIZ;
            C786410Ut5.d6(linearLayout, layoutParams);
            linearLayout.setOrientation(0);
            this.LLJJIJIIJIL = linearLayout;
            C1248870ibV.LIZJ(linearLayout, profileComponentUIConfig, true, false);
            C19252910Tv.LIZIZ.LIZLLL().LJI().LLJLIL(this.LLJJIJIIJIL, null, null);
        }
        if (C287540BOu.LIZ() && !this.LLJILLL && (profilePlatformViewModelSo = So()) != null) {
            profilePlatformViewModelSo.TQ2(new AwS598S0100000_19(this, 774));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final C1249940idE kN(String str) {
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF != null) {
            return c1249950idF.LJII;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void ky2(String str) {
        boolean z;
        C1249940idE c1249940idE;
        C1249940idE c1249940idE2;
        ProfilePlatformViewModel profilePlatformViewModelSo = So();
        if (profilePlatformViewModelSo != null && !profilePlatformViewModelSo.LLJILJIL) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
            if (c1249950idF != null && (c1249940idE2 = c1249950idF.LJII) != null) {
                C786410Ut5.d2(c1249940idE2, 8);
                return;
            }
            return;
        }
        if (!((ArrayList) this.LLJLIL).contains(str)) {
            return;
        }
        ((ArrayList) this.LLJLIL).remove(str);
        ((ArrayList) this.LLJLLIL).remove(str);
        if (((ArrayList) this.LLJLILLLLZIIL).contains(str)) {
            ((ArrayList) this.LLJLILLLLZIIL).remove(str);
        }
        if (((ArrayList) this.LLJLL).contains(str)) {
            ((ArrayList) this.LLJLL).remove(str);
        }
        C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF2 != null && (c1249940idE = c1249950idF2.LJII) != null) {
            C786410Ut5.d2(c1249940idE, 8);
        }
        if (this.LLL == 15 && ((ArrayList) this.LLJLL).isEmpty()) {
            return;
        }
        if (((ArrayList) this.LLJLL).contains(str)) {
            if (((ArrayList) this.LLJLL).size() > 2) {
                ((ArrayList) this.LLJLL).remove(str);
                Fp();
                return;
            } else if (((ArrayList) this.LLJLL).size() == 2) {
                Bp(false);
                return;
            } else {
                Bp(false);
                return;
            }
        }
        if (!((ArrayList) this.LLJLILLLLZIIL).contains(str)) {
            return;
        }
        InterfaceC1249220ic4 interfaceC1249220ic4LJI = C19252910Tv.LIZIZ.LIZLLL().LJI();
        Context context = this.LLJZ;
        Context context2 = null;
        if (context == null) {
            context = null;
        }
        int iLJIIJ = C12ES.LJIIJ(context);
        Context context3 = this.LLJZ;
        if (context3 != null) {
            context2 = context3;
        }
        this.LLJZIJLIL = interfaceC1249220ic4LJI.LLLFFI(iLJIIJ, context2.getResources().getConfiguration().orientation) - (C418440Gaw.LIZIZ(16) * 2);
        this.LLL = 15;
        Bp(false);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void sp(String str) {
        yp(str);
    }

    public final void yp(String str) {
        ProfileComponents profileComponents;
        List<? extends ProfileComponents> list;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF == null) {
            c1249950idF = new C1249950idF(null);
        }
        EnumC1249890id9 enumC1249890id9 = (EnumC1249890id9) ((LinkedHashMap) this.LLJJLIIIJLLLLLLLZ).get(str);
        c1249950idF.LIZJ = enumC1249890id9;
        int i = -1;
        if (enumC1249890id9 != null) {
            int i2 = C1249900idA.LIZ[enumC1249890id9.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    c1249950idF.LIZIZ = EnumC1249860id6.TEXT;
                }
            } else {
                c1249950idF.LIZIZ = EnumC1249860id6.ICON;
            }
        }
        C1248950ibd c1248950ibdMp = mp();
        if (c1248950ibdMp != null && (profileComponents = c1248950ibdMp.LLILLJJLI) != null && (list = profileComponents.components) != null) {
            Iterator<? extends ProfileComponents> it2 = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it2.next().componentId, str)) {
                    i = i3;
                    break;
                }
                i3++;
            }
        }
        c1249950idF.LIZ = i;
        this.LLJL.put(str, c1249950idF);
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("put value to map: key: ");
                    sbLIZ.append(getKey());
                    sbLIZ.append(", ");
                    sbLIZ.append(c1249950idF);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i4 = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("BaseContainerComponent", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LLJILJIL.put(str, str);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void HL1(Integer num, String str) {
        C1249950idF c1249950idF;
        C1249940idE c1249940idE;
        int i;
        int iIntValue;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIIJ().isPad() != 1 || (c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str)) == null || (c1249940idE = c1249950idF.LJII) == null) {
            return;
        }
        EnumC1249890id9 enumC1249890id9 = c1249950idF.LIZJ;
        if (enumC1249890id9 == null) {
            i = -1;
        } else {
            i = C1249900idA.LIZ[enumC1249890id9.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                c1249950idF.LIZIZ = EnumC1249860id6.TEXT;
            }
        } else {
            c1249950idF.LIZIZ = EnumC1249860id6.ICON;
        }
        EnumC1249860id6 enumC1249860id6 = c1249950idF.LIZIZ;
        if (enumC1249860id6 != null) {
            c1249940idE.LIZ(enumC1249860id6);
        }
        InterfaceC1249220ic4 interfaceC1249220ic4LJI = c19252910Tv.LIZLLL().LJI();
        Context context = this.LLJZ;
        Context context2 = null;
        if (context == null) {
            context = null;
        }
        int iLJIIJ = C12ES.LJIIJ(context);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            Context context3 = this.LLJZ;
            if (context3 != null) {
                context2 = context3;
            }
            iIntValue = context2.getResources().getConfiguration().orientation;
        }
        this.LLJZIJLIL = interfaceC1249220ic4LJI.LLLFFI(iLJIIJ, iIntValue) - (C418440Gaw.LIZIZ(16) * 2);
        Bp(false);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void Jo0(String str, List<C1247530iZL> list) {
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF != null) {
            c1249950idF.LJIIIZ = list;
        }
        Fp();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void N90(Integer num, String str) {
        C1249940idE c1249940idE;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF != null && (c1249940idE = c1249950idF.LJII) != null && num != null) {
            num.intValue();
            ((TuxIconView) c1249940idE.findViewById(R.id.fa_)).setIconRes(num.intValue());
            int iIntValue = num.intValue();
            C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
            if (c1249950idF2 != null) {
                c1249950idF2.LIZLLL = Integer.valueOf(iIntValue);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void OF(final CharSequence charSequence, String str) {
        C1249940idE c1249940idE;
        final String str2;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF != null && (c1249940idE = c1249950idF.LJII) != null) {
            C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
            if (c1249950idF2 != null) {
                str2 = c1249950idF2.LJ;
            } else {
                str2 = null;
            }
            q0.LJIJ(c1249940idE, new C20094213jo() { // from class: X.0ejt
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(charSequence);
                    accessibilityNodeInfoCompat.setContentDescription(str2);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void Pc1(String str, Function0<Unit> function0) {
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF != null) {
            C1249940idE c1249940idE = c1249950idF.LJII;
            if (c1249940idE != null) {
                C786410Ut5.gb(c1249940idE, new ACListenerS154S0100000_19(function0, 253));
            }
            c1249950idF.LJFF = function0;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void R91(String str, EnumC1249860id6 enumC1249860id6) {
        C1249940idE c1249940idE;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF != null && (c1249940idE = c1249950idF.LJII) != null) {
            c1249940idE.LIZ(enumC1249860id6);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void eB(final CharSequence charSequence, String str) {
        C1249940idE c1249940idE;
        final String str2;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF != null && (c1249940idE = c1249950idF.LJII) != null) {
            C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
            if (c1249950idF2 != null) {
                str2 = c1249950idF2.LJ;
            } else {
                str2 = null;
            }
            q0.LJIJ(c1249940idE, new C20094213jo() { // from class: X.0idG
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setRoleDescription(charSequence);
                    accessibilityNodeInfoCompat.setContentDescription(str2);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void fX0(String str, EnumC1249910idB enumC1249910idB) {
        C1249940idE c1249940idE;
        View viewFindViewById;
        int i;
        Drawable drawable;
        C1249940idE c1249940idE2;
        View viewFindViewById2;
        Drawable drawable2;
        C1249940idE c1249940idE3;
        Drawable drawable3;
        View viewFindViewById3;
        View viewFindViewById4;
        Drawable drawable4;
        int i2 = C1249900idA.LIZJ[enumC1249910idB.ordinal()];
        if (i2 != 1) {
            int i3 = R.drawable.d08;
            if (i2 != 2) {
                if (i2 == 3) {
                    C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
                    if (c1249950idF != null && (c1249940idE3 = c1249950idF.LJII) != null) {
                        if (!C268330AfP.LJIIIZ()) {
                            if (c1249940idE3.LIZLLL()) {
                                viewFindViewById4 = c1249940idE3.findViewById(R.id.fa9);
                            } else {
                                viewFindViewById4 = c1249940idE3.findViewById(R.id.fa8);
                            }
                            if (C255930A1f.LIZ()) {
                                drawable4 = c1249940idE3.LIZIZ(R.attr.br);
                            } else {
                                drawable4 = c1249940idE3.getContext().getResources().getDrawable(R.drawable.d08, c1249940idE3.getContext().getTheme());
                            }
                            viewFindViewById4.setBackground(drawable4);
                            ((TuxTextView) c1249940idE3.findViewById(R.id.fad)).setTextColorRes(R.attr.ee);
                            return;
                        }
                        if (C255930A1f.LIZ() || C268330AfP.LJFF()) {
                            drawable3 = c1249940idE3.LIZIZ(R.attr.a04);
                        } else {
                            drawable3 = c1249940idE3.getContext().getResources().getDrawable(R.drawable.d07, c1249940idE3.getContext().getTheme());
                        }
                        drawable3.setAlpha(66);
                        if (c1249940idE3.LIZLLL()) {
                            viewFindViewById3 = c1249940idE3.findViewById(R.id.fa9);
                        } else {
                            viewFindViewById3 = c1249940idE3.findViewById(R.id.fa8);
                        }
                        viewFindViewById3.setBackground(drawable3);
                        ((TuxTextView) c1249940idE3.findViewById(R.id.fad)).setTextColorRes(R.attr.ee);
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
            if (c1249950idF2 == null || (c1249940idE2 = c1249950idF2.LJII) == null) {
                return;
            }
            if (c1249940idE2.LIZLLL()) {
                viewFindViewById2 = c1249940idE2.findViewById(R.id.fa9);
            } else {
                viewFindViewById2 = c1249940idE2.findViewById(R.id.fa8);
            }
            if (C255930A1f.LIZ() || C268330AfP.LJFF()) {
                drawable2 = c1249940idE2.LIZIZ(R.attr.br);
            } else {
                Resources resources = c1249940idE2.getContext().getResources();
                if (C268330AfP.LJIIIZ()) {
                    i3 = R.drawable.d09;
                }
                drawable2 = resources.getDrawable(i3, c1249940idE2.getContext().getTheme());
            }
            viewFindViewById2.setBackground(drawable2);
            ((TuxTextView) c1249940idE2.findViewById(R.id.fad)).setTextColorRes(R.attr.a1h);
            return;
        }
        C1249950idF c1249950idF3 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF3 == null || (c1249940idE = c1249950idF3.LJII) == null) {
            return;
        }
        if (c1249940idE.LIZLLL()) {
            viewFindViewById = c1249940idE.findViewById(R.id.fa9);
        } else {
            viewFindViewById = c1249940idE.findViewById(R.id.fa8);
        }
        if (C255930A1f.LIZ() || C268330AfP.LJFF()) {
            drawable = c1249940idE.LIZIZ(R.attr.a04);
        } else {
            Resources resources2 = c1249940idE.getContext().getResources();
            if (C268330AfP.LJIIIZ()) {
                i = R.drawable.d0a;
            } else {
                i = R.drawable.d0_;
            }
            drawable = resources2.getDrawable(i, c1249940idE.getContext().getTheme());
        }
        viewFindViewById.setBackground(drawable);
        ((TuxTextView) c1249940idE.findViewById(R.id.fad)).setTextColorRes(R.attr.ee);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void k82(int i, String str) {
        C1249940idE c1249940idE;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF == null || c1249950idF.LJII == null) {
            yp(str);
        }
        C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF2 != null && (c1249940idE = c1249950idF2.LJII) != null) {
            HeaderBaseContainerComponent.bp(this, str, i, c1249940idE, null, null, false, 56);
            if (C268330AfP.LJFF()) {
                ((ViewGroup.MarginLayoutParams) c1249940idE.getLayoutParams()).setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            } else {
                if (!C268330AfP.LJIIIZ()) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) c1249940idE.getLayoutParams()).setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            }
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C19252910Tv.LIZIZ.LIZLLL().LJI().LLJLIL(this.LLJJIJIIJIL, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
    }

    public final float up(int i, String str) {
        if (str == null) {
            return 0.0f;
        }
        ((TextView) this.LLLIILIL.getValue()).setTextSize(i);
        return ((TextView) this.LLLIILIL.getValue()).getPaint().measureText(str) + (C418440Gaw.LIZIZ(20) * 2);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void va1(String str, String str2) {
        C1249940idE c1249940idE;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        C1249940idE c1249940idE2 = null;
        if (c1249950idF != null) {
            c1249940idE = c1249950idF.LJII;
        } else {
            c1249940idE = null;
        }
        C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str2);
        if (c1249950idF2 != null) {
            c1249940idE2 = c1249950idF2.LJII;
        }
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("map value of first: ");
                    sbLIZ.append(((LinkedHashMap) this.LLJL).get(str));
                    sbLIZ.append(", second: ");
                    sbLIZ.append(((LinkedHashMap) this.LLJL).get(str2));
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("BaseContainerComponent", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (!Intrinsics.LJFF(c1249940idE, c1249940idE2)) {
            ViewGroup viewGroup = this.LLJJIJIIJIL;
            if (viewGroup != null && viewGroup.indexOfChild(c1249940idE) == 0) {
                return;
            }
            ViewGroup viewGroup2 = this.LLJJIJIIJIL;
            if (viewGroup2 != null) {
                C786410Ut5.LJJJLZIJ(c1249940idE, viewGroup2);
            }
            ViewGroup viewGroup3 = this.LLJJIJIIJIL;
            if (viewGroup3 == null) {
                return;
            }
            viewGroup3.addView(c1249940idE, 0);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void w90(String str, String str2) {
        CharSequence text;
        String str3;
        C1249940idE c1249940idE;
        TextView textView;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        Context context = null;
        if (c1249950idF != null && (c1249940idE = c1249950idF.LJII) != null && (textView = c1249940idE.getTextView()) != null) {
            text = textView.getText();
        } else {
            text = null;
        }
        if (TextUtils.equals(str2, text)) {
            return;
        }
        C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF2 != null) {
            str3 = c1249950idF2.LJ;
        } else {
            str3 = null;
        }
        float fUp = up(this.LLL, str3);
        float fUp2 = up(this.LLL, str2);
        C1249950idF c1249950idF3 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF3 != null) {
            C1249940idE c1249940idE2 = c1249950idF3.LJII;
            if (c1249940idE2 != null && str2 != null) {
                ((TextView) c1249940idE2.findViewById(R.id.fad)).setText(str2);
            }
            Map<Integer, Float> map = c1249950idF3.LJIIIIZZ;
            if (map != null) {
                map.clear();
            }
            if (str2 != null) {
                c1249950idF3.LJ = str2;
            }
        }
        if (fUp < fUp2) {
            if (fUp2 - fUp > this.LLJZIJLIL) {
                InterfaceC1249220ic4 interfaceC1249220ic4LJI = C19252910Tv.LIZIZ.LIZLLL().LJI();
                Context context2 = this.LLJZ;
                if (context2 == null) {
                    context2 = null;
                }
                int iLJIIJ = C12ES.LJIIJ(context2);
                Context context3 = this.LLJZ;
                if (context3 != null) {
                    context = context3;
                }
                this.LLJZIJLIL = interfaceC1249220ic4LJI.LLLFFI(iLJIIJ, context.getResources().getConfiguration().orientation) - (C418440Gaw.LIZIZ(16) * 2);
                this.LLL = 15;
                Bp(true);
                return;
            }
            return;
        }
        if (fUp <= fUp2) {
            return;
        }
        if ((!this.LLJLLL || this.LLJZIJLIL + (fUp - fUp2) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96))) && this.LLL >= 15) {
            return;
        }
        InterfaceC1249220ic4 interfaceC1249220ic4LJI2 = C19252910Tv.LIZIZ.LIZLLL().LJI();
        Context context4 = this.LLJZ;
        if (context4 == null) {
            context4 = null;
        }
        int iLJIIJ2 = C12ES.LJIIJ(context4);
        Context context5 = this.LLJZ;
        if (context5 != null) {
            context = context5;
        }
        this.LLJZIJLIL = interfaceC1249220ic4LJI2.LLLFFI(iLJIIJ2, context.getResources().getConfiguration().orientation) - (C418440Gaw.LIZIZ(16) * 2);
        this.LLL = 15;
        Bp(false);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void ws2(String str, AwS563S0100000_19 awS563S0100000_19) {
        C1249940idE c1249940idE;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF != null && (c1249940idE = c1249950idF.LJII) != null) {
            c1249940idE.setIconDebounceOnClickListener(new AwS563S0100000_19(awS563S0100000_19, 3097));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void xm1(CharSequence charSequence, String str) {
        C1249940idE c1249940idE;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF != null && (c1249940idE = c1249950idF.LJII) != null) {
            c1249940idE.setContentDescription(charSequence);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void yG(String str, AwS127S0101000_19 awS127S0101000_19) {
        C1249940idE c1249940idE;
        View viewFindViewById;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF != null && (c1249940idE = c1249950idF.LJII) != null && (viewFindViewById = c1249940idE.findViewById(R.id.fa_)) != null) {
            awS127S0101000_19.invoke(viewFindViewById);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void Ow1(int i, int i2, String str) {
        boolean z;
        EnumC1249860id6 enumC1249860id6;
        EnumC1249860id6 enumC1249860id62;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF != null) {
            z = c1249950idF.LJI;
        } else {
            z = false;
        }
        C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF2 != null) {
            C1249940idE c1249940idE = c1249950idF2.LJII;
            if (c1249940idE != null && (enumC1249860id62 = c1249940idE.LL) != null) {
                int i3 = C1249870id7.LIZ[enumC1249860id62.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (i != 0) {
                            if (i != 1) {
                                C426770GoN c426770GoN = (C426770GoN) c1249940idE.findViewById(R.id.faa);
                                if (c426770GoN != null) {
                                    C786410Ut5.LLLLLLIL(c426770GoN, 8);
                                }
                                C426770GoN c426770GoN2 = (C426770GoN) c1249940idE.findViewById(R.id.fab);
                                if (c426770GoN2 != null) {
                                    C786410Ut5.LLLLLLIL(c426770GoN2, 8);
                                }
                                int i4 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Error displaying CTA ICON alert badge! alertType ");
                                sbLIZ.append(i);
                                C1720106oR.LIZ("CTASingleComponentView", C2188811AlT.LIZIZ(sbLIZ));
                            } else {
                                C426770GoN c426770GoN3 = (C426770GoN) c1249940idE.findViewById(R.id.faa);
                                if (c426770GoN3 != null) {
                                    c426770GoN3.setVariant(1);
                                    c426770GoN3.setCount(i2);
                                    C786410Ut5.LLLLLLIL(c426770GoN3, 0);
                                }
                                C426770GoN c426770GoN4 = (C426770GoN) c1249940idE.findViewById(R.id.fab);
                                if (c426770GoN4 != null) {
                                    C786410Ut5.LLLLLLIL(c426770GoN4, 8);
                                }
                            }
                        } else {
                            C426770GoN c426770GoN5 = (C426770GoN) c1249940idE.findViewById(R.id.fab);
                            if (c426770GoN5 != null) {
                                c426770GoN5.setVariant(0);
                                C786410Ut5.LLLLLLIL(c426770GoN5, 0);
                            }
                            C426770GoN c426770GoN6 = (C426770GoN) c1249940idE.findViewById(R.id.faa);
                            if (c426770GoN6 != null) {
                                C786410Ut5.LLLLLLIL(c426770GoN6, 8);
                            }
                        }
                    }
                } else {
                    C426770GoN c426770GoN7 = (C426770GoN) c1249940idE.findViewById(R.id.fae);
                    c426770GoN7.setVariant(i);
                    c426770GoN7.setCount(i2);
                    C786410Ut5.LLLLLLIL(c426770GoN7, 0);
                }
            }
            c1249950idF2.LJI = true;
        }
        if (!z && this.LLJZIJLIL < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17))) {
            C1249950idF c1249950idF3 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
            Context context = null;
            if (c1249950idF3 != null) {
                enumC1249860id6 = c1249950idF3.LIZIZ;
            } else {
                enumC1249860id6 = null;
            }
            if (enumC1249860id6 == EnumC1249860id6.TEXT) {
                InterfaceC1249220ic4 interfaceC1249220ic4LJI = C19252910Tv.LIZIZ.LIZLLL().LJI();
                Context context2 = this.LLJZ;
                if (context2 == null) {
                    context2 = null;
                }
                int iLJIIJ = C12ES.LJIIJ(context2);
                Context context3 = this.LLJZ;
                if (context3 != null) {
                    context = context3;
                }
                this.LLJZIJLIL = interfaceC1249220ic4LJI.LLLFFI(iLJIIJ, context.getResources().getConfiguration().orientation) - (C418440Gaw.LIZIZ(16) * 2);
                this.LLL = 15;
                Bp(true);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void um2(int i, String str, boolean z) {
        C1249940idE c1249940idE;
        C1249950idF c1249950idF;
        C1249940idE c1249940idE2;
        ViewGroup.LayoutParams layoutParams;
        if (z && (c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str)) != null && (c1249940idE2 = c1249950idF.LJII) != null && (layoutParams = c1249940idE2.getLayoutParams()) != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        }
        C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF2 != null && (c1249940idE = c1249950idF2.LJII) != null) {
            c1249940idE.setComponentWidth(i);
        }
    }

    public final void zp(String str, boolean z, ListIterator<String> listIterator, boolean z2) {
        C1249940idE c1249940idE;
        boolean z3;
        int i;
        int i2;
        C1249940idE c1249940idE2;
        EnumC1249860id6 enumC1249860id6;
        C1249950idF c1249950idF;
        C1249940idE c1249940idE3;
        float fFloatValue;
        Float f;
        EnumC1249860id6 enumC1249860id62;
        String str2;
        Map<Integer, Float> map;
        float fFloatValue2;
        String str3;
        Map<Integer, Float> map2;
        float fFloatValue3;
        Map<Integer, Float> map3;
        Float f2;
        Map<Integer, Float> map4;
        Map<Integer, Float> map5;
        Float f3;
        Map<Integer, Float> map6;
        int i3;
        int i4;
        C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
        if (c1249950idF2 == null || (c1249940idE = c1249950idF2.LJII) == null) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LLJLL).iterator();
        while (it2.hasNext()) {
            C1249950idF c1249950idF3 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(it2.next());
            if (c1249950idF3 != null) {
                i3 = c1249950idF3.LIZ;
            } else {
                i3 = -1;
            }
            C1249950idF c1249950idF4 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
            if (c1249950idF4 != null) {
                i4 = c1249950idF4.LIZ;
            } else {
                i4 = -1;
            }
            if (i3 < i4) {
                ((ArrayList) this.LLJLL).add(str);
                Fp();
                return;
            }
        }
        int i5 = this.LLL;
        while (i5 >= 12) {
            i5--;
            EnumC1249860id6 enumC1249860id63 = c1249950idF2.LIZIZ;
            if (enumC1249860id63 != null) {
                int i6 = C1249900idA.LIZIZ[enumC1249860id63.ordinal()];
                if (i6 != 1 && i6 != 2) {
                    if (i6 != 3) {
                        break;
                    } else {
                        fFloatValue = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                    }
                } else {
                    Map<Integer, Float> map7 = c1249950idF2.LJIIIIZZ;
                    if (map7 == null || map7.get(Integer.valueOf(i5 + 1)) == null) {
                        int i7 = i5 + 1;
                        float fUp = up(i7, c1249950idF2.LJ) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * 2);
                        if (c1249950idF2.LJI) {
                            fUp += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17));
                        }
                        Map<Integer, Float> map8 = c1249950idF2.LJIIIIZZ;
                        if (map8 != null) {
                            map8.put(Integer.valueOf(i7), Float.valueOf(fUp));
                        }
                    }
                    Map<Integer, Float> map9 = c1249950idF2.LJIIIIZZ;
                    if (map9 != null && (f = map9.get(Integer.valueOf(i5 + 1))) != null) {
                        fFloatValue = f.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                }
                float fLIZIZ = fFloatValue + 0.0f + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                float f4 = this.LLJZIJLIL;
                if (f4 > fLIZIZ) {
                    this.LLJZIJLIL = f4 - fLIZIZ;
                } else {
                    for (Object obj : (ArrayList) this.LLJLILLLLZIIL) {
                        C1249950idF c1249950idF5 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(obj);
                        if (c1249950idF5 != null) {
                            enumC1249860id62 = c1249950idF5.LIZIZ;
                        } else {
                            enumC1249860id62 = null;
                        }
                        if (enumC1249860id62 == EnumC1249860id6.TEXT) {
                            C1249950idF c1249950idF6 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(obj);
                            if (c1249950idF6 == null || (map6 = c1249950idF6.LJIIIIZZ) == null || map6.get(Integer.valueOf(i5 + 1)) == null) {
                                C1249950idF c1249950idF7 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(obj);
                                if (c1249950idF7 != null) {
                                    str2 = c1249950idF7.LJ;
                                } else {
                                    str2 = null;
                                }
                                int i8 = i5 + 1;
                                float fUp2 = up(i8, str2);
                                C1249950idF c1249950idF8 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(obj);
                                if (c1249950idF8 != null && (map = c1249950idF8.LJIIIIZZ) != null) {
                                    map.put(Integer.valueOf(i8), Float.valueOf(fUp2));
                                }
                            }
                            C1249950idF c1249950idF9 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(obj);
                            if (c1249950idF9 != null && (map5 = c1249950idF9.LJIIIIZZ) != null && (f3 = map5.get(Integer.valueOf(i5 + 1))) != null) {
                                fFloatValue2 = f3.floatValue();
                            } else {
                                fFloatValue2 = 0.0f;
                            }
                            C1249950idF c1249950idF10 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(obj);
                            if (c1249950idF10 == null || (map4 = c1249950idF10.LJIIIIZZ) == null || map4.get(Integer.valueOf(i5)) == null) {
                                C1249950idF c1249950idF11 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(obj);
                                if (c1249950idF11 != null) {
                                    str3 = c1249950idF11.LJ;
                                } else {
                                    str3 = null;
                                }
                                float fUp3 = up(i5, str3);
                                C1249950idF c1249950idF12 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(obj);
                                if (c1249950idF12 != null && (map2 = c1249950idF12.LJIIIIZZ) != null) {
                                    map2.put(Integer.valueOf(i5), Float.valueOf(fUp3));
                                }
                            }
                            C1249950idF c1249950idF13 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(obj);
                            if (c1249950idF13 != null && (map3 = c1249950idF13.LJIIIIZZ) != null && (f2 = map3.get(Integer.valueOf(i5))) != null) {
                                fFloatValue3 = f2.floatValue();
                            } else {
                                fFloatValue3 = 0.0f;
                            }
                            this.LLJZIJLIL += fFloatValue2 - fFloatValue3;
                        }
                    }
                    if (i5 < 12) {
                        if (c1249950idF2.LIZIZ == EnumC1249860id6.ICON) {
                            break;
                        }
                        if (c1249950idF2.LIZIZ == EnumC1249860id6.TEXT && this.LLJZIJLIL >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))) {
                            this.LLJZIJLIL -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                            EnumC1249860id6 enumC1249860id64 = EnumC1249860id6.ICON;
                            c1249950idF2.LIZIZ = enumC1249860id64;
                            C1249940idE c1249940idE4 = c1249950idF2.LJII;
                            if (c1249940idE4 != null) {
                                c1249940idE4.LIZ(enumC1249860id64);
                            }
                        }
                    }
                }
                z3 = true;
                break;
            }
            break;
        }
        z3 = false;
        if (z3) {
            C786410Ut5.d2(c1249940idE, 0);
            if (!((ArrayList) this.LLJLIL).contains(str)) {
                if (z2) {
                    if (listIterator != null) {
                        listIterator.add(str);
                    }
                } else {
                    ((ArrayList) this.LLJLIL).add(str);
                }
            }
            if (!((ArrayList) this.LLJLILLLLZIIL).contains(str)) {
                ((ArrayList) this.LLJLILLLLZIIL).add(str);
            }
            ((ArrayList) this.LLJLLIL).add(str);
            int i9 = i5 + 1;
            if (this.LLL != i9) {
                for (Object obj2 : (ArrayList) this.LLJLILLLLZIIL) {
                    C1249950idF c1249950idF14 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(obj2);
                    if (c1249950idF14 != null) {
                        enumC1249860id6 = c1249950idF14.LIZIZ;
                    } else {
                        enumC1249860id6 = null;
                    }
                    if (enumC1249860id6 == EnumC1249860id6.TEXT && (c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(obj2)) != null && (c1249940idE3 = c1249950idF.LJII) != null) {
                        ((TuxTextView) c1249940idE3.findViewById(R.id.fad)).LJJJJI(i9);
                    }
                }
                this.LLL = i9;
            }
            if (((ArrayList) this.LLJLL).isEmpty() && z) {
                this.LLJLLL = false;
                C1249950idF c1249950idF15 = (C1249950idF) ((LinkedHashMap) this.LLJL).get("cta_more");
                if (c1249950idF15 != null && (c1249940idE2 = c1249950idF15.LJII) != null) {
                    C786410Ut5.d2(c1249940idE2, 8);
                }
                Ap(false);
                return;
            }
            return;
        }
        Iterator it3 = ((ArrayList) this.LLJLLIL).iterator();
        boolean z4 = false;
        while (it3.hasNext()) {
            C1249950idF c1249950idF16 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(it3.next());
            if (c1249950idF16 != null) {
                i = c1249950idF16.LIZ;
            } else {
                i = -1;
            }
            C1249950idF c1249950idF17 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
            if (c1249950idF17 != null) {
                i2 = c1249950idF17.LIZ;
            } else {
                i2 = -1;
            }
            if (i > i2) {
                z4 = true;
            }
        }
        if (z4) {
            InterfaceC1249220ic4 interfaceC1249220ic4LJI = C19252910Tv.LIZIZ.LIZLLL().LJI();
            Context context = this.LLJZ;
            if (context == null) {
                context = null;
            }
            int iLJIIJ = C12ES.LJIIJ(context);
            Context context2 = this.LLJZ;
            if (context2 == null) {
                context2 = null;
            }
            this.LLJZIJLIL = interfaceC1249220ic4LJI.LLLFFI(iLJIIJ, context2.getResources().getConfiguration().orientation) - (C418440Gaw.LIZIZ(16) * 2);
            this.LLL = 15;
            if (!((ArrayList) this.LLJLIL).contains(str)) {
                if (z2) {
                    if (listIterator != null) {
                        listIterator.add(str);
                    }
                } else {
                    ((ArrayList) this.LLJLIL).add(str);
                }
            }
            Bp(true);
            return;
        }
        if (this.LLJLLL) {
            if (!((ArrayList) this.LLJLIL).contains(str)) {
                if (z2) {
                    if (listIterator != null) {
                        listIterator.add(str);
                    }
                } else {
                    ((ArrayList) this.LLJLIL).add(str);
                }
            }
            if (!((ArrayList) this.LLJLL).contains(str)) {
                ((ArrayList) this.LLJLL).add(str);
            }
            Fp();
            return;
        }
        this.LLJLLL = true;
        InterfaceC1249220ic4 interfaceC1249220ic4LJI2 = C19252910Tv.LIZIZ.LIZLLL().LJI();
        Context context3 = this.LLJZ;
        if (context3 == null) {
            context3 = null;
        }
        int iLJIIJ2 = C12ES.LJIIJ(context3);
        Context context4 = this.LLJZ;
        if (context4 == null) {
            context4 = null;
        }
        this.LLJZIJLIL = ((interfaceC1249220ic4LJI2.LLLFFI(iLJIIJ2, context4.getResources().getConfiguration().orientation) - (C418440Gaw.LIZIZ(16) * 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLL = 15;
        if (!((ArrayList) this.LLJLIL).contains(str)) {
            if (z2) {
                if (listIterator != null) {
                    listIterator.add(str);
                }
            } else {
                ((ArrayList) this.LLJLIL).add(str);
            }
        }
        if (((LinkedHashMap) this.LLJL).get("cta_more") == null) {
            Context context5 = null;
            C1249950idF c1249950idF18 = new C1249950idF(null);
            Context context6 = this.LLJZ;
            if (context6 != null) {
                context5 = context6;
            }
            C1249940idE c1249940idE5 = new C1249940idE(context5);
            c1249940idE5.setTag("cta_more");
            C786410Ut5.d2(c1249940idE5, 8);
            c1249940idE5.LIZJ(EnumC1249860id6.ICON, Integer.valueOf(R.raw.icon_ellipsis_horizontal), new AwS563S0100000_19(this, 3096));
            C786410Ut5.d2(c1249940idE5, 0);
            ViewGroup viewGroup = this.LLJJIJIIJIL;
            if (viewGroup != null) {
                viewGroup.addView(c1249940idE5, viewGroup.getChildCount());
            }
            c1249950idF18.LJII = c1249940idE5;
            if (C725080ScM.LIZLLL) {
                try {
                    InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA != null) {
                        int i10 = C2187451AjH.LIZ;
                        interfaceC723720SaA.log("BaseContainerComponent", "set view for COMPONENT_ID_HEADER_CTA_MORE");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            this.LLJL.put("cta_more", c1249950idF18);
            Ap(true);
        }
        Bp(true);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void jO1(String str, String str2, Integer num, boolean z, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        C1249940idE c1249940idE;
        Integer numValueOf;
        if (str2 != null && num != null) {
            num.intValue();
            C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
            if (c1249950idF != null && (c1249940idE = c1249950idF.LJII) != null) {
                int iIntValue = num.intValue();
                TextView textView = (TextView) c1249940idE.findViewById(R.id.fad);
                int currentTextColor = textView.getCurrentTextColor();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = iIntValue;
                if (currentTextColor == -1) {
                    numValueOf = C1308910kAL.LIZJ(R.attr.a1h, c1249940idE.getContext());
                } else {
                    numValueOf = Integer.valueOf(currentTextColor);
                }
                c419910GdJ.LIZLLL = numValueOf;
                c419910GdJ.LIZIZ = i;
                c419910GdJ.LIZJ = i2;
                final TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(c1249940idE.getContext());
                tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
                DynamicDrawableSpan dynamicDrawableSpan = new DynamicDrawableSpan(tuxIconDrawableLIZ) { // from class: X.0GV5
                    public final Drawable LL;
                    public final int LLILLJJLI = 0;

                    @Override // android.text.style.DynamicDrawableSpan
                    public final Drawable getDrawable() {
                        return this.LL;
                    }

                    {
                        this.LL = tuxIconDrawableLIZ;
                    }

                    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
                        Drawable drawable = this.LL;
                        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.LL.getIntrinsicHeight());
                        return this.LL.getIntrinsicWidth() + this.LLILLJJLI;
                    }

                    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f, int i5, int i6, int i7, Paint paint) {
                        Drawable drawable = this.LL;
                        canvas.save();
                        canvas.translate(f, ((i5 + i7) / 2.0f) - (drawable.getBounds().height() / 2.0f));
                        drawable.draw(canvas);
                        canvas.restore();
                    }
                };
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append(' ');
                    spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
                    C786410Ut5.q2(spannableStringBuilder, dynamicDrawableSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(' ');
                    sbLIZ2.append(str2);
                    spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
                    C786410Ut5.q2(spannableStringBuilder, dynamicDrawableSpan, 0, 1, 33);
                }
                textView.setText(spannableStringBuilder);
            } else {
                spannableStringBuilder = null;
            }
            C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) this.LLJL).get(str);
            if (c1249950idF2 != null) {
                c1249950idF2.LJ = String.valueOf(spannableStringBuilder);
            }
        }
    }
}
