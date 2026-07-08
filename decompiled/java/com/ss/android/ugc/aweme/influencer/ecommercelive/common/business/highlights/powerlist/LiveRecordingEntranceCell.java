package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.LiveRecordingEntranceBar;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist.LiveRecordingEntranceCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveRecordingEntranceCell extends PowerCell<LiveRecordingEntranceBar> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveRecordingEntranceCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/highlights/viewmodel/HighlightsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.btr;
    }

    public LiveRecordingEntranceCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HighlightsListViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2830);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(202);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2841), awS577S0100000_33, AFwS224S0000000_33.get$arr$(392), new AwS577S0100000_33((C03K6) this, 2814), new AwS577S0100000_33((C03K6) this, 2816), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2818), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2820), null, new AwS577S0100000_33((C03K6) this, 2821));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2815);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2817);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2819);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 108));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2822);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2824);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2826);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2827);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2828);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2829), awS577S0100000_33, AFwS224S0000000_33.get$arr$(390), new AwS577S0100000_33((C03K6) this, 2831), new AwS577S0100000_33((C03K6) this, 2832), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2833), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2834), null, new AwS577S0100000_33((C03K6) this, 2835));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2836), awS577S0100000_33, AFwS224S0000000_33.get$arr$(391), new AwS577S0100000_33((C03K6) this, 2837), new AwS577S0100000_33((C03K6) this, 2838), new AwS577S0100000_33((C03K6) this, 2839), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2840));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2825));
        this.LLILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2823));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        final LiveRecordingEntranceBar liveRecordingEntranceBar = (LiveRecordingEntranceBar) interfaceC1891350zJl;
        super.onBindItemView(liveRecordingEntranceBar);
        ((TextView) this.LLILLJJLI.getValue()).setText(liveRecordingEntranceBar.getTitle());
        ((TextView) this.LLILLL.getValue()).setText(liveRecordingEntranceBar.getDesc());
        C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.0NtO
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractViewOnClickListenerC420730Ged
            public final void LIZ(View view) {
                String schema;
                if (view != null && (schema = liveRecordingEntranceBar.getSchema()) != null && schema.length() > 0) {
                    AssemVMLazy assemVMLazy = this.LL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LiveRecordingEntranceCell.LLILZ;
                    HighlightsListViewModel highlightsListViewModel = (HighlightsListViewModel) assemVMLazy.getValue();
                    Map mapLIZIZ = C608170NtH.LIZIZ(highlightsListViewModel.LLILLJJLI, highlightsListViewModel.LLILLL, highlightsListViewModel.LLILZ, Intrinsics.LJFF(((C612590O0z) highlightsListViewModel.getState()).LL, new C1623606Xi(Boolean.TRUE)), highlightsListViewModel.LLILZIL);
                    mapLIZIZ.put("module_name", "live_recordings");
                    C1421105hJ.LIZJ("livesdk_tiktokec_module_click", mapLIZIZ);
                    SmartRouter.buildRoute(this.itemView.getContext(), schema).open();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(700L);
            }
        }, this.itemView);
    }
}
