package com.ss.android.ugc.aweme.story.feed.common.sub.video;

import X.C03H5;
import X.C0RF0;
import X.C0ROE;
import X.C0ROF;
import X.C0ROG;
import X.C0SZ8;
import X.C1554610qYd;
import X.C20684815ws;
import X.C2097608Jq;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690870R8b;
import X.C691400RAc;
import X.InterfaceC665370Q7z;
import X.InterfaceC739770T0d;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.StoryImmersiveGuideUploadCardProtocol;
import com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.experiment.StoryGuideUploadCardConfigModel;
import com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardManager;
import com.ss.android.ugc.aweme.story.inbox.StoryInsertCard;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideUploadCardVH extends BasePostViewCell {
    public final C630740Ooa LLLLII;
    public long LLLLIIIILLL;

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final C0SZ8 LLJLLL() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final int Yf2() {
        return 4;
    }

    @Override // X.C0RGJ
    public final String gq() {
        return "cell_story_guide_upload_card";
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        String aid;
        String str;
        int iCardStyle;
        InterfaceC739770T0d interfaceC739770T0dP2;
        super.LJJIJIIJIL(i);
        IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LLLLII.getValue();
        if (iPlayerComponentAbility != null && (interfaceC739770T0dP2 = iPlayerComponentAbility.P2()) != null) {
            interfaceC739770T0dP2.pauseVideo();
        }
        StoryGuideUploadCardManager.LL.getClass();
        StoryGuideUploadCardManager.LLIZLLLIL = System.currentTimeMillis();
        Map<String, Boolean> map = StoryGuideUploadCardManager.LLILZ;
        String strLIZJ = StoryGuideUploadCardManager.LIZJ();
        Boolean bool = Boolean.TRUE;
        map.put(strLIZJ, bool);
        StoryGuideUploadCardManager.LLILZIL.put(StoryGuideUploadCardManager.LIZJ(), bool);
        C0ROF c0rof = C0ROF.LIZ;
        Keva keva = C0ROF.LIZIZ;
        c0rof.getClass();
        keva.storeLong(C0ROF.LIZ("visit_guide_upload_card_timestamp"), System.currentTimeMillis());
        this.LLLLIIIILLL = System.currentTimeMillis();
        Aweme aweme = this.LLJJIJIIJIL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        String str2 = "";
        if (aid == null) {
            aid = "";
        }
        StoryInsertCard storyInsertCard = (StoryInsertCard) ((LinkedHashMap) StoryGuideUploadCardManager.LLILZLL.getValue()).get(aid);
        C0ROE c0roe = C0ROE.LIZ;
        if (storyInsertCard == null || (str = storyInsertCard.enterFrom) == null) {
            str = "";
        }
        if (storyInsertCard != null) {
            iCardStyle = storyInsertCard.cardStyle();
        } else {
            iCardStyle = 0;
        }
        c0roe.getClass();
        if (iCardStyle != 1) {
            if (iCardStyle != 2) {
                if (iCardStyle != 3) {
                    if (iCardStyle == 4) {
                        str2 = "three_photo";
                    }
                } else {
                    str2 = "profile";
                }
            } else {
                str2 = "one_photo";
            }
        } else {
            str2 = "non_profile";
        }
        C20684815ws.LJIILLIIL("story_publish_card_show", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("enter_position", "top_cell"), new Pair("card_type", str2)));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final List<CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return C1554610qYd.LIZIZ(interfaceC665370Q7z, StoryImmersiveGuideUploadCardProtocol.class, false);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void h(boolean z) {
        super.h(z);
        StoryGuideUploadCardManager storyGuideUploadCardManager = StoryGuideUploadCardManager.LL;
        Map<String, Boolean> map = StoryGuideUploadCardManager.LLILZ;
        storyGuideUploadCardManager.getClass();
        map.put(StoryGuideUploadCardManager.LIZJ(), Boolean.FALSE);
        if (System.currentTimeMillis() - this.LLLLIIIILLL < ((StoryGuideUploadCardConfigModel) C0ROG.LIZIZ.getValue()).fastScrollThresholdInMs) {
            C0ROF.LIZ.getClass();
            C0ROF.LIZIZ();
        }
    }

    public StoryGuideUploadCardVH(C0RF0 c0rf0, C691400RAc c691400RAc) {
        super(c0rf0, c691400RAc);
        this.LLLLII = C628500Oky.LIZ(new AwS555S0100000_11(this, 1389));
    }
}
