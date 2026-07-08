package com.ss.android.ugc.aweme.feed.assem;

import X.C01GW;
import X.C1295960jpS;
import X.C13LE;
import X.C14LC;
import X.C1576740r8K;
import X.C1720106oR;
import X.C19252910Tv;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C690440R6k;
import X.C709710Rsf;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS146S0100000_11;
import Y.ACListenerS158S0100000_24;
import Y.ARunnableS102S0100000_2;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class GuideBackToFYPAssem extends FeedBaseAssem<GuideBackToFYPAssem> {
    public static String LLJLILLLLZIIL = "default";
    public final C01GW LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(49));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 192));
    public C1295960jpS LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.c7s;
    }

    public static void up(String str) {
        if (str.length() > 0) {
            C20684815ws.LJIJI("homepage_return_guide", new Pair(str, "action_type"), new Pair("homepage_follow", "enter_from"), new Pair("read_all", "enter_method"));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.jcf);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(42));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
        linearLayout.setBackground(c384050F3z.LIZ(view.getContext()));
        C786410Ut5.R7(linearLayout, new ACListenerS158S0100000_24(this, 115));
        ((TextView) view.findViewById(R.id.jdv)).setMaxLines(1);
        C1295960jpS c1295960jpS = (C1295960jpS) view.findViewById(R.id.b96);
        c1295960jpS.setRepeatCount(-1);
        HandlerHook.viewPost(c1295960jpS, new ARunnableS102S0100000_2(c1295960jpS, 94));
        this.LLJLIL = c1295960jpS;
        C786410Ut5.I7(new ACListenerS146S0100000_11(this, 90), LJJIJL());
        if (C14LC.LJIIIZ || C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 0) {
            C426750GoL.LJIIL(getContentView(), null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIIJ)))), 23);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0NzW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(51), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0Nl7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(52), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0Rsg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIIJIL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(53), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        if (!C709710Rsf.LIZ(videoItemParams2.getAweme().getAid())) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on bind item: ");
        sbLIZ.append(videoItemParams2.getAweme().getAid());
        sbLIZ.append('!');
        C1720106oR.LJI("GuideFYPAssem", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void tp(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismissGuide ");
        sbLIZ.append(str);
        sbLIZ.append(" 1");
        C1720106oR.LJI("GuideFYPAssem", C2188811AlT.LIZIZ(sbLIZ));
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null && c1576740r8KLIZ.LIZIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dismissGuide ");
            sbLIZ2.append(str);
            sbLIZ2.append(" 2");
            C1720106oR.LJI("GuideFYPAssem", C2188811AlT.LIZIZ(sbLIZ2));
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            LLJLILLLLZIIL = "default";
            C1295960jpS c1295960jpS = this.LLJLIL;
            if (c1295960jpS != null) {
                c1295960jpS.cancelAnimation();
            }
            C1576740r8K c1576740r8KLIZ2 = C690440R6k.LIZ();
            if (c1576740r8KLIZ2 != null) {
                c1576740r8KLIZ2.LIZLLL(false);
            }
            up(str);
            C1720106oR.LJI("GuideFYPAssem", "dismiss guide!");
        }
    }
}
