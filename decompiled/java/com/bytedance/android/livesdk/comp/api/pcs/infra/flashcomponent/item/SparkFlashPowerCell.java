package com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.item;

import X.C0KJF;
import X.C1161920gLG;
import X.C1537710q7N;
import X.C470320IcQ;
import X.InterfaceC1891350zJl;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.FlashDataProvider;
import com.bytedance.ies.powerlist.PowerCell;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class SparkFlashPowerCell extends PowerCell<C0KJF> {
    public FrameLayout LL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILLJJLI;
    public C0KJF LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) throws JSONException {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        LynxView lynxView;
        C0KJF c0kjf = (C0KJF) interfaceC1891350zJl;
        C0KJF c0kjf2 = this.LLILLL;
        JSONObject jSONObjectLIZ = null;
        if (c0kjf2 == null) {
            ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0().LIZIZ();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = C470320IcQ.LIZ.LIZ(this.itemView.getContext(), c0kjf.LL, "", true, null);
            this.LLILLJJLI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ != null) {
                Object kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getKitView();
                if ((kitView instanceof C1537710q7N) && (lynxView = (LynxView) kitView) != null) {
                    FlashDataProvider flashDataProvider = c0kjf.LLILLL;
                    if (flashDataProvider != null) {
                        jSONObjectLIZ = flashDataProvider.LIZ();
                    }
                    lynxView.updateData(String.valueOf(jSONObjectLIZ));
                }
                FrameLayout frameLayout = this.LL;
                if (frameLayout != null) {
                    frameLayout.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
                }
            }
        } else if (this.LLILLJJLI != null && !Intrinsics.LJFF(c0kjf2, c0kjf) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLJJLI) != null) {
            String str = c0kjf.LL;
            FlashDataProvider flashDataProvider2 = c0kjf.LLILLL;
            if (flashDataProvider2 != null) {
                jSONObjectLIZ = flashDataProvider2.LIZ();
            }
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJLIJ(TemplateData.LJIIIIZZ(String.valueOf(jSONObjectLIZ)), str, false);
        }
        this.LLILLL = c0kjf;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewInflateItemView$default = PowerCell.inflateItemView$default(this, viewGroup, R.layout.ggb, false, 4, null);
        this.LL = (FrameLayout) viewInflateItemView$default.findViewById(R.id.vsu);
        return viewInflateItemView$default;
    }
}
