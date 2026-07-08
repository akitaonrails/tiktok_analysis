package com.ss.android.ugc.aweme.search.detail.adaption;

import X.C0RF0;
import X.C0RJN;
import X.C16HB;
import X.C20562015d4;
import X.C301300BrU;
import X.C497820Jfg;
import X.InterfaceC20561915d3;
import X.InterfaceC494301wD;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2;
import com.ss.android.ugc.feed.platform.cell.component.adaption.strategy.FeedVideoAdaptionStrategyFactory;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class SearchCellAdaptionComponent extends FeedCellAdaptionComponentV2 {
    public Integer LLLLLLL;
    public Integer LLLLLLLLL;
    public final C16HB LLLLLLLLLL = new C16HB(this, 1);

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1917770024) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2
    public final InterfaceC20561915d3 hp() {
        String string;
        Bundle bundle;
        Fragment fragment;
        Bundle arguments;
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 == null || (fragment = c0rf0.LIZJ) == null || (arguments = fragment.getArguments()) == null) {
            string = null;
            bundle = null;
        } else {
            string = arguments.getString(FollowStatusChangeMethod.PARAM_UID);
            bundle = arguments.getBundle("search_video_info");
        }
        Aweme awemeKp = kp();
        String aid = awemeKp != null ? awemeKp.getAid() : null;
        if (string != null) {
            Intrinsics.LJFF(string, aid);
        }
        InterfaceC20561915d3 interfaceC20561915d3Hp = super.hp();
        if (string == null) {
            string = "";
        }
        return new C20562015d4(string, bundle, (FeedVideoAdaptionStrategyFactory) interfaceC20561915d3Hp);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2
    public final View.OnLayoutChangeListener tp() {
        return this.LLLLLLLLLL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Fragment fragment;
        View view2;
        super.onViewCreated(view);
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        View viewFindViewById = null;
        if (c0rjnLIZIZ != null && (fragment = c0rjnLIZIZ.LJ) != null && (view2 = fragment.getView()) != null) {
            viewFindViewById = view2.findViewById(R.id.viewpager);
        }
        if (C301300BrU.LIZ()) {
            int iLIZJ = C497820Jfg.LIZJ(view.getContext());
            if (viewFindViewById != null) {
                viewFindViewById.setPadding(0, iLIZJ, 0, 0);
            }
        }
    }
}
