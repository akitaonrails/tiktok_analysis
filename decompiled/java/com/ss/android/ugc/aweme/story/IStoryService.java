package com.ss.android.ugc.aweme.story;

import X.C0ROW;
import X.C0SPF;
import X.C0TRR;
import X.C0X12;
import X.C19EG;
import X.C2189821An6;
import X.C705930RmZ;
import X.EnumC1985807qC;
import X.InterfaceC1259230isD;
import X.InterfaceC1259300isK;
import X.InterfaceC1569000qvq;
import X.InterfaceC1588370rR5;
import X.InterfaceC1593650rZb;
import X.InterfaceC1597000rf0;
import X.InterfaceC1597970rgZ;
import X.InterfaceC1605350rsT;
import X.InterfaceC1618460sDc;
import X.InterfaceC2135708Yh;
import X.InterfaceC330760Cxu;
import X.InterfaceC438300HGq;
import X.InterfaceC438360HGw;
import X.InterfaceC665370Q7z;
import X.InterfaceC706770Rnv;
import X.InterfaceC718030SEn;
import X.InterfaceC721960STq;
import X.InterfaceC727710Sgb;
import X.InterfaceC728100ShE;
import X.InterfaceC729810Sjz;
import X.InterfaceC729970SkF;
import X.InterfaceC729990SkH;
import X.InterfaceC734870Ss9;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.story.api.IStoryFollowUpPublishService;
import com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService;
import com.ss.android.ugc.aweme.story.friends.IStoryFriendsService;
import com.ss.android.ugc.aweme.story.homepage.StoryHomepageService;
import com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.preload.v2.IStoryPreloaderV2;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes25.dex */
public interface IStoryService {
    boolean LIZ();

    InterfaceC2135708Yh LIZIZ(LifecycleOwner lifecycleOwner);

    boolean LJII();

    String LJIIIIZZ(Aweme aweme);

    void LJIIIZ();

    boolean LJIIJ(InterfaceC665370Q7z interfaceC665370Q7z);

    InterfaceC734870Ss9 LJIIJJI();

    void LJIIL(String str, User user, String str2, String str3, boolean z, int i, Integer num, Function2<? super String, ? super HashMap<String, String>, Boolean> function2, boolean z2);

    String LJIILIIL(Aweme aweme);

    boolean LJIILJJIL(String str);

    InterfaceC438300HGq LJIILL();

    IStoryFollowUpPublishService LJIILLIIL();

    void LJIIZILJ(int i);

    void LJIJ(int i, C19EG c19eg);

    void LJIJI(Aweme aweme);

    boolean LJIJJ(float f, float f2, List<? extends NormalTrackTimeStamp> list, C705930RmZ c705930RmZ, Context context, Fragment fragment);

    InterfaceC1618460sDc LJIJJLI();

    void LJIL();

    C0ROW LJJ();

    InterfaceC1259230isD LJJI();

    InterfaceC1593650rZb LJJIFFI();

    InterfaceC1259300isK LJJII();

    C0TRR LJJIII();

    InterfaceC706770Rnv LJJIIJ();

    boolean LJJIIJZLJL();

    void LJJIIZ(Aweme aweme, String str);

    IStoryInboxService LJJIIZI();

    void LJJIJ(InterfaceC665370Q7z interfaceC665370Q7z, String str);

    StoryMainTrackService LJJIJIIJI();

    InterfaceC718030SEn LJJIJIIJIL();

    InterfaceC1597970rgZ LJJIJIL();

    boolean LJJIJL(Fragment fragment, C2189821An6 c2189821An6, String str, String str2, EnumC1985807qC enumC1985807qC);

    InterfaceC729970SkF LJJIJLIJ();

    void LJJIL(AwS587S0100000_8 awS587S0100000_8);

    InterfaceC729990SkH LJJIZ();

    RectF LJJJ(InterfaceC665370Q7z interfaceC665370Q7z);

    boolean LJJJI(Aweme aweme);

    InterfaceC721960STq LJJJIL();

    IStoryRevealService LJJJJ();

    NetworkPartner LJJJJI();

    InterfaceC729810Sjz LJJJJIZL();

    <T extends C0X12> void LJJJJJ(String str, T t, Function1<? super T, ? extends List<? extends Aweme>> function1);

    InterfaceC1569000qvq LJJJJJL();

    boolean LJJJJL(InterfaceC665370Q7z interfaceC665370Q7z, Fragment fragment, MotionEvent motionEvent);

    void LJJJJLI(String str);

    boolean LJJJJLL();

    StoryHomepageService LJJJJZ();

    InterfaceC727710Sgb LJJJJZI(Context context);

    void LJJJLIIL();

    boolean LJJJLL();

    InterfaceC1605350rsT LJJJLZIJ();

    IStoryFriendsService LJJJZ();

    C0SPF LJJL(String str);

    IStoryPreloaderV2 LJJLI();

    void LJJLIIIIJ(InterfaceC665370Q7z interfaceC665370Q7z, boolean z);

    List LJJLIIIJ(int i, Aweme aweme);

    InterfaceC1597000rf0 LJJLIIIJILLIZJL();

    InterfaceC330760Cxu LJJLIIIJJI();

    InterfaceC1588370rR5 LJJLIIIJJIZ();

    InterfaceC438360HGw LJJLIIIJL();

    InterfaceC728100ShE LJJLIIIJLJLI();

    IStoryCelebrationService LJJLIIIJLLLLLLLZ();

    Bitmap LJJLIIJ(InterfaceC665370Q7z interfaceC665370Q7z);

    void clear();

    int getTag();
}
