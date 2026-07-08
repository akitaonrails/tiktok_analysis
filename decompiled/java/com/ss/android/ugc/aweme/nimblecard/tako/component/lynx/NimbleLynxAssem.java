package com.ss.android.ugc.aweme.nimblecard.tako.component.lynx;

import X.AnonymousClass0207;
import X.C01GW;
import X.C111200bW;
import X.C1322970kX1;
import X.C1326430kcb;
import X.C14SX;
import X.C1537260q6e;
import X.C1537720q7O;
import X.C1537820q7Y;
import X.C1537830q7Z;
import X.C1538070q7x;
import X.C1538140q84;
import X.C1558520qew;
import X.C1559260qg8;
import X.C19LT;
import X.C2097608Jq;
import X.C21525219Lu;
import X.C2188811AlT;
import X.C649560Pdq;
import X.C723580SZw;
import X.EnumC665490Q8l;
import X.EnumC688760Qzy;
import X.InterfaceC1531560pxS;
import X.InterfaceC1541990qEH;
import X.InterfaceC1587906Jp;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleLynxDependAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.component.lynx.NimbleLynxAssem;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class NimbleLynxAssem extends ReusedUIContentAssem<NimbleLynxAssem> implements InterfaceC712990Rxx<C14SX> {
    public C1537720q7O LLJJJJ;
    public List<String> LLJJJJJIL;
    public List<String> LLJJJJLIIL;
    public String LLJJL;
    public Map<String, Object> LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public final C1559260qg8 LLJLIL = new C1559260qg8(new C723580SZw(this, C111200bW.class, "NIMBLE_LYNX_EXTRA_DATA"), checkSupervisorPrepared());
    public final C21525219Lu LLJLILLLLZIIL = new C21525219Lu(this, 0);

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C14SX c14sx) {
        boolean z;
        C1537830q7Z c1537830q7Z;
        C1537720q7O c1537720q7O;
        ViewGroup viewGroup;
        Map<String, String> commonParams;
        Set<Map.Entry<String, String>> setEntrySet;
        ViewGroup viewGroup2;
        C14SX c14sx2 = c14sx;
        String schema = c14sx2.getSchema();
        String rawData = c14sx2.getRawData();
        if (schema.length() != 0 && rawData.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(schema);
            sbLIZ.append('|');
            sbLIZ.append(rawData);
            if (Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), this.LLJJL)) {
                Map<String, Object> map = this.LLJJLIIIJLLLLLLLZ;
                Map<String, Object> mapLJI = c14sx2.LJI();
                if (map == null) {
                    if (mapLJI == null) {
                        return;
                    }
                } else if (mapLJI != null && map.size() == mapLJI.size()) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (!Intrinsics.LJFF(mapLJI.get(entry.getKey()), entry.getValue())) {
                        }
                    }
                    return;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(schema);
            sbLIZ2.append('|');
            sbLIZ2.append(rawData);
            this.LLJJL = C2188811AlT.LIZIZ(sbLIZ2);
            this.LLJJLIIIJLLLLLLLZ = c14sx2.LJI();
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewLJJIJL) != null && viewGroup2.getChildCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            final TemplateData templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(rawData);
            C1322970kX1.LIZ(templateDataLJIIIIZZ, this.LLJJJJLIIL);
            INimbleLynxDependAbility iNimbleLynxDependAbility = (INimbleLynxDependAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), INimbleLynxDependAbility.class, null);
            if (iNimbleLynxDependAbility != null && (commonParams = iNimbleLynxDependAbility.getCommonParams()) != null && (setEntrySet = commonParams.entrySet()) != null) {
                Iterator<T> it2 = setEntrySet.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    templateDataLJIIIIZZ.LJIILIIL(new Regex("_(\\w)", EnumC688760Qzy.IGNORE_CASE).replace((String) entry2.getKey(), AnonymousClass0207.get$arr$(126)), entry2.getValue());
                }
            }
            this.LLJLIL.getValue();
            Map mapLJ = C2097608Jq.LJ();
            Map<String, Object> mapLJI2 = c14sx2.LJI();
            if (mapLJI2 == null) {
                mapLJI2 = C2097608Jq.LJ();
            }
            for (Map.Entry entry3 : ((LinkedHashMap) C2097608Jq.LJIIL(mapLJ, mapLJI2)).entrySet()) {
                templateDataLJIIIIZZ.LJIILIIL((String) entry3.getKey(), entry3.getValue());
            }
            List<String> list = this.LLJJJJJIL;
            C1558520qew.LJIIL(this);
            C1322970kX1.LIZIZ(templateDataLJIIIIZZ, list, (INimbleLynxDependAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), INimbleLynxDependAbility.class, null));
            if (z) {
                C1537720q7O c1537720q7O2 = this.LLJJJJ;
                if (c1537720q7O2 != null) {
                    c1537720q7O2.updateData(templateDataLJIIIIZZ);
                }
                if (this.LLJL == 0) {
                    return;
                }
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2.isAttachedToWindow()) {
                    C1537720q7O c1537720q7O3 = this.LLJJJJ;
                    if (c1537720q7O3 == null) {
                        return;
                    }
                    c1537720q7O3.LIZ("cardShow", new JSONObject());
                    return;
                }
                viewLJJIJL2.addOnAttachStateChangeListener(new C19LT(viewLJJIJL2, this, 3));
                return;
            }
            C1538140q84 c1538140q84 = C1538140q84.LIZ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(schema);
            C1538140q84.LIZIZ(c1538140q84, sparkContext, null, 6);
            sparkContext.LJJ(InterfaceC665370Q7z.class, C1558520qew.LJIIL(this));
            C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
            C1326430kcb.LIZ().LJ(sparkContext.containerId, C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, "nimble")));
            InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
            if (!(interfaceC1531560pxS instanceof C1537830q7Z) || (c1537830q7Z = (C1537830q7Z) interfaceC1531560pxS) == null) {
                return;
            }
            c1537830q7Z.LJIJJ = templateDataLJIIIIZZ;
            C649560Pdq c649560Pdq = new C649560Pdq();
            c649560Pdq.LIZIZ = Integer.valueOf(EnumC665490Q8l.ALL_ON_UI.id());
            c649560Pdq.LIZ = Boolean.TRUE;
            c1537830q7Z.LJJJJJ = c649560Pdq;
            c1537830q7Z.LJIJJLI = new C1537260q6e() { // from class: X.18Ke
                @Override // X.C1537260q6e
                public final void LIZ(Map<String, ? extends Object> map2) {
                    List<String> list2;
                    int i;
                    String string;
                    List<String> list3;
                    NimbleLynxAssem nimbleLynxAssem = this.LIZ;
                    Object obj = map2.get("abParams");
                    List<String> list4 = null;
                    if ((obj instanceof List) && (list2 = (List) obj) != null) {
                        C1322970kX1.LIZ(templateDataLJIIIIZZ, list2);
                    } else {
                        list2 = null;
                    }
                    nimbleLynxAssem.LLJJJJLIIL = list2;
                    NimbleLynxAssem nimbleLynxAssem2 = this.LIZ;
                    Object obj2 = map2.get("dependentKeys");
                    if ((obj2 instanceof List) && (list3 = (List) obj2) != null) {
                        TemplateData templateData = templateDataLJIIIIZZ;
                        NimbleLynxAssem nimbleLynxAssem3 = this.LIZ;
                        C1558520qew.LJIIL(nimbleLynxAssem3);
                        C1322970kX1.LIZIZ(templateData, list3, (INimbleLynxDependAbility) C1558520qew.LIZ(C1558520qew.LJIIL(nimbleLynxAssem3), INimbleLynxDependAbility.class, null));
                        list4 = list3;
                    }
                    nimbleLynxAssem2.LLJJJJJIL = list4;
                    NimbleLynxAssem nimbleLynxAssem4 = this.LIZ;
                    Object obj3 = map2.get("exposeType");
                    if (obj3 != null && (string = obj3.toString()) != null) {
                        i = CastIntegerProtector.parseInt(string);
                    } else {
                        i = 0;
                    }
                    nimbleLynxAssem4.LLJL = i;
                }
            };
            HybridSchemaParam hybridSchemaParam = c1537830q7Z.LJJIIJ;
            if (hybridSchemaParam == null) {
                return;
            }
            InterfaceC1541990qEH interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParam, sparkContext, LJJIJL().getContext(), this.LLJLILLLLZIIL);
            if (interfaceC1541990qEHLIZIZ instanceof C1537720q7O) {
                c1537720q7O = (C1537720q7O) interfaceC1541990qEHLIZIZ;
            } else {
                c1537720q7O = null;
            }
            this.LLJJJJ = c1537720q7O;
            if (c1537720q7O != null) {
                c1537720q7O.load();
            }
            C1537720q7O c1537720q7O4 = this.LLJJJJ;
            if (c1537720q7O4 == null) {
                return;
            }
            View viewLJJIJL3 = LJJIJL();
            if (!(viewLJJIJL3 instanceof ViewGroup) || (viewGroup = (ViewGroup) viewLJJIJL3) == null) {
                return;
            }
            viewGroup.addView(c1537720q7O4);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C14SX c14sx) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C14SX c14sx) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
