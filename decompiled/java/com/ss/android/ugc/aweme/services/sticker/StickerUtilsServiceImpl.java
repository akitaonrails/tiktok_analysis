package com.ss.android.ugc.aweme.services.sticker;

import X.C1624170sMp;
import X.C1624200sMs;
import X.C1624570sNT;
import X.C1958007li;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes26.dex */
public final class StickerUtilsServiceImpl implements IStickerUtilsService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public boolean hasUnlocked(Effect effect) {
        return C1624170sMp.LIZ(effect);
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public boolean idUnlocked(String str) {
        ArrayList<String> arrayListLIZ = C1958007li.LIZ();
        if (arrayListLIZ.isEmpty()) {
            return false;
        }
        return arrayListLIZ.contains(str);
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public boolean isLockSticker(Effect effect) {
        return C1624200sMs.LJIIJ(effect);
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public boolean isScanUnLockType(String str) {
        if (!TextUtils.isEmpty(str) && !Intrinsics.LJFF(str, "{}")) {
            try {
                if (JSONObjectProtectorUtils.getInt(new JSONObject(str), "lock_type") == 1) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public boolean isStickerPreviewable(Effect effect) {
        return C1624570sNT.LJJIIJ(effect);
    }
}
