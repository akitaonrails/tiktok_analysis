package com.ss.android.ugc.aweme.share;

import X.AbstractC1372690lpD;
import X.C0HTT;
import X.C1106210etP;
import X.C1345650l7b;
import X.C1365280ldG;
import X.C1369580lkC;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1371970lo3;
import X.C1372470lor;
import X.C1372560lp0;
import X.C1372620lp6;
import X.C1372630lp7;
import X.C1372730lpH;
import X.C1372770lpL;
import X.C1372780lpM;
import X.C1372790lpN;
import X.C1375790luD;
import X.C1378520lyc;
import X.C1383010m5r;
import X.C1389180mFo;
import X.C1389190mFp;
import X.C19EG;
import X.C2173241A3m;
import X.C498700Jh6;
import X.C737030Svd;
import X.DialogC1369990lkr;
import X.DialogC1372820lpQ;
import X.InterfaceC1362720lZ8;
import X.InterfaceC1364105Vn;
import X.InterfaceC1369790lkX;
import X.InterfaceC1372610lp5;
import X.InterfaceC634840OvC;
import X.ViewOnClickListenerC1377010lwB;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.interact.MultiGuestLiveEvent;
import com.bytedance.android.live.liveinteract.multilive.model.GetLiveEventUserResponse;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeDialog;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LiveEvent;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration;
import com.ss.android.ugc.aweme.share.download.VideoDownloadFailedNoticeHelper;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.RepostSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public interface ShareService {
    void LIZ();

    void LIZIZ(Context context, Fragment fragment, Aweme aweme, boolean z, C0HTT<C737030Svd> c0htt, Bundle bundle, InterfaceC1369790lkX interfaceC1369790lkX);

    boolean LIZJ();

    void LIZLLL(Activity activity, Fragment fragment, Aweme aweme, boolean z, C0HTT<C737030Svd> c0htt, Bundle bundle, Function1<? super TuxSheet, Unit> function1);

    List LJ(Context context, List list);

    C1371600lnS LJFF(BaseSharePackage baseSharePackage);

    void LJI();

    void LJII(C19EG c19eg, C1372560lp0 c1372560lp0);

    boolean LJIIIIZZ(AVMusic aVMusic, String str);

    C1371590lnR LJIIIZ(SharePackage sharePackage, Activity activity, C1371970lo3 c1371970lo3);

    void LJIIJ(Activity activity, String str, C1372790lpN c1372790lpN, String str2, String str3);

    TuxSheet LJIIJJI(Activity activity, Fragment fragment, Aweme aweme, C0HTT<C737030Svd> c0htt, Bundle bundle);

    LiveSharePackage LJIIL(Activity activity, C1106210etP c1106210etP);

    void LJIILIIL(Activity activity, C1371600lnS c1371600lnS, boolean z, boolean z2);

    void LJIILJJIL(Aweme aweme, C19EG c19eg, String str, String str2, SharePackage sharePackage);

    void LJIILL(Integer num, Integer num2, String str, String str2, Long l);

    void LJIILLIIL(Context context, boolean z);

    <P extends SharePackage> TuxSheet LJIIZILJ(P p, Activity activity, AbstractC1372690lpD abstractC1372690lpD);

    C2173241A3m LJIJ();

    C1371590lnR LJIJI(Context context, StickerItem stickerItem, String str, String str2);

    C1371590lnR LJIJJ(C19EG c19eg, C1372780lpM c1372780lpM);

    boolean LJIJJLI(Aweme aweme);

    void LJIL(Context context, Fragment fragment, Aweme aweme, boolean z, C0HTT<C737030Svd> c0htt, Bundle bundle);

    void LJJ(C19EG c19eg, Aweme aweme, Comment comment, Bundle bundle, boolean z, boolean z2, C1345650l7b c1345650l7b);

    ShareConfiguration<BaseSharePackage> LJJI(AbstractC1372690lpD abstractC1372690lpD);

    AwemeSharePackage LJJIFFI(C19EG c19eg, String str, Aweme aweme, String str2);

    Object LJJII(C19EG c19eg, Bundle bundle, InterfaceC1364105Vn interfaceC1364105Vn);

    void LJJIII(Activity activity, C1372470lor c1372470lor);

    void LJJIIJ(Activity activity, Fragment fragment, Aweme aweme, boolean z, C0HTT c0htt, Bundle bundle);

    RepostSharePackage LJJIIJZLJL(Context context, Aweme aweme, UpvoteStruct upvoteStruct, String str, String str2);

    void LJJIIZ();

    void LJJIIZI(C19EG c19eg, Bundle bundle);

    ViewOnClickListenerC1377010lwB LJJIJ(Activity activity, Aweme aweme);

    InterfaceC1369790lkX LJJIJIIJI(Activity activity, Aweme aweme);

    void LJJIJIIJIL(C19EG c19eg, Aweme aweme, String str);

    Aweme LJJIJIL(SharePackage sharePackage);

    boolean LJJIJL(Context context, C1372630lp7 c1372630lp7);

    void LJJIJLIJ(C19EG c19eg, String str);

    TuxSheet LJJIL(Activity activity, C1106210etP c1106210etP, C498700Jh6 c498700Jh6, User user);

    TuxSheet LJJIZ(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5);

    void LJJJ(C1371590lnR c1371590lnR, C1369580lkC c1369580lkC, Context context, InterfaceC1362720lZ8 interfaceC1362720lZ8);

    C1371590lnR LJJJI(User user, Activity activity, String str, String str2);

    Aweme LJJJIL();

    EditProfileBadgeDialog LJJJJ(User user, Function0 function0);

    DialogC1372820lpQ LJJJJI(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5);

    LongPressShareListDialogForLiveHost LJJJJIZL(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5);

    boolean LJJJJJ(Aweme aweme);

    VideoDownloadFailedNoticeHelper LJJJJJL();

    void LJJJJL(Activity activity, C1372770lpL c1372770lpL);

    void LJJJJLI(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5);

    void LJJJJLL(Activity activity, long j);

    void LJJJJZ(C19EG c19eg, String str, String str2, Aweme aweme, List list, ShareInfo shareInfo, boolean z, String str3);

    void LJJJJZI(Aweme aweme, Set<String> set, String str, Activity activity);

    AwemeSharePackage LJJJLIIL(int i, Context context, Aweme aweme, String str, String str2, String str3);

    void LJJJLL(C19EG c19eg, ShareInfo shareInfo, String str, C1383010m5r c1383010m5r);

    DialogC1369990lkr LJJJLZIJ(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5);

    TuxSheet LJJJZ(Activity activity, C1372620lp6 c1372620lp6, C1389180mFo c1389180mFo, C1389190mFp c1389190mFp, String str);

    void LJJL(Activity activity, LiveEvent liveEvent, C1378520lyc c1378520lyc, InterfaceC634840OvC interfaceC634840OvC);

    C1375790luD LJJLI(Activity activity, Bundle bundle, Aweme aweme);

    void LJJLIIIIJ(Activity activity, C1372730lpH c1372730lpH);

    C1365280ldG LJJLIIIJ(C19EG c19eg, LifecycleOwner lifecycleOwner, Aweme aweme, CreateAwemeResponse createAwemeResponse, String[] strArr);

    void LJJLIIIJILLIZJL(C1371600lnS c1371600lnS, Activity activity, boolean z);

    void LJJLIIIJJI(Context context, C1372630lp7 c1372630lp7);

    void LJJLIIIJJIZ(WeakHandler weakHandler, C19EG c19eg, User user, List list, String str);

    void LJJLIIIJL(WeakHandler weakHandler, Activity activity, User user, List list, String str, String str2, Integer num);

    void LJJLIIIJLJLI();

    void LJJLIIIJLLLLLLLZ(C19EG c19eg, NewFaceStickerBean newFaceStickerBean, String str, List list, String str2, String str3);

    DialogC1369990lkr LJJLIIJ(C19EG c19eg, Fragment fragment, Aweme aweme, LandscapeFragmentPanel landscapeFragmentPanel, Bundle bundle);

    void LJJLIL(Context context, Aweme aweme, C0HTT c0htt, String str, String str2, String str3, String str4, Function0 function0, Function0 function02);

    void LJJLJ(Activity activity, String str, String str2);

    void openLiveEventInviteGuestPanel(Activity activity, String str, long j, GetLiveEventUserResponse getLiveEventUserResponse, MultiGuestLiveEvent multiGuestLiveEvent);

    void shareSubscribeLink(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5);
}
