package com.ss.android.ugc.aweme.challenge.ui;

import X.AbstractC1252750ihl;
import X.AbstractC19417810y0;
import X.AbstractC480470Isn;
import X.AnonymousClass0412;
import X.C004I;
import X.C01GW;
import X.C0OGM;
import X.C0XKC;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1258150iqT;
import X.C1261230ivR;
import X.C1264160j0A;
import X.C12ES;
import X.C1398420mUi;
import X.C13BV;
import X.C13LE;
import X.C1401250mZH;
import X.C1401640mZu;
import X.C14EU;
import X.C1634100scq;
import X.C1644460stY;
import X.C16FB;
import X.C1749280vcc;
import X.C1765020w20;
import X.C19341510lh;
import X.C19369010q8;
import X.C19371010qS;
import X.C19406010w6;
import X.C19418810yA;
import X.C19418910yB;
import X.C19419110yD;
import X.C19419210yE;
import X.C19719912Dl;
import X.C19Y3;
import X.C20673215v0;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C292901Bn;
import X.C435480H5u;
import X.C446980Hfs;
import X.C481090Itn;
import X.C629770On1;
import X.C737030Svd;
import X.C786410Ut5;
import X.C960203pA;
import X.C993480bxa;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1401310mZN;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1670800ta2;
import X.InterfaceC1685420txc;
import X.InterfaceC19400810vG;
import X.InterfaceC19405710w3;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.AObserverS224S0100000_21;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ICommercePageTrackingService;
import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.VopSignUpConfig;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS317S0000000_29;
import kotlin.jvm.internal.AwS145S0110000_29;
import kotlin.jvm.internal.AwS157S0400000_29;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public class ChallengeDetailFragment extends BaseDetailFragment implements InterfaceC1171660gay, InterfaceC1075600e62<AnonymousClass0412> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkKCM/LSHELIOSsrLGEmIWsPIS4/JCAiLioXLTEtICMVOiQrJCo9PA==";
    public View LL;
    public LinearLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public TuxIconView LLILZ;
    public RelativeLayout LLILZIL;
    public FrameLayout LLILZLL;
    public C481090Itn LLIZ;
    public C1749280vcc LLIZLLLIL;
    public TuxIconView LLJ;
    public C435480H5u LLJI;
    public RelativeLayout LLJIJIL;
    public TuxIconView LLJILJIL;
    public SmartImageView LLJILJILJ;
    public FrameLayout LLJILLL;
    public AbstractC19417810y0 LLJJLIIIJLLLLLLLZ;
    public C993480bxa LLJL;
    public InterfaceC19405710w3 LLJLIL;
    public DetailAwemeListFragment LLJLILLLLZIIL;
    public String LLJLL;
    public ChallengeDetail LLJLLIL;
    public Challenge LLJLLL;
    public boolean LLJZ;
    public boolean LLLF;
    public int LLLFF;
    public boolean LLLFFI;
    public String LLLFZ;
    public boolean LLLII;
    public boolean LLLIIII;
    public AwS562S0100000_18 LLLIIIIL;
    public final lifecycleAwareLazy LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public C1401640mZu LLLILZ;
    public boolean LLLILZJ;
    public C19341510lh LLLILZLLLI;
    public boolean LLLIZZ;
    public int LLLJ;
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.navArg(this);
    public final C01GW LLJJI = C292901Bn.LIZ(new AwS565S0100000_21(this, 102));
    public final C01GW LLJJIII = C292901Bn.LIZ(new AwS573S0100000_29(this, 57));
    public final C01GW LLJJIJI = C292901Bn.LIZ(new AwS573S0100000_29(this, 59));
    public final C01GW LLJJIJIIJIL = C292901Bn.LIZ(new AwS573S0100000_29(this, 51));
    public final C01GW LLJJIJIL = C292901Bn.LIZ(new AwS573S0100000_29(this, 50));
    public final C01GW LLJJJ = C292901Bn.LIZ(new AwS573S0100000_29(this, 53));
    public final C01GW LLJJJIL = C292901Bn.LIZ(new AwS573S0100000_29(this, 54));
    public final C01GW LLJJJJ = C292901Bn.LIZ(new AwS573S0100000_29(this, 55));
    public final C01GW LLJJJJJIL = C292901Bn.LIZ(new AwS573S0100000_29(this, 58));
    public final C01GW LLJJJJLIIL = C292901Bn.LIZ(new AwS573S0100000_29(this, 56));
    public final C01GW LLJJL = C292901Bn.LIZ(new AwS573S0100000_29(this, 52));
    public int LLJZIJLIL = -1;
    public boolean LLL = true;
    public String LLLI = "";
    public final AnonymousClass0412 LLLIIIL = new AnonymousClass0412();

    public ChallengeDetailFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChallengeDetailJediViewModel.class);
        AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(c19719912DlLIZ, 63);
        this.LLLIIL = new lifecycleAwareLazy(this, awS573S0100000_29, new AwS157S0400000_29(this, awS573S0100000_29, c19719912DlLIZ, AFwS317S0000000_29.get$arr$(0), 1));
        this.LLLIILIL = C292901Bn.LIZ(new AwS565S0100000_21(this, 103));
        this.LLLIL = C292901Bn.LIZ(AFwS218S0000000_29.get$arr$(41));
        this.LLLJ = -1;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment
    public final String getLabel() {
        return "challenge";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getLabelName(int i) {
        return i != 0 ? i != 1 ? "" : "challenge_fresh" : "challenge";
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final int getResId() {
        return R.layout.aep;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getShootWayLabel() {
        return "click_challenge_shoot";
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public final List<Aweme> RR() {
        DetailAwemeListFragment detailAwemeListFragment;
        C1261230ivR c1261230ivR;
        List list;
        List<InterfaceC19400810vG> list2 = this.mFragments;
        if (list2 == null || !(ListProtector.get(list2, this.mCurPos) instanceof DetailAwemeListFragment)) {
            return C13BV.INSTANCE;
        }
        Object obj = ListProtector.get(this.mFragments, this.mCurPos);
        return (!(obj instanceof DetailAwemeListFragment) || (detailAwemeListFragment = (DetailAwemeListFragment) obj) == null || (c1261230ivR = detailAwemeListFragment.LLJJJJ) == null || (list = c1261230ivR.mmItems) == null) ? C13BV.INSTANCE : list;
    }

    public final SmartImageView UR() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bwv) : null;
            this.LLJILJILJ = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final FrameLayout VR() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bwy) : null;
            this.LLJILLL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final ChallengeDetailParam ZR() {
        return (ChallengeDetailParam) this.LLJJI.getValue();
    }

    public final C435480H5u aS() {
        return (C435480H5u) this.LLJJL.getValue();
    }

    public final View bS() {
        return (View) this.LLJJJIL.getValue();
    }

    public final C16FB cS() {
        return (C16FB) this.LLJJJJ.getValue();
    }

    public final C1749280vcc dS() {
        return (C1749280vcc) this.LLJJJJJIL.getValue();
    }

    public final RelativeLayout gS() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tnm) : null;
            this.LLJIJIL = (RelativeLayout) viewFindViewById;
        }
        return (RelativeLayout) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getCurId() {
        String str = this.LLJLL;
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final AbstractC480470Isn getFragmentPagerAdapter() {
        String str;
        this.mFragments = new ArrayList();
        this.mFragmentList = new ArrayList();
        this.mFragmentTypes = new ArrayList();
        FragmentManager childFragmentManager = getChildFragmentManager();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(AbstractDetailFragment.FRAGMENT_TAG);
        sbLIZ.append('0');
        Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        boolean z = fragmentLJJJJZI instanceof DetailAwemeListFragment;
        Object obj = fragmentLJJJJZI;
        if (!z) {
            C1401250mZH c1401250mZH = new C1401250mZH(ZR().getParentTagId());
            String str2 = this.LLJLL;
            if (str2 == null) {
                str2 = null;
            }
            boolean zIsHashTag = ZR().isHashTag();
            if (ZR().isHashTag()) {
                str = this.LLJLL;
                if (str == null) {
                    str = null;
                }
            } else {
                str = "";
            }
            String enterFrom = ZR().getEnterFrom();
            String str3 = this.LLLI;
            String awemeId = ZR().getAwemeId();
            C1398420mUi c1398420mUi = new C1398420mUi("");
            c1398420mUi.setPreloadInfoInvoke(this.LLLIIIIL);
            DetailAwemeListFragment detailAwemeListFragment = new DetailAwemeListFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "detail_config", c1401250mZH);
            bundle.putInt("detail_aweme_list_type", 2);
            C786410Ut5.LJJJI("event_label", "challenge", bundle);
            C786410Ut5.LJJJI("detail_id", str2, bundle);
            bundle.putBoolean("extra_challenge_is_hashtag", zIsHashTag);
            C786410Ut5.LJJJI("extra_challenge_hashtag_name", str, bundle);
            C786410Ut5.LJJJI("detail_aweme_from", enterFrom, bundle);
            C786410Ut5.LJJJI("detail_aweme_from_aid", awemeId, bundle);
            C786410Ut5.LJJJI("process_id", str3, bundle);
            C786410Ut5.LJJJI("group_id", awemeId, bundle);
            bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
            detailAwemeListFragment.setArguments(bundle);
            detailAwemeListFragment.LLLILZJ = c1398420mUi;
            detailAwemeListFragment.LLJJLIIIJLLLLLLLZ = new InterfaceC1401310mZN() { // from class: X.0mZj
                @Override // X.InterfaceC1401310mZN
                public final void LIZ(boolean z2) {
                    String requestId;
                    T t;
                    String requestId2 = "";
                    if (z2 && TextUtils.equals(this.LIZ.ZR().getEnterFrom(), "from_related_tag")) {
                        C735320Sss c735320Sss = new C735320Sss();
                        ChallengeDetailFragment challengeDetailFragment = this.LIZ;
                        String str4 = challengeDetailFragment.LLJLL;
                        DetailAwemeListFragment detailAwemeListFragment2 = null;
                        if (str4 == null) {
                            str4 = null;
                        }
                        c735320Sss.LJJLIIIJLLLLLLLZ = str4;
                        DetailAwemeListFragment detailAwemeListFragment3 = challengeDetailFragment.LLJLILLLLZIIL;
                        if (detailAwemeListFragment3 == null) {
                            detailAwemeListFragment3 = null;
                        }
                        detailAwemeListFragment3.getClass();
                        try {
                            t = detailAwemeListFragment3.LLILZ.LL;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (!(t instanceof C0X12)) {
                            requestId = "";
                        } else {
                            requestId = ((C0X12) t).getRequestId();
                        }
                        c735320Sss.LJJJJJL(requestId);
                        String enterFrom2 = this.LIZ.ZR().getEnterFrom();
                        if (enterFrom2 == null) {
                            enterFrom2 = "";
                        }
                        c735320Sss.LIZLLL = enterFrom2;
                        c735320Sss.LJLJJLL = this.LIZ.ZR().getParentTagId();
                        c735320Sss.LJIILJJIL();
                        DetailAwemeListFragment detailAwemeListFragment4 = this.LIZ.LLJLILLLLZIIL;
                        if (detailAwemeListFragment4 != null) {
                            detailAwemeListFragment2 = detailAwemeListFragment4;
                        }
                        detailAwemeListFragment2.getClass();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            T t2 = detailAwemeListFragment2.LLILZ.LL;
                            if (t2 instanceof C0X12) {
                                requestId2 = ((C0X12) t2).getRequestId();
                            }
                            jSONObject.put("request_id", requestId2);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        C786410Ut5.J3(jSONObject);
                    }
                    if (!((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).isStandardUIEnable() && !z2 && this.LIZ.cS().LLLFF) {
                        this.LIZ.cS().setRefreshing(false);
                    }
                }
            };
            detailAwemeListFragment.LLLFFI = this.mCurPos == 0;
            detailAwemeListFragment.LLJJJIL = dS();
            detailAwemeListFragment.LLLFZ = true;
            obj = detailAwemeListFragment;
        }
        DetailAwemeListFragment detailAwemeListFragment2 = (DetailAwemeListFragment) obj;
        this.LLJLILLLLZIIL = detailAwemeListFragment2;
        detailAwemeListFragment2.LLJJJIL = dS();
        List<InterfaceC19400810vG> list = this.mFragments;
        DetailAwemeListFragment detailAwemeListFragment3 = this.LLJLILLLLZIIL;
        if (detailAwemeListFragment3 == null) {
            detailAwemeListFragment3 = null;
        }
        list.add(detailAwemeListFragment3);
        List<AmeBaseFragment> list2 = this.mFragmentList;
        DetailAwemeListFragment detailAwemeListFragment4 = this.LLJLILLLLZIIL;
        list2.add(detailAwemeListFragment4 != null ? detailAwemeListFragment4 : null);
        this.mFragmentTypes.add(2);
        if (isHaveLatestTab()) {
            ((ChallengeDetailViewModel) this.LLLIILIL.getValue()).LL.observe(this, new AObserverS224S0100000_21(this, 13));
        }
        ((ChallengeDetailViewModel) this.LLLIILIL.getValue()).LLILLL.observe(this, new AObserverS224S0100000_21(this, 14));
        return new C1258150iqT(getChildFragmentManager(), this.mFragmentList, this.mFragmentTypes);
    }

    public final View hS() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w0u) : null;
            this.LL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final LinearLayout iS() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.y1z) : null;
            this.LLILLJJLI = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ChallengeDetail challengeDetail = this.LLJLLIL;
        if (challengeDetail != null && challengeDetail.previewStatus == 1) {
            ((IAdsPreviewService) ServiceManager.get().getService(IAdsPreviewService.class)).LJI(gS());
        }
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
    }

    public final void PR() {
        Context context = getContext();
        if (context == null || !C960203pA.LIZIZ(context)) {
            SmartImageView smartImageViewUR = UR();
            if (smartImageViewUR != null) {
                C786410Ut5.u5(smartImageViewUR, 1.0f);
                return;
            }
            return;
        }
        SmartImageView smartImageViewUR2 = UR();
        if (smartImageViewUR2 != null) {
            C786410Ut5.u5(smartImageViewUR2, 0.25f);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initData() {
        super.initData();
        C19Y3 c19y3 = this.mTabLayout;
        if (c19y3 != null) {
            c19y3.setBackgroundResource(R.color.ao);
        }
    }

    public final void oS() {
        Context context = getContext();
        if (context == null || !C960203pA.LIZIZ(context)) {
            FrameLayout frameLayoutVR = VR();
            if (frameLayoutVR != null) {
                frameLayoutVR.setBackgroundResource(R.drawable.awz);
            }
            FrameLayout frameLayoutVR2 = VR();
            if (frameLayoutVR2 != null) {
                C786410Ut5.U4(frameLayoutVR2, 1.0f);
            }
        } else {
            FrameLayout frameLayoutVR3 = VR();
            if (frameLayoutVR3 != null) {
                frameLayoutVR3.setBackgroundResource(R.drawable.ax2);
            }
            FrameLayout frameLayoutVR4 = VR();
            if (frameLayoutVR4 != null) {
                C786410Ut5.U4(frameLayoutVR4, 0.25f);
            }
        }
        this.LLLF = true;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C20673215v0.LJIIIIZZ(R.layout.bk3);
    }

    public final List<InterfaceC19400810vG> WR() {
        return this.mFragments;
    }

    @Override // X.InterfaceC1075600e62
    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory jl() {
        return this.LLLIIIL;
    }

    public final void SR(Context context) {
        C19419110yD c19419110yD = C19419110yD.LIZ;
        String str = this.LLJLL;
        String str2 = null;
        if (str == null) {
            str = null;
        }
        c19419110yD.getClass();
        if (C19419110yD.LIZIZ(str)) {
            C19418810yA.LIZIZ.LIZ(context, "feed_banner");
            return;
        }
        C19418910yB c19418910yB = C19418910yB.LIZ;
        String str3 = this.LLJLL;
        if (str3 != null) {
            str2 = str3;
        }
        c19418910yB.getClass();
        if (!C19418910yB.LIZIZ(str2)) {
            return;
        }
        final String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
        C19419210yE.LIZ.getClass();
        C01GW c01gw = C19419210yE.LIZIZ;
        if (((Keva) c01gw.getValue()).getInt("is_first_enter", 1) == 1) {
            C19419210yE.LIZ(1, "feed_banner", curUserId);
            ((Keva) c01gw.getValue()).storeInt("is_first_enter", 0);
        } else {
            C19419210yE.LIZ(0, "feed_banner", curUserId);
        }
        String str4 = ((VopSignUpConfig) C19418910yB.LIZJ.getValue()).webUrl;
        if (str4 == null) {
            str4 = "";
        }
        SmartRouter.buildRoute(context, str4).open(0, new OnActivityResultCallback() { // from class: X.10y6
            @Override // com.bytedance.router.OnActivityResultCallback
            public final void onActivityResult(int i, int i2, Intent intent) {
                C19419210yE c19419210yE = C19419210yE.LIZ;
                String str5 = curUserId;
                c19419210yE.getClass();
                C19419210yE.LIZIZ("feed_banner", str5);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initArguments(Bundle bundle) {
        String cid = ZR().getCid();
        String str = "";
        if (cid == null) {
            cid = "";
        }
        this.LLJLL = cid;
        this.LLJZIJLIL = ZR().getShowTabIndex();
        String processId = ZR().getProcessId();
        if (processId != null) {
            str = processId;
        }
        this.LLLI = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0321  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mS(com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r19) {
        /*
            Method dump skipped, instruction units count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment.mS(com.ss.android.ugc.aweme.challenge.model.ChallengeDetail):void");
    }

    public final void nS(Throwable th) {
        C1264160j0A.LIZIZ(dS(), "ChallengeDetail", th, new AwS573S0100000_29(this, 62));
        C786410Ut5.LLLZLZ(dS(), 0);
    }

    @C14EU
    public final void onAntiCrawlerEvent(C0XKC c0xkc) {
        String str = c0xkc.LIZ;
        if (str != null && a0.LJJIIZI(str, "/aweme/v1/challenge/detail/?", false)) {
            EventBus.LIZLLL().LIZIZ(c0xkc);
            cb(true, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @C14EU
    public final void onMusicCollectEvent(C629770On1 c629770On1) {
        MusicModel musicModel;
        Music music;
        Music next;
        if (!isViewValid() || (musicModel = c629770On1.LIZIZ) == null || (music = musicModel.getMusic()) == null) {
            return;
        }
        int i = c629770On1.LIZ;
        music.setCollectStatus(i);
        Challenge challenge = this.LLJLLL;
        if (challenge != null && challenge.getConnectMusics() != null) {
            Iterator<Music> it2 = this.LLJLLL.getConnectMusics().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getMid(), music.getMid())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Music music2 = next;
            if (music2 != null) {
                music2.setCollectStatus(i);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment
    public final void onPreVideoRecord(Intent intent) {
        if (TextUtils.isEmpty(this.LLLFZ)) {
            this.LLLFZ = UUID.randomUUID().toString();
        }
        intent.putExtra("creation_id", this.LLLFZ);
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        String str;
        Aweme awemeLLILZ;
        List<Challenge> challengeList;
        if (c737030Svd.LIZ == 2 && isViewValid() && this.LLJLLL != null) {
            Object obj = c737030Svd.LIZIZ;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str) && (awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str)) != null && (challengeList = awemeLLILZ.getChallengeList()) != null) {
                Iterator<Challenge> it2 = challengeList.iterator();
                while (it2.hasNext()) {
                    if (C2093608Ic.LIZJ(it2.next().getCid(), this.LLJLLL.getCid()) && this.LLJLLL.getUserCount() > 0) {
                        this.LLJLLL.setUserCount(r1.getUserCount() - 1);
                        mS(this.LLJLLIL);
                    }
                }
            }
        }
    }

    public final void cb(boolean z, boolean z2) {
        if (((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).isStandardUIEnable()) {
            if (cS().getVisibility() != 0) {
                nS(null);
            }
            if (this.LLLILZLLLI == null) {
                this.LLLILZLLLI = new C19341510lh(new AwS145S0110000_29(this, z2, 2), new AwS573S0100000_29(this, 60), getActivity(), cS(), this.mWeakHandler, "ChallengeDetail");
            }
            C19341510lh c19341510lh = this.LLLILZLLLI;
            if (c19341510lh != null) {
                c19341510lh.LIZIZ = new AwS573S0100000_29(this, 61);
            }
            C19341510lh c19341510lh2 = this.LLLILZLLLI;
            if (c19341510lh2 != null) {
                c19341510lh2.LJIIIZ = System.currentTimeMillis();
            }
            dS().LJ();
            ((ChallengeDetailJediViewModel) this.LLLIIL.getValue()).hR2(ZR().getCid(), ZR().getClickReason(), ZR().getPreviewToken(), ZR().isHashTag(), z2);
            C19371010qS.LIZ("cd_start_activity_to_request_net_duration");
            List<InterfaceC19400810vG> list = this.mFragments;
            if (z && list != null) {
                Iterator<InterfaceC19400810vG> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().cb(false, true);
                }
            }
        } else {
            dS().LJ();
            C786410Ut5.LLLZLZ(dS(), 0);
            C19371010qS.LIZ("cd_start_activity_to_request_net_duration");
            ((ChallengeDetailJediViewModel) this.LLLIIL.getValue()).hR2(ZR().getCid(), ZR().getClickReason(), ZR().getPreviewToken(), ZR().isHashTag(), z2);
            List<InterfaceC19400810vG> list2 = this.mFragments;
            if (z && list2 != null) {
                Iterator<InterfaceC19400810vG> it3 = list2.iterator();
                while (it3.hasNext()) {
                    it3.next().cb(false, true);
                }
            }
        }
        if (z2) {
            C786410Ut5.LLLZLZ(dS(), 8);
            onScrolled(0.0f, -60.0f);
        }
    }

    public final void kS(String str, String str2) {
        Integer numValueOf;
        C0OGM c0ogm;
        ICommercePageTrackingService iCommercePageTrackingServiceLIZLLL = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL();
        InterfaceC1670800ta2 activity = getActivity();
        if ((activity instanceof C0OGM) && (c0ogm = (C0OGM) activity) != null) {
            numValueOf = Integer.valueOf(c0ogm.getPageType());
        } else {
            numValueOf = null;
        }
        iCommercePageTrackingServiceLIZLLL.LIZJ(new C19406010w6(numValueOf, (Aweme) null, "htc_page", str, str2, 34));
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void onPageChange(int i, int i2) {
        boolean z;
        super.onPageChange(i, i2);
        Set<Map.Entry> setEntrySet = ((HashMap) this.LLLIL.getValue()).entrySet();
        if (setEntrySet != null) {
            for (Map.Entry entry : setEntrySet) {
                View view = (View) entry.getValue();
                Integer num = (Integer) entry.getKey();
                if (num != null && num.intValue() == i) {
                    z = true;
                } else {
                    z = false;
                }
                view.setSelected(z);
            }
        }
        List<InterfaceC19400810vG> list = this.mFragments;
        if (list == null) {
            return;
        }
        Object obj = ListProtector.get(list, i);
        if (!((InterfaceC19400810vG) obj).bo()) {
            obj = null;
        }
        InterfaceC19400810vG interfaceC19400810vG = (InterfaceC19400810vG) obj;
        if (interfaceC19400810vG != null) {
            interfaceC19400810vG.refresh();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC1260330itz
    public final void onScroll(int i, int i2) {
        int avatarContainerHight;
        super.onScroll(i, i2);
        InterfaceC19405710w3 interfaceC19405710w3 = this.LLJLIL;
        if (interfaceC19405710w3 == null) {
            interfaceC19405710w3 = null;
        }
        interfaceC19405710w3.LIZ(i);
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            return;
        }
        if (this.LLLJ != aS().getBottom()) {
            aS().getBottom();
            this.mTitleColorCtrl.getBottom();
            ((View) this.LLJJIII.getValue()).getHeight();
            C12ES.LIZJ(20.0f, getContext());
            this.LLLJ = aS().getBottom();
        }
        if (i == 0) {
            ((View) this.LLJJIJI.getValue()).setBackground(new ColorDrawable(C446980Hfs.LIZ(((View) this.LLJJIJI.getValue()).getContext(), R.color.dr)));
        } else {
            ((View) this.LLJJIJI.getValue()).setBackground(new ColorDrawable(C960203pA.LIZ(R.attr.bx, ((View) this.LLJJIJI.getValue()).getContext())));
        }
        AbstractC19417810y0 abstractC19417810y0 = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC19417810y0 != null) {
            avatarContainerHight = abstractC19417810y0.getAvatarContainerHight();
        } else {
            avatarContainerHight = 1;
        }
        float f = i / avatarContainerHight;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        C786410Ut5.S4(f, this.mTitle);
        if (this.LLLIZZ) {
            C786410Ut5.T4((View) this.LLJJIJIIJIL.getValue(), 1 - f);
            if (this.LLJJIJIL.getValue() != null) {
                if (f == 1.0f) {
                    C786410Ut5.LJLLLLLL(0, (View) this.LLJJIJIL.getValue());
                } else {
                    C786410Ut5.LJLLLLLL(8, (View) this.LLJJIJIL.getValue());
                }
            }
        }
        if (!this.LLJZ) {
            this.LLLII = C19369010q8.LIZ(f, this.LLLII, this);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC1260330itz
    public final void onScrolled(float f, float f2) {
        if (this.LLJZ) {
            super.onScrolled(f, f2);
        } else {
            this.LLLII = C19369010q8.LIZIZ(f, f2, this.LLLII, this);
        }
        InterfaceC19405710w3 interfaceC19405710w3 = this.LLJLIL;
        if (interfaceC19405710w3 == null) {
            interfaceC19405710w3 = null;
        }
        interfaceC19405710w3.LIZJ(f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0212  */
    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment, com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
