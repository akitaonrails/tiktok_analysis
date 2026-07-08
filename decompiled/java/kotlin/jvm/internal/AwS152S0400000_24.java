package kotlin.jvm.internal;

import X.C09AY;
import X.C13BV;
import X.C13LP;
import X.C1580100rDk;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1571310qzZ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.DramaDNUFeedCardConfig;
import com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponent;
import com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponentUiData;
import com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarComponentActionProtocol;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentEventParams;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentUiData;
import com.ss.android.ugc.aweme.sidebar.model.SideBarSectionComponentConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes25.dex */
public class AwS152S0400000_24 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS152S0400000_24 awS152S0400000_24) {
        ViewGroup viewGroup;
        C786410Ut5.LJJJLZIJ((View) awS152S0400000_24.l1, (ViewGroup) awS152S0400000_24.l0);
        C786410Ut5.T4((View) awS152S0400000_24.l1, 1.0f);
        ViewGroup viewGroup2 = (ViewGroup) awS152S0400000_24.l0;
        View view = (View) awS152S0400000_24.l2;
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
        }
        viewGroup2.addView(view);
        Iterator it2 = ((ArrayList) ((C1580100rDk) awS152S0400000_24.l3).LJIILIIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1571310qzZ) it2.next()).LIZ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS152S0400000_24 r10) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS152S0400000_24.invoke$1(kotlin.jvm.internal.AwS152S0400000_24):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    public static final Object invoke$2(AwS152S0400000_24 awS152S0400000_24) {
        ?? arrayList;
        LinkedHashMap linkedHashMap;
        SideBarComponentUiData sideBarComponentUiData;
        List<SideBarComponentEventParams> list;
        Collection<Map.Entry> collectionEntrySet;
        Object next;
        Function2 function2We;
        String str;
        List listLJIIJJI = C1697810uHb.LJIIJJI("header", "header_title", "header_arrow");
        SideBarSectionComponentConfig sideBarSectionComponentConfig = (SideBarSectionComponentConfig) awS152S0400000_24.l0;
        SideBarSectionComponent sideBarSectionComponent = (SideBarSectionComponent) awS152S0400000_24.l1;
        View view = (View) awS152S0400000_24.l3;
        List list2 = (List) sideBarSectionComponent.LLJJJIL.getValue();
        String str2 = null;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    String strLJJJ = ((ISideBarComponentActionProtocol) next).LJJJ();
                    if (sideBarSectionComponentConfig != null) {
                        str = sideBarSectionComponentConfig.sectionId;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(strLJJJ, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ISideBarComponentActionProtocol iSideBarComponentActionProtocol = (ISideBarComponentActionProtocol) next;
            if (iSideBarComponentActionProtocol != null && (function2We = iSideBarComponentActionProtocol.we(sideBarSectionComponentConfig)) != null) {
                function2We.invoke(view, sideBarSectionComponent.LLJJI);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(Scene.SCENE_SERVICE, C13LP.LJJLIIIJ(listLJIIJJI, ",", null, null, 0, null, null, 62));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        SideBarSectionComponentConfig sideBarSectionComponentConfig2 = (SideBarSectionComponentConfig) awS152S0400000_24.l0;
        if (sideBarSectionComponentConfig2 != null) {
            str2 = sideBarSectionComponentConfig2.sectionId;
        }
        sbLIZ.append(str2);
        sbLIZ.append("_header");
        linkedHashMap2.put("component", C2188811AlT.LIZIZ(sbLIZ));
        Map map = (Map) ((SideBarSectionComponent) awS152S0400000_24.l1).lp("common_event_params");
        if (map != null) {
            linkedHashMap2.putAll(map);
        }
        List<Map> list3 = (List) awS152S0400000_24.l2;
        if (list3 == null) {
            list3 = C13BV.INSTANCE;
        }
        for (Map map2 : list3) {
            if (map2 == null || (collectionEntrySet = map2.entrySet()) == null) {
                collectionEntrySet = C13BV.INSTANCE;
            }
            for (Map.Entry entry : collectionEntrySet) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ((SideBarSectionComponent) awS152S0400000_24.l1).hp("sidebar_entrance_show", linkedHashMap2);
        SideBarSectionComponentUiData sideBarSectionComponentUiData = ((SideBarSectionComponent) awS152S0400000_24.l1).LLJJJ;
        if (sideBarSectionComponentUiData != null && (sideBarComponentUiData = sideBarSectionComponentUiData.titleData) != null && (list = sideBarComponentUiData.eventParams) != null) {
            arrayList = new ArrayList();
            for (SideBarComponentEventParams sideBarComponentEventParams : list) {
                SideBarComponentEventParams sideBarComponentEventParams2 = sideBarComponentEventParams;
                if (!Intrinsics.LJFF(sideBarComponentEventParams2.event, "sidebar_entrance_show") && Intrinsics.LJFF(sideBarComponentEventParams2.type, "show")) {
                    arrayList.add(sideBarComponentEventParams);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        for (SideBarComponentEventParams sideBarComponentEventParams3 : arrayList) {
            String str3 = sideBarComponentEventParams3.event;
            if (str3 != null) {
                Map<String, Object> mapLIZ = sideBarComponentEventParams3.LIZ();
                if (mapLIZ != null) {
                    linkedHashMap = new LinkedHashMap(mapLIZ);
                } else {
                    linkedHashMap = new LinkedHashMap();
                }
                ((SideBarSectionComponent) awS152S0400000_24.l1).hp(str3, linkedHashMap);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0400000_24(ViewGroup viewGroup, View view, View view2, C1580100rDk c1580100rDk, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = view;
        this.l2 = view2;
        this.l3 = c1580100rDk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0400000_24(DramaDNUFeedCardConfig dramaDNUFeedCardConfig, Context context, Aweme aweme, HomeViewPagerAbility homeViewPagerAbility, int i) {
        super(0);
        this.$t = i;
        this.l0 = dramaDNUFeedCardConfig;
        this.l1 = context;
        this.l2 = aweme;
        this.l3 = homeViewPagerAbility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS152S0400000_24(SideBarSectionComponentConfig sideBarSectionComponentConfig, SideBarSectionComponentConfig sideBarSectionComponentConfig2, SideBarSectionComponent sideBarSectionComponent, List<? extends Map<String, ? extends Object>> list, View view) {
        super(0);
        this.$t = view;
        this.l0 = sideBarSectionComponentConfig;
        this.l1 = sideBarSectionComponentConfig2;
        this.l2 = sideBarSectionComponent;
        this.l3 = list;
    }
}
