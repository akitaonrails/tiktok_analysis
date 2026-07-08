package com.ss.android.ugc.aweme.poi.detail.videolist.container;

import X.AbstractC1186480gys;
import X.AbstractC1196150hET;
import X.C01GW;
import X.C0C64;
import X.C1173300gdc;
import X.C1174140gey;
import X.C1174850gg7;
import X.C1175440gh4;
import X.C1180920gpu;
import X.C1185410gx9;
import X.C1185600gxS;
import X.C1186840gzS;
import X.C1187900h1A;
import X.C1187910h1B;
import X.C1188160h1a;
import X.C1188220h1g;
import X.C1188310h1p;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C166V;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C2255108sX;
import X.C285770BHz;
import X.C419910GdJ;
import X.C452501pT;
import X.C723850SaN;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1180270gor;
import X.InterfaceC1181010gq3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS118S0100000_18;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;
import com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.IPoiPostsAutoPlayAbility;
import com.ss.android.ugc.aweme.poi.experiment.PoiPostOptExp;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailPostContainerAssem extends PoiDetailBaseAssem<PoiListApi.PoiMergedListResponse> implements InterfaceC1180270gor {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final C166V LLJJL = new C166V(new AwS597S0100000_18((UISlotAssem) this, 369));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1217));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1218));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailPostContainerAssem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiLayoutDetailPostContainerBinding;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e3g;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return false;
    }

    public final C1749280vcc Ep() {
        return (C1749280vcc) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C1188220h1g Fp() {
        C166V c166v = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (C1188220h1g) c166v.LIZ(this);
    }

    public final PoiVideoListSharedViewModel Gp() {
        return (PoiVideoListSharedViewModel) this.LLJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1186840gzS c1186840gzSLw1;
        super.onDestroy();
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = BK2();
        if (interfaceC1181010gq3BK2 == null || (c1186840gzSLw1 = interfaceC1181010gq3BK2.lw1()) == null) {
            return;
        }
        c1186840gzSLw1.LIZJ("SlashQuickNavigationClick", this);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        PoiListApi.PoiMergedListResponse poiMergedListResponse = (PoiListApi.PoiMergedListResponse) baseComponentData;
        super.CG1(poiMergedListResponse);
        C786410Ut5.LJZL(0, Fp().LLILZ);
        Ip(poiMergedListResponse);
    }

    public final void Ip(PoiListApi.PoiMergedListResponse poiMergedListResponse) {
        PoiVideoListSharedViewModel poiVideoListSharedViewModelGp = Gp();
        if (poiVideoListSharedViewModelGp != null) {
            poiVideoListSharedViewModelGp.LLJJIII = C1174850gg7.LIZLLL(this);
        }
        IPoiDetailPostDataChangeAbility iPoiDetailPostDataChangeAbility = (IPoiDetailPostDataChangeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPoiDetailPostDataChangeAbility.class, null);
        if (iPoiDetailPostDataChangeAbility != null) {
            iPoiDetailPostDataChangeAbility.V02(poiMergedListResponse);
        }
    }

    public final void Jp(C1722300uv6 c1722300uv6) {
        boolean z;
        Context context;
        String string;
        Context context2;
        String string2;
        Context context3;
        Context context4;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_map_pin;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        PoiVideoListSharedViewModel poiVideoListSharedViewModelGp = Gp();
        if (poiVideoListSharedViewModelGp != null && poiVideoListSharedViewModelGp.GQ2()) {
            z = true;
        } else {
            z = false;
        }
        String str = "";
        if (!z ? (context = getContext()) == null || (string = context.getString(2131838190)) == null : (context4 = getContext()) == null || (string = context4.getString(2131844736)) == null) {
            string = "";
        }
        c1722300uv6.LJI = string;
        PoiVideoListSharedViewModel poiVideoListSharedViewModelGp2 = Gp();
        if (poiVideoListSharedViewModelGp2 == null || !poiVideoListSharedViewModelGp2.GQ2() ? !((context2 = getContext()) == null || (string2 = context2.getString(2131844786)) == null) : !((context3 = getContext()) == null || (string2 = context3.getString(2131844735)) == null)) {
            str = string2;
        }
        c1722300uv6.LJIIIIZZ = str;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void Jr2(C1180920gpu c1180920gpu) {
        PoiListApi.PoiMergedListResponse poiMergedListResponse;
        BaseComponentData baseComponentData = c1180920gpu.LIZLLL;
        if (baseComponentData instanceof PoiListApi.PoiMergedListResponse) {
            poiMergedListResponse = (PoiListApi.PoiMergedListResponse) baseComponentData;
        } else {
            poiMergedListResponse = null;
        }
        Ip(poiMergedListResponse);
    }

    @Override // X.InterfaceC1180270gor
    public void onEvent(AbstractC1186480gys abstractC1186480gys) {
        if (abstractC1186480gys instanceof C1174140gey) {
            HandlerHook.viewPost(LJJIJL(), new ARunnableS118S0100000_18(this, 40));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String typeLevel;
        int i;
        boolean z;
        boolean z2;
        C1185600gxS c1185600gxS;
        C1185410gx9 c1185410gx9;
        C1186840gzS c1186840gzSLw1;
        super.onViewCreated(view);
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = BK2();
        if (interfaceC1181010gq3BK2 != null && (c1186840gzSLw1 = interfaceC1181010gq3BK2.lw1()) != null) {
            c1186840gzSLw1.LIZIZ("SlashQuickNavigationClick", this);
        }
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        if (c1173300gdcLJ == null || (c1185600gxS = (C1185600gxS) c1173300gdcLJ.LIZ) == null || (c1185410gx9 = c1185600gxS.LJFF) == null || (typeLevel = c1185410gx9.getTypeLevel()) == null) {
            typeLevel = "-1";
        }
        C1188310h1p c1188310h1p = new AbstractC1196150hET() { // from class: X.0h1p
            public static final String LIZIZ = "poi_detail_post";

            @Override // X.AbstractC1196150hET
            public final String LIZIZ() {
                return LIZIZ;
            }
        };
        PoiPostOptExp.LIZ.getClass();
        PoiPostOptExp.PoiPostMultiTabsConfig poiPostMultiTabsConfigLIZ = PoiPostOptExp.LIZ(typeLevel);
        if (poiPostMultiTabsConfigLIZ != null) {
            i = poiPostMultiTabsConfigLIZ.multiTabNums;
        } else {
            i = 0;
        }
        if (i > 1) {
            z = true;
        } else {
            z = false;
        }
        Integer numValueOf = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "poi_detail_post_container_opt", true));
        if (numValueOf != null && numValueOf.intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLIZIZ = PoiPostOptExp.LIZIZ(typeLevel);
        boolean zLIZ = C285770BHz.LIZ();
        c1188310h1p.getClass();
        c1188310h1p.LIZJ("poi_detail_post_exp_check", new C1188160h1a(typeLevel, z, z2, zLIZ, zLIZIZ));
        C2211631BhB.LJ(view, new AwS384S0200000_18(view, this, 262));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            IPoiPostsAutoPlayAbility iPoiPostsAutoPlayAbility = new IPoiPostsAutoPlayAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.videolist.container.PoiDetailPostContainerAssem$loadAbilities$1
                @Override // com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.IPoiPostsAutoPlayAbility
                public final ViewOnAttachStateChangeListenerC20604515jv Hx1() {
                    return this.LL.Fp().LLILLL;
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IPoiPostsAutoPlayAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, iPoiPostsAutoPlayAbility, IPoiPostsAutoPlayAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(iPoiPostsAutoPlayAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(iPoiPostsAutoPlayAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(IPoiPostsAutoPlayAbility.class.getClassLoader(), new Class[]{IPoiPostsAutoPlayAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IPoiPostsAutoPlayAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.IPoiPostsAutoPlayAbility");
                    }
                }
            }
        }
        PoiVideoListSharedViewModel poiVideoListSharedViewModelGp = Gp();
        if (poiVideoListSharedViewModelGp != null) {
            AssemViewModel.asyncSubscribe$default(poiVideoListSharedViewModelGp, new C2217381BqS() { // from class: X.0h1d
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C1187520h0Y c1187520h0Y = (C1187520h0Y) obj;
                    c1187520h0Y.getClass();
                    return C627260Oiy.LIZLLL(c1187520h0Y);
                }
            }, this, null, new AwS597S0100000_18(this, 980), new AwS562S0100000_18(this, 2686), new C1187910h1B(this), 4, null);
        }
        PoiVideoListSharedViewModel poiVideoListSharedViewModelGp2 = Gp();
        if (poiVideoListSharedViewModelGp2 != null) {
            AssemViewModel.asyncSubscribe$default(poiVideoListSharedViewModelGp2, new C2217381BqS() { // from class: X.0h1e
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C1187520h0Y c1187520h0Y = (C1187520h0Y) obj;
                    c1187520h0Y.getClass();
                    return C627260Oiy.LIZJ(c1187520h0Y);
                }
            }, null, AFwS256S0000000_18.get$arr$(990), null, new C1187900h1A(this), 10, null);
        }
        InterfaceC1181010gq3 interfaceC1181010gq3BK22 = BK2();
        if (interfaceC1181010gq3BK22 != null) {
            interfaceC1181010gq3BK22.iY0(Fp().LLILLL);
        }
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 280));
        String strLJFF = C1174850gg7.LJFF(this);
        if (strLJFF == null) {
            strLJFF = "";
        }
        C1175440gh4.LIZ(this, strLJFF, null, 10);
        pH(new AwS597S0100000_18(this, 368));
    }
}
