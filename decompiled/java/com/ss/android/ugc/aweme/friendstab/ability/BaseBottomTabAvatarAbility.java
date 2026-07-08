package com.ss.android.ugc.aweme.friendstab.ability;

import X.AbstractC1591090rVT;
import X.AbstractC848400XPy;
import X.C0J5E;
import X.C0SY7;
import X.C0XQ7;
import X.C1388190mED;
import X.C1393090mM7;
import X.C13LP;
import X.C14EU;
import X.C1586810rOZ;
import X.C1587210rPD;
import X.C1591880rWk;
import X.C1954807lC;
import X.C19EG;
import X.C2252408s6;
import X.C294780Bgy;
import X.C319860CgK;
import X.C343710Ddh;
import X.C488650JEh;
import X.C622680Oba;
import X.C888460YtI;
import X.C946803n0;
import X.C991040bte;
import X.EnumC1392960mLu;
import X.EnumC1586610rOF;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.model.FriendsRedDotUser;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public abstract class BaseBottomTabAvatarAbility implements IBottomFriendsTabAvatarAbility, Observer, GenericLifecycleObserver {
    public final String LL;
    public final WeakReference<Context> LLILLJJLI;
    public C1587210rPD LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    public abstract Map<EnumC1586610rOF, ArrayList<? extends UserNewContent>> LIZIZ();

    public abstract ArrayList<? extends UserNewContent> LJFF();

    public abstract void LJIIJ(List<String> list);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final void Fw() {
        if (Intrinsics.LJFF("FRIENDS_TAB", this.LL)) {
            BB(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LifecycleOwner LIZLLL() {
        InterfaceC214902198i interfaceC214902198iLIZLLL;
        Object objLJIIIIZZ;
        Fragment fragment;
        Context context = this.LLILLJJLI.get();
        if (context != null && (objLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(context)) != null && (fragment = (Fragment) objLJIIIIZZ) != null) {
            return fragment;
        }
        LifecycleOwner lifecycleOwnerLIZJ = StateOwner.LL.LIZJ();
        if (lifecycleOwnerLIZJ != null && (lifecycleOwnerLIZJ instanceof C0J5E)) {
            return lifecycleOwnerLIZJ;
        }
        View viewHy1 = Hy1();
        if (viewHy1 == null) {
            return null;
        }
        C488650JEh c488650JEhLJII = SAFExtensionKt.LJII(viewHy1.getContext());
        if (c488650JEhLJII == null || (interfaceC214902198iLIZLLL = c488650JEhLJII.LIZLLL()) == null) {
            if (SAFExtensionKt.LJFF(viewHy1.getContext()) != null) {
                ComponentCallbacks2 componentCallbacks2LJFF = SAFExtensionKt.LJFF(viewHy1.getContext());
                if (C294780Bgy.LIZ()) {
                    if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        return null;
                    }
                } else if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) {
                    return null;
                }
            }
            Fragment fragmentLIZ = C946803n0.LIZ(viewHy1);
            if (fragmentLIZ == 0) {
                return null;
            }
            Context context2 = fragmentLIZ.getContext();
            ComponentCallbacks2 componentCallbacks2LJFF2 = context2 != null ? SAFExtensionKt.LJFF(context2) : null;
            if (C294780Bgy.LIZ()) {
                if (!(componentCallbacks2LJFF2 instanceof InterfaceC214897198d)) {
                    return null;
                }
            } else if (!(componentCallbacks2LJFF2 instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF2).getEnableSAF()) {
                return null;
            }
            while (!(fragmentLIZ instanceof InterfaceC214902198i)) {
                fragmentLIZ = fragmentLIZ.getParentFragment();
                if (fragmentLIZ == 0) {
                    return null;
                }
            }
            interfaceC214902198iLIZLLL = (InterfaceC214902198i) fragmentLIZ;
            if (interfaceC214902198iLIZLLL == null) {
                return null;
            }
        }
        return (Fragment) interfaceC214902198iLIZLLL;
    }

    public final boolean LJI() {
        C19EG c19egLIZIZ;
        Context context = this.LLILLJJLI.get();
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return false;
        }
        return Intrinsics.LJFF(C343710Ddh.LIZ(c19egLIZIZ).CQ2(), this.LL);
    }

    public final AbstractC1591090rVT dO() {
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ == null) {
            return null;
        }
        return C1591880rWk.LIZIZ.LJIILL(c19egLIZIZ).y01();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w20() {
        /*
            r8 = this;
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.0rPD r0 = r8.LLILLL
            r4 = 0
            if (r0 == 0) goto Lb3
            X.0rOF r0 = r0.LIZ
        Lc:
            X.0rOF r6 = X.EnumC1586610rOF.FRIENDS_FEED
            java.lang.String r3 = ""
            if (r0 == r6) goto L22
            boolean r0 = X.C296400Bja.LIZ()
            if (r0 == 0) goto L30
            X.0rPD r0 = r8.LLILLL
            if (r0 == 0) goto Lb0
            X.0rOF r1 = r0.LIZ
        L1e:
            X.0rOF r0 = X.EnumC1586610rOF.FRIENDS_WATER_FALL
            if (r1 != r0) goto L30
        L22:
            X.0rPD r0 = r8.LLILLL
            if (r0 == 0) goto L30
            com.ss.android.ugc.aweme.friendstab.model.UserNewContent r0 = r0.LIZIZ
            if (r0 == 0) goto L30
            java.lang.String r1 = r0.getItemId()
            if (r1 != 0) goto L31
        L30:
            r1 = r3
        L31:
            boolean r0 = r8.isShowing()
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L42
            int r0 = r1.length()
            if (r0 <= 0) goto L42
            r7.add(r1)
        L42:
            r8.LJIIJ(r7)
            X.0rPD r1 = r8.LLILLL
            if (r1 == 0) goto L4b
            X.0rOF r4 = r1.LIZ
        L4b:
            X.0rOF r0 = X.EnumC1586610rOF.REPOST_FEED
            if (r4 != r0) goto L6b
            com.ss.android.ugc.aweme.friendstab.model.UserNewContent r0 = r1.LIZIZ
            if (r0 == 0) goto L59
            java.lang.String r1 = r0.getItemId()
            if (r1 != 0) goto L5a
        L59:
            r1 = r3
        L5a:
            boolean r0 = r8.isShowing()
            if (r0 == 0) goto L6b
            int r0 = r1.length()
            if (r0 <= 0) goto L6b
            X.0rP7 r0 = X.C1587150rP7.LIZIZ
            r0.LJJI(r1)
        L6b:
            X.0rPD r4 = r8.LLILLL
            boolean r0 = X.C296330BjT.LIZ()
            if (r0 == 0) goto Laf
            boolean r0 = X.C1219904px.LIZ()
            if (r0 != 0) goto Laf
            if (r4 == 0) goto Lbf
            X.0rOF r1 = r4.LIZ
            if (r1 == r6) goto L83
            X.0rOF r0 = X.EnumC1586610rOF.FRIENDS_WATER_FALL
            if (r1 != r0) goto Lb6
        L83:
            com.ss.android.ugc.aweme.friendstab.model.UserNewContent r0 = r4.LIZIZ
            if (r0 == 0) goto Lb6
            boolean r0 = r0.isStory()
            if (r0 != r5) goto Lb6
            X.0rT8 r2 = X.C1589640rT8.LIZIZ
            com.ss.android.ugc.aweme.friendstab.model.UserNewContent r0 = r4.LIZIZ
            if (r0 == 0) goto L9d
            com.ss.android.ugc.aweme.friendstab.model.FriendsRedDotUser r0 = r0.getUser()
            if (r0 == 0) goto L9d
            java.lang.String r1 = r0.uid
            if (r1 != 0) goto L9e
        L9d:
            r1 = r3
        L9e:
            com.ss.android.ugc.aweme.friendstab.model.UserNewContent r0 = r4.LIZIZ
            if (r0 == 0) goto La9
            java.lang.String r0 = r0.getItemId()
            if (r0 == 0) goto La9
            r3 = r0
        La9:
            r2.y2(r1, r3)
            r2.j3(r5)
        Laf:
            return
        Lb0:
            r1 = r4
            goto L1e
        Lb3:
            r0 = r4
            goto Lc
        Lb6:
            X.0rT8 r0 = X.C1589640rT8.LIZIZ
            r0.y2(r3, r3)
            r0.j3(r2)
            return
        Lbf:
            X.0rT8 r0 = X.C1589640rT8.LIZIZ
            r0.y2(r3, r3)
            r0.j3(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility.w20():void");
    }

    public final View Hy1() {
        View viewLJIJI;
        AbstractC1591090rVT abstractC1591090rVTDO = dO();
        if (abstractC1591090rVTDO == null || (viewLJIJI = abstractC1591090rVTDO.LJIJI(this.LL)) == null) {
            return null;
        }
        return viewLJIJI.findViewById(R.id.l9h);
    }

    public final void LIZ() {
        UserNewContent userNewContent;
        ArrayList<? extends UserNewContent> arrayListLJFF = LJFF();
        if (arrayListLJFF != null && (userNewContent = (UserNewContent) C13LP.LJJJLL(arrayListLJFF)) != null) {
            Cs1(userNewContent, (userNewContent.getFeedType() == EnumC1586610rOF.FRIENDS_FEED && C319860CgK.LIZ()) ? EnumC1586610rOF.FRIENDS_WATER_FALL : userNewContent.getFeedType());
            return;
        }
        this.LLILLL = null;
        C2252408s6.LJII(new AwS568S0100000_24(this, 1645));
        BB(true);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final boolean isShowing() {
        View viewHy1;
        return (Hy1() == null || (viewHy1 = Hy1()) == null || viewHy1.getVisibility() != 0) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final boolean HM1() {
        return this.LLILZIL;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C622680Oba.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final C1587210rPD pm0() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final void unRegister() {
        C622680Oba.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final void BB(boolean z) {
        C1587210rPD c1587210rPD;
        C1587210rPD c1587210rPD2 = this.LLILLL;
        if (c1587210rPD2 != null) {
            c1587210rPD = new C1587210rPD(c1587210rPD2.LIZ, c1587210rPD2.LIZIZ, false, c1587210rPD2.LIZJ);
        } else {
            c1587210rPD = null;
        }
        this.LLILLL = c1587210rPD;
        this.LLILZIL = false;
        if (z) {
            this.LLILLL = null;
        }
    }

    public final void LJII(String str) {
        Iterator<? extends UserNewContent> it2;
        String str2;
        if (!isShowing()) {
            return;
        }
        Map<EnumC1586610rOF, ArrayList<? extends UserNewContent>> mapLIZIZ = LIZIZ();
        if (mapLIZIZ != null) {
            for (Map.Entry<EnumC1586610rOF, ArrayList<? extends UserNewContent>> entry : mapLIZIZ.entrySet()) {
                entry.getKey();
                ArrayList<? extends UserNewContent> value = entry.getValue();
                if (value != null && (it2 = value.iterator()) != null) {
                    while (it2.hasNext()) {
                        FriendsRedDotUser user = it2.next().getUser();
                        if (user != null) {
                            str2 = user.uid;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str2, str)) {
                            it2.remove();
                        }
                    }
                }
            }
        }
        LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public void ZD1(Aweme aweme) {
        String str;
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        String aid = aweme.getAid();
        Map<EnumC1586610rOF, ArrayList<? extends UserNewContent>> mapLIZIZ = LIZIZ();
        if (mapLIZIZ != null) {
            for (Map.Entry<EnumC1586610rOF, ArrayList<? extends UserNewContent>> entry : mapLIZIZ.entrySet()) {
                entry.getKey();
                ArrayList<? extends UserNewContent> value = entry.getValue();
                if (value != null) {
                    Iterator<? extends UserNewContent> it2 = value.iterator();
                    int i = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            UserNewContent next = it2.next();
                            if (Intrinsics.LJFF(aid, next.getItemId()) || aid == null) {
                                FriendsRedDotUser user = next.getUser();
                                if (user != null) {
                                    str = user.uid;
                                } else {
                                    str = null;
                                }
                                if (Intrinsics.LJFF(authorUid, str)) {
                                    if (i != -1 && value != null) {
                                        ListProtector.remove(value, i);
                                    }
                                }
                            }
                            i++;
                        }
                    }
                }
            }
        }
        if (!isShowing()) {
            return;
        }
        LIZ();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUser(C888460YtI c888460YtI) {
        User user;
        String uid;
        if (!LJI() && c888460YtI != null && (user = c888460YtI.LIZ) != null && (uid = user.getUid()) != null) {
            LJII(uid);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        if (!LJI() && followStatus.getFollowStatus() == C0SY7.UNFOLLOW.getValue()) {
            LJII(followStatus.getUserId());
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final void onTabChanged(String str) {
        if (Intrinsics.LJFF(str, this.LL)) {
            BB(false);
            AbstractC1591090rVT abstractC1591090rVTDO = dO();
            if (abstractC1591090rVTDO != null) {
                abstractC1591090rVTDO.LJJIL(this.LL);
            }
        }
    }

    public BaseBottomTabAvatarAbility(String str, WeakReference<Context> weakReference) {
        this.LL = str;
        this.LLILLJJLI = weakReference;
        C622680Oba.LIZJ(this);
        C2252408s6.LJII(new C991040bte(this));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public boolean Cs1(UserNewContent userNewContent, EnumC1586610rOF enumC1586610rOF) {
        FriendsRedDotUser user;
        if (!this.LLILZIL) {
            C1586810rOZ.LIZ.getClass();
            if (!C1586810rOZ.LIZ().enableNotShowAvatarLowMufUser || ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getFriendCount() > C1586810rOZ.LIZ().mufMaximumCountLevel1) {
                if (userNewContent != null && (user = userNewContent.getUser()) != null && user.avatarThumb != null) {
                    if (userNewContent != null) {
                        this.LLILLL = new C1587210rPD(enumC1586610rOF, userNewContent, false, LIZIZ());
                    }
                    C2252408s6.LJII(new AwS425S0200000_24(this, userNewContent, 19));
                    return true;
                }
                this.LLILLL = null;
                C2252408s6.LJII(new AwS568S0100000_24(this, 1644));
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final void fF0(String str, EnumC1392960mLu enumC1392960mLu) {
        Iterator<? extends UserNewContent> it2;
        String str2;
        if (!isShowing()) {
            return;
        }
        Map<EnumC1586610rOF, ArrayList<? extends UserNewContent>> mapLIZIZ = LIZIZ();
        if (mapLIZIZ != null) {
            for (Map.Entry<EnumC1586610rOF, ArrayList<? extends UserNewContent>> entry : mapLIZIZ.entrySet()) {
                entry.getKey();
                ArrayList<? extends UserNewContent> value = entry.getValue();
                if (value != null && (it2 = value.iterator()) != null) {
                    while (it2.hasNext()) {
                        UserNewContent next = it2.next();
                        if (next != null && str != null && enumC1392960mLu != null) {
                            FriendsRedDotUser user = next.getUser();
                            if (user != null) {
                                str2 = user.uid;
                            } else {
                                str2 = null;
                            }
                            if (Intrinsics.LJFF(str, str2)) {
                                int i = C1393090mM7.LIZ[enumC1392960mLu.ordinal()];
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i == 3) {
                                            continue;
                                        } else if (i == 4) {
                                            if (!next.isStory()) {
                                            }
                                        } else {
                                            throw new C1954807lC();
                                        }
                                    } else if (next.isStory()) {
                                    }
                                }
                                it2.remove();
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        }
        LIZ();
    }
}
