package com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet;

import X.C019F;
import X.C0DJ1;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS141S0100000_6;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SevenSheetTopTitleAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public TuxIconView LLJJI;
    public TuxIconView LLJJIII;
    public TuxTextView LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final int LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SevenSheetTopTitleAssem.class, "sheetVM", "getSheetVM()Lcom/ss/android/ugc/aweme/commercialize/chatagent/otherpage/sheet/CommerceAgentSevenSheetVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SevenSheetTopTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommerceAgentSevenSheetVM.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 130), AFwS236S0000000_6.get$arr$(51), null, true);
        this.LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ajv;
    }

    public final CommerceAgentSevenSheetVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (CommerceAgentSevenSheetVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        Resources resources;
        super.onViewCreated(view);
        this.LLJJI = (TuxIconView) view.findViewById(R.id.efx);
        this.LLJJIII = (TuxIconView) view.findViewById(R.id.efy);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.efv);
        this.LLJJIJIIJIL = (FrameLayout) view.findViewById(R.id.uxj);
        view.findViewById(R.id.dat);
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 106));
        TuxTextView tuxTextView = this.LLJJIJI;
        if (tuxTextView != null) {
            Context context = tuxTextView.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                string = resources.getString(2131820782);
            } else {
                string = null;
            }
            tuxTextView.setText(string);
            tuxTextView.setTuxFont(103);
            tuxTextView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, tuxTextView.getPaint().measureText(tuxTextView.getText().toString()), 0.0f, new int[]{ColorProtector.parseColor("#A180FF"), ColorProtector.parseColor("#D167FB")}, (float[]) null, Shader.TileMode.CLAMP));
            tuxTextView.invalidate();
        }
        TuxIconView tuxIconView = this.LLJJI;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_arrow_up_right_and_arrow_down_left;
            c419910GdJ.LIZLLL = Integer.valueOf(ColorProtector.parseColor("#A180FF"));
            int i = this.LLJJJ;
            c419910GdJ.LIZIZ = i;
            c419910GdJ.LIZJ = i;
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        TuxIconView tuxIconView2 = this.LLJJI;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS141S0100000_6(this, 18));
        }
        TuxTextView tuxTextView2 = this.LLJJIJI;
        if (tuxTextView2 != null) {
            C0DJ1.LIZJ(tuxTextView2);
        }
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        if (frameLayout != null) {
            C0DJ1.LIZIZ(frameLayout);
        }
        TuxIconView tuxIconView3 = this.LLJJIII;
        if (tuxIconView3 != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_chevron_down;
            int i2 = this.LLJJJ;
            c419910GdJ2.LIZIZ = i2;
            c419910GdJ2.LIZJ = i2;
            tuxIconView3.setTuxIcon(c419910GdJ2);
        }
        TuxIconView tuxIconView4 = this.LLJJIII;
        if (tuxIconView4 != null) {
            HandlerHook.viewPost(tuxIconView4, new ARunnableS106S0100000_6(this, 172));
        }
        TuxIconView tuxIconView5 = this.LLJJIII;
        if (tuxIconView5 != null) {
            C786410Ut5.a9(tuxIconView5, new ACListenerS141S0100000_6(this, 107));
        }
        TuxIconView tuxIconView6 = this.LLJJI;
        if (tuxIconView6 != null) {
            C0DJ1.LIZIZ(tuxIconView6);
        }
        TuxIconView tuxIconView7 = this.LLJJIII;
        if (tuxIconView7 != null) {
            C0DJ1.LIZJ(tuxIconView7);
        }
        AssemViewModel.selectSubscribe$default(hp(), new C2217381BqS() { // from class: X.0Hjh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C449360Hji) obj).LLILZ;
            }
        }, null, null, null, new AwS585S0100000_6(AFwS192S0000000_6.get$arr$(38), 269), 14, null);
        AssemViewModel.selectSubscribe$default(hp(), new C2217381BqS() { // from class: X.0Hjg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C449360Hji) obj).LLILLL;
            }
        }, null, null, null, new AwS585S0100000_6(AFwS192S0000000_6.get$arr$(39), 268), 14, null);
    }
}
