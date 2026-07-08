package com.lynx.textra;

import X.C0WZX;
import X.C1321990kVR;
import X.C2204961BRm;
import android.content.Context;
import android.provider.Settings;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class XiaomiFontCaps implements PlatformFontCaps {
    public final Context mContext;
    public int mFontScale;
    public Map<Integer, Integer> mUserToMIUI = new LinkedHashMap();
    public static final int[][] NORAML_RULES = {new int[]{0, 5}, new int[]{0, 5}, new int[]{1, 6}, new int[]{2, 6}, new int[]{2, 7}, new int[]{3, 8}, new int[]{4, 8}, new int[]{5, 9}, new int[]{6, 9}, new int[]{7, 9}};
    public static int[] WEIGHT_ARRAY = {100, 200, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 350, 400, 500, OppoPermissionPopupMaskDelayExp.DEFAULT, 800, 900, 950};
    public static int[] MIUI_WGHT = {150, 200, 250, 305, 330, 380, 450, 520, 630, OppoPermissionPopupMaskDelayExp.DEFAULT};

    @Override // com.lynx.textra.PlatformFontCaps
    public final /* synthetic */ short clamp(int i) {
        return C1321990kVR.LIZ(this, i);
    }

    @Override // com.lynx.textra.PlatformFontCaps
    public String defaultFamilyName() {
        return "sans-serif";
    }

    public XiaomiFontCaps(Context context) throws Throwable {
        this.mFontScale = 50;
        this.mContext = context;
        String strLLIIIJ = C2204961BRm.LLIIIJ(context.getContentResolver(), "key_miui_font_var_weight", new C0WZX("dzBzEg4jUdKSQVI5UQCFKEetGL7PtV+Wz23dA0fh", null));
        int i = 0;
        if (strLLIIIJ != null) {
            String[] strArrSplit = strLLIIIJ.split(",");
            if (strArrSplit.length != MIUI_WGHT.length) {
                return;
            }
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                MIUI_WGHT[i2] = CastIntegerProtector.parseInt(strArrSplit[i2]);
            }
        }
        while (true) {
            int[] iArr = WEIGHT_ARRAY;
            if (i < iArr.length) {
                this.mUserToMIUI.put(Integer.valueOf(iArr[i]), Integer.valueOf(MIUI_WGHT[i]));
                i++;
            } else {
                this.mFontScale = Settings.System.getInt(context.getContentResolver(), "key_miui_font_weight_scale", 50);
                return;
            }
        }
    }

    private int ToUserWeight(int i) {
        Integer key = null;
        Integer numValueOf = null;
        for (Map.Entry<Integer, Integer> entry : this.mUserToMIUI.entrySet()) {
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
        return clamp(ToUserWeight(getWght(s)));
    }

    public int getWeightIdx(int i) {
        if (i >= WEIGHT_ARRAY[9]) {
            return 9;
        }
        int i2 = 0;
        while (true) {
            int[] iArr = WEIGHT_ARRAY;
            if (i2 < iArr.length) {
                if (i <= iArr[i2]) {
                    return i2;
                }
                i2++;
            } else {
                return 4;
            }
        }
    }

    public int getWght(int i) {
        float f;
        int weightIdx = getWeightIdx(i);
        int[] iArr = MIUI_WGHT;
        int[] iArr2 = NORAML_RULES[weightIdx];
        int i2 = iArr[iArr2[0]];
        int i3 = iArr[weightIdx];
        int i4 = iArr[iArr2[1]];
        int i5 = this.mFontScale;
        if (i5 < 50) {
            float f2 = i5 / 50.0f;
            f = ((1.0f - f2) * i2) + (f2 * i3);
        } else {
            float f3 = (i5 - 50.0f) / 50.0f;
            f = ((1.0f - f3) * i3) + (f3 * i4);
        }
        return (int) f;
    }
}
