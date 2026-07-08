package com.ss.android.ugc.aweme.sidebar.components;

import X.C01GW;
import X.C13BV;
import X.C15438062q;
import X.C21244318Bt;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1580560rEU;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarComponentActionProtocol;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentAction;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentEventParams;
import com.ss.android.ugc.aweme.sidebar.model.SideBarSectionComponentConfig;
import com.ss.android.ugc.feed.platform.metric.IDeviceInfoService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS57S0500000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public abstract class SideBarSectionComponent extends SideBarComponent<SideBarSectionComponentConfig> {
    public SideBarSectionComponentUiData LLJJJ;
    public boolean LLJJIJIIJIL = true;
    public final List<String> LLJJIJIL = new ArrayList();
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1129));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cdx;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarComponent, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        int iLIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.uip);
        boolean z = false;
        IDeviceInfoService iDeviceInfoService = (IDeviceInfoService) PluggableExtentionKt.pluggableSpi$default(IDeviceInfoService.class, false, false, false, 14, null);
        if (iDeviceInfoService != null) {
            iLIZ = iDeviceInfoService.LIZ();
        } else {
            iLIZ = 0;
        }
        if ((iLIZ >> 1) == 1) {
            z = true;
        }
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                if (!z) {
                    marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                } else {
                    marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                }
                marginLayoutParams2 = marginLayoutParams;
            }
            C786410Ut5.W5(viewFindViewById, marginLayoutParams2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017b  */
    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarComponent
    /* JADX INFO: renamed from: Bp, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tp(android.view.View r16, com.ss.android.ugc.aweme.sidebar.model.SideBarSectionComponentConfig r17) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponent.tp(android.view.View, com.ss.android.ugc.aweme.sidebar.model.SideBarSectionComponentConfig):void");
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarComponent
    public final void op(int i, InterfaceC1580560rEU interfaceC1580560rEU) {
        super.op(i + 1, interfaceC1580560rEU);
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarComponent
    public void up(SideBarComponent<?> sideBarComponent, InterfaceC1580560rEU interfaceC1580560rEU) {
        super.up(sideBarComponent, interfaceC1580560rEU);
        sideBarComponent.zp(lp("custom_data"), "custom_data", false);
    }

    public final Function1<View, Unit> Ap(View view, SideBarSectionComponentConfig sideBarSectionComponentConfig, SideBarComponentAction sideBarComponentAction, List<SideBarComponentEventParams> list) {
        ArrayList arrayList;
        Object tag;
        String str;
        ArrayList arrayList2;
        List list2;
        Object next;
        Function2 function2P0;
        String str2;
        Object obj;
        String strCreateJumpSourceBtmToken;
        Uri.Builder builderAppendQueryParameter;
        Uri uriBuild;
        Uri uri;
        String str3;
        Collection<Map.Entry> collectionEntrySet;
        Uri.Builder builderBuildUpon = null;
        if (sideBarComponentAction == null) {
            return null;
        }
        if (view != null) {
            view.setClickable(true);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = (Map) lp("common_event_params");
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (SideBarComponentEventParams sideBarComponentEventParams : list) {
                SideBarComponentEventParams sideBarComponentEventParams2 = sideBarComponentEventParams;
                if (Intrinsics.LJFF(sideBarComponentEventParams2.event, "sidebar_entrance_click") && Intrinsics.LJFF(sideBarComponentEventParams2.type, "click")) {
                    arrayList3.add(sideBarComponentEventParams);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList.add(((SideBarComponentEventParams) it2.next()).LIZ());
            }
        } else {
            arrayList = null;
        }
        if (view != null) {
            tag = view.getTag(R.id.vb2);
        } else {
            tag = null;
        }
        if (!(tag instanceof String)) {
            tag = null;
        }
        linkedHashMap.put(Scene.SCENE_SERVICE, tag);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (sideBarSectionComponentConfig != null) {
            str = sideBarSectionComponentConfig.sectionId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append("_header");
        linkedHashMap.put("component", C2188811AlT.LIZIZ(sbLIZ));
        List<Map> list3 = arrayList;
        if (arrayList == null) {
            list3 = C13BV.INSTANCE;
        }
        for (Map map2 : list3) {
            if (map2 == null || (collectionEntrySet = map2.entrySet()) == null) {
                collectionEntrySet = C13BV.INSTANCE;
            }
            for (Map.Entry entry : collectionEntrySet) {
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        if (list != null) {
            arrayList2 = new ArrayList();
            for (SideBarComponentEventParams sideBarComponentEventParams3 : list) {
                SideBarComponentEventParams sideBarComponentEventParams4 = sideBarComponentEventParams3;
                if (!Intrinsics.LJFF(sideBarComponentEventParams4.event, "sidebar_entrance_click") && Intrinsics.LJFF(sideBarComponentEventParams4.type, "click")) {
                    arrayList2.add(sideBarComponentEventParams3);
                }
            }
        } else {
            arrayList2 = null;
        }
        AwS425S0200000_24 awS425S0200000_24 = new AwS425S0200000_24(sideBarSectionComponentConfig, this, 40);
        String str4 = sideBarComponentAction.type;
        if (Intrinsics.LJFF(str4, "router")) {
            Map<String, Object> map3 = sideBarComponentAction.params;
            if (map3 != null) {
                obj = map3.get("btm");
            } else {
                obj = null;
            }
            if ((obj instanceof String) && (str3 = (String) obj) != null) {
                BtmSDK btmSDK = BtmSDK.INSTANCE;
                C21244318Bt c21244318Bt = new C21244318Bt();
                c21244318Bt.LIZ = str3;
                c21244318Bt.LIZIZ = PageFinder.via(C724240Sb0.LJI(this));
                strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken(c21244318Bt);
            } else {
                strCreateJumpSourceBtmToken = null;
            }
            String str5 = sideBarComponentAction.routerUrl;
            if (str5 != null && (uri = UriProtector.parse(str5)) != null) {
                builderBuildUpon = uri.buildUpon();
            }
            if (strCreateJumpSourceBtmToken != null && builderBuildUpon != null && (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("source_btm_token", strCreateJumpSourceBtmToken)) != null && (uriBuild = builderAppendQueryParameter.build()) != null) {
                uriBuild.toString();
            }
            return new AwS57S0500000_24(awS425S0200000_24, builderBuildUpon, this, linkedHashMap, arrayList2, 0);
        }
        if (!Intrinsics.LJFF(str4, "custom") || view == null || (list2 = (List) this.LLJJJIL.getValue()) == null) {
            return null;
        }
        Iterator it3 = list2.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                String strLJJJ = ((ISideBarComponentActionProtocol) next).LJJJ();
                if (sideBarSectionComponentConfig != null) {
                    str2 = sideBarSectionComponentConfig.sectionId;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(strLJJJ, str2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ISideBarComponentActionProtocol iSideBarComponentActionProtocol = (ISideBarComponentActionProtocol) next;
        if (iSideBarComponentActionProtocol == null || (function2P0 = iSideBarComponentActionProtocol.P0(sideBarSectionComponentConfig)) == null) {
            return null;
        }
        return new AwS57S0500000_24(awS425S0200000_24, function2P0, this, linkedHashMap, arrayList2, 1);
    }
}
