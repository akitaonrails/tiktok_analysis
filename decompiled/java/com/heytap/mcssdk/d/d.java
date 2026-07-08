package com.heytap.mcssdk.d;

import X.C2188811AlT;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.msp.push.mode.BaseMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public abstract class d implements e {
    public static int a(Intent intent) {
        int i = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        if (intent == null) {
            return SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        }
        try {
            i = CastIntegerProtector.parseInt(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_d_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "type")));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseMessageType e:");
            sbLIZ.append(e.getMessage());
            com.heytap.mcssdk.utils.e.e(C2188811AlT.LIZIZ(sbLIZ));
        }
        com.heytap.mcssdk.utils.e.b("parseMessageType type:" + i);
        return i;
    }

    public static List<BaseMode> a(Context context, Intent intent, List<e> list) {
        BaseMode baseModeA;
        if (intent == null) {
            return null;
        }
        int iA = a(intent);
        ArrayList arrayList = new ArrayList();
        for (e eVar : list) {
            if (eVar != null && (baseModeA = eVar.a(context, iA, intent)) != null) {
                arrayList.add(baseModeA);
            }
        }
        return arrayList;
    }

    public abstract BaseMode a(Intent intent, int i);

    public static String INVOKEVIRTUAL_com_heytap_mcssdk_d_d_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
