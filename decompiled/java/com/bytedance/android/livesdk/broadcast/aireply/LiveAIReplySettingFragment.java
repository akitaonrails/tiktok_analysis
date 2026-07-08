package com.bytedance.android.livesdk.broadcast.aireply;

import X.C01GW;
import X.C0HB5;
import X.C0HB6;
import X.C0HB7;
import X.C0KVL;
import X.C1119170fEJ;
import X.C1143680frq;
import X.C1143780fs0;
import X.C20736316Cj;
import X.C20743716Ff;
import X.C23250099c;
import X.C292401Bi;
import X.C445870He5;
import X.C473410IhP;
import X.C497740JfY;
import X.C500260Jjc;
import X.C521710Kd7;
import X.C758170Tod;
import X.C786410Ut5;
import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.aireply.IAIReplyAnchorManagerService;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.model.CommentReply;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS551S0100000_7;
import wh6.AbS689S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveAIReplySettingFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTHELIOSY4Zy46OiA8JTZ9BCw6LA4aGiA8JTYALTE4ICE0DjctLiI2JjE=";
    public final String LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final Handler LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public int LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public final ARunnableS107S0100000_7 LLLILZ;
    public final C521710Kd7 LLLILZJ;

    public LiveAIReplySettingFragment() {
        this(null);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131856113));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    public final View wS() {
        return (View) this.LLLI.getValue();
    }

    public final C20743716Ff yS() {
        return (C20743716Ff) this.LLLFF.getValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLLIIII.removeCallbacks(this.LLLILZ);
    }

    public LiveAIReplySettingFragment(String str) {
        this.LLJLLL = str;
        this.LLJZ = C292401Bi.LIZ(new AwS551S0100000_7(this, 30));
        this.LLJZIJLIL = C292401Bi.LIZ(new AwS551S0100000_7(this, 27));
        this.LLL = C292401Bi.LIZ(new AwS551S0100000_7(this, 28));
        this.LLLF = C292401Bi.LIZ(new AwS551S0100000_7(this, 24));
        this.LLLFF = C292401Bi.LIZ(new AwS551S0100000_7(this, 31));
        this.LLLFFI = C292401Bi.LIZ(new AwS551S0100000_7(this, 26));
        this.LLLFZ = C292401Bi.LIZ(new AwS551S0100000_7(this, 25));
        this.LLLI = C292401Bi.LIZ(new AwS551S0100000_7(this, 23));
        this.LLLII = C292401Bi.LIZ(new AwS551S0100000_7(this, 29));
        this.LLLIIII = C473410IhP.LIZ();
        this.LLLILZ = new ARunnableS107S0100000_7(this, 13);
        this.LLLILZJ = new C521710Kd7(this, 0);
    }

    public static List uS(List list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        long j = 0;
        while (it2.hasNext()) {
            CommentReply commentReply = (CommentReply) it2.next();
            long j2 = 60;
            long j3 = (((commentReply.replyTimeMs / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / j2) / j2) / ((long) 24);
            if (j3 != j) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(new C0KVL(commentReply, z));
            j = j3;
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zS(X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.aireply.LiveAIReplySettingFragment.zS(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C20743716Ff c20743716FfYS = yS();
        if (c20743716FfYS != null) {
            C786410Ut5.A7(c20743716FfYS, this.LLLILZJ);
        }
        IAIReplyAnchorManagerService.Companion.getClass();
        if (C445870He5.LIZ().getSwitchStateFlow().getValue().booleanValue()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HB6(this, null), 3);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HB5(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HB7(this, null), 3);
        if (this.LLJL != null) {
            C500260Jjc.LJIILIIL(view.findViewById(R.id.i69));
        }
        View viewFindViewById = view.findViewById(R.id.bmy);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbS689S0100000_7(this, 3), viewFindViewById);
        }
        C1143680frq.LJI(view.findViewById(R.id.tyz), C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_1", "ttlive_ai_reply_example_demo_2x.png"), null, true);
        C1143680frq.LJI((View) this.LLLF.getValue(), C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_1", "ttlive_ai_reply_history_empty_x2.png"), null, true);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.fxw, viewGroup, false);
    }
}
