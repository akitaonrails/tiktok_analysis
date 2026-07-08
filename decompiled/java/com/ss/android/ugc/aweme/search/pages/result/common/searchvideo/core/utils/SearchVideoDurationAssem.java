package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.utils;

import X.C098200Yq;
import X.C0HHT;
import X.C13LE;
import X.C1637806bA;
import X.C189200o6;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C659520Ptu;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchVideoDurationAssem extends ReusedUIContentAssem<SearchVideoDurationAssem> implements InterfaceC712990Rxx<C659520Ptu> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final InterfaceC1731706qJ LLJJJJ;
    public View LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchVideoDurationAssem.class, "searchVideoHolderVM", "getSearchVideoHolderVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchVideoHolderVM;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchVideoDurationAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchVideoHolderVM.class);
        this.LLJJJJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 588), null, AFwS236S0000000_6.get$arr$(293));
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            c098200Yq = view.findViewById(R.id.i5d);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        this.LLJJJJJIL = (View) c098200Yq;
        try {
            c098200Yq2 = (TuxTextView) view.findViewById(R.id.tv_video_duration);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj = c098200Yq2;
        }
        this.LLJJJJLIIL = (TuxTextView) obj;
        View view2 = this.LLJJJJJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJ.getValue(this, LLJJL[0]), new C2217381BqS() { // from class: X.0H8L
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0H89) obj2).LLILLJJLI;
            }
        }, null, AFwS289S0000000_6.get$arr$(19), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659520Ptu c659520Ptu) {
        C659520Ptu c659520Ptu2 = c659520Ptu;
        String strK4 = null;
        if (!c659520Ptu2.LL.hasVisionSearchEntry() && !c659520Ptu2.LL.isAd()) {
            TuxTextView tuxTextView = this.LLJJJJLIIL;
            if (tuxTextView != null) {
                Video video = c659520Ptu2.LL.getVideo();
                if (video != null) {
                    int duration = video.getDuration() / LSPassThroughRecordSizeConfig.DEFAULT;
                    strK4 = C786410Ut5.k4(Locale.ENGLISH, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(duration / 60), Integer.valueOf(duration % 60)}, 2));
                }
                tuxTextView.setText(strK4);
            }
            View view = this.LLJJJJJIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLJJJJLIIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText((CharSequence) null);
        }
        View view2 = this.LLJJJJJIL;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view2);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659520Ptu c659520Ptu) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659520Ptu c659520Ptu) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
