package com.ss.android.ugc.aweme.duet.ui;

import X.AbstractC480470Isn;
import X.AbstractC666100QAu;
import X.C01GW;
import X.C1258150iqT;
import X.C1260870iur;
import X.C1264160j0A;
import X.C1389890mGx;
import X.C13LP;
import X.C1697810uHb;
import X.C16FB;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C19341510lh;
import X.C19354710np;
import X.C20687815xM;
import X.C2188811AlT;
import X.C418730GbP;
import X.C419910GdJ;
import X.C452501pT;
import X.C637740Ozs;
import X.C786410Ut5;
import X.EnumC19354610no;
import X.EnumC19356710o9;
import X.EnumC481060Itk;
import X.InterfaceC1400710mYP;
import X.InterfaceC19341110ld;
import X.InterfaceC19369110q9;
import X.InterfaceC637750Ozt;
import Y.ACListenerS163S0100000_29;
import Y.ACallableS24S1000000_9;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.ss.android.ugc.aweme.duet.model.DuetAwemeList;
import com.ss.android.ugc.aweme.duet.model.DuetDetailModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS573S0100000_29;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes30.dex */
public final class DuetDetailFragment extends BaseDetailFragment implements InterfaceC637750Ozt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSE5LDt9PSxiDTo2PAEpPS46JAM+KCg+LSs4";
    public C418730GbP LL;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public DuetAwemeListFragment LLIZ;
    public C637740Ozs LLIZLLLIL;
    public float LLJI;
    public float LLJIJIL;
    public boolean LLJILJIL;
    public String LLILLJJLI = "";
    public String LLILZLL = "";
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 91));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 93));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 138));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 141));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 137));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS551S0100000_7(this, 140));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 92));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 139));

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getLabelName(int i) {
        return "duet_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final int getResId() {
        return R.layout.fu3;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getShootWayLabel() {
        return "duet_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return false;
    }

    public final C16FB PR() {
        return (C16FB) this.LLJJIJI.getValue();
    }

    public final C1749280vcc RR() {
        return (C1749280vcc) this.LLJJIII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getCurId() {
        String str = this.LLILLL;
        return str == null ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final AbstractC480470Isn getFragmentPagerAdapter() {
        String strLIZIZ;
        this.mFragments = new ArrayList();
        this.mFragmentList = new ArrayList();
        this.mFragmentTypes = new ArrayList();
        FragmentManager childFragmentManager = getChildFragmentManager();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(AbstractDetailFragment.FRAGMENT_TAG);
        sbLIZ.append('0');
        Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        boolean z = fragmentLJJJJZI instanceof DuetAwemeListFragment;
        Object obj = fragmentLJJJJZI;
        if (!z) {
            final String str = this.LLILZIL;
            String str2 = this.LLILLL;
            String str3 = this.LLILLJJLI;
            String str4 = this.LLILZLL;
            InterfaceC1400710mYP interfaceC1400710mYP = new InterfaceC1400710mYP(str) { // from class: X.0OHE
                public static final int $stable = 8;
                public final String LL;
                public WeakReference<C19EG> LLILLJJLI;

                @Override // X.InterfaceC1400710mYP
                public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i) {
                    return C635990Ox3.LIZ(this, c1398410mUh, aweme, i);
                }

                @Override // X.InterfaceC1400710mYP
                public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
                    return C635990Ox3.LIZJ(this, i, c19eg, interfaceC214902198i);
                }

                @Override // X.InterfaceC1400710mYP
                public /* bridge */ /* synthetic */ void interceptSmartRoute(View view, int i, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
                    C635990Ox3.LIZLLL(this, view, i, smartRoute, aweme, c1398410mUh);
                }

                @Override // X.InterfaceC1400710mYP
                public /* bridge */ /* synthetic */ boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
                    return C635990Ox3.LJ(this, viewHolder);
                }

                @Override // X.InterfaceC1400710mYP
                public /* bridge */ /* synthetic */ void onJumpToDetail(String str5) {
                    C635990Ox3.LJFF(this, str5);
                }

                @Override // X.InterfaceC1400710mYP
                public boolean sendCustomRequest(C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims, int i) {
                    return false;
                }

                public final WeakReference<C19EG> getActivity() {
                    return this.LLILLJJLI;
                }

                {
                    this.LL = str;
                }

                public final void setActivity(WeakReference<C19EG> weakReference) {
                    this.LLILLJJLI = weakReference;
                }

                @Override // X.InterfaceC1400710mYP
                public C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme) {
                    c1398410mUh.LIZ = "from_duet_detail";
                    c1398410mUh.LIZIZ = "duet_id";
                    c1398410mUh.LIZJ = "duet_page";
                    return c1398410mUh;
                }

                @Override // X.InterfaceC1400710mYP
                public C1255920ims<? extends AbstractC1255880imo<?, ?>> getPresenter(int i, C19EG c19eg) {
                    C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims = new C1255920ims<>();
                    c1255920ims.LJIIJ(new AbstractC1255880imo<Aweme, DuetAwemeList>() { // from class: X.0Ozo
                        @Override // X.AbstractC666100QAu
                        public final boolean checkParams(Object... objArr) {
                            return true;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.AbstractC1255880imo
                        public final List<Aweme> getItems() {
                            T t = this.mData;
                            if (t == 0) {
                                return null;
                            }
                            return ((DuetAwemeList) t).items;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.AbstractC1255880imo
                        public final boolean isDataEmpty() {
                            T t = this.mData;
                            if (t != 0) {
                                return ((DuetAwemeList) t).hasMore == 0 && C086I.LIZIZ(getItems());
                            }
                            return true;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.AbstractC1255880imo
                        public final boolean isHasMore() {
                            T t = this.mData;
                            return (t == 0 || ((DuetAwemeList) t).hasMore == 0) ? false : true;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r8v1, types: [T, com.ss.android.ugc.aweme.duet.model.DuetAwemeList] */
                        @Override // X.AbstractC666100QAu
                        public final void handleData(Object obj2) {
                            boolean z2;
                            ArrayList<Aweme> arrayList;
                            int iIntValue;
                            Aweme aweme;
                            Aweme aweme2;
                            ?? r8 = (DuetAwemeList) obj2;
                            if (r8 != 0 && (!C086I.LIZIZ(r8.items) || r8.hasMore == 1)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            this.mIsNewDataEmpty = z2;
                            if (!z2) {
                                ArrayList<Aweme> arrayList2 = r8.items;
                                if (arrayList2 != null) {
                                    Integer numValueOf = Integer.valueOf(arrayList2.size());
                                    int i2 = 0;
                                    while (true) {
                                        if (numValueOf != null) {
                                            iIntValue = numValueOf.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        if (i2 >= iIntValue) {
                                            break;
                                        }
                                        ArrayList<Aweme> arrayList3 = r8.items;
                                        if (arrayList3 != null) {
                                            aweme = (Aweme) ListProtector.get(arrayList3, i2);
                                        } else {
                                            aweme = null;
                                        }
                                        Aweme awemeLLILLL = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
                                        ArrayList<Aweme> arrayList4 = r8.items;
                                        if (arrayList4 != null && (aweme2 = (Aweme) ListProtector.get(arrayList4, i2)) != null) {
                                            awemeLLILLL.setIsTop(aweme2.getIsTop());
                                        }
                                        ArrayList<Aweme> arrayList5 = r8.items;
                                        if (arrayList5 != null && awemeLLILLL != null) {
                                            ListProtector.set(arrayList5, i2, awemeLLILLL);
                                        }
                                        i2++;
                                    }
                                }
                                int i3 = this.mListQueryType;
                                if (i3 != 1) {
                                    if (i3 == 4) {
                                        ArrayList<Aweme> arrayList6 = r8.items;
                                        if (arrayList6 != null && (arrayList = ((DuetAwemeList) this.mData).items) != null) {
                                            arrayList.addAll(arrayList6);
                                        }
                                        DuetAwemeList duetAwemeList = (DuetAwemeList) this.mData;
                                        duetAwemeList.cursor = r8.cursor;
                                        duetAwemeList.hasMore = r8.hasMore;
                                        return;
                                    }
                                    return;
                                }
                                this.mData = r8;
                                return;
                            }
                            T t = this.mData;
                            if (t != 0) {
                                ((DuetAwemeList) t).hasMore = 0;
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.AbstractC1255880imo
                        public final void loadMoreList(Object... objArr) {
                            long j;
                            String str5 = (String) objArr[1];
                            if (isDataEmpty()) {
                                j = 0;
                            } else {
                                j = ((DuetAwemeList) this.mData).cursor;
                            }
                            if (!C10EU.LJIIIIZZ()) {
                                C1BVK.LIZIZ().LIZ(this.mHandler, new CallableC637710Ozp(str5, j, ""), 0);
                            }
                        }

                        @Override // X.AbstractC1255880imo
                        public final void refreshList(Object... objArr) {
                            String str5;
                            if (C13LQ.LJJIIZ(4, objArr) instanceof String) {
                                str5 = (String) C13LQ.LJJIIZ(4, objArr);
                            } else {
                                str5 = "";
                            }
                            String str6 = (String) objArr[1];
                            if (!C10EU.LJIIIIZZ()) {
                                C1BVK.LIZIZ().LIZ(this.mHandler, new CallableC637710Ozp(str6, 0L, str5), 0);
                            }
                        }
                    });
                    return c1255920ims;
                }

                @Override // X.InterfaceC1400710mYP
                public C1398630mV3 onCreateDetailAwemeViewHolder(final View view, final String str5, final InterfaceC1260110itd interfaceC1260110itd) {
                    final String str6 = this.LL;
                    return new C1398630mV3(str6, view, str5, interfaceC1260110itd) { // from class: X.0mV0
                        public final String LLJLLL;

                        {
                            super(view, str5, interfaceC1260110itd);
                            this.LLJLLL = str6;
                        }

                        @Override // X.C1398630mV3
                        public final void b6(Aweme aweme, int i, boolean z2, Bundle bundle) {
                            if (aweme == null) {
                                return;
                            }
                            super.b6(aweme, i, z2, bundle);
                            if (TextUtils.equals(this.LLJLLL, aweme.getAid())) {
                                C786410Ut5.LLLLZLL(this.LLJILJILJ, 0);
                                this.LLJILJILJ.setText(2131836392);
                            }
                            if (aweme.isPgcShow()) {
                                if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                                    C786410Ut5.LLIL(this.LLJIJIL, 0);
                                    C786410Ut5.l(this.LLJI, 8);
                                    C1398630mV3.r6(this.LLJIJIL, (AwemeTextLabelModel) ListProtector.get(aweme.getTextTopLabels(), 0));
                                    return;
                                }
                                return;
                            }
                            if (aweme.getOriginAuthor() != null) {
                                C786410Ut5.LLIL(this.LLJILJIL, 0);
                                if (!TextUtils.isEmpty(AwemeBizExtKt.getLabelOriginAuthorText(aweme))) {
                                    this.LLJILJIL.setText(AwemeBizExtKt.getLabelOriginAuthorText(aweme));
                                }
                                C786410Ut5.l(this.LLJI, 4);
                                return;
                            }
                            if (aweme.getMusicStarter() != null || aweme.getOriginAuthor() != null || !TextUtils.equals(this.LLIZLLLIL, "challenge") || aweme.getIsTop() != 1) {
                                return;
                            }
                            if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                                C786410Ut5.LLIL(this.LLJIJIL, 0);
                                C786410Ut5.l(this.LLJI, 8);
                                C1398630mV3.r6(this.LLJIJIL, (AwemeTextLabelModel) ListProtector.get(aweme.getTextTopLabels(), 0));
                            } else {
                                C786410Ut5.LLIL(this.LLJIJIL, 8);
                                C786410Ut5.l(this.LLJI, 0);
                                C1324840ka2.LJI(this.LLJI, aweme.getLabelTop(), (int) C12ES.LIZJ(6.0f, this.LLIZ), (int) C12ES.LIZJ(6.0f, this.LLIZ), null);
                            }
                        }
                    };
                }
            };
            DuetAwemeListFragment duetAwemeListFragment = new DuetAwemeListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("detail_aweme_list_type", 24);
            C786410Ut5.LJJJI("event_label", "duet_page", bundle);
            C786410Ut5.LJJJI("detail_id", str, bundle);
            String[] strArr = new String[2];
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('\"');
            sbLIZ2.append(str);
            sbLIZ2.append('\"');
            strArr[0] = C2188811AlT.LIZIZ(sbLIZ2);
            if (str2 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append('\"');
                sbLIZ3.append(str2);
                sbLIZ3.append('\"');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            } else {
                strLIZIZ = null;
            }
            strArr[1] = strLIZIZ;
            C786410Ut5.LJJJI("top_aweme_ids", C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(strArr), ", ", e3.e, e3.f, 0, null, null, 56), bundle);
            bundle.putBoolean("extra_challenge_is_hashtag", false);
            C786410Ut5.LJJJI("extra_challenge_hashtag_name", "", bundle);
            C786410Ut5.LJJJI("detail_aweme_from", str3, bundle);
            C786410Ut5.LJJJI("detail_aweme_from_aid", str4, bundle);
            duetAwemeListFragment.setArguments(bundle);
            duetAwemeListFragment.LLLILZJ = interfaceC1400710mYP;
            duetAwemeListFragment.LLLFFI = this.mCurPos == 0;
            duetAwemeListFragment.LLLFZ = true;
            obj = duetAwemeListFragment;
        }
        DuetAwemeListFragment duetAwemeListFragment2 = (DuetAwemeListFragment) obj;
        this.LLIZ = duetAwemeListFragment2;
        this.mFragments.add(duetAwemeListFragment2);
        List<AmeBaseFragment> list = this.mFragmentList;
        DuetAwemeListFragment duetAwemeListFragment3 = this.LLIZ;
        list.add(duetAwemeListFragment3 != null ? duetAwemeListFragment3 : null);
        this.mFragmentTypes.add(24);
        return new C1258150iqT(getChildFragmentManager(), this.mFragmentList, this.mFragmentTypes);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    public final void refresh() {
        if (!((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).isStandardUIEnable()) {
            C786410Ut5.LLLZLZ(RR(), 0);
            RR().LJ();
            C637740Ozs c637740Ozs = this.LLIZLLLIL;
            (c637740Ozs != null ? c637740Ozs : null).LIZJ(this.LLILZIL);
            return;
        }
        if (PR().getVisibility() != 0) {
            SR(null);
        }
        ((C19341510lh) this.LLJILJILJ.getValue()).LIZIZ = new AwS573S0100000_29(this, 96);
        C19341510lh c19341510lh = (C19341510lh) this.LLJILJILJ.getValue();
        c19341510lh.getClass();
        c19341510lh.LJIIIZ = System.currentTimeMillis();
        RR().LJ();
        C637740Ozs c637740Ozs2 = this.LLIZLLLIL;
        (c637740Ozs2 != null ? c637740Ozs2 : null).LIZJ(this.LLILZIL);
    }

    public final void SR(Throwable th) {
        C1264160j0A.LIZIZ(RR(), "DuetDetail", th, new AwS573S0100000_29(this, 97));
        C786410Ut5.LLLZLZ(RR(), 0);
    }

    @Override // X.InterfaceC637750Ozt
    public final void Ya2(DuetDetailModel duetDetailModel) {
        if (!isViewValid()) {
            return;
        }
        UrlModel urlModel = duetDetailModel.cover;
        if (urlModel != null && !TextUtils.isEmpty(urlModel.getUri())) {
            if (((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).isStandardUIEnable()) {
                C786410Ut5.LLZZJLIL(PR(), 0);
                PR().setRefreshing(false);
                ((C19341510lh) this.LLJILJILJ.getValue()).LIZIZ();
            }
            this.LLJILJIL = true;
            C786410Ut5.LLLZLZ(RR(), 8);
            ((InterfaceC19341110ld) this.LLJ.getValue()).LIZIZ(duetDetailModel);
            C19354710np c19354710np = EnumC19354610no.Companion;
            Integer num = duetDetailModel.remindType;
            c19354710np.getClass();
            EnumC19354610no enumC19354610noLIZ = C19354710np.LIZ(num);
            if (enumC19354610noLIZ != null) {
                if (enumC19354610noLIZ != EnumC19354610no.REMIND_DUET_NOT_ALLOWED && enumC19354610noLIZ != EnumC19354610no.REMIND_SOUND_NOT_READY) {
                    C786410Ut5.LJLLLLLL(0, (View) this.LLJILLL.getValue());
                    return;
                } else {
                    C786410Ut5.LJLLLLLL(8, (View) this.LLJILLL.getValue());
                    hideStartRecord();
                    return;
                }
            }
            return;
        }
        C786410Ut5.LLLZLZ(RR(), 0);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_no_video;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        c1722300uv6.LJIIIIZZ = getString(2131858174);
        RR().setStatus(c1722300uv6);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final InterfaceC19369110q9 createAnimator(ViewGroup viewGroup) {
        return new C20687815xM(requireContext(), viewGroup);
    }

    @Override // X.InterfaceC637750Ozt
    public final void ef2(Exception exc) {
        if (isViewValid()) {
            if (((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).isStandardUIEnable()) {
                ((C19341510lh) this.LLJILJILJ.getValue()).LIZIZ = new AwS430S0200000_29(this, exc, 12);
                ((C19341510lh) this.LLJILJILJ.getValue()).LIZ(exc);
                return;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
            if (this.LLJILJIL) {
                C786410Ut5.LLLZLZ(RR(), 8);
                return;
            }
            C786410Ut5.LLLZLZ(RR(), 0);
            C1749280vcc c1749280vccRR = RR();
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LIZ(c1722300uv6, new AwS573S0100000_29(this, 94));
            c1749280vccRR.setStatus(c1722300uv6);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initArguments(Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        if (bundle != null) {
            bundle.getString("enter_method");
        }
        String str = "";
        if (bundle == null || (string = bundle.getString("enter_from")) == null) {
            string = "";
        }
        this.LLILLJJLI = string;
        String string5 = null;
        if (bundle != null) {
            string2 = bundle.getString(FollowStatusChangeMethod.PARAM_UID);
        } else {
            string2 = null;
        }
        this.LLILLL = string2;
        if (bundle != null) {
            string5 = bundle.getString("author_id");
        }
        this.LLILZ = string5;
        if (bundle == null || (string3 = bundle.getString("origin_item_id")) == null) {
            string3 = "";
        }
        this.LLILZIL = string3;
        if (bundle != null && (string4 = bundle.getString("from_group_id")) != null) {
            str = string4;
        }
        this.LLILZLL = str;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC1260330itz
    public final void onScroll(int i, int i2) {
        int bottom;
        super.onScroll(i, i2);
        float f = 0.0f;
        int bottom2 = 0;
        if (this.LLJI == 0.0f && ((View) this.LLJJ.getValue()).getVisibility() == 0) {
            int bottom3 = ((View) this.LLJJ.getValue()).getBottom();
            View view = this.mTitleColorCtrl;
            if (view != null) {
                bottom = view.getBottom();
            } else {
                bottom = 0;
            }
            this.LLJI = bottom3 - bottom;
        }
        if (this.LLJIJIL == 0.0f) {
            int bottom4 = ((View) this.LLJJI.getValue()).getBottom();
            View view2 = this.mTitleColorCtrl;
            if (view2 != null) {
                bottom2 = view2.getBottom();
            }
            this.LLJIJIL = bottom4 - bottom2;
        }
        float f2 = this.LLJI;
        float f3 = (i - f2) / (this.LLJIJIL - f2);
        if (f3 > 0.2d) {
            f = f3;
            if (f > 1.0f) {
                f = 1.0f;
            }
        }
        C786410Ut5.T4(this.mTitleColorCtrl, f);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0Ozs, X.0iur] */
    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment, com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ((InterfaceC19341110ld) this.LLJ.getValue()).LIZ(view);
        super.onViewCreated(view, bundle);
        View viewFindViewById = null;
        if (((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).isStandardUIEnable()) {
            C786410Ut5.LLZZJLIL(PR(), 8);
            PR().setOnRefreshListener(new AwS573S0100000_29(this, 95));
        } else {
            PR().setOverScrollMode(EnumC19356710o9.NONE);
            PR().setScrollMode(EnumC481060Itk.NONE);
            PR().setNestedHeader(null);
        }
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 214), (View) this.LLJILLL.getValue());
        ?? r0 = new C1260870iur<AbstractC666100QAu<DuetDetailModel>, InterfaceC637750Ozt>() { // from class: X.0Ozs
            @Override // X.C1260870iur, X.InterfaceC1526205yG
            public final void onSuccess() {
                T t;
                K k = this.LLILLJJLI;
                if (k == 0 || (t = this.LL) == 0) {
                    return;
                }
                ((InterfaceC637750Ozt) k).Ya2((DuetDetailModel) t.getData());
            }

            {
                LJIIJ(new AbstractC666100QAu<DuetDetailModel>() { // from class: X.0Ozr
                    @Override // X.AbstractC666100QAu
                    public final boolean checkParams(Object... objArr) {
                        return true;
                    }

                    @Override // X.AbstractC666100QAu
                    public final boolean sendRequest(Object... objArr) {
                        if (!super.sendRequest(objArr)) {
                            return false;
                        }
                        C637740Ozs c637740Ozs = this.LL;
                        WeakHandler weakHandler = this.mHandler;
                        String str = (String) objArr[0];
                        c637740Ozs.getClass();
                        if (!C10EU.LJIIIIZZ()) {
                            C1BVK.LIZIZ().LIZ(weakHandler, new ACallableS24S1000000_9(str, 2), 0);
                        }
                        return true;
                    }
                });
            }

            @Override // X.C1260870iur, X.InterfaceC1526205yG
            public final void onFailed(Exception exc) {
                K k = this.LLILLJJLI;
                if (k != 0) {
                    ((InterfaceC637750Ozt) k).ef2(exc);
                }
            }
        };
        this.LLIZLLLIL = r0;
        r0.LLILLJJLI = this;
        View view2 = this.LL;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.bn2);
            }
            this.LL = (C418730GbP) viewFindViewById;
            view2 = viewFindViewById;
        }
        C786410Ut5.Ia((C418730GbP) view2, new ACListenerS163S0100000_29(this, 30));
        refresh();
    }
}
