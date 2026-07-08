package com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem;

import X.C01GW;
import X.C03H5;
import X.C1035340d36;
import X.C13LE;
import X.C737910Sx3;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdEventViewModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdViewModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.AdPopUpWebPageVM;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.List;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public abstract class AbsAdPopUpWebPageAssem<RECEIVER extends C03H5> extends ReusedUIContentAssem<RECEIVER> implements InterfaceC712990Rxx<VideoItemParams> {
    public final C01GW LLJJJJ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS252S0000000_16.get$arr$(123));
    public final C01GW LLJJJJJIL = C737910Sx3.LIZJ(this, C13LE.LIZ(FeedAdViewModel.class), AFwS252S0000000_16.get$arr$(124));
    public final C01GW LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS252S0000000_16.get$arr$(125));
    public final C01GW LLJJL = C737910Sx3.LIZJ(this, C13LE.LIZ(FeedAdEventViewModel.class), AFwS252S0000000_16.get$arr$(126));
    public C1035340d36 LLJJLIIIJLLLLLLLZ;

    public abstract AdPopUpWebPageVM cp();

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: dp, reason: merged with bridge method [inline-methods] */
    public boolean ur(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(VideoItemParams videoItemParams) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
