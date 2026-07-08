package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image;

import X.AbstractC1377610lx9;
import X.C01GW;
import X.C03H5;
import X.C066P;
import X.C098200Yq;
import X.C0HXV;
import X.C0PNL;
import X.C0Q09;
import X.C0Q0C;
import X.C0Q0G;
import X.C0Q4Y;
import X.C0QA2;
import X.C0QA8;
import X.C0QAI;
import X.C0QAJ;
import X.C0QC4;
import X.C0QSJ;
import X.C0ZP4;
import X.C1012040cRW;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1227904rF;
import X.C123100dR;
import X.C1247530iZL;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1390850mIV;
import X.C13LE;
import X.C13LP;
import X.C14TF;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1603960rqE;
import X.C1685300txQ;
import X.C1731606qI;
import X.C1770850wBP;
import X.C1839407Ii;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719512Dh;
import X.C19EG;
import X.C19GS;
import X.C1EE2;
import X.C20277814Wa;
import X.C20600815jK;
import X.C20684815ws;
import X.C2097608Jq;
import X.C21646019nW;
import X.C2179771ASp;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C272120AlW;
import X.C301530Brr;
import X.C338520DOw;
import X.C341380DZw;
import X.C442401nq;
import X.C444200HbO;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C621180OYa;
import X.C643200PKs;
import X.C653450Pk7;
import X.C658080Pra;
import X.C661150PwX;
import X.C661350Pwr;
import X.C673150Qan;
import X.C687700QyG;
import X.C689750R3t;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC666410QBz;
import X.EnumC669620QOi;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1733780vDc;
import X.InterfaceC1891350zJl;
import X.InterfaceC21503819Do;
import X.InterfaceC2217241BqE;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ARunnableS12S0201000_4;
import Y.ARunnableS21S0101000_10;
import Y.ARunnableS79S0200000_10;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.PhotoModeIngressEtData;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.mob.SearchNimbleImageMob;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.InsiteImageData;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.OffsiteImageData;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share.SearchImageShareConfiguration;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share.SearchImageShareModel;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share.SearchImageSharePackage;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS95S1200000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC836760Ws6
public final class SearchImageLandingFragment extends BaseFragment implements InterfaceC724530SbT, IImageLandingPageAbility, InterfaceC21503819Do, C0QAJ, C0QSJ, InterfaceC1146704e9 {
    public static final boolean LLJJI = C1839407Ii.LIZ();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiJyHELIOSY+KikpZzo6ZjUtLiogZiwhKCg2ZhYpKD0wIAwhKCg2BCQiLSY9LwM+KCg+LSs4";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.navArg(this, AFwS196S0000000_10.get$arr$(294));
    public TuxNavBar LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20631115oD LLJ;
    public C21646019nW LLJI;
    public final C736950SvV LLJIJIL;
    public final C0QAI LLJILJIL;
    public final List<C0Q0G> LLJILJILJ;
    public final C01GW LLJILLL;
    public final C0QC4 LLJJ;

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchImageLandingScope.class});
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
        arrayList.add(SearchImageLandingScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchImageLandingScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final SearchImageLandingPageNavArg UR() {
        return (SearchImageLandingPageNavArg) this.LLIZ.getValue();
    }

    public final SearchImageLandingPageVM VR() {
        return (SearchImageLandingPageVM) this.LLJIJIL.getValue();
    }

    public final SearchNimbleImageMob ZR() {
        return (SearchNimbleImageMob) this.LLJILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.IImageLandingPageAbility
    public final void lH() {
        SearchVisualInspirationSharedVM searchVisualInspirationSharedVM = this.LLJILJIL.LIZIZ;
        if (searchVisualInspirationSharedVM == null || !searchVisualInspirationSharedVM.LJIIJJI()) {
            return;
        }
        this.LLJILJIL.LIZJ();
        VR().wQ2(EnumC666410QBz.LOADING);
    }

    public SearchImageLandingFragment() {
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 602);
        this.LLJIJIL = new C736950SvV(C13LE.LIZ(SearchImageLandingPageVM.class), awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS241S0000000_10.get$arr$(279), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJILJIL = new C0QAI();
        this.LLJILJILJ = new ArrayList();
        this.LLJILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 603));
        this.LLJJ = C0QC4.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.IImageLandingPageAbility
    public final SearchImageLandingPageVM Db1() {
        return VR();
    }

    public final int LJLJJL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentIndex: ");
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJ;
        sbLIZ.append(viewOnAttachStateChangeListenerC20631115oD != null ? viewOnAttachStateChangeListenerC20631115oD.getCurrentItem() : 0);
        C2188811AlT.LIZIZ(sbLIZ);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20631115oD2 != null) {
            return viewOnAttachStateChangeListenerC20631115oD2.getCurrentItem();
        }
        return 0;
    }

    public final List<ImageData> WR() {
        return VR().getState().LL;
    }

    public final void aS() {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        ImageData imageData;
        C19EG activity = getActivity();
        if (activity == null || (viewOnAttachStateChangeListenerC20631115oD = this.LLJ) == null || (imageData = (ImageData) C13LP.LJJJLZIJ(viewOnAttachStateChangeListenerC20631115oD.getCurrentItem(), WR())) == null) {
            return;
        }
        if (!Intrinsics.LJFF(UR().getSceneType(), "top1_aigc")) {
            C1731606qI c1731606qI = C1731606qI.LIZ;
            Map<String, String> logParams = UR().getLogParams();
            SearchNimbleImageMob searchNimbleImageMobZR = ZR();
            String feedbackType = UR().getFeedbackType();
            boolean zLJFF = Intrinsics.LJFF(UR().getSceneType(), "top1_aigc");
            c1731606qI.getClass();
            final SearchImageShareModel searchImageShareModel = new SearchImageShareModel(imageData, logParams, feedbackType, zLJFF);
            TuxSheet tuxSheetLJIIZILJ = C621180OYa.LIZ.LJIIZILJ(new SearchImageSharePackage(new AbstractC1377610lx9(searchImageShareModel) { // from class: X.0lgt
                public final SearchImageShareModel LIZ;

                @Override // X.AbstractC1377630lxB
                public final String LIZJ() {
                    return "search_image";
                }

                @Override // X.AbstractC1377630lxB
                public final ShareContentType[] LIZLLL() {
                    return new ShareContentType[]{ShareContentType.PHOTO};
                }

                @Override // X.AbstractC1377630lxB
                public final String LIZ() {
                    String shareDesc = this.LIZ.imageData.getShareDesc();
                    return shareDesc == null ? "" : shareDesc;
                }

                @Override // X.AbstractC1377630lxB
                public final String LIZIZ() {
                    String imageUrl = this.LIZ.imageData.getImageUrl();
                    return imageUrl == null ? "" : imageUrl;
                }

                @Override // X.AbstractC1377630lxB
                public final Bundle LJFF() {
                    Bundle bundle = new Bundle();
                    String imageUrl = this.LIZ.imageData.getImageUrl();
                    if (imageUrl == null) {
                        imageUrl = "";
                    }
                    C786410Ut5.LJJJI("thumb_url", imageUrl, bundle);
                    String imageUrl2 = this.LIZ.imageData.getImageUrl();
                    C786410Ut5.LJJJI("image_url", imageUrl2 != null ? imageUrl2 : "", bundle);
                    C786410Ut5.LJJJI("enter_method", "long_press", bundle);
                    C786410Ut5.LJJJI("panel_source", "long_press", bundle);
                    bundle.putBoolean("key_filter_group_chat", !C0ZNY.LIZJ());
                    bundle.putBoolean("key_filter_group_camera_permission", true);
                    bundle.putBoolean("key_filter_no_camera_permission", true);
                    return bundle;
                }

                @Override // X.AbstractC1377630lxB
                public final String LJI() {
                    String shareTitle = this.LIZ.imageData.getShareTitle();
                    return shareTitle == null ? "" : shareTitle;
                }

                @Override // X.AbstractC1377630lxB
                public final String LJII() {
                    String shareUrl = this.LIZ.imageData.getShareUrl();
                    return shareUrl == null ? "" : shareUrl;
                }

                @Override // X.AbstractC1377630lxB
                public final ShareModel LJ() {
                    return this.LIZ;
                }

                {
                    this.LIZ = searchImageShareModel;
                }
            }.LJIIIIZZ(), searchNimbleImageMobZR), activity, SearchImageShareConfiguration.LLILLJJLI);
            if (tuxSheetLJIIZILJ != null) {
                C1731606qI.LIZIZ = new WeakReference<>(tuxSheetLJIIZILJ);
                return;
            }
            return;
        }
        View view = getView();
        if (view == null && (view = this.LLJ) == null && (view = this.LLIZLLLIL) == null) {
            return;
        }
        C341380DZw c341380DZw = C341380DZw.LIZ;
        String feedbackType2 = UR().getFeedbackType();
        Map<String, String> logParams2 = UR().getLogParams();
        c341380DZw.getClass();
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247530iZL c1247530iZL = new C1247530iZL();
        c1247530iZL.LIZJ(R.raw.icon_flag);
        c1247530iZL.LIZIZ(2131838741);
        c1247530iZL.LIZ(new AwS95S1200000_10(feedbackType2, view, logParams2, 12));
        c1390850mIV.LJFF(Collections.singletonList(c1247530iZL));
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        tuxActionSheetLIZJ.show(getParentFragmentManager(), "SearchImageTop1ToolbarPanel");
        HandlerHook.viewPost(view, new ARunnableS12S0201000_4(2, view, tuxActionSheetLIZJ, 0));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IImageLandingPageAbility.class, null);
        SearchNimbleImageMob searchNimbleImageMobZR = ZR();
        searchNimbleImageMobZR.LIZJ(-1, LJLJJL());
        searchNimbleImageMobZR.LIZLLL(LJLJJL());
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(searchNimbleImageMobZR.LL);
        c2344009Gk.LIZLLL(searchNimbleImageMobZR.LLIZLLLIL, "duration");
        C20684815ws.LJIILLIIL("search_card_stay_duration", c2344009Gk.LIZ);
        if (LLJJI) {
            C0QAI c0qai = this.LLJILJIL;
            c0qai.LIZ = null;
            SearchVisualInspirationSharedVM searchVisualInspirationSharedVM = c0qai.LIZIZ;
            if (searchVisualInspirationSharedVM != null) {
                searchVisualInspirationSharedVM.FQ2(c0qai);
            }
            c0qai.LIZIZ = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.IImageLandingPageAbility
    public final void FG0(boolean z) {
        List<ImageData> listInvoke;
        String str;
        SearchNimbleImageMob searchNimbleImageMobZR = ZR();
        int iLJLJJL = LJLJJL();
        Function0<List<ImageData>> function0 = searchNimbleImageMobZR.LLILLJJLI;
        if (function0 != null) {
            listInvoke = function0.invoke();
        } else {
            listInvoke = null;
        }
        ImageData imageData = (ImageData) C444200HbO.LIZ(iLJLJJL, listInvoke);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(searchNimbleImageMobZR.LL);
        c2344009Gk.LJII(searchNimbleImageMobZR.LIZ(imageData));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("zoom", str);
        C20684815ws.LJIILLIIL("pinch_zoom", c2344009Gk.LIZ);
    }

    @Override // X.C0QAJ
    public final void Lo(Boolean bool) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        VR().wQ2(EnumC666410QBz.ERROR);
        if (Intrinsics.LJFF(bool, Boolean.FALSE) && (viewOnAttachStateChangeListenerC20631115oD = this.LLJ) != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
            C20600815jK.LJIIL(state, this.LLJJ);
        }
    }

    public final List<InterfaceC1891350zJl> SR(List<ImageData> list) {
        C0Q09 c661150PwX;
        ArrayList arrayList = new ArrayList();
        for (final ImageData imageData : list) {
            Integer num = imageData.type;
            boolean z = true;
            if (num != null) {
                if (num.intValue() == 1) {
                    c661150PwX = new C661150PwX(imageData);
                } else if (num.intValue() == 2) {
                    C658080Pra c658080Pra = new C658080Pra(imageData);
                    Boolean inflowDetailPageOpt = UR().getInflowDetailPageOpt();
                    Boolean bool = Boolean.TRUE;
                    if (!Intrinsics.LJFF(inflowDetailPageOpt, bool) || !LLJJI) {
                        z = false;
                    }
                    c658080Pra.LLILLL = z;
                    c658080Pra.LLILZ = Intrinsics.LJFF(UR().getShowDotIndicatorBottom(), bool);
                    c661150PwX = c658080Pra;
                } else if (num.intValue() == 3) {
                    c661150PwX = new C0Q09(imageData) { // from class: X.0Prc
                        public final ImageData LL;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C658100Prc) && Intrinsics.LJFF(this.LL, ((C658100Prc) obj).LL);
                        }

                        @Override // X.InterfaceC1891350zJl
                        public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return null;
                        }

                        public final int hashCode() {
                            return this.LL.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("ImageLandingSimpleItem(imageData=");
                            sbLIZ.append(this.LL);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.C0Q09
                        public final ImageData getImageData() {
                            return this.LL;
                        }

                        {
                            this.LL = imageData;
                        }

                        @Override // X.InterfaceC1891350zJl
                        public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return Intrinsics.LJFF(interfaceC1891350zJl, this);
                        }

                        @Override // X.InterfaceC1891350zJl
                        public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return Intrinsics.LJFF(interfaceC1891350zJl, this);
                        }
                    };
                } else if (num.intValue() == 100) {
                    c661150PwX = new C0Q09(imageData) { // from class: X.0Prc
                        public final ImageData LL;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C658100Prc) && Intrinsics.LJFF(this.LL, ((C658100Prc) obj).LL);
                        }

                        @Override // X.InterfaceC1891350zJl
                        public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return null;
                        }

                        public final int hashCode() {
                            return this.LL.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("ImageLandingSimpleItem(imageData=");
                            sbLIZ.append(this.LL);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.C0Q09
                        public final ImageData getImageData() {
                            return this.LL;
                        }

                        {
                            this.LL = imageData;
                        }

                        @Override // X.InterfaceC1891350zJl
                        public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return Intrinsics.LJFF(interfaceC1891350zJl, this);
                        }

                        @Override // X.InterfaceC1891350zJl
                        public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return Intrinsics.LJFF(interfaceC1891350zJl, this);
                        }
                    };
                }
                arrayList.add(c661150PwX);
            }
        }
        return arrayList;
    }

    @Override // X.C0QAJ
    public final void Y8(List<ImageData> list) {
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        List<InterfaceC1891350zJl> listSR = SR(list);
        VR().vQ2(list);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJ;
        if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
            C20600815jK.LJIILLIIL(state, 0, ((ArrayList) listSR).size(), listSR);
        }
    }

    public final void bS(int i) {
        if (((Boolean) C272120AlW.LIZ.getValue()).booleanValue()) {
            TuxNavBar tuxNavBar = this.LLIZLLLIL;
            if (tuxNavBar != null) {
                HandlerHook.viewPost(tuxNavBar, new ARunnableS21S0101000_10(i, this, 3));
                return;
            }
            return;
        }
        cS(i);
    }

    public final void cS(int i) {
        boolean z;
        String strValueOf;
        if (Intrinsics.LJFF(UR().getSceneType(), "top1_aigc")) {
            TuxNavBar tuxNavBar = this.LLIZLLLIL;
            if (tuxNavBar != null) {
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = "";
                tuxNavBar.LJIJJ(c1250250idj);
                return;
            }
            return;
        }
        Integer numValueOf = Integer.valueOf(VR().getState().LLILLJJLI);
        int iIntValue = numValueOf.intValue();
        if (LLJJI && iIntValue >= WR().size()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            if (iIntValue2 > 999) {
                strValueOf = "999+";
            } else {
                strValueOf = String.valueOf(iIntValue2);
            }
            TuxNavBar tuxNavBar2 = this.LLIZLLLIL;
            if (tuxNavBar2 != null) {
                C1250250idj c1250250idj2 = new C1250250idj();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i);
                sbLIZ.append(" / ");
                sbLIZ.append(strValueOf);
                c1250250idj2.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
                tuxNavBar2.LJIJJ(c1250250idj2);
                if (Unit.LIZ != null) {
                    return;
                }
            }
        }
        TuxNavBar tuxNavBar3 = this.LLIZLLLIL;
        if (tuxNavBar3 != null) {
            C1250250idj c1250250idj3 = new C1250250idj();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(i);
            sbLIZ2.append(" / ");
            sbLIZ2.append(WR().size());
            c1250250idj3.LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
            tuxNavBar3.LJIJJ(c1250250idj3);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (WR().isEmpty()) {
            C20277814Wa.LIZIZ(this);
        }
        NR(AFwS241S0000000_10.get$arr$(277));
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IImageLandingPageAbility.class, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.IImageLandingPageAbility
    public final void oy1(ImageData imageData) throws JSONException {
        Integer num;
        Aweme aweme;
        String aid;
        String str;
        String str2;
        Aweme aweme2;
        C19EG activity;
        int iIntValue;
        int iIntValue2;
        String str3;
        Aweme aweme3;
        String aid2;
        Integer num2;
        Aweme aweme4;
        String str4;
        String str5;
        String str6;
        float fDoubleValue;
        String str7;
        String str8;
        SearchVisualInspirationSharedVM searchVisualInspirationSharedVM = this.LLJILJIL.LIZIZ;
        if (searchVisualInspirationSharedVM != null) {
            searchVisualInspirationSharedVM.BQ2();
        }
        C442401nq c442401nq = C442401nq.LIZ;
        Map<String, String> logParams = UR().getLogParams();
        Boolean inflowDetailPageOpt = UR().getInflowDetailPageOpt();
        Boolean bool = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(inflowDetailPageOpt, bool);
        SearchNimbleImageMob searchNimbleImageMobZR = ZR();
        C0QA8 loadMoreConfig = UR().getLoadMoreConfig();
        c442401nq.getClass();
        Integer num3 = imageData.type;
        String str9 = "";
        if (num3 != null) {
            if (num3.intValue() == 1) {
                Context context = getContext();
                OffsiteImageData offsiteImageData = imageData.offsiteImage;
                if (offsiteImageData != null) {
                    str7 = offsiteImageData.webUrl;
                } else {
                    str7 = null;
                }
                if (context != null) {
                    if (logParams != null) {
                        str8 = logParams.get("enter_from");
                    } else {
                        str8 = null;
                    }
                    boolean zLJJJJIZL = C14TF.LIZIZ.LJJJJIZL(str8);
                    JSONObject jSONObject = new JSONObject();
                    if (zLJJJJIZL) {
                        jSONObject.put("business_event_keys_stay_time", "tikbot_webpage_stay_time");
                        jSONObject.put("business_event_keys_button_click", "tikbot_webpage_button_click");
                        jSONObject.put("business_event_keys_close", "tikbot_webpage_close");
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    if (!zLJJJJIZL) {
                        jSONObject2.put("page_type", "web_rag");
                    }
                    if (logParams != null) {
                        for (Map.Entry<String, String> entry : logParams.entrySet()) {
                            if (C123100dR.LIZ(entry.getValue())) {
                                jSONObject2.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    C066P c066p = C066P.LIZ;
                    if (str7 != null) {
                        str9 = str7;
                    }
                    Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("business_event_tracking", C786410Ut5.J3(jSONObject2)));
                    c066p.getClass();
                    C066P.LIZ(context, str9, mapLJIIJ);
                }
            } else if (num3.intValue() == 2) {
                InsiteImageData insiteImageData = imageData.insiteImage;
                if (insiteImageData != null) {
                    num = insiteImageData.insiteType;
                } else {
                    num = null;
                }
                if (num != null) {
                    if (num.intValue() == 3) {
                        Context context2 = getContext();
                        InsiteImageData insiteImageData2 = imageData.insiteImage;
                        if (insiteImageData2 != null && (aweme4 = insiteImageData2.awemeData) != null) {
                            if (logParams != null) {
                                str4 = logParams.get("enter_from");
                            } else {
                                str4 = null;
                            }
                            boolean zLJJJJIZL2 = C14TF.LIZIZ.LJJJJIZL(str4);
                            Bundle bundle = new Bundle();
                            C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme4.getAid(), bundle);
                            if (zLJJJJIZL2) {
                                C786410Ut5.LJJJI("enter_from", "from_chat_inner_cell", bundle);
                                C786410Ut5.LJJJI("tikbot_layer", "reference_layer", bundle);
                            } else {
                                C786410Ut5.LJJJI("enter_from", "from_no_request", bundle);
                            }
                            Video video = aweme4.getVideo();
                            if (video != null) {
                                int duration = video.getDuration();
                                Double d = insiteImageData2.cutTime;
                                if (d != null) {
                                    fDoubleValue = (float) d.doubleValue();
                                } else {
                                    fDoubleValue = 0.0f;
                                }
                                float f = fDoubleValue * LSPassThroughRecordSizeConfig.DEFAULT;
                                if (duration < 1) {
                                    duration = 1;
                                }
                                bundle.putFloat("extra_seek_progress", f / duration);
                            }
                            C442401nq.LIZ(bundle, logParams);
                            if (zLJFF) {
                                searchNimbleImageMobZR.LIZIZ(imageData);
                                SmartRoute smartRoute = new SmartRoute(context2);
                                smartRoute.withUrl("//aweme/detail");
                                smartRoute.withParam(bundle);
                                if (loadMoreConfig != null && (str6 = loadMoreConfig.sharedVMKey) != null) {
                                    str9 = str6;
                                }
                                smartRoute.withParam("activity_id", str9);
                                smartRoute.withParam("search_detail", C301530Brr.LIZ());
                                smartRoute.withParam("video_from", "from_lynx_visual_inspiration");
                                smartRoute.open();
                            } else {
                                if (logParams != null) {
                                    str5 = logParams.get("is_page");
                                } else {
                                    str5 = null;
                                }
                                C0PNL c0pnl = new C0PNL();
                                AwemeExtKt.appendMobParam(aweme4, "is_page", str5);
                                c0pnl.LJIL(Collections.singletonList(aweme4));
                                c0pnl.LLJJL = C643200PKs.LJ(aweme4);
                                C1603960rqE.LIZ = c0pnl;
                                SmartRoute smartRoute2 = new SmartRoute(context2);
                                smartRoute2.withParam(bundle);
                                smartRoute2.withUrl("//aweme/detail");
                                smartRoute2.open();
                            }
                        }
                    } else if (num != null) {
                        if (num.intValue() == 1) {
                            InsiteImageData insiteImageData3 = imageData.insiteImage;
                            if (logParams == null || (str2 = logParams.get("enter_from")) == null) {
                                str2 = "";
                            }
                            if (zLJFF) {
                                searchNimbleImageMobZR.LIZIZ(imageData);
                                C1012040cRW c1012040cRWLIZIZ = C1012040cRW.LIZIZ();
                                c1012040cRWLIZIZ.LJFF = true;
                                if (insiteImageData3 != null && (num2 = insiteImageData3.index) != null) {
                                    iIntValue2 = num2.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                                c1012040cRWLIZIZ.LJIIL = iIntValue2;
                                Bundle bundle2 = new Bundle();
                                C442401nq.LIZ(bundle2, logParams);
                                if (insiteImageData3 != null && (aweme3 = insiteImageData3.awemeData) != null && (aid2 = aweme3.getAid()) != null) {
                                    C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aid2, bundle2);
                                }
                                SmartRoute smartRoute3 = new SmartRoute(getContext());
                                smartRoute3.withUrl("//aweme/detail");
                                smartRoute3.withParam(bundle2);
                                if (loadMoreConfig != null && (str3 = loadMoreConfig.sharedVMKey) != null) {
                                    str9 = str3;
                                }
                                smartRoute3.withParam("activity_id", str9);
                                smartRoute3.withParam("video_from", "from_lynx_visual_inspiration");
                                smartRoute3.open();
                            } else if (insiteImageData3 != null && (aweme2 = insiteImageData3.awemeData) != null && (activity = getActivity()) != null) {
                                VideoItemParams videoItemParams = new VideoItemParams();
                                videoItemParams.setAweme(aweme2);
                                videoItemParams.setEventType(str2);
                                videoItemParams.setPageType(9);
                                videoItemParams.setEnterMethodValue("search_result_click");
                                PhotoModeIngressEtData photoModeIngressEtData = new PhotoModeIngressEtData(str2, C2179771ASp.LJIIIIZZ(), SystemClock.elapsedRealtime());
                                String aid3 = videoItemParams.getAweme().getAid();
                                String tabName = EnumC669620QOi.PHOTO.getTabName();
                                Integer num4 = insiteImageData3.index;
                                if (num4 != null) {
                                    iIntValue = num4.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                PostModeDetailParams postModeDetailParams = new PostModeDetailParams(videoItemParams.mEventType, tabName, aid3, iIntValue, 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str2, videoItemParams.mPageType, AwemeExtKt.getFromGroupId(videoItemParams.getAweme()), videoItemParams.mEnterMethodValue, 0 == true ? 1 : 0, photoModeIngressEtData, 0 == true ? 1 : 0, bool, 0 == true ? 1 : 0, PostModeEntranceMechanism.SEARCH_TAB_CARD, true, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, C2179771ASp.LJIIIZ(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -83360784, -1);
                                C1EE2 c1ee2 = C1EE2.LIZIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("SearchPhotoTextTab_");
                                sbLIZ.append(c442401nq.hashCode());
                                c1ee2.LJIJI(activity, videoItemParams, postModeDetailParams, C2188811AlT.LIZIZ(sbLIZ), null, null, this, null);
                            }
                        } else if (num.intValue() == 2) {
                            Context context3 = getContext();
                            InsiteImageData insiteImageData4 = imageData.insiteImage;
                            if (insiteImageData4 != null && (aweme = insiteImageData4.awemeData) != null && (aid = aweme.getAid()) != null && context3 != null) {
                                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("object_id", aid), new Pair("report_type", "sug_l8_result"), new Pair("enter_from", "general_search"), new Pair("author_id", AwemeExtKt.getAuthorUid(aweme)));
                                C1227904rF.LIZ.getClass();
                                String strLJI = C1227904rF.LJI(logParams);
                                if (strLJI == null) {
                                    strLJI = "";
                                }
                                String strLJI2 = C1227904rF.LJI(mapLJIIIIZZ);
                                if (strLJI2 == null) {
                                    strLJI2 = "";
                                }
                                C066P c066p2 = C066P.LIZ;
                                SearchAwemeInfo searchAwemeInfo = insiteImageData4.searchAwemeInfo;
                                if (searchAwemeInfo != null && (str = searchAwemeInfo.externalJumpUrl) != null) {
                                    str9 = str;
                                }
                                Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("report_event_tracking", strLJI2), new Pair("business_event_tracking", strLJI));
                                c066p2.getClass();
                                C066P.LIZ(context3, str9, mapLJIIJ2);
                            }
                        }
                    }
                }
            }
        }
        ZR().LIZLLL(LJLJJL());
        ZR().LJ("click_image_url", imageData);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.IImageLandingPageAbility
    public final void ux2(ImageData imageData) {
        aS();
        ZR().LJ("long_click", imageData);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.IImageLandingPageAbility
    public final void uz(C0Q0C c0q0c) {
        ((ArrayList) this.LLJILJILJ).add(c0q0c);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SearchVisualInspirationSharedVM searchVisualInspirationSharedVM;
        Integer numLIZJ;
        View viewLIZ;
        List<ImageData> listCQ2;
        super.onViewCreated(view, bundle);
        List<ImageData> listInvoke = null;
        if (LLJJI) {
            C0QAI c0qai = this.LLJILJIL;
            c0qai.LIZ = this;
            C0QA8 loadMoreConfig = UR().getLoadMoreConfig();
            WeakReference weakReference = new WeakReference(this);
            if (loadMoreConfig != null) {
                if (Intrinsics.LJFF(loadMoreConfig.vmClassType, "from_lynx_visual_inspiration")) {
                    Fragment fragment = (Fragment) weakReference.get();
                    if (fragment != null) {
                        SearchVisualInspirationSharedVM searchVisualInspirationSharedVMLIZ = C0QA2.LIZ(fragment, loadMoreConfig.sharedVMKey);
                        ((ArrayList) searchVisualInspirationSharedVMLIZ.LLILZIL).add(c0qai);
                        c0qai.LIZIZ = searchVisualInspirationSharedVMLIZ;
                    }
                } else {
                    c0qai.LIZIZ = null;
                }
            }
            SearchVisualInspirationSharedVM searchVisualInspirationSharedVM2 = this.LLJILJIL.LIZIZ;
            if (searchVisualInspirationSharedVM2 != null && (listCQ2 = searchVisualInspirationSharedVM2.CQ2()) != null) {
                VR().vQ2(listCQ2);
            }
            if (Intrinsics.LJFF(UR().getShowDotIndicatorBottom(), Boolean.TRUE)) {
                C21646019nW c21646019nW = (C21646019nW) view.findViewById(R.id.kcc);
                this.LLJI = c21646019nW;
                C661350Pwr.LJIIL(c21646019nW);
                C21646019nW c21646019nW2 = this.LLJI;
                if (c21646019nW2 != null) {
                    c21646019nW2.setCount(VR().getState().LLILLJJLI);
                }
                try {
                    C21646019nW c21646019nW3 = this.LLJI;
                    if (c21646019nW3 != null) {
                        C844470XAv.LIZ.getClass();
                        viewLIZ = C0HXV.LIZ(C844470XAv.LIZ().getResources().getDimensionPixelSize(R.dimen.a2n) + C844470XAv.LIZ().getResources().getDimensionPixelSize(R.dimen.a2o), c21646019nW3);
                    } else {
                        viewLIZ = null;
                    }
                    C189200o6.m2constructorimpl(viewLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p1y);
        this.LLIZLLLIL = tuxNavBar;
        if (tuxNavBar != null) {
            tuxNavBar.LJIIZILJ(false);
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS554S0100000_10(this, 604));
            tuxNavBar.LIZIZ(c1251150ifB);
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_ellipsis_horizontal;
            c1251150ifB2.LIZJ(new AwS554S0100000_10(this, 605));
            tuxNavBar.LIZ(c1251150ifB2);
            bS(UR().getSelectIndex() + 1);
        }
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            TuxNavBar tuxNavBar2 = this.LLIZLLLIL;
            if (tuxNavBar2 != null) {
                tuxNavBar2.setNavBackground(iIntValue);
            }
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) view.findViewById(R.id.sjg);
        this.LLJ = viewOnAttachStateChangeListenerC20631115oD;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().LIZJ(ImageLandingInsiteItemCell.class, ImageLandingOffsiteItemCell.class, ImageLandingLoadingItemCell.class, ImageLandingSimpleItemCell.class);
            List<ImageData> list = VR().getState().LL;
            List<InterfaceC1891350zJl> listSR = SR(list);
            if (LLJJI && (searchVisualInspirationSharedVM = this.LLJILJIL.LIZIZ) != null && searchVisualInspirationSharedVM.LJIIJJI()) {
                if (C19719512Dh.LJI(listSR) && listSR != null) {
                    listSR.add(this.LLJJ);
                }
                VR().wQ2(EnumC666410QBz.LOADING);
            }
            viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().getState().LJIILL(listSR, new ARunnableS79S0200000_10(viewOnAttachStateChangeListenerC20631115oD, this, 31));
            C653450Pk7 c653450Pk7 = new C653450Pk7(null);
            c653450Pk7.LIZLLL(list, list, AFwS241S0000000_10.get$arr$(278));
            c653450Pk7.LIZLLL = new AwS589S0100000_10(c653450Pk7, (C653450Pk7<ImageData>) viewOnAttachStateChangeListenerC20631115oD, (ViewOnAttachStateChangeListenerC20631115oD) 249);
            viewOnAttachStateChangeListenerC20631115oD.registerOnPageChangeCallback(new C689750R3t(this, 0));
        }
        SearchNimbleImageMob searchNimbleImageMobZR = ZR();
        int selectIndex = UR().getSelectIndex();
        Function0<List<ImageData>> function0 = searchNimbleImageMobZR.LLILLJJLI;
        if (function0 != null) {
            listInvoke = function0.invoke();
        }
        ImageData imageData = (ImageData) C444200HbO.LIZ(selectIndex, listInvoke);
        if (imageData != null) {
            searchNimbleImageMobZR.LIZIZ(imageData);
        }
    }

    @Override // X.C0QAJ
    public final void LLLLLJIL(Integer num, List list, boolean z) {
        Integer numValueOf;
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        View childAt;
        View childAt2;
        boolean z2;
        InterfaceC1733780vDc viewItemOperator2;
        C20600815jK<InterfaceC1891350zJl> state2;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        RecyclerView recyclerView;
        ViewGroup viewGroup;
        InterfaceC1733780vDc viewItemOperator3;
        C20600815jK<InterfaceC1891350zJl> state3;
        SearchImageLandingPageVM searchImageLandingPageVMVR = VR();
        ArrayList arrayList = new ArrayList(searchImageLandingPageVMVR.getState().LL);
        arrayList.addAll(list);
        searchImageLandingPageVMVR.vmDispatcher.getState();
        searchImageLandingPageVMVR.setStateImmediate(new AwS589S0100000_10(arrayList, (List<ImageData>) 414));
        SearchImageLandingPageVM searchImageLandingPageVMVR2 = VR();
        searchImageLandingPageVMVR2.getClass();
        if (num != null) {
            num.intValue();
            searchImageLandingPageVMVR2.vmDispatcher.getState();
            searchImageLandingPageVMVR2.setStateImmediate(new AwS589S0100000_10(num, 415));
        }
        bS(LJLJJL() + 1);
        C21646019nW c21646019nW = this.LLJI;
        if (c21646019nW != null) {
            c21646019nW.setCount(VR().getState().LLILLJJLI);
        }
        C21646019nW c21646019nW2 = this.LLJI;
        if (c21646019nW2 != null) {
            c21646019nW2.setSelectedIndex(LJLJJL());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("before setState currentIndex = ");
        sbLIZ.append(LJLJJL());
        sbLIZ.append(" getState.size = ");
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLJ;
        Integer numValueOf2 = null;
        if (viewOnAttachStateChangeListenerC20631115oD2 != null && (viewItemOperator3 = viewOnAttachStateChangeListenerC20631115oD2.getViewItemOperator()) != null && (state3 = viewItemOperator3.getState()) != null) {
            numValueOf = Integer.valueOf(state3.LJIIIIZZ());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" imagesize = ");
        sbLIZ.append(WR().size());
        C2188811AlT.LIZIZ(sbLIZ);
        List<InterfaceC1891350zJl> listSR = SR(list);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20631115oD3 != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD3.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD4 = this.LLJ;
            if (viewOnAttachStateChangeListenerC20631115oD4 != null) {
                childAt = viewOnAttachStateChangeListenerC20631115oD4.getChildAt(0);
            } else {
                childAt = null;
            }
            if ((childAt instanceof ViewGroup) && (viewGroup = (ViewGroup) childAt) != null) {
                childAt2 = viewGroup.getChildAt(0);
            } else {
                childAt2 = null;
            }
            if ((childAt2 instanceof RecyclerView) && (recyclerView = (RecyclerView) childAt2) != null) {
                recyclerView.setItemAnimator(null);
            }
            List<InterfaceC1891350zJl> listLJII = state.LJII();
            int iLJLJJL = LJLJJL();
            if (LJLJJL() == ((ArrayList) listLJII).size() - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            int iLJIIIIZZ = state.LJIIIIZZ() - 1;
            if (iLJIIIIZZ < 0) {
                iLJIIIIZZ = 0;
            }
            C20600815jK.LJ(state, iLJIIIIZZ, listSR);
            if (z) {
                VR().wQ2(EnumC666410QBz.LOADING);
            } else {
                C20600815jK.LJIIL(state, this.LLJJ);
            }
            if (z2 && (viewOnAttachStateChangeListenerC20631115oD = this.LLJ) != null) {
                viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(iLJLJJL, false);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("after setState currentIndex = ");
            sbLIZ2.append(LJLJJL());
            sbLIZ2.append(" getState.size = ");
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD5 = this.LLJ;
            if (viewOnAttachStateChangeListenerC20631115oD5 != null && (viewItemOperator2 = viewOnAttachStateChangeListenerC20631115oD5.getViewItemOperator()) != null && (state2 = viewItemOperator2.getState()) != null) {
                numValueOf2 = Integer.valueOf(state2.LJIIIIZZ());
            }
            sbLIZ2.append(numValueOf2);
            sbLIZ2.append(" imagesize = ");
            sbLIZ2.append(WR().size());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(new ContextThemeWrapper(requireContext(), R.style.y0)), R.layout.ewt, viewGroup, false);
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
