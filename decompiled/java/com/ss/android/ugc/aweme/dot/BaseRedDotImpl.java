package com.ss.android.ugc.aweme.dot;

import X.C08JS;
import X.C13BV;
import X.C14EU;
import X.C15438062q;
import X.C1582080rGw;
import X.C1586540rO8;
import X.C1586620rOG;
import X.C1586680rOM;
import X.C1586900rOi;
import X.C1586930rOl;
import X.C1587080rP0;
import X.C1587230rPF;
import X.C1589640rT8;
import X.C1595430rcT;
import X.C15O7;
import X.C1697810uHb;
import X.C18000073e;
import X.C1AF0;
import X.C2188811AlT;
import X.C2549609yw;
import X.C296370BjX;
import X.C319860CgK;
import X.C622680Oba;
import X.C888460YtI;
import X.EnumC1392960mLu;
import X.EnumC1586970rOp;
import X.EnumC1587000rOs;
import X.InterfaceC1586780rOW;
import Y.ACallableS429S0100000_24;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.dot.BaseRedDotImpl;
import com.ss.android.ugc.aweme.dot.request.RedDotPolling;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.friendstab.model.ContentMetadata;
import com.ss.android.ugc.aweme.friendstab.model.FriendsUserNewContent;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public abstract class BaseRedDotImpl implements InterfaceC1586780rOW {
    public C1586930rOl LL = new C1586930rOl();
    public NewContentResponse LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    @Override // X.InterfaceC1584770rLH
    public void LIZIZ(String str, String str2) {
    }

    @Override // X.InterfaceC1586780rOW
    public CopyOnWriteArrayList<SingleTabCounter> LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC1586780rOW
    public void LJII() {
    }

    @Override // X.InterfaceC1586780rOW
    public C1582080rGw LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC1586780rOW
    public void LJIILL(String str) {
    }

    @Override // X.InterfaceC1586780rOW
    public int LJIJI(String str) {
        return 0;
    }

    @Override // X.InterfaceC1586780rOW
    public CopyOnWriteArrayList<SingleTabCounter> LJIJJ() {
        return null;
    }

    @Override // X.InterfaceC1586780rOW
    public C1587230rPF getSocialTabNoticeData() {
        return null;
    }

    @Override // X.InterfaceC1586780rOW
    public ArrayList<Integer> LIZ() {
        return new ArrayList<>();
    }

    @Override // X.InterfaceC1586780rOW
    public ArrayList<Integer> LJIIIZ() {
        return new ArrayList<>();
    }

    @Override // X.InterfaceC1586780rOW
    public final C1586930rOl LJIIJJI() {
        C1586930rOl c1586930rOlLIZ = C1586930rOl.LIZ(this.LL, null, null, 0, false, 15);
        LJJIIJZLJL();
        return c1586930rOlLIZ;
    }

    @Override // X.InterfaceC1586780rOW
    public final ArrayList LJIILIIL() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C1595430rcT.LIZIZ.LIZJ().getSocial2TabFeedType("FRIENDS_FEED")));
        return arrayList;
    }

    @Override // X.InterfaceC1586780rOW
    public final boolean LJIIZILJ() {
        return !C1589640rT8.LIZIZ.W2();
    }

    @Override // X.InterfaceC1586780rOW
    public final boolean LJIJJLI() {
        return !C1589640rT8.LIZIZ.C2();
    }

    public void LJJII() {
        StateOwner stateOwner = StateOwner.LL;
        LifecycleOwner lifecycleOwnerLIZJ = stateOwner.LIZJ();
        if (lifecycleOwnerLIZJ != null) {
            stateOwner.getClass();
            StateOwner.LLILZ.observe(lifecycleOwnerLIZJ, new Observer<Boolean>() { // from class: X.0rOj
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Boolean bool) {
                    boolean zBooleanValue = bool.booleanValue();
                    if (!zBooleanValue) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("loginSuccess ");
                        sbLIZ.append(zBooleanValue);
                        sbLIZ.append(" just return");
                        C2188811AlT.LIZIZ(sbLIZ);
                        return;
                    }
                    if (!StateOwner.LL.LIZ()) {
                        return;
                    }
                    BaseRedDotImpl baseRedDotImpl = this.LL;
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    baseRedDotImpl.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("loginSuccess ");
                    sbLIZ2.append(boolValueOf);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    baseRedDotImpl.LJJIFFI(false);
                }
            });
            stateOwner.getClass();
            StateOwner.LLILZIL.observe(lifecycleOwnerLIZJ, new Observer<Boolean>() { // from class: X.0rOk
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Boolean bool) {
                    boolean zBooleanValue = bool.booleanValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("switch account ");
                    sbLIZ.append(zBooleanValue);
                    sbLIZ.append(", islogin = ");
                    StateOwner stateOwner2 = StateOwner.LL;
                    sbLIZ.append(stateOwner2.LIZ());
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (zBooleanValue) {
                        this.LL.LLILLL = stateOwner2.LIZ();
                    }
                }
            });
            stateOwner.getClass();
            StateOwner.LLJI.add(new C1586900rOi(this));
            lifecycleOwnerLIZJ.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.dot.BaseRedDotImpl$observeState$1$4
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_CREATE) {
                        BaseRedDotImpl baseRedDotImpl = this.LL;
                        baseRedDotImpl.getClass();
                        if (C319860CgK.LIZ()) {
                            C622680Oba.LIZJ(baseRedDotImpl);
                            return;
                        }
                        return;
                    }
                    if (event != Lifecycle.Event.ON_DESTROY) {
                        return;
                    }
                    this.LL.LJJIII();
                }
            });
        }
    }

    public final void LJJIIJZLJL() {
        this.LL = new C1586930rOl();
    }

    public void LJJIII() {
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC1586780rOW
    public void LJI(boolean z) {
        LJJII();
        if (StateOwner.LL.LIZ()) {
            LJJIFFI(z);
        }
    }

    @Override // X.InterfaceC1586780rOW
    public final ArrayList<Integer> LJIILLIIL(String str) {
        return C1697810uHb.LJ(Integer.valueOf(LJIL(str)));
    }

    @Override // X.InterfaceC1586780rOW
    public Pair<Boolean, String> LJIJ(EnumC1586970rOp enumC1586970rOp) {
        if (!StateOwner.LL.LIZ()) {
            return new Pair<>(Boolean.TRUE, "not_login");
        }
        if (enumC1586970rOp != EnumC1586970rOp.SWITCH_ACCOUNT) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (this.LLILLL) {
            this.LLILLL = false;
            return new Pair<>(Boolean.FALSE, null);
        }
        return new Pair<>(Boolean.TRUE, "warm_start_no_switch_account");
    }

    @Override // X.InterfaceC1586780rOW
    public final int LJIL(String str) {
        String str2;
        int iHashCode = str.hashCode();
        if (iHashCode != -1471928054) {
            if (iHashCode != -1309089240) {
                if (iHashCode == -734952021) {
                    str2 = "FRIENDS_TAB";
                }
            } else {
                str2 = "FRIENDS_FEED";
            }
            str.equals(str2);
        } else if (str.equals("REPOST_FEED")) {
            return 4;
        }
        return 1;
    }

    public final void LJJ(ArrayList<ContentMetadata> arrayList) {
        String str;
        String str2;
        boolean z = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i = 0;
            for (ContentMetadata contentMetadata : arrayList) {
                Boolean boolIsTikTokStory = contentMetadata.isTikTokStory();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.LJFF(boolIsTikTokStory, bool)) {
                    String str3 = contentMetadata.authorId;
                    if (str3 != null) {
                        if (this.LL.LIZ.get(str3) == null) {
                            this.LL.LIZ.put(str3, new LinkedHashSet());
                        }
                        Set<String> set = this.LL.LIZ.get(str3);
                        if (set != null && (str2 = contentMetadata.itemId) != null) {
                            set.add(str2);
                            z = true;
                        }
                    }
                } else if (Intrinsics.LJFF(boolIsTikTokStory, Boolean.FALSE)) {
                    i++;
                } else {
                    C1AF0.LIZJ("friends tab red dot isTikTok Story field empty");
                }
                String str4 = contentMetadata.authorId;
                if (str4 != null) {
                    if (this.LL.LIZIZ.get(str4) == null) {
                        this.LL.LIZIZ.put(str4, new LinkedHashMap());
                    }
                    Map<String, Boolean> map = this.LL.LIZIZ.get(str4);
                    if (map != null && (str = contentMetadata.itemId) != null) {
                        map.put(str, Boolean.valueOf(Intrinsics.LJFF(contentMetadata.isTikTokStory(), bool)));
                    }
                }
            }
            if (i != 0 || z) {
                this.LL = C1586930rOl.LIZ(this.LL, null, null, i, true, 3);
                return;
            }
            return;
        }
        LJJIIJZLJL();
    }

    public void LJJIFFI(boolean z) {
        C1586680rOM.LIZ.getClass();
        if (z) {
            RedDotPolling.LL.getClass();
            RedDotPolling.LIZIZ(true);
        }
    }

    public final void LJJIIZ(Aweme aweme) {
        if (aweme.getIsTikTokStory()) {
            Set<String> set = this.LL.LIZ.get(AwemeExtKt.getAuthorUid(aweme));
            if (set != null) {
                set.remove(aweme.getAid());
            }
            Set<String> set2 = this.LL.LIZ.get(AwemeExtKt.getAuthorUid(aweme));
            if (set2 != null && set2.isEmpty()) {
                this.LL.LIZ.remove(AwemeExtKt.getAuthorUid(aweme));
            }
        } else {
            C1586930rOl c1586930rOl = this.LL;
            this.LL = C1586930rOl.LIZ(c1586930rOl, c1586930rOl.LIZ, c1586930rOl.LIZIZ, c1586930rOl.LIZJ - 1, false, 8);
        }
        Map<String, Boolean> map = this.LL.LIZIZ.get(AwemeExtKt.getAuthorUid(aweme));
        if (map != null) {
            map.remove(aweme.getAid());
        }
        Map<String, Boolean> map2 = this.LL.LIZIZ.get(AwemeExtKt.getAuthorUid(aweme));
        if (map2 != null && map2.isEmpty()) {
            this.LL.LIZIZ.remove(AwemeExtKt.getAuthorUid(aweme));
        }
        if (this.LL.LIZ.isEmpty()) {
            C1586930rOl c1586930rOl2 = this.LL;
            if (c1586930rOl2.LIZJ == 0 && c1586930rOl2.LIZIZ.isEmpty()) {
                LJJIIJZLJL();
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUser(C888460YtI c888460YtI) {
        User user;
        String uid;
        if (c888460YtI != null && (user = c888460YtI.LIZ) != null && (uid = user.getUid()) != null) {
            removeRedDotByUid(uid, EnumC1392960mLu.ALL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v6, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    public static void LJJIIJ(NewContentResponse newContentResponse, EnumC1586970rOp enumC1586970rOp) {
        int size;
        Object arrayList;
        String scene;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        ArrayList<FriendsUserNewContent> avatarList;
        List<FriendsUserNewContent> listSubList;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse2;
        ArrayList<FriendsUserNewContent> avatarList2;
        String scene2;
        Object arrayList2;
        int size2;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse3;
        ArrayList<FriendsUserNewContent> avatarList3;
        List<FriendsUserNewContent> listSubList2;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse4;
        ArrayList<FriendsUserNewContent> avatarList4;
        if (C296370BjX.LIZ() && C1587080rP0.LIZ(enumC1586970rOp)) {
            if (enumC1586970rOp == EnumC1586970rOp.COLD_START) {
                scene2 = EnumC1587000rOs.COLD_START.getScene();
            } else if (enumC1586970rOp == EnumC1586970rOp.NON_PERSONALIZED_CHANGED) {
                scene2 = EnumC1587000rOs.NON_PERSONALIZED_FEED_CHANGE.getScene();
            } else {
                scene2 = EnumC1587000rOs.HOMEPAGE_RECREATE.getScene();
            }
            C1595430rcT c1595430rcT = C1595430rcT.LIZIZ;
            if (c1595430rcT.LIZIZ().enableTabAvatar()) {
                NewContentResponse latestResponse = c1595430rcT.LIZIZ().getLatestResponse();
                if (latestResponse != null && (friendsFeedResponse4 = latestResponse.getFriendsFeedResponse()) != null && (avatarList4 = friendsFeedResponse4.getAvatarList()) != null) {
                    size2 = avatarList4.size();
                } else {
                    size2 = 0;
                }
                int iLIZ = C18000073e.LIZ();
                if (iLIZ <= size2) {
                    size2 = iLIZ;
                }
                NewContentResponse latestResponse2 = c1595430rcT.LIZIZ().getLatestResponse();
                if (latestResponse2 != null && (friendsFeedResponse3 = latestResponse2.getFriendsFeedResponse()) != null && (avatarList3 = friendsFeedResponse3.getAvatarList()) != null && (listSubList2 = avatarList3.subList(0, size2)) != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(listSubList2, 10));
                    Iterator<FriendsUserNewContent> it2 = listSubList2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(it2.next().getItemId());
                    }
                } else {
                    arrayList2 = C13BV.INSTANCE;
                }
            } else {
                arrayList2 = C13BV.INSTANCE;
            }
            C1589640rT8.LIZIZ.i3(scene2, C08JS.LIZLLL(arrayList2), C1586540rO8.LIZ(enumC1586970rOp));
            return;
        }
        Pair<Boolean, Boolean> pairLIZJ = C1587080rP0.LIZJ(enumC1586970rOp);
        boolean zBooleanValue = pairLIZJ.getFirst().booleanValue();
        boolean zBooleanValue2 = pairLIZJ.getSecond().booleanValue();
        if (zBooleanValue && zBooleanValue2) {
            if (newContentResponse != null && (friendsFeedResponse2 = newContentResponse.getFriendsFeedResponse()) != null && (avatarList2 = friendsFeedResponse2.getAvatarList()) != null) {
                size = avatarList2.size();
            } else {
                size = 0;
            }
            int iLIZ2 = C18000073e.LIZ();
            if (iLIZ2 <= size) {
                size = iLIZ2;
            }
            if (newContentResponse != null && (friendsFeedResponse = newContentResponse.getFriendsFeedResponse()) != null && (avatarList = friendsFeedResponse.getAvatarList()) != null && (listSubList = avatarList.subList(0, size)) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
                Iterator<FriendsUserNewContent> it3 = listSubList.iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next().getItemId());
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preload after RedDot ");
            sbLIZ.append(enumC1586970rOp);
            sbLIZ.append(" request finish, awemeIds = ");
            sbLIZ.append(arrayList);
            C2188811AlT.LIZIZ(sbLIZ);
            if (enumC1586970rOp == EnumC1586970rOp.COLD_START) {
                scene = EnumC1587000rOs.COLD_START.getScene();
            } else {
                scene = EnumC1587000rOs.HOMEPAGE_RECREATE.getScene();
            }
            C1589640rT8.LIZIZ.i3(scene, C08JS.LIZLLL(arrayList), C1586540rO8.LIZ(enumC1586970rOp));
        }
    }

    @Override // X.InterfaceC1586780rOW
    public void LJIIJ(NewContentResponse newContentResponse, EnumC1586970rOp enumC1586970rOp) {
        if (C2549609yw.LIZ && C1586620rOG.LIZ) {
            C15O7.LIZIZ(new ACallableS429S0100000_24(newContentResponse, 5), C15O7.LJI, null);
        }
    }

    @Override // X.InterfaceC1586780rOW
    public void LJIIL(String str, String str2) {
        if (C2549609yw.LIZ) {
            C15O7.LIZIZ(new Callable() { // from class: X.0rL5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("FriendsTabRedDotDowngradeManager@4573.clearNotEnterFriendsNum$1");
                    C1587220rPE.LIZ.getClass();
                    C1587220rPE.LIZJ.storeInt(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), 0);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FriendsTabRedDotDowngradeManager@4573.clearNotEnterFriendsNum$1");
                    return unit;
                }
            }, C15O7.LJI, null);
        }
    }

    public static int LJJI(int i, int i2, int i3) {
        if (!C2549609yw.LIZ || i == 0) {
            return i;
        }
        return Math.max(1, i2 - i3);
    }
}
