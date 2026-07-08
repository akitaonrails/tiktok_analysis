package com.ss.android.ugc.aweme.story.feed.common.collection.component;

import X.C01GW;
import X.C12ES;
import X.C1558420qem;
import X.C1558520qew;
import X.C444960Hcc;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C726830SfB;
import X.InterfaceC665370Q7z;
import X.InterfaceC693170RGx;
import X.InterfaceC713360RyY;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.SingleTapSwitchSubVHAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryPlayerControlAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryTapSwitchSubVHComponent extends BaseCellContentComponent<StoryTapSwitchSubVHComponent> implements SingleTapSwitchSubVHAbility {
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 586));
    public final C630740Ooa LLJJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 592));
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 591));
    public final C630740Ooa LLJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 590));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 588));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 587));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 589));

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.SingleTapSwitchSubVHAbility
    public final void f11() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        InterfaceC713360RyY interfaceC713360RyY = (InterfaceC713360RyY) this.LLJJJJLIIL.getValue();
        if (interfaceC713360RyY == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyY)) == null) {
            return;
        }
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, SingleTapSwitchSubVHAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.SingleTapSwitchSubVHAbility
    public final boolean jZ0() {
        return ((Boolean) this.LLJLL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.SingleTapSwitchSubVHAbility
    public final float Ru1() {
        return C726830SfB.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.SingleTapSwitchSubVHAbility
    public final float Wu0() {
        return C726830SfB.LIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        super.onParentSet();
        InterfaceC713360RyY interfaceC713360RyY = (InterfaceC713360RyY) this.LLJJJJLIIL.getValue();
        if (interfaceC713360RyY == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyY)) == null) {
            return;
        }
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, SingleTapSwitchSubVHAbility.class, null, null);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.SingleTapSwitchSubVHAbility
    public final void Vw2(Context context, float f, InterfaceC693170RGx interfaceC693170RGx) {
        boolean z;
        StoryPlayerControlAbility storyPlayerControlAbility;
        StoryPlayerControlAbility storyPlayerControlAbility2;
        if (C444960Hcc.LIZIZ() ? f > C12ES.LJIIJ(context) * C726830SfB.LIZIZ() : f < C12ES.LJIIJ(context) * C726830SfB.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (((Boolean) this.LLJLILLLLZIIL.getValue()).booleanValue()) {
            if (z) {
                FeedCollectionViewPagerAbility feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) this.LLJJL.getValue();
                if (feedCollectionViewPagerAbility != null && feedCollectionViewPagerAbility.oD0()) {
                    return;
                }
                UserFeedViewPagerAbility userFeedViewPagerAbility = (UserFeedViewPagerAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
                if ((userFeedViewPagerAbility != null && userFeedViewPagerAbility.Ed2("click")) || (storyPlayerControlAbility2 = (StoryPlayerControlAbility) this.LLJL.getValue()) == null) {
                    return;
                }
                storyPlayerControlAbility2.JL2();
                return;
            }
            FeedCollectionViewPagerAbility feedCollectionViewPagerAbility2 = (FeedCollectionViewPagerAbility) this.LLJJL.getValue();
            if (feedCollectionViewPagerAbility2 != null && feedCollectionViewPagerAbility2.E30("click")) {
                return;
            }
            UserFeedViewPagerAbility userFeedViewPagerAbility2 = (UserFeedViewPagerAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
            if ((userFeedViewPagerAbility2 != null && userFeedViewPagerAbility2.rf0("click")) || interfaceC693170RGx == null) {
                return;
            }
            interfaceC693170RGx.tm(!z);
            return;
        }
        if (z) {
            FeedCollectionViewPagerAbility feedCollectionViewPagerAbility3 = (FeedCollectionViewPagerAbility) this.LLJJL.getValue();
            if (feedCollectionViewPagerAbility3 == null || feedCollectionViewPagerAbility3.oD0() || (storyPlayerControlAbility = (StoryPlayerControlAbility) this.LLJL.getValue()) == null) {
                return;
            }
            storyPlayerControlAbility.JL2();
            return;
        }
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility4 = (FeedCollectionViewPagerAbility) this.LLJJL.getValue();
        if (feedCollectionViewPagerAbility4 == null) {
            return;
        }
        feedCollectionViewPagerAbility4.E30("click");
    }
}
