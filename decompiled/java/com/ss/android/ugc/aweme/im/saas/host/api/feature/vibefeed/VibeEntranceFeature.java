package com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed;

import X.C06QV;
import X.EnumC2007507th;
import X.EnumC912680ZrG;
import android.content.Context;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.annotation.Feature;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
@Feature(id = "vibe_entrance", name = "Vibe Entrance")
public interface VibeEntranceFeature {
    public static final C06QV LIZ = C06QV.LIZ;

    boolean LIZ(String str);

    void LJ(String str, String str2, int i, EnumC912680ZrG enumC912680ZrG);

    void LJI(Context context, String str, String str2, String str3, String str4, String str5, List<String> list);

    void LJII(String str, int i, EnumC912680ZrG enumC912680ZrG);

    void LJIIIIZZ(String str, String str2, String str3, TuxAlertBadgeLayout tuxAlertBadgeLayout, EnumC2007507th enumC2007507th, String str4, AwS558S0100000_14 awS558S0100000_14);

    void LJIIIZ(String str, EnumC912680ZrG enumC912680ZrG);
}
