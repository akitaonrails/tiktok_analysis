package com.ss.android.ugc.aweme.chatnoticenew.feature.streak;

import X.C01GW;
import X.C06IT;
import X.C06LV;
import X.C0I73;
import X.C0ZHB;
import X.C123100dR;
import X.C1275804yy;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1684506ih;
import X.C197039127h;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS106S0200000_2;
import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.StreakWheeDriveTrafficCardDataAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakWheeDriveTrafficCardReusedUISlot extends ReusedUISlotAssem<StreakWheeDriveTrafficCardReusedUISlot> implements InterfaceC712990Rxx<C1275804yy> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJL = C06IT.LIZ(this);
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 104));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 101));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 103));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 105));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 102));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StreakWheeDriveTrafficCardReusedUISlot.class, "noticeVM", "getNoticeVM()Lcom/ss/android/ugc/aweme/im/prompts/api/chatnotice/flow/base/viewmodel/ICommonChatNoticeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.csd;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C1295960jpS op() {
        return (C1295960jpS) this.LLJLL.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        if (op().isAnimating()) {
            op().cancelAnimation();
        }
        op().setProgress(0.0f);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        float f;
        view.setTag(R.id.k__, C0ZHB.FIRST_ITEM_FILL_TOP);
        C1295960jpS c1295960jpSOp = op();
        if (C426750GoL.LIZLLL(view.getContext())) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.Wb(c1295960jpSOp, f);
        Context context = getContext();
        if (context != null) {
            float f2 = C0I73.LIZ;
            View view2 = (View) this.LLJLIL.getValue();
            float[] fArr = new float[8];
            int iIntValue = 0;
            int i = 0;
            do {
                fArr[i] = f2;
                i++;
            } while (i < 8);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            Paint paint = shapeDrawable.getPaint();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            paint.setColor(iIntValue);
            view2.setBackground(shapeDrawable);
            View view3 = (View) this.LLJLILLLLZIIL.getValue();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zm);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(999.0f)));
            view3.setBackground(c384050F3z.LIZ(view.getContext()));
            ((C197039127h) this.LLJLLL.getValue()).LJJJJL(new AwS581S0100000_2(view, 78));
            ((C197039127h) this.LLJLLL.getValue()).setBackgroundRadius(6);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1275804yy c1275804yy) {
        String str;
        String str2;
        String str3;
        C1684506ih c1684506ih = new C1684506ih();
        c1684506ih.LIZ(((C457780HxI) this.LLJJLIIIJLLLLLLLZ.getValue()).LL);
        c1684506ih.LIZJ = c1275804yy.LL;
        c1684506ih.LIZLLL(55);
        c1684506ih.LIZJ(getContext());
        AwS403S0200000_2 awS403S0200000_2 = new AwS403S0200000_2(this, c1684506ih, 79);
        C06LV c06lvEs = null;
        StreakWheeDriveTrafficCardDataAbility streakWheeDriveTrafficCardDataAbility = (StreakWheeDriveTrafficCardDataAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), StreakWheeDriveTrafficCardDataAbility.class, null);
        if (streakWheeDriveTrafficCardDataAbility != null) {
            c06lvEs = streakWheeDriveTrafficCardDataAbility.es();
        }
        C786410Ut5.a9((TuxIconView) this.LLJLILLLLZIIL.getValue(), new ACListenerS137S0100000_2(awS403S0200000_2, 85));
        C786410Ut5.U8((C197039127h) this.LLJLLL.getValue(), new ACListenerS106S0200000_2(awS403S0200000_2, this, 17));
        TextView textView = (TextView) this.LLJLLIL.getValue();
        String str4 = "";
        if (c06lvEs == null || (str = c06lvEs.LIZLLL) == null) {
            str = "";
        }
        textView.setText(str);
        TextView textView2 = (TextView) this.LLJLLL.getValue();
        if (c06lvEs != null && (str3 = c06lvEs.LJ) != null) {
            str4 = str3;
        }
        textView2.setText(str4);
        if (c06lvEs != null && (str2 = c06lvEs.LIZJ) != null && C123100dR.LIZ(str2)) {
            op().setAnimationFromUrl(str2);
            op().setRepeatCount(0);
            op().setRepeatMode(1);
            op().playAnimation();
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1275804yy c1275804yy) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1275804yy c1275804yy) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
