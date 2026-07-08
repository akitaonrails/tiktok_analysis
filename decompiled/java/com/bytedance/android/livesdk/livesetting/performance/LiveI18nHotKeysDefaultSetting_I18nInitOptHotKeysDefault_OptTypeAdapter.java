package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.performance.LiveI18nHotKeysDefaultSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveI18nHotKeysDefaultSetting_I18nInitOptHotKeysDefault_OptTypeAdapter extends TypeAdapter<LiveI18nHotKeysDefaultSetting.I18nInitOptHotKeysDefault> {
    public final Gson LIZ;

    public LiveI18nHotKeysDefaultSetting_I18nInitOptHotKeysDefault_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveI18nHotKeysDefaultSetting.I18nInitOptHotKeysDefault read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveI18nHotKeysDefaultSetting.I18nInitOptHotKeysDefault i18nInitOptHotKeysDefault = new LiveI18nHotKeysDefaultSetting.I18nInitOptHotKeysDefault(null, 1, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "hot_keys")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    i18nInitOptHotKeysDefault.defaultHotKeys = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return i18nInitOptHotKeysDefault;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveI18nHotKeysDefaultSetting.I18nInitOptHotKeysDefault i18nInitOptHotKeysDefault) {
        LiveI18nHotKeysDefaultSetting.I18nInitOptHotKeysDefault i18nInitOptHotKeysDefault2 = i18nInitOptHotKeysDefault;
        if (i18nInitOptHotKeysDefault2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("hot_keys");
        C473040Igo.LIZLLL(this.LIZ, c09dl, i18nInitOptHotKeysDefault2.defaultHotKeys, String.class);
        c09dl.LJII();
    }
}
