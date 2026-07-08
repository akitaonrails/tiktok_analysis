package com.ss.android.ugc.aweme.feed.landscape.cell.assem.top;

import X.C019F;
import X.C0GRM;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C692760RFi;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C838600Wv4;
import X.InterfaceC2217461Bqa;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS317S0000000_29;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes30.dex */
public final class TopStatusBarAssem extends FeedBaseContentAssem<TopStatusBarAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxIconView LLJJJJLIIL;
    public C0GRM LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopStatusBarAssem.class, "topStatusBarVM", "getTopStatusBarVM()Lcom/ss/android/ugc/aweme/feed/landscape/cell/assem/top/TopStatusBarVM;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TopStatusBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopStatusBarVM.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 400), AFwS243S0000000_11.get$arr$(199), null, true);
    }

    public final TopStatusBarVM dp() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (TopStatusBarVM) assemVMLazy.getValue();
    }

    public final String cp(long j) {
        SimpleDateFormat simpleDateFormat;
        Date date = new Date(j);
        if (DateFormat.is24HourFormat(getContext())) {
            simpleDateFormat = new SimpleDateFormat("HH:mm", C838600Wv4.LIZ());
        } else {
            simpleDateFormat = new SimpleDateFormat("h:mm a", C838600Wv4.LIZ());
        }
        return simpleDateFormat.format(date);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.ydo);
        if (C692760RFi.LIZ) {
            C786410Ut5.LLIIL(relativeLayout, 0);
        } else {
            C786410Ut5.LLIIL(relativeLayout, 8);
        }
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.xwj);
        this.LLJJJJJIL = (TuxTextView) view.findViewById(R.id.bu6);
        this.LLJJJJLIIL = (TuxIconView) view.findViewById(R.id.wifi_icon);
        view.findViewById(R.id.bu2);
        this.LLJJL = (C0GRM) view.findViewById(R.id.bu5);
        this.LLJJLIIIJLLLLLLLZ = (TuxIconView) view.findViewById(R.id.bu3);
        TuxTextView tuxTextView = this.LLJJJJ;
        if (tuxTextView != null) {
            tuxTextView.setText(cp(System.currentTimeMillis()));
        }
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.10yK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19419910yL) obj).LL;
            }
        }, null, AFwS317S0000000_29.get$arr$(2), 6);
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.10yH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C19419910yL) obj).LLILLL);
            }
        }, null, AFwS317S0000000_29.get$arr$(3), 6);
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.10yI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C19419910yL) obj).LLILZ);
            }
        }, null, AFwS317S0000000_29.get$arr$(4), 6);
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.10yJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C19419910yL) obj).LLILLJJLI);
            }
        }, null, AFwS317S0000000_29.get$arr$(5), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
