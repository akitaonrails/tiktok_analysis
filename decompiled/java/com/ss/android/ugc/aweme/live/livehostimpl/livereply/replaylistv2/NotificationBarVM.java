package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2;

import X.C1155590gB3;
import X.C1834350xpp;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tikcast.api.anchor.replay.NotificationBarStatus;

/* JADX INFO: loaded from: classes28.dex */
public final class NotificationBarVM extends AssemViewModel<C1155590gB3> {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public boolean LL;

    public static List vQ2() {
        C1834350xpp.LIZ.getClass();
        Map<Integer, Integer> mapLIZ = C1834350xpp.LJIJJLI.LIZ();
        if (mapLIZ == null) {
            mapLIZ = new LinkedHashMap<>();
        }
        ArrayList arrayList = new ArrayList(mapLIZ.size());
        for (Map.Entry<Integer, Integer> entry : mapLIZ.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            NotificationBarStatus notificationBarStatus = new NotificationBarStatus();
            notificationBarStatus.notificationType = iIntValue;
            notificationBarStatus.status = iIntValue2;
            arrayList.add(notificationBarStatus);
        }
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1155590gB3(null);
    }
}
