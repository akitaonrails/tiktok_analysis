package com.ss.android.ugc.aweme.poi.creation;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0PDH;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1189060h32;
import X.C1192400h8Q;
import X.C1197490hGd;
import X.C1199610hK3;
import X.C1199770hKJ;
import X.C1220000hqw;
import X.C123100dR;
import X.C13LE;
import X.C1548820qPI;
import X.C1559260qg8;
import X.C19EG;
import X.C262100zr;
import X.C339190DRl;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1141530foN;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS118S0100000_18;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.experiment.UgcPoiCreateConfig;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCreatedEntranceAssem extends UISlotAssem implements InterfaceC1141530foN, PoiCreateEntranceAbility {
    public TuxTextView LLJJI;
    public View LLJJIII;
    public final C736950SvV LLJJIJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJIIJIL;
    public View LLJJIJIL;
    public final C1559260qg8 LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e9i;
    }

    @Override // com.ss.android.ugc.aweme.poi.creation.PoiCreateEntranceAbility
    public final void Su2() {
        C339190DRl.LIZIZ(this.LLJJIJIL);
    }

    @Override // com.ss.android.ugc.aweme.poi.creation.PoiCreateEntranceAbility
    public final void WJ() {
        C339190DRl.LIZIZ(this.LLJJIJIL);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            HandlerHook.viewPostDelay(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS118S0100000_18(this, 32), 500L);
        }
    }

    public final PoiSearchVM hp() {
        return (PoiSearchVM) this.LLJJIJI.getValue();
    }

    public PoiCreatedEntranceAssem() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(304);
        this.LLJJIJI = new C736950SvV(C13LE.LIZ(PoiSearchVM.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(326), new AwS562S0100000_18((AbstractC738140SxQ) this, 976), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJJ = new C1559260qg8(new C723590SZx(this, C0PDH.class, "PoiCreateEntranceHierarchyData"), checkSupervisorPrepared());
        this.LLJJJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 975));
        this.LLJJJJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(303));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("poiSubmit", this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ip(int i) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        int iIntValue;
        LinearLayoutManager linearLayoutManager;
        View view = this.LLJJIJIL;
        if (view == null || (viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL) == null) {
            return;
        }
        String str = ((C1197490hGd) hp().getState()).LL;
        boolean zLIZ = C123100dR.LIZ(str);
        C1199770hKJ.LIZ.getClass();
        Integer num = ((UgcPoiCreateConfig) C1199770hKJ.LIZJ.getValue()).poiCreateShowIndex;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 15;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (zLIZ && numValueOf != null && numValueOf.intValue() > 0) {
            int iFindLastVisibleItemPosition = 0;
            if (view.getVisibility() != 0 && i >= 0) {
                RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                }
                if (iFindLastVisibleItemPosition >= numValueOf.intValue()) {
                    C339190DRl.LIZLLL(view);
                    C1192400h8Q c1192400h8Q = C1192400h8Q.LIZ;
                    PageFinder pageFinderVia = PageFinder.via(getContentView());
                    PoiMobParam poiMobParam = hp().LLJJJJJIL;
                    c1192400h8Q.getClass();
                    C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C1189060h32.LJIJI(linkedHashMap, "key_word", str);
                    C1199610hK3.LIZ(linkedHashMap, poiMobParam);
                    C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
                    c1185040gwY.getClass();
                    C1185040gwY.LIZIZ("create_poi_entrance_show", linkedHashMap, c1185050gwZ);
                    return;
                }
                if (!((Boolean) withState(hp(), new AwS597S0100000_18(numValueOf, 277))).booleanValue()) {
                    return;
                }
                C339190DRl.LIZLLL(view);
                C1192400h8Q c1192400h8Q2 = C1192400h8Q.LIZ;
                PageFinder pageFinderVia2 = PageFinder.via(getContentView());
                PoiMobParam poiMobParam2 = hp().LLJJJJJIL;
                c1192400h8Q2.getClass();
                C1185040gwY c1185040gwY2 = C1185040gwY.LIZ;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                C1189060h32.LJIJI(linkedHashMap2, "key_word", str);
                C1199610hK3.LIZ(linkedHashMap2, poiMobParam2);
                C1185050gwZ c1185050gwZ2 = new C1185050gwZ(pageFinderVia2);
                c1185040gwY2.getClass();
                C1185040gwY.LIZIZ("create_poi_entrance_show", linkedHashMap2, c1185050gwZ2);
                return;
            }
            return;
        }
        C339190DRl.LIZIZ(view);
    }

    public final void kp(String str) {
        TuxTextView tuxTextView = this.LLJJI;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        String string = tuxTextView.getContext().getResources().getString(2131829614, str);
        int iLJJJ = a0.LJJJ(string, str, 0, false, 6);
        SpannableString spannableString = new SpannableString(string);
        C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJ, string.length(), 17);
        TuxTextView tuxTextView3 = this.LLJJI;
        if (tuxTextView3 != null) {
            tuxTextView2 = tuxTextView3;
        }
        tuxTextView2.setText(spannableString);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        C19EG c19egLIZ;
        if (Intrinsics.LJFF(c262100zr.LIZ, "poiSubmit") && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            c19egLIZ.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.creation.PoiCreatedEntranceAssem for r13v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.creation.PoiCreatedEntranceAssem.onViewCreated(android.view.View):void");
    }
}
