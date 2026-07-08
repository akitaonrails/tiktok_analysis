package com.ss.android.ugc.aweme.mvtemplate.view;

import X.AbstractC480470Isn;
import X.AbstractC666100QAu;
import X.C01GW;
import X.C036E;
import X.C0P04;
import X.C0P05;
import X.C1258150iqT;
import X.C1260870iur;
import X.C1389890mGx;
import X.C1401560mZm;
import X.C1401570mZn;
import X.C1401580mZo;
import X.C14EU;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C19369010q8;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C418730GbP;
import X.C452501pT;
import X.C481090Itn;
import X.C584850Mwl;
import X.C627350Oj7;
import X.C737030Svd;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC19356710o9;
import X.EnumC481060Itk;
import X.InterfaceC1400710mYP;
import X.InterfaceC1401590mZp;
import X.InterfaceC1401600mZq;
import X.InterfaceC19369110q9;
import Y.ACListenerS155S0100000_21;
import Y.ACallableS416S0100000_9;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mvtemplate.model.MvDetailModel;
import com.ss.android.ugc.aweme.mvtemplate.model.TemplateResponseItem;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS565S0100000_21;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class MovieDetailFragment extends BaseDetailFragment implements C0P05 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig6PSo+HELIOSOCktPSp9PiwpPmEeJzMlLAs2PCQlJQkhKSIhLCEn";
    public C1749280vcc LL;
    public C418730GbP LLILLJJLI;
    public C481090Itn LLILLL;
    public String LLILZ;
    public Integer LLILZLL;
    public MovieDetailAwemeListFragment LLIZ;
    public C0P04 LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public String LLJJ;
    public MvModel LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJJJIL;
    public int LLILZIL = 1;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 727));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 730));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 729));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 726));
    public String LLJJI = "";
    public String LLJJIII = "";
    public final LogPbBean LLJJIJI = new LogPbBean();
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 725));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 731));

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getLabelName(int i) {
        return "movie";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final int getResId() {
        return R.layout.c93;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getShootWayLabel() {
        return "movie_hot";
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
    }

    public final C481090Itn PR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vw9) : null;
            this.LLILLL = (C481090Itn) viewFindViewById;
        }
        return (C481090Itn) viewFindViewById;
    }

    public final C1749280vcc RR() {
        return (C1749280vcc) this.LLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getCurId() {
        String str = this.LLILZ;
        return str == null ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final AbstractC480470Isn getFragmentPagerAdapter() {
        this.mFragments = new ArrayList();
        this.mFragmentList = new ArrayList();
        this.mFragmentTypes = new ArrayList();
        FragmentManager childFragmentManager = getChildFragmentManager();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(AbstractDetailFragment.FRAGMENT_TAG);
        sbLIZ.append('0');
        Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        boolean z = fragmentLJJJJZI instanceof MovieDetailAwemeListFragment;
        Object obj = fragmentLJJJJZI;
        if (!z) {
            Integer num = this.LLILZLL;
            int i = (num == null || num.intValue() != 2) ? 20 : 32;
            String str = this.LLILZ;
            String str2 = this.LLJJI;
            String str3 = this.LLJJIII;
            InterfaceC1400710mYP interfaceC1400710mYP = new InterfaceC1400710mYP() { // from class: X.0mUc
                public static final int $stable = 8;
                public WeakReference<C19EG> LL;

                @Override // X.InterfaceC1400710mYP
                public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i2) {
                    return C635990Ox3.LIZ(this, c1398410mUh, aweme, i2);
                }

                @Override // X.InterfaceC1400710mYP
                public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
                    return C635990Ox3.LIZJ(this, i2, c19eg, interfaceC214902198i);
                }

                @Override // X.InterfaceC1400710mYP
                public /* bridge */ /* synthetic */ void interceptSmartRoute(View view, int i2, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
                    C635990Ox3.LIZLLL(this, view, i2, smartRoute, aweme, c1398410mUh);
                }

                @Override // X.InterfaceC1400710mYP
                public /* bridge */ /* synthetic */ boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
                    return C635990Ox3.LJ(this, viewHolder);
                }

                @Override // X.InterfaceC1400710mYP
                public /* bridge */ /* synthetic */ void onJumpToDetail(String str4) {
                    C635990Ox3.LJFF(this, str4);
                }

                @Override // X.InterfaceC1400710mYP
                public boolean sendCustomRequest(C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims, int i2) {
                    return false;
                }

                public final WeakReference<C19EG> getActivity() {
                    return this.LL;
                }

                public final void setActivity(WeakReference<C19EG> weakReference) {
                    this.LL = weakReference;
                }

                @Override // X.InterfaceC1400710mYP
                public C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme) {
                    String str4;
                    c1398410mUh.LIZ = "from_detail_activity";
                    c1398410mUh.LIZIZ = "movie_id";
                    if (AwemeExtKt.getUploadMiscInfoStruct(aweme).mvType == 1) {
                        str4 = "jianying_mv_page";
                    } else {
                        str4 = "mv_page";
                    }
                    c1398410mUh.LIZJ = str4;
                    return c1398410mUh;
                }

                @Override // X.InterfaceC1400710mYP
                public C1255920ims<? extends AbstractC1255880imo<?, ?>> getPresenter(int i2, C19EG c19eg) {
                    C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims = new C1255920ims<>();
                    c1255920ims.LJIIJ(new C637780Ozw());
                    return c1255920ims;
                }

                @Override // X.InterfaceC1400710mYP
                public C1398630mV3 onCreateDetailAwemeViewHolder(final View view, final String str4, final InterfaceC1260110itd interfaceC1260110itd) {
                    return new C1398630mV3(view, str4, interfaceC1260110itd) { // from class: X.0mV1
                        @Override // X.C1398630mV3
                        public final void b6(Aweme aweme, int i2, boolean z2, Bundle bundle) {
                            super.b6(aweme, i2, z2, bundle);
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
            int i2 = this.LLILZIL;
            MovieDetailAwemeListFragment movieDetailAwemeListFragment = new MovieDetailAwemeListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("detail_aweme_list_type", i);
            C786410Ut5.LJJJI("event_label", "movie", bundle);
            C786410Ut5.LJJJI("detail_id", str, bundle);
            bundle.putBoolean("extra_challenge_is_hashtag", false);
            C786410Ut5.LJJJI("extra_challenge_hashtag_name", "", bundle);
            C786410Ut5.LJJJI("detail_aweme_from", str2, bundle);
            C786410Ut5.LJJJI("detail_aweme_from_aid", str3, bundle);
            bundle.putInt("detail_source_id", i2);
            movieDetailAwemeListFragment.setArguments(bundle);
            movieDetailAwemeListFragment.LLLILZJ = interfaceC1400710mYP;
            movieDetailAwemeListFragment.LLLFFI = this.mCurPos == 0;
            movieDetailAwemeListFragment.LLLFZ = true;
            obj = movieDetailAwemeListFragment;
        }
        MovieDetailAwemeListFragment movieDetailAwemeListFragment2 = (MovieDetailAwemeListFragment) obj;
        this.LLIZ = movieDetailAwemeListFragment2;
        this.mFragments.add(movieDetailAwemeListFragment2);
        List<AmeBaseFragment> list = this.mFragmentList;
        MovieDetailAwemeListFragment movieDetailAwemeListFragment3 = this.LLIZ;
        if (movieDetailAwemeListFragment3 == null) {
            movieDetailAwemeListFragment3 = null;
        }
        list.add(movieDetailAwemeListFragment3);
        this.mFragmentTypes.add(20);
        return new C1258150iqT(getChildFragmentManager(), this.mFragmentList, this.mFragmentTypes);
    }

    @Override // X.C0P05
    public final void Vp0() {
        C481090Itn c481090ItnPR = PR();
        if (c481090ItnPR != null) {
            c481090ItnPR.setRefreshing(false);
        }
        if (isViewValid()) {
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
            if (this.LLJJJJJIL) {
                C786410Ut5.LLLZLZ(RR(), 8);
                return;
            }
            C786410Ut5.LLLZLZ(RR(), 0);
            C1749280vcc c1749280vccRR = RR();
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LIZ(c1722300uv6, new C1401570mZn(this));
            c1749280vccRR.setStatus(c1722300uv6);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    public final void refresh() {
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (!this.LLJJJJJIL) {
                    C786410Ut5.LLLZLZ(RR(), 0);
                    RR().LJ();
                }
                C0P04 c0p04 = this.LLJILJIL;
                if (c0p04 != null) {
                    c0p04.LIZJ("", this.LLILZ, this.LLILZLL, Integer.valueOf(this.LLILZIL), Integer.valueOf(this.LLILZIL));
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        PR().setRefreshing(false);
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIIZ(2131837962);
        c1389890mGx.LJIIJJI();
        if (this.LLJJJJJIL) {
            return;
        }
        C786410Ut5.LLLZLZ(RR(), 0);
        C1749280vcc c1749280vccRR = RR();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LIZ(c1722300uv6, new C1401580mZo(this));
        c1749280vccRR.setStatus(c1722300uv6);
    }

    @Override // X.C0P05
    public final void Il0(MvDetailModel mvDetailModel) {
        String extra;
        String extra2;
        MovieDetailAwemeListFragment movieDetailAwemeListFragment;
        MovieDetailAwemeListFragment movieDetailAwemeListFragment2;
        String imprId;
        String str;
        C481090Itn c481090ItnPR = PR();
        int i = 0;
        if (c481090ItnPR != null) {
            c481090ItnPR.setRefreshing(false);
        }
        if (!isViewValid()) {
            return;
        }
        MvModel mvModel = mvDetailModel.mvInfo;
        if (mvModel == null && mvDetailModel.template == null) {
            this.LLJJJJJIL = false;
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
            C786410Ut5.LLLZLZ(RR(), 0);
            C1749280vcc c1749280vccRR = RR();
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LIZ(c1722300uv6, new C1401560mZm(this));
            c1749280vccRR.setStatus(c1722300uv6);
            return;
        }
        this.LLJJIJIIJIL = mvModel;
        String name = null;
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZLLL()) {
            try {
                MvModel mvModel2 = this.LLJJIJIIJIL;
                if (mvModel2 != null && (extra = mvModel2.getExtra()) != null && extra.length() != 0) {
                    MvModel mvModel3 = this.LLJJIJIIJIL;
                    if (mvModel3 != null) {
                        extra2 = mvModel3.getExtra();
                    } else {
                        extra2 = null;
                    }
                    if (!new JSONObject(extra2).optBoolean("is_commerce_music", false)) {
                        C786410Ut5.LJLLLLLL(8, (View) this.LLIZLLLIL.getValue());
                    }
                } else {
                    C786410Ut5.LJLLLLLL(8, (View) this.LLIZLLLIL.getValue());
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        MovieDetailAwemeListFragment movieDetailAwemeListFragment3 = this.LLIZ;
        if (movieDetailAwemeListFragment3 == null) {
            movieDetailAwemeListFragment = null;
        } else {
            movieDetailAwemeListFragment = movieDetailAwemeListFragment3;
        }
        movieDetailAwemeListFragment.LLLILZLLLI = mvDetailModel.mvInfo;
        if (movieDetailAwemeListFragment3 == null) {
            movieDetailAwemeListFragment2 = null;
        } else {
            movieDetailAwemeListFragment2 = movieDetailAwemeListFragment3;
        }
        movieDetailAwemeListFragment2.LLJLLL = this.LLJJIII;
        if (movieDetailAwemeListFragment3 == null) {
            movieDetailAwemeListFragment3 = null;
        }
        movieDetailAwemeListFragment3.LLLIZZ = this.LLILZLL;
        this.LLJJJJJIL = true;
        C786410Ut5.LLLZLZ(RR(), 8);
        Integer num = this.LLILZLL;
        if (num != null && num.intValue() == 2) {
            TextView textView = this.mTitle;
            TemplateResponseItem templateResponseItem = mvDetailModel.template;
            if (templateResponseItem != null) {
                name = templateResponseItem.title;
            }
            textView.setText(name);
        } else {
            TextView textView2 = this.mTitle;
            MvModel mvModel4 = mvDetailModel.mvInfo;
            if (mvModel4 != null) {
                name = mvModel4.getName();
            }
            textView2.setText(name);
        }
        mvDetailModel.LIZ = this.LLILZLL;
        ((InterfaceC1401590mZp) this.LLJJJJ.getValue()).LIZJ(mvDetailModel);
        LogPbBean logPbBean = mvDetailModel.logPb;
        if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
            imprId = "";
        }
        this.LLJJIJI.setImprId(imprId);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJI);
        c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZ(this.LLJJIJI));
        c2344009Gk.LJIIIIZZ("group_id", this.LLJJIII);
        c2344009Gk.LJIIIIZZ("mv_id", this.LLILZ);
        c2344009Gk.LJIIIIZZ("enter_method", this.LLJJ);
        Integer num2 = this.LLILZLL;
        if (num2 != null && num2.intValue() == 2) {
            i = 1;
        }
        c2344009Gk.LIZJ(i, "is_capcut");
        Integer num3 = this.LLILZLL;
        if (num3 != null && num3.intValue() == 2) {
            str = "jianying_mv";
        } else {
            str = "mv";
        }
        c2344009Gk.LJIIIIZZ("mv_type", str);
        C20684815ws.LJIILLIIL("enter_mv_detail", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final InterfaceC19369110q9 createAnimator(ViewGroup viewGroup) {
        return ((InterfaceC1401600mZq) this.LLJJJIL.getValue()).LIZ(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initArguments(Bundle bundle) {
        String string;
        String string2;
        String string3;
        Integer numValueOf;
        String string4;
        String str = "";
        if (bundle == null || (string = bundle.getString("mv_id")) == null) {
            string = "";
        }
        this.LLILZ = string;
        boolean z = false;
        this.mHasRecordHideAnim = false;
        if (bundle == null || (string2 = bundle.getString("enter_method")) == null) {
            string2 = "";
        }
        this.LLJJ = string2;
        if (bundle == null || (string3 = bundle.getString("enter_from")) == null) {
            string3 = "";
        }
        this.LLJJI = string3;
        if (bundle != null && (string4 = bundle.getString("group_id")) != null) {
            str = string4;
        }
        this.LLJJIII = str;
        if (bundle != null) {
            numValueOf = Integer.valueOf(bundle.getInt("type", 0));
        } else {
            numValueOf = null;
        }
        this.LLILZLL = numValueOf;
        int i = 1;
        if (bundle != null) {
            i = bundle.getInt("source_id", 1);
        }
        this.LLILZIL = i;
        if (bundle != null) {
            z = bundle.getBoolean("enter_record_from_feed");
        }
        this.LLJJJ = z;
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig().cutsameSdkVersion();
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC1260330itz
    public final void onScroll(int i, int i2) {
        super.onScroll(i, i2);
        float f = 0.0f;
        if (this.LLJILLL == 0.0f && ((View) this.LLJ.getValue()).getVisibility() == 0) {
            this.LLJILLL = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58)) + ((View) this.LLJ.getValue()).getBottom()) - this.mTitleColorCtrl.getBottom();
        }
        if (this.LLJILJILJ == 0.0f) {
            this.LLJILJILJ = ((View) this.LLJIJIL.getValue()).getBottom() - this.mTitleColorCtrl.getBottom();
        }
        float f2 = i;
        float f3 = this.LLJILLL;
        float f4 = (f2 - f3) / (this.LLJILJILJ - f3);
        if (f4 > 0.2d) {
            f = f4;
            if (f4 > 1.0f) {
                f = 1.0f;
            }
        }
        C786410Ut5.T4(this.mTitleColorCtrl, f);
        TextView textView = this.mTitle;
        View view = (View) this.LLJIJIL.getValue();
        float f5 = this.LLJILJILJ;
        C786410Ut5.S4(f, textView);
        C786410Ut5.T4(view, 1 - (f2 / f5));
        this.LLJJIJIL = C19369010q8.LIZ(f, this.LLJJIJIL, this);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC1260330itz
    public final void onScrolled(float f, float f2) {
        this.LLJJIJIL = C19369010q8.LIZIZ(f, f2, this.LLJJIJIL, this);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0P04, X.0iur] */
    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment, com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ((InterfaceC1401590mZp) this.LLJJJJ.getValue()).LIZ(view);
        ((InterfaceC1401600mZq) this.LLJJJIL.getValue()).LIZJ((RelativeLayout) view.findViewById(R.id.vza));
        super.onViewCreated(view, bundle);
        if (TextUtils.isEmpty(this.LLILZ)) {
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        ?? r0 = new C1260870iur<AbstractC666100QAu<MvDetailModel>, C0P05>() { // from class: X.0P04
            @Override // X.C1260870iur, X.InterfaceC1526205yG
            public final void onSuccess() {
                T t;
                K k = this.LLILLJJLI;
                if (k == 0 || (t = this.LL) == 0) {
                    return;
                }
                ((C0P05) k).Il0((MvDetailModel) t.getData());
            }

            {
                LJIIJ(new AbstractC666100QAu<MvDetailModel>() { // from class: X.0P03
                    @Override // X.AbstractC666100QAu
                    public final boolean checkParams(Object... objArr) {
                        return true;
                    }

                    @Override // X.AbstractC666100QAu
                    public final boolean sendRequest(Object... objArr) {
                        if (!super.sendRequest(objArr)) {
                            return false;
                        }
                        C0P04 c0p04 = this.LL;
                        WeakHandler weakHandler = this.mHandler;
                        String str = (String) objArr[1];
                        int iIntValue = ((Integer) objArr[2]).intValue();
                        int iIntValue2 = ((Integer) objArr[4]).intValue();
                        c0p04.getClass();
                        C1BVK.LIZIZ().LIZ(weakHandler, new ACallableS416S0100000_9(new C637810Ozz(str, iIntValue, iIntValue2), 0), 0);
                        return true;
                    }
                });
            }

            @Override // X.C1260870iur, X.InterfaceC1526205yG
            public final void onFailed(Exception exc) {
                K k = this.LLILLJJLI;
                if (k != 0) {
                    ((C0P05) k).Vp0();
                }
            }
        };
        this.LLJILJIL = r0;
        r0.LLILLJJLI = this;
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bn2);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (C418730GbP) viewFindViewById;
        }
        C786410Ut5.Ia((C418730GbP) viewFindViewById, new ACListenerS155S0100000_21(this, 90));
        if (((View) this.LLIZLLLIL.getValue()).getVisibility() == 0) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 265), (View) this.LLIZLLLIL.getValue());
        }
        if (C627350Oj7.LIZ()) {
            PR().setOnRefreshListener(new AwS565S0100000_21(this, 728));
        } else {
            PR().setNestedHeader(null);
            PR().setScrollMode(EnumC481060Itk.NONE);
            PR().setOverScrollMode(EnumC19356710o9.NONE);
        }
        refresh();
    }
}
