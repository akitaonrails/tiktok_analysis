package com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab;

import X.AbstractC1255880imo;
import X.AbstractC21673619ry;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C036E;
import X.C086I;
import X.C098200Yq;
import X.C0BMU;
import X.C0BXX;
import X.C0C64;
import X.C0DXZ;
import X.C0H49;
import X.C0OBG;
import X.C0P6P;
import X.C0VWN;
import X.C0W93;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XQ7;
import X.C1075590e61;
import X.C10EU;
import X.C1214730hiR;
import X.C1233040iBy;
import X.C1250680ieQ;
import X.C1253150iiP;
import X.C1253330iih;
import X.C1255050ilT;
import X.C1255780ime;
import X.C1255920ims;
import X.C1256070in7;
import X.C1257170iot;
import X.C1258410iqt;
import X.C1258460iqy;
import X.C1258980iro;
import X.C1259360isQ;
import X.C1259780it6;
import X.C1259890itH;
import X.C1260260its;
import X.C1264160j0A;
import X.C12ES;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1483370ohj;
import X.C1483410ohn;
import X.C14EU;
import X.C15O7;
import X.C1603960rqE;
import X.C1606420ruC;
import X.C1607950rwf;
import X.C1685300txQ;
import X.C1720106oR;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C19252910Tv;
import X.C19EG;
import X.C19GS;
import X.C20595415iS;
import X.C20673215v0;
import X.C20684815ws;
import X.C21689319uV;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2277711EDh;
import X.C2279011EIh;
import X.C2344809Gs;
import X.C300180Bpg;
import X.C341940Daq;
import X.C434230H0z;
import X.C452501pT;
import X.C616540OGe;
import X.C746350TPl;
import X.C785810Us7;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1258430iqv;
import X.EnumC1258450iqx;
import X.EnumC1259080iry;
import X.EnumC1260930iux;
import X.InterfaceC1212360hec;
import X.InterfaceC1258330iql;
import X.InterfaceC1258470iqz;
import X.InterfaceC1259240isE;
import X.InterfaceC1259540isi;
import X.InterfaceC1259640iss;
import X.InterfaceC1259900itI;
import X.InterfaceC1260110itd;
import X.InterfaceC2385309Wh;
import X.InterfaceC645470PTl;
import Y.ARunnableS38S0110000_19;
import Y.AsS33S0200000_19;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ab.SubscribeSettingsExp;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.PhotoTopicBannerReadStatus;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.ur.longpress.ILongPressService;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileBaseAwemeListFragment extends ProfileListAdapterFragment implements InterfaceC1260110itd, InterfaceC645470PTl<C1259780it6>, InterfaceC1259640iss, C0P6P, InterfaceC1212360hec<Aweme>, InterfaceC1259540isi {
    public int LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public String LLJJIJIL;
    public Map<String, String> LLJJJ;
    public RecyclerView LLJJJIL;
    public C1749280vcc LLJJJJ;
    public InterfaceC1258470iqz LLJJJJJIL;
    public C1259890itH LLJJJJLIIL;
    public C1259360isQ LLJJL;
    public WrapGridLayoutManager LLJL;
    public C1255920ims<AbstractC1255880imo<?, ?>> LLJLIL;
    public boolean LLJLILLLLZIIL;
    public String LLJLL;
    public int LLJLLIL;
    public int LLJZ;
    public String LLJZIJLIL;
    public User LLL;
    public boolean LLJJIJI = true;
    public boolean LLJJIJIIJIL = true;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2565));
    public int LLJLLL = Integer.MAX_VALUE;

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Bp() {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void GA(Boolean bool) {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void LD(TuxTextView tuxTextView, Aweme aweme) {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void NN() {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void SY() {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final View WR() {
        return null;
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void ZF(Aweme aweme, View view) {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void fx(Boolean bool) {
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC645470PTl
    public final /* synthetic */ void zt(RecyclerView.ViewHolder viewHolder) {
    }

    public final int ES() {
        return C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(3, 0);
    }

    public void HS() {
        C1749280vcc c1749280vcc = this.LLJJJJ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
    }

    @Override // X.InterfaceC1259540isi
    public final void KA() {
        XS("fresh_type_has_filter_video");
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        c5("unknow");
    }

    public final boolean NS() {
        C1259360isQ c1259360isQ = this.LLJJL;
        return c1259360isQ == null || c1259360isQ.getItemCount() <= 0;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        List<T> list;
        C1259360isQ c1259360isQ = this.LLJJL;
        if (c1259360isQ == null || (list = c1259360isQ.mmItems) == 0) {
            return false;
        }
        return list.isEmpty();
    }

    public C1255920ims<AbstractC1255880imo<?, ?>> wS() {
        if (this.LLJILLL != 0 || this.LLJJI) {
            return new C1255050ilT();
        }
        C1214730hiR c1214730hiR = new C1214730hiR();
        c1214730hiR.LJIJI(this.LLIZ);
        return c1214730hiR;
    }

    public final C0H49 zS() {
        return (C0H49) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final String FS() {
        MatchedFriendStruct matchedFriendStruct;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getUserRecType: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        User user = this.LLL;
        return (user == null || (matchedFriendStruct = user.getMatchedFriendStruct()) == null || (str = matchedFriendStruct.recType) == null) ? "" : str;
    }

    private final String GS() {
        MatchedFriendStruct matchedFriendStruct;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getUserRelationType: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        User user = this.LLL;
        return (user == null || (matchedFriendStruct = user.getMatchedFriendStruct()) == null || (str = matchedFriendStruct.relationType) == null) ? "" : str;
    }

    public final boolean JS() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isAbnormal: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        return this.LLJILJIL || this.LLJ || this.LLJI || this.LLJIJIL || this.LLJILJILJ || this.LLILZIL;
    }

    @Override // X.InterfaceC1212360hec
    public final void Jm() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showLoadLatestLoading: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1259640iss
    public final void L4() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstPublishAwemeBound: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1212360hec
    public void LJ() {
        C1749280vcc c1749280vcc;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showLoading: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        C1259360isQ c1259360isQ = this.LLJJL;
        if (c1259360isQ == null || c1259360isQ.getItemCount() > 0 || c1259360isQ.LLILZ) {
            return;
        }
        if (C0BXX.LIZ()) {
            C1749280vcc c1749280vcc2 = this.LLJJJJ;
            if (c1749280vcc2 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc2, 8);
                return;
            }
            return;
        }
        if (getUserVisibleHint() && (c1749280vcc = this.LLJJJJ) != null) {
            c1749280vcc.setTag(R.id.s29, Long.valueOf(SystemClock.elapsedRealtime()));
        }
        C1749280vcc c1749280vcc3 = this.LLJJJJ;
        if (c1749280vcc3 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc3, 0);
        }
        C1749280vcc c1749280vcc4 = this.LLJJJJ;
        if (c1749280vcc4 != null) {
            c1749280vcc4.LJ();
        }
    }

    @Override // X.InterfaceC1206550hVF
    public final boolean LJLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needRefresh: ");
        sbLIZ.append(this.LLJJIJI);
        C2188811AlT.LIZIZ(sbLIZ);
        return this.LLJJIJI;
    }

    public void Ng1() {
        AbstractC1255880imo abstractC1255880imo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showLoadEmpty: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        C1258410iqt.LJ(true);
        if (isViewValid()) {
            C1258410iqt.LJFF(this.LLJJI, C0W93.SUCCESS);
            C1255920ims<AbstractC1255880imo<?, ?>> c1255920ims = this.LLJLIL;
            if (c1255920ims != null && (abstractC1255880imo = (AbstractC1255880imo) c1255920ims.LL) != null && abstractC1255880imo.isHasMore() && !JS()) {
                c5("load_more_feed_empty_but_has_more");
            }
            InterfaceC1258470iqz interfaceC1258470iqz = this.LLJJJJJIL;
            if (interfaceC1258470iqz != null) {
                interfaceC1258470iqz.LIZJ(this.LLJILLL, this.LLJJI);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final int UR() {
        return super.UR();
    }

    public final void US() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showNetworkErrorStatus: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!NS()) {
            HS();
            C19EG activity = getActivity();
            if (activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131837962);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        RS(false);
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            C1257170iot.LIZIZ(activity2, C1258410iqt.LIZIZ(this.LLJILLL, this.LLJJI), null, this.LLJJJJ);
        }
        C1749280vcc c1749280vcc = this.LLJJJJ;
        if (c1749280vcc != null) {
            C1264160j0A.LIZIZ(c1749280vcc, C1258410iqt.LIZIZ(this.LLJILLL, this.LLJJI), null, new AwS563S0100000_19(this, 2566));
        }
    }

    public final void clearData() {
        FeedItemList feedItemList;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearData, type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        C1258410iqt.LJ(true);
        C1259360isQ c1259360isQ = this.LLJJL;
        if (c1259360isQ != null) {
            c1259360isQ.resetLoadMoreState();
            c1259360isQ.clearData();
        }
        C1255920ims<AbstractC1255880imo<?, ?>> c1255920ims = this.LLJLIL;
        if (c1255920ims != null) {
            T t = c1255920ims.LL;
            if ((t instanceof C1255780ime) && t != 0 && (feedItemList = (FeedItemList) t.getData()) != null) {
                feedItemList.maxCursor = 0L;
                feedItemList.setItems(null);
                feedItemList.hasMore = 0;
            }
        }
        this.LLJJIJI = true;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void mz() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncData: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append(' ');
        sbLIZ.append((Object) null);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void oF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopDynamicCoverAnimation: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        C1259890itH c1259890itH = this.LLJJJJLIIL;
        if (c1259890itH != null) {
            c1259890itH.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C1259360isQ c1259360isQ = this.LLJJL;
        if (c1259360isQ != null) {
            c1259360isQ.clearData();
        }
        C1255920ims<AbstractC1255880imo<?, ?>> c1255920ims = this.LLJLIL;
        if (c1255920ims != null) {
            c1255920ims.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        oF();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        VS("onResume", false, true);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        boolean zLJI = MethodIDManager.LJI(202445);
        super.onStart();
        if (this.LLJJI && this.LLJJIJI) {
            XS("fresh_on_start");
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        RecyclerView.ViewHolder childViewHolder;
        InterfaceC1259900itI interfaceC1259900itI;
        super.onStop();
        RecyclerView recyclerView = this.LLJJJIL;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                try {
                    View childAt = recyclerView.getChildAt(i);
                    if (childAt == null || (childViewHolder = recyclerView.getChildViewHolder(childAt)) == 0) {
                        return;
                    }
                    if (childViewHolder.getItemViewType() == 0 && (childViewHolder instanceof InterfaceC1259900itI) && (interfaceC1259900itI = (InterfaceC1259900itI) childViewHolder) != null) {
                        interfaceC1259900itI.H();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2344809Gs.LJI(e);
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC1259640iss
    public final void rK() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindFinished: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showLoadMoreLoading: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        C1258410iqt.LJ(true);
        if (isViewValid()) {
            C1259360isQ c1259360isQ = this.LLJJL;
            if (c1259360isQ != null) {
                c1259360isQ.showLoadMoreLoading();
            }
            oS(EnumC1258430iqv.LOAD_MORE, EnumC1258450iqx.LOADING);
            C1250680ieQ.LJIIZILJ(Boolean.valueOf(this.LLJJI), this.LLIZ, this.LLILLL, "slide_up", Long.valueOf(C1256070in7.LIZ), Integer.valueOf(this.LLJILLL));
        }
    }

    public EnumC1259080iry BS() {
        return EnumC1259080iry.LIKE_TAB;
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
    }

    private final void PS(Aweme aweme) {
        if (((Boolean) C2279011EIh.LJFF.getValue()).booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onClick: type=");
            sbLIZ.append(this.LLJILLL);
            sbLIZ.append(" isMyProfile=");
            sbLIZ.append(this.LLJJI);
            C2188811AlT.LIZIZ(sbLIZ);
            C1483410ohn.LJLJJI().LJJLJ(aweme);
        }
    }

    @Override // X.InterfaceC1259540isi
    public final void Ct(PhotoTopicBannerReadStatus photoTopicBannerReadStatus) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePhotoTopicBannerStatus: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void Gn(User user) {
        C1255780ime c1255780ime;
        C1255920ims<AbstractC1255880imo<?, ?>> c1255920ims = this.LLJLIL;
        if (c1255920ims != null) {
            T t = c1255920ims.LL;
            if ((t instanceof C1255780ime) && (c1255780ime = (C1255780ime) t) != null) {
                c1255780ime.LLIZLLLIL = this.LLL;
            }
        }
        this.LLL = user;
    }

    @Override // X.InterfaceC1259540isi
    public final void I5(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeTab: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1206550hVF
    public final void Ii(boolean z) {
        boolean zIsAccuratePrivateAccount;
        C1258410iqt.LJ(true);
        if (JS()) {
            User user = this.LLL;
            if (user != null) {
                zIsAccuratePrivateAccount = user.isAccuratePrivateAccount();
            } else {
                zIsAccuratePrivateAccount = false;
            }
            RS(zIsAccuratePrivateAccount);
            return;
        }
        XS("fresh_lazy_data");
    }

    @Override // X.InterfaceC1260110itd
    public final void LLLLLZL(MotionEvent motionEvent) {
        ILongPressService iLongPressService = (ILongPressService) PluggableExtentionKt.pluggableSpi$default(ILongPressService.class, false, false, false, 14, null);
        if (iLongPressService != null) {
            iLongPressService.LLLLLZL(motionEvent);
        }
    }

    public void RS(boolean z) {
        C1749280vcc c1749280vcc;
        boolean z2;
        boolean z3;
        C1722300uv6 c1722300uv6;
        String string;
        int i;
        boolean z4;
        int i2;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ;
        C1749280vcc c1749280vcc2 = this.LLJJJJ;
        int i3 = 0;
        if (c1749280vcc2 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        }
        Context context = getContext();
        if (context != null && (c1749280vcc = this.LLJJJJ) != null) {
            User user = this.LLL;
            boolean z5 = this.LLJJI;
            int i4 = this.LLJILLL;
            boolean z6 = this.LLJILJIL;
            boolean z7 = this.LLJIJIL;
            boolean z8 = this.LLJ;
            boolean z9 = this.LLJILJILJ;
            boolean z10 = this.LLJI;
            boolean z11 = this.LLILZIL;
            boolean z12 = this.LLILZLL;
            if (i4 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i5 = 2131833905;
            if (z2) {
                if (!z5) {
                    i3 = 2131845470;
                    i5 = 2131858030;
                }
                c1722300uv6 = new C1722300uv6();
                c1722300uv6.LJI = context.getString(i3);
                c1722300uv6.LJIIIIZZ = context.getString(i5);
            } else if (14 == i4) {
                if (!ComplianceServiceProvider.LJIJJ().LJJIIZ()) {
                    i3 = 2131845233;
                    i5 = 2131845478;
                }
                c1722300uv6 = new C1722300uv6();
                c1722300uv6.LJI = context.getString(i3);
                c1722300uv6.LJIIIIZZ = context.getString(i5);
            } else {
                if (1 == i4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String strJ4 = "";
                if (z3) {
                    if (z5) {
                        if (C10EU.LJIIIIZZ()) {
                            c1722300uv6 = new C1722300uv6();
                            c1722300uv6.LJIIIIZZ = context.getString(2131858027);
                        } else {
                            Integer numLIZ = C746350TPl.LIZ.LJIIJJI().LIZ();
                            if (numLIZ != null && numLIZ.intValue() == 0) {
                                i = 2131845487;
                                c1722300uv6 = new C1722300uv6();
                                c1722300uv6.LJI = context.getString(2131845481);
                                c1722300uv6.LJIIIIZZ = C786410Ut5.j4(context.getString(i), Arrays.copyOf(new Object[]{C10EU.LIZJ(user)}, 1));
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append(C786410Ut5.j4(context.getString(2131845484), Arrays.copyOf(new Object[]{context.getString(2131845483)}, 1)));
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
                                String string2 = context.getString(2131845483);
                                int iIndexOf = sb.indexOf(string2);
                                int length = string2.length() + iIndexOf;
                                if (iIndexOf >= 0 && length >= 0) {
                                    C786410Ut5.q2(spannableStringBuilder, new C785810Us7(context, 6), iIndexOf, length, 18);
                                    C786410Ut5.q2(spannableStringBuilder, new C434230H0z(C341940Daq.LIZ(17.0d)), iIndexOf, length, 18);
                                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a04, context)), iIndexOf, length, 18);
                                }
                                IPrivacyService iPrivacyService = (IPrivacyService) PluggableExtentionKt.pluggableSpi$default(IPrivacyService.class, false, false, false, 14, null);
                                if (iPrivacyService != null && (privacySettingsRestrictionItemLJIIIZ = iPrivacyService.LJIIIZ(0, "favorite")) != null && privacySettingsRestrictionItemLJIIIZ.showType == 2) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                c1722300uv6 = new C1722300uv6();
                                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "remove_like_list_permission_empty_hint", true) == 1) {
                                    i2 = 2131846209;
                                } else {
                                    i2 = 2131845485;
                                }
                                c1722300uv6.LJI = context.getString(i2);
                                if (!z4) {
                                    c1722300uv6.LJIIIIZZ = spannableStringBuilder;
                                }
                            }
                        }
                    } else if (!z6 && !z8 && !z10 && !z7 && !z9 && !z11) {
                        if (z12) {
                            if (SubscribeSettingsExp.LIZIZ()) {
                                c1722300uv6 = new C1722300uv6();
                                c1722300uv6.LJI = context.getString(2131850172);
                                c1722300uv6.LJIIIIZZ = context.getString(2131849278);
                            } else {
                                c1722300uv6 = new C1722300uv6();
                                c1722300uv6.LJI = context.getString(2131850172);
                                c1722300uv6.LJIIIIZZ = context.getString(2131829000);
                            }
                        } else if (z) {
                            c1722300uv6 = new C1722300uv6();
                            c1722300uv6.LJI = context.getString(2131845472);
                            c1722300uv6.LJIIIIZZ = C786410Ut5.j4(context.getString(2131845471), Arrays.copyOf(new Object[]{C10EU.LIZJ(user)}, 1));
                        } else if (C10EU.LJIIIIZZ()) {
                            c1722300uv6 = new C1722300uv6();
                            c1722300uv6.LJIIIIZZ = context.getString(2131858027);
                        } else {
                            i = 2131845473;
                            c1722300uv6 = new C1722300uv6();
                            c1722300uv6.LJI = context.getString(2131845481);
                            c1722300uv6.LJIIIIZZ = C786410Ut5.j4(context.getString(i), Arrays.copyOf(new Object[]{C10EU.LIZJ(user)}, 1));
                        }
                    } else {
                        c1722300uv6 = new C1722300uv6();
                        if (z6) {
                            string = context.getString(2131822989);
                            strJ4 = context.getString(2131822987);
                        } else if (!z7) {
                            string = "";
                        } else {
                            string = context.getString(2131822977);
                            strJ4 = C786410Ut5.j4(context.getString(2131822976), Arrays.copyOf(new Object[]{C10EU.LIZJ(user)}, 1));
                        }
                        if (z9) {
                            string = context.getString(2131824639);
                            strJ4 = context.getString(2131824638);
                        } else if (z11) {
                            strJ4 = context.getString(2131821720, C10EU.LIZJ(user));
                        } else if (z8) {
                            String string3 = context.getString(2131822983);
                            strJ4 = context.getString(2131822982);
                            string = C786410Ut5.j4(string3, Arrays.copyOf(new Object[]{C10EU.LIZJ(user)}, 1));
                        } else if (z10) {
                            string = context.getString(2131822989);
                            strJ4 = context.getString(2131822987);
                        }
                        c1722300uv6.LJI = string;
                        c1722300uv6.LJIIIIZZ = strJ4;
                    }
                } else {
                    c1722300uv6 = new C1722300uv6();
                    c1722300uv6.LJI = "";
                    c1722300uv6.LJIIIIZZ = "";
                }
            }
            c1749280vcc.setStatus(c1722300uv6);
        }
    }

    @Override // X.InterfaceC645470PTl
    public final void Tr(RecyclerView.ViewHolder viewHolder) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewAttachedToWindow: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public void Uq2(Exception exc) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showLoadError: ");
        sbLIZ.append(exc);
        C2188811AlT.LIZIZ(sbLIZ);
        C1258410iqt.LJ(true);
        oS(EnumC1258430iqv.REFRESH, EnumC1258450iqx.LOAD_FAILED);
        if (!isViewValid()) {
            return;
        }
        C1258410iqt.LJFF(this.LLJJI, C0W93.FAIL);
        C1259360isQ c1259360isQ = this.LLJJL;
        if (c1259360isQ != null && C086I.LIZIZ(c1259360isQ.mmItems)) {
            c1259360isQ.clearData();
        }
        this.LLJJIJI = true;
    }

    @Override // X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        InterfaceC1258470iqz interfaceC1258470iqz;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showLoadMoreError: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        C1258410iqt.LJ(true);
        if (!isViewValid()) {
            return;
        }
        oS(EnumC1258430iqv.LOAD_MORE, EnumC1258450iqx.LOAD_FAILED);
        C1259360isQ c1259360isQ = this.LLJJL;
        if (c1259360isQ != null) {
            if (c1259360isQ.getItemCount() == 0 && (interfaceC1258470iqz = this.LLJJJJJIL) != null) {
                interfaceC1258470iqz.LIZJ(this.LLJILLL, this.LLJJI);
            }
            c1259360isQ.showPullUpLoadMore(this.LLJJJIL, false);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            C1257170iot.LIZIZ(activity, C1258410iqt.LIZIZ(this.LLJILLL, this.LLJJI), exc, this.LLJJJJ);
        }
    }

    public boolean XS(String str) {
        boolean zLJIIL;
        EnumC1258430iqv enumC1258430iqv;
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryRefreshList type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        C1258410iqt.LJ(true);
        if (!isViewValid()) {
            return false;
        }
        getActivity();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C1255920ims<AbstractC1255880imo<?, ?>> c1255920ims = this.LLJLIL;
                if (c1255920ims != null) {
                    zLJIIL = c1255920ims.LJIIL();
                } else {
                    zLJIIL = true;
                }
                if (this.LLJJI) {
                    if (TextUtils.isEmpty(this.LLIZ)) {
                        this.LLIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    }
                    if (TextUtils.isEmpty(this.LLIZLLLIL)) {
                        this.LLIZLLLIL = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
                    }
                }
                if (TextUtils.isEmpty(this.LLIZ)) {
                    RS(false);
                    return zLJIIL;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onPageRefresh: type=");
                sbLIZ2.append(this.LLJILLL);
                sbLIZ2.append(" isMyProfile=");
                sbLIZ2.append(this.LLJJI);
                C2188811AlT.LIZIZ(sbLIZ2);
                RecyclerView recyclerView = this.LLJJJIL;
                if (recyclerView != null) {
                    C2211751BhN.LIZIZ(recyclerView);
                }
                int iHashCode = str.hashCode();
                if (iHashCode == -2061118386 ? !str.equals("fresh_click_show_error") : iHashCode == -772014605 ? !str.equals("fresh_on_start") : !(iHashCode == 128298948 && str.equals("fresh_lazy_data"))) {
                    enumC1258430iqv = EnumC1258430iqv.REFRESH;
                } else {
                    enumC1258430iqv = EnumC1258430iqv.REFRESH_FIRST;
                }
                oS(enumC1258430iqv, EnumC1258450iqx.LOADING);
                C1255920ims<AbstractC1255880imo<?, ?>> c1255920ims2 = this.LLJLIL;
                if (c1255920ims2 != null) {
                    Object[] objArr = new Object[8];
                    objArr[0] = 1;
                    objArr[1] = Boolean.TRUE;
                    objArr[2] = this.LLIZ;
                    objArr[3] = Integer.valueOf(this.LLJILLL);
                    if (this.LLJJI) {
                        i = LSPassThroughRecordSizeConfig.DEFAULT;
                    } else {
                        i = 2000;
                    }
                    objArr[4] = Integer.valueOf(i);
                    objArr[5] = this.LLIZLLLIL;
                    objArr[6] = "";
                    objArr[7] = str;
                    c1255920ims2.LIZJ(objArr);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("sendRequest ");
                sbLIZ3.append(this.LLIZ);
                sbLIZ3.append(' ');
                sbLIZ3.append(this.LLJILLL);
                sbLIZ3.append(' ');
                sbLIZ3.append(this.LLIZLLLIL);
                C2188811AlT.LIZIZ(sbLIZ3);
                this.LLJJIJI = false;
                return zLJIIL;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("tryRefreshList network error, type=");
        sbLIZ4.append(this.LLJILLL);
        sbLIZ4.append(" isMyProfile=");
        sbLIZ4.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ4);
        C1258410iqt.LJ(true);
        US();
        this.LLJJIJI = true;
        return false;
    }

    @Override // X.InterfaceC1259540isi
    public final void Zx(InterfaceC1259240isE interfaceC1259240isE) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerProfileUserChangeListener: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1212360hec
    public final void bD1(Exception exc) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showLoadLatestError: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void c5(String str) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadMore: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLJLILLLLZIIL);
        C2188811AlT.LIZIZ(sbLIZ);
        C1258410iqt.LJ(true);
        if (!this.LLJLILLLLZIIL) {
            return;
        }
        if (TextUtils.isEmpty(this.LLIZ) && TextUtils.isEmpty(this.LLIZLLLIL)) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("ProfileBaseAwemeList", "loadMore account info is empty");
            return;
        }
        C1255920ims<AbstractC1255880imo<?, ?>> c1255920ims = this.LLJLIL;
        if (c1255920ims != null) {
            Object[] objArr = new Object[7];
            objArr[0] = 4;
            objArr[1] = Boolean.TRUE;
            objArr[2] = this.LLIZ;
            objArr[3] = Integer.valueOf(this.LLJILLL);
            if (this.LLJJI) {
                i = LSPassThroughRecordSizeConfig.DEFAULT;
            } else {
                i = 2000;
            }
            objArr[4] = Integer.valueOf(i);
            objArr[5] = this.LLIZLLLIL;
            objArr[6] = str;
            c1255920ims.LIZJ(objArr);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void cS(boolean z) {
        RecyclerView recyclerView;
        if (!isViewValid() || (recyclerView = this.LLJJJIL) == null || recyclerView.getChildCount() <= 0) {
            return;
        }
        if (z) {
            recyclerView.smoothScrollToPosition(0);
        } else {
            recyclerView.scrollToPosition(0);
        }
    }

    @Override // X.InterfaceC1259540isi
    public final void gC(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGuideCardOnDisplay: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public void n2(boolean z) {
        this.LLJLILLLLZIIL = z;
        RecyclerView recyclerView = this.LLJJJIL;
        if (recyclerView != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS38S0110000_19(this, z, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WrapGridLayoutManager wrapGridLayoutManager = this.LLJL;
        if (wrapGridLayoutManager != null) {
            wrapGridLayoutManager.LJIJ(ES());
        }
        RecyclerView recyclerView = this.LLJJJIL;
        if (recyclerView != null) {
            recyclerView.invalidateItemDecorations();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            C1075590e61.LIZ(parentFragment);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLJILLL = arguments.getInt("type");
            this.LLJLL = arguments.getString("user_unique_id");
            String string = arguments.getString("uid", "");
            String string2 = arguments.getString("sec_user_id", "");
            if (string.length() > 0) {
                this.LLIZ = string;
            }
            if (string2.length() > 0) {
                this.LLIZLLLIL = string2;
            }
            this.LLJJI = arguments.getBoolean("is_my_profile");
            this.LLJJ = arguments.getInt("bottom_bar_height", 0);
        }
    }

    @C14EU
    public void onDynamicEvent(C1258460iqy c1258460iqy) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDynamicEvent: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1258460iqy.LIZ == 0) {
            VS("onDynamicEvent", true, false);
        } else {
            oF();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) throws Throwable {
        C1259360isQ c1259360isQ;
        int childCount;
        C1259780it6 c1259780it6;
        Object obj;
        boolean zBooleanValue = z;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/profile/platform/framework/aweme/profile/tab/profiletab/ProfileBaseAwemeListFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(zBooleanValue)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mc5PPyDR0YS/W4tNR7d3eDWYJLHJF0jXFoPO/kpXD3cFfbi8TKgjEb2J3v7rPcr0Hp6OFNHA9+K+AfioaD2+vWGoIpGCbhwOsazaokg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(zBooleanValue);
        C1258410iqt.LJ(true);
        if (!isViewValid()) {
            if (this.LLJJIJIIJIL && zBooleanValue) {
                this.LLJJIII = true;
                return;
            }
            return;
        }
        if (!this.LLJJI && !Intrinsics.LJFF(this.LLJJIJIL, this.LLIZ)) {
            this.LLJLLL = Integer.MAX_VALUE;
            this.LLJZ = 0;
            this.LLJLLIL = 0;
        }
        if (zBooleanValue) {
            this.LLJJIJIIJIL = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showCover: isType=");
            sbLIZ.append(this.LLJILLL);
            sbLIZ.append(" isMyProfile=");
            sbLIZ.append(this.LLJJI);
            sbLIZ.append(" userVisibleHint=");
            sbLIZ.append(getUserVisibleHint());
            C2188811AlT.LIZIZ(sbLIZ);
            C1258410iqt.LJ(true);
            if (getUserVisibleHint() && (c1259360isQ = this.LLJJL) != null && !c1259360isQ.LLJILLL) {
                c1259360isQ.LLJILLL = true;
                RecyclerView recyclerView = this.LLJJJIL;
                if (recyclerView != null && (childCount = recyclerView.getChildCount()) >= 0) {
                    int i = 0;
                    while (true) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
                        if ((viewHolderFindViewHolderForAdapterPosition instanceof C1259780it6) && (c1259780it6 = (C1259780it6) viewHolderFindViewHolderForAdapterPosition) != null) {
                            c1259780it6.a6();
                        }
                        if (i == childCount) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            VS("setUserVisibleHint", false, true);
            return;
        }
        this.LLJJIJIL = this.LLIZ;
        oF();
    }

    private final void QS(View view, String str) {
        Object tag;
        if (view == null || (tag = view.getTag(R.id.s29)) == null) {
            tag = 0L;
        }
        long jLongValue = ((Long) tag).longValue();
        if (jLongValue > 0) {
            if (view != null) {
                view.setTag(R.id.s29, 0L);
            }
            C1250680ieQ.LJIJI(Long.valueOf(C1256070in7.LIZ), this.LLIZ, this.LLILLL, Boolean.valueOf(this.LLJJI), Long.valueOf(SystemClock.elapsedRealtime() - jLongValue), Integer.valueOf(this.LLJILLL), str);
        }
    }

    public void LLJJJIL(List<Aweme> list, boolean z) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefreshResult: ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(' ');
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C1258410iqt.LJ(true);
        if (!isViewValid()) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("hideLoading: type=");
        sbLIZ2.append(this.LLJILLL);
        sbLIZ2.append(" isMyProfile=");
        sbLIZ2.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1749280vcc c1749280vcc = this.LLJJJJ;
        if (c1749280vcc == null || c1749280vcc.getVisibility() != 8) {
            C1749280vcc c1749280vcc2 = this.LLJJJJ;
            if (c1749280vcc2 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc2, 8);
            }
            QS(this.LLJJJJ, "ball_loading");
        }
        oS(EnumC1258430iqv.REFRESH_FIRST, EnumC1258450iqx.LOADED);
        n2(z);
        C1259360isQ c1259360isQ = this.LLJJL;
        if (c1259360isQ != null) {
            c1259360isQ.setData(list);
        }
        if (C086I.LIZIZ(list)) {
            RS(false);
        } else {
            HS();
        }
        C1258410iqt.LJFF(this.LLJJI, C0W93.SUCCESS);
        int iLIZIZ = C1253150iiP.LIZIZ();
        C1253330iih c1253330iih = C1253150iiP.LIZ;
        if (c1253330iih != null) {
            c1253330iih.LIZ(iLIZIZ, true);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Pj(List<Aweme> list, boolean z) {
        int size;
        InterfaceC1258470iqz interfaceC1258470iqz;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadMoreResult: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append(" list=");
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        sbLIZ.append(" hasMore=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!isViewValid()) {
            return;
        }
        n2(z);
        C1259360isQ c1259360isQ = this.LLJJL;
        if (c1259360isQ != null) {
            if (c1259360isQ.getItemCount() == 0 && (interfaceC1258470iqz = this.LLJJJJJIL) != null) {
                if (!C086I.LIZIZ(list)) {
                    interfaceC1258470iqz.LIZ(this.LLJILLL);
                } else if (!z) {
                    interfaceC1258470iqz.LIZJ(this.LLJILLL, this.LLJJI);
                }
            }
            c1259360isQ.setDataAfterLoadMore(list);
        }
        C1259360isQ c1259360isQ2 = this.LLJJL;
        if (c1259360isQ2 != null && c1259360isQ2.getBasicItemCount() == 0) {
            if (z && !JS()) {
                c5("load_more_feed_empty_but_has_more");
                return;
            } else {
                RS(false);
                return;
            }
        }
        HS();
    }

    @Override // X.InterfaceC1212360hec
    public final void mE(List<Aweme> list, boolean z) {
        int size;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadLatestResult: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append(" list=");
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        sbLIZ.append(" hasMore=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        C21689319uV c21689319uV;
        super.onViewCreated(view, bundle);
        if (this.LLJJI) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C1259360isQ c1259360isQ = new C1259360isQ(getActivity(), this, str, this.LLJJI, this.LLJILLL, this, this, this.LLIZ, this.LLIZLLLIL, this);
        this.LLJJL = c1259360isQ;
        c1259360isQ.LLJL = this.LLJZIJLIL;
        c1259360isQ.setLoadMoreListener(this);
        C1259360isQ c1259360isQ2 = this.LLJJL;
        if (c1259360isQ2 != null) {
            c1259360isQ2.LLJILLL = this.LLJJIII;
        }
        RecyclerView recyclerView = this.LLJJJIL;
        if (recyclerView != null) {
            recyclerView.setAdapter(c1259360isQ2);
            recyclerView.getRecycledViewPool().setMaxRecycledViews(0, 25);
            if (!C20595415iS.LIZIZ()) {
                C1260260its c1260260its = new C1260260its();
                recyclerView.addOnScrollListener(c1260260its);
                this.LLJJJJLIIL = new C1259890itH(recyclerView, c1260260its);
            }
            recyclerView.setPadding(0, 0, 0, this.LLJJ);
        }
        Rect rect = new Rect();
        RecyclerView recyclerView2 = this.LLJJJIL;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(new AsS33S0200000_19(this, rect, 3));
        }
        C1259360isQ c1259360isQ3 = this.LLJJL;
        if (C300180Bpg.LIZ() && c1259360isQ3 != null) {
            c1259360isQ3.LLLLLIL = new InterfaceC1258330iql() { // from class: X.0iqW
                @Override // X.InterfaceC1258330iql
                public final void LIZ() {
                    ProfileBaseAwemeListFragment profileBaseAwemeListFragment = this.LIZ;
                    if (profileBaseAwemeListFragment.LLJLILLLLZIIL) {
                        return;
                    }
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(profileBaseAwemeListFragment), null, null, new C1258170iqV(this.LIZ, null), 3);
                }
            };
        }
        RecyclerView recyclerView3 = this.LLJJJIL;
        if ((recyclerView3 instanceof C21689319uV) && (c21689319uV = (C21689319uV) recyclerView3) != null) {
            c21689319uV.setLabel("profile_list");
        }
        if (this.LLJJI) {
            str2 = "my_profile";
        } else {
            str2 = "user_profile";
        }
        C0VWN.LIZ(str2, false).LIZIZ(this.LLJJJIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initAwemePresenter: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        C1255920ims<AbstractC1255880imo<?, ?>> c1255920imsWS = wS();
        this.LLJLIL = c1255920imsWS;
        if (c1255920imsWS != null) {
            c1255920imsWS.LJIIJJI(this);
            C1255780ime c1255780ime = new C1255780ime();
            c1255780ime.LLIZLLLIL = this.LLL;
            C1255780ime.LJJIJ(getActivity());
            c1255920imsWS.LJIIJ(c1255780ime);
        }
    }

    public final Bundle yS(Aweme aweme, String str) {
        String str2;
        int i;
        int followStatus;
        FeedItemList feedItemList;
        LogPbBean logPbBean;
        String imprId;
        T t;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("video_id", aweme.getAid(), bundle);
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme.getAid(), bundle);
        if (this.LLJJI) {
            str2 = "from_profile_self";
        } else {
            str2 = "from_profile_other";
        }
        C786410Ut5.LJJJI("video_from", str2, bundle);
        bundle.putInt("video_type", this.LLJILLL);
        C786410Ut5.LJJJI("userid", this.LLIZ, bundle);
        C786410Ut5.LJJJI("sec_userid", this.LLIZLLLIL, bundle);
        bundle.putInt("profile_enterprise_type", AwemeExtKt.getEnterpriseType(aweme));
        String str3 = "";
        C786410Ut5.LJJJI("enter_method", "", bundle);
        C786410Ut5.LJJJI("like_enter_method", "", bundle);
        C786410Ut5.LJJJI("content_source", "", bundle);
        C786410Ut5.LJJJI("refer", C2277711EDh.LIZIZ.LJJ(Integer.valueOf(this.LLJILLL), str), bundle);
        C786410Ut5.LJJJI("previous_page", this.LLILLL, bundle);
        bundle.putBoolean("is_skip_event_tracking", this.LLILZ);
        C786410Ut5.LJJJI("from_group_id", this.LLJZIJLIL, bundle);
        Object data = null;
        C786410Ut5.LJJJI("extra_previous_page_position", null, bundle);
        C786410Ut5.LJJJI("source_page", null, bundle);
        C786410Ut5.LJJJI("tab_name", this.LLILLJJLI, bundle);
        C786410Ut5.LJJJI("enter_from_request_id", null, bundle);
        C786410Ut5.LJJJI("feeds_aweme_id", this.LLJZIJLIL, bundle);
        boolean z = true;
        if (this.LLJILLL == 0) {
            i = 1;
        } else {
            i = 0;
        }
        bundle.putInt("from_post_list", i);
        C786410Ut5.LJJJI("pre_event_type", null, bundle);
        User user = this.LLL;
        if (user != null) {
            followStatus = user.getFollowStatus();
        } else {
            followStatus = 0;
        }
        bundle.putInt("follow_status", followStatus);
        C1255920ims<AbstractC1255880imo<?, ?>> c1255920ims = this.LLJLIL;
        if (c1255920ims != null && (t = c1255920ims.LL) != 0) {
            data = t.getData();
        }
        if ((data instanceof FeedItemList) && (feedItemList = (FeedItemList) data) != null && (logPbBean = feedItemList.logPb) != null && (imprId = logPbBean.getImprId()) != null) {
            str3 = imprId;
        }
        C786410Ut5.LJJJI("impr_id", str3, bundle);
        if (aweme.getAwemeType() != 41 && aweme.getAwemeType() != 43) {
            z = false;
        }
        bundle.putBoolean("isNowType", z);
        bundle.getSerializable("matched_friend_strcut");
        C786410Ut5.LJJJI("homepage_uid", this.LLIZ, bundle);
        C786410Ut5.LJJJI("profile_entrance_id", String.valueOf(C1256070in7.LIZ), bundle);
        return bundle;
    }

    @Override // X.InterfaceC1260110itd
    public void I2(Aweme aweme, View view, String str) {
        AbstractC1255880imo abstractC1255880imo;
        boolean z;
        int iLLLII;
        String strLIZIZ;
        String string;
        String string2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClick: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        C19EG activity = getActivity();
        if (activity != null && !C0OBG.LIZIZ(view) && aweme != null) {
            getContext();
            try {
                if (C036E.LIZ.LIZIZ()) {
                    Map<String, String> map = this.LLJJJ;
                    if (map != null && !map.isEmpty()) {
                        C20684815ws.LJIILLIIL("livesdk_others_homepage_video_click", map);
                    }
                    C1255920ims<AbstractC1255880imo<?, ?>> c1255920ims = this.LLJLIL;
                    if (c1255920ims != null) {
                        abstractC1255880imo = (AbstractC1255880imo) c1255920ims.LL;
                    } else {
                        abstractC1255880imo = null;
                    }
                    C1603960rqE.LIZ = abstractC1255880imo;
                    Bundle bundleYS = yS(aweme, str);
                    if (this.LLJILLL == 0 && activity.getIntent().getBooleanExtra("is_show_follow_btn_on_bottom", false)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean booleanExtra = activity.getIntent().getBooleanExtra("is_new_suggested", false);
                    if (view == null) {
                        if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZIZ(getContext())) {
                            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "//duo");
                            smartRouteBuildRoute.withParam(bundleYS);
                            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
                            smartRouteBuildRoute.withParam("video_from", "from_profile_other");
                            smartRouteBuildRoute.withParam("profile_enterprise_type", AwemeExtKt.getEnterpriseType(aweme));
                            smartRouteBuildRoute.withParam("duo_type", "duo_detail");
                            smartRouteBuildRoute.open();
                        } else {
                            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(getActivity(), "aweme://aweme/detail/");
                            smartRouteBuildRoute2.withParam(bundleYS);
                            smartRouteBuildRoute2.withParam("is_show_follow_btn_on_bottom", z);
                            smartRouteBuildRoute2.withParam("rec_type", FS());
                            smartRouteBuildRoute2.withParam("relation_type", GS());
                            smartRouteBuildRoute2.withParam("is_new_suggested", booleanExtra);
                            smartRouteBuildRoute2.open();
                        }
                    } else {
                        C1606420ruC c1606420ruCLIZ = C1607950rwf.LIZ(view, view.getWidth(), view.getHeight());
                        if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZIZ(getContext())) {
                            SmartRoute smartRouteBuildRoute3 = SmartRouter.buildRoute(getContext(), "//duo");
                            smartRouteBuildRoute3.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
                            smartRouteBuildRoute3.withParam("profile_enterprise_type", AwemeExtKt.getEnterpriseType(aweme));
                            smartRouteBuildRoute3.withParam("video_from", "from_profile_other");
                            smartRouteBuildRoute3.withBundleAnimation(c1606420ruCLIZ.LJFF());
                            smartRouteBuildRoute3.withParam("duo_type", "duo_detail");
                            smartRouteBuildRoute3.open();
                        } else {
                            C1259360isQ c1259360isQ = this.LLJJL;
                            if (c1259360isQ != null) {
                                iLLLII = c1259360isQ.LLLII(aweme.getAid());
                            } else {
                                iLLLII = 0;
                            }
                            int i = this.LLJILLL;
                            if (i != 0) {
                                if (i != 1) {
                                    if (i != 4) {
                                        if (i != 14) {
                                            strLIZIZ = "c0.d0";
                                        } else {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("c9951.d7314_i");
                                            sbLIZ2.append(iLLLII);
                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                        }
                                    } else {
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("c1746.d9807_i");
                                        sbLIZ3.append(iLLLII);
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                    }
                                } else {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("c2912.d5623_i");
                                    sbLIZ4.append(iLLLII);
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                                }
                            } else {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("c9478.d29480_i");
                                sbLIZ5.append(iLLLII);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                            }
                            SmartRoute smartRouteBuildRoute4 = SmartRouter.buildRoute(getActivity(), "aweme://aweme/detail/");
                            smartRouteBuildRoute4.withParam(bundleYS);
                            smartRouteBuildRoute4.withBundleAnimation(c1606420ruCLIZ.LJFF());
                            smartRouteBuildRoute4.withParam("activity_has_activity_options", true);
                            smartRouteBuildRoute4.withParam("is_show_follow_btn_on_bottom", z);
                            smartRouteBuildRoute4.withParam("rec_type", FS());
                            smartRouteBuildRoute4.withParam("relation_type", GS());
                            smartRouteBuildRoute4.withParam("is_new_suggested", booleanExtra);
                            Bundle arguments = getArguments();
                            if (arguments != null) {
                                string = arguments.getString("enter_from");
                            } else {
                                string = null;
                            }
                            smartRouteBuildRoute4.withParam("relation_enter_from", string);
                            Bundle arguments2 = getArguments();
                            if (arguments2 != null) {
                                string2 = arguments2.getString("rfevent_previous_page");
                            } else {
                                string2 = null;
                            }
                            smartRouteBuildRoute4.withParam("rfevent_previous_page", string2);
                            smartRouteBuildRoute4.withParam("action_type", EnumC1260930iux.PROFILE_VIDEO_FOLLOW.getType());
                            smartRouteBuildRoute4.withParam("source_btm_token", BtmSDK.INSTANCE.createJumpSourceBtmToken(strLIZIZ, PageFinder.via(view), null));
                            smartRouteBuildRoute4.open();
                            PS(aweme);
                        }
                    }
                    if (this.LLJJI) {
                        C1483370ohj.LIZ(aweme);
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1233040iBy c1233040iBy = new C1233040iBy(getContext());
            c1233040iBy.LIZIZ(2131837962);
            c1233040iBy.LIZLLL();
        }
    }

    public final void VS(String str, final boolean z, final boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startDynamicCoverAnimation: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!isViewValid()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" startDynamicCoverAnimation: failed, reason userVisibleHint is false");
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        C15O7.LJIIIIZZ(100L).LJ(new InterfaceC2385309Wh() { // from class: X.0iqu
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7<Void> c15o7) {
                C1259890itH c1259890itH;
                C1C7U.LIZ("ProfileBaseAwemeListFragment@d2b.startDynamicCoverAnimation$1");
                if (C0J0T.LIZJ(this.LIZ.getView()) && (c1259890itH = this.LIZ.LLJJJJLIIL) != null) {
                    c1259890itH.LIZ(z, z2);
                }
                C1C7U.LIZIZ("ProfileBaseAwemeListFragment@d2b.startDynamicCoverAnimation$1");
                return null;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C21689319uV c21689319uV;
        this.LLJJIJI = true;
        View viewLIZJ = C20673215v0.LIZJ(R.layout.ecu, getActivity());
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, viewLIZJ.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            if (!((Boolean) C0BMU.LIZIZ.getValue()).booleanValue()) {
                viewLIZJ.setBackgroundColor(iIntValue);
            }
        }
        this.LLJJJJ = (C1749280vcc) viewLIZJ.findViewById(R.id.w28);
        this.LLJL = new WrapGridLayoutManager(ES(), 1, (Context) getActivity(), false);
        RecyclerView recyclerView = (RecyclerView) viewLIZJ.findViewById(R.id.hto);
        C19GS c19gs = null;
        if (recyclerView != null) {
            RecyclerView recyclerView2 = this.LLJJJIL;
            if (recyclerView2 instanceof C21689319uV) {
                c21689319uV = (C21689319uV) recyclerView2;
            } else {
                c21689319uV = null;
            }
            if (c21689319uV != null) {
                c21689319uV.setLabel("profile_list");
            }
            recyclerView.setItemAnimator(null);
            recyclerView.setOverScrollMode(2);
            recyclerView.setLayoutManager(this.LLJL);
            recyclerView.addItemDecoration(new C0DXZ((int) C12ES.LIZJ(1.0f, recyclerView.getContext())));
            RecyclerView recyclerView3 = this.LLJJJIL;
            if (recyclerView3 != null) {
                recyclerView3.setItemViewCacheSize(3);
            }
        } else {
            recyclerView = null;
        }
        this.LLJJJIL = recyclerView;
        try {
            ViewTreeLifecycleOwner.set(viewLIZJ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLIZJ, this);
            viewLIZJ.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLIZJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLIZJ;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public boolean qS(EnumC1258430iqv enumC1258430iqv, EnumC1258450iqx enumC1258450iqx, C1258980iro c1258980iro) {
        if (C0BXX.LIZ()) {
            EnumC1258430iqv enumC1258430iqv2 = EnumC1258430iqv.REFRESH_FIRST;
            if (enumC1258430iqv == enumC1258430iqv2 || enumC1258430iqv == EnumC1258430iqv.REFRESH) {
                AbstractC21673619ry adapter = null;
                if (enumC1258430iqv == enumC1258430iqv2 && enumC1258450iqx == EnumC1258450iqx.LOADING && getUserVisibleHint()) {
                    RecyclerView recyclerView = this.LLJJJIL;
                    if (recyclerView != null) {
                        adapter = recyclerView.getAdapter();
                    }
                    if (!Intrinsics.LJFF(adapter, zS())) {
                        RecyclerView recyclerView2 = this.LLJJJIL;
                        if (recyclerView2 != null) {
                            recyclerView2.setAdapter(zS());
                        }
                        C0H49 c0h49ZS = zS();
                        if (c0h49ZS != null) {
                            c0h49ZS.LLLFZ();
                        }
                    }
                    RecyclerView recyclerView3 = this.LLJJJIL;
                    if (recyclerView3 != null) {
                        recyclerView3.setTag(R.id.s29, Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                } else if (enumC1258450iqx != EnumC1258450iqx.LOADING) {
                    RecyclerView recyclerView4 = this.LLJJJIL;
                    if (recyclerView4 != null) {
                        adapter = recyclerView4.getAdapter();
                    }
                    if (!Intrinsics.LJFF(adapter, this.LLJJL)) {
                        RecyclerView recyclerView5 = this.LLJJJIL;
                        if (recyclerView5 != null) {
                            recyclerView5.setAdapter(this.LLJJL);
                        }
                        C0H49 c0h49ZS2 = zS();
                        if (c0h49ZS2 != null) {
                            c0h49ZS2.LLLI();
                        }
                        QS(this.LLJJJIL, "shimmer");
                    }
                }
            }
            return super.qS(enumC1258430iqv, enumC1258450iqx, c1258980iro);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0178  */
    @Override // X.InterfaceC1260110itd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Xt(android.view.View r35, com.ss.android.ugc.aweme.feed.model.Aweme r36, java.lang.String r37, int r38) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment.Xt(android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, int):void");
    }

    @Override // X.InterfaceC1260110itd
    public final void xe(View view, Aweme aweme, String str, int i) {
        I2(aweme, view, str);
    }
}
