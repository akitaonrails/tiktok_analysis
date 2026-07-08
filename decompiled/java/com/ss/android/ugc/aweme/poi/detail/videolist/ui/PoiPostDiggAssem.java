package com.ss.android.ugc.aweme.poi.detail.videolist.ui;

import X.C1187550h0b;
import X.C1187590h0f;
import X.C1187600h0g;
import X.C1558360qeg;
import X.C1559260qg8;
import X.C21373318kd;
import X.C618720OOo;
import X.C723580SZw;
import X.C724240Sb0;
import X.C734160Sr0;
import X.C734200Sr4;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS667S0100000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostDiggAssem extends ReusedUIContentAssem<PoiPostDiggAssem> implements InterfaceC712990Rxx<C1187600h0g> {
    public final C1559260qg8 LLJJJJ = new C1559260qg8(new C723580SZw(this, C1187550h0b.class, "PoiPostDiggHierarchyData"), checkSupervisorPrepared());
    public C734160Sr0 LLJJJJJIL;
    public LinearLayout LLJJJJLIIL;
    public C21373318kd LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void cp(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        C21373318kd c21373318kd = this.LLJJL;
        if (c21373318kd != null) {
            c21373318kd.setSelected(aweme.isLike());
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            long diggCount = statistics.getDiggCount();
            if (diggCount > 0) {
                TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
                TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(C618720OOo.LIZ(diggCount));
                    return;
                }
                return;
            }
        }
        TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView3 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView3, 8);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C734200Sr4 c734200Sr4;
        this.LLJJJJLIIL = (LinearLayout) view.findViewById(R.id.r6m);
        this.LLJJL = (C21373318kd) view.findViewById(R.id.r6o);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.r6p);
        Context context = getContext();
        C1187550h0b c1187550h0b = (C1187550h0b) this.LLJJJJ.getValue();
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (c1187550h0b != null) {
            c734200Sr4 = c1187550h0b.LL;
        } else {
            c734200Sr4 = null;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
        }
        this.LLJJJJJIL = new C734160Sr0(context, c734200Sr4, interfaceC665370Q7zLJFF, new AwS667S0100000_18(this, 17));
        C786410Ut5.I7(new AbS699S0100000_18(this, 22, 42), view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1187600h0g c1187600h0g) {
        C1187600h0g c1187600h0g2 = c1187600h0g;
        C734160Sr0 c734160Sr0 = this.LLJJJJJIL;
        if (c734160Sr0 != null) {
            c734160Sr0.LJFF(c1187600h0g2.LLILLJJLI);
        }
        cp(c1187600h0g2.LLILLJJLI);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1187600h0g c1187600h0g) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1187600h0g c1187600h0g) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C1187600h0g c1187600h0g = (C1187600h0g) interfaceC1587906Jp;
        up(c1187600h0g);
        if (list != null && !list.isEmpty() && (ListProtector.get(list, 0) instanceof C1187590h0f)) {
            C734160Sr0 c734160Sr0 = this.LLJJJJJIL;
            if (c734160Sr0 != null) {
                c734160Sr0.LJFF(c1187600h0g.LLILLJJLI);
            }
            cp(c1187600h0g.LLILLJJLI);
        }
    }
}
