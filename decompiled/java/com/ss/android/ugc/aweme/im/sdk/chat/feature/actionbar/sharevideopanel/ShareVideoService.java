package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel;

import X.AbstractC480470Isn;
import X.C1646806cc;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.ShareVideoService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelPageFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.sharevideo.IShareVideoService;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareVideoService implements IShareVideoService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.06cc] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.sharevideo.IShareVideoService
    public final C1646806cc LIZ(final List list, final String str, final Integer num, final FragmentManager fragmentManager, final Boolean bool, final Context context) {
        return new AbstractC480470Isn(fragmentManager) { // from class: X.06cc
            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return list.size();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final CharSequence LJIJJLI(int i) {
                ShareVideoService shareVideoService = this;
                int iIntValue = ((Number) ListProtector.get(list, i)).intValue();
                Context context2 = context;
                shareVideoService.getClass();
                if (iIntValue == EnumC1646906cd.LIKED.getType()) {
                    if (context2 != null) {
                        return context2.getString(2131824661);
                    }
                    return null;
                }
                if (iIntValue == EnumC1646906cd.FAVORITE.getType()) {
                    if (context2 != null) {
                        return context2.getString(2131824660);
                    }
                    return null;
                }
                if (iIntValue == EnumC1646906cd.YOURS.getType()) {
                    if (context2 != null) {
                        return context2.getString(2131824663);
                    }
                    return null;
                }
                if (iIntValue == EnumC1646906cd.REPOSTED.getType() && context2 != null) {
                    return context2.getString(2131846354);
                }
                return null;
            }

            @Override // X.AbstractC480470Isn
            public final Fragment LJJIJIL(int i) {
                boolean zBooleanValue;
                String str2 = ShareVideoPanelPageFragment._pnsPageId;
                int iIntValue = ((Number) ListProtector.get(list, i)).intValue();
                String str3 = str;
                Integer num2 = num;
                Boolean bool2 = bool;
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("panel_type", iIntValue);
                C786410Ut5.LJJJI("conversation_id", str3, bundle);
                if (num2 != null) {
                    bundle.putInt("share_scene", num2.intValue());
                }
                ShareVideoPanelPageFragment shareVideoPanelPageFragment = new ShareVideoPanelPageFragment(zBooleanValue);
                shareVideoPanelPageFragment.setArguments(bundle);
                return shareVideoPanelPageFragment;
            }
        };
    }
}
