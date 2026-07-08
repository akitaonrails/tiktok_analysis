package com.ss.android.ugc.aweme.poi.osp.component;

import X.C019F;
import X.C09R3;
import X.C0OM1;
import X.C1173300gdc;
import X.C1174850gg7;
import X.C1178990gmn;
import X.C1187080gzq;
import X.C1192650h8p;
import X.C1193160h9e;
import X.C1193230h9l;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1637806bA;
import X.C166V;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C337180DJs;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1181010gq3;
import X.InterfaceC1192660h8q;
import X.InterfaceC2217461Bqa;
import X.ViewOnLayoutChangeListenerC1208750hYn;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitCashierAbility;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitSlashFragment;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitViewModel;
import com.ss.android.ugc.aweme.poi.osp.repo.model.LogoModel;
import com.ss.android.ugc.aweme.poi.osp.repo.model.NavigationBarData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.ProductAtmosphere;
import com.ss.android.ugc.aweme.poi.osp.repo.model.ProductAtmosphereExpression;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS235S0000000_6;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitNavBarAssem extends BaseSlashSlotAssemComponent<NavigationBarData> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C166V LLJJI = new C166V(new AwS597S0100000_18((UISlotAssem) this, 428));
    public final AssemVMLazy LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiOrderSubmitNavBarAssem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiOrderSubmitHeaderBinding;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiOrderSubmitNavBarAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/osp/PoiOrderSubmitViewModel;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiOrderSubmitNavBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiOrderSubmitViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1665), AFwS256S0000000_18.get$arr$(535), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e5i;
    }

    public final C1193230h9l ip() {
        C166V c166v = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (C1193230h9l) c166v.LIZ(this);
    }

    public final PoiOrderSubmitViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (PoiOrderSubmitViewModel) assemVMLazy.getValue();
    }

    public final void lp() {
        PoiOrderSubmitSlashFragment poiOrderSubmitSlashFragment;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if ((fragmentLJI instanceof PoiOrderSubmitSlashFragment) && (poiOrderSubmitSlashFragment = (PoiOrderSubmitSlashFragment) fragmentLJI) != null) {
            mp(poiOrderSubmitSlashFragment.getContext(), poiOrderSubmitSlashFragment, new AwS562S0100000_18(poiOrderSubmitSlashFragment, 1662));
            return;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            mp(c19egLIZ, C1174850gg7.LIZ(this), new AwS562S0100000_18(c19egLIZ, 1663));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0GzV, android.view.View] */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        ProductAtmosphere productAtmosphere;
        List<ProductAtmosphereExpression> list;
        List<ProductAtmosphereExpression> list2;
        NavigationBarData navigationBarData = (NavigationBarData) baseComponentData;
        super.CG1(navigationBarData);
        List<ProductAtmosphere> productAtmosphereList = navigationBarData.getProductAtmosphereList();
        if (productAtmosphereList != null && !productAtmosphereList.isEmpty() && (productAtmosphere = (ProductAtmosphere) C13LP.LJJJLZIJ(0, navigationBarData.getProductAtmosphereList())) != null && (list = productAtmosphere.atmosphereExpressionList) != null && !list.isEmpty()) {
            List<ProductAtmosphere> productAtmosphereList2 = navigationBarData.getProductAtmosphereList();
            C337180DJs.LIZJ(ip().LLILZ);
            C337180DJs.LIZ(ip().LLIZ);
            C786410Ut5.I7(new AkS87S0100000_18(this, 3), ip().LLILLJJLI);
            ProductAtmosphere productAtmosphere2 = (ProductAtmosphere) C13LP.LJJJLZIJ(0, productAtmosphereList2);
            if (productAtmosphere2 != null && (list2 = productAtmosphere2.atmosphereExpressionList) != null) {
                for (ProductAtmosphereExpression productAtmosphereExpression : list2) {
                    final Context context = getContext();
                    if (context != null) {
                        ?? r1 = new LinearLayout(context) { // from class: X.0GzV
                            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
                            public final C166U LL;

                            static {
                                C2217381BqS c2217381BqS = new C2217381BqS(C433670GzV.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiOrderSubmitAtmosphereItemBinding;", 0);
                                C13LE.LIZ.getClass();
                                LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
                            }

                            private final C425370Gm7 getViewBinding() {
                                C166U c166u = this.LL;
                                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
                                return (C425370Gm7) c166u.LIZ(this);
                            }

                            {
                                super(context, null, 0);
                                this.LL = new C166U(new AwS235S0000000_6(2));
                                C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e59, this, true);
                            }

                            public final void setData(ProductAtmosphereExpression productAtmosphereExpression2) {
                                Unit unit;
                                UrlModel urlModel;
                                getViewBinding().LLILZ.setText(productAtmosphereExpression2.text);
                                List<LogoModel> list3 = productAtmosphereExpression2.logos;
                                if (list3 != null) {
                                    if (list3.size() == 1) {
                                        C337180DJs.LIZJ(getViewBinding().LLILLL);
                                        C337180DJs.LIZ(getViewBinding().LLILLJJLI);
                                        LogoModel logoModel = (LogoModel) C13LP.LJJJLZIJ(0, list3);
                                        if (logoModel != null) {
                                            Context context2 = getContext();
                                            if (context2 != null && C960203pA.LIZIZ(context2)) {
                                                urlModel = logoModel.logoDark;
                                            } else {
                                                urlModel = logoModel.logo;
                                            }
                                            C1189360h3W c1189360h3WLIZ = new C1180600gpO("poi_order_submit", "poi_order_submit_atmosphere_icon", null).LIZ(C438710HIf.LIZ(urlModel));
                                            c1189360h3WLIZ.LIZLLL(getViewBinding().LLILLL);
                                            c1189360h3WLIZ.LIZIZ();
                                            unit = Unit.LIZ;
                                        }
                                    } else if (C1175120ggY.LIZJ(Integer.valueOf(list3.size())) > 1) {
                                        C337180DJs.LIZ(getViewBinding().LLILLL);
                                        C337180DJs.LIZJ(getViewBinding().LLILLJJLI);
                                        getViewBinding().LLILLJJLI.setTotalCount(list3.size());
                                        getViewBinding().LLILLJJLI.setSize(EnumC428930Grr.X_SMALL);
                                        unit = Unit.LIZ;
                                    } else {
                                        C337180DJs.LIZ(getViewBinding().LLILLL);
                                        C337180DJs.LIZ(getViewBinding().LLILLJJLI);
                                        unit = Unit.LIZ;
                                    }
                                    if (unit != null) {
                                        return;
                                    }
                                }
                                C337180DJs.LIZ(getViewBinding().LLILLL);
                                C337180DJs.LIZ(getViewBinding().LLILLJJLI);
                            }
                        };
                        r1.setData(productAtmosphereExpression);
                        ip().LLILLL.addView(r1);
                    }
                }
            }
            ip().LLILLL.startFlipping();
            return;
        }
        op(navigationBarData);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        op(null);
        if (!kp().getState().LLILZIL) {
            InterfaceC1181010gq3 interfaceC1181010gq3LIZIZ = C1178990gmn.LIZIZ(this);
            if (interfaceC1181010gq3LIZIZ != null) {
                interfaceC1181010gq3LIZIZ.ro1(0);
            }
            C786410Ut5.LJLLLLLL(8, ip().LLILZLL);
        }
        ip().LLILZLL.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1208750hYn(this, 1));
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0h9m
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1159320gH4) obj).LLILZIL);
            }
        }, null, new AwS632S0100000_18(this, 142), 6);
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
    public final void op(NavigationBarData navigationBarData) {
        String title;
        Integer numLIZJ;
        C337180DJs.LIZ(ip().LLILZ);
        C337180DJs.LIZJ(ip().LLIZ);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
            ip().LLIZ.setNavBackground(numLIZJ.intValue());
        }
        TuxNavBar tuxNavBar = ip().LLIZ;
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, 1664));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        if (navigationBarData == null || (title = navigationBarData.getTitle()) == null) {
            title = "";
        }
        c1250250idj.LIZJ = title;
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void mp(Context context, InterfaceC1181010gq3 interfaceC1181010gq3, Function0<Unit> function0) {
        C1187080gzq c1187080gzq;
        C1192650h8p c1192650h8p;
        InterfaceC1192660h8q interfaceC1192660h8qN8;
        C1173300gdc c1173300gdcQr0;
        String strLJIIIZ = null;
        if (interfaceC1181010gq3 != null && (c1173300gdcQr0 = interfaceC1181010gq3.qr0()) != null) {
            c1187080gzq = (C1187080gzq) c1173300gdcQr0.LIZ;
        } else {
            c1187080gzq = null;
        }
        AwS419S0200000_18 awS419S0200000_18 = new AwS419S0200000_18((Function0) function0, (Function0<Unit>) this, (PoiOrderSubmitNavBarAssem) 85);
        if (context == null) {
            awS419S0200000_18.invoke();
            return;
        }
        C1193160h9e c1193160h9e = C1193160h9e.LIZ;
        if (c1187080gzq != null) {
            c1192650h8p = c1187080gzq.LJFF;
        } else {
            c1192650h8p = null;
        }
        PoiOrderSubmitCashierAbility poiOrderSubmitCashierAbility = (PoiOrderSubmitCashierAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), PoiOrderSubmitCashierAbility.class, null);
        if (poiOrderSubmitCashierAbility != null && (interfaceC1192660h8qN8 = poiOrderSubmitCashierAbility.n8()) != null) {
            strLJIIIZ = interfaceC1192660h8qN8.LJIIIZ();
        }
        boolean z = kp().getState().LLILZIL;
        c1193160h9e.getClass();
        if (!C1193160h9e.LIZ(context, awS419S0200000_18, c1192650h8p, interfaceC1181010gq3, strLJIIIZ, z)) {
            awS419S0200000_18.invoke();
        }
    }
}
