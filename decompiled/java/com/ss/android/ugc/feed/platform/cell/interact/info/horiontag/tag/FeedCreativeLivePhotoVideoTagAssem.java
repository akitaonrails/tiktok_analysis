package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C01GW;
import X.C0DIV;
import X.C0RF0;
import X.C0RJE;
import X.C0RKL;
import X.C0RKP;
import X.C13LE;
import X.C1559260qg8;
import X.C1744700vVE;
import X.C1A5L;
import X.C1AF0;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C299590Boj;
import X.C300390Bq1;
import X.C339190DRl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C690430R6j;
import X.C690870R8b;
import X.C704010RjT;
import X.C704020RjU;
import X.C715390S4j;
import X.C715400S4k;
import X.C723580SZw;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC700430Rdh;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedCreativeLivePhotoVideoTagAssem extends DynamicComponent<FeedCreativeLivePhotoVideoTagAssem> implements C0RKP {
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1260));
    public final C01GW LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(565));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b5k;
    }

    public final View Fp() {
        if (bp()) {
            return getContentView().findViewById(R.id.n9i);
        }
        return null;
    }

    public final TuxTextView Gp() {
        if (bp()) {
            return (TuxTextView) getContentView().findViewById(R.id.zt1);
        }
        return null;
    }

    @Override // X.C0RKP
    public final float Lf() {
        return C0DIV.LIZ(Gp());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        String string;
        int i = FeedCreativeLivePhotoTagTrigger.LLJLIL;
        if (C0RKL.LIZ(getContext(), videoItemParams)) {
            C786410Ut5.LJLLLLLL(0, getContentView());
            C786410Ut5.LJLLLLLL(0, LJJIJL());
        } else {
            C786410Ut5.LJLLLLLL(8, getContentView());
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
        TuxTextView tuxTextViewGp = Gp();
        if (tuxTextViewGp != null) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(2131836576);
            } else {
                string = null;
            }
            tuxTextViewGp.setText(string);
        }
    }

    @Override // X.C0RKP
    public final int ka(boolean z) {
        View viewFindViewById;
        boolean z2;
        TuxTextView tuxTextViewGp = Gp();
        String str = null;
        if (bp()) {
            viewFindViewById = getContentView().findViewById(R.id.lm3);
        } else {
            viewFindViewById = null;
        }
        View viewFp = Fp();
        int width = 0;
        if (C300390Bq1.LIZ() && tuxTextViewGp != null && viewFindViewById != null && viewFp != null) {
            if (z) {
                if (tuxTextViewGp.getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int iLIZIZ = 22;
                if (z2) {
                    width = viewFp.getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                }
                C426750GoL.LJIIIZ(viewFindViewById, null, null, 0, null, false, 27);
                C0RF0 c0rf0 = jm().LIZLLL;
                if (c0rf0 != null) {
                    str = c0rf0.LJIIIZ;
                }
                if (C704010RjT.LJ(str)) {
                    iLIZIZ = C704020RjU.LIZIZ();
                }
                C1744700vVE.LJIIL(viewFp, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZIZ))));
                C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZIZ))), viewFp);
                C426750GoL.LJIIL(viewFp, 0, null, 0, null, 26);
                C339190DRl.LIZIZ(tuxTextViewGp);
            } else {
                C1744700vVE.LJIIL(viewFp, -2);
                C1744700vVE.LJIIIIZZ(-2, viewFp);
                C426750GoL.LJIIL(viewFp, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, 26);
                C426750GoL.LJIIIZ(viewFindViewById, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, false, 27);
                C339190DRl.LIZLLL(tuxTextViewGp);
                return 0;
            }
        }
        return width;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C690870R8b c690870R8b;
        String str;
        super.onViewCreated(view);
        float f = C715390S4j.LIZ;
        C715390S4j.LIZJ(4, view.findViewById(R.id.n9i));
        View viewFp = Fp();
        if (viewFp != null) {
            setComponentClickStatusExperimental(viewFp, EnumC700430Rdh.POSITIVE);
        }
        C2271391DvN.LIZ(Fp(), (C1A5L) C2271381DvM.LLLZ.getValue());
        View viewFp2 = Fp();
        if (viewFp2 != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0RDb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            }, viewFp2);
        }
        if (C300390Bq1.LIZ()) {
            C426750GoL.LJIIIZ(getContentView(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, 0, null, false, 26);
            View viewFindViewById = getContentView().findViewById(R.id.zt1);
            if (viewFindViewById != null) {
                C426750GoL.LJIIIZ(viewFindViewById, null, 0, null, null, false, 29);
            }
        }
        if (!C715400S4k.LIZIZ()) {
            C715390S4j.LIZ(view);
        }
        TuxIconView tuxIconView = null;
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
        } else {
            str = null;
        }
        if (C704010RjT.LJ(str)) {
            C704010RjT.LIZLLL(Gp());
            if (bp()) {
                tuxIconView = (TuxIconView) getContentView().findViewById(R.id.lm3);
            }
            C704010RjT.LIZJ(tuxIconView);
            C704010RjT.LIZIZ(Gp());
        }
        C0RJE.LIZLLL(this, (VideoViewModel) this.LLL.getValue(), new AwS555S0100000_11(this, 1261));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }
}
