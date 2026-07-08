package com.ss.android.ugc.aweme.story.service;

import X.AbstractC1398700mVA;
import X.C1398710mVB;
import X.C1398740mVE;
import X.C1400720mYQ;
import X.C1697810uHb;
import X.C729510SjV;
import X.C786410Ut5;
import X.InterfaceC1260110itd;
import Y.ACListenerS155S0100000_21;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.story.api.IStoryFollowUpPublishService;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class StoryFollowUpPublishService implements IStoryFollowUpPublishService {
    @Override // com.ss.android.ugc.aweme.story.api.IStoryFollowUpPublishService
    public final void LIZJ(String str, List list) {
        boolean z;
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    Aweme aweme = (Aweme) obj;
                    if (C729510SjV.LJJIJIL(aweme) && !C729510SjV.LJJIIZ(aweme)) {
                        if (str != null) {
                            aweme.setRequestId(str);
                        }
                        Aweme awemeM199clone = new Aweme().m199clone();
                        awemeM199clone.setAid(aweme.getAid());
                        awemeM199clone.setStory(null);
                        List listLJIILJJIL = C1697810uHb.LJIILJJIL(aweme);
                        Story story = aweme.getStory();
                        if (story != null) {
                            z = story.viewed;
                        } else {
                            z = false;
                        }
                        awemeM199clone.setUserStory(new UserStory(listLJIILJJIL, 1L, 0L, z, 0L, 0L, false, false, aweme.getCreateTime() * ((long) LSPassThroughRecordSizeConfig.DEFAULT), false, null, null, false, null, 1L, new UserStoryCurrentInfo(null, null, 0), false, true, new UserStoryCurrentInfo(-1, null, 0), (int) 0, false, 0L, null, false));
                        awemeM199clone.setAwemeType(40);
                        awemeM199clone.setAuthor(aweme.getAuthor());
                        awemeM199clone.setRequestId(aweme.getRequestId());
                        awemeM199clone.setIsTikTokStory(true);
                        ListProtector.set(list, i, awemeM199clone);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0mVE] */
    @Override // com.ss.android.ugc.aweme.story.api.IStoryFollowUpPublishService
    public final C1398740mVE LIZIZ(ViewGroup viewGroup, final String str, final InterfaceC1260110itd interfaceC1260110itd, final DetailAwemeListFragment detailAwemeListFragment) {
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fbb, viewGroup, false);
        return new AbstractC1398700mVA(viewTd, str, interfaceC1260110itd, detailAwemeListFragment) { // from class: X.0mVE
            @Override // X.AbstractC1398700mVA
            public final String getEnterFrom() {
                return "single_song";
            }

            @Override // X.AbstractC1398700mVA
            public final EnumC1606080rte e6() {
                return EnumC1606080rte.MUSIC_VIEW_HOLDER;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0mVB] */
    @Override // com.ss.android.ugc.aweme.story.api.IStoryFollowUpPublishService
    public final C1398710mVB LIZ(ViewGroup viewGroup, final String str, final InterfaceC1260110itd interfaceC1260110itd, final C1400720mYQ c1400720mYQ, final DetailAwemeListFragment detailAwemeListFragment) {
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fbb, viewGroup, false);
        return new AbstractC1398700mVA(viewTd, str, interfaceC1260110itd, c1400720mYQ, detailAwemeListFragment) { // from class: X.0mVB
            public final InterfaceC1398680mV8 LLJJIII;
            public NewFaceStickerBean LLJJIJI;

            @Override // X.AbstractC1398700mVA
            public final String getEnterFrom() {
                return "prop_page";
            }

            @Override // X.AbstractC1398700mVA
            public final EnumC1606080rte e6() {
                return EnumC1606080rte.PROP_VIEW_HOLDER;
            }

            @Override // X.AbstractC1398700mVA
            public final void b6(View view) {
                AwemeStatus statusSafety;
                Aweme aweme = this.LL;
                if (aweme != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety.isDelete()) {
                    C1389890mGx c1389890mGx = new C1389890mGx(view);
                    c1389890mGx.LJIIIZ(2131858124);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                InterfaceC1260110itd interfaceC1260110itd2 = this.LLIZLLLIL;
                if (interfaceC1260110itd2 != null) {
                    NewFaceStickerBean newFaceStickerBean = this.LLJJIJI;
                    if (newFaceStickerBean != null) {
                        boolean z = newFaceStickerBean.isFriendVideoPresent;
                        Aweme aweme2 = this.LL;
                        if (aweme2 != null) {
                            AwemeBizExtKt.setFriendVideoPresent(aweme2, z);
                        }
                        NewFaceStickerBean newFaceStickerBean2 = this.LLJJIJI;
                        if (newFaceStickerBean2 != null) {
                            boolean z2 = newFaceStickerBean2.isFollowerVideoPresent;
                            Aweme aweme3 = this.LL;
                            if (aweme3 != null) {
                                AwemeBizExtKt.setFollowerVideoPresent(aweme3, z2);
                            }
                        }
                    }
                    interfaceC1260110itd2.I2(this.LL, view, this.LLIZ);
                    InterfaceC1398730mVD interfaceC1398730mVD = this.LLJILJIL;
                    if (interfaceC1398730mVD != null) {
                        interfaceC1398730mVD.LJIIZILJ();
                    }
                }
            }

            @Override // X.AbstractC1398700mVA
            public final void c6(Aweme aweme, int i, boolean z, Bundle bundle) {
                VideoTag detailPageVideoTag;
                NewFaceStickerBean newFaceStickerBean;
                super.c6(aweme, i, z, bundle);
                InterfaceC1398680mV8 interfaceC1398680mV8 = this.LLJJIII;
                if (interfaceC1398680mV8 != null) {
                    this.LLJJIJI = interfaceC1398680mV8.get();
                }
                Aweme aweme2 = this.LL;
                VideoTag detailPageVideoTag2 = null;
                if (aweme2 != null) {
                    detailPageVideoTag = aweme2.getDetailPageVideoTag();
                } else {
                    detailPageVideoTag = null;
                }
                if (detailPageVideoTag == VideoTag.FRIENDS_VIDEO) {
                    NewFaceStickerBean newFaceStickerBean2 = this.LLJJIJI;
                    if (newFaceStickerBean2 != null) {
                        newFaceStickerBean2.isFriendVideoPresent = true;
                        return;
                    }
                    return;
                }
                Aweme aweme3 = this.LL;
                if (aweme3 != null) {
                    detailPageVideoTag2 = aweme3.getDetailPageVideoTag();
                }
                if (detailPageVideoTag2 != VideoTag.FOLLOWERS_VIDEO || (newFaceStickerBean = this.LLJJIJI) == null) {
                    return;
                }
                newFaceStickerBean.isFollowerVideoPresent = true;
            }

            {
                this.LLJJIII = c1400720mYQ;
                SmartImageView smartImageView = this.LLILLJJLI;
                if (smartImageView != null) {
                    C786410Ut5.Q8(smartImageView, new ACListenerS155S0100000_21(this, 288));
                }
            }
        };
    }
}
