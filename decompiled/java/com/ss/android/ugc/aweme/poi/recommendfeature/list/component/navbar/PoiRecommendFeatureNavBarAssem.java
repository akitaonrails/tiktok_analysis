package com.ss.android.ugc.aweme.poi.recommendfeature.list.component.navbar;

import X.C0OM1;
import X.C1175120ggY;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureNavBarAssem extends BaseSlashSlotAssemComponent<PoiRecommendFeatureNavBarModule> {
    public TuxNavBar LLJJI;
    public PoiRecommendFeatureNavBarModule LLJJIII;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e6z;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        PoiRecommendFeatureNavBarModule poiRecommendFeatureNavBarModule = (PoiRecommendFeatureNavBarModule) baseComponentData;
        super.CG1(poiRecommendFeatureNavBarModule);
        this.LLJJIII = poiRecommendFeatureNavBarModule;
        ip(poiRecommendFeatureNavBarModule.getTitle());
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
    public final void ip(String str) {
        PoiRecommendFeatureNavBarAbout about;
        String str2;
        TuxNavBar tuxNavBar = this.LLJJI;
        if (tuxNavBar == null) {
            return;
        }
        C0OM1 c0om1 = new C0OM1();
        Context context = getContext();
        Integer numLIZJ = null;
        if (context != null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.zq, context);
        }
        c0om1.LIZJ(C1175120ggY.LIZJ(numLIZJ));
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, 1758));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        if (str == null) {
            str = "";
        }
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        PoiRecommendFeatureNavBarModule poiRecommendFeatureNavBarModule = this.LLJJIII;
        if (poiRecommendFeatureNavBarModule != null && (about = poiRecommendFeatureNavBarModule.getAbout()) != null && (str2 = about.content) != null && str2.length() != 0) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_ellipsis_horizontal;
            c1251150ifB2.LIZLLL = true;
            c1251150ifB2.LIZJ(new AwS562S0100000_18(this, 1757));
            c0om1.LIZIZ(c1251150ifB2);
        }
        tuxNavBar.setNavActions(c0om1);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJI = (TuxNavBar) view.findViewById(R.id.ra7);
        ip(null);
    }
}
