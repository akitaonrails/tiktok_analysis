package com.ss.android.ugc.profile.platform.base.viewmodel;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C09S2;
import X.C0CQT;
import X.C0PEM;
import X.C0XQ7;
import X.C0ZP4;
import X.C1153080g70;
import X.C11S5;
import X.C1249090ibr;
import X.C1250160ida;
import X.C1250670ieP;
import X.C1250680ieQ;
import X.C1250900iem;
import X.C1251350ifV;
import X.C1251390ifZ;
import X.C1251520ifm;
import X.C1251540ifo;
import X.C1251850igJ;
import X.C1252220igu;
import X.C1252230igv;
import X.C1253010iiB;
import X.C1253420iiq;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1605650rsx;
import X.C1606010rtX;
import X.C1618440sDa;
import X.C1720106oR;
import X.C2171708f5;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C2532609wC;
import X.C2537109wv;
import X.C268330AfP;
import X.C291001Au;
import X.C297440BlG;
import X.C299970BpL;
import X.C443120HZe;
import X.C452501pT;
import X.C723600SZy;
import X.C735370Ssx;
import X.C736460Sui;
import X.C736820SvI;
import X.EnumC1250690ieR;
import X.EnumC1251790igD;
import X.EnumC1254690ikt;
import X.EnumC1606080rte;
import X.EnumC1615506Uf;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import Y.AfS185S0100000_16;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.StoryLiteMetadata;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.data.UpdateProfileUserAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS317S0300000_19;
import kotlin.jvm.internal.AwS33S0010000_19;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfilePlatformViewModel extends IProfilePlatformVM {
    public InterfaceC665370Q7z LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public Integer LLIZ;
    public long LLIZLLLIL;
    public User LLJ;
    public volatile boolean LLJIJIL;
    public boolean LLJILJIL;
    public String LL = "normal_mode";
    public final Object LLILLJJLI = new Object();
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723600SZy(this, C1249090ibr.class, "root_data"), true);
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(542));

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final void xQ2() {
        PQ2(this, 0, null, "updateSubscribeStatus", 7);
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final void AQ2() {
        SQ2(AFwS257S0000000_19.get$arr$(489), false);
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final void BQ2() {
        SQ2(AFwS257S0000000_19.get$arr$(490), false);
    }

    public final String LQ2() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILZ;
        String str = null;
        if (interfaceC665370Q7z != null && (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(interfaceC665370Q7z, UserProfileAbility.class, null)) != null && (otherParams = userProfileAbility.getOtherParams()) != null) {
            str = otherParams.LJIIJ;
        }
        return (!TextUtils.equals(str, "prop_page") || getAweme() == null) ? str : "prop_page_detail_aweme";
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1251350ifV(0);
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final User vQ2() {
        return this.LLJILJIL ? ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser() : this.LLJ;
    }

    public final String MQ2() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        String str = getState().LLJJJIL;
        if (str != null) {
            return str;
        }
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILZ;
        if (interfaceC665370Q7z == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(interfaceC665370Q7z, UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LIZIZ;
    }

    public final String NQ2() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        String str = getState().LLJJJ;
        if (str != null) {
            return str;
        }
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILZ;
        if (interfaceC665370Q7z == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(interfaceC665370Q7z, UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final Aweme getAweme() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Aweme aweme = getState().LLJILJILJ;
        if (aweme != null) {
            return aweme;
        }
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILZ;
        if (interfaceC665370Q7z == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(interfaceC665370Q7z, UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final Boolean wQ2() {
        C291001Au<Boolean> c291001Au = getState().LLJI;
        if (c291001Au != null) {
            return c291001Au.LIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final C1251350ifV yQ2() {
        return getState();
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final boolean isMyProfile() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final void CQ2(String str) {
        OQ2(this, null, 0, null, str, false, 23);
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final void DQ2(boolean z) {
        SQ2(new AwS33S0010000_19(z, 8), false);
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final void EQ2(Function1<? super C291001Au<Unit>, Unit> function1) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0d2Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJJJ;
            }
        }, C736820SvI.LIZLLL(), null, null, new AwS595S0100000_16((Function1) function1, (Function1<? super C291001Au<Unit>, Unit>) 163), 12, null);
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final C0ZP4 FQ2(Function1<? super C291001Au<Unit>, Unit> function1) {
        return AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0ifc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJIJI;
            }
        }, C736820SvI.LIZLLL(), null, null, new AwS598S0100000_19(function1, (Function1<? super C1251350ifV, C1251350ifV>) 462), 12, null);
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final void GQ2(Function1<? super Boolean, Unit> function1) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0ifb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1251350ifV) obj).LLJJIJIL);
            }
        }, null, null, null, new AwS598S0100000_19(function1, (Function1<? super C1251350ifV, C1251350ifV>) 463), 14, null);
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final void HQ2(AwS598S0100000_19 awS598S0100000_19) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0dZ1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJIJIL;
            }
        }, null, null, null, new AwS598S0100000_19(awS598S0100000_19, 8), 14, null);
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final C0ZP4 IQ2(Function1<? super C291001Au<? extends C443120HZe<Integer, Integer, ? extends Intent>>, Unit> function1) {
        return AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0ifd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJILJIL;
            }
        }, null, null, null, new AwS598S0100000_19(function1, (Function1<? super C1251350ifV, C1251350ifV>) 464), 14, null);
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final C0ZP4 JQ2(Function1<? super C291001Au<Boolean>, Unit> function1) {
        return AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0ife
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LL;
            }
        }, null, null, null, new AwS598S0100000_19(function1, (Function1<? super C1251350ifV, C1251350ifV>) 465), 14, null);
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final C0ZP4 KQ2(Function1<? super Boolean, Unit> function1) {
        return AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0ifa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1251350ifV) obj).LLILLJJLI);
            }
        }, null, null, null, new AwS598S0100000_19(function1, (Function1<? super C1251350ifV, C1251350ifV>) 466), 14, null);
    }

    public final void RQ2(AtomicInteger atomicInteger) {
        if (C1253010iiB.LIZJ.LJIIIIZZ() && atomicInteger.incrementAndGet() == 2) {
            this.LLJIJIL = false;
        }
    }

    public final void TQ2(Function1 function1) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0d2W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJJJJIL;
            }
        }, null, null, null, new AwS588S0100000_9(function1, (Function1<? super C291001Au<Boolean>, Unit>) 0), 14, null);
    }

    public final void VQ2(User user) {
        boolean z;
        EnumC1606080rte enumC1606080rte;
        User author;
        UserAllStoryMetadata allStoryMetadata;
        List<StoryLiteMetadata> list;
        int storyStatus;
        User author2;
        User author3;
        User author4;
        UserAllStoryMetadata allStoryMetadata2;
        List<StoryLiteMetadata> list2;
        if (user == null) {
            return;
        }
        UserAllStoryMetadata allStoryMetadata3 = null;
        if (user.getAllStoryMetadata() != null && (allStoryMetadata2 = user.getAllStoryMetadata()) != null && (list2 = allStoryMetadata2.storyLiteMetadata) != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (this.LLJILJIL) {
            enumC1606080rte = EnumC1606080rte.MY_PROFILE;
        } else {
            enumC1606080rte = EnumC1606080rte.OTHER_PROFILE;
        }
        if (z) {
            Aweme awemeLJIIIZ = C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJIIIZ(user.getUid());
            if (awemeLJIIIZ != null && (author = awemeLJIIIZ.getAuthor()) != null && (allStoryMetadata = author.getAllStoryMetadata()) != null && (list = allStoryMetadata.storyLiteMetadata) != null && (!list.isEmpty())) {
                if (user.getStoryStatus() > 0) {
                    if (awemeLJIIIZ != null && (author4 = awemeLJIIIZ.getAuthor()) != null && author4.getStoryStatus() == user.getStoryStatus()) {
                        User author5 = awemeLJIIIZ.getAuthor();
                        if (author5 != null) {
                            allStoryMetadata3 = author5.getAllStoryMetadata();
                        }
                        user.setAllStoryMetadata(allStoryMetadata3);
                        return;
                    }
                    C1605650rsx.LIZIZ.LJIIL(Collections.singletonList(user), enumC1606080rte, false);
                    return;
                }
                if (awemeLJIIIZ != null && (author3 = awemeLJIIIZ.getAuthor()) != null) {
                    allStoryMetadata3 = author3.getAllStoryMetadata();
                }
                user.setAllStoryMetadata(allStoryMetadata3);
                if (awemeLJIIIZ != null && (author2 = awemeLJIIIZ.getAuthor()) != null) {
                    storyStatus = author2.getStoryStatus();
                } else {
                    storyStatus = user.getStoryStatus();
                }
                user.setStoryStatus(storyStatus);
                C1605650rsx.LIZIZ.LJIIL(Collections.singletonList(user), enumC1606080rte, false);
                return;
            }
            C1605650rsx.LIZIZ.LJIIL(Collections.singletonList(user), enumC1606080rte, false);
            return;
        }
        C1606010rtX.LIZIZ.LIZJ(EnumC1615506Uf.STORY, enumC1606080rte, Collections.singletonList(user), new AwS598S0100000_19(user, 467));
    }

    @Override // com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM
    public final void zQ2(C291001Au<? extends Pair<? extends Exception, Integer>> c291001Au) {
        SQ2(new AwS582S0100000_3(c291001Au, (C291001Au<Unit>) 73), false);
    }

    public final void SQ2(Function1 function1, boolean z) {
        if ((!z) & this.LLJILJIL) {
            setState(new AwS598S0100000_19(function1, (Function1<? super C1251350ifV, C1251350ifV>) 2));
        } else {
            setStateImmediate(new AwS598S0100000_19(function1, (Function1<? super C1251350ifV, C1251350ifV>) 3));
        }
    }

    public final void UQ2(String str, ArrayList arrayList) {
        boolean zLJI = MethodIDManager.LJI(72024);
        synchronized (arrayList) {
            try {
                if ((!arrayList.isEmpty()) && C736460Sui.LIZIZ((String) arrayList.get(0))) {
                    if (a0.LJJIIZI((String) arrayList.get(0), "_error", false) && a0.LJJIIZI(str, "_error", false)) {
                        if (zLJI) {
                            MethodIDManager.LJ();
                            return;
                        }
                        return;
                    }
                    User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                    C1251850igJ c1251850igJ = C1251850igJ.LIZ;
                    C1250160ida.LIZ.getClass();
                    ProfileUser profileUser = C1250160ida.LIZIZ;
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(711);
                    c1251850igJ.getClass();
                    C1251850igJ.LJIILIIL(curUser, profileUser, true, aFwS257S0000000_19);
                    VQ2(curUser);
                    synchronized (this.LLILLJJLI) {
                        try {
                            if (C297440BlG.LIZ()) {
                                curUser.setFromProfile(true);
                            }
                            ((AbstractC848400XPy) C0XQ7.LJFF()).LJIL(curUser);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (zLJI) {
                                MethodIDManager.LJ();
                            }
                            throw th;
                        }
                    }
                } else {
                    arrayList.add(str);
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                throw th2;
            }
        }
    }

    public static void PQ2(ProfilePlatformViewModel profilePlatformViewModel, int i, EnumC1251790igD enumC1251790igD, String str, int i2) {
        String strLJI;
        boolean z;
        int i3;
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Integer num;
        Integer numValueOf;
        String str2;
        NewFaceStickerBean stickerEntranceInfo;
        C1252230igv c1252230igv;
        String strMQ2;
        String str3 = str;
        int i4 = i;
        if ((i2 & 1) != 0) {
            strLJI = C1253010iiB.LIZJ.LJI();
            if (strLJI == null) {
                strLJI = String.valueOf(EnumC1254690ikt.OTHER_PLATFORM.getSceneID());
            }
        } else {
            strLJI = null;
        }
        if ((i2 & 2) != 0) {
            i4 = 0;
        }
        if ((i2 & 4) != 0) {
            enumC1251790igD = EnumC1251790igD.NORMAL;
        }
        if ((i2 & 8) != 0) {
            str3 = "";
        }
        profilePlatformViewModel.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strNQ2 = profilePlatformViewModel.NQ2();
        if (strNQ2 != null && !a0.LJJJIL(strNQ2)) {
            z = false;
        } else {
            z = true;
        }
        if (z && ((strMQ2 = profilePlatformViewModel.MQ2()) == null || a0.LJJJIL(strMQ2))) {
            int i5 = C2187451AjH.LIZ;
            C1720106oR.LIZ("ProfilePlatformView", "getUserInfo requestUid & requestSecId are null");
            profilePlatformViewModel.setState(AFwS231S0000000_3.get$arr$(1));
            return;
        }
        if (i4 == 0) {
            C1249090ibr c1249090ibr = (C1249090ibr) profilePlatformViewModel.LLILLL.getValue();
            if (c1249090ibr != null && (c1252230igv = c1249090ibr.LLIZLLLIL) != null) {
                numValueOf = Integer.valueOf(c1252230igv.LLJ);
            } else {
                numValueOf = null;
            }
            Aweme aweme = profilePlatformViewModel.getAweme();
            if (aweme != null && (stickerEntranceInfo = aweme.getStickerEntranceInfo()) != null) {
                str2 = stickerEntranceInfo.ownerId;
            } else {
                str2 = null;
            }
            boolean zEquals = TextUtils.equals(str2, C735370Ssx.LJJII(profilePlatformViewModel.getAweme()));
            if (TextUtils.equals(profilePlatformViewModel.LQ2(), "music_detail")) {
                i4 = 1;
            } else {
                i4 = 3;
                if (!TextUtils.equals(profilePlatformViewModel.LQ2(), "prop_page")) {
                    if (TextUtils.equals(profilePlatformViewModel.LQ2(), "general_search") && numValueOf != null && numValueOf.intValue() == 2) {
                        i4 = 2;
                    } else if (TextUtils.equals(profilePlatformViewModel.LQ2(), "general_search") && numValueOf != null && numValueOf.intValue() == 3) {
                        i4 = 4;
                    } else if (TextUtils.equals(profilePlatformViewModel.LQ2(), "general_search") && numValueOf != null && numValueOf.intValue() == 1) {
                        i4 = 6;
                    } else if (zEquals) {
                        i4 = 7;
                    } else {
                        i4 = 0;
                    }
                }
            }
        }
        if (Intrinsics.LJFF(profilePlatformViewModel.LLILZIL, profilePlatformViewModel.NQ2()) && Intrinsics.LJFF(profilePlatformViewModel.LLILZLL, profilePlatformViewModel.MQ2()) && (num = profilePlatformViewModel.LLIZ) != null && i4 == num.intValue() && System.currentTimeMillis() - profilePlatformViewModel.LLIZLLLIL < 1000) {
            int i6 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getUserInfo lastRequestId ");
            sbLIZ.append(profilePlatformViewModel.LLILZIL);
            sbLIZ.append(", lastSecUserId: ");
            sbLIZ.append(profilePlatformViewModel.LLILZLL);
            sbLIZ.append(", lastActualFrom ");
            sbLIZ.append(profilePlatformViewModel.LLIZ);
            C1720106oR.LIZ("ProfilePlatformView", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        String strNQ22 = profilePlatformViewModel.NQ2();
        String strMQ22 = profilePlatformViewModel.MQ2();
        profilePlatformViewModel.LLILZIL = strNQ22;
        profilePlatformViewModel.LLILZLL = strMQ22;
        profilePlatformViewModel.LLIZ = Integer.valueOf(i4);
        profilePlatformViewModel.LLIZLLLIL = System.currentTimeMillis();
        int i7 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getUserInfo request start. requestUid:");
        sbLIZ2.append(profilePlatformViewModel.NQ2());
        C1720106oR.LJI("ProfilePlatformView", C2188811AlT.LIZIZ(sbLIZ2));
        C1253420iiq.LIZ.getClass();
        C1253420iiq.LIZLLL = System.currentTimeMillis();
        if (Intrinsics.LJFF(str3, "pullToRefresh")) {
            C1253420iiq.LJIILIIL = true;
        }
        if (C299970BpL.LIZ()) {
            C1250680ieQ.LJI(C1250680ieQ.LIZ, -1, str3, null, false, profilePlatformViewModel.NQ2(), null, profilePlatformViewModel.LQ2(), EnumC1250690ieR.START_REQUEST.getValue(), 36);
        }
        C1251520ifm c1251520ifm = C1251520ifm.LIZ;
        String strNQ23 = profilePlatformViewModel.NQ2();
        String strMQ23 = profilePlatformViewModel.MQ2();
        String str4 = profilePlatformViewModel.getState().LLJZIJLIL;
        if (str4 == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = profilePlatformViewModel.LLILZ;
            if (interfaceC665370Q7z != null && (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(interfaceC665370Q7z, UserProfileAbility.class, null)) != null && (otherParams = userProfileAbility.getOtherParams()) != null) {
                str4 = otherParams.LJIL;
            } else {
                str4 = null;
            }
        }
        C1250900iem c1250900iem = new C1250900iem(jCurrentTimeMillis, str3, profilePlatformViewModel, enumC1251790igD);
        c1251520ifm.getClass();
        if (!TextUtils.isEmpty(strMQ23)) {
            strNQ23 = null;
        } else {
            strMQ23 = null;
        }
        UpdateProfileUserAPI updateProfileUserAPI = (UpdateProfileUserAPI) C09S2.LIZLLL().createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(UpdateProfileUserAPI.class);
        int iIntValue = ((Number) C2537109wv.LIZ.getValue()).intValue();
        int iIntValue2 = ((Number) C2532609wC.LIZ.getValue()).intValue();
        int iLIZ = C268330AfP.LIZ();
        C1251390ifZ.LIZ.getClass();
        C1153080g70 c1153080g70LIZ = C1251390ifZ.LIZ();
        if (c1153080g70LIZ != null) {
            i3 = c1153080g70LIZ.LIZIZ;
        } else {
            i3 = 0;
        }
        updateProfileUserAPI.getOtherUserInfo(strLJI, strMQ23, strNQ23, str4, i4, iIntValue, iIntValue2, iLIZ, i3, ((Number) C1251390ifZ.LIZJ.getValue()).intValue(), null).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS185S0100000_16(c1250900iem, 42), new AfS185S0100000_16(c1250900iem, 43));
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void QQ2(java.lang.String r27, com.ss.android.ugc.profile.platform.base.data.ProfileUser r28, X.EnumC1251790igD r29, com.ss.android.ugc.aweme.profile.model.User r30, java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel.QQ2(java.lang.String, com.ss.android.ugc.profile.platform.base.data.ProfileUser, X.0igD, com.ss.android.ugc.aweme.profile.model.User, java.lang.String):void");
    }

    public static void OQ2(ProfilePlatformViewModel profilePlatformViewModel, String str, int i, EnumC1251790igD enumC1251790igD, String str2, boolean z, int i2) {
        int i3;
        String str3 = str2;
        int i4 = i;
        String strLIZ = str;
        if ((i2 & 1) != 0) {
            strLIZ = C1251540ifo.LIZ(true);
        }
        if ((i2 & 2) != 0) {
            i4 = 0;
        }
        if ((i2 & 4) != 0) {
            enumC1251790igD = EnumC1251790igD.NORMAL;
        }
        if ((i2 & 8) != 0) {
            str3 = "";
        }
        if ((i2 & 16) != 0) {
            z = false;
        }
        profilePlatformViewModel.getClass();
        int i5 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSelfInfo. isGettingSelfInfo:");
        sbLIZ.append(profilePlatformViewModel.LLJIJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z && C1253010iiB.LIZJ.LJIIIIZZ() && profilePlatformViewModel.LLJIJIL) {
            return;
        }
        profilePlatformViewModel.LLJIJIL = true;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        C1253420iiq.LIZ.getClass();
        C1253420iiq.LIZLLL = System.currentTimeMillis();
        if (Intrinsics.LJFF(str3, "pullToRefresh")) {
            C1253420iiq.LJIILIIL = true;
        }
        if (C1253010iiB.LIZJ.LJIIIIZZ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C2171708f5(profilePlatformViewModel, atomicInteger, null), 3);
        }
        if (C299970BpL.LIZ()) {
            C1250680ieQ.LJI(C1250680ieQ.LIZ, -1, str3, null, true, null, null, profilePlatformViewModel.LQ2(), EnumC1250690ieR.START_REQUEST.getValue(), 52);
        }
        C1251520ifm c1251520ifm = C1251520ifm.LIZ;
        AFwS209S0000000_21 aFwS209S0000000_21 = AFwS209S0000000_21.get$arr$(8);
        int iIntValue = ((Number) profilePlatformViewModel.LLJI.getValue()).intValue();
        C1250670ieP c1250670ieP = new C1250670ieP(jCurrentTimeMillis, str3, profilePlatformViewModel, arrayList, atomicInteger, enumC1251790igD);
        c1251520ifm.getClass();
        IRetrofitFactory iRetrofitFactoryLIZLLL = C09S2.LIZLLL();
        String str4 = C0CQT.LIZJ;
        UpdateProfileUserAPI updateProfileUserAPI = (UpdateProfileUserAPI) iRetrofitFactoryLIZLLL.createBuilder(str4).build().retrofit.LIZ(UpdateProfileUserAPI.class);
        int iIntValue2 = ((Number) C2537109wv.LIZ.getValue()).intValue();
        int iIntValue3 = ((Number) C2532609wC.LIZ.getValue()).intValue();
        int iLIZ = C268330AfP.LIZ();
        C1251390ifZ.LIZ.getClass();
        C1153080g70 c1153080g70LIZ = C1251390ifZ.LIZ();
        if (c1153080g70LIZ != null) {
            i3 = c1153080g70LIZ.LIZIZ;
        } else {
            i3 = 0;
        }
        updateProfileUserAPI.getSelfUserInfo(strLIZ, i4, iIntValue2, iIntValue3, iLIZ, 2, i3, iIntValue, aFwS209S0000000_21).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS185S0100000_16(c1250670ieP, 44), new AfS185S0100000_16(c1250670ieP, 45));
        String strValueOf = String.valueOf(EnumC1254690ikt.SLEF_LEGACY.getSceneID());
        C0XQ7.LJ();
        String curUserId = C0XQ7.LIZ.LJIIJ().getCurUserId();
        AwS317S0300000_19 awS317S0300000_19 = new AwS317S0300000_19(profilePlatformViewModel, (ProfilePlatformViewModel) arrayList, (ArrayList<String>) atomicInteger, (AtomicInteger) 0);
        ((UpdateProfileUserAPI) C09S2.LIZLLL().createBuilder(str4).build().retrofit.LIZ(UpdateProfileUserAPI.class)).getLegacyInfo(strValueOf, curUserId).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS185S0100000_16(awS317S0300000_19, 40), new AfS185S0100000_16(awS317S0300000_19, 41));
    }
}
