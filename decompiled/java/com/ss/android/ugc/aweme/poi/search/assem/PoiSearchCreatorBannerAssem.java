package com.ss.android.ugc.aweme.poi.search.assem;

import X.AbstractC738140SxQ;
import X.C0HTI;
import X.C1189600h3u;
import X.C1197820hHA;
import X.C1197840hHC;
import X.C1205490hTX;
import X.C1220000hqw;
import X.C1252710ihh;
import X.C13LE;
import X.C1548820qPI;
import X.C1EMR;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C262100zr;
import X.C297500BlM;
import X.C297510BlN;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1197930hHL;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.creator.vm.PoiSearchCreatorVM;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiSearchCreatorBannerAssem extends UISlotAssem implements InterfaceC1141530foN {
    public TuxIconView LLJJI;
    public ViewGroup LLJJIII;
    public ConstraintLayout LLJJIJI;
    public ImageView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public boolean LLJJJ;
    public final C736950SvV LLJJJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e8q;
    }

    public PoiSearchCreatorBannerAssem() {
        C13LE.LIZ(PoiSearchVM.class);
        AFwS256S0000000_18.get$arr$(677);
        new AwS562S0100000_18((AbstractC738140SxQ) this, 2042);
        new C451610HnL(this, true, true);
        new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this);
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(525);
        this.LLJJJIL = new C736950SvV(C13LE.LIZ(PoiSearchCreatorVM.class), aFwS206S0000000_18, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(678), new AwS562S0100000_18((AbstractC738140SxQ) this, 2043), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("reportPoiSearchAllianceStatus", this);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        boolean z;
        try {
            if (Intrinsics.LJFF(c262100zr.LIZ, "reportPoiSearchAllianceStatus")) {
                InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                if (interfaceC1107590evd != null && interfaceC1107590evd.getInt("alliance_creator_session_status") == 1) {
                    z = true;
                } else {
                    z = false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onReceiveJsEvent reportPoiSearchAllianceStatus sessionStatus:");
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
                if (z) {
                    C297500BlM.LIZ = true;
                    ((InterfaceC1197930hHL) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1197930hHL.class), null)).ls();
                    ViewGroup viewGroup = this.LLJJIII;
                    if (viewGroup != null) {
                        C339190DRl.LIZIZ(viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_CREATOR_STRENGTH_FEAT;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "js_event_report_poi_search_alliance_status", null, e);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView;
        if (C297510BlN.LIZIZ() && !C297500BlM.LIZ()) {
            C1197840hHC.LIZ.getClass();
            if (!C1197820hHA.LIZIZ.LIZIZ()) {
                try {
                    C1548820qPI.LIZLLL("reportPoiSearchAllianceStatus", this);
                    this.LLJJI = (TuxIconView) view.findViewById(R.id.rcm);
                    this.LLJJIJI = (ConstraintLayout) view.findViewById(R.id.rcn);
                    this.LLJJIII = (ViewGroup) view.findViewById(R.id.rcr);
                    this.LLJJIJIIJIL = (ImageView) view.findViewById(R.id.rco);
                    this.LLJJIJIL = (TuxTextView) view.findViewById(R.id.fs4);
                    Context context = getContext();
                    if (context != null && (tuxTextView = this.LLJJIJIL) != null) {
                        tuxTextView.setText(C1189600h3u.LIZLLL(context));
                    }
                    ConstraintLayout constraintLayout = this.LLJJIJI;
                    if (constraintLayout != null) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                        constraintLayout.setBackground(c384050F3z.LIZ(constraintLayout.getContext()));
                        C786410Ut5.I7(new AbS699S0100000_18(this, 33), constraintLayout);
                    }
                    ImageView imageView = this.LLJJIJIIJIL;
                    if (imageView != null) {
                        C0HTI c0hti = new C0HTI();
                        c0hti.LIZ = R.drawable.yy;
                        imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
                    }
                    TuxIconView tuxIconView = this.LLJJI;
                    if (tuxIconView != null) {
                        C786410Ut5.I7(new AbS699S0100000_18(this, 32), tuxIconView);
                    }
                    C736680Sv4.LJIIIIZZ(this, (PoiSearchCreatorVM) this.LLJJJIL.getValue(), new C2217381BqS() { // from class: X.0hH8
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return Boolean.valueOf(((C915870ZwP) obj).LL);
                        }
                    }, null, new AwS632S0100000_18(this, 174), 6);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1205490hTX c1205490hTX = C1205490hTX.LIZ;
                    C1EMR c1emr = C1EMR.POI_CREATOR_STRENGTH_FEAT;
                    c1205490hTX.getClass();
                    C1205490hTX.LIZLLL(c1emr, "check_and_show_creator_banner", null, e);
                }
            }
        }
    }
}
