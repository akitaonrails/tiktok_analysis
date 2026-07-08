package com.ss.android.ugc.aweme.live.smoothhost;

import X.C08XD;
import X.C098200Yq;
import X.C0IJT;
import X.C1338270kvh;
import X.C150W;
import X.C150X;
import X.C150Y;
import X.C150Z;
import X.C189200o6;
import X.C19EG;
import X.C474500IjA;
import X.C782920UnS;
import X.InterfaceC1670800ta2;
import X.InterfaceC772190UQv;
import X.InterfaceC775460UbQ;
import Y.AComparatorS50S0000000_31;
import android.os.Bundle;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService;
import com.ss.android.ugc.aweme.social.creation.mediapicker.SocialCreationMediaPickerScene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class BottomTabManager {
    public static int LIZJ;
    public static C19EG LIZLLL;
    public static EnterStoryParam LJ;
    public static Bundle LJFF;
    public static boolean LJI;
    public static TokenCert LJIIIIZZ;
    public static final BottomTabManager LIZ = new BottomTabManager();
    public static final List<C150Z> LIZIZ = new ArrayList();
    public static String LJII = "default_tab_page";

    public static C150Z LIZ(C150X c150x) {
        InterfaceC775460UbQ interfaceC775460UbQ;
        SocialCreationMediaPickerScene socialCreationMediaPickerSceneLIZJ;
        int i = C150W.LIZ[c150x.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            SocMediaPickerService socMediaPickerService = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null);
            C19EG c19eg = LIZLLL;
            if (c19eg == null || socMediaPickerService == null || (socialCreationMediaPickerSceneLIZJ = socMediaPickerService.LIZJ(c19eg, null, LJFF, LJ, null)) == null) {
                return null;
            }
            return new C150Z(0, socialCreationMediaPickerSceneLIZJ, C150X.STORY.getTag(), 2131856815, new AwS645S0100000_31(socMediaPickerService, 42), 40);
        }
        InterfaceC1670800ta2 interfaceC1670800ta2 = LIZLLL;
        if (interfaceC1670800ta2 instanceof InterfaceC775460UbQ) {
            interfaceC775460UbQ = (InterfaceC775460UbQ) interfaceC1670800ta2;
        } else {
            interfaceC775460UbQ = null;
        }
        return new C150Z(1, new C782920UnS(interfaceC775460UbQ, false, null), C150X.LIVE.getTag(), 2131856814, null, 104);
    }

    public static void LIZIZ(C150Y c150y) {
        String string;
        C150Z c150zLIZ;
        String string2;
        Object c098200Yq;
        c150y.LIZ.getLifecycle().addObserver(new BottomTabManager$init$1());
        LIZLLL = c150y.LIZ;
        LJ = c150y.LIZIZ;
        Bundle bundle = c150y.LIZJ;
        LJFF = bundle;
        if (bundle != null && (string2 = bundle.getString("sourceParams")) != null) {
            try {
                String strOptString = new JSONObject(string2).optString("enter_from");
                if (strOptString == null) {
                    strOptString = LJII;
                }
                LJII = strOptString;
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        Bundle bundle2 = LJFF;
        ArrayList arrayList = (ArrayList) LIZIZ;
        arrayList.clear();
        C150X c150x = C150X.LIVE;
        C150Z c150zLIZ2 = LIZ(c150x);
        if (c150zLIZ2 != null) {
            LIZ.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_entrance_show");
            c474500IjALIZ.LJJII(LJII, "live_entrance_name");
            c474500IjALIZ.LIZ();
            arrayList.add(c150zLIZ2);
        }
        if (bundle2 != null) {
            string = bundle2.getString("enable_story_tab");
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, "true") && (c150zLIZ = LIZ(C150X.STORY)) != null) {
            arrayList.add(c150zLIZ);
        }
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS50S0000000_31(3));
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        String strLIZIZ = InterfaceC772190UQv.W2.LIZIZ();
        String str = strLIZIZ;
        if (str == null || str.length() == 0) {
            strLIZIZ = c150x.getTag();
        }
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(((C150Z) it2.next()).LIZJ, strLIZIZ)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        LIZJ = Math.max(i, 0);
    }
}
