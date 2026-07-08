package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C07E5;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C444960Hcc;
import X.C666750QDh;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC655680Pni;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public class SearchCardLiveTagAssem extends ReusedUISlotAssem<SearchCardLiveTagAssem> implements InterfaceC712990Rxx<InterfaceC655680Pni> {
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public TuxTextView LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eu5;
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
    public void onViewCreated(View view) {
        View viewFindViewById;
        this.LLJJLIIIJLLLLLLLZ = (TuxIconView) view.findViewById(R.id.ln7);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.lna);
        this.LLJL = (TuxIconView) view.findViewById(R.id.ln_);
        if (C444960Hcc.LIZJ(getContext())) {
            view.findViewById(R.id.neu).setBackgroundResource(R.drawable.d2o);
            view.findViewById(R.id.njs).setBackgroundResource(R.drawable.d2q);
        }
        if (C666750QDh.LIZ() && (viewFindViewById = view.findViewById(R.id.njs)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: op, reason: merged with bridge method [inline-methods] */
    public void up(InterfaceC655680Pni interfaceC655680Pni) {
        TuxIconView tuxIconView = this.LLJL;
        int i = 0;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
        TuxIconView tuxIconView2 = this.LLJL;
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_person_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            tuxIconView2.setTuxIcon(c419910GdJ);
        }
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(interfaceC655680Pni.LJLLL());
        }
        if (Intrinsics.LJFF(interfaceC655680Pni.LLJJIJI().type, "ec_live_user_amount")) {
            TuxTextView tuxTextView2 = this.LLJLIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(interfaceC655680Pni.LLJJIJI().text);
            }
        } else if (Intrinsics.LJFF(interfaceC655680Pni.LLJJIJI().type, "live_likes_amount")) {
            TuxIconView tuxIconView3 = this.LLJL;
            if (tuxIconView3 != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_thumbs_up_fill;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                tuxIconView3.setTuxIcon(c419910GdJ2);
            }
            TuxTextView tuxTextView3 = this.LLJLIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(interfaceC655680Pni.LLJJIJI().text);
            }
        }
        TuxIconView tuxIconView4 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxIconView4 != null) {
            if (!interfaceC655680Pni.LLJLIL()) {
                i = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView4, i);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC655680Pni interfaceC655680Pni) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC655680Pni interfaceC655680Pni) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
