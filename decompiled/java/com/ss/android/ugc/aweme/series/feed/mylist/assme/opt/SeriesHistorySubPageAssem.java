package com.ss.android.ugc.aweme.series.feed.mylist.assme.opt;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1163504gr;
import X.C1220000hqw;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C1559170qfz;
import X.C1559260qg8;
import X.C1573600r3G;
import X.C1573670r3N;
import X.C1749280vcc;
import X.C197039127h;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2162308dZ;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C426750GoL;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.minidrama.common.component.model.MyListBanner;
import com.ss.android.ugc.aweme.series.feed.model.MyListSceneEnum;
import com.zhiliaoapp.musically.R;
import defpackage.RecyclerViewFirstDrawWatcher;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesHistorySubPageAssem extends UIListContentAssem<SeriesHistorySubPageViewModel> {
    public boolean LLJILJILJ;
    public C1749280vcc LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public RemoteImageView LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public C197039127h LLJJIJIL;
    public TuxIconView LLJJJ;
    public MyListBanner LLJJJIL;
    public final C736950SvV LLJJJJLIIL;
    public final C736950SvV LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final String LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1559170qfz.class, "series_history_sub_page_key"), checkSupervisorPrepared());
    public final String LLJ = "history";
    public final String LLJI = "favorites";
    public final String LLJIJIL = "purchased";
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(276));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 927));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(279));

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 3;
        return c20603715jn;
    }

    public final Keva Oo() {
        return (Keva) this.LLJILJIL.getValue();
    }

    public final C1559170qfz So() {
        return (C1559170qfz) this.LLIZLLLIL.getValue();
    }

    public final SeriesHistoryMainPageViewModel Vo() {
        return (SeriesHistoryMainPageViewModel) this.LLJJJJLIIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Zo, reason: merged with bridge method [inline-methods] */
    public final SeriesHistorySubPageViewModel Jo() {
        return (SeriesHistorySubPageViewModel) this.LLJJL.getValue();
    }

    public final void ap() {
        View view = this.LLJJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJJI;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        this.LLJILJILJ = false;
    }

    public final void bp() {
        if (this.LLJILJILJ) {
            C1559170qfz c1559170qfzSo = So();
            int i = c1559170qfzSo != null ? c1559170qfzSo.LLILLL : 0;
            if (Vo().getState().LLILLJJLI != i) {
                return;
            }
            MyListSceneEnum.Companion.getClass();
            MyListSceneEnum myListSceneEnumLIZ = C1573670r3N.LIZ(i);
            if (this.LLJLILLLLZIIL) {
                return;
            }
            this.LLJLILLLLZIIL = true;
            C1163504gr c1163504gr = C1163504gr.LIZIZ;
            C2344009Gk c2344009GkNo = No(myListSceneEnumLIZ);
            c2344009GkNo.LJIIIIZZ("outreach_show_method", "show");
            c1163504gr.onEventV3("guide_user_m2_show", c2344009GkNo.LIZ);
        }
    }

    public SeriesHistorySubPageAssem() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(277);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeriesHistoryMainPageViewModel.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(285);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24((AbstractC738140SxQ) this, 930);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJJJLIIL = new C736950SvV(c19719912DlLIZ, aFwS213S0000000_24, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS264S0000000_24, awS568S0100000_24, c451610HnL, c723700Sa8);
        AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24(this, 926);
        this.LLJJL = new C736950SvV(C13LE.LIZ(SeriesHistorySubPageViewModel.class), awS568S0100000_242, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(286), new AwS568S0100000_24((AbstractC738140SxQ) this, 925), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 928));
        this.LLJLIL = "com.ss.android.ttmd.video";
    }

    public final C2344009Gk No(MyListSceneEnum myListSceneEnum) {
        String str;
        String str2;
        String str3;
        String[] strArr = new String[2];
        MyListBanner myListBanner = this.LLJJJIL;
        String str4 = null;
        if (myListBanner != null) {
            str = myListBanner.starlingKeyTitle;
        } else {
            str = null;
        }
        strArr[0] = str;
        if (myListBanner != null) {
            str4 = myListBanner.starlingKeyDesc;
        }
        strArr[1] = str4;
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LQ.LJIJI(strArr), "_", null, null, 0, null, null, 62);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("outreach_type", "drama_revisit_card");
        int i = C1573600r3G.LIZ[myListSceneEnum.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str2 = "";
            } else {
                str2 = "drama_list_favourite";
            }
        } else {
            str2 = "drama_list_history";
        }
        c2344009Gk.LJIIIIZZ("outreach_key", str2);
        Context context = getContext();
        if (context != null && C2162308dZ.LJFF(context, "com.ss.android.ttmd.video")) {
            str3 = "guide_open";
        } else {
            str3 = "guide_download";
        }
        c2344009Gk.LJIIIIZZ("outreach_intention", str3);
        c2344009Gk.LJIIIIZZ("outreach_to_app_id", "845221");
        c2344009Gk.LJIIIIZZ("enter_from", "series_mylist");
        c2344009Gk.LJIIIIZZ("outreach_download_method", "inner_store");
        c2344009Gk.LJIIIIZZ("outreach_content", strLJJLIIIJ);
        return c2344009Gk;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJILLL = (C1749280vcc) view.findViewById(R.id.jq1);
        this.LLJJ = view.findViewById(R.id.urd);
        this.LLJJI = view.findViewById(R.id.moq);
        this.LLJJIII = (RemoteImageView) view.findViewById(R.id.urg);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.urj);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.urf);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.urh);
        this.LLJJIJIL = c197039127h;
        if (c197039127h != null) {
            C426750GoL.LJIIL(c197039127h, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
            c197039127h.LJJJJL(AFwS236S0000000_6.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        }
        this.LLJJJ = (TuxIconView) view.findViewById(R.id.ure);
        View view2 = this.LLJJ;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS158S0100000_24(this, 34), view2);
        }
        TuxIconView tuxIconView = this.LLJJJ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS158S0100000_24(this, 35));
        }
        Go().setLayoutManager(new GridLayoutManager(getContext(), 1));
        Go().setItemAnimator(null);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r36
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1573490r35) obj).LLILLL;
            }
        }, null, new AwS638S0100000_24(this, 67), 6);
        C736680Sv4.LJIIIIZZ(this, Vo(), new C2217381BqS() { // from class: X.0r3M
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1573630r3J) obj).LLILZLL;
            }
        }, null, new AwS638S0100000_24(this, 68), 6);
        C736680Sv4.LJIIIIZZ(this, Vo(), new C2217381BqS() { // from class: X.0r3L
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1573630r3J) obj).LLILZIL);
            }
        }, null, new AwS638S0100000_24(this, 69), 6);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0r2c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1573490r35 c1573490r35 = (C1573490r35) obj;
                c1573490r35.getClass();
                return C627260Oiy.LIZLLL(c1573490r35);
            }
        }, null, new AwS603S0100000_24(this, 197), new AwS568S0100000_24(this, 929), new AwS603S0100000_24(this, 198), 2, null);
        C736680Sv4.LJIIIIZZ(this, Vo(), new C2217381BqS() { // from class: X.0r3I
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1573630r3J) obj).LLILLJJLI);
            }
        }, null, new AwS638S0100000_24(this, 66), 6);
        new RecyclerViewFirstDrawWatcher(Go(), AFwS213S0000000_24.get$arr$(278)).LIZIZ();
    }

    public static void Lo(Uri.Builder builder, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
