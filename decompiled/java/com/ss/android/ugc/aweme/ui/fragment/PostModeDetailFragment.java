package com.ss.android.ugc.aweme.ui.fragment;

import X.AbstractC2361009My;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C09R3;
import X.C0AGZ;
import X.C0CNO;
import X.C0N0Y;
import X.C0QSJ;
import X.C0R52;
import X.C0SKD;
import X.C0SKE;
import X.C0SMF;
import X.C0SOM;
import X.C0SPG;
import X.C0SRI;
import X.C0SRL;
import X.C0SRN;
import X.C0SRO;
import X.C0SRU;
import X.C0SV8;
import X.C0SVN;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0ZP4;
import X.C1110604Wa;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1209980ham;
import X.C1210880hcE;
import X.C1220000hqw;
import X.C1344890l6N;
import X.C1345700l7g;
import X.C1347720lAw;
import X.C1350920lG6;
import X.C1365840leA;
import X.C1365870leD;
import X.C13LE;
import X.C1483410ohn;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C15WT;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1ER1;
import X.C20533215Wg;
import X.C21146717pB;
import X.C2183561Ad0;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C259160ADq;
import X.C277480AuA;
import X.C298410Bmp;
import X.C304280BwI;
import X.C338520DOw;
import X.C443950Haz;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C484220Iyq;
import X.C583640Muo;
import X.C616540OGe;
import X.C673150Qan;
import X.C687700QyG;
import X.C697110RWb;
import X.C720740SOy;
import X.C721090SQh;
import X.C721190SQr;
import X.C721210SQt;
import X.C721330SRf;
import X.C721640SSk;
import X.C723850SaN;
import X.C724750Sbp;
import X.C735370Ssx;
import X.C736680Sv4;
import X.C736950SvV;
import X.C737030Svd;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1341680l1C;
import X.EnumC310600CFm;
import X.EnumC721170SQp;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC469360Ias;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC716950SAj;
import X.InterfaceC719500SKe;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ARunnableS102S0100000_2;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS111S0100000_11;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.FullPageHostAbility;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IPostModeCommentActionBarAbility;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.PhotoCacheModel;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.profile.model.CollectAwemeEvent;
import com.ss.android.ugc.aweme.scope.PostModeDetailScope;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.ui.util.PostModeMockBaseListFragmentPanel;
import com.ss.android.ugc.aweme.ui.util.StayTimeFragmentComponent;
import com.ss.android.ugc.aweme.ui.view.PostModeActionBarComponentV2;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeCommentViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeFavoriteViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeShareViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeTimeLoggerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS26S0001000_11;
import kotlin.jvm.internal.AwS33S0310000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModeDetailFragment extends CommonPageFragment implements InterfaceC724530SbT, FullPageHostAbility, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjAlZykhHELIOSKSIhLCEnZhUjOjseJyEpDSonKSwgDz0yLygpJzs=";
    public LinearLayout LL;
    public FrameLayout LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public PostModeMockBaseListFragmentPanel LLILZIL;
    public StayTimeFragmentComponent LLILZLL;
    public ARunnableS111S0100000_11 LLIZLLLIL;
    public C0SRL LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C736950SvV LLJILLL;
    public final AssemVMLazy LLJJ;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public C0SPG LLJJIJIIJIL;
    public PostModeActionBarComponentV2 LLJJIJIL;
    public C0SRI LLJJJ;
    public C0N0Y LLJJJIL;
    public C583640Muo LLJJJJ;
    public PostModeCommentListFragmentV2 LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public HashMap<String, Long> LLJL;
    public final C721210SQt LLJLIL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1092));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1093));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1090));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1086));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PostModeDetailFragment.class, "photoViewModel", "getPhotoViewModel()Lcom/ss/android/ugc/aweme/ui/feed/photos/PostModeFullPageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PostModeDetailFragment.class, "diggViewModel", "getDiggViewModel()Lcom/ss/android/ugc/aweme/viewmodel/PostDiggViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PostModeDetailFragment.class, "commentViewModel", "getCommentViewModel()Lcom/ss/android/ugc/aweme/viewmodel/PostModeCommentViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(PostModeDetailFragment.class, "favoriteViewModel", "getFavoriteViewModel()Lcom/ss/android/ugc/aweme/viewmodel/PostModeFavoriteViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(PostModeDetailFragment.class, "shareViewModel", "getShareViewModel()Lcom/ss/android/ugc/aweme/viewmodel/PostModeShareViewModel;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PostModeDetailScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PostModeDetailScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PostModeDetailScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final PostModePageViewModel DR() {
        return (PostModePageViewModel) this.LLIZ.getValue();
    }

    public final void LLLLLLLLLL() {
        PostModeDetailParams postModeDetailParams;
        C721640SSk c721640SSk = C721640SSk.LIZ;
        C0SRL c0srl = this.LLJILJIL;
        PostModeDetailParams postModeDetailParams2 = c0srl != null ? c0srl.LJII : null;
        c721640SSk.getClass();
        if (C721640SSk.LJIILJJIL(postModeDetailParams2)) {
            C736680Sv4.LJIJJLI(VR(), new AwS590S0100000_11(this, 304));
            return;
        }
        T value = DR().LLILZLL.getValue();
        if (value == EnumC721170SQp.SWIPE_DOWN) {
            return;
        }
        C0SRL c0srl2 = this.LLJILJIL;
        if (((c0srl2 == null || (postModeDetailParams = c0srl2.LJII) == null || postModeDetailParams.enableGestureExit) && (value == EnumC721170SQp.SLIDE_RIGHT || value == EnumC721170SQp.PULL_DOWN)) || value == EnumC721170SQp.BACK || value == EnumC721170SQp.TAP_PHOTO) {
            return;
        }
        if (value == EnumC721170SQp.PULL_UP) {
            getPlayerManager().LJJL();
        } else {
            C736680Sv4.LJIJJLI(VR(), new AwS590S0100000_11(this, 305));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[PHI: r7
      0x0047: PHI (r7v3 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:20:0x0045, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5 A[PHI: r7
      0x00c5: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:20:0x0045, B:22:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0Muo, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NR() {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment.NR():void");
    }

    public final PostDiggViewModel RR() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (PostDiggViewModel) assemVMLazy.getValue();
    }

    public final PostModeTimeLoggerViewModel SJ() {
        return (PostModeTimeLoggerViewModel) this.LLJ.getValue();
    }

    public final PostModeFavoriteViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (PostModeFavoriteViewModel) assemVMLazy.getValue();
    }

    public final PhotoSharedViewModel UR() {
        return (PhotoSharedViewModel) this.LLJILLL.getValue();
    }

    public final PostModeFullPageViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (PostModeFullPageViewModel) assemVMLazy.getValue();
    }

    public final boolean WR() {
        return ((Boolean) this.LLJIJIL.getValue()).booleanValue();
    }

    public final C0N0Y getPlayerManager() {
        C0N0Y c0n0y = this.LLJJJIL;
        return c0n0y == null ? C1483410ohn.LJLJJI() : c0n0y;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [X.0SQt] */
    public PostModeDetailFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PostModeFullPageViewModel.class);
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(c19719912DlLIZ, 1098);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(540);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJILJILJ = new AssemVMLazy(function0LJIIJ, awS555S0100000_11, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 1083), aFwS243S0000000_11);
        this.LLJILLL = new C736950SvV(C13LE.LIZ(PhotoSharedViewModel.class), new AwS555S0100000_11((Fragment) this, 1461), c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(641), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PostDiggViewModel.class);
        this.LLJJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), new AwS555S0100000_11(c19719912DlLIZ2, 1084), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 1085), AFwS243S0000000_11.get$arr$(536));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PostModeCommentViewModel.class);
        this.LLJJI = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), new AwS555S0100000_11(c19719912DlLIZ3, 1087), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 1089), AFwS243S0000000_11.get$arr$(537));
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(PostModeFavoriteViewModel.class);
        this.LLJJIII = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), new AwS555S0100000_11(c19719912DlLIZ4, 1094), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 1095), AFwS243S0000000_11.get$arr$(538));
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(PostModeShareViewModel.class);
        this.LLJJIJI = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), new AwS555S0100000_11(c19719912DlLIZ5, 1096), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 1097), AFwS243S0000000_11.get$arr$(539));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1091));
        this.LLJLIL = new AbstractC2361009My() { // from class: X.0SQt
            /* JADX WARN: Removed duplicated region for block: B:108:0x018f  */
            @Override // X.AbstractC2361009My
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.Map<java.lang.String, java.lang.String> mobExtraParams() {
                /*
                    Method dump skipped, instruction units count: 410
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C721210SQt.mobExtraParams():java.util.Map");
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.15WT] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.09Gk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void PR() {
        Aweme aweme;
        PostModeDetailParams postModeDetailParams;
        String str;
        String str2;
        HashMap<String, String> map;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
        C721190SQr c721190SQr = C721190SQr.LIZ;
        C0SRL c0srl = this.LLJILJIL;
        if (c0srl != null) {
            aweme = c0srl.LIZJ;
            postModeDetailParams = c0srl.LJII;
        } else {
            aweme = null;
            postModeDetailParams = null;
        }
        Context context = getContext();
        ?? LIZIZ = context != null ? C960203pA.LIZIZ(context) : 0;
        HashMap<String, Long> map2 = this.LLJL;
        c721190SQr.getClass();
        ?? c2344009Gk = new C2344009Gk();
        C721190SQr.LIZJ(c2344009Gk, postModeDetailParams);
        C721190SQr.LIZIZ(c2344009Gk, aweme);
        C721190SQr.LJIIJ(c2344009Gk, aweme);
        c2344009Gk.LJ(Long.valueOf(jCurrentTimeMillis), "duration");
        C721190SQr.LIZ(c2344009Gk, aweme);
        C721190SQr.LJ(c2344009Gk, aweme);
        C721190SQr.LIZLLL(c721190SQr, c2344009Gk);
        C721190SQr.LJFF(c2344009Gk, aweme);
        C721190SQr.LJII(c2344009Gk, aweme);
        C721190SQr.LJIIIZ(c2344009Gk, aweme);
        C721190SQr.LJI(c2344009Gk, aweme);
        C721190SQr.LJIIL(c2344009Gk, aweme);
        c2344009Gk.LJI(C735370Ssx.LJJI(aweme));
        if (postModeDetailParams != null && (map = postModeDetailParams.displayTitleParams) != null) {
            c2344009Gk.LJI(map);
        }
        c2344009Gk.LIZJ(LIZIZ, "dark_mode_flag");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C721190SQr.LJIILJJIL(aweme));
        sbLIZ.append("");
        c2344009Gk.LJFF("no_hashtag_description_length", C2188811AlT.LIZIZ(sbLIZ));
        if (map2 != null) {
            for (Map.Entry<String, Long> entry : map2.entrySet()) {
                c2344009Gk.LIZLLL(entry.getValue().longValue(), entry.getKey());
            }
        }
        c2344009Gk.LJII(C1ER1.LIZIZ.I(aweme, postModeDetailParams != null ? postModeDetailParams.eventType : null));
        ?? r2 = C15WT.LIZIZ;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
            str2 = postModeDetailParams.exploreFromGroupId;
        } else {
            str = null;
            str2 = null;
        }
        r2.LJFF(c2344009Gk, str, str2, aweme != null ? aweme.getAid() : null);
        C721190SQr.LJJI(new ARunnableS103S0100000_3((Object) c2344009Gk, 29));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r0.isRemoving() == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ZR() {
        /*
            r3 = this;
            X.19EG r0 = r3.getActivity()
            r2 = 1
            if (r0 == 0) goto L38
            X.19EG r0 = r3.requireActivity()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L38
            X.19EG r0 = r3.requireActivity()
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L38
            boolean r0 = r3.isVisible()
            if (r0 == 0) goto L38
            android.view.View r1 = r3.getView()
            if (r1 == 0) goto L39
            X.0SRj r0 = X.C0SRX.LJLILLLLZI
            r0.getClass()
            com.ss.android.ugc.aweme.ui.fragment.PostModeDetailRootFragment r0 = X.C721370SRj.LIZ(r1)
            if (r0 == 0) goto L39
            boolean r0 = r0.isRemoving()
            if (r0 != r2) goto L39
        L38:
            return r2
        L39:
            android.view.View r1 = r3.getView()
            if (r1 == 0) goto L51
            X.0SRj r0 = X.C0SRX.LJLILLLLZI
            r0.getClass()
            com.ss.android.ugc.aweme.ui.fragment.PostModeDetailRootFragment r0 = X.C721370SRj.LIZ(r1)
            if (r0 == 0) goto L51
            boolean r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIIZILJ(r0)
            if (r0 != r2) goto L51
            return r2
        L51:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment.ZR():boolean");
    }

    public final void bS() {
        String str;
        PostModeDetailParams postModeDetailParams;
        IScreenshotService iScreenshotService = (IScreenshotService) ServiceManager.get().getService(IScreenshotService.class);
        C0SRL c0srl = this.LLJILJIL;
        if (c0srl == null || (postModeDetailParams = c0srl.LJII) == null || (str = postModeDetailParams.previousPage) == null) {
            str = "";
        }
        iScreenshotService.LJI(str, this.LLJLIL);
    }

    public final InterfaceC716950SAj getRealPageViewPagerLis() {
        if (WR()) {
            PostModeCommentListFragmentV2 postModeCommentListFragmentV2 = this.LLJJJJJIL;
            if (postModeCommentListFragmentV2 != null) {
                return postModeCommentListFragmentV2.getRealPageViewPagerLis();
            }
            return null;
        }
        C0SRI c0sri = this.LLJJJ;
        if (c0sri != null) {
            return c0sri.getRealPageViewPagerLis();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Unit unit;
        InterfaceC665370Q7z interfaceC665370Q7zLJIJJLI;
        super.onDestroy();
        this.LLJJIJIIJIL = null;
        C0SRI c0sri = this.LLJJJ;
        if (c0sri != null) {
            c0sri.onDestroy();
        }
        this.LLJJJ = null;
        if (C1344890l6N.LIZIZ() && (interfaceC665370Q7zLJIJJLI = C1345700l7g.LJIJJLI(this)) != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJIJJLI, IPostModeCommentActionBarAbility.class, null);
        }
        this.LLJJIJIL = null;
        if (C304280BwI.LIZLLL() || C304280BwI.LIZJ()) {
            SJ().LLILZ = null;
            getPlayerManager().LJJIJ(null);
        }
        if (((Boolean) C277480AuA.LIZ.getValue()).booleanValue() && this.LLILZIL != null) {
            getPlayerManager().LJJJI(null);
        }
        C583640Muo c583640Muo = this.LLJJJJ;
        if (c583640Muo != null) {
            try {
                C0N0Y c0n0y = this.LLJJJIL;
                if (c0n0y != null) {
                    c0n0y.LJIIL(c583640Muo);
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            this.LLJJJJ = null;
        }
        this.LLJILJIL = null;
        this.LLJJJIL = null;
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), FullPageHostAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        String str;
        Aweme aweme;
        PostModePageViewModel postModePageViewModel;
        MutableLiveData mutableLiveData;
        PostModeDetailParams postModeDetailParams;
        super.onPause();
        ARunnableS111S0100000_11 aRunnableS111S0100000_11 = this.LLIZLLLIL;
        PostModeDetailParams postModeDetailParams2 = null;
        if (aRunnableS111S0100000_11 != null) {
            View view = getView();
            if (view != null) {
                HandlerHook.viewRemoveCallbacks(view, aRunnableS111S0100000_11);
            }
            this.LLIZLLLIL = null;
        }
        LLLLLLLLLL();
        cS(false);
        PR();
        IScreenshotService iScreenshotService = (IScreenshotService) ServiceManager.get().getService(IScreenshotService.class);
        C0SRL c0srl = this.LLJILJIL;
        if (c0srl == null || (postModeDetailParams = c0srl.LJII) == null || (str = postModeDetailParams.previousPage) == null) {
            str = "";
        }
        iScreenshotService.LIZJ(str);
        this.LLJJL = false;
        C0SRL c0srl2 = this.LLJILJIL;
        if (c0srl2 == null || (postModePageViewModel = c0srl2.LJIIIIZZ) == null || (mutableLiveData = postModePageViewModel.LLILZLL) == null || mutableLiveData.getValue() == 0) {
            PostModeTimeLoggerViewModel postModeTimeLoggerViewModelSJ = SJ();
            C0SRL c0srl3 = this.LLJILJIL;
            if (c0srl3 != null) {
                aweme = c0srl3.LIZJ;
                postModeDetailParams2 = c0srl3.LJII;
            } else {
                aweme = null;
            }
            postModeTimeLoggerViewModelSJ.xQ2(aweme, postModeDetailParams2);
        }
        VR().LLILLJJLI.LIZIZ(VR().AQ2(), EnumC310600CFm.EXIT_FULL_PAGE);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Aweme aweme;
        String str;
        PostModeDetailParams postModeDetailParams;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(PostModeDetailFragment.class.getName());
        }
        super.onResume();
        C0SRL c0srl = this.LLJILJIL;
        PostModeDetailParams postModeDetailParams2 = c0srl != null ? c0srl.LJII : null;
        if (((Boolean) C259160ADq.LIZ.getValue()).booleanValue()) {
            if ((postModeDetailParams2 != null ? postModeDetailParams2.postModeEntranceMechanism : null) == PostModeEntranceMechanism.EXPLORE_CARD && !this.LLJJJJLIIL && isResumed() && this.LLILZ == 0) {
                C736680Sv4.LJIJJLI(VR(), new AwS590S0100000_11(this, 373));
            }
        }
        long jLongValue = ((Number) C0AGZ.LIZ.getValue()).longValue();
        if (jLongValue > 0) {
            ARunnableS111S0100000_11 aRunnableS111S0100000_11 = this.LLIZLLLIL;
            if (aRunnableS111S0100000_11 == null) {
                aRunnableS111S0100000_11 = new ARunnableS111S0100000_11(this, 60);
                this.LLIZLLLIL = aRunnableS111S0100000_11;
            }
            View view = getView();
            if (view != null) {
                HandlerHook.viewPostDelay(view, aRunnableS111S0100000_11, jLongValue);
            }
        } else {
            gS(false);
        }
        this.LLILLL = System.currentTimeMillis();
        IScreenshotService iScreenshotService = (IScreenshotService) PluggableExtentionKt.pluggableSpi$default(IScreenshotService.class, false, false, false, 14, null);
        if (iScreenshotService != null) {
            C0SRL c0srl2 = this.LLJILJIL;
            if (c0srl2 == null || (postModeDetailParams = c0srl2.LJII) == null || (str = postModeDetailParams.previousPage) == null) {
                str = "";
            }
            iScreenshotService.LIZJ(str);
        }
        bS();
        C0SRL c0srl3 = this.LLJILJIL;
        if (c0srl3 == null || (aweme = c0srl3.LIZJ) == null) {
            return;
        }
        PostDiggViewModel postDiggViewModelRR = RR();
        postDiggViewModelRR.LLIZLLLIL = aweme;
        postDiggViewModelRR.setState(new AwS377S0200000_11(postDiggViewModelRR, aweme, 96));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.FullPageHostAbility
    public final C0SRL AR1() {
        return this.LLJILJIL;
    }

    public static String iS(PostModeDetailParams postModeDetailParams) {
        String value;
        if (postModeDetailParams != null) {
            if (C0SKE.LIZ(postModeDetailParams)) {
                PostModeEntranceMechanism postModeEntranceMechanism = postModeDetailParams.postModeEntranceMechanism;
                if (postModeEntranceMechanism != null) {
                    int i = C0SKD.LIZ[postModeEntranceMechanism.ordinal()];
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            if (i != 4) {
                                if (postModeEntranceMechanism != null && (value = postModeEntranceMechanism.getValue()) != null) {
                                    return value;
                                }
                            } else {
                                return "nearby";
                            }
                        } else {
                            return "search";
                        }
                    } else {
                        return "explore";
                    }
                }
                return "other";
            }
            String str = postModeDetailParams.eventType;
            if (str != null) {
                return str;
            }
            return "default";
        }
        return "default";
    }

    public static final void performPause(PostModeDetailFragment postModeDetailFragment) {
        PostModeDetailParams postModeDetailParams;
        C0SRL c0srl;
        boolean zIsFinishing;
        C0SRL c0srl2 = postModeDetailFragment.LLJILJIL;
        if (c0srl2 != null) {
            postModeDetailParams = c0srl2.LJII;
        } else {
            postModeDetailParams = null;
        }
        if (C0SKE.LIZ(postModeDetailParams) && (c0srl = postModeDetailFragment.LLJILJIL) != null) {
            SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = c0srl.LJIILLIIL();
            if (sAFTikTokFragmentLJIILLIIL != null) {
                zIsFinishing = sAFTikTokFragmentLJIILLIIL.isRemoving();
            } else {
                zIsFinishing = c0srl.LIZIZ.isFinishing();
            }
            if (zIsFinishing) {
                postModeDetailFragment.getPlayerManager().LJJL();
                return;
            }
        }
        postModeDetailFragment.getPlayerManager().LIZ();
    }

    @Override // X.InterfaceC716950SAj
    public final void K5(C0SMF c0smf) {
        InterfaceC716950SAj realPageViewPagerLis = getRealPageViewPagerLis();
        if (realPageViewPagerLis != null) {
            realPageViewPagerLis.K5(c0smf);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void LLJJI(InterfaceC469360Ias interfaceC469360Ias) {
        InterfaceC716950SAj realPageViewPagerLis = getRealPageViewPagerLis();
        if (realPageViewPagerLis != null) {
            realPageViewPagerLis.LLJJI(interfaceC469360Ias);
        }
    }

    public final void OR(boolean z) {
        Aweme aweme;
        String aid;
        Aweme aweme2;
        C2183561Ad0 c2183561Ad0;
        if (ZR()) {
            return;
        }
        PostModeFavoriteViewModel postModeFavoriteViewModelSR = SR();
        C0SRL c0srl = this.LLJILJIL;
        View viewFindViewById = null;
        if (c0srl != null) {
            aweme = c0srl.LIZJ;
        } else {
            aweme = null;
        }
        postModeFavoriteViewModelSR.vQ2(aweme);
        PostModeActionBarComponentV2 postModeActionBarComponentV2 = this.LLJJIJIL;
        if (postModeActionBarComponentV2 != null && (c2183561Ad0 = postModeActionBarComponentV2.LLJ) != null) {
            c2183561Ad0.n0(z);
        }
        if (!z || this.LLJILJIL == null) {
            return;
        }
        IFavoriteService iFavoriteService = (IFavoriteService) ServiceManager.get().getService(IFavoriteService.class);
        if (!C298410Bmp.LIZ()) {
            C19EG c19egRequireActivity = requireActivity();
            C0SRL c0srl2 = this.LLJILJIL;
            if (c0srl2 == null || (aweme2 = c0srl2.LIZJ) == null || (aid = aweme2.getAid()) == null) {
                aid = "";
            }
            View view = this.LL;
            if (view == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.ccd);
                }
                this.LL = (LinearLayout) viewFindViewById;
                view = viewFindViewById;
            }
            iFavoriteService.LJJJI(c19egRequireActivity, aid, "graphic_detail", view);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void Qt(InterfaceC719500SKe interfaceC719500SKe) {
        InterfaceC716950SAj realPageViewPagerLis = getRealPageViewPagerLis();
        if (realPageViewPagerLis != null) {
            realPageViewPagerLis.Qt(interfaceC719500SKe);
        }
    }

    public final void aS(boolean z) {
        C0SRL c0srl;
        ViewGroup viewGroupLJIIIZ;
        C0SOM c0som;
        C0SOM c0somLJFF;
        C721640SSk c721640SSk = C721640SSk.LIZ;
        C0SRL c0srl2 = this.LLJILJIL;
        PostModeDetailParams postModeDetailParams = null;
        if (c0srl2 != null) {
            postModeDetailParams = c0srl2.LJII;
        }
        c721640SSk.getClass();
        if (C721640SSk.LJIILJJIL(postModeDetailParams)) {
            EnumC721170SQp enumC721170SQp = EnumC721170SQp.DRAG_FROM_PAGE;
            if (z) {
                enumC721170SQp = EnumC721170SQp.PULL_DOWN;
            }
            DR().vQ2(enumC721170SQp);
            return;
        }
        C0SRL c0srl3 = this.LLJILJIL;
        if ((c0srl3 != null && (c0somLJFF = c0srl3.LJFF()) != null && c0somLJFF.getSwipedRightAtFirstPosition()) || ((c0srl = this.LLJILJIL) != null && (viewGroupLJIIIZ = c0srl.LJIIIZ()) != null && (c0som = (C0SOM) viewGroupLJIIIZ.findViewById(R.id.qey)) != null && c0som.getSwipedRightAtFirstPosition())) {
            DR().vQ2(EnumC721170SQp.SLIDE_RIGHT_FROM_IMAGE);
        } else {
            DR().vQ2(EnumC721170SQp.SLIDE_RIGHT);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void b3(InterfaceC469360Ias interfaceC469360Ias) {
        InterfaceC716950SAj realPageViewPagerLis = getRealPageViewPagerLis();
        if (realPageViewPagerLis != null) {
            realPageViewPagerLis.b3(interfaceC469360Ias);
        }
    }

    public final void cS(boolean z) {
        double d;
        Aweme aweme;
        PostModeDetailParams postModeDetailParams;
        String str;
        String str2;
        Aweme aweme2;
        PostModeDetailParams postModeDetailParams2;
        if (this.LLJJL) {
            return;
        }
        this.LLJJL = true;
        int i = DR().LLLIL;
        int i2 = DR().LLLILZ;
        if (i > 0) {
            if (z) {
                d = 1.0d;
            } else {
                d = ((double) i2) / ((double) i);
            }
            String aid = null;
            if (i > 0) {
                C721190SQr c721190SQr = C721190SQr.LIZ;
                C0SRL c0srl = this.LLJILJIL;
                if (c0srl != null) {
                    aweme2 = c0srl.LIZJ;
                    postModeDetailParams2 = c0srl.LJII;
                } else {
                    aweme2 = null;
                    postModeDetailParams2 = null;
                }
                C721190SQr.LJIILL(c721190SQr, "graphic_detail_finish_rate", aweme2, postModeDetailParams2, Integer.valueOf(VR().LLILZ), Double.valueOf(d), null, null, 0, 3784);
            }
            if (d >= 1.0d) {
                C721190SQr c721190SQr2 = C721190SQr.LIZ;
                C0SRL c0srl2 = this.LLJILJIL;
                if (c0srl2 != null) {
                    aweme = c0srl2.LIZJ;
                    postModeDetailParams = c0srl2.LJII;
                } else {
                    aweme = null;
                    postModeDetailParams = null;
                }
                Integer numValueOf = Integer.valueOf(VR().LLILZ);
                c721190SQr2.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                C721190SQr.LIZJ(c2344009Gk, postModeDetailParams);
                C721190SQr.LJ(c2344009Gk, aweme);
                C721190SQr.LJIIJ(c2344009Gk, aweme);
                C721190SQr.LJIIJJI(c2344009Gk, numValueOf);
                C721190SQr.LIZLLL(c721190SQr2, c2344009Gk);
                C721190SQr.LJFF(c2344009Gk, aweme);
                C721190SQr.LIZIZ(c2344009Gk, aweme);
                C721190SQr.LJII(c2344009Gk, aweme);
                C721190SQr.LIZ(c2344009Gk, aweme);
                C721190SQr.LJIIIZ(c2344009Gk, aweme);
                C721190SQr.LJI(c2344009Gk, aweme);
                C721190SQr.LJIIL(c2344009Gk, aweme);
                C15WT c15wt = C15WT.LIZIZ;
                if (postModeDetailParams != null) {
                    str = postModeDetailParams.eventType;
                    str2 = postModeDetailParams.exploreFromGroupId;
                } else {
                    str = null;
                    str2 = null;
                }
                if (aweme != null) {
                    aid = aweme.getAid();
                }
                c15wt.LJFF(c2344009Gk, str, str2, aid);
                C721190SQr.LJJI(new ARunnableS102S0100000_2(c2344009Gk, 17));
            }
        }
    }

    public final void gS(boolean z) {
        PostModeDetailParams postModeDetailParams;
        C0SRL c0srl = this.LLJILJIL;
        Aweme aweme = null;
        if (c0srl != null) {
            postModeDetailParams = c0srl.LJII;
            aweme = c0srl.LIZJ;
        } else {
            postModeDetailParams = null;
        }
        C736680Sv4.LJIJJLI(VR(), new AwS33S0310000_11(z, this, aweme, postModeDetailParams, 0));
    }

    @C14EU(priority = 1)
    public final void onAddVideoToMixEvent(C0SRN c0srn) {
        Context contextRequireActivity;
        if (c0srn.LIZ != null && !ZR()) {
            EventBus.LIZLLL().LIZIZ(c0srn);
            C720740SOy c720740SOy = C720740SOy.LIZ;
            Aweme aweme = c0srn.LIZ;
            if (aweme != null) {
                C0SRL c0srl = this.LLJILJIL;
                if (c0srl == null || (contextRequireActivity = c0srl.LIZLLL()) == null) {
                    contextRequireActivity = requireActivity();
                }
                C19EG c19egRequireActivity = requireActivity();
                c720740SOy.getClass();
                ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIIJZLJL(new C0SRU(aweme, contextRequireActivity, c19egRequireActivity));
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        C723850SaN.LIZ(this, false, null, new AwS590S0100000_11(this, 303), 3);
        C721090SQh.LIZ.LIZLLL(UR().LLILZIL, UR().LLILLJJLI, "fragment_attach", Boolean.valueOf(UR().LLJILLL));
    }

    @C14EU
    public final void onAwemeDeleteEvent(C1210880hcE c1210880hcE) {
        if (ZR()) {
            return;
        }
        DR().vQ2(EnumC721170SQp.NOT_INTERESTED);
    }

    @C14EU
    public final void onCollectAwemeEvent(CollectAwemeEvent collectAwemeEvent) {
        if (collectAwemeEvent == null) {
            return;
        }
        boolean z = true;
        if (collectAwemeEvent.action != 1) {
            z = false;
        }
        OR(z);
    }

    @C14EU
    public final void onCommentEvent(C1209980ham c1209980ham) {
        AwemeStatistics statistics;
        Long lValueOf;
        if (c1209980ham != null && !ZR()) {
            int i = c1209980ham.LIZ;
            if (i == 3 || i == 4) {
                AssemVMLazy assemVMLazy = this.LLJJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
                PostModeCommentViewModel postModeCommentViewModel = (PostModeCommentViewModel) assemVMLazy.getValue();
                Aweme aweme = c1209980ham.LIZJ;
                if (aweme != null && (statistics = aweme.getStatistics()) != null && (lValueOf = Long.valueOf(statistics.getCommentCount())) != null) {
                    lValueOf.longValue();
                }
                postModeCommentViewModel.setState(new AwS590S0100000_11(postModeCommentViewModel, 402));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        HashMap<String, String> map;
        PostModeDetailParams postModeDetailParams;
        super.onCreate(bundle);
        VR().LLJIJIL = new AwS555S0100000_11(this, 1088);
        VideoItemParams videoItemParams = UR().LL;
        if (videoItemParams != null) {
            PostModeFullPageViewModel postModeFullPageViewModelVR = VR();
            C0SRL c0srl = this.LLJILJIL;
            if (c0srl != null && (postModeDetailParams = c0srl.LJII) != null) {
                map = postModeDetailParams.displayTitleParams;
            } else {
                map = null;
            }
            postModeFullPageViewModelVR.FQ2(videoItemParams);
            postModeFullPageViewModelVR.LL.LJIILLIIL = map;
            postModeFullPageViewModelVR.LLJJJJ = true;
            postModeFullPageViewModelVR.LLIZLLLIL = System.currentTimeMillis();
            postModeFullPageViewModelVR.LLJ = -1L;
        }
        C721090SQh.LIZ.LIZLLL(UR().LLILZIL, UR().LLILLJJLI, "fragment_create", Boolean.valueOf(UR().LLJILLL));
    }

    @C14EU
    public final void onEvent(C1365870leD c1365870leD) {
        Aweme aweme;
        if (!ZR() && TextUtils.equals("aweme_photo", c1365870leD.LIZLLL)) {
            C0R52 c0r52 = new C0R52((BottomToastVM) ViewModelProviders.of(this).get(BottomToastVM.class));
            C0SRL c0srl = this.LLJILJIL;
            if (c0srl != null) {
                aweme = c0srl.LIZJ;
            } else {
                aweme = null;
            }
            C1365840leA.LIZLLL(c1365870leD, c0r52, 0L, aweme);
            C0CNO.LIZLLL(0L, AFwS198S0000000_11.get$arr$(237));
        }
    }

    @C14EU
    public final void onFeedDislikeEventEvent(C721330SRf c721330SRf) {
        if (!ZR() && C1110604Wa.LIZ() != 1 && C1110604Wa.LIZ() != 3) {
            DR().vQ2(EnumC721170SQp.NOT_INTERESTED);
        }
    }

    @C14EU
    public final void onInnerAddPhoto(C0SVN c0svn) {
        PostModeActionBarComponentV2 postModeActionBarComponentV2;
        Integer num;
        boolean z;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        CommentCommonModel commonModel3;
        if (c0svn != null && Intrinsics.LJFF(c0svn.LJ, "graphic_detail") && (postModeActionBarComponentV2 = this.LLJJIJIL) != null) {
            Integer numValueOf = Integer.valueOf(c0svn.LJFF);
            CommentContextSource commentContextSource = postModeActionBarComponentV2.LLJIJIL;
            if (commentContextSource != null && (commonModel3 = commentContextSource.getCommonModel()) != null) {
                num = commonModel3.panelSessionCode;
            } else {
                num = null;
            }
            if (Intrinsics.LJFF(numValueOf, num)) {
                CommentContextSource commentContextSource2 = postModeActionBarComponentV2.LLJIJIL;
                if (commentContextSource2 != null && (commonModel2 = commentContextSource2.getCommonModel()) != null) {
                    commonModel2.setChoosePhotoFromInnerPage(true);
                }
                CommentContextSource commentContextSource3 = postModeActionBarComponentV2.LLJIJIL;
                if (commentContextSource3 != null && (commonModel = commentContextSource3.getCommonModel()) != null) {
                    Intent intent = c0svn.LIZ;
                    int i = c0svn.LIZJ;
                    commonModel.setInnerChoosePhotoCache(new PhotoCacheModel(intent, i, i, c0svn.LIZLLL, c0svn.LJ, c0svn.LJFF));
                }
                PostModeActionBarComponentV2.LJIIZILJ(postModeActionBarComponentV2, EnumC1341680l1C.PHOTO, null, null, null, 14);
                String strEnterFrom = CommentContextSourceKt.enterFrom(postModeActionBarComponentV2.LLJIJIL);
                Aweme aweme = CommentContextSourceKt.aweme(postModeActionBarComponentV2.LLJIJIL);
                if (postModeActionBarComponentV2.LLJILJILJ != null) {
                    z = true;
                } else {
                    z = false;
                }
                C1350920lG6.LJJLIIIJJI(strEnterFrom, aweme, true, z, false, C1347720lAw.LJIILL(null));
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        Aweme aweme;
        boolean zIsFinishing;
        String string;
        String string2;
        String string3;
        try {
            if (TextUtils.equals("videoReportSuccess", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
                String string4 = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"), "object_id");
                C0SRL c0srl = this.LLJILJIL;
                String aid = null;
                if (c0srl != null) {
                    aweme = c0srl.LIZJ;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    }
                } else {
                    aweme = null;
                }
                if (TextUtils.equals(aid, string4)) {
                    if (aweme != null) {
                        Boolean bool = Boolean.TRUE;
                        Context context = getContext();
                        if (context == null || (string = context.getString(2131846337)) == null) {
                            string = "";
                        }
                        Context context2 = getContext();
                        if (context2 == null || (string2 = context2.getString(2131846335)) == null) {
                            string2 = "";
                        }
                        Context context3 = getContext();
                        if (context3 == null || (string3 = context3.getString(2131846336)) == null) {
                            string3 = "";
                        }
                        aweme.setReportMaskInfo(new VideoMaskInfo(bool, 1, 1, null, null, string, string2, string3, null));
                    }
                    ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
                }
                C0SRL c0srl2 = this.LLJILJIL;
                if (c0srl2 != null) {
                    SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = c0srl2.LJIILLIIL();
                    if (sAFTikTokFragmentLJIILLIIL != null) {
                        zIsFinishing = sAFTikTokFragmentLJIILLIIL.isRemoving();
                    } else {
                        zIsFinishing = c0srl2.LIZIZ.isFinishing();
                    }
                    if (!zIsFinishing) {
                        VR().setState(new AwS26S0001000_11(9));
                        DR().vQ2(EnumC721170SQp.REPORT);
                    }
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @C14EU(priority = 1)
    public final void onRemoveVideoToMixEvent(C0SRO c0sro) {
        if (c0sro.LIZ != null && !ZR() && this.LLJILJIL != null) {
            EventBus.LIZLLL().LIZIZ(c0sro);
            C720740SOy c720740SOy = C720740SOy.LIZ;
            Aweme aweme = c0sro.LIZ;
            if (aweme != null) {
                C19EG c19egRequireActivity = requireActivity();
                C0SRL c0srl = this.LLJILJIL;
                if (c0srl != null) {
                    c720740SOy.getClass();
                    ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIII(c19egRequireActivity, aweme, new C0SV8(c0srl), "graphic_detail", "long_press");
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @C14EU
    public final void onUseStickerSet(C443950Haz c443950Haz) {
        StickerSetInfo stickerSetInfo;
        Integer num;
        View view;
        if (c443950Haz != null && (stickerSetInfo = c443950Haz.LIZ) != null && (num = stickerSetInfo.stickerType) != null && num.intValue() != 5 && (view = getView()) != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS111S0100000_11(this, 61), 150L);
        }
    }

    @C14EU
    public final void onVideoDiggUpdate(C737030Svd c737030Svd) {
        String str;
        C0SRL c0srl;
        Aweme aweme;
        PostModeDetailParams postModeDetailParams;
        C0SRL c0srl2 = this.LLJILJIL;
        if (c0srl2 != null && (postModeDetailParams = c0srl2.LJII) != null) {
            str = postModeDetailParams.enterMethod;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "homepage_explore") && c737030Svd != null && (c0srl = this.LLJILJIL) != null && (aweme = c0srl.LIZJ) != null && c737030Svd.LIZ == 13 && Intrinsics.LJFF(c737030Svd.LIZIZ, aweme.getAid())) {
            PostDiggViewModel postDiggViewModelRR = RR();
            postDiggViewModelRR.LLIZLLLIL = aweme;
            postDiggViewModelRR.setState(new AwS377S0200000_11(postDiggViewModelRR, aweme, 96));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/ui/fragment/PostModeDetailFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+hLZnc3TW46sRM1u+N6dTvPz+FEwVLNiQIPvFoaammFFs=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        StayTimeFragmentComponent stayTimeFragmentComponent = this.LLILZLL;
        if (stayTimeFragmentComponent != null) {
            stayTimeFragmentComponent.LLILZ = z;
            if (z) {
                stayTimeFragmentComponent.LLILLL = System.currentTimeMillis();
            } else {
                stayTimeFragmentComponent.LIZ();
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(PostModeDetailFragment.class);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void tj(C0SMF c0smf) {
        InterfaceC716950SAj realPageViewPagerLis = getRealPageViewPagerLis();
        if (realPageViewPagerLis != null) {
            realPageViewPagerLis.tj(c0smf);
        }
    }

    @C14EU
    public final void videoEvent(C737030Svd c737030Svd) {
        Aweme aweme;
        if (c737030Svd == null || c737030Svd.LIZ != 54) {
            return;
        }
        Object obj = c737030Svd.LIZIZ;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            OR(AwemeExtKt.isCollected(aweme));
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void x6(InterfaceC719500SKe interfaceC719500SKe) {
        InterfaceC716950SAj realPageViewPagerLis = getRealPageViewPagerLis();
        if (realPageViewPagerLis != null) {
            realPageViewPagerLis.x6(interfaceC719500SKe);
        }
    }

    @C14EU
    public final void onEvent(C697110RWb c697110RWb) {
        C0SRL c0srl;
        Aweme aweme;
        AwemeStatus statusSafety;
        int privateStatus;
        if (!ZR() && c697110RWb.LIZIZ != null && (c0srl = this.LLJILJIL) != null && (aweme = c0srl.LIZJ) != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null) {
            AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(c697110RWb.LIZIZ);
            if (statusSafety2 != null) {
                privateStatus = statusSafety2.getPrivateStatus();
            } else {
                privateStatus = 0;
            }
            statusSafety.setPrivateStatus(privateStatus);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x024b A[PHI: r3
      0x024b: PHI (r3v7 android.view.View) = (r3v6 android.view.View), (r3v45 android.view.View) binds: [B:64:0x0235, B:69:0x0249] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r70, android.os.Bundle r71) {
        /*
            Method dump skipped, instruction units count: 1366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View viewTd;
        if (WR()) {
            i = R.layout.e_5;
        } else {
            i = R.layout.e_4;
        }
        Context context = layoutInflater.getContext();
        if (context != null) {
            viewTd = C21146717pB.LIZIZ(context, i, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        }
        C721090SQh.LIZ.LIZLLL(UR().LLILZIL, UR().LLILLJJLI, "fragment_create_view", Boolean.valueOf(UR().LLJILLL));
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    public static final void hS(PostModeDetailParams postModeDetailParams, Aweme aweme, String str, Function1<? super JSONObject, Unit> function1) {
        JSONObject jSONObject;
        C721090SQh.LIZ.getClass();
        if (!C721090SQh.LIZ(postModeDetailParams)) {
            return;
        }
        if (function1 != null) {
            jSONObject = new JSONObject();
            function1.invoke(jSONObject);
        } else {
            jSONObject = null;
        }
        C721090SQh.LIZIZ(postModeDetailParams, aweme, "resume_player", str, jSONObject);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    public static void dS(PostModeDetailParams postModeDetailParams, Aweme aweme, String str, String str2, AtomicBoolean atomicBoolean, String str3, String str4) throws JSONException {
        int i = 0;
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        if (str4 != null && str4.length() != 0 && (Intrinsics.LJFF(str4, str) || (str2.length() > 0 && Intrinsics.LJFF(str4, str2)))) {
            i = 1;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("player_source_id", str4);
        jSONObject.put("player_source_id_match", i);
        C721090SQh.LIZ.getClass();
        C721090SQh.LIZIZ(postModeDetailParams, aweme, "player_render_first_frame", str3, jSONObject);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
