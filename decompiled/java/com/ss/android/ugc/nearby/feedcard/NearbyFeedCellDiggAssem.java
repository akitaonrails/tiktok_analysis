package com.ss.android.ugc.nearby.feedcard;

import X.C1204470hRt;
import X.C1204480hRu;
import X.C1205150hSz;
import X.C1A5L;
import X.C21373118kb;
import X.C2188811AlT;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C296960BkU;
import X.C618720OOo;
import X.C724240Sb0;
import X.C731910SnN;
import X.C734210Sr5;
import X.C734260SrA;
import X.C786410Ut5;
import X.InterfaceC1205300hTE;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AwS667S0100000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFeedCellDiggAssem extends ReusedUIContentAssem<NearbyFeedCellDiggAssem> implements InterfaceC712990Rxx<C1204470hRt> {
    public InterfaceC1205300hTE LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public C21373118kb LLJJJJLIIL;
    public TuxTextView LLJJL;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void dp(Aweme aweme) {
        long diggCount;
        if (aweme == null) {
            return;
        }
        C21373118kb c21373118kb = this.LLJJJJLIIL;
        if (c21373118kb != null) {
            c21373118kb.setSelected(aweme.isLike());
        }
        TuxTextView tuxTextView = this.LLJJL;
        if (tuxTextView != null) {
            C1205150hSz c1205150hSz = C1205150hSz.LIZ;
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                diggCount = statistics.getDiggCount();
            } else {
                diggCount = 0;
            }
            c1205150hSz.getClass();
            tuxTextView.setText(C618720OOo.LIZ(diggCount));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        InterfaceC1205300hTE c734210Sr5;
        this.LLJJJJJIL = (LinearLayout) view.findViewById(R.id.fu8);
        this.LLJJJJLIIL = (C21373118kb) view.findViewById(R.id.kgy);
        this.LLJJL = (TuxTextView) view.findViewById(R.id.tvw_like_counts);
        if (C296960BkU.LIZ()) {
            c734210Sr5 = new C734260SrA(new WeakReference(C724240Sb0.LJI(this)), new AwS667S0100000_18(this, 23));
        } else {
            c734210Sr5 = new C734210Sr5(new WeakReference(getContext()), new AwS667S0100000_18(this, 24));
        }
        this.LLJJJJ = c734210Sr5;
        C786410Ut5.I7(new AbS699S0100000_18(this, 37, 42), view);
        C2271391DvN.LIZ(view, (C1A5L) C2271381DvM.L0.getValue());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1204470hRt c1204470hRt) {
        C1204470hRt c1204470hRt2 = c1204470hRt;
        Aweme aweme = c1204470hRt2.LL;
        InterfaceC1205300hTE interfaceC1205300hTE = this.LLJJJJ;
        if (interfaceC1205300hTE != null) {
            interfaceC1205300hTE.LIZIZ(c1204470hRt2.LLILZIL, aweme);
        }
        dp(aweme);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1204470hRt c1204470hRt) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1204470hRt c1204470hRt) {
    }

    public final void cp(C731910SnN c731910SnN, boolean z) {
        if (c731910SnN == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showDiggState show=");
        sbLIZ.append(c731910SnN.LIZJ);
        sbLIZ.append(", selected=");
        sbLIZ.append(c731910SnN.LIZIZ);
        sbLIZ.append(", fromUserClick=");
        sbLIZ.append(z);
        sbLIZ.append(", diggCount=");
        sbLIZ.append(c731910SnN.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!c731910SnN.LIZJ) {
            LinearLayout linearLayout = this.LLJJJJJIL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(4, linearLayout);
            }
        } else {
            LinearLayout linearLayout2 = this.LLJJJJJIL;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(0, linearLayout2);
            }
            TuxTextView tuxTextView = this.LLJJL;
            if (tuxTextView != null) {
                tuxTextView.setText(c731910SnN.LIZ);
            }
        }
        if (z) {
            C21373118kb c21373118kb = this.LLJJJJLIIL;
            if (c21373118kb != null) {
                c21373118kb.LIZ(c731910SnN.LIZIZ);
                return;
            }
            return;
        }
        C21373118kb c21373118kb2 = this.LLJJJJLIIL;
        if (c21373118kb2 == null) {
            return;
        }
        c21373118kb2.setSelected(c731910SnN.LIZIZ);
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C1204470hRt c1204470hRt = (C1204470hRt) interfaceC1587906Jp;
        up(c1204470hRt);
        if (list != null && !list.isEmpty() && (ListProtector.get(list, 0) instanceof C1204480hRu)) {
            InterfaceC1205300hTE interfaceC1205300hTE = this.LLJJJJ;
            if (interfaceC1205300hTE != null) {
                interfaceC1205300hTE.LIZIZ(c1204470hRt.LLILZIL, c1204470hRt.LL);
            }
            dp(c1204470hRt.LL);
        }
    }
}
