package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo;

import X.C01GW;
import X.C07P0;
import X.C0DYK;
import X.C1012300cRw;
import X.C10IT;
import X.C12P4;
import X.C13LE;
import X.C426750GoL;
import X.C427690Gpr;
import X.C658410Ps7;
import X.C666750QDh;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C820940WIi;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.ARunnableS110S0100000_10;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class UserPhotoStaticAssem extends ReusedUIContentAssem<UserPhotoStaticAssem> implements InterfaceC712990Rxx<C658410Ps7> {
    public final C01GW LLJJJJ = C737910Sx3.LIZJ(this, C13LE.LIZ(UserPhotoViewModel.class), AFwS241S0000000_10.get$arr$(265));
    public TextView LLJJJJJIL;
    public C12P4 LLJJJJLIIL;
    public C12P4 LLJJL;
    public ConstraintLayout LLJJLIIIJLLLLLLLZ;
    public C1012300cRw LLJL;
    public View LLJLIL;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TextView textView = (TextView) view.findViewById(R.id.user_photo_like_count);
        C786410Ut5.LLIL(textView, C666750QDh.LIZ);
        this.LLJJJJJIL = textView;
        this.LLJJJJLIIL = (C12P4) view.findViewById(R.id.user_photo_holder_tux_mask);
        this.LLJJL = (C12P4) view.findViewById(R.id.user_photo_holder_tux_mask_top);
        this.LLJJLIIIJLLLLLLLZ = (ConstraintLayout) view.findViewById(R.id.user_photo_container_layout);
        this.LLJLIL = view.findViewById(R.id.qcp);
        if (C07P0.LIZIZ()) {
            this.LLJL = (C1012300cRw) view.findViewById(R.id.vqk);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C658410Ps7 c658410Ps7) {
        long diggCount;
        C658410Ps7 c658410Ps72 = c658410Ps7;
        Aweme aweme = c658410Ps72.LL;
        TextView textView = this.LLJJJJJIL;
        if (textView == null) {
            textView = null;
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            diggCount = statistics.getDiggCount();
        } else {
            diggCount = 0;
        }
        textView.setText(C820940WIi.LIZ(diggCount));
        TuxIconDrawable tuxIconDrawableLIZIZ = C0DYK.LIZIZ(textView.getContext(), aweme);
        if (C426750GoL.LIZLLL(textView.getContext())) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZIZ, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZIZ, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        TextView textView2 = this.LLJJJJJIL;
        if (textView2 == null) {
            textView2 = null;
        }
        C12P4 c12p4 = this.LLJJJJLIIL;
        if (c12p4 == null) {
            c12p4 = null;
        }
        int i = 8;
        C786410Ut5.LLLLLLZ(c12p4, 8);
        TextView textView3 = this.LLJJJJJIL;
        if (textView3 == null) {
            textView3 = null;
        }
        if (textView3.getVisibility() == 0) {
            TextView textView4 = this.LLJJJJJIL;
            if (textView4 == null) {
                textView4 = null;
            }
            CharSequence text = textView4.getText();
            if (text != null && text.length() != 0) {
                textView2.setPadding(textView2.getPaddingLeft(), 0, textView2.getPaddingRight(), textView2.getPaddingBottom());
                HandlerHook.viewPost(textView2, new ARunnableS110S0100000_10(this, 164));
            }
        }
        ConstraintLayout constraintLayout = this.LLJJLIIIJLLLLLLLZ;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        C427690Gpr.LJFF(constraintLayout, 0.0f);
        C1012300cRw c1012300cRw = this.LLJL;
        if (c1012300cRw != null) {
            C427690Gpr.LJI(c1012300cRw, null);
        }
        Aweme aweme2 = c658410Ps72.LL;
        View view = this.LLJLIL;
        if (view != null) {
            C10IT.LIZ.getClass();
            if (C10IT.LJIIL(aweme2)) {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C658410Ps7 c658410Ps7) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C658410Ps7 c658410Ps7) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
