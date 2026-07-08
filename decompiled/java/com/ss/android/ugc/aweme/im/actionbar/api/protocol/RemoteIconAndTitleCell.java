package com.ss.android.ugc.aweme.im.actionbar.api.protocol;

import X.C0Z3V;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1397760mTe;
import X.C20094413jq;
import X.C20094813ju;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.C908840Zl4;
import X.C908850Zl5;
import X.EnumC1338240kve;
import X.EnumC1397840mTm;
import X.InterfaceC1334290kpH;
import X.InterfaceC1664506fT;
import X.InterfaceC908890Zl9;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public abstract class RemoteIconAndTitleCell<T extends InterfaceC908890Zl9> extends ActionBarCell<T> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ce8;
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        boolean z;
        InterfaceC1664506fT interfaceC1664506fTLIZJ;
        super.onBindItemView(t);
        C908850Zl5 title = t.getTitle();
        String strLLILLIZIL = t.LLILLIZIL();
        String str = title.LIZ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.vrc));
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.a1z));
            View viewFindViewById = this.itemView.findViewById(R.id.a1d);
            C426750GoL.LJIIIZ(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, false, 26);
            int i = C20094413jq.LJIIZILJ;
            C1397760mTe c1397760mTe = new C1397760mTe();
            c1397760mTe.LIZ = strLLILLIZIL;
            c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
            c1397760mTe.LIZJ = null;
            C20094813ju.LIZ(viewFindViewById, c1397760mTe.LIZ());
        } else {
            TextView textView = (TextView) this.itemView.findViewById(R.id.a1z);
            if (textView != null) {
                C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.vrc));
                C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.a1z));
                textView.setText(title.LIZ);
                title.LIZIZ.invoke((TuxTextView) textView);
                int i2 = C20094413jq.LJIIZILJ;
                C1397760mTe c1397760mTe2 = new C1397760mTe();
                c1397760mTe2.LIZIZ = EnumC1397840mTm.BUTTON;
                c1397760mTe2.LIZJ = null;
                C20094813ju.LIZ(textView, c1397760mTe2.LIZ());
            }
            C426750GoL.LJIIIZ(this.itemView.findViewById(R.id.a1d), 0, null, 0, null, false, 26);
        }
        C908840Zl4 c908840Zl4LJLI = t.LJLI();
        String str2 = c908840Zl4LJLI.LIZ;
        if (str2 != null && str2.length() != 0) {
            IDMResourceLoadService iDMResourceLoadService = (IDMResourceLoadService) PluggableExtentionKt.pluggableSpiForReal(IDMResourceLoadService.class);
            if (iDMResourceLoadService != null && (interfaceC1664506fTLIZJ = iDMResourceLoadService.LIZJ(C0Z3V.DIMENSION_UID, true)) != null) {
                interfaceC1664506fTLIZJ.LIZ("action_bar_image_preload", c908840Zl4LJLI.LIZ);
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(c908840Zl4LJLI.LIZ);
            Function1<C1331670kl3, C1331670kl3> function1 = c908840Zl4LJLI.LIZJ;
            if (function1 != null) {
                function1.invoke(c1331670kl3LJIIIZ);
            }
            c1331670kl3LJIIIZ.LIZLLL("RemoteIconAndTitleCellAssem");
            c1331670kl3LJIIIZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.a1d));
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.a1d);
            smartImageView.setActualImageScaleType(EnumC1338240kve.FIT_CENTER);
            Function1<SmartImageView, Unit> function12 = c908840Zl4LJLI.LIZIZ;
            if (function12 != null) {
                function12.invoke(smartImageView);
            }
            C786410Ut5.LJLLLLLL(0, smartImageView);
            return;
        }
        C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.vrc));
        C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.a1d));
    }
}
