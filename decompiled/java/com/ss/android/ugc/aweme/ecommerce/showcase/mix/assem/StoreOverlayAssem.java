package com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem;

import X.AbstractC1539010q9T;
import X.C01GW;
import X.C08XD;
import X.C0PEM;
import X.C1163360gNa;
import X.C1166240gSE;
import X.C1166510gSf;
import X.C1166590gSn;
import X.C1537720q7O;
import X.C1537820q7Y;
import X.C1538140q84;
import X.C1538590q8n;
import X.C1547280qMo;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C259800zU;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1165510gR3;
import X.InterfaceC1531560pxS;
import X.InterfaceC1541990qEH;
import Y.AComparatorS37S0000000_18;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.google.gson.n;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreOverlayAssem;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.event.StoreCollapseHeaderEvent;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.event.StoreMixAddCartEvent;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.event.StoreMixCloseLynxEvent;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.event.StoreMixJumpLynxEvent;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixActivity;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS454S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class StoreOverlayAssem extends MixUIContentAssem<C1166240gSE> {
    public final Map<String, FrameLayout> LLJJIII = new LinkedHashMap();
    public final Map<String, InterfaceC1541990qEH> LLJJIJI = new LinkedHashMap();
    public final ArrayList<StoreMixJumpLynxEvent> LLJJIJIIJIL = new ArrayList<>();
    public final BPEAHandler LLJJIJIL = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LLJJJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(100));

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem
    public final Map<String, Class<?>> Lo() {
        return (ConcurrentHashMap) this.LLJJJ.getValue();
    }

    public final FrameLayout So() {
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL instanceof FrameLayout) {
            return (FrameLayout) viewLJJIJL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJIJIL.removeCallbacksAndMessages(null);
        ((LinkedHashMap) this.LLJJIII).clear();
        Iterator it2 = ((LinkedHashMap) this.LLJJIJI).entrySet().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1541990qEH) ((Map.Entry) it2.next()).getValue()).LLD(true);
        }
        ((LinkedHashMap) this.LLJJIJI).clear();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r1v27, types: [T, X.0qEH] */
    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem
    public final void No(Object obj, String str) {
        StoreCollapseHeaderEvent storeCollapseHeaderEvent;
        float fFloatValue;
        StoreMixAddCartEvent storeMixAddCartEvent;
        StoreMixCloseLynxEvent storeMixCloseLynxEvent;
        String str2;
        FrameLayout frameLayoutSo;
        FrameLayout frameLayoutSo2;
        String str3;
        final StoreMixJumpLynxEvent storeMixJumpLynxEvent;
        String strLIZ;
        String str4;
        HybridSchemaParam hybridSchemaParamLIZJ;
        Context context;
        super.No(obj, str);
        boolean z = true;
        StoreMixJumpLynxEvent storeMixJumpLynxEvent2 = null;
        switch (str.hashCode()) {
            case -32394997:
                if (str.equals("ecMixTabJumpLynxPage")) {
                    C1166240gSE c1166240gSEHo = Ho();
                    if (c1166240gSEHo != null) {
                        str3 = c1166240gSEHo.LIZ;
                    } else {
                        str3 = null;
                    }
                    JumpLynxPageResult jumpLynxPageResult = new JumpLynxPageResult(str3, null, null, null, null);
                    if ((obj instanceof StoreMixJumpLynxEvent) && (storeMixJumpLynxEvent = (StoreMixJumpLynxEvent) obj) != null) {
                        jumpLynxPageResult.id = storeMixJumpLynxEvent.id;
                        jumpLynxPageResult.originTimestamp = storeMixJumpLynxEvent.timestamp;
                        final AwS454S0200000_18 awS454S0200000_18 = new AwS454S0200000_18(jumpLynxPageResult, this, 22);
                        if (storeMixJumpLynxEvent.schema == null) {
                            awS454S0200000_18.invoke(Boolean.FALSE, "schema is null");
                        } else if (storeMixJumpLynxEvent.id == null) {
                            awS454S0200000_18.invoke(Boolean.FALSE, "id is null");
                        } else {
                            final C259800zU c259800zU = new C259800zU();
                            final FrameLayout frameLayoutSo3 = So();
                            if (frameLayoutSo3 != null) {
                                FrameLayout frameLayout = (FrameLayout) ((LinkedHashMap) this.LLJJIII).get(storeMixJumpLynxEvent.id);
                                if (frameLayout != null) {
                                    Oo(frameLayoutSo3, storeMixJumpLynxEvent, frameLayout);
                                    awS454S0200000_18.invoke(Boolean.TRUE, null);
                                } else {
                                    C1166240gSE c1166240gSEHo2 = Ho();
                                    if (c1166240gSEHo2 == null || (strLIZ = C1166590gSn.LIZ(c1166240gSEHo2, storeMixJumpLynxEvent.schema, false)) == null) {
                                        strLIZ = storeMixJumpLynxEvent.schema;
                                    }
                                    C1538140q84 c1538140q84 = C1538140q84.LIZ;
                                    C1538590q8n c1538590q8n = new C1538590q8n();
                                    c1538590q8n.LIZLLL = false;
                                    c1538590q8n.LJ = false;
                                    c1538590q8n.LJFF = false;
                                    c1538590q8n.LJI = true;
                                    c1538590q8n.LJIIIZ = true;
                                    SparkContext sparkContextLIZJ = c1538140q84.LIZJ(strLIZ, c1538590q8n);
                                    Go(sparkContextLIZJ);
                                    n nVar = storeMixJumpLynxEvent.data;
                                    if (nVar != null) {
                                        nVar.LJJIII(Integer.valueOf(StoreMixActivity.LLILZLL), "bottomNavigationBarHeight");
                                        C1547280qMo.LJ(sparkContextLIZJ, TemplateData.LJIIIIZZ(nVar.toString()));
                                    }
                                    C1166240gSE c1166240gSEHo3 = Ho();
                                    if (c1166240gSEHo3 == null || (str4 = c1166240gSEHo3.LIZ) == null) {
                                        str4 = "store_mix";
                                    }
                                    C1547280qMo.LIZLLL(sparkContextLIZJ, str4);
                                    C1166240gSE c1166240gSEHo4 = Ho();
                                    if (c1166240gSEHo4 == null || !c1166240gSEHo4.LIZIZ) {
                                        z = false;
                                    }
                                    sparkContextLIZJ.LJJLIIIJ(Boolean.valueOf(z), "isPopup");
                                    sparkContextLIZJ.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0gSv
                                        @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                                        public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                                            C1537910q7h c1537910q7h;
                                            final C259800zU<InterfaceC1541990qEH> c259800zU2 = c259800zU;
                                            final FrameLayout frameLayout2 = frameLayoutSo3;
                                            final StoreOverlayAssem storeOverlayAssem = this;
                                            final StoreMixJumpLynxEvent storeMixJumpLynxEvent3 = storeMixJumpLynxEvent;
                                            final Function2<Boolean, String, Unit> function2 = awS454S0200000_18;
                                            LynxViewClient lynxViewClient = new LynxViewClient() { // from class: X.0gSu
                                                @Override // com.lynx.tasm.LynxViewClient
                                                public final void LJIIJ() {
                                                    ViewParent parent;
                                                    ViewGroup viewGroup;
                                                    InterfaceC1541990qEH interfaceC1541990qEH = c259800zU2.element;
                                                    if (interfaceC1541990qEH == null) {
                                                        function2.invoke(Boolean.FALSE, "kitView is null");
                                                        return;
                                                    }
                                                    FrameLayout frameLayout3 = frameLayout2;
                                                    StoreOverlayAssem storeOverlayAssem2 = storeOverlayAssem;
                                                    StoreMixJumpLynxEvent storeMixJumpLynxEvent4 = storeMixJumpLynxEvent3;
                                                    Function2<Boolean, String, Unit> function22 = function2;
                                                    View viewE1 = interfaceC1541990qEH.e1();
                                                    if (viewE1 != null && (parent = viewE1.getParent()) != null && (parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                                                        C786410Ut5.LJJJLZIJ(interfaceC1541990qEH.e1(), viewGroup);
                                                    }
                                                    FrameLayout frameLayout4 = new FrameLayout(frameLayout3.getContext());
                                                    storeMixJumpLynxEvent4.LIZ(frameLayout4, true);
                                                    frameLayout4.addView(interfaceC1541990qEH.e1());
                                                    storeOverlayAssem2.LLJJIJI.put(storeMixJumpLynxEvent4.id, interfaceC1541990qEH);
                                                    storeOverlayAssem2.Oo(frameLayout3, storeMixJumpLynxEvent4, frameLayout4);
                                                    function22.invoke(Boolean.TRUE, null);
                                                }

                                                @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
                                                public final void LJFF(LynxError lynxError) {
                                                    Integer numValueOf;
                                                    Function2<Boolean, String, Unit> function22 = function2;
                                                    Boolean bool = Boolean.FALSE;
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append("error code = ");
                                                    String strLJ = null;
                                                    if (lynxError != null) {
                                                        numValueOf = Integer.valueOf(lynxError.LIZIZ());
                                                    } else {
                                                        numValueOf = null;
                                                    }
                                                    sbLIZ.append(numValueOf);
                                                    sbLIZ.append(", msg = ");
                                                    if (lynxError != null) {
                                                        strLJ = lynxError.LJ();
                                                    }
                                                    sbLIZ.append(strLJ);
                                                    function22.invoke(bool, C2188811AlT.LIZIZ(sbLIZ));
                                                }
                                            };
                                            if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                                                c1537910q7h.LJIIIIZZ(lynxViewClient);
                                            }
                                        }
                                    });
                                    InterfaceC1531560pxS interfaceC1531560pxS = sparkContextLIZJ.hybridParams;
                                    if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && (context = getContext()) != null) {
                                        ?? LIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParamLIZJ, sparkContextLIZJ, context, null);
                                        if (LIZIZ != 0) {
                                            ((C1537720q7O) LIZIZ).load();
                                            c259800zU.element = LIZIZ;
                                            if (Unit.LIZ != null) {
                                            }
                                        } else {
                                            awS454S0200000_18.invoke(Boolean.FALSE, "createLiteKitView is null");
                                            break;
                                        }
                                    }
                                    awS454S0200000_18.invoke(Boolean.FALSE, "getHybridSchemaParam is null");
                                }
                            } else {
                                awS454S0200000_18.invoke(Boolean.FALSE, "container is null");
                            }
                        }
                    } else {
                        jumpLynxPageResult.isSuccess = 0;
                        jumpLynxPageResult.errorMessage = "parse event fail";
                        ((InterfaceC1165510gR3) this.LLJI.getValue()).LIZJ(jumpLynxPageResult, "ecMixTabJumpLynxPageRes");
                    }
                }
                break;
            case 21440742:
                if (str.equals("ecMixTabUpdateLynxPage") && (obj instanceof StoreMixCloseLynxEvent) && (storeMixCloseLynxEvent = (StoreMixCloseLynxEvent) obj) != null && storeMixCloseLynxEvent.id != null && (str2 = storeMixCloseLynxEvent.type) != null) {
                    switch (str2.hashCode()) {
                        case -1157978797:
                            if (str2.equals("updateLayout")) {
                                FrameLayout frameLayout2 = (FrameLayout) ((LinkedHashMap) this.LLJJIII).get(storeMixCloseLynxEvent.id);
                                if (frameLayout2 != null) {
                                    storeMixCloseLynxEvent.LIZ(frameLayout2, false);
                                }
                            }
                            break;
                        case 3202370:
                            if (str2.equals("hide")) {
                                View view = (View) ((LinkedHashMap) this.LLJJIII).get(storeMixCloseLynxEvent.id);
                                if (view != null && (frameLayoutSo2 = So()) != null) {
                                    C786410Ut5.LJJJZ(view, frameLayoutSo2);
                                    break;
                                }
                            }
                            break;
                        case 3529469:
                            if (str2.equals("show")) {
                                FrameLayout frameLayout3 = (FrameLayout) ((LinkedHashMap) this.LLJJIII).get(storeMixCloseLynxEvent.id);
                                if (frameLayout3 != null && (frameLayoutSo = So()) != null) {
                                    Iterator<StoreMixJumpLynxEvent> it2 = this.LLJJIJIIJIL.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            StoreMixJumpLynxEvent next = it2.next();
                                            if (Intrinsics.LJFF(storeMixCloseLynxEvent.id, next.id)) {
                                                storeMixJumpLynxEvent2 = next;
                                            }
                                        }
                                    }
                                    Oo(frameLayoutSo, storeMixJumpLynxEvent2, frameLayout3);
                                    break;
                                }
                            }
                            break;
                        case 1557372922:
                            if (str2.equals("destroy")) {
                                InterfaceC1541990qEH interfaceC1541990qEHRemove = this.LLJJIJI.remove(storeMixCloseLynxEvent.id);
                                if (interfaceC1541990qEHRemove != null) {
                                    interfaceC1541990qEHRemove.LLD(true);
                                }
                                FrameLayout frameLayoutRemove = this.LLJJIII.remove(storeMixCloseLynxEvent.id);
                                if (frameLayoutRemove != null) {
                                    FrameLayout frameLayoutSo4 = So();
                                    if (frameLayoutSo4 != null) {
                                        C786410Ut5.LJJJZ(frameLayoutRemove, frameLayoutSo4);
                                    }
                                    C786410Ut5.LJJJJIZL(frameLayoutRemove);
                                }
                                for (StoreMixJumpLynxEvent storeMixJumpLynxEvent3 : this.LLJJIJIIJIL) {
                                    if (Intrinsics.LJFF(storeMixJumpLynxEvent3.id, storeMixCloseLynxEvent.id)) {
                                        if (storeMixJumpLynxEvent3 != null) {
                                            this.LLJJIJIIJIL.remove(storeMixJumpLynxEvent3);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
                break;
            case 1743189419:
                if (str.equals("ecMixShopHeaderIconDetail") && (obj instanceof StoreMixAddCartEvent) && (storeMixAddCartEvent = (StoreMixAddCartEvent) obj) != null) {
                    getActualLifecycleOwner();
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1166510gSf(storeMixAddCartEvent, this, null), 2);
                    break;
                }
                break;
            case 1766305941:
                if (str.equals("setFoldViewCollapse") && (obj instanceof StoreCollapseHeaderEvent) && (storeCollapseHeaderEvent = (StoreCollapseHeaderEvent) obj) != null) {
                    BPEAHandler bPEAHandler = this.LLJJIJIL;
                    AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 2442);
                    Float f = storeCollapseHeaderEvent.delayTime;
                    if (f != null) {
                        fFloatValue = f.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    C1163360gNa.LIZ(bPEAHandler, awS562S0100000_18, Long.valueOf((long) (fFloatValue * LSPassThroughRecordSizeConfig.DEFAULT)));
                    break;
                }
                break;
        }
    }

    public final void Oo(FrameLayout frameLayout, StoreMixJumpLynxEvent storeMixJumpLynxEvent, FrameLayout frameLayout2) {
        if (storeMixJumpLynxEvent != null && storeMixJumpLynxEvent.id != null) {
            if (!this.LLJJIJIIJIL.contains(storeMixJumpLynxEvent)) {
                this.LLJJIJIIJIL.add(storeMixJumpLynxEvent);
            }
            this.LLJJIII.put(storeMixJumpLynxEvent.id, frameLayout2);
            ArrayList<StoreMixJumpLynxEvent> arrayList = this.LLJJIJIIJIL;
            if (arrayList.size() > 1) {
                C08XD.LJJ(arrayList, new AComparatorS37S0000000_18(1));
            }
            C786410Ut5.LJJJJIZL(frameLayout);
            for (StoreMixJumpLynxEvent storeMixJumpLynxEvent2 : this.LLJJIJIIJIL) {
                View view = (View) ((LinkedHashMap) this.LLJJIII).get(storeMixJumpLynxEvent2.id);
                if (view != null && frameLayout.indexOfChild(view) == -1) {
                    frameLayout.addView(view);
                }
            }
        }
    }
}
