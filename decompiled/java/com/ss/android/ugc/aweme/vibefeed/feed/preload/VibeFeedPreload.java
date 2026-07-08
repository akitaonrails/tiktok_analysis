package com.ss.android.ugc.aweme.vibefeed.feed.preload;

import X.AnonymousClass0957;
import X.C0CQT;
import X.C0PEM;
import X.C1499810p8F;
import X.C1575440r6E;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C629340OmK;
import X.C786410Ut5;
import X.EnumC629350OmL;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedItemListResponse;
import com.ss.android.ugc.aweme.vibefeed.network.IVibeApi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeFeedPreload implements InterfaceC727570SgN<IVibeApi, AnonymousClass0957<? extends VibeFeedItemListResponse>> {
    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        int value;
        int iIntValue;
        if (bundle != null) {
            value = bundle.getInt(Scene.SCENE_SERVICE);
        } else {
            value = EnumC629350OmL.SCENE_DEFAULT.getValue();
        }
        Integer numValueOf = Integer.valueOf(LivePreCreateNextRoomPlayer.ENABLE);
        numValueOf.intValue();
        if (value == EnumC629350OmL.SCENE_DEFAULT.getValue()) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 5000;
        }
        return new C1499810p8F(false, C0CQT.LIZJ, null, iIntValue, false, 28);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public AnonymousClass0957<? extends VibeFeedItemListResponse> preload2(Bundle bundle, Function1<? super Class<IVibeApi>, ? extends IVibeApi> function1) {
        String string;
        String string2;
        String string3;
        String string4;
        int value;
        String string5;
        int i;
        int i2;
        String string6;
        String strLIZ = C1575440r6E.LIZ();
        String str = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        if (bundle == null || (string = bundle.getString("to_user_id")) == null) {
            string = "";
        }
        if (bundle == null || (string2 = bundle.getString("insert_item_ids")) == null) {
            string2 = "";
        }
        if (bundle == null || (string3 = bundle.getString("vibe_feed_id")) == null) {
            string3 = "";
        }
        if (bundle == null || (string4 = bundle.getString("vibe_has_visited_ids")) == null) {
            string4 = "";
        }
        if (bundle != null) {
            value = bundle.getInt(Scene.SCENE_SERVICE);
        } else {
            value = EnumC629350OmL.SCENE_DEFAULT.getValue();
        }
        if (bundle == null || (string5 = bundle.getString("conversation_id")) == null) {
            string5 = "";
        }
        if (bundle != null) {
            i = bundle.getInt("mutual_feed_scene");
        } else {
            i = 0;
        }
        if (bundle != null && (string6 = bundle.getString("next_cursor")) != null) {
            str = string6;
        }
        if (bundle != null) {
            i2 = bundle.getInt("page_size", 15);
        } else {
            i2 = 15;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("thread = ");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append("  toUserId = ");
        sbLIZ.append(string);
        sbLIZ.append(", insertItemIds = ");
        sbLIZ.append(string2);
        sbLIZ.append(", nextCursor = ");
        sbLIZ.append(str);
        sbLIZ.append(", pageSize = ");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        return C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C629340OmK(string5, function1, strLIZ, string, string2, value, i, str, i2, string3, string4, null), 3);
    }
}
