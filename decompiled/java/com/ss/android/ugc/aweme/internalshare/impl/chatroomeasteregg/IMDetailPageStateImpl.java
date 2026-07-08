package com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg;

import X.C01GW;
import X.C0HTI;
import X.C1209530ha3;
import X.C1235870iGX;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C418440Gaw;
import X.C452501pT;
import X.C555520LqY;
import X.C786410Ut5;
import X.InterfaceC494301wD;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class IMDetailPageStateImpl extends PageStateCommonComponent {
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 888));

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -721105229) {
            return null;
        }
        return this;
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
    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent
    public final C1235870iGX Go() {
        ILoadMoreAbility iLoadMoreAbilityEw0;
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || this.LLJJI.getValue() == null) {
            return null;
        }
        if (this.LLJIJIL == null) {
            Context context = fragment.getContext();
            if (context == null) {
                return null;
            }
            C1235870iGX c1235870iGX = new C1235870iGX(context, null);
            this.LLJIJIL = c1235870iGX;
            C786410Ut5.LLLLIILL(c1235870iGX, 8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            IFeedFragmentAbility iFeedFragmentAbility = (IFeedFragmentAbility) this.LLJJI.getValue();
            if (iFeedFragmentAbility != null && (iLoadMoreAbilityEw0 = iFeedFragmentAbility.Ew0()) != null) {
                iLoadMoreAbilityEw0.addView(this.LLJIJIL, layoutParams);
            }
            C1235870iGX c1235870iGX2 = this.LLJIJIL;
            if (c1235870iGX2 != null) {
                C1209530ha3 c1209530ha3LIZ = C1209530ha3.LIZ(context);
                c1209530ha3LIZ.LIZJ(2131857685);
                C1749280vcc c1749280vcc = new C1749280vcc(new ContextThemeWrapper(context, R.style.y0), null, 6);
                c1749280vcc.setLayoutVariant(1);
                c1749280vcc.setTopMargin(C418440Gaw.LIZIZ(293));
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.my;
                Drawable drawableLIZ = c0hti.LIZ(new ContextThemeWrapper(context, R.style.y0));
                c1722300uv6.LIZJ = 2;
                c1722300uv6.LIZ = drawableLIZ;
                c1722300uv6.LJI = C555520LqY.LIZIZ(2131836505);
                c1749280vcc.setStatus(c1722300uv6);
                c1209530ha3LIZ.LIZIZ(c1749280vcc);
                c1235870iGX2.setBuilder(c1209530ha3LIZ);
            }
            C1235870iGX c1235870iGX3 = this.LLJIJIL;
            if (c1235870iGX3 != null) {
                c1235870iGX3.setBackgroundColor(0);
            }
        }
        return this.LLJIJIL;
    }
}
