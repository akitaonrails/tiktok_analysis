package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticData {

    @C09CT("logistics")
    public List<LogisticDTO> logistics;

    @C09CT("selected_logistics_service_id")
    public String selectedLogisticsServiceId;

    @C09CT("title")
    public String title;

    public LogisticData() {
    }

    public LogisticData(String str, List<LogisticDTO> list, String str2) {
        this.title = str;
        this.logistics = list;
        this.selectedLogisticsServiceId = str2;
    }
}
