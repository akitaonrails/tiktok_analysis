package com.bytedance.android.livesdk.profile.service;

import X.AbstractC495790JcP;
import X.AbstractC496140Jcy;
import X.AnonymousClass0956;
import X.C00JH;
import X.C0JGA;
import X.C1161920gLG;
import X.C23250099c;
import X.C485320J1m;
import X.C489040JFu;
import X.C495820JcS;
import X.C495920Jcc;
import X.C495930Jcd;
import X.C495940Jce;
import X.C495950Jcf;
import X.C496030Jcn;
import X.C496050Jcp;
import X.C496060Jcq;
import X.C496470JdV;
import X.C520010KaN;
import X.EnumC495860JcW;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.profile.service.ILiveProfileService;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.grouplive.datachannel.GroupLiveMemberList;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.message.MemberInfo;
import com.bytedance.android.livesdk.profile.dao.LiveProfilePreloadViewModel;
import com.bytedance.android.livesdk.profile.ui.LiveProfileSheet;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.usercard.TryModeLiveProfileDialog;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import qo2.w;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: loaded from: classes8.dex */
public class LiveProfileService implements ILiveProfileService {
    public final Map<EnumC495860JcW, List<C0JGA<?>>> LL = new LinkedHashMap();

    @Override // com.bytedance.android.live.profile.service.ILiveProfileService
    public final void tf1() {
        ((LinkedHashMap) C495820JcS.LIZJ).clear();
        C485320J1m.LIZ = null;
        C485320J1m.LIZIZ = null;
    }

    @Override // com.bytedance.android.live.profile.service.ILiveProfileService
    public final Map<EnumC495860JcW, List<C0JGA<?>>> PG() {
        return this.LL;
    }

    @Override // com.bytedance.android.live.profile.service.ILiveProfileService
    public final void nA2(BaseFragment baseFragment) {
        LiveProfilePreloadViewModel liveProfilePreloadViewModel = (LiveProfilePreloadViewModel) C520010KaN.LJJJ(baseFragment, LiveProfilePreloadViewModel.class, null, null, false);
        if (liveProfilePreloadViewModel != null) {
            liveProfilePreloadViewModel.LL = null;
        }
    }

    @Override // com.bytedance.android.live.profile.service.ILiveProfileService
    public final TryModeLiveProfileDialog HG1(long j, User user) {
        TryModeLiveProfileDialog tryModeLiveProfileDialog = new TryModeLiveProfileDialog();
        tryModeLiveProfileDialog.LL = j;
        tryModeLiveProfileDialog.LLILLJJLI = user;
        tryModeLiveProfileDialog.MR(null);
        return tryModeLiveProfileDialog;
    }

    @Override // com.bytedance.android.live.profile.service.ILiveProfileService
    public final C489040JFu Lj2(C495920Jcc c495920Jcc, User user) {
        return new C489040JFu(c495920Jcc, user);
    }

    @Override // com.bytedance.android.live.profile.service.ILiveProfileService
    public final void OI(BaseFragment baseFragment, FollowPair followPair) {
        boolean z;
        C495930Jcd c495930Jcd;
        BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra> baseResponse;
        GetRoomProfileCardResponse.ResponseData responseData;
        User user;
        LiveProfilePreloadViewModel liveProfilePreloadViewModel = (LiveProfilePreloadViewModel) C520010KaN.LJJJ(baseFragment, LiveProfilePreloadViewModel.class, null, null, false);
        if (liveProfilePreloadViewModel != null) {
            C495930Jcd c495930Jcd2 = liveProfilePreloadViewModel.LL;
            if (c495930Jcd2 != null && (baseResponse = c495930Jcd2.LIZ) != null && (responseData = baseResponse.data) != null && (user = responseData.user) != null && user.getId() == followPair.LIZ) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C495930Jcd c495930Jcd3 = liveProfilePreloadViewModel.LL;
                if (c495930Jcd3 != null) {
                    c495930Jcd3.LIZIZ = followPair;
                }
                if (!followPair.LIZIZ() && (c495930Jcd = liveProfilePreloadViewModel.LL) != null) {
                    c495930Jcd.LIZJ = 2;
                    return;
                }
                return;
            }
            C495930Jcd c495930JcdLIZJ = liveProfilePreloadViewModel.LLILLJJLI.LIZJ(Long.valueOf(followPair.LIZ));
            if (c495930JcdLIZJ == null) {
                return;
            }
            c495930JcdLIZJ.LIZIZ = followPair;
            if (followPair.LIZIZ()) {
                return;
            }
            c495930JcdLIZJ.LIZJ = 2;
        }
    }

    @Override // com.bytedance.android.live.profile.service.ILiveProfileService
    public final <T> void nN0(EnumC495860JcW enumC495860JcW, C0JGA<T> c0jga) {
        if (!this.LL.containsKey(enumC495860JcW)) {
            this.LL.put(enumC495860JcW, new ArrayList());
        }
        List list = (List) ((LinkedHashMap) this.LL).get(enumC495860JcW);
        if (list != null) {
            list.add(c0jga);
        }
    }

    @Override // com.bytedance.android.live.profile.service.ILiveProfileService
    public final void sq2(BaseFragment baseFragment, User user, Room room, boolean z) {
        LiveProfilePreloadViewModel liveProfilePreloadViewModel;
        User owner;
        if (user != null && room != null && (liveProfilePreloadViewModel = (LiveProfilePreloadViewModel) C520010KaN.LJJJ(baseFragment, LiveProfilePreloadViewModel.class, null, null, false)) != null && (owner = room.getOwner()) != null && user.getId() != owner.getId()) {
            AnonymousClass0956 anonymousClass0956 = liveProfilePreloadViewModel.LLILLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            liveProfilePreloadViewModel.LLILLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveProfilePreloadViewModel), null, null, new C496030Jcn(user, liveProfilePreloadViewModel, room, z, null), 3);
        }
    }

    @Override // com.bytedance.android.live.profile.service.ILiveProfileService
    public final void hd2(Context context, BaseFragment baseFragment, DataChannel dataChannel, boolean z, LifecycleOwner lifecycleOwner) {
        WeakReference<Context> weakReference;
        new LiveProfilePresenter(baseFragment, dataChannel, z, lifecycleOwner);
        if (context != null) {
            weakReference = new WeakReference<>(context);
        } else {
            weakReference = null;
        }
        C485320J1m.LIZ = weakReference;
        C485320J1m.LIZIZ = new WeakReference<>(lifecycleOwner);
    }

    @Override // com.bytedance.android.live.profile.service.ILiveProfileService
    public final LiveProfileSheet rP(Context context, DataChannel dataChannel, boolean z, Room room, User user, long j, UserProfileEvent userProfileEvent) {
        boolean z2;
        AbstractC496140Jcy<?> c496060Jcq;
        List list;
        List<MemberInfo> list2;
        User user2 = user;
        LiveProfileSheet liveProfileSheet = new LiveProfileSheet();
        if (user2 == null) {
            user2 = (User) UserService.getInstance().user().getCurrentUser();
        }
        C00JH c00jh = (C00JH) dataChannel.gg0(GroupLiveMemberList.class);
        if (c00jh != null && (list2 = c00jh.LIZ) != null && (!list2.isEmpty())) {
            Iterator<MemberInfo> it2 = list2.iterator();
            z2 = false;
            while (it2.hasNext()) {
                if (j == it2.next().userId) {
                    z2 = true;
                }
            }
        } else {
            z2 = false;
        }
        long ownerUserId = room.getOwnerUserId();
        List<Long> listB70 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).b70();
        ArrayList arrayList = new ArrayList();
        for (Long l : listB70) {
            if (l.longValue() != room.getOwnerUserId()) {
                arrayList.add(l);
            }
        }
        C495950Jcf c495950Jcf = new C495950Jcf(user2, j, ownerUserId, arrayList, ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).rm0(user2.getId()), ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).rm0(j), z2, userProfileEvent.isEnigma());
        w.LIZ.getClass();
        liveProfileSheet.LLJLLL = new C495920Jcc(dataChannel, context, liveProfileSheet, c495950Jcf, liveProfileSheet, z, room, user2, j, userProfileEvent, new C495940Jce(w.LIZLLL(), w.LJIIL(), w.LJIIIZ()));
        Iterator<T> it3 = ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).PG().entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            Object key = entry.getKey();
            List<C0JGA> list3 = (List) entry.getValue();
            if (!liveProfileSheet.LLLLIIL.containsKey(key)) {
                liveProfileSheet.LLLLIIL.put((EnumC495860JcW) key, new ArrayList());
            }
            for (C0JGA c0jga : list3) {
                C495920Jcc c495920Jcc = liveProfileSheet.LLJLLL;
                if (c495920Jcc != null) {
                    AbstractC495790JcP abstractC495790JcPLIZ = c0jga.LIZ(c495920Jcc);
                    if (abstractC495790JcPLIZ.LJFF() && (list = (List) ((LinkedHashMap) liveProfileSheet.LLLLIIL).get(key)) != null) {
                        list.add(abstractC495790JcPLIZ);
                    }
                }
            }
        }
        C495920Jcc c495920Jcc2 = liveProfileSheet.LLJLLL;
        if (c495920Jcc2 != null) {
            if (c495920Jcc2.LIZJ.LJ) {
                c496060Jcq = new C496050Jcp(c495920Jcc2, liveProfileSheet.zS());
            } else {
                c496060Jcq = new C496060Jcq(c495920Jcc2, liveProfileSheet.zS());
            }
            liveProfileSheet.LLJZ = c496060Jcq;
            liveProfileSheet.LLJZIJLIL = new C495820JcS(context);
            liveProfileSheet.LLL = new C496470JdV(c495920Jcc2);
        }
        return liveProfileSheet;
    }
}
