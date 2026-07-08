package com.ss.android.ugc.aweme.series.innerfeed.fragment;

import X.C00YC;
import X.C01GW;
import X.C098200Yq;
import X.C0SFC;
import X.C0T2Y;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1220000hqw;
import X.C1336100ksC;
import X.C13LE;
import X.C13LZ;
import X.C1483410ohn;
import X.C1578630rBN;
import X.C1581030rFF;
import X.C1600830rlB;
import X.C1600840rlC;
import X.C1611420s2G;
import X.C1611550s2T;
import X.C1611670s2f;
import X.C1611810s2t;
import X.C1612210s3X;
import X.C1612950s4j;
import X.C1612960s4k;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20533215Wg;
import X.C2095008Iq;
import X.C2187451AjH;
import X.C2200821BBo;
import X.C2344809Gs;
import X.C259800zU;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C616540OGe;
import X.C694550RMf;
import X.C695070ROf;
import X.C724750Sbp;
import X.C736950SvV;
import X.C740740T3w;
import X.C786410Ut5;
import X.InterfaceC1253240iiY;
import Y.ACListenerS158S0100000_24;
import Y.ALAdapterS9S0100000_12;
import Y.AUListenerS253S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.touchpoint.api.service.IWatchVideoService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel;
import com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel;
import com.ss.android.ugc.aweme.service.IAutomaticPageStayTimeService;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesInnerFeedDetailPageFragment extends DetailPageFragment implements InterfaceC1253240iiY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2slJyE2OiMpLCt9HELIOSLjctLiI2JjFiGiohISA/ACE9LTcKLCo3DCA4KCY/GCQrLAkhKSIhLCEn";
    public boolean LLIZLLLIL;
    public String LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1010));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1011));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1012));
    public final C736950SvV LLJILJILJ;
    public boolean LLJILLL;

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final DetailFragmentPanel OR() {
        return new PaidContentVideoPanel(getArguments(), this.LLILLJJLI);
    }

    public final void aS() {
        Window window;
        C694550RMf.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("paid_content_prevent_screen_recording", true)) {
            C19EG activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.clearFlags(8192);
            }
            C2344809Gs.LIZLLL(4, "PaidContent", "enable screen capture");
        }
    }

    public final SeriesInnerFeedViewModel bS() {
        return (SeriesInnerFeedViewModel) this.LLJILJILJ.getValue();
    }

    public SeriesInnerFeedDetailPageFragment() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1013);
        this.LLJILJILJ = new C736950SvV(C13LE.LIZ(SeriesInnerFeedViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(318), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final boolean LLZLL() {
        Long lLJIILIIL;
        PaidContentInfo paidContentInfo;
        Video video;
        Object c098200Yq;
        CollectionDetailModel collectionDetailModel;
        C1612210s3X c1612210s3X = (C1612210s3X) bS().getState();
        if (c1612210s3X != null && (collectionDetailModel = c1612210s3X.LLILZLL) != null) {
            C1612950s4j.LIZIZ.LJI(collectionDetailModel.collectionId, collectionDetailModel.isFavorite());
        }
        if (this.LLJILLL) {
            SeriesInnerFeedViewModel seriesInnerFeedViewModelBS = bS();
            seriesInnerFeedViewModelBS.getClass();
            seriesInnerFeedViewModelBS.setState(new AwS36S0010000_24(false, 43));
            this.LLJILLL = false;
            return false;
        }
        if (C1612960s4k.LIZ() && ((C1612210s3X) bS().getState()).LLJJJJ) {
            SeriesInnerFeedViewModel seriesInnerFeedViewModelBS2 = bS();
            seriesInnerFeedViewModelBS2.getClass();
            seriesInnerFeedViewModelBS2.setState(new AwS36S0010000_24(true, 43));
            this.LLJILLL = true;
            return true;
        }
        if (C1600840rlC.LIZ() && (lLJIILIIL = C2095008Iq.LJIILIIL((String) this.LLJI.getValue())) != null && lLJIILIIL.longValue() != 0) {
            long jLongValue = lLJIILIIL.longValue();
            Aweme aweme = ((C1612210s3X) bS().getState()).LLJLILLLLZIIL;
            if (aweme != null && !C695070ROf.LIZ(aweme) && !C0SFC.LIZIZ.LJIIIIZZ(aweme) && !C1611420s2G.LIZ(aweme) && (paidContentInfo = aweme.mPaidContentInfo) != null && paidContentInfo.getPaidCollectionId() == jLongValue && (video = aweme.getVideo()) != null) {
                long duration = video.getDuration();
                if (duration > 0) {
                    try {
                        c098200Yq = Long.valueOf(C1483410ohn.LJLJJI().getCurrentPosition());
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = 0L;
                    }
                    float fLIZLLL = C13LZ.LIZLLL((((Number) c098200Yq).longValue() / duration) * 100.0f, 0.0f, 100.0f);
                    C1600830rlB c1600830rlB = C1600830rlB.LIZJ;
                    if (c1600830rlB != null) {
                        c1600830rlB.LIZJ(Long.valueOf(jLongValue), aweme, fLIZLLL);
                    }
                }
            }
            EventBus.LIZLLL().LJIILL(new C00YC(jLongValue, (String) this.LLJIJIL.getValue()));
        }
        return super.LLZLL();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final void VR() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            C1578630rBN.LJIIIIZZ(arguments, "DETAIL_SERIES_INNER_FEED");
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        aS();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C19EG activity;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SeriesInnerFeedDetailPageFragment.class.getName());
        }
        super.onResume();
        C694550RMf.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("paid_content_prevent_screen_recording", true) || (activity = getActivity()) == null) {
            return;
        }
        C1336100ksC.LJFF(activity);
        C2344809Gs.LIZLLL(4, "PaidContent", "disable screen capture");
    }

    public static void gS(View view) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width != -2) {
            layoutParams.width = -2;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static void hS(TuxTextView tuxTextView) {
        tuxTextView.setMaxLines(1);
        tuxTextView.setMaxWidth(Integer.MAX_VALUE);
        tuxTextView.setTextSize(15.0f);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        C1611670s2f c1611670s2f = C1611670s2f.LIZ;
        String str = (String) this.LLJI.getValue();
        c1611670s2f.getClass();
        C1611810s2t c1611810s2tLIZIZ = C1611670s2f.LIZIZ(str);
        c1611810s2tLIZIZ.getClass();
        if (!Intrinsics.LJFF(c1611810s2tLIZIZ, C1611670s2f.LIZJ) && c1611810s2tLIZIZ.LJ == 0) {
            c1611810s2tLIZIZ.LJ = SystemClock.elapsedRealtime();
            C1611810s2t.LIZIZ(c1611810s2tLIZIZ, "fragmentCreateStart");
        }
        IAutomaticPageStayTimeService.LIZ.getClass();
        C1581030rFF.LIZIZ(this, "paid_series_detail_page");
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        C19EG activity;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/series/innerfeed/fragment/SeriesInnerFeedDetailPageFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcZbLz3wqRMbbsU21Za8g7u6W0fZx3SQFpBQst+9mRR7kB+qyzNfuxP+ckdxna1r18S6CrggWvxfb", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        IAutomaticPageStayTimeService.LIZ.getClass();
        C1581030rFF.LIZ(this);
        if (z) {
            C694550RMf.LIZ.getClass();
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("paid_content_prevent_screen_recording", true) && (activity = getActivity()) != null) {
                C1336100ksC.LJFF(activity);
                C2344809Gs.LIZLLL(4, "PaidContent", "disable screen capture");
            }
        } else {
            aS();
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(SeriesInnerFeedDetailPageFragment.class);
        }
    }

    public final void ZR(View view, TuxTextView tuxTextView) {
        String string;
        hS(tuxTextView);
        Context context = getContext();
        String string2 = null;
        if (context != null) {
            string2 = context.getString(2131839410);
        }
        String str = "";
        if (string2 == null) {
            string2 = "";
        }
        tuxTextView.setText(string2);
        int i = (int) (view.getResources().getDisplayMetrics().density * 122.0f);
        tuxTextView.setMaxLines(1);
        tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (tuxTextView.getMeasuredWidth() <= i) {
            return;
        }
        Context context2 = getContext();
        if (context2 != null && (string = context2.getString(2131839411)) != null) {
            str = string;
        }
        tuxTextView.setText(str);
        tuxTextView.setMaxLines(1);
        tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (tuxTextView.getMeasuredWidth() <= i) {
            return;
        }
        tuxTextView.setMaxLines(2);
        tuxTextView.setMaxWidth(i);
        tuxTextView.setTextSize(12.0f);
        tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        Layout layout = tuxTextView.getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            int i2 = 0;
            for (int i3 = 0; i3 < lineCount; i3++) {
                int iCeil = (int) Math.ceil(layout.getLineWidth(i3));
                if (iCeil > i2) {
                    i2 = iCeil;
                }
            }
            if (1 <= i2 && i2 < i) {
                tuxTextView.setMaxWidth(i2 + tuxTextView.getCompoundPaddingLeft() + tuxTextView.getCompoundPaddingRight());
            }
        }
    }

    public final void dS(Aweme aweme, String str) {
        String string;
        String aid;
        PaidContentInfo paidContentInfo;
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object value = this.LLJIJIL.getValue();
            String str2 = "";
            if (value == null) {
                value = "";
            }
            linkedHashMap.put("enter_from", value);
            linkedHashMap.put("series_enter_entrance", this.LLJILJIL.getValue());
            if (aweme == null || (paidContentInfo = aweme.mPaidContentInfo) == null || (string = Long.valueOf(paidContentInfo.getPaidCollectionId()).toString()) == null) {
                string = "";
            }
            linkedHashMap.put("collection_id", string);
            if (aweme != null && (aid = aweme.getAid()) != null) {
                str2 = aid;
            }
            linkedHashMap.put("group_id", str2);
            miniDramaETInjectServiceLIZ.onEventV3(str, linkedHashMap);
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.view.View] */
    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        ViewGroup viewGroup;
        C1611670s2f c1611670s2f = C1611670s2f.LIZ;
        String str = (String) this.LLJI.getValue();
        c1611670s2f.getClass();
        C1611810s2t c1611810s2tLIZIZ = C1611670s2f.LIZIZ(str);
        c1611810s2tLIZIZ.getClass();
        if (!Intrinsics.LJFF(c1611810s2tLIZIZ, C1611670s2f.LIZJ) && c1611810s2tLIZIZ.LJI == 0) {
            c1611810s2tLIZIZ.LJI = SystemClock.elapsedRealtime();
            C1611810s2t.LIZIZ(c1611810s2tLIZIZ, "fragmentViewCreateStart");
        }
        super.onViewCreated(view, bundle);
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            ((IWatchVideoService) ServiceManager.get().getService(IWatchVideoService.class)).LJFF(viewGroup, this);
        }
        View view2 = (View) this.LLILLL.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS158S0100000_24(this, 40), view2);
        }
        final ViewStub viewStub = (ViewStub) view.findViewById(R.id.vsb_series_discover_entry);
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = view.findViewById(R.id.lu_);
        C740740T3w.LIZLLL(this, getViewLifecycleOwner(), new C0T2Y() { // from class: X.0h49
            /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:12)(1:6)|7|(8:9|(0)|103|24|27|(1:(1:(1:(1:(1:33)(2:41|(1:43)(1:44)))(1:45))(1:46))(1:47))(1:48)|34|(4:36|(1:38)|39|40)(4:49|(2:(1:52)(1:78)|53)|54|(5:56|(2:(2:75|(0))|77)(3:70|(2:72|(0))|77)|60|(1:(2:63|(3:90|(1:92)|93)(2:66|(2:68|69)))(2:79|(1:81)))(3:82|(2:84|(2:86|(1:88))(2:101|102))|89)|(1:108)(2:99|100))(1:105)))(7:(0)(2:17|(4:19|(1:21)|22|23))|103|24|27|(0)(0)|34|(0)(0))|14|(0)|103|24|27|(0)(0)|34|(0)(0)) */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
            
                r2 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
            
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
                r8 = 0;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
            @Override // X.C0T2Y
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void Y3(com.ss.android.ugc.aweme.feed.model.Aweme r19) {
                /*
                    Method dump skipped, instruction units count: 564
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1189750h49.Y3(com.ss.android.ugc.aweme.feed.model.Aweme):void");
            }
        });
    }

    public static int cS(View view, TuxTextView tuxTextView, boolean z) {
        int i;
        int iMakeMeasureSpec;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, tuxTextView);
        if (view.getHeight() > 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824);
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height > 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getLayoutParams().height, 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
        return view.getMeasuredWidth();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws JSONException {
        C1611670s2f c1611670s2f = C1611670s2f.LIZ;
        String str = (String) this.LLJI.getValue();
        c1611670s2f.getClass();
        C1611810s2t c1611810s2tLIZIZ = C1611670s2f.LIZIZ(str);
        c1611810s2tLIZIZ.getClass();
        if (!Intrinsics.LJFF(c1611810s2tLIZIZ, C1611670s2f.LIZJ) && c1611810s2tLIZIZ.LJFF == 0) {
            c1611810s2tLIZIZ.LJFF = SystemClock.elapsedRealtime();
            C1611810s2t.LIZIZ(c1611810s2tLIZIZ, "fragmentCreateViewStart");
        }
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }

    public static void WR(int i, int i2, View view, Function0 function0) {
        if (i <= 0) {
            function0.invoke();
            return;
        }
        if (i2 == -2) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
            i2 = view.getMeasuredWidth();
        }
        if (i2 > 0 && i2 != i) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(view, 23));
            valueAnimatorOfInt.addListener(new ALAdapterS9S0100000_12(function0, 29));
            valueAnimatorOfInt.start();
            return;
        }
        function0.invoke();
    }
}
