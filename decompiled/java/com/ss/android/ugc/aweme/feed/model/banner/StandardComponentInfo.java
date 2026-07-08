package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.metainfo.MetaInfoContainerStruct;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes12.dex */
public final class StandardComponentInfo implements Serializable {

    @C09CT("banner_enabled")
    public Boolean bannerEnabled;

    @C09CT("bottom_tag")
    public StandardTagContainerStruct bottomTag;

    @C09CT("button")
    public StandardButtonContainerStruct buttonContainer;

    @C09CT("client_standard_model_map")
    public ConcurrentHashMap<String, ConcurrentHashMap<String, ClientStandardModel>> clientStandardModelMap;

    @C09CT("high_tag")
    public StandardTagContainerStruct highTag;

    @C09CT("info_bar")
    public StandardInfoBarContainerStruct infoBarContainer;

    @C09CT("meta_info")
    public MetaInfoContainerStruct metaInfoContainer;

    @C09CT("meta_tag")
    public StandardTagContainerStruct metaTag;

    public StandardComponentInfo() {
        this(Boolean.FALSE, null, null, null, null, null, null);
    }

    public final StandardComponentInfo copy(Boolean bool, MetaInfoContainerStruct metaInfoContainerStruct, StandardButtonContainerStruct standardButtonContainerStruct, StandardTagContainerStruct standardTagContainerStruct, StandardTagContainerStruct standardTagContainerStruct2, StandardTagContainerStruct standardTagContainerStruct3, StandardInfoBarContainerStruct standardInfoBarContainerStruct) {
        return new StandardComponentInfo(bool, metaInfoContainerStruct, standardButtonContainerStruct, standardTagContainerStruct, standardTagContainerStruct2, standardTagContainerStruct3, standardInfoBarContainerStruct);
    }

    public final void setClientStandardModelMap(ConcurrentHashMap<String, ConcurrentHashMap<String, ClientStandardModel>> concurrentHashMap) {
        this.clientStandardModelMap = concurrentHashMap;
    }

    public final ClientStandardModel getClientModel(String str, String str2) {
        boolean z;
        ConcurrentHashMap<String, ClientStandardModel> concurrentHashMap;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || (concurrentHashMap = this.clientStandardModelMap.get(str)) == null) {
            return null;
        }
        return concurrentHashMap.get(str2);
    }

    public final boolean shouldShowBanner(List<BannerCommonStruct> list, String str) {
        String str2;
        if (Intrinsics.LJFF(this.bannerEnabled, Boolean.FALSE)) {
            return true;
        }
        if (list != null && !list.isEmpty() && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator<BannerCommonStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                BannerCommonKey bannerCommonKey = it2.next().bannerKey;
                if (bannerCommonKey != null) {
                    str2 = bannerCommonKey.componentKey;
                } else {
                    str2 = null;
                }
                if (u.LJIJI(str2, str, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void putClientModel(String str, String str2, ClientStandardModel clientStandardModel) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("condition: putClientModel: ");
        sbLIZ.append(str2);
        sbLIZ.append(", ");
        if (clientStandardModel == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str != null && str.length() != 0) {
            ConcurrentHashMap<String, ClientStandardModel> concurrentHashMap = this.clientStandardModelMap.get(str);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
                this.clientStandardModelMap.put(str, concurrentHashMap);
            }
            if (clientStandardModel != null) {
                concurrentHashMap.put(str2, clientStandardModel);
            }
        }
    }

    public StandardComponentInfo(Boolean bool, MetaInfoContainerStruct metaInfoContainerStruct, StandardButtonContainerStruct standardButtonContainerStruct, StandardTagContainerStruct standardTagContainerStruct, StandardTagContainerStruct standardTagContainerStruct2, StandardTagContainerStruct standardTagContainerStruct3, StandardInfoBarContainerStruct standardInfoBarContainerStruct) {
        this.bannerEnabled = bool;
        this.metaInfoContainer = metaInfoContainerStruct;
        this.buttonContainer = standardButtonContainerStruct;
        this.highTag = standardTagContainerStruct;
        this.bottomTag = standardTagContainerStruct2;
        this.metaTag = standardTagContainerStruct3;
        this.infoBarContainer = standardInfoBarContainerStruct;
        this.clientStandardModelMap = new ConcurrentHashMap<>();
    }
}
