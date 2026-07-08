package com.ss.android.ugc.aweme.tako.camera.record.pageui;

import X.C01D1;
import X.C054G;
import X.C0OGR;
import X.C1308910kAL;
import X.C1385040m98;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2296808zG;
import X.C687700QyG;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS144S0100000_9;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.tako.camera.record.TakoSurfaceScope;
import com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes10.dex */
public final class TakoPhotoPreviewAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public SmartImageView LLJJIJI;
    public View LLJJIJIIJIL;
    public final C054G LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoPhotoPreviewAssem.class, "recordFragmentVM", "getRecordFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoRecordFragmentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoPhotoPreviewAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoRecordFragmentViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1472), AFwS240S0000000_9.get$arr$(612), null, true);
        this.LLJJIII = new C1559260qg8(new C723580SZw(this, C0OGR.class, null), checkSupervisorPrepared());
        this.LLJJIJIL = C2296808zG.LIZIZ();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fqv;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoSurfaceScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoSurfaceScope.class);
        return arrayList;
    }

    public final C0OGR hp() {
        return (C0OGR) this.LLJJIII.getValue();
    }

    public final TakoRecordFragmentViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (TakoRecordFragmentViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C2296808zG.LIZJ(this.LLJJIJIL, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        super.onViewCreated(view);
        C786410Ut5.T4(getContentView(), 0.0f);
        this.LLJJIJI = (SmartImageView) view.findViewById(R.id.rro);
        TextView textView = (TextView) view.findViewById(R.id.bnl);
        int iIntValue2 = 0;
        if (textView != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0o, C1385040m98.LIZ(textView.getContext(), false));
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            textView.setTextColor(iIntValue);
            C786410Ut5.I7(new ACListenerS144S0100000_9(this, 99), textView);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.eoy);
        if (textView2 != null) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, C1385040m98.LIZ(textView2.getContext(), false));
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            }
            textView2.setTextColor(iIntValue2);
            C786410Ut5.I7(new ACListenerS144S0100000_9(this, 100), textView2);
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0OEM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0NPX) obj).LLILLJJLI;
            }
        }, null, new AwS616S0100000_2(this, 91), 6);
        View viewFindViewById = view.findViewById(R.id.e2n);
        this.LLJJIJIIJIL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS144S0100000_9(this, 101), viewFindViewById);
        }
    }
}
