package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C19719612Di;
import X.C2097608Jq;
import X.C212391189t;
import X.C2188811AlT;
import X.C2399609ak;
import X.C599820Nfo;
import X.C770702zh;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.item.ECMixMallItemDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.layer.ECMixMallPageItemDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.list.ECMixMallListDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.section.ECMixMallSectionDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.tab.ECMixMallMultiTabDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMixMallPageDTO {

    @C09CT("client_ab_keys")
    public List<String> abParams;

    @C09CT("aggregated_activity_info")
    public ECMixMallPageItemDTO aggregatedActivityInfo;

    @C09CT("bcm_page_params")
    public Map<String, ? extends Object> bcmPageParams;

    @C09CT("body")
    public ECMixMallListDTO body;

    @C09CT("chunk_info")
    public Map<String, ? extends Object> chunkInfo;

    @C09CT("chunk_name")
    public String chunkName;

    @C09CT("diversion_data")
    public Map<String, Object> diversionData;

    @C09CT("dynamic_background")
    public ECMixMallDynamicBackgroundDTO dynamicBackground;

    @C09CT("global_context_data")
    public Map<String, ? extends Object> globalContextData;

    @C09CT("header")
    public ECMixMallSectionDTO header;

    @C09CT("items_info")
    public Map<String, ECMixMallItemInfoDTO> itemsInfo;

    @C09CT("pendant_layer")
    public ECMixMallPageItemDTO layer;

    @C09CT("popup_info")
    public Map<String, Object> popupInfo;

    @C09CT("preload_image_list")
    public List<String> preloadImages;

    @C09CT("promotion_tasks")
    public h promotionTasks;

    @C09CT("runtime_card")
    public ECMixMallPageItemDTO runtime;

    @C09CT("service")
    public String service;

    @C09CT("style")
    public ECMixMallStyleDTO style;

    @C09CT("webcast_lru_cache_key_scene")
    public Map<String, String> webcastLruCacheKeyScene;

    @C09CT("webcast_lru_cache_scene")
    public List<String> webcastLruCacheScene;

    public final void LIZ() {
        Map<String, String> map;
        List<ECMixMallSectionDTO> list;
        List<String> list2 = this.webcastLruCacheScene;
        if (!(list2 == null || list2.isEmpty()) || ((map = this.webcastLruCacheKeyScene) != null && !map.isEmpty())) {
            List<String> list3 = this.webcastLruCacheScene;
            if (list3 != null) {
                for (String str : list3) {
                    C212391189t.LIZ.getClass();
                    C212391189t.LIZ(str, null);
                }
            }
            Map<String, String> map2 = this.webcastLruCacheKeyScene;
            if (map2 != null) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    C212391189t.LIZ.getClass();
                    C212391189t.LIZ(value, key);
                }
                return;
            }
            return;
        }
        ECMixMallListDTO eCMixMallListDTO = this.body;
        if (eCMixMallListDTO == null || (list = eCMixMallListDTO.sections) == null) {
            return;
        }
        Iterator<ECMixMallSectionDTO> it2 = list.iterator();
        while (it2.hasNext()) {
            h hVar = it2.next().webcastLruCacheList;
            if (hVar != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (k kVar : hVar) {
                    kVar.getClass();
                    if (kVar instanceof n) {
                        try {
                            n nVarLJIILIIL = kVar.LJIILIIL();
                            String strLIZJ = C2399609ak.LIZJ(nVarLJIILIIL, Scene.SCENE_SERVICE);
                            String strLIZJ2 = C2399609ak.LIZJ(nVarLJIILIIL, "key");
                            String strLIZJ3 = C2399609ak.LIZJ(nVarLJIILIIL, "value");
                            C212391189t.LIZ.getClass();
                            C212391189t.LIZIZ(strLIZJ, strLIZJ2, strLIZJ3);
                            if (C770702zh.LIZIZ(strLIZJ) && C770702zh.LIZIZ(strLIZJ2)) {
                                linkedHashMap.put(strLIZJ2, strLIZJ);
                            } else if (C770702zh.LIZIZ(strLIZJ)) {
                                linkedHashSet.add(strLIZJ);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("webcast_lru_cache_list, parse json, ");
                            sbLIZ.append(th.getMessage());
                            C2188811AlT.LIZIZ(sbLIZ);
                            c599820Nfo.getClass();
                            C599820Nfo.LIZIZ();
                        }
                    }
                }
                if (!linkedHashSet.isEmpty()) {
                    this.webcastLruCacheScene = C13LP.LLIIII(linkedHashSet);
                }
                if (!linkedHashMap.isEmpty()) {
                    this.webcastLruCacheKeyScene = C2097608Jq.LJIIZILJ(linkedHashMap);
                }
            }
        }
    }

    public final List<ECMixMallSectionDTO> LIZIZ() {
        List<ECMixMallSectionDTO> list;
        Iterable iterable;
        ECMixMallMultiTabDTO eCMixMallMultiTabDTO;
        ECMixMallListDTO eCMixMallListDTO = this.body;
        if (eCMixMallListDTO == null || (list = eCMixMallListDTO.sections) == null) {
            return null;
        }
        ArrayList<ECMixMallItemDTO> arrayList = new ArrayList();
        Iterator<ECMixMallSectionDTO> it2 = list.iterator();
        while (it2.hasNext()) {
            Iterable iterable2 = it2.next().items;
            if (iterable2 == null) {
                iterable2 = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(iterable2, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (ECMixMallItemDTO eCMixMallItemDTO : arrayList) {
            if (eCMixMallItemDTO == null || (eCMixMallMultiTabDTO = eCMixMallItemDTO.multiTab) == null || (iterable = eCMixMallMultiTabDTO.tabLists) == null) {
                iterable = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(iterable, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Iterable iterable3 = ((ECMixMallListDTO) it3.next()).sections;
            if (iterable3 == null) {
                iterable3 = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(iterable3, arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (((ECMixMallSectionDTO) obj).items != null) {
                arrayList4.add(obj);
            }
        }
        return arrayList4;
    }

    public final List<ECMixMallSectionDTO> LIZJ() {
        List<ECMixMallSectionDTO> list;
        ECMixMallListDTO eCMixMallListDTO = this.body;
        if (eCMixMallListDTO == null || (list = eCMixMallListDTO.sections) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ECMixMallSectionDTO eCMixMallSectionDTO : list) {
            if (eCMixMallSectionDTO.webcastLruCacheList != null) {
                arrayList.add(eCMixMallSectionDTO);
            }
        }
        return arrayList;
    }

    public final ECMixMallPageDTO LIZLLL(ECMixMallPageDTO eCMixMallPageDTO, String str) {
        List<ECMixMallSectionDTO> listLIZIZ;
        List<ECMixMallSectionDTO> list;
        ECMixMallSectionDTO next;
        ECMixMallSectionDTO next2;
        ArrayList<ECMixMallItemDTO> arrayList;
        String str2;
        if (eCMixMallPageDTO == null || (listLIZIZ = LIZIZ()) == null) {
            return null;
        }
        List<ECMixMallSectionDTO> listLIZIZ2 = eCMixMallPageDTO.LIZIZ();
        for (ECMixMallSectionDTO eCMixMallSectionDTO : listLIZIZ) {
            ArrayList<ECMixMallItemDTO> arrayList2 = eCMixMallSectionDTO.items;
            if (arrayList2 != null && listLIZIZ2 != null) {
                Iterator<ECMixMallSectionDTO> it2 = listLIZIZ2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (Intrinsics.LJFF(next2.id, eCMixMallSectionDTO.id)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                ECMixMallSectionDTO eCMixMallSectionDTO2 = next2;
                if (eCMixMallSectionDTO2 != null && (arrayList = eCMixMallSectionDTO2.items) != null) {
                    for (ECMixMallItemDTO eCMixMallItemDTO : arrayList) {
                        Iterator<ECMixMallItemDTO> it3 = arrayList2.iterator();
                        int i = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            ECMixMallItemDTO next3 = it3.next();
                            if (next3 != null && next3.id != null) {
                                String str3 = next3.id;
                                if (eCMixMallItemDTO != null) {
                                    str2 = eCMixMallItemDTO.id;
                                } else {
                                    str2 = null;
                                }
                                if (Intrinsics.LJFF(str3, str2)) {
                                    if (i != -1) {
                                        ListProtector.set(arrayList2, i, eCMixMallItemDTO);
                                    }
                                }
                            }
                            i++;
                        }
                        arrayList2.add(eCMixMallItemDTO);
                    }
                }
            }
        }
        this.chunkName = str;
        List<ECMixMallSectionDTO> listLIZJ = eCMixMallPageDTO.LIZJ();
        if (listLIZJ != null) {
            for (ECMixMallSectionDTO eCMixMallSectionDTO3 : listLIZJ) {
                ECMixMallListDTO eCMixMallListDTO = this.body;
                if (eCMixMallListDTO != null && (list = eCMixMallListDTO.sections) != null) {
                    Iterator<ECMixMallSectionDTO> it4 = list.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (Intrinsics.LJFF(next.id, eCMixMallSectionDTO3.id)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ECMixMallSectionDTO eCMixMallSectionDTO4 = next;
                    if (eCMixMallSectionDTO4 != null) {
                        h hVar = eCMixMallSectionDTO4.webcastLruCacheList;
                        if (hVar == null) {
                            hVar = new h();
                        }
                        h hVar2 = eCMixMallSectionDTO3.webcastLruCacheList;
                        if (hVar2 == null) {
                            hVar2 = new h();
                        }
                        ((ArrayList) hVar.LL).addAll(hVar2.LL);
                        eCMixMallSectionDTO4.webcastLruCacheList = hVar;
                    }
                }
            }
        }
        return this;
    }
}
