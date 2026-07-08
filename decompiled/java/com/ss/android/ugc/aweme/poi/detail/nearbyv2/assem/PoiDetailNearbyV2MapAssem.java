package com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem;

import X.C019F;
import X.C1165940gRk;
import X.C1175070ggT;
import X.C1176580giu;
import X.C1176680gj4;
import X.C1178280gle;
import X.C1179470gnZ;
import X.C1180740gpc;
import X.C1203050hPb;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C2255108sX;
import X.C339190DRl;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C960203pA;
import X.EnumC1203090hPf;
import X.InterfaceC1176690gj5;
import X.InterfaceC1177250gjz;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.MessageSyncer;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.vm.PoiDetailNearbyV2VM;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailNearbyV2MapAssem extends ReusedUIContentAssem<PoiDetailNearbyV2MapAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final AssemVMLazy LLJJJJ;
    public View LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public InterfaceC1177250gjz LLJJL;
    public final MessageSyncer LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailNearbyV2MapAssem.class, "nearbyVM", "getNearbyVM()Lcom/ss/android/ugc/aweme/poi/detail/nearbyv2/vm/PoiDetailNearbyV2VM;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailNearbyV2MapAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailNearbyV2VM.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1172), AFwS256S0000000_18.get$arr$(416), null, true);
        this.LLJJLIIIJLLLLLLLZ = new MessageSyncer();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewLIZ;
        this.LLJJJJJIL = view.findViewById(R.id.r0u);
        this.LLJJJJLIIL = (FrameLayout) view.findViewById(R.id.r0s);
        if (C960203pA.LIZIZ(view.getContext())) {
            C339190DRl.LIZLLL(this.LLJJJJJIL);
        } else {
            C339190DRl.LIZIZ(this.LLJJJJJIL);
        }
        C1180740gpc.LIZ.getClass();
        IPoiMapService iPoiMapServiceLIZ = C1180740gpc.LIZ();
        C1179470gnZ c1179470gnZ = new C1179470gnZ();
        c1179470gnZ.LIZLLL = false;
        c1179470gnZ.LIZIZ = false;
        c1179470gnZ.LIZJ = false;
        c1179470gnZ.LJ = false;
        c1179470gnZ.LJFF = EnumC1203090hPf.MAP_TYPE_NORMAL;
        c1179470gnZ.LJI = C1178280gle.LIZLLL(getContext());
        InterfaceC1176690gj5 iMapManager = iPoiMapServiceLIZ.getIMapManager(new C1203050hPb(c1179470gnZ));
        Context context = getContext();
        if (context != null && (viewLIZ = iMapManager.LIZ(context, this)) != null) {
            ((ViewGroup) LJJIJL().findViewById(R.id.r0s)).addView(viewLIZ, new FrameLayout.LayoutParams(-1, -1));
        }
        iMapManager.X(new AwS597S0100000_18(this, 1003));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            PoiNearbyV2MapAbility poiNearbyV2MapAbility = new PoiNearbyV2MapAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem.PoiDetailNearbyV2MapAssem$initSubscribe$1
                @Override // com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem.PoiNearbyV2MapAbility
                public final MapBounds k60() {
                    C1165940gRk c1165940gRkLJJIJIIJIL;
                    PoiDetailNearbyV2MapAssem poiDetailNearbyV2MapAssem = this.LL;
                    C1176580giu c1176580giu = null;
                    if (!poiDetailNearbyV2MapAssem.LLJL) {
                        return null;
                    }
                    InterfaceC1177250gjz interfaceC1177250gjz = poiDetailNearbyV2MapAssem.LLJJL;
                    if (interfaceC1177250gjz != null && (c1165940gRkLJJIJIIJIL = interfaceC1177250gjz.LJJIJIIJIL()) != null) {
                        c1176580giu = c1165940gRkLJJIJIIJIL.bounds;
                    }
                    return C1175070ggT.LIZ(c1176580giu);
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, PoiNearbyV2MapAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, poiNearbyV2MapAbility, PoiNearbyV2MapAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(poiNearbyV2MapAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(poiNearbyV2MapAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(PoiNearbyV2MapAbility.class.getClassLoader(), new Class[]{PoiNearbyV2MapAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, PoiNearbyV2MapAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem.PoiNearbyV2MapAbility");
                    }
                }
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0giB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1176080gi6) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0giC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1176080gi6) obj).LLILLL;
            }
        }, null, new C1176680gj4(), 12);
        C2211631BhB.LJ(view, new AwS384S0200000_18(view, this, 100));
    }
}
