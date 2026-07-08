package com.ss.android.ugc.aweme.story.skylight.platform;

import X.C1596950rev;
import X.C729510SjV;
import X.EnumC1597060rf6;
import X.InterfaceC1596570reJ;
import X.InterfaceC1891350zJl;
import X.InterfaceC712200Rwg;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.highlights.HighlightSkylightUser;
import com.ss.android.ugc.aweme.feed.model.story.highlights.SkylightHighlightAwemeInfo;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.platform.SkylightBiz;
import com.ss.android.ugc.aweme.service.ISocPubStatusRepoService;
import com.ss.android.ugc.aweme.story.inbox.SkylightHighlightsDividerItem;
import com.ss.android.ugc.aweme.story.inbox.SkylightHighlightsItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class HighlightSkylightBiz implements SkylightBiz<InterfaceC1891350zJl> {
    public final EnumC1597060rf6 LIZ = EnumC1597060rf6.HIGHLIGHT;

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final InterfaceC1596570reJ<InterfaceC1891350zJl> LIZIZ() {
        return new InterfaceC1596570reJ<InterfaceC1891350zJl>() { // from class: X.0rfU
            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597700rg8<InterfaceC1891350zJl> LIZ(int i) {
                return C614770O9j.LIZIZ.LJ().LJIIJJI(i);
            }

            @Override // X.InterfaceC1596570reJ
            public final List<C1597160rfG<?>> LIZIZ(int i) {
                if (i == 3) {
                    return Collections.singletonList(new C1597160rfG(C13LE.LIZ(C1597420rfg.class), new C1597290rfT()));
                }
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597360rfa<InterfaceC1891350zJl> LIZJ(int i) {
                return new InterfaceC1597360rfa<InterfaceC1891350zJl>() { // from class: X.0rfy
                    public final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(15));

                    @Override // X.InterfaceC1597360rfa
                    public final List<EnumC1597060rf6> LIZ() {
                        return C1697810uHb.LJIIJJI(EnumC1597060rf6.LIVE, EnumC1597060rf6.LIVE_EVENT, EnumC1597060rf6.STORY);
                    }

                    @Override // X.InterfaceC1597360rfa
                    public final List<InterfaceC1160280gIc<InterfaceC1891350zJl>> LIZIZ(List<? extends InterfaceC1891350zJl> list) {
                        List<Aweme> stories;
                        HighlightSkylightUser highlightSkylightUser;
                        Long l;
                        List<SkylightHighlightAwemeInfo> list2;
                        SkylightHighlightAwemeInfo next;
                        StoryHighlightInfo storyHighlightInfo;
                        String str;
                        String str2;
                        UrlModel cover;
                        List<String> urlList;
                        StoryHighlightInfo storyHighlightInfo2;
                        StoryHighlightCollection storyHighlightCollection;
                        Boolean boolIsViewed;
                        String string;
                        if (C295190Bhd.LIZJ()) {
                            ArrayList arrayList = new ArrayList();
                            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                                if (interfaceC1891350zJl instanceof SkylightHighlightsItem) {
                                    arrayList.add(new C1160290gId(C1596950rev.LIZJ(EnumC1597060rf6.HIGHLIGHT, C729510SjV.LJIIIZ(((SkylightHighlightsItem) interfaceC1891350zJl).getHighlightCollection()))));
                                }
                            }
                            return arrayList;
                        }
                        for (InterfaceC1891350zJl interfaceC1891350zJl2 : list) {
                            if (interfaceC1891350zJl2 instanceof SkylightHighlightsItem) {
                                SkylightHighlightsItem skylightHighlightsItem = (SkylightHighlightsItem) interfaceC1891350zJl2;
                                UserStory userStory = skylightHighlightsItem.getHighlightCollection().getUserStory();
                                if (userStory != null && (stories = userStory.getStories()) != null) {
                                    List<SkylightHighlightAwemeInfo> userHighlights = skylightHighlightsItem.getUserHighlights();
                                    Iterator<Aweme> it2 = stories.iterator();
                                    while (true) {
                                        boolean zBooleanValue = false;
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        Aweme next2 = it2.next();
                                        Iterator<SkylightHighlightAwemeInfo> it3 = userHighlights.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                next = it3.next();
                                                Long l2 = next.awemeId;
                                                if (l2 != null) {
                                                    string = l2.toString();
                                                } else {
                                                    string = null;
                                                }
                                                if (TextUtils.equals(string, next2.getAid())) {
                                                    break;
                                                }
                                            } else {
                                                next = null;
                                                break;
                                            }
                                        }
                                        SkylightHighlightAwemeInfo skylightHighlightAwemeInfo = next;
                                        Story story = next2.getStory();
                                        if (story != null) {
                                            if (skylightHighlightAwemeInfo != null && (boolIsViewed = skylightHighlightAwemeInfo.isViewed()) != null) {
                                                zBooleanValue = boolIsViewed.booleanValue();
                                            }
                                            story.setViewed(zBooleanValue);
                                        }
                                        if (skylightHighlightAwemeInfo != null) {
                                            storyHighlightInfo = skylightHighlightAwemeInfo.storyHighlightInfo;
                                        } else {
                                            storyHighlightInfo = null;
                                        }
                                        next2.storyHighlightInfo = storyHighlightInfo;
                                        if (skylightHighlightAwemeInfo != null && (storyHighlightInfo2 = skylightHighlightAwemeInfo.storyHighlightInfo) != null && (storyHighlightCollection = storyHighlightInfo2.containerCollectionInfo) != null) {
                                            str = storyHighlightCollection.collectionId;
                                        } else {
                                            str = null;
                                        }
                                        Video video = next2.getVideo();
                                        if (video != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null) {
                                            str2 = (String) C13LP.LJJJLL(urlList);
                                        } else {
                                            str2 = null;
                                        }
                                        C712140Rwa.LIZ(str, str2);
                                        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                                        if (iAwemeService != null) {
                                            iAwemeService.LLILLL(next2);
                                        }
                                    }
                                    UserStory userStory2 = skylightHighlightsItem.getHighlightCollection().getUserStory();
                                    if (userStory2 != null && (highlightSkylightUser = userStory2.getHighlightSkylightUser()) != null && (l = highlightSkylightUser.userId) != null) {
                                        long jLongValue = l.longValue();
                                        ISocPubStatusRepoService iSocPubStatusRepoService = (ISocPubStatusRepoService) this.LIZ.getValue();
                                        if (iSocPubStatusRepoService != null && (list2 = highlightSkylightUser.userHighlights) != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            for (SkylightHighlightAwemeInfo skylightHighlightAwemeInfo2 : list2) {
                                                SkylightHighlightAwemeInfo skylightHighlightAwemeInfo3 = skylightHighlightAwemeInfo2;
                                                if (!Intrinsics.LJFF(skylightHighlightAwemeInfo3.isViewed(), Boolean.TRUE) && skylightHighlightAwemeInfo3.awemeId != null) {
                                                    arrayList2.add(skylightHighlightAwemeInfo2);
                                                }
                                            }
                                            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                                            Iterator it4 = arrayList2.iterator();
                                            while (it4.hasNext()) {
                                                arrayList3.add(String.valueOf(((SkylightHighlightAwemeInfo) it4.next()).awemeId));
                                            }
                                            iSocPubStatusRepoService.LIZLLL(String.valueOf(jLongValue), arrayList3);
                                        }
                                    }
                                }
                            }
                        }
                        return C13BV.INSTANCE;
                    }

                    @Override // X.InterfaceC1597360rfa
                    public final List LIZJ(C1597310rfV c1597310rfV, List list) {
                        return C13BV.INSTANCE;
                    }
                };
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final EnumC1597060rf6 getBizType() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final String LIZ(InterfaceC1891350zJl interfaceC1891350zJl) {
        String strLJIIIZ;
        InterfaceC712200Rwg interfaceC712200Rwg;
        Aweme highlightCollection;
        if (interfaceC1891350zJl instanceof SkylightHighlightsDividerItem) {
            return C1596950rev.LIZJ(this.LIZ, "DIVIDER");
        }
        if ((interfaceC1891350zJl instanceof InterfaceC712200Rwg) && (interfaceC712200Rwg = (InterfaceC712200Rwg) interfaceC1891350zJl) != null && (highlightCollection = interfaceC712200Rwg.getHighlightCollection()) != null) {
            strLJIIIZ = C729510SjV.LJIIIZ(highlightCollection);
        } else {
            strLJIIIZ = "";
        }
        return C1596950rev.LIZJ(this.LIZ, strLJIIIZ);
    }
}
