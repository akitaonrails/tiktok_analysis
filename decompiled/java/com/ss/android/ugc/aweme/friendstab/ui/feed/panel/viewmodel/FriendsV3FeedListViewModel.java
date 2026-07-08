package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel;

import X.AbstractC1588120rQg;
import X.AbstractC316870CbV;
import X.C01GW;
import X.C09QK;
import X.C0BLC;
import X.C0NI0;
import X.C0NI2;
import X.C0O03;
import X.C0O07;
import X.C0OB8;
import X.C0RJN;
import X.C0T1R;
import X.C0W17;
import X.C1157130gDX;
import X.C1206604no;
import X.C1206704np;
import X.C1223430hwT;
import X.C1223490hwZ;
import X.C1360460lVU;
import X.C1361330lWt;
import X.C1361350lWv;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1581380rFo;
import X.C1582180rH6;
import X.C1582260rHE;
import X.C1587630rPt;
import X.C1587910rQL;
import X.C1588190rQn;
import X.C1623706Xj;
import X.C1697810uHb;
import X.C2188561Al4;
import X.C2188811AlT;
import X.C2189821An6;
import X.C278550Avt;
import X.C291001Au;
import X.C296380BjY;
import X.C316640Cb8;
import X.C323380Cm0;
import X.C452501pT;
import X.C476250Ilz;
import X.C626160OhC;
import X.C627260Oiy;
import X.C627660Ojc;
import X.C708600Rqs;
import X.C729510SjV;
import X.C806480VkM;
import X.C806600VkY;
import X.EnumC1359020lTA;
import X.InterfaceC0148002o;
import X.InterfaceC1357880lRK;
import X.InterfaceC1361270lWn;
import X.InterfaceC1361290lWp;
import X.InterfaceC1364105Vn;
import X.InterfaceC2188711AlJ;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friendstab.experiment.TempCachePreloadConfig;
import com.ss.android.ugc.aweme.friendstab.model.ContentMetadata;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.RepostUserNewContent;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedModel;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel;
import com.ss.android.ugc.aweme.friendstab.repo.LandingInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS123S1100000_9;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class FriendsV3FeedListViewModel extends AssemListViewModel<C1223430hwT, InterfaceC1361290lWp, AbstractC1588120rQg> {
    public C0RJN LLILLJJLI;
    public C1361350lWv LLILLL;
    public long LLILZIL;
    public long LLILZLL;
    public boolean LLIZ;
    public C1581380rFo LLIZLLLIL;
    public volatile AbstractC1588120rQg LLJ;
    public volatile AwS603S0100000_24 LLJILJIL;
    public volatile AwS638S0100000_24 LLJILJILJ;
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(185));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(122));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(186));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 552));

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: FQ2, reason: merged with bridge method [inline-methods] */
    public Object onLoadMore(AbstractC1588120rQg abstractC1588120rQg, InterfaceC1364105Vn<? super AbstractC316870CbV<AbstractC1588120rQg>> interfaceC1364105Vn) {
        return GQ2(this, abstractC1588120rQg, interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<AbstractC1588120rQg>> interfaceC1364105Vn) {
        return HQ2(this, interfaceC1364105Vn);
    }

    public final C1582180rH6 AQ2() {
        return (C1582180rH6) this.LLJIJIL.getValue();
    }

    public final boolean CQ2() {
        Fragment fragment;
        C0RJN c0rjn = this.LLILLJJLI;
        return (c0rjn == null || (fragment = c0rjn.LJ) == null || !fragment.isAdded() || fragment.isDetached() || fragment.getView() == null) ? false : true;
    }

    public final void JQ2() {
        C0W17.LIZJ("listVM", "resetSessionContext");
        this.LLILZLL = System.currentTimeMillis();
        this.LLILZIL = 0L;
        this.LLILLL = null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1223430hwT(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        C0W17.LIZJ("listVM", "manualListRefresh without source");
        this.LLILZLL = System.currentTimeMillis();
        setState(new AwS603S0100000_24(this, 85));
    }

    public final FriendsV3FeedRepository zQ2() {
        return (FriendsV3FeedRepository) this.LL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean BQ2() {
        C1223430hwT c1223430hwT = (C1223430hwT) getState();
        c1223430hwT.getClass();
        if (C627260Oiy.LIZIZ(c1223430hwT) instanceof C1623706Xj) {
            return true;
        }
        C626160OhC c626160OhCLIZ = C627260Oiy.LIZIZ(c1223430hwT).LIZ();
        if (c626160OhCLIZ != null) {
            return c626160OhCLIZ.LIZ;
        }
        C626160OhC c626160OhCLIZ2 = C627260Oiy.LIZLLL(c1223430hwT).LIZ();
        if (c626160OhCLIZ2 != null) {
            return c626160OhCLIZ2.LIZ;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C0O03 c0o03;
        super.onCleared();
        C0O07 c0o07 = (C0O07) this.LLILZ.getValue();
        if (c0o07 == null || (c0o03 = c0o07.LIZ) == null) {
            return;
        }
        C476250Ilz.LIZ.getClass();
        C09QK.LIZ(c0o03);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0O03, X.1AlJ] */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        final C0O07 c0o07 = (C0O07) this.LLILZ.getValue();
        if (c0o07 != null) {
            ?? r1 = new InterfaceC2188711AlJ() { // from class: X.0O03
                @Override // X.InterfaceC2188711AlJ
                public final void LIZ(C1768270w7F c1768270w7F) {
                    C09QO c09qo;
                    if (c1768270w7F != null && (c09qo = c1768270w7F.LIZIZ) != null && C0O02.LIZ[c09qo.ordinal()] == 1) {
                        c0o07.getClass();
                        C0W17.LIZJ("memory-watchdog", "releaseMemoryASAP");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("clear comment cache, size: ");
                        sbLIZ.append(C20563083t.LIZ().size());
                        C0W17.LIZJ("commentCache", C2188811AlT.LIZIZ(sbLIZ));
                        C20563083t.LIZ().clear();
                        C1599640rjG.LIZIZ.Tu();
                    }
                }
            };
            C476250Ilz.LIZ.getClass();
            C2188561Al4.LJII(r1);
            c0o07.LIZ = r1;
        }
    }

    public static void IQ2(FriendsV3FeedResponse friendsV3FeedResponse) {
        List<FriendsV3FeedModel> list;
        String imprId;
        if (friendsV3FeedResponse != null && (list = friendsV3FeedResponse.friendsV3Feeds) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<FriendsV3FeedModel> it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme = it2.next().aweme;
                if (aweme != null) {
                    arrayList.add(aweme);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            LogPbBean logPbBean = friendsV3FeedResponse.logPb;
            if (logPbBean != null) {
                imprId = logPbBean.getImprId();
            } else {
                imprId = null;
            }
            C729510SjV.LJJJJ(imprId, arrayList);
        }
    }

    public static void KQ2(FriendsV3FeedResponse friendsV3FeedResponse) {
        List<FriendsV3FeedModel> list;
        if (((Boolean) C278550Avt.LIZ.getValue()).booleanValue() && !C1206604no.LIZ()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (friendsV3FeedResponse != null && (list = friendsV3FeedResponse.friendsV3Feeds) != null) {
            Iterator<FriendsV3FeedModel> it2 = list.iterator();
            while (it2.hasNext()) {
                FriendsV3RepostModel friendsV3RepostModel = it2.next().repostItem;
                String uid = null;
                if (friendsV3RepostModel != null) {
                    Aweme aweme = friendsV3RepostModel.repostedAweme;
                    User user = friendsV3RepostModel.reposter;
                    if (user != null) {
                        uid = user.getUid();
                    }
                    if (aweme != null) {
                        String aid = aweme.getAid();
                        arrayList.add(aweme);
                        if (aid != null && uid != null) {
                            linkedHashMap.put(aid, uid);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C1360460lVU.LIZIZ.LJJIII(EnumC1359020lTA.FRIENDS_FEED, arrayList, linkedHashMap);
    }

    public final void DQ2(C1223490hwZ c1223490hwZ) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("manualListRefresh, refreshInfo=");
        sbLIZ.append(c1223490hwZ);
        C0W17.LIZJ("listVM", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL = System.currentTimeMillis();
        setState(new AwS390S0200000_24(this, c1223490hwZ, 9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LQ2(AbstractC316870CbV abstractC316870CbV) {
        if (!C296380BjY.LIZ()) {
            return;
        }
        if (abstractC316870CbV instanceof C323380Cm0) {
            this.LLJ = (AbstractC1588120rQg) ((C323380Cm0) abstractC316870CbV).LIZJ;
        } else {
            if (!(abstractC316870CbV instanceof C316640Cb8)) {
                return;
            }
            this.LLJ = null;
        }
    }

    public final void Py0(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeItemByAid, aid=");
        sbLIZ.append(str);
        C0W17.LIZJ("listVM", C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && str.length() != 0) {
            withState(new AwS123S1100000_9(this, str, 0));
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void listSetItems(Collection<? extends InterfaceC1361290lWp> collection) {
        if (!collection.isEmpty()) {
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof InterfaceC1361270lWn) {
                    super.listSetItems(collection);
                    setState(AFwS257S0000000_19.get$arr$(166));
                    return;
                }
            }
        }
        super.listSetItems(C13BV.INSTANCE);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1361290lWp> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 165));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object HQ2(com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel r19, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.AbstractC1588120rQg>> r20) {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel.HQ2(com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void xQ2(InterfaceC1361270lWn interfaceC1361270lWn, C0RJN c0rjn) {
        VideoItemParams videoItemParams;
        int pageType;
        String eventType = null;
        if ((interfaceC1361270lWn instanceof VideoItemParams) && (videoItemParams = (VideoItemParams) interfaceC1361270lWn) != null) {
            videoItemParams.setFragment(c0rjn.LJ);
            C2189821An6 c2189821An6 = c0rjn.LIZJ;
            if (c2189821An6 != null) {
                videoItemParams.setEventType(c2189821An6.getEventType());
                videoItemParams.setPageType(c2189821An6.getPageType());
                videoItemParams.setRequestId(C708600Rqs.LIZ(c2189821An6.getPageType(), videoItemParams.getAweme(), c2189821An6.getEnterMethodValue(), c2189821An6.getEventType()));
            }
            BaseFeedPageParams baseFeedPageParamsNewBuilder = BaseFeedPageParams.Companion.newBuilder();
            baseFeedPageParamsNewBuilder.setAwemeFromPage(C0T1R.LIZIZ(c0rjn.LIZ(), c0rjn.LJ));
            C2189821An6 c2189821An62 = c0rjn.LIZJ;
            if (c2189821An62 != null) {
                eventType = c2189821An62.getEventType();
            }
            baseFeedPageParamsNewBuilder.setEventType(eventType);
            C2189821An6 c2189821An63 = c0rjn.LIZJ;
            if (c2189821An63 == null) {
                c2189821An63 = new C2189821An6();
            }
            baseFeedPageParamsNewBuilder.setParam(c2189821An63);
            C2189821An6 c2189821An64 = c0rjn.LIZJ;
            if (c2189821An64 != null) {
                pageType = c2189821An64.getPageType();
            } else {
                pageType = 0;
            }
            baseFeedPageParamsNewBuilder.setPageType(pageType);
            videoItemParams.setBaseFeedParams(baseFeedPageParamsNewBuilder);
        }
    }

    public final boolean MQ2(C1361350lWv c1361350lWv, List<InterfaceC1361290lWp> list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        int size;
        Aweme aweme;
        String aid;
        int i2 = c1361350lWv.LIZJ;
        int i3 = c1361350lWv.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryInsertRepostEntrance, start=");
        sbLIZ.append(i2);
        sbLIZ.append(", end=");
        sbLIZ.append(i3);
        C2188811AlT.LIZIZ(sbLIZ);
        if (i2 >= 0 && i3 >= i2) {
            ArrayList arrayList3 = (ArrayList) list;
            int size2 = arrayList3.size();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList3) {
                if (obj instanceof InterfaceC1361270lWn) {
                    arrayList4.add(obj);
                }
            }
            int size3 = arrayList4.size();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tryInsertRepostEntrance, feedSize=");
            sbLIZ2.append(size2);
            sbLIZ2.append(", awemeItemsSize=");
            sbLIZ2.append(size3);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (size3 <= i2) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("tryInsertRepostEntrance, list size smaller than insertPosition=");
                sbLIZ3.append(i2);
                sbLIZ3.append(", feedSize=");
                sbLIZ3.append(size2);
                sbLIZ3.append(", awemeItemsSize=");
                sbLIZ3.append(size3);
                C0W17.LIZJ("listVM", C2188811AlT.LIZIZ(sbLIZ3));
                c1361350lWv.LIZJ -= size3;
                c1361350lWv.LIZLLL -= size3;
                this.LLILLL = c1361350lWv;
                return false;
            }
            ArrayList arrayList5 = new ArrayList();
            int i4 = 0;
            for (Object obj2 : arrayList4) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    C0OB8 c0ob8 = (C0OB8) obj2;
                    if (i4 < i3 && (aweme = c0ob8.getAweme()) != null && (aid = aweme.getAid()) != null) {
                        arrayList5.add(aid);
                    }
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            NewContentResponse.RepostFeedRedDotResponse repostFeedRedDotResponse = c1361350lWv.LIZIZ;
            ArrayList<RepostUserNewContent> avatarList = repostFeedRedDotResponse.getAvatarList();
            if (avatarList != null) {
                ArrayList arrayList6 = new ArrayList();
                for (RepostUserNewContent repostUserNewContent : avatarList) {
                    if (!arrayList5.contains(repostUserNewContent.getItemId())) {
                        arrayList6.add(repostUserNewContent);
                    }
                }
                arrayList = new ArrayList(arrayList6);
            } else {
                arrayList = null;
            }
            ArrayList<ContentMetadata> metaList = repostFeedRedDotResponse.getMetaList();
            if (metaList != null) {
                ArrayList arrayList7 = new ArrayList();
                for (ContentMetadata contentMetadata : metaList) {
                    if (!C13LP.LJJJJ(contentMetadata.itemId, arrayList5)) {
                        arrayList7.add(contentMetadata);
                    }
                }
                arrayList2 = new ArrayList(arrayList7);
            } else {
                arrayList2 = null;
            }
            ArrayList<ContentMetadata> metaList2 = repostFeedRedDotResponse.getMetaList();
            if (metaList2 != null) {
                int size4 = metaList2.size();
                if (arrayList2 != null) {
                    size = arrayList2.size();
                } else {
                    size = 0;
                }
                i = size4 - size;
            } else {
                i = 0;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("distinctRepost, metaDiffCount=");
            sbLIZ4.append(i);
            C0W17.LIZJ("listVM", C2188811AlT.LIZIZ(sbLIZ4));
            NewContentResponse.RepostFeedRedDotResponse repostFeedRedDotResponse2 = new NewContentResponse.RepostFeedRedDotResponse(arrayList, arrayList2, false);
            repostFeedRedDotResponse2.setRedDotCount(Math.max(0, repostFeedRedDotResponse.getRedDotCount() - i));
            ArrayList<RepostUserNewContent> avatarList2 = repostFeedRedDotResponse2.getAvatarList();
            if (avatarList2 != null && !avatarList2.isEmpty() && repostFeedRedDotResponse2.getRedDotCount() > 0) {
                C1361350lWv c1361350lWv2 = new C1361350lWv(c1361350lWv.LIZ, repostFeedRedDotResponse2, c1361350lWv.LIZJ, c1361350lWv.LIZLLL);
                int i6 = 0;
                int i7 = 0;
                for (Object obj3 : arrayList3) {
                    int i8 = i6 + 1;
                    if (i6 >= 0) {
                        if (i7 < i2) {
                            if (obj3 instanceof InterfaceC1361270lWn) {
                                i7++;
                            }
                        } else {
                            if (i7 >= i3) {
                                C0W17.LIZJ("listVM", "tryInsertRepostEntrance, no repost within range, insert at rangeEnd");
                                JQ2();
                                ListProtector.add(list, i6, new C1361330lWt(c1361350lWv2));
                                return true;
                            }
                            if (obj3 instanceof InterfaceC1357880lRK) {
                                C0W17.LIZJ("listVM", "tryInsertRepostEntrance, find repost within range to insert");
                                JQ2();
                                ListProtector.add(list, i8, new C1361330lWt(c1361350lWv2));
                                return true;
                            }
                            if (obj3 instanceof InterfaceC1361270lWn) {
                                i7++;
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("tryInsertRepostEntrance, increase indexInAwemeItem=");
                                sbLIZ5.append(i7);
                                sbLIZ5.append(", feedIndex=");
                                sbLIZ5.append(i6);
                                C0W17.LIZJ("listVM", C2188811AlT.LIZIZ(sbLIZ5));
                            }
                        }
                        i6 = i8;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                c1361350lWv2.LIZJ = 0;
                c1361350lWv2.LIZLLL -= size3;
                C0W17.LIZJ("listVM", "tryInsertRepostEntrance, list too short to find realInsertIndex, feedSize=" + size2 + ", awemeSize=" + size3 + ", newInsertRangeStart=0, newInsertRangeEnd=" + c1361350lWv2.LIZLLL);
                this.LLILLL = c1361350lWv2;
                return false;
            }
            C0W17.LIZJ("listVM", "tryInsertRepostEntrance return since all repost distincted in feed");
            JQ2();
            return false;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("tryInsertRepostEntrance, invalid insertRange, start=");
        sbLIZ6.append(i2);
        sbLIZ6.append(", end=");
        sbLIZ6.append(i3);
        C0W17.LIZ("listVM", C2188811AlT.LIZIZ(sbLIZ6));
        JQ2();
        return false;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadLatest(AbstractC1588120rQg abstractC1588120rQg, InterfaceC1364105Vn<? super AbstractC316870CbV<AbstractC1588120rQg>> interfaceC1364105Vn) {
        return EQ2(this, abstractC1588120rQg, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARN: Type inference failed for: r24v0, types: [androidx.lifecycle.ViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel, com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v9, types: [X.0lWn, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List wQ2(int r25, com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse r26) {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel.wQ2(int, com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object EQ2(com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel r7, X.AbstractC1588120rQg r8, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.AbstractC1588120rQg>> r9) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel.EQ2(com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel, X.0rQg, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object GQ2(com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel r14, X.AbstractC1588120rQg r15, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.AbstractC1588120rQg>> r16) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel.GQ2(com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel, X.0rQg, X.05Vn):java.lang.Object");
    }

    public static C291001Au yQ2(String str, FriendsV3FeedResponse friendsV3FeedResponse, List list) {
        Object next;
        String uniqueKey;
        String str2;
        if (str == null || list == null || list.isEmpty() || friendsV3FeedResponse == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof InterfaceC1361270lWn) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1361290lWp interfaceC1361290lWp = (InterfaceC1361290lWp) next;
        if (interfaceC1361290lWp != null) {
            uniqueKey = interfaceC1361290lWp.getUniqueKey();
        } else {
            uniqueKey = null;
        }
        if (Intrinsics.LJFF(uniqueKey, str) && (!Intrinsics.LJFF(friendsV3FeedResponse.hasMoreUp, Boolean.TRUE) || (str2 = friendsV3FeedResponse.feedPageTokenUp) == null || str2.length() == 0)) {
            return null;
        }
        return new C291001Au(str);
    }

    public final void NQ2(C1582260rHE c1582260rHE, List<? extends InterfaceC1361290lWp> list, String str, boolean z) {
        String str2;
        C291001Au c291001AuYQ2;
        Fragment fragment;
        Context context;
        Fragment fragment2;
        Context context2;
        int size;
        Context context3;
        Fragment fragment3;
        if (c1582260rHE != null && list != null && !list.isEmpty()) {
            boolean zLIZ = C1206704np.LIZ();
            long j = this.LLILZIL;
            if (j != -1 && j <= 0) {
                this.LLILZIL = -1L;
                String str3 = null;
                if (Intrinsics.LJFF(str, "publish_landing")) {
                    c291001AuYQ2 = null;
                } else {
                    FriendsV3FeedResponse friendsV3FeedResponse = c1582260rHE.LIZ;
                    LandingInfo landingInfo = friendsV3FeedResponse.landingInfo;
                    if (landingInfo != null) {
                        str2 = landingInfo.anchorItemId;
                    } else {
                        str2 = null;
                    }
                    c291001AuYQ2 = yQ2(str2, friendsV3FeedResponse, list);
                }
                setStateImmediate(new AwS390S0200000_24(c1582260rHE, (C1582260rHE) c291001AuYQ2, (C291001Au<String>) 10));
                if (zLIZ) {
                    C01GW c01gw = C806480VkM.LIZ;
                    if (C1206704np.LIZ()) {
                        Object obj = C806480VkM.LIZ().get(C13LE.LIZ(C806600VkY.class));
                        if (!(obj instanceof C806600VkY)) {
                            obj = null;
                        }
                        C806600VkY c806600VkY = (C806600VkY) obj;
                        if (c806600VkY != null) {
                            c806600VkY.LIZLLL(2);
                        }
                    }
                }
                if (c291001AuYQ2 != null && C0BLC.LIZ()) {
                    C01GW c01gw2 = C1588190rQn.LIZIZ;
                    if (((TempCachePreloadConfig) c01gw2.getValue()).enable && z) {
                        size = ((TempCachePreloadConfig) c01gw2.getValue()).preloadCount;
                        if (size < 0) {
                            size = 0;
                        }
                    } else {
                        size = list.size();
                    }
                    C0NI0 c0ni0 = C0NI0.LIZ;
                    C0RJN c0rjn = this.LLILLJJLI;
                    if (c0rjn != null && (fragment3 = c0rjn.LJ) != null) {
                        context3 = fragment3.getContext();
                    } else {
                        context3 = null;
                    }
                    LandingInfo landingInfo2 = c1582260rHE.LIZ.landingInfo;
                    if (landingInfo2 != null) {
                        str3 = landingInfo2.anchorItemId;
                    }
                    Integer numValueOf = Integer.valueOf(size);
                    C0NI2 c0ni2 = C0NI2.REFRESH;
                    C0NI2 c0ni22 = C0NI2.BYPASS;
                    c0ni0.getClass();
                    C0NI0.LIZIZ(context3, list, str3, numValueOf, c0ni2, c0ni22);
                } else {
                    C01GW c01gw3 = C1588190rQn.LIZIZ;
                    if (((TempCachePreloadConfig) c01gw3.getValue()).enable && z) {
                        int i = ((TempCachePreloadConfig) c01gw3.getValue()).preloadCount;
                        if (i < 0) {
                            i = 0;
                        }
                        List listLL = C13LP.LL(list, i);
                        C0RJN c0rjn2 = this.LLILLJJLI;
                        if (c0rjn2 != null && (fragment2 = c0rjn2.LJ) != null && (context2 = fragment2.getContext()) != null) {
                            C0NI0.LIZ.getClass();
                            C0NI0.LIZJ(context2, listLL);
                        }
                    } else {
                        C0RJN c0rjn3 = this.LLILLJJLI;
                        if (c0rjn3 != null && (fragment = c0rjn3.LJ) != null && (context = fragment.getContext()) != null) {
                            C0NI0.LIZ.getClass();
                            C0NI0.LIZJ(context, list);
                        }
                    }
                }
                listAddAll(list, C1587910rQL.LIZIZ(c1582260rHE.LIZ), C1587910rQL.LIZ(c1582260rHE.LIZ));
                if (C296380BjY.LIZ()) {
                    this.LLJ = C1587910rQL.LIZ(c1582260rHE.LIZ);
                }
                C1587630rPt.LIZIZ(false);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getCachedFeedsAtOnce result, session=");
                sbLIZ.append(this.LLILZIL);
                sbLIZ.append(", itemList.size=");
                sbLIZ.append(list.size());
                C0W17.LIZJ("listVM", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            zQ2().getClass();
            C0W17.LIZJ("repo", "clearCurrentUserCache");
            FriendsV3FeedRepository.LIZIZ().LIZ(FriendsV3FeedRepository.LIZLLL());
        }
    }
}
