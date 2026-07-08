package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C1161920gLG;
import X.C1303170k15;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;

/* JADX INFO: loaded from: classes21.dex */
public class LinkMicDslTask extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "link_mic_dsl_task";
    }

    @Override // X.AbstractC20513081v
    public void run() {
        C1303170k15 c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22();
        if (c1303170k15Y22 != null) {
            c1303170k15Y22.LJFF("LinkMicDslTask#run");
        }
    }
}
