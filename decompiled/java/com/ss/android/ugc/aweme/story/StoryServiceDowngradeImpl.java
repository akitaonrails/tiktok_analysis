package com.ss.android.ugc.aweme.story;

import X.C01GW;
import X.C0RMY;
import X.C0ROW;
import X.C0SPF;
import X.C0TRR;
import X.C0X12;
import X.C19EG;
import X.C2189821An6;
import X.C330800Cxy;
import X.C452501pT;
import X.C705930RmZ;
import X.C727640SgU;
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
import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.story.api.IStoryFollowUpPublishService;
import com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService;
import com.ss.android.ugc.aweme.story.friends.IStoryFriendsService;
import com.ss.android.ugc.aweme.story.homepage.StoryHomepageService;
import com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import com.ss.android.ugc.aweme.story.preload.v2.IStoryPreloaderV2;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import com.ss.android.ugc.aweme.story.setting.ui.color.ColorConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryServiceDowngradeImpl implements IStoryService {
    public int LIZJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(138));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(139));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(140));

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LIZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC2135708Yh LIZIZ(LifecycleOwner lifecycleOwner) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJII() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final String LJIIIIZZ(Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIIIZ() {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIIJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIIL(String str, User user, String str2, String str3, boolean z, int i, Integer num, Function2<? super String, ? super HashMap<String, String>, Boolean> function2, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final String LJIILIIL(Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIILJJIL(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryFollowUpPublishService LJIILLIIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIJ(int i, C19EG c19eg) {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIJI(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIJJ(float f, float f2, List<? extends NormalTrackTimeStamp> list, C705930RmZ c705930RmZ, Context context, Fragment fragment) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIL() {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1259230isD LJJI() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final C0TRR LJJIII() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJIIZ(Aweme aweme, String str) {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJIJ(InterfaceC665370Q7z interfaceC665370Q7z, String str) {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final StoryMainTrackService LJJIJIIJI() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC718030SEn LJJIJIIJIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJIJL(Fragment fragment, C2189821An6 c2189821An6, String str, String str2, EnumC1985807qC enumC1985807qC) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJIL(AwS587S0100000_8 awS587S0100000_8) {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC729990SkH LJJIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final RectF LJJJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJJI(Aweme aweme) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC721960STq LJJJIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryRevealService LJJJJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final NetworkPartner LJJJJI() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final <T extends C0X12> void LJJJJJ(String str, T t, Function1<? super T, ? extends List<? extends Aweme>> function1) {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJJJL(InterfaceC665370Q7z interfaceC665370Q7z, Fragment fragment, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJJJLI(String str) {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJJJLL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final StoryHomepageService LJJJJZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJJLIIL() {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJJLL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final C0SPF LJJL(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryPreloaderV2 LJJLI() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJLIIIIJ(InterfaceC665370Q7z interfaceC665370Q7z, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final List LJJLIIIJ(int i, Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1597000rf0 LJJLIIIJILLIZJL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final Bitmap LJJLIIJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void clear() {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC734870Ss9 LJIIJJI() {
        return new InterfaceC734870Ss9() { // from class: X.0SgS
            @Override // X.InterfaceC734870Ss9
            public final void LIZ(Aweme aweme) {
            }

            @Override // X.InterfaceC734870Ss9
            public final void LIZIZ(Context context, String str, boolean z, VideoPublishEditModel videoPublishEditModel, String str2, boolean z2, Function0<Unit> function0) {
            }

            @Override // X.InterfaceC734870Ss9
            public final void LIZLLL(Context context, Aweme aweme) {
            }

            @Override // X.InterfaceC734870Ss9
            public final int LJ(Context context) {
                return 0;
            }

            @Override // X.InterfaceC734870Ss9
            public final void LJFF(Context context) {
            }

            @Override // X.InterfaceC734870Ss9
            public final boolean LJI(Aweme aweme) {
                return false;
            }

            @Override // X.InterfaceC734870Ss9
            public final InterfaceC694390RLp LIZJ() {
                return new InterfaceC694390RLp() { // from class: X.0SgY
                    @Override // X.InterfaceC694390RLp
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC694390RLp
                    public final void LIZIZ(Aweme aweme, TuxIconView tuxIconView, String str) {
                    }

                    @Override // X.InterfaceC694390RLp
                    public final void LIZJ() {
                    }
                };
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC438300HGq LJIILL() {
        return new InterfaceC438300HGq() { // from class: X.0SgZ
            @Override // X.InterfaceC438300HGq
            public final List LIZ(int i, int i2, List list) {
                return C13BV.INSTANCE;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1618460sDc LJIJJLI() {
        return (InterfaceC1618460sDc) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final C0ROW LJJ() {
        return new C0ROW() { // from class: X.0RwC
            @Override // X.C0ROW
            public final void LIZ(Fragment fragment, C19EG c19eg) {
            }

            @Override // X.C0ROW
            public final void LIZIZ() {
            }

            @Override // X.C0ROW
            public final void LJ(Context context, Fragment fragment, String str) {
            }

            @Override // X.C0ROW
            public final void LJFF(Context context, EnumC706640Rni enumC706640Rni, Fragment fragment, String str) {
            }

            @Override // X.C0ROW
            public final <RECEIVER extends C03H5> void LJI(ReusedUISlotAssem<RECEIVER> reusedUISlotAssem, String str, boolean z, Function0<Unit> function0) {
            }

            @Override // X.C0ROW
            public final View LIZLLL(Context context, LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
                return new View(context);
            }

            @Override // X.C0ROW
            public final View LIZJ(String str, Context context, Fragment fragment, int i, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, boolean z2) {
                return new View(context);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1593650rZb LJJIFFI() {
        return new InterfaceC1593650rZb() { // from class: X.0SgP
            @Override // X.InterfaceC727980Sh2
            public final List<C0SPF> LIZ() {
                return null;
            }

            @Override // X.InterfaceC1593650rZb
            public final boolean LIZIZ(PublishModel publishModel) {
                return false;
            }

            @Override // X.InterfaceC1581360rFm
            public final void LIZJ() {
            }

            @Override // X.InterfaceC727980Sh2
            public final C729450SjP LIZLLL(String str) {
                return null;
            }

            @Override // X.InterfaceC1593650rZb
            public final InterfaceC1593660rZc LJ() {
                return null;
            }

            @Override // X.C0CWQ
            public final void LJI(String str, boolean z) {
            }

            @Override // X.InterfaceC1581360rFm
            public final void LJII(Object obj, InterfaceC729460SjQ interfaceC729460SjQ) {
            }

            @Override // X.InterfaceC1593650rZb
            public final boolean LJIIIIZZ() {
                return false;
            }

            @Override // X.InterfaceC727980Sh2
            public final C0SPF LJIIJ(String str) {
                return null;
            }

            @Override // X.C0CWQ
            public final void LJIIJJI(Context context, InterfaceC497601wk interfaceC497601wk) {
            }

            @Override // X.InterfaceC1581360rFm
            public final void LJIIL(String str) {
            }

            @Override // X.C0CWQ
            public final void LJIILIIL(String str) {
            }

            @Override // X.C0CWQ
            public final int LJIILJJIL(UserStory userStory) {
                return 0;
            }

            @Override // X.InterfaceC1581360rFm
            public final boolean isPublishing() {
                return false;
            }

            @Override // X.InterfaceC1441160nbe
            public final void updatePreviewCoverPath(String str, String str2) {
            }

            @Override // X.InterfaceC727980Sh2
            public final List<Aweme> LJIIIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC727980Sh2
            public final List<Aweme> LJIILL() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC1581360rFm
            public final EnumC696090RSd LJFF(String str) {
                return EnumC696090RSd.UPLOADING;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1259300isK LJJII() {
        return new InterfaceC1259300isK() { // from class: X.0Sga
            @Override // X.InterfaceC1259300isK
            public final void LIZ() {
            }

            @Override // X.InterfaceC1259300isK
            public final boolean LIZIZ() {
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC706770Rnv LJJIIJ() {
        return (C0RMY) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryInboxService LJJIIZI() {
        return new IStoryInboxService() { // from class: X.0rho
            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final boolean canShowStoryCell() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final void cancelPreloadTask() {
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final C1598870ri1 convertDayResponseToItem(OnThisDayResponse onThisDayResponse) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final Class<? extends PowerCell<? extends InterfaceC1891350zJl>>[] getOnThisDayCell() {
                return new Class[0];
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final InterfaceC1597940rgW getOnThisDayService() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final Class<? extends PowerCell<? extends InterfaceC1891350zJl>>[] getStoryCell() {
                return new Class[0];
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final Class<? extends PowerLoadingCell> getStoryFooterCell() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final C13IQ<? extends AbstractC738140SxQ> getStoryInboxPreloadComponent() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final C13IQ<? extends AbstractC738140SxQ> getStoryInboxPreloadComponentV2() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final void markColdStart() {
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final void preloadData() {
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final void preloadOnBoot() {
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final void registerStoryInnerPushHandler() {
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final void resetDataCenterStatus() {
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final void sendViewedMemorableView(String str) {
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final boolean shouldShowShootingEntrance(boolean z, boolean z2) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
            public final C11NZ<StoryGetFeedByPageResponse> fetchStoryItems(long j, long j2, String str, EnumC1596540reG enumC1596540reG, int i, String str2) {
                return C11IR.LL;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1597970rgZ LJJIJIL() {
        return new InterfaceC1597970rgZ() { // from class: X.0SgR
            @Override // X.InterfaceC1597970rgZ
            public final boolean LIZ(String str) {
                return false;
            }

            @Override // X.InterfaceC1597970rgZ
            public final void LIZIZ(int i, User user, String str) {
            }

            @Override // X.InterfaceC1597970rgZ
            public final void LIZJ(String str, String str2) {
            }

            @Override // X.InterfaceC1597970rgZ
            public final boolean LIZLLL() {
                return true;
            }

            @Override // X.InterfaceC1597970rgZ
            public final void LJ(int i, String str) {
            }

            @Override // X.InterfaceC1597970rgZ
            public final void LJFF(String str, String str2, EnumC1260930iux enumC1260930iux, User user, String str3, boolean z) {
            }

            @Override // X.InterfaceC1597970rgZ
            public final void LJII() {
            }

            @Override // X.InterfaceC1597970rgZ
            public final StoryGetFeedByPageResponse LJIIIIZZ(StoryGetFeedByPageResponse storyGetFeedByPageResponse) {
                return storyGetFeedByPageResponse;
            }

            @Override // X.InterfaceC1597970rgZ
            public final C09AE LJI(long j, Function0<Unit> function0) {
                return C23118094a.LIZ();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC729970SkF LJJIJLIJ() {
        return new InterfaceC729970SkF() { // from class: X.0SgO
            @Override // X.InterfaceC729970SkF
            public final C727830Sgn LIZ() {
                return new C727830Sgn(new ColorConfig(false, null, null, 0.0f), new ColorConfig(false, null, null, 0.0f), new ColorConfig(false, null, null, 0.0f), new ColorConfig(false, null, null, 0.0f));
            }

            @Override // X.InterfaceC729970SkF
            public final C727720Sgc LIZIZ() {
                return new C727720Sgc(new HashMap());
            }

            @Override // X.InterfaceC729970SkF
            public final LinearGradient LIZJ(Context context, float f, float f2) {
                return new LinearGradient(0.0f, 0.0f, f, f2, new int[0], new float[0], Shader.TileMode.CLAMP);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC729810Sjz LJJJJIZL() {
        return new InterfaceC729810Sjz() { // from class: X.0SgT
            @Override // X.InterfaceC729810Sjz
            public final void LIZ(View view, VideoPublishEditModel videoPublishEditModel, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1569000qvq LJJJJJL() {
        return new C727640SgU();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1605350rsT LJJJLZIJ() {
        return new InterfaceC1605350rsT() { // from class: X.0SgX
            @Override // X.InterfaceC1605350rsT
            public final float[] LIZ(String str) {
                return new float[0];
            }

            @Override // X.InterfaceC1605350rsT
            public final void LIZIZ(C427660Gpo c427660Gpo) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryFriendsService LJJJZ() {
        return new IStoryFriendsService() { // from class: X.0SgQ
            @Override // com.ss.android.ugc.aweme.story.friends.IStoryFriendsService
            public final Pair<C13IQ<? extends UISlotAssem>, C13IQ<? extends ReusedAssem<? extends C03H5>>> getFriendsDetailViewerEntranceAssem() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.story.friends.IStoryFriendsService
            public final C13IQ<? extends UIContentAssem> getToolBarAssem() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.story.friends.IStoryFriendsService
            public final InterfaceC1570900qyu newStoryToolBarViewGenerator() {
                return null;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC330760Cxu LJJLIIIJJI() {
        return (C330800Cxy) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1588370rR5 LJJLIIIJJIZ() {
        return new InterfaceC1588370rR5() { // from class: X.0SgV
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1588370rR5
            public final List<Aweme> LIZ(List<? extends Aweme> list) {
                return list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1588370rR5
            public final List<FollowFeed> LIZIZ(List<? extends FollowFeed> list) {
                return list;
            }

            @Override // X.InterfaceC1588370rR5
            public final List<FriendsFeed> LIZJ(List<FriendsFeed> list) {
                return list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1588370rR5
            public final List<Aweme> LIZLLL(List<? extends Aweme> list) {
                return list;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC438360HGw LJJLIIIJL() {
        return new InterfaceC438360HGw() { // from class: X.0S1E
            @Override // X.InterfaceC438360HGw
            public final boolean LIZ(Aweme aweme, boolean z, boolean z2, boolean z3) {
                return false;
            }

            @Override // X.InterfaceC438360HGw
            public final List<String> LIZIZ(Aweme aweme) {
                return null;
            }

            @Override // X.InterfaceC438360HGw
            public final View LIZJ(View view) {
                return null;
            }

            @Override // X.InterfaceC438360HGw
            public final void LJ(View view, Function0<Unit> function0, Function0<Unit> function02) {
            }

            @Override // X.InterfaceC438360HGw
            public final List<String> LJFF(Aweme aweme) {
                return null;
            }

            @Override // X.InterfaceC438360HGw
            public final List LIZLLL(LinearLayout linearLayout, String str, int i, AwS550S0100000_6 awS550S0100000_6, String str2, String str3, Integer num, String str4, AwS550S0100000_6 awS550S0100000_62) {
                return C13BV.INSTANCE;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC728100ShE LJJLIIIJLJLI() {
        return new InterfaceC728100ShE() { // from class: X.0S22
            @Override // X.InterfaceC728100ShE
            public final void LIZ(List list, String str, List list2, boolean z) {
            }

            @Override // X.InterfaceC728100ShE
            public final void LIZIZ(Aweme aweme, String str, boolean z) {
            }

            @Override // X.InterfaceC728100ShE
            public final void LIZJ(String str, String str2) {
            }

            @Override // X.InterfaceC728100ShE
            public final void LJ(String str, UserStory userStory) {
            }

            @Override // X.InterfaceC728100ShE
            public final void LJFF(FollowStatus followStatus) {
            }

            @Override // X.InterfaceC728100ShE
            public final void LJI(String str) {
            }

            @Override // X.InterfaceC728100ShE
            public final Aweme LJIIIZ(String str) {
                return null;
            }

            @Override // X.InterfaceC728100ShE
            public final void clear() {
            }

            @Override // X.InterfaceC728100ShE
            public final Aweme LJIIIIZZ() {
                Aweme aweme = new Aweme();
                aweme.setAid("");
                return aweme;
            }

            @Override // X.InterfaceC728100ShE
            public final C11NZ<Pair<Aweme, Integer>> LJII(String str) {
                return C11NZ.LJJJJZ(new Pair(new Aweme(), 20000));
            }

            @Override // X.InterfaceC728100ShE
            public final C11NZ<Aweme> LIZLLL(String str, boolean z) {
                return C11NZ.LJJJJZ(new Aweme());
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryCelebrationService LJJLIIIJLLLLLLLZ() {
        return new IStoryCelebrationService() { // from class: X.0rj0
            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final void clearKevaForDebug() {
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final List<ForwardMedia> convertAwemeToForwardMedia(List<? extends Aweme> list, int i, String str) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final void exitInboxStoryCelebrationEntrance(VideoPublishEditModel videoPublishEditModel) {
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final InterfaceC567940MPg getCelebrationConfigHandler() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final String getCelebrationEntranceUniqueId(TemplateData templateData) {
                return "";
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final C0CCZ getPreloadLegoTask() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final InterfaceC1597960rgY getStoryCelebrationPublishHandler() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final boolean isCelebrationExited(int i) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final boolean shouldShowCreationEntrance(SkylightData skylightData) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final InterfaceC1599360rio getStoryCelebrationCellInterception() {
                return new InterfaceC1599360rio() { // from class: X.0rj1
                    @Override // X.InterfaceC1599360rio
                    public final Map<String, String> LIZ() {
                        return null;
                    }

                    @Override // X.InterfaceC1599360rio
                    public final void LIZIZ(C1599370rip c1599370rip) {
                    }

                    @Override // X.InterfaceC1599360rio
                    public final void LIZJ(C1599370rip c1599370rip) {
                    }

                    @Override // X.InterfaceC1599360rio
                    public final boolean LIZLLL(C0MTL c0mtl) {
                        return false;
                    }

                    @Override // X.InterfaceC1599360rio
                    public final void LJ(C1599370rip c1599370rip, View view) {
                    }
                };
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final Map<String, Object> getStoryCelebrationRequestParam() {
                return new HashMap();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int getTag() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIIZILJ(int i) {
        this.LIZJ = i;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC727710Sgb LJJJJZI(Context context) {
        return new InterfaceC727710Sgb() { // from class: X.0SgW
            @Override // X.InterfaceC727710Sgb
            public final void LIZ(boolean z) {
            }

            @Override // X.InterfaceC727710Sgb
            public final void LIZIZ(AwS563S0100000_19 awS563S0100000_19, AwS563S0100000_19 awS563S0100000_192) {
            }
        };
    }
}
