package com.ss.android.ugc.aweme.comment.services;

import X.C0H90;
import X.C0SEN;
import X.C1026380coe;
import X.C1202300hOO;
import X.C1245600iWE;
import X.C1340200kyo;
import X.C1346920l9e;
import X.C1347310lAH;
import X.C1347450lAV;
import X.C1348730lCZ;
import X.C1349350lDZ;
import X.C1349800lEI;
import X.C1356960lPq;
import X.C19719912Dl;
import X.C19EG;
import X.C2189821An6;
import X.C2344009Gk;
import X.C523420Kfs;
import X.C708350RqT;
import X.C732930Sp1;
import X.C732940Sp2;
import X.C733180SpQ;
import X.EnumC1343880l4k;
import X.EnumC733380Spk;
import X.InterfaceC1026410coh;
import X.InterfaceC1254640iko;
import X.InterfaceC1348780lCe;
import X.InterfaceC1349040lD4;
import X.InterfaceC1351090lGN;
import X.InterfaceC1364105Vn;
import X.InterfaceC522880Kf0;
import X.InterfaceC665370Q7z;
import X.InterfaceC720600SOk;
import X.InterfaceC737440SwI;
import X.ViewOnClickListenerC1349290lDT;
import X.ViewOnTouchListenerC733730SqJ;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.comment.api.CommentViewModel;
import com.ss.android.ugc.aweme.comment.commentpage.widget.CommentPreloadInstanceTask;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.ui.BottomBarFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.comment.preload.CommentPreloadTask;
import com.ss.android.ugc.aweme.comment.sticker.task.CommentStickerPreloadTask;
import com.ss.android.ugc.aweme.commentv2.offline.OfflineCommentBootTask;
import com.ss.android.ugc.aweme.commentv2.uitls.CommentDynamicFontFromGeckoTask;
import com.ss.android.ugc.aweme.commentv2.uitls.CommentDynamicFontTask;
import com.ss.android.ugc.aweme.commentv2.uitls.CommentSurpriseBootTask;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.poi.reviews.tab.ui.PoiNotifyAnchorTextChangeAbility;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public interface CommentService extends ICommentSaasService {
    public static final C523420Kfs LIZ = C523420Kfs.LIZ;

    boolean LIZJ();

    void LIZLLL(Aweme aweme, String str);

    BottomBarFragment LJ(View view, FragmentManager fragmentManager, String str, InterfaceC1254640iko interfaceC1254640iko, InterfaceC1349040lD4 interfaceC1349040lD4);

    boolean LJFF(int i, int i2);

    ViewOnTouchListenerC733730SqJ LJI(C732940Sp2 c732940Sp2, C732930Sp1 c732930Sp1, C733180SpQ c733180SpQ);

    InterfaceC1026410coh LJII(Aweme aweme);

    void LJIIIIZZ(Activity activity, Aweme aweme, String str, NowFeedMobHierarchyData nowFeedMobHierarchyData, boolean z, Comment comment, Integer num, String str2, boolean z2);

    void LJIIIZ(int i, String str, String str2, String str3, String str4, String str5, String str6);

    void LJIIJ(Float f, Aweme aweme, Integer num, int i, String str, String str2, String str3, int i2, boolean z, String str4);

    boolean LJIIJJI();

    OfflineCommentBootTask LJIIL();

    void LJIILIIL();

    void LJIILJJIL();

    InterfaceC665370Q7z LJIILL(C19EG c19eg);

    boolean LJIILLIIL(Aweme aweme);

    int LJIIZILJ();

    CommentViewModel LJIJ(C19EG c19eg);

    void LJIJI();

    void LJIJJ(Aweme aweme, Integer num, String str, WeakReference weakReference, WeakReference weakReference2);

    C1245600iWE LJIJJLI(String str);

    Class<? extends PowerCell<?>> LJIL();

    boolean LJJ();

    EnumC733380Spk LJJI(Aweme aweme);

    void LJJIFFI();

    void LJJII(int i, String str, List list);

    void LJJIII(InterfaceC522880Kf0 interfaceC522880Kf0);

    C19719912Dl LJJIIJ();

    String LJJIIJZLJL(Context context, Aweme aweme, String str);

    void LJJIIZ(Aweme aweme, Integer num, int i, String str, String str2, String str3, int i2, boolean z, String str4);

    void LJJIIZI(int i, String str, String str2);

    Object LJJIJ(C19EG c19eg, PoiNotifyAnchorTextChangeAbility poiNotifyAnchorTextChangeAbility);

    boolean LJJIJIIJI(String str);

    boolean LJJIJIIJIL(Aweme aweme);

    void LJJIJIL(Activity activity, Fragment fragment, Aweme aweme, boolean z);

    void LJJIJL(C2344009Gk c2344009Gk, String str, Bundle bundle);

    void LJJIJLIJ(Activity activity);

    void LJJIL(Activity activity, Fragment fragment, Aweme aweme, String str);

    List LJJIZ(Fragment fragment, C19EG c19eg);

    void LJJJ(C1202300hOO c1202300hOO);

    void LJJJI(Context context);

    void LJJJIL(String str, String str2, EnumC1343880l4k enumC1343880l4k, String str3, long j);

    Pair LJJJJ(int i, int i2, Context context);

    Object LJJJJI(String str, int i, String str2, Aweme aweme, String str3, List list, String str4, Long l, Integer num, Function0 function0, boolean z, Integer num2, Long l2, InterfaceC1364105Vn interfaceC1364105Vn);

    CommentStickerPreloadTask LJJJJIZL();

    List LJJJJJ(Context context, CommentStruct commentStruct, AwemeRawAd awemeRawAd, AwS565S0100000_21 awS565S0100000_21);

    void LJJJJJL(Context context, Aweme aweme, C2189821An6 c2189821An6, Function0<Unit> function0);

    C1026380coe LJJJJL();

    CommentPreloadInstanceTask LJJJJLI();

    C19719912Dl LJJJJLL();

    CommentSurpriseBootTask LJJJJZ();

    void LJJJJZI(String str, boolean z);

    C0H90 LJJJLIIL(Context context);

    void LJJJLL(int i);

    void LJJJLZIJ();

    List LJJJZ(Context context, CommentStruct commentStruct);

    InterfaceC1351090lGN LJJL(Activity activity, Fragment fragment, Aweme aweme, C1349800lEI c1349800lEI);

    void LJJLI(Aweme aweme, Comment comment, Context context, String str);

    void LJJLIIIIJ(Activity activity, Fragment fragment, Aweme aweme, Integer num, String str, String str2, boolean z, boolean z2);

    void LJJLIIIJ(CommentContextSource commentContextSource, Fragment fragment, String str, InterfaceC665370Q7z interfaceC665370Q7z, String str2, String str3, String str4, int i, Map<String, String> map, Function2<? super SpannableStringBuilder, ? super Integer, Unit> function2, Function1<? super Comment, Unit> function1);

    void LJJLIIIJILLIZJL(Context context, View view, Aweme aweme, String str);

    C708350RqT LJJLIIIJJI(ReusedUISlotAssem reusedUISlotAssem);

    String LJJLIIIJJIZ(Comment comment);

    Class<? extends PowerCell<?>> LJJLIIIJL();

    boolean LJJLIIIJLJLI();

    void LJJLIIIJLLLLLLLZ();

    ViewOnClickListenerC1349290lDT LJJLIIJ(Context context, Fragment fragment, Comment comment, Aweme aweme, Integer num, Long l, RecyclerView.ViewHolder viewHolder, String str, String str2, C1349350lDZ c1349350lDZ);

    void LJJLIL(C2189821An6 c2189821An6, Integer num, Long l, Long l2);

    String LJJLJ(CommentStruct commentStruct);

    C19719912Dl LJJLJLI();

    C1347450lAV LJJLL();

    CommentDynamicFontTask LJJZ();

    void LJJZZI();

    void LJJZZIII(String str);

    void LJL(C19EG c19eg, Aweme aweme, String str, C2189821An6 c2189821An6);

    void LJLI(Context context, FragmentManager fragmentManager, CommentRethinkPopup commentRethinkPopup, boolean z, String str, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, String str3);

    void LJLIIIL();

    boolean LJLIIL();

    boolean LJLIL();

    InterfaceC737440SwI LJLILLLLZI(C19EG c19eg, Fragment fragment, Aweme aweme, String str, String str2, String str3, C1346920l9e c1346920l9e, CommentContextSource commentContextSource);

    void LJLJI(C1202300hOO c1202300hOO);

    void LJLJJI(int i, String str, String str2, String str3, String str4, String str5);

    InterfaceC737440SwI LJLJJL(C19EG c19eg, Fragment fragment, Aweme aweme, Comment comment, String str, String str2, String str3, C1346920l9e c1346920l9e, CommentContextSource commentContextSource);

    boolean LJLJJLL(ViewGroup viewGroup, Aweme aweme, C2189821An6 c2189821An6);

    List<String> LJLJL(boolean z);

    boolean LJLJLJ();

    C1340200kyo LJLJLLL(Context context, Comment comment, Aweme aweme);

    C1348730lCZ LJLL(Fragment fragment, int i, InterfaceC1348780lCe interfaceC1348780lCe);

    void LJLLI(Comment comment, Aweme aweme, String str, String str2, boolean z, String str3, List list);

    boolean LJLLILLLL(C2189821An6 c2189821An6, Aweme aweme, Boolean bool, String str);

    void LJLLJ(Context context, CommentSurpriseStruct commentSurpriseStruct);

    boolean LJLLL(Aweme aweme);

    void LJLLLL(Aweme aweme, CharSequence charSequence, String str, String str2, int i, C1347310lAH c1347310lAH, String str3);

    void LJLLLLLL();

    boolean LJLZ(Aweme aweme);

    List<String> LJZ(Aweme aweme, boolean z);

    void LJZI(ViewStub viewStub, C2189821An6 c2189821An6, Aweme aweme);

    void LJZL();

    boolean LL(Context context);

    boolean LLD(Context context, Exception exc);

    CommentPreloadTask LLF(Context context);

    List LLFF(Context context, CommentStruct commentStruct);

    boolean LLFFF(Context context);

    void LLFII(ViewGroup viewGroup, Aweme aweme, C2189821An6 c2189821An6);

    void LLFZ(int i, C19EG c19eg);

    C1356960lPq LLI(C0SEN c0sen);

    boolean LLIFFJFJJ(Aweme aweme);

    void LLII();

    void LLIIII(Context context, int i, String str);

    void LLIIIILZ();

    InterfaceC720600SOk LLIIIJ(Aweme aweme);

    void LLIIIL(Aweme aweme);

    void LLIIIZ(Context context, Fragment fragment, Aweme aweme, String str, int[] iArr);

    void LLIIJI(String str);

    CommentDynamicFontFromGeckoTask LLIIJLIL();

    void LLIIL();

    CommentStruct LLIILII(Aweme aweme);

    int LLIILZL();

    String LLIIZ(Context context);

    void LLIL();

    void enableCommentRefactor();

    Map<String, String> getCommentThemeSparkParams();

    Map<String, String> getContentRecReasonParams(Aweme aweme, String str);

    boolean isLivePhotoEnabled();

    void removeAllCache();
}
