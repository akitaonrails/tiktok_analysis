package com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc;

import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C673150Qan;
import X.C687700QyG;
import X.C690870R8b;
import X.C707380Rou;
import X.C718360SFu;
import X.EnumC707450Rp1;
import X.InterfaceC494301wD;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonKey;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.DefaultFeedCommonBannerProtocol;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger;
import com.ss.android.ugc.feed.platform.container.scope.CommonBannerProviderScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class AIGCOverLabelBannerAssemTrigger extends FeedCommonBannerTrigger {
    public final DefaultFeedCommonBannerProtocol LLJLLIL = new DefaultFeedCommonBannerProtocol("bottom_banner_aigc_overlabel");

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommonBannerProviderScope.class});
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger, X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(CommonBannerProviderScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(CommonBannerProviderScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger, com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(AIGCOverLabelBannerAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1707724930) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger, com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_banner_aigc_overlabel";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger, com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        BannerCommonStruct next;
        C718360SFu c718360SFu;
        C718360SFu c718360SFu2;
        String str;
        List<BannerCommonStruct> banners = videoItemParams.getAweme().getBanners();
        if (banners != null) {
            Iterator<BannerCommonStruct> it2 = banners.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    BannerCommonKey bannerCommonKey = next.bannerKey;
                    if (bannerCommonKey != null) {
                        str = bannerCommonKey.componentKey;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "bottom_banner_aigc_overlabel")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BannerCommonStruct bannerCommonStruct = next;
            if (bannerCommonStruct != null) {
                if (!this.LLJLLIL.LLILZLL.LIZJ(videoItemParams)) {
                    this.LLJLIL.LJFF = null;
                    return false;
                }
                C707380Rou c707380Rou = this.LLJLIL;
                DefaultFeedCommonBannerProtocol defaultFeedCommonBannerProtocol = this.LLJLLIL;
                c707380Rou.LJFF = defaultFeedCommonBannerProtocol;
                if (defaultFeedCommonBannerProtocol != null && (c718360SFu2 = defaultFeedCommonBannerProtocol.LL) != null) {
                    c718360SFu2.LIZ(EnumC707450Rp1.INITIAL);
                }
                FeedCommonBannerProtocol feedCommonBannerProtocol = this.LLJLIL.LJFF;
                if (feedCommonBannerProtocol != null && (c718360SFu = feedCommonBannerProtocol.LL) != null) {
                    String aid = videoItemParams.getAweme().getAid();
                    C690870R8b c690870R8bJm = jm();
                    Aweme aweme = videoItemParams.getAweme();
                    String str2 = videoItemParams.mEventType;
                    c718360SFu.LIZIZ = aid;
                    c718360SFu.LIZLLL = bannerCommonStruct;
                    c718360SFu.LJ = c690870R8bJm;
                    c718360SFu.LIZJ = aweme;
                    c718360SFu.LJFF = str2;
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
        C673150Qan.LIZIZ(this, obj, cls);
    }
}
