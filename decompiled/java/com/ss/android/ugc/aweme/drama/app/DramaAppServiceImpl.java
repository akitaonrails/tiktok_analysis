package com.ss.android.ugc.aweme.drama.app;

import X.C0AA6;
import X.C0AA7;
import X.C0AA8;
import X.C0C64;
import X.C1392760mLa;
import X.C1392770mLb;
import X.C695070ROf;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class DramaAppServiceImpl implements IDramaAppService {
    @Override // com.ss.android.ugc.aweme.drama.app.IDramaAppService
    public final void LJI() {
        C1392760mLa.LIZJ = 0;
        C1392760mLa.LIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.drama.app.IDramaAppService
    public final boolean LJFF() {
        return ((Keva) C1392770mLb.LIZ.getValue()).getBoolean("drama_auto_jump_enabled", false);
    }

    @Override // com.ss.android.ugc.aweme.drama.app.IDramaAppService
    public final void LIZ(boolean z) {
        ((Keva) C1392770mLb.LIZ.getValue()).storeBoolean("drama_auto_jump_enabled", z);
    }

    @Override // com.ss.android.ugc.aweme.drama.app.IDramaAppService
    public final void LIZLLL(String str) {
        Set<String> set = C1392760mLa.LIZLLL;
        boolean zContains = set.contains(str);
        set.clear();
        if (zContains) {
            set.add(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.drama.app.IDramaAppService
    public final boolean LIZJ(Aweme aweme, String str) {
        if (!Intrinsics.LJFF(str, "paid_series_detail_page") || ((Number) C0AA7.LIZ.getValue()).intValue() != 1 || C695070ROf.LIZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.drama.app.IDramaAppService
    public final boolean LJ(Aweme aweme, String str) {
        Set<String> set = C1392760mLa.LIZ;
        int iHashCode = str.hashCode();
        if (iHashCode != -908000280) {
            if (iHashCode != 1691937916) {
                if (iHashCode == 1998809160 && str.equals("paid_series_detail_page")) {
                    if (C695070ROf.LIZ(aweme)) {
                        return C0C64.LJIILLIIL().LJIIIZ(31744, "pine_anchor_other_scene_shown", true, false);
                    }
                    if (!C0C64.LJIILLIIL().LJIIIZ(31744, "pine_anchor_inner_feed_shown", true, false)) {
                        return false;
                    }
                    long paidCollectionId = aweme.mPaidContentInfo.getPaidCollectionId();
                    Long l = C1392760mLa.LIZIZ;
                    if (l == null || paidCollectionId != l.longValue()) {
                        C1392760mLa.LIZIZ = Long.valueOf(paidCollectionId);
                        C1392760mLa.LIZJ = 0;
                        C1392760mLa.LIZ.clear();
                    }
                    if (!C1392760mLa.LIZ.contains(aweme.getAid()) && C1392760mLa.LIZJ >= ((Number) C0AA6.LIZ.getValue()).intValue()) {
                        return false;
                    }
                    return true;
                }
            } else if (str.equals("homepage_hot")) {
                return C0C64.LJIILLIIL().LJIIIZ(31744, "pine_anchor_fyp_tab_shown", true, false);
            }
        } else if (str.equals("homepage_series")) {
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "pine_anchor_drama_tab_shown", true, false)) {
                return false;
            }
            Set<String> set2 = C1392760mLa.LIZLLL;
            if (!set2.contains(aweme.getAid()) && set2.size() >= ((Number) C0AA8.LIZ.getValue()).intValue()) {
                return false;
            }
            return true;
        }
        return C0C64.LJIILLIIL().LJIIIZ(31744, "pine_anchor_other_scene_shown", true, false);
    }

    @Override // com.ss.android.ugc.aweme.drama.app.IDramaAppService
    public final void LJII(Aweme aweme, String str) {
        Set<String> set = C1392760mLa.LIZ;
        if (Intrinsics.LJFF(str, "paid_series_detail_page")) {
            if (!C695070ROf.LIZ(aweme)) {
                Set<String> set2 = C1392760mLa.LIZ;
                if (!set2.contains(aweme.getAid())) {
                    C1392760mLa.LIZJ++;
                    set2.add(aweme.getAid());
                    return;
                }
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "homepage_series")) {
            return;
        }
        Set<String> set3 = C1392760mLa.LIZLLL;
        if (set3.contains(aweme.getAid())) {
            return;
        }
        set3.add(aweme.getAid());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0167  */
    @Override // com.ss.android.ugc.aweme.drama.app.IDramaAppService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(android.content.Context r17, com.ss.android.ugc.aweme.feed.model.Aweme r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.drama.app.DramaAppServiceImpl.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
