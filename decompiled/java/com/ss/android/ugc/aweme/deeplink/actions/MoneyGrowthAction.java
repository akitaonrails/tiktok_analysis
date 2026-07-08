package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C19308310gL;
import X.C1950707kX;
import X.C2188811AlT;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class MoneyGrowthAction extends AbstractC1950107kR<Unit> {
    public String LIZLLL;

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        this.LIZLLL = str;
        Uri uri = UriProtector.parse(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.getHost());
        sbLIZ.append(uri.getPath());
        return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        boolean z = C19308310gL.LJI;
        if (C19308310gL.LJII.LIZ(this.LIZLLL)) {
            return true;
        }
        return false;
    }
}
