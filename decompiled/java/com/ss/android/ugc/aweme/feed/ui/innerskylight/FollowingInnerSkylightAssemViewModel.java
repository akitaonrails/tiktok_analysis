package com.ss.android.ugc.aweme.feed.ui.innerskylight;

import X.C1158960gGU;
import X.C1595930rdH;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.InterfaceC0148002o;
import X.InterfaceC1595940rdI;
import X.InterfaceC1595980rdM;
import X.InterfaceC1891350zJl;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserRedDot;
import com.ss.android.ugc.aweme.model.SkylightFollowingUserItem;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS126S0101000_18;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingInnerSkylightAssemViewModel extends AssemViewModel<C1158960gGU> {
    public final List<InterfaceC1891350zJl> LL = new ArrayList();
    public int LLILLJJLI = -1;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158960gGU(this.LL, this.LLILLJJLI, null);
    }

    public final void vQ2(List<? extends InterfaceC1891350zJl> list) {
        User user;
        SlimRoom.LinkMic linkMic;
        List<com.bytedance.android.live.base.model.user.User> list2;
        com.bytedance.android.live.base.model.user.User user2;
        ((ArrayList) this.LL).clear();
        if (list != null) {
            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                if (interfaceC1891350zJl instanceof SkylightFollowingUserItem) {
                    ((ArrayList) this.LL).add(interfaceC1891350zJl);
                } else if (interfaceC1891350zJl instanceof InterfaceC1595940rdI) {
                    List<InterfaceC1891350zJl> list3 = this.LL;
                    InterfaceC1595940rdI interfaceC1595940rdI = (InterfaceC1595940rdI) interfaceC1891350zJl;
                    if (interfaceC1595940rdI.LLIILZL().getUser().getFollowStatus() != 1 && interfaceC1595940rdI.LLIILZL().getUser().getFollowStatus() != 2 && interfaceC1595940rdI.LLIILZL().getUser().getFollowStatus() != 4) {
                        SlimRoom slimRoom = interfaceC1595940rdI.LLIILZL().getSlimRoom();
                        user = null;
                        List urls = null;
                        user = null;
                        user = null;
                        user = null;
                        user = null;
                        if (slimRoom != null && (linkMic = slimRoom.getLinkMic()) != null && (list2 = linkMic.followedList) != null && list2.size() >= 2 && (user2 = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list2, 0)) != null) {
                            User user3 = new User();
                            UrlModel urlModel = new UrlModel();
                            ImageModel avatarThumb = user2.getAvatarThumb();
                            if (avatarThumb != null) {
                                urls = avatarThumb.getUrls();
                            }
                            urlModel.setUrlList(urls);
                            user3.setAvatarThumb(urlModel);
                            user3.setUid(user2.getIdStr());
                            user = user3;
                        }
                    } else {
                        user = interfaceC1595940rdI.LLIILZL().getUser();
                    }
                    ((ArrayList) list3).add(new C1595930rdH(interfaceC1595940rdI, user));
                }
            }
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("putSkylightData: ");
        sbLIZ.append(list);
        sbLIZ.append(", final size ");
        sbLIZ.append(((ArrayList) this.LL).size());
        C1720106oR.LJI("FollowingInnerSkylightAssemViewModel", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void wQ2(int i, Function1<? super String, Unit> function1) {
        InterfaceC1595980rdM interfaceC1595980rdM;
        SkylightFollowingUserRedDot skylightFollowingUserRedDotLJJJI;
        InterfaceC1595980rdM c1595930rdH;
        int i2 = this.LLILLJJLI;
        String uid = null;
        if (i2 >= 0 && i2 < ((ArrayList) this.LL).size()) {
            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) ListProtector.get(this.LL, i2);
            if (interfaceC1891350zJl instanceof SkylightFollowingUserItem) {
                SkylightFollowingUserItem skylightFollowingUserItem = (SkylightFollowingUserItem) interfaceC1891350zJl;
                c1595930rdH = new SkylightFollowingUserItem(skylightFollowingUserItem.followingUser, skylightFollowingUserItem.redDot, skylightFollowingUserItem.aweme);
            } else if (interfaceC1891350zJl instanceof C1595930rdH) {
                C1595930rdH c1595930rdH2 = (C1595930rdH) interfaceC1891350zJl;
                c1595930rdH = new C1595930rdH(c1595930rdH2.LL, c1595930rdH2.LLILLJJLI);
            } else {
                c1595930rdH = null;
            }
            if ((c1595930rdH instanceof InterfaceC1595980rdM) && c1595930rdH != null) {
                c1595930rdH.LIZ(false);
            }
            if (c1595930rdH != null) {
                ListProtector.set(this.LL, i2, c1595930rdH);
            }
        }
        this.LLILLJJLI = i;
        if (i >= 0 && i < ((ArrayList) this.LL).size()) {
            InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) ListProtector.get(this.LL, this.LLILLJJLI);
            if (interfaceC1891350zJl2 instanceof SkylightFollowingUserItem) {
                SkylightFollowingUserItem skylightFollowingUserItem2 = (SkylightFollowingUserItem) interfaceC1891350zJl2;
                SkylightFollowingUserItem skylightFollowingUserItem3 = new SkylightFollowingUserItem(skylightFollowingUserItem2.followingUser, skylightFollowingUserItem2.redDot, skylightFollowingUserItem2.aweme);
                SkylightFollowingUserRedDot skylightFollowingUserRedDot = skylightFollowingUserItem3.redDot;
                if (skylightFollowingUserRedDot != null) {
                    skylightFollowingUserRedDot.setStatus(0);
                }
                User user = skylightFollowingUserItem3.followingUser;
                if (user != null) {
                    uid = user.getUid();
                }
                function1.invoke(uid);
                interfaceC1595980rdM = skylightFollowingUserItem3;
            } else if (interfaceC1891350zJl2 instanceof C1595930rdH) {
                C1595930rdH c1595930rdH3 = (C1595930rdH) interfaceC1891350zJl2;
                InterfaceC1595940rdI interfaceC1595940rdI = c1595930rdH3.LL;
                User user2 = c1595930rdH3.LLILLJJLI;
                C1595930rdH c1595930rdH4 = new C1595930rdH(interfaceC1595940rdI, user2);
                if (interfaceC1595940rdI != null && (skylightFollowingUserRedDotLJJJI = interfaceC1595940rdI.LJJJI()) != null) {
                    skylightFollowingUserRedDotLJJJI.setStatus(0);
                }
                if (user2 != null) {
                    uid = user2.getUid();
                }
                function1.invoke(uid);
                interfaceC1595980rdM = c1595930rdH4;
            } else {
                interfaceC1595980rdM = null;
            }
            if ((interfaceC1595980rdM instanceof InterfaceC1595980rdM) && interfaceC1595980rdM != null) {
                interfaceC1595980rdM.LIZ(true);
            }
            if (interfaceC1595980rdM != null) {
                ListProtector.set(this.LL, this.LLILLJJLI, interfaceC1595980rdM);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LL);
        setState(new AwS126S0101000_18(arrayList, (List<InterfaceC1891350zJl>) i, 0));
    }
}
