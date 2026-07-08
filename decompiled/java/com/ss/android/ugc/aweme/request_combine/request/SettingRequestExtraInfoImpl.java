package com.ss.android.ugc.aweme.request_combine.request;

import X.C15O7;
import X.C312060CLc;
import X.InterfaceC312070CLd;
import com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class SettingRequestExtraInfoImpl implements ISettingRequestExtraInfo {
    public final List<InterfaceC312070CLd> LIZ = new ArrayList();

    @Override // com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo
    public final void LIZ(C312060CLc c312060CLc) {
        if (!((ArrayList) this.LIZ).contains(c312060CLc)) {
            ((ArrayList) this.LIZ).add(c312060CLc);
        }
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo
    public final void LIZIZ(final Map<String, String> map) {
        C15O7.LIZJ(new Callable() { // from class: X.0CLe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("SettingRequestExtraInfoImpl@619d.notifySettingRequestExtra$1$1");
                List<InterfaceC312070CLd> list = this.LL.LIZ;
                Map<String, String> map2 = map;
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC312070CLd) it2.next()).LIZ(map2);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SettingRequestExtraInfoImpl@619d.notifySettingRequestExtra$1$1");
                return unit;
            }
        });
    }
}
