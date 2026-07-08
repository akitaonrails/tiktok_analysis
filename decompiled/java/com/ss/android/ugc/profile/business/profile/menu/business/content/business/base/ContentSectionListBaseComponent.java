package com.ss.android.ugc.profile.business.profile.menu.business.content.business.base;

import X.C01GW;
import X.C098200Yq;
import X.C1248270iaX;
import X.C1248860ibU;
import X.C1248950ibd;
import X.C1250210idf;
import X.C1308910kAL;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1720106oR;
import X.C189200o6;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C452501pT;
import X.C724240Sb0;
import X.C736460Sui;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.profile.business.profile.menu.ability.IContentCellAbility;
import com.ss.android.ugc.profile.business.profile.menu.ability.IPageMenuAbility;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.base.IHeaderBaseAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public class ContentSectionListBaseComponent extends HeaderBaseContainerComponent implements ISectionListAbility {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(368));
    public TuxTextView LLJL;

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void cp() {
        IHeaderBaseAbility iHeaderBaseAbility;
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup == null || (iHeaderBaseAbility = (IHeaderBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBaseAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderBaseAbility.LJIIIZ(this.LLJJ, viewGroup, str);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1248950ibd c1248950ibdMp = mp();
        dp((c1248950ibdMp == null || (profileComponents = c1248950ibdMp.LLILLJJLI) == null) ? null : profileComponents.components);
        this.LLJILJIL.size();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, ISectionListAbility.class, this.assemTagInternal, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IContentCellAbility iContentCellAbility = (IContentCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IContentCellAbility.class, null);
        if (iContentCellAbility != null) {
            iContentCellAbility.f42(this.LLJILJIL.size(), this.LLJJIJIIJIL);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), ISectionListAbility.class, this.assemTagInternal);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        up(profileComponents);
        dp(profileComponents.components);
        this.LLJILJIL.size();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        Context contextUb1;
        TuxTextView tuxTextView;
        C1308910kAL.LIZJ(R.attr.a1h, new ContextThemeWrapper(getContext(), R.style.y0));
        ProfileComponents profileComponents = null;
        IPageMenuAbility iPageMenuAbility = (IPageMenuAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPageMenuAbility.class, null);
        if (iPageMenuAbility != null) {
            contextUb1 = iPageMenuAbility.ub1();
        } else {
            contextUb1 = null;
        }
        LinearLayout linearLayout = new LinearLayout(contextUb1);
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        this.LLJJIJIIJIL = linearLayout;
        if (contextUb1 != null) {
            tuxTextView = new TuxTextView(contextUb1, null, 6, 0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            layoutParams.setMarginStart(((C1248860ibU) this.LLJJLIIIJLLLLLLLZ.getValue()).LIZ);
            layoutParams.setMarginEnd(((C1248860ibU) this.LLJJLIIIJLLLLLLLZ.getValue()).LIZ);
            C786410Ut5.R6(tuxTextView, layoutParams);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, contextUb1);
            if (numLIZJ != null) {
                tuxTextView.setTextColor(numLIZJ.intValue());
            }
            tuxTextView.setTuxFont(62);
            tuxTextView.setMaxLines(1);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            HeaderBaseContainerComponent.bp(this, "", 0, tuxTextView, null, null, false, 56);
        } else {
            tuxTextView = null;
        }
        this.LLJL = tuxTextView;
        C1248950ibd c1248950ibdMp = mp();
        if (c1248950ibdMp != null) {
            profileComponents = c1248950ibdMp.LLILLJJLI;
        }
        up(profileComponents);
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
    public final void up(ProfileComponents profileComponents) {
        String string;
        BizBaseData bizBaseData;
        TuxTextView tuxTextView;
        Object c098200Yq = null;
        String text = null;
        c098200Yq = null;
        c098200Yq = null;
        c098200Yq = null;
        c098200Yq = null;
        c098200Yq = null;
        if (profileComponents != null) {
            try {
                n nVar = profileComponents.bizData;
                if (nVar != null && (string = nVar.toString()) != null && C736460Sui.LIZIZ(string) && (bizBaseData = (BizBaseData) C1250210idf.LIZ(string, BizBaseData.class)) != null && (tuxTextView = this.LLJL) != null) {
                    Describe describe = bizBaseData.getDescribe();
                    if (describe != null) {
                        text = describe.getText();
                    }
                    tuxTextView.setText(text);
                    C1248270iaX.LIZJ(tuxTextView, bizBaseData, profileComponents.componentId, null, null, false, 28);
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                    c098200Yq = tuxTextView;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update titleView error: ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C1720106oR.LIZ("BaseContainerComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ISectionListAbility
    public final void cg(View view, int i, String str, boolean z) {
        HeaderBaseContainerComponent.bp(this, str, i + 1, view, null, null, true, 24);
    }
}
