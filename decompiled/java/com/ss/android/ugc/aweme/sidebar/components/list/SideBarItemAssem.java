package com.ss.android.ugc.aweme.sidebar.components.list;

import X.C01GW;
import X.C08CX;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13BV;
import X.C1580730rEl;
import X.C20684815ws;
import X.C2188811AlT;
import X.C452501pT;
import X.C724270Sb3;
import X.InterfaceC1580560rEU;
import X.InterfaceC1580740rEm;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentEventParams;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentUiData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public abstract class SideBarItemAssem<T extends InterfaceC1580740rEm> extends ReusedUISlotAssem<SideBarItemAssem<?>> implements InterfaceC712990Rxx<C1580730rEl<T>> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS568S0100000_24((SideBarItemAssem) this, 1137));

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final SideBarComponentUiData op() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C1580730rEl) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILLJJLI;
    }

    public final Map<String, Object> sp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C1580730rEl) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILLL;
    }

    public final T up() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C1580730rEl) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL;
    }

    public final <S> S tp(String str) {
        S s = (S) ((LinkedHashMap) sp()).get(str);
        if (s == null) {
            return null;
        }
        return s;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public final void yp(String str, List<SideBarComponentEventParams> list) {
        String id;
        Set<Map.Entry> setEntrySet;
        String id2;
        String str2;
        List<SideBarComponentEventParams> list2;
        List<SideBarComponentEventParams> list3;
        String str3;
        Map<String, Object> mapLIZ;
        Collection<Map.Entry> collectionEntrySet;
        String string;
        Collection<Map.Entry> collectionEntrySet2;
        String string2;
        Map<String, Object> mapLIZ2;
        String str4;
        String str5;
        String str6;
        String string3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = (Map) tp("common_event_params");
        Object objTp = tp("enter_from");
        Object objTp2 = tp("enter_method");
        Object objTp3 = tp("entrance_id");
        InterfaceC1580560rEU interfaceC1580560rEU = (InterfaceC1580560rEU) tp("parent_config");
        if (interfaceC1580560rEU != null) {
            id = interfaceC1580560rEU.getId();
        } else {
            id = null;
        }
        linkedHashMap.put("enter_from", objTp);
        linkedHashMap.put("enter_method", objTp2);
        linkedHashMap.put("component_field", id);
        linkedHashMap.put("entrance_id", objTp3);
        if (map == null || (setEntrySet = map.entrySet()) == null) {
            setEntrySet = C08CX.INSTANCE;
        }
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                string3 = value.toString();
            } else {
                string3 = null;
            }
            linkedHashMap.put(key, string3);
        }
        if (Intrinsics.LJFF(id, "tiktok_minis") && up().getContentType() == 50001) {
            if (Intrinsics.LJFF(tp("minis_entrance_from"), "revisit_edu_api")) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_minis_revisit_edu", str6);
        }
        Object tag = getContentView().getTag(R.id.vb2);
        if (!(tag instanceof String)) {
            tag = null;
        }
        linkedHashMap.put(Scene.SCENE_SERVICE, tag);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        InterfaceC1580560rEU interfaceC1580560rEU2 = (InterfaceC1580560rEU) tp("parent_config");
        if (interfaceC1580560rEU2 != null) {
            id2 = interfaceC1580560rEU2.getId();
        } else {
            id2 = null;
        }
        sbLIZ.append(id2);
        sbLIZ.append("_list");
        linkedHashMap.put("component", C2188811AlT.LIZIZ(sbLIZ));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(linkedHashMap);
        if (Intrinsics.LJFF(str, "show")) {
            str2 = "sidebar_entrance_show";
        } else if (Intrinsics.LJFF(str, "click")) {
            str2 = "sidebar_entrance_click";
        } else {
            str2 = null;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (SideBarComponentEventParams sideBarComponentEventParams : list) {
                SideBarComponentEventParams sideBarComponentEventParams2 = sideBarComponentEventParams;
                if (sideBarComponentEventParams2 != null) {
                    str5 = sideBarComponentEventParams2.type;
                } else {
                    str5 = null;
                }
                if (Intrinsics.LJFF(str5, str)) {
                    arrayList.add(sideBarComponentEventParams);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                SideBarComponentEventParams sideBarComponentEventParams3 = (SideBarComponentEventParams) obj;
                if (sideBarComponentEventParams3 != null) {
                    str4 = sideBarComponentEventParams3.event;
                } else {
                    str4 = null;
                }
                if (Intrinsics.LJFF(str4, str2)) {
                    arrayList2.add(obj);
                } else {
                    arrayList3.add(obj);
                }
            }
            Pair pair = new Pair(arrayList2, arrayList3);
            list2 = (List) pair.getFirst();
            list3 = (List) pair.getSecond();
        } else {
            list2 = null;
            list3 = null;
        }
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        for (SideBarComponentEventParams sideBarComponentEventParams4 : list2) {
            if (sideBarComponentEventParams4 == null || (mapLIZ2 = sideBarComponentEventParams4.LIZ()) == null || (collectionEntrySet2 = mapLIZ2.entrySet()) == null) {
                collectionEntrySet2 = C13BV.INSTANCE;
            }
            for (Map.Entry entry2 : collectionEntrySet2) {
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                if (value2 != null) {
                    string2 = value2.toString();
                } else {
                    string2 = null;
                }
                linkedHashMap2.put(key2, string2);
            }
        }
        C20684815ws.LJIILLIIL(str2, linkedHashMap2);
        if (list3 == null) {
            list3 = C13BV.INSTANCE;
        }
        for (SideBarComponentEventParams sideBarComponentEventParams5 : list3) {
            if (sideBarComponentEventParams5 != null) {
                str3 = sideBarComponentEventParams5.event;
                mapLIZ = sideBarComponentEventParams5.LIZ();
            } else {
                str3 = null;
                mapLIZ = null;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            if (mapLIZ == null || (collectionEntrySet = mapLIZ.entrySet()) == null) {
                collectionEntrySet = C13BV.INSTANCE;
            }
            for (Map.Entry entry3 : collectionEntrySet) {
                Object key3 = entry3.getKey();
                Object value3 = entry3.getValue();
                if (value3 != null) {
                    string = value3.toString();
                } else {
                    string = null;
                }
                linkedHashMap3.put(key3, string);
            }
            linkedHashMap.putAll(linkedHashMap3);
            C20684815ws.LJIILLIIL(str3, linkedHashMap);
        }
    }

    public static void zp(SmartImageView smartImageView, ImageUrlModel imageUrlModel, int i) {
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModel);
        c1331670kl3LJIIIIZZ.LJIIIIZZ = i;
        c1331670kl3LJIIIIZZ.LJIIIZ = i;
        c1331670kl3LJIIIIZZ.LJJ(smartImageView);
        c1331670kl3LJIIIIZZ.LJIIJJI();
    }
}
