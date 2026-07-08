package com.ss.android.ugc.aweme.tako;

import X.AbstractC1387200mCc;
import X.C0AXD;
import X.C1387090mCR;
import X.C18077076d;
import com.ss.android.ugc.aweme.tako.ui.TakoChatRootFragment;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoLaunchServiceImpl implements ITakoLaunchService {
    @Override // com.ss.android.ugc.aweme.tako.ITakoLaunchService
    public final boolean LIZLLL() {
        return C18077076d.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoLaunchService
    public final boolean LJ(AbstractC1387200mCc abstractC1387200mCc) {
        if (!((Boolean) C0AXD.LIZ.getValue()).booleanValue() || abstractC1387200mCc == null || !(abstractC1387200mCc.LIZLLL() instanceof TakoChatRootFragment)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoLaunchService
    public final void LIZIZ(String str, JSONObject jSONObject) {
        C1387090mCR.LIZIZ(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoLaunchService
    public final void LIZJ(String str, Map<String, String> map) {
        C1387090mCR.LIZ(str, map);
    }
}
