package com.ss.android.ugc.aweme.story.feed.common.collection.component;

import X.C0RF0;
import X.C0RMW;
import X.C13BV;
import X.C1558520qew;
import X.C1600710rkz;
import X.C281310B0v;
import X.C628500Oky;
import X.C630740Ooa;
import X.InterfaceC665370Q7z;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryLocalDeleteAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryCollectionLocalDeleteComponent extends BaseCellLogicComponent<StoryCollectionLocalDeleteComponent> implements StoryLocalDeleteAbility {
    public final C630740Ooa LLJJIJI = C628500Oky.LIZ(new AwS555S0100000_11(this, 571));
    public final C630740Ooa LLJJIJIIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 572));
    public final C630740Ooa LLJJIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 570));

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJIJIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, StoryLocalDeleteAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJIJIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, StoryLocalDeleteAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryLocalDeleteAbility
    public final void LX0(String str) {
        Fragment fragment;
        List<Aweme> awemeList;
        int size;
        Fragment fragment2;
        IDetailBaseAbility iDetailBaseAbilityLIZ;
        C0RMW c0rmw = C0RMW.LIZ;
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 != null) {
            fragment = c0rf0.LIZJ;
        } else {
            fragment = null;
        }
        if (c0rmw.LJJIIJZLJL(fragment) && C281310B0v.LIZ()) {
            UserFeedViewPagerAbility userFeedViewPagerAbility = (UserFeedViewPagerAbility) this.LLJJIJIIJIL.getValue();
            if (userFeedViewPagerAbility != null) {
                size = userFeedViewPagerAbility.ix(str);
                if (size != 0) {
                    return;
                }
            }
        } else {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJJIJI.getValue();
            if (iFeedPanelPlatformAbility == null || (awemeList = iFeedPanelPlatformAbility.getAwemeList()) == null) {
                awemeList = C13BV.INSTANCE;
            }
            Iterator<Aweme> it2 = awemeList.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it2.next().getAuthor().getUid(), str)) {
                    if (i != -1) {
                        IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LLJJIJI.getValue();
                        if (iFeedPanelPlatformAbility2 != null) {
                            iFeedPanelPlatformAbility2.LLLZLL(i);
                        }
                        size = awemeList.size();
                    }
                } else {
                    i++;
                }
            }
        }
        C0RF0 c0rf02 = jm().LIZLLL;
        if (c0rf02 != null && (fragment2 = c0rf02.LIZJ) != null && (iDetailBaseAbilityLIZ = C1600710rkz.LIZ(fragment2)) != null) {
            iDetailBaseAbilityLIZ.yF(-1, "mute_all");
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
