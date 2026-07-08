package com.ss.android.ugc.aweme.poi.tag;

import X.C01GW;
import X.C03D5;
import X.C0RF0;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1AF0;
import X.C2217381BqS;
import X.C299590Boj;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C690430R6j;
import X.C690870R8b;
import X.C704010RjT;
import X.C723580SZw;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C814420VxA;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class NearbyPoiTagAssem extends SimpleTagTemplateComponent<NearbyPoiTagAssem> {
    public C03D5 LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public final C01GW LLLFF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(299));
    public final AwS555S0100000_11 LLLII = new AwS555S0100000_11(this, 517);

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent
    public final int Gp() {
        return R.layout.e1a;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent, com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        C690870R8b c690870R8b;
        Fp(videoItemParams);
        String str = null;
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
            c690870R8b = new C690870R8b();
            if (C299590Boj.LIZ()) {
                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                c690870R8b.LIZIZ = "cell_unknown";
            }
        }
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        }
        if (!C704010RjT.LJ(str)) {
            C03D5 c03d5 = this.LLLFFI;
            if (c03d5 != null) {
                c03d5.setData(videoItemParams.getAweme());
            }
        } else {
            Fp(videoItemParams);
        }
        this.LLLI = true;
        this.LLLII.invoke();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent
    public final void Fp(VideoItemParams videoItemParams) {
        int iIntValue;
        Integer numLIZJ;
        TuxIconView tuxIconView = this.LLL;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZ = R.raw.icon_map_pin_fill;
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        TuxTextView tuxTextView = this.LLLF;
        if (tuxTextView != null) {
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setMaxLines(1);
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            tuxTextView.setTextColor(iIntValue);
        }
        View view = this.LLJZIJLIL;
        if (view != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.f527avg);
            view.setBackground(c384050F3z.LIZ(LJJIJL().getContext()));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLLFZ = false;
        this.LLLI = false;
        this.LLLFFI = (C03D5) view.findViewById(R.id.rdv);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0RVy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(100), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent, com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }
}
