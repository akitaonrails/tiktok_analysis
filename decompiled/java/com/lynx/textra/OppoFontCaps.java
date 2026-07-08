package com.lynx.textra;

import X.C0WZX;
import X.C10EU;
import X.C1321990kVR;
import X.C20123913ob;
import X.C2204961BRm;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public class OppoFontCaps implements PlatformFontCaps {
    public static int FONT_VARIATION_STEP = 10;
    public final Map<Integer, Integer> FONT_WEIGHT_CAST_WGHT;
    public final Context mContext;

    @Override // com.lynx.textra.PlatformFontCaps
    public final /* synthetic */ short clamp(int i) {
        return C1321990kVR.LIZ(this, i);
    }

    @Override // com.lynx.textra.PlatformFontCaps
    public String defaultFamilyName() {
        String strINVOKESTATIC_com_lynx_textra_OppoFontCaps_com_ss_android_ugc_aweme_lancet_process_AndroidIdLancet_getString = INVOKESTATIC_com_lynx_textra_OppoFontCaps_com_ss_android_ugc_aweme_lancet_process_AndroidIdLancet_getString(this.mContext.getContentResolver(), "current_typeface_name");
        return Objects.equals(strINVOKESTATIC_com_lynx_textra_OppoFontCaps_com_ss_android_ugc_aweme_lancet_process_AndroidIdLancet_getString, "OPPO Sans") ? "sys-sans-en" : Objects.equals(strINVOKESTATIC_com_lynx_textra_OppoFontCaps_com_ss_android_ugc_aweme_lancet_process_AndroidIdLancet_getString, "One Sans") ? "op-sans-en" : "sans-serif";
    }

    public OppoFontCaps(Context context) {
        this.mContext = context;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.FONT_WEIGHT_CAST_WGHT = linkedHashMap;
        int i = Build.VERSION.SDK_INT;
        Integer numValueOf = Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        Integer numValueOf2 = Integer.valueOf(OppoPermissionPopupMaskDelayExp.DEFAULT);
        Integer numValueOf3 = Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT);
        if (i >= 35) {
            linkedHashMap.put(100, 100);
            linkedHashMap.put(200, 200);
            linkedHashMap.put(numValueOf, numValueOf);
            linkedHashMap.put(400, 400);
            linkedHashMap.put(500, 500);
            linkedHashMap.put(600, 600);
            linkedHashMap.put(numValueOf2, numValueOf2);
            linkedHashMap.put(800, 800);
            linkedHashMap.put(900, 900);
            linkedHashMap.put(numValueOf3, numValueOf3);
            return;
        }
        if (i >= 34) {
            linkedHashMap.put(100, 100);
            linkedHashMap.put(200, 200);
            linkedHashMap.put(numValueOf, numValueOf);
            linkedHashMap.put(400, 550);
            linkedHashMap.put(500, numValueOf2);
            linkedHashMap.put(600, 900);
            linkedHashMap.put(numValueOf2, numValueOf3);
            linkedHashMap.put(800, numValueOf3);
            linkedHashMap.put(900, numValueOf3);
            linkedHashMap.put(numValueOf3, numValueOf3);
            return;
        }
        linkedHashMap.put(100, 200);
        linkedHashMap.put(200, 250);
        linkedHashMap.put(numValueOf, 350);
        linkedHashMap.put(400, 550);
        linkedHashMap.put(500, numValueOf2);
        linkedHashMap.put(600, numValueOf2);
        linkedHashMap.put(numValueOf2, numValueOf2);
        linkedHashMap.put(800, 850);
        linkedHashMap.put(900, numValueOf3);
        linkedHashMap.put(numValueOf3, numValueOf3);
    }

    private int ToUserWeight(int i) {
        Integer key = null;
        Integer numValueOf = null;
        for (Map.Entry<Integer, Integer> entry : this.FONT_WEIGHT_CAST_WGHT.entrySet()) {
            int iIntValue = entry.getValue().intValue();
            if (i == iIntValue) {
                return entry.getKey().intValue();
            }
            if (numValueOf == null) {
                if (i < iIntValue) {
                    return entry.getKey().intValue();
                }
            } else if (i > numValueOf.intValue() && i < iIntValue) {
                return key.intValue() + ((int) ((((i - numValueOf.intValue()) * 1.0f) / (iIntValue - numValueOf.intValue())) * (entry.getKey().intValue() - key.intValue())));
            }
            numValueOf = Integer.valueOf(iIntValue);
            key = entry.getKey();
        }
        return key.intValue();
    }

    @Override // com.lynx.textra.PlatformFontCaps
    public short adjust(short s) {
        int i = Settings.System.getInt(this.mContext.getContentResolver(), "font_variation_settings", 550);
        if (((61440 & i) >> 12) == 1) {
            int i2 = FONT_VARIATION_STEP;
            int i3 = ((i & 4095) / i2) * i2;
            Integer num = this.FONT_WEIGHT_CAST_WGHT.get(Integer.valueOf(s));
            int iIntValue = s;
            if (num != null) {
                iIntValue = num.intValue();
            }
            return (short) ToUserWeight(clamp(i3 + (iIntValue - 550)));
        }
        return s;
    }

    public static String INVOKESTATIC_com_lynx_textra_OppoFontCaps_com_ss_android_ugc_aweme_lancet_process_AndroidIdLancet_getString(ContentResolver contentResolver, String str) {
        if (TextUtils.equals(str, "android_id")) {
            if (C10EU.LJIILIIL() && C20123913ob.LIZ()) {
                return "";
            }
            if (TextUtils.isEmpty(C20123913ob.LIZ)) {
                C20123913ob.LIZ = C2204961BRm.LLIIIZ(contentResolver, str, new C0WZX("dzBzEg4jUdKSQVI5UQCFKFC0Cb7ks3eN4njuEQ==", null));
            }
            return C20123913ob.LIZ;
        }
        return C2204961BRm.LLIIIZ(contentResolver, str, new C0WZX("dzBzEg4jUdKSQVI5UQCFKFC0Cb7ks3eN4njuEQ==", null));
    }
}
