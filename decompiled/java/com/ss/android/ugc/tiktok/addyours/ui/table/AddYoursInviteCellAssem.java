package com.ss.android.ugc.tiktok.addyours.ui.table;

import X.C0HZQ;
import X.C0PEM;
import X.C1625206Xy;
import X.C23250099c;
import X.C317650Ccl;
import X.C427660Gpo;
import X.C438710HIf;
import X.C730000SkI;
import X.C786410Ut5;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class AddYoursInviteCellAssem extends InvitableCellAssem<AddYoursInviteCellAssem> {
    public C427660Gpo LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public C0HZQ LLJZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.m9;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.table.InvitableCellAssem
    public final void tp() {
        C0HZQ c0hzq = this.LLJZ;
        if (c0hzq == null) {
            c0hzq = null;
        }
        c0hzq.toggle();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.table.InvitableCellAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLILLLLZIIL = (C427660Gpo) view.findViewById(R.id.bh2);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.user_name);
        this.LLJZ = (C0HZQ) view.findViewById(R.id.dq1);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.m4g);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.m4k);
        C0HZQ c0hzq = this.LLJZ;
        C427660Gpo c427660Gpo = null;
        if (c0hzq == null) {
            c0hzq = null;
        }
        c0hzq.setInterceptToggleListener(new AwS548S0100000_4(this, 410));
        C427660Gpo c427660Gpo2 = this.LLJLILLLLZIIL;
        if (c427660Gpo2 != null) {
            c427660Gpo = c427660Gpo2;
        }
        c427660Gpo.setForeground(new StateListDrawable());
        super.onViewCreated(view);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.table.InvitableCellAssem
    /* JADX INFO: renamed from: op */
    public final void up(C317650Ccl c317650Ccl) {
        Object avatarUrl;
        int i;
        super.up(c317650Ccl);
        C730000SkI.LIZIZ.LIZLLL(249372162, true);
        C427660Gpo c427660Gpo = this.LLJLILLLLZIIL;
        TuxTextView tuxTextView = null;
        if (c427660Gpo == null) {
            c427660Gpo = null;
        }
        c427660Gpo.setImageURI((Uri) null);
        UrlModel avatarModel = c317650Ccl.LL.getAvatarModel();
        if (avatarModel != null) {
            avatarUrl = C438710HIf.LIZ(avatarModel);
        } else {
            avatarUrl = c317650Ccl.LL.getAvatarUrl();
        }
        C427660Gpo c427660Gpo2 = this.LLJLILLLLZIIL;
        if (c427660Gpo2 == null) {
            c427660Gpo2 = null;
        }
        if (avatarUrl != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZ, null, new C1625206Xy(c427660Gpo2, avatarUrl, null), 2);
        }
        TuxTextView tuxTextView2 = this.LLJLL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        tuxTextView2.setText(c317650Ccl.LL.getUserName());
        TuxTextView tuxTextView3 = this.LLJLLL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        int i2 = 0;
        if (c317650Ccl.LL.isMuf()) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, tuxTextView3);
        TuxTextView tuxTextView4 = this.LLJLLIL;
        if (tuxTextView4 != null) {
            tuxTextView = tuxTextView4;
        }
        if (!c317650Ccl.LL.getInvited()) {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, tuxTextView);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.table.InvitableCellAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((C317650Ccl) obj);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.table.InvitableCellAssem
    public final void sp(boolean z) {
        C0HZQ c0hzq = this.LLJZ;
        if (c0hzq == null) {
            c0hzq = null;
        }
        c0hzq.setChecked(z);
    }
}
