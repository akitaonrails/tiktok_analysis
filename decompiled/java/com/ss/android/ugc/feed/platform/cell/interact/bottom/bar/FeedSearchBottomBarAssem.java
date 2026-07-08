package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C019F;
import X.C01GW;
import X.C04SM;
import X.C07CT;
import X.C098200Yq;
import X.C09R3;
import X.C0A90;
import X.C0HHT;
import X.C0PEM;
import X.C0QE4;
import X.C0QFY;
import X.C0QQ9;
import X.C0RJN;
import X.C0SI6;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1200530hLX;
import X.C1225704qt;
import X.C123100dR;
import X.C127G;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1807670x8n;
import X.C1821107Bh;
import X.C189200o6;
import X.C19719912Dl;
import X.C1CRC;
import X.C1DFK;
import X.C1ER1;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2230281CQw;
import X.C2296808zG;
import X.C23118094a;
import X.C2371409Qy;
import X.C2399609ak;
import X.C259800zU;
import X.C266490AcR;
import X.C301480Brm;
import X.C452501pT;
import X.C687700QyG;
import X.C688170Qz1;
import X.C688190Qz3;
import X.C688270QzB;
import X.C688290QzD;
import X.C688300QzE;
import X.C688330QzH;
import X.C688350QzJ;
import X.C688400QzO;
import X.C688420QzQ;
import X.C688430QzR;
import X.C688440QzS;
import X.C688490QzX;
import X.C690870R8b;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C739870T0n;
import X.C786410Ut5;
import X.EnumC667230QFd;
import X.EnumC688370QzL;
import X.EnumC688390QzN;
import X.InterfaceC1146704e9;
import X.InterfaceC1294060jmO;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC688340QzI;
import X.InterfaceC718610SGt;
import X.InterfaceC737790Swr;
import Y.AObjectS63S0000000_10;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.experiment.FeedBarAheadConfig;
import com.ss.android.ugc.aweme.feed.experiment.FeedBarSmartConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.search.Image;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.model.RichSugInfo;
import com.ss.android.ugc.aweme.search.model.SearchFeedbackSuggestWordMeta;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.viewmodel.ITakoFeedRightBottomEntranceViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class FeedSearchBottomBarAssem extends BaseCellSlotComponent<FeedSearchBottomBarAssem> implements FeedBarSearchAbility, FcpStandardPreloadProtocol, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLZLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final FeedSearchBottomBarAssem LLJLLL;
    public ViewGroup LLJZ;
    public TuxTextView LLJZIJLIL;
    public ViewGroup LLL;
    public ViewGroup LLLF;
    public ViewGroup LLLFF;
    public TuxTextView LLLFFI;
    public TuxIconView LLLFZ;
    public TuxTextView LLLI;
    public SmartImageView LLLII;
    public ViewGroup LLLIIII;
    public TuxTextView LLLIIIIL;
    public String LLLIIIL;
    public long LLLIIL;
    public boolean LLLIILIL;
    public float LLLIL;
    public float LLLILZ;
    public int LLLILZJ;
    public boolean LLLILZLLLI;
    public long LLLIZZ;
    public boolean LLLJ;
    public int LLLJIL;
    public long LLLJL;
    public C1DFK LLLL;
    public final String LLLLII;
    public final C01GW LLLLIIIILLL;
    public final InterfaceC1731706qJ LLLLIIL;
    public C688190Qz3 LLLLIILL;
    public EnumC688390QzN LLLLIILLL;
    public boolean LLLLIL;
    public final boolean LLLLILI;
    public final boolean LLLLJ;
    public final int LLLLJI;
    public final int LLLLL;
    public final boolean LLLLLIL;
    public boolean LLLLLILLIL;
    public boolean LLLLLJIL;
    public Float LLLLLJLJLL;
    public Float LLLLLL;
    public boolean LLLLLLIL;
    public Integer LLLLLLJ;
    public boolean LLLLLLL;
    public boolean LLLLLLLLL;
    public Boolean LLLLLLLLLL;
    public long LLLLLLLZIL;
    public long LLLLLLZ;
    public EnumC688370QzL LLLLLLZZ;
    public final C01GW LLLLLZ;
    public final C01GW LLLLLZIL;
    public final C01GW LLLLLZL;
    public final C01GW LLLLZ;
    public IPhotoSlidesAbility LLLLZI;
    public IPhotoSlidesEventDispatchAbility LLLLZIL;
    public C688430QzR LLLLZLL;
    public final C688270QzB LLLLZLLIL;
    public C0QFY LLLLZLLLI;
    public boolean LLLZ;
    public final C01GW LLLZI;
    public final FeedSearchBottomBarAssem$descExpandModeProtocol$1 LLLZIIL;
    public volatile InterfaceC688340QzI LLLZIL;
    public C127G LLLZL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedSearchBottomBarAssem.class, "rightBottomViewModel", "getRightBottomViewModel()Lcom/ss/android/ugc/aweme/tako/otherpage/feed/mainentrance/viewmodel/ITakoFeedRightBottomEntranceViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FeedSearchBottomBarAssem.class, "videoSearchCacheVM", "getVideoSearchCacheVM()Lcom/ss/android/ugc/feed/platform/cell/interact/bottom/bar/VideoSearchCacheVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(FeedSearchBottomBarAssem.class, "recommendReasonUtils", "getRecommendReasonUtils()Lcom/ss/android/ugc/aweme/search/passive/feedbar/recommendreason/communication/SearchFeedbarRecommendAbility;", 0);
        c09r3.getClass();
        LLLZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    /* JADX WARN: Type inference failed for: r0v56, types: [com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem$descExpandModeProtocol$1] */
    public FeedSearchBottomBarAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ITakoFeedRightBottomEntranceViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 911), null, AFwS241S0000000_10.get$arr$(386));
        this.LLJLLL = this;
        this.LLLIIIL = "";
        this.LLLILZLLLI = true;
        this.LLLJ = true;
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        this.LLLL = c1dfkLIZ;
        C2296808zG.LIZ(C0PEM.LIZ.plus(c1dfkLIZ));
        this.LLLLII = "feedbar_ahead";
        this.LLLLIIIILLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS241S0000000_10.get$arr$(388));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VideoSearchCacheVM.class);
        this.LLLLIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS554S0100000_10((C13IQ) c19719912DlLIZ2, 912), null, AFwS241S0000000_10.get$arr$(387));
        this.LLLLIILL = new C688190Qz3();
        this.LLLLIILLL = EnumC688390QzN.NONE;
        C688490QzX.LIZ.getClass();
        C01GW c01gw = C688490QzX.LIZJ;
        this.LLLLILI = ((FeedBarAheadConfig) c01gw.getValue()).enableAheadPrefetch;
        C688440QzS.LIZ.getClass();
        C01GW c01gw2 = C688440QzS.LIZJ;
        this.LLLLJ = ((FeedBarSmartConfig) c01gw2.getValue()).enableSmartPrefetch;
        this.LLLLJI = ((FeedBarSmartConfig) c01gw2.getValue()).playProgress;
        this.LLLLL = ((FeedBarAheadConfig) c01gw.getValue()).playProgress;
        this.LLLLLIL = ((Boolean) C0A90.LIZ.getValue()).booleanValue();
        this.LLLLLLLZIL = -1L;
        this.LLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS241S0000000_10.get$arr$(389));
        this.LLLLLZIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS241S0000000_10.get$arr$(390));
        this.LLLLLZL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 913));
        this.LLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 909));
        this.LLLLZLLIL = new C688270QzB();
        this.LLLZI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(356));
        this.LLLZIIL = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem$descExpandModeProtocol$1
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b5h;
    }

    public final InterfaceC688340QzI Qp() {
        InterfaceC688340QzI interfaceC688340QzI = this.LLLZIL;
        if (interfaceC688340QzI == null) {
            synchronized (this) {
                interfaceC688340QzI = this.LLLZIL;
                if (interfaceC688340QzI == null) {
                    InterfaceC688340QzI interfaceC688340QzI2 = (InterfaceC688340QzI) C1807670x8n.LLZLLLL();
                    this.LLLZIL = interfaceC688340QzI2;
                    return interfaceC688340QzI2;
                }
            }
        }
        return interfaceC688340QzI;
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final void TD() {
        TextView textView;
        this.LLLLLLIL = false;
        VideoSearchCacheVM videoSearchCacheVMUp = Up();
        C724270Sb3 c724270Sb3 = this.LLJI;
        int iWQ2 = videoSearchCacheVMUp.wQ2(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid());
        if (((Number) C266490AcR.LIZ.getValue()).intValue() == 2 && iWQ2 != 0 && Ep()) {
            VideoSearchCacheVM videoSearchCacheVMUp2 = Up();
            C724270Sb3 c724270Sb32 = this.LLJI;
            videoSearchCacheVMUp2.LLILLJJLI.put(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid(), 0);
            this.LLLLIILL.LIZLLL(0);
            ViewGroup viewGroup = this.LLJZ;
            if (viewGroup == null || (textView = (TextView) viewGroup.findViewById(R.id.ubf)) == null) {
                return;
            }
            textView.setText(new SpannableStringBuilder().append((CharSequence) this.LLLLIILL.LJIIJ).append((CharSequence) this.LLLLIILL.LIZJ));
        }
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final void g2() {
        this.LLLLLLLLLL = null;
        aq();
        dq();
        this.LLLLLLLZIL = -1L;
        this.LLLLLLZ = 0L;
        this.LLLLLLZZ = null;
        C688400QzO.LIZ();
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ip() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1205224947) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, InterfaceC718610SGt> so1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final void IE1() {
        if (this.LLLLZLLIL.LIZ) {
            C688290QzD c688290QzD = C688290QzD.LIZ;
            String str = this.LLLLIILL.LIZLLL;
            c688290QzD.getClass();
            C688290QzD.LJIILIIL(str);
        }
    }

    public final boolean Ip() {
        ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
        if (iSearchService == null) {
            return false;
        }
        Context context = getContext();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        C724270Sb3 c724270Sb32 = this.LLJI;
        return iSearchService.j0(context, aweme, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType, EnumC667230QFd.SEARCH_FEED_BAR, false, false);
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final C0QE4 Og0() {
        View viewFindViewById;
        String imprId;
        String aid;
        LogPbBean logPbBean;
        ViewGroup viewGroup = this.LLJZ;
        if (viewGroup == null || (viewFindViewById = viewGroup.findViewById(R.id.ubf)) == null || !viewFindViewById.isShown()) {
            return null;
        }
        String str = this.LLLLIILL.LIZJ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        String str2 = "";
        if (aweme == null || (logPbBean = aweme.getLogPbBean()) == null || (imprId = logPbBean.getImprId()) == null) {
            imprId = "";
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        Aweme aweme2 = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme();
        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
            str2 = aid;
        }
        return new C0QE4(str, imprId, str2);
    }

    public final VideoPlayViewModel Tp() {
        return (VideoPlayViewModel) this.LLLLIIIILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final boolean Tq1() {
        TuxTextView tuxTextView = this.LLJZIJLIL;
        return C0SI6.LIZIZ(tuxTextView != null ? tuxTextView.getLayout() : null);
    }

    public final VideoSearchCacheVM Up() {
        return (VideoSearchCacheVM) this.LLLLIIL.getValue(this, LLLZLL[1]);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Vp() {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem.Vp():boolean");
    }

    public final boolean Xp() {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (!this.LLLLLJIL) {
            return false;
        }
        if (this.LLLLIILLL != EnumC688390QzN.RECOMMEND_REASON) {
            if (this.LLLLLLLLL) {
                return false;
            }
            C688290QzD c688290QzD = C688290QzD.LIZ;
            C724270Sb3 c724270Sb3 = this.LLJI;
            String str = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType;
            c688290QzD.getClass();
            if (!C688290QzD.LJI().enabledEnterFromList.contains(str)) {
                return false;
            }
            if (C688290QzD.LJI().enabledForAdStartHub != 1) {
                C724270Sb3 c724270Sb32 = this.LLJI;
                Aweme aweme = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme();
                if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.isEnableAdStarHub()) {
                    return false;
                }
            }
        }
        if (this.LLLLLLLLLL == null) {
            C724270Sb3 c724270Sb33 = this.LLJI;
            Aweme aweme2 = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme();
            String aid = aweme2 != null ? aweme2.getAid() : null;
            if (C123100dR.LIZ(aid)) {
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLLLZ.getValue();
                if (Intrinsics.LJFF(aid, iFeedPanelPlatformAbility != null ? iFeedPanelPlatformAbility.xy2() : null)) {
                    this.LLLLLLLLLL = Boolean.TRUE;
                }
            }
        }
        return Intrinsics.LJFF(this.LLLLLLLLLL, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> Yr2() {
        return C2097908Jt.LIZJ(new Pair(FeedSearchBottomBarPreload.class, new AwS554S0100000_10(this, 910)));
    }

    public final void aq() {
        TuxTextView tuxTextView = this.LLLIIIIL;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, 0.0f);
        }
        TuxTextView tuxTextView2 = this.LLLIIIIL;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
        TuxIconView tuxIconView = this.LLLFZ;
        if (tuxIconView != null) {
            C786410Ut5.x5(tuxIconView, 1.0f);
        }
        TuxIconView tuxIconView2 = this.LLLFZ;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final List<SearchFeedbackSuggestWordMeta> ar() {
        View viewFindViewById;
        String imprId;
        ViewGroup viewGroup = this.LLJZ;
        if (viewGroup == null || (viewFindViewById = viewGroup.findViewById(R.id.ubf)) == null || !viewFindViewById.isShown()) {
            return null;
        }
        String str = this.LLLLIILL.LIZJ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        LogPbBean logPbBean = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getLogPbBean();
        if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
            imprId = "";
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        String aid = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        return Collections.singletonList(new SearchFeedbackSuggestWordMeta(str, "related_search_anchor_v2", imprId, aid, null, null, null, null));
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final Boolean iL0() {
        SmartImageView smartImageView = this.LLLII;
        if (smartImageView != null) {
            return Boolean.valueOf(smartImageView.getVisibility() == 0);
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
        C688170Qz1 c688170Qz1 = FeedSearchBottomBarAssemTrigger.LLJLLIL;
        C688190Qz3 c688190Qz3 = this.LLLLIILL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        c688170Qz1.getClass();
        boolean z = C688170Qz1.LIZIZ(c688190Qz3, aweme) && !Intrinsics.LJFF("1", this.LLLLIILL.LJI);
        if (((Number) C04SM.LIZ.getValue()).intValue() != 0 || z) {
            super.mo();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x026d  */
    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pw2() {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem.pw2():void");
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final boolean u62() {
        EnumC688390QzN enumC688390QzN = this.LLLLIILLL;
        if (enumC688390QzN == EnumC688390QzN.TEXT_END_ICON) {
            return true;
        }
        return enumC688390QzN == EnumC688390QzN.RECOMMEND_REASON && this.LLLLZLLIL.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final Boolean zm0() {
        TuxTextView tuxTextView = this.LLLI;
        if (tuxTextView != null) {
            return Boolean.valueOf(tuxTextView.getVisibility() == 0);
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.Co();
        C688420QzQ.LIZIZ.LIZ(System.currentTimeMillis() - jCurrentTimeMillis, "create_view");
    }

    public final boolean Ep() {
        return (this.LLLLIILL.LIZ.size() < 2 || this.LLLLIILL.LIZJ() || (C301480Brm.LIZ() && this.LLLLZLLIL.LIZ)) ? false : true;
    }

    public final boolean Wp() {
        C0RJN c0rjnLIZIZ;
        C690870R8b c690870R8bJm = jm();
        return C07CT.LIZ((c690870R8bJm == null || (c0rjnLIZIZ = c690870R8bJm.LIZIZ()) == null) ? null : c0rjnLIZIZ.LIZJ);
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final int YY0() {
        VideoSearchCacheVM videoSearchCacheVMUp = Up();
        C724270Sb3 c724270Sb3 = this.LLJI;
        return videoSearchCacheVMUp.wQ2(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        C688400QzO.LIZ();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        C688400QzO.LIZ();
    }

    public final void dq() {
        if (C688300QzE.LIZIZ() && this.LLLLZLLIL.LIZLLL) {
            InterfaceC688340QzI.LIZ.getClass();
            jq(C688330QzH.LJ, this.LLLLIILL);
        }
        if (C301480Brm.LIZ() && this.LLLLIILLL == EnumC688390QzN.RECOMMEND_REASON) {
            InterfaceC688340QzI interfaceC688340QzIQp = Qp();
            WordStruct wordStruct = this.LLLLIILL.LIZIZ;
            C724270Sb3 c724270Sb3 = this.LLJI;
            C688350QzJ c688350QzJLIZIZ = interfaceC688340QzIQp.LIZIZ(wordStruct, false, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
            if (c688350QzJLIZIZ.LIZ) {
                return;
            }
            C688190Qz3 c688190Qz3 = this.LLLLIILL;
            C724270Sb3 c724270Sb32 = this.LLJI;
            iq(c688350QzJLIZIZ, c688190Qz3, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme());
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLZL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLZL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ITakoFeedRightBottomEntranceViewModel.class, new AObjectS63S0000000_10(this, 0)}, defaultViewModelProviderFactory);
                    this.LLLZL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FcpStandardPreloadProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), DescExpandModeProtocol.class, C1697810uHb.LJIILJJIL(this.LLLZIIL));
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        C688430QzR c688430QzR = this.LLLLZLL;
        if (c688430QzR != null) {
            IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility = this.LLLLZIL;
            if (iPhotoSlidesEventDispatchAbility != null) {
                iPhotoSlidesEventDispatchAbility.IL1(c688430QzR);
            }
            this.LLLLZLL = null;
        }
        this.LLLLZI = null;
        this.LLLLZIL = null;
        this.LLLLLLL = false;
        this.LLLLLLLLL = false;
        this.LLLLLLLLLL = null;
        this.LLLLLLLZIL = -1L;
        this.LLLLLLZ = 0L;
        this.LLLLLLZZ = null;
        aq();
        dq();
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final C0QFY Cc1() {
        return this.LLLLZLLLI;
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final C688270QzB Vx() {
        return this.LLLLZLLIL;
    }

    public final void Bp(boolean z) {
        Context context;
        C1CRC c1crc;
        C1CRC c1crc2;
        ViewGroup viewGroup = this.LLJZ;
        C1CRC c1crc3 = null;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        if (this.LLJZ != null && context != null) {
            String resourceEntryName = context.getResources().getResourceEntryName(R.id.sat);
            String resourceEntryName2 = context.getResources().getResourceEntryName(R.id.saw);
            String resourceEntryName3 = context.getResources().getResourceEntryName(R.id.u9z);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parent.width-12dp-");
            sbLIZ.append(resourceEntryName);
            sbLIZ.append(".width-");
            sbLIZ.append(resourceEntryName2);
            sbLIZ.append(".width-");
            sbLIZ.append(resourceEntryName3);
            sbLIZ.append(".width-12dp");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (z) {
                ViewGroup viewGroup2 = this.LLLFF;
                if (viewGroup2 != null) {
                    ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                    if ((layoutParams instanceof C1CRC) && (c1crc2 = (C1CRC) layoutParams) != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("min(wrap_content, ");
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append(')');
                        c1crc2.LJI = C2230281CQw.LIZ(context, C2188811AlT.LIZIZ(sbLIZ2), "feedSearchLabelContainer");
                        c1crc3 = c1crc2;
                    }
                    C786410Ut5.X5(c1crc3, viewGroup2);
                }
            } else {
                ViewGroup viewGroup3 = this.LLLFF;
                if (viewGroup3 != null) {
                    ViewGroup.LayoutParams layoutParams2 = viewGroup3.getLayoutParams();
                    if ((layoutParams2 instanceof C1CRC) && (c1crc = (C1CRC) layoutParams2) != null) {
                        c1crc.LJI = C2230281CQw.LIZ(context, strLIZIZ, "feedSearchLabelContainer");
                        c1crc3 = c1crc;
                    }
                    C786410Ut5.X5(c1crc3, viewGroup3);
                }
            }
            TuxTextView tuxTextView = this.LLJZIJLIL;
            if (tuxTextView != null) {
                tuxTextView.requestLayout();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        if (this.LLLLLLL) {
            this.LLLLLLL = false;
            fq(EnumC688370QzL.BACK_FROM_AUTHOR_PROFILE_PAGE);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).unbindAbility(this.LLJLLL, FeedBarSearchAbility.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fq(X.EnumC688370QzL r12) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem.fq(X.0QzL):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCommentListPageDialogPopUpEvent(C739870T0n c739870T0n) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(((VideoItemParams) obj).getAweme().getAid(), c739870T0n.LIZJ) && c739870T0n.LIZ == 0) {
            pw2();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSARIntentionEvent(C0QQ9 c0qq9) {
        Object obj;
        String str = c0qq9.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(str, ((VideoItemParams) obj).getAweme().getAid())) {
            this.LLLLLLIL = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x02a2 A[PHI: r10
      0x02a2: PHI (r10v1 boolean) = (r10v0 boolean), (r10v3 boolean) binds: [B:47:0x0276, B:58:0x02a0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).bindAbility(this.LLJLLL, FeedBarSearchAbility.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x0537, code lost:
    
        if ((!r2.isEmpty()) == true) goto L221;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0122  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r23) {
        /*
            Method dump skipped, instruction units count: 2371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem.up(java.lang.Object):void");
    }

    public final void Fp(VideoItemParams videoItemParams, C688190Qz3 c688190Qz3) {
        Context context;
        this.LLLIIL = System.currentTimeMillis();
        C1ER1 c1er1 = C1ER1.LIZIZ;
        c1er1.z(c688190Qz3.LIZJ);
        ViewGroup viewGroup = this.LLJZ;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        c1er1.LLLIIIIL(context, Jp(videoItemParams, c688190Qz3));
    }

    public final void Gp(VideoItemParams videoItemParams, C688190Qz3 c688190Qz3) {
        Context context;
        C1ER1 c1er1 = C1ER1.LIZIZ;
        ViewGroup viewGroup = this.LLJZ;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        c1er1.v(context, this.LLLLII, Jp(videoItemParams, c688190Qz3));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    @InterfaceC1294060jmO
    public final void J1(int i, Aweme aweme) {
        this.LLLLLLLLLL = Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, com.google.gson.n] */
    public final Bundle Jp(VideoItemParams videoItemParams, C688190Qz3 c688190Qz3) throws JSONException {
        String tabName;
        ?? r9;
        String strLIZJ;
        boolean z;
        Type type;
        LinkedHashMap linkedHashMap;
        Map<String, String> mapLJLJL;
        List<String> urlList;
        String imprId;
        C2189821An6 c2189821An6;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("in_single_stack", "true", bundle);
        C786410Ut5.LJJJI("keyword", c688190Qz3.LIZJ, bundle);
        boolean z2 = true;
        bundle.putBoolean("set_hint_by_sug_word", true);
        C786410Ut5.LJJJI("is_feed_liked", String.valueOf(videoItemParams.getAweme().isLike()), bundle);
        C786410Ut5.LJJJI("is_feed_collected", String.valueOf(AwemeExtKt.isCollected(videoItemParams.getAweme())), bundle);
        C786410Ut5.LJJJI("is_feed_comment_clicked", String.valueOf(AwemeBizExtKt.isCommentClicked(videoItemParams.getAweme())), bundle);
        C786410Ut5.LJJJI("is_feed_forward_clicked", String.valueOf(AwemeBizExtKt.isForwardClicked(videoItemParams.getAweme())), bundle);
        C786410Ut5.LJJJI("search_position", videoItemParams.mEventType, bundle);
        String str = "1";
        C786410Ut5.LJJJI("back_flag", "1", bundle);
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        String str2 = null;
        if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
            tabName = c2189821An6.getTabName();
        } else {
            tabName = null;
        }
        C786410Ut5.LJJJI("tab_name", tabName, bundle);
        String strLIZLLL = C1200530hLX.LIZLLL(Boolean.valueOf(c688190Qz3.LIZJ()));
        if (strLIZLLL == null) {
            strLIZLLL = CardStruct.IStatusCode.DEFAULT;
        }
        C786410Ut5.LJJJI("is_from_sensitive_words", strLIZLLL, bundle);
        LogPbBean logPbBean = videoItemParams.getAweme().getLogPbBean();
        if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
            C786410Ut5.LJJJI("preClickImprId", imprId, bundle);
        }
        if (!C1ER1.LIZIZ.LLIIIILZ(videoItemParams.mEventType)) {
            C786410Ut5.LJJJI("is_from_video", "1", bundle);
        }
        C786410Ut5.LJJJI("group_id", videoItemParams.getAweme().getAid(), bundle);
        C786410Ut5.LJJJI("enter_from", videoItemParams.mEventType, bundle);
        C786410Ut5.LJJJI("enter_method", "related_search_anchor_v2", bundle);
        PromotionInfo promotionInfo = c688190Qz3.LJFF;
        if (promotionInfo != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_promotion_type", promotionInfo.getPromotionType());
            String promotionText = promotionInfo.getPromotionText();
            if (!C123100dR.LIZ(promotionText)) {
                promotionText = null;
            }
            if (promotionText != null && Intrinsics.LJFF(zm0(), Boolean.TRUE)) {
                jSONObject.put("from_promotion_text", promotionText);
            }
            Image promotionIcon = promotionInfo.getPromotionIcon();
            if (promotionIcon != null && (urlList = promotionIcon.getUrlList()) != null) {
                if (!(!urlList.isEmpty())) {
                    urlList = null;
                }
                if (urlList != null && Intrinsics.LJFF(iL0(), Boolean.TRUE)) {
                    jSONObject.put("is_promotion_icon", true);
                }
            }
            List list = (List) C1225704qt.LIZIZ.getValue();
            Map<String, String> trackParams = promotionInfo.getTrackParams();
            if (trackParams != null) {
                for (Map.Entry<String, String> entry : trackParams.entrySet()) {
                    if (list.contains(entry.getKey())) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            C786410Ut5.LJJIZ(bundle, "extraLogParams", C786410Ut5.J3(jSONObject));
        }
        String str3 = c688190Qz3.LJ;
        if (!C123100dR.LIZ(str3)) {
            str3 = null;
        }
        if (str3 != null) {
            C786410Ut5.LJJJI("words_extra_type", str3, bundle);
        }
        C786410Ut5.LJJJI("penetrate_info", c688190Qz3.LJII, bundle);
        C259800zU c259800zU = new C259800zU();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        boolean zIsEnableAdStarHub = false;
        if (C1821107Bh.LIZIZ) {
            try {
                String str4 = c688190Qz3.LJII;
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        type = new TypeToken<n>() { // from class: X.0QzC
                        }.getType();
                    } else {
                        type = C2371409Qy.LIZJ(C13LE.LJ(n.class));
                    }
                    Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(str4, type);
                    if (!(objLJIIIIZZ instanceof n)) {
                        objLJIIIIZZ = null;
                    }
                    r9 = (n) objLJIIIIZZ;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    r9 = 0;
                }
                c259800zU.element = r9;
                if (r9 == 0) {
                    strLIZJ = null;
                } else {
                    strLIZJ = C2399609ak.LIZJ(r9, "sug_user_id");
                }
                if (!C123100dR.LIZ(strLIZJ)) {
                    strLIZJ = null;
                }
                if (strLIZJ != null) {
                    str2 = (String) linkedHashMap2.put("sug_user_id", strLIZJ);
                }
                C189200o6.m2constructorimpl(str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        String strF = C1ER1.LIZIZ.f((n) c259800zU.element, c688190Qz3.LJII);
        if (C123100dR.LIZ(strF)) {
            linkedHashMap2.put("poi_card_id_list", strF);
        }
        if (!linkedHashMap2.isEmpty()) {
            try {
                C786410Ut5.LJJJI("extraRequestParams", C1741890vQh.LJIIIIZZ(linkedHashMap2), bundle);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        Map<String, String> mapLLLLLZ = C1ER1.LIZIZ.LLLLLZ(c688190Qz3.LJII);
        if (mapLLLLLZ != null) {
            linkedHashMap = new LinkedHashMap(mapLLLLLZ);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        TuxTextView tuxTextView = this.LLLIIIIL;
        if (tuxTextView == null || tuxTextView.getVisibility() != 0) {
            z2 = false;
        }
        if (z2) {
            linkedHashMap.put("has_seemore", "1");
        }
        IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
        if (iEcomSearchService != null && (mapLJLJL = iEcomSearchService.LJLJL(c688190Qz3.LJII)) != null) {
            linkedHashMap.putAll(mapLJLJL);
        }
        if (!linkedHashMap.isEmpty()) {
            try {
                C786410Ut5.LJJJI("suggest_word_mob_extra", C1741890vQh.LJIIIIZZ(linkedHashMap), bundle);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C189200o6.m2constructorimpl(new C098200Yq(th3));
            }
        }
        if (videoItemParams.getAweme().isAd()) {
            AwemeCommerceStruct commerceVideoAuthInfo = videoItemParams.getAweme().getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null) {
                zIsEnableAdStarHub = commerceVideoAuthInfo.isEnableAdStarHub();
            }
            C786410Ut5.LJJJI("enable_ad_star_hub", String.valueOf(zIsEnableAdStarHub), bundle);
        }
        if (!Ip()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C786410Ut5.LJJJI("is_display_sevensplit_screen", str, bundle);
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final void Vr0(int i, Aweme aweme) {
        String aid;
        EnumC688390QzN enumC688390QzN;
        String aid2;
        VideoSearchCacheVM videoSearchCacheVMUp = Up();
        String aid3 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C688190Qz3 c688190Qz3VQ2 = videoSearchCacheVMUp.vQ2(aid);
        if (c688190Qz3VQ2 != null) {
            VideoSearchCacheVM videoSearchCacheVMUp2 = Up();
            if (aweme != null && (aid2 = aweme.getAid()) != null) {
                enumC688390QzN = videoSearchCacheVMUp2.LLILLL.get(aid2);
            } else {
                videoSearchCacheVMUp2.getClass();
                enumC688390QzN = null;
            }
            if (C301480Brm.LIZ() && enumC688390QzN == EnumC688390QzN.RECOMMEND_REASON) {
                C688350QzJ c688350QzJLIZIZ = Qp().LIZIZ(c688190Qz3VQ2.LIZIZ, false, aweme);
                if (!c688350QzJLIZIZ.LIZ) {
                    iq(c688350QzJLIZIZ, c688190Qz3VQ2, aweme);
                }
                if (this.LLLLZLLIL.LIZ) {
                    C688290QzD c688290QzD = C688290QzD.LIZ;
                    String str = c688190Qz3VQ2.LIZLLL;
                    c688290QzD.getClass();
                    C688290QzD.LJIILIIL(str);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onHolderSelectedFix position=");
            sbLIZ.append(i);
            sbLIZ.append(" aid=");
            if (aweme != null) {
                aid3 = aweme.getAid();
            }
            sbLIZ.append(aid3);
            sbLIZ.append(" labelType=");
            sbLIZ.append(enumC688390QzN);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final void jq(C688350QzJ c688350QzJ, C688190Qz3 c688190Qz3) {
        String str;
        RichSugInfo richSugInfo;
        WordStruct wordStruct = c688190Qz3.LIZIZ;
        if (wordStruct != null && (richSugInfo = wordStruct.getRichSugInfo()) != null) {
            str = richSugInfo.sugReason;
        } else {
            str = null;
        }
        C688270QzB c688270QzB = this.LLLLZLLIL;
        c688270QzB.LIZ = c688350QzJ.LIZ;
        c688270QzB.LIZIZ = c688350QzJ.LIZIZ;
        c688270QzB.LIZJ = str;
        c688270QzB.LIZLLL = c688350QzJ.LIZJ;
        c688270QzB.LJ = c688350QzJ.LIZLLL;
        Qp().LIZ(this.LLLFFI, str, this.LLLLZLLIL.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void iq(X.C688350QzJ r15, X.C688190Qz3 r16, com.ss.android.ugc.aweme.feed.model.Aweme r17) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem.iq(X.0QzJ, X.0Qz3, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
