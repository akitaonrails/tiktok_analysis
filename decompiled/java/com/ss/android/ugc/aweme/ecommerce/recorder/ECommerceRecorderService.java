package com.ss.android.ugc.aweme.ecommerce.recorder;

import X.AbstractC1542200qEc;
import X.C0LFL;
import X.C14CH;
import X.C14CI;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1548820qPI;
import X.C259800zU;
import X.C786410Ut5;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceRecorderService;
import java.util.Set;
import org.json.JSONException;

/* JADX INFO: loaded from: classes31.dex */
public final class ECommerceRecorderService implements IEcommerceRecorderService {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, X.0qEB] */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceRecorderService
    public final C0LFL LIZ(LifecycleOwner lifecycleOwner, ViewGroup viewGroup, Bundle bundle) throws JSONException {
        boolean z;
        String string;
        String string2;
        if (bundle != null) {
            z = bundle.getBoolean("ec_need_ai_teleprompter");
        } else {
            z = false;
        }
        String str = "";
        if (bundle == null || (string = bundle.getString("commerce_data_in_tools_line")) == null) {
            string = "";
        }
        if (bundle != null && (string2 = bundle.getString("enter_from")) != null) {
            str = string2;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcSvAiTeleprompterModel ecSvAiTeleprompterModel = C14CH.LIZ;
        EcSvAiTeleprompterModel ecSvAiTeleprompterModel2 = (EcSvAiTeleprompterModel) settingsManagerLIZLLL.LJIIIIZZ("ec_sv_ai_teleprompter", EcSvAiTeleprompterModel.class, ecSvAiTeleprompterModel);
        if (ecSvAiTeleprompterModel2 == null) {
            ecSvAiTeleprompterModel2 = ecSvAiTeleprompterModel;
        }
        boolean z2 = ecSvAiTeleprompterModel2.enable;
        if (z && z2) {
            FrameLayout frameLayout = (FrameLayout) viewGroup;
            final C14CI c14ci = new C14CI(lifecycleOwner, frameLayout, str, string);
            Set<Integer> set = C14CI.LLIZLLLIL;
            if (!set.contains(Integer.valueOf(frameLayout.hashCode()))) {
                set.add(Integer.valueOf(frameLayout.hashCode()));
                final C259800zU c259800zU = new C259800zU();
                SparkContext sparkContext = new SparkContext();
                EcSvAiTeleprompterModel ecSvAiTeleprompterModel3 = (EcSvAiTeleprompterModel) SettingsManager.LIZLLL().LJIIIIZZ("ec_sv_ai_teleprompter", EcSvAiTeleprompterModel.class, ecSvAiTeleprompterModel);
                if (ecSvAiTeleprompterModel3 != null) {
                    ecSvAiTeleprompterModel = ecSvAiTeleprompterModel3;
                }
                sparkContext.LJJLIIJ(UriProtector.parse(ecSvAiTeleprompterModel.url).buildUpon().appendQueryParameter("commerce_data_in_tools_line", string).appendQueryParameter("enter_from", str).build().toString());
                sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.14CG
                    @Override // X.AbstractC1537870q7d
                    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                        c14ci.LLILZ = false;
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c259800zU.element;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                            C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 8);
                        }
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c259800zU.element;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
                            c1389890mGx.LJIIIZ(2131830350);
                            c1389890mGx.LJIIJJI();
                        }
                    }
                });
                C1548820qPI.LJFF("ec_teleprompter_loaded", c14ci, sparkContext.containerId);
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                Context context = frameLayout.getContext();
                c1537900q7g.getClass();
                ?? LIZ = new C1541950qED(context, sparkContext).LIZ(false);
                c259800zU.element = LIZ;
                C786410Ut5.LLLLIIIILLL(LIZ, 8);
                ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) c259800zU.element).LJIIIIZZ();
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) c259800zU.element;
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.setBackgroundColor(0);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                frameLayout.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 0, layoutParams);
                c14ci.LLILLL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                lifecycleOwner.getLifecycle().addObserver(new EcAITeleprompterManager$inject$2(c14ci));
                return c14ci;
            }
            return null;
        }
        return null;
    }
}
