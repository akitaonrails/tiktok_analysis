package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C07E5;
import X.C1356610lPH;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchCardCreateTimeAssem extends ReusedUISlotAssem<SearchCardBottomBarAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f1l;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.video_holder_time_label);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC435460H5s interfaceC435460H5s) {
        int i;
        Aweme aweme = interfaceC435460H5s.getAweme();
        if (getContext() != null) {
            TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
            TuxTextView tuxTextView2 = null;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            tuxTextView.setText(C1356610lPH.LJII(aweme.getCreateTime() * 1000, tuxTextView.getContext()));
            if (aweme.isAd()) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
            LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
            if (localTestApi != null && localTestApi.shouldCompatibleWithSearchUIAutoTest()) {
                TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxTextView3 != null) {
                    tuxTextView2 = tuxTextView3;
                }
                tuxTextView2.setText("");
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
