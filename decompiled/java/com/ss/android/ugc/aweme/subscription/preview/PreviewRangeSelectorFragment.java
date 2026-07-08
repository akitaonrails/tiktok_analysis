package com.ss.android.ugc.aweme.subscription.preview;

import X.AbstractC1868060yiC;
import X.C01GW;
import X.C098200Yq;
import X.C0LAB;
import X.C10AI;
import X.C10FS;
import X.C10FW;
import X.C10FX;
import X.C10FY;
import X.C10FZ;
import X.C1168390gVh;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C1579100rC8;
import X.C1685300txQ;
import X.C1688490u2Z;
import X.C1701940uOG;
import X.C1868050yiB;
import X.C1868070yiD;
import X.C189200o6;
import X.C19214410Fa;
import X.C19214510Fb;
import X.C19214610Fc;
import X.C19214710Fd;
import X.C19215310Fj;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC19214810Fe;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS222S0100000_18;
import Y.AObserverS230S0100000_28;
import Y.AfS197S0100000_28;
import Y.AkS489S0100000_28;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PreviewRangeSelectorFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8JmHELIOSs8OyolISA7Zx8hLTMlLDgBKSsrLBw2JCAvPSAhDjctLiI2JjE=";
    public final PreviewRangeSelectorViewModel LL = new PreviewRangeSelectorViewModel(0);
    public final C11NJ LLILLJJLI = new C11NJ();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 572));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 578));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 580));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 576));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 573));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 575));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 579));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 577));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 574));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 571));
    public C10FW LLJILJILJ;
    public C10FX LLJILLL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C10FX c10fx = this.LLJILLL;
        if (c10fx != null) {
            c10fx.onDestroy();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLILLJJLI.LJ();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.LLJILLL != null) {
            PreviewRangeSelectorViewModel previewRangeSelectorViewModel = this.LL;
            if (Intrinsics.LJFF(previewRangeSelectorViewModel.vQ2().LIZIZ, C1688490u2Z.LIZ)) {
                previewRangeSelectorViewModel.LLILLJJLI.postValue(previewRangeSelectorViewModel.vQ2().LIZJ());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Aweme aweme;
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        CMPreviewInfo cmPreviewInfo;
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        com.ss.android.ugc.aweme.creative.model.CMPreviewInfo cMPreviewInfo;
        super.onViewCreated(view, bundle);
        PreviewRangeSelectorViewModel previewRangeSelectorViewModel = this.LL;
        C10FW c10fw = this.LLJILJILJ;
        Context context = getContext();
        if (context != null && C426750GoL.LIZLLL(context)) {
            z = true;
        } else {
            z = false;
        }
        C19214410Fa c19214410FaVQ2 = previewRangeSelectorViewModel.vQ2();
        c19214410FaVQ2.getClass();
        AbstractC1868060yiC abstractC1868060yiC = null;
        if (c10fw != null) {
            abstractC1868060yiC = c10fw.LIZIZ;
        }
        if (abstractC1868060yiC instanceof C1868070yiD) {
            VideoPublishEditModel videoPublishEditModel = ((C1868070yiD) abstractC1868060yiC).LIZ;
            if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null && (cMPreviewInfo = privacySettingModel.cmPreviewInfo) != null && cMPreviewInfo.previewDurationTimeInMs > 0) {
                float fLJ = C10FS.LJ(cMPreviewInfo.previewStartTimeInMs);
                c19214410FaVQ2 = C19214410Fa.LIZ(c19214410FaVQ2, null, null, fLJ, fLJ + C10FS.LJ(cMPreviewInfo.previewDurationTimeInMs), 0.0f, cMPreviewInfo, 0.0f, false, 0.0f, 467);
            }
        } else if ((abstractC1868060yiC instanceof C1868050yiB) && (aweme = ((C1868050yiB) abstractC1868060yiC).LIZ) != null && (contentModel = aweme.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel.getCmPreviewInfo()) != null) {
            Long previewSettingsDuration = cmPreviewInfo.getPreviewSettingsDuration();
            Long previewSettingsStartTime = cmPreviewInfo.getPreviewSettingsStartTime();
            if (previewSettingsStartTime != null && previewSettingsDuration != null && previewSettingsDuration.longValue() > 0) {
                float fLJ2 = C10FS.LJ(previewSettingsStartTime.longValue());
                c19214410FaVQ2 = C19214410Fa.LIZ(c19214410FaVQ2, null, null, fLJ2, fLJ2 + C10FS.LJ(previewSettingsDuration.longValue()), 0.0f, null, 0.0f, false, 0.0f, 499);
            }
        }
        previewRangeSelectorViewModel.LLILLJJLI.postValue(C19214410Fa.LIZ(c19214410FaVQ2, c10fw, null, 0.0f, 0.0f, 0.0f, null, 0.0f, z, 0.0f, 382));
        this.LL.LLJI.observe(getViewLifecycleOwner(), new AObserverS222S0100000_18(this, 31));
        this.LL.LLJIJIL.observe(getViewLifecycleOwner(), new AObserverS222S0100000_18(this, 32));
        this.LL.LLILZIL.observe(getViewLifecycleOwner(), new C19214510Fb(this));
        this.LL.LLILZLL.observe(getViewLifecycleOwner(), new C19214610Fc(this));
        this.LL.LLJJI.observe(getViewLifecycleOwner(), new C10FZ(this));
        this.LL.LLJJIJI.observe(getViewLifecycleOwner(), new C10FY(this));
        this.LL.LLJJIJIL.observe(getViewLifecycleOwner(), new C1168390gVh(this));
        this.LL.LLJILLL.observe(getViewLifecycleOwner(), new C19214710Fd(this));
        this.LL.LLILLL.observe(getViewLifecycleOwner(), new AObserverS230S0100000_28(this, 51));
        this.LL.LLILZ.observe(getViewLifecycleOwner(), new AObserverS230S0100000_28(this, 52));
        this.LL.LLJILJIL.observe(getViewLifecycleOwner(), new AObserverS222S0100000_18(this, 33));
        C786410Ut5.Y7((ConstraintLayout) this.LLJI.getValue(), new ACListenerS162S0100000_28(this, 123));
        C786410Ut5.Y7((ConstraintLayout) this.LLJIJIL.getValue(), new ACListenerS162S0100000_28(this, 124));
        C786410Ut5.U8((C197039127h) this.LLIZLLLIL.getValue(), new ACListenerS162S0100000_28(this, 125));
        C786410Ut5.U8((C197039127h) this.LLJ.getValue(), new ACListenerS162S0100000_28(this, 126));
        C786410Ut5.a9((TuxIconView) this.LLJILJIL.getValue(), new ACListenerS162S0100000_28(this, 127));
    }

    public final void NR(C10FX c10fx, float f, float f2) {
        String str;
        PreviewRangeSelectorViewModel previewRangeSelectorViewModel = this.LL;
        C19214410Fa c19214410FaVQ2 = previewRangeSelectorViewModel.vQ2();
        c19214410FaVQ2.getClass();
        previewRangeSelectorViewModel.LLILLJJLI.setValue(C19214410Fa.LIZ(C19214410Fa.LIZ(c19214410FaVQ2, null, null, 0.0f, 0.0f, f, null, 0.0f, false, 0.0f, 495), null, C19215310Fj.LIZ, 0.0f, 0.0f, 0.0f, null, 0.0f, false, 0.0f, 509));
        C10AI c10ai = C10AI.LIZ;
        C10FW c10fw = previewRangeSelectorViewModel.vQ2().LIZ;
        if (c10fw != null) {
            str = c10fw.LIZJ;
        } else {
            str = null;
        }
        String strValueOf = String.valueOf(previewRangeSelectorViewModel.vQ2().LJIIL);
        c10ai.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("preview_duration", strValueOf);
        C20684815ws.LJIILLIIL("preview_setting_pop_up_show", c0lab.LIZ);
        this.LLILLJJLI.LIZ(C11NZ.LJJJJJL(500L, 500L, TimeUnit.MILLISECONDS).LJJJJZI(new AkS489S0100000_28(c10fx, 8)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS197S0100000_28(this, 83)));
        C10FX c10fx2 = this.LLJILLL;
        if (c10fx2 != null) {
            c10fx2.LJFF(f2);
        }
        if (c10fx != null) {
            c10fx.LJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        Context context = getContext();
        C19GS c19gs = null;
        if (context != null) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fem, viewGroup, false);
        } else {
            viewTd = null;
        }
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

    public final void MR(String str, float f, Pair<Long, Long> pair, EnumC19214810Fe enumC19214810Fe) {
        String string;
        C1579100rC8 c1579100rC8 = new C1579100rC8();
        c1579100rC8.LJI = str;
        c1579100rC8.LIZJ(6);
        c1579100rC8.LIZLLL(pair.getFirst().longValue(), pair.getSecond().longValue());
        c1579100rC8.LIZIZ(C10FS.LIZJ(f));
        Context context = getContext();
        if (context == null || (string = context.getString(2131830332)) == null) {
            string = "";
        }
        c1579100rC8.LJII = string;
        c1579100rC8.LJ = new AwS394S0200000_28(this, enumC19214810Fe, 43);
        c1579100rC8.LIZ().LIZ.show(getParentFragmentManager(), "preview_time_wheel_picker");
    }
}
