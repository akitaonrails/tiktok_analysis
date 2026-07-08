package com.ss.android.ugc.profile.business.ur.ui;

import X.C0PEM;
import X.C1252704vF;
import X.C1701250uN9;
import X.C1702480uP8;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C786840Utm;
import X.C838400Wuk;
import android.os.Bundle;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public class UserProfileSafeFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspHELIOSOjx9PTdiPCZ9HTYpOx8hJyMlJSoAKSMpDz0yLygpJzs=";
    public final boolean LLIZ = C1252704vF.LIZIZ.LIZIZ();

    public final Bundle SR() {
        if (!this.LLIZ) {
            return getArguments();
        }
        C1701250uN9.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LargeTransaction: getArguments for ");
        sbLIZ.append(this);
        C786840Utm.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Bundle arguments = getArguments();
        String string = null;
        if (arguments == null) {
            return null;
        }
        try {
            string = arguments.getString("bytedance_tiktok_infra_fragment_bundle_uuid");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (string == null || string.length() == 0) {
            return arguments;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C1701250uN9.LIZIZ;
        Bundle bundle = (Bundle) concurrentHashMap.get(string);
        if (bundle != null) {
            return bundle;
        }
        byte[] bytesJustDisk = ((Keva) C1701250uN9.LJFF.LIZ.getValue()).getBytesJustDisk(string, new byte[0]);
        if (true ^ (bytesJustDisk.length == 0)) {
            Bundle bundleLIZ = C838400Wuk.LIZ(bytesJustDisk);
            concurrentHashMap.put(string, bundleLIZ);
            return bundleLIZ;
        }
        if (arguments.getBoolean("bytedance_tiktok_infra_fragment_bundle_disk_flag", false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LargeTransaction: memory cache & disk cache is lost for fragment(");
            sbLIZ2.append(this);
            sbLIZ2.append("), uuid=");
            sbLIZ2.append(string);
            sbLIZ2.append(", bundle=");
            sbLIZ2.append(arguments);
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            throw new RuntimeException(strLIZIZ) { // from class: X.0uP7
            };
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("LargeTransaction: memory cache & disk cache is not present for fragment(");
        sbLIZ3.append(this);
        sbLIZ3.append("), uuid=");
        sbLIZ3.append(string);
        sbLIZ3.append(", bundle=");
        sbLIZ3.append(arguments);
        final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        throw new RuntimeException(strLIZIZ2) { // from class: X.0uP7
        };
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.LLIZ && C1252704vF.LIZIZ.isInitialized().get()) {
            C1701250uN9.LIZ(C1701250uN9.LIZ, this);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1702480uP8(null), 3);
        }
    }

    public final void UR(Bundle bundle) {
        if (getArguments() == null) {
            super.setArguments(bundle);
            return;
        }
        throw new IllegalStateException("setArguments is already invoked");
    }

    @Override // androidx.fragment.app.Fragment
    public final void setArguments(Bundle bundle) {
        if (!this.LLIZ) {
            super.setArguments(bundle);
            return;
        }
        if (bundle == null) {
            super.setArguments(bundle);
            return;
        }
        C1701250uN9 c1701250uN9 = C1701250uN9.LIZ;
        AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 435);
        c1701250uN9.getClass();
        C1701250uN9.LIZIZ(this, bundle, awS605S0100000_26);
    }
}
