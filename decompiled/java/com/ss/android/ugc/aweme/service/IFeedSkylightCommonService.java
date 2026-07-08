package com.ss.android.ugc.aweme.service;

import X.AbstractC23140094w;
import X.C11NZ;
import X.C1594370ral;
import X.C1595180rc4;
import X.C1595770rd1;
import X.C1596670reT;
import X.C1596680reU;
import X.C1596960rew;
import X.C1597440rfi;
import X.C1600320rkM;
import X.C19482711Kf;
import X.C19EG;
import X.EnumC1596540reG;
import X.InterfaceC1364105Vn;
import X.InterfaceC1597070rf7;
import X.InterfaceC1891350zJl;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.bean.MixRankSkylightResponse;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes25.dex */
public interface IFeedSkylightCommonService {
    void LIZ(Context context, List<FollowingInterestUser> list);

    void LIZJ(Context context);

    void LIZLLL(Fragment fragment, C1594370ral c1594370ral);

    void LJ(int i, List<? extends InterfaceC1891350zJl> list);

    C1596960rew LJFF();

    void LJI(Fragment fragment, boolean z);

    void LJII(UIAssem uIAssem);

    C1597440rfi LJIIIIZZ(int i);

    C11NZ<MixRankSkylightResponse> LJIIIZ(long j, List<Integer> list, Long l, String str, InsertStory insertStory, int i, int i2, int i3, Map<String, String> map, Map<String, Long> map2);

    void LJIIJ(Fragment fragment, String str, int i, InsertStory insertStory);

    InterfaceC1597070rf7 LJIIJJI(int i);

    boolean LJIIL(C19EG c19eg);

    void LJIILIIL(SocialFriendsFeedFragment socialFriendsFeedFragment, boolean z);

    void LJIILJJIL(Fragment fragment, String str, C1595180rc4 c1595180rc4, InsertStory insertStory);

    void LJIILL(Fragment fragment, boolean z, String str, int i, boolean z2, boolean z3, String str2);

    void LJIILLIIL(String str, Throwable th, Map<String, String> map);

    boolean LJIIZILJ(int i, String str);

    C19482711Kf LJIJ(long j, Long l, String str, EnumC1596540reG enumC1596540reG, int i, int i2, Boolean bool, int i3, int i4, Long l2, Long l3, String str2);

    void LJIJI(int i, boolean z);

    void LJIJJ(boolean z);

    void LJIJJLI();

    void LJIL(String str);

    void LJJ(Fragment fragment, List list, C1600320rkM c1600320rkM);

    C1595770rd1 LJJI(int i, C19EG c19eg);

    void LJJIFFI(SocialFriendsFeedFragment socialFriendsFeedFragment);

    boolean LJJII(Fragment fragment);

    boolean LJJIII(int i, String str);

    boolean LJJIIJ(int i, C19EG c19eg);

    void LJJIIJZLJL(int i, Fragment fragment, boolean z);

    void LJJIIZ(BaseDetailShareVM baseDetailShareVM, StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent, AwS590S0100000_11 awS590S0100000_11, Function0 function0, Function1 function1);

    void LJJIIZI(C19EG c19eg);

    int LJJIJ(Fragment fragment);

    void LJJIJIIJI(C19EG c19eg);

    Object LJJIJIIJIL(long j, List list, Long l, String str, InsertStory insertStory, int i, int i2, int i3, Map map, Integer num, Integer num2, boolean z, Map map2, AbstractC23140094w abstractC23140094w);

    C1596680reU LJJIJIL();

    FeedSkylightListViewModel LJJIJL(int i, Fragment fragment);

    C1596670reT LJJIJLIJ();

    boolean LJJIL(int i, Fragment fragment);

    void LJJIZ(Fragment fragment, C1594370ral c1594370ral);

    Object LJJJ(long j, Long l, String str, EnumC1596540reG enumC1596540reG, int i, int i2, Boolean bool, int i3, int i4, String str2, Long l2, Long l3, String str3, InterfaceC1364105Vn<? super StoryGetFeedByPageResponse> interfaceC1364105Vn);
}
