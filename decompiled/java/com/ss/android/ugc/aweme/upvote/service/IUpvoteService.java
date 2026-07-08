package com.ss.android.ugc.aweme.upvote.service;

import X.AbstractC1549150qPp;
import X.C03H5;
import X.C0HD9;
import X.C0ZP4;
import X.C11NZ;
import X.C1356730lPT;
import X.C1357900lRM;
import X.C1358700lSe;
import X.C1359270lTZ;
import X.C1359540lU0;
import X.C13IQ;
import X.C1907210zjL;
import X.C19EG;
import X.C453740Hqm;
import X.C896990ZGv;
import X.EnumC1359020lTA;
import X.InterfaceC1359090lTH;
import X.InterfaceC1359280lTa;
import X.InterfaceC1360060lUq;
import X.InterfaceC1360230lV7;
import X.InterfaceC1361560lXG;
import X.InterfaceC733830SqT;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS60S2100000_21;

/* JADX INFO: loaded from: classes22.dex */
public interface IUpvoteService {
    boolean LIZ();

    String LIZIZ(String str, String str2);

    boolean LIZJ(int i);

    AssemViewModel<C1357900lRM> LIZLLL(C19EG c19eg);

    void LJ(String str, UpvotePublishMobParam upvotePublishMobParam, boolean z, Function0 function0, Function0 function02, CarrierType carrierType, String str2, String str3, boolean z2);

    ProfileListFragment LJFF();

    C11NZ LJI(String str, long j, int i, Integer num);

    void LJII(String str, String str2);

    UpvoteList LJIIIIZZ(String str);

    AssemViewModel<C896990ZGv> LJIIIZ(C19EG c19eg);

    void LJIIJ();

    void LJIIJJI(List<? extends Aweme> list, boolean z, Map<String, Long> map, Map<String, String> map2, EnumC1359020lTA enumC1359020lTA, InterfaceC1359090lTH interfaceC1359090lTH);

    InterfaceC1359280lTa LJIIL();

    boolean LJIILIIL(String str);

    void LJIILJJIL();

    View LJIILL(Context context, Aweme aweme, String str, String str2, RepostReplyStruct repostReplyStruct, int i, C1907210zjL c1907210zjL);

    boolean LJIILLIIL();

    void LJIIZILJ(C19EG c19eg, Object obj, Aweme aweme, String str);

    void LJIJ(String str, String str2);

    AssemViewModel<C1358700lSe> LJIJI(Fragment fragment);

    void LJIJJ(Aweme aweme, String str, String str2, boolean z);

    boolean LJIJJLI(Aweme aweme);

    C0HD9 LJIL(String str, String str2);

    void LJJ(C19EG c19eg, Object obj, C1356730lPT c1356730lPT);

    void LJJI(List<? extends Aweme> list, EnumC1359020lTA enumC1359020lTA, InterfaceC1359090lTH interfaceC1359090lTH);

    int LJJIFFI();

    InterfaceC1361560lXG LJJII();

    void LJJIII(EnumC1359020lTA enumC1359020lTA, List list, Map map);

    void LJJIIJ(String str, UpvotePublishExtraData upvotePublishExtraData, UpvotePublishMobParam upvotePublishMobParam, C1359270lTZ c1359270lTZ, Function1<? super Boolean, Unit> function1);

    boolean LJJIIJZLJL(Aweme aweme);

    boolean LJJIIZ(String str);

    void LJJIIZI(InterfaceC1359090lTH interfaceC1359090lTH, EnumC1359020lTA enumC1359020lTA, List list, Map map, Map map2, Map map3);

    AssemViewModel<C1358700lSe> LJJIJ(C19EG c19eg);

    void LJJIJIIJI(Aweme aweme, String str, String str2, String str3, String str4, String str5);

    InterfaceC733830SqT LJJIJIIJIL();

    InterfaceC1360060lUq LJJIJIL(String str);

    void LJJIJL();

    int LJJIJLIJ(int i, int i2);

    void LJJIL(C19EG c19eg, Aweme aweme, String str, String str2, String str3, String str4, AwS60S2100000_21 awS60S2100000_21, String str5, String str6);

    boolean LJJIZ();

    void LJJJ(Comment comment, CarrierType carrierType, C453740Hqm c453740Hqm, UpvotePublishExtraData upvotePublishExtraData, UpvotePublishMobParam upvotePublishMobParam, Integer num, String str, String str2, String str3, String str4, List list, Function0 function0, Function1 function1, boolean z);

    void LJJJI(String str, String str2);

    C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LJJJIL();

    void LJJJJ(C19EG c19eg, Aweme aweme, String str, String str2, boolean z, int i, C1359540lU0 c1359540lU0);

    InterfaceC1360230lV7 LJJJJI();

    boolean LJJJJIZL();

    void LJJJJJ(String str);

    boolean LJJJJJL();

    Long LJJJJL(String str);

    C0ZP4 LJJJJLI(C19EG c19eg, AFwS252S0000000_16 aFwS252S0000000_16);

    void LJJJJLL(int i);

    void LJJJJZ(String str, String str2, String str3);

    void clearCache();

    List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList();
}
