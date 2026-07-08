package com.ss.android.ugc.aweme.profile;

import X.C08CD;
import X.C0IVT;
import X.C11JF;
import X.C11NZ;
import X.C14EU;
import X.C1610850s1L;
import X.C1701940uOG;
import X.C19EG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C479910Irt;
import X.InterfaceC1055110dYz;
import Y.AfS140S0200000_4;
import Y.AfS188S0100000_19;
import Y.AfS193S0100000_24;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.widget.NextLiveData;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public class ListLiveCircleItemVM extends ViewModel {
    public static final /* synthetic */ int LLJILJIL = 0;
    public boolean LLILZLL;
    public C11JF LLIZ;
    public C19EG LLJI;
    public final C1610850s1L LLJIJIL;
    public final NextLiveData LL = new NextLiveData();
    public final NextLiveData LLILLJJLI = new NextLiveData();
    public final NextLiveData LLILLL = new NextLiveData();
    public final ArrayList<User> LLILZ = new ArrayList<>();
    public final ArrayList<User> LLILZIL = new ArrayList<>();
    public String LLIZLLLIL = "tiktok_other_profile_user_recommend";
    public final String LLJ = "";

    public final void wQ2() {
        if (this.LLILZLL) {
            this.LLILZLL = false;
            C11JF c11jf = this.LLIZ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LLIZ = null;
            C20441214yg.LIZIZ("LYP_LOG", "check live state stop");
        }
        this.LLILLJJLI.postValue(Boolean.FALSE);
    }

    public final void zQ2() {
        if (this.LLILZLL || this.LLILZ.isEmpty()) {
            return;
        }
        this.LLILZLL = true;
        C20441214yg.LIZIZ("LYP_LOG", "start check live state");
        C11JF c11jf = this.LLIZ;
        if (c11jf != null) {
            c11jf.dispose();
            this.LLIZ = null;
        }
        this.LLIZ = (C11JF) C11NZ.LJJJJLI(10000L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS188S0100000_19(this, 34), new AfS193S0100000_24(this, 14));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C20441214yg.LIZIZ("LYP_LOG", "vm onCleared");
        this.LLILZLL = false;
        C11JF c11jf = this.LLIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLIZ = null;
        this.LLILZ.clear();
        this.LLJI = null;
        EventBus.LIZLLL().LJJI(this);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ListLiveCircleItemVMFollower extends ListLiveCircleItemVM {
        public ListLiveCircleItemVMFollower(C19EG c19eg) {
            super(c19eg);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ListLiveCircleItemVMFollowing extends ListLiveCircleItemVM {
        public ListLiveCircleItemVMFollowing(C19EG c19eg) {
            super(c19eg);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0rJg, X.0s1L] */
    public ListLiveCircleItemVM(final C19EG c19eg) {
        ?? r3 = new InterfaceC1055110dYz() { // from class: X.0s1L
            @Override // X.InterfaceC1583780rJg
            public final String getHoxNodeTag() {
                return "";
            }

            @Override // X.InterfaceC1055110dYz
            public final void onNodeHide(Bundle bundle) {
                this.LL.LLILLL.setValue(Boolean.FALSE);
                this.LL.wQ2();
                C20441214yg.LIZIZ("LYP_LOG", "ListLiveCircleItemVM onNodeHide()");
            }

            @Override // X.InterfaceC1055110dYz
            public final void onNodeShow(Bundle bundle) {
                NextLiveData nextLiveData = this.LL.LLILLL;
                Boolean bool = Boolean.TRUE;
                nextLiveData.setValue(bool);
                this.LL.LLILLJJLI.postValue(bool);
                C20441214yg.LIZIZ("LYP_LOG", "ListLiveCircleItemVM onNodeShow()");
            }
        };
        this.LLJIJIL = r3;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM$activityLifeObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                int i = C08CD.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            C19EG c19eg2 = c19eg;
                            if (c19eg2 != null) {
                                Hox.LLJILJIL.LIZ(c19eg2).PQ2("page_profile", this.LL.LLJIJIL);
                                c19eg2.getLifecycle().removeObserver(this);
                            }
                            C20441214yg.LIZIZ("LYP_LOG", "ListLiveCircleItemVM ON_DESTROY()");
                            return;
                        }
                        return;
                    }
                    C20441214yg.LIZIZ("LYP_LOG", "ListLiveCircleItemVM ON_PAUSE()");
                    this.LL.wQ2();
                    return;
                }
                C20441214yg.LIZIZ("LYP_LOG", "ListLiveCircleItemVM ON_RESUME()");
                this.LL.LLILLJJLI.postValue(Boolean.TRUE);
            }
        };
        this.LLJI = c19eg;
        if (c19eg != null) {
            Hox.LLJILJIL.LIZ(c19eg).wQ2("page_profile", r3);
            c19eg.getLifecycle().addObserver(lifecycleEventObserver);
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLiveStatusEvent(C479910Irt c479910Irt) {
        ArrayList<User> arrayList = this.LLILZ;
        ArrayList arrayList2 = new ArrayList();
        for (User user : arrayList) {
            if (TextUtils.equals(String.valueOf(c479910Irt.LIZIZ), user.getUid())) {
                arrayList2.add(user);
            }
        }
        boolean z = true;
        if (!arrayList2.isEmpty()) {
            User user2 = (User) ListProtector.get(arrayList2, 0);
            if (c479910Irt.LIZJ) {
                user2.roomId = 0L;
                vQ2(user2);
                this.LL.postValue(Boolean.TRUE);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("deleteLivingItem ");
                sbLIZ.append(user2.getUid());
                C20441214yg.LIZIZ("LYP_LOG", C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            z = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onLiveStatusEvent  ");
        sbLIZ2.append(c479910Irt.LIZIZ);
        sbLIZ2.append(", ");
        sbLIZ2.append(z);
        C20441214yg.LIZIZ("LYP_LOG", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void vQ2(User user) {
        Iterator<User> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(user.getUid(), it2.next().getUid())) {
                it2.remove();
            }
        }
        Iterator<User> it3 = this.LLILZIL.iterator();
        while (it3.hasNext()) {
            if (Intrinsics.LJFF(user.getUid(), it3.next().getUid())) {
                it3.remove();
            }
        }
    }

    public final void yQ2(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().j3().LJIIIZ(arrayList, new AfS140S0200000_4(arrayList, this, 15), str);
    }

    public final void xQ2(User user, String str, String str2, String str3, int i, SlimRoom slimRoom, View view) {
        String uid;
        int i2;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        ArrayList arrayList = new ArrayList();
        ArrayList<User> arrayList2 = this.LLILZ;
        HashSet hashSet = new HashSet();
        ArrayList<User> arrayList3 = new ArrayList();
        for (User user2 : arrayList2) {
            if (hashSet.add(Long.valueOf(user2.roomId))) {
                arrayList3.add(user2);
            }
        }
        int i3 = 0;
        int i4 = 0;
        for (User user3 : arrayList3) {
            int i5 = i3 + 1;
            long j = user3.roomId;
            if (j != 0) {
                arrayList.add(Long.valueOf(j));
            }
            if (Intrinsics.LJFF(user.getUid(), user3.getUid())) {
                i4 = i3;
            }
            i3 = i5;
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.enterFromMerge = str;
        roomsData.enterMethod = str2;
        if (slimRoom == null || (uid = Long.valueOf(slimRoom.getOwnerUserId()).toString()) == null) {
            uid = user.getUid();
            uid.toString();
        }
        roomsData.userId = uid;
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        if (user.isAccuratePrivateAccount()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        roomsData2.isSecret = i2;
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        logData.positionOutsideLiveRoom = i4;
        logData.liveSortBy = str3;
        logData.followListOrder = i;
        logData.sourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("c7945.d5757_i" + i, PageFinder.via(view), null);
        if (slimRoom != null) {
            C0IVT.LIZJ(slimRoom, enterRoomConfig);
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().LJIIIIZZ(this.LLJI, user, enterRoomConfig);
    }
}
