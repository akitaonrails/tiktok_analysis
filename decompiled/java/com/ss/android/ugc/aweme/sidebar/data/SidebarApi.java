package com.ss.android.ugc.aweme.sidebar.data;

import X.C09CT;
import X.C1580530rER;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.sidebar.model.SideBarRootComponentConfig;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public interface SidebarApi {
    public static final C1580530rER LIZ = C1580530rER.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/homepage/sidebar")
    Object getSidebarConfig(@InterfaceC1485405rg SidebarConfigRequestBody sidebarConfigRequestBody, InterfaceC1364105Vn<? super SideBarRootComponentConfig> interfaceC1364105Vn);

    public static final class SidebarConfigRequestBody {

        @C09CT("post_type")
        public final String postType;

        @C09CT("section_ids")
        public final List<String> sectionIds;

        public SidebarConfigRequestBody(String str, List<String> list) {
            this.postType = str;
            this.sectionIds = list;
        }
    }
}
