package com.ss.android.ugc.aweme.poi.albummix.assem;

import X.C01GW;
import X.C0OM1;
import X.C1183770guV;
import X.C1185360gx4;
import X.C1185370gx5;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1226204qy;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1558520qew;
import X.C1559260qg8;
import X.C452501pT;
import X.C723580SZw;
import X.C848230XPh;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAlbumMixHeaderAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1185370gx5.class, "PoiAlbumMixHierarchyData"), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 851));
    public TuxNavBar LLJI;

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
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Context context;
        String string;
        PoiDetailApi.PoiTopVideosLoadMoreResponse poiTopVideosLoadMoreResponse;
        super.onViewCreated(view);
        this.LLJI = (TuxNavBar) view.findViewById(R.id.qwp);
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModel = (PoiHeaderTopVideosSharedViewModel) this.LLJ.getValue();
        if ((poiHeaderTopVideosSharedViewModel == null || (poiTopVideosLoadMoreResponse = poiHeaderTopVideosSharedViewModel.LLIZLLLIL) == null || (string = poiTopVideosLoadMoreResponse.getTitle()) == null) && ((context = getContext()) == null || (string = context.getString(2131844687)) == null)) {
            string = "";
        }
        TuxNavBar tuxNavBar = this.LLJI;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS546S0100000_2(this, 1080));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = string;
            c0om1.LIZJ = c1250250idj;
            C1185360gx4.LIZ.getClass();
            if (!C1226204qy.LIZ() && C1183770guV.LIZ() && C848230XPh.LL.LJI()) {
                C1251150ifB c1251150ifB2 = new C1251150ifB();
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = R.raw.icon_arrow_turn_up_right;
                c1251150ifB2.LIZLLL = true;
                c1251150ifB2.LIZJ(new AwS562S0100000_18(this, 2559));
                c0om1.LIZIZ(c1251150ifB2);
            }
            tuxNavBar.setNavActions(c0om1);
        }
        C1185360gx4.LIZ.getClass();
        if (!C1226204qy.LIZ() && C1183770guV.LIZ() && C848230XPh.LL.LJI()) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(this));
            C1185430gxB.LIZ.getClass();
            C1185430gxB.LJJJJZI(pageFinderVia, interfaceC665370Q7zLJIIL, "top_operate_btn");
        }
    }
}
