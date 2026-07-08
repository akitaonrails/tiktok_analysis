package com.ss.android.ugc.aweme.story.feed.immersive.vm;

import X.C01GW;
import X.C09R9;
import X.C0SED;
import X.C1389300mG0;
import X.C13LE;
import X.C14EU;
import X.C2189821An6;
import X.C2296808zG;
import X.C23250099c;
import X.C330530CxX;
import X.C330660Cxk;
import X.C330690Cxn;
import X.C331260Cyi;
import X.C331270Cyj;
import X.C331380Cyu;
import X.C452501pT;
import X.C622680Oba;
import X.C729510SjV;
import X.C730060SkO;
import X.C730120SkU;
import X.InterfaceC0148002o;
import X.InterfaceC330550CxZ;
import X.InterfaceC330680Cxm;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import com.ss.android.ugc.aweme.story.model.StoryInteractionUser;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS213S0300000_4;
import kotlin.jvm.internal.AwS370S0200000_4;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryViewerEntranceViewModel extends FeedBaseViewModel<C331380Cyu> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(200));
    public final C09R9 LLILLJJLI = new C09R9(this, C13LE.LIZ(C330690Cxn.class));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C331380Cyu(null);
    }

    public StoryViewerEntranceViewModel() {
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C2296808zG.LIZJ((InterfaceC497601wk) this.LL.getValue(), null);
        C622680Oba.LIZLLL(this);
    }

    public static C0SED wQ2(Aweme aweme) {
        List<StoryInteractionUser> interactionUserList;
        C330530CxX c330530CxX = C330530CxX.LIZJ;
        C330530CxX c330530CxX2 = C330530CxX.LIZJ;
        String str = "";
        if (c330530CxX2 != null) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            InterfaceC330550CxZ interfaceC330550CxZLIZ = c330530CxX2.LIZ(aid);
            if (interfaceC330550CxZLIZ != null && (interactionUserList = interfaceC330550CxZLIZ.getInteractionUserList()) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<StoryInteractionUser> it2 = interactionUserList.iterator();
                while (it2.hasNext()) {
                    User user = it2.next().user;
                    if (user != null) {
                        arrayList.add(user);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (hashSet.add(((User) obj).getUid())) {
                        arrayList2.add(obj);
                    }
                }
                String aid2 = aweme.getAid();
                if (aid2 != null) {
                    str = aid2;
                }
                return new C0SED(str, arrayList2, interfaceC330550CxZLIZ.getTotal(), interfaceC330550CxZLIZ.getViewersCount(), aweme);
            }
        }
        return new C0SED(null, null, 0L, null, aweme, 15);
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onSyncDiggStateEvent(C730120SkU c730120SkU) {
        Aweme aweme;
        String aid;
        String str;
        VideoItemParams item = getItem();
        if (item != null && (aweme = item.getAweme()) != null && (aid = aweme.getAid()) != null && ((InterfaceC330680Cxm) this.LLILLJJLI.getValue().getOperator()).LLLZL(aweme) && c730120SkU != null && (str = c730120SkU.LIZ) != null) {
            C730060SkO.LIZ(str, aid, c730120SkU, null, null);
        }
    }

    public final void zQ2(Aweme aweme) {
        String aid;
        C330530CxX c330530CxX = C330530CxX.LIZJ;
        C330530CxX c330530CxX2 = C330530CxX.LIZJ;
        if (c330530CxX2 != null) {
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            InterfaceC330550CxZ interfaceC330550CxZLIZ = c330530CxX2.LIZ(aid);
            if (interfaceC330550CxZLIZ != null) {
                xQ2(aweme, interfaceC330550CxZLIZ);
            }
        }
    }

    public static void yQ2(C331380Cyu c331380Cyu, VideoItemParams videoItemParams) {
        C330530CxX c330530CxX = C330530CxX.LIZJ;
        C330530CxX c330530CxX2 = C330530CxX.LIZJ;
        if (c330530CxX2 != null) {
            String aid = videoItemParams.getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            InterfaceC330550CxZ interfaceC330550CxZLIZ = c330530CxX2.LIZ(aid);
            if (interfaceC330550CxZLIZ != null) {
                videoItemParams.getAweme().getAid();
                List<StoryInteractionUser> interactionUserList = interfaceC330550CxZLIZ.getInteractionUserList();
                if (interactionUserList != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<StoryInteractionUser> it2 = interactionUserList.iterator();
                    while (it2.hasNext()) {
                        User user = it2.next().user;
                        if (user != null) {
                            arrayList.add(user);
                        }
                    }
                }
                interfaceC330550CxZLIZ.getTotal();
                interfaceC330550CxZLIZ.getViewersCount();
                videoItemParams.getAweme();
                c331380Cyu.getClass();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.002o] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        return getState();
    }

    public final void vQ2(C331380Cyu c331380Cyu, VideoItemParams videoItemParams) {
        String aid;
        List<StoryInsertUser> list;
        C2189821An6 c2189821An6;
        C330660Cxk storyInsertUserWrapper;
        if (C729510SjV.LJIJ(videoItemParams.getAweme()) || C729510SjV.LJJIIZ(videoItemParams.getAweme())) {
            return;
        }
        Aweme aweme = videoItemParams.getAweme();
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        Aweme aweme2 = videoItemParams.getAweme();
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null && (storyInsertUserWrapper = c2189821An6.getStoryInsertUserWrapper()) != null) {
            list = storyInsertUserWrapper.insertUsers;
        } else {
            list = null;
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LL.getValue(), null, null, new C331260Cyi(this, aid, aweme2, list, C1389300mG0.LJIIJ(videoItemParams.fragment), null), 3);
    }

    public final void xQ2(Aweme aweme, InterfaceC330550CxZ interfaceC330550CxZ) {
        List<StoryInteractionUser> interactionUserList;
        C23250099c.LIZLLL((InterfaceC497601wk) this.LL.getValue(), null, null, new C331270Cyj(interfaceC330550CxZ, null), 3);
        if (interfaceC330550CxZ != null && (interactionUserList = interfaceC330550CxZ.getInteractionUserList()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<StoryInteractionUser> it2 = interactionUserList.iterator();
            while (it2.hasNext()) {
                User user = it2.next().user;
                if (user != null) {
                    arrayList.add(user);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(((User) obj).getUid())) {
                    arrayList2.add(obj);
                }
            }
            setState(new AwS213S0300000_4(aweme, interfaceC330550CxZ, arrayList2, 4));
            return;
        }
        setState(new AwS370S0200000_4(aweme, interfaceC330550CxZ, 29));
    }
}
