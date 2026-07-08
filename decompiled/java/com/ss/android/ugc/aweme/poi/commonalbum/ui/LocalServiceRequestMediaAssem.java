package com.ss.android.ugc.aweme.poi.commonalbum.ui;

import X.C019F;
import X.C01GW;
import X.C0IE5;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C436090H8d;
import X.C442060HVc;
import X.C442090HVf;
import X.C442110HVh;
import X.C452501pT;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.commonalbum.model.AlbumTrackParams;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import com.zhiliaoapp.musically.R;
import irm.AkS78S0100000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class LocalServiceRequestMediaAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 517));
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LocalServiceRequestMediaAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/commonalbum/viewmodel/LocalServiceAlbumVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LocalServiceRequestMediaAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LocalServiceAlbumVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 516), AFwS236S0000000_6.get$arr$(251), null, true);
    }

    public final C436090H8d Go() {
        return (C436090H8d) this.LLIZLLLIL.getValue();
    }

    public final LocalServiceAlbumVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (LocalServiceAlbumVM) assemVMLazy.getValue();
    }

    public final void Jo() {
        AlbumTrackParams albumTrackParams;
        C337180DJs.LIZJ(LJJIJL());
        C337180DJs.LIZJ(Go().LLILZIL);
        int iZQ2 = Ho().zQ2();
        boolean zYQ2 = Ho().yQ2();
        String strXQ2 = Ho().xQ2();
        PageFinder pageFinderVia = PageFinder.via(LJJIJL());
        C442110HVh c442110HVh = Ho().LLJI;
        C442090HVf.LIZIZ(iZQ2, zYQ2, strXQ2, pageFinderVia, (c442110HVh == null || (albumTrackParams = c442110HVh.LJFF) == null) ? null : albumTrackParams.generalMobParams);
    }

    public final void Lo() {
        String string;
        TuxTextView tuxTextView = Go().LLILZLL;
        Context context = getContext();
        if (context == null || (string = context.getString(2131846610)) == null) {
            string = "";
        }
        tuxTextView.setText(string);
    }

    public final void MO2() {
        C337180DJs.LIZ(LJJIJL());
        C337180DJs.LIZ(Go().LLILZIL);
    }

    public final void No() {
        TuxIconView tuxIconView = Go().LLILZ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_image_alt_1;
        Context context = tuxIconView.getContext();
        c419910GdJ.LIZLLL = context != null ? C1308910kAL.LIZJ(R.attr.a1h, context) : null;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        super.onViewCreated(view);
        if (C442060HVc.LIZ) {
            MO2();
        } else {
            ConstraintLayout constraintLayout = Go().LLILZIL;
            Context context = constraintLayout.getContext();
            if (context != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
                constraintLayout.setBackground(c384050F3z.LIZ(context));
            }
            C197039127h c197039127h = Go().LLILLL;
            Context context2 = c197039127h.getContext();
            if (context2 == null || (string = context2.getString(2131846612)) == null) {
                string = "";
            }
            c197039127h.setText(string);
        }
        selectSubscribe(Ho(), new C2217381BqS() { // from class: X.0HVS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0HVU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0HVa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), null, new C0IE5(this, 8));
        C786410Ut5.I7(new AkS78S0100000_6(this, 27), Go().LLILLL);
        C786410Ut5.I7(new AkS78S0100000_6(this, 29), Go().LLILLJJLI);
    }
}
